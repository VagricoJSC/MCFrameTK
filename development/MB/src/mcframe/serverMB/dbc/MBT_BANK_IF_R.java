package mcframe.serverMB.dbc;

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
 * "銀行マスタ受信ＩＦ // Bank master import IF"DBコンテナRowクラスです。<p>
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
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>データ更新区分</td>
 *  	<td>Data update type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_sys_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムＣＤ</td>
 *  	<td>External system cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムデータＮＯ</td>
 *  	<td>External system data No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_data_lno</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムデータ行ＮＯ</td>
 *  	<td>External system data row No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_make_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送信元レコード作成日時</td>
 *  	<td>Creation date and time of source record</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取込対象ＦＬＧ</td>
 *  	<td>To import flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bank_cd</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>銀行ＣＤ</td>
 *  	<td>Bank cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bank_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>銀行名</td>
 *  	<td>Bank name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bank_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>銀行名_ロケール１</td>
 *  	<td>Bank name_locale1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bank_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>銀行名_ロケール２</td>
 *  	<td>Bank name_locale2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bank_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>銀行名_ロケール３</td>
 *  	<td>Bank name_locale3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>カレンダＣＤ</td>
 *  	<td>Calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１</td>
 *  	<td>IF spare CHAR column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２</td>
 *  	<td>IF spare CHAR column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目３</td>
 *  	<td>IF spare CHAR column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目４</td>
 *  	<td>IF spare CHAR column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目５</td>
 *  	<td>IF spare CHAR column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目６</td>
 *  	<td>IF spare CHAR column 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目７</td>
 *  	<td>IF spare CHAR column 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目８</td>
 *  	<td>IF spare CHAR column 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目９</td>
 *  	<td>IF spare CHAR column 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１０</td>
 *  	<td>IF spare CHAR column 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１１</td>
 *  	<td>IF spare CHAR column 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１２</td>
 *  	<td>IF spare CHAR column 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１３</td>
 *  	<td>IF spare CHAR column 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１４</td>
 *  	<td>IF spare CHAR column 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１５</td>
 *  	<td>IF spare CHAR column 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１６</td>
 *  	<td>IF spare CHAR column 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１７</td>
 *  	<td>IF spare CHAR column 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１８</td>
 *  	<td>IF spare CHAR column 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１９</td>
 *  	<td>IF spare CHAR column 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２０</td>
 *  	<td>IF spare CHAR column 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２１</td>
 *  	<td>IF spare CHAR column 21</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２２</td>
 *  	<td>IF spare CHAR column 22</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２３</td>
 *  	<td>IF spare CHAR column 23</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２４</td>
 *  	<td>IF spare CHAR column 24</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２５</td>
 *  	<td>IF spare CHAR column 25</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２６</td>
 *  	<td>IF spare CHAR column 26</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２７</td>
 *  	<td>IF spare CHAR column 27</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２８</td>
 *  	<td>IF spare CHAR column 28</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２９</td>
 *  	<td>IF spare CHAR column 29</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目３０</td>
 *  	<td>IF spare CHAR column 30</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目１</td>
 *  	<td>IF spare NUM column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目２</td>
 *  	<td>IF spare NUM column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目３</td>
 *  	<td>IF spare NUM column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目４</td>
 *  	<td>IF spare NUM column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目５</td>
 *  	<td>IF spare NUM column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目１</td>
 *  	<td>IF spare DATE column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目２</td>
 *  	<td>IF spare DATE column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目３</td>
 *  	<td>IF spare DATE column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目４</td>
 *  	<td>IF spare DATE column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目５</td>
 *  	<td>IF spare DATE column 5</td>
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
 *  	<td>cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>カレンダ名</td>
 *  	<td>Calendar name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBT_BANK_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MBT_BANK_IF";

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
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public static final String $ext_data_no = "ext_data_no";
	private static final MCPermColumnInfo _ext_data_no = createColumnInfo("ext_data_no");
	public final MCNumberPermColumn ext_data_no = createNumberColumn(_ext_data_no);
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public static final String $ext_data_lno = "ext_data_lno";
	private static final MCPermColumnInfo _ext_data_lno = createColumnInfo("ext_data_lno");
	public final MCNumberPermColumn ext_data_lno = createNumberColumn(_ext_data_lno);
	
	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	private static final MCPermColumnInfo _data_make_dt = createColumnInfo("data_make_dt");
	public final MCDatePermColumn data_make_dt = createDateColumn(_data_make_dt);
	
	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public static final String $imp_flg = "imp_flg";
	private static final MCPermColumnInfo _imp_flg = createColumnInfo("imp_flg");
	public final MCBooleanPermColumn imp_flg = createBooleanColumn(_imp_flg);
	
	/**
	 * 銀行ＣＤ. Bank cd..<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	private static final MCPermColumnInfo _bank_cd = createColumnInfo("bank_cd");
	public final MCStringPermColumn bank_cd = createStringColumn(_bank_cd);
	
	/**
	 * 銀行名. Bank name.<p>
	 *
	 */
	public static final String $bank_nm = "bank_nm";
	private static final MCPermColumnInfo _bank_nm = createColumnInfo("bank_nm");
	public final MCStringPermColumn bank_nm = createStringColumn(_bank_nm);
	
	/**
	 * 銀行名_ロケール１. Bank name_locale1.<p>
	 *
	 */
	public static final String $bank_nm_lcl1 = "bank_nm_lcl1";
	private static final MCPermColumnInfo _bank_nm_lcl1 = createColumnInfo("bank_nm_lcl1");
	public final MCStringPermColumn bank_nm_lcl1 = createStringColumn(_bank_nm_lcl1);
	
	/**
	 * 銀行名_ロケール２. Bank name_locale2.<p>
	 *
	 */
	public static final String $bank_nm_lcl2 = "bank_nm_lcl2";
	private static final MCPermColumnInfo _bank_nm_lcl2 = createColumnInfo("bank_nm_lcl2");
	public final MCStringPermColumn bank_nm_lcl2 = createStringColumn(_bank_nm_lcl2);
	
	/**
	 * 銀行名_ロケール３. Bank name_locale3.<p>
	 *
	 */
	public static final String $bank_nm_lcl3 = "bank_nm_lcl3";
	private static final MCPermColumnInfo _bank_nm_lcl3 = createColumnInfo("bank_nm_lcl3");
	public final MCStringPermColumn bank_nm_lcl3 = createStringColumn(_bank_nm_lcl3);
	
	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	private static final MCPermColumnInfo _cal_cd = createColumnInfo("cal_cd");
	public final MCStringPermColumn cal_cd = createStringColumn(_cal_cd);
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	private static final MCPermColumnInfo _memo1 = createColumnInfo("memo1");
	public final MCStringPermColumn memo1 = createStringColumn(_memo1);
	
	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	private static final MCPermColumnInfo _memo2 = createColumnInfo("memo2");
	public final MCStringPermColumn memo2 = createStringColumn(_memo2);
	
	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	private static final MCPermColumnInfo _memo3 = createColumnInfo("memo3");
	public final MCStringPermColumn memo3 = createStringColumn(_memo3);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public static final String $if_sub_char1 = "if_sub_char1";
	private static final MCPermColumnInfo _if_sub_char1 = createColumnInfo("if_sub_char1");
	public final MCStringPermColumn if_sub_char1 = createStringColumn(_if_sub_char1);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public static final String $if_sub_char2 = "if_sub_char2";
	private static final MCPermColumnInfo _if_sub_char2 = createColumnInfo("if_sub_char2");
	public final MCStringPermColumn if_sub_char2 = createStringColumn(_if_sub_char2);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public static final String $if_sub_char3 = "if_sub_char3";
	private static final MCPermColumnInfo _if_sub_char3 = createColumnInfo("if_sub_char3");
	public final MCStringPermColumn if_sub_char3 = createStringColumn(_if_sub_char3);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public static final String $if_sub_char4 = "if_sub_char4";
	private static final MCPermColumnInfo _if_sub_char4 = createColumnInfo("if_sub_char4");
	public final MCStringPermColumn if_sub_char4 = createStringColumn(_if_sub_char4);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public static final String $if_sub_char5 = "if_sub_char5";
	private static final MCPermColumnInfo _if_sub_char5 = createColumnInfo("if_sub_char5");
	public final MCStringPermColumn if_sub_char5 = createStringColumn(_if_sub_char5);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public static final String $if_sub_char6 = "if_sub_char6";
	private static final MCPermColumnInfo _if_sub_char6 = createColumnInfo("if_sub_char6");
	public final MCStringPermColumn if_sub_char6 = createStringColumn(_if_sub_char6);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public static final String $if_sub_char7 = "if_sub_char7";
	private static final MCPermColumnInfo _if_sub_char7 = createColumnInfo("if_sub_char7");
	public final MCStringPermColumn if_sub_char7 = createStringColumn(_if_sub_char7);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public static final String $if_sub_char8 = "if_sub_char8";
	private static final MCPermColumnInfo _if_sub_char8 = createColumnInfo("if_sub_char8");
	public final MCStringPermColumn if_sub_char8 = createStringColumn(_if_sub_char8);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public static final String $if_sub_char9 = "if_sub_char9";
	private static final MCPermColumnInfo _if_sub_char9 = createColumnInfo("if_sub_char9");
	public final MCStringPermColumn if_sub_char9 = createStringColumn(_if_sub_char9);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public static final String $if_sub_char10 = "if_sub_char10";
	private static final MCPermColumnInfo _if_sub_char10 = createColumnInfo("if_sub_char10");
	public final MCStringPermColumn if_sub_char10 = createStringColumn(_if_sub_char10);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public static final String $if_sub_char11 = "if_sub_char11";
	private static final MCPermColumnInfo _if_sub_char11 = createColumnInfo("if_sub_char11");
	public final MCStringPermColumn if_sub_char11 = createStringColumn(_if_sub_char11);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public static final String $if_sub_char12 = "if_sub_char12";
	private static final MCPermColumnInfo _if_sub_char12 = createColumnInfo("if_sub_char12");
	public final MCStringPermColumn if_sub_char12 = createStringColumn(_if_sub_char12);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public static final String $if_sub_char13 = "if_sub_char13";
	private static final MCPermColumnInfo _if_sub_char13 = createColumnInfo("if_sub_char13");
	public final MCStringPermColumn if_sub_char13 = createStringColumn(_if_sub_char13);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public static final String $if_sub_char14 = "if_sub_char14";
	private static final MCPermColumnInfo _if_sub_char14 = createColumnInfo("if_sub_char14");
	public final MCStringPermColumn if_sub_char14 = createStringColumn(_if_sub_char14);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public static final String $if_sub_char15 = "if_sub_char15";
	private static final MCPermColumnInfo _if_sub_char15 = createColumnInfo("if_sub_char15");
	public final MCStringPermColumn if_sub_char15 = createStringColumn(_if_sub_char15);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public static final String $if_sub_char16 = "if_sub_char16";
	private static final MCPermColumnInfo _if_sub_char16 = createColumnInfo("if_sub_char16");
	public final MCStringPermColumn if_sub_char16 = createStringColumn(_if_sub_char16);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public static final String $if_sub_char17 = "if_sub_char17";
	private static final MCPermColumnInfo _if_sub_char17 = createColumnInfo("if_sub_char17");
	public final MCStringPermColumn if_sub_char17 = createStringColumn(_if_sub_char17);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public static final String $if_sub_char18 = "if_sub_char18";
	private static final MCPermColumnInfo _if_sub_char18 = createColumnInfo("if_sub_char18");
	public final MCStringPermColumn if_sub_char18 = createStringColumn(_if_sub_char18);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public static final String $if_sub_char19 = "if_sub_char19";
	private static final MCPermColumnInfo _if_sub_char19 = createColumnInfo("if_sub_char19");
	public final MCStringPermColumn if_sub_char19 = createStringColumn(_if_sub_char19);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public static final String $if_sub_char20 = "if_sub_char20";
	private static final MCPermColumnInfo _if_sub_char20 = createColumnInfo("if_sub_char20");
	public final MCStringPermColumn if_sub_char20 = createStringColumn(_if_sub_char20);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public static final String $if_sub_char21 = "if_sub_char21";
	private static final MCPermColumnInfo _if_sub_char21 = createColumnInfo("if_sub_char21");
	public final MCStringPermColumn if_sub_char21 = createStringColumn(_if_sub_char21);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public static final String $if_sub_char22 = "if_sub_char22";
	private static final MCPermColumnInfo _if_sub_char22 = createColumnInfo("if_sub_char22");
	public final MCStringPermColumn if_sub_char22 = createStringColumn(_if_sub_char22);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public static final String $if_sub_char23 = "if_sub_char23";
	private static final MCPermColumnInfo _if_sub_char23 = createColumnInfo("if_sub_char23");
	public final MCStringPermColumn if_sub_char23 = createStringColumn(_if_sub_char23);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public static final String $if_sub_char24 = "if_sub_char24";
	private static final MCPermColumnInfo _if_sub_char24 = createColumnInfo("if_sub_char24");
	public final MCStringPermColumn if_sub_char24 = createStringColumn(_if_sub_char24);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public static final String $if_sub_char25 = "if_sub_char25";
	private static final MCPermColumnInfo _if_sub_char25 = createColumnInfo("if_sub_char25");
	public final MCStringPermColumn if_sub_char25 = createStringColumn(_if_sub_char25);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public static final String $if_sub_char26 = "if_sub_char26";
	private static final MCPermColumnInfo _if_sub_char26 = createColumnInfo("if_sub_char26");
	public final MCStringPermColumn if_sub_char26 = createStringColumn(_if_sub_char26);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public static final String $if_sub_char27 = "if_sub_char27";
	private static final MCPermColumnInfo _if_sub_char27 = createColumnInfo("if_sub_char27");
	public final MCStringPermColumn if_sub_char27 = createStringColumn(_if_sub_char27);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public static final String $if_sub_char28 = "if_sub_char28";
	private static final MCPermColumnInfo _if_sub_char28 = createColumnInfo("if_sub_char28");
	public final MCStringPermColumn if_sub_char28 = createStringColumn(_if_sub_char28);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public static final String $if_sub_char29 = "if_sub_char29";
	private static final MCPermColumnInfo _if_sub_char29 = createColumnInfo("if_sub_char29");
	public final MCStringPermColumn if_sub_char29 = createStringColumn(_if_sub_char29);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public static final String $if_sub_char30 = "if_sub_char30";
	private static final MCPermColumnInfo _if_sub_char30 = createColumnInfo("if_sub_char30");
	public final MCStringPermColumn if_sub_char30 = createStringColumn(_if_sub_char30);
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public static final String $if_sub_num1 = "if_sub_num1";
	private static final MCPermColumnInfo _if_sub_num1 = createColumnInfo("if_sub_num1");
	public final MCNumberPermColumn if_sub_num1 = createNumberColumn(_if_sub_num1);
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public static final String $if_sub_num2 = "if_sub_num2";
	private static final MCPermColumnInfo _if_sub_num2 = createColumnInfo("if_sub_num2");
	public final MCNumberPermColumn if_sub_num2 = createNumberColumn(_if_sub_num2);
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public static final String $if_sub_num3 = "if_sub_num3";
	private static final MCPermColumnInfo _if_sub_num3 = createColumnInfo("if_sub_num3");
	public final MCNumberPermColumn if_sub_num3 = createNumberColumn(_if_sub_num3);
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public static final String $if_sub_num4 = "if_sub_num4";
	private static final MCPermColumnInfo _if_sub_num4 = createColumnInfo("if_sub_num4");
	public final MCNumberPermColumn if_sub_num4 = createNumberColumn(_if_sub_num4);
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public static final String $if_sub_num5 = "if_sub_num5";
	private static final MCPermColumnInfo _if_sub_num5 = createColumnInfo("if_sub_num5");
	public final MCNumberPermColumn if_sub_num5 = createNumberColumn(_if_sub_num5);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public static final String $if_sub_dt1 = "if_sub_dt1";
	private static final MCPermColumnInfo _if_sub_dt1 = createColumnInfo("if_sub_dt1");
	public final MCDatePermColumn if_sub_dt1 = createDateColumn(_if_sub_dt1);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public static final String $if_sub_dt2 = "if_sub_dt2";
	private static final MCPermColumnInfo _if_sub_dt2 = createColumnInfo("if_sub_dt2");
	public final MCDatePermColumn if_sub_dt2 = createDateColumn(_if_sub_dt2);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public static final String $if_sub_dt3 = "if_sub_dt3";
	private static final MCPermColumnInfo _if_sub_dt3 = createColumnInfo("if_sub_dt3");
	public final MCDatePermColumn if_sub_dt3 = createDateColumn(_if_sub_dt3);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public static final String $if_sub_dt4 = "if_sub_dt4";
	private static final MCPermColumnInfo _if_sub_dt4 = createColumnInfo("if_sub_dt4");
	public final MCDatePermColumn if_sub_dt4 = createDateColumn(_if_sub_dt4);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public static final String $if_sub_dt5 = "if_sub_dt5";
	private static final MCPermColumnInfo _if_sub_dt5 = createColumnInfo("if_sub_dt5");
	public final MCDatePermColumn if_sub_dt5 = createDateColumn(_if_sub_dt5);
	
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
	 * カレンダ名. Calendar name.<p>
	 *
	 */
	public static final String $cal_nm = "cal_nm";
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_data_no_META = createCommonMeta($ext_data_no, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_NO);
	public static final MCMeta ext_data_lno_META = createCommonMeta($ext_data_lno, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_LNO);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta imp_flg_META = createCommonMeta($imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta bank_nm_lcl1_META = createCommonMeta($bank_nm_lcl1, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta bank_nm_lcl2_META = createCommonMeta($bank_nm_lcl2, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta bank_nm_lcl3_META = createCommonMeta($bank_nm_lcl3, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta if_sub_char1_META = createCommonMeta($if_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta if_sub_char2_META = createCommonMeta($if_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta if_sub_char3_META = createCommonMeta($if_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta if_sub_char4_META = createCommonMeta($if_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta if_sub_char5_META = createCommonMeta($if_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta if_sub_char6_META = createCommonMeta($if_sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta if_sub_char7_META = createCommonMeta($if_sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta if_sub_char8_META = createCommonMeta($if_sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta if_sub_char9_META = createCommonMeta($if_sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta if_sub_char10_META = createCommonMeta($if_sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta if_sub_char11_META = createCommonMeta($if_sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta if_sub_char12_META = createCommonMeta($if_sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta if_sub_char13_META = createCommonMeta($if_sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta if_sub_char14_META = createCommonMeta($if_sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta if_sub_char15_META = createCommonMeta($if_sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta if_sub_char16_META = createCommonMeta($if_sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta if_sub_char17_META = createCommonMeta($if_sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta if_sub_char18_META = createCommonMeta($if_sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta if_sub_char19_META = createCommonMeta($if_sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta if_sub_char20_META = createCommonMeta($if_sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta if_sub_char21_META = createCommonMeta($if_sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta if_sub_char22_META = createCommonMeta($if_sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta if_sub_char23_META = createCommonMeta($if_sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta if_sub_char24_META = createCommonMeta($if_sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta if_sub_char25_META = createCommonMeta($if_sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta if_sub_char26_META = createCommonMeta($if_sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta if_sub_char27_META = createCommonMeta($if_sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta if_sub_char28_META = createCommonMeta($if_sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta if_sub_char29_META = createCommonMeta($if_sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta if_sub_char30_META = createCommonMeta($if_sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta if_sub_num1_META = createCommonMeta($if_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta if_sub_num2_META = createCommonMeta($if_sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta if_sub_num3_META = createCommonMeta($if_sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta if_sub_num4_META = createCommonMeta($if_sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta if_sub_num5_META = createCommonMeta($if_sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta if_sub_dt1_META = createCommonMeta($if_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt2_META = createCommonMeta($if_sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt3_META = createCommonMeta($if_sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt4_META = createCommonMeta($if_sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt5_META = createCommonMeta($if_sub_dt5, mcframe.commonMA.meta.MA_META.DT);
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
	public static final MCMeta cal_nm_META = createCommonMeta($cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $SDRV = "SDRV";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MBVT_PFT_SDRV_IF",
				$SDRV,
				new String[][]{
						{"data_no", "data_no"}
				},
				() -> {
					return mcframe.serverMB.dbc.MBVT_PFT_SDRV_IF_R.create("SDRV");
				},
				(alias) -> {
					MBT_BANK_IF_R own = MBT_BANK_IF_R.create(alias);
					mcframe.serverMB.dbc.MBVT_PFT_SDRV_IF_R ref = mcframe.serverMB.dbc.MBVT_PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MBT_BANK_IF_R> constMetas = new ConstMetaList<MBT_BANK_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			ext_data_no_META,
			ext_data_lno_META,
			data_make_dt_META,
			imp_flg_META,
			bank_cd_META,
			bank_nm_META,
			bank_nm_lcl1_META,
			bank_nm_lcl2_META,
			bank_nm_lcl3_META,
			cal_cd_META,
			memo1_META,
			memo2_META,
			memo3_META,
			if_sub_char1_META,
			if_sub_char2_META,
			if_sub_char3_META,
			if_sub_char4_META,
			if_sub_char5_META,
			if_sub_char6_META,
			if_sub_char7_META,
			if_sub_char8_META,
			if_sub_char9_META,
			if_sub_char10_META,
			if_sub_char11_META,
			if_sub_char12_META,
			if_sub_char13_META,
			if_sub_char14_META,
			if_sub_char15_META,
			if_sub_char16_META,
			if_sub_char17_META,
			if_sub_char18_META,
			if_sub_char19_META,
			if_sub_char20_META,
			if_sub_char21_META,
			if_sub_char22_META,
			if_sub_char23_META,
			if_sub_char24_META,
			if_sub_char25_META,
			if_sub_char26_META,
			if_sub_char27_META,
			if_sub_char28_META,
			if_sub_char29_META,
			if_sub_char30_META,
			if_sub_num1_META,
			if_sub_num2_META,
			if_sub_num3_META,
			if_sub_num4_META,
			if_sub_num5_META,
			if_sub_dt1_META,
			if_sub_dt2_META,
			if_sub_dt3_META,
			if_sub_dt4_META,
			if_sub_dt5_META,
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
			cal_nm_META
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
	protected MBT_BANK_IF_R(ConstMetaList<? extends MBT_BANK_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBT_BANK_IF_R(ConstMetaList<? extends MBT_BANK_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$data_lno,
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
			MBT_BANK_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$data_no,
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
			MBT_BANK_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$exe_sts_typ,
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
			MBT_BANK_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$data_crud_typ,
				"data_crud_typ",
				data_crud_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$ext_sys_cd,
				"ext_sys_cd",
				ext_sys_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$ext_data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$ext_data_no,
				"ext_data_no",
				ext_data_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$ext_data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$ext_data_lno,
				"ext_data_lno",
				ext_data_lno,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$data_make_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BANK_IF_R.$data_make_dt,
				"data_make_dt",
				data_make_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BANK_IF_R.$imp_flg,
				"imp_flg",
				imp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$bank_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$bank_cd,
				"bank_cd",
				bank_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$bank_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$bank_nm,
				"bank_nm",
				bank_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$bank_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$bank_nm_lcl1,
				"bank_nm_lcl1",
				bank_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$bank_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$bank_nm_lcl2,
				"bank_nm_lcl2",
				bank_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$bank_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$bank_nm_lcl3,
				"bank_nm_lcl3",
				bank_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$cal_cd,
				"cal_cd",
				cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char1,
				"if_sub_char1",
				if_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char2,
				"if_sub_char2",
				if_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char3,
				"if_sub_char3",
				if_sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char4,
				"if_sub_char4",
				if_sub_char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char5,
				"if_sub_char5",
				if_sub_char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char6,
				"if_sub_char6",
				if_sub_char6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char7,
				"if_sub_char7",
				if_sub_char7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char8,
				"if_sub_char8",
				if_sub_char8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char9,
				"if_sub_char9",
				if_sub_char9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char10,
				"if_sub_char10",
				if_sub_char10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char11,
				"if_sub_char11",
				if_sub_char11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char12,
				"if_sub_char12",
				if_sub_char12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char13,
				"if_sub_char13",
				if_sub_char13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char14,
				"if_sub_char14",
				if_sub_char14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char15,
				"if_sub_char15",
				if_sub_char15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char16,
				"if_sub_char16",
				if_sub_char16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char17,
				"if_sub_char17",
				if_sub_char17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char18,
				"if_sub_char18",
				if_sub_char18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char19,
				"if_sub_char19",
				if_sub_char19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char20,
				"if_sub_char20",
				if_sub_char20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char21,
				"if_sub_char21",
				if_sub_char21,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char22,
				"if_sub_char22",
				if_sub_char22,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char23,
				"if_sub_char23",
				if_sub_char23,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char24,
				"if_sub_char24",
				if_sub_char24,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char25,
				"if_sub_char25",
				if_sub_char25,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char26,
				"if_sub_char26",
				if_sub_char26,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char27,
				"if_sub_char27",
				if_sub_char27,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char28,
				"if_sub_char28",
				if_sub_char28,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char29,
				"if_sub_char29",
				if_sub_char29,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$if_sub_char30,
				"if_sub_char30",
				if_sub_char30,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$if_sub_num1,
				"if_sub_num1",
				if_sub_num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$if_sub_num2,
				"if_sub_num2",
				if_sub_num2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$if_sub_num3,
				"if_sub_num3",
				if_sub_num3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$if_sub_num4,
				"if_sub_num4",
				if_sub_num4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$if_sub_num5,
				"if_sub_num5",
				if_sub_num5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BANK_IF_R.$if_sub_dt1,
				"if_sub_dt1",
				if_sub_dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BANK_IF_R.$if_sub_dt2,
				"if_sub_dt2",
				if_sub_dt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BANK_IF_R.$if_sub_dt3,
				"if_sub_dt3",
				if_sub_dt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BANK_IF_R.$if_sub_dt4,
				"if_sub_dt4",
				if_sub_dt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$if_sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BANK_IF_R.$if_sub_dt5,
				"if_sub_dt5",
				if_sub_dt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BANK_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$batch_log_no,
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
			MBT_BANK_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$log_sub_key1,
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
			MBT_BANK_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$log_sub_key2,
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
			MBT_BANK_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$ins_usr_id,
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
			MBT_BANK_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$ins_usr_nm,
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
			MBT_BANK_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_BANK_IF_R.$ins_ts,
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
			MBT_BANK_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$ins_func_id,
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
			MBT_BANK_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BANK_IF_R.$upd_cntr,
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
			MBT_BANK_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$upd_usr_id,
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
			MBT_BANK_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$upd_usr_nm,
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
			MBT_BANK_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_BANK_IF_R.$upd_ts,
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
			MBT_BANK_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$upd_func_id,
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
			MBT_BANK_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$upd_srv_req_no,
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
			MBT_BANK_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$sdrv_sts_typ,
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
			MBT_BANK_IF_R.$cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BANK_IF_R.$cal_nm,
				"cal_nm",
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
	public static MBT_BANK_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBT_BANK_IF_R create(String alias) {
		MBT_BANK_IF_R row = new MBT_BANK_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBT_BANK_IF_R createByName(T proto) {
		MBT_BANK_IF_R row = MBT_BANK_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_BANK_IF_R clone() {
		return (MBT_BANK_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_BANK_IF_R createInstance() {
		return (MBT_BANK_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_BANK_IF_R getValues(String... names) {
		return (MBT_BANK_IF_R) super.getValues(names);
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
	 public MBW_BANK_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MBW_BANK_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MBW_BANK_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MBW_BANK_IF_KEY_R.TABLE_NAME);
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
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return getConstNumber(offset + 5, $ext_data_no);
	}

	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(int value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(long value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(float value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(double value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return getConstNumber(offset + 6, $ext_data_lno);
	}

	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(int value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(long value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(float value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(double value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 7, $data_make_dt);
	}

	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 7, $data_make_dt, value);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public boolean imp_flg() {
		return getConstBoolean(offset + 8, $imp_flg);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public void imp_flg(boolean value) {
		setConstBoolean(offset + 8, $imp_flg, value);
	}

	/**
	 * 銀行ＣＤ. Bank cd..<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 9, $bank_cd);
	}

	/**
	 * 銀行ＣＤ. Bank cd..<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 9, $bank_cd, value);
	}

	/**
	 * 銀行名. Bank name.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 10, $bank_nm);
	}

	/**
	 * 銀行名. Bank name.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 10, $bank_nm, value);
	}

	/**
	 * 銀行名_ロケール１. Bank name_locale1.<p>
	 *
	 */
	public String bank_nm_lcl1() {
		return getConstString(offset + 11, $bank_nm_lcl1);
	}

	/**
	 * 銀行名_ロケール１. Bank name_locale1.<p>
	 *
	 */
	public void bank_nm_lcl1(String value) {
		setConstString(offset + 11, $bank_nm_lcl1, value);
	}

	/**
	 * 銀行名_ロケール２. Bank name_locale2.<p>
	 *
	 */
	public String bank_nm_lcl2() {
		return getConstString(offset + 12, $bank_nm_lcl2);
	}

	/**
	 * 銀行名_ロケール２. Bank name_locale2.<p>
	 *
	 */
	public void bank_nm_lcl2(String value) {
		setConstString(offset + 12, $bank_nm_lcl2, value);
	}

	/**
	 * 銀行名_ロケール３. Bank name_locale3.<p>
	 *
	 */
	public String bank_nm_lcl3() {
		return getConstString(offset + 13, $bank_nm_lcl3);
	}

	/**
	 * 銀行名_ロケール３. Bank name_locale3.<p>
	 *
	 */
	public void bank_nm_lcl3(String value) {
		setConstString(offset + 13, $bank_nm_lcl3, value);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 14, $cal_cd);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 14, $cal_cd, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 15, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 15, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 16, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 16, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 17, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 17, $memo3, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public String if_sub_char1() {
		return getConstString(offset + 18, $if_sub_char1);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public void if_sub_char1(String value) {
		setConstString(offset + 18, $if_sub_char1, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public String if_sub_char2() {
		return getConstString(offset + 19, $if_sub_char2);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public void if_sub_char2(String value) {
		setConstString(offset + 19, $if_sub_char2, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public String if_sub_char3() {
		return getConstString(offset + 20, $if_sub_char3);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public void if_sub_char3(String value) {
		setConstString(offset + 20, $if_sub_char3, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public String if_sub_char4() {
		return getConstString(offset + 21, $if_sub_char4);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public void if_sub_char4(String value) {
		setConstString(offset + 21, $if_sub_char4, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public String if_sub_char5() {
		return getConstString(offset + 22, $if_sub_char5);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public void if_sub_char5(String value) {
		setConstString(offset + 22, $if_sub_char5, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public String if_sub_char6() {
		return getConstString(offset + 23, $if_sub_char6);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public void if_sub_char6(String value) {
		setConstString(offset + 23, $if_sub_char6, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public String if_sub_char7() {
		return getConstString(offset + 24, $if_sub_char7);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public void if_sub_char7(String value) {
		setConstString(offset + 24, $if_sub_char7, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public String if_sub_char8() {
		return getConstString(offset + 25, $if_sub_char8);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public void if_sub_char8(String value) {
		setConstString(offset + 25, $if_sub_char8, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public String if_sub_char9() {
		return getConstString(offset + 26, $if_sub_char9);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public void if_sub_char9(String value) {
		setConstString(offset + 26, $if_sub_char9, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public String if_sub_char10() {
		return getConstString(offset + 27, $if_sub_char10);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public void if_sub_char10(String value) {
		setConstString(offset + 27, $if_sub_char10, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public String if_sub_char11() {
		return getConstString(offset + 28, $if_sub_char11);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public void if_sub_char11(String value) {
		setConstString(offset + 28, $if_sub_char11, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public String if_sub_char12() {
		return getConstString(offset + 29, $if_sub_char12);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public void if_sub_char12(String value) {
		setConstString(offset + 29, $if_sub_char12, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public String if_sub_char13() {
		return getConstString(offset + 30, $if_sub_char13);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public void if_sub_char13(String value) {
		setConstString(offset + 30, $if_sub_char13, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public String if_sub_char14() {
		return getConstString(offset + 31, $if_sub_char14);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public void if_sub_char14(String value) {
		setConstString(offset + 31, $if_sub_char14, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public String if_sub_char15() {
		return getConstString(offset + 32, $if_sub_char15);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public void if_sub_char15(String value) {
		setConstString(offset + 32, $if_sub_char15, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public String if_sub_char16() {
		return getConstString(offset + 33, $if_sub_char16);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public void if_sub_char16(String value) {
		setConstString(offset + 33, $if_sub_char16, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public String if_sub_char17() {
		return getConstString(offset + 34, $if_sub_char17);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public void if_sub_char17(String value) {
		setConstString(offset + 34, $if_sub_char17, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public String if_sub_char18() {
		return getConstString(offset + 35, $if_sub_char18);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public void if_sub_char18(String value) {
		setConstString(offset + 35, $if_sub_char18, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public String if_sub_char19() {
		return getConstString(offset + 36, $if_sub_char19);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public void if_sub_char19(String value) {
		setConstString(offset + 36, $if_sub_char19, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public String if_sub_char20() {
		return getConstString(offset + 37, $if_sub_char20);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public void if_sub_char20(String value) {
		setConstString(offset + 37, $if_sub_char20, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public String if_sub_char21() {
		return getConstString(offset + 38, $if_sub_char21);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public void if_sub_char21(String value) {
		setConstString(offset + 38, $if_sub_char21, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public String if_sub_char22() {
		return getConstString(offset + 39, $if_sub_char22);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public void if_sub_char22(String value) {
		setConstString(offset + 39, $if_sub_char22, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public String if_sub_char23() {
		return getConstString(offset + 40, $if_sub_char23);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public void if_sub_char23(String value) {
		setConstString(offset + 40, $if_sub_char23, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public String if_sub_char24() {
		return getConstString(offset + 41, $if_sub_char24);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public void if_sub_char24(String value) {
		setConstString(offset + 41, $if_sub_char24, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public String if_sub_char25() {
		return getConstString(offset + 42, $if_sub_char25);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public void if_sub_char25(String value) {
		setConstString(offset + 42, $if_sub_char25, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public String if_sub_char26() {
		return getConstString(offset + 43, $if_sub_char26);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public void if_sub_char26(String value) {
		setConstString(offset + 43, $if_sub_char26, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public String if_sub_char27() {
		return getConstString(offset + 44, $if_sub_char27);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public void if_sub_char27(String value) {
		setConstString(offset + 44, $if_sub_char27, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public String if_sub_char28() {
		return getConstString(offset + 45, $if_sub_char28);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public void if_sub_char28(String value) {
		setConstString(offset + 45, $if_sub_char28, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public String if_sub_char29() {
		return getConstString(offset + 46, $if_sub_char29);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public void if_sub_char29(String value) {
		setConstString(offset + 46, $if_sub_char29, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public String if_sub_char30() {
		return getConstString(offset + 47, $if_sub_char30);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public void if_sub_char30(String value) {
		setConstString(offset + 47, $if_sub_char30, value);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public MCNumber if_sub_num1() {
		return getConstNumber(offset + 48, $if_sub_num1);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(MCNumber value) {
		setConstNumber(offset + 48, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(int value) {
		setConstNumber(offset + 48, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(long value) {
		setConstNumber(offset + 48, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(float value) {
		setConstNumber(offset + 48, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(double value) {
		setConstNumber(offset + 48, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public MCNumber if_sub_num2() {
		return getConstNumber(offset + 49, $if_sub_num2);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(MCNumber value) {
		setConstNumber(offset + 49, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(int value) {
		setConstNumber(offset + 49, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(long value) {
		setConstNumber(offset + 49, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(float value) {
		setConstNumber(offset + 49, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(double value) {
		setConstNumber(offset + 49, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public MCNumber if_sub_num3() {
		return getConstNumber(offset + 50, $if_sub_num3);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(MCNumber value) {
		setConstNumber(offset + 50, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(int value) {
		setConstNumber(offset + 50, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(long value) {
		setConstNumber(offset + 50, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(float value) {
		setConstNumber(offset + 50, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(double value) {
		setConstNumber(offset + 50, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public MCNumber if_sub_num4() {
		return getConstNumber(offset + 51, $if_sub_num4);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(MCNumber value) {
		setConstNumber(offset + 51, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(int value) {
		setConstNumber(offset + 51, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(long value) {
		setConstNumber(offset + 51, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(float value) {
		setConstNumber(offset + 51, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(double value) {
		setConstNumber(offset + 51, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public MCNumber if_sub_num5() {
		return getConstNumber(offset + 52, $if_sub_num5);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(MCNumber value) {
		setConstNumber(offset + 52, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(int value) {
		setConstNumber(offset + 52, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(long value) {
		setConstNumber(offset + 52, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(float value) {
		setConstNumber(offset + 52, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(double value) {
		setConstNumber(offset + 52, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public MCDate if_sub_dt1() {
		return getConstDate(offset + 53, $if_sub_dt1);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public void if_sub_dt1(MCDate value) {
		setConstDate(offset + 53, $if_sub_dt1, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public MCDate if_sub_dt2() {
		return getConstDate(offset + 54, $if_sub_dt2);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public void if_sub_dt2(MCDate value) {
		setConstDate(offset + 54, $if_sub_dt2, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public MCDate if_sub_dt3() {
		return getConstDate(offset + 55, $if_sub_dt3);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public void if_sub_dt3(MCDate value) {
		setConstDate(offset + 55, $if_sub_dt3, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public MCDate if_sub_dt4() {
		return getConstDate(offset + 56, $if_sub_dt4);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public void if_sub_dt4(MCDate value) {
		setConstDate(offset + 56, $if_sub_dt4, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public MCDate if_sub_dt5() {
		return getConstDate(offset + 57, $if_sub_dt5);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public void if_sub_dt5(MCDate value) {
		setConstDate(offset + 57, $if_sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 58, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 58, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 59, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 59, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 59, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 59, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 59, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 59, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 60, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 60, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 60, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 60, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 60, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 60, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 61, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 61, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 62, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 62, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 63, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 63, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 64, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 64, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 65, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 65, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 65, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 65, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 65, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 65, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 66, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 66, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 67, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 67, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 68, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 68, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 69, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 69, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 70, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 70, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 71, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 71, $sdrv_sts_typ, value);
	}

	/**
	 * カレンダ名. Calendar name.<p>
	 *
	 */
	public String cal_nm() {
		return getConstString(offset + 72, $cal_nm);
	}

	/**
	 * カレンダ名. Calendar name.<p>
	 *
	 */
	public void cal_nm(String value) {
		setConstString(offset + 72, $cal_nm, value);
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
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($bank_nm_lcl1.equalsIgnoreCase(name)) {
			return bank_nm_lcl1();
		}
		if ($bank_nm_lcl2.equalsIgnoreCase(name)) {
			return bank_nm_lcl2();
		}
		if ($bank_nm_lcl3.equalsIgnoreCase(name)) {
			return bank_nm_lcl3();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
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
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
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
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($bank_nm_lcl1.equalsIgnoreCase(name)) {
			return bank_nm_lcl1();
		}
		if ($bank_nm_lcl2.equalsIgnoreCase(name)) {
			return bank_nm_lcl2();
		}
		if ($bank_nm_lcl3.equalsIgnoreCase(name)) {
			return bank_nm_lcl3();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
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
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
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
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($bank_nm_lcl1.equalsIgnoreCase(name)) {
			bank_nm_lcl1(value);
			return;
		}
		if ($bank_nm_lcl2.equalsIgnoreCase(name)) {
			bank_nm_lcl2(value);
			return;
		}
		if ($bank_nm_lcl3.equalsIgnoreCase(name)) {
			bank_nm_lcl3(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
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
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
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
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($bank_nm_lcl1.equalsIgnoreCase(name)) {
			bank_nm_lcl1(value);
			return;
		}
		if ($bank_nm_lcl2.equalsIgnoreCase(name)) {
			bank_nm_lcl2(value);
			return;
		}
		if ($bank_nm_lcl3.equalsIgnoreCase(name)) {
			bank_nm_lcl3(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
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
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
