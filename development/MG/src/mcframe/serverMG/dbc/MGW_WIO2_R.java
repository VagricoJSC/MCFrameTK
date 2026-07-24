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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "入出庫実績集計ワーク２ // Other GR/GI result aggregated work 2"DBコンテナRowクラスです。<p>
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
 *  	<td>gi_act_io_id</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫入出庫実績ＩＤ</td>
 *  	<td>GI result ID</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>gi_act_io_id_sub</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫入出庫実績ＩＤ枝番</td>
 *  	<td>GI result ID branch No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>gr_act_io_id</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入出庫実績ＩＤ</td>
 *  	<td>GR/GI result ID</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>gr_act_io_id_sub</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入出庫実績ＩＤ枝番</td>
 *  	<td>GR/GI result ID branch No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫計算カテゴリＣＤ</td>
 *  	<td>GI calculation category cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫ワーキンググループＣＤ</td>
 *  	<td>GI WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫年月</td>
 *  	<td>GI month</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫計上日</td>
 *  	<td>GI recording date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_mng_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫管理部門ＣＤ</td>
 *  	<td>GI management dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫品目ＣＤ</td>
 *  	<td>GI item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫枝番１</td>
 *  	<td>GI branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫枝番２</td>
 *  	<td>GI branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫枝番３</td>
 *  	<td>GI branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫ロットＮＯ</td>
 *  	<td>GI lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫サブロットＮＯ</td>
 *  	<td>GI sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫手配ＮＯ１</td>
 *  	<td>GI SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫手配ＮＯ２</td>
 *  	<td>GI SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫手配ＮＯ３</td>
 *  	<td>GI SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫手配ＮＯ４</td>
 *  	<td>GI SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_cost_io_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫原価入出庫区分</td>
 *  	<td>GI cost GR/GI type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫会計伝票区分</td>
 *  	<td>GI accounting slip type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫会計理由ＣＤ</td>
 *  	<td>GI accounting reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫取引先ＣＤ</td>
 *  	<td>GI BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫在庫先ＣＤ</td>
 *  	<td>GI company holding inventory cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_asst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫資産区分</td>
 *  	<td>GI asset type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫数量</td>
 *  	<td>GI qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫金額</td>
 *  	<td>GI amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫取引通貨ＣＤ</td>
 *  	<td>GI transaction currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫取引通貨金額</td>
 *  	<td>GI amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫為替レート</td>
 *  	<td>GI exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_trd_grp</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫振替グループ</td>
 *  	<td>GI transfer group</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_rec_eval_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫個別評価区分</td>
 *  	<td>GI individual evaluation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_calc_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫計算順序</td>
 *  	<td>GI calculation sequence</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_zero_effect_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫ゼロ評価ＦＬＧ</td>
 *  	<td>GI zero evaluation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫計算カテゴリＣＤ</td>
 *  	<td>GR calculation category cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫ワーキンググループＣＤ</td>
 *  	<td>GR WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫年月</td>
 *  	<td>GR month</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫計上日</td>
 *  	<td>GR recording date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_mng_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫管理部門ＣＤ</td>
 *  	<td>GR management dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫品目ＣＤ</td>
 *  	<td>GR item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫枝番１</td>
 *  	<td>GR branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫枝番２</td>
 *  	<td>GR branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫枝番３</td>
 *  	<td>GR branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫ロットＮＯ</td>
 *  	<td>GR lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫サブロットＮＯ</td>
 *  	<td>GR sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫手配ＮＯ１</td>
 *  	<td>GR SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫手配ＮＯ２</td>
 *  	<td>GR SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫手配ＮＯ３</td>
 *  	<td>GR SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫手配ＮＯ４</td>
 *  	<td>GR SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_cost_io_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫原価入出庫区分</td>
 *  	<td>GR cost GR/GI type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫会計伝票区分</td>
 *  	<td>GR accounting slip type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫会計理由ＣＤ</td>
 *  	<td>GR accounting reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫取引先ＣＤ</td>
 *  	<td>GR BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫在庫先ＣＤ</td>
 *  	<td>GR company holding inventory cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_asst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫資産区分</td>
 *  	<td>GR asset type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫数量</td>
 *  	<td>GR qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫金額</td>
 *  	<td>GR amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫取引通貨ＣＤ</td>
 *  	<td>GR transaction currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫取引通貨金額</td>
 *  	<td>GR amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫為替レート</td>
 *  	<td>GR exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_trd_grp</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫振替グループ</td>
 *  	<td>GR transfer group</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_rec_eval_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫個別評価区分</td>
 *  	<td>GR specific evaluation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_calc_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫計算順序</td>
 *  	<td>GR calculation sequence</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_zero_effect_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫ゼロ評価ＦＬＧ</td>
 *  	<td>GR zero evaluation flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_WIO2_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_WIO2";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 出庫入出庫実績ＩＤ. GI result ID.<p>
	 *
	 */
	public static final String $gi_act_io_id = "gi_act_io_id";
	private static final MCPermColumnInfo _gi_act_io_id = createColumnInfo("gi_act_io_id");
	public final MCStringPermColumn gi_act_io_id = createStringColumn(_gi_act_io_id);
	
	/**
	 * 出庫入出庫実績ＩＤ枝番. GI result ID branch No..<p>
	 *
	 */
	public static final String $gi_act_io_id_sub = "gi_act_io_id_sub";
	private static final MCPermColumnInfo _gi_act_io_id_sub = createColumnInfo("gi_act_io_id_sub");
	public final MCStringPermColumn gi_act_io_id_sub = createStringColumn(_gi_act_io_id_sub);
	
	/**
	 * 入出庫実績ＩＤ. GR/GI result ID.<p>
	 *
	 */
	public static final String $gr_act_io_id = "gr_act_io_id";
	private static final MCPermColumnInfo _gr_act_io_id = createColumnInfo("gr_act_io_id");
	public final MCStringPermColumn gr_act_io_id = createStringColumn(_gr_act_io_id);
	
	/**
	 * 入出庫実績ＩＤ枝番. GR/GI result ID branch No..<p>
	 *
	 */
	public static final String $gr_act_io_id_sub = "gr_act_io_id_sub";
	private static final MCPermColumnInfo _gr_act_io_id_sub = createColumnInfo("gr_act_io_id_sub");
	public final MCStringPermColumn gr_act_io_id_sub = createStringColumn(_gr_act_io_id_sub);
	
	/**
	 * 出庫計算カテゴリＣＤ. GI calculation category cd..<p>
	 *
	 */
	public static final String $gi_calc_ctg_cd = "gi_calc_ctg_cd";
	private static final MCPermColumnInfo _gi_calc_ctg_cd = createColumnInfo("gi_calc_ctg_cd");
	public final MCStringPermColumn gi_calc_ctg_cd = createStringColumn(_gi_calc_ctg_cd);
	
	/**
	 * 出庫ワーキンググループＣＤ. GI WG cd..<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	private static final MCPermColumnInfo _gi_wg_cd = createColumnInfo("gi_wg_cd");
	public final MCStringPermColumn gi_wg_cd = createStringColumn(_gi_wg_cd);
	
	/**
	 * 出庫年月. GI month.<p>
	 *
	 */
	public static final String $gi_ym = "gi_ym";
	private static final MCPermColumnInfo _gi_ym = createColumnInfo("gi_ym");
	public final MCDatePermColumn gi_ym = createDateColumn(_gi_ym);
	
	/**
	 * 出庫計上日. GI recording date.<p>
	 *
	 */
	public static final String $gi_ac_dt = "gi_ac_dt";
	private static final MCPermColumnInfo _gi_ac_dt = createColumnInfo("gi_ac_dt");
	public final MCDatePermColumn gi_ac_dt = createDateColumn(_gi_ac_dt);
	
	/**
	 * 出庫管理部門ＣＤ. GI management dept. cd..<p>
	 *
	 */
	public static final String $gi_mng_dpt_cd = "gi_mng_dpt_cd";
	private static final MCPermColumnInfo _gi_mng_dpt_cd = createColumnInfo("gi_mng_dpt_cd");
	public final MCStringPermColumn gi_mng_dpt_cd = createStringColumn(_gi_mng_dpt_cd);
	
	/**
	 * 出庫品目ＣＤ. GI item cd..<p>
	 *
	 */
	public static final String $gi_itm_cd = "gi_itm_cd";
	private static final MCPermColumnInfo _gi_itm_cd = createColumnInfo("gi_itm_cd");
	public final MCStringPermColumn gi_itm_cd = createStringColumn(_gi_itm_cd);
	
	/**
	 * 出庫枝番１. GI branch No. 1.<p>
	 *
	 */
	public static final String $gi_itm_sub1 = "gi_itm_sub1";
	private static final MCPermColumnInfo _gi_itm_sub1 = createColumnInfo("gi_itm_sub1");
	public final MCStringPermColumn gi_itm_sub1 = createStringColumn(_gi_itm_sub1);
	
	/**
	 * 出庫枝番２. GI branch No. 2.<p>
	 *
	 */
	public static final String $gi_itm_sub2 = "gi_itm_sub2";
	private static final MCPermColumnInfo _gi_itm_sub2 = createColumnInfo("gi_itm_sub2");
	public final MCStringPermColumn gi_itm_sub2 = createStringColumn(_gi_itm_sub2);
	
	/**
	 * 出庫枝番３. GI branch No. 3.<p>
	 *
	 */
	public static final String $gi_itm_sub3 = "gi_itm_sub3";
	private static final MCPermColumnInfo _gi_itm_sub3 = createColumnInfo("gi_itm_sub3");
	public final MCStringPermColumn gi_itm_sub3 = createStringColumn(_gi_itm_sub3);
	
	/**
	 * 出庫ロットＮＯ. GI lot No..<p>
	 *
	 */
	public static final String $gi_lot_no = "gi_lot_no";
	private static final MCPermColumnInfo _gi_lot_no = createColumnInfo("gi_lot_no");
	public final MCStringPermColumn gi_lot_no = createStringColumn(_gi_lot_no);
	
	/**
	 * 出庫サブロットＮＯ. GI sublot No..<p>
	 *
	 */
	public static final String $gi_sublot_no = "gi_sublot_no";
	private static final MCPermColumnInfo _gi_sublot_no = createColumnInfo("gi_sublot_no");
	public final MCStringPermColumn gi_sublot_no = createStringColumn(_gi_sublot_no);
	
	/**
	 * 出庫手配ＮＯ１. GI SEIBAN No. 1.<p>
	 *
	 */
	public static final String $gi_sno1 = "gi_sno1";
	private static final MCPermColumnInfo _gi_sno1 = createColumnInfo("gi_sno1");
	public final MCStringPermColumn gi_sno1 = createStringColumn(_gi_sno1);
	
	/**
	 * 出庫手配ＮＯ２. GI SEIBAN No. 2.<p>
	 *
	 */
	public static final String $gi_sno2 = "gi_sno2";
	private static final MCPermColumnInfo _gi_sno2 = createColumnInfo("gi_sno2");
	public final MCStringPermColumn gi_sno2 = createStringColumn(_gi_sno2);
	
	/**
	 * 出庫手配ＮＯ３. GI SEIBAN No. 3.<p>
	 *
	 */
	public static final String $gi_sno3 = "gi_sno3";
	private static final MCPermColumnInfo _gi_sno3 = createColumnInfo("gi_sno3");
	public final MCStringPermColumn gi_sno3 = createStringColumn(_gi_sno3);
	
	/**
	 * 出庫手配ＮＯ４. GI SEIBAN No. 4.<p>
	 *
	 */
	public static final String $gi_sno4 = "gi_sno4";
	private static final MCPermColumnInfo _gi_sno4 = createColumnInfo("gi_sno4");
	public final MCStringPermColumn gi_sno4 = createStringColumn(_gi_sno4);
	
	/**
	 * 出庫原価入出庫区分. GI cost GR/GI type.<p>
	 *
	 */
	public static final String $gi_cost_io_typ = "gi_cost_io_typ";
	private static final MCPermColumnInfo _gi_cost_io_typ = createColumnInfo("gi_cost_io_typ");
	public final MCStringPermColumn gi_cost_io_typ = createStringColumn(_gi_cost_io_typ);
	
	/**
	 * 出庫会計伝票区分. GI accounting slip type.<p>
	 *
	 */
	public static final String $gi_ac_slip_typ = "gi_ac_slip_typ";
	private static final MCPermColumnInfo _gi_ac_slip_typ = createColumnInfo("gi_ac_slip_typ");
	public final MCStringPermColumn gi_ac_slip_typ = createStringColumn(_gi_ac_slip_typ);
	
	/**
	 * 出庫会計理由ＣＤ. GI accounting reason cd..<p>
	 *
	 */
	public static final String $gi_ac_rsn_cd = "gi_ac_rsn_cd";
	private static final MCPermColumnInfo _gi_ac_rsn_cd = createColumnInfo("gi_ac_rsn_cd");
	public final MCStringPermColumn gi_ac_rsn_cd = createStringColumn(_gi_ac_rsn_cd);
	
	/**
	 * 出庫取引先ＣＤ. GI BP cd..<p>
	 *
	 */
	public static final String $gi_bp_cd = "gi_bp_cd";
	private static final MCPermColumnInfo _gi_bp_cd = createColumnInfo("gi_bp_cd");
	public final MCStringPermColumn gi_bp_cd = createStringColumn(_gi_bp_cd);
	
	/**
	 * 出庫在庫先ＣＤ. GI company holding inventory cd..<p>
	 *
	 */
	public static final String $gi_stk_bp_cd = "gi_stk_bp_cd";
	private static final MCPermColumnInfo _gi_stk_bp_cd = createColumnInfo("gi_stk_bp_cd");
	public final MCStringPermColumn gi_stk_bp_cd = createStringColumn(_gi_stk_bp_cd);
	
	/**
	 * 出庫資産区分. GI asset type.<p>
	 *
	 */
	public static final String $gi_asst_typ = "gi_asst_typ";
	private static final MCPermColumnInfo _gi_asst_typ = createColumnInfo("gi_asst_typ");
	public final MCStringPermColumn gi_asst_typ = createStringColumn(_gi_asst_typ);
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public static final String $gi_qty = "gi_qty";
	private static final MCPermColumnInfo _gi_qty = createColumnInfo("gi_qty");
	public final MCNumberPermColumn gi_qty = createNumberColumn(_gi_qty);
	
	/**
	 * 出庫金額. GI amount.<p>
	 *
	 */
	public static final String $gi_amt = "gi_amt";
	private static final MCPermColumnInfo _gi_amt = createColumnInfo("gi_amt");
	public final MCNumberPermColumn gi_amt = createNumberColumn(_gi_amt);
	
	/**
	 * 出庫取引通貨ＣＤ. GI transaction currency cd..<p>
	 *
	 */
	public static final String $gi_trd_cur_cd = "gi_trd_cur_cd";
	private static final MCPermColumnInfo _gi_trd_cur_cd = createColumnInfo("gi_trd_cur_cd");
	public final MCStringPermColumn gi_trd_cur_cd = createStringColumn(_gi_trd_cur_cd);
	
	/**
	 * 出庫取引通貨金額. GI amount (Transaction currency).<p>
	 *
	 */
	public static final String $gi_trd_cur_amt = "gi_trd_cur_amt";
	private static final MCPermColumnInfo _gi_trd_cur_amt = createColumnInfo("gi_trd_cur_amt");
	public final MCNumberPermColumn gi_trd_cur_amt = createNumberColumn(_gi_trd_cur_amt);
	
	/**
	 * 出庫為替レート. GI exchange rate.<p>
	 *
	 */
	public static final String $gi_xrate = "gi_xrate";
	private static final MCPermColumnInfo _gi_xrate = createColumnInfo("gi_xrate");
	public final MCNumberPermColumn gi_xrate = createNumberColumn(_gi_xrate);
	
	/**
	 * 出庫振替グループ. GI transfer group.<p>
	 *
	 */
	public static final String $gi_trd_grp = "gi_trd_grp";
	private static final MCPermColumnInfo _gi_trd_grp = createColumnInfo("gi_trd_grp");
	public final MCStringPermColumn gi_trd_grp = createStringColumn(_gi_trd_grp);
	
	/**
	 * 出庫個別評価区分. GI individual evaluation type.<p>
	 *
	 */
	public static final String $gi_rec_eval_typ = "gi_rec_eval_typ";
	private static final MCPermColumnInfo _gi_rec_eval_typ = createColumnInfo("gi_rec_eval_typ");
	public final MCStringPermColumn gi_rec_eval_typ = createStringColumn(_gi_rec_eval_typ);
	
	/**
	 * 出庫計算順序. GI calculation sequence.<p>
	 *
	 */
	public static final String $gi_calc_seq = "gi_calc_seq";
	private static final MCPermColumnInfo _gi_calc_seq = createColumnInfo("gi_calc_seq");
	public final MCNumberPermColumn gi_calc_seq = createNumberColumn(_gi_calc_seq);
	
	/**
	 * 出庫ゼロ評価ＦＬＧ. GI zero evaluation flg..<p>
	 *
	 */
	public static final String $gi_zero_effect_flg = "gi_zero_effect_flg";
	private static final MCPermColumnInfo _gi_zero_effect_flg = createColumnInfo("gi_zero_effect_flg");
	public final MCBooleanPermColumn gi_zero_effect_flg = createBooleanColumn(_gi_zero_effect_flg);
	
	/**
	 * 入庫計算カテゴリＣＤ. GR calculation category cd..<p>
	 *
	 */
	public static final String $gr_calc_ctg_cd = "gr_calc_ctg_cd";
	private static final MCPermColumnInfo _gr_calc_ctg_cd = createColumnInfo("gr_calc_ctg_cd");
	public final MCStringPermColumn gr_calc_ctg_cd = createStringColumn(_gr_calc_ctg_cd);
	
	/**
	 * 入庫ワーキンググループＣＤ. GR WG cd..<p>
	 *
	 */
	public static final String $gr_wg_cd = "gr_wg_cd";
	private static final MCPermColumnInfo _gr_wg_cd = createColumnInfo("gr_wg_cd");
	public final MCStringPermColumn gr_wg_cd = createStringColumn(_gr_wg_cd);
	
	/**
	 * 入庫年月. GR month.<p>
	 *
	 */
	public static final String $gr_ym = "gr_ym";
	private static final MCPermColumnInfo _gr_ym = createColumnInfo("gr_ym");
	public final MCDatePermColumn gr_ym = createDateColumn(_gr_ym);
	
	/**
	 * 入庫計上日. GR recording date.<p>
	 *
	 */
	public static final String $gr_ac_dt = "gr_ac_dt";
	private static final MCPermColumnInfo _gr_ac_dt = createColumnInfo("gr_ac_dt");
	public final MCDatePermColumn gr_ac_dt = createDateColumn(_gr_ac_dt);
	
	/**
	 * 入庫管理部門ＣＤ. GR management dept. cd..<p>
	 *
	 */
	public static final String $gr_mng_dpt_cd = "gr_mng_dpt_cd";
	private static final MCPermColumnInfo _gr_mng_dpt_cd = createColumnInfo("gr_mng_dpt_cd");
	public final MCStringPermColumn gr_mng_dpt_cd = createStringColumn(_gr_mng_dpt_cd);
	
	/**
	 * 入庫品目ＣＤ. GR item cd..<p>
	 *
	 */
	public static final String $gr_itm_cd = "gr_itm_cd";
	private static final MCPermColumnInfo _gr_itm_cd = createColumnInfo("gr_itm_cd");
	public final MCStringPermColumn gr_itm_cd = createStringColumn(_gr_itm_cd);
	
	/**
	 * 入庫枝番１. GR branch No. 1.<p>
	 *
	 */
	public static final String $gr_itm_sub1 = "gr_itm_sub1";
	private static final MCPermColumnInfo _gr_itm_sub1 = createColumnInfo("gr_itm_sub1");
	public final MCStringPermColumn gr_itm_sub1 = createStringColumn(_gr_itm_sub1);
	
	/**
	 * 入庫枝番２. GR branch No. 2.<p>
	 *
	 */
	public static final String $gr_itm_sub2 = "gr_itm_sub2";
	private static final MCPermColumnInfo _gr_itm_sub2 = createColumnInfo("gr_itm_sub2");
	public final MCStringPermColumn gr_itm_sub2 = createStringColumn(_gr_itm_sub2);
	
	/**
	 * 入庫枝番３. GR branch No. 3.<p>
	 *
	 */
	public static final String $gr_itm_sub3 = "gr_itm_sub3";
	private static final MCPermColumnInfo _gr_itm_sub3 = createColumnInfo("gr_itm_sub3");
	public final MCStringPermColumn gr_itm_sub3 = createStringColumn(_gr_itm_sub3);
	
	/**
	 * 入庫ロットＮＯ. GR lot No..<p>
	 *
	 */
	public static final String $gr_lot_no = "gr_lot_no";
	private static final MCPermColumnInfo _gr_lot_no = createColumnInfo("gr_lot_no");
	public final MCStringPermColumn gr_lot_no = createStringColumn(_gr_lot_no);
	
	/**
	 * 入庫サブロットＮＯ. GR sublot No..<p>
	 *
	 */
	public static final String $gr_sublot_no = "gr_sublot_no";
	private static final MCPermColumnInfo _gr_sublot_no = createColumnInfo("gr_sublot_no");
	public final MCStringPermColumn gr_sublot_no = createStringColumn(_gr_sublot_no);
	
	/**
	 * 入庫手配ＮＯ１. GR SEIBAN No. 1.<p>
	 *
	 */
	public static final String $gr_sno1 = "gr_sno1";
	private static final MCPermColumnInfo _gr_sno1 = createColumnInfo("gr_sno1");
	public final MCStringPermColumn gr_sno1 = createStringColumn(_gr_sno1);
	
	/**
	 * 入庫手配ＮＯ２. GR SEIBAN No. 2.<p>
	 *
	 */
	public static final String $gr_sno2 = "gr_sno2";
	private static final MCPermColumnInfo _gr_sno2 = createColumnInfo("gr_sno2");
	public final MCStringPermColumn gr_sno2 = createStringColumn(_gr_sno2);
	
	/**
	 * 入庫手配ＮＯ３. GR SEIBAN No. 3.<p>
	 *
	 */
	public static final String $gr_sno3 = "gr_sno3";
	private static final MCPermColumnInfo _gr_sno3 = createColumnInfo("gr_sno3");
	public final MCStringPermColumn gr_sno3 = createStringColumn(_gr_sno3);
	
	/**
	 * 入庫手配ＮＯ４. GR SEIBAN No. 4.<p>
	 *
	 */
	public static final String $gr_sno4 = "gr_sno4";
	private static final MCPermColumnInfo _gr_sno4 = createColumnInfo("gr_sno4");
	public final MCStringPermColumn gr_sno4 = createStringColumn(_gr_sno4);
	
	/**
	 * 入庫原価入出庫区分. GR cost GR/GI type.<p>
	 *
	 */
	public static final String $gr_cost_io_typ = "gr_cost_io_typ";
	private static final MCPermColumnInfo _gr_cost_io_typ = createColumnInfo("gr_cost_io_typ");
	public final MCStringPermColumn gr_cost_io_typ = createStringColumn(_gr_cost_io_typ);
	
	/**
	 * 入庫会計伝票区分. GR accounting slip type.<p>
	 *
	 */
	public static final String $gr_ac_slip_typ = "gr_ac_slip_typ";
	private static final MCPermColumnInfo _gr_ac_slip_typ = createColumnInfo("gr_ac_slip_typ");
	public final MCStringPermColumn gr_ac_slip_typ = createStringColumn(_gr_ac_slip_typ);
	
	/**
	 * 入庫会計理由ＣＤ. GR accounting reason cd..<p>
	 *
	 */
	public static final String $gr_ac_rsn_cd = "gr_ac_rsn_cd";
	private static final MCPermColumnInfo _gr_ac_rsn_cd = createColumnInfo("gr_ac_rsn_cd");
	public final MCStringPermColumn gr_ac_rsn_cd = createStringColumn(_gr_ac_rsn_cd);
	
	/**
	 * 入庫取引先ＣＤ. GR BP cd..<p>
	 *
	 */
	public static final String $gr_bp_cd = "gr_bp_cd";
	private static final MCPermColumnInfo _gr_bp_cd = createColumnInfo("gr_bp_cd");
	public final MCStringPermColumn gr_bp_cd = createStringColumn(_gr_bp_cd);
	
	/**
	 * 入庫在庫先ＣＤ. GR company holding inventory cd..<p>
	 *
	 */
	public static final String $gr_stk_bp_cd = "gr_stk_bp_cd";
	private static final MCPermColumnInfo _gr_stk_bp_cd = createColumnInfo("gr_stk_bp_cd");
	public final MCStringPermColumn gr_stk_bp_cd = createStringColumn(_gr_stk_bp_cd);
	
	/**
	 * 入庫資産区分. GR asset type.<p>
	 *
	 */
	public static final String $gr_asst_typ = "gr_asst_typ";
	private static final MCPermColumnInfo _gr_asst_typ = createColumnInfo("gr_asst_typ");
	public final MCStringPermColumn gr_asst_typ = createStringColumn(_gr_asst_typ);
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public static final String $gr_qty = "gr_qty";
	private static final MCPermColumnInfo _gr_qty = createColumnInfo("gr_qty");
	public final MCNumberPermColumn gr_qty = createNumberColumn(_gr_qty);
	
	/**
	 * 入庫金額. GR amount.<p>
	 *
	 */
	public static final String $gr_amt = "gr_amt";
	private static final MCPermColumnInfo _gr_amt = createColumnInfo("gr_amt");
	public final MCNumberPermColumn gr_amt = createNumberColumn(_gr_amt);
	
	/**
	 * 入庫取引通貨ＣＤ. GR transaction currency cd..<p>
	 *
	 */
	public static final String $gr_trd_cur_cd = "gr_trd_cur_cd";
	private static final MCPermColumnInfo _gr_trd_cur_cd = createColumnInfo("gr_trd_cur_cd");
	public final MCStringPermColumn gr_trd_cur_cd = createStringColumn(_gr_trd_cur_cd);
	
	/**
	 * 入庫取引通貨金額. GR amount (Transaction currency).<p>
	 *
	 */
	public static final String $gr_trd_cur_amt = "gr_trd_cur_amt";
	private static final MCPermColumnInfo _gr_trd_cur_amt = createColumnInfo("gr_trd_cur_amt");
	public final MCNumberPermColumn gr_trd_cur_amt = createNumberColumn(_gr_trd_cur_amt);
	
	/**
	 * 入庫為替レート. GR exchange rate.<p>
	 *
	 */
	public static final String $gr_xrate = "gr_xrate";
	private static final MCPermColumnInfo _gr_xrate = createColumnInfo("gr_xrate");
	public final MCNumberPermColumn gr_xrate = createNumberColumn(_gr_xrate);
	
	/**
	 * 入庫振替グループ. GR transfer group.<p>
	 *
	 */
	public static final String $gr_trd_grp = "gr_trd_grp";
	private static final MCPermColumnInfo _gr_trd_grp = createColumnInfo("gr_trd_grp");
	public final MCStringPermColumn gr_trd_grp = createStringColumn(_gr_trd_grp);
	
	/**
	 * 入庫個別評価区分. GR specific evaluation type.<p>
	 *
	 */
	public static final String $gr_rec_eval_typ = "gr_rec_eval_typ";
	private static final MCPermColumnInfo _gr_rec_eval_typ = createColumnInfo("gr_rec_eval_typ");
	public final MCStringPermColumn gr_rec_eval_typ = createStringColumn(_gr_rec_eval_typ);
	
	/**
	 * 入庫計算順序. GR calculation sequence.<p>
	 *
	 */
	public static final String $gr_calc_seq = "gr_calc_seq";
	private static final MCPermColumnInfo _gr_calc_seq = createColumnInfo("gr_calc_seq");
	public final MCNumberPermColumn gr_calc_seq = createNumberColumn(_gr_calc_seq);
	
	/**
	 * 入庫ゼロ評価ＦＬＧ. GR zero evaluation flg..<p>
	 *
	 */
	public static final String $gr_zero_effect_flg = "gr_zero_effect_flg";
	private static final MCPermColumnInfo _gr_zero_effect_flg = createColumnInfo("gr_zero_effect_flg");
	public final MCBooleanPermColumn gr_zero_effect_flg = createBooleanColumn(_gr_zero_effect_flg);
	
	public static final MCMeta gi_act_io_id_META = createCommonMeta($gi_act_io_id, mcframe.commonMG.meta.MG_META.ACT_IO_ID);
	public static final MCMeta gi_act_io_id_sub_META = createCommonMeta($gi_act_io_id_sub, mcframe.commonMG.meta.MG_META.ACT_IO_ID_SUB);
	public static final MCMeta gr_act_io_id_META = createCommonMeta($gr_act_io_id, mcframe.commonMG.meta.MG_META.ACT_IO_ID);
	public static final MCMeta gr_act_io_id_sub_META = createCommonMeta($gr_act_io_id_sub, mcframe.commonMG.meta.MG_META.ACT_IO_ID_SUB);
	public static final MCMeta gi_calc_ctg_cd_META = createCommonMeta($gi_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_ym_META = createCommonMeta($gi_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta gi_ac_dt_META = createCommonMeta($gi_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_mng_dpt_cd_META = createCommonMeta($gi_mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta gi_itm_cd_META = createCommonMeta($gi_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta gi_itm_sub1_META = createCommonMeta($gi_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta gi_itm_sub2_META = createCommonMeta($gi_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta gi_itm_sub3_META = createCommonMeta($gi_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta gi_lot_no_META = createCommonMeta($gi_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta gi_sublot_no_META = createCommonMeta($gi_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta gi_sno1_META = createCommonMeta($gi_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta gi_sno2_META = createCommonMeta($gi_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta gi_sno3_META = createCommonMeta($gi_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta gi_sno4_META = createCommonMeta($gi_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta gi_cost_io_typ_META = createCommonMeta($gi_cost_io_typ, mcframe.commonMA.meta.MA_META.COST_IO_TYP);
	public static final MCMeta gi_ac_slip_typ_META = createCommonMeta($gi_ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta gi_ac_rsn_cd_META = createCommonMeta($gi_ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta gi_bp_cd_META = createCommonMeta($gi_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_stk_bp_cd_META = createCommonMeta($gi_stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_asst_typ_META = createCommonMeta($gi_asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta gi_qty_META = createCommonMeta($gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_amt_META = createCommonMeta($gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_trd_cur_cd_META = createCommonMeta($gi_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta gi_trd_cur_amt_META = createCommonMeta($gi_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_xrate_META = createCommonMeta($gi_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_trd_grp_META = createCommonMeta($gi_trd_grp, mcframe.commonMA.meta.MA_META.TRD_GRP);
	public static final MCMeta gi_rec_eval_typ_META = createCommonMeta($gi_rec_eval_typ, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP);
	public static final MCMeta gi_calc_seq_META = createCommonMeta($gi_calc_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta gi_zero_effect_flg_META = createCommonMeta($gi_zero_effect_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_calc_ctg_cd_META = createCommonMeta($gr_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_ym_META = createCommonMeta($gr_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta gr_ac_dt_META = createCommonMeta($gr_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gr_mng_dpt_cd_META = createCommonMeta($gr_mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta gr_itm_cd_META = createCommonMeta($gr_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta gr_itm_sub1_META = createCommonMeta($gr_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta gr_itm_sub2_META = createCommonMeta($gr_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta gr_itm_sub3_META = createCommonMeta($gr_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta gr_lot_no_META = createCommonMeta($gr_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta gr_sublot_no_META = createCommonMeta($gr_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta gr_sno1_META = createCommonMeta($gr_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta gr_sno2_META = createCommonMeta($gr_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta gr_sno3_META = createCommonMeta($gr_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta gr_sno4_META = createCommonMeta($gr_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta gr_cost_io_typ_META = createCommonMeta($gr_cost_io_typ, mcframe.commonMA.meta.MA_META.COST_IO_TYP);
	public static final MCMeta gr_ac_slip_typ_META = createCommonMeta($gr_ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta gr_ac_rsn_cd_META = createCommonMeta($gr_ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta gr_bp_cd_META = createCommonMeta($gr_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_stk_bp_cd_META = createCommonMeta($gr_stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_asst_typ_META = createCommonMeta($gr_asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta gr_qty_META = createCommonMeta($gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_amt_META = createCommonMeta($gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_trd_cur_cd_META = createCommonMeta($gr_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta gr_trd_cur_amt_META = createCommonMeta($gr_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_xrate_META = createCommonMeta($gr_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_trd_grp_META = createCommonMeta($gr_trd_grp, mcframe.commonMA.meta.MA_META.TRD_GRP);
	public static final MCMeta gr_rec_eval_typ_META = createCommonMeta($gr_rec_eval_typ, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP);
	public static final MCMeta gr_calc_seq_META = createCommonMeta($gr_calc_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta gr_zero_effect_flg_META = createCommonMeta($gr_zero_effect_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGW_WIO2_R> constMetas = new ConstMetaList<MGW_WIO2_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			gi_act_io_id_META,
			gi_act_io_id_sub_META,
			gr_act_io_id_META,
			gr_act_io_id_sub_META,
			gi_calc_ctg_cd_META,
			gi_wg_cd_META,
			gi_ym_META,
			gi_ac_dt_META,
			gi_mng_dpt_cd_META,
			gi_itm_cd_META,
			gi_itm_sub1_META,
			gi_itm_sub2_META,
			gi_itm_sub3_META,
			gi_lot_no_META,
			gi_sublot_no_META,
			gi_sno1_META,
			gi_sno2_META,
			gi_sno3_META,
			gi_sno4_META,
			gi_cost_io_typ_META,
			gi_ac_slip_typ_META,
			gi_ac_rsn_cd_META,
			gi_bp_cd_META,
			gi_stk_bp_cd_META,
			gi_asst_typ_META,
			gi_qty_META,
			gi_amt_META,
			gi_trd_cur_cd_META,
			gi_trd_cur_amt_META,
			gi_xrate_META,
			gi_trd_grp_META,
			gi_rec_eval_typ_META,
			gi_calc_seq_META,
			gi_zero_effect_flg_META,
			gr_calc_ctg_cd_META,
			gr_wg_cd_META,
			gr_ym_META,
			gr_ac_dt_META,
			gr_mng_dpt_cd_META,
			gr_itm_cd_META,
			gr_itm_sub1_META,
			gr_itm_sub2_META,
			gr_itm_sub3_META,
			gr_lot_no_META,
			gr_sublot_no_META,
			gr_sno1_META,
			gr_sno2_META,
			gr_sno3_META,
			gr_sno4_META,
			gr_cost_io_typ_META,
			gr_ac_slip_typ_META,
			gr_ac_rsn_cd_META,
			gr_bp_cd_META,
			gr_stk_bp_cd_META,
			gr_asst_typ_META,
			gr_qty_META,
			gr_amt_META,
			gr_trd_cur_cd_META,
			gr_trd_cur_amt_META,
			gr_xrate_META,
			gr_trd_grp_META,
			gr_rec_eval_typ_META,
			gr_calc_seq_META,
			gr_zero_effect_flg_META
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
	protected MGW_WIO2_R(ConstMetaList<? extends MGW_WIO2_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_WIO2_R(ConstMetaList<? extends MGW_WIO2_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_act_io_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_act_io_id,
				"gi_act_io_id",
				gi_act_io_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_act_io_id_sub,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_act_io_id_sub,
				"gi_act_io_id_sub",
				gi_act_io_id_sub,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_act_io_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_act_io_id,
				"gr_act_io_id",
				gr_act_io_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_act_io_id_sub,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_act_io_id_sub,
				"gr_act_io_id_sub",
				gr_act_io_id_sub,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_calc_ctg_cd,
				"gi_calc_ctg_cd",
				gi_calc_ctg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_wg_cd,
				"gi_wg_cd",
				gi_wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGW_WIO2_R.$gi_ym,
				"gi_ym",
				gi_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGW_WIO2_R.$gi_ac_dt,
				"gi_ac_dt",
				gi_ac_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_mng_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_mng_dpt_cd,
				"gi_mng_dpt_cd",
				gi_mng_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_itm_cd,
				"gi_itm_cd",
				gi_itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_itm_sub1,
				"gi_itm_sub1",
				gi_itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_itm_sub2,
				"gi_itm_sub2",
				gi_itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_itm_sub3,
				"gi_itm_sub3",
				gi_itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_lot_no,
				"gi_lot_no",
				gi_lot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_sublot_no,
				"gi_sublot_no",
				gi_sublot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_sno1,
				"gi_sno1",
				gi_sno1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_sno2,
				"gi_sno2",
				gi_sno2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_sno3,
				"gi_sno3",
				gi_sno3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_sno4,
				"gi_sno4",
				gi_sno4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_cost_io_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_cost_io_typ,
				"gi_cost_io_typ",
				gi_cost_io_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_ac_slip_typ,
				"gi_ac_slip_typ",
				gi_ac_slip_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_ac_rsn_cd,
				"gi_ac_rsn_cd",
				gi_ac_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_bp_cd,
				"gi_bp_cd",
				gi_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_stk_bp_cd,
				"gi_stk_bp_cd",
				gi_stk_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_asst_typ,
				"gi_asst_typ",
				gi_asst_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_WIO2_R.$gi_qty,
				"gi_qty",
				gi_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_WIO2_R.$gi_amt,
				"gi_amt",
				gi_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_trd_cur_cd,
				"gi_trd_cur_cd",
				gi_trd_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_WIO2_R.$gi_trd_cur_amt,
				"gi_trd_cur_amt",
				gi_trd_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_WIO2_R.$gi_xrate,
				"gi_xrate",
				gi_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_trd_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_trd_grp,
				"gi_trd_grp",
				gi_trd_grp,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_rec_eval_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gi_rec_eval_typ,
				"gi_rec_eval_typ",
				gi_rec_eval_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_calc_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_WIO2_R.$gi_calc_seq,
				"gi_calc_seq",
				gi_calc_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gi_zero_effect_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_WIO2_R.$gi_zero_effect_flg,
				"gi_zero_effect_flg",
				gi_zero_effect_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_calc_ctg_cd,
				"gr_calc_ctg_cd",
				gr_calc_ctg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_wg_cd,
				"gr_wg_cd",
				gr_wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGW_WIO2_R.$gr_ym,
				"gr_ym",
				gr_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGW_WIO2_R.$gr_ac_dt,
				"gr_ac_dt",
				gr_ac_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_mng_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_mng_dpt_cd,
				"gr_mng_dpt_cd",
				gr_mng_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_itm_cd,
				"gr_itm_cd",
				gr_itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_itm_sub1,
				"gr_itm_sub1",
				gr_itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_itm_sub2,
				"gr_itm_sub2",
				gr_itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_itm_sub3,
				"gr_itm_sub3",
				gr_itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_lot_no,
				"gr_lot_no",
				gr_lot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_sublot_no,
				"gr_sublot_no",
				gr_sublot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_sno1,
				"gr_sno1",
				gr_sno1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_sno2,
				"gr_sno2",
				gr_sno2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_sno3,
				"gr_sno3",
				gr_sno3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_sno4,
				"gr_sno4",
				gr_sno4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_cost_io_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_cost_io_typ,
				"gr_cost_io_typ",
				gr_cost_io_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_ac_slip_typ,
				"gr_ac_slip_typ",
				gr_ac_slip_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_ac_rsn_cd,
				"gr_ac_rsn_cd",
				gr_ac_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_bp_cd,
				"gr_bp_cd",
				gr_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_stk_bp_cd,
				"gr_stk_bp_cd",
				gr_stk_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_asst_typ,
				"gr_asst_typ",
				gr_asst_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_WIO2_R.$gr_qty,
				"gr_qty",
				gr_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_WIO2_R.$gr_amt,
				"gr_amt",
				gr_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_trd_cur_cd,
				"gr_trd_cur_cd",
				gr_trd_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_WIO2_R.$gr_trd_cur_amt,
				"gr_trd_cur_amt",
				gr_trd_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_WIO2_R.$gr_xrate,
				"gr_xrate",
				gr_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_trd_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_trd_grp,
				"gr_trd_grp",
				gr_trd_grp,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_rec_eval_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_WIO2_R.$gr_rec_eval_typ,
				"gr_rec_eval_typ",
				gr_rec_eval_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_calc_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_WIO2_R.$gr_calc_seq,
				"gr_calc_seq",
				gr_calc_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_WIO2_R.$gr_zero_effect_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_WIO2_R.$gr_zero_effect_flg,
				"gr_zero_effect_flg",
				gr_zero_effect_flg,
				false,
				false,
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
	public static MGW_WIO2_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_WIO2_R create(String alias) {
		MGW_WIO2_R row = new MGW_WIO2_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_WIO2_R createByName(T proto) {
		MGW_WIO2_R row = MGW_WIO2_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_WIO2_R clone() {
		return (MGW_WIO2_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_WIO2_R createInstance() {
		return (MGW_WIO2_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_WIO2_R getValues(String... names) {
		return (MGW_WIO2_R) super.getValues(names);
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
	 * 出庫入出庫実績ＩＤ. GI result ID.<p>
	 *
	 */
	public String gi_act_io_id() {
		return getConstString(offset + 0, $gi_act_io_id);
	}

	/**
	 * 出庫入出庫実績ＩＤ. GI result ID.<p>
	 *
	 */
	public void gi_act_io_id(String value) {
		setConstString(offset + 0, $gi_act_io_id, value);
	}

	/**
	 * 出庫入出庫実績ＩＤ枝番. GI result ID branch No..<p>
	 *
	 */
	public String gi_act_io_id_sub() {
		return getConstString(offset + 1, $gi_act_io_id_sub);
	}

	/**
	 * 出庫入出庫実績ＩＤ枝番. GI result ID branch No..<p>
	 *
	 */
	public void gi_act_io_id_sub(String value) {
		setConstString(offset + 1, $gi_act_io_id_sub, value);
	}

	/**
	 * 入出庫実績ＩＤ. GR/GI result ID.<p>
	 *
	 */
	public String gr_act_io_id() {
		return getConstString(offset + 2, $gr_act_io_id);
	}

	/**
	 * 入出庫実績ＩＤ. GR/GI result ID.<p>
	 *
	 */
	public void gr_act_io_id(String value) {
		setConstString(offset + 2, $gr_act_io_id, value);
	}

	/**
	 * 入出庫実績ＩＤ枝番. GR/GI result ID branch No..<p>
	 *
	 */
	public String gr_act_io_id_sub() {
		return getConstString(offset + 3, $gr_act_io_id_sub);
	}

	/**
	 * 入出庫実績ＩＤ枝番. GR/GI result ID branch No..<p>
	 *
	 */
	public void gr_act_io_id_sub(String value) {
		setConstString(offset + 3, $gr_act_io_id_sub, value);
	}

	/**
	 * 出庫計算カテゴリＣＤ. GI calculation category cd..<p>
	 *
	 */
	public String gi_calc_ctg_cd() {
		return getConstString(offset + 4, $gi_calc_ctg_cd);
	}

	/**
	 * 出庫計算カテゴリＣＤ. GI calculation category cd..<p>
	 *
	 */
	public void gi_calc_ctg_cd(String value) {
		setConstString(offset + 4, $gi_calc_ctg_cd, value);
	}

	/**
	 * 出庫ワーキンググループＣＤ. GI WG cd..<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 5, $gi_wg_cd);
	}

	/**
	 * 出庫ワーキンググループＣＤ. GI WG cd..<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 5, $gi_wg_cd, value);
	}

	/**
	 * 出庫年月. GI month.<p>
	 *
	 */
	public MCDate gi_ym() {
		return getConstDate(offset + 6, $gi_ym);
	}

	/**
	 * 出庫年月. GI month.<p>
	 *
	 */
	public void gi_ym(MCDate value) {
		setConstDate(offset + 6, $gi_ym, value);
	}

	/**
	 * 出庫計上日. GI recording date.<p>
	 *
	 */
	public MCDate gi_ac_dt() {
		return getConstDate(offset + 7, $gi_ac_dt);
	}

	/**
	 * 出庫計上日. GI recording date.<p>
	 *
	 */
	public void gi_ac_dt(MCDate value) {
		setConstDate(offset + 7, $gi_ac_dt, value);
	}

	/**
	 * 出庫管理部門ＣＤ. GI management dept. cd..<p>
	 *
	 */
	public String gi_mng_dpt_cd() {
		return getConstString(offset + 8, $gi_mng_dpt_cd);
	}

	/**
	 * 出庫管理部門ＣＤ. GI management dept. cd..<p>
	 *
	 */
	public void gi_mng_dpt_cd(String value) {
		setConstString(offset + 8, $gi_mng_dpt_cd, value);
	}

	/**
	 * 出庫品目ＣＤ. GI item cd..<p>
	 *
	 */
	public String gi_itm_cd() {
		return getConstString(offset + 9, $gi_itm_cd);
	}

	/**
	 * 出庫品目ＣＤ. GI item cd..<p>
	 *
	 */
	public void gi_itm_cd(String value) {
		setConstString(offset + 9, $gi_itm_cd, value);
	}

	/**
	 * 出庫枝番１. GI branch No. 1.<p>
	 *
	 */
	public String gi_itm_sub1() {
		return getConstString(offset + 10, $gi_itm_sub1);
	}

	/**
	 * 出庫枝番１. GI branch No. 1.<p>
	 *
	 */
	public void gi_itm_sub1(String value) {
		setConstString(offset + 10, $gi_itm_sub1, value);
	}

	/**
	 * 出庫枝番２. GI branch No. 2.<p>
	 *
	 */
	public String gi_itm_sub2() {
		return getConstString(offset + 11, $gi_itm_sub2);
	}

	/**
	 * 出庫枝番２. GI branch No. 2.<p>
	 *
	 */
	public void gi_itm_sub2(String value) {
		setConstString(offset + 11, $gi_itm_sub2, value);
	}

	/**
	 * 出庫枝番３. GI branch No. 3.<p>
	 *
	 */
	public String gi_itm_sub3() {
		return getConstString(offset + 12, $gi_itm_sub3);
	}

	/**
	 * 出庫枝番３. GI branch No. 3.<p>
	 *
	 */
	public void gi_itm_sub3(String value) {
		setConstString(offset + 12, $gi_itm_sub3, value);
	}

	/**
	 * 出庫ロットＮＯ. GI lot No..<p>
	 *
	 */
	public String gi_lot_no() {
		return getConstString(offset + 13, $gi_lot_no);
	}

	/**
	 * 出庫ロットＮＯ. GI lot No..<p>
	 *
	 */
	public void gi_lot_no(String value) {
		setConstString(offset + 13, $gi_lot_no, value);
	}

	/**
	 * 出庫サブロットＮＯ. GI sublot No..<p>
	 *
	 */
	public String gi_sublot_no() {
		return getConstString(offset + 14, $gi_sublot_no);
	}

	/**
	 * 出庫サブロットＮＯ. GI sublot No..<p>
	 *
	 */
	public void gi_sublot_no(String value) {
		setConstString(offset + 14, $gi_sublot_no, value);
	}

	/**
	 * 出庫手配ＮＯ１. GI SEIBAN No. 1.<p>
	 *
	 */
	public String gi_sno1() {
		return getConstString(offset + 15, $gi_sno1);
	}

	/**
	 * 出庫手配ＮＯ１. GI SEIBAN No. 1.<p>
	 *
	 */
	public void gi_sno1(String value) {
		setConstString(offset + 15, $gi_sno1, value);
	}

	/**
	 * 出庫手配ＮＯ２. GI SEIBAN No. 2.<p>
	 *
	 */
	public String gi_sno2() {
		return getConstString(offset + 16, $gi_sno2);
	}

	/**
	 * 出庫手配ＮＯ２. GI SEIBAN No. 2.<p>
	 *
	 */
	public void gi_sno2(String value) {
		setConstString(offset + 16, $gi_sno2, value);
	}

	/**
	 * 出庫手配ＮＯ３. GI SEIBAN No. 3.<p>
	 *
	 */
	public String gi_sno3() {
		return getConstString(offset + 17, $gi_sno3);
	}

	/**
	 * 出庫手配ＮＯ３. GI SEIBAN No. 3.<p>
	 *
	 */
	public void gi_sno3(String value) {
		setConstString(offset + 17, $gi_sno3, value);
	}

	/**
	 * 出庫手配ＮＯ４. GI SEIBAN No. 4.<p>
	 *
	 */
	public String gi_sno4() {
		return getConstString(offset + 18, $gi_sno4);
	}

	/**
	 * 出庫手配ＮＯ４. GI SEIBAN No. 4.<p>
	 *
	 */
	public void gi_sno4(String value) {
		setConstString(offset + 18, $gi_sno4, value);
	}

	/**
	 * 出庫原価入出庫区分. GI cost GR/GI type.<p>
	 *
	 */
	public String gi_cost_io_typ() {
		return getConstString(offset + 19, $gi_cost_io_typ);
	}

	/**
	 * 出庫原価入出庫区分. GI cost GR/GI type.<p>
	 *
	 */
	public void gi_cost_io_typ(String value) {
		setConstString(offset + 19, $gi_cost_io_typ, value);
	}

	/**
	 * 出庫会計伝票区分. GI accounting slip type.<p>
	 *
	 */
	public String gi_ac_slip_typ() {
		return getConstString(offset + 20, $gi_ac_slip_typ);
	}

	/**
	 * 出庫会計伝票区分. GI accounting slip type.<p>
	 *
	 */
	public void gi_ac_slip_typ(String value) {
		setConstString(offset + 20, $gi_ac_slip_typ, value);
	}

	/**
	 * 出庫会計理由ＣＤ. GI accounting reason cd..<p>
	 *
	 */
	public String gi_ac_rsn_cd() {
		return getConstString(offset + 21, $gi_ac_rsn_cd);
	}

	/**
	 * 出庫会計理由ＣＤ. GI accounting reason cd..<p>
	 *
	 */
	public void gi_ac_rsn_cd(String value) {
		setConstString(offset + 21, $gi_ac_rsn_cd, value);
	}

	/**
	 * 出庫取引先ＣＤ. GI BP cd..<p>
	 *
	 */
	public String gi_bp_cd() {
		return getConstString(offset + 22, $gi_bp_cd);
	}

	/**
	 * 出庫取引先ＣＤ. GI BP cd..<p>
	 *
	 */
	public void gi_bp_cd(String value) {
		setConstString(offset + 22, $gi_bp_cd, value);
	}

	/**
	 * 出庫在庫先ＣＤ. GI company holding inventory cd..<p>
	 *
	 */
	public String gi_stk_bp_cd() {
		return getConstString(offset + 23, $gi_stk_bp_cd);
	}

	/**
	 * 出庫在庫先ＣＤ. GI company holding inventory cd..<p>
	 *
	 */
	public void gi_stk_bp_cd(String value) {
		setConstString(offset + 23, $gi_stk_bp_cd, value);
	}

	/**
	 * 出庫資産区分. GI asset type.<p>
	 *
	 */
	public String gi_asst_typ() {
		return getConstString(offset + 24, $gi_asst_typ);
	}

	/**
	 * 出庫資産区分. GI asset type.<p>
	 *
	 */
	public void gi_asst_typ(String value) {
		setConstString(offset + 24, $gi_asst_typ, value);
	}

	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public MCNumber gi_qty() {
		return getConstNumber(offset + 25, $gi_qty);
	}

	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public void gi_qty(MCNumber value) {
		setConstNumber(offset + 25, $gi_qty, value);
	}
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public void gi_qty(int value) {
		setConstNumber(offset + 25, $gi_qty, value);
	}
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public void gi_qty(long value) {
		setConstNumber(offset + 25, $gi_qty, value);
	}
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public void gi_qty(float value) {
		setConstNumber(offset + 25, $gi_qty, value);
	}
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public void gi_qty(double value) {
		setConstNumber(offset + 25, $gi_qty, value);
	}
	
	/**
	 * 出庫金額. GI amount.<p>
	 *
	 */
	public MCNumber gi_amt() {
		return getConstNumber(offset + 26, $gi_amt);
	}

	/**
	 * 出庫金額. GI amount.<p>
	 *
	 */
	public void gi_amt(MCNumber value) {
		setConstNumber(offset + 26, $gi_amt, value);
	}
	
	/**
	 * 出庫金額. GI amount.<p>
	 *
	 */
	public void gi_amt(int value) {
		setConstNumber(offset + 26, $gi_amt, value);
	}
	
	/**
	 * 出庫金額. GI amount.<p>
	 *
	 */
	public void gi_amt(long value) {
		setConstNumber(offset + 26, $gi_amt, value);
	}
	
	/**
	 * 出庫金額. GI amount.<p>
	 *
	 */
	public void gi_amt(float value) {
		setConstNumber(offset + 26, $gi_amt, value);
	}
	
	/**
	 * 出庫金額. GI amount.<p>
	 *
	 */
	public void gi_amt(double value) {
		setConstNumber(offset + 26, $gi_amt, value);
	}
	
	/**
	 * 出庫取引通貨ＣＤ. GI transaction currency cd..<p>
	 *
	 */
	public String gi_trd_cur_cd() {
		return getConstString(offset + 27, $gi_trd_cur_cd);
	}

	/**
	 * 出庫取引通貨ＣＤ. GI transaction currency cd..<p>
	 *
	 */
	public void gi_trd_cur_cd(String value) {
		setConstString(offset + 27, $gi_trd_cur_cd, value);
	}

	/**
	 * 出庫取引通貨金額. GI amount (Transaction currency).<p>
	 *
	 */
	public MCNumber gi_trd_cur_amt() {
		return getConstNumber(offset + 28, $gi_trd_cur_amt);
	}

	/**
	 * 出庫取引通貨金額. GI amount (Transaction currency).<p>
	 *
	 */
	public void gi_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 28, $gi_trd_cur_amt, value);
	}
	
	/**
	 * 出庫取引通貨金額. GI amount (Transaction currency).<p>
	 *
	 */
	public void gi_trd_cur_amt(int value) {
		setConstNumber(offset + 28, $gi_trd_cur_amt, value);
	}
	
	/**
	 * 出庫取引通貨金額. GI amount (Transaction currency).<p>
	 *
	 */
	public void gi_trd_cur_amt(long value) {
		setConstNumber(offset + 28, $gi_trd_cur_amt, value);
	}
	
	/**
	 * 出庫取引通貨金額. GI amount (Transaction currency).<p>
	 *
	 */
	public void gi_trd_cur_amt(float value) {
		setConstNumber(offset + 28, $gi_trd_cur_amt, value);
	}
	
	/**
	 * 出庫取引通貨金額. GI amount (Transaction currency).<p>
	 *
	 */
	public void gi_trd_cur_amt(double value) {
		setConstNumber(offset + 28, $gi_trd_cur_amt, value);
	}
	
	/**
	 * 出庫為替レート. GI exchange rate.<p>
	 *
	 */
	public MCNumber gi_xrate() {
		return getConstNumber(offset + 29, $gi_xrate);
	}

	/**
	 * 出庫為替レート. GI exchange rate.<p>
	 *
	 */
	public void gi_xrate(MCNumber value) {
		setConstNumber(offset + 29, $gi_xrate, value);
	}
	
	/**
	 * 出庫為替レート. GI exchange rate.<p>
	 *
	 */
	public void gi_xrate(int value) {
		setConstNumber(offset + 29, $gi_xrate, value);
	}
	
	/**
	 * 出庫為替レート. GI exchange rate.<p>
	 *
	 */
	public void gi_xrate(long value) {
		setConstNumber(offset + 29, $gi_xrate, value);
	}
	
	/**
	 * 出庫為替レート. GI exchange rate.<p>
	 *
	 */
	public void gi_xrate(float value) {
		setConstNumber(offset + 29, $gi_xrate, value);
	}
	
	/**
	 * 出庫為替レート. GI exchange rate.<p>
	 *
	 */
	public void gi_xrate(double value) {
		setConstNumber(offset + 29, $gi_xrate, value);
	}
	
	/**
	 * 出庫振替グループ. GI transfer group.<p>
	 *
	 */
	public String gi_trd_grp() {
		return getConstString(offset + 30, $gi_trd_grp);
	}

	/**
	 * 出庫振替グループ. GI transfer group.<p>
	 *
	 */
	public void gi_trd_grp(String value) {
		setConstString(offset + 30, $gi_trd_grp, value);
	}

	/**
	 * 出庫個別評価区分. GI individual evaluation type.<p>
	 *
	 */
	public String gi_rec_eval_typ() {
		return getConstString(offset + 31, $gi_rec_eval_typ);
	}

	/**
	 * 出庫個別評価区分. GI individual evaluation type.<p>
	 *
	 */
	public void gi_rec_eval_typ(String value) {
		setConstString(offset + 31, $gi_rec_eval_typ, value);
	}

	/**
	 * 出庫計算順序. GI calculation sequence.<p>
	 *
	 */
	public MCNumber gi_calc_seq() {
		return getConstNumber(offset + 32, $gi_calc_seq);
	}

	/**
	 * 出庫計算順序. GI calculation sequence.<p>
	 *
	 */
	public void gi_calc_seq(MCNumber value) {
		setConstNumber(offset + 32, $gi_calc_seq, value);
	}
	
	/**
	 * 出庫計算順序. GI calculation sequence.<p>
	 *
	 */
	public void gi_calc_seq(int value) {
		setConstNumber(offset + 32, $gi_calc_seq, value);
	}
	
	/**
	 * 出庫計算順序. GI calculation sequence.<p>
	 *
	 */
	public void gi_calc_seq(long value) {
		setConstNumber(offset + 32, $gi_calc_seq, value);
	}
	
	/**
	 * 出庫計算順序. GI calculation sequence.<p>
	 *
	 */
	public void gi_calc_seq(float value) {
		setConstNumber(offset + 32, $gi_calc_seq, value);
	}
	
	/**
	 * 出庫計算順序. GI calculation sequence.<p>
	 *
	 */
	public void gi_calc_seq(double value) {
		setConstNumber(offset + 32, $gi_calc_seq, value);
	}
	
	/**
	 * 出庫ゼロ評価ＦＬＧ. GI zero evaluation flg..<p>
	 *
	 */
	public boolean gi_zero_effect_flg() {
		return getConstBoolean(offset + 33, $gi_zero_effect_flg);
	}

	/**
	 * 出庫ゼロ評価ＦＬＧ. GI zero evaluation flg..<p>
	 *
	 */
	public void gi_zero_effect_flg(boolean value) {
		setConstBoolean(offset + 33, $gi_zero_effect_flg, value);
	}

	/**
	 * 入庫計算カテゴリＣＤ. GR calculation category cd..<p>
	 *
	 */
	public String gr_calc_ctg_cd() {
		return getConstString(offset + 34, $gr_calc_ctg_cd);
	}

	/**
	 * 入庫計算カテゴリＣＤ. GR calculation category cd..<p>
	 *
	 */
	public void gr_calc_ctg_cd(String value) {
		setConstString(offset + 34, $gr_calc_ctg_cd, value);
	}

	/**
	 * 入庫ワーキンググループＣＤ. GR WG cd..<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 35, $gr_wg_cd);
	}

	/**
	 * 入庫ワーキンググループＣＤ. GR WG cd..<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 35, $gr_wg_cd, value);
	}

	/**
	 * 入庫年月. GR month.<p>
	 *
	 */
	public MCDate gr_ym() {
		return getConstDate(offset + 36, $gr_ym);
	}

	/**
	 * 入庫年月. GR month.<p>
	 *
	 */
	public void gr_ym(MCDate value) {
		setConstDate(offset + 36, $gr_ym, value);
	}

	/**
	 * 入庫計上日. GR recording date.<p>
	 *
	 */
	public MCDate gr_ac_dt() {
		return getConstDate(offset + 37, $gr_ac_dt);
	}

	/**
	 * 入庫計上日. GR recording date.<p>
	 *
	 */
	public void gr_ac_dt(MCDate value) {
		setConstDate(offset + 37, $gr_ac_dt, value);
	}

	/**
	 * 入庫管理部門ＣＤ. GR management dept. cd..<p>
	 *
	 */
	public String gr_mng_dpt_cd() {
		return getConstString(offset + 38, $gr_mng_dpt_cd);
	}

	/**
	 * 入庫管理部門ＣＤ. GR management dept. cd..<p>
	 *
	 */
	public void gr_mng_dpt_cd(String value) {
		setConstString(offset + 38, $gr_mng_dpt_cd, value);
	}

	/**
	 * 入庫品目ＣＤ. GR item cd..<p>
	 *
	 */
	public String gr_itm_cd() {
		return getConstString(offset + 39, $gr_itm_cd);
	}

	/**
	 * 入庫品目ＣＤ. GR item cd..<p>
	 *
	 */
	public void gr_itm_cd(String value) {
		setConstString(offset + 39, $gr_itm_cd, value);
	}

	/**
	 * 入庫枝番１. GR branch No. 1.<p>
	 *
	 */
	public String gr_itm_sub1() {
		return getConstString(offset + 40, $gr_itm_sub1);
	}

	/**
	 * 入庫枝番１. GR branch No. 1.<p>
	 *
	 */
	public void gr_itm_sub1(String value) {
		setConstString(offset + 40, $gr_itm_sub1, value);
	}

	/**
	 * 入庫枝番２. GR branch No. 2.<p>
	 *
	 */
	public String gr_itm_sub2() {
		return getConstString(offset + 41, $gr_itm_sub2);
	}

	/**
	 * 入庫枝番２. GR branch No. 2.<p>
	 *
	 */
	public void gr_itm_sub2(String value) {
		setConstString(offset + 41, $gr_itm_sub2, value);
	}

	/**
	 * 入庫枝番３. GR branch No. 3.<p>
	 *
	 */
	public String gr_itm_sub3() {
		return getConstString(offset + 42, $gr_itm_sub3);
	}

	/**
	 * 入庫枝番３. GR branch No. 3.<p>
	 *
	 */
	public void gr_itm_sub3(String value) {
		setConstString(offset + 42, $gr_itm_sub3, value);
	}

	/**
	 * 入庫ロットＮＯ. GR lot No..<p>
	 *
	 */
	public String gr_lot_no() {
		return getConstString(offset + 43, $gr_lot_no);
	}

	/**
	 * 入庫ロットＮＯ. GR lot No..<p>
	 *
	 */
	public void gr_lot_no(String value) {
		setConstString(offset + 43, $gr_lot_no, value);
	}

	/**
	 * 入庫サブロットＮＯ. GR sublot No..<p>
	 *
	 */
	public String gr_sublot_no() {
		return getConstString(offset + 44, $gr_sublot_no);
	}

	/**
	 * 入庫サブロットＮＯ. GR sublot No..<p>
	 *
	 */
	public void gr_sublot_no(String value) {
		setConstString(offset + 44, $gr_sublot_no, value);
	}

	/**
	 * 入庫手配ＮＯ１. GR SEIBAN No. 1.<p>
	 *
	 */
	public String gr_sno1() {
		return getConstString(offset + 45, $gr_sno1);
	}

	/**
	 * 入庫手配ＮＯ１. GR SEIBAN No. 1.<p>
	 *
	 */
	public void gr_sno1(String value) {
		setConstString(offset + 45, $gr_sno1, value);
	}

	/**
	 * 入庫手配ＮＯ２. GR SEIBAN No. 2.<p>
	 *
	 */
	public String gr_sno2() {
		return getConstString(offset + 46, $gr_sno2);
	}

	/**
	 * 入庫手配ＮＯ２. GR SEIBAN No. 2.<p>
	 *
	 */
	public void gr_sno2(String value) {
		setConstString(offset + 46, $gr_sno2, value);
	}

	/**
	 * 入庫手配ＮＯ３. GR SEIBAN No. 3.<p>
	 *
	 */
	public String gr_sno3() {
		return getConstString(offset + 47, $gr_sno3);
	}

	/**
	 * 入庫手配ＮＯ３. GR SEIBAN No. 3.<p>
	 *
	 */
	public void gr_sno3(String value) {
		setConstString(offset + 47, $gr_sno3, value);
	}

	/**
	 * 入庫手配ＮＯ４. GR SEIBAN No. 4.<p>
	 *
	 */
	public String gr_sno4() {
		return getConstString(offset + 48, $gr_sno4);
	}

	/**
	 * 入庫手配ＮＯ４. GR SEIBAN No. 4.<p>
	 *
	 */
	public void gr_sno4(String value) {
		setConstString(offset + 48, $gr_sno4, value);
	}

	/**
	 * 入庫原価入出庫区分. GR cost GR/GI type.<p>
	 *
	 */
	public String gr_cost_io_typ() {
		return getConstString(offset + 49, $gr_cost_io_typ);
	}

	/**
	 * 入庫原価入出庫区分. GR cost GR/GI type.<p>
	 *
	 */
	public void gr_cost_io_typ(String value) {
		setConstString(offset + 49, $gr_cost_io_typ, value);
	}

	/**
	 * 入庫会計伝票区分. GR accounting slip type.<p>
	 *
	 */
	public String gr_ac_slip_typ() {
		return getConstString(offset + 50, $gr_ac_slip_typ);
	}

	/**
	 * 入庫会計伝票区分. GR accounting slip type.<p>
	 *
	 */
	public void gr_ac_slip_typ(String value) {
		setConstString(offset + 50, $gr_ac_slip_typ, value);
	}

	/**
	 * 入庫会計理由ＣＤ. GR accounting reason cd..<p>
	 *
	 */
	public String gr_ac_rsn_cd() {
		return getConstString(offset + 51, $gr_ac_rsn_cd);
	}

	/**
	 * 入庫会計理由ＣＤ. GR accounting reason cd..<p>
	 *
	 */
	public void gr_ac_rsn_cd(String value) {
		setConstString(offset + 51, $gr_ac_rsn_cd, value);
	}

	/**
	 * 入庫取引先ＣＤ. GR BP cd..<p>
	 *
	 */
	public String gr_bp_cd() {
		return getConstString(offset + 52, $gr_bp_cd);
	}

	/**
	 * 入庫取引先ＣＤ. GR BP cd..<p>
	 *
	 */
	public void gr_bp_cd(String value) {
		setConstString(offset + 52, $gr_bp_cd, value);
	}

	/**
	 * 入庫在庫先ＣＤ. GR company holding inventory cd..<p>
	 *
	 */
	public String gr_stk_bp_cd() {
		return getConstString(offset + 53, $gr_stk_bp_cd);
	}

	/**
	 * 入庫在庫先ＣＤ. GR company holding inventory cd..<p>
	 *
	 */
	public void gr_stk_bp_cd(String value) {
		setConstString(offset + 53, $gr_stk_bp_cd, value);
	}

	/**
	 * 入庫資産区分. GR asset type.<p>
	 *
	 */
	public String gr_asst_typ() {
		return getConstString(offset + 54, $gr_asst_typ);
	}

	/**
	 * 入庫資産区分. GR asset type.<p>
	 *
	 */
	public void gr_asst_typ(String value) {
		setConstString(offset + 54, $gr_asst_typ, value);
	}

	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public MCNumber gr_qty() {
		return getConstNumber(offset + 55, $gr_qty);
	}

	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public void gr_qty(MCNumber value) {
		setConstNumber(offset + 55, $gr_qty, value);
	}
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public void gr_qty(int value) {
		setConstNumber(offset + 55, $gr_qty, value);
	}
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public void gr_qty(long value) {
		setConstNumber(offset + 55, $gr_qty, value);
	}
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public void gr_qty(float value) {
		setConstNumber(offset + 55, $gr_qty, value);
	}
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public void gr_qty(double value) {
		setConstNumber(offset + 55, $gr_qty, value);
	}
	
	/**
	 * 入庫金額. GR amount.<p>
	 *
	 */
	public MCNumber gr_amt() {
		return getConstNumber(offset + 56, $gr_amt);
	}

	/**
	 * 入庫金額. GR amount.<p>
	 *
	 */
	public void gr_amt(MCNumber value) {
		setConstNumber(offset + 56, $gr_amt, value);
	}
	
	/**
	 * 入庫金額. GR amount.<p>
	 *
	 */
	public void gr_amt(int value) {
		setConstNumber(offset + 56, $gr_amt, value);
	}
	
	/**
	 * 入庫金額. GR amount.<p>
	 *
	 */
	public void gr_amt(long value) {
		setConstNumber(offset + 56, $gr_amt, value);
	}
	
	/**
	 * 入庫金額. GR amount.<p>
	 *
	 */
	public void gr_amt(float value) {
		setConstNumber(offset + 56, $gr_amt, value);
	}
	
	/**
	 * 入庫金額. GR amount.<p>
	 *
	 */
	public void gr_amt(double value) {
		setConstNumber(offset + 56, $gr_amt, value);
	}
	
	/**
	 * 入庫取引通貨ＣＤ. GR transaction currency cd..<p>
	 *
	 */
	public String gr_trd_cur_cd() {
		return getConstString(offset + 57, $gr_trd_cur_cd);
	}

	/**
	 * 入庫取引通貨ＣＤ. GR transaction currency cd..<p>
	 *
	 */
	public void gr_trd_cur_cd(String value) {
		setConstString(offset + 57, $gr_trd_cur_cd, value);
	}

	/**
	 * 入庫取引通貨金額. GR amount (Transaction currency).<p>
	 *
	 */
	public MCNumber gr_trd_cur_amt() {
		return getConstNumber(offset + 58, $gr_trd_cur_amt);
	}

	/**
	 * 入庫取引通貨金額. GR amount (Transaction currency).<p>
	 *
	 */
	public void gr_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 58, $gr_trd_cur_amt, value);
	}
	
	/**
	 * 入庫取引通貨金額. GR amount (Transaction currency).<p>
	 *
	 */
	public void gr_trd_cur_amt(int value) {
		setConstNumber(offset + 58, $gr_trd_cur_amt, value);
	}
	
	/**
	 * 入庫取引通貨金額. GR amount (Transaction currency).<p>
	 *
	 */
	public void gr_trd_cur_amt(long value) {
		setConstNumber(offset + 58, $gr_trd_cur_amt, value);
	}
	
	/**
	 * 入庫取引通貨金額. GR amount (Transaction currency).<p>
	 *
	 */
	public void gr_trd_cur_amt(float value) {
		setConstNumber(offset + 58, $gr_trd_cur_amt, value);
	}
	
	/**
	 * 入庫取引通貨金額. GR amount (Transaction currency).<p>
	 *
	 */
	public void gr_trd_cur_amt(double value) {
		setConstNumber(offset + 58, $gr_trd_cur_amt, value);
	}
	
	/**
	 * 入庫為替レート. GR exchange rate.<p>
	 *
	 */
	public MCNumber gr_xrate() {
		return getConstNumber(offset + 59, $gr_xrate);
	}

	/**
	 * 入庫為替レート. GR exchange rate.<p>
	 *
	 */
	public void gr_xrate(MCNumber value) {
		setConstNumber(offset + 59, $gr_xrate, value);
	}
	
	/**
	 * 入庫為替レート. GR exchange rate.<p>
	 *
	 */
	public void gr_xrate(int value) {
		setConstNumber(offset + 59, $gr_xrate, value);
	}
	
	/**
	 * 入庫為替レート. GR exchange rate.<p>
	 *
	 */
	public void gr_xrate(long value) {
		setConstNumber(offset + 59, $gr_xrate, value);
	}
	
	/**
	 * 入庫為替レート. GR exchange rate.<p>
	 *
	 */
	public void gr_xrate(float value) {
		setConstNumber(offset + 59, $gr_xrate, value);
	}
	
	/**
	 * 入庫為替レート. GR exchange rate.<p>
	 *
	 */
	public void gr_xrate(double value) {
		setConstNumber(offset + 59, $gr_xrate, value);
	}
	
	/**
	 * 入庫振替グループ. GR transfer group.<p>
	 *
	 */
	public String gr_trd_grp() {
		return getConstString(offset + 60, $gr_trd_grp);
	}

	/**
	 * 入庫振替グループ. GR transfer group.<p>
	 *
	 */
	public void gr_trd_grp(String value) {
		setConstString(offset + 60, $gr_trd_grp, value);
	}

	/**
	 * 入庫個別評価区分. GR specific evaluation type.<p>
	 *
	 */
	public String gr_rec_eval_typ() {
		return getConstString(offset + 61, $gr_rec_eval_typ);
	}

	/**
	 * 入庫個別評価区分. GR specific evaluation type.<p>
	 *
	 */
	public void gr_rec_eval_typ(String value) {
		setConstString(offset + 61, $gr_rec_eval_typ, value);
	}

	/**
	 * 入庫計算順序. GR calculation sequence.<p>
	 *
	 */
	public MCNumber gr_calc_seq() {
		return getConstNumber(offset + 62, $gr_calc_seq);
	}

	/**
	 * 入庫計算順序. GR calculation sequence.<p>
	 *
	 */
	public void gr_calc_seq(MCNumber value) {
		setConstNumber(offset + 62, $gr_calc_seq, value);
	}
	
	/**
	 * 入庫計算順序. GR calculation sequence.<p>
	 *
	 */
	public void gr_calc_seq(int value) {
		setConstNumber(offset + 62, $gr_calc_seq, value);
	}
	
	/**
	 * 入庫計算順序. GR calculation sequence.<p>
	 *
	 */
	public void gr_calc_seq(long value) {
		setConstNumber(offset + 62, $gr_calc_seq, value);
	}
	
	/**
	 * 入庫計算順序. GR calculation sequence.<p>
	 *
	 */
	public void gr_calc_seq(float value) {
		setConstNumber(offset + 62, $gr_calc_seq, value);
	}
	
	/**
	 * 入庫計算順序. GR calculation sequence.<p>
	 *
	 */
	public void gr_calc_seq(double value) {
		setConstNumber(offset + 62, $gr_calc_seq, value);
	}
	
	/**
	 * 入庫ゼロ評価ＦＬＧ. GR zero evaluation flg..<p>
	 *
	 */
	public boolean gr_zero_effect_flg() {
		return getConstBoolean(offset + 63, $gr_zero_effect_flg);
	}

	/**
	 * 入庫ゼロ評価ＦＬＧ. GR zero evaluation flg..<p>
	 *
	 */
	public void gr_zero_effect_flg(boolean value) {
		setConstBoolean(offset + 63, $gr_zero_effect_flg, value);
	}

	public String getString(String name) {
		if ($gi_act_io_id.equalsIgnoreCase(name)) {
			return gi_act_io_id();
		}
		if ($gi_act_io_id_sub.equalsIgnoreCase(name)) {
			return gi_act_io_id_sub();
		}
		if ($gr_act_io_id.equalsIgnoreCase(name)) {
			return gr_act_io_id();
		}
		if ($gr_act_io_id_sub.equalsIgnoreCase(name)) {
			return gr_act_io_id_sub();
		}
		if ($gi_calc_ctg_cd.equalsIgnoreCase(name)) {
			return gi_calc_ctg_cd();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_mng_dpt_cd.equalsIgnoreCase(name)) {
			return gi_mng_dpt_cd();
		}
		if ($gi_itm_cd.equalsIgnoreCase(name)) {
			return gi_itm_cd();
		}
		if ($gi_itm_sub1.equalsIgnoreCase(name)) {
			return gi_itm_sub1();
		}
		if ($gi_itm_sub2.equalsIgnoreCase(name)) {
			return gi_itm_sub2();
		}
		if ($gi_itm_sub3.equalsIgnoreCase(name)) {
			return gi_itm_sub3();
		}
		if ($gi_lot_no.equalsIgnoreCase(name)) {
			return gi_lot_no();
		}
		if ($gi_sublot_no.equalsIgnoreCase(name)) {
			return gi_sublot_no();
		}
		if ($gi_sno1.equalsIgnoreCase(name)) {
			return gi_sno1();
		}
		if ($gi_sno2.equalsIgnoreCase(name)) {
			return gi_sno2();
		}
		if ($gi_sno3.equalsIgnoreCase(name)) {
			return gi_sno3();
		}
		if ($gi_sno4.equalsIgnoreCase(name)) {
			return gi_sno4();
		}
		if ($gi_cost_io_typ.equalsIgnoreCase(name)) {
			return gi_cost_io_typ();
		}
		if ($gi_ac_slip_typ.equalsIgnoreCase(name)) {
			return gi_ac_slip_typ();
		}
		if ($gi_ac_rsn_cd.equalsIgnoreCase(name)) {
			return gi_ac_rsn_cd();
		}
		if ($gi_bp_cd.equalsIgnoreCase(name)) {
			return gi_bp_cd();
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_bp_cd();
		}
		if ($gi_asst_typ.equalsIgnoreCase(name)) {
			return gi_asst_typ();
		}
		if ($gi_trd_cur_cd.equalsIgnoreCase(name)) {
			return gi_trd_cur_cd();
		}
		if ($gi_trd_grp.equalsIgnoreCase(name)) {
			return gi_trd_grp();
		}
		if ($gi_rec_eval_typ.equalsIgnoreCase(name)) {
			return gi_rec_eval_typ();
		}
		if ($gr_calc_ctg_cd.equalsIgnoreCase(name)) {
			return gr_calc_ctg_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_mng_dpt_cd.equalsIgnoreCase(name)) {
			return gr_mng_dpt_cd();
		}
		if ($gr_itm_cd.equalsIgnoreCase(name)) {
			return gr_itm_cd();
		}
		if ($gr_itm_sub1.equalsIgnoreCase(name)) {
			return gr_itm_sub1();
		}
		if ($gr_itm_sub2.equalsIgnoreCase(name)) {
			return gr_itm_sub2();
		}
		if ($gr_itm_sub3.equalsIgnoreCase(name)) {
			return gr_itm_sub3();
		}
		if ($gr_lot_no.equalsIgnoreCase(name)) {
			return gr_lot_no();
		}
		if ($gr_sublot_no.equalsIgnoreCase(name)) {
			return gr_sublot_no();
		}
		if ($gr_sno1.equalsIgnoreCase(name)) {
			return gr_sno1();
		}
		if ($gr_sno2.equalsIgnoreCase(name)) {
			return gr_sno2();
		}
		if ($gr_sno3.equalsIgnoreCase(name)) {
			return gr_sno3();
		}
		if ($gr_sno4.equalsIgnoreCase(name)) {
			return gr_sno4();
		}
		if ($gr_cost_io_typ.equalsIgnoreCase(name)) {
			return gr_cost_io_typ();
		}
		if ($gr_ac_slip_typ.equalsIgnoreCase(name)) {
			return gr_ac_slip_typ();
		}
		if ($gr_ac_rsn_cd.equalsIgnoreCase(name)) {
			return gr_ac_rsn_cd();
		}
		if ($gr_bp_cd.equalsIgnoreCase(name)) {
			return gr_bp_cd();
		}
		if ($gr_stk_bp_cd.equalsIgnoreCase(name)) {
			return gr_stk_bp_cd();
		}
		if ($gr_asst_typ.equalsIgnoreCase(name)) {
			return gr_asst_typ();
		}
		if ($gr_trd_cur_cd.equalsIgnoreCase(name)) {
			return gr_trd_cur_cd();
		}
		if ($gr_trd_grp.equalsIgnoreCase(name)) {
			return gr_trd_grp();
		}
		if ($gr_rec_eval_typ.equalsIgnoreCase(name)) {
			return gr_rec_eval_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			return gi_qty();
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			return gi_amt();
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			return gi_trd_cur_amt();
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			return gi_xrate();
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			return gi_calc_seq();
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			return gr_qty();
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			return gr_amt();
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			return gr_trd_cur_amt();
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			return gr_xrate();
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			return gr_calc_seq();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($gi_ym.equalsIgnoreCase(name)) {
			return gi_ym();
		}
		if ($gi_ac_dt.equalsIgnoreCase(name)) {
			return gi_ac_dt();
		}
		if ($gr_ym.equalsIgnoreCase(name)) {
			return gr_ym();
		}
		if ($gr_ac_dt.equalsIgnoreCase(name)) {
			return gr_ac_dt();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($gi_zero_effect_flg.equalsIgnoreCase(name)) {
			return gi_zero_effect_flg();
		}
		if ($gr_zero_effect_flg.equalsIgnoreCase(name)) {
			return gr_zero_effect_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($gi_act_io_id.equalsIgnoreCase(name)) {
			return gi_act_io_id();
		}
		if ($gi_act_io_id_sub.equalsIgnoreCase(name)) {
			return gi_act_io_id_sub();
		}
		if ($gr_act_io_id.equalsIgnoreCase(name)) {
			return gr_act_io_id();
		}
		if ($gr_act_io_id_sub.equalsIgnoreCase(name)) {
			return gr_act_io_id_sub();
		}
		if ($gi_calc_ctg_cd.equalsIgnoreCase(name)) {
			return gi_calc_ctg_cd();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_mng_dpt_cd.equalsIgnoreCase(name)) {
			return gi_mng_dpt_cd();
		}
		if ($gi_itm_cd.equalsIgnoreCase(name)) {
			return gi_itm_cd();
		}
		if ($gi_itm_sub1.equalsIgnoreCase(name)) {
			return gi_itm_sub1();
		}
		if ($gi_itm_sub2.equalsIgnoreCase(name)) {
			return gi_itm_sub2();
		}
		if ($gi_itm_sub3.equalsIgnoreCase(name)) {
			return gi_itm_sub3();
		}
		if ($gi_lot_no.equalsIgnoreCase(name)) {
			return gi_lot_no();
		}
		if ($gi_sublot_no.equalsIgnoreCase(name)) {
			return gi_sublot_no();
		}
		if ($gi_sno1.equalsIgnoreCase(name)) {
			return gi_sno1();
		}
		if ($gi_sno2.equalsIgnoreCase(name)) {
			return gi_sno2();
		}
		if ($gi_sno3.equalsIgnoreCase(name)) {
			return gi_sno3();
		}
		if ($gi_sno4.equalsIgnoreCase(name)) {
			return gi_sno4();
		}
		if ($gi_cost_io_typ.equalsIgnoreCase(name)) {
			return gi_cost_io_typ();
		}
		if ($gi_ac_slip_typ.equalsIgnoreCase(name)) {
			return gi_ac_slip_typ();
		}
		if ($gi_ac_rsn_cd.equalsIgnoreCase(name)) {
			return gi_ac_rsn_cd();
		}
		if ($gi_bp_cd.equalsIgnoreCase(name)) {
			return gi_bp_cd();
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_bp_cd();
		}
		if ($gi_asst_typ.equalsIgnoreCase(name)) {
			return gi_asst_typ();
		}
		if ($gi_trd_cur_cd.equalsIgnoreCase(name)) {
			return gi_trd_cur_cd();
		}
		if ($gi_trd_grp.equalsIgnoreCase(name)) {
			return gi_trd_grp();
		}
		if ($gi_rec_eval_typ.equalsIgnoreCase(name)) {
			return gi_rec_eval_typ();
		}
		if ($gr_calc_ctg_cd.equalsIgnoreCase(name)) {
			return gr_calc_ctg_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_mng_dpt_cd.equalsIgnoreCase(name)) {
			return gr_mng_dpt_cd();
		}
		if ($gr_itm_cd.equalsIgnoreCase(name)) {
			return gr_itm_cd();
		}
		if ($gr_itm_sub1.equalsIgnoreCase(name)) {
			return gr_itm_sub1();
		}
		if ($gr_itm_sub2.equalsIgnoreCase(name)) {
			return gr_itm_sub2();
		}
		if ($gr_itm_sub3.equalsIgnoreCase(name)) {
			return gr_itm_sub3();
		}
		if ($gr_lot_no.equalsIgnoreCase(name)) {
			return gr_lot_no();
		}
		if ($gr_sublot_no.equalsIgnoreCase(name)) {
			return gr_sublot_no();
		}
		if ($gr_sno1.equalsIgnoreCase(name)) {
			return gr_sno1();
		}
		if ($gr_sno2.equalsIgnoreCase(name)) {
			return gr_sno2();
		}
		if ($gr_sno3.equalsIgnoreCase(name)) {
			return gr_sno3();
		}
		if ($gr_sno4.equalsIgnoreCase(name)) {
			return gr_sno4();
		}
		if ($gr_cost_io_typ.equalsIgnoreCase(name)) {
			return gr_cost_io_typ();
		}
		if ($gr_ac_slip_typ.equalsIgnoreCase(name)) {
			return gr_ac_slip_typ();
		}
		if ($gr_ac_rsn_cd.equalsIgnoreCase(name)) {
			return gr_ac_rsn_cd();
		}
		if ($gr_bp_cd.equalsIgnoreCase(name)) {
			return gr_bp_cd();
		}
		if ($gr_stk_bp_cd.equalsIgnoreCase(name)) {
			return gr_stk_bp_cd();
		}
		if ($gr_asst_typ.equalsIgnoreCase(name)) {
			return gr_asst_typ();
		}
		if ($gr_trd_cur_cd.equalsIgnoreCase(name)) {
			return gr_trd_cur_cd();
		}
		if ($gr_trd_grp.equalsIgnoreCase(name)) {
			return gr_trd_grp();
		}
		if ($gr_rec_eval_typ.equalsIgnoreCase(name)) {
			return gr_rec_eval_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			return gi_qty();
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			return gi_amt();
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			return gi_trd_cur_amt();
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			return gi_xrate();
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			return gi_calc_seq();
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			return gr_qty();
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			return gr_amt();
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			return gr_trd_cur_amt();
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			return gr_xrate();
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			return gr_calc_seq();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($gi_ym.equalsIgnoreCase(name)) {
			return gi_ym();
		}
		if ($gi_ac_dt.equalsIgnoreCase(name)) {
			return gi_ac_dt();
		}
		if ($gr_ym.equalsIgnoreCase(name)) {
			return gr_ym();
		}
		if ($gr_ac_dt.equalsIgnoreCase(name)) {
			return gr_ac_dt();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($gi_zero_effect_flg.equalsIgnoreCase(name)) {
			return gi_zero_effect_flg();
		}
		if ($gr_zero_effect_flg.equalsIgnoreCase(name)) {
			return gr_zero_effect_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($gi_act_io_id.equalsIgnoreCase(name)) {
			gi_act_io_id(value);
			return;
		}
		if ($gi_act_io_id_sub.equalsIgnoreCase(name)) {
			gi_act_io_id_sub(value);
			return;
		}
		if ($gr_act_io_id.equalsIgnoreCase(name)) {
			gr_act_io_id(value);
			return;
		}
		if ($gr_act_io_id_sub.equalsIgnoreCase(name)) {
			gr_act_io_id_sub(value);
			return;
		}
		if ($gi_calc_ctg_cd.equalsIgnoreCase(name)) {
			gi_calc_ctg_cd(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_mng_dpt_cd.equalsIgnoreCase(name)) {
			gi_mng_dpt_cd(value);
			return;
		}
		if ($gi_itm_cd.equalsIgnoreCase(name)) {
			gi_itm_cd(value);
			return;
		}
		if ($gi_itm_sub1.equalsIgnoreCase(name)) {
			gi_itm_sub1(value);
			return;
		}
		if ($gi_itm_sub2.equalsIgnoreCase(name)) {
			gi_itm_sub2(value);
			return;
		}
		if ($gi_itm_sub3.equalsIgnoreCase(name)) {
			gi_itm_sub3(value);
			return;
		}
		if ($gi_lot_no.equalsIgnoreCase(name)) {
			gi_lot_no(value);
			return;
		}
		if ($gi_sublot_no.equalsIgnoreCase(name)) {
			gi_sublot_no(value);
			return;
		}
		if ($gi_sno1.equalsIgnoreCase(name)) {
			gi_sno1(value);
			return;
		}
		if ($gi_sno2.equalsIgnoreCase(name)) {
			gi_sno2(value);
			return;
		}
		if ($gi_sno3.equalsIgnoreCase(name)) {
			gi_sno3(value);
			return;
		}
		if ($gi_sno4.equalsIgnoreCase(name)) {
			gi_sno4(value);
			return;
		}
		if ($gi_cost_io_typ.equalsIgnoreCase(name)) {
			gi_cost_io_typ(value);
			return;
		}
		if ($gi_ac_slip_typ.equalsIgnoreCase(name)) {
			gi_ac_slip_typ(value);
			return;
		}
		if ($gi_ac_rsn_cd.equalsIgnoreCase(name)) {
			gi_ac_rsn_cd(value);
			return;
		}
		if ($gi_bp_cd.equalsIgnoreCase(name)) {
			gi_bp_cd(value);
			return;
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_bp_cd(value);
			return;
		}
		if ($gi_asst_typ.equalsIgnoreCase(name)) {
			gi_asst_typ(value);
			return;
		}
		if ($gi_trd_cur_cd.equalsIgnoreCase(name)) {
			gi_trd_cur_cd(value);
			return;
		}
		if ($gi_trd_grp.equalsIgnoreCase(name)) {
			gi_trd_grp(value);
			return;
		}
		if ($gi_rec_eval_typ.equalsIgnoreCase(name)) {
			gi_rec_eval_typ(value);
			return;
		}
		if ($gr_calc_ctg_cd.equalsIgnoreCase(name)) {
			gr_calc_ctg_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_mng_dpt_cd.equalsIgnoreCase(name)) {
			gr_mng_dpt_cd(value);
			return;
		}
		if ($gr_itm_cd.equalsIgnoreCase(name)) {
			gr_itm_cd(value);
			return;
		}
		if ($gr_itm_sub1.equalsIgnoreCase(name)) {
			gr_itm_sub1(value);
			return;
		}
		if ($gr_itm_sub2.equalsIgnoreCase(name)) {
			gr_itm_sub2(value);
			return;
		}
		if ($gr_itm_sub3.equalsIgnoreCase(name)) {
			gr_itm_sub3(value);
			return;
		}
		if ($gr_lot_no.equalsIgnoreCase(name)) {
			gr_lot_no(value);
			return;
		}
		if ($gr_sublot_no.equalsIgnoreCase(name)) {
			gr_sublot_no(value);
			return;
		}
		if ($gr_sno1.equalsIgnoreCase(name)) {
			gr_sno1(value);
			return;
		}
		if ($gr_sno2.equalsIgnoreCase(name)) {
			gr_sno2(value);
			return;
		}
		if ($gr_sno3.equalsIgnoreCase(name)) {
			gr_sno3(value);
			return;
		}
		if ($gr_sno4.equalsIgnoreCase(name)) {
			gr_sno4(value);
			return;
		}
		if ($gr_cost_io_typ.equalsIgnoreCase(name)) {
			gr_cost_io_typ(value);
			return;
		}
		if ($gr_ac_slip_typ.equalsIgnoreCase(name)) {
			gr_ac_slip_typ(value);
			return;
		}
		if ($gr_ac_rsn_cd.equalsIgnoreCase(name)) {
			gr_ac_rsn_cd(value);
			return;
		}
		if ($gr_bp_cd.equalsIgnoreCase(name)) {
			gr_bp_cd(value);
			return;
		}
		if ($gr_stk_bp_cd.equalsIgnoreCase(name)) {
			gr_stk_bp_cd(value);
			return;
		}
		if ($gr_asst_typ.equalsIgnoreCase(name)) {
			gr_asst_typ(value);
			return;
		}
		if ($gr_trd_cur_cd.equalsIgnoreCase(name)) {
			gr_trd_cur_cd(value);
			return;
		}
		if ($gr_trd_grp.equalsIgnoreCase(name)) {
			gr_trd_grp(value);
			return;
		}
		if ($gr_rec_eval_typ.equalsIgnoreCase(name)) {
			gr_rec_eval_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			gi_amt(value);
			return;
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			gi_trd_cur_amt(value);
			return;
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			gi_xrate(value);
			return;
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			gi_calc_seq(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			gr_amt(value);
			return;
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			gr_trd_cur_amt(value);
			return;
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			gr_xrate(value);
			return;
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			gr_calc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			gi_amt(value);
			return;
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			gi_trd_cur_amt(value);
			return;
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			gi_xrate(value);
			return;
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			gi_calc_seq(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			gr_amt(value);
			return;
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			gr_trd_cur_amt(value);
			return;
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			gr_xrate(value);
			return;
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			gr_calc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			gi_amt(value);
			return;
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			gi_trd_cur_amt(value);
			return;
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			gi_xrate(value);
			return;
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			gi_calc_seq(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			gr_amt(value);
			return;
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			gr_trd_cur_amt(value);
			return;
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			gr_xrate(value);
			return;
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			gr_calc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			gi_amt(value);
			return;
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			gi_trd_cur_amt(value);
			return;
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			gi_xrate(value);
			return;
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			gi_calc_seq(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			gr_amt(value);
			return;
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			gr_trd_cur_amt(value);
			return;
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			gr_xrate(value);
			return;
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			gr_calc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			gi_amt(value);
			return;
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			gi_trd_cur_amt(value);
			return;
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			gi_xrate(value);
			return;
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			gi_calc_seq(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			gr_amt(value);
			return;
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			gr_trd_cur_amt(value);
			return;
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			gr_xrate(value);
			return;
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			gr_calc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($gi_ym.equalsIgnoreCase(name)) {
			gi_ym(value);
			return;
		}
		if ($gi_ac_dt.equalsIgnoreCase(name)) {
			gi_ac_dt(value);
			return;
		}
		if ($gr_ym.equalsIgnoreCase(name)) {
			gr_ym(value);
			return;
		}
		if ($gr_ac_dt.equalsIgnoreCase(name)) {
			gr_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($gi_zero_effect_flg.equalsIgnoreCase(name)) {
			gi_zero_effect_flg(value);
			return;
		}
		if ($gr_zero_effect_flg.equalsIgnoreCase(name)) {
			gr_zero_effect_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($gi_act_io_id.equalsIgnoreCase(name)) {
			gi_act_io_id(value);
			return;
		}
		if ($gi_act_io_id_sub.equalsIgnoreCase(name)) {
			gi_act_io_id_sub(value);
			return;
		}
		if ($gr_act_io_id.equalsIgnoreCase(name)) {
			gr_act_io_id(value);
			return;
		}
		if ($gr_act_io_id_sub.equalsIgnoreCase(name)) {
			gr_act_io_id_sub(value);
			return;
		}
		if ($gi_calc_ctg_cd.equalsIgnoreCase(name)) {
			gi_calc_ctg_cd(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_mng_dpt_cd.equalsIgnoreCase(name)) {
			gi_mng_dpt_cd(value);
			return;
		}
		if ($gi_itm_cd.equalsIgnoreCase(name)) {
			gi_itm_cd(value);
			return;
		}
		if ($gi_itm_sub1.equalsIgnoreCase(name)) {
			gi_itm_sub1(value);
			return;
		}
		if ($gi_itm_sub2.equalsIgnoreCase(name)) {
			gi_itm_sub2(value);
			return;
		}
		if ($gi_itm_sub3.equalsIgnoreCase(name)) {
			gi_itm_sub3(value);
			return;
		}
		if ($gi_lot_no.equalsIgnoreCase(name)) {
			gi_lot_no(value);
			return;
		}
		if ($gi_sublot_no.equalsIgnoreCase(name)) {
			gi_sublot_no(value);
			return;
		}
		if ($gi_sno1.equalsIgnoreCase(name)) {
			gi_sno1(value);
			return;
		}
		if ($gi_sno2.equalsIgnoreCase(name)) {
			gi_sno2(value);
			return;
		}
		if ($gi_sno3.equalsIgnoreCase(name)) {
			gi_sno3(value);
			return;
		}
		if ($gi_sno4.equalsIgnoreCase(name)) {
			gi_sno4(value);
			return;
		}
		if ($gi_cost_io_typ.equalsIgnoreCase(name)) {
			gi_cost_io_typ(value);
			return;
		}
		if ($gi_ac_slip_typ.equalsIgnoreCase(name)) {
			gi_ac_slip_typ(value);
			return;
		}
		if ($gi_ac_rsn_cd.equalsIgnoreCase(name)) {
			gi_ac_rsn_cd(value);
			return;
		}
		if ($gi_bp_cd.equalsIgnoreCase(name)) {
			gi_bp_cd(value);
			return;
		}
		if ($gi_stk_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_bp_cd(value);
			return;
		}
		if ($gi_asst_typ.equalsIgnoreCase(name)) {
			gi_asst_typ(value);
			return;
		}
		if ($gi_trd_cur_cd.equalsIgnoreCase(name)) {
			gi_trd_cur_cd(value);
			return;
		}
		if ($gi_trd_grp.equalsIgnoreCase(name)) {
			gi_trd_grp(value);
			return;
		}
		if ($gi_rec_eval_typ.equalsIgnoreCase(name)) {
			gi_rec_eval_typ(value);
			return;
		}
		if ($gr_calc_ctg_cd.equalsIgnoreCase(name)) {
			gr_calc_ctg_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_mng_dpt_cd.equalsIgnoreCase(name)) {
			gr_mng_dpt_cd(value);
			return;
		}
		if ($gr_itm_cd.equalsIgnoreCase(name)) {
			gr_itm_cd(value);
			return;
		}
		if ($gr_itm_sub1.equalsIgnoreCase(name)) {
			gr_itm_sub1(value);
			return;
		}
		if ($gr_itm_sub2.equalsIgnoreCase(name)) {
			gr_itm_sub2(value);
			return;
		}
		if ($gr_itm_sub3.equalsIgnoreCase(name)) {
			gr_itm_sub3(value);
			return;
		}
		if ($gr_lot_no.equalsIgnoreCase(name)) {
			gr_lot_no(value);
			return;
		}
		if ($gr_sublot_no.equalsIgnoreCase(name)) {
			gr_sublot_no(value);
			return;
		}
		if ($gr_sno1.equalsIgnoreCase(name)) {
			gr_sno1(value);
			return;
		}
		if ($gr_sno2.equalsIgnoreCase(name)) {
			gr_sno2(value);
			return;
		}
		if ($gr_sno3.equalsIgnoreCase(name)) {
			gr_sno3(value);
			return;
		}
		if ($gr_sno4.equalsIgnoreCase(name)) {
			gr_sno4(value);
			return;
		}
		if ($gr_cost_io_typ.equalsIgnoreCase(name)) {
			gr_cost_io_typ(value);
			return;
		}
		if ($gr_ac_slip_typ.equalsIgnoreCase(name)) {
			gr_ac_slip_typ(value);
			return;
		}
		if ($gr_ac_rsn_cd.equalsIgnoreCase(name)) {
			gr_ac_rsn_cd(value);
			return;
		}
		if ($gr_bp_cd.equalsIgnoreCase(name)) {
			gr_bp_cd(value);
			return;
		}
		if ($gr_stk_bp_cd.equalsIgnoreCase(name)) {
			gr_stk_bp_cd(value);
			return;
		}
		if ($gr_asst_typ.equalsIgnoreCase(name)) {
			gr_asst_typ(value);
			return;
		}
		if ($gr_trd_cur_cd.equalsIgnoreCase(name)) {
			gr_trd_cur_cd(value);
			return;
		}
		if ($gr_trd_grp.equalsIgnoreCase(name)) {
			gr_trd_grp(value);
			return;
		}
		if ($gr_rec_eval_typ.equalsIgnoreCase(name)) {
			gr_rec_eval_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			gi_amt(value);
			return;
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			gi_trd_cur_amt(value);
			return;
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			gi_xrate(value);
			return;
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			gi_calc_seq(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			gr_amt(value);
			return;
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			gr_trd_cur_amt(value);
			return;
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			gr_xrate(value);
			return;
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			gr_calc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			gi_amt(value);
			return;
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			gi_trd_cur_amt(value);
			return;
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			gi_xrate(value);
			return;
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			gi_calc_seq(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			gr_amt(value);
			return;
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			gr_trd_cur_amt(value);
			return;
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			gr_xrate(value);
			return;
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			gr_calc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			gi_amt(value);
			return;
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			gi_trd_cur_amt(value);
			return;
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			gi_xrate(value);
			return;
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			gi_calc_seq(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			gr_amt(value);
			return;
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			gr_trd_cur_amt(value);
			return;
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			gr_xrate(value);
			return;
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			gr_calc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			gi_amt(value);
			return;
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			gi_trd_cur_amt(value);
			return;
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			gi_xrate(value);
			return;
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			gi_calc_seq(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			gr_amt(value);
			return;
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			gr_trd_cur_amt(value);
			return;
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			gr_xrate(value);
			return;
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			gr_calc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($gi_qty.equalsIgnoreCase(name)) {
			gi_qty(value);
			return;
		}
		if ($gi_amt.equalsIgnoreCase(name)) {
			gi_amt(value);
			return;
		}
		if ($gi_trd_cur_amt.equalsIgnoreCase(name)) {
			gi_trd_cur_amt(value);
			return;
		}
		if ($gi_xrate.equalsIgnoreCase(name)) {
			gi_xrate(value);
			return;
		}
		if ($gi_calc_seq.equalsIgnoreCase(name)) {
			gi_calc_seq(value);
			return;
		}
		if ($gr_qty.equalsIgnoreCase(name)) {
			gr_qty(value);
			return;
		}
		if ($gr_amt.equalsIgnoreCase(name)) {
			gr_amt(value);
			return;
		}
		if ($gr_trd_cur_amt.equalsIgnoreCase(name)) {
			gr_trd_cur_amt(value);
			return;
		}
		if ($gr_xrate.equalsIgnoreCase(name)) {
			gr_xrate(value);
			return;
		}
		if ($gr_calc_seq.equalsIgnoreCase(name)) {
			gr_calc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($gi_ym.equalsIgnoreCase(name)) {
			gi_ym(value);
			return;
		}
		if ($gi_ac_dt.equalsIgnoreCase(name)) {
			gi_ac_dt(value);
			return;
		}
		if ($gr_ym.equalsIgnoreCase(name)) {
			gr_ym(value);
			return;
		}
		if ($gr_ac_dt.equalsIgnoreCase(name)) {
			gr_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($gi_zero_effect_flg.equalsIgnoreCase(name)) {
			gi_zero_effect_flg(value);
			return;
		}
		if ($gr_zero_effect_flg.equalsIgnoreCase(name)) {
			gr_zero_effect_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
