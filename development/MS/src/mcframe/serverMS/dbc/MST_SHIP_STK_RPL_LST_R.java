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
 * "出荷品不足一覧 // Replenishment for shipping item shortage"DBコンテナRowクラスです。<p>
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
 *  	<td>batch_data_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>バッチデータＮＯ</td>
 *  	<td>Batch data No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>exec_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>実行日時</td>
 *  	<td>Execution date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>バッチログＮＯ</td>
 *  	<td>Batch log No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払予定区分</td>
 *  	<td>GR/GI schedule type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払予定状況区分</td>
 *  	<td>GR/GI schedule status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slip_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定伝票ＮＯ</td>
 *  	<td>GR/GI schedule slip No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>引当ＦＬＧ</td>
 *  	<td>Allocation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定ＮＯ</td>
 *  	<td>GR/GI schedule No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定連番</td>
 *  	<td>GR/GI schedule sequence number</td>
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
 *  	<td>io_schd_sub_seq1</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備連番１</td>
 *  	<td>GR/GI schedule spare sequence No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_typ2</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備区分２</td>
 *  	<td>GR/GI schedule spare type 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_no2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備ＮＯ２</td>
 *  	<td>GR/GI schedule spare No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_seq2</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備連番２</td>
 *  	<td>GR/GI schedule spare sequence No. 2</td>
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
 *  	<td>io_schd_sub_seq3</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備連番３</td>
 *  	<td>GR/GI schedule spare sequence No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_typ4</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備区分４</td>
 *  	<td>GR/GI schedule spare type 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_no4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備ＮＯ４</td>
 *  	<td>GR/GI schedule spare No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_seq4</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備連番４</td>
 *  	<td>GR/GI schedule spare sequence No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払進捗管理ＮＯ</td>
 *  	<td>GR/GI progress management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>棚・ラインＣＤ</td>
 *  	<td>Rack/Line cd.</td>
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
 *  	<td>schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予定日付</td>
 *  	<td>Scheduled date</td>
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
 *  	<td>sno1_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 1 flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 2 flg.</td>
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
 *  	<td>sno3_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 3 flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 4 flg.</td>
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
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫取引先ＣＤ</td>
 *  	<td>Inventory BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫着荷先ＣＤ</td>
 *  	<td>Inventory arriving point cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>荷姿単位ＣＤ</td>
 *  	<td>SKU cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pack_unit_short_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>荷姿単位不足数</td>
 *  	<td>SKU shortage qty.</td>
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
 *  	<td>base_unit_short_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位不足数</td>
 *  	<td>Base unit shortage qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>vld_dt_fr</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効期限ＦＲＯＭ</td>
 *  	<td>Expiration date FROM</td>
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
public class MST_SHIP_STK_RPL_LST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_SHIP_STK_RPL_LST";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * バッチデータＮＯ. Batch data No..<p>
	 *
	 */
	public static final String $batch_data_no = "batch_data_no";
	private static final MCPermColumnInfo _batch_data_no = createColumnInfo("batch_data_no");
	public final MCStringPermColumn batch_data_no = createStringColumn(_batch_data_no);
	
	/**
	 * 実行日時. Execution date and time.<p>
	 *
	 */
	public static final String $exec_tm = "exec_tm";
	private static final MCPermColumnInfo _exec_tm = createColumnInfo("exec_tm");
	public final MCDatePermColumn exec_tm = createDateColumn(_exec_tm);
	
	/**
	 * バッチログＮＯ. Batch log No..<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";
	private static final MCPermColumnInfo _batch_log_no = createColumnInfo("batch_log_no");
	public final MCStringPermColumn batch_log_no = createStringColumn(_batch_log_no);
	
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
	 * 受払予定伝票ＮＯ. GR/GI schedule slip No..<p>
	 *
	 */
	public static final String $slip_schd_no = "slip_schd_no";
	private static final MCPermColumnInfo _slip_schd_no = createColumnInfo("slip_schd_no");
	public final MCStringPermColumn slip_schd_no = createStringColumn(_slip_schd_no);
	
	/**
	 * 引当ＦＬＧ. Allocation flg..<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	private static final MCPermColumnInfo _alloc_flg = createColumnInfo("alloc_flg");
	public final MCBooleanPermColumn alloc_flg = createBooleanColumn(_alloc_flg);
	
	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public static final String $io_schd_no = "io_schd_no";
	private static final MCPermColumnInfo _io_schd_no = createColumnInfo("io_schd_no");
	public final MCStringPermColumn io_schd_no = createStringColumn(_io_schd_no);
	
	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public static final String $io_schd_seq = "io_schd_seq";
	private static final MCPermColumnInfo _io_schd_seq = createColumnInfo("io_schd_seq");
	public final MCNumberPermColumn io_schd_seq = createNumberColumn(_io_schd_seq);
	
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
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public static final String $io_schd_sub_seq1 = "io_schd_sub_seq1";
	private static final MCPermColumnInfo _io_schd_sub_seq1 = createColumnInfo("io_schd_sub_seq1");
	public final MCNumberPermColumn io_schd_sub_seq1 = createNumberColumn(_io_schd_sub_seq1);
	
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
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public static final String $io_schd_sub_seq2 = "io_schd_sub_seq2";
	private static final MCPermColumnInfo _io_schd_sub_seq2 = createColumnInfo("io_schd_sub_seq2");
	public final MCNumberPermColumn io_schd_sub_seq2 = createNumberColumn(_io_schd_sub_seq2);
	
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
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public static final String $io_schd_sub_seq3 = "io_schd_sub_seq3";
	private static final MCPermColumnInfo _io_schd_sub_seq3 = createColumnInfo("io_schd_sub_seq3");
	public final MCNumberPermColumn io_schd_sub_seq3 = createNumberColumn(_io_schd_sub_seq3);
	
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
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public static final String $io_schd_sub_seq4 = "io_schd_sub_seq4";
	private static final MCPermColumnInfo _io_schd_sub_seq4 = createColumnInfo("io_schd_sub_seq4");
	public final MCNumberPermColumn io_schd_sub_seq4 = createNumberColumn(_io_schd_sub_seq4);
	
	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	private static final MCPermColumnInfo _io_schd_pr_no = createColumnInfo("io_schd_pr_no");
	public final MCStringPermColumn io_schd_pr_no = createStringColumn(_io_schd_pr_no);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 予定日付. Scheduled date.<p>
	 *
	 */
	public static final String $schd_dt = "schd_dt";
	private static final MCPermColumnInfo _schd_dt = createColumnInfo("schd_dt");
	public final MCDatePermColumn schd_dt = createDateColumn(_schd_dt);
	
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
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
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
	 * 手配ＮＯ１無し可ＦＬＧ. Allow without SEIBAN No. 1 flg..<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	private static final MCPermColumnInfo _sno1_null_flg = createColumnInfo("sno1_null_flg");
	public final MCBooleanPermColumn sno1_null_flg = createBooleanColumn(_sno1_null_flg);
	
	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	private static final MCPermColumnInfo _sno2 = createColumnInfo("sno2");
	public final MCStringPermColumn sno2 = createStringColumn(_sno2);
	
	/**
	 * 手配ＮＯ２無し可ＦＬＧ. Allow without SEIBAN No. 2 flg..<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	private static final MCPermColumnInfo _sno2_null_flg = createColumnInfo("sno2_null_flg");
	public final MCBooleanPermColumn sno2_null_flg = createBooleanColumn(_sno2_null_flg);
	
	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	private static final MCPermColumnInfo _sno3 = createColumnInfo("sno3");
	public final MCStringPermColumn sno3 = createStringColumn(_sno3);
	
	/**
	 * 手配ＮＯ３無し可ＦＬＧ. Allow without SEIBAN No. 3 flg..<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	private static final MCPermColumnInfo _sno3_null_flg = createColumnInfo("sno3_null_flg");
	public final MCBooleanPermColumn sno3_null_flg = createBooleanColumn(_sno3_null_flg);
	
	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	private static final MCPermColumnInfo _sno4 = createColumnInfo("sno4");
	public final MCStringPermColumn sno4 = createStringColumn(_sno4);
	
	/**
	 * 手配ＮＯ４無し可ＦＬＧ. Allow without SEIBAN No. 4 flg..<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	private static final MCPermColumnInfo _sno4_null_flg = createColumnInfo("sno4_null_flg");
	public final MCBooleanPermColumn sno4_null_flg = createBooleanColumn(_sno4_null_flg);
	
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
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	private static final MCPermColumnInfo _stk_arrv_bp_cd = createColumnInfo("stk_arrv_bp_cd");
	public final MCStringPermColumn stk_arrv_bp_cd = createStringColumn(_stk_arrv_bp_cd);
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	private static final MCPermColumnInfo _pack_unit_cd = createColumnInfo("pack_unit_cd");
	public final MCStringPermColumn pack_unit_cd = createStringColumn(_pack_unit_cd);
	
	/**
	 * 荷姿単位不足数. SKU shortage qty..<p>
	 *
	 */
	public static final String $pack_unit_short_qty = "pack_unit_short_qty";
	private static final MCPermColumnInfo _pack_unit_short_qty = createColumnInfo("pack_unit_short_qty");
	public final MCNumberPermColumn pack_unit_short_qty = createNumberColumn(_pack_unit_short_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 基準単位不足数. Base unit shortage qty..<p>
	 *
	 */
	public static final String $base_unit_short_qty = "base_unit_short_qty";
	private static final MCPermColumnInfo _base_unit_short_qty = createColumnInfo("base_unit_short_qty");
	public final MCNumberPermColumn base_unit_short_qty = createNumberColumn(_base_unit_short_qty);
	
	/**
	 * 有効期限ＦＲＯＭ. Expiration date FROM.<p>
	 *
	 */
	public static final String $vld_dt_fr = "vld_dt_fr";
	private static final MCPermColumnInfo _vld_dt_fr = createColumnInfo("vld_dt_fr");
	public final MCDatePermColumn vld_dt_fr = createDateColumn(_vld_dt_fr);
	
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
	
	public static final MCMeta batch_data_no_META = createCommonMeta($batch_data_no, mcframe.commonMA.meta.MA_META.BATCH_DATA_NO);
	public static final MCMeta exec_tm_META = createCommonMeta($exec_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta slip_schd_no_META = createCommonMeta($slip_schd_no, mcframe.commonMA.meta.MA_META.SLIP_SCHD_NO);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_schd_no_META = createCommonMeta($io_schd_no, mcframe.commonMA.meta.MA_META.IO_SCHD_NO);
	public static final MCMeta io_schd_seq_META = createCommonMeta($io_schd_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta io_schd_sub_typ1_META = createCommonMeta($io_schd_sub_typ1, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no1_META = createCommonMeta($io_schd_sub_no1, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_seq1_META = createCommonMeta($io_schd_sub_seq1, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta io_schd_sub_typ2_META = createCommonMeta($io_schd_sub_typ2, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no2_META = createCommonMeta($io_schd_sub_no2, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_seq2_META = createCommonMeta($io_schd_sub_seq2, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta io_schd_sub_typ3_META = createCommonMeta($io_schd_sub_typ3, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no3_META = createCommonMeta($io_schd_sub_no3, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_seq3_META = createCommonMeta($io_schd_sub_seq3, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta io_schd_sub_typ4_META = createCommonMeta($io_schd_sub_typ4, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no4_META = createCommonMeta($io_schd_sub_no4, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_seq4_META = createCommonMeta($io_schd_sub_seq4, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta schd_dt_META = createCommonMeta($schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_short_qty_META = createCommonMeta($pack_unit_short_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_short_qty_META = createCommonMeta($base_unit_short_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
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
	
	protected static final ConstMetaList<MST_SHIP_STK_RPL_LST_R> constMetas = new ConstMetaList<MST_SHIP_STK_RPL_LST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			batch_data_no_META,
			exec_tm_META,
			batch_log_no_META,
			io_schd_typ_META,
			io_schd_sts_typ_META,
			slip_schd_no_META,
			alloc_flg_META,
			io_schd_no_META,
			io_schd_seq_META,
			io_schd_sub_typ1_META,
			io_schd_sub_no1_META,
			io_schd_sub_seq1_META,
			io_schd_sub_typ2_META,
			io_schd_sub_no2_META,
			io_schd_sub_seq2_META,
			io_schd_sub_typ3_META,
			io_schd_sub_no3_META,
			io_schd_sub_seq3_META,
			io_schd_sub_typ4_META,
			io_schd_sub_no4_META,
			io_schd_sub_seq4_META,
			io_schd_pr_no_META,
			loc_cd_META,
			str_ln_cd_META,
			wg_cd_META,
			schd_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			gd_cd_META,
			quality_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			stk_arrv_bp_cd_META,
			pack_unit_cd_META,
			pack_unit_short_qty_META,
			base_unit_cd_META,
			base_unit_short_qty_META,
			vld_dt_fr_META,
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
	protected MST_SHIP_STK_RPL_LST_R(ConstMetaList<? extends MST_SHIP_STK_RPL_LST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_SHIP_STK_RPL_LST_R(ConstMetaList<? extends MST_SHIP_STK_RPL_LST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$batch_data_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$batch_data_no,
				"batch_data_no",
				batch_data_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$exec_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_STK_RPL_LST_R.$exec_tm,
				"exec_tm",
				exec_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$batch_log_no,
				"batch_log_no",
				batch_log_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$io_schd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_typ,
				"io_schd_typ",
				io_schd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$io_schd_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sts_typ,
				"io_schd_sts_typ",
				io_schd_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$slip_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$slip_schd_no,
				"slip_schd_no",
				slip_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$alloc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_STK_RPL_LST_R.$alloc_flg,
				"alloc_flg",
				alloc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$io_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_no,
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
			MST_SHIP_STK_RPL_LST_R.$io_schd_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_STK_RPL_LST_R.$io_schd_seq,
				"io_schd_seq",
				io_schd_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_typ1,
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
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_no1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_no1,
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
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_seq1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_seq1,
				"io_schd_sub_seq1",
				io_schd_sub_seq1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_typ2,
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
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_no2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_no2,
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
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_seq2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_seq2,
				"io_schd_sub_seq2",
				io_schd_sub_seq2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_typ3,
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
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_no3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_no3,
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
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_seq3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_seq3,
				"io_schd_sub_seq3",
				io_schd_sub_seq3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_typ4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_typ4,
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
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_no4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_no4,
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
			MST_SHIP_STK_RPL_LST_R.$io_schd_sub_seq4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_STK_RPL_LST_R.$io_schd_sub_seq4,
				"io_schd_sub_seq4",
				io_schd_sub_seq4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$io_schd_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$io_schd_pr_no,
				"io_schd_pr_no",
				io_schd_pr_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$loc_cd,
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
			MST_SHIP_STK_RPL_LST_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$str_ln_cd,
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
			MST_SHIP_STK_RPL_LST_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$wg_cd,
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
			MST_SHIP_STK_RPL_LST_R.$schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_STK_RPL_LST_R.$schd_dt,
				"schd_dt",
				schd_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$itm_cd,
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
			MST_SHIP_STK_RPL_LST_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$itm_sub1,
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
			MST_SHIP_STK_RPL_LST_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$itm_sub2,
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
			MST_SHIP_STK_RPL_LST_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$itm_sub3,
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
			MST_SHIP_STK_RPL_LST_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$ver_no,
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
			MST_SHIP_STK_RPL_LST_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$lot_no,
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
			MST_SHIP_STK_RPL_LST_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$sublot_no,
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
			MST_SHIP_STK_RPL_LST_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$sno1,
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
			MST_SHIP_STK_RPL_LST_R.$sno1_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_STK_RPL_LST_R.$sno1_null_flg,
				"sno1_null_flg",
				sno1_null_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$sno2,
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
			MST_SHIP_STK_RPL_LST_R.$sno2_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_STK_RPL_LST_R.$sno2_null_flg,
				"sno2_null_flg",
				sno2_null_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$sno3,
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
			MST_SHIP_STK_RPL_LST_R.$sno3_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_STK_RPL_LST_R.$sno3_null_flg,
				"sno3_null_flg",
				sno3_null_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$sno4,
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
			MST_SHIP_STK_RPL_LST_R.$sno4_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_STK_RPL_LST_R.$sno4_null_flg,
				"sno4_null_flg",
				sno4_null_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$gd_cd,
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
			MST_SHIP_STK_RPL_LST_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$quality_typ,
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
			MST_SHIP_STK_RPL_LST_R.$stk_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$stk_id_typ,
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
			MST_SHIP_STK_RPL_LST_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$stk_bp_cd,
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
			MST_SHIP_STK_RPL_LST_R.$stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$stk_arrv_bp_cd,
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
			MST_SHIP_STK_RPL_LST_R.$pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$pack_unit_cd,
				"pack_unit_cd",
				pack_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$pack_unit_short_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_STK_RPL_LST_R.$pack_unit_short_qty,
				"pack_unit_short_qty",
				pack_unit_short_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$base_unit_cd,
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
			MST_SHIP_STK_RPL_LST_R.$base_unit_short_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_STK_RPL_LST_R.$base_unit_short_qty,
				"base_unit_short_qty",
				base_unit_short_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$vld_dt_fr,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_STK_RPL_LST_R.$vld_dt_fr,
				"vld_dt_fr",
				vld_dt_fr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_STK_RPL_LST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$ins_usr_id,
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
			MST_SHIP_STK_RPL_LST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$ins_usr_nm,
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
			MST_SHIP_STK_RPL_LST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SHIP_STK_RPL_LST_R.$ins_ts,
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
			MST_SHIP_STK_RPL_LST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$ins_func_id,
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
			MST_SHIP_STK_RPL_LST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_STK_RPL_LST_R.$upd_cntr,
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
			MST_SHIP_STK_RPL_LST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$upd_usr_id,
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
			MST_SHIP_STK_RPL_LST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$upd_usr_nm,
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
			MST_SHIP_STK_RPL_LST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SHIP_STK_RPL_LST_R.$upd_ts,
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
			MST_SHIP_STK_RPL_LST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$upd_func_id,
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
			MST_SHIP_STK_RPL_LST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_STK_RPL_LST_R.$upd_srv_req_no,
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
	public static MST_SHIP_STK_RPL_LST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_SHIP_STK_RPL_LST_R create(String alias) {
		MST_SHIP_STK_RPL_LST_R row = new MST_SHIP_STK_RPL_LST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_SHIP_STK_RPL_LST_R createByName(T proto) {
		MST_SHIP_STK_RPL_LST_R row = MST_SHIP_STK_RPL_LST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SHIP_STK_RPL_LST_R clone() {
		return (MST_SHIP_STK_RPL_LST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SHIP_STK_RPL_LST_R createInstance() {
		return (MST_SHIP_STK_RPL_LST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SHIP_STK_RPL_LST_R getValues(String... names) {
		return (MST_SHIP_STK_RPL_LST_R) super.getValues(names);
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
	 public MSW_SHIP_STK_RPL_LST_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_SHIP_STK_RPL_LST_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_SHIP_STK_RPL_LST_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_SHIP_STK_RPL_LST_KEY_R.TABLE_NAME);
	 }

	/**
	 * バッチデータＮＯ. Batch data No..<p>
	 *
	 */
	public String batch_data_no() {
		return getConstString(offset + 0, $batch_data_no);
	}

	/**
	 * バッチデータＮＯ. Batch data No..<p>
	 *
	 */
	public void batch_data_no(String value) {
		setConstString(offset + 0, $batch_data_no, value);
	}

	/**
	 * 実行日時. Execution date and time.<p>
	 *
	 */
	public MCDate exec_tm() {
		return getConstDate(offset + 1, $exec_tm);
	}

	/**
	 * 実行日時. Execution date and time.<p>
	 *
	 */
	public void exec_tm(MCDate value) {
		setConstDate(offset + 1, $exec_tm, value);
	}

	/**
	 * バッチログＮＯ. Batch log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 2, $batch_log_no);
	}

	/**
	 * バッチログＮＯ. Batch log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 2, $batch_log_no, value);
	}

	/**
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 3, $io_schd_typ);
	}

	/**
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 3, $io_schd_typ, value);
	}

	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 4, $io_schd_sts_typ);
	}

	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 4, $io_schd_sts_typ, value);
	}

	/**
	 * 受払予定伝票ＮＯ. GR/GI schedule slip No..<p>
	 *
	 */
	public String slip_schd_no() {
		return getConstString(offset + 5, $slip_schd_no);
	}

	/**
	 * 受払予定伝票ＮＯ. GR/GI schedule slip No..<p>
	 *
	 */
	public void slip_schd_no(String value) {
		setConstString(offset + 5, $slip_schd_no, value);
	}

	/**
	 * 引当ＦＬＧ. Allocation flg..<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 6, $alloc_flg);
	}

	/**
	 * 引当ＦＬＧ. Allocation flg..<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 6, $alloc_flg, value);
	}

	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public String io_schd_no() {
		return getConstString(offset + 7, $io_schd_no);
	}

	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public void io_schd_no(String value) {
		setConstString(offset + 7, $io_schd_no, value);
	}

	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public MCNumber io_schd_seq() {
		return getConstNumber(offset + 8, $io_schd_seq);
	}

	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public void io_schd_seq(MCNumber value) {
		setConstNumber(offset + 8, $io_schd_seq, value);
	}
	
	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public void io_schd_seq(int value) {
		setConstNumber(offset + 8, $io_schd_seq, value);
	}
	
	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public void io_schd_seq(long value) {
		setConstNumber(offset + 8, $io_schd_seq, value);
	}
	
	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public void io_schd_seq(float value) {
		setConstNumber(offset + 8, $io_schd_seq, value);
	}
	
	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public void io_schd_seq(double value) {
		setConstNumber(offset + 8, $io_schd_seq, value);
	}
	
	/**
	 * 受払予定予備区分１. GR/GI schedule spare type 1.<p>
	 *
	 */
	public String io_schd_sub_typ1() {
		return getConstString(offset + 9, $io_schd_sub_typ1);
	}

	/**
	 * 受払予定予備区分１. GR/GI schedule spare type 1.<p>
	 *
	 */
	public void io_schd_sub_typ1(String value) {
		setConstString(offset + 9, $io_schd_sub_typ1, value);
	}

	/**
	 * 受払予定予備ＮＯ１. GR/GI schedule spare No. 1.<p>
	 *
	 */
	public String io_schd_sub_no1() {
		return getConstString(offset + 10, $io_schd_sub_no1);
	}

	/**
	 * 受払予定予備ＮＯ１. GR/GI schedule spare No. 1.<p>
	 *
	 */
	public void io_schd_sub_no1(String value) {
		setConstString(offset + 10, $io_schd_sub_no1, value);
	}

	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public MCNumber io_schd_sub_seq1() {
		return getConstNumber(offset + 11, $io_schd_sub_seq1);
	}

	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public void io_schd_sub_seq1(MCNumber value) {
		setConstNumber(offset + 11, $io_schd_sub_seq1, value);
	}
	
	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public void io_schd_sub_seq1(int value) {
		setConstNumber(offset + 11, $io_schd_sub_seq1, value);
	}
	
	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public void io_schd_sub_seq1(long value) {
		setConstNumber(offset + 11, $io_schd_sub_seq1, value);
	}
	
	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public void io_schd_sub_seq1(float value) {
		setConstNumber(offset + 11, $io_schd_sub_seq1, value);
	}
	
	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public void io_schd_sub_seq1(double value) {
		setConstNumber(offset + 11, $io_schd_sub_seq1, value);
	}
	
	/**
	 * 受払予定予備区分２. GR/GI schedule spare type 2.<p>
	 *
	 */
	public String io_schd_sub_typ2() {
		return getConstString(offset + 12, $io_schd_sub_typ2);
	}

	/**
	 * 受払予定予備区分２. GR/GI schedule spare type 2.<p>
	 *
	 */
	public void io_schd_sub_typ2(String value) {
		setConstString(offset + 12, $io_schd_sub_typ2, value);
	}

	/**
	 * 受払予定予備ＮＯ２. GR/GI schedule spare No. 2.<p>
	 *
	 */
	public String io_schd_sub_no2() {
		return getConstString(offset + 13, $io_schd_sub_no2);
	}

	/**
	 * 受払予定予備ＮＯ２. GR/GI schedule spare No. 2.<p>
	 *
	 */
	public void io_schd_sub_no2(String value) {
		setConstString(offset + 13, $io_schd_sub_no2, value);
	}

	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public MCNumber io_schd_sub_seq2() {
		return getConstNumber(offset + 14, $io_schd_sub_seq2);
	}

	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public void io_schd_sub_seq2(MCNumber value) {
		setConstNumber(offset + 14, $io_schd_sub_seq2, value);
	}
	
	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public void io_schd_sub_seq2(int value) {
		setConstNumber(offset + 14, $io_schd_sub_seq2, value);
	}
	
	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public void io_schd_sub_seq2(long value) {
		setConstNumber(offset + 14, $io_schd_sub_seq2, value);
	}
	
	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public void io_schd_sub_seq2(float value) {
		setConstNumber(offset + 14, $io_schd_sub_seq2, value);
	}
	
	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public void io_schd_sub_seq2(double value) {
		setConstNumber(offset + 14, $io_schd_sub_seq2, value);
	}
	
	/**
	 * 受払予定予備区分３. GR/GI schedule spare type 3.<p>
	 *
	 */
	public String io_schd_sub_typ3() {
		return getConstString(offset + 15, $io_schd_sub_typ3);
	}

	/**
	 * 受払予定予備区分３. GR/GI schedule spare type 3.<p>
	 *
	 */
	public void io_schd_sub_typ3(String value) {
		setConstString(offset + 15, $io_schd_sub_typ3, value);
	}

	/**
	 * 受払予定予備ＮＯ３. GR/GI schedule spare No. 3.<p>
	 *
	 */
	public String io_schd_sub_no3() {
		return getConstString(offset + 16, $io_schd_sub_no3);
	}

	/**
	 * 受払予定予備ＮＯ３. GR/GI schedule spare No. 3.<p>
	 *
	 */
	public void io_schd_sub_no3(String value) {
		setConstString(offset + 16, $io_schd_sub_no3, value);
	}

	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public MCNumber io_schd_sub_seq3() {
		return getConstNumber(offset + 17, $io_schd_sub_seq3);
	}

	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public void io_schd_sub_seq3(MCNumber value) {
		setConstNumber(offset + 17, $io_schd_sub_seq3, value);
	}
	
	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public void io_schd_sub_seq3(int value) {
		setConstNumber(offset + 17, $io_schd_sub_seq3, value);
	}
	
	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public void io_schd_sub_seq3(long value) {
		setConstNumber(offset + 17, $io_schd_sub_seq3, value);
	}
	
	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public void io_schd_sub_seq3(float value) {
		setConstNumber(offset + 17, $io_schd_sub_seq3, value);
	}
	
	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public void io_schd_sub_seq3(double value) {
		setConstNumber(offset + 17, $io_schd_sub_seq3, value);
	}
	
	/**
	 * 受払予定予備区分４. GR/GI schedule spare type 4.<p>
	 *
	 */
	public String io_schd_sub_typ4() {
		return getConstString(offset + 18, $io_schd_sub_typ4);
	}

	/**
	 * 受払予定予備区分４. GR/GI schedule spare type 4.<p>
	 *
	 */
	public void io_schd_sub_typ4(String value) {
		setConstString(offset + 18, $io_schd_sub_typ4, value);
	}

	/**
	 * 受払予定予備ＮＯ４. GR/GI schedule spare No. 4.<p>
	 *
	 */
	public String io_schd_sub_no4() {
		return getConstString(offset + 19, $io_schd_sub_no4);
	}

	/**
	 * 受払予定予備ＮＯ４. GR/GI schedule spare No. 4.<p>
	 *
	 */
	public void io_schd_sub_no4(String value) {
		setConstString(offset + 19, $io_schd_sub_no4, value);
	}

	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public MCNumber io_schd_sub_seq4() {
		return getConstNumber(offset + 20, $io_schd_sub_seq4);
	}

	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public void io_schd_sub_seq4(MCNumber value) {
		setConstNumber(offset + 20, $io_schd_sub_seq4, value);
	}
	
	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public void io_schd_sub_seq4(int value) {
		setConstNumber(offset + 20, $io_schd_sub_seq4, value);
	}
	
	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public void io_schd_sub_seq4(long value) {
		setConstNumber(offset + 20, $io_schd_sub_seq4, value);
	}
	
	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public void io_schd_sub_seq4(float value) {
		setConstNumber(offset + 20, $io_schd_sub_seq4, value);
	}
	
	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public void io_schd_sub_seq4(double value) {
		setConstNumber(offset + 20, $io_schd_sub_seq4, value);
	}
	
	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 21, $io_schd_pr_no);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 21, $io_schd_pr_no, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 22, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 22, $loc_cd, value);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 23, $str_ln_cd);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 23, $str_ln_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 24, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 24, $wg_cd, value);
	}

	/**
	 * 予定日付. Scheduled date.<p>
	 *
	 */
	public MCDate schd_dt() {
		return getConstDate(offset + 25, $schd_dt);
	}

	/**
	 * 予定日付. Scheduled date.<p>
	 *
	 */
	public void schd_dt(MCDate value) {
		setConstDate(offset + 25, $schd_dt, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 26, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 26, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 27, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 27, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 28, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 28, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 29, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 29, $itm_sub3, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 30, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 30, $ver_no, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 31, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 31, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 32, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 32, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 33, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 33, $sno1, value);
	}

	/**
	 * 手配ＮＯ１無し可ＦＬＧ. Allow without SEIBAN No. 1 flg..<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 34, $sno1_null_flg);
	}

	/**
	 * 手配ＮＯ１無し可ＦＬＧ. Allow without SEIBAN No. 1 flg..<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 34, $sno1_null_flg, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 35, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 35, $sno2, value);
	}

	/**
	 * 手配ＮＯ２無し可ＦＬＧ. Allow without SEIBAN No. 2 flg..<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 36, $sno2_null_flg);
	}

	/**
	 * 手配ＮＯ２無し可ＦＬＧ. Allow without SEIBAN No. 2 flg..<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 36, $sno2_null_flg, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 37, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 37, $sno3, value);
	}

	/**
	 * 手配ＮＯ３無し可ＦＬＧ. Allow without SEIBAN No. 3 flg..<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 38, $sno3_null_flg);
	}

	/**
	 * 手配ＮＯ３無し可ＦＬＧ. Allow without SEIBAN No. 3 flg..<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 38, $sno3_null_flg, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 39, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 39, $sno4, value);
	}

	/**
	 * 手配ＮＯ４無し可ＦＬＧ. Allow without SEIBAN No. 4 flg..<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 40, $sno4_null_flg);
	}

	/**
	 * 手配ＮＯ４無し可ＦＬＧ. Allow without SEIBAN No. 4 flg..<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 40, $sno4_null_flg, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 41, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 41, $gd_cd, value);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 42, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 42, $quality_typ, value);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 43, $stk_id_typ);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 43, $stk_id_typ, value);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 44, $stk_bp_cd);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 44, $stk_bp_cd, value);
	}

	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 45, $stk_arrv_bp_cd);
	}

	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 45, $stk_arrv_bp_cd, value);
	}

	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 46, $pack_unit_cd);
	}

	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 46, $pack_unit_cd, value);
	}

	/**
	 * 荷姿単位不足数. SKU shortage qty..<p>
	 *
	 */
	public MCNumber pack_unit_short_qty() {
		return getConstNumber(offset + 47, $pack_unit_short_qty);
	}

	/**
	 * 荷姿単位不足数. SKU shortage qty..<p>
	 *
	 */
	public void pack_unit_short_qty(MCNumber value) {
		setConstNumber(offset + 47, $pack_unit_short_qty, value);
	}
	
	/**
	 * 荷姿単位不足数. SKU shortage qty..<p>
	 *
	 */
	public void pack_unit_short_qty(int value) {
		setConstNumber(offset + 47, $pack_unit_short_qty, value);
	}
	
	/**
	 * 荷姿単位不足数. SKU shortage qty..<p>
	 *
	 */
	public void pack_unit_short_qty(long value) {
		setConstNumber(offset + 47, $pack_unit_short_qty, value);
	}
	
	/**
	 * 荷姿単位不足数. SKU shortage qty..<p>
	 *
	 */
	public void pack_unit_short_qty(float value) {
		setConstNumber(offset + 47, $pack_unit_short_qty, value);
	}
	
	/**
	 * 荷姿単位不足数. SKU shortage qty..<p>
	 *
	 */
	public void pack_unit_short_qty(double value) {
		setConstNumber(offset + 47, $pack_unit_short_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 48, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 48, $base_unit_cd, value);
	}

	/**
	 * 基準単位不足数. Base unit shortage qty..<p>
	 *
	 */
	public MCNumber base_unit_short_qty() {
		return getConstNumber(offset + 49, $base_unit_short_qty);
	}

	/**
	 * 基準単位不足数. Base unit shortage qty..<p>
	 *
	 */
	public void base_unit_short_qty(MCNumber value) {
		setConstNumber(offset + 49, $base_unit_short_qty, value);
	}
	
	/**
	 * 基準単位不足数. Base unit shortage qty..<p>
	 *
	 */
	public void base_unit_short_qty(int value) {
		setConstNumber(offset + 49, $base_unit_short_qty, value);
	}
	
	/**
	 * 基準単位不足数. Base unit shortage qty..<p>
	 *
	 */
	public void base_unit_short_qty(long value) {
		setConstNumber(offset + 49, $base_unit_short_qty, value);
	}
	
	/**
	 * 基準単位不足数. Base unit shortage qty..<p>
	 *
	 */
	public void base_unit_short_qty(float value) {
		setConstNumber(offset + 49, $base_unit_short_qty, value);
	}
	
	/**
	 * 基準単位不足数. Base unit shortage qty..<p>
	 *
	 */
	public void base_unit_short_qty(double value) {
		setConstNumber(offset + 49, $base_unit_short_qty, value);
	}
	
	/**
	 * 有効期限ＦＲＯＭ. Expiration date FROM.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 50, $vld_dt_fr);
	}

	/**
	 * 有効期限ＦＲＯＭ. Expiration date FROM.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 50, $vld_dt_fr, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 51, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 51, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 52, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 52, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 53, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 53, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 54, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 54, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 55, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 56, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 56, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 57, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 57, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 58, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 58, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 59, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 59, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 60, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 60, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($batch_data_no.equalsIgnoreCase(name)) {
			return batch_data_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			return slip_schd_no();
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
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
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			return io_schd_seq();
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			return io_schd_sub_seq1();
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			return io_schd_sub_seq2();
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			return io_schd_sub_seq3();
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			return io_schd_sub_seq4();
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			return pack_unit_short_qty();
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			return base_unit_short_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($exec_tm.equalsIgnoreCase(name)) {
			return exec_tm();
		}
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($batch_data_no.equalsIgnoreCase(name)) {
			return batch_data_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			return slip_schd_no();
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
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
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			return io_schd_seq();
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			return io_schd_sub_seq1();
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			return io_schd_sub_seq2();
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			return io_schd_sub_seq3();
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			return io_schd_sub_seq4();
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			return pack_unit_short_qty();
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			return base_unit_short_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($exec_tm.equalsIgnoreCase(name)) {
			return exec_tm();
		}
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($batch_data_no.equalsIgnoreCase(name)) {
			batch_data_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			slip_schd_no(value);
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
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
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			pack_unit_short_qty(value);
			return;
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			base_unit_short_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			pack_unit_short_qty(value);
			return;
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			base_unit_short_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			pack_unit_short_qty(value);
			return;
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			base_unit_short_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			pack_unit_short_qty(value);
			return;
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			base_unit_short_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			pack_unit_short_qty(value);
			return;
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			base_unit_short_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($exec_tm.equalsIgnoreCase(name)) {
			exec_tm(value);
			return;
		}
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($batch_data_no.equalsIgnoreCase(name)) {
			batch_data_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			slip_schd_no(value);
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
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
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			pack_unit_short_qty(value);
			return;
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			base_unit_short_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			pack_unit_short_qty(value);
			return;
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			base_unit_short_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			pack_unit_short_qty(value);
			return;
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			base_unit_short_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			pack_unit_short_qty(value);
			return;
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			base_unit_short_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		if ($pack_unit_short_qty.equalsIgnoreCase(name)) {
			pack_unit_short_qty(value);
			return;
		}
		if ($base_unit_short_qty.equalsIgnoreCase(name)) {
			base_unit_short_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($exec_tm.equalsIgnoreCase(name)) {
			exec_tm(value);
			return;
		}
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
