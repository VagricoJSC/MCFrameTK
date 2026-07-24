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
 * "出来高実績受信ＩＦ // Output result import IF"DBコンテナRowクラスです。<p>
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
 *  	<td>ext_data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システムデータＮＯ</td>
 *  	<td>External system data No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_data_lno</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システムデータ行ＮＯ</td>
 *  	<td>External system data row No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_make_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
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
 *  	<td>recv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受信日</td>
 *  	<td>Receiving date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unschd_act_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計画外実績ＦＬＧ</td>
 *  	<td>Unplanned result flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高予定ＮＯ</td>
 *  	<td>Output schedule No.</td>
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
 *  	<td>mfg_inst_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図改訂番号</td>
 *  	<td>Mfg. order rev. number</td>
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
 *  	<td>ＩＦ製造場所</td>
 *  	<td>IF mfg. location</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_mfg_loc_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造場所名</td>
 *  	<td>IF mfg. location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造棚・ラインＣＤ</td>
 *  	<td>Mfg. rack/line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_mfg_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造棚・ラインＣＤ</td>
 *  	<td>IF mfg. rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_mfg_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造棚・ライン名</td>
 *  	<td>IF mfg. rack/line name</td>
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
 *  	<td>mfg_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造品目</td>
 *  	<td>Mfg. item</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造枝番１</td>
 *  	<td>Mfg. branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造枝番２</td>
 *  	<td>Mfg. branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造枝番３</td>
 *  	<td>Mfg. branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_mfg_itm_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造品目</td>
 *  	<td>IF mfg. item</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_mfg_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造枝番１</td>
 *  	<td>IF mfg. branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_mfg_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造枝番２</td>
 *  	<td>IF mfg. branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_mfg_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造枝番３</td>
 *  	<td>IF mfg. branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_mfg_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造品名</td>
 *  	<td>IF mfg. item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_oper_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ工程ＣＤ</td>
 *  	<td>IF operation cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_oper_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ工程名</td>
 *  	<td>IF operation name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_itm_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
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
 *  	<td>if_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ品名</td>
 *  	<td>IF item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位数量</td>
 *  	<td>Transaction unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引単位ＣＤ</td>
 *  	<td>IF transaction unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_trd_unit_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引単位名</td>
 *  	<td>IF transaction unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程パタン</td>
 *  	<td>Operation pattern</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高区分</td>
 *  	<td>Output type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高進捗度</td>
 *  	<td>Output progress</td>
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
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
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
 *  	<td>if_gd_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格付ＣＤ</td>
 *  	<td>IF grading cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_gd_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格付名</td>
 *  	<td>IF grading name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高理由ＣＤ</td>
 *  	<td>Output reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_yield_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ出来高理由ＣＤ</td>
 *  	<td>IF output reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_yield_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ出来高理由名</td>
 *  	<td>IF output reason name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>strg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納場所ＣＤ</td>
 *  	<td>Storage location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_strg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格納場所ＣＤ</td>
 *  	<td>IF storage location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_strg_loc_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格納場所名</td>
 *  	<td>IF storage location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>strg_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納棚・ラインＣＤ</td>
 *  	<td>Storage rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_strg_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格納棚・ラインＣＤ</td>
 *  	<td>IF storage rack/line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_strg_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格納棚・ライン名</td>
 *  	<td>IF storage rack/line name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績日時</td>
 *  	<td>Actual date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>same_lot_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>同一ロットＦＬＧ</td>
 *  	<td>Same lot flg.</td>
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
 *  	<td>yield_act_intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考（出来高）</td>
 *  	<td>Internal remarks (Output)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_act_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>記録書備考（出来高）</td>
 *  	<td>Record sheet remarks (Output)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引備考</td>
 *  	<td>Transaction remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>abort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>打切ＦＬＧ</td>
 *  	<td>Cancel remaining flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目実際収率</td>
 *  	<td>Item actual yield</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_act_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造実績部門ＣＤ</td>
 *  	<td>Mfg. result dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_mfg_act_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造実績部門ＣＤ</td>
 *  	<td>IF mfg. result dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_mfg_act_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造実績部門名</td>
 *  	<td>IF mfg. result dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_act_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造実績責任者ＣＤ</td>
 *  	<td>Mfg. result PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_mfg_act_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造実績責任者ＣＤ</td>
 *  	<td>IF mfg. result management PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_mfg_act_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造実績責任者名</td>
 *  	<td>IF mfg. result management PIC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_act_intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考（製造）</td>
 *  	<td>Internal remarks (Mfg.)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_act_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>記録書備考（製造）</td>
 *  	<td>Record sheet remarks (Mfg.)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>all_oper_act_reg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>全工程実績作成ＦＬＧ</td>
 *  	<td>All operation results creation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_oper_act_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部工程実績ＮＯ</td>
 *  	<td>External operation result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_yield_act_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部出来高実績ＮＯ</td>
 *  	<td>External output result No.</td>
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
 *  	<td>if_co_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ会社名</td>
 *  	<td>IF company name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>req_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サーバリクエストＮＯ</td>
 *  	<td>Server request No.</td>
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
 *  	<td>mfg_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所名</td>
 *  	<td>Mfg. location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造品名</td>
 *  	<td>Mfg. item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程名</td>
 *  	<td>Operation name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造棚・ライン名</td>
 *  	<td>Mfg. rack/line name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>strg_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納場所名</td>
 *  	<td>Storage location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>strg_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納棚・ライン名</td>
 *  	<td>Storage rack/line name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位名</td>
 *  	<td>Transaction unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高理由名</td>
 *  	<td>Output reason name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gd_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付名</td>
 *  	<td>Grading name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_act_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造実績部門名</td>
 *  	<td>Mfg. result dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_act_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造実績責任者名</td>
 *  	<td>Mfg. result PIC name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_YIELD_ACT_RECV_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_YIELD_ACT_RECV_IF";

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
	 * 受信日. Receiving date.<p>
	 *
	 */
	public static final String $recv_dt = "recv_dt";
	private static final MCPermColumnInfo _recv_dt = createColumnInfo("recv_dt");
	public final MCDatePermColumn recv_dt = createDateColumn(_recv_dt);
	
	/**
	 * 計画外実績ＦＬＧ. Unplanned result flg..<p>
	 *
	 */
	public static final String $unschd_act_flg = "unschd_act_flg";
	private static final MCPermColumnInfo _unschd_act_flg = createColumnInfo("unschd_act_flg");
	public final MCBooleanPermColumn unschd_act_flg = createBooleanColumn(_unschd_act_flg);
	
	/**
	 * 出来高予定ＮＯ. Output schedule No..<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	private static final MCPermColumnInfo _yield_schd_no = createColumnInfo("yield_schd_no");
	public final MCStringPermColumn yield_schd_no = createStringColumn(_yield_schd_no);
	
	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	private static final MCPermColumnInfo _oper_inst_no = createColumnInfo("oper_inst_no");
	public final MCStringPermColumn oper_inst_no = createStringColumn(_oper_inst_no);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public static final String $mfg_inst_rev = "mfg_inst_rev";
	private static final MCPermColumnInfo _mfg_inst_rev = createColumnInfo("mfg_inst_rev");
	public final MCNumberPermColumn mfg_inst_rev = createNumberColumn(_mfg_inst_rev);
	
	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	private static final MCPermColumnInfo _mfg_loc_cd = createColumnInfo("mfg_loc_cd");
	public final MCStringPermColumn mfg_loc_cd = createStringColumn(_mfg_loc_cd);
	
	/**
	 * ＩＦ製造場所. IF mfg. location.<p>
	 *
	 */
	public static final String $if_mfg_loc_cd = "if_mfg_loc_cd";
	private static final MCPermColumnInfo _if_mfg_loc_cd = createColumnInfo("if_mfg_loc_cd");
	public final MCStringPermColumn if_mfg_loc_cd = createStringColumn(_if_mfg_loc_cd);
	
	/**
	 * ＩＦ製造場所名. IF mfg. location name.<p>
	 *
	 */
	public static final String $if_mfg_loc_nm = "if_mfg_loc_nm";
	private static final MCPermColumnInfo _if_mfg_loc_nm = createColumnInfo("if_mfg_loc_nm");
	public final MCStringPermColumn if_mfg_loc_nm = createStringColumn(_if_mfg_loc_nm);
	
	/**
	 * 製造棚・ラインＣＤ. Mfg. rack/line cd..<p>
	 *
	 */
	public static final String $mfg_str_ln_cd = "mfg_str_ln_cd";
	private static final MCPermColumnInfo _mfg_str_ln_cd = createColumnInfo("mfg_str_ln_cd");
	public final MCStringPermColumn mfg_str_ln_cd = createStringColumn(_mfg_str_ln_cd);
	
	/**
	 * ＩＦ製造棚・ラインＣＤ. IF mfg. rack/line cd..<p>
	 *
	 */
	public static final String $if_mfg_str_ln_cd = "if_mfg_str_ln_cd";
	private static final MCPermColumnInfo _if_mfg_str_ln_cd = createColumnInfo("if_mfg_str_ln_cd");
	public final MCStringPermColumn if_mfg_str_ln_cd = createStringColumn(_if_mfg_str_ln_cd);
	
	/**
	 * ＩＦ製造棚・ライン名. IF mfg. rack/line name.<p>
	 *
	 */
	public static final String $if_mfg_str_ln_nm = "if_mfg_str_ln_nm";
	private static final MCPermColumnInfo _if_mfg_str_ln_nm = createColumnInfo("if_mfg_str_ln_nm");
	public final MCStringPermColumn if_mfg_str_ln_nm = createStringColumn(_if_mfg_str_ln_nm);
	
	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	private static final MCPermColumnInfo _bom_ptn = createColumnInfo("bom_ptn");
	public final MCStringPermColumn bom_ptn = createStringColumn(_bom_ptn);
	
	/**
	 * 製造品目. Mfg. item.<p>
	 *
	 */
	public static final String $mfg_itm_cd = "mfg_itm_cd";
	private static final MCPermColumnInfo _mfg_itm_cd = createColumnInfo("mfg_itm_cd");
	public final MCStringPermColumn mfg_itm_cd = createStringColumn(_mfg_itm_cd);
	
	/**
	 * 製造枝番１. Mfg. branch No. 1.<p>
	 *
	 */
	public static final String $mfg_itm_sub1 = "mfg_itm_sub1";
	private static final MCPermColumnInfo _mfg_itm_sub1 = createColumnInfo("mfg_itm_sub1");
	public final MCStringPermColumn mfg_itm_sub1 = createStringColumn(_mfg_itm_sub1);
	
	/**
	 * 製造枝番２. Mfg. branch No. 2.<p>
	 *
	 */
	public static final String $mfg_itm_sub2 = "mfg_itm_sub2";
	private static final MCPermColumnInfo _mfg_itm_sub2 = createColumnInfo("mfg_itm_sub2");
	public final MCStringPermColumn mfg_itm_sub2 = createStringColumn(_mfg_itm_sub2);
	
	/**
	 * 製造枝番３. Mfg. branch No. 3.<p>
	 *
	 */
	public static final String $mfg_itm_sub3 = "mfg_itm_sub3";
	private static final MCPermColumnInfo _mfg_itm_sub3 = createColumnInfo("mfg_itm_sub3");
	public final MCStringPermColumn mfg_itm_sub3 = createStringColumn(_mfg_itm_sub3);
	
	/**
	 * ＩＦ製造品目. IF mfg. item.<p>
	 *
	 */
	public static final String $if_mfg_itm_cd = "if_mfg_itm_cd";
	private static final MCPermColumnInfo _if_mfg_itm_cd = createColumnInfo("if_mfg_itm_cd");
	public final MCStringPermColumn if_mfg_itm_cd = createStringColumn(_if_mfg_itm_cd);
	
	/**
	 * ＩＦ製造枝番１. IF mfg. branch No. 1.<p>
	 *
	 */
	public static final String $if_mfg_itm_sub1 = "if_mfg_itm_sub1";
	private static final MCPermColumnInfo _if_mfg_itm_sub1 = createColumnInfo("if_mfg_itm_sub1");
	public final MCStringPermColumn if_mfg_itm_sub1 = createStringColumn(_if_mfg_itm_sub1);
	
	/**
	 * ＩＦ製造枝番２. IF mfg. branch No. 2.<p>
	 *
	 */
	public static final String $if_mfg_itm_sub2 = "if_mfg_itm_sub2";
	private static final MCPermColumnInfo _if_mfg_itm_sub2 = createColumnInfo("if_mfg_itm_sub2");
	public final MCStringPermColumn if_mfg_itm_sub2 = createStringColumn(_if_mfg_itm_sub2);
	
	/**
	 * ＩＦ製造枝番３. IF mfg. branch No. 3.<p>
	 *
	 */
	public static final String $if_mfg_itm_sub3 = "if_mfg_itm_sub3";
	private static final MCPermColumnInfo _if_mfg_itm_sub3 = createColumnInfo("if_mfg_itm_sub3");
	public final MCStringPermColumn if_mfg_itm_sub3 = createStringColumn(_if_mfg_itm_sub3);
	
	/**
	 * ＩＦ製造品名. IF mfg. item name.<p>
	 *
	 */
	public static final String $if_mfg_itm_nm = "if_mfg_itm_nm";
	private static final MCPermColumnInfo _if_mfg_itm_nm = createColumnInfo("if_mfg_itm_nm");
	public final MCStringPermColumn if_mfg_itm_nm = createStringColumn(_if_mfg_itm_nm);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * ＩＦ工程ＣＤ. IF operation cd..<p>
	 *
	 */
	public static final String $if_oper_cd = "if_oper_cd";
	private static final MCPermColumnInfo _if_oper_cd = createColumnInfo("if_oper_cd");
	public final MCStringPermColumn if_oper_cd = createStringColumn(_if_oper_cd);
	
	/**
	 * ＩＦ工程名. IF operation name.<p>
	 *
	 */
	public static final String $if_oper_nm = "if_oper_nm";
	private static final MCPermColumnInfo _if_oper_nm = createColumnInfo("if_oper_nm");
	public final MCStringPermColumn if_oper_nm = createStringColumn(_if_oper_nm);
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	private static final MCPermColumnInfo _oper_seq = createColumnInfo("oper_seq");
	public final MCNumberPermColumn oper_seq = createNumberColumn(_oper_seq);
	
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
	 * ＩＦ品名. IF item name.<p>
	 *
	 */
	public static final String $if_itm_nm = "if_itm_nm";
	private static final MCPermColumnInfo _if_itm_nm = createColumnInfo("if_itm_nm");
	public final MCStringPermColumn if_itm_nm = createStringColumn(_if_itm_nm);
	
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
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public static final String $if_trd_unit_cd = "if_trd_unit_cd";
	private static final MCPermColumnInfo _if_trd_unit_cd = createColumnInfo("if_trd_unit_cd");
	public final MCStringPermColumn if_trd_unit_cd = createStringColumn(_if_trd_unit_cd);
	
	/**
	 * ＩＦ取引単位名. IF transaction unit name.<p>
	 *
	 */
	public static final String $if_trd_unit_nm = "if_trd_unit_nm";
	private static final MCPermColumnInfo _if_trd_unit_nm = createColumnInfo("if_trd_unit_nm");
	public final MCStringPermColumn if_trd_unit_nm = createStringColumn(_if_trd_unit_nm);
	
	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	private static final MCPermColumnInfo _oper_ptn = createColumnInfo("oper_ptn");
	public final MCStringPermColumn oper_ptn = createStringColumn(_oper_ptn);
	
	/**
	 * 出来高区分. Output type.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	private static final MCPermColumnInfo _yield_typ = createColumnInfo("yield_typ");
	public final MCStringPermColumn yield_typ = createStringColumn(_yield_typ);
	
	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public static final String $yield_rate = "yield_rate";
	private static final MCPermColumnInfo _yield_rate = createColumnInfo("yield_rate");
	public final MCNumberPermColumn yield_rate = createNumberColumn(_yield_rate);
	
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
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	private static final MCPermColumnInfo _quality_typ = createColumnInfo("quality_typ");
	public final MCStringPermColumn quality_typ = createStringColumn(_quality_typ);
	
	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	private static final MCPermColumnInfo _gd_cd = createColumnInfo("gd_cd");
	public final MCStringPermColumn gd_cd = createStringColumn(_gd_cd);
	
	/**
	 * ＩＦ格付ＣＤ. IF grading cd..<p>
	 *
	 */
	public static final String $if_gd_cd = "if_gd_cd";
	private static final MCPermColumnInfo _if_gd_cd = createColumnInfo("if_gd_cd");
	public final MCStringPermColumn if_gd_cd = createStringColumn(_if_gd_cd);
	
	/**
	 * ＩＦ格付名. IF grading name.<p>
	 *
	 */
	public static final String $if_gd_nm = "if_gd_nm";
	private static final MCPermColumnInfo _if_gd_nm = createColumnInfo("if_gd_nm");
	public final MCStringPermColumn if_gd_nm = createStringColumn(_if_gd_nm);
	
	/**
	 * 出来高理由ＣＤ. Output reason cd..<p>
	 *
	 */
	public static final String $yield_rsn_cd = "yield_rsn_cd";
	private static final MCPermColumnInfo _yield_rsn_cd = createColumnInfo("yield_rsn_cd");
	public final MCStringPermColumn yield_rsn_cd = createStringColumn(_yield_rsn_cd);
	
	/**
	 * ＩＦ出来高理由ＣＤ. IF output reason cd..<p>
	 *
	 */
	public static final String $if_yield_rsn_cd = "if_yield_rsn_cd";
	private static final MCPermColumnInfo _if_yield_rsn_cd = createColumnInfo("if_yield_rsn_cd");
	public final MCStringPermColumn if_yield_rsn_cd = createStringColumn(_if_yield_rsn_cd);
	
	/**
	 * ＩＦ出来高理由名. IF output reason name.<p>
	 *
	 */
	public static final String $if_yield_rsn_nm = "if_yield_rsn_nm";
	private static final MCPermColumnInfo _if_yield_rsn_nm = createColumnInfo("if_yield_rsn_nm");
	public final MCStringPermColumn if_yield_rsn_nm = createStringColumn(_if_yield_rsn_nm);
	
	/**
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	private static final MCPermColumnInfo _strg_loc_cd = createColumnInfo("strg_loc_cd");
	public final MCStringPermColumn strg_loc_cd = createStringColumn(_strg_loc_cd);
	
	/**
	 * ＩＦ格納場所ＣＤ. IF storage location cd..<p>
	 *
	 */
	public static final String $if_strg_loc_cd = "if_strg_loc_cd";
	private static final MCPermColumnInfo _if_strg_loc_cd = createColumnInfo("if_strg_loc_cd");
	public final MCStringPermColumn if_strg_loc_cd = createStringColumn(_if_strg_loc_cd);
	
	/**
	 * ＩＦ格納場所名. IF storage location name.<p>
	 *
	 */
	public static final String $if_strg_loc_nm = "if_strg_loc_nm";
	private static final MCPermColumnInfo _if_strg_loc_nm = createColumnInfo("if_strg_loc_nm");
	public final MCStringPermColumn if_strg_loc_nm = createStringColumn(_if_strg_loc_nm);
	
	/**
	 * 格納棚・ラインＣＤ. Storage rack/line cd..<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
	private static final MCPermColumnInfo _strg_str_ln_cd = createColumnInfo("strg_str_ln_cd");
	public final MCStringPermColumn strg_str_ln_cd = createStringColumn(_strg_str_ln_cd);
	
	/**
	 * ＩＦ格納棚・ラインＣＤ. IF storage rack/line cd..<p>
	 *
	 */
	public static final String $if_strg_str_ln_cd = "if_strg_str_ln_cd";
	private static final MCPermColumnInfo _if_strg_str_ln_cd = createColumnInfo("if_strg_str_ln_cd");
	public final MCStringPermColumn if_strg_str_ln_cd = createStringColumn(_if_strg_str_ln_cd);
	
	/**
	 * ＩＦ格納棚・ライン名. IF storage rack/line name.<p>
	 *
	 */
	public static final String $if_strg_str_ln_nm = "if_strg_str_ln_nm";
	private static final MCPermColumnInfo _if_strg_str_ln_nm = createColumnInfo("if_strg_str_ln_nm");
	public final MCStringPermColumn if_strg_str_ln_nm = createStringColumn(_if_strg_str_ln_nm);
	
	/**
	 * 実績日時. Actual date and time.<p>
	 *
	 */
	public static final String $act_tm = "act_tm";
	private static final MCPermColumnInfo _act_tm = createColumnInfo("act_tm");
	public final MCDatePermColumn act_tm = createDateColumn(_act_tm);
	
	/**
	 * 同一ロットＦＬＧ. Same lot flg..<p>
	 *
	 */
	public static final String $same_lot_flg = "same_lot_flg";
	private static final MCPermColumnInfo _same_lot_flg = createColumnInfo("same_lot_flg");
	public final MCBooleanPermColumn same_lot_flg = createBooleanColumn(_same_lot_flg);
	
	/**
	 * 検査連絡備考. Inspection contact remarks.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	private static final MCPermColumnInfo _insp_cnt_rmrks = createColumnInfo("insp_cnt_rmrks");
	public final MCStringPermColumn insp_cnt_rmrks = createStringColumn(_insp_cnt_rmrks);
	
	/**
	 * 内部備考（出来高）. Internal remarks (Output).<p>
	 *
	 */
	public static final String $yield_act_intr_rmrks = "yield_act_intr_rmrks";
	private static final MCPermColumnInfo _yield_act_intr_rmrks = createColumnInfo("yield_act_intr_rmrks");
	public final MCStringPermColumn yield_act_intr_rmrks = createStringColumn(_yield_act_intr_rmrks);
	
	/**
	 * 記録書備考（出来高）. Record sheet remarks (Output).<p>
	 *
	 */
	public static final String $yield_act_rpt_rmrks = "yield_act_rpt_rmrks";
	private static final MCPermColumnInfo _yield_act_rpt_rmrks = createColumnInfo("yield_act_rpt_rmrks");
	public final MCStringPermColumn yield_act_rpt_rmrks = createStringColumn(_yield_act_rpt_rmrks);
	
	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	private static final MCPermColumnInfo _trd_rmrks = createColumnInfo("trd_rmrks");
	public final MCStringPermColumn trd_rmrks = createStringColumn(_trd_rmrks);
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	private static final MCPermColumnInfo _abort_flg = createColumnInfo("abort_flg");
	public final MCBooleanPermColumn abort_flg = createBooleanColumn(_abort_flg);
	
	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public static final String $itm_yield = "itm_yield";
	private static final MCPermColumnInfo _itm_yield = createColumnInfo("itm_yield");
	public final MCNumberPermColumn itm_yield = createNumberColumn(_itm_yield);
	
	/**
	 * 製造実績部門ＣＤ. Mfg. result dept. cd..<p>
	 *
	 */
	public static final String $mfg_act_dpt_cd = "mfg_act_dpt_cd";
	private static final MCPermColumnInfo _mfg_act_dpt_cd = createColumnInfo("mfg_act_dpt_cd");
	public final MCStringPermColumn mfg_act_dpt_cd = createStringColumn(_mfg_act_dpt_cd);
	
	/**
	 * ＩＦ製造実績部門ＣＤ. IF mfg. result dept. cd..<p>
	 *
	 */
	public static final String $if_mfg_act_dpt_cd = "if_mfg_act_dpt_cd";
	private static final MCPermColumnInfo _if_mfg_act_dpt_cd = createColumnInfo("if_mfg_act_dpt_cd");
	public final MCStringPermColumn if_mfg_act_dpt_cd = createStringColumn(_if_mfg_act_dpt_cd);
	
	/**
	 * ＩＦ製造実績部門名. IF mfg. result dept. name.<p>
	 *
	 */
	public static final String $if_mfg_act_dpt_nm = "if_mfg_act_dpt_nm";
	private static final MCPermColumnInfo _if_mfg_act_dpt_nm = createColumnInfo("if_mfg_act_dpt_nm");
	public final MCStringPermColumn if_mfg_act_dpt_nm = createStringColumn(_if_mfg_act_dpt_nm);
	
	/**
	 * 製造実績責任者ＣＤ. Mfg. result PIC cd..<p>
	 *
	 */
	public static final String $mfg_act_usr_cd = "mfg_act_usr_cd";
	private static final MCPermColumnInfo _mfg_act_usr_cd = createColumnInfo("mfg_act_usr_cd");
	public final MCStringPermColumn mfg_act_usr_cd = createStringColumn(_mfg_act_usr_cd);
	
	/**
	 * ＩＦ製造実績責任者ＣＤ. IF mfg. result management PIC cd..<p>
	 *
	 */
	public static final String $if_mfg_act_usr_cd = "if_mfg_act_usr_cd";
	private static final MCPermColumnInfo _if_mfg_act_usr_cd = createColumnInfo("if_mfg_act_usr_cd");
	public final MCStringPermColumn if_mfg_act_usr_cd = createStringColumn(_if_mfg_act_usr_cd);
	
	/**
	 * ＩＦ製造実績責任者名. IF mfg. result management PIC name.<p>
	 *
	 */
	public static final String $if_mfg_act_usr_nm = "if_mfg_act_usr_nm";
	private static final MCPermColumnInfo _if_mfg_act_usr_nm = createColumnInfo("if_mfg_act_usr_nm");
	public final MCStringPermColumn if_mfg_act_usr_nm = createStringColumn(_if_mfg_act_usr_nm);
	
	/**
	 * 内部備考（製造）. Internal remarks (Mfg.).<p>
	 *
	 */
	public static final String $mfg_act_intr_rmrks = "mfg_act_intr_rmrks";
	private static final MCPermColumnInfo _mfg_act_intr_rmrks = createColumnInfo("mfg_act_intr_rmrks");
	public final MCStringPermColumn mfg_act_intr_rmrks = createStringColumn(_mfg_act_intr_rmrks);
	
	/**
	 * 記録書備考（製造）. Record sheet remarks (Mfg.).<p>
	 *
	 */
	public static final String $mfg_act_rpt_rmrks = "mfg_act_rpt_rmrks";
	private static final MCPermColumnInfo _mfg_act_rpt_rmrks = createColumnInfo("mfg_act_rpt_rmrks");
	public final MCStringPermColumn mfg_act_rpt_rmrks = createStringColumn(_mfg_act_rpt_rmrks);
	
	/**
	 * 全工程実績作成ＦＬＧ. All operation results creation flg..<p>
	 *
	 */
	public static final String $all_oper_act_reg_flg = "all_oper_act_reg_flg";
	private static final MCPermColumnInfo _all_oper_act_reg_flg = createColumnInfo("all_oper_act_reg_flg");
	public final MCBooleanPermColumn all_oper_act_reg_flg = createBooleanColumn(_all_oper_act_reg_flg);
	
	/**
	 * 外部工程実績ＮＯ. External operation result No..<p>
	 *
	 */
	public static final String $ext_oper_act_no = "ext_oper_act_no";
	private static final MCPermColumnInfo _ext_oper_act_no = createColumnInfo("ext_oper_act_no");
	public final MCStringPermColumn ext_oper_act_no = createStringColumn(_ext_oper_act_no);
	
	/**
	 * 外部出来高実績ＮＯ. External output result No..<p>
	 *
	 */
	public static final String $ext_yield_act_no = "ext_yield_act_no";
	private static final MCPermColumnInfo _ext_yield_act_no = createColumnInfo("ext_yield_act_no");
	public final MCStringPermColumn ext_yield_act_no = createStringColumn(_ext_yield_act_no);
	
	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public static final String $if_co_cd = "if_co_cd";
	private static final MCPermColumnInfo _if_co_cd = createColumnInfo("if_co_cd");
	public final MCStringPermColumn if_co_cd = createStringColumn(_if_co_cd);
	
	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public static final String $if_co_nm = "if_co_nm";
	private static final MCPermColumnInfo _if_co_nm = createColumnInfo("if_co_nm");
	public final MCStringPermColumn if_co_nm = createStringColumn(_if_co_nm);
	
	/**
	 * サーバリクエストＮＯ. Server request No..<p>
	 *
	 */
	public static final String $req_no = "req_no";
	private static final MCPermColumnInfo _req_no = createColumnInfo("req_no");
	public final MCStringPermColumn req_no = createStringColumn(_req_no);
	
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
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	
	/**
	 * 製造品名. Mfg. item name.<p>
	 *
	 */
	public static final String $mfg_itm_nm = "mfg_itm_nm";
	
	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	/**
	 * 製造棚・ライン名. Mfg. rack/line name.<p>
	 *
	 */
	public static final String $mfg_str_ln_nm = "mfg_str_ln_nm";
	
	/**
	 * 格納場所名. Storage location name.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	
	/**
	 * 格納棚・ライン名. Storage rack/line name.<p>
	 *
	 */
	public static final String $strg_str_ln_nm = "strg_str_ln_nm";
	
	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	
	/**
	 * 出来高理由名. Output reason name.<p>
	 *
	 */
	public static final String $yield_rsn_nm = "yield_rsn_nm";
	
	/**
	 * 格付名. Grading name.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	
	/**
	 * 製造実績部門名. Mfg. result dept. name.<p>
	 *
	 */
	public static final String $mfg_act_dpt_nm = "mfg_act_dpt_nm";
	
	/**
	 * 製造実績責任者名. Mfg. result PIC name.<p>
	 *
	 */
	public static final String $mfg_act_usr_nm = "mfg_act_usr_nm";
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_data_no_META = createCommonMeta($ext_data_no, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_NO);
	public static final MCMeta ext_data_lno_META = createCommonMeta($ext_data_lno, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_LNO);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta imp_flg_META = createCommonMeta($imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta recv_dt_META = createCommonMeta($recv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unschd_act_flg_META = createCommonMeta($unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_mfg_loc_cd_META = createCommonMeta($if_mfg_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_mfg_loc_nm_META = createCommonMeta($if_mfg_loc_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta if_mfg_str_ln_cd_META = createCommonMeta($if_mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_mfg_str_ln_nm_META = createCommonMeta($if_mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta mfg_itm_cd_META = createCommonMeta($mfg_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta mfg_itm_sub1_META = createCommonMeta($mfg_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta mfg_itm_sub2_META = createCommonMeta($mfg_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta mfg_itm_sub3_META = createCommonMeta($mfg_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_mfg_itm_cd_META = createCommonMeta($if_mfg_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_mfg_itm_sub1_META = createCommonMeta($if_mfg_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta if_mfg_itm_sub2_META = createCommonMeta($if_mfg_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta if_mfg_itm_sub3_META = createCommonMeta($if_mfg_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_mfg_itm_nm_META = createCommonMeta($if_mfg_itm_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta if_oper_cd_META = createCommonMeta($if_oper_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_oper_nm_META = createCommonMeta($if_oper_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_itm_cd_META = createCommonMeta($if_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_itm_sub1_META = createCommonMeta($if_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta if_itm_sub2_META = createCommonMeta($if_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta if_itm_sub3_META = createCommonMeta($if_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_itm_nm_META = createCommonMeta($if_itm_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_trd_unit_cd_META = createCommonMeta($if_trd_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_trd_unit_nm_META = createCommonMeta($if_trd_unit_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta yield_rate_META = createCommonMeta($yield_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta if_gd_cd_META = createCommonMeta($if_gd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_gd_nm_META = createCommonMeta($if_gd_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta yield_rsn_cd_META = createCommonMeta($yield_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta if_yield_rsn_cd_META = createCommonMeta($if_yield_rsn_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_yield_rsn_nm_META = createCommonMeta($if_yield_rsn_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_strg_loc_cd_META = createCommonMeta($if_strg_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_strg_loc_nm_META = createCommonMeta($if_strg_loc_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta if_strg_str_ln_cd_META = createCommonMeta($if_strg_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_strg_str_ln_nm_META = createCommonMeta($if_strg_str_ln_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta act_tm_META = createCommonMeta($act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta same_lot_flg_META = createCommonMeta($same_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta yield_act_intr_rmrks_META = createCommonMeta($yield_act_intr_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_INTR_RMRKS);
	public static final MCMeta yield_act_rpt_rmrks_META = createCommonMeta($yield_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_RPT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_yield_META = createCommonMeta($itm_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta mfg_act_dpt_cd_META = createCommonMeta($mfg_act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_mfg_act_dpt_cd_META = createCommonMeta($if_mfg_act_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_mfg_act_dpt_nm_META = createCommonMeta($if_mfg_act_dpt_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta mfg_act_usr_cd_META = createCommonMeta($mfg_act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_mfg_act_usr_cd_META = createCommonMeta($if_mfg_act_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_mfg_act_usr_nm_META = createCommonMeta($if_mfg_act_usr_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta mfg_act_intr_rmrks_META = createCommonMeta($mfg_act_intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_INTR_RMRKS);
	public static final MCMeta mfg_act_rpt_rmrks_META = createCommonMeta($mfg_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_RPT_RMRKS);
	public static final MCMeta all_oper_act_reg_flg_META = createCommonMeta($all_oper_act_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_oper_act_no_META = createCommonMeta($ext_oper_act_no, mcframe.commonMA.meta.MA_META.EXT_OPER_ACT_NO);
	public static final MCMeta ext_yield_act_no_META = createCommonMeta($ext_yield_act_no, mcframe.commonMA.meta.MA_META.EXT_YIELD_ACT_NO);
	public static final MCMeta if_co_cd_META = createCommonMeta($if_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_co_nm_META = createCommonMeta($if_co_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta req_no_META = createCommonMeta($req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
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
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_itm_nm_META = createCommonMeta($mfg_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta mfg_str_ln_nm_META = createCommonMeta($mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta yield_rsn_nm_META = createCommonMeta($yield_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta mfg_act_dpt_nm_META = createCommonMeta($mfg_act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta mfg_act_usr_nm_META = createCommonMeta($mfg_act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);

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
					MST_YIELD_ACT_RECV_IF_R own = MST_YIELD_ACT_RECV_IF_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_YIELD_ACT_RECV_IF_R> constMetas = new ConstMetaList<MST_YIELD_ACT_RECV_IF_R>(
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
			recv_dt_META,
			unschd_act_flg_META,
			yield_schd_no_META,
			oper_inst_no_META,
			mfg_inst_no_META,
			mfg_inst_rev_META,
			mfg_loc_cd_META,
			if_mfg_loc_cd_META,
			if_mfg_loc_nm_META,
			mfg_str_ln_cd_META,
			if_mfg_str_ln_cd_META,
			if_mfg_str_ln_nm_META,
			bom_ptn_META,
			mfg_itm_cd_META,
			mfg_itm_sub1_META,
			mfg_itm_sub2_META,
			mfg_itm_sub3_META,
			if_mfg_itm_cd_META,
			if_mfg_itm_sub1_META,
			if_mfg_itm_sub2_META,
			if_mfg_itm_sub3_META,
			if_mfg_itm_nm_META,
			oper_cd_META,
			if_oper_cd_META,
			if_oper_nm_META,
			oper_seq_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			if_itm_cd_META,
			if_itm_sub1_META,
			if_itm_sub2_META,
			if_itm_sub3_META,
			if_itm_nm_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			if_trd_unit_cd_META,
			if_trd_unit_nm_META,
			oper_ptn_META,
			yield_typ_META,
			yield_rate_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			quality_typ_META,
			gd_cd_META,
			if_gd_cd_META,
			if_gd_nm_META,
			yield_rsn_cd_META,
			if_yield_rsn_cd_META,
			if_yield_rsn_nm_META,
			strg_loc_cd_META,
			if_strg_loc_cd_META,
			if_strg_loc_nm_META,
			strg_str_ln_cd_META,
			if_strg_str_ln_cd_META,
			if_strg_str_ln_nm_META,
			act_tm_META,
			same_lot_flg_META,
			insp_cnt_rmrks_META,
			yield_act_intr_rmrks_META,
			yield_act_rpt_rmrks_META,
			trd_rmrks_META,
			abort_flg_META,
			itm_yield_META,
			mfg_act_dpt_cd_META,
			if_mfg_act_dpt_cd_META,
			if_mfg_act_dpt_nm_META,
			mfg_act_usr_cd_META,
			if_mfg_act_usr_cd_META,
			if_mfg_act_usr_nm_META,
			mfg_act_intr_rmrks_META,
			mfg_act_rpt_rmrks_META,
			all_oper_act_reg_flg_META,
			ext_oper_act_no_META,
			ext_yield_act_no_META,
			if_co_cd_META,
			if_co_nm_META,
			req_no_META,
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
			mfg_loc_nm_META,
			mfg_itm_nm_META,
			oper_nm_META,
			itm_nm_META,
			mfg_str_ln_nm_META,
			strg_loc_nm_META,
			strg_str_ln_nm_META,
			trd_unit_nm_META,
			yield_rsn_nm_META,
			gd_nm_META,
			mfg_act_dpt_nm_META,
			mfg_act_usr_nm_META
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
	protected MST_YIELD_ACT_RECV_IF_R(ConstMetaList<? extends MST_YIELD_ACT_RECV_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_YIELD_ACT_RECV_IF_R(ConstMetaList<? extends MST_YIELD_ACT_RECV_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$data_lno,
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
			MST_YIELD_ACT_RECV_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$data_no,
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
			MST_YIELD_ACT_RECV_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$exe_sts_typ,
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
			MST_YIELD_ACT_RECV_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$data_crud_typ,
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
			MST_YIELD_ACT_RECV_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$ext_sys_cd,
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
			MST_YIELD_ACT_RECV_IF_R.$ext_data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$ext_data_no,
				"ext_data_no",
				ext_data_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$ext_data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$ext_data_lno,
				"ext_data_lno",
				ext_data_lno,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$data_make_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_YIELD_ACT_RECV_IF_R.$data_make_dt,
				"data_make_dt",
				data_make_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_YIELD_ACT_RECV_IF_R.$imp_flg,
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
			MST_YIELD_ACT_RECV_IF_R.$recv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_YIELD_ACT_RECV_IF_R.$recv_dt,
				"recv_dt",
				recv_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$unschd_act_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_YIELD_ACT_RECV_IF_R.$unschd_act_flg,
				"unschd_act_flg",
				unschd_act_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$yield_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$yield_schd_no,
				"yield_schd_no",
				yield_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$oper_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$oper_inst_no,
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
			MST_YIELD_ACT_RECV_IF_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_inst_no,
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
			MST_YIELD_ACT_RECV_IF_R.$mfg_inst_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$mfg_inst_rev,
				"mfg_inst_rev",
				mfg_inst_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_loc_cd,
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
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_loc_cd,
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
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_loc_nm,
				"if_mfg_loc_nm",
				if_mfg_loc_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$mfg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_str_ln_cd,
				"mfg_str_ln_cd",
				mfg_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_str_ln_cd,
				"if_mfg_str_ln_cd",
				if_mfg_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_str_ln_nm,
				"if_mfg_str_ln_nm",
				if_mfg_str_ln_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$bom_ptn,
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
			MST_YIELD_ACT_RECV_IF_R.$mfg_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_itm_cd,
				"mfg_itm_cd",
				mfg_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$mfg_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_itm_sub1,
				"mfg_itm_sub1",
				mfg_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$mfg_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_itm_sub2,
				"mfg_itm_sub2",
				mfg_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$mfg_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_itm_sub3,
				"mfg_itm_sub3",
				mfg_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_itm_cd,
				"if_mfg_itm_cd",
				if_mfg_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_itm_sub1,
				"if_mfg_itm_sub1",
				if_mfg_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_itm_sub2,
				"if_mfg_itm_sub2",
				if_mfg_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_itm_sub3,
				"if_mfg_itm_sub3",
				if_mfg_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_itm_nm,
				"if_mfg_itm_nm",
				if_mfg_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$oper_cd,
				"oper_cd",
				oper_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_oper_cd,
				"if_oper_cd",
				if_oper_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_oper_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_oper_nm,
				"if_oper_nm",
				if_oper_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$oper_seq,
				"oper_seq",
				oper_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$itm_sub1,
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
			MST_YIELD_ACT_RECV_IF_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$itm_sub2,
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
			MST_YIELD_ACT_RECV_IF_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$itm_sub3,
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
			MST_YIELD_ACT_RECV_IF_R.$if_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_itm_cd,
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
			MST_YIELD_ACT_RECV_IF_R.$if_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_itm_sub1,
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
			MST_YIELD_ACT_RECV_IF_R.$if_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_itm_sub2,
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
			MST_YIELD_ACT_RECV_IF_R.$if_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_itm_sub3,
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
			MST_YIELD_ACT_RECV_IF_R.$if_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_itm_nm,
				"if_itm_nm",
				if_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$trd_unit_qty,
				"trd_unit_qty",
				trd_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$trd_unit_cd,
				"trd_unit_cd",
				trd_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_trd_unit_cd,
				"if_trd_unit_cd",
				if_trd_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_trd_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_trd_unit_nm,
				"if_trd_unit_nm",
				if_trd_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$oper_ptn,
				"oper_ptn",
				oper_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$yield_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$yield_typ,
				"yield_typ",
				yield_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$yield_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$yield_rate,
				"yield_rate",
				yield_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$lot_no,
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
			MST_YIELD_ACT_RECV_IF_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sublot_no,
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
			MST_YIELD_ACT_RECV_IF_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sno1,
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
			MST_YIELD_ACT_RECV_IF_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sno2,
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
			MST_YIELD_ACT_RECV_IF_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sno3,
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
			MST_YIELD_ACT_RECV_IF_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sno4,
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
			MST_YIELD_ACT_RECV_IF_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$quality_typ,
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
			MST_YIELD_ACT_RECV_IF_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$gd_cd,
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
			MST_YIELD_ACT_RECV_IF_R.$if_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_gd_cd,
				"if_gd_cd",
				if_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_gd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_gd_nm,
				"if_gd_nm",
				if_gd_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$yield_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$yield_rsn_cd,
				"yield_rsn_cd",
				yield_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_yield_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_yield_rsn_cd,
				"if_yield_rsn_cd",
				if_yield_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_yield_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_yield_rsn_nm,
				"if_yield_rsn_nm",
				if_yield_rsn_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$strg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$strg_loc_cd,
				"strg_loc_cd",
				strg_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_strg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_strg_loc_cd,
				"if_strg_loc_cd",
				if_strg_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_strg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_strg_loc_nm,
				"if_strg_loc_nm",
				if_strg_loc_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$strg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$strg_str_ln_cd,
				"strg_str_ln_cd",
				strg_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_strg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_strg_str_ln_cd,
				"if_strg_str_ln_cd",
				if_strg_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_strg_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_strg_str_ln_nm,
				"if_strg_str_ln_nm",
				if_strg_str_ln_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_YIELD_ACT_RECV_IF_R.$act_tm,
				"act_tm",
				act_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$same_lot_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_YIELD_ACT_RECV_IF_R.$same_lot_flg,
				"same_lot_flg",
				same_lot_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$insp_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$insp_cnt_rmrks,
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
			MST_YIELD_ACT_RECV_IF_R.$yield_act_intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$yield_act_intr_rmrks,
				"yield_act_intr_rmrks",
				yield_act_intr_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$yield_act_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$yield_act_rpt_rmrks,
				"yield_act_rpt_rmrks",
				yield_act_rpt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$trd_rmrks,
				"trd_rmrks",
				trd_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_YIELD_ACT_RECV_IF_R.$abort_flg,
				"abort_flg",
				abort_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$itm_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$itm_yield,
				"itm_yield",
				itm_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$mfg_act_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_act_dpt_cd,
				"mfg_act_dpt_cd",
				mfg_act_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_act_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_act_dpt_cd,
				"if_mfg_act_dpt_cd",
				if_mfg_act_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_act_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_act_dpt_nm,
				"if_mfg_act_dpt_nm",
				if_mfg_act_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$mfg_act_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_act_usr_cd,
				"mfg_act_usr_cd",
				mfg_act_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_act_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_act_usr_cd,
				"if_mfg_act_usr_cd",
				if_mfg_act_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_mfg_act_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_mfg_act_usr_nm,
				"if_mfg_act_usr_nm",
				if_mfg_act_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$mfg_act_intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_act_intr_rmrks,
				"mfg_act_intr_rmrks",
				mfg_act_intr_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$mfg_act_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_act_rpt_rmrks,
				"mfg_act_rpt_rmrks",
				mfg_act_rpt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$all_oper_act_reg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_YIELD_ACT_RECV_IF_R.$all_oper_act_reg_flg,
				"all_oper_act_reg_flg",
				all_oper_act_reg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$ext_oper_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$ext_oper_act_no,
				"ext_oper_act_no",
				ext_oper_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$ext_yield_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$ext_yield_act_no,
				"ext_yield_act_no",
				ext_yield_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$if_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_co_cd,
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
			MST_YIELD_ACT_RECV_IF_R.$if_co_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$if_co_nm,
				"if_co_nm",
				if_co_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$req_no,
				"req_no",
				req_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_YIELD_ACT_RECV_IF_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char1,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char2,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char3,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char4,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char5,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char6,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char7,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char8,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char9,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char10,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char11,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char12,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char13,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char14,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char15,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char16,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char17,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char18,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char19,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char20,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char21,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char22,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char23,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char24,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char25,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char26,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char27,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char28,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char29,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sub_char30,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$sub_num1,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$sub_num2,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$sub_num3,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$sub_num4,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$sub_num5,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_YIELD_ACT_RECV_IF_R.$sub_dt1,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_YIELD_ACT_RECV_IF_R.$sub_dt2,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_YIELD_ACT_RECV_IF_R.$sub_dt3,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_YIELD_ACT_RECV_IF_R.$sub_dt4,
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
			MST_YIELD_ACT_RECV_IF_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_YIELD_ACT_RECV_IF_R.$sub_dt5,
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
			MST_YIELD_ACT_RECV_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$batch_log_no,
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
			MST_YIELD_ACT_RECV_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$log_sub_key1,
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
			MST_YIELD_ACT_RECV_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$log_sub_key2,
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
			MST_YIELD_ACT_RECV_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$ins_usr_id,
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
			MST_YIELD_ACT_RECV_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$ins_usr_nm,
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
			MST_YIELD_ACT_RECV_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_YIELD_ACT_RECV_IF_R.$ins_ts,
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
			MST_YIELD_ACT_RECV_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$ins_func_id,
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
			MST_YIELD_ACT_RECV_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_YIELD_ACT_RECV_IF_R.$upd_cntr,
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
			MST_YIELD_ACT_RECV_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$upd_usr_id,
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
			MST_YIELD_ACT_RECV_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$upd_usr_nm,
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
			MST_YIELD_ACT_RECV_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_YIELD_ACT_RECV_IF_R.$upd_ts,
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
			MST_YIELD_ACT_RECV_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$upd_func_id,
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
			MST_YIELD_ACT_RECV_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$upd_srv_req_no,
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
			MST_YIELD_ACT_RECV_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$sdrv_sts_typ,
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
			MST_YIELD_ACT_RECV_IF_R.$mfg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_loc_nm,
				"mfg_loc_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$mfg_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_itm_nm,
				"mfg_itm_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$oper_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$oper_nm,
				"oper_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$itm_nm,
				"itm_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$mfg_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_str_ln_nm,
				"mfg_str_ln_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$strg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$strg_loc_nm,
				"strg_loc_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$strg_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$strg_str_ln_nm,
				"strg_str_ln_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$trd_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$trd_unit_nm,
				"trd_unit_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$yield_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$yield_rsn_nm,
				"yield_rsn_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$gd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$gd_nm,
				"gd_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$mfg_act_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_act_dpt_nm,
				"mfg_act_dpt_nm",
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
			MST_YIELD_ACT_RECV_IF_R.$mfg_act_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_YIELD_ACT_RECV_IF_R.$mfg_act_usr_nm,
				"mfg_act_usr_nm",
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
	public static MST_YIELD_ACT_RECV_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_YIELD_ACT_RECV_IF_R create(String alias) {
		MST_YIELD_ACT_RECV_IF_R row = new MST_YIELD_ACT_RECV_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_YIELD_ACT_RECV_IF_R createByName(T proto) {
		MST_YIELD_ACT_RECV_IF_R row = MST_YIELD_ACT_RECV_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_YIELD_ACT_RECV_IF_R clone() {
		return (MST_YIELD_ACT_RECV_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_YIELD_ACT_RECV_IF_R createInstance() {
		return (MST_YIELD_ACT_RECV_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_YIELD_ACT_RECV_IF_R getValues(String... names) {
		return (MST_YIELD_ACT_RECV_IF_R) super.getValues(names);
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
	 public MSW_YIELD_ACT_RECV_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_YIELD_ACT_RECV_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_YIELD_ACT_RECV_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_YIELD_ACT_RECV_IF_KEY_R.TABLE_NAME);
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
	 * 受信日. Receiving date.<p>
	 *
	 */
	public MCDate recv_dt() {
		return getConstDate(offset + 9, $recv_dt);
	}

	/**
	 * 受信日. Receiving date.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		setConstDate(offset + 9, $recv_dt, value);
	}

	/**
	 * 計画外実績ＦＬＧ. Unplanned result flg..<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return getConstBoolean(offset + 10, $unschd_act_flg);
	}

	/**
	 * 計画外実績ＦＬＧ. Unplanned result flg..<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		setConstBoolean(offset + 10, $unschd_act_flg, value);
	}

	/**
	 * 出来高予定ＮＯ. Output schedule No..<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 11, $yield_schd_no);
	}

	/**
	 * 出来高予定ＮＯ. Output schedule No..<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 11, $yield_schd_no, value);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 12, $oper_inst_no);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 12, $oper_inst_no, value);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 13, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 13, $mfg_inst_no, value);
	}

	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 14, $mfg_inst_rev);
	}

	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 14, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 14, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 14, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 14, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 14, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 15, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 15, $mfg_loc_cd, value);
	}

	/**
	 * ＩＦ製造場所. IF mfg. location.<p>
	 *
	 */
	public String if_mfg_loc_cd() {
		return getConstString(offset + 16, $if_mfg_loc_cd);
	}

	/**
	 * ＩＦ製造場所. IF mfg. location.<p>
	 *
	 */
	public void if_mfg_loc_cd(String value) {
		setConstString(offset + 16, $if_mfg_loc_cd, value);
	}

	/**
	 * ＩＦ製造場所名. IF mfg. location name.<p>
	 *
	 */
	public String if_mfg_loc_nm() {
		return getConstString(offset + 17, $if_mfg_loc_nm);
	}

	/**
	 * ＩＦ製造場所名. IF mfg. location name.<p>
	 *
	 */
	public void if_mfg_loc_nm(String value) {
		setConstString(offset + 17, $if_mfg_loc_nm, value);
	}

	/**
	 * 製造棚・ラインＣＤ. Mfg. rack/line cd..<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 18, $mfg_str_ln_cd);
	}

	/**
	 * 製造棚・ラインＣＤ. Mfg. rack/line cd..<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 18, $mfg_str_ln_cd, value);
	}

	/**
	 * ＩＦ製造棚・ラインＣＤ. IF mfg. rack/line cd..<p>
	 *
	 */
	public String if_mfg_str_ln_cd() {
		return getConstString(offset + 19, $if_mfg_str_ln_cd);
	}

	/**
	 * ＩＦ製造棚・ラインＣＤ. IF mfg. rack/line cd..<p>
	 *
	 */
	public void if_mfg_str_ln_cd(String value) {
		setConstString(offset + 19, $if_mfg_str_ln_cd, value);
	}

	/**
	 * ＩＦ製造棚・ライン名. IF mfg. rack/line name.<p>
	 *
	 */
	public String if_mfg_str_ln_nm() {
		return getConstString(offset + 20, $if_mfg_str_ln_nm);
	}

	/**
	 * ＩＦ製造棚・ライン名. IF mfg. rack/line name.<p>
	 *
	 */
	public void if_mfg_str_ln_nm(String value) {
		setConstString(offset + 20, $if_mfg_str_ln_nm, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 21, $bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 21, $bom_ptn, value);
	}

	/**
	 * 製造品目. Mfg. item.<p>
	 *
	 */
	public String mfg_itm_cd() {
		return getConstString(offset + 22, $mfg_itm_cd);
	}

	/**
	 * 製造品目. Mfg. item.<p>
	 *
	 */
	public void mfg_itm_cd(String value) {
		setConstString(offset + 22, $mfg_itm_cd, value);
	}

	/**
	 * 製造枝番１. Mfg. branch No. 1.<p>
	 *
	 */
	public String mfg_itm_sub1() {
		return getConstString(offset + 23, $mfg_itm_sub1);
	}

	/**
	 * 製造枝番１. Mfg. branch No. 1.<p>
	 *
	 */
	public void mfg_itm_sub1(String value) {
		setConstString(offset + 23, $mfg_itm_sub1, value);
	}

	/**
	 * 製造枝番２. Mfg. branch No. 2.<p>
	 *
	 */
	public String mfg_itm_sub2() {
		return getConstString(offset + 24, $mfg_itm_sub2);
	}

	/**
	 * 製造枝番２. Mfg. branch No. 2.<p>
	 *
	 */
	public void mfg_itm_sub2(String value) {
		setConstString(offset + 24, $mfg_itm_sub2, value);
	}

	/**
	 * 製造枝番３. Mfg. branch No. 3.<p>
	 *
	 */
	public String mfg_itm_sub3() {
		return getConstString(offset + 25, $mfg_itm_sub3);
	}

	/**
	 * 製造枝番３. Mfg. branch No. 3.<p>
	 *
	 */
	public void mfg_itm_sub3(String value) {
		setConstString(offset + 25, $mfg_itm_sub3, value);
	}

	/**
	 * ＩＦ製造品目. IF mfg. item.<p>
	 *
	 */
	public String if_mfg_itm_cd() {
		return getConstString(offset + 26, $if_mfg_itm_cd);
	}

	/**
	 * ＩＦ製造品目. IF mfg. item.<p>
	 *
	 */
	public void if_mfg_itm_cd(String value) {
		setConstString(offset + 26, $if_mfg_itm_cd, value);
	}

	/**
	 * ＩＦ製造枝番１. IF mfg. branch No. 1.<p>
	 *
	 */
	public String if_mfg_itm_sub1() {
		return getConstString(offset + 27, $if_mfg_itm_sub1);
	}

	/**
	 * ＩＦ製造枝番１. IF mfg. branch No. 1.<p>
	 *
	 */
	public void if_mfg_itm_sub1(String value) {
		setConstString(offset + 27, $if_mfg_itm_sub1, value);
	}

	/**
	 * ＩＦ製造枝番２. IF mfg. branch No. 2.<p>
	 *
	 */
	public String if_mfg_itm_sub2() {
		return getConstString(offset + 28, $if_mfg_itm_sub2);
	}

	/**
	 * ＩＦ製造枝番２. IF mfg. branch No. 2.<p>
	 *
	 */
	public void if_mfg_itm_sub2(String value) {
		setConstString(offset + 28, $if_mfg_itm_sub2, value);
	}

	/**
	 * ＩＦ製造枝番３. IF mfg. branch No. 3.<p>
	 *
	 */
	public String if_mfg_itm_sub3() {
		return getConstString(offset + 29, $if_mfg_itm_sub3);
	}

	/**
	 * ＩＦ製造枝番３. IF mfg. branch No. 3.<p>
	 *
	 */
	public void if_mfg_itm_sub3(String value) {
		setConstString(offset + 29, $if_mfg_itm_sub3, value);
	}

	/**
	 * ＩＦ製造品名. IF mfg. item name.<p>
	 *
	 */
	public String if_mfg_itm_nm() {
		return getConstString(offset + 30, $if_mfg_itm_nm);
	}

	/**
	 * ＩＦ製造品名. IF mfg. item name.<p>
	 *
	 */
	public void if_mfg_itm_nm(String value) {
		setConstString(offset + 30, $if_mfg_itm_nm, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 31, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 31, $oper_cd, value);
	}

	/**
	 * ＩＦ工程ＣＤ. IF operation cd..<p>
	 *
	 */
	public String if_oper_cd() {
		return getConstString(offset + 32, $if_oper_cd);
	}

	/**
	 * ＩＦ工程ＣＤ. IF operation cd..<p>
	 *
	 */
	public void if_oper_cd(String value) {
		setConstString(offset + 32, $if_oper_cd, value);
	}

	/**
	 * ＩＦ工程名. IF operation name.<p>
	 *
	 */
	public String if_oper_nm() {
		return getConstString(offset + 33, $if_oper_nm);
	}

	/**
	 * ＩＦ工程名. IF operation name.<p>
	 *
	 */
	public void if_oper_nm(String value) {
		setConstString(offset + 33, $if_oper_nm, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 34, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 34, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 34, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 34, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 34, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 34, $oper_seq, value);
	}
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 35, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 35, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 36, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 36, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 37, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 37, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 38, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 38, $itm_sub3, value);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public String if_itm_cd() {
		return getConstString(offset + 39, $if_itm_cd);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public void if_itm_cd(String value) {
		setConstString(offset + 39, $if_itm_cd, value);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public String if_itm_sub1() {
		return getConstString(offset + 40, $if_itm_sub1);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public void if_itm_sub1(String value) {
		setConstString(offset + 40, $if_itm_sub1, value);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public String if_itm_sub2() {
		return getConstString(offset + 41, $if_itm_sub2);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public void if_itm_sub2(String value) {
		setConstString(offset + 41, $if_itm_sub2, value);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public String if_itm_sub3() {
		return getConstString(offset + 42, $if_itm_sub3);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public void if_itm_sub3(String value) {
		setConstString(offset + 42, $if_itm_sub3, value);
	}

	/**
	 * ＩＦ品名. IF item name.<p>
	 *
	 */
	public String if_itm_nm() {
		return getConstString(offset + 43, $if_itm_nm);
	}

	/**
	 * ＩＦ品名. IF item name.<p>
	 *
	 */
	public void if_itm_nm(String value) {
		setConstString(offset + 43, $if_itm_nm, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 44, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 44, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 44, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 44, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 44, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 44, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 45, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 45, $trd_unit_cd, value);
	}

	/**
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public String if_trd_unit_cd() {
		return getConstString(offset + 46, $if_trd_unit_cd);
	}

	/**
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public void if_trd_unit_cd(String value) {
		setConstString(offset + 46, $if_trd_unit_cd, value);
	}

	/**
	 * ＩＦ取引単位名. IF transaction unit name.<p>
	 *
	 */
	public String if_trd_unit_nm() {
		return getConstString(offset + 47, $if_trd_unit_nm);
	}

	/**
	 * ＩＦ取引単位名. IF transaction unit name.<p>
	 *
	 */
	public void if_trd_unit_nm(String value) {
		setConstString(offset + 47, $if_trd_unit_nm, value);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 48, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 48, $oper_ptn, value);
	}

	/**
	 * 出来高区分. Output type.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 49, $yield_typ);
	}

	/**
	 * 出来高区分. Output type.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 49, $yield_typ, value);
	}

	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public MCNumber yield_rate() {
		return getConstNumber(offset + 50, $yield_rate);
	}

	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public void yield_rate(MCNumber value) {
		setConstNumber(offset + 50, $yield_rate, value);
	}
	
	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public void yield_rate(int value) {
		setConstNumber(offset + 50, $yield_rate, value);
	}
	
	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public void yield_rate(long value) {
		setConstNumber(offset + 50, $yield_rate, value);
	}
	
	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public void yield_rate(float value) {
		setConstNumber(offset + 50, $yield_rate, value);
	}
	
	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public void yield_rate(double value) {
		setConstNumber(offset + 50, $yield_rate, value);
	}
	
	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 51, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 51, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 52, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 52, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 53, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 53, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 54, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 54, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 55, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 55, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 56, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 56, $sno4, value);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 57, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 57, $quality_typ, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 58, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 58, $gd_cd, value);
	}

	/**
	 * ＩＦ格付ＣＤ. IF grading cd..<p>
	 *
	 */
	public String if_gd_cd() {
		return getConstString(offset + 59, $if_gd_cd);
	}

	/**
	 * ＩＦ格付ＣＤ. IF grading cd..<p>
	 *
	 */
	public void if_gd_cd(String value) {
		setConstString(offset + 59, $if_gd_cd, value);
	}

	/**
	 * ＩＦ格付名. IF grading name.<p>
	 *
	 */
	public String if_gd_nm() {
		return getConstString(offset + 60, $if_gd_nm);
	}

	/**
	 * ＩＦ格付名. IF grading name.<p>
	 *
	 */
	public void if_gd_nm(String value) {
		setConstString(offset + 60, $if_gd_nm, value);
	}

	/**
	 * 出来高理由ＣＤ. Output reason cd..<p>
	 *
	 */
	public String yield_rsn_cd() {
		return getConstString(offset + 61, $yield_rsn_cd);
	}

	/**
	 * 出来高理由ＣＤ. Output reason cd..<p>
	 *
	 */
	public void yield_rsn_cd(String value) {
		setConstString(offset + 61, $yield_rsn_cd, value);
	}

	/**
	 * ＩＦ出来高理由ＣＤ. IF output reason cd..<p>
	 *
	 */
	public String if_yield_rsn_cd() {
		return getConstString(offset + 62, $if_yield_rsn_cd);
	}

	/**
	 * ＩＦ出来高理由ＣＤ. IF output reason cd..<p>
	 *
	 */
	public void if_yield_rsn_cd(String value) {
		setConstString(offset + 62, $if_yield_rsn_cd, value);
	}

	/**
	 * ＩＦ出来高理由名. IF output reason name.<p>
	 *
	 */
	public String if_yield_rsn_nm() {
		return getConstString(offset + 63, $if_yield_rsn_nm);
	}

	/**
	 * ＩＦ出来高理由名. IF output reason name.<p>
	 *
	 */
	public void if_yield_rsn_nm(String value) {
		setConstString(offset + 63, $if_yield_rsn_nm, value);
	}

	/**
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 64, $strg_loc_cd);
	}

	/**
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 64, $strg_loc_cd, value);
	}

	/**
	 * ＩＦ格納場所ＣＤ. IF storage location cd..<p>
	 *
	 */
	public String if_strg_loc_cd() {
		return getConstString(offset + 65, $if_strg_loc_cd);
	}

	/**
	 * ＩＦ格納場所ＣＤ. IF storage location cd..<p>
	 *
	 */
	public void if_strg_loc_cd(String value) {
		setConstString(offset + 65, $if_strg_loc_cd, value);
	}

	/**
	 * ＩＦ格納場所名. IF storage location name.<p>
	 *
	 */
	public String if_strg_loc_nm() {
		return getConstString(offset + 66, $if_strg_loc_nm);
	}

	/**
	 * ＩＦ格納場所名. IF storage location name.<p>
	 *
	 */
	public void if_strg_loc_nm(String value) {
		setConstString(offset + 66, $if_strg_loc_nm, value);
	}

	/**
	 * 格納棚・ラインＣＤ. Storage rack/line cd..<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 67, $strg_str_ln_cd);
	}

	/**
	 * 格納棚・ラインＣＤ. Storage rack/line cd..<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 67, $strg_str_ln_cd, value);
	}

	/**
	 * ＩＦ格納棚・ラインＣＤ. IF storage rack/line cd..<p>
	 *
	 */
	public String if_strg_str_ln_cd() {
		return getConstString(offset + 68, $if_strg_str_ln_cd);
	}

	/**
	 * ＩＦ格納棚・ラインＣＤ. IF storage rack/line cd..<p>
	 *
	 */
	public void if_strg_str_ln_cd(String value) {
		setConstString(offset + 68, $if_strg_str_ln_cd, value);
	}

	/**
	 * ＩＦ格納棚・ライン名. IF storage rack/line name.<p>
	 *
	 */
	public String if_strg_str_ln_nm() {
		return getConstString(offset + 69, $if_strg_str_ln_nm);
	}

	/**
	 * ＩＦ格納棚・ライン名. IF storage rack/line name.<p>
	 *
	 */
	public void if_strg_str_ln_nm(String value) {
		setConstString(offset + 69, $if_strg_str_ln_nm, value);
	}

	/**
	 * 実績日時. Actual date and time.<p>
	 *
	 */
	public MCDate act_tm() {
		return getConstDate(offset + 70, $act_tm);
	}

	/**
	 * 実績日時. Actual date and time.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		setConstDate(offset + 70, $act_tm, value);
	}

	/**
	 * 同一ロットＦＬＧ. Same lot flg..<p>
	 *
	 */
	public boolean same_lot_flg() {
		return getConstBoolean(offset + 71, $same_lot_flg);
	}

	/**
	 * 同一ロットＦＬＧ. Same lot flg..<p>
	 *
	 */
	public void same_lot_flg(boolean value) {
		setConstBoolean(offset + 71, $same_lot_flg, value);
	}

	/**
	 * 検査連絡備考. Inspection contact remarks.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 72, $insp_cnt_rmrks);
	}

	/**
	 * 検査連絡備考. Inspection contact remarks.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 72, $insp_cnt_rmrks, value);
	}

	/**
	 * 内部備考（出来高）. Internal remarks (Output).<p>
	 *
	 */
	public String yield_act_intr_rmrks() {
		return getConstString(offset + 73, $yield_act_intr_rmrks);
	}

	/**
	 * 内部備考（出来高）. Internal remarks (Output).<p>
	 *
	 */
	public void yield_act_intr_rmrks(String value) {
		setConstString(offset + 73, $yield_act_intr_rmrks, value);
	}

	/**
	 * 記録書備考（出来高）. Record sheet remarks (Output).<p>
	 *
	 */
	public String yield_act_rpt_rmrks() {
		return getConstString(offset + 74, $yield_act_rpt_rmrks);
	}

	/**
	 * 記録書備考（出来高）. Record sheet remarks (Output).<p>
	 *
	 */
	public void yield_act_rpt_rmrks(String value) {
		setConstString(offset + 74, $yield_act_rpt_rmrks, value);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 75, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 75, $trd_rmrks, value);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 76, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 76, $abort_flg, value);
	}

	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public MCNumber itm_yield() {
		return getConstNumber(offset + 77, $itm_yield);
	}

	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public void itm_yield(MCNumber value) {
		setConstNumber(offset + 77, $itm_yield, value);
	}
	
	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public void itm_yield(int value) {
		setConstNumber(offset + 77, $itm_yield, value);
	}
	
	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public void itm_yield(long value) {
		setConstNumber(offset + 77, $itm_yield, value);
	}
	
	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public void itm_yield(float value) {
		setConstNumber(offset + 77, $itm_yield, value);
	}
	
	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public void itm_yield(double value) {
		setConstNumber(offset + 77, $itm_yield, value);
	}
	
	/**
	 * 製造実績部門ＣＤ. Mfg. result dept. cd..<p>
	 *
	 */
	public String mfg_act_dpt_cd() {
		return getConstString(offset + 78, $mfg_act_dpt_cd);
	}

	/**
	 * 製造実績部門ＣＤ. Mfg. result dept. cd..<p>
	 *
	 */
	public void mfg_act_dpt_cd(String value) {
		setConstString(offset + 78, $mfg_act_dpt_cd, value);
	}

	/**
	 * ＩＦ製造実績部門ＣＤ. IF mfg. result dept. cd..<p>
	 *
	 */
	public String if_mfg_act_dpt_cd() {
		return getConstString(offset + 79, $if_mfg_act_dpt_cd);
	}

	/**
	 * ＩＦ製造実績部門ＣＤ. IF mfg. result dept. cd..<p>
	 *
	 */
	public void if_mfg_act_dpt_cd(String value) {
		setConstString(offset + 79, $if_mfg_act_dpt_cd, value);
	}

	/**
	 * ＩＦ製造実績部門名. IF mfg. result dept. name.<p>
	 *
	 */
	public String if_mfg_act_dpt_nm() {
		return getConstString(offset + 80, $if_mfg_act_dpt_nm);
	}

	/**
	 * ＩＦ製造実績部門名. IF mfg. result dept. name.<p>
	 *
	 */
	public void if_mfg_act_dpt_nm(String value) {
		setConstString(offset + 80, $if_mfg_act_dpt_nm, value);
	}

	/**
	 * 製造実績責任者ＣＤ. Mfg. result PIC cd..<p>
	 *
	 */
	public String mfg_act_usr_cd() {
		return getConstString(offset + 81, $mfg_act_usr_cd);
	}

	/**
	 * 製造実績責任者ＣＤ. Mfg. result PIC cd..<p>
	 *
	 */
	public void mfg_act_usr_cd(String value) {
		setConstString(offset + 81, $mfg_act_usr_cd, value);
	}

	/**
	 * ＩＦ製造実績責任者ＣＤ. IF mfg. result management PIC cd..<p>
	 *
	 */
	public String if_mfg_act_usr_cd() {
		return getConstString(offset + 82, $if_mfg_act_usr_cd);
	}

	/**
	 * ＩＦ製造実績責任者ＣＤ. IF mfg. result management PIC cd..<p>
	 *
	 */
	public void if_mfg_act_usr_cd(String value) {
		setConstString(offset + 82, $if_mfg_act_usr_cd, value);
	}

	/**
	 * ＩＦ製造実績責任者名. IF mfg. result management PIC name.<p>
	 *
	 */
	public String if_mfg_act_usr_nm() {
		return getConstString(offset + 83, $if_mfg_act_usr_nm);
	}

	/**
	 * ＩＦ製造実績責任者名. IF mfg. result management PIC name.<p>
	 *
	 */
	public void if_mfg_act_usr_nm(String value) {
		setConstString(offset + 83, $if_mfg_act_usr_nm, value);
	}

	/**
	 * 内部備考（製造）. Internal remarks (Mfg.).<p>
	 *
	 */
	public String mfg_act_intr_rmrks() {
		return getConstString(offset + 84, $mfg_act_intr_rmrks);
	}

	/**
	 * 内部備考（製造）. Internal remarks (Mfg.).<p>
	 *
	 */
	public void mfg_act_intr_rmrks(String value) {
		setConstString(offset + 84, $mfg_act_intr_rmrks, value);
	}

	/**
	 * 記録書備考（製造）. Record sheet remarks (Mfg.).<p>
	 *
	 */
	public String mfg_act_rpt_rmrks() {
		return getConstString(offset + 85, $mfg_act_rpt_rmrks);
	}

	/**
	 * 記録書備考（製造）. Record sheet remarks (Mfg.).<p>
	 *
	 */
	public void mfg_act_rpt_rmrks(String value) {
		setConstString(offset + 85, $mfg_act_rpt_rmrks, value);
	}

	/**
	 * 全工程実績作成ＦＬＧ. All operation results creation flg..<p>
	 *
	 */
	public boolean all_oper_act_reg_flg() {
		return getConstBoolean(offset + 86, $all_oper_act_reg_flg);
	}

	/**
	 * 全工程実績作成ＦＬＧ. All operation results creation flg..<p>
	 *
	 */
	public void all_oper_act_reg_flg(boolean value) {
		setConstBoolean(offset + 86, $all_oper_act_reg_flg, value);
	}

	/**
	 * 外部工程実績ＮＯ. External operation result No..<p>
	 *
	 */
	public String ext_oper_act_no() {
		return getConstString(offset + 87, $ext_oper_act_no);
	}

	/**
	 * 外部工程実績ＮＯ. External operation result No..<p>
	 *
	 */
	public void ext_oper_act_no(String value) {
		setConstString(offset + 87, $ext_oper_act_no, value);
	}

	/**
	 * 外部出来高実績ＮＯ. External output result No..<p>
	 *
	 */
	public String ext_yield_act_no() {
		return getConstString(offset + 88, $ext_yield_act_no);
	}

	/**
	 * 外部出来高実績ＮＯ. External output result No..<p>
	 *
	 */
	public void ext_yield_act_no(String value) {
		setConstString(offset + 88, $ext_yield_act_no, value);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public String if_co_cd() {
		return getConstString(offset + 89, $if_co_cd);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public void if_co_cd(String value) {
		setConstString(offset + 89, $if_co_cd, value);
	}

	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public String if_co_nm() {
		return getConstString(offset + 90, $if_co_nm);
	}

	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public void if_co_nm(String value) {
		setConstString(offset + 90, $if_co_nm, value);
	}

	/**
	 * サーバリクエストＮＯ. Server request No..<p>
	 *
	 */
	public String req_no() {
		return getConstString(offset + 91, $req_no);
	}

	/**
	 * サーバリクエストＮＯ. Server request No..<p>
	 *
	 */
	public void req_no(String value) {
		setConstString(offset + 91, $req_no, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 92, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 92, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 93, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 93, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 94, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 94, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 95, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 95, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 96, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 96, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 97, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 97, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 98, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 98, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 99, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 99, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 100, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 100, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 101, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 101, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 102, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 102, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 103, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 103, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 104, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 104, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 105, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 105, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 106, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 106, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 107, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 107, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 108, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 108, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 109, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 109, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 110, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 110, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 111, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 111, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 112, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 112, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 113, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 113, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 114, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 114, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 115, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 115, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 116, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 116, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 117, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 117, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 118, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 118, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 119, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 119, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 120, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 120, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 121, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 121, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 122, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 122, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 122, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 122, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 122, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 122, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 123, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 123, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 123, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 123, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 123, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 123, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 124, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 124, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 124, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 124, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 124, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 124, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 125, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 125, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 125, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 125, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 125, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 125, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 126, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 126, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 126, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 126, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 126, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 126, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 127, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 127, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 128, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 128, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 129, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 129, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 130, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 130, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 131, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 131, $sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 132, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 132, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 133, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 133, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 133, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 133, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 133, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 133, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 134, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 134, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 134, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 134, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 134, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 134, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 135, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 135, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 136, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 136, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 137, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 137, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 138, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 138, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 139, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 139, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 139, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 139, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 139, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 139, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 140, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 140, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 141, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 141, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 142, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 142, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 143, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 143, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 144, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 144, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 145, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 145, $sdrv_sts_typ, value);
	}

	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 146, $mfg_loc_nm);
	}

	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 146, $mfg_loc_nm, value);
	}

	/**
	 * 製造品名. Mfg. item name.<p>
	 *
	 */
	public String mfg_itm_nm() {
		return getConstString(offset + 147, $mfg_itm_nm);
	}

	/**
	 * 製造品名. Mfg. item name.<p>
	 *
	 */
	public void mfg_itm_nm(String value) {
		setConstString(offset + 147, $mfg_itm_nm, value);
	}

	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 148, $oper_nm);
	}

	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 148, $oper_nm, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 149, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 149, $itm_nm, value);
	}

	/**
	 * 製造棚・ライン名. Mfg. rack/line name.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 150, $mfg_str_ln_nm);
	}

	/**
	 * 製造棚・ライン名. Mfg. rack/line name.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 150, $mfg_str_ln_nm, value);
	}

	/**
	 * 格納場所名. Storage location name.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 151, $strg_loc_nm);
	}

	/**
	 * 格納場所名. Storage location name.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 151, $strg_loc_nm, value);
	}

	/**
	 * 格納棚・ライン名. Storage rack/line name.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 152, $strg_str_ln_nm);
	}

	/**
	 * 格納棚・ライン名. Storage rack/line name.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 152, $strg_str_ln_nm, value);
	}

	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 153, $trd_unit_nm);
	}

	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 153, $trd_unit_nm, value);
	}

	/**
	 * 出来高理由名. Output reason name.<p>
	 *
	 */
	public String yield_rsn_nm() {
		return getConstString(offset + 154, $yield_rsn_nm);
	}

	/**
	 * 出来高理由名. Output reason name.<p>
	 *
	 */
	public void yield_rsn_nm(String value) {
		setConstString(offset + 154, $yield_rsn_nm, value);
	}

	/**
	 * 格付名. Grading name.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 155, $gd_nm);
	}

	/**
	 * 格付名. Grading name.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 155, $gd_nm, value);
	}

	/**
	 * 製造実績部門名. Mfg. result dept. name.<p>
	 *
	 */
	public String mfg_act_dpt_nm() {
		return getConstString(offset + 156, $mfg_act_dpt_nm);
	}

	/**
	 * 製造実績部門名. Mfg. result dept. name.<p>
	 *
	 */
	public void mfg_act_dpt_nm(String value) {
		setConstString(offset + 156, $mfg_act_dpt_nm, value);
	}

	/**
	 * 製造実績責任者名. Mfg. result PIC name.<p>
	 *
	 */
	public String mfg_act_usr_nm() {
		return getConstString(offset + 157, $mfg_act_usr_nm);
	}

	/**
	 * 製造実績責任者名. Mfg. result PIC name.<p>
	 *
	 */
	public void mfg_act_usr_nm(String value) {
		setConstString(offset + 157, $mfg_act_usr_nm, value);
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
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($if_mfg_loc_cd.equalsIgnoreCase(name)) {
			return if_mfg_loc_cd();
		}
		if ($if_mfg_loc_nm.equalsIgnoreCase(name)) {
			return if_mfg_loc_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($if_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return if_mfg_str_ln_cd();
		}
		if ($if_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return if_mfg_str_ln_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($mfg_itm_cd.equalsIgnoreCase(name)) {
			return mfg_itm_cd();
		}
		if ($mfg_itm_sub1.equalsIgnoreCase(name)) {
			return mfg_itm_sub1();
		}
		if ($mfg_itm_sub2.equalsIgnoreCase(name)) {
			return mfg_itm_sub2();
		}
		if ($mfg_itm_sub3.equalsIgnoreCase(name)) {
			return mfg_itm_sub3();
		}
		if ($if_mfg_itm_cd.equalsIgnoreCase(name)) {
			return if_mfg_itm_cd();
		}
		if ($if_mfg_itm_sub1.equalsIgnoreCase(name)) {
			return if_mfg_itm_sub1();
		}
		if ($if_mfg_itm_sub2.equalsIgnoreCase(name)) {
			return if_mfg_itm_sub2();
		}
		if ($if_mfg_itm_sub3.equalsIgnoreCase(name)) {
			return if_mfg_itm_sub3();
		}
		if ($if_mfg_itm_nm.equalsIgnoreCase(name)) {
			return if_mfg_itm_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($if_oper_cd.equalsIgnoreCase(name)) {
			return if_oper_cd();
		}
		if ($if_oper_nm.equalsIgnoreCase(name)) {
			return if_oper_nm();
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
		if ($if_itm_nm.equalsIgnoreCase(name)) {
			return if_itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			return if_trd_unit_cd();
		}
		if ($if_trd_unit_nm.equalsIgnoreCase(name)) {
			return if_trd_unit_nm();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($if_gd_cd.equalsIgnoreCase(name)) {
			return if_gd_cd();
		}
		if ($if_gd_nm.equalsIgnoreCase(name)) {
			return if_gd_nm();
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			return yield_rsn_cd();
		}
		if ($if_yield_rsn_cd.equalsIgnoreCase(name)) {
			return if_yield_rsn_cd();
		}
		if ($if_yield_rsn_nm.equalsIgnoreCase(name)) {
			return if_yield_rsn_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($if_strg_loc_cd.equalsIgnoreCase(name)) {
			return if_strg_loc_cd();
		}
		if ($if_strg_loc_nm.equalsIgnoreCase(name)) {
			return if_strg_loc_nm();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($if_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return if_strg_str_ln_cd();
		}
		if ($if_strg_str_ln_nm.equalsIgnoreCase(name)) {
			return if_strg_str_ln_nm();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_act_intr_rmrks();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			return mfg_act_dpt_cd();
		}
		if ($if_mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			return if_mfg_act_dpt_cd();
		}
		if ($if_mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			return if_mfg_act_dpt_nm();
		}
		if ($mfg_act_usr_cd.equalsIgnoreCase(name)) {
			return mfg_act_usr_cd();
		}
		if ($if_mfg_act_usr_cd.equalsIgnoreCase(name)) {
			return if_mfg_act_usr_cd();
		}
		if ($if_mfg_act_usr_nm.equalsIgnoreCase(name)) {
			return if_mfg_act_usr_nm();
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_intr_rmrks();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			return ext_oper_act_no();
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			return ext_yield_act_no();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			return if_co_nm();
		}
		if ($req_no.equalsIgnoreCase(name)) {
			return req_no();
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
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_itm_nm.equalsIgnoreCase(name)) {
			return mfg_itm_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			return yield_rsn_nm();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			return mfg_act_dpt_nm();
		}
		if ($mfg_act_usr_nm.equalsIgnoreCase(name)) {
			return mfg_act_usr_nm();
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			return itm_yield();
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			return recv_dt();
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($all_oper_act_reg_flg.equalsIgnoreCase(name)) {
			return all_oper_act_reg_flg();
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
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($if_mfg_loc_cd.equalsIgnoreCase(name)) {
			return if_mfg_loc_cd();
		}
		if ($if_mfg_loc_nm.equalsIgnoreCase(name)) {
			return if_mfg_loc_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($if_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return if_mfg_str_ln_cd();
		}
		if ($if_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return if_mfg_str_ln_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($mfg_itm_cd.equalsIgnoreCase(name)) {
			return mfg_itm_cd();
		}
		if ($mfg_itm_sub1.equalsIgnoreCase(name)) {
			return mfg_itm_sub1();
		}
		if ($mfg_itm_sub2.equalsIgnoreCase(name)) {
			return mfg_itm_sub2();
		}
		if ($mfg_itm_sub3.equalsIgnoreCase(name)) {
			return mfg_itm_sub3();
		}
		if ($if_mfg_itm_cd.equalsIgnoreCase(name)) {
			return if_mfg_itm_cd();
		}
		if ($if_mfg_itm_sub1.equalsIgnoreCase(name)) {
			return if_mfg_itm_sub1();
		}
		if ($if_mfg_itm_sub2.equalsIgnoreCase(name)) {
			return if_mfg_itm_sub2();
		}
		if ($if_mfg_itm_sub3.equalsIgnoreCase(name)) {
			return if_mfg_itm_sub3();
		}
		if ($if_mfg_itm_nm.equalsIgnoreCase(name)) {
			return if_mfg_itm_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($if_oper_cd.equalsIgnoreCase(name)) {
			return if_oper_cd();
		}
		if ($if_oper_nm.equalsIgnoreCase(name)) {
			return if_oper_nm();
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
		if ($if_itm_nm.equalsIgnoreCase(name)) {
			return if_itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			return if_trd_unit_cd();
		}
		if ($if_trd_unit_nm.equalsIgnoreCase(name)) {
			return if_trd_unit_nm();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($if_gd_cd.equalsIgnoreCase(name)) {
			return if_gd_cd();
		}
		if ($if_gd_nm.equalsIgnoreCase(name)) {
			return if_gd_nm();
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			return yield_rsn_cd();
		}
		if ($if_yield_rsn_cd.equalsIgnoreCase(name)) {
			return if_yield_rsn_cd();
		}
		if ($if_yield_rsn_nm.equalsIgnoreCase(name)) {
			return if_yield_rsn_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($if_strg_loc_cd.equalsIgnoreCase(name)) {
			return if_strg_loc_cd();
		}
		if ($if_strg_loc_nm.equalsIgnoreCase(name)) {
			return if_strg_loc_nm();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($if_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return if_strg_str_ln_cd();
		}
		if ($if_strg_str_ln_nm.equalsIgnoreCase(name)) {
			return if_strg_str_ln_nm();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_act_intr_rmrks();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			return mfg_act_dpt_cd();
		}
		if ($if_mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			return if_mfg_act_dpt_cd();
		}
		if ($if_mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			return if_mfg_act_dpt_nm();
		}
		if ($mfg_act_usr_cd.equalsIgnoreCase(name)) {
			return mfg_act_usr_cd();
		}
		if ($if_mfg_act_usr_cd.equalsIgnoreCase(name)) {
			return if_mfg_act_usr_cd();
		}
		if ($if_mfg_act_usr_nm.equalsIgnoreCase(name)) {
			return if_mfg_act_usr_nm();
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_intr_rmrks();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			return ext_oper_act_no();
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			return ext_yield_act_no();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			return if_co_nm();
		}
		if ($req_no.equalsIgnoreCase(name)) {
			return req_no();
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
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_itm_nm.equalsIgnoreCase(name)) {
			return mfg_itm_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			return yield_rsn_nm();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			return mfg_act_dpt_nm();
		}
		if ($mfg_act_usr_nm.equalsIgnoreCase(name)) {
			return mfg_act_usr_nm();
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			return itm_yield();
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			return recv_dt();
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($all_oper_act_reg_flg.equalsIgnoreCase(name)) {
			return all_oper_act_reg_flg();
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
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($if_mfg_loc_nm.equalsIgnoreCase(name)) {
			if_mfg_loc_nm(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($if_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			if_mfg_str_ln_cd(value);
			return;
		}
		if ($if_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			if_mfg_str_ln_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($mfg_itm_cd.equalsIgnoreCase(name)) {
			mfg_itm_cd(value);
			return;
		}
		if ($mfg_itm_sub1.equalsIgnoreCase(name)) {
			mfg_itm_sub1(value);
			return;
		}
		if ($mfg_itm_sub2.equalsIgnoreCase(name)) {
			mfg_itm_sub2(value);
			return;
		}
		if ($mfg_itm_sub3.equalsIgnoreCase(name)) {
			mfg_itm_sub3(value);
			return;
		}
		if ($if_mfg_itm_cd.equalsIgnoreCase(name)) {
			if_mfg_itm_cd(value);
			return;
		}
		if ($if_mfg_itm_sub1.equalsIgnoreCase(name)) {
			if_mfg_itm_sub1(value);
			return;
		}
		if ($if_mfg_itm_sub2.equalsIgnoreCase(name)) {
			if_mfg_itm_sub2(value);
			return;
		}
		if ($if_mfg_itm_sub3.equalsIgnoreCase(name)) {
			if_mfg_itm_sub3(value);
			return;
		}
		if ($if_mfg_itm_nm.equalsIgnoreCase(name)) {
			if_mfg_itm_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($if_oper_cd.equalsIgnoreCase(name)) {
			if_oper_cd(value);
			return;
		}
		if ($if_oper_nm.equalsIgnoreCase(name)) {
			if_oper_nm(value);
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
		if ($if_itm_nm.equalsIgnoreCase(name)) {
			if_itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			if_trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_nm.equalsIgnoreCase(name)) {
			if_trd_unit_nm(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($if_gd_cd.equalsIgnoreCase(name)) {
			if_gd_cd(value);
			return;
		}
		if ($if_gd_nm.equalsIgnoreCase(name)) {
			if_gd_nm(value);
			return;
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			yield_rsn_cd(value);
			return;
		}
		if ($if_yield_rsn_cd.equalsIgnoreCase(name)) {
			if_yield_rsn_cd(value);
			return;
		}
		if ($if_yield_rsn_nm.equalsIgnoreCase(name)) {
			if_yield_rsn_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($if_strg_loc_cd.equalsIgnoreCase(name)) {
			if_strg_loc_cd(value);
			return;
		}
		if ($if_strg_loc_nm.equalsIgnoreCase(name)) {
			if_strg_loc_nm(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($if_strg_str_ln_cd.equalsIgnoreCase(name)) {
			if_strg_str_ln_cd(value);
			return;
		}
		if ($if_strg_str_ln_nm.equalsIgnoreCase(name)) {
			if_strg_str_ln_nm(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			yield_act_intr_rmrks(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			mfg_act_dpt_cd(value);
			return;
		}
		if ($if_mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			if_mfg_act_dpt_cd(value);
			return;
		}
		if ($if_mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			if_mfg_act_dpt_nm(value);
			return;
		}
		if ($mfg_act_usr_cd.equalsIgnoreCase(name)) {
			mfg_act_usr_cd(value);
			return;
		}
		if ($if_mfg_act_usr_cd.equalsIgnoreCase(name)) {
			if_mfg_act_usr_cd(value);
			return;
		}
		if ($if_mfg_act_usr_nm.equalsIgnoreCase(name)) {
			if_mfg_act_usr_nm(value);
			return;
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_act_intr_rmrks(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			ext_oper_act_no(value);
			return;
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			ext_yield_act_no(value);
			return;
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			if_co_nm(value);
			return;
		}
		if ($req_no.equalsIgnoreCase(name)) {
			req_no(value);
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
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_itm_nm.equalsIgnoreCase(name)) {
			mfg_itm_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			yield_rsn_nm(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			mfg_act_dpt_nm(value);
			return;
		}
		if ($mfg_act_usr_nm.equalsIgnoreCase(name)) {
			mfg_act_usr_nm(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			recv_dt(value);
			return;
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($all_oper_act_reg_flg.equalsIgnoreCase(name)) {
			all_oper_act_reg_flg(value);
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
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($if_mfg_loc_nm.equalsIgnoreCase(name)) {
			if_mfg_loc_nm(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($if_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			if_mfg_str_ln_cd(value);
			return;
		}
		if ($if_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			if_mfg_str_ln_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($mfg_itm_cd.equalsIgnoreCase(name)) {
			mfg_itm_cd(value);
			return;
		}
		if ($mfg_itm_sub1.equalsIgnoreCase(name)) {
			mfg_itm_sub1(value);
			return;
		}
		if ($mfg_itm_sub2.equalsIgnoreCase(name)) {
			mfg_itm_sub2(value);
			return;
		}
		if ($mfg_itm_sub3.equalsIgnoreCase(name)) {
			mfg_itm_sub3(value);
			return;
		}
		if ($if_mfg_itm_cd.equalsIgnoreCase(name)) {
			if_mfg_itm_cd(value);
			return;
		}
		if ($if_mfg_itm_sub1.equalsIgnoreCase(name)) {
			if_mfg_itm_sub1(value);
			return;
		}
		if ($if_mfg_itm_sub2.equalsIgnoreCase(name)) {
			if_mfg_itm_sub2(value);
			return;
		}
		if ($if_mfg_itm_sub3.equalsIgnoreCase(name)) {
			if_mfg_itm_sub3(value);
			return;
		}
		if ($if_mfg_itm_nm.equalsIgnoreCase(name)) {
			if_mfg_itm_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($if_oper_cd.equalsIgnoreCase(name)) {
			if_oper_cd(value);
			return;
		}
		if ($if_oper_nm.equalsIgnoreCase(name)) {
			if_oper_nm(value);
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
		if ($if_itm_nm.equalsIgnoreCase(name)) {
			if_itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			if_trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_nm.equalsIgnoreCase(name)) {
			if_trd_unit_nm(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($if_gd_cd.equalsIgnoreCase(name)) {
			if_gd_cd(value);
			return;
		}
		if ($if_gd_nm.equalsIgnoreCase(name)) {
			if_gd_nm(value);
			return;
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			yield_rsn_cd(value);
			return;
		}
		if ($if_yield_rsn_cd.equalsIgnoreCase(name)) {
			if_yield_rsn_cd(value);
			return;
		}
		if ($if_yield_rsn_nm.equalsIgnoreCase(name)) {
			if_yield_rsn_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($if_strg_loc_cd.equalsIgnoreCase(name)) {
			if_strg_loc_cd(value);
			return;
		}
		if ($if_strg_loc_nm.equalsIgnoreCase(name)) {
			if_strg_loc_nm(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($if_strg_str_ln_cd.equalsIgnoreCase(name)) {
			if_strg_str_ln_cd(value);
			return;
		}
		if ($if_strg_str_ln_nm.equalsIgnoreCase(name)) {
			if_strg_str_ln_nm(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			yield_act_intr_rmrks(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			mfg_act_dpt_cd(value);
			return;
		}
		if ($if_mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			if_mfg_act_dpt_cd(value);
			return;
		}
		if ($if_mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			if_mfg_act_dpt_nm(value);
			return;
		}
		if ($mfg_act_usr_cd.equalsIgnoreCase(name)) {
			mfg_act_usr_cd(value);
			return;
		}
		if ($if_mfg_act_usr_cd.equalsIgnoreCase(name)) {
			if_mfg_act_usr_cd(value);
			return;
		}
		if ($if_mfg_act_usr_nm.equalsIgnoreCase(name)) {
			if_mfg_act_usr_nm(value);
			return;
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_act_intr_rmrks(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			ext_oper_act_no(value);
			return;
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			ext_yield_act_no(value);
			return;
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			if_co_nm(value);
			return;
		}
		if ($req_no.equalsIgnoreCase(name)) {
			req_no(value);
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
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_itm_nm.equalsIgnoreCase(name)) {
			mfg_itm_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			yield_rsn_nm(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($mfg_act_dpt_nm.equalsIgnoreCase(name)) {
			mfg_act_dpt_nm(value);
			return;
		}
		if ($mfg_act_usr_nm.equalsIgnoreCase(name)) {
			mfg_act_usr_nm(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			recv_dt(value);
			return;
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($all_oper_act_reg_flg.equalsIgnoreCase(name)) {
			all_oper_act_reg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
