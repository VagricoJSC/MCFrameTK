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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "オーダ送信用品目マスタＩＦ // Item master for order export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>if_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦワーキンググループＣＤ</td>
 *  	<td>IF working group cd.</td>
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
 *  	<td>if_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
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
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名１</td>
 *  	<td>Item alias name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名２</td>
 *  	<td>Item alias name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名３</td>
 *  	<td>Item alias name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名４</td>
 *  	<td>Item alias name 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準品名</td>
 *  	<td>Standard Item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_itm_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準品目別名１</td>
 *  	<td>Standard item alias name 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_itm_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準品目別名２</td>
 *  	<td>Standard item alias name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_itm_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準品目別名３</td>
 *  	<td>Standard item alias name 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_itm_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準品目別名４</td>
 *  	<td>Standard item alias name 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ単位ＣＤ</td>
 *  	<td>IF unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単位ＣＤ</td>
 *  	<td>Unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>小数部有効桁数</td>
 *  	<td>Number of decimal places</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット管理区分</td>
 *  	<td>Lot management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロット管理区分</td>
 *  	<td>Sublot management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１管理区分</td>
 *  	<td>SEIBAN No. 1 management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２管理区分</td>
 *  	<td>SEIBAN No. 2 management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３管理区分</td>
 *  	<td>SEIBAN No. 3 management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４管理区分</td>
 *  	<td>SEIBAN No. 4 management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫管理区分</td>
 *  	<td>Inventory management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asset_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産管理区分</td>
 *  	<td>Asset management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目区分</td>
 *  	<td>Item type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ_d_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目区分詳細ＣＤ</td>
 *  	<td>Item type details cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ１</td>
 *  	<td>Item classification cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ２</td>
 *  	<td>Item classification cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ３</td>
 *  	<td>Item classification cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ４</td>
 *  	<td>Item classification cd. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ５</td>
 *  	<td>Item classification cd. 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd6</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ６</td>
 *  	<td>Item classification cd. 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd7</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ７</td>
 *  	<td>Item classification cd. 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd8</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ８</td>
 *  	<td>Item classification cd. 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd9</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ９</td>
 *  	<td>Item classification cd. 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd10</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ１０</td>
 *  	<td>Item classification cd. 10</td>
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
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログＮＯ</td>
 *  	<td>Log No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>log_sub_key1</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー１</td>
 *  	<td>Log sub key 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>log_sub_key2</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー２</td>
 *  	<td>Log sub key 2</td>
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
 *  	<td>sdrv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td>SDRV.SDRV_STS_TYP</td>
 *  	<td>送受信状況区分</td>
 *  	<td>Exporting and importing status type</td>
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
 *  	<td>unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位名</td>
 *  	<td>Unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１</td>
 *  	<td>Item classification name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名２</td>
 *  	<td>Item classification name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名３</td>
 *  	<td>Item classification name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名４</td>
 *  	<td>Item classification name 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名５</td>
 *  	<td>Item classification name 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm6</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名６</td>
 *  	<td>Item classification name 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm7</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名７</td>
 *  	<td>Item classification name 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm8</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名８</td>
 *  	<td>Item classification name 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm9</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名９</td>
 *  	<td>Item classification name 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm10</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１０</td>
 *  	<td>Item classification name 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名</td>
 *  	<td>Item type details name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_ORDSND_ITM_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_ORDSND_ITM_IF";

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
	 * ＩＦワーキンググループＣＤ. IF working group cd..<p>
	 *
	 */
	public static final String $if_wg_cd = "if_wg_cd";
	private static final MCPermColumnInfo _if_wg_cd = createColumnInfo("if_wg_cd");
	public final MCStringPermColumn if_wg_cd = createStringColumn(_if_wg_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
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
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	private static final MCPermColumnInfo _itm_alt_nm1 = createColumnInfo("itm_alt_nm1");
	public final MCStringPermColumn itm_alt_nm1 = createStringColumn(_itm_alt_nm1);
	
	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	private static final MCPermColumnInfo _itm_alt_nm2 = createColumnInfo("itm_alt_nm2");
	public final MCStringPermColumn itm_alt_nm2 = createStringColumn(_itm_alt_nm2);
	
	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	private static final MCPermColumnInfo _itm_alt_nm3 = createColumnInfo("itm_alt_nm3");
	public final MCStringPermColumn itm_alt_nm3 = createStringColumn(_itm_alt_nm3);
	
	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	private static final MCPermColumnInfo _itm_alt_nm4 = createColumnInfo("itm_alt_nm4");
	public final MCStringPermColumn itm_alt_nm4 = createStringColumn(_itm_alt_nm4);
	
	/**
	 * 標準品名. Standard Item name.<p>
	 *
	 */
	public static final String $base_itm_nm = "base_itm_nm";
	private static final MCPermColumnInfo _base_itm_nm = createColumnInfo("base_itm_nm");
	public final MCStringPermColumn base_itm_nm = createStringColumn(_base_itm_nm);
	
	/**
	 * 標準品目別名１. Standard item alias name 1.<p>
	 *
	 */
	public static final String $base_itm_alt_nm1 = "base_itm_alt_nm1";
	private static final MCPermColumnInfo _base_itm_alt_nm1 = createColumnInfo("base_itm_alt_nm1");
	public final MCStringPermColumn base_itm_alt_nm1 = createStringColumn(_base_itm_alt_nm1);
	
	/**
	 * 標準品目別名２. Standard item alias name 2.<p>
	 *
	 */
	public static final String $base_itm_alt_nm2 = "base_itm_alt_nm2";
	private static final MCPermColumnInfo _base_itm_alt_nm2 = createColumnInfo("base_itm_alt_nm2");
	public final MCStringPermColumn base_itm_alt_nm2 = createStringColumn(_base_itm_alt_nm2);
	
	/**
	 * 標準品目別名３. Standard item alias name 3.<p>
	 *
	 */
	public static final String $base_itm_alt_nm3 = "base_itm_alt_nm3";
	private static final MCPermColumnInfo _base_itm_alt_nm3 = createColumnInfo("base_itm_alt_nm3");
	public final MCStringPermColumn base_itm_alt_nm3 = createStringColumn(_base_itm_alt_nm3);
	
	/**
	 * 標準品目別名４. Standard item alias name 4.<p>
	 *
	 */
	public static final String $base_itm_alt_nm4 = "base_itm_alt_nm4";
	private static final MCPermColumnInfo _base_itm_alt_nm4 = createColumnInfo("base_itm_alt_nm4");
	public final MCStringPermColumn base_itm_alt_nm4 = createStringColumn(_base_itm_alt_nm4);
	
	/**
	 * ＩＦ単位ＣＤ. IF unit cd..<p>
	 *
	 */
	public static final String $if_unit_cd = "if_unit_cd";
	private static final MCPermColumnInfo _if_unit_cd = createColumnInfo("if_unit_cd");
	public final MCStringPermColumn if_unit_cd = createStringColumn(_if_unit_cd);
	
	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	private static final MCPermColumnInfo _unit_cd = createColumnInfo("unit_cd");
	public final MCStringPermColumn unit_cd = createStringColumn(_unit_cd);
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	private static final MCPermColumnInfo _dec_place = createColumnInfo("dec_place");
	public final MCNumberPermColumn dec_place = createNumberColumn(_dec_place);
	
	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	private static final MCPermColumnInfo _lot_mng_typ = createColumnInfo("lot_mng_typ");
	public final MCStringPermColumn lot_mng_typ = createStringColumn(_lot_mng_typ);
	
	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	private static final MCPermColumnInfo _sublot_mng_typ = createColumnInfo("sublot_mng_typ");
	public final MCStringPermColumn sublot_mng_typ = createStringColumn(_sublot_mng_typ);
	
	/**
	 * 手配ＮＯ１管理区分. SEIBAN No. 1 management type.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	private static final MCPermColumnInfo _sno1_mng_typ = createColumnInfo("sno1_mng_typ");
	public final MCStringPermColumn sno1_mng_typ = createStringColumn(_sno1_mng_typ);
	
	/**
	 * 手配ＮＯ２管理区分. SEIBAN No. 2 management type.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	private static final MCPermColumnInfo _sno2_mng_typ = createColumnInfo("sno2_mng_typ");
	public final MCStringPermColumn sno2_mng_typ = createStringColumn(_sno2_mng_typ);
	
	/**
	 * 手配ＮＯ３管理区分. SEIBAN No. 3 management type.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	private static final MCPermColumnInfo _sno3_mng_typ = createColumnInfo("sno3_mng_typ");
	public final MCStringPermColumn sno3_mng_typ = createStringColumn(_sno3_mng_typ);
	
	/**
	 * 手配ＮＯ４管理区分. SEIBAN No. 4 management type.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	private static final MCPermColumnInfo _sno4_mng_typ = createColumnInfo("sno4_mng_typ");
	public final MCStringPermColumn sno4_mng_typ = createStringColumn(_sno4_mng_typ);
	
	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	private static final MCPermColumnInfo _stk_mng_typ = createColumnInfo("stk_mng_typ");
	public final MCStringPermColumn stk_mng_typ = createStringColumn(_stk_mng_typ);
	
	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	private static final MCPermColumnInfo _asset_mng_typ = createColumnInfo("asset_mng_typ");
	public final MCStringPermColumn asset_mng_typ = createStringColumn(_asset_mng_typ);
	
	/**
	 * 品目区分. Item type.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	private static final MCPermColumnInfo _itm_typ = createColumnInfo("itm_typ");
	public final MCStringPermColumn itm_typ = createStringColumn(_itm_typ);
	
	/**
	 * 品目区分詳細ＣＤ. Item type details cd..<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	private static final MCPermColumnInfo _itm_typ_d_cd = createColumnInfo("itm_typ_d_cd");
	public final MCStringPermColumn itm_typ_d_cd = createStringColumn(_itm_typ_d_cd);
	
	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	private static final MCPermColumnInfo _itm_grp_cd1 = createColumnInfo("itm_grp_cd1");
	public final MCStringPermColumn itm_grp_cd1 = createStringColumn(_itm_grp_cd1);
	
	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	private static final MCPermColumnInfo _itm_grp_cd2 = createColumnInfo("itm_grp_cd2");
	public final MCStringPermColumn itm_grp_cd2 = createStringColumn(_itm_grp_cd2);
	
	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	private static final MCPermColumnInfo _itm_grp_cd3 = createColumnInfo("itm_grp_cd3");
	public final MCStringPermColumn itm_grp_cd3 = createStringColumn(_itm_grp_cd3);
	
	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	private static final MCPermColumnInfo _itm_grp_cd4 = createColumnInfo("itm_grp_cd4");
	public final MCStringPermColumn itm_grp_cd4 = createStringColumn(_itm_grp_cd4);
	
	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	private static final MCPermColumnInfo _itm_grp_cd5 = createColumnInfo("itm_grp_cd5");
	public final MCStringPermColumn itm_grp_cd5 = createStringColumn(_itm_grp_cd5);
	
	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	private static final MCPermColumnInfo _itm_grp_cd6 = createColumnInfo("itm_grp_cd6");
	public final MCStringPermColumn itm_grp_cd6 = createStringColumn(_itm_grp_cd6);
	
	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	private static final MCPermColumnInfo _itm_grp_cd7 = createColumnInfo("itm_grp_cd7");
	public final MCStringPermColumn itm_grp_cd7 = createStringColumn(_itm_grp_cd7);
	
	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	private static final MCPermColumnInfo _itm_grp_cd8 = createColumnInfo("itm_grp_cd8");
	public final MCStringPermColumn itm_grp_cd8 = createStringColumn(_itm_grp_cd8);
	
	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	private static final MCPermColumnInfo _itm_grp_cd9 = createColumnInfo("itm_grp_cd9");
	public final MCStringPermColumn itm_grp_cd9 = createStringColumn(_itm_grp_cd9);
	
	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	private static final MCPermColumnInfo _itm_grp_cd10 = createColumnInfo("itm_grp_cd10");
	public final MCStringPermColumn itm_grp_cd10 = createStringColumn(_itm_grp_cd10);
	
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
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	
	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	
	/**
	 * 品目分類名１. Item classification name 1.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	
	/**
	 * 品目分類名２. Item classification name 2.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	
	/**
	 * 品目分類名３. Item classification name 3.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	
	/**
	 * 品目分類名４. Item classification name 4.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	
	/**
	 * 品目分類名５. Item classification name 5.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	
	/**
	 * 品目分類名６. Item classification name 6.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	
	/**
	 * 品目分類名７. Item classification name 7.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	
	/**
	 * 品目分類名８. Item classification name 8.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	
	/**
	 * 品目分類名９. Item classification name 9.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	
	/**
	 * 品目分類名１０. Item classification name 10.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	
	/**
	 * 品目区分詳細名. Item type details name.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta if_wg_cd_META = createCommonMeta($if_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta if_itm_cd_META = createCommonMeta($if_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta if_itm_sub1_META = createCommonMeta($if_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta if_itm_sub2_META = createCommonMeta($if_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta if_itm_sub3_META = createCommonMeta($if_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta base_itm_nm_META = createCommonMeta($base_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta base_itm_alt_nm1_META = createCommonMeta($base_itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta base_itm_alt_nm2_META = createCommonMeta($base_itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta base_itm_alt_nm3_META = createCommonMeta($base_itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta base_itm_alt_nm4_META = createCommonMeta($base_itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta if_unit_cd_META = createCommonMeta($if_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
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
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);

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
					MST_ORDSND_ITM_IF_R own = MST_ORDSND_ITM_IF_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_ORDSND_ITM_IF_R> constMetas = new ConstMetaList<MST_ORDSND_ITM_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			if_wg_cd_META,
			wg_cd_META,
			if_itm_cd_META,
			if_itm_sub1_META,
			if_itm_sub2_META,
			if_itm_sub3_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			base_itm_nm_META,
			base_itm_alt_nm1_META,
			base_itm_alt_nm2_META,
			base_itm_alt_nm3_META,
			base_itm_alt_nm4_META,
			if_unit_cd_META,
			unit_cd_META,
			dec_place_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_grp_cd1_META,
			itm_grp_cd2_META,
			itm_grp_cd3_META,
			itm_grp_cd4_META,
			itm_grp_cd5_META,
			itm_grp_cd6_META,
			itm_grp_cd7_META,
			itm_grp_cd8_META,
			itm_grp_cd9_META,
			itm_grp_cd10_META,
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
			sdrv_sts_typ_META,
			wg_nm_META,
			unit_nm_META,
			itm_grp_nm1_META,
			itm_grp_nm2_META,
			itm_grp_nm3_META,
			itm_grp_nm4_META,
			itm_grp_nm5_META,
			itm_grp_nm6_META,
			itm_grp_nm7_META,
			itm_grp_nm8_META,
			itm_grp_nm9_META,
			itm_grp_nm10_META,
			itm_typ_d_nm_META
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
	protected MST_ORDSND_ITM_IF_R(ConstMetaList<? extends MST_ORDSND_ITM_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_ORDSND_ITM_IF_R(ConstMetaList<? extends MST_ORDSND_ITM_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$data_lno,
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
			MST_ORDSND_ITM_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$data_no,
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
			MST_ORDSND_ITM_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$exe_sts_typ,
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
			MST_ORDSND_ITM_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$data_crud_typ,
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
			MST_ORDSND_ITM_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$ext_sys_cd,
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
			MST_ORDSND_ITM_IF_R.$if_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$if_wg_cd,
				"if_wg_cd",
				if_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$wg_cd,
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
			MST_ORDSND_ITM_IF_R.$if_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$if_itm_cd,
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
			MST_ORDSND_ITM_IF_R.$if_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$if_itm_sub1,
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
			MST_ORDSND_ITM_IF_R.$if_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$if_itm_sub2,
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
			MST_ORDSND_ITM_IF_R.$if_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$if_itm_sub3,
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
			MST_ORDSND_ITM_IF_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_cd,
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
			MST_ORDSND_ITM_IF_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_sub1,
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
			MST_ORDSND_ITM_IF_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_sub2,
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
			MST_ORDSND_ITM_IF_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_sub3,
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
			MST_ORDSND_ITM_IF_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_nm,
				"itm_nm",
				itm_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_alt_nm1,
				"itm_alt_nm1",
				itm_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_alt_nm2,
				"itm_alt_nm2",
				itm_alt_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_alt_nm3,
				"itm_alt_nm3",
				itm_alt_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_alt_nm4,
				"itm_alt_nm4",
				itm_alt_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$base_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$base_itm_nm,
				"base_itm_nm",
				base_itm_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$base_itm_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$base_itm_alt_nm1,
				"base_itm_alt_nm1",
				base_itm_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$base_itm_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$base_itm_alt_nm2,
				"base_itm_alt_nm2",
				base_itm_alt_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$base_itm_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$base_itm_alt_nm3,
				"base_itm_alt_nm3",
				base_itm_alt_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$base_itm_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$base_itm_alt_nm4,
				"base_itm_alt_nm4",
				base_itm_alt_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$if_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$if_unit_cd,
				"if_unit_cd",
				if_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$unit_cd,
				"unit_cd",
				unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$dec_place,
				"dec_place",
				dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$lot_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$lot_mng_typ,
				"lot_mng_typ",
				lot_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$sublot_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sublot_mng_typ,
				"sublot_mng_typ",
				sublot_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$sno1_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sno1_mng_typ,
				"sno1_mng_typ",
				sno1_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$sno2_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sno2_mng_typ,
				"sno2_mng_typ",
				sno2_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$sno3_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sno3_mng_typ,
				"sno3_mng_typ",
				sno3_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$sno4_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sno4_mng_typ,
				"sno4_mng_typ",
				sno4_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$stk_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$stk_mng_typ,
				"stk_mng_typ",
				stk_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$asset_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$asset_mng_typ,
				"asset_mng_typ",
				asset_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_typ,
				"itm_typ",
				itm_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_typ_d_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_typ_d_cd,
				"itm_typ_d_cd",
				itm_typ_d_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_grp_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_cd1,
				"itm_grp_cd1",
				itm_grp_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_grp_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_cd2,
				"itm_grp_cd2",
				itm_grp_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_grp_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_cd3,
				"itm_grp_cd3",
				itm_grp_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_grp_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_cd4,
				"itm_grp_cd4",
				itm_grp_cd4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_grp_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_cd5,
				"itm_grp_cd5",
				itm_grp_cd5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_grp_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_cd6,
				"itm_grp_cd6",
				itm_grp_cd6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_grp_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_cd7,
				"itm_grp_cd7",
				itm_grp_cd7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_grp_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_cd8,
				"itm_grp_cd8",
				itm_grp_cd8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_grp_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_cd9,
				"itm_grp_cd9",
				itm_grp_cd9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$itm_grp_cd10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_cd10,
				"itm_grp_cd10",
				itm_grp_cd10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ORDSND_ITM_IF_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char1,
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
			MST_ORDSND_ITM_IF_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char2,
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
			MST_ORDSND_ITM_IF_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char3,
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
			MST_ORDSND_ITM_IF_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char4,
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
			MST_ORDSND_ITM_IF_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char5,
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
			MST_ORDSND_ITM_IF_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char6,
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
			MST_ORDSND_ITM_IF_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char7,
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
			MST_ORDSND_ITM_IF_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char8,
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
			MST_ORDSND_ITM_IF_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char9,
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
			MST_ORDSND_ITM_IF_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char10,
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
			MST_ORDSND_ITM_IF_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char11,
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
			MST_ORDSND_ITM_IF_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char12,
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
			MST_ORDSND_ITM_IF_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char13,
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
			MST_ORDSND_ITM_IF_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char14,
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
			MST_ORDSND_ITM_IF_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char15,
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
			MST_ORDSND_ITM_IF_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char16,
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
			MST_ORDSND_ITM_IF_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char17,
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
			MST_ORDSND_ITM_IF_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char18,
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
			MST_ORDSND_ITM_IF_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char19,
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
			MST_ORDSND_ITM_IF_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char20,
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
			MST_ORDSND_ITM_IF_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char21,
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
			MST_ORDSND_ITM_IF_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char22,
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
			MST_ORDSND_ITM_IF_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char23,
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
			MST_ORDSND_ITM_IF_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char24,
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
			MST_ORDSND_ITM_IF_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char25,
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
			MST_ORDSND_ITM_IF_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char26,
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
			MST_ORDSND_ITM_IF_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char27,
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
			MST_ORDSND_ITM_IF_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char28,
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
			MST_ORDSND_ITM_IF_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char29,
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
			MST_ORDSND_ITM_IF_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sub_char30,
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
			MST_ORDSND_ITM_IF_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$sub_num1,
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
			MST_ORDSND_ITM_IF_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$sub_num2,
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
			MST_ORDSND_ITM_IF_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$sub_num3,
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
			MST_ORDSND_ITM_IF_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$sub_num4,
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
			MST_ORDSND_ITM_IF_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$sub_num5,
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
			MST_ORDSND_ITM_IF_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ORDSND_ITM_IF_R.$sub_dt1,
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
			MST_ORDSND_ITM_IF_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ORDSND_ITM_IF_R.$sub_dt2,
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
			MST_ORDSND_ITM_IF_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ORDSND_ITM_IF_R.$sub_dt3,
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
			MST_ORDSND_ITM_IF_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ORDSND_ITM_IF_R.$sub_dt4,
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
			MST_ORDSND_ITM_IF_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ORDSND_ITM_IF_R.$sub_dt5,
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
			MST_ORDSND_ITM_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$batch_log_no,
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
			MST_ORDSND_ITM_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$log_sub_key1,
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
			MST_ORDSND_ITM_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$log_sub_key2,
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
			MST_ORDSND_ITM_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$ins_usr_id,
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
			MST_ORDSND_ITM_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$ins_usr_nm,
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
			MST_ORDSND_ITM_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ORDSND_ITM_IF_R.$ins_ts,
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
			MST_ORDSND_ITM_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$ins_func_id,
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
			MST_ORDSND_ITM_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ORDSND_ITM_IF_R.$upd_cntr,
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
			MST_ORDSND_ITM_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$upd_usr_id,
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
			MST_ORDSND_ITM_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$upd_usr_nm,
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
			MST_ORDSND_ITM_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ORDSND_ITM_IF_R.$upd_ts,
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
			MST_ORDSND_ITM_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$upd_func_id,
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
			MST_ORDSND_ITM_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$upd_srv_req_no,
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
			MST_ORDSND_ITM_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$sdrv_sts_typ,
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
			MST_ORDSND_ITM_IF_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$wg_nm,
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
			MST_ORDSND_ITM_IF_R.$unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$unit_nm,
				"unit_nm",
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
			MST_ORDSND_ITM_IF_R.$itm_grp_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_nm1,
				"itm_grp_nm1",
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
			MST_ORDSND_ITM_IF_R.$itm_grp_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_nm2,
				"itm_grp_nm2",
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
			MST_ORDSND_ITM_IF_R.$itm_grp_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_nm3,
				"itm_grp_nm3",
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
			MST_ORDSND_ITM_IF_R.$itm_grp_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_nm4,
				"itm_grp_nm4",
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
			MST_ORDSND_ITM_IF_R.$itm_grp_nm5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_nm5,
				"itm_grp_nm5",
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
			MST_ORDSND_ITM_IF_R.$itm_grp_nm6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_nm6,
				"itm_grp_nm6",
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
			MST_ORDSND_ITM_IF_R.$itm_grp_nm7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_nm7,
				"itm_grp_nm7",
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
			MST_ORDSND_ITM_IF_R.$itm_grp_nm8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_nm8,
				"itm_grp_nm8",
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
			MST_ORDSND_ITM_IF_R.$itm_grp_nm9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_nm9,
				"itm_grp_nm9",
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
			MST_ORDSND_ITM_IF_R.$itm_grp_nm10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_grp_nm10,
				"itm_grp_nm10",
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
			MST_ORDSND_ITM_IF_R.$itm_typ_d_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ORDSND_ITM_IF_R.$itm_typ_d_nm,
				"itm_typ_d_nm",
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
	public static MST_ORDSND_ITM_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_ORDSND_ITM_IF_R create(String alias) {
		MST_ORDSND_ITM_IF_R row = new MST_ORDSND_ITM_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_ORDSND_ITM_IF_R createByName(T proto) {
		MST_ORDSND_ITM_IF_R row = MST_ORDSND_ITM_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ORDSND_ITM_IF_R clone() {
		return (MST_ORDSND_ITM_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ORDSND_ITM_IF_R createInstance() {
		return (MST_ORDSND_ITM_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ORDSND_ITM_IF_R getValues(String... names) {
		return (MST_ORDSND_ITM_IF_R) super.getValues(names);
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
	 public MSW_ORDSND_ITM_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_ORDSND_ITM_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_ORDSND_ITM_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_ORDSND_ITM_IF_KEY_R.TABLE_NAME);
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
	 * ＩＦワーキンググループＣＤ. IF working group cd..<p>
	 *
	 */
	public String if_wg_cd() {
		return getConstString(offset + 5, $if_wg_cd);
	}

	/**
	 * ＩＦワーキンググループＣＤ. IF working group cd..<p>
	 *
	 */
	public void if_wg_cd(String value) {
		setConstString(offset + 5, $if_wg_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public String if_itm_cd() {
		return getConstString(offset + 7, $if_itm_cd);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public void if_itm_cd(String value) {
		setConstString(offset + 7, $if_itm_cd, value);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public String if_itm_sub1() {
		return getConstString(offset + 8, $if_itm_sub1);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public void if_itm_sub1(String value) {
		setConstString(offset + 8, $if_itm_sub1, value);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public String if_itm_sub2() {
		return getConstString(offset + 9, $if_itm_sub2);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public void if_itm_sub2(String value) {
		setConstString(offset + 9, $if_itm_sub2, value);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public String if_itm_sub3() {
		return getConstString(offset + 10, $if_itm_sub3);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public void if_itm_sub3(String value) {
		setConstString(offset + 10, $if_itm_sub3, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 11, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 11, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 12, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 12, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 13, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 13, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 14, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 14, $itm_sub3, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 15, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 15, $itm_nm, value);
	}

	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 16, $itm_alt_nm1);
	}

	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 16, $itm_alt_nm1, value);
	}

	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 17, $itm_alt_nm2);
	}

	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 17, $itm_alt_nm2, value);
	}

	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 18, $itm_alt_nm3);
	}

	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 18, $itm_alt_nm3, value);
	}

	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 19, $itm_alt_nm4);
	}

	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 19, $itm_alt_nm4, value);
	}

	/**
	 * 標準品名. Standard Item name.<p>
	 *
	 */
	public String base_itm_nm() {
		return getConstString(offset + 20, $base_itm_nm);
	}

	/**
	 * 標準品名. Standard Item name.<p>
	 *
	 */
	public void base_itm_nm(String value) {
		setConstString(offset + 20, $base_itm_nm, value);
	}

	/**
	 * 標準品目別名１. Standard item alias name 1.<p>
	 *
	 */
	public String base_itm_alt_nm1() {
		return getConstString(offset + 21, $base_itm_alt_nm1);
	}

	/**
	 * 標準品目別名１. Standard item alias name 1.<p>
	 *
	 */
	public void base_itm_alt_nm1(String value) {
		setConstString(offset + 21, $base_itm_alt_nm1, value);
	}

	/**
	 * 標準品目別名２. Standard item alias name 2.<p>
	 *
	 */
	public String base_itm_alt_nm2() {
		return getConstString(offset + 22, $base_itm_alt_nm2);
	}

	/**
	 * 標準品目別名２. Standard item alias name 2.<p>
	 *
	 */
	public void base_itm_alt_nm2(String value) {
		setConstString(offset + 22, $base_itm_alt_nm2, value);
	}

	/**
	 * 標準品目別名３. Standard item alias name 3.<p>
	 *
	 */
	public String base_itm_alt_nm3() {
		return getConstString(offset + 23, $base_itm_alt_nm3);
	}

	/**
	 * 標準品目別名３. Standard item alias name 3.<p>
	 *
	 */
	public void base_itm_alt_nm3(String value) {
		setConstString(offset + 23, $base_itm_alt_nm3, value);
	}

	/**
	 * 標準品目別名４. Standard item alias name 4.<p>
	 *
	 */
	public String base_itm_alt_nm4() {
		return getConstString(offset + 24, $base_itm_alt_nm4);
	}

	/**
	 * 標準品目別名４. Standard item alias name 4.<p>
	 *
	 */
	public void base_itm_alt_nm4(String value) {
		setConstString(offset + 24, $base_itm_alt_nm4, value);
	}

	/**
	 * ＩＦ単位ＣＤ. IF unit cd..<p>
	 *
	 */
	public String if_unit_cd() {
		return getConstString(offset + 25, $if_unit_cd);
	}

	/**
	 * ＩＦ単位ＣＤ. IF unit cd..<p>
	 *
	 */
	public void if_unit_cd(String value) {
		setConstString(offset + 25, $if_unit_cd, value);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 26, $unit_cd);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 26, $unit_cd, value);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 27, $dec_place);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 27, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 27, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 27, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 27, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 27, $dec_place, value);
	}
	
	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 28, $lot_mng_typ);
	}

	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 28, $lot_mng_typ, value);
	}

	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 29, $sublot_mng_typ);
	}

	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 29, $sublot_mng_typ, value);
	}

	/**
	 * 手配ＮＯ１管理区分. SEIBAN No. 1 management type.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 30, $sno1_mng_typ);
	}

	/**
	 * 手配ＮＯ１管理区分. SEIBAN No. 1 management type.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 30, $sno1_mng_typ, value);
	}

	/**
	 * 手配ＮＯ２管理区分. SEIBAN No. 2 management type.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 31, $sno2_mng_typ);
	}

	/**
	 * 手配ＮＯ２管理区分. SEIBAN No. 2 management type.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 31, $sno2_mng_typ, value);
	}

	/**
	 * 手配ＮＯ３管理区分. SEIBAN No. 3 management type.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 32, $sno3_mng_typ);
	}

	/**
	 * 手配ＮＯ３管理区分. SEIBAN No. 3 management type.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 32, $sno3_mng_typ, value);
	}

	/**
	 * 手配ＮＯ４管理区分. SEIBAN No. 4 management type.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 33, $sno4_mng_typ);
	}

	/**
	 * 手配ＮＯ４管理区分. SEIBAN No. 4 management type.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 33, $sno4_mng_typ, value);
	}

	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 34, $stk_mng_typ);
	}

	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 34, $stk_mng_typ, value);
	}

	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 35, $asset_mng_typ);
	}

	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 35, $asset_mng_typ, value);
	}

	/**
	 * 品目区分. Item type.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 36, $itm_typ);
	}

	/**
	 * 品目区分. Item type.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 36, $itm_typ, value);
	}

	/**
	 * 品目区分詳細ＣＤ. Item type details cd..<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 37, $itm_typ_d_cd);
	}

	/**
	 * 品目区分詳細ＣＤ. Item type details cd..<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 37, $itm_typ_d_cd, value);
	}

	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 38, $itm_grp_cd1);
	}

	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 38, $itm_grp_cd1, value);
	}

	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 39, $itm_grp_cd2);
	}

	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 39, $itm_grp_cd2, value);
	}

	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 40, $itm_grp_cd3);
	}

	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 40, $itm_grp_cd3, value);
	}

	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 41, $itm_grp_cd4);
	}

	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 41, $itm_grp_cd4, value);
	}

	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 42, $itm_grp_cd5);
	}

	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 42, $itm_grp_cd5, value);
	}

	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 43, $itm_grp_cd6);
	}

	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 43, $itm_grp_cd6, value);
	}

	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 44, $itm_grp_cd7);
	}

	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 44, $itm_grp_cd7, value);
	}

	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 45, $itm_grp_cd8);
	}

	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 45, $itm_grp_cd8, value);
	}

	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 46, $itm_grp_cd9);
	}

	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 46, $itm_grp_cd9, value);
	}

	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 47, $itm_grp_cd10);
	}

	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 47, $itm_grp_cd10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 48, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 48, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 49, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 49, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 50, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 50, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 51, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 51, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 52, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 52, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 53, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 53, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 54, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 54, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 55, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 55, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 56, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 56, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 57, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 57, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 58, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 58, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 59, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 59, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 60, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 60, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 61, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 61, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 62, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 62, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 63, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 63, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 64, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 64, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 65, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 65, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 66, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 66, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 67, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 67, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 68, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 68, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 69, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 69, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 70, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 70, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 71, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 71, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 72, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 72, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 73, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 73, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 74, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 74, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 75, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 75, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 76, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 76, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 77, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 77, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 78, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 78, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 78, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 78, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 78, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 78, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 79, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 79, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 79, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 79, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 79, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 79, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 80, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 80, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 80, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 80, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 80, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 80, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 81, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 81, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 81, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 81, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 81, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 81, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 82, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 82, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 82, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 82, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 82, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 82, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 83, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 83, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 84, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 84, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 85, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 85, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 86, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 86, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 87, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 87, $sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 88, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 88, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 89, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 89, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 89, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 89, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 89, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 89, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 90, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 90, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 90, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 90, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 90, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 90, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 91, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 91, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 92, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 92, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 93, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 93, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 94, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 94, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 95, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 95, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 95, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 95, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 95, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 95, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 96, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 96, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 97, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 97, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 98, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 98, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 99, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 99, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 100, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 100, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 101, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 101, $sdrv_sts_typ, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 102, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 102, $wg_nm, value);
	}

	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 103, $unit_nm);
	}

	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 103, $unit_nm, value);
	}

	/**
	 * 品目分類名１. Item classification name 1.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 104, $itm_grp_nm1);
	}

	/**
	 * 品目分類名１. Item classification name 1.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 104, $itm_grp_nm1, value);
	}

	/**
	 * 品目分類名２. Item classification name 2.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 105, $itm_grp_nm2);
	}

	/**
	 * 品目分類名２. Item classification name 2.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 105, $itm_grp_nm2, value);
	}

	/**
	 * 品目分類名３. Item classification name 3.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 106, $itm_grp_nm3);
	}

	/**
	 * 品目分類名３. Item classification name 3.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 106, $itm_grp_nm3, value);
	}

	/**
	 * 品目分類名４. Item classification name 4.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 107, $itm_grp_nm4);
	}

	/**
	 * 品目分類名４. Item classification name 4.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 107, $itm_grp_nm4, value);
	}

	/**
	 * 品目分類名５. Item classification name 5.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 108, $itm_grp_nm5);
	}

	/**
	 * 品目分類名５. Item classification name 5.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 108, $itm_grp_nm5, value);
	}

	/**
	 * 品目分類名６. Item classification name 6.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 109, $itm_grp_nm6);
	}

	/**
	 * 品目分類名６. Item classification name 6.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 109, $itm_grp_nm6, value);
	}

	/**
	 * 品目分類名７. Item classification name 7.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 110, $itm_grp_nm7);
	}

	/**
	 * 品目分類名７. Item classification name 7.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 110, $itm_grp_nm7, value);
	}

	/**
	 * 品目分類名８. Item classification name 8.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 111, $itm_grp_nm8);
	}

	/**
	 * 品目分類名８. Item classification name 8.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 111, $itm_grp_nm8, value);
	}

	/**
	 * 品目分類名９. Item classification name 9.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 112, $itm_grp_nm9);
	}

	/**
	 * 品目分類名９. Item classification name 9.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 112, $itm_grp_nm9, value);
	}

	/**
	 * 品目分類名１０. Item classification name 10.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 113, $itm_grp_nm10);
	}

	/**
	 * 品目分類名１０. Item classification name 10.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 113, $itm_grp_nm10, value);
	}

	/**
	 * 品目区分詳細名. Item type details name.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 114, $itm_typ_d_nm);
	}

	/**
	 * 品目区分詳細名. Item type details name.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 114, $itm_typ_d_nm, value);
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
		if ($if_wg_cd.equalsIgnoreCase(name)) {
			return if_wg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			return base_itm_nm();
		}
		if ($base_itm_alt_nm1.equalsIgnoreCase(name)) {
			return base_itm_alt_nm1();
		}
		if ($base_itm_alt_nm2.equalsIgnoreCase(name)) {
			return base_itm_alt_nm2();
		}
		if ($base_itm_alt_nm3.equalsIgnoreCase(name)) {
			return base_itm_alt_nm3();
		}
		if ($base_itm_alt_nm4.equalsIgnoreCase(name)) {
			return base_itm_alt_nm4();
		}
		if ($if_unit_cd.equalsIgnoreCase(name)) {
			return if_unit_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
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
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
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
		if ($if_wg_cd.equalsIgnoreCase(name)) {
			return if_wg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			return base_itm_nm();
		}
		if ($base_itm_alt_nm1.equalsIgnoreCase(name)) {
			return base_itm_alt_nm1();
		}
		if ($base_itm_alt_nm2.equalsIgnoreCase(name)) {
			return base_itm_alt_nm2();
		}
		if ($base_itm_alt_nm3.equalsIgnoreCase(name)) {
			return base_itm_alt_nm3();
		}
		if ($base_itm_alt_nm4.equalsIgnoreCase(name)) {
			return base_itm_alt_nm4();
		}
		if ($if_unit_cd.equalsIgnoreCase(name)) {
			return if_unit_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
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
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
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
		if ($if_wg_cd.equalsIgnoreCase(name)) {
			if_wg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			base_itm_nm(value);
			return;
		}
		if ($base_itm_alt_nm1.equalsIgnoreCase(name)) {
			base_itm_alt_nm1(value);
			return;
		}
		if ($base_itm_alt_nm2.equalsIgnoreCase(name)) {
			base_itm_alt_nm2(value);
			return;
		}
		if ($base_itm_alt_nm3.equalsIgnoreCase(name)) {
			base_itm_alt_nm3(value);
			return;
		}
		if ($base_itm_alt_nm4.equalsIgnoreCase(name)) {
			base_itm_alt_nm4(value);
			return;
		}
		if ($if_unit_cd.equalsIgnoreCase(name)) {
			if_unit_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
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
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($if_wg_cd.equalsIgnoreCase(name)) {
			if_wg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			base_itm_nm(value);
			return;
		}
		if ($base_itm_alt_nm1.equalsIgnoreCase(name)) {
			base_itm_alt_nm1(value);
			return;
		}
		if ($base_itm_alt_nm2.equalsIgnoreCase(name)) {
			base_itm_alt_nm2(value);
			return;
		}
		if ($base_itm_alt_nm3.equalsIgnoreCase(name)) {
			base_itm_alt_nm3(value);
			return;
		}
		if ($base_itm_alt_nm4.equalsIgnoreCase(name)) {
			base_itm_alt_nm4(value);
			return;
		}
		if ($if_unit_cd.equalsIgnoreCase(name)) {
			if_unit_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
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
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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

}
