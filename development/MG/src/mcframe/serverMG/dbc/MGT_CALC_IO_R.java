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
 * "計算対象入出庫情報 // (Calculation) Other GR/GI"DBコンテナRowクラスです。<p>
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
 *  	<td>calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算ＮＯ</td>
 *  	<td>Calculation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>act_io_id</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入出庫実績ＩＤ</td>
 *  	<td>GR/GI result ID</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>act_io_id_sub</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入出庫実績ＩＤ枝番</td>
 *  	<td>GR/GI result ID branch No.</td>
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
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>年月</td>
 *  	<td>Year month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mng_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>管理部門ＣＤ</td>
 *  	<td>Management dept. cd.</td>
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
 *  	<td>itm_ext</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目拡張</td>
 *  	<td>Item extension</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
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
 *  	<td>cost_io_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価入出庫区分</td>
 *  	<td>Cost GR/GI type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計伝票区分</td>
 *  	<td>Accounting slip type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由ＣＤ</td>
 *  	<td>Accounting reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>other_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>相手ワーキンググループＣＤ</td>
 *  	<td>Counterpart WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>other_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>相手部門ＣＤ</td>
 *  	<td>Counterpart dept. cd.</td>
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
 *  	<td>stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫先ＣＤ</td>
 *  	<td>Company holding inventory cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>asst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産区分</td>
 *  	<td>Asset type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量</td>
 *  	<td>Quantity</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額</td>
 *  	<td>Amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨金額</td>
 *  	<td>Currency amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_grp</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振替グループ</td>
 *  	<td>Transfer group</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_ratio</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振替比率</td>
 *  	<td>Transfer ratio</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_ac_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目ＣＤ</td>
 *  	<td>Allocation account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_amt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦振替ＦＬＧ</td>
 *  	<td>Transfer allocation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦ワーキンググループＣＤ</td>
 *  	<td>Allocation WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦パタンＣＤ</td>
 *  	<td>Allocation pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先部門ＣＤ</td>
 *  	<td>Allocation destination dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先場所ＣＤ</td>
 *  	<td>Allocation destination location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先工程ＣＤ</td>
 *  	<td>Allocation destination operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先取引先ＣＤ</td>
 *  	<td>Allocation destination BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先品群ＣＤ</td>
 *  	<td>Allocation destination item category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先品目ＣＤ</td>
 *  	<td>Allocation destination item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先枝番１</td>
 *  	<td>Allocation destination branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先枝番２</td>
 *  	<td>Allocation destination branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先枝番３</td>
 *  	<td>Allocation destination branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先ロットＮＯ</td>
 *  	<td>Allocation destination lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先サブロットＮＯ</td>
 *  	<td>Allocation destination sublot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先手配ＮＯ１</td>
 *  	<td>Allocation destination SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先手配ＮＯ２</td>
 *  	<td>Allocation destination SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先手配ＮＯ３</td>
 *  	<td>Allocation destination SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先手配ＮＯ４</td>
 *  	<td>Allocation destination SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先品目製造指図ＮＯ</td>
 *  	<td>Allocation destination item mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rec_eval_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>個別評価区分</td>
 *  	<td>Individual evaluation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>eval_loop_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>個別評価ループＦＬＧ</td>
 *  	<td>Individual evaluation loop flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>zero_effect_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ゼロ評価ＦＬＧ</td>
 *  	<td>Zero evaluation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算カテゴリＣＤ</td>
 *  	<td>Calculation category cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGT_CALC_IO_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MGT_CALC_IO";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	private static final MCPermColumnInfo _calc_no = createColumnInfo("calc_no");
	public final MCStringPermColumn calc_no = createStringColumn(_calc_no);
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * 入出庫実績ＩＤ. GR/GI result ID.<p>
	 *
	 */
	public static final String $act_io_id = "act_io_id";
	private static final MCPermColumnInfo _act_io_id = createColumnInfo("act_io_id");
	public final MCStringPermColumn act_io_id = createStringColumn(_act_io_id);
	
	/**
	 * 入出庫実績ＩＤ枝番. GR/GI result ID branch No..<p>
	 *
	 */
	public static final String $act_io_id_sub = "act_io_id_sub";
	private static final MCPermColumnInfo _act_io_id_sub = createColumnInfo("act_io_id_sub");
	public final MCStringPermColumn act_io_id_sub = createStringColumn(_act_io_id_sub);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 年月. Year month.<p>
	 *
	 */
	public static final String $ym = "ym";
	private static final MCPermColumnInfo _ym = createColumnInfo("ym");
	public final MCDatePermColumn ym = createDateColumn(_ym);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	private static final MCPermColumnInfo _mng_dpt_cd = createColumnInfo("mng_dpt_cd");
	public final MCStringPermColumn mng_dpt_cd = createStringColumn(_mng_dpt_cd);
	
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
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public static final String $itm_ext = "itm_ext";
	private static final MCPermColumnInfo _itm_ext = createColumnInfo("itm_ext");
	public final MCStringPermColumn itm_ext = createStringColumn(_itm_ext);
	
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
	 * 原価入出庫区分. Cost GR/GI type.<p>
	 *
	 */
	public static final String $cost_io_typ = "cost_io_typ";
	private static final MCPermColumnInfo _cost_io_typ = createColumnInfo("cost_io_typ");
	public final MCStringPermColumn cost_io_typ = createStringColumn(_cost_io_typ);
	
	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	private static final MCPermColumnInfo _ac_slip_typ = createColumnInfo("ac_slip_typ");
	public final MCStringPermColumn ac_slip_typ = createStringColumn(_ac_slip_typ);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
	/**
	 * 相手ワーキンググループＣＤ. Counterpart WG cd..<p>
	 *
	 */
	public static final String $other_wg_cd = "other_wg_cd";
	private static final MCPermColumnInfo _other_wg_cd = createColumnInfo("other_wg_cd");
	public final MCStringPermColumn other_wg_cd = createStringColumn(_other_wg_cd);
	
	/**
	 * 相手部門ＣＤ. Counterpart dept. cd..<p>
	 *
	 */
	public static final String $other_dpt_cd = "other_dpt_cd";
	private static final MCPermColumnInfo _other_dpt_cd = createColumnInfo("other_dpt_cd");
	public final MCStringPermColumn other_dpt_cd = createStringColumn(_other_dpt_cd);
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 在庫先ＣＤ. Company holding inventory cd..<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	private static final MCPermColumnInfo _stk_bp_cd = createColumnInfo("stk_bp_cd");
	public final MCStringPermColumn stk_bp_cd = createStringColumn(_stk_bp_cd);
	
	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	private static final MCPermColumnInfo _asst_typ = createColumnInfo("asst_typ");
	public final MCStringPermColumn asst_typ = createStringColumn(_asst_typ);
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public static final String $qty = "qty";
	private static final MCPermColumnInfo _qty = createColumnInfo("qty");
	public final MCNumberPermColumn qty = createNumberColumn(_qty);
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public static final String $amt = "amt";
	private static final MCPermColumnInfo _amt = createColumnInfo("amt");
	public final MCNumberPermColumn amt = createNumberColumn(_amt);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public static final String $cur_amt = "cur_amt";
	private static final MCPermColumnInfo _cur_amt = createColumnInfo("cur_amt");
	public final MCNumberPermColumn cur_amt = createNumberColumn(_cur_amt);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 振替グループ. Transfer group.<p>
	 *
	 */
	public static final String $trd_grp = "trd_grp";
	private static final MCPermColumnInfo _trd_grp = createColumnInfo("trd_grp");
	public final MCStringPermColumn trd_grp = createStringColumn(_trd_grp);
	
	/**
	 * 振替比率. Transfer ratio.<p>
	 *
	 */
	public static final String $trd_ratio = "trd_ratio";
	private static final MCPermColumnInfo _trd_ratio = createColumnInfo("trd_ratio");
	public final MCNumberPermColumn trd_ratio = createNumberColumn(_trd_ratio);
	
	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	private static final MCPermColumnInfo _alc_ac_cd = createColumnInfo("alc_ac_cd");
	public final MCStringPermColumn alc_ac_cd = createStringColumn(_alc_ac_cd);
	
	/**
	 * 配賦振替ＦＬＧ. Transfer allocation flg..<p>
	 *
	 */
	public static final String $alc_amt_flg = "alc_amt_flg";
	private static final MCPermColumnInfo _alc_amt_flg = createColumnInfo("alc_amt_flg");
	public final MCBooleanPermColumn alc_amt_flg = createBooleanColumn(_alc_amt_flg);
	
	/**
	 * 配賦ワーキンググループＣＤ. Allocation WG cd..<p>
	 *
	 */
	public static final String $alc_wg_cd = "alc_wg_cd";
	private static final MCPermColumnInfo _alc_wg_cd = createColumnInfo("alc_wg_cd");
	public final MCStringPermColumn alc_wg_cd = createStringColumn(_alc_wg_cd);
	
	/**
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public static final String $alc_ptn_cd = "alc_ptn_cd";
	private static final MCPermColumnInfo _alc_ptn_cd = createColumnInfo("alc_ptn_cd");
	public final MCStringPermColumn alc_ptn_cd = createStringColumn(_alc_ptn_cd);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	/**
	 * 配賦先部門ＣＤ. Allocation destination dept. cd..<p>
	 *
	 */
	public static final String $alc_dpt_cd = "alc_dpt_cd";
	private static final MCPermColumnInfo _alc_dpt_cd = createColumnInfo("alc_dpt_cd");
	public final MCStringPermColumn alc_dpt_cd = createStringColumn(_alc_dpt_cd);
	
	/**
	 * 配賦先場所ＣＤ. Allocation destination location cd..<p>
	 *
	 */
	public static final String $alc_loc_cd = "alc_loc_cd";
	private static final MCPermColumnInfo _alc_loc_cd = createColumnInfo("alc_loc_cd");
	public final MCStringPermColumn alc_loc_cd = createStringColumn(_alc_loc_cd);
	
	/**
	 * 配賦先工程ＣＤ. Allocation destination operation cd..<p>
	 *
	 */
	public static final String $alc_oper_cd = "alc_oper_cd";
	private static final MCPermColumnInfo _alc_oper_cd = createColumnInfo("alc_oper_cd");
	public final MCStringPermColumn alc_oper_cd = createStringColumn(_alc_oper_cd);
	
	/**
	 * 配賦先取引先ＣＤ. Allocation destination BP cd..<p>
	 *
	 */
	public static final String $alc_bp_cd = "alc_bp_cd";
	private static final MCPermColumnInfo _alc_bp_cd = createColumnInfo("alc_bp_cd");
	public final MCStringPermColumn alc_bp_cd = createStringColumn(_alc_bp_cd);
	
	/**
	 * 配賦先品群ＣＤ. Allocation destination item category cd..<p>
	 *
	 */
	public static final String $alc_ctg_cd = "alc_ctg_cd";
	private static final MCPermColumnInfo _alc_ctg_cd = createColumnInfo("alc_ctg_cd");
	public final MCStringPermColumn alc_ctg_cd = createStringColumn(_alc_ctg_cd);
	
	/**
	 * 配賦先品目ＣＤ. Allocation destination item cd..<p>
	 *
	 */
	public static final String $alc_itm_cd = "alc_itm_cd";
	private static final MCPermColumnInfo _alc_itm_cd = createColumnInfo("alc_itm_cd");
	public final MCStringPermColumn alc_itm_cd = createStringColumn(_alc_itm_cd);
	
	/**
	 * 配賦先枝番１. Allocation destination branch No. 1.<p>
	 *
	 */
	public static final String $alc_itm_sub1 = "alc_itm_sub1";
	private static final MCPermColumnInfo _alc_itm_sub1 = createColumnInfo("alc_itm_sub1");
	public final MCStringPermColumn alc_itm_sub1 = createStringColumn(_alc_itm_sub1);
	
	/**
	 * 配賦先枝番２. Allocation destination branch No. 2.<p>
	 *
	 */
	public static final String $alc_itm_sub2 = "alc_itm_sub2";
	private static final MCPermColumnInfo _alc_itm_sub2 = createColumnInfo("alc_itm_sub2");
	public final MCStringPermColumn alc_itm_sub2 = createStringColumn(_alc_itm_sub2);
	
	/**
	 * 配賦先枝番３. Allocation destination branch No. 3.<p>
	 *
	 */
	public static final String $alc_itm_sub3 = "alc_itm_sub3";
	private static final MCPermColumnInfo _alc_itm_sub3 = createColumnInfo("alc_itm_sub3");
	public final MCStringPermColumn alc_itm_sub3 = createStringColumn(_alc_itm_sub3);
	
	/**
	 * 配賦先ロットＮＯ. Allocation destination lot No..<p>
	 *
	 */
	public static final String $alc_lot_no = "alc_lot_no";
	private static final MCPermColumnInfo _alc_lot_no = createColumnInfo("alc_lot_no");
	public final MCStringPermColumn alc_lot_no = createStringColumn(_alc_lot_no);
	
	/**
	 * 配賦先サブロットＮＯ. Allocation destination sublot No..<p>
	 *
	 */
	public static final String $alc_sublot_no = "alc_sublot_no";
	private static final MCPermColumnInfo _alc_sublot_no = createColumnInfo("alc_sublot_no");
	public final MCStringPermColumn alc_sublot_no = createStringColumn(_alc_sublot_no);
	
	/**
	 * 配賦先手配ＮＯ１. Allocation destination SEIBAN No. 1.<p>
	 *
	 */
	public static final String $alc_sno1 = "alc_sno1";
	private static final MCPermColumnInfo _alc_sno1 = createColumnInfo("alc_sno1");
	public final MCStringPermColumn alc_sno1 = createStringColumn(_alc_sno1);
	
	/**
	 * 配賦先手配ＮＯ２. Allocation destination SEIBAN No. 2.<p>
	 *
	 */
	public static final String $alc_sno2 = "alc_sno2";
	private static final MCPermColumnInfo _alc_sno2 = createColumnInfo("alc_sno2");
	public final MCStringPermColumn alc_sno2 = createStringColumn(_alc_sno2);
	
	/**
	 * 配賦先手配ＮＯ３. Allocation destination SEIBAN No. 3.<p>
	 *
	 */
	public static final String $alc_sno3 = "alc_sno3";
	private static final MCPermColumnInfo _alc_sno3 = createColumnInfo("alc_sno3");
	public final MCStringPermColumn alc_sno3 = createStringColumn(_alc_sno3);
	
	/**
	 * 配賦先手配ＮＯ４. Allocation destination SEIBAN No. 4.<p>
	 *
	 */
	public static final String $alc_sno4 = "alc_sno4";
	private static final MCPermColumnInfo _alc_sno4 = createColumnInfo("alc_sno4");
	public final MCStringPermColumn alc_sno4 = createStringColumn(_alc_sno4);
	
	/**
	 * 配賦先品目製造指図ＮＯ. Allocation destination item mfg. order No..<p>
	 *
	 */
	public static final String $alc_itm_mfg_inst_no = "alc_itm_mfg_inst_no";
	private static final MCPermColumnInfo _alc_itm_mfg_inst_no = createColumnInfo("alc_itm_mfg_inst_no");
	public final MCStringPermColumn alc_itm_mfg_inst_no = createStringColumn(_alc_itm_mfg_inst_no);
	
	/**
	 * 個別評価区分. Individual evaluation type.<p>
	 *
	 */
	public static final String $rec_eval_typ = "rec_eval_typ";
	private static final MCPermColumnInfo _rec_eval_typ = createColumnInfo("rec_eval_typ");
	public final MCStringPermColumn rec_eval_typ = createStringColumn(_rec_eval_typ);
	
	/**
	 * 個別評価ループＦＬＧ. Individual evaluation loop flg..<p>
	 *
	 */
	public static final String $eval_loop_flg = "eval_loop_flg";
	private static final MCPermColumnInfo _eval_loop_flg = createColumnInfo("eval_loop_flg");
	public final MCBooleanPermColumn eval_loop_flg = createBooleanColumn(_eval_loop_flg);
	
	/**
	 * ゼロ評価ＦＬＧ. Zero evaluation flg..<p>
	 *
	 */
	public static final String $zero_effect_flg = "zero_effect_flg";
	private static final MCPermColumnInfo _zero_effect_flg = createColumnInfo("zero_effect_flg");
	public final MCBooleanPermColumn zero_effect_flg = createBooleanColumn(_zero_effect_flg);
	
	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	private static final MCPermColumnInfo _calc_ctg_cd = createColumnInfo("calc_ctg_cd");
	public final MCStringPermColumn calc_ctg_cd = createStringColumn(_calc_ctg_cd);
	
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta act_io_id_META = createCommonMeta($act_io_id, mcframe.commonMG.meta.MG_META.ACT_IO_ID);
	public static final MCMeta act_io_id_sub_META = createCommonMeta($act_io_id_sub, mcframe.commonMG.meta.MG_META.ACT_IO_ID_SUB);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_ext_META = createCommonMeta($itm_ext, mcframe.commonMG.meta.MG_META.ITM_EXT);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta cost_io_typ_META = createCommonMeta($cost_io_typ, mcframe.commonMA.meta.MA_META.COST_IO_TYP);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta other_wg_cd_META = createCommonMeta($other_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta other_dpt_cd_META = createCommonMeta($other_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_amt_META = createCommonMeta($cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_grp_META = createCommonMeta($trd_grp, mcframe.commonMA.meta.MA_META.TRD_GRP);
	public static final MCMeta trd_ratio_META = createCommonMeta($trd_ratio, mcframe.commonMG.meta.MG_META.TRD_RATIO);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_amt_flg_META = createCommonMeta($alc_amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_wg_cd_META = createCommonMeta($alc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta alc_ptn_cd_META = createCommonMeta($alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta alc_dpt_cd_META = createCommonMeta($alc_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta alc_loc_cd_META = createCommonMeta($alc_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta alc_oper_cd_META = createCommonMeta($alc_oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta alc_bp_cd_META = createCommonMeta($alc_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta alc_ctg_cd_META = createCommonMeta($alc_ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta alc_itm_cd_META = createCommonMeta($alc_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta alc_itm_sub1_META = createCommonMeta($alc_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta alc_itm_sub2_META = createCommonMeta($alc_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta alc_itm_sub3_META = createCommonMeta($alc_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta alc_lot_no_META = createCommonMeta($alc_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta alc_sublot_no_META = createCommonMeta($alc_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta alc_sno1_META = createCommonMeta($alc_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta alc_sno2_META = createCommonMeta($alc_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta alc_sno3_META = createCommonMeta($alc_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta alc_sno4_META = createCommonMeta($alc_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta alc_itm_mfg_inst_no_META = createCommonMeta($alc_itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta rec_eval_typ_META = createCommonMeta($rec_eval_typ, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP);
	public static final MCMeta eval_loop_flg_META = createCommonMeta($eval_loop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta zero_effect_flg_META = createCommonMeta($zero_effect_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGT_CALC_IO_R> constMetas = new ConstMetaList<MGT_CALC_IO_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_no_META,
			calc_grp_cd_META,
			act_io_id_META,
			act_io_id_sub_META,
			wg_cd_META,
			ym_META,
			ac_dt_META,
			mng_dpt_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_ext_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			cost_io_typ_META,
			ac_slip_typ_META,
			ac_rsn_cd_META,
			other_wg_cd_META,
			other_dpt_cd_META,
			bp_cd_META,
			stk_bp_cd_META,
			asst_typ_META,
			qty_META,
			amt_META,
			cur_cd_META,
			cur_amt_META,
			xrate_META,
			trd_grp_META,
			trd_ratio_META,
			alc_ac_cd_META,
			alc_amt_flg_META,
			alc_wg_cd_META,
			alc_ptn_cd_META,
			expns_cd_META,
			alc_dpt_cd_META,
			alc_loc_cd_META,
			alc_oper_cd_META,
			alc_bp_cd_META,
			alc_ctg_cd_META,
			alc_itm_cd_META,
			alc_itm_sub1_META,
			alc_itm_sub2_META,
			alc_itm_sub3_META,
			alc_lot_no_META,
			alc_sublot_no_META,
			alc_sno1_META,
			alc_sno2_META,
			alc_sno3_META,
			alc_sno4_META,
			alc_itm_mfg_inst_no_META,
			rec_eval_typ_META,
			eval_loop_flg_META,
			zero_effect_flg_META,
			calc_ctg_cd_META
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
	protected MGT_CALC_IO_R(ConstMetaList<? extends MGT_CALC_IO_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGT_CALC_IO_R(ConstMetaList<? extends MGT_CALC_IO_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$calc_no,
				"calc_no",
				calc_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$calc_grp_cd,
				"calc_grp_cd",
				calc_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$act_io_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$act_io_id,
				"act_io_id",
				act_io_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$act_io_id_sub,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$act_io_id_sub,
				"act_io_id_sub",
				act_io_id_sub,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$wg_cd,
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
			MGT_CALC_IO_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_CALC_IO_R.$ym,
				"ym",
				ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_CALC_IO_R.$ac_dt,
				"ac_dt",
				ac_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$mng_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$mng_dpt_cd,
				"mng_dpt_cd",
				mng_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$itm_cd,
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
			MGT_CALC_IO_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$itm_sub1,
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
			MGT_CALC_IO_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$itm_sub2,
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
			MGT_CALC_IO_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$itm_sub3,
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
			MGT_CALC_IO_R.$itm_ext,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$itm_ext,
				"itm_ext",
				itm_ext,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$lot_no,
				"lot_no",
				lot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$sublot_no,
				"sublot_no",
				sublot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$sno1,
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
			MGT_CALC_IO_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$sno2,
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
			MGT_CALC_IO_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$sno3,
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
			MGT_CALC_IO_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$sno4,
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
			MGT_CALC_IO_R.$cost_io_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$cost_io_typ,
				"cost_io_typ",
				cost_io_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$ac_slip_typ,
				"ac_slip_typ",
				ac_slip_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$ac_rsn_cd,
				"ac_rsn_cd",
				ac_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$other_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$other_wg_cd,
				"other_wg_cd",
				other_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$other_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$other_dpt_cd,
				"other_dpt_cd",
				other_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$bp_cd,
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
			MGT_CALC_IO_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$stk_bp_cd,
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
			MGT_CALC_IO_R.$asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$asst_typ,
				"asst_typ",
				asst_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_CALC_IO_R.$qty,
				"qty",
				qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_CALC_IO_R.$amt,
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
			MGT_CALC_IO_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$cur_cd,
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
			MGT_CALC_IO_R.$cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_CALC_IO_R.$cur_amt,
				"cur_amt",
				cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_CALC_IO_R.$xrate,
				"xrate",
				xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$trd_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$trd_grp,
				"trd_grp",
				trd_grp,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$trd_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_CALC_IO_R.$trd_ratio,
				"trd_ratio",
				trd_ratio,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_ac_cd,
				"alc_ac_cd",
				alc_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_amt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGT_CALC_IO_R.$alc_amt_flg,
				"alc_amt_flg",
				alc_amt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_wg_cd,
				"alc_wg_cd",
				alc_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_ptn_cd,
				"alc_ptn_cd",
				alc_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$expns_cd,
				"expns_cd",
				expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_dpt_cd,
				"alc_dpt_cd",
				alc_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_loc_cd,
				"alc_loc_cd",
				alc_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_oper_cd,
				"alc_oper_cd",
				alc_oper_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_bp_cd,
				"alc_bp_cd",
				alc_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_ctg_cd,
				"alc_ctg_cd",
				alc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_itm_cd,
				"alc_itm_cd",
				alc_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_itm_sub1,
				"alc_itm_sub1",
				alc_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_itm_sub2,
				"alc_itm_sub2",
				alc_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_itm_sub3,
				"alc_itm_sub3",
				alc_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_lot_no,
				"alc_lot_no",
				alc_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_sublot_no,
				"alc_sublot_no",
				alc_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_sno1,
				"alc_sno1",
				alc_sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_sno2,
				"alc_sno2",
				alc_sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_sno3,
				"alc_sno3",
				alc_sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_sno4,
				"alc_sno4",
				alc_sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$alc_itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$alc_itm_mfg_inst_no,
				"alc_itm_mfg_inst_no",
				alc_itm_mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$rec_eval_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$rec_eval_typ,
				"rec_eval_typ",
				rec_eval_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$eval_loop_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGT_CALC_IO_R.$eval_loop_flg,
				"eval_loop_flg",
				eval_loop_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$zero_effect_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGT_CALC_IO_R.$zero_effect_flg,
				"zero_effect_flg",
				zero_effect_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_IO_R.$calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_IO_R.$calc_ctg_cd,
				"calc_ctg_cd",
				calc_ctg_cd,
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
	public static MGT_CALC_IO_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGT_CALC_IO_R create(String alias) {
		MGT_CALC_IO_R row = new MGT_CALC_IO_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGT_CALC_IO_R createByName(T proto) {
		MGT_CALC_IO_R row = MGT_CALC_IO_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_CALC_IO_R clone() {
		return (MGT_CALC_IO_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_CALC_IO_R createInstance() {
		return (MGT_CALC_IO_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_CALC_IO_R getValues(String... names) {
		return (MGT_CALC_IO_R) super.getValues(names);
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
	 public MGW_CALC_IO_KEY_R getPkWorkDbc(String alias) {
	 	return MGW_CALC_IO_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MGW_CALC_IO_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MGW_CALC_IO_KEY_R.TABLE_NAME);
	 }

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 0, $calc_no);
	}

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 0, $calc_no, value);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}

	/**
	 * 入出庫実績ＩＤ. GR/GI result ID.<p>
	 *
	 */
	public String act_io_id() {
		return getConstString(offset + 2, $act_io_id);
	}

	/**
	 * 入出庫実績ＩＤ. GR/GI result ID.<p>
	 *
	 */
	public void act_io_id(String value) {
		setConstString(offset + 2, $act_io_id, value);
	}

	/**
	 * 入出庫実績ＩＤ枝番. GR/GI result ID branch No..<p>
	 *
	 */
	public String act_io_id_sub() {
		return getConstString(offset + 3, $act_io_id_sub);
	}

	/**
	 * 入出庫実績ＩＤ枝番. GR/GI result ID branch No..<p>
	 *
	 */
	public void act_io_id_sub(String value) {
		setConstString(offset + 3, $act_io_id_sub, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 5, $ym);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 5, $ym, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 6, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 6, $ac_dt, value);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 7, $mng_dpt_cd);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 7, $mng_dpt_cd, value);
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
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public String itm_ext() {
		return getConstString(offset + 12, $itm_ext);
	}

	/**
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public void itm_ext(String value) {
		setConstString(offset + 12, $itm_ext, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 13, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 13, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 14, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 14, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 15, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 15, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 16, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 16, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 17, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 17, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 18, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 18, $sno4, value);
	}

	/**
	 * 原価入出庫区分. Cost GR/GI type.<p>
	 *
	 */
	public String cost_io_typ() {
		return getConstString(offset + 19, $cost_io_typ);
	}

	/**
	 * 原価入出庫区分. Cost GR/GI type.<p>
	 *
	 */
	public void cost_io_typ(String value) {
		setConstString(offset + 19, $cost_io_typ, value);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 20, $ac_slip_typ);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 20, $ac_slip_typ, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 21, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 21, $ac_rsn_cd, value);
	}

	/**
	 * 相手ワーキンググループＣＤ. Counterpart WG cd..<p>
	 *
	 */
	public String other_wg_cd() {
		return getConstString(offset + 22, $other_wg_cd);
	}

	/**
	 * 相手ワーキンググループＣＤ. Counterpart WG cd..<p>
	 *
	 */
	public void other_wg_cd(String value) {
		setConstString(offset + 22, $other_wg_cd, value);
	}

	/**
	 * 相手部門ＣＤ. Counterpart dept. cd..<p>
	 *
	 */
	public String other_dpt_cd() {
		return getConstString(offset + 23, $other_dpt_cd);
	}

	/**
	 * 相手部門ＣＤ. Counterpart dept. cd..<p>
	 *
	 */
	public void other_dpt_cd(String value) {
		setConstString(offset + 23, $other_dpt_cd, value);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 24, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 24, $bp_cd, value);
	}

	/**
	 * 在庫先ＣＤ. Company holding inventory cd..<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 25, $stk_bp_cd);
	}

	/**
	 * 在庫先ＣＤ. Company holding inventory cd..<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 25, $stk_bp_cd, value);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 26, $asst_typ);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 26, $asst_typ, value);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 27, $qty);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 27, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 27, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 27, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 27, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 27, $qty, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 28, $amt);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 28, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 28, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 28, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 28, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 28, $amt, value);
	}
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 29, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 29, $cur_cd, value);
	}

	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public MCNumber cur_amt() {
		return getConstNumber(offset + 30, $cur_amt);
	}

	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(MCNumber value) {
		setConstNumber(offset + 30, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(int value) {
		setConstNumber(offset + 30, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(long value) {
		setConstNumber(offset + 30, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(float value) {
		setConstNumber(offset + 30, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(double value) {
		setConstNumber(offset + 30, $cur_amt, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 31, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 31, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 31, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 31, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 31, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 31, $xrate, value);
	}
	
	/**
	 * 振替グループ. Transfer group.<p>
	 *
	 */
	public String trd_grp() {
		return getConstString(offset + 32, $trd_grp);
	}

	/**
	 * 振替グループ. Transfer group.<p>
	 *
	 */
	public void trd_grp(String value) {
		setConstString(offset + 32, $trd_grp, value);
	}

	/**
	 * 振替比率. Transfer ratio.<p>
	 *
	 */
	public MCNumber trd_ratio() {
		return getConstNumber(offset + 33, $trd_ratio);
	}

	/**
	 * 振替比率. Transfer ratio.<p>
	 *
	 */
	public void trd_ratio(MCNumber value) {
		setConstNumber(offset + 33, $trd_ratio, value);
	}
	
	/**
	 * 振替比率. Transfer ratio.<p>
	 *
	 */
	public void trd_ratio(int value) {
		setConstNumber(offset + 33, $trd_ratio, value);
	}
	
	/**
	 * 振替比率. Transfer ratio.<p>
	 *
	 */
	public void trd_ratio(long value) {
		setConstNumber(offset + 33, $trd_ratio, value);
	}
	
	/**
	 * 振替比率. Transfer ratio.<p>
	 *
	 */
	public void trd_ratio(float value) {
		setConstNumber(offset + 33, $trd_ratio, value);
	}
	
	/**
	 * 振替比率. Transfer ratio.<p>
	 *
	 */
	public void trd_ratio(double value) {
		setConstNumber(offset + 33, $trd_ratio, value);
	}
	
	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 34, $alc_ac_cd);
	}

	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 34, $alc_ac_cd, value);
	}

	/**
	 * 配賦振替ＦＬＧ. Transfer allocation flg..<p>
	 *
	 */
	public boolean alc_amt_flg() {
		return getConstBoolean(offset + 35, $alc_amt_flg);
	}

	/**
	 * 配賦振替ＦＬＧ. Transfer allocation flg..<p>
	 *
	 */
	public void alc_amt_flg(boolean value) {
		setConstBoolean(offset + 35, $alc_amt_flg, value);
	}

	/**
	 * 配賦ワーキンググループＣＤ. Allocation WG cd..<p>
	 *
	 */
	public String alc_wg_cd() {
		return getConstString(offset + 36, $alc_wg_cd);
	}

	/**
	 * 配賦ワーキンググループＣＤ. Allocation WG cd..<p>
	 *
	 */
	public void alc_wg_cd(String value) {
		setConstString(offset + 36, $alc_wg_cd, value);
	}

	/**
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public String alc_ptn_cd() {
		return getConstString(offset + 37, $alc_ptn_cd);
	}

	/**
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public void alc_ptn_cd(String value) {
		setConstString(offset + 37, $alc_ptn_cd, value);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 38, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 38, $expns_cd, value);
	}

	/**
	 * 配賦先部門ＣＤ. Allocation destination dept. cd..<p>
	 *
	 */
	public String alc_dpt_cd() {
		return getConstString(offset + 39, $alc_dpt_cd);
	}

	/**
	 * 配賦先部門ＣＤ. Allocation destination dept. cd..<p>
	 *
	 */
	public void alc_dpt_cd(String value) {
		setConstString(offset + 39, $alc_dpt_cd, value);
	}

	/**
	 * 配賦先場所ＣＤ. Allocation destination location cd..<p>
	 *
	 */
	public String alc_loc_cd() {
		return getConstString(offset + 40, $alc_loc_cd);
	}

	/**
	 * 配賦先場所ＣＤ. Allocation destination location cd..<p>
	 *
	 */
	public void alc_loc_cd(String value) {
		setConstString(offset + 40, $alc_loc_cd, value);
	}

	/**
	 * 配賦先工程ＣＤ. Allocation destination operation cd..<p>
	 *
	 */
	public String alc_oper_cd() {
		return getConstString(offset + 41, $alc_oper_cd);
	}

	/**
	 * 配賦先工程ＣＤ. Allocation destination operation cd..<p>
	 *
	 */
	public void alc_oper_cd(String value) {
		setConstString(offset + 41, $alc_oper_cd, value);
	}

	/**
	 * 配賦先取引先ＣＤ. Allocation destination BP cd..<p>
	 *
	 */
	public String alc_bp_cd() {
		return getConstString(offset + 42, $alc_bp_cd);
	}

	/**
	 * 配賦先取引先ＣＤ. Allocation destination BP cd..<p>
	 *
	 */
	public void alc_bp_cd(String value) {
		setConstString(offset + 42, $alc_bp_cd, value);
	}

	/**
	 * 配賦先品群ＣＤ. Allocation destination item category cd..<p>
	 *
	 */
	public String alc_ctg_cd() {
		return getConstString(offset + 43, $alc_ctg_cd);
	}

	/**
	 * 配賦先品群ＣＤ. Allocation destination item category cd..<p>
	 *
	 */
	public void alc_ctg_cd(String value) {
		setConstString(offset + 43, $alc_ctg_cd, value);
	}

	/**
	 * 配賦先品目ＣＤ. Allocation destination item cd..<p>
	 *
	 */
	public String alc_itm_cd() {
		return getConstString(offset + 44, $alc_itm_cd);
	}

	/**
	 * 配賦先品目ＣＤ. Allocation destination item cd..<p>
	 *
	 */
	public void alc_itm_cd(String value) {
		setConstString(offset + 44, $alc_itm_cd, value);
	}

	/**
	 * 配賦先枝番１. Allocation destination branch No. 1.<p>
	 *
	 */
	public String alc_itm_sub1() {
		return getConstString(offset + 45, $alc_itm_sub1);
	}

	/**
	 * 配賦先枝番１. Allocation destination branch No. 1.<p>
	 *
	 */
	public void alc_itm_sub1(String value) {
		setConstString(offset + 45, $alc_itm_sub1, value);
	}

	/**
	 * 配賦先枝番２. Allocation destination branch No. 2.<p>
	 *
	 */
	public String alc_itm_sub2() {
		return getConstString(offset + 46, $alc_itm_sub2);
	}

	/**
	 * 配賦先枝番２. Allocation destination branch No. 2.<p>
	 *
	 */
	public void alc_itm_sub2(String value) {
		setConstString(offset + 46, $alc_itm_sub2, value);
	}

	/**
	 * 配賦先枝番３. Allocation destination branch No. 3.<p>
	 *
	 */
	public String alc_itm_sub3() {
		return getConstString(offset + 47, $alc_itm_sub3);
	}

	/**
	 * 配賦先枝番３. Allocation destination branch No. 3.<p>
	 *
	 */
	public void alc_itm_sub3(String value) {
		setConstString(offset + 47, $alc_itm_sub3, value);
	}

	/**
	 * 配賦先ロットＮＯ. Allocation destination lot No..<p>
	 *
	 */
	public String alc_lot_no() {
		return getConstString(offset + 48, $alc_lot_no);
	}

	/**
	 * 配賦先ロットＮＯ. Allocation destination lot No..<p>
	 *
	 */
	public void alc_lot_no(String value) {
		setConstString(offset + 48, $alc_lot_no, value);
	}

	/**
	 * 配賦先サブロットＮＯ. Allocation destination sublot No..<p>
	 *
	 */
	public String alc_sublot_no() {
		return getConstString(offset + 49, $alc_sublot_no);
	}

	/**
	 * 配賦先サブロットＮＯ. Allocation destination sublot No..<p>
	 *
	 */
	public void alc_sublot_no(String value) {
		setConstString(offset + 49, $alc_sublot_no, value);
	}

	/**
	 * 配賦先手配ＮＯ１. Allocation destination SEIBAN No. 1.<p>
	 *
	 */
	public String alc_sno1() {
		return getConstString(offset + 50, $alc_sno1);
	}

	/**
	 * 配賦先手配ＮＯ１. Allocation destination SEIBAN No. 1.<p>
	 *
	 */
	public void alc_sno1(String value) {
		setConstString(offset + 50, $alc_sno1, value);
	}

	/**
	 * 配賦先手配ＮＯ２. Allocation destination SEIBAN No. 2.<p>
	 *
	 */
	public String alc_sno2() {
		return getConstString(offset + 51, $alc_sno2);
	}

	/**
	 * 配賦先手配ＮＯ２. Allocation destination SEIBAN No. 2.<p>
	 *
	 */
	public void alc_sno2(String value) {
		setConstString(offset + 51, $alc_sno2, value);
	}

	/**
	 * 配賦先手配ＮＯ３. Allocation destination SEIBAN No. 3.<p>
	 *
	 */
	public String alc_sno3() {
		return getConstString(offset + 52, $alc_sno3);
	}

	/**
	 * 配賦先手配ＮＯ３. Allocation destination SEIBAN No. 3.<p>
	 *
	 */
	public void alc_sno3(String value) {
		setConstString(offset + 52, $alc_sno3, value);
	}

	/**
	 * 配賦先手配ＮＯ４. Allocation destination SEIBAN No. 4.<p>
	 *
	 */
	public String alc_sno4() {
		return getConstString(offset + 53, $alc_sno4);
	}

	/**
	 * 配賦先手配ＮＯ４. Allocation destination SEIBAN No. 4.<p>
	 *
	 */
	public void alc_sno4(String value) {
		setConstString(offset + 53, $alc_sno4, value);
	}

	/**
	 * 配賦先品目製造指図ＮＯ. Allocation destination item mfg. order No..<p>
	 *
	 */
	public String alc_itm_mfg_inst_no() {
		return getConstString(offset + 54, $alc_itm_mfg_inst_no);
	}

	/**
	 * 配賦先品目製造指図ＮＯ. Allocation destination item mfg. order No..<p>
	 *
	 */
	public void alc_itm_mfg_inst_no(String value) {
		setConstString(offset + 54, $alc_itm_mfg_inst_no, value);
	}

	/**
	 * 個別評価区分. Individual evaluation type.<p>
	 *
	 */
	public String rec_eval_typ() {
		return getConstString(offset + 55, $rec_eval_typ);
	}

	/**
	 * 個別評価区分. Individual evaluation type.<p>
	 *
	 */
	public void rec_eval_typ(String value) {
		setConstString(offset + 55, $rec_eval_typ, value);
	}

	/**
	 * 個別評価ループＦＬＧ. Individual evaluation loop flg..<p>
	 *
	 */
	public boolean eval_loop_flg() {
		return getConstBoolean(offset + 56, $eval_loop_flg);
	}

	/**
	 * 個別評価ループＦＬＧ. Individual evaluation loop flg..<p>
	 *
	 */
	public void eval_loop_flg(boolean value) {
		setConstBoolean(offset + 56, $eval_loop_flg, value);
	}

	/**
	 * ゼロ評価ＦＬＧ. Zero evaluation flg..<p>
	 *
	 */
	public boolean zero_effect_flg() {
		return getConstBoolean(offset + 57, $zero_effect_flg);
	}

	/**
	 * ゼロ評価ＦＬＧ. Zero evaluation flg..<p>
	 *
	 */
	public void zero_effect_flg(boolean value) {
		setConstBoolean(offset + 57, $zero_effect_flg, value);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 58, $calc_ctg_cd);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 58, $calc_ctg_cd, value);
	}

	public String getString(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($act_io_id.equalsIgnoreCase(name)) {
			return act_io_id();
		}
		if ($act_io_id_sub.equalsIgnoreCase(name)) {
			return act_io_id_sub();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			return itm_ext();
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
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			return cost_io_typ();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			return other_wg_cd();
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			return other_dpt_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			return trd_grp();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			return alc_wg_cd();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_loc_cd.equalsIgnoreCase(name)) {
			return alc_loc_cd();
		}
		if ($alc_oper_cd.equalsIgnoreCase(name)) {
			return alc_oper_cd();
		}
		if ($alc_bp_cd.equalsIgnoreCase(name)) {
			return alc_bp_cd();
		}
		if ($alc_ctg_cd.equalsIgnoreCase(name)) {
			return alc_ctg_cd();
		}
		if ($alc_itm_cd.equalsIgnoreCase(name)) {
			return alc_itm_cd();
		}
		if ($alc_itm_sub1.equalsIgnoreCase(name)) {
			return alc_itm_sub1();
		}
		if ($alc_itm_sub2.equalsIgnoreCase(name)) {
			return alc_itm_sub2();
		}
		if ($alc_itm_sub3.equalsIgnoreCase(name)) {
			return alc_itm_sub3();
		}
		if ($alc_lot_no.equalsIgnoreCase(name)) {
			return alc_lot_no();
		}
		if ($alc_sublot_no.equalsIgnoreCase(name)) {
			return alc_sublot_no();
		}
		if ($alc_sno1.equalsIgnoreCase(name)) {
			return alc_sno1();
		}
		if ($alc_sno2.equalsIgnoreCase(name)) {
			return alc_sno2();
		}
		if ($alc_sno3.equalsIgnoreCase(name)) {
			return alc_sno3();
		}
		if ($alc_sno4.equalsIgnoreCase(name)) {
			return alc_sno4();
		}
		if ($alc_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return alc_itm_mfg_inst_no();
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			return rec_eval_typ();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			return cur_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			return trd_ratio();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			return alc_amt_flg();
		}
		if ($eval_loop_flg.equalsIgnoreCase(name)) {
			return eval_loop_flg();
		}
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			return zero_effect_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($act_io_id.equalsIgnoreCase(name)) {
			return act_io_id();
		}
		if ($act_io_id_sub.equalsIgnoreCase(name)) {
			return act_io_id_sub();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			return itm_ext();
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
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			return cost_io_typ();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			return other_wg_cd();
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			return other_dpt_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			return trd_grp();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			return alc_wg_cd();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_loc_cd.equalsIgnoreCase(name)) {
			return alc_loc_cd();
		}
		if ($alc_oper_cd.equalsIgnoreCase(name)) {
			return alc_oper_cd();
		}
		if ($alc_bp_cd.equalsIgnoreCase(name)) {
			return alc_bp_cd();
		}
		if ($alc_ctg_cd.equalsIgnoreCase(name)) {
			return alc_ctg_cd();
		}
		if ($alc_itm_cd.equalsIgnoreCase(name)) {
			return alc_itm_cd();
		}
		if ($alc_itm_sub1.equalsIgnoreCase(name)) {
			return alc_itm_sub1();
		}
		if ($alc_itm_sub2.equalsIgnoreCase(name)) {
			return alc_itm_sub2();
		}
		if ($alc_itm_sub3.equalsIgnoreCase(name)) {
			return alc_itm_sub3();
		}
		if ($alc_lot_no.equalsIgnoreCase(name)) {
			return alc_lot_no();
		}
		if ($alc_sublot_no.equalsIgnoreCase(name)) {
			return alc_sublot_no();
		}
		if ($alc_sno1.equalsIgnoreCase(name)) {
			return alc_sno1();
		}
		if ($alc_sno2.equalsIgnoreCase(name)) {
			return alc_sno2();
		}
		if ($alc_sno3.equalsIgnoreCase(name)) {
			return alc_sno3();
		}
		if ($alc_sno4.equalsIgnoreCase(name)) {
			return alc_sno4();
		}
		if ($alc_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return alc_itm_mfg_inst_no();
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			return rec_eval_typ();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			return cur_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			return trd_ratio();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			return alc_amt_flg();
		}
		if ($eval_loop_flg.equalsIgnoreCase(name)) {
			return eval_loop_flg();
		}
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			return zero_effect_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($act_io_id.equalsIgnoreCase(name)) {
			act_io_id(value);
			return;
		}
		if ($act_io_id_sub.equalsIgnoreCase(name)) {
			act_io_id_sub(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			itm_ext(value);
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
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			cost_io_typ(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			other_wg_cd(value);
			return;
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			other_dpt_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			trd_grp(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			alc_wg_cd(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_loc_cd.equalsIgnoreCase(name)) {
			alc_loc_cd(value);
			return;
		}
		if ($alc_oper_cd.equalsIgnoreCase(name)) {
			alc_oper_cd(value);
			return;
		}
		if ($alc_bp_cd.equalsIgnoreCase(name)) {
			alc_bp_cd(value);
			return;
		}
		if ($alc_ctg_cd.equalsIgnoreCase(name)) {
			alc_ctg_cd(value);
			return;
		}
		if ($alc_itm_cd.equalsIgnoreCase(name)) {
			alc_itm_cd(value);
			return;
		}
		if ($alc_itm_sub1.equalsIgnoreCase(name)) {
			alc_itm_sub1(value);
			return;
		}
		if ($alc_itm_sub2.equalsIgnoreCase(name)) {
			alc_itm_sub2(value);
			return;
		}
		if ($alc_itm_sub3.equalsIgnoreCase(name)) {
			alc_itm_sub3(value);
			return;
		}
		if ($alc_lot_no.equalsIgnoreCase(name)) {
			alc_lot_no(value);
			return;
		}
		if ($alc_sublot_no.equalsIgnoreCase(name)) {
			alc_sublot_no(value);
			return;
		}
		if ($alc_sno1.equalsIgnoreCase(name)) {
			alc_sno1(value);
			return;
		}
		if ($alc_sno2.equalsIgnoreCase(name)) {
			alc_sno2(value);
			return;
		}
		if ($alc_sno3.equalsIgnoreCase(name)) {
			alc_sno3(value);
			return;
		}
		if ($alc_sno4.equalsIgnoreCase(name)) {
			alc_sno4(value);
			return;
		}
		if ($alc_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			alc_itm_mfg_inst_no(value);
			return;
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			rec_eval_typ(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			alc_amt_flg(value);
			return;
		}
		if ($eval_loop_flg.equalsIgnoreCase(name)) {
			eval_loop_flg(value);
			return;
		}
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			zero_effect_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($act_io_id.equalsIgnoreCase(name)) {
			act_io_id(value);
			return;
		}
		if ($act_io_id_sub.equalsIgnoreCase(name)) {
			act_io_id_sub(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			itm_ext(value);
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
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			cost_io_typ(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			other_wg_cd(value);
			return;
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			other_dpt_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			trd_grp(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			alc_wg_cd(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_loc_cd.equalsIgnoreCase(name)) {
			alc_loc_cd(value);
			return;
		}
		if ($alc_oper_cd.equalsIgnoreCase(name)) {
			alc_oper_cd(value);
			return;
		}
		if ($alc_bp_cd.equalsIgnoreCase(name)) {
			alc_bp_cd(value);
			return;
		}
		if ($alc_ctg_cd.equalsIgnoreCase(name)) {
			alc_ctg_cd(value);
			return;
		}
		if ($alc_itm_cd.equalsIgnoreCase(name)) {
			alc_itm_cd(value);
			return;
		}
		if ($alc_itm_sub1.equalsIgnoreCase(name)) {
			alc_itm_sub1(value);
			return;
		}
		if ($alc_itm_sub2.equalsIgnoreCase(name)) {
			alc_itm_sub2(value);
			return;
		}
		if ($alc_itm_sub3.equalsIgnoreCase(name)) {
			alc_itm_sub3(value);
			return;
		}
		if ($alc_lot_no.equalsIgnoreCase(name)) {
			alc_lot_no(value);
			return;
		}
		if ($alc_sublot_no.equalsIgnoreCase(name)) {
			alc_sublot_no(value);
			return;
		}
		if ($alc_sno1.equalsIgnoreCase(name)) {
			alc_sno1(value);
			return;
		}
		if ($alc_sno2.equalsIgnoreCase(name)) {
			alc_sno2(value);
			return;
		}
		if ($alc_sno3.equalsIgnoreCase(name)) {
			alc_sno3(value);
			return;
		}
		if ($alc_sno4.equalsIgnoreCase(name)) {
			alc_sno4(value);
			return;
		}
		if ($alc_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			alc_itm_mfg_inst_no(value);
			return;
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			rec_eval_typ(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			alc_amt_flg(value);
			return;
		}
		if ($eval_loop_flg.equalsIgnoreCase(name)) {
			eval_loop_flg(value);
			return;
		}
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			zero_effect_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
