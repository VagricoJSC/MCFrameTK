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
 * "工程指図送信ＩＦ // Operation order export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>oper_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程指図ＮＯ</td>
 *  	<td>Operation order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図改訂番号</td>
 *  	<td>Mfg. order rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造場所ＣＤ</td>
 *  	<td>Mfg. location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造場所</td>
 *  	<td>IF mfg. location</td>
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
 *  	<td>mfg_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造品目</td>
 *  	<td>Mfg. item</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造枝番１</td>
 *  	<td>Mfg. branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造枝番２</td>
 *  	<td>Mfg. branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造枝番３</td>
 *  	<td>Mfg. branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_mfg_itm_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造品目</td>
 *  	<td>IF mfg. item</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_mfg_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造枝番１</td>
 *  	<td>IF mfg. branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_mfg_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造枝番２</td>
 *  	<td>IF mfg. branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_mfg_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ製造枝番３</td>
 *  	<td>IF mfg. branch No. 3</td>
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
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_oper_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ工程ＣＤ</td>
 *  	<td>IF operation cd.</td>
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
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工順</td>
 *  	<td>Routing</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>着手予定日時</td>
 *  	<td>Scheduled start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>終了予定日時</td>
 *  	<td>Scheduled end date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程場所ＣＤ</td>
 *  	<td>Operation location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_oper_loc_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ工程場所ＣＤ</td>
 *  	<td>IF operation location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程場所名</td>
 *  	<td>Operation location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程棚・ラインＣＤ</td>
 *  	<td>Operation rack/line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_oper_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ工程棚・ラインＣＤ</td>
 *  	<td>IF operation rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程棚・ライン名</td>
 *  	<td>Operation rack/line name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程基準単位数量</td>
 *  	<td>Operation base unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_conv_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程換算単位数量</td>
 *  	<td>Operation conversion unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程単位数量</td>
 *  	<td>Operation unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程単位ＣＤ</td>
 *  	<td>Operation unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_oper_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ工程単位ＣＤ</td>
 *  	<td>IF operation unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程単位名</td>
 *  	<td>Operation unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_unit_conv_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程換算端数処理区分</td>
 *  	<td>Operation conversion rounding type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_unit_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程単位小数部有効桁数</td>
 *  	<td>Operation unit number of decimal places</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bkf_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>バックフラッシュ許可ＦＬＧ</td>
 *  	<td>Allow backflush flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wk_cost_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>自動工数計算ＦＬＧ</td>
 *  	<td>Auto man-hour calculation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ担当者ＣＤ</td>
 *  	<td>IF PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者名</td>
 *  	<td>PIC name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_lower_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程下限収率</td>
 *  	<td>Operation min. yield</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_std_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程標準収率</td>
 *  	<td>Operation standard yield</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_upper_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程上限収率</td>
 *  	<td>Operation max. yield</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wip_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕掛進捗度</td>
 *  	<td>WIP progress</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_oper_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高計上工程ＦＬＧ</td>
 *  	<td>Create inventory flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考（工程）</td>
 *  	<td>Internal remarks (Operation)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図書備考（工程）</td>
 *  	<td>Order sheet remarks (Operation)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造状況区分（工程）</td>
 *  	<td>Mfg. status (Operation)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_mtd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>生産方法区分</td>
 *  	<td>Production method type</td>
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
 *  	<td>bom_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成パタン</td>
 *  	<td>BOM pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>strg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>格納先場所ＣＤ</td>
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
 *  	<td>strg_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納先場所名</td>
 *  	<td>Storage location name</td>
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
 *  	<td>strg_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納棚・ライン名</td>
 *  	<td>Storage rack/line name</td>
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
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_wg_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦワーキンググループＣＤ</td>
 *  	<td>IF working group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名</td>
 *  	<td>WG name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_site_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ工場・物流倉庫ＣＤ</td>
 *  	<td>IF factory/distribution warehouse cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名</td>
 *  	<td>Factory/Distribution warehouse name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_lower_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目下限収率</td>
 *  	<td>Item min. yield</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_std_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目標準収率</td>
 *  	<td>Item standard yield</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_upper_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目上限収率</td>
 *  	<td>Item max. yield</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_yield_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位出来高予定数量</td>
 *  	<td>Base unit output scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位製造指図数量</td>
 *  	<td>Base unit mfg. order qty.</td>
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
 *  	<td>if_base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ基準単位ＣＤ</td>
 *  	<td>IF base unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位名</td>
 *  	<td>Base unit name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造着手予定日時</td>
 *  	<td>Scheduled mfg. start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造終了予定日時</td>
 *  	<td>Scheduled mfg. end date and time</td>
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
 *  	<td>inst_prnt_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図書発行日時</td>
 *  	<td>Order sheet issued date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>指図書発行済ＦＬＧ</td>
 *  	<td>Order sheet issued flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認対象ＦＬＧ</td>
 *  	<td>For approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造承認状況区分</td>
 *  	<td>Mfg. approval status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認日</td>
 *  	<td>Approval date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認部門ＣＤ</td>
 *  	<td>Approval dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_aprv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ承認部門ＣＤ</td>
 *  	<td>IF approval dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認部門名</td>
 *  	<td>Approval dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認者ＣＤ</td>
 *  	<td>Approver cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ承認者ＣＤ</td>
 *  	<td>IF approver cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認者名</td>
 *  	<td>Approver name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認理由</td>
 *  	<td>Approval reason</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>disp_pd</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>印字用表示期限</td>
 *  	<td>Display expiration for print</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図部門ＣＤ</td>
 *  	<td>Order dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_inst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ指図部門ＣＤ</td>
 *  	<td>IF order dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図部門名</td>
 *  	<td>Order dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図担当者ＣＤ</td>
 *  	<td>Order PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_inst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ指図担当者ＣＤ</td>
 *  	<td>IF order PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図担当者名</td>
 *  	<td>Order PIC name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>abort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>打切ＦＬＧ</td>
 *  	<td>Cancel remaining flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_chg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計画変更ＦＬＧ</td>
 *  	<td>Plan changed flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_unit_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図単位区分</td>
 *  	<td>Mfg. order unit type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_rsrc</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程資源</td>
 *  	<td>Operation resources</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考（製造）</td>
 *  	<td>Internal remarks (Mfg.)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_inst_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図書備考（製造）</td>
 *  	<td>Order sheet remarks (Mfg.)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_po_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図・発注連絡備考</td>
 *  	<td>Order/PO contact remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_co_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ会社ＣＤ</td>
 *  	<td>IF company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>co_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社名</td>
 *  	<td>Company name</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_OPER_INST_SEND_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_OPER_INST_SEND_IF";

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
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	private static final MCPermColumnInfo _mfg_loc_nm = createColumnInfo("mfg_loc_nm");
	public final MCStringPermColumn mfg_loc_nm = createStringColumn(_mfg_loc_nm);
	
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
	 * 製造品名. Mfg. item name.<p>
	 *
	 */
	public static final String $mfg_itm_nm = "mfg_itm_nm";
	private static final MCPermColumnInfo _mfg_itm_nm = createColumnInfo("mfg_itm_nm");
	public final MCStringPermColumn mfg_itm_nm = createStringColumn(_mfg_itm_nm);
	
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
	 * 工程名. Operation name.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	private static final MCPermColumnInfo _oper_nm = createColumnInfo("oper_nm");
	public final MCStringPermColumn oper_nm = createStringColumn(_oper_nm);
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	private static final MCPermColumnInfo _oper_seq = createColumnInfo("oper_seq");
	public final MCNumberPermColumn oper_seq = createNumberColumn(_oper_seq);
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
	/**
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public static final String $st_schd_tm = "st_schd_tm";
	private static final MCPermColumnInfo _st_schd_tm = createColumnInfo("st_schd_tm");
	public final MCDatePermColumn st_schd_tm = createDateColumn(_st_schd_tm);
	
	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public static final String $end_schd_tm = "end_schd_tm";
	private static final MCPermColumnInfo _end_schd_tm = createColumnInfo("end_schd_tm");
	public final MCDatePermColumn end_schd_tm = createDateColumn(_end_schd_tm);
	
	/**
	 * 工程場所ＣＤ. Operation location cd..<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	private static final MCPermColumnInfo _oper_loc_cd = createColumnInfo("oper_loc_cd");
	public final MCStringPermColumn oper_loc_cd = createStringColumn(_oper_loc_cd);
	
	/**
	 * ＩＦ工程場所ＣＤ. IF operation location cd..<p>
	 *
	 */
	public static final String $if_oper_loc_cd = "if_oper_loc_cd";
	private static final MCPermColumnInfo _if_oper_loc_cd = createColumnInfo("if_oper_loc_cd");
	public final MCStringPermColumn if_oper_loc_cd = createStringColumn(_if_oper_loc_cd);
	
	/**
	 * 工程場所名. Operation location name.<p>
	 *
	 */
	public static final String $oper_loc_nm = "oper_loc_nm";
	private static final MCPermColumnInfo _oper_loc_nm = createColumnInfo("oper_loc_nm");
	public final MCStringPermColumn oper_loc_nm = createStringColumn(_oper_loc_nm);
	
	/**
	 * 工程棚・ラインＣＤ. Operation rack/line cd..<p>
	 *
	 */
	public static final String $oper_str_ln_cd = "oper_str_ln_cd";
	private static final MCPermColumnInfo _oper_str_ln_cd = createColumnInfo("oper_str_ln_cd");
	public final MCStringPermColumn oper_str_ln_cd = createStringColumn(_oper_str_ln_cd);
	
	/**
	 * ＩＦ工程棚・ラインＣＤ. IF operation rack/line cd..<p>
	 *
	 */
	public static final String $if_oper_str_ln_cd = "if_oper_str_ln_cd";
	private static final MCPermColumnInfo _if_oper_str_ln_cd = createColumnInfo("if_oper_str_ln_cd");
	public final MCStringPermColumn if_oper_str_ln_cd = createStringColumn(_if_oper_str_ln_cd);
	
	/**
	 * 工程棚・ライン名. Operation rack/line name.<p>
	 *
	 */
	public static final String $oper_str_ln_nm = "oper_str_ln_nm";
	private static final MCPermColumnInfo _oper_str_ln_nm = createColumnInfo("oper_str_ln_nm");
	public final MCStringPermColumn oper_str_ln_nm = createStringColumn(_oper_str_ln_nm);
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	private static final MCPermColumnInfo _base_unit_qty = createColumnInfo("base_unit_qty");
	public final MCNumberPermColumn base_unit_qty = createNumberColumn(_base_unit_qty);
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public static final String $oper_std_qty = "oper_std_qty";
	private static final MCPermColumnInfo _oper_std_qty = createColumnInfo("oper_std_qty");
	public final MCNumberPermColumn oper_std_qty = createNumberColumn(_oper_std_qty);
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public static final String $oper_conv_qty = "oper_conv_qty";
	private static final MCPermColumnInfo _oper_conv_qty = createColumnInfo("oper_conv_qty");
	public final MCNumberPermColumn oper_conv_qty = createNumberColumn(_oper_conv_qty);
	
	/**
	 * 工程単位数量. Operation unit qty..<p>
	 *
	 */
	public static final String $oper_unit_qty = "oper_unit_qty";
	private static final MCPermColumnInfo _oper_unit_qty = createColumnInfo("oper_unit_qty");
	public final MCNumberPermColumn oper_unit_qty = createNumberColumn(_oper_unit_qty);
	
	/**
	 * 工程単位ＣＤ. Operation unit cd..<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	private static final MCPermColumnInfo _oper_unit_cd = createColumnInfo("oper_unit_cd");
	public final MCStringPermColumn oper_unit_cd = createStringColumn(_oper_unit_cd);
	
	/**
	 * ＩＦ工程単位ＣＤ. IF operation unit cd..<p>
	 *
	 */
	public static final String $if_oper_unit_cd = "if_oper_unit_cd";
	private static final MCPermColumnInfo _if_oper_unit_cd = createColumnInfo("if_oper_unit_cd");
	public final MCStringPermColumn if_oper_unit_cd = createStringColumn(_if_oper_unit_cd);
	
	/**
	 * 工程単位名. Operation unit name.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	private static final MCPermColumnInfo _oper_unit_nm = createColumnInfo("oper_unit_nm");
	public final MCStringPermColumn oper_unit_nm = createStringColumn(_oper_unit_nm);
	
	/**
	 * 工程換算端数処理区分. Operation conversion rounding type.<p>
	 *
	 */
	public static final String $oper_unit_conv_rnd_typ = "oper_unit_conv_rnd_typ";
	private static final MCPermColumnInfo _oper_unit_conv_rnd_typ = createColumnInfo("oper_unit_conv_rnd_typ");
	public final MCStringPermColumn oper_unit_conv_rnd_typ = createStringColumn(_oper_unit_conv_rnd_typ);
	
	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public static final String $oper_unit_dec_place = "oper_unit_dec_place";
	private static final MCPermColumnInfo _oper_unit_dec_place = createColumnInfo("oper_unit_dec_place");
	public final MCNumberPermColumn oper_unit_dec_place = createNumberColumn(_oper_unit_dec_place);
	
	/**
	 * バックフラッシュ許可ＦＬＧ. Allow backflush flg..<p>
	 *
	 */
	public static final String $bkf_flg = "bkf_flg";
	private static final MCPermColumnInfo _bkf_flg = createColumnInfo("bkf_flg");
	public final MCBooleanPermColumn bkf_flg = createBooleanColumn(_bkf_flg);
	
	/**
	 * 自動工数計算ＦＬＧ. Auto man-hour calculation flg..<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	private static final MCPermColumnInfo _wk_cost_calc_flg = createColumnInfo("wk_cost_calc_flg");
	public final MCBooleanPermColumn wk_cost_calc_flg = createBooleanColumn(_wk_cost_calc_flg);
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	private static final MCPermColumnInfo _usr_cd = createColumnInfo("usr_cd");
	public final MCStringPermColumn usr_cd = createStringColumn(_usr_cd);
	
	/**
	 * ＩＦ担当者ＣＤ. IF PIC cd..<p>
	 *
	 */
	public static final String $if_usr_cd = "if_usr_cd";
	private static final MCPermColumnInfo _if_usr_cd = createColumnInfo("if_usr_cd");
	public final MCStringPermColumn if_usr_cd = createStringColumn(_if_usr_cd);
	
	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	private static final MCPermColumnInfo _usr_nm = createColumnInfo("usr_nm");
	public final MCStringPermColumn usr_nm = createStringColumn(_usr_nm);
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public static final String $oper_lower_yield = "oper_lower_yield";
	private static final MCPermColumnInfo _oper_lower_yield = createColumnInfo("oper_lower_yield");
	public final MCNumberPermColumn oper_lower_yield = createNumberColumn(_oper_lower_yield);
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public static final String $oper_std_yield = "oper_std_yield";
	private static final MCPermColumnInfo _oper_std_yield = createColumnInfo("oper_std_yield");
	public final MCNumberPermColumn oper_std_yield = createNumberColumn(_oper_std_yield);
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public static final String $oper_upper_yield = "oper_upper_yield";
	private static final MCPermColumnInfo _oper_upper_yield = createColumnInfo("oper_upper_yield");
	public final MCNumberPermColumn oper_upper_yield = createNumberColumn(_oper_upper_yield);
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public static final String $wip_rate = "wip_rate";
	private static final MCPermColumnInfo _wip_rate = createColumnInfo("wip_rate");
	public final MCNumberPermColumn wip_rate = createNumberColumn(_wip_rate);
	
	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public static final String $yield_oper_flg = "yield_oper_flg";
	private static final MCPermColumnInfo _yield_oper_flg = createColumnInfo("yield_oper_flg");
	public final MCBooleanPermColumn yield_oper_flg = createBooleanColumn(_yield_oper_flg);
	
	/**
	 * 内部備考（工程）. Internal remarks (Operation).<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 指図書備考（工程）. Order sheet remarks (Operation).<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
	private static final MCPermColumnInfo _inst_rpt_rmrks = createColumnInfo("inst_rpt_rmrks");
	public final MCStringPermColumn inst_rpt_rmrks = createStringColumn(_inst_rpt_rmrks);
	
	/**
	 * 製造状況区分（工程）. Mfg. status (Operation).<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	private static final MCPermColumnInfo _mfg_sts_typ = createColumnInfo("mfg_sts_typ");
	public final MCStringPermColumn mfg_sts_typ = createStringColumn(_mfg_sts_typ);
	
	/**
	 * 生産方法区分. Production method type.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
	private static final MCPermColumnInfo _mfg_mtd_typ = createColumnInfo("mfg_mtd_typ");
	public final MCStringPermColumn mfg_mtd_typ = createStringColumn(_mfg_mtd_typ);
	
	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	private static final MCPermColumnInfo _oper_ptn = createColumnInfo("oper_ptn");
	public final MCStringPermColumn oper_ptn = createStringColumn(_oper_ptn);
	
	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	private static final MCPermColumnInfo _bom_ptn = createColumnInfo("bom_ptn");
	public final MCStringPermColumn bom_ptn = createStringColumn(_bom_ptn);
	
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
	 * 格納先場所ＣＤ. Storage location cd..<p>
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
	 * 格納先場所名. Storage location name.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	private static final MCPermColumnInfo _strg_loc_nm = createColumnInfo("strg_loc_nm");
	public final MCStringPermColumn strg_loc_nm = createStringColumn(_strg_loc_nm);
	
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
	 * 格納棚・ライン名. Storage rack/line name.<p>
	 *
	 */
	public static final String $strg_str_ln_nm = "strg_str_ln_nm";
	private static final MCPermColumnInfo _strg_str_ln_nm = createColumnInfo("strg_str_ln_nm");
	public final MCStringPermColumn strg_str_ln_nm = createStringColumn(_strg_str_ln_nm);
	
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
	 * 製造棚・ライン名. Mfg. rack/line name.<p>
	 *
	 */
	public static final String $mfg_str_ln_nm = "mfg_str_ln_nm";
	private static final MCPermColumnInfo _mfg_str_ln_nm = createColumnInfo("mfg_str_ln_nm");
	public final MCStringPermColumn mfg_str_ln_nm = createStringColumn(_mfg_str_ln_nm);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * ＩＦワーキンググループＣＤ. IF working group cd..<p>
	 *
	 */
	public static final String $if_wg_cd = "if_wg_cd";
	private static final MCPermColumnInfo _if_wg_cd = createColumnInfo("if_wg_cd");
	public final MCStringPermColumn if_wg_cd = createStringColumn(_if_wg_cd);
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	private static final MCPermColumnInfo _wg_nm = createColumnInfo("wg_nm");
	public final MCStringPermColumn wg_nm = createStringColumn(_wg_nm);
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	private static final MCPermColumnInfo _site_cd = createColumnInfo("site_cd");
	public final MCStringPermColumn site_cd = createStringColumn(_site_cd);
	
	/**
	 * ＩＦ工場・物流倉庫ＣＤ. IF factory/distribution warehouse cd..<p>
	 *
	 */
	public static final String $if_site_cd = "if_site_cd";
	private static final MCPermColumnInfo _if_site_cd = createColumnInfo("if_site_cd");
	public final MCStringPermColumn if_site_cd = createStringColumn(_if_site_cd);
	
	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	private static final MCPermColumnInfo _site_nm = createColumnInfo("site_nm");
	public final MCStringPermColumn site_nm = createStringColumn(_site_nm);
	
	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public static final String $itm_lower_yield = "itm_lower_yield";
	private static final MCPermColumnInfo _itm_lower_yield = createColumnInfo("itm_lower_yield");
	public final MCNumberPermColumn itm_lower_yield = createNumberColumn(_itm_lower_yield);
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public static final String $itm_std_yield = "itm_std_yield";
	private static final MCPermColumnInfo _itm_std_yield = createColumnInfo("itm_std_yield");
	public final MCNumberPermColumn itm_std_yield = createNumberColumn(_itm_std_yield);
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public static final String $itm_upper_yield = "itm_upper_yield";
	private static final MCPermColumnInfo _itm_upper_yield = createColumnInfo("itm_upper_yield");
	public final MCNumberPermColumn itm_upper_yield = createNumberColumn(_itm_upper_yield);
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public static final String $base_unit_yield_qty = "base_unit_yield_qty";
	private static final MCPermColumnInfo _base_unit_yield_qty = createColumnInfo("base_unit_yield_qty");
	public final MCNumberPermColumn base_unit_yield_qty = createNumberColumn(_base_unit_yield_qty);
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public static final String $base_unit_inst_qty = "base_unit_inst_qty";
	private static final MCPermColumnInfo _base_unit_inst_qty = createColumnInfo("base_unit_inst_qty");
	public final MCNumberPermColumn base_unit_inst_qty = createNumberColumn(_base_unit_inst_qty);
	
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
	 * 指図日. Order date.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	private static final MCPermColumnInfo _inst_dt = createColumnInfo("inst_dt");
	public final MCDatePermColumn inst_dt = createDateColumn(_inst_dt);
	
	/**
	 * 指図書発行日時. Order sheet issued date and time.<p>
	 *
	 */
	public static final String $inst_prnt_tm = "inst_prnt_tm";
	private static final MCPermColumnInfo _inst_prnt_tm = createColumnInfo("inst_prnt_tm");
	public final MCDatePermColumn inst_prnt_tm = createDateColumn(_inst_prnt_tm);
	
	/**
	 * 指図書発行済ＦＬＧ. Order sheet issued flg..<p>
	 *
	 */
	public static final String $inst_prnt_flg = "inst_prnt_flg";
	private static final MCPermColumnInfo _inst_prnt_flg = createColumnInfo("inst_prnt_flg");
	public final MCBooleanPermColumn inst_prnt_flg = createBooleanColumn(_inst_prnt_flg);
	
	/**
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	private static final MCPermColumnInfo _aprv_flg = createColumnInfo("aprv_flg");
	public final MCBooleanPermColumn aprv_flg = createBooleanColumn(_aprv_flg);
	
	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	private static final MCPermColumnInfo _mfg_aprv_sts_typ = createColumnInfo("mfg_aprv_sts_typ");
	public final MCStringPermColumn mfg_aprv_sts_typ = createStringColumn(_mfg_aprv_sts_typ);
	
	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	private static final MCPermColumnInfo _aprv_dt = createColumnInfo("aprv_dt");
	public final MCDatePermColumn aprv_dt = createDateColumn(_aprv_dt);
	
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
	 * 印字用表示期限. Display expiration for print.<p>
	 *
	 */
	public static final String $disp_pd = "disp_pd";
	private static final MCPermColumnInfo _disp_pd = createColumnInfo("disp_pd");
	public final MCStringPermColumn disp_pd = createStringColumn(_disp_pd);
	
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
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	private static final MCPermColumnInfo _abort_flg = createColumnInfo("abort_flg");
	public final MCBooleanPermColumn abort_flg = createBooleanColumn(_abort_flg);
	
	/**
	 * 計画変更ＦＬＧ. Plan changed flg..<p>
	 *
	 */
	public static final String $schd_chg_flg = "schd_chg_flg";
	private static final MCPermColumnInfo _schd_chg_flg = createColumnInfo("schd_chg_flg");
	public final MCBooleanPermColumn schd_chg_flg = createBooleanColumn(_schd_chg_flg);
	
	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	private static final MCPermColumnInfo _mfg_inst_unit_typ = createColumnInfo("mfg_inst_unit_typ");
	public final MCStringPermColumn mfg_inst_unit_typ = createStringColumn(_mfg_inst_unit_typ);
	
	/**
	 * 工程資源. Operation resources.<p>
	 *
	 */
	public static final String $oper_rsrc = "oper_rsrc";
	private static final MCPermColumnInfo _oper_rsrc = createColumnInfo("oper_rsrc");
	public final MCStringPermColumn oper_rsrc = createStringColumn(_oper_rsrc);
	
	/**
	 * 内部備考（製造）. Internal remarks (Mfg.).<p>
	 *
	 */
	public static final String $mfg_intr_rmrks = "mfg_intr_rmrks";
	private static final MCPermColumnInfo _mfg_intr_rmrks = createColumnInfo("mfg_intr_rmrks");
	public final MCStringPermColumn mfg_intr_rmrks = createStringColumn(_mfg_intr_rmrks);
	
	/**
	 * 指図書備考（製造）. Order sheet remarks (Mfg.).<p>
	 *
	 */
	public static final String $mfg_inst_rpt_rmrks = "mfg_inst_rpt_rmrks";
	private static final MCPermColumnInfo _mfg_inst_rpt_rmrks = createColumnInfo("mfg_inst_rpt_rmrks");
	public final MCStringPermColumn mfg_inst_rpt_rmrks = createStringColumn(_mfg_inst_rpt_rmrks);
	
	/**
	 * 指図・発注連絡備考. Order/PO contact remarks.<p>
	 *
	 */
	public static final String $inst_po_cnt_rmrks = "inst_po_cnt_rmrks";
	private static final MCPermColumnInfo _inst_po_cnt_rmrks = createColumnInfo("inst_po_cnt_rmrks");
	public final MCStringPermColumn inst_po_cnt_rmrks = createStringColumn(_inst_po_cnt_rmrks);
	
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
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_mfg_loc_cd_META = createCommonMeta($if_mfg_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_itm_cd_META = createCommonMeta($mfg_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta mfg_itm_sub1_META = createCommonMeta($mfg_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta mfg_itm_sub2_META = createCommonMeta($mfg_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta mfg_itm_sub3_META = createCommonMeta($mfg_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_mfg_itm_cd_META = createCommonMeta($if_mfg_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_mfg_itm_sub1_META = createCommonMeta($if_mfg_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta if_mfg_itm_sub2_META = createCommonMeta($if_mfg_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta if_mfg_itm_sub3_META = createCommonMeta($if_mfg_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_itm_nm_META = createCommonMeta($mfg_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta if_oper_cd_META = createCommonMeta($if_oper_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_oper_loc_cd_META = createCommonMeta($if_oper_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta if_oper_str_ln_cd_META = createCommonMeta($if_oper_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta oper_str_ln_nm_META = createCommonMeta($oper_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_qty_META = createCommonMeta($oper_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_oper_unit_cd_META = createCommonMeta($if_oper_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_unit_conv_rnd_typ_META = createCommonMeta($oper_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta oper_unit_dec_place_META = createCommonMeta($oper_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta bkf_flg_META = createCommonMeta($bkf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_usr_cd_META = createCommonMeta($if_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta oper_lower_yield_META = createCommonMeta($oper_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_std_yield_META = createCommonMeta($oper_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_upper_yield_META = createCommonMeta($oper_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta wip_rate_META = createCommonMeta($wip_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_INTR_RMRKS);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_RPT_RMRKS);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_strg_loc_cd_META = createCommonMeta($if_strg_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta if_strg_str_ln_cd_META = createCommonMeta($if_strg_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta if_mfg_str_ln_cd_META = createCommonMeta($if_mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta mfg_str_ln_nm_META = createCommonMeta($mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta if_wg_cd_META = createCommonMeta($if_wg_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta if_site_cd_META = createCommonMeta($if_site_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta itm_lower_yield_META = createCommonMeta($itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_std_yield_META = createCommonMeta($itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_upper_yield_META = createCommonMeta($itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta base_unit_yield_qty_META = createCommonMeta($base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_inst_qty_META = createCommonMeta($base_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_base_unit_cd_META = createCommonMeta($if_base_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta mfg_st_schd_tm_META = createCommonMeta($mfg_st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta mfg_end_schd_tm_META = createCommonMeta($mfg_end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_prnt_tm_META = createCommonMeta($inst_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta inst_prnt_flg_META = createCommonMeta($inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_aprv_dpt_cd_META = createCommonMeta($if_aprv_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta aprv_dpt_nm_META = createCommonMeta($aprv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_aprv_usr_cd_META = createCommonMeta($if_aprv_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.APRV_RSN);
	public static final MCMeta disp_pd_META = createCommonMeta($disp_pd, mcframe.commonMS.meta.MS_META.DISP_PD);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_inst_dpt_cd_META = createCommonMeta($if_inst_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_inst_usr_cd_META = createCommonMeta($if_inst_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_chg_flg_META = createCommonMeta($schd_chg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta oper_rsrc_META = createCommonMeta($oper_rsrc, mcframe.commonMA.meta.MA_META.OPER_RSRC);
	public static final MCMeta mfg_intr_rmrks_META = createCommonMeta($mfg_intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_INTR_RMRKS);
	public static final MCMeta mfg_inst_rpt_rmrks_META = createCommonMeta($mfg_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_RPT_RMRKS);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
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
					MST_OPER_INST_SEND_IF_R own = MST_OPER_INST_SEND_IF_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_OPER_INST_SEND_IF_R> constMetas = new ConstMetaList<MST_OPER_INST_SEND_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			oper_inst_no_META,
			mfg_inst_no_META,
			mfg_inst_rev_META,
			mfg_loc_cd_META,
			if_mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_itm_cd_META,
			mfg_itm_sub1_META,
			mfg_itm_sub2_META,
			mfg_itm_sub3_META,
			if_mfg_itm_cd_META,
			if_mfg_itm_sub1_META,
			if_mfg_itm_sub2_META,
			if_mfg_itm_sub3_META,
			mfg_itm_nm_META,
			oper_cd_META,
			if_oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			disp_seq_META,
			st_schd_tm_META,
			end_schd_tm_META,
			oper_loc_cd_META,
			if_oper_loc_cd_META,
			oper_loc_nm_META,
			oper_str_ln_cd_META,
			if_oper_str_ln_cd_META,
			oper_str_ln_nm_META,
			base_unit_qty_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			oper_unit_qty_META,
			oper_unit_cd_META,
			if_oper_unit_cd_META,
			oper_unit_nm_META,
			oper_unit_conv_rnd_typ_META,
			oper_unit_dec_place_META,
			bkf_flg_META,
			wk_cost_calc_flg_META,
			usr_cd_META,
			if_usr_cd_META,
			usr_nm_META,
			oper_lower_yield_META,
			oper_std_yield_META,
			oper_upper_yield_META,
			wip_rate_META,
			yield_oper_flg_META,
			intr_rmrks_META,
			inst_rpt_rmrks_META,
			mfg_sts_typ_META,
			mfg_mtd_typ_META,
			oper_ptn_META,
			bom_ptn_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			strg_loc_cd_META,
			if_strg_loc_cd_META,
			strg_loc_nm_META,
			strg_str_ln_cd_META,
			if_strg_str_ln_cd_META,
			strg_str_ln_nm_META,
			mfg_str_ln_cd_META,
			if_mfg_str_ln_cd_META,
			mfg_str_ln_nm_META,
			wg_cd_META,
			if_wg_cd_META,
			wg_nm_META,
			site_cd_META,
			if_site_cd_META,
			site_nm_META,
			itm_lower_yield_META,
			itm_std_yield_META,
			itm_upper_yield_META,
			base_unit_yield_qty_META,
			base_unit_inst_qty_META,
			base_unit_cd_META,
			if_base_unit_cd_META,
			base_unit_nm_META,
			mfg_st_schd_tm_META,
			mfg_end_schd_tm_META,
			inst_dt_META,
			inst_prnt_tm_META,
			inst_prnt_flg_META,
			aprv_flg_META,
			mfg_aprv_sts_typ_META,
			aprv_dt_META,
			aprv_dpt_cd_META,
			if_aprv_dpt_cd_META,
			aprv_dpt_nm_META,
			aprv_usr_cd_META,
			if_aprv_usr_cd_META,
			aprv_usr_nm_META,
			aprv_rsn_META,
			disp_pd_META,
			inst_dpt_cd_META,
			if_inst_dpt_cd_META,
			inst_dpt_nm_META,
			inst_usr_cd_META,
			if_inst_usr_cd_META,
			inst_usr_nm_META,
			abort_flg_META,
			schd_chg_flg_META,
			mfg_inst_unit_typ_META,
			oper_rsrc_META,
			mfg_intr_rmrks_META,
			mfg_inst_rpt_rmrks_META,
			inst_po_cnt_rmrks_META,
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
	protected MST_OPER_INST_SEND_IF_R(ConstMetaList<? extends MST_OPER_INST_SEND_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_OPER_INST_SEND_IF_R(ConstMetaList<? extends MST_OPER_INST_SEND_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$data_lno,
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
			MST_OPER_INST_SEND_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$data_no,
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
			MST_OPER_INST_SEND_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$exe_sts_typ,
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
			MST_OPER_INST_SEND_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$data_crud_typ,
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
			MST_OPER_INST_SEND_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$ext_sys_cd,
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
			MST_OPER_INST_SEND_IF_R.$oper_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_inst_no,
				"oper_inst_no",
				oper_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_inst_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$mfg_inst_rev,
				"mfg_inst_rev",
				mfg_inst_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_loc_cd,
				"mfg_loc_cd",
				mfg_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$if_mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_mfg_loc_cd,
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
			MST_OPER_INST_SEND_IF_R.$mfg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_loc_nm,
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
			MST_OPER_INST_SEND_IF_R.$mfg_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_itm_cd,
				"mfg_itm_cd",
				mfg_itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_itm_sub1,
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
			MST_OPER_INST_SEND_IF_R.$mfg_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_itm_sub2,
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
			MST_OPER_INST_SEND_IF_R.$mfg_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_itm_sub3,
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
			MST_OPER_INST_SEND_IF_R.$if_mfg_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_mfg_itm_cd,
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
			MST_OPER_INST_SEND_IF_R.$if_mfg_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_mfg_itm_sub1,
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
			MST_OPER_INST_SEND_IF_R.$if_mfg_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_mfg_itm_sub2,
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
			MST_OPER_INST_SEND_IF_R.$if_mfg_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_mfg_itm_sub3,
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
			MST_OPER_INST_SEND_IF_R.$mfg_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_itm_nm,
				"mfg_itm_nm",
				mfg_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_cd,
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
			MST_OPER_INST_SEND_IF_R.$if_oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_oper_cd,
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
			MST_OPER_INST_SEND_IF_R.$oper_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_nm,
				"oper_nm",
				oper_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$oper_seq,
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
			MST_OPER_INST_SEND_IF_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$disp_seq,
				"disp_seq",
				disp_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$st_schd_tm,
				"st_schd_tm",
				st_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$end_schd_tm,
				"end_schd_tm",
				end_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_loc_cd,
				"oper_loc_cd",
				oper_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$if_oper_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_oper_loc_cd,
				"if_oper_loc_cd",
				if_oper_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_loc_nm,
				"oper_loc_nm",
				oper_loc_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_str_ln_cd,
				"oper_str_ln_cd",
				oper_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$if_oper_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_oper_str_ln_cd,
				"if_oper_str_ln_cd",
				if_oper_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_str_ln_nm,
				"oper_str_ln_nm",
				oper_str_ln_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$base_unit_qty,
				"base_unit_qty",
				base_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$oper_std_qty,
				"oper_std_qty",
				oper_std_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_conv_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$oper_conv_qty,
				"oper_conv_qty",
				oper_conv_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$oper_unit_qty,
				"oper_unit_qty",
				oper_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_unit_cd,
				"oper_unit_cd",
				oper_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$if_oper_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_oper_unit_cd,
				"if_oper_unit_cd",
				if_oper_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_unit_nm,
				"oper_unit_nm",
				oper_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_unit_conv_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_unit_conv_rnd_typ,
				"oper_unit_conv_rnd_typ",
				oper_unit_conv_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_unit_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$oper_unit_dec_place,
				"oper_unit_dec_place",
				oper_unit_dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$bkf_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_OPER_INST_SEND_IF_R.$bkf_flg,
				"bkf_flg",
				bkf_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$wk_cost_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_OPER_INST_SEND_IF_R.$wk_cost_calc_flg,
				"wk_cost_calc_flg",
				wk_cost_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$usr_cd,
				"usr_cd",
				usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$if_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_usr_cd,
				"if_usr_cd",
				if_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$usr_nm,
				"usr_nm",
				usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_lower_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$oper_lower_yield,
				"oper_lower_yield",
				oper_lower_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_std_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$oper_std_yield,
				"oper_std_yield",
				oper_std_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_upper_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$oper_upper_yield,
				"oper_upper_yield",
				oper_upper_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$wip_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$wip_rate,
				"wip_rate",
				wip_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$yield_oper_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_OPER_INST_SEND_IF_R.$yield_oper_flg,
				"yield_oper_flg",
				yield_oper_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$intr_rmrks,
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
			MST_OPER_INST_SEND_IF_R.$inst_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$inst_rpt_rmrks,
				"inst_rpt_rmrks",
				inst_rpt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_sts_typ,
				"mfg_sts_typ",
				mfg_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_mtd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_mtd_typ,
				"mfg_mtd_typ",
				mfg_mtd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_ptn,
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
			MST_OPER_INST_SEND_IF_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$bom_ptn,
				"bom_ptn",
				bom_ptn,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$lot_no,
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
			MST_OPER_INST_SEND_IF_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sublot_no,
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
			MST_OPER_INST_SEND_IF_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sno1,
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
			MST_OPER_INST_SEND_IF_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sno2,
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
			MST_OPER_INST_SEND_IF_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sno3,
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
			MST_OPER_INST_SEND_IF_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sno4,
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
			MST_OPER_INST_SEND_IF_R.$strg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$strg_loc_cd,
				"strg_loc_cd",
				strg_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$if_strg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_strg_loc_cd,
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
			MST_OPER_INST_SEND_IF_R.$strg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$strg_loc_nm,
				"strg_loc_nm",
				strg_loc_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$strg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$strg_str_ln_cd,
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
			MST_OPER_INST_SEND_IF_R.$if_strg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_strg_str_ln_cd,
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
			MST_OPER_INST_SEND_IF_R.$strg_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$strg_str_ln_nm,
				"strg_str_ln_nm",
				strg_str_ln_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_str_ln_cd,
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
			MST_OPER_INST_SEND_IF_R.$if_mfg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_mfg_str_ln_cd,
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
			MST_OPER_INST_SEND_IF_R.$mfg_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_str_ln_nm,
				"mfg_str_ln_nm",
				mfg_str_ln_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$wg_cd,
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
			MST_OPER_INST_SEND_IF_R.$if_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_wg_cd,
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
			MST_OPER_INST_SEND_IF_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$wg_nm,
				"wg_nm",
				wg_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$site_cd,
				"site_cd",
				site_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$if_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_site_cd,
				"if_site_cd",
				if_site_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$site_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$site_nm,
				"site_nm",
				site_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$itm_lower_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$itm_lower_yield,
				"itm_lower_yield",
				itm_lower_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$itm_std_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$itm_std_yield,
				"itm_std_yield",
				itm_std_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$itm_upper_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$itm_upper_yield,
				"itm_upper_yield",
				itm_upper_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$base_unit_yield_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$base_unit_yield_qty,
				"base_unit_yield_qty",
				base_unit_yield_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$base_unit_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$base_unit_inst_qty,
				"base_unit_inst_qty",
				base_unit_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$base_unit_cd,
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
			MST_OPER_INST_SEND_IF_R.$if_base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_base_unit_cd,
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
			MST_OPER_INST_SEND_IF_R.$base_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$base_unit_nm,
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
			MST_OPER_INST_SEND_IF_R.$mfg_st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$mfg_st_schd_tm,
				"mfg_st_schd_tm",
				mfg_st_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$mfg_end_schd_tm,
				"mfg_end_schd_tm",
				mfg_end_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$inst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$inst_dt,
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
			MST_OPER_INST_SEND_IF_R.$inst_prnt_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$inst_prnt_tm,
				"inst_prnt_tm",
				inst_prnt_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$inst_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_OPER_INST_SEND_IF_R.$inst_prnt_flg,
				"inst_prnt_flg",
				inst_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_OPER_INST_SEND_IF_R.$aprv_flg,
				"aprv_flg",
				aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_aprv_sts_typ,
				"mfg_aprv_sts_typ",
				mfg_aprv_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$aprv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$aprv_dt,
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
			MST_OPER_INST_SEND_IF_R.$aprv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$aprv_dpt_cd,
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
			MST_OPER_INST_SEND_IF_R.$if_aprv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_aprv_dpt_cd,
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
			MST_OPER_INST_SEND_IF_R.$aprv_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$aprv_dpt_nm,
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
			MST_OPER_INST_SEND_IF_R.$aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$aprv_usr_cd,
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
			MST_OPER_INST_SEND_IF_R.$if_aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_aprv_usr_cd,
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
			MST_OPER_INST_SEND_IF_R.$aprv_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$aprv_usr_nm,
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
			MST_OPER_INST_SEND_IF_R.$aprv_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$aprv_rsn,
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
			MST_OPER_INST_SEND_IF_R.$disp_pd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$disp_pd,
				"disp_pd",
				disp_pd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$inst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$inst_dpt_cd,
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
			MST_OPER_INST_SEND_IF_R.$if_inst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_inst_dpt_cd,
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
			MST_OPER_INST_SEND_IF_R.$inst_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$inst_dpt_nm,
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
			MST_OPER_INST_SEND_IF_R.$inst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$inst_usr_cd,
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
			MST_OPER_INST_SEND_IF_R.$if_inst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_inst_usr_cd,
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
			MST_OPER_INST_SEND_IF_R.$inst_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$inst_usr_nm,
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
			MST_OPER_INST_SEND_IF_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_OPER_INST_SEND_IF_R.$abort_flg,
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
			MST_OPER_INST_SEND_IF_R.$schd_chg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_OPER_INST_SEND_IF_R.$schd_chg_flg,
				"schd_chg_flg",
				schd_chg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_inst_unit_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_inst_unit_typ,
				"mfg_inst_unit_typ",
				mfg_inst_unit_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$oper_rsrc,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$oper_rsrc,
				"oper_rsrc",
				oper_rsrc,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_intr_rmrks,
				"mfg_intr_rmrks",
				mfg_intr_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$mfg_inst_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$mfg_inst_rpt_rmrks,
				"mfg_inst_rpt_rmrks",
				mfg_inst_rpt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$inst_po_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$inst_po_cnt_rmrks,
				"inst_po_cnt_rmrks",
				inst_po_cnt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_INST_SEND_IF_R.$if_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$if_co_cd,
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
			MST_OPER_INST_SEND_IF_R.$co_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$co_nm,
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
			MST_OPER_INST_SEND_IF_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char1,
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
			MST_OPER_INST_SEND_IF_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char2,
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
			MST_OPER_INST_SEND_IF_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char3,
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
			MST_OPER_INST_SEND_IF_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char4,
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
			MST_OPER_INST_SEND_IF_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char5,
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
			MST_OPER_INST_SEND_IF_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char6,
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
			MST_OPER_INST_SEND_IF_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char7,
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
			MST_OPER_INST_SEND_IF_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char8,
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
			MST_OPER_INST_SEND_IF_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char9,
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
			MST_OPER_INST_SEND_IF_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char10,
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
			MST_OPER_INST_SEND_IF_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char11,
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
			MST_OPER_INST_SEND_IF_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char12,
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
			MST_OPER_INST_SEND_IF_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char13,
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
			MST_OPER_INST_SEND_IF_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char14,
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
			MST_OPER_INST_SEND_IF_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char15,
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
			MST_OPER_INST_SEND_IF_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char16,
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
			MST_OPER_INST_SEND_IF_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char17,
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
			MST_OPER_INST_SEND_IF_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char18,
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
			MST_OPER_INST_SEND_IF_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char19,
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
			MST_OPER_INST_SEND_IF_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char20,
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
			MST_OPER_INST_SEND_IF_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char21,
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
			MST_OPER_INST_SEND_IF_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char22,
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
			MST_OPER_INST_SEND_IF_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char23,
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
			MST_OPER_INST_SEND_IF_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char24,
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
			MST_OPER_INST_SEND_IF_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char25,
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
			MST_OPER_INST_SEND_IF_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char26,
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
			MST_OPER_INST_SEND_IF_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char27,
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
			MST_OPER_INST_SEND_IF_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char28,
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
			MST_OPER_INST_SEND_IF_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char29,
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
			MST_OPER_INST_SEND_IF_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sub_char30,
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
			MST_OPER_INST_SEND_IF_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$sub_num1,
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
			MST_OPER_INST_SEND_IF_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$sub_num2,
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
			MST_OPER_INST_SEND_IF_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$sub_num3,
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
			MST_OPER_INST_SEND_IF_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$sub_num4,
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
			MST_OPER_INST_SEND_IF_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$sub_num5,
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
			MST_OPER_INST_SEND_IF_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$sub_dt1,
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
			MST_OPER_INST_SEND_IF_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$sub_dt2,
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
			MST_OPER_INST_SEND_IF_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$sub_dt3,
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
			MST_OPER_INST_SEND_IF_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$sub_dt4,
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
			MST_OPER_INST_SEND_IF_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_INST_SEND_IF_R.$sub_dt5,
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
			MST_OPER_INST_SEND_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$batch_log_no,
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
			MST_OPER_INST_SEND_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$log_sub_key1,
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
			MST_OPER_INST_SEND_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$log_sub_key2,
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
			MST_OPER_INST_SEND_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$ins_usr_id,
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
			MST_OPER_INST_SEND_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$ins_usr_nm,
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
			MST_OPER_INST_SEND_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_OPER_INST_SEND_IF_R.$ins_ts,
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
			MST_OPER_INST_SEND_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$ins_func_id,
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
			MST_OPER_INST_SEND_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_INST_SEND_IF_R.$upd_cntr,
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
			MST_OPER_INST_SEND_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$upd_usr_id,
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
			MST_OPER_INST_SEND_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$upd_usr_nm,
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
			MST_OPER_INST_SEND_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_OPER_INST_SEND_IF_R.$upd_ts,
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
			MST_OPER_INST_SEND_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$upd_func_id,
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
			MST_OPER_INST_SEND_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$upd_srv_req_no,
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
			MST_OPER_INST_SEND_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_INST_SEND_IF_R.$sdrv_sts_typ,
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
	public static MST_OPER_INST_SEND_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_OPER_INST_SEND_IF_R create(String alias) {
		MST_OPER_INST_SEND_IF_R row = new MST_OPER_INST_SEND_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_OPER_INST_SEND_IF_R createByName(T proto) {
		MST_OPER_INST_SEND_IF_R row = MST_OPER_INST_SEND_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_OPER_INST_SEND_IF_R clone() {
		return (MST_OPER_INST_SEND_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_OPER_INST_SEND_IF_R createInstance() {
		return (MST_OPER_INST_SEND_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_OPER_INST_SEND_IF_R getValues(String... names) {
		return (MST_OPER_INST_SEND_IF_R) super.getValues(names);
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
	 public MSW_OPER_INST_SEND_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_OPER_INST_SEND_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_OPER_INST_SEND_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_OPER_INST_SEND_IF_KEY_R.TABLE_NAME);
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
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 5, $oper_inst_no);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 5, $oper_inst_no, value);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 6, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 6, $mfg_inst_no, value);
	}

	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 7, $mfg_inst_rev);
	}

	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 7, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 7, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 7, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 7, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 7, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 8, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 8, $mfg_loc_cd, value);
	}

	/**
	 * ＩＦ製造場所. IF mfg. location.<p>
	 *
	 */
	public String if_mfg_loc_cd() {
		return getConstString(offset + 9, $if_mfg_loc_cd);
	}

	/**
	 * ＩＦ製造場所. IF mfg. location.<p>
	 *
	 */
	public void if_mfg_loc_cd(String value) {
		setConstString(offset + 9, $if_mfg_loc_cd, value);
	}

	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 10, $mfg_loc_nm);
	}

	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 10, $mfg_loc_nm, value);
	}

	/**
	 * 製造品目. Mfg. item.<p>
	 *
	 */
	public String mfg_itm_cd() {
		return getConstString(offset + 11, $mfg_itm_cd);
	}

	/**
	 * 製造品目. Mfg. item.<p>
	 *
	 */
	public void mfg_itm_cd(String value) {
		setConstString(offset + 11, $mfg_itm_cd, value);
	}

	/**
	 * 製造枝番１. Mfg. branch No. 1.<p>
	 *
	 */
	public String mfg_itm_sub1() {
		return getConstString(offset + 12, $mfg_itm_sub1);
	}

	/**
	 * 製造枝番１. Mfg. branch No. 1.<p>
	 *
	 */
	public void mfg_itm_sub1(String value) {
		setConstString(offset + 12, $mfg_itm_sub1, value);
	}

	/**
	 * 製造枝番２. Mfg. branch No. 2.<p>
	 *
	 */
	public String mfg_itm_sub2() {
		return getConstString(offset + 13, $mfg_itm_sub2);
	}

	/**
	 * 製造枝番２. Mfg. branch No. 2.<p>
	 *
	 */
	public void mfg_itm_sub2(String value) {
		setConstString(offset + 13, $mfg_itm_sub2, value);
	}

	/**
	 * 製造枝番３. Mfg. branch No. 3.<p>
	 *
	 */
	public String mfg_itm_sub3() {
		return getConstString(offset + 14, $mfg_itm_sub3);
	}

	/**
	 * 製造枝番３. Mfg. branch No. 3.<p>
	 *
	 */
	public void mfg_itm_sub3(String value) {
		setConstString(offset + 14, $mfg_itm_sub3, value);
	}

	/**
	 * ＩＦ製造品目. IF mfg. item.<p>
	 *
	 */
	public String if_mfg_itm_cd() {
		return getConstString(offset + 15, $if_mfg_itm_cd);
	}

	/**
	 * ＩＦ製造品目. IF mfg. item.<p>
	 *
	 */
	public void if_mfg_itm_cd(String value) {
		setConstString(offset + 15, $if_mfg_itm_cd, value);
	}

	/**
	 * ＩＦ製造枝番１. IF mfg. branch No. 1.<p>
	 *
	 */
	public String if_mfg_itm_sub1() {
		return getConstString(offset + 16, $if_mfg_itm_sub1);
	}

	/**
	 * ＩＦ製造枝番１. IF mfg. branch No. 1.<p>
	 *
	 */
	public void if_mfg_itm_sub1(String value) {
		setConstString(offset + 16, $if_mfg_itm_sub1, value);
	}

	/**
	 * ＩＦ製造枝番２. IF mfg. branch No. 2.<p>
	 *
	 */
	public String if_mfg_itm_sub2() {
		return getConstString(offset + 17, $if_mfg_itm_sub2);
	}

	/**
	 * ＩＦ製造枝番２. IF mfg. branch No. 2.<p>
	 *
	 */
	public void if_mfg_itm_sub2(String value) {
		setConstString(offset + 17, $if_mfg_itm_sub2, value);
	}

	/**
	 * ＩＦ製造枝番３. IF mfg. branch No. 3.<p>
	 *
	 */
	public String if_mfg_itm_sub3() {
		return getConstString(offset + 18, $if_mfg_itm_sub3);
	}

	/**
	 * ＩＦ製造枝番３. IF mfg. branch No. 3.<p>
	 *
	 */
	public void if_mfg_itm_sub3(String value) {
		setConstString(offset + 18, $if_mfg_itm_sub3, value);
	}

	/**
	 * 製造品名. Mfg. item name.<p>
	 *
	 */
	public String mfg_itm_nm() {
		return getConstString(offset + 19, $mfg_itm_nm);
	}

	/**
	 * 製造品名. Mfg. item name.<p>
	 *
	 */
	public void mfg_itm_nm(String value) {
		setConstString(offset + 19, $mfg_itm_nm, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 20, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 20, $oper_cd, value);
	}

	/**
	 * ＩＦ工程ＣＤ. IF operation cd..<p>
	 *
	 */
	public String if_oper_cd() {
		return getConstString(offset + 21, $if_oper_cd);
	}

	/**
	 * ＩＦ工程ＣＤ. IF operation cd..<p>
	 *
	 */
	public void if_oper_cd(String value) {
		setConstString(offset + 21, $if_oper_cd, value);
	}

	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 22, $oper_nm);
	}

	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 22, $oper_nm, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 23, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 23, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 23, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 23, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 23, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 23, $oper_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 24, $disp_seq);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 24, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 24, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 24, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 24, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 24, $disp_seq, value);
	}
	
	/**
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 25, $st_schd_tm);
	}

	/**
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 25, $st_schd_tm, value);
	}

	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 26, $end_schd_tm);
	}

	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 26, $end_schd_tm, value);
	}

	/**
	 * 工程場所ＣＤ. Operation location cd..<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 27, $oper_loc_cd);
	}

	/**
	 * 工程場所ＣＤ. Operation location cd..<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 27, $oper_loc_cd, value);
	}

	/**
	 * ＩＦ工程場所ＣＤ. IF operation location cd..<p>
	 *
	 */
	public String if_oper_loc_cd() {
		return getConstString(offset + 28, $if_oper_loc_cd);
	}

	/**
	 * ＩＦ工程場所ＣＤ. IF operation location cd..<p>
	 *
	 */
	public void if_oper_loc_cd(String value) {
		setConstString(offset + 28, $if_oper_loc_cd, value);
	}

	/**
	 * 工程場所名. Operation location name.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 29, $oper_loc_nm);
	}

	/**
	 * 工程場所名. Operation location name.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 29, $oper_loc_nm, value);
	}

	/**
	 * 工程棚・ラインＣＤ. Operation rack/line cd..<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 30, $oper_str_ln_cd);
	}

	/**
	 * 工程棚・ラインＣＤ. Operation rack/line cd..<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 30, $oper_str_ln_cd, value);
	}

	/**
	 * ＩＦ工程棚・ラインＣＤ. IF operation rack/line cd..<p>
	 *
	 */
	public String if_oper_str_ln_cd() {
		return getConstString(offset + 31, $if_oper_str_ln_cd);
	}

	/**
	 * ＩＦ工程棚・ラインＣＤ. IF operation rack/line cd..<p>
	 *
	 */
	public void if_oper_str_ln_cd(String value) {
		setConstString(offset + 31, $if_oper_str_ln_cd, value);
	}

	/**
	 * 工程棚・ライン名. Operation rack/line name.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return getConstString(offset + 32, $oper_str_ln_nm);
	}

	/**
	 * 工程棚・ライン名. Operation rack/line name.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		setConstString(offset + 32, $oper_str_ln_nm, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 33, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 33, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 33, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 33, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 33, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 33, $base_unit_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 34, $oper_std_qty);
	}

	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 34, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 34, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 34, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 34, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 34, $oper_std_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 35, $oper_conv_qty);
	}

	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 35, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 35, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 35, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 35, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 35, $oper_conv_qty, value);
	}
	
	/**
	 * 工程単位数量. Operation unit qty..<p>
	 *
	 */
	public MCNumber oper_unit_qty() {
		return getConstNumber(offset + 36, $oper_unit_qty);
	}

	/**
	 * 工程単位数量. Operation unit qty..<p>
	 *
	 */
	public void oper_unit_qty(MCNumber value) {
		setConstNumber(offset + 36, $oper_unit_qty, value);
	}
	
	/**
	 * 工程単位数量. Operation unit qty..<p>
	 *
	 */
	public void oper_unit_qty(int value) {
		setConstNumber(offset + 36, $oper_unit_qty, value);
	}
	
	/**
	 * 工程単位数量. Operation unit qty..<p>
	 *
	 */
	public void oper_unit_qty(long value) {
		setConstNumber(offset + 36, $oper_unit_qty, value);
	}
	
	/**
	 * 工程単位数量. Operation unit qty..<p>
	 *
	 */
	public void oper_unit_qty(float value) {
		setConstNumber(offset + 36, $oper_unit_qty, value);
	}
	
	/**
	 * 工程単位数量. Operation unit qty..<p>
	 *
	 */
	public void oper_unit_qty(double value) {
		setConstNumber(offset + 36, $oper_unit_qty, value);
	}
	
	/**
	 * 工程単位ＣＤ. Operation unit cd..<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 37, $oper_unit_cd);
	}

	/**
	 * 工程単位ＣＤ. Operation unit cd..<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 37, $oper_unit_cd, value);
	}

	/**
	 * ＩＦ工程単位ＣＤ. IF operation unit cd..<p>
	 *
	 */
	public String if_oper_unit_cd() {
		return getConstString(offset + 38, $if_oper_unit_cd);
	}

	/**
	 * ＩＦ工程単位ＣＤ. IF operation unit cd..<p>
	 *
	 */
	public void if_oper_unit_cd(String value) {
		setConstString(offset + 38, $if_oper_unit_cd, value);
	}

	/**
	 * 工程単位名. Operation unit name.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 39, $oper_unit_nm);
	}

	/**
	 * 工程単位名. Operation unit name.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 39, $oper_unit_nm, value);
	}

	/**
	 * 工程換算端数処理区分. Operation conversion rounding type.<p>
	 *
	 */
	public String oper_unit_conv_rnd_typ() {
		return getConstString(offset + 40, $oper_unit_conv_rnd_typ);
	}

	/**
	 * 工程換算端数処理区分. Operation conversion rounding type.<p>
	 *
	 */
	public void oper_unit_conv_rnd_typ(String value) {
		setConstString(offset + 40, $oper_unit_conv_rnd_typ, value);
	}

	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public MCNumber oper_unit_dec_place() {
		return getConstNumber(offset + 41, $oper_unit_dec_place);
	}

	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public void oper_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 41, $oper_unit_dec_place, value);
	}
	
	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public void oper_unit_dec_place(int value) {
		setConstNumber(offset + 41, $oper_unit_dec_place, value);
	}
	
	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public void oper_unit_dec_place(long value) {
		setConstNumber(offset + 41, $oper_unit_dec_place, value);
	}
	
	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public void oper_unit_dec_place(float value) {
		setConstNumber(offset + 41, $oper_unit_dec_place, value);
	}
	
	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public void oper_unit_dec_place(double value) {
		setConstNumber(offset + 41, $oper_unit_dec_place, value);
	}
	
	/**
	 * バックフラッシュ許可ＦＬＧ. Allow backflush flg..<p>
	 *
	 */
	public boolean bkf_flg() {
		return getConstBoolean(offset + 42, $bkf_flg);
	}

	/**
	 * バックフラッシュ許可ＦＬＧ. Allow backflush flg..<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		setConstBoolean(offset + 42, $bkf_flg, value);
	}

	/**
	 * 自動工数計算ＦＬＧ. Auto man-hour calculation flg..<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 43, $wk_cost_calc_flg);
	}

	/**
	 * 自動工数計算ＦＬＧ. Auto man-hour calculation flg..<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 43, $wk_cost_calc_flg, value);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 44, $usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 44, $usr_cd, value);
	}

	/**
	 * ＩＦ担当者ＣＤ. IF PIC cd..<p>
	 *
	 */
	public String if_usr_cd() {
		return getConstString(offset + 45, $if_usr_cd);
	}

	/**
	 * ＩＦ担当者ＣＤ. IF PIC cd..<p>
	 *
	 */
	public void if_usr_cd(String value) {
		setConstString(offset + 45, $if_usr_cd, value);
	}

	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 46, $usr_nm);
	}

	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 46, $usr_nm, value);
	}

	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return getConstNumber(offset + 47, $oper_lower_yield);
	}

	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		setConstNumber(offset + 47, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		setConstNumber(offset + 47, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		setConstNumber(offset + 47, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		setConstNumber(offset + 47, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		setConstNumber(offset + 47, $oper_lower_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return getConstNumber(offset + 48, $oper_std_yield);
	}

	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		setConstNumber(offset + 48, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		setConstNumber(offset + 48, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		setConstNumber(offset + 48, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		setConstNumber(offset + 48, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		setConstNumber(offset + 48, $oper_std_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return getConstNumber(offset + 49, $oper_upper_yield);
	}

	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		setConstNumber(offset + 49, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		setConstNumber(offset + 49, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		setConstNumber(offset + 49, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		setConstNumber(offset + 49, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		setConstNumber(offset + 49, $oper_upper_yield, value);
	}
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public MCNumber wip_rate() {
		return getConstNumber(offset + 50, $wip_rate);
	}

	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public void wip_rate(MCNumber value) {
		setConstNumber(offset + 50, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public void wip_rate(int value) {
		setConstNumber(offset + 50, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public void wip_rate(long value) {
		setConstNumber(offset + 50, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public void wip_rate(float value) {
		setConstNumber(offset + 50, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public void wip_rate(double value) {
		setConstNumber(offset + 50, $wip_rate, value);
	}
	
	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 51, $yield_oper_flg);
	}

	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 51, $yield_oper_flg, value);
	}

	/**
	 * 内部備考（工程）. Internal remarks (Operation).<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 52, $intr_rmrks);
	}

	/**
	 * 内部備考（工程）. Internal remarks (Operation).<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 52, $intr_rmrks, value);
	}

	/**
	 * 指図書備考（工程）. Order sheet remarks (Operation).<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 53, $inst_rpt_rmrks);
	}

	/**
	 * 指図書備考（工程）. Order sheet remarks (Operation).<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 53, $inst_rpt_rmrks, value);
	}

	/**
	 * 製造状況区分（工程）. Mfg. status (Operation).<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 54, $mfg_sts_typ);
	}

	/**
	 * 製造状況区分（工程）. Mfg. status (Operation).<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 54, $mfg_sts_typ, value);
	}

	/**
	 * 生産方法区分. Production method type.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 55, $mfg_mtd_typ);
	}

	/**
	 * 生産方法区分. Production method type.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 55, $mfg_mtd_typ, value);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 56, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 56, $oper_ptn, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 57, $bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 57, $bom_ptn, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 58, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 58, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 59, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 59, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 60, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 60, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 61, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 61, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 62, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 62, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 63, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 63, $sno4, value);
	}

	/**
	 * 格納先場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 64, $strg_loc_cd);
	}

	/**
	 * 格納先場所ＣＤ. Storage location cd..<p>
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
	 * 格納先場所名. Storage location name.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 66, $strg_loc_nm);
	}

	/**
	 * 格納先場所名. Storage location name.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 66, $strg_loc_nm, value);
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
	 * 格納棚・ライン名. Storage rack/line name.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 69, $strg_str_ln_nm);
	}

	/**
	 * 格納棚・ライン名. Storage rack/line name.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 69, $strg_str_ln_nm, value);
	}

	/**
	 * 製造棚・ラインＣＤ. Mfg. rack/line cd..<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 70, $mfg_str_ln_cd);
	}

	/**
	 * 製造棚・ラインＣＤ. Mfg. rack/line cd..<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 70, $mfg_str_ln_cd, value);
	}

	/**
	 * ＩＦ製造棚・ラインＣＤ. IF mfg. rack/line cd..<p>
	 *
	 */
	public String if_mfg_str_ln_cd() {
		return getConstString(offset + 71, $if_mfg_str_ln_cd);
	}

	/**
	 * ＩＦ製造棚・ラインＣＤ. IF mfg. rack/line cd..<p>
	 *
	 */
	public void if_mfg_str_ln_cd(String value) {
		setConstString(offset + 71, $if_mfg_str_ln_cd, value);
	}

	/**
	 * 製造棚・ライン名. Mfg. rack/line name.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 72, $mfg_str_ln_nm);
	}

	/**
	 * 製造棚・ライン名. Mfg. rack/line name.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 72, $mfg_str_ln_nm, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 73, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 73, $wg_cd, value);
	}

	/**
	 * ＩＦワーキンググループＣＤ. IF working group cd..<p>
	 *
	 */
	public String if_wg_cd() {
		return getConstString(offset + 74, $if_wg_cd);
	}

	/**
	 * ＩＦワーキンググループＣＤ. IF working group cd..<p>
	 *
	 */
	public void if_wg_cd(String value) {
		setConstString(offset + 74, $if_wg_cd, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 75, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 75, $wg_nm, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 76, $site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 76, $site_cd, value);
	}

	/**
	 * ＩＦ工場・物流倉庫ＣＤ. IF factory/distribution warehouse cd..<p>
	 *
	 */
	public String if_site_cd() {
		return getConstString(offset + 77, $if_site_cd);
	}

	/**
	 * ＩＦ工場・物流倉庫ＣＤ. IF factory/distribution warehouse cd..<p>
	 *
	 */
	public void if_site_cd(String value) {
		setConstString(offset + 77, $if_site_cd, value);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 78, $site_nm);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 78, $site_nm, value);
	}

	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return getConstNumber(offset + 79, $itm_lower_yield);
	}

	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 79, $itm_lower_yield, value);
	}
	
	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		setConstNumber(offset + 79, $itm_lower_yield, value);
	}
	
	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		setConstNumber(offset + 79, $itm_lower_yield, value);
	}
	
	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		setConstNumber(offset + 79, $itm_lower_yield, value);
	}
	
	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		setConstNumber(offset + 79, $itm_lower_yield, value);
	}
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return getConstNumber(offset + 80, $itm_std_yield);
	}

	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		setConstNumber(offset + 80, $itm_std_yield, value);
	}
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		setConstNumber(offset + 80, $itm_std_yield, value);
	}
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		setConstNumber(offset + 80, $itm_std_yield, value);
	}
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		setConstNumber(offset + 80, $itm_std_yield, value);
	}
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		setConstNumber(offset + 80, $itm_std_yield, value);
	}
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return getConstNumber(offset + 81, $itm_upper_yield);
	}

	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 81, $itm_upper_yield, value);
	}
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		setConstNumber(offset + 81, $itm_upper_yield, value);
	}
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		setConstNumber(offset + 81, $itm_upper_yield, value);
	}
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		setConstNumber(offset + 81, $itm_upper_yield, value);
	}
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		setConstNumber(offset + 81, $itm_upper_yield, value);
	}
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return getConstNumber(offset + 82, $base_unit_yield_qty);
	}

	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 82, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		setConstNumber(offset + 82, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		setConstNumber(offset + 82, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		setConstNumber(offset + 82, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		setConstNumber(offset + 82, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public MCNumber base_unit_inst_qty() {
		return getConstNumber(offset + 83, $base_unit_inst_qty);
	}

	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public void base_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 83, $base_unit_inst_qty, value);
	}
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public void base_unit_inst_qty(int value) {
		setConstNumber(offset + 83, $base_unit_inst_qty, value);
	}
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public void base_unit_inst_qty(long value) {
		setConstNumber(offset + 83, $base_unit_inst_qty, value);
	}
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public void base_unit_inst_qty(float value) {
		setConstNumber(offset + 83, $base_unit_inst_qty, value);
	}
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public void base_unit_inst_qty(double value) {
		setConstNumber(offset + 83, $base_unit_inst_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 84, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 84, $base_unit_cd, value);
	}

	/**
	 * ＩＦ基準単位ＣＤ. IF base unit cd..<p>
	 *
	 */
	public String if_base_unit_cd() {
		return getConstString(offset + 85, $if_base_unit_cd);
	}

	/**
	 * ＩＦ基準単位ＣＤ. IF base unit cd..<p>
	 *
	 */
	public void if_base_unit_cd(String value) {
		setConstString(offset + 85, $if_base_unit_cd, value);
	}

	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 86, $base_unit_nm);
	}

	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 86, $base_unit_nm, value);
	}

	/**
	 * 製造着手予定日時. Scheduled mfg. start date and time.<p>
	 *
	 */
	public MCDate mfg_st_schd_tm() {
		return getConstDate(offset + 87, $mfg_st_schd_tm);
	}

	/**
	 * 製造着手予定日時. Scheduled mfg. start date and time.<p>
	 *
	 */
	public void mfg_st_schd_tm(MCDate value) {
		setConstDate(offset + 87, $mfg_st_schd_tm, value);
	}

	/**
	 * 製造終了予定日時. Scheduled mfg. end date and time.<p>
	 *
	 */
	public MCDate mfg_end_schd_tm() {
		return getConstDate(offset + 88, $mfg_end_schd_tm);
	}

	/**
	 * 製造終了予定日時. Scheduled mfg. end date and time.<p>
	 *
	 */
	public void mfg_end_schd_tm(MCDate value) {
		setConstDate(offset + 88, $mfg_end_schd_tm, value);
	}

	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 89, $inst_dt);
	}

	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 89, $inst_dt, value);
	}

	/**
	 * 指図書発行日時. Order sheet issued date and time.<p>
	 *
	 */
	public MCDate inst_prnt_tm() {
		return getConstDate(offset + 90, $inst_prnt_tm);
	}

	/**
	 * 指図書発行日時. Order sheet issued date and time.<p>
	 *
	 */
	public void inst_prnt_tm(MCDate value) {
		setConstDate(offset + 90, $inst_prnt_tm, value);
	}

	/**
	 * 指図書発行済ＦＬＧ. Order sheet issued flg..<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return getConstBoolean(offset + 91, $inst_prnt_flg);
	}

	/**
	 * 指図書発行済ＦＬＧ. Order sheet issued flg..<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 91, $inst_prnt_flg, value);
	}

	/**
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 92, $aprv_flg);
	}

	/**
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 92, $aprv_flg, value);
	}

	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 93, $mfg_aprv_sts_typ);
	}

	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 93, $mfg_aprv_sts_typ, value);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 94, $aprv_dt);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 94, $aprv_dt, value);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 95, $aprv_dpt_cd);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 95, $aprv_dpt_cd, value);
	}

	/**
	 * ＩＦ承認部門ＣＤ. IF approval dept. cd..<p>
	 *
	 */
	public String if_aprv_dpt_cd() {
		return getConstString(offset + 96, $if_aprv_dpt_cd);
	}

	/**
	 * ＩＦ承認部門ＣＤ. IF approval dept. cd..<p>
	 *
	 */
	public void if_aprv_dpt_cd(String value) {
		setConstString(offset + 96, $if_aprv_dpt_cd, value);
	}

	/**
	 * 承認部門名. Approval dept. name.<p>
	 *
	 */
	public String aprv_dpt_nm() {
		return getConstString(offset + 97, $aprv_dpt_nm);
	}

	/**
	 * 承認部門名. Approval dept. name.<p>
	 *
	 */
	public void aprv_dpt_nm(String value) {
		setConstString(offset + 97, $aprv_dpt_nm, value);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 98, $aprv_usr_cd);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 98, $aprv_usr_cd, value);
	}

	/**
	 * ＩＦ承認者ＣＤ. IF approver cd..<p>
	 *
	 */
	public String if_aprv_usr_cd() {
		return getConstString(offset + 99, $if_aprv_usr_cd);
	}

	/**
	 * ＩＦ承認者ＣＤ. IF approver cd..<p>
	 *
	 */
	public void if_aprv_usr_cd(String value) {
		setConstString(offset + 99, $if_aprv_usr_cd, value);
	}

	/**
	 * 承認者名. Approver name.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return getConstString(offset + 100, $aprv_usr_nm);
	}

	/**
	 * 承認者名. Approver name.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		setConstString(offset + 100, $aprv_usr_nm, value);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 101, $aprv_rsn);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 101, $aprv_rsn, value);
	}

	/**
	 * 印字用表示期限. Display expiration for print.<p>
	 *
	 */
	public String disp_pd() {
		return getConstString(offset + 102, $disp_pd);
	}

	/**
	 * 印字用表示期限. Display expiration for print.<p>
	 *
	 */
	public void disp_pd(String value) {
		setConstString(offset + 102, $disp_pd, value);
	}

	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 103, $inst_dpt_cd);
	}

	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 103, $inst_dpt_cd, value);
	}

	/**
	 * ＩＦ指図部門ＣＤ. IF order dept. cd..<p>
	 *
	 */
	public String if_inst_dpt_cd() {
		return getConstString(offset + 104, $if_inst_dpt_cd);
	}

	/**
	 * ＩＦ指図部門ＣＤ. IF order dept. cd..<p>
	 *
	 */
	public void if_inst_dpt_cd(String value) {
		setConstString(offset + 104, $if_inst_dpt_cd, value);
	}

	/**
	 * 指図部門名. Order dept. name.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 105, $inst_dpt_nm);
	}

	/**
	 * 指図部門名. Order dept. name.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 105, $inst_dpt_nm, value);
	}

	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 106, $inst_usr_cd);
	}

	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 106, $inst_usr_cd, value);
	}

	/**
	 * ＩＦ指図担当者ＣＤ. IF order PIC cd..<p>
	 *
	 */
	public String if_inst_usr_cd() {
		return getConstString(offset + 107, $if_inst_usr_cd);
	}

	/**
	 * ＩＦ指図担当者ＣＤ. IF order PIC cd..<p>
	 *
	 */
	public void if_inst_usr_cd(String value) {
		setConstString(offset + 107, $if_inst_usr_cd, value);
	}

	/**
	 * 指図担当者名. Order PIC name.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 108, $inst_usr_nm);
	}

	/**
	 * 指図担当者名. Order PIC name.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 108, $inst_usr_nm, value);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 109, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 109, $abort_flg, value);
	}

	/**
	 * 計画変更ＦＬＧ. Plan changed flg..<p>
	 *
	 */
	public boolean schd_chg_flg() {
		return getConstBoolean(offset + 110, $schd_chg_flg);
	}

	/**
	 * 計画変更ＦＬＧ. Plan changed flg..<p>
	 *
	 */
	public void schd_chg_flg(boolean value) {
		setConstBoolean(offset + 110, $schd_chg_flg, value);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 111, $mfg_inst_unit_typ);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 111, $mfg_inst_unit_typ, value);
	}

	/**
	 * 工程資源. Operation resources.<p>
	 *
	 */
	public String oper_rsrc() {
		return getConstString(offset + 112, $oper_rsrc);
	}

	/**
	 * 工程資源. Operation resources.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		setConstString(offset + 112, $oper_rsrc, value);
	}

	/**
	 * 内部備考（製造）. Internal remarks (Mfg.).<p>
	 *
	 */
	public String mfg_intr_rmrks() {
		return getConstString(offset + 113, $mfg_intr_rmrks);
	}

	/**
	 * 内部備考（製造）. Internal remarks (Mfg.).<p>
	 *
	 */
	public void mfg_intr_rmrks(String value) {
		setConstString(offset + 113, $mfg_intr_rmrks, value);
	}

	/**
	 * 指図書備考（製造）. Order sheet remarks (Mfg.).<p>
	 *
	 */
	public String mfg_inst_rpt_rmrks() {
		return getConstString(offset + 114, $mfg_inst_rpt_rmrks);
	}

	/**
	 * 指図書備考（製造）. Order sheet remarks (Mfg.).<p>
	 *
	 */
	public void mfg_inst_rpt_rmrks(String value) {
		setConstString(offset + 114, $mfg_inst_rpt_rmrks, value);
	}

	/**
	 * 指図・発注連絡備考. Order/PO contact remarks.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 115, $inst_po_cnt_rmrks);
	}

	/**
	 * 指図・発注連絡備考. Order/PO contact remarks.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 115, $inst_po_cnt_rmrks, value);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public String if_co_cd() {
		return getConstString(offset + 116, $if_co_cd);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public void if_co_cd(String value) {
		setConstString(offset + 116, $if_co_cd, value);
	}

	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 117, $co_nm);
	}

	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 117, $co_nm, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 118, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 118, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 119, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 119, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 120, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 120, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 121, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 121, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 122, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 122, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 123, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 123, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 124, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 124, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 125, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 125, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 126, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 126, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 127, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 127, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 128, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 128, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 129, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 129, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 130, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 130, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 131, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 131, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 132, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 132, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 133, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 133, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 134, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 134, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 135, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 135, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 136, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 136, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 137, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 137, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 138, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 138, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 139, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 139, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 140, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 140, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 141, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 141, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 142, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 142, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 143, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 143, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 144, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 144, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 145, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 145, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 146, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 146, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 147, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 147, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 148, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 148, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 148, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 148, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 148, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 148, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 149, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 149, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 149, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 149, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 149, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 149, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 150, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 150, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 150, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 150, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 150, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 150, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 151, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 151, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 151, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 151, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 151, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 151, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 152, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 152, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 152, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 152, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 152, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 152, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 153, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 153, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 154, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 154, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 155, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 155, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 156, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 156, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 157, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 157, $sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 158, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 158, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 159, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 159, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 159, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 159, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 159, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 159, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 160, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 160, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 160, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 160, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 160, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 160, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 161, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 161, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 162, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 162, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 163, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 163, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 164, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 164, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 165, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 165, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 165, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 165, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 165, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 165, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 166, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 166, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 167, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 167, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 168, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 168, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 169, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 169, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 170, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 170, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 171, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 171, $sdrv_sts_typ, value);
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
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
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
		if ($mfg_itm_nm.equalsIgnoreCase(name)) {
			return mfg_itm_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($if_oper_cd.equalsIgnoreCase(name)) {
			return if_oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($if_oper_loc_cd.equalsIgnoreCase(name)) {
			return if_oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($if_oper_str_ln_cd.equalsIgnoreCase(name)) {
			return if_oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($if_oper_unit_cd.equalsIgnoreCase(name)) {
			return if_oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($if_usr_cd.equalsIgnoreCase(name)) {
			return if_usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($if_strg_loc_cd.equalsIgnoreCase(name)) {
			return if_strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($if_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return if_strg_str_ln_cd();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($if_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return if_mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($if_wg_cd.equalsIgnoreCase(name)) {
			return if_wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($if_site_cd.equalsIgnoreCase(name)) {
			return if_site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
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
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
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
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($mfg_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_intr_rmrks();
		}
		if ($mfg_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_inst_rpt_rmrks();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			return oper_unit_qty();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
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
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		if ($mfg_st_schd_tm.equalsIgnoreCase(name)) {
			return mfg_st_schd_tm();
		}
		if ($mfg_end_schd_tm.equalsIgnoreCase(name)) {
			return mfg_end_schd_tm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			return inst_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			return schd_chg_flg();
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
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
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
		if ($mfg_itm_nm.equalsIgnoreCase(name)) {
			return mfg_itm_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($if_oper_cd.equalsIgnoreCase(name)) {
			return if_oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($if_oper_loc_cd.equalsIgnoreCase(name)) {
			return if_oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($if_oper_str_ln_cd.equalsIgnoreCase(name)) {
			return if_oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($if_oper_unit_cd.equalsIgnoreCase(name)) {
			return if_oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($if_usr_cd.equalsIgnoreCase(name)) {
			return if_usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($if_strg_loc_cd.equalsIgnoreCase(name)) {
			return if_strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($if_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return if_strg_str_ln_cd();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($if_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return if_mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($if_wg_cd.equalsIgnoreCase(name)) {
			return if_wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($if_site_cd.equalsIgnoreCase(name)) {
			return if_site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
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
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
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
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($mfg_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_intr_rmrks();
		}
		if ($mfg_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_inst_rpt_rmrks();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			return oper_unit_qty();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
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
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		if ($mfg_st_schd_tm.equalsIgnoreCase(name)) {
			return mfg_st_schd_tm();
		}
		if ($mfg_end_schd_tm.equalsIgnoreCase(name)) {
			return mfg_end_schd_tm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			return inst_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			return schd_chg_flg();
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
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
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
		if ($mfg_itm_nm.equalsIgnoreCase(name)) {
			mfg_itm_nm(value);
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
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($if_oper_loc_cd.equalsIgnoreCase(name)) {
			if_oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($if_oper_str_ln_cd.equalsIgnoreCase(name)) {
			if_oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($if_oper_unit_cd.equalsIgnoreCase(name)) {
			if_oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($if_usr_cd.equalsIgnoreCase(name)) {
			if_usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($if_strg_loc_cd.equalsIgnoreCase(name)) {
			if_strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
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
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
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
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($if_wg_cd.equalsIgnoreCase(name)) {
			if_wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($if_site_cd.equalsIgnoreCase(name)) {
			if_site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
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
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
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
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
			return;
		}
		if ($mfg_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_intr_rmrks(value);
			return;
		}
		if ($mfg_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_inst_rpt_rmrks(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
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
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
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
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			inst_prnt_tm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			schd_chg_flg(value);
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
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
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
		if ($mfg_itm_nm.equalsIgnoreCase(name)) {
			mfg_itm_nm(value);
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
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($if_oper_loc_cd.equalsIgnoreCase(name)) {
			if_oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($if_oper_str_ln_cd.equalsIgnoreCase(name)) {
			if_oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($if_oper_unit_cd.equalsIgnoreCase(name)) {
			if_oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($if_usr_cd.equalsIgnoreCase(name)) {
			if_usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($if_strg_loc_cd.equalsIgnoreCase(name)) {
			if_strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
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
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
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
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($if_wg_cd.equalsIgnoreCase(name)) {
			if_wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($if_site_cd.equalsIgnoreCase(name)) {
			if_site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
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
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
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
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
			return;
		}
		if ($mfg_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_intr_rmrks(value);
			return;
		}
		if ($mfg_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_inst_rpt_rmrks(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
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
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
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
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			inst_prnt_tm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			schd_chg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
