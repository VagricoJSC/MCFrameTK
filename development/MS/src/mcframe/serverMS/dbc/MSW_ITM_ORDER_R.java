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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "品目オーダ情報ワーク // Item order info. work"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>peg_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>紐付けＮＯ</td>
 *  	<td>Pegging No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目オーダＮＯ</td>
 *  	<td>Item order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_ord_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>オーダ区分</td>
 *  	<td>Order type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ord_gnrt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>オーダ生成区分</td>
 *  	<td>Order generation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
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
 *  	<td>strg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納場所ＣＤ</td>
 *  	<td>Storage location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所ＣＤ</td>
 *  	<td>Mfg. location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mst_mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>マスタ製造場所ＣＤ</td>
 *  	<td>Master mfg. location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼先場所ＣＤ</td>
 *  	<td>Requested location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼先ＷＧ ＣＤ</td>
 *  	<td>Requested WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bom_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>構成パタン</td>
 *  	<td>BOM pattern</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程パタン</td>
 *  	<td>Operation pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図予定数量</td>
 *  	<td>Order scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高予定数量</td>
 *  	<td>Output scheduled qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>未指図数量</td>
 *  	<td>Unordered qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_unit_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図単位区分</td>
 *  	<td>Mfg. order unit type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_yield_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高予定数量（指図・発注）</td>
 *  	<td>Output scheduled qty. (Order/PO)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高実績数量（入荷・出来高）</td>
 *  	<td>Output result qty. (Receipt/output)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入実績数量</td>
 *  	<td>Purchase result qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査実績数量</td>
 *  	<td>Inspection result qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>nmr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>歩留分子</td>
 *  	<td>Yield numerator</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dnm_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>歩留分母</td>
 *  	<td>Yield denominator</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fxd_yield_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定歩留数量</td>
 *  	<td>Constant yield qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_ord_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目オーダ状況区分</td>
 *  	<td>Item order status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>確定日</td>
 *  	<td>Firm date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>blk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>まとめＦＬＧ</td>
 *  	<td>Aggregation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注予定日</td>
 *  	<td>Scheduled PO date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_po_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注予定日（ＭＲＰ）</td>
 *  	<td>Scheduled PO date (MRP)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注日</td>
 *  	<td>PO date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購入ＬＴ</td>
 *  	<td>Purchase LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造着手予定日</td>
 *  	<td>Scheduled mfg. start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_mfg_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造着手予定日（ＭＲＰ）</td>
 *  	<td>Scheduled mfg. start date (MRP)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_mfg_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造着手予定日（指図）</td>
 *  	<td>Scheduled mfg. start date (Order)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_st_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造着手実績日</td>
 *  	<td>Actual mfg. start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造終了予定日</td>
 *  	<td>Scheduled mfg. end date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_mfg_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造終了予定日（ＭＲＰ）</td>
 *  	<td>Scheduled mfg. end date (MRP)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_mfg_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造終了予定日（指図）</td>
 *  	<td>Scheduled mfg. end date (Order)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_end_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造終了実績日</td>
 *  	<td>Actual mfg. end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造ＬＴ</td>
 *  	<td>Mfg. LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫予定日</td>
 *  	<td>Scheduled GI date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_gi_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫予定日（ＭＲＰ）</td>
 *  	<td>Scheduled GI date (MRP)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_gi_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫予定日（指図）</td>
 *  	<td>Scheduled GI date (Order)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫実績日</td>
 *  	<td>Actual GI date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>strg_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納完了予定日</td>
 *  	<td>Scheduled storage completion date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_strg_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納完了予定日（ＭＲＰ）</td>
 *  	<td>Scheduled storage completion date (MRP)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_strg_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納完了予定日（指図・発注）</td>
 *  	<td>Scheduled storage completion date (Order/PO)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>strg_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納完了実績日</td>
 *  	<td>Actual storage completion date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>移動ＬＴ</td>
 *  	<td>Movement LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>accpt_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収予定日</td>
 *  	<td>Scheduled acceptance date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_accpt_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収予定日（ＭＲＰ）</td>
 *  	<td>Scheduled acceptance date (MRP)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_accpt_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収予定日（発注）</td>
 *  	<td>Scheduled acceptance date (PO)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>accpt_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収実績日</td>
 *  	<td>Actual acceptance date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>accpt_insp_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収ＬＴ</td>
 *  	<td>Acceptance LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査着手予定日</td>
 *  	<td>Scheduled inspection start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_insp_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査着手予定日（ＭＲＰ）</td>
 *  	<td>Scheduled inspection start date (MRP)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_insp_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査着手予定日（指図・発注）</td>
 *  	<td>Scheduled inspection start date (Order/PO)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_st_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査着手実績日</td>
 *  	<td>Actual inspection start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査終了予定日</td>
 *  	<td>Scheduled inspection end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_insp_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査終了予定日（ＭＲＰ）</td>
 *  	<td>Scheduled inspection end date (MRP)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_insp_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査終了予定日（指図・発注）</td>
 *  	<td>Scheduled inspection end date (Order/PO)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_end_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査終了実績日</td>
 *  	<td>Actual inspection end date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査ＬＴ</td>
 *  	<td>Inspection LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_offst</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査オフセット</td>
 *  	<td>Inspection offset</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_avl_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>使用可能予定日（ＭＲＰ）</td>
 *  	<td>Available date (MRP)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>avl_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>使用可能予定日</td>
 *  	<td>Available date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>master_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>マスタ適用日</td>
 *  	<td>Master application date</td>
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
 *  	<td>sno_typ1</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１区分</td>
 *  	<td>SEIBAN No. 1 type</td>
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
 *  	<td>sno_typ2</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２区分</td>
 *  	<td>SEIBAN No. 2 type</td>
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
 *  	<td>sno_typ3</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３区分</td>
 *  	<td>SEIBAN No. 3 type</td>
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
 *  	<td>sno_typ4</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４区分</td>
 *  	<td>SEIBAN No. 4 type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lmt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期限切れ日</td>
 *  	<td>Expired date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>WG ＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配不許可ＦＬＧ</td>
 *  	<td>Disallow procurement flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ord_fix_pd</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>オーダ自動確定期間（日）</td>
 *  	<td>Order auto-firming period (Date)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqmt_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>所要ＮＯ</td>
 *  	<td>Requirements No.</td>
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
 *  	<td>intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考</td>
 *  	<td>Internal remarks</td>
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
 *  	<td>dec_place</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位小数部有効桁数</td>
 *  	<td>Base unit number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループＣＤ</td>
 *  	<td>Distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＣＤ</td>
 *  	<td>Delivery destination cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_ITM_ORDER_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_ITM_ORDER";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	private static final MCPermColumnInfo _peg_no = createColumnInfo("peg_no");
	public final MCNumberPermColumn peg_no = createNumberColumn(_peg_no);
	
	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	private static final MCPermColumnInfo _itm_ord_no = createColumnInfo("itm_ord_no");
	public final MCStringPermColumn itm_ord_no = createStringColumn(_itm_ord_no);
	
	/**
	 * オーダ区分. Order type.<p>
	 *
	 */
	public static final String $itm_ord_typ = "itm_ord_typ";
	private static final MCPermColumnInfo _itm_ord_typ = createColumnInfo("itm_ord_typ");
	public final MCStringPermColumn itm_ord_typ = createStringColumn(_itm_ord_typ);
	
	/**
	 * オーダ生成区分. Order generation type.<p>
	 *
	 */
	public static final String $ord_gnrt_typ = "ord_gnrt_typ";
	private static final MCPermColumnInfo _ord_gnrt_typ = createColumnInfo("ord_gnrt_typ");
	public final MCStringPermColumn ord_gnrt_typ = createStringColumn(_ord_gnrt_typ);
	
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
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	private static final MCPermColumnInfo _strg_loc_cd = createColumnInfo("strg_loc_cd");
	public final MCStringPermColumn strg_loc_cd = createStringColumn(_strg_loc_cd);
	
	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	private static final MCPermColumnInfo _mfg_loc_cd = createColumnInfo("mfg_loc_cd");
	public final MCStringPermColumn mfg_loc_cd = createStringColumn(_mfg_loc_cd);
	
	/**
	 * マスタ製造場所ＣＤ. Master mfg. location cd..<p>
	 *
	 */
	public static final String $mst_mfg_loc_cd = "mst_mfg_loc_cd";
	private static final MCPermColumnInfo _mst_mfg_loc_cd = createColumnInfo("mst_mfg_loc_cd");
	public final MCStringPermColumn mst_mfg_loc_cd = createStringColumn(_mst_mfg_loc_cd);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	private static final MCPermColumnInfo _maker_cd = createColumnInfo("maker_cd");
	public final MCStringPermColumn maker_cd = createStringColumn(_maker_cd);
	
	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	private static final MCPermColumnInfo _rqst_loc_cd = createColumnInfo("rqst_loc_cd");
	public final MCStringPermColumn rqst_loc_cd = createStringColumn(_rqst_loc_cd);
	
	/**
	 * 依頼先ＷＧ ＣＤ. Requested WG cd..<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	private static final MCPermColumnInfo _rqst_wg_cd = createColumnInfo("rqst_wg_cd");
	public final MCStringPermColumn rqst_wg_cd = createStringColumn(_rqst_wg_cd);
	
	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	private static final MCPermColumnInfo _bom_ptn = createColumnInfo("bom_ptn");
	public final MCStringPermColumn bom_ptn = createStringColumn(_bom_ptn);
	
	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	private static final MCPermColumnInfo _oper_ptn = createColumnInfo("oper_ptn");
	public final MCStringPermColumn oper_ptn = createStringColumn(_oper_ptn);
	
	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public static final String $inst_qty = "inst_qty";
	private static final MCPermColumnInfo _inst_qty = createColumnInfo("inst_qty");
	public final MCNumberPermColumn inst_qty = createNumberColumn(_inst_qty);
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public static final String $yield_schd_qty = "yield_schd_qty";
	private static final MCPermColumnInfo _yield_schd_qty = createColumnInfo("yield_schd_qty");
	public final MCNumberPermColumn yield_schd_qty = createNumberColumn(_yield_schd_qty);
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public static final String $not_inst_qty = "not_inst_qty";
	private static final MCPermColumnInfo _not_inst_qty = createColumnInfo("not_inst_qty");
	public final MCNumberPermColumn not_inst_qty = createNumberColumn(_not_inst_qty);
	
	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	private static final MCPermColumnInfo _mfg_inst_unit_typ = createColumnInfo("mfg_inst_unit_typ");
	public final MCStringPermColumn mfg_inst_unit_typ = createStringColumn(_mfg_inst_unit_typ);
	
	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public static final String $inst_yield_schd_qty = "inst_yield_schd_qty";
	private static final MCPermColumnInfo _inst_yield_schd_qty = createColumnInfo("inst_yield_schd_qty");
	public final MCNumberPermColumn inst_yield_schd_qty = createNumberColumn(_inst_yield_schd_qty);
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public static final String $yield_act_qty = "yield_act_qty";
	private static final MCPermColumnInfo _yield_act_qty = createColumnInfo("yield_act_qty");
	public final MCNumberPermColumn yield_act_qty = createNumberColumn(_yield_act_qty);
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public static final String $purc_act_qty = "purc_act_qty";
	private static final MCPermColumnInfo _purc_act_qty = createColumnInfo("purc_act_qty");
	public final MCNumberPermColumn purc_act_qty = createNumberColumn(_purc_act_qty);
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public static final String $insp_act_qty = "insp_act_qty";
	private static final MCPermColumnInfo _insp_act_qty = createColumnInfo("insp_act_qty");
	public final MCNumberPermColumn insp_act_qty = createNumberColumn(_insp_act_qty);
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public static final String $nmr_qty = "nmr_qty";
	private static final MCPermColumnInfo _nmr_qty = createColumnInfo("nmr_qty");
	public final MCNumberPermColumn nmr_qty = createNumberColumn(_nmr_qty);
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public static final String $dnm_qty = "dnm_qty";
	private static final MCPermColumnInfo _dnm_qty = createColumnInfo("dnm_qty");
	public final MCNumberPermColumn dnm_qty = createNumberColumn(_dnm_qty);
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public static final String $fxd_yield_qty = "fxd_yield_qty";
	private static final MCPermColumnInfo _fxd_yield_qty = createColumnInfo("fxd_yield_qty");
	public final MCNumberPermColumn fxd_yield_qty = createNumberColumn(_fxd_yield_qty);
	
	/**
	 * 品目オーダ状況区分. Item order status type.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ = "itm_ord_sts_typ";
	private static final MCPermColumnInfo _itm_ord_sts_typ = createColumnInfo("itm_ord_sts_typ");
	public final MCStringPermColumn itm_ord_sts_typ = createStringColumn(_itm_ord_sts_typ);
	
	/**
	 * 確定日. Firm date.<p>
	 *
	 */
	public static final String $fix_dt = "fix_dt";
	private static final MCPermColumnInfo _fix_dt = createColumnInfo("fix_dt");
	public final MCDatePermColumn fix_dt = createDateColumn(_fix_dt);
	
	/**
	 * まとめＦＬＧ. Aggregation flg..<p>
	 *
	 */
	public static final String $blk_flg = "blk_flg";
	private static final MCPermColumnInfo _blk_flg = createColumnInfo("blk_flg");
	public final MCBooleanPermColumn blk_flg = createBooleanColumn(_blk_flg);
	
	/**
	 * 発注予定日. Scheduled PO date.<p>
	 *
	 */
	public static final String $po_schd_dt = "po_schd_dt";
	private static final MCPermColumnInfo _po_schd_dt = createColumnInfo("po_schd_dt");
	public final MCDatePermColumn po_schd_dt = createDateColumn(_po_schd_dt);
	
	/**
	 * 発注予定日（ＭＲＰ）. Scheduled PO date (MRP).<p>
	 *
	 */
	public static final String $mrp_po_schd_dt = "mrp_po_schd_dt";
	private static final MCPermColumnInfo _mrp_po_schd_dt = createColumnInfo("mrp_po_schd_dt");
	public final MCDatePermColumn mrp_po_schd_dt = createDateColumn(_mrp_po_schd_dt);
	
	/**
	 * 発注日. PO date.<p>
	 *
	 */
	public static final String $po_dt = "po_dt";
	private static final MCPermColumnInfo _po_dt = createColumnInfo("po_dt");
	public final MCDatePermColumn po_dt = createDateColumn(_po_dt);
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
	private static final MCPermColumnInfo _purc_lt = createColumnInfo("purc_lt");
	public final MCNumberPermColumn purc_lt = createNumberColumn(_purc_lt);
	
	/**
	 * 製造着手予定日. Scheduled mfg. start date.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt = "mfg_st_schd_dt";
	private static final MCPermColumnInfo _mfg_st_schd_dt = createColumnInfo("mfg_st_schd_dt");
	public final MCDatePermColumn mfg_st_schd_dt = createDateColumn(_mfg_st_schd_dt);
	
	/**
	 * 製造着手予定日（ＭＲＰ）. Scheduled mfg. start date (MRP).<p>
	 *
	 */
	public static final String $mrp_mfg_st_schd_dt = "mrp_mfg_st_schd_dt";
	private static final MCPermColumnInfo _mrp_mfg_st_schd_dt = createColumnInfo("mrp_mfg_st_schd_dt");
	public final MCDatePermColumn mrp_mfg_st_schd_dt = createDateColumn(_mrp_mfg_st_schd_dt);
	
	/**
	 * 製造着手予定日（指図）. Scheduled mfg. start date (Order).<p>
	 *
	 */
	public static final String $inst_mfg_st_schd_dt = "inst_mfg_st_schd_dt";
	private static final MCPermColumnInfo _inst_mfg_st_schd_dt = createColumnInfo("inst_mfg_st_schd_dt");
	public final MCDatePermColumn inst_mfg_st_schd_dt = createDateColumn(_inst_mfg_st_schd_dt);
	
	/**
	 * 製造着手実績日. Actual mfg. start date.<p>
	 *
	 */
	public static final String $mfg_st_act_dt = "mfg_st_act_dt";
	private static final MCPermColumnInfo _mfg_st_act_dt = createColumnInfo("mfg_st_act_dt");
	public final MCDatePermColumn mfg_st_act_dt = createDateColumn(_mfg_st_act_dt);
	
	/**
	 * 製造終了予定日. Scheduled mfg. end date.<p>
	 *
	 */
	public static final String $mfg_end_schd_dt = "mfg_end_schd_dt";
	private static final MCPermColumnInfo _mfg_end_schd_dt = createColumnInfo("mfg_end_schd_dt");
	public final MCDatePermColumn mfg_end_schd_dt = createDateColumn(_mfg_end_schd_dt);
	
	/**
	 * 製造終了予定日（ＭＲＰ）. Scheduled mfg. end date (MRP).<p>
	 *
	 */
	public static final String $mrp_mfg_end_schd_dt = "mrp_mfg_end_schd_dt";
	private static final MCPermColumnInfo _mrp_mfg_end_schd_dt = createColumnInfo("mrp_mfg_end_schd_dt");
	public final MCDatePermColumn mrp_mfg_end_schd_dt = createDateColumn(_mrp_mfg_end_schd_dt);
	
	/**
	 * 製造終了予定日（指図）. Scheduled mfg. end date (Order).<p>
	 *
	 */
	public static final String $inst_mfg_end_schd_dt = "inst_mfg_end_schd_dt";
	private static final MCPermColumnInfo _inst_mfg_end_schd_dt = createColumnInfo("inst_mfg_end_schd_dt");
	public final MCDatePermColumn inst_mfg_end_schd_dt = createDateColumn(_inst_mfg_end_schd_dt);
	
	/**
	 * 製造終了実績日. Actual mfg. end date.<p>
	 *
	 */
	public static final String $mfg_end_act_dt = "mfg_end_act_dt";
	private static final MCPermColumnInfo _mfg_end_act_dt = createColumnInfo("mfg_end_act_dt");
	public final MCDatePermColumn mfg_end_act_dt = createDateColumn(_mfg_end_act_dt);
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public static final String $mfg_lt = "mfg_lt";
	private static final MCPermColumnInfo _mfg_lt = createColumnInfo("mfg_lt");
	public final MCNumberPermColumn mfg_lt = createNumberColumn(_mfg_lt);
	
	/**
	 * 出庫予定日. Scheduled GI date.<p>
	 *
	 */
	public static final String $gi_schd_dt = "gi_schd_dt";
	private static final MCPermColumnInfo _gi_schd_dt = createColumnInfo("gi_schd_dt");
	public final MCDatePermColumn gi_schd_dt = createDateColumn(_gi_schd_dt);
	
	/**
	 * 出庫予定日（ＭＲＰ）. Scheduled GI date (MRP).<p>
	 *
	 */
	public static final String $mrp_gi_schd_dt = "mrp_gi_schd_dt";
	private static final MCPermColumnInfo _mrp_gi_schd_dt = createColumnInfo("mrp_gi_schd_dt");
	public final MCDatePermColumn mrp_gi_schd_dt = createDateColumn(_mrp_gi_schd_dt);
	
	/**
	 * 出庫予定日（指図）. Scheduled GI date (Order).<p>
	 *
	 */
	public static final String $inst_gi_schd_dt = "inst_gi_schd_dt";
	private static final MCPermColumnInfo _inst_gi_schd_dt = createColumnInfo("inst_gi_schd_dt");
	public final MCDatePermColumn inst_gi_schd_dt = createDateColumn(_inst_gi_schd_dt);
	
	/**
	 * 出庫実績日. Actual GI date.<p>
	 *
	 */
	public static final String $gi_act_dt = "gi_act_dt";
	private static final MCPermColumnInfo _gi_act_dt = createColumnInfo("gi_act_dt");
	public final MCDatePermColumn gi_act_dt = createDateColumn(_gi_act_dt);
	
	/**
	 * 格納完了予定日. Scheduled storage completion date.<p>
	 *
	 */
	public static final String $strg_schd_dt = "strg_schd_dt";
	private static final MCPermColumnInfo _strg_schd_dt = createColumnInfo("strg_schd_dt");
	public final MCDatePermColumn strg_schd_dt = createDateColumn(_strg_schd_dt);
	
	/**
	 * 格納完了予定日（ＭＲＰ）. Scheduled storage completion date (MRP).<p>
	 *
	 */
	public static final String $mrp_strg_schd_dt = "mrp_strg_schd_dt";
	private static final MCPermColumnInfo _mrp_strg_schd_dt = createColumnInfo("mrp_strg_schd_dt");
	public final MCDatePermColumn mrp_strg_schd_dt = createDateColumn(_mrp_strg_schd_dt);
	
	/**
	 * 格納完了予定日（指図・発注）. Scheduled storage completion date (Order/PO).<p>
	 *
	 */
	public static final String $inst_strg_schd_dt = "inst_strg_schd_dt";
	private static final MCPermColumnInfo _inst_strg_schd_dt = createColumnInfo("inst_strg_schd_dt");
	public final MCDatePermColumn inst_strg_schd_dt = createDateColumn(_inst_strg_schd_dt);
	
	/**
	 * 格納完了実績日. Actual storage completion date.<p>
	 *
	 */
	public static final String $strg_act_dt = "strg_act_dt";
	private static final MCPermColumnInfo _strg_act_dt = createColumnInfo("strg_act_dt");
	public final MCDatePermColumn strg_act_dt = createDateColumn(_strg_act_dt);
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	private static final MCPermColumnInfo _xfr_lt = createColumnInfo("xfr_lt");
	public final MCNumberPermColumn xfr_lt = createNumberColumn(_xfr_lt);
	
	/**
	 * 検収予定日. Scheduled acceptance date.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	private static final MCPermColumnInfo _accpt_schd_dt = createColumnInfo("accpt_schd_dt");
	public final MCDatePermColumn accpt_schd_dt = createDateColumn(_accpt_schd_dt);
	
	/**
	 * 検収予定日（ＭＲＰ）. Scheduled acceptance date (MRP).<p>
	 *
	 */
	public static final String $mrp_accpt_schd_dt = "mrp_accpt_schd_dt";
	private static final MCPermColumnInfo _mrp_accpt_schd_dt = createColumnInfo("mrp_accpt_schd_dt");
	public final MCDatePermColumn mrp_accpt_schd_dt = createDateColumn(_mrp_accpt_schd_dt);
	
	/**
	 * 検収予定日（発注）. Scheduled acceptance date (PO).<p>
	 *
	 */
	public static final String $inst_accpt_schd_dt = "inst_accpt_schd_dt";
	private static final MCPermColumnInfo _inst_accpt_schd_dt = createColumnInfo("inst_accpt_schd_dt");
	public final MCDatePermColumn inst_accpt_schd_dt = createDateColumn(_inst_accpt_schd_dt);
	
	/**
	 * 検収実績日. Actual acceptance date.<p>
	 *
	 */
	public static final String $accpt_act_dt = "accpt_act_dt";
	private static final MCPermColumnInfo _accpt_act_dt = createColumnInfo("accpt_act_dt");
	public final MCDatePermColumn accpt_act_dt = createDateColumn(_accpt_act_dt);
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public static final String $accpt_insp_lt = "accpt_insp_lt";
	private static final MCPermColumnInfo _accpt_insp_lt = createColumnInfo("accpt_insp_lt");
	public final MCNumberPermColumn accpt_insp_lt = createNumberColumn(_accpt_insp_lt);
	
	/**
	 * 検査着手予定日. Scheduled inspection start date.<p>
	 *
	 */
	public static final String $insp_st_schd_dt = "insp_st_schd_dt";
	private static final MCPermColumnInfo _insp_st_schd_dt = createColumnInfo("insp_st_schd_dt");
	public final MCDatePermColumn insp_st_schd_dt = createDateColumn(_insp_st_schd_dt);
	
	/**
	 * 検査着手予定日（ＭＲＰ）. Scheduled inspection start date (MRP).<p>
	 *
	 */
	public static final String $mrp_insp_st_schd_dt = "mrp_insp_st_schd_dt";
	private static final MCPermColumnInfo _mrp_insp_st_schd_dt = createColumnInfo("mrp_insp_st_schd_dt");
	public final MCDatePermColumn mrp_insp_st_schd_dt = createDateColumn(_mrp_insp_st_schd_dt);
	
	/**
	 * 検査着手予定日（指図・発注）. Scheduled inspection start date (Order/PO).<p>
	 *
	 */
	public static final String $inst_insp_st_schd_dt = "inst_insp_st_schd_dt";
	private static final MCPermColumnInfo _inst_insp_st_schd_dt = createColumnInfo("inst_insp_st_schd_dt");
	public final MCDatePermColumn inst_insp_st_schd_dt = createDateColumn(_inst_insp_st_schd_dt);
	
	/**
	 * 検査着手実績日. Actual inspection start date.<p>
	 *
	 */
	public static final String $insp_st_act_dt = "insp_st_act_dt";
	private static final MCPermColumnInfo _insp_st_act_dt = createColumnInfo("insp_st_act_dt");
	public final MCDatePermColumn insp_st_act_dt = createDateColumn(_insp_st_act_dt);
	
	/**
	 * 検査終了予定日. Scheduled inspection end date.<p>
	 *
	 */
	public static final String $insp_end_schd_dt = "insp_end_schd_dt";
	private static final MCPermColumnInfo _insp_end_schd_dt = createColumnInfo("insp_end_schd_dt");
	public final MCDatePermColumn insp_end_schd_dt = createDateColumn(_insp_end_schd_dt);
	
	/**
	 * 検査終了予定日（ＭＲＰ）. Scheduled inspection end date (MRP).<p>
	 *
	 */
	public static final String $mrp_insp_end_schd_dt = "mrp_insp_end_schd_dt";
	private static final MCPermColumnInfo _mrp_insp_end_schd_dt = createColumnInfo("mrp_insp_end_schd_dt");
	public final MCDatePermColumn mrp_insp_end_schd_dt = createDateColumn(_mrp_insp_end_schd_dt);
	
	/**
	 * 検査終了予定日（指図・発注）. Scheduled inspection end date (Order/PO).<p>
	 *
	 */
	public static final String $inst_insp_end_schd_dt = "inst_insp_end_schd_dt";
	private static final MCPermColumnInfo _inst_insp_end_schd_dt = createColumnInfo("inst_insp_end_schd_dt");
	public final MCDatePermColumn inst_insp_end_schd_dt = createDateColumn(_inst_insp_end_schd_dt);
	
	/**
	 * 検査終了実績日. Actual inspection end date.<p>
	 *
	 */
	public static final String $insp_end_act_dt = "insp_end_act_dt";
	private static final MCPermColumnInfo _insp_end_act_dt = createColumnInfo("insp_end_act_dt");
	public final MCDatePermColumn insp_end_act_dt = createDateColumn(_insp_end_act_dt);
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public static final String $insp_lt = "insp_lt";
	private static final MCPermColumnInfo _insp_lt = createColumnInfo("insp_lt");
	public final MCNumberPermColumn insp_lt = createNumberColumn(_insp_lt);
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public static final String $insp_offst = "insp_offst";
	private static final MCPermColumnInfo _insp_offst = createColumnInfo("insp_offst");
	public final MCNumberPermColumn insp_offst = createNumberColumn(_insp_offst);
	
	/**
	 * 使用可能予定日（ＭＲＰ）. Available date (MRP).<p>
	 *
	 */
	public static final String $mrp_avl_schd_dt = "mrp_avl_schd_dt";
	private static final MCPermColumnInfo _mrp_avl_schd_dt = createColumnInfo("mrp_avl_schd_dt");
	public final MCDatePermColumn mrp_avl_schd_dt = createDateColumn(_mrp_avl_schd_dt);
	
	/**
	 * 使用可能予定日. Available date.<p>
	 *
	 */
	public static final String $avl_schd_dt = "avl_schd_dt";
	private static final MCPermColumnInfo _avl_schd_dt = createColumnInfo("avl_schd_dt");
	public final MCDatePermColumn avl_schd_dt = createDateColumn(_avl_schd_dt);
	
	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	private static final MCPermColumnInfo _master_dt = createColumnInfo("master_dt");
	public final MCDatePermColumn master_dt = createDateColumn(_master_dt);
	
	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	private static final MCPermColumnInfo _sno1 = createColumnInfo("sno1");
	public final MCStringPermColumn sno1 = createStringColumn(_sno1);
	
	/**
	 * 手配ＮＯ１区分. SEIBAN No. 1 type.<p>
	 *
	 */
	public static final String $sno_typ1 = "sno_typ1";
	private static final MCPermColumnInfo _sno_typ1 = createColumnInfo("sno_typ1");
	public final MCStringPermColumn sno_typ1 = createStringColumn(_sno_typ1);
	
	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	private static final MCPermColumnInfo _sno2 = createColumnInfo("sno2");
	public final MCStringPermColumn sno2 = createStringColumn(_sno2);
	
	/**
	 * 手配ＮＯ２区分. SEIBAN No. 2 type.<p>
	 *
	 */
	public static final String $sno_typ2 = "sno_typ2";
	private static final MCPermColumnInfo _sno_typ2 = createColumnInfo("sno_typ2");
	public final MCStringPermColumn sno_typ2 = createStringColumn(_sno_typ2);
	
	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	private static final MCPermColumnInfo _sno3 = createColumnInfo("sno3");
	public final MCStringPermColumn sno3 = createStringColumn(_sno3);
	
	/**
	 * 手配ＮＯ３区分. SEIBAN No. 3 type.<p>
	 *
	 */
	public static final String $sno_typ3 = "sno_typ3";
	private static final MCPermColumnInfo _sno_typ3 = createColumnInfo("sno_typ3");
	public final MCStringPermColumn sno_typ3 = createStringColumn(_sno_typ3);
	
	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	private static final MCPermColumnInfo _sno4 = createColumnInfo("sno4");
	public final MCStringPermColumn sno4 = createStringColumn(_sno4);
	
	/**
	 * 手配ＮＯ４区分. SEIBAN No. 4 type.<p>
	 *
	 */
	public static final String $sno_typ4 = "sno_typ4";
	private static final MCPermColumnInfo _sno_typ4 = createColumnInfo("sno_typ4");
	public final MCStringPermColumn sno_typ4 = createStringColumn(_sno_typ4);
	
	/**
	 * 期限切れ日. Expired date.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	private static final MCPermColumnInfo _lmt_dt = createColumnInfo("lmt_dt");
	public final MCDatePermColumn lmt_dt = createDateColumn(_lmt_dt);
	
	/**
	 * WG ＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 手配不許可ＦＬＧ. Disallow procurement flg..<p>
	 *
	 */
	public static final String $not_fix_flg = "not_fix_flg";
	private static final MCPermColumnInfo _not_fix_flg = createColumnInfo("not_fix_flg");
	public final MCBooleanPermColumn not_fix_flg = createBooleanColumn(_not_fix_flg);
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public static final String $ord_fix_pd = "ord_fix_pd";
	private static final MCPermColumnInfo _ord_fix_pd = createColumnInfo("ord_fix_pd");
	public final MCNumberPermColumn ord_fix_pd = createNumberColumn(_ord_fix_pd);
	
	/**
	 * 所要ＮＯ. Requirements No..<p>
	 *
	 */
	public static final String $rqmt_no = "rqmt_no";
	private static final MCPermColumnInfo _rqmt_no = createColumnInfo("rqmt_no");
	public final MCStringPermColumn rqmt_no = createStringColumn(_rqmt_no);
	
	/**
	 * 指図・発注連絡備考. Order/PO contact remarks.<p>
	 *
	 */
	public static final String $inst_po_cnt_rmrks = "inst_po_cnt_rmrks";
	private static final MCPermColumnInfo _inst_po_cnt_rmrks = createColumnInfo("inst_po_cnt_rmrks");
	public final MCStringPermColumn inst_po_cnt_rmrks = createStringColumn(_inst_po_cnt_rmrks);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
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
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	private static final MCPermColumnInfo _dec_place = createColumnInfo("dec_place");
	public final MCNumberPermColumn dec_place = createNumberColumn(_dec_place);
	
	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	private static final MCPermColumnInfo _lg_grp_cd = createColumnInfo("lg_grp_cd");
	public final MCStringPermColumn lg_grp_cd = createStringColumn(_lg_grp_cd);
	
	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	private static final MCPermColumnInfo _dlv_cd = createColumnInfo("dlv_cd");
	public final MCStringPermColumn dlv_cd = createStringColumn(_dlv_cd);
	
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP);
	public static final MCMeta ord_gnrt_typ_META = createCommonMeta($ord_gnrt_typ, mcframe.commonMS.meta.MS_META.ORD_GNRT_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mst_mfg_loc_cd_META = createCommonMeta($mst_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta inst_qty_META = createCommonMeta($inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_schd_qty_META = createCommonMeta($yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta not_inst_qty_META = createCommonMeta($not_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta inst_yield_schd_qty_META = createCommonMeta($inst_yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_act_qty_META = createCommonMeta($yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_act_qty_META = createCommonMeta($purc_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_act_qty_META = createCommonMeta($insp_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta nmr_qty_META = createCommonMeta($nmr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dnm_qty_META = createCommonMeta($dnm_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_yield_qty_META = createCommonMeta($fxd_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta itm_ord_sts_typ_META = createCommonMeta($itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta fix_dt_META = createCommonMeta($fix_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta blk_flg_META = createCommonMeta($blk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_schd_dt_META = createCommonMeta($po_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_po_schd_dt_META = createCommonMeta($mrp_po_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_dt_META = createCommonMeta($po_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_mfg_st_schd_dt_META = createCommonMeta($mrp_mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_mfg_st_schd_dt_META = createCommonMeta($inst_mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_act_dt_META = createCommonMeta($mfg_st_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_META = createCommonMeta($mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_mfg_end_schd_dt_META = createCommonMeta($mrp_mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_mfg_end_schd_dt_META = createCommonMeta($inst_mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_act_dt_META = createCommonMeta($mfg_end_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_gi_schd_dt_META = createCommonMeta($mrp_gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_gi_schd_dt_META = createCommonMeta($inst_gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_act_dt_META = createCommonMeta($gi_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta strg_schd_dt_META = createCommonMeta($strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_strg_schd_dt_META = createCommonMeta($mrp_strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_strg_schd_dt_META = createCommonMeta($inst_strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta strg_act_dt_META = createCommonMeta($strg_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_accpt_schd_dt_META = createCommonMeta($mrp_accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_accpt_schd_dt_META = createCommonMeta($inst_accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_act_dt_META = createCommonMeta($accpt_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_st_schd_dt_META = createCommonMeta($insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_insp_st_schd_dt_META = createCommonMeta($mrp_insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_insp_st_schd_dt_META = createCommonMeta($inst_insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_st_act_dt_META = createCommonMeta($insp_st_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_schd_dt_META = createCommonMeta($insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_insp_end_schd_dt_META = createCommonMeta($mrp_insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_insp_end_schd_dt_META = createCommonMeta($inst_insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_act_dt_META = createCommonMeta($insp_end_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta mrp_avl_schd_dt_META = createCommonMeta($mrp_avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_META = createCommonMeta($avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno_typ1_META = createCommonMeta($sno_typ1, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno_typ2_META = createCommonMeta($sno_typ2, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno_typ3_META = createCommonMeta($sno_typ3, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno_typ4_META = createCommonMeta($sno_typ4, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta not_fix_flg_META = createCommonMeta($not_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_fix_pd_META = createCommonMeta($ord_fix_pd, mcframe.commonMA.meta.MA_META.ORD_FIX_PD);
	public static final MCMeta rqmt_no_META = createCommonMeta($rqmt_no, mcframe.commonMA.meta.MA_META.RQMT_NO);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.IORD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR3);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.ORD_FIX_PD);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_ITM_ORDER_R> constMetas = new ConstMetaList<MSW_ITM_ORDER_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			peg_no_META,
			itm_ord_no_META,
			itm_ord_typ_META,
			ord_gnrt_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			strg_loc_cd_META,
			mfg_loc_cd_META,
			mst_mfg_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			rqst_loc_cd_META,
			rqst_wg_cd_META,
			bom_ptn_META,
			oper_ptn_META,
			inst_qty_META,
			yield_schd_qty_META,
			not_inst_qty_META,
			mfg_inst_unit_typ_META,
			inst_yield_schd_qty_META,
			yield_act_qty_META,
			purc_act_qty_META,
			insp_act_qty_META,
			nmr_qty_META,
			dnm_qty_META,
			fxd_yield_qty_META,
			itm_ord_sts_typ_META,
			fix_dt_META,
			blk_flg_META,
			po_schd_dt_META,
			mrp_po_schd_dt_META,
			po_dt_META,
			purc_lt_META,
			mfg_st_schd_dt_META,
			mrp_mfg_st_schd_dt_META,
			inst_mfg_st_schd_dt_META,
			mfg_st_act_dt_META,
			mfg_end_schd_dt_META,
			mrp_mfg_end_schd_dt_META,
			inst_mfg_end_schd_dt_META,
			mfg_end_act_dt_META,
			mfg_lt_META,
			gi_schd_dt_META,
			mrp_gi_schd_dt_META,
			inst_gi_schd_dt_META,
			gi_act_dt_META,
			strg_schd_dt_META,
			mrp_strg_schd_dt_META,
			inst_strg_schd_dt_META,
			strg_act_dt_META,
			xfr_lt_META,
			accpt_schd_dt_META,
			mrp_accpt_schd_dt_META,
			inst_accpt_schd_dt_META,
			accpt_act_dt_META,
			accpt_insp_lt_META,
			insp_st_schd_dt_META,
			mrp_insp_st_schd_dt_META,
			inst_insp_st_schd_dt_META,
			insp_st_act_dt_META,
			insp_end_schd_dt_META,
			mrp_insp_end_schd_dt_META,
			inst_insp_end_schd_dt_META,
			insp_end_act_dt_META,
			insp_lt_META,
			insp_offst_META,
			mrp_avl_schd_dt_META,
			avl_schd_dt_META,
			master_dt_META,
			sno1_META,
			sno_typ1_META,
			sno2_META,
			sno_typ2_META,
			sno3_META,
			sno_typ3_META,
			sno4_META,
			sno_typ4_META,
			lmt_dt_META,
			wg_cd_META,
			not_fix_flg_META,
			ord_fix_pd_META,
			rqmt_no_META,
			inst_po_cnt_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dec_place_META,
			lg_grp_cd_META,
			dlv_cd_META
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
	protected MSW_ITM_ORDER_R(ConstMetaList<? extends MSW_ITM_ORDER_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_ITM_ORDER_R(ConstMetaList<? extends MSW_ITM_ORDER_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$peg_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$peg_no,
				"peg_no",
				peg_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$itm_ord_no,
				"itm_ord_no",
				itm_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$itm_ord_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$itm_ord_typ,
				"itm_ord_typ",
				itm_ord_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$ord_gnrt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$ord_gnrt_typ,
				"ord_gnrt_typ",
				ord_gnrt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$itm_cd,
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
			MSW_ITM_ORDER_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$itm_sub1,
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
			MSW_ITM_ORDER_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$itm_sub2,
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
			MSW_ITM_ORDER_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$itm_sub3,
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
			MSW_ITM_ORDER_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$ver_no,
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
			MSW_ITM_ORDER_R.$strg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$strg_loc_cd,
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
			MSW_ITM_ORDER_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$mfg_loc_cd,
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
			MSW_ITM_ORDER_R.$mst_mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$mst_mfg_loc_cd,
				"mst_mfg_loc_cd",
				mst_mfg_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$maker_cd,
				"maker_cd",
				maker_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$rqst_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$rqst_loc_cd,
				"rqst_loc_cd",
				rqst_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$rqst_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$rqst_wg_cd,
				"rqst_wg_cd",
				rqst_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$bom_ptn,
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
			MSW_ITM_ORDER_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$oper_ptn,
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
			MSW_ITM_ORDER_R.$inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$inst_qty,
				"inst_qty",
				inst_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$yield_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$yield_schd_qty,
				"yield_schd_qty",
				yield_schd_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$not_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$not_inst_qty,
				"not_inst_qty",
				not_inst_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mfg_inst_unit_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$mfg_inst_unit_typ,
				"mfg_inst_unit_typ",
				mfg_inst_unit_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$inst_yield_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$inst_yield_schd_qty,
				"inst_yield_schd_qty",
				inst_yield_schd_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$yield_act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$yield_act_qty,
				"yield_act_qty",
				yield_act_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$purc_act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$purc_act_qty,
				"purc_act_qty",
				purc_act_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$insp_act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$insp_act_qty,
				"insp_act_qty",
				insp_act_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$nmr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$nmr_qty,
				"nmr_qty",
				nmr_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$dnm_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$dnm_qty,
				"dnm_qty",
				dnm_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$fxd_yield_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$fxd_yield_qty,
				"fxd_yield_qty",
				fxd_yield_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$itm_ord_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$itm_ord_sts_typ,
				"itm_ord_sts_typ",
				itm_ord_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$fix_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$fix_dt,
				"fix_dt",
				fix_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$blk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_ITM_ORDER_R.$blk_flg,
				"blk_flg",
				blk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$po_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$po_schd_dt,
				"po_schd_dt",
				po_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mrp_po_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mrp_po_schd_dt,
				"mrp_po_schd_dt",
				mrp_po_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$po_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$po_dt,
				"po_dt",
				po_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$purc_lt,
				"purc_lt",
				purc_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mfg_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mfg_st_schd_dt,
				"mfg_st_schd_dt",
				mfg_st_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mrp_mfg_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mrp_mfg_st_schd_dt,
				"mrp_mfg_st_schd_dt",
				mrp_mfg_st_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$inst_mfg_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$inst_mfg_st_schd_dt,
				"inst_mfg_st_schd_dt",
				inst_mfg_st_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mfg_st_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mfg_st_act_dt,
				"mfg_st_act_dt",
				mfg_st_act_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mfg_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mfg_end_schd_dt,
				"mfg_end_schd_dt",
				mfg_end_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mrp_mfg_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mrp_mfg_end_schd_dt,
				"mrp_mfg_end_schd_dt",
				mrp_mfg_end_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$inst_mfg_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$inst_mfg_end_schd_dt,
				"inst_mfg_end_schd_dt",
				inst_mfg_end_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mfg_end_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mfg_end_act_dt,
				"mfg_end_act_dt",
				mfg_end_act_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mfg_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$mfg_lt,
				"mfg_lt",
				mfg_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$gi_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$gi_schd_dt,
				"gi_schd_dt",
				gi_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mrp_gi_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mrp_gi_schd_dt,
				"mrp_gi_schd_dt",
				mrp_gi_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$inst_gi_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$inst_gi_schd_dt,
				"inst_gi_schd_dt",
				inst_gi_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$gi_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$gi_act_dt,
				"gi_act_dt",
				gi_act_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$strg_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$strg_schd_dt,
				"strg_schd_dt",
				strg_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mrp_strg_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mrp_strg_schd_dt,
				"mrp_strg_schd_dt",
				mrp_strg_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$inst_strg_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$inst_strg_schd_dt,
				"inst_strg_schd_dt",
				inst_strg_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$strg_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$strg_act_dt,
				"strg_act_dt",
				strg_act_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$xfr_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$xfr_lt,
				"xfr_lt",
				xfr_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$accpt_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$accpt_schd_dt,
				"accpt_schd_dt",
				accpt_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mrp_accpt_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mrp_accpt_schd_dt,
				"mrp_accpt_schd_dt",
				mrp_accpt_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$inst_accpt_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$inst_accpt_schd_dt,
				"inst_accpt_schd_dt",
				inst_accpt_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$accpt_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$accpt_act_dt,
				"accpt_act_dt",
				accpt_act_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$accpt_insp_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$accpt_insp_lt,
				"accpt_insp_lt",
				accpt_insp_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$insp_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$insp_st_schd_dt,
				"insp_st_schd_dt",
				insp_st_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mrp_insp_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mrp_insp_st_schd_dt,
				"mrp_insp_st_schd_dt",
				mrp_insp_st_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$inst_insp_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$inst_insp_st_schd_dt,
				"inst_insp_st_schd_dt",
				inst_insp_st_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$insp_st_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$insp_st_act_dt,
				"insp_st_act_dt",
				insp_st_act_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$insp_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$insp_end_schd_dt,
				"insp_end_schd_dt",
				insp_end_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mrp_insp_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mrp_insp_end_schd_dt,
				"mrp_insp_end_schd_dt",
				mrp_insp_end_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$inst_insp_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$inst_insp_end_schd_dt,
				"inst_insp_end_schd_dt",
				inst_insp_end_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$insp_end_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$insp_end_act_dt,
				"insp_end_act_dt",
				insp_end_act_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$insp_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$insp_lt,
				"insp_lt",
				insp_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$insp_offst,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$insp_offst,
				"insp_offst",
				insp_offst,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$mrp_avl_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$mrp_avl_schd_dt,
				"mrp_avl_schd_dt",
				mrp_avl_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$avl_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$avl_schd_dt,
				"avl_schd_dt",
				avl_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$master_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$master_dt,
				"master_dt",
				master_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sno1,
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
			MSW_ITM_ORDER_R.$sno_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sno_typ1,
				"sno_typ1",
				sno_typ1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sno2,
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
			MSW_ITM_ORDER_R.$sno_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sno_typ2,
				"sno_typ2",
				sno_typ2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sno3,
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
			MSW_ITM_ORDER_R.$sno_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sno_typ3,
				"sno_typ3",
				sno_typ3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sno4,
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
			MSW_ITM_ORDER_R.$sno_typ4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sno_typ4,
				"sno_typ4",
				sno_typ4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$lmt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORDER_R.$lmt_dt,
				"lmt_dt",
				lmt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$not_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_ITM_ORDER_R.$not_fix_flg,
				"not_fix_flg",
				not_fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$ord_fix_pd,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$ord_fix_pd,
				"ord_fix_pd",
				ord_fix_pd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$rqmt_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$rqmt_no,
				"rqmt_no",
				rqmt_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$inst_po_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$inst_po_cnt_rmrks,
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
			MSW_ITM_ORDER_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$intr_rmrks,
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
			MSW_ITM_ORDER_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sub_char1,
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
			MSW_ITM_ORDER_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sub_char2,
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
			MSW_ITM_ORDER_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$sub_char3,
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
			MSW_ITM_ORDER_R.$dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORDER_R.$dec_place,
				"dec_place",
				dec_place,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$lg_grp_cd,
				"lg_grp_cd",
				lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORDER_R.$dlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORDER_R.$dlv_cd,
				"dlv_cd",
				dlv_cd,
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
	public static MSW_ITM_ORDER_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_ITM_ORDER_R create(String alias) {
		MSW_ITM_ORDER_R row = new MSW_ITM_ORDER_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_ITM_ORDER_R createByName(T proto) {
		MSW_ITM_ORDER_R row = MSW_ITM_ORDER_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_ITM_ORDER_R clone() {
		return (MSW_ITM_ORDER_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_ITM_ORDER_R createInstance() {
		return (MSW_ITM_ORDER_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_ITM_ORDER_R getValues(String... names) {
		return (MSW_ITM_ORDER_R) super.getValues(names);
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
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 1, $itm_ord_no);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 1, $itm_ord_no, value);
	}

	/**
	 * オーダ区分. Order type.<p>
	 *
	 */
	public String itm_ord_typ() {
		return getConstString(offset + 2, $itm_ord_typ);
	}

	/**
	 * オーダ区分. Order type.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		setConstString(offset + 2, $itm_ord_typ, value);
	}

	/**
	 * オーダ生成区分. Order generation type.<p>
	 *
	 */
	public String ord_gnrt_typ() {
		return getConstString(offset + 3, $ord_gnrt_typ);
	}

	/**
	 * オーダ生成区分. Order generation type.<p>
	 *
	 */
	public void ord_gnrt_typ(String value) {
		setConstString(offset + 3, $ord_gnrt_typ, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 8, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 8, $ver_no, value);
	}

	/**
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 9, $strg_loc_cd);
	}

	/**
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 9, $strg_loc_cd, value);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 10, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 10, $mfg_loc_cd, value);
	}

	/**
	 * マスタ製造場所ＣＤ. Master mfg. location cd..<p>
	 *
	 */
	public String mst_mfg_loc_cd() {
		return getConstString(offset + 11, $mst_mfg_loc_cd);
	}

	/**
	 * マスタ製造場所ＣＤ. Master mfg. location cd..<p>
	 *
	 */
	public void mst_mfg_loc_cd(String value) {
		setConstString(offset + 11, $mst_mfg_loc_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 12, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 12, $sppl_cd, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 13, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 13, $maker_cd, value);
	}

	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 14, $rqst_loc_cd);
	}

	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 14, $rqst_loc_cd, value);
	}

	/**
	 * 依頼先ＷＧ ＣＤ. Requested WG cd..<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 15, $rqst_wg_cd);
	}

	/**
	 * 依頼先ＷＧ ＣＤ. Requested WG cd..<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 15, $rqst_wg_cd, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 16, $bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 16, $bom_ptn, value);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 17, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 17, $oper_ptn, value);
	}

	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public MCNumber inst_qty() {
		return getConstNumber(offset + 18, $inst_qty);
	}

	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		setConstNumber(offset + 18, $inst_qty, value);
	}
	
	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public void inst_qty(int value) {
		setConstNumber(offset + 18, $inst_qty, value);
	}
	
	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public void inst_qty(long value) {
		setConstNumber(offset + 18, $inst_qty, value);
	}
	
	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public void inst_qty(float value) {
		setConstNumber(offset + 18, $inst_qty, value);
	}
	
	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public void inst_qty(double value) {
		setConstNumber(offset + 18, $inst_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return getConstNumber(offset + 19, $yield_schd_qty);
	}

	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 19, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		setConstNumber(offset + 19, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		setConstNumber(offset + 19, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		setConstNumber(offset + 19, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		setConstNumber(offset + 19, $yield_schd_qty, value);
	}
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public MCNumber not_inst_qty() {
		return getConstNumber(offset + 20, $not_inst_qty);
	}

	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public void not_inst_qty(MCNumber value) {
		setConstNumber(offset + 20, $not_inst_qty, value);
	}
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public void not_inst_qty(int value) {
		setConstNumber(offset + 20, $not_inst_qty, value);
	}
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public void not_inst_qty(long value) {
		setConstNumber(offset + 20, $not_inst_qty, value);
	}
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public void not_inst_qty(float value) {
		setConstNumber(offset + 20, $not_inst_qty, value);
	}
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public void not_inst_qty(double value) {
		setConstNumber(offset + 20, $not_inst_qty, value);
	}
	
	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 21, $mfg_inst_unit_typ);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 21, $mfg_inst_unit_typ, value);
	}

	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public MCNumber inst_yield_schd_qty() {
		return getConstNumber(offset + 22, $inst_yield_schd_qty);
	}

	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public void inst_yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 22, $inst_yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public void inst_yield_schd_qty(int value) {
		setConstNumber(offset + 22, $inst_yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public void inst_yield_schd_qty(long value) {
		setConstNumber(offset + 22, $inst_yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public void inst_yield_schd_qty(float value) {
		setConstNumber(offset + 22, $inst_yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public void inst_yield_schd_qty(double value) {
		setConstNumber(offset + 22, $inst_yield_schd_qty, value);
	}
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public MCNumber yield_act_qty() {
		return getConstNumber(offset + 23, $yield_act_qty);
	}

	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public void yield_act_qty(MCNumber value) {
		setConstNumber(offset + 23, $yield_act_qty, value);
	}
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public void yield_act_qty(int value) {
		setConstNumber(offset + 23, $yield_act_qty, value);
	}
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public void yield_act_qty(long value) {
		setConstNumber(offset + 23, $yield_act_qty, value);
	}
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public void yield_act_qty(float value) {
		setConstNumber(offset + 23, $yield_act_qty, value);
	}
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public void yield_act_qty(double value) {
		setConstNumber(offset + 23, $yield_act_qty, value);
	}
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public MCNumber purc_act_qty() {
		return getConstNumber(offset + 24, $purc_act_qty);
	}

	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public void purc_act_qty(MCNumber value) {
		setConstNumber(offset + 24, $purc_act_qty, value);
	}
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public void purc_act_qty(int value) {
		setConstNumber(offset + 24, $purc_act_qty, value);
	}
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public void purc_act_qty(long value) {
		setConstNumber(offset + 24, $purc_act_qty, value);
	}
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public void purc_act_qty(float value) {
		setConstNumber(offset + 24, $purc_act_qty, value);
	}
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public void purc_act_qty(double value) {
		setConstNumber(offset + 24, $purc_act_qty, value);
	}
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public MCNumber insp_act_qty() {
		return getConstNumber(offset + 25, $insp_act_qty);
	}

	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public void insp_act_qty(MCNumber value) {
		setConstNumber(offset + 25, $insp_act_qty, value);
	}
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public void insp_act_qty(int value) {
		setConstNumber(offset + 25, $insp_act_qty, value);
	}
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public void insp_act_qty(long value) {
		setConstNumber(offset + 25, $insp_act_qty, value);
	}
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public void insp_act_qty(float value) {
		setConstNumber(offset + 25, $insp_act_qty, value);
	}
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public void insp_act_qty(double value) {
		setConstNumber(offset + 25, $insp_act_qty, value);
	}
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return getConstNumber(offset + 26, $nmr_qty);
	}

	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		setConstNumber(offset + 26, $nmr_qty, value);
	}
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public void nmr_qty(int value) {
		setConstNumber(offset + 26, $nmr_qty, value);
	}
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public void nmr_qty(long value) {
		setConstNumber(offset + 26, $nmr_qty, value);
	}
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public void nmr_qty(float value) {
		setConstNumber(offset + 26, $nmr_qty, value);
	}
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public void nmr_qty(double value) {
		setConstNumber(offset + 26, $nmr_qty, value);
	}
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return getConstNumber(offset + 27, $dnm_qty);
	}

	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		setConstNumber(offset + 27, $dnm_qty, value);
	}
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public void dnm_qty(int value) {
		setConstNumber(offset + 27, $dnm_qty, value);
	}
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public void dnm_qty(long value) {
		setConstNumber(offset + 27, $dnm_qty, value);
	}
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public void dnm_qty(float value) {
		setConstNumber(offset + 27, $dnm_qty, value);
	}
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public void dnm_qty(double value) {
		setConstNumber(offset + 27, $dnm_qty, value);
	}
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public MCNumber fxd_yield_qty() {
		return getConstNumber(offset + 28, $fxd_yield_qty);
	}

	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public void fxd_yield_qty(MCNumber value) {
		setConstNumber(offset + 28, $fxd_yield_qty, value);
	}
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public void fxd_yield_qty(int value) {
		setConstNumber(offset + 28, $fxd_yield_qty, value);
	}
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public void fxd_yield_qty(long value) {
		setConstNumber(offset + 28, $fxd_yield_qty, value);
	}
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public void fxd_yield_qty(float value) {
		setConstNumber(offset + 28, $fxd_yield_qty, value);
	}
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public void fxd_yield_qty(double value) {
		setConstNumber(offset + 28, $fxd_yield_qty, value);
	}
	
	/**
	 * 品目オーダ状況区分. Item order status type.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return getConstString(offset + 29, $itm_ord_sts_typ);
	}

	/**
	 * 品目オーダ状況区分. Item order status type.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		setConstString(offset + 29, $itm_ord_sts_typ, value);
	}

	/**
	 * 確定日. Firm date.<p>
	 *
	 */
	public MCDate fix_dt() {
		return getConstDate(offset + 30, $fix_dt);
	}

	/**
	 * 確定日. Firm date.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		setConstDate(offset + 30, $fix_dt, value);
	}

	/**
	 * まとめＦＬＧ. Aggregation flg..<p>
	 *
	 */
	public boolean blk_flg() {
		return getConstBoolean(offset + 31, $blk_flg);
	}

	/**
	 * まとめＦＬＧ. Aggregation flg..<p>
	 *
	 */
	public void blk_flg(boolean value) {
		setConstBoolean(offset + 31, $blk_flg, value);
	}

	/**
	 * 発注予定日. Scheduled PO date.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return getConstDate(offset + 32, $po_schd_dt);
	}

	/**
	 * 発注予定日. Scheduled PO date.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 32, $po_schd_dt, value);
	}

	/**
	 * 発注予定日（ＭＲＰ）. Scheduled PO date (MRP).<p>
	 *
	 */
	public MCDate mrp_po_schd_dt() {
		return getConstDate(offset + 33, $mrp_po_schd_dt);
	}

	/**
	 * 発注予定日（ＭＲＰ）. Scheduled PO date (MRP).<p>
	 *
	 */
	public void mrp_po_schd_dt(MCDate value) {
		setConstDate(offset + 33, $mrp_po_schd_dt, value);
	}

	/**
	 * 発注日. PO date.<p>
	 *
	 */
	public MCDate po_dt() {
		return getConstDate(offset + 34, $po_dt);
	}

	/**
	 * 発注日. PO date.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		setConstDate(offset + 34, $po_dt, value);
	}

	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 35, $purc_lt);
	}

	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 35, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 35, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 35, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 35, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 35, $purc_lt, value);
	}
	
	/**
	 * 製造着手予定日. Scheduled mfg. start date.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 36, $mfg_st_schd_dt);
	}

	/**
	 * 製造着手予定日. Scheduled mfg. start date.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 36, $mfg_st_schd_dt, value);
	}

	/**
	 * 製造着手予定日（ＭＲＰ）. Scheduled mfg. start date (MRP).<p>
	 *
	 */
	public MCDate mrp_mfg_st_schd_dt() {
		return getConstDate(offset + 37, $mrp_mfg_st_schd_dt);
	}

	/**
	 * 製造着手予定日（ＭＲＰ）. Scheduled mfg. start date (MRP).<p>
	 *
	 */
	public void mrp_mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 37, $mrp_mfg_st_schd_dt, value);
	}

	/**
	 * 製造着手予定日（指図）. Scheduled mfg. start date (Order).<p>
	 *
	 */
	public MCDate inst_mfg_st_schd_dt() {
		return getConstDate(offset + 38, $inst_mfg_st_schd_dt);
	}

	/**
	 * 製造着手予定日（指図）. Scheduled mfg. start date (Order).<p>
	 *
	 */
	public void inst_mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 38, $inst_mfg_st_schd_dt, value);
	}

	/**
	 * 製造着手実績日. Actual mfg. start date.<p>
	 *
	 */
	public MCDate mfg_st_act_dt() {
		return getConstDate(offset + 39, $mfg_st_act_dt);
	}

	/**
	 * 製造着手実績日. Actual mfg. start date.<p>
	 *
	 */
	public void mfg_st_act_dt(MCDate value) {
		setConstDate(offset + 39, $mfg_st_act_dt, value);
	}

	/**
	 * 製造終了予定日. Scheduled mfg. end date.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return getConstDate(offset + 40, $mfg_end_schd_dt);
	}

	/**
	 * 製造終了予定日. Scheduled mfg. end date.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 40, $mfg_end_schd_dt, value);
	}

	/**
	 * 製造終了予定日（ＭＲＰ）. Scheduled mfg. end date (MRP).<p>
	 *
	 */
	public MCDate mrp_mfg_end_schd_dt() {
		return getConstDate(offset + 41, $mrp_mfg_end_schd_dt);
	}

	/**
	 * 製造終了予定日（ＭＲＰ）. Scheduled mfg. end date (MRP).<p>
	 *
	 */
	public void mrp_mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 41, $mrp_mfg_end_schd_dt, value);
	}

	/**
	 * 製造終了予定日（指図）. Scheduled mfg. end date (Order).<p>
	 *
	 */
	public MCDate inst_mfg_end_schd_dt() {
		return getConstDate(offset + 42, $inst_mfg_end_schd_dt);
	}

	/**
	 * 製造終了予定日（指図）. Scheduled mfg. end date (Order).<p>
	 *
	 */
	public void inst_mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 42, $inst_mfg_end_schd_dt, value);
	}

	/**
	 * 製造終了実績日. Actual mfg. end date.<p>
	 *
	 */
	public MCDate mfg_end_act_dt() {
		return getConstDate(offset + 43, $mfg_end_act_dt);
	}

	/**
	 * 製造終了実績日. Actual mfg. end date.<p>
	 *
	 */
	public void mfg_end_act_dt(MCDate value) {
		setConstDate(offset + 43, $mfg_end_act_dt, value);
	}

	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 44, $mfg_lt);
	}

	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 44, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 44, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 44, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 44, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 44, $mfg_lt, value);
	}
	
	/**
	 * 出庫予定日. Scheduled GI date.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 45, $gi_schd_dt);
	}

	/**
	 * 出庫予定日. Scheduled GI date.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 45, $gi_schd_dt, value);
	}

	/**
	 * 出庫予定日（ＭＲＰ）. Scheduled GI date (MRP).<p>
	 *
	 */
	public MCDate mrp_gi_schd_dt() {
		return getConstDate(offset + 46, $mrp_gi_schd_dt);
	}

	/**
	 * 出庫予定日（ＭＲＰ）. Scheduled GI date (MRP).<p>
	 *
	 */
	public void mrp_gi_schd_dt(MCDate value) {
		setConstDate(offset + 46, $mrp_gi_schd_dt, value);
	}

	/**
	 * 出庫予定日（指図）. Scheduled GI date (Order).<p>
	 *
	 */
	public MCDate inst_gi_schd_dt() {
		return getConstDate(offset + 47, $inst_gi_schd_dt);
	}

	/**
	 * 出庫予定日（指図）. Scheduled GI date (Order).<p>
	 *
	 */
	public void inst_gi_schd_dt(MCDate value) {
		setConstDate(offset + 47, $inst_gi_schd_dt, value);
	}

	/**
	 * 出庫実績日. Actual GI date.<p>
	 *
	 */
	public MCDate gi_act_dt() {
		return getConstDate(offset + 48, $gi_act_dt);
	}

	/**
	 * 出庫実績日. Actual GI date.<p>
	 *
	 */
	public void gi_act_dt(MCDate value) {
		setConstDate(offset + 48, $gi_act_dt, value);
	}

	/**
	 * 格納完了予定日. Scheduled storage completion date.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return getConstDate(offset + 49, $strg_schd_dt);
	}

	/**
	 * 格納完了予定日. Scheduled storage completion date.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		setConstDate(offset + 49, $strg_schd_dt, value);
	}

	/**
	 * 格納完了予定日（ＭＲＰ）. Scheduled storage completion date (MRP).<p>
	 *
	 */
	public MCDate mrp_strg_schd_dt() {
		return getConstDate(offset + 50, $mrp_strg_schd_dt);
	}

	/**
	 * 格納完了予定日（ＭＲＰ）. Scheduled storage completion date (MRP).<p>
	 *
	 */
	public void mrp_strg_schd_dt(MCDate value) {
		setConstDate(offset + 50, $mrp_strg_schd_dt, value);
	}

	/**
	 * 格納完了予定日（指図・発注）. Scheduled storage completion date (Order/PO).<p>
	 *
	 */
	public MCDate inst_strg_schd_dt() {
		return getConstDate(offset + 51, $inst_strg_schd_dt);
	}

	/**
	 * 格納完了予定日（指図・発注）. Scheduled storage completion date (Order/PO).<p>
	 *
	 */
	public void inst_strg_schd_dt(MCDate value) {
		setConstDate(offset + 51, $inst_strg_schd_dt, value);
	}

	/**
	 * 格納完了実績日. Actual storage completion date.<p>
	 *
	 */
	public MCDate strg_act_dt() {
		return getConstDate(offset + 52, $strg_act_dt);
	}

	/**
	 * 格納完了実績日. Actual storage completion date.<p>
	 *
	 */
	public void strg_act_dt(MCDate value) {
		setConstDate(offset + 52, $strg_act_dt, value);
	}

	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 53, $xfr_lt);
	}

	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 53, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 53, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 53, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 53, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 53, $xfr_lt, value);
	}
	
	/**
	 * 検収予定日. Scheduled acceptance date.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 54, $accpt_schd_dt);
	}

	/**
	 * 検収予定日. Scheduled acceptance date.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 54, $accpt_schd_dt, value);
	}

	/**
	 * 検収予定日（ＭＲＰ）. Scheduled acceptance date (MRP).<p>
	 *
	 */
	public MCDate mrp_accpt_schd_dt() {
		return getConstDate(offset + 55, $mrp_accpt_schd_dt);
	}

	/**
	 * 検収予定日（ＭＲＰ）. Scheduled acceptance date (MRP).<p>
	 *
	 */
	public void mrp_accpt_schd_dt(MCDate value) {
		setConstDate(offset + 55, $mrp_accpt_schd_dt, value);
	}

	/**
	 * 検収予定日（発注）. Scheduled acceptance date (PO).<p>
	 *
	 */
	public MCDate inst_accpt_schd_dt() {
		return getConstDate(offset + 56, $inst_accpt_schd_dt);
	}

	/**
	 * 検収予定日（発注）. Scheduled acceptance date (PO).<p>
	 *
	 */
	public void inst_accpt_schd_dt(MCDate value) {
		setConstDate(offset + 56, $inst_accpt_schd_dt, value);
	}

	/**
	 * 検収実績日. Actual acceptance date.<p>
	 *
	 */
	public MCDate accpt_act_dt() {
		return getConstDate(offset + 57, $accpt_act_dt);
	}

	/**
	 * 検収実績日. Actual acceptance date.<p>
	 *
	 */
	public void accpt_act_dt(MCDate value) {
		setConstDate(offset + 57, $accpt_act_dt, value);
	}

	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 58, $accpt_insp_lt);
	}

	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 58, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 58, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 58, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 58, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 58, $accpt_insp_lt, value);
	}
	
	/**
	 * 検査着手予定日. Scheduled inspection start date.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return getConstDate(offset + 59, $insp_st_schd_dt);
	}

	/**
	 * 検査着手予定日. Scheduled inspection start date.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 59, $insp_st_schd_dt, value);
	}

	/**
	 * 検査着手予定日（ＭＲＰ）. Scheduled inspection start date (MRP).<p>
	 *
	 */
	public MCDate mrp_insp_st_schd_dt() {
		return getConstDate(offset + 60, $mrp_insp_st_schd_dt);
	}

	/**
	 * 検査着手予定日（ＭＲＰ）. Scheduled inspection start date (MRP).<p>
	 *
	 */
	public void mrp_insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 60, $mrp_insp_st_schd_dt, value);
	}

	/**
	 * 検査着手予定日（指図・発注）. Scheduled inspection start date (Order/PO).<p>
	 *
	 */
	public MCDate inst_insp_st_schd_dt() {
		return getConstDate(offset + 61, $inst_insp_st_schd_dt);
	}

	/**
	 * 検査着手予定日（指図・発注）. Scheduled inspection start date (Order/PO).<p>
	 *
	 */
	public void inst_insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 61, $inst_insp_st_schd_dt, value);
	}

	/**
	 * 検査着手実績日. Actual inspection start date.<p>
	 *
	 */
	public MCDate insp_st_act_dt() {
		return getConstDate(offset + 62, $insp_st_act_dt);
	}

	/**
	 * 検査着手実績日. Actual inspection start date.<p>
	 *
	 */
	public void insp_st_act_dt(MCDate value) {
		setConstDate(offset + 62, $insp_st_act_dt, value);
	}

	/**
	 * 検査終了予定日. Scheduled inspection end date.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return getConstDate(offset + 63, $insp_end_schd_dt);
	}

	/**
	 * 検査終了予定日. Scheduled inspection end date.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 63, $insp_end_schd_dt, value);
	}

	/**
	 * 検査終了予定日（ＭＲＰ）. Scheduled inspection end date (MRP).<p>
	 *
	 */
	public MCDate mrp_insp_end_schd_dt() {
		return getConstDate(offset + 64, $mrp_insp_end_schd_dt);
	}

	/**
	 * 検査終了予定日（ＭＲＰ）. Scheduled inspection end date (MRP).<p>
	 *
	 */
	public void mrp_insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 64, $mrp_insp_end_schd_dt, value);
	}

	/**
	 * 検査終了予定日（指図・発注）. Scheduled inspection end date (Order/PO).<p>
	 *
	 */
	public MCDate inst_insp_end_schd_dt() {
		return getConstDate(offset + 65, $inst_insp_end_schd_dt);
	}

	/**
	 * 検査終了予定日（指図・発注）. Scheduled inspection end date (Order/PO).<p>
	 *
	 */
	public void inst_insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 65, $inst_insp_end_schd_dt, value);
	}

	/**
	 * 検査終了実績日. Actual inspection end date.<p>
	 *
	 */
	public MCDate insp_end_act_dt() {
		return getConstDate(offset + 66, $insp_end_act_dt);
	}

	/**
	 * 検査終了実績日. Actual inspection end date.<p>
	 *
	 */
	public void insp_end_act_dt(MCDate value) {
		setConstDate(offset + 66, $insp_end_act_dt, value);
	}

	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 67, $insp_lt);
	}

	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 67, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 67, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 67, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 67, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 67, $insp_lt, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 68, $insp_offst);
	}

	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 68, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 68, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 68, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 68, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 68, $insp_offst, value);
	}
	
	/**
	 * 使用可能予定日（ＭＲＰ）. Available date (MRP).<p>
	 *
	 */
	public MCDate mrp_avl_schd_dt() {
		return getConstDate(offset + 69, $mrp_avl_schd_dt);
	}

	/**
	 * 使用可能予定日（ＭＲＰ）. Available date (MRP).<p>
	 *
	 */
	public void mrp_avl_schd_dt(MCDate value) {
		setConstDate(offset + 69, $mrp_avl_schd_dt, value);
	}

	/**
	 * 使用可能予定日. Available date.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 70, $avl_schd_dt);
	}

	/**
	 * 使用可能予定日. Available date.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 70, $avl_schd_dt, value);
	}

	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 71, $master_dt);
	}

	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 71, $master_dt, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 72, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 72, $sno1, value);
	}

	/**
	 * 手配ＮＯ１区分. SEIBAN No. 1 type.<p>
	 *
	 */
	public String sno_typ1() {
		return getConstString(offset + 73, $sno_typ1);
	}

	/**
	 * 手配ＮＯ１区分. SEIBAN No. 1 type.<p>
	 *
	 */
	public void sno_typ1(String value) {
		setConstString(offset + 73, $sno_typ1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 74, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 74, $sno2, value);
	}

	/**
	 * 手配ＮＯ２区分. SEIBAN No. 2 type.<p>
	 *
	 */
	public String sno_typ2() {
		return getConstString(offset + 75, $sno_typ2);
	}

	/**
	 * 手配ＮＯ２区分. SEIBAN No. 2 type.<p>
	 *
	 */
	public void sno_typ2(String value) {
		setConstString(offset + 75, $sno_typ2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 76, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 76, $sno3, value);
	}

	/**
	 * 手配ＮＯ３区分. SEIBAN No. 3 type.<p>
	 *
	 */
	public String sno_typ3() {
		return getConstString(offset + 77, $sno_typ3);
	}

	/**
	 * 手配ＮＯ３区分. SEIBAN No. 3 type.<p>
	 *
	 */
	public void sno_typ3(String value) {
		setConstString(offset + 77, $sno_typ3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 78, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 78, $sno4, value);
	}

	/**
	 * 手配ＮＯ４区分. SEIBAN No. 4 type.<p>
	 *
	 */
	public String sno_typ4() {
		return getConstString(offset + 79, $sno_typ4);
	}

	/**
	 * 手配ＮＯ４区分. SEIBAN No. 4 type.<p>
	 *
	 */
	public void sno_typ4(String value) {
		setConstString(offset + 79, $sno_typ4, value);
	}

	/**
	 * 期限切れ日. Expired date.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 80, $lmt_dt);
	}

	/**
	 * 期限切れ日. Expired date.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 80, $lmt_dt, value);
	}

	/**
	 * WG ＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 81, $wg_cd);
	}

	/**
	 * WG ＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 81, $wg_cd, value);
	}

	/**
	 * 手配不許可ＦＬＧ. Disallow procurement flg..<p>
	 *
	 */
	public boolean not_fix_flg() {
		return getConstBoolean(offset + 82, $not_fix_flg);
	}

	/**
	 * 手配不許可ＦＬＧ. Disallow procurement flg..<p>
	 *
	 */
	public void not_fix_flg(boolean value) {
		setConstBoolean(offset + 82, $not_fix_flg, value);
	}

	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return getConstNumber(offset + 83, $ord_fix_pd);
	}

	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		setConstNumber(offset + 83, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		setConstNumber(offset + 83, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		setConstNumber(offset + 83, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		setConstNumber(offset + 83, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		setConstNumber(offset + 83, $ord_fix_pd, value);
	}
	
	/**
	 * 所要ＮＯ. Requirements No..<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 84, $rqmt_no);
	}

	/**
	 * 所要ＮＯ. Requirements No..<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 84, $rqmt_no, value);
	}

	/**
	 * 指図・発注連絡備考. Order/PO contact remarks.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 85, $inst_po_cnt_rmrks);
	}

	/**
	 * 指図・発注連絡備考. Order/PO contact remarks.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 85, $inst_po_cnt_rmrks, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 86, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 86, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 87, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 87, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 88, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 88, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 89, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 89, $sub_char3, value);
	}

	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 90, $dec_place);
	}

	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 90, $dec_place, value);
	}
	
	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 90, $dec_place, value);
	}
	
	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 90, $dec_place, value);
	}
	
	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 90, $dec_place, value);
	}
	
	/**
	 * 基準単位小数部有効桁数. Base unit number of decimal places.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 90, $dec_place, value);
	}
	
	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 91, $lg_grp_cd);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 91, $lg_grp_cd, value);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 92, $dlv_cd);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 92, $dlv_cd, value);
	}

	public String getString(String name) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			return ord_gnrt_typ();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			return mst_mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			return sno_typ1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			return sno_typ2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			return sno_typ3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			return sno_typ4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			return inst_qty();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			return not_inst_qty();
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			return inst_yield_schd_qty();
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			return yield_act_qty();
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			return purc_act_qty();
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			return insp_act_qty();
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			return nmr_qty();
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			return dnm_qty();
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			return fxd_yield_qty();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($mrp_po_schd_dt.equalsIgnoreCase(name)) {
			return mrp_po_schd_dt();
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($mrp_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mrp_mfg_st_schd_dt();
		}
		if ($inst_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return inst_mfg_st_schd_dt();
		}
		if ($mfg_st_act_dt.equalsIgnoreCase(name)) {
			return mfg_st_act_dt();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($mrp_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mrp_mfg_end_schd_dt();
		}
		if ($inst_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return inst_mfg_end_schd_dt();
		}
		if ($mfg_end_act_dt.equalsIgnoreCase(name)) {
			return mfg_end_act_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($mrp_gi_schd_dt.equalsIgnoreCase(name)) {
			return mrp_gi_schd_dt();
		}
		if ($inst_gi_schd_dt.equalsIgnoreCase(name)) {
			return inst_gi_schd_dt();
		}
		if ($gi_act_dt.equalsIgnoreCase(name)) {
			return gi_act_dt();
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			return strg_schd_dt();
		}
		if ($mrp_strg_schd_dt.equalsIgnoreCase(name)) {
			return mrp_strg_schd_dt();
		}
		if ($inst_strg_schd_dt.equalsIgnoreCase(name)) {
			return inst_strg_schd_dt();
		}
		if ($strg_act_dt.equalsIgnoreCase(name)) {
			return strg_act_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($mrp_accpt_schd_dt.equalsIgnoreCase(name)) {
			return mrp_accpt_schd_dt();
		}
		if ($inst_accpt_schd_dt.equalsIgnoreCase(name)) {
			return inst_accpt_schd_dt();
		}
		if ($accpt_act_dt.equalsIgnoreCase(name)) {
			return accpt_act_dt();
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			return insp_st_schd_dt();
		}
		if ($mrp_insp_st_schd_dt.equalsIgnoreCase(name)) {
			return mrp_insp_st_schd_dt();
		}
		if ($inst_insp_st_schd_dt.equalsIgnoreCase(name)) {
			return inst_insp_st_schd_dt();
		}
		if ($insp_st_act_dt.equalsIgnoreCase(name)) {
			return insp_st_act_dt();
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			return insp_end_schd_dt();
		}
		if ($mrp_insp_end_schd_dt.equalsIgnoreCase(name)) {
			return mrp_insp_end_schd_dt();
		}
		if ($inst_insp_end_schd_dt.equalsIgnoreCase(name)) {
			return inst_insp_end_schd_dt();
		}
		if ($insp_end_act_dt.equalsIgnoreCase(name)) {
			return insp_end_act_dt();
		}
		if ($mrp_avl_schd_dt.equalsIgnoreCase(name)) {
			return mrp_avl_schd_dt();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($blk_flg.equalsIgnoreCase(name)) {
			return blk_flg();
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			return ord_gnrt_typ();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			return mst_mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			return sno_typ1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			return sno_typ2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			return sno_typ3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			return sno_typ4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			return inst_qty();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			return not_inst_qty();
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			return inst_yield_schd_qty();
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			return yield_act_qty();
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			return purc_act_qty();
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			return insp_act_qty();
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			return nmr_qty();
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			return dnm_qty();
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			return fxd_yield_qty();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($mrp_po_schd_dt.equalsIgnoreCase(name)) {
			return mrp_po_schd_dt();
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($mrp_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mrp_mfg_st_schd_dt();
		}
		if ($inst_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return inst_mfg_st_schd_dt();
		}
		if ($mfg_st_act_dt.equalsIgnoreCase(name)) {
			return mfg_st_act_dt();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($mrp_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mrp_mfg_end_schd_dt();
		}
		if ($inst_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return inst_mfg_end_schd_dt();
		}
		if ($mfg_end_act_dt.equalsIgnoreCase(name)) {
			return mfg_end_act_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($mrp_gi_schd_dt.equalsIgnoreCase(name)) {
			return mrp_gi_schd_dt();
		}
		if ($inst_gi_schd_dt.equalsIgnoreCase(name)) {
			return inst_gi_schd_dt();
		}
		if ($gi_act_dt.equalsIgnoreCase(name)) {
			return gi_act_dt();
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			return strg_schd_dt();
		}
		if ($mrp_strg_schd_dt.equalsIgnoreCase(name)) {
			return mrp_strg_schd_dt();
		}
		if ($inst_strg_schd_dt.equalsIgnoreCase(name)) {
			return inst_strg_schd_dt();
		}
		if ($strg_act_dt.equalsIgnoreCase(name)) {
			return strg_act_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($mrp_accpt_schd_dt.equalsIgnoreCase(name)) {
			return mrp_accpt_schd_dt();
		}
		if ($inst_accpt_schd_dt.equalsIgnoreCase(name)) {
			return inst_accpt_schd_dt();
		}
		if ($accpt_act_dt.equalsIgnoreCase(name)) {
			return accpt_act_dt();
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			return insp_st_schd_dt();
		}
		if ($mrp_insp_st_schd_dt.equalsIgnoreCase(name)) {
			return mrp_insp_st_schd_dt();
		}
		if ($inst_insp_st_schd_dt.equalsIgnoreCase(name)) {
			return inst_insp_st_schd_dt();
		}
		if ($insp_st_act_dt.equalsIgnoreCase(name)) {
			return insp_st_act_dt();
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			return insp_end_schd_dt();
		}
		if ($mrp_insp_end_schd_dt.equalsIgnoreCase(name)) {
			return mrp_insp_end_schd_dt();
		}
		if ($inst_insp_end_schd_dt.equalsIgnoreCase(name)) {
			return inst_insp_end_schd_dt();
		}
		if ($insp_end_act_dt.equalsIgnoreCase(name)) {
			return insp_end_act_dt();
		}
		if ($mrp_avl_schd_dt.equalsIgnoreCase(name)) {
			return mrp_avl_schd_dt();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($blk_flg.equalsIgnoreCase(name)) {
			return blk_flg();
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			ord_gnrt_typ(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			mst_mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			sno_typ1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			sno_typ2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			sno_typ3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			sno_typ4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			not_inst_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			not_inst_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			not_inst_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			not_inst_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			not_inst_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($mrp_po_schd_dt.equalsIgnoreCase(name)) {
			mrp_po_schd_dt(value);
			return;
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($mrp_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mrp_mfg_st_schd_dt(value);
			return;
		}
		if ($inst_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			inst_mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_st_act_dt.equalsIgnoreCase(name)) {
			mfg_st_act_dt(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($mrp_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mrp_mfg_end_schd_dt(value);
			return;
		}
		if ($inst_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			inst_mfg_end_schd_dt(value);
			return;
		}
		if ($mfg_end_act_dt.equalsIgnoreCase(name)) {
			mfg_end_act_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($mrp_gi_schd_dt.equalsIgnoreCase(name)) {
			mrp_gi_schd_dt(value);
			return;
		}
		if ($inst_gi_schd_dt.equalsIgnoreCase(name)) {
			inst_gi_schd_dt(value);
			return;
		}
		if ($gi_act_dt.equalsIgnoreCase(name)) {
			gi_act_dt(value);
			return;
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			strg_schd_dt(value);
			return;
		}
		if ($mrp_strg_schd_dt.equalsIgnoreCase(name)) {
			mrp_strg_schd_dt(value);
			return;
		}
		if ($inst_strg_schd_dt.equalsIgnoreCase(name)) {
			inst_strg_schd_dt(value);
			return;
		}
		if ($strg_act_dt.equalsIgnoreCase(name)) {
			strg_act_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($mrp_accpt_schd_dt.equalsIgnoreCase(name)) {
			mrp_accpt_schd_dt(value);
			return;
		}
		if ($inst_accpt_schd_dt.equalsIgnoreCase(name)) {
			inst_accpt_schd_dt(value);
			return;
		}
		if ($accpt_act_dt.equalsIgnoreCase(name)) {
			accpt_act_dt(value);
			return;
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			insp_st_schd_dt(value);
			return;
		}
		if ($mrp_insp_st_schd_dt.equalsIgnoreCase(name)) {
			mrp_insp_st_schd_dt(value);
			return;
		}
		if ($inst_insp_st_schd_dt.equalsIgnoreCase(name)) {
			inst_insp_st_schd_dt(value);
			return;
		}
		if ($insp_st_act_dt.equalsIgnoreCase(name)) {
			insp_st_act_dt(value);
			return;
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			insp_end_schd_dt(value);
			return;
		}
		if ($mrp_insp_end_schd_dt.equalsIgnoreCase(name)) {
			mrp_insp_end_schd_dt(value);
			return;
		}
		if ($inst_insp_end_schd_dt.equalsIgnoreCase(name)) {
			inst_insp_end_schd_dt(value);
			return;
		}
		if ($insp_end_act_dt.equalsIgnoreCase(name)) {
			insp_end_act_dt(value);
			return;
		}
		if ($mrp_avl_schd_dt.equalsIgnoreCase(name)) {
			mrp_avl_schd_dt(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($blk_flg.equalsIgnoreCase(name)) {
			blk_flg(value);
			return;
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			ord_gnrt_typ(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			mst_mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			sno_typ1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			sno_typ2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			sno_typ3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			sno_typ4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			not_inst_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			not_inst_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			not_inst_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			not_inst_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($not_inst_qty.equalsIgnoreCase(name)) {
			not_inst_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
			return;
		}
		if ($fxd_yield_qty.equalsIgnoreCase(name)) {
			fxd_yield_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($mrp_po_schd_dt.equalsIgnoreCase(name)) {
			mrp_po_schd_dt(value);
			return;
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($mrp_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mrp_mfg_st_schd_dt(value);
			return;
		}
		if ($inst_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			inst_mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_st_act_dt.equalsIgnoreCase(name)) {
			mfg_st_act_dt(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($mrp_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mrp_mfg_end_schd_dt(value);
			return;
		}
		if ($inst_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			inst_mfg_end_schd_dt(value);
			return;
		}
		if ($mfg_end_act_dt.equalsIgnoreCase(name)) {
			mfg_end_act_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($mrp_gi_schd_dt.equalsIgnoreCase(name)) {
			mrp_gi_schd_dt(value);
			return;
		}
		if ($inst_gi_schd_dt.equalsIgnoreCase(name)) {
			inst_gi_schd_dt(value);
			return;
		}
		if ($gi_act_dt.equalsIgnoreCase(name)) {
			gi_act_dt(value);
			return;
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			strg_schd_dt(value);
			return;
		}
		if ($mrp_strg_schd_dt.equalsIgnoreCase(name)) {
			mrp_strg_schd_dt(value);
			return;
		}
		if ($inst_strg_schd_dt.equalsIgnoreCase(name)) {
			inst_strg_schd_dt(value);
			return;
		}
		if ($strg_act_dt.equalsIgnoreCase(name)) {
			strg_act_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($mrp_accpt_schd_dt.equalsIgnoreCase(name)) {
			mrp_accpt_schd_dt(value);
			return;
		}
		if ($inst_accpt_schd_dt.equalsIgnoreCase(name)) {
			inst_accpt_schd_dt(value);
			return;
		}
		if ($accpt_act_dt.equalsIgnoreCase(name)) {
			accpt_act_dt(value);
			return;
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			insp_st_schd_dt(value);
			return;
		}
		if ($mrp_insp_st_schd_dt.equalsIgnoreCase(name)) {
			mrp_insp_st_schd_dt(value);
			return;
		}
		if ($inst_insp_st_schd_dt.equalsIgnoreCase(name)) {
			inst_insp_st_schd_dt(value);
			return;
		}
		if ($insp_st_act_dt.equalsIgnoreCase(name)) {
			insp_st_act_dt(value);
			return;
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			insp_end_schd_dt(value);
			return;
		}
		if ($mrp_insp_end_schd_dt.equalsIgnoreCase(name)) {
			mrp_insp_end_schd_dt(value);
			return;
		}
		if ($inst_insp_end_schd_dt.equalsIgnoreCase(name)) {
			inst_insp_end_schd_dt(value);
			return;
		}
		if ($insp_end_act_dt.equalsIgnoreCase(name)) {
			insp_end_act_dt(value);
			return;
		}
		if ($mrp_avl_schd_dt.equalsIgnoreCase(name)) {
			mrp_avl_schd_dt(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($blk_flg.equalsIgnoreCase(name)) {
			blk_flg(value);
			return;
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
