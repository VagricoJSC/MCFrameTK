package mcframe.serverMA.dbc;

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
 * "汎用マスタ // General purpose master"DBコンテナRowクラスです。<p>
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
 *  	<td>gp_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>汎用分類ＣＤ</td>
 *  	<td>General purpose classification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー１</td>
 *  	<td>Key 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー２</td>
 *  	<td>Key 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー３</td>
 *  	<td>Key 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key4</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー４</td>
 *  	<td>Key 4</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key5</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー５</td>
 *  	<td>Key 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key6</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー６</td>
 *  	<td>Key 6</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key7</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー７</td>
 *  	<td>Key 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key8</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー８</td>
 *  	<td>Key 8</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key9</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー９</td>
 *  	<td>Key 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key10</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー１０</td>
 *  	<td>Key 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１</td>
 *  	<td>String 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_char1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１（ベース）</td>
 *  	<td>String 1(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列２</td>
 *  	<td>String 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_char2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列２（ベース）</td>
 *  	<td>String 2(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列３</td>
 *  	<td>String 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_char3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列３（ベース）</td>
 *  	<td>String 3(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列４</td>
 *  	<td>String 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_char4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列４（ベース）</td>
 *  	<td>String 4(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列５</td>
 *  	<td>String 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_char5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列５（ベース）</td>
 *  	<td>String 5(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列６</td>
 *  	<td>String 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_char6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列６（ベース）</td>
 *  	<td>String 6(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列７</td>
 *  	<td>String 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_char7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列７（ベース）</td>
 *  	<td>String 7(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列８</td>
 *  	<td>String 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_char8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列８（ベース）</td>
 *  	<td>String 8(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列９</td>
 *  	<td>String 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_char9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列９（ベース）</td>
 *  	<td>String 9(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char10</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１０</td>
 *  	<td>String 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_char10</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１０（ベース）</td>
 *  	<td>String 10(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char11</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１１</td>
 *  	<td>String 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>char12</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１２</td>
 *  	<td>String 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char13</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１３</td>
 *  	<td>String 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>char14</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１４</td>
 *  	<td>String 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char15</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１５</td>
 *  	<td>String 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>char16</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１６</td>
 *  	<td>String 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char17</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１７</td>
 *  	<td>String 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>char18</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１８</td>
 *  	<td>String 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char19</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１９</td>
 *  	<td>String 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>char20</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列２０</td>
 *  	<td>String 20</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値１</td>
 *  	<td>Numerical 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値２</td>
 *  	<td>Numerical 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値３</td>
 *  	<td>Numerical 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値４</td>
 *  	<td>Numerical 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値５</td>
 *  	<td>Numerical 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num6</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値６</td>
 *  	<td>Numerical 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num7</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値７</td>
 *  	<td>Numerical 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num8</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値８</td>
 *  	<td>Numerical 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num9</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値９</td>
 *  	<td>Numerical 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num10</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値１０</td>
 *  	<td>Numerical 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付１</td>
 *  	<td>Date 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付２</td>
 *  	<td>Date 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付３</td>
 *  	<td>Date 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付４</td>
 *  	<td>Date 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付５</td>
 *  	<td>Date 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt6</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付６</td>
 *  	<td>Date 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt7</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付７</td>
 *  	<td>Date 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt8</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付８</td>
 *  	<td>Date 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt9</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付９</td>
 *  	<td>Date 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt10</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付１０</td>
 *  	<td>Date 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>flg1</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ１</td>
 *  	<td>Flg. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>flg2</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ２</td>
 *  	<td>Flg. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>flg3</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ３</td>
 *  	<td>Flg. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>flg4</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ４</td>
 *  	<td>Flg. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>flg5</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ５</td>
 *  	<td>Flg. 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>flg6</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ６</td>
 *  	<td>Flg. 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>flg7</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ７</td>
 *  	<td>Flg. 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>flg8</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ８</td>
 *  	<td>Flg. 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>flg9</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ９</td>
 *  	<td>Flg. 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>flg10</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ１０</td>
 *  	<td>Flg. 10</td>
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
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
 *  	<td>gp_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>GP_GRP1</td>
 *  	<td>汎用分類名</td>
 *  	<td>General purpose classification name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_GP_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_GP";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 汎用分類ＣＤ. General purpose classification cd..<p>
	 *
	 */
	public static final String $gp_grp_cd = "gp_grp_cd";
	private static final MCPermColumnInfo _gp_grp_cd = createColumnInfo("gp_grp_cd");
	public final MCStringPermColumn gp_grp_cd = createStringColumn(_gp_grp_cd);
	
	/**
	 * キー１. Key 1.<p>
	 *
	 */
	public static final String $key1 = "key1";
	private static final MCPermColumnInfo _key1 = createColumnInfo("key1");
	public final MCStringPermColumn key1 = createStringColumn(_key1);
	
	/**
	 * キー２. Key 2.<p>
	 *
	 */
	public static final String $key2 = "key2";
	private static final MCPermColumnInfo _key2 = createColumnInfo("key2");
	public final MCStringPermColumn key2 = createStringColumn(_key2);
	
	/**
	 * キー３. Key 3.<p>
	 *
	 */
	public static final String $key3 = "key3";
	private static final MCPermColumnInfo _key3 = createColumnInfo("key3");
	public final MCStringPermColumn key3 = createStringColumn(_key3);
	
	/**
	 * キー４. Key 4.<p>
	 *
	 */
	public static final String $key4 = "key4";
	private static final MCPermColumnInfo _key4 = createColumnInfo("key4");
	public final MCStringPermColumn key4 = createStringColumn(_key4);
	
	/**
	 * キー５. Key 5.<p>
	 *
	 */
	public static final String $key5 = "key5";
	private static final MCPermColumnInfo _key5 = createColumnInfo("key5");
	public final MCStringPermColumn key5 = createStringColumn(_key5);
	
	/**
	 * キー６. Key 6.<p>
	 *
	 */
	public static final String $key6 = "key6";
	private static final MCPermColumnInfo _key6 = createColumnInfo("key6");
	public final MCStringPermColumn key6 = createStringColumn(_key6);
	
	/**
	 * キー７. Key 7.<p>
	 *
	 */
	public static final String $key7 = "key7";
	private static final MCPermColumnInfo _key7 = createColumnInfo("key7");
	public final MCStringPermColumn key7 = createStringColumn(_key7);
	
	/**
	 * キー８. Key 8.<p>
	 *
	 */
	public static final String $key8 = "key8";
	private static final MCPermColumnInfo _key8 = createColumnInfo("key8");
	public final MCStringPermColumn key8 = createStringColumn(_key8);
	
	/**
	 * キー９. Key 9.<p>
	 *
	 */
	public static final String $key9 = "key9";
	private static final MCPermColumnInfo _key9 = createColumnInfo("key9");
	public final MCStringPermColumn key9 = createStringColumn(_key9);
	
	/**
	 * キー１０. Key 10.<p>
	 *
	 */
	public static final String $key10 = "key10";
	private static final MCPermColumnInfo _key10 = createColumnInfo("key10");
	public final MCStringPermColumn key10 = createStringColumn(_key10);
	
	/**
	 * 文字列１. String 1.<p>
	 *
	 */
	public static final String $char1 = "char1";
	private static final MCPermColumnInfo _char1 = createColumnInfo("char1");
	public final MCStringPermColumn char1 = createStringColumn(_char1);
	
	/**
	 * 文字列１（ベース）. String 1(Base).<p>
	 *
	 */
	public static final String $base_char1 = "base_char1";
	private static final MCPermColumnInfo _base_char1 = createColumnInfo("base_char1");
	public final MCStringPermColumn base_char1 = createStringColumn(_base_char1);
	
	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public static final String $char2 = "char2";
	private static final MCPermColumnInfo _char2 = createColumnInfo("char2");
	public final MCStringPermColumn char2 = createStringColumn(_char2);
	
	/**
	 * 文字列２（ベース）. String 2(Base).<p>
	 *
	 */
	public static final String $base_char2 = "base_char2";
	private static final MCPermColumnInfo _base_char2 = createColumnInfo("base_char2");
	public final MCStringPermColumn base_char2 = createStringColumn(_base_char2);
	
	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public static final String $char3 = "char3";
	private static final MCPermColumnInfo _char3 = createColumnInfo("char3");
	public final MCStringPermColumn char3 = createStringColumn(_char3);
	
	/**
	 * 文字列３（ベース）. String 3(Base).<p>
	 *
	 */
	public static final String $base_char3 = "base_char3";
	private static final MCPermColumnInfo _base_char3 = createColumnInfo("base_char3");
	public final MCStringPermColumn base_char3 = createStringColumn(_base_char3);
	
	/**
	 * 文字列４. String 4.<p>
	 *
	 */
	public static final String $char4 = "char4";
	private static final MCPermColumnInfo _char4 = createColumnInfo("char4");
	public final MCStringPermColumn char4 = createStringColumn(_char4);
	
	/**
	 * 文字列４（ベース）. String 4(Base).<p>
	 *
	 */
	public static final String $base_char4 = "base_char4";
	private static final MCPermColumnInfo _base_char4 = createColumnInfo("base_char4");
	public final MCStringPermColumn base_char4 = createStringColumn(_base_char4);
	
	/**
	 * 文字列５. String 5.<p>
	 *
	 */
	public static final String $char5 = "char5";
	private static final MCPermColumnInfo _char5 = createColumnInfo("char5");
	public final MCStringPermColumn char5 = createStringColumn(_char5);
	
	/**
	 * 文字列５（ベース）. String 5(Base).<p>
	 *
	 */
	public static final String $base_char5 = "base_char5";
	private static final MCPermColumnInfo _base_char5 = createColumnInfo("base_char5");
	public final MCStringPermColumn base_char5 = createStringColumn(_base_char5);
	
	/**
	 * 文字列６. String 6.<p>
	 *
	 */
	public static final String $char6 = "char6";
	private static final MCPermColumnInfo _char6 = createColumnInfo("char6");
	public final MCStringPermColumn char6 = createStringColumn(_char6);
	
	/**
	 * 文字列６（ベース）. String 6(Base).<p>
	 *
	 */
	public static final String $base_char6 = "base_char6";
	private static final MCPermColumnInfo _base_char6 = createColumnInfo("base_char6");
	public final MCStringPermColumn base_char6 = createStringColumn(_base_char6);
	
	/**
	 * 文字列７. String 7.<p>
	 *
	 */
	public static final String $char7 = "char7";
	private static final MCPermColumnInfo _char7 = createColumnInfo("char7");
	public final MCStringPermColumn char7 = createStringColumn(_char7);
	
	/**
	 * 文字列７（ベース）. String 7(Base).<p>
	 *
	 */
	public static final String $base_char7 = "base_char7";
	private static final MCPermColumnInfo _base_char7 = createColumnInfo("base_char7");
	public final MCStringPermColumn base_char7 = createStringColumn(_base_char7);
	
	/**
	 * 文字列８. String 8.<p>
	 *
	 */
	public static final String $char8 = "char8";
	private static final MCPermColumnInfo _char8 = createColumnInfo("char8");
	public final MCStringPermColumn char8 = createStringColumn(_char8);
	
	/**
	 * 文字列８（ベース）. String 8(Base).<p>
	 *
	 */
	public static final String $base_char8 = "base_char8";
	private static final MCPermColumnInfo _base_char8 = createColumnInfo("base_char8");
	public final MCStringPermColumn base_char8 = createStringColumn(_base_char8);
	
	/**
	 * 文字列９. String 9.<p>
	 *
	 */
	public static final String $char9 = "char9";
	private static final MCPermColumnInfo _char9 = createColumnInfo("char9");
	public final MCStringPermColumn char9 = createStringColumn(_char9);
	
	/**
	 * 文字列９（ベース）. String 9(Base).<p>
	 *
	 */
	public static final String $base_char9 = "base_char9";
	private static final MCPermColumnInfo _base_char9 = createColumnInfo("base_char9");
	public final MCStringPermColumn base_char9 = createStringColumn(_base_char9);
	
	/**
	 * 文字列１０. String 10.<p>
	 *
	 */
	public static final String $char10 = "char10";
	private static final MCPermColumnInfo _char10 = createColumnInfo("char10");
	public final MCStringPermColumn char10 = createStringColumn(_char10);
	
	/**
	 * 文字列１０（ベース）. String 10(Base).<p>
	 *
	 */
	public static final String $base_char10 = "base_char10";
	private static final MCPermColumnInfo _base_char10 = createColumnInfo("base_char10");
	public final MCStringPermColumn base_char10 = createStringColumn(_base_char10);
	
	/**
	 * 文字列１１. String 11.<p>
	 *
	 */
	public static final String $char11 = "char11";
	private static final MCPermColumnInfo _char11 = createColumnInfo("char11");
	public final MCStringPermColumn char11 = createStringColumn(_char11);
	
	/**
	 * 文字列１２. String 12.<p>
	 *
	 */
	public static final String $char12 = "char12";
	private static final MCPermColumnInfo _char12 = createColumnInfo("char12");
	public final MCStringPermColumn char12 = createStringColumn(_char12);
	
	/**
	 * 文字列１３. String 13.<p>
	 *
	 */
	public static final String $char13 = "char13";
	private static final MCPermColumnInfo _char13 = createColumnInfo("char13");
	public final MCStringPermColumn char13 = createStringColumn(_char13);
	
	/**
	 * 文字列１４. String 14.<p>
	 *
	 */
	public static final String $char14 = "char14";
	private static final MCPermColumnInfo _char14 = createColumnInfo("char14");
	public final MCStringPermColumn char14 = createStringColumn(_char14);
	
	/**
	 * 文字列１５. String 15.<p>
	 *
	 */
	public static final String $char15 = "char15";
	private static final MCPermColumnInfo _char15 = createColumnInfo("char15");
	public final MCStringPermColumn char15 = createStringColumn(_char15);
	
	/**
	 * 文字列１６. String 16.<p>
	 *
	 */
	public static final String $char16 = "char16";
	private static final MCPermColumnInfo _char16 = createColumnInfo("char16");
	public final MCStringPermColumn char16 = createStringColumn(_char16);
	
	/**
	 * 文字列１７. String 17.<p>
	 *
	 */
	public static final String $char17 = "char17";
	private static final MCPermColumnInfo _char17 = createColumnInfo("char17");
	public final MCStringPermColumn char17 = createStringColumn(_char17);
	
	/**
	 * 文字列１８. String 18.<p>
	 *
	 */
	public static final String $char18 = "char18";
	private static final MCPermColumnInfo _char18 = createColumnInfo("char18");
	public final MCStringPermColumn char18 = createStringColumn(_char18);
	
	/**
	 * 文字列１９. String 19.<p>
	 *
	 */
	public static final String $char19 = "char19";
	private static final MCPermColumnInfo _char19 = createColumnInfo("char19");
	public final MCStringPermColumn char19 = createStringColumn(_char19);
	
	/**
	 * 文字列２０. String 20.<p>
	 *
	 */
	public static final String $char20 = "char20";
	private static final MCPermColumnInfo _char20 = createColumnInfo("char20");
	public final MCStringPermColumn char20 = createStringColumn(_char20);
	
	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public static final String $num1 = "num1";
	private static final MCPermColumnInfo _num1 = createColumnInfo("num1");
	public final MCNumberPermColumn num1 = createNumberColumn(_num1);
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public static final String $num2 = "num2";
	private static final MCPermColumnInfo _num2 = createColumnInfo("num2");
	public final MCNumberPermColumn num2 = createNumberColumn(_num2);
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public static final String $num3 = "num3";
	private static final MCPermColumnInfo _num3 = createColumnInfo("num3");
	public final MCNumberPermColumn num3 = createNumberColumn(_num3);
	
	/**
	 * 数値４. Numerical 4.<p>
	 *
	 */
	public static final String $num4 = "num4";
	private static final MCPermColumnInfo _num4 = createColumnInfo("num4");
	public final MCNumberPermColumn num4 = createNumberColumn(_num4);
	
	/**
	 * 数値５. Numerical 5.<p>
	 *
	 */
	public static final String $num5 = "num5";
	private static final MCPermColumnInfo _num5 = createColumnInfo("num5");
	public final MCNumberPermColumn num5 = createNumberColumn(_num5);
	
	/**
	 * 数値６. Numerical 6.<p>
	 *
	 */
	public static final String $num6 = "num6";
	private static final MCPermColumnInfo _num6 = createColumnInfo("num6");
	public final MCNumberPermColumn num6 = createNumberColumn(_num6);
	
	/**
	 * 数値７. Numerical 7.<p>
	 *
	 */
	public static final String $num7 = "num7";
	private static final MCPermColumnInfo _num7 = createColumnInfo("num7");
	public final MCNumberPermColumn num7 = createNumberColumn(_num7);
	
	/**
	 * 数値８. Numerical 8.<p>
	 *
	 */
	public static final String $num8 = "num8";
	private static final MCPermColumnInfo _num8 = createColumnInfo("num8");
	public final MCNumberPermColumn num8 = createNumberColumn(_num8);
	
	/**
	 * 数値９. Numerical 9.<p>
	 *
	 */
	public static final String $num9 = "num9";
	private static final MCPermColumnInfo _num9 = createColumnInfo("num9");
	public final MCNumberPermColumn num9 = createNumberColumn(_num9);
	
	/**
	 * 数値１０. Numerical 10.<p>
	 *
	 */
	public static final String $num10 = "num10";
	private static final MCPermColumnInfo _num10 = createColumnInfo("num10");
	public final MCNumberPermColumn num10 = createNumberColumn(_num10);
	
	/**
	 * 日付１. Date 1.<p>
	 *
	 */
	public static final String $dt1 = "dt1";
	private static final MCPermColumnInfo _dt1 = createColumnInfo("dt1");
	public final MCDatePermColumn dt1 = createDateColumn(_dt1);
	
	/**
	 * 日付２. Date 2.<p>
	 *
	 */
	public static final String $dt2 = "dt2";
	private static final MCPermColumnInfo _dt2 = createColumnInfo("dt2");
	public final MCDatePermColumn dt2 = createDateColumn(_dt2);
	
	/**
	 * 日付３. Date 3.<p>
	 *
	 */
	public static final String $dt3 = "dt3";
	private static final MCPermColumnInfo _dt3 = createColumnInfo("dt3");
	public final MCDatePermColumn dt3 = createDateColumn(_dt3);
	
	/**
	 * 日付４. Date 4.<p>
	 *
	 */
	public static final String $dt4 = "dt4";
	private static final MCPermColumnInfo _dt4 = createColumnInfo("dt4");
	public final MCDatePermColumn dt4 = createDateColumn(_dt4);
	
	/**
	 * 日付５. Date 5.<p>
	 *
	 */
	public static final String $dt5 = "dt5";
	private static final MCPermColumnInfo _dt5 = createColumnInfo("dt5");
	public final MCDatePermColumn dt5 = createDateColumn(_dt5);
	
	/**
	 * 日付６. Date 6.<p>
	 *
	 */
	public static final String $dt6 = "dt6";
	private static final MCPermColumnInfo _dt6 = createColumnInfo("dt6");
	public final MCDatePermColumn dt6 = createDateColumn(_dt6);
	
	/**
	 * 日付７. Date 7.<p>
	 *
	 */
	public static final String $dt7 = "dt7";
	private static final MCPermColumnInfo _dt7 = createColumnInfo("dt7");
	public final MCDatePermColumn dt7 = createDateColumn(_dt7);
	
	/**
	 * 日付８. Date 8.<p>
	 *
	 */
	public static final String $dt8 = "dt8";
	private static final MCPermColumnInfo _dt8 = createColumnInfo("dt8");
	public final MCDatePermColumn dt8 = createDateColumn(_dt8);
	
	/**
	 * 日付９. Date 9.<p>
	 *
	 */
	public static final String $dt9 = "dt9";
	private static final MCPermColumnInfo _dt9 = createColumnInfo("dt9");
	public final MCDatePermColumn dt9 = createDateColumn(_dt9);
	
	/**
	 * 日付１０. Date 10.<p>
	 *
	 */
	public static final String $dt10 = "dt10";
	private static final MCPermColumnInfo _dt10 = createColumnInfo("dt10");
	public final MCDatePermColumn dt10 = createDateColumn(_dt10);
	
	/**
	 * フラグ１. Flg. 1.<p>
	 *
	 */
	public static final String $flg1 = "flg1";
	private static final MCPermColumnInfo _flg1 = createColumnInfo("flg1");
	public final MCBooleanPermColumn flg1 = createBooleanColumn(_flg1);
	
	/**
	 * フラグ２. Flg. 2.<p>
	 *
	 */
	public static final String $flg2 = "flg2";
	private static final MCPermColumnInfo _flg2 = createColumnInfo("flg2");
	public final MCBooleanPermColumn flg2 = createBooleanColumn(_flg2);
	
	/**
	 * フラグ３. Flg. 3.<p>
	 *
	 */
	public static final String $flg3 = "flg3";
	private static final MCPermColumnInfo _flg3 = createColumnInfo("flg3");
	public final MCBooleanPermColumn flg3 = createBooleanColumn(_flg3);
	
	/**
	 * フラグ４. Flg. 4.<p>
	 *
	 */
	public static final String $flg4 = "flg4";
	private static final MCPermColumnInfo _flg4 = createColumnInfo("flg4");
	public final MCBooleanPermColumn flg4 = createBooleanColumn(_flg4);
	
	/**
	 * フラグ５. Flg. 5.<p>
	 *
	 */
	public static final String $flg5 = "flg5";
	private static final MCPermColumnInfo _flg5 = createColumnInfo("flg5");
	public final MCBooleanPermColumn flg5 = createBooleanColumn(_flg5);
	
	/**
	 * フラグ６. Flg. 6.<p>
	 *
	 */
	public static final String $flg6 = "flg6";
	private static final MCPermColumnInfo _flg6 = createColumnInfo("flg6");
	public final MCBooleanPermColumn flg6 = createBooleanColumn(_flg6);
	
	/**
	 * フラグ７. Flg. 7.<p>
	 *
	 */
	public static final String $flg7 = "flg7";
	private static final MCPermColumnInfo _flg7 = createColumnInfo("flg7");
	public final MCBooleanPermColumn flg7 = createBooleanColumn(_flg7);
	
	/**
	 * フラグ８. Flg. 8.<p>
	 *
	 */
	public static final String $flg8 = "flg8";
	private static final MCPermColumnInfo _flg8 = createColumnInfo("flg8");
	public final MCBooleanPermColumn flg8 = createBooleanColumn(_flg8);
	
	/**
	 * フラグ９. Flg. 9.<p>
	 *
	 */
	public static final String $flg9 = "flg9";
	private static final MCPermColumnInfo _flg9 = createColumnInfo("flg9");
	public final MCBooleanPermColumn flg9 = createBooleanColumn(_flg9);
	
	/**
	 * フラグ１０. Flg. 10.<p>
	 *
	 */
	public static final String $flg10 = "flg10";
	private static final MCPermColumnInfo _flg10 = createColumnInfo("flg10");
	public final MCBooleanPermColumn flg10 = createBooleanColumn(_flg10);
	
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
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	private static final MCPermColumnInfo _del_flg = createColumnInfo("del_flg");
	public final MCBooleanPermColumn del_flg = createBooleanColumn(_del_flg);
	
	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	private static final MCPermColumnInfo _del_usr_id = createColumnInfo("del_usr_id");
	public final MCStringPermColumn del_usr_id = createStringColumn(_del_usr_id);
	
	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	private static final MCPermColumnInfo _del_usr_nm = createColumnInfo("del_usr_nm");
	public final MCStringPermColumn del_usr_nm = createStringColumn(_del_usr_nm);
	
	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	private static final MCPermColumnInfo _del_ts = createColumnInfo("del_ts");
	public final MCTimestampPermColumn del_ts = createTimestampColumn(_del_ts);
	
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
	 * 汎用分類名. General purpose classification name.<p>
	 *
	 */
	public static final String $gp_grp_nm = "gp_grp_nm";
	
	public static final MCMeta gp_grp_cd_META = createCommonMeta($gp_grp_cd, mcframe.commonMA.meta.MA_META.GP_GRP_CD);
	public static final MCMeta key1_META = createCommonMeta($key1, mcframe.commonMA.meta.MA_META.GP_KEY1);
	public static final MCMeta key2_META = createCommonMeta($key2, mcframe.commonMA.meta.MA_META.GP_KEY2);
	public static final MCMeta key3_META = createCommonMeta($key3, mcframe.commonMA.meta.MA_META.GP_KEY3);
	public static final MCMeta key4_META = createCommonMeta($key4, mcframe.commonMA.meta.MA_META.GP_KEY4);
	public static final MCMeta key5_META = createCommonMeta($key5, mcframe.commonMA.meta.MA_META.GP_KEY5);
	public static final MCMeta key6_META = createCommonMeta($key6, mcframe.commonMA.meta.MA_META.GP_KEY6);
	public static final MCMeta key7_META = createCommonMeta($key7, mcframe.commonMA.meta.MA_META.GP_KEY7);
	public static final MCMeta key8_META = createCommonMeta($key8, mcframe.commonMA.meta.MA_META.GP_KEY8);
	public static final MCMeta key9_META = createCommonMeta($key9, mcframe.commonMA.meta.MA_META.GP_KEY9);
	public static final MCMeta key10_META = createCommonMeta($key10, mcframe.commonMA.meta.MA_META.GP_KEY10);
	public static final MCMeta char1_META = createCommonMeta($char1, mcframe.commonMA.meta.MA_META.GP_CHAR1);
	public static final MCMeta base_char1_META = createCommonMeta($base_char1, mcframe.commonMA.meta.MA_META.GP_CHAR1);
	public static final MCMeta char2_META = createCommonMeta($char2, mcframe.commonMA.meta.MA_META.GP_CHAR2);
	public static final MCMeta base_char2_META = createCommonMeta($base_char2, mcframe.commonMA.meta.MA_META.GP_CHAR2);
	public static final MCMeta char3_META = createCommonMeta($char3, mcframe.commonMA.meta.MA_META.GP_CHAR3);
	public static final MCMeta base_char3_META = createCommonMeta($base_char3, mcframe.commonMA.meta.MA_META.GP_CHAR3);
	public static final MCMeta char4_META = createCommonMeta($char4, mcframe.commonMA.meta.MA_META.GP_CHAR4);
	public static final MCMeta base_char4_META = createCommonMeta($base_char4, mcframe.commonMA.meta.MA_META.GP_CHAR4);
	public static final MCMeta char5_META = createCommonMeta($char5, mcframe.commonMA.meta.MA_META.GP_CHAR5);
	public static final MCMeta base_char5_META = createCommonMeta($base_char5, mcframe.commonMA.meta.MA_META.GP_CHAR5);
	public static final MCMeta char6_META = createCommonMeta($char6, mcframe.commonMA.meta.MA_META.GP_CHAR6);
	public static final MCMeta base_char6_META = createCommonMeta($base_char6, mcframe.commonMA.meta.MA_META.GP_CHAR6);
	public static final MCMeta char7_META = createCommonMeta($char7, mcframe.commonMA.meta.MA_META.GP_CHAR7);
	public static final MCMeta base_char7_META = createCommonMeta($base_char7, mcframe.commonMA.meta.MA_META.GP_CHAR7);
	public static final MCMeta char8_META = createCommonMeta($char8, mcframe.commonMA.meta.MA_META.GP_CHAR8);
	public static final MCMeta base_char8_META = createCommonMeta($base_char8, mcframe.commonMA.meta.MA_META.GP_CHAR8);
	public static final MCMeta char9_META = createCommonMeta($char9, mcframe.commonMA.meta.MA_META.GP_CHAR9);
	public static final MCMeta base_char9_META = createCommonMeta($base_char9, mcframe.commonMA.meta.MA_META.GP_CHAR9);
	public static final MCMeta char10_META = createCommonMeta($char10, mcframe.commonMA.meta.MA_META.GP_CHAR10);
	public static final MCMeta base_char10_META = createCommonMeta($base_char10, mcframe.commonMA.meta.MA_META.GP_CHAR10);
	public static final MCMeta char11_META = createCommonMeta($char11, mcframe.commonMA.meta.MA_META.GP_CHAR11);
	public static final MCMeta char12_META = createCommonMeta($char12, mcframe.commonMA.meta.MA_META.GP_CHAR12);
	public static final MCMeta char13_META = createCommonMeta($char13, mcframe.commonMA.meta.MA_META.GP_CHAR13);
	public static final MCMeta char14_META = createCommonMeta($char14, mcframe.commonMA.meta.MA_META.GP_CHAR14);
	public static final MCMeta char15_META = createCommonMeta($char15, mcframe.commonMA.meta.MA_META.GP_CHAR15);
	public static final MCMeta char16_META = createCommonMeta($char16, mcframe.commonMA.meta.MA_META.GP_CHAR16);
	public static final MCMeta char17_META = createCommonMeta($char17, mcframe.commonMA.meta.MA_META.GP_CHAR17);
	public static final MCMeta char18_META = createCommonMeta($char18, mcframe.commonMA.meta.MA_META.GP_CHAR18);
	public static final MCMeta char19_META = createCommonMeta($char19, mcframe.commonMA.meta.MA_META.GP_CHAR19);
	public static final MCMeta char20_META = createCommonMeta($char20, mcframe.commonMA.meta.MA_META.GP_CHAR20);
	public static final MCMeta num1_META = createCommonMeta($num1, mcframe.commonMA.meta.MA_META.GP_NUM1);
	public static final MCMeta num2_META = createCommonMeta($num2, mcframe.commonMA.meta.MA_META.GP_NUM2);
	public static final MCMeta num3_META = createCommonMeta($num3, mcframe.commonMA.meta.MA_META.GP_NUM3);
	public static final MCMeta num4_META = createCommonMeta($num4, mcframe.commonMA.meta.MA_META.GP_NUM4);
	public static final MCMeta num5_META = createCommonMeta($num5, mcframe.commonMA.meta.MA_META.GP_NUM5);
	public static final MCMeta num6_META = createCommonMeta($num6, mcframe.commonMA.meta.MA_META.GP_NUM6);
	public static final MCMeta num7_META = createCommonMeta($num7, mcframe.commonMA.meta.MA_META.GP_NUM7);
	public static final MCMeta num8_META = createCommonMeta($num8, mcframe.commonMA.meta.MA_META.GP_NUM8);
	public static final MCMeta num9_META = createCommonMeta($num9, mcframe.commonMA.meta.MA_META.GP_NUM9);
	public static final MCMeta num10_META = createCommonMeta($num10, mcframe.commonMA.meta.MA_META.GP_NUM10);
	public static final MCMeta dt1_META = createCommonMeta($dt1, mcframe.commonMA.meta.MA_META.GP_DT1);
	public static final MCMeta dt2_META = createCommonMeta($dt2, mcframe.commonMA.meta.MA_META.GP_DT2);
	public static final MCMeta dt3_META = createCommonMeta($dt3, mcframe.commonMA.meta.MA_META.GP_DT3);
	public static final MCMeta dt4_META = createCommonMeta($dt4, mcframe.commonMA.meta.MA_META.GP_DT4);
	public static final MCMeta dt5_META = createCommonMeta($dt5, mcframe.commonMA.meta.MA_META.GP_DT5);
	public static final MCMeta dt6_META = createCommonMeta($dt6, mcframe.commonMA.meta.MA_META.GP_DT6);
	public static final MCMeta dt7_META = createCommonMeta($dt7, mcframe.commonMA.meta.MA_META.GP_DT7);
	public static final MCMeta dt8_META = createCommonMeta($dt8, mcframe.commonMA.meta.MA_META.GP_DT8);
	public static final MCMeta dt9_META = createCommonMeta($dt9, mcframe.commonMA.meta.MA_META.GP_DT9);
	public static final MCMeta dt10_META = createCommonMeta($dt10, mcframe.commonMA.meta.MA_META.GP_DT10);
	public static final MCMeta flg1_META = createCommonMeta($flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg2_META = createCommonMeta($flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg3_META = createCommonMeta($flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg4_META = createCommonMeta($flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg5_META = createCommonMeta($flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg6_META = createCommonMeta($flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg7_META = createCommonMeta($flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg8_META = createCommonMeta($flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg9_META = createCommonMeta($flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg10_META = createCommonMeta($flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
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
	public static final MCMeta gp_grp_nm_META = createCommonMeta($gp_grp_nm, mcframe.commonMA.meta.MA_META.GP_GRP_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $GP_GRP1 = "GP_GRP1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_GP_GRP",
				$GP_GRP1,
				new String[][]{
						{"gp_grp_cd", "gp_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_GP_GRP_R.create("GP_GRP1");
				},
				(alias) -> {
					MAM_GP_R own = MAM_GP_R.create(alias);
					mcframe.serverMA.dbc.MAM_GP_GRP_R ref = mcframe.serverMA.dbc.MAM_GP_GRP_R.create("GP_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.gp_grp_cd.eq(ref.gp_grp_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_GP_R> constMetas = new ConstMetaList<MAM_GP_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			gp_grp_cd_META,
			key1_META,
			key2_META,
			key3_META,
			key4_META,
			key5_META,
			key6_META,
			key7_META,
			key8_META,
			key9_META,
			key10_META,
			char1_META,
			base_char1_META,
			char2_META,
			base_char2_META,
			char3_META,
			base_char3_META,
			char4_META,
			base_char4_META,
			char5_META,
			base_char5_META,
			char6_META,
			base_char6_META,
			char7_META,
			base_char7_META,
			char8_META,
			base_char8_META,
			char9_META,
			base_char9_META,
			char10_META,
			base_char10_META,
			char11_META,
			char12_META,
			char13_META,
			char14_META,
			char15_META,
			char16_META,
			char17_META,
			char18_META,
			char19_META,
			char20_META,
			num1_META,
			num2_META,
			num3_META,
			num4_META,
			num5_META,
			num6_META,
			num7_META,
			num8_META,
			num9_META,
			num10_META,
			dt1_META,
			dt2_META,
			dt3_META,
			dt4_META,
			dt5_META,
			dt6_META,
			dt7_META,
			dt8_META,
			dt9_META,
			dt10_META,
			flg1_META,
			flg2_META,
			flg3_META,
			flg4_META,
			flg5_META,
			flg6_META,
			flg7_META,
			flg8_META,
			flg9_META,
			flg10_META,
			memo1_META,
			memo2_META,
			memo3_META,
			del_flg_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
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
			gp_grp_nm_META
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
	protected MAM_GP_R(ConstMetaList<? extends MAM_GP_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_GP_R(ConstMetaList<? extends MAM_GP_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_GP_R.$gp_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$gp_grp_cd,
				"gp_grp_cd",
				gp_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$key1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$key1,
				"key1",
				key1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$key2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$key2,
				"key2",
				key2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$key3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$key3,
				"key3",
				key3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$key4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$key4,
				"key4",
				key4,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$key5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$key5,
				"key5",
				key5,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$key6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$key6,
				"key6",
				key6,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$key7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$key7,
				"key7",
				key7,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$key8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$key8,
				"key8",
				key8,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$key9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$key9,
				"key9",
				key9,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$key10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$key10,
				"key10",
				key10,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char1,
				"char1",
				char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$base_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$base_char1,
				"base_char1",
				base_char1,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char2,
				"char2",
				char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$base_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$base_char2,
				"base_char2",
				base_char2,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char3,
				"char3",
				char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$base_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$base_char3,
				"base_char3",
				base_char3,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char4,
				"char4",
				char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$base_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$base_char4,
				"base_char4",
				base_char4,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char5,
				"char5",
				char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$base_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$base_char5,
				"base_char5",
				base_char5,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char6,
				"char6",
				char6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$base_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$base_char6,
				"base_char6",
				base_char6,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char7,
				"char7",
				char7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$base_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$base_char7,
				"base_char7",
				base_char7,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char8,
				"char8",
				char8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$base_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$base_char8,
				"base_char8",
				base_char8,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char9,
				"char9",
				char9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$base_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$base_char9,
				"base_char9",
				base_char9,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char10,
				"char10",
				char10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$base_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$base_char10,
				"base_char10",
				base_char10,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char11,
				"char11",
				char11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char12,
				"char12",
				char12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char13,
				"char13",
				char13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char14,
				"char14",
				char14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char15,
				"char15",
				char15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char16,
				"char16",
				char16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char17,
				"char17",
				char17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char18,
				"char18",
				char18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char19,
				"char19",
				char19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$char20,
				"char20",
				char20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$num1,
				"num1",
				num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$num2,
				"num2",
				num2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$num3,
				"num3",
				num3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$num4,
				"num4",
				num4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$num5,
				"num5",
				num5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$num6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$num6,
				"num6",
				num6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$num7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$num7,
				"num7",
				num7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$num8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$num8,
				"num8",
				num8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$num9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$num9,
				"num9",
				num9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$num10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$num10,
				"num10",
				num10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_GP_R.$dt1,
				"dt1",
				dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_GP_R.$dt2,
				"dt2",
				dt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_GP_R.$dt3,
				"dt3",
				dt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_GP_R.$dt4,
				"dt4",
				dt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_GP_R.$dt5,
				"dt5",
				dt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$dt6,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_GP_R.$dt6,
				"dt6",
				dt6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$dt7,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_GP_R.$dt7,
				"dt7",
				dt7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$dt8,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_GP_R.$dt8,
				"dt8",
				dt8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$dt9,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_GP_R.$dt9,
				"dt9",
				dt9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$dt10,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_GP_R.$dt10,
				"dt10",
				dt10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$flg1,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$flg1,
				"flg1",
				flg1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$flg2,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$flg2,
				"flg2",
				flg2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$flg3,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$flg3,
				"flg3",
				flg3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$flg4,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$flg4,
				"flg4",
				flg4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$flg5,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$flg5,
				"flg5",
				flg5,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$flg6,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$flg6,
				"flg6",
				flg6,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$flg7,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$flg7,
				"flg7",
				flg7,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$flg8,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$flg8,
				"flg8",
				flg8,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$flg9,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$flg9,
				"flg9",
				flg9,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$flg10,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$flg10,
				"flg10",
				flg10,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$memo1,
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
			MAM_GP_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$memo2,
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
			MAM_GP_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$memo3,
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
			MAM_GP_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GP_R.$del_flg,
				"del_flg",
				del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$del_usr_id,
				"del_usr_id",
				del_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$del_usr_nm,
				"del_usr_nm",
				del_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_GP_R.$del_ts,
				"del_ts",
				del_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$ins_usr_id,
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
			MAM_GP_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$ins_usr_nm,
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
			MAM_GP_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_GP_R.$ins_ts,
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
			MAM_GP_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$ins_func_id,
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
			MAM_GP_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_R.$upd_cntr,
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
			MAM_GP_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$upd_usr_id,
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
			MAM_GP_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$upd_usr_nm,
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
			MAM_GP_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_GP_R.$upd_ts,
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
			MAM_GP_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$upd_func_id,
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
			MAM_GP_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$upd_srv_req_no,
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
			MAM_GP_R.$gp_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_R.$gp_grp_nm,
				"gp_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"GP_GRP1"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_GP_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_GP_R create(String alias) {
		MAM_GP_R row = new MAM_GP_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_GP_R createByName(T proto) {
		MAM_GP_R row = MAM_GP_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_GP_R clone() {
		return (MAM_GP_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_GP_R createInstance() {
		return (MAM_GP_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_GP_R getValues(String... names) {
		return (MAM_GP_R) super.getValues(names);
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
		return true;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_GP_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_GP_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_GP_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_GP_KEY_R.TABLE_NAME);
	 }

	/**
	 * 汎用分類ＣＤ. General purpose classification cd..<p>
	 *
	 */
	public String gp_grp_cd() {
		return getConstString(offset + 0, $gp_grp_cd);
	}

	/**
	 * 汎用分類ＣＤ. General purpose classification cd..<p>
	 *
	 */
	public void gp_grp_cd(String value) {
		setConstString(offset + 0, $gp_grp_cd, value);
	}

	/**
	 * キー１. Key 1.<p>
	 *
	 */
	public String key1() {
		return getConstString(offset + 1, $key1);
	}

	/**
	 * キー１. Key 1.<p>
	 *
	 */
	public void key1(String value) {
		setConstString(offset + 1, $key1, value);
	}

	/**
	 * キー２. Key 2.<p>
	 *
	 */
	public String key2() {
		return getConstString(offset + 2, $key2);
	}

	/**
	 * キー２. Key 2.<p>
	 *
	 */
	public void key2(String value) {
		setConstString(offset + 2, $key2, value);
	}

	/**
	 * キー３. Key 3.<p>
	 *
	 */
	public String key3() {
		return getConstString(offset + 3, $key3);
	}

	/**
	 * キー３. Key 3.<p>
	 *
	 */
	public void key3(String value) {
		setConstString(offset + 3, $key3, value);
	}

	/**
	 * キー４. Key 4.<p>
	 *
	 */
	public String key4() {
		return getConstString(offset + 4, $key4);
	}

	/**
	 * キー４. Key 4.<p>
	 *
	 */
	public void key4(String value) {
		setConstString(offset + 4, $key4, value);
	}

	/**
	 * キー５. Key 5.<p>
	 *
	 */
	public String key5() {
		return getConstString(offset + 5, $key5);
	}

	/**
	 * キー５. Key 5.<p>
	 *
	 */
	public void key5(String value) {
		setConstString(offset + 5, $key5, value);
	}

	/**
	 * キー６. Key 6.<p>
	 *
	 */
	public String key6() {
		return getConstString(offset + 6, $key6);
	}

	/**
	 * キー６. Key 6.<p>
	 *
	 */
	public void key6(String value) {
		setConstString(offset + 6, $key6, value);
	}

	/**
	 * キー７. Key 7.<p>
	 *
	 */
	public String key7() {
		return getConstString(offset + 7, $key7);
	}

	/**
	 * キー７. Key 7.<p>
	 *
	 */
	public void key7(String value) {
		setConstString(offset + 7, $key7, value);
	}

	/**
	 * キー８. Key 8.<p>
	 *
	 */
	public String key8() {
		return getConstString(offset + 8, $key8);
	}

	/**
	 * キー８. Key 8.<p>
	 *
	 */
	public void key8(String value) {
		setConstString(offset + 8, $key8, value);
	}

	/**
	 * キー９. Key 9.<p>
	 *
	 */
	public String key9() {
		return getConstString(offset + 9, $key9);
	}

	/**
	 * キー９. Key 9.<p>
	 *
	 */
	public void key9(String value) {
		setConstString(offset + 9, $key9, value);
	}

	/**
	 * キー１０. Key 10.<p>
	 *
	 */
	public String key10() {
		return getConstString(offset + 10, $key10);
	}

	/**
	 * キー１０. Key 10.<p>
	 *
	 */
	public void key10(String value) {
		setConstString(offset + 10, $key10, value);
	}

	/**
	 * 文字列１. String 1.<p>
	 *
	 */
	public String char1() {
		return getConstString(offset + 11, $char1);
	}

	/**
	 * 文字列１. String 1.<p>
	 *
	 */
	public void char1(String value) {
		setConstString(offset + 11, $char1, value);
	}

	/**
	 * 文字列１（ベース）. String 1(Base).<p>
	 *
	 */
	public String base_char1() {
		return getConstString(offset + 12, $base_char1);
	}

	/**
	 * 文字列１（ベース）. String 1(Base).<p>
	 *
	 */
	public void base_char1(String value) {
		setConstString(offset + 12, $base_char1, value);
	}

	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public String char2() {
		return getConstString(offset + 13, $char2);
	}

	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public void char2(String value) {
		setConstString(offset + 13, $char2, value);
	}

	/**
	 * 文字列２（ベース）. String 2(Base).<p>
	 *
	 */
	public String base_char2() {
		return getConstString(offset + 14, $base_char2);
	}

	/**
	 * 文字列２（ベース）. String 2(Base).<p>
	 *
	 */
	public void base_char2(String value) {
		setConstString(offset + 14, $base_char2, value);
	}

	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public String char3() {
		return getConstString(offset + 15, $char3);
	}

	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public void char3(String value) {
		setConstString(offset + 15, $char3, value);
	}

	/**
	 * 文字列３（ベース）. String 3(Base).<p>
	 *
	 */
	public String base_char3() {
		return getConstString(offset + 16, $base_char3);
	}

	/**
	 * 文字列３（ベース）. String 3(Base).<p>
	 *
	 */
	public void base_char3(String value) {
		setConstString(offset + 16, $base_char3, value);
	}

	/**
	 * 文字列４. String 4.<p>
	 *
	 */
	public String char4() {
		return getConstString(offset + 17, $char4);
	}

	/**
	 * 文字列４. String 4.<p>
	 *
	 */
	public void char4(String value) {
		setConstString(offset + 17, $char4, value);
	}

	/**
	 * 文字列４（ベース）. String 4(Base).<p>
	 *
	 */
	public String base_char4() {
		return getConstString(offset + 18, $base_char4);
	}

	/**
	 * 文字列４（ベース）. String 4(Base).<p>
	 *
	 */
	public void base_char4(String value) {
		setConstString(offset + 18, $base_char4, value);
	}

	/**
	 * 文字列５. String 5.<p>
	 *
	 */
	public String char5() {
		return getConstString(offset + 19, $char5);
	}

	/**
	 * 文字列５. String 5.<p>
	 *
	 */
	public void char5(String value) {
		setConstString(offset + 19, $char5, value);
	}

	/**
	 * 文字列５（ベース）. String 5(Base).<p>
	 *
	 */
	public String base_char5() {
		return getConstString(offset + 20, $base_char5);
	}

	/**
	 * 文字列５（ベース）. String 5(Base).<p>
	 *
	 */
	public void base_char5(String value) {
		setConstString(offset + 20, $base_char5, value);
	}

	/**
	 * 文字列６. String 6.<p>
	 *
	 */
	public String char6() {
		return getConstString(offset + 21, $char6);
	}

	/**
	 * 文字列６. String 6.<p>
	 *
	 */
	public void char6(String value) {
		setConstString(offset + 21, $char6, value);
	}

	/**
	 * 文字列６（ベース）. String 6(Base).<p>
	 *
	 */
	public String base_char6() {
		return getConstString(offset + 22, $base_char6);
	}

	/**
	 * 文字列６（ベース）. String 6(Base).<p>
	 *
	 */
	public void base_char6(String value) {
		setConstString(offset + 22, $base_char6, value);
	}

	/**
	 * 文字列７. String 7.<p>
	 *
	 */
	public String char7() {
		return getConstString(offset + 23, $char7);
	}

	/**
	 * 文字列７. String 7.<p>
	 *
	 */
	public void char7(String value) {
		setConstString(offset + 23, $char7, value);
	}

	/**
	 * 文字列７（ベース）. String 7(Base).<p>
	 *
	 */
	public String base_char7() {
		return getConstString(offset + 24, $base_char7);
	}

	/**
	 * 文字列７（ベース）. String 7(Base).<p>
	 *
	 */
	public void base_char7(String value) {
		setConstString(offset + 24, $base_char7, value);
	}

	/**
	 * 文字列８. String 8.<p>
	 *
	 */
	public String char8() {
		return getConstString(offset + 25, $char8);
	}

	/**
	 * 文字列８. String 8.<p>
	 *
	 */
	public void char8(String value) {
		setConstString(offset + 25, $char8, value);
	}

	/**
	 * 文字列８（ベース）. String 8(Base).<p>
	 *
	 */
	public String base_char8() {
		return getConstString(offset + 26, $base_char8);
	}

	/**
	 * 文字列８（ベース）. String 8(Base).<p>
	 *
	 */
	public void base_char8(String value) {
		setConstString(offset + 26, $base_char8, value);
	}

	/**
	 * 文字列９. String 9.<p>
	 *
	 */
	public String char9() {
		return getConstString(offset + 27, $char9);
	}

	/**
	 * 文字列９. String 9.<p>
	 *
	 */
	public void char9(String value) {
		setConstString(offset + 27, $char9, value);
	}

	/**
	 * 文字列９（ベース）. String 9(Base).<p>
	 *
	 */
	public String base_char9() {
		return getConstString(offset + 28, $base_char9);
	}

	/**
	 * 文字列９（ベース）. String 9(Base).<p>
	 *
	 */
	public void base_char9(String value) {
		setConstString(offset + 28, $base_char9, value);
	}

	/**
	 * 文字列１０. String 10.<p>
	 *
	 */
	public String char10() {
		return getConstString(offset + 29, $char10);
	}

	/**
	 * 文字列１０. String 10.<p>
	 *
	 */
	public void char10(String value) {
		setConstString(offset + 29, $char10, value);
	}

	/**
	 * 文字列１０（ベース）. String 10(Base).<p>
	 *
	 */
	public String base_char10() {
		return getConstString(offset + 30, $base_char10);
	}

	/**
	 * 文字列１０（ベース）. String 10(Base).<p>
	 *
	 */
	public void base_char10(String value) {
		setConstString(offset + 30, $base_char10, value);
	}

	/**
	 * 文字列１１. String 11.<p>
	 *
	 */
	public String char11() {
		return getConstString(offset + 31, $char11);
	}

	/**
	 * 文字列１１. String 11.<p>
	 *
	 */
	public void char11(String value) {
		setConstString(offset + 31, $char11, value);
	}

	/**
	 * 文字列１２. String 12.<p>
	 *
	 */
	public String char12() {
		return getConstString(offset + 32, $char12);
	}

	/**
	 * 文字列１２. String 12.<p>
	 *
	 */
	public void char12(String value) {
		setConstString(offset + 32, $char12, value);
	}

	/**
	 * 文字列１３. String 13.<p>
	 *
	 */
	public String char13() {
		return getConstString(offset + 33, $char13);
	}

	/**
	 * 文字列１３. String 13.<p>
	 *
	 */
	public void char13(String value) {
		setConstString(offset + 33, $char13, value);
	}

	/**
	 * 文字列１４. String 14.<p>
	 *
	 */
	public String char14() {
		return getConstString(offset + 34, $char14);
	}

	/**
	 * 文字列１４. String 14.<p>
	 *
	 */
	public void char14(String value) {
		setConstString(offset + 34, $char14, value);
	}

	/**
	 * 文字列１５. String 15.<p>
	 *
	 */
	public String char15() {
		return getConstString(offset + 35, $char15);
	}

	/**
	 * 文字列１５. String 15.<p>
	 *
	 */
	public void char15(String value) {
		setConstString(offset + 35, $char15, value);
	}

	/**
	 * 文字列１６. String 16.<p>
	 *
	 */
	public String char16() {
		return getConstString(offset + 36, $char16);
	}

	/**
	 * 文字列１６. String 16.<p>
	 *
	 */
	public void char16(String value) {
		setConstString(offset + 36, $char16, value);
	}

	/**
	 * 文字列１７. String 17.<p>
	 *
	 */
	public String char17() {
		return getConstString(offset + 37, $char17);
	}

	/**
	 * 文字列１７. String 17.<p>
	 *
	 */
	public void char17(String value) {
		setConstString(offset + 37, $char17, value);
	}

	/**
	 * 文字列１８. String 18.<p>
	 *
	 */
	public String char18() {
		return getConstString(offset + 38, $char18);
	}

	/**
	 * 文字列１８. String 18.<p>
	 *
	 */
	public void char18(String value) {
		setConstString(offset + 38, $char18, value);
	}

	/**
	 * 文字列１９. String 19.<p>
	 *
	 */
	public String char19() {
		return getConstString(offset + 39, $char19);
	}

	/**
	 * 文字列１９. String 19.<p>
	 *
	 */
	public void char19(String value) {
		setConstString(offset + 39, $char19, value);
	}

	/**
	 * 文字列２０. String 20.<p>
	 *
	 */
	public String char20() {
		return getConstString(offset + 40, $char20);
	}

	/**
	 * 文字列２０. String 20.<p>
	 *
	 */
	public void char20(String value) {
		setConstString(offset + 40, $char20, value);
	}

	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public MCNumber num1() {
		return getConstNumber(offset + 41, $num1);
	}

	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public void num1(MCNumber value) {
		setConstNumber(offset + 41, $num1, value);
	}
	
	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public void num1(int value) {
		setConstNumber(offset + 41, $num1, value);
	}
	
	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public void num1(long value) {
		setConstNumber(offset + 41, $num1, value);
	}
	
	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public void num1(float value) {
		setConstNumber(offset + 41, $num1, value);
	}
	
	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public void num1(double value) {
		setConstNumber(offset + 41, $num1, value);
	}
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public MCNumber num2() {
		return getConstNumber(offset + 42, $num2);
	}

	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public void num2(MCNumber value) {
		setConstNumber(offset + 42, $num2, value);
	}
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public void num2(int value) {
		setConstNumber(offset + 42, $num2, value);
	}
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public void num2(long value) {
		setConstNumber(offset + 42, $num2, value);
	}
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public void num2(float value) {
		setConstNumber(offset + 42, $num2, value);
	}
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public void num2(double value) {
		setConstNumber(offset + 42, $num2, value);
	}
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public MCNumber num3() {
		return getConstNumber(offset + 43, $num3);
	}

	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public void num3(MCNumber value) {
		setConstNumber(offset + 43, $num3, value);
	}
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public void num3(int value) {
		setConstNumber(offset + 43, $num3, value);
	}
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public void num3(long value) {
		setConstNumber(offset + 43, $num3, value);
	}
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public void num3(float value) {
		setConstNumber(offset + 43, $num3, value);
	}
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public void num3(double value) {
		setConstNumber(offset + 43, $num3, value);
	}
	
	/**
	 * 数値４. Numerical 4.<p>
	 *
	 */
	public MCNumber num4() {
		return getConstNumber(offset + 44, $num4);
	}

	/**
	 * 数値４. Numerical 4.<p>
	 *
	 */
	public void num4(MCNumber value) {
		setConstNumber(offset + 44, $num4, value);
	}
	
	/**
	 * 数値４. Numerical 4.<p>
	 *
	 */
	public void num4(int value) {
		setConstNumber(offset + 44, $num4, value);
	}
	
	/**
	 * 数値４. Numerical 4.<p>
	 *
	 */
	public void num4(long value) {
		setConstNumber(offset + 44, $num4, value);
	}
	
	/**
	 * 数値４. Numerical 4.<p>
	 *
	 */
	public void num4(float value) {
		setConstNumber(offset + 44, $num4, value);
	}
	
	/**
	 * 数値４. Numerical 4.<p>
	 *
	 */
	public void num4(double value) {
		setConstNumber(offset + 44, $num4, value);
	}
	
	/**
	 * 数値５. Numerical 5.<p>
	 *
	 */
	public MCNumber num5() {
		return getConstNumber(offset + 45, $num5);
	}

	/**
	 * 数値５. Numerical 5.<p>
	 *
	 */
	public void num5(MCNumber value) {
		setConstNumber(offset + 45, $num5, value);
	}
	
	/**
	 * 数値５. Numerical 5.<p>
	 *
	 */
	public void num5(int value) {
		setConstNumber(offset + 45, $num5, value);
	}
	
	/**
	 * 数値５. Numerical 5.<p>
	 *
	 */
	public void num5(long value) {
		setConstNumber(offset + 45, $num5, value);
	}
	
	/**
	 * 数値５. Numerical 5.<p>
	 *
	 */
	public void num5(float value) {
		setConstNumber(offset + 45, $num5, value);
	}
	
	/**
	 * 数値５. Numerical 5.<p>
	 *
	 */
	public void num5(double value) {
		setConstNumber(offset + 45, $num5, value);
	}
	
	/**
	 * 数値６. Numerical 6.<p>
	 *
	 */
	public MCNumber num6() {
		return getConstNumber(offset + 46, $num6);
	}

	/**
	 * 数値６. Numerical 6.<p>
	 *
	 */
	public void num6(MCNumber value) {
		setConstNumber(offset + 46, $num6, value);
	}
	
	/**
	 * 数値６. Numerical 6.<p>
	 *
	 */
	public void num6(int value) {
		setConstNumber(offset + 46, $num6, value);
	}
	
	/**
	 * 数値６. Numerical 6.<p>
	 *
	 */
	public void num6(long value) {
		setConstNumber(offset + 46, $num6, value);
	}
	
	/**
	 * 数値６. Numerical 6.<p>
	 *
	 */
	public void num6(float value) {
		setConstNumber(offset + 46, $num6, value);
	}
	
	/**
	 * 数値６. Numerical 6.<p>
	 *
	 */
	public void num6(double value) {
		setConstNumber(offset + 46, $num6, value);
	}
	
	/**
	 * 数値７. Numerical 7.<p>
	 *
	 */
	public MCNumber num7() {
		return getConstNumber(offset + 47, $num7);
	}

	/**
	 * 数値７. Numerical 7.<p>
	 *
	 */
	public void num7(MCNumber value) {
		setConstNumber(offset + 47, $num7, value);
	}
	
	/**
	 * 数値７. Numerical 7.<p>
	 *
	 */
	public void num7(int value) {
		setConstNumber(offset + 47, $num7, value);
	}
	
	/**
	 * 数値７. Numerical 7.<p>
	 *
	 */
	public void num7(long value) {
		setConstNumber(offset + 47, $num7, value);
	}
	
	/**
	 * 数値７. Numerical 7.<p>
	 *
	 */
	public void num7(float value) {
		setConstNumber(offset + 47, $num7, value);
	}
	
	/**
	 * 数値７. Numerical 7.<p>
	 *
	 */
	public void num7(double value) {
		setConstNumber(offset + 47, $num7, value);
	}
	
	/**
	 * 数値８. Numerical 8.<p>
	 *
	 */
	public MCNumber num8() {
		return getConstNumber(offset + 48, $num8);
	}

	/**
	 * 数値８. Numerical 8.<p>
	 *
	 */
	public void num8(MCNumber value) {
		setConstNumber(offset + 48, $num8, value);
	}
	
	/**
	 * 数値８. Numerical 8.<p>
	 *
	 */
	public void num8(int value) {
		setConstNumber(offset + 48, $num8, value);
	}
	
	/**
	 * 数値８. Numerical 8.<p>
	 *
	 */
	public void num8(long value) {
		setConstNumber(offset + 48, $num8, value);
	}
	
	/**
	 * 数値８. Numerical 8.<p>
	 *
	 */
	public void num8(float value) {
		setConstNumber(offset + 48, $num8, value);
	}
	
	/**
	 * 数値８. Numerical 8.<p>
	 *
	 */
	public void num8(double value) {
		setConstNumber(offset + 48, $num8, value);
	}
	
	/**
	 * 数値９. Numerical 9.<p>
	 *
	 */
	public MCNumber num9() {
		return getConstNumber(offset + 49, $num9);
	}

	/**
	 * 数値９. Numerical 9.<p>
	 *
	 */
	public void num9(MCNumber value) {
		setConstNumber(offset + 49, $num9, value);
	}
	
	/**
	 * 数値９. Numerical 9.<p>
	 *
	 */
	public void num9(int value) {
		setConstNumber(offset + 49, $num9, value);
	}
	
	/**
	 * 数値９. Numerical 9.<p>
	 *
	 */
	public void num9(long value) {
		setConstNumber(offset + 49, $num9, value);
	}
	
	/**
	 * 数値９. Numerical 9.<p>
	 *
	 */
	public void num9(float value) {
		setConstNumber(offset + 49, $num9, value);
	}
	
	/**
	 * 数値９. Numerical 9.<p>
	 *
	 */
	public void num9(double value) {
		setConstNumber(offset + 49, $num9, value);
	}
	
	/**
	 * 数値１０. Numerical 10.<p>
	 *
	 */
	public MCNumber num10() {
		return getConstNumber(offset + 50, $num10);
	}

	/**
	 * 数値１０. Numerical 10.<p>
	 *
	 */
	public void num10(MCNumber value) {
		setConstNumber(offset + 50, $num10, value);
	}
	
	/**
	 * 数値１０. Numerical 10.<p>
	 *
	 */
	public void num10(int value) {
		setConstNumber(offset + 50, $num10, value);
	}
	
	/**
	 * 数値１０. Numerical 10.<p>
	 *
	 */
	public void num10(long value) {
		setConstNumber(offset + 50, $num10, value);
	}
	
	/**
	 * 数値１０. Numerical 10.<p>
	 *
	 */
	public void num10(float value) {
		setConstNumber(offset + 50, $num10, value);
	}
	
	/**
	 * 数値１０. Numerical 10.<p>
	 *
	 */
	public void num10(double value) {
		setConstNumber(offset + 50, $num10, value);
	}
	
	/**
	 * 日付１. Date 1.<p>
	 *
	 */
	public MCDate dt1() {
		return getConstDate(offset + 51, $dt1);
	}

	/**
	 * 日付１. Date 1.<p>
	 *
	 */
	public void dt1(MCDate value) {
		setConstDate(offset + 51, $dt1, value);
	}

	/**
	 * 日付２. Date 2.<p>
	 *
	 */
	public MCDate dt2() {
		return getConstDate(offset + 52, $dt2);
	}

	/**
	 * 日付２. Date 2.<p>
	 *
	 */
	public void dt2(MCDate value) {
		setConstDate(offset + 52, $dt2, value);
	}

	/**
	 * 日付３. Date 3.<p>
	 *
	 */
	public MCDate dt3() {
		return getConstDate(offset + 53, $dt3);
	}

	/**
	 * 日付３. Date 3.<p>
	 *
	 */
	public void dt3(MCDate value) {
		setConstDate(offset + 53, $dt3, value);
	}

	/**
	 * 日付４. Date 4.<p>
	 *
	 */
	public MCDate dt4() {
		return getConstDate(offset + 54, $dt4);
	}

	/**
	 * 日付４. Date 4.<p>
	 *
	 */
	public void dt4(MCDate value) {
		setConstDate(offset + 54, $dt4, value);
	}

	/**
	 * 日付５. Date 5.<p>
	 *
	 */
	public MCDate dt5() {
		return getConstDate(offset + 55, $dt5);
	}

	/**
	 * 日付５. Date 5.<p>
	 *
	 */
	public void dt5(MCDate value) {
		setConstDate(offset + 55, $dt5, value);
	}

	/**
	 * 日付６. Date 6.<p>
	 *
	 */
	public MCDate dt6() {
		return getConstDate(offset + 56, $dt6);
	}

	/**
	 * 日付６. Date 6.<p>
	 *
	 */
	public void dt6(MCDate value) {
		setConstDate(offset + 56, $dt6, value);
	}

	/**
	 * 日付７. Date 7.<p>
	 *
	 */
	public MCDate dt7() {
		return getConstDate(offset + 57, $dt7);
	}

	/**
	 * 日付７. Date 7.<p>
	 *
	 */
	public void dt7(MCDate value) {
		setConstDate(offset + 57, $dt7, value);
	}

	/**
	 * 日付８. Date 8.<p>
	 *
	 */
	public MCDate dt8() {
		return getConstDate(offset + 58, $dt8);
	}

	/**
	 * 日付８. Date 8.<p>
	 *
	 */
	public void dt8(MCDate value) {
		setConstDate(offset + 58, $dt8, value);
	}

	/**
	 * 日付９. Date 9.<p>
	 *
	 */
	public MCDate dt9() {
		return getConstDate(offset + 59, $dt9);
	}

	/**
	 * 日付９. Date 9.<p>
	 *
	 */
	public void dt9(MCDate value) {
		setConstDate(offset + 59, $dt9, value);
	}

	/**
	 * 日付１０. Date 10.<p>
	 *
	 */
	public MCDate dt10() {
		return getConstDate(offset + 60, $dt10);
	}

	/**
	 * 日付１０. Date 10.<p>
	 *
	 */
	public void dt10(MCDate value) {
		setConstDate(offset + 60, $dt10, value);
	}

	/**
	 * フラグ１. Flg. 1.<p>
	 *
	 */
	public boolean flg1() {
		return getConstBoolean(offset + 61, $flg1);
	}

	/**
	 * フラグ１. Flg. 1.<p>
	 *
	 */
	public void flg1(boolean value) {
		setConstBoolean(offset + 61, $flg1, value);
	}

	/**
	 * フラグ２. Flg. 2.<p>
	 *
	 */
	public boolean flg2() {
		return getConstBoolean(offset + 62, $flg2);
	}

	/**
	 * フラグ２. Flg. 2.<p>
	 *
	 */
	public void flg2(boolean value) {
		setConstBoolean(offset + 62, $flg2, value);
	}

	/**
	 * フラグ３. Flg. 3.<p>
	 *
	 */
	public boolean flg3() {
		return getConstBoolean(offset + 63, $flg3);
	}

	/**
	 * フラグ３. Flg. 3.<p>
	 *
	 */
	public void flg3(boolean value) {
		setConstBoolean(offset + 63, $flg3, value);
	}

	/**
	 * フラグ４. Flg. 4.<p>
	 *
	 */
	public boolean flg4() {
		return getConstBoolean(offset + 64, $flg4);
	}

	/**
	 * フラグ４. Flg. 4.<p>
	 *
	 */
	public void flg4(boolean value) {
		setConstBoolean(offset + 64, $flg4, value);
	}

	/**
	 * フラグ５. Flg. 5.<p>
	 *
	 */
	public boolean flg5() {
		return getConstBoolean(offset + 65, $flg5);
	}

	/**
	 * フラグ５. Flg. 5.<p>
	 *
	 */
	public void flg5(boolean value) {
		setConstBoolean(offset + 65, $flg5, value);
	}

	/**
	 * フラグ６. Flg. 6.<p>
	 *
	 */
	public boolean flg6() {
		return getConstBoolean(offset + 66, $flg6);
	}

	/**
	 * フラグ６. Flg. 6.<p>
	 *
	 */
	public void flg6(boolean value) {
		setConstBoolean(offset + 66, $flg6, value);
	}

	/**
	 * フラグ７. Flg. 7.<p>
	 *
	 */
	public boolean flg7() {
		return getConstBoolean(offset + 67, $flg7);
	}

	/**
	 * フラグ７. Flg. 7.<p>
	 *
	 */
	public void flg7(boolean value) {
		setConstBoolean(offset + 67, $flg7, value);
	}

	/**
	 * フラグ８. Flg. 8.<p>
	 *
	 */
	public boolean flg8() {
		return getConstBoolean(offset + 68, $flg8);
	}

	/**
	 * フラグ８. Flg. 8.<p>
	 *
	 */
	public void flg8(boolean value) {
		setConstBoolean(offset + 68, $flg8, value);
	}

	/**
	 * フラグ９. Flg. 9.<p>
	 *
	 */
	public boolean flg9() {
		return getConstBoolean(offset + 69, $flg9);
	}

	/**
	 * フラグ９. Flg. 9.<p>
	 *
	 */
	public void flg9(boolean value) {
		setConstBoolean(offset + 69, $flg9, value);
	}

	/**
	 * フラグ１０. Flg. 10.<p>
	 *
	 */
	public boolean flg10() {
		return getConstBoolean(offset + 70, $flg10);
	}

	/**
	 * フラグ１０. Flg. 10.<p>
	 *
	 */
	public void flg10(boolean value) {
		setConstBoolean(offset + 70, $flg10, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 71, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 71, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 72, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 72, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 73, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 73, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 74, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 74, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 75, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 75, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 76, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 76, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 77, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 77, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 78, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 78, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 79, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 79, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 80, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 80, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 81, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 81, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 82, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 82, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 82, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 82, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 82, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 82, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 83, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 83, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 84, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 84, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 85, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 85, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 86, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 86, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 87, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 87, $upd_srv_req_no, value);
	}

	/**
	 * 汎用分類名. General purpose classification name.<p>
	 *
	 */
	public String gp_grp_nm() {
		return getConstString(offset + 88, $gp_grp_nm);
	}

	/**
	 * 汎用分類名. General purpose classification name.<p>
	 *
	 */
	public void gp_grp_nm(String value) {
		setConstString(offset + 88, $gp_grp_nm, value);
	}

	public String getString(String name) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
		}
		if ($char1.equalsIgnoreCase(name)) {
			return char1();
		}
		if ($base_char1.equalsIgnoreCase(name)) {
			return base_char1();
		}
		if ($char2.equalsIgnoreCase(name)) {
			return char2();
		}
		if ($base_char2.equalsIgnoreCase(name)) {
			return base_char2();
		}
		if ($char3.equalsIgnoreCase(name)) {
			return char3();
		}
		if ($base_char3.equalsIgnoreCase(name)) {
			return base_char3();
		}
		if ($char4.equalsIgnoreCase(name)) {
			return char4();
		}
		if ($base_char4.equalsIgnoreCase(name)) {
			return base_char4();
		}
		if ($char5.equalsIgnoreCase(name)) {
			return char5();
		}
		if ($base_char5.equalsIgnoreCase(name)) {
			return base_char5();
		}
		if ($char6.equalsIgnoreCase(name)) {
			return char6();
		}
		if ($base_char6.equalsIgnoreCase(name)) {
			return base_char6();
		}
		if ($char7.equalsIgnoreCase(name)) {
			return char7();
		}
		if ($base_char7.equalsIgnoreCase(name)) {
			return base_char7();
		}
		if ($char8.equalsIgnoreCase(name)) {
			return char8();
		}
		if ($base_char8.equalsIgnoreCase(name)) {
			return base_char8();
		}
		if ($char9.equalsIgnoreCase(name)) {
			return char9();
		}
		if ($base_char9.equalsIgnoreCase(name)) {
			return base_char9();
		}
		if ($char10.equalsIgnoreCase(name)) {
			return char10();
		}
		if ($base_char10.equalsIgnoreCase(name)) {
			return base_char10();
		}
		if ($char11.equalsIgnoreCase(name)) {
			return char11();
		}
		if ($char12.equalsIgnoreCase(name)) {
			return char12();
		}
		if ($char13.equalsIgnoreCase(name)) {
			return char13();
		}
		if ($char14.equalsIgnoreCase(name)) {
			return char14();
		}
		if ($char15.equalsIgnoreCase(name)) {
			return char15();
		}
		if ($char16.equalsIgnoreCase(name)) {
			return char16();
		}
		if ($char17.equalsIgnoreCase(name)) {
			return char17();
		}
		if ($char18.equalsIgnoreCase(name)) {
			return char18();
		}
		if ($char19.equalsIgnoreCase(name)) {
			return char19();
		}
		if ($char20.equalsIgnoreCase(name)) {
			return char20();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
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
		if ($gp_grp_nm.equalsIgnoreCase(name)) {
			return gp_grp_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($num1.equalsIgnoreCase(name)) {
			return num1();
		}
		if ($num2.equalsIgnoreCase(name)) {
			return num2();
		}
		if ($num3.equalsIgnoreCase(name)) {
			return num3();
		}
		if ($num4.equalsIgnoreCase(name)) {
			return num4();
		}
		if ($num5.equalsIgnoreCase(name)) {
			return num5();
		}
		if ($num6.equalsIgnoreCase(name)) {
			return num6();
		}
		if ($num7.equalsIgnoreCase(name)) {
			return num7();
		}
		if ($num8.equalsIgnoreCase(name)) {
			return num8();
		}
		if ($num9.equalsIgnoreCase(name)) {
			return num9();
		}
		if ($num10.equalsIgnoreCase(name)) {
			return num10();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($dt1.equalsIgnoreCase(name)) {
			return dt1();
		}
		if ($dt2.equalsIgnoreCase(name)) {
			return dt2();
		}
		if ($dt3.equalsIgnoreCase(name)) {
			return dt3();
		}
		if ($dt4.equalsIgnoreCase(name)) {
			return dt4();
		}
		if ($dt5.equalsIgnoreCase(name)) {
			return dt5();
		}
		if ($dt6.equalsIgnoreCase(name)) {
			return dt6();
		}
		if ($dt7.equalsIgnoreCase(name)) {
			return dt7();
		}
		if ($dt8.equalsIgnoreCase(name)) {
			return dt8();
		}
		if ($dt9.equalsIgnoreCase(name)) {
			return dt9();
		}
		if ($dt10.equalsIgnoreCase(name)) {
			return dt10();
		}
		return super.getDate(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($flg1.equalsIgnoreCase(name)) {
			return flg1();
		}
		if ($flg2.equalsIgnoreCase(name)) {
			return flg2();
		}
		if ($flg3.equalsIgnoreCase(name)) {
			return flg3();
		}
		if ($flg4.equalsIgnoreCase(name)) {
			return flg4();
		}
		if ($flg5.equalsIgnoreCase(name)) {
			return flg5();
		}
		if ($flg6.equalsIgnoreCase(name)) {
			return flg6();
		}
		if ($flg7.equalsIgnoreCase(name)) {
			return flg7();
		}
		if ($flg8.equalsIgnoreCase(name)) {
			return flg8();
		}
		if ($flg9.equalsIgnoreCase(name)) {
			return flg9();
		}
		if ($flg10.equalsIgnoreCase(name)) {
			return flg10();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
		}
		if ($char1.equalsIgnoreCase(name)) {
			return char1();
		}
		if ($base_char1.equalsIgnoreCase(name)) {
			return base_char1();
		}
		if ($char2.equalsIgnoreCase(name)) {
			return char2();
		}
		if ($base_char2.equalsIgnoreCase(name)) {
			return base_char2();
		}
		if ($char3.equalsIgnoreCase(name)) {
			return char3();
		}
		if ($base_char3.equalsIgnoreCase(name)) {
			return base_char3();
		}
		if ($char4.equalsIgnoreCase(name)) {
			return char4();
		}
		if ($base_char4.equalsIgnoreCase(name)) {
			return base_char4();
		}
		if ($char5.equalsIgnoreCase(name)) {
			return char5();
		}
		if ($base_char5.equalsIgnoreCase(name)) {
			return base_char5();
		}
		if ($char6.equalsIgnoreCase(name)) {
			return char6();
		}
		if ($base_char6.equalsIgnoreCase(name)) {
			return base_char6();
		}
		if ($char7.equalsIgnoreCase(name)) {
			return char7();
		}
		if ($base_char7.equalsIgnoreCase(name)) {
			return base_char7();
		}
		if ($char8.equalsIgnoreCase(name)) {
			return char8();
		}
		if ($base_char8.equalsIgnoreCase(name)) {
			return base_char8();
		}
		if ($char9.equalsIgnoreCase(name)) {
			return char9();
		}
		if ($base_char9.equalsIgnoreCase(name)) {
			return base_char9();
		}
		if ($char10.equalsIgnoreCase(name)) {
			return char10();
		}
		if ($base_char10.equalsIgnoreCase(name)) {
			return base_char10();
		}
		if ($char11.equalsIgnoreCase(name)) {
			return char11();
		}
		if ($char12.equalsIgnoreCase(name)) {
			return char12();
		}
		if ($char13.equalsIgnoreCase(name)) {
			return char13();
		}
		if ($char14.equalsIgnoreCase(name)) {
			return char14();
		}
		if ($char15.equalsIgnoreCase(name)) {
			return char15();
		}
		if ($char16.equalsIgnoreCase(name)) {
			return char16();
		}
		if ($char17.equalsIgnoreCase(name)) {
			return char17();
		}
		if ($char18.equalsIgnoreCase(name)) {
			return char18();
		}
		if ($char19.equalsIgnoreCase(name)) {
			return char19();
		}
		if ($char20.equalsIgnoreCase(name)) {
			return char20();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
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
		if ($gp_grp_nm.equalsIgnoreCase(name)) {
			return gp_grp_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($num1.equalsIgnoreCase(name)) {
			return num1();
		}
		if ($num2.equalsIgnoreCase(name)) {
			return num2();
		}
		if ($num3.equalsIgnoreCase(name)) {
			return num3();
		}
		if ($num4.equalsIgnoreCase(name)) {
			return num4();
		}
		if ($num5.equalsIgnoreCase(name)) {
			return num5();
		}
		if ($num6.equalsIgnoreCase(name)) {
			return num6();
		}
		if ($num7.equalsIgnoreCase(name)) {
			return num7();
		}
		if ($num8.equalsIgnoreCase(name)) {
			return num8();
		}
		if ($num9.equalsIgnoreCase(name)) {
			return num9();
		}
		if ($num10.equalsIgnoreCase(name)) {
			return num10();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dt1.equalsIgnoreCase(name)) {
			return dt1();
		}
		if ($dt2.equalsIgnoreCase(name)) {
			return dt2();
		}
		if ($dt3.equalsIgnoreCase(name)) {
			return dt3();
		}
		if ($dt4.equalsIgnoreCase(name)) {
			return dt4();
		}
		if ($dt5.equalsIgnoreCase(name)) {
			return dt5();
		}
		if ($dt6.equalsIgnoreCase(name)) {
			return dt6();
		}
		if ($dt7.equalsIgnoreCase(name)) {
			return dt7();
		}
		if ($dt8.equalsIgnoreCase(name)) {
			return dt8();
		}
		if ($dt9.equalsIgnoreCase(name)) {
			return dt9();
		}
		if ($dt10.equalsIgnoreCase(name)) {
			return dt10();
		}
		return super.getDateNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($flg1.equalsIgnoreCase(name)) {
			return flg1();
		}
		if ($flg2.equalsIgnoreCase(name)) {
			return flg2();
		}
		if ($flg3.equalsIgnoreCase(name)) {
			return flg3();
		}
		if ($flg4.equalsIgnoreCase(name)) {
			return flg4();
		}
		if ($flg5.equalsIgnoreCase(name)) {
			return flg5();
		}
		if ($flg6.equalsIgnoreCase(name)) {
			return flg6();
		}
		if ($flg7.equalsIgnoreCase(name)) {
			return flg7();
		}
		if ($flg8.equalsIgnoreCase(name)) {
			return flg8();
		}
		if ($flg9.equalsIgnoreCase(name)) {
			return flg9();
		}
		if ($flg10.equalsIgnoreCase(name)) {
			return flg10();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
			return;
		}
		if ($char1.equalsIgnoreCase(name)) {
			char1(value);
			return;
		}
		if ($base_char1.equalsIgnoreCase(name)) {
			base_char1(value);
			return;
		}
		if ($char2.equalsIgnoreCase(name)) {
			char2(value);
			return;
		}
		if ($base_char2.equalsIgnoreCase(name)) {
			base_char2(value);
			return;
		}
		if ($char3.equalsIgnoreCase(name)) {
			char3(value);
			return;
		}
		if ($base_char3.equalsIgnoreCase(name)) {
			base_char3(value);
			return;
		}
		if ($char4.equalsIgnoreCase(name)) {
			char4(value);
			return;
		}
		if ($base_char4.equalsIgnoreCase(name)) {
			base_char4(value);
			return;
		}
		if ($char5.equalsIgnoreCase(name)) {
			char5(value);
			return;
		}
		if ($base_char5.equalsIgnoreCase(name)) {
			base_char5(value);
			return;
		}
		if ($char6.equalsIgnoreCase(name)) {
			char6(value);
			return;
		}
		if ($base_char6.equalsIgnoreCase(name)) {
			base_char6(value);
			return;
		}
		if ($char7.equalsIgnoreCase(name)) {
			char7(value);
			return;
		}
		if ($base_char7.equalsIgnoreCase(name)) {
			base_char7(value);
			return;
		}
		if ($char8.equalsIgnoreCase(name)) {
			char8(value);
			return;
		}
		if ($base_char8.equalsIgnoreCase(name)) {
			base_char8(value);
			return;
		}
		if ($char9.equalsIgnoreCase(name)) {
			char9(value);
			return;
		}
		if ($base_char9.equalsIgnoreCase(name)) {
			base_char9(value);
			return;
		}
		if ($char10.equalsIgnoreCase(name)) {
			char10(value);
			return;
		}
		if ($base_char10.equalsIgnoreCase(name)) {
			base_char10(value);
			return;
		}
		if ($char11.equalsIgnoreCase(name)) {
			char11(value);
			return;
		}
		if ($char12.equalsIgnoreCase(name)) {
			char12(value);
			return;
		}
		if ($char13.equalsIgnoreCase(name)) {
			char13(value);
			return;
		}
		if ($char14.equalsIgnoreCase(name)) {
			char14(value);
			return;
		}
		if ($char15.equalsIgnoreCase(name)) {
			char15(value);
			return;
		}
		if ($char16.equalsIgnoreCase(name)) {
			char16(value);
			return;
		}
		if ($char17.equalsIgnoreCase(name)) {
			char17(value);
			return;
		}
		if ($char18.equalsIgnoreCase(name)) {
			char18(value);
			return;
		}
		if ($char19.equalsIgnoreCase(name)) {
			char19(value);
			return;
		}
		if ($char20.equalsIgnoreCase(name)) {
			char20(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
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
		if ($gp_grp_nm.equalsIgnoreCase(name)) {
			gp_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dt1.equalsIgnoreCase(name)) {
			dt1(value);
			return;
		}
		if ($dt2.equalsIgnoreCase(name)) {
			dt2(value);
			return;
		}
		if ($dt3.equalsIgnoreCase(name)) {
			dt3(value);
			return;
		}
		if ($dt4.equalsIgnoreCase(name)) {
			dt4(value);
			return;
		}
		if ($dt5.equalsIgnoreCase(name)) {
			dt5(value);
			return;
		}
		if ($dt6.equalsIgnoreCase(name)) {
			dt6(value);
			return;
		}
		if ($dt7.equalsIgnoreCase(name)) {
			dt7(value);
			return;
		}
		if ($dt8.equalsIgnoreCase(name)) {
			dt8(value);
			return;
		}
		if ($dt9.equalsIgnoreCase(name)) {
			dt9(value);
			return;
		}
		if ($dt10.equalsIgnoreCase(name)) {
			dt10(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
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
		if ($flg1.equalsIgnoreCase(name)) {
			flg1(value);
			return;
		}
		if ($flg2.equalsIgnoreCase(name)) {
			flg2(value);
			return;
		}
		if ($flg3.equalsIgnoreCase(name)) {
			flg3(value);
			return;
		}
		if ($flg4.equalsIgnoreCase(name)) {
			flg4(value);
			return;
		}
		if ($flg5.equalsIgnoreCase(name)) {
			flg5(value);
			return;
		}
		if ($flg6.equalsIgnoreCase(name)) {
			flg6(value);
			return;
		}
		if ($flg7.equalsIgnoreCase(name)) {
			flg7(value);
			return;
		}
		if ($flg8.equalsIgnoreCase(name)) {
			flg8(value);
			return;
		}
		if ($flg9.equalsIgnoreCase(name)) {
			flg9(value);
			return;
		}
		if ($flg10.equalsIgnoreCase(name)) {
			flg10(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
			return;
		}
		if ($char1.equalsIgnoreCase(name)) {
			char1(value);
			return;
		}
		if ($base_char1.equalsIgnoreCase(name)) {
			base_char1(value);
			return;
		}
		if ($char2.equalsIgnoreCase(name)) {
			char2(value);
			return;
		}
		if ($base_char2.equalsIgnoreCase(name)) {
			base_char2(value);
			return;
		}
		if ($char3.equalsIgnoreCase(name)) {
			char3(value);
			return;
		}
		if ($base_char3.equalsIgnoreCase(name)) {
			base_char3(value);
			return;
		}
		if ($char4.equalsIgnoreCase(name)) {
			char4(value);
			return;
		}
		if ($base_char4.equalsIgnoreCase(name)) {
			base_char4(value);
			return;
		}
		if ($char5.equalsIgnoreCase(name)) {
			char5(value);
			return;
		}
		if ($base_char5.equalsIgnoreCase(name)) {
			base_char5(value);
			return;
		}
		if ($char6.equalsIgnoreCase(name)) {
			char6(value);
			return;
		}
		if ($base_char6.equalsIgnoreCase(name)) {
			base_char6(value);
			return;
		}
		if ($char7.equalsIgnoreCase(name)) {
			char7(value);
			return;
		}
		if ($base_char7.equalsIgnoreCase(name)) {
			base_char7(value);
			return;
		}
		if ($char8.equalsIgnoreCase(name)) {
			char8(value);
			return;
		}
		if ($base_char8.equalsIgnoreCase(name)) {
			base_char8(value);
			return;
		}
		if ($char9.equalsIgnoreCase(name)) {
			char9(value);
			return;
		}
		if ($base_char9.equalsIgnoreCase(name)) {
			base_char9(value);
			return;
		}
		if ($char10.equalsIgnoreCase(name)) {
			char10(value);
			return;
		}
		if ($base_char10.equalsIgnoreCase(name)) {
			base_char10(value);
			return;
		}
		if ($char11.equalsIgnoreCase(name)) {
			char11(value);
			return;
		}
		if ($char12.equalsIgnoreCase(name)) {
			char12(value);
			return;
		}
		if ($char13.equalsIgnoreCase(name)) {
			char13(value);
			return;
		}
		if ($char14.equalsIgnoreCase(name)) {
			char14(value);
			return;
		}
		if ($char15.equalsIgnoreCase(name)) {
			char15(value);
			return;
		}
		if ($char16.equalsIgnoreCase(name)) {
			char16(value);
			return;
		}
		if ($char17.equalsIgnoreCase(name)) {
			char17(value);
			return;
		}
		if ($char18.equalsIgnoreCase(name)) {
			char18(value);
			return;
		}
		if ($char19.equalsIgnoreCase(name)) {
			char19(value);
			return;
		}
		if ($char20.equalsIgnoreCase(name)) {
			char20(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
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
		if ($gp_grp_nm.equalsIgnoreCase(name)) {
			gp_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dt1.equalsIgnoreCase(name)) {
			dt1(value);
			return;
		}
		if ($dt2.equalsIgnoreCase(name)) {
			dt2(value);
			return;
		}
		if ($dt3.equalsIgnoreCase(name)) {
			dt3(value);
			return;
		}
		if ($dt4.equalsIgnoreCase(name)) {
			dt4(value);
			return;
		}
		if ($dt5.equalsIgnoreCase(name)) {
			dt5(value);
			return;
		}
		if ($dt6.equalsIgnoreCase(name)) {
			dt6(value);
			return;
		}
		if ($dt7.equalsIgnoreCase(name)) {
			dt7(value);
			return;
		}
		if ($dt8.equalsIgnoreCase(name)) {
			dt8(value);
			return;
		}
		if ($dt9.equalsIgnoreCase(name)) {
			dt9(value);
			return;
		}
		if ($dt10.equalsIgnoreCase(name)) {
			dt10(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
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
		if ($flg1.equalsIgnoreCase(name)) {
			flg1(value);
			return;
		}
		if ($flg2.equalsIgnoreCase(name)) {
			flg2(value);
			return;
		}
		if ($flg3.equalsIgnoreCase(name)) {
			flg3(value);
			return;
		}
		if ($flg4.equalsIgnoreCase(name)) {
			flg4(value);
			return;
		}
		if ($flg5.equalsIgnoreCase(name)) {
			flg5(value);
			return;
		}
		if ($flg6.equalsIgnoreCase(name)) {
			flg6(value);
			return;
		}
		if ($flg7.equalsIgnoreCase(name)) {
			flg7(value);
			return;
		}
		if ($flg8.equalsIgnoreCase(name)) {
			flg8(value);
			return;
		}
		if ($flg9.equalsIgnoreCase(name)) {
			flg9(value);
			return;
		}
		if ($flg10.equalsIgnoreCase(name)) {
			flg10(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
