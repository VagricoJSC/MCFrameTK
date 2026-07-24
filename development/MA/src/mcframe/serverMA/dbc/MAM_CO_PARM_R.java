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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
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
 * "原価会社パラメータマスタ // Cost company parameter master"DBコンテナRowクラスです。<p>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準端数処理区分</td>
 *  	<td>Rounding type (Standard)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準小数部有効桁数</td>
 *  	<td>Standard number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額端数処理区分</td>
 *  	<td>Rounding type (Amount)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額小数部有効桁数</td>
 *  	<td>Amount number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ave_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単価端数処理区分</td>
 *  	<td>Rounding type (Unit price)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ave_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単価小数部有効桁数</td>
 *  	<td>Unit price number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adj_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>端数調整区分</td>
 *  	<td>Fraction adjustment type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrgn_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>調整費目ＣＤ</td>
 *  	<td>Adjustment cost element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買費目ＣＤ</td>
 *  	<td>Purchase cost element item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>out_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外注費目ＣＤ</td>
 *  	<td>Subcontract cost element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入費目ＣＤ</td>
 *  	<td>Input cost element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ss_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>自給費目ＣＤ</td>
 *  	<td>Self supply cost element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有償差額費目ＣＤ</td>
 *  	<td>Cost element cd. for gain or loss of chargeable item</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_alc_max_lvl</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>一次配賦最大配賦階層</td>
 *  	<td>Departmental alloc. max. allocation hierarchy</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_alc_max_rec</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>一次配賦最大レコード数</td>
 *  	<td>Departmental alloc. max. number of records</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_use_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>差異使用区分</td>
 *  	<td>Variance use type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>デフォルト計算カテゴリＣＤ</td>
 *  	<td>Default calculation category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定管理部門ＣＤ</td>
 *  	<td>Constant management dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_use_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ生販使用区分</td>
 *  	<td>Lot No. use type for production/sales</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_use_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ生販使用区分</td>
 *  	<td>Sublot No. use type for production/sales</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1_use_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１生販使用区分</td>
 *  	<td>SEIBAN No. 1 production/sales use type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2_use_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２生販使用区分</td>
 *  	<td>SEIBAN No. 2 production/sales use type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3_use_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３生販使用区分</td>
 *  	<td>SEIBAN No. 3 production/sales use type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4_use_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４生販使用区分</td>
 *  	<td>SEIBAN No. 4 production/sales use type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_ratio_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>振替比率設定時に標準単価を使用する</td>
 *  	<td>Use standard unit cost at transfer ratio setting</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stop_slip_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取り消した伝票を取り込む</td>
 *  	<td>Take in canceled slip</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>non_prod_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>生産データを取り込まない</td>
 *  	<td>Do not import production data</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_sum_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程ＣＤを工程実績ＮＯとして取り込む</td>
 *  	<td>Import operation cd. as operation result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>non_sls_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売データを取り込まない</td>
 *  	<td>Do not import sales data</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>asst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売資産を生産資産として取り込む</td>
 *  	<td>Import sales asset as production asset</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_bp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷先の在庫を考慮する</td>
 *  	<td>Include receiving point inventory</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>non_transit_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>未着品仕入データを取り込まない</td>
 *  	<td>Do not import purchase data of items in transit</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_non_mov_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループ滞留使用ＦＬＧ</td>
 *  	<td>WG with non-moving flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_non_mov_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ滞留使用ＦＬＧ</td>
 *  	<td>Lot No. with non-moving flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_non_mov_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ滞留使用ＦＬＧ</td>
 *  	<td>Sublot No. with non-moving flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1_non_mov_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１滞留使用ＦＬＧ</td>
 *  	<td>SEIBAN No. 1 with non-moving flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2_non_mov_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２滞留使用ＦＬＧ</td>
 *  	<td>SEIBAN No. 2 with non-moving flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3_non_mov_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３滞留使用ＦＬＧ</td>
 *  	<td>SEIBAN No. 3 with non-moving flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4_non_mov_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４滞留使用ＦＬＧ</td>
 *  	<td>SEIBAN No. 4 with non-moving flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tmp_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振替用部門ＣＤ</td>
 *  	<td>Transfer dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_trd_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績振替計算カテゴリＣＤ</td>
 *  	<td>Result transfer calculation category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chk_mst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マスタの存在チェックを行う</td>
 *  	<td>Check existence of master</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stktk_sum_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>棚卸を集約しない</td>
 *  	<td>Do not consolidate the inventory count</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oth_ccn_sum_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>他勘定を集約しない</td>
 *  	<td>Do not consolidate other accounting data</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt_disp_digit</td>
 *  	<td>N</td>
 *  	<td>1,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額小数部表示桁</td>
 *  	<td>Display digits (Amount decimal places)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_disp_digit</td>
 *  	<td>N</td>
 *  	<td>1,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単価小数部表示桁</td>
 *  	<td>Display digits (Unit price decimal places)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_disp_digit</td>
 *  	<td>N</td>
 *  	<td>1,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準小数部表示桁</td>
 *  	<td>Display digits (Standard decimal places)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rate_disp_digit</td>
 *  	<td>N</td>
 *  	<td>1,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>比率小数部表示桁</td>
 *  	<td>Display digits (Ratio decimal places)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>excel_pln_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計画データをＥＸＣＥＬで入出力する</td>
 *  	<td>Input/output planning data in Excel</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>excel_act_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>実績データをＥＸＣＥＬで入出力する</td>
 *  	<td>Input/output result data in Excel</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>excel_alc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦データをＥＸＣＥＬで入出力する</td>
 *  	<td>Input/output allocation data in Excel</td>
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
 *  	<td>mrgn_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS1.EXPNS_NM</td>
 *  	<td>調整費目名</td>
 *  	<td>Adjustment cost element name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS2.EXPNS_NM</td>
 *  	<td>購買費目名</td>
 *  	<td>Purchase cost element name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>out_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS3.EXPNS_NM</td>
 *  	<td>外注費目名</td>
 *  	<td>Subcontract cost element name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS4.EXPNS_NM</td>
 *  	<td>投入費目名</td>
 *  	<td>Input cost element name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ss_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS5.EXPNS_NM</td>
 *  	<td>自給費目名</td>
 *  	<td>Self supply cost element name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS6.EXPNS_NM</td>
 *  	<td>有償差額費目名</td>
 *  	<td>Gain or loss of chargeable supply cost element name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_CO_PARM_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_CO_PARM";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 標準端数処理区分. Rounding type (Standard).<p>
	 *
	 */
	public static final String $std_rnd_typ = "std_rnd_typ";
	private static final MCPermColumnInfo _std_rnd_typ = createColumnInfo("std_rnd_typ");
	public final MCStringPermColumn std_rnd_typ = createStringColumn(_std_rnd_typ);
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public static final String $std_dec_place = "std_dec_place";
	private static final MCPermColumnInfo _std_dec_place = createColumnInfo("std_dec_place");
	public final MCNumberPermColumn std_dec_place = createNumberColumn(_std_dec_place);
	
	/**
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public static final String $amt_rnd_typ = "amt_rnd_typ";
	private static final MCPermColumnInfo _amt_rnd_typ = createColumnInfo("amt_rnd_typ");
	public final MCStringPermColumn amt_rnd_typ = createStringColumn(_amt_rnd_typ);
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	private static final MCPermColumnInfo _amt_dec_place = createColumnInfo("amt_dec_place");
	public final MCNumberPermColumn amt_dec_place = createNumberColumn(_amt_dec_place);
	
	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public static final String $ave_rnd_typ = "ave_rnd_typ";
	private static final MCPermColumnInfo _ave_rnd_typ = createColumnInfo("ave_rnd_typ");
	public final MCStringPermColumn ave_rnd_typ = createStringColumn(_ave_rnd_typ);
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public static final String $ave_dec_place = "ave_dec_place";
	private static final MCPermColumnInfo _ave_dec_place = createColumnInfo("ave_dec_place");
	public final MCNumberPermColumn ave_dec_place = createNumberColumn(_ave_dec_place);
	
	/**
	 * 端数調整区分. Fraction adjustment type.<p>
	 *
	 */
	public static final String $adj_typ = "adj_typ";
	private static final MCPermColumnInfo _adj_typ = createColumnInfo("adj_typ");
	public final MCStringPermColumn adj_typ = createStringColumn(_adj_typ);
	
	/**
	 * 調整費目ＣＤ. Adjustment cost element cd..<p>
	 *
	 */
	public static final String $mrgn_expns_cd = "mrgn_expns_cd";
	private static final MCPermColumnInfo _mrgn_expns_cd = createColumnInfo("mrgn_expns_cd");
	public final MCStringPermColumn mrgn_expns_cd = createStringColumn(_mrgn_expns_cd);
	
	/**
	 * 購買費目ＣＤ. Purchase cost element item cd..<p>
	 *
	 */
	public static final String $purc_expns_cd = "purc_expns_cd";
	private static final MCPermColumnInfo _purc_expns_cd = createColumnInfo("purc_expns_cd");
	public final MCStringPermColumn purc_expns_cd = createStringColumn(_purc_expns_cd);
	
	/**
	 * 外注費目ＣＤ. Subcontract cost element cd..<p>
	 *
	 */
	public static final String $out_expns_cd = "out_expns_cd";
	private static final MCPermColumnInfo _out_expns_cd = createColumnInfo("out_expns_cd");
	public final MCStringPermColumn out_expns_cd = createStringColumn(_out_expns_cd);
	
	/**
	 * 投入費目ＣＤ. Input cost element cd..<p>
	 *
	 */
	public static final String $inpt_expns_cd = "inpt_expns_cd";
	private static final MCPermColumnInfo _inpt_expns_cd = createColumnInfo("inpt_expns_cd");
	public final MCStringPermColumn inpt_expns_cd = createStringColumn(_inpt_expns_cd);
	
	/**
	 * 自給費目ＣＤ. Self supply cost element cd..<p>
	 *
	 */
	public static final String $ss_expns_cd = "ss_expns_cd";
	private static final MCPermColumnInfo _ss_expns_cd = createColumnInfo("ss_expns_cd");
	public final MCStringPermColumn ss_expns_cd = createStringColumn(_ss_expns_cd);
	
	/**
	 * 有償差額費目ＣＤ. Cost element cd. for gain or loss of chargeable item.<p>
	 *
	 */
	public static final String $prov_expns_cd = "prov_expns_cd";
	private static final MCPermColumnInfo _prov_expns_cd = createColumnInfo("prov_expns_cd");
	public final MCStringPermColumn prov_expns_cd = createStringColumn(_prov_expns_cd);
	
	/**
	 * 一次配賦最大配賦階層. Departmental alloc. max. allocation hierarchy.<p>
	 *
	 */
	public static final String $pre_alc_max_lvl = "pre_alc_max_lvl";
	private static final MCPermColumnInfo _pre_alc_max_lvl = createColumnInfo("pre_alc_max_lvl");
	public final MCNumberPermColumn pre_alc_max_lvl = createNumberColumn(_pre_alc_max_lvl);
	
	/**
	 * 一次配賦最大レコード数. Departmental alloc. max. number of records.<p>
	 *
	 */
	public static final String $pre_alc_max_rec = "pre_alc_max_rec";
	private static final MCPermColumnInfo _pre_alc_max_rec = createColumnInfo("pre_alc_max_rec");
	public final MCNumberPermColumn pre_alc_max_rec = createNumberColumn(_pre_alc_max_rec);
	
	/**
	 * 差異使用区分. Variance use type.<p>
	 *
	 */
	public static final String $diff_use_typ = "diff_use_typ";
	private static final MCPermColumnInfo _diff_use_typ = createColumnInfo("diff_use_typ");
	public final MCStringPermColumn diff_use_typ = createStringColumn(_diff_use_typ);
	
	/**
	 * デフォルト計算カテゴリＣＤ. Default calculation category cd..<p>
	 *
	 */
	public static final String $def_calc_ctg_cd = "def_calc_ctg_cd";
	private static final MCPermColumnInfo _def_calc_ctg_cd = createColumnInfo("def_calc_ctg_cd");
	public final MCStringPermColumn def_calc_ctg_cd = createStringColumn(_def_calc_ctg_cd);
	
	/**
	 * 固定管理部門ＣＤ. Constant management dept. cd..<p>
	 *
	 */
	public static final String $fix_dpt_cd = "fix_dpt_cd";
	private static final MCPermColumnInfo _fix_dpt_cd = createColumnInfo("fix_dpt_cd");
	public final MCStringPermColumn fix_dpt_cd = createStringColumn(_fix_dpt_cd);
	
	/**
	 * ロットＮＯ生販使用区分. Lot No. use type for production/sales.<p>
	 *
	 */
	public static final String $lot_use_typ = "lot_use_typ";
	private static final MCPermColumnInfo _lot_use_typ = createColumnInfo("lot_use_typ");
	public final MCStringPermColumn lot_use_typ = createStringColumn(_lot_use_typ);
	
	/**
	 * サブロットＮＯ生販使用区分. Sublot No. use type for production/sales.<p>
	 *
	 */
	public static final String $sublot_use_typ = "sublot_use_typ";
	private static final MCPermColumnInfo _sublot_use_typ = createColumnInfo("sublot_use_typ");
	public final MCStringPermColumn sublot_use_typ = createStringColumn(_sublot_use_typ);
	
	/**
	 * 手配ＮＯ１生販使用区分. SEIBAN No. 1 production/sales use type.<p>
	 *
	 */
	public static final String $sno1_use_typ = "sno1_use_typ";
	private static final MCPermColumnInfo _sno1_use_typ = createColumnInfo("sno1_use_typ");
	public final MCStringPermColumn sno1_use_typ = createStringColumn(_sno1_use_typ);
	
	/**
	 * 手配ＮＯ２生販使用区分. SEIBAN No. 2 production/sales use type.<p>
	 *
	 */
	public static final String $sno2_use_typ = "sno2_use_typ";
	private static final MCPermColumnInfo _sno2_use_typ = createColumnInfo("sno2_use_typ");
	public final MCStringPermColumn sno2_use_typ = createStringColumn(_sno2_use_typ);
	
	/**
	 * 手配ＮＯ３生販使用区分. SEIBAN No. 3 production/sales use type.<p>
	 *
	 */
	public static final String $sno3_use_typ = "sno3_use_typ";
	private static final MCPermColumnInfo _sno3_use_typ = createColumnInfo("sno3_use_typ");
	public final MCStringPermColumn sno3_use_typ = createStringColumn(_sno3_use_typ);
	
	/**
	 * 手配ＮＯ４生販使用区分. SEIBAN No. 4 production/sales use type.<p>
	 *
	 */
	public static final String $sno4_use_typ = "sno4_use_typ";
	private static final MCPermColumnInfo _sno4_use_typ = createColumnInfo("sno4_use_typ");
	public final MCStringPermColumn sno4_use_typ = createStringColumn(_sno4_use_typ);
	
	/**
	 * 振替比率設定時に標準単価を使用する. Use standard unit cost at transfer ratio setting.<p>
	 *
	 */
	public static final String $trd_ratio_flg = "trd_ratio_flg";
	private static final MCPermColumnInfo _trd_ratio_flg = createColumnInfo("trd_ratio_flg");
	public final MCBooleanPermColumn trd_ratio_flg = createBooleanColumn(_trd_ratio_flg);
	
	/**
	 * 取り消した伝票を取り込む. Take in canceled slip.<p>
	 *
	 */
	public static final String $stop_slip_flg = "stop_slip_flg";
	private static final MCPermColumnInfo _stop_slip_flg = createColumnInfo("stop_slip_flg");
	public final MCBooleanPermColumn stop_slip_flg = createBooleanColumn(_stop_slip_flg);
	
	/**
	 * 生産データを取り込まない. Do not import production data.<p>
	 *
	 */
	public static final String $non_prod_flg = "non_prod_flg";
	private static final MCPermColumnInfo _non_prod_flg = createColumnInfo("non_prod_flg");
	public final MCBooleanPermColumn non_prod_flg = createBooleanColumn(_non_prod_flg);
	
	/**
	 * 工程ＣＤを工程実績ＮＯとして取り込む. Import operation cd. as operation result No..<p>
	 *
	 */
	public static final String $oper_sum_flg = "oper_sum_flg";
	private static final MCPermColumnInfo _oper_sum_flg = createColumnInfo("oper_sum_flg");
	public final MCBooleanPermColumn oper_sum_flg = createBooleanColumn(_oper_sum_flg);
	
	/**
	 * 販売データを取り込まない. Do not import sales data.<p>
	 *
	 */
	public static final String $non_sls_flg = "non_sls_flg";
	private static final MCPermColumnInfo _non_sls_flg = createColumnInfo("non_sls_flg");
	public final MCBooleanPermColumn non_sls_flg = createBooleanColumn(_non_sls_flg);
	
	/**
	 * 販売資産を生産資産として取り込む. Import sales asset as production asset.<p>
	 *
	 */
	public static final String $asst_flg = "asst_flg";
	private static final MCPermColumnInfo _asst_flg = createColumnInfo("asst_flg");
	public final MCBooleanPermColumn asst_flg = createBooleanColumn(_asst_flg);
	
	/**
	 * 出荷先の在庫を考慮する. Include receiving point inventory.<p>
	 *
	 */
	public static final String $stk_bp_flg = "stk_bp_flg";
	private static final MCPermColumnInfo _stk_bp_flg = createColumnInfo("stk_bp_flg");
	public final MCBooleanPermColumn stk_bp_flg = createBooleanColumn(_stk_bp_flg);
	
	/**
	 * 未着品仕入データを取り込まない. Do not import purchase data of items in transit.<p>
	 *
	 */
	public static final String $non_transit_flg = "non_transit_flg";
	private static final MCPermColumnInfo _non_transit_flg = createColumnInfo("non_transit_flg");
	public final MCBooleanPermColumn non_transit_flg = createBooleanColumn(_non_transit_flg);
	
	/**
	 * ワーキンググループ滞留使用ＦＬＧ. WG with non-moving flg..<p>
	 *
	 */
	public static final String $wg_non_mov_flg = "wg_non_mov_flg";
	private static final MCPermColumnInfo _wg_non_mov_flg = createColumnInfo("wg_non_mov_flg");
	public final MCBooleanPermColumn wg_non_mov_flg = createBooleanColumn(_wg_non_mov_flg);
	
	/**
	 * ロットＮＯ滞留使用ＦＬＧ. Lot No. with non-moving flg..<p>
	 *
	 */
	public static final String $lot_non_mov_flg = "lot_non_mov_flg";
	private static final MCPermColumnInfo _lot_non_mov_flg = createColumnInfo("lot_non_mov_flg");
	public final MCBooleanPermColumn lot_non_mov_flg = createBooleanColumn(_lot_non_mov_flg);
	
	/**
	 * サブロットＮＯ滞留使用ＦＬＧ. Sublot No. with non-moving flg..<p>
	 *
	 */
	public static final String $sublot_non_mov_flg = "sublot_non_mov_flg";
	private static final MCPermColumnInfo _sublot_non_mov_flg = createColumnInfo("sublot_non_mov_flg");
	public final MCBooleanPermColumn sublot_non_mov_flg = createBooleanColumn(_sublot_non_mov_flg);
	
	/**
	 * 手配ＮＯ１滞留使用ＦＬＧ. SEIBAN No. 1 with non-moving flg..<p>
	 *
	 */
	public static final String $sno1_non_mov_flg = "sno1_non_mov_flg";
	private static final MCPermColumnInfo _sno1_non_mov_flg = createColumnInfo("sno1_non_mov_flg");
	public final MCBooleanPermColumn sno1_non_mov_flg = createBooleanColumn(_sno1_non_mov_flg);
	
	/**
	 * 手配ＮＯ２滞留使用ＦＬＧ. SEIBAN No. 2 with non-moving flg..<p>
	 *
	 */
	public static final String $sno2_non_mov_flg = "sno2_non_mov_flg";
	private static final MCPermColumnInfo _sno2_non_mov_flg = createColumnInfo("sno2_non_mov_flg");
	public final MCBooleanPermColumn sno2_non_mov_flg = createBooleanColumn(_sno2_non_mov_flg);
	
	/**
	 * 手配ＮＯ３滞留使用ＦＬＧ. SEIBAN No. 3 with non-moving flg..<p>
	 *
	 */
	public static final String $sno3_non_mov_flg = "sno3_non_mov_flg";
	private static final MCPermColumnInfo _sno3_non_mov_flg = createColumnInfo("sno3_non_mov_flg");
	public final MCBooleanPermColumn sno3_non_mov_flg = createBooleanColumn(_sno3_non_mov_flg);
	
	/**
	 * 手配ＮＯ４滞留使用ＦＬＧ. SEIBAN No. 4 with non-moving flg..<p>
	 *
	 */
	public static final String $sno4_non_mov_flg = "sno4_non_mov_flg";
	private static final MCPermColumnInfo _sno4_non_mov_flg = createColumnInfo("sno4_non_mov_flg");
	public final MCBooleanPermColumn sno4_non_mov_flg = createBooleanColumn(_sno4_non_mov_flg);
	
	/**
	 * 振替用部門ＣＤ. Transfer dept. cd..<p>
	 *
	 */
	public static final String $tmp_dpt_cd = "tmp_dpt_cd";
	private static final MCPermColumnInfo _tmp_dpt_cd = createColumnInfo("tmp_dpt_cd");
	public final MCStringPermColumn tmp_dpt_cd = createStringColumn(_tmp_dpt_cd);
	
	/**
	 * 実績振替計算カテゴリＣＤ. Result transfer calculation category cd..<p>
	 *
	 */
	public static final String $act_trd_calc_ctg_cd = "act_trd_calc_ctg_cd";
	private static final MCPermColumnInfo _act_trd_calc_ctg_cd = createColumnInfo("act_trd_calc_ctg_cd");
	public final MCStringPermColumn act_trd_calc_ctg_cd = createStringColumn(_act_trd_calc_ctg_cd);
	
	/**
	 * マスタの存在チェックを行う. Check existence of master.<p>
	 *
	 */
	public static final String $chk_mst_flg = "chk_mst_flg";
	private static final MCPermColumnInfo _chk_mst_flg = createColumnInfo("chk_mst_flg");
	public final MCBooleanPermColumn chk_mst_flg = createBooleanColumn(_chk_mst_flg);
	
	/**
	 * 棚卸を集約しない. Do not consolidate the inventory count.<p>
	 *
	 */
	public static final String $stktk_sum_flg = "stktk_sum_flg";
	private static final MCPermColumnInfo _stktk_sum_flg = createColumnInfo("stktk_sum_flg");
	public final MCBooleanPermColumn stktk_sum_flg = createBooleanColumn(_stktk_sum_flg);
	
	/**
	 * 他勘定を集約しない. Do not consolidate other accounting data.<p>
	 *
	 */
	public static final String $oth_ccn_sum_flg = "oth_ccn_sum_flg";
	private static final MCPermColumnInfo _oth_ccn_sum_flg = createColumnInfo("oth_ccn_sum_flg");
	public final MCBooleanPermColumn oth_ccn_sum_flg = createBooleanColumn(_oth_ccn_sum_flg);
	
	/**
	 * 金額小数部表示桁. Display digits (Amount decimal places).<p>
	 *
	 */
	public static final String $amt_disp_digit = "amt_disp_digit";
	private static final MCPermColumnInfo _amt_disp_digit = createColumnInfo("amt_disp_digit");
	public final MCNumberPermColumn amt_disp_digit = createNumberColumn(_amt_disp_digit);
	
	/**
	 * 単価小数部表示桁. Display digits (Unit price decimal places).<p>
	 *
	 */
	public static final String $unit_disp_digit = "unit_disp_digit";
	private static final MCPermColumnInfo _unit_disp_digit = createColumnInfo("unit_disp_digit");
	public final MCNumberPermColumn unit_disp_digit = createNumberColumn(_unit_disp_digit);
	
	/**
	 * 標準小数部表示桁. Display digits (Standard decimal places).<p>
	 *
	 */
	public static final String $std_disp_digit = "std_disp_digit";
	private static final MCPermColumnInfo _std_disp_digit = createColumnInfo("std_disp_digit");
	public final MCNumberPermColumn std_disp_digit = createNumberColumn(_std_disp_digit);
	
	/**
	 * 比率小数部表示桁. Display digits (Ratio decimal places).<p>
	 *
	 */
	public static final String $rate_disp_digit = "rate_disp_digit";
	private static final MCPermColumnInfo _rate_disp_digit = createColumnInfo("rate_disp_digit");
	public final MCNumberPermColumn rate_disp_digit = createNumberColumn(_rate_disp_digit);
	
	/**
	 * 計画データをＥＸＣＥＬで入出力する. Input/output planning data in Excel.<p>
	 *
	 */
	public static final String $excel_pln_flg = "excel_pln_flg";
	private static final MCPermColumnInfo _excel_pln_flg = createColumnInfo("excel_pln_flg");
	public final MCBooleanPermColumn excel_pln_flg = createBooleanColumn(_excel_pln_flg);
	
	/**
	 * 実績データをＥＸＣＥＬで入出力する. Input/output result data in Excel.<p>
	 *
	 */
	public static final String $excel_act_flg = "excel_act_flg";
	private static final MCPermColumnInfo _excel_act_flg = createColumnInfo("excel_act_flg");
	public final MCBooleanPermColumn excel_act_flg = createBooleanColumn(_excel_act_flg);
	
	/**
	 * 配賦データをＥＸＣＥＬで入出力する. Input/output allocation data in Excel.<p>
	 *
	 */
	public static final String $excel_alc_flg = "excel_alc_flg";
	private static final MCPermColumnInfo _excel_alc_flg = createColumnInfo("excel_alc_flg");
	public final MCBooleanPermColumn excel_alc_flg = createBooleanColumn(_excel_alc_flg);
	
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
	 * 調整費目名. Adjustment cost element name.<p>
	 *
	 */
	public static final String $mrgn_expns_nm = "mrgn_expns_nm";
	
	/**
	 * 購買費目名. Purchase cost element name.<p>
	 *
	 */
	public static final String $purc_expns_nm = "purc_expns_nm";
	
	/**
	 * 外注費目名. Subcontract cost element name.<p>
	 *
	 */
	public static final String $out_expns_nm = "out_expns_nm";
	
	/**
	 * 投入費目名. Input cost element name.<p>
	 *
	 */
	public static final String $inpt_expns_nm = "inpt_expns_nm";
	
	/**
	 * 自給費目名. Self supply cost element name.<p>
	 *
	 */
	public static final String $ss_expns_nm = "ss_expns_nm";
	
	/**
	 * 有償差額費目名. Gain or loss of chargeable supply cost element name.<p>
	 *
	 */
	public static final String $prov_expns_nm = "prov_expns_nm";
	
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta std_rnd_typ_META = createCommonMeta($std_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_dec_place_META = createCommonMeta($std_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_rnd_typ_META = createCommonMeta($amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ave_rnd_typ_META = createCommonMeta($ave_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ave_dec_place_META = createCommonMeta($ave_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta adj_typ_META = createCommonMeta($adj_typ, mcframe.commonMA.meta.MA_META.ADJ_TYP);
	public static final MCMeta mrgn_expns_cd_META = createCommonMeta($mrgn_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta purc_expns_cd_META = createCommonMeta($purc_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta out_expns_cd_META = createCommonMeta($out_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta inpt_expns_cd_META = createCommonMeta($inpt_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta ss_expns_cd_META = createCommonMeta($ss_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta prov_expns_cd_META = createCommonMeta($prov_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta pre_alc_max_lvl_META = createCommonMeta($pre_alc_max_lvl, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_LVL);
	public static final MCMeta pre_alc_max_rec_META = createCommonMeta($pre_alc_max_rec, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_REC);
	public static final MCMeta diff_use_typ_META = createCommonMeta($diff_use_typ, mcframe.commonMA.meta.MA_META.DIFF_USE_TYP);
	public static final MCMeta def_calc_ctg_cd_META = createCommonMeta($def_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta fix_dpt_cd_META = createCommonMeta($fix_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta lot_use_typ_META = createCommonMeta($lot_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta sublot_use_typ_META = createCommonMeta($sublot_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta sno1_use_typ_META = createCommonMeta($sno1_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta sno2_use_typ_META = createCommonMeta($sno2_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta sno3_use_typ_META = createCommonMeta($sno3_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta sno4_use_typ_META = createCommonMeta($sno4_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta trd_ratio_flg_META = createCommonMeta($trd_ratio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stop_slip_flg_META = createCommonMeta($stop_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_prod_flg_META = createCommonMeta($non_prod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_sum_flg_META = createCommonMeta($oper_sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_sls_flg_META = createCommonMeta($non_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asst_flg_META = createCommonMeta($asst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_bp_flg_META = createCommonMeta($stk_bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_transit_flg_META = createCommonMeta($non_transit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_non_mov_flg_META = createCommonMeta($wg_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_non_mov_flg_META = createCommonMeta($lot_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_non_mov_flg_META = createCommonMeta($sublot_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_non_mov_flg_META = createCommonMeta($sno1_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_non_mov_flg_META = createCommonMeta($sno2_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_non_mov_flg_META = createCommonMeta($sno3_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_non_mov_flg_META = createCommonMeta($sno4_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tmp_dpt_cd_META = createCommonMeta($tmp_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta act_trd_calc_ctg_cd_META = createCommonMeta($act_trd_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta chk_mst_flg_META = createCommonMeta($chk_mst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_sum_flg_META = createCommonMeta($stktk_sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oth_ccn_sum_flg_META = createCommonMeta($oth_ccn_sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_disp_digit_META = createCommonMeta($amt_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta unit_disp_digit_META = createCommonMeta($unit_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta std_disp_digit_META = createCommonMeta($std_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta rate_disp_digit_META = createCommonMeta($rate_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta excel_pln_flg_META = createCommonMeta($excel_pln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excel_act_flg_META = createCommonMeta($excel_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excel_alc_flg_META = createCommonMeta($excel_alc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
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
	public static final MCMeta mrgn_expns_nm_META = createCommonMeta($mrgn_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta purc_expns_nm_META = createCommonMeta($purc_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta out_expns_nm_META = createCommonMeta($out_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta inpt_expns_nm_META = createCommonMeta($inpt_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta ss_expns_nm_META = createCommonMeta($ss_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta prov_expns_nm_META = createCommonMeta($prov_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $CO1 = "CO1";
	public static final String $EXPNS1 = "EXPNS1";
	public static final String $EXPNS2 = "EXPNS2";
	public static final String $EXPNS3 = "EXPNS3";
	public static final String $EXPNS4 = "EXPNS4";
	public static final String $EXPNS5 = "EXPNS5";
	public static final String $EXPNS6 = "EXPNS6";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CO",
				$CO1,
				new String[][]{
						{"co_cd", "co_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CO_R.create("CO1");
				},
				(alias) -> {
					MAM_CO_PARM_R own = MAM_CO_PARM_R.create(alias);
					mcframe.serverMA.dbc.MAM_CO_R ref = mcframe.serverMA.dbc.MAM_CO_R.create("CO1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.co_cd.eq(ref.co_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS1,
				new String[][]{
						{"mrgn_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS1");
				},
				(alias) -> {
					MAM_CO_PARM_R own = MAM_CO_PARM_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.mrgn_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS2,
				new String[][]{
						{"purc_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS2");
				},
				(alias) -> {
					MAM_CO_PARM_R own = MAM_CO_PARM_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.purc_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS3,
				new String[][]{
						{"out_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS3");
				},
				(alias) -> {
					MAM_CO_PARM_R own = MAM_CO_PARM_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.out_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS4,
				new String[][]{
						{"inpt_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS4");
				},
				(alias) -> {
					MAM_CO_PARM_R own = MAM_CO_PARM_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS4");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.inpt_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS5,
				new String[][]{
						{"ss_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS5");
				},
				(alias) -> {
					MAM_CO_PARM_R own = MAM_CO_PARM_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS5");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ss_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS6,
				new String[][]{
						{"prov_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS6");
				},
				(alias) -> {
					MAM_CO_PARM_R own = MAM_CO_PARM_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS6");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.prov_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_CO_PARM_R> constMetas = new ConstMetaList<MAM_CO_PARM_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			std_rnd_typ_META,
			std_dec_place_META,
			amt_rnd_typ_META,
			amt_dec_place_META,
			ave_rnd_typ_META,
			ave_dec_place_META,
			adj_typ_META,
			mrgn_expns_cd_META,
			purc_expns_cd_META,
			out_expns_cd_META,
			inpt_expns_cd_META,
			ss_expns_cd_META,
			prov_expns_cd_META,
			pre_alc_max_lvl_META,
			pre_alc_max_rec_META,
			diff_use_typ_META,
			def_calc_ctg_cd_META,
			fix_dpt_cd_META,
			lot_use_typ_META,
			sublot_use_typ_META,
			sno1_use_typ_META,
			sno2_use_typ_META,
			sno3_use_typ_META,
			sno4_use_typ_META,
			trd_ratio_flg_META,
			stop_slip_flg_META,
			non_prod_flg_META,
			oper_sum_flg_META,
			non_sls_flg_META,
			asst_flg_META,
			stk_bp_flg_META,
			non_transit_flg_META,
			wg_non_mov_flg_META,
			lot_non_mov_flg_META,
			sublot_non_mov_flg_META,
			sno1_non_mov_flg_META,
			sno2_non_mov_flg_META,
			sno3_non_mov_flg_META,
			sno4_non_mov_flg_META,
			tmp_dpt_cd_META,
			act_trd_calc_ctg_cd_META,
			chk_mst_flg_META,
			stktk_sum_flg_META,
			oth_ccn_sum_flg_META,
			amt_disp_digit_META,
			unit_disp_digit_META,
			std_disp_digit_META,
			rate_disp_digit_META,
			excel_pln_flg_META,
			excel_act_flg_META,
			excel_alc_flg_META,
			memo1_META,
			memo2_META,
			memo3_META,
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
			mrgn_expns_nm_META,
			purc_expns_nm_META,
			out_expns_nm_META,
			inpt_expns_nm_META,
			ss_expns_nm_META,
			prov_expns_nm_META
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
	protected MAM_CO_PARM_R(ConstMetaList<? extends MAM_CO_PARM_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_CO_PARM_R(ConstMetaList<? extends MAM_CO_PARM_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$co_cd,
				"co_cd",
				co_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$std_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$std_rnd_typ,
				"std_rnd_typ",
				std_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$std_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_PARM_R.$std_dec_place,
				"std_dec_place",
				std_dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$amt_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$amt_rnd_typ,
				"amt_rnd_typ",
				amt_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$amt_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_PARM_R.$amt_dec_place,
				"amt_dec_place",
				amt_dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$ave_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$ave_rnd_typ,
				"ave_rnd_typ",
				ave_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$ave_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_PARM_R.$ave_dec_place,
				"ave_dec_place",
				ave_dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$adj_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$adj_typ,
				"adj_typ",
				adj_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$mrgn_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$mrgn_expns_cd,
				"mrgn_expns_cd",
				mrgn_expns_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$purc_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$purc_expns_cd,
				"purc_expns_cd",
				purc_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$out_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$out_expns_cd,
				"out_expns_cd",
				out_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$inpt_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$inpt_expns_cd,
				"inpt_expns_cd",
				inpt_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$ss_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$ss_expns_cd,
				"ss_expns_cd",
				ss_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$prov_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$prov_expns_cd,
				"prov_expns_cd",
				prov_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$pre_alc_max_lvl,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_PARM_R.$pre_alc_max_lvl,
				"pre_alc_max_lvl",
				pre_alc_max_lvl,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$pre_alc_max_rec,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_PARM_R.$pre_alc_max_rec,
				"pre_alc_max_rec",
				pre_alc_max_rec,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$diff_use_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$diff_use_typ,
				"diff_use_typ",
				diff_use_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$def_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$def_calc_ctg_cd,
				"def_calc_ctg_cd",
				def_calc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$fix_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$fix_dpt_cd,
				"fix_dpt_cd",
				fix_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$lot_use_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$lot_use_typ,
				"lot_use_typ",
				lot_use_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$sublot_use_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$sublot_use_typ,
				"sublot_use_typ",
				sublot_use_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$sno1_use_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$sno1_use_typ,
				"sno1_use_typ",
				sno1_use_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$sno2_use_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$sno2_use_typ,
				"sno2_use_typ",
				sno2_use_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$sno3_use_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$sno3_use_typ,
				"sno3_use_typ",
				sno3_use_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$sno4_use_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$sno4_use_typ,
				"sno4_use_typ",
				sno4_use_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$trd_ratio_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$trd_ratio_flg,
				"trd_ratio_flg",
				trd_ratio_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$stop_slip_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$stop_slip_flg,
				"stop_slip_flg",
				stop_slip_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$non_prod_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$non_prod_flg,
				"non_prod_flg",
				non_prod_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$oper_sum_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$oper_sum_flg,
				"oper_sum_flg",
				oper_sum_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$non_sls_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$non_sls_flg,
				"non_sls_flg",
				non_sls_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$asst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$asst_flg,
				"asst_flg",
				asst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$stk_bp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$stk_bp_flg,
				"stk_bp_flg",
				stk_bp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$non_transit_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$non_transit_flg,
				"non_transit_flg",
				non_transit_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$wg_non_mov_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$wg_non_mov_flg,
				"wg_non_mov_flg",
				wg_non_mov_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$lot_non_mov_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$lot_non_mov_flg,
				"lot_non_mov_flg",
				lot_non_mov_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$sublot_non_mov_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$sublot_non_mov_flg,
				"sublot_non_mov_flg",
				sublot_non_mov_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$sno1_non_mov_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$sno1_non_mov_flg,
				"sno1_non_mov_flg",
				sno1_non_mov_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$sno2_non_mov_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$sno2_non_mov_flg,
				"sno2_non_mov_flg",
				sno2_non_mov_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$sno3_non_mov_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$sno3_non_mov_flg,
				"sno3_non_mov_flg",
				sno3_non_mov_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$sno4_non_mov_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$sno4_non_mov_flg,
				"sno4_non_mov_flg",
				sno4_non_mov_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$tmp_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$tmp_dpt_cd,
				"tmp_dpt_cd",
				tmp_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$act_trd_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$act_trd_calc_ctg_cd,
				"act_trd_calc_ctg_cd",
				act_trd_calc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$chk_mst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$chk_mst_flg,
				"chk_mst_flg",
				chk_mst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$stktk_sum_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$stktk_sum_flg,
				"stktk_sum_flg",
				stktk_sum_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$oth_ccn_sum_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$oth_ccn_sum_flg,
				"oth_ccn_sum_flg",
				oth_ccn_sum_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$amt_disp_digit,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_PARM_R.$amt_disp_digit,
				"amt_disp_digit",
				amt_disp_digit,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$unit_disp_digit,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_PARM_R.$unit_disp_digit,
				"unit_disp_digit",
				unit_disp_digit,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$std_disp_digit,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_PARM_R.$std_disp_digit,
				"std_disp_digit",
				std_disp_digit,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$rate_disp_digit,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_PARM_R.$rate_disp_digit,
				"rate_disp_digit",
				rate_disp_digit,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$excel_pln_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$excel_pln_flg,
				"excel_pln_flg",
				excel_pln_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$excel_act_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$excel_act_flg,
				"excel_act_flg",
				excel_act_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$excel_alc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_PARM_R.$excel_alc_flg,
				"excel_alc_flg",
				excel_alc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$memo1,
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
			MAM_CO_PARM_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$memo2,
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
			MAM_CO_PARM_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$memo3,
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
			MAM_CO_PARM_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$ins_usr_id,
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
			MAM_CO_PARM_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$ins_usr_nm,
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
			MAM_CO_PARM_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_CO_PARM_R.$ins_ts,
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
			MAM_CO_PARM_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$ins_func_id,
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
			MAM_CO_PARM_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_PARM_R.$upd_cntr,
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
			MAM_CO_PARM_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$upd_usr_id,
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
			MAM_CO_PARM_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$upd_usr_nm,
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
			MAM_CO_PARM_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_CO_PARM_R.$upd_ts,
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
			MAM_CO_PARM_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$upd_func_id,
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
			MAM_CO_PARM_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$upd_srv_req_no,
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
			MAM_CO_PARM_R.$mrgn_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$mrgn_expns_nm,
				"mrgn_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS1.EXPNS_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$purc_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$purc_expns_nm,
				"purc_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS2.EXPNS_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$out_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$out_expns_nm,
				"out_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS3.EXPNS_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$inpt_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$inpt_expns_nm,
				"inpt_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS4.EXPNS_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$ss_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$ss_expns_nm,
				"ss_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS5.EXPNS_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_PARM_R.$prov_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_PARM_R.$prov_expns_nm,
				"prov_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS6.EXPNS_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_CO_PARM_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_CO_PARM_R create(String alias) {
		MAM_CO_PARM_R row = new MAM_CO_PARM_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_CO_PARM_R createByName(T proto) {
		MAM_CO_PARM_R row = MAM_CO_PARM_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CO_PARM_R clone() {
		return (MAM_CO_PARM_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CO_PARM_R createInstance() {
		return (MAM_CO_PARM_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CO_PARM_R getValues(String... names) {
		return (MAM_CO_PARM_R) super.getValues(names);
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 0, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 0, $co_cd, value);
	}

	/**
	 * 標準端数処理区分. Rounding type (Standard).<p>
	 *
	 */
	public String std_rnd_typ() {
		return getConstString(offset + 1, $std_rnd_typ);
	}

	/**
	 * 標準端数処理区分. Rounding type (Standard).<p>
	 *
	 */
	public void std_rnd_typ(String value) {
		setConstString(offset + 1, $std_rnd_typ, value);
	}

	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public MCNumber std_dec_place() {
		return getConstNumber(offset + 2, $std_dec_place);
	}

	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(MCNumber value) {
		setConstNumber(offset + 2, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(int value) {
		setConstNumber(offset + 2, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(long value) {
		setConstNumber(offset + 2, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(float value) {
		setConstNumber(offset + 2, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(double value) {
		setConstNumber(offset + 2, $std_dec_place, value);
	}
	
	/**
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public String amt_rnd_typ() {
		return getConstString(offset + 3, $amt_rnd_typ);
	}

	/**
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public void amt_rnd_typ(String value) {
		setConstString(offset + 3, $amt_rnd_typ, value);
	}

	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 4, $amt_dec_place);
	}

	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}
	
	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public String ave_rnd_typ() {
		return getConstString(offset + 5, $ave_rnd_typ);
	}

	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public void ave_rnd_typ(String value) {
		setConstString(offset + 5, $ave_rnd_typ, value);
	}

	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public MCNumber ave_dec_place() {
		return getConstNumber(offset + 6, $ave_dec_place);
	}

	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(MCNumber value) {
		setConstNumber(offset + 6, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(int value) {
		setConstNumber(offset + 6, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(long value) {
		setConstNumber(offset + 6, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(float value) {
		setConstNumber(offset + 6, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(double value) {
		setConstNumber(offset + 6, $ave_dec_place, value);
	}
	
	/**
	 * 端数調整区分. Fraction adjustment type.<p>
	 *
	 */
	public String adj_typ() {
		return getConstString(offset + 7, $adj_typ);
	}

	/**
	 * 端数調整区分. Fraction adjustment type.<p>
	 *
	 */
	public void adj_typ(String value) {
		setConstString(offset + 7, $adj_typ, value);
	}

	/**
	 * 調整費目ＣＤ. Adjustment cost element cd..<p>
	 *
	 */
	public String mrgn_expns_cd() {
		return getConstString(offset + 8, $mrgn_expns_cd);
	}

	/**
	 * 調整費目ＣＤ. Adjustment cost element cd..<p>
	 *
	 */
	public void mrgn_expns_cd(String value) {
		setConstString(offset + 8, $mrgn_expns_cd, value);
	}

	/**
	 * 購買費目ＣＤ. Purchase cost element item cd..<p>
	 *
	 */
	public String purc_expns_cd() {
		return getConstString(offset + 9, $purc_expns_cd);
	}

	/**
	 * 購買費目ＣＤ. Purchase cost element item cd..<p>
	 *
	 */
	public void purc_expns_cd(String value) {
		setConstString(offset + 9, $purc_expns_cd, value);
	}

	/**
	 * 外注費目ＣＤ. Subcontract cost element cd..<p>
	 *
	 */
	public String out_expns_cd() {
		return getConstString(offset + 10, $out_expns_cd);
	}

	/**
	 * 外注費目ＣＤ. Subcontract cost element cd..<p>
	 *
	 */
	public void out_expns_cd(String value) {
		setConstString(offset + 10, $out_expns_cd, value);
	}

	/**
	 * 投入費目ＣＤ. Input cost element cd..<p>
	 *
	 */
	public String inpt_expns_cd() {
		return getConstString(offset + 11, $inpt_expns_cd);
	}

	/**
	 * 投入費目ＣＤ. Input cost element cd..<p>
	 *
	 */
	public void inpt_expns_cd(String value) {
		setConstString(offset + 11, $inpt_expns_cd, value);
	}

	/**
	 * 自給費目ＣＤ. Self supply cost element cd..<p>
	 *
	 */
	public String ss_expns_cd() {
		return getConstString(offset + 12, $ss_expns_cd);
	}

	/**
	 * 自給費目ＣＤ. Self supply cost element cd..<p>
	 *
	 */
	public void ss_expns_cd(String value) {
		setConstString(offset + 12, $ss_expns_cd, value);
	}

	/**
	 * 有償差額費目ＣＤ. Cost element cd. for gain or loss of chargeable item.<p>
	 *
	 */
	public String prov_expns_cd() {
		return getConstString(offset + 13, $prov_expns_cd);
	}

	/**
	 * 有償差額費目ＣＤ. Cost element cd. for gain or loss of chargeable item.<p>
	 *
	 */
	public void prov_expns_cd(String value) {
		setConstString(offset + 13, $prov_expns_cd, value);
	}

	/**
	 * 一次配賦最大配賦階層. Departmental alloc. max. allocation hierarchy.<p>
	 *
	 */
	public MCNumber pre_alc_max_lvl() {
		return getConstNumber(offset + 14, $pre_alc_max_lvl);
	}

	/**
	 * 一次配賦最大配賦階層. Departmental alloc. max. allocation hierarchy.<p>
	 *
	 */
	public void pre_alc_max_lvl(MCNumber value) {
		setConstNumber(offset + 14, $pre_alc_max_lvl, value);
	}
	
	/**
	 * 一次配賦最大配賦階層. Departmental alloc. max. allocation hierarchy.<p>
	 *
	 */
	public void pre_alc_max_lvl(int value) {
		setConstNumber(offset + 14, $pre_alc_max_lvl, value);
	}
	
	/**
	 * 一次配賦最大配賦階層. Departmental alloc. max. allocation hierarchy.<p>
	 *
	 */
	public void pre_alc_max_lvl(long value) {
		setConstNumber(offset + 14, $pre_alc_max_lvl, value);
	}
	
	/**
	 * 一次配賦最大配賦階層. Departmental alloc. max. allocation hierarchy.<p>
	 *
	 */
	public void pre_alc_max_lvl(float value) {
		setConstNumber(offset + 14, $pre_alc_max_lvl, value);
	}
	
	/**
	 * 一次配賦最大配賦階層. Departmental alloc. max. allocation hierarchy.<p>
	 *
	 */
	public void pre_alc_max_lvl(double value) {
		setConstNumber(offset + 14, $pre_alc_max_lvl, value);
	}
	
	/**
	 * 一次配賦最大レコード数. Departmental alloc. max. number of records.<p>
	 *
	 */
	public MCNumber pre_alc_max_rec() {
		return getConstNumber(offset + 15, $pre_alc_max_rec);
	}

	/**
	 * 一次配賦最大レコード数. Departmental alloc. max. number of records.<p>
	 *
	 */
	public void pre_alc_max_rec(MCNumber value) {
		setConstNumber(offset + 15, $pre_alc_max_rec, value);
	}
	
	/**
	 * 一次配賦最大レコード数. Departmental alloc. max. number of records.<p>
	 *
	 */
	public void pre_alc_max_rec(int value) {
		setConstNumber(offset + 15, $pre_alc_max_rec, value);
	}
	
	/**
	 * 一次配賦最大レコード数. Departmental alloc. max. number of records.<p>
	 *
	 */
	public void pre_alc_max_rec(long value) {
		setConstNumber(offset + 15, $pre_alc_max_rec, value);
	}
	
	/**
	 * 一次配賦最大レコード数. Departmental alloc. max. number of records.<p>
	 *
	 */
	public void pre_alc_max_rec(float value) {
		setConstNumber(offset + 15, $pre_alc_max_rec, value);
	}
	
	/**
	 * 一次配賦最大レコード数. Departmental alloc. max. number of records.<p>
	 *
	 */
	public void pre_alc_max_rec(double value) {
		setConstNumber(offset + 15, $pre_alc_max_rec, value);
	}
	
	/**
	 * 差異使用区分. Variance use type.<p>
	 *
	 */
	public String diff_use_typ() {
		return getConstString(offset + 16, $diff_use_typ);
	}

	/**
	 * 差異使用区分. Variance use type.<p>
	 *
	 */
	public void diff_use_typ(String value) {
		setConstString(offset + 16, $diff_use_typ, value);
	}

	/**
	 * デフォルト計算カテゴリＣＤ. Default calculation category cd..<p>
	 *
	 */
	public String def_calc_ctg_cd() {
		return getConstString(offset + 17, $def_calc_ctg_cd);
	}

	/**
	 * デフォルト計算カテゴリＣＤ. Default calculation category cd..<p>
	 *
	 */
	public void def_calc_ctg_cd(String value) {
		setConstString(offset + 17, $def_calc_ctg_cd, value);
	}

	/**
	 * 固定管理部門ＣＤ. Constant management dept. cd..<p>
	 *
	 */
	public String fix_dpt_cd() {
		return getConstString(offset + 18, $fix_dpt_cd);
	}

	/**
	 * 固定管理部門ＣＤ. Constant management dept. cd..<p>
	 *
	 */
	public void fix_dpt_cd(String value) {
		setConstString(offset + 18, $fix_dpt_cd, value);
	}

	/**
	 * ロットＮＯ生販使用区分. Lot No. use type for production/sales.<p>
	 *
	 */
	public String lot_use_typ() {
		return getConstString(offset + 19, $lot_use_typ);
	}

	/**
	 * ロットＮＯ生販使用区分. Lot No. use type for production/sales.<p>
	 *
	 */
	public void lot_use_typ(String value) {
		setConstString(offset + 19, $lot_use_typ, value);
	}

	/**
	 * サブロットＮＯ生販使用区分. Sublot No. use type for production/sales.<p>
	 *
	 */
	public String sublot_use_typ() {
		return getConstString(offset + 20, $sublot_use_typ);
	}

	/**
	 * サブロットＮＯ生販使用区分. Sublot No. use type for production/sales.<p>
	 *
	 */
	public void sublot_use_typ(String value) {
		setConstString(offset + 20, $sublot_use_typ, value);
	}

	/**
	 * 手配ＮＯ１生販使用区分. SEIBAN No. 1 production/sales use type.<p>
	 *
	 */
	public String sno1_use_typ() {
		return getConstString(offset + 21, $sno1_use_typ);
	}

	/**
	 * 手配ＮＯ１生販使用区分. SEIBAN No. 1 production/sales use type.<p>
	 *
	 */
	public void sno1_use_typ(String value) {
		setConstString(offset + 21, $sno1_use_typ, value);
	}

	/**
	 * 手配ＮＯ２生販使用区分. SEIBAN No. 2 production/sales use type.<p>
	 *
	 */
	public String sno2_use_typ() {
		return getConstString(offset + 22, $sno2_use_typ);
	}

	/**
	 * 手配ＮＯ２生販使用区分. SEIBAN No. 2 production/sales use type.<p>
	 *
	 */
	public void sno2_use_typ(String value) {
		setConstString(offset + 22, $sno2_use_typ, value);
	}

	/**
	 * 手配ＮＯ３生販使用区分. SEIBAN No. 3 production/sales use type.<p>
	 *
	 */
	public String sno3_use_typ() {
		return getConstString(offset + 23, $sno3_use_typ);
	}

	/**
	 * 手配ＮＯ３生販使用区分. SEIBAN No. 3 production/sales use type.<p>
	 *
	 */
	public void sno3_use_typ(String value) {
		setConstString(offset + 23, $sno3_use_typ, value);
	}

	/**
	 * 手配ＮＯ４生販使用区分. SEIBAN No. 4 production/sales use type.<p>
	 *
	 */
	public String sno4_use_typ() {
		return getConstString(offset + 24, $sno4_use_typ);
	}

	/**
	 * 手配ＮＯ４生販使用区分. SEIBAN No. 4 production/sales use type.<p>
	 *
	 */
	public void sno4_use_typ(String value) {
		setConstString(offset + 24, $sno4_use_typ, value);
	}

	/**
	 * 振替比率設定時に標準単価を使用する. Use standard unit cost at transfer ratio setting.<p>
	 *
	 */
	public boolean trd_ratio_flg() {
		return getConstBoolean(offset + 25, $trd_ratio_flg);
	}

	/**
	 * 振替比率設定時に標準単価を使用する. Use standard unit cost at transfer ratio setting.<p>
	 *
	 */
	public void trd_ratio_flg(boolean value) {
		setConstBoolean(offset + 25, $trd_ratio_flg, value);
	}

	/**
	 * 取り消した伝票を取り込む. Take in canceled slip.<p>
	 *
	 */
	public boolean stop_slip_flg() {
		return getConstBoolean(offset + 26, $stop_slip_flg);
	}

	/**
	 * 取り消した伝票を取り込む. Take in canceled slip.<p>
	 *
	 */
	public void stop_slip_flg(boolean value) {
		setConstBoolean(offset + 26, $stop_slip_flg, value);
	}

	/**
	 * 生産データを取り込まない. Do not import production data.<p>
	 *
	 */
	public boolean non_prod_flg() {
		return getConstBoolean(offset + 27, $non_prod_flg);
	}

	/**
	 * 生産データを取り込まない. Do not import production data.<p>
	 *
	 */
	public void non_prod_flg(boolean value) {
		setConstBoolean(offset + 27, $non_prod_flg, value);
	}

	/**
	 * 工程ＣＤを工程実績ＮＯとして取り込む. Import operation cd. as operation result No..<p>
	 *
	 */
	public boolean oper_sum_flg() {
		return getConstBoolean(offset + 28, $oper_sum_flg);
	}

	/**
	 * 工程ＣＤを工程実績ＮＯとして取り込む. Import operation cd. as operation result No..<p>
	 *
	 */
	public void oper_sum_flg(boolean value) {
		setConstBoolean(offset + 28, $oper_sum_flg, value);
	}

	/**
	 * 販売データを取り込まない. Do not import sales data.<p>
	 *
	 */
	public boolean non_sls_flg() {
		return getConstBoolean(offset + 29, $non_sls_flg);
	}

	/**
	 * 販売データを取り込まない. Do not import sales data.<p>
	 *
	 */
	public void non_sls_flg(boolean value) {
		setConstBoolean(offset + 29, $non_sls_flg, value);
	}

	/**
	 * 販売資産を生産資産として取り込む. Import sales asset as production asset.<p>
	 *
	 */
	public boolean asst_flg() {
		return getConstBoolean(offset + 30, $asst_flg);
	}

	/**
	 * 販売資産を生産資産として取り込む. Import sales asset as production asset.<p>
	 *
	 */
	public void asst_flg(boolean value) {
		setConstBoolean(offset + 30, $asst_flg, value);
	}

	/**
	 * 出荷先の在庫を考慮する. Include receiving point inventory.<p>
	 *
	 */
	public boolean stk_bp_flg() {
		return getConstBoolean(offset + 31, $stk_bp_flg);
	}

	/**
	 * 出荷先の在庫を考慮する. Include receiving point inventory.<p>
	 *
	 */
	public void stk_bp_flg(boolean value) {
		setConstBoolean(offset + 31, $stk_bp_flg, value);
	}

	/**
	 * 未着品仕入データを取り込まない. Do not import purchase data of items in transit.<p>
	 *
	 */
	public boolean non_transit_flg() {
		return getConstBoolean(offset + 32, $non_transit_flg);
	}

	/**
	 * 未着品仕入データを取り込まない. Do not import purchase data of items in transit.<p>
	 *
	 */
	public void non_transit_flg(boolean value) {
		setConstBoolean(offset + 32, $non_transit_flg, value);
	}

	/**
	 * ワーキンググループ滞留使用ＦＬＧ. WG with non-moving flg..<p>
	 *
	 */
	public boolean wg_non_mov_flg() {
		return getConstBoolean(offset + 33, $wg_non_mov_flg);
	}

	/**
	 * ワーキンググループ滞留使用ＦＬＧ. WG with non-moving flg..<p>
	 *
	 */
	public void wg_non_mov_flg(boolean value) {
		setConstBoolean(offset + 33, $wg_non_mov_flg, value);
	}

	/**
	 * ロットＮＯ滞留使用ＦＬＧ. Lot No. with non-moving flg..<p>
	 *
	 */
	public boolean lot_non_mov_flg() {
		return getConstBoolean(offset + 34, $lot_non_mov_flg);
	}

	/**
	 * ロットＮＯ滞留使用ＦＬＧ. Lot No. with non-moving flg..<p>
	 *
	 */
	public void lot_non_mov_flg(boolean value) {
		setConstBoolean(offset + 34, $lot_non_mov_flg, value);
	}

	/**
	 * サブロットＮＯ滞留使用ＦＬＧ. Sublot No. with non-moving flg..<p>
	 *
	 */
	public boolean sublot_non_mov_flg() {
		return getConstBoolean(offset + 35, $sublot_non_mov_flg);
	}

	/**
	 * サブロットＮＯ滞留使用ＦＬＧ. Sublot No. with non-moving flg..<p>
	 *
	 */
	public void sublot_non_mov_flg(boolean value) {
		setConstBoolean(offset + 35, $sublot_non_mov_flg, value);
	}

	/**
	 * 手配ＮＯ１滞留使用ＦＬＧ. SEIBAN No. 1 with non-moving flg..<p>
	 *
	 */
	public boolean sno1_non_mov_flg() {
		return getConstBoolean(offset + 36, $sno1_non_mov_flg);
	}

	/**
	 * 手配ＮＯ１滞留使用ＦＬＧ. SEIBAN No. 1 with non-moving flg..<p>
	 *
	 */
	public void sno1_non_mov_flg(boolean value) {
		setConstBoolean(offset + 36, $sno1_non_mov_flg, value);
	}

	/**
	 * 手配ＮＯ２滞留使用ＦＬＧ. SEIBAN No. 2 with non-moving flg..<p>
	 *
	 */
	public boolean sno2_non_mov_flg() {
		return getConstBoolean(offset + 37, $sno2_non_mov_flg);
	}

	/**
	 * 手配ＮＯ２滞留使用ＦＬＧ. SEIBAN No. 2 with non-moving flg..<p>
	 *
	 */
	public void sno2_non_mov_flg(boolean value) {
		setConstBoolean(offset + 37, $sno2_non_mov_flg, value);
	}

	/**
	 * 手配ＮＯ３滞留使用ＦＬＧ. SEIBAN No. 3 with non-moving flg..<p>
	 *
	 */
	public boolean sno3_non_mov_flg() {
		return getConstBoolean(offset + 38, $sno3_non_mov_flg);
	}

	/**
	 * 手配ＮＯ３滞留使用ＦＬＧ. SEIBAN No. 3 with non-moving flg..<p>
	 *
	 */
	public void sno3_non_mov_flg(boolean value) {
		setConstBoolean(offset + 38, $sno3_non_mov_flg, value);
	}

	/**
	 * 手配ＮＯ４滞留使用ＦＬＧ. SEIBAN No. 4 with non-moving flg..<p>
	 *
	 */
	public boolean sno4_non_mov_flg() {
		return getConstBoolean(offset + 39, $sno4_non_mov_flg);
	}

	/**
	 * 手配ＮＯ４滞留使用ＦＬＧ. SEIBAN No. 4 with non-moving flg..<p>
	 *
	 */
	public void sno4_non_mov_flg(boolean value) {
		setConstBoolean(offset + 39, $sno4_non_mov_flg, value);
	}

	/**
	 * 振替用部門ＣＤ. Transfer dept. cd..<p>
	 *
	 */
	public String tmp_dpt_cd() {
		return getConstString(offset + 40, $tmp_dpt_cd);
	}

	/**
	 * 振替用部門ＣＤ. Transfer dept. cd..<p>
	 *
	 */
	public void tmp_dpt_cd(String value) {
		setConstString(offset + 40, $tmp_dpt_cd, value);
	}

	/**
	 * 実績振替計算カテゴリＣＤ. Result transfer calculation category cd..<p>
	 *
	 */
	public String act_trd_calc_ctg_cd() {
		return getConstString(offset + 41, $act_trd_calc_ctg_cd);
	}

	/**
	 * 実績振替計算カテゴリＣＤ. Result transfer calculation category cd..<p>
	 *
	 */
	public void act_trd_calc_ctg_cd(String value) {
		setConstString(offset + 41, $act_trd_calc_ctg_cd, value);
	}

	/**
	 * マスタの存在チェックを行う. Check existence of master.<p>
	 *
	 */
	public boolean chk_mst_flg() {
		return getConstBoolean(offset + 42, $chk_mst_flg);
	}

	/**
	 * マスタの存在チェックを行う. Check existence of master.<p>
	 *
	 */
	public void chk_mst_flg(boolean value) {
		setConstBoolean(offset + 42, $chk_mst_flg, value);
	}

	/**
	 * 棚卸を集約しない. Do not consolidate the inventory count.<p>
	 *
	 */
	public boolean stktk_sum_flg() {
		return getConstBoolean(offset + 43, $stktk_sum_flg);
	}

	/**
	 * 棚卸を集約しない. Do not consolidate the inventory count.<p>
	 *
	 */
	public void stktk_sum_flg(boolean value) {
		setConstBoolean(offset + 43, $stktk_sum_flg, value);
	}

	/**
	 * 他勘定を集約しない. Do not consolidate other accounting data.<p>
	 *
	 */
	public boolean oth_ccn_sum_flg() {
		return getConstBoolean(offset + 44, $oth_ccn_sum_flg);
	}

	/**
	 * 他勘定を集約しない. Do not consolidate other accounting data.<p>
	 *
	 */
	public void oth_ccn_sum_flg(boolean value) {
		setConstBoolean(offset + 44, $oth_ccn_sum_flg, value);
	}

	/**
	 * 金額小数部表示桁. Display digits (Amount decimal places).<p>
	 *
	 */
	public MCNumber amt_disp_digit() {
		return getConstNumber(offset + 45, $amt_disp_digit);
	}

	/**
	 * 金額小数部表示桁. Display digits (Amount decimal places).<p>
	 *
	 */
	public void amt_disp_digit(MCNumber value) {
		setConstNumber(offset + 45, $amt_disp_digit, value);
	}
	
	/**
	 * 金額小数部表示桁. Display digits (Amount decimal places).<p>
	 *
	 */
	public void amt_disp_digit(int value) {
		setConstNumber(offset + 45, $amt_disp_digit, value);
	}
	
	/**
	 * 金額小数部表示桁. Display digits (Amount decimal places).<p>
	 *
	 */
	public void amt_disp_digit(long value) {
		setConstNumber(offset + 45, $amt_disp_digit, value);
	}
	
	/**
	 * 金額小数部表示桁. Display digits (Amount decimal places).<p>
	 *
	 */
	public void amt_disp_digit(float value) {
		setConstNumber(offset + 45, $amt_disp_digit, value);
	}
	
	/**
	 * 金額小数部表示桁. Display digits (Amount decimal places).<p>
	 *
	 */
	public void amt_disp_digit(double value) {
		setConstNumber(offset + 45, $amt_disp_digit, value);
	}
	
	/**
	 * 単価小数部表示桁. Display digits (Unit price decimal places).<p>
	 *
	 */
	public MCNumber unit_disp_digit() {
		return getConstNumber(offset + 46, $unit_disp_digit);
	}

	/**
	 * 単価小数部表示桁. Display digits (Unit price decimal places).<p>
	 *
	 */
	public void unit_disp_digit(MCNumber value) {
		setConstNumber(offset + 46, $unit_disp_digit, value);
	}
	
	/**
	 * 単価小数部表示桁. Display digits (Unit price decimal places).<p>
	 *
	 */
	public void unit_disp_digit(int value) {
		setConstNumber(offset + 46, $unit_disp_digit, value);
	}
	
	/**
	 * 単価小数部表示桁. Display digits (Unit price decimal places).<p>
	 *
	 */
	public void unit_disp_digit(long value) {
		setConstNumber(offset + 46, $unit_disp_digit, value);
	}
	
	/**
	 * 単価小数部表示桁. Display digits (Unit price decimal places).<p>
	 *
	 */
	public void unit_disp_digit(float value) {
		setConstNumber(offset + 46, $unit_disp_digit, value);
	}
	
	/**
	 * 単価小数部表示桁. Display digits (Unit price decimal places).<p>
	 *
	 */
	public void unit_disp_digit(double value) {
		setConstNumber(offset + 46, $unit_disp_digit, value);
	}
	
	/**
	 * 標準小数部表示桁. Display digits (Standard decimal places).<p>
	 *
	 */
	public MCNumber std_disp_digit() {
		return getConstNumber(offset + 47, $std_disp_digit);
	}

	/**
	 * 標準小数部表示桁. Display digits (Standard decimal places).<p>
	 *
	 */
	public void std_disp_digit(MCNumber value) {
		setConstNumber(offset + 47, $std_disp_digit, value);
	}
	
	/**
	 * 標準小数部表示桁. Display digits (Standard decimal places).<p>
	 *
	 */
	public void std_disp_digit(int value) {
		setConstNumber(offset + 47, $std_disp_digit, value);
	}
	
	/**
	 * 標準小数部表示桁. Display digits (Standard decimal places).<p>
	 *
	 */
	public void std_disp_digit(long value) {
		setConstNumber(offset + 47, $std_disp_digit, value);
	}
	
	/**
	 * 標準小数部表示桁. Display digits (Standard decimal places).<p>
	 *
	 */
	public void std_disp_digit(float value) {
		setConstNumber(offset + 47, $std_disp_digit, value);
	}
	
	/**
	 * 標準小数部表示桁. Display digits (Standard decimal places).<p>
	 *
	 */
	public void std_disp_digit(double value) {
		setConstNumber(offset + 47, $std_disp_digit, value);
	}
	
	/**
	 * 比率小数部表示桁. Display digits (Ratio decimal places).<p>
	 *
	 */
	public MCNumber rate_disp_digit() {
		return getConstNumber(offset + 48, $rate_disp_digit);
	}

	/**
	 * 比率小数部表示桁. Display digits (Ratio decimal places).<p>
	 *
	 */
	public void rate_disp_digit(MCNumber value) {
		setConstNumber(offset + 48, $rate_disp_digit, value);
	}
	
	/**
	 * 比率小数部表示桁. Display digits (Ratio decimal places).<p>
	 *
	 */
	public void rate_disp_digit(int value) {
		setConstNumber(offset + 48, $rate_disp_digit, value);
	}
	
	/**
	 * 比率小数部表示桁. Display digits (Ratio decimal places).<p>
	 *
	 */
	public void rate_disp_digit(long value) {
		setConstNumber(offset + 48, $rate_disp_digit, value);
	}
	
	/**
	 * 比率小数部表示桁. Display digits (Ratio decimal places).<p>
	 *
	 */
	public void rate_disp_digit(float value) {
		setConstNumber(offset + 48, $rate_disp_digit, value);
	}
	
	/**
	 * 比率小数部表示桁. Display digits (Ratio decimal places).<p>
	 *
	 */
	public void rate_disp_digit(double value) {
		setConstNumber(offset + 48, $rate_disp_digit, value);
	}
	
	/**
	 * 計画データをＥＸＣＥＬで入出力する. Input/output planning data in Excel.<p>
	 *
	 */
	public boolean excel_pln_flg() {
		return getConstBoolean(offset + 49, $excel_pln_flg);
	}

	/**
	 * 計画データをＥＸＣＥＬで入出力する. Input/output planning data in Excel.<p>
	 *
	 */
	public void excel_pln_flg(boolean value) {
		setConstBoolean(offset + 49, $excel_pln_flg, value);
	}

	/**
	 * 実績データをＥＸＣＥＬで入出力する. Input/output result data in Excel.<p>
	 *
	 */
	public boolean excel_act_flg() {
		return getConstBoolean(offset + 50, $excel_act_flg);
	}

	/**
	 * 実績データをＥＸＣＥＬで入出力する. Input/output result data in Excel.<p>
	 *
	 */
	public void excel_act_flg(boolean value) {
		setConstBoolean(offset + 50, $excel_act_flg, value);
	}

	/**
	 * 配賦データをＥＸＣＥＬで入出力する. Input/output allocation data in Excel.<p>
	 *
	 */
	public boolean excel_alc_flg() {
		return getConstBoolean(offset + 51, $excel_alc_flg);
	}

	/**
	 * 配賦データをＥＸＣＥＬで入出力する. Input/output allocation data in Excel.<p>
	 *
	 */
	public void excel_alc_flg(boolean value) {
		setConstBoolean(offset + 51, $excel_alc_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 52, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 52, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 53, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 53, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 54, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 54, $memo3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 55, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 55, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 56, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 56, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 57, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 57, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 58, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 58, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 59, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 60, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 60, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 61, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 61, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 62, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 62, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 63, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 63, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 64, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 64, $upd_srv_req_no, value);
	}

	/**
	 * 調整費目名. Adjustment cost element name.<p>
	 *
	 */
	public String mrgn_expns_nm() {
		return getConstString(offset + 65, $mrgn_expns_nm);
	}

	/**
	 * 調整費目名. Adjustment cost element name.<p>
	 *
	 */
	public void mrgn_expns_nm(String value) {
		setConstString(offset + 65, $mrgn_expns_nm, value);
	}

	/**
	 * 購買費目名. Purchase cost element name.<p>
	 *
	 */
	public String purc_expns_nm() {
		return getConstString(offset + 66, $purc_expns_nm);
	}

	/**
	 * 購買費目名. Purchase cost element name.<p>
	 *
	 */
	public void purc_expns_nm(String value) {
		setConstString(offset + 66, $purc_expns_nm, value);
	}

	/**
	 * 外注費目名. Subcontract cost element name.<p>
	 *
	 */
	public String out_expns_nm() {
		return getConstString(offset + 67, $out_expns_nm);
	}

	/**
	 * 外注費目名. Subcontract cost element name.<p>
	 *
	 */
	public void out_expns_nm(String value) {
		setConstString(offset + 67, $out_expns_nm, value);
	}

	/**
	 * 投入費目名. Input cost element name.<p>
	 *
	 */
	public String inpt_expns_nm() {
		return getConstString(offset + 68, $inpt_expns_nm);
	}

	/**
	 * 投入費目名. Input cost element name.<p>
	 *
	 */
	public void inpt_expns_nm(String value) {
		setConstString(offset + 68, $inpt_expns_nm, value);
	}

	/**
	 * 自給費目名. Self supply cost element name.<p>
	 *
	 */
	public String ss_expns_nm() {
		return getConstString(offset + 69, $ss_expns_nm);
	}

	/**
	 * 自給費目名. Self supply cost element name.<p>
	 *
	 */
	public void ss_expns_nm(String value) {
		setConstString(offset + 69, $ss_expns_nm, value);
	}

	/**
	 * 有償差額費目名. Gain or loss of chargeable supply cost element name.<p>
	 *
	 */
	public String prov_expns_nm() {
		return getConstString(offset + 70, $prov_expns_nm);
	}

	/**
	 * 有償差額費目名. Gain or loss of chargeable supply cost element name.<p>
	 *
	 */
	public void prov_expns_nm(String value) {
		setConstString(offset + 70, $prov_expns_nm, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			return diff_use_typ();
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			return def_calc_ctg_cd();
		}
		if ($fix_dpt_cd.equalsIgnoreCase(name)) {
			return fix_dpt_cd();
		}
		if ($lot_use_typ.equalsIgnoreCase(name)) {
			return lot_use_typ();
		}
		if ($sublot_use_typ.equalsIgnoreCase(name)) {
			return sublot_use_typ();
		}
		if ($sno1_use_typ.equalsIgnoreCase(name)) {
			return sno1_use_typ();
		}
		if ($sno2_use_typ.equalsIgnoreCase(name)) {
			return sno2_use_typ();
		}
		if ($sno3_use_typ.equalsIgnoreCase(name)) {
			return sno3_use_typ();
		}
		if ($sno4_use_typ.equalsIgnoreCase(name)) {
			return sno4_use_typ();
		}
		if ($tmp_dpt_cd.equalsIgnoreCase(name)) {
			return tmp_dpt_cd();
		}
		if ($act_trd_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_trd_calc_ctg_cd();
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
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			return mrgn_expns_nm();
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			return purc_expns_nm();
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			return out_expns_nm();
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			return inpt_expns_nm();
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			return ss_expns_nm();
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			return prov_expns_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			return pre_alc_max_lvl();
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			return pre_alc_max_rec();
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			return amt_disp_digit();
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			return unit_disp_digit();
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			return std_disp_digit();
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			return rate_disp_digit();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
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
		if ($trd_ratio_flg.equalsIgnoreCase(name)) {
			return trd_ratio_flg();
		}
		if ($stop_slip_flg.equalsIgnoreCase(name)) {
			return stop_slip_flg();
		}
		if ($non_prod_flg.equalsIgnoreCase(name)) {
			return non_prod_flg();
		}
		if ($oper_sum_flg.equalsIgnoreCase(name)) {
			return oper_sum_flg();
		}
		if ($non_sls_flg.equalsIgnoreCase(name)) {
			return non_sls_flg();
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			return asst_flg();
		}
		if ($stk_bp_flg.equalsIgnoreCase(name)) {
			return stk_bp_flg();
		}
		if ($non_transit_flg.equalsIgnoreCase(name)) {
			return non_transit_flg();
		}
		if ($wg_non_mov_flg.equalsIgnoreCase(name)) {
			return wg_non_mov_flg();
		}
		if ($lot_non_mov_flg.equalsIgnoreCase(name)) {
			return lot_non_mov_flg();
		}
		if ($sublot_non_mov_flg.equalsIgnoreCase(name)) {
			return sublot_non_mov_flg();
		}
		if ($sno1_non_mov_flg.equalsIgnoreCase(name)) {
			return sno1_non_mov_flg();
		}
		if ($sno2_non_mov_flg.equalsIgnoreCase(name)) {
			return sno2_non_mov_flg();
		}
		if ($sno3_non_mov_flg.equalsIgnoreCase(name)) {
			return sno3_non_mov_flg();
		}
		if ($sno4_non_mov_flg.equalsIgnoreCase(name)) {
			return sno4_non_mov_flg();
		}
		if ($chk_mst_flg.equalsIgnoreCase(name)) {
			return chk_mst_flg();
		}
		if ($stktk_sum_flg.equalsIgnoreCase(name)) {
			return stktk_sum_flg();
		}
		if ($oth_ccn_sum_flg.equalsIgnoreCase(name)) {
			return oth_ccn_sum_flg();
		}
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			return excel_pln_flg();
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			return excel_act_flg();
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			return excel_alc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			return diff_use_typ();
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			return def_calc_ctg_cd();
		}
		if ($fix_dpt_cd.equalsIgnoreCase(name)) {
			return fix_dpt_cd();
		}
		if ($lot_use_typ.equalsIgnoreCase(name)) {
			return lot_use_typ();
		}
		if ($sublot_use_typ.equalsIgnoreCase(name)) {
			return sublot_use_typ();
		}
		if ($sno1_use_typ.equalsIgnoreCase(name)) {
			return sno1_use_typ();
		}
		if ($sno2_use_typ.equalsIgnoreCase(name)) {
			return sno2_use_typ();
		}
		if ($sno3_use_typ.equalsIgnoreCase(name)) {
			return sno3_use_typ();
		}
		if ($sno4_use_typ.equalsIgnoreCase(name)) {
			return sno4_use_typ();
		}
		if ($tmp_dpt_cd.equalsIgnoreCase(name)) {
			return tmp_dpt_cd();
		}
		if ($act_trd_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_trd_calc_ctg_cd();
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
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			return mrgn_expns_nm();
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			return purc_expns_nm();
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			return out_expns_nm();
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			return inpt_expns_nm();
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			return ss_expns_nm();
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			return prov_expns_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			return pre_alc_max_lvl();
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			return pre_alc_max_rec();
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			return amt_disp_digit();
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			return unit_disp_digit();
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			return std_disp_digit();
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			return rate_disp_digit();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
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
		if ($trd_ratio_flg.equalsIgnoreCase(name)) {
			return trd_ratio_flg();
		}
		if ($stop_slip_flg.equalsIgnoreCase(name)) {
			return stop_slip_flg();
		}
		if ($non_prod_flg.equalsIgnoreCase(name)) {
			return non_prod_flg();
		}
		if ($oper_sum_flg.equalsIgnoreCase(name)) {
			return oper_sum_flg();
		}
		if ($non_sls_flg.equalsIgnoreCase(name)) {
			return non_sls_flg();
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			return asst_flg();
		}
		if ($stk_bp_flg.equalsIgnoreCase(name)) {
			return stk_bp_flg();
		}
		if ($non_transit_flg.equalsIgnoreCase(name)) {
			return non_transit_flg();
		}
		if ($wg_non_mov_flg.equalsIgnoreCase(name)) {
			return wg_non_mov_flg();
		}
		if ($lot_non_mov_flg.equalsIgnoreCase(name)) {
			return lot_non_mov_flg();
		}
		if ($sublot_non_mov_flg.equalsIgnoreCase(name)) {
			return sublot_non_mov_flg();
		}
		if ($sno1_non_mov_flg.equalsIgnoreCase(name)) {
			return sno1_non_mov_flg();
		}
		if ($sno2_non_mov_flg.equalsIgnoreCase(name)) {
			return sno2_non_mov_flg();
		}
		if ($sno3_non_mov_flg.equalsIgnoreCase(name)) {
			return sno3_non_mov_flg();
		}
		if ($sno4_non_mov_flg.equalsIgnoreCase(name)) {
			return sno4_non_mov_flg();
		}
		if ($chk_mst_flg.equalsIgnoreCase(name)) {
			return chk_mst_flg();
		}
		if ($stktk_sum_flg.equalsIgnoreCase(name)) {
			return stktk_sum_flg();
		}
		if ($oth_ccn_sum_flg.equalsIgnoreCase(name)) {
			return oth_ccn_sum_flg();
		}
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			return excel_pln_flg();
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			return excel_act_flg();
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			return excel_alc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			diff_use_typ(value);
			return;
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			def_calc_ctg_cd(value);
			return;
		}
		if ($fix_dpt_cd.equalsIgnoreCase(name)) {
			fix_dpt_cd(value);
			return;
		}
		if ($lot_use_typ.equalsIgnoreCase(name)) {
			lot_use_typ(value);
			return;
		}
		if ($sublot_use_typ.equalsIgnoreCase(name)) {
			sublot_use_typ(value);
			return;
		}
		if ($sno1_use_typ.equalsIgnoreCase(name)) {
			sno1_use_typ(value);
			return;
		}
		if ($sno2_use_typ.equalsIgnoreCase(name)) {
			sno2_use_typ(value);
			return;
		}
		if ($sno3_use_typ.equalsIgnoreCase(name)) {
			sno3_use_typ(value);
			return;
		}
		if ($sno4_use_typ.equalsIgnoreCase(name)) {
			sno4_use_typ(value);
			return;
		}
		if ($tmp_dpt_cd.equalsIgnoreCase(name)) {
			tmp_dpt_cd(value);
			return;
		}
		if ($act_trd_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_trd_calc_ctg_cd(value);
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
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			mrgn_expns_nm(value);
			return;
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			purc_expns_nm(value);
			return;
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			out_expns_nm(value);
			return;
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			inpt_expns_nm(value);
			return;
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			ss_expns_nm(value);
			return;
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			prov_expns_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($trd_ratio_flg.equalsIgnoreCase(name)) {
			trd_ratio_flg(value);
			return;
		}
		if ($stop_slip_flg.equalsIgnoreCase(name)) {
			stop_slip_flg(value);
			return;
		}
		if ($non_prod_flg.equalsIgnoreCase(name)) {
			non_prod_flg(value);
			return;
		}
		if ($oper_sum_flg.equalsIgnoreCase(name)) {
			oper_sum_flg(value);
			return;
		}
		if ($non_sls_flg.equalsIgnoreCase(name)) {
			non_sls_flg(value);
			return;
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			asst_flg(value);
			return;
		}
		if ($stk_bp_flg.equalsIgnoreCase(name)) {
			stk_bp_flg(value);
			return;
		}
		if ($non_transit_flg.equalsIgnoreCase(name)) {
			non_transit_flg(value);
			return;
		}
		if ($wg_non_mov_flg.equalsIgnoreCase(name)) {
			wg_non_mov_flg(value);
			return;
		}
		if ($lot_non_mov_flg.equalsIgnoreCase(name)) {
			lot_non_mov_flg(value);
			return;
		}
		if ($sublot_non_mov_flg.equalsIgnoreCase(name)) {
			sublot_non_mov_flg(value);
			return;
		}
		if ($sno1_non_mov_flg.equalsIgnoreCase(name)) {
			sno1_non_mov_flg(value);
			return;
		}
		if ($sno2_non_mov_flg.equalsIgnoreCase(name)) {
			sno2_non_mov_flg(value);
			return;
		}
		if ($sno3_non_mov_flg.equalsIgnoreCase(name)) {
			sno3_non_mov_flg(value);
			return;
		}
		if ($sno4_non_mov_flg.equalsIgnoreCase(name)) {
			sno4_non_mov_flg(value);
			return;
		}
		if ($chk_mst_flg.equalsIgnoreCase(name)) {
			chk_mst_flg(value);
			return;
		}
		if ($stktk_sum_flg.equalsIgnoreCase(name)) {
			stktk_sum_flg(value);
			return;
		}
		if ($oth_ccn_sum_flg.equalsIgnoreCase(name)) {
			oth_ccn_sum_flg(value);
			return;
		}
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			excel_pln_flg(value);
			return;
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			excel_act_flg(value);
			return;
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			excel_alc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			diff_use_typ(value);
			return;
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			def_calc_ctg_cd(value);
			return;
		}
		if ($fix_dpt_cd.equalsIgnoreCase(name)) {
			fix_dpt_cd(value);
			return;
		}
		if ($lot_use_typ.equalsIgnoreCase(name)) {
			lot_use_typ(value);
			return;
		}
		if ($sublot_use_typ.equalsIgnoreCase(name)) {
			sublot_use_typ(value);
			return;
		}
		if ($sno1_use_typ.equalsIgnoreCase(name)) {
			sno1_use_typ(value);
			return;
		}
		if ($sno2_use_typ.equalsIgnoreCase(name)) {
			sno2_use_typ(value);
			return;
		}
		if ($sno3_use_typ.equalsIgnoreCase(name)) {
			sno3_use_typ(value);
			return;
		}
		if ($sno4_use_typ.equalsIgnoreCase(name)) {
			sno4_use_typ(value);
			return;
		}
		if ($tmp_dpt_cd.equalsIgnoreCase(name)) {
			tmp_dpt_cd(value);
			return;
		}
		if ($act_trd_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_trd_calc_ctg_cd(value);
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
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			mrgn_expns_nm(value);
			return;
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			purc_expns_nm(value);
			return;
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			out_expns_nm(value);
			return;
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			inpt_expns_nm(value);
			return;
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			ss_expns_nm(value);
			return;
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			prov_expns_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($trd_ratio_flg.equalsIgnoreCase(name)) {
			trd_ratio_flg(value);
			return;
		}
		if ($stop_slip_flg.equalsIgnoreCase(name)) {
			stop_slip_flg(value);
			return;
		}
		if ($non_prod_flg.equalsIgnoreCase(name)) {
			non_prod_flg(value);
			return;
		}
		if ($oper_sum_flg.equalsIgnoreCase(name)) {
			oper_sum_flg(value);
			return;
		}
		if ($non_sls_flg.equalsIgnoreCase(name)) {
			non_sls_flg(value);
			return;
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			asst_flg(value);
			return;
		}
		if ($stk_bp_flg.equalsIgnoreCase(name)) {
			stk_bp_flg(value);
			return;
		}
		if ($non_transit_flg.equalsIgnoreCase(name)) {
			non_transit_flg(value);
			return;
		}
		if ($wg_non_mov_flg.equalsIgnoreCase(name)) {
			wg_non_mov_flg(value);
			return;
		}
		if ($lot_non_mov_flg.equalsIgnoreCase(name)) {
			lot_non_mov_flg(value);
			return;
		}
		if ($sublot_non_mov_flg.equalsIgnoreCase(name)) {
			sublot_non_mov_flg(value);
			return;
		}
		if ($sno1_non_mov_flg.equalsIgnoreCase(name)) {
			sno1_non_mov_flg(value);
			return;
		}
		if ($sno2_non_mov_flg.equalsIgnoreCase(name)) {
			sno2_non_mov_flg(value);
			return;
		}
		if ($sno3_non_mov_flg.equalsIgnoreCase(name)) {
			sno3_non_mov_flg(value);
			return;
		}
		if ($sno4_non_mov_flg.equalsIgnoreCase(name)) {
			sno4_non_mov_flg(value);
			return;
		}
		if ($chk_mst_flg.equalsIgnoreCase(name)) {
			chk_mst_flg(value);
			return;
		}
		if ($stktk_sum_flg.equalsIgnoreCase(name)) {
			stktk_sum_flg(value);
			return;
		}
		if ($oth_ccn_sum_flg.equalsIgnoreCase(name)) {
			oth_ccn_sum_flg(value);
			return;
		}
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			excel_pln_flg(value);
			return;
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			excel_act_flg(value);
			return;
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			excel_alc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
