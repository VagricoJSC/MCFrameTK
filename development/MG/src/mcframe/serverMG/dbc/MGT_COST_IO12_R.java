package mcframe.serverMG.dbc;

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
 * "原価個別受払表１２ // Custom T account list 12"DBコンテナRowクラスです。<p>
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
 *  	<td>calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算ＮＯ</td>
 *  	<td>Calculation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>年月</td>
 *  	<td>Year month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>mng_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>管理部門ＣＤ</td>
 *  	<td>Management dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>asst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産区分</td>
 *  	<td>Asset type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty01</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量０１</td>
 *  	<td>Quantity 01</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt01</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額０１</td>
 *  	<td>Amount 01</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std01</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準０１</td>
 *  	<td>Standard 01</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty02</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量０２</td>
 *  	<td>Quantity 02</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt02</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額０２</td>
 *  	<td>Amount 02</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std02</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準０２</td>
 *  	<td>Standard 02</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty03</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量０３</td>
 *  	<td>Quantity 03</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt03</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額０３</td>
 *  	<td>Amount 03</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std03</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準０３</td>
 *  	<td>Standard 03</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty04</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量０４</td>
 *  	<td>Quantity 04</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt04</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額０４</td>
 *  	<td>Amount 04</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std04</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準０４</td>
 *  	<td>Standard 04</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty05</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量０５</td>
 *  	<td>Quantity 05</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt05</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額０５</td>
 *  	<td>Amount 05</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std05</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準０５</td>
 *  	<td>Standard 05</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty06</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量０６</td>
 *  	<td>Quantity 06</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt06</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額０６</td>
 *  	<td>Amount 06</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std06</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準０６</td>
 *  	<td>Standard 06</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty07</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量０７</td>
 *  	<td>Quantity 07</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt07</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額０７</td>
 *  	<td>Amount 07</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std07</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準０７</td>
 *  	<td>Standard 07</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty08</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量０８</td>
 *  	<td>Quantity 08</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt08</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額０８</td>
 *  	<td>Amount 08</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std08</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準０８</td>
 *  	<td>Standard 08</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty09</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量０９</td>
 *  	<td>Quantity 09</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt09</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額０９</td>
 *  	<td>Amount 09</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std09</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準０９</td>
 *  	<td>Standard 09</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty10</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量１０</td>
 *  	<td>Quantity 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt10</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額１０</td>
 *  	<td>Amount 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std10</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準１０</td>
 *  	<td>Standard 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty11</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量１１</td>
 *  	<td>Quantity 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt11</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額１１</td>
 *  	<td>Amount 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std11</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準１１</td>
 *  	<td>Standard 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty12</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量１２</td>
 *  	<td>Quantity 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt12</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額１２</td>
 *  	<td>Amount 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std12</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準１２</td>
 *  	<td>Standard 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty13</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量１３</td>
 *  	<td>Quantity 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt13</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額１３</td>
 *  	<td>Amount 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std13</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準１３</td>
 *  	<td>Standard 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty14</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量１４</td>
 *  	<td>Quantity 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt14</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額１４</td>
 *  	<td>Amount 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std14</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準１４</td>
 *  	<td>Standard 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty15</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量１５</td>
 *  	<td>Quantity 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt15</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額１５</td>
 *  	<td>Amount 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std15</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準１５</td>
 *  	<td>Standard 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty16</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量１６</td>
 *  	<td>Quantity 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt16</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額１６</td>
 *  	<td>Amount 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std16</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準１６</td>
 *  	<td>Standard 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty17</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量１７</td>
 *  	<td>Quantity 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt17</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額１７</td>
 *  	<td>Amount 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std17</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準１７</td>
 *  	<td>Standard 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty18</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量１８</td>
 *  	<td>Quantity 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt18</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額１８</td>
 *  	<td>Amount 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std18</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準１８</td>
 *  	<td>Standard 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty19</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量１９</td>
 *  	<td>Quantity 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt19</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額１９</td>
 *  	<td>Amount 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std19</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準１９</td>
 *  	<td>Standard 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty20</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量２０</td>
 *  	<td>Quantity 20</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt20</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額２０</td>
 *  	<td>Amount 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std20</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準２０</td>
 *  	<td>Standard 20</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty21</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量２１</td>
 *  	<td>Quantity 21</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt21</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額２１</td>
 *  	<td>Amount 21</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std21</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準２１</td>
 *  	<td>Standard 21</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty22</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量２２</td>
 *  	<td>Quantity 22</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt22</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額２２</td>
 *  	<td>Amount 22</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std22</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準２２</td>
 *  	<td>Standard 22</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty23</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量２３</td>
 *  	<td>Quantity 23</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt23</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額２３</td>
 *  	<td>Amount 23</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std23</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準２３</td>
 *  	<td>Standard 23</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty24</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量２４</td>
 *  	<td>Quantity 24</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt24</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額２４</td>
 *  	<td>Amount 24</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std24</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準２４</td>
 *  	<td>Standard 24</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty25</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量２５</td>
 *  	<td>Quantity 25</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt25</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額２５</td>
 *  	<td>Amount 25</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std25</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準２５</td>
 *  	<td>Standard 25</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty26</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量２６</td>
 *  	<td>Quantity 26</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt26</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額２６</td>
 *  	<td>Amount 26</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std26</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準２６</td>
 *  	<td>Standard 26</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty27</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量２７</td>
 *  	<td>Quantity 27</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt27</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額２７</td>
 *  	<td>Amount 27</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std27</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準２７</td>
 *  	<td>Standard 27</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty28</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量２８</td>
 *  	<td>Quantity 28</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt28</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額２８</td>
 *  	<td>Amount 28</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std28</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準２８</td>
 *  	<td>Standard 28</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty29</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量２９</td>
 *  	<td>Quantity 29</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt29</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額２９</td>
 *  	<td>Amount 29</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std29</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準２９</td>
 *  	<td>Standard 29</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty30</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量３０</td>
 *  	<td>Quantity 30</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt30</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額３０</td>
 *  	<td>Amount 30</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std30</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準３０</td>
 *  	<td>Standard 30</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量差</td>
 *  	<td>Quantity difference</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額差</td>
 *  	<td>Amount variance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_std</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準差</td>
 *  	<td>Standard variance</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ave_tgt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>総平均単価対象</td>
 *  	<td>For weighted average unit price</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ym_sub</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>年月サブ</td>
 *  	<td>Year month sub</td>
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
public class MGT_COST_IO12_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MGT_COST_IO12";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	private static final MCPermColumnInfo _calc_no = createColumnInfo("calc_no");
	public final MCStringPermColumn calc_no = createStringColumn(_calc_no);
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 年月. Year month.<p>
	 *
	 */
	public static final String $ym = "ym";
	private static final MCPermColumnInfo _ym = createColumnInfo("ym");
	public final MCDatePermColumn ym = createDateColumn(_ym);
	
	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	private static final MCPermColumnInfo _mng_dpt_cd = createColumnInfo("mng_dpt_cd");
	public final MCStringPermColumn mng_dpt_cd = createStringColumn(_mng_dpt_cd);
	
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
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	private static final MCPermColumnInfo _asst_typ = createColumnInfo("asst_typ");
	public final MCStringPermColumn asst_typ = createStringColumn(_asst_typ);
	
	/**
	 * 数量０１. Quantity 01.<p>
	 *
	 */
	public static final String $qty01 = "qty01";
	private static final MCPermColumnInfo _qty01 = createColumnInfo("qty01");
	public final MCNumberPermColumn qty01 = createNumberColumn(_qty01);
	
	/**
	 * 金額０１. Amount 01.<p>
	 *
	 */
	public static final String $amt01 = "amt01";
	private static final MCPermColumnInfo _amt01 = createColumnInfo("amt01");
	public final MCNumberPermColumn amt01 = createNumberColumn(_amt01);
	
	/**
	 * 標準０１. Standard 01.<p>
	 *
	 */
	public static final String $std01 = "std01";
	private static final MCPermColumnInfo _std01 = createColumnInfo("std01");
	public final MCNumberPermColumn std01 = createNumberColumn(_std01);
	
	/**
	 * 数量０２. Quantity 02.<p>
	 *
	 */
	public static final String $qty02 = "qty02";
	private static final MCPermColumnInfo _qty02 = createColumnInfo("qty02");
	public final MCNumberPermColumn qty02 = createNumberColumn(_qty02);
	
	/**
	 * 金額０２. Amount 02.<p>
	 *
	 */
	public static final String $amt02 = "amt02";
	private static final MCPermColumnInfo _amt02 = createColumnInfo("amt02");
	public final MCNumberPermColumn amt02 = createNumberColumn(_amt02);
	
	/**
	 * 標準０２. Standard 02.<p>
	 *
	 */
	public static final String $std02 = "std02";
	private static final MCPermColumnInfo _std02 = createColumnInfo("std02");
	public final MCNumberPermColumn std02 = createNumberColumn(_std02);
	
	/**
	 * 数量０３. Quantity 03.<p>
	 *
	 */
	public static final String $qty03 = "qty03";
	private static final MCPermColumnInfo _qty03 = createColumnInfo("qty03");
	public final MCNumberPermColumn qty03 = createNumberColumn(_qty03);
	
	/**
	 * 金額０３. Amount 03.<p>
	 *
	 */
	public static final String $amt03 = "amt03";
	private static final MCPermColumnInfo _amt03 = createColumnInfo("amt03");
	public final MCNumberPermColumn amt03 = createNumberColumn(_amt03);
	
	/**
	 * 標準０３. Standard 03.<p>
	 *
	 */
	public static final String $std03 = "std03";
	private static final MCPermColumnInfo _std03 = createColumnInfo("std03");
	public final MCNumberPermColumn std03 = createNumberColumn(_std03);
	
	/**
	 * 数量０４. Quantity 04.<p>
	 *
	 */
	public static final String $qty04 = "qty04";
	private static final MCPermColumnInfo _qty04 = createColumnInfo("qty04");
	public final MCNumberPermColumn qty04 = createNumberColumn(_qty04);
	
	/**
	 * 金額０４. Amount 04.<p>
	 *
	 */
	public static final String $amt04 = "amt04";
	private static final MCPermColumnInfo _amt04 = createColumnInfo("amt04");
	public final MCNumberPermColumn amt04 = createNumberColumn(_amt04);
	
	/**
	 * 標準０４. Standard 04.<p>
	 *
	 */
	public static final String $std04 = "std04";
	private static final MCPermColumnInfo _std04 = createColumnInfo("std04");
	public final MCNumberPermColumn std04 = createNumberColumn(_std04);
	
	/**
	 * 数量０５. Quantity 05.<p>
	 *
	 */
	public static final String $qty05 = "qty05";
	private static final MCPermColumnInfo _qty05 = createColumnInfo("qty05");
	public final MCNumberPermColumn qty05 = createNumberColumn(_qty05);
	
	/**
	 * 金額０５. Amount 05.<p>
	 *
	 */
	public static final String $amt05 = "amt05";
	private static final MCPermColumnInfo _amt05 = createColumnInfo("amt05");
	public final MCNumberPermColumn amt05 = createNumberColumn(_amt05);
	
	/**
	 * 標準０５. Standard 05.<p>
	 *
	 */
	public static final String $std05 = "std05";
	private static final MCPermColumnInfo _std05 = createColumnInfo("std05");
	public final MCNumberPermColumn std05 = createNumberColumn(_std05);
	
	/**
	 * 数量０６. Quantity 06.<p>
	 *
	 */
	public static final String $qty06 = "qty06";
	private static final MCPermColumnInfo _qty06 = createColumnInfo("qty06");
	public final MCNumberPermColumn qty06 = createNumberColumn(_qty06);
	
	/**
	 * 金額０６. Amount 06.<p>
	 *
	 */
	public static final String $amt06 = "amt06";
	private static final MCPermColumnInfo _amt06 = createColumnInfo("amt06");
	public final MCNumberPermColumn amt06 = createNumberColumn(_amt06);
	
	/**
	 * 標準０６. Standard 06.<p>
	 *
	 */
	public static final String $std06 = "std06";
	private static final MCPermColumnInfo _std06 = createColumnInfo("std06");
	public final MCNumberPermColumn std06 = createNumberColumn(_std06);
	
	/**
	 * 数量０７. Quantity 07.<p>
	 *
	 */
	public static final String $qty07 = "qty07";
	private static final MCPermColumnInfo _qty07 = createColumnInfo("qty07");
	public final MCNumberPermColumn qty07 = createNumberColumn(_qty07);
	
	/**
	 * 金額０７. Amount 07.<p>
	 *
	 */
	public static final String $amt07 = "amt07";
	private static final MCPermColumnInfo _amt07 = createColumnInfo("amt07");
	public final MCNumberPermColumn amt07 = createNumberColumn(_amt07);
	
	/**
	 * 標準０７. Standard 07.<p>
	 *
	 */
	public static final String $std07 = "std07";
	private static final MCPermColumnInfo _std07 = createColumnInfo("std07");
	public final MCNumberPermColumn std07 = createNumberColumn(_std07);
	
	/**
	 * 数量０８. Quantity 08.<p>
	 *
	 */
	public static final String $qty08 = "qty08";
	private static final MCPermColumnInfo _qty08 = createColumnInfo("qty08");
	public final MCNumberPermColumn qty08 = createNumberColumn(_qty08);
	
	/**
	 * 金額０８. Amount 08.<p>
	 *
	 */
	public static final String $amt08 = "amt08";
	private static final MCPermColumnInfo _amt08 = createColumnInfo("amt08");
	public final MCNumberPermColumn amt08 = createNumberColumn(_amt08);
	
	/**
	 * 標準０８. Standard 08.<p>
	 *
	 */
	public static final String $std08 = "std08";
	private static final MCPermColumnInfo _std08 = createColumnInfo("std08");
	public final MCNumberPermColumn std08 = createNumberColumn(_std08);
	
	/**
	 * 数量０９. Quantity 09.<p>
	 *
	 */
	public static final String $qty09 = "qty09";
	private static final MCPermColumnInfo _qty09 = createColumnInfo("qty09");
	public final MCNumberPermColumn qty09 = createNumberColumn(_qty09);
	
	/**
	 * 金額０９. Amount 09.<p>
	 *
	 */
	public static final String $amt09 = "amt09";
	private static final MCPermColumnInfo _amt09 = createColumnInfo("amt09");
	public final MCNumberPermColumn amt09 = createNumberColumn(_amt09);
	
	/**
	 * 標準０９. Standard 09.<p>
	 *
	 */
	public static final String $std09 = "std09";
	private static final MCPermColumnInfo _std09 = createColumnInfo("std09");
	public final MCNumberPermColumn std09 = createNumberColumn(_std09);
	
	/**
	 * 数量１０. Quantity 10.<p>
	 *
	 */
	public static final String $qty10 = "qty10";
	private static final MCPermColumnInfo _qty10 = createColumnInfo("qty10");
	public final MCNumberPermColumn qty10 = createNumberColumn(_qty10);
	
	/**
	 * 金額１０. Amount 10.<p>
	 *
	 */
	public static final String $amt10 = "amt10";
	private static final MCPermColumnInfo _amt10 = createColumnInfo("amt10");
	public final MCNumberPermColumn amt10 = createNumberColumn(_amt10);
	
	/**
	 * 標準１０. Standard 10.<p>
	 *
	 */
	public static final String $std10 = "std10";
	private static final MCPermColumnInfo _std10 = createColumnInfo("std10");
	public final MCNumberPermColumn std10 = createNumberColumn(_std10);
	
	/**
	 * 数量１１. Quantity 11.<p>
	 *
	 */
	public static final String $qty11 = "qty11";
	private static final MCPermColumnInfo _qty11 = createColumnInfo("qty11");
	public final MCNumberPermColumn qty11 = createNumberColumn(_qty11);
	
	/**
	 * 金額１１. Amount 11.<p>
	 *
	 */
	public static final String $amt11 = "amt11";
	private static final MCPermColumnInfo _amt11 = createColumnInfo("amt11");
	public final MCNumberPermColumn amt11 = createNumberColumn(_amt11);
	
	/**
	 * 標準１１. Standard 11.<p>
	 *
	 */
	public static final String $std11 = "std11";
	private static final MCPermColumnInfo _std11 = createColumnInfo("std11");
	public final MCNumberPermColumn std11 = createNumberColumn(_std11);
	
	/**
	 * 数量１２. Quantity 12.<p>
	 *
	 */
	public static final String $qty12 = "qty12";
	private static final MCPermColumnInfo _qty12 = createColumnInfo("qty12");
	public final MCNumberPermColumn qty12 = createNumberColumn(_qty12);
	
	/**
	 * 金額１２. Amount 12.<p>
	 *
	 */
	public static final String $amt12 = "amt12";
	private static final MCPermColumnInfo _amt12 = createColumnInfo("amt12");
	public final MCNumberPermColumn amt12 = createNumberColumn(_amt12);
	
	/**
	 * 標準１２. Standard 12.<p>
	 *
	 */
	public static final String $std12 = "std12";
	private static final MCPermColumnInfo _std12 = createColumnInfo("std12");
	public final MCNumberPermColumn std12 = createNumberColumn(_std12);
	
	/**
	 * 数量１３. Quantity 13.<p>
	 *
	 */
	public static final String $qty13 = "qty13";
	private static final MCPermColumnInfo _qty13 = createColumnInfo("qty13");
	public final MCNumberPermColumn qty13 = createNumberColumn(_qty13);
	
	/**
	 * 金額１３. Amount 13.<p>
	 *
	 */
	public static final String $amt13 = "amt13";
	private static final MCPermColumnInfo _amt13 = createColumnInfo("amt13");
	public final MCNumberPermColumn amt13 = createNumberColumn(_amt13);
	
	/**
	 * 標準１３. Standard 13.<p>
	 *
	 */
	public static final String $std13 = "std13";
	private static final MCPermColumnInfo _std13 = createColumnInfo("std13");
	public final MCNumberPermColumn std13 = createNumberColumn(_std13);
	
	/**
	 * 数量１４. Quantity 14.<p>
	 *
	 */
	public static final String $qty14 = "qty14";
	private static final MCPermColumnInfo _qty14 = createColumnInfo("qty14");
	public final MCNumberPermColumn qty14 = createNumberColumn(_qty14);
	
	/**
	 * 金額１４. Amount 14.<p>
	 *
	 */
	public static final String $amt14 = "amt14";
	private static final MCPermColumnInfo _amt14 = createColumnInfo("amt14");
	public final MCNumberPermColumn amt14 = createNumberColumn(_amt14);
	
	/**
	 * 標準１４. Standard 14.<p>
	 *
	 */
	public static final String $std14 = "std14";
	private static final MCPermColumnInfo _std14 = createColumnInfo("std14");
	public final MCNumberPermColumn std14 = createNumberColumn(_std14);
	
	/**
	 * 数量１５. Quantity 15.<p>
	 *
	 */
	public static final String $qty15 = "qty15";
	private static final MCPermColumnInfo _qty15 = createColumnInfo("qty15");
	public final MCNumberPermColumn qty15 = createNumberColumn(_qty15);
	
	/**
	 * 金額１５. Amount 15.<p>
	 *
	 */
	public static final String $amt15 = "amt15";
	private static final MCPermColumnInfo _amt15 = createColumnInfo("amt15");
	public final MCNumberPermColumn amt15 = createNumberColumn(_amt15);
	
	/**
	 * 標準１５. Standard 15.<p>
	 *
	 */
	public static final String $std15 = "std15";
	private static final MCPermColumnInfo _std15 = createColumnInfo("std15");
	public final MCNumberPermColumn std15 = createNumberColumn(_std15);
	
	/**
	 * 数量１６. Quantity 16.<p>
	 *
	 */
	public static final String $qty16 = "qty16";
	private static final MCPermColumnInfo _qty16 = createColumnInfo("qty16");
	public final MCNumberPermColumn qty16 = createNumberColumn(_qty16);
	
	/**
	 * 金額１６. Amount 16.<p>
	 *
	 */
	public static final String $amt16 = "amt16";
	private static final MCPermColumnInfo _amt16 = createColumnInfo("amt16");
	public final MCNumberPermColumn amt16 = createNumberColumn(_amt16);
	
	/**
	 * 標準１６. Standard 16.<p>
	 *
	 */
	public static final String $std16 = "std16";
	private static final MCPermColumnInfo _std16 = createColumnInfo("std16");
	public final MCNumberPermColumn std16 = createNumberColumn(_std16);
	
	/**
	 * 数量１７. Quantity 17.<p>
	 *
	 */
	public static final String $qty17 = "qty17";
	private static final MCPermColumnInfo _qty17 = createColumnInfo("qty17");
	public final MCNumberPermColumn qty17 = createNumberColumn(_qty17);
	
	/**
	 * 金額１７. Amount 17.<p>
	 *
	 */
	public static final String $amt17 = "amt17";
	private static final MCPermColumnInfo _amt17 = createColumnInfo("amt17");
	public final MCNumberPermColumn amt17 = createNumberColumn(_amt17);
	
	/**
	 * 標準１７. Standard 17.<p>
	 *
	 */
	public static final String $std17 = "std17";
	private static final MCPermColumnInfo _std17 = createColumnInfo("std17");
	public final MCNumberPermColumn std17 = createNumberColumn(_std17);
	
	/**
	 * 数量１８. Quantity 18.<p>
	 *
	 */
	public static final String $qty18 = "qty18";
	private static final MCPermColumnInfo _qty18 = createColumnInfo("qty18");
	public final MCNumberPermColumn qty18 = createNumberColumn(_qty18);
	
	/**
	 * 金額１８. Amount 18.<p>
	 *
	 */
	public static final String $amt18 = "amt18";
	private static final MCPermColumnInfo _amt18 = createColumnInfo("amt18");
	public final MCNumberPermColumn amt18 = createNumberColumn(_amt18);
	
	/**
	 * 標準１８. Standard 18.<p>
	 *
	 */
	public static final String $std18 = "std18";
	private static final MCPermColumnInfo _std18 = createColumnInfo("std18");
	public final MCNumberPermColumn std18 = createNumberColumn(_std18);
	
	/**
	 * 数量１９. Quantity 19.<p>
	 *
	 */
	public static final String $qty19 = "qty19";
	private static final MCPermColumnInfo _qty19 = createColumnInfo("qty19");
	public final MCNumberPermColumn qty19 = createNumberColumn(_qty19);
	
	/**
	 * 金額１９. Amount 19.<p>
	 *
	 */
	public static final String $amt19 = "amt19";
	private static final MCPermColumnInfo _amt19 = createColumnInfo("amt19");
	public final MCNumberPermColumn amt19 = createNumberColumn(_amt19);
	
	/**
	 * 標準１９. Standard 19.<p>
	 *
	 */
	public static final String $std19 = "std19";
	private static final MCPermColumnInfo _std19 = createColumnInfo("std19");
	public final MCNumberPermColumn std19 = createNumberColumn(_std19);
	
	/**
	 * 数量２０. Quantity 20.<p>
	 *
	 */
	public static final String $qty20 = "qty20";
	private static final MCPermColumnInfo _qty20 = createColumnInfo("qty20");
	public final MCNumberPermColumn qty20 = createNumberColumn(_qty20);
	
	/**
	 * 金額２０. Amount 20.<p>
	 *
	 */
	public static final String $amt20 = "amt20";
	private static final MCPermColumnInfo _amt20 = createColumnInfo("amt20");
	public final MCNumberPermColumn amt20 = createNumberColumn(_amt20);
	
	/**
	 * 標準２０. Standard 20.<p>
	 *
	 */
	public static final String $std20 = "std20";
	private static final MCPermColumnInfo _std20 = createColumnInfo("std20");
	public final MCNumberPermColumn std20 = createNumberColumn(_std20);
	
	/**
	 * 数量２１. Quantity 21.<p>
	 *
	 */
	public static final String $qty21 = "qty21";
	private static final MCPermColumnInfo _qty21 = createColumnInfo("qty21");
	public final MCNumberPermColumn qty21 = createNumberColumn(_qty21);
	
	/**
	 * 金額２１. Amount 21.<p>
	 *
	 */
	public static final String $amt21 = "amt21";
	private static final MCPermColumnInfo _amt21 = createColumnInfo("amt21");
	public final MCNumberPermColumn amt21 = createNumberColumn(_amt21);
	
	/**
	 * 標準２１. Standard 21.<p>
	 *
	 */
	public static final String $std21 = "std21";
	private static final MCPermColumnInfo _std21 = createColumnInfo("std21");
	public final MCNumberPermColumn std21 = createNumberColumn(_std21);
	
	/**
	 * 数量２２. Quantity 22.<p>
	 *
	 */
	public static final String $qty22 = "qty22";
	private static final MCPermColumnInfo _qty22 = createColumnInfo("qty22");
	public final MCNumberPermColumn qty22 = createNumberColumn(_qty22);
	
	/**
	 * 金額２２. Amount 22.<p>
	 *
	 */
	public static final String $amt22 = "amt22";
	private static final MCPermColumnInfo _amt22 = createColumnInfo("amt22");
	public final MCNumberPermColumn amt22 = createNumberColumn(_amt22);
	
	/**
	 * 標準２２. Standard 22.<p>
	 *
	 */
	public static final String $std22 = "std22";
	private static final MCPermColumnInfo _std22 = createColumnInfo("std22");
	public final MCNumberPermColumn std22 = createNumberColumn(_std22);
	
	/**
	 * 数量２３. Quantity 23.<p>
	 *
	 */
	public static final String $qty23 = "qty23";
	private static final MCPermColumnInfo _qty23 = createColumnInfo("qty23");
	public final MCNumberPermColumn qty23 = createNumberColumn(_qty23);
	
	/**
	 * 金額２３. Amount 23.<p>
	 *
	 */
	public static final String $amt23 = "amt23";
	private static final MCPermColumnInfo _amt23 = createColumnInfo("amt23");
	public final MCNumberPermColumn amt23 = createNumberColumn(_amt23);
	
	/**
	 * 標準２３. Standard 23.<p>
	 *
	 */
	public static final String $std23 = "std23";
	private static final MCPermColumnInfo _std23 = createColumnInfo("std23");
	public final MCNumberPermColumn std23 = createNumberColumn(_std23);
	
	/**
	 * 数量２４. Quantity 24.<p>
	 *
	 */
	public static final String $qty24 = "qty24";
	private static final MCPermColumnInfo _qty24 = createColumnInfo("qty24");
	public final MCNumberPermColumn qty24 = createNumberColumn(_qty24);
	
	/**
	 * 金額２４. Amount 24.<p>
	 *
	 */
	public static final String $amt24 = "amt24";
	private static final MCPermColumnInfo _amt24 = createColumnInfo("amt24");
	public final MCNumberPermColumn amt24 = createNumberColumn(_amt24);
	
	/**
	 * 標準２４. Standard 24.<p>
	 *
	 */
	public static final String $std24 = "std24";
	private static final MCPermColumnInfo _std24 = createColumnInfo("std24");
	public final MCNumberPermColumn std24 = createNumberColumn(_std24);
	
	/**
	 * 数量２５. Quantity 25.<p>
	 *
	 */
	public static final String $qty25 = "qty25";
	private static final MCPermColumnInfo _qty25 = createColumnInfo("qty25");
	public final MCNumberPermColumn qty25 = createNumberColumn(_qty25);
	
	/**
	 * 金額２５. Amount 25.<p>
	 *
	 */
	public static final String $amt25 = "amt25";
	private static final MCPermColumnInfo _amt25 = createColumnInfo("amt25");
	public final MCNumberPermColumn amt25 = createNumberColumn(_amt25);
	
	/**
	 * 標準２５. Standard 25.<p>
	 *
	 */
	public static final String $std25 = "std25";
	private static final MCPermColumnInfo _std25 = createColumnInfo("std25");
	public final MCNumberPermColumn std25 = createNumberColumn(_std25);
	
	/**
	 * 数量２６. Quantity 26.<p>
	 *
	 */
	public static final String $qty26 = "qty26";
	private static final MCPermColumnInfo _qty26 = createColumnInfo("qty26");
	public final MCNumberPermColumn qty26 = createNumberColumn(_qty26);
	
	/**
	 * 金額２６. Amount 26.<p>
	 *
	 */
	public static final String $amt26 = "amt26";
	private static final MCPermColumnInfo _amt26 = createColumnInfo("amt26");
	public final MCNumberPermColumn amt26 = createNumberColumn(_amt26);
	
	/**
	 * 標準２６. Standard 26.<p>
	 *
	 */
	public static final String $std26 = "std26";
	private static final MCPermColumnInfo _std26 = createColumnInfo("std26");
	public final MCNumberPermColumn std26 = createNumberColumn(_std26);
	
	/**
	 * 数量２７. Quantity 27.<p>
	 *
	 */
	public static final String $qty27 = "qty27";
	private static final MCPermColumnInfo _qty27 = createColumnInfo("qty27");
	public final MCNumberPermColumn qty27 = createNumberColumn(_qty27);
	
	/**
	 * 金額２７. Amount 27.<p>
	 *
	 */
	public static final String $amt27 = "amt27";
	private static final MCPermColumnInfo _amt27 = createColumnInfo("amt27");
	public final MCNumberPermColumn amt27 = createNumberColumn(_amt27);
	
	/**
	 * 標準２７. Standard 27.<p>
	 *
	 */
	public static final String $std27 = "std27";
	private static final MCPermColumnInfo _std27 = createColumnInfo("std27");
	public final MCNumberPermColumn std27 = createNumberColumn(_std27);
	
	/**
	 * 数量２８. Quantity 28.<p>
	 *
	 */
	public static final String $qty28 = "qty28";
	private static final MCPermColumnInfo _qty28 = createColumnInfo("qty28");
	public final MCNumberPermColumn qty28 = createNumberColumn(_qty28);
	
	/**
	 * 金額２８. Amount 28.<p>
	 *
	 */
	public static final String $amt28 = "amt28";
	private static final MCPermColumnInfo _amt28 = createColumnInfo("amt28");
	public final MCNumberPermColumn amt28 = createNumberColumn(_amt28);
	
	/**
	 * 標準２８. Standard 28.<p>
	 *
	 */
	public static final String $std28 = "std28";
	private static final MCPermColumnInfo _std28 = createColumnInfo("std28");
	public final MCNumberPermColumn std28 = createNumberColumn(_std28);
	
	/**
	 * 数量２９. Quantity 29.<p>
	 *
	 */
	public static final String $qty29 = "qty29";
	private static final MCPermColumnInfo _qty29 = createColumnInfo("qty29");
	public final MCNumberPermColumn qty29 = createNumberColumn(_qty29);
	
	/**
	 * 金額２９. Amount 29.<p>
	 *
	 */
	public static final String $amt29 = "amt29";
	private static final MCPermColumnInfo _amt29 = createColumnInfo("amt29");
	public final MCNumberPermColumn amt29 = createNumberColumn(_amt29);
	
	/**
	 * 標準２９. Standard 29.<p>
	 *
	 */
	public static final String $std29 = "std29";
	private static final MCPermColumnInfo _std29 = createColumnInfo("std29");
	public final MCNumberPermColumn std29 = createNumberColumn(_std29);
	
	/**
	 * 数量３０. Quantity 30.<p>
	 *
	 */
	public static final String $qty30 = "qty30";
	private static final MCPermColumnInfo _qty30 = createColumnInfo("qty30");
	public final MCNumberPermColumn qty30 = createNumberColumn(_qty30);
	
	/**
	 * 金額３０. Amount 30.<p>
	 *
	 */
	public static final String $amt30 = "amt30";
	private static final MCPermColumnInfo _amt30 = createColumnInfo("amt30");
	public final MCNumberPermColumn amt30 = createNumberColumn(_amt30);
	
	/**
	 * 標準３０. Standard 30.<p>
	 *
	 */
	public static final String $std30 = "std30";
	private static final MCPermColumnInfo _std30 = createColumnInfo("std30");
	public final MCNumberPermColumn std30 = createNumberColumn(_std30);
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public static final String $diff_qty = "diff_qty";
	private static final MCPermColumnInfo _diff_qty = createColumnInfo("diff_qty");
	public final MCNumberPermColumn diff_qty = createNumberColumn(_diff_qty);
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public static final String $diff_amt = "diff_amt";
	private static final MCPermColumnInfo _diff_amt = createColumnInfo("diff_amt");
	public final MCNumberPermColumn diff_amt = createNumberColumn(_diff_amt);
	
	/**
	 * 標準差. Standard variance.<p>
	 *
	 */
	public static final String $diff_std = "diff_std";
	private static final MCPermColumnInfo _diff_std = createColumnInfo("diff_std");
	public final MCNumberPermColumn diff_std = createNumberColumn(_diff_std);
	
	/**
	 * 総平均単価対象. For weighted average unit price.<p>
	 *
	 */
	public static final String $ave_tgt = "ave_tgt";
	private static final MCPermColumnInfo _ave_tgt = createColumnInfo("ave_tgt");
	public final MCNumberPermColumn ave_tgt = createNumberColumn(_ave_tgt);
	
	/**
	 * 年月サブ. Year month sub.<p>
	 *
	 */
	public static final String $ym_sub = "ym_sub";
	private static final MCPermColumnInfo _ym_sub = createColumnInfo("ym_sub");
	public final MCDatePermColumn ym_sub = createDateColumn(_ym_sub);
	
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
	
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta qty01_META = createCommonMeta($qty01, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt01_META = createCommonMeta($amt01, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std01_META = createCommonMeta($std01, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty02_META = createCommonMeta($qty02, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt02_META = createCommonMeta($amt02, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std02_META = createCommonMeta($std02, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty03_META = createCommonMeta($qty03, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt03_META = createCommonMeta($amt03, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std03_META = createCommonMeta($std03, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty04_META = createCommonMeta($qty04, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt04_META = createCommonMeta($amt04, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std04_META = createCommonMeta($std04, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty05_META = createCommonMeta($qty05, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt05_META = createCommonMeta($amt05, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std05_META = createCommonMeta($std05, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty06_META = createCommonMeta($qty06, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt06_META = createCommonMeta($amt06, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std06_META = createCommonMeta($std06, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty07_META = createCommonMeta($qty07, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt07_META = createCommonMeta($amt07, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std07_META = createCommonMeta($std07, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty08_META = createCommonMeta($qty08, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt08_META = createCommonMeta($amt08, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std08_META = createCommonMeta($std08, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty09_META = createCommonMeta($qty09, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt09_META = createCommonMeta($amt09, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std09_META = createCommonMeta($std09, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty10_META = createCommonMeta($qty10, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt10_META = createCommonMeta($amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std10_META = createCommonMeta($std10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty11_META = createCommonMeta($qty11, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt11_META = createCommonMeta($amt11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std11_META = createCommonMeta($std11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty12_META = createCommonMeta($qty12, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt12_META = createCommonMeta($amt12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std12_META = createCommonMeta($std12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty13_META = createCommonMeta($qty13, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt13_META = createCommonMeta($amt13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std13_META = createCommonMeta($std13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty14_META = createCommonMeta($qty14, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt14_META = createCommonMeta($amt14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std14_META = createCommonMeta($std14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty15_META = createCommonMeta($qty15, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt15_META = createCommonMeta($amt15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std15_META = createCommonMeta($std15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty16_META = createCommonMeta($qty16, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt16_META = createCommonMeta($amt16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std16_META = createCommonMeta($std16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty17_META = createCommonMeta($qty17, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt17_META = createCommonMeta($amt17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std17_META = createCommonMeta($std17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty18_META = createCommonMeta($qty18, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt18_META = createCommonMeta($amt18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std18_META = createCommonMeta($std18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty19_META = createCommonMeta($qty19, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt19_META = createCommonMeta($amt19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std19_META = createCommonMeta($std19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty20_META = createCommonMeta($qty20, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt20_META = createCommonMeta($amt20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std20_META = createCommonMeta($std20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty21_META = createCommonMeta($qty21, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt21_META = createCommonMeta($amt21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std21_META = createCommonMeta($std21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty22_META = createCommonMeta($qty22, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt22_META = createCommonMeta($amt22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std22_META = createCommonMeta($std22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty23_META = createCommonMeta($qty23, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt23_META = createCommonMeta($amt23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std23_META = createCommonMeta($std23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty24_META = createCommonMeta($qty24, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt24_META = createCommonMeta($amt24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std24_META = createCommonMeta($std24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty25_META = createCommonMeta($qty25, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt25_META = createCommonMeta($amt25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std25_META = createCommonMeta($std25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty26_META = createCommonMeta($qty26, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt26_META = createCommonMeta($amt26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std26_META = createCommonMeta($std26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty27_META = createCommonMeta($qty27, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt27_META = createCommonMeta($amt27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std27_META = createCommonMeta($std27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty28_META = createCommonMeta($qty28, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt28_META = createCommonMeta($amt28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std28_META = createCommonMeta($std28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty29_META = createCommonMeta($qty29, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt29_META = createCommonMeta($amt29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std29_META = createCommonMeta($std29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty30_META = createCommonMeta($qty30, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt30_META = createCommonMeta($amt30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std30_META = createCommonMeta($std30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_qty_META = createCommonMeta($diff_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta diff_amt_META = createCommonMeta($diff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_std_META = createCommonMeta($diff_std, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ave_tgt_META = createCommonMeta($ave_tgt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ym_sub_META = createCommonMeta($ym_sub, mcframe.commonMA.meta.MA_META.YM);
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
	public static final String $ARG1 = "ARG1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MGT_ARG",
				$ARG1,
				new String[][]{
						{"calc_no", "calc_no"},
						{"calc_grp_cd", "calc_grp_cd"}
				},
				() -> {
					return mcframe.serverMG.dbc.MGT_ARG_R.create("ARG1");
				},
				(alias) -> {
					MGT_COST_IO12_R own = MGT_COST_IO12_R.create(alias);
					mcframe.serverMG.dbc.MGT_ARG_R ref = mcframe.serverMG.dbc.MGT_ARG_R.create("ARG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.calc_no.eq(ref.calc_no));
					cond = cond.and(own.calc_grp_cd.eq(ref.calc_grp_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MGT_COST_IO12_R> constMetas = new ConstMetaList<MGT_COST_IO12_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_no_META,
			calc_grp_cd_META,
			wg_cd_META,
			ym_META,
			mng_dpt_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			bp_cd_META,
			asst_typ_META,
			qty01_META,
			amt01_META,
			std01_META,
			qty02_META,
			amt02_META,
			std02_META,
			qty03_META,
			amt03_META,
			std03_META,
			qty04_META,
			amt04_META,
			std04_META,
			qty05_META,
			amt05_META,
			std05_META,
			qty06_META,
			amt06_META,
			std06_META,
			qty07_META,
			amt07_META,
			std07_META,
			qty08_META,
			amt08_META,
			std08_META,
			qty09_META,
			amt09_META,
			std09_META,
			qty10_META,
			amt10_META,
			std10_META,
			qty11_META,
			amt11_META,
			std11_META,
			qty12_META,
			amt12_META,
			std12_META,
			qty13_META,
			amt13_META,
			std13_META,
			qty14_META,
			amt14_META,
			std14_META,
			qty15_META,
			amt15_META,
			std15_META,
			qty16_META,
			amt16_META,
			std16_META,
			qty17_META,
			amt17_META,
			std17_META,
			qty18_META,
			amt18_META,
			std18_META,
			qty19_META,
			amt19_META,
			std19_META,
			qty20_META,
			amt20_META,
			std20_META,
			qty21_META,
			amt21_META,
			std21_META,
			qty22_META,
			amt22_META,
			std22_META,
			qty23_META,
			amt23_META,
			std23_META,
			qty24_META,
			amt24_META,
			std24_META,
			qty25_META,
			amt25_META,
			std25_META,
			qty26_META,
			amt26_META,
			std26_META,
			qty27_META,
			amt27_META,
			std27_META,
			qty28_META,
			amt28_META,
			std28_META,
			qty29_META,
			amt29_META,
			std29_META,
			qty30_META,
			amt30_META,
			std30_META,
			diff_qty_META,
			diff_amt_META,
			diff_std_META,
			ave_tgt_META,
			ym_sub_META,
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
	protected MGT_COST_IO12_R(ConstMetaList<? extends MGT_COST_IO12_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGT_COST_IO12_R(ConstMetaList<? extends MGT_COST_IO12_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$calc_no,
				"calc_no",
				calc_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$calc_grp_cd,
				"calc_grp_cd",
				calc_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_COST_IO12_R.$ym,
				"ym",
				ym,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$mng_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$mng_dpt_cd,
				"mng_dpt_cd",
				mng_dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$lot_no,
				"lot_no",
				lot_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$sublot_no,
				"sublot_no",
				sublot_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$sno1,
				"sno1",
				sno1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$sno2,
				"sno2",
				sno2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$sno3,
				"sno3",
				sno3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$sno4,
				"sno4",
				sno4,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$bp_cd,
				"bp_cd",
				bp_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$asst_typ,
				"asst_typ",
				asst_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty01,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty01,
				"qty01",
				qty01,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt01,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt01,
				"amt01",
				amt01,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std01,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std01,
				"std01",
				std01,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty02,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty02,
				"qty02",
				qty02,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt02,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt02,
				"amt02",
				amt02,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std02,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std02,
				"std02",
				std02,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty03,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty03,
				"qty03",
				qty03,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt03,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt03,
				"amt03",
				amt03,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std03,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std03,
				"std03",
				std03,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty04,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty04,
				"qty04",
				qty04,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt04,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt04,
				"amt04",
				amt04,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std04,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std04,
				"std04",
				std04,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty05,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty05,
				"qty05",
				qty05,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt05,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt05,
				"amt05",
				amt05,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std05,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std05,
				"std05",
				std05,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty06,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty06,
				"qty06",
				qty06,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt06,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt06,
				"amt06",
				amt06,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std06,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std06,
				"std06",
				std06,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty07,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty07,
				"qty07",
				qty07,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt07,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt07,
				"amt07",
				amt07,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std07,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std07,
				"std07",
				std07,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty08,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty08,
				"qty08",
				qty08,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt08,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt08,
				"amt08",
				amt08,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std08,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std08,
				"std08",
				std08,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty09,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty09,
				"qty09",
				qty09,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt09,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt09,
				"amt09",
				amt09,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std09,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std09,
				"std09",
				std09,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty10,
				"qty10",
				qty10,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt10,
				"amt10",
				amt10,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std10,
				"std10",
				std10,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty11,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty11,
				"qty11",
				qty11,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt11,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt11,
				"amt11",
				amt11,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std11,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std11,
				"std11",
				std11,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty12,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty12,
				"qty12",
				qty12,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt12,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt12,
				"amt12",
				amt12,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std12,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std12,
				"std12",
				std12,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty13,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty13,
				"qty13",
				qty13,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt13,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt13,
				"amt13",
				amt13,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std13,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std13,
				"std13",
				std13,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty14,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty14,
				"qty14",
				qty14,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt14,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt14,
				"amt14",
				amt14,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std14,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std14,
				"std14",
				std14,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty15,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty15,
				"qty15",
				qty15,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt15,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt15,
				"amt15",
				amt15,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std15,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std15,
				"std15",
				std15,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty16,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty16,
				"qty16",
				qty16,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt16,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt16,
				"amt16",
				amt16,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std16,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std16,
				"std16",
				std16,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty17,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty17,
				"qty17",
				qty17,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt17,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt17,
				"amt17",
				amt17,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std17,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std17,
				"std17",
				std17,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty18,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty18,
				"qty18",
				qty18,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt18,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt18,
				"amt18",
				amt18,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std18,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std18,
				"std18",
				std18,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty19,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty19,
				"qty19",
				qty19,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt19,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt19,
				"amt19",
				amt19,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std19,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std19,
				"std19",
				std19,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty20,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty20,
				"qty20",
				qty20,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt20,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt20,
				"amt20",
				amt20,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std20,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std20,
				"std20",
				std20,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty21,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty21,
				"qty21",
				qty21,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt21,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt21,
				"amt21",
				amt21,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std21,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std21,
				"std21",
				std21,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty22,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty22,
				"qty22",
				qty22,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt22,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt22,
				"amt22",
				amt22,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std22,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std22,
				"std22",
				std22,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty23,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty23,
				"qty23",
				qty23,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt23,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt23,
				"amt23",
				amt23,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std23,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std23,
				"std23",
				std23,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty24,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty24,
				"qty24",
				qty24,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt24,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt24,
				"amt24",
				amt24,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std24,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std24,
				"std24",
				std24,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty25,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty25,
				"qty25",
				qty25,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt25,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt25,
				"amt25",
				amt25,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std25,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std25,
				"std25",
				std25,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty26,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty26,
				"qty26",
				qty26,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt26,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt26,
				"amt26",
				amt26,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std26,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std26,
				"std26",
				std26,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty27,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty27,
				"qty27",
				qty27,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt27,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt27,
				"amt27",
				amt27,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std27,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std27,
				"std27",
				std27,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty28,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty28,
				"qty28",
				qty28,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt28,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt28,
				"amt28",
				amt28,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std28,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std28,
				"std28",
				std28,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty29,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty29,
				"qty29",
				qty29,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt29,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt29,
				"amt29",
				amt29,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std29,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std29,
				"std29",
				std29,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$qty30,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$qty30,
				"qty30",
				qty30,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$amt30,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$amt30,
				"amt30",
				amt30,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$std30,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$std30,
				"std30",
				std30,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$diff_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$diff_qty,
				"diff_qty",
				diff_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$diff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$diff_amt,
				"diff_amt",
				diff_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$diff_std,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$diff_std,
				"diff_std",
				diff_std,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$ave_tgt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$ave_tgt,
				"ave_tgt",
				ave_tgt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$ym_sub,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_COST_IO12_R.$ym_sub,
				"ym_sub",
				ym_sub,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_COST_IO12_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$ins_usr_id,
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
			MGT_COST_IO12_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$ins_usr_nm,
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
			MGT_COST_IO12_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_COST_IO12_R.$ins_ts,
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
			MGT_COST_IO12_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$ins_func_id,
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
			MGT_COST_IO12_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_COST_IO12_R.$upd_cntr,
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
			MGT_COST_IO12_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$upd_usr_id,
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
			MGT_COST_IO12_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$upd_usr_nm,
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
			MGT_COST_IO12_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_COST_IO12_R.$upd_ts,
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
			MGT_COST_IO12_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$upd_func_id,
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
			MGT_COST_IO12_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_COST_IO12_R.$upd_srv_req_no,
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
	public static MGT_COST_IO12_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGT_COST_IO12_R create(String alias) {
		MGT_COST_IO12_R row = new MGT_COST_IO12_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGT_COST_IO12_R createByName(T proto) {
		MGT_COST_IO12_R row = MGT_COST_IO12_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_COST_IO12_R clone() {
		return (MGT_COST_IO12_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_COST_IO12_R createInstance() {
		return (MGT_COST_IO12_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_COST_IO12_R getValues(String... names) {
		return (MGT_COST_IO12_R) super.getValues(names);
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
	 public MGW_COST_IO12_KEY_R getPkWorkDbc(String alias) {
	 	return MGW_COST_IO12_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MGW_COST_IO12_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MGW_COST_IO12_KEY_R.TABLE_NAME);
	 }

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 0, $calc_no);
	}

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 0, $calc_no, value);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 3, $ym);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 3, $ym, value);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 4, $mng_dpt_cd);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 4, $mng_dpt_cd, value);
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
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 9, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 9, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 10, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 10, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 11, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 11, $sno1, value);
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
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 13, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 13, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 14, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 14, $sno4, value);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 15, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 15, $bp_cd, value);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 16, $asst_typ);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 16, $asst_typ, value);
	}

	/**
	 * 数量０１. Quantity 01.<p>
	 *
	 */
	public MCNumber qty01() {
		return getConstNumber(offset + 17, $qty01);
	}

	/**
	 * 数量０１. Quantity 01.<p>
	 *
	 */
	public void qty01(MCNumber value) {
		setConstNumber(offset + 17, $qty01, value);
	}
	
	/**
	 * 数量０１. Quantity 01.<p>
	 *
	 */
	public void qty01(int value) {
		setConstNumber(offset + 17, $qty01, value);
	}
	
	/**
	 * 数量０１. Quantity 01.<p>
	 *
	 */
	public void qty01(long value) {
		setConstNumber(offset + 17, $qty01, value);
	}
	
	/**
	 * 数量０１. Quantity 01.<p>
	 *
	 */
	public void qty01(float value) {
		setConstNumber(offset + 17, $qty01, value);
	}
	
	/**
	 * 数量０１. Quantity 01.<p>
	 *
	 */
	public void qty01(double value) {
		setConstNumber(offset + 17, $qty01, value);
	}
	
	/**
	 * 金額０１. Amount 01.<p>
	 *
	 */
	public MCNumber amt01() {
		return getConstNumber(offset + 18, $amt01);
	}

	/**
	 * 金額０１. Amount 01.<p>
	 *
	 */
	public void amt01(MCNumber value) {
		setConstNumber(offset + 18, $amt01, value);
	}
	
	/**
	 * 金額０１. Amount 01.<p>
	 *
	 */
	public void amt01(int value) {
		setConstNumber(offset + 18, $amt01, value);
	}
	
	/**
	 * 金額０１. Amount 01.<p>
	 *
	 */
	public void amt01(long value) {
		setConstNumber(offset + 18, $amt01, value);
	}
	
	/**
	 * 金額０１. Amount 01.<p>
	 *
	 */
	public void amt01(float value) {
		setConstNumber(offset + 18, $amt01, value);
	}
	
	/**
	 * 金額０１. Amount 01.<p>
	 *
	 */
	public void amt01(double value) {
		setConstNumber(offset + 18, $amt01, value);
	}
	
	/**
	 * 標準０１. Standard 01.<p>
	 *
	 */
	public MCNumber std01() {
		return getConstNumber(offset + 19, $std01);
	}

	/**
	 * 標準０１. Standard 01.<p>
	 *
	 */
	public void std01(MCNumber value) {
		setConstNumber(offset + 19, $std01, value);
	}
	
	/**
	 * 標準０１. Standard 01.<p>
	 *
	 */
	public void std01(int value) {
		setConstNumber(offset + 19, $std01, value);
	}
	
	/**
	 * 標準０１. Standard 01.<p>
	 *
	 */
	public void std01(long value) {
		setConstNumber(offset + 19, $std01, value);
	}
	
	/**
	 * 標準０１. Standard 01.<p>
	 *
	 */
	public void std01(float value) {
		setConstNumber(offset + 19, $std01, value);
	}
	
	/**
	 * 標準０１. Standard 01.<p>
	 *
	 */
	public void std01(double value) {
		setConstNumber(offset + 19, $std01, value);
	}
	
	/**
	 * 数量０２. Quantity 02.<p>
	 *
	 */
	public MCNumber qty02() {
		return getConstNumber(offset + 20, $qty02);
	}

	/**
	 * 数量０２. Quantity 02.<p>
	 *
	 */
	public void qty02(MCNumber value) {
		setConstNumber(offset + 20, $qty02, value);
	}
	
	/**
	 * 数量０２. Quantity 02.<p>
	 *
	 */
	public void qty02(int value) {
		setConstNumber(offset + 20, $qty02, value);
	}
	
	/**
	 * 数量０２. Quantity 02.<p>
	 *
	 */
	public void qty02(long value) {
		setConstNumber(offset + 20, $qty02, value);
	}
	
	/**
	 * 数量０２. Quantity 02.<p>
	 *
	 */
	public void qty02(float value) {
		setConstNumber(offset + 20, $qty02, value);
	}
	
	/**
	 * 数量０２. Quantity 02.<p>
	 *
	 */
	public void qty02(double value) {
		setConstNumber(offset + 20, $qty02, value);
	}
	
	/**
	 * 金額０２. Amount 02.<p>
	 *
	 */
	public MCNumber amt02() {
		return getConstNumber(offset + 21, $amt02);
	}

	/**
	 * 金額０２. Amount 02.<p>
	 *
	 */
	public void amt02(MCNumber value) {
		setConstNumber(offset + 21, $amt02, value);
	}
	
	/**
	 * 金額０２. Amount 02.<p>
	 *
	 */
	public void amt02(int value) {
		setConstNumber(offset + 21, $amt02, value);
	}
	
	/**
	 * 金額０２. Amount 02.<p>
	 *
	 */
	public void amt02(long value) {
		setConstNumber(offset + 21, $amt02, value);
	}
	
	/**
	 * 金額０２. Amount 02.<p>
	 *
	 */
	public void amt02(float value) {
		setConstNumber(offset + 21, $amt02, value);
	}
	
	/**
	 * 金額０２. Amount 02.<p>
	 *
	 */
	public void amt02(double value) {
		setConstNumber(offset + 21, $amt02, value);
	}
	
	/**
	 * 標準０２. Standard 02.<p>
	 *
	 */
	public MCNumber std02() {
		return getConstNumber(offset + 22, $std02);
	}

	/**
	 * 標準０２. Standard 02.<p>
	 *
	 */
	public void std02(MCNumber value) {
		setConstNumber(offset + 22, $std02, value);
	}
	
	/**
	 * 標準０２. Standard 02.<p>
	 *
	 */
	public void std02(int value) {
		setConstNumber(offset + 22, $std02, value);
	}
	
	/**
	 * 標準０２. Standard 02.<p>
	 *
	 */
	public void std02(long value) {
		setConstNumber(offset + 22, $std02, value);
	}
	
	/**
	 * 標準０２. Standard 02.<p>
	 *
	 */
	public void std02(float value) {
		setConstNumber(offset + 22, $std02, value);
	}
	
	/**
	 * 標準０２. Standard 02.<p>
	 *
	 */
	public void std02(double value) {
		setConstNumber(offset + 22, $std02, value);
	}
	
	/**
	 * 数量０３. Quantity 03.<p>
	 *
	 */
	public MCNumber qty03() {
		return getConstNumber(offset + 23, $qty03);
	}

	/**
	 * 数量０３. Quantity 03.<p>
	 *
	 */
	public void qty03(MCNumber value) {
		setConstNumber(offset + 23, $qty03, value);
	}
	
	/**
	 * 数量０３. Quantity 03.<p>
	 *
	 */
	public void qty03(int value) {
		setConstNumber(offset + 23, $qty03, value);
	}
	
	/**
	 * 数量０３. Quantity 03.<p>
	 *
	 */
	public void qty03(long value) {
		setConstNumber(offset + 23, $qty03, value);
	}
	
	/**
	 * 数量０３. Quantity 03.<p>
	 *
	 */
	public void qty03(float value) {
		setConstNumber(offset + 23, $qty03, value);
	}
	
	/**
	 * 数量０３. Quantity 03.<p>
	 *
	 */
	public void qty03(double value) {
		setConstNumber(offset + 23, $qty03, value);
	}
	
	/**
	 * 金額０３. Amount 03.<p>
	 *
	 */
	public MCNumber amt03() {
		return getConstNumber(offset + 24, $amt03);
	}

	/**
	 * 金額０３. Amount 03.<p>
	 *
	 */
	public void amt03(MCNumber value) {
		setConstNumber(offset + 24, $amt03, value);
	}
	
	/**
	 * 金額０３. Amount 03.<p>
	 *
	 */
	public void amt03(int value) {
		setConstNumber(offset + 24, $amt03, value);
	}
	
	/**
	 * 金額０３. Amount 03.<p>
	 *
	 */
	public void amt03(long value) {
		setConstNumber(offset + 24, $amt03, value);
	}
	
	/**
	 * 金額０３. Amount 03.<p>
	 *
	 */
	public void amt03(float value) {
		setConstNumber(offset + 24, $amt03, value);
	}
	
	/**
	 * 金額０３. Amount 03.<p>
	 *
	 */
	public void amt03(double value) {
		setConstNumber(offset + 24, $amt03, value);
	}
	
	/**
	 * 標準０３. Standard 03.<p>
	 *
	 */
	public MCNumber std03() {
		return getConstNumber(offset + 25, $std03);
	}

	/**
	 * 標準０３. Standard 03.<p>
	 *
	 */
	public void std03(MCNumber value) {
		setConstNumber(offset + 25, $std03, value);
	}
	
	/**
	 * 標準０３. Standard 03.<p>
	 *
	 */
	public void std03(int value) {
		setConstNumber(offset + 25, $std03, value);
	}
	
	/**
	 * 標準０３. Standard 03.<p>
	 *
	 */
	public void std03(long value) {
		setConstNumber(offset + 25, $std03, value);
	}
	
	/**
	 * 標準０３. Standard 03.<p>
	 *
	 */
	public void std03(float value) {
		setConstNumber(offset + 25, $std03, value);
	}
	
	/**
	 * 標準０３. Standard 03.<p>
	 *
	 */
	public void std03(double value) {
		setConstNumber(offset + 25, $std03, value);
	}
	
	/**
	 * 数量０４. Quantity 04.<p>
	 *
	 */
	public MCNumber qty04() {
		return getConstNumber(offset + 26, $qty04);
	}

	/**
	 * 数量０４. Quantity 04.<p>
	 *
	 */
	public void qty04(MCNumber value) {
		setConstNumber(offset + 26, $qty04, value);
	}
	
	/**
	 * 数量０４. Quantity 04.<p>
	 *
	 */
	public void qty04(int value) {
		setConstNumber(offset + 26, $qty04, value);
	}
	
	/**
	 * 数量０４. Quantity 04.<p>
	 *
	 */
	public void qty04(long value) {
		setConstNumber(offset + 26, $qty04, value);
	}
	
	/**
	 * 数量０４. Quantity 04.<p>
	 *
	 */
	public void qty04(float value) {
		setConstNumber(offset + 26, $qty04, value);
	}
	
	/**
	 * 数量０４. Quantity 04.<p>
	 *
	 */
	public void qty04(double value) {
		setConstNumber(offset + 26, $qty04, value);
	}
	
	/**
	 * 金額０４. Amount 04.<p>
	 *
	 */
	public MCNumber amt04() {
		return getConstNumber(offset + 27, $amt04);
	}

	/**
	 * 金額０４. Amount 04.<p>
	 *
	 */
	public void amt04(MCNumber value) {
		setConstNumber(offset + 27, $amt04, value);
	}
	
	/**
	 * 金額０４. Amount 04.<p>
	 *
	 */
	public void amt04(int value) {
		setConstNumber(offset + 27, $amt04, value);
	}
	
	/**
	 * 金額０４. Amount 04.<p>
	 *
	 */
	public void amt04(long value) {
		setConstNumber(offset + 27, $amt04, value);
	}
	
	/**
	 * 金額０４. Amount 04.<p>
	 *
	 */
	public void amt04(float value) {
		setConstNumber(offset + 27, $amt04, value);
	}
	
	/**
	 * 金額０４. Amount 04.<p>
	 *
	 */
	public void amt04(double value) {
		setConstNumber(offset + 27, $amt04, value);
	}
	
	/**
	 * 標準０４. Standard 04.<p>
	 *
	 */
	public MCNumber std04() {
		return getConstNumber(offset + 28, $std04);
	}

	/**
	 * 標準０４. Standard 04.<p>
	 *
	 */
	public void std04(MCNumber value) {
		setConstNumber(offset + 28, $std04, value);
	}
	
	/**
	 * 標準０４. Standard 04.<p>
	 *
	 */
	public void std04(int value) {
		setConstNumber(offset + 28, $std04, value);
	}
	
	/**
	 * 標準０４. Standard 04.<p>
	 *
	 */
	public void std04(long value) {
		setConstNumber(offset + 28, $std04, value);
	}
	
	/**
	 * 標準０４. Standard 04.<p>
	 *
	 */
	public void std04(float value) {
		setConstNumber(offset + 28, $std04, value);
	}
	
	/**
	 * 標準０４. Standard 04.<p>
	 *
	 */
	public void std04(double value) {
		setConstNumber(offset + 28, $std04, value);
	}
	
	/**
	 * 数量０５. Quantity 05.<p>
	 *
	 */
	public MCNumber qty05() {
		return getConstNumber(offset + 29, $qty05);
	}

	/**
	 * 数量０５. Quantity 05.<p>
	 *
	 */
	public void qty05(MCNumber value) {
		setConstNumber(offset + 29, $qty05, value);
	}
	
	/**
	 * 数量０５. Quantity 05.<p>
	 *
	 */
	public void qty05(int value) {
		setConstNumber(offset + 29, $qty05, value);
	}
	
	/**
	 * 数量０５. Quantity 05.<p>
	 *
	 */
	public void qty05(long value) {
		setConstNumber(offset + 29, $qty05, value);
	}
	
	/**
	 * 数量０５. Quantity 05.<p>
	 *
	 */
	public void qty05(float value) {
		setConstNumber(offset + 29, $qty05, value);
	}
	
	/**
	 * 数量０５. Quantity 05.<p>
	 *
	 */
	public void qty05(double value) {
		setConstNumber(offset + 29, $qty05, value);
	}
	
	/**
	 * 金額０５. Amount 05.<p>
	 *
	 */
	public MCNumber amt05() {
		return getConstNumber(offset + 30, $amt05);
	}

	/**
	 * 金額０５. Amount 05.<p>
	 *
	 */
	public void amt05(MCNumber value) {
		setConstNumber(offset + 30, $amt05, value);
	}
	
	/**
	 * 金額０５. Amount 05.<p>
	 *
	 */
	public void amt05(int value) {
		setConstNumber(offset + 30, $amt05, value);
	}
	
	/**
	 * 金額０５. Amount 05.<p>
	 *
	 */
	public void amt05(long value) {
		setConstNumber(offset + 30, $amt05, value);
	}
	
	/**
	 * 金額０５. Amount 05.<p>
	 *
	 */
	public void amt05(float value) {
		setConstNumber(offset + 30, $amt05, value);
	}
	
	/**
	 * 金額０５. Amount 05.<p>
	 *
	 */
	public void amt05(double value) {
		setConstNumber(offset + 30, $amt05, value);
	}
	
	/**
	 * 標準０５. Standard 05.<p>
	 *
	 */
	public MCNumber std05() {
		return getConstNumber(offset + 31, $std05);
	}

	/**
	 * 標準０５. Standard 05.<p>
	 *
	 */
	public void std05(MCNumber value) {
		setConstNumber(offset + 31, $std05, value);
	}
	
	/**
	 * 標準０５. Standard 05.<p>
	 *
	 */
	public void std05(int value) {
		setConstNumber(offset + 31, $std05, value);
	}
	
	/**
	 * 標準０５. Standard 05.<p>
	 *
	 */
	public void std05(long value) {
		setConstNumber(offset + 31, $std05, value);
	}
	
	/**
	 * 標準０５. Standard 05.<p>
	 *
	 */
	public void std05(float value) {
		setConstNumber(offset + 31, $std05, value);
	}
	
	/**
	 * 標準０５. Standard 05.<p>
	 *
	 */
	public void std05(double value) {
		setConstNumber(offset + 31, $std05, value);
	}
	
	/**
	 * 数量０６. Quantity 06.<p>
	 *
	 */
	public MCNumber qty06() {
		return getConstNumber(offset + 32, $qty06);
	}

	/**
	 * 数量０６. Quantity 06.<p>
	 *
	 */
	public void qty06(MCNumber value) {
		setConstNumber(offset + 32, $qty06, value);
	}
	
	/**
	 * 数量０６. Quantity 06.<p>
	 *
	 */
	public void qty06(int value) {
		setConstNumber(offset + 32, $qty06, value);
	}
	
	/**
	 * 数量０６. Quantity 06.<p>
	 *
	 */
	public void qty06(long value) {
		setConstNumber(offset + 32, $qty06, value);
	}
	
	/**
	 * 数量０６. Quantity 06.<p>
	 *
	 */
	public void qty06(float value) {
		setConstNumber(offset + 32, $qty06, value);
	}
	
	/**
	 * 数量０６. Quantity 06.<p>
	 *
	 */
	public void qty06(double value) {
		setConstNumber(offset + 32, $qty06, value);
	}
	
	/**
	 * 金額０６. Amount 06.<p>
	 *
	 */
	public MCNumber amt06() {
		return getConstNumber(offset + 33, $amt06);
	}

	/**
	 * 金額０６. Amount 06.<p>
	 *
	 */
	public void amt06(MCNumber value) {
		setConstNumber(offset + 33, $amt06, value);
	}
	
	/**
	 * 金額０６. Amount 06.<p>
	 *
	 */
	public void amt06(int value) {
		setConstNumber(offset + 33, $amt06, value);
	}
	
	/**
	 * 金額０６. Amount 06.<p>
	 *
	 */
	public void amt06(long value) {
		setConstNumber(offset + 33, $amt06, value);
	}
	
	/**
	 * 金額０６. Amount 06.<p>
	 *
	 */
	public void amt06(float value) {
		setConstNumber(offset + 33, $amt06, value);
	}
	
	/**
	 * 金額０６. Amount 06.<p>
	 *
	 */
	public void amt06(double value) {
		setConstNumber(offset + 33, $amt06, value);
	}
	
	/**
	 * 標準０６. Standard 06.<p>
	 *
	 */
	public MCNumber std06() {
		return getConstNumber(offset + 34, $std06);
	}

	/**
	 * 標準０６. Standard 06.<p>
	 *
	 */
	public void std06(MCNumber value) {
		setConstNumber(offset + 34, $std06, value);
	}
	
	/**
	 * 標準０６. Standard 06.<p>
	 *
	 */
	public void std06(int value) {
		setConstNumber(offset + 34, $std06, value);
	}
	
	/**
	 * 標準０６. Standard 06.<p>
	 *
	 */
	public void std06(long value) {
		setConstNumber(offset + 34, $std06, value);
	}
	
	/**
	 * 標準０６. Standard 06.<p>
	 *
	 */
	public void std06(float value) {
		setConstNumber(offset + 34, $std06, value);
	}
	
	/**
	 * 標準０６. Standard 06.<p>
	 *
	 */
	public void std06(double value) {
		setConstNumber(offset + 34, $std06, value);
	}
	
	/**
	 * 数量０７. Quantity 07.<p>
	 *
	 */
	public MCNumber qty07() {
		return getConstNumber(offset + 35, $qty07);
	}

	/**
	 * 数量０７. Quantity 07.<p>
	 *
	 */
	public void qty07(MCNumber value) {
		setConstNumber(offset + 35, $qty07, value);
	}
	
	/**
	 * 数量０７. Quantity 07.<p>
	 *
	 */
	public void qty07(int value) {
		setConstNumber(offset + 35, $qty07, value);
	}
	
	/**
	 * 数量０７. Quantity 07.<p>
	 *
	 */
	public void qty07(long value) {
		setConstNumber(offset + 35, $qty07, value);
	}
	
	/**
	 * 数量０７. Quantity 07.<p>
	 *
	 */
	public void qty07(float value) {
		setConstNumber(offset + 35, $qty07, value);
	}
	
	/**
	 * 数量０７. Quantity 07.<p>
	 *
	 */
	public void qty07(double value) {
		setConstNumber(offset + 35, $qty07, value);
	}
	
	/**
	 * 金額０７. Amount 07.<p>
	 *
	 */
	public MCNumber amt07() {
		return getConstNumber(offset + 36, $amt07);
	}

	/**
	 * 金額０７. Amount 07.<p>
	 *
	 */
	public void amt07(MCNumber value) {
		setConstNumber(offset + 36, $amt07, value);
	}
	
	/**
	 * 金額０７. Amount 07.<p>
	 *
	 */
	public void amt07(int value) {
		setConstNumber(offset + 36, $amt07, value);
	}
	
	/**
	 * 金額０７. Amount 07.<p>
	 *
	 */
	public void amt07(long value) {
		setConstNumber(offset + 36, $amt07, value);
	}
	
	/**
	 * 金額０７. Amount 07.<p>
	 *
	 */
	public void amt07(float value) {
		setConstNumber(offset + 36, $amt07, value);
	}
	
	/**
	 * 金額０７. Amount 07.<p>
	 *
	 */
	public void amt07(double value) {
		setConstNumber(offset + 36, $amt07, value);
	}
	
	/**
	 * 標準０７. Standard 07.<p>
	 *
	 */
	public MCNumber std07() {
		return getConstNumber(offset + 37, $std07);
	}

	/**
	 * 標準０７. Standard 07.<p>
	 *
	 */
	public void std07(MCNumber value) {
		setConstNumber(offset + 37, $std07, value);
	}
	
	/**
	 * 標準０７. Standard 07.<p>
	 *
	 */
	public void std07(int value) {
		setConstNumber(offset + 37, $std07, value);
	}
	
	/**
	 * 標準０７. Standard 07.<p>
	 *
	 */
	public void std07(long value) {
		setConstNumber(offset + 37, $std07, value);
	}
	
	/**
	 * 標準０７. Standard 07.<p>
	 *
	 */
	public void std07(float value) {
		setConstNumber(offset + 37, $std07, value);
	}
	
	/**
	 * 標準０７. Standard 07.<p>
	 *
	 */
	public void std07(double value) {
		setConstNumber(offset + 37, $std07, value);
	}
	
	/**
	 * 数量０８. Quantity 08.<p>
	 *
	 */
	public MCNumber qty08() {
		return getConstNumber(offset + 38, $qty08);
	}

	/**
	 * 数量０８. Quantity 08.<p>
	 *
	 */
	public void qty08(MCNumber value) {
		setConstNumber(offset + 38, $qty08, value);
	}
	
	/**
	 * 数量０８. Quantity 08.<p>
	 *
	 */
	public void qty08(int value) {
		setConstNumber(offset + 38, $qty08, value);
	}
	
	/**
	 * 数量０８. Quantity 08.<p>
	 *
	 */
	public void qty08(long value) {
		setConstNumber(offset + 38, $qty08, value);
	}
	
	/**
	 * 数量０８. Quantity 08.<p>
	 *
	 */
	public void qty08(float value) {
		setConstNumber(offset + 38, $qty08, value);
	}
	
	/**
	 * 数量０８. Quantity 08.<p>
	 *
	 */
	public void qty08(double value) {
		setConstNumber(offset + 38, $qty08, value);
	}
	
	/**
	 * 金額０８. Amount 08.<p>
	 *
	 */
	public MCNumber amt08() {
		return getConstNumber(offset + 39, $amt08);
	}

	/**
	 * 金額０８. Amount 08.<p>
	 *
	 */
	public void amt08(MCNumber value) {
		setConstNumber(offset + 39, $amt08, value);
	}
	
	/**
	 * 金額０８. Amount 08.<p>
	 *
	 */
	public void amt08(int value) {
		setConstNumber(offset + 39, $amt08, value);
	}
	
	/**
	 * 金額０８. Amount 08.<p>
	 *
	 */
	public void amt08(long value) {
		setConstNumber(offset + 39, $amt08, value);
	}
	
	/**
	 * 金額０８. Amount 08.<p>
	 *
	 */
	public void amt08(float value) {
		setConstNumber(offset + 39, $amt08, value);
	}
	
	/**
	 * 金額０８. Amount 08.<p>
	 *
	 */
	public void amt08(double value) {
		setConstNumber(offset + 39, $amt08, value);
	}
	
	/**
	 * 標準０８. Standard 08.<p>
	 *
	 */
	public MCNumber std08() {
		return getConstNumber(offset + 40, $std08);
	}

	/**
	 * 標準０８. Standard 08.<p>
	 *
	 */
	public void std08(MCNumber value) {
		setConstNumber(offset + 40, $std08, value);
	}
	
	/**
	 * 標準０８. Standard 08.<p>
	 *
	 */
	public void std08(int value) {
		setConstNumber(offset + 40, $std08, value);
	}
	
	/**
	 * 標準０８. Standard 08.<p>
	 *
	 */
	public void std08(long value) {
		setConstNumber(offset + 40, $std08, value);
	}
	
	/**
	 * 標準０８. Standard 08.<p>
	 *
	 */
	public void std08(float value) {
		setConstNumber(offset + 40, $std08, value);
	}
	
	/**
	 * 標準０８. Standard 08.<p>
	 *
	 */
	public void std08(double value) {
		setConstNumber(offset + 40, $std08, value);
	}
	
	/**
	 * 数量０９. Quantity 09.<p>
	 *
	 */
	public MCNumber qty09() {
		return getConstNumber(offset + 41, $qty09);
	}

	/**
	 * 数量０９. Quantity 09.<p>
	 *
	 */
	public void qty09(MCNumber value) {
		setConstNumber(offset + 41, $qty09, value);
	}
	
	/**
	 * 数量０９. Quantity 09.<p>
	 *
	 */
	public void qty09(int value) {
		setConstNumber(offset + 41, $qty09, value);
	}
	
	/**
	 * 数量０９. Quantity 09.<p>
	 *
	 */
	public void qty09(long value) {
		setConstNumber(offset + 41, $qty09, value);
	}
	
	/**
	 * 数量０９. Quantity 09.<p>
	 *
	 */
	public void qty09(float value) {
		setConstNumber(offset + 41, $qty09, value);
	}
	
	/**
	 * 数量０９. Quantity 09.<p>
	 *
	 */
	public void qty09(double value) {
		setConstNumber(offset + 41, $qty09, value);
	}
	
	/**
	 * 金額０９. Amount 09.<p>
	 *
	 */
	public MCNumber amt09() {
		return getConstNumber(offset + 42, $amt09);
	}

	/**
	 * 金額０９. Amount 09.<p>
	 *
	 */
	public void amt09(MCNumber value) {
		setConstNumber(offset + 42, $amt09, value);
	}
	
	/**
	 * 金額０９. Amount 09.<p>
	 *
	 */
	public void amt09(int value) {
		setConstNumber(offset + 42, $amt09, value);
	}
	
	/**
	 * 金額０９. Amount 09.<p>
	 *
	 */
	public void amt09(long value) {
		setConstNumber(offset + 42, $amt09, value);
	}
	
	/**
	 * 金額０９. Amount 09.<p>
	 *
	 */
	public void amt09(float value) {
		setConstNumber(offset + 42, $amt09, value);
	}
	
	/**
	 * 金額０９. Amount 09.<p>
	 *
	 */
	public void amt09(double value) {
		setConstNumber(offset + 42, $amt09, value);
	}
	
	/**
	 * 標準０９. Standard 09.<p>
	 *
	 */
	public MCNumber std09() {
		return getConstNumber(offset + 43, $std09);
	}

	/**
	 * 標準０９. Standard 09.<p>
	 *
	 */
	public void std09(MCNumber value) {
		setConstNumber(offset + 43, $std09, value);
	}
	
	/**
	 * 標準０９. Standard 09.<p>
	 *
	 */
	public void std09(int value) {
		setConstNumber(offset + 43, $std09, value);
	}
	
	/**
	 * 標準０９. Standard 09.<p>
	 *
	 */
	public void std09(long value) {
		setConstNumber(offset + 43, $std09, value);
	}
	
	/**
	 * 標準０９. Standard 09.<p>
	 *
	 */
	public void std09(float value) {
		setConstNumber(offset + 43, $std09, value);
	}
	
	/**
	 * 標準０９. Standard 09.<p>
	 *
	 */
	public void std09(double value) {
		setConstNumber(offset + 43, $std09, value);
	}
	
	/**
	 * 数量１０. Quantity 10.<p>
	 *
	 */
	public MCNumber qty10() {
		return getConstNumber(offset + 44, $qty10);
	}

	/**
	 * 数量１０. Quantity 10.<p>
	 *
	 */
	public void qty10(MCNumber value) {
		setConstNumber(offset + 44, $qty10, value);
	}
	
	/**
	 * 数量１０. Quantity 10.<p>
	 *
	 */
	public void qty10(int value) {
		setConstNumber(offset + 44, $qty10, value);
	}
	
	/**
	 * 数量１０. Quantity 10.<p>
	 *
	 */
	public void qty10(long value) {
		setConstNumber(offset + 44, $qty10, value);
	}
	
	/**
	 * 数量１０. Quantity 10.<p>
	 *
	 */
	public void qty10(float value) {
		setConstNumber(offset + 44, $qty10, value);
	}
	
	/**
	 * 数量１０. Quantity 10.<p>
	 *
	 */
	public void qty10(double value) {
		setConstNumber(offset + 44, $qty10, value);
	}
	
	/**
	 * 金額１０. Amount 10.<p>
	 *
	 */
	public MCNumber amt10() {
		return getConstNumber(offset + 45, $amt10);
	}

	/**
	 * 金額１０. Amount 10.<p>
	 *
	 */
	public void amt10(MCNumber value) {
		setConstNumber(offset + 45, $amt10, value);
	}
	
	/**
	 * 金額１０. Amount 10.<p>
	 *
	 */
	public void amt10(int value) {
		setConstNumber(offset + 45, $amt10, value);
	}
	
	/**
	 * 金額１０. Amount 10.<p>
	 *
	 */
	public void amt10(long value) {
		setConstNumber(offset + 45, $amt10, value);
	}
	
	/**
	 * 金額１０. Amount 10.<p>
	 *
	 */
	public void amt10(float value) {
		setConstNumber(offset + 45, $amt10, value);
	}
	
	/**
	 * 金額１０. Amount 10.<p>
	 *
	 */
	public void amt10(double value) {
		setConstNumber(offset + 45, $amt10, value);
	}
	
	/**
	 * 標準１０. Standard 10.<p>
	 *
	 */
	public MCNumber std10() {
		return getConstNumber(offset + 46, $std10);
	}

	/**
	 * 標準１０. Standard 10.<p>
	 *
	 */
	public void std10(MCNumber value) {
		setConstNumber(offset + 46, $std10, value);
	}
	
	/**
	 * 標準１０. Standard 10.<p>
	 *
	 */
	public void std10(int value) {
		setConstNumber(offset + 46, $std10, value);
	}
	
	/**
	 * 標準１０. Standard 10.<p>
	 *
	 */
	public void std10(long value) {
		setConstNumber(offset + 46, $std10, value);
	}
	
	/**
	 * 標準１０. Standard 10.<p>
	 *
	 */
	public void std10(float value) {
		setConstNumber(offset + 46, $std10, value);
	}
	
	/**
	 * 標準１０. Standard 10.<p>
	 *
	 */
	public void std10(double value) {
		setConstNumber(offset + 46, $std10, value);
	}
	
	/**
	 * 数量１１. Quantity 11.<p>
	 *
	 */
	public MCNumber qty11() {
		return getConstNumber(offset + 47, $qty11);
	}

	/**
	 * 数量１１. Quantity 11.<p>
	 *
	 */
	public void qty11(MCNumber value) {
		setConstNumber(offset + 47, $qty11, value);
	}
	
	/**
	 * 数量１１. Quantity 11.<p>
	 *
	 */
	public void qty11(int value) {
		setConstNumber(offset + 47, $qty11, value);
	}
	
	/**
	 * 数量１１. Quantity 11.<p>
	 *
	 */
	public void qty11(long value) {
		setConstNumber(offset + 47, $qty11, value);
	}
	
	/**
	 * 数量１１. Quantity 11.<p>
	 *
	 */
	public void qty11(float value) {
		setConstNumber(offset + 47, $qty11, value);
	}
	
	/**
	 * 数量１１. Quantity 11.<p>
	 *
	 */
	public void qty11(double value) {
		setConstNumber(offset + 47, $qty11, value);
	}
	
	/**
	 * 金額１１. Amount 11.<p>
	 *
	 */
	public MCNumber amt11() {
		return getConstNumber(offset + 48, $amt11);
	}

	/**
	 * 金額１１. Amount 11.<p>
	 *
	 */
	public void amt11(MCNumber value) {
		setConstNumber(offset + 48, $amt11, value);
	}
	
	/**
	 * 金額１１. Amount 11.<p>
	 *
	 */
	public void amt11(int value) {
		setConstNumber(offset + 48, $amt11, value);
	}
	
	/**
	 * 金額１１. Amount 11.<p>
	 *
	 */
	public void amt11(long value) {
		setConstNumber(offset + 48, $amt11, value);
	}
	
	/**
	 * 金額１１. Amount 11.<p>
	 *
	 */
	public void amt11(float value) {
		setConstNumber(offset + 48, $amt11, value);
	}
	
	/**
	 * 金額１１. Amount 11.<p>
	 *
	 */
	public void amt11(double value) {
		setConstNumber(offset + 48, $amt11, value);
	}
	
	/**
	 * 標準１１. Standard 11.<p>
	 *
	 */
	public MCNumber std11() {
		return getConstNumber(offset + 49, $std11);
	}

	/**
	 * 標準１１. Standard 11.<p>
	 *
	 */
	public void std11(MCNumber value) {
		setConstNumber(offset + 49, $std11, value);
	}
	
	/**
	 * 標準１１. Standard 11.<p>
	 *
	 */
	public void std11(int value) {
		setConstNumber(offset + 49, $std11, value);
	}
	
	/**
	 * 標準１１. Standard 11.<p>
	 *
	 */
	public void std11(long value) {
		setConstNumber(offset + 49, $std11, value);
	}
	
	/**
	 * 標準１１. Standard 11.<p>
	 *
	 */
	public void std11(float value) {
		setConstNumber(offset + 49, $std11, value);
	}
	
	/**
	 * 標準１１. Standard 11.<p>
	 *
	 */
	public void std11(double value) {
		setConstNumber(offset + 49, $std11, value);
	}
	
	/**
	 * 数量１２. Quantity 12.<p>
	 *
	 */
	public MCNumber qty12() {
		return getConstNumber(offset + 50, $qty12);
	}

	/**
	 * 数量１２. Quantity 12.<p>
	 *
	 */
	public void qty12(MCNumber value) {
		setConstNumber(offset + 50, $qty12, value);
	}
	
	/**
	 * 数量１２. Quantity 12.<p>
	 *
	 */
	public void qty12(int value) {
		setConstNumber(offset + 50, $qty12, value);
	}
	
	/**
	 * 数量１２. Quantity 12.<p>
	 *
	 */
	public void qty12(long value) {
		setConstNumber(offset + 50, $qty12, value);
	}
	
	/**
	 * 数量１２. Quantity 12.<p>
	 *
	 */
	public void qty12(float value) {
		setConstNumber(offset + 50, $qty12, value);
	}
	
	/**
	 * 数量１２. Quantity 12.<p>
	 *
	 */
	public void qty12(double value) {
		setConstNumber(offset + 50, $qty12, value);
	}
	
	/**
	 * 金額１２. Amount 12.<p>
	 *
	 */
	public MCNumber amt12() {
		return getConstNumber(offset + 51, $amt12);
	}

	/**
	 * 金額１２. Amount 12.<p>
	 *
	 */
	public void amt12(MCNumber value) {
		setConstNumber(offset + 51, $amt12, value);
	}
	
	/**
	 * 金額１２. Amount 12.<p>
	 *
	 */
	public void amt12(int value) {
		setConstNumber(offset + 51, $amt12, value);
	}
	
	/**
	 * 金額１２. Amount 12.<p>
	 *
	 */
	public void amt12(long value) {
		setConstNumber(offset + 51, $amt12, value);
	}
	
	/**
	 * 金額１２. Amount 12.<p>
	 *
	 */
	public void amt12(float value) {
		setConstNumber(offset + 51, $amt12, value);
	}
	
	/**
	 * 金額１２. Amount 12.<p>
	 *
	 */
	public void amt12(double value) {
		setConstNumber(offset + 51, $amt12, value);
	}
	
	/**
	 * 標準１２. Standard 12.<p>
	 *
	 */
	public MCNumber std12() {
		return getConstNumber(offset + 52, $std12);
	}

	/**
	 * 標準１２. Standard 12.<p>
	 *
	 */
	public void std12(MCNumber value) {
		setConstNumber(offset + 52, $std12, value);
	}
	
	/**
	 * 標準１２. Standard 12.<p>
	 *
	 */
	public void std12(int value) {
		setConstNumber(offset + 52, $std12, value);
	}
	
	/**
	 * 標準１２. Standard 12.<p>
	 *
	 */
	public void std12(long value) {
		setConstNumber(offset + 52, $std12, value);
	}
	
	/**
	 * 標準１２. Standard 12.<p>
	 *
	 */
	public void std12(float value) {
		setConstNumber(offset + 52, $std12, value);
	}
	
	/**
	 * 標準１２. Standard 12.<p>
	 *
	 */
	public void std12(double value) {
		setConstNumber(offset + 52, $std12, value);
	}
	
	/**
	 * 数量１３. Quantity 13.<p>
	 *
	 */
	public MCNumber qty13() {
		return getConstNumber(offset + 53, $qty13);
	}

	/**
	 * 数量１３. Quantity 13.<p>
	 *
	 */
	public void qty13(MCNumber value) {
		setConstNumber(offset + 53, $qty13, value);
	}
	
	/**
	 * 数量１３. Quantity 13.<p>
	 *
	 */
	public void qty13(int value) {
		setConstNumber(offset + 53, $qty13, value);
	}
	
	/**
	 * 数量１３. Quantity 13.<p>
	 *
	 */
	public void qty13(long value) {
		setConstNumber(offset + 53, $qty13, value);
	}
	
	/**
	 * 数量１３. Quantity 13.<p>
	 *
	 */
	public void qty13(float value) {
		setConstNumber(offset + 53, $qty13, value);
	}
	
	/**
	 * 数量１３. Quantity 13.<p>
	 *
	 */
	public void qty13(double value) {
		setConstNumber(offset + 53, $qty13, value);
	}
	
	/**
	 * 金額１３. Amount 13.<p>
	 *
	 */
	public MCNumber amt13() {
		return getConstNumber(offset + 54, $amt13);
	}

	/**
	 * 金額１３. Amount 13.<p>
	 *
	 */
	public void amt13(MCNumber value) {
		setConstNumber(offset + 54, $amt13, value);
	}
	
	/**
	 * 金額１３. Amount 13.<p>
	 *
	 */
	public void amt13(int value) {
		setConstNumber(offset + 54, $amt13, value);
	}
	
	/**
	 * 金額１３. Amount 13.<p>
	 *
	 */
	public void amt13(long value) {
		setConstNumber(offset + 54, $amt13, value);
	}
	
	/**
	 * 金額１３. Amount 13.<p>
	 *
	 */
	public void amt13(float value) {
		setConstNumber(offset + 54, $amt13, value);
	}
	
	/**
	 * 金額１３. Amount 13.<p>
	 *
	 */
	public void amt13(double value) {
		setConstNumber(offset + 54, $amt13, value);
	}
	
	/**
	 * 標準１３. Standard 13.<p>
	 *
	 */
	public MCNumber std13() {
		return getConstNumber(offset + 55, $std13);
	}

	/**
	 * 標準１３. Standard 13.<p>
	 *
	 */
	public void std13(MCNumber value) {
		setConstNumber(offset + 55, $std13, value);
	}
	
	/**
	 * 標準１３. Standard 13.<p>
	 *
	 */
	public void std13(int value) {
		setConstNumber(offset + 55, $std13, value);
	}
	
	/**
	 * 標準１３. Standard 13.<p>
	 *
	 */
	public void std13(long value) {
		setConstNumber(offset + 55, $std13, value);
	}
	
	/**
	 * 標準１３. Standard 13.<p>
	 *
	 */
	public void std13(float value) {
		setConstNumber(offset + 55, $std13, value);
	}
	
	/**
	 * 標準１３. Standard 13.<p>
	 *
	 */
	public void std13(double value) {
		setConstNumber(offset + 55, $std13, value);
	}
	
	/**
	 * 数量１４. Quantity 14.<p>
	 *
	 */
	public MCNumber qty14() {
		return getConstNumber(offset + 56, $qty14);
	}

	/**
	 * 数量１４. Quantity 14.<p>
	 *
	 */
	public void qty14(MCNumber value) {
		setConstNumber(offset + 56, $qty14, value);
	}
	
	/**
	 * 数量１４. Quantity 14.<p>
	 *
	 */
	public void qty14(int value) {
		setConstNumber(offset + 56, $qty14, value);
	}
	
	/**
	 * 数量１４. Quantity 14.<p>
	 *
	 */
	public void qty14(long value) {
		setConstNumber(offset + 56, $qty14, value);
	}
	
	/**
	 * 数量１４. Quantity 14.<p>
	 *
	 */
	public void qty14(float value) {
		setConstNumber(offset + 56, $qty14, value);
	}
	
	/**
	 * 数量１４. Quantity 14.<p>
	 *
	 */
	public void qty14(double value) {
		setConstNumber(offset + 56, $qty14, value);
	}
	
	/**
	 * 金額１４. Amount 14.<p>
	 *
	 */
	public MCNumber amt14() {
		return getConstNumber(offset + 57, $amt14);
	}

	/**
	 * 金額１４. Amount 14.<p>
	 *
	 */
	public void amt14(MCNumber value) {
		setConstNumber(offset + 57, $amt14, value);
	}
	
	/**
	 * 金額１４. Amount 14.<p>
	 *
	 */
	public void amt14(int value) {
		setConstNumber(offset + 57, $amt14, value);
	}
	
	/**
	 * 金額１４. Amount 14.<p>
	 *
	 */
	public void amt14(long value) {
		setConstNumber(offset + 57, $amt14, value);
	}
	
	/**
	 * 金額１４. Amount 14.<p>
	 *
	 */
	public void amt14(float value) {
		setConstNumber(offset + 57, $amt14, value);
	}
	
	/**
	 * 金額１４. Amount 14.<p>
	 *
	 */
	public void amt14(double value) {
		setConstNumber(offset + 57, $amt14, value);
	}
	
	/**
	 * 標準１４. Standard 14.<p>
	 *
	 */
	public MCNumber std14() {
		return getConstNumber(offset + 58, $std14);
	}

	/**
	 * 標準１４. Standard 14.<p>
	 *
	 */
	public void std14(MCNumber value) {
		setConstNumber(offset + 58, $std14, value);
	}
	
	/**
	 * 標準１４. Standard 14.<p>
	 *
	 */
	public void std14(int value) {
		setConstNumber(offset + 58, $std14, value);
	}
	
	/**
	 * 標準１４. Standard 14.<p>
	 *
	 */
	public void std14(long value) {
		setConstNumber(offset + 58, $std14, value);
	}
	
	/**
	 * 標準１４. Standard 14.<p>
	 *
	 */
	public void std14(float value) {
		setConstNumber(offset + 58, $std14, value);
	}
	
	/**
	 * 標準１４. Standard 14.<p>
	 *
	 */
	public void std14(double value) {
		setConstNumber(offset + 58, $std14, value);
	}
	
	/**
	 * 数量１５. Quantity 15.<p>
	 *
	 */
	public MCNumber qty15() {
		return getConstNumber(offset + 59, $qty15);
	}

	/**
	 * 数量１５. Quantity 15.<p>
	 *
	 */
	public void qty15(MCNumber value) {
		setConstNumber(offset + 59, $qty15, value);
	}
	
	/**
	 * 数量１５. Quantity 15.<p>
	 *
	 */
	public void qty15(int value) {
		setConstNumber(offset + 59, $qty15, value);
	}
	
	/**
	 * 数量１５. Quantity 15.<p>
	 *
	 */
	public void qty15(long value) {
		setConstNumber(offset + 59, $qty15, value);
	}
	
	/**
	 * 数量１５. Quantity 15.<p>
	 *
	 */
	public void qty15(float value) {
		setConstNumber(offset + 59, $qty15, value);
	}
	
	/**
	 * 数量１５. Quantity 15.<p>
	 *
	 */
	public void qty15(double value) {
		setConstNumber(offset + 59, $qty15, value);
	}
	
	/**
	 * 金額１５. Amount 15.<p>
	 *
	 */
	public MCNumber amt15() {
		return getConstNumber(offset + 60, $amt15);
	}

	/**
	 * 金額１５. Amount 15.<p>
	 *
	 */
	public void amt15(MCNumber value) {
		setConstNumber(offset + 60, $amt15, value);
	}
	
	/**
	 * 金額１５. Amount 15.<p>
	 *
	 */
	public void amt15(int value) {
		setConstNumber(offset + 60, $amt15, value);
	}
	
	/**
	 * 金額１５. Amount 15.<p>
	 *
	 */
	public void amt15(long value) {
		setConstNumber(offset + 60, $amt15, value);
	}
	
	/**
	 * 金額１５. Amount 15.<p>
	 *
	 */
	public void amt15(float value) {
		setConstNumber(offset + 60, $amt15, value);
	}
	
	/**
	 * 金額１５. Amount 15.<p>
	 *
	 */
	public void amt15(double value) {
		setConstNumber(offset + 60, $amt15, value);
	}
	
	/**
	 * 標準１５. Standard 15.<p>
	 *
	 */
	public MCNumber std15() {
		return getConstNumber(offset + 61, $std15);
	}

	/**
	 * 標準１５. Standard 15.<p>
	 *
	 */
	public void std15(MCNumber value) {
		setConstNumber(offset + 61, $std15, value);
	}
	
	/**
	 * 標準１５. Standard 15.<p>
	 *
	 */
	public void std15(int value) {
		setConstNumber(offset + 61, $std15, value);
	}
	
	/**
	 * 標準１５. Standard 15.<p>
	 *
	 */
	public void std15(long value) {
		setConstNumber(offset + 61, $std15, value);
	}
	
	/**
	 * 標準１５. Standard 15.<p>
	 *
	 */
	public void std15(float value) {
		setConstNumber(offset + 61, $std15, value);
	}
	
	/**
	 * 標準１５. Standard 15.<p>
	 *
	 */
	public void std15(double value) {
		setConstNumber(offset + 61, $std15, value);
	}
	
	/**
	 * 数量１６. Quantity 16.<p>
	 *
	 */
	public MCNumber qty16() {
		return getConstNumber(offset + 62, $qty16);
	}

	/**
	 * 数量１６. Quantity 16.<p>
	 *
	 */
	public void qty16(MCNumber value) {
		setConstNumber(offset + 62, $qty16, value);
	}
	
	/**
	 * 数量１６. Quantity 16.<p>
	 *
	 */
	public void qty16(int value) {
		setConstNumber(offset + 62, $qty16, value);
	}
	
	/**
	 * 数量１６. Quantity 16.<p>
	 *
	 */
	public void qty16(long value) {
		setConstNumber(offset + 62, $qty16, value);
	}
	
	/**
	 * 数量１６. Quantity 16.<p>
	 *
	 */
	public void qty16(float value) {
		setConstNumber(offset + 62, $qty16, value);
	}
	
	/**
	 * 数量１６. Quantity 16.<p>
	 *
	 */
	public void qty16(double value) {
		setConstNumber(offset + 62, $qty16, value);
	}
	
	/**
	 * 金額１６. Amount 16.<p>
	 *
	 */
	public MCNumber amt16() {
		return getConstNumber(offset + 63, $amt16);
	}

	/**
	 * 金額１６. Amount 16.<p>
	 *
	 */
	public void amt16(MCNumber value) {
		setConstNumber(offset + 63, $amt16, value);
	}
	
	/**
	 * 金額１６. Amount 16.<p>
	 *
	 */
	public void amt16(int value) {
		setConstNumber(offset + 63, $amt16, value);
	}
	
	/**
	 * 金額１６. Amount 16.<p>
	 *
	 */
	public void amt16(long value) {
		setConstNumber(offset + 63, $amt16, value);
	}
	
	/**
	 * 金額１６. Amount 16.<p>
	 *
	 */
	public void amt16(float value) {
		setConstNumber(offset + 63, $amt16, value);
	}
	
	/**
	 * 金額１６. Amount 16.<p>
	 *
	 */
	public void amt16(double value) {
		setConstNumber(offset + 63, $amt16, value);
	}
	
	/**
	 * 標準１６. Standard 16.<p>
	 *
	 */
	public MCNumber std16() {
		return getConstNumber(offset + 64, $std16);
	}

	/**
	 * 標準１６. Standard 16.<p>
	 *
	 */
	public void std16(MCNumber value) {
		setConstNumber(offset + 64, $std16, value);
	}
	
	/**
	 * 標準１６. Standard 16.<p>
	 *
	 */
	public void std16(int value) {
		setConstNumber(offset + 64, $std16, value);
	}
	
	/**
	 * 標準１６. Standard 16.<p>
	 *
	 */
	public void std16(long value) {
		setConstNumber(offset + 64, $std16, value);
	}
	
	/**
	 * 標準１６. Standard 16.<p>
	 *
	 */
	public void std16(float value) {
		setConstNumber(offset + 64, $std16, value);
	}
	
	/**
	 * 標準１６. Standard 16.<p>
	 *
	 */
	public void std16(double value) {
		setConstNumber(offset + 64, $std16, value);
	}
	
	/**
	 * 数量１７. Quantity 17.<p>
	 *
	 */
	public MCNumber qty17() {
		return getConstNumber(offset + 65, $qty17);
	}

	/**
	 * 数量１７. Quantity 17.<p>
	 *
	 */
	public void qty17(MCNumber value) {
		setConstNumber(offset + 65, $qty17, value);
	}
	
	/**
	 * 数量１７. Quantity 17.<p>
	 *
	 */
	public void qty17(int value) {
		setConstNumber(offset + 65, $qty17, value);
	}
	
	/**
	 * 数量１７. Quantity 17.<p>
	 *
	 */
	public void qty17(long value) {
		setConstNumber(offset + 65, $qty17, value);
	}
	
	/**
	 * 数量１７. Quantity 17.<p>
	 *
	 */
	public void qty17(float value) {
		setConstNumber(offset + 65, $qty17, value);
	}
	
	/**
	 * 数量１７. Quantity 17.<p>
	 *
	 */
	public void qty17(double value) {
		setConstNumber(offset + 65, $qty17, value);
	}
	
	/**
	 * 金額１７. Amount 17.<p>
	 *
	 */
	public MCNumber amt17() {
		return getConstNumber(offset + 66, $amt17);
	}

	/**
	 * 金額１７. Amount 17.<p>
	 *
	 */
	public void amt17(MCNumber value) {
		setConstNumber(offset + 66, $amt17, value);
	}
	
	/**
	 * 金額１７. Amount 17.<p>
	 *
	 */
	public void amt17(int value) {
		setConstNumber(offset + 66, $amt17, value);
	}
	
	/**
	 * 金額１７. Amount 17.<p>
	 *
	 */
	public void amt17(long value) {
		setConstNumber(offset + 66, $amt17, value);
	}
	
	/**
	 * 金額１７. Amount 17.<p>
	 *
	 */
	public void amt17(float value) {
		setConstNumber(offset + 66, $amt17, value);
	}
	
	/**
	 * 金額１７. Amount 17.<p>
	 *
	 */
	public void amt17(double value) {
		setConstNumber(offset + 66, $amt17, value);
	}
	
	/**
	 * 標準１７. Standard 17.<p>
	 *
	 */
	public MCNumber std17() {
		return getConstNumber(offset + 67, $std17);
	}

	/**
	 * 標準１７. Standard 17.<p>
	 *
	 */
	public void std17(MCNumber value) {
		setConstNumber(offset + 67, $std17, value);
	}
	
	/**
	 * 標準１７. Standard 17.<p>
	 *
	 */
	public void std17(int value) {
		setConstNumber(offset + 67, $std17, value);
	}
	
	/**
	 * 標準１７. Standard 17.<p>
	 *
	 */
	public void std17(long value) {
		setConstNumber(offset + 67, $std17, value);
	}
	
	/**
	 * 標準１７. Standard 17.<p>
	 *
	 */
	public void std17(float value) {
		setConstNumber(offset + 67, $std17, value);
	}
	
	/**
	 * 標準１７. Standard 17.<p>
	 *
	 */
	public void std17(double value) {
		setConstNumber(offset + 67, $std17, value);
	}
	
	/**
	 * 数量１８. Quantity 18.<p>
	 *
	 */
	public MCNumber qty18() {
		return getConstNumber(offset + 68, $qty18);
	}

	/**
	 * 数量１８. Quantity 18.<p>
	 *
	 */
	public void qty18(MCNumber value) {
		setConstNumber(offset + 68, $qty18, value);
	}
	
	/**
	 * 数量１８. Quantity 18.<p>
	 *
	 */
	public void qty18(int value) {
		setConstNumber(offset + 68, $qty18, value);
	}
	
	/**
	 * 数量１８. Quantity 18.<p>
	 *
	 */
	public void qty18(long value) {
		setConstNumber(offset + 68, $qty18, value);
	}
	
	/**
	 * 数量１８. Quantity 18.<p>
	 *
	 */
	public void qty18(float value) {
		setConstNumber(offset + 68, $qty18, value);
	}
	
	/**
	 * 数量１８. Quantity 18.<p>
	 *
	 */
	public void qty18(double value) {
		setConstNumber(offset + 68, $qty18, value);
	}
	
	/**
	 * 金額１８. Amount 18.<p>
	 *
	 */
	public MCNumber amt18() {
		return getConstNumber(offset + 69, $amt18);
	}

	/**
	 * 金額１８. Amount 18.<p>
	 *
	 */
	public void amt18(MCNumber value) {
		setConstNumber(offset + 69, $amt18, value);
	}
	
	/**
	 * 金額１８. Amount 18.<p>
	 *
	 */
	public void amt18(int value) {
		setConstNumber(offset + 69, $amt18, value);
	}
	
	/**
	 * 金額１８. Amount 18.<p>
	 *
	 */
	public void amt18(long value) {
		setConstNumber(offset + 69, $amt18, value);
	}
	
	/**
	 * 金額１８. Amount 18.<p>
	 *
	 */
	public void amt18(float value) {
		setConstNumber(offset + 69, $amt18, value);
	}
	
	/**
	 * 金額１８. Amount 18.<p>
	 *
	 */
	public void amt18(double value) {
		setConstNumber(offset + 69, $amt18, value);
	}
	
	/**
	 * 標準１８. Standard 18.<p>
	 *
	 */
	public MCNumber std18() {
		return getConstNumber(offset + 70, $std18);
	}

	/**
	 * 標準１８. Standard 18.<p>
	 *
	 */
	public void std18(MCNumber value) {
		setConstNumber(offset + 70, $std18, value);
	}
	
	/**
	 * 標準１８. Standard 18.<p>
	 *
	 */
	public void std18(int value) {
		setConstNumber(offset + 70, $std18, value);
	}
	
	/**
	 * 標準１８. Standard 18.<p>
	 *
	 */
	public void std18(long value) {
		setConstNumber(offset + 70, $std18, value);
	}
	
	/**
	 * 標準１８. Standard 18.<p>
	 *
	 */
	public void std18(float value) {
		setConstNumber(offset + 70, $std18, value);
	}
	
	/**
	 * 標準１８. Standard 18.<p>
	 *
	 */
	public void std18(double value) {
		setConstNumber(offset + 70, $std18, value);
	}
	
	/**
	 * 数量１９. Quantity 19.<p>
	 *
	 */
	public MCNumber qty19() {
		return getConstNumber(offset + 71, $qty19);
	}

	/**
	 * 数量１９. Quantity 19.<p>
	 *
	 */
	public void qty19(MCNumber value) {
		setConstNumber(offset + 71, $qty19, value);
	}
	
	/**
	 * 数量１９. Quantity 19.<p>
	 *
	 */
	public void qty19(int value) {
		setConstNumber(offset + 71, $qty19, value);
	}
	
	/**
	 * 数量１９. Quantity 19.<p>
	 *
	 */
	public void qty19(long value) {
		setConstNumber(offset + 71, $qty19, value);
	}
	
	/**
	 * 数量１９. Quantity 19.<p>
	 *
	 */
	public void qty19(float value) {
		setConstNumber(offset + 71, $qty19, value);
	}
	
	/**
	 * 数量１９. Quantity 19.<p>
	 *
	 */
	public void qty19(double value) {
		setConstNumber(offset + 71, $qty19, value);
	}
	
	/**
	 * 金額１９. Amount 19.<p>
	 *
	 */
	public MCNumber amt19() {
		return getConstNumber(offset + 72, $amt19);
	}

	/**
	 * 金額１９. Amount 19.<p>
	 *
	 */
	public void amt19(MCNumber value) {
		setConstNumber(offset + 72, $amt19, value);
	}
	
	/**
	 * 金額１９. Amount 19.<p>
	 *
	 */
	public void amt19(int value) {
		setConstNumber(offset + 72, $amt19, value);
	}
	
	/**
	 * 金額１９. Amount 19.<p>
	 *
	 */
	public void amt19(long value) {
		setConstNumber(offset + 72, $amt19, value);
	}
	
	/**
	 * 金額１９. Amount 19.<p>
	 *
	 */
	public void amt19(float value) {
		setConstNumber(offset + 72, $amt19, value);
	}
	
	/**
	 * 金額１９. Amount 19.<p>
	 *
	 */
	public void amt19(double value) {
		setConstNumber(offset + 72, $amt19, value);
	}
	
	/**
	 * 標準１９. Standard 19.<p>
	 *
	 */
	public MCNumber std19() {
		return getConstNumber(offset + 73, $std19);
	}

	/**
	 * 標準１９. Standard 19.<p>
	 *
	 */
	public void std19(MCNumber value) {
		setConstNumber(offset + 73, $std19, value);
	}
	
	/**
	 * 標準１９. Standard 19.<p>
	 *
	 */
	public void std19(int value) {
		setConstNumber(offset + 73, $std19, value);
	}
	
	/**
	 * 標準１９. Standard 19.<p>
	 *
	 */
	public void std19(long value) {
		setConstNumber(offset + 73, $std19, value);
	}
	
	/**
	 * 標準１９. Standard 19.<p>
	 *
	 */
	public void std19(float value) {
		setConstNumber(offset + 73, $std19, value);
	}
	
	/**
	 * 標準１９. Standard 19.<p>
	 *
	 */
	public void std19(double value) {
		setConstNumber(offset + 73, $std19, value);
	}
	
	/**
	 * 数量２０. Quantity 20.<p>
	 *
	 */
	public MCNumber qty20() {
		return getConstNumber(offset + 74, $qty20);
	}

	/**
	 * 数量２０. Quantity 20.<p>
	 *
	 */
	public void qty20(MCNumber value) {
		setConstNumber(offset + 74, $qty20, value);
	}
	
	/**
	 * 数量２０. Quantity 20.<p>
	 *
	 */
	public void qty20(int value) {
		setConstNumber(offset + 74, $qty20, value);
	}
	
	/**
	 * 数量２０. Quantity 20.<p>
	 *
	 */
	public void qty20(long value) {
		setConstNumber(offset + 74, $qty20, value);
	}
	
	/**
	 * 数量２０. Quantity 20.<p>
	 *
	 */
	public void qty20(float value) {
		setConstNumber(offset + 74, $qty20, value);
	}
	
	/**
	 * 数量２０. Quantity 20.<p>
	 *
	 */
	public void qty20(double value) {
		setConstNumber(offset + 74, $qty20, value);
	}
	
	/**
	 * 金額２０. Amount 20.<p>
	 *
	 */
	public MCNumber amt20() {
		return getConstNumber(offset + 75, $amt20);
	}

	/**
	 * 金額２０. Amount 20.<p>
	 *
	 */
	public void amt20(MCNumber value) {
		setConstNumber(offset + 75, $amt20, value);
	}
	
	/**
	 * 金額２０. Amount 20.<p>
	 *
	 */
	public void amt20(int value) {
		setConstNumber(offset + 75, $amt20, value);
	}
	
	/**
	 * 金額２０. Amount 20.<p>
	 *
	 */
	public void amt20(long value) {
		setConstNumber(offset + 75, $amt20, value);
	}
	
	/**
	 * 金額２０. Amount 20.<p>
	 *
	 */
	public void amt20(float value) {
		setConstNumber(offset + 75, $amt20, value);
	}
	
	/**
	 * 金額２０. Amount 20.<p>
	 *
	 */
	public void amt20(double value) {
		setConstNumber(offset + 75, $amt20, value);
	}
	
	/**
	 * 標準２０. Standard 20.<p>
	 *
	 */
	public MCNumber std20() {
		return getConstNumber(offset + 76, $std20);
	}

	/**
	 * 標準２０. Standard 20.<p>
	 *
	 */
	public void std20(MCNumber value) {
		setConstNumber(offset + 76, $std20, value);
	}
	
	/**
	 * 標準２０. Standard 20.<p>
	 *
	 */
	public void std20(int value) {
		setConstNumber(offset + 76, $std20, value);
	}
	
	/**
	 * 標準２０. Standard 20.<p>
	 *
	 */
	public void std20(long value) {
		setConstNumber(offset + 76, $std20, value);
	}
	
	/**
	 * 標準２０. Standard 20.<p>
	 *
	 */
	public void std20(float value) {
		setConstNumber(offset + 76, $std20, value);
	}
	
	/**
	 * 標準２０. Standard 20.<p>
	 *
	 */
	public void std20(double value) {
		setConstNumber(offset + 76, $std20, value);
	}
	
	/**
	 * 数量２１. Quantity 21.<p>
	 *
	 */
	public MCNumber qty21() {
		return getConstNumber(offset + 77, $qty21);
	}

	/**
	 * 数量２１. Quantity 21.<p>
	 *
	 */
	public void qty21(MCNumber value) {
		setConstNumber(offset + 77, $qty21, value);
	}
	
	/**
	 * 数量２１. Quantity 21.<p>
	 *
	 */
	public void qty21(int value) {
		setConstNumber(offset + 77, $qty21, value);
	}
	
	/**
	 * 数量２１. Quantity 21.<p>
	 *
	 */
	public void qty21(long value) {
		setConstNumber(offset + 77, $qty21, value);
	}
	
	/**
	 * 数量２１. Quantity 21.<p>
	 *
	 */
	public void qty21(float value) {
		setConstNumber(offset + 77, $qty21, value);
	}
	
	/**
	 * 数量２１. Quantity 21.<p>
	 *
	 */
	public void qty21(double value) {
		setConstNumber(offset + 77, $qty21, value);
	}
	
	/**
	 * 金額２１. Amount 21.<p>
	 *
	 */
	public MCNumber amt21() {
		return getConstNumber(offset + 78, $amt21);
	}

	/**
	 * 金額２１. Amount 21.<p>
	 *
	 */
	public void amt21(MCNumber value) {
		setConstNumber(offset + 78, $amt21, value);
	}
	
	/**
	 * 金額２１. Amount 21.<p>
	 *
	 */
	public void amt21(int value) {
		setConstNumber(offset + 78, $amt21, value);
	}
	
	/**
	 * 金額２１. Amount 21.<p>
	 *
	 */
	public void amt21(long value) {
		setConstNumber(offset + 78, $amt21, value);
	}
	
	/**
	 * 金額２１. Amount 21.<p>
	 *
	 */
	public void amt21(float value) {
		setConstNumber(offset + 78, $amt21, value);
	}
	
	/**
	 * 金額２１. Amount 21.<p>
	 *
	 */
	public void amt21(double value) {
		setConstNumber(offset + 78, $amt21, value);
	}
	
	/**
	 * 標準２１. Standard 21.<p>
	 *
	 */
	public MCNumber std21() {
		return getConstNumber(offset + 79, $std21);
	}

	/**
	 * 標準２１. Standard 21.<p>
	 *
	 */
	public void std21(MCNumber value) {
		setConstNumber(offset + 79, $std21, value);
	}
	
	/**
	 * 標準２１. Standard 21.<p>
	 *
	 */
	public void std21(int value) {
		setConstNumber(offset + 79, $std21, value);
	}
	
	/**
	 * 標準２１. Standard 21.<p>
	 *
	 */
	public void std21(long value) {
		setConstNumber(offset + 79, $std21, value);
	}
	
	/**
	 * 標準２１. Standard 21.<p>
	 *
	 */
	public void std21(float value) {
		setConstNumber(offset + 79, $std21, value);
	}
	
	/**
	 * 標準２１. Standard 21.<p>
	 *
	 */
	public void std21(double value) {
		setConstNumber(offset + 79, $std21, value);
	}
	
	/**
	 * 数量２２. Quantity 22.<p>
	 *
	 */
	public MCNumber qty22() {
		return getConstNumber(offset + 80, $qty22);
	}

	/**
	 * 数量２２. Quantity 22.<p>
	 *
	 */
	public void qty22(MCNumber value) {
		setConstNumber(offset + 80, $qty22, value);
	}
	
	/**
	 * 数量２２. Quantity 22.<p>
	 *
	 */
	public void qty22(int value) {
		setConstNumber(offset + 80, $qty22, value);
	}
	
	/**
	 * 数量２２. Quantity 22.<p>
	 *
	 */
	public void qty22(long value) {
		setConstNumber(offset + 80, $qty22, value);
	}
	
	/**
	 * 数量２２. Quantity 22.<p>
	 *
	 */
	public void qty22(float value) {
		setConstNumber(offset + 80, $qty22, value);
	}
	
	/**
	 * 数量２２. Quantity 22.<p>
	 *
	 */
	public void qty22(double value) {
		setConstNumber(offset + 80, $qty22, value);
	}
	
	/**
	 * 金額２２. Amount 22.<p>
	 *
	 */
	public MCNumber amt22() {
		return getConstNumber(offset + 81, $amt22);
	}

	/**
	 * 金額２２. Amount 22.<p>
	 *
	 */
	public void amt22(MCNumber value) {
		setConstNumber(offset + 81, $amt22, value);
	}
	
	/**
	 * 金額２２. Amount 22.<p>
	 *
	 */
	public void amt22(int value) {
		setConstNumber(offset + 81, $amt22, value);
	}
	
	/**
	 * 金額２２. Amount 22.<p>
	 *
	 */
	public void amt22(long value) {
		setConstNumber(offset + 81, $amt22, value);
	}
	
	/**
	 * 金額２２. Amount 22.<p>
	 *
	 */
	public void amt22(float value) {
		setConstNumber(offset + 81, $amt22, value);
	}
	
	/**
	 * 金額２２. Amount 22.<p>
	 *
	 */
	public void amt22(double value) {
		setConstNumber(offset + 81, $amt22, value);
	}
	
	/**
	 * 標準２２. Standard 22.<p>
	 *
	 */
	public MCNumber std22() {
		return getConstNumber(offset + 82, $std22);
	}

	/**
	 * 標準２２. Standard 22.<p>
	 *
	 */
	public void std22(MCNumber value) {
		setConstNumber(offset + 82, $std22, value);
	}
	
	/**
	 * 標準２２. Standard 22.<p>
	 *
	 */
	public void std22(int value) {
		setConstNumber(offset + 82, $std22, value);
	}
	
	/**
	 * 標準２２. Standard 22.<p>
	 *
	 */
	public void std22(long value) {
		setConstNumber(offset + 82, $std22, value);
	}
	
	/**
	 * 標準２２. Standard 22.<p>
	 *
	 */
	public void std22(float value) {
		setConstNumber(offset + 82, $std22, value);
	}
	
	/**
	 * 標準２２. Standard 22.<p>
	 *
	 */
	public void std22(double value) {
		setConstNumber(offset + 82, $std22, value);
	}
	
	/**
	 * 数量２３. Quantity 23.<p>
	 *
	 */
	public MCNumber qty23() {
		return getConstNumber(offset + 83, $qty23);
	}

	/**
	 * 数量２３. Quantity 23.<p>
	 *
	 */
	public void qty23(MCNumber value) {
		setConstNumber(offset + 83, $qty23, value);
	}
	
	/**
	 * 数量２３. Quantity 23.<p>
	 *
	 */
	public void qty23(int value) {
		setConstNumber(offset + 83, $qty23, value);
	}
	
	/**
	 * 数量２３. Quantity 23.<p>
	 *
	 */
	public void qty23(long value) {
		setConstNumber(offset + 83, $qty23, value);
	}
	
	/**
	 * 数量２３. Quantity 23.<p>
	 *
	 */
	public void qty23(float value) {
		setConstNumber(offset + 83, $qty23, value);
	}
	
	/**
	 * 数量２３. Quantity 23.<p>
	 *
	 */
	public void qty23(double value) {
		setConstNumber(offset + 83, $qty23, value);
	}
	
	/**
	 * 金額２３. Amount 23.<p>
	 *
	 */
	public MCNumber amt23() {
		return getConstNumber(offset + 84, $amt23);
	}

	/**
	 * 金額２３. Amount 23.<p>
	 *
	 */
	public void amt23(MCNumber value) {
		setConstNumber(offset + 84, $amt23, value);
	}
	
	/**
	 * 金額２３. Amount 23.<p>
	 *
	 */
	public void amt23(int value) {
		setConstNumber(offset + 84, $amt23, value);
	}
	
	/**
	 * 金額２３. Amount 23.<p>
	 *
	 */
	public void amt23(long value) {
		setConstNumber(offset + 84, $amt23, value);
	}
	
	/**
	 * 金額２３. Amount 23.<p>
	 *
	 */
	public void amt23(float value) {
		setConstNumber(offset + 84, $amt23, value);
	}
	
	/**
	 * 金額２３. Amount 23.<p>
	 *
	 */
	public void amt23(double value) {
		setConstNumber(offset + 84, $amt23, value);
	}
	
	/**
	 * 標準２３. Standard 23.<p>
	 *
	 */
	public MCNumber std23() {
		return getConstNumber(offset + 85, $std23);
	}

	/**
	 * 標準２３. Standard 23.<p>
	 *
	 */
	public void std23(MCNumber value) {
		setConstNumber(offset + 85, $std23, value);
	}
	
	/**
	 * 標準２３. Standard 23.<p>
	 *
	 */
	public void std23(int value) {
		setConstNumber(offset + 85, $std23, value);
	}
	
	/**
	 * 標準２３. Standard 23.<p>
	 *
	 */
	public void std23(long value) {
		setConstNumber(offset + 85, $std23, value);
	}
	
	/**
	 * 標準２３. Standard 23.<p>
	 *
	 */
	public void std23(float value) {
		setConstNumber(offset + 85, $std23, value);
	}
	
	/**
	 * 標準２３. Standard 23.<p>
	 *
	 */
	public void std23(double value) {
		setConstNumber(offset + 85, $std23, value);
	}
	
	/**
	 * 数量２４. Quantity 24.<p>
	 *
	 */
	public MCNumber qty24() {
		return getConstNumber(offset + 86, $qty24);
	}

	/**
	 * 数量２４. Quantity 24.<p>
	 *
	 */
	public void qty24(MCNumber value) {
		setConstNumber(offset + 86, $qty24, value);
	}
	
	/**
	 * 数量２４. Quantity 24.<p>
	 *
	 */
	public void qty24(int value) {
		setConstNumber(offset + 86, $qty24, value);
	}
	
	/**
	 * 数量２４. Quantity 24.<p>
	 *
	 */
	public void qty24(long value) {
		setConstNumber(offset + 86, $qty24, value);
	}
	
	/**
	 * 数量２４. Quantity 24.<p>
	 *
	 */
	public void qty24(float value) {
		setConstNumber(offset + 86, $qty24, value);
	}
	
	/**
	 * 数量２４. Quantity 24.<p>
	 *
	 */
	public void qty24(double value) {
		setConstNumber(offset + 86, $qty24, value);
	}
	
	/**
	 * 金額２４. Amount 24.<p>
	 *
	 */
	public MCNumber amt24() {
		return getConstNumber(offset + 87, $amt24);
	}

	/**
	 * 金額２４. Amount 24.<p>
	 *
	 */
	public void amt24(MCNumber value) {
		setConstNumber(offset + 87, $amt24, value);
	}
	
	/**
	 * 金額２４. Amount 24.<p>
	 *
	 */
	public void amt24(int value) {
		setConstNumber(offset + 87, $amt24, value);
	}
	
	/**
	 * 金額２４. Amount 24.<p>
	 *
	 */
	public void amt24(long value) {
		setConstNumber(offset + 87, $amt24, value);
	}
	
	/**
	 * 金額２４. Amount 24.<p>
	 *
	 */
	public void amt24(float value) {
		setConstNumber(offset + 87, $amt24, value);
	}
	
	/**
	 * 金額２４. Amount 24.<p>
	 *
	 */
	public void amt24(double value) {
		setConstNumber(offset + 87, $amt24, value);
	}
	
	/**
	 * 標準２４. Standard 24.<p>
	 *
	 */
	public MCNumber std24() {
		return getConstNumber(offset + 88, $std24);
	}

	/**
	 * 標準２４. Standard 24.<p>
	 *
	 */
	public void std24(MCNumber value) {
		setConstNumber(offset + 88, $std24, value);
	}
	
	/**
	 * 標準２４. Standard 24.<p>
	 *
	 */
	public void std24(int value) {
		setConstNumber(offset + 88, $std24, value);
	}
	
	/**
	 * 標準２４. Standard 24.<p>
	 *
	 */
	public void std24(long value) {
		setConstNumber(offset + 88, $std24, value);
	}
	
	/**
	 * 標準２４. Standard 24.<p>
	 *
	 */
	public void std24(float value) {
		setConstNumber(offset + 88, $std24, value);
	}
	
	/**
	 * 標準２４. Standard 24.<p>
	 *
	 */
	public void std24(double value) {
		setConstNumber(offset + 88, $std24, value);
	}
	
	/**
	 * 数量２５. Quantity 25.<p>
	 *
	 */
	public MCNumber qty25() {
		return getConstNumber(offset + 89, $qty25);
	}

	/**
	 * 数量２５. Quantity 25.<p>
	 *
	 */
	public void qty25(MCNumber value) {
		setConstNumber(offset + 89, $qty25, value);
	}
	
	/**
	 * 数量２５. Quantity 25.<p>
	 *
	 */
	public void qty25(int value) {
		setConstNumber(offset + 89, $qty25, value);
	}
	
	/**
	 * 数量２５. Quantity 25.<p>
	 *
	 */
	public void qty25(long value) {
		setConstNumber(offset + 89, $qty25, value);
	}
	
	/**
	 * 数量２５. Quantity 25.<p>
	 *
	 */
	public void qty25(float value) {
		setConstNumber(offset + 89, $qty25, value);
	}
	
	/**
	 * 数量２５. Quantity 25.<p>
	 *
	 */
	public void qty25(double value) {
		setConstNumber(offset + 89, $qty25, value);
	}
	
	/**
	 * 金額２５. Amount 25.<p>
	 *
	 */
	public MCNumber amt25() {
		return getConstNumber(offset + 90, $amt25);
	}

	/**
	 * 金額２５. Amount 25.<p>
	 *
	 */
	public void amt25(MCNumber value) {
		setConstNumber(offset + 90, $amt25, value);
	}
	
	/**
	 * 金額２５. Amount 25.<p>
	 *
	 */
	public void amt25(int value) {
		setConstNumber(offset + 90, $amt25, value);
	}
	
	/**
	 * 金額２５. Amount 25.<p>
	 *
	 */
	public void amt25(long value) {
		setConstNumber(offset + 90, $amt25, value);
	}
	
	/**
	 * 金額２５. Amount 25.<p>
	 *
	 */
	public void amt25(float value) {
		setConstNumber(offset + 90, $amt25, value);
	}
	
	/**
	 * 金額２５. Amount 25.<p>
	 *
	 */
	public void amt25(double value) {
		setConstNumber(offset + 90, $amt25, value);
	}
	
	/**
	 * 標準２５. Standard 25.<p>
	 *
	 */
	public MCNumber std25() {
		return getConstNumber(offset + 91, $std25);
	}

	/**
	 * 標準２５. Standard 25.<p>
	 *
	 */
	public void std25(MCNumber value) {
		setConstNumber(offset + 91, $std25, value);
	}
	
	/**
	 * 標準２５. Standard 25.<p>
	 *
	 */
	public void std25(int value) {
		setConstNumber(offset + 91, $std25, value);
	}
	
	/**
	 * 標準２５. Standard 25.<p>
	 *
	 */
	public void std25(long value) {
		setConstNumber(offset + 91, $std25, value);
	}
	
	/**
	 * 標準２５. Standard 25.<p>
	 *
	 */
	public void std25(float value) {
		setConstNumber(offset + 91, $std25, value);
	}
	
	/**
	 * 標準２５. Standard 25.<p>
	 *
	 */
	public void std25(double value) {
		setConstNumber(offset + 91, $std25, value);
	}
	
	/**
	 * 数量２６. Quantity 26.<p>
	 *
	 */
	public MCNumber qty26() {
		return getConstNumber(offset + 92, $qty26);
	}

	/**
	 * 数量２６. Quantity 26.<p>
	 *
	 */
	public void qty26(MCNumber value) {
		setConstNumber(offset + 92, $qty26, value);
	}
	
	/**
	 * 数量２６. Quantity 26.<p>
	 *
	 */
	public void qty26(int value) {
		setConstNumber(offset + 92, $qty26, value);
	}
	
	/**
	 * 数量２６. Quantity 26.<p>
	 *
	 */
	public void qty26(long value) {
		setConstNumber(offset + 92, $qty26, value);
	}
	
	/**
	 * 数量２６. Quantity 26.<p>
	 *
	 */
	public void qty26(float value) {
		setConstNumber(offset + 92, $qty26, value);
	}
	
	/**
	 * 数量２６. Quantity 26.<p>
	 *
	 */
	public void qty26(double value) {
		setConstNumber(offset + 92, $qty26, value);
	}
	
	/**
	 * 金額２６. Amount 26.<p>
	 *
	 */
	public MCNumber amt26() {
		return getConstNumber(offset + 93, $amt26);
	}

	/**
	 * 金額２６. Amount 26.<p>
	 *
	 */
	public void amt26(MCNumber value) {
		setConstNumber(offset + 93, $amt26, value);
	}
	
	/**
	 * 金額２６. Amount 26.<p>
	 *
	 */
	public void amt26(int value) {
		setConstNumber(offset + 93, $amt26, value);
	}
	
	/**
	 * 金額２６. Amount 26.<p>
	 *
	 */
	public void amt26(long value) {
		setConstNumber(offset + 93, $amt26, value);
	}
	
	/**
	 * 金額２６. Amount 26.<p>
	 *
	 */
	public void amt26(float value) {
		setConstNumber(offset + 93, $amt26, value);
	}
	
	/**
	 * 金額２６. Amount 26.<p>
	 *
	 */
	public void amt26(double value) {
		setConstNumber(offset + 93, $amt26, value);
	}
	
	/**
	 * 標準２６. Standard 26.<p>
	 *
	 */
	public MCNumber std26() {
		return getConstNumber(offset + 94, $std26);
	}

	/**
	 * 標準２６. Standard 26.<p>
	 *
	 */
	public void std26(MCNumber value) {
		setConstNumber(offset + 94, $std26, value);
	}
	
	/**
	 * 標準２６. Standard 26.<p>
	 *
	 */
	public void std26(int value) {
		setConstNumber(offset + 94, $std26, value);
	}
	
	/**
	 * 標準２６. Standard 26.<p>
	 *
	 */
	public void std26(long value) {
		setConstNumber(offset + 94, $std26, value);
	}
	
	/**
	 * 標準２６. Standard 26.<p>
	 *
	 */
	public void std26(float value) {
		setConstNumber(offset + 94, $std26, value);
	}
	
	/**
	 * 標準２６. Standard 26.<p>
	 *
	 */
	public void std26(double value) {
		setConstNumber(offset + 94, $std26, value);
	}
	
	/**
	 * 数量２７. Quantity 27.<p>
	 *
	 */
	public MCNumber qty27() {
		return getConstNumber(offset + 95, $qty27);
	}

	/**
	 * 数量２７. Quantity 27.<p>
	 *
	 */
	public void qty27(MCNumber value) {
		setConstNumber(offset + 95, $qty27, value);
	}
	
	/**
	 * 数量２７. Quantity 27.<p>
	 *
	 */
	public void qty27(int value) {
		setConstNumber(offset + 95, $qty27, value);
	}
	
	/**
	 * 数量２７. Quantity 27.<p>
	 *
	 */
	public void qty27(long value) {
		setConstNumber(offset + 95, $qty27, value);
	}
	
	/**
	 * 数量２７. Quantity 27.<p>
	 *
	 */
	public void qty27(float value) {
		setConstNumber(offset + 95, $qty27, value);
	}
	
	/**
	 * 数量２７. Quantity 27.<p>
	 *
	 */
	public void qty27(double value) {
		setConstNumber(offset + 95, $qty27, value);
	}
	
	/**
	 * 金額２７. Amount 27.<p>
	 *
	 */
	public MCNumber amt27() {
		return getConstNumber(offset + 96, $amt27);
	}

	/**
	 * 金額２７. Amount 27.<p>
	 *
	 */
	public void amt27(MCNumber value) {
		setConstNumber(offset + 96, $amt27, value);
	}
	
	/**
	 * 金額２７. Amount 27.<p>
	 *
	 */
	public void amt27(int value) {
		setConstNumber(offset + 96, $amt27, value);
	}
	
	/**
	 * 金額２７. Amount 27.<p>
	 *
	 */
	public void amt27(long value) {
		setConstNumber(offset + 96, $amt27, value);
	}
	
	/**
	 * 金額２７. Amount 27.<p>
	 *
	 */
	public void amt27(float value) {
		setConstNumber(offset + 96, $amt27, value);
	}
	
	/**
	 * 金額２７. Amount 27.<p>
	 *
	 */
	public void amt27(double value) {
		setConstNumber(offset + 96, $amt27, value);
	}
	
	/**
	 * 標準２７. Standard 27.<p>
	 *
	 */
	public MCNumber std27() {
		return getConstNumber(offset + 97, $std27);
	}

	/**
	 * 標準２７. Standard 27.<p>
	 *
	 */
	public void std27(MCNumber value) {
		setConstNumber(offset + 97, $std27, value);
	}
	
	/**
	 * 標準２７. Standard 27.<p>
	 *
	 */
	public void std27(int value) {
		setConstNumber(offset + 97, $std27, value);
	}
	
	/**
	 * 標準２７. Standard 27.<p>
	 *
	 */
	public void std27(long value) {
		setConstNumber(offset + 97, $std27, value);
	}
	
	/**
	 * 標準２７. Standard 27.<p>
	 *
	 */
	public void std27(float value) {
		setConstNumber(offset + 97, $std27, value);
	}
	
	/**
	 * 標準２７. Standard 27.<p>
	 *
	 */
	public void std27(double value) {
		setConstNumber(offset + 97, $std27, value);
	}
	
	/**
	 * 数量２８. Quantity 28.<p>
	 *
	 */
	public MCNumber qty28() {
		return getConstNumber(offset + 98, $qty28);
	}

	/**
	 * 数量２８. Quantity 28.<p>
	 *
	 */
	public void qty28(MCNumber value) {
		setConstNumber(offset + 98, $qty28, value);
	}
	
	/**
	 * 数量２８. Quantity 28.<p>
	 *
	 */
	public void qty28(int value) {
		setConstNumber(offset + 98, $qty28, value);
	}
	
	/**
	 * 数量２８. Quantity 28.<p>
	 *
	 */
	public void qty28(long value) {
		setConstNumber(offset + 98, $qty28, value);
	}
	
	/**
	 * 数量２８. Quantity 28.<p>
	 *
	 */
	public void qty28(float value) {
		setConstNumber(offset + 98, $qty28, value);
	}
	
	/**
	 * 数量２８. Quantity 28.<p>
	 *
	 */
	public void qty28(double value) {
		setConstNumber(offset + 98, $qty28, value);
	}
	
	/**
	 * 金額２８. Amount 28.<p>
	 *
	 */
	public MCNumber amt28() {
		return getConstNumber(offset + 99, $amt28);
	}

	/**
	 * 金額２８. Amount 28.<p>
	 *
	 */
	public void amt28(MCNumber value) {
		setConstNumber(offset + 99, $amt28, value);
	}
	
	/**
	 * 金額２８. Amount 28.<p>
	 *
	 */
	public void amt28(int value) {
		setConstNumber(offset + 99, $amt28, value);
	}
	
	/**
	 * 金額２８. Amount 28.<p>
	 *
	 */
	public void amt28(long value) {
		setConstNumber(offset + 99, $amt28, value);
	}
	
	/**
	 * 金額２８. Amount 28.<p>
	 *
	 */
	public void amt28(float value) {
		setConstNumber(offset + 99, $amt28, value);
	}
	
	/**
	 * 金額２８. Amount 28.<p>
	 *
	 */
	public void amt28(double value) {
		setConstNumber(offset + 99, $amt28, value);
	}
	
	/**
	 * 標準２８. Standard 28.<p>
	 *
	 */
	public MCNumber std28() {
		return getConstNumber(offset + 100, $std28);
	}

	/**
	 * 標準２８. Standard 28.<p>
	 *
	 */
	public void std28(MCNumber value) {
		setConstNumber(offset + 100, $std28, value);
	}
	
	/**
	 * 標準２８. Standard 28.<p>
	 *
	 */
	public void std28(int value) {
		setConstNumber(offset + 100, $std28, value);
	}
	
	/**
	 * 標準２８. Standard 28.<p>
	 *
	 */
	public void std28(long value) {
		setConstNumber(offset + 100, $std28, value);
	}
	
	/**
	 * 標準２８. Standard 28.<p>
	 *
	 */
	public void std28(float value) {
		setConstNumber(offset + 100, $std28, value);
	}
	
	/**
	 * 標準２８. Standard 28.<p>
	 *
	 */
	public void std28(double value) {
		setConstNumber(offset + 100, $std28, value);
	}
	
	/**
	 * 数量２９. Quantity 29.<p>
	 *
	 */
	public MCNumber qty29() {
		return getConstNumber(offset + 101, $qty29);
	}

	/**
	 * 数量２９. Quantity 29.<p>
	 *
	 */
	public void qty29(MCNumber value) {
		setConstNumber(offset + 101, $qty29, value);
	}
	
	/**
	 * 数量２９. Quantity 29.<p>
	 *
	 */
	public void qty29(int value) {
		setConstNumber(offset + 101, $qty29, value);
	}
	
	/**
	 * 数量２９. Quantity 29.<p>
	 *
	 */
	public void qty29(long value) {
		setConstNumber(offset + 101, $qty29, value);
	}
	
	/**
	 * 数量２９. Quantity 29.<p>
	 *
	 */
	public void qty29(float value) {
		setConstNumber(offset + 101, $qty29, value);
	}
	
	/**
	 * 数量２９. Quantity 29.<p>
	 *
	 */
	public void qty29(double value) {
		setConstNumber(offset + 101, $qty29, value);
	}
	
	/**
	 * 金額２９. Amount 29.<p>
	 *
	 */
	public MCNumber amt29() {
		return getConstNumber(offset + 102, $amt29);
	}

	/**
	 * 金額２９. Amount 29.<p>
	 *
	 */
	public void amt29(MCNumber value) {
		setConstNumber(offset + 102, $amt29, value);
	}
	
	/**
	 * 金額２９. Amount 29.<p>
	 *
	 */
	public void amt29(int value) {
		setConstNumber(offset + 102, $amt29, value);
	}
	
	/**
	 * 金額２９. Amount 29.<p>
	 *
	 */
	public void amt29(long value) {
		setConstNumber(offset + 102, $amt29, value);
	}
	
	/**
	 * 金額２９. Amount 29.<p>
	 *
	 */
	public void amt29(float value) {
		setConstNumber(offset + 102, $amt29, value);
	}
	
	/**
	 * 金額２９. Amount 29.<p>
	 *
	 */
	public void amt29(double value) {
		setConstNumber(offset + 102, $amt29, value);
	}
	
	/**
	 * 標準２９. Standard 29.<p>
	 *
	 */
	public MCNumber std29() {
		return getConstNumber(offset + 103, $std29);
	}

	/**
	 * 標準２９. Standard 29.<p>
	 *
	 */
	public void std29(MCNumber value) {
		setConstNumber(offset + 103, $std29, value);
	}
	
	/**
	 * 標準２９. Standard 29.<p>
	 *
	 */
	public void std29(int value) {
		setConstNumber(offset + 103, $std29, value);
	}
	
	/**
	 * 標準２９. Standard 29.<p>
	 *
	 */
	public void std29(long value) {
		setConstNumber(offset + 103, $std29, value);
	}
	
	/**
	 * 標準２９. Standard 29.<p>
	 *
	 */
	public void std29(float value) {
		setConstNumber(offset + 103, $std29, value);
	}
	
	/**
	 * 標準２９. Standard 29.<p>
	 *
	 */
	public void std29(double value) {
		setConstNumber(offset + 103, $std29, value);
	}
	
	/**
	 * 数量３０. Quantity 30.<p>
	 *
	 */
	public MCNumber qty30() {
		return getConstNumber(offset + 104, $qty30);
	}

	/**
	 * 数量３０. Quantity 30.<p>
	 *
	 */
	public void qty30(MCNumber value) {
		setConstNumber(offset + 104, $qty30, value);
	}
	
	/**
	 * 数量３０. Quantity 30.<p>
	 *
	 */
	public void qty30(int value) {
		setConstNumber(offset + 104, $qty30, value);
	}
	
	/**
	 * 数量３０. Quantity 30.<p>
	 *
	 */
	public void qty30(long value) {
		setConstNumber(offset + 104, $qty30, value);
	}
	
	/**
	 * 数量３０. Quantity 30.<p>
	 *
	 */
	public void qty30(float value) {
		setConstNumber(offset + 104, $qty30, value);
	}
	
	/**
	 * 数量３０. Quantity 30.<p>
	 *
	 */
	public void qty30(double value) {
		setConstNumber(offset + 104, $qty30, value);
	}
	
	/**
	 * 金額３０. Amount 30.<p>
	 *
	 */
	public MCNumber amt30() {
		return getConstNumber(offset + 105, $amt30);
	}

	/**
	 * 金額３０. Amount 30.<p>
	 *
	 */
	public void amt30(MCNumber value) {
		setConstNumber(offset + 105, $amt30, value);
	}
	
	/**
	 * 金額３０. Amount 30.<p>
	 *
	 */
	public void amt30(int value) {
		setConstNumber(offset + 105, $amt30, value);
	}
	
	/**
	 * 金額３０. Amount 30.<p>
	 *
	 */
	public void amt30(long value) {
		setConstNumber(offset + 105, $amt30, value);
	}
	
	/**
	 * 金額３０. Amount 30.<p>
	 *
	 */
	public void amt30(float value) {
		setConstNumber(offset + 105, $amt30, value);
	}
	
	/**
	 * 金額３０. Amount 30.<p>
	 *
	 */
	public void amt30(double value) {
		setConstNumber(offset + 105, $amt30, value);
	}
	
	/**
	 * 標準３０. Standard 30.<p>
	 *
	 */
	public MCNumber std30() {
		return getConstNumber(offset + 106, $std30);
	}

	/**
	 * 標準３０. Standard 30.<p>
	 *
	 */
	public void std30(MCNumber value) {
		setConstNumber(offset + 106, $std30, value);
	}
	
	/**
	 * 標準３０. Standard 30.<p>
	 *
	 */
	public void std30(int value) {
		setConstNumber(offset + 106, $std30, value);
	}
	
	/**
	 * 標準３０. Standard 30.<p>
	 *
	 */
	public void std30(long value) {
		setConstNumber(offset + 106, $std30, value);
	}
	
	/**
	 * 標準３０. Standard 30.<p>
	 *
	 */
	public void std30(float value) {
		setConstNumber(offset + 106, $std30, value);
	}
	
	/**
	 * 標準３０. Standard 30.<p>
	 *
	 */
	public void std30(double value) {
		setConstNumber(offset + 106, $std30, value);
	}
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public MCNumber diff_qty() {
		return getConstNumber(offset + 107, $diff_qty);
	}

	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public void diff_qty(MCNumber value) {
		setConstNumber(offset + 107, $diff_qty, value);
	}
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public void diff_qty(int value) {
		setConstNumber(offset + 107, $diff_qty, value);
	}
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public void diff_qty(long value) {
		setConstNumber(offset + 107, $diff_qty, value);
	}
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public void diff_qty(float value) {
		setConstNumber(offset + 107, $diff_qty, value);
	}
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public void diff_qty(double value) {
		setConstNumber(offset + 107, $diff_qty, value);
	}
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public MCNumber diff_amt() {
		return getConstNumber(offset + 108, $diff_amt);
	}

	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public void diff_amt(MCNumber value) {
		setConstNumber(offset + 108, $diff_amt, value);
	}
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public void diff_amt(int value) {
		setConstNumber(offset + 108, $diff_amt, value);
	}
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public void diff_amt(long value) {
		setConstNumber(offset + 108, $diff_amt, value);
	}
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public void diff_amt(float value) {
		setConstNumber(offset + 108, $diff_amt, value);
	}
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public void diff_amt(double value) {
		setConstNumber(offset + 108, $diff_amt, value);
	}
	
	/**
	 * 標準差. Standard variance.<p>
	 *
	 */
	public MCNumber diff_std() {
		return getConstNumber(offset + 109, $diff_std);
	}

	/**
	 * 標準差. Standard variance.<p>
	 *
	 */
	public void diff_std(MCNumber value) {
		setConstNumber(offset + 109, $diff_std, value);
	}
	
	/**
	 * 標準差. Standard variance.<p>
	 *
	 */
	public void diff_std(int value) {
		setConstNumber(offset + 109, $diff_std, value);
	}
	
	/**
	 * 標準差. Standard variance.<p>
	 *
	 */
	public void diff_std(long value) {
		setConstNumber(offset + 109, $diff_std, value);
	}
	
	/**
	 * 標準差. Standard variance.<p>
	 *
	 */
	public void diff_std(float value) {
		setConstNumber(offset + 109, $diff_std, value);
	}
	
	/**
	 * 標準差. Standard variance.<p>
	 *
	 */
	public void diff_std(double value) {
		setConstNumber(offset + 109, $diff_std, value);
	}
	
	/**
	 * 総平均単価対象. For weighted average unit price.<p>
	 *
	 */
	public MCNumber ave_tgt() {
		return getConstNumber(offset + 110, $ave_tgt);
	}

	/**
	 * 総平均単価対象. For weighted average unit price.<p>
	 *
	 */
	public void ave_tgt(MCNumber value) {
		setConstNumber(offset + 110, $ave_tgt, value);
	}
	
	/**
	 * 総平均単価対象. For weighted average unit price.<p>
	 *
	 */
	public void ave_tgt(int value) {
		setConstNumber(offset + 110, $ave_tgt, value);
	}
	
	/**
	 * 総平均単価対象. For weighted average unit price.<p>
	 *
	 */
	public void ave_tgt(long value) {
		setConstNumber(offset + 110, $ave_tgt, value);
	}
	
	/**
	 * 総平均単価対象. For weighted average unit price.<p>
	 *
	 */
	public void ave_tgt(float value) {
		setConstNumber(offset + 110, $ave_tgt, value);
	}
	
	/**
	 * 総平均単価対象. For weighted average unit price.<p>
	 *
	 */
	public void ave_tgt(double value) {
		setConstNumber(offset + 110, $ave_tgt, value);
	}
	
	/**
	 * 年月サブ. Year month sub.<p>
	 *
	 */
	public MCDate ym_sub() {
		return getConstDate(offset + 111, $ym_sub);
	}

	/**
	 * 年月サブ. Year month sub.<p>
	 *
	 */
	public void ym_sub(MCDate value) {
		setConstDate(offset + 111, $ym_sub, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 112, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 112, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 113, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 113, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 114, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 114, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 115, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 115, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 116, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 116, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 116, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 116, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 116, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 116, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 117, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 117, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 118, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 118, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 119, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 119, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 120, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 120, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 121, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 121, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
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
		if ($qty01.equalsIgnoreCase(name)) {
			return qty01();
		}
		if ($amt01.equalsIgnoreCase(name)) {
			return amt01();
		}
		if ($std01.equalsIgnoreCase(name)) {
			return std01();
		}
		if ($qty02.equalsIgnoreCase(name)) {
			return qty02();
		}
		if ($amt02.equalsIgnoreCase(name)) {
			return amt02();
		}
		if ($std02.equalsIgnoreCase(name)) {
			return std02();
		}
		if ($qty03.equalsIgnoreCase(name)) {
			return qty03();
		}
		if ($amt03.equalsIgnoreCase(name)) {
			return amt03();
		}
		if ($std03.equalsIgnoreCase(name)) {
			return std03();
		}
		if ($qty04.equalsIgnoreCase(name)) {
			return qty04();
		}
		if ($amt04.equalsIgnoreCase(name)) {
			return amt04();
		}
		if ($std04.equalsIgnoreCase(name)) {
			return std04();
		}
		if ($qty05.equalsIgnoreCase(name)) {
			return qty05();
		}
		if ($amt05.equalsIgnoreCase(name)) {
			return amt05();
		}
		if ($std05.equalsIgnoreCase(name)) {
			return std05();
		}
		if ($qty06.equalsIgnoreCase(name)) {
			return qty06();
		}
		if ($amt06.equalsIgnoreCase(name)) {
			return amt06();
		}
		if ($std06.equalsIgnoreCase(name)) {
			return std06();
		}
		if ($qty07.equalsIgnoreCase(name)) {
			return qty07();
		}
		if ($amt07.equalsIgnoreCase(name)) {
			return amt07();
		}
		if ($std07.equalsIgnoreCase(name)) {
			return std07();
		}
		if ($qty08.equalsIgnoreCase(name)) {
			return qty08();
		}
		if ($amt08.equalsIgnoreCase(name)) {
			return amt08();
		}
		if ($std08.equalsIgnoreCase(name)) {
			return std08();
		}
		if ($qty09.equalsIgnoreCase(name)) {
			return qty09();
		}
		if ($amt09.equalsIgnoreCase(name)) {
			return amt09();
		}
		if ($std09.equalsIgnoreCase(name)) {
			return std09();
		}
		if ($qty10.equalsIgnoreCase(name)) {
			return qty10();
		}
		if ($amt10.equalsIgnoreCase(name)) {
			return amt10();
		}
		if ($std10.equalsIgnoreCase(name)) {
			return std10();
		}
		if ($qty11.equalsIgnoreCase(name)) {
			return qty11();
		}
		if ($amt11.equalsIgnoreCase(name)) {
			return amt11();
		}
		if ($std11.equalsIgnoreCase(name)) {
			return std11();
		}
		if ($qty12.equalsIgnoreCase(name)) {
			return qty12();
		}
		if ($amt12.equalsIgnoreCase(name)) {
			return amt12();
		}
		if ($std12.equalsIgnoreCase(name)) {
			return std12();
		}
		if ($qty13.equalsIgnoreCase(name)) {
			return qty13();
		}
		if ($amt13.equalsIgnoreCase(name)) {
			return amt13();
		}
		if ($std13.equalsIgnoreCase(name)) {
			return std13();
		}
		if ($qty14.equalsIgnoreCase(name)) {
			return qty14();
		}
		if ($amt14.equalsIgnoreCase(name)) {
			return amt14();
		}
		if ($std14.equalsIgnoreCase(name)) {
			return std14();
		}
		if ($qty15.equalsIgnoreCase(name)) {
			return qty15();
		}
		if ($amt15.equalsIgnoreCase(name)) {
			return amt15();
		}
		if ($std15.equalsIgnoreCase(name)) {
			return std15();
		}
		if ($qty16.equalsIgnoreCase(name)) {
			return qty16();
		}
		if ($amt16.equalsIgnoreCase(name)) {
			return amt16();
		}
		if ($std16.equalsIgnoreCase(name)) {
			return std16();
		}
		if ($qty17.equalsIgnoreCase(name)) {
			return qty17();
		}
		if ($amt17.equalsIgnoreCase(name)) {
			return amt17();
		}
		if ($std17.equalsIgnoreCase(name)) {
			return std17();
		}
		if ($qty18.equalsIgnoreCase(name)) {
			return qty18();
		}
		if ($amt18.equalsIgnoreCase(name)) {
			return amt18();
		}
		if ($std18.equalsIgnoreCase(name)) {
			return std18();
		}
		if ($qty19.equalsIgnoreCase(name)) {
			return qty19();
		}
		if ($amt19.equalsIgnoreCase(name)) {
			return amt19();
		}
		if ($std19.equalsIgnoreCase(name)) {
			return std19();
		}
		if ($qty20.equalsIgnoreCase(name)) {
			return qty20();
		}
		if ($amt20.equalsIgnoreCase(name)) {
			return amt20();
		}
		if ($std20.equalsIgnoreCase(name)) {
			return std20();
		}
		if ($qty21.equalsIgnoreCase(name)) {
			return qty21();
		}
		if ($amt21.equalsIgnoreCase(name)) {
			return amt21();
		}
		if ($std21.equalsIgnoreCase(name)) {
			return std21();
		}
		if ($qty22.equalsIgnoreCase(name)) {
			return qty22();
		}
		if ($amt22.equalsIgnoreCase(name)) {
			return amt22();
		}
		if ($std22.equalsIgnoreCase(name)) {
			return std22();
		}
		if ($qty23.equalsIgnoreCase(name)) {
			return qty23();
		}
		if ($amt23.equalsIgnoreCase(name)) {
			return amt23();
		}
		if ($std23.equalsIgnoreCase(name)) {
			return std23();
		}
		if ($qty24.equalsIgnoreCase(name)) {
			return qty24();
		}
		if ($amt24.equalsIgnoreCase(name)) {
			return amt24();
		}
		if ($std24.equalsIgnoreCase(name)) {
			return std24();
		}
		if ($qty25.equalsIgnoreCase(name)) {
			return qty25();
		}
		if ($amt25.equalsIgnoreCase(name)) {
			return amt25();
		}
		if ($std25.equalsIgnoreCase(name)) {
			return std25();
		}
		if ($qty26.equalsIgnoreCase(name)) {
			return qty26();
		}
		if ($amt26.equalsIgnoreCase(name)) {
			return amt26();
		}
		if ($std26.equalsIgnoreCase(name)) {
			return std26();
		}
		if ($qty27.equalsIgnoreCase(name)) {
			return qty27();
		}
		if ($amt27.equalsIgnoreCase(name)) {
			return amt27();
		}
		if ($std27.equalsIgnoreCase(name)) {
			return std27();
		}
		if ($qty28.equalsIgnoreCase(name)) {
			return qty28();
		}
		if ($amt28.equalsIgnoreCase(name)) {
			return amt28();
		}
		if ($std28.equalsIgnoreCase(name)) {
			return std28();
		}
		if ($qty29.equalsIgnoreCase(name)) {
			return qty29();
		}
		if ($amt29.equalsIgnoreCase(name)) {
			return amt29();
		}
		if ($std29.equalsIgnoreCase(name)) {
			return std29();
		}
		if ($qty30.equalsIgnoreCase(name)) {
			return qty30();
		}
		if ($amt30.equalsIgnoreCase(name)) {
			return amt30();
		}
		if ($std30.equalsIgnoreCase(name)) {
			return std30();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			return diff_std();
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			return ave_tgt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ym_sub.equalsIgnoreCase(name)) {
			return ym_sub();
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
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
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
		if ($qty01.equalsIgnoreCase(name)) {
			return qty01();
		}
		if ($amt01.equalsIgnoreCase(name)) {
			return amt01();
		}
		if ($std01.equalsIgnoreCase(name)) {
			return std01();
		}
		if ($qty02.equalsIgnoreCase(name)) {
			return qty02();
		}
		if ($amt02.equalsIgnoreCase(name)) {
			return amt02();
		}
		if ($std02.equalsIgnoreCase(name)) {
			return std02();
		}
		if ($qty03.equalsIgnoreCase(name)) {
			return qty03();
		}
		if ($amt03.equalsIgnoreCase(name)) {
			return amt03();
		}
		if ($std03.equalsIgnoreCase(name)) {
			return std03();
		}
		if ($qty04.equalsIgnoreCase(name)) {
			return qty04();
		}
		if ($amt04.equalsIgnoreCase(name)) {
			return amt04();
		}
		if ($std04.equalsIgnoreCase(name)) {
			return std04();
		}
		if ($qty05.equalsIgnoreCase(name)) {
			return qty05();
		}
		if ($amt05.equalsIgnoreCase(name)) {
			return amt05();
		}
		if ($std05.equalsIgnoreCase(name)) {
			return std05();
		}
		if ($qty06.equalsIgnoreCase(name)) {
			return qty06();
		}
		if ($amt06.equalsIgnoreCase(name)) {
			return amt06();
		}
		if ($std06.equalsIgnoreCase(name)) {
			return std06();
		}
		if ($qty07.equalsIgnoreCase(name)) {
			return qty07();
		}
		if ($amt07.equalsIgnoreCase(name)) {
			return amt07();
		}
		if ($std07.equalsIgnoreCase(name)) {
			return std07();
		}
		if ($qty08.equalsIgnoreCase(name)) {
			return qty08();
		}
		if ($amt08.equalsIgnoreCase(name)) {
			return amt08();
		}
		if ($std08.equalsIgnoreCase(name)) {
			return std08();
		}
		if ($qty09.equalsIgnoreCase(name)) {
			return qty09();
		}
		if ($amt09.equalsIgnoreCase(name)) {
			return amt09();
		}
		if ($std09.equalsIgnoreCase(name)) {
			return std09();
		}
		if ($qty10.equalsIgnoreCase(name)) {
			return qty10();
		}
		if ($amt10.equalsIgnoreCase(name)) {
			return amt10();
		}
		if ($std10.equalsIgnoreCase(name)) {
			return std10();
		}
		if ($qty11.equalsIgnoreCase(name)) {
			return qty11();
		}
		if ($amt11.equalsIgnoreCase(name)) {
			return amt11();
		}
		if ($std11.equalsIgnoreCase(name)) {
			return std11();
		}
		if ($qty12.equalsIgnoreCase(name)) {
			return qty12();
		}
		if ($amt12.equalsIgnoreCase(name)) {
			return amt12();
		}
		if ($std12.equalsIgnoreCase(name)) {
			return std12();
		}
		if ($qty13.equalsIgnoreCase(name)) {
			return qty13();
		}
		if ($amt13.equalsIgnoreCase(name)) {
			return amt13();
		}
		if ($std13.equalsIgnoreCase(name)) {
			return std13();
		}
		if ($qty14.equalsIgnoreCase(name)) {
			return qty14();
		}
		if ($amt14.equalsIgnoreCase(name)) {
			return amt14();
		}
		if ($std14.equalsIgnoreCase(name)) {
			return std14();
		}
		if ($qty15.equalsIgnoreCase(name)) {
			return qty15();
		}
		if ($amt15.equalsIgnoreCase(name)) {
			return amt15();
		}
		if ($std15.equalsIgnoreCase(name)) {
			return std15();
		}
		if ($qty16.equalsIgnoreCase(name)) {
			return qty16();
		}
		if ($amt16.equalsIgnoreCase(name)) {
			return amt16();
		}
		if ($std16.equalsIgnoreCase(name)) {
			return std16();
		}
		if ($qty17.equalsIgnoreCase(name)) {
			return qty17();
		}
		if ($amt17.equalsIgnoreCase(name)) {
			return amt17();
		}
		if ($std17.equalsIgnoreCase(name)) {
			return std17();
		}
		if ($qty18.equalsIgnoreCase(name)) {
			return qty18();
		}
		if ($amt18.equalsIgnoreCase(name)) {
			return amt18();
		}
		if ($std18.equalsIgnoreCase(name)) {
			return std18();
		}
		if ($qty19.equalsIgnoreCase(name)) {
			return qty19();
		}
		if ($amt19.equalsIgnoreCase(name)) {
			return amt19();
		}
		if ($std19.equalsIgnoreCase(name)) {
			return std19();
		}
		if ($qty20.equalsIgnoreCase(name)) {
			return qty20();
		}
		if ($amt20.equalsIgnoreCase(name)) {
			return amt20();
		}
		if ($std20.equalsIgnoreCase(name)) {
			return std20();
		}
		if ($qty21.equalsIgnoreCase(name)) {
			return qty21();
		}
		if ($amt21.equalsIgnoreCase(name)) {
			return amt21();
		}
		if ($std21.equalsIgnoreCase(name)) {
			return std21();
		}
		if ($qty22.equalsIgnoreCase(name)) {
			return qty22();
		}
		if ($amt22.equalsIgnoreCase(name)) {
			return amt22();
		}
		if ($std22.equalsIgnoreCase(name)) {
			return std22();
		}
		if ($qty23.equalsIgnoreCase(name)) {
			return qty23();
		}
		if ($amt23.equalsIgnoreCase(name)) {
			return amt23();
		}
		if ($std23.equalsIgnoreCase(name)) {
			return std23();
		}
		if ($qty24.equalsIgnoreCase(name)) {
			return qty24();
		}
		if ($amt24.equalsIgnoreCase(name)) {
			return amt24();
		}
		if ($std24.equalsIgnoreCase(name)) {
			return std24();
		}
		if ($qty25.equalsIgnoreCase(name)) {
			return qty25();
		}
		if ($amt25.equalsIgnoreCase(name)) {
			return amt25();
		}
		if ($std25.equalsIgnoreCase(name)) {
			return std25();
		}
		if ($qty26.equalsIgnoreCase(name)) {
			return qty26();
		}
		if ($amt26.equalsIgnoreCase(name)) {
			return amt26();
		}
		if ($std26.equalsIgnoreCase(name)) {
			return std26();
		}
		if ($qty27.equalsIgnoreCase(name)) {
			return qty27();
		}
		if ($amt27.equalsIgnoreCase(name)) {
			return amt27();
		}
		if ($std27.equalsIgnoreCase(name)) {
			return std27();
		}
		if ($qty28.equalsIgnoreCase(name)) {
			return qty28();
		}
		if ($amt28.equalsIgnoreCase(name)) {
			return amt28();
		}
		if ($std28.equalsIgnoreCase(name)) {
			return std28();
		}
		if ($qty29.equalsIgnoreCase(name)) {
			return qty29();
		}
		if ($amt29.equalsIgnoreCase(name)) {
			return amt29();
		}
		if ($std29.equalsIgnoreCase(name)) {
			return std29();
		}
		if ($qty30.equalsIgnoreCase(name)) {
			return qty30();
		}
		if ($amt30.equalsIgnoreCase(name)) {
			return amt30();
		}
		if ($std30.equalsIgnoreCase(name)) {
			return std30();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			return diff_std();
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			return ave_tgt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ym_sub.equalsIgnoreCase(name)) {
			return ym_sub();
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
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ym_sub.equalsIgnoreCase(name)) {
			ym_sub(value);
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
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ym_sub.equalsIgnoreCase(name)) {
			ym_sub(value);
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
