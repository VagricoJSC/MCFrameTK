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
 * "ＢＯＭマスタ // BOM master"DBコンテナRowクラスです。<p>
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
 *  	<td>bom_key</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＢＯＭキー</td>
 *  	<td>BOM key</td>
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
 *  	<td>par_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親品目ＣＤ</td>
 *  	<td>Parent item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親枝番１</td>
 *  	<td>Parent branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親枝番２</td>
 *  	<td>Parent branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親枝番３</td>
 *  	<td>Parent branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bom_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成パタン</td>
 *  	<td>BOM pattern</td>
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
 *  	<td>chd_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目ＣＤ</td>
 *  	<td>Child item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子枝番１</td>
 *  	<td>Child branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子枝番２</td>
 *  	<td>Child branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子枝番３</td>
 *  	<td>Child branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ver_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>版ＮＯ</td>
 *  	<td>Version No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ph_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>架空ＦＬＧ</td>
 *  	<td>Phantom flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ph_bom_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>架空構成パタン</td>
 *  	<td>Phantom BOM pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alt_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代替品目ＦＬＧ</td>
 *  	<td>Alternative item flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alt_grp_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替グループＣＤ</td>
 *  	<td>Alternative group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alt_itm_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替品目選択区分</td>
 *  	<td>Alternative item selection type</td>
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
 *  	<td>alt_alloc_prio</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当優先順</td>
 *  	<td>Allocation priority</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno_typ1</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１区分</td>
 *  	<td>SEIBAN No. 1 type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno_typ2</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２区分</td>
 *  	<td>SEIBAN No. 2 type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno_typ3</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３区分</td>
 *  	<td>SEIBAN No. 3 type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno_typ4</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４区分</td>
 *  	<td>SEIBAN No. 4 type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>min_sno1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>下限手配ＮＯ１</td>
 *  	<td>Min. SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>max_sno1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>上限手配ＮＯ１</td>
 *  	<td>Max. SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>min_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>下限手配ＮＯ２</td>
 *  	<td>Min. SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>max_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>上限手配ＮＯ２</td>
 *  	<td>Max. SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>min_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>下限手配ＮＯ３</td>
 *  	<td>Min. SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>max_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>上限手配ＮＯ３</td>
 *  	<td>Max. SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>min_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>下限手配ＮＯ４</td>
 *  	<td>Min. SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>max_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>上限手配ＮＯ４</td>
 *  	<td>Max. SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親指図数量</td>
 *  	<td>Parent order qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_inpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子投入数量</td>
 *  	<td>Child input qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子必要数量</td>
 *  	<td>Child required qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fxd_chd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子固定必要数量</td>
 *  	<td>Child fixed required qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>byprod_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>副産品ＦＬＧ</td>
 *  	<td>By-product flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_offst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入オフセット区分</td>
 *  	<td>Input offset type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_offst</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入オフセット</td>
 *  	<td>Input offset</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bkf_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>バックフラッシュ区分</td>
 *  	<td>Backflush type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_lot_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>指図時ロット指定ＦＬＧ</td>
 *  	<td>Lot specification at order flg.</td>
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
 *  	<td>yield_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>収率計算用ＦＬＧ</td>
 *  	<td>Yield calculation flg.</td>
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
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>表示順</td>
 *  	<td>Display order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chng_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>変更ＮＯ</td>
 *  	<td>Change No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_sys_no_bom</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムＮＯ</td>
 *  	<td>External system No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_cost_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価対象外ＦＬＧ</td>
 *  	<td>Not costing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用開始日</td>
 *  	<td>Application start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用終了日</td>
 *  	<td>Application end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>WG1.WG_NM</td>
 *  	<td>ワーキンググループ名</td>
 *  	<td>WG name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>OPER1.OPER_NM</td>
 *  	<td>工程名</td>
 *  	<td>Operation name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alt_grp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ALT_GRP1.ALT_GRP_NM</td>
 *  	<td>代替グループ名</td>
 *  	<td>Alternative group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>親品名</td>
 *  	<td>Parent item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM2.ITM_NM</td>
 *  	<td>子品名</td>
 *  	<td>Child item name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_BOM_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_BOM";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * ＢＯＭキー. BOM key.<p>
	 *
	 */
	public static final String $bom_key = "bom_key";
	private static final MCPermColumnInfo _bom_key = createColumnInfo("bom_key");
	public final MCStringPermColumn bom_key = createStringColumn(_bom_key);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	private static final MCPermColumnInfo _par_itm_cd = createColumnInfo("par_itm_cd");
	public final MCStringPermColumn par_itm_cd = createStringColumn(_par_itm_cd);
	
	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	private static final MCPermColumnInfo _par_itm_sub1 = createColumnInfo("par_itm_sub1");
	public final MCStringPermColumn par_itm_sub1 = createStringColumn(_par_itm_sub1);
	
	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	private static final MCPermColumnInfo _par_itm_sub2 = createColumnInfo("par_itm_sub2");
	public final MCStringPermColumn par_itm_sub2 = createStringColumn(_par_itm_sub2);
	
	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	private static final MCPermColumnInfo _par_itm_sub3 = createColumnInfo("par_itm_sub3");
	public final MCStringPermColumn par_itm_sub3 = createStringColumn(_par_itm_sub3);
	
	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	private static final MCPermColumnInfo _bom_ptn = createColumnInfo("bom_ptn");
	public final MCStringPermColumn bom_ptn = createStringColumn(_bom_ptn);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	private static final MCPermColumnInfo _oper_seq = createColumnInfo("oper_seq");
	public final MCNumberPermColumn oper_seq = createNumberColumn(_oper_seq);
	
	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public static final String $chd_itm_cd = "chd_itm_cd";
	private static final MCPermColumnInfo _chd_itm_cd = createColumnInfo("chd_itm_cd");
	public final MCStringPermColumn chd_itm_cd = createStringColumn(_chd_itm_cd);
	
	/**
	 * 子枝番１. Child branch No. 1.<p>
	 *
	 */
	public static final String $chd_itm_sub1 = "chd_itm_sub1";
	private static final MCPermColumnInfo _chd_itm_sub1 = createColumnInfo("chd_itm_sub1");
	public final MCStringPermColumn chd_itm_sub1 = createStringColumn(_chd_itm_sub1);
	
	/**
	 * 子枝番２. Child branch No. 2.<p>
	 *
	 */
	public static final String $chd_itm_sub2 = "chd_itm_sub2";
	private static final MCPermColumnInfo _chd_itm_sub2 = createColumnInfo("chd_itm_sub2");
	public final MCStringPermColumn chd_itm_sub2 = createStringColumn(_chd_itm_sub2);
	
	/**
	 * 子枝番３. Child branch No. 3.<p>
	 *
	 */
	public static final String $chd_itm_sub3 = "chd_itm_sub3";
	private static final MCPermColumnInfo _chd_itm_sub3 = createColumnInfo("chd_itm_sub3");
	public final MCStringPermColumn chd_itm_sub3 = createStringColumn(_chd_itm_sub3);
	
	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
	/**
	 * 架空ＦＬＧ. Phantom flg..<p>
	 *
	 */
	public static final String $ph_flg = "ph_flg";
	private static final MCPermColumnInfo _ph_flg = createColumnInfo("ph_flg");
	public final MCBooleanPermColumn ph_flg = createBooleanColumn(_ph_flg);
	
	/**
	 * 架空構成パタン. Phantom BOM pattern.<p>
	 *
	 */
	public static final String $ph_bom_ptn = "ph_bom_ptn";
	private static final MCPermColumnInfo _ph_bom_ptn = createColumnInfo("ph_bom_ptn");
	public final MCStringPermColumn ph_bom_ptn = createStringColumn(_ph_bom_ptn);
	
	/**
	 * 代替品目ＦＬＧ. Alternative item flg..<p>
	 *
	 */
	public static final String $alt_itm_flg = "alt_itm_flg";
	private static final MCPermColumnInfo _alt_itm_flg = createColumnInfo("alt_itm_flg");
	public final MCBooleanPermColumn alt_itm_flg = createBooleanColumn(_alt_itm_flg);
	
	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	private static final MCPermColumnInfo _alt_grp_cd = createColumnInfo("alt_grp_cd");
	public final MCStringPermColumn alt_grp_cd = createStringColumn(_alt_grp_cd);
	
	/**
	 * 代替品目選択区分. Alternative item selection type.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	private static final MCPermColumnInfo _alt_itm_typ = createColumnInfo("alt_itm_typ");
	public final MCStringPermColumn alt_itm_typ = createStringColumn(_alt_itm_typ);
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	private static final MCPermColumnInfo _alt_itm_ratio = createColumnInfo("alt_itm_ratio");
	public final MCNumberPermColumn alt_itm_ratio = createNumberColumn(_alt_itm_ratio);
	
	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
	private static final MCPermColumnInfo _alt_alloc_prio = createColumnInfo("alt_alloc_prio");
	public final MCNumberPermColumn alt_alloc_prio = createNumberColumn(_alt_alloc_prio);
	
	/**
	 * 手配ＮＯ１区分. SEIBAN No. 1 type.<p>
	 *
	 */
	public static final String $sno_typ1 = "sno_typ1";
	private static final MCPermColumnInfo _sno_typ1 = createColumnInfo("sno_typ1");
	public final MCStringPermColumn sno_typ1 = createStringColumn(_sno_typ1);
	
	/**
	 * 手配ＮＯ２区分. SEIBAN No. 2 type.<p>
	 *
	 */
	public static final String $sno_typ2 = "sno_typ2";
	private static final MCPermColumnInfo _sno_typ2 = createColumnInfo("sno_typ2");
	public final MCStringPermColumn sno_typ2 = createStringColumn(_sno_typ2);
	
	/**
	 * 手配ＮＯ３区分. SEIBAN No. 3 type.<p>
	 *
	 */
	public static final String $sno_typ3 = "sno_typ3";
	private static final MCPermColumnInfo _sno_typ3 = createColumnInfo("sno_typ3");
	public final MCStringPermColumn sno_typ3 = createStringColumn(_sno_typ3);
	
	/**
	 * 手配ＮＯ４区分. SEIBAN No. 4 type.<p>
	 *
	 */
	public static final String $sno_typ4 = "sno_typ4";
	private static final MCPermColumnInfo _sno_typ4 = createColumnInfo("sno_typ4");
	public final MCStringPermColumn sno_typ4 = createStringColumn(_sno_typ4);
	
	/**
	 * 下限手配ＮＯ１. Min. SEIBAN No. 1.<p>
	 *
	 */
	public static final String $min_sno1 = "min_sno1";
	private static final MCPermColumnInfo _min_sno1 = createColumnInfo("min_sno1");
	public final MCStringPermColumn min_sno1 = createStringColumn(_min_sno1);
	
	/**
	 * 上限手配ＮＯ１. Max. SEIBAN No. 1.<p>
	 *
	 */
	public static final String $max_sno1 = "max_sno1";
	private static final MCPermColumnInfo _max_sno1 = createColumnInfo("max_sno1");
	public final MCStringPermColumn max_sno1 = createStringColumn(_max_sno1);
	
	/**
	 * 下限手配ＮＯ２. Min. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $min_sno2 = "min_sno2";
	private static final MCPermColumnInfo _min_sno2 = createColumnInfo("min_sno2");
	public final MCStringPermColumn min_sno2 = createStringColumn(_min_sno2);
	
	/**
	 * 上限手配ＮＯ２. Max. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $max_sno2 = "max_sno2";
	private static final MCPermColumnInfo _max_sno2 = createColumnInfo("max_sno2");
	public final MCStringPermColumn max_sno2 = createStringColumn(_max_sno2);
	
	/**
	 * 下限手配ＮＯ３. Min. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $min_sno3 = "min_sno3";
	private static final MCPermColumnInfo _min_sno3 = createColumnInfo("min_sno3");
	public final MCStringPermColumn min_sno3 = createStringColumn(_min_sno3);
	
	/**
	 * 上限手配ＮＯ３. Max. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $max_sno3 = "max_sno3";
	private static final MCPermColumnInfo _max_sno3 = createColumnInfo("max_sno3");
	public final MCStringPermColumn max_sno3 = createStringColumn(_max_sno3);
	
	/**
	 * 下限手配ＮＯ４. Min. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $min_sno4 = "min_sno4";
	private static final MCPermColumnInfo _min_sno4 = createColumnInfo("min_sno4");
	public final MCStringPermColumn min_sno4 = createStringColumn(_min_sno4);
	
	/**
	 * 上限手配ＮＯ４. Max. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $max_sno4 = "max_sno4";
	private static final MCPermColumnInfo _max_sno4 = createColumnInfo("max_sno4");
	public final MCStringPermColumn max_sno4 = createStringColumn(_max_sno4);
	
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
	 * 副産品ＦＬＧ. By-product flg..<p>
	 *
	 */
	public static final String $byprod_flg = "byprod_flg";
	private static final MCPermColumnInfo _byprod_flg = createColumnInfo("byprod_flg");
	public final MCBooleanPermColumn byprod_flg = createBooleanColumn(_byprod_flg);
	
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
	 * バックフラッシュ区分. Backflush type.<p>
	 *
	 */
	public static final String $bkf_typ = "bkf_typ";
	private static final MCPermColumnInfo _bkf_typ = createColumnInfo("bkf_typ");
	public final MCStringPermColumn bkf_typ = createStringColumn(_bkf_typ);
	
	/**
	 * 指図時ロット指定ＦＬＧ. Lot specification at order flg..<p>
	 *
	 */
	public static final String $inst_lot_fix_flg = "inst_lot_fix_flg";
	private static final MCPermColumnInfo _inst_lot_fix_flg = createColumnInfo("inst_lot_fix_flg");
	public final MCBooleanPermColumn inst_lot_fix_flg = createBooleanColumn(_inst_lot_fix_flg);
	
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
	 * 引当制御区分. Allocation control type.<p>
	 *
	 */
	public static final String $alloc_ctl_typ = "alloc_ctl_typ";
	private static final MCPermColumnInfo _alloc_ctl_typ = createColumnInfo("alloc_ctl_typ");
	public final MCStringPermColumn alloc_ctl_typ = createStringColumn(_alloc_ctl_typ);
	
	/**
	 * 引継対象子品目ＦＬＧ. Copy-from child item flg..<p>
	 *
	 */
	public static final String $main_itm_flg = "main_itm_flg";
	private static final MCPermColumnInfo _main_itm_flg = createColumnInfo("main_itm_flg");
	public final MCBooleanPermColumn main_itm_flg = createBooleanColumn(_main_itm_flg);
	
	/**
	 * 収率計算用ＦＬＧ. Yield calculation flg..<p>
	 *
	 */
	public static final String $yield_calc_flg = "yield_calc_flg";
	private static final MCPermColumnInfo _yield_calc_flg = createColumnInfo("yield_calc_flg");
	public final MCBooleanPermColumn yield_calc_flg = createBooleanColumn(_yield_calc_flg);
	
	/**
	 * 投入制御区分. Input control type.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	private static final MCPermColumnInfo _inpt_ctl_typ = createColumnInfo("inpt_ctl_typ");
	public final MCStringPermColumn inpt_ctl_typ = createStringColumn(_inpt_ctl_typ);
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
	/**
	 * 変更ＮＯ. Change No..<p>
	 *
	 */
	public static final String $chng_no = "chng_no";
	private static final MCPermColumnInfo _chng_no = createColumnInfo("chng_no");
	public final MCStringPermColumn chng_no = createStringColumn(_chng_no);
	
	/**
	 * 外部システムＮＯ. External system No..<p>
	 *
	 */
	public static final String $ext_sys_no_bom = "ext_sys_no_bom";
	private static final MCPermColumnInfo _ext_sys_no_bom = createColumnInfo("ext_sys_no_bom");
	public final MCStringPermColumn ext_sys_no_bom = createStringColumn(_ext_sys_no_bom);
	
	/**
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public static final String $not_cost_flg = "not_cost_flg";
	private static final MCPermColumnInfo _not_cost_flg = createColumnInfo("not_cost_flg");
	public final MCBooleanPermColumn not_cost_flg = createBooleanColumn(_not_cost_flg);
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	private static final MCPermColumnInfo _st_dt = createColumnInfo("st_dt");
	public final MCDatePermColumn st_dt = createDateColumn(_st_dt);
	
	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	private static final MCPermColumnInfo _end_dt = createColumnInfo("end_dt");
	public final MCDatePermColumn end_dt = createDateColumn(_end_dt);
	
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
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	
	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	
	/**
	 * 代替グループ名. Alternative group name.<p>
	 *
	 */
	public static final String $alt_grp_nm = "alt_grp_nm";
	
	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
	
	/**
	 * 子品名. Child item name.<p>
	 *
	 */
	public static final String $chd_itm_nm = "chd_itm_nm";
	
	public static final MCMeta bom_key_META = createCommonMeta($bom_key, mcframe.commonMA.meta.MA_META.BOM_KEY);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta chd_itm_cd_META = createCommonMeta($chd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chd_itm_sub1_META = createCommonMeta($chd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta chd_itm_sub2_META = createCommonMeta($chd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta chd_itm_sub3_META = createCommonMeta($chd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta ph_flg_META = createCommonMeta($ph_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ph_bom_ptn_META = createCommonMeta($ph_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta alt_itm_flg_META = createCommonMeta($alt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sno_typ1_META = createCommonMeta($sno_typ1, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ2_META = createCommonMeta($sno_typ2, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ3_META = createCommonMeta($sno_typ3, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ4_META = createCommonMeta($sno_typ4, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta min_sno1_META = createCommonMeta($min_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta max_sno1_META = createCommonMeta($max_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta min_sno2_META = createCommonMeta($min_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta max_sno2_META = createCommonMeta($max_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta min_sno3_META = createCommonMeta($min_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta max_sno3_META = createCommonMeta($max_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta min_sno4_META = createCommonMeta($min_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta max_sno4_META = createCommonMeta($max_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta par_inst_qty_META = createCommonMeta($par_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_inpt_qty_META = createCommonMeta($chd_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_rqmt_qty_META = createCommonMeta($chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_chd_rqmt_qty_META = createCommonMeta($fxd_chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta byprod_flg_META = createCommonMeta($byprod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_offst_typ_META = createCommonMeta($in_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta in_offst_META = createCommonMeta($in_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta inst_lot_fix_flg_META = createCommonMeta($inst_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mix_flg_META = createCommonMeta($lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mix_flg_META = createCommonMeta($sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_ctl_typ_META = createCommonMeta($alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta main_itm_flg_META = createCommonMeta($main_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_calc_flg_META = createCommonMeta($yield_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta chng_no_META = createCommonMeta($chng_no, mcframe.commonMA.meta.MA_META.CHNG_NO);
	public static final MCMeta ext_sys_no_bom_META = createCommonMeta($ext_sys_no_bom, mcframe.commonMA.meta.MA_META.EXT_SYS_NO_BOM);
	public static final MCMeta not_cost_flg_META = createCommonMeta($not_cost_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
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
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta alt_grp_nm_META = createCommonMeta($alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta chd_itm_nm_META = createCommonMeta($chd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $WG1 = "WG1";
	public static final String $OPER1 = "OPER1";
	public static final String $ALT_GRP1 = "ALT_GRP1";
	public static final String $ITM1 = "ITM1";
	public static final String $ITM2 = "ITM2";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_WG",
				$WG1,
				new String[][]{
						{"wg_cd", "wg_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
				},
				(alias) -> {
					MAM_BOM_R own = MAM_BOM_R.create(alias);
					mcframe.serverMA.dbc.MAM_WG_R ref = mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.wg_cd.eq(ref.wg_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_OPER",
				$OPER1,
				new String[][]{
						{"oper_cd", "oper_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_OPER_R.create("OPER1");
				},
				(alias) -> {
					MAM_BOM_R own = MAM_BOM_R.create(alias);
					mcframe.serverMA.dbc.MAM_OPER_R ref = mcframe.serverMA.dbc.MAM_OPER_R.create("OPER1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.oper_cd.eq(ref.oper_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ALT_GRP_",
				$ALT_GRP1,
				new String[][]{
						{"alt_grp_cd", "alt_grp_cd"},
						{"wg_cd", "wg_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ALT_GRP__R.create("ALT_GRP1");
				},
				(alias) -> {
					MAM_BOM_R own = MAM_BOM_R.create(alias);
					mcframe.serverMA.dbc.MAM_ALT_GRP__R ref = mcframe.serverMA.dbc.MAM_ALT_GRP__R.create("ALT_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.alt_grp_cd.eq(ref.alt_grp_cd));
					cond = cond.and(own.wg_cd.eq(ref.wg_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM1,
				new String[][]{
						{"par_itm_cd", "itm_cd"},
						{"par_itm_sub1", "itm_sub1"},
						{"par_itm_sub2", "itm_sub2"},
						{"par_itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
				},
				(alias) -> {
					MAM_BOM_R own = MAM_BOM_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.par_itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.par_itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.par_itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.par_itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM2,
				new String[][]{
						{"chd_itm_cd", "itm_cd"},
						{"chd_itm_sub1", "itm_sub1"},
						{"chd_itm_sub2", "itm_sub2"},
						{"chd_itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM2");
				},
				(alias) -> {
					MAM_BOM_R own = MAM_BOM_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.chd_itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.chd_itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.chd_itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.chd_itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_BOM_R> constMetas = new ConstMetaList<MAM_BOM_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			bom_key_META,
			wg_cd_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			bom_ptn_META,
			oper_cd_META,
			oper_seq_META,
			chd_itm_cd_META,
			chd_itm_sub1_META,
			chd_itm_sub2_META,
			chd_itm_sub3_META,
			ver_no_META,
			ph_flg_META,
			ph_bom_ptn_META,
			alt_itm_flg_META,
			alt_grp_cd_META,
			alt_itm_typ_META,
			alt_itm_ratio_META,
			alt_alloc_prio_META,
			sno_typ1_META,
			sno_typ2_META,
			sno_typ3_META,
			sno_typ4_META,
			min_sno1_META,
			max_sno1_META,
			min_sno2_META,
			max_sno2_META,
			min_sno3_META,
			max_sno3_META,
			min_sno4_META,
			max_sno4_META,
			par_inst_qty_META,
			chd_inpt_qty_META,
			chd_rqmt_qty_META,
			fxd_chd_rqmt_qty_META,
			byprod_flg_META,
			in_offst_typ_META,
			in_offst_META,
			bkf_typ_META,
			inst_lot_fix_flg_META,
			lot_mix_flg_META,
			sublot_mix_flg_META,
			alloc_ctl_typ_META,
			main_itm_flg_META,
			yield_calc_flg_META,
			inpt_ctl_typ_META,
			disp_seq_META,
			chng_no_META,
			ext_sys_no_bom_META,
			not_cost_flg_META,
			st_dt_META,
			end_dt_META,
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
			wg_nm_META,
			oper_nm_META,
			alt_grp_nm_META,
			par_itm_nm_META,
			chd_itm_nm_META
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
	protected MAM_BOM_R(ConstMetaList<? extends MAM_BOM_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_BOM_R(ConstMetaList<? extends MAM_BOM_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_BOM_R.$bom_key,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$bom_key,
				"bom_key",
				bom_key,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$wg_cd,
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
			MAM_BOM_R.$par_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$par_itm_cd,
				"par_itm_cd",
				par_itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$par_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$par_itm_sub1,
				"par_itm_sub1",
				par_itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$par_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$par_itm_sub2,
				"par_itm_sub2",
				par_itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$par_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$par_itm_sub3,
				"par_itm_sub3",
				par_itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$bom_ptn,
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
			MAM_BOM_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$oper_cd,
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
			MAM_BOM_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BOM_R.$oper_seq,
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
			MAM_BOM_R.$chd_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$chd_itm_cd,
				"chd_itm_cd",
				chd_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$chd_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$chd_itm_sub1,
				"chd_itm_sub1",
				chd_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$chd_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$chd_itm_sub2,
				"chd_itm_sub2",
				chd_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$chd_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$chd_itm_sub3,
				"chd_itm_sub3",
				chd_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$ver_no,
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
			MAM_BOM_R.$ph_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BOM_R.$ph_flg,
				"ph_flg",
				ph_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$ph_bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$ph_bom_ptn,
				"ph_bom_ptn",
				ph_bom_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$alt_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BOM_R.$alt_itm_flg,
				"alt_itm_flg",
				alt_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$alt_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$alt_grp_cd,
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
			MAM_BOM_R.$alt_itm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$alt_itm_typ,
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
			MAM_BOM_R.$alt_itm_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BOM_R.$alt_itm_ratio,
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
			MAM_BOM_R.$alt_alloc_prio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BOM_R.$alt_alloc_prio,
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
			MAM_BOM_R.$sno_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$sno_typ1,
				"sno_typ1",
				sno_typ1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$sno_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$sno_typ2,
				"sno_typ2",
				sno_typ2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$sno_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$sno_typ3,
				"sno_typ3",
				sno_typ3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$sno_typ4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$sno_typ4,
				"sno_typ4",
				sno_typ4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$min_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$min_sno1,
				"min_sno1",
				min_sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$max_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$max_sno1,
				"max_sno1",
				max_sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$min_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$min_sno2,
				"min_sno2",
				min_sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$max_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$max_sno2,
				"max_sno2",
				max_sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$min_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$min_sno3,
				"min_sno3",
				min_sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$max_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$max_sno3,
				"max_sno3",
				max_sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$min_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$min_sno4,
				"min_sno4",
				min_sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$max_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$max_sno4,
				"max_sno4",
				max_sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$par_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BOM_R.$par_inst_qty,
				"par_inst_qty",
				par_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$chd_inpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BOM_R.$chd_inpt_qty,
				"chd_inpt_qty",
				chd_inpt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$chd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BOM_R.$chd_rqmt_qty,
				"chd_rqmt_qty",
				chd_rqmt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$fxd_chd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BOM_R.$fxd_chd_rqmt_qty,
				"fxd_chd_rqmt_qty",
				fxd_chd_rqmt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$byprod_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BOM_R.$byprod_flg,
				"byprod_flg",
				byprod_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$in_offst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$in_offst_typ,
				"in_offst_typ",
				in_offst_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$in_offst,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BOM_R.$in_offst,
				"in_offst",
				in_offst,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$bkf_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$bkf_typ,
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
			MAM_BOM_R.$inst_lot_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BOM_R.$inst_lot_fix_flg,
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
			MAM_BOM_R.$lot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BOM_R.$lot_mix_flg,
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
			MAM_BOM_R.$sublot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BOM_R.$sublot_mix_flg,
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
			MAM_BOM_R.$alloc_ctl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$alloc_ctl_typ,
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
			MAM_BOM_R.$main_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BOM_R.$main_itm_flg,
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
			MAM_BOM_R.$yield_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BOM_R.$yield_calc_flg,
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
			MAM_BOM_R.$inpt_ctl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$inpt_ctl_typ,
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
			MAM_BOM_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BOM_R.$disp_seq,
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
			MAM_BOM_R.$chng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$chng_no,
				"chng_no",
				chng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$ext_sys_no_bom,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$ext_sys_no_bom,
				"ext_sys_no_bom",
				ext_sys_no_bom,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$not_cost_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BOM_R.$not_cost_flg,
				"not_cost_flg",
				not_cost_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_BOM_R.$st_dt,
				"st_dt",
				st_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_BOM_R.$end_dt,
				"end_dt",
				end_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$memo1,
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
			MAM_BOM_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$memo2,
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
			MAM_BOM_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$memo3,
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
			MAM_BOM_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BOM_R.$del_flg,
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
			MAM_BOM_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$del_usr_id,
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
			MAM_BOM_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$del_usr_nm,
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
			MAM_BOM_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_BOM_R.$del_ts,
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
			MAM_BOM_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$ins_usr_id,
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
			MAM_BOM_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$ins_usr_nm,
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
			MAM_BOM_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_BOM_R.$ins_ts,
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
			MAM_BOM_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$ins_func_id,
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
			MAM_BOM_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BOM_R.$upd_cntr,
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
			MAM_BOM_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$upd_usr_id,
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
			MAM_BOM_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$upd_usr_nm,
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
			MAM_BOM_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_BOM_R.$upd_ts,
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
			MAM_BOM_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$upd_func_id,
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
			MAM_BOM_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$upd_srv_req_no,
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
			MAM_BOM_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$wg_nm,
				"wg_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"WG1.WG_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$oper_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$oper_nm,
				"oper_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"OPER1.OPER_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$alt_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$alt_grp_nm,
				"alt_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ALT_GRP1.ALT_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$par_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$par_itm_nm,
				"par_itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM1.ITM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_BOM_R.$chd_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BOM_R.$chd_itm_nm,
				"chd_itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM2.ITM_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_BOM_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_BOM_R create(String alias) {
		MAM_BOM_R row = new MAM_BOM_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_BOM_R createByName(T proto) {
		MAM_BOM_R row = MAM_BOM_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_BOM_R clone() {
		return (MAM_BOM_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_BOM_R createInstance() {
		return (MAM_BOM_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_BOM_R getValues(String... names) {
		return (MAM_BOM_R) super.getValues(names);
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
	 public MAW_BOM_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_BOM_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_BOM_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_BOM_KEY_R.TABLE_NAME);
	 }

	/**
	 * ＢＯＭキー. BOM key.<p>
	 *
	 */
	public String bom_key() {
		return getConstString(offset + 0, $bom_key);
	}

	/**
	 * ＢＯＭキー. BOM key.<p>
	 *
	 */
	public void bom_key(String value) {
		setConstString(offset + 0, $bom_key, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 2, $par_itm_cd);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 2, $par_itm_cd, value);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 3, $par_itm_sub1);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 3, $par_itm_sub1, value);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 4, $par_itm_sub2);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 4, $par_itm_sub2, value);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 5, $par_itm_sub3);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 5, $par_itm_sub3, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 6, $bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 6, $bom_ptn, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 7, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 7, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 8, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 8, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 8, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 8, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 8, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 8, $oper_seq, value);
	}
	
	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public String chd_itm_cd() {
		return getConstString(offset + 9, $chd_itm_cd);
	}

	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		setConstString(offset + 9, $chd_itm_cd, value);
	}

	/**
	 * 子枝番１. Child branch No. 1.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return getConstString(offset + 10, $chd_itm_sub1);
	}

	/**
	 * 子枝番１. Child branch No. 1.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		setConstString(offset + 10, $chd_itm_sub1, value);
	}

	/**
	 * 子枝番２. Child branch No. 2.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return getConstString(offset + 11, $chd_itm_sub2);
	}

	/**
	 * 子枝番２. Child branch No. 2.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		setConstString(offset + 11, $chd_itm_sub2, value);
	}

	/**
	 * 子枝番３. Child branch No. 3.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return getConstString(offset + 12, $chd_itm_sub3);
	}

	/**
	 * 子枝番３. Child branch No. 3.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		setConstString(offset + 12, $chd_itm_sub3, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 13, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 13, $ver_no, value);
	}

	/**
	 * 架空ＦＬＧ. Phantom flg..<p>
	 *
	 */
	public boolean ph_flg() {
		return getConstBoolean(offset + 14, $ph_flg);
	}

	/**
	 * 架空ＦＬＧ. Phantom flg..<p>
	 *
	 */
	public void ph_flg(boolean value) {
		setConstBoolean(offset + 14, $ph_flg, value);
	}

	/**
	 * 架空構成パタン. Phantom BOM pattern.<p>
	 *
	 */
	public String ph_bom_ptn() {
		return getConstString(offset + 15, $ph_bom_ptn);
	}

	/**
	 * 架空構成パタン. Phantom BOM pattern.<p>
	 *
	 */
	public void ph_bom_ptn(String value) {
		setConstString(offset + 15, $ph_bom_ptn, value);
	}

	/**
	 * 代替品目ＦＬＧ. Alternative item flg..<p>
	 *
	 */
	public boolean alt_itm_flg() {
		return getConstBoolean(offset + 16, $alt_itm_flg);
	}

	/**
	 * 代替品目ＦＬＧ. Alternative item flg..<p>
	 *
	 */
	public void alt_itm_flg(boolean value) {
		setConstBoolean(offset + 16, $alt_itm_flg, value);
	}

	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 17, $alt_grp_cd);
	}

	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 17, $alt_grp_cd, value);
	}

	/**
	 * 代替品目選択区分. Alternative item selection type.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 18, $alt_itm_typ);
	}

	/**
	 * 代替品目選択区分. Alternative item selection type.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 18, $alt_itm_typ, value);
	}

	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 19, $alt_itm_ratio);
	}

	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 19, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 19, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 19, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 19, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 19, $alt_itm_ratio, value);
	}
	
	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 20, $alt_alloc_prio);
	}

	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 20, $alt_alloc_prio, value);
	}
	
	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 20, $alt_alloc_prio, value);
	}
	
	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 20, $alt_alloc_prio, value);
	}
	
	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 20, $alt_alloc_prio, value);
	}
	
	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 20, $alt_alloc_prio, value);
	}
	
	/**
	 * 手配ＮＯ１区分. SEIBAN No. 1 type.<p>
	 *
	 */
	public String sno_typ1() {
		return getConstString(offset + 21, $sno_typ1);
	}

	/**
	 * 手配ＮＯ１区分. SEIBAN No. 1 type.<p>
	 *
	 */
	public void sno_typ1(String value) {
		setConstString(offset + 21, $sno_typ1, value);
	}

	/**
	 * 手配ＮＯ２区分. SEIBAN No. 2 type.<p>
	 *
	 */
	public String sno_typ2() {
		return getConstString(offset + 22, $sno_typ2);
	}

	/**
	 * 手配ＮＯ２区分. SEIBAN No. 2 type.<p>
	 *
	 */
	public void sno_typ2(String value) {
		setConstString(offset + 22, $sno_typ2, value);
	}

	/**
	 * 手配ＮＯ３区分. SEIBAN No. 3 type.<p>
	 *
	 */
	public String sno_typ3() {
		return getConstString(offset + 23, $sno_typ3);
	}

	/**
	 * 手配ＮＯ３区分. SEIBAN No. 3 type.<p>
	 *
	 */
	public void sno_typ3(String value) {
		setConstString(offset + 23, $sno_typ3, value);
	}

	/**
	 * 手配ＮＯ４区分. SEIBAN No. 4 type.<p>
	 *
	 */
	public String sno_typ4() {
		return getConstString(offset + 24, $sno_typ4);
	}

	/**
	 * 手配ＮＯ４区分. SEIBAN No. 4 type.<p>
	 *
	 */
	public void sno_typ4(String value) {
		setConstString(offset + 24, $sno_typ4, value);
	}

	/**
	 * 下限手配ＮＯ１. Min. SEIBAN No. 1.<p>
	 *
	 */
	public String min_sno1() {
		return getConstString(offset + 25, $min_sno1);
	}

	/**
	 * 下限手配ＮＯ１. Min. SEIBAN No. 1.<p>
	 *
	 */
	public void min_sno1(String value) {
		setConstString(offset + 25, $min_sno1, value);
	}

	/**
	 * 上限手配ＮＯ１. Max. SEIBAN No. 1.<p>
	 *
	 */
	public String max_sno1() {
		return getConstString(offset + 26, $max_sno1);
	}

	/**
	 * 上限手配ＮＯ１. Max. SEIBAN No. 1.<p>
	 *
	 */
	public void max_sno1(String value) {
		setConstString(offset + 26, $max_sno1, value);
	}

	/**
	 * 下限手配ＮＯ２. Min. SEIBAN No. 2.<p>
	 *
	 */
	public String min_sno2() {
		return getConstString(offset + 27, $min_sno2);
	}

	/**
	 * 下限手配ＮＯ２. Min. SEIBAN No. 2.<p>
	 *
	 */
	public void min_sno2(String value) {
		setConstString(offset + 27, $min_sno2, value);
	}

	/**
	 * 上限手配ＮＯ２. Max. SEIBAN No. 2.<p>
	 *
	 */
	public String max_sno2() {
		return getConstString(offset + 28, $max_sno2);
	}

	/**
	 * 上限手配ＮＯ２. Max. SEIBAN No. 2.<p>
	 *
	 */
	public void max_sno2(String value) {
		setConstString(offset + 28, $max_sno2, value);
	}

	/**
	 * 下限手配ＮＯ３. Min. SEIBAN No. 3.<p>
	 *
	 */
	public String min_sno3() {
		return getConstString(offset + 29, $min_sno3);
	}

	/**
	 * 下限手配ＮＯ３. Min. SEIBAN No. 3.<p>
	 *
	 */
	public void min_sno3(String value) {
		setConstString(offset + 29, $min_sno3, value);
	}

	/**
	 * 上限手配ＮＯ３. Max. SEIBAN No. 3.<p>
	 *
	 */
	public String max_sno3() {
		return getConstString(offset + 30, $max_sno3);
	}

	/**
	 * 上限手配ＮＯ３. Max. SEIBAN No. 3.<p>
	 *
	 */
	public void max_sno3(String value) {
		setConstString(offset + 30, $max_sno3, value);
	}

	/**
	 * 下限手配ＮＯ４. Min. SEIBAN No. 4.<p>
	 *
	 */
	public String min_sno4() {
		return getConstString(offset + 31, $min_sno4);
	}

	/**
	 * 下限手配ＮＯ４. Min. SEIBAN No. 4.<p>
	 *
	 */
	public void min_sno4(String value) {
		setConstString(offset + 31, $min_sno4, value);
	}

	/**
	 * 上限手配ＮＯ４. Max. SEIBAN No. 4.<p>
	 *
	 */
	public String max_sno4() {
		return getConstString(offset + 32, $max_sno4);
	}

	/**
	 * 上限手配ＮＯ４. Max. SEIBAN No. 4.<p>
	 *
	 */
	public void max_sno4(String value) {
		setConstString(offset + 32, $max_sno4, value);
	}

	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return getConstNumber(offset + 33, $par_inst_qty);
	}

	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		setConstNumber(offset + 33, $par_inst_qty, value);
	}
	
	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public void par_inst_qty(int value) {
		setConstNumber(offset + 33, $par_inst_qty, value);
	}
	
	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public void par_inst_qty(long value) {
		setConstNumber(offset + 33, $par_inst_qty, value);
	}
	
	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public void par_inst_qty(float value) {
		setConstNumber(offset + 33, $par_inst_qty, value);
	}
	
	/**
	 * 親指図数量. Parent order qty..<p>
	 *
	 */
	public void par_inst_qty(double value) {
		setConstNumber(offset + 33, $par_inst_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return getConstNumber(offset + 34, $chd_inpt_qty);
	}

	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		setConstNumber(offset + 34, $chd_inpt_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		setConstNumber(offset + 34, $chd_inpt_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		setConstNumber(offset + 34, $chd_inpt_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		setConstNumber(offset + 34, $chd_inpt_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		setConstNumber(offset + 34, $chd_inpt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return getConstNumber(offset + 35, $chd_rqmt_qty);
	}

	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 35, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		setConstNumber(offset + 35, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		setConstNumber(offset + 35, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		setConstNumber(offset + 35, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		setConstNumber(offset + 35, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return getConstNumber(offset + 36, $fxd_chd_rqmt_qty);
	}

	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 36, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		setConstNumber(offset + 36, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		setConstNumber(offset + 36, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		setConstNumber(offset + 36, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		setConstNumber(offset + 36, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 副産品ＦＬＧ. By-product flg..<p>
	 *
	 */
	public boolean byprod_flg() {
		return getConstBoolean(offset + 37, $byprod_flg);
	}

	/**
	 * 副産品ＦＬＧ. By-product flg..<p>
	 *
	 */
	public void byprod_flg(boolean value) {
		setConstBoolean(offset + 37, $byprod_flg, value);
	}

	/**
	 * 投入オフセット区分. Input offset type.<p>
	 *
	 */
	public String in_offst_typ() {
		return getConstString(offset + 38, $in_offst_typ);
	}

	/**
	 * 投入オフセット区分. Input offset type.<p>
	 *
	 */
	public void in_offst_typ(String value) {
		setConstString(offset + 38, $in_offst_typ, value);
	}

	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public MCNumber in_offst() {
		return getConstNumber(offset + 39, $in_offst);
	}

	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public void in_offst(MCNumber value) {
		setConstNumber(offset + 39, $in_offst, value);
	}
	
	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public void in_offst(int value) {
		setConstNumber(offset + 39, $in_offst, value);
	}
	
	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public void in_offst(long value) {
		setConstNumber(offset + 39, $in_offst, value);
	}
	
	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public void in_offst(float value) {
		setConstNumber(offset + 39, $in_offst, value);
	}
	
	/**
	 * 投入オフセット. Input offset.<p>
	 *
	 */
	public void in_offst(double value) {
		setConstNumber(offset + 39, $in_offst, value);
	}
	
	/**
	 * バックフラッシュ区分. Backflush type.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 40, $bkf_typ);
	}

	/**
	 * バックフラッシュ区分. Backflush type.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 40, $bkf_typ, value);
	}

	/**
	 * 指図時ロット指定ＦＬＧ. Lot specification at order flg..<p>
	 *
	 */
	public boolean inst_lot_fix_flg() {
		return getConstBoolean(offset + 41, $inst_lot_fix_flg);
	}

	/**
	 * 指図時ロット指定ＦＬＧ. Lot specification at order flg..<p>
	 *
	 */
	public void inst_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 41, $inst_lot_fix_flg, value);
	}

	/**
	 * ロット混在ＦＬＧ. Lot mixed flg..<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return getConstBoolean(offset + 42, $lot_mix_flg);
	}

	/**
	 * ロット混在ＦＬＧ. Lot mixed flg..<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		setConstBoolean(offset + 42, $lot_mix_flg, value);
	}

	/**
	 * サブロット混在ＦＬＧ. Sublot mixed flg..<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return getConstBoolean(offset + 43, $sublot_mix_flg);
	}

	/**
	 * サブロット混在ＦＬＧ. Sublot mixed flg..<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 43, $sublot_mix_flg, value);
	}

	/**
	 * 引当制御区分. Allocation control type.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 44, $alloc_ctl_typ);
	}

	/**
	 * 引当制御区分. Allocation control type.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 44, $alloc_ctl_typ, value);
	}

	/**
	 * 引継対象子品目ＦＬＧ. Copy-from child item flg..<p>
	 *
	 */
	public boolean main_itm_flg() {
		return getConstBoolean(offset + 45, $main_itm_flg);
	}

	/**
	 * 引継対象子品目ＦＬＧ. Copy-from child item flg..<p>
	 *
	 */
	public void main_itm_flg(boolean value) {
		setConstBoolean(offset + 45, $main_itm_flg, value);
	}

	/**
	 * 収率計算用ＦＬＧ. Yield calculation flg..<p>
	 *
	 */
	public boolean yield_calc_flg() {
		return getConstBoolean(offset + 46, $yield_calc_flg);
	}

	/**
	 * 収率計算用ＦＬＧ. Yield calculation flg..<p>
	 *
	 */
	public void yield_calc_flg(boolean value) {
		setConstBoolean(offset + 46, $yield_calc_flg, value);
	}

	/**
	 * 投入制御区分. Input control type.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 47, $inpt_ctl_typ);
	}

	/**
	 * 投入制御区分. Input control type.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 47, $inpt_ctl_typ, value);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 48, $disp_seq);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 48, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 48, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 48, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 48, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 48, $disp_seq, value);
	}
	
	/**
	 * 変更ＮＯ. Change No..<p>
	 *
	 */
	public String chng_no() {
		return getConstString(offset + 49, $chng_no);
	}

	/**
	 * 変更ＮＯ. Change No..<p>
	 *
	 */
	public void chng_no(String value) {
		setConstString(offset + 49, $chng_no, value);
	}

	/**
	 * 外部システムＮＯ. External system No..<p>
	 *
	 */
	public String ext_sys_no_bom() {
		return getConstString(offset + 50, $ext_sys_no_bom);
	}

	/**
	 * 外部システムＮＯ. External system No..<p>
	 *
	 */
	public void ext_sys_no_bom(String value) {
		setConstString(offset + 50, $ext_sys_no_bom, value);
	}

	/**
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public boolean not_cost_flg() {
		return getConstBoolean(offset + 51, $not_cost_flg);
	}

	/**
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public void not_cost_flg(boolean value) {
		setConstBoolean(offset + 51, $not_cost_flg, value);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 52, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 52, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 53, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 53, $end_dt, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 54, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 54, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 55, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 55, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 56, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 56, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 57, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 57, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 58, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 58, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 59, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 59, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 60, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 60, $del_ts, value);
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
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 71, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 71, $wg_nm, value);
	}

	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 72, $oper_nm);
	}

	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 72, $oper_nm, value);
	}

	/**
	 * 代替グループ名. Alternative group name.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 73, $alt_grp_nm);
	}

	/**
	 * 代替グループ名. Alternative group name.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 73, $alt_grp_nm, value);
	}

	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 74, $par_itm_nm);
	}

	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 74, $par_itm_nm, value);
	}

	/**
	 * 子品名. Child item name.<p>
	 *
	 */
	public String chd_itm_nm() {
		return getConstString(offset + 75, $chd_itm_nm);
	}

	/**
	 * 子品名. Child item name.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		setConstString(offset + 75, $chd_itm_nm, value);
	}

	public String getString(String name) {
		if ($bom_key.equalsIgnoreCase(name)) {
			return bom_key();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			return ph_bom_ptn();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			return sno_typ1();
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			return sno_typ2();
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			return sno_typ3();
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			return sno_typ4();
		}
		if ($min_sno1.equalsIgnoreCase(name)) {
			return min_sno1();
		}
		if ($max_sno1.equalsIgnoreCase(name)) {
			return max_sno1();
		}
		if ($min_sno2.equalsIgnoreCase(name)) {
			return min_sno2();
		}
		if ($max_sno2.equalsIgnoreCase(name)) {
			return max_sno2();
		}
		if ($min_sno3.equalsIgnoreCase(name)) {
			return min_sno3();
		}
		if ($max_sno3.equalsIgnoreCase(name)) {
			return max_sno3();
		}
		if ($min_sno4.equalsIgnoreCase(name)) {
			return min_sno4();
		}
		if ($max_sno4.equalsIgnoreCase(name)) {
			return max_sno4();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			return ext_sys_no_bom();
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
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			return chd_itm_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
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
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
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
		if ($ph_flg.equalsIgnoreCase(name)) {
			return ph_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			return byprod_flg();
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bom_key.equalsIgnoreCase(name)) {
			return bom_key();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			return ph_bom_ptn();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			return sno_typ1();
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			return sno_typ2();
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			return sno_typ3();
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			return sno_typ4();
		}
		if ($min_sno1.equalsIgnoreCase(name)) {
			return min_sno1();
		}
		if ($max_sno1.equalsIgnoreCase(name)) {
			return max_sno1();
		}
		if ($min_sno2.equalsIgnoreCase(name)) {
			return min_sno2();
		}
		if ($max_sno2.equalsIgnoreCase(name)) {
			return max_sno2();
		}
		if ($min_sno3.equalsIgnoreCase(name)) {
			return min_sno3();
		}
		if ($max_sno3.equalsIgnoreCase(name)) {
			return max_sno3();
		}
		if ($min_sno4.equalsIgnoreCase(name)) {
			return min_sno4();
		}
		if ($max_sno4.equalsIgnoreCase(name)) {
			return max_sno4();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			return ext_sys_no_bom();
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
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			return chd_itm_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
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
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
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
		if ($ph_flg.equalsIgnoreCase(name)) {
			return ph_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			return byprod_flg();
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bom_key.equalsIgnoreCase(name)) {
			bom_key(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			ph_bom_ptn(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			sno_typ1(value);
			return;
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			sno_typ2(value);
			return;
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			sno_typ3(value);
			return;
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			sno_typ4(value);
			return;
		}
		if ($min_sno1.equalsIgnoreCase(name)) {
			min_sno1(value);
			return;
		}
		if ($max_sno1.equalsIgnoreCase(name)) {
			max_sno1(value);
			return;
		}
		if ($min_sno2.equalsIgnoreCase(name)) {
			min_sno2(value);
			return;
		}
		if ($max_sno2.equalsIgnoreCase(name)) {
			max_sno2(value);
			return;
		}
		if ($min_sno3.equalsIgnoreCase(name)) {
			min_sno3(value);
			return;
		}
		if ($max_sno3.equalsIgnoreCase(name)) {
			max_sno3(value);
			return;
		}
		if ($min_sno4.equalsIgnoreCase(name)) {
			min_sno4(value);
			return;
		}
		if ($max_sno4.equalsIgnoreCase(name)) {
			max_sno4(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
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
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			ext_sys_no_bom(value);
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
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			chd_itm_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
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
		if ($ph_flg.equalsIgnoreCase(name)) {
			ph_flg(value);
			return;
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			alt_itm_flg(value);
			return;
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			byprod_flg(value);
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bom_key.equalsIgnoreCase(name)) {
			bom_key(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			ph_bom_ptn(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			sno_typ1(value);
			return;
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			sno_typ2(value);
			return;
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			sno_typ3(value);
			return;
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			sno_typ4(value);
			return;
		}
		if ($min_sno1.equalsIgnoreCase(name)) {
			min_sno1(value);
			return;
		}
		if ($max_sno1.equalsIgnoreCase(name)) {
			max_sno1(value);
			return;
		}
		if ($min_sno2.equalsIgnoreCase(name)) {
			min_sno2(value);
			return;
		}
		if ($max_sno2.equalsIgnoreCase(name)) {
			max_sno2(value);
			return;
		}
		if ($min_sno3.equalsIgnoreCase(name)) {
			min_sno3(value);
			return;
		}
		if ($max_sno3.equalsIgnoreCase(name)) {
			max_sno3(value);
			return;
		}
		if ($min_sno4.equalsIgnoreCase(name)) {
			min_sno4(value);
			return;
		}
		if ($max_sno4.equalsIgnoreCase(name)) {
			max_sno4(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
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
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			ext_sys_no_bom(value);
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
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			chd_itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
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
		if ($ph_flg.equalsIgnoreCase(name)) {
			ph_flg(value);
			return;
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			alt_itm_flg(value);
			return;
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			byprod_flg(value);
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
