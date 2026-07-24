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
 * "送受信ＩＦビュー // Export and import IF view"DBコンテナRowクラスです。<p>
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
 *  	<td>data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データＮＯ</td>
 *  	<td>Data No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_proc_typ</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＩＦ処理区分</td>
 *  	<td>IF process type</td>
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
 *  	<td>not_send_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信対象外ＦＬＧ</td>
 *  	<td>Not to be exported flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>conv_ope</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コード変換オペレーション</td>
 *  	<td>Code convert operation</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>file_io_ope</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル入出力オペレーション</td>
 *  	<td>File I/O operations</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>web_api_ope</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＷｅｂＡＰＩオペレーション</td>
 *  	<td>Web API operation</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cmd_exec_ope</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コマンド実行オペレーション</td>
 *  	<td>Command execution operation</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sdrv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送受信状況区分</td>
 *  	<td>Exporting and importing status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sdrv_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送受信日時</td>
 *  	<td>Exporting/importing date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sdrv_clt_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送受信クライアントＩＤ</td>
 *  	<td>Exporting/importing client ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sdrv_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送受信ユーザＩＤ</td>
 *  	<td>Exporting/importing user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sdrv_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送受信ユーザ名</td>
 *  	<td>Exporting/importing user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１１</td>
 *  	<td>Business info. character string 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１２</td>
 *  	<td>Business info. character string 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１３</td>
 *  	<td>Business info. character string 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１４</td>
 *  	<td>Business info. character string 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１５</td>
 *  	<td>Business info. character string 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１６</td>
 *  	<td>Business info. character string 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１７</td>
 *  	<td>Business info. character string 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１８</td>
 *  	<td>Business info. character string 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１９</td>
 *  	<td>Business info. character string 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２０</td>
 *  	<td>Business info. character string 20</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２１</td>
 *  	<td>Business info. character string 21</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２２</td>
 *  	<td>Business info. character string 22</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２３</td>
 *  	<td>Business info. character string 23</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２４</td>
 *  	<td>Business info. character string 24</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２５</td>
 *  	<td>Business info. character string 25</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２６</td>
 *  	<td>Business info. character string 26</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２７</td>
 *  	<td>Business info. character string 27</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２８</td>
 *  	<td>Business info. character string 28</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２９</td>
 *  	<td>Business info. character string 29</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列３０</td>
 *  	<td>Business info. character string 30</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_tm1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報日時１</td>
 *  	<td>Business info. date and time 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_tm2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報日時２</td>
 *  	<td>Business info. date and time 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_tm3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報日時３</td>
 *  	<td>Business info. date and time 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_tm4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報日時４</td>
 *  	<td>Business info. date and time 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_tm5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報日時５</td>
 *  	<td>Business info. date and time 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_send_upd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信後訂正不可ＦＬＧ</td>
 *  	<td>Uncorrectable after exporting flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sdrv_if_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>備考</td>
 *  	<td>Remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１</td>
 *  	<td>Business info. character string 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列２</td>
 *  	<td>Business info. character string 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列３</td>
 *  	<td>Business info. character string 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列４</td>
 *  	<td>Business info. character string 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列５</td>
 *  	<td>Business info. character string 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列６</td>
 *  	<td>Business info. character string 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列７</td>
 *  	<td>Business info. character string 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列８</td>
 *  	<td>Business info. character string 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列９</td>
 *  	<td>Business info. character string 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報文字列１０</td>
 *  	<td>Business info. character string 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報数値１</td>
 *  	<td>Business info. numerical value 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報数値２</td>
 *  	<td>Business info. numerical value 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報数値３</td>
 *  	<td>Business info. numerical value 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報数値４</td>
 *  	<td>Business info. numerical value 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報数値５</td>
 *  	<td>Business info. numerical value 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報日付１</td>
 *  	<td>Business info. date 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報日付２</td>
 *  	<td>Business info. date 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報日付３</td>
 *  	<td>Business info. date 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>attr_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報日付４</td>
 *  	<td>Business info. date 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>attr_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務情報日付５</td>
 *  	<td>Business info. date 5</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBVT_PFT_SDRV_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MBVT_PFT_SDRV_IF";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public static final String $data_no = "data_no";
	private static final MCPermColumnInfo _data_no = createColumnInfo("data_no");
	public final MCNumberPermColumn data_no = createNumberColumn(_data_no);
	
	/**
	 * ＩＦ処理区分. IF process type.<p>
	 *
	 */
	public static final String $if_proc_typ = "if_proc_typ";
	private static final MCPermColumnInfo _if_proc_typ = createColumnInfo("if_proc_typ");
	public final MCStringPermColumn if_proc_typ = createStringColumn(_if_proc_typ);
	
	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	private static final MCPermColumnInfo _ext_sys_cd = createColumnInfo("ext_sys_cd");
	public final MCStringPermColumn ext_sys_cd = createStringColumn(_ext_sys_cd);
	
	/**
	 * 送信対象外ＦＬＧ. Not to be exported flg..<p>
	 *
	 */
	public static final String $not_send_flg = "not_send_flg";
	private static final MCPermColumnInfo _not_send_flg = createColumnInfo("not_send_flg");
	public final MCBooleanPermColumn not_send_flg = createBooleanColumn(_not_send_flg);
	
	/**
	 * コード変換オペレーション. Code convert operation.<p>
	 *
	 */
	public static final String $conv_ope = "conv_ope";
	private static final MCPermColumnInfo _conv_ope = createColumnInfo("conv_ope");
	public final MCStringPermColumn conv_ope = createStringColumn(_conv_ope);
	
	/**
	 * ファイル入出力オペレーション. File I/O operations.<p>
	 *
	 */
	public static final String $file_io_ope = "file_io_ope";
	private static final MCPermColumnInfo _file_io_ope = createColumnInfo("file_io_ope");
	public final MCStringPermColumn file_io_ope = createStringColumn(_file_io_ope);
	
	/**
	 * ＷｅｂＡＰＩオペレーション. Web API operation.<p>
	 *
	 */
	public static final String $web_api_ope = "web_api_ope";
	private static final MCPermColumnInfo _web_api_ope = createColumnInfo("web_api_ope");
	public final MCStringPermColumn web_api_ope = createStringColumn(_web_api_ope);
	
	/**
	 * コマンド実行オペレーション. Command execution operation.<p>
	 *
	 */
	public static final String $cmd_exec_ope = "cmd_exec_ope";
	private static final MCPermColumnInfo _cmd_exec_ope = createColumnInfo("cmd_exec_ope");
	public final MCStringPermColumn cmd_exec_ope = createStringColumn(_cmd_exec_ope);
	
	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public static final String $sdrv_sts_typ = "sdrv_sts_typ";
	private static final MCPermColumnInfo _sdrv_sts_typ = createColumnInfo("sdrv_sts_typ");
	public final MCStringPermColumn sdrv_sts_typ = createStringColumn(_sdrv_sts_typ);
	
	/**
	 * 送受信日時. Exporting/importing date and time.<p>
	 *
	 */
	public static final String $sdrv_tm = "sdrv_tm";
	private static final MCPermColumnInfo _sdrv_tm = createColumnInfo("sdrv_tm");
	public final MCDatePermColumn sdrv_tm = createDateColumn(_sdrv_tm);
	
	/**
	 * 送受信クライアントＩＤ. Exporting/importing client ID.<p>
	 *
	 */
	public static final String $sdrv_clt_id = "sdrv_clt_id";
	private static final MCPermColumnInfo _sdrv_clt_id = createColumnInfo("sdrv_clt_id");
	public final MCStringPermColumn sdrv_clt_id = createStringColumn(_sdrv_clt_id);
	
	/**
	 * 送受信ユーザＩＤ. Exporting/importing user ID.<p>
	 *
	 */
	public static final String $sdrv_usr_id = "sdrv_usr_id";
	private static final MCPermColumnInfo _sdrv_usr_id = createColumnInfo("sdrv_usr_id");
	public final MCStringPermColumn sdrv_usr_id = createStringColumn(_sdrv_usr_id);
	
	/**
	 * 送受信ユーザ名. Exporting/importing user name.<p>
	 *
	 */
	public static final String $sdrv_usr_nm = "sdrv_usr_nm";
	private static final MCPermColumnInfo _sdrv_usr_nm = createColumnInfo("sdrv_usr_nm");
	public final MCStringPermColumn sdrv_usr_nm = createStringColumn(_sdrv_usr_nm);
	
	/**
	 * 業務情報文字列１１. Business info. character string 11.<p>
	 *
	 */
	public static final String $attr_char11 = "attr_char11";
	private static final MCPermColumnInfo _attr_char11 = createColumnInfo("attr_char11");
	public final MCStringPermColumn attr_char11 = createStringColumn(_attr_char11);
	
	/**
	 * 業務情報文字列１２. Business info. character string 12.<p>
	 *
	 */
	public static final String $attr_char12 = "attr_char12";
	private static final MCPermColumnInfo _attr_char12 = createColumnInfo("attr_char12");
	public final MCStringPermColumn attr_char12 = createStringColumn(_attr_char12);
	
	/**
	 * 業務情報文字列１３. Business info. character string 13.<p>
	 *
	 */
	public static final String $attr_char13 = "attr_char13";
	private static final MCPermColumnInfo _attr_char13 = createColumnInfo("attr_char13");
	public final MCStringPermColumn attr_char13 = createStringColumn(_attr_char13);
	
	/**
	 * 業務情報文字列１４. Business info. character string 14.<p>
	 *
	 */
	public static final String $attr_char14 = "attr_char14";
	private static final MCPermColumnInfo _attr_char14 = createColumnInfo("attr_char14");
	public final MCStringPermColumn attr_char14 = createStringColumn(_attr_char14);
	
	/**
	 * 業務情報文字列１５. Business info. character string 15.<p>
	 *
	 */
	public static final String $attr_char15 = "attr_char15";
	private static final MCPermColumnInfo _attr_char15 = createColumnInfo("attr_char15");
	public final MCStringPermColumn attr_char15 = createStringColumn(_attr_char15);
	
	/**
	 * 業務情報文字列１６. Business info. character string 16.<p>
	 *
	 */
	public static final String $attr_char16 = "attr_char16";
	private static final MCPermColumnInfo _attr_char16 = createColumnInfo("attr_char16");
	public final MCStringPermColumn attr_char16 = createStringColumn(_attr_char16);
	
	/**
	 * 業務情報文字列１７. Business info. character string 17.<p>
	 *
	 */
	public static final String $attr_char17 = "attr_char17";
	private static final MCPermColumnInfo _attr_char17 = createColumnInfo("attr_char17");
	public final MCStringPermColumn attr_char17 = createStringColumn(_attr_char17);
	
	/**
	 * 業務情報文字列１８. Business info. character string 18.<p>
	 *
	 */
	public static final String $attr_char18 = "attr_char18";
	private static final MCPermColumnInfo _attr_char18 = createColumnInfo("attr_char18");
	public final MCStringPermColumn attr_char18 = createStringColumn(_attr_char18);
	
	/**
	 * 業務情報文字列１９. Business info. character string 19.<p>
	 *
	 */
	public static final String $attr_char19 = "attr_char19";
	private static final MCPermColumnInfo _attr_char19 = createColumnInfo("attr_char19");
	public final MCStringPermColumn attr_char19 = createStringColumn(_attr_char19);
	
	/**
	 * 業務情報文字列２０. Business info. character string 20.<p>
	 *
	 */
	public static final String $attr_char20 = "attr_char20";
	private static final MCPermColumnInfo _attr_char20 = createColumnInfo("attr_char20");
	public final MCStringPermColumn attr_char20 = createStringColumn(_attr_char20);
	
	/**
	 * 業務情報文字列２１. Business info. character string 21.<p>
	 *
	 */
	public static final String $attr_char21 = "attr_char21";
	private static final MCPermColumnInfo _attr_char21 = createColumnInfo("attr_char21");
	public final MCStringPermColumn attr_char21 = createStringColumn(_attr_char21);
	
	/**
	 * 業務情報文字列２２. Business info. character string 22.<p>
	 *
	 */
	public static final String $attr_char22 = "attr_char22";
	private static final MCPermColumnInfo _attr_char22 = createColumnInfo("attr_char22");
	public final MCStringPermColumn attr_char22 = createStringColumn(_attr_char22);
	
	/**
	 * 業務情報文字列２３. Business info. character string 23.<p>
	 *
	 */
	public static final String $attr_char23 = "attr_char23";
	private static final MCPermColumnInfo _attr_char23 = createColumnInfo("attr_char23");
	public final MCStringPermColumn attr_char23 = createStringColumn(_attr_char23);
	
	/**
	 * 業務情報文字列２４. Business info. character string 24.<p>
	 *
	 */
	public static final String $attr_char24 = "attr_char24";
	private static final MCPermColumnInfo _attr_char24 = createColumnInfo("attr_char24");
	public final MCStringPermColumn attr_char24 = createStringColumn(_attr_char24);
	
	/**
	 * 業務情報文字列２５. Business info. character string 25.<p>
	 *
	 */
	public static final String $attr_char25 = "attr_char25";
	private static final MCPermColumnInfo _attr_char25 = createColumnInfo("attr_char25");
	public final MCStringPermColumn attr_char25 = createStringColumn(_attr_char25);
	
	/**
	 * 業務情報文字列２６. Business info. character string 26.<p>
	 *
	 */
	public static final String $attr_char26 = "attr_char26";
	private static final MCPermColumnInfo _attr_char26 = createColumnInfo("attr_char26");
	public final MCStringPermColumn attr_char26 = createStringColumn(_attr_char26);
	
	/**
	 * 業務情報文字列２７. Business info. character string 27.<p>
	 *
	 */
	public static final String $attr_char27 = "attr_char27";
	private static final MCPermColumnInfo _attr_char27 = createColumnInfo("attr_char27");
	public final MCStringPermColumn attr_char27 = createStringColumn(_attr_char27);
	
	/**
	 * 業務情報文字列２８. Business info. character string 28.<p>
	 *
	 */
	public static final String $attr_char28 = "attr_char28";
	private static final MCPermColumnInfo _attr_char28 = createColumnInfo("attr_char28");
	public final MCStringPermColumn attr_char28 = createStringColumn(_attr_char28);
	
	/**
	 * 業務情報文字列２９. Business info. character string 29.<p>
	 *
	 */
	public static final String $attr_char29 = "attr_char29";
	private static final MCPermColumnInfo _attr_char29 = createColumnInfo("attr_char29");
	public final MCStringPermColumn attr_char29 = createStringColumn(_attr_char29);
	
	/**
	 * 業務情報文字列３０. Business info. character string 30.<p>
	 *
	 */
	public static final String $attr_char30 = "attr_char30";
	private static final MCPermColumnInfo _attr_char30 = createColumnInfo("attr_char30");
	public final MCStringPermColumn attr_char30 = createStringColumn(_attr_char30);
	
	/**
	 * 業務情報日時１. Business info. date and time 1.<p>
	 *
	 */
	public static final String $attr_tm1 = "attr_tm1";
	private static final MCPermColumnInfo _attr_tm1 = createColumnInfo("attr_tm1");
	public final MCDatePermColumn attr_tm1 = createDateColumn(_attr_tm1);
	
	/**
	 * 業務情報日時２. Business info. date and time 2.<p>
	 *
	 */
	public static final String $attr_tm2 = "attr_tm2";
	private static final MCPermColumnInfo _attr_tm2 = createColumnInfo("attr_tm2");
	public final MCDatePermColumn attr_tm2 = createDateColumn(_attr_tm2);
	
	/**
	 * 業務情報日時３. Business info. date and time 3.<p>
	 *
	 */
	public static final String $attr_tm3 = "attr_tm3";
	private static final MCPermColumnInfo _attr_tm3 = createColumnInfo("attr_tm3");
	public final MCDatePermColumn attr_tm3 = createDateColumn(_attr_tm3);
	
	/**
	 * 業務情報日時４. Business info. date and time 4.<p>
	 *
	 */
	public static final String $attr_tm4 = "attr_tm4";
	private static final MCPermColumnInfo _attr_tm4 = createColumnInfo("attr_tm4");
	public final MCDatePermColumn attr_tm4 = createDateColumn(_attr_tm4);
	
	/**
	 * 業務情報日時５. Business info. date and time 5.<p>
	 *
	 */
	public static final String $attr_tm5 = "attr_tm5";
	private static final MCPermColumnInfo _attr_tm5 = createColumnInfo("attr_tm5");
	public final MCDatePermColumn attr_tm5 = createDateColumn(_attr_tm5);
	
	/**
	 * 送信後訂正不可ＦＬＧ. Uncorrectable after exporting flg..<p>
	 *
	 */
	public static final String $not_send_upd_flg = "not_send_upd_flg";
	private static final MCPermColumnInfo _not_send_upd_flg = createColumnInfo("not_send_upd_flg");
	public final MCBooleanPermColumn not_send_upd_flg = createBooleanColumn(_not_send_upd_flg);
	
	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public static final String $sdrv_if_rmrks = "sdrv_if_rmrks";
	private static final MCPermColumnInfo _sdrv_if_rmrks = createColumnInfo("sdrv_if_rmrks");
	public final MCStringPermColumn sdrv_if_rmrks = createStringColumn(_sdrv_if_rmrks);
	
	/**
	 * 業務情報文字列１. Business info. character string 1.<p>
	 *
	 */
	public static final String $attr_char1 = "attr_char1";
	private static final MCPermColumnInfo _attr_char1 = createColumnInfo("attr_char1");
	public final MCStringPermColumn attr_char1 = createStringColumn(_attr_char1);
	
	/**
	 * 業務情報文字列２. Business info. character string 2.<p>
	 *
	 */
	public static final String $attr_char2 = "attr_char2";
	private static final MCPermColumnInfo _attr_char2 = createColumnInfo("attr_char2");
	public final MCStringPermColumn attr_char2 = createStringColumn(_attr_char2);
	
	/**
	 * 業務情報文字列３. Business info. character string 3.<p>
	 *
	 */
	public static final String $attr_char3 = "attr_char3";
	private static final MCPermColumnInfo _attr_char3 = createColumnInfo("attr_char3");
	public final MCStringPermColumn attr_char3 = createStringColumn(_attr_char3);
	
	/**
	 * 業務情報文字列４. Business info. character string 4.<p>
	 *
	 */
	public static final String $attr_char4 = "attr_char4";
	private static final MCPermColumnInfo _attr_char4 = createColumnInfo("attr_char4");
	public final MCStringPermColumn attr_char4 = createStringColumn(_attr_char4);
	
	/**
	 * 業務情報文字列５. Business info. character string 5.<p>
	 *
	 */
	public static final String $attr_char5 = "attr_char5";
	private static final MCPermColumnInfo _attr_char5 = createColumnInfo("attr_char5");
	public final MCStringPermColumn attr_char5 = createStringColumn(_attr_char5);
	
	/**
	 * 業務情報文字列６. Business info. character string 6.<p>
	 *
	 */
	public static final String $attr_char6 = "attr_char6";
	private static final MCPermColumnInfo _attr_char6 = createColumnInfo("attr_char6");
	public final MCStringPermColumn attr_char6 = createStringColumn(_attr_char6);
	
	/**
	 * 業務情報文字列７. Business info. character string 7.<p>
	 *
	 */
	public static final String $attr_char7 = "attr_char7";
	private static final MCPermColumnInfo _attr_char7 = createColumnInfo("attr_char7");
	public final MCStringPermColumn attr_char7 = createStringColumn(_attr_char7);
	
	/**
	 * 業務情報文字列８. Business info. character string 8.<p>
	 *
	 */
	public static final String $attr_char8 = "attr_char8";
	private static final MCPermColumnInfo _attr_char8 = createColumnInfo("attr_char8");
	public final MCStringPermColumn attr_char8 = createStringColumn(_attr_char8);
	
	/**
	 * 業務情報文字列９. Business info. character string 9.<p>
	 *
	 */
	public static final String $attr_char9 = "attr_char9";
	private static final MCPermColumnInfo _attr_char9 = createColumnInfo("attr_char9");
	public final MCStringPermColumn attr_char9 = createStringColumn(_attr_char9);
	
	/**
	 * 業務情報文字列１０. Business info. character string 10.<p>
	 *
	 */
	public static final String $attr_char10 = "attr_char10";
	private static final MCPermColumnInfo _attr_char10 = createColumnInfo("attr_char10");
	public final MCStringPermColumn attr_char10 = createStringColumn(_attr_char10);
	
	/**
	 * 業務情報数値１. Business info. numerical value 1.<p>
	 *
	 */
	public static final String $attr_num1 = "attr_num1";
	private static final MCPermColumnInfo _attr_num1 = createColumnInfo("attr_num1");
	public final MCNumberPermColumn attr_num1 = createNumberColumn(_attr_num1);
	
	/**
	 * 業務情報数値２. Business info. numerical value 2.<p>
	 *
	 */
	public static final String $attr_num2 = "attr_num2";
	private static final MCPermColumnInfo _attr_num2 = createColumnInfo("attr_num2");
	public final MCNumberPermColumn attr_num2 = createNumberColumn(_attr_num2);
	
	/**
	 * 業務情報数値３. Business info. numerical value 3.<p>
	 *
	 */
	public static final String $attr_num3 = "attr_num3";
	private static final MCPermColumnInfo _attr_num3 = createColumnInfo("attr_num3");
	public final MCNumberPermColumn attr_num3 = createNumberColumn(_attr_num3);
	
	/**
	 * 業務情報数値４. Business info. numerical value 4.<p>
	 *
	 */
	public static final String $attr_num4 = "attr_num4";
	private static final MCPermColumnInfo _attr_num4 = createColumnInfo("attr_num4");
	public final MCNumberPermColumn attr_num4 = createNumberColumn(_attr_num4);
	
	/**
	 * 業務情報数値５. Business info. numerical value 5.<p>
	 *
	 */
	public static final String $attr_num5 = "attr_num5";
	private static final MCPermColumnInfo _attr_num5 = createColumnInfo("attr_num5");
	public final MCNumberPermColumn attr_num5 = createNumberColumn(_attr_num5);
	
	/**
	 * 業務情報日付１. Business info. date 1.<p>
	 *
	 */
	public static final String $attr_dt1 = "attr_dt1";
	private static final MCPermColumnInfo _attr_dt1 = createColumnInfo("attr_dt1");
	public final MCDatePermColumn attr_dt1 = createDateColumn(_attr_dt1);
	
	/**
	 * 業務情報日付２. Business info. date 2.<p>
	 *
	 */
	public static final String $attr_dt2 = "attr_dt2";
	private static final MCPermColumnInfo _attr_dt2 = createColumnInfo("attr_dt2");
	public final MCDatePermColumn attr_dt2 = createDateColumn(_attr_dt2);
	
	/**
	 * 業務情報日付３. Business info. date 3.<p>
	 *
	 */
	public static final String $attr_dt3 = "attr_dt3";
	private static final MCPermColumnInfo _attr_dt3 = createColumnInfo("attr_dt3");
	public final MCDatePermColumn attr_dt3 = createDateColumn(_attr_dt3);
	
	/**
	 * 業務情報日付４. Business info. date 4.<p>
	 *
	 */
	public static final String $attr_dt4 = "attr_dt4";
	private static final MCPermColumnInfo _attr_dt4 = createColumnInfo("attr_dt4");
	public final MCDatePermColumn attr_dt4 = createDateColumn(_attr_dt4);
	
	/**
	 * 業務情報日付５. Business info. date 5.<p>
	 *
	 */
	public static final String $attr_dt5 = "attr_dt5";
	private static final MCPermColumnInfo _attr_dt5 = createColumnInfo("attr_dt5");
	public final MCDatePermColumn attr_dt5 = createDateColumn(_attr_dt5);
	
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
	
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta if_proc_typ_META = createCommonMeta($if_proc_typ, mcframe.commonMA.meta.MA_META.IF_PROC_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta not_send_flg_META = createCommonMeta($not_send_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta conv_ope_META = createCommonMeta($conv_ope, mcframe.commonMA.meta.MA_META.OPERATION);
	public static final MCMeta file_io_ope_META = createCommonMeta($file_io_ope, mcframe.commonMA.meta.MA_META.OPERATION);
	public static final MCMeta web_api_ope_META = createCommonMeta($web_api_ope, mcframe.commonMA.meta.MA_META.OPERATION);
	public static final MCMeta cmd_exec_ope_META = createCommonMeta($cmd_exec_ope, mcframe.commonMA.meta.MA_META.OPERATION);
	public static final MCMeta sdrv_sts_typ_META = createCommonMeta($sdrv_sts_typ, mcframe.commonMA.meta.MA_META.SDRV_STS_TYP);
	public static final MCMeta sdrv_tm_META = createCommonMeta($sdrv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sdrv_clt_id_META = createCommonMeta($sdrv_clt_id, mcframe.commonMA.meta.MA_META.MACHINE);
	public static final MCMeta sdrv_usr_id_META = createCommonMeta($sdrv_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta sdrv_usr_nm_META = createCommonMeta($sdrv_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta attr_char11_META = createCommonMeta($attr_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta attr_char12_META = createCommonMeta($attr_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta attr_char13_META = createCommonMeta($attr_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta attr_char14_META = createCommonMeta($attr_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta attr_char15_META = createCommonMeta($attr_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta attr_char16_META = createCommonMeta($attr_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta attr_char17_META = createCommonMeta($attr_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta attr_char18_META = createCommonMeta($attr_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta attr_char19_META = createCommonMeta($attr_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta attr_char20_META = createCommonMeta($attr_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta attr_char21_META = createCommonMeta($attr_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta attr_char22_META = createCommonMeta($attr_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta attr_char23_META = createCommonMeta($attr_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta attr_char24_META = createCommonMeta($attr_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta attr_char25_META = createCommonMeta($attr_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta attr_char26_META = createCommonMeta($attr_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta attr_char27_META = createCommonMeta($attr_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta attr_char28_META = createCommonMeta($attr_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta attr_char29_META = createCommonMeta($attr_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta attr_char30_META = createCommonMeta($attr_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta attr_tm1_META = createCommonMeta($attr_tm1, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm2_META = createCommonMeta($attr_tm2, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm3_META = createCommonMeta($attr_tm3, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm4_META = createCommonMeta($attr_tm4, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm5_META = createCommonMeta($attr_tm5, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta not_send_upd_flg_META = createCommonMeta($not_send_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sdrv_if_rmrks_META = createCommonMeta($sdrv_if_rmrks, mcframe.commonMA.meta.MA_META.SDRV_IF_RMRKS);
	public static final MCMeta attr_char1_META = createCommonMeta($attr_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta attr_char2_META = createCommonMeta($attr_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta attr_char3_META = createCommonMeta($attr_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta attr_char4_META = createCommonMeta($attr_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta attr_char5_META = createCommonMeta($attr_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta attr_char6_META = createCommonMeta($attr_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta attr_char7_META = createCommonMeta($attr_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta attr_char8_META = createCommonMeta($attr_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta attr_char9_META = createCommonMeta($attr_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta attr_char10_META = createCommonMeta($attr_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta attr_num1_META = createCommonMeta($attr_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta attr_num2_META = createCommonMeta($attr_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta attr_num3_META = createCommonMeta($attr_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta attr_num4_META = createCommonMeta($attr_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta attr_num5_META = createCommonMeta($attr_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta attr_dt1_META = createCommonMeta($attr_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt2_META = createCommonMeta($attr_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt3_META = createCommonMeta($attr_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt4_META = createCommonMeta($attr_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt5_META = createCommonMeta($attr_dt5, mcframe.commonMA.meta.MA_META.DT);
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

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MBVT_PFT_SDRV_IF_R> constMetas = new ConstMetaList<MBVT_PFT_SDRV_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_no_META,
			if_proc_typ_META,
			ext_sys_cd_META,
			not_send_flg_META,
			conv_ope_META,
			file_io_ope_META,
			web_api_ope_META,
			cmd_exec_ope_META,
			sdrv_sts_typ_META,
			sdrv_tm_META,
			sdrv_clt_id_META,
			sdrv_usr_id_META,
			sdrv_usr_nm_META,
			attr_char11_META,
			attr_char12_META,
			attr_char13_META,
			attr_char14_META,
			attr_char15_META,
			attr_char16_META,
			attr_char17_META,
			attr_char18_META,
			attr_char19_META,
			attr_char20_META,
			attr_char21_META,
			attr_char22_META,
			attr_char23_META,
			attr_char24_META,
			attr_char25_META,
			attr_char26_META,
			attr_char27_META,
			attr_char28_META,
			attr_char29_META,
			attr_char30_META,
			attr_tm1_META,
			attr_tm2_META,
			attr_tm3_META,
			attr_tm4_META,
			attr_tm5_META,
			not_send_upd_flg_META,
			sdrv_if_rmrks_META,
			attr_char1_META,
			attr_char2_META,
			attr_char3_META,
			attr_char4_META,
			attr_char5_META,
			attr_char6_META,
			attr_char7_META,
			attr_char8_META,
			attr_char9_META,
			attr_char10_META,
			attr_num1_META,
			attr_num2_META,
			attr_num3_META,
			attr_num4_META,
			attr_num5_META,
			attr_dt1_META,
			attr_dt2_META,
			attr_dt3_META,
			attr_dt4_META,
			attr_dt5_META,
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
	protected MBVT_PFT_SDRV_IF_R(ConstMetaList<? extends MBVT_PFT_SDRV_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBVT_PFT_SDRV_IF_R(ConstMetaList<? extends MBVT_PFT_SDRV_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBVT_PFT_SDRV_IF_R.$data_no,
				"data_no",
				data_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$if_proc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$if_proc_typ,
				"if_proc_typ",
				if_proc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$ext_sys_cd,
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
			MBVT_PFT_SDRV_IF_R.$not_send_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBVT_PFT_SDRV_IF_R.$not_send_flg,
				"not_send_flg",
				not_send_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$conv_ope,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$conv_ope,
				"conv_ope",
				conv_ope,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$file_io_ope,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$file_io_ope,
				"file_io_ope",
				file_io_ope,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$web_api_ope,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$web_api_ope,
				"web_api_ope",
				web_api_ope,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$cmd_exec_ope,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$cmd_exec_ope,
				"cmd_exec_ope",
				cmd_exec_ope,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$sdrv_sts_typ,
				"sdrv_sts_typ",
				sdrv_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$sdrv_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$sdrv_tm,
				"sdrv_tm",
				sdrv_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$sdrv_clt_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$sdrv_clt_id,
				"sdrv_clt_id",
				sdrv_clt_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$sdrv_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$sdrv_usr_id,
				"sdrv_usr_id",
				sdrv_usr_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$sdrv_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$sdrv_usr_nm,
				"sdrv_usr_nm",
				sdrv_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char11,
				"attr_char11",
				attr_char11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char12,
				"attr_char12",
				attr_char12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char13,
				"attr_char13",
				attr_char13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char14,
				"attr_char14",
				attr_char14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char15,
				"attr_char15",
				attr_char15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char16,
				"attr_char16",
				attr_char16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char17,
				"attr_char17",
				attr_char17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char18,
				"attr_char18",
				attr_char18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char19,
				"attr_char19",
				attr_char19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char20,
				"attr_char20",
				attr_char20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char21,
				"attr_char21",
				attr_char21,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char22,
				"attr_char22",
				attr_char22,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char23,
				"attr_char23",
				attr_char23,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char24,
				"attr_char24",
				attr_char24,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char25,
				"attr_char25",
				attr_char25,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char26,
				"attr_char26",
				attr_char26,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char27,
				"attr_char27",
				attr_char27,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char28,
				"attr_char28",
				attr_char28,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char29,
				"attr_char29",
				attr_char29,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char30,
				"attr_char30",
				attr_char30,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_tm1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$attr_tm1,
				"attr_tm1",
				attr_tm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_tm2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$attr_tm2,
				"attr_tm2",
				attr_tm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_tm3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$attr_tm3,
				"attr_tm3",
				attr_tm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_tm4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$attr_tm4,
				"attr_tm4",
				attr_tm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_tm5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$attr_tm5,
				"attr_tm5",
				attr_tm5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$not_send_upd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBVT_PFT_SDRV_IF_R.$not_send_upd_flg,
				"not_send_upd_flg",
				not_send_upd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$sdrv_if_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$sdrv_if_rmrks,
				"sdrv_if_rmrks",
				sdrv_if_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char1,
				"attr_char1",
				attr_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char2,
				"attr_char2",
				attr_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char3,
				"attr_char3",
				attr_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char4,
				"attr_char4",
				attr_char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char5,
				"attr_char5",
				attr_char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char6,
				"attr_char6",
				attr_char6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char7,
				"attr_char7",
				attr_char7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char8,
				"attr_char8",
				attr_char8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char9,
				"attr_char9",
				attr_char9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$attr_char10,
				"attr_char10",
				attr_char10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBVT_PFT_SDRV_IF_R.$attr_num1,
				"attr_num1",
				attr_num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBVT_PFT_SDRV_IF_R.$attr_num2,
				"attr_num2",
				attr_num2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBVT_PFT_SDRV_IF_R.$attr_num3,
				"attr_num3",
				attr_num3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBVT_PFT_SDRV_IF_R.$attr_num4,
				"attr_num4",
				attr_num4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBVT_PFT_SDRV_IF_R.$attr_num5,
				"attr_num5",
				attr_num5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$attr_dt1,
				"attr_dt1",
				attr_dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$attr_dt2,
				"attr_dt2",
				attr_dt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$attr_dt3,
				"attr_dt3",
				attr_dt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$attr_dt4,
				"attr_dt4",
				attr_dt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$attr_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBVT_PFT_SDRV_IF_R.$attr_dt5,
				"attr_dt5",
				attr_dt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBVT_PFT_SDRV_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$batch_log_no,
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
			MBVT_PFT_SDRV_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBVT_PFT_SDRV_IF_R.$log_sub_key1,
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
			MBVT_PFT_SDRV_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBVT_PFT_SDRV_IF_R.$log_sub_key2,
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
			MBVT_PFT_SDRV_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$ins_usr_id,
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
			MBVT_PFT_SDRV_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$ins_usr_nm,
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
			MBVT_PFT_SDRV_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBVT_PFT_SDRV_IF_R.$ins_ts,
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
			MBVT_PFT_SDRV_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$ins_func_id,
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
			MBVT_PFT_SDRV_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBVT_PFT_SDRV_IF_R.$upd_cntr,
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
			MBVT_PFT_SDRV_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$upd_usr_id,
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
			MBVT_PFT_SDRV_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$upd_usr_nm,
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
			MBVT_PFT_SDRV_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBVT_PFT_SDRV_IF_R.$upd_ts,
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
			MBVT_PFT_SDRV_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$upd_func_id,
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
			MBVT_PFT_SDRV_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBVT_PFT_SDRV_IF_R.$upd_srv_req_no,
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
	public static MBVT_PFT_SDRV_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBVT_PFT_SDRV_IF_R create(String alias) {
		MBVT_PFT_SDRV_IF_R row = new MBVT_PFT_SDRV_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBVT_PFT_SDRV_IF_R createByName(T proto) {
		MBVT_PFT_SDRV_IF_R row = MBVT_PFT_SDRV_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBVT_PFT_SDRV_IF_R clone() {
		return (MBVT_PFT_SDRV_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBVT_PFT_SDRV_IF_R createInstance() {
		return (MBVT_PFT_SDRV_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBVT_PFT_SDRV_IF_R getValues(String... names) {
		return (MBVT_PFT_SDRV_IF_R) super.getValues(names);
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
	 * データＮＯ. Data No..<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 0, $data_no);
	}

	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 0, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 0, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 0, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 0, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 0, $data_no, value);
	}
	
	/**
	 * ＩＦ処理区分. IF process type.<p>
	 *
	 */
	public String if_proc_typ() {
		return getConstString(offset + 1, $if_proc_typ);
	}

	/**
	 * ＩＦ処理区分. IF process type.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		setConstString(offset + 1, $if_proc_typ, value);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 2, $ext_sys_cd);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 2, $ext_sys_cd, value);
	}

	/**
	 * 送信対象外ＦＬＧ. Not to be exported flg..<p>
	 *
	 */
	public boolean not_send_flg() {
		return getConstBoolean(offset + 3, $not_send_flg);
	}

	/**
	 * 送信対象外ＦＬＧ. Not to be exported flg..<p>
	 *
	 */
	public void not_send_flg(boolean value) {
		setConstBoolean(offset + 3, $not_send_flg, value);
	}

	/**
	 * コード変換オペレーション. Code convert operation.<p>
	 *
	 */
	public String conv_ope() {
		return getConstString(offset + 4, $conv_ope);
	}

	/**
	 * コード変換オペレーション. Code convert operation.<p>
	 *
	 */
	public void conv_ope(String value) {
		setConstString(offset + 4, $conv_ope, value);
	}

	/**
	 * ファイル入出力オペレーション. File I/O operations.<p>
	 *
	 */
	public String file_io_ope() {
		return getConstString(offset + 5, $file_io_ope);
	}

	/**
	 * ファイル入出力オペレーション. File I/O operations.<p>
	 *
	 */
	public void file_io_ope(String value) {
		setConstString(offset + 5, $file_io_ope, value);
	}

	/**
	 * ＷｅｂＡＰＩオペレーション. Web API operation.<p>
	 *
	 */
	public String web_api_ope() {
		return getConstString(offset + 6, $web_api_ope);
	}

	/**
	 * ＷｅｂＡＰＩオペレーション. Web API operation.<p>
	 *
	 */
	public void web_api_ope(String value) {
		setConstString(offset + 6, $web_api_ope, value);
	}

	/**
	 * コマンド実行オペレーション. Command execution operation.<p>
	 *
	 */
	public String cmd_exec_ope() {
		return getConstString(offset + 7, $cmd_exec_ope);
	}

	/**
	 * コマンド実行オペレーション. Command execution operation.<p>
	 *
	 */
	public void cmd_exec_ope(String value) {
		setConstString(offset + 7, $cmd_exec_ope, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 8, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 8, $sdrv_sts_typ, value);
	}

	/**
	 * 送受信日時. Exporting/importing date and time.<p>
	 *
	 */
	public MCDate sdrv_tm() {
		return getConstDate(offset + 9, $sdrv_tm);
	}

	/**
	 * 送受信日時. Exporting/importing date and time.<p>
	 *
	 */
	public void sdrv_tm(MCDate value) {
		setConstDate(offset + 9, $sdrv_tm, value);
	}

	/**
	 * 送受信クライアントＩＤ. Exporting/importing client ID.<p>
	 *
	 */
	public String sdrv_clt_id() {
		return getConstString(offset + 10, $sdrv_clt_id);
	}

	/**
	 * 送受信クライアントＩＤ. Exporting/importing client ID.<p>
	 *
	 */
	public void sdrv_clt_id(String value) {
		setConstString(offset + 10, $sdrv_clt_id, value);
	}

	/**
	 * 送受信ユーザＩＤ. Exporting/importing user ID.<p>
	 *
	 */
	public String sdrv_usr_id() {
		return getConstString(offset + 11, $sdrv_usr_id);
	}

	/**
	 * 送受信ユーザＩＤ. Exporting/importing user ID.<p>
	 *
	 */
	public void sdrv_usr_id(String value) {
		setConstString(offset + 11, $sdrv_usr_id, value);
	}

	/**
	 * 送受信ユーザ名. Exporting/importing user name.<p>
	 *
	 */
	public String sdrv_usr_nm() {
		return getConstString(offset + 12, $sdrv_usr_nm);
	}

	/**
	 * 送受信ユーザ名. Exporting/importing user name.<p>
	 *
	 */
	public void sdrv_usr_nm(String value) {
		setConstString(offset + 12, $sdrv_usr_nm, value);
	}

	/**
	 * 業務情報文字列１１. Business info. character string 11.<p>
	 *
	 */
	public String attr_char11() {
		return getConstString(offset + 13, $attr_char11);
	}

	/**
	 * 業務情報文字列１１. Business info. character string 11.<p>
	 *
	 */
	public void attr_char11(String value) {
		setConstString(offset + 13, $attr_char11, value);
	}

	/**
	 * 業務情報文字列１２. Business info. character string 12.<p>
	 *
	 */
	public String attr_char12() {
		return getConstString(offset + 14, $attr_char12);
	}

	/**
	 * 業務情報文字列１２. Business info. character string 12.<p>
	 *
	 */
	public void attr_char12(String value) {
		setConstString(offset + 14, $attr_char12, value);
	}

	/**
	 * 業務情報文字列１３. Business info. character string 13.<p>
	 *
	 */
	public String attr_char13() {
		return getConstString(offset + 15, $attr_char13);
	}

	/**
	 * 業務情報文字列１３. Business info. character string 13.<p>
	 *
	 */
	public void attr_char13(String value) {
		setConstString(offset + 15, $attr_char13, value);
	}

	/**
	 * 業務情報文字列１４. Business info. character string 14.<p>
	 *
	 */
	public String attr_char14() {
		return getConstString(offset + 16, $attr_char14);
	}

	/**
	 * 業務情報文字列１４. Business info. character string 14.<p>
	 *
	 */
	public void attr_char14(String value) {
		setConstString(offset + 16, $attr_char14, value);
	}

	/**
	 * 業務情報文字列１５. Business info. character string 15.<p>
	 *
	 */
	public String attr_char15() {
		return getConstString(offset + 17, $attr_char15);
	}

	/**
	 * 業務情報文字列１５. Business info. character string 15.<p>
	 *
	 */
	public void attr_char15(String value) {
		setConstString(offset + 17, $attr_char15, value);
	}

	/**
	 * 業務情報文字列１６. Business info. character string 16.<p>
	 *
	 */
	public String attr_char16() {
		return getConstString(offset + 18, $attr_char16);
	}

	/**
	 * 業務情報文字列１６. Business info. character string 16.<p>
	 *
	 */
	public void attr_char16(String value) {
		setConstString(offset + 18, $attr_char16, value);
	}

	/**
	 * 業務情報文字列１７. Business info. character string 17.<p>
	 *
	 */
	public String attr_char17() {
		return getConstString(offset + 19, $attr_char17);
	}

	/**
	 * 業務情報文字列１７. Business info. character string 17.<p>
	 *
	 */
	public void attr_char17(String value) {
		setConstString(offset + 19, $attr_char17, value);
	}

	/**
	 * 業務情報文字列１８. Business info. character string 18.<p>
	 *
	 */
	public String attr_char18() {
		return getConstString(offset + 20, $attr_char18);
	}

	/**
	 * 業務情報文字列１８. Business info. character string 18.<p>
	 *
	 */
	public void attr_char18(String value) {
		setConstString(offset + 20, $attr_char18, value);
	}

	/**
	 * 業務情報文字列１９. Business info. character string 19.<p>
	 *
	 */
	public String attr_char19() {
		return getConstString(offset + 21, $attr_char19);
	}

	/**
	 * 業務情報文字列１９. Business info. character string 19.<p>
	 *
	 */
	public void attr_char19(String value) {
		setConstString(offset + 21, $attr_char19, value);
	}

	/**
	 * 業務情報文字列２０. Business info. character string 20.<p>
	 *
	 */
	public String attr_char20() {
		return getConstString(offset + 22, $attr_char20);
	}

	/**
	 * 業務情報文字列２０. Business info. character string 20.<p>
	 *
	 */
	public void attr_char20(String value) {
		setConstString(offset + 22, $attr_char20, value);
	}

	/**
	 * 業務情報文字列２１. Business info. character string 21.<p>
	 *
	 */
	public String attr_char21() {
		return getConstString(offset + 23, $attr_char21);
	}

	/**
	 * 業務情報文字列２１. Business info. character string 21.<p>
	 *
	 */
	public void attr_char21(String value) {
		setConstString(offset + 23, $attr_char21, value);
	}

	/**
	 * 業務情報文字列２２. Business info. character string 22.<p>
	 *
	 */
	public String attr_char22() {
		return getConstString(offset + 24, $attr_char22);
	}

	/**
	 * 業務情報文字列２２. Business info. character string 22.<p>
	 *
	 */
	public void attr_char22(String value) {
		setConstString(offset + 24, $attr_char22, value);
	}

	/**
	 * 業務情報文字列２３. Business info. character string 23.<p>
	 *
	 */
	public String attr_char23() {
		return getConstString(offset + 25, $attr_char23);
	}

	/**
	 * 業務情報文字列２３. Business info. character string 23.<p>
	 *
	 */
	public void attr_char23(String value) {
		setConstString(offset + 25, $attr_char23, value);
	}

	/**
	 * 業務情報文字列２４. Business info. character string 24.<p>
	 *
	 */
	public String attr_char24() {
		return getConstString(offset + 26, $attr_char24);
	}

	/**
	 * 業務情報文字列２４. Business info. character string 24.<p>
	 *
	 */
	public void attr_char24(String value) {
		setConstString(offset + 26, $attr_char24, value);
	}

	/**
	 * 業務情報文字列２５. Business info. character string 25.<p>
	 *
	 */
	public String attr_char25() {
		return getConstString(offset + 27, $attr_char25);
	}

	/**
	 * 業務情報文字列２５. Business info. character string 25.<p>
	 *
	 */
	public void attr_char25(String value) {
		setConstString(offset + 27, $attr_char25, value);
	}

	/**
	 * 業務情報文字列２６. Business info. character string 26.<p>
	 *
	 */
	public String attr_char26() {
		return getConstString(offset + 28, $attr_char26);
	}

	/**
	 * 業務情報文字列２６. Business info. character string 26.<p>
	 *
	 */
	public void attr_char26(String value) {
		setConstString(offset + 28, $attr_char26, value);
	}

	/**
	 * 業務情報文字列２７. Business info. character string 27.<p>
	 *
	 */
	public String attr_char27() {
		return getConstString(offset + 29, $attr_char27);
	}

	/**
	 * 業務情報文字列２７. Business info. character string 27.<p>
	 *
	 */
	public void attr_char27(String value) {
		setConstString(offset + 29, $attr_char27, value);
	}

	/**
	 * 業務情報文字列２８. Business info. character string 28.<p>
	 *
	 */
	public String attr_char28() {
		return getConstString(offset + 30, $attr_char28);
	}

	/**
	 * 業務情報文字列２８. Business info. character string 28.<p>
	 *
	 */
	public void attr_char28(String value) {
		setConstString(offset + 30, $attr_char28, value);
	}

	/**
	 * 業務情報文字列２９. Business info. character string 29.<p>
	 *
	 */
	public String attr_char29() {
		return getConstString(offset + 31, $attr_char29);
	}

	/**
	 * 業務情報文字列２９. Business info. character string 29.<p>
	 *
	 */
	public void attr_char29(String value) {
		setConstString(offset + 31, $attr_char29, value);
	}

	/**
	 * 業務情報文字列３０. Business info. character string 30.<p>
	 *
	 */
	public String attr_char30() {
		return getConstString(offset + 32, $attr_char30);
	}

	/**
	 * 業務情報文字列３０. Business info. character string 30.<p>
	 *
	 */
	public void attr_char30(String value) {
		setConstString(offset + 32, $attr_char30, value);
	}

	/**
	 * 業務情報日時１. Business info. date and time 1.<p>
	 *
	 */
	public MCDate attr_tm1() {
		return getConstDate(offset + 33, $attr_tm1);
	}

	/**
	 * 業務情報日時１. Business info. date and time 1.<p>
	 *
	 */
	public void attr_tm1(MCDate value) {
		setConstDate(offset + 33, $attr_tm1, value);
	}

	/**
	 * 業務情報日時２. Business info. date and time 2.<p>
	 *
	 */
	public MCDate attr_tm2() {
		return getConstDate(offset + 34, $attr_tm2);
	}

	/**
	 * 業務情報日時２. Business info. date and time 2.<p>
	 *
	 */
	public void attr_tm2(MCDate value) {
		setConstDate(offset + 34, $attr_tm2, value);
	}

	/**
	 * 業務情報日時３. Business info. date and time 3.<p>
	 *
	 */
	public MCDate attr_tm3() {
		return getConstDate(offset + 35, $attr_tm3);
	}

	/**
	 * 業務情報日時３. Business info. date and time 3.<p>
	 *
	 */
	public void attr_tm3(MCDate value) {
		setConstDate(offset + 35, $attr_tm3, value);
	}

	/**
	 * 業務情報日時４. Business info. date and time 4.<p>
	 *
	 */
	public MCDate attr_tm4() {
		return getConstDate(offset + 36, $attr_tm4);
	}

	/**
	 * 業務情報日時４. Business info. date and time 4.<p>
	 *
	 */
	public void attr_tm4(MCDate value) {
		setConstDate(offset + 36, $attr_tm4, value);
	}

	/**
	 * 業務情報日時５. Business info. date and time 5.<p>
	 *
	 */
	public MCDate attr_tm5() {
		return getConstDate(offset + 37, $attr_tm5);
	}

	/**
	 * 業務情報日時５. Business info. date and time 5.<p>
	 *
	 */
	public void attr_tm5(MCDate value) {
		setConstDate(offset + 37, $attr_tm5, value);
	}

	/**
	 * 送信後訂正不可ＦＬＧ. Uncorrectable after exporting flg..<p>
	 *
	 */
	public boolean not_send_upd_flg() {
		return getConstBoolean(offset + 38, $not_send_upd_flg);
	}

	/**
	 * 送信後訂正不可ＦＬＧ. Uncorrectable after exporting flg..<p>
	 *
	 */
	public void not_send_upd_flg(boolean value) {
		setConstBoolean(offset + 38, $not_send_upd_flg, value);
	}

	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public String sdrv_if_rmrks() {
		return getConstString(offset + 39, $sdrv_if_rmrks);
	}

	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public void sdrv_if_rmrks(String value) {
		setConstString(offset + 39, $sdrv_if_rmrks, value);
	}

	/**
	 * 業務情報文字列１. Business info. character string 1.<p>
	 *
	 */
	public String attr_char1() {
		return getConstString(offset + 40, $attr_char1);
	}

	/**
	 * 業務情報文字列１. Business info. character string 1.<p>
	 *
	 */
	public void attr_char1(String value) {
		setConstString(offset + 40, $attr_char1, value);
	}

	/**
	 * 業務情報文字列２. Business info. character string 2.<p>
	 *
	 */
	public String attr_char2() {
		return getConstString(offset + 41, $attr_char2);
	}

	/**
	 * 業務情報文字列２. Business info. character string 2.<p>
	 *
	 */
	public void attr_char2(String value) {
		setConstString(offset + 41, $attr_char2, value);
	}

	/**
	 * 業務情報文字列３. Business info. character string 3.<p>
	 *
	 */
	public String attr_char3() {
		return getConstString(offset + 42, $attr_char3);
	}

	/**
	 * 業務情報文字列３. Business info. character string 3.<p>
	 *
	 */
	public void attr_char3(String value) {
		setConstString(offset + 42, $attr_char3, value);
	}

	/**
	 * 業務情報文字列４. Business info. character string 4.<p>
	 *
	 */
	public String attr_char4() {
		return getConstString(offset + 43, $attr_char4);
	}

	/**
	 * 業務情報文字列４. Business info. character string 4.<p>
	 *
	 */
	public void attr_char4(String value) {
		setConstString(offset + 43, $attr_char4, value);
	}

	/**
	 * 業務情報文字列５. Business info. character string 5.<p>
	 *
	 */
	public String attr_char5() {
		return getConstString(offset + 44, $attr_char5);
	}

	/**
	 * 業務情報文字列５. Business info. character string 5.<p>
	 *
	 */
	public void attr_char5(String value) {
		setConstString(offset + 44, $attr_char5, value);
	}

	/**
	 * 業務情報文字列６. Business info. character string 6.<p>
	 *
	 */
	public String attr_char6() {
		return getConstString(offset + 45, $attr_char6);
	}

	/**
	 * 業務情報文字列６. Business info. character string 6.<p>
	 *
	 */
	public void attr_char6(String value) {
		setConstString(offset + 45, $attr_char6, value);
	}

	/**
	 * 業務情報文字列７. Business info. character string 7.<p>
	 *
	 */
	public String attr_char7() {
		return getConstString(offset + 46, $attr_char7);
	}

	/**
	 * 業務情報文字列７. Business info. character string 7.<p>
	 *
	 */
	public void attr_char7(String value) {
		setConstString(offset + 46, $attr_char7, value);
	}

	/**
	 * 業務情報文字列８. Business info. character string 8.<p>
	 *
	 */
	public String attr_char8() {
		return getConstString(offset + 47, $attr_char8);
	}

	/**
	 * 業務情報文字列８. Business info. character string 8.<p>
	 *
	 */
	public void attr_char8(String value) {
		setConstString(offset + 47, $attr_char8, value);
	}

	/**
	 * 業務情報文字列９. Business info. character string 9.<p>
	 *
	 */
	public String attr_char9() {
		return getConstString(offset + 48, $attr_char9);
	}

	/**
	 * 業務情報文字列９. Business info. character string 9.<p>
	 *
	 */
	public void attr_char9(String value) {
		setConstString(offset + 48, $attr_char9, value);
	}

	/**
	 * 業務情報文字列１０. Business info. character string 10.<p>
	 *
	 */
	public String attr_char10() {
		return getConstString(offset + 49, $attr_char10);
	}

	/**
	 * 業務情報文字列１０. Business info. character string 10.<p>
	 *
	 */
	public void attr_char10(String value) {
		setConstString(offset + 49, $attr_char10, value);
	}

	/**
	 * 業務情報数値１. Business info. numerical value 1.<p>
	 *
	 */
	public MCNumber attr_num1() {
		return getConstNumber(offset + 50, $attr_num1);
	}

	/**
	 * 業務情報数値１. Business info. numerical value 1.<p>
	 *
	 */
	public void attr_num1(MCNumber value) {
		setConstNumber(offset + 50, $attr_num1, value);
	}
	
	/**
	 * 業務情報数値１. Business info. numerical value 1.<p>
	 *
	 */
	public void attr_num1(int value) {
		setConstNumber(offset + 50, $attr_num1, value);
	}
	
	/**
	 * 業務情報数値１. Business info. numerical value 1.<p>
	 *
	 */
	public void attr_num1(long value) {
		setConstNumber(offset + 50, $attr_num1, value);
	}
	
	/**
	 * 業務情報数値１. Business info. numerical value 1.<p>
	 *
	 */
	public void attr_num1(float value) {
		setConstNumber(offset + 50, $attr_num1, value);
	}
	
	/**
	 * 業務情報数値１. Business info. numerical value 1.<p>
	 *
	 */
	public void attr_num1(double value) {
		setConstNumber(offset + 50, $attr_num1, value);
	}
	
	/**
	 * 業務情報数値２. Business info. numerical value 2.<p>
	 *
	 */
	public MCNumber attr_num2() {
		return getConstNumber(offset + 51, $attr_num2);
	}

	/**
	 * 業務情報数値２. Business info. numerical value 2.<p>
	 *
	 */
	public void attr_num2(MCNumber value) {
		setConstNumber(offset + 51, $attr_num2, value);
	}
	
	/**
	 * 業務情報数値２. Business info. numerical value 2.<p>
	 *
	 */
	public void attr_num2(int value) {
		setConstNumber(offset + 51, $attr_num2, value);
	}
	
	/**
	 * 業務情報数値２. Business info. numerical value 2.<p>
	 *
	 */
	public void attr_num2(long value) {
		setConstNumber(offset + 51, $attr_num2, value);
	}
	
	/**
	 * 業務情報数値２. Business info. numerical value 2.<p>
	 *
	 */
	public void attr_num2(float value) {
		setConstNumber(offset + 51, $attr_num2, value);
	}
	
	/**
	 * 業務情報数値２. Business info. numerical value 2.<p>
	 *
	 */
	public void attr_num2(double value) {
		setConstNumber(offset + 51, $attr_num2, value);
	}
	
	/**
	 * 業務情報数値３. Business info. numerical value 3.<p>
	 *
	 */
	public MCNumber attr_num3() {
		return getConstNumber(offset + 52, $attr_num3);
	}

	/**
	 * 業務情報数値３. Business info. numerical value 3.<p>
	 *
	 */
	public void attr_num3(MCNumber value) {
		setConstNumber(offset + 52, $attr_num3, value);
	}
	
	/**
	 * 業務情報数値３. Business info. numerical value 3.<p>
	 *
	 */
	public void attr_num3(int value) {
		setConstNumber(offset + 52, $attr_num3, value);
	}
	
	/**
	 * 業務情報数値３. Business info. numerical value 3.<p>
	 *
	 */
	public void attr_num3(long value) {
		setConstNumber(offset + 52, $attr_num3, value);
	}
	
	/**
	 * 業務情報数値３. Business info. numerical value 3.<p>
	 *
	 */
	public void attr_num3(float value) {
		setConstNumber(offset + 52, $attr_num3, value);
	}
	
	/**
	 * 業務情報数値３. Business info. numerical value 3.<p>
	 *
	 */
	public void attr_num3(double value) {
		setConstNumber(offset + 52, $attr_num3, value);
	}
	
	/**
	 * 業務情報数値４. Business info. numerical value 4.<p>
	 *
	 */
	public MCNumber attr_num4() {
		return getConstNumber(offset + 53, $attr_num4);
	}

	/**
	 * 業務情報数値４. Business info. numerical value 4.<p>
	 *
	 */
	public void attr_num4(MCNumber value) {
		setConstNumber(offset + 53, $attr_num4, value);
	}
	
	/**
	 * 業務情報数値４. Business info. numerical value 4.<p>
	 *
	 */
	public void attr_num4(int value) {
		setConstNumber(offset + 53, $attr_num4, value);
	}
	
	/**
	 * 業務情報数値４. Business info. numerical value 4.<p>
	 *
	 */
	public void attr_num4(long value) {
		setConstNumber(offset + 53, $attr_num4, value);
	}
	
	/**
	 * 業務情報数値４. Business info. numerical value 4.<p>
	 *
	 */
	public void attr_num4(float value) {
		setConstNumber(offset + 53, $attr_num4, value);
	}
	
	/**
	 * 業務情報数値４. Business info. numerical value 4.<p>
	 *
	 */
	public void attr_num4(double value) {
		setConstNumber(offset + 53, $attr_num4, value);
	}
	
	/**
	 * 業務情報数値５. Business info. numerical value 5.<p>
	 *
	 */
	public MCNumber attr_num5() {
		return getConstNumber(offset + 54, $attr_num5);
	}

	/**
	 * 業務情報数値５. Business info. numerical value 5.<p>
	 *
	 */
	public void attr_num5(MCNumber value) {
		setConstNumber(offset + 54, $attr_num5, value);
	}
	
	/**
	 * 業務情報数値５. Business info. numerical value 5.<p>
	 *
	 */
	public void attr_num5(int value) {
		setConstNumber(offset + 54, $attr_num5, value);
	}
	
	/**
	 * 業務情報数値５. Business info. numerical value 5.<p>
	 *
	 */
	public void attr_num5(long value) {
		setConstNumber(offset + 54, $attr_num5, value);
	}
	
	/**
	 * 業務情報数値５. Business info. numerical value 5.<p>
	 *
	 */
	public void attr_num5(float value) {
		setConstNumber(offset + 54, $attr_num5, value);
	}
	
	/**
	 * 業務情報数値５. Business info. numerical value 5.<p>
	 *
	 */
	public void attr_num5(double value) {
		setConstNumber(offset + 54, $attr_num5, value);
	}
	
	/**
	 * 業務情報日付１. Business info. date 1.<p>
	 *
	 */
	public MCDate attr_dt1() {
		return getConstDate(offset + 55, $attr_dt1);
	}

	/**
	 * 業務情報日付１. Business info. date 1.<p>
	 *
	 */
	public void attr_dt1(MCDate value) {
		setConstDate(offset + 55, $attr_dt1, value);
	}

	/**
	 * 業務情報日付２. Business info. date 2.<p>
	 *
	 */
	public MCDate attr_dt2() {
		return getConstDate(offset + 56, $attr_dt2);
	}

	/**
	 * 業務情報日付２. Business info. date 2.<p>
	 *
	 */
	public void attr_dt2(MCDate value) {
		setConstDate(offset + 56, $attr_dt2, value);
	}

	/**
	 * 業務情報日付３. Business info. date 3.<p>
	 *
	 */
	public MCDate attr_dt3() {
		return getConstDate(offset + 57, $attr_dt3);
	}

	/**
	 * 業務情報日付３. Business info. date 3.<p>
	 *
	 */
	public void attr_dt3(MCDate value) {
		setConstDate(offset + 57, $attr_dt3, value);
	}

	/**
	 * 業務情報日付４. Business info. date 4.<p>
	 *
	 */
	public MCDate attr_dt4() {
		return getConstDate(offset + 58, $attr_dt4);
	}

	/**
	 * 業務情報日付４. Business info. date 4.<p>
	 *
	 */
	public void attr_dt4(MCDate value) {
		setConstDate(offset + 58, $attr_dt4, value);
	}

	/**
	 * 業務情報日付５. Business info. date 5.<p>
	 *
	 */
	public MCDate attr_dt5() {
		return getConstDate(offset + 59, $attr_dt5);
	}

	/**
	 * 業務情報日付５. Business info. date 5.<p>
	 *
	 */
	public void attr_dt5(MCDate value) {
		setConstDate(offset + 59, $attr_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 60, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 60, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 61, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 61, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 61, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 61, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 61, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 61, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 62, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 62, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 62, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 62, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 62, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 62, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 63, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 63, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 64, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 64, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 65, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 65, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 66, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 66, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 67, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 68, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 68, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 69, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 69, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 70, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 70, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 71, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 71, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 72, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 72, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($conv_ope.equalsIgnoreCase(name)) {
			return conv_ope();
		}
		if ($file_io_ope.equalsIgnoreCase(name)) {
			return file_io_ope();
		}
		if ($web_api_ope.equalsIgnoreCase(name)) {
			return web_api_ope();
		}
		if ($cmd_exec_ope.equalsIgnoreCase(name)) {
			return cmd_exec_ope();
		}
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			return sdrv_sts_typ();
		}
		if ($sdrv_clt_id.equalsIgnoreCase(name)) {
			return sdrv_clt_id();
		}
		if ($sdrv_usr_id.equalsIgnoreCase(name)) {
			return sdrv_usr_id();
		}
		if ($sdrv_usr_nm.equalsIgnoreCase(name)) {
			return sdrv_usr_nm();
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			return attr_char11();
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			return attr_char12();
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			return attr_char13();
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			return attr_char14();
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			return attr_char15();
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			return attr_char16();
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			return attr_char17();
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			return attr_char18();
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			return attr_char19();
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			return attr_char20();
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			return attr_char21();
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			return attr_char22();
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			return attr_char23();
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			return attr_char24();
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			return attr_char25();
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			return attr_char26();
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			return attr_char27();
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			return attr_char28();
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			return attr_char29();
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			return attr_char30();
		}
		if ($sdrv_if_rmrks.equalsIgnoreCase(name)) {
			return sdrv_if_rmrks();
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			return attr_char1();
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			return attr_char2();
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			return attr_char3();
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			return attr_char4();
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			return attr_char5();
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			return attr_char6();
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			return attr_char7();
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			return attr_char8();
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			return attr_char9();
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			return attr_char10();
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
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			return attr_num1();
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			return attr_num2();
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			return attr_num3();
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			return attr_num4();
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			return attr_num5();
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
		if ($sdrv_tm.equalsIgnoreCase(name)) {
			return sdrv_tm();
		}
		if ($attr_tm1.equalsIgnoreCase(name)) {
			return attr_tm1();
		}
		if ($attr_tm2.equalsIgnoreCase(name)) {
			return attr_tm2();
		}
		if ($attr_tm3.equalsIgnoreCase(name)) {
			return attr_tm3();
		}
		if ($attr_tm4.equalsIgnoreCase(name)) {
			return attr_tm4();
		}
		if ($attr_tm5.equalsIgnoreCase(name)) {
			return attr_tm5();
		}
		if ($attr_dt1.equalsIgnoreCase(name)) {
			return attr_dt1();
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			return attr_dt2();
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			return attr_dt3();
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			return attr_dt4();
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			return attr_dt5();
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
		if ($not_send_flg.equalsIgnoreCase(name)) {
			return not_send_flg();
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			return not_send_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($conv_ope.equalsIgnoreCase(name)) {
			return conv_ope();
		}
		if ($file_io_ope.equalsIgnoreCase(name)) {
			return file_io_ope();
		}
		if ($web_api_ope.equalsIgnoreCase(name)) {
			return web_api_ope();
		}
		if ($cmd_exec_ope.equalsIgnoreCase(name)) {
			return cmd_exec_ope();
		}
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			return sdrv_sts_typ();
		}
		if ($sdrv_clt_id.equalsIgnoreCase(name)) {
			return sdrv_clt_id();
		}
		if ($sdrv_usr_id.equalsIgnoreCase(name)) {
			return sdrv_usr_id();
		}
		if ($sdrv_usr_nm.equalsIgnoreCase(name)) {
			return sdrv_usr_nm();
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			return attr_char11();
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			return attr_char12();
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			return attr_char13();
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			return attr_char14();
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			return attr_char15();
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			return attr_char16();
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			return attr_char17();
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			return attr_char18();
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			return attr_char19();
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			return attr_char20();
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			return attr_char21();
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			return attr_char22();
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			return attr_char23();
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			return attr_char24();
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			return attr_char25();
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			return attr_char26();
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			return attr_char27();
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			return attr_char28();
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			return attr_char29();
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			return attr_char30();
		}
		if ($sdrv_if_rmrks.equalsIgnoreCase(name)) {
			return sdrv_if_rmrks();
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			return attr_char1();
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			return attr_char2();
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			return attr_char3();
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			return attr_char4();
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			return attr_char5();
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			return attr_char6();
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			return attr_char7();
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			return attr_char8();
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			return attr_char9();
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			return attr_char10();
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
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			return attr_num1();
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			return attr_num2();
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			return attr_num3();
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			return attr_num4();
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			return attr_num5();
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
		if ($sdrv_tm.equalsIgnoreCase(name)) {
			return sdrv_tm();
		}
		if ($attr_tm1.equalsIgnoreCase(name)) {
			return attr_tm1();
		}
		if ($attr_tm2.equalsIgnoreCase(name)) {
			return attr_tm2();
		}
		if ($attr_tm3.equalsIgnoreCase(name)) {
			return attr_tm3();
		}
		if ($attr_tm4.equalsIgnoreCase(name)) {
			return attr_tm4();
		}
		if ($attr_tm5.equalsIgnoreCase(name)) {
			return attr_tm5();
		}
		if ($attr_dt1.equalsIgnoreCase(name)) {
			return attr_dt1();
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			return attr_dt2();
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			return attr_dt3();
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			return attr_dt4();
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			return attr_dt5();
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
		if ($not_send_flg.equalsIgnoreCase(name)) {
			return not_send_flg();
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			return not_send_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($conv_ope.equalsIgnoreCase(name)) {
			conv_ope(value);
			return;
		}
		if ($file_io_ope.equalsIgnoreCase(name)) {
			file_io_ope(value);
			return;
		}
		if ($web_api_ope.equalsIgnoreCase(name)) {
			web_api_ope(value);
			return;
		}
		if ($cmd_exec_ope.equalsIgnoreCase(name)) {
			cmd_exec_ope(value);
			return;
		}
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			sdrv_sts_typ(value);
			return;
		}
		if ($sdrv_clt_id.equalsIgnoreCase(name)) {
			sdrv_clt_id(value);
			return;
		}
		if ($sdrv_usr_id.equalsIgnoreCase(name)) {
			sdrv_usr_id(value);
			return;
		}
		if ($sdrv_usr_nm.equalsIgnoreCase(name)) {
			sdrv_usr_nm(value);
			return;
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			attr_char11(value);
			return;
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			attr_char12(value);
			return;
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			attr_char13(value);
			return;
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			attr_char14(value);
			return;
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			attr_char15(value);
			return;
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			attr_char16(value);
			return;
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			attr_char17(value);
			return;
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			attr_char18(value);
			return;
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			attr_char19(value);
			return;
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			attr_char20(value);
			return;
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			attr_char21(value);
			return;
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			attr_char22(value);
			return;
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			attr_char23(value);
			return;
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			attr_char24(value);
			return;
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			attr_char25(value);
			return;
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			attr_char26(value);
			return;
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			attr_char27(value);
			return;
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			attr_char28(value);
			return;
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			attr_char29(value);
			return;
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			attr_char30(value);
			return;
		}
		if ($sdrv_if_rmrks.equalsIgnoreCase(name)) {
			sdrv_if_rmrks(value);
			return;
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			attr_char1(value);
			return;
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			attr_char2(value);
			return;
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			attr_char3(value);
			return;
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			attr_char4(value);
			return;
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			attr_char5(value);
			return;
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			attr_char6(value);
			return;
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			attr_char7(value);
			return;
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			attr_char8(value);
			return;
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			attr_char9(value);
			return;
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			attr_char10(value);
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
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
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
		if ($sdrv_tm.equalsIgnoreCase(name)) {
			sdrv_tm(value);
			return;
		}
		if ($attr_tm1.equalsIgnoreCase(name)) {
			attr_tm1(value);
			return;
		}
		if ($attr_tm2.equalsIgnoreCase(name)) {
			attr_tm2(value);
			return;
		}
		if ($attr_tm3.equalsIgnoreCase(name)) {
			attr_tm3(value);
			return;
		}
		if ($attr_tm4.equalsIgnoreCase(name)) {
			attr_tm4(value);
			return;
		}
		if ($attr_tm5.equalsIgnoreCase(name)) {
			attr_tm5(value);
			return;
		}
		if ($attr_dt1.equalsIgnoreCase(name)) {
			attr_dt1(value);
			return;
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			attr_dt2(value);
			return;
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			attr_dt3(value);
			return;
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			attr_dt4(value);
			return;
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			attr_dt5(value);
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
		if ($not_send_flg.equalsIgnoreCase(name)) {
			not_send_flg(value);
			return;
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			not_send_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($conv_ope.equalsIgnoreCase(name)) {
			conv_ope(value);
			return;
		}
		if ($file_io_ope.equalsIgnoreCase(name)) {
			file_io_ope(value);
			return;
		}
		if ($web_api_ope.equalsIgnoreCase(name)) {
			web_api_ope(value);
			return;
		}
		if ($cmd_exec_ope.equalsIgnoreCase(name)) {
			cmd_exec_ope(value);
			return;
		}
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			sdrv_sts_typ(value);
			return;
		}
		if ($sdrv_clt_id.equalsIgnoreCase(name)) {
			sdrv_clt_id(value);
			return;
		}
		if ($sdrv_usr_id.equalsIgnoreCase(name)) {
			sdrv_usr_id(value);
			return;
		}
		if ($sdrv_usr_nm.equalsIgnoreCase(name)) {
			sdrv_usr_nm(value);
			return;
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			attr_char11(value);
			return;
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			attr_char12(value);
			return;
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			attr_char13(value);
			return;
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			attr_char14(value);
			return;
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			attr_char15(value);
			return;
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			attr_char16(value);
			return;
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			attr_char17(value);
			return;
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			attr_char18(value);
			return;
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			attr_char19(value);
			return;
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			attr_char20(value);
			return;
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			attr_char21(value);
			return;
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			attr_char22(value);
			return;
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			attr_char23(value);
			return;
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			attr_char24(value);
			return;
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			attr_char25(value);
			return;
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			attr_char26(value);
			return;
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			attr_char27(value);
			return;
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			attr_char28(value);
			return;
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			attr_char29(value);
			return;
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			attr_char30(value);
			return;
		}
		if ($sdrv_if_rmrks.equalsIgnoreCase(name)) {
			sdrv_if_rmrks(value);
			return;
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			attr_char1(value);
			return;
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			attr_char2(value);
			return;
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			attr_char3(value);
			return;
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			attr_char4(value);
			return;
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			attr_char5(value);
			return;
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			attr_char6(value);
			return;
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			attr_char7(value);
			return;
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			attr_char8(value);
			return;
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			attr_char9(value);
			return;
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			attr_char10(value);
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
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
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
		if ($sdrv_tm.equalsIgnoreCase(name)) {
			sdrv_tm(value);
			return;
		}
		if ($attr_tm1.equalsIgnoreCase(name)) {
			attr_tm1(value);
			return;
		}
		if ($attr_tm2.equalsIgnoreCase(name)) {
			attr_tm2(value);
			return;
		}
		if ($attr_tm3.equalsIgnoreCase(name)) {
			attr_tm3(value);
			return;
		}
		if ($attr_tm4.equalsIgnoreCase(name)) {
			attr_tm4(value);
			return;
		}
		if ($attr_tm5.equalsIgnoreCase(name)) {
			attr_tm5(value);
			return;
		}
		if ($attr_dt1.equalsIgnoreCase(name)) {
			attr_dt1(value);
			return;
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			attr_dt2(value);
			return;
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			attr_dt3(value);
			return;
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			attr_dt4(value);
			return;
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			attr_dt5(value);
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
		if ($not_send_flg.equalsIgnoreCase(name)) {
			not_send_flg(value);
			return;
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			not_send_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
