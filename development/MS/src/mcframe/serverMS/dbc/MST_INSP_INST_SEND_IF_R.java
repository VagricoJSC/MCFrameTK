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
 * "検査指図送信ＩＦ // Inspection order export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>exe_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＰＧ実行状況区分</td>
 *  	<td>PG execution status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_crud_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データ更新区分</td>
 *  	<td>Data update type</td>
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
 *  	<td>insp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査ＮＯ</td>
 *  	<td>Inspection No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_freq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査回数</td>
 *  	<td>Number of inspections</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査種類区分</td>
 *  	<td>Inspection classification type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_mtd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査方法区分</td>
 *  	<td>Inspection method type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査状況区分</td>
 *  	<td>Inspection status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_bind_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査実施単位区分</td>
 *  	<td>Inspection implementation unit type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>col_schd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予定まとめＦＬＧ</td>
 *  	<td>Schedule aggregation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_lst_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査指図リスト発行済ＦＬＧ</td>
 *  	<td>Inspection order list issued flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_lst_prnt_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査指図リスト発行日時</td>
 *  	<td>Inspection order list issue date and time</td>
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
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_itm_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ品目ＣＤ</td>
 *  	<td>IF item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番１</td>
 *  	<td>IF branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番２</td>
 *  	<td>IF branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番３</td>
 *  	<td>IF branch No. 3</td>
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
 *  	<td>arr_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷日時</td>
 *  	<td>Receipt date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>first_gr_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最古入庫日</td>
 *  	<td>Oldest GR date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>vld_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効期限</td>
 *  	<td>Expiration date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lmt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>使用期限</td>
 *  	<td>Usage expiration date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lmt_dt_frm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>起算日</td>
 *  	<td>Base date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注ＮＯ</td>
 *  	<td>PO No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sppl_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ発注先ＣＤ</td>
 *  	<td>IF supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先名</td>
 *  	<td>Supplier name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_maker_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦメーカＣＤ</td>
 *  	<td>IF maker cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>maker_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メーカ名</td>
 *  	<td>Maker name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所ＣＤ</td>
 *  	<td>Mfg. location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造場所ＣＤ</td>
 *  	<td>IF mfg. location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所名</td>
 *  	<td>Mfg. location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>to_site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_to_site_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ工場・物流倉庫ＣＤ</td>
 *  	<td>IF factory/distribution warehouse cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>to_site_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名</td>
 *  	<td>Factory/Distribution warehouse name</td>
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
 *  	<td>pack_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位数量</td>
 *  	<td>SKU qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位ＣＤ</td>
 *  	<td>SKU cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ荷姿単位ＣＤ</td>
 *  	<td>IF SKU cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pack_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位名</td>
 *  	<td>SKU name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ基準単位ＣＤ</td>
 *  	<td>IF base unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位名</td>
 *  	<td>Base unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_lst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査指図リストＮＯ</td>
 *  	<td>Inspection order list No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図日</td>
 *  	<td>Order date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図部門ＣＤ</td>
 *  	<td>Order dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_inst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ指図部門ＣＤ</td>
 *  	<td>IF order dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図部門名</td>
 *  	<td>Order dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図担当者ＣＤ</td>
 *  	<td>Order PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_inst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ指図担当者ＣＤ</td>
 *  	<td>IF order PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図担当者名</td>
 *  	<td>Order PIC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元部門ＣＤ</td>
 *  	<td>Creating source dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_src_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ作成元部門ＣＤ</td>
 *  	<td>IF creating source dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元部門名</td>
 *  	<td>Creating source dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元担当者ＣＤ</td>
 *  	<td>Creating source PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_src_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ作成元担当者ＣＤ</td>
 *  	<td>IF creating source PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元担当者名</td>
 *  	<td>Creating source PIC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>master_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マスタ適用日</td>
 *  	<td>Master application date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造着手予定日時</td>
 *  	<td>Scheduled mfg. start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造終了予定日時</td>
 *  	<td>Scheduled mfg. end date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_st_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査開始予定日時</td>
 *  	<td>Scheduled inspection start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_end_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査終了予定日時</td>
 *  	<td>Scheduled inspection end date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査パタンＣＤ</td>
 *  	<td>Inspection pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_ptn_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査パタン名</td>
 *  	<td>Inspection pattern name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_req_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>規格検査必須ＦＬＧ</td>
 *  	<td>Specific inspection required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cnf_req_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>規格実績確認必須ＦＬＧ</td>
 *  	<td>Specific result check required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_std_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>規格書ＮＯ</td>
 *  	<td>Specific inspection No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>plnt_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場出荷承認対象ＦＬＧ</td>
 *  	<td>For factory release approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_rslt_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査成績書発行済ＦＬＧ</td>
 *  	<td>Inspection report printed flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_rslt_prnt_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査成績書発行日時</td>
 *  	<td>Inspection report printed date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査成績書連番</td>
 *  	<td>Inspection report sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lmt_up_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期限再検査ＦＬＧ</td>
 *  	<td>Re-inspection for expiration flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査承認対象ＦＬＧ</td>
 *  	<td>For inspection approval flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査承認状況区分</td>
 *  	<td>Inspection approval status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認日</td>
 *  	<td>Approval date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査承認役割ＣＤ</td>
 *  	<td>Inspection approval role cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_aprv_role_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査承認役割名</td>
 *  	<td>Inspection approval role name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認部門ＣＤ</td>
 *  	<td>Approval dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_aprv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ承認部門ＣＤ</td>
 *  	<td>IF approval dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認部門名</td>
 *  	<td>Approval dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認者ＣＤ</td>
 *  	<td>Approver cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ承認者ＣＤ</td>
 *  	<td>IF approver cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認者名</td>
 *  	<td>Approver name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認理由</td>
 *  	<td>Approval reason</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cont_fctr</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際有効成分係数</td>
 *  	<td>Actual active ingredient coefficient</td>
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
 *  	<td>insp_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査予定ＮＯ</td>
 *  	<td>Inspection schedule No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_no1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元ＮＯ１</td>
 *  	<td>Source No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_no2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元ＮＯ２</td>
 *  	<td>Source No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_no3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元ＮＯ３</td>
 *  	<td>Source No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_no4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元ＮＯ４</td>
 *  	<td>Source No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所ＣＤ（予定）</td>
 *  	<td>Location cd. (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_schd_loc_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ場所ＣＤ（予定）</td>
 *  	<td>IF location cd. (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所名（予定）</td>
 *  	<td>Location name (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>棚・ラインＣＤ（予定）</td>
 *  	<td>Rack/Line cd. (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_schd_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ棚・ラインＣＤ（予定）</td>
 *  	<td>IF rack/line cd. (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>棚・ライン名（予定）</td>
 *  	<td>Rack/Line name (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫着荷先ＣＤ（予定）</td>
 *  	<td>Inventory arriving point cd. (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_schd_stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ在庫着荷先ＣＤ（予定）</td>
 *  	<td>IF inventory arriving point cd. (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_stk_arrv_bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫着荷先名（予定）</td>
 *  	<td>Inventory arriving point name (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１（予定）</td>
 *  	<td>SEIBAN No. 1 (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２（予定）</td>
 *  	<td>SEIBAN No. 2 (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３（予定）</td>
 *  	<td>SEIBAN No. 3 (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４（予定）</td>
 *  	<td>SEIBAN No. 4 (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付ＣＤ（予定）</td>
 *  	<td>Grading cd. (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_schd_gd_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格付ＣＤ（予定）</td>
 *  	<td>IF grading cd. (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_gd_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付名（予定）</td>
 *  	<td>Grading name (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>良品区分（予定）</td>
 *  	<td>Conforming type (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_stk_insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫検査区分（予定）</td>
 *  	<td>Inventory inspection type (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_stk_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫識別区分（予定）</td>
 *  	<td>Inventory identification type (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫取引先ＣＤ（予定）</td>
 *  	<td>Inventory BP cd. (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_schd_stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ在庫取引先ＣＤ（予定）</td>
 *  	<td>IF inventory BP cd. (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_stk_bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫取引先名（予定）</td>
 *  	<td>Inventory BP name (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_pack_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位数量（予定）</td>
 *  	<td>SKU qty. (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位ＣＤ（予定）</td>
 *  	<td>SKU cd. (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_schd_pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ荷姿単位ＣＤ（予定）</td>
 *  	<td>IF SKU cd. (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_pack_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位名（予定）</td>
 *  	<td>SKU name (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位数量（予定）</td>
 *  	<td>Base unit qty. (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ（予定）</td>
 *  	<td>Base unit cd. (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_schd_base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ基準単位ＣＤ（予定）</td>
 *  	<td>IF base unit cd. (Schedule)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_base_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位名（予定）</td>
 *  	<td>Base unit name (Schedule)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所ＣＤ（在庫）</td>
 *  	<td>Location cd. (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_stk_loc_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ場所ＣＤ（在庫）</td>
 *  	<td>IF location cd. (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所名（在庫）</td>
 *  	<td>Location name (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>棚・ラインＣＤ（在庫）</td>
 *  	<td>Rack/Line cd. (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_stk_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ棚・ラインＣＤ（在庫）</td>
 *  	<td>IF rack/line cd. (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>棚・ライン名（在庫）</td>
 *  	<td>Rack/Line name (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫着荷先ＣＤ（在庫）</td>
 *  	<td>Inventory arriving point cd. (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ在庫着荷先ＣＤ（在庫）</td>
 *  	<td>IF inventory arriving point cd. (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_arrv_bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫着荷先名（在庫）</td>
 *  	<td>Inventory arriving point name (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１（在庫）</td>
 *  	<td>SEIBAN No. 1 (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２（在庫）</td>
 *  	<td>SEIBAN No. 2 (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３（在庫）</td>
 *  	<td>SEIBAN No. 3 (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４（在庫）</td>
 *  	<td>SEIBAN No. 4 (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_fix_no_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>確定ＮＯ区分（在庫）</td>
 *  	<td>Firm No. type (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_fix_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>確定ＮＯ（在庫）</td>
 *  	<td>Firm No. (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位ＣＤ（在庫）</td>
 *  	<td>SKU cd. (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_stk_pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ荷姿単位ＣＤ（在庫）</td>
 *  	<td>IF SKU cd. (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_pack_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位名（在庫）</td>
 *  	<td>SKU name (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付ＣＤ（在庫）</td>
 *  	<td>Grading cd. (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_stk_gd_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格付ＣＤ（在庫）</td>
 *  	<td>IF grading cd. (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_gd_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付名（在庫）</td>
 *  	<td>Grading name (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>良品区分（在庫）</td>
 *  	<td>Conforming type (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫検査区分（在庫）</td>
 *  	<td>Inventory inspection type (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫識別区分（在庫）</td>
 *  	<td>Inventory identification type (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫取引先ＣＤ（在庫）</td>
 *  	<td>Inventory BP cd. (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ在庫取引先ＣＤ（在庫）</td>
 *  	<td>IF inventory BP cd. (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫取引先名（在庫）</td>
 *  	<td>Inventory BP name (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_pack_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位数量（在庫）</td>
 *  	<td>SKU qty. (Inventory)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位数量（在庫）</td>
 *  	<td>Base unit qty. (Inventory)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>smpl_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>抜取予定数量</td>
 *  	<td>Sampling scheduled qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>smpl_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>抜取指図数量</td>
 *  	<td>Sampling order qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>own_insp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>参照検査ＮＯ</td>
 *  	<td>Reference inspection No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>own_insp_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>参照検査予定ＮＯ</td>
 *  	<td>Reference inspection schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>org_insp_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>初回検査予定ＮＯ</td>
 *  	<td>Initial inspection schedule No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目オーダＮＯ</td>
 *  	<td>Item order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_prmt_insp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査中使用許可ＦＬＧ</td>
 *  	<td>Allow inspecting use flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_trd_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引ＣＤ</td>
 *  	<td>IF transaction cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引名</td>
 *  	<td>Transaction name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査ＬＴ</td>
 *  	<td>Inspection LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_offst</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査オフセット</td>
 *  	<td>Inspection offset</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査連絡備考</td>
 *  	<td>Inspection contact remarks</td>
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
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１</td>
 *  	<td>Spare CHAR column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２</td>
 *  	<td>Spare CHAR column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３</td>
 *  	<td>Spare CHAR column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目４</td>
 *  	<td>Spare CHAR column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目５</td>
 *  	<td>Spare CHAR column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目６</td>
 *  	<td>Spare CHAR column 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目７</td>
 *  	<td>Spare CHAR column 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目８</td>
 *  	<td>Spare CHAR column 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目９</td>
 *  	<td>Spare CHAR column 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１０</td>
 *  	<td>Spare CHAR column 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１１</td>
 *  	<td>Spare CHAR column 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１２</td>
 *  	<td>Spare CHAR column 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１３</td>
 *  	<td>Spare CHAR column 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１４</td>
 *  	<td>Spare CHAR column 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１５</td>
 *  	<td>Spare CHAR column 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１６</td>
 *  	<td>Spare CHAR column 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１７</td>
 *  	<td>Spare CHAR column 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１８</td>
 *  	<td>Spare CHAR column 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１９</td>
 *  	<td>Spare CHAR column 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２０</td>
 *  	<td>Spare CHAR column 20</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２１</td>
 *  	<td>Spare CHAR column 21</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２２</td>
 *  	<td>Spare CHAR column 22</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２３</td>
 *  	<td>Spare CHAR column 23</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２４</td>
 *  	<td>Spare CHAR column 24</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２５</td>
 *  	<td>Spare CHAR column 25</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２６</td>
 *  	<td>Spare CHAR column 26</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２７</td>
 *  	<td>Spare CHAR column 27</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２８</td>
 *  	<td>Spare CHAR column 28</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２９</td>
 *  	<td>Spare CHAR column 29</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３０</td>
 *  	<td>Spare CHAR column 30</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目１</td>
 *  	<td>Spare NUM column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目２</td>
 *  	<td>Spare NUM column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目３</td>
 *  	<td>Spare NUM column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目４</td>
 *  	<td>Spare NUM column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目５</td>
 *  	<td>Spare NUM column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目１</td>
 *  	<td>Spare DATE column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目２</td>
 *  	<td>Spare DATE column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目３</td>
 *  	<td>Spare DATE column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目４</td>
 *  	<td>Spare DATE column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目５</td>
 *  	<td>Spare DATE column 5</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_INSP_INST_SEND_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_INSP_INST_SEND_IF";

	public static final boolean EX_CTRL = false;
	
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
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public static final String $exe_sts_typ = "exe_sts_typ";
	private static final MCPermColumnInfo _exe_sts_typ = createColumnInfo("exe_sts_typ");
	public final MCStringPermColumn exe_sts_typ = createStringColumn(_exe_sts_typ);
	
	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	private static final MCPermColumnInfo _data_crud_typ = createColumnInfo("data_crud_typ");
	public final MCStringPermColumn data_crud_typ = createStringColumn(_data_crud_typ);
	
	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	private static final MCPermColumnInfo _ext_sys_cd = createColumnInfo("ext_sys_cd");
	public final MCStringPermColumn ext_sys_cd = createStringColumn(_ext_sys_cd);
	
	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	private static final MCPermColumnInfo _insp_no = createColumnInfo("insp_no");
	public final MCStringPermColumn insp_no = createStringColumn(_insp_no);
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public static final String $insp_freq = "insp_freq";
	private static final MCPermColumnInfo _insp_freq = createColumnInfo("insp_freq");
	public final MCNumberPermColumn insp_freq = createNumberColumn(_insp_freq);
	
	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	private static final MCPermColumnInfo _insp_typ = createColumnInfo("insp_typ");
	public final MCStringPermColumn insp_typ = createStringColumn(_insp_typ);
	
	/**
	 * 検査方法区分. Inspection method type.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	private static final MCPermColumnInfo _insp_mtd_typ = createColumnInfo("insp_mtd_typ");
	public final MCStringPermColumn insp_mtd_typ = createStringColumn(_insp_mtd_typ);
	
	/**
	 * 検査状況区分. Inspection status type.<p>
	 *
	 */
	public static final String $insp_sts_typ = "insp_sts_typ";
	private static final MCPermColumnInfo _insp_sts_typ = createColumnInfo("insp_sts_typ");
	public final MCStringPermColumn insp_sts_typ = createStringColumn(_insp_sts_typ);
	
	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public static final String $insp_bind_typ = "insp_bind_typ";
	private static final MCPermColumnInfo _insp_bind_typ = createColumnInfo("insp_bind_typ");
	public final MCStringPermColumn insp_bind_typ = createStringColumn(_insp_bind_typ);
	
	/**
	 * 予定まとめＦＬＧ. Schedule aggregation flg..<p>
	 *
	 */
	public static final String $col_schd_flg = "col_schd_flg";
	private static final MCPermColumnInfo _col_schd_flg = createColumnInfo("col_schd_flg");
	public final MCBooleanPermColumn col_schd_flg = createBooleanColumn(_col_schd_flg);
	
	/**
	 * 検査指図リスト発行済ＦＬＧ. Inspection order list issued flg..<p>
	 *
	 */
	public static final String $insp_lst_prnt_flg = "insp_lst_prnt_flg";
	private static final MCPermColumnInfo _insp_lst_prnt_flg = createColumnInfo("insp_lst_prnt_flg");
	public final MCBooleanPermColumn insp_lst_prnt_flg = createBooleanColumn(_insp_lst_prnt_flg);
	
	/**
	 * 検査指図リスト発行日時. Inspection order list issue date and time.<p>
	 *
	 */
	public static final String $insp_lst_prnt_tm = "insp_lst_prnt_tm";
	private static final MCPermColumnInfo _insp_lst_prnt_tm = createColumnInfo("insp_lst_prnt_tm");
	public final MCDatePermColumn insp_lst_prnt_tm = createDateColumn(_insp_lst_prnt_tm);
	
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
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
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
	 * 入荷日時. Receipt date and time.<p>
	 *
	 */
	public static final String $arr_tm = "arr_tm";
	private static final MCPermColumnInfo _arr_tm = createColumnInfo("arr_tm");
	public final MCDatePermColumn arr_tm = createDateColumn(_arr_tm);
	
	/**
	 * 最古入庫日. Oldest GR date.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	private static final MCPermColumnInfo _first_gr_dt = createColumnInfo("first_gr_dt");
	public final MCDatePermColumn first_gr_dt = createDateColumn(_first_gr_dt);
	
	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	private static final MCPermColumnInfo _vld_dt = createColumnInfo("vld_dt");
	public final MCDatePermColumn vld_dt = createDateColumn(_vld_dt);
	
	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	private static final MCPermColumnInfo _lmt_dt = createColumnInfo("lmt_dt");
	public final MCDatePermColumn lmt_dt = createDateColumn(_lmt_dt);
	
	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public static final String $lmt_dt_frm = "lmt_dt_frm";
	private static final MCPermColumnInfo _lmt_dt_frm = createColumnInfo("lmt_dt_frm");
	public final MCDatePermColumn lmt_dt_frm = createDateColumn(_lmt_dt_frm);
	
	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public static final String $po_no = "po_no";
	private static final MCPermColumnInfo _po_no = createColumnInfo("po_no");
	public final MCStringPermColumn po_no = createStringColumn(_po_no);
	
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
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	private static final MCPermColumnInfo _maker_cd = createColumnInfo("maker_cd");
	public final MCStringPermColumn maker_cd = createStringColumn(_maker_cd);
	
	/**
	 * ＩＦメーカＣＤ. IF maker cd..<p>
	 *
	 */
	public static final String $if_maker_cd = "if_maker_cd";
	private static final MCPermColumnInfo _if_maker_cd = createColumnInfo("if_maker_cd");
	public final MCStringPermColumn if_maker_cd = createStringColumn(_if_maker_cd);
	
	/**
	 * メーカ名. Maker name.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	private static final MCPermColumnInfo _maker_nm = createColumnInfo("maker_nm");
	public final MCStringPermColumn maker_nm = createStringColumn(_maker_nm);
	
	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	private static final MCPermColumnInfo _mfg_loc_cd = createColumnInfo("mfg_loc_cd");
	public final MCStringPermColumn mfg_loc_cd = createStringColumn(_mfg_loc_cd);
	
	/**
	 * ＩＦ製造場所ＣＤ. IF mfg. location cd..<p>
	 *
	 */
	public static final String $if_mfg_loc_cd = "if_mfg_loc_cd";
	private static final MCPermColumnInfo _if_mfg_loc_cd = createColumnInfo("if_mfg_loc_cd");
	public final MCStringPermColumn if_mfg_loc_cd = createStringColumn(_if_mfg_loc_cd);
	
	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	private static final MCPermColumnInfo _mfg_loc_nm = createColumnInfo("mfg_loc_nm");
	public final MCStringPermColumn mfg_loc_nm = createStringColumn(_mfg_loc_nm);
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	private static final MCPermColumnInfo _to_site_cd = createColumnInfo("to_site_cd");
	public final MCStringPermColumn to_site_cd = createStringColumn(_to_site_cd);
	
	/**
	 * ＩＦ工場・物流倉庫ＣＤ. IF factory/distribution warehouse cd..<p>
	 *
	 */
	public static final String $if_to_site_cd = "if_to_site_cd";
	private static final MCPermColumnInfo _if_to_site_cd = createColumnInfo("if_to_site_cd");
	public final MCStringPermColumn if_to_site_cd = createStringColumn(_if_to_site_cd);
	
	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public static final String $to_site_nm = "to_site_nm";
	private static final MCPermColumnInfo _to_site_nm = createColumnInfo("to_site_nm");
	public final MCStringPermColumn to_site_nm = createStringColumn(_to_site_nm);
	
	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	private static final MCPermColumnInfo _bp_lot_no = createColumnInfo("bp_lot_no");
	public final MCStringPermColumn bp_lot_no = createStringColumn(_bp_lot_no);
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	private static final MCPermColumnInfo _pack_unit_qty = createColumnInfo("pack_unit_qty");
	public final MCNumberPermColumn pack_unit_qty = createNumberColumn(_pack_unit_qty);
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	private static final MCPermColumnInfo _pack_unit_cd = createColumnInfo("pack_unit_cd");
	public final MCStringPermColumn pack_unit_cd = createStringColumn(_pack_unit_cd);
	
	/**
	 * ＩＦ荷姿単位ＣＤ. IF SKU cd..<p>
	 *
	 */
	public static final String $if_pack_unit_cd = "if_pack_unit_cd";
	private static final MCPermColumnInfo _if_pack_unit_cd = createColumnInfo("if_pack_unit_cd");
	public final MCStringPermColumn if_pack_unit_cd = createStringColumn(_if_pack_unit_cd);
	
	/**
	 * 荷姿単位名. SKU name.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	private static final MCPermColumnInfo _pack_unit_nm = createColumnInfo("pack_unit_nm");
	public final MCStringPermColumn pack_unit_nm = createStringColumn(_pack_unit_nm);
	
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
	 * ＩＦ基準単位ＣＤ. IF base unit cd..<p>
	 *
	 */
	public static final String $if_base_unit_cd = "if_base_unit_cd";
	private static final MCPermColumnInfo _if_base_unit_cd = createColumnInfo("if_base_unit_cd");
	public final MCStringPermColumn if_base_unit_cd = createStringColumn(_if_base_unit_cd);
	
	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	private static final MCPermColumnInfo _base_unit_nm = createColumnInfo("base_unit_nm");
	public final MCStringPermColumn base_unit_nm = createStringColumn(_base_unit_nm);
	
	/**
	 * 検査指図リストＮＯ. Inspection order list No..<p>
	 *
	 */
	public static final String $insp_lst_no = "insp_lst_no";
	private static final MCPermColumnInfo _insp_lst_no = createColumnInfo("insp_lst_no");
	public final MCStringPermColumn insp_lst_no = createStringColumn(_insp_lst_no);
	
	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	private static final MCPermColumnInfo _inst_dt = createColumnInfo("inst_dt");
	public final MCDatePermColumn inst_dt = createDateColumn(_inst_dt);
	
	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	private static final MCPermColumnInfo _inst_dpt_cd = createColumnInfo("inst_dpt_cd");
	public final MCStringPermColumn inst_dpt_cd = createStringColumn(_inst_dpt_cd);
	
	/**
	 * ＩＦ指図部門ＣＤ. IF order dept. cd..<p>
	 *
	 */
	public static final String $if_inst_dpt_cd = "if_inst_dpt_cd";
	private static final MCPermColumnInfo _if_inst_dpt_cd = createColumnInfo("if_inst_dpt_cd");
	public final MCStringPermColumn if_inst_dpt_cd = createStringColumn(_if_inst_dpt_cd);
	
	/**
	 * 指図部門名. Order dept. name.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	private static final MCPermColumnInfo _inst_dpt_nm = createColumnInfo("inst_dpt_nm");
	public final MCStringPermColumn inst_dpt_nm = createStringColumn(_inst_dpt_nm);
	
	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	private static final MCPermColumnInfo _inst_usr_cd = createColumnInfo("inst_usr_cd");
	public final MCStringPermColumn inst_usr_cd = createStringColumn(_inst_usr_cd);
	
	/**
	 * ＩＦ指図担当者ＣＤ. IF order PIC cd..<p>
	 *
	 */
	public static final String $if_inst_usr_cd = "if_inst_usr_cd";
	private static final MCPermColumnInfo _if_inst_usr_cd = createColumnInfo("if_inst_usr_cd");
	public final MCStringPermColumn if_inst_usr_cd = createStringColumn(_if_inst_usr_cd);
	
	/**
	 * 指図担当者名. Order PIC name.<p>
	 *
	 */
	public static final String $inst_usr_nm = "inst_usr_nm";
	private static final MCPermColumnInfo _inst_usr_nm = createColumnInfo("inst_usr_nm");
	public final MCStringPermColumn inst_usr_nm = createStringColumn(_inst_usr_nm);
	
	/**
	 * 作成元部門ＣＤ. Creating source dept. cd..<p>
	 *
	 */
	public static final String $src_dpt_cd = "src_dpt_cd";
	private static final MCPermColumnInfo _src_dpt_cd = createColumnInfo("src_dpt_cd");
	public final MCStringPermColumn src_dpt_cd = createStringColumn(_src_dpt_cd);
	
	/**
	 * ＩＦ作成元部門ＣＤ. IF creating source dept. cd..<p>
	 *
	 */
	public static final String $if_src_dpt_cd = "if_src_dpt_cd";
	private static final MCPermColumnInfo _if_src_dpt_cd = createColumnInfo("if_src_dpt_cd");
	public final MCStringPermColumn if_src_dpt_cd = createStringColumn(_if_src_dpt_cd);
	
	/**
	 * 作成元部門名. Creating source dept. name.<p>
	 *
	 */
	public static final String $src_dpt_nm = "src_dpt_nm";
	private static final MCPermColumnInfo _src_dpt_nm = createColumnInfo("src_dpt_nm");
	public final MCStringPermColumn src_dpt_nm = createStringColumn(_src_dpt_nm);
	
	/**
	 * 作成元担当者ＣＤ. Creating source PIC cd..<p>
	 *
	 */
	public static final String $src_usr_cd = "src_usr_cd";
	private static final MCPermColumnInfo _src_usr_cd = createColumnInfo("src_usr_cd");
	public final MCStringPermColumn src_usr_cd = createStringColumn(_src_usr_cd);
	
	/**
	 * ＩＦ作成元担当者ＣＤ. IF creating source PIC cd..<p>
	 *
	 */
	public static final String $if_src_usr_cd = "if_src_usr_cd";
	private static final MCPermColumnInfo _if_src_usr_cd = createColumnInfo("if_src_usr_cd");
	public final MCStringPermColumn if_src_usr_cd = createStringColumn(_if_src_usr_cd);
	
	/**
	 * 作成元担当者名. Creating source PIC name.<p>
	 *
	 */
	public static final String $src_usr_nm = "src_usr_nm";
	private static final MCPermColumnInfo _src_usr_nm = createColumnInfo("src_usr_nm");
	public final MCStringPermColumn src_usr_nm = createStringColumn(_src_usr_nm);
	
	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	private static final MCPermColumnInfo _master_dt = createColumnInfo("master_dt");
	public final MCDatePermColumn master_dt = createDateColumn(_master_dt);
	
	/**
	 * 製造着手予定日時. Scheduled mfg. start date and time.<p>
	 *
	 */
	public static final String $mfg_st_schd_tm = "mfg_st_schd_tm";
	private static final MCPermColumnInfo _mfg_st_schd_tm = createColumnInfo("mfg_st_schd_tm");
	public final MCDatePermColumn mfg_st_schd_tm = createDateColumn(_mfg_st_schd_tm);
	
	/**
	 * 製造終了予定日時. Scheduled mfg. end date and time.<p>
	 *
	 */
	public static final String $mfg_end_schd_tm = "mfg_end_schd_tm";
	private static final MCPermColumnInfo _mfg_end_schd_tm = createColumnInfo("mfg_end_schd_tm");
	public final MCDatePermColumn mfg_end_schd_tm = createDateColumn(_mfg_end_schd_tm);
	
	/**
	 * 検査開始予定日時. Scheduled inspection start date and time.<p>
	 *
	 */
	public static final String $insp_st_tm = "insp_st_tm";
	private static final MCPermColumnInfo _insp_st_tm = createColumnInfo("insp_st_tm");
	public final MCDatePermColumn insp_st_tm = createDateColumn(_insp_st_tm);
	
	/**
	 * 検査終了予定日時. Scheduled inspection end date and time.<p>
	 *
	 */
	public static final String $insp_end_tm = "insp_end_tm";
	private static final MCPermColumnInfo _insp_end_tm = createColumnInfo("insp_end_tm");
	public final MCDatePermColumn insp_end_tm = createDateColumn(_insp_end_tm);
	
	/**
	 * 検査パタンＣＤ. Inspection pattern cd..<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	private static final MCPermColumnInfo _insp_ptn_cd = createColumnInfo("insp_ptn_cd");
	public final MCStringPermColumn insp_ptn_cd = createStringColumn(_insp_ptn_cd);
	
	/**
	 * 検査パタン名. Inspection pattern name.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	private static final MCPermColumnInfo _insp_ptn_nm = createColumnInfo("insp_ptn_nm");
	public final MCStringPermColumn insp_ptn_nm = createStringColumn(_insp_ptn_nm);
	
	/**
	 * 規格検査必須ＦＬＧ. Specific inspection required flg..<p>
	 *
	 */
	public static final String $std_req_flg = "std_req_flg";
	private static final MCPermColumnInfo _std_req_flg = createColumnInfo("std_req_flg");
	public final MCBooleanPermColumn std_req_flg = createBooleanColumn(_std_req_flg);
	
	/**
	 * 規格実績確認必須ＦＬＧ. Specific result check required flg..<p>
	 *
	 */
	public static final String $std_cnf_req_flg = "std_cnf_req_flg";
	private static final MCPermColumnInfo _std_cnf_req_flg = createColumnInfo("std_cnf_req_flg");
	public final MCBooleanPermColumn std_cnf_req_flg = createBooleanColumn(_std_cnf_req_flg);
	
	/**
	 * 規格書ＮＯ. Specific inspection No..<p>
	 *
	 */
	public static final String $insp_std_no = "insp_std_no";
	private static final MCPermColumnInfo _insp_std_no = createColumnInfo("insp_std_no");
	public final MCStringPermColumn insp_std_no = createStringColumn(_insp_std_no);
	
	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public static final String $plnt_aprv_flg = "plnt_aprv_flg";
	private static final MCPermColumnInfo _plnt_aprv_flg = createColumnInfo("plnt_aprv_flg");
	public final MCBooleanPermColumn plnt_aprv_flg = createBooleanColumn(_plnt_aprv_flg);
	
	/**
	 * 検査成績書発行済ＦＬＧ. Inspection report printed flg..<p>
	 *
	 */
	public static final String $insp_rslt_prnt_flg = "insp_rslt_prnt_flg";
	private static final MCPermColumnInfo _insp_rslt_prnt_flg = createColumnInfo("insp_rslt_prnt_flg");
	public final MCBooleanPermColumn insp_rslt_prnt_flg = createBooleanColumn(_insp_rslt_prnt_flg);
	
	/**
	 * 検査成績書発行日時. Inspection report printed date and time.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_tm = "insp_rslt_prnt_tm";
	private static final MCPermColumnInfo _insp_rslt_prnt_tm = createColumnInfo("insp_rslt_prnt_tm");
	public final MCDatePermColumn insp_rslt_prnt_tm = createDateColumn(_insp_rslt_prnt_tm);
	
	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public static final String $seq = "seq";
	private static final MCPermColumnInfo _seq = createColumnInfo("seq");
	public final MCNumberPermColumn seq = createNumberColumn(_seq);
	
	/**
	 * 期限再検査ＦＬＧ. Re-inspection for expiration flg..<p>
	 *
	 */
	public static final String $lmt_up_flg = "lmt_up_flg";
	private static final MCPermColumnInfo _lmt_up_flg = createColumnInfo("lmt_up_flg");
	public final MCBooleanPermColumn lmt_up_flg = createBooleanColumn(_lmt_up_flg);
	
	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public static final String $insp_aprv_flg = "insp_aprv_flg";
	private static final MCPermColumnInfo _insp_aprv_flg = createColumnInfo("insp_aprv_flg");
	public final MCBooleanPermColumn insp_aprv_flg = createBooleanColumn(_insp_aprv_flg);
	
	/**
	 * 検査承認状況区分. Inspection approval status type.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	private static final MCPermColumnInfo _insp_aprv_sts_typ = createColumnInfo("insp_aprv_sts_typ");
	public final MCStringPermColumn insp_aprv_sts_typ = createStringColumn(_insp_aprv_sts_typ);
	
	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	private static final MCPermColumnInfo _aprv_dt = createColumnInfo("aprv_dt");
	public final MCDatePermColumn aprv_dt = createDateColumn(_aprv_dt);
	
	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public static final String $insp_aprv_role_cd = "insp_aprv_role_cd";
	private static final MCPermColumnInfo _insp_aprv_role_cd = createColumnInfo("insp_aprv_role_cd");
	public final MCStringPermColumn insp_aprv_role_cd = createStringColumn(_insp_aprv_role_cd);
	
	/**
	 * 検査承認役割名. Inspection approval role name.<p>
	 *
	 */
	public static final String $insp_aprv_role_nm = "insp_aprv_role_nm";
	private static final MCPermColumnInfo _insp_aprv_role_nm = createColumnInfo("insp_aprv_role_nm");
	public final MCStringPermColumn insp_aprv_role_nm = createStringColumn(_insp_aprv_role_nm);
	
	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	private static final MCPermColumnInfo _aprv_dpt_cd = createColumnInfo("aprv_dpt_cd");
	public final MCStringPermColumn aprv_dpt_cd = createStringColumn(_aprv_dpt_cd);
	
	/**
	 * ＩＦ承認部門ＣＤ. IF approval dept. cd..<p>
	 *
	 */
	public static final String $if_aprv_dpt_cd = "if_aprv_dpt_cd";
	private static final MCPermColumnInfo _if_aprv_dpt_cd = createColumnInfo("if_aprv_dpt_cd");
	public final MCStringPermColumn if_aprv_dpt_cd = createStringColumn(_if_aprv_dpt_cd);
	
	/**
	 * 承認部門名. Approval dept. name.<p>
	 *
	 */
	public static final String $aprv_dpt_nm = "aprv_dpt_nm";
	private static final MCPermColumnInfo _aprv_dpt_nm = createColumnInfo("aprv_dpt_nm");
	public final MCStringPermColumn aprv_dpt_nm = createStringColumn(_aprv_dpt_nm);
	
	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	private static final MCPermColumnInfo _aprv_usr_cd = createColumnInfo("aprv_usr_cd");
	public final MCStringPermColumn aprv_usr_cd = createStringColumn(_aprv_usr_cd);
	
	/**
	 * ＩＦ承認者ＣＤ. IF approver cd..<p>
	 *
	 */
	public static final String $if_aprv_usr_cd = "if_aprv_usr_cd";
	private static final MCPermColumnInfo _if_aprv_usr_cd = createColumnInfo("if_aprv_usr_cd");
	public final MCStringPermColumn if_aprv_usr_cd = createStringColumn(_if_aprv_usr_cd);
	
	/**
	 * 承認者名. Approver name.<p>
	 *
	 */
	public static final String $aprv_usr_nm = "aprv_usr_nm";
	private static final MCPermColumnInfo _aprv_usr_nm = createColumnInfo("aprv_usr_nm");
	public final MCStringPermColumn aprv_usr_nm = createStringColumn(_aprv_usr_nm);
	
	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";
	private static final MCPermColumnInfo _aprv_rsn = createColumnInfo("aprv_rsn");
	public final MCStringPermColumn aprv_rsn = createStringColumn(_aprv_rsn);
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	private static final MCPermColumnInfo _act_cont_fctr = createColumnInfo("act_cont_fctr");
	public final MCNumberPermColumn act_cont_fctr = createNumberColumn(_act_cont_fctr);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 検査予定ＮＯ. Inspection schedule No..<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	private static final MCPermColumnInfo _insp_schd_no = createColumnInfo("insp_schd_no");
	public final MCStringPermColumn insp_schd_no = createStringColumn(_insp_schd_no);
	
	/**
	 * 作成元ＮＯ１. Source No. 1.<p>
	 *
	 */
	public static final String $src_no1 = "src_no1";
	private static final MCPermColumnInfo _src_no1 = createColumnInfo("src_no1");
	public final MCStringPermColumn src_no1 = createStringColumn(_src_no1);
	
	/**
	 * 作成元ＮＯ２. Source No. 2.<p>
	 *
	 */
	public static final String $src_no2 = "src_no2";
	private static final MCPermColumnInfo _src_no2 = createColumnInfo("src_no2");
	public final MCStringPermColumn src_no2 = createStringColumn(_src_no2);
	
	/**
	 * 作成元ＮＯ３. Source No. 3.<p>
	 *
	 */
	public static final String $src_no3 = "src_no3";
	private static final MCPermColumnInfo _src_no3 = createColumnInfo("src_no3");
	public final MCStringPermColumn src_no3 = createStringColumn(_src_no3);
	
	/**
	 * 作成元ＮＯ４. Source No. 4.<p>
	 *
	 */
	public static final String $src_no4 = "src_no4";
	private static final MCPermColumnInfo _src_no4 = createColumnInfo("src_no4");
	public final MCStringPermColumn src_no4 = createStringColumn(_src_no4);
	
	/**
	 * 場所ＣＤ（予定）. Location cd. (Schedule).<p>
	 *
	 */
	public static final String $schd_loc_cd = "schd_loc_cd";
	private static final MCPermColumnInfo _schd_loc_cd = createColumnInfo("schd_loc_cd");
	public final MCStringPermColumn schd_loc_cd = createStringColumn(_schd_loc_cd);
	
	/**
	 * ＩＦ場所ＣＤ（予定）. IF location cd. (Schedule).<p>
	 *
	 */
	public static final String $if_schd_loc_cd = "if_schd_loc_cd";
	private static final MCPermColumnInfo _if_schd_loc_cd = createColumnInfo("if_schd_loc_cd");
	public final MCStringPermColumn if_schd_loc_cd = createStringColumn(_if_schd_loc_cd);
	
	/**
	 * 場所名（予定）. Location name (Schedule).<p>
	 *
	 */
	public static final String $schd_loc_nm = "schd_loc_nm";
	private static final MCPermColumnInfo _schd_loc_nm = createColumnInfo("schd_loc_nm");
	public final MCStringPermColumn schd_loc_nm = createStringColumn(_schd_loc_nm);
	
	/**
	 * 棚・ラインＣＤ（予定）. Rack/Line cd. (Schedule).<p>
	 *
	 */
	public static final String $schd_str_ln_cd = "schd_str_ln_cd";
	private static final MCPermColumnInfo _schd_str_ln_cd = createColumnInfo("schd_str_ln_cd");
	public final MCStringPermColumn schd_str_ln_cd = createStringColumn(_schd_str_ln_cd);
	
	/**
	 * ＩＦ棚・ラインＣＤ（予定）. IF rack/line cd. (Schedule).<p>
	 *
	 */
	public static final String $if_schd_str_ln_cd = "if_schd_str_ln_cd";
	private static final MCPermColumnInfo _if_schd_str_ln_cd = createColumnInfo("if_schd_str_ln_cd");
	public final MCStringPermColumn if_schd_str_ln_cd = createStringColumn(_if_schd_str_ln_cd);
	
	/**
	 * 棚・ライン名（予定）. Rack/Line name (Schedule).<p>
	 *
	 */
	public static final String $schd_str_ln_nm = "schd_str_ln_nm";
	private static final MCPermColumnInfo _schd_str_ln_nm = createColumnInfo("schd_str_ln_nm");
	public final MCStringPermColumn schd_str_ln_nm = createStringColumn(_schd_str_ln_nm);
	
	/**
	 * 在庫着荷先ＣＤ（予定）. Inventory arriving point cd. (Schedule).<p>
	 *
	 */
	public static final String $schd_stk_arrv_bp_cd = "schd_stk_arrv_bp_cd";
	private static final MCPermColumnInfo _schd_stk_arrv_bp_cd = createColumnInfo("schd_stk_arrv_bp_cd");
	public final MCStringPermColumn schd_stk_arrv_bp_cd = createStringColumn(_schd_stk_arrv_bp_cd);
	
	/**
	 * ＩＦ在庫着荷先ＣＤ（予定）. IF inventory arriving point cd. (Schedule).<p>
	 *
	 */
	public static final String $if_schd_stk_arrv_bp_cd = "if_schd_stk_arrv_bp_cd";
	private static final MCPermColumnInfo _if_schd_stk_arrv_bp_cd = createColumnInfo("if_schd_stk_arrv_bp_cd");
	public final MCStringPermColumn if_schd_stk_arrv_bp_cd = createStringColumn(_if_schd_stk_arrv_bp_cd);
	
	/**
	 * 在庫着荷先名（予定）. Inventory arriving point name (Schedule).<p>
	 *
	 */
	public static final String $schd_stk_arrv_bp_nm = "schd_stk_arrv_bp_nm";
	private static final MCPermColumnInfo _schd_stk_arrv_bp_nm = createColumnInfo("schd_stk_arrv_bp_nm");
	public final MCStringPermColumn schd_stk_arrv_bp_nm = createStringColumn(_schd_stk_arrv_bp_nm);
	
	/**
	 * 手配ＮＯ１（予定）. SEIBAN No. 1 (Schedule).<p>
	 *
	 */
	public static final String $schd_sno1 = "schd_sno1";
	private static final MCPermColumnInfo _schd_sno1 = createColumnInfo("schd_sno1");
	public final MCStringPermColumn schd_sno1 = createStringColumn(_schd_sno1);
	
	/**
	 * 手配ＮＯ２（予定）. SEIBAN No. 2 (Schedule).<p>
	 *
	 */
	public static final String $schd_sno2 = "schd_sno2";
	private static final MCPermColumnInfo _schd_sno2 = createColumnInfo("schd_sno2");
	public final MCStringPermColumn schd_sno2 = createStringColumn(_schd_sno2);
	
	/**
	 * 手配ＮＯ３（予定）. SEIBAN No. 3 (Schedule).<p>
	 *
	 */
	public static final String $schd_sno3 = "schd_sno3";
	private static final MCPermColumnInfo _schd_sno3 = createColumnInfo("schd_sno3");
	public final MCStringPermColumn schd_sno3 = createStringColumn(_schd_sno3);
	
	/**
	 * 手配ＮＯ４（予定）. SEIBAN No. 4 (Schedule).<p>
	 *
	 */
	public static final String $schd_sno4 = "schd_sno4";
	private static final MCPermColumnInfo _schd_sno4 = createColumnInfo("schd_sno4");
	public final MCStringPermColumn schd_sno4 = createStringColumn(_schd_sno4);
	
	/**
	 * 格付ＣＤ（予定）. Grading cd. (Schedule).<p>
	 *
	 */
	public static final String $schd_gd_cd = "schd_gd_cd";
	private static final MCPermColumnInfo _schd_gd_cd = createColumnInfo("schd_gd_cd");
	public final MCStringPermColumn schd_gd_cd = createStringColumn(_schd_gd_cd);
	
	/**
	 * ＩＦ格付ＣＤ（予定）. IF grading cd. (Schedule).<p>
	 *
	 */
	public static final String $if_schd_gd_cd = "if_schd_gd_cd";
	private static final MCPermColumnInfo _if_schd_gd_cd = createColumnInfo("if_schd_gd_cd");
	public final MCStringPermColumn if_schd_gd_cd = createStringColumn(_if_schd_gd_cd);
	
	/**
	 * 格付名（予定）. Grading name (Schedule).<p>
	 *
	 */
	public static final String $schd_gd_nm = "schd_gd_nm";
	private static final MCPermColumnInfo _schd_gd_nm = createColumnInfo("schd_gd_nm");
	public final MCStringPermColumn schd_gd_nm = createStringColumn(_schd_gd_nm);
	
	/**
	 * 良品区分（予定）. Conforming type (Schedule).<p>
	 *
	 */
	public static final String $schd_quality_typ = "schd_quality_typ";
	private static final MCPermColumnInfo _schd_quality_typ = createColumnInfo("schd_quality_typ");
	public final MCStringPermColumn schd_quality_typ = createStringColumn(_schd_quality_typ);
	
	/**
	 * 在庫検査区分（予定）. Inventory inspection type (Schedule).<p>
	 *
	 */
	public static final String $schd_stk_insp_typ = "schd_stk_insp_typ";
	private static final MCPermColumnInfo _schd_stk_insp_typ = createColumnInfo("schd_stk_insp_typ");
	public final MCStringPermColumn schd_stk_insp_typ = createStringColumn(_schd_stk_insp_typ);
	
	/**
	 * 在庫識別区分（予定）. Inventory identification type (Schedule).<p>
	 *
	 */
	public static final String $schd_stk_id_typ = "schd_stk_id_typ";
	private static final MCPermColumnInfo _schd_stk_id_typ = createColumnInfo("schd_stk_id_typ");
	public final MCStringPermColumn schd_stk_id_typ = createStringColumn(_schd_stk_id_typ);
	
	/**
	 * 在庫取引先ＣＤ（予定）. Inventory BP cd. (Schedule).<p>
	 *
	 */
	public static final String $schd_stk_bp_cd = "schd_stk_bp_cd";
	private static final MCPermColumnInfo _schd_stk_bp_cd = createColumnInfo("schd_stk_bp_cd");
	public final MCStringPermColumn schd_stk_bp_cd = createStringColumn(_schd_stk_bp_cd);
	
	/**
	 * ＩＦ在庫取引先ＣＤ（予定）. IF inventory BP cd. (Schedule).<p>
	 *
	 */
	public static final String $if_schd_stk_bp_cd = "if_schd_stk_bp_cd";
	private static final MCPermColumnInfo _if_schd_stk_bp_cd = createColumnInfo("if_schd_stk_bp_cd");
	public final MCStringPermColumn if_schd_stk_bp_cd = createStringColumn(_if_schd_stk_bp_cd);
	
	/**
	 * 在庫取引先名（予定）. Inventory BP name (Schedule).<p>
	 *
	 */
	public static final String $schd_stk_bp_nm = "schd_stk_bp_nm";
	private static final MCPermColumnInfo _schd_stk_bp_nm = createColumnInfo("schd_stk_bp_nm");
	public final MCStringPermColumn schd_stk_bp_nm = createStringColumn(_schd_stk_bp_nm);
	
	/**
	 * 荷姿単位数量（予定）. SKU qty. (Schedule).<p>
	 *
	 */
	public static final String $schd_pack_unit_qty = "schd_pack_unit_qty";
	private static final MCPermColumnInfo _schd_pack_unit_qty = createColumnInfo("schd_pack_unit_qty");
	public final MCNumberPermColumn schd_pack_unit_qty = createNumberColumn(_schd_pack_unit_qty);
	
	/**
	 * 荷姿単位ＣＤ（予定）. SKU cd. (Schedule).<p>
	 *
	 */
	public static final String $schd_pack_unit_cd = "schd_pack_unit_cd";
	private static final MCPermColumnInfo _schd_pack_unit_cd = createColumnInfo("schd_pack_unit_cd");
	public final MCStringPermColumn schd_pack_unit_cd = createStringColumn(_schd_pack_unit_cd);
	
	/**
	 * ＩＦ荷姿単位ＣＤ（予定）. IF SKU cd. (Schedule).<p>
	 *
	 */
	public static final String $if_schd_pack_unit_cd = "if_schd_pack_unit_cd";
	private static final MCPermColumnInfo _if_schd_pack_unit_cd = createColumnInfo("if_schd_pack_unit_cd");
	public final MCStringPermColumn if_schd_pack_unit_cd = createStringColumn(_if_schd_pack_unit_cd);
	
	/**
	 * 荷姿単位名（予定）. SKU name (Schedule).<p>
	 *
	 */
	public static final String $schd_pack_unit_nm = "schd_pack_unit_nm";
	private static final MCPermColumnInfo _schd_pack_unit_nm = createColumnInfo("schd_pack_unit_nm");
	public final MCStringPermColumn schd_pack_unit_nm = createStringColumn(_schd_pack_unit_nm);
	
	/**
	 * 基準単位数量（予定）. Base unit qty. (Schedule).<p>
	 *
	 */
	public static final String $schd_base_unit_qty = "schd_base_unit_qty";
	private static final MCPermColumnInfo _schd_base_unit_qty = createColumnInfo("schd_base_unit_qty");
	public final MCNumberPermColumn schd_base_unit_qty = createNumberColumn(_schd_base_unit_qty);
	
	/**
	 * 基準単位ＣＤ（予定）. Base unit cd. (Schedule).<p>
	 *
	 */
	public static final String $schd_base_unit_cd = "schd_base_unit_cd";
	private static final MCPermColumnInfo _schd_base_unit_cd = createColumnInfo("schd_base_unit_cd");
	public final MCStringPermColumn schd_base_unit_cd = createStringColumn(_schd_base_unit_cd);
	
	/**
	 * ＩＦ基準単位ＣＤ（予定）. IF base unit cd. (Schedule).<p>
	 *
	 */
	public static final String $if_schd_base_unit_cd = "if_schd_base_unit_cd";
	private static final MCPermColumnInfo _if_schd_base_unit_cd = createColumnInfo("if_schd_base_unit_cd");
	public final MCStringPermColumn if_schd_base_unit_cd = createStringColumn(_if_schd_base_unit_cd);
	
	/**
	 * 基準単位名（予定）. Base unit name (Schedule).<p>
	 *
	 */
	public static final String $schd_base_unit_nm = "schd_base_unit_nm";
	private static final MCPermColumnInfo _schd_base_unit_nm = createColumnInfo("schd_base_unit_nm");
	public final MCStringPermColumn schd_base_unit_nm = createStringColumn(_schd_base_unit_nm);
	
	/**
	 * 場所ＣＤ（在庫）. Location cd. (Inventory).<p>
	 *
	 */
	public static final String $stk_loc_cd = "stk_loc_cd";
	private static final MCPermColumnInfo _stk_loc_cd = createColumnInfo("stk_loc_cd");
	public final MCStringPermColumn stk_loc_cd = createStringColumn(_stk_loc_cd);
	
	/**
	 * ＩＦ場所ＣＤ（在庫）. IF location cd. (Inventory).<p>
	 *
	 */
	public static final String $if_stk_loc_cd = "if_stk_loc_cd";
	private static final MCPermColumnInfo _if_stk_loc_cd = createColumnInfo("if_stk_loc_cd");
	public final MCStringPermColumn if_stk_loc_cd = createStringColumn(_if_stk_loc_cd);
	
	/**
	 * 場所名（在庫）. Location name (Inventory).<p>
	 *
	 */
	public static final String $stk_loc_nm = "stk_loc_nm";
	private static final MCPermColumnInfo _stk_loc_nm = createColumnInfo("stk_loc_nm");
	public final MCStringPermColumn stk_loc_nm = createStringColumn(_stk_loc_nm);
	
	/**
	 * 棚・ラインＣＤ（在庫）. Rack/Line cd. (Inventory).<p>
	 *
	 */
	public static final String $stk_str_ln_cd = "stk_str_ln_cd";
	private static final MCPermColumnInfo _stk_str_ln_cd = createColumnInfo("stk_str_ln_cd");
	public final MCStringPermColumn stk_str_ln_cd = createStringColumn(_stk_str_ln_cd);
	
	/**
	 * ＩＦ棚・ラインＣＤ（在庫）. IF rack/line cd. (Inventory).<p>
	 *
	 */
	public static final String $if_stk_str_ln_cd = "if_stk_str_ln_cd";
	private static final MCPermColumnInfo _if_stk_str_ln_cd = createColumnInfo("if_stk_str_ln_cd");
	public final MCStringPermColumn if_stk_str_ln_cd = createStringColumn(_if_stk_str_ln_cd);
	
	/**
	 * 棚・ライン名（在庫）. Rack/Line name (Inventory).<p>
	 *
	 */
	public static final String $stk_str_ln_nm = "stk_str_ln_nm";
	private static final MCPermColumnInfo _stk_str_ln_nm = createColumnInfo("stk_str_ln_nm");
	public final MCStringPermColumn stk_str_ln_nm = createStringColumn(_stk_str_ln_nm);
	
	/**
	 * 在庫着荷先ＣＤ（在庫）. Inventory arriving point cd. (Inventory).<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	private static final MCPermColumnInfo _stk_arrv_bp_cd = createColumnInfo("stk_arrv_bp_cd");
	public final MCStringPermColumn stk_arrv_bp_cd = createStringColumn(_stk_arrv_bp_cd);
	
	/**
	 * ＩＦ在庫着荷先ＣＤ（在庫）. IF inventory arriving point cd. (Inventory).<p>
	 *
	 */
	public static final String $if_stk_arrv_bp_cd = "if_stk_arrv_bp_cd";
	private static final MCPermColumnInfo _if_stk_arrv_bp_cd = createColumnInfo("if_stk_arrv_bp_cd");
	public final MCStringPermColumn if_stk_arrv_bp_cd = createStringColumn(_if_stk_arrv_bp_cd);
	
	/**
	 * 在庫着荷先名（在庫）. Inventory arriving point name (Inventory).<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	private static final MCPermColumnInfo _stk_arrv_bp_nm = createColumnInfo("stk_arrv_bp_nm");
	public final MCStringPermColumn stk_arrv_bp_nm = createStringColumn(_stk_arrv_bp_nm);
	
	/**
	 * 手配ＮＯ１（在庫）. SEIBAN No. 1 (Inventory).<p>
	 *
	 */
	public static final String $stk_sno1 = "stk_sno1";
	private static final MCPermColumnInfo _stk_sno1 = createColumnInfo("stk_sno1");
	public final MCStringPermColumn stk_sno1 = createStringColumn(_stk_sno1);
	
	/**
	 * 手配ＮＯ２（在庫）. SEIBAN No. 2 (Inventory).<p>
	 *
	 */
	public static final String $stk_sno2 = "stk_sno2";
	private static final MCPermColumnInfo _stk_sno2 = createColumnInfo("stk_sno2");
	public final MCStringPermColumn stk_sno2 = createStringColumn(_stk_sno2);
	
	/**
	 * 手配ＮＯ３（在庫）. SEIBAN No. 3 (Inventory).<p>
	 *
	 */
	public static final String $stk_sno3 = "stk_sno3";
	private static final MCPermColumnInfo _stk_sno3 = createColumnInfo("stk_sno3");
	public final MCStringPermColumn stk_sno3 = createStringColumn(_stk_sno3);
	
	/**
	 * 手配ＮＯ４（在庫）. SEIBAN No. 4 (Inventory).<p>
	 *
	 */
	public static final String $stk_sno4 = "stk_sno4";
	private static final MCPermColumnInfo _stk_sno4 = createColumnInfo("stk_sno4");
	public final MCStringPermColumn stk_sno4 = createStringColumn(_stk_sno4);
	
	/**
	 * 確定ＮＯ区分（在庫）. Firm No. type (Inventory).<p>
	 *
	 */
	public static final String $stk_fix_no_typ = "stk_fix_no_typ";
	private static final MCPermColumnInfo _stk_fix_no_typ = createColumnInfo("stk_fix_no_typ");
	public final MCStringPermColumn stk_fix_no_typ = createStringColumn(_stk_fix_no_typ);
	
	/**
	 * 確定ＮＯ（在庫）. Firm No. (Inventory).<p>
	 *
	 */
	public static final String $stk_fix_no = "stk_fix_no";
	private static final MCPermColumnInfo _stk_fix_no = createColumnInfo("stk_fix_no");
	public final MCStringPermColumn stk_fix_no = createStringColumn(_stk_fix_no);
	
	/**
	 * 荷姿単位ＣＤ（在庫）. SKU cd. (Inventory).<p>
	 *
	 */
	public static final String $stk_pack_unit_cd = "stk_pack_unit_cd";
	private static final MCPermColumnInfo _stk_pack_unit_cd = createColumnInfo("stk_pack_unit_cd");
	public final MCStringPermColumn stk_pack_unit_cd = createStringColumn(_stk_pack_unit_cd);
	
	/**
	 * ＩＦ荷姿単位ＣＤ（在庫）. IF SKU cd. (Inventory).<p>
	 *
	 */
	public static final String $if_stk_pack_unit_cd = "if_stk_pack_unit_cd";
	private static final MCPermColumnInfo _if_stk_pack_unit_cd = createColumnInfo("if_stk_pack_unit_cd");
	public final MCStringPermColumn if_stk_pack_unit_cd = createStringColumn(_if_stk_pack_unit_cd);
	
	/**
	 * 荷姿単位名（在庫）. SKU name (Inventory).<p>
	 *
	 */
	public static final String $stk_pack_unit_nm = "stk_pack_unit_nm";
	private static final MCPermColumnInfo _stk_pack_unit_nm = createColumnInfo("stk_pack_unit_nm");
	public final MCStringPermColumn stk_pack_unit_nm = createStringColumn(_stk_pack_unit_nm);
	
	/**
	 * 格付ＣＤ（在庫）. Grading cd. (Inventory).<p>
	 *
	 */
	public static final String $stk_gd_cd = "stk_gd_cd";
	private static final MCPermColumnInfo _stk_gd_cd = createColumnInfo("stk_gd_cd");
	public final MCStringPermColumn stk_gd_cd = createStringColumn(_stk_gd_cd);
	
	/**
	 * ＩＦ格付ＣＤ（在庫）. IF grading cd. (Inventory).<p>
	 *
	 */
	public static final String $if_stk_gd_cd = "if_stk_gd_cd";
	private static final MCPermColumnInfo _if_stk_gd_cd = createColumnInfo("if_stk_gd_cd");
	public final MCStringPermColumn if_stk_gd_cd = createStringColumn(_if_stk_gd_cd);
	
	/**
	 * 格付名（在庫）. Grading name (Inventory).<p>
	 *
	 */
	public static final String $stk_gd_nm = "stk_gd_nm";
	private static final MCPermColumnInfo _stk_gd_nm = createColumnInfo("stk_gd_nm");
	public final MCStringPermColumn stk_gd_nm = createStringColumn(_stk_gd_nm);
	
	/**
	 * 良品区分（在庫）. Conforming type (Inventory).<p>
	 *
	 */
	public static final String $stk_quality_typ = "stk_quality_typ";
	private static final MCPermColumnInfo _stk_quality_typ = createColumnInfo("stk_quality_typ");
	public final MCStringPermColumn stk_quality_typ = createStringColumn(_stk_quality_typ);
	
	/**
	 * 在庫検査区分（在庫）. Inventory inspection type (Inventory).<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	private static final MCPermColumnInfo _stk_insp_typ = createColumnInfo("stk_insp_typ");
	public final MCStringPermColumn stk_insp_typ = createStringColumn(_stk_insp_typ);
	
	/**
	 * 在庫識別区分（在庫）. Inventory identification type (Inventory).<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	private static final MCPermColumnInfo _stk_id_typ = createColumnInfo("stk_id_typ");
	public final MCStringPermColumn stk_id_typ = createStringColumn(_stk_id_typ);
	
	/**
	 * 在庫取引先ＣＤ（在庫）. Inventory BP cd. (Inventory).<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	private static final MCPermColumnInfo _stk_bp_cd = createColumnInfo("stk_bp_cd");
	public final MCStringPermColumn stk_bp_cd = createStringColumn(_stk_bp_cd);
	
	/**
	 * ＩＦ在庫取引先ＣＤ（在庫）. IF inventory BP cd. (Inventory).<p>
	 *
	 */
	public static final String $if_stk_bp_cd = "if_stk_bp_cd";
	private static final MCPermColumnInfo _if_stk_bp_cd = createColumnInfo("if_stk_bp_cd");
	public final MCStringPermColumn if_stk_bp_cd = createStringColumn(_if_stk_bp_cd);
	
	/**
	 * 在庫取引先名（在庫）. Inventory BP name (Inventory).<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	private static final MCPermColumnInfo _stk_bp_nm = createColumnInfo("stk_bp_nm");
	public final MCStringPermColumn stk_bp_nm = createStringColumn(_stk_bp_nm);
	
	/**
	 * 荷姿単位数量（在庫）. SKU qty. (Inventory).<p>
	 *
	 */
	public static final String $stk_pack_unit_qty = "stk_pack_unit_qty";
	private static final MCPermColumnInfo _stk_pack_unit_qty = createColumnInfo("stk_pack_unit_qty");
	public final MCNumberPermColumn stk_pack_unit_qty = createNumberColumn(_stk_pack_unit_qty);
	
	/**
	 * 基準単位数量（在庫）. Base unit qty. (Inventory).<p>
	 *
	 */
	public static final String $stk_base_unit_qty = "stk_base_unit_qty";
	private static final MCPermColumnInfo _stk_base_unit_qty = createColumnInfo("stk_base_unit_qty");
	public final MCNumberPermColumn stk_base_unit_qty = createNumberColumn(_stk_base_unit_qty);
	
	/**
	 * 抜取予定数量. Sampling scheduled qty..<p>
	 *
	 */
	public static final String $smpl_schd_qty = "smpl_schd_qty";
	private static final MCPermColumnInfo _smpl_schd_qty = createColumnInfo("smpl_schd_qty");
	public final MCNumberPermColumn smpl_schd_qty = createNumberColumn(_smpl_schd_qty);
	
	/**
	 * 抜取指図数量. Sampling order qty..<p>
	 *
	 */
	public static final String $smpl_inst_qty = "smpl_inst_qty";
	private static final MCPermColumnInfo _smpl_inst_qty = createColumnInfo("smpl_inst_qty");
	public final MCNumberPermColumn smpl_inst_qty = createNumberColumn(_smpl_inst_qty);
	
	/**
	 * 参照検査ＮＯ. Reference inspection No..<p>
	 *
	 */
	public static final String $own_insp_no = "own_insp_no";
	private static final MCPermColumnInfo _own_insp_no = createColumnInfo("own_insp_no");
	public final MCStringPermColumn own_insp_no = createStringColumn(_own_insp_no);
	
	/**
	 * 参照検査予定ＮＯ. Reference inspection schedule No..<p>
	 *
	 */
	public static final String $own_insp_schd_no = "own_insp_schd_no";
	private static final MCPermColumnInfo _own_insp_schd_no = createColumnInfo("own_insp_schd_no");
	public final MCStringPermColumn own_insp_schd_no = createStringColumn(_own_insp_schd_no);
	
	/**
	 * 初回検査予定ＮＯ. Initial inspection schedule No..<p>
	 *
	 */
	public static final String $org_insp_schd_no = "org_insp_schd_no";
	private static final MCPermColumnInfo _org_insp_schd_no = createColumnInfo("org_insp_schd_no");
	public final MCStringPermColumn org_insp_schd_no = createStringColumn(_org_insp_schd_no);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	private static final MCPermColumnInfo _itm_ord_no = createColumnInfo("itm_ord_no");
	public final MCStringPermColumn itm_ord_no = createStringColumn(_itm_ord_no);
	
	/**
	 * 検査中使用許可ＦＬＧ. Allow inspecting use flg..<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
	private static final MCPermColumnInfo _in_prmt_insp_flg = createColumnInfo("in_prmt_insp_flg");
	public final MCBooleanPermColumn in_prmt_insp_flg = createBooleanColumn(_in_prmt_insp_flg);
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	private static final MCPermColumnInfo _trd_cd = createColumnInfo("trd_cd");
	public final MCStringPermColumn trd_cd = createStringColumn(_trd_cd);
	
	/**
	 * ＩＦ取引ＣＤ. IF transaction cd..<p>
	 *
	 */
	public static final String $if_trd_cd = "if_trd_cd";
	private static final MCPermColumnInfo _if_trd_cd = createColumnInfo("if_trd_cd");
	public final MCStringPermColumn if_trd_cd = createStringColumn(_if_trd_cd);
	
	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	private static final MCPermColumnInfo _trd_nm = createColumnInfo("trd_nm");
	public final MCStringPermColumn trd_nm = createStringColumn(_trd_nm);
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public static final String $insp_lt = "insp_lt";
	private static final MCPermColumnInfo _insp_lt = createColumnInfo("insp_lt");
	public final MCNumberPermColumn insp_lt = createNumberColumn(_insp_lt);
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public static final String $insp_offst = "insp_offst";
	private static final MCPermColumnInfo _insp_offst = createColumnInfo("insp_offst");
	public final MCNumberPermColumn insp_offst = createNumberColumn(_insp_offst);
	
	/**
	 * 検査連絡備考. Inspection contact remarks.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	private static final MCPermColumnInfo _insp_cnt_rmrks = createColumnInfo("insp_cnt_rmrks");
	public final MCStringPermColumn insp_cnt_rmrks = createStringColumn(_insp_cnt_rmrks);
	
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
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_freq_META = createCommonMeta($insp_freq, mcframe.commonMS.meta.MS_META.INSP_FREQ);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta insp_sts_typ_META = createCommonMeta($insp_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta insp_bind_typ_META = createCommonMeta($insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta col_schd_flg_META = createCommonMeta($col_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_lst_prnt_flg_META = createCommonMeta($insp_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_lst_prnt_tm_META = createCommonMeta($insp_lst_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_itm_cd_META = createCommonMeta($if_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_itm_sub1_META = createCommonMeta($if_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta if_itm_sub2_META = createCommonMeta($if_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta if_itm_sub3_META = createCommonMeta($if_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta arr_tm_META = createCommonMeta($arr_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_sppl_cd_META = createCommonMeta($if_sppl_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_maker_cd_META = createCommonMeta($if_maker_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_mfg_loc_cd_META = createCommonMeta($if_mfg_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta if_to_site_cd_META = createCommonMeta($if_to_site_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta to_site_nm_META = createCommonMeta($to_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_pack_unit_cd_META = createCommonMeta($if_pack_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_base_unit_cd_META = createCommonMeta($if_base_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta insp_lst_no_META = createCommonMeta($insp_lst_no, mcframe.commonMA.meta.MA_META.INSP_LST_NO);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_inst_dpt_cd_META = createCommonMeta($if_inst_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_inst_usr_cd_META = createCommonMeta($if_inst_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta src_dpt_cd_META = createCommonMeta($src_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_src_dpt_cd_META = createCommonMeta($if_src_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta src_dpt_nm_META = createCommonMeta($src_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta src_usr_cd_META = createCommonMeta($src_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_src_usr_cd_META = createCommonMeta($if_src_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta src_usr_nm_META = createCommonMeta($src_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_schd_tm_META = createCommonMeta($mfg_st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta mfg_end_schd_tm_META = createCommonMeta($mfg_end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_st_tm_META = createCommonMeta($insp_st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_end_tm_META = createCommonMeta($insp_end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta std_req_flg_META = createCommonMeta($std_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cnf_req_flg_META = createCommonMeta($std_cnf_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_std_no_META = createCommonMeta($insp_std_no, mcframe.commonMA.meta.MA_META.INSP_STD_NO);
	public static final MCMeta plnt_aprv_flg_META = createCommonMeta($plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_prnt_flg_META = createCommonMeta($insp_rslt_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_prnt_tm_META = createCommonMeta($insp_rslt_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta seq_META = createCommonMeta($seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta lmt_up_flg_META = createCommonMeta($lmt_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_flg_META = createCommonMeta($insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_aprv_role_cd_META = createCommonMeta($insp_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta insp_aprv_role_nm_META = createCommonMeta($insp_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_aprv_dpt_cd_META = createCommonMeta($if_aprv_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta aprv_dpt_nm_META = createCommonMeta($aprv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_aprv_usr_cd_META = createCommonMeta($if_aprv_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.INSP_INST_APRV_RSN);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_ACT_INTR_RMRKS);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta src_no1_META = createCommonMeta($src_no1, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no2_META = createCommonMeta($src_no2, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no3_META = createCommonMeta($src_no3, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no4_META = createCommonMeta($src_no4, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta schd_loc_cd_META = createCommonMeta($schd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_schd_loc_cd_META = createCommonMeta($if_schd_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_loc_nm_META = createCommonMeta($schd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta schd_str_ln_cd_META = createCommonMeta($schd_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta if_schd_str_ln_cd_META = createCommonMeta($if_schd_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_str_ln_nm_META = createCommonMeta($schd_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta schd_stk_arrv_bp_cd_META = createCommonMeta($schd_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_schd_stk_arrv_bp_cd_META = createCommonMeta($if_schd_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_stk_arrv_bp_nm_META = createCommonMeta($schd_stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta schd_sno1_META = createCommonMeta($schd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta schd_sno2_META = createCommonMeta($schd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta schd_sno3_META = createCommonMeta($schd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta schd_sno4_META = createCommonMeta($schd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta schd_gd_cd_META = createCommonMeta($schd_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta if_schd_gd_cd_META = createCommonMeta($if_schd_gd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_gd_nm_META = createCommonMeta($schd_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta schd_quality_typ_META = createCommonMeta($schd_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta schd_stk_insp_typ_META = createCommonMeta($schd_stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta schd_stk_id_typ_META = createCommonMeta($schd_stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta schd_stk_bp_cd_META = createCommonMeta($schd_stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_schd_stk_bp_cd_META = createCommonMeta($if_schd_stk_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_stk_bp_nm_META = createCommonMeta($schd_stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta schd_pack_unit_qty_META = createCommonMeta($schd_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_pack_unit_cd_META = createCommonMeta($schd_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_schd_pack_unit_cd_META = createCommonMeta($if_schd_pack_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_pack_unit_nm_META = createCommonMeta($schd_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta schd_base_unit_qty_META = createCommonMeta($schd_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_base_unit_cd_META = createCommonMeta($schd_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_schd_base_unit_cd_META = createCommonMeta($if_schd_base_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_base_unit_nm_META = createCommonMeta($schd_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta stk_loc_cd_META = createCommonMeta($stk_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_stk_loc_cd_META = createCommonMeta($if_stk_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_loc_nm_META = createCommonMeta($stk_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta stk_str_ln_cd_META = createCommonMeta($stk_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta if_stk_str_ln_cd_META = createCommonMeta($if_stk_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_str_ln_nm_META = createCommonMeta($stk_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_stk_arrv_bp_cd_META = createCommonMeta($if_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_sno1_META = createCommonMeta($stk_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta stk_sno2_META = createCommonMeta($stk_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta stk_sno3_META = createCommonMeta($stk_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta stk_sno4_META = createCommonMeta($stk_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta stk_fix_no_typ_META = createCommonMeta($stk_fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta stk_fix_no_META = createCommonMeta($stk_fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta stk_pack_unit_cd_META = createCommonMeta($stk_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_stk_pack_unit_cd_META = createCommonMeta($if_stk_pack_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_pack_unit_nm_META = createCommonMeta($stk_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta stk_gd_cd_META = createCommonMeta($stk_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta if_stk_gd_cd_META = createCommonMeta($if_stk_gd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_gd_nm_META = createCommonMeta($stk_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_quality_typ_META = createCommonMeta($stk_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_stk_bp_cd_META = createCommonMeta($if_stk_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_pack_unit_qty_META = createCommonMeta($stk_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_base_unit_qty_META = createCommonMeta($stk_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_schd_qty_META = createCommonMeta($smpl_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_inst_qty_META = createCommonMeta($smpl_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta own_insp_no_META = createCommonMeta($own_insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta own_insp_schd_no_META = createCommonMeta($own_insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta org_insp_schd_no_META = createCommonMeta($org_insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta if_trd_cd_META = createCommonMeta($if_trd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta if_co_cd_META = createCommonMeta($if_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
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
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta log_sub_key1_META = createCommonMeta($log_sub_key1, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY1);
	public static final MCMeta log_sub_key2_META = createCommonMeta($log_sub_key2, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY2);
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
					MST_INSP_INST_SEND_IF_R own = MST_INSP_INST_SEND_IF_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_INSP_INST_SEND_IF_R> constMetas = new ConstMetaList<MST_INSP_INST_SEND_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			insp_no_META,
			insp_freq_META,
			insp_typ_META,
			insp_mtd_typ_META,
			insp_sts_typ_META,
			insp_bind_typ_META,
			col_schd_flg_META,
			insp_lst_prnt_flg_META,
			insp_lst_prnt_tm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			if_itm_cd_META,
			if_itm_sub1_META,
			if_itm_sub2_META,
			if_itm_sub3_META,
			itm_nm_META,
			lot_no_META,
			sublot_no_META,
			arr_tm_META,
			first_gr_dt_META,
			vld_dt_META,
			lmt_dt_META,
			lmt_dt_frm_META,
			po_no_META,
			sppl_cd_META,
			if_sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			if_maker_cd_META,
			maker_nm_META,
			mfg_loc_cd_META,
			if_mfg_loc_cd_META,
			mfg_loc_nm_META,
			to_site_cd_META,
			if_to_site_cd_META,
			to_site_nm_META,
			bp_lot_no_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			if_pack_unit_cd_META,
			pack_unit_nm_META,
			base_unit_qty_META,
			base_unit_cd_META,
			if_base_unit_cd_META,
			base_unit_nm_META,
			insp_lst_no_META,
			inst_dt_META,
			inst_dpt_cd_META,
			if_inst_dpt_cd_META,
			inst_dpt_nm_META,
			inst_usr_cd_META,
			if_inst_usr_cd_META,
			inst_usr_nm_META,
			src_dpt_cd_META,
			if_src_dpt_cd_META,
			src_dpt_nm_META,
			src_usr_cd_META,
			if_src_usr_cd_META,
			src_usr_nm_META,
			master_dt_META,
			mfg_st_schd_tm_META,
			mfg_end_schd_tm_META,
			insp_st_tm_META,
			insp_end_tm_META,
			insp_ptn_cd_META,
			insp_ptn_nm_META,
			std_req_flg_META,
			std_cnf_req_flg_META,
			insp_std_no_META,
			plnt_aprv_flg_META,
			insp_rslt_prnt_flg_META,
			insp_rslt_prnt_tm_META,
			seq_META,
			lmt_up_flg_META,
			insp_aprv_flg_META,
			insp_aprv_sts_typ_META,
			aprv_dt_META,
			insp_aprv_role_cd_META,
			insp_aprv_role_nm_META,
			aprv_dpt_cd_META,
			if_aprv_dpt_cd_META,
			aprv_dpt_nm_META,
			aprv_usr_cd_META,
			if_aprv_usr_cd_META,
			aprv_usr_nm_META,
			aprv_rsn_META,
			act_cont_fctr_META,
			intr_rmrks_META,
			insp_schd_no_META,
			src_no1_META,
			src_no2_META,
			src_no3_META,
			src_no4_META,
			schd_loc_cd_META,
			if_schd_loc_cd_META,
			schd_loc_nm_META,
			schd_str_ln_cd_META,
			if_schd_str_ln_cd_META,
			schd_str_ln_nm_META,
			schd_stk_arrv_bp_cd_META,
			if_schd_stk_arrv_bp_cd_META,
			schd_stk_arrv_bp_nm_META,
			schd_sno1_META,
			schd_sno2_META,
			schd_sno3_META,
			schd_sno4_META,
			schd_gd_cd_META,
			if_schd_gd_cd_META,
			schd_gd_nm_META,
			schd_quality_typ_META,
			schd_stk_insp_typ_META,
			schd_stk_id_typ_META,
			schd_stk_bp_cd_META,
			if_schd_stk_bp_cd_META,
			schd_stk_bp_nm_META,
			schd_pack_unit_qty_META,
			schd_pack_unit_cd_META,
			if_schd_pack_unit_cd_META,
			schd_pack_unit_nm_META,
			schd_base_unit_qty_META,
			schd_base_unit_cd_META,
			if_schd_base_unit_cd_META,
			schd_base_unit_nm_META,
			stk_loc_cd_META,
			if_stk_loc_cd_META,
			stk_loc_nm_META,
			stk_str_ln_cd_META,
			if_stk_str_ln_cd_META,
			stk_str_ln_nm_META,
			stk_arrv_bp_cd_META,
			if_stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			stk_sno1_META,
			stk_sno2_META,
			stk_sno3_META,
			stk_sno4_META,
			stk_fix_no_typ_META,
			stk_fix_no_META,
			stk_pack_unit_cd_META,
			if_stk_pack_unit_cd_META,
			stk_pack_unit_nm_META,
			stk_gd_cd_META,
			if_stk_gd_cd_META,
			stk_gd_nm_META,
			stk_quality_typ_META,
			stk_insp_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			if_stk_bp_cd_META,
			stk_bp_nm_META,
			stk_pack_unit_qty_META,
			stk_base_unit_qty_META,
			smpl_schd_qty_META,
			smpl_inst_qty_META,
			own_insp_no_META,
			own_insp_schd_no_META,
			org_insp_schd_no_META,
			ac_dt_META,
			itm_ord_no_META,
			in_prmt_insp_flg_META,
			trd_cd_META,
			if_trd_cd_META,
			trd_nm_META,
			insp_lt_META,
			insp_offst_META,
			insp_cnt_rmrks_META,
			if_co_cd_META,
			co_nm_META,
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
			batch_log_no_META,
			log_sub_key1_META,
			log_sub_key2_META,
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
			sdrv_sts_typ_META
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
	protected MST_INSP_INST_SEND_IF_R(ConstMetaList<? extends MST_INSP_INST_SEND_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_INSP_INST_SEND_IF_R(ConstMetaList<? extends MST_INSP_INST_SEND_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$data_lno,
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
			MST_INSP_INST_SEND_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$data_no,
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
			MST_INSP_INST_SEND_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$exe_sts_typ,
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
			MST_INSP_INST_SEND_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$data_crud_typ,
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
			MST_INSP_INST_SEND_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$ext_sys_cd,
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
			MST_INSP_INST_SEND_IF_R.$insp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_no,
				"insp_no",
				insp_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_freq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$insp_freq,
				"insp_freq",
				insp_freq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_typ,
				"insp_typ",
				insp_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_mtd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_mtd_typ,
				"insp_mtd_typ",
				insp_mtd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_sts_typ,
				"insp_sts_typ",
				insp_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_bind_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_bind_typ,
				"insp_bind_typ",
				insp_bind_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$col_schd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_SEND_IF_R.$col_schd_flg,
				"col_schd_flg",
				col_schd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_lst_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_SEND_IF_R.$insp_lst_prnt_flg,
				"insp_lst_prnt_flg",
				insp_lst_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_lst_prnt_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$insp_lst_prnt_tm,
				"insp_lst_prnt_tm",
				insp_lst_prnt_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$itm_cd,
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
			MST_INSP_INST_SEND_IF_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$itm_sub1,
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
			MST_INSP_INST_SEND_IF_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$itm_sub2,
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
			MST_INSP_INST_SEND_IF_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$itm_sub3,
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
			MST_INSP_INST_SEND_IF_R.$if_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_itm_cd,
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
			MST_INSP_INST_SEND_IF_R.$if_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_itm_sub1,
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
			MST_INSP_INST_SEND_IF_R.$if_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_itm_sub2,
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
			MST_INSP_INST_SEND_IF_R.$if_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_itm_sub3,
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
			MST_INSP_INST_SEND_IF_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$itm_nm,
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
			MST_INSP_INST_SEND_IF_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$lot_no,
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
			MST_INSP_INST_SEND_IF_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sublot_no,
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
			MST_INSP_INST_SEND_IF_R.$arr_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$arr_tm,
				"arr_tm",
				arr_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$first_gr_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$first_gr_dt,
				"first_gr_dt",
				first_gr_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$vld_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$vld_dt,
				"vld_dt",
				vld_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$lmt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$lmt_dt,
				"lmt_dt",
				lmt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$lmt_dt_frm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$lmt_dt_frm,
				"lmt_dt_frm",
				lmt_dt_frm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$po_no,
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
			MST_INSP_INST_SEND_IF_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sppl_cd,
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
			MST_INSP_INST_SEND_IF_R.$if_sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_sppl_cd,
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
			MST_INSP_INST_SEND_IF_R.$sppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sppl_nm,
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
			MST_INSP_INST_SEND_IF_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$maker_cd,
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
			MST_INSP_INST_SEND_IF_R.$if_maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_maker_cd,
				"if_maker_cd",
				if_maker_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$maker_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$maker_nm,
				"maker_nm",
				maker_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$mfg_loc_cd,
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
			MST_INSP_INST_SEND_IF_R.$if_mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_mfg_loc_cd,
				"if_mfg_loc_cd",
				if_mfg_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$mfg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$mfg_loc_nm,
				"mfg_loc_nm",
				mfg_loc_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$to_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$to_site_cd,
				"to_site_cd",
				to_site_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_to_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_to_site_cd,
				"if_to_site_cd",
				if_to_site_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$to_site_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$to_site_nm,
				"to_site_nm",
				to_site_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$bp_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$bp_lot_no,
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
			MST_INSP_INST_SEND_IF_R.$pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$pack_unit_qty,
				"pack_unit_qty",
				pack_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$pack_unit_cd,
				"pack_unit_cd",
				pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_pack_unit_cd,
				"if_pack_unit_cd",
				if_pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$pack_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$pack_unit_nm,
				"pack_unit_nm",
				pack_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$base_unit_qty,
				"base_unit_qty",
				base_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$base_unit_cd,
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
			MST_INSP_INST_SEND_IF_R.$if_base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_base_unit_cd,
				"if_base_unit_cd",
				if_base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$base_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$base_unit_nm,
				"base_unit_nm",
				base_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_lst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_lst_no,
				"insp_lst_no",
				insp_lst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$inst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$inst_dt,
				"inst_dt",
				inst_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$inst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$inst_dpt_cd,
				"inst_dpt_cd",
				inst_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_inst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_inst_dpt_cd,
				"if_inst_dpt_cd",
				if_inst_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$inst_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$inst_dpt_nm,
				"inst_dpt_nm",
				inst_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$inst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$inst_usr_cd,
				"inst_usr_cd",
				inst_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_inst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_inst_usr_cd,
				"if_inst_usr_cd",
				if_inst_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$inst_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$inst_usr_nm,
				"inst_usr_nm",
				inst_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$src_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$src_dpt_cd,
				"src_dpt_cd",
				src_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_src_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_src_dpt_cd,
				"if_src_dpt_cd",
				if_src_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$src_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$src_dpt_nm,
				"src_dpt_nm",
				src_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$src_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$src_usr_cd,
				"src_usr_cd",
				src_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_src_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_src_usr_cd,
				"if_src_usr_cd",
				if_src_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$src_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$src_usr_nm,
				"src_usr_nm",
				src_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$master_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$master_dt,
				"master_dt",
				master_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$mfg_st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$mfg_st_schd_tm,
				"mfg_st_schd_tm",
				mfg_st_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$mfg_end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$mfg_end_schd_tm,
				"mfg_end_schd_tm",
				mfg_end_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_st_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$insp_st_tm,
				"insp_st_tm",
				insp_st_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_end_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$insp_end_tm,
				"insp_end_tm",
				insp_end_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_ptn_cd,
				"insp_ptn_cd",
				insp_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_ptn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_ptn_nm,
				"insp_ptn_nm",
				insp_ptn_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$std_req_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_SEND_IF_R.$std_req_flg,
				"std_req_flg",
				std_req_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$std_cnf_req_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_SEND_IF_R.$std_cnf_req_flg,
				"std_cnf_req_flg",
				std_cnf_req_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_std_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_std_no,
				"insp_std_no",
				insp_std_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$plnt_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_SEND_IF_R.$plnt_aprv_flg,
				"plnt_aprv_flg",
				plnt_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_rslt_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_SEND_IF_R.$insp_rslt_prnt_flg,
				"insp_rslt_prnt_flg",
				insp_rslt_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_rslt_prnt_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$insp_rslt_prnt_tm,
				"insp_rslt_prnt_tm",
				insp_rslt_prnt_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$seq,
				"seq",
				seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$lmt_up_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_SEND_IF_R.$lmt_up_flg,
				"lmt_up_flg",
				lmt_up_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_SEND_IF_R.$insp_aprv_flg,
				"insp_aprv_flg",
				insp_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_aprv_sts_typ,
				"insp_aprv_sts_typ",
				insp_aprv_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$aprv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$aprv_dt,
				"aprv_dt",
				aprv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_aprv_role_cd,
				"insp_aprv_role_cd",
				insp_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_aprv_role_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_aprv_role_nm,
				"insp_aprv_role_nm",
				insp_aprv_role_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$aprv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$aprv_dpt_cd,
				"aprv_dpt_cd",
				aprv_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_aprv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_aprv_dpt_cd,
				"if_aprv_dpt_cd",
				if_aprv_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$aprv_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$aprv_dpt_nm,
				"aprv_dpt_nm",
				aprv_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$aprv_usr_cd,
				"aprv_usr_cd",
				aprv_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_aprv_usr_cd,
				"if_aprv_usr_cd",
				if_aprv_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$aprv_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$aprv_usr_nm,
				"aprv_usr_nm",
				aprv_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$aprv_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$aprv_rsn,
				"aprv_rsn",
				aprv_rsn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$act_cont_fctr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$act_cont_fctr,
				"act_cont_fctr",
				act_cont_fctr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$intr_rmrks,
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
			MST_INSP_INST_SEND_IF_R.$insp_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_schd_no,
				"insp_schd_no",
				insp_schd_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$src_no1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$src_no1,
				"src_no1",
				src_no1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$src_no2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$src_no2,
				"src_no2",
				src_no2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$src_no3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$src_no3,
				"src_no3",
				src_no3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$src_no4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$src_no4,
				"src_no4",
				src_no4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_loc_cd,
				"schd_loc_cd",
				schd_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_schd_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_schd_loc_cd,
				"if_schd_loc_cd",
				if_schd_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_loc_nm,
				"schd_loc_nm",
				schd_loc_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_str_ln_cd,
				"schd_str_ln_cd",
				schd_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_schd_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_schd_str_ln_cd,
				"if_schd_str_ln_cd",
				if_schd_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_str_ln_nm,
				"schd_str_ln_nm",
				schd_str_ln_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_stk_arrv_bp_cd,
				"schd_stk_arrv_bp_cd",
				schd_stk_arrv_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_schd_stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_schd_stk_arrv_bp_cd,
				"if_schd_stk_arrv_bp_cd",
				if_schd_stk_arrv_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_stk_arrv_bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_stk_arrv_bp_nm,
				"schd_stk_arrv_bp_nm",
				schd_stk_arrv_bp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_sno1,
				"schd_sno1",
				schd_sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_sno2,
				"schd_sno2",
				schd_sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_sno3,
				"schd_sno3",
				schd_sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_sno4,
				"schd_sno4",
				schd_sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_gd_cd,
				"schd_gd_cd",
				schd_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_schd_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_schd_gd_cd,
				"if_schd_gd_cd",
				if_schd_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_gd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_gd_nm,
				"schd_gd_nm",
				schd_gd_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_quality_typ,
				"schd_quality_typ",
				schd_quality_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_stk_insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_stk_insp_typ,
				"schd_stk_insp_typ",
				schd_stk_insp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_stk_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_stk_id_typ,
				"schd_stk_id_typ",
				schd_stk_id_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_stk_bp_cd,
				"schd_stk_bp_cd",
				schd_stk_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_schd_stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_schd_stk_bp_cd,
				"if_schd_stk_bp_cd",
				if_schd_stk_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_stk_bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_stk_bp_nm,
				"schd_stk_bp_nm",
				schd_stk_bp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$schd_pack_unit_qty,
				"schd_pack_unit_qty",
				schd_pack_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_pack_unit_cd,
				"schd_pack_unit_cd",
				schd_pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_schd_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_schd_pack_unit_cd,
				"if_schd_pack_unit_cd",
				if_schd_pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_pack_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_pack_unit_nm,
				"schd_pack_unit_nm",
				schd_pack_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$schd_base_unit_qty,
				"schd_base_unit_qty",
				schd_base_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_base_unit_cd,
				"schd_base_unit_cd",
				schd_base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_schd_base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_schd_base_unit_cd,
				"if_schd_base_unit_cd",
				if_schd_base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$schd_base_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$schd_base_unit_nm,
				"schd_base_unit_nm",
				schd_base_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_loc_cd,
				"stk_loc_cd",
				stk_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_stk_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_stk_loc_cd,
				"if_stk_loc_cd",
				if_stk_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_loc_nm,
				"stk_loc_nm",
				stk_loc_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_str_ln_cd,
				"stk_str_ln_cd",
				stk_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_stk_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_stk_str_ln_cd,
				"if_stk_str_ln_cd",
				if_stk_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_str_ln_nm,
				"stk_str_ln_nm",
				stk_str_ln_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_arrv_bp_cd,
				"stk_arrv_bp_cd",
				stk_arrv_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_stk_arrv_bp_cd,
				"if_stk_arrv_bp_cd",
				if_stk_arrv_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_arrv_bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_arrv_bp_nm,
				"stk_arrv_bp_nm",
				stk_arrv_bp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_sno1,
				"stk_sno1",
				stk_sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_sno2,
				"stk_sno2",
				stk_sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_sno3,
				"stk_sno3",
				stk_sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_sno4,
				"stk_sno4",
				stk_sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_fix_no_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_fix_no_typ,
				"stk_fix_no_typ",
				stk_fix_no_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_fix_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_fix_no,
				"stk_fix_no",
				stk_fix_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_pack_unit_cd,
				"stk_pack_unit_cd",
				stk_pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_stk_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_stk_pack_unit_cd,
				"if_stk_pack_unit_cd",
				if_stk_pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_pack_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_pack_unit_nm,
				"stk_pack_unit_nm",
				stk_pack_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_gd_cd,
				"stk_gd_cd",
				stk_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_stk_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_stk_gd_cd,
				"if_stk_gd_cd",
				if_stk_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_gd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_gd_nm,
				"stk_gd_nm",
				stk_gd_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_quality_typ,
				"stk_quality_typ",
				stk_quality_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_insp_typ,
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
			MST_INSP_INST_SEND_IF_R.$stk_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_id_typ,
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
			MST_INSP_INST_SEND_IF_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_bp_cd,
				"stk_bp_cd",
				stk_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_stk_bp_cd,
				"if_stk_bp_cd",
				if_stk_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$stk_bp_nm,
				"stk_bp_nm",
				stk_bp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$stk_pack_unit_qty,
				"stk_pack_unit_qty",
				stk_pack_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$stk_base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$stk_base_unit_qty,
				"stk_base_unit_qty",
				stk_base_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$smpl_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$smpl_schd_qty,
				"smpl_schd_qty",
				smpl_schd_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$smpl_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$smpl_inst_qty,
				"smpl_inst_qty",
				smpl_inst_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$own_insp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$own_insp_no,
				"own_insp_no",
				own_insp_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$own_insp_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$own_insp_schd_no,
				"own_insp_schd_no",
				own_insp_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$org_insp_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$org_insp_schd_no,
				"org_insp_schd_no",
				org_insp_schd_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$ac_dt,
				"ac_dt",
				ac_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$itm_ord_no,
				"itm_ord_no",
				itm_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$in_prmt_insp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_SEND_IF_R.$in_prmt_insp_flg,
				"in_prmt_insp_flg",
				in_prmt_insp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$trd_cd,
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
			MST_INSP_INST_SEND_IF_R.$if_trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_trd_cd,
				"if_trd_cd",
				if_trd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$trd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$trd_nm,
				"trd_nm",
				trd_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$insp_lt,
				"insp_lt",
				insp_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_offst,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$insp_offst,
				"insp_offst",
				insp_offst,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$insp_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$insp_cnt_rmrks,
				"insp_cnt_rmrks",
				insp_cnt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_SEND_IF_R.$if_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$if_co_cd,
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
			MST_INSP_INST_SEND_IF_R.$co_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$co_nm,
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
			MST_INSP_INST_SEND_IF_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char1,
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
			MST_INSP_INST_SEND_IF_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char2,
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
			MST_INSP_INST_SEND_IF_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char3,
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
			MST_INSP_INST_SEND_IF_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char4,
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
			MST_INSP_INST_SEND_IF_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char5,
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
			MST_INSP_INST_SEND_IF_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char6,
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
			MST_INSP_INST_SEND_IF_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char7,
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
			MST_INSP_INST_SEND_IF_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char8,
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
			MST_INSP_INST_SEND_IF_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char9,
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
			MST_INSP_INST_SEND_IF_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char10,
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
			MST_INSP_INST_SEND_IF_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char11,
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
			MST_INSP_INST_SEND_IF_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char12,
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
			MST_INSP_INST_SEND_IF_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char13,
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
			MST_INSP_INST_SEND_IF_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char14,
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
			MST_INSP_INST_SEND_IF_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char15,
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
			MST_INSP_INST_SEND_IF_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char16,
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
			MST_INSP_INST_SEND_IF_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char17,
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
			MST_INSP_INST_SEND_IF_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char18,
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
			MST_INSP_INST_SEND_IF_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char19,
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
			MST_INSP_INST_SEND_IF_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char20,
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
			MST_INSP_INST_SEND_IF_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char21,
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
			MST_INSP_INST_SEND_IF_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char22,
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
			MST_INSP_INST_SEND_IF_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char23,
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
			MST_INSP_INST_SEND_IF_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char24,
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
			MST_INSP_INST_SEND_IF_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char25,
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
			MST_INSP_INST_SEND_IF_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char26,
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
			MST_INSP_INST_SEND_IF_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char27,
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
			MST_INSP_INST_SEND_IF_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char28,
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
			MST_INSP_INST_SEND_IF_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char29,
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
			MST_INSP_INST_SEND_IF_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sub_char30,
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
			MST_INSP_INST_SEND_IF_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$sub_num1,
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
			MST_INSP_INST_SEND_IF_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$sub_num2,
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
			MST_INSP_INST_SEND_IF_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$sub_num3,
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
			MST_INSP_INST_SEND_IF_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$sub_num4,
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
			MST_INSP_INST_SEND_IF_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$sub_num5,
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
			MST_INSP_INST_SEND_IF_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$sub_dt1,
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
			MST_INSP_INST_SEND_IF_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$sub_dt2,
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
			MST_INSP_INST_SEND_IF_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$sub_dt3,
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
			MST_INSP_INST_SEND_IF_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$sub_dt4,
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
			MST_INSP_INST_SEND_IF_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_SEND_IF_R.$sub_dt5,
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
			MST_INSP_INST_SEND_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$batch_log_no,
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
			MST_INSP_INST_SEND_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$log_sub_key1,
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
			MST_INSP_INST_SEND_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$log_sub_key2,
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
			MST_INSP_INST_SEND_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$ins_usr_id,
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
			MST_INSP_INST_SEND_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$ins_usr_nm,
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
			MST_INSP_INST_SEND_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INSP_INST_SEND_IF_R.$ins_ts,
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
			MST_INSP_INST_SEND_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$ins_func_id,
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
			MST_INSP_INST_SEND_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_SEND_IF_R.$upd_cntr,
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
			MST_INSP_INST_SEND_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$upd_usr_id,
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
			MST_INSP_INST_SEND_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$upd_usr_nm,
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
			MST_INSP_INST_SEND_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INSP_INST_SEND_IF_R.$upd_ts,
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
			MST_INSP_INST_SEND_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$upd_func_id,
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
			MST_INSP_INST_SEND_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$upd_srv_req_no,
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
			MST_INSP_INST_SEND_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_SEND_IF_R.$sdrv_sts_typ,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_INSP_INST_SEND_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_INSP_INST_SEND_IF_R create(String alias) {
		MST_INSP_INST_SEND_IF_R row = new MST_INSP_INST_SEND_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_INSP_INST_SEND_IF_R createByName(T proto) {
		MST_INSP_INST_SEND_IF_R row = MST_INSP_INST_SEND_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_INST_SEND_IF_R clone() {
		return (MST_INSP_INST_SEND_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_INST_SEND_IF_R createInstance() {
		return (MST_INSP_INST_SEND_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_INST_SEND_IF_R getValues(String... names) {
		return (MST_INSP_INST_SEND_IF_R) super.getValues(names);
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
	 public MSW_INSP_INST_SEND_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_INSP_INST_SEND_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_INSP_INST_SEND_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_INSP_INST_SEND_IF_KEY_R.TABLE_NAME);
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
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public String exe_sts_typ() {
		return getConstString(offset + 2, $exe_sts_typ);
	}

	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		setConstString(offset + 2, $exe_sts_typ, value);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 3, $data_crud_typ);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 3, $data_crud_typ, value);
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
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 5, $insp_no);
	}

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 5, $insp_no, value);
	}

	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return getConstNumber(offset + 6, $insp_freq);
	}

	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		setConstNumber(offset + 6, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(int value) {
		setConstNumber(offset + 6, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(long value) {
		setConstNumber(offset + 6, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(float value) {
		setConstNumber(offset + 6, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(double value) {
		setConstNumber(offset + 6, $insp_freq, value);
	}
	
	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 7, $insp_typ);
	}

	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 7, $insp_typ, value);
	}

	/**
	 * 検査方法区分. Inspection method type.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 8, $insp_mtd_typ);
	}

	/**
	 * 検査方法区分. Inspection method type.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 8, $insp_mtd_typ, value);
	}

	/**
	 * 検査状況区分. Inspection status type.<p>
	 *
	 */
	public String insp_sts_typ() {
		return getConstString(offset + 9, $insp_sts_typ);
	}

	/**
	 * 検査状況区分. Inspection status type.<p>
	 *
	 */
	public void insp_sts_typ(String value) {
		setConstString(offset + 9, $insp_sts_typ, value);
	}

	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public String insp_bind_typ() {
		return getConstString(offset + 10, $insp_bind_typ);
	}

	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public void insp_bind_typ(String value) {
		setConstString(offset + 10, $insp_bind_typ, value);
	}

	/**
	 * 予定まとめＦＬＧ. Schedule aggregation flg..<p>
	 *
	 */
	public boolean col_schd_flg() {
		return getConstBoolean(offset + 11, $col_schd_flg);
	}

	/**
	 * 予定まとめＦＬＧ. Schedule aggregation flg..<p>
	 *
	 */
	public void col_schd_flg(boolean value) {
		setConstBoolean(offset + 11, $col_schd_flg, value);
	}

	/**
	 * 検査指図リスト発行済ＦＬＧ. Inspection order list issued flg..<p>
	 *
	 */
	public boolean insp_lst_prnt_flg() {
		return getConstBoolean(offset + 12, $insp_lst_prnt_flg);
	}

	/**
	 * 検査指図リスト発行済ＦＬＧ. Inspection order list issued flg..<p>
	 *
	 */
	public void insp_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 12, $insp_lst_prnt_flg, value);
	}

	/**
	 * 検査指図リスト発行日時. Inspection order list issue date and time.<p>
	 *
	 */
	public MCDate insp_lst_prnt_tm() {
		return getConstDate(offset + 13, $insp_lst_prnt_tm);
	}

	/**
	 * 検査指図リスト発行日時. Inspection order list issue date and time.<p>
	 *
	 */
	public void insp_lst_prnt_tm(MCDate value) {
		setConstDate(offset + 13, $insp_lst_prnt_tm, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 14, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 14, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 15, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 15, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 16, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 16, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 17, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 17, $itm_sub3, value);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public String if_itm_cd() {
		return getConstString(offset + 18, $if_itm_cd);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public void if_itm_cd(String value) {
		setConstString(offset + 18, $if_itm_cd, value);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public String if_itm_sub1() {
		return getConstString(offset + 19, $if_itm_sub1);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public void if_itm_sub1(String value) {
		setConstString(offset + 19, $if_itm_sub1, value);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public String if_itm_sub2() {
		return getConstString(offset + 20, $if_itm_sub2);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public void if_itm_sub2(String value) {
		setConstString(offset + 20, $if_itm_sub2, value);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public String if_itm_sub3() {
		return getConstString(offset + 21, $if_itm_sub3);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public void if_itm_sub3(String value) {
		setConstString(offset + 21, $if_itm_sub3, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 22, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 22, $itm_nm, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 23, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 23, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 24, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 24, $sublot_no, value);
	}

	/**
	 * 入荷日時. Receipt date and time.<p>
	 *
	 */
	public MCDate arr_tm() {
		return getConstDate(offset + 25, $arr_tm);
	}

	/**
	 * 入荷日時. Receipt date and time.<p>
	 *
	 */
	public void arr_tm(MCDate value) {
		setConstDate(offset + 25, $arr_tm, value);
	}

	/**
	 * 最古入庫日. Oldest GR date.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 26, $first_gr_dt);
	}

	/**
	 * 最古入庫日. Oldest GR date.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 26, $first_gr_dt, value);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 27, $vld_dt);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 27, $vld_dt, value);
	}

	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 28, $lmt_dt);
	}

	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 28, $lmt_dt, value);
	}

	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 29, $lmt_dt_frm);
	}

	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 29, $lmt_dt_frm, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 30, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 30, $po_no, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 31, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 31, $sppl_cd, value);
	}

	/**
	 * ＩＦ発注先ＣＤ. IF supplier cd..<p>
	 *
	 */
	public String if_sppl_cd() {
		return getConstString(offset + 32, $if_sppl_cd);
	}

	/**
	 * ＩＦ発注先ＣＤ. IF supplier cd..<p>
	 *
	 */
	public void if_sppl_cd(String value) {
		setConstString(offset + 32, $if_sppl_cd, value);
	}

	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 33, $sppl_nm);
	}

	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 33, $sppl_nm, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 34, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 34, $maker_cd, value);
	}

	/**
	 * ＩＦメーカＣＤ. IF maker cd..<p>
	 *
	 */
	public String if_maker_cd() {
		return getConstString(offset + 35, $if_maker_cd);
	}

	/**
	 * ＩＦメーカＣＤ. IF maker cd..<p>
	 *
	 */
	public void if_maker_cd(String value) {
		setConstString(offset + 35, $if_maker_cd, value);
	}

	/**
	 * メーカ名. Maker name.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 36, $maker_nm);
	}

	/**
	 * メーカ名. Maker name.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 36, $maker_nm, value);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 37, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 37, $mfg_loc_cd, value);
	}

	/**
	 * ＩＦ製造場所ＣＤ. IF mfg. location cd..<p>
	 *
	 */
	public String if_mfg_loc_cd() {
		return getConstString(offset + 38, $if_mfg_loc_cd);
	}

	/**
	 * ＩＦ製造場所ＣＤ. IF mfg. location cd..<p>
	 *
	 */
	public void if_mfg_loc_cd(String value) {
		setConstString(offset + 38, $if_mfg_loc_cd, value);
	}

	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 39, $mfg_loc_nm);
	}

	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 39, $mfg_loc_nm, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 40, $to_site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 40, $to_site_cd, value);
	}

	/**
	 * ＩＦ工場・物流倉庫ＣＤ. IF factory/distribution warehouse cd..<p>
	 *
	 */
	public String if_to_site_cd() {
		return getConstString(offset + 41, $if_to_site_cd);
	}

	/**
	 * ＩＦ工場・物流倉庫ＣＤ. IF factory/distribution warehouse cd..<p>
	 *
	 */
	public void if_to_site_cd(String value) {
		setConstString(offset + 41, $if_to_site_cd, value);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public String to_site_nm() {
		return getConstString(offset + 42, $to_site_nm);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public void to_site_nm(String value) {
		setConstString(offset + 42, $to_site_nm, value);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 43, $bp_lot_no);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 43, $bp_lot_no, value);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 44, $pack_unit_qty);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 44, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 44, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 44, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 44, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 44, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 45, $pack_unit_cd);
	}

	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 45, $pack_unit_cd, value);
	}

	/**
	 * ＩＦ荷姿単位ＣＤ. IF SKU cd..<p>
	 *
	 */
	public String if_pack_unit_cd() {
		return getConstString(offset + 46, $if_pack_unit_cd);
	}

	/**
	 * ＩＦ荷姿単位ＣＤ. IF SKU cd..<p>
	 *
	 */
	public void if_pack_unit_cd(String value) {
		setConstString(offset + 46, $if_pack_unit_cd, value);
	}

	/**
	 * 荷姿単位名. SKU name.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 47, $pack_unit_nm);
	}

	/**
	 * 荷姿単位名. SKU name.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 47, $pack_unit_nm, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 48, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 49, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 49, $base_unit_cd, value);
	}

	/**
	 * ＩＦ基準単位ＣＤ. IF base unit cd..<p>
	 *
	 */
	public String if_base_unit_cd() {
		return getConstString(offset + 50, $if_base_unit_cd);
	}

	/**
	 * ＩＦ基準単位ＣＤ. IF base unit cd..<p>
	 *
	 */
	public void if_base_unit_cd(String value) {
		setConstString(offset + 50, $if_base_unit_cd, value);
	}

	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 51, $base_unit_nm);
	}

	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 51, $base_unit_nm, value);
	}

	/**
	 * 検査指図リストＮＯ. Inspection order list No..<p>
	 *
	 */
	public String insp_lst_no() {
		return getConstString(offset + 52, $insp_lst_no);
	}

	/**
	 * 検査指図リストＮＯ. Inspection order list No..<p>
	 *
	 */
	public void insp_lst_no(String value) {
		setConstString(offset + 52, $insp_lst_no, value);
	}

	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 53, $inst_dt);
	}

	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 53, $inst_dt, value);
	}

	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 54, $inst_dpt_cd);
	}

	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 54, $inst_dpt_cd, value);
	}

	/**
	 * ＩＦ指図部門ＣＤ. IF order dept. cd..<p>
	 *
	 */
	public String if_inst_dpt_cd() {
		return getConstString(offset + 55, $if_inst_dpt_cd);
	}

	/**
	 * ＩＦ指図部門ＣＤ. IF order dept. cd..<p>
	 *
	 */
	public void if_inst_dpt_cd(String value) {
		setConstString(offset + 55, $if_inst_dpt_cd, value);
	}

	/**
	 * 指図部門名. Order dept. name.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 56, $inst_dpt_nm);
	}

	/**
	 * 指図部門名. Order dept. name.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 56, $inst_dpt_nm, value);
	}

	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 57, $inst_usr_cd);
	}

	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 57, $inst_usr_cd, value);
	}

	/**
	 * ＩＦ指図担当者ＣＤ. IF order PIC cd..<p>
	 *
	 */
	public String if_inst_usr_cd() {
		return getConstString(offset + 58, $if_inst_usr_cd);
	}

	/**
	 * ＩＦ指図担当者ＣＤ. IF order PIC cd..<p>
	 *
	 */
	public void if_inst_usr_cd(String value) {
		setConstString(offset + 58, $if_inst_usr_cd, value);
	}

	/**
	 * 指図担当者名. Order PIC name.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 59, $inst_usr_nm);
	}

	/**
	 * 指図担当者名. Order PIC name.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 59, $inst_usr_nm, value);
	}

	/**
	 * 作成元部門ＣＤ. Creating source dept. cd..<p>
	 *
	 */
	public String src_dpt_cd() {
		return getConstString(offset + 60, $src_dpt_cd);
	}

	/**
	 * 作成元部門ＣＤ. Creating source dept. cd..<p>
	 *
	 */
	public void src_dpt_cd(String value) {
		setConstString(offset + 60, $src_dpt_cd, value);
	}

	/**
	 * ＩＦ作成元部門ＣＤ. IF creating source dept. cd..<p>
	 *
	 */
	public String if_src_dpt_cd() {
		return getConstString(offset + 61, $if_src_dpt_cd);
	}

	/**
	 * ＩＦ作成元部門ＣＤ. IF creating source dept. cd..<p>
	 *
	 */
	public void if_src_dpt_cd(String value) {
		setConstString(offset + 61, $if_src_dpt_cd, value);
	}

	/**
	 * 作成元部門名. Creating source dept. name.<p>
	 *
	 */
	public String src_dpt_nm() {
		return getConstString(offset + 62, $src_dpt_nm);
	}

	/**
	 * 作成元部門名. Creating source dept. name.<p>
	 *
	 */
	public void src_dpt_nm(String value) {
		setConstString(offset + 62, $src_dpt_nm, value);
	}

	/**
	 * 作成元担当者ＣＤ. Creating source PIC cd..<p>
	 *
	 */
	public String src_usr_cd() {
		return getConstString(offset + 63, $src_usr_cd);
	}

	/**
	 * 作成元担当者ＣＤ. Creating source PIC cd..<p>
	 *
	 */
	public void src_usr_cd(String value) {
		setConstString(offset + 63, $src_usr_cd, value);
	}

	/**
	 * ＩＦ作成元担当者ＣＤ. IF creating source PIC cd..<p>
	 *
	 */
	public String if_src_usr_cd() {
		return getConstString(offset + 64, $if_src_usr_cd);
	}

	/**
	 * ＩＦ作成元担当者ＣＤ. IF creating source PIC cd..<p>
	 *
	 */
	public void if_src_usr_cd(String value) {
		setConstString(offset + 64, $if_src_usr_cd, value);
	}

	/**
	 * 作成元担当者名. Creating source PIC name.<p>
	 *
	 */
	public String src_usr_nm() {
		return getConstString(offset + 65, $src_usr_nm);
	}

	/**
	 * 作成元担当者名. Creating source PIC name.<p>
	 *
	 */
	public void src_usr_nm(String value) {
		setConstString(offset + 65, $src_usr_nm, value);
	}

	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 66, $master_dt);
	}

	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 66, $master_dt, value);
	}

	/**
	 * 製造着手予定日時. Scheduled mfg. start date and time.<p>
	 *
	 */
	public MCDate mfg_st_schd_tm() {
		return getConstDate(offset + 67, $mfg_st_schd_tm);
	}

	/**
	 * 製造着手予定日時. Scheduled mfg. start date and time.<p>
	 *
	 */
	public void mfg_st_schd_tm(MCDate value) {
		setConstDate(offset + 67, $mfg_st_schd_tm, value);
	}

	/**
	 * 製造終了予定日時. Scheduled mfg. end date and time.<p>
	 *
	 */
	public MCDate mfg_end_schd_tm() {
		return getConstDate(offset + 68, $mfg_end_schd_tm);
	}

	/**
	 * 製造終了予定日時. Scheduled mfg. end date and time.<p>
	 *
	 */
	public void mfg_end_schd_tm(MCDate value) {
		setConstDate(offset + 68, $mfg_end_schd_tm, value);
	}

	/**
	 * 検査開始予定日時. Scheduled inspection start date and time.<p>
	 *
	 */
	public MCDate insp_st_tm() {
		return getConstDate(offset + 69, $insp_st_tm);
	}

	/**
	 * 検査開始予定日時. Scheduled inspection start date and time.<p>
	 *
	 */
	public void insp_st_tm(MCDate value) {
		setConstDate(offset + 69, $insp_st_tm, value);
	}

	/**
	 * 検査終了予定日時. Scheduled inspection end date and time.<p>
	 *
	 */
	public MCDate insp_end_tm() {
		return getConstDate(offset + 70, $insp_end_tm);
	}

	/**
	 * 検査終了予定日時. Scheduled inspection end date and time.<p>
	 *
	 */
	public void insp_end_tm(MCDate value) {
		setConstDate(offset + 70, $insp_end_tm, value);
	}

	/**
	 * 検査パタンＣＤ. Inspection pattern cd..<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 71, $insp_ptn_cd);
	}

	/**
	 * 検査パタンＣＤ. Inspection pattern cd..<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 71, $insp_ptn_cd, value);
	}

	/**
	 * 検査パタン名. Inspection pattern name.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 72, $insp_ptn_nm);
	}

	/**
	 * 検査パタン名. Inspection pattern name.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 72, $insp_ptn_nm, value);
	}

	/**
	 * 規格検査必須ＦＬＧ. Specific inspection required flg..<p>
	 *
	 */
	public boolean std_req_flg() {
		return getConstBoolean(offset + 73, $std_req_flg);
	}

	/**
	 * 規格検査必須ＦＬＧ. Specific inspection required flg..<p>
	 *
	 */
	public void std_req_flg(boolean value) {
		setConstBoolean(offset + 73, $std_req_flg, value);
	}

	/**
	 * 規格実績確認必須ＦＬＧ. Specific result check required flg..<p>
	 *
	 */
	public boolean std_cnf_req_flg() {
		return getConstBoolean(offset + 74, $std_cnf_req_flg);
	}

	/**
	 * 規格実績確認必須ＦＬＧ. Specific result check required flg..<p>
	 *
	 */
	public void std_cnf_req_flg(boolean value) {
		setConstBoolean(offset + 74, $std_cnf_req_flg, value);
	}

	/**
	 * 規格書ＮＯ. Specific inspection No..<p>
	 *
	 */
	public String insp_std_no() {
		return getConstString(offset + 75, $insp_std_no);
	}

	/**
	 * 規格書ＮＯ. Specific inspection No..<p>
	 *
	 */
	public void insp_std_no(String value) {
		setConstString(offset + 75, $insp_std_no, value);
	}

	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public boolean plnt_aprv_flg() {
		return getConstBoolean(offset + 76, $plnt_aprv_flg);
	}

	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public void plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 76, $plnt_aprv_flg, value);
	}

	/**
	 * 検査成績書発行済ＦＬＧ. Inspection report printed flg..<p>
	 *
	 */
	public boolean insp_rslt_prnt_flg() {
		return getConstBoolean(offset + 77, $insp_rslt_prnt_flg);
	}

	/**
	 * 検査成績書発行済ＦＬＧ. Inspection report printed flg..<p>
	 *
	 */
	public void insp_rslt_prnt_flg(boolean value) {
		setConstBoolean(offset + 77, $insp_rslt_prnt_flg, value);
	}

	/**
	 * 検査成績書発行日時. Inspection report printed date and time.<p>
	 *
	 */
	public MCDate insp_rslt_prnt_tm() {
		return getConstDate(offset + 78, $insp_rslt_prnt_tm);
	}

	/**
	 * 検査成績書発行日時. Inspection report printed date and time.<p>
	 *
	 */
	public void insp_rslt_prnt_tm(MCDate value) {
		setConstDate(offset + 78, $insp_rslt_prnt_tm, value);
	}

	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public MCNumber seq() {
		return getConstNumber(offset + 79, $seq);
	}

	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public void seq(MCNumber value) {
		setConstNumber(offset + 79, $seq, value);
	}
	
	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public void seq(int value) {
		setConstNumber(offset + 79, $seq, value);
	}
	
	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public void seq(long value) {
		setConstNumber(offset + 79, $seq, value);
	}
	
	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public void seq(float value) {
		setConstNumber(offset + 79, $seq, value);
	}
	
	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public void seq(double value) {
		setConstNumber(offset + 79, $seq, value);
	}
	
	/**
	 * 期限再検査ＦＬＧ. Re-inspection for expiration flg..<p>
	 *
	 */
	public boolean lmt_up_flg() {
		return getConstBoolean(offset + 80, $lmt_up_flg);
	}

	/**
	 * 期限再検査ＦＬＧ. Re-inspection for expiration flg..<p>
	 *
	 */
	public void lmt_up_flg(boolean value) {
		setConstBoolean(offset + 80, $lmt_up_flg, value);
	}

	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public boolean insp_aprv_flg() {
		return getConstBoolean(offset + 81, $insp_aprv_flg);
	}

	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public void insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 81, $insp_aprv_flg, value);
	}

	/**
	 * 検査承認状況区分. Inspection approval status type.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 82, $insp_aprv_sts_typ);
	}

	/**
	 * 検査承認状況区分. Inspection approval status type.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 82, $insp_aprv_sts_typ, value);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 83, $aprv_dt);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 83, $aprv_dt, value);
	}

	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public String insp_aprv_role_cd() {
		return getConstString(offset + 84, $insp_aprv_role_cd);
	}

	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public void insp_aprv_role_cd(String value) {
		setConstString(offset + 84, $insp_aprv_role_cd, value);
	}

	/**
	 * 検査承認役割名. Inspection approval role name.<p>
	 *
	 */
	public String insp_aprv_role_nm() {
		return getConstString(offset + 85, $insp_aprv_role_nm);
	}

	/**
	 * 検査承認役割名. Inspection approval role name.<p>
	 *
	 */
	public void insp_aprv_role_nm(String value) {
		setConstString(offset + 85, $insp_aprv_role_nm, value);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 86, $aprv_dpt_cd);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 86, $aprv_dpt_cd, value);
	}

	/**
	 * ＩＦ承認部門ＣＤ. IF approval dept. cd..<p>
	 *
	 */
	public String if_aprv_dpt_cd() {
		return getConstString(offset + 87, $if_aprv_dpt_cd);
	}

	/**
	 * ＩＦ承認部門ＣＤ. IF approval dept. cd..<p>
	 *
	 */
	public void if_aprv_dpt_cd(String value) {
		setConstString(offset + 87, $if_aprv_dpt_cd, value);
	}

	/**
	 * 承認部門名. Approval dept. name.<p>
	 *
	 */
	public String aprv_dpt_nm() {
		return getConstString(offset + 88, $aprv_dpt_nm);
	}

	/**
	 * 承認部門名. Approval dept. name.<p>
	 *
	 */
	public void aprv_dpt_nm(String value) {
		setConstString(offset + 88, $aprv_dpt_nm, value);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 89, $aprv_usr_cd);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 89, $aprv_usr_cd, value);
	}

	/**
	 * ＩＦ承認者ＣＤ. IF approver cd..<p>
	 *
	 */
	public String if_aprv_usr_cd() {
		return getConstString(offset + 90, $if_aprv_usr_cd);
	}

	/**
	 * ＩＦ承認者ＣＤ. IF approver cd..<p>
	 *
	 */
	public void if_aprv_usr_cd(String value) {
		setConstString(offset + 90, $if_aprv_usr_cd, value);
	}

	/**
	 * 承認者名. Approver name.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return getConstString(offset + 91, $aprv_usr_nm);
	}

	/**
	 * 承認者名. Approver name.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		setConstString(offset + 91, $aprv_usr_nm, value);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 92, $aprv_rsn);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 92, $aprv_rsn, value);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 93, $act_cont_fctr);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 93, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 93, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 93, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 93, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 93, $act_cont_fctr, value);
	}
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 94, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 94, $intr_rmrks, value);
	}

	/**
	 * 検査予定ＮＯ. Inspection schedule No..<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 95, $insp_schd_no);
	}

	/**
	 * 検査予定ＮＯ. Inspection schedule No..<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 95, $insp_schd_no, value);
	}

	/**
	 * 作成元ＮＯ１. Source No. 1.<p>
	 *
	 */
	public String src_no1() {
		return getConstString(offset + 96, $src_no1);
	}

	/**
	 * 作成元ＮＯ１. Source No. 1.<p>
	 *
	 */
	public void src_no1(String value) {
		setConstString(offset + 96, $src_no1, value);
	}

	/**
	 * 作成元ＮＯ２. Source No. 2.<p>
	 *
	 */
	public String src_no2() {
		return getConstString(offset + 97, $src_no2);
	}

	/**
	 * 作成元ＮＯ２. Source No. 2.<p>
	 *
	 */
	public void src_no2(String value) {
		setConstString(offset + 97, $src_no2, value);
	}

	/**
	 * 作成元ＮＯ３. Source No. 3.<p>
	 *
	 */
	public String src_no3() {
		return getConstString(offset + 98, $src_no3);
	}

	/**
	 * 作成元ＮＯ３. Source No. 3.<p>
	 *
	 */
	public void src_no3(String value) {
		setConstString(offset + 98, $src_no3, value);
	}

	/**
	 * 作成元ＮＯ４. Source No. 4.<p>
	 *
	 */
	public String src_no4() {
		return getConstString(offset + 99, $src_no4);
	}

	/**
	 * 作成元ＮＯ４. Source No. 4.<p>
	 *
	 */
	public void src_no4(String value) {
		setConstString(offset + 99, $src_no4, value);
	}

	/**
	 * 場所ＣＤ（予定）. Location cd. (Schedule).<p>
	 *
	 */
	public String schd_loc_cd() {
		return getConstString(offset + 100, $schd_loc_cd);
	}

	/**
	 * 場所ＣＤ（予定）. Location cd. (Schedule).<p>
	 *
	 */
	public void schd_loc_cd(String value) {
		setConstString(offset + 100, $schd_loc_cd, value);
	}

	/**
	 * ＩＦ場所ＣＤ（予定）. IF location cd. (Schedule).<p>
	 *
	 */
	public String if_schd_loc_cd() {
		return getConstString(offset + 101, $if_schd_loc_cd);
	}

	/**
	 * ＩＦ場所ＣＤ（予定）. IF location cd. (Schedule).<p>
	 *
	 */
	public void if_schd_loc_cd(String value) {
		setConstString(offset + 101, $if_schd_loc_cd, value);
	}

	/**
	 * 場所名（予定）. Location name (Schedule).<p>
	 *
	 */
	public String schd_loc_nm() {
		return getConstString(offset + 102, $schd_loc_nm);
	}

	/**
	 * 場所名（予定）. Location name (Schedule).<p>
	 *
	 */
	public void schd_loc_nm(String value) {
		setConstString(offset + 102, $schd_loc_nm, value);
	}

	/**
	 * 棚・ラインＣＤ（予定）. Rack/Line cd. (Schedule).<p>
	 *
	 */
	public String schd_str_ln_cd() {
		return getConstString(offset + 103, $schd_str_ln_cd);
	}

	/**
	 * 棚・ラインＣＤ（予定）. Rack/Line cd. (Schedule).<p>
	 *
	 */
	public void schd_str_ln_cd(String value) {
		setConstString(offset + 103, $schd_str_ln_cd, value);
	}

	/**
	 * ＩＦ棚・ラインＣＤ（予定）. IF rack/line cd. (Schedule).<p>
	 *
	 */
	public String if_schd_str_ln_cd() {
		return getConstString(offset + 104, $if_schd_str_ln_cd);
	}

	/**
	 * ＩＦ棚・ラインＣＤ（予定）. IF rack/line cd. (Schedule).<p>
	 *
	 */
	public void if_schd_str_ln_cd(String value) {
		setConstString(offset + 104, $if_schd_str_ln_cd, value);
	}

	/**
	 * 棚・ライン名（予定）. Rack/Line name (Schedule).<p>
	 *
	 */
	public String schd_str_ln_nm() {
		return getConstString(offset + 105, $schd_str_ln_nm);
	}

	/**
	 * 棚・ライン名（予定）. Rack/Line name (Schedule).<p>
	 *
	 */
	public void schd_str_ln_nm(String value) {
		setConstString(offset + 105, $schd_str_ln_nm, value);
	}

	/**
	 * 在庫着荷先ＣＤ（予定）. Inventory arriving point cd. (Schedule).<p>
	 *
	 */
	public String schd_stk_arrv_bp_cd() {
		return getConstString(offset + 106, $schd_stk_arrv_bp_cd);
	}

	/**
	 * 在庫着荷先ＣＤ（予定）. Inventory arriving point cd. (Schedule).<p>
	 *
	 */
	public void schd_stk_arrv_bp_cd(String value) {
		setConstString(offset + 106, $schd_stk_arrv_bp_cd, value);
	}

	/**
	 * ＩＦ在庫着荷先ＣＤ（予定）. IF inventory arriving point cd. (Schedule).<p>
	 *
	 */
	public String if_schd_stk_arrv_bp_cd() {
		return getConstString(offset + 107, $if_schd_stk_arrv_bp_cd);
	}

	/**
	 * ＩＦ在庫着荷先ＣＤ（予定）. IF inventory arriving point cd. (Schedule).<p>
	 *
	 */
	public void if_schd_stk_arrv_bp_cd(String value) {
		setConstString(offset + 107, $if_schd_stk_arrv_bp_cd, value);
	}

	/**
	 * 在庫着荷先名（予定）. Inventory arriving point name (Schedule).<p>
	 *
	 */
	public String schd_stk_arrv_bp_nm() {
		return getConstString(offset + 108, $schd_stk_arrv_bp_nm);
	}

	/**
	 * 在庫着荷先名（予定）. Inventory arriving point name (Schedule).<p>
	 *
	 */
	public void schd_stk_arrv_bp_nm(String value) {
		setConstString(offset + 108, $schd_stk_arrv_bp_nm, value);
	}

	/**
	 * 手配ＮＯ１（予定）. SEIBAN No. 1 (Schedule).<p>
	 *
	 */
	public String schd_sno1() {
		return getConstString(offset + 109, $schd_sno1);
	}

	/**
	 * 手配ＮＯ１（予定）. SEIBAN No. 1 (Schedule).<p>
	 *
	 */
	public void schd_sno1(String value) {
		setConstString(offset + 109, $schd_sno1, value);
	}

	/**
	 * 手配ＮＯ２（予定）. SEIBAN No. 2 (Schedule).<p>
	 *
	 */
	public String schd_sno2() {
		return getConstString(offset + 110, $schd_sno2);
	}

	/**
	 * 手配ＮＯ２（予定）. SEIBAN No. 2 (Schedule).<p>
	 *
	 */
	public void schd_sno2(String value) {
		setConstString(offset + 110, $schd_sno2, value);
	}

	/**
	 * 手配ＮＯ３（予定）. SEIBAN No. 3 (Schedule).<p>
	 *
	 */
	public String schd_sno3() {
		return getConstString(offset + 111, $schd_sno3);
	}

	/**
	 * 手配ＮＯ３（予定）. SEIBAN No. 3 (Schedule).<p>
	 *
	 */
	public void schd_sno3(String value) {
		setConstString(offset + 111, $schd_sno3, value);
	}

	/**
	 * 手配ＮＯ４（予定）. SEIBAN No. 4 (Schedule).<p>
	 *
	 */
	public String schd_sno4() {
		return getConstString(offset + 112, $schd_sno4);
	}

	/**
	 * 手配ＮＯ４（予定）. SEIBAN No. 4 (Schedule).<p>
	 *
	 */
	public void schd_sno4(String value) {
		setConstString(offset + 112, $schd_sno4, value);
	}

	/**
	 * 格付ＣＤ（予定）. Grading cd. (Schedule).<p>
	 *
	 */
	public String schd_gd_cd() {
		return getConstString(offset + 113, $schd_gd_cd);
	}

	/**
	 * 格付ＣＤ（予定）. Grading cd. (Schedule).<p>
	 *
	 */
	public void schd_gd_cd(String value) {
		setConstString(offset + 113, $schd_gd_cd, value);
	}

	/**
	 * ＩＦ格付ＣＤ（予定）. IF grading cd. (Schedule).<p>
	 *
	 */
	public String if_schd_gd_cd() {
		return getConstString(offset + 114, $if_schd_gd_cd);
	}

	/**
	 * ＩＦ格付ＣＤ（予定）. IF grading cd. (Schedule).<p>
	 *
	 */
	public void if_schd_gd_cd(String value) {
		setConstString(offset + 114, $if_schd_gd_cd, value);
	}

	/**
	 * 格付名（予定）. Grading name (Schedule).<p>
	 *
	 */
	public String schd_gd_nm() {
		return getConstString(offset + 115, $schd_gd_nm);
	}

	/**
	 * 格付名（予定）. Grading name (Schedule).<p>
	 *
	 */
	public void schd_gd_nm(String value) {
		setConstString(offset + 115, $schd_gd_nm, value);
	}

	/**
	 * 良品区分（予定）. Conforming type (Schedule).<p>
	 *
	 */
	public String schd_quality_typ() {
		return getConstString(offset + 116, $schd_quality_typ);
	}

	/**
	 * 良品区分（予定）. Conforming type (Schedule).<p>
	 *
	 */
	public void schd_quality_typ(String value) {
		setConstString(offset + 116, $schd_quality_typ, value);
	}

	/**
	 * 在庫検査区分（予定）. Inventory inspection type (Schedule).<p>
	 *
	 */
	public String schd_stk_insp_typ() {
		return getConstString(offset + 117, $schd_stk_insp_typ);
	}

	/**
	 * 在庫検査区分（予定）. Inventory inspection type (Schedule).<p>
	 *
	 */
	public void schd_stk_insp_typ(String value) {
		setConstString(offset + 117, $schd_stk_insp_typ, value);
	}

	/**
	 * 在庫識別区分（予定）. Inventory identification type (Schedule).<p>
	 *
	 */
	public String schd_stk_id_typ() {
		return getConstString(offset + 118, $schd_stk_id_typ);
	}

	/**
	 * 在庫識別区分（予定）. Inventory identification type (Schedule).<p>
	 *
	 */
	public void schd_stk_id_typ(String value) {
		setConstString(offset + 118, $schd_stk_id_typ, value);
	}

	/**
	 * 在庫取引先ＣＤ（予定）. Inventory BP cd. (Schedule).<p>
	 *
	 */
	public String schd_stk_bp_cd() {
		return getConstString(offset + 119, $schd_stk_bp_cd);
	}

	/**
	 * 在庫取引先ＣＤ（予定）. Inventory BP cd. (Schedule).<p>
	 *
	 */
	public void schd_stk_bp_cd(String value) {
		setConstString(offset + 119, $schd_stk_bp_cd, value);
	}

	/**
	 * ＩＦ在庫取引先ＣＤ（予定）. IF inventory BP cd. (Schedule).<p>
	 *
	 */
	public String if_schd_stk_bp_cd() {
		return getConstString(offset + 120, $if_schd_stk_bp_cd);
	}

	/**
	 * ＩＦ在庫取引先ＣＤ（予定）. IF inventory BP cd. (Schedule).<p>
	 *
	 */
	public void if_schd_stk_bp_cd(String value) {
		setConstString(offset + 120, $if_schd_stk_bp_cd, value);
	}

	/**
	 * 在庫取引先名（予定）. Inventory BP name (Schedule).<p>
	 *
	 */
	public String schd_stk_bp_nm() {
		return getConstString(offset + 121, $schd_stk_bp_nm);
	}

	/**
	 * 在庫取引先名（予定）. Inventory BP name (Schedule).<p>
	 *
	 */
	public void schd_stk_bp_nm(String value) {
		setConstString(offset + 121, $schd_stk_bp_nm, value);
	}

	/**
	 * 荷姿単位数量（予定）. SKU qty. (Schedule).<p>
	 *
	 */
	public MCNumber schd_pack_unit_qty() {
		return getConstNumber(offset + 122, $schd_pack_unit_qty);
	}

	/**
	 * 荷姿単位数量（予定）. SKU qty. (Schedule).<p>
	 *
	 */
	public void schd_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 122, $schd_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量（予定）. SKU qty. (Schedule).<p>
	 *
	 */
	public void schd_pack_unit_qty(int value) {
		setConstNumber(offset + 122, $schd_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量（予定）. SKU qty. (Schedule).<p>
	 *
	 */
	public void schd_pack_unit_qty(long value) {
		setConstNumber(offset + 122, $schd_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量（予定）. SKU qty. (Schedule).<p>
	 *
	 */
	public void schd_pack_unit_qty(float value) {
		setConstNumber(offset + 122, $schd_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量（予定）. SKU qty. (Schedule).<p>
	 *
	 */
	public void schd_pack_unit_qty(double value) {
		setConstNumber(offset + 122, $schd_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位ＣＤ（予定）. SKU cd. (Schedule).<p>
	 *
	 */
	public String schd_pack_unit_cd() {
		return getConstString(offset + 123, $schd_pack_unit_cd);
	}

	/**
	 * 荷姿単位ＣＤ（予定）. SKU cd. (Schedule).<p>
	 *
	 */
	public void schd_pack_unit_cd(String value) {
		setConstString(offset + 123, $schd_pack_unit_cd, value);
	}

	/**
	 * ＩＦ荷姿単位ＣＤ（予定）. IF SKU cd. (Schedule).<p>
	 *
	 */
	public String if_schd_pack_unit_cd() {
		return getConstString(offset + 124, $if_schd_pack_unit_cd);
	}

	/**
	 * ＩＦ荷姿単位ＣＤ（予定）. IF SKU cd. (Schedule).<p>
	 *
	 */
	public void if_schd_pack_unit_cd(String value) {
		setConstString(offset + 124, $if_schd_pack_unit_cd, value);
	}

	/**
	 * 荷姿単位名（予定）. SKU name (Schedule).<p>
	 *
	 */
	public String schd_pack_unit_nm() {
		return getConstString(offset + 125, $schd_pack_unit_nm);
	}

	/**
	 * 荷姿単位名（予定）. SKU name (Schedule).<p>
	 *
	 */
	public void schd_pack_unit_nm(String value) {
		setConstString(offset + 125, $schd_pack_unit_nm, value);
	}

	/**
	 * 基準単位数量（予定）. Base unit qty. (Schedule).<p>
	 *
	 */
	public MCNumber schd_base_unit_qty() {
		return getConstNumber(offset + 126, $schd_base_unit_qty);
	}

	/**
	 * 基準単位数量（予定）. Base unit qty. (Schedule).<p>
	 *
	 */
	public void schd_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 126, $schd_base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量（予定）. Base unit qty. (Schedule).<p>
	 *
	 */
	public void schd_base_unit_qty(int value) {
		setConstNumber(offset + 126, $schd_base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量（予定）. Base unit qty. (Schedule).<p>
	 *
	 */
	public void schd_base_unit_qty(long value) {
		setConstNumber(offset + 126, $schd_base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量（予定）. Base unit qty. (Schedule).<p>
	 *
	 */
	public void schd_base_unit_qty(float value) {
		setConstNumber(offset + 126, $schd_base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量（予定）. Base unit qty. (Schedule).<p>
	 *
	 */
	public void schd_base_unit_qty(double value) {
		setConstNumber(offset + 126, $schd_base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ（予定）. Base unit cd. (Schedule).<p>
	 *
	 */
	public String schd_base_unit_cd() {
		return getConstString(offset + 127, $schd_base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ（予定）. Base unit cd. (Schedule).<p>
	 *
	 */
	public void schd_base_unit_cd(String value) {
		setConstString(offset + 127, $schd_base_unit_cd, value);
	}

	/**
	 * ＩＦ基準単位ＣＤ（予定）. IF base unit cd. (Schedule).<p>
	 *
	 */
	public String if_schd_base_unit_cd() {
		return getConstString(offset + 128, $if_schd_base_unit_cd);
	}

	/**
	 * ＩＦ基準単位ＣＤ（予定）. IF base unit cd. (Schedule).<p>
	 *
	 */
	public void if_schd_base_unit_cd(String value) {
		setConstString(offset + 128, $if_schd_base_unit_cd, value);
	}

	/**
	 * 基準単位名（予定）. Base unit name (Schedule).<p>
	 *
	 */
	public String schd_base_unit_nm() {
		return getConstString(offset + 129, $schd_base_unit_nm);
	}

	/**
	 * 基準単位名（予定）. Base unit name (Schedule).<p>
	 *
	 */
	public void schd_base_unit_nm(String value) {
		setConstString(offset + 129, $schd_base_unit_nm, value);
	}

	/**
	 * 場所ＣＤ（在庫）. Location cd. (Inventory).<p>
	 *
	 */
	public String stk_loc_cd() {
		return getConstString(offset + 130, $stk_loc_cd);
	}

	/**
	 * 場所ＣＤ（在庫）. Location cd. (Inventory).<p>
	 *
	 */
	public void stk_loc_cd(String value) {
		setConstString(offset + 130, $stk_loc_cd, value);
	}

	/**
	 * ＩＦ場所ＣＤ（在庫）. IF location cd. (Inventory).<p>
	 *
	 */
	public String if_stk_loc_cd() {
		return getConstString(offset + 131, $if_stk_loc_cd);
	}

	/**
	 * ＩＦ場所ＣＤ（在庫）. IF location cd. (Inventory).<p>
	 *
	 */
	public void if_stk_loc_cd(String value) {
		setConstString(offset + 131, $if_stk_loc_cd, value);
	}

	/**
	 * 場所名（在庫）. Location name (Inventory).<p>
	 *
	 */
	public String stk_loc_nm() {
		return getConstString(offset + 132, $stk_loc_nm);
	}

	/**
	 * 場所名（在庫）. Location name (Inventory).<p>
	 *
	 */
	public void stk_loc_nm(String value) {
		setConstString(offset + 132, $stk_loc_nm, value);
	}

	/**
	 * 棚・ラインＣＤ（在庫）. Rack/Line cd. (Inventory).<p>
	 *
	 */
	public String stk_str_ln_cd() {
		return getConstString(offset + 133, $stk_str_ln_cd);
	}

	/**
	 * 棚・ラインＣＤ（在庫）. Rack/Line cd. (Inventory).<p>
	 *
	 */
	public void stk_str_ln_cd(String value) {
		setConstString(offset + 133, $stk_str_ln_cd, value);
	}

	/**
	 * ＩＦ棚・ラインＣＤ（在庫）. IF rack/line cd. (Inventory).<p>
	 *
	 */
	public String if_stk_str_ln_cd() {
		return getConstString(offset + 134, $if_stk_str_ln_cd);
	}

	/**
	 * ＩＦ棚・ラインＣＤ（在庫）. IF rack/line cd. (Inventory).<p>
	 *
	 */
	public void if_stk_str_ln_cd(String value) {
		setConstString(offset + 134, $if_stk_str_ln_cd, value);
	}

	/**
	 * 棚・ライン名（在庫）. Rack/Line name (Inventory).<p>
	 *
	 */
	public String stk_str_ln_nm() {
		return getConstString(offset + 135, $stk_str_ln_nm);
	}

	/**
	 * 棚・ライン名（在庫）. Rack/Line name (Inventory).<p>
	 *
	 */
	public void stk_str_ln_nm(String value) {
		setConstString(offset + 135, $stk_str_ln_nm, value);
	}

	/**
	 * 在庫着荷先ＣＤ（在庫）. Inventory arriving point cd. (Inventory).<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 136, $stk_arrv_bp_cd);
	}

	/**
	 * 在庫着荷先ＣＤ（在庫）. Inventory arriving point cd. (Inventory).<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 136, $stk_arrv_bp_cd, value);
	}

	/**
	 * ＩＦ在庫着荷先ＣＤ（在庫）. IF inventory arriving point cd. (Inventory).<p>
	 *
	 */
	public String if_stk_arrv_bp_cd() {
		return getConstString(offset + 137, $if_stk_arrv_bp_cd);
	}

	/**
	 * ＩＦ在庫着荷先ＣＤ（在庫）. IF inventory arriving point cd. (Inventory).<p>
	 *
	 */
	public void if_stk_arrv_bp_cd(String value) {
		setConstString(offset + 137, $if_stk_arrv_bp_cd, value);
	}

	/**
	 * 在庫着荷先名（在庫）. Inventory arriving point name (Inventory).<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 138, $stk_arrv_bp_nm);
	}

	/**
	 * 在庫着荷先名（在庫）. Inventory arriving point name (Inventory).<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 138, $stk_arrv_bp_nm, value);
	}

	/**
	 * 手配ＮＯ１（在庫）. SEIBAN No. 1 (Inventory).<p>
	 *
	 */
	public String stk_sno1() {
		return getConstString(offset + 139, $stk_sno1);
	}

	/**
	 * 手配ＮＯ１（在庫）. SEIBAN No. 1 (Inventory).<p>
	 *
	 */
	public void stk_sno1(String value) {
		setConstString(offset + 139, $stk_sno1, value);
	}

	/**
	 * 手配ＮＯ２（在庫）. SEIBAN No. 2 (Inventory).<p>
	 *
	 */
	public String stk_sno2() {
		return getConstString(offset + 140, $stk_sno2);
	}

	/**
	 * 手配ＮＯ２（在庫）. SEIBAN No. 2 (Inventory).<p>
	 *
	 */
	public void stk_sno2(String value) {
		setConstString(offset + 140, $stk_sno2, value);
	}

	/**
	 * 手配ＮＯ３（在庫）. SEIBAN No. 3 (Inventory).<p>
	 *
	 */
	public String stk_sno3() {
		return getConstString(offset + 141, $stk_sno3);
	}

	/**
	 * 手配ＮＯ３（在庫）. SEIBAN No. 3 (Inventory).<p>
	 *
	 */
	public void stk_sno3(String value) {
		setConstString(offset + 141, $stk_sno3, value);
	}

	/**
	 * 手配ＮＯ４（在庫）. SEIBAN No. 4 (Inventory).<p>
	 *
	 */
	public String stk_sno4() {
		return getConstString(offset + 142, $stk_sno4);
	}

	/**
	 * 手配ＮＯ４（在庫）. SEIBAN No. 4 (Inventory).<p>
	 *
	 */
	public void stk_sno4(String value) {
		setConstString(offset + 142, $stk_sno4, value);
	}

	/**
	 * 確定ＮＯ区分（在庫）. Firm No. type (Inventory).<p>
	 *
	 */
	public String stk_fix_no_typ() {
		return getConstString(offset + 143, $stk_fix_no_typ);
	}

	/**
	 * 確定ＮＯ区分（在庫）. Firm No. type (Inventory).<p>
	 *
	 */
	public void stk_fix_no_typ(String value) {
		setConstString(offset + 143, $stk_fix_no_typ, value);
	}

	/**
	 * 確定ＮＯ（在庫）. Firm No. (Inventory).<p>
	 *
	 */
	public String stk_fix_no() {
		return getConstString(offset + 144, $stk_fix_no);
	}

	/**
	 * 確定ＮＯ（在庫）. Firm No. (Inventory).<p>
	 *
	 */
	public void stk_fix_no(String value) {
		setConstString(offset + 144, $stk_fix_no, value);
	}

	/**
	 * 荷姿単位ＣＤ（在庫）. SKU cd. (Inventory).<p>
	 *
	 */
	public String stk_pack_unit_cd() {
		return getConstString(offset + 145, $stk_pack_unit_cd);
	}

	/**
	 * 荷姿単位ＣＤ（在庫）. SKU cd. (Inventory).<p>
	 *
	 */
	public void stk_pack_unit_cd(String value) {
		setConstString(offset + 145, $stk_pack_unit_cd, value);
	}

	/**
	 * ＩＦ荷姿単位ＣＤ（在庫）. IF SKU cd. (Inventory).<p>
	 *
	 */
	public String if_stk_pack_unit_cd() {
		return getConstString(offset + 146, $if_stk_pack_unit_cd);
	}

	/**
	 * ＩＦ荷姿単位ＣＤ（在庫）. IF SKU cd. (Inventory).<p>
	 *
	 */
	public void if_stk_pack_unit_cd(String value) {
		setConstString(offset + 146, $if_stk_pack_unit_cd, value);
	}

	/**
	 * 荷姿単位名（在庫）. SKU name (Inventory).<p>
	 *
	 */
	public String stk_pack_unit_nm() {
		return getConstString(offset + 147, $stk_pack_unit_nm);
	}

	/**
	 * 荷姿単位名（在庫）. SKU name (Inventory).<p>
	 *
	 */
	public void stk_pack_unit_nm(String value) {
		setConstString(offset + 147, $stk_pack_unit_nm, value);
	}

	/**
	 * 格付ＣＤ（在庫）. Grading cd. (Inventory).<p>
	 *
	 */
	public String stk_gd_cd() {
		return getConstString(offset + 148, $stk_gd_cd);
	}

	/**
	 * 格付ＣＤ（在庫）. Grading cd. (Inventory).<p>
	 *
	 */
	public void stk_gd_cd(String value) {
		setConstString(offset + 148, $stk_gd_cd, value);
	}

	/**
	 * ＩＦ格付ＣＤ（在庫）. IF grading cd. (Inventory).<p>
	 *
	 */
	public String if_stk_gd_cd() {
		return getConstString(offset + 149, $if_stk_gd_cd);
	}

	/**
	 * ＩＦ格付ＣＤ（在庫）. IF grading cd. (Inventory).<p>
	 *
	 */
	public void if_stk_gd_cd(String value) {
		setConstString(offset + 149, $if_stk_gd_cd, value);
	}

	/**
	 * 格付名（在庫）. Grading name (Inventory).<p>
	 *
	 */
	public String stk_gd_nm() {
		return getConstString(offset + 150, $stk_gd_nm);
	}

	/**
	 * 格付名（在庫）. Grading name (Inventory).<p>
	 *
	 */
	public void stk_gd_nm(String value) {
		setConstString(offset + 150, $stk_gd_nm, value);
	}

	/**
	 * 良品区分（在庫）. Conforming type (Inventory).<p>
	 *
	 */
	public String stk_quality_typ() {
		return getConstString(offset + 151, $stk_quality_typ);
	}

	/**
	 * 良品区分（在庫）. Conforming type (Inventory).<p>
	 *
	 */
	public void stk_quality_typ(String value) {
		setConstString(offset + 151, $stk_quality_typ, value);
	}

	/**
	 * 在庫検査区分（在庫）. Inventory inspection type (Inventory).<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 152, $stk_insp_typ);
	}

	/**
	 * 在庫検査区分（在庫）. Inventory inspection type (Inventory).<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 152, $stk_insp_typ, value);
	}

	/**
	 * 在庫識別区分（在庫）. Inventory identification type (Inventory).<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 153, $stk_id_typ);
	}

	/**
	 * 在庫識別区分（在庫）. Inventory identification type (Inventory).<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 153, $stk_id_typ, value);
	}

	/**
	 * 在庫取引先ＣＤ（在庫）. Inventory BP cd. (Inventory).<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 154, $stk_bp_cd);
	}

	/**
	 * 在庫取引先ＣＤ（在庫）. Inventory BP cd. (Inventory).<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 154, $stk_bp_cd, value);
	}

	/**
	 * ＩＦ在庫取引先ＣＤ（在庫）. IF inventory BP cd. (Inventory).<p>
	 *
	 */
	public String if_stk_bp_cd() {
		return getConstString(offset + 155, $if_stk_bp_cd);
	}

	/**
	 * ＩＦ在庫取引先ＣＤ（在庫）. IF inventory BP cd. (Inventory).<p>
	 *
	 */
	public void if_stk_bp_cd(String value) {
		setConstString(offset + 155, $if_stk_bp_cd, value);
	}

	/**
	 * 在庫取引先名（在庫）. Inventory BP name (Inventory).<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 156, $stk_bp_nm);
	}

	/**
	 * 在庫取引先名（在庫）. Inventory BP name (Inventory).<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 156, $stk_bp_nm, value);
	}

	/**
	 * 荷姿単位数量（在庫）. SKU qty. (Inventory).<p>
	 *
	 */
	public MCNumber stk_pack_unit_qty() {
		return getConstNumber(offset + 157, $stk_pack_unit_qty);
	}

	/**
	 * 荷姿単位数量（在庫）. SKU qty. (Inventory).<p>
	 *
	 */
	public void stk_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 157, $stk_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量（在庫）. SKU qty. (Inventory).<p>
	 *
	 */
	public void stk_pack_unit_qty(int value) {
		setConstNumber(offset + 157, $stk_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量（在庫）. SKU qty. (Inventory).<p>
	 *
	 */
	public void stk_pack_unit_qty(long value) {
		setConstNumber(offset + 157, $stk_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量（在庫）. SKU qty. (Inventory).<p>
	 *
	 */
	public void stk_pack_unit_qty(float value) {
		setConstNumber(offset + 157, $stk_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量（在庫）. SKU qty. (Inventory).<p>
	 *
	 */
	public void stk_pack_unit_qty(double value) {
		setConstNumber(offset + 157, $stk_pack_unit_qty, value);
	}
	
	/**
	 * 基準単位数量（在庫）. Base unit qty. (Inventory).<p>
	 *
	 */
	public MCNumber stk_base_unit_qty() {
		return getConstNumber(offset + 158, $stk_base_unit_qty);
	}

	/**
	 * 基準単位数量（在庫）. Base unit qty. (Inventory).<p>
	 *
	 */
	public void stk_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 158, $stk_base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量（在庫）. Base unit qty. (Inventory).<p>
	 *
	 */
	public void stk_base_unit_qty(int value) {
		setConstNumber(offset + 158, $stk_base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量（在庫）. Base unit qty. (Inventory).<p>
	 *
	 */
	public void stk_base_unit_qty(long value) {
		setConstNumber(offset + 158, $stk_base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量（在庫）. Base unit qty. (Inventory).<p>
	 *
	 */
	public void stk_base_unit_qty(float value) {
		setConstNumber(offset + 158, $stk_base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量（在庫）. Base unit qty. (Inventory).<p>
	 *
	 */
	public void stk_base_unit_qty(double value) {
		setConstNumber(offset + 158, $stk_base_unit_qty, value);
	}
	
	/**
	 * 抜取予定数量. Sampling scheduled qty..<p>
	 *
	 */
	public MCNumber smpl_schd_qty() {
		return getConstNumber(offset + 159, $smpl_schd_qty);
	}

	/**
	 * 抜取予定数量. Sampling scheduled qty..<p>
	 *
	 */
	public void smpl_schd_qty(MCNumber value) {
		setConstNumber(offset + 159, $smpl_schd_qty, value);
	}
	
	/**
	 * 抜取予定数量. Sampling scheduled qty..<p>
	 *
	 */
	public void smpl_schd_qty(int value) {
		setConstNumber(offset + 159, $smpl_schd_qty, value);
	}
	
	/**
	 * 抜取予定数量. Sampling scheduled qty..<p>
	 *
	 */
	public void smpl_schd_qty(long value) {
		setConstNumber(offset + 159, $smpl_schd_qty, value);
	}
	
	/**
	 * 抜取予定数量. Sampling scheduled qty..<p>
	 *
	 */
	public void smpl_schd_qty(float value) {
		setConstNumber(offset + 159, $smpl_schd_qty, value);
	}
	
	/**
	 * 抜取予定数量. Sampling scheduled qty..<p>
	 *
	 */
	public void smpl_schd_qty(double value) {
		setConstNumber(offset + 159, $smpl_schd_qty, value);
	}
	
	/**
	 * 抜取指図数量. Sampling order qty..<p>
	 *
	 */
	public MCNumber smpl_inst_qty() {
		return getConstNumber(offset + 160, $smpl_inst_qty);
	}

	/**
	 * 抜取指図数量. Sampling order qty..<p>
	 *
	 */
	public void smpl_inst_qty(MCNumber value) {
		setConstNumber(offset + 160, $smpl_inst_qty, value);
	}
	
	/**
	 * 抜取指図数量. Sampling order qty..<p>
	 *
	 */
	public void smpl_inst_qty(int value) {
		setConstNumber(offset + 160, $smpl_inst_qty, value);
	}
	
	/**
	 * 抜取指図数量. Sampling order qty..<p>
	 *
	 */
	public void smpl_inst_qty(long value) {
		setConstNumber(offset + 160, $smpl_inst_qty, value);
	}
	
	/**
	 * 抜取指図数量. Sampling order qty..<p>
	 *
	 */
	public void smpl_inst_qty(float value) {
		setConstNumber(offset + 160, $smpl_inst_qty, value);
	}
	
	/**
	 * 抜取指図数量. Sampling order qty..<p>
	 *
	 */
	public void smpl_inst_qty(double value) {
		setConstNumber(offset + 160, $smpl_inst_qty, value);
	}
	
	/**
	 * 参照検査ＮＯ. Reference inspection No..<p>
	 *
	 */
	public String own_insp_no() {
		return getConstString(offset + 161, $own_insp_no);
	}

	/**
	 * 参照検査ＮＯ. Reference inspection No..<p>
	 *
	 */
	public void own_insp_no(String value) {
		setConstString(offset + 161, $own_insp_no, value);
	}

	/**
	 * 参照検査予定ＮＯ. Reference inspection schedule No..<p>
	 *
	 */
	public String own_insp_schd_no() {
		return getConstString(offset + 162, $own_insp_schd_no);
	}

	/**
	 * 参照検査予定ＮＯ. Reference inspection schedule No..<p>
	 *
	 */
	public void own_insp_schd_no(String value) {
		setConstString(offset + 162, $own_insp_schd_no, value);
	}

	/**
	 * 初回検査予定ＮＯ. Initial inspection schedule No..<p>
	 *
	 */
	public String org_insp_schd_no() {
		return getConstString(offset + 163, $org_insp_schd_no);
	}

	/**
	 * 初回検査予定ＮＯ. Initial inspection schedule No..<p>
	 *
	 */
	public void org_insp_schd_no(String value) {
		setConstString(offset + 163, $org_insp_schd_no, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 164, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 164, $ac_dt, value);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 165, $itm_ord_no);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 165, $itm_ord_no, value);
	}

	/**
	 * 検査中使用許可ＦＬＧ. Allow inspecting use flg..<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 166, $in_prmt_insp_flg);
	}

	/**
	 * 検査中使用許可ＦＬＧ. Allow inspecting use flg..<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 166, $in_prmt_insp_flg, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 167, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 167, $trd_cd, value);
	}

	/**
	 * ＩＦ取引ＣＤ. IF transaction cd..<p>
	 *
	 */
	public String if_trd_cd() {
		return getConstString(offset + 168, $if_trd_cd);
	}

	/**
	 * ＩＦ取引ＣＤ. IF transaction cd..<p>
	 *
	 */
	public void if_trd_cd(String value) {
		setConstString(offset + 168, $if_trd_cd, value);
	}

	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 169, $trd_nm);
	}

	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 169, $trd_nm, value);
	}

	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 170, $insp_lt);
	}

	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 170, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 170, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 170, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 170, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 170, $insp_lt, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 171, $insp_offst);
	}

	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 171, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 171, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 171, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 171, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 171, $insp_offst, value);
	}
	
	/**
	 * 検査連絡備考. Inspection contact remarks.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 172, $insp_cnt_rmrks);
	}

	/**
	 * 検査連絡備考. Inspection contact remarks.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 172, $insp_cnt_rmrks, value);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public String if_co_cd() {
		return getConstString(offset + 173, $if_co_cd);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public void if_co_cd(String value) {
		setConstString(offset + 173, $if_co_cd, value);
	}

	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 174, $co_nm);
	}

	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 174, $co_nm, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 175, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 175, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 176, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 176, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 177, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 177, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 178, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 178, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 179, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 179, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 180, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 180, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 181, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 181, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 182, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 182, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 183, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 183, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 184, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 184, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 185, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 185, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 186, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 186, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 187, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 187, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 188, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 188, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 189, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 189, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 190, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 190, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 191, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 191, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 192, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 192, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 193, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 193, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 194, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 194, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 195, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 195, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 196, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 196, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 197, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 197, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 198, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 198, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 199, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 199, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 200, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 200, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 201, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 201, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 202, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 202, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 203, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 203, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 204, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 204, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 205, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 205, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 205, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 205, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 205, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 205, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 206, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 206, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 206, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 206, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 206, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 206, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 207, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 207, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 207, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 207, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 207, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 207, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 208, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 208, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 208, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 208, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 208, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 208, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 209, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 209, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 209, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 209, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 209, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 209, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 210, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 210, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 211, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 211, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 212, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 212, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 213, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 213, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 214, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 214, $sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 215, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 215, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 216, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 216, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 216, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 216, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 216, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 216, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 217, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 217, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 217, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 217, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 217, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 217, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 218, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 218, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 219, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 219, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 220, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 220, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 221, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 221, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 222, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 222, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 222, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 222, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 222, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 222, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 223, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 223, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 224, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 224, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 225, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 225, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 226, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 226, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 227, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 227, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 228, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 228, $sdrv_sts_typ, value);
	}

	public String getString(String name) {
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($if_maker_cd.equalsIgnoreCase(name)) {
			return if_maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($if_mfg_loc_cd.equalsIgnoreCase(name)) {
			return if_mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($if_to_site_cd.equalsIgnoreCase(name)) {
			return if_to_site_cd();
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			return to_site_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($if_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($if_base_unit_cd.equalsIgnoreCase(name)) {
			return if_base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			return insp_lst_no();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($if_inst_dpt_cd.equalsIgnoreCase(name)) {
			return if_inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($if_inst_usr_cd.equalsIgnoreCase(name)) {
			return if_inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($if_src_dpt_cd.equalsIgnoreCase(name)) {
			return if_src_dpt_cd();
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			return src_dpt_nm();
		}
		if ($src_usr_cd.equalsIgnoreCase(name)) {
			return src_usr_cd();
		}
		if ($if_src_usr_cd.equalsIgnoreCase(name)) {
			return if_src_usr_cd();
		}
		if ($src_usr_nm.equalsIgnoreCase(name)) {
			return src_usr_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			return insp_aprv_role_nm();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($if_aprv_dpt_cd.equalsIgnoreCase(name)) {
			return if_aprv_dpt_cd();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($if_aprv_usr_cd.equalsIgnoreCase(name)) {
			return if_aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			return src_no3();
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			return src_no4();
		}
		if ($schd_loc_cd.equalsIgnoreCase(name)) {
			return schd_loc_cd();
		}
		if ($if_schd_loc_cd.equalsIgnoreCase(name)) {
			return if_schd_loc_cd();
		}
		if ($schd_loc_nm.equalsIgnoreCase(name)) {
			return schd_loc_nm();
		}
		if ($schd_str_ln_cd.equalsIgnoreCase(name)) {
			return schd_str_ln_cd();
		}
		if ($if_schd_str_ln_cd.equalsIgnoreCase(name)) {
			return if_schd_str_ln_cd();
		}
		if ($schd_str_ln_nm.equalsIgnoreCase(name)) {
			return schd_str_ln_nm();
		}
		if ($schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return schd_stk_arrv_bp_cd();
		}
		if ($if_schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return if_schd_stk_arrv_bp_cd();
		}
		if ($schd_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return schd_stk_arrv_bp_nm();
		}
		if ($schd_sno1.equalsIgnoreCase(name)) {
			return schd_sno1();
		}
		if ($schd_sno2.equalsIgnoreCase(name)) {
			return schd_sno2();
		}
		if ($schd_sno3.equalsIgnoreCase(name)) {
			return schd_sno3();
		}
		if ($schd_sno4.equalsIgnoreCase(name)) {
			return schd_sno4();
		}
		if ($schd_gd_cd.equalsIgnoreCase(name)) {
			return schd_gd_cd();
		}
		if ($if_schd_gd_cd.equalsIgnoreCase(name)) {
			return if_schd_gd_cd();
		}
		if ($schd_gd_nm.equalsIgnoreCase(name)) {
			return schd_gd_nm();
		}
		if ($schd_quality_typ.equalsIgnoreCase(name)) {
			return schd_quality_typ();
		}
		if ($schd_stk_insp_typ.equalsIgnoreCase(name)) {
			return schd_stk_insp_typ();
		}
		if ($schd_stk_id_typ.equalsIgnoreCase(name)) {
			return schd_stk_id_typ();
		}
		if ($schd_stk_bp_cd.equalsIgnoreCase(name)) {
			return schd_stk_bp_cd();
		}
		if ($if_schd_stk_bp_cd.equalsIgnoreCase(name)) {
			return if_schd_stk_bp_cd();
		}
		if ($schd_stk_bp_nm.equalsIgnoreCase(name)) {
			return schd_stk_bp_nm();
		}
		if ($schd_pack_unit_cd.equalsIgnoreCase(name)) {
			return schd_pack_unit_cd();
		}
		if ($if_schd_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_schd_pack_unit_cd();
		}
		if ($schd_pack_unit_nm.equalsIgnoreCase(name)) {
			return schd_pack_unit_nm();
		}
		if ($schd_base_unit_cd.equalsIgnoreCase(name)) {
			return schd_base_unit_cd();
		}
		if ($if_schd_base_unit_cd.equalsIgnoreCase(name)) {
			return if_schd_base_unit_cd();
		}
		if ($schd_base_unit_nm.equalsIgnoreCase(name)) {
			return schd_base_unit_nm();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($if_stk_loc_cd.equalsIgnoreCase(name)) {
			return if_stk_loc_cd();
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			return stk_loc_nm();
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			return stk_str_ln_cd();
		}
		if ($if_stk_str_ln_cd.equalsIgnoreCase(name)) {
			return if_stk_str_ln_cd();
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			return stk_str_ln_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($if_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return if_stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($stk_sno1.equalsIgnoreCase(name)) {
			return stk_sno1();
		}
		if ($stk_sno2.equalsIgnoreCase(name)) {
			return stk_sno2();
		}
		if ($stk_sno3.equalsIgnoreCase(name)) {
			return stk_sno3();
		}
		if ($stk_sno4.equalsIgnoreCase(name)) {
			return stk_sno4();
		}
		if ($stk_fix_no_typ.equalsIgnoreCase(name)) {
			return stk_fix_no_typ();
		}
		if ($stk_fix_no.equalsIgnoreCase(name)) {
			return stk_fix_no();
		}
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			return stk_pack_unit_cd();
		}
		if ($if_stk_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_stk_pack_unit_cd();
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			return stk_pack_unit_nm();
		}
		if ($stk_gd_cd.equalsIgnoreCase(name)) {
			return stk_gd_cd();
		}
		if ($if_stk_gd_cd.equalsIgnoreCase(name)) {
			return if_stk_gd_cd();
		}
		if ($stk_gd_nm.equalsIgnoreCase(name)) {
			return stk_gd_nm();
		}
		if ($stk_quality_typ.equalsIgnoreCase(name)) {
			return stk_quality_typ();
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
		if ($if_stk_bp_cd.equalsIgnoreCase(name)) {
			return if_stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			return own_insp_no();
		}
		if ($own_insp_schd_no.equalsIgnoreCase(name)) {
			return own_insp_schd_no();
		}
		if ($org_insp_schd_no.equalsIgnoreCase(name)) {
			return org_insp_schd_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			return if_trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
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
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
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
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			return schd_pack_unit_qty();
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			return schd_base_unit_qty();
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			return stk_pack_unit_qty();
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			return stk_base_unit_qty();
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			return smpl_schd_qty();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			return insp_lst_prnt_tm();
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			return arr_tm();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($mfg_st_schd_tm.equalsIgnoreCase(name)) {
			return mfg_st_schd_tm();
		}
		if ($mfg_end_schd_tm.equalsIgnoreCase(name)) {
			return mfg_end_schd_tm();
		}
		if ($insp_st_tm.equalsIgnoreCase(name)) {
			return insp_st_tm();
		}
		if ($insp_end_tm.equalsIgnoreCase(name)) {
			return insp_end_tm();
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
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
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			return col_schd_flg();
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			return insp_lst_prnt_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($if_maker_cd.equalsIgnoreCase(name)) {
			return if_maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($if_mfg_loc_cd.equalsIgnoreCase(name)) {
			return if_mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($if_to_site_cd.equalsIgnoreCase(name)) {
			return if_to_site_cd();
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			return to_site_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($if_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($if_base_unit_cd.equalsIgnoreCase(name)) {
			return if_base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			return insp_lst_no();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($if_inst_dpt_cd.equalsIgnoreCase(name)) {
			return if_inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($if_inst_usr_cd.equalsIgnoreCase(name)) {
			return if_inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($if_src_dpt_cd.equalsIgnoreCase(name)) {
			return if_src_dpt_cd();
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			return src_dpt_nm();
		}
		if ($src_usr_cd.equalsIgnoreCase(name)) {
			return src_usr_cd();
		}
		if ($if_src_usr_cd.equalsIgnoreCase(name)) {
			return if_src_usr_cd();
		}
		if ($src_usr_nm.equalsIgnoreCase(name)) {
			return src_usr_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			return insp_aprv_role_nm();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($if_aprv_dpt_cd.equalsIgnoreCase(name)) {
			return if_aprv_dpt_cd();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($if_aprv_usr_cd.equalsIgnoreCase(name)) {
			return if_aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			return src_no3();
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			return src_no4();
		}
		if ($schd_loc_cd.equalsIgnoreCase(name)) {
			return schd_loc_cd();
		}
		if ($if_schd_loc_cd.equalsIgnoreCase(name)) {
			return if_schd_loc_cd();
		}
		if ($schd_loc_nm.equalsIgnoreCase(name)) {
			return schd_loc_nm();
		}
		if ($schd_str_ln_cd.equalsIgnoreCase(name)) {
			return schd_str_ln_cd();
		}
		if ($if_schd_str_ln_cd.equalsIgnoreCase(name)) {
			return if_schd_str_ln_cd();
		}
		if ($schd_str_ln_nm.equalsIgnoreCase(name)) {
			return schd_str_ln_nm();
		}
		if ($schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return schd_stk_arrv_bp_cd();
		}
		if ($if_schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return if_schd_stk_arrv_bp_cd();
		}
		if ($schd_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return schd_stk_arrv_bp_nm();
		}
		if ($schd_sno1.equalsIgnoreCase(name)) {
			return schd_sno1();
		}
		if ($schd_sno2.equalsIgnoreCase(name)) {
			return schd_sno2();
		}
		if ($schd_sno3.equalsIgnoreCase(name)) {
			return schd_sno3();
		}
		if ($schd_sno4.equalsIgnoreCase(name)) {
			return schd_sno4();
		}
		if ($schd_gd_cd.equalsIgnoreCase(name)) {
			return schd_gd_cd();
		}
		if ($if_schd_gd_cd.equalsIgnoreCase(name)) {
			return if_schd_gd_cd();
		}
		if ($schd_gd_nm.equalsIgnoreCase(name)) {
			return schd_gd_nm();
		}
		if ($schd_quality_typ.equalsIgnoreCase(name)) {
			return schd_quality_typ();
		}
		if ($schd_stk_insp_typ.equalsIgnoreCase(name)) {
			return schd_stk_insp_typ();
		}
		if ($schd_stk_id_typ.equalsIgnoreCase(name)) {
			return schd_stk_id_typ();
		}
		if ($schd_stk_bp_cd.equalsIgnoreCase(name)) {
			return schd_stk_bp_cd();
		}
		if ($if_schd_stk_bp_cd.equalsIgnoreCase(name)) {
			return if_schd_stk_bp_cd();
		}
		if ($schd_stk_bp_nm.equalsIgnoreCase(name)) {
			return schd_stk_bp_nm();
		}
		if ($schd_pack_unit_cd.equalsIgnoreCase(name)) {
			return schd_pack_unit_cd();
		}
		if ($if_schd_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_schd_pack_unit_cd();
		}
		if ($schd_pack_unit_nm.equalsIgnoreCase(name)) {
			return schd_pack_unit_nm();
		}
		if ($schd_base_unit_cd.equalsIgnoreCase(name)) {
			return schd_base_unit_cd();
		}
		if ($if_schd_base_unit_cd.equalsIgnoreCase(name)) {
			return if_schd_base_unit_cd();
		}
		if ($schd_base_unit_nm.equalsIgnoreCase(name)) {
			return schd_base_unit_nm();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($if_stk_loc_cd.equalsIgnoreCase(name)) {
			return if_stk_loc_cd();
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			return stk_loc_nm();
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			return stk_str_ln_cd();
		}
		if ($if_stk_str_ln_cd.equalsIgnoreCase(name)) {
			return if_stk_str_ln_cd();
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			return stk_str_ln_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($if_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return if_stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($stk_sno1.equalsIgnoreCase(name)) {
			return stk_sno1();
		}
		if ($stk_sno2.equalsIgnoreCase(name)) {
			return stk_sno2();
		}
		if ($stk_sno3.equalsIgnoreCase(name)) {
			return stk_sno3();
		}
		if ($stk_sno4.equalsIgnoreCase(name)) {
			return stk_sno4();
		}
		if ($stk_fix_no_typ.equalsIgnoreCase(name)) {
			return stk_fix_no_typ();
		}
		if ($stk_fix_no.equalsIgnoreCase(name)) {
			return stk_fix_no();
		}
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			return stk_pack_unit_cd();
		}
		if ($if_stk_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_stk_pack_unit_cd();
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			return stk_pack_unit_nm();
		}
		if ($stk_gd_cd.equalsIgnoreCase(name)) {
			return stk_gd_cd();
		}
		if ($if_stk_gd_cd.equalsIgnoreCase(name)) {
			return if_stk_gd_cd();
		}
		if ($stk_gd_nm.equalsIgnoreCase(name)) {
			return stk_gd_nm();
		}
		if ($stk_quality_typ.equalsIgnoreCase(name)) {
			return stk_quality_typ();
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
		if ($if_stk_bp_cd.equalsIgnoreCase(name)) {
			return if_stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			return own_insp_no();
		}
		if ($own_insp_schd_no.equalsIgnoreCase(name)) {
			return own_insp_schd_no();
		}
		if ($org_insp_schd_no.equalsIgnoreCase(name)) {
			return org_insp_schd_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			return if_trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
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
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
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
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			return schd_pack_unit_qty();
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			return schd_base_unit_qty();
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			return stk_pack_unit_qty();
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			return stk_base_unit_qty();
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			return smpl_schd_qty();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			return insp_lst_prnt_tm();
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			return arr_tm();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($mfg_st_schd_tm.equalsIgnoreCase(name)) {
			return mfg_st_schd_tm();
		}
		if ($mfg_end_schd_tm.equalsIgnoreCase(name)) {
			return mfg_end_schd_tm();
		}
		if ($insp_st_tm.equalsIgnoreCase(name)) {
			return insp_st_tm();
		}
		if ($insp_end_tm.equalsIgnoreCase(name)) {
			return insp_end_tm();
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
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
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			return col_schd_flg();
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			return insp_lst_prnt_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($if_maker_cd.equalsIgnoreCase(name)) {
			if_maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($if_mfg_loc_cd.equalsIgnoreCase(name)) {
			if_mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($if_to_site_cd.equalsIgnoreCase(name)) {
			if_to_site_cd(value);
			return;
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			to_site_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($if_pack_unit_cd.equalsIgnoreCase(name)) {
			if_pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($if_base_unit_cd.equalsIgnoreCase(name)) {
			if_base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			insp_lst_no(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($if_inst_dpt_cd.equalsIgnoreCase(name)) {
			if_inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($if_inst_usr_cd.equalsIgnoreCase(name)) {
			if_inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($if_src_dpt_cd.equalsIgnoreCase(name)) {
			if_src_dpt_cd(value);
			return;
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			src_dpt_nm(value);
			return;
		}
		if ($src_usr_cd.equalsIgnoreCase(name)) {
			src_usr_cd(value);
			return;
		}
		if ($if_src_usr_cd.equalsIgnoreCase(name)) {
			if_src_usr_cd(value);
			return;
		}
		if ($src_usr_nm.equalsIgnoreCase(name)) {
			src_usr_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			insp_aprv_role_nm(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($if_aprv_dpt_cd.equalsIgnoreCase(name)) {
			if_aprv_dpt_cd(value);
			return;
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			aprv_dpt_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($if_aprv_usr_cd.equalsIgnoreCase(name)) {
			if_aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			src_no3(value);
			return;
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			src_no4(value);
			return;
		}
		if ($schd_loc_cd.equalsIgnoreCase(name)) {
			schd_loc_cd(value);
			return;
		}
		if ($if_schd_loc_cd.equalsIgnoreCase(name)) {
			if_schd_loc_cd(value);
			return;
		}
		if ($schd_loc_nm.equalsIgnoreCase(name)) {
			schd_loc_nm(value);
			return;
		}
		if ($schd_str_ln_cd.equalsIgnoreCase(name)) {
			schd_str_ln_cd(value);
			return;
		}
		if ($if_schd_str_ln_cd.equalsIgnoreCase(name)) {
			if_schd_str_ln_cd(value);
			return;
		}
		if ($schd_str_ln_nm.equalsIgnoreCase(name)) {
			schd_str_ln_nm(value);
			return;
		}
		if ($schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			schd_stk_arrv_bp_cd(value);
			return;
		}
		if ($if_schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			if_schd_stk_arrv_bp_cd(value);
			return;
		}
		if ($schd_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			schd_stk_arrv_bp_nm(value);
			return;
		}
		if ($schd_sno1.equalsIgnoreCase(name)) {
			schd_sno1(value);
			return;
		}
		if ($schd_sno2.equalsIgnoreCase(name)) {
			schd_sno2(value);
			return;
		}
		if ($schd_sno3.equalsIgnoreCase(name)) {
			schd_sno3(value);
			return;
		}
		if ($schd_sno4.equalsIgnoreCase(name)) {
			schd_sno4(value);
			return;
		}
		if ($schd_gd_cd.equalsIgnoreCase(name)) {
			schd_gd_cd(value);
			return;
		}
		if ($if_schd_gd_cd.equalsIgnoreCase(name)) {
			if_schd_gd_cd(value);
			return;
		}
		if ($schd_gd_nm.equalsIgnoreCase(name)) {
			schd_gd_nm(value);
			return;
		}
		if ($schd_quality_typ.equalsIgnoreCase(name)) {
			schd_quality_typ(value);
			return;
		}
		if ($schd_stk_insp_typ.equalsIgnoreCase(name)) {
			schd_stk_insp_typ(value);
			return;
		}
		if ($schd_stk_id_typ.equalsIgnoreCase(name)) {
			schd_stk_id_typ(value);
			return;
		}
		if ($schd_stk_bp_cd.equalsIgnoreCase(name)) {
			schd_stk_bp_cd(value);
			return;
		}
		if ($if_schd_stk_bp_cd.equalsIgnoreCase(name)) {
			if_schd_stk_bp_cd(value);
			return;
		}
		if ($schd_stk_bp_nm.equalsIgnoreCase(name)) {
			schd_stk_bp_nm(value);
			return;
		}
		if ($schd_pack_unit_cd.equalsIgnoreCase(name)) {
			schd_pack_unit_cd(value);
			return;
		}
		if ($if_schd_pack_unit_cd.equalsIgnoreCase(name)) {
			if_schd_pack_unit_cd(value);
			return;
		}
		if ($schd_pack_unit_nm.equalsIgnoreCase(name)) {
			schd_pack_unit_nm(value);
			return;
		}
		if ($schd_base_unit_cd.equalsIgnoreCase(name)) {
			schd_base_unit_cd(value);
			return;
		}
		if ($if_schd_base_unit_cd.equalsIgnoreCase(name)) {
			if_schd_base_unit_cd(value);
			return;
		}
		if ($schd_base_unit_nm.equalsIgnoreCase(name)) {
			schd_base_unit_nm(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($if_stk_loc_cd.equalsIgnoreCase(name)) {
			if_stk_loc_cd(value);
			return;
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			stk_loc_nm(value);
			return;
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			stk_str_ln_cd(value);
			return;
		}
		if ($if_stk_str_ln_cd.equalsIgnoreCase(name)) {
			if_stk_str_ln_cd(value);
			return;
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			stk_str_ln_nm(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($if_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			if_stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($stk_sno1.equalsIgnoreCase(name)) {
			stk_sno1(value);
			return;
		}
		if ($stk_sno2.equalsIgnoreCase(name)) {
			stk_sno2(value);
			return;
		}
		if ($stk_sno3.equalsIgnoreCase(name)) {
			stk_sno3(value);
			return;
		}
		if ($stk_sno4.equalsIgnoreCase(name)) {
			stk_sno4(value);
			return;
		}
		if ($stk_fix_no_typ.equalsIgnoreCase(name)) {
			stk_fix_no_typ(value);
			return;
		}
		if ($stk_fix_no.equalsIgnoreCase(name)) {
			stk_fix_no(value);
			return;
		}
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			stk_pack_unit_cd(value);
			return;
		}
		if ($if_stk_pack_unit_cd.equalsIgnoreCase(name)) {
			if_stk_pack_unit_cd(value);
			return;
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			stk_pack_unit_nm(value);
			return;
		}
		if ($stk_gd_cd.equalsIgnoreCase(name)) {
			stk_gd_cd(value);
			return;
		}
		if ($if_stk_gd_cd.equalsIgnoreCase(name)) {
			if_stk_gd_cd(value);
			return;
		}
		if ($stk_gd_nm.equalsIgnoreCase(name)) {
			stk_gd_nm(value);
			return;
		}
		if ($stk_quality_typ.equalsIgnoreCase(name)) {
			stk_quality_typ(value);
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
		if ($if_stk_bp_cd.equalsIgnoreCase(name)) {
			if_stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			own_insp_no(value);
			return;
		}
		if ($own_insp_schd_no.equalsIgnoreCase(name)) {
			own_insp_schd_no(value);
			return;
		}
		if ($org_insp_schd_no.equalsIgnoreCase(name)) {
			org_insp_schd_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			if_trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
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
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			insp_lst_prnt_tm(value);
			return;
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			arr_tm(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($mfg_st_schd_tm.equalsIgnoreCase(name)) {
			mfg_st_schd_tm(value);
			return;
		}
		if ($mfg_end_schd_tm.equalsIgnoreCase(name)) {
			mfg_end_schd_tm(value);
			return;
		}
		if ($insp_st_tm.equalsIgnoreCase(name)) {
			insp_st_tm(value);
			return;
		}
		if ($insp_end_tm.equalsIgnoreCase(name)) {
			insp_end_tm(value);
			return;
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
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
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			col_schd_flg(value);
			return;
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			insp_lst_prnt_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($if_maker_cd.equalsIgnoreCase(name)) {
			if_maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($if_mfg_loc_cd.equalsIgnoreCase(name)) {
			if_mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($if_to_site_cd.equalsIgnoreCase(name)) {
			if_to_site_cd(value);
			return;
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			to_site_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($if_pack_unit_cd.equalsIgnoreCase(name)) {
			if_pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($if_base_unit_cd.equalsIgnoreCase(name)) {
			if_base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			insp_lst_no(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($if_inst_dpt_cd.equalsIgnoreCase(name)) {
			if_inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($if_inst_usr_cd.equalsIgnoreCase(name)) {
			if_inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($if_src_dpt_cd.equalsIgnoreCase(name)) {
			if_src_dpt_cd(value);
			return;
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			src_dpt_nm(value);
			return;
		}
		if ($src_usr_cd.equalsIgnoreCase(name)) {
			src_usr_cd(value);
			return;
		}
		if ($if_src_usr_cd.equalsIgnoreCase(name)) {
			if_src_usr_cd(value);
			return;
		}
		if ($src_usr_nm.equalsIgnoreCase(name)) {
			src_usr_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			insp_aprv_role_nm(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($if_aprv_dpt_cd.equalsIgnoreCase(name)) {
			if_aprv_dpt_cd(value);
			return;
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			aprv_dpt_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($if_aprv_usr_cd.equalsIgnoreCase(name)) {
			if_aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			src_no3(value);
			return;
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			src_no4(value);
			return;
		}
		if ($schd_loc_cd.equalsIgnoreCase(name)) {
			schd_loc_cd(value);
			return;
		}
		if ($if_schd_loc_cd.equalsIgnoreCase(name)) {
			if_schd_loc_cd(value);
			return;
		}
		if ($schd_loc_nm.equalsIgnoreCase(name)) {
			schd_loc_nm(value);
			return;
		}
		if ($schd_str_ln_cd.equalsIgnoreCase(name)) {
			schd_str_ln_cd(value);
			return;
		}
		if ($if_schd_str_ln_cd.equalsIgnoreCase(name)) {
			if_schd_str_ln_cd(value);
			return;
		}
		if ($schd_str_ln_nm.equalsIgnoreCase(name)) {
			schd_str_ln_nm(value);
			return;
		}
		if ($schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			schd_stk_arrv_bp_cd(value);
			return;
		}
		if ($if_schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			if_schd_stk_arrv_bp_cd(value);
			return;
		}
		if ($schd_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			schd_stk_arrv_bp_nm(value);
			return;
		}
		if ($schd_sno1.equalsIgnoreCase(name)) {
			schd_sno1(value);
			return;
		}
		if ($schd_sno2.equalsIgnoreCase(name)) {
			schd_sno2(value);
			return;
		}
		if ($schd_sno3.equalsIgnoreCase(name)) {
			schd_sno3(value);
			return;
		}
		if ($schd_sno4.equalsIgnoreCase(name)) {
			schd_sno4(value);
			return;
		}
		if ($schd_gd_cd.equalsIgnoreCase(name)) {
			schd_gd_cd(value);
			return;
		}
		if ($if_schd_gd_cd.equalsIgnoreCase(name)) {
			if_schd_gd_cd(value);
			return;
		}
		if ($schd_gd_nm.equalsIgnoreCase(name)) {
			schd_gd_nm(value);
			return;
		}
		if ($schd_quality_typ.equalsIgnoreCase(name)) {
			schd_quality_typ(value);
			return;
		}
		if ($schd_stk_insp_typ.equalsIgnoreCase(name)) {
			schd_stk_insp_typ(value);
			return;
		}
		if ($schd_stk_id_typ.equalsIgnoreCase(name)) {
			schd_stk_id_typ(value);
			return;
		}
		if ($schd_stk_bp_cd.equalsIgnoreCase(name)) {
			schd_stk_bp_cd(value);
			return;
		}
		if ($if_schd_stk_bp_cd.equalsIgnoreCase(name)) {
			if_schd_stk_bp_cd(value);
			return;
		}
		if ($schd_stk_bp_nm.equalsIgnoreCase(name)) {
			schd_stk_bp_nm(value);
			return;
		}
		if ($schd_pack_unit_cd.equalsIgnoreCase(name)) {
			schd_pack_unit_cd(value);
			return;
		}
		if ($if_schd_pack_unit_cd.equalsIgnoreCase(name)) {
			if_schd_pack_unit_cd(value);
			return;
		}
		if ($schd_pack_unit_nm.equalsIgnoreCase(name)) {
			schd_pack_unit_nm(value);
			return;
		}
		if ($schd_base_unit_cd.equalsIgnoreCase(name)) {
			schd_base_unit_cd(value);
			return;
		}
		if ($if_schd_base_unit_cd.equalsIgnoreCase(name)) {
			if_schd_base_unit_cd(value);
			return;
		}
		if ($schd_base_unit_nm.equalsIgnoreCase(name)) {
			schd_base_unit_nm(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($if_stk_loc_cd.equalsIgnoreCase(name)) {
			if_stk_loc_cd(value);
			return;
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			stk_loc_nm(value);
			return;
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			stk_str_ln_cd(value);
			return;
		}
		if ($if_stk_str_ln_cd.equalsIgnoreCase(name)) {
			if_stk_str_ln_cd(value);
			return;
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			stk_str_ln_nm(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($if_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			if_stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($stk_sno1.equalsIgnoreCase(name)) {
			stk_sno1(value);
			return;
		}
		if ($stk_sno2.equalsIgnoreCase(name)) {
			stk_sno2(value);
			return;
		}
		if ($stk_sno3.equalsIgnoreCase(name)) {
			stk_sno3(value);
			return;
		}
		if ($stk_sno4.equalsIgnoreCase(name)) {
			stk_sno4(value);
			return;
		}
		if ($stk_fix_no_typ.equalsIgnoreCase(name)) {
			stk_fix_no_typ(value);
			return;
		}
		if ($stk_fix_no.equalsIgnoreCase(name)) {
			stk_fix_no(value);
			return;
		}
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			stk_pack_unit_cd(value);
			return;
		}
		if ($if_stk_pack_unit_cd.equalsIgnoreCase(name)) {
			if_stk_pack_unit_cd(value);
			return;
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			stk_pack_unit_nm(value);
			return;
		}
		if ($stk_gd_cd.equalsIgnoreCase(name)) {
			stk_gd_cd(value);
			return;
		}
		if ($if_stk_gd_cd.equalsIgnoreCase(name)) {
			if_stk_gd_cd(value);
			return;
		}
		if ($stk_gd_nm.equalsIgnoreCase(name)) {
			stk_gd_nm(value);
			return;
		}
		if ($stk_quality_typ.equalsIgnoreCase(name)) {
			stk_quality_typ(value);
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
		if ($if_stk_bp_cd.equalsIgnoreCase(name)) {
			if_stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			own_insp_no(value);
			return;
		}
		if ($own_insp_schd_no.equalsIgnoreCase(name)) {
			own_insp_schd_no(value);
			return;
		}
		if ($org_insp_schd_no.equalsIgnoreCase(name)) {
			org_insp_schd_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			if_trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
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
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			insp_lst_prnt_tm(value);
			return;
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			arr_tm(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($mfg_st_schd_tm.equalsIgnoreCase(name)) {
			mfg_st_schd_tm(value);
			return;
		}
		if ($mfg_end_schd_tm.equalsIgnoreCase(name)) {
			mfg_end_schd_tm(value);
			return;
		}
		if ($insp_st_tm.equalsIgnoreCase(name)) {
			insp_st_tm(value);
			return;
		}
		if ($insp_end_tm.equalsIgnoreCase(name)) {
			insp_end_tm(value);
			return;
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
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
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			col_schd_flg(value);
			return;
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			insp_lst_prnt_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
