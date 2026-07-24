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
 * "品目詳細マスタ（製造）ビュー // Item details master (Mfg.) view"DBコンテナRowクラスです。<p>
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
 *  	<td>mfg_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造ＬＴ</td>
 *  	<td>Mfg. LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_lt_add_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造ＬＴ加算基準数量</td>
 *  	<td>Mfg. LT adds base qty.</td>
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
 *  	<td>purc_lt_add_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購入ＬＴ加算基準数量</td>
 *  	<td>Purchase LT adds standard qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入計上区分</td>
 *  	<td>Purchase recording type</td>
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
 *  	<td>buf_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>安全ＬＴ</td>
 *  	<td>Safety LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ord_fix_pd</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>オーダ自動確定期間（日）</td>
 *  	<td>Order auto-firming period (Date)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sz_day_week_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>曜日まとめ区分</td>
 *  	<td>Aggregation (by day of week) type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sz_week</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>曜日まとめ期間（週）</td>
 *  	<td>Aggregation (by day of week) period (Week)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sz_pd</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットまとめ期間（日）</td>
 *  	<td>Lot sizing period (Days)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>min_lot_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最小ロット数量</td>
 *  	<td>Min. lot qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>batch_lot_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>刻みロット数量</td>
 *  	<td>Increments lot qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>max_lot_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最大ロット数量</td>
 *  	<td>Max. lot qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>max_order</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最大オーダ件数</td>
 *  	<td>Number of max. order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prio</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>優先順</td>
 *  	<td>Priority</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>order_ratio</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>オーダ比率</td>
 *  	<td>Order ratio</td>
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
 *  	<td>mfg_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図数量</td>
 *  	<td>Mfg. order qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fxd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定必要数量</td>
 *  	<td>Fixed required qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_issue_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット発番タイミング区分</td>
 *  	<td>Lot numbering timing type</td>
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
 *  	<td>ln_stk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>棚・ライン格納ＦＬＧ</td>
 *  	<td>Rack/Line store flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_po_tgt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>先行手配対象ＦＬＧ</td>
 *  	<td>For long LT flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_rec_issue_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図時記録書発行ＦＬＧ</td>
 *  	<td>Issue record sheet at mfg. order flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>no_mfg_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造承認対象外ＦＬＧ</td>
 *  	<td>Not for mfg. approval flg.</td>
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
 *  	<td>purc_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買識別区分</td>
 *  	<td>Purchase identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買依頼先ワーキンググループＣＤ</td>
 *  	<td>Purchase request destination WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_batch_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注バッチＦＬＧ</td>
 *  	<td>PO batch flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsrc_std_qty1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源標準値１</td>
 *  	<td>Resource standard value 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsrc_unit_qty1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源単位数量１</td>
 *  	<td>Resource unit qty. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsrc_std_qty2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源標準値２</td>
 *  	<td>Resource standard value 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsrc_unit_qty2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源単位数量２</td>
 *  	<td>Resource unit qty. 2</td>
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
 *  	<td>not_mrp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＭＲＰ対象外ＦＬＧ</td>
 *  	<td>Not for MRP flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cost_ratio</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>原価比率</td>
 *  	<td>Cost ratio</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
public class MAVM_ITM_DTL_MFG_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_ITM_DTL_MFG";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
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
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	private static final MCPermColumnInfo _mfg_loc_cd = createColumnInfo("mfg_loc_cd");
	public final MCStringPermColumn mfg_loc_cd = createStringColumn(_mfg_loc_cd);
	
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
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	private static final MCPermColumnInfo _bom_ptn = createColumnInfo("bom_ptn");
	public final MCStringPermColumn bom_ptn = createStringColumn(_bom_ptn);
	
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
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	private static final MCPermColumnInfo _oper_ptn = createColumnInfo("oper_ptn");
	public final MCStringPermColumn oper_ptn = createStringColumn(_oper_ptn);
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public static final String $mfg_lt = "mfg_lt";
	private static final MCPermColumnInfo _mfg_lt = createColumnInfo("mfg_lt");
	public final MCNumberPermColumn mfg_lt = createNumberColumn(_mfg_lt);
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public static final String $mfg_lt_add_qty = "mfg_lt_add_qty";
	private static final MCPermColumnInfo _mfg_lt_add_qty = createColumnInfo("mfg_lt_add_qty");
	public final MCNumberPermColumn mfg_lt_add_qty = createNumberColumn(_mfg_lt_add_qty);
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
	private static final MCPermColumnInfo _purc_lt = createColumnInfo("purc_lt");
	public final MCNumberPermColumn purc_lt = createNumberColumn(_purc_lt);
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public static final String $purc_lt_add_qty = "purc_lt_add_qty";
	private static final MCPermColumnInfo _purc_lt_add_qty = createColumnInfo("purc_lt_add_qty");
	public final MCNumberPermColumn purc_lt_add_qty = createNumberColumn(_purc_lt_add_qty);
	
	/**
	 * 仕入計上区分. Purchase recording type.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	private static final MCPermColumnInfo _purc_basis_typ = createColumnInfo("purc_basis_typ");
	public final MCStringPermColumn purc_basis_typ = createStringColumn(_purc_basis_typ);
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public static final String $accpt_insp_lt = "accpt_insp_lt";
	private static final MCPermColumnInfo _accpt_insp_lt = createColumnInfo("accpt_insp_lt");
	public final MCNumberPermColumn accpt_insp_lt = createNumberColumn(_accpt_insp_lt);
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public static final String $buf_lt = "buf_lt";
	private static final MCPermColumnInfo _buf_lt = createColumnInfo("buf_lt");
	public final MCNumberPermColumn buf_lt = createNumberColumn(_buf_lt);
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public static final String $ord_fix_pd = "ord_fix_pd";
	private static final MCPermColumnInfo _ord_fix_pd = createColumnInfo("ord_fix_pd");
	public final MCNumberPermColumn ord_fix_pd = createNumberColumn(_ord_fix_pd);
	
	/**
	 * 曜日まとめ区分. Aggregation (by day of week) type.<p>
	 *
	 */
	public static final String $sz_day_week_typ = "sz_day_week_typ";
	private static final MCPermColumnInfo _sz_day_week_typ = createColumnInfo("sz_day_week_typ");
	public final MCStringPermColumn sz_day_week_typ = createStringColumn(_sz_day_week_typ);
	
	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public static final String $sz_week = "sz_week";
	private static final MCPermColumnInfo _sz_week = createColumnInfo("sz_week");
	public final MCNumberPermColumn sz_week = createNumberColumn(_sz_week);
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public static final String $lot_sz_pd = "lot_sz_pd";
	private static final MCPermColumnInfo _lot_sz_pd = createColumnInfo("lot_sz_pd");
	public final MCNumberPermColumn lot_sz_pd = createNumberColumn(_lot_sz_pd);
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public static final String $min_lot_qty = "min_lot_qty";
	private static final MCPermColumnInfo _min_lot_qty = createColumnInfo("min_lot_qty");
	public final MCNumberPermColumn min_lot_qty = createNumberColumn(_min_lot_qty);
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public static final String $batch_lot_qty = "batch_lot_qty";
	private static final MCPermColumnInfo _batch_lot_qty = createColumnInfo("batch_lot_qty");
	public final MCNumberPermColumn batch_lot_qty = createNumberColumn(_batch_lot_qty);
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public static final String $max_lot_qty = "max_lot_qty";
	private static final MCPermColumnInfo _max_lot_qty = createColumnInfo("max_lot_qty");
	public final MCNumberPermColumn max_lot_qty = createNumberColumn(_max_lot_qty);
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public static final String $max_order = "max_order";
	private static final MCPermColumnInfo _max_order = createColumnInfo("max_order");
	public final MCNumberPermColumn max_order = createNumberColumn(_max_order);
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public static final String $prio = "prio";
	private static final MCPermColumnInfo _prio = createColumnInfo("prio");
	public final MCNumberPermColumn prio = createNumberColumn(_prio);
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public static final String $order_ratio = "order_ratio";
	private static final MCPermColumnInfo _order_ratio = createColumnInfo("order_ratio");
	public final MCNumberPermColumn order_ratio = createNumberColumn(_order_ratio);
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public static final String $yield_schd_qty = "yield_schd_qty";
	private static final MCPermColumnInfo _yield_schd_qty = createColumnInfo("yield_schd_qty");
	public final MCNumberPermColumn yield_schd_qty = createNumberColumn(_yield_schd_qty);
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public static final String $mfg_inst_qty = "mfg_inst_qty";
	private static final MCPermColumnInfo _mfg_inst_qty = createColumnInfo("mfg_inst_qty");
	public final MCNumberPermColumn mfg_inst_qty = createNumberColumn(_mfg_inst_qty);
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public static final String $fxd_rqmt_qty = "fxd_rqmt_qty";
	private static final MCPermColumnInfo _fxd_rqmt_qty = createColumnInfo("fxd_rqmt_qty");
	public final MCNumberPermColumn fxd_rqmt_qty = createNumberColumn(_fxd_rqmt_qty);
	
	/**
	 * ロット発番タイミング区分. Lot numbering timing type.<p>
	 *
	 */
	public static final String $lot_issue_typ = "lot_issue_typ";
	private static final MCPermColumnInfo _lot_issue_typ = createColumnInfo("lot_issue_typ");
	public final MCStringPermColumn lot_issue_typ = createStringColumn(_lot_issue_typ);
	
	/**
	 * バックフラッシュ許可ＦＬＧ. Allow backflush flg..<p>
	 *
	 */
	public static final String $bkf_flg = "bkf_flg";
	private static final MCPermColumnInfo _bkf_flg = createColumnInfo("bkf_flg");
	public final MCBooleanPermColumn bkf_flg = createBooleanColumn(_bkf_flg);
	
	/**
	 * 棚・ライン格納ＦＬＧ. Rack/Line store flg..<p>
	 *
	 */
	public static final String $ln_stk_flg = "ln_stk_flg";
	private static final MCPermColumnInfo _ln_stk_flg = createColumnInfo("ln_stk_flg");
	public final MCBooleanPermColumn ln_stk_flg = createBooleanColumn(_ln_stk_flg);
	
	/**
	 * 先行手配対象ＦＬＧ. For long LT flg..<p>
	 *
	 */
	public static final String $pre_po_tgt_flg = "pre_po_tgt_flg";
	private static final MCPermColumnInfo _pre_po_tgt_flg = createColumnInfo("pre_po_tgt_flg");
	public final MCBooleanPermColumn pre_po_tgt_flg = createBooleanColumn(_pre_po_tgt_flg);
	
	/**
	 * 製造指図時記録書発行ＦＬＧ. Issue record sheet at mfg. order flg..<p>
	 *
	 */
	public static final String $inst_rec_issue_flg = "inst_rec_issue_flg";
	private static final MCPermColumnInfo _inst_rec_issue_flg = createColumnInfo("inst_rec_issue_flg");
	public final MCBooleanPermColumn inst_rec_issue_flg = createBooleanColumn(_inst_rec_issue_flg);
	
	/**
	 * 製造承認対象外ＦＬＧ. Not for mfg. approval flg..<p>
	 *
	 */
	public static final String $no_mfg_aprv_flg = "no_mfg_aprv_flg";
	private static final MCPermColumnInfo _no_mfg_aprv_flg = createColumnInfo("no_mfg_aprv_flg");
	public final MCBooleanPermColumn no_mfg_aprv_flg = createBooleanColumn(_no_mfg_aprv_flg);
	
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
	 * 購買識別区分. Purchase identification type.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	private static final MCPermColumnInfo _purc_id_typ = createColumnInfo("purc_id_typ");
	public final MCStringPermColumn purc_id_typ = createStringColumn(_purc_id_typ);
	
	/**
	 * 購買依頼先ワーキンググループＣＤ. Purchase request destination WG cd..<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	private static final MCPermColumnInfo _rqst_wg_cd = createColumnInfo("rqst_wg_cd");
	public final MCStringPermColumn rqst_wg_cd = createStringColumn(_rqst_wg_cd);
	
	/**
	 * 発注バッチＦＬＧ. PO batch flg..<p>
	 *
	 */
	public static final String $po_batch_flg = "po_batch_flg";
	private static final MCPermColumnInfo _po_batch_flg = createColumnInfo("po_batch_flg");
	public final MCBooleanPermColumn po_batch_flg = createBooleanColumn(_po_batch_flg);
	
	/**
	 * 資源標準値１. Resource standard value 1.<p>
	 *
	 */
	public static final String $rsrc_std_qty1 = "rsrc_std_qty1";
	private static final MCPermColumnInfo _rsrc_std_qty1 = createColumnInfo("rsrc_std_qty1");
	public final MCNumberPermColumn rsrc_std_qty1 = createNumberColumn(_rsrc_std_qty1);
	
	/**
	 * 資源単位数量１. Resource unit qty. 1.<p>
	 *
	 */
	public static final String $rsrc_unit_qty1 = "rsrc_unit_qty1";
	private static final MCPermColumnInfo _rsrc_unit_qty1 = createColumnInfo("rsrc_unit_qty1");
	public final MCNumberPermColumn rsrc_unit_qty1 = createNumberColumn(_rsrc_unit_qty1);
	
	/**
	 * 資源標準値２. Resource standard value 2.<p>
	 *
	 */
	public static final String $rsrc_std_qty2 = "rsrc_std_qty2";
	private static final MCPermColumnInfo _rsrc_std_qty2 = createColumnInfo("rsrc_std_qty2");
	public final MCNumberPermColumn rsrc_std_qty2 = createNumberColumn(_rsrc_std_qty2);
	
	/**
	 * 資源単位数量２. Resource unit qty. 2.<p>
	 *
	 */
	public static final String $rsrc_unit_qty2 = "rsrc_unit_qty2";
	private static final MCPermColumnInfo _rsrc_unit_qty2 = createColumnInfo("rsrc_unit_qty2");
	public final MCNumberPermColumn rsrc_unit_qty2 = createNumberColumn(_rsrc_unit_qty2);
	
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
	 * ＭＲＰ対象外ＦＬＧ. Not for MRP flg..<p>
	 *
	 */
	public static final String $not_mrp_flg = "not_mrp_flg";
	private static final MCPermColumnInfo _not_mrp_flg = createColumnInfo("not_mrp_flg");
	public final MCBooleanPermColumn not_mrp_flg = createBooleanColumn(_not_mrp_flg);
	
	/**
	 * 原価比率. Cost ratio.<p>
	 *
	 */
	public static final String $cost_ratio = "cost_ratio";
	private static final MCPermColumnInfo _cost_ratio = createColumnInfo("cost_ratio");
	public final MCNumberPermColumn cost_ratio = createNumberColumn(_cost_ratio);
	
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
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_lt_add_qty_META = createCommonMeta($mfg_lt_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta purc_lt_add_qty_META = createCommonMeta($purc_lt_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta buf_lt_META = createCommonMeta($buf_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta ord_fix_pd_META = createCommonMeta($ord_fix_pd, mcframe.commonMA.meta.MA_META.ORD_FIX_PD);
	public static final MCMeta sz_day_week_typ_META = createCommonMeta($sz_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta sz_week_META = createCommonMeta($sz_week, mcframe.commonMA.meta.MA_META.SZ_WEEK);
	public static final MCMeta lot_sz_pd_META = createCommonMeta($lot_sz_pd, mcframe.commonMA.meta.MA_META.LOT_SZ_PD);
	public static final MCMeta min_lot_qty_META = createCommonMeta($min_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta batch_lot_qty_META = createCommonMeta($batch_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta max_lot_qty_META = createCommonMeta($max_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta max_order_META = createCommonMeta($max_order, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta order_ratio_META = createCommonMeta($order_ratio, mcframe.commonMA.meta.MA_META.ORDER_RATIO);
	public static final MCMeta yield_schd_qty_META = createCommonMeta($yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_qty_META = createCommonMeta($mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_rqmt_qty_META = createCommonMeta($fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lot_issue_typ_META = createCommonMeta($lot_issue_typ, mcframe.commonMA.meta.MA_META.LOT_ISSUE_TYP);
	public static final MCMeta bkf_flg_META = createCommonMeta($bkf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ln_stk_flg_META = createCommonMeta($ln_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_po_tgt_flg_META = createCommonMeta($pre_po_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_rec_issue_flg_META = createCommonMeta($inst_rec_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_mfg_aprv_flg_META = createCommonMeta($no_mfg_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_lower_yield_META = createCommonMeta($itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_std_yield_META = createCommonMeta($itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_upper_yield_META = createCommonMeta($itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta po_batch_flg_META = createCommonMeta($po_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rsrc_std_qty1_META = createCommonMeta($rsrc_std_qty1, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rsrc_unit_qty1_META = createCommonMeta($rsrc_unit_qty1, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rsrc_std_qty2_META = createCommonMeta($rsrc_std_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rsrc_unit_qty2_META = createCommonMeta($rsrc_unit_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta not_mrp_flg_META = createCommonMeta($not_mrp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_ratio_META = createCommonMeta($cost_ratio, mcframe.commonMA.meta.MA_META.COST_RATIO);
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

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_ITM_DTL_MFG_R> constMetas = new ConstMetaList<MAVM_ITM_DTL_MFG_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			mfg_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			rqst_loc_cd_META,
			wg_cd_META,
			bom_ptn_META,
			st_dt_META,
			end_dt_META,
			oper_ptn_META,
			mfg_lt_META,
			mfg_lt_add_qty_META,
			purc_lt_META,
			purc_lt_add_qty_META,
			purc_basis_typ_META,
			accpt_insp_lt_META,
			buf_lt_META,
			ord_fix_pd_META,
			sz_day_week_typ_META,
			sz_week_META,
			lot_sz_pd_META,
			min_lot_qty_META,
			batch_lot_qty_META,
			max_lot_qty_META,
			max_order_META,
			prio_META,
			order_ratio_META,
			yield_schd_qty_META,
			mfg_inst_qty_META,
			fxd_rqmt_qty_META,
			lot_issue_typ_META,
			bkf_flg_META,
			ln_stk_flg_META,
			pre_po_tgt_flg_META,
			inst_rec_issue_flg_META,
			no_mfg_aprv_flg_META,
			itm_lower_yield_META,
			itm_std_yield_META,
			itm_upper_yield_META,
			purc_id_typ_META,
			rqst_wg_cd_META,
			po_batch_flg_META,
			rsrc_std_qty1_META,
			rsrc_unit_qty1_META,
			rsrc_std_qty2_META,
			rsrc_unit_qty2_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			not_mrp_flg_META,
			cost_ratio_META,
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
	protected MAVM_ITM_DTL_MFG_R(ConstMetaList<? extends MAVM_ITM_DTL_MFG_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_ITM_DTL_MFG_R(ConstMetaList<? extends MAVM_ITM_DTL_MFG_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$mfg_loc_cd,
				"mfg_loc_cd",
				mfg_loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$maker_cd,
				"maker_cd",
				maker_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$rqst_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$rqst_loc_cd,
				"rqst_loc_cd",
				rqst_loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$bom_ptn,
				"bom_ptn",
				bom_ptn,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAVM_ITM_DTL_MFG_R.$st_dt,
				"st_dt",
				st_dt,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAVM_ITM_DTL_MFG_R.$end_dt,
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
			MAVM_ITM_DTL_MFG_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$oper_ptn,
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
			MAVM_ITM_DTL_MFG_R.$mfg_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$mfg_lt,
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
			MAVM_ITM_DTL_MFG_R.$mfg_lt_add_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$mfg_lt_add_qty,
				"mfg_lt_add_qty",
				mfg_lt_add_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$purc_lt,
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
			MAVM_ITM_DTL_MFG_R.$purc_lt_add_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$purc_lt_add_qty,
				"purc_lt_add_qty",
				purc_lt_add_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$purc_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$purc_basis_typ,
				"purc_basis_typ",
				purc_basis_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$accpt_insp_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$accpt_insp_lt,
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
			MAVM_ITM_DTL_MFG_R.$buf_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$buf_lt,
				"buf_lt",
				buf_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$ord_fix_pd,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$ord_fix_pd,
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
			MAVM_ITM_DTL_MFG_R.$sz_day_week_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$sz_day_week_typ,
				"sz_day_week_typ",
				sz_day_week_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$sz_week,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$sz_week,
				"sz_week",
				sz_week,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$lot_sz_pd,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$lot_sz_pd,
				"lot_sz_pd",
				lot_sz_pd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$min_lot_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$min_lot_qty,
				"min_lot_qty",
				min_lot_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$batch_lot_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$batch_lot_qty,
				"batch_lot_qty",
				batch_lot_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$max_lot_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$max_lot_qty,
				"max_lot_qty",
				max_lot_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$max_order,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$max_order,
				"max_order",
				max_order,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$prio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$prio,
				"prio",
				prio,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$order_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$order_ratio,
				"order_ratio",
				order_ratio,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$yield_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$yield_schd_qty,
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
			MAVM_ITM_DTL_MFG_R.$mfg_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$mfg_inst_qty,
				"mfg_inst_qty",
				mfg_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$fxd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$fxd_rqmt_qty,
				"fxd_rqmt_qty",
				fxd_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$lot_issue_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$lot_issue_typ,
				"lot_issue_typ",
				lot_issue_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$bkf_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_DTL_MFG_R.$bkf_flg,
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
			MAVM_ITM_DTL_MFG_R.$ln_stk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_DTL_MFG_R.$ln_stk_flg,
				"ln_stk_flg",
				ln_stk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$pre_po_tgt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_DTL_MFG_R.$pre_po_tgt_flg,
				"pre_po_tgt_flg",
				pre_po_tgt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$inst_rec_issue_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_DTL_MFG_R.$inst_rec_issue_flg,
				"inst_rec_issue_flg",
				inst_rec_issue_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$no_mfg_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_DTL_MFG_R.$no_mfg_aprv_flg,
				"no_mfg_aprv_flg",
				no_mfg_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$itm_lower_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$itm_lower_yield,
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
			MAVM_ITM_DTL_MFG_R.$itm_std_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$itm_std_yield,
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
			MAVM_ITM_DTL_MFG_R.$itm_upper_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$itm_upper_yield,
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
			MAVM_ITM_DTL_MFG_R.$purc_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$purc_id_typ,
				"purc_id_typ",
				purc_id_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$rqst_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$rqst_wg_cd,
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
			MAVM_ITM_DTL_MFG_R.$po_batch_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_DTL_MFG_R.$po_batch_flg,
				"po_batch_flg",
				po_batch_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$rsrc_std_qty1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$rsrc_std_qty1,
				"rsrc_std_qty1",
				rsrc_std_qty1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$rsrc_unit_qty1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$rsrc_unit_qty1,
				"rsrc_unit_qty1",
				rsrc_unit_qty1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$rsrc_std_qty2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$rsrc_std_qty2,
				"rsrc_std_qty2",
				rsrc_std_qty2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$rsrc_unit_qty2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$rsrc_unit_qty2,
				"rsrc_unit_qty2",
				rsrc_unit_qty2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$sno1,
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
			MAVM_ITM_DTL_MFG_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$sno2,
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
			MAVM_ITM_DTL_MFG_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$sno3,
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
			MAVM_ITM_DTL_MFG_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$sno4,
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
			MAVM_ITM_DTL_MFG_R.$not_mrp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_DTL_MFG_R.$not_mrp_flg,
				"not_mrp_flg",
				not_mrp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$cost_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$cost_ratio,
				"cost_ratio",
				cost_ratio,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_DTL_MFG_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$memo1,
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
			MAVM_ITM_DTL_MFG_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$memo2,
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
			MAVM_ITM_DTL_MFG_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$memo3,
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
			MAVM_ITM_DTL_MFG_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_DTL_MFG_R.$del_flg,
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
			MAVM_ITM_DTL_MFG_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$del_usr_id,
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
			MAVM_ITM_DTL_MFG_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$del_usr_nm,
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
			MAVM_ITM_DTL_MFG_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_ITM_DTL_MFG_R.$del_ts,
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
			MAVM_ITM_DTL_MFG_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$ins_usr_id,
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
			MAVM_ITM_DTL_MFG_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$ins_usr_nm,
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
			MAVM_ITM_DTL_MFG_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_ITM_DTL_MFG_R.$ins_ts,
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
			MAVM_ITM_DTL_MFG_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$ins_func_id,
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
			MAVM_ITM_DTL_MFG_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_DTL_MFG_R.$upd_cntr,
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
			MAVM_ITM_DTL_MFG_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$upd_usr_id,
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
			MAVM_ITM_DTL_MFG_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$upd_usr_nm,
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
			MAVM_ITM_DTL_MFG_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_ITM_DTL_MFG_R.$upd_ts,
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
			MAVM_ITM_DTL_MFG_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$upd_func_id,
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
			MAVM_ITM_DTL_MFG_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_DTL_MFG_R.$upd_srv_req_no,
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
	public static MAVM_ITM_DTL_MFG_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_ITM_DTL_MFG_R create(String alias) {
		MAVM_ITM_DTL_MFG_R row = new MAVM_ITM_DTL_MFG_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_ITM_DTL_MFG_R createByName(T proto) {
		MAVM_ITM_DTL_MFG_R row = MAVM_ITM_DTL_MFG_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_DTL_MFG_R clone() {
		return (MAVM_ITM_DTL_MFG_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_DTL_MFG_R createInstance() {
		return (MAVM_ITM_DTL_MFG_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_DTL_MFG_R getValues(String... names) {
		return (MAVM_ITM_DTL_MFG_R) super.getValues(names);
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
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 4, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 4, $mfg_loc_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 5, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 5, $sppl_cd, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 6, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 6, $maker_cd, value);
	}

	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 7, $rqst_loc_cd);
	}

	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 7, $rqst_loc_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 9, $bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 9, $bom_ptn, value);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 10, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 10, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 11, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 11, $end_dt, value);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 12, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 12, $oper_ptn, value);
	}

	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 13, $mfg_lt);
	}

	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 13, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 13, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 13, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 13, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 13, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public MCNumber mfg_lt_add_qty() {
		return getConstNumber(offset + 14, $mfg_lt_add_qty);
	}

	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public void mfg_lt_add_qty(MCNumber value) {
		setConstNumber(offset + 14, $mfg_lt_add_qty, value);
	}
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public void mfg_lt_add_qty(int value) {
		setConstNumber(offset + 14, $mfg_lt_add_qty, value);
	}
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public void mfg_lt_add_qty(long value) {
		setConstNumber(offset + 14, $mfg_lt_add_qty, value);
	}
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public void mfg_lt_add_qty(float value) {
		setConstNumber(offset + 14, $mfg_lt_add_qty, value);
	}
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public void mfg_lt_add_qty(double value) {
		setConstNumber(offset + 14, $mfg_lt_add_qty, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 15, $purc_lt);
	}

	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 15, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 15, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 15, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 15, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 15, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public MCNumber purc_lt_add_qty() {
		return getConstNumber(offset + 16, $purc_lt_add_qty);
	}

	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public void purc_lt_add_qty(MCNumber value) {
		setConstNumber(offset + 16, $purc_lt_add_qty, value);
	}
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public void purc_lt_add_qty(int value) {
		setConstNumber(offset + 16, $purc_lt_add_qty, value);
	}
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public void purc_lt_add_qty(long value) {
		setConstNumber(offset + 16, $purc_lt_add_qty, value);
	}
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public void purc_lt_add_qty(float value) {
		setConstNumber(offset + 16, $purc_lt_add_qty, value);
	}
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public void purc_lt_add_qty(double value) {
		setConstNumber(offset + 16, $purc_lt_add_qty, value);
	}
	
	/**
	 * 仕入計上区分. Purchase recording type.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 17, $purc_basis_typ);
	}

	/**
	 * 仕入計上区分. Purchase recording type.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 17, $purc_basis_typ, value);
	}

	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 18, $accpt_insp_lt);
	}

	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 18, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 18, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 18, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 18, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 18, $accpt_insp_lt, value);
	}
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public MCNumber buf_lt() {
		return getConstNumber(offset + 19, $buf_lt);
	}

	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public void buf_lt(MCNumber value) {
		setConstNumber(offset + 19, $buf_lt, value);
	}
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public void buf_lt(int value) {
		setConstNumber(offset + 19, $buf_lt, value);
	}
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public void buf_lt(long value) {
		setConstNumber(offset + 19, $buf_lt, value);
	}
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public void buf_lt(float value) {
		setConstNumber(offset + 19, $buf_lt, value);
	}
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public void buf_lt(double value) {
		setConstNumber(offset + 19, $buf_lt, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return getConstNumber(offset + 20, $ord_fix_pd);
	}

	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		setConstNumber(offset + 20, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		setConstNumber(offset + 20, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		setConstNumber(offset + 20, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		setConstNumber(offset + 20, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		setConstNumber(offset + 20, $ord_fix_pd, value);
	}
	
	/**
	 * 曜日まとめ区分. Aggregation (by day of week) type.<p>
	 *
	 */
	public String sz_day_week_typ() {
		return getConstString(offset + 21, $sz_day_week_typ);
	}

	/**
	 * 曜日まとめ区分. Aggregation (by day of week) type.<p>
	 *
	 */
	public void sz_day_week_typ(String value) {
		setConstString(offset + 21, $sz_day_week_typ, value);
	}

	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public MCNumber sz_week() {
		return getConstNumber(offset + 22, $sz_week);
	}

	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public void sz_week(MCNumber value) {
		setConstNumber(offset + 22, $sz_week, value);
	}
	
	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public void sz_week(int value) {
		setConstNumber(offset + 22, $sz_week, value);
	}
	
	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public void sz_week(long value) {
		setConstNumber(offset + 22, $sz_week, value);
	}
	
	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public void sz_week(float value) {
		setConstNumber(offset + 22, $sz_week, value);
	}
	
	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public void sz_week(double value) {
		setConstNumber(offset + 22, $sz_week, value);
	}
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public MCNumber lot_sz_pd() {
		return getConstNumber(offset + 23, $lot_sz_pd);
	}

	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public void lot_sz_pd(MCNumber value) {
		setConstNumber(offset + 23, $lot_sz_pd, value);
	}
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public void lot_sz_pd(int value) {
		setConstNumber(offset + 23, $lot_sz_pd, value);
	}
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public void lot_sz_pd(long value) {
		setConstNumber(offset + 23, $lot_sz_pd, value);
	}
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public void lot_sz_pd(float value) {
		setConstNumber(offset + 23, $lot_sz_pd, value);
	}
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public void lot_sz_pd(double value) {
		setConstNumber(offset + 23, $lot_sz_pd, value);
	}
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public MCNumber min_lot_qty() {
		return getConstNumber(offset + 24, $min_lot_qty);
	}

	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public void min_lot_qty(MCNumber value) {
		setConstNumber(offset + 24, $min_lot_qty, value);
	}
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public void min_lot_qty(int value) {
		setConstNumber(offset + 24, $min_lot_qty, value);
	}
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public void min_lot_qty(long value) {
		setConstNumber(offset + 24, $min_lot_qty, value);
	}
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public void min_lot_qty(float value) {
		setConstNumber(offset + 24, $min_lot_qty, value);
	}
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public void min_lot_qty(double value) {
		setConstNumber(offset + 24, $min_lot_qty, value);
	}
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public MCNumber batch_lot_qty() {
		return getConstNumber(offset + 25, $batch_lot_qty);
	}

	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public void batch_lot_qty(MCNumber value) {
		setConstNumber(offset + 25, $batch_lot_qty, value);
	}
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public void batch_lot_qty(int value) {
		setConstNumber(offset + 25, $batch_lot_qty, value);
	}
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public void batch_lot_qty(long value) {
		setConstNumber(offset + 25, $batch_lot_qty, value);
	}
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public void batch_lot_qty(float value) {
		setConstNumber(offset + 25, $batch_lot_qty, value);
	}
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public void batch_lot_qty(double value) {
		setConstNumber(offset + 25, $batch_lot_qty, value);
	}
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public MCNumber max_lot_qty() {
		return getConstNumber(offset + 26, $max_lot_qty);
	}

	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public void max_lot_qty(MCNumber value) {
		setConstNumber(offset + 26, $max_lot_qty, value);
	}
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public void max_lot_qty(int value) {
		setConstNumber(offset + 26, $max_lot_qty, value);
	}
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public void max_lot_qty(long value) {
		setConstNumber(offset + 26, $max_lot_qty, value);
	}
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public void max_lot_qty(float value) {
		setConstNumber(offset + 26, $max_lot_qty, value);
	}
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public void max_lot_qty(double value) {
		setConstNumber(offset + 26, $max_lot_qty, value);
	}
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public MCNumber max_order() {
		return getConstNumber(offset + 27, $max_order);
	}

	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public void max_order(MCNumber value) {
		setConstNumber(offset + 27, $max_order, value);
	}
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public void max_order(int value) {
		setConstNumber(offset + 27, $max_order, value);
	}
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public void max_order(long value) {
		setConstNumber(offset + 27, $max_order, value);
	}
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public void max_order(float value) {
		setConstNumber(offset + 27, $max_order, value);
	}
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public void max_order(double value) {
		setConstNumber(offset + 27, $max_order, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 28, $prio);
	}

	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 28, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 28, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 28, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 28, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 28, $prio, value);
	}
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public MCNumber order_ratio() {
		return getConstNumber(offset + 29, $order_ratio);
	}

	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public void order_ratio(MCNumber value) {
		setConstNumber(offset + 29, $order_ratio, value);
	}
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public void order_ratio(int value) {
		setConstNumber(offset + 29, $order_ratio, value);
	}
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public void order_ratio(long value) {
		setConstNumber(offset + 29, $order_ratio, value);
	}
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public void order_ratio(float value) {
		setConstNumber(offset + 29, $order_ratio, value);
	}
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public void order_ratio(double value) {
		setConstNumber(offset + 29, $order_ratio, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return getConstNumber(offset + 30, $yield_schd_qty);
	}

	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 30, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		setConstNumber(offset + 30, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		setConstNumber(offset + 30, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		setConstNumber(offset + 30, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		setConstNumber(offset + 30, $yield_schd_qty, value);
	}
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public MCNumber mfg_inst_qty() {
		return getConstNumber(offset + 31, $mfg_inst_qty);
	}

	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public void mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 31, $mfg_inst_qty, value);
	}
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public void mfg_inst_qty(int value) {
		setConstNumber(offset + 31, $mfg_inst_qty, value);
	}
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public void mfg_inst_qty(long value) {
		setConstNumber(offset + 31, $mfg_inst_qty, value);
	}
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public void mfg_inst_qty(float value) {
		setConstNumber(offset + 31, $mfg_inst_qty, value);
	}
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public void mfg_inst_qty(double value) {
		setConstNumber(offset + 31, $mfg_inst_qty, value);
	}
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public MCNumber fxd_rqmt_qty() {
		return getConstNumber(offset + 32, $fxd_rqmt_qty);
	}

	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public void fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 32, $fxd_rqmt_qty, value);
	}
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public void fxd_rqmt_qty(int value) {
		setConstNumber(offset + 32, $fxd_rqmt_qty, value);
	}
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public void fxd_rqmt_qty(long value) {
		setConstNumber(offset + 32, $fxd_rqmt_qty, value);
	}
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public void fxd_rqmt_qty(float value) {
		setConstNumber(offset + 32, $fxd_rqmt_qty, value);
	}
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public void fxd_rqmt_qty(double value) {
		setConstNumber(offset + 32, $fxd_rqmt_qty, value);
	}
	
	/**
	 * ロット発番タイミング区分. Lot numbering timing type.<p>
	 *
	 */
	public String lot_issue_typ() {
		return getConstString(offset + 33, $lot_issue_typ);
	}

	/**
	 * ロット発番タイミング区分. Lot numbering timing type.<p>
	 *
	 */
	public void lot_issue_typ(String value) {
		setConstString(offset + 33, $lot_issue_typ, value);
	}

	/**
	 * バックフラッシュ許可ＦＬＧ. Allow backflush flg..<p>
	 *
	 */
	public boolean bkf_flg() {
		return getConstBoolean(offset + 34, $bkf_flg);
	}

	/**
	 * バックフラッシュ許可ＦＬＧ. Allow backflush flg..<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		setConstBoolean(offset + 34, $bkf_flg, value);
	}

	/**
	 * 棚・ライン格納ＦＬＧ. Rack/Line store flg..<p>
	 *
	 */
	public boolean ln_stk_flg() {
		return getConstBoolean(offset + 35, $ln_stk_flg);
	}

	/**
	 * 棚・ライン格納ＦＬＧ. Rack/Line store flg..<p>
	 *
	 */
	public void ln_stk_flg(boolean value) {
		setConstBoolean(offset + 35, $ln_stk_flg, value);
	}

	/**
	 * 先行手配対象ＦＬＧ. For long LT flg..<p>
	 *
	 */
	public boolean pre_po_tgt_flg() {
		return getConstBoolean(offset + 36, $pre_po_tgt_flg);
	}

	/**
	 * 先行手配対象ＦＬＧ. For long LT flg..<p>
	 *
	 */
	public void pre_po_tgt_flg(boolean value) {
		setConstBoolean(offset + 36, $pre_po_tgt_flg, value);
	}

	/**
	 * 製造指図時記録書発行ＦＬＧ. Issue record sheet at mfg. order flg..<p>
	 *
	 */
	public boolean inst_rec_issue_flg() {
		return getConstBoolean(offset + 37, $inst_rec_issue_flg);
	}

	/**
	 * 製造指図時記録書発行ＦＬＧ. Issue record sheet at mfg. order flg..<p>
	 *
	 */
	public void inst_rec_issue_flg(boolean value) {
		setConstBoolean(offset + 37, $inst_rec_issue_flg, value);
	}

	/**
	 * 製造承認対象外ＦＬＧ. Not for mfg. approval flg..<p>
	 *
	 */
	public boolean no_mfg_aprv_flg() {
		return getConstBoolean(offset + 38, $no_mfg_aprv_flg);
	}

	/**
	 * 製造承認対象外ＦＬＧ. Not for mfg. approval flg..<p>
	 *
	 */
	public void no_mfg_aprv_flg(boolean value) {
		setConstBoolean(offset + 38, $no_mfg_aprv_flg, value);
	}

	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return getConstNumber(offset + 39, $itm_lower_yield);
	}

	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 39, $itm_lower_yield, value);
	}
	
	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		setConstNumber(offset + 39, $itm_lower_yield, value);
	}
	
	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		setConstNumber(offset + 39, $itm_lower_yield, value);
	}
	
	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		setConstNumber(offset + 39, $itm_lower_yield, value);
	}
	
	/**
	 * 品目下限収率. Item min. yield.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		setConstNumber(offset + 39, $itm_lower_yield, value);
	}
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return getConstNumber(offset + 40, $itm_std_yield);
	}

	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		setConstNumber(offset + 40, $itm_std_yield, value);
	}
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		setConstNumber(offset + 40, $itm_std_yield, value);
	}
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		setConstNumber(offset + 40, $itm_std_yield, value);
	}
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		setConstNumber(offset + 40, $itm_std_yield, value);
	}
	
	/**
	 * 品目標準収率. Item standard yield.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		setConstNumber(offset + 40, $itm_std_yield, value);
	}
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return getConstNumber(offset + 41, $itm_upper_yield);
	}

	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 41, $itm_upper_yield, value);
	}
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		setConstNumber(offset + 41, $itm_upper_yield, value);
	}
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		setConstNumber(offset + 41, $itm_upper_yield, value);
	}
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		setConstNumber(offset + 41, $itm_upper_yield, value);
	}
	
	/**
	 * 品目上限収率. Item max. yield.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		setConstNumber(offset + 41, $itm_upper_yield, value);
	}
	
	/**
	 * 購買識別区分. Purchase identification type.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 42, $purc_id_typ);
	}

	/**
	 * 購買識別区分. Purchase identification type.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 42, $purc_id_typ, value);
	}

	/**
	 * 購買依頼先ワーキンググループＣＤ. Purchase request destination WG cd..<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 43, $rqst_wg_cd);
	}

	/**
	 * 購買依頼先ワーキンググループＣＤ. Purchase request destination WG cd..<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 43, $rqst_wg_cd, value);
	}

	/**
	 * 発注バッチＦＬＧ. PO batch flg..<p>
	 *
	 */
	public boolean po_batch_flg() {
		return getConstBoolean(offset + 44, $po_batch_flg);
	}

	/**
	 * 発注バッチＦＬＧ. PO batch flg..<p>
	 *
	 */
	public void po_batch_flg(boolean value) {
		setConstBoolean(offset + 44, $po_batch_flg, value);
	}

	/**
	 * 資源標準値１. Resource standard value 1.<p>
	 *
	 */
	public MCNumber rsrc_std_qty1() {
		return getConstNumber(offset + 45, $rsrc_std_qty1);
	}

	/**
	 * 資源標準値１. Resource standard value 1.<p>
	 *
	 */
	public void rsrc_std_qty1(MCNumber value) {
		setConstNumber(offset + 45, $rsrc_std_qty1, value);
	}
	
	/**
	 * 資源標準値１. Resource standard value 1.<p>
	 *
	 */
	public void rsrc_std_qty1(int value) {
		setConstNumber(offset + 45, $rsrc_std_qty1, value);
	}
	
	/**
	 * 資源標準値１. Resource standard value 1.<p>
	 *
	 */
	public void rsrc_std_qty1(long value) {
		setConstNumber(offset + 45, $rsrc_std_qty1, value);
	}
	
	/**
	 * 資源標準値１. Resource standard value 1.<p>
	 *
	 */
	public void rsrc_std_qty1(float value) {
		setConstNumber(offset + 45, $rsrc_std_qty1, value);
	}
	
	/**
	 * 資源標準値１. Resource standard value 1.<p>
	 *
	 */
	public void rsrc_std_qty1(double value) {
		setConstNumber(offset + 45, $rsrc_std_qty1, value);
	}
	
	/**
	 * 資源単位数量１. Resource unit qty. 1.<p>
	 *
	 */
	public MCNumber rsrc_unit_qty1() {
		return getConstNumber(offset + 46, $rsrc_unit_qty1);
	}

	/**
	 * 資源単位数量１. Resource unit qty. 1.<p>
	 *
	 */
	public void rsrc_unit_qty1(MCNumber value) {
		setConstNumber(offset + 46, $rsrc_unit_qty1, value);
	}
	
	/**
	 * 資源単位数量１. Resource unit qty. 1.<p>
	 *
	 */
	public void rsrc_unit_qty1(int value) {
		setConstNumber(offset + 46, $rsrc_unit_qty1, value);
	}
	
	/**
	 * 資源単位数量１. Resource unit qty. 1.<p>
	 *
	 */
	public void rsrc_unit_qty1(long value) {
		setConstNumber(offset + 46, $rsrc_unit_qty1, value);
	}
	
	/**
	 * 資源単位数量１. Resource unit qty. 1.<p>
	 *
	 */
	public void rsrc_unit_qty1(float value) {
		setConstNumber(offset + 46, $rsrc_unit_qty1, value);
	}
	
	/**
	 * 資源単位数量１. Resource unit qty. 1.<p>
	 *
	 */
	public void rsrc_unit_qty1(double value) {
		setConstNumber(offset + 46, $rsrc_unit_qty1, value);
	}
	
	/**
	 * 資源標準値２. Resource standard value 2.<p>
	 *
	 */
	public MCNumber rsrc_std_qty2() {
		return getConstNumber(offset + 47, $rsrc_std_qty2);
	}

	/**
	 * 資源標準値２. Resource standard value 2.<p>
	 *
	 */
	public void rsrc_std_qty2(MCNumber value) {
		setConstNumber(offset + 47, $rsrc_std_qty2, value);
	}
	
	/**
	 * 資源標準値２. Resource standard value 2.<p>
	 *
	 */
	public void rsrc_std_qty2(int value) {
		setConstNumber(offset + 47, $rsrc_std_qty2, value);
	}
	
	/**
	 * 資源標準値２. Resource standard value 2.<p>
	 *
	 */
	public void rsrc_std_qty2(long value) {
		setConstNumber(offset + 47, $rsrc_std_qty2, value);
	}
	
	/**
	 * 資源標準値２. Resource standard value 2.<p>
	 *
	 */
	public void rsrc_std_qty2(float value) {
		setConstNumber(offset + 47, $rsrc_std_qty2, value);
	}
	
	/**
	 * 資源標準値２. Resource standard value 2.<p>
	 *
	 */
	public void rsrc_std_qty2(double value) {
		setConstNumber(offset + 47, $rsrc_std_qty2, value);
	}
	
	/**
	 * 資源単位数量２. Resource unit qty. 2.<p>
	 *
	 */
	public MCNumber rsrc_unit_qty2() {
		return getConstNumber(offset + 48, $rsrc_unit_qty2);
	}

	/**
	 * 資源単位数量２. Resource unit qty. 2.<p>
	 *
	 */
	public void rsrc_unit_qty2(MCNumber value) {
		setConstNumber(offset + 48, $rsrc_unit_qty2, value);
	}
	
	/**
	 * 資源単位数量２. Resource unit qty. 2.<p>
	 *
	 */
	public void rsrc_unit_qty2(int value) {
		setConstNumber(offset + 48, $rsrc_unit_qty2, value);
	}
	
	/**
	 * 資源単位数量２. Resource unit qty. 2.<p>
	 *
	 */
	public void rsrc_unit_qty2(long value) {
		setConstNumber(offset + 48, $rsrc_unit_qty2, value);
	}
	
	/**
	 * 資源単位数量２. Resource unit qty. 2.<p>
	 *
	 */
	public void rsrc_unit_qty2(float value) {
		setConstNumber(offset + 48, $rsrc_unit_qty2, value);
	}
	
	/**
	 * 資源単位数量２. Resource unit qty. 2.<p>
	 *
	 */
	public void rsrc_unit_qty2(double value) {
		setConstNumber(offset + 48, $rsrc_unit_qty2, value);
	}
	
	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 49, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 49, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 50, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 50, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 51, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 51, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 52, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 52, $sno4, value);
	}

	/**
	 * ＭＲＰ対象外ＦＬＧ. Not for MRP flg..<p>
	 *
	 */
	public boolean not_mrp_flg() {
		return getConstBoolean(offset + 53, $not_mrp_flg);
	}

	/**
	 * ＭＲＰ対象外ＦＬＧ. Not for MRP flg..<p>
	 *
	 */
	public void not_mrp_flg(boolean value) {
		setConstBoolean(offset + 53, $not_mrp_flg, value);
	}

	/**
	 * 原価比率. Cost ratio.<p>
	 *
	 */
	public MCNumber cost_ratio() {
		return getConstNumber(offset + 54, $cost_ratio);
	}

	/**
	 * 原価比率. Cost ratio.<p>
	 *
	 */
	public void cost_ratio(MCNumber value) {
		setConstNumber(offset + 54, $cost_ratio, value);
	}
	
	/**
	 * 原価比率. Cost ratio.<p>
	 *
	 */
	public void cost_ratio(int value) {
		setConstNumber(offset + 54, $cost_ratio, value);
	}
	
	/**
	 * 原価比率. Cost ratio.<p>
	 *
	 */
	public void cost_ratio(long value) {
		setConstNumber(offset + 54, $cost_ratio, value);
	}
	
	/**
	 * 原価比率. Cost ratio.<p>
	 *
	 */
	public void cost_ratio(float value) {
		setConstNumber(offset + 54, $cost_ratio, value);
	}
	
	/**
	 * 原価比率. Cost ratio.<p>
	 *
	 */
	public void cost_ratio(double value) {
		setConstNumber(offset + 54, $cost_ratio, value);
	}
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 55, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 55, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 56, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 56, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 57, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 57, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 58, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 58, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 59, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 59, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 60, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 60, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 61, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 61, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 62, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 62, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 63, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 63, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 64, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 64, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 65, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 65, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 66, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 67, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 67, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 68, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 68, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 69, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 69, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 70, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 70, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 71, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 71, $upd_srv_req_no, value);
	}

	public String getString(String name) {
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			return sz_day_week_typ();
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			return lot_issue_typ();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
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
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			return mfg_lt_add_qty();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			return purc_lt_add_qty();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			return buf_lt();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			return sz_week();
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			return lot_sz_pd();
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			return min_lot_qty();
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			return batch_lot_qty();
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			return max_lot_qty();
		}
		if ($max_order.equalsIgnoreCase(name)) {
			return max_order();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			return mfg_inst_qty();
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty();
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			return rsrc_std_qty1();
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			return rsrc_unit_qty1();
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			return rsrc_std_qty2();
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			return rsrc_unit_qty2();
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			return cost_ratio();
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			return ln_stk_flg();
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			return pre_po_tgt_flg();
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			return inst_rec_issue_flg();
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return no_mfg_aprv_flg();
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			return po_batch_flg();
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			return not_mrp_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			return sz_day_week_typ();
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			return lot_issue_typ();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
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
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			return mfg_lt_add_qty();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			return purc_lt_add_qty();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			return buf_lt();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			return sz_week();
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			return lot_sz_pd();
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			return min_lot_qty();
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			return batch_lot_qty();
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			return max_lot_qty();
		}
		if ($max_order.equalsIgnoreCase(name)) {
			return max_order();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			return mfg_inst_qty();
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty();
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			return rsrc_std_qty1();
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			return rsrc_unit_qty1();
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			return rsrc_std_qty2();
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			return rsrc_unit_qty2();
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			return cost_ratio();
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			return ln_stk_flg();
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			return pre_po_tgt_flg();
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			return inst_rec_issue_flg();
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return no_mfg_aprv_flg();
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			return po_batch_flg();
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			return not_mrp_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			sz_day_week_typ(value);
			return;
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			lot_issue_typ(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
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
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			ln_stk_flg(value);
			return;
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			pre_po_tgt_flg(value);
			return;
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			inst_rec_issue_flg(value);
			return;
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			no_mfg_aprv_flg(value);
			return;
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			po_batch_flg(value);
			return;
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			not_mrp_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			sz_day_week_typ(value);
			return;
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			lot_issue_typ(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
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
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
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
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			ln_stk_flg(value);
			return;
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			pre_po_tgt_flg(value);
			return;
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			inst_rec_issue_flg(value);
			return;
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			no_mfg_aprv_flg(value);
			return;
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			po_batch_flg(value);
			return;
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			not_mrp_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
