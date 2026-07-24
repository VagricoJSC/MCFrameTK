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
 * "発注明細 // PO details"DBコンテナRowクラスです。<p>
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
 *  	<td>po_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注明細ＮＯ</td>
 *  	<td>PO details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注ＮＯ</td>
 *  	<td>PO No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注改訂番号</td>
 *  	<td>PO rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注予定ＮＯ</td>
 *  	<td>PO schedule No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>5,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>表示順</td>
 *  	<td>Display order</td>
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
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ver_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>版ＮＯ</td>
 *  	<td>Version No.</td>
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
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
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
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入理由ＣＤ</td>
 *  	<td>Purchase reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買識別区分</td>
 *  	<td>Purchase identification type</td>
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
 *  	<td>sppl_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先品目ＣＤ</td>
 *  	<td>Supplier item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先品名</td>
 *  	<td>Supplier item name</td>
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
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業者ロットＮＯ</td>
 *  	<td>Vendor lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入場所ＣＤ</td>
 *  	<td>Delivery location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>棚・ラインＣＤ</td>
 *  	<td>Rack/Line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＣＤ</td>
 *  	<td>Delivery destination cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous delivery destination flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先名</td>
 *  	<td>Delivery destination name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先部署</td>
 *  	<td>Delivery destination dept.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先担当者</td>
 *  	<td>Delivery destination PIC</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先郵便番号</td>
 *  	<td>Zip code (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所１</td>
 *  	<td>Address 1 (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所２</td>
 *  	<td>Address 2 (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所３</td>
 *  	<td>Address 3 (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所４</td>
 *  	<td>Address 4 (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＴＥＬ</td>
 *  	<td>TEL (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＦＡＸ</td>
 *  	<td>FAX (Delivery destination)</td>
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
 *  	<td>tdlv_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先部署</td>
 *  	<td>Receiving point dept.</td>
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
 *  	<td>tdlv_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先郵便番号</td>
 *  	<td>Receiving point zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所１</td>
 *  	<td>Receiving point address 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所２</td>
 *  	<td>Receiving point address 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所３</td>
 *  	<td>Receiving point address 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所４</td>
 *  	<td>Receiving point address 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先ＴＥＬ</td>
 *  	<td>Receiving point TEL</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先ＦＡＸ</td>
 *  	<td>Receiving point FAX</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入希望日時</td>
 *  	<td>Desired delivery date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購入ＬＴ</td>
 *  	<td>Purchase LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>依頼元納入希望日時</td>
 *  	<td>Request source desired delivery date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_avl_rqst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>依頼元使用可能希望日</td>
 *  	<td>Request source desired available date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入予定日</td>
 *  	<td>Scheduled purchase date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入計上区分</td>
 *  	<td>Purchase recording type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sync_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>同時計上ＦＬＧ</td>
 *  	<td>Simultaneous recording flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_upri_req_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買単価取得区分</td>
 *  	<td>Purchase unit price acquisition type</td>
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
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
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
 *  	<td>trd_cur_proc_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨加工単価</td>
 *  	<td>Subcontracting unit price (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_onr_prov_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨有償支給単価</td>
 *  	<td>Chargeable supply unit price (Transaction currency)</td>
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
 *  	<td>trd_cur_proc_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨加工金額</td>
 *  	<td>Subcontracting amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_onr_prov_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨有償支給金額</td>
 *  	<td>Chargeable supply amount (Transaction currency)</td>
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
 *  	<td>tax_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>税指定ＦＬＧ</td>
 *  	<td>Tax specified flg.</td>
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
 *  	<td>drct_dlv_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>直納区分</td>
 *  	<td>Direct-delivery type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所ＣＤ</td>
 *  	<td>Mfg. location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bom_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成パタン</td>
 *  	<td>BOM pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bndl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>まとめＦＬＧ</td>
 *  	<td>Aggregation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_slo_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>依頼元受注ＦＬＧ</td>
 *  	<td>Request source orders flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>outsrc_itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外注品目オーダＮＯ</td>
 *  	<td>Subcontracting item order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>outsrc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外注ＦＬＧ</td>
 *  	<td>Subcontracting flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>uplnd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計画外ＦＬＧ</td>
 *  	<td>Unplanned flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_chg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計画変更ＦＬＧ</td>
 *  	<td>Plan changed flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_conf_rcpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請書受領ＦＬＧ</td>
 *  	<td>Confirmation received flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_conf_rcpt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請書受領日</td>
 *  	<td>Confirmation received date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pri_print_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>価格印字ＦＬＧ</td>
 *  	<td>Print price flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_slip_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書対象外ＦＬＧ</td>
 *  	<td>Not for elivery note flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_crryovr_times</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払繰越回数</td>
 *  	<td>Payment carry-over count</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注ＮＯ</td>
 *  	<td>Sales order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注明細ＮＯ</td>
 *  	<td>Sales order details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払進捗管理ＮＯ</td>
 *  	<td>GR/GI progress management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担品目ＣＤ</td>
 *  	<td>Charged item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担枝番１</td>
 *  	<td>Charged branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担枝番２</td>
 *  	<td>Charged branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担枝番３</td>
 *  	<td>Charged branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担手配ＮＯ１</td>
 *  	<td>Charged SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担手配ＮＯ２</td>
 *  	<td>Charged SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担手配ＮＯ３</td>
 *  	<td>Charged SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担手配ＮＯ４</td>
 *  	<td>Charged SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担場所ＣＤ</td>
 *  	<td>Charged location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担ロットＮＯ</td>
 *  	<td>Charged lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担サブロットＮＯ</td>
 *  	<td>Charged sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担部門ＣＤ</td>
 *  	<td>Charged dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担ＷＧ ＣＤ</td>
 *  	<td>Charged WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担品群ＣＤ</td>
 *  	<td>Charged item category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担工程ＣＤ</td>
 *  	<td>Charged operation cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担受注ＮＯ</td>
 *  	<td>Charged sales No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担インボイスＮＯ</td>
 *  	<td>Charged invoice No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担発注ＮＯ</td>
 *  	<td>Charged PO No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担取引先ＣＤ</td>
 *  	<td>Charged BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_po_d_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部発注明細ＮＯ</td>
 *  	<td>External PO details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部明細備考</td>
 *  	<td>Internal details remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引明細備考</td>
 *  	<td>Transaction details remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_print_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>注文書明細備考</td>
 *  	<td>PO sheet details remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_slip_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書明細備考</td>
 *  	<td>Delivery note details remarks</td>
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
 *  	<td>rqst_can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>紐切れＦＬＧ</td>
 *  	<td>Unpegged flg.</td>
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
 *  	<td>edi_sub_d_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＣＨＡＲ項目１</td>
 *  	<td>EDI details spare CHAR column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_sub_d_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＣＨＡＲ項目２</td>
 *  	<td>EDI details spare CHAR column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_sub_d_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＣＨＡＲ項目３</td>
 *  	<td>EDI details spare CHAR column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_sub_d_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＣＨＡＲ項目４</td>
 *  	<td>EDI details spare CHAR column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_sub_d_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＣＨＡＲ項目５</td>
 *  	<td>EDI details spare CHAR column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_sub_d_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＮＵＭ項目１</td>
 *  	<td>EDI details spare NUM column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_sub_d_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＤＡＴＥ項目１</td>
 *  	<td>EDI details spare DATE column 1</td>
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
public class MST_PO_D_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PO_D";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	private static final MCPermColumnInfo _po_d_no = createColumnInfo("po_d_no");
	public final MCStringPermColumn po_d_no = createStringColumn(_po_d_no);
	
	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public static final String $po_no = "po_no";
	private static final MCPermColumnInfo _po_no = createColumnInfo("po_no");
	public final MCStringPermColumn po_no = createStringColumn(_po_no);
	
	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public static final String $po_rev = "po_rev";
	private static final MCPermColumnInfo _po_rev = createColumnInfo("po_rev");
	public final MCNumberPermColumn po_rev = createNumberColumn(_po_rev);
	
	/**
	 * 発注予定ＮＯ. PO schedule No..<p>
	 *
	 */
	public static final String $po_schd_no = "po_schd_no";
	private static final MCPermColumnInfo _po_schd_no = createColumnInfo("po_schd_no");
	public final MCStringPermColumn po_schd_no = createStringColumn(_po_schd_no);
	
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
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
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
	 * 仕入理由ＣＤ. Purchase reason cd..<p>
	 *
	 */
	public static final String $purc_rsn_cd = "purc_rsn_cd";
	private static final MCPermColumnInfo _purc_rsn_cd = createColumnInfo("purc_rsn_cd");
	public final MCStringPermColumn purc_rsn_cd = createStringColumn(_purc_rsn_cd);
	
	/**
	 * 購買識別区分. Purchase identification type.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	private static final MCPermColumnInfo _purc_id_typ = createColumnInfo("purc_id_typ");
	public final MCStringPermColumn purc_id_typ = createStringColumn(_purc_id_typ);
	
	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	private static final MCPermColumnInfo _sundry_itm_flg = createColumnInfo("sundry_itm_flg");
	public final MCBooleanPermColumn sundry_itm_flg = createBooleanColumn(_sundry_itm_flg);
	
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
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	private static final MCPermColumnInfo _ap_dpt_cd = createColumnInfo("ap_dpt_cd");
	public final MCStringPermColumn ap_dpt_cd = createStringColumn(_ap_dpt_cd);
	
	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	private static final MCPermColumnInfo _maker_cd = createColumnInfo("maker_cd");
	public final MCStringPermColumn maker_cd = createStringColumn(_maker_cd);
	
	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	private static final MCPermColumnInfo _bp_lot_no = createColumnInfo("bp_lot_no");
	public final MCStringPermColumn bp_lot_no = createStringColumn(_bp_lot_no);
	
	/**
	 * 納入場所ＣＤ. Delivery location cd..<p>
	 *
	 */
	public static final String $in_to_loc_cd = "in_to_loc_cd";
	private static final MCPermColumnInfo _in_to_loc_cd = createColumnInfo("in_to_loc_cd");
	public final MCStringPermColumn in_to_loc_cd = createStringColumn(_in_to_loc_cd);
	
	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
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
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	private static final MCPermColumnInfo _dlv_rqst_tm = createColumnInfo("dlv_rqst_tm");
	public final MCDatePermColumn dlv_rqst_tm = createDateColumn(_dlv_rqst_tm);
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
	private static final MCPermColumnInfo _purc_lt = createColumnInfo("purc_lt");
	public final MCNumberPermColumn purc_lt = createNumberColumn(_purc_lt);
	
	/**
	 * 依頼元納入希望日時. Request source desired delivery date and time.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_tm = "rqst_dlv_rqst_tm";
	private static final MCPermColumnInfo _rqst_dlv_rqst_tm = createColumnInfo("rqst_dlv_rqst_tm");
	public final MCDatePermColumn rqst_dlv_rqst_tm = createDateColumn(_rqst_dlv_rqst_tm);
	
	/**
	 * 依頼元使用可能希望日. Request source desired available date.<p>
	 *
	 */
	public static final String $rqst_avl_rqst_dt = "rqst_avl_rqst_dt";
	private static final MCPermColumnInfo _rqst_avl_rqst_dt = createColumnInfo("rqst_avl_rqst_dt");
	public final MCDatePermColumn rqst_avl_rqst_dt = createDateColumn(_rqst_avl_rqst_dt);
	
	/**
	 * 仕入予定日. Scheduled purchase date.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	private static final MCPermColumnInfo _purc_schd_dt = createColumnInfo("purc_schd_dt");
	public final MCDatePermColumn purc_schd_dt = createDateColumn(_purc_schd_dt);
	
	/**
	 * 仕入計上区分. Purchase recording type.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	private static final MCPermColumnInfo _purc_basis_typ = createColumnInfo("purc_basis_typ");
	public final MCStringPermColumn purc_basis_typ = createStringColumn(_purc_basis_typ);
	
	/**
	 * 同時計上ＦＬＧ. Simultaneous recording flg..<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	private static final MCPermColumnInfo _sync_flg = createColumnInfo("sync_flg");
	public final MCBooleanPermColumn sync_flg = createBooleanColumn(_sync_flg);
	
	/**
	 * 購買単価取得区分. Purchase unit price acquisition type.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	private static final MCPermColumnInfo _purc_upri_req_typ = createColumnInfo("purc_upri_req_typ");
	public final MCStringPermColumn purc_upri_req_typ = createStringColumn(_purc_upri_req_typ);
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	private static final MCPermColumnInfo _trd_unit_qty = createColumnInfo("trd_unit_qty");
	public final MCNumberPermColumn trd_unit_qty = createNumberColumn(_trd_unit_qty);
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	private static final MCPermColumnInfo _trd_unit_cd = createColumnInfo("trd_unit_cd");
	public final MCStringPermColumn trd_unit_cd = createStringColumn(_trd_unit_cd);
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	private static final MCPermColumnInfo _base_unit_qty = createColumnInfo("base_unit_qty");
	public final MCNumberPermColumn base_unit_qty = createNumberColumn(_base_unit_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	private static final MCPermColumnInfo _interim_flg = createColumnInfo("interim_flg");
	public final MCBooleanPermColumn interim_flg = createBooleanColumn(_interim_flg);
	
	/**
	 * 単価再取得対象外ＦＬＧ. Not to reacquire unit price flg..<p>
	 *
	 */
	public static final String $upri_not_tgt_flg = "upri_not_tgt_flg";
	private static final MCPermColumnInfo _upri_not_tgt_flg = createColumnInfo("upri_not_tgt_flg");
	public final MCBooleanPermColumn upri_not_tgt_flg = createBooleanColumn(_upri_not_tgt_flg);
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	private static final MCPermColumnInfo _trd_cur_upri = createColumnInfo("trd_cur_upri");
	public final MCNumberPermColumn trd_cur_upri = createNumberColumn(_trd_cur_upri);
	
	/**
	 * 取引通貨加工単価. Subcontracting unit price (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_proc_upri = "trd_cur_proc_upri";
	private static final MCPermColumnInfo _trd_cur_proc_upri = createColumnInfo("trd_cur_proc_upri");
	public final MCNumberPermColumn trd_cur_proc_upri = createNumberColumn(_trd_cur_proc_upri);
	
	/**
	 * 取引通貨有償支給単価. Chargeable supply unit price (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_upri = "trd_cur_onr_prov_upri";
	private static final MCPermColumnInfo _trd_cur_onr_prov_upri = createColumnInfo("trd_cur_onr_prov_upri");
	public final MCNumberPermColumn trd_cur_onr_prov_upri = createNumberColumn(_trd_cur_onr_prov_upri);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_proc_amt = "trd_cur_proc_amt";
	private static final MCPermColumnInfo _trd_cur_proc_amt = createColumnInfo("trd_cur_proc_amt");
	public final MCNumberPermColumn trd_cur_proc_amt = createNumberColumn(_trd_cur_proc_amt);
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_amt = "trd_cur_onr_prov_amt";
	private static final MCPermColumnInfo _trd_cur_onr_prov_amt = createColumnInfo("trd_cur_onr_prov_amt");
	public final MCNumberPermColumn trd_cur_onr_prov_amt = createNumberColumn(_trd_cur_onr_prov_amt);
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	private static final MCPermColumnInfo _trd_cur_tax_amt = createColumnInfo("trd_cur_tax_amt");
	public final MCNumberPermColumn trd_cur_tax_amt = createNumberColumn(_trd_cur_tax_amt);
	
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
	 * 直納区分. Direct-delivery type.<p>
	 *
	 */
	public static final String $drct_dlv_typ = "drct_dlv_typ";
	private static final MCPermColumnInfo _drct_dlv_typ = createColumnInfo("drct_dlv_typ");
	public final MCStringPermColumn drct_dlv_typ = createStringColumn(_drct_dlv_typ);
	
	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	private static final MCPermColumnInfo _mfg_loc_cd = createColumnInfo("mfg_loc_cd");
	public final MCStringPermColumn mfg_loc_cd = createStringColumn(_mfg_loc_cd);
	
	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	private static final MCPermColumnInfo _bom_ptn = createColumnInfo("bom_ptn");
	public final MCStringPermColumn bom_ptn = createStringColumn(_bom_ptn);
	
	/**
	 * まとめＦＬＧ. Aggregation flg..<p>
	 *
	 */
	public static final String $bndl_flg = "bndl_flg";
	private static final MCPermColumnInfo _bndl_flg = createColumnInfo("bndl_flg");
	public final MCBooleanPermColumn bndl_flg = createBooleanColumn(_bndl_flg);
	
	/**
	 * 依頼元受注ＦＬＧ. Request source orders flg..<p>
	 *
	 */
	public static final String $rqst_slo_flg = "rqst_slo_flg";
	private static final MCPermColumnInfo _rqst_slo_flg = createColumnInfo("rqst_slo_flg");
	public final MCBooleanPermColumn rqst_slo_flg = createBooleanColumn(_rqst_slo_flg);
	
	/**
	 * 外注品目オーダＮＯ. Subcontracting item order No..<p>
	 *
	 */
	public static final String $outsrc_itm_ord_no = "outsrc_itm_ord_no";
	private static final MCPermColumnInfo _outsrc_itm_ord_no = createColumnInfo("outsrc_itm_ord_no");
	public final MCStringPermColumn outsrc_itm_ord_no = createStringColumn(_outsrc_itm_ord_no);
	
	/**
	 * 外注ＦＬＧ. Subcontracting flg..<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	private static final MCPermColumnInfo _outsrc_flg = createColumnInfo("outsrc_flg");
	public final MCBooleanPermColumn outsrc_flg = createBooleanColumn(_outsrc_flg);
	
	/**
	 * 計画外ＦＬＧ. Unplanned flg..<p>
	 *
	 */
	public static final String $uplnd_flg = "uplnd_flg";
	private static final MCPermColumnInfo _uplnd_flg = createColumnInfo("uplnd_flg");
	public final MCBooleanPermColumn uplnd_flg = createBooleanColumn(_uplnd_flg);
	
	/**
	 * 計画変更ＦＬＧ. Plan changed flg..<p>
	 *
	 */
	public static final String $schd_chg_flg = "schd_chg_flg";
	private static final MCPermColumnInfo _schd_chg_flg = createColumnInfo("schd_chg_flg");
	public final MCBooleanPermColumn schd_chg_flg = createBooleanColumn(_schd_chg_flg);
	
	/**
	 * 請書受領ＦＬＧ. Confirmation received flg..<p>
	 *
	 */
	public static final String $po_conf_rcpt_flg = "po_conf_rcpt_flg";
	private static final MCPermColumnInfo _po_conf_rcpt_flg = createColumnInfo("po_conf_rcpt_flg");
	public final MCBooleanPermColumn po_conf_rcpt_flg = createBooleanColumn(_po_conf_rcpt_flg);
	
	/**
	 * 請書受領日. Confirmation received date.<p>
	 *
	 */
	public static final String $po_conf_rcpt_dt = "po_conf_rcpt_dt";
	private static final MCPermColumnInfo _po_conf_rcpt_dt = createColumnInfo("po_conf_rcpt_dt");
	public final MCDatePermColumn po_conf_rcpt_dt = createDateColumn(_po_conf_rcpt_dt);
	
	/**
	 * 価格印字ＦＬＧ. Print price flg..<p>
	 *
	 */
	public static final String $pri_print_flg = "pri_print_flg";
	private static final MCPermColumnInfo _pri_print_flg = createColumnInfo("pri_print_flg");
	public final MCBooleanPermColumn pri_print_flg = createBooleanColumn(_pri_print_flg);
	
	/**
	 * 納品書対象外ＦＬＧ. Not for elivery note flg..<p>
	 *
	 */
	public static final String $dlv_slip_invalid_flg = "dlv_slip_invalid_flg";
	private static final MCPermColumnInfo _dlv_slip_invalid_flg = createColumnInfo("dlv_slip_invalid_flg");
	public final MCBooleanPermColumn dlv_slip_invalid_flg = createBooleanColumn(_dlv_slip_invalid_flg);
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	private static final MCPermColumnInfo _pay_crryovr_times = createColumnInfo("pay_crryovr_times");
	public final MCNumberPermColumn pay_crryovr_times = createNumberColumn(_pay_crryovr_times);
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	private static final MCPermColumnInfo _slo_no = createColumnInfo("slo_no");
	public final MCStringPermColumn slo_no = createStringColumn(_slo_no);
	
	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	private static final MCPermColumnInfo _slo_d_no = createColumnInfo("slo_d_no");
	public final MCStringPermColumn slo_d_no = createStringColumn(_slo_d_no);
	
	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	private static final MCPermColumnInfo _io_schd_pr_no = createColumnInfo("io_schd_pr_no");
	public final MCStringPermColumn io_schd_pr_no = createStringColumn(_io_schd_pr_no);
	
	/**
	 * 負担品目ＣＤ. Charged item cd..<p>
	 *
	 */
	public static final String $bd_itm_cd = "bd_itm_cd";
	private static final MCPermColumnInfo _bd_itm_cd = createColumnInfo("bd_itm_cd");
	public final MCStringPermColumn bd_itm_cd = createStringColumn(_bd_itm_cd);
	
	/**
	 * 負担枝番１. Charged branch No. 1.<p>
	 *
	 */
	public static final String $bd_itm_sub1 = "bd_itm_sub1";
	private static final MCPermColumnInfo _bd_itm_sub1 = createColumnInfo("bd_itm_sub1");
	public final MCStringPermColumn bd_itm_sub1 = createStringColumn(_bd_itm_sub1);
	
	/**
	 * 負担枝番２. Charged branch No. 2.<p>
	 *
	 */
	public static final String $bd_itm_sub2 = "bd_itm_sub2";
	private static final MCPermColumnInfo _bd_itm_sub2 = createColumnInfo("bd_itm_sub2");
	public final MCStringPermColumn bd_itm_sub2 = createStringColumn(_bd_itm_sub2);
	
	/**
	 * 負担枝番３. Charged branch No. 3.<p>
	 *
	 */
	public static final String $bd_itm_sub3 = "bd_itm_sub3";
	private static final MCPermColumnInfo _bd_itm_sub3 = createColumnInfo("bd_itm_sub3");
	public final MCStringPermColumn bd_itm_sub3 = createStringColumn(_bd_itm_sub3);
	
	/**
	 * 負担手配ＮＯ１. Charged SEIBAN No. 1.<p>
	 *
	 */
	public static final String $bd_sno1 = "bd_sno1";
	private static final MCPermColumnInfo _bd_sno1 = createColumnInfo("bd_sno1");
	public final MCStringPermColumn bd_sno1 = createStringColumn(_bd_sno1);
	
	/**
	 * 負担手配ＮＯ２. Charged SEIBAN No. 2.<p>
	 *
	 */
	public static final String $bd_sno2 = "bd_sno2";
	private static final MCPermColumnInfo _bd_sno2 = createColumnInfo("bd_sno2");
	public final MCStringPermColumn bd_sno2 = createStringColumn(_bd_sno2);
	
	/**
	 * 負担手配ＮＯ３. Charged SEIBAN No. 3.<p>
	 *
	 */
	public static final String $bd_sno3 = "bd_sno3";
	private static final MCPermColumnInfo _bd_sno3 = createColumnInfo("bd_sno3");
	public final MCStringPermColumn bd_sno3 = createStringColumn(_bd_sno3);
	
	/**
	 * 負担手配ＮＯ４. Charged SEIBAN No. 4.<p>
	 *
	 */
	public static final String $bd_sno4 = "bd_sno4";
	private static final MCPermColumnInfo _bd_sno4 = createColumnInfo("bd_sno4");
	public final MCStringPermColumn bd_sno4 = createStringColumn(_bd_sno4);
	
	/**
	 * 負担場所ＣＤ. Charged location cd..<p>
	 *
	 */
	public static final String $bd_loc_cd = "bd_loc_cd";
	private static final MCPermColumnInfo _bd_loc_cd = createColumnInfo("bd_loc_cd");
	public final MCStringPermColumn bd_loc_cd = createStringColumn(_bd_loc_cd);
	
	/**
	 * 負担ロットＮＯ. Charged lot No..<p>
	 *
	 */
	public static final String $bd_lot_no = "bd_lot_no";
	private static final MCPermColumnInfo _bd_lot_no = createColumnInfo("bd_lot_no");
	public final MCStringPermColumn bd_lot_no = createStringColumn(_bd_lot_no);
	
	/**
	 * 負担サブロットＮＯ. Charged sublot No..<p>
	 *
	 */
	public static final String $bd_sublot_no = "bd_sublot_no";
	private static final MCPermColumnInfo _bd_sublot_no = createColumnInfo("bd_sublot_no");
	public final MCStringPermColumn bd_sublot_no = createStringColumn(_bd_sublot_no);
	
	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	private static final MCPermColumnInfo _bd_dpt_cd = createColumnInfo("bd_dpt_cd");
	public final MCStringPermColumn bd_dpt_cd = createStringColumn(_bd_dpt_cd);
	
	/**
	 * 負担ＷＧ ＣＤ. Charged WG cd..<p>
	 *
	 */
	public static final String $bd_wg_cd = "bd_wg_cd";
	private static final MCPermColumnInfo _bd_wg_cd = createColumnInfo("bd_wg_cd");
	public final MCStringPermColumn bd_wg_cd = createStringColumn(_bd_wg_cd);
	
	/**
	 * 負担品群ＣＤ. Charged item category cd..<p>
	 *
	 */
	public static final String $bd_ctg_cd = "bd_ctg_cd";
	private static final MCPermColumnInfo _bd_ctg_cd = createColumnInfo("bd_ctg_cd");
	public final MCStringPermColumn bd_ctg_cd = createStringColumn(_bd_ctg_cd);
	
	/**
	 * 負担工程ＣＤ. Charged operation cd..<p>
	 *
	 */
	public static final String $bd_oper_cd = "bd_oper_cd";
	private static final MCPermColumnInfo _bd_oper_cd = createColumnInfo("bd_oper_cd");
	public final MCStringPermColumn bd_oper_cd = createStringColumn(_bd_oper_cd);
	
	/**
	 * 負担受注ＮＯ. Charged sales No..<p>
	 *
	 */
	public static final String $bd_slo_no = "bd_slo_no";
	private static final MCPermColumnInfo _bd_slo_no = createColumnInfo("bd_slo_no");
	public final MCStringPermColumn bd_slo_no = createStringColumn(_bd_slo_no);
	
	/**
	 * 負担インボイスＮＯ. Charged invoice No..<p>
	 *
	 */
	public static final String $bd_iv_no = "bd_iv_no";
	private static final MCPermColumnInfo _bd_iv_no = createColumnInfo("bd_iv_no");
	public final MCStringPermColumn bd_iv_no = createStringColumn(_bd_iv_no);
	
	/**
	 * 負担発注ＮＯ. Charged PO No..<p>
	 *
	 */
	public static final String $bd_po_no = "bd_po_no";
	private static final MCPermColumnInfo _bd_po_no = createColumnInfo("bd_po_no");
	public final MCStringPermColumn bd_po_no = createStringColumn(_bd_po_no);
	
	/**
	 * 負担取引先ＣＤ. Charged BP cd..<p>
	 *
	 */
	public static final String $bd_bp_cd = "bd_bp_cd";
	private static final MCPermColumnInfo _bd_bp_cd = createColumnInfo("bd_bp_cd");
	public final MCStringPermColumn bd_bp_cd = createStringColumn(_bd_bp_cd);
	
	/**
	 * 外部発注明細ＮＯ. External PO details No..<p>
	 *
	 */
	public static final String $ext_po_d_no = "ext_po_d_no";
	private static final MCPermColumnInfo _ext_po_d_no = createColumnInfo("ext_po_d_no");
	public final MCStringPermColumn ext_po_d_no = createStringColumn(_ext_po_d_no);
	
	/**
	 * 内部明細備考. Internal details remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	private static final MCPermColumnInfo _trd_d_rmrks = createColumnInfo("trd_d_rmrks");
	public final MCStringPermColumn trd_d_rmrks = createStringColumn(_trd_d_rmrks);
	
	/**
	 * 注文書明細備考. PO sheet details remarks.<p>
	 *
	 */
	public static final String $po_print_d_rmrks = "po_print_d_rmrks";
	private static final MCPermColumnInfo _po_print_d_rmrks = createColumnInfo("po_print_d_rmrks");
	public final MCStringPermColumn po_print_d_rmrks = createStringColumn(_po_print_d_rmrks);
	
	/**
	 * 納品書明細備考. Delivery note details remarks.<p>
	 *
	 */
	public static final String $dlv_slip_d_rmrks = "dlv_slip_d_rmrks";
	private static final MCPermColumnInfo _dlv_slip_d_rmrks = createColumnInfo("dlv_slip_d_rmrks");
	public final MCStringPermColumn dlv_slip_d_rmrks = createStringColumn(_dlv_slip_d_rmrks);
	
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
	 * 紐切れＦＬＧ. Unpegged flg..<p>
	 *
	 */
	public static final String $rqst_can_flg = "rqst_can_flg";
	private static final MCPermColumnInfo _rqst_can_flg = createColumnInfo("rqst_can_flg");
	public final MCBooleanPermColumn rqst_can_flg = createBooleanColumn(_rqst_can_flg);
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	private static final MCPermColumnInfo _can_flg = createColumnInfo("can_flg");
	public final MCBooleanPermColumn can_flg = createBooleanColumn(_can_flg);
	
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
	
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_rev_META = createCommonMeta($po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta purc_rsn_cd_META = createCommonMeta($purc_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta in_to_loc_cd_META = createCommonMeta($in_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
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
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta rqst_dlv_rqst_tm_META = createCommonMeta($rqst_dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta rqst_avl_rqst_dt_META = createCommonMeta($rqst_avl_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upri_not_tgt_flg_META = createCommonMeta($upri_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_proc_upri_META = createCommonMeta($trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_onr_prov_upri_META = createCommonMeta($trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_proc_amt_META = createCommonMeta($trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_onr_prov_amt_META = createCommonMeta($trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta drct_dlv_typ_META = createCommonMeta($drct_dlv_typ, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta bndl_flg_META = createCommonMeta($bndl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_slo_flg_META = createCommonMeta($rqst_slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_itm_ord_no_META = createCommonMeta($outsrc_itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta uplnd_flg_META = createCommonMeta($uplnd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_chg_flg_META = createCommonMeta($schd_chg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_conf_rcpt_flg_META = createCommonMeta($po_conf_rcpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_conf_rcpt_dt_META = createCommonMeta($po_conf_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pri_print_flg_META = createCommonMeta($pri_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_invalid_flg_META = createCommonMeta($dlv_slip_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta bd_itm_cd_META = createCommonMeta($bd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta bd_itm_sub1_META = createCommonMeta($bd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta bd_itm_sub2_META = createCommonMeta($bd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta bd_itm_sub3_META = createCommonMeta($bd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta bd_sno1_META = createCommonMeta($bd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta bd_sno2_META = createCommonMeta($bd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta bd_sno3_META = createCommonMeta($bd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta bd_sno4_META = createCommonMeta($bd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bd_loc_cd_META = createCommonMeta($bd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bd_lot_no_META = createCommonMeta($bd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta bd_sublot_no_META = createCommonMeta($bd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_wg_cd_META = createCommonMeta($bd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bd_ctg_cd_META = createCommonMeta($bd_ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta bd_oper_cd_META = createCommonMeta($bd_oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta bd_slo_no_META = createCommonMeta($bd_slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta bd_iv_no_META = createCommonMeta($bd_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bd_po_no_META = createCommonMeta($bd_po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta bd_bp_cd_META = createCommonMeta($bd_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ext_po_d_no_META = createCommonMeta($ext_po_d_no, mcframe.commonMA.meta.MA_META.EXT_PO_D_NO);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PO_D_INTR_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta po_print_d_rmrks_META = createCommonMeta($po_print_d_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_D_RMRKS);
	public static final MCMeta dlv_slip_d_rmrks_META = createCommonMeta($dlv_slip_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR3);
	public static final MCMeta rqst_can_flg_META = createCommonMeta($rqst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MST_PO_D_R> constMetas = new ConstMetaList<MST_PO_D_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			po_d_no_META,
			po_no_META,
			po_rev_META,
			po_schd_no_META,
			disp_seq_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			itm_nm_META,
			iv_itm_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			purc_rsn_cd_META,
			purc_id_typ_META,
			sundry_itm_flg_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			ap_dpt_cd_META,
			maker_cd_META,
			bp_lot_no_META,
			in_to_loc_cd_META,
			str_ln_cd_META,
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
			tdlv_cd_META,
			tdlv_sundry_flg_META,
			tdlv_nm_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_tel_META,
			tdlv_fax_META,
			dlv_rqst_tm_META,
			purc_lt_META,
			rqst_dlv_rqst_tm_META,
			rqst_avl_rqst_dt_META,
			purc_schd_dt_META,
			purc_basis_typ_META,
			sync_flg_META,
			purc_upri_req_typ_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			interim_flg_META,
			upri_not_tgt_flg_META,
			trd_cur_upri_META,
			trd_cur_proc_upri_META,
			trd_cur_onr_prov_upri_META,
			trd_cur_amt_META,
			trd_cur_proc_amt_META,
			trd_cur_onr_prov_amt_META,
			trd_cur_tax_amt_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			tax_fix_flg_META,
			tax_cd_META,
			wtax_rate_META,
			wtax_amt_META,
			drct_dlv_typ_META,
			mfg_loc_cd_META,
			bom_ptn_META,
			bndl_flg_META,
			rqst_slo_flg_META,
			outsrc_itm_ord_no_META,
			outsrc_flg_META,
			uplnd_flg_META,
			schd_chg_flg_META,
			po_conf_rcpt_flg_META,
			po_conf_rcpt_dt_META,
			pri_print_flg_META,
			dlv_slip_invalid_flg_META,
			pay_crryovr_times_META,
			slo_no_META,
			slo_d_no_META,
			io_schd_pr_no_META,
			bd_itm_cd_META,
			bd_itm_sub1_META,
			bd_itm_sub2_META,
			bd_itm_sub3_META,
			bd_sno1_META,
			bd_sno2_META,
			bd_sno3_META,
			bd_sno4_META,
			bd_loc_cd_META,
			bd_lot_no_META,
			bd_sublot_no_META,
			bd_dpt_cd_META,
			bd_wg_cd_META,
			bd_ctg_cd_META,
			bd_oper_cd_META,
			bd_slo_no_META,
			bd_iv_no_META,
			bd_po_no_META,
			bd_bp_cd_META,
			ext_po_d_no_META,
			intr_rmrks_META,
			trd_d_rmrks_META,
			po_print_d_rmrks_META,
			dlv_slip_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rqst_can_flg_META,
			can_flg_META,
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
	protected MST_PO_D_R(ConstMetaList<? extends MST_PO_D_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PO_D_R(ConstMetaList<? extends MST_PO_D_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PO_D_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$po_d_no,
				"po_d_no",
				po_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$po_no,
				"po_no",
				po_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$po_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$po_rev,
				"po_rev",
				po_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$po_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$po_schd_no,
				"po_schd_no",
				po_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$disp_seq,
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
			MST_PO_D_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$itm_cd,
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
			MST_PO_D_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$itm_sub1,
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
			MST_PO_D_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$itm_sub2,
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
			MST_PO_D_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$itm_sub3,
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
			MST_PO_D_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$ver_no,
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
			MST_PO_D_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$itm_nm,
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
			MST_PO_D_R.$iv_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$iv_itm_nm,
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
			MST_PO_D_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$sno1,
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
			MST_PO_D_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$sno2,
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
			MST_PO_D_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$sno3,
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
			MST_PO_D_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$sno4,
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
			MST_PO_D_R.$purc_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$purc_rsn_cd,
				"purc_rsn_cd",
				purc_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$purc_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$purc_id_typ,
				"purc_id_typ",
				purc_id_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$sundry_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$sundry_itm_flg,
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
			MST_PO_D_R.$sppl_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$sppl_itm_cd,
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
			MST_PO_D_R.$sppl_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$sppl_itm_nm,
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
			MST_PO_D_R.$ap_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$ap_dpt_cd,
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
			MST_PO_D_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$maker_cd,
				"maker_cd",
				maker_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bp_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bp_lot_no,
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
			MST_PO_D_R.$in_to_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$in_to_loc_cd,
				"in_to_loc_cd",
				in_to_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$str_ln_cd,
				"str_ln_cd",
				str_ln_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$dlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_cd,
				"dlv_cd",
				dlv_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$dlv_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$dlv_sundry_flg,
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
			MST_PO_D_R.$dlv_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_nm,
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
			MST_PO_D_R.$dlv_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_cntct_dpt,
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
			MST_PO_D_R.$dlv_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_cntct_psn,
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
			MST_PO_D_R.$dlv_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_zip_cd,
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
			MST_PO_D_R.$dlv_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_addr1,
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
			MST_PO_D_R.$dlv_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_addr2,
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
			MST_PO_D_R.$dlv_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_addr3,
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
			MST_PO_D_R.$dlv_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_addr4,
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
			MST_PO_D_R.$dlv_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_tel,
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
			MST_PO_D_R.$dlv_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_fax,
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
			MST_PO_D_R.$tdlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_cd,
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
			MST_PO_D_R.$tdlv_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$tdlv_sundry_flg,
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
			MST_PO_D_R.$tdlv_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_nm,
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
			MST_PO_D_R.$tdlv_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_cntct_dpt,
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
			MST_PO_D_R.$tdlv_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_cntct_psn,
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
			MST_PO_D_R.$tdlv_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_zip_cd,
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
			MST_PO_D_R.$tdlv_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_addr1,
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
			MST_PO_D_R.$tdlv_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_addr2,
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
			MST_PO_D_R.$tdlv_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_addr3,
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
			MST_PO_D_R.$tdlv_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_addr4,
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
			MST_PO_D_R.$tdlv_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_tel,
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
			MST_PO_D_R.$tdlv_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tdlv_fax,
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
			MST_PO_D_R.$dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PO_D_R.$dlv_rqst_tm,
				"dlv_rqst_tm",
				dlv_rqst_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$purc_lt,
				"purc_lt",
				purc_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$rqst_dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PO_D_R.$rqst_dlv_rqst_tm,
				"rqst_dlv_rqst_tm",
				rqst_dlv_rqst_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$rqst_avl_rqst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PO_D_R.$rqst_avl_rqst_dt,
				"rqst_avl_rqst_dt",
				rqst_avl_rqst_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$purc_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PO_D_R.$purc_schd_dt,
				"purc_schd_dt",
				purc_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$purc_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$purc_basis_typ,
				"purc_basis_typ",
				purc_basis_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$sync_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$sync_flg,
				"sync_flg",
				sync_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$purc_upri_req_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$purc_upri_req_typ,
				"purc_upri_req_typ",
				purc_upri_req_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$trd_unit_qty,
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
			MST_PO_D_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$trd_unit_cd,
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
			MST_PO_D_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$base_unit_qty,
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
			MST_PO_D_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$base_unit_cd,
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
			MST_PO_D_R.$interim_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$interim_flg,
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
			MST_PO_D_R.$upri_not_tgt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$upri_not_tgt_flg,
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
			MST_PO_D_R.$trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$trd_cur_upri,
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
			MST_PO_D_R.$trd_cur_proc_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$trd_cur_proc_upri,
				"trd_cur_proc_upri",
				trd_cur_proc_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$trd_cur_onr_prov_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$trd_cur_onr_prov_upri,
				"trd_cur_onr_prov_upri",
				trd_cur_onr_prov_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$trd_cur_amt,
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
			MST_PO_D_R.$trd_cur_proc_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$trd_cur_proc_amt,
				"trd_cur_proc_amt",
				trd_cur_proc_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$trd_cur_onr_prov_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$trd_cur_onr_prov_amt,
				"trd_cur_onr_prov_amt",
				trd_cur_onr_prov_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$trd_cur_tax_amt,
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
			MST_PO_D_R.$trd_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$trd_cur_dscnt_amt,
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
			MST_PO_D_R.$dscnt_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dscnt_rsn_cd,
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
			MST_PO_D_R.$tax_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$tax_fix_flg,
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
			MST_PO_D_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$tax_cd,
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
			MST_PO_D_R.$wtax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$wtax_rate,
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
			MST_PO_D_R.$wtax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$wtax_amt,
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
			MST_PO_D_R.$drct_dlv_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$drct_dlv_typ,
				"drct_dlv_typ",
				drct_dlv_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$mfg_loc_cd,
				"mfg_loc_cd",
				mfg_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bom_ptn,
				"bom_ptn",
				bom_ptn,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bndl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$bndl_flg,
				"bndl_flg",
				bndl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$rqst_slo_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$rqst_slo_flg,
				"rqst_slo_flg",
				rqst_slo_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$outsrc_itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$outsrc_itm_ord_no,
				"outsrc_itm_ord_no",
				outsrc_itm_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$outsrc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$outsrc_flg,
				"outsrc_flg",
				outsrc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$uplnd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$uplnd_flg,
				"uplnd_flg",
				uplnd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$schd_chg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$schd_chg_flg,
				"schd_chg_flg",
				schd_chg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$po_conf_rcpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$po_conf_rcpt_flg,
				"po_conf_rcpt_flg",
				po_conf_rcpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$po_conf_rcpt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PO_D_R.$po_conf_rcpt_dt,
				"po_conf_rcpt_dt",
				po_conf_rcpt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$pri_print_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$pri_print_flg,
				"pri_print_flg",
				pri_print_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$dlv_slip_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$dlv_slip_invalid_flg,
				"dlv_slip_invalid_flg",
				dlv_slip_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$pay_crryovr_times,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$pay_crryovr_times,
				"pay_crryovr_times",
				pay_crryovr_times,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$slo_no,
				"slo_no",
				slo_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$slo_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$slo_d_no,
				"slo_d_no",
				slo_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$io_schd_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$io_schd_pr_no,
				"io_schd_pr_no",
				io_schd_pr_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_itm_cd,
				"bd_itm_cd",
				bd_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_itm_sub1,
				"bd_itm_sub1",
				bd_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_itm_sub2,
				"bd_itm_sub2",
				bd_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_itm_sub3,
				"bd_itm_sub3",
				bd_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_sno1,
				"bd_sno1",
				bd_sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_sno2,
				"bd_sno2",
				bd_sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_sno3,
				"bd_sno3",
				bd_sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_sno4,
				"bd_sno4",
				bd_sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_loc_cd,
				"bd_loc_cd",
				bd_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_lot_no,
				"bd_lot_no",
				bd_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_sublot_no,
				"bd_sublot_no",
				bd_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_dpt_cd,
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
			MST_PO_D_R.$bd_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_wg_cd,
				"bd_wg_cd",
				bd_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_ctg_cd,
				"bd_ctg_cd",
				bd_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_oper_cd,
				"bd_oper_cd",
				bd_oper_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_slo_no,
				"bd_slo_no",
				bd_slo_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_iv_no,
				"bd_iv_no",
				bd_iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_po_no,
				"bd_po_no",
				bd_po_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$bd_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$bd_bp_cd,
				"bd_bp_cd",
				bd_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$ext_po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$ext_po_d_no,
				"ext_po_d_no",
				ext_po_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$intr_rmrks,
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
			MST_PO_D_R.$trd_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$trd_d_rmrks,
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
			MST_PO_D_R.$po_print_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$po_print_d_rmrks,
				"po_print_d_rmrks",
				po_print_d_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$dlv_slip_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$dlv_slip_d_rmrks,
				"dlv_slip_d_rmrks",
				dlv_slip_d_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$sub_char1,
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
			MST_PO_D_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$sub_char2,
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
			MST_PO_D_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$sub_char3,
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
			MST_PO_D_R.$rqst_can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$rqst_can_flg,
				"rqst_can_flg",
				rqst_can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PO_D_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PO_D_R.$can_flg,
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
			MST_PO_D_R.$edi_sub_d_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$edi_sub_d_char1,
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
			MST_PO_D_R.$edi_sub_d_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$edi_sub_d_char2,
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
			MST_PO_D_R.$edi_sub_d_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$edi_sub_d_char3,
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
			MST_PO_D_R.$edi_sub_d_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$edi_sub_d_char4,
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
			MST_PO_D_R.$edi_sub_d_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$edi_sub_d_char5,
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
			MST_PO_D_R.$edi_sub_d_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$edi_sub_d_num1,
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
			MST_PO_D_R.$edi_sub_d_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PO_D_R.$edi_sub_d_dt1,
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
			MST_PO_D_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$ins_usr_id,
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
			MST_PO_D_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$ins_usr_nm,
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
			MST_PO_D_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PO_D_R.$ins_ts,
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
			MST_PO_D_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$ins_func_id,
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
			MST_PO_D_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PO_D_R.$upd_cntr,
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
			MST_PO_D_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$upd_usr_id,
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
			MST_PO_D_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$upd_usr_nm,
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
			MST_PO_D_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PO_D_R.$upd_ts,
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
			MST_PO_D_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$upd_func_id,
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
			MST_PO_D_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PO_D_R.$upd_srv_req_no,
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
	public static MST_PO_D_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PO_D_R create(String alias) {
		MST_PO_D_R row = new MST_PO_D_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PO_D_R createByName(T proto) {
		MST_PO_D_R row = MST_PO_D_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PO_D_R clone() {
		return (MST_PO_D_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PO_D_R createInstance() {
		return (MST_PO_D_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PO_D_R getValues(String... names) {
		return (MST_PO_D_R) super.getValues(names);
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
	 public MSW_PO_D_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PO_D_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PO_D_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PO_D_KEY_R.TABLE_NAME);
	 }

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 0, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 0, $po_d_no, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 1, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 1, $po_no, value);
	}

	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public MCNumber po_rev() {
		return getConstNumber(offset + 2, $po_rev);
	}

	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		setConstNumber(offset + 2, $po_rev, value);
	}
	
	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public void po_rev(int value) {
		setConstNumber(offset + 2, $po_rev, value);
	}
	
	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public void po_rev(long value) {
		setConstNumber(offset + 2, $po_rev, value);
	}
	
	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public void po_rev(float value) {
		setConstNumber(offset + 2, $po_rev, value);
	}
	
	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public void po_rev(double value) {
		setConstNumber(offset + 2, $po_rev, value);
	}
	
	/**
	 * 発注予定ＮＯ. PO schedule No..<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 3, $po_schd_no);
	}

	/**
	 * 発注予定ＮＯ. PO schedule No..<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 3, $po_schd_no, value);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 4, $disp_seq);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 6, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 6, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 7, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 7, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 8, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 8, $itm_sub3, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 9, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 9, $ver_no, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 10, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 10, $itm_nm, value);
	}

	/**
	 * インボイス表記品名. Item name for invoice.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 11, $iv_itm_nm);
	}

	/**
	 * インボイス表記品名. Item name for invoice.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 11, $iv_itm_nm, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 12, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 12, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 13, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 13, $sno2, value);
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
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 15, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 15, $sno4, value);
	}

	/**
	 * 仕入理由ＣＤ. Purchase reason cd..<p>
	 *
	 */
	public String purc_rsn_cd() {
		return getConstString(offset + 16, $purc_rsn_cd);
	}

	/**
	 * 仕入理由ＣＤ. Purchase reason cd..<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		setConstString(offset + 16, $purc_rsn_cd, value);
	}

	/**
	 * 購買識別区分. Purchase identification type.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 17, $purc_id_typ);
	}

	/**
	 * 購買識別区分. Purchase identification type.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 17, $purc_id_typ, value);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 18, $sundry_itm_flg);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 18, $sundry_itm_flg, value);
	}

	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 19, $sppl_itm_cd);
	}

	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 19, $sppl_itm_cd, value);
	}

	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 20, $sppl_itm_nm);
	}

	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 20, $sppl_itm_nm, value);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 21, $ap_dpt_cd);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 21, $ap_dpt_cd, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 22, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 22, $maker_cd, value);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 23, $bp_lot_no);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 23, $bp_lot_no, value);
	}

	/**
	 * 納入場所ＣＤ. Delivery location cd..<p>
	 *
	 */
	public String in_to_loc_cd() {
		return getConstString(offset + 24, $in_to_loc_cd);
	}

	/**
	 * 納入場所ＣＤ. Delivery location cd..<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		setConstString(offset + 24, $in_to_loc_cd, value);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 25, $str_ln_cd);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 25, $str_ln_cd, value);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 26, $dlv_cd);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 26, $dlv_cd, value);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 27, $dlv_sundry_flg);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 27, $dlv_sundry_flg, value);
	}

	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 28, $dlv_nm);
	}

	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 28, $dlv_nm, value);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 29, $dlv_cntct_dpt);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 29, $dlv_cntct_dpt, value);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 30, $dlv_cntct_psn);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 30, $dlv_cntct_psn, value);
	}

	/**
	 * 納品先郵便番号. Zip code (Delivery destination).<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 31, $dlv_zip_cd);
	}

	/**
	 * 納品先郵便番号. Zip code (Delivery destination).<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 31, $dlv_zip_cd, value);
	}

	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 32, $dlv_addr1);
	}

	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 32, $dlv_addr1, value);
	}

	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 33, $dlv_addr2);
	}

	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 33, $dlv_addr2, value);
	}

	/**
	 * 納品先住所３. Address 3 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 34, $dlv_addr3);
	}

	/**
	 * 納品先住所３. Address 3 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 34, $dlv_addr3, value);
	}

	/**
	 * 納品先住所４. Address 4 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 35, $dlv_addr4);
	}

	/**
	 * 納品先住所４. Address 4 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 35, $dlv_addr4, value);
	}

	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 36, $dlv_tel);
	}

	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 36, $dlv_tel, value);
	}

	/**
	 * 納品先ＦＡＸ. FAX (Delivery destination).<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 37, $dlv_fax);
	}

	/**
	 * 納品先ＦＡＸ. FAX (Delivery destination).<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 37, $dlv_fax, value);
	}

	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 38, $tdlv_cd);
	}

	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 38, $tdlv_cd, value);
	}

	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 39, $tdlv_sundry_flg);
	}

	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 39, $tdlv_sundry_flg, value);
	}

	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 40, $tdlv_nm);
	}

	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 40, $tdlv_nm, value);
	}

	/**
	 * 配送先部署. Receiving point dept..<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 41, $tdlv_cntct_dpt);
	}

	/**
	 * 配送先部署. Receiving point dept..<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 41, $tdlv_cntct_dpt, value);
	}

	/**
	 * 配送先担当者. Receiving point PIC.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 42, $tdlv_cntct_psn);
	}

	/**
	 * 配送先担当者. Receiving point PIC.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 42, $tdlv_cntct_psn, value);
	}

	/**
	 * 配送先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 43, $tdlv_zip_cd);
	}

	/**
	 * 配送先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 43, $tdlv_zip_cd, value);
	}

	/**
	 * 配送先住所１. Receiving point address 1.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 44, $tdlv_addr1);
	}

	/**
	 * 配送先住所１. Receiving point address 1.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 44, $tdlv_addr1, value);
	}

	/**
	 * 配送先住所２. Receiving point address 2.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 45, $tdlv_addr2);
	}

	/**
	 * 配送先住所２. Receiving point address 2.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 45, $tdlv_addr2, value);
	}

	/**
	 * 配送先住所３. Receiving point address 3.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 46, $tdlv_addr3);
	}

	/**
	 * 配送先住所３. Receiving point address 3.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 46, $tdlv_addr3, value);
	}

	/**
	 * 配送先住所４. Receiving point address 4.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 47, $tdlv_addr4);
	}

	/**
	 * 配送先住所４. Receiving point address 4.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 47, $tdlv_addr4, value);
	}

	/**
	 * 配送先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 48, $tdlv_tel);
	}

	/**
	 * 配送先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 48, $tdlv_tel, value);
	}

	/**
	 * 配送先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 49, $tdlv_fax);
	}

	/**
	 * 配送先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 49, $tdlv_fax, value);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 50, $dlv_rqst_tm);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 50, $dlv_rqst_tm, value);
	}

	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 51, $purc_lt);
	}

	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 51, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 51, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 51, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 51, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 51, $purc_lt, value);
	}
	
	/**
	 * 依頼元納入希望日時. Request source desired delivery date and time.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return getConstDate(offset + 52, $rqst_dlv_rqst_tm);
	}

	/**
	 * 依頼元納入希望日時. Request source desired delivery date and time.<p>
	 *
	 */
	public void rqst_dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 52, $rqst_dlv_rqst_tm, value);
	}

	/**
	 * 依頼元使用可能希望日. Request source desired available date.<p>
	 *
	 */
	public MCDate rqst_avl_rqst_dt() {
		return getConstDate(offset + 53, $rqst_avl_rqst_dt);
	}

	/**
	 * 依頼元使用可能希望日. Request source desired available date.<p>
	 *
	 */
	public void rqst_avl_rqst_dt(MCDate value) {
		setConstDate(offset + 53, $rqst_avl_rqst_dt, value);
	}

	/**
	 * 仕入予定日. Scheduled purchase date.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 54, $purc_schd_dt);
	}

	/**
	 * 仕入予定日. Scheduled purchase date.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 54, $purc_schd_dt, value);
	}

	/**
	 * 仕入計上区分. Purchase recording type.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 55, $purc_basis_typ);
	}

	/**
	 * 仕入計上区分. Purchase recording type.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 55, $purc_basis_typ, value);
	}

	/**
	 * 同時計上ＦＬＧ. Simultaneous recording flg..<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 56, $sync_flg);
	}

	/**
	 * 同時計上ＦＬＧ. Simultaneous recording flg..<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 56, $sync_flg, value);
	}

	/**
	 * 購買単価取得区分. Purchase unit price acquisition type.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 57, $purc_upri_req_typ);
	}

	/**
	 * 購買単価取得区分. Purchase unit price acquisition type.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 57, $purc_upri_req_typ, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 58, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 58, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 58, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 58, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 58, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 58, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 59, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 59, $trd_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 60, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 60, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 60, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 60, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 60, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 60, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 61, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 61, $base_unit_cd, value);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 62, $interim_flg);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 62, $interim_flg, value);
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
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 64, $trd_cur_upri);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 64, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 64, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 64, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 64, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 64, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨加工単価. Subcontracting unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return getConstNumber(offset + 65, $trd_cur_proc_upri);
	}

	/**
	 * 取引通貨加工単価. Subcontracting unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 65, $trd_cur_proc_upri, value);
	}
	
	/**
	 * 取引通貨加工単価. Subcontracting unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		setConstNumber(offset + 65, $trd_cur_proc_upri, value);
	}
	
	/**
	 * 取引通貨加工単価. Subcontracting unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		setConstNumber(offset + 65, $trd_cur_proc_upri, value);
	}
	
	/**
	 * 取引通貨加工単価. Subcontracting unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		setConstNumber(offset + 65, $trd_cur_proc_upri, value);
	}
	
	/**
	 * 取引通貨加工単価. Subcontracting unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		setConstNumber(offset + 65, $trd_cur_proc_upri, value);
	}
	
	/**
	 * 取引通貨有償支給単価. Chargeable supply unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 66, $trd_cur_onr_prov_upri);
	}

	/**
	 * 取引通貨有償支給単価. Chargeable supply unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 66, $trd_cur_onr_prov_upri, value);
	}
	
	/**
	 * 取引通貨有償支給単価. Chargeable supply unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 66, $trd_cur_onr_prov_upri, value);
	}
	
	/**
	 * 取引通貨有償支給単価. Chargeable supply unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 66, $trd_cur_onr_prov_upri, value);
	}
	
	/**
	 * 取引通貨有償支給単価. Chargeable supply unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 66, $trd_cur_onr_prov_upri, value);
	}
	
	/**
	 * 取引通貨有償支給単価. Chargeable supply unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 66, $trd_cur_onr_prov_upri, value);
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
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return getConstNumber(offset + 68, $trd_cur_proc_amt);
	}

	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 68, $trd_cur_proc_amt, value);
	}
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		setConstNumber(offset + 68, $trd_cur_proc_amt, value);
	}
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		setConstNumber(offset + 68, $trd_cur_proc_amt, value);
	}
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		setConstNumber(offset + 68, $trd_cur_proc_amt, value);
	}
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		setConstNumber(offset + 68, $trd_cur_proc_amt, value);
	}
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 69, $trd_cur_onr_prov_amt);
	}

	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 69, $trd_cur_onr_prov_amt, value);
	}
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 69, $trd_cur_onr_prov_amt, value);
	}
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 69, $trd_cur_onr_prov_amt, value);
	}
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 69, $trd_cur_onr_prov_amt, value);
	}
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 69, $trd_cur_onr_prov_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 70, $trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 70, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 70, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 70, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 70, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 70, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 71, $trd_cur_dscnt_amt);
	}

	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 71, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 71, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 71, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 71, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 71, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 値引理由ＣＤ. Discount reason cd..<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 72, $dscnt_rsn_cd);
	}

	/**
	 * 値引理由ＣＤ. Discount reason cd..<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 72, $dscnt_rsn_cd, value);
	}

	/**
	 * 税指定ＦＬＧ. Tax specified flg..<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 73, $tax_fix_flg);
	}

	/**
	 * 税指定ＦＬＧ. Tax specified flg..<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 73, $tax_fix_flg, value);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 74, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 74, $tax_cd, value);
	}

	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 75, $wtax_rate);
	}

	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 75, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 75, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 75, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 75, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 75, $wtax_rate, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 76, $wtax_amt);
	}

	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 76, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 76, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 76, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 76, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 76, $wtax_amt, value);
	}
	
	/**
	 * 直納区分. Direct-delivery type.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return getConstString(offset + 77, $drct_dlv_typ);
	}

	/**
	 * 直納区分. Direct-delivery type.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		setConstString(offset + 77, $drct_dlv_typ, value);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 78, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 78, $mfg_loc_cd, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 79, $bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 79, $bom_ptn, value);
	}

	/**
	 * まとめＦＬＧ. Aggregation flg..<p>
	 *
	 */
	public boolean bndl_flg() {
		return getConstBoolean(offset + 80, $bndl_flg);
	}

	/**
	 * まとめＦＬＧ. Aggregation flg..<p>
	 *
	 */
	public void bndl_flg(boolean value) {
		setConstBoolean(offset + 80, $bndl_flg, value);
	}

	/**
	 * 依頼元受注ＦＬＧ. Request source orders flg..<p>
	 *
	 */
	public boolean rqst_slo_flg() {
		return getConstBoolean(offset + 81, $rqst_slo_flg);
	}

	/**
	 * 依頼元受注ＦＬＧ. Request source orders flg..<p>
	 *
	 */
	public void rqst_slo_flg(boolean value) {
		setConstBoolean(offset + 81, $rqst_slo_flg, value);
	}

	/**
	 * 外注品目オーダＮＯ. Subcontracting item order No..<p>
	 *
	 */
	public String outsrc_itm_ord_no() {
		return getConstString(offset + 82, $outsrc_itm_ord_no);
	}

	/**
	 * 外注品目オーダＮＯ. Subcontracting item order No..<p>
	 *
	 */
	public void outsrc_itm_ord_no(String value) {
		setConstString(offset + 82, $outsrc_itm_ord_no, value);
	}

	/**
	 * 外注ＦＬＧ. Subcontracting flg..<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 83, $outsrc_flg);
	}

	/**
	 * 外注ＦＬＧ. Subcontracting flg..<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 83, $outsrc_flg, value);
	}

	/**
	 * 計画外ＦＬＧ. Unplanned flg..<p>
	 *
	 */
	public boolean uplnd_flg() {
		return getConstBoolean(offset + 84, $uplnd_flg);
	}

	/**
	 * 計画外ＦＬＧ. Unplanned flg..<p>
	 *
	 */
	public void uplnd_flg(boolean value) {
		setConstBoolean(offset + 84, $uplnd_flg, value);
	}

	/**
	 * 計画変更ＦＬＧ. Plan changed flg..<p>
	 *
	 */
	public boolean schd_chg_flg() {
		return getConstBoolean(offset + 85, $schd_chg_flg);
	}

	/**
	 * 計画変更ＦＬＧ. Plan changed flg..<p>
	 *
	 */
	public void schd_chg_flg(boolean value) {
		setConstBoolean(offset + 85, $schd_chg_flg, value);
	}

	/**
	 * 請書受領ＦＬＧ. Confirmation received flg..<p>
	 *
	 */
	public boolean po_conf_rcpt_flg() {
		return getConstBoolean(offset + 86, $po_conf_rcpt_flg);
	}

	/**
	 * 請書受領ＦＬＧ. Confirmation received flg..<p>
	 *
	 */
	public void po_conf_rcpt_flg(boolean value) {
		setConstBoolean(offset + 86, $po_conf_rcpt_flg, value);
	}

	/**
	 * 請書受領日. Confirmation received date.<p>
	 *
	 */
	public MCDate po_conf_rcpt_dt() {
		return getConstDate(offset + 87, $po_conf_rcpt_dt);
	}

	/**
	 * 請書受領日. Confirmation received date.<p>
	 *
	 */
	public void po_conf_rcpt_dt(MCDate value) {
		setConstDate(offset + 87, $po_conf_rcpt_dt, value);
	}

	/**
	 * 価格印字ＦＬＧ. Print price flg..<p>
	 *
	 */
	public boolean pri_print_flg() {
		return getConstBoolean(offset + 88, $pri_print_flg);
	}

	/**
	 * 価格印字ＦＬＧ. Print price flg..<p>
	 *
	 */
	public void pri_print_flg(boolean value) {
		setConstBoolean(offset + 88, $pri_print_flg, value);
	}

	/**
	 * 納品書対象外ＦＬＧ. Not for elivery note flg..<p>
	 *
	 */
	public boolean dlv_slip_invalid_flg() {
		return getConstBoolean(offset + 89, $dlv_slip_invalid_flg);
	}

	/**
	 * 納品書対象外ＦＬＧ. Not for elivery note flg..<p>
	 *
	 */
	public void dlv_slip_invalid_flg(boolean value) {
		setConstBoolean(offset + 89, $dlv_slip_invalid_flg, value);
	}

	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 90, $pay_crryovr_times);
	}

	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 90, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 90, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 90, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 90, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 90, $pay_crryovr_times, value);
	}
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 91, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 91, $slo_no, value);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 92, $slo_d_no);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 92, $slo_d_no, value);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 93, $io_schd_pr_no);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 93, $io_schd_pr_no, value);
	}

	/**
	 * 負担品目ＣＤ. Charged item cd..<p>
	 *
	 */
	public String bd_itm_cd() {
		return getConstString(offset + 94, $bd_itm_cd);
	}

	/**
	 * 負担品目ＣＤ. Charged item cd..<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		setConstString(offset + 94, $bd_itm_cd, value);
	}

	/**
	 * 負担枝番１. Charged branch No. 1.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return getConstString(offset + 95, $bd_itm_sub1);
	}

	/**
	 * 負担枝番１. Charged branch No. 1.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		setConstString(offset + 95, $bd_itm_sub1, value);
	}

	/**
	 * 負担枝番２. Charged branch No. 2.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return getConstString(offset + 96, $bd_itm_sub2);
	}

	/**
	 * 負担枝番２. Charged branch No. 2.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		setConstString(offset + 96, $bd_itm_sub2, value);
	}

	/**
	 * 負担枝番３. Charged branch No. 3.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return getConstString(offset + 97, $bd_itm_sub3);
	}

	/**
	 * 負担枝番３. Charged branch No. 3.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		setConstString(offset + 97, $bd_itm_sub3, value);
	}

	/**
	 * 負担手配ＮＯ１. Charged SEIBAN No. 1.<p>
	 *
	 */
	public String bd_sno1() {
		return getConstString(offset + 98, $bd_sno1);
	}

	/**
	 * 負担手配ＮＯ１. Charged SEIBAN No. 1.<p>
	 *
	 */
	public void bd_sno1(String value) {
		setConstString(offset + 98, $bd_sno1, value);
	}

	/**
	 * 負担手配ＮＯ２. Charged SEIBAN No. 2.<p>
	 *
	 */
	public String bd_sno2() {
		return getConstString(offset + 99, $bd_sno2);
	}

	/**
	 * 負担手配ＮＯ２. Charged SEIBAN No. 2.<p>
	 *
	 */
	public void bd_sno2(String value) {
		setConstString(offset + 99, $bd_sno2, value);
	}

	/**
	 * 負担手配ＮＯ３. Charged SEIBAN No. 3.<p>
	 *
	 */
	public String bd_sno3() {
		return getConstString(offset + 100, $bd_sno3);
	}

	/**
	 * 負担手配ＮＯ３. Charged SEIBAN No. 3.<p>
	 *
	 */
	public void bd_sno3(String value) {
		setConstString(offset + 100, $bd_sno3, value);
	}

	/**
	 * 負担手配ＮＯ４. Charged SEIBAN No. 4.<p>
	 *
	 */
	public String bd_sno4() {
		return getConstString(offset + 101, $bd_sno4);
	}

	/**
	 * 負担手配ＮＯ４. Charged SEIBAN No. 4.<p>
	 *
	 */
	public void bd_sno4(String value) {
		setConstString(offset + 101, $bd_sno4, value);
	}

	/**
	 * 負担場所ＣＤ. Charged location cd..<p>
	 *
	 */
	public String bd_loc_cd() {
		return getConstString(offset + 102, $bd_loc_cd);
	}

	/**
	 * 負担場所ＣＤ. Charged location cd..<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		setConstString(offset + 102, $bd_loc_cd, value);
	}

	/**
	 * 負担ロットＮＯ. Charged lot No..<p>
	 *
	 */
	public String bd_lot_no() {
		return getConstString(offset + 103, $bd_lot_no);
	}

	/**
	 * 負担ロットＮＯ. Charged lot No..<p>
	 *
	 */
	public void bd_lot_no(String value) {
		setConstString(offset + 103, $bd_lot_no, value);
	}

	/**
	 * 負担サブロットＮＯ. Charged sublot No..<p>
	 *
	 */
	public String bd_sublot_no() {
		return getConstString(offset + 104, $bd_sublot_no);
	}

	/**
	 * 負担サブロットＮＯ. Charged sublot No..<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		setConstString(offset + 104, $bd_sublot_no, value);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 105, $bd_dpt_cd);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 105, $bd_dpt_cd, value);
	}

	/**
	 * 負担ＷＧ ＣＤ. Charged WG cd..<p>
	 *
	 */
	public String bd_wg_cd() {
		return getConstString(offset + 106, $bd_wg_cd);
	}

	/**
	 * 負担ＷＧ ＣＤ. Charged WG cd..<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		setConstString(offset + 106, $bd_wg_cd, value);
	}

	/**
	 * 負担品群ＣＤ. Charged item category cd..<p>
	 *
	 */
	public String bd_ctg_cd() {
		return getConstString(offset + 107, $bd_ctg_cd);
	}

	/**
	 * 負担品群ＣＤ. Charged item category cd..<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		setConstString(offset + 107, $bd_ctg_cd, value);
	}

	/**
	 * 負担工程ＣＤ. Charged operation cd..<p>
	 *
	 */
	public String bd_oper_cd() {
		return getConstString(offset + 108, $bd_oper_cd);
	}

	/**
	 * 負担工程ＣＤ. Charged operation cd..<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		setConstString(offset + 108, $bd_oper_cd, value);
	}

	/**
	 * 負担受注ＮＯ. Charged sales No..<p>
	 *
	 */
	public String bd_slo_no() {
		return getConstString(offset + 109, $bd_slo_no);
	}

	/**
	 * 負担受注ＮＯ. Charged sales No..<p>
	 *
	 */
	public void bd_slo_no(String value) {
		setConstString(offset + 109, $bd_slo_no, value);
	}

	/**
	 * 負担インボイスＮＯ. Charged invoice No..<p>
	 *
	 */
	public String bd_iv_no() {
		return getConstString(offset + 110, $bd_iv_no);
	}

	/**
	 * 負担インボイスＮＯ. Charged invoice No..<p>
	 *
	 */
	public void bd_iv_no(String value) {
		setConstString(offset + 110, $bd_iv_no, value);
	}

	/**
	 * 負担発注ＮＯ. Charged PO No..<p>
	 *
	 */
	public String bd_po_no() {
		return getConstString(offset + 111, $bd_po_no);
	}

	/**
	 * 負担発注ＮＯ. Charged PO No..<p>
	 *
	 */
	public void bd_po_no(String value) {
		setConstString(offset + 111, $bd_po_no, value);
	}

	/**
	 * 負担取引先ＣＤ. Charged BP cd..<p>
	 *
	 */
	public String bd_bp_cd() {
		return getConstString(offset + 112, $bd_bp_cd);
	}

	/**
	 * 負担取引先ＣＤ. Charged BP cd..<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		setConstString(offset + 112, $bd_bp_cd, value);
	}

	/**
	 * 外部発注明細ＮＯ. External PO details No..<p>
	 *
	 */
	public String ext_po_d_no() {
		return getConstString(offset + 113, $ext_po_d_no);
	}

	/**
	 * 外部発注明細ＮＯ. External PO details No..<p>
	 *
	 */
	public void ext_po_d_no(String value) {
		setConstString(offset + 113, $ext_po_d_no, value);
	}

	/**
	 * 内部明細備考. Internal details remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 114, $intr_rmrks);
	}

	/**
	 * 内部明細備考. Internal details remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 114, $intr_rmrks, value);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 115, $trd_d_rmrks);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 115, $trd_d_rmrks, value);
	}

	/**
	 * 注文書明細備考. PO sheet details remarks.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return getConstString(offset + 116, $po_print_d_rmrks);
	}

	/**
	 * 注文書明細備考. PO sheet details remarks.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		setConstString(offset + 116, $po_print_d_rmrks, value);
	}

	/**
	 * 納品書明細備考. Delivery note details remarks.<p>
	 *
	 */
	public String dlv_slip_d_rmrks() {
		return getConstString(offset + 117, $dlv_slip_d_rmrks);
	}

	/**
	 * 納品書明細備考. Delivery note details remarks.<p>
	 *
	 */
	public void dlv_slip_d_rmrks(String value) {
		setConstString(offset + 117, $dlv_slip_d_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 118, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 118, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 119, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 119, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 120, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 120, $sub_char3, value);
	}

	/**
	 * 紐切れＦＬＧ. Unpegged flg..<p>
	 *
	 */
	public boolean rqst_can_flg() {
		return getConstBoolean(offset + 121, $rqst_can_flg);
	}

	/**
	 * 紐切れＦＬＧ. Unpegged flg..<p>
	 *
	 */
	public void rqst_can_flg(boolean value) {
		setConstBoolean(offset + 121, $rqst_can_flg, value);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 122, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 122, $can_flg, value);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目１. EDI details spare CHAR column 1.<p>
	 *
	 */
	public String edi_sub_d_char1() {
		return getConstString(offset + 123, $edi_sub_d_char1);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目１. EDI details spare CHAR column 1.<p>
	 *
	 */
	public void edi_sub_d_char1(String value) {
		setConstString(offset + 123, $edi_sub_d_char1, value);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目２. EDI details spare CHAR column 2.<p>
	 *
	 */
	public String edi_sub_d_char2() {
		return getConstString(offset + 124, $edi_sub_d_char2);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目２. EDI details spare CHAR column 2.<p>
	 *
	 */
	public void edi_sub_d_char2(String value) {
		setConstString(offset + 124, $edi_sub_d_char2, value);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目３. EDI details spare CHAR column 3.<p>
	 *
	 */
	public String edi_sub_d_char3() {
		return getConstString(offset + 125, $edi_sub_d_char3);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目３. EDI details spare CHAR column 3.<p>
	 *
	 */
	public void edi_sub_d_char3(String value) {
		setConstString(offset + 125, $edi_sub_d_char3, value);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目４. EDI details spare CHAR column 4.<p>
	 *
	 */
	public String edi_sub_d_char4() {
		return getConstString(offset + 126, $edi_sub_d_char4);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目４. EDI details spare CHAR column 4.<p>
	 *
	 */
	public void edi_sub_d_char4(String value) {
		setConstString(offset + 126, $edi_sub_d_char4, value);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目５. EDI details spare CHAR column 5.<p>
	 *
	 */
	public String edi_sub_d_char5() {
		return getConstString(offset + 127, $edi_sub_d_char5);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目５. EDI details spare CHAR column 5.<p>
	 *
	 */
	public void edi_sub_d_char5(String value) {
		setConstString(offset + 127, $edi_sub_d_char5, value);
	}

	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public MCNumber edi_sub_d_num1() {
		return getConstNumber(offset + 128, $edi_sub_d_num1);
	}

	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_d_num1(MCNumber value) {
		setConstNumber(offset + 128, $edi_sub_d_num1, value);
	}
	
	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_d_num1(int value) {
		setConstNumber(offset + 128, $edi_sub_d_num1, value);
	}
	
	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_d_num1(long value) {
		setConstNumber(offset + 128, $edi_sub_d_num1, value);
	}
	
	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_d_num1(float value) {
		setConstNumber(offset + 128, $edi_sub_d_num1, value);
	}
	
	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_d_num1(double value) {
		setConstNumber(offset + 128, $edi_sub_d_num1, value);
	}
	
	/**
	 * ＥＤＩ明細予備ＤＡＴＥ項目１. EDI details spare DATE column 1.<p>
	 *
	 */
	public MCDate edi_sub_d_dt1() {
		return getConstDate(offset + 129, $edi_sub_d_dt1);
	}

	/**
	 * ＥＤＩ明細予備ＤＡＴＥ項目１. EDI details spare DATE column 1.<p>
	 *
	 */
	public void edi_sub_d_dt1(MCDate value) {
		setConstDate(offset + 129, $edi_sub_d_dt1, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 130, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 130, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 131, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 131, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 132, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 132, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 133, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 133, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 134, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 135, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 135, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 136, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 136, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 137, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 137, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 138, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 138, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 139, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 139, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
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
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
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
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			return outsrc_itm_ord_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			return bd_itm_cd();
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			return bd_itm_sub1();
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			return bd_itm_sub2();
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			return bd_itm_sub3();
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			return bd_sno1();
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			return bd_sno2();
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			return bd_sno3();
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			return bd_sno4();
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			return bd_loc_cd();
		}
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			return bd_lot_no();
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			return bd_sublot_no();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			return bd_ctg_cd();
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			return bd_oper_cd();
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			return bd_slo_no();
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			return bd_iv_no();
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			return bd_po_no();
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			return ext_po_d_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
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
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri();
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
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
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
		}
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_avl_rqst_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($po_conf_rcpt_dt.equalsIgnoreCase(name)) {
			return po_conf_rcpt_dt();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			return bndl_flg();
		}
		if ($rqst_slo_flg.equalsIgnoreCase(name)) {
			return rqst_slo_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			return schd_chg_flg();
		}
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			return po_conf_rcpt_flg();
		}
		if ($pri_print_flg.equalsIgnoreCase(name)) {
			return pri_print_flg();
		}
		if ($dlv_slip_invalid_flg.equalsIgnoreCase(name)) {
			return dlv_slip_invalid_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
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
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
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
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			return outsrc_itm_ord_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			return bd_itm_cd();
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			return bd_itm_sub1();
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			return bd_itm_sub2();
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			return bd_itm_sub3();
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			return bd_sno1();
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			return bd_sno2();
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			return bd_sno3();
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			return bd_sno4();
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			return bd_loc_cd();
		}
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			return bd_lot_no();
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			return bd_sublot_no();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			return bd_ctg_cd();
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			return bd_oper_cd();
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			return bd_slo_no();
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			return bd_iv_no();
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			return bd_po_no();
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			return ext_po_d_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
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
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri();
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
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
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
		}
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_avl_rqst_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($po_conf_rcpt_dt.equalsIgnoreCase(name)) {
			return po_conf_rcpt_dt();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			return bndl_flg();
		}
		if ($rqst_slo_flg.equalsIgnoreCase(name)) {
			return rqst_slo_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			return schd_chg_flg();
		}
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			return po_conf_rcpt_flg();
		}
		if ($pri_print_flg.equalsIgnoreCase(name)) {
			return pri_print_flg();
		}
		if ($dlv_slip_invalid_flg.equalsIgnoreCase(name)) {
			return dlv_slip_invalid_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			purc_rsn_cd(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
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
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
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
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
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
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			outsrc_itm_ord_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			bd_itm_cd(value);
			return;
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			bd_itm_sub1(value);
			return;
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			bd_itm_sub2(value);
			return;
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			bd_itm_sub3(value);
			return;
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			bd_sno1(value);
			return;
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			bd_sno2(value);
			return;
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			bd_sno3(value);
			return;
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			bd_sno4(value);
			return;
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			bd_loc_cd(value);
			return;
		}
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			bd_lot_no(value);
			return;
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			bd_sublot_no(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			bd_wg_cd(value);
			return;
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			bd_ctg_cd(value);
			return;
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			bd_oper_cd(value);
			return;
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			bd_slo_no(value);
			return;
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			bd_iv_no(value);
			return;
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			bd_po_no(value);
			return;
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			ext_po_d_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
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
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm(value);
			return;
		}
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			rqst_avl_rqst_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($po_conf_rcpt_dt.equalsIgnoreCase(name)) {
			po_conf_rcpt_dt(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			bndl_flg(value);
			return;
		}
		if ($rqst_slo_flg.equalsIgnoreCase(name)) {
			rqst_slo_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			schd_chg_flg(value);
			return;
		}
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			po_conf_rcpt_flg(value);
			return;
		}
		if ($pri_print_flg.equalsIgnoreCase(name)) {
			pri_print_flg(value);
			return;
		}
		if ($dlv_slip_invalid_flg.equalsIgnoreCase(name)) {
			dlv_slip_invalid_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			purc_rsn_cd(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
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
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
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
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
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
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			outsrc_itm_ord_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			bd_itm_cd(value);
			return;
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			bd_itm_sub1(value);
			return;
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			bd_itm_sub2(value);
			return;
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			bd_itm_sub3(value);
			return;
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			bd_sno1(value);
			return;
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			bd_sno2(value);
			return;
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			bd_sno3(value);
			return;
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			bd_sno4(value);
			return;
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			bd_loc_cd(value);
			return;
		}
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			bd_lot_no(value);
			return;
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			bd_sublot_no(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			bd_wg_cd(value);
			return;
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			bd_ctg_cd(value);
			return;
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			bd_oper_cd(value);
			return;
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			bd_slo_no(value);
			return;
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			bd_iv_no(value);
			return;
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			bd_po_no(value);
			return;
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			ext_po_d_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
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
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
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
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm(value);
			return;
		}
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			rqst_avl_rqst_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($po_conf_rcpt_dt.equalsIgnoreCase(name)) {
			po_conf_rcpt_dt(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			bndl_flg(value);
			return;
		}
		if ($rqst_slo_flg.equalsIgnoreCase(name)) {
			rqst_slo_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			schd_chg_flg(value);
			return;
		}
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			po_conf_rcpt_flg(value);
			return;
		}
		if ($pri_print_flg.equalsIgnoreCase(name)) {
			pri_print_flg(value);
			return;
		}
		if ($dlv_slip_invalid_flg.equalsIgnoreCase(name)) {
			dlv_slip_invalid_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
