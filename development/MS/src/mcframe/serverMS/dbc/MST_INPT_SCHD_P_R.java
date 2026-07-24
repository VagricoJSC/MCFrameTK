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
 * "投入予定（改訂履歴） // Input schedule (Rev. history)"DBコンテナRowクラスです。<p>
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
 *  	<td>inpt_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入予定ＮＯ</td>
 *  	<td>Input schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>mfg_inst_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図改訂番号</td>
 *  	<td>Mfg. order rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程指図ＮＯ</td>
 *  	<td>Operation order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予定日時</td>
 *  	<td>Scheduled date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alt_grp_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替グループＣＤ</td>
 *  	<td>Alternative group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alt_grp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替グループ連番</td>
 *  	<td>Alternative group sequence number</td>
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
 *  	<td>base_unit_inpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位投入数量</td>
 *  	<td>Base unit input qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位必要数量</td>
 *  	<td>Base unit required qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_fxd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位固定必要数量</td>
 *  	<td>Base unit fixed required qty.</td>
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
 *  	<td>inpt_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入場所ＣＤ</td>
 *  	<td>Input location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入棚・ラインＣＤ</td>
 *  	<td>Input rack/line cd.</td>
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
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 1 flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 2 flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 3 flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 4 flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当手配ＮＯ１</td>
 *  	<td>Allocation SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alloc_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当手配ＮＯ２</td>
 *  	<td>Allocation SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当手配ＮＯ３</td>
 *  	<td>Allocation SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alloc_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当手配ＮＯ４</td>
 *  	<td>Allocation SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bkf_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入品バックフラッシュ区分</td>
 *  	<td>Input item backflush type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cont_inpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（投入数量）</td>
 *  	<td>Active ingredient (Input qty.)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cont_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（必要数量）</td>
 *  	<td>Active ingredient (Required qty.)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cont_fxd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（固定必要数量）</td>
 *  	<td>Active ingredient (Fixed required qty.)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cont_fctr_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分単位ＣＤ</td>
 *  	<td>Active ingredient unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cont_fctr</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準有効成分係数</td>
 *  	<td>Standard active ingredient coefficient</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cont_fctr</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際有効成分係数</td>
 *  	<td>Actual active ingredient coefficient</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給区分</td>
 *  	<td>Supply type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入理由ＣＤ</td>
 *  	<td>Input reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親指図数量</td>
 *  	<td>Parent order qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_inpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子投入数量</td>
 *  	<td>Child input qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子必要数量</td>
 *  	<td>Child required qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fxd_chd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子固定必要数量</td>
 *  	<td>Child fixed required qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>main_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>引継対象子品目ＦＬＧ</td>
 *  	<td>Copy-from child item flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_lot_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>指図時ロット指定ＦＬＧ</td>
 *  	<td>Lot specification at order flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>表示順</td>
 *  	<td>Display order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット混在ＦＬＧ</td>
 *  	<td>Lot mixed flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロット混在ＦＬＧ</td>
 *  	<td>Sublot mixed flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bom_memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＢＯＭメモ１</td>
 *  	<td>BOM memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bom_memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＢＯＭメモ２</td>
 *  	<td>BOM memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bom_memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＢＯＭメモ３</td>
 *  	<td>BOM memo 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>収率計算用ＦＬＧ</td>
 *  	<td>Yield calculation flg.</td>
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
 *  	<td>base_unit_alt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位代替元数量</td>
 *  	<td>Base unit alternative sources qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alt_itm_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代替品目指定ＦＬＧ</td>
 *  	<td>Alternative item specification flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alt_itm_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替品目選択区分</td>
 *  	<td>Alternative item selection type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alt_alloc_prio</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替品目引当優先順位</td>
 *  	<td>Alternative item allocation priority</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alt_itm_ratio</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替品目比率</td>
 *  	<td>Alternative item ratio</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_ctl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>引当制御区分</td>
 *  	<td>Allocation control type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_ctl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入制御区分</td>
 *  	<td>Input control type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_offst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入オフセット区分</td>
 *  	<td>Input offset type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_offst</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入オフセット</td>
 *  	<td>Input offset</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bom_id_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程内ＢＯＭ識別番号</td>
 *  	<td>In-operation BOM identification number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_itm_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>同一子品目連番</td>
 *  	<td>Allow same child item sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>recalc_grp</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>再計算グループ</td>
 *  	<td>Re-calculation group</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>recalc_grp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>再計算グループ連番</td>
 *  	<td>Re-calculation group sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消ＦＬＧ</td>
 *  	<td>Cancel flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考</td>
 *  	<td>Internal remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図書備考</td>
 *  	<td>Order sheet remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備３</td>
 *  	<td>Spare 3</td>
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
public class MST_INPT_SCHD_P_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_INPT_SCHD_P";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	private static final MCPermColumnInfo _inpt_schd_no = createColumnInfo("inpt_schd_no");
	public final MCStringPermColumn inpt_schd_no = createStringColumn(_inpt_schd_no);
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public static final String $mfg_inst_rev = "mfg_inst_rev";
	private static final MCPermColumnInfo _mfg_inst_rev = createColumnInfo("mfg_inst_rev");
	public final MCNumberPermColumn mfg_inst_rev = createNumberColumn(_mfg_inst_rev);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	private static final MCPermColumnInfo _oper_inst_no = createColumnInfo("oper_inst_no");
	public final MCStringPermColumn oper_inst_no = createStringColumn(_oper_inst_no);
	
	/**
	 * 予定日時. Scheduled date and time.<p>
	 *
	 */
	public static final String $schd_tm = "schd_tm";
	private static final MCPermColumnInfo _schd_tm = createColumnInfo("schd_tm");
	public final MCDatePermColumn schd_tm = createDateColumn(_schd_tm);
	
	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	private static final MCPermColumnInfo _alt_grp_cd = createColumnInfo("alt_grp_cd");
	public final MCStringPermColumn alt_grp_cd = createStringColumn(_alt_grp_cd);
	
	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public static final String $alt_grp_seq = "alt_grp_seq";
	private static final MCPermColumnInfo _alt_grp_seq = createColumnInfo("alt_grp_seq");
	public final MCNumberPermColumn alt_grp_seq = createNumberColumn(_alt_grp_seq);
	
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
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	private static final MCPermColumnInfo _base_unit_inpt_qty = createColumnInfo("base_unit_inpt_qty");
	public final MCNumberPermColumn base_unit_inpt_qty = createNumberColumn(_base_unit_inpt_qty);
	
	/**
	 * 基準単位必要数量. Base unit required qty..<p>
	 *
	 */
	public static final String $base_unit_rqmt_qty = "base_unit_rqmt_qty";
	private static final MCPermColumnInfo _base_unit_rqmt_qty = createColumnInfo("base_unit_rqmt_qty");
	public final MCNumberPermColumn base_unit_rqmt_qty = createNumberColumn(_base_unit_rqmt_qty);
	
	/**
	 * 基準単位固定必要数量. Base unit fixed required qty..<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_qty = "base_unit_fxd_rqmt_qty";
	private static final MCPermColumnInfo _base_unit_fxd_rqmt_qty = createColumnInfo("base_unit_fxd_rqmt_qty");
	public final MCNumberPermColumn base_unit_fxd_rqmt_qty = createNumberColumn(_base_unit_fxd_rqmt_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	private static final MCPermColumnInfo _inpt_loc_cd = createColumnInfo("inpt_loc_cd");
	public final MCStringPermColumn inpt_loc_cd = createStringColumn(_inpt_loc_cd);
	
	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	private static final MCPermColumnInfo _inpt_str_ln_cd = createColumnInfo("inpt_str_ln_cd");
	public final MCStringPermColumn inpt_str_ln_cd = createStringColumn(_inpt_str_ln_cd);
	
	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	private static final MCPermColumnInfo _gd_cd = createColumnInfo("gd_cd");
	public final MCStringPermColumn gd_cd = createStringColumn(_gd_cd);
	
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
	 * 引当手配ＮＯ１. Allocation SEIBAN No. 1.<p>
	 *
	 */
	public static final String $alloc_sno1 = "alloc_sno1";
	private static final MCPermColumnInfo _alloc_sno1 = createColumnInfo("alloc_sno1");
	public final MCStringPermColumn alloc_sno1 = createStringColumn(_alloc_sno1);
	
	/**
	 * 引当手配ＮＯ２. Allocation SEIBAN No. 2.<p>
	 *
	 */
	public static final String $alloc_sno2 = "alloc_sno2";
	private static final MCPermColumnInfo _alloc_sno2 = createColumnInfo("alloc_sno2");
	public final MCStringPermColumn alloc_sno2 = createStringColumn(_alloc_sno2);
	
	/**
	 * 引当手配ＮＯ３. Allocation SEIBAN No. 3.<p>
	 *
	 */
	public static final String $alloc_sno3 = "alloc_sno3";
	private static final MCPermColumnInfo _alloc_sno3 = createColumnInfo("alloc_sno3");
	public final MCStringPermColumn alloc_sno3 = createStringColumn(_alloc_sno3);
	
	/**
	 * 引当手配ＮＯ４. Allocation SEIBAN No. 4.<p>
	 *
	 */
	public static final String $alloc_sno4 = "alloc_sno4";
	private static final MCPermColumnInfo _alloc_sno4 = createColumnInfo("alloc_sno4");
	public final MCStringPermColumn alloc_sno4 = createStringColumn(_alloc_sno4);
	
	/**
	 * 投入品バックフラッシュ区分. Input item backflush type.<p>
	 *
	 */
	public static final String $bkf_typ = "bkf_typ";
	private static final MCPermColumnInfo _bkf_typ = createColumnInfo("bkf_typ");
	public final MCStringPermColumn bkf_typ = createStringColumn(_bkf_typ);
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public static final String $cont_inpt_qty = "cont_inpt_qty";
	private static final MCPermColumnInfo _cont_inpt_qty = createColumnInfo("cont_inpt_qty");
	public final MCNumberPermColumn cont_inpt_qty = createNumberColumn(_cont_inpt_qty);
	
	/**
	 * 有効成分（必要数量）. Active ingredient (Required qty.).<p>
	 *
	 */
	public static final String $cont_rqmt_qty = "cont_rqmt_qty";
	private static final MCPermColumnInfo _cont_rqmt_qty = createColumnInfo("cont_rqmt_qty");
	public final MCNumberPermColumn cont_rqmt_qty = createNumberColumn(_cont_rqmt_qty);
	
	/**
	 * 有効成分（固定必要数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_qty = "cont_fxd_rqmt_qty";
	private static final MCPermColumnInfo _cont_fxd_rqmt_qty = createColumnInfo("cont_fxd_rqmt_qty");
	public final MCNumberPermColumn cont_fxd_rqmt_qty = createNumberColumn(_cont_fxd_rqmt_qty);
	
	/**
	 * 有効成分単位ＣＤ. Active ingredient unit cd..<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	private static final MCPermColumnInfo _cont_fctr_unit_cd = createColumnInfo("cont_fctr_unit_cd");
	public final MCStringPermColumn cont_fctr_unit_cd = createStringColumn(_cont_fctr_unit_cd);
	
	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	private static final MCPermColumnInfo _std_cont_fctr = createColumnInfo("std_cont_fctr");
	public final MCNumberPermColumn std_cont_fctr = createNumberColumn(_std_cont_fctr);
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	private static final MCPermColumnInfo _act_cont_fctr = createColumnInfo("act_cont_fctr");
	public final MCNumberPermColumn act_cont_fctr = createNumberColumn(_act_cont_fctr);
	
	/**
	 * 支給区分. Supply type.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	private static final MCPermColumnInfo _prov_typ = createColumnInfo("prov_typ");
	public final MCStringPermColumn prov_typ = createStringColumn(_prov_typ);
	
	/**
	 * 投入理由ＣＤ. Input reason cd..<p>
	 *
	 */
	public static final String $inpt_rsn_cd = "inpt_rsn_cd";
	private static final MCPermColumnInfo _inpt_rsn_cd = createColumnInfo("inpt_rsn_cd");
	public final MCStringPermColumn inpt_rsn_cd = createStringColumn(_inpt_rsn_cd);
	
	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public static final String $par_inst_qty = "par_inst_qty";
	private static final MCPermColumnInfo _par_inst_qty = createColumnInfo("par_inst_qty");
	public final MCNumberPermColumn par_inst_qty = createNumberColumn(_par_inst_qty);
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public static final String $chd_inpt_qty = "chd_inpt_qty";
	private static final MCPermColumnInfo _chd_inpt_qty = createColumnInfo("chd_inpt_qty");
	public final MCNumberPermColumn chd_inpt_qty = createNumberColumn(_chd_inpt_qty);
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public static final String $chd_rqmt_qty = "chd_rqmt_qty";
	private static final MCPermColumnInfo _chd_rqmt_qty = createColumnInfo("chd_rqmt_qty");
	public final MCNumberPermColumn chd_rqmt_qty = createNumberColumn(_chd_rqmt_qty);
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public static final String $fxd_chd_rqmt_qty = "fxd_chd_rqmt_qty";
	private static final MCPermColumnInfo _fxd_chd_rqmt_qty = createColumnInfo("fxd_chd_rqmt_qty");
	public final MCNumberPermColumn fxd_chd_rqmt_qty = createNumberColumn(_fxd_chd_rqmt_qty);
	
	/**
	 * 引継対象子品目ＦＬＧ. Copy-from child item flg..<p>
	 *
	 */
	public static final String $main_itm_flg = "main_itm_flg";
	private static final MCPermColumnInfo _main_itm_flg = createColumnInfo("main_itm_flg");
	public final MCBooleanPermColumn main_itm_flg = createBooleanColumn(_main_itm_flg);
	
	/**
	 * 指図時ロット指定ＦＬＧ. Lot specification at order flg..<p>
	 *
	 */
	public static final String $inst_lot_fix_flg = "inst_lot_fix_flg";
	private static final MCPermColumnInfo _inst_lot_fix_flg = createColumnInfo("inst_lot_fix_flg");
	public final MCBooleanPermColumn inst_lot_fix_flg = createBooleanColumn(_inst_lot_fix_flg);
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
	/**
	 * ロット混在ＦＬＧ. Lot mixed flg..<p>
	 *
	 */
	public static final String $lot_mix_flg = "lot_mix_flg";
	private static final MCPermColumnInfo _lot_mix_flg = createColumnInfo("lot_mix_flg");
	public final MCBooleanPermColumn lot_mix_flg = createBooleanColumn(_lot_mix_flg);
	
	/**
	 * サブロット混在ＦＬＧ. Sublot mixed flg..<p>
	 *
	 */
	public static final String $sublot_mix_flg = "sublot_mix_flg";
	private static final MCPermColumnInfo _sublot_mix_flg = createColumnInfo("sublot_mix_flg");
	public final MCBooleanPermColumn sublot_mix_flg = createBooleanColumn(_sublot_mix_flg);
	
	/**
	 * ＢＯＭメモ１. BOM memo 1.<p>
	 *
	 */
	public static final String $bom_memo1 = "bom_memo1";
	private static final MCPermColumnInfo _bom_memo1 = createColumnInfo("bom_memo1");
	public final MCStringPermColumn bom_memo1 = createStringColumn(_bom_memo1);
	
	/**
	 * ＢＯＭメモ２. BOM memo 2.<p>
	 *
	 */
	public static final String $bom_memo2 = "bom_memo2";
	private static final MCPermColumnInfo _bom_memo2 = createColumnInfo("bom_memo2");
	public final MCStringPermColumn bom_memo2 = createStringColumn(_bom_memo2);
	
	/**
	 * ＢＯＭメモ３. BOM memo 3.<p>
	 *
	 */
	public static final String $bom_memo3 = "bom_memo3";
	private static final MCPermColumnInfo _bom_memo3 = createColumnInfo("bom_memo3");
	public final MCStringPermColumn bom_memo3 = createStringColumn(_bom_memo3);
	
	/**
	 * 収率計算用ＦＬＧ. Yield calculation flg..<p>
	 *
	 */
	public static final String $yield_calc_flg = "yield_calc_flg";
	private static final MCPermColumnInfo _yield_calc_flg = createColumnInfo("yield_calc_flg");
	public final MCBooleanPermColumn yield_calc_flg = createBooleanColumn(_yield_calc_flg);
	
	/**
	 * 引当ＦＬＧ. Allocation flg..<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	private static final MCPermColumnInfo _alloc_flg = createColumnInfo("alloc_flg");
	public final MCBooleanPermColumn alloc_flg = createBooleanColumn(_alloc_flg);
	
	/**
	 * 基準単位代替元数量. Base unit alternative sources qty..<p>
	 *
	 */
	public static final String $base_unit_alt_qty = "base_unit_alt_qty";
	private static final MCPermColumnInfo _base_unit_alt_qty = createColumnInfo("base_unit_alt_qty");
	public final MCNumberPermColumn base_unit_alt_qty = createNumberColumn(_base_unit_alt_qty);
	
	/**
	 * 代替品目指定ＦＬＧ. Alternative item specification flg..<p>
	 *
	 */
	public static final String $alt_itm_fix_flg = "alt_itm_fix_flg";
	private static final MCPermColumnInfo _alt_itm_fix_flg = createColumnInfo("alt_itm_fix_flg");
	public final MCBooleanPermColumn alt_itm_fix_flg = createBooleanColumn(_alt_itm_fix_flg);
	
	/**
	 * 代替品目選択区分. Alternative item selection type.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	private static final MCPermColumnInfo _alt_itm_typ = createColumnInfo("alt_itm_typ");
	public final MCStringPermColumn alt_itm_typ = createStringColumn(_alt_itm_typ);
	
	/**
	 * 代替品目引当優先順位. Alternative item allocation priority.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
	private static final MCPermColumnInfo _alt_alloc_prio = createColumnInfo("alt_alloc_prio");
	public final MCNumberPermColumn alt_alloc_prio = createNumberColumn(_alt_alloc_prio);
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	private static final MCPermColumnInfo _alt_itm_ratio = createColumnInfo("alt_itm_ratio");
	public final MCNumberPermColumn alt_itm_ratio = createNumberColumn(_alt_itm_ratio);
	
	/**
	 * 引当制御区分. Allocation control type.<p>
	 *
	 */
	public static final String $alloc_ctl_typ = "alloc_ctl_typ";
	private static final MCPermColumnInfo _alloc_ctl_typ = createColumnInfo("alloc_ctl_typ");
	public final MCStringPermColumn alloc_ctl_typ = createStringColumn(_alloc_ctl_typ);
	
	/**
	 * 投入制御区分. Input control type.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	private static final MCPermColumnInfo _inpt_ctl_typ = createColumnInfo("inpt_ctl_typ");
	public final MCStringPermColumn inpt_ctl_typ = createStringColumn(_inpt_ctl_typ);
	
	/**
	 * 投入オフセット区分. Input offset type.<p>
	 *
	 */
	public static final String $in_offst_typ = "in_offst_typ";
	private static final MCPermColumnInfo _in_offst_typ = createColumnInfo("in_offst_typ");
	public final MCStringPermColumn in_offst_typ = createStringColumn(_in_offst_typ);
	
	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public static final String $in_offst = "in_offst";
	private static final MCPermColumnInfo _in_offst = createColumnInfo("in_offst");
	public final MCNumberPermColumn in_offst = createNumberColumn(_in_offst);
	
	/**
	 * 工程内ＢＯＭ識別番号. In-operation BOM identification number.<p>
	 *
	 */
	public static final String $bom_id_no = "bom_id_no";
	private static final MCPermColumnInfo _bom_id_no = createColumnInfo("bom_id_no");
	public final MCNumberPermColumn bom_id_no = createNumberColumn(_bom_id_no);
	
	/**
	 * 同一子品目連番. Allow same child item sequence number.<p>
	 *
	 */
	public static final String $chd_itm_seq = "chd_itm_seq";
	private static final MCPermColumnInfo _chd_itm_seq = createColumnInfo("chd_itm_seq");
	public final MCNumberPermColumn chd_itm_seq = createNumberColumn(_chd_itm_seq);
	
	/**
	 * 再計算グループ. Re-calculation group.<p>
	 *
	 */
	public static final String $recalc_grp = "recalc_grp";
	private static final MCPermColumnInfo _recalc_grp = createColumnInfo("recalc_grp");
	public final MCNumberPermColumn recalc_grp = createNumberColumn(_recalc_grp);
	
	/**
	 * 再計算グループ連番. Re-calculation group sequence number.<p>
	 *
	 */
	public static final String $recalc_grp_seq = "recalc_grp_seq";
	private static final MCPermColumnInfo _recalc_grp_seq = createColumnInfo("recalc_grp_seq");
	public final MCNumberPermColumn recalc_grp_seq = createNumberColumn(_recalc_grp_seq);
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	private static final MCPermColumnInfo _can_flg = createColumnInfo("can_flg");
	public final MCBooleanPermColumn can_flg = createBooleanColumn(_can_flg);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 指図書備考. Order sheet remarks.<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
	private static final MCPermColumnInfo _inst_rpt_rmrks = createColumnInfo("inst_rpt_rmrks");
	public final MCStringPermColumn inst_rpt_rmrks = createStringColumn(_inst_rpt_rmrks);
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	private static final MCPermColumnInfo _sub_char1 = createColumnInfo("sub_char1");
	public final MCStringPermColumn sub_char1 = createStringColumn(_sub_char1);
	
	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	private static final MCPermColumnInfo _sub_char2 = createColumnInfo("sub_char2");
	public final MCStringPermColumn sub_char2 = createStringColumn(_sub_char2);
	
	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	private static final MCPermColumnInfo _sub_char3 = createColumnInfo("sub_char3");
	public final MCStringPermColumn sub_char3 = createStringColumn(_sub_char3);
	
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
	
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta schd_tm_META = createCommonMeta($schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_qty_META = createCommonMeta($base_unit_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_qty_META = createCommonMeta($base_unit_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
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
	public static final MCMeta alloc_sno1_META = createCommonMeta($alloc_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta alloc_sno2_META = createCommonMeta($alloc_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta alloc_sno3_META = createCommonMeta($alloc_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta alloc_sno4_META = createCommonMeta($alloc_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_rqmt_qty_META = createCommonMeta($cont_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_rqmt_qty_META = createCommonMeta($cont_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta inpt_rsn_cd_META = createCommonMeta($inpt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta par_inst_qty_META = createCommonMeta($par_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_inpt_qty_META = createCommonMeta($chd_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_rqmt_qty_META = createCommonMeta($chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_chd_rqmt_qty_META = createCommonMeta($fxd_chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta main_itm_flg_META = createCommonMeta($main_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_lot_fix_flg_META = createCommonMeta($inst_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta lot_mix_flg_META = createCommonMeta($lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mix_flg_META = createCommonMeta($sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_memo1_META = createCommonMeta($bom_memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta bom_memo2_META = createCommonMeta($bom_memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta bom_memo3_META = createCommonMeta($bom_memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta yield_calc_flg_META = createCommonMeta($yield_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_alt_qty_META = createCommonMeta($base_unit_alt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_itm_fix_flg_META = createCommonMeta($alt_itm_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta alloc_ctl_typ_META = createCommonMeta($alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta in_offst_typ_META = createCommonMeta($in_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta in_offst_META = createCommonMeta($in_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta bom_id_no_META = createCommonMeta($bom_id_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta chd_itm_seq_META = createCommonMeta($chd_itm_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta recalc_grp_META = createCommonMeta($recalc_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta recalc_grp_seq_META = createCommonMeta($recalc_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_INTR_RMRKS);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_RPT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_INPT_SCHD_P_R> constMetas = new ConstMetaList<MST_INPT_SCHD_P_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			inpt_schd_no_META,
			mfg_inst_rev_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			schd_tm_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			base_unit_inpt_qty_META,
			base_unit_rqmt_qty_META,
			base_unit_fxd_rqmt_qty_META,
			base_unit_cd_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			gd_cd_META,
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
			alloc_sno1_META,
			alloc_sno2_META,
			alloc_sno3_META,
			alloc_sno4_META,
			bkf_typ_META,
			cont_inpt_qty_META,
			cont_rqmt_qty_META,
			cont_fxd_rqmt_qty_META,
			cont_fctr_unit_cd_META,
			std_cont_fctr_META,
			act_cont_fctr_META,
			prov_typ_META,
			inpt_rsn_cd_META,
			par_inst_qty_META,
			chd_inpt_qty_META,
			chd_rqmt_qty_META,
			fxd_chd_rqmt_qty_META,
			main_itm_flg_META,
			inst_lot_fix_flg_META,
			disp_seq_META,
			lot_mix_flg_META,
			sublot_mix_flg_META,
			bom_memo1_META,
			bom_memo2_META,
			bom_memo3_META,
			yield_calc_flg_META,
			alloc_flg_META,
			base_unit_alt_qty_META,
			alt_itm_fix_flg_META,
			alt_itm_typ_META,
			alt_alloc_prio_META,
			alt_itm_ratio_META,
			alloc_ctl_typ_META,
			inpt_ctl_typ_META,
			in_offst_typ_META,
			in_offst_META,
			bom_id_no_META,
			chd_itm_seq_META,
			recalc_grp_META,
			recalc_grp_seq_META,
			can_flg_META,
			intr_rmrks_META,
			inst_rpt_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
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
	protected MST_INPT_SCHD_P_R(ConstMetaList<? extends MST_INPT_SCHD_P_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_INPT_SCHD_P_R(ConstMetaList<? extends MST_INPT_SCHD_P_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$inpt_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$inpt_schd_no,
				"inpt_schd_no",
				inpt_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$mfg_inst_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$mfg_inst_rev,
				"mfg_inst_rev",
				mfg_inst_rev,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$itm_mfg_inst_no,
				"itm_mfg_inst_no",
				itm_mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$oper_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$oper_inst_no,
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
			MST_INPT_SCHD_P_R.$schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INPT_SCHD_P_R.$schd_tm,
				"schd_tm",
				schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alt_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$alt_grp_cd,
				"alt_grp_cd",
				alt_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alt_grp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$alt_grp_seq,
				"alt_grp_seq",
				alt_grp_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$itm_cd,
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
			MST_INPT_SCHD_P_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$itm_sub1,
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
			MST_INPT_SCHD_P_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$itm_sub2,
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
			MST_INPT_SCHD_P_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$itm_sub3,
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
			MST_INPT_SCHD_P_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$ver_no,
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
			MST_INPT_SCHD_P_R.$base_unit_inpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$base_unit_inpt_qty,
				"base_unit_inpt_qty",
				base_unit_inpt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$base_unit_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$base_unit_rqmt_qty,
				"base_unit_rqmt_qty",
				base_unit_rqmt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$base_unit_fxd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$base_unit_fxd_rqmt_qty,
				"base_unit_fxd_rqmt_qty",
				base_unit_fxd_rqmt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$base_unit_cd,
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
			MST_INPT_SCHD_P_R.$inpt_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$inpt_loc_cd,
				"inpt_loc_cd",
				inpt_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$inpt_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$inpt_str_ln_cd,
				"inpt_str_ln_cd",
				inpt_str_ln_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$gd_cd,
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
			MST_INPT_SCHD_P_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$lot_no,
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
			MST_INPT_SCHD_P_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$sublot_no,
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
			MST_INPT_SCHD_P_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$sno1,
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
			MST_INPT_SCHD_P_R.$sno1_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$sno1_null_flg,
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
			MST_INPT_SCHD_P_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$sno2,
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
			MST_INPT_SCHD_P_R.$sno2_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$sno2_null_flg,
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
			MST_INPT_SCHD_P_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$sno3,
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
			MST_INPT_SCHD_P_R.$sno3_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$sno3_null_flg,
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
			MST_INPT_SCHD_P_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$sno4,
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
			MST_INPT_SCHD_P_R.$sno4_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$sno4_null_flg,
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
			MST_INPT_SCHD_P_R.$alloc_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$alloc_sno1,
				"alloc_sno1",
				alloc_sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alloc_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$alloc_sno2,
				"alloc_sno2",
				alloc_sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alloc_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$alloc_sno3,
				"alloc_sno3",
				alloc_sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alloc_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$alloc_sno4,
				"alloc_sno4",
				alloc_sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$bkf_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$bkf_typ,
				"bkf_typ",
				bkf_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$cont_inpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$cont_inpt_qty,
				"cont_inpt_qty",
				cont_inpt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$cont_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$cont_rqmt_qty,
				"cont_rqmt_qty",
				cont_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$cont_fxd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$cont_fxd_rqmt_qty,
				"cont_fxd_rqmt_qty",
				cont_fxd_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$cont_fctr_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$cont_fctr_unit_cd,
				"cont_fctr_unit_cd",
				cont_fctr_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$std_cont_fctr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$std_cont_fctr,
				"std_cont_fctr",
				std_cont_fctr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$act_cont_fctr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$act_cont_fctr,
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
			MST_INPT_SCHD_P_R.$prov_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$prov_typ,
				"prov_typ",
				prov_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$inpt_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$inpt_rsn_cd,
				"inpt_rsn_cd",
				inpt_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$par_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$par_inst_qty,
				"par_inst_qty",
				par_inst_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$chd_inpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$chd_inpt_qty,
				"chd_inpt_qty",
				chd_inpt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$chd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$chd_rqmt_qty,
				"chd_rqmt_qty",
				chd_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$fxd_chd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$fxd_chd_rqmt_qty,
				"fxd_chd_rqmt_qty",
				fxd_chd_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$main_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$main_itm_flg,
				"main_itm_flg",
				main_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$inst_lot_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$inst_lot_fix_flg,
				"inst_lot_fix_flg",
				inst_lot_fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$disp_seq,
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
			MST_INPT_SCHD_P_R.$lot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$lot_mix_flg,
				"lot_mix_flg",
				lot_mix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$sublot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$sublot_mix_flg,
				"sublot_mix_flg",
				sublot_mix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$bom_memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$bom_memo1,
				"bom_memo1",
				bom_memo1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$bom_memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$bom_memo2,
				"bom_memo2",
				bom_memo2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$bom_memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$bom_memo3,
				"bom_memo3",
				bom_memo3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$yield_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$yield_calc_flg,
				"yield_calc_flg",
				yield_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alloc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$alloc_flg,
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
			MST_INPT_SCHD_P_R.$base_unit_alt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$base_unit_alt_qty,
				"base_unit_alt_qty",
				base_unit_alt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alt_itm_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$alt_itm_fix_flg,
				"alt_itm_fix_flg",
				alt_itm_fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alt_itm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$alt_itm_typ,
				"alt_itm_typ",
				alt_itm_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alt_alloc_prio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$alt_alloc_prio,
				"alt_alloc_prio",
				alt_alloc_prio,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alt_itm_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$alt_itm_ratio,
				"alt_itm_ratio",
				alt_itm_ratio,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$alloc_ctl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$alloc_ctl_typ,
				"alloc_ctl_typ",
				alloc_ctl_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$inpt_ctl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$inpt_ctl_typ,
				"inpt_ctl_typ",
				inpt_ctl_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$in_offst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$in_offst_typ,
				"in_offst_typ",
				in_offst_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$in_offst,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$in_offst,
				"in_offst",
				in_offst,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$bom_id_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$bom_id_no,
				"bom_id_no",
				bom_id_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$chd_itm_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$chd_itm_seq,
				"chd_itm_seq",
				chd_itm_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$recalc_grp,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$recalc_grp,
				"recalc_grp",
				recalc_grp,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$recalc_grp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$recalc_grp_seq,
				"recalc_grp_seq",
				recalc_grp_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_SCHD_P_R.$can_flg,
				"can_flg",
				can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$intr_rmrks,
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
			MST_INPT_SCHD_P_R.$inst_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$inst_rpt_rmrks,
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
			MST_INPT_SCHD_P_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$sub_char1,
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
			MST_INPT_SCHD_P_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$sub_char2,
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
			MST_INPT_SCHD_P_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$sub_char3,
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
			MST_INPT_SCHD_P_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INPT_SCHD_P_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_SCHD_P_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INPT_SCHD_P_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_SCHD_P_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_SCHD_P_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				false,
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
	public static MST_INPT_SCHD_P_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_INPT_SCHD_P_R create(String alias) {
		MST_INPT_SCHD_P_R row = new MST_INPT_SCHD_P_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_INPT_SCHD_P_R createByName(T proto) {
		MST_INPT_SCHD_P_R row = MST_INPT_SCHD_P_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INPT_SCHD_P_R clone() {
		return (MST_INPT_SCHD_P_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INPT_SCHD_P_R createInstance() {
		return (MST_INPT_SCHD_P_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INPT_SCHD_P_R getValues(String... names) {
		return (MST_INPT_SCHD_P_R) super.getValues(names);
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
	 public MSW_INPT_SCHD_P_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_INPT_SCHD_P_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_INPT_SCHD_P_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_INPT_SCHD_P_KEY_R.TABLE_NAME);
	 }

	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 0, $inpt_schd_no);
	}

	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 0, $inpt_schd_no, value);
	}

	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 1, $mfg_inst_rev);
	}

	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 2, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 2, $mfg_inst_no, value);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 3, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 3, $itm_mfg_inst_no, value);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 4, $oper_inst_no);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 4, $oper_inst_no, value);
	}

	/**
	 * 予定日時. Scheduled date and time.<p>
	 *
	 */
	public MCDate schd_tm() {
		return getConstDate(offset + 5, $schd_tm);
	}

	/**
	 * 予定日時. Scheduled date and time.<p>
	 *
	 */
	public void schd_tm(MCDate value) {
		setConstDate(offset + 5, $schd_tm, value);
	}

	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 6, $alt_grp_cd);
	}

	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 6, $alt_grp_cd, value);
	}

	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 7, $alt_grp_seq);
	}

	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}
	
	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}
	
	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}
	
	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}
	
	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 12, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 12, $ver_no, value);
	}

	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 13, $base_unit_inpt_qty);
	}

	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 13, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 13, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 13, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 13, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 13, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位必要数量. Base unit required qty..<p>
	 *
	 */
	public MCNumber base_unit_rqmt_qty() {
		return getConstNumber(offset + 14, $base_unit_rqmt_qty);
	}

	/**
	 * 基準単位必要数量. Base unit required qty..<p>
	 *
	 */
	public void base_unit_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 14, $base_unit_rqmt_qty, value);
	}
	
	/**
	 * 基準単位必要数量. Base unit required qty..<p>
	 *
	 */
	public void base_unit_rqmt_qty(int value) {
		setConstNumber(offset + 14, $base_unit_rqmt_qty, value);
	}
	
	/**
	 * 基準単位必要数量. Base unit required qty..<p>
	 *
	 */
	public void base_unit_rqmt_qty(long value) {
		setConstNumber(offset + 14, $base_unit_rqmt_qty, value);
	}
	
	/**
	 * 基準単位必要数量. Base unit required qty..<p>
	 *
	 */
	public void base_unit_rqmt_qty(float value) {
		setConstNumber(offset + 14, $base_unit_rqmt_qty, value);
	}
	
	/**
	 * 基準単位必要数量. Base unit required qty..<p>
	 *
	 */
	public void base_unit_rqmt_qty(double value) {
		setConstNumber(offset + 14, $base_unit_rqmt_qty, value);
	}
	
	/**
	 * 基準単位固定必要数量. Base unit fixed required qty..<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_qty() {
		return getConstNumber(offset + 15, $base_unit_fxd_rqmt_qty);
	}

	/**
	 * 基準単位固定必要数量. Base unit fixed required qty..<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 15, $base_unit_fxd_rqmt_qty, value);
	}
	
	/**
	 * 基準単位固定必要数量. Base unit fixed required qty..<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 15, $base_unit_fxd_rqmt_qty, value);
	}
	
	/**
	 * 基準単位固定必要数量. Base unit fixed required qty..<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 15, $base_unit_fxd_rqmt_qty, value);
	}
	
	/**
	 * 基準単位固定必要数量. Base unit fixed required qty..<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 15, $base_unit_fxd_rqmt_qty, value);
	}
	
	/**
	 * 基準単位固定必要数量. Base unit fixed required qty..<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 15, $base_unit_fxd_rqmt_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 16, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 16, $base_unit_cd, value);
	}

	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 17, $inpt_loc_cd);
	}

	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 17, $inpt_loc_cd, value);
	}

	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 18, $inpt_str_ln_cd);
	}

	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 18, $inpt_str_ln_cd, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 19, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 19, $gd_cd, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 20, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 20, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 21, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 21, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 22, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 22, $sno1, value);
	}

	/**
	 * 手配ＮＯ１無し可ＦＬＧ. Allow without SEIBAN No. 1 flg..<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 23, $sno1_null_flg);
	}

	/**
	 * 手配ＮＯ１無し可ＦＬＧ. Allow without SEIBAN No. 1 flg..<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 23, $sno1_null_flg, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 24, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 24, $sno2, value);
	}

	/**
	 * 手配ＮＯ２無し可ＦＬＧ. Allow without SEIBAN No. 2 flg..<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 25, $sno2_null_flg);
	}

	/**
	 * 手配ＮＯ２無し可ＦＬＧ. Allow without SEIBAN No. 2 flg..<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 25, $sno2_null_flg, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 26, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 26, $sno3, value);
	}

	/**
	 * 手配ＮＯ３無し可ＦＬＧ. Allow without SEIBAN No. 3 flg..<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 27, $sno3_null_flg);
	}

	/**
	 * 手配ＮＯ３無し可ＦＬＧ. Allow without SEIBAN No. 3 flg..<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 27, $sno3_null_flg, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 28, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 28, $sno4, value);
	}

	/**
	 * 手配ＮＯ４無し可ＦＬＧ. Allow without SEIBAN No. 4 flg..<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 29, $sno4_null_flg);
	}

	/**
	 * 手配ＮＯ４無し可ＦＬＧ. Allow without SEIBAN No. 4 flg..<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 29, $sno4_null_flg, value);
	}

	/**
	 * 引当手配ＮＯ１. Allocation SEIBAN No. 1.<p>
	 *
	 */
	public String alloc_sno1() {
		return getConstString(offset + 30, $alloc_sno1);
	}

	/**
	 * 引当手配ＮＯ１. Allocation SEIBAN No. 1.<p>
	 *
	 */
	public void alloc_sno1(String value) {
		setConstString(offset + 30, $alloc_sno1, value);
	}

	/**
	 * 引当手配ＮＯ２. Allocation SEIBAN No. 2.<p>
	 *
	 */
	public String alloc_sno2() {
		return getConstString(offset + 31, $alloc_sno2);
	}

	/**
	 * 引当手配ＮＯ２. Allocation SEIBAN No. 2.<p>
	 *
	 */
	public void alloc_sno2(String value) {
		setConstString(offset + 31, $alloc_sno2, value);
	}

	/**
	 * 引当手配ＮＯ３. Allocation SEIBAN No. 3.<p>
	 *
	 */
	public String alloc_sno3() {
		return getConstString(offset + 32, $alloc_sno3);
	}

	/**
	 * 引当手配ＮＯ３. Allocation SEIBAN No. 3.<p>
	 *
	 */
	public void alloc_sno3(String value) {
		setConstString(offset + 32, $alloc_sno3, value);
	}

	/**
	 * 引当手配ＮＯ４. Allocation SEIBAN No. 4.<p>
	 *
	 */
	public String alloc_sno4() {
		return getConstString(offset + 33, $alloc_sno4);
	}

	/**
	 * 引当手配ＮＯ４. Allocation SEIBAN No. 4.<p>
	 *
	 */
	public void alloc_sno4(String value) {
		setConstString(offset + 33, $alloc_sno4, value);
	}

	/**
	 * 投入品バックフラッシュ区分. Input item backflush type.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 34, $bkf_typ);
	}

	/**
	 * 投入品バックフラッシュ区分. Input item backflush type.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 34, $bkf_typ, value);
	}

	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 35, $cont_inpt_qty);
	}

	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 35, $cont_inpt_qty, value);
	}
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 35, $cont_inpt_qty, value);
	}
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 35, $cont_inpt_qty, value);
	}
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 35, $cont_inpt_qty, value);
	}
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 35, $cont_inpt_qty, value);
	}
	
	/**
	 * 有効成分（必要数量）. Active ingredient (Required qty.).<p>
	 *
	 */
	public MCNumber cont_rqmt_qty() {
		return getConstNumber(offset + 36, $cont_rqmt_qty);
	}

	/**
	 * 有効成分（必要数量）. Active ingredient (Required qty.).<p>
	 *
	 */
	public void cont_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 36, $cont_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（必要数量）. Active ingredient (Required qty.).<p>
	 *
	 */
	public void cont_rqmt_qty(int value) {
		setConstNumber(offset + 36, $cont_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（必要数量）. Active ingredient (Required qty.).<p>
	 *
	 */
	public void cont_rqmt_qty(long value) {
		setConstNumber(offset + 36, $cont_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（必要数量）. Active ingredient (Required qty.).<p>
	 *
	 */
	public void cont_rqmt_qty(float value) {
		setConstNumber(offset + 36, $cont_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（必要数量）. Active ingredient (Required qty.).<p>
	 *
	 */
	public void cont_rqmt_qty(double value) {
		setConstNumber(offset + 36, $cont_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（固定必要数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_qty() {
		return getConstNumber(offset + 37, $cont_fxd_rqmt_qty);
	}

	/**
	 * 有効成分（固定必要数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 37, $cont_fxd_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（固定必要数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 37, $cont_fxd_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（固定必要数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 37, $cont_fxd_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（固定必要数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 37, $cont_fxd_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（固定必要数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 37, $cont_fxd_rqmt_qty, value);
	}
	
	/**
	 * 有効成分単位ＣＤ. Active ingredient unit cd..<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 38, $cont_fctr_unit_cd);
	}

	/**
	 * 有効成分単位ＣＤ. Active ingredient unit cd..<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 38, $cont_fctr_unit_cd, value);
	}

	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 39, $std_cont_fctr);
	}

	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 39, $std_cont_fctr, value);
	}
	
	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 39, $std_cont_fctr, value);
	}
	
	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 39, $std_cont_fctr, value);
	}
	
	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 39, $std_cont_fctr, value);
	}
	
	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 39, $std_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 40, $act_cont_fctr);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 40, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 40, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 40, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 40, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 40, $act_cont_fctr, value);
	}
	
	/**
	 * 支給区分. Supply type.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 41, $prov_typ);
	}

	/**
	 * 支給区分. Supply type.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 41, $prov_typ, value);
	}

	/**
	 * 投入理由ＣＤ. Input reason cd..<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return getConstString(offset + 42, $inpt_rsn_cd);
	}

	/**
	 * 投入理由ＣＤ. Input reason cd..<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		setConstString(offset + 42, $inpt_rsn_cd, value);
	}

	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return getConstNumber(offset + 43, $par_inst_qty);
	}

	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		setConstNumber(offset + 43, $par_inst_qty, value);
	}
	
	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public void par_inst_qty(int value) {
		setConstNumber(offset + 43, $par_inst_qty, value);
	}
	
	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public void par_inst_qty(long value) {
		setConstNumber(offset + 43, $par_inst_qty, value);
	}
	
	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public void par_inst_qty(float value) {
		setConstNumber(offset + 43, $par_inst_qty, value);
	}
	
	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public void par_inst_qty(double value) {
		setConstNumber(offset + 43, $par_inst_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return getConstNumber(offset + 44, $chd_inpt_qty);
	}

	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		setConstNumber(offset + 44, $chd_inpt_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		setConstNumber(offset + 44, $chd_inpt_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		setConstNumber(offset + 44, $chd_inpt_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		setConstNumber(offset + 44, $chd_inpt_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		setConstNumber(offset + 44, $chd_inpt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return getConstNumber(offset + 45, $chd_rqmt_qty);
	}

	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 45, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		setConstNumber(offset + 45, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		setConstNumber(offset + 45, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		setConstNumber(offset + 45, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		setConstNumber(offset + 45, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return getConstNumber(offset + 46, $fxd_chd_rqmt_qty);
	}

	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 46, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		setConstNumber(offset + 46, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		setConstNumber(offset + 46, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		setConstNumber(offset + 46, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		setConstNumber(offset + 46, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 引継対象子品目ＦＬＧ. Copy-from child item flg..<p>
	 *
	 */
	public boolean main_itm_flg() {
		return getConstBoolean(offset + 47, $main_itm_flg);
	}

	/**
	 * 引継対象子品目ＦＬＧ. Copy-from child item flg..<p>
	 *
	 */
	public void main_itm_flg(boolean value) {
		setConstBoolean(offset + 47, $main_itm_flg, value);
	}

	/**
	 * 指図時ロット指定ＦＬＧ. Lot specification at order flg..<p>
	 *
	 */
	public boolean inst_lot_fix_flg() {
		return getConstBoolean(offset + 48, $inst_lot_fix_flg);
	}

	/**
	 * 指図時ロット指定ＦＬＧ. Lot specification at order flg..<p>
	 *
	 */
	public void inst_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 48, $inst_lot_fix_flg, value);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 49, $disp_seq);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 49, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 49, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 49, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 49, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 49, $disp_seq, value);
	}
	
	/**
	 * ロット混在ＦＬＧ. Lot mixed flg..<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return getConstBoolean(offset + 50, $lot_mix_flg);
	}

	/**
	 * ロット混在ＦＬＧ. Lot mixed flg..<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		setConstBoolean(offset + 50, $lot_mix_flg, value);
	}

	/**
	 * サブロット混在ＦＬＧ. Sublot mixed flg..<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return getConstBoolean(offset + 51, $sublot_mix_flg);
	}

	/**
	 * サブロット混在ＦＬＧ. Sublot mixed flg..<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 51, $sublot_mix_flg, value);
	}

	/**
	 * ＢＯＭメモ１. BOM memo 1.<p>
	 *
	 */
	public String bom_memo1() {
		return getConstString(offset + 52, $bom_memo1);
	}

	/**
	 * ＢＯＭメモ１. BOM memo 1.<p>
	 *
	 */
	public void bom_memo1(String value) {
		setConstString(offset + 52, $bom_memo1, value);
	}

	/**
	 * ＢＯＭメモ２. BOM memo 2.<p>
	 *
	 */
	public String bom_memo2() {
		return getConstString(offset + 53, $bom_memo2);
	}

	/**
	 * ＢＯＭメモ２. BOM memo 2.<p>
	 *
	 */
	public void bom_memo2(String value) {
		setConstString(offset + 53, $bom_memo2, value);
	}

	/**
	 * ＢＯＭメモ３. BOM memo 3.<p>
	 *
	 */
	public String bom_memo3() {
		return getConstString(offset + 54, $bom_memo3);
	}

	/**
	 * ＢＯＭメモ３. BOM memo 3.<p>
	 *
	 */
	public void bom_memo3(String value) {
		setConstString(offset + 54, $bom_memo3, value);
	}

	/**
	 * 収率計算用ＦＬＧ. Yield calculation flg..<p>
	 *
	 */
	public boolean yield_calc_flg() {
		return getConstBoolean(offset + 55, $yield_calc_flg);
	}

	/**
	 * 収率計算用ＦＬＧ. Yield calculation flg..<p>
	 *
	 */
	public void yield_calc_flg(boolean value) {
		setConstBoolean(offset + 55, $yield_calc_flg, value);
	}

	/**
	 * 引当ＦＬＧ. Allocation flg..<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 56, $alloc_flg);
	}

	/**
	 * 引当ＦＬＧ. Allocation flg..<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 56, $alloc_flg, value);
	}

	/**
	 * 基準単位代替元数量. Base unit alternative sources qty..<p>
	 *
	 */
	public MCNumber base_unit_alt_qty() {
		return getConstNumber(offset + 57, $base_unit_alt_qty);
	}

	/**
	 * 基準単位代替元数量. Base unit alternative sources qty..<p>
	 *
	 */
	public void base_unit_alt_qty(MCNumber value) {
		setConstNumber(offset + 57, $base_unit_alt_qty, value);
	}
	
	/**
	 * 基準単位代替元数量. Base unit alternative sources qty..<p>
	 *
	 */
	public void base_unit_alt_qty(int value) {
		setConstNumber(offset + 57, $base_unit_alt_qty, value);
	}
	
	/**
	 * 基準単位代替元数量. Base unit alternative sources qty..<p>
	 *
	 */
	public void base_unit_alt_qty(long value) {
		setConstNumber(offset + 57, $base_unit_alt_qty, value);
	}
	
	/**
	 * 基準単位代替元数量. Base unit alternative sources qty..<p>
	 *
	 */
	public void base_unit_alt_qty(float value) {
		setConstNumber(offset + 57, $base_unit_alt_qty, value);
	}
	
	/**
	 * 基準単位代替元数量. Base unit alternative sources qty..<p>
	 *
	 */
	public void base_unit_alt_qty(double value) {
		setConstNumber(offset + 57, $base_unit_alt_qty, value);
	}
	
	/**
	 * 代替品目指定ＦＬＧ. Alternative item specification flg..<p>
	 *
	 */
	public boolean alt_itm_fix_flg() {
		return getConstBoolean(offset + 58, $alt_itm_fix_flg);
	}

	/**
	 * 代替品目指定ＦＬＧ. Alternative item specification flg..<p>
	 *
	 */
	public void alt_itm_fix_flg(boolean value) {
		setConstBoolean(offset + 58, $alt_itm_fix_flg, value);
	}

	/**
	 * 代替品目選択区分. Alternative item selection type.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 59, $alt_itm_typ);
	}

	/**
	 * 代替品目選択区分. Alternative item selection type.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 59, $alt_itm_typ, value);
	}

	/**
	 * 代替品目引当優先順位. Alternative item allocation priority.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 60, $alt_alloc_prio);
	}

	/**
	 * 代替品目引当優先順位. Alternative item allocation priority.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 60, $alt_alloc_prio, value);
	}
	
	/**
	 * 代替品目引当優先順位. Alternative item allocation priority.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 60, $alt_alloc_prio, value);
	}
	
	/**
	 * 代替品目引当優先順位. Alternative item allocation priority.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 60, $alt_alloc_prio, value);
	}
	
	/**
	 * 代替品目引当優先順位. Alternative item allocation priority.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 60, $alt_alloc_prio, value);
	}
	
	/**
	 * 代替品目引当優先順位. Alternative item allocation priority.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 60, $alt_alloc_prio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 61, $alt_itm_ratio);
	}

	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 61, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 61, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 61, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 61, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 61, $alt_itm_ratio, value);
	}
	
	/**
	 * 引当制御区分. Allocation control type.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 62, $alloc_ctl_typ);
	}

	/**
	 * 引当制御区分. Allocation control type.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 62, $alloc_ctl_typ, value);
	}

	/**
	 * 投入制御区分. Input control type.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 63, $inpt_ctl_typ);
	}

	/**
	 * 投入制御区分. Input control type.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 63, $inpt_ctl_typ, value);
	}

	/**
	 * 投入オフセット区分. Input offset type.<p>
	 *
	 */
	public String in_offst_typ() {
		return getConstString(offset + 64, $in_offst_typ);
	}

	/**
	 * 投入オフセット区分. Input offset type.<p>
	 *
	 */
	public void in_offst_typ(String value) {
		setConstString(offset + 64, $in_offst_typ, value);
	}

	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public MCNumber in_offst() {
		return getConstNumber(offset + 65, $in_offst);
	}

	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public void in_offst(MCNumber value) {
		setConstNumber(offset + 65, $in_offst, value);
	}
	
	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public void in_offst(int value) {
		setConstNumber(offset + 65, $in_offst, value);
	}
	
	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public void in_offst(long value) {
		setConstNumber(offset + 65, $in_offst, value);
	}
	
	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public void in_offst(float value) {
		setConstNumber(offset + 65, $in_offst, value);
	}
	
	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public void in_offst(double value) {
		setConstNumber(offset + 65, $in_offst, value);
	}
	
	/**
	 * 工程内ＢＯＭ識別番号. In-operation BOM identification number.<p>
	 *
	 */
	public MCNumber bom_id_no() {
		return getConstNumber(offset + 66, $bom_id_no);
	}

	/**
	 * 工程内ＢＯＭ識別番号. In-operation BOM identification number.<p>
	 *
	 */
	public void bom_id_no(MCNumber value) {
		setConstNumber(offset + 66, $bom_id_no, value);
	}
	
	/**
	 * 工程内ＢＯＭ識別番号. In-operation BOM identification number.<p>
	 *
	 */
	public void bom_id_no(int value) {
		setConstNumber(offset + 66, $bom_id_no, value);
	}
	
	/**
	 * 工程内ＢＯＭ識別番号. In-operation BOM identification number.<p>
	 *
	 */
	public void bom_id_no(long value) {
		setConstNumber(offset + 66, $bom_id_no, value);
	}
	
	/**
	 * 工程内ＢＯＭ識別番号. In-operation BOM identification number.<p>
	 *
	 */
	public void bom_id_no(float value) {
		setConstNumber(offset + 66, $bom_id_no, value);
	}
	
	/**
	 * 工程内ＢＯＭ識別番号. In-operation BOM identification number.<p>
	 *
	 */
	public void bom_id_no(double value) {
		setConstNumber(offset + 66, $bom_id_no, value);
	}
	
	/**
	 * 同一子品目連番. Allow same child item sequence number.<p>
	 *
	 */
	public MCNumber chd_itm_seq() {
		return getConstNumber(offset + 67, $chd_itm_seq);
	}

	/**
	 * 同一子品目連番. Allow same child item sequence number.<p>
	 *
	 */
	public void chd_itm_seq(MCNumber value) {
		setConstNumber(offset + 67, $chd_itm_seq, value);
	}
	
	/**
	 * 同一子品目連番. Allow same child item sequence number.<p>
	 *
	 */
	public void chd_itm_seq(int value) {
		setConstNumber(offset + 67, $chd_itm_seq, value);
	}
	
	/**
	 * 同一子品目連番. Allow same child item sequence number.<p>
	 *
	 */
	public void chd_itm_seq(long value) {
		setConstNumber(offset + 67, $chd_itm_seq, value);
	}
	
	/**
	 * 同一子品目連番. Allow same child item sequence number.<p>
	 *
	 */
	public void chd_itm_seq(float value) {
		setConstNumber(offset + 67, $chd_itm_seq, value);
	}
	
	/**
	 * 同一子品目連番. Allow same child item sequence number.<p>
	 *
	 */
	public void chd_itm_seq(double value) {
		setConstNumber(offset + 67, $chd_itm_seq, value);
	}
	
	/**
	 * 再計算グループ. Re-calculation group.<p>
	 *
	 */
	public MCNumber recalc_grp() {
		return getConstNumber(offset + 68, $recalc_grp);
	}

	/**
	 * 再計算グループ. Re-calculation group.<p>
	 *
	 */
	public void recalc_grp(MCNumber value) {
		setConstNumber(offset + 68, $recalc_grp, value);
	}
	
	/**
	 * 再計算グループ. Re-calculation group.<p>
	 *
	 */
	public void recalc_grp(int value) {
		setConstNumber(offset + 68, $recalc_grp, value);
	}
	
	/**
	 * 再計算グループ. Re-calculation group.<p>
	 *
	 */
	public void recalc_grp(long value) {
		setConstNumber(offset + 68, $recalc_grp, value);
	}
	
	/**
	 * 再計算グループ. Re-calculation group.<p>
	 *
	 */
	public void recalc_grp(float value) {
		setConstNumber(offset + 68, $recalc_grp, value);
	}
	
	/**
	 * 再計算グループ. Re-calculation group.<p>
	 *
	 */
	public void recalc_grp(double value) {
		setConstNumber(offset + 68, $recalc_grp, value);
	}
	
	/**
	 * 再計算グループ連番. Re-calculation group sequence number.<p>
	 *
	 */
	public MCNumber recalc_grp_seq() {
		return getConstNumber(offset + 69, $recalc_grp_seq);
	}

	/**
	 * 再計算グループ連番. Re-calculation group sequence number.<p>
	 *
	 */
	public void recalc_grp_seq(MCNumber value) {
		setConstNumber(offset + 69, $recalc_grp_seq, value);
	}
	
	/**
	 * 再計算グループ連番. Re-calculation group sequence number.<p>
	 *
	 */
	public void recalc_grp_seq(int value) {
		setConstNumber(offset + 69, $recalc_grp_seq, value);
	}
	
	/**
	 * 再計算グループ連番. Re-calculation group sequence number.<p>
	 *
	 */
	public void recalc_grp_seq(long value) {
		setConstNumber(offset + 69, $recalc_grp_seq, value);
	}
	
	/**
	 * 再計算グループ連番. Re-calculation group sequence number.<p>
	 *
	 */
	public void recalc_grp_seq(float value) {
		setConstNumber(offset + 69, $recalc_grp_seq, value);
	}
	
	/**
	 * 再計算グループ連番. Re-calculation group sequence number.<p>
	 *
	 */
	public void recalc_grp_seq(double value) {
		setConstNumber(offset + 69, $recalc_grp_seq, value);
	}
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 70, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 70, $can_flg, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 71, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 71, $intr_rmrks, value);
	}

	/**
	 * 指図書備考. Order sheet remarks.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 72, $inst_rpt_rmrks);
	}

	/**
	 * 指図書備考. Order sheet remarks.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 72, $inst_rpt_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 73, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 73, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 74, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 74, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 75, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 75, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 76, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 76, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 77, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 77, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 78, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 78, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 79, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 79, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 80, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 81, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 81, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 82, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 82, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 83, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 83, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 84, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 84, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 85, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 85, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			return alloc_sno1();
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			return alloc_sno2();
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			return alloc_sno3();
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			return alloc_sno4();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($bom_memo1.equalsIgnoreCase(name)) {
			return bom_memo1();
		}
		if ($bom_memo2.equalsIgnoreCase(name)) {
			return bom_memo2();
		}
		if ($bom_memo3.equalsIgnoreCase(name)) {
			return bom_memo3();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			return par_inst_qty();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			return base_unit_alt_qty();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			return bom_id_no();
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			return chd_itm_seq();
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			return schd_tm();
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return inst_lot_fix_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			return alloc_sno1();
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			return alloc_sno2();
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			return alloc_sno3();
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			return alloc_sno4();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($bom_memo1.equalsIgnoreCase(name)) {
			return bom_memo1();
		}
		if ($bom_memo2.equalsIgnoreCase(name)) {
			return bom_memo2();
		}
		if ($bom_memo3.equalsIgnoreCase(name)) {
			return bom_memo3();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			return par_inst_qty();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			return base_unit_alt_qty();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			return bom_id_no();
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			return chd_itm_seq();
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			return schd_tm();
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return inst_lot_fix_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			alloc_sno1(value);
			return;
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			alloc_sno2(value);
			return;
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			alloc_sno3(value);
			return;
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			alloc_sno4(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($bom_memo1.equalsIgnoreCase(name)) {
			bom_memo1(value);
			return;
		}
		if ($bom_memo2.equalsIgnoreCase(name)) {
			bom_memo2(value);
			return;
		}
		if ($bom_memo3.equalsIgnoreCase(name)) {
			bom_memo3(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			schd_tm(value);
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			inst_lot_fix_flg(value);
			return;
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			lot_mix_flg(value);
			return;
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			sublot_mix_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			alloc_sno1(value);
			return;
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			alloc_sno2(value);
			return;
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			alloc_sno3(value);
			return;
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			alloc_sno4(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($bom_memo1.equalsIgnoreCase(name)) {
			bom_memo1(value);
			return;
		}
		if ($bom_memo2.equalsIgnoreCase(name)) {
			bom_memo2(value);
			return;
		}
		if ($bom_memo3.equalsIgnoreCase(name)) {
			bom_memo3(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			schd_tm(value);
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			inst_lot_fix_flg(value);
			return;
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			lot_mix_flg(value);
			return;
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			sublot_mix_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
