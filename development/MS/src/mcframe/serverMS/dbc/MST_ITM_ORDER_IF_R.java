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
 * "品目オーダ情報送信ＩＦ // Item order info. export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>dpt_st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門マスタ適用開始日</td>
 *  	<td>Dept. master application start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>data_upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信元レコード更新日時</td>
 *  	<td>Update date and time of source record</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bi_not_send_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＢＩ送信対象外ＦＬＧ</td>
 *  	<td>BI not to be exported flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷実績日</td>
 *  	<td>Actual receipt date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目オーダＮＯ</td>
 *  	<td>Item order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_ord_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>オーダ区分</td>
 *  	<td>Order type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ord_gnrt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>オーダ生成区分</td>
 *  	<td>Order generation type</td>
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
 *  	<td>strg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>格納場所ＣＤ</td>
 *  	<td>Storage location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造場所ＣＤ</td>
 *  	<td>Mfg. location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mst_mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マスタ製造場所ＣＤ</td>
 *  	<td>Master mfg. location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>依頼先場所ＣＤ</td>
 *  	<td>Requested location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼先ワーキンググループＣＤ</td>
 *  	<td>Requested WG cd.</td>
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
 *  	<td>inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>指図予定数量</td>
 *  	<td>Order scheduled qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高予定数量</td>
 *  	<td>Output scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>未指図数量</td>
 *  	<td>Unordered qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_inst_unit_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図単位区分</td>
 *  	<td>Mfg. order unit type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_yield_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高予定数量（指図・発注）</td>
 *  	<td>Output scheduled qty. (Order/PO)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高実績数量（入荷・出来高）</td>
 *  	<td>Output result qty. (Receipt/output)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入実績数量</td>
 *  	<td>Purchase result qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査実績数量</td>
 *  	<td>Inspection result qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>nmr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>歩留分子</td>
 *  	<td>Yield numerator</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dnm_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>歩留分母</td>
 *  	<td>Yield denominator</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fxd_yield_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>固定歩留数量</td>
 *  	<td>Constant yield qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_ord_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目オーダ状況区分</td>
 *  	<td>Item order status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fix_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>確定日</td>
 *  	<td>Firm date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>blk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>まとめＦＬＧ</td>
 *  	<td>Aggregation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注予定日</td>
 *  	<td>Scheduled PO date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_po_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注予定日（ＭＲＰ）</td>
 *  	<td>Scheduled PO date (MRP)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注日</td>
 *  	<td>PO date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_purc_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購入ＬＴ（ＭＲＰ）</td>
 *  	<td>Purchase LT (MRP)</td>
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
 *  	<td>act_purc_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購入ＬＴ（実績）</td>
 *  	<td>Purchase LT (Result)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造着手予定日</td>
 *  	<td>Scheduled mfg. start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_mfg_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造着手予定日（ＭＲＰ）</td>
 *  	<td>Scheduled mfg. start date (MRP)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_mfg_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造着手予定日（指図）</td>
 *  	<td>Scheduled mfg. start date (Order)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_st_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造着手実績日</td>
 *  	<td>Actual mfg. start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造終了予定日</td>
 *  	<td>Scheduled mfg. end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_mfg_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造終了予定日（ＭＲＰ）</td>
 *  	<td>Scheduled mfg. end date (MRP)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_mfg_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造終了予定日（指図）</td>
 *  	<td>Scheduled mfg. end date (Order)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_end_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造終了実績日</td>
 *  	<td>Actual mfg. end date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_mfg_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造ＬＴ（ＭＲＰ）</td>
 *  	<td>Mfg. LT (MRP)</td>
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
 *  	<td>act_mfg_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造ＬＴ（実績）</td>
 *  	<td>Mfg. LT (Result)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫予定日</td>
 *  	<td>Scheduled GI date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_gi_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫予定日（ＭＲＰ）</td>
 *  	<td>Scheduled GI date (MRP)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_gi_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫予定日（指図）</td>
 *  	<td>Scheduled GI date (Order)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫実績日</td>
 *  	<td>Actual GI date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>strg_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>格納完了予定日</td>
 *  	<td>Scheduled storage completion date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_strg_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納完了予定日（ＭＲＰ）</td>
 *  	<td>Scheduled storage completion date (MRP)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_strg_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納完了予定日（指図・発注）</td>
 *  	<td>Scheduled storage completion date (Order/PO)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>strg_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納完了実績日</td>
 *  	<td>Actual storage completion date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>移動ＬＴ</td>
 *  	<td>Movement LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>accpt_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収予定日</td>
 *  	<td>Scheduled acceptance date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_accpt_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収予定日（ＭＲＰ）</td>
 *  	<td>Scheduled acceptance date (MRP)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_accpt_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収予定日（発注）</td>
 *  	<td>Scheduled acceptance date (PO)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>accpt_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収実績日</td>
 *  	<td>Actual acceptance date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>accpt_insp_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収ＬＴ</td>
 *  	<td>Acceptance LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査着手予定日</td>
 *  	<td>Scheduled inspection start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_insp_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査着手予定日（ＭＲＰ）</td>
 *  	<td>Scheduled inspection start date (MRP)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_insp_st_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査着手予定日（指図・発注）</td>
 *  	<td>Scheduled inspection start date (Order/PO)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_st_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査着手実績日</td>
 *  	<td>Actual inspection start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査終了予定日</td>
 *  	<td>Scheduled inspection end date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_insp_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査終了予定日（ＭＲＰ）</td>
 *  	<td>Scheduled inspection end date (MRP)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_insp_end_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査終了予定日（指図・発注）</td>
 *  	<td>Scheduled inspection end date (Order/PO)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_end_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査終了実績日</td>
 *  	<td>Actual inspection end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査ＬＴ</td>
 *  	<td>Inspection LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_offst</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査オフセット</td>
 *  	<td>Inspection offset</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_avl_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>使用可能予定日（ＭＲＰ）</td>
 *  	<td>Available date (MRP)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>avl_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>使用可能予定日</td>
 *  	<td>Available date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>master_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マスタ適用日</td>
 *  	<td>Master application date</td>
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
 *  	<td>lmt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期限切れ日</td>
 *  	<td>Expired date</td>
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
 *  	<td>rqmt_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>所要ＮＯ</td>
 *  	<td>Requirements No.</td>
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
 *  	<td>inst_itm_ord_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図時品目オーダ状況区分</td>
 *  	<td>Item order at mfg. order status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷進捗ＮＯ</td>
 *  	<td>Receipt progress No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注明細ＮＯ</td>
 *  	<td>PO details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_purc_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準納入ＬＴ</td>
 *  	<td>Standard delivery LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入希望日時</td>
 *  	<td>Desired delivery date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元納入希望日時</td>
 *  	<td>Request source desired delivery date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１</td>
 *  	<td>Spare CHAR column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２</td>
 *  	<td>Spare CHAR column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３</td>
 *  	<td>Spare CHAR column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目４</td>
 *  	<td>Spare CHAR column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目５</td>
 *  	<td>Spare CHAR column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目６</td>
 *  	<td>Spare CHAR column 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目７</td>
 *  	<td>Spare CHAR column 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目８</td>
 *  	<td>Spare CHAR column 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目９</td>
 *  	<td>Spare CHAR column 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１０</td>
 *  	<td>Spare CHAR column 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１１</td>
 *  	<td>Spare CHAR column 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１２</td>
 *  	<td>Spare CHAR column 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１３</td>
 *  	<td>Spare CHAR column 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１４</td>
 *  	<td>Spare CHAR column 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１５</td>
 *  	<td>Spare CHAR column 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１６</td>
 *  	<td>Spare CHAR column 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１７</td>
 *  	<td>Spare CHAR column 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１８</td>
 *  	<td>Spare CHAR column 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１９</td>
 *  	<td>Spare CHAR column 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２０</td>
 *  	<td>Spare CHAR column 20</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２１</td>
 *  	<td>Spare CHAR column 21</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２２</td>
 *  	<td>Spare CHAR column 22</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２３</td>
 *  	<td>Spare CHAR column 23</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２４</td>
 *  	<td>Spare CHAR column 24</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２５</td>
 *  	<td>Spare CHAR column 25</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２６</td>
 *  	<td>Spare CHAR column 26</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２７</td>
 *  	<td>Spare CHAR column 27</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２８</td>
 *  	<td>Spare CHAR column 28</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２９</td>
 *  	<td>Spare CHAR column 29</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３０</td>
 *  	<td>Spare CHAR column 30</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目１</td>
 *  	<td>Spare NUM column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目２</td>
 *  	<td>Spare NUM column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目３</td>
 *  	<td>Spare NUM column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目４</td>
 *  	<td>Spare NUM column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目５</td>
 *  	<td>Spare NUM column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目１</td>
 *  	<td>Spare DATE column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目２</td>
 *  	<td>Spare DATE column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目３</td>
 *  	<td>Spare DATE column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目４</td>
 *  	<td>Spare DATE column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目５</td>
 *  	<td>Spare DATE column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログＮＯ</td>
 *  	<td>Log No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>log_sub_key1</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー１</td>
 *  	<td>Log sub key 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>log_sub_key2</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー２</td>
 *  	<td>Log sub key 2</td>
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
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sdrv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td>SDRV_IF1.SDRV_STS_TYP</td>
 *  	<td>送受信状況区分</td>
 *  	<td>Exporting and importing status type</td>
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
 *  	<td>strg_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納場所名</td>
 *  	<td>Storage location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所名</td>
 *  	<td>Mfg. location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mst_mfg_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>マスタ製造場所名</td>
 *  	<td>Master mfg. location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先名</td>
 *  	<td>Supplier name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>maker_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メーカ名</td>
 *  	<td>Maker name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼先場所名</td>
 *  	<td>Location name (Requested)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼先ワーキンググループ名</td>
 *  	<td>Requested WG name</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_ITM_ORDER_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_ITM_ORDER_IF";

	public static final boolean EX_CTRL = true;
	
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
	 * 部門マスタ適用開始日. Dept. master application start date.<p>
	 *
	 */
	public static final String $dpt_st_dt = "dpt_st_dt";
	private static final MCPermColumnInfo _dpt_st_dt = createColumnInfo("dpt_st_dt");
	public final MCDatePermColumn dpt_st_dt = createDateColumn(_dpt_st_dt);
	
	/**
	 * 送信元レコード更新日時. Update date and time of source record.<p>
	 *
	 */
	public static final String $data_upd_ts = "data_upd_ts";
	private static final MCPermColumnInfo _data_upd_ts = createColumnInfo("data_upd_ts");
	public final MCTimestampPermColumn data_upd_ts = createTimestampColumn(_data_upd_ts);
	
	/**
	 * ＢＩ送信対象外ＦＬＧ. BI not to be exported flg..<p>
	 *
	 */
	public static final String $bi_not_send_flg = "bi_not_send_flg";
	private static final MCPermColumnInfo _bi_not_send_flg = createColumnInfo("bi_not_send_flg");
	public final MCBooleanPermColumn bi_not_send_flg = createBooleanColumn(_bi_not_send_flg);
	
	/**
	 * 入荷実績日. Actual receipt date.<p>
	 *
	 */
	public static final String $arr_act_tm = "arr_act_tm";
	private static final MCPermColumnInfo _arr_act_tm = createColumnInfo("arr_act_tm");
	public final MCDatePermColumn arr_act_tm = createDateColumn(_arr_act_tm);
	
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
	 * 依頼先ワーキンググループＣＤ. Requested WG cd..<p>
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
	 * 購入ＬＴ（ＭＲＰ）. Purchase LT (MRP).<p>
	 *
	 */
	public static final String $mrp_purc_lt = "mrp_purc_lt";
	private static final MCPermColumnInfo _mrp_purc_lt = createColumnInfo("mrp_purc_lt");
	public final MCNumberPermColumn mrp_purc_lt = createNumberColumn(_mrp_purc_lt);
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
	private static final MCPermColumnInfo _purc_lt = createColumnInfo("purc_lt");
	public final MCNumberPermColumn purc_lt = createNumberColumn(_purc_lt);
	
	/**
	 * 購入ＬＴ（実績）. Purchase LT (Result).<p>
	 *
	 */
	public static final String $act_purc_lt = "act_purc_lt";
	private static final MCPermColumnInfo _act_purc_lt = createColumnInfo("act_purc_lt");
	public final MCNumberPermColumn act_purc_lt = createNumberColumn(_act_purc_lt);
	
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
	 * 製造ＬＴ（ＭＲＰ）. Mfg. LT (MRP).<p>
	 *
	 */
	public static final String $mrp_mfg_lt = "mrp_mfg_lt";
	private static final MCPermColumnInfo _mrp_mfg_lt = createColumnInfo("mrp_mfg_lt");
	public final MCNumberPermColumn mrp_mfg_lt = createNumberColumn(_mrp_mfg_lt);
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public static final String $mfg_lt = "mfg_lt";
	private static final MCPermColumnInfo _mfg_lt = createColumnInfo("mfg_lt");
	public final MCNumberPermColumn mfg_lt = createNumberColumn(_mfg_lt);
	
	/**
	 * 製造ＬＴ（実績）. Mfg. LT (Result).<p>
	 *
	 */
	public static final String $act_mfg_lt = "act_mfg_lt";
	private static final MCPermColumnInfo _act_mfg_lt = createColumnInfo("act_mfg_lt");
	public final MCNumberPermColumn act_mfg_lt = createNumberColumn(_act_mfg_lt);
	
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
	 * 期限切れ日. Expired date.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	private static final MCPermColumnInfo _lmt_dt = createColumnInfo("lmt_dt");
	public final MCDatePermColumn lmt_dt = createDateColumn(_lmt_dt);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 所要ＮＯ. Requirements No..<p>
	 *
	 */
	public static final String $rqmt_no = "rqmt_no";
	private static final MCPermColumnInfo _rqmt_no = createColumnInfo("rqmt_no");
	public final MCStringPermColumn rqmt_no = createStringColumn(_rqmt_no);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 製造指図時品目オーダ状況区分. Item order at mfg. order status type.<p>
	 *
	 */
	public static final String $inst_itm_ord_sts_typ = "inst_itm_ord_sts_typ";
	private static final MCPermColumnInfo _inst_itm_ord_sts_typ = createColumnInfo("inst_itm_ord_sts_typ");
	public final MCStringPermColumn inst_itm_ord_sts_typ = createStringColumn(_inst_itm_ord_sts_typ);
	
	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	private static final MCPermColumnInfo _arr_pr_no = createColumnInfo("arr_pr_no");
	public final MCStringPermColumn arr_pr_no = createStringColumn(_arr_pr_no);
	
	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	private static final MCPermColumnInfo _po_d_no = createColumnInfo("po_d_no");
	public final MCStringPermColumn po_d_no = createStringColumn(_po_d_no);
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public static final String $std_purc_lt = "std_purc_lt";
	private static final MCPermColumnInfo _std_purc_lt = createColumnInfo("std_purc_lt");
	public final MCNumberPermColumn std_purc_lt = createNumberColumn(_std_purc_lt);
	
	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	private static final MCPermColumnInfo _dlv_rqst_tm = createColumnInfo("dlv_rqst_tm");
	public final MCDatePermColumn dlv_rqst_tm = createDateColumn(_dlv_rqst_tm);
	
	/**
	 * 依頼元納入希望日時. Request source desired delivery date and time.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_tm = "rqst_dlv_rqst_tm";
	private static final MCPermColumnInfo _rqst_dlv_rqst_tm = createColumnInfo("rqst_dlv_rqst_tm");
	public final MCDatePermColumn rqst_dlv_rqst_tm = createDateColumn(_rqst_dlv_rqst_tm);
	
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
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	/**
	 * 格納場所名. Storage location name.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	
	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	
	/**
	 * マスタ製造場所名. Master mfg. location name.<p>
	 *
	 */
	public static final String $mst_mfg_loc_nm = "mst_mfg_loc_nm";
	
	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	
	/**
	 * メーカ名. Maker name.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	
	/**
	 * 依頼先場所名. Location name (Requested).<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	
	/**
	 * 依頼先ワーキンググループ名. Requested WG name.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta dpt_st_dt_META = createCommonMeta($dpt_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta data_upd_ts_META = createCommonMeta($data_upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta bi_not_send_flg_META = createCommonMeta($bi_not_send_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_act_tm_META = createCommonMeta($arr_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP);
	public static final MCMeta ord_gnrt_typ_META = createCommonMeta($ord_gnrt_typ, mcframe.commonMS.meta.MS_META.ORD_GNRT_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
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
	public static final MCMeta mrp_purc_lt_META = createCommonMeta($mrp_purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta act_purc_lt_META = createCommonMeta($act_purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_mfg_st_schd_dt_META = createCommonMeta($mrp_mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_mfg_st_schd_dt_META = createCommonMeta($inst_mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_act_dt_META = createCommonMeta($mfg_st_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_META = createCommonMeta($mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_mfg_end_schd_dt_META = createCommonMeta($mrp_mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_mfg_end_schd_dt_META = createCommonMeta($inst_mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_act_dt_META = createCommonMeta($mfg_end_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_mfg_lt_META = createCommonMeta($mrp_mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta act_mfg_lt_META = createCommonMeta($act_mfg_lt, mcframe.commonMA.meta.MA_META.LT);
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
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqmt_no_META = createCommonMeta($rqmt_no, mcframe.commonMA.meta.MA_META.RQMT_NO);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.IORD_INTR_RMRKS);
	public static final MCMeta inst_itm_ord_sts_typ_META = createCommonMeta($inst_itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta std_purc_lt_META = createCommonMeta($std_purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta rqst_dlv_rqst_tm_META = createCommonMeta($rqst_dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
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
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mst_mfg_loc_nm_META = createCommonMeta($mst_mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $SDRV_IF1 = "SDRV_IF1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"PFT_SDRV_IF",
				$SDRV_IF1,
				new String[][]{
						{"data_no", "data_no"}
				},
				() -> {
					return mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV_IF1");
				},
				(alias) -> {
					MST_ITM_ORDER_IF_R own = MST_ITM_ORDER_IF_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV_IF1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_ITM_ORDER_IF_R> constMetas = new ConstMetaList<MST_ITM_ORDER_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			dpt_st_dt_META,
			data_upd_ts_META,
			bi_not_send_flg_META,
			arr_act_tm_META,
			itm_ord_no_META,
			itm_ord_typ_META,
			ord_gnrt_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
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
			mrp_purc_lt_META,
			purc_lt_META,
			act_purc_lt_META,
			mfg_st_schd_dt_META,
			mrp_mfg_st_schd_dt_META,
			inst_mfg_st_schd_dt_META,
			mfg_st_act_dt_META,
			mfg_end_schd_dt_META,
			mrp_mfg_end_schd_dt_META,
			inst_mfg_end_schd_dt_META,
			mfg_end_act_dt_META,
			mrp_mfg_lt_META,
			mfg_lt_META,
			act_mfg_lt_META,
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
			sno2_META,
			sno3_META,
			sno4_META,
			lmt_dt_META,
			wg_cd_META,
			rqmt_no_META,
			intr_rmrks_META,
			inst_itm_ord_sts_typ_META,
			arr_pr_no_META,
			po_d_no_META,
			std_purc_lt_META,
			dlv_rqst_tm_META,
			rqst_dlv_rqst_tm_META,
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
			itm_nm_META,
			strg_loc_nm_META,
			mfg_loc_nm_META,
			mst_mfg_loc_nm_META,
			sppl_nm_META,
			maker_nm_META,
			rqst_loc_nm_META,
			rqst_wg_nm_META,
			wg_nm_META
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
	protected MST_ITM_ORDER_IF_R(ConstMetaList<? extends MST_ITM_ORDER_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_ITM_ORDER_IF_R(ConstMetaList<? extends MST_ITM_ORDER_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$data_lno,
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
			MST_ITM_ORDER_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$data_no,
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
			MST_ITM_ORDER_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$exe_sts_typ,
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
			MST_ITM_ORDER_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$data_crud_typ,
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
			MST_ITM_ORDER_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$ext_sys_cd,
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
			MST_ITM_ORDER_IF_R.$dpt_st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$dpt_st_dt,
				"dpt_st_dt",
				dpt_st_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$data_upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ITM_ORDER_IF_R.$data_upd_ts,
				"data_upd_ts",
				data_upd_ts,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$bi_not_send_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ITM_ORDER_IF_R.$bi_not_send_flg,
				"bi_not_send_flg",
				bi_not_send_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$arr_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$arr_act_tm,
				"arr_act_tm",
				arr_act_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$itm_ord_no,
				"itm_ord_no",
				itm_ord_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$itm_ord_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$itm_ord_typ,
				"itm_ord_typ",
				itm_ord_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$ord_gnrt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$ord_gnrt_typ,
				"ord_gnrt_typ",
				ord_gnrt_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$itm_cd,
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
			MST_ITM_ORDER_IF_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$itm_sub1,
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
			MST_ITM_ORDER_IF_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$itm_sub2,
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
			MST_ITM_ORDER_IF_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$itm_sub3,
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
			MST_ITM_ORDER_IF_R.$strg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$strg_loc_cd,
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
			MST_ITM_ORDER_IF_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$mfg_loc_cd,
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
			MST_ITM_ORDER_IF_R.$mst_mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$mst_mfg_loc_cd,
				"mst_mfg_loc_cd",
				mst_mfg_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$maker_cd,
				"maker_cd",
				maker_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$rqst_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$rqst_loc_cd,
				"rqst_loc_cd",
				rqst_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$rqst_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$rqst_wg_cd,
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
			MST_ITM_ORDER_IF_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$bom_ptn,
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
			MST_ITM_ORDER_IF_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$oper_ptn,
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
			MST_ITM_ORDER_IF_R.$inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$inst_qty,
				"inst_qty",
				inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$yield_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$yield_schd_qty,
				"yield_schd_qty",
				yield_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$not_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$not_inst_qty,
				"not_inst_qty",
				not_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$mfg_inst_unit_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$mfg_inst_unit_typ,
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
			MST_ITM_ORDER_IF_R.$inst_yield_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$inst_yield_schd_qty,
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
			MST_ITM_ORDER_IF_R.$yield_act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$yield_act_qty,
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
			MST_ITM_ORDER_IF_R.$purc_act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$purc_act_qty,
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
			MST_ITM_ORDER_IF_R.$insp_act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$insp_act_qty,
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
			MST_ITM_ORDER_IF_R.$nmr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$nmr_qty,
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
			MST_ITM_ORDER_IF_R.$dnm_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$dnm_qty,
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
			MST_ITM_ORDER_IF_R.$fxd_yield_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$fxd_yield_qty,
				"fxd_yield_qty",
				fxd_yield_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$itm_ord_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$itm_ord_sts_typ,
				"itm_ord_sts_typ",
				itm_ord_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$fix_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$fix_dt,
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
			MST_ITM_ORDER_IF_R.$blk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ITM_ORDER_IF_R.$blk_flg,
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
			MST_ITM_ORDER_IF_R.$po_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$po_schd_dt,
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
			MST_ITM_ORDER_IF_R.$mrp_po_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mrp_po_schd_dt,
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
			MST_ITM_ORDER_IF_R.$po_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$po_dt,
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
			MST_ITM_ORDER_IF_R.$mrp_purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$mrp_purc_lt,
				"mrp_purc_lt",
				mrp_purc_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$purc_lt,
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
			MST_ITM_ORDER_IF_R.$act_purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$act_purc_lt,
				"act_purc_lt",
				act_purc_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$mfg_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mfg_st_schd_dt,
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
			MST_ITM_ORDER_IF_R.$mrp_mfg_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mrp_mfg_st_schd_dt,
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
			MST_ITM_ORDER_IF_R.$inst_mfg_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$inst_mfg_st_schd_dt,
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
			MST_ITM_ORDER_IF_R.$mfg_st_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mfg_st_act_dt,
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
			MST_ITM_ORDER_IF_R.$mfg_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mfg_end_schd_dt,
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
			MST_ITM_ORDER_IF_R.$mrp_mfg_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mrp_mfg_end_schd_dt,
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
			MST_ITM_ORDER_IF_R.$inst_mfg_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$inst_mfg_end_schd_dt,
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
			MST_ITM_ORDER_IF_R.$mfg_end_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mfg_end_act_dt,
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
			MST_ITM_ORDER_IF_R.$mrp_mfg_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$mrp_mfg_lt,
				"mrp_mfg_lt",
				mrp_mfg_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$mfg_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$mfg_lt,
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
			MST_ITM_ORDER_IF_R.$act_mfg_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$act_mfg_lt,
				"act_mfg_lt",
				act_mfg_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$gi_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$gi_schd_dt,
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
			MST_ITM_ORDER_IF_R.$mrp_gi_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mrp_gi_schd_dt,
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
			MST_ITM_ORDER_IF_R.$inst_gi_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$inst_gi_schd_dt,
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
			MST_ITM_ORDER_IF_R.$gi_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$gi_act_dt,
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
			MST_ITM_ORDER_IF_R.$strg_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$strg_schd_dt,
				"strg_schd_dt",
				strg_schd_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$mrp_strg_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mrp_strg_schd_dt,
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
			MST_ITM_ORDER_IF_R.$inst_strg_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$inst_strg_schd_dt,
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
			MST_ITM_ORDER_IF_R.$strg_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$strg_act_dt,
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
			MST_ITM_ORDER_IF_R.$xfr_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$xfr_lt,
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
			MST_ITM_ORDER_IF_R.$accpt_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$accpt_schd_dt,
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
			MST_ITM_ORDER_IF_R.$mrp_accpt_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mrp_accpt_schd_dt,
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
			MST_ITM_ORDER_IF_R.$inst_accpt_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$inst_accpt_schd_dt,
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
			MST_ITM_ORDER_IF_R.$accpt_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$accpt_act_dt,
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
			MST_ITM_ORDER_IF_R.$accpt_insp_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$accpt_insp_lt,
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
			MST_ITM_ORDER_IF_R.$insp_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$insp_st_schd_dt,
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
			MST_ITM_ORDER_IF_R.$mrp_insp_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mrp_insp_st_schd_dt,
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
			MST_ITM_ORDER_IF_R.$inst_insp_st_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$inst_insp_st_schd_dt,
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
			MST_ITM_ORDER_IF_R.$insp_st_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$insp_st_act_dt,
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
			MST_ITM_ORDER_IF_R.$insp_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$insp_end_schd_dt,
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
			MST_ITM_ORDER_IF_R.$mrp_insp_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mrp_insp_end_schd_dt,
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
			MST_ITM_ORDER_IF_R.$inst_insp_end_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$inst_insp_end_schd_dt,
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
			MST_ITM_ORDER_IF_R.$insp_end_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$insp_end_act_dt,
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
			MST_ITM_ORDER_IF_R.$insp_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$insp_lt,
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
			MST_ITM_ORDER_IF_R.$insp_offst,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$insp_offst,
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
			MST_ITM_ORDER_IF_R.$mrp_avl_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$mrp_avl_schd_dt,
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
			MST_ITM_ORDER_IF_R.$avl_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$avl_schd_dt,
				"avl_schd_dt",
				avl_schd_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$master_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$master_dt,
				"master_dt",
				master_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sno1,
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
			MST_ITM_ORDER_IF_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sno2,
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
			MST_ITM_ORDER_IF_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sno3,
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
			MST_ITM_ORDER_IF_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sno4,
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
			MST_ITM_ORDER_IF_R.$lmt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$lmt_dt,
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
			MST_ITM_ORDER_IF_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$wg_cd,
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
			MST_ITM_ORDER_IF_R.$rqmt_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$rqmt_no,
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
			MST_ITM_ORDER_IF_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$intr_rmrks,
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
			MST_ITM_ORDER_IF_R.$inst_itm_ord_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$inst_itm_ord_sts_typ,
				"inst_itm_ord_sts_typ",
				inst_itm_ord_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$arr_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$arr_pr_no,
				"arr_pr_no",
				arr_pr_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$po_d_no,
				"po_d_no",
				po_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$std_purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$std_purc_lt,
				"std_purc_lt",
				std_purc_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$dlv_rqst_tm,
				"dlv_rqst_tm",
				dlv_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$rqst_dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$rqst_dlv_rqst_tm,
				"rqst_dlv_rqst_tm",
				rqst_dlv_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char1,
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
			MST_ITM_ORDER_IF_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char2,
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
			MST_ITM_ORDER_IF_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char3,
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
			MST_ITM_ORDER_IF_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char4,
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
			MST_ITM_ORDER_IF_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char5,
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
			MST_ITM_ORDER_IF_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char6,
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
			MST_ITM_ORDER_IF_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char7,
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
			MST_ITM_ORDER_IF_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char8,
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
			MST_ITM_ORDER_IF_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char9,
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
			MST_ITM_ORDER_IF_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char10,
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
			MST_ITM_ORDER_IF_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char11,
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
			MST_ITM_ORDER_IF_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char12,
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
			MST_ITM_ORDER_IF_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char13,
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
			MST_ITM_ORDER_IF_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char14,
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
			MST_ITM_ORDER_IF_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char15,
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
			MST_ITM_ORDER_IF_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char16,
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
			MST_ITM_ORDER_IF_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char17,
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
			MST_ITM_ORDER_IF_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char18,
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
			MST_ITM_ORDER_IF_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char19,
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
			MST_ITM_ORDER_IF_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char20,
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
			MST_ITM_ORDER_IF_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char21,
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
			MST_ITM_ORDER_IF_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char22,
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
			MST_ITM_ORDER_IF_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char23,
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
			MST_ITM_ORDER_IF_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char24,
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
			MST_ITM_ORDER_IF_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char25,
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
			MST_ITM_ORDER_IF_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char26,
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
			MST_ITM_ORDER_IF_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char27,
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
			MST_ITM_ORDER_IF_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char28,
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
			MST_ITM_ORDER_IF_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char29,
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
			MST_ITM_ORDER_IF_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sub_char30,
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
			MST_ITM_ORDER_IF_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$sub_num1,
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
			MST_ITM_ORDER_IF_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$sub_num2,
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
			MST_ITM_ORDER_IF_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$sub_num3,
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
			MST_ITM_ORDER_IF_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$sub_num4,
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
			MST_ITM_ORDER_IF_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$sub_num5,
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
			MST_ITM_ORDER_IF_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$sub_dt1,
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
			MST_ITM_ORDER_IF_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$sub_dt2,
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
			MST_ITM_ORDER_IF_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$sub_dt3,
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
			MST_ITM_ORDER_IF_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$sub_dt4,
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
			MST_ITM_ORDER_IF_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ITM_ORDER_IF_R.$sub_dt5,
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
			MST_ITM_ORDER_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$batch_log_no,
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
			MST_ITM_ORDER_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$log_sub_key1,
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
			MST_ITM_ORDER_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$log_sub_key2,
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
			MST_ITM_ORDER_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$ins_usr_id,
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
			MST_ITM_ORDER_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$ins_usr_nm,
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
			MST_ITM_ORDER_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ITM_ORDER_IF_R.$ins_ts,
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
			MST_ITM_ORDER_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$ins_func_id,
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
			MST_ITM_ORDER_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ITM_ORDER_IF_R.$upd_cntr,
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
			MST_ITM_ORDER_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$upd_usr_id,
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
			MST_ITM_ORDER_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$upd_usr_nm,
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
			MST_ITM_ORDER_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ITM_ORDER_IF_R.$upd_ts,
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
			MST_ITM_ORDER_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$upd_func_id,
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
			MST_ITM_ORDER_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$upd_srv_req_no,
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
			MST_ITM_ORDER_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sdrv_sts_typ,
				"sdrv_sts_typ",
				null,
				false,
				true,
				false,
				false,
				true,
				"SDRV_IF1.SDRV_STS_TYP"
			)
		);
		COLUMN_MAP.put(
			MST_ITM_ORDER_IF_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$itm_nm,
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
			MST_ITM_ORDER_IF_R.$strg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$strg_loc_nm,
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
			MST_ITM_ORDER_IF_R.$mfg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$mfg_loc_nm,
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
			MST_ITM_ORDER_IF_R.$mst_mfg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$mst_mfg_loc_nm,
				"mst_mfg_loc_nm",
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
			MST_ITM_ORDER_IF_R.$sppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$sppl_nm,
				"sppl_nm",
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
			MST_ITM_ORDER_IF_R.$maker_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$maker_nm,
				"maker_nm",
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
			MST_ITM_ORDER_IF_R.$rqst_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$rqst_loc_nm,
				"rqst_loc_nm",
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
			MST_ITM_ORDER_IF_R.$rqst_wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$rqst_wg_nm,
				"rqst_wg_nm",
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
			MST_ITM_ORDER_IF_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ITM_ORDER_IF_R.$wg_nm,
				"wg_nm",
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
	public static MST_ITM_ORDER_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_ITM_ORDER_IF_R create(String alias) {
		MST_ITM_ORDER_IF_R row = new MST_ITM_ORDER_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_ITM_ORDER_IF_R createByName(T proto) {
		MST_ITM_ORDER_IF_R row = MST_ITM_ORDER_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ITM_ORDER_IF_R clone() {
		return (MST_ITM_ORDER_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ITM_ORDER_IF_R createInstance() {
		return (MST_ITM_ORDER_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ITM_ORDER_IF_R getValues(String... names) {
		return (MST_ITM_ORDER_IF_R) super.getValues(names);
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
	 public MSW_ITM_ORDER_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_ITM_ORDER_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_ITM_ORDER_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_ITM_ORDER_IF_KEY_R.TABLE_NAME);
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
	 * 部門マスタ適用開始日. Dept. master application start date.<p>
	 *
	 */
	public MCDate dpt_st_dt() {
		return getConstDate(offset + 5, $dpt_st_dt);
	}

	/**
	 * 部門マスタ適用開始日. Dept. master application start date.<p>
	 *
	 */
	public void dpt_st_dt(MCDate value) {
		setConstDate(offset + 5, $dpt_st_dt, value);
	}

	/**
	 * 送信元レコード更新日時. Update date and time of source record.<p>
	 *
	 */
	public MCTimestamp data_upd_ts() {
		return getConstTimestamp(offset + 6, $data_upd_ts);
	}

	/**
	 * 送信元レコード更新日時. Update date and time of source record.<p>
	 *
	 */
	public void data_upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 6, $data_upd_ts, value);
	}

	/**
	 * ＢＩ送信対象外ＦＬＧ. BI not to be exported flg..<p>
	 *
	 */
	public boolean bi_not_send_flg() {
		return getConstBoolean(offset + 7, $bi_not_send_flg);
	}

	/**
	 * ＢＩ送信対象外ＦＬＧ. BI not to be exported flg..<p>
	 *
	 */
	public void bi_not_send_flg(boolean value) {
		setConstBoolean(offset + 7, $bi_not_send_flg, value);
	}

	/**
	 * 入荷実績日. Actual receipt date.<p>
	 *
	 */
	public MCDate arr_act_tm() {
		return getConstDate(offset + 8, $arr_act_tm);
	}

	/**
	 * 入荷実績日. Actual receipt date.<p>
	 *
	 */
	public void arr_act_tm(MCDate value) {
		setConstDate(offset + 8, $arr_act_tm, value);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 9, $itm_ord_no);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 9, $itm_ord_no, value);
	}

	/**
	 * オーダ区分. Order type.<p>
	 *
	 */
	public String itm_ord_typ() {
		return getConstString(offset + 10, $itm_ord_typ);
	}

	/**
	 * オーダ区分. Order type.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		setConstString(offset + 10, $itm_ord_typ, value);
	}

	/**
	 * オーダ生成区分. Order generation type.<p>
	 *
	 */
	public String ord_gnrt_typ() {
		return getConstString(offset + 11, $ord_gnrt_typ);
	}

	/**
	 * オーダ生成区分. Order generation type.<p>
	 *
	 */
	public void ord_gnrt_typ(String value) {
		setConstString(offset + 11, $ord_gnrt_typ, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 12, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 12, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 13, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 13, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 14, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 14, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 15, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 15, $itm_sub3, value);
	}

	/**
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 16, $strg_loc_cd);
	}

	/**
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 16, $strg_loc_cd, value);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 17, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 17, $mfg_loc_cd, value);
	}

	/**
	 * マスタ製造場所ＣＤ. Master mfg. location cd..<p>
	 *
	 */
	public String mst_mfg_loc_cd() {
		return getConstString(offset + 18, $mst_mfg_loc_cd);
	}

	/**
	 * マスタ製造場所ＣＤ. Master mfg. location cd..<p>
	 *
	 */
	public void mst_mfg_loc_cd(String value) {
		setConstString(offset + 18, $mst_mfg_loc_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 19, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 19, $sppl_cd, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 20, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 20, $maker_cd, value);
	}

	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 21, $rqst_loc_cd);
	}

	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 21, $rqst_loc_cd, value);
	}

	/**
	 * 依頼先ワーキンググループＣＤ. Requested WG cd..<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 22, $rqst_wg_cd);
	}

	/**
	 * 依頼先ワーキンググループＣＤ. Requested WG cd..<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 22, $rqst_wg_cd, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 23, $bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 23, $bom_ptn, value);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 24, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 24, $oper_ptn, value);
	}

	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public MCNumber inst_qty() {
		return getConstNumber(offset + 25, $inst_qty);
	}

	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		setConstNumber(offset + 25, $inst_qty, value);
	}
	
	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public void inst_qty(int value) {
		setConstNumber(offset + 25, $inst_qty, value);
	}
	
	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public void inst_qty(long value) {
		setConstNumber(offset + 25, $inst_qty, value);
	}
	
	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public void inst_qty(float value) {
		setConstNumber(offset + 25, $inst_qty, value);
	}
	
	/**
	 * 指図予定数量. Order scheduled qty..<p>
	 *
	 */
	public void inst_qty(double value) {
		setConstNumber(offset + 25, $inst_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return getConstNumber(offset + 26, $yield_schd_qty);
	}

	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 26, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		setConstNumber(offset + 26, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		setConstNumber(offset + 26, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		setConstNumber(offset + 26, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		setConstNumber(offset + 26, $yield_schd_qty, value);
	}
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public MCNumber not_inst_qty() {
		return getConstNumber(offset + 27, $not_inst_qty);
	}

	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public void not_inst_qty(MCNumber value) {
		setConstNumber(offset + 27, $not_inst_qty, value);
	}
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public void not_inst_qty(int value) {
		setConstNumber(offset + 27, $not_inst_qty, value);
	}
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public void not_inst_qty(long value) {
		setConstNumber(offset + 27, $not_inst_qty, value);
	}
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public void not_inst_qty(float value) {
		setConstNumber(offset + 27, $not_inst_qty, value);
	}
	
	/**
	 * 未指図数量. Unordered qty..<p>
	 *
	 */
	public void not_inst_qty(double value) {
		setConstNumber(offset + 27, $not_inst_qty, value);
	}
	
	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 28, $mfg_inst_unit_typ);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 28, $mfg_inst_unit_typ, value);
	}

	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public MCNumber inst_yield_schd_qty() {
		return getConstNumber(offset + 29, $inst_yield_schd_qty);
	}

	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public void inst_yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 29, $inst_yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public void inst_yield_schd_qty(int value) {
		setConstNumber(offset + 29, $inst_yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public void inst_yield_schd_qty(long value) {
		setConstNumber(offset + 29, $inst_yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public void inst_yield_schd_qty(float value) {
		setConstNumber(offset + 29, $inst_yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量（指図・発注）. Output scheduled qty. (Order/PO).<p>
	 *
	 */
	public void inst_yield_schd_qty(double value) {
		setConstNumber(offset + 29, $inst_yield_schd_qty, value);
	}
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public MCNumber yield_act_qty() {
		return getConstNumber(offset + 30, $yield_act_qty);
	}

	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public void yield_act_qty(MCNumber value) {
		setConstNumber(offset + 30, $yield_act_qty, value);
	}
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public void yield_act_qty(int value) {
		setConstNumber(offset + 30, $yield_act_qty, value);
	}
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public void yield_act_qty(long value) {
		setConstNumber(offset + 30, $yield_act_qty, value);
	}
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public void yield_act_qty(float value) {
		setConstNumber(offset + 30, $yield_act_qty, value);
	}
	
	/**
	 * 出来高実績数量（入荷・出来高）. Output result qty. (Receipt/output).<p>
	 *
	 */
	public void yield_act_qty(double value) {
		setConstNumber(offset + 30, $yield_act_qty, value);
	}
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public MCNumber purc_act_qty() {
		return getConstNumber(offset + 31, $purc_act_qty);
	}

	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public void purc_act_qty(MCNumber value) {
		setConstNumber(offset + 31, $purc_act_qty, value);
	}
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public void purc_act_qty(int value) {
		setConstNumber(offset + 31, $purc_act_qty, value);
	}
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public void purc_act_qty(long value) {
		setConstNumber(offset + 31, $purc_act_qty, value);
	}
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public void purc_act_qty(float value) {
		setConstNumber(offset + 31, $purc_act_qty, value);
	}
	
	/**
	 * 仕入実績数量. Purchase result qty..<p>
	 *
	 */
	public void purc_act_qty(double value) {
		setConstNumber(offset + 31, $purc_act_qty, value);
	}
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public MCNumber insp_act_qty() {
		return getConstNumber(offset + 32, $insp_act_qty);
	}

	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public void insp_act_qty(MCNumber value) {
		setConstNumber(offset + 32, $insp_act_qty, value);
	}
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public void insp_act_qty(int value) {
		setConstNumber(offset + 32, $insp_act_qty, value);
	}
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public void insp_act_qty(long value) {
		setConstNumber(offset + 32, $insp_act_qty, value);
	}
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public void insp_act_qty(float value) {
		setConstNumber(offset + 32, $insp_act_qty, value);
	}
	
	/**
	 * 検査実績数量. Inspection result qty..<p>
	 *
	 */
	public void insp_act_qty(double value) {
		setConstNumber(offset + 32, $insp_act_qty, value);
	}
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return getConstNumber(offset + 33, $nmr_qty);
	}

	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		setConstNumber(offset + 33, $nmr_qty, value);
	}
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public void nmr_qty(int value) {
		setConstNumber(offset + 33, $nmr_qty, value);
	}
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public void nmr_qty(long value) {
		setConstNumber(offset + 33, $nmr_qty, value);
	}
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public void nmr_qty(float value) {
		setConstNumber(offset + 33, $nmr_qty, value);
	}
	
	/**
	 * 歩留分子. Yield numerator.<p>
	 *
	 */
	public void nmr_qty(double value) {
		setConstNumber(offset + 33, $nmr_qty, value);
	}
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return getConstNumber(offset + 34, $dnm_qty);
	}

	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		setConstNumber(offset + 34, $dnm_qty, value);
	}
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public void dnm_qty(int value) {
		setConstNumber(offset + 34, $dnm_qty, value);
	}
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public void dnm_qty(long value) {
		setConstNumber(offset + 34, $dnm_qty, value);
	}
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public void dnm_qty(float value) {
		setConstNumber(offset + 34, $dnm_qty, value);
	}
	
	/**
	 * 歩留分母. Yield denominator.<p>
	 *
	 */
	public void dnm_qty(double value) {
		setConstNumber(offset + 34, $dnm_qty, value);
	}
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public MCNumber fxd_yield_qty() {
		return getConstNumber(offset + 35, $fxd_yield_qty);
	}

	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public void fxd_yield_qty(MCNumber value) {
		setConstNumber(offset + 35, $fxd_yield_qty, value);
	}
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public void fxd_yield_qty(int value) {
		setConstNumber(offset + 35, $fxd_yield_qty, value);
	}
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public void fxd_yield_qty(long value) {
		setConstNumber(offset + 35, $fxd_yield_qty, value);
	}
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public void fxd_yield_qty(float value) {
		setConstNumber(offset + 35, $fxd_yield_qty, value);
	}
	
	/**
	 * 固定歩留数量. Constant yield qty..<p>
	 *
	 */
	public void fxd_yield_qty(double value) {
		setConstNumber(offset + 35, $fxd_yield_qty, value);
	}
	
	/**
	 * 品目オーダ状況区分. Item order status type.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return getConstString(offset + 36, $itm_ord_sts_typ);
	}

	/**
	 * 品目オーダ状況区分. Item order status type.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		setConstString(offset + 36, $itm_ord_sts_typ, value);
	}

	/**
	 * 確定日. Firm date.<p>
	 *
	 */
	public MCDate fix_dt() {
		return getConstDate(offset + 37, $fix_dt);
	}

	/**
	 * 確定日. Firm date.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		setConstDate(offset + 37, $fix_dt, value);
	}

	/**
	 * まとめＦＬＧ. Aggregation flg..<p>
	 *
	 */
	public boolean blk_flg() {
		return getConstBoolean(offset + 38, $blk_flg);
	}

	/**
	 * まとめＦＬＧ. Aggregation flg..<p>
	 *
	 */
	public void blk_flg(boolean value) {
		setConstBoolean(offset + 38, $blk_flg, value);
	}

	/**
	 * 発注予定日. Scheduled PO date.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return getConstDate(offset + 39, $po_schd_dt);
	}

	/**
	 * 発注予定日. Scheduled PO date.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 39, $po_schd_dt, value);
	}

	/**
	 * 発注予定日（ＭＲＰ）. Scheduled PO date (MRP).<p>
	 *
	 */
	public MCDate mrp_po_schd_dt() {
		return getConstDate(offset + 40, $mrp_po_schd_dt);
	}

	/**
	 * 発注予定日（ＭＲＰ）. Scheduled PO date (MRP).<p>
	 *
	 */
	public void mrp_po_schd_dt(MCDate value) {
		setConstDate(offset + 40, $mrp_po_schd_dt, value);
	}

	/**
	 * 発注日. PO date.<p>
	 *
	 */
	public MCDate po_dt() {
		return getConstDate(offset + 41, $po_dt);
	}

	/**
	 * 発注日. PO date.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		setConstDate(offset + 41, $po_dt, value);
	}

	/**
	 * 購入ＬＴ（ＭＲＰ）. Purchase LT (MRP).<p>
	 *
	 */
	public MCNumber mrp_purc_lt() {
		return getConstNumber(offset + 42, $mrp_purc_lt);
	}

	/**
	 * 購入ＬＴ（ＭＲＰ）. Purchase LT (MRP).<p>
	 *
	 */
	public void mrp_purc_lt(MCNumber value) {
		setConstNumber(offset + 42, $mrp_purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ（ＭＲＰ）. Purchase LT (MRP).<p>
	 *
	 */
	public void mrp_purc_lt(int value) {
		setConstNumber(offset + 42, $mrp_purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ（ＭＲＰ）. Purchase LT (MRP).<p>
	 *
	 */
	public void mrp_purc_lt(long value) {
		setConstNumber(offset + 42, $mrp_purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ（ＭＲＰ）. Purchase LT (MRP).<p>
	 *
	 */
	public void mrp_purc_lt(float value) {
		setConstNumber(offset + 42, $mrp_purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ（ＭＲＰ）. Purchase LT (MRP).<p>
	 *
	 */
	public void mrp_purc_lt(double value) {
		setConstNumber(offset + 42, $mrp_purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 43, $purc_lt);
	}

	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 43, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 43, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 43, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 43, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 43, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ（実績）. Purchase LT (Result).<p>
	 *
	 */
	public MCNumber act_purc_lt() {
		return getConstNumber(offset + 44, $act_purc_lt);
	}

	/**
	 * 購入ＬＴ（実績）. Purchase LT (Result).<p>
	 *
	 */
	public void act_purc_lt(MCNumber value) {
		setConstNumber(offset + 44, $act_purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ（実績）. Purchase LT (Result).<p>
	 *
	 */
	public void act_purc_lt(int value) {
		setConstNumber(offset + 44, $act_purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ（実績）. Purchase LT (Result).<p>
	 *
	 */
	public void act_purc_lt(long value) {
		setConstNumber(offset + 44, $act_purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ（実績）. Purchase LT (Result).<p>
	 *
	 */
	public void act_purc_lt(float value) {
		setConstNumber(offset + 44, $act_purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ（実績）. Purchase LT (Result).<p>
	 *
	 */
	public void act_purc_lt(double value) {
		setConstNumber(offset + 44, $act_purc_lt, value);
	}
	
	/**
	 * 製造着手予定日. Scheduled mfg. start date.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 45, $mfg_st_schd_dt);
	}

	/**
	 * 製造着手予定日. Scheduled mfg. start date.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 45, $mfg_st_schd_dt, value);
	}

	/**
	 * 製造着手予定日（ＭＲＰ）. Scheduled mfg. start date (MRP).<p>
	 *
	 */
	public MCDate mrp_mfg_st_schd_dt() {
		return getConstDate(offset + 46, $mrp_mfg_st_schd_dt);
	}

	/**
	 * 製造着手予定日（ＭＲＰ）. Scheduled mfg. start date (MRP).<p>
	 *
	 */
	public void mrp_mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 46, $mrp_mfg_st_schd_dt, value);
	}

	/**
	 * 製造着手予定日（指図）. Scheduled mfg. start date (Order).<p>
	 *
	 */
	public MCDate inst_mfg_st_schd_dt() {
		return getConstDate(offset + 47, $inst_mfg_st_schd_dt);
	}

	/**
	 * 製造着手予定日（指図）. Scheduled mfg. start date (Order).<p>
	 *
	 */
	public void inst_mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 47, $inst_mfg_st_schd_dt, value);
	}

	/**
	 * 製造着手実績日. Actual mfg. start date.<p>
	 *
	 */
	public MCDate mfg_st_act_dt() {
		return getConstDate(offset + 48, $mfg_st_act_dt);
	}

	/**
	 * 製造着手実績日. Actual mfg. start date.<p>
	 *
	 */
	public void mfg_st_act_dt(MCDate value) {
		setConstDate(offset + 48, $mfg_st_act_dt, value);
	}

	/**
	 * 製造終了予定日. Scheduled mfg. end date.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return getConstDate(offset + 49, $mfg_end_schd_dt);
	}

	/**
	 * 製造終了予定日. Scheduled mfg. end date.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 49, $mfg_end_schd_dt, value);
	}

	/**
	 * 製造終了予定日（ＭＲＰ）. Scheduled mfg. end date (MRP).<p>
	 *
	 */
	public MCDate mrp_mfg_end_schd_dt() {
		return getConstDate(offset + 50, $mrp_mfg_end_schd_dt);
	}

	/**
	 * 製造終了予定日（ＭＲＰ）. Scheduled mfg. end date (MRP).<p>
	 *
	 */
	public void mrp_mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 50, $mrp_mfg_end_schd_dt, value);
	}

	/**
	 * 製造終了予定日（指図）. Scheduled mfg. end date (Order).<p>
	 *
	 */
	public MCDate inst_mfg_end_schd_dt() {
		return getConstDate(offset + 51, $inst_mfg_end_schd_dt);
	}

	/**
	 * 製造終了予定日（指図）. Scheduled mfg. end date (Order).<p>
	 *
	 */
	public void inst_mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 51, $inst_mfg_end_schd_dt, value);
	}

	/**
	 * 製造終了実績日. Actual mfg. end date.<p>
	 *
	 */
	public MCDate mfg_end_act_dt() {
		return getConstDate(offset + 52, $mfg_end_act_dt);
	}

	/**
	 * 製造終了実績日. Actual mfg. end date.<p>
	 *
	 */
	public void mfg_end_act_dt(MCDate value) {
		setConstDate(offset + 52, $mfg_end_act_dt, value);
	}

	/**
	 * 製造ＬＴ（ＭＲＰ）. Mfg. LT (MRP).<p>
	 *
	 */
	public MCNumber mrp_mfg_lt() {
		return getConstNumber(offset + 53, $mrp_mfg_lt);
	}

	/**
	 * 製造ＬＴ（ＭＲＰ）. Mfg. LT (MRP).<p>
	 *
	 */
	public void mrp_mfg_lt(MCNumber value) {
		setConstNumber(offset + 53, $mrp_mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ（ＭＲＰ）. Mfg. LT (MRP).<p>
	 *
	 */
	public void mrp_mfg_lt(int value) {
		setConstNumber(offset + 53, $mrp_mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ（ＭＲＰ）. Mfg. LT (MRP).<p>
	 *
	 */
	public void mrp_mfg_lt(long value) {
		setConstNumber(offset + 53, $mrp_mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ（ＭＲＰ）. Mfg. LT (MRP).<p>
	 *
	 */
	public void mrp_mfg_lt(float value) {
		setConstNumber(offset + 53, $mrp_mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ（ＭＲＰ）. Mfg. LT (MRP).<p>
	 *
	 */
	public void mrp_mfg_lt(double value) {
		setConstNumber(offset + 53, $mrp_mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 54, $mfg_lt);
	}

	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 54, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 54, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 54, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 54, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 54, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ（実績）. Mfg. LT (Result).<p>
	 *
	 */
	public MCNumber act_mfg_lt() {
		return getConstNumber(offset + 55, $act_mfg_lt);
	}

	/**
	 * 製造ＬＴ（実績）. Mfg. LT (Result).<p>
	 *
	 */
	public void act_mfg_lt(MCNumber value) {
		setConstNumber(offset + 55, $act_mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ（実績）. Mfg. LT (Result).<p>
	 *
	 */
	public void act_mfg_lt(int value) {
		setConstNumber(offset + 55, $act_mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ（実績）. Mfg. LT (Result).<p>
	 *
	 */
	public void act_mfg_lt(long value) {
		setConstNumber(offset + 55, $act_mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ（実績）. Mfg. LT (Result).<p>
	 *
	 */
	public void act_mfg_lt(float value) {
		setConstNumber(offset + 55, $act_mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ（実績）. Mfg. LT (Result).<p>
	 *
	 */
	public void act_mfg_lt(double value) {
		setConstNumber(offset + 55, $act_mfg_lt, value);
	}
	
	/**
	 * 出庫予定日. Scheduled GI date.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 56, $gi_schd_dt);
	}

	/**
	 * 出庫予定日. Scheduled GI date.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 56, $gi_schd_dt, value);
	}

	/**
	 * 出庫予定日（ＭＲＰ）. Scheduled GI date (MRP).<p>
	 *
	 */
	public MCDate mrp_gi_schd_dt() {
		return getConstDate(offset + 57, $mrp_gi_schd_dt);
	}

	/**
	 * 出庫予定日（ＭＲＰ）. Scheduled GI date (MRP).<p>
	 *
	 */
	public void mrp_gi_schd_dt(MCDate value) {
		setConstDate(offset + 57, $mrp_gi_schd_dt, value);
	}

	/**
	 * 出庫予定日（指図）. Scheduled GI date (Order).<p>
	 *
	 */
	public MCDate inst_gi_schd_dt() {
		return getConstDate(offset + 58, $inst_gi_schd_dt);
	}

	/**
	 * 出庫予定日（指図）. Scheduled GI date (Order).<p>
	 *
	 */
	public void inst_gi_schd_dt(MCDate value) {
		setConstDate(offset + 58, $inst_gi_schd_dt, value);
	}

	/**
	 * 出庫実績日. Actual GI date.<p>
	 *
	 */
	public MCDate gi_act_dt() {
		return getConstDate(offset + 59, $gi_act_dt);
	}

	/**
	 * 出庫実績日. Actual GI date.<p>
	 *
	 */
	public void gi_act_dt(MCDate value) {
		setConstDate(offset + 59, $gi_act_dt, value);
	}

	/**
	 * 格納完了予定日. Scheduled storage completion date.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return getConstDate(offset + 60, $strg_schd_dt);
	}

	/**
	 * 格納完了予定日. Scheduled storage completion date.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		setConstDate(offset + 60, $strg_schd_dt, value);
	}

	/**
	 * 格納完了予定日（ＭＲＰ）. Scheduled storage completion date (MRP).<p>
	 *
	 */
	public MCDate mrp_strg_schd_dt() {
		return getConstDate(offset + 61, $mrp_strg_schd_dt);
	}

	/**
	 * 格納完了予定日（ＭＲＰ）. Scheduled storage completion date (MRP).<p>
	 *
	 */
	public void mrp_strg_schd_dt(MCDate value) {
		setConstDate(offset + 61, $mrp_strg_schd_dt, value);
	}

	/**
	 * 格納完了予定日（指図・発注）. Scheduled storage completion date (Order/PO).<p>
	 *
	 */
	public MCDate inst_strg_schd_dt() {
		return getConstDate(offset + 62, $inst_strg_schd_dt);
	}

	/**
	 * 格納完了予定日（指図・発注）. Scheduled storage completion date (Order/PO).<p>
	 *
	 */
	public void inst_strg_schd_dt(MCDate value) {
		setConstDate(offset + 62, $inst_strg_schd_dt, value);
	}

	/**
	 * 格納完了実績日. Actual storage completion date.<p>
	 *
	 */
	public MCDate strg_act_dt() {
		return getConstDate(offset + 63, $strg_act_dt);
	}

	/**
	 * 格納完了実績日. Actual storage completion date.<p>
	 *
	 */
	public void strg_act_dt(MCDate value) {
		setConstDate(offset + 63, $strg_act_dt, value);
	}

	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 64, $xfr_lt);
	}

	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 64, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 64, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 64, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 64, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 64, $xfr_lt, value);
	}
	
	/**
	 * 検収予定日. Scheduled acceptance date.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 65, $accpt_schd_dt);
	}

	/**
	 * 検収予定日. Scheduled acceptance date.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 65, $accpt_schd_dt, value);
	}

	/**
	 * 検収予定日（ＭＲＰ）. Scheduled acceptance date (MRP).<p>
	 *
	 */
	public MCDate mrp_accpt_schd_dt() {
		return getConstDate(offset + 66, $mrp_accpt_schd_dt);
	}

	/**
	 * 検収予定日（ＭＲＰ）. Scheduled acceptance date (MRP).<p>
	 *
	 */
	public void mrp_accpt_schd_dt(MCDate value) {
		setConstDate(offset + 66, $mrp_accpt_schd_dt, value);
	}

	/**
	 * 検収予定日（発注）. Scheduled acceptance date (PO).<p>
	 *
	 */
	public MCDate inst_accpt_schd_dt() {
		return getConstDate(offset + 67, $inst_accpt_schd_dt);
	}

	/**
	 * 検収予定日（発注）. Scheduled acceptance date (PO).<p>
	 *
	 */
	public void inst_accpt_schd_dt(MCDate value) {
		setConstDate(offset + 67, $inst_accpt_schd_dt, value);
	}

	/**
	 * 検収実績日. Actual acceptance date.<p>
	 *
	 */
	public MCDate accpt_act_dt() {
		return getConstDate(offset + 68, $accpt_act_dt);
	}

	/**
	 * 検収実績日. Actual acceptance date.<p>
	 *
	 */
	public void accpt_act_dt(MCDate value) {
		setConstDate(offset + 68, $accpt_act_dt, value);
	}

	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 69, $accpt_insp_lt);
	}

	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 69, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 69, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 69, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 69, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 69, $accpt_insp_lt, value);
	}
	
	/**
	 * 検査着手予定日. Scheduled inspection start date.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return getConstDate(offset + 70, $insp_st_schd_dt);
	}

	/**
	 * 検査着手予定日. Scheduled inspection start date.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 70, $insp_st_schd_dt, value);
	}

	/**
	 * 検査着手予定日（ＭＲＰ）. Scheduled inspection start date (MRP).<p>
	 *
	 */
	public MCDate mrp_insp_st_schd_dt() {
		return getConstDate(offset + 71, $mrp_insp_st_schd_dt);
	}

	/**
	 * 検査着手予定日（ＭＲＰ）. Scheduled inspection start date (MRP).<p>
	 *
	 */
	public void mrp_insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 71, $mrp_insp_st_schd_dt, value);
	}

	/**
	 * 検査着手予定日（指図・発注）. Scheduled inspection start date (Order/PO).<p>
	 *
	 */
	public MCDate inst_insp_st_schd_dt() {
		return getConstDate(offset + 72, $inst_insp_st_schd_dt);
	}

	/**
	 * 検査着手予定日（指図・発注）. Scheduled inspection start date (Order/PO).<p>
	 *
	 */
	public void inst_insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 72, $inst_insp_st_schd_dt, value);
	}

	/**
	 * 検査着手実績日. Actual inspection start date.<p>
	 *
	 */
	public MCDate insp_st_act_dt() {
		return getConstDate(offset + 73, $insp_st_act_dt);
	}

	/**
	 * 検査着手実績日. Actual inspection start date.<p>
	 *
	 */
	public void insp_st_act_dt(MCDate value) {
		setConstDate(offset + 73, $insp_st_act_dt, value);
	}

	/**
	 * 検査終了予定日. Scheduled inspection end date.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return getConstDate(offset + 74, $insp_end_schd_dt);
	}

	/**
	 * 検査終了予定日. Scheduled inspection end date.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 74, $insp_end_schd_dt, value);
	}

	/**
	 * 検査終了予定日（ＭＲＰ）. Scheduled inspection end date (MRP).<p>
	 *
	 */
	public MCDate mrp_insp_end_schd_dt() {
		return getConstDate(offset + 75, $mrp_insp_end_schd_dt);
	}

	/**
	 * 検査終了予定日（ＭＲＰ）. Scheduled inspection end date (MRP).<p>
	 *
	 */
	public void mrp_insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 75, $mrp_insp_end_schd_dt, value);
	}

	/**
	 * 検査終了予定日（指図・発注）. Scheduled inspection end date (Order/PO).<p>
	 *
	 */
	public MCDate inst_insp_end_schd_dt() {
		return getConstDate(offset + 76, $inst_insp_end_schd_dt);
	}

	/**
	 * 検査終了予定日（指図・発注）. Scheduled inspection end date (Order/PO).<p>
	 *
	 */
	public void inst_insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 76, $inst_insp_end_schd_dt, value);
	}

	/**
	 * 検査終了実績日. Actual inspection end date.<p>
	 *
	 */
	public MCDate insp_end_act_dt() {
		return getConstDate(offset + 77, $insp_end_act_dt);
	}

	/**
	 * 検査終了実績日. Actual inspection end date.<p>
	 *
	 */
	public void insp_end_act_dt(MCDate value) {
		setConstDate(offset + 77, $insp_end_act_dt, value);
	}

	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 78, $insp_lt);
	}

	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 78, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 78, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 78, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 78, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 78, $insp_lt, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 79, $insp_offst);
	}

	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 79, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 79, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 79, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 79, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 79, $insp_offst, value);
	}
	
	/**
	 * 使用可能予定日（ＭＲＰ）. Available date (MRP).<p>
	 *
	 */
	public MCDate mrp_avl_schd_dt() {
		return getConstDate(offset + 80, $mrp_avl_schd_dt);
	}

	/**
	 * 使用可能予定日（ＭＲＰ）. Available date (MRP).<p>
	 *
	 */
	public void mrp_avl_schd_dt(MCDate value) {
		setConstDate(offset + 80, $mrp_avl_schd_dt, value);
	}

	/**
	 * 使用可能予定日. Available date.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 81, $avl_schd_dt);
	}

	/**
	 * 使用可能予定日. Available date.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 81, $avl_schd_dt, value);
	}

	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 82, $master_dt);
	}

	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 82, $master_dt, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 83, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 83, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 84, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 84, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 85, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 85, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 86, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 86, $sno4, value);
	}

	/**
	 * 期限切れ日. Expired date.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 87, $lmt_dt);
	}

	/**
	 * 期限切れ日. Expired date.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 87, $lmt_dt, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 88, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 88, $wg_cd, value);
	}

	/**
	 * 所要ＮＯ. Requirements No..<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 89, $rqmt_no);
	}

	/**
	 * 所要ＮＯ. Requirements No..<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 89, $rqmt_no, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 90, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 90, $intr_rmrks, value);
	}

	/**
	 * 製造指図時品目オーダ状況区分. Item order at mfg. order status type.<p>
	 *
	 */
	public String inst_itm_ord_sts_typ() {
		return getConstString(offset + 91, $inst_itm_ord_sts_typ);
	}

	/**
	 * 製造指図時品目オーダ状況区分. Item order at mfg. order status type.<p>
	 *
	 */
	public void inst_itm_ord_sts_typ(String value) {
		setConstString(offset + 91, $inst_itm_ord_sts_typ, value);
	}

	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 92, $arr_pr_no);
	}

	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 92, $arr_pr_no, value);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 93, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 93, $po_d_no, value);
	}

	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public MCNumber std_purc_lt() {
		return getConstNumber(offset + 94, $std_purc_lt);
	}

	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(MCNumber value) {
		setConstNumber(offset + 94, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(int value) {
		setConstNumber(offset + 94, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(long value) {
		setConstNumber(offset + 94, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(float value) {
		setConstNumber(offset + 94, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(double value) {
		setConstNumber(offset + 94, $std_purc_lt, value);
	}
	
	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 95, $dlv_rqst_tm);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 95, $dlv_rqst_tm, value);
	}

	/**
	 * 依頼元納入希望日時. Request source desired delivery date and time.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return getConstDate(offset + 96, $rqst_dlv_rqst_tm);
	}

	/**
	 * 依頼元納入希望日時. Request source desired delivery date and time.<p>
	 *
	 */
	public void rqst_dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 96, $rqst_dlv_rqst_tm, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 97, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 97, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 98, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 98, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 99, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 99, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 100, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 100, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 101, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 101, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 102, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 102, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 103, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 103, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 104, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 104, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 105, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 105, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 106, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 106, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 107, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 107, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 108, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 108, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 109, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 109, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 110, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 110, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 111, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 111, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 112, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 112, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 113, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 113, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 114, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 114, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 115, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 115, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 116, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 116, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 117, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 117, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 118, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 118, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 119, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 119, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 120, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 120, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 121, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 121, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 122, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 122, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 123, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 123, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 124, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 124, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 125, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 125, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 126, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 126, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 127, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 127, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 127, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 127, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 127, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 127, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 128, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 128, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 128, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 128, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 128, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 128, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 129, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 129, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 129, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 129, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 129, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 129, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 130, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 130, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 130, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 130, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 130, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 130, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 131, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 131, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 131, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 131, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 131, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 131, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 132, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 132, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 133, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 133, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 134, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 134, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 135, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 135, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 136, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 136, $sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 137, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 137, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 138, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 138, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 138, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 138, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 138, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 138, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 139, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 139, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 139, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 139, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 139, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 139, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 140, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 140, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 141, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 141, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 142, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 142, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 143, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 143, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 144, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 144, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 144, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 144, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 144, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 144, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 145, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 145, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 146, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 146, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 147, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 147, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 148, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 148, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 149, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 149, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 150, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 150, $sdrv_sts_typ, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 151, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 151, $itm_nm, value);
	}

	/**
	 * 格納場所名. Storage location name.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 152, $strg_loc_nm);
	}

	/**
	 * 格納場所名. Storage location name.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 152, $strg_loc_nm, value);
	}

	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 153, $mfg_loc_nm);
	}

	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 153, $mfg_loc_nm, value);
	}

	/**
	 * マスタ製造場所名. Master mfg. location name.<p>
	 *
	 */
	public String mst_mfg_loc_nm() {
		return getConstString(offset + 154, $mst_mfg_loc_nm);
	}

	/**
	 * マスタ製造場所名. Master mfg. location name.<p>
	 *
	 */
	public void mst_mfg_loc_nm(String value) {
		setConstString(offset + 154, $mst_mfg_loc_nm, value);
	}

	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 155, $sppl_nm);
	}

	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 155, $sppl_nm, value);
	}

	/**
	 * メーカ名. Maker name.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 156, $maker_nm);
	}

	/**
	 * メーカ名. Maker name.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 156, $maker_nm, value);
	}

	/**
	 * 依頼先場所名. Location name (Requested).<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 157, $rqst_loc_nm);
	}

	/**
	 * 依頼先場所名. Location name (Requested).<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 157, $rqst_loc_nm, value);
	}

	/**
	 * 依頼先ワーキンググループ名. Requested WG name.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 158, $rqst_wg_nm);
	}

	/**
	 * 依頼先ワーキンググループ名. Requested WG name.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 158, $rqst_wg_nm, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 159, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 159, $wg_nm, value);
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
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return inst_itm_ord_sts_typ();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mst_mfg_loc_nm.equalsIgnoreCase(name)) {
			return mst_mfg_loc_nm();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			return mrp_purc_lt();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			return act_purc_lt();
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			return mrp_mfg_lt();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			return act_mfg_lt();
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			return std_purc_lt();
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
		if ($dpt_st_dt.equalsIgnoreCase(name)) {
			return dpt_st_dt();
		}
		if ($arr_act_tm.equalsIgnoreCase(name)) {
			return arr_act_tm();
		}
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
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
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
		if ($data_upd_ts.equalsIgnoreCase(name)) {
			return data_upd_ts();
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			return bi_not_send_flg();
		}
		if ($blk_flg.equalsIgnoreCase(name)) {
			return blk_flg();
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
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return inst_itm_ord_sts_typ();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mst_mfg_loc_nm.equalsIgnoreCase(name)) {
			return mst_mfg_loc_nm();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			return mrp_purc_lt();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			return act_purc_lt();
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			return mrp_mfg_lt();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			return act_mfg_lt();
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			return std_purc_lt();
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
		if ($dpt_st_dt.equalsIgnoreCase(name)) {
			return dpt_st_dt();
		}
		if ($arr_act_tm.equalsIgnoreCase(name)) {
			return arr_act_tm();
		}
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
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
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
		if ($data_upd_ts.equalsIgnoreCase(name)) {
			return data_upd_ts();
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			return bi_not_send_flg();
		}
		if ($blk_flg.equalsIgnoreCase(name)) {
			return blk_flg();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			inst_itm_ord_sts_typ(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mst_mfg_loc_nm.equalsIgnoreCase(name)) {
			mst_mfg_loc_nm(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
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
		if ($dpt_st_dt.equalsIgnoreCase(name)) {
			dpt_st_dt(value);
			return;
		}
		if ($arr_act_tm.equalsIgnoreCase(name)) {
			arr_act_tm(value);
			return;
		}
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
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm(value);
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
		if ($data_upd_ts.equalsIgnoreCase(name)) {
			data_upd_ts(value);
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			bi_not_send_flg(value);
			return;
		}
		if ($blk_flg.equalsIgnoreCase(name)) {
			blk_flg(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			inst_itm_ord_sts_typ(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mst_mfg_loc_nm.equalsIgnoreCase(name)) {
			mst_mfg_loc_nm(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
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
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
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
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
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
		if ($dpt_st_dt.equalsIgnoreCase(name)) {
			dpt_st_dt(value);
			return;
		}
		if ($arr_act_tm.equalsIgnoreCase(name)) {
			arr_act_tm(value);
			return;
		}
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
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm(value);
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
		if ($data_upd_ts.equalsIgnoreCase(name)) {
			data_upd_ts(value);
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			bi_not_send_flg(value);
			return;
		}
		if ($blk_flg.equalsIgnoreCase(name)) {
			blk_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
