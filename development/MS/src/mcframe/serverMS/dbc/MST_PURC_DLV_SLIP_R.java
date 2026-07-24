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
 * "購買納品伝票ヘッダ // Purchase delivery slip header"DBコンテナRowクラスです。<p>
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
 *  	<td>dlv_slip_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書管理ＮＯ</td>
 *  	<td>Delivery note management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>dlv_slip_mng_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書管理連番</td>
 *  	<td>Delivery note management sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書ＮＯ</td>
 *  	<td>Delivery note No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_slip_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書連番</td>
 *  	<td>Delivery note sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_slip_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書改訂番号</td>
 *  	<td>Delivery note rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slip_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票状況区分</td>
 *  	<td>Slip status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注ＮＯ</td>
 *  	<td>PO No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注改訂番号</td>
 *  	<td>PO rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>last_po_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最新発注改訂番号</td>
 *  	<td>Latest PO rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_grp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示ＧＮＯ</td>
 *  	<td>Delivery order G No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prms_rcpt_grp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納期回答受領ＧＮＯ</td>
 *  	<td>Order promising result received G No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dlv_slip_src_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買納品書作成元区分</td>
 *  	<td>Purchase delivery note creating source type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入希望日時</td>
 *  	<td>Desired delivery date and time</td>
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
 *  	<td>trd_cur_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨名</td>
 *  	<td>Transaction currency name</td>
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
 *  	<td>base_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨金額</td>
 *  	<td>Amount (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨税額</td>
 *  	<td>Tax amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_dscnt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨値引額</td>
 *  	<td>Discount amount (Base currency)</td>
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
 *  	<td>ptax_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税為替レート</td>
 *  	<td>Taxpaying exchange rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slip_line_max</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票行数最大値</td>
 *  	<td>Slip rows max number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷場所ＣＤ</td>
 *  	<td>Receipt location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷場所名</td>
 *  	<td>Receipt location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_loc_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷場所郵便番号</td>
 *  	<td>Receipt location zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_loc_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷場所住所１</td>
 *  	<td>Receipt location address 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_loc_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷場所住所２</td>
 *  	<td>Receipt location address 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_loc_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷場所住所３</td>
 *  	<td>Receipt location address 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_loc_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷場所住所４</td>
 *  	<td>Receipt location address 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先部署</td>
 *  	<td>BP dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先担当者</td>
 *  	<td>BP PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_loc_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷場所ＴＥＬ</td>
 *  	<td>Receipt location TEL</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_loc_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷場所ＦＡＸ</td>
 *  	<td>Receipt location FAX</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先識別区分</td>
 *  	<td>Supplier identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先識別ＣＤ</td>
 *  	<td>Supplier identification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_id_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先識別名</td>
 *  	<td>Supplier identification name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous supplier flg.</td>
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
 *  	<td>sppl_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先部署</td>
 *  	<td>Supplier dept.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先担当者</td>
 *  	<td>Supplier PIC</td>
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
 *  	<td>slip_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票発行済ＦＬＧ</td>
 *  	<td>Slip issued flg.</td>
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
public class MST_PURC_DLV_SLIP_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PURC_DLV_SLIP";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 納品書管理ＮＯ. Delivery note management No..<p>
	 *
	 */
	public static final String $dlv_slip_mng_no = "dlv_slip_mng_no";
	private static final MCPermColumnInfo _dlv_slip_mng_no = createColumnInfo("dlv_slip_mng_no");
	public final MCStringPermColumn dlv_slip_mng_no = createStringColumn(_dlv_slip_mng_no);
	
	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public static final String $dlv_slip_mng_seq = "dlv_slip_mng_seq";
	private static final MCPermColumnInfo _dlv_slip_mng_seq = createColumnInfo("dlv_slip_mng_seq");
	public final MCNumberPermColumn dlv_slip_mng_seq = createNumberColumn(_dlv_slip_mng_seq);
	
	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	private static final MCPermColumnInfo _dlv_slip_no = createColumnInfo("dlv_slip_no");
	public final MCStringPermColumn dlv_slip_no = createStringColumn(_dlv_slip_no);
	
	/**
	 * 納品書連番. Delivery note sequence number.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	private static final MCPermColumnInfo _dlv_slip_seq = createColumnInfo("dlv_slip_seq");
	public final MCNumberPermColumn dlv_slip_seq = createNumberColumn(_dlv_slip_seq);
	
	/**
	 * 納品書改訂番号. Delivery note rev. number.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";
	private static final MCPermColumnInfo _dlv_slip_rev = createColumnInfo("dlv_slip_rev");
	public final MCNumberPermColumn dlv_slip_rev = createNumberColumn(_dlv_slip_rev);
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	private static final MCPermColumnInfo _slip_sts_typ = createColumnInfo("slip_sts_typ");
	public final MCStringPermColumn slip_sts_typ = createStringColumn(_slip_sts_typ);
	
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
	 * 最新発注改訂番号. Latest PO rev. number.<p>
	 *
	 */
	public static final String $last_po_rev = "last_po_rev";
	private static final MCPermColumnInfo _last_po_rev = createColumnInfo("last_po_rev");
	public final MCNumberPermColumn last_po_rev = createNumberColumn(_last_po_rev);
	
	/**
	 * 納入指示ＧＮＯ. Delivery order G No..<p>
	 *
	 */
	public static final String $dlv_inst_grp_no = "dlv_inst_grp_no";
	private static final MCPermColumnInfo _dlv_inst_grp_no = createColumnInfo("dlv_inst_grp_no");
	public final MCStringPermColumn dlv_inst_grp_no = createStringColumn(_dlv_inst_grp_no);
	
	/**
	 * 納期回答受領ＧＮＯ. Order promising result received G No..<p>
	 *
	 */
	public static final String $prms_rcpt_grp_no = "prms_rcpt_grp_no";
	private static final MCPermColumnInfo _prms_rcpt_grp_no = createColumnInfo("prms_rcpt_grp_no");
	public final MCStringPermColumn prms_rcpt_grp_no = createStringColumn(_prms_rcpt_grp_no);
	
	/**
	 * 購買納品書作成元区分. Purchase delivery note creating source type.<p>
	 *
	 */
	public static final String $purc_dlv_slip_src_typ = "purc_dlv_slip_src_typ";
	private static final MCPermColumnInfo _purc_dlv_slip_src_typ = createColumnInfo("purc_dlv_slip_src_typ");
	public final MCStringPermColumn purc_dlv_slip_src_typ = createStringColumn(_purc_dlv_slip_src_typ);
	
	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	private static final MCPermColumnInfo _usr_cd = createColumnInfo("usr_cd");
	public final MCStringPermColumn usr_cd = createStringColumn(_usr_cd);
	
	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	private static final MCPermColumnInfo _dlv_rqst_tm = createColumnInfo("dlv_rqst_tm");
	public final MCDatePermColumn dlv_rqst_tm = createDateColumn(_dlv_rqst_tm);
	
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
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	private static final MCPermColumnInfo _trd_cur_nm = createColumnInfo("trd_cur_nm");
	public final MCStringPermColumn trd_cur_nm = createStringColumn(_trd_cur_nm);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
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
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	private static final MCPermColumnInfo _base_cur_amt = createColumnInfo("base_cur_amt");
	public final MCNumberPermColumn base_cur_amt = createNumberColumn(_base_cur_amt);
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	private static final MCPermColumnInfo _base_cur_tax_amt = createColumnInfo("base_cur_tax_amt");
	public final MCNumberPermColumn base_cur_tax_amt = createNumberColumn(_base_cur_tax_amt);
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_dscnt_amt = "base_cur_dscnt_amt";
	private static final MCPermColumnInfo _base_cur_dscnt_amt = createColumnInfo("base_cur_dscnt_amt");
	public final MCNumberPermColumn base_cur_dscnt_amt = createNumberColumn(_base_cur_dscnt_amt);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	private static final MCPermColumnInfo _ptax_xrate = createColumnInfo("ptax_xrate");
	public final MCNumberPermColumn ptax_xrate = createNumberColumn(_ptax_xrate);
	
	/**
	 * 伝票行数最大値. Slip rows max number.<p>
	 *
	 */
	public static final String $slip_line_max = "slip_line_max";
	private static final MCPermColumnInfo _slip_line_max = createColumnInfo("slip_line_max");
	public final MCNumberPermColumn slip_line_max = createNumberColumn(_slip_line_max);
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 入荷場所ＣＤ. Receipt location cd..<p>
	 *
	 */
	public static final String $arr_loc_cd = "arr_loc_cd";
	private static final MCPermColumnInfo _arr_loc_cd = createColumnInfo("arr_loc_cd");
	public final MCStringPermColumn arr_loc_cd = createStringColumn(_arr_loc_cd);
	
	/**
	 * 入荷場所名. Receipt location name.<p>
	 *
	 */
	public static final String $arr_loc_nm = "arr_loc_nm";
	private static final MCPermColumnInfo _arr_loc_nm = createColumnInfo("arr_loc_nm");
	public final MCStringPermColumn arr_loc_nm = createStringColumn(_arr_loc_nm);
	
	/**
	 * 入荷場所郵便番号. Receipt location zip code.<p>
	 *
	 */
	public static final String $arr_loc_zip_cd = "arr_loc_zip_cd";
	private static final MCPermColumnInfo _arr_loc_zip_cd = createColumnInfo("arr_loc_zip_cd");
	public final MCStringPermColumn arr_loc_zip_cd = createStringColumn(_arr_loc_zip_cd);
	
	/**
	 * 入荷場所住所１. Receipt location address 1.<p>
	 *
	 */
	public static final String $arr_loc_addr1 = "arr_loc_addr1";
	private static final MCPermColumnInfo _arr_loc_addr1 = createColumnInfo("arr_loc_addr1");
	public final MCStringPermColumn arr_loc_addr1 = createStringColumn(_arr_loc_addr1);
	
	/**
	 * 入荷場所住所２. Receipt location address 2.<p>
	 *
	 */
	public static final String $arr_loc_addr2 = "arr_loc_addr2";
	private static final MCPermColumnInfo _arr_loc_addr2 = createColumnInfo("arr_loc_addr2");
	public final MCStringPermColumn arr_loc_addr2 = createStringColumn(_arr_loc_addr2);
	
	/**
	 * 入荷場所住所３. Receipt location address 3.<p>
	 *
	 */
	public static final String $arr_loc_addr3 = "arr_loc_addr3";
	private static final MCPermColumnInfo _arr_loc_addr3 = createColumnInfo("arr_loc_addr3");
	public final MCStringPermColumn arr_loc_addr3 = createStringColumn(_arr_loc_addr3);
	
	/**
	 * 入荷場所住所４. Receipt location address 4.<p>
	 *
	 */
	public static final String $arr_loc_addr4 = "arr_loc_addr4";
	private static final MCPermColumnInfo _arr_loc_addr4 = createColumnInfo("arr_loc_addr4");
	public final MCStringPermColumn arr_loc_addr4 = createStringColumn(_arr_loc_addr4);
	
	/**
	 * 取引先部署. BP dept..<p>
	 *
	 */
	public static final String $bp_cntct_dpt = "bp_cntct_dpt";
	private static final MCPermColumnInfo _bp_cntct_dpt = createColumnInfo("bp_cntct_dpt");
	public final MCStringPermColumn bp_cntct_dpt = createStringColumn(_bp_cntct_dpt);
	
	/**
	 * 取引先担当者. BP PIC.<p>
	 *
	 */
	public static final String $bp_cntct_psn = "bp_cntct_psn";
	private static final MCPermColumnInfo _bp_cntct_psn = createColumnInfo("bp_cntct_psn");
	public final MCStringPermColumn bp_cntct_psn = createStringColumn(_bp_cntct_psn);
	
	/**
	 * 入荷場所ＴＥＬ. Receipt location TEL.<p>
	 *
	 */
	public static final String $arr_loc_tel = "arr_loc_tel";
	private static final MCPermColumnInfo _arr_loc_tel = createColumnInfo("arr_loc_tel");
	public final MCStringPermColumn arr_loc_tel = createStringColumn(_arr_loc_tel);
	
	/**
	 * 入荷場所ＦＡＸ. Receipt location FAX.<p>
	 *
	 */
	public static final String $arr_loc_fax = "arr_loc_fax";
	private static final MCPermColumnInfo _arr_loc_fax = createColumnInfo("arr_loc_fax");
	public final MCStringPermColumn arr_loc_fax = createStringColumn(_arr_loc_fax);
	
	/**
	 * 発注先識別区分. Supplier identification type.<p>
	 *
	 */
	public static final String $sppl_id_typ = "sppl_id_typ";
	private static final MCPermColumnInfo _sppl_id_typ = createColumnInfo("sppl_id_typ");
	public final MCStringPermColumn sppl_id_typ = createStringColumn(_sppl_id_typ);
	
	/**
	 * 発注先識別ＣＤ. Supplier identification cd..<p>
	 *
	 */
	public static final String $sppl_id_cd = "sppl_id_cd";
	private static final MCPermColumnInfo _sppl_id_cd = createColumnInfo("sppl_id_cd");
	public final MCStringPermColumn sppl_id_cd = createStringColumn(_sppl_id_cd);
	
	/**
	 * 発注先識別名. Supplier identification name.<p>
	 *
	 */
	public static final String $sppl_id_nm = "sppl_id_nm";
	private static final MCPermColumnInfo _sppl_id_nm = createColumnInfo("sppl_id_nm");
	public final MCStringPermColumn sppl_id_nm = createStringColumn(_sppl_id_nm);
	
	/**
	 * 発注先諸口ＦＬＧ. Miscellaneous supplier flg..<p>
	 *
	 */
	public static final String $sppl_sundry_flg = "sppl_sundry_flg";
	private static final MCPermColumnInfo _sppl_sundry_flg = createColumnInfo("sppl_sundry_flg");
	public final MCBooleanPermColumn sppl_sundry_flg = createBooleanColumn(_sppl_sundry_flg);
	
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
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	private static final MCPermColumnInfo _trd_rmrks = createColumnInfo("trd_rmrks");
	public final MCStringPermColumn trd_rmrks = createStringColumn(_trd_rmrks);
	
	/**
	 * 伝票発行済ＦＬＧ. Slip issued flg..<p>
	 *
	 */
	public static final String $slip_prnt_flg = "slip_prnt_flg";
	private static final MCPermColumnInfo _slip_prnt_flg = createColumnInfo("slip_prnt_flg");
	public final MCBooleanPermColumn slip_prnt_flg = createBooleanColumn(_slip_prnt_flg);
	
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
	
	public static final MCMeta dlv_slip_mng_no_META = createCommonMeta($dlv_slip_mng_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_MNG_NO);
	public static final MCMeta dlv_slip_mng_seq_META = createCommonMeta($dlv_slip_mng_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_rev_META = createCommonMeta($po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta last_po_rev_META = createCommonMeta($last_po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_inst_grp_no_META = createCommonMeta($dlv_inst_grp_no, mcframe.commonMS.meta.MS_META.DLV_INST_GRP_NO);
	public static final MCMeta prms_rcpt_grp_no_META = createCommonMeta($prms_rcpt_grp_no, mcframe.commonMS.meta.MS_META.PRMS_RCPT_GRP_NO);
	public static final MCMeta purc_dlv_slip_src_typ_META = createCommonMeta($purc_dlv_slip_src_typ, mcframe.commonMS.meta.MS_META.PURC_DLV_SLIP_SRC_TYP);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slip_line_max_META = createCommonMeta($slip_line_max, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta arr_loc_cd_META = createCommonMeta($arr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta arr_loc_nm_META = createCommonMeta($arr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta arr_loc_zip_cd_META = createCommonMeta($arr_loc_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta arr_loc_addr1_META = createCommonMeta($arr_loc_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta arr_loc_addr2_META = createCommonMeta($arr_loc_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta arr_loc_addr3_META = createCommonMeta($arr_loc_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta arr_loc_addr4_META = createCommonMeta($arr_loc_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bp_cntct_dpt_META = createCommonMeta($bp_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bp_cntct_psn_META = createCommonMeta($bp_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta arr_loc_tel_META = createCommonMeta($arr_loc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta arr_loc_fax_META = createCommonMeta($arr_loc_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sppl_id_typ_META = createCommonMeta($sppl_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta sppl_id_cd_META = createCommonMeta($sppl_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta sppl_id_nm_META = createCommonMeta($sppl_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta sppl_sundry_flg_META = createCommonMeta($sppl_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_zip_cd_META = createCommonMeta($sppl_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta sppl_addr1_META = createCommonMeta($sppl_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr2_META = createCommonMeta($sppl_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr3_META = createCommonMeta($sppl_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr4_META = createCommonMeta($sppl_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta sppl_tel_META = createCommonMeta($sppl_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sppl_fax_META = createCommonMeta($sppl_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta slip_prnt_flg_META = createCommonMeta($slip_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_PURC_DLV_SLIP_R> constMetas = new ConstMetaList<MST_PURC_DLV_SLIP_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			dlv_slip_mng_no_META,
			dlv_slip_mng_seq_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_rev_META,
			slip_sts_typ_META,
			po_no_META,
			po_rev_META,
			last_po_rev_META,
			dlv_inst_grp_no_META,
			prms_rcpt_grp_no_META,
			purc_dlv_slip_src_typ_META,
			dpt_cd_META,
			usr_cd_META,
			dlv_rqst_tm_META,
			trd_cd_META,
			trd_ptn_typ_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			trd_cur_dscnt_amt_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			base_cur_dscnt_amt_META,
			xrate_META,
			ptax_xrate_META,
			slip_line_max_META,
			bp_cd_META,
			arr_loc_cd_META,
			arr_loc_nm_META,
			arr_loc_zip_cd_META,
			arr_loc_addr1_META,
			arr_loc_addr2_META,
			arr_loc_addr3_META,
			arr_loc_addr4_META,
			bp_cntct_dpt_META,
			bp_cntct_psn_META,
			arr_loc_tel_META,
			arr_loc_fax_META,
			sppl_id_typ_META,
			sppl_id_cd_META,
			sppl_id_nm_META,
			sppl_sundry_flg_META,
			sppl_zip_cd_META,
			sppl_addr1_META,
			sppl_addr2_META,
			sppl_addr3_META,
			sppl_addr4_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_tel_META,
			sppl_fax_META,
			wg_cd_META,
			trd_rmrks_META,
			slip_prnt_flg_META,
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
	protected MST_PURC_DLV_SLIP_R(ConstMetaList<? extends MST_PURC_DLV_SLIP_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PURC_DLV_SLIP_R(ConstMetaList<? extends MST_PURC_DLV_SLIP_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$dlv_slip_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$dlv_slip_mng_no,
				"dlv_slip_mng_no",
				dlv_slip_mng_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$dlv_slip_mng_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$dlv_slip_mng_seq,
				"dlv_slip_mng_seq",
				dlv_slip_mng_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$dlv_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$dlv_slip_no,
				"dlv_slip_no",
				dlv_slip_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$dlv_slip_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$dlv_slip_seq,
				"dlv_slip_seq",
				dlv_slip_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$dlv_slip_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$dlv_slip_rev,
				"dlv_slip_rev",
				dlv_slip_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$slip_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$slip_sts_typ,
				"slip_sts_typ",
				slip_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$po_no,
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
			MST_PURC_DLV_SLIP_R.$po_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$po_rev,
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
			MST_PURC_DLV_SLIP_R.$last_po_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$last_po_rev,
				"last_po_rev",
				last_po_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$dlv_inst_grp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$dlv_inst_grp_no,
				"dlv_inst_grp_no",
				dlv_inst_grp_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$prms_rcpt_grp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$prms_rcpt_grp_no,
				"prms_rcpt_grp_no",
				prms_rcpt_grp_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$purc_dlv_slip_src_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$purc_dlv_slip_src_typ,
				"purc_dlv_slip_src_typ",
				purc_dlv_slip_src_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$dpt_cd,
				"dpt_cd",
				dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$usr_cd,
				"usr_cd",
				usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_DLV_SLIP_R.$dlv_rqst_tm,
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
			MST_PURC_DLV_SLIP_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$trd_cd,
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
			MST_PURC_DLV_SLIP_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$trd_ptn_typ,
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
			MST_PURC_DLV_SLIP_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$trd_cur_cd,
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
			MST_PURC_DLV_SLIP_R.$trd_cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$trd_cur_nm,
				"trd_cur_nm",
				trd_cur_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$trd_cur_amt,
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
			MST_PURC_DLV_SLIP_R.$trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$trd_cur_tax_amt,
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
			MST_PURC_DLV_SLIP_R.$trd_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$trd_cur_dscnt_amt,
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
			MST_PURC_DLV_SLIP_R.$base_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$base_cur_amt,
				"base_cur_amt",
				base_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$base_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$base_cur_tax_amt,
				"base_cur_tax_amt",
				base_cur_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$base_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$base_cur_dscnt_amt,
				"base_cur_dscnt_amt",
				base_cur_dscnt_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$xrate,
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
			MST_PURC_DLV_SLIP_R.$ptax_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$ptax_xrate,
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
			MST_PURC_DLV_SLIP_R.$slip_line_max,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$slip_line_max,
				"slip_line_max",
				slip_line_max,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$bp_cd,
				"bp_cd",
				bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$arr_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$arr_loc_cd,
				"arr_loc_cd",
				arr_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$arr_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$arr_loc_nm,
				"arr_loc_nm",
				arr_loc_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$arr_loc_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$arr_loc_zip_cd,
				"arr_loc_zip_cd",
				arr_loc_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$arr_loc_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$arr_loc_addr1,
				"arr_loc_addr1",
				arr_loc_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$arr_loc_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$arr_loc_addr2,
				"arr_loc_addr2",
				arr_loc_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$arr_loc_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$arr_loc_addr3,
				"arr_loc_addr3",
				arr_loc_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$arr_loc_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$arr_loc_addr4,
				"arr_loc_addr4",
				arr_loc_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$bp_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$bp_cntct_dpt,
				"bp_cntct_dpt",
				bp_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$bp_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$bp_cntct_psn,
				"bp_cntct_psn",
				bp_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$arr_loc_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$arr_loc_tel,
				"arr_loc_tel",
				arr_loc_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$arr_loc_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$arr_loc_fax,
				"arr_loc_fax",
				arr_loc_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$sppl_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_id_typ,
				"sppl_id_typ",
				sppl_id_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$sppl_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_id_cd,
				"sppl_id_cd",
				sppl_id_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$sppl_id_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_id_nm,
				"sppl_id_nm",
				sppl_id_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$sppl_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_DLV_SLIP_R.$sppl_sundry_flg,
				"sppl_sundry_flg",
				sppl_sundry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$sppl_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_zip_cd,
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
			MST_PURC_DLV_SLIP_R.$sppl_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_addr1,
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
			MST_PURC_DLV_SLIP_R.$sppl_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_addr2,
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
			MST_PURC_DLV_SLIP_R.$sppl_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_addr3,
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
			MST_PURC_DLV_SLIP_R.$sppl_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_addr4,
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
			MST_PURC_DLV_SLIP_R.$sppl_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_cntct_dpt,
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
			MST_PURC_DLV_SLIP_R.$sppl_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_cntct_psn,
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
			MST_PURC_DLV_SLIP_R.$sppl_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_tel,
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
			MST_PURC_DLV_SLIP_R.$sppl_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sppl_fax,
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
			MST_PURC_DLV_SLIP_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$wg_cd,
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
			MST_PURC_DLV_SLIP_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$trd_rmrks,
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
			MST_PURC_DLV_SLIP_R.$slip_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_DLV_SLIP_R.$slip_prnt_flg,
				"slip_prnt_flg",
				slip_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_DLV_SLIP_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sub_char1,
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
			MST_PURC_DLV_SLIP_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sub_char2,
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
			MST_PURC_DLV_SLIP_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$sub_char3,
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
			MST_PURC_DLV_SLIP_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$ins_usr_id,
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
			MST_PURC_DLV_SLIP_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$ins_usr_nm,
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
			MST_PURC_DLV_SLIP_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PURC_DLV_SLIP_R.$ins_ts,
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
			MST_PURC_DLV_SLIP_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$ins_func_id,
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
			MST_PURC_DLV_SLIP_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_DLV_SLIP_R.$upd_cntr,
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
			MST_PURC_DLV_SLIP_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$upd_usr_id,
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
			MST_PURC_DLV_SLIP_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$upd_usr_nm,
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
			MST_PURC_DLV_SLIP_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PURC_DLV_SLIP_R.$upd_ts,
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
			MST_PURC_DLV_SLIP_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$upd_func_id,
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
			MST_PURC_DLV_SLIP_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_DLV_SLIP_R.$upd_srv_req_no,
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
	public static MST_PURC_DLV_SLIP_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PURC_DLV_SLIP_R create(String alias) {
		MST_PURC_DLV_SLIP_R row = new MST_PURC_DLV_SLIP_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PURC_DLV_SLIP_R createByName(T proto) {
		MST_PURC_DLV_SLIP_R row = MST_PURC_DLV_SLIP_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_DLV_SLIP_R clone() {
		return (MST_PURC_DLV_SLIP_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_DLV_SLIP_R createInstance() {
		return (MST_PURC_DLV_SLIP_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_DLV_SLIP_R getValues(String... names) {
		return (MST_PURC_DLV_SLIP_R) super.getValues(names);
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
	 public MSW_PURC_DLV_SLIP_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PURC_DLV_SLIP_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PURC_DLV_SLIP_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PURC_DLV_SLIP_KEY_R.TABLE_NAME);
	 }

	/**
	 * 納品書管理ＮＯ. Delivery note management No..<p>
	 *
	 */
	public String dlv_slip_mng_no() {
		return getConstString(offset + 0, $dlv_slip_mng_no);
	}

	/**
	 * 納品書管理ＮＯ. Delivery note management No..<p>
	 *
	 */
	public void dlv_slip_mng_no(String value) {
		setConstString(offset + 0, $dlv_slip_mng_no, value);
	}

	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_seq() {
		return getConstNumber(offset + 1, $dlv_slip_mng_seq);
	}

	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_seq(MCNumber value) {
		setConstNumber(offset + 1, $dlv_slip_mng_seq, value);
	}
	
	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_seq(int value) {
		setConstNumber(offset + 1, $dlv_slip_mng_seq, value);
	}
	
	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_seq(long value) {
		setConstNumber(offset + 1, $dlv_slip_mng_seq, value);
	}
	
	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_seq(float value) {
		setConstNumber(offset + 1, $dlv_slip_mng_seq, value);
	}
	
	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_seq(double value) {
		setConstNumber(offset + 1, $dlv_slip_mng_seq, value);
	}
	
	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 2, $dlv_slip_no);
	}

	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 2, $dlv_slip_no, value);
	}

	/**
	 * 納品書連番. Delivery note sequence number.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 3, $dlv_slip_seq);
	}

	/**
	 * 納品書連番. Delivery note sequence number.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 3, $dlv_slip_seq, value);
	}
	
	/**
	 * 納品書連番. Delivery note sequence number.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 3, $dlv_slip_seq, value);
	}
	
	/**
	 * 納品書連番. Delivery note sequence number.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 3, $dlv_slip_seq, value);
	}
	
	/**
	 * 納品書連番. Delivery note sequence number.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 3, $dlv_slip_seq, value);
	}
	
	/**
	 * 納品書連番. Delivery note sequence number.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 3, $dlv_slip_seq, value);
	}
	
	/**
	 * 納品書改訂番号. Delivery note rev. number.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 4, $dlv_slip_rev);
	}

	/**
	 * 納品書改訂番号. Delivery note rev. number.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 4, $dlv_slip_rev, value);
	}
	
	/**
	 * 納品書改訂番号. Delivery note rev. number.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 4, $dlv_slip_rev, value);
	}
	
	/**
	 * 納品書改訂番号. Delivery note rev. number.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 4, $dlv_slip_rev, value);
	}
	
	/**
	 * 納品書改訂番号. Delivery note rev. number.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 4, $dlv_slip_rev, value);
	}
	
	/**
	 * 納品書改訂番号. Delivery note rev. number.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 4, $dlv_slip_rev, value);
	}
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 5, $slip_sts_typ);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 5, $slip_sts_typ, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 6, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 6, $po_no, value);
	}

	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public MCNumber po_rev() {
		return getConstNumber(offset + 7, $po_rev);
	}

	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		setConstNumber(offset + 7, $po_rev, value);
	}
	
	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public void po_rev(int value) {
		setConstNumber(offset + 7, $po_rev, value);
	}
	
	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public void po_rev(long value) {
		setConstNumber(offset + 7, $po_rev, value);
	}
	
	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public void po_rev(float value) {
		setConstNumber(offset + 7, $po_rev, value);
	}
	
	/**
	 * 発注改訂番号. PO rev. number.<p>
	 *
	 */
	public void po_rev(double value) {
		setConstNumber(offset + 7, $po_rev, value);
	}
	
	/**
	 * 最新発注改訂番号. Latest PO rev. number.<p>
	 *
	 */
	public MCNumber last_po_rev() {
		return getConstNumber(offset + 8, $last_po_rev);
	}

	/**
	 * 最新発注改訂番号. Latest PO rev. number.<p>
	 *
	 */
	public void last_po_rev(MCNumber value) {
		setConstNumber(offset + 8, $last_po_rev, value);
	}
	
	/**
	 * 最新発注改訂番号. Latest PO rev. number.<p>
	 *
	 */
	public void last_po_rev(int value) {
		setConstNumber(offset + 8, $last_po_rev, value);
	}
	
	/**
	 * 最新発注改訂番号. Latest PO rev. number.<p>
	 *
	 */
	public void last_po_rev(long value) {
		setConstNumber(offset + 8, $last_po_rev, value);
	}
	
	/**
	 * 最新発注改訂番号. Latest PO rev. number.<p>
	 *
	 */
	public void last_po_rev(float value) {
		setConstNumber(offset + 8, $last_po_rev, value);
	}
	
	/**
	 * 最新発注改訂番号. Latest PO rev. number.<p>
	 *
	 */
	public void last_po_rev(double value) {
		setConstNumber(offset + 8, $last_po_rev, value);
	}
	
	/**
	 * 納入指示ＧＮＯ. Delivery order G No..<p>
	 *
	 */
	public String dlv_inst_grp_no() {
		return getConstString(offset + 9, $dlv_inst_grp_no);
	}

	/**
	 * 納入指示ＧＮＯ. Delivery order G No..<p>
	 *
	 */
	public void dlv_inst_grp_no(String value) {
		setConstString(offset + 9, $dlv_inst_grp_no, value);
	}

	/**
	 * 納期回答受領ＧＮＯ. Order promising result received G No..<p>
	 *
	 */
	public String prms_rcpt_grp_no() {
		return getConstString(offset + 10, $prms_rcpt_grp_no);
	}

	/**
	 * 納期回答受領ＧＮＯ. Order promising result received G No..<p>
	 *
	 */
	public void prms_rcpt_grp_no(String value) {
		setConstString(offset + 10, $prms_rcpt_grp_no, value);
	}

	/**
	 * 購買納品書作成元区分. Purchase delivery note creating source type.<p>
	 *
	 */
	public String purc_dlv_slip_src_typ() {
		return getConstString(offset + 11, $purc_dlv_slip_src_typ);
	}

	/**
	 * 購買納品書作成元区分. Purchase delivery note creating source type.<p>
	 *
	 */
	public void purc_dlv_slip_src_typ(String value) {
		setConstString(offset + 11, $purc_dlv_slip_src_typ, value);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 12, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 12, $dpt_cd, value);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 13, $usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 13, $usr_cd, value);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 14, $dlv_rqst_tm);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 14, $dlv_rqst_tm, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 15, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 15, $trd_cd, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 16, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 16, $trd_ptn_typ, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 17, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 17, $trd_cur_cd, value);
	}

	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 18, $trd_cur_nm);
	}

	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 18, $trd_cur_nm, value);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 19, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 19, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 19, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 19, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 19, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 19, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 20, $trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 20, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 20, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 20, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 20, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 20, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 21, $trd_cur_dscnt_amt);
	}

	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 21, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 21, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 21, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 21, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 21, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 22, $base_cur_amt);
	}

	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 22, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 22, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 22, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 22, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 22, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 23, $base_cur_tax_amt);
	}

	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 23, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 23, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 23, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 23, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 23, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 24, $base_cur_dscnt_amt);
	}

	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 24, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 24, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 24, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 24, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 24, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 25, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 25, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 25, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 25, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 25, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 25, $xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 26, $ptax_xrate);
	}

	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 26, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 26, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 26, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 26, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 26, $ptax_xrate, value);
	}
	
	/**
	 * 伝票行数最大値. Slip rows max number.<p>
	 *
	 */
	public MCNumber slip_line_max() {
		return getConstNumber(offset + 27, $slip_line_max);
	}

	/**
	 * 伝票行数最大値. Slip rows max number.<p>
	 *
	 */
	public void slip_line_max(MCNumber value) {
		setConstNumber(offset + 27, $slip_line_max, value);
	}
	
	/**
	 * 伝票行数最大値. Slip rows max number.<p>
	 *
	 */
	public void slip_line_max(int value) {
		setConstNumber(offset + 27, $slip_line_max, value);
	}
	
	/**
	 * 伝票行数最大値. Slip rows max number.<p>
	 *
	 */
	public void slip_line_max(long value) {
		setConstNumber(offset + 27, $slip_line_max, value);
	}
	
	/**
	 * 伝票行数最大値. Slip rows max number.<p>
	 *
	 */
	public void slip_line_max(float value) {
		setConstNumber(offset + 27, $slip_line_max, value);
	}
	
	/**
	 * 伝票行数最大値. Slip rows max number.<p>
	 *
	 */
	public void slip_line_max(double value) {
		setConstNumber(offset + 27, $slip_line_max, value);
	}
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 28, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 28, $bp_cd, value);
	}

	/**
	 * 入荷場所ＣＤ. Receipt location cd..<p>
	 *
	 */
	public String arr_loc_cd() {
		return getConstString(offset + 29, $arr_loc_cd);
	}

	/**
	 * 入荷場所ＣＤ. Receipt location cd..<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		setConstString(offset + 29, $arr_loc_cd, value);
	}

	/**
	 * 入荷場所名. Receipt location name.<p>
	 *
	 */
	public String arr_loc_nm() {
		return getConstString(offset + 30, $arr_loc_nm);
	}

	/**
	 * 入荷場所名. Receipt location name.<p>
	 *
	 */
	public void arr_loc_nm(String value) {
		setConstString(offset + 30, $arr_loc_nm, value);
	}

	/**
	 * 入荷場所郵便番号. Receipt location zip code.<p>
	 *
	 */
	public String arr_loc_zip_cd() {
		return getConstString(offset + 31, $arr_loc_zip_cd);
	}

	/**
	 * 入荷場所郵便番号. Receipt location zip code.<p>
	 *
	 */
	public void arr_loc_zip_cd(String value) {
		setConstString(offset + 31, $arr_loc_zip_cd, value);
	}

	/**
	 * 入荷場所住所１. Receipt location address 1.<p>
	 *
	 */
	public String arr_loc_addr1() {
		return getConstString(offset + 32, $arr_loc_addr1);
	}

	/**
	 * 入荷場所住所１. Receipt location address 1.<p>
	 *
	 */
	public void arr_loc_addr1(String value) {
		setConstString(offset + 32, $arr_loc_addr1, value);
	}

	/**
	 * 入荷場所住所２. Receipt location address 2.<p>
	 *
	 */
	public String arr_loc_addr2() {
		return getConstString(offset + 33, $arr_loc_addr2);
	}

	/**
	 * 入荷場所住所２. Receipt location address 2.<p>
	 *
	 */
	public void arr_loc_addr2(String value) {
		setConstString(offset + 33, $arr_loc_addr2, value);
	}

	/**
	 * 入荷場所住所３. Receipt location address 3.<p>
	 *
	 */
	public String arr_loc_addr3() {
		return getConstString(offset + 34, $arr_loc_addr3);
	}

	/**
	 * 入荷場所住所３. Receipt location address 3.<p>
	 *
	 */
	public void arr_loc_addr3(String value) {
		setConstString(offset + 34, $arr_loc_addr3, value);
	}

	/**
	 * 入荷場所住所４. Receipt location address 4.<p>
	 *
	 */
	public String arr_loc_addr4() {
		return getConstString(offset + 35, $arr_loc_addr4);
	}

	/**
	 * 入荷場所住所４. Receipt location address 4.<p>
	 *
	 */
	public void arr_loc_addr4(String value) {
		setConstString(offset + 35, $arr_loc_addr4, value);
	}

	/**
	 * 取引先部署. BP dept..<p>
	 *
	 */
	public String bp_cntct_dpt() {
		return getConstString(offset + 36, $bp_cntct_dpt);
	}

	/**
	 * 取引先部署. BP dept..<p>
	 *
	 */
	public void bp_cntct_dpt(String value) {
		setConstString(offset + 36, $bp_cntct_dpt, value);
	}

	/**
	 * 取引先担当者. BP PIC.<p>
	 *
	 */
	public String bp_cntct_psn() {
		return getConstString(offset + 37, $bp_cntct_psn);
	}

	/**
	 * 取引先担当者. BP PIC.<p>
	 *
	 */
	public void bp_cntct_psn(String value) {
		setConstString(offset + 37, $bp_cntct_psn, value);
	}

	/**
	 * 入荷場所ＴＥＬ. Receipt location TEL.<p>
	 *
	 */
	public String arr_loc_tel() {
		return getConstString(offset + 38, $arr_loc_tel);
	}

	/**
	 * 入荷場所ＴＥＬ. Receipt location TEL.<p>
	 *
	 */
	public void arr_loc_tel(String value) {
		setConstString(offset + 38, $arr_loc_tel, value);
	}

	/**
	 * 入荷場所ＦＡＸ. Receipt location FAX.<p>
	 *
	 */
	public String arr_loc_fax() {
		return getConstString(offset + 39, $arr_loc_fax);
	}

	/**
	 * 入荷場所ＦＡＸ. Receipt location FAX.<p>
	 *
	 */
	public void arr_loc_fax(String value) {
		setConstString(offset + 39, $arr_loc_fax, value);
	}

	/**
	 * 発注先識別区分. Supplier identification type.<p>
	 *
	 */
	public String sppl_id_typ() {
		return getConstString(offset + 40, $sppl_id_typ);
	}

	/**
	 * 発注先識別区分. Supplier identification type.<p>
	 *
	 */
	public void sppl_id_typ(String value) {
		setConstString(offset + 40, $sppl_id_typ, value);
	}

	/**
	 * 発注先識別ＣＤ. Supplier identification cd..<p>
	 *
	 */
	public String sppl_id_cd() {
		return getConstString(offset + 41, $sppl_id_cd);
	}

	/**
	 * 発注先識別ＣＤ. Supplier identification cd..<p>
	 *
	 */
	public void sppl_id_cd(String value) {
		setConstString(offset + 41, $sppl_id_cd, value);
	}

	/**
	 * 発注先識別名. Supplier identification name.<p>
	 *
	 */
	public String sppl_id_nm() {
		return getConstString(offset + 42, $sppl_id_nm);
	}

	/**
	 * 発注先識別名. Supplier identification name.<p>
	 *
	 */
	public void sppl_id_nm(String value) {
		setConstString(offset + 42, $sppl_id_nm, value);
	}

	/**
	 * 発注先諸口ＦＬＧ. Miscellaneous supplier flg..<p>
	 *
	 */
	public boolean sppl_sundry_flg() {
		return getConstBoolean(offset + 43, $sppl_sundry_flg);
	}

	/**
	 * 発注先諸口ＦＬＧ. Miscellaneous supplier flg..<p>
	 *
	 */
	public void sppl_sundry_flg(boolean value) {
		setConstBoolean(offset + 43, $sppl_sundry_flg, value);
	}

	/**
	 * 発注先郵便番号. Supplier zip code.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return getConstString(offset + 44, $sppl_zip_cd);
	}

	/**
	 * 発注先郵便番号. Supplier zip code.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		setConstString(offset + 44, $sppl_zip_cd, value);
	}

	/**
	 * 発注先住所１. Supplier address 1.<p>
	 *
	 */
	public String sppl_addr1() {
		return getConstString(offset + 45, $sppl_addr1);
	}

	/**
	 * 発注先住所１. Supplier address 1.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		setConstString(offset + 45, $sppl_addr1, value);
	}

	/**
	 * 発注先住所２. Supplier address 2.<p>
	 *
	 */
	public String sppl_addr2() {
		return getConstString(offset + 46, $sppl_addr2);
	}

	/**
	 * 発注先住所２. Supplier address 2.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		setConstString(offset + 46, $sppl_addr2, value);
	}

	/**
	 * 発注先住所３. Supplier address 3.<p>
	 *
	 */
	public String sppl_addr3() {
		return getConstString(offset + 47, $sppl_addr3);
	}

	/**
	 * 発注先住所３. Supplier address 3.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		setConstString(offset + 47, $sppl_addr3, value);
	}

	/**
	 * 発注先住所４. Supplier address 4.<p>
	 *
	 */
	public String sppl_addr4() {
		return getConstString(offset + 48, $sppl_addr4);
	}

	/**
	 * 発注先住所４. Supplier address 4.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		setConstString(offset + 48, $sppl_addr4, value);
	}

	/**
	 * 発注先部署. Supplier dept..<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 49, $sppl_cntct_dpt);
	}

	/**
	 * 発注先部署. Supplier dept..<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 49, $sppl_cntct_dpt, value);
	}

	/**
	 * 発注先担当者. Supplier PIC.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 50, $sppl_cntct_psn);
	}

	/**
	 * 発注先担当者. Supplier PIC.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 50, $sppl_cntct_psn, value);
	}

	/**
	 * 発注先ＴＥＬ. Supplier TEL.<p>
	 *
	 */
	public String sppl_tel() {
		return getConstString(offset + 51, $sppl_tel);
	}

	/**
	 * 発注先ＴＥＬ. Supplier TEL.<p>
	 *
	 */
	public void sppl_tel(String value) {
		setConstString(offset + 51, $sppl_tel, value);
	}

	/**
	 * 発注先ＦＡＸ. Supplier FAX.<p>
	 *
	 */
	public String sppl_fax() {
		return getConstString(offset + 52, $sppl_fax);
	}

	/**
	 * 発注先ＦＡＸ. Supplier FAX.<p>
	 *
	 */
	public void sppl_fax(String value) {
		setConstString(offset + 52, $sppl_fax, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 53, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 53, $wg_cd, value);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 54, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 54, $trd_rmrks, value);
	}

	/**
	 * 伝票発行済ＦＬＧ. Slip issued flg..<p>
	 *
	 */
	public boolean slip_prnt_flg() {
		return getConstBoolean(offset + 55, $slip_prnt_flg);
	}

	/**
	 * 伝票発行済ＦＬＧ. Slip issued flg..<p>
	 *
	 */
	public void slip_prnt_flg(boolean value) {
		setConstBoolean(offset + 55, $slip_prnt_flg, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 56, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 56, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 57, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 57, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 58, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 58, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 59, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 59, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 60, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 60, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 61, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 61, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 62, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 62, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 63, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 64, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 64, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 65, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 65, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 66, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 66, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 67, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 67, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 68, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 68, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			return dlv_inst_grp_no();
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			return prms_rcpt_grp_no();
		}
		if ($purc_dlv_slip_src_typ.equalsIgnoreCase(name)) {
			return purc_dlv_slip_src_typ();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			return arr_loc_cd();
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			return arr_loc_nm();
		}
		if ($arr_loc_zip_cd.equalsIgnoreCase(name)) {
			return arr_loc_zip_cd();
		}
		if ($arr_loc_addr1.equalsIgnoreCase(name)) {
			return arr_loc_addr1();
		}
		if ($arr_loc_addr2.equalsIgnoreCase(name)) {
			return arr_loc_addr2();
		}
		if ($arr_loc_addr3.equalsIgnoreCase(name)) {
			return arr_loc_addr3();
		}
		if ($arr_loc_addr4.equalsIgnoreCase(name)) {
			return arr_loc_addr4();
		}
		if ($bp_cntct_dpt.equalsIgnoreCase(name)) {
			return bp_cntct_dpt();
		}
		if ($bp_cntct_psn.equalsIgnoreCase(name)) {
			return bp_cntct_psn();
		}
		if ($arr_loc_tel.equalsIgnoreCase(name)) {
			return arr_loc_tel();
		}
		if ($arr_loc_fax.equalsIgnoreCase(name)) {
			return arr_loc_fax();
		}
		if ($sppl_id_typ.equalsIgnoreCase(name)) {
			return sppl_id_typ();
		}
		if ($sppl_id_cd.equalsIgnoreCase(name)) {
			return sppl_id_cd();
		}
		if ($sppl_id_nm.equalsIgnoreCase(name)) {
			return sppl_id_nm();
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
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			return last_po_rev();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($slip_line_max.equalsIgnoreCase(name)) {
			return slip_line_max();
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
		if ($sppl_sundry_flg.equalsIgnoreCase(name)) {
			return sppl_sundry_flg();
		}
		if ($slip_prnt_flg.equalsIgnoreCase(name)) {
			return slip_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			return dlv_inst_grp_no();
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			return prms_rcpt_grp_no();
		}
		if ($purc_dlv_slip_src_typ.equalsIgnoreCase(name)) {
			return purc_dlv_slip_src_typ();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			return arr_loc_cd();
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			return arr_loc_nm();
		}
		if ($arr_loc_zip_cd.equalsIgnoreCase(name)) {
			return arr_loc_zip_cd();
		}
		if ($arr_loc_addr1.equalsIgnoreCase(name)) {
			return arr_loc_addr1();
		}
		if ($arr_loc_addr2.equalsIgnoreCase(name)) {
			return arr_loc_addr2();
		}
		if ($arr_loc_addr3.equalsIgnoreCase(name)) {
			return arr_loc_addr3();
		}
		if ($arr_loc_addr4.equalsIgnoreCase(name)) {
			return arr_loc_addr4();
		}
		if ($bp_cntct_dpt.equalsIgnoreCase(name)) {
			return bp_cntct_dpt();
		}
		if ($bp_cntct_psn.equalsIgnoreCase(name)) {
			return bp_cntct_psn();
		}
		if ($arr_loc_tel.equalsIgnoreCase(name)) {
			return arr_loc_tel();
		}
		if ($arr_loc_fax.equalsIgnoreCase(name)) {
			return arr_loc_fax();
		}
		if ($sppl_id_typ.equalsIgnoreCase(name)) {
			return sppl_id_typ();
		}
		if ($sppl_id_cd.equalsIgnoreCase(name)) {
			return sppl_id_cd();
		}
		if ($sppl_id_nm.equalsIgnoreCase(name)) {
			return sppl_id_nm();
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
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			return last_po_rev();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($slip_line_max.equalsIgnoreCase(name)) {
			return slip_line_max();
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
		if ($sppl_sundry_flg.equalsIgnoreCase(name)) {
			return sppl_sundry_flg();
		}
		if ($slip_prnt_flg.equalsIgnoreCase(name)) {
			return slip_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			dlv_inst_grp_no(value);
			return;
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			prms_rcpt_grp_no(value);
			return;
		}
		if ($purc_dlv_slip_src_typ.equalsIgnoreCase(name)) {
			purc_dlv_slip_src_typ(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			arr_loc_cd(value);
			return;
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			arr_loc_nm(value);
			return;
		}
		if ($arr_loc_zip_cd.equalsIgnoreCase(name)) {
			arr_loc_zip_cd(value);
			return;
		}
		if ($arr_loc_addr1.equalsIgnoreCase(name)) {
			arr_loc_addr1(value);
			return;
		}
		if ($arr_loc_addr2.equalsIgnoreCase(name)) {
			arr_loc_addr2(value);
			return;
		}
		if ($arr_loc_addr3.equalsIgnoreCase(name)) {
			arr_loc_addr3(value);
			return;
		}
		if ($arr_loc_addr4.equalsIgnoreCase(name)) {
			arr_loc_addr4(value);
			return;
		}
		if ($bp_cntct_dpt.equalsIgnoreCase(name)) {
			bp_cntct_dpt(value);
			return;
		}
		if ($bp_cntct_psn.equalsIgnoreCase(name)) {
			bp_cntct_psn(value);
			return;
		}
		if ($arr_loc_tel.equalsIgnoreCase(name)) {
			arr_loc_tel(value);
			return;
		}
		if ($arr_loc_fax.equalsIgnoreCase(name)) {
			arr_loc_fax(value);
			return;
		}
		if ($sppl_id_typ.equalsIgnoreCase(name)) {
			sppl_id_typ(value);
			return;
		}
		if ($sppl_id_cd.equalsIgnoreCase(name)) {
			sppl_id_cd(value);
			return;
		}
		if ($sppl_id_nm.equalsIgnoreCase(name)) {
			sppl_id_nm(value);
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
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			last_po_rev(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($slip_line_max.equalsIgnoreCase(name)) {
			slip_line_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			last_po_rev(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($slip_line_max.equalsIgnoreCase(name)) {
			slip_line_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			last_po_rev(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($slip_line_max.equalsIgnoreCase(name)) {
			slip_line_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			last_po_rev(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($slip_line_max.equalsIgnoreCase(name)) {
			slip_line_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			last_po_rev(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($slip_line_max.equalsIgnoreCase(name)) {
			slip_line_max(value);
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
		if ($sppl_sundry_flg.equalsIgnoreCase(name)) {
			sppl_sundry_flg(value);
			return;
		}
		if ($slip_prnt_flg.equalsIgnoreCase(name)) {
			slip_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			dlv_inst_grp_no(value);
			return;
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			prms_rcpt_grp_no(value);
			return;
		}
		if ($purc_dlv_slip_src_typ.equalsIgnoreCase(name)) {
			purc_dlv_slip_src_typ(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			arr_loc_cd(value);
			return;
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			arr_loc_nm(value);
			return;
		}
		if ($arr_loc_zip_cd.equalsIgnoreCase(name)) {
			arr_loc_zip_cd(value);
			return;
		}
		if ($arr_loc_addr1.equalsIgnoreCase(name)) {
			arr_loc_addr1(value);
			return;
		}
		if ($arr_loc_addr2.equalsIgnoreCase(name)) {
			arr_loc_addr2(value);
			return;
		}
		if ($arr_loc_addr3.equalsIgnoreCase(name)) {
			arr_loc_addr3(value);
			return;
		}
		if ($arr_loc_addr4.equalsIgnoreCase(name)) {
			arr_loc_addr4(value);
			return;
		}
		if ($bp_cntct_dpt.equalsIgnoreCase(name)) {
			bp_cntct_dpt(value);
			return;
		}
		if ($bp_cntct_psn.equalsIgnoreCase(name)) {
			bp_cntct_psn(value);
			return;
		}
		if ($arr_loc_tel.equalsIgnoreCase(name)) {
			arr_loc_tel(value);
			return;
		}
		if ($arr_loc_fax.equalsIgnoreCase(name)) {
			arr_loc_fax(value);
			return;
		}
		if ($sppl_id_typ.equalsIgnoreCase(name)) {
			sppl_id_typ(value);
			return;
		}
		if ($sppl_id_cd.equalsIgnoreCase(name)) {
			sppl_id_cd(value);
			return;
		}
		if ($sppl_id_nm.equalsIgnoreCase(name)) {
			sppl_id_nm(value);
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
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			last_po_rev(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($slip_line_max.equalsIgnoreCase(name)) {
			slip_line_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			last_po_rev(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($slip_line_max.equalsIgnoreCase(name)) {
			slip_line_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			last_po_rev(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($slip_line_max.equalsIgnoreCase(name)) {
			slip_line_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			last_po_rev(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($slip_line_max.equalsIgnoreCase(name)) {
			slip_line_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($last_po_rev.equalsIgnoreCase(name)) {
			last_po_rev(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($slip_line_max.equalsIgnoreCase(name)) {
			slip_line_max(value);
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
		if ($sppl_sundry_flg.equalsIgnoreCase(name)) {
			sppl_sundry_flg(value);
			return;
		}
		if ($slip_prnt_flg.equalsIgnoreCase(name)) {
			slip_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
