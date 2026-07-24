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
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBinaryPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "添付ファイル情報 // Attachement file info."DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>帳票管理ＮＯ</td>
 *  	<td>Report management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>edition</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>版</td>
 *  	<td>Version</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務区分</td>
 *  	<td>Business type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>report_id</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票ＩＤ</td>
 *  	<td>Report ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_key1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務キー１</td>
 *  	<td>Business key 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_key2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務キー２</td>
 *  	<td>Business key 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_key3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務キー３</td>
 *  	<td>Business key 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_key4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務キー４</td>
 *  	<td>Business key 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_key5</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務キー５</td>
 *  	<td>Business key 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_key6</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務キー６</td>
 *  	<td>Business key 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_key7</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務キー７</td>
 *  	<td>Business key 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_key8</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務キー８</td>
 *  	<td>Business key 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_key9</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務キー９</td>
 *  	<td>Business key 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_key10</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務キー１０</td>
 *  	<td>Business key 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>data_crud_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データ更新区分</td>
 *  	<td>Data update type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引年月日</td>
 *  	<td>Transaction date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引金額</td>
 *  	<td>Transaction amount</td>
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
 *  	<td>rmrks1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>備考１</td>
 *  	<td>Remarks 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rmrks2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>備考２</td>
 *  	<td>Remarks 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rmrks3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>備考３</td>
 *  	<td>Remarks 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rmrks4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>備考４</td>
 *  	<td>Remarks 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rmrks5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>備考５</td>
 *  	<td>Remarks 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_attr1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１</td>
 *  	<td>Report attribute 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_attr2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性２</td>
 *  	<td>Report attribute 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_attr3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性３</td>
 *  	<td>Report attribute 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_attr4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性４</td>
 *  	<td>Report attribute 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_attr5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性５</td>
 *  	<td>Report attribute 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_attr6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性６</td>
 *  	<td>Report attribute 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_attr7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性７</td>
 *  	<td>Report attribute 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_attr8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性８</td>
 *  	<td>Report attribute 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_attr9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性９</td>
 *  	<td>Report attribute 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_attr10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１０</td>
 *  	<td>Report attribute 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_attr11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１１</td>
 *  	<td>Report attribute 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_attr12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１２</td>
 *  	<td>Report attribute 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_attr13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１３</td>
 *  	<td>Report attribute 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_attr14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１４</td>
 *  	<td>Report attribute 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_attr15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１５</td>
 *  	<td>Report attribute 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_attr16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１６</td>
 *  	<td>Report attribute 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_attr17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１７</td>
 *  	<td>Report attribute 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_attr18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１８</td>
 *  	<td>Report attribute 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_attr19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性１９</td>
 *  	<td>Report attribute 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_attr20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票属性２０</td>
 *  	<td>Report attribute 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>file_path</td>
 *  	<td>C</td>
 *  	<td>200</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイルパス</td>
 *  	<td>File path</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>file_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名</td>
 *  	<td>File name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>archive_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>保存済ＦＬＧ</td>
 *  	<td>Saved flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>doc_id</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ドキュメントＩＤ</td>
 *  	<td>Document ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>file_bin</td>
 *  	<td>B</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル</td>
 *  	<td>File</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>msg_queue_id</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メッセージキューＩＤ</td>
 *  	<td>Message queue ID</td>
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
public class MBT_ATTACHMENT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MBT_ATTACHMENT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 帳票管理ＮＯ. Report management No..<p>
	 *
	 */
	public static final String $data_no = "data_no";
	private static final MCPermColumnInfo _data_no = createColumnInfo("data_no");
	public final MCStringPermColumn data_no = createStringColumn(_data_no);
	
	/**
	 * 版. Version.<p>
	 *
	 */
	public static final String $edition = "edition";
	private static final MCPermColumnInfo _edition = createColumnInfo("edition");
	public final MCNumberPermColumn edition = createNumberColumn(_edition);
	
	/**
	 * 業務区分. Business type.<p>
	 *
	 */
	public static final String $biz_typ = "biz_typ";
	private static final MCPermColumnInfo _biz_typ = createColumnInfo("biz_typ");
	public final MCStringPermColumn biz_typ = createStringColumn(_biz_typ);
	
	/**
	 * 帳票ＩＤ. Report ID.<p>
	 *
	 */
	public static final String $report_id = "report_id";
	private static final MCPermColumnInfo _report_id = createColumnInfo("report_id");
	public final MCStringPermColumn report_id = createStringColumn(_report_id);
	
	/**
	 * 業務キー１. Business key 1.<p>
	 *
	 */
	public static final String $biz_key1 = "biz_key1";
	private static final MCPermColumnInfo _biz_key1 = createColumnInfo("biz_key1");
	public final MCStringPermColumn biz_key1 = createStringColumn(_biz_key1);
	
	/**
	 * 業務キー２. Business key 2.<p>
	 *
	 */
	public static final String $biz_key2 = "biz_key2";
	private static final MCPermColumnInfo _biz_key2 = createColumnInfo("biz_key2");
	public final MCStringPermColumn biz_key2 = createStringColumn(_biz_key2);
	
	/**
	 * 業務キー３. Business key 3.<p>
	 *
	 */
	public static final String $biz_key3 = "biz_key3";
	private static final MCPermColumnInfo _biz_key3 = createColumnInfo("biz_key3");
	public final MCStringPermColumn biz_key3 = createStringColumn(_biz_key3);
	
	/**
	 * 業務キー４. Business key 4.<p>
	 *
	 */
	public static final String $biz_key4 = "biz_key4";
	private static final MCPermColumnInfo _biz_key4 = createColumnInfo("biz_key4");
	public final MCStringPermColumn biz_key4 = createStringColumn(_biz_key4);
	
	/**
	 * 業務キー５. Business key 5.<p>
	 *
	 */
	public static final String $biz_key5 = "biz_key5";
	private static final MCPermColumnInfo _biz_key5 = createColumnInfo("biz_key5");
	public final MCStringPermColumn biz_key5 = createStringColumn(_biz_key5);
	
	/**
	 * 業務キー６. Business key 6.<p>
	 *
	 */
	public static final String $biz_key6 = "biz_key6";
	private static final MCPermColumnInfo _biz_key6 = createColumnInfo("biz_key6");
	public final MCStringPermColumn biz_key6 = createStringColumn(_biz_key6);
	
	/**
	 * 業務キー７. Business key 7.<p>
	 *
	 */
	public static final String $biz_key7 = "biz_key7";
	private static final MCPermColumnInfo _biz_key7 = createColumnInfo("biz_key7");
	public final MCStringPermColumn biz_key7 = createStringColumn(_biz_key7);
	
	/**
	 * 業務キー８. Business key 8.<p>
	 *
	 */
	public static final String $biz_key8 = "biz_key8";
	private static final MCPermColumnInfo _biz_key8 = createColumnInfo("biz_key8");
	public final MCStringPermColumn biz_key8 = createStringColumn(_biz_key8);
	
	/**
	 * 業務キー９. Business key 9.<p>
	 *
	 */
	public static final String $biz_key9 = "biz_key9";
	private static final MCPermColumnInfo _biz_key9 = createColumnInfo("biz_key9");
	public final MCStringPermColumn biz_key9 = createStringColumn(_biz_key9);
	
	/**
	 * 業務キー１０. Business key 10.<p>
	 *
	 */
	public static final String $biz_key10 = "biz_key10";
	private static final MCPermColumnInfo _biz_key10 = createColumnInfo("biz_key10");
	public final MCStringPermColumn biz_key10 = createStringColumn(_biz_key10);
	
	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	private static final MCPermColumnInfo _data_crud_typ = createColumnInfo("data_crud_typ");
	public final MCStringPermColumn data_crud_typ = createStringColumn(_data_crud_typ);
	
	/**
	 * 取引年月日. Transaction date.<p>
	 *
	 */
	public static final String $dt = "dt";
	private static final MCPermColumnInfo _dt = createColumnInfo("dt");
	public final MCDatePermColumn dt = createDateColumn(_dt);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * 取引金額. Transaction amount.<p>
	 *
	 */
	public static final String $amt = "amt";
	private static final MCPermColumnInfo _amt = createColumnInfo("amt");
	public final MCNumberPermColumn amt = createNumberColumn(_amt);
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 備考１. Remarks 1.<p>
	 *
	 */
	public static final String $rmrks1 = "rmrks1";
	private static final MCPermColumnInfo _rmrks1 = createColumnInfo("rmrks1");
	public final MCStringPermColumn rmrks1 = createStringColumn(_rmrks1);
	
	/**
	 * 備考２. Remarks 2.<p>
	 *
	 */
	public static final String $rmrks2 = "rmrks2";
	private static final MCPermColumnInfo _rmrks2 = createColumnInfo("rmrks2");
	public final MCStringPermColumn rmrks2 = createStringColumn(_rmrks2);
	
	/**
	 * 備考３. Remarks 3.<p>
	 *
	 */
	public static final String $rmrks3 = "rmrks3";
	private static final MCPermColumnInfo _rmrks3 = createColumnInfo("rmrks3");
	public final MCStringPermColumn rmrks3 = createStringColumn(_rmrks3);
	
	/**
	 * 備考４. Remarks 4.<p>
	 *
	 */
	public static final String $rmrks4 = "rmrks4";
	private static final MCPermColumnInfo _rmrks4 = createColumnInfo("rmrks4");
	public final MCStringPermColumn rmrks4 = createStringColumn(_rmrks4);
	
	/**
	 * 備考５. Remarks 5.<p>
	 *
	 */
	public static final String $rmrks5 = "rmrks5";
	private static final MCPermColumnInfo _rmrks5 = createColumnInfo("rmrks5");
	public final MCStringPermColumn rmrks5 = createStringColumn(_rmrks5);
	
	/**
	 * 帳票属性１. Report attribute 1.<p>
	 *
	 */
	public static final String $rpt_attr1 = "rpt_attr1";
	private static final MCPermColumnInfo _rpt_attr1 = createColumnInfo("rpt_attr1");
	public final MCStringPermColumn rpt_attr1 = createStringColumn(_rpt_attr1);
	
	/**
	 * 帳票属性２. Report attribute 2.<p>
	 *
	 */
	public static final String $rpt_attr2 = "rpt_attr2";
	private static final MCPermColumnInfo _rpt_attr2 = createColumnInfo("rpt_attr2");
	public final MCStringPermColumn rpt_attr2 = createStringColumn(_rpt_attr2);
	
	/**
	 * 帳票属性３. Report attribute 3.<p>
	 *
	 */
	public static final String $rpt_attr3 = "rpt_attr3";
	private static final MCPermColumnInfo _rpt_attr3 = createColumnInfo("rpt_attr3");
	public final MCStringPermColumn rpt_attr3 = createStringColumn(_rpt_attr3);
	
	/**
	 * 帳票属性４. Report attribute 4.<p>
	 *
	 */
	public static final String $rpt_attr4 = "rpt_attr4";
	private static final MCPermColumnInfo _rpt_attr4 = createColumnInfo("rpt_attr4");
	public final MCStringPermColumn rpt_attr4 = createStringColumn(_rpt_attr4);
	
	/**
	 * 帳票属性５. Report attribute 5.<p>
	 *
	 */
	public static final String $rpt_attr5 = "rpt_attr5";
	private static final MCPermColumnInfo _rpt_attr5 = createColumnInfo("rpt_attr5");
	public final MCStringPermColumn rpt_attr5 = createStringColumn(_rpt_attr5);
	
	/**
	 * 帳票属性６. Report attribute 6.<p>
	 *
	 */
	public static final String $rpt_attr6 = "rpt_attr6";
	private static final MCPermColumnInfo _rpt_attr6 = createColumnInfo("rpt_attr6");
	public final MCStringPermColumn rpt_attr6 = createStringColumn(_rpt_attr6);
	
	/**
	 * 帳票属性７. Report attribute 7.<p>
	 *
	 */
	public static final String $rpt_attr7 = "rpt_attr7";
	private static final MCPermColumnInfo _rpt_attr7 = createColumnInfo("rpt_attr7");
	public final MCStringPermColumn rpt_attr7 = createStringColumn(_rpt_attr7);
	
	/**
	 * 帳票属性８. Report attribute 8.<p>
	 *
	 */
	public static final String $rpt_attr8 = "rpt_attr8";
	private static final MCPermColumnInfo _rpt_attr8 = createColumnInfo("rpt_attr8");
	public final MCStringPermColumn rpt_attr8 = createStringColumn(_rpt_attr8);
	
	/**
	 * 帳票属性９. Report attribute 9.<p>
	 *
	 */
	public static final String $rpt_attr9 = "rpt_attr9";
	private static final MCPermColumnInfo _rpt_attr9 = createColumnInfo("rpt_attr9");
	public final MCStringPermColumn rpt_attr9 = createStringColumn(_rpt_attr9);
	
	/**
	 * 帳票属性１０. Report attribute 10.<p>
	 *
	 */
	public static final String $rpt_attr10 = "rpt_attr10";
	private static final MCPermColumnInfo _rpt_attr10 = createColumnInfo("rpt_attr10");
	public final MCStringPermColumn rpt_attr10 = createStringColumn(_rpt_attr10);
	
	/**
	 * 帳票属性１１. Report attribute 11.<p>
	 *
	 */
	public static final String $rpt_attr11 = "rpt_attr11";
	private static final MCPermColumnInfo _rpt_attr11 = createColumnInfo("rpt_attr11");
	public final MCStringPermColumn rpt_attr11 = createStringColumn(_rpt_attr11);
	
	/**
	 * 帳票属性１２. Report attribute 12.<p>
	 *
	 */
	public static final String $rpt_attr12 = "rpt_attr12";
	private static final MCPermColumnInfo _rpt_attr12 = createColumnInfo("rpt_attr12");
	public final MCStringPermColumn rpt_attr12 = createStringColumn(_rpt_attr12);
	
	/**
	 * 帳票属性１３. Report attribute 13.<p>
	 *
	 */
	public static final String $rpt_attr13 = "rpt_attr13";
	private static final MCPermColumnInfo _rpt_attr13 = createColumnInfo("rpt_attr13");
	public final MCStringPermColumn rpt_attr13 = createStringColumn(_rpt_attr13);
	
	/**
	 * 帳票属性１４. Report attribute 14.<p>
	 *
	 */
	public static final String $rpt_attr14 = "rpt_attr14";
	private static final MCPermColumnInfo _rpt_attr14 = createColumnInfo("rpt_attr14");
	public final MCStringPermColumn rpt_attr14 = createStringColumn(_rpt_attr14);
	
	/**
	 * 帳票属性１５. Report attribute 15.<p>
	 *
	 */
	public static final String $rpt_attr15 = "rpt_attr15";
	private static final MCPermColumnInfo _rpt_attr15 = createColumnInfo("rpt_attr15");
	public final MCStringPermColumn rpt_attr15 = createStringColumn(_rpt_attr15);
	
	/**
	 * 帳票属性１６. Report attribute 16.<p>
	 *
	 */
	public static final String $rpt_attr16 = "rpt_attr16";
	private static final MCPermColumnInfo _rpt_attr16 = createColumnInfo("rpt_attr16");
	public final MCStringPermColumn rpt_attr16 = createStringColumn(_rpt_attr16);
	
	/**
	 * 帳票属性１７. Report attribute 17.<p>
	 *
	 */
	public static final String $rpt_attr17 = "rpt_attr17";
	private static final MCPermColumnInfo _rpt_attr17 = createColumnInfo("rpt_attr17");
	public final MCStringPermColumn rpt_attr17 = createStringColumn(_rpt_attr17);
	
	/**
	 * 帳票属性１８. Report attribute 18.<p>
	 *
	 */
	public static final String $rpt_attr18 = "rpt_attr18";
	private static final MCPermColumnInfo _rpt_attr18 = createColumnInfo("rpt_attr18");
	public final MCStringPermColumn rpt_attr18 = createStringColumn(_rpt_attr18);
	
	/**
	 * 帳票属性１９. Report attribute 19.<p>
	 *
	 */
	public static final String $rpt_attr19 = "rpt_attr19";
	private static final MCPermColumnInfo _rpt_attr19 = createColumnInfo("rpt_attr19");
	public final MCStringPermColumn rpt_attr19 = createStringColumn(_rpt_attr19);
	
	/**
	 * 帳票属性２０. Report attribute 20.<p>
	 *
	 */
	public static final String $rpt_attr20 = "rpt_attr20";
	private static final MCPermColumnInfo _rpt_attr20 = createColumnInfo("rpt_attr20");
	public final MCStringPermColumn rpt_attr20 = createStringColumn(_rpt_attr20);
	
	/**
	 * ファイルパス. File path.<p>
	 *
	 */
	public static final String $file_path = "file_path";
	private static final MCPermColumnInfo _file_path = createColumnInfo("file_path");
	public final MCStringPermColumn file_path = createStringColumn(_file_path);
	
	/**
	 * ファイル名. File name.<p>
	 *
	 */
	public static final String $file_nm = "file_nm";
	private static final MCPermColumnInfo _file_nm = createColumnInfo("file_nm");
	public final MCStringPermColumn file_nm = createStringColumn(_file_nm);
	
	/**
	 * 保存済ＦＬＧ. Saved flg..<p>
	 *
	 */
	public static final String $archive_flg = "archive_flg";
	private static final MCPermColumnInfo _archive_flg = createColumnInfo("archive_flg");
	public final MCBooleanPermColumn archive_flg = createBooleanColumn(_archive_flg);
	
	/**
	 * ドキュメントＩＤ. Document ID.<p>
	 *
	 */
	public static final String $doc_id = "doc_id";
	private static final MCPermColumnInfo _doc_id = createColumnInfo("doc_id");
	public final MCStringPermColumn doc_id = createStringColumn(_doc_id);
	
	/**
	 * ファイル. File.<p>
	 *
	 */
	public static final String $file_bin = "file_bin";
	private static final MCPermColumnInfo _file_bin = createColumnInfo("file_bin");
	public final MCBinaryPermColumn file_bin = createBinaryColumn(_file_bin);
	
	/**
	 * メッセージキューＩＤ. Message queue ID.<p>
	 *
	 */
	public static final String $msg_queue_id = "msg_queue_id";
	private static final MCPermColumnInfo _msg_queue_id = createColumnInfo("msg_queue_id");
	public final MCStringPermColumn msg_queue_id = createStringColumn(_msg_queue_id);
	
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
	
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IT_DAT_NO);
	public static final MCMeta edition_META = createCommonMeta($edition, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta biz_typ_META = createCommonMeta($biz_typ, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta report_id_META = createCommonMeta($report_id, mcframe.commonMA.meta.MA_META.REPORT_ID);
	public static final MCMeta biz_key1_META = createCommonMeta($biz_key1, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key2_META = createCommonMeta($biz_key2, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key3_META = createCommonMeta($biz_key3, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key4_META = createCommonMeta($biz_key4, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key5_META = createCommonMeta($biz_key5, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key6_META = createCommonMeta($biz_key6, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key7_META = createCommonMeta($biz_key7, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key8_META = createCommonMeta($biz_key8, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key9_META = createCommonMeta($biz_key9, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key10_META = createCommonMeta($biz_key10, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rmrks1_META = createCommonMeta($rmrks1, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks2_META = createCommonMeta($rmrks2, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks3_META = createCommonMeta($rmrks3, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks4_META = createCommonMeta($rmrks4, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks5_META = createCommonMeta($rmrks5, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rpt_attr1_META = createCommonMeta($rpt_attr1, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR1);
	public static final MCMeta rpt_attr2_META = createCommonMeta($rpt_attr2, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR2);
	public static final MCMeta rpt_attr3_META = createCommonMeta($rpt_attr3, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR3);
	public static final MCMeta rpt_attr4_META = createCommonMeta($rpt_attr4, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR4);
	public static final MCMeta rpt_attr5_META = createCommonMeta($rpt_attr5, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR5);
	public static final MCMeta rpt_attr6_META = createCommonMeta($rpt_attr6, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR6);
	public static final MCMeta rpt_attr7_META = createCommonMeta($rpt_attr7, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR7);
	public static final MCMeta rpt_attr8_META = createCommonMeta($rpt_attr8, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR8);
	public static final MCMeta rpt_attr9_META = createCommonMeta($rpt_attr9, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR9);
	public static final MCMeta rpt_attr10_META = createCommonMeta($rpt_attr10, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR10);
	public static final MCMeta rpt_attr11_META = createCommonMeta($rpt_attr11, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR11);
	public static final MCMeta rpt_attr12_META = createCommonMeta($rpt_attr12, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR12);
	public static final MCMeta rpt_attr13_META = createCommonMeta($rpt_attr13, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR13);
	public static final MCMeta rpt_attr14_META = createCommonMeta($rpt_attr14, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR14);
	public static final MCMeta rpt_attr15_META = createCommonMeta($rpt_attr15, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR15);
	public static final MCMeta rpt_attr16_META = createCommonMeta($rpt_attr16, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR16);
	public static final MCMeta rpt_attr17_META = createCommonMeta($rpt_attr17, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR17);
	public static final MCMeta rpt_attr18_META = createCommonMeta($rpt_attr18, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR18);
	public static final MCMeta rpt_attr19_META = createCommonMeta($rpt_attr19, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR19);
	public static final MCMeta rpt_attr20_META = createCommonMeta($rpt_attr20, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR20);
	public static final MCMeta file_path_META = createCommonMeta($file_path, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta file_nm_META = createCommonMeta($file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta archive_flg_META = createCommonMeta($archive_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta doc_id_META = createCommonMeta($doc_id, mcframe.commonMA.meta.MA_META.DOC_ID);
	public static final MCMeta file_bin_META = createCommonMeta($file_bin, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta msg_queue_id_META = createCommonMeta($msg_queue_id, mcframe.commonMA.meta.MA_META.MSG_QUEUE_ID);
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
	
	protected static final ConstMetaList<MBT_ATTACHMENT_R> constMetas = new ConstMetaList<MBT_ATTACHMENT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_no_META,
			edition_META,
			biz_typ_META,
			report_id_META,
			biz_key1_META,
			biz_key2_META,
			biz_key3_META,
			biz_key4_META,
			biz_key5_META,
			biz_key6_META,
			biz_key7_META,
			biz_key8_META,
			biz_key9_META,
			biz_key10_META,
			data_crud_typ_META,
			dt_META,
			cur_cd_META,
			amt_META,
			bp_cd_META,
			rmrks1_META,
			rmrks2_META,
			rmrks3_META,
			rmrks4_META,
			rmrks5_META,
			rpt_attr1_META,
			rpt_attr2_META,
			rpt_attr3_META,
			rpt_attr4_META,
			rpt_attr5_META,
			rpt_attr6_META,
			rpt_attr7_META,
			rpt_attr8_META,
			rpt_attr9_META,
			rpt_attr10_META,
			rpt_attr11_META,
			rpt_attr12_META,
			rpt_attr13_META,
			rpt_attr14_META,
			rpt_attr15_META,
			rpt_attr16_META,
			rpt_attr17_META,
			rpt_attr18_META,
			rpt_attr19_META,
			rpt_attr20_META,
			file_path_META,
			file_nm_META,
			archive_flg_META,
			doc_id_META,
			file_bin_META,
			msg_queue_id_META,
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
	protected MBT_ATTACHMENT_R(ConstMetaList<? extends MBT_ATTACHMENT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBT_ATTACHMENT_R(ConstMetaList<? extends MBT_ATTACHMENT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$data_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$data_no,
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
			MBT_ATTACHMENT_R.$edition,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ATTACHMENT_R.$edition,
				"edition",
				edition,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_typ,
				"biz_typ",
				biz_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$report_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$report_id,
				"report_id",
				report_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_key1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_key1,
				"biz_key1",
				biz_key1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_key2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_key2,
				"biz_key2",
				biz_key2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_key3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_key3,
				"biz_key3",
				biz_key3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_key4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_key4,
				"biz_key4",
				biz_key4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_key5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_key5,
				"biz_key5",
				biz_key5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_key6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_key6,
				"biz_key6",
				biz_key6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_key7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_key7,
				"biz_key7",
				biz_key7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_key8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_key8,
				"biz_key8",
				biz_key8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_key9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_key9,
				"biz_key9",
				biz_key9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$biz_key10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$biz_key10,
				"biz_key10",
				biz_key10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$data_crud_typ,
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
			MBT_ATTACHMENT_R.$dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_ATTACHMENT_R.$dt,
				"dt",
				dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$cur_cd,
				"cur_cd",
				cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ATTACHMENT_R.$amt,
				"amt",
				amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$bp_cd,
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
			MBT_ATTACHMENT_R.$rmrks1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rmrks1,
				"rmrks1",
				rmrks1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rmrks2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rmrks2,
				"rmrks2",
				rmrks2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rmrks3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rmrks3,
				"rmrks3",
				rmrks3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rmrks4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rmrks4,
				"rmrks4",
				rmrks4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rmrks5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rmrks5,
				"rmrks5",
				rmrks5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr1,
				"rpt_attr1",
				rpt_attr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr2,
				"rpt_attr2",
				rpt_attr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr3,
				"rpt_attr3",
				rpt_attr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr4,
				"rpt_attr4",
				rpt_attr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr5,
				"rpt_attr5",
				rpt_attr5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr6,
				"rpt_attr6",
				rpt_attr6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr7,
				"rpt_attr7",
				rpt_attr7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr8,
				"rpt_attr8",
				rpt_attr8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr9,
				"rpt_attr9",
				rpt_attr9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr10,
				"rpt_attr10",
				rpt_attr10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr11,
				"rpt_attr11",
				rpt_attr11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr12,
				"rpt_attr12",
				rpt_attr12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr13,
				"rpt_attr13",
				rpt_attr13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr14,
				"rpt_attr14",
				rpt_attr14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr15,
				"rpt_attr15",
				rpt_attr15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr16,
				"rpt_attr16",
				rpt_attr16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr17,
				"rpt_attr17",
				rpt_attr17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr18,
				"rpt_attr18",
				rpt_attr18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr19,
				"rpt_attr19",
				rpt_attr19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$rpt_attr20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$rpt_attr20,
				"rpt_attr20",
				rpt_attr20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$file_path,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$file_path,
				"file_path",
				file_path,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$file_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$file_nm,
				"file_nm",
				file_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$archive_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ATTACHMENT_R.$archive_flg,
				"archive_flg",
				archive_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$doc_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$doc_id,
				"doc_id",
				doc_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$file_bin,
			new MCDBContainerColulmnInfo<MCBinaryPermColumn>(
				MCDataType.BINARY,
				MBT_ATTACHMENT_R.$file_bin,
				"file_bin",
				file_bin,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$msg_queue_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$msg_queue_id,
				"msg_queue_id",
				msg_queue_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ATTACHMENT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$ins_usr_id,
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
			MBT_ATTACHMENT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$ins_usr_nm,
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
			MBT_ATTACHMENT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_ATTACHMENT_R.$ins_ts,
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
			MBT_ATTACHMENT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$ins_func_id,
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
			MBT_ATTACHMENT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ATTACHMENT_R.$upd_cntr,
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
			MBT_ATTACHMENT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$upd_usr_id,
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
			MBT_ATTACHMENT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$upd_usr_nm,
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
			MBT_ATTACHMENT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_ATTACHMENT_R.$upd_ts,
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
			MBT_ATTACHMENT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$upd_func_id,
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
			MBT_ATTACHMENT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ATTACHMENT_R.$upd_srv_req_no,
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
	public static MBT_ATTACHMENT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBT_ATTACHMENT_R create(String alias) {
		MBT_ATTACHMENT_R row = new MBT_ATTACHMENT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBT_ATTACHMENT_R createByName(T proto) {
		MBT_ATTACHMENT_R row = MBT_ATTACHMENT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_ATTACHMENT_R clone() {
		return (MBT_ATTACHMENT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_ATTACHMENT_R createInstance() {
		return (MBT_ATTACHMENT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_ATTACHMENT_R getValues(String... names) {
		return (MBT_ATTACHMENT_R) super.getValues(names);
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
	 public MBW_ATTACHMENT_KEY_R getPkWorkDbc(String alias) {
	 	return MBW_ATTACHMENT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MBW_ATTACHMENT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MBW_ATTACHMENT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 帳票管理ＮＯ. Report management No..<p>
	 *
	 */
	public String data_no() {
		return getConstString(offset + 0, $data_no);
	}

	/**
	 * 帳票管理ＮＯ. Report management No..<p>
	 *
	 */
	public void data_no(String value) {
		setConstString(offset + 0, $data_no, value);
	}

	/**
	 * 版. Version.<p>
	 *
	 */
	public MCNumber edition() {
		return getConstNumber(offset + 1, $edition);
	}

	/**
	 * 版. Version.<p>
	 *
	 */
	public void edition(MCNumber value) {
		setConstNumber(offset + 1, $edition, value);
	}
	
	/**
	 * 版. Version.<p>
	 *
	 */
	public void edition(int value) {
		setConstNumber(offset + 1, $edition, value);
	}
	
	/**
	 * 版. Version.<p>
	 *
	 */
	public void edition(long value) {
		setConstNumber(offset + 1, $edition, value);
	}
	
	/**
	 * 版. Version.<p>
	 *
	 */
	public void edition(float value) {
		setConstNumber(offset + 1, $edition, value);
	}
	
	/**
	 * 版. Version.<p>
	 *
	 */
	public void edition(double value) {
		setConstNumber(offset + 1, $edition, value);
	}
	
	/**
	 * 業務区分. Business type.<p>
	 *
	 */
	public String biz_typ() {
		return getConstString(offset + 2, $biz_typ);
	}

	/**
	 * 業務区分. Business type.<p>
	 *
	 */
	public void biz_typ(String value) {
		setConstString(offset + 2, $biz_typ, value);
	}

	/**
	 * 帳票ＩＤ. Report ID.<p>
	 *
	 */
	public String report_id() {
		return getConstString(offset + 3, $report_id);
	}

	/**
	 * 帳票ＩＤ. Report ID.<p>
	 *
	 */
	public void report_id(String value) {
		setConstString(offset + 3, $report_id, value);
	}

	/**
	 * 業務キー１. Business key 1.<p>
	 *
	 */
	public String biz_key1() {
		return getConstString(offset + 4, $biz_key1);
	}

	/**
	 * 業務キー１. Business key 1.<p>
	 *
	 */
	public void biz_key1(String value) {
		setConstString(offset + 4, $biz_key1, value);
	}

	/**
	 * 業務キー２. Business key 2.<p>
	 *
	 */
	public String biz_key2() {
		return getConstString(offset + 5, $biz_key2);
	}

	/**
	 * 業務キー２. Business key 2.<p>
	 *
	 */
	public void biz_key2(String value) {
		setConstString(offset + 5, $biz_key2, value);
	}

	/**
	 * 業務キー３. Business key 3.<p>
	 *
	 */
	public String biz_key3() {
		return getConstString(offset + 6, $biz_key3);
	}

	/**
	 * 業務キー３. Business key 3.<p>
	 *
	 */
	public void biz_key3(String value) {
		setConstString(offset + 6, $biz_key3, value);
	}

	/**
	 * 業務キー４. Business key 4.<p>
	 *
	 */
	public String biz_key4() {
		return getConstString(offset + 7, $biz_key4);
	}

	/**
	 * 業務キー４. Business key 4.<p>
	 *
	 */
	public void biz_key4(String value) {
		setConstString(offset + 7, $biz_key4, value);
	}

	/**
	 * 業務キー５. Business key 5.<p>
	 *
	 */
	public String biz_key5() {
		return getConstString(offset + 8, $biz_key5);
	}

	/**
	 * 業務キー５. Business key 5.<p>
	 *
	 */
	public void biz_key5(String value) {
		setConstString(offset + 8, $biz_key5, value);
	}

	/**
	 * 業務キー６. Business key 6.<p>
	 *
	 */
	public String biz_key6() {
		return getConstString(offset + 9, $biz_key6);
	}

	/**
	 * 業務キー６. Business key 6.<p>
	 *
	 */
	public void biz_key6(String value) {
		setConstString(offset + 9, $biz_key6, value);
	}

	/**
	 * 業務キー７. Business key 7.<p>
	 *
	 */
	public String biz_key7() {
		return getConstString(offset + 10, $biz_key7);
	}

	/**
	 * 業務キー７. Business key 7.<p>
	 *
	 */
	public void biz_key7(String value) {
		setConstString(offset + 10, $biz_key7, value);
	}

	/**
	 * 業務キー８. Business key 8.<p>
	 *
	 */
	public String biz_key8() {
		return getConstString(offset + 11, $biz_key8);
	}

	/**
	 * 業務キー８. Business key 8.<p>
	 *
	 */
	public void biz_key8(String value) {
		setConstString(offset + 11, $biz_key8, value);
	}

	/**
	 * 業務キー９. Business key 9.<p>
	 *
	 */
	public String biz_key9() {
		return getConstString(offset + 12, $biz_key9);
	}

	/**
	 * 業務キー９. Business key 9.<p>
	 *
	 */
	public void biz_key9(String value) {
		setConstString(offset + 12, $biz_key9, value);
	}

	/**
	 * 業務キー１０. Business key 10.<p>
	 *
	 */
	public String biz_key10() {
		return getConstString(offset + 13, $biz_key10);
	}

	/**
	 * 業務キー１０. Business key 10.<p>
	 *
	 */
	public void biz_key10(String value) {
		setConstString(offset + 13, $biz_key10, value);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 14, $data_crud_typ);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 14, $data_crud_typ, value);
	}

	/**
	 * 取引年月日. Transaction date.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 15, $dt);
	}

	/**
	 * 取引年月日. Transaction date.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 15, $dt, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 16, $cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 16, $cur_cd, value);
	}

	/**
	 * 取引金額. Transaction amount.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 17, $amt);
	}

	/**
	 * 取引金額. Transaction amount.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 17, $amt, value);
	}
	
	/**
	 * 取引金額. Transaction amount.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 17, $amt, value);
	}
	
	/**
	 * 取引金額. Transaction amount.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 17, $amt, value);
	}
	
	/**
	 * 取引金額. Transaction amount.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 17, $amt, value);
	}
	
	/**
	 * 取引金額. Transaction amount.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 17, $amt, value);
	}
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 18, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 18, $bp_cd, value);
	}

	/**
	 * 備考１. Remarks 1.<p>
	 *
	 */
	public String rmrks1() {
		return getConstString(offset + 19, $rmrks1);
	}

	/**
	 * 備考１. Remarks 1.<p>
	 *
	 */
	public void rmrks1(String value) {
		setConstString(offset + 19, $rmrks1, value);
	}

	/**
	 * 備考２. Remarks 2.<p>
	 *
	 */
	public String rmrks2() {
		return getConstString(offset + 20, $rmrks2);
	}

	/**
	 * 備考２. Remarks 2.<p>
	 *
	 */
	public void rmrks2(String value) {
		setConstString(offset + 20, $rmrks2, value);
	}

	/**
	 * 備考３. Remarks 3.<p>
	 *
	 */
	public String rmrks3() {
		return getConstString(offset + 21, $rmrks3);
	}

	/**
	 * 備考３. Remarks 3.<p>
	 *
	 */
	public void rmrks3(String value) {
		setConstString(offset + 21, $rmrks3, value);
	}

	/**
	 * 備考４. Remarks 4.<p>
	 *
	 */
	public String rmrks4() {
		return getConstString(offset + 22, $rmrks4);
	}

	/**
	 * 備考４. Remarks 4.<p>
	 *
	 */
	public void rmrks4(String value) {
		setConstString(offset + 22, $rmrks4, value);
	}

	/**
	 * 備考５. Remarks 5.<p>
	 *
	 */
	public String rmrks5() {
		return getConstString(offset + 23, $rmrks5);
	}

	/**
	 * 備考５. Remarks 5.<p>
	 *
	 */
	public void rmrks5(String value) {
		setConstString(offset + 23, $rmrks5, value);
	}

	/**
	 * 帳票属性１. Report attribute 1.<p>
	 *
	 */
	public String rpt_attr1() {
		return getConstString(offset + 24, $rpt_attr1);
	}

	/**
	 * 帳票属性１. Report attribute 1.<p>
	 *
	 */
	public void rpt_attr1(String value) {
		setConstString(offset + 24, $rpt_attr1, value);
	}

	/**
	 * 帳票属性２. Report attribute 2.<p>
	 *
	 */
	public String rpt_attr2() {
		return getConstString(offset + 25, $rpt_attr2);
	}

	/**
	 * 帳票属性２. Report attribute 2.<p>
	 *
	 */
	public void rpt_attr2(String value) {
		setConstString(offset + 25, $rpt_attr2, value);
	}

	/**
	 * 帳票属性３. Report attribute 3.<p>
	 *
	 */
	public String rpt_attr3() {
		return getConstString(offset + 26, $rpt_attr3);
	}

	/**
	 * 帳票属性３. Report attribute 3.<p>
	 *
	 */
	public void rpt_attr3(String value) {
		setConstString(offset + 26, $rpt_attr3, value);
	}

	/**
	 * 帳票属性４. Report attribute 4.<p>
	 *
	 */
	public String rpt_attr4() {
		return getConstString(offset + 27, $rpt_attr4);
	}

	/**
	 * 帳票属性４. Report attribute 4.<p>
	 *
	 */
	public void rpt_attr4(String value) {
		setConstString(offset + 27, $rpt_attr4, value);
	}

	/**
	 * 帳票属性５. Report attribute 5.<p>
	 *
	 */
	public String rpt_attr5() {
		return getConstString(offset + 28, $rpt_attr5);
	}

	/**
	 * 帳票属性５. Report attribute 5.<p>
	 *
	 */
	public void rpt_attr5(String value) {
		setConstString(offset + 28, $rpt_attr5, value);
	}

	/**
	 * 帳票属性６. Report attribute 6.<p>
	 *
	 */
	public String rpt_attr6() {
		return getConstString(offset + 29, $rpt_attr6);
	}

	/**
	 * 帳票属性６. Report attribute 6.<p>
	 *
	 */
	public void rpt_attr6(String value) {
		setConstString(offset + 29, $rpt_attr6, value);
	}

	/**
	 * 帳票属性７. Report attribute 7.<p>
	 *
	 */
	public String rpt_attr7() {
		return getConstString(offset + 30, $rpt_attr7);
	}

	/**
	 * 帳票属性７. Report attribute 7.<p>
	 *
	 */
	public void rpt_attr7(String value) {
		setConstString(offset + 30, $rpt_attr7, value);
	}

	/**
	 * 帳票属性８. Report attribute 8.<p>
	 *
	 */
	public String rpt_attr8() {
		return getConstString(offset + 31, $rpt_attr8);
	}

	/**
	 * 帳票属性８. Report attribute 8.<p>
	 *
	 */
	public void rpt_attr8(String value) {
		setConstString(offset + 31, $rpt_attr8, value);
	}

	/**
	 * 帳票属性９. Report attribute 9.<p>
	 *
	 */
	public String rpt_attr9() {
		return getConstString(offset + 32, $rpt_attr9);
	}

	/**
	 * 帳票属性９. Report attribute 9.<p>
	 *
	 */
	public void rpt_attr9(String value) {
		setConstString(offset + 32, $rpt_attr9, value);
	}

	/**
	 * 帳票属性１０. Report attribute 10.<p>
	 *
	 */
	public String rpt_attr10() {
		return getConstString(offset + 33, $rpt_attr10);
	}

	/**
	 * 帳票属性１０. Report attribute 10.<p>
	 *
	 */
	public void rpt_attr10(String value) {
		setConstString(offset + 33, $rpt_attr10, value);
	}

	/**
	 * 帳票属性１１. Report attribute 11.<p>
	 *
	 */
	public String rpt_attr11() {
		return getConstString(offset + 34, $rpt_attr11);
	}

	/**
	 * 帳票属性１１. Report attribute 11.<p>
	 *
	 */
	public void rpt_attr11(String value) {
		setConstString(offset + 34, $rpt_attr11, value);
	}

	/**
	 * 帳票属性１２. Report attribute 12.<p>
	 *
	 */
	public String rpt_attr12() {
		return getConstString(offset + 35, $rpt_attr12);
	}

	/**
	 * 帳票属性１２. Report attribute 12.<p>
	 *
	 */
	public void rpt_attr12(String value) {
		setConstString(offset + 35, $rpt_attr12, value);
	}

	/**
	 * 帳票属性１３. Report attribute 13.<p>
	 *
	 */
	public String rpt_attr13() {
		return getConstString(offset + 36, $rpt_attr13);
	}

	/**
	 * 帳票属性１３. Report attribute 13.<p>
	 *
	 */
	public void rpt_attr13(String value) {
		setConstString(offset + 36, $rpt_attr13, value);
	}

	/**
	 * 帳票属性１４. Report attribute 14.<p>
	 *
	 */
	public String rpt_attr14() {
		return getConstString(offset + 37, $rpt_attr14);
	}

	/**
	 * 帳票属性１４. Report attribute 14.<p>
	 *
	 */
	public void rpt_attr14(String value) {
		setConstString(offset + 37, $rpt_attr14, value);
	}

	/**
	 * 帳票属性１５. Report attribute 15.<p>
	 *
	 */
	public String rpt_attr15() {
		return getConstString(offset + 38, $rpt_attr15);
	}

	/**
	 * 帳票属性１５. Report attribute 15.<p>
	 *
	 */
	public void rpt_attr15(String value) {
		setConstString(offset + 38, $rpt_attr15, value);
	}

	/**
	 * 帳票属性１６. Report attribute 16.<p>
	 *
	 */
	public String rpt_attr16() {
		return getConstString(offset + 39, $rpt_attr16);
	}

	/**
	 * 帳票属性１６. Report attribute 16.<p>
	 *
	 */
	public void rpt_attr16(String value) {
		setConstString(offset + 39, $rpt_attr16, value);
	}

	/**
	 * 帳票属性１７. Report attribute 17.<p>
	 *
	 */
	public String rpt_attr17() {
		return getConstString(offset + 40, $rpt_attr17);
	}

	/**
	 * 帳票属性１７. Report attribute 17.<p>
	 *
	 */
	public void rpt_attr17(String value) {
		setConstString(offset + 40, $rpt_attr17, value);
	}

	/**
	 * 帳票属性１８. Report attribute 18.<p>
	 *
	 */
	public String rpt_attr18() {
		return getConstString(offset + 41, $rpt_attr18);
	}

	/**
	 * 帳票属性１８. Report attribute 18.<p>
	 *
	 */
	public void rpt_attr18(String value) {
		setConstString(offset + 41, $rpt_attr18, value);
	}

	/**
	 * 帳票属性１９. Report attribute 19.<p>
	 *
	 */
	public String rpt_attr19() {
		return getConstString(offset + 42, $rpt_attr19);
	}

	/**
	 * 帳票属性１９. Report attribute 19.<p>
	 *
	 */
	public void rpt_attr19(String value) {
		setConstString(offset + 42, $rpt_attr19, value);
	}

	/**
	 * 帳票属性２０. Report attribute 20.<p>
	 *
	 */
	public String rpt_attr20() {
		return getConstString(offset + 43, $rpt_attr20);
	}

	/**
	 * 帳票属性２０. Report attribute 20.<p>
	 *
	 */
	public void rpt_attr20(String value) {
		setConstString(offset + 43, $rpt_attr20, value);
	}

	/**
	 * ファイルパス. File path.<p>
	 *
	 */
	public String file_path() {
		return getConstString(offset + 44, $file_path);
	}

	/**
	 * ファイルパス. File path.<p>
	 *
	 */
	public void file_path(String value) {
		setConstString(offset + 44, $file_path, value);
	}

	/**
	 * ファイル名. File name.<p>
	 *
	 */
	public String file_nm() {
		return getConstString(offset + 45, $file_nm);
	}

	/**
	 * ファイル名. File name.<p>
	 *
	 */
	public void file_nm(String value) {
		setConstString(offset + 45, $file_nm, value);
	}

	/**
	 * 保存済ＦＬＧ. Saved flg..<p>
	 *
	 */
	public boolean archive_flg() {
		return getConstBoolean(offset + 46, $archive_flg);
	}

	/**
	 * 保存済ＦＬＧ. Saved flg..<p>
	 *
	 */
	public void archive_flg(boolean value) {
		setConstBoolean(offset + 46, $archive_flg, value);
	}

	/**
	 * ドキュメントＩＤ. Document ID.<p>
	 *
	 */
	public String doc_id() {
		return getConstString(offset + 47, $doc_id);
	}

	/**
	 * ドキュメントＩＤ. Document ID.<p>
	 *
	 */
	public void doc_id(String value) {
		setConstString(offset + 47, $doc_id, value);
	}

	/**
	 * ファイル. File.<p>
	 *
	 */
	public MCBinary file_bin() {
		return getConstBinary(offset + 48, $file_bin);
	}

	/**
	 * ファイル. File.<p>
	 *
	 */
	public void file_bin(MCBinary value) {
		setConstBinary(offset + 48, $file_bin, value);
	}

	/**
	 * メッセージキューＩＤ. Message queue ID.<p>
	 *
	 */
	public String msg_queue_id() {
		return getConstString(offset + 49, $msg_queue_id);
	}

	/**
	 * メッセージキューＩＤ. Message queue ID.<p>
	 *
	 */
	public void msg_queue_id(String value) {
		setConstString(offset + 49, $msg_queue_id, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 50, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 50, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 51, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 51, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 52, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 52, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 53, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 53, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 54, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 54, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 54, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 54, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 54, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 54, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 55, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 55, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 56, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 56, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 57, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 57, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 58, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 58, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 59, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 59, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($report_id.equalsIgnoreCase(name)) {
			return report_id();
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			return biz_key1();
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			return biz_key2();
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			return biz_key3();
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			return biz_key4();
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			return biz_key5();
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			return biz_key6();
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			return biz_key7();
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			return biz_key8();
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			return biz_key9();
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			return biz_key10();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			return rpt_attr1();
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			return rpt_attr2();
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			return rpt_attr3();
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			return rpt_attr4();
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			return rpt_attr5();
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			return rpt_attr6();
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			return rpt_attr7();
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			return rpt_attr8();
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			return rpt_attr9();
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			return rpt_attr10();
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			return rpt_attr11();
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			return rpt_attr12();
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			return rpt_attr13();
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			return rpt_attr14();
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			return rpt_attr15();
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			return rpt_attr16();
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			return rpt_attr17();
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			return rpt_attr18();
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			return rpt_attr19();
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			return rpt_attr20();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			return doc_id();
		}
		if ($msg_queue_id.equalsIgnoreCase(name)) {
			return msg_queue_id();
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
		if ($edition.equalsIgnoreCase(name)) {
			return edition();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
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
		if ($archive_flg.equalsIgnoreCase(name)) {
			return archive_flg();
		}
		return super.getBoolean(name);
	}

	public MCBinary getBinary(String name) {
		if ($file_bin.equalsIgnoreCase(name)) {
			return file_bin();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($report_id.equalsIgnoreCase(name)) {
			return report_id();
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			return biz_key1();
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			return biz_key2();
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			return biz_key3();
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			return biz_key4();
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			return biz_key5();
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			return biz_key6();
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			return biz_key7();
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			return biz_key8();
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			return biz_key9();
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			return biz_key10();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			return rpt_attr1();
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			return rpt_attr2();
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			return rpt_attr3();
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			return rpt_attr4();
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			return rpt_attr5();
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			return rpt_attr6();
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			return rpt_attr7();
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			return rpt_attr8();
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			return rpt_attr9();
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			return rpt_attr10();
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			return rpt_attr11();
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			return rpt_attr12();
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			return rpt_attr13();
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			return rpt_attr14();
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			return rpt_attr15();
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			return rpt_attr16();
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			return rpt_attr17();
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			return rpt_attr18();
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			return rpt_attr19();
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			return rpt_attr20();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			return doc_id();
		}
		if ($msg_queue_id.equalsIgnoreCase(name)) {
			return msg_queue_id();
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
		if ($edition.equalsIgnoreCase(name)) {
			return edition();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
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
		if ($archive_flg.equalsIgnoreCase(name)) {
			return archive_flg();
		}
		return super.getBooleanNE(name);
	}

	public MCBinary getBinaryNE(String name) {
		if ($file_bin.equalsIgnoreCase(name)) {
			return file_bin();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($report_id.equalsIgnoreCase(name)) {
			report_id(value);
			return;
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			biz_key1(value);
			return;
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			biz_key2(value);
			return;
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			biz_key3(value);
			return;
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			biz_key4(value);
			return;
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			biz_key5(value);
			return;
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			biz_key6(value);
			return;
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			biz_key7(value);
			return;
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			biz_key8(value);
			return;
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			biz_key9(value);
			return;
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			biz_key10(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
			return;
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			rpt_attr1(value);
			return;
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			rpt_attr2(value);
			return;
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			rpt_attr3(value);
			return;
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			rpt_attr4(value);
			return;
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			rpt_attr5(value);
			return;
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			rpt_attr6(value);
			return;
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			rpt_attr7(value);
			return;
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			rpt_attr8(value);
			return;
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			rpt_attr9(value);
			return;
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			rpt_attr10(value);
			return;
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			rpt_attr11(value);
			return;
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			rpt_attr12(value);
			return;
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			rpt_attr13(value);
			return;
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			rpt_attr14(value);
			return;
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			rpt_attr15(value);
			return;
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			rpt_attr16(value);
			return;
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			rpt_attr17(value);
			return;
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			rpt_attr18(value);
			return;
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			rpt_attr19(value);
			return;
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			rpt_attr20(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			doc_id(value);
			return;
		}
		if ($msg_queue_id.equalsIgnoreCase(name)) {
			msg_queue_id(value);
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
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
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
		if ($archive_flg.equalsIgnoreCase(name)) {
			archive_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBinary(String name, MCBinary value) {
		if ($file_bin.equalsIgnoreCase(name)) {
			file_bin(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($report_id.equalsIgnoreCase(name)) {
			report_id(value);
			return;
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			biz_key1(value);
			return;
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			biz_key2(value);
			return;
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			biz_key3(value);
			return;
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			biz_key4(value);
			return;
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			biz_key5(value);
			return;
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			biz_key6(value);
			return;
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			biz_key7(value);
			return;
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			biz_key8(value);
			return;
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			biz_key9(value);
			return;
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			biz_key10(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
			return;
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			rpt_attr1(value);
			return;
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			rpt_attr2(value);
			return;
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			rpt_attr3(value);
			return;
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			rpt_attr4(value);
			return;
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			rpt_attr5(value);
			return;
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			rpt_attr6(value);
			return;
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			rpt_attr7(value);
			return;
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			rpt_attr8(value);
			return;
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			rpt_attr9(value);
			return;
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			rpt_attr10(value);
			return;
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			rpt_attr11(value);
			return;
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			rpt_attr12(value);
			return;
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			rpt_attr13(value);
			return;
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			rpt_attr14(value);
			return;
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			rpt_attr15(value);
			return;
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			rpt_attr16(value);
			return;
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			rpt_attr17(value);
			return;
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			rpt_attr18(value);
			return;
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			rpt_attr19(value);
			return;
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			rpt_attr20(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			doc_id(value);
			return;
		}
		if ($msg_queue_id.equalsIgnoreCase(name)) {
			msg_queue_id(value);
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
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
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
		if ($archive_flg.equalsIgnoreCase(name)) {
			archive_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public void setBinaryNE(String name, MCBinary value) {
		if ($file_bin.equalsIgnoreCase(name)) {
			file_bin(value);
			return;
		}
		super.setBinaryNE(name, value);
	}

}
