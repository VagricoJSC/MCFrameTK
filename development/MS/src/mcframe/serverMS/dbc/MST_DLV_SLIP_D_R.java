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
 * "納品伝票明細 // Delivery slip details"DBコンテナRowクラスです。<p>
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
 *  	<td>dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書明細ＮＯ</td>
 *  	<td>Delivery note details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>dlv_slip_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書明細連番</td>
 *  	<td>Delivery note details serial number</td>
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
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_plural_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット複数ＦＬＧ</td>
 *  	<td>Lot multiple flg.</td>
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
 *  	<td>sublot_plural_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロット複数ＦＬＧ</td>
 *  	<td>Multiple sublots flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>棚・ラインＣＤ</td>
 *  	<td>Rack/Line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫着荷先ＣＤ</td>
 *  	<td>Inventory arriving point cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付ＣＤ</td>
 *  	<td>Grading cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>良品区分</td>
 *  	<td>Conforming type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫検査区分</td>
 *  	<td>Inventory inspection type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫識別区分</td>
 *  	<td>Inventory identification type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫取引先ＣＤ</td>
 *  	<td>Inventory BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fix_no_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>確定ＮＯ区分</td>
 *  	<td>Firm No. type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>確定ＮＯ</td>
 *  	<td>Firm No.</td>
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
 *  	<td>slo_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注数量</td>
 *  	<td>Sales order qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注単位ＣＤ</td>
 *  	<td>Sales order unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示数量</td>
 *  	<td>Delivery order qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示単位ＣＤ</td>
 *  	<td>Delivery order cd.</td>
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
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨単価</td>
 *  	<td>Unit price (Transaction currency)</td>
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
 *  	<td>base_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨単価</td>
 *  	<td>Unit price (Base currency)</td>
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
 *  	<td>prov_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給区分</td>
 *  	<td>Supply type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給計上区分</td>
 *  	<td>Supply recording type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>理由ＣＤ</td>
 *  	<td>Reason cd.</td>
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
 *  	<td>dlv_inst_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示ＮＯ</td>
 *  	<td>Delivery order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_d_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示明細ＮＯ</td>
 *  	<td>Delivery order details No.</td>
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
 *  	<td>ship_dlv_slip_multi_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷時納品書明細複数ＦＬＧ</td>
 *  	<td>Multiple delivery note details at shipping flg.</td>
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
 *  	<td>io_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入出庫区分</td>
 *  	<td>GR/GI type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給計上日（基）</td>
 *  	<td>Supply recording date (Base)</td>
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
public class MST_DLV_SLIP_D_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_DLV_SLIP_D";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	private static final MCPermColumnInfo _dlv_slip_d_no = createColumnInfo("dlv_slip_d_no");
	public final MCStringPermColumn dlv_slip_d_no = createStringColumn(_dlv_slip_d_no);
	
	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public static final String $dlv_slip_d_seq = "dlv_slip_d_seq";
	private static final MCPermColumnInfo _dlv_slip_d_seq = createColumnInfo("dlv_slip_d_seq");
	public final MCNumberPermColumn dlv_slip_d_seq = createNumberColumn(_dlv_slip_d_seq);
	
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
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	private static final MCPermColumnInfo _sundry_itm_flg = createColumnInfo("sundry_itm_flg");
	public final MCBooleanPermColumn sundry_itm_flg = createBooleanColumn(_sundry_itm_flg);
	
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
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	private static final MCPermColumnInfo _lot_no = createColumnInfo("lot_no");
	public final MCStringPermColumn lot_no = createStringColumn(_lot_no);
	
	/**
	 * ロット複数ＦＬＧ. Lot multiple flg..<p>
	 *
	 */
	public static final String $lot_plural_flg = "lot_plural_flg";
	private static final MCPermColumnInfo _lot_plural_flg = createColumnInfo("lot_plural_flg");
	public final MCBooleanPermColumn lot_plural_flg = createBooleanColumn(_lot_plural_flg);
	
	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	private static final MCPermColumnInfo _sublot_no = createColumnInfo("sublot_no");
	public final MCStringPermColumn sublot_no = createStringColumn(_sublot_no);
	
	/**
	 * サブロット複数ＦＬＧ. Multiple sublots flg..<p>
	 *
	 */
	public static final String $sublot_plural_flg = "sublot_plural_flg";
	private static final MCPermColumnInfo _sublot_plural_flg = createColumnInfo("sublot_plural_flg");
	public final MCBooleanPermColumn sublot_plural_flg = createBooleanColumn(_sublot_plural_flg);
	
	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	private static final MCPermColumnInfo _stk_arrv_bp_cd = createColumnInfo("stk_arrv_bp_cd");
	public final MCStringPermColumn stk_arrv_bp_cd = createStringColumn(_stk_arrv_bp_cd);
	
	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	private static final MCPermColumnInfo _gd_cd = createColumnInfo("gd_cd");
	public final MCStringPermColumn gd_cd = createStringColumn(_gd_cd);
	
	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	private static final MCPermColumnInfo _quality_typ = createColumnInfo("quality_typ");
	public final MCStringPermColumn quality_typ = createStringColumn(_quality_typ);
	
	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	private static final MCPermColumnInfo _stk_insp_typ = createColumnInfo("stk_insp_typ");
	public final MCStringPermColumn stk_insp_typ = createStringColumn(_stk_insp_typ);
	
	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	private static final MCPermColumnInfo _stk_id_typ = createColumnInfo("stk_id_typ");
	public final MCStringPermColumn stk_id_typ = createStringColumn(_stk_id_typ);
	
	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	private static final MCPermColumnInfo _stk_bp_cd = createColumnInfo("stk_bp_cd");
	public final MCStringPermColumn stk_bp_cd = createStringColumn(_stk_bp_cd);
	
	/**
	 * 確定ＮＯ区分. Firm No. type.<p>
	 *
	 */
	public static final String $fix_no_typ = "fix_no_typ";
	private static final MCPermColumnInfo _fix_no_typ = createColumnInfo("fix_no_typ");
	public final MCStringPermColumn fix_no_typ = createStringColumn(_fix_no_typ);
	
	/**
	 * 確定ＮＯ. Firm No..<p>
	 *
	 */
	public static final String $fix_no = "fix_no";
	private static final MCPermColumnInfo _fix_no = createColumnInfo("fix_no");
	public final MCStringPermColumn fix_no = createStringColumn(_fix_no);
	
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
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public static final String $slo_qty = "slo_qty";
	private static final MCPermColumnInfo _slo_qty = createColumnInfo("slo_qty");
	public final MCNumberPermColumn slo_qty = createNumberColumn(_slo_qty);
	
	/**
	 * 受注単位ＣＤ. Sales order unit cd..<p>
	 *
	 */
	public static final String $slo_unit_cd = "slo_unit_cd";
	private static final MCPermColumnInfo _slo_unit_cd = createColumnInfo("slo_unit_cd");
	public final MCStringPermColumn slo_unit_cd = createStringColumn(_slo_unit_cd);
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public static final String $dlv_inst_qty = "dlv_inst_qty";
	private static final MCPermColumnInfo _dlv_inst_qty = createColumnInfo("dlv_inst_qty");
	public final MCNumberPermColumn dlv_inst_qty = createNumberColumn(_dlv_inst_qty);
	
	/**
	 * 納入指示単位ＣＤ. Delivery order cd..<p>
	 *
	 */
	public static final String $dlv_inst_unit_cd = "dlv_inst_unit_cd";
	private static final MCPermColumnInfo _dlv_inst_unit_cd = createColumnInfo("dlv_inst_unit_cd");
	public final MCStringPermColumn dlv_inst_unit_cd = createStringColumn(_dlv_inst_unit_cd);
	
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
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	private static final MCPermColumnInfo _base_cur_upri = createColumnInfo("base_cur_upri");
	public final MCNumberPermColumn base_cur_upri = createNumberColumn(_base_cur_upri);
	
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
	 * 支給区分. Supply type.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	private static final MCPermColumnInfo _prov_typ = createColumnInfo("prov_typ");
	public final MCStringPermColumn prov_typ = createStringColumn(_prov_typ);
	
	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	private static final MCPermColumnInfo _prov_basis_typ = createColumnInfo("prov_basis_typ");
	public final MCStringPermColumn prov_basis_typ = createStringColumn(_prov_basis_typ);
	
	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	private static final MCPermColumnInfo _rsn_cd = createColumnInfo("rsn_cd");
	public final MCStringPermColumn rsn_cd = createStringColumn(_rsn_cd);
	
	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	private static final MCPermColumnInfo _bd_dpt_cd = createColumnInfo("bd_dpt_cd");
	public final MCStringPermColumn bd_dpt_cd = createStringColumn(_bd_dpt_cd);
	
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
	 * 納入指示ＮＯ. Delivery order No..<p>
	 *
	 */
	public static final String $dlv_inst_no = "dlv_inst_no";
	private static final MCPermColumnInfo _dlv_inst_no = createColumnInfo("dlv_inst_no");
	public final MCStringPermColumn dlv_inst_no = createStringColumn(_dlv_inst_no);
	
	/**
	 * 納入指示明細ＮＯ. Delivery order details No..<p>
	 *
	 */
	public static final String $dlv_inst_d_no = "dlv_inst_d_no";
	private static final MCPermColumnInfo _dlv_inst_d_no = createColumnInfo("dlv_inst_d_no");
	public final MCStringPermColumn dlv_inst_d_no = createStringColumn(_dlv_inst_d_no);
	
	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	private static final MCPermColumnInfo _slo_d_no = createColumnInfo("slo_d_no");
	public final MCStringPermColumn slo_d_no = createStringColumn(_slo_d_no);
	
	/**
	 * 出荷時納品書明細ＮＯ. Delivery note details No. at shipping.<p>
	 *
	 */
	public static final String $ship_dlv_slip_d_no = "ship_dlv_slip_d_no";
	private static final MCPermColumnInfo _ship_dlv_slip_d_no = createColumnInfo("ship_dlv_slip_d_no");
	public final MCStringPermColumn ship_dlv_slip_d_no = createStringColumn(_ship_dlv_slip_d_no);
	
	/**
	 * 出荷時納品書明細複数ＦＬＧ. Multiple delivery note details at shipping flg..<p>
	 *
	 */
	public static final String $ship_dlv_slip_multi_flg = "ship_dlv_slip_multi_flg";
	private static final MCPermColumnInfo _ship_dlv_slip_multi_flg = createColumnInfo("ship_dlv_slip_multi_flg");
	public final MCBooleanPermColumn ship_dlv_slip_multi_flg = createBooleanColumn(_ship_dlv_slip_multi_flg);
	
	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	private static final MCPermColumnInfo _trd_d_rmrks = createColumnInfo("trd_d_rmrks");
	public final MCStringPermColumn trd_d_rmrks = createStringColumn(_trd_d_rmrks);
	
	/**
	 * 入出庫区分. GR/GI type.<p>
	 *
	 */
	public static final String $io_typ = "io_typ";
	private static final MCPermColumnInfo _io_typ = createColumnInfo("io_typ");
	public final MCStringPermColumn io_typ = createStringColumn(_io_typ);
	
	/**
	 * 支給計上日（基）. Supply recording date (Base).<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";
	private static final MCPermColumnInfo _base_ac_dt = createColumnInfo("base_ac_dt");
	public final MCDatePermColumn base_ac_dt = createDateColumn(_base_ac_dt);
	
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
	
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta dlv_slip_d_seq_META = createCommonMeta($dlv_slip_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_plural_flg_META = createCommonMeta($lot_plural_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_plural_flg_META = createCommonMeta($sublot_plural_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta slo_qty_META = createCommonMeta($slo_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta slo_unit_cd_META = createCommonMeta($slo_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dlv_inst_qty_META = createCommonMeta($dlv_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_inst_unit_cd_META = createCommonMeta($dlv_inst_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta dlv_inst_no_META = createCommonMeta($dlv_inst_no, mcframe.commonMA.meta.MA_META.CST_DLV_INST_NO);
	public static final MCMeta dlv_inst_d_no_META = createCommonMeta($dlv_inst_d_no, mcframe.commonMA.meta.MA_META.CST_DLV_INST_D_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta ship_dlv_slip_d_no_META = createCommonMeta($ship_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_dlv_slip_multi_flg_META = createCommonMeta($ship_dlv_slip_multi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta io_typ_META = createCommonMeta($io_typ, mcframe.commonMS.meta.MS_META.IO_TYP);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.DLV_SLIP_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.DLV_SLIP_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.DLV_SLIP_D_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_DLV_SLIP_D_R> constMetas = new ConstMetaList<MST_DLV_SLIP_D_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			dlv_slip_d_no_META,
			dlv_slip_d_seq_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sundry_itm_flg_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			lot_no_META,
			lot_plural_flg_META,
			sublot_no_META,
			sublot_plural_flg_META,
			str_ln_cd_META,
			stk_arrv_bp_cd_META,
			gd_cd_META,
			quality_typ_META,
			stk_insp_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			fix_no_typ_META,
			fix_no_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			slo_qty_META,
			slo_unit_cd_META,
			dlv_inst_qty_META,
			dlv_inst_unit_cd_META,
			interim_flg_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_dscnt_amt_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			base_cur_dscnt_amt_META,
			tax_cd_META,
			trd_cur_tax_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			prov_typ_META,
			prov_basis_typ_META,
			rsn_cd_META,
			bd_dpt_cd_META,
			cst_po_d_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			dlv_inst_no_META,
			dlv_inst_d_no_META,
			slo_d_no_META,
			ship_dlv_slip_d_no_META,
			ship_dlv_slip_multi_flg_META,
			trd_d_rmrks_META,
			io_typ_META,
			base_ac_dt_META,
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
	protected MST_DLV_SLIP_D_R(ConstMetaList<? extends MST_DLV_SLIP_D_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_DLV_SLIP_D_R(ConstMetaList<? extends MST_DLV_SLIP_D_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$dlv_slip_d_no,
				"dlv_slip_d_no",
				dlv_slip_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$dlv_slip_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$dlv_slip_d_seq,
				"dlv_slip_d_seq",
				dlv_slip_d_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$dlv_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$dlv_slip_no,
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
			MST_DLV_SLIP_D_R.$dlv_slip_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$dlv_slip_seq,
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
			MST_DLV_SLIP_D_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$itm_cd,
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
			MST_DLV_SLIP_D_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$itm_sub1,
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
			MST_DLV_SLIP_D_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$itm_sub2,
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
			MST_DLV_SLIP_D_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$itm_sub3,
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
			MST_DLV_SLIP_D_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$itm_nm,
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
			MST_DLV_SLIP_D_R.$sundry_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_DLV_SLIP_D_R.$sundry_itm_flg,
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
			MST_DLV_SLIP_D_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$sno1,
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
			MST_DLV_SLIP_D_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$sno2,
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
			MST_DLV_SLIP_D_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$sno3,
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
			MST_DLV_SLIP_D_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$sno4,
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
			MST_DLV_SLIP_D_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$lot_no,
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
			MST_DLV_SLIP_D_R.$lot_plural_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_DLV_SLIP_D_R.$lot_plural_flg,
				"lot_plural_flg",
				lot_plural_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$sublot_no,
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
			MST_DLV_SLIP_D_R.$sublot_plural_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_DLV_SLIP_D_R.$sublot_plural_flg,
				"sublot_plural_flg",
				sublot_plural_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$str_ln_cd,
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
			MST_DLV_SLIP_D_R.$stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$stk_arrv_bp_cd,
				"stk_arrv_bp_cd",
				stk_arrv_bp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$gd_cd,
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
			MST_DLV_SLIP_D_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$quality_typ,
				"quality_typ",
				quality_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$stk_insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$stk_insp_typ,
				"stk_insp_typ",
				stk_insp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$stk_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$stk_id_typ,
				"stk_id_typ",
				stk_id_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$stk_bp_cd,
				"stk_bp_cd",
				stk_bp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$fix_no_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$fix_no_typ,
				"fix_no_typ",
				fix_no_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$fix_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$fix_no,
				"fix_no",
				fix_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$trd_unit_qty,
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
			MST_DLV_SLIP_D_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$trd_unit_cd,
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
			MST_DLV_SLIP_D_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$base_unit_qty,
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
			MST_DLV_SLIP_D_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$base_unit_cd,
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
			MST_DLV_SLIP_D_R.$slo_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$slo_qty,
				"slo_qty",
				slo_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$slo_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$slo_unit_cd,
				"slo_unit_cd",
				slo_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$dlv_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$dlv_inst_qty,
				"dlv_inst_qty",
				dlv_inst_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$dlv_inst_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$dlv_inst_unit_cd,
				"dlv_inst_unit_cd",
				dlv_inst_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$interim_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_DLV_SLIP_D_R.$interim_flg,
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
			MST_DLV_SLIP_D_R.$trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$trd_cur_upri,
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
			MST_DLV_SLIP_D_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$trd_cur_amt,
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
			MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt,
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
			MST_DLV_SLIP_D_R.$base_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$base_cur_upri,
				"base_cur_upri",
				base_cur_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$base_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$base_cur_amt,
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
			MST_DLV_SLIP_D_R.$base_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$base_cur_tax_amt,
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
			MST_DLV_SLIP_D_R.$base_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$base_cur_dscnt_amt,
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
			MST_DLV_SLIP_D_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$tax_cd,
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
			MST_DLV_SLIP_D_R.$trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$trd_cur_tax_amt,
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
			MST_DLV_SLIP_D_R.$wtax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$wtax_rate,
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
			MST_DLV_SLIP_D_R.$wtax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$wtax_amt,
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
			MST_DLV_SLIP_D_R.$prov_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$prov_typ,
				"prov_typ",
				prov_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$prov_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$prov_basis_typ,
				"prov_basis_typ",
				prov_basis_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$rsn_cd,
				"rsn_cd",
				rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$bd_dpt_cd,
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
			MST_DLV_SLIP_D_R.$cst_po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$cst_po_d_no,
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
			MST_DLV_SLIP_D_R.$cst_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$cst_itm_cd,
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
			MST_DLV_SLIP_D_R.$cst_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$cst_itm_nm,
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
			MST_DLV_SLIP_D_R.$dlv_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$dlv_inst_no,
				"dlv_inst_no",
				dlv_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$dlv_inst_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$dlv_inst_d_no,
				"dlv_inst_d_no",
				dlv_inst_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$slo_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$slo_d_no,
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
			MST_DLV_SLIP_D_R.$ship_dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$ship_dlv_slip_d_no,
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
			MST_DLV_SLIP_D_R.$ship_dlv_slip_multi_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_DLV_SLIP_D_R.$ship_dlv_slip_multi_flg,
				"ship_dlv_slip_multi_flg",
				ship_dlv_slip_multi_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$trd_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$trd_d_rmrks,
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
			MST_DLV_SLIP_D_R.$io_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$io_typ,
				"io_typ",
				io_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_SLIP_D_R.$base_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_DLV_SLIP_D_R.$base_ac_dt,
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
			MST_DLV_SLIP_D_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$sub_char1,
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
			MST_DLV_SLIP_D_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$sub_char2,
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
			MST_DLV_SLIP_D_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$sub_char3,
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
			MST_DLV_SLIP_D_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$ins_usr_id,
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
			MST_DLV_SLIP_D_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$ins_usr_nm,
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
			MST_DLV_SLIP_D_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_DLV_SLIP_D_R.$ins_ts,
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
			MST_DLV_SLIP_D_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$ins_func_id,
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
			MST_DLV_SLIP_D_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_SLIP_D_R.$upd_cntr,
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
			MST_DLV_SLIP_D_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$upd_usr_id,
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
			MST_DLV_SLIP_D_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$upd_usr_nm,
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
			MST_DLV_SLIP_D_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_DLV_SLIP_D_R.$upd_ts,
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
			MST_DLV_SLIP_D_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$upd_func_id,
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
			MST_DLV_SLIP_D_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_SLIP_D_R.$upd_srv_req_no,
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
	public static MST_DLV_SLIP_D_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_DLV_SLIP_D_R create(String alias) {
		MST_DLV_SLIP_D_R row = new MST_DLV_SLIP_D_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_DLV_SLIP_D_R createByName(T proto) {
		MST_DLV_SLIP_D_R row = MST_DLV_SLIP_D_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_DLV_SLIP_D_R clone() {
		return (MST_DLV_SLIP_D_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_DLV_SLIP_D_R createInstance() {
		return (MST_DLV_SLIP_D_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_DLV_SLIP_D_R getValues(String... names) {
		return (MST_DLV_SLIP_D_R) super.getValues(names);
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
	 public MSW_DLV_SLIP_D_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_DLV_SLIP_D_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_DLV_SLIP_D_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_DLV_SLIP_D_KEY_R.TABLE_NAME);
	 }

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 0, $dlv_slip_d_no);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 0, $dlv_slip_d_no, value);
	}

	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public MCNumber dlv_slip_d_seq() {
		return getConstNumber(offset + 1, $dlv_slip_d_seq);
	}

	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public void dlv_slip_d_seq(MCNumber value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}
	
	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public void dlv_slip_d_seq(int value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}
	
	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public void dlv_slip_d_seq(long value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}
	
	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public void dlv_slip_d_seq(float value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}
	
	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public void dlv_slip_d_seq(double value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
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
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 9, $sundry_itm_flg);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 9, $sundry_itm_flg, value);
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
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 11, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 11, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 12, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 12, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 13, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 13, $sno4, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 14, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 14, $lot_no, value);
	}

	/**
	 * ロット複数ＦＬＧ. Lot multiple flg..<p>
	 *
	 */
	public boolean lot_plural_flg() {
		return getConstBoolean(offset + 15, $lot_plural_flg);
	}

	/**
	 * ロット複数ＦＬＧ. Lot multiple flg..<p>
	 *
	 */
	public void lot_plural_flg(boolean value) {
		setConstBoolean(offset + 15, $lot_plural_flg, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 16, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 16, $sublot_no, value);
	}

	/**
	 * サブロット複数ＦＬＧ. Multiple sublots flg..<p>
	 *
	 */
	public boolean sublot_plural_flg() {
		return getConstBoolean(offset + 17, $sublot_plural_flg);
	}

	/**
	 * サブロット複数ＦＬＧ. Multiple sublots flg..<p>
	 *
	 */
	public void sublot_plural_flg(boolean value) {
		setConstBoolean(offset + 17, $sublot_plural_flg, value);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 18, $str_ln_cd);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 18, $str_ln_cd, value);
	}

	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 19, $stk_arrv_bp_cd);
	}

	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 19, $stk_arrv_bp_cd, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 20, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 20, $gd_cd, value);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 21, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 21, $quality_typ, value);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 22, $stk_insp_typ);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 22, $stk_insp_typ, value);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 23, $stk_id_typ);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 23, $stk_id_typ, value);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 24, $stk_bp_cd);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 24, $stk_bp_cd, value);
	}

	/**
	 * 確定ＮＯ区分. Firm No. type.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 25, $fix_no_typ);
	}

	/**
	 * 確定ＮＯ区分. Firm No. type.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 25, $fix_no_typ, value);
	}

	/**
	 * 確定ＮＯ. Firm No..<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 26, $fix_no);
	}

	/**
	 * 確定ＮＯ. Firm No..<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 26, $fix_no, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 27, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 28, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 28, $trd_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 29, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 30, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 30, $base_unit_cd, value);
	}

	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public MCNumber slo_qty() {
		return getConstNumber(offset + 31, $slo_qty);
	}

	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public void slo_qty(MCNumber value) {
		setConstNumber(offset + 31, $slo_qty, value);
	}
	
	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public void slo_qty(int value) {
		setConstNumber(offset + 31, $slo_qty, value);
	}
	
	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public void slo_qty(long value) {
		setConstNumber(offset + 31, $slo_qty, value);
	}
	
	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public void slo_qty(float value) {
		setConstNumber(offset + 31, $slo_qty, value);
	}
	
	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public void slo_qty(double value) {
		setConstNumber(offset + 31, $slo_qty, value);
	}
	
	/**
	 * 受注単位ＣＤ. Sales order unit cd..<p>
	 *
	 */
	public String slo_unit_cd() {
		return getConstString(offset + 32, $slo_unit_cd);
	}

	/**
	 * 受注単位ＣＤ. Sales order unit cd..<p>
	 *
	 */
	public void slo_unit_cd(String value) {
		setConstString(offset + 32, $slo_unit_cd, value);
	}

	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public MCNumber dlv_inst_qty() {
		return getConstNumber(offset + 33, $dlv_inst_qty);
	}

	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(MCNumber value) {
		setConstNumber(offset + 33, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(int value) {
		setConstNumber(offset + 33, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(long value) {
		setConstNumber(offset + 33, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(float value) {
		setConstNumber(offset + 33, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(double value) {
		setConstNumber(offset + 33, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示単位ＣＤ. Delivery order cd..<p>
	 *
	 */
	public String dlv_inst_unit_cd() {
		return getConstString(offset + 34, $dlv_inst_unit_cd);
	}

	/**
	 * 納入指示単位ＣＤ. Delivery order cd..<p>
	 *
	 */
	public void dlv_inst_unit_cd(String value) {
		setConstString(offset + 34, $dlv_inst_unit_cd, value);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 35, $interim_flg);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 35, $interim_flg, value);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 36, $trd_cur_upri);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 36, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 36, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 36, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 36, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 36, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 37, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 37, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 37, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 37, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 37, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 37, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 38, $trd_cur_dscnt_amt);
	}

	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 38, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 38, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 38, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 38, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 38, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 39, $base_cur_upri);
	}

	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 39, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 39, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 39, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 39, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 39, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 40, $base_cur_amt);
	}

	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 40, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 40, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 40, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 40, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 40, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 41, $base_cur_tax_amt);
	}

	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 41, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 41, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 41, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 41, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 41, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 42, $base_cur_dscnt_amt);
	}

	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 42, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 42, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 42, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 42, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 42, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 43, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 43, $tax_cd, value);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 44, $trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 44, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 44, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 44, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 44, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 44, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 45, $wtax_rate);
	}

	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 45, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 45, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 45, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 45, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 45, $wtax_rate, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 46, $wtax_amt);
	}

	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 46, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 46, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 46, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 46, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 46, $wtax_amt, value);
	}
	
	/**
	 * 支給区分. Supply type.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 47, $prov_typ);
	}

	/**
	 * 支給区分. Supply type.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 47, $prov_typ, value);
	}

	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 48, $prov_basis_typ);
	}

	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 48, $prov_basis_typ, value);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 49, $rsn_cd);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 49, $rsn_cd, value);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 50, $bd_dpt_cd);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 50, $bd_dpt_cd, value);
	}

	/**
	 * 得意先注文明細ＮＯ. Customer order details No..<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 51, $cst_po_d_no);
	}

	/**
	 * 得意先注文明細ＮＯ. Customer order details No..<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 51, $cst_po_d_no, value);
	}

	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 52, $cst_itm_cd);
	}

	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 52, $cst_itm_cd, value);
	}

	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 53, $cst_itm_nm);
	}

	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 53, $cst_itm_nm, value);
	}

	/**
	 * 納入指示ＮＯ. Delivery order No..<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 54, $dlv_inst_no);
	}

	/**
	 * 納入指示ＮＯ. Delivery order No..<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 54, $dlv_inst_no, value);
	}

	/**
	 * 納入指示明細ＮＯ. Delivery order details No..<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return getConstString(offset + 55, $dlv_inst_d_no);
	}

	/**
	 * 納入指示明細ＮＯ. Delivery order details No..<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		setConstString(offset + 55, $dlv_inst_d_no, value);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 56, $slo_d_no);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 56, $slo_d_no, value);
	}

	/**
	 * 出荷時納品書明細ＮＯ. Delivery note details No. at shipping.<p>
	 *
	 */
	public String ship_dlv_slip_d_no() {
		return getConstString(offset + 57, $ship_dlv_slip_d_no);
	}

	/**
	 * 出荷時納品書明細ＮＯ. Delivery note details No. at shipping.<p>
	 *
	 */
	public void ship_dlv_slip_d_no(String value) {
		setConstString(offset + 57, $ship_dlv_slip_d_no, value);
	}

	/**
	 * 出荷時納品書明細複数ＦＬＧ. Multiple delivery note details at shipping flg..<p>
	 *
	 */
	public boolean ship_dlv_slip_multi_flg() {
		return getConstBoolean(offset + 58, $ship_dlv_slip_multi_flg);
	}

	/**
	 * 出荷時納品書明細複数ＦＬＧ. Multiple delivery note details at shipping flg..<p>
	 *
	 */
	public void ship_dlv_slip_multi_flg(boolean value) {
		setConstBoolean(offset + 58, $ship_dlv_slip_multi_flg, value);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 59, $trd_d_rmrks);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 59, $trd_d_rmrks, value);
	}

	/**
	 * 入出庫区分. GR/GI type.<p>
	 *
	 */
	public String io_typ() {
		return getConstString(offset + 60, $io_typ);
	}

	/**
	 * 入出庫区分. GR/GI type.<p>
	 *
	 */
	public void io_typ(String value) {
		setConstString(offset + 60, $io_typ, value);
	}

	/**
	 * 支給計上日（基）. Supply recording date (Base).<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 61, $base_ac_dt);
	}

	/**
	 * 支給計上日（基）. Supply recording date (Base).<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 61, $base_ac_dt, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 62, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 62, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 63, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 63, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 64, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 64, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 65, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 65, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 66, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 66, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 67, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 67, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 68, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 68, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 69, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 70, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 70, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 71, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 71, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 72, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 72, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 73, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 73, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 74, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 74, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($slo_unit_cd.equalsIgnoreCase(name)) {
			return slo_unit_cd();
		}
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			return dlv_inst_unit_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
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
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_d_seq();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			return slo_qty();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
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
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			return lot_plural_flg();
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			return sublot_plural_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			return ship_dlv_slip_multi_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($slo_unit_cd.equalsIgnoreCase(name)) {
			return slo_unit_cd();
		}
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			return dlv_inst_unit_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
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
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_d_seq();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			return slo_qty();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
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
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			return lot_plural_flg();
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			return sublot_plural_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			return ship_dlv_slip_multi_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
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
		if ($slo_unit_cd.equalsIgnoreCase(name)) {
			slo_unit_cd(value);
			return;
		}
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			dlv_inst_unit_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
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
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			io_typ(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
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
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			lot_plural_flg(value);
			return;
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			sublot_plural_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			ship_dlv_slip_multi_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
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
		if ($slo_unit_cd.equalsIgnoreCase(name)) {
			slo_unit_cd(value);
			return;
		}
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			dlv_inst_unit_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
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
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			io_typ(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
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
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			lot_plural_flg(value);
			return;
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			sublot_plural_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			ship_dlv_slip_multi_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
