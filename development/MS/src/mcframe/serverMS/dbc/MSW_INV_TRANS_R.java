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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "在庫推移検索ワーク // Inventory forecasting search work"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>io_schd_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定区分</td>
 *  	<td>GR/GI schedule type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定状況区分</td>
 *  	<td>GR/GI schedule status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引パタン区分</td>
 *  	<td>Transaction pattern type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trn_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>トランザクション区分</td>
 *  	<td>Transaction type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_act_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払区分</td>
 *  	<td>GR/GI type</td>
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
 *  	<td>dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付</td>
 *  	<td>Date</td>
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
 *  	<td>ver_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>版管理対象ＦＬＧ</td>
 *  	<td>For version control flg.</td>
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
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>格付ＣＤ</td>
 *  	<td>Grading cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>良品区分</td>
 *  	<td>Conforming type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
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
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
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
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫予定数量</td>
 *  	<td>GR scheduled qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫予定数量</td>
 *  	<td>GI scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫実績数量</td>
 *  	<td>GR result qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫実績数量</td>
 *  	<td>GI result qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫数量</td>
 *  	<td>Inventory qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位小数部有効桁数</td>
 *  	<td>Base unit number of decimal places</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定ＮＯ</td>
 *  	<td>GR/GI schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_typ1</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備区分１</td>
 *  	<td>GR/GI schedule spare type 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_no1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備ＮＯ１</td>
 *  	<td>GR/GI schedule spare No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_typ2</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備区分２</td>
 *  	<td>GR/GI schedule spare type 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_no2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備ＮＯ２</td>
 *  	<td>GR/GI schedule spare No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_typ3</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備区分３</td>
 *  	<td>GR/GI schedule spare type 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_no3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備ＮＯ３</td>
 *  	<td>GR/GI schedule spare No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_typ4</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備区分４</td>
 *  	<td>GR/GI schedule spare type 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_no4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備ＮＯ４</td>
 *  	<td>GR/GI schedule spare No. 4</td>
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
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程指図ＮＯ</td>
 *  	<td>Operation order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品目ＣＤ</td>
 *  	<td>Parent item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親枝番１</td>
 *  	<td>Parent branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親枝番２</td>
 *  	<td>Parent branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親枝番３</td>
 *  	<td>Parent branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品名</td>
 *  	<td>Parent item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親ロットＮＯ</td>
 *  	<td>Parent lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親サブロットＮＯ</td>
 *  	<td>Parent sublot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親手配ＮＯ１</td>
 *  	<td>Parent SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親手配ＮＯ２</td>
 *  	<td>Parent SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親手配ＮＯ３</td>
 *  	<td>Parent SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親手配ＮＯ４</td>
 *  	<td>Parent SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品目オーダＮＯ</td>
 *  	<td>Parent item order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_oper_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親工程オーダＮＯ</td>
 *  	<td>Parent operation order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_dt_fr</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親着手予定日</td>
 *  	<td>Scheduled parent start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bom_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>構成パタン</td>
 *  	<td>BOM pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造実績ＮＯ</td>
 *  	<td>Mfg. result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程実績ＮＯ</td>
 *  	<td>Operation result No.</td>
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
 *  	<td>prcd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>先行手配ＦＬＧ</td>
 *  	<td>Long LT flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sim_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>シミュレーションＦＬＧ</td>
 *  	<td>Simulation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫ＦＬＧ</td>
 *  	<td>Inventory flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_INV_TRANS_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_INV_TRANS";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	private static final MCPermColumnInfo _io_schd_typ = createColumnInfo("io_schd_typ");
	public final MCStringPermColumn io_schd_typ = createStringColumn(_io_schd_typ);
	
	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	private static final MCPermColumnInfo _io_schd_sts_typ = createColumnInfo("io_schd_sts_typ");
	public final MCStringPermColumn io_schd_sts_typ = createStringColumn(_io_schd_sts_typ);
	
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
	 * トランザクション区分. Transaction type.<p>
	 *
	 */
	public static final String $trn_typ = "trn_typ";
	private static final MCPermColumnInfo _trn_typ = createColumnInfo("trn_typ");
	public final MCStringPermColumn trn_typ = createStringColumn(_trn_typ);
	
	/**
	 * 受払区分. GR/GI type.<p>
	 *
	 */
	public static final String $io_act_typ = "io_act_typ";
	private static final MCPermColumnInfo _io_act_typ = createColumnInfo("io_act_typ");
	public final MCStringPermColumn io_act_typ = createStringColumn(_io_act_typ);
	
	/**
	 * 入出庫区分. GR/GI type.<p>
	 *
	 */
	public static final String $io_typ = "io_typ";
	private static final MCPermColumnInfo _io_typ = createColumnInfo("io_typ");
	public final MCStringPermColumn io_typ = createStringColumn(_io_typ);
	
	/**
	 * 日付. Date.<p>
	 *
	 */
	public static final String $dt = "dt";
	private static final MCPermColumnInfo _dt = createColumnInfo("dt");
	public final MCDatePermColumn dt = createDateColumn(_dt);
	
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
	 * 版管理対象ＦＬＧ. For version control flg..<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	private static final MCPermColumnInfo _ver_flg = createColumnInfo("ver_flg");
	public final MCBooleanPermColumn ver_flg = createBooleanColumn(_ver_flg);
	
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
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	private static final MCPermColumnInfo _quality_typ = createColumnInfo("quality_typ");
	public final MCStringPermColumn quality_typ = createStringColumn(_quality_typ);
	
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
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 入庫予定数量. GR scheduled qty..<p>
	 *
	 */
	public static final String $gr_schd_qty = "gr_schd_qty";
	private static final MCPermColumnInfo _gr_schd_qty = createColumnInfo("gr_schd_qty");
	public final MCNumberPermColumn gr_schd_qty = createNumberColumn(_gr_schd_qty);
	
	/**
	 * 出庫予定数量. GI scheduled qty..<p>
	 *
	 */
	public static final String $gi_schd_qty = "gi_schd_qty";
	private static final MCPermColumnInfo _gi_schd_qty = createColumnInfo("gi_schd_qty");
	public final MCNumberPermColumn gi_schd_qty = createNumberColumn(_gi_schd_qty);
	
	/**
	 * 入庫実績数量. GR result qty..<p>
	 *
	 */
	public static final String $gr_act_qty = "gr_act_qty";
	private static final MCPermColumnInfo _gr_act_qty = createColumnInfo("gr_act_qty");
	public final MCNumberPermColumn gr_act_qty = createNumberColumn(_gr_act_qty);
	
	/**
	 * 出庫実績数量. GI result qty..<p>
	 *
	 */
	public static final String $gi_act_qty = "gi_act_qty";
	private static final MCPermColumnInfo _gi_act_qty = createColumnInfo("gi_act_qty");
	public final MCNumberPermColumn gi_act_qty = createNumberColumn(_gi_act_qty);
	
	/**
	 * 在庫数量. Inventory qty..<p>
	 *
	 */
	public static final String $stk_qty = "stk_qty";
	private static final MCPermColumnInfo _stk_qty = createColumnInfo("stk_qty");
	public final MCNumberPermColumn stk_qty = createNumberColumn(_stk_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	private static final MCPermColumnInfo _base_unit_dec_place = createColumnInfo("base_unit_dec_place");
	public final MCNumberPermColumn base_unit_dec_place = createNumberColumn(_base_unit_dec_place);
	
	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public static final String $io_schd_no = "io_schd_no";
	private static final MCPermColumnInfo _io_schd_no = createColumnInfo("io_schd_no");
	public final MCStringPermColumn io_schd_no = createStringColumn(_io_schd_no);
	
	/**
	 * 受払予定予備区分１. GR/GI schedule spare type 1.<p>
	 *
	 */
	public static final String $io_schd_sub_typ1 = "io_schd_sub_typ1";
	private static final MCPermColumnInfo _io_schd_sub_typ1 = createColumnInfo("io_schd_sub_typ1");
	public final MCStringPermColumn io_schd_sub_typ1 = createStringColumn(_io_schd_sub_typ1);
	
	/**
	 * 受払予定予備ＮＯ１. GR/GI schedule spare No. 1.<p>
	 *
	 */
	public static final String $io_schd_sub_no1 = "io_schd_sub_no1";
	private static final MCPermColumnInfo _io_schd_sub_no1 = createColumnInfo("io_schd_sub_no1");
	public final MCStringPermColumn io_schd_sub_no1 = createStringColumn(_io_schd_sub_no1);
	
	/**
	 * 受払予定予備区分２. GR/GI schedule spare type 2.<p>
	 *
	 */
	public static final String $io_schd_sub_typ2 = "io_schd_sub_typ2";
	private static final MCPermColumnInfo _io_schd_sub_typ2 = createColumnInfo("io_schd_sub_typ2");
	public final MCStringPermColumn io_schd_sub_typ2 = createStringColumn(_io_schd_sub_typ2);
	
	/**
	 * 受払予定予備ＮＯ２. GR/GI schedule spare No. 2.<p>
	 *
	 */
	public static final String $io_schd_sub_no2 = "io_schd_sub_no2";
	private static final MCPermColumnInfo _io_schd_sub_no2 = createColumnInfo("io_schd_sub_no2");
	public final MCStringPermColumn io_schd_sub_no2 = createStringColumn(_io_schd_sub_no2);
	
	/**
	 * 受払予定予備区分３. GR/GI schedule spare type 3.<p>
	 *
	 */
	public static final String $io_schd_sub_typ3 = "io_schd_sub_typ3";
	private static final MCPermColumnInfo _io_schd_sub_typ3 = createColumnInfo("io_schd_sub_typ3");
	public final MCStringPermColumn io_schd_sub_typ3 = createStringColumn(_io_schd_sub_typ3);
	
	/**
	 * 受払予定予備ＮＯ３. GR/GI schedule spare No. 3.<p>
	 *
	 */
	public static final String $io_schd_sub_no3 = "io_schd_sub_no3";
	private static final MCPermColumnInfo _io_schd_sub_no3 = createColumnInfo("io_schd_sub_no3");
	public final MCStringPermColumn io_schd_sub_no3 = createStringColumn(_io_schd_sub_no3);
	
	/**
	 * 受払予定予備区分４. GR/GI schedule spare type 4.<p>
	 *
	 */
	public static final String $io_schd_sub_typ4 = "io_schd_sub_typ4";
	private static final MCPermColumnInfo _io_schd_sub_typ4 = createColumnInfo("io_schd_sub_typ4");
	public final MCStringPermColumn io_schd_sub_typ4 = createStringColumn(_io_schd_sub_typ4);
	
	/**
	 * 受払予定予備ＮＯ４. GR/GI schedule spare No. 4.<p>
	 *
	 */
	public static final String $io_schd_sub_no4 = "io_schd_sub_no4";
	private static final MCPermColumnInfo _io_schd_sub_no4 = createColumnInfo("io_schd_sub_no4");
	public final MCStringPermColumn io_schd_sub_no4 = createStringColumn(_io_schd_sub_no4);
	
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
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	private static final MCPermColumnInfo _oper_inst_no = createColumnInfo("oper_inst_no");
	public final MCStringPermColumn oper_inst_no = createStringColumn(_oper_inst_no);
	
	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	private static final MCPermColumnInfo _par_itm_cd = createColumnInfo("par_itm_cd");
	public final MCStringPermColumn par_itm_cd = createStringColumn(_par_itm_cd);
	
	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	private static final MCPermColumnInfo _par_itm_sub1 = createColumnInfo("par_itm_sub1");
	public final MCStringPermColumn par_itm_sub1 = createStringColumn(_par_itm_sub1);
	
	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	private static final MCPermColumnInfo _par_itm_sub2 = createColumnInfo("par_itm_sub2");
	public final MCStringPermColumn par_itm_sub2 = createStringColumn(_par_itm_sub2);
	
	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	private static final MCPermColumnInfo _par_itm_sub3 = createColumnInfo("par_itm_sub3");
	public final MCStringPermColumn par_itm_sub3 = createStringColumn(_par_itm_sub3);
	
	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
	private static final MCPermColumnInfo _par_itm_nm = createColumnInfo("par_itm_nm");
	public final MCStringPermColumn par_itm_nm = createStringColumn(_par_itm_nm);
	
	/**
	 * 親ロットＮＯ. Parent lot No..<p>
	 *
	 */
	public static final String $par_lot_no = "par_lot_no";
	private static final MCPermColumnInfo _par_lot_no = createColumnInfo("par_lot_no");
	public final MCStringPermColumn par_lot_no = createStringColumn(_par_lot_no);
	
	/**
	 * 親サブロットＮＯ. Parent sublot No..<p>
	 *
	 */
	public static final String $par_sublot_no = "par_sublot_no";
	private static final MCPermColumnInfo _par_sublot_no = createColumnInfo("par_sublot_no");
	public final MCStringPermColumn par_sublot_no = createStringColumn(_par_sublot_no);
	
	/**
	 * 親手配ＮＯ１. Parent SEIBAN No. 1.<p>
	 *
	 */
	public static final String $par_sno1 = "par_sno1";
	private static final MCPermColumnInfo _par_sno1 = createColumnInfo("par_sno1");
	public final MCStringPermColumn par_sno1 = createStringColumn(_par_sno1);
	
	/**
	 * 親手配ＮＯ２. Parent SEIBAN No. 2.<p>
	 *
	 */
	public static final String $par_sno2 = "par_sno2";
	private static final MCPermColumnInfo _par_sno2 = createColumnInfo("par_sno2");
	public final MCStringPermColumn par_sno2 = createStringColumn(_par_sno2);
	
	/**
	 * 親手配ＮＯ３. Parent SEIBAN No. 3.<p>
	 *
	 */
	public static final String $par_sno3 = "par_sno3";
	private static final MCPermColumnInfo _par_sno3 = createColumnInfo("par_sno3");
	public final MCStringPermColumn par_sno3 = createStringColumn(_par_sno3);
	
	/**
	 * 親手配ＮＯ４. Parent SEIBAN No. 4.<p>
	 *
	 */
	public static final String $par_sno4 = "par_sno4";
	private static final MCPermColumnInfo _par_sno4 = createColumnInfo("par_sno4");
	public final MCStringPermColumn par_sno4 = createStringColumn(_par_sno4);
	
	/**
	 * 親品目オーダＮＯ. Parent item order No..<p>
	 *
	 */
	public static final String $par_itm_ord_no = "par_itm_ord_no";
	private static final MCPermColumnInfo _par_itm_ord_no = createColumnInfo("par_itm_ord_no");
	public final MCStringPermColumn par_itm_ord_no = createStringColumn(_par_itm_ord_no);
	
	/**
	 * 親工程オーダＮＯ. Parent operation order No..<p>
	 *
	 */
	public static final String $par_oper_ord_no = "par_oper_ord_no";
	private static final MCPermColumnInfo _par_oper_ord_no = createColumnInfo("par_oper_ord_no");
	public final MCStringPermColumn par_oper_ord_no = createStringColumn(_par_oper_ord_no);
	
	/**
	 * 親着手予定日. Scheduled parent start date.<p>
	 *
	 */
	public static final String $par_dt_fr = "par_dt_fr";
	private static final MCPermColumnInfo _par_dt_fr = createColumnInfo("par_dt_fr");
	public final MCDatePermColumn par_dt_fr = createDateColumn(_par_dt_fr);
	
	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	private static final MCPermColumnInfo _bom_ptn = createColumnInfo("bom_ptn");
	public final MCStringPermColumn bom_ptn = createStringColumn(_bom_ptn);
	
	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	private static final MCPermColumnInfo _mfg_act_no = createColumnInfo("mfg_act_no");
	public final MCStringPermColumn mfg_act_no = createStringColumn(_mfg_act_no);
	
	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	private static final MCPermColumnInfo _oper_act_no = createColumnInfo("oper_act_no");
	public final MCStringPermColumn oper_act_no = createStringColumn(_oper_act_no);
	
	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
	/**
	 * 先行手配ＦＬＧ. Long LT flg..<p>
	 *
	 */
	public static final String $prcd_flg = "prcd_flg";
	private static final MCPermColumnInfo _prcd_flg = createColumnInfo("prcd_flg");
	public final MCBooleanPermColumn prcd_flg = createBooleanColumn(_prcd_flg);
	
	/**
	 * シミュレーションＦＬＧ. Simulation flg..<p>
	 *
	 */
	public static final String $sim_flg = "sim_flg";
	private static final MCPermColumnInfo _sim_flg = createColumnInfo("sim_flg");
	public final MCBooleanPermColumn sim_flg = createBooleanColumn(_sim_flg);
	
	/**
	 * 在庫ＦＬＧ. Inventory flg..<p>
	 *
	 */
	public static final String $stk_flg = "stk_flg";
	private static final MCPermColumnInfo _stk_flg = createColumnInfo("stk_flg");
	public final MCBooleanPermColumn stk_flg = createBooleanColumn(_stk_flg);
	
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trn_typ_META = createCommonMeta($trn_typ, mcframe.commonMS.meta.MS_META.TRN_TYP);
	public static final MCMeta io_act_typ_META = createCommonMeta($io_act_typ, mcframe.commonMS.meta.MS_META.IO_ACT_TYP);
	public static final MCMeta io_typ_META = createCommonMeta($io_typ, mcframe.commonMS.meta.MS_META.IO_TYP);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_schd_qty_META = createCommonMeta($gr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_schd_qty_META = createCommonMeta($gi_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_act_qty_META = createCommonMeta($gr_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_act_qty_META = createCommonMeta($gi_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_qty_META = createCommonMeta($stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta io_schd_no_META = createCommonMeta($io_schd_no, mcframe.commonMA.meta.MA_META.IO_SCHD_NO);
	public static final MCMeta io_schd_sub_typ1_META = createCommonMeta($io_schd_sub_typ1, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no1_META = createCommonMeta($io_schd_sub_no1, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_typ2_META = createCommonMeta($io_schd_sub_typ2, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no2_META = createCommonMeta($io_schd_sub_no2, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_typ3_META = createCommonMeta($io_schd_sub_typ3, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no3_META = createCommonMeta($io_schd_sub_no3, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_typ4_META = createCommonMeta($io_schd_sub_typ4, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no4_META = createCommonMeta($io_schd_sub_no4, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta par_lot_no_META = createCommonMeta($par_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta par_sublot_no_META = createCommonMeta($par_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta par_sno1_META = createCommonMeta($par_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta par_sno2_META = createCommonMeta($par_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta par_sno3_META = createCommonMeta($par_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta par_sno4_META = createCommonMeta($par_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta par_itm_ord_no_META = createCommonMeta($par_itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta par_oper_ord_no_META = createCommonMeta($par_oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta par_dt_fr_META = createCommonMeta($par_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta prcd_flg_META = createCommonMeta($prcd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sim_flg_META = createCommonMeta($sim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_flg_META = createCommonMeta($stk_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_INV_TRANS_R> constMetas = new ConstMetaList<MSW_INV_TRANS_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			io_schd_typ_META,
			io_schd_sts_typ_META,
			trd_cd_META,
			trd_ptn_typ_META,
			trn_typ_META,
			io_act_typ_META,
			io_typ_META,
			dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_flg_META,
			ver_no_META,
			gd_cd_META,
			quality_typ_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			loc_cd_META,
			wg_cd_META,
			gr_schd_qty_META,
			gi_schd_qty_META,
			gr_act_qty_META,
			gi_act_qty_META,
			stk_qty_META,
			base_unit_cd_META,
			base_unit_dec_place_META,
			io_schd_no_META,
			io_schd_sub_typ1_META,
			io_schd_sub_no1_META,
			io_schd_sub_typ2_META,
			io_schd_sub_no2_META,
			io_schd_sub_typ3_META,
			io_schd_sub_no3_META,
			io_schd_sub_typ4_META,
			io_schd_sub_no4_META,
			slo_no_META,
			slo_d_no_META,
			po_no_META,
			po_d_no_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
			par_lot_no_META,
			par_sublot_no_META,
			par_sno1_META,
			par_sno2_META,
			par_sno3_META,
			par_sno4_META,
			par_itm_ord_no_META,
			par_oper_ord_no_META,
			par_dt_fr_META,
			bom_ptn_META,
			mfg_act_no_META,
			oper_act_no_META,
			str_ln_cd_META,
			prcd_flg_META,
			sim_flg_META,
			stk_flg_META
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
	protected MSW_INV_TRANS_R(ConstMetaList<? extends MSW_INV_TRANS_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_INV_TRANS_R(ConstMetaList<? extends MSW_INV_TRANS_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_typ,
				"io_schd_typ",
				io_schd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_sts_typ,
				"io_schd_sts_typ",
				io_schd_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$trd_cd,
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
			MSW_INV_TRANS_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$trd_ptn_typ,
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
			MSW_INV_TRANS_R.$trn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$trn_typ,
				"trn_typ",
				trn_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_act_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_act_typ,
				"io_act_typ",
				io_act_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_typ,
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
			MSW_INV_TRANS_R.$dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_INV_TRANS_R.$dt,
				"dt",
				dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$itm_cd,
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
			MSW_INV_TRANS_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$itm_sub1,
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
			MSW_INV_TRANS_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$itm_sub2,
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
			MSW_INV_TRANS_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$itm_sub3,
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
			MSW_INV_TRANS_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$itm_nm,
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
			MSW_INV_TRANS_R.$ver_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_INV_TRANS_R.$ver_flg,
				"ver_flg",
				ver_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$ver_no,
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
			MSW_INV_TRANS_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$gd_cd,
				"gd_cd",
				gd_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$quality_typ,
				"quality_typ",
				quality_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$sno1,
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
			MSW_INV_TRANS_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$sno2,
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
			MSW_INV_TRANS_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$sno3,
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
			MSW_INV_TRANS_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$sno4,
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
			MSW_INV_TRANS_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$loc_cd,
				"loc_cd",
				loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$wg_cd,
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
			MSW_INV_TRANS_R.$gr_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_INV_TRANS_R.$gr_schd_qty,
				"gr_schd_qty",
				gr_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$gi_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_INV_TRANS_R.$gi_schd_qty,
				"gi_schd_qty",
				gi_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$gr_act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_INV_TRANS_R.$gr_act_qty,
				"gr_act_qty",
				gr_act_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$gi_act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_INV_TRANS_R.$gi_act_qty,
				"gi_act_qty",
				gi_act_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$stk_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_INV_TRANS_R.$stk_qty,
				"stk_qty",
				stk_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$base_unit_cd,
				"base_unit_cd",
				base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$base_unit_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_INV_TRANS_R.$base_unit_dec_place,
				"base_unit_dec_place",
				base_unit_dec_place,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_no,
				"io_schd_no",
				io_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_sub_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_sub_typ1,
				"io_schd_sub_typ1",
				io_schd_sub_typ1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_sub_no1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_sub_no1,
				"io_schd_sub_no1",
				io_schd_sub_no1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_sub_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_sub_typ2,
				"io_schd_sub_typ2",
				io_schd_sub_typ2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_sub_no2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_sub_no2,
				"io_schd_sub_no2",
				io_schd_sub_no2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_sub_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_sub_typ3,
				"io_schd_sub_typ3",
				io_schd_sub_typ3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_sub_no3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_sub_no3,
				"io_schd_sub_no3",
				io_schd_sub_no3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_sub_typ4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_sub_typ4,
				"io_schd_sub_typ4",
				io_schd_sub_typ4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$io_schd_sub_no4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$io_schd_sub_no4,
				"io_schd_sub_no4",
				io_schd_sub_no4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$slo_no,
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
			MSW_INV_TRANS_R.$slo_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$slo_d_no,
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
			MSW_INV_TRANS_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$po_no,
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
			MSW_INV_TRANS_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$po_d_no,
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
			MSW_INV_TRANS_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$oper_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$oper_inst_no,
				"oper_inst_no",
				oper_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_itm_cd,
				"par_itm_cd",
				par_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_itm_sub1,
				"par_itm_sub1",
				par_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_itm_sub2,
				"par_itm_sub2",
				par_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_itm_sub3,
				"par_itm_sub3",
				par_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_itm_nm,
				"par_itm_nm",
				par_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_lot_no,
				"par_lot_no",
				par_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_sublot_no,
				"par_sublot_no",
				par_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_sno1,
				"par_sno1",
				par_sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_sno2,
				"par_sno2",
				par_sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_sno3,
				"par_sno3",
				par_sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_sno4,
				"par_sno4",
				par_sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_itm_ord_no,
				"par_itm_ord_no",
				par_itm_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_oper_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$par_oper_ord_no,
				"par_oper_ord_no",
				par_oper_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$par_dt_fr,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_INV_TRANS_R.$par_dt_fr,
				"par_dt_fr",
				par_dt_fr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$bom_ptn,
				"bom_ptn",
				bom_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$mfg_act_no,
				"mfg_act_no",
				mfg_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$oper_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$oper_act_no,
				"oper_act_no",
				oper_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_INV_TRANS_R.$str_ln_cd,
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
			MSW_INV_TRANS_R.$prcd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_INV_TRANS_R.$prcd_flg,
				"prcd_flg",
				prcd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$sim_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_INV_TRANS_R.$sim_flg,
				"sim_flg",
				sim_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_INV_TRANS_R.$stk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_INV_TRANS_R.$stk_flg,
				"stk_flg",
				stk_flg,
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
	public static MSW_INV_TRANS_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_INV_TRANS_R create(String alias) {
		MSW_INV_TRANS_R row = new MSW_INV_TRANS_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_INV_TRANS_R createByName(T proto) {
		MSW_INV_TRANS_R row = MSW_INV_TRANS_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_INV_TRANS_R clone() {
		return (MSW_INV_TRANS_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_INV_TRANS_R createInstance() {
		return (MSW_INV_TRANS_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_INV_TRANS_R getValues(String... names) {
		return (MSW_INV_TRANS_R) super.getValues(names);
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
		return false;
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
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 0, $io_schd_typ);
	}

	/**
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 0, $io_schd_typ, value);
	}

	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 1, $io_schd_sts_typ);
	}

	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 1, $io_schd_sts_typ, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 2, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 2, $trd_cd, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 3, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 3, $trd_ptn_typ, value);
	}

	/**
	 * トランザクション区分. Transaction type.<p>
	 *
	 */
	public String trn_typ() {
		return getConstString(offset + 4, $trn_typ);
	}

	/**
	 * トランザクション区分. Transaction type.<p>
	 *
	 */
	public void trn_typ(String value) {
		setConstString(offset + 4, $trn_typ, value);
	}

	/**
	 * 受払区分. GR/GI type.<p>
	 *
	 */
	public String io_act_typ() {
		return getConstString(offset + 5, $io_act_typ);
	}

	/**
	 * 受払区分. GR/GI type.<p>
	 *
	 */
	public void io_act_typ(String value) {
		setConstString(offset + 5, $io_act_typ, value);
	}

	/**
	 * 入出庫区分. GR/GI type.<p>
	 *
	 */
	public String io_typ() {
		return getConstString(offset + 6, $io_typ);
	}

	/**
	 * 入出庫区分. GR/GI type.<p>
	 *
	 */
	public void io_typ(String value) {
		setConstString(offset + 6, $io_typ, value);
	}

	/**
	 * 日付. Date.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 7, $dt);
	}

	/**
	 * 日付. Date.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 7, $dt, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 12, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 12, $itm_nm, value);
	}

	/**
	 * 版管理対象ＦＬＧ. For version control flg..<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 13, $ver_flg);
	}

	/**
	 * 版管理対象ＦＬＧ. For version control flg..<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 13, $ver_flg, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 14, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 14, $ver_no, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 15, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 15, $gd_cd, value);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 16, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 16, $quality_typ, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 17, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 17, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 18, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 18, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 19, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 19, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 20, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 20, $sno4, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 21, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 21, $loc_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 22, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 22, $wg_cd, value);
	}

	/**
	 * 入庫予定数量. GR scheduled qty..<p>
	 *
	 */
	public MCNumber gr_schd_qty() {
		return getConstNumber(offset + 23, $gr_schd_qty);
	}

	/**
	 * 入庫予定数量. GR scheduled qty..<p>
	 *
	 */
	public void gr_schd_qty(MCNumber value) {
		setConstNumber(offset + 23, $gr_schd_qty, value);
	}
	
	/**
	 * 入庫予定数量. GR scheduled qty..<p>
	 *
	 */
	public void gr_schd_qty(int value) {
		setConstNumber(offset + 23, $gr_schd_qty, value);
	}
	
	/**
	 * 入庫予定数量. GR scheduled qty..<p>
	 *
	 */
	public void gr_schd_qty(long value) {
		setConstNumber(offset + 23, $gr_schd_qty, value);
	}
	
	/**
	 * 入庫予定数量. GR scheduled qty..<p>
	 *
	 */
	public void gr_schd_qty(float value) {
		setConstNumber(offset + 23, $gr_schd_qty, value);
	}
	
	/**
	 * 入庫予定数量. GR scheduled qty..<p>
	 *
	 */
	public void gr_schd_qty(double value) {
		setConstNumber(offset + 23, $gr_schd_qty, value);
	}
	
	/**
	 * 出庫予定数量. GI scheduled qty..<p>
	 *
	 */
	public MCNumber gi_schd_qty() {
		return getConstNumber(offset + 24, $gi_schd_qty);
	}

	/**
	 * 出庫予定数量. GI scheduled qty..<p>
	 *
	 */
	public void gi_schd_qty(MCNumber value) {
		setConstNumber(offset + 24, $gi_schd_qty, value);
	}
	
	/**
	 * 出庫予定数量. GI scheduled qty..<p>
	 *
	 */
	public void gi_schd_qty(int value) {
		setConstNumber(offset + 24, $gi_schd_qty, value);
	}
	
	/**
	 * 出庫予定数量. GI scheduled qty..<p>
	 *
	 */
	public void gi_schd_qty(long value) {
		setConstNumber(offset + 24, $gi_schd_qty, value);
	}
	
	/**
	 * 出庫予定数量. GI scheduled qty..<p>
	 *
	 */
	public void gi_schd_qty(float value) {
		setConstNumber(offset + 24, $gi_schd_qty, value);
	}
	
	/**
	 * 出庫予定数量. GI scheduled qty..<p>
	 *
	 */
	public void gi_schd_qty(double value) {
		setConstNumber(offset + 24, $gi_schd_qty, value);
	}
	
	/**
	 * 入庫実績数量. GR result qty..<p>
	 *
	 */
	public MCNumber gr_act_qty() {
		return getConstNumber(offset + 25, $gr_act_qty);
	}

	/**
	 * 入庫実績数量. GR result qty..<p>
	 *
	 */
	public void gr_act_qty(MCNumber value) {
		setConstNumber(offset + 25, $gr_act_qty, value);
	}
	
	/**
	 * 入庫実績数量. GR result qty..<p>
	 *
	 */
	public void gr_act_qty(int value) {
		setConstNumber(offset + 25, $gr_act_qty, value);
	}
	
	/**
	 * 入庫実績数量. GR result qty..<p>
	 *
	 */
	public void gr_act_qty(long value) {
		setConstNumber(offset + 25, $gr_act_qty, value);
	}
	
	/**
	 * 入庫実績数量. GR result qty..<p>
	 *
	 */
	public void gr_act_qty(float value) {
		setConstNumber(offset + 25, $gr_act_qty, value);
	}
	
	/**
	 * 入庫実績数量. GR result qty..<p>
	 *
	 */
	public void gr_act_qty(double value) {
		setConstNumber(offset + 25, $gr_act_qty, value);
	}
	
	/**
	 * 出庫実績数量. GI result qty..<p>
	 *
	 */
	public MCNumber gi_act_qty() {
		return getConstNumber(offset + 26, $gi_act_qty);
	}

	/**
	 * 出庫実績数量. GI result qty..<p>
	 *
	 */
	public void gi_act_qty(MCNumber value) {
		setConstNumber(offset + 26, $gi_act_qty, value);
	}
	
	/**
	 * 出庫実績数量. GI result qty..<p>
	 *
	 */
	public void gi_act_qty(int value) {
		setConstNumber(offset + 26, $gi_act_qty, value);
	}
	
	/**
	 * 出庫実績数量. GI result qty..<p>
	 *
	 */
	public void gi_act_qty(long value) {
		setConstNumber(offset + 26, $gi_act_qty, value);
	}
	
	/**
	 * 出庫実績数量. GI result qty..<p>
	 *
	 */
	public void gi_act_qty(float value) {
		setConstNumber(offset + 26, $gi_act_qty, value);
	}
	
	/**
	 * 出庫実績数量. GI result qty..<p>
	 *
	 */
	public void gi_act_qty(double value) {
		setConstNumber(offset + 26, $gi_act_qty, value);
	}
	
	/**
	 * 在庫数量. Inventory qty..<p>
	 *
	 */
	public MCNumber stk_qty() {
		return getConstNumber(offset + 27, $stk_qty);
	}

	/**
	 * 在庫数量. Inventory qty..<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		setConstNumber(offset + 27, $stk_qty, value);
	}
	
	/**
	 * 在庫数量. Inventory qty..<p>
	 *
	 */
	public void stk_qty(int value) {
		setConstNumber(offset + 27, $stk_qty, value);
	}
	
	/**
	 * 在庫数量. Inventory qty..<p>
	 *
	 */
	public void stk_qty(long value) {
		setConstNumber(offset + 27, $stk_qty, value);
	}
	
	/**
	 * 在庫数量. Inventory qty..<p>
	 *
	 */
	public void stk_qty(float value) {
		setConstNumber(offset + 27, $stk_qty, value);
	}
	
	/**
	 * 在庫数量. Inventory qty..<p>
	 *
	 */
	public void stk_qty(double value) {
		setConstNumber(offset + 27, $stk_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 28, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 28, $base_unit_cd, value);
	}

	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 29, $base_unit_dec_place);
	}

	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}
	
	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}
	
	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}
	
	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}
	
	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}
	
	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public String io_schd_no() {
		return getConstString(offset + 30, $io_schd_no);
	}

	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public void io_schd_no(String value) {
		setConstString(offset + 30, $io_schd_no, value);
	}

	/**
	 * 受払予定予備区分１. GR/GI schedule spare type 1.<p>
	 *
	 */
	public String io_schd_sub_typ1() {
		return getConstString(offset + 31, $io_schd_sub_typ1);
	}

	/**
	 * 受払予定予備区分１. GR/GI schedule spare type 1.<p>
	 *
	 */
	public void io_schd_sub_typ1(String value) {
		setConstString(offset + 31, $io_schd_sub_typ1, value);
	}

	/**
	 * 受払予定予備ＮＯ１. GR/GI schedule spare No. 1.<p>
	 *
	 */
	public String io_schd_sub_no1() {
		return getConstString(offset + 32, $io_schd_sub_no1);
	}

	/**
	 * 受払予定予備ＮＯ１. GR/GI schedule spare No. 1.<p>
	 *
	 */
	public void io_schd_sub_no1(String value) {
		setConstString(offset + 32, $io_schd_sub_no1, value);
	}

	/**
	 * 受払予定予備区分２. GR/GI schedule spare type 2.<p>
	 *
	 */
	public String io_schd_sub_typ2() {
		return getConstString(offset + 33, $io_schd_sub_typ2);
	}

	/**
	 * 受払予定予備区分２. GR/GI schedule spare type 2.<p>
	 *
	 */
	public void io_schd_sub_typ2(String value) {
		setConstString(offset + 33, $io_schd_sub_typ2, value);
	}

	/**
	 * 受払予定予備ＮＯ２. GR/GI schedule spare No. 2.<p>
	 *
	 */
	public String io_schd_sub_no2() {
		return getConstString(offset + 34, $io_schd_sub_no2);
	}

	/**
	 * 受払予定予備ＮＯ２. GR/GI schedule spare No. 2.<p>
	 *
	 */
	public void io_schd_sub_no2(String value) {
		setConstString(offset + 34, $io_schd_sub_no2, value);
	}

	/**
	 * 受払予定予備区分３. GR/GI schedule spare type 3.<p>
	 *
	 */
	public String io_schd_sub_typ3() {
		return getConstString(offset + 35, $io_schd_sub_typ3);
	}

	/**
	 * 受払予定予備区分３. GR/GI schedule spare type 3.<p>
	 *
	 */
	public void io_schd_sub_typ3(String value) {
		setConstString(offset + 35, $io_schd_sub_typ3, value);
	}

	/**
	 * 受払予定予備ＮＯ３. GR/GI schedule spare No. 3.<p>
	 *
	 */
	public String io_schd_sub_no3() {
		return getConstString(offset + 36, $io_schd_sub_no3);
	}

	/**
	 * 受払予定予備ＮＯ３. GR/GI schedule spare No. 3.<p>
	 *
	 */
	public void io_schd_sub_no3(String value) {
		setConstString(offset + 36, $io_schd_sub_no3, value);
	}

	/**
	 * 受払予定予備区分４. GR/GI schedule spare type 4.<p>
	 *
	 */
	public String io_schd_sub_typ4() {
		return getConstString(offset + 37, $io_schd_sub_typ4);
	}

	/**
	 * 受払予定予備区分４. GR/GI schedule spare type 4.<p>
	 *
	 */
	public void io_schd_sub_typ4(String value) {
		setConstString(offset + 37, $io_schd_sub_typ4, value);
	}

	/**
	 * 受払予定予備ＮＯ４. GR/GI schedule spare No. 4.<p>
	 *
	 */
	public String io_schd_sub_no4() {
		return getConstString(offset + 38, $io_schd_sub_no4);
	}

	/**
	 * 受払予定予備ＮＯ４. GR/GI schedule spare No. 4.<p>
	 *
	 */
	public void io_schd_sub_no4(String value) {
		setConstString(offset + 38, $io_schd_sub_no4, value);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 39, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 39, $slo_no, value);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 40, $slo_d_no);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 40, $slo_d_no, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 41, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 41, $po_no, value);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 42, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 42, $po_d_no, value);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 43, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 43, $mfg_inst_no, value);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 44, $oper_inst_no);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 44, $oper_inst_no, value);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 45, $par_itm_cd);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 45, $par_itm_cd, value);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 46, $par_itm_sub1);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 46, $par_itm_sub1, value);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 47, $par_itm_sub2);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 47, $par_itm_sub2, value);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 48, $par_itm_sub3);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 48, $par_itm_sub3, value);
	}

	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 49, $par_itm_nm);
	}

	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 49, $par_itm_nm, value);
	}

	/**
	 * 親ロットＮＯ. Parent lot No..<p>
	 *
	 */
	public String par_lot_no() {
		return getConstString(offset + 50, $par_lot_no);
	}

	/**
	 * 親ロットＮＯ. Parent lot No..<p>
	 *
	 */
	public void par_lot_no(String value) {
		setConstString(offset + 50, $par_lot_no, value);
	}

	/**
	 * 親サブロットＮＯ. Parent sublot No..<p>
	 *
	 */
	public String par_sublot_no() {
		return getConstString(offset + 51, $par_sublot_no);
	}

	/**
	 * 親サブロットＮＯ. Parent sublot No..<p>
	 *
	 */
	public void par_sublot_no(String value) {
		setConstString(offset + 51, $par_sublot_no, value);
	}

	/**
	 * 親手配ＮＯ１. Parent SEIBAN No. 1.<p>
	 *
	 */
	public String par_sno1() {
		return getConstString(offset + 52, $par_sno1);
	}

	/**
	 * 親手配ＮＯ１. Parent SEIBAN No. 1.<p>
	 *
	 */
	public void par_sno1(String value) {
		setConstString(offset + 52, $par_sno1, value);
	}

	/**
	 * 親手配ＮＯ２. Parent SEIBAN No. 2.<p>
	 *
	 */
	public String par_sno2() {
		return getConstString(offset + 53, $par_sno2);
	}

	/**
	 * 親手配ＮＯ２. Parent SEIBAN No. 2.<p>
	 *
	 */
	public void par_sno2(String value) {
		setConstString(offset + 53, $par_sno2, value);
	}

	/**
	 * 親手配ＮＯ３. Parent SEIBAN No. 3.<p>
	 *
	 */
	public String par_sno3() {
		return getConstString(offset + 54, $par_sno3);
	}

	/**
	 * 親手配ＮＯ３. Parent SEIBAN No. 3.<p>
	 *
	 */
	public void par_sno3(String value) {
		setConstString(offset + 54, $par_sno3, value);
	}

	/**
	 * 親手配ＮＯ４. Parent SEIBAN No. 4.<p>
	 *
	 */
	public String par_sno4() {
		return getConstString(offset + 55, $par_sno4);
	}

	/**
	 * 親手配ＮＯ４. Parent SEIBAN No. 4.<p>
	 *
	 */
	public void par_sno4(String value) {
		setConstString(offset + 55, $par_sno4, value);
	}

	/**
	 * 親品目オーダＮＯ. Parent item order No..<p>
	 *
	 */
	public String par_itm_ord_no() {
		return getConstString(offset + 56, $par_itm_ord_no);
	}

	/**
	 * 親品目オーダＮＯ. Parent item order No..<p>
	 *
	 */
	public void par_itm_ord_no(String value) {
		setConstString(offset + 56, $par_itm_ord_no, value);
	}

	/**
	 * 親工程オーダＮＯ. Parent operation order No..<p>
	 *
	 */
	public String par_oper_ord_no() {
		return getConstString(offset + 57, $par_oper_ord_no);
	}

	/**
	 * 親工程オーダＮＯ. Parent operation order No..<p>
	 *
	 */
	public void par_oper_ord_no(String value) {
		setConstString(offset + 57, $par_oper_ord_no, value);
	}

	/**
	 * 親着手予定日. Scheduled parent start date.<p>
	 *
	 */
	public MCDate par_dt_fr() {
		return getConstDate(offset + 58, $par_dt_fr);
	}

	/**
	 * 親着手予定日. Scheduled parent start date.<p>
	 *
	 */
	public void par_dt_fr(MCDate value) {
		setConstDate(offset + 58, $par_dt_fr, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 59, $bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 59, $bom_ptn, value);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 60, $mfg_act_no);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 60, $mfg_act_no, value);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 61, $oper_act_no);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 61, $oper_act_no, value);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 62, $str_ln_cd);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 62, $str_ln_cd, value);
	}

	/**
	 * 先行手配ＦＬＧ. Long LT flg..<p>
	 *
	 */
	public boolean prcd_flg() {
		return getConstBoolean(offset + 63, $prcd_flg);
	}

	/**
	 * 先行手配ＦＬＧ. Long LT flg..<p>
	 *
	 */
	public void prcd_flg(boolean value) {
		setConstBoolean(offset + 63, $prcd_flg, value);
	}

	/**
	 * シミュレーションＦＬＧ. Simulation flg..<p>
	 *
	 */
	public boolean sim_flg() {
		return getConstBoolean(offset + 64, $sim_flg);
	}

	/**
	 * シミュレーションＦＬＧ. Simulation flg..<p>
	 *
	 */
	public void sim_flg(boolean value) {
		setConstBoolean(offset + 64, $sim_flg, value);
	}

	/**
	 * 在庫ＦＬＧ. Inventory flg..<p>
	 *
	 */
	public boolean stk_flg() {
		return getConstBoolean(offset + 65, $stk_flg);
	}

	/**
	 * 在庫ＦＬＧ. Inventory flg..<p>
	 *
	 */
	public void stk_flg(boolean value) {
		setConstBoolean(offset + 65, $stk_flg, value);
	}

	public String getString(String name) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			return io_schd_sub_typ1();
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			return io_schd_sub_no1();
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			return io_schd_sub_typ2();
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			return io_schd_sub_no2();
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			return io_schd_sub_typ3();
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			return io_schd_sub_no3();
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			return io_schd_sub_typ4();
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			return io_schd_sub_no4();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			return par_sno1();
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			return par_sno2();
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			return par_sno3();
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			return par_sno4();
		}
		if ($par_itm_ord_no.equalsIgnoreCase(name)) {
			return par_itm_ord_no();
		}
		if ($par_oper_ord_no.equalsIgnoreCase(name)) {
			return par_oper_ord_no();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			return gr_schd_qty();
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			return gi_schd_qty();
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			return gr_act_qty();
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			return gi_act_qty();
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		if ($par_dt_fr.equalsIgnoreCase(name)) {
			return par_dt_fr();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			return prcd_flg();
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			return sim_flg();
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			return io_schd_sub_typ1();
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			return io_schd_sub_no1();
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			return io_schd_sub_typ2();
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			return io_schd_sub_no2();
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			return io_schd_sub_typ3();
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			return io_schd_sub_no3();
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			return io_schd_sub_typ4();
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			return io_schd_sub_no4();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			return par_sno1();
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			return par_sno2();
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			return par_sno3();
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			return par_sno4();
		}
		if ($par_itm_ord_no.equalsIgnoreCase(name)) {
			return par_itm_ord_no();
		}
		if ($par_oper_ord_no.equalsIgnoreCase(name)) {
			return par_oper_ord_no();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			return gr_schd_qty();
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			return gi_schd_qty();
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			return gr_act_qty();
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			return gi_act_qty();
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		if ($par_dt_fr.equalsIgnoreCase(name)) {
			return par_dt_fr();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			return prcd_flg();
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			return sim_flg();
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
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
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			io_typ(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			io_schd_sub_typ1(value);
			return;
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			io_schd_sub_no1(value);
			return;
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			io_schd_sub_typ2(value);
			return;
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			io_schd_sub_no2(value);
			return;
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			io_schd_sub_typ3(value);
			return;
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			io_schd_sub_no3(value);
			return;
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			io_schd_sub_typ4(value);
			return;
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			io_schd_sub_no4(value);
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
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			par_sno1(value);
			return;
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			par_sno2(value);
			return;
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			par_sno3(value);
			return;
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			par_sno4(value);
			return;
		}
		if ($par_itm_ord_no.equalsIgnoreCase(name)) {
			par_itm_ord_no(value);
			return;
		}
		if ($par_oper_ord_no.equalsIgnoreCase(name)) {
			par_oper_ord_no(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		if ($par_dt_fr.equalsIgnoreCase(name)) {
			par_dt_fr(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			prcd_flg(value);
			return;
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			sim_flg(value);
			return;
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
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
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			io_typ(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			io_schd_sub_typ1(value);
			return;
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			io_schd_sub_no1(value);
			return;
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			io_schd_sub_typ2(value);
			return;
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			io_schd_sub_no2(value);
			return;
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			io_schd_sub_typ3(value);
			return;
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			io_schd_sub_no3(value);
			return;
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			io_schd_sub_typ4(value);
			return;
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			io_schd_sub_no4(value);
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
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			par_sno1(value);
			return;
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			par_sno2(value);
			return;
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			par_sno3(value);
			return;
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			par_sno4(value);
			return;
		}
		if ($par_itm_ord_no.equalsIgnoreCase(name)) {
			par_itm_ord_no(value);
			return;
		}
		if ($par_oper_ord_no.equalsIgnoreCase(name)) {
			par_oper_ord_no(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($gi_schd_qty.equalsIgnoreCase(name)) {
			gi_schd_qty(value);
			return;
		}
		if ($gr_act_qty.equalsIgnoreCase(name)) {
			gr_act_qty(value);
			return;
		}
		if ($gi_act_qty.equalsIgnoreCase(name)) {
			gi_act_qty(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		if ($par_dt_fr.equalsIgnoreCase(name)) {
			par_dt_fr(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			prcd_flg(value);
			return;
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			sim_flg(value);
			return;
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
