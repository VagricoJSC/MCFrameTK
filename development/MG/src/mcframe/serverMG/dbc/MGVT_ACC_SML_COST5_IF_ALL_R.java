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
 * "集計原価情報（原価計算結果）５送信ＩＦビュー // Aggregated cost info. (Cost calculation result) 5 export IF view"DBコンテナRowクラスです。<p>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データＮＯ</td>
 *  	<td>Data No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>exe_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＰＧ実行状況区分</td>
 *  	<td>PG execution status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>data_crud_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データ更新区分</td>
 *  	<td>Data update type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_sys_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システムＣＤ</td>
 *  	<td>External system cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bi_not_send_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信対象外ＦＬＧ</td>
 *  	<td>Not to be exported flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算ＮＯ</td>
 *  	<td>Calculation No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>確定ＦＬＧ</td>
 *  	<td>Firm flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_rec_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算レコード区分</td>
 *  	<td>Calculation record type</td>
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
 *  	<td>term</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期</td>
 *  	<td>Term</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>年月</td>
 *  	<td>Year month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mng_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
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
 *  	<td>mfg_purc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造購買区分</td>
 *  	<td>Mfg. purchase type</td>
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
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>原価入出庫区分</td>
 *  	<td>Cost GR/GI type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
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
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造実績ＮＯ</td>
 *  	<td>Mfg. result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ラインＣＤ</td>
 *  	<td>Line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程実績ＮＯ</td>
 *  	<td>Operation result No.</td>
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
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＣＤ</td>
 *  	<td>Delivery destination cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dest_cd1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ１</td>
 *  	<td>Distribution channel cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_cd2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ２</td>
 *  	<td>Distribution channel cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dest_cd3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ３</td>
 *  	<td>Distribution channel cd. 3</td>
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
 *  	<td>po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注ＮＯ</td>
 *  	<td>PO No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注ＮＯ</td>
 *  	<td>Sales order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_id</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績ＩＤ</td>
 *  	<td>Result ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_id_sub</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績ＩＤ枝番</td>
 *  	<td>Result ID branch No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上部門ＣＤ</td>
 *  	<td>Sales dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦部門ＣＤ</td>
 *  	<td>Allocation dept. cd.</td>
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
 *  	<td>sls_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cost_sls_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上分類１</td>
 *  	<td>Sales classification 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cost_sls_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上分類２</td>
 *  	<td>Sales classification 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cost_sls_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上分類３</td>
 *  	<td>Sales classification 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cost_sls_cd4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上分類４</td>
 *  	<td>Sales classification 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cost_sls_cd5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上分類５</td>
 *  	<td>Sales classification 5</td>
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
 *  	<td>inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>指図数量</td>
 *  	<td>Order qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨ＣＤ</td>
 *  	<td>Base currency cd.</td>
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
 *  	<td>std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準数量</td>
 *  	<td>Standard qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準金額</td>
 *  	<td>Standard amount</td>
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
 *  	<td>cur_std_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨標準金額</td>
 *  	<td>Currency standard amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準為替レート</td>
 *  	<td>Standard exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upri_diff</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単価差異</td>
 *  	<td>Unit price variance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rate_diff</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>レート差異</td>
 *  	<td>Rate variance</td>
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
 *  	<td>act_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際単価</td>
 *  	<td>Actual unit price</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準単価</td>
 *  	<td>Standard unit cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>so_act_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際相殺金額</td>
 *  	<td>Actual offset amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>so_std_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準相殺金額</td>
 *  	<td>Standard offset amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>per</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>進捗度</td>
 *  	<td>Progress</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_cost_ratio</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造原価比率</td>
 *  	<td>Mfg. cost ratio</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目ＣＤ</td>
 *  	<td>Allocation account cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品目ＣＤ</td>
 *  	<td>Parent item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親枝番１</td>
 *  	<td>Parent branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親枝番２</td>
 *  	<td>Parent branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親枝番３</td>
 *  	<td>Parent branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gp_alc_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>汎用配賦分類ＣＤ</td>
 *  	<td>General purpose allocation classification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量差異</td>
 *  	<td>Quantity variance</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_wk</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数差異</td>
 *  	<td>Time variance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_up</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>価格差異</td>
 *  	<td>Price variance</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_rt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦率差異</td>
 *  	<td>Allocation rate variance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_std</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準調整差異</td>
 *  	<td>Standard adjustment variance</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_a</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異１</td>
 *  	<td>Variance 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_b</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異２</td>
 *  	<td>Variance 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_c</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異３</td>
 *  	<td>Variance 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_d</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異４</td>
 *  	<td>Variance 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_e</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異５</td>
 *  	<td>Variance 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inpt_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造品投入原価</td>
 *  	<td>Mfg. item input cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_mfg_inpt_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準製造品投入原価</td>
 *  	<td>Standard mfg. item input cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上原価</td>
 *  	<td>Cost of goods sold</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_sls_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準売上原価</td>
 *  	<td>Standard cost of goods sold</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_mng_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販管費</td>
 *  	<td>SGA</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_sls_mng_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準販管費</td>
 *  	<td>Standard SGA</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fxd_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>固定費</td>
 *  	<td>Fixed cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>var_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>変動費</td>
 *  	<td>Variable cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dir_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>直接費</td>
 *  	<td>Direct cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>indir_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>間接費</td>
 *  	<td>Indirect cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価</td>
 *  	<td>Actual cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１</td>
 *  	<td>Actual cost 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２</td>
 *  	<td>Actual cost 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３</td>
 *  	<td>Actual cost 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４</td>
 *  	<td>Actual cost 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５</td>
 *  	<td>Actual cost 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost6</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６</td>
 *  	<td>Actual cost 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost7</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７</td>
 *  	<td>Actual cost 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost8</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８</td>
 *  	<td>Actual cost 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost9</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９</td>
 *  	<td>Actual cost 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost10</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１０</td>
 *  	<td>Actual cost 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost11</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１１</td>
 *  	<td>Actual cost 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost12</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１２</td>
 *  	<td>Actual cost 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost13</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１３</td>
 *  	<td>Actual cost 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost14</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１４</td>
 *  	<td>Actual cost 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost15</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１５</td>
 *  	<td>Actual cost 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost16</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１６</td>
 *  	<td>Actual cost 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost17</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１７</td>
 *  	<td>Actual cost 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost18</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１８</td>
 *  	<td>Actual cost 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost19</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１９</td>
 *  	<td>Actual cost 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost20</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２０</td>
 *  	<td>Actual cost 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost21</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２１</td>
 *  	<td>Actual cost 21</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost22</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２２</td>
 *  	<td>Actual cost 22</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost23</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２３</td>
 *  	<td>Actual cost 23</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost24</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２４</td>
 *  	<td>Actual cost 24</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost25</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２５</td>
 *  	<td>Actual cost 25</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost26</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２６</td>
 *  	<td>Actual cost 26</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost27</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２７</td>
 *  	<td>Actual cost 27</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost28</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２８</td>
 *  	<td>Actual cost 28</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost29</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価２９</td>
 *  	<td>Actual cost 29</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost30</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３０</td>
 *  	<td>Actual cost 30</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost31</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３１</td>
 *  	<td>Actual cost 31</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost32</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３２</td>
 *  	<td>Actual cost 32</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost33</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３３</td>
 *  	<td>Actual cost 33</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost34</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３４</td>
 *  	<td>Actual cost 34</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost35</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３５</td>
 *  	<td>Actual cost 35</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost36</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３６</td>
 *  	<td>Actual cost 36</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost37</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３７</td>
 *  	<td>Actual cost 37</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost38</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３８</td>
 *  	<td>Actual cost 38</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost39</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価３９</td>
 *  	<td>Actual cost 39</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost40</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４０</td>
 *  	<td>Actual cost 40</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost41</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４１</td>
 *  	<td>Actual cost 41</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost42</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４２</td>
 *  	<td>Actual cost 42</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost43</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４３</td>
 *  	<td>Actual cost 43</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost44</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４４</td>
 *  	<td>Actual cost 44</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost45</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４５</td>
 *  	<td>Actual cost 45</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost46</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４６</td>
 *  	<td>Actual cost 46</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost47</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４７</td>
 *  	<td>Actual cost 47</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost48</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４８</td>
 *  	<td>Actual cost 48</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost49</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価４９</td>
 *  	<td>Actual cost 49</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost50</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５０</td>
 *  	<td>Actual cost 50</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost51</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５１</td>
 *  	<td>Actual cost 51</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost52</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５２</td>
 *  	<td>Actual cost 52</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost53</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５３</td>
 *  	<td>Actual cost 53</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost54</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５４</td>
 *  	<td>Actual cost 54</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost55</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５５</td>
 *  	<td>Actual cost 55</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost56</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５６</td>
 *  	<td>Actual cost 56</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost57</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５７</td>
 *  	<td>Actual cost 57</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost58</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５８</td>
 *  	<td>Actual cost 58</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost59</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価５９</td>
 *  	<td>Actual cost 59</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost60</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６０</td>
 *  	<td>Actual cost 60</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost61</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６１</td>
 *  	<td>Actual cost 61</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost62</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６２</td>
 *  	<td>Actual cost 62</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost63</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６３</td>
 *  	<td>Actual cost 63</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost64</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６４</td>
 *  	<td>Actual cost 64</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost65</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６５</td>
 *  	<td>Actual cost 65</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost66</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６６</td>
 *  	<td>Actual cost 66</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost67</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６７</td>
 *  	<td>Actual cost 67</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost68</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６８</td>
 *  	<td>Actual cost 68</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost69</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価６９</td>
 *  	<td>Actual cost 69</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost70</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７０</td>
 *  	<td>Actual cost 70</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost71</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７１</td>
 *  	<td>Actual cost 71</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost72</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７２</td>
 *  	<td>Actual cost 72</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost73</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７３</td>
 *  	<td>Actual cost 73</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost74</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７４</td>
 *  	<td>Actual cost 74</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost75</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７５</td>
 *  	<td>Actual cost 75</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost76</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７６</td>
 *  	<td>Actual cost 76</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost77</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７７</td>
 *  	<td>Actual cost 77</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost78</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７８</td>
 *  	<td>Actual cost 78</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost79</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価７９</td>
 *  	<td>Actual cost 79</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost80</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８０</td>
 *  	<td>Actual cost 80</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost81</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８１</td>
 *  	<td>Actual cost 81</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost82</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８２</td>
 *  	<td>Actual cost 82</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost83</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８３</td>
 *  	<td>Actual cost 83</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost84</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８４</td>
 *  	<td>Actual cost 84</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost85</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８５</td>
 *  	<td>Actual cost 85</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost86</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８６</td>
 *  	<td>Actual cost 86</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost87</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８７</td>
 *  	<td>Actual cost 87</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost88</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８８</td>
 *  	<td>Actual cost 88</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost89</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価８９</td>
 *  	<td>Actual cost 89</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost90</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９０</td>
 *  	<td>Actual cost 90</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost91</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９１</td>
 *  	<td>Actual cost 91</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost92</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９２</td>
 *  	<td>Actual cost 92</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost93</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９３</td>
 *  	<td>Actual cost 93</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost94</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９４</td>
 *  	<td>Actual cost 94</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost95</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９５</td>
 *  	<td>Actual cost 95</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost96</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９６</td>
 *  	<td>Actual cost 96</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost97</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９７</td>
 *  	<td>Actual cost 97</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost98</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９８</td>
 *  	<td>Actual cost 98</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost99</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価９９</td>
 *  	<td>Actual cost 99</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost100</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価１００</td>
 *  	<td>Actual cost 100</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価</td>
 *  	<td>Standard cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１</td>
 *  	<td>Standard cost 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２</td>
 *  	<td>Standard cost 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３</td>
 *  	<td>Standard cost 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４</td>
 *  	<td>Standard cost 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５</td>
 *  	<td>Standard cost 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost6</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６</td>
 *  	<td>Standard cost 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost7</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７</td>
 *  	<td>Standard cost 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost8</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８</td>
 *  	<td>Standard cost 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost9</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９</td>
 *  	<td>Standard cost 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost10</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１０</td>
 *  	<td>Standard cost 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost11</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１１</td>
 *  	<td>Standard cost 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost12</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１２</td>
 *  	<td>Standard cost 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost13</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１３</td>
 *  	<td>Standard cost 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost14</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１４</td>
 *  	<td>Standard cost 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost15</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１５</td>
 *  	<td>Standard cost 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost16</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１６</td>
 *  	<td>Standard cost 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost17</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１７</td>
 *  	<td>Standard cost 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost18</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１８</td>
 *  	<td>Standard cost 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost19</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１９</td>
 *  	<td>Standard cost 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost20</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２０</td>
 *  	<td>Standard cost 20</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost21</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２１</td>
 *  	<td>Standard cost 21</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost22</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２２</td>
 *  	<td>Standard cost 22</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost23</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２３</td>
 *  	<td>Standard cost 23</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost24</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２４</td>
 *  	<td>Standard cost 24</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost25</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２５</td>
 *  	<td>Standard cost 25</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost26</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２６</td>
 *  	<td>Standard cost 26</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost27</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２７</td>
 *  	<td>Standard cost 27</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost28</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２８</td>
 *  	<td>Standard cost 28</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost29</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価２９</td>
 *  	<td>Standard cost 29</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost30</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３０</td>
 *  	<td>Standard cost 30</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost31</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３１</td>
 *  	<td>Standard cost 31</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost32</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３２</td>
 *  	<td>Standard cost 32</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost33</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３３</td>
 *  	<td>Standard cost 33</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost34</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３４</td>
 *  	<td>Standard cost 34</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost35</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３５</td>
 *  	<td>Standard cost 35</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost36</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３６</td>
 *  	<td>Standard cost 36</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost37</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３７</td>
 *  	<td>Standard cost 37</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost38</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３８</td>
 *  	<td>Standard cost 38</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost39</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価３９</td>
 *  	<td>Standard cost 39</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost40</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４０</td>
 *  	<td>Standard cost 40</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost41</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４１</td>
 *  	<td>Standard cost 41</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost42</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４２</td>
 *  	<td>Standard cost 42</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost43</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４３</td>
 *  	<td>Standard cost 43</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost44</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４４</td>
 *  	<td>Standard cost 44</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost45</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４５</td>
 *  	<td>Standard cost 45</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost46</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４６</td>
 *  	<td>Standard cost 46</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost47</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４７</td>
 *  	<td>Standard cost 47</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost48</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４８</td>
 *  	<td>Standard cost 48</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost49</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価４９</td>
 *  	<td>Standard cost 49</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost50</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５０</td>
 *  	<td>Standard cost 50</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost51</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５１</td>
 *  	<td>Standard cost 51</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost52</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５２</td>
 *  	<td>Standard cost 52</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost53</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５３</td>
 *  	<td>Standard cost 53</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost54</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５４</td>
 *  	<td>Standard cost 54</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost55</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５５</td>
 *  	<td>Standard cost 55</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost56</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５６</td>
 *  	<td>Standard cost 56</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost57</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５７</td>
 *  	<td>Standard cost 57</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost58</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５８</td>
 *  	<td>Standard cost 58</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost59</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価５９</td>
 *  	<td>Standard cost 59</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost60</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６０</td>
 *  	<td>Standard cost 60</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost61</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６１</td>
 *  	<td>Standard cost 61</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost62</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６２</td>
 *  	<td>Standard cost 62</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost63</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６３</td>
 *  	<td>Standard cost 63</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost64</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６４</td>
 *  	<td>Standard cost 64</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost65</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６５</td>
 *  	<td>Standard cost 65</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost66</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６６</td>
 *  	<td>Standard cost 66</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost67</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６７</td>
 *  	<td>Standard cost 67</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost68</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６８</td>
 *  	<td>Standard cost 68</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost69</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価６９</td>
 *  	<td>Standard cost 69</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost70</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７０</td>
 *  	<td>Standard cost 70</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost71</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７１</td>
 *  	<td>Standard cost 71</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost72</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７２</td>
 *  	<td>Standard cost 72</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost73</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７３</td>
 *  	<td>Standard cost 73</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost74</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７４</td>
 *  	<td>Standard cost 74</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost75</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７５</td>
 *  	<td>Standard cost 75</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost76</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７６</td>
 *  	<td>Standard cost 76</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost77</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７７</td>
 *  	<td>Standard cost 77</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost78</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７８</td>
 *  	<td>Standard cost 78</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost79</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価７９</td>
 *  	<td>Standard cost 79</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost80</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８０</td>
 *  	<td>Standard cost 80</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost81</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８１</td>
 *  	<td>Standard cost 81</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost82</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８２</td>
 *  	<td>Standard cost 82</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost83</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８３</td>
 *  	<td>Standard cost 83</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost84</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８４</td>
 *  	<td>Standard cost 84</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost85</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８５</td>
 *  	<td>Standard cost 85</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost86</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８６</td>
 *  	<td>Standard cost 86</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost87</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８７</td>
 *  	<td>Standard cost 87</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost88</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８８</td>
 *  	<td>Standard cost 88</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost89</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価８９</td>
 *  	<td>Standard cost 89</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost90</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９０</td>
 *  	<td>Standard cost 90</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost91</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９１</td>
 *  	<td>Standard cost 91</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost92</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９２</td>
 *  	<td>Standard cost 92</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost93</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９３</td>
 *  	<td>Standard cost 93</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost94</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９４</td>
 *  	<td>Standard cost 94</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost95</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９５</td>
 *  	<td>Standard cost 95</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost96</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９６</td>
 *  	<td>Standard cost 96</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost97</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９７</td>
 *  	<td>Standard cost 97</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost98</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９８</td>
 *  	<td>Standard cost 98</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost99</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価９９</td>
 *  	<td>Standard cost 99</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost100</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価１００</td>
 *  	<td>Standard cost 100</td>
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
 *  	<td>if_sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１</td>
 *  	<td>IF spare CHAR column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２</td>
 *  	<td>IF spare CHAR column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目３</td>
 *  	<td>IF spare CHAR column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目４</td>
 *  	<td>IF spare CHAR column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目５</td>
 *  	<td>IF spare CHAR column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目６</td>
 *  	<td>IF spare CHAR column 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目７</td>
 *  	<td>IF spare CHAR column 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目８</td>
 *  	<td>IF spare CHAR column 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目９</td>
 *  	<td>IF spare CHAR column 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１０</td>
 *  	<td>IF spare CHAR column 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１１</td>
 *  	<td>IF spare CHAR column 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１２</td>
 *  	<td>IF spare CHAR column 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１３</td>
 *  	<td>IF spare CHAR column 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１４</td>
 *  	<td>IF spare CHAR column 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１５</td>
 *  	<td>IF spare CHAR column 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１６</td>
 *  	<td>IF spare CHAR column 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１７</td>
 *  	<td>IF spare CHAR column 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１８</td>
 *  	<td>IF spare CHAR column 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１９</td>
 *  	<td>IF spare CHAR column 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２０</td>
 *  	<td>IF spare CHAR column 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２１</td>
 *  	<td>IF spare CHAR column 21</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２２</td>
 *  	<td>IF spare CHAR column 22</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２３</td>
 *  	<td>IF spare CHAR column 23</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２４</td>
 *  	<td>IF spare CHAR column 24</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２５</td>
 *  	<td>IF spare CHAR column 25</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２６</td>
 *  	<td>IF spare CHAR column 26</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２７</td>
 *  	<td>IF spare CHAR column 27</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２８</td>
 *  	<td>IF spare CHAR column 28</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２９</td>
 *  	<td>IF spare CHAR column 29</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目３０</td>
 *  	<td>IF spare CHAR column 30</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目１</td>
 *  	<td>IF spare NUM column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目２</td>
 *  	<td>IF spare NUM column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目３</td>
 *  	<td>IF spare NUM column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目４</td>
 *  	<td>IF spare NUM column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目５</td>
 *  	<td>IF spare NUM column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目１</td>
 *  	<td>IF spare DATE column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目２</td>
 *  	<td>IF spare DATE column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目３</td>
 *  	<td>IF spare DATE column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目４</td>
 *  	<td>IF spare DATE column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目５</td>
 *  	<td>IF spare DATE column 5</td>
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
public class MGVT_ACC_SML_COST5_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVT_ACC_SML_COST5_IF_ALL";

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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
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
	 * 送信対象外ＦＬＧ. Not to be exported flg..<p>
	 *
	 */
	public static final String $bi_not_send_flg = "bi_not_send_flg";
	private static final MCPermColumnInfo _bi_not_send_flg = createColumnInfo("bi_not_send_flg");
	public final MCBooleanPermColumn bi_not_send_flg = createBooleanColumn(_bi_not_send_flg);
	
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
	 * 確定ＦＬＧ. Firm flg..<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	private static final MCPermColumnInfo _fix_flg = createColumnInfo("fix_flg");
	public final MCBooleanPermColumn fix_flg = createBooleanColumn(_fix_flg);
	
	/**
	 * 計算レコード区分. Calculation record type.<p>
	 *
	 */
	public static final String $calc_rec_typ = "calc_rec_typ";
	private static final MCPermColumnInfo _calc_rec_typ = createColumnInfo("calc_rec_typ");
	public final MCStringPermColumn calc_rec_typ = createStringColumn(_calc_rec_typ);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
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
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public static final String $mfg_purc_typ = "mfg_purc_typ";
	private static final MCPermColumnInfo _mfg_purc_typ = createColumnInfo("mfg_purc_typ");
	public final MCStringPermColumn mfg_purc_typ = createStringColumn(_mfg_purc_typ);
	
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
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	private static final MCPermColumnInfo _mfg_act_no = createColumnInfo("mfg_act_no");
	public final MCStringPermColumn mfg_act_no = createStringColumn(_mfg_act_no);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * ラインＣＤ. Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	private static final MCPermColumnInfo _oper_act_no = createColumnInfo("oper_act_no");
	public final MCStringPermColumn oper_act_no = createStringColumn(_oper_act_no);
	
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
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	private static final MCPermColumnInfo _dlv_cd = createColumnInfo("dlv_cd");
	public final MCStringPermColumn dlv_cd = createStringColumn(_dlv_cd);
	
	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	private static final MCPermColumnInfo _dest_cd1 = createColumnInfo("dest_cd1");
	public final MCStringPermColumn dest_cd1 = createStringColumn(_dest_cd1);
	
	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	private static final MCPermColumnInfo _dest_cd2 = createColumnInfo("dest_cd2");
	public final MCStringPermColumn dest_cd2 = createStringColumn(_dest_cd2);
	
	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	private static final MCPermColumnInfo _dest_cd3 = createColumnInfo("dest_cd3");
	public final MCStringPermColumn dest_cd3 = createStringColumn(_dest_cd3);
	
	/**
	 * 在庫先ＣＤ. Company holding inventory cd..<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	private static final MCPermColumnInfo _stk_bp_cd = createColumnInfo("stk_bp_cd");
	public final MCStringPermColumn stk_bp_cd = createStringColumn(_stk_bp_cd);
	
	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public static final String $po_no = "po_no";
	private static final MCPermColumnInfo _po_no = createColumnInfo("po_no");
	public final MCStringPermColumn po_no = createStringColumn(_po_no);
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	private static final MCPermColumnInfo _slo_no = createColumnInfo("slo_no");
	public final MCStringPermColumn slo_no = createStringColumn(_slo_no);
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
	/**
	 * 実績ＩＤ. Result ID.<p>
	 *
	 */
	public static final String $act_id = "act_id";
	private static final MCPermColumnInfo _act_id = createColumnInfo("act_id");
	public final MCStringPermColumn act_id = createStringColumn(_act_id);
	
	/**
	 * 実績ＩＤ枝番. Result ID branch No..<p>
	 *
	 */
	public static final String $act_id_sub = "act_id_sub";
	private static final MCPermColumnInfo _act_id_sub = createColumnInfo("act_id_sub");
	public final MCStringPermColumn act_id_sub = createStringColumn(_act_id_sub);
	
	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	private static final MCPermColumnInfo _sls_dpt_cd = createColumnInfo("sls_dpt_cd");
	public final MCStringPermColumn sls_dpt_cd = createStringColumn(_sls_dpt_cd);
	
	/**
	 * 配賦部門ＣＤ. Allocation dept. cd..<p>
	 *
	 */
	public static final String $alc_dpt_cd = "alc_dpt_cd";
	private static final MCPermColumnInfo _alc_dpt_cd = createColumnInfo("alc_dpt_cd");
	public final MCStringPermColumn alc_dpt_cd = createStringColumn(_alc_dpt_cd);
	
	/**
	 * 相手部門ＣＤ. Counterpart dept. cd..<p>
	 *
	 */
	public static final String $other_dpt_cd = "other_dpt_cd";
	private static final MCPermColumnInfo _other_dpt_cd = createColumnInfo("other_dpt_cd");
	public final MCStringPermColumn other_dpt_cd = createStringColumn(_other_dpt_cd);
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	private static final MCPermColumnInfo _sls_usr_cd = createColumnInfo("sls_usr_cd");
	public final MCStringPermColumn sls_usr_cd = createStringColumn(_sls_usr_cd);
	
	/**
	 * 売上分類１. Sales classification 1.<p>
	 *
	 */
	public static final String $cost_sls_cd1 = "cost_sls_cd1";
	private static final MCPermColumnInfo _cost_sls_cd1 = createColumnInfo("cost_sls_cd1");
	public final MCStringPermColumn cost_sls_cd1 = createStringColumn(_cost_sls_cd1);
	
	/**
	 * 売上分類２. Sales classification 2.<p>
	 *
	 */
	public static final String $cost_sls_cd2 = "cost_sls_cd2";
	private static final MCPermColumnInfo _cost_sls_cd2 = createColumnInfo("cost_sls_cd2");
	public final MCStringPermColumn cost_sls_cd2 = createStringColumn(_cost_sls_cd2);
	
	/**
	 * 売上分類３. Sales classification 3.<p>
	 *
	 */
	public static final String $cost_sls_cd3 = "cost_sls_cd3";
	private static final MCPermColumnInfo _cost_sls_cd3 = createColumnInfo("cost_sls_cd3");
	public final MCStringPermColumn cost_sls_cd3 = createStringColumn(_cost_sls_cd3);
	
	/**
	 * 売上分類４. Sales classification 4.<p>
	 *
	 */
	public static final String $cost_sls_cd4 = "cost_sls_cd4";
	private static final MCPermColumnInfo _cost_sls_cd4 = createColumnInfo("cost_sls_cd4");
	public final MCStringPermColumn cost_sls_cd4 = createStringColumn(_cost_sls_cd4);
	
	/**
	 * 売上分類５. Sales classification 5.<p>
	 *
	 */
	public static final String $cost_sls_cd5 = "cost_sls_cd5";
	private static final MCPermColumnInfo _cost_sls_cd5 = createColumnInfo("cost_sls_cd5");
	public final MCStringPermColumn cost_sls_cd5 = createStringColumn(_cost_sls_cd5);
	
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
	 * 指図数量. Order qty..<p>
	 *
	 */
	public static final String $inst_qty = "inst_qty";
	private static final MCPermColumnInfo _inst_qty = createColumnInfo("inst_qty");
	public final MCNumberPermColumn inst_qty = createNumberColumn(_inst_qty);
	
	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	private static final MCPermColumnInfo _base_cur_cd = createColumnInfo("base_cur_cd");
	public final MCStringPermColumn base_cur_cd = createStringColumn(_base_cur_cd);
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public static final String $amt = "amt";
	private static final MCPermColumnInfo _amt = createColumnInfo("amt");
	public final MCNumberPermColumn amt = createNumberColumn(_amt);
	
	/**
	 * 標準数量. Standard qty..<p>
	 *
	 */
	public static final String $std_qty = "std_qty";
	private static final MCPermColumnInfo _std_qty = createColumnInfo("std_qty");
	public final MCNumberPermColumn std_qty = createNumberColumn(_std_qty);
	
	/**
	 * 標準金額. Standard amount.<p>
	 *
	 */
	public static final String $std_amt = "std_amt";
	private static final MCPermColumnInfo _std_amt = createColumnInfo("std_amt");
	public final MCNumberPermColumn std_amt = createNumberColumn(_std_amt);
	
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
	 * 通貨標準金額. Currency standard amount.<p>
	 *
	 */
	public static final String $cur_std_amt = "cur_std_amt";
	private static final MCPermColumnInfo _cur_std_amt = createColumnInfo("cur_std_amt");
	public final MCNumberPermColumn cur_std_amt = createNumberColumn(_cur_std_amt);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 標準為替レート. Standard exchange rate.<p>
	 *
	 */
	public static final String $std_xrate = "std_xrate";
	private static final MCPermColumnInfo _std_xrate = createColumnInfo("std_xrate");
	public final MCNumberPermColumn std_xrate = createNumberColumn(_std_xrate);
	
	/**
	 * 単価差異. Unit price variance.<p>
	 *
	 */
	public static final String $upri_diff = "upri_diff";
	private static final MCPermColumnInfo _upri_diff = createColumnInfo("upri_diff");
	public final MCNumberPermColumn upri_diff = createNumberColumn(_upri_diff);
	
	/**
	 * レート差異. Rate variance.<p>
	 *
	 */
	public static final String $rate_diff = "rate_diff";
	private static final MCPermColumnInfo _rate_diff = createColumnInfo("rate_diff");
	public final MCNumberPermColumn rate_diff = createNumberColumn(_rate_diff);
	
	/**
	 * 振替グループ. Transfer group.<p>
	 *
	 */
	public static final String $trd_grp = "trd_grp";
	private static final MCPermColumnInfo _trd_grp = createColumnInfo("trd_grp");
	public final MCStringPermColumn trd_grp = createStringColumn(_trd_grp);
	
	/**
	 * 実際単価. Actual unit price.<p>
	 *
	 */
	public static final String $act_upri = "act_upri";
	private static final MCPermColumnInfo _act_upri = createColumnInfo("act_upri");
	public final MCNumberPermColumn act_upri = createNumberColumn(_act_upri);
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	private static final MCPermColumnInfo _std_upri = createColumnInfo("std_upri");
	public final MCNumberPermColumn std_upri = createNumberColumn(_std_upri);
	
	/**
	 * 実際相殺金額. Actual offset amount.<p>
	 *
	 */
	public static final String $so_act_amt = "so_act_amt";
	private static final MCPermColumnInfo _so_act_amt = createColumnInfo("so_act_amt");
	public final MCNumberPermColumn so_act_amt = createNumberColumn(_so_act_amt);
	
	/**
	 * 標準相殺金額. Standard offset amount.<p>
	 *
	 */
	public static final String $so_std_amt = "so_std_amt";
	private static final MCPermColumnInfo _so_std_amt = createColumnInfo("so_std_amt");
	public final MCNumberPermColumn so_std_amt = createNumberColumn(_so_std_amt);
	
	/**
	 * 進捗度. Progress.<p>
	 *
	 */
	public static final String $per = "per";
	private static final MCPermColumnInfo _per = createColumnInfo("per");
	public final MCNumberPermColumn per = createNumberColumn(_per);
	
	/**
	 * 製造原価比率. Mfg. cost ratio.<p>
	 *
	 */
	public static final String $mfg_cost_ratio = "mfg_cost_ratio";
	private static final MCPermColumnInfo _mfg_cost_ratio = createColumnInfo("mfg_cost_ratio");
	public final MCNumberPermColumn mfg_cost_ratio = createNumberColumn(_mfg_cost_ratio);
	
	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	private static final MCPermColumnInfo _alc_ac_cd = createColumnInfo("alc_ac_cd");
	public final MCStringPermColumn alc_ac_cd = createStringColumn(_alc_ac_cd);
	
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
	 * 汎用配賦分類ＣＤ. General purpose allocation classification cd..<p>
	 *
	 */
	public static final String $gp_alc_cd = "gp_alc_cd";
	private static final MCPermColumnInfo _gp_alc_cd = createColumnInfo("gp_alc_cd");
	public final MCStringPermColumn gp_alc_cd = createStringColumn(_gp_alc_cd);
	
	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public static final String $diff_qty = "diff_qty";
	private static final MCPermColumnInfo _diff_qty = createColumnInfo("diff_qty");
	public final MCNumberPermColumn diff_qty = createNumberColumn(_diff_qty);
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public static final String $diff_wk = "diff_wk";
	private static final MCPermColumnInfo _diff_wk = createColumnInfo("diff_wk");
	public final MCNumberPermColumn diff_wk = createNumberColumn(_diff_wk);
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public static final String $diff_up = "diff_up";
	private static final MCPermColumnInfo _diff_up = createColumnInfo("diff_up");
	public final MCNumberPermColumn diff_up = createNumberColumn(_diff_up);
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public static final String $diff_rt = "diff_rt";
	private static final MCPermColumnInfo _diff_rt = createColumnInfo("diff_rt");
	public final MCNumberPermColumn diff_rt = createNumberColumn(_diff_rt);
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public static final String $diff_std = "diff_std";
	private static final MCPermColumnInfo _diff_std = createColumnInfo("diff_std");
	public final MCNumberPermColumn diff_std = createNumberColumn(_diff_std);
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public static final String $diff_a = "diff_a";
	private static final MCPermColumnInfo _diff_a = createColumnInfo("diff_a");
	public final MCNumberPermColumn diff_a = createNumberColumn(_diff_a);
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public static final String $diff_b = "diff_b";
	private static final MCPermColumnInfo _diff_b = createColumnInfo("diff_b");
	public final MCNumberPermColumn diff_b = createNumberColumn(_diff_b);
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public static final String $diff_c = "diff_c";
	private static final MCPermColumnInfo _diff_c = createColumnInfo("diff_c");
	public final MCNumberPermColumn diff_c = createNumberColumn(_diff_c);
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public static final String $diff_d = "diff_d";
	private static final MCPermColumnInfo _diff_d = createColumnInfo("diff_d");
	public final MCNumberPermColumn diff_d = createNumberColumn(_diff_d);
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public static final String $diff_e = "diff_e";
	private static final MCPermColumnInfo _diff_e = createColumnInfo("diff_e");
	public final MCNumberPermColumn diff_e = createNumberColumn(_diff_e);
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public static final String $mfg_inpt_cost = "mfg_inpt_cost";
	private static final MCPermColumnInfo _mfg_inpt_cost = createColumnInfo("mfg_inpt_cost");
	public final MCNumberPermColumn mfg_inpt_cost = createNumberColumn(_mfg_inpt_cost);
	
	/**
	 * 標準製造品投入原価. Standard mfg. item input cost.<p>
	 *
	 */
	public static final String $std_mfg_inpt_cost = "std_mfg_inpt_cost";
	private static final MCPermColumnInfo _std_mfg_inpt_cost = createColumnInfo("std_mfg_inpt_cost");
	public final MCNumberPermColumn std_mfg_inpt_cost = createNumberColumn(_std_mfg_inpt_cost);
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public static final String $sls_cost = "sls_cost";
	private static final MCPermColumnInfo _sls_cost = createColumnInfo("sls_cost");
	public final MCNumberPermColumn sls_cost = createNumberColumn(_sls_cost);
	
	/**
	 * 標準売上原価. Standard cost of goods sold.<p>
	 *
	 */
	public static final String $std_sls_cost = "std_sls_cost";
	private static final MCPermColumnInfo _std_sls_cost = createColumnInfo("std_sls_cost");
	public final MCNumberPermColumn std_sls_cost = createNumberColumn(_std_sls_cost);
	
	/**
	 * 販管費. SGA.<p>
	 *
	 */
	public static final String $sls_mng_cost = "sls_mng_cost";
	private static final MCPermColumnInfo _sls_mng_cost = createColumnInfo("sls_mng_cost");
	public final MCNumberPermColumn sls_mng_cost = createNumberColumn(_sls_mng_cost);
	
	/**
	 * 標準販管費. Standard SGA.<p>
	 *
	 */
	public static final String $std_sls_mng_cost = "std_sls_mng_cost";
	private static final MCPermColumnInfo _std_sls_mng_cost = createColumnInfo("std_sls_mng_cost");
	public final MCNumberPermColumn std_sls_mng_cost = createNumberColumn(_std_sls_mng_cost);
	
	/**
	 * 固定費. Fixed cost.<p>
	 *
	 */
	public static final String $fxd_cost = "fxd_cost";
	private static final MCPermColumnInfo _fxd_cost = createColumnInfo("fxd_cost");
	public final MCNumberPermColumn fxd_cost = createNumberColumn(_fxd_cost);
	
	/**
	 * 変動費. Variable cost.<p>
	 *
	 */
	public static final String $var_cost = "var_cost";
	private static final MCPermColumnInfo _var_cost = createColumnInfo("var_cost");
	public final MCNumberPermColumn var_cost = createNumberColumn(_var_cost);
	
	/**
	 * 直接費. Direct cost.<p>
	 *
	 */
	public static final String $dir_cost = "dir_cost";
	private static final MCPermColumnInfo _dir_cost = createColumnInfo("dir_cost");
	public final MCNumberPermColumn dir_cost = createNumberColumn(_dir_cost);
	
	/**
	 * 間接費. Indirect cost.<p>
	 *
	 */
	public static final String $indir_cost = "indir_cost";
	private static final MCPermColumnInfo _indir_cost = createColumnInfo("indir_cost");
	public final MCNumberPermColumn indir_cost = createNumberColumn(_indir_cost);
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public static final String $act_cost = "act_cost";
	private static final MCPermColumnInfo _act_cost = createColumnInfo("act_cost");
	public final MCNumberPermColumn act_cost = createNumberColumn(_act_cost);
	
	/**
	 * 実際原価１. Actual cost 1.<p>
	 *
	 */
	public static final String $act_cost1 = "act_cost1";
	private static final MCPermColumnInfo _act_cost1 = createColumnInfo("act_cost1");
	public final MCNumberPermColumn act_cost1 = createNumberColumn(_act_cost1);
	
	/**
	 * 実際原価２. Actual cost 2.<p>
	 *
	 */
	public static final String $act_cost2 = "act_cost2";
	private static final MCPermColumnInfo _act_cost2 = createColumnInfo("act_cost2");
	public final MCNumberPermColumn act_cost2 = createNumberColumn(_act_cost2);
	
	/**
	 * 実際原価３. Actual cost 3.<p>
	 *
	 */
	public static final String $act_cost3 = "act_cost3";
	private static final MCPermColumnInfo _act_cost3 = createColumnInfo("act_cost3");
	public final MCNumberPermColumn act_cost3 = createNumberColumn(_act_cost3);
	
	/**
	 * 実際原価４. Actual cost 4.<p>
	 *
	 */
	public static final String $act_cost4 = "act_cost4";
	private static final MCPermColumnInfo _act_cost4 = createColumnInfo("act_cost4");
	public final MCNumberPermColumn act_cost4 = createNumberColumn(_act_cost4);
	
	/**
	 * 実際原価５. Actual cost 5.<p>
	 *
	 */
	public static final String $act_cost5 = "act_cost5";
	private static final MCPermColumnInfo _act_cost5 = createColumnInfo("act_cost5");
	public final MCNumberPermColumn act_cost5 = createNumberColumn(_act_cost5);
	
	/**
	 * 実際原価６. Actual cost 6.<p>
	 *
	 */
	public static final String $act_cost6 = "act_cost6";
	private static final MCPermColumnInfo _act_cost6 = createColumnInfo("act_cost6");
	public final MCNumberPermColumn act_cost6 = createNumberColumn(_act_cost6);
	
	/**
	 * 実際原価７. Actual cost 7.<p>
	 *
	 */
	public static final String $act_cost7 = "act_cost7";
	private static final MCPermColumnInfo _act_cost7 = createColumnInfo("act_cost7");
	public final MCNumberPermColumn act_cost7 = createNumberColumn(_act_cost7);
	
	/**
	 * 実際原価８. Actual cost 8.<p>
	 *
	 */
	public static final String $act_cost8 = "act_cost8";
	private static final MCPermColumnInfo _act_cost8 = createColumnInfo("act_cost8");
	public final MCNumberPermColumn act_cost8 = createNumberColumn(_act_cost8);
	
	/**
	 * 実際原価９. Actual cost 9.<p>
	 *
	 */
	public static final String $act_cost9 = "act_cost9";
	private static final MCPermColumnInfo _act_cost9 = createColumnInfo("act_cost9");
	public final MCNumberPermColumn act_cost9 = createNumberColumn(_act_cost9);
	
	/**
	 * 実際原価１０. Actual cost 10.<p>
	 *
	 */
	public static final String $act_cost10 = "act_cost10";
	private static final MCPermColumnInfo _act_cost10 = createColumnInfo("act_cost10");
	public final MCNumberPermColumn act_cost10 = createNumberColumn(_act_cost10);
	
	/**
	 * 実際原価１１. Actual cost 11.<p>
	 *
	 */
	public static final String $act_cost11 = "act_cost11";
	private static final MCPermColumnInfo _act_cost11 = createColumnInfo("act_cost11");
	public final MCNumberPermColumn act_cost11 = createNumberColumn(_act_cost11);
	
	/**
	 * 実際原価１２. Actual cost 12.<p>
	 *
	 */
	public static final String $act_cost12 = "act_cost12";
	private static final MCPermColumnInfo _act_cost12 = createColumnInfo("act_cost12");
	public final MCNumberPermColumn act_cost12 = createNumberColumn(_act_cost12);
	
	/**
	 * 実際原価１３. Actual cost 13.<p>
	 *
	 */
	public static final String $act_cost13 = "act_cost13";
	private static final MCPermColumnInfo _act_cost13 = createColumnInfo("act_cost13");
	public final MCNumberPermColumn act_cost13 = createNumberColumn(_act_cost13);
	
	/**
	 * 実際原価１４. Actual cost 14.<p>
	 *
	 */
	public static final String $act_cost14 = "act_cost14";
	private static final MCPermColumnInfo _act_cost14 = createColumnInfo("act_cost14");
	public final MCNumberPermColumn act_cost14 = createNumberColumn(_act_cost14);
	
	/**
	 * 実際原価１５. Actual cost 15.<p>
	 *
	 */
	public static final String $act_cost15 = "act_cost15";
	private static final MCPermColumnInfo _act_cost15 = createColumnInfo("act_cost15");
	public final MCNumberPermColumn act_cost15 = createNumberColumn(_act_cost15);
	
	/**
	 * 実際原価１６. Actual cost 16.<p>
	 *
	 */
	public static final String $act_cost16 = "act_cost16";
	private static final MCPermColumnInfo _act_cost16 = createColumnInfo("act_cost16");
	public final MCNumberPermColumn act_cost16 = createNumberColumn(_act_cost16);
	
	/**
	 * 実際原価１７. Actual cost 17.<p>
	 *
	 */
	public static final String $act_cost17 = "act_cost17";
	private static final MCPermColumnInfo _act_cost17 = createColumnInfo("act_cost17");
	public final MCNumberPermColumn act_cost17 = createNumberColumn(_act_cost17);
	
	/**
	 * 実際原価１８. Actual cost 18.<p>
	 *
	 */
	public static final String $act_cost18 = "act_cost18";
	private static final MCPermColumnInfo _act_cost18 = createColumnInfo("act_cost18");
	public final MCNumberPermColumn act_cost18 = createNumberColumn(_act_cost18);
	
	/**
	 * 実際原価１９. Actual cost 19.<p>
	 *
	 */
	public static final String $act_cost19 = "act_cost19";
	private static final MCPermColumnInfo _act_cost19 = createColumnInfo("act_cost19");
	public final MCNumberPermColumn act_cost19 = createNumberColumn(_act_cost19);
	
	/**
	 * 実際原価２０. Actual cost 20.<p>
	 *
	 */
	public static final String $act_cost20 = "act_cost20";
	private static final MCPermColumnInfo _act_cost20 = createColumnInfo("act_cost20");
	public final MCNumberPermColumn act_cost20 = createNumberColumn(_act_cost20);
	
	/**
	 * 実際原価２１. Actual cost 21.<p>
	 *
	 */
	public static final String $act_cost21 = "act_cost21";
	private static final MCPermColumnInfo _act_cost21 = createColumnInfo("act_cost21");
	public final MCNumberPermColumn act_cost21 = createNumberColumn(_act_cost21);
	
	/**
	 * 実際原価２２. Actual cost 22.<p>
	 *
	 */
	public static final String $act_cost22 = "act_cost22";
	private static final MCPermColumnInfo _act_cost22 = createColumnInfo("act_cost22");
	public final MCNumberPermColumn act_cost22 = createNumberColumn(_act_cost22);
	
	/**
	 * 実際原価２３. Actual cost 23.<p>
	 *
	 */
	public static final String $act_cost23 = "act_cost23";
	private static final MCPermColumnInfo _act_cost23 = createColumnInfo("act_cost23");
	public final MCNumberPermColumn act_cost23 = createNumberColumn(_act_cost23);
	
	/**
	 * 実際原価２４. Actual cost 24.<p>
	 *
	 */
	public static final String $act_cost24 = "act_cost24";
	private static final MCPermColumnInfo _act_cost24 = createColumnInfo("act_cost24");
	public final MCNumberPermColumn act_cost24 = createNumberColumn(_act_cost24);
	
	/**
	 * 実際原価２５. Actual cost 25.<p>
	 *
	 */
	public static final String $act_cost25 = "act_cost25";
	private static final MCPermColumnInfo _act_cost25 = createColumnInfo("act_cost25");
	public final MCNumberPermColumn act_cost25 = createNumberColumn(_act_cost25);
	
	/**
	 * 実際原価２６. Actual cost 26.<p>
	 *
	 */
	public static final String $act_cost26 = "act_cost26";
	private static final MCPermColumnInfo _act_cost26 = createColumnInfo("act_cost26");
	public final MCNumberPermColumn act_cost26 = createNumberColumn(_act_cost26);
	
	/**
	 * 実際原価２７. Actual cost 27.<p>
	 *
	 */
	public static final String $act_cost27 = "act_cost27";
	private static final MCPermColumnInfo _act_cost27 = createColumnInfo("act_cost27");
	public final MCNumberPermColumn act_cost27 = createNumberColumn(_act_cost27);
	
	/**
	 * 実際原価２８. Actual cost 28.<p>
	 *
	 */
	public static final String $act_cost28 = "act_cost28";
	private static final MCPermColumnInfo _act_cost28 = createColumnInfo("act_cost28");
	public final MCNumberPermColumn act_cost28 = createNumberColumn(_act_cost28);
	
	/**
	 * 実際原価２９. Actual cost 29.<p>
	 *
	 */
	public static final String $act_cost29 = "act_cost29";
	private static final MCPermColumnInfo _act_cost29 = createColumnInfo("act_cost29");
	public final MCNumberPermColumn act_cost29 = createNumberColumn(_act_cost29);
	
	/**
	 * 実際原価３０. Actual cost 30.<p>
	 *
	 */
	public static final String $act_cost30 = "act_cost30";
	private static final MCPermColumnInfo _act_cost30 = createColumnInfo("act_cost30");
	public final MCNumberPermColumn act_cost30 = createNumberColumn(_act_cost30);
	
	/**
	 * 実際原価３１. Actual cost 31.<p>
	 *
	 */
	public static final String $act_cost31 = "act_cost31";
	private static final MCPermColumnInfo _act_cost31 = createColumnInfo("act_cost31");
	public final MCNumberPermColumn act_cost31 = createNumberColumn(_act_cost31);
	
	/**
	 * 実際原価３２. Actual cost 32.<p>
	 *
	 */
	public static final String $act_cost32 = "act_cost32";
	private static final MCPermColumnInfo _act_cost32 = createColumnInfo("act_cost32");
	public final MCNumberPermColumn act_cost32 = createNumberColumn(_act_cost32);
	
	/**
	 * 実際原価３３. Actual cost 33.<p>
	 *
	 */
	public static final String $act_cost33 = "act_cost33";
	private static final MCPermColumnInfo _act_cost33 = createColumnInfo("act_cost33");
	public final MCNumberPermColumn act_cost33 = createNumberColumn(_act_cost33);
	
	/**
	 * 実際原価３４. Actual cost 34.<p>
	 *
	 */
	public static final String $act_cost34 = "act_cost34";
	private static final MCPermColumnInfo _act_cost34 = createColumnInfo("act_cost34");
	public final MCNumberPermColumn act_cost34 = createNumberColumn(_act_cost34);
	
	/**
	 * 実際原価３５. Actual cost 35.<p>
	 *
	 */
	public static final String $act_cost35 = "act_cost35";
	private static final MCPermColumnInfo _act_cost35 = createColumnInfo("act_cost35");
	public final MCNumberPermColumn act_cost35 = createNumberColumn(_act_cost35);
	
	/**
	 * 実際原価３６. Actual cost 36.<p>
	 *
	 */
	public static final String $act_cost36 = "act_cost36";
	private static final MCPermColumnInfo _act_cost36 = createColumnInfo("act_cost36");
	public final MCNumberPermColumn act_cost36 = createNumberColumn(_act_cost36);
	
	/**
	 * 実際原価３７. Actual cost 37.<p>
	 *
	 */
	public static final String $act_cost37 = "act_cost37";
	private static final MCPermColumnInfo _act_cost37 = createColumnInfo("act_cost37");
	public final MCNumberPermColumn act_cost37 = createNumberColumn(_act_cost37);
	
	/**
	 * 実際原価３８. Actual cost 38.<p>
	 *
	 */
	public static final String $act_cost38 = "act_cost38";
	private static final MCPermColumnInfo _act_cost38 = createColumnInfo("act_cost38");
	public final MCNumberPermColumn act_cost38 = createNumberColumn(_act_cost38);
	
	/**
	 * 実際原価３９. Actual cost 39.<p>
	 *
	 */
	public static final String $act_cost39 = "act_cost39";
	private static final MCPermColumnInfo _act_cost39 = createColumnInfo("act_cost39");
	public final MCNumberPermColumn act_cost39 = createNumberColumn(_act_cost39);
	
	/**
	 * 実際原価４０. Actual cost 40.<p>
	 *
	 */
	public static final String $act_cost40 = "act_cost40";
	private static final MCPermColumnInfo _act_cost40 = createColumnInfo("act_cost40");
	public final MCNumberPermColumn act_cost40 = createNumberColumn(_act_cost40);
	
	/**
	 * 実際原価４１. Actual cost 41.<p>
	 *
	 */
	public static final String $act_cost41 = "act_cost41";
	private static final MCPermColumnInfo _act_cost41 = createColumnInfo("act_cost41");
	public final MCNumberPermColumn act_cost41 = createNumberColumn(_act_cost41);
	
	/**
	 * 実際原価４２. Actual cost 42.<p>
	 *
	 */
	public static final String $act_cost42 = "act_cost42";
	private static final MCPermColumnInfo _act_cost42 = createColumnInfo("act_cost42");
	public final MCNumberPermColumn act_cost42 = createNumberColumn(_act_cost42);
	
	/**
	 * 実際原価４３. Actual cost 43.<p>
	 *
	 */
	public static final String $act_cost43 = "act_cost43";
	private static final MCPermColumnInfo _act_cost43 = createColumnInfo("act_cost43");
	public final MCNumberPermColumn act_cost43 = createNumberColumn(_act_cost43);
	
	/**
	 * 実際原価４４. Actual cost 44.<p>
	 *
	 */
	public static final String $act_cost44 = "act_cost44";
	private static final MCPermColumnInfo _act_cost44 = createColumnInfo("act_cost44");
	public final MCNumberPermColumn act_cost44 = createNumberColumn(_act_cost44);
	
	/**
	 * 実際原価４５. Actual cost 45.<p>
	 *
	 */
	public static final String $act_cost45 = "act_cost45";
	private static final MCPermColumnInfo _act_cost45 = createColumnInfo("act_cost45");
	public final MCNumberPermColumn act_cost45 = createNumberColumn(_act_cost45);
	
	/**
	 * 実際原価４６. Actual cost 46.<p>
	 *
	 */
	public static final String $act_cost46 = "act_cost46";
	private static final MCPermColumnInfo _act_cost46 = createColumnInfo("act_cost46");
	public final MCNumberPermColumn act_cost46 = createNumberColumn(_act_cost46);
	
	/**
	 * 実際原価４７. Actual cost 47.<p>
	 *
	 */
	public static final String $act_cost47 = "act_cost47";
	private static final MCPermColumnInfo _act_cost47 = createColumnInfo("act_cost47");
	public final MCNumberPermColumn act_cost47 = createNumberColumn(_act_cost47);
	
	/**
	 * 実際原価４８. Actual cost 48.<p>
	 *
	 */
	public static final String $act_cost48 = "act_cost48";
	private static final MCPermColumnInfo _act_cost48 = createColumnInfo("act_cost48");
	public final MCNumberPermColumn act_cost48 = createNumberColumn(_act_cost48);
	
	/**
	 * 実際原価４９. Actual cost 49.<p>
	 *
	 */
	public static final String $act_cost49 = "act_cost49";
	private static final MCPermColumnInfo _act_cost49 = createColumnInfo("act_cost49");
	public final MCNumberPermColumn act_cost49 = createNumberColumn(_act_cost49);
	
	/**
	 * 実際原価５０. Actual cost 50.<p>
	 *
	 */
	public static final String $act_cost50 = "act_cost50";
	private static final MCPermColumnInfo _act_cost50 = createColumnInfo("act_cost50");
	public final MCNumberPermColumn act_cost50 = createNumberColumn(_act_cost50);
	
	/**
	 * 実際原価５１. Actual cost 51.<p>
	 *
	 */
	public static final String $act_cost51 = "act_cost51";
	private static final MCPermColumnInfo _act_cost51 = createColumnInfo("act_cost51");
	public final MCNumberPermColumn act_cost51 = createNumberColumn(_act_cost51);
	
	/**
	 * 実際原価５２. Actual cost 52.<p>
	 *
	 */
	public static final String $act_cost52 = "act_cost52";
	private static final MCPermColumnInfo _act_cost52 = createColumnInfo("act_cost52");
	public final MCNumberPermColumn act_cost52 = createNumberColumn(_act_cost52);
	
	/**
	 * 実際原価５３. Actual cost 53.<p>
	 *
	 */
	public static final String $act_cost53 = "act_cost53";
	private static final MCPermColumnInfo _act_cost53 = createColumnInfo("act_cost53");
	public final MCNumberPermColumn act_cost53 = createNumberColumn(_act_cost53);
	
	/**
	 * 実際原価５４. Actual cost 54.<p>
	 *
	 */
	public static final String $act_cost54 = "act_cost54";
	private static final MCPermColumnInfo _act_cost54 = createColumnInfo("act_cost54");
	public final MCNumberPermColumn act_cost54 = createNumberColumn(_act_cost54);
	
	/**
	 * 実際原価５５. Actual cost 55.<p>
	 *
	 */
	public static final String $act_cost55 = "act_cost55";
	private static final MCPermColumnInfo _act_cost55 = createColumnInfo("act_cost55");
	public final MCNumberPermColumn act_cost55 = createNumberColumn(_act_cost55);
	
	/**
	 * 実際原価５６. Actual cost 56.<p>
	 *
	 */
	public static final String $act_cost56 = "act_cost56";
	private static final MCPermColumnInfo _act_cost56 = createColumnInfo("act_cost56");
	public final MCNumberPermColumn act_cost56 = createNumberColumn(_act_cost56);
	
	/**
	 * 実際原価５７. Actual cost 57.<p>
	 *
	 */
	public static final String $act_cost57 = "act_cost57";
	private static final MCPermColumnInfo _act_cost57 = createColumnInfo("act_cost57");
	public final MCNumberPermColumn act_cost57 = createNumberColumn(_act_cost57);
	
	/**
	 * 実際原価５８. Actual cost 58.<p>
	 *
	 */
	public static final String $act_cost58 = "act_cost58";
	private static final MCPermColumnInfo _act_cost58 = createColumnInfo("act_cost58");
	public final MCNumberPermColumn act_cost58 = createNumberColumn(_act_cost58);
	
	/**
	 * 実際原価５９. Actual cost 59.<p>
	 *
	 */
	public static final String $act_cost59 = "act_cost59";
	private static final MCPermColumnInfo _act_cost59 = createColumnInfo("act_cost59");
	public final MCNumberPermColumn act_cost59 = createNumberColumn(_act_cost59);
	
	/**
	 * 実際原価６０. Actual cost 60.<p>
	 *
	 */
	public static final String $act_cost60 = "act_cost60";
	private static final MCPermColumnInfo _act_cost60 = createColumnInfo("act_cost60");
	public final MCNumberPermColumn act_cost60 = createNumberColumn(_act_cost60);
	
	/**
	 * 実際原価６１. Actual cost 61.<p>
	 *
	 */
	public static final String $act_cost61 = "act_cost61";
	private static final MCPermColumnInfo _act_cost61 = createColumnInfo("act_cost61");
	public final MCNumberPermColumn act_cost61 = createNumberColumn(_act_cost61);
	
	/**
	 * 実際原価６２. Actual cost 62.<p>
	 *
	 */
	public static final String $act_cost62 = "act_cost62";
	private static final MCPermColumnInfo _act_cost62 = createColumnInfo("act_cost62");
	public final MCNumberPermColumn act_cost62 = createNumberColumn(_act_cost62);
	
	/**
	 * 実際原価６３. Actual cost 63.<p>
	 *
	 */
	public static final String $act_cost63 = "act_cost63";
	private static final MCPermColumnInfo _act_cost63 = createColumnInfo("act_cost63");
	public final MCNumberPermColumn act_cost63 = createNumberColumn(_act_cost63);
	
	/**
	 * 実際原価６４. Actual cost 64.<p>
	 *
	 */
	public static final String $act_cost64 = "act_cost64";
	private static final MCPermColumnInfo _act_cost64 = createColumnInfo("act_cost64");
	public final MCNumberPermColumn act_cost64 = createNumberColumn(_act_cost64);
	
	/**
	 * 実際原価６５. Actual cost 65.<p>
	 *
	 */
	public static final String $act_cost65 = "act_cost65";
	private static final MCPermColumnInfo _act_cost65 = createColumnInfo("act_cost65");
	public final MCNumberPermColumn act_cost65 = createNumberColumn(_act_cost65);
	
	/**
	 * 実際原価６６. Actual cost 66.<p>
	 *
	 */
	public static final String $act_cost66 = "act_cost66";
	private static final MCPermColumnInfo _act_cost66 = createColumnInfo("act_cost66");
	public final MCNumberPermColumn act_cost66 = createNumberColumn(_act_cost66);
	
	/**
	 * 実際原価６７. Actual cost 67.<p>
	 *
	 */
	public static final String $act_cost67 = "act_cost67";
	private static final MCPermColumnInfo _act_cost67 = createColumnInfo("act_cost67");
	public final MCNumberPermColumn act_cost67 = createNumberColumn(_act_cost67);
	
	/**
	 * 実際原価６８. Actual cost 68.<p>
	 *
	 */
	public static final String $act_cost68 = "act_cost68";
	private static final MCPermColumnInfo _act_cost68 = createColumnInfo("act_cost68");
	public final MCNumberPermColumn act_cost68 = createNumberColumn(_act_cost68);
	
	/**
	 * 実際原価６９. Actual cost 69.<p>
	 *
	 */
	public static final String $act_cost69 = "act_cost69";
	private static final MCPermColumnInfo _act_cost69 = createColumnInfo("act_cost69");
	public final MCNumberPermColumn act_cost69 = createNumberColumn(_act_cost69);
	
	/**
	 * 実際原価７０. Actual cost 70.<p>
	 *
	 */
	public static final String $act_cost70 = "act_cost70";
	private static final MCPermColumnInfo _act_cost70 = createColumnInfo("act_cost70");
	public final MCNumberPermColumn act_cost70 = createNumberColumn(_act_cost70);
	
	/**
	 * 実際原価７１. Actual cost 71.<p>
	 *
	 */
	public static final String $act_cost71 = "act_cost71";
	private static final MCPermColumnInfo _act_cost71 = createColumnInfo("act_cost71");
	public final MCNumberPermColumn act_cost71 = createNumberColumn(_act_cost71);
	
	/**
	 * 実際原価７２. Actual cost 72.<p>
	 *
	 */
	public static final String $act_cost72 = "act_cost72";
	private static final MCPermColumnInfo _act_cost72 = createColumnInfo("act_cost72");
	public final MCNumberPermColumn act_cost72 = createNumberColumn(_act_cost72);
	
	/**
	 * 実際原価７３. Actual cost 73.<p>
	 *
	 */
	public static final String $act_cost73 = "act_cost73";
	private static final MCPermColumnInfo _act_cost73 = createColumnInfo("act_cost73");
	public final MCNumberPermColumn act_cost73 = createNumberColumn(_act_cost73);
	
	/**
	 * 実際原価７４. Actual cost 74.<p>
	 *
	 */
	public static final String $act_cost74 = "act_cost74";
	private static final MCPermColumnInfo _act_cost74 = createColumnInfo("act_cost74");
	public final MCNumberPermColumn act_cost74 = createNumberColumn(_act_cost74);
	
	/**
	 * 実際原価７５. Actual cost 75.<p>
	 *
	 */
	public static final String $act_cost75 = "act_cost75";
	private static final MCPermColumnInfo _act_cost75 = createColumnInfo("act_cost75");
	public final MCNumberPermColumn act_cost75 = createNumberColumn(_act_cost75);
	
	/**
	 * 実際原価７６. Actual cost 76.<p>
	 *
	 */
	public static final String $act_cost76 = "act_cost76";
	private static final MCPermColumnInfo _act_cost76 = createColumnInfo("act_cost76");
	public final MCNumberPermColumn act_cost76 = createNumberColumn(_act_cost76);
	
	/**
	 * 実際原価７７. Actual cost 77.<p>
	 *
	 */
	public static final String $act_cost77 = "act_cost77";
	private static final MCPermColumnInfo _act_cost77 = createColumnInfo("act_cost77");
	public final MCNumberPermColumn act_cost77 = createNumberColumn(_act_cost77);
	
	/**
	 * 実際原価７８. Actual cost 78.<p>
	 *
	 */
	public static final String $act_cost78 = "act_cost78";
	private static final MCPermColumnInfo _act_cost78 = createColumnInfo("act_cost78");
	public final MCNumberPermColumn act_cost78 = createNumberColumn(_act_cost78);
	
	/**
	 * 実際原価７９. Actual cost 79.<p>
	 *
	 */
	public static final String $act_cost79 = "act_cost79";
	private static final MCPermColumnInfo _act_cost79 = createColumnInfo("act_cost79");
	public final MCNumberPermColumn act_cost79 = createNumberColumn(_act_cost79);
	
	/**
	 * 実際原価８０. Actual cost 80.<p>
	 *
	 */
	public static final String $act_cost80 = "act_cost80";
	private static final MCPermColumnInfo _act_cost80 = createColumnInfo("act_cost80");
	public final MCNumberPermColumn act_cost80 = createNumberColumn(_act_cost80);
	
	/**
	 * 実際原価８１. Actual cost 81.<p>
	 *
	 */
	public static final String $act_cost81 = "act_cost81";
	private static final MCPermColumnInfo _act_cost81 = createColumnInfo("act_cost81");
	public final MCNumberPermColumn act_cost81 = createNumberColumn(_act_cost81);
	
	/**
	 * 実際原価８２. Actual cost 82.<p>
	 *
	 */
	public static final String $act_cost82 = "act_cost82";
	private static final MCPermColumnInfo _act_cost82 = createColumnInfo("act_cost82");
	public final MCNumberPermColumn act_cost82 = createNumberColumn(_act_cost82);
	
	/**
	 * 実際原価８３. Actual cost 83.<p>
	 *
	 */
	public static final String $act_cost83 = "act_cost83";
	private static final MCPermColumnInfo _act_cost83 = createColumnInfo("act_cost83");
	public final MCNumberPermColumn act_cost83 = createNumberColumn(_act_cost83);
	
	/**
	 * 実際原価８４. Actual cost 84.<p>
	 *
	 */
	public static final String $act_cost84 = "act_cost84";
	private static final MCPermColumnInfo _act_cost84 = createColumnInfo("act_cost84");
	public final MCNumberPermColumn act_cost84 = createNumberColumn(_act_cost84);
	
	/**
	 * 実際原価８５. Actual cost 85.<p>
	 *
	 */
	public static final String $act_cost85 = "act_cost85";
	private static final MCPermColumnInfo _act_cost85 = createColumnInfo("act_cost85");
	public final MCNumberPermColumn act_cost85 = createNumberColumn(_act_cost85);
	
	/**
	 * 実際原価８６. Actual cost 86.<p>
	 *
	 */
	public static final String $act_cost86 = "act_cost86";
	private static final MCPermColumnInfo _act_cost86 = createColumnInfo("act_cost86");
	public final MCNumberPermColumn act_cost86 = createNumberColumn(_act_cost86);
	
	/**
	 * 実際原価８７. Actual cost 87.<p>
	 *
	 */
	public static final String $act_cost87 = "act_cost87";
	private static final MCPermColumnInfo _act_cost87 = createColumnInfo("act_cost87");
	public final MCNumberPermColumn act_cost87 = createNumberColumn(_act_cost87);
	
	/**
	 * 実際原価８８. Actual cost 88.<p>
	 *
	 */
	public static final String $act_cost88 = "act_cost88";
	private static final MCPermColumnInfo _act_cost88 = createColumnInfo("act_cost88");
	public final MCNumberPermColumn act_cost88 = createNumberColumn(_act_cost88);
	
	/**
	 * 実際原価８９. Actual cost 89.<p>
	 *
	 */
	public static final String $act_cost89 = "act_cost89";
	private static final MCPermColumnInfo _act_cost89 = createColumnInfo("act_cost89");
	public final MCNumberPermColumn act_cost89 = createNumberColumn(_act_cost89);
	
	/**
	 * 実際原価９０. Actual cost 90.<p>
	 *
	 */
	public static final String $act_cost90 = "act_cost90";
	private static final MCPermColumnInfo _act_cost90 = createColumnInfo("act_cost90");
	public final MCNumberPermColumn act_cost90 = createNumberColumn(_act_cost90);
	
	/**
	 * 実際原価９１. Actual cost 91.<p>
	 *
	 */
	public static final String $act_cost91 = "act_cost91";
	private static final MCPermColumnInfo _act_cost91 = createColumnInfo("act_cost91");
	public final MCNumberPermColumn act_cost91 = createNumberColumn(_act_cost91);
	
	/**
	 * 実際原価９２. Actual cost 92.<p>
	 *
	 */
	public static final String $act_cost92 = "act_cost92";
	private static final MCPermColumnInfo _act_cost92 = createColumnInfo("act_cost92");
	public final MCNumberPermColumn act_cost92 = createNumberColumn(_act_cost92);
	
	/**
	 * 実際原価９３. Actual cost 93.<p>
	 *
	 */
	public static final String $act_cost93 = "act_cost93";
	private static final MCPermColumnInfo _act_cost93 = createColumnInfo("act_cost93");
	public final MCNumberPermColumn act_cost93 = createNumberColumn(_act_cost93);
	
	/**
	 * 実際原価９４. Actual cost 94.<p>
	 *
	 */
	public static final String $act_cost94 = "act_cost94";
	private static final MCPermColumnInfo _act_cost94 = createColumnInfo("act_cost94");
	public final MCNumberPermColumn act_cost94 = createNumberColumn(_act_cost94);
	
	/**
	 * 実際原価９５. Actual cost 95.<p>
	 *
	 */
	public static final String $act_cost95 = "act_cost95";
	private static final MCPermColumnInfo _act_cost95 = createColumnInfo("act_cost95");
	public final MCNumberPermColumn act_cost95 = createNumberColumn(_act_cost95);
	
	/**
	 * 実際原価９６. Actual cost 96.<p>
	 *
	 */
	public static final String $act_cost96 = "act_cost96";
	private static final MCPermColumnInfo _act_cost96 = createColumnInfo("act_cost96");
	public final MCNumberPermColumn act_cost96 = createNumberColumn(_act_cost96);
	
	/**
	 * 実際原価９７. Actual cost 97.<p>
	 *
	 */
	public static final String $act_cost97 = "act_cost97";
	private static final MCPermColumnInfo _act_cost97 = createColumnInfo("act_cost97");
	public final MCNumberPermColumn act_cost97 = createNumberColumn(_act_cost97);
	
	/**
	 * 実際原価９８. Actual cost 98.<p>
	 *
	 */
	public static final String $act_cost98 = "act_cost98";
	private static final MCPermColumnInfo _act_cost98 = createColumnInfo("act_cost98");
	public final MCNumberPermColumn act_cost98 = createNumberColumn(_act_cost98);
	
	/**
	 * 実際原価９９. Actual cost 99.<p>
	 *
	 */
	public static final String $act_cost99 = "act_cost99";
	private static final MCPermColumnInfo _act_cost99 = createColumnInfo("act_cost99");
	public final MCNumberPermColumn act_cost99 = createNumberColumn(_act_cost99);
	
	/**
	 * 実際原価１００. Actual cost 100.<p>
	 *
	 */
	public static final String $act_cost100 = "act_cost100";
	private static final MCPermColumnInfo _act_cost100 = createColumnInfo("act_cost100");
	public final MCNumberPermColumn act_cost100 = createNumberColumn(_act_cost100);
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public static final String $std_cost = "std_cost";
	private static final MCPermColumnInfo _std_cost = createColumnInfo("std_cost");
	public final MCNumberPermColumn std_cost = createNumberColumn(_std_cost);
	
	/**
	 * 標準原価１. Standard cost 1.<p>
	 *
	 */
	public static final String $std_cost1 = "std_cost1";
	private static final MCPermColumnInfo _std_cost1 = createColumnInfo("std_cost1");
	public final MCNumberPermColumn std_cost1 = createNumberColumn(_std_cost1);
	
	/**
	 * 標準原価２. Standard cost 2.<p>
	 *
	 */
	public static final String $std_cost2 = "std_cost2";
	private static final MCPermColumnInfo _std_cost2 = createColumnInfo("std_cost2");
	public final MCNumberPermColumn std_cost2 = createNumberColumn(_std_cost2);
	
	/**
	 * 標準原価３. Standard cost 3.<p>
	 *
	 */
	public static final String $std_cost3 = "std_cost3";
	private static final MCPermColumnInfo _std_cost3 = createColumnInfo("std_cost3");
	public final MCNumberPermColumn std_cost3 = createNumberColumn(_std_cost3);
	
	/**
	 * 標準原価４. Standard cost 4.<p>
	 *
	 */
	public static final String $std_cost4 = "std_cost4";
	private static final MCPermColumnInfo _std_cost4 = createColumnInfo("std_cost4");
	public final MCNumberPermColumn std_cost4 = createNumberColumn(_std_cost4);
	
	/**
	 * 標準原価５. Standard cost 5.<p>
	 *
	 */
	public static final String $std_cost5 = "std_cost5";
	private static final MCPermColumnInfo _std_cost5 = createColumnInfo("std_cost5");
	public final MCNumberPermColumn std_cost5 = createNumberColumn(_std_cost5);
	
	/**
	 * 標準原価６. Standard cost 6.<p>
	 *
	 */
	public static final String $std_cost6 = "std_cost6";
	private static final MCPermColumnInfo _std_cost6 = createColumnInfo("std_cost6");
	public final MCNumberPermColumn std_cost6 = createNumberColumn(_std_cost6);
	
	/**
	 * 標準原価７. Standard cost 7.<p>
	 *
	 */
	public static final String $std_cost7 = "std_cost7";
	private static final MCPermColumnInfo _std_cost7 = createColumnInfo("std_cost7");
	public final MCNumberPermColumn std_cost7 = createNumberColumn(_std_cost7);
	
	/**
	 * 標準原価８. Standard cost 8.<p>
	 *
	 */
	public static final String $std_cost8 = "std_cost8";
	private static final MCPermColumnInfo _std_cost8 = createColumnInfo("std_cost8");
	public final MCNumberPermColumn std_cost8 = createNumberColumn(_std_cost8);
	
	/**
	 * 標準原価９. Standard cost 9.<p>
	 *
	 */
	public static final String $std_cost9 = "std_cost9";
	private static final MCPermColumnInfo _std_cost9 = createColumnInfo("std_cost9");
	public final MCNumberPermColumn std_cost9 = createNumberColumn(_std_cost9);
	
	/**
	 * 標準原価１０. Standard cost 10.<p>
	 *
	 */
	public static final String $std_cost10 = "std_cost10";
	private static final MCPermColumnInfo _std_cost10 = createColumnInfo("std_cost10");
	public final MCNumberPermColumn std_cost10 = createNumberColumn(_std_cost10);
	
	/**
	 * 標準原価１１. Standard cost 11.<p>
	 *
	 */
	public static final String $std_cost11 = "std_cost11";
	private static final MCPermColumnInfo _std_cost11 = createColumnInfo("std_cost11");
	public final MCNumberPermColumn std_cost11 = createNumberColumn(_std_cost11);
	
	/**
	 * 標準原価１２. Standard cost 12.<p>
	 *
	 */
	public static final String $std_cost12 = "std_cost12";
	private static final MCPermColumnInfo _std_cost12 = createColumnInfo("std_cost12");
	public final MCNumberPermColumn std_cost12 = createNumberColumn(_std_cost12);
	
	/**
	 * 標準原価１３. Standard cost 13.<p>
	 *
	 */
	public static final String $std_cost13 = "std_cost13";
	private static final MCPermColumnInfo _std_cost13 = createColumnInfo("std_cost13");
	public final MCNumberPermColumn std_cost13 = createNumberColumn(_std_cost13);
	
	/**
	 * 標準原価１４. Standard cost 14.<p>
	 *
	 */
	public static final String $std_cost14 = "std_cost14";
	private static final MCPermColumnInfo _std_cost14 = createColumnInfo("std_cost14");
	public final MCNumberPermColumn std_cost14 = createNumberColumn(_std_cost14);
	
	/**
	 * 標準原価１５. Standard cost 15.<p>
	 *
	 */
	public static final String $std_cost15 = "std_cost15";
	private static final MCPermColumnInfo _std_cost15 = createColumnInfo("std_cost15");
	public final MCNumberPermColumn std_cost15 = createNumberColumn(_std_cost15);
	
	/**
	 * 標準原価１６. Standard cost 16.<p>
	 *
	 */
	public static final String $std_cost16 = "std_cost16";
	private static final MCPermColumnInfo _std_cost16 = createColumnInfo("std_cost16");
	public final MCNumberPermColumn std_cost16 = createNumberColumn(_std_cost16);
	
	/**
	 * 標準原価１７. Standard cost 17.<p>
	 *
	 */
	public static final String $std_cost17 = "std_cost17";
	private static final MCPermColumnInfo _std_cost17 = createColumnInfo("std_cost17");
	public final MCNumberPermColumn std_cost17 = createNumberColumn(_std_cost17);
	
	/**
	 * 標準原価１８. Standard cost 18.<p>
	 *
	 */
	public static final String $std_cost18 = "std_cost18";
	private static final MCPermColumnInfo _std_cost18 = createColumnInfo("std_cost18");
	public final MCNumberPermColumn std_cost18 = createNumberColumn(_std_cost18);
	
	/**
	 * 標準原価１９. Standard cost 19.<p>
	 *
	 */
	public static final String $std_cost19 = "std_cost19";
	private static final MCPermColumnInfo _std_cost19 = createColumnInfo("std_cost19");
	public final MCNumberPermColumn std_cost19 = createNumberColumn(_std_cost19);
	
	/**
	 * 標準原価２０. Standard cost 20.<p>
	 *
	 */
	public static final String $std_cost20 = "std_cost20";
	private static final MCPermColumnInfo _std_cost20 = createColumnInfo("std_cost20");
	public final MCNumberPermColumn std_cost20 = createNumberColumn(_std_cost20);
	
	/**
	 * 標準原価２１. Standard cost 21.<p>
	 *
	 */
	public static final String $std_cost21 = "std_cost21";
	private static final MCPermColumnInfo _std_cost21 = createColumnInfo("std_cost21");
	public final MCNumberPermColumn std_cost21 = createNumberColumn(_std_cost21);
	
	/**
	 * 標準原価２２. Standard cost 22.<p>
	 *
	 */
	public static final String $std_cost22 = "std_cost22";
	private static final MCPermColumnInfo _std_cost22 = createColumnInfo("std_cost22");
	public final MCNumberPermColumn std_cost22 = createNumberColumn(_std_cost22);
	
	/**
	 * 標準原価２３. Standard cost 23.<p>
	 *
	 */
	public static final String $std_cost23 = "std_cost23";
	private static final MCPermColumnInfo _std_cost23 = createColumnInfo("std_cost23");
	public final MCNumberPermColumn std_cost23 = createNumberColumn(_std_cost23);
	
	/**
	 * 標準原価２４. Standard cost 24.<p>
	 *
	 */
	public static final String $std_cost24 = "std_cost24";
	private static final MCPermColumnInfo _std_cost24 = createColumnInfo("std_cost24");
	public final MCNumberPermColumn std_cost24 = createNumberColumn(_std_cost24);
	
	/**
	 * 標準原価２５. Standard cost 25.<p>
	 *
	 */
	public static final String $std_cost25 = "std_cost25";
	private static final MCPermColumnInfo _std_cost25 = createColumnInfo("std_cost25");
	public final MCNumberPermColumn std_cost25 = createNumberColumn(_std_cost25);
	
	/**
	 * 標準原価２６. Standard cost 26.<p>
	 *
	 */
	public static final String $std_cost26 = "std_cost26";
	private static final MCPermColumnInfo _std_cost26 = createColumnInfo("std_cost26");
	public final MCNumberPermColumn std_cost26 = createNumberColumn(_std_cost26);
	
	/**
	 * 標準原価２７. Standard cost 27.<p>
	 *
	 */
	public static final String $std_cost27 = "std_cost27";
	private static final MCPermColumnInfo _std_cost27 = createColumnInfo("std_cost27");
	public final MCNumberPermColumn std_cost27 = createNumberColumn(_std_cost27);
	
	/**
	 * 標準原価２８. Standard cost 28.<p>
	 *
	 */
	public static final String $std_cost28 = "std_cost28";
	private static final MCPermColumnInfo _std_cost28 = createColumnInfo("std_cost28");
	public final MCNumberPermColumn std_cost28 = createNumberColumn(_std_cost28);
	
	/**
	 * 標準原価２９. Standard cost 29.<p>
	 *
	 */
	public static final String $std_cost29 = "std_cost29";
	private static final MCPermColumnInfo _std_cost29 = createColumnInfo("std_cost29");
	public final MCNumberPermColumn std_cost29 = createNumberColumn(_std_cost29);
	
	/**
	 * 標準原価３０. Standard cost 30.<p>
	 *
	 */
	public static final String $std_cost30 = "std_cost30";
	private static final MCPermColumnInfo _std_cost30 = createColumnInfo("std_cost30");
	public final MCNumberPermColumn std_cost30 = createNumberColumn(_std_cost30);
	
	/**
	 * 標準原価３１. Standard cost 31.<p>
	 *
	 */
	public static final String $std_cost31 = "std_cost31";
	private static final MCPermColumnInfo _std_cost31 = createColumnInfo("std_cost31");
	public final MCNumberPermColumn std_cost31 = createNumberColumn(_std_cost31);
	
	/**
	 * 標準原価３２. Standard cost 32.<p>
	 *
	 */
	public static final String $std_cost32 = "std_cost32";
	private static final MCPermColumnInfo _std_cost32 = createColumnInfo("std_cost32");
	public final MCNumberPermColumn std_cost32 = createNumberColumn(_std_cost32);
	
	/**
	 * 標準原価３３. Standard cost 33.<p>
	 *
	 */
	public static final String $std_cost33 = "std_cost33";
	private static final MCPermColumnInfo _std_cost33 = createColumnInfo("std_cost33");
	public final MCNumberPermColumn std_cost33 = createNumberColumn(_std_cost33);
	
	/**
	 * 標準原価３４. Standard cost 34.<p>
	 *
	 */
	public static final String $std_cost34 = "std_cost34";
	private static final MCPermColumnInfo _std_cost34 = createColumnInfo("std_cost34");
	public final MCNumberPermColumn std_cost34 = createNumberColumn(_std_cost34);
	
	/**
	 * 標準原価３５. Standard cost 35.<p>
	 *
	 */
	public static final String $std_cost35 = "std_cost35";
	private static final MCPermColumnInfo _std_cost35 = createColumnInfo("std_cost35");
	public final MCNumberPermColumn std_cost35 = createNumberColumn(_std_cost35);
	
	/**
	 * 標準原価３６. Standard cost 36.<p>
	 *
	 */
	public static final String $std_cost36 = "std_cost36";
	private static final MCPermColumnInfo _std_cost36 = createColumnInfo("std_cost36");
	public final MCNumberPermColumn std_cost36 = createNumberColumn(_std_cost36);
	
	/**
	 * 標準原価３７. Standard cost 37.<p>
	 *
	 */
	public static final String $std_cost37 = "std_cost37";
	private static final MCPermColumnInfo _std_cost37 = createColumnInfo("std_cost37");
	public final MCNumberPermColumn std_cost37 = createNumberColumn(_std_cost37);
	
	/**
	 * 標準原価３８. Standard cost 38.<p>
	 *
	 */
	public static final String $std_cost38 = "std_cost38";
	private static final MCPermColumnInfo _std_cost38 = createColumnInfo("std_cost38");
	public final MCNumberPermColumn std_cost38 = createNumberColumn(_std_cost38);
	
	/**
	 * 標準原価３９. Standard cost 39.<p>
	 *
	 */
	public static final String $std_cost39 = "std_cost39";
	private static final MCPermColumnInfo _std_cost39 = createColumnInfo("std_cost39");
	public final MCNumberPermColumn std_cost39 = createNumberColumn(_std_cost39);
	
	/**
	 * 標準原価４０. Standard cost 40.<p>
	 *
	 */
	public static final String $std_cost40 = "std_cost40";
	private static final MCPermColumnInfo _std_cost40 = createColumnInfo("std_cost40");
	public final MCNumberPermColumn std_cost40 = createNumberColumn(_std_cost40);
	
	/**
	 * 標準原価４１. Standard cost 41.<p>
	 *
	 */
	public static final String $std_cost41 = "std_cost41";
	private static final MCPermColumnInfo _std_cost41 = createColumnInfo("std_cost41");
	public final MCNumberPermColumn std_cost41 = createNumberColumn(_std_cost41);
	
	/**
	 * 標準原価４２. Standard cost 42.<p>
	 *
	 */
	public static final String $std_cost42 = "std_cost42";
	private static final MCPermColumnInfo _std_cost42 = createColumnInfo("std_cost42");
	public final MCNumberPermColumn std_cost42 = createNumberColumn(_std_cost42);
	
	/**
	 * 標準原価４３. Standard cost 43.<p>
	 *
	 */
	public static final String $std_cost43 = "std_cost43";
	private static final MCPermColumnInfo _std_cost43 = createColumnInfo("std_cost43");
	public final MCNumberPermColumn std_cost43 = createNumberColumn(_std_cost43);
	
	/**
	 * 標準原価４４. Standard cost 44.<p>
	 *
	 */
	public static final String $std_cost44 = "std_cost44";
	private static final MCPermColumnInfo _std_cost44 = createColumnInfo("std_cost44");
	public final MCNumberPermColumn std_cost44 = createNumberColumn(_std_cost44);
	
	/**
	 * 標準原価４５. Standard cost 45.<p>
	 *
	 */
	public static final String $std_cost45 = "std_cost45";
	private static final MCPermColumnInfo _std_cost45 = createColumnInfo("std_cost45");
	public final MCNumberPermColumn std_cost45 = createNumberColumn(_std_cost45);
	
	/**
	 * 標準原価４６. Standard cost 46.<p>
	 *
	 */
	public static final String $std_cost46 = "std_cost46";
	private static final MCPermColumnInfo _std_cost46 = createColumnInfo("std_cost46");
	public final MCNumberPermColumn std_cost46 = createNumberColumn(_std_cost46);
	
	/**
	 * 標準原価４７. Standard cost 47.<p>
	 *
	 */
	public static final String $std_cost47 = "std_cost47";
	private static final MCPermColumnInfo _std_cost47 = createColumnInfo("std_cost47");
	public final MCNumberPermColumn std_cost47 = createNumberColumn(_std_cost47);
	
	/**
	 * 標準原価４８. Standard cost 48.<p>
	 *
	 */
	public static final String $std_cost48 = "std_cost48";
	private static final MCPermColumnInfo _std_cost48 = createColumnInfo("std_cost48");
	public final MCNumberPermColumn std_cost48 = createNumberColumn(_std_cost48);
	
	/**
	 * 標準原価４９. Standard cost 49.<p>
	 *
	 */
	public static final String $std_cost49 = "std_cost49";
	private static final MCPermColumnInfo _std_cost49 = createColumnInfo("std_cost49");
	public final MCNumberPermColumn std_cost49 = createNumberColumn(_std_cost49);
	
	/**
	 * 標準原価５０. Standard cost 50.<p>
	 *
	 */
	public static final String $std_cost50 = "std_cost50";
	private static final MCPermColumnInfo _std_cost50 = createColumnInfo("std_cost50");
	public final MCNumberPermColumn std_cost50 = createNumberColumn(_std_cost50);
	
	/**
	 * 標準原価５１. Standard cost 51.<p>
	 *
	 */
	public static final String $std_cost51 = "std_cost51";
	private static final MCPermColumnInfo _std_cost51 = createColumnInfo("std_cost51");
	public final MCNumberPermColumn std_cost51 = createNumberColumn(_std_cost51);
	
	/**
	 * 標準原価５２. Standard cost 52.<p>
	 *
	 */
	public static final String $std_cost52 = "std_cost52";
	private static final MCPermColumnInfo _std_cost52 = createColumnInfo("std_cost52");
	public final MCNumberPermColumn std_cost52 = createNumberColumn(_std_cost52);
	
	/**
	 * 標準原価５３. Standard cost 53.<p>
	 *
	 */
	public static final String $std_cost53 = "std_cost53";
	private static final MCPermColumnInfo _std_cost53 = createColumnInfo("std_cost53");
	public final MCNumberPermColumn std_cost53 = createNumberColumn(_std_cost53);
	
	/**
	 * 標準原価５４. Standard cost 54.<p>
	 *
	 */
	public static final String $std_cost54 = "std_cost54";
	private static final MCPermColumnInfo _std_cost54 = createColumnInfo("std_cost54");
	public final MCNumberPermColumn std_cost54 = createNumberColumn(_std_cost54);
	
	/**
	 * 標準原価５５. Standard cost 55.<p>
	 *
	 */
	public static final String $std_cost55 = "std_cost55";
	private static final MCPermColumnInfo _std_cost55 = createColumnInfo("std_cost55");
	public final MCNumberPermColumn std_cost55 = createNumberColumn(_std_cost55);
	
	/**
	 * 標準原価５６. Standard cost 56.<p>
	 *
	 */
	public static final String $std_cost56 = "std_cost56";
	private static final MCPermColumnInfo _std_cost56 = createColumnInfo("std_cost56");
	public final MCNumberPermColumn std_cost56 = createNumberColumn(_std_cost56);
	
	/**
	 * 標準原価５７. Standard cost 57.<p>
	 *
	 */
	public static final String $std_cost57 = "std_cost57";
	private static final MCPermColumnInfo _std_cost57 = createColumnInfo("std_cost57");
	public final MCNumberPermColumn std_cost57 = createNumberColumn(_std_cost57);
	
	/**
	 * 標準原価５８. Standard cost 58.<p>
	 *
	 */
	public static final String $std_cost58 = "std_cost58";
	private static final MCPermColumnInfo _std_cost58 = createColumnInfo("std_cost58");
	public final MCNumberPermColumn std_cost58 = createNumberColumn(_std_cost58);
	
	/**
	 * 標準原価５９. Standard cost 59.<p>
	 *
	 */
	public static final String $std_cost59 = "std_cost59";
	private static final MCPermColumnInfo _std_cost59 = createColumnInfo("std_cost59");
	public final MCNumberPermColumn std_cost59 = createNumberColumn(_std_cost59);
	
	/**
	 * 標準原価６０. Standard cost 60.<p>
	 *
	 */
	public static final String $std_cost60 = "std_cost60";
	private static final MCPermColumnInfo _std_cost60 = createColumnInfo("std_cost60");
	public final MCNumberPermColumn std_cost60 = createNumberColumn(_std_cost60);
	
	/**
	 * 標準原価６１. Standard cost 61.<p>
	 *
	 */
	public static final String $std_cost61 = "std_cost61";
	private static final MCPermColumnInfo _std_cost61 = createColumnInfo("std_cost61");
	public final MCNumberPermColumn std_cost61 = createNumberColumn(_std_cost61);
	
	/**
	 * 標準原価６２. Standard cost 62.<p>
	 *
	 */
	public static final String $std_cost62 = "std_cost62";
	private static final MCPermColumnInfo _std_cost62 = createColumnInfo("std_cost62");
	public final MCNumberPermColumn std_cost62 = createNumberColumn(_std_cost62);
	
	/**
	 * 標準原価６３. Standard cost 63.<p>
	 *
	 */
	public static final String $std_cost63 = "std_cost63";
	private static final MCPermColumnInfo _std_cost63 = createColumnInfo("std_cost63");
	public final MCNumberPermColumn std_cost63 = createNumberColumn(_std_cost63);
	
	/**
	 * 標準原価６４. Standard cost 64.<p>
	 *
	 */
	public static final String $std_cost64 = "std_cost64";
	private static final MCPermColumnInfo _std_cost64 = createColumnInfo("std_cost64");
	public final MCNumberPermColumn std_cost64 = createNumberColumn(_std_cost64);
	
	/**
	 * 標準原価６５. Standard cost 65.<p>
	 *
	 */
	public static final String $std_cost65 = "std_cost65";
	private static final MCPermColumnInfo _std_cost65 = createColumnInfo("std_cost65");
	public final MCNumberPermColumn std_cost65 = createNumberColumn(_std_cost65);
	
	/**
	 * 標準原価６６. Standard cost 66.<p>
	 *
	 */
	public static final String $std_cost66 = "std_cost66";
	private static final MCPermColumnInfo _std_cost66 = createColumnInfo("std_cost66");
	public final MCNumberPermColumn std_cost66 = createNumberColumn(_std_cost66);
	
	/**
	 * 標準原価６７. Standard cost 67.<p>
	 *
	 */
	public static final String $std_cost67 = "std_cost67";
	private static final MCPermColumnInfo _std_cost67 = createColumnInfo("std_cost67");
	public final MCNumberPermColumn std_cost67 = createNumberColumn(_std_cost67);
	
	/**
	 * 標準原価６８. Standard cost 68.<p>
	 *
	 */
	public static final String $std_cost68 = "std_cost68";
	private static final MCPermColumnInfo _std_cost68 = createColumnInfo("std_cost68");
	public final MCNumberPermColumn std_cost68 = createNumberColumn(_std_cost68);
	
	/**
	 * 標準原価６９. Standard cost 69.<p>
	 *
	 */
	public static final String $std_cost69 = "std_cost69";
	private static final MCPermColumnInfo _std_cost69 = createColumnInfo("std_cost69");
	public final MCNumberPermColumn std_cost69 = createNumberColumn(_std_cost69);
	
	/**
	 * 標準原価７０. Standard cost 70.<p>
	 *
	 */
	public static final String $std_cost70 = "std_cost70";
	private static final MCPermColumnInfo _std_cost70 = createColumnInfo("std_cost70");
	public final MCNumberPermColumn std_cost70 = createNumberColumn(_std_cost70);
	
	/**
	 * 標準原価７１. Standard cost 71.<p>
	 *
	 */
	public static final String $std_cost71 = "std_cost71";
	private static final MCPermColumnInfo _std_cost71 = createColumnInfo("std_cost71");
	public final MCNumberPermColumn std_cost71 = createNumberColumn(_std_cost71);
	
	/**
	 * 標準原価７２. Standard cost 72.<p>
	 *
	 */
	public static final String $std_cost72 = "std_cost72";
	private static final MCPermColumnInfo _std_cost72 = createColumnInfo("std_cost72");
	public final MCNumberPermColumn std_cost72 = createNumberColumn(_std_cost72);
	
	/**
	 * 標準原価７３. Standard cost 73.<p>
	 *
	 */
	public static final String $std_cost73 = "std_cost73";
	private static final MCPermColumnInfo _std_cost73 = createColumnInfo("std_cost73");
	public final MCNumberPermColumn std_cost73 = createNumberColumn(_std_cost73);
	
	/**
	 * 標準原価７４. Standard cost 74.<p>
	 *
	 */
	public static final String $std_cost74 = "std_cost74";
	private static final MCPermColumnInfo _std_cost74 = createColumnInfo("std_cost74");
	public final MCNumberPermColumn std_cost74 = createNumberColumn(_std_cost74);
	
	/**
	 * 標準原価７５. Standard cost 75.<p>
	 *
	 */
	public static final String $std_cost75 = "std_cost75";
	private static final MCPermColumnInfo _std_cost75 = createColumnInfo("std_cost75");
	public final MCNumberPermColumn std_cost75 = createNumberColumn(_std_cost75);
	
	/**
	 * 標準原価７６. Standard cost 76.<p>
	 *
	 */
	public static final String $std_cost76 = "std_cost76";
	private static final MCPermColumnInfo _std_cost76 = createColumnInfo("std_cost76");
	public final MCNumberPermColumn std_cost76 = createNumberColumn(_std_cost76);
	
	/**
	 * 標準原価７７. Standard cost 77.<p>
	 *
	 */
	public static final String $std_cost77 = "std_cost77";
	private static final MCPermColumnInfo _std_cost77 = createColumnInfo("std_cost77");
	public final MCNumberPermColumn std_cost77 = createNumberColumn(_std_cost77);
	
	/**
	 * 標準原価７８. Standard cost 78.<p>
	 *
	 */
	public static final String $std_cost78 = "std_cost78";
	private static final MCPermColumnInfo _std_cost78 = createColumnInfo("std_cost78");
	public final MCNumberPermColumn std_cost78 = createNumberColumn(_std_cost78);
	
	/**
	 * 標準原価７９. Standard cost 79.<p>
	 *
	 */
	public static final String $std_cost79 = "std_cost79";
	private static final MCPermColumnInfo _std_cost79 = createColumnInfo("std_cost79");
	public final MCNumberPermColumn std_cost79 = createNumberColumn(_std_cost79);
	
	/**
	 * 標準原価８０. Standard cost 80.<p>
	 *
	 */
	public static final String $std_cost80 = "std_cost80";
	private static final MCPermColumnInfo _std_cost80 = createColumnInfo("std_cost80");
	public final MCNumberPermColumn std_cost80 = createNumberColumn(_std_cost80);
	
	/**
	 * 標準原価８１. Standard cost 81.<p>
	 *
	 */
	public static final String $std_cost81 = "std_cost81";
	private static final MCPermColumnInfo _std_cost81 = createColumnInfo("std_cost81");
	public final MCNumberPermColumn std_cost81 = createNumberColumn(_std_cost81);
	
	/**
	 * 標準原価８２. Standard cost 82.<p>
	 *
	 */
	public static final String $std_cost82 = "std_cost82";
	private static final MCPermColumnInfo _std_cost82 = createColumnInfo("std_cost82");
	public final MCNumberPermColumn std_cost82 = createNumberColumn(_std_cost82);
	
	/**
	 * 標準原価８３. Standard cost 83.<p>
	 *
	 */
	public static final String $std_cost83 = "std_cost83";
	private static final MCPermColumnInfo _std_cost83 = createColumnInfo("std_cost83");
	public final MCNumberPermColumn std_cost83 = createNumberColumn(_std_cost83);
	
	/**
	 * 標準原価８４. Standard cost 84.<p>
	 *
	 */
	public static final String $std_cost84 = "std_cost84";
	private static final MCPermColumnInfo _std_cost84 = createColumnInfo("std_cost84");
	public final MCNumberPermColumn std_cost84 = createNumberColumn(_std_cost84);
	
	/**
	 * 標準原価８５. Standard cost 85.<p>
	 *
	 */
	public static final String $std_cost85 = "std_cost85";
	private static final MCPermColumnInfo _std_cost85 = createColumnInfo("std_cost85");
	public final MCNumberPermColumn std_cost85 = createNumberColumn(_std_cost85);
	
	/**
	 * 標準原価８６. Standard cost 86.<p>
	 *
	 */
	public static final String $std_cost86 = "std_cost86";
	private static final MCPermColumnInfo _std_cost86 = createColumnInfo("std_cost86");
	public final MCNumberPermColumn std_cost86 = createNumberColumn(_std_cost86);
	
	/**
	 * 標準原価８７. Standard cost 87.<p>
	 *
	 */
	public static final String $std_cost87 = "std_cost87";
	private static final MCPermColumnInfo _std_cost87 = createColumnInfo("std_cost87");
	public final MCNumberPermColumn std_cost87 = createNumberColumn(_std_cost87);
	
	/**
	 * 標準原価８８. Standard cost 88.<p>
	 *
	 */
	public static final String $std_cost88 = "std_cost88";
	private static final MCPermColumnInfo _std_cost88 = createColumnInfo("std_cost88");
	public final MCNumberPermColumn std_cost88 = createNumberColumn(_std_cost88);
	
	/**
	 * 標準原価８９. Standard cost 89.<p>
	 *
	 */
	public static final String $std_cost89 = "std_cost89";
	private static final MCPermColumnInfo _std_cost89 = createColumnInfo("std_cost89");
	public final MCNumberPermColumn std_cost89 = createNumberColumn(_std_cost89);
	
	/**
	 * 標準原価９０. Standard cost 90.<p>
	 *
	 */
	public static final String $std_cost90 = "std_cost90";
	private static final MCPermColumnInfo _std_cost90 = createColumnInfo("std_cost90");
	public final MCNumberPermColumn std_cost90 = createNumberColumn(_std_cost90);
	
	/**
	 * 標準原価９１. Standard cost 91.<p>
	 *
	 */
	public static final String $std_cost91 = "std_cost91";
	private static final MCPermColumnInfo _std_cost91 = createColumnInfo("std_cost91");
	public final MCNumberPermColumn std_cost91 = createNumberColumn(_std_cost91);
	
	/**
	 * 標準原価９２. Standard cost 92.<p>
	 *
	 */
	public static final String $std_cost92 = "std_cost92";
	private static final MCPermColumnInfo _std_cost92 = createColumnInfo("std_cost92");
	public final MCNumberPermColumn std_cost92 = createNumberColumn(_std_cost92);
	
	/**
	 * 標準原価９３. Standard cost 93.<p>
	 *
	 */
	public static final String $std_cost93 = "std_cost93";
	private static final MCPermColumnInfo _std_cost93 = createColumnInfo("std_cost93");
	public final MCNumberPermColumn std_cost93 = createNumberColumn(_std_cost93);
	
	/**
	 * 標準原価９４. Standard cost 94.<p>
	 *
	 */
	public static final String $std_cost94 = "std_cost94";
	private static final MCPermColumnInfo _std_cost94 = createColumnInfo("std_cost94");
	public final MCNumberPermColumn std_cost94 = createNumberColumn(_std_cost94);
	
	/**
	 * 標準原価９５. Standard cost 95.<p>
	 *
	 */
	public static final String $std_cost95 = "std_cost95";
	private static final MCPermColumnInfo _std_cost95 = createColumnInfo("std_cost95");
	public final MCNumberPermColumn std_cost95 = createNumberColumn(_std_cost95);
	
	/**
	 * 標準原価９６. Standard cost 96.<p>
	 *
	 */
	public static final String $std_cost96 = "std_cost96";
	private static final MCPermColumnInfo _std_cost96 = createColumnInfo("std_cost96");
	public final MCNumberPermColumn std_cost96 = createNumberColumn(_std_cost96);
	
	/**
	 * 標準原価９７. Standard cost 97.<p>
	 *
	 */
	public static final String $std_cost97 = "std_cost97";
	private static final MCPermColumnInfo _std_cost97 = createColumnInfo("std_cost97");
	public final MCNumberPermColumn std_cost97 = createNumberColumn(_std_cost97);
	
	/**
	 * 標準原価９８. Standard cost 98.<p>
	 *
	 */
	public static final String $std_cost98 = "std_cost98";
	private static final MCPermColumnInfo _std_cost98 = createColumnInfo("std_cost98");
	public final MCNumberPermColumn std_cost98 = createNumberColumn(_std_cost98);
	
	/**
	 * 標準原価９９. Standard cost 99.<p>
	 *
	 */
	public static final String $std_cost99 = "std_cost99";
	private static final MCPermColumnInfo _std_cost99 = createColumnInfo("std_cost99");
	public final MCNumberPermColumn std_cost99 = createNumberColumn(_std_cost99);
	
	/**
	 * 標準原価１００. Standard cost 100.<p>
	 *
	 */
	public static final String $std_cost100 = "std_cost100";
	private static final MCPermColumnInfo _std_cost100 = createColumnInfo("std_cost100");
	public final MCNumberPermColumn std_cost100 = createNumberColumn(_std_cost100);
	
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
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public static final String $if_sub_char1 = "if_sub_char1";
	private static final MCPermColumnInfo _if_sub_char1 = createColumnInfo("if_sub_char1");
	public final MCStringPermColumn if_sub_char1 = createStringColumn(_if_sub_char1);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public static final String $if_sub_char2 = "if_sub_char2";
	private static final MCPermColumnInfo _if_sub_char2 = createColumnInfo("if_sub_char2");
	public final MCStringPermColumn if_sub_char2 = createStringColumn(_if_sub_char2);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public static final String $if_sub_char3 = "if_sub_char3";
	private static final MCPermColumnInfo _if_sub_char3 = createColumnInfo("if_sub_char3");
	public final MCStringPermColumn if_sub_char3 = createStringColumn(_if_sub_char3);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public static final String $if_sub_char4 = "if_sub_char4";
	private static final MCPermColumnInfo _if_sub_char4 = createColumnInfo("if_sub_char4");
	public final MCStringPermColumn if_sub_char4 = createStringColumn(_if_sub_char4);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public static final String $if_sub_char5 = "if_sub_char5";
	private static final MCPermColumnInfo _if_sub_char5 = createColumnInfo("if_sub_char5");
	public final MCStringPermColumn if_sub_char5 = createStringColumn(_if_sub_char5);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public static final String $if_sub_char6 = "if_sub_char6";
	private static final MCPermColumnInfo _if_sub_char6 = createColumnInfo("if_sub_char6");
	public final MCStringPermColumn if_sub_char6 = createStringColumn(_if_sub_char6);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public static final String $if_sub_char7 = "if_sub_char7";
	private static final MCPermColumnInfo _if_sub_char7 = createColumnInfo("if_sub_char7");
	public final MCStringPermColumn if_sub_char7 = createStringColumn(_if_sub_char7);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public static final String $if_sub_char8 = "if_sub_char8";
	private static final MCPermColumnInfo _if_sub_char8 = createColumnInfo("if_sub_char8");
	public final MCStringPermColumn if_sub_char8 = createStringColumn(_if_sub_char8);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public static final String $if_sub_char9 = "if_sub_char9";
	private static final MCPermColumnInfo _if_sub_char9 = createColumnInfo("if_sub_char9");
	public final MCStringPermColumn if_sub_char9 = createStringColumn(_if_sub_char9);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public static final String $if_sub_char10 = "if_sub_char10";
	private static final MCPermColumnInfo _if_sub_char10 = createColumnInfo("if_sub_char10");
	public final MCStringPermColumn if_sub_char10 = createStringColumn(_if_sub_char10);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public static final String $if_sub_char11 = "if_sub_char11";
	private static final MCPermColumnInfo _if_sub_char11 = createColumnInfo("if_sub_char11");
	public final MCStringPermColumn if_sub_char11 = createStringColumn(_if_sub_char11);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public static final String $if_sub_char12 = "if_sub_char12";
	private static final MCPermColumnInfo _if_sub_char12 = createColumnInfo("if_sub_char12");
	public final MCStringPermColumn if_sub_char12 = createStringColumn(_if_sub_char12);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public static final String $if_sub_char13 = "if_sub_char13";
	private static final MCPermColumnInfo _if_sub_char13 = createColumnInfo("if_sub_char13");
	public final MCStringPermColumn if_sub_char13 = createStringColumn(_if_sub_char13);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public static final String $if_sub_char14 = "if_sub_char14";
	private static final MCPermColumnInfo _if_sub_char14 = createColumnInfo("if_sub_char14");
	public final MCStringPermColumn if_sub_char14 = createStringColumn(_if_sub_char14);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public static final String $if_sub_char15 = "if_sub_char15";
	private static final MCPermColumnInfo _if_sub_char15 = createColumnInfo("if_sub_char15");
	public final MCStringPermColumn if_sub_char15 = createStringColumn(_if_sub_char15);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public static final String $if_sub_char16 = "if_sub_char16";
	private static final MCPermColumnInfo _if_sub_char16 = createColumnInfo("if_sub_char16");
	public final MCStringPermColumn if_sub_char16 = createStringColumn(_if_sub_char16);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public static final String $if_sub_char17 = "if_sub_char17";
	private static final MCPermColumnInfo _if_sub_char17 = createColumnInfo("if_sub_char17");
	public final MCStringPermColumn if_sub_char17 = createStringColumn(_if_sub_char17);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public static final String $if_sub_char18 = "if_sub_char18";
	private static final MCPermColumnInfo _if_sub_char18 = createColumnInfo("if_sub_char18");
	public final MCStringPermColumn if_sub_char18 = createStringColumn(_if_sub_char18);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public static final String $if_sub_char19 = "if_sub_char19";
	private static final MCPermColumnInfo _if_sub_char19 = createColumnInfo("if_sub_char19");
	public final MCStringPermColumn if_sub_char19 = createStringColumn(_if_sub_char19);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public static final String $if_sub_char20 = "if_sub_char20";
	private static final MCPermColumnInfo _if_sub_char20 = createColumnInfo("if_sub_char20");
	public final MCStringPermColumn if_sub_char20 = createStringColumn(_if_sub_char20);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public static final String $if_sub_char21 = "if_sub_char21";
	private static final MCPermColumnInfo _if_sub_char21 = createColumnInfo("if_sub_char21");
	public final MCStringPermColumn if_sub_char21 = createStringColumn(_if_sub_char21);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public static final String $if_sub_char22 = "if_sub_char22";
	private static final MCPermColumnInfo _if_sub_char22 = createColumnInfo("if_sub_char22");
	public final MCStringPermColumn if_sub_char22 = createStringColumn(_if_sub_char22);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public static final String $if_sub_char23 = "if_sub_char23";
	private static final MCPermColumnInfo _if_sub_char23 = createColumnInfo("if_sub_char23");
	public final MCStringPermColumn if_sub_char23 = createStringColumn(_if_sub_char23);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public static final String $if_sub_char24 = "if_sub_char24";
	private static final MCPermColumnInfo _if_sub_char24 = createColumnInfo("if_sub_char24");
	public final MCStringPermColumn if_sub_char24 = createStringColumn(_if_sub_char24);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public static final String $if_sub_char25 = "if_sub_char25";
	private static final MCPermColumnInfo _if_sub_char25 = createColumnInfo("if_sub_char25");
	public final MCStringPermColumn if_sub_char25 = createStringColumn(_if_sub_char25);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public static final String $if_sub_char26 = "if_sub_char26";
	private static final MCPermColumnInfo _if_sub_char26 = createColumnInfo("if_sub_char26");
	public final MCStringPermColumn if_sub_char26 = createStringColumn(_if_sub_char26);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public static final String $if_sub_char27 = "if_sub_char27";
	private static final MCPermColumnInfo _if_sub_char27 = createColumnInfo("if_sub_char27");
	public final MCStringPermColumn if_sub_char27 = createStringColumn(_if_sub_char27);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public static final String $if_sub_char28 = "if_sub_char28";
	private static final MCPermColumnInfo _if_sub_char28 = createColumnInfo("if_sub_char28");
	public final MCStringPermColumn if_sub_char28 = createStringColumn(_if_sub_char28);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public static final String $if_sub_char29 = "if_sub_char29";
	private static final MCPermColumnInfo _if_sub_char29 = createColumnInfo("if_sub_char29");
	public final MCStringPermColumn if_sub_char29 = createStringColumn(_if_sub_char29);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public static final String $if_sub_char30 = "if_sub_char30";
	private static final MCPermColumnInfo _if_sub_char30 = createColumnInfo("if_sub_char30");
	public final MCStringPermColumn if_sub_char30 = createStringColumn(_if_sub_char30);
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public static final String $if_sub_num1 = "if_sub_num1";
	private static final MCPermColumnInfo _if_sub_num1 = createColumnInfo("if_sub_num1");
	public final MCNumberPermColumn if_sub_num1 = createNumberColumn(_if_sub_num1);
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public static final String $if_sub_num2 = "if_sub_num2";
	private static final MCPermColumnInfo _if_sub_num2 = createColumnInfo("if_sub_num2");
	public final MCNumberPermColumn if_sub_num2 = createNumberColumn(_if_sub_num2);
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public static final String $if_sub_num3 = "if_sub_num3";
	private static final MCPermColumnInfo _if_sub_num3 = createColumnInfo("if_sub_num3");
	public final MCNumberPermColumn if_sub_num3 = createNumberColumn(_if_sub_num3);
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public static final String $if_sub_num4 = "if_sub_num4";
	private static final MCPermColumnInfo _if_sub_num4 = createColumnInfo("if_sub_num4");
	public final MCNumberPermColumn if_sub_num4 = createNumberColumn(_if_sub_num4);
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public static final String $if_sub_num5 = "if_sub_num5";
	private static final MCPermColumnInfo _if_sub_num5 = createColumnInfo("if_sub_num5");
	public final MCNumberPermColumn if_sub_num5 = createNumberColumn(_if_sub_num5);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public static final String $if_sub_dt1 = "if_sub_dt1";
	private static final MCPermColumnInfo _if_sub_dt1 = createColumnInfo("if_sub_dt1");
	public final MCDatePermColumn if_sub_dt1 = createDateColumn(_if_sub_dt1);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public static final String $if_sub_dt2 = "if_sub_dt2";
	private static final MCPermColumnInfo _if_sub_dt2 = createColumnInfo("if_sub_dt2");
	public final MCDatePermColumn if_sub_dt2 = createDateColumn(_if_sub_dt2);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public static final String $if_sub_dt3 = "if_sub_dt3";
	private static final MCPermColumnInfo _if_sub_dt3 = createColumnInfo("if_sub_dt3");
	public final MCDatePermColumn if_sub_dt3 = createDateColumn(_if_sub_dt3);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public static final String $if_sub_dt4 = "if_sub_dt4";
	private static final MCPermColumnInfo _if_sub_dt4 = createColumnInfo("if_sub_dt4");
	public final MCDatePermColumn if_sub_dt4 = createDateColumn(_if_sub_dt4);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public static final String $if_sub_dt5 = "if_sub_dt5";
	private static final MCPermColumnInfo _if_sub_dt5 = createColumnInfo("if_sub_dt5");
	public final MCDatePermColumn if_sub_dt5 = createDateColumn(_if_sub_dt5);
	
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
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta bi_not_send_flg_META = createCommonMeta($bi_not_send_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_rec_typ_META = createCommonMeta($calc_rec_typ, mcframe.commonMG.meta.MG_META.CALC_REC_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_purc_typ_META = createCommonMeta($mfg_purc_typ, mcframe.commonMA.meta.MA_META.MFG_PURC_TYP);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta cost_io_typ_META = createCommonMeta($cost_io_typ, mcframe.commonMA.meta.MA_META.COST_IO_TYP);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta act_id_META = createCommonMeta($act_id, mcframe.commonMG.meta.MG_META.ACT_ID);
	public static final MCMeta act_id_sub_META = createCommonMeta($act_id_sub, mcframe.commonMG.meta.MG_META.ACT_ID_SUB);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta alc_dpt_cd_META = createCommonMeta($alc_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta other_dpt_cd_META = createCommonMeta($other_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cost_sls_cd1_META = createCommonMeta($cost_sls_cd1, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_cd2_META = createCommonMeta($cost_sls_cd2, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_cd3_META = createCommonMeta($cost_sls_cd3, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_cd4_META = createCommonMeta($cost_sls_cd4, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_cd5_META = createCommonMeta($cost_sls_cd5, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inst_qty_META = createCommonMeta($inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_qty_META = createCommonMeta($std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta std_amt_META = createCommonMeta($std_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_amt_META = createCommonMeta($cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cur_std_amt_META = createCommonMeta($cur_std_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_xrate_META = createCommonMeta($std_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri_diff_META = createCommonMeta($upri_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rate_diff_META = createCommonMeta($rate_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_grp_META = createCommonMeta($trd_grp, mcframe.commonMA.meta.MA_META.TRD_GRP);
	public static final MCMeta act_upri_META = createCommonMeta($act_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta so_act_amt_META = createCommonMeta($so_act_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta so_std_amt_META = createCommonMeta($so_std_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta per_META = createCommonMeta($per, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta mfg_cost_ratio_META = createCommonMeta($mfg_cost_ratio, mcframe.commonMG.meta.MG_META.MFG_COST_RATIO);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta gp_alc_cd_META = createCommonMeta($gp_alc_cd, mcframe.commonMA.meta.MA_META.GP_ALC_CD);
	public static final MCMeta diff_qty_META = createCommonMeta($diff_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_wk_META = createCommonMeta($diff_wk, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_up_META = createCommonMeta($diff_up, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_rt_META = createCommonMeta($diff_rt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_std_META = createCommonMeta($diff_std, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_a_META = createCommonMeta($diff_a, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_b_META = createCommonMeta($diff_b, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_c_META = createCommonMeta($diff_c, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_d_META = createCommonMeta($diff_d, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_e_META = createCommonMeta($diff_e, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mfg_inpt_cost_META = createCommonMeta($mfg_inpt_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_mfg_inpt_cost_META = createCommonMeta($std_mfg_inpt_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_cost_META = createCommonMeta($sls_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_sls_cost_META = createCommonMeta($std_sls_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_mng_cost_META = createCommonMeta($sls_mng_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_sls_mng_cost_META = createCommonMeta($std_sls_mng_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fxd_cost_META = createCommonMeta($fxd_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_cost_META = createCommonMeta($var_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dir_cost_META = createCommonMeta($dir_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta indir_cost_META = createCommonMeta($indir_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost_META = createCommonMeta($act_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost1_META = createCommonMeta($act_cost1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost2_META = createCommonMeta($act_cost2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost3_META = createCommonMeta($act_cost3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost4_META = createCommonMeta($act_cost4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost5_META = createCommonMeta($act_cost5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost6_META = createCommonMeta($act_cost6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost7_META = createCommonMeta($act_cost7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost8_META = createCommonMeta($act_cost8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost9_META = createCommonMeta($act_cost9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost10_META = createCommonMeta($act_cost10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost11_META = createCommonMeta($act_cost11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost12_META = createCommonMeta($act_cost12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost13_META = createCommonMeta($act_cost13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost14_META = createCommonMeta($act_cost14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost15_META = createCommonMeta($act_cost15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost16_META = createCommonMeta($act_cost16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost17_META = createCommonMeta($act_cost17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost18_META = createCommonMeta($act_cost18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost19_META = createCommonMeta($act_cost19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost20_META = createCommonMeta($act_cost20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost21_META = createCommonMeta($act_cost21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost22_META = createCommonMeta($act_cost22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost23_META = createCommonMeta($act_cost23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost24_META = createCommonMeta($act_cost24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost25_META = createCommonMeta($act_cost25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost26_META = createCommonMeta($act_cost26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost27_META = createCommonMeta($act_cost27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost28_META = createCommonMeta($act_cost28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost29_META = createCommonMeta($act_cost29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost30_META = createCommonMeta($act_cost30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost31_META = createCommonMeta($act_cost31, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost32_META = createCommonMeta($act_cost32, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost33_META = createCommonMeta($act_cost33, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost34_META = createCommonMeta($act_cost34, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost35_META = createCommonMeta($act_cost35, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost36_META = createCommonMeta($act_cost36, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost37_META = createCommonMeta($act_cost37, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost38_META = createCommonMeta($act_cost38, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost39_META = createCommonMeta($act_cost39, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost40_META = createCommonMeta($act_cost40, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost41_META = createCommonMeta($act_cost41, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost42_META = createCommonMeta($act_cost42, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost43_META = createCommonMeta($act_cost43, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost44_META = createCommonMeta($act_cost44, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost45_META = createCommonMeta($act_cost45, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost46_META = createCommonMeta($act_cost46, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost47_META = createCommonMeta($act_cost47, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost48_META = createCommonMeta($act_cost48, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost49_META = createCommonMeta($act_cost49, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost50_META = createCommonMeta($act_cost50, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost51_META = createCommonMeta($act_cost51, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost52_META = createCommonMeta($act_cost52, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost53_META = createCommonMeta($act_cost53, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost54_META = createCommonMeta($act_cost54, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost55_META = createCommonMeta($act_cost55, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost56_META = createCommonMeta($act_cost56, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost57_META = createCommonMeta($act_cost57, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost58_META = createCommonMeta($act_cost58, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost59_META = createCommonMeta($act_cost59, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost60_META = createCommonMeta($act_cost60, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost61_META = createCommonMeta($act_cost61, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost62_META = createCommonMeta($act_cost62, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost63_META = createCommonMeta($act_cost63, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost64_META = createCommonMeta($act_cost64, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost65_META = createCommonMeta($act_cost65, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost66_META = createCommonMeta($act_cost66, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost67_META = createCommonMeta($act_cost67, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost68_META = createCommonMeta($act_cost68, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost69_META = createCommonMeta($act_cost69, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost70_META = createCommonMeta($act_cost70, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost71_META = createCommonMeta($act_cost71, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost72_META = createCommonMeta($act_cost72, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost73_META = createCommonMeta($act_cost73, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost74_META = createCommonMeta($act_cost74, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost75_META = createCommonMeta($act_cost75, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost76_META = createCommonMeta($act_cost76, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost77_META = createCommonMeta($act_cost77, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost78_META = createCommonMeta($act_cost78, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost79_META = createCommonMeta($act_cost79, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost80_META = createCommonMeta($act_cost80, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost81_META = createCommonMeta($act_cost81, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost82_META = createCommonMeta($act_cost82, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost83_META = createCommonMeta($act_cost83, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost84_META = createCommonMeta($act_cost84, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost85_META = createCommonMeta($act_cost85, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost86_META = createCommonMeta($act_cost86, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost87_META = createCommonMeta($act_cost87, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost88_META = createCommonMeta($act_cost88, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost89_META = createCommonMeta($act_cost89, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost90_META = createCommonMeta($act_cost90, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost91_META = createCommonMeta($act_cost91, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost92_META = createCommonMeta($act_cost92, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost93_META = createCommonMeta($act_cost93, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost94_META = createCommonMeta($act_cost94, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost95_META = createCommonMeta($act_cost95, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost96_META = createCommonMeta($act_cost96, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost97_META = createCommonMeta($act_cost97, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost98_META = createCommonMeta($act_cost98, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost99_META = createCommonMeta($act_cost99, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost100_META = createCommonMeta($act_cost100, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost_META = createCommonMeta($std_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost1_META = createCommonMeta($std_cost1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost2_META = createCommonMeta($std_cost2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost3_META = createCommonMeta($std_cost3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost4_META = createCommonMeta($std_cost4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost5_META = createCommonMeta($std_cost5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost6_META = createCommonMeta($std_cost6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost7_META = createCommonMeta($std_cost7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost8_META = createCommonMeta($std_cost8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost9_META = createCommonMeta($std_cost9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost10_META = createCommonMeta($std_cost10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost11_META = createCommonMeta($std_cost11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost12_META = createCommonMeta($std_cost12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost13_META = createCommonMeta($std_cost13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost14_META = createCommonMeta($std_cost14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost15_META = createCommonMeta($std_cost15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost16_META = createCommonMeta($std_cost16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost17_META = createCommonMeta($std_cost17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost18_META = createCommonMeta($std_cost18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost19_META = createCommonMeta($std_cost19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost20_META = createCommonMeta($std_cost20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost21_META = createCommonMeta($std_cost21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost22_META = createCommonMeta($std_cost22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost23_META = createCommonMeta($std_cost23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost24_META = createCommonMeta($std_cost24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost25_META = createCommonMeta($std_cost25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost26_META = createCommonMeta($std_cost26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost27_META = createCommonMeta($std_cost27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost28_META = createCommonMeta($std_cost28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost29_META = createCommonMeta($std_cost29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost30_META = createCommonMeta($std_cost30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost31_META = createCommonMeta($std_cost31, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost32_META = createCommonMeta($std_cost32, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost33_META = createCommonMeta($std_cost33, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost34_META = createCommonMeta($std_cost34, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost35_META = createCommonMeta($std_cost35, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost36_META = createCommonMeta($std_cost36, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost37_META = createCommonMeta($std_cost37, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost38_META = createCommonMeta($std_cost38, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost39_META = createCommonMeta($std_cost39, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost40_META = createCommonMeta($std_cost40, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost41_META = createCommonMeta($std_cost41, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost42_META = createCommonMeta($std_cost42, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost43_META = createCommonMeta($std_cost43, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost44_META = createCommonMeta($std_cost44, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost45_META = createCommonMeta($std_cost45, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost46_META = createCommonMeta($std_cost46, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost47_META = createCommonMeta($std_cost47, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost48_META = createCommonMeta($std_cost48, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost49_META = createCommonMeta($std_cost49, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost50_META = createCommonMeta($std_cost50, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost51_META = createCommonMeta($std_cost51, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost52_META = createCommonMeta($std_cost52, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost53_META = createCommonMeta($std_cost53, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost54_META = createCommonMeta($std_cost54, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost55_META = createCommonMeta($std_cost55, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost56_META = createCommonMeta($std_cost56, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost57_META = createCommonMeta($std_cost57, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost58_META = createCommonMeta($std_cost58, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost59_META = createCommonMeta($std_cost59, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost60_META = createCommonMeta($std_cost60, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost61_META = createCommonMeta($std_cost61, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost62_META = createCommonMeta($std_cost62, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost63_META = createCommonMeta($std_cost63, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost64_META = createCommonMeta($std_cost64, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost65_META = createCommonMeta($std_cost65, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost66_META = createCommonMeta($std_cost66, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost67_META = createCommonMeta($std_cost67, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost68_META = createCommonMeta($std_cost68, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost69_META = createCommonMeta($std_cost69, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost70_META = createCommonMeta($std_cost70, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost71_META = createCommonMeta($std_cost71, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost72_META = createCommonMeta($std_cost72, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost73_META = createCommonMeta($std_cost73, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost74_META = createCommonMeta($std_cost74, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost75_META = createCommonMeta($std_cost75, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost76_META = createCommonMeta($std_cost76, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost77_META = createCommonMeta($std_cost77, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost78_META = createCommonMeta($std_cost78, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost79_META = createCommonMeta($std_cost79, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost80_META = createCommonMeta($std_cost80, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost81_META = createCommonMeta($std_cost81, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost82_META = createCommonMeta($std_cost82, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost83_META = createCommonMeta($std_cost83, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost84_META = createCommonMeta($std_cost84, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost85_META = createCommonMeta($std_cost85, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost86_META = createCommonMeta($std_cost86, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost87_META = createCommonMeta($std_cost87, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost88_META = createCommonMeta($std_cost88, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost89_META = createCommonMeta($std_cost89, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost90_META = createCommonMeta($std_cost90, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost91_META = createCommonMeta($std_cost91, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost92_META = createCommonMeta($std_cost92, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost93_META = createCommonMeta($std_cost93, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost94_META = createCommonMeta($std_cost94, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost95_META = createCommonMeta($std_cost95, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost96_META = createCommonMeta($std_cost96, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost97_META = createCommonMeta($std_cost97, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost98_META = createCommonMeta($std_cost98, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost99_META = createCommonMeta($std_cost99, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost100_META = createCommonMeta($std_cost100, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta log_sub_key1_META = createCommonMeta($log_sub_key1, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY1);
	public static final MCMeta log_sub_key2_META = createCommonMeta($log_sub_key2, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY2);
	public static final MCMeta if_sub_char1_META = createCommonMeta($if_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta if_sub_char2_META = createCommonMeta($if_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta if_sub_char3_META = createCommonMeta($if_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta if_sub_char4_META = createCommonMeta($if_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta if_sub_char5_META = createCommonMeta($if_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta if_sub_char6_META = createCommonMeta($if_sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta if_sub_char7_META = createCommonMeta($if_sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta if_sub_char8_META = createCommonMeta($if_sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta if_sub_char9_META = createCommonMeta($if_sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta if_sub_char10_META = createCommonMeta($if_sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta if_sub_char11_META = createCommonMeta($if_sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta if_sub_char12_META = createCommonMeta($if_sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta if_sub_char13_META = createCommonMeta($if_sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta if_sub_char14_META = createCommonMeta($if_sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta if_sub_char15_META = createCommonMeta($if_sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta if_sub_char16_META = createCommonMeta($if_sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta if_sub_char17_META = createCommonMeta($if_sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta if_sub_char18_META = createCommonMeta($if_sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta if_sub_char19_META = createCommonMeta($if_sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta if_sub_char20_META = createCommonMeta($if_sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta if_sub_char21_META = createCommonMeta($if_sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta if_sub_char22_META = createCommonMeta($if_sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta if_sub_char23_META = createCommonMeta($if_sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta if_sub_char24_META = createCommonMeta($if_sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta if_sub_char25_META = createCommonMeta($if_sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta if_sub_char26_META = createCommonMeta($if_sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta if_sub_char27_META = createCommonMeta($if_sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta if_sub_char28_META = createCommonMeta($if_sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta if_sub_char29_META = createCommonMeta($if_sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta if_sub_char30_META = createCommonMeta($if_sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta if_sub_num1_META = createCommonMeta($if_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta if_sub_num2_META = createCommonMeta($if_sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta if_sub_num3_META = createCommonMeta($if_sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta if_sub_num4_META = createCommonMeta($if_sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta if_sub_num5_META = createCommonMeta($if_sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta if_sub_dt1_META = createCommonMeta($if_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt2_META = createCommonMeta($if_sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt3_META = createCommonMeta($if_sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt4_META = createCommonMeta($if_sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt5_META = createCommonMeta($if_sub_dt5, mcframe.commonMA.meta.MA_META.DT);
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
	public static final String $SDRV_IF1 = "SDRV_IF1";
	public static final String $CO_ALL1 = "CO_ALL1";
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
					MGVT_ACC_SML_COST5_IF_ALL_R own = MGVT_ACC_SML_COST5_IF_ALL_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV_IF1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CO_ALL",
				$CO_ALL1,
				new String[][]{
						{"co_cd", "co_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MGVT_ACC_SML_COST5_IF_ALL_R> constMetas = new ConstMetaList<MGVT_ACC_SML_COST5_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			co_cd_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			bi_not_send_flg_META,
			calc_no_META,
			calc_grp_cd_META,
			fix_flg_META,
			calc_rec_typ_META,
			wg_cd_META,
			term_META,
			ym_META,
			ac_dt_META,
			mng_dpt_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			mfg_purc_typ_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			cost_io_typ_META,
			ac_slip_typ_META,
			ac_rsn_cd_META,
			itm_mfg_inst_no_META,
			mfg_act_no_META,
			loc_cd_META,
			str_ln_cd_META,
			oper_act_no_META,
			oper_cd_META,
			oper_seq_META,
			bp_cd_META,
			cst_cd_META,
			dlv_cd_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			stk_bp_cd_META,
			po_no_META,
			slo_no_META,
			iv_no_META,
			act_id_META,
			act_id_sub_META,
			sls_dpt_cd_META,
			alc_dpt_cd_META,
			other_dpt_cd_META,
			sls_usr_cd_META,
			cost_sls_cd1_META,
			cost_sls_cd2_META,
			cost_sls_cd3_META,
			cost_sls_cd4_META,
			cost_sls_cd5_META,
			asst_typ_META,
			qty_META,
			inst_qty_META,
			base_cur_cd_META,
			amt_META,
			std_qty_META,
			std_amt_META,
			cur_cd_META,
			cur_amt_META,
			cur_std_amt_META,
			xrate_META,
			std_xrate_META,
			upri_diff_META,
			rate_diff_META,
			trd_grp_META,
			act_upri_META,
			std_upri_META,
			so_act_amt_META,
			so_std_amt_META,
			per_META,
			mfg_cost_ratio_META,
			alc_ac_cd_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			gp_alc_cd_META,
			diff_qty_META,
			diff_wk_META,
			diff_up_META,
			diff_rt_META,
			diff_std_META,
			diff_a_META,
			diff_b_META,
			diff_c_META,
			diff_d_META,
			diff_e_META,
			mfg_inpt_cost_META,
			std_mfg_inpt_cost_META,
			sls_cost_META,
			std_sls_cost_META,
			sls_mng_cost_META,
			std_sls_mng_cost_META,
			fxd_cost_META,
			var_cost_META,
			dir_cost_META,
			indir_cost_META,
			act_cost_META,
			act_cost1_META,
			act_cost2_META,
			act_cost3_META,
			act_cost4_META,
			act_cost5_META,
			act_cost6_META,
			act_cost7_META,
			act_cost8_META,
			act_cost9_META,
			act_cost10_META,
			act_cost11_META,
			act_cost12_META,
			act_cost13_META,
			act_cost14_META,
			act_cost15_META,
			act_cost16_META,
			act_cost17_META,
			act_cost18_META,
			act_cost19_META,
			act_cost20_META,
			act_cost21_META,
			act_cost22_META,
			act_cost23_META,
			act_cost24_META,
			act_cost25_META,
			act_cost26_META,
			act_cost27_META,
			act_cost28_META,
			act_cost29_META,
			act_cost30_META,
			act_cost31_META,
			act_cost32_META,
			act_cost33_META,
			act_cost34_META,
			act_cost35_META,
			act_cost36_META,
			act_cost37_META,
			act_cost38_META,
			act_cost39_META,
			act_cost40_META,
			act_cost41_META,
			act_cost42_META,
			act_cost43_META,
			act_cost44_META,
			act_cost45_META,
			act_cost46_META,
			act_cost47_META,
			act_cost48_META,
			act_cost49_META,
			act_cost50_META,
			act_cost51_META,
			act_cost52_META,
			act_cost53_META,
			act_cost54_META,
			act_cost55_META,
			act_cost56_META,
			act_cost57_META,
			act_cost58_META,
			act_cost59_META,
			act_cost60_META,
			act_cost61_META,
			act_cost62_META,
			act_cost63_META,
			act_cost64_META,
			act_cost65_META,
			act_cost66_META,
			act_cost67_META,
			act_cost68_META,
			act_cost69_META,
			act_cost70_META,
			act_cost71_META,
			act_cost72_META,
			act_cost73_META,
			act_cost74_META,
			act_cost75_META,
			act_cost76_META,
			act_cost77_META,
			act_cost78_META,
			act_cost79_META,
			act_cost80_META,
			act_cost81_META,
			act_cost82_META,
			act_cost83_META,
			act_cost84_META,
			act_cost85_META,
			act_cost86_META,
			act_cost87_META,
			act_cost88_META,
			act_cost89_META,
			act_cost90_META,
			act_cost91_META,
			act_cost92_META,
			act_cost93_META,
			act_cost94_META,
			act_cost95_META,
			act_cost96_META,
			act_cost97_META,
			act_cost98_META,
			act_cost99_META,
			act_cost100_META,
			std_cost_META,
			std_cost1_META,
			std_cost2_META,
			std_cost3_META,
			std_cost4_META,
			std_cost5_META,
			std_cost6_META,
			std_cost7_META,
			std_cost8_META,
			std_cost9_META,
			std_cost10_META,
			std_cost11_META,
			std_cost12_META,
			std_cost13_META,
			std_cost14_META,
			std_cost15_META,
			std_cost16_META,
			std_cost17_META,
			std_cost18_META,
			std_cost19_META,
			std_cost20_META,
			std_cost21_META,
			std_cost22_META,
			std_cost23_META,
			std_cost24_META,
			std_cost25_META,
			std_cost26_META,
			std_cost27_META,
			std_cost28_META,
			std_cost29_META,
			std_cost30_META,
			std_cost31_META,
			std_cost32_META,
			std_cost33_META,
			std_cost34_META,
			std_cost35_META,
			std_cost36_META,
			std_cost37_META,
			std_cost38_META,
			std_cost39_META,
			std_cost40_META,
			std_cost41_META,
			std_cost42_META,
			std_cost43_META,
			std_cost44_META,
			std_cost45_META,
			std_cost46_META,
			std_cost47_META,
			std_cost48_META,
			std_cost49_META,
			std_cost50_META,
			std_cost51_META,
			std_cost52_META,
			std_cost53_META,
			std_cost54_META,
			std_cost55_META,
			std_cost56_META,
			std_cost57_META,
			std_cost58_META,
			std_cost59_META,
			std_cost60_META,
			std_cost61_META,
			std_cost62_META,
			std_cost63_META,
			std_cost64_META,
			std_cost65_META,
			std_cost66_META,
			std_cost67_META,
			std_cost68_META,
			std_cost69_META,
			std_cost70_META,
			std_cost71_META,
			std_cost72_META,
			std_cost73_META,
			std_cost74_META,
			std_cost75_META,
			std_cost76_META,
			std_cost77_META,
			std_cost78_META,
			std_cost79_META,
			std_cost80_META,
			std_cost81_META,
			std_cost82_META,
			std_cost83_META,
			std_cost84_META,
			std_cost85_META,
			std_cost86_META,
			std_cost87_META,
			std_cost88_META,
			std_cost89_META,
			std_cost90_META,
			std_cost91_META,
			std_cost92_META,
			std_cost93_META,
			std_cost94_META,
			std_cost95_META,
			std_cost96_META,
			std_cost97_META,
			std_cost98_META,
			std_cost99_META,
			std_cost100_META,
			batch_log_no_META,
			log_sub_key1_META,
			log_sub_key2_META,
			if_sub_char1_META,
			if_sub_char2_META,
			if_sub_char3_META,
			if_sub_char4_META,
			if_sub_char5_META,
			if_sub_char6_META,
			if_sub_char7_META,
			if_sub_char8_META,
			if_sub_char9_META,
			if_sub_char10_META,
			if_sub_char11_META,
			if_sub_char12_META,
			if_sub_char13_META,
			if_sub_char14_META,
			if_sub_char15_META,
			if_sub_char16_META,
			if_sub_char17_META,
			if_sub_char18_META,
			if_sub_char19_META,
			if_sub_char20_META,
			if_sub_char21_META,
			if_sub_char22_META,
			if_sub_char23_META,
			if_sub_char24_META,
			if_sub_char25_META,
			if_sub_char26_META,
			if_sub_char27_META,
			if_sub_char28_META,
			if_sub_char29_META,
			if_sub_char30_META,
			if_sub_num1_META,
			if_sub_num2_META,
			if_sub_num3_META,
			if_sub_num4_META,
			if_sub_num5_META,
			if_sub_dt1_META,
			if_sub_dt2_META,
			if_sub_dt3_META,
			if_sub_dt4_META,
			if_sub_dt5_META,
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
	protected MGVT_ACC_SML_COST5_IF_ALL_R(ConstMetaList<? extends MGVT_ACC_SML_COST5_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVT_ACC_SML_COST5_IF_ALL_R(ConstMetaList<? extends MGVT_ACC_SML_COST5_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$data_lno,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$co_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$data_no,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$exe_sts_typ,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$data_crud_typ,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$ext_sys_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$bi_not_send_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_ACC_SML_COST5_IF_ALL_R.$bi_not_send_flg,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$calc_no,
				"calc_no",
				calc_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$calc_grp_cd,
				"calc_grp_cd",
				calc_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_ACC_SML_COST5_IF_ALL_R.$fix_flg,
				"fix_flg",
				fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$calc_rec_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$calc_rec_typ,
				"calc_rec_typ",
				calc_rec_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$wg_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_ACC_SML_COST5_IF_ALL_R.$term,
				"term",
				term,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_ACC_SML_COST5_IF_ALL_R.$ym,
				"ym",
				ym,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_ACC_SML_COST5_IF_ALL_R.$ac_dt,
				"ac_dt",
				ac_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$mng_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$mng_dpt_cd,
				"mng_dpt_cd",
				mng_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$itm_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$itm_sub1,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$itm_sub2,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$itm_sub3,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$mfg_purc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$mfg_purc_typ,
				"mfg_purc_typ",
				mfg_purc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$lot_no,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$sublot_no,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$sno1,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$sno2,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$sno3,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$sno4,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$cost_io_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$cost_io_typ,
				"cost_io_typ",
				cost_io_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$ac_slip_typ,
				"ac_slip_typ",
				ac_slip_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$ac_rsn_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$itm_mfg_inst_no,
				"itm_mfg_inst_no",
				itm_mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$mfg_act_no,
				"mfg_act_no",
				mfg_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$loc_cd,
				"loc_cd",
				loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$str_ln_cd,
				"str_ln_cd",
				str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$oper_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$oper_act_no,
				"oper_act_no",
				oper_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$oper_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$oper_seq,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$bp_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$cst_cd,
				"cst_cd",
				cst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$dlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$dlv_cd,
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
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$dest_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$dest_cd1,
				"dest_cd1",
				dest_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$dest_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$dest_cd2,
				"dest_cd2",
				dest_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$dest_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$dest_cd3,
				"dest_cd3",
				dest_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$stk_bp_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$po_no,
				"po_no",
				po_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$slo_no,
				"slo_no",
				slo_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$iv_no,
				"iv_no",
				iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_id,
				"act_id",
				act_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_id_sub,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_id_sub,
				"act_id_sub",
				act_id_sub,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$sls_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$sls_dpt_cd,
				"sls_dpt_cd",
				sls_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$alc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$alc_dpt_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$other_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$other_dpt_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$sls_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$sls_usr_cd,
				"sls_usr_cd",
				sls_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$cost_sls_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$cost_sls_cd1,
				"cost_sls_cd1",
				cost_sls_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$cost_sls_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$cost_sls_cd2,
				"cost_sls_cd2",
				cost_sls_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$cost_sls_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$cost_sls_cd3,
				"cost_sls_cd3",
				cost_sls_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$cost_sls_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$cost_sls_cd4,
				"cost_sls_cd4",
				cost_sls_cd4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$cost_sls_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$cost_sls_cd5,
				"cost_sls_cd5",
				cost_sls_cd5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$asst_typ,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$qty,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$inst_qty,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$base_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$base_cur_cd,
				"base_cur_cd",
				base_cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$amt,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_qty,
				"std_qty",
				std_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_amt,
				"std_amt",
				std_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$cur_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$cur_amt,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$cur_std_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$cur_std_amt,
				"cur_std_amt",
				cur_std_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$xrate,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_xrate,
				"std_xrate",
				std_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$upri_diff,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$upri_diff,
				"upri_diff",
				upri_diff,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$rate_diff,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$rate_diff,
				"rate_diff",
				rate_diff,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$trd_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$trd_grp,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_upri,
				"act_upri",
				act_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_upri,
				"std_upri",
				std_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$so_act_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$so_act_amt,
				"so_act_amt",
				so_act_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$so_std_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$so_std_amt,
				"so_std_amt",
				so_std_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$per,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$per,
				"per",
				per,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$mfg_cost_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$mfg_cost_ratio,
				"mfg_cost_ratio",
				mfg_cost_ratio,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$alc_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$alc_ac_cd,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$par_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$par_itm_cd,
				"par_itm_cd",
				par_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$par_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$par_itm_sub1,
				"par_itm_sub1",
				par_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$par_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$par_itm_sub2,
				"par_itm_sub2",
				par_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$par_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$par_itm_sub3,
				"par_itm_sub3",
				par_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$gp_alc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$gp_alc_cd,
				"gp_alc_cd",
				gp_alc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$diff_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$diff_qty,
				"diff_qty",
				diff_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$diff_wk,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$diff_wk,
				"diff_wk",
				diff_wk,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$diff_up,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$diff_up,
				"diff_up",
				diff_up,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$diff_rt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$diff_rt,
				"diff_rt",
				diff_rt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$diff_std,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$diff_std,
				"diff_std",
				diff_std,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$diff_a,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$diff_a,
				"diff_a",
				diff_a,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$diff_b,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$diff_b,
				"diff_b",
				diff_b,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$diff_c,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$diff_c,
				"diff_c",
				diff_c,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$diff_d,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$diff_d,
				"diff_d",
				diff_d,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$diff_e,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$diff_e,
				"diff_e",
				diff_e,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$mfg_inpt_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$mfg_inpt_cost,
				"mfg_inpt_cost",
				mfg_inpt_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_mfg_inpt_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_mfg_inpt_cost,
				"std_mfg_inpt_cost",
				std_mfg_inpt_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$sls_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$sls_cost,
				"sls_cost",
				sls_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_sls_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_sls_cost,
				"std_sls_cost",
				std_sls_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$sls_mng_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$sls_mng_cost,
				"sls_mng_cost",
				sls_mng_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_sls_mng_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_sls_mng_cost,
				"std_sls_mng_cost",
				std_sls_mng_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$fxd_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$fxd_cost,
				"fxd_cost",
				fxd_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$var_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$var_cost,
				"var_cost",
				var_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$dir_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$dir_cost,
				"dir_cost",
				dir_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$indir_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$indir_cost,
				"indir_cost",
				indir_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost,
				"act_cost",
				act_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost1,
				"act_cost1",
				act_cost1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost2,
				"act_cost2",
				act_cost2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost3,
				"act_cost3",
				act_cost3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost4,
				"act_cost4",
				act_cost4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost5,
				"act_cost5",
				act_cost5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost6,
				"act_cost6",
				act_cost6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost7,
				"act_cost7",
				act_cost7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost8,
				"act_cost8",
				act_cost8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost9,
				"act_cost9",
				act_cost9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost10,
				"act_cost10",
				act_cost10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost11,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost11,
				"act_cost11",
				act_cost11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost12,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost12,
				"act_cost12",
				act_cost12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost13,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost13,
				"act_cost13",
				act_cost13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost14,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost14,
				"act_cost14",
				act_cost14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost15,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost15,
				"act_cost15",
				act_cost15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost16,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost16,
				"act_cost16",
				act_cost16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost17,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost17,
				"act_cost17",
				act_cost17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost18,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost18,
				"act_cost18",
				act_cost18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost19,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost19,
				"act_cost19",
				act_cost19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost20,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost20,
				"act_cost20",
				act_cost20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost21,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost21,
				"act_cost21",
				act_cost21,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost22,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost22,
				"act_cost22",
				act_cost22,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost23,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost23,
				"act_cost23",
				act_cost23,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost24,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost24,
				"act_cost24",
				act_cost24,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost25,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost25,
				"act_cost25",
				act_cost25,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost26,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost26,
				"act_cost26",
				act_cost26,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost27,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost27,
				"act_cost27",
				act_cost27,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost28,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost28,
				"act_cost28",
				act_cost28,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost29,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost29,
				"act_cost29",
				act_cost29,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost30,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost30,
				"act_cost30",
				act_cost30,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost31,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost31,
				"act_cost31",
				act_cost31,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost32,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost32,
				"act_cost32",
				act_cost32,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost33,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost33,
				"act_cost33",
				act_cost33,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost34,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost34,
				"act_cost34",
				act_cost34,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost35,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost35,
				"act_cost35",
				act_cost35,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost36,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost36,
				"act_cost36",
				act_cost36,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost37,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost37,
				"act_cost37",
				act_cost37,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost38,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost38,
				"act_cost38",
				act_cost38,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost39,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost39,
				"act_cost39",
				act_cost39,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost40,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost40,
				"act_cost40",
				act_cost40,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost41,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost41,
				"act_cost41",
				act_cost41,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost42,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost42,
				"act_cost42",
				act_cost42,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost43,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost43,
				"act_cost43",
				act_cost43,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost44,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost44,
				"act_cost44",
				act_cost44,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost45,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost45,
				"act_cost45",
				act_cost45,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost46,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost46,
				"act_cost46",
				act_cost46,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost47,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost47,
				"act_cost47",
				act_cost47,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost48,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost48,
				"act_cost48",
				act_cost48,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost49,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost49,
				"act_cost49",
				act_cost49,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost50,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost50,
				"act_cost50",
				act_cost50,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost51,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost51,
				"act_cost51",
				act_cost51,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost52,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost52,
				"act_cost52",
				act_cost52,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost53,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost53,
				"act_cost53",
				act_cost53,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost54,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost54,
				"act_cost54",
				act_cost54,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost55,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost55,
				"act_cost55",
				act_cost55,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost56,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost56,
				"act_cost56",
				act_cost56,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost57,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost57,
				"act_cost57",
				act_cost57,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost58,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost58,
				"act_cost58",
				act_cost58,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost59,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost59,
				"act_cost59",
				act_cost59,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost60,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost60,
				"act_cost60",
				act_cost60,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost61,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost61,
				"act_cost61",
				act_cost61,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost62,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost62,
				"act_cost62",
				act_cost62,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost63,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost63,
				"act_cost63",
				act_cost63,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost64,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost64,
				"act_cost64",
				act_cost64,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost65,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost65,
				"act_cost65",
				act_cost65,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost66,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost66,
				"act_cost66",
				act_cost66,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost67,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost67,
				"act_cost67",
				act_cost67,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost68,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost68,
				"act_cost68",
				act_cost68,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost69,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost69,
				"act_cost69",
				act_cost69,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost70,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost70,
				"act_cost70",
				act_cost70,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost71,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost71,
				"act_cost71",
				act_cost71,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost72,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost72,
				"act_cost72",
				act_cost72,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost73,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost73,
				"act_cost73",
				act_cost73,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost74,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost74,
				"act_cost74",
				act_cost74,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost75,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost75,
				"act_cost75",
				act_cost75,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost76,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost76,
				"act_cost76",
				act_cost76,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost77,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost77,
				"act_cost77",
				act_cost77,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost78,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost78,
				"act_cost78",
				act_cost78,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost79,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost79,
				"act_cost79",
				act_cost79,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost80,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost80,
				"act_cost80",
				act_cost80,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost81,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost81,
				"act_cost81",
				act_cost81,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost82,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost82,
				"act_cost82",
				act_cost82,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost83,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost83,
				"act_cost83",
				act_cost83,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost84,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost84,
				"act_cost84",
				act_cost84,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost85,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost85,
				"act_cost85",
				act_cost85,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost86,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost86,
				"act_cost86",
				act_cost86,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost87,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost87,
				"act_cost87",
				act_cost87,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost88,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost88,
				"act_cost88",
				act_cost88,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost89,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost89,
				"act_cost89",
				act_cost89,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost90,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost90,
				"act_cost90",
				act_cost90,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost91,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost91,
				"act_cost91",
				act_cost91,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost92,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost92,
				"act_cost92",
				act_cost92,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost93,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost93,
				"act_cost93",
				act_cost93,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost94,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost94,
				"act_cost94",
				act_cost94,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost95,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost95,
				"act_cost95",
				act_cost95,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost96,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost96,
				"act_cost96",
				act_cost96,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost97,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost97,
				"act_cost97",
				act_cost97,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost98,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost98,
				"act_cost98",
				act_cost98,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost99,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost99,
				"act_cost99",
				act_cost99,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost100,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$act_cost100,
				"act_cost100",
				act_cost100,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost,
				"std_cost",
				std_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost1,
				"std_cost1",
				std_cost1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost2,
				"std_cost2",
				std_cost2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost3,
				"std_cost3",
				std_cost3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost4,
				"std_cost4",
				std_cost4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost5,
				"std_cost5",
				std_cost5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost6,
				"std_cost6",
				std_cost6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost7,
				"std_cost7",
				std_cost7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost8,
				"std_cost8",
				std_cost8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost9,
				"std_cost9",
				std_cost9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost10,
				"std_cost10",
				std_cost10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost11,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost11,
				"std_cost11",
				std_cost11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost12,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost12,
				"std_cost12",
				std_cost12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost13,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost13,
				"std_cost13",
				std_cost13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost14,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost14,
				"std_cost14",
				std_cost14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost15,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost15,
				"std_cost15",
				std_cost15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost16,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost16,
				"std_cost16",
				std_cost16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost17,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost17,
				"std_cost17",
				std_cost17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost18,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost18,
				"std_cost18",
				std_cost18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost19,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost19,
				"std_cost19",
				std_cost19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost20,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost20,
				"std_cost20",
				std_cost20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost21,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost21,
				"std_cost21",
				std_cost21,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost22,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost22,
				"std_cost22",
				std_cost22,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost23,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost23,
				"std_cost23",
				std_cost23,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost24,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost24,
				"std_cost24",
				std_cost24,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost25,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost25,
				"std_cost25",
				std_cost25,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost26,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost26,
				"std_cost26",
				std_cost26,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost27,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost27,
				"std_cost27",
				std_cost27,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost28,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost28,
				"std_cost28",
				std_cost28,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost29,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost29,
				"std_cost29",
				std_cost29,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost30,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost30,
				"std_cost30",
				std_cost30,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost31,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost31,
				"std_cost31",
				std_cost31,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost32,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost32,
				"std_cost32",
				std_cost32,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost33,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost33,
				"std_cost33",
				std_cost33,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost34,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost34,
				"std_cost34",
				std_cost34,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost35,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost35,
				"std_cost35",
				std_cost35,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost36,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost36,
				"std_cost36",
				std_cost36,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost37,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost37,
				"std_cost37",
				std_cost37,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost38,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost38,
				"std_cost38",
				std_cost38,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost39,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost39,
				"std_cost39",
				std_cost39,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost40,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost40,
				"std_cost40",
				std_cost40,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost41,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost41,
				"std_cost41",
				std_cost41,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost42,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost42,
				"std_cost42",
				std_cost42,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost43,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost43,
				"std_cost43",
				std_cost43,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost44,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost44,
				"std_cost44",
				std_cost44,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost45,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost45,
				"std_cost45",
				std_cost45,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost46,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost46,
				"std_cost46",
				std_cost46,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost47,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost47,
				"std_cost47",
				std_cost47,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost48,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost48,
				"std_cost48",
				std_cost48,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost49,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost49,
				"std_cost49",
				std_cost49,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost50,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost50,
				"std_cost50",
				std_cost50,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost51,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost51,
				"std_cost51",
				std_cost51,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost52,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost52,
				"std_cost52",
				std_cost52,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost53,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost53,
				"std_cost53",
				std_cost53,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost54,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost54,
				"std_cost54",
				std_cost54,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost55,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost55,
				"std_cost55",
				std_cost55,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost56,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost56,
				"std_cost56",
				std_cost56,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost57,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost57,
				"std_cost57",
				std_cost57,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost58,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost58,
				"std_cost58",
				std_cost58,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost59,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost59,
				"std_cost59",
				std_cost59,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost60,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost60,
				"std_cost60",
				std_cost60,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost61,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost61,
				"std_cost61",
				std_cost61,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost62,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost62,
				"std_cost62",
				std_cost62,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost63,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost63,
				"std_cost63",
				std_cost63,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost64,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost64,
				"std_cost64",
				std_cost64,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost65,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost65,
				"std_cost65",
				std_cost65,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost66,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost66,
				"std_cost66",
				std_cost66,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost67,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost67,
				"std_cost67",
				std_cost67,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost68,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost68,
				"std_cost68",
				std_cost68,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost69,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost69,
				"std_cost69",
				std_cost69,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost70,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost70,
				"std_cost70",
				std_cost70,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost71,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost71,
				"std_cost71",
				std_cost71,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost72,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost72,
				"std_cost72",
				std_cost72,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost73,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost73,
				"std_cost73",
				std_cost73,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost74,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost74,
				"std_cost74",
				std_cost74,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost75,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost75,
				"std_cost75",
				std_cost75,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost76,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost76,
				"std_cost76",
				std_cost76,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost77,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost77,
				"std_cost77",
				std_cost77,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost78,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost78,
				"std_cost78",
				std_cost78,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost79,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost79,
				"std_cost79",
				std_cost79,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost80,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost80,
				"std_cost80",
				std_cost80,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost81,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost81,
				"std_cost81",
				std_cost81,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost82,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost82,
				"std_cost82",
				std_cost82,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost83,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost83,
				"std_cost83",
				std_cost83,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost84,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost84,
				"std_cost84",
				std_cost84,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost85,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost85,
				"std_cost85",
				std_cost85,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost86,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost86,
				"std_cost86",
				std_cost86,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost87,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost87,
				"std_cost87",
				std_cost87,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost88,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost88,
				"std_cost88",
				std_cost88,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost89,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost89,
				"std_cost89",
				std_cost89,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost90,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost90,
				"std_cost90",
				std_cost90,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost91,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost91,
				"std_cost91",
				std_cost91,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost92,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost92,
				"std_cost92",
				std_cost92,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost93,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost93,
				"std_cost93",
				std_cost93,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost94,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost94,
				"std_cost94",
				std_cost94,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost95,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost95,
				"std_cost95",
				std_cost95,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost96,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost96,
				"std_cost96",
				std_cost96,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost97,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost97,
				"std_cost97",
				std_cost97,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost98,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost98,
				"std_cost98",
				std_cost98,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost99,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost99,
				"std_cost99",
				std_cost99,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost100,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$std_cost100,
				"std_cost100",
				std_cost100,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$batch_log_no,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$log_sub_key1,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$log_sub_key2,
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
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char1,
				"if_sub_char1",
				if_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char2,
				"if_sub_char2",
				if_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char3,
				"if_sub_char3",
				if_sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char4,
				"if_sub_char4",
				if_sub_char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char5,
				"if_sub_char5",
				if_sub_char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char6,
				"if_sub_char6",
				if_sub_char6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char7,
				"if_sub_char7",
				if_sub_char7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char8,
				"if_sub_char8",
				if_sub_char8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char9,
				"if_sub_char9",
				if_sub_char9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char10,
				"if_sub_char10",
				if_sub_char10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char11,
				"if_sub_char11",
				if_sub_char11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char12,
				"if_sub_char12",
				if_sub_char12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char13,
				"if_sub_char13",
				if_sub_char13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char14,
				"if_sub_char14",
				if_sub_char14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char15,
				"if_sub_char15",
				if_sub_char15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char16,
				"if_sub_char16",
				if_sub_char16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char17,
				"if_sub_char17",
				if_sub_char17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char18,
				"if_sub_char18",
				if_sub_char18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char19,
				"if_sub_char19",
				if_sub_char19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char20,
				"if_sub_char20",
				if_sub_char20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char21,
				"if_sub_char21",
				if_sub_char21,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char22,
				"if_sub_char22",
				if_sub_char22,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char23,
				"if_sub_char23",
				if_sub_char23,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char24,
				"if_sub_char24",
				if_sub_char24,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char25,
				"if_sub_char25",
				if_sub_char25,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char26,
				"if_sub_char26",
				if_sub_char26,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char27,
				"if_sub_char27",
				if_sub_char27,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char28,
				"if_sub_char28",
				if_sub_char28,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char29,
				"if_sub_char29",
				if_sub_char29,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_char30,
				"if_sub_char30",
				if_sub_char30,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_num1,
				"if_sub_num1",
				if_sub_num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_num2,
				"if_sub_num2",
				if_sub_num2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_num3,
				"if_sub_num3",
				if_sub_num3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_num4,
				"if_sub_num4",
				if_sub_num4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_num5,
				"if_sub_num5",
				if_sub_num5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_dt1,
				"if_sub_dt1",
				if_sub_dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_dt2,
				"if_sub_dt2",
				if_sub_dt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_dt3,
				"if_sub_dt3",
				if_sub_dt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_dt4,
				"if_sub_dt4",
				if_sub_dt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_ACC_SML_COST5_IF_ALL_R.$if_sub_dt5,
				"if_sub_dt5",
				if_sub_dt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGVT_ACC_SML_COST5_IF_ALL_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ACC_SML_COST5_IF_ALL_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGVT_ACC_SML_COST5_IF_ALL_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ACC_SML_COST5_IF_ALL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ACC_SML_COST5_IF_ALL_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
				true,
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
	public static MGVT_ACC_SML_COST5_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVT_ACC_SML_COST5_IF_ALL_R create(String alias) {
		MGVT_ACC_SML_COST5_IF_ALL_R row = new MGVT_ACC_SML_COST5_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVT_ACC_SML_COST5_IF_ALL_R createByName(T proto) {
		MGVT_ACC_SML_COST5_IF_ALL_R row = MGVT_ACC_SML_COST5_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_ACC_SML_COST5_IF_ALL_R clone() {
		return (MGVT_ACC_SML_COST5_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_ACC_SML_COST5_IF_ALL_R createInstance() {
		return (MGVT_ACC_SML_COST5_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_ACC_SML_COST5_IF_ALL_R getValues(String... names) {
		return (MGVT_ACC_SML_COST5_IF_ALL_R) super.getValues(names);
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 1, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 1, $co_cd, value);
	}

	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 2, $data_no);
	}

	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 2, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 2, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 2, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 2, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 2, $data_no, value);
	}
	
	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public String exe_sts_typ() {
		return getConstString(offset + 3, $exe_sts_typ);
	}

	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		setConstString(offset + 3, $exe_sts_typ, value);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 4, $data_crud_typ);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 4, $data_crud_typ, value);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 5, $ext_sys_cd);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 5, $ext_sys_cd, value);
	}

	/**
	 * 送信対象外ＦＬＧ. Not to be exported flg..<p>
	 *
	 */
	public boolean bi_not_send_flg() {
		return getConstBoolean(offset + 6, $bi_not_send_flg);
	}

	/**
	 * 送信対象外ＦＬＧ. Not to be exported flg..<p>
	 *
	 */
	public void bi_not_send_flg(boolean value) {
		setConstBoolean(offset + 6, $bi_not_send_flg, value);
	}

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 7, $calc_no);
	}

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 7, $calc_no, value);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 8, $calc_grp_cd);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 8, $calc_grp_cd, value);
	}

	/**
	 * 確定ＦＬＧ. Firm flg..<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 9, $fix_flg);
	}

	/**
	 * 確定ＦＬＧ. Firm flg..<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 9, $fix_flg, value);
	}

	/**
	 * 計算レコード区分. Calculation record type.<p>
	 *
	 */
	public String calc_rec_typ() {
		return getConstString(offset + 10, $calc_rec_typ);
	}

	/**
	 * 計算レコード区分. Calculation record type.<p>
	 *
	 */
	public void calc_rec_typ(String value) {
		setConstString(offset + 10, $calc_rec_typ, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 11, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 11, $wg_cd, value);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 12, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 12, $term, value);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 13, $ym);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 13, $ym, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 14, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 14, $ac_dt, value);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 15, $mng_dpt_cd);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 15, $mng_dpt_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 16, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 16, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 17, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 17, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 18, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 18, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 19, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 19, $itm_sub3, value);
	}

	/**
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public String mfg_purc_typ() {
		return getConstString(offset + 20, $mfg_purc_typ);
	}

	/**
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public void mfg_purc_typ(String value) {
		setConstString(offset + 20, $mfg_purc_typ, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 21, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 21, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 22, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 22, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 23, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 23, $sno1, value);
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
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 25, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 25, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 26, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 26, $sno4, value);
	}

	/**
	 * 原価入出庫区分. Cost GR/GI type.<p>
	 *
	 */
	public String cost_io_typ() {
		return getConstString(offset + 27, $cost_io_typ);
	}

	/**
	 * 原価入出庫区分. Cost GR/GI type.<p>
	 *
	 */
	public void cost_io_typ(String value) {
		setConstString(offset + 27, $cost_io_typ, value);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 28, $ac_slip_typ);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 28, $ac_slip_typ, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 29, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 29, $ac_rsn_cd, value);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 30, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 30, $itm_mfg_inst_no, value);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 31, $mfg_act_no);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 31, $mfg_act_no, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 32, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 32, $loc_cd, value);
	}

	/**
	 * ラインＣＤ. Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 33, $str_ln_cd);
	}

	/**
	 * ラインＣＤ. Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 33, $str_ln_cd, value);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 34, $oper_act_no);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 34, $oper_act_no, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 35, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 35, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 36, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 36, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 36, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 36, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 36, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 36, $oper_seq, value);
	}
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 37, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 37, $bp_cd, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 38, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 38, $cst_cd, value);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 39, $dlv_cd);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 39, $dlv_cd, value);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 40, $dest_cd1);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 40, $dest_cd1, value);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 41, $dest_cd2);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 41, $dest_cd2, value);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 42, $dest_cd3);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 42, $dest_cd3, value);
	}

	/**
	 * 在庫先ＣＤ. Company holding inventory cd..<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 43, $stk_bp_cd);
	}

	/**
	 * 在庫先ＣＤ. Company holding inventory cd..<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 43, $stk_bp_cd, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 44, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 44, $po_no, value);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 45, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 45, $slo_no, value);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 46, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 46, $iv_no, value);
	}

	/**
	 * 実績ＩＤ. Result ID.<p>
	 *
	 */
	public String act_id() {
		return getConstString(offset + 47, $act_id);
	}

	/**
	 * 実績ＩＤ. Result ID.<p>
	 *
	 */
	public void act_id(String value) {
		setConstString(offset + 47, $act_id, value);
	}

	/**
	 * 実績ＩＤ枝番. Result ID branch No..<p>
	 *
	 */
	public String act_id_sub() {
		return getConstString(offset + 48, $act_id_sub);
	}

	/**
	 * 実績ＩＤ枝番. Result ID branch No..<p>
	 *
	 */
	public void act_id_sub(String value) {
		setConstString(offset + 48, $act_id_sub, value);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 49, $sls_dpt_cd);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 49, $sls_dpt_cd, value);
	}

	/**
	 * 配賦部門ＣＤ. Allocation dept. cd..<p>
	 *
	 */
	public String alc_dpt_cd() {
		return getConstString(offset + 50, $alc_dpt_cd);
	}

	/**
	 * 配賦部門ＣＤ. Allocation dept. cd..<p>
	 *
	 */
	public void alc_dpt_cd(String value) {
		setConstString(offset + 50, $alc_dpt_cd, value);
	}

	/**
	 * 相手部門ＣＤ. Counterpart dept. cd..<p>
	 *
	 */
	public String other_dpt_cd() {
		return getConstString(offset + 51, $other_dpt_cd);
	}

	/**
	 * 相手部門ＣＤ. Counterpart dept. cd..<p>
	 *
	 */
	public void other_dpt_cd(String value) {
		setConstString(offset + 51, $other_dpt_cd, value);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 52, $sls_usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 52, $sls_usr_cd, value);
	}

	/**
	 * 売上分類１. Sales classification 1.<p>
	 *
	 */
	public String cost_sls_cd1() {
		return getConstString(offset + 53, $cost_sls_cd1);
	}

	/**
	 * 売上分類１. Sales classification 1.<p>
	 *
	 */
	public void cost_sls_cd1(String value) {
		setConstString(offset + 53, $cost_sls_cd1, value);
	}

	/**
	 * 売上分類２. Sales classification 2.<p>
	 *
	 */
	public String cost_sls_cd2() {
		return getConstString(offset + 54, $cost_sls_cd2);
	}

	/**
	 * 売上分類２. Sales classification 2.<p>
	 *
	 */
	public void cost_sls_cd2(String value) {
		setConstString(offset + 54, $cost_sls_cd2, value);
	}

	/**
	 * 売上分類３. Sales classification 3.<p>
	 *
	 */
	public String cost_sls_cd3() {
		return getConstString(offset + 55, $cost_sls_cd3);
	}

	/**
	 * 売上分類３. Sales classification 3.<p>
	 *
	 */
	public void cost_sls_cd3(String value) {
		setConstString(offset + 55, $cost_sls_cd3, value);
	}

	/**
	 * 売上分類４. Sales classification 4.<p>
	 *
	 */
	public String cost_sls_cd4() {
		return getConstString(offset + 56, $cost_sls_cd4);
	}

	/**
	 * 売上分類４. Sales classification 4.<p>
	 *
	 */
	public void cost_sls_cd4(String value) {
		setConstString(offset + 56, $cost_sls_cd4, value);
	}

	/**
	 * 売上分類５. Sales classification 5.<p>
	 *
	 */
	public String cost_sls_cd5() {
		return getConstString(offset + 57, $cost_sls_cd5);
	}

	/**
	 * 売上分類５. Sales classification 5.<p>
	 *
	 */
	public void cost_sls_cd5(String value) {
		setConstString(offset + 57, $cost_sls_cd5, value);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 58, $asst_typ);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 58, $asst_typ, value);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 59, $qty);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 59, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 59, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 59, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 59, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 59, $qty, value);
	}
	
	/**
	 * 指図数量. Order qty..<p>
	 *
	 */
	public MCNumber inst_qty() {
		return getConstNumber(offset + 60, $inst_qty);
	}

	/**
	 * 指図数量. Order qty..<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		setConstNumber(offset + 60, $inst_qty, value);
	}
	
	/**
	 * 指図数量. Order qty..<p>
	 *
	 */
	public void inst_qty(int value) {
		setConstNumber(offset + 60, $inst_qty, value);
	}
	
	/**
	 * 指図数量. Order qty..<p>
	 *
	 */
	public void inst_qty(long value) {
		setConstNumber(offset + 60, $inst_qty, value);
	}
	
	/**
	 * 指図数量. Order qty..<p>
	 *
	 */
	public void inst_qty(float value) {
		setConstNumber(offset + 60, $inst_qty, value);
	}
	
	/**
	 * 指図数量. Order qty..<p>
	 *
	 */
	public void inst_qty(double value) {
		setConstNumber(offset + 60, $inst_qty, value);
	}
	
	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 61, $base_cur_cd);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 61, $base_cur_cd, value);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 62, $amt);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 62, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 62, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 62, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 62, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 62, $amt, value);
	}
	
	/**
	 * 標準数量. Standard qty..<p>
	 *
	 */
	public MCNumber std_qty() {
		return getConstNumber(offset + 63, $std_qty);
	}

	/**
	 * 標準数量. Standard qty..<p>
	 *
	 */
	public void std_qty(MCNumber value) {
		setConstNumber(offset + 63, $std_qty, value);
	}
	
	/**
	 * 標準数量. Standard qty..<p>
	 *
	 */
	public void std_qty(int value) {
		setConstNumber(offset + 63, $std_qty, value);
	}
	
	/**
	 * 標準数量. Standard qty..<p>
	 *
	 */
	public void std_qty(long value) {
		setConstNumber(offset + 63, $std_qty, value);
	}
	
	/**
	 * 標準数量. Standard qty..<p>
	 *
	 */
	public void std_qty(float value) {
		setConstNumber(offset + 63, $std_qty, value);
	}
	
	/**
	 * 標準数量. Standard qty..<p>
	 *
	 */
	public void std_qty(double value) {
		setConstNumber(offset + 63, $std_qty, value);
	}
	
	/**
	 * 標準金額. Standard amount.<p>
	 *
	 */
	public MCNumber std_amt() {
		return getConstNumber(offset + 64, $std_amt);
	}

	/**
	 * 標準金額. Standard amount.<p>
	 *
	 */
	public void std_amt(MCNumber value) {
		setConstNumber(offset + 64, $std_amt, value);
	}
	
	/**
	 * 標準金額. Standard amount.<p>
	 *
	 */
	public void std_amt(int value) {
		setConstNumber(offset + 64, $std_amt, value);
	}
	
	/**
	 * 標準金額. Standard amount.<p>
	 *
	 */
	public void std_amt(long value) {
		setConstNumber(offset + 64, $std_amt, value);
	}
	
	/**
	 * 標準金額. Standard amount.<p>
	 *
	 */
	public void std_amt(float value) {
		setConstNumber(offset + 64, $std_amt, value);
	}
	
	/**
	 * 標準金額. Standard amount.<p>
	 *
	 */
	public void std_amt(double value) {
		setConstNumber(offset + 64, $std_amt, value);
	}
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 65, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 65, $cur_cd, value);
	}

	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public MCNumber cur_amt() {
		return getConstNumber(offset + 66, $cur_amt);
	}

	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(MCNumber value) {
		setConstNumber(offset + 66, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(int value) {
		setConstNumber(offset + 66, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(long value) {
		setConstNumber(offset + 66, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(float value) {
		setConstNumber(offset + 66, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(double value) {
		setConstNumber(offset + 66, $cur_amt, value);
	}
	
	/**
	 * 通貨標準金額. Currency standard amount.<p>
	 *
	 */
	public MCNumber cur_std_amt() {
		return getConstNumber(offset + 67, $cur_std_amt);
	}

	/**
	 * 通貨標準金額. Currency standard amount.<p>
	 *
	 */
	public void cur_std_amt(MCNumber value) {
		setConstNumber(offset + 67, $cur_std_amt, value);
	}
	
	/**
	 * 通貨標準金額. Currency standard amount.<p>
	 *
	 */
	public void cur_std_amt(int value) {
		setConstNumber(offset + 67, $cur_std_amt, value);
	}
	
	/**
	 * 通貨標準金額. Currency standard amount.<p>
	 *
	 */
	public void cur_std_amt(long value) {
		setConstNumber(offset + 67, $cur_std_amt, value);
	}
	
	/**
	 * 通貨標準金額. Currency standard amount.<p>
	 *
	 */
	public void cur_std_amt(float value) {
		setConstNumber(offset + 67, $cur_std_amt, value);
	}
	
	/**
	 * 通貨標準金額. Currency standard amount.<p>
	 *
	 */
	public void cur_std_amt(double value) {
		setConstNumber(offset + 67, $cur_std_amt, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 68, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 68, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 68, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 68, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 68, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 68, $xrate, value);
	}
	
	/**
	 * 標準為替レート. Standard exchange rate.<p>
	 *
	 */
	public MCNumber std_xrate() {
		return getConstNumber(offset + 69, $std_xrate);
	}

	/**
	 * 標準為替レート. Standard exchange rate.<p>
	 *
	 */
	public void std_xrate(MCNumber value) {
		setConstNumber(offset + 69, $std_xrate, value);
	}
	
	/**
	 * 標準為替レート. Standard exchange rate.<p>
	 *
	 */
	public void std_xrate(int value) {
		setConstNumber(offset + 69, $std_xrate, value);
	}
	
	/**
	 * 標準為替レート. Standard exchange rate.<p>
	 *
	 */
	public void std_xrate(long value) {
		setConstNumber(offset + 69, $std_xrate, value);
	}
	
	/**
	 * 標準為替レート. Standard exchange rate.<p>
	 *
	 */
	public void std_xrate(float value) {
		setConstNumber(offset + 69, $std_xrate, value);
	}
	
	/**
	 * 標準為替レート. Standard exchange rate.<p>
	 *
	 */
	public void std_xrate(double value) {
		setConstNumber(offset + 69, $std_xrate, value);
	}
	
	/**
	 * 単価差異. Unit price variance.<p>
	 *
	 */
	public MCNumber upri_diff() {
		return getConstNumber(offset + 70, $upri_diff);
	}

	/**
	 * 単価差異. Unit price variance.<p>
	 *
	 */
	public void upri_diff(MCNumber value) {
		setConstNumber(offset + 70, $upri_diff, value);
	}
	
	/**
	 * 単価差異. Unit price variance.<p>
	 *
	 */
	public void upri_diff(int value) {
		setConstNumber(offset + 70, $upri_diff, value);
	}
	
	/**
	 * 単価差異. Unit price variance.<p>
	 *
	 */
	public void upri_diff(long value) {
		setConstNumber(offset + 70, $upri_diff, value);
	}
	
	/**
	 * 単価差異. Unit price variance.<p>
	 *
	 */
	public void upri_diff(float value) {
		setConstNumber(offset + 70, $upri_diff, value);
	}
	
	/**
	 * 単価差異. Unit price variance.<p>
	 *
	 */
	public void upri_diff(double value) {
		setConstNumber(offset + 70, $upri_diff, value);
	}
	
	/**
	 * レート差異. Rate variance.<p>
	 *
	 */
	public MCNumber rate_diff() {
		return getConstNumber(offset + 71, $rate_diff);
	}

	/**
	 * レート差異. Rate variance.<p>
	 *
	 */
	public void rate_diff(MCNumber value) {
		setConstNumber(offset + 71, $rate_diff, value);
	}
	
	/**
	 * レート差異. Rate variance.<p>
	 *
	 */
	public void rate_diff(int value) {
		setConstNumber(offset + 71, $rate_diff, value);
	}
	
	/**
	 * レート差異. Rate variance.<p>
	 *
	 */
	public void rate_diff(long value) {
		setConstNumber(offset + 71, $rate_diff, value);
	}
	
	/**
	 * レート差異. Rate variance.<p>
	 *
	 */
	public void rate_diff(float value) {
		setConstNumber(offset + 71, $rate_diff, value);
	}
	
	/**
	 * レート差異. Rate variance.<p>
	 *
	 */
	public void rate_diff(double value) {
		setConstNumber(offset + 71, $rate_diff, value);
	}
	
	/**
	 * 振替グループ. Transfer group.<p>
	 *
	 */
	public String trd_grp() {
		return getConstString(offset + 72, $trd_grp);
	}

	/**
	 * 振替グループ. Transfer group.<p>
	 *
	 */
	public void trd_grp(String value) {
		setConstString(offset + 72, $trd_grp, value);
	}

	/**
	 * 実際単価. Actual unit price.<p>
	 *
	 */
	public MCNumber act_upri() {
		return getConstNumber(offset + 73, $act_upri);
	}

	/**
	 * 実際単価. Actual unit price.<p>
	 *
	 */
	public void act_upri(MCNumber value) {
		setConstNumber(offset + 73, $act_upri, value);
	}
	
	/**
	 * 実際単価. Actual unit price.<p>
	 *
	 */
	public void act_upri(int value) {
		setConstNumber(offset + 73, $act_upri, value);
	}
	
	/**
	 * 実際単価. Actual unit price.<p>
	 *
	 */
	public void act_upri(long value) {
		setConstNumber(offset + 73, $act_upri, value);
	}
	
	/**
	 * 実際単価. Actual unit price.<p>
	 *
	 */
	public void act_upri(float value) {
		setConstNumber(offset + 73, $act_upri, value);
	}
	
	/**
	 * 実際単価. Actual unit price.<p>
	 *
	 */
	public void act_upri(double value) {
		setConstNumber(offset + 73, $act_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 74, $std_upri);
	}

	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 74, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 74, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 74, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 74, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 74, $std_upri, value);
	}
	
	/**
	 * 実際相殺金額. Actual offset amount.<p>
	 *
	 */
	public MCNumber so_act_amt() {
		return getConstNumber(offset + 75, $so_act_amt);
	}

	/**
	 * 実際相殺金額. Actual offset amount.<p>
	 *
	 */
	public void so_act_amt(MCNumber value) {
		setConstNumber(offset + 75, $so_act_amt, value);
	}
	
	/**
	 * 実際相殺金額. Actual offset amount.<p>
	 *
	 */
	public void so_act_amt(int value) {
		setConstNumber(offset + 75, $so_act_amt, value);
	}
	
	/**
	 * 実際相殺金額. Actual offset amount.<p>
	 *
	 */
	public void so_act_amt(long value) {
		setConstNumber(offset + 75, $so_act_amt, value);
	}
	
	/**
	 * 実際相殺金額. Actual offset amount.<p>
	 *
	 */
	public void so_act_amt(float value) {
		setConstNumber(offset + 75, $so_act_amt, value);
	}
	
	/**
	 * 実際相殺金額. Actual offset amount.<p>
	 *
	 */
	public void so_act_amt(double value) {
		setConstNumber(offset + 75, $so_act_amt, value);
	}
	
	/**
	 * 標準相殺金額. Standard offset amount.<p>
	 *
	 */
	public MCNumber so_std_amt() {
		return getConstNumber(offset + 76, $so_std_amt);
	}

	/**
	 * 標準相殺金額. Standard offset amount.<p>
	 *
	 */
	public void so_std_amt(MCNumber value) {
		setConstNumber(offset + 76, $so_std_amt, value);
	}
	
	/**
	 * 標準相殺金額. Standard offset amount.<p>
	 *
	 */
	public void so_std_amt(int value) {
		setConstNumber(offset + 76, $so_std_amt, value);
	}
	
	/**
	 * 標準相殺金額. Standard offset amount.<p>
	 *
	 */
	public void so_std_amt(long value) {
		setConstNumber(offset + 76, $so_std_amt, value);
	}
	
	/**
	 * 標準相殺金額. Standard offset amount.<p>
	 *
	 */
	public void so_std_amt(float value) {
		setConstNumber(offset + 76, $so_std_amt, value);
	}
	
	/**
	 * 標準相殺金額. Standard offset amount.<p>
	 *
	 */
	public void so_std_amt(double value) {
		setConstNumber(offset + 76, $so_std_amt, value);
	}
	
	/**
	 * 進捗度. Progress.<p>
	 *
	 */
	public MCNumber per() {
		return getConstNumber(offset + 77, $per);
	}

	/**
	 * 進捗度. Progress.<p>
	 *
	 */
	public void per(MCNumber value) {
		setConstNumber(offset + 77, $per, value);
	}
	
	/**
	 * 進捗度. Progress.<p>
	 *
	 */
	public void per(int value) {
		setConstNumber(offset + 77, $per, value);
	}
	
	/**
	 * 進捗度. Progress.<p>
	 *
	 */
	public void per(long value) {
		setConstNumber(offset + 77, $per, value);
	}
	
	/**
	 * 進捗度. Progress.<p>
	 *
	 */
	public void per(float value) {
		setConstNumber(offset + 77, $per, value);
	}
	
	/**
	 * 進捗度. Progress.<p>
	 *
	 */
	public void per(double value) {
		setConstNumber(offset + 77, $per, value);
	}
	
	/**
	 * 製造原価比率. Mfg. cost ratio.<p>
	 *
	 */
	public MCNumber mfg_cost_ratio() {
		return getConstNumber(offset + 78, $mfg_cost_ratio);
	}

	/**
	 * 製造原価比率. Mfg. cost ratio.<p>
	 *
	 */
	public void mfg_cost_ratio(MCNumber value) {
		setConstNumber(offset + 78, $mfg_cost_ratio, value);
	}
	
	/**
	 * 製造原価比率. Mfg. cost ratio.<p>
	 *
	 */
	public void mfg_cost_ratio(int value) {
		setConstNumber(offset + 78, $mfg_cost_ratio, value);
	}
	
	/**
	 * 製造原価比率. Mfg. cost ratio.<p>
	 *
	 */
	public void mfg_cost_ratio(long value) {
		setConstNumber(offset + 78, $mfg_cost_ratio, value);
	}
	
	/**
	 * 製造原価比率. Mfg. cost ratio.<p>
	 *
	 */
	public void mfg_cost_ratio(float value) {
		setConstNumber(offset + 78, $mfg_cost_ratio, value);
	}
	
	/**
	 * 製造原価比率. Mfg. cost ratio.<p>
	 *
	 */
	public void mfg_cost_ratio(double value) {
		setConstNumber(offset + 78, $mfg_cost_ratio, value);
	}
	
	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 79, $alc_ac_cd);
	}

	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 79, $alc_ac_cd, value);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 80, $par_itm_cd);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 80, $par_itm_cd, value);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 81, $par_itm_sub1);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 81, $par_itm_sub1, value);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 82, $par_itm_sub2);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 82, $par_itm_sub2, value);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 83, $par_itm_sub3);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 83, $par_itm_sub3, value);
	}

	/**
	 * 汎用配賦分類ＣＤ. General purpose allocation classification cd..<p>
	 *
	 */
	public String gp_alc_cd() {
		return getConstString(offset + 84, $gp_alc_cd);
	}

	/**
	 * 汎用配賦分類ＣＤ. General purpose allocation classification cd..<p>
	 *
	 */
	public void gp_alc_cd(String value) {
		setConstString(offset + 84, $gp_alc_cd, value);
	}

	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public MCNumber diff_qty() {
		return getConstNumber(offset + 85, $diff_qty);
	}

	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public void diff_qty(MCNumber value) {
		setConstNumber(offset + 85, $diff_qty, value);
	}
	
	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public void diff_qty(int value) {
		setConstNumber(offset + 85, $diff_qty, value);
	}
	
	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public void diff_qty(long value) {
		setConstNumber(offset + 85, $diff_qty, value);
	}
	
	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public void diff_qty(float value) {
		setConstNumber(offset + 85, $diff_qty, value);
	}
	
	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public void diff_qty(double value) {
		setConstNumber(offset + 85, $diff_qty, value);
	}
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public MCNumber diff_wk() {
		return getConstNumber(offset + 86, $diff_wk);
	}

	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public void diff_wk(MCNumber value) {
		setConstNumber(offset + 86, $diff_wk, value);
	}
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public void diff_wk(int value) {
		setConstNumber(offset + 86, $diff_wk, value);
	}
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public void diff_wk(long value) {
		setConstNumber(offset + 86, $diff_wk, value);
	}
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public void diff_wk(float value) {
		setConstNumber(offset + 86, $diff_wk, value);
	}
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public void diff_wk(double value) {
		setConstNumber(offset + 86, $diff_wk, value);
	}
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public MCNumber diff_up() {
		return getConstNumber(offset + 87, $diff_up);
	}

	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public void diff_up(MCNumber value) {
		setConstNumber(offset + 87, $diff_up, value);
	}
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public void diff_up(int value) {
		setConstNumber(offset + 87, $diff_up, value);
	}
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public void diff_up(long value) {
		setConstNumber(offset + 87, $diff_up, value);
	}
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public void diff_up(float value) {
		setConstNumber(offset + 87, $diff_up, value);
	}
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public void diff_up(double value) {
		setConstNumber(offset + 87, $diff_up, value);
	}
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public MCNumber diff_rt() {
		return getConstNumber(offset + 88, $diff_rt);
	}

	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public void diff_rt(MCNumber value) {
		setConstNumber(offset + 88, $diff_rt, value);
	}
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public void diff_rt(int value) {
		setConstNumber(offset + 88, $diff_rt, value);
	}
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public void diff_rt(long value) {
		setConstNumber(offset + 88, $diff_rt, value);
	}
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public void diff_rt(float value) {
		setConstNumber(offset + 88, $diff_rt, value);
	}
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public void diff_rt(double value) {
		setConstNumber(offset + 88, $diff_rt, value);
	}
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public MCNumber diff_std() {
		return getConstNumber(offset + 89, $diff_std);
	}

	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public void diff_std(MCNumber value) {
		setConstNumber(offset + 89, $diff_std, value);
	}
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public void diff_std(int value) {
		setConstNumber(offset + 89, $diff_std, value);
	}
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public void diff_std(long value) {
		setConstNumber(offset + 89, $diff_std, value);
	}
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public void diff_std(float value) {
		setConstNumber(offset + 89, $diff_std, value);
	}
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public void diff_std(double value) {
		setConstNumber(offset + 89, $diff_std, value);
	}
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public MCNumber diff_a() {
		return getConstNumber(offset + 90, $diff_a);
	}

	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public void diff_a(MCNumber value) {
		setConstNumber(offset + 90, $diff_a, value);
	}
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public void diff_a(int value) {
		setConstNumber(offset + 90, $diff_a, value);
	}
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public void diff_a(long value) {
		setConstNumber(offset + 90, $diff_a, value);
	}
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public void diff_a(float value) {
		setConstNumber(offset + 90, $diff_a, value);
	}
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public void diff_a(double value) {
		setConstNumber(offset + 90, $diff_a, value);
	}
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public MCNumber diff_b() {
		return getConstNumber(offset + 91, $diff_b);
	}

	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public void diff_b(MCNumber value) {
		setConstNumber(offset + 91, $diff_b, value);
	}
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public void diff_b(int value) {
		setConstNumber(offset + 91, $diff_b, value);
	}
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public void diff_b(long value) {
		setConstNumber(offset + 91, $diff_b, value);
	}
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public void diff_b(float value) {
		setConstNumber(offset + 91, $diff_b, value);
	}
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public void diff_b(double value) {
		setConstNumber(offset + 91, $diff_b, value);
	}
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public MCNumber diff_c() {
		return getConstNumber(offset + 92, $diff_c);
	}

	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public void diff_c(MCNumber value) {
		setConstNumber(offset + 92, $diff_c, value);
	}
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public void diff_c(int value) {
		setConstNumber(offset + 92, $diff_c, value);
	}
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public void diff_c(long value) {
		setConstNumber(offset + 92, $diff_c, value);
	}
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public void diff_c(float value) {
		setConstNumber(offset + 92, $diff_c, value);
	}
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public void diff_c(double value) {
		setConstNumber(offset + 92, $diff_c, value);
	}
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public MCNumber diff_d() {
		return getConstNumber(offset + 93, $diff_d);
	}

	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public void diff_d(MCNumber value) {
		setConstNumber(offset + 93, $diff_d, value);
	}
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public void diff_d(int value) {
		setConstNumber(offset + 93, $diff_d, value);
	}
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public void diff_d(long value) {
		setConstNumber(offset + 93, $diff_d, value);
	}
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public void diff_d(float value) {
		setConstNumber(offset + 93, $diff_d, value);
	}
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public void diff_d(double value) {
		setConstNumber(offset + 93, $diff_d, value);
	}
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public MCNumber diff_e() {
		return getConstNumber(offset + 94, $diff_e);
	}

	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public void diff_e(MCNumber value) {
		setConstNumber(offset + 94, $diff_e, value);
	}
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public void diff_e(int value) {
		setConstNumber(offset + 94, $diff_e, value);
	}
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public void diff_e(long value) {
		setConstNumber(offset + 94, $diff_e, value);
	}
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public void diff_e(float value) {
		setConstNumber(offset + 94, $diff_e, value);
	}
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public void diff_e(double value) {
		setConstNumber(offset + 94, $diff_e, value);
	}
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public MCNumber mfg_inpt_cost() {
		return getConstNumber(offset + 95, $mfg_inpt_cost);
	}

	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public void mfg_inpt_cost(MCNumber value) {
		setConstNumber(offset + 95, $mfg_inpt_cost, value);
	}
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public void mfg_inpt_cost(int value) {
		setConstNumber(offset + 95, $mfg_inpt_cost, value);
	}
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public void mfg_inpt_cost(long value) {
		setConstNumber(offset + 95, $mfg_inpt_cost, value);
	}
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public void mfg_inpt_cost(float value) {
		setConstNumber(offset + 95, $mfg_inpt_cost, value);
	}
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public void mfg_inpt_cost(double value) {
		setConstNumber(offset + 95, $mfg_inpt_cost, value);
	}
	
	/**
	 * 標準製造品投入原価. Standard mfg. item input cost.<p>
	 *
	 */
	public MCNumber std_mfg_inpt_cost() {
		return getConstNumber(offset + 96, $std_mfg_inpt_cost);
	}

	/**
	 * 標準製造品投入原価. Standard mfg. item input cost.<p>
	 *
	 */
	public void std_mfg_inpt_cost(MCNumber value) {
		setConstNumber(offset + 96, $std_mfg_inpt_cost, value);
	}
	
	/**
	 * 標準製造品投入原価. Standard mfg. item input cost.<p>
	 *
	 */
	public void std_mfg_inpt_cost(int value) {
		setConstNumber(offset + 96, $std_mfg_inpt_cost, value);
	}
	
	/**
	 * 標準製造品投入原価. Standard mfg. item input cost.<p>
	 *
	 */
	public void std_mfg_inpt_cost(long value) {
		setConstNumber(offset + 96, $std_mfg_inpt_cost, value);
	}
	
	/**
	 * 標準製造品投入原価. Standard mfg. item input cost.<p>
	 *
	 */
	public void std_mfg_inpt_cost(float value) {
		setConstNumber(offset + 96, $std_mfg_inpt_cost, value);
	}
	
	/**
	 * 標準製造品投入原価. Standard mfg. item input cost.<p>
	 *
	 */
	public void std_mfg_inpt_cost(double value) {
		setConstNumber(offset + 96, $std_mfg_inpt_cost, value);
	}
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public MCNumber sls_cost() {
		return getConstNumber(offset + 97, $sls_cost);
	}

	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public void sls_cost(MCNumber value) {
		setConstNumber(offset + 97, $sls_cost, value);
	}
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public void sls_cost(int value) {
		setConstNumber(offset + 97, $sls_cost, value);
	}
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public void sls_cost(long value) {
		setConstNumber(offset + 97, $sls_cost, value);
	}
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public void sls_cost(float value) {
		setConstNumber(offset + 97, $sls_cost, value);
	}
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public void sls_cost(double value) {
		setConstNumber(offset + 97, $sls_cost, value);
	}
	
	/**
	 * 標準売上原価. Standard cost of goods sold.<p>
	 *
	 */
	public MCNumber std_sls_cost() {
		return getConstNumber(offset + 98, $std_sls_cost);
	}

	/**
	 * 標準売上原価. Standard cost of goods sold.<p>
	 *
	 */
	public void std_sls_cost(MCNumber value) {
		setConstNumber(offset + 98, $std_sls_cost, value);
	}
	
	/**
	 * 標準売上原価. Standard cost of goods sold.<p>
	 *
	 */
	public void std_sls_cost(int value) {
		setConstNumber(offset + 98, $std_sls_cost, value);
	}
	
	/**
	 * 標準売上原価. Standard cost of goods sold.<p>
	 *
	 */
	public void std_sls_cost(long value) {
		setConstNumber(offset + 98, $std_sls_cost, value);
	}
	
	/**
	 * 標準売上原価. Standard cost of goods sold.<p>
	 *
	 */
	public void std_sls_cost(float value) {
		setConstNumber(offset + 98, $std_sls_cost, value);
	}
	
	/**
	 * 標準売上原価. Standard cost of goods sold.<p>
	 *
	 */
	public void std_sls_cost(double value) {
		setConstNumber(offset + 98, $std_sls_cost, value);
	}
	
	/**
	 * 販管費. SGA.<p>
	 *
	 */
	public MCNumber sls_mng_cost() {
		return getConstNumber(offset + 99, $sls_mng_cost);
	}

	/**
	 * 販管費. SGA.<p>
	 *
	 */
	public void sls_mng_cost(MCNumber value) {
		setConstNumber(offset + 99, $sls_mng_cost, value);
	}
	
	/**
	 * 販管費. SGA.<p>
	 *
	 */
	public void sls_mng_cost(int value) {
		setConstNumber(offset + 99, $sls_mng_cost, value);
	}
	
	/**
	 * 販管費. SGA.<p>
	 *
	 */
	public void sls_mng_cost(long value) {
		setConstNumber(offset + 99, $sls_mng_cost, value);
	}
	
	/**
	 * 販管費. SGA.<p>
	 *
	 */
	public void sls_mng_cost(float value) {
		setConstNumber(offset + 99, $sls_mng_cost, value);
	}
	
	/**
	 * 販管費. SGA.<p>
	 *
	 */
	public void sls_mng_cost(double value) {
		setConstNumber(offset + 99, $sls_mng_cost, value);
	}
	
	/**
	 * 標準販管費. Standard SGA.<p>
	 *
	 */
	public MCNumber std_sls_mng_cost() {
		return getConstNumber(offset + 100, $std_sls_mng_cost);
	}

	/**
	 * 標準販管費. Standard SGA.<p>
	 *
	 */
	public void std_sls_mng_cost(MCNumber value) {
		setConstNumber(offset + 100, $std_sls_mng_cost, value);
	}
	
	/**
	 * 標準販管費. Standard SGA.<p>
	 *
	 */
	public void std_sls_mng_cost(int value) {
		setConstNumber(offset + 100, $std_sls_mng_cost, value);
	}
	
	/**
	 * 標準販管費. Standard SGA.<p>
	 *
	 */
	public void std_sls_mng_cost(long value) {
		setConstNumber(offset + 100, $std_sls_mng_cost, value);
	}
	
	/**
	 * 標準販管費. Standard SGA.<p>
	 *
	 */
	public void std_sls_mng_cost(float value) {
		setConstNumber(offset + 100, $std_sls_mng_cost, value);
	}
	
	/**
	 * 標準販管費. Standard SGA.<p>
	 *
	 */
	public void std_sls_mng_cost(double value) {
		setConstNumber(offset + 100, $std_sls_mng_cost, value);
	}
	
	/**
	 * 固定費. Fixed cost.<p>
	 *
	 */
	public MCNumber fxd_cost() {
		return getConstNumber(offset + 101, $fxd_cost);
	}

	/**
	 * 固定費. Fixed cost.<p>
	 *
	 */
	public void fxd_cost(MCNumber value) {
		setConstNumber(offset + 101, $fxd_cost, value);
	}
	
	/**
	 * 固定費. Fixed cost.<p>
	 *
	 */
	public void fxd_cost(int value) {
		setConstNumber(offset + 101, $fxd_cost, value);
	}
	
	/**
	 * 固定費. Fixed cost.<p>
	 *
	 */
	public void fxd_cost(long value) {
		setConstNumber(offset + 101, $fxd_cost, value);
	}
	
	/**
	 * 固定費. Fixed cost.<p>
	 *
	 */
	public void fxd_cost(float value) {
		setConstNumber(offset + 101, $fxd_cost, value);
	}
	
	/**
	 * 固定費. Fixed cost.<p>
	 *
	 */
	public void fxd_cost(double value) {
		setConstNumber(offset + 101, $fxd_cost, value);
	}
	
	/**
	 * 変動費. Variable cost.<p>
	 *
	 */
	public MCNumber var_cost() {
		return getConstNumber(offset + 102, $var_cost);
	}

	/**
	 * 変動費. Variable cost.<p>
	 *
	 */
	public void var_cost(MCNumber value) {
		setConstNumber(offset + 102, $var_cost, value);
	}
	
	/**
	 * 変動費. Variable cost.<p>
	 *
	 */
	public void var_cost(int value) {
		setConstNumber(offset + 102, $var_cost, value);
	}
	
	/**
	 * 変動費. Variable cost.<p>
	 *
	 */
	public void var_cost(long value) {
		setConstNumber(offset + 102, $var_cost, value);
	}
	
	/**
	 * 変動費. Variable cost.<p>
	 *
	 */
	public void var_cost(float value) {
		setConstNumber(offset + 102, $var_cost, value);
	}
	
	/**
	 * 変動費. Variable cost.<p>
	 *
	 */
	public void var_cost(double value) {
		setConstNumber(offset + 102, $var_cost, value);
	}
	
	/**
	 * 直接費. Direct cost.<p>
	 *
	 */
	public MCNumber dir_cost() {
		return getConstNumber(offset + 103, $dir_cost);
	}

	/**
	 * 直接費. Direct cost.<p>
	 *
	 */
	public void dir_cost(MCNumber value) {
		setConstNumber(offset + 103, $dir_cost, value);
	}
	
	/**
	 * 直接費. Direct cost.<p>
	 *
	 */
	public void dir_cost(int value) {
		setConstNumber(offset + 103, $dir_cost, value);
	}
	
	/**
	 * 直接費. Direct cost.<p>
	 *
	 */
	public void dir_cost(long value) {
		setConstNumber(offset + 103, $dir_cost, value);
	}
	
	/**
	 * 直接費. Direct cost.<p>
	 *
	 */
	public void dir_cost(float value) {
		setConstNumber(offset + 103, $dir_cost, value);
	}
	
	/**
	 * 直接費. Direct cost.<p>
	 *
	 */
	public void dir_cost(double value) {
		setConstNumber(offset + 103, $dir_cost, value);
	}
	
	/**
	 * 間接費. Indirect cost.<p>
	 *
	 */
	public MCNumber indir_cost() {
		return getConstNumber(offset + 104, $indir_cost);
	}

	/**
	 * 間接費. Indirect cost.<p>
	 *
	 */
	public void indir_cost(MCNumber value) {
		setConstNumber(offset + 104, $indir_cost, value);
	}
	
	/**
	 * 間接費. Indirect cost.<p>
	 *
	 */
	public void indir_cost(int value) {
		setConstNumber(offset + 104, $indir_cost, value);
	}
	
	/**
	 * 間接費. Indirect cost.<p>
	 *
	 */
	public void indir_cost(long value) {
		setConstNumber(offset + 104, $indir_cost, value);
	}
	
	/**
	 * 間接費. Indirect cost.<p>
	 *
	 */
	public void indir_cost(float value) {
		setConstNumber(offset + 104, $indir_cost, value);
	}
	
	/**
	 * 間接費. Indirect cost.<p>
	 *
	 */
	public void indir_cost(double value) {
		setConstNumber(offset + 104, $indir_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public MCNumber act_cost() {
		return getConstNumber(offset + 105, $act_cost);
	}

	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(MCNumber value) {
		setConstNumber(offset + 105, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(int value) {
		setConstNumber(offset + 105, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(long value) {
		setConstNumber(offset + 105, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(float value) {
		setConstNumber(offset + 105, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(double value) {
		setConstNumber(offset + 105, $act_cost, value);
	}
	
	/**
	 * 実際原価１. Actual cost 1.<p>
	 *
	 */
	public MCNumber act_cost1() {
		return getConstNumber(offset + 106, $act_cost1);
	}

	/**
	 * 実際原価１. Actual cost 1.<p>
	 *
	 */
	public void act_cost1(MCNumber value) {
		setConstNumber(offset + 106, $act_cost1, value);
	}
	
	/**
	 * 実際原価１. Actual cost 1.<p>
	 *
	 */
	public void act_cost1(int value) {
		setConstNumber(offset + 106, $act_cost1, value);
	}
	
	/**
	 * 実際原価１. Actual cost 1.<p>
	 *
	 */
	public void act_cost1(long value) {
		setConstNumber(offset + 106, $act_cost1, value);
	}
	
	/**
	 * 実際原価１. Actual cost 1.<p>
	 *
	 */
	public void act_cost1(float value) {
		setConstNumber(offset + 106, $act_cost1, value);
	}
	
	/**
	 * 実際原価１. Actual cost 1.<p>
	 *
	 */
	public void act_cost1(double value) {
		setConstNumber(offset + 106, $act_cost1, value);
	}
	
	/**
	 * 実際原価２. Actual cost 2.<p>
	 *
	 */
	public MCNumber act_cost2() {
		return getConstNumber(offset + 107, $act_cost2);
	}

	/**
	 * 実際原価２. Actual cost 2.<p>
	 *
	 */
	public void act_cost2(MCNumber value) {
		setConstNumber(offset + 107, $act_cost2, value);
	}
	
	/**
	 * 実際原価２. Actual cost 2.<p>
	 *
	 */
	public void act_cost2(int value) {
		setConstNumber(offset + 107, $act_cost2, value);
	}
	
	/**
	 * 実際原価２. Actual cost 2.<p>
	 *
	 */
	public void act_cost2(long value) {
		setConstNumber(offset + 107, $act_cost2, value);
	}
	
	/**
	 * 実際原価２. Actual cost 2.<p>
	 *
	 */
	public void act_cost2(float value) {
		setConstNumber(offset + 107, $act_cost2, value);
	}
	
	/**
	 * 実際原価２. Actual cost 2.<p>
	 *
	 */
	public void act_cost2(double value) {
		setConstNumber(offset + 107, $act_cost2, value);
	}
	
	/**
	 * 実際原価３. Actual cost 3.<p>
	 *
	 */
	public MCNumber act_cost3() {
		return getConstNumber(offset + 108, $act_cost3);
	}

	/**
	 * 実際原価３. Actual cost 3.<p>
	 *
	 */
	public void act_cost3(MCNumber value) {
		setConstNumber(offset + 108, $act_cost3, value);
	}
	
	/**
	 * 実際原価３. Actual cost 3.<p>
	 *
	 */
	public void act_cost3(int value) {
		setConstNumber(offset + 108, $act_cost3, value);
	}
	
	/**
	 * 実際原価３. Actual cost 3.<p>
	 *
	 */
	public void act_cost3(long value) {
		setConstNumber(offset + 108, $act_cost3, value);
	}
	
	/**
	 * 実際原価３. Actual cost 3.<p>
	 *
	 */
	public void act_cost3(float value) {
		setConstNumber(offset + 108, $act_cost3, value);
	}
	
	/**
	 * 実際原価３. Actual cost 3.<p>
	 *
	 */
	public void act_cost3(double value) {
		setConstNumber(offset + 108, $act_cost3, value);
	}
	
	/**
	 * 実際原価４. Actual cost 4.<p>
	 *
	 */
	public MCNumber act_cost4() {
		return getConstNumber(offset + 109, $act_cost4);
	}

	/**
	 * 実際原価４. Actual cost 4.<p>
	 *
	 */
	public void act_cost4(MCNumber value) {
		setConstNumber(offset + 109, $act_cost4, value);
	}
	
	/**
	 * 実際原価４. Actual cost 4.<p>
	 *
	 */
	public void act_cost4(int value) {
		setConstNumber(offset + 109, $act_cost4, value);
	}
	
	/**
	 * 実際原価４. Actual cost 4.<p>
	 *
	 */
	public void act_cost4(long value) {
		setConstNumber(offset + 109, $act_cost4, value);
	}
	
	/**
	 * 実際原価４. Actual cost 4.<p>
	 *
	 */
	public void act_cost4(float value) {
		setConstNumber(offset + 109, $act_cost4, value);
	}
	
	/**
	 * 実際原価４. Actual cost 4.<p>
	 *
	 */
	public void act_cost4(double value) {
		setConstNumber(offset + 109, $act_cost4, value);
	}
	
	/**
	 * 実際原価５. Actual cost 5.<p>
	 *
	 */
	public MCNumber act_cost5() {
		return getConstNumber(offset + 110, $act_cost5);
	}

	/**
	 * 実際原価５. Actual cost 5.<p>
	 *
	 */
	public void act_cost5(MCNumber value) {
		setConstNumber(offset + 110, $act_cost5, value);
	}
	
	/**
	 * 実際原価５. Actual cost 5.<p>
	 *
	 */
	public void act_cost5(int value) {
		setConstNumber(offset + 110, $act_cost5, value);
	}
	
	/**
	 * 実際原価５. Actual cost 5.<p>
	 *
	 */
	public void act_cost5(long value) {
		setConstNumber(offset + 110, $act_cost5, value);
	}
	
	/**
	 * 実際原価５. Actual cost 5.<p>
	 *
	 */
	public void act_cost5(float value) {
		setConstNumber(offset + 110, $act_cost5, value);
	}
	
	/**
	 * 実際原価５. Actual cost 5.<p>
	 *
	 */
	public void act_cost5(double value) {
		setConstNumber(offset + 110, $act_cost5, value);
	}
	
	/**
	 * 実際原価６. Actual cost 6.<p>
	 *
	 */
	public MCNumber act_cost6() {
		return getConstNumber(offset + 111, $act_cost6);
	}

	/**
	 * 実際原価６. Actual cost 6.<p>
	 *
	 */
	public void act_cost6(MCNumber value) {
		setConstNumber(offset + 111, $act_cost6, value);
	}
	
	/**
	 * 実際原価６. Actual cost 6.<p>
	 *
	 */
	public void act_cost6(int value) {
		setConstNumber(offset + 111, $act_cost6, value);
	}
	
	/**
	 * 実際原価６. Actual cost 6.<p>
	 *
	 */
	public void act_cost6(long value) {
		setConstNumber(offset + 111, $act_cost6, value);
	}
	
	/**
	 * 実際原価６. Actual cost 6.<p>
	 *
	 */
	public void act_cost6(float value) {
		setConstNumber(offset + 111, $act_cost6, value);
	}
	
	/**
	 * 実際原価６. Actual cost 6.<p>
	 *
	 */
	public void act_cost6(double value) {
		setConstNumber(offset + 111, $act_cost6, value);
	}
	
	/**
	 * 実際原価７. Actual cost 7.<p>
	 *
	 */
	public MCNumber act_cost7() {
		return getConstNumber(offset + 112, $act_cost7);
	}

	/**
	 * 実際原価７. Actual cost 7.<p>
	 *
	 */
	public void act_cost7(MCNumber value) {
		setConstNumber(offset + 112, $act_cost7, value);
	}
	
	/**
	 * 実際原価７. Actual cost 7.<p>
	 *
	 */
	public void act_cost7(int value) {
		setConstNumber(offset + 112, $act_cost7, value);
	}
	
	/**
	 * 実際原価７. Actual cost 7.<p>
	 *
	 */
	public void act_cost7(long value) {
		setConstNumber(offset + 112, $act_cost7, value);
	}
	
	/**
	 * 実際原価７. Actual cost 7.<p>
	 *
	 */
	public void act_cost7(float value) {
		setConstNumber(offset + 112, $act_cost7, value);
	}
	
	/**
	 * 実際原価７. Actual cost 7.<p>
	 *
	 */
	public void act_cost7(double value) {
		setConstNumber(offset + 112, $act_cost7, value);
	}
	
	/**
	 * 実際原価８. Actual cost 8.<p>
	 *
	 */
	public MCNumber act_cost8() {
		return getConstNumber(offset + 113, $act_cost8);
	}

	/**
	 * 実際原価８. Actual cost 8.<p>
	 *
	 */
	public void act_cost8(MCNumber value) {
		setConstNumber(offset + 113, $act_cost8, value);
	}
	
	/**
	 * 実際原価８. Actual cost 8.<p>
	 *
	 */
	public void act_cost8(int value) {
		setConstNumber(offset + 113, $act_cost8, value);
	}
	
	/**
	 * 実際原価８. Actual cost 8.<p>
	 *
	 */
	public void act_cost8(long value) {
		setConstNumber(offset + 113, $act_cost8, value);
	}
	
	/**
	 * 実際原価８. Actual cost 8.<p>
	 *
	 */
	public void act_cost8(float value) {
		setConstNumber(offset + 113, $act_cost8, value);
	}
	
	/**
	 * 実際原価８. Actual cost 8.<p>
	 *
	 */
	public void act_cost8(double value) {
		setConstNumber(offset + 113, $act_cost8, value);
	}
	
	/**
	 * 実際原価９. Actual cost 9.<p>
	 *
	 */
	public MCNumber act_cost9() {
		return getConstNumber(offset + 114, $act_cost9);
	}

	/**
	 * 実際原価９. Actual cost 9.<p>
	 *
	 */
	public void act_cost9(MCNumber value) {
		setConstNumber(offset + 114, $act_cost9, value);
	}
	
	/**
	 * 実際原価９. Actual cost 9.<p>
	 *
	 */
	public void act_cost9(int value) {
		setConstNumber(offset + 114, $act_cost9, value);
	}
	
	/**
	 * 実際原価９. Actual cost 9.<p>
	 *
	 */
	public void act_cost9(long value) {
		setConstNumber(offset + 114, $act_cost9, value);
	}
	
	/**
	 * 実際原価９. Actual cost 9.<p>
	 *
	 */
	public void act_cost9(float value) {
		setConstNumber(offset + 114, $act_cost9, value);
	}
	
	/**
	 * 実際原価９. Actual cost 9.<p>
	 *
	 */
	public void act_cost9(double value) {
		setConstNumber(offset + 114, $act_cost9, value);
	}
	
	/**
	 * 実際原価１０. Actual cost 10.<p>
	 *
	 */
	public MCNumber act_cost10() {
		return getConstNumber(offset + 115, $act_cost10);
	}

	/**
	 * 実際原価１０. Actual cost 10.<p>
	 *
	 */
	public void act_cost10(MCNumber value) {
		setConstNumber(offset + 115, $act_cost10, value);
	}
	
	/**
	 * 実際原価１０. Actual cost 10.<p>
	 *
	 */
	public void act_cost10(int value) {
		setConstNumber(offset + 115, $act_cost10, value);
	}
	
	/**
	 * 実際原価１０. Actual cost 10.<p>
	 *
	 */
	public void act_cost10(long value) {
		setConstNumber(offset + 115, $act_cost10, value);
	}
	
	/**
	 * 実際原価１０. Actual cost 10.<p>
	 *
	 */
	public void act_cost10(float value) {
		setConstNumber(offset + 115, $act_cost10, value);
	}
	
	/**
	 * 実際原価１０. Actual cost 10.<p>
	 *
	 */
	public void act_cost10(double value) {
		setConstNumber(offset + 115, $act_cost10, value);
	}
	
	/**
	 * 実際原価１１. Actual cost 11.<p>
	 *
	 */
	public MCNumber act_cost11() {
		return getConstNumber(offset + 116, $act_cost11);
	}

	/**
	 * 実際原価１１. Actual cost 11.<p>
	 *
	 */
	public void act_cost11(MCNumber value) {
		setConstNumber(offset + 116, $act_cost11, value);
	}
	
	/**
	 * 実際原価１１. Actual cost 11.<p>
	 *
	 */
	public void act_cost11(int value) {
		setConstNumber(offset + 116, $act_cost11, value);
	}
	
	/**
	 * 実際原価１１. Actual cost 11.<p>
	 *
	 */
	public void act_cost11(long value) {
		setConstNumber(offset + 116, $act_cost11, value);
	}
	
	/**
	 * 実際原価１１. Actual cost 11.<p>
	 *
	 */
	public void act_cost11(float value) {
		setConstNumber(offset + 116, $act_cost11, value);
	}
	
	/**
	 * 実際原価１１. Actual cost 11.<p>
	 *
	 */
	public void act_cost11(double value) {
		setConstNumber(offset + 116, $act_cost11, value);
	}
	
	/**
	 * 実際原価１２. Actual cost 12.<p>
	 *
	 */
	public MCNumber act_cost12() {
		return getConstNumber(offset + 117, $act_cost12);
	}

	/**
	 * 実際原価１２. Actual cost 12.<p>
	 *
	 */
	public void act_cost12(MCNumber value) {
		setConstNumber(offset + 117, $act_cost12, value);
	}
	
	/**
	 * 実際原価１２. Actual cost 12.<p>
	 *
	 */
	public void act_cost12(int value) {
		setConstNumber(offset + 117, $act_cost12, value);
	}
	
	/**
	 * 実際原価１２. Actual cost 12.<p>
	 *
	 */
	public void act_cost12(long value) {
		setConstNumber(offset + 117, $act_cost12, value);
	}
	
	/**
	 * 実際原価１２. Actual cost 12.<p>
	 *
	 */
	public void act_cost12(float value) {
		setConstNumber(offset + 117, $act_cost12, value);
	}
	
	/**
	 * 実際原価１２. Actual cost 12.<p>
	 *
	 */
	public void act_cost12(double value) {
		setConstNumber(offset + 117, $act_cost12, value);
	}
	
	/**
	 * 実際原価１３. Actual cost 13.<p>
	 *
	 */
	public MCNumber act_cost13() {
		return getConstNumber(offset + 118, $act_cost13);
	}

	/**
	 * 実際原価１３. Actual cost 13.<p>
	 *
	 */
	public void act_cost13(MCNumber value) {
		setConstNumber(offset + 118, $act_cost13, value);
	}
	
	/**
	 * 実際原価１３. Actual cost 13.<p>
	 *
	 */
	public void act_cost13(int value) {
		setConstNumber(offset + 118, $act_cost13, value);
	}
	
	/**
	 * 実際原価１３. Actual cost 13.<p>
	 *
	 */
	public void act_cost13(long value) {
		setConstNumber(offset + 118, $act_cost13, value);
	}
	
	/**
	 * 実際原価１３. Actual cost 13.<p>
	 *
	 */
	public void act_cost13(float value) {
		setConstNumber(offset + 118, $act_cost13, value);
	}
	
	/**
	 * 実際原価１３. Actual cost 13.<p>
	 *
	 */
	public void act_cost13(double value) {
		setConstNumber(offset + 118, $act_cost13, value);
	}
	
	/**
	 * 実際原価１４. Actual cost 14.<p>
	 *
	 */
	public MCNumber act_cost14() {
		return getConstNumber(offset + 119, $act_cost14);
	}

	/**
	 * 実際原価１４. Actual cost 14.<p>
	 *
	 */
	public void act_cost14(MCNumber value) {
		setConstNumber(offset + 119, $act_cost14, value);
	}
	
	/**
	 * 実際原価１４. Actual cost 14.<p>
	 *
	 */
	public void act_cost14(int value) {
		setConstNumber(offset + 119, $act_cost14, value);
	}
	
	/**
	 * 実際原価１４. Actual cost 14.<p>
	 *
	 */
	public void act_cost14(long value) {
		setConstNumber(offset + 119, $act_cost14, value);
	}
	
	/**
	 * 実際原価１４. Actual cost 14.<p>
	 *
	 */
	public void act_cost14(float value) {
		setConstNumber(offset + 119, $act_cost14, value);
	}
	
	/**
	 * 実際原価１４. Actual cost 14.<p>
	 *
	 */
	public void act_cost14(double value) {
		setConstNumber(offset + 119, $act_cost14, value);
	}
	
	/**
	 * 実際原価１５. Actual cost 15.<p>
	 *
	 */
	public MCNumber act_cost15() {
		return getConstNumber(offset + 120, $act_cost15);
	}

	/**
	 * 実際原価１５. Actual cost 15.<p>
	 *
	 */
	public void act_cost15(MCNumber value) {
		setConstNumber(offset + 120, $act_cost15, value);
	}
	
	/**
	 * 実際原価１５. Actual cost 15.<p>
	 *
	 */
	public void act_cost15(int value) {
		setConstNumber(offset + 120, $act_cost15, value);
	}
	
	/**
	 * 実際原価１５. Actual cost 15.<p>
	 *
	 */
	public void act_cost15(long value) {
		setConstNumber(offset + 120, $act_cost15, value);
	}
	
	/**
	 * 実際原価１５. Actual cost 15.<p>
	 *
	 */
	public void act_cost15(float value) {
		setConstNumber(offset + 120, $act_cost15, value);
	}
	
	/**
	 * 実際原価１５. Actual cost 15.<p>
	 *
	 */
	public void act_cost15(double value) {
		setConstNumber(offset + 120, $act_cost15, value);
	}
	
	/**
	 * 実際原価１６. Actual cost 16.<p>
	 *
	 */
	public MCNumber act_cost16() {
		return getConstNumber(offset + 121, $act_cost16);
	}

	/**
	 * 実際原価１６. Actual cost 16.<p>
	 *
	 */
	public void act_cost16(MCNumber value) {
		setConstNumber(offset + 121, $act_cost16, value);
	}
	
	/**
	 * 実際原価１６. Actual cost 16.<p>
	 *
	 */
	public void act_cost16(int value) {
		setConstNumber(offset + 121, $act_cost16, value);
	}
	
	/**
	 * 実際原価１６. Actual cost 16.<p>
	 *
	 */
	public void act_cost16(long value) {
		setConstNumber(offset + 121, $act_cost16, value);
	}
	
	/**
	 * 実際原価１６. Actual cost 16.<p>
	 *
	 */
	public void act_cost16(float value) {
		setConstNumber(offset + 121, $act_cost16, value);
	}
	
	/**
	 * 実際原価１６. Actual cost 16.<p>
	 *
	 */
	public void act_cost16(double value) {
		setConstNumber(offset + 121, $act_cost16, value);
	}
	
	/**
	 * 実際原価１７. Actual cost 17.<p>
	 *
	 */
	public MCNumber act_cost17() {
		return getConstNumber(offset + 122, $act_cost17);
	}

	/**
	 * 実際原価１７. Actual cost 17.<p>
	 *
	 */
	public void act_cost17(MCNumber value) {
		setConstNumber(offset + 122, $act_cost17, value);
	}
	
	/**
	 * 実際原価１７. Actual cost 17.<p>
	 *
	 */
	public void act_cost17(int value) {
		setConstNumber(offset + 122, $act_cost17, value);
	}
	
	/**
	 * 実際原価１７. Actual cost 17.<p>
	 *
	 */
	public void act_cost17(long value) {
		setConstNumber(offset + 122, $act_cost17, value);
	}
	
	/**
	 * 実際原価１７. Actual cost 17.<p>
	 *
	 */
	public void act_cost17(float value) {
		setConstNumber(offset + 122, $act_cost17, value);
	}
	
	/**
	 * 実際原価１７. Actual cost 17.<p>
	 *
	 */
	public void act_cost17(double value) {
		setConstNumber(offset + 122, $act_cost17, value);
	}
	
	/**
	 * 実際原価１８. Actual cost 18.<p>
	 *
	 */
	public MCNumber act_cost18() {
		return getConstNumber(offset + 123, $act_cost18);
	}

	/**
	 * 実際原価１８. Actual cost 18.<p>
	 *
	 */
	public void act_cost18(MCNumber value) {
		setConstNumber(offset + 123, $act_cost18, value);
	}
	
	/**
	 * 実際原価１８. Actual cost 18.<p>
	 *
	 */
	public void act_cost18(int value) {
		setConstNumber(offset + 123, $act_cost18, value);
	}
	
	/**
	 * 実際原価１８. Actual cost 18.<p>
	 *
	 */
	public void act_cost18(long value) {
		setConstNumber(offset + 123, $act_cost18, value);
	}
	
	/**
	 * 実際原価１８. Actual cost 18.<p>
	 *
	 */
	public void act_cost18(float value) {
		setConstNumber(offset + 123, $act_cost18, value);
	}
	
	/**
	 * 実際原価１８. Actual cost 18.<p>
	 *
	 */
	public void act_cost18(double value) {
		setConstNumber(offset + 123, $act_cost18, value);
	}
	
	/**
	 * 実際原価１９. Actual cost 19.<p>
	 *
	 */
	public MCNumber act_cost19() {
		return getConstNumber(offset + 124, $act_cost19);
	}

	/**
	 * 実際原価１９. Actual cost 19.<p>
	 *
	 */
	public void act_cost19(MCNumber value) {
		setConstNumber(offset + 124, $act_cost19, value);
	}
	
	/**
	 * 実際原価１９. Actual cost 19.<p>
	 *
	 */
	public void act_cost19(int value) {
		setConstNumber(offset + 124, $act_cost19, value);
	}
	
	/**
	 * 実際原価１９. Actual cost 19.<p>
	 *
	 */
	public void act_cost19(long value) {
		setConstNumber(offset + 124, $act_cost19, value);
	}
	
	/**
	 * 実際原価１９. Actual cost 19.<p>
	 *
	 */
	public void act_cost19(float value) {
		setConstNumber(offset + 124, $act_cost19, value);
	}
	
	/**
	 * 実際原価１９. Actual cost 19.<p>
	 *
	 */
	public void act_cost19(double value) {
		setConstNumber(offset + 124, $act_cost19, value);
	}
	
	/**
	 * 実際原価２０. Actual cost 20.<p>
	 *
	 */
	public MCNumber act_cost20() {
		return getConstNumber(offset + 125, $act_cost20);
	}

	/**
	 * 実際原価２０. Actual cost 20.<p>
	 *
	 */
	public void act_cost20(MCNumber value) {
		setConstNumber(offset + 125, $act_cost20, value);
	}
	
	/**
	 * 実際原価２０. Actual cost 20.<p>
	 *
	 */
	public void act_cost20(int value) {
		setConstNumber(offset + 125, $act_cost20, value);
	}
	
	/**
	 * 実際原価２０. Actual cost 20.<p>
	 *
	 */
	public void act_cost20(long value) {
		setConstNumber(offset + 125, $act_cost20, value);
	}
	
	/**
	 * 実際原価２０. Actual cost 20.<p>
	 *
	 */
	public void act_cost20(float value) {
		setConstNumber(offset + 125, $act_cost20, value);
	}
	
	/**
	 * 実際原価２０. Actual cost 20.<p>
	 *
	 */
	public void act_cost20(double value) {
		setConstNumber(offset + 125, $act_cost20, value);
	}
	
	/**
	 * 実際原価２１. Actual cost 21.<p>
	 *
	 */
	public MCNumber act_cost21() {
		return getConstNumber(offset + 126, $act_cost21);
	}

	/**
	 * 実際原価２１. Actual cost 21.<p>
	 *
	 */
	public void act_cost21(MCNumber value) {
		setConstNumber(offset + 126, $act_cost21, value);
	}
	
	/**
	 * 実際原価２１. Actual cost 21.<p>
	 *
	 */
	public void act_cost21(int value) {
		setConstNumber(offset + 126, $act_cost21, value);
	}
	
	/**
	 * 実際原価２１. Actual cost 21.<p>
	 *
	 */
	public void act_cost21(long value) {
		setConstNumber(offset + 126, $act_cost21, value);
	}
	
	/**
	 * 実際原価２１. Actual cost 21.<p>
	 *
	 */
	public void act_cost21(float value) {
		setConstNumber(offset + 126, $act_cost21, value);
	}
	
	/**
	 * 実際原価２１. Actual cost 21.<p>
	 *
	 */
	public void act_cost21(double value) {
		setConstNumber(offset + 126, $act_cost21, value);
	}
	
	/**
	 * 実際原価２２. Actual cost 22.<p>
	 *
	 */
	public MCNumber act_cost22() {
		return getConstNumber(offset + 127, $act_cost22);
	}

	/**
	 * 実際原価２２. Actual cost 22.<p>
	 *
	 */
	public void act_cost22(MCNumber value) {
		setConstNumber(offset + 127, $act_cost22, value);
	}
	
	/**
	 * 実際原価２２. Actual cost 22.<p>
	 *
	 */
	public void act_cost22(int value) {
		setConstNumber(offset + 127, $act_cost22, value);
	}
	
	/**
	 * 実際原価２２. Actual cost 22.<p>
	 *
	 */
	public void act_cost22(long value) {
		setConstNumber(offset + 127, $act_cost22, value);
	}
	
	/**
	 * 実際原価２２. Actual cost 22.<p>
	 *
	 */
	public void act_cost22(float value) {
		setConstNumber(offset + 127, $act_cost22, value);
	}
	
	/**
	 * 実際原価２２. Actual cost 22.<p>
	 *
	 */
	public void act_cost22(double value) {
		setConstNumber(offset + 127, $act_cost22, value);
	}
	
	/**
	 * 実際原価２３. Actual cost 23.<p>
	 *
	 */
	public MCNumber act_cost23() {
		return getConstNumber(offset + 128, $act_cost23);
	}

	/**
	 * 実際原価２３. Actual cost 23.<p>
	 *
	 */
	public void act_cost23(MCNumber value) {
		setConstNumber(offset + 128, $act_cost23, value);
	}
	
	/**
	 * 実際原価２３. Actual cost 23.<p>
	 *
	 */
	public void act_cost23(int value) {
		setConstNumber(offset + 128, $act_cost23, value);
	}
	
	/**
	 * 実際原価２３. Actual cost 23.<p>
	 *
	 */
	public void act_cost23(long value) {
		setConstNumber(offset + 128, $act_cost23, value);
	}
	
	/**
	 * 実際原価２３. Actual cost 23.<p>
	 *
	 */
	public void act_cost23(float value) {
		setConstNumber(offset + 128, $act_cost23, value);
	}
	
	/**
	 * 実際原価２３. Actual cost 23.<p>
	 *
	 */
	public void act_cost23(double value) {
		setConstNumber(offset + 128, $act_cost23, value);
	}
	
	/**
	 * 実際原価２４. Actual cost 24.<p>
	 *
	 */
	public MCNumber act_cost24() {
		return getConstNumber(offset + 129, $act_cost24);
	}

	/**
	 * 実際原価２４. Actual cost 24.<p>
	 *
	 */
	public void act_cost24(MCNumber value) {
		setConstNumber(offset + 129, $act_cost24, value);
	}
	
	/**
	 * 実際原価２４. Actual cost 24.<p>
	 *
	 */
	public void act_cost24(int value) {
		setConstNumber(offset + 129, $act_cost24, value);
	}
	
	/**
	 * 実際原価２４. Actual cost 24.<p>
	 *
	 */
	public void act_cost24(long value) {
		setConstNumber(offset + 129, $act_cost24, value);
	}
	
	/**
	 * 実際原価２４. Actual cost 24.<p>
	 *
	 */
	public void act_cost24(float value) {
		setConstNumber(offset + 129, $act_cost24, value);
	}
	
	/**
	 * 実際原価２４. Actual cost 24.<p>
	 *
	 */
	public void act_cost24(double value) {
		setConstNumber(offset + 129, $act_cost24, value);
	}
	
	/**
	 * 実際原価２５. Actual cost 25.<p>
	 *
	 */
	public MCNumber act_cost25() {
		return getConstNumber(offset + 130, $act_cost25);
	}

	/**
	 * 実際原価２５. Actual cost 25.<p>
	 *
	 */
	public void act_cost25(MCNumber value) {
		setConstNumber(offset + 130, $act_cost25, value);
	}
	
	/**
	 * 実際原価２５. Actual cost 25.<p>
	 *
	 */
	public void act_cost25(int value) {
		setConstNumber(offset + 130, $act_cost25, value);
	}
	
	/**
	 * 実際原価２５. Actual cost 25.<p>
	 *
	 */
	public void act_cost25(long value) {
		setConstNumber(offset + 130, $act_cost25, value);
	}
	
	/**
	 * 実際原価２５. Actual cost 25.<p>
	 *
	 */
	public void act_cost25(float value) {
		setConstNumber(offset + 130, $act_cost25, value);
	}
	
	/**
	 * 実際原価２５. Actual cost 25.<p>
	 *
	 */
	public void act_cost25(double value) {
		setConstNumber(offset + 130, $act_cost25, value);
	}
	
	/**
	 * 実際原価２６. Actual cost 26.<p>
	 *
	 */
	public MCNumber act_cost26() {
		return getConstNumber(offset + 131, $act_cost26);
	}

	/**
	 * 実際原価２６. Actual cost 26.<p>
	 *
	 */
	public void act_cost26(MCNumber value) {
		setConstNumber(offset + 131, $act_cost26, value);
	}
	
	/**
	 * 実際原価２６. Actual cost 26.<p>
	 *
	 */
	public void act_cost26(int value) {
		setConstNumber(offset + 131, $act_cost26, value);
	}
	
	/**
	 * 実際原価２６. Actual cost 26.<p>
	 *
	 */
	public void act_cost26(long value) {
		setConstNumber(offset + 131, $act_cost26, value);
	}
	
	/**
	 * 実際原価２６. Actual cost 26.<p>
	 *
	 */
	public void act_cost26(float value) {
		setConstNumber(offset + 131, $act_cost26, value);
	}
	
	/**
	 * 実際原価２６. Actual cost 26.<p>
	 *
	 */
	public void act_cost26(double value) {
		setConstNumber(offset + 131, $act_cost26, value);
	}
	
	/**
	 * 実際原価２７. Actual cost 27.<p>
	 *
	 */
	public MCNumber act_cost27() {
		return getConstNumber(offset + 132, $act_cost27);
	}

	/**
	 * 実際原価２７. Actual cost 27.<p>
	 *
	 */
	public void act_cost27(MCNumber value) {
		setConstNumber(offset + 132, $act_cost27, value);
	}
	
	/**
	 * 実際原価２７. Actual cost 27.<p>
	 *
	 */
	public void act_cost27(int value) {
		setConstNumber(offset + 132, $act_cost27, value);
	}
	
	/**
	 * 実際原価２７. Actual cost 27.<p>
	 *
	 */
	public void act_cost27(long value) {
		setConstNumber(offset + 132, $act_cost27, value);
	}
	
	/**
	 * 実際原価２７. Actual cost 27.<p>
	 *
	 */
	public void act_cost27(float value) {
		setConstNumber(offset + 132, $act_cost27, value);
	}
	
	/**
	 * 実際原価２７. Actual cost 27.<p>
	 *
	 */
	public void act_cost27(double value) {
		setConstNumber(offset + 132, $act_cost27, value);
	}
	
	/**
	 * 実際原価２８. Actual cost 28.<p>
	 *
	 */
	public MCNumber act_cost28() {
		return getConstNumber(offset + 133, $act_cost28);
	}

	/**
	 * 実際原価２８. Actual cost 28.<p>
	 *
	 */
	public void act_cost28(MCNumber value) {
		setConstNumber(offset + 133, $act_cost28, value);
	}
	
	/**
	 * 実際原価２８. Actual cost 28.<p>
	 *
	 */
	public void act_cost28(int value) {
		setConstNumber(offset + 133, $act_cost28, value);
	}
	
	/**
	 * 実際原価２８. Actual cost 28.<p>
	 *
	 */
	public void act_cost28(long value) {
		setConstNumber(offset + 133, $act_cost28, value);
	}
	
	/**
	 * 実際原価２８. Actual cost 28.<p>
	 *
	 */
	public void act_cost28(float value) {
		setConstNumber(offset + 133, $act_cost28, value);
	}
	
	/**
	 * 実際原価２８. Actual cost 28.<p>
	 *
	 */
	public void act_cost28(double value) {
		setConstNumber(offset + 133, $act_cost28, value);
	}
	
	/**
	 * 実際原価２９. Actual cost 29.<p>
	 *
	 */
	public MCNumber act_cost29() {
		return getConstNumber(offset + 134, $act_cost29);
	}

	/**
	 * 実際原価２９. Actual cost 29.<p>
	 *
	 */
	public void act_cost29(MCNumber value) {
		setConstNumber(offset + 134, $act_cost29, value);
	}
	
	/**
	 * 実際原価２９. Actual cost 29.<p>
	 *
	 */
	public void act_cost29(int value) {
		setConstNumber(offset + 134, $act_cost29, value);
	}
	
	/**
	 * 実際原価２９. Actual cost 29.<p>
	 *
	 */
	public void act_cost29(long value) {
		setConstNumber(offset + 134, $act_cost29, value);
	}
	
	/**
	 * 実際原価２９. Actual cost 29.<p>
	 *
	 */
	public void act_cost29(float value) {
		setConstNumber(offset + 134, $act_cost29, value);
	}
	
	/**
	 * 実際原価２９. Actual cost 29.<p>
	 *
	 */
	public void act_cost29(double value) {
		setConstNumber(offset + 134, $act_cost29, value);
	}
	
	/**
	 * 実際原価３０. Actual cost 30.<p>
	 *
	 */
	public MCNumber act_cost30() {
		return getConstNumber(offset + 135, $act_cost30);
	}

	/**
	 * 実際原価３０. Actual cost 30.<p>
	 *
	 */
	public void act_cost30(MCNumber value) {
		setConstNumber(offset + 135, $act_cost30, value);
	}
	
	/**
	 * 実際原価３０. Actual cost 30.<p>
	 *
	 */
	public void act_cost30(int value) {
		setConstNumber(offset + 135, $act_cost30, value);
	}
	
	/**
	 * 実際原価３０. Actual cost 30.<p>
	 *
	 */
	public void act_cost30(long value) {
		setConstNumber(offset + 135, $act_cost30, value);
	}
	
	/**
	 * 実際原価３０. Actual cost 30.<p>
	 *
	 */
	public void act_cost30(float value) {
		setConstNumber(offset + 135, $act_cost30, value);
	}
	
	/**
	 * 実際原価３０. Actual cost 30.<p>
	 *
	 */
	public void act_cost30(double value) {
		setConstNumber(offset + 135, $act_cost30, value);
	}
	
	/**
	 * 実際原価３１. Actual cost 31.<p>
	 *
	 */
	public MCNumber act_cost31() {
		return getConstNumber(offset + 136, $act_cost31);
	}

	/**
	 * 実際原価３１. Actual cost 31.<p>
	 *
	 */
	public void act_cost31(MCNumber value) {
		setConstNumber(offset + 136, $act_cost31, value);
	}
	
	/**
	 * 実際原価３１. Actual cost 31.<p>
	 *
	 */
	public void act_cost31(int value) {
		setConstNumber(offset + 136, $act_cost31, value);
	}
	
	/**
	 * 実際原価３１. Actual cost 31.<p>
	 *
	 */
	public void act_cost31(long value) {
		setConstNumber(offset + 136, $act_cost31, value);
	}
	
	/**
	 * 実際原価３１. Actual cost 31.<p>
	 *
	 */
	public void act_cost31(float value) {
		setConstNumber(offset + 136, $act_cost31, value);
	}
	
	/**
	 * 実際原価３１. Actual cost 31.<p>
	 *
	 */
	public void act_cost31(double value) {
		setConstNumber(offset + 136, $act_cost31, value);
	}
	
	/**
	 * 実際原価３２. Actual cost 32.<p>
	 *
	 */
	public MCNumber act_cost32() {
		return getConstNumber(offset + 137, $act_cost32);
	}

	/**
	 * 実際原価３２. Actual cost 32.<p>
	 *
	 */
	public void act_cost32(MCNumber value) {
		setConstNumber(offset + 137, $act_cost32, value);
	}
	
	/**
	 * 実際原価３２. Actual cost 32.<p>
	 *
	 */
	public void act_cost32(int value) {
		setConstNumber(offset + 137, $act_cost32, value);
	}
	
	/**
	 * 実際原価３２. Actual cost 32.<p>
	 *
	 */
	public void act_cost32(long value) {
		setConstNumber(offset + 137, $act_cost32, value);
	}
	
	/**
	 * 実際原価３２. Actual cost 32.<p>
	 *
	 */
	public void act_cost32(float value) {
		setConstNumber(offset + 137, $act_cost32, value);
	}
	
	/**
	 * 実際原価３２. Actual cost 32.<p>
	 *
	 */
	public void act_cost32(double value) {
		setConstNumber(offset + 137, $act_cost32, value);
	}
	
	/**
	 * 実際原価３３. Actual cost 33.<p>
	 *
	 */
	public MCNumber act_cost33() {
		return getConstNumber(offset + 138, $act_cost33);
	}

	/**
	 * 実際原価３３. Actual cost 33.<p>
	 *
	 */
	public void act_cost33(MCNumber value) {
		setConstNumber(offset + 138, $act_cost33, value);
	}
	
	/**
	 * 実際原価３３. Actual cost 33.<p>
	 *
	 */
	public void act_cost33(int value) {
		setConstNumber(offset + 138, $act_cost33, value);
	}
	
	/**
	 * 実際原価３３. Actual cost 33.<p>
	 *
	 */
	public void act_cost33(long value) {
		setConstNumber(offset + 138, $act_cost33, value);
	}
	
	/**
	 * 実際原価３３. Actual cost 33.<p>
	 *
	 */
	public void act_cost33(float value) {
		setConstNumber(offset + 138, $act_cost33, value);
	}
	
	/**
	 * 実際原価３３. Actual cost 33.<p>
	 *
	 */
	public void act_cost33(double value) {
		setConstNumber(offset + 138, $act_cost33, value);
	}
	
	/**
	 * 実際原価３４. Actual cost 34.<p>
	 *
	 */
	public MCNumber act_cost34() {
		return getConstNumber(offset + 139, $act_cost34);
	}

	/**
	 * 実際原価３４. Actual cost 34.<p>
	 *
	 */
	public void act_cost34(MCNumber value) {
		setConstNumber(offset + 139, $act_cost34, value);
	}
	
	/**
	 * 実際原価３４. Actual cost 34.<p>
	 *
	 */
	public void act_cost34(int value) {
		setConstNumber(offset + 139, $act_cost34, value);
	}
	
	/**
	 * 実際原価３４. Actual cost 34.<p>
	 *
	 */
	public void act_cost34(long value) {
		setConstNumber(offset + 139, $act_cost34, value);
	}
	
	/**
	 * 実際原価３４. Actual cost 34.<p>
	 *
	 */
	public void act_cost34(float value) {
		setConstNumber(offset + 139, $act_cost34, value);
	}
	
	/**
	 * 実際原価３４. Actual cost 34.<p>
	 *
	 */
	public void act_cost34(double value) {
		setConstNumber(offset + 139, $act_cost34, value);
	}
	
	/**
	 * 実際原価３５. Actual cost 35.<p>
	 *
	 */
	public MCNumber act_cost35() {
		return getConstNumber(offset + 140, $act_cost35);
	}

	/**
	 * 実際原価３５. Actual cost 35.<p>
	 *
	 */
	public void act_cost35(MCNumber value) {
		setConstNumber(offset + 140, $act_cost35, value);
	}
	
	/**
	 * 実際原価３５. Actual cost 35.<p>
	 *
	 */
	public void act_cost35(int value) {
		setConstNumber(offset + 140, $act_cost35, value);
	}
	
	/**
	 * 実際原価３５. Actual cost 35.<p>
	 *
	 */
	public void act_cost35(long value) {
		setConstNumber(offset + 140, $act_cost35, value);
	}
	
	/**
	 * 実際原価３５. Actual cost 35.<p>
	 *
	 */
	public void act_cost35(float value) {
		setConstNumber(offset + 140, $act_cost35, value);
	}
	
	/**
	 * 実際原価３５. Actual cost 35.<p>
	 *
	 */
	public void act_cost35(double value) {
		setConstNumber(offset + 140, $act_cost35, value);
	}
	
	/**
	 * 実際原価３６. Actual cost 36.<p>
	 *
	 */
	public MCNumber act_cost36() {
		return getConstNumber(offset + 141, $act_cost36);
	}

	/**
	 * 実際原価３６. Actual cost 36.<p>
	 *
	 */
	public void act_cost36(MCNumber value) {
		setConstNumber(offset + 141, $act_cost36, value);
	}
	
	/**
	 * 実際原価３６. Actual cost 36.<p>
	 *
	 */
	public void act_cost36(int value) {
		setConstNumber(offset + 141, $act_cost36, value);
	}
	
	/**
	 * 実際原価３６. Actual cost 36.<p>
	 *
	 */
	public void act_cost36(long value) {
		setConstNumber(offset + 141, $act_cost36, value);
	}
	
	/**
	 * 実際原価３６. Actual cost 36.<p>
	 *
	 */
	public void act_cost36(float value) {
		setConstNumber(offset + 141, $act_cost36, value);
	}
	
	/**
	 * 実際原価３６. Actual cost 36.<p>
	 *
	 */
	public void act_cost36(double value) {
		setConstNumber(offset + 141, $act_cost36, value);
	}
	
	/**
	 * 実際原価３７. Actual cost 37.<p>
	 *
	 */
	public MCNumber act_cost37() {
		return getConstNumber(offset + 142, $act_cost37);
	}

	/**
	 * 実際原価３７. Actual cost 37.<p>
	 *
	 */
	public void act_cost37(MCNumber value) {
		setConstNumber(offset + 142, $act_cost37, value);
	}
	
	/**
	 * 実際原価３７. Actual cost 37.<p>
	 *
	 */
	public void act_cost37(int value) {
		setConstNumber(offset + 142, $act_cost37, value);
	}
	
	/**
	 * 実際原価３７. Actual cost 37.<p>
	 *
	 */
	public void act_cost37(long value) {
		setConstNumber(offset + 142, $act_cost37, value);
	}
	
	/**
	 * 実際原価３７. Actual cost 37.<p>
	 *
	 */
	public void act_cost37(float value) {
		setConstNumber(offset + 142, $act_cost37, value);
	}
	
	/**
	 * 実際原価３７. Actual cost 37.<p>
	 *
	 */
	public void act_cost37(double value) {
		setConstNumber(offset + 142, $act_cost37, value);
	}
	
	/**
	 * 実際原価３８. Actual cost 38.<p>
	 *
	 */
	public MCNumber act_cost38() {
		return getConstNumber(offset + 143, $act_cost38);
	}

	/**
	 * 実際原価３８. Actual cost 38.<p>
	 *
	 */
	public void act_cost38(MCNumber value) {
		setConstNumber(offset + 143, $act_cost38, value);
	}
	
	/**
	 * 実際原価３８. Actual cost 38.<p>
	 *
	 */
	public void act_cost38(int value) {
		setConstNumber(offset + 143, $act_cost38, value);
	}
	
	/**
	 * 実際原価３８. Actual cost 38.<p>
	 *
	 */
	public void act_cost38(long value) {
		setConstNumber(offset + 143, $act_cost38, value);
	}
	
	/**
	 * 実際原価３８. Actual cost 38.<p>
	 *
	 */
	public void act_cost38(float value) {
		setConstNumber(offset + 143, $act_cost38, value);
	}
	
	/**
	 * 実際原価３８. Actual cost 38.<p>
	 *
	 */
	public void act_cost38(double value) {
		setConstNumber(offset + 143, $act_cost38, value);
	}
	
	/**
	 * 実際原価３９. Actual cost 39.<p>
	 *
	 */
	public MCNumber act_cost39() {
		return getConstNumber(offset + 144, $act_cost39);
	}

	/**
	 * 実際原価３９. Actual cost 39.<p>
	 *
	 */
	public void act_cost39(MCNumber value) {
		setConstNumber(offset + 144, $act_cost39, value);
	}
	
	/**
	 * 実際原価３９. Actual cost 39.<p>
	 *
	 */
	public void act_cost39(int value) {
		setConstNumber(offset + 144, $act_cost39, value);
	}
	
	/**
	 * 実際原価３９. Actual cost 39.<p>
	 *
	 */
	public void act_cost39(long value) {
		setConstNumber(offset + 144, $act_cost39, value);
	}
	
	/**
	 * 実際原価３９. Actual cost 39.<p>
	 *
	 */
	public void act_cost39(float value) {
		setConstNumber(offset + 144, $act_cost39, value);
	}
	
	/**
	 * 実際原価３９. Actual cost 39.<p>
	 *
	 */
	public void act_cost39(double value) {
		setConstNumber(offset + 144, $act_cost39, value);
	}
	
	/**
	 * 実際原価４０. Actual cost 40.<p>
	 *
	 */
	public MCNumber act_cost40() {
		return getConstNumber(offset + 145, $act_cost40);
	}

	/**
	 * 実際原価４０. Actual cost 40.<p>
	 *
	 */
	public void act_cost40(MCNumber value) {
		setConstNumber(offset + 145, $act_cost40, value);
	}
	
	/**
	 * 実際原価４０. Actual cost 40.<p>
	 *
	 */
	public void act_cost40(int value) {
		setConstNumber(offset + 145, $act_cost40, value);
	}
	
	/**
	 * 実際原価４０. Actual cost 40.<p>
	 *
	 */
	public void act_cost40(long value) {
		setConstNumber(offset + 145, $act_cost40, value);
	}
	
	/**
	 * 実際原価４０. Actual cost 40.<p>
	 *
	 */
	public void act_cost40(float value) {
		setConstNumber(offset + 145, $act_cost40, value);
	}
	
	/**
	 * 実際原価４０. Actual cost 40.<p>
	 *
	 */
	public void act_cost40(double value) {
		setConstNumber(offset + 145, $act_cost40, value);
	}
	
	/**
	 * 実際原価４１. Actual cost 41.<p>
	 *
	 */
	public MCNumber act_cost41() {
		return getConstNumber(offset + 146, $act_cost41);
	}

	/**
	 * 実際原価４１. Actual cost 41.<p>
	 *
	 */
	public void act_cost41(MCNumber value) {
		setConstNumber(offset + 146, $act_cost41, value);
	}
	
	/**
	 * 実際原価４１. Actual cost 41.<p>
	 *
	 */
	public void act_cost41(int value) {
		setConstNumber(offset + 146, $act_cost41, value);
	}
	
	/**
	 * 実際原価４１. Actual cost 41.<p>
	 *
	 */
	public void act_cost41(long value) {
		setConstNumber(offset + 146, $act_cost41, value);
	}
	
	/**
	 * 実際原価４１. Actual cost 41.<p>
	 *
	 */
	public void act_cost41(float value) {
		setConstNumber(offset + 146, $act_cost41, value);
	}
	
	/**
	 * 実際原価４１. Actual cost 41.<p>
	 *
	 */
	public void act_cost41(double value) {
		setConstNumber(offset + 146, $act_cost41, value);
	}
	
	/**
	 * 実際原価４２. Actual cost 42.<p>
	 *
	 */
	public MCNumber act_cost42() {
		return getConstNumber(offset + 147, $act_cost42);
	}

	/**
	 * 実際原価４２. Actual cost 42.<p>
	 *
	 */
	public void act_cost42(MCNumber value) {
		setConstNumber(offset + 147, $act_cost42, value);
	}
	
	/**
	 * 実際原価４２. Actual cost 42.<p>
	 *
	 */
	public void act_cost42(int value) {
		setConstNumber(offset + 147, $act_cost42, value);
	}
	
	/**
	 * 実際原価４２. Actual cost 42.<p>
	 *
	 */
	public void act_cost42(long value) {
		setConstNumber(offset + 147, $act_cost42, value);
	}
	
	/**
	 * 実際原価４２. Actual cost 42.<p>
	 *
	 */
	public void act_cost42(float value) {
		setConstNumber(offset + 147, $act_cost42, value);
	}
	
	/**
	 * 実際原価４２. Actual cost 42.<p>
	 *
	 */
	public void act_cost42(double value) {
		setConstNumber(offset + 147, $act_cost42, value);
	}
	
	/**
	 * 実際原価４３. Actual cost 43.<p>
	 *
	 */
	public MCNumber act_cost43() {
		return getConstNumber(offset + 148, $act_cost43);
	}

	/**
	 * 実際原価４３. Actual cost 43.<p>
	 *
	 */
	public void act_cost43(MCNumber value) {
		setConstNumber(offset + 148, $act_cost43, value);
	}
	
	/**
	 * 実際原価４３. Actual cost 43.<p>
	 *
	 */
	public void act_cost43(int value) {
		setConstNumber(offset + 148, $act_cost43, value);
	}
	
	/**
	 * 実際原価４３. Actual cost 43.<p>
	 *
	 */
	public void act_cost43(long value) {
		setConstNumber(offset + 148, $act_cost43, value);
	}
	
	/**
	 * 実際原価４３. Actual cost 43.<p>
	 *
	 */
	public void act_cost43(float value) {
		setConstNumber(offset + 148, $act_cost43, value);
	}
	
	/**
	 * 実際原価４３. Actual cost 43.<p>
	 *
	 */
	public void act_cost43(double value) {
		setConstNumber(offset + 148, $act_cost43, value);
	}
	
	/**
	 * 実際原価４４. Actual cost 44.<p>
	 *
	 */
	public MCNumber act_cost44() {
		return getConstNumber(offset + 149, $act_cost44);
	}

	/**
	 * 実際原価４４. Actual cost 44.<p>
	 *
	 */
	public void act_cost44(MCNumber value) {
		setConstNumber(offset + 149, $act_cost44, value);
	}
	
	/**
	 * 実際原価４４. Actual cost 44.<p>
	 *
	 */
	public void act_cost44(int value) {
		setConstNumber(offset + 149, $act_cost44, value);
	}
	
	/**
	 * 実際原価４４. Actual cost 44.<p>
	 *
	 */
	public void act_cost44(long value) {
		setConstNumber(offset + 149, $act_cost44, value);
	}
	
	/**
	 * 実際原価４４. Actual cost 44.<p>
	 *
	 */
	public void act_cost44(float value) {
		setConstNumber(offset + 149, $act_cost44, value);
	}
	
	/**
	 * 実際原価４４. Actual cost 44.<p>
	 *
	 */
	public void act_cost44(double value) {
		setConstNumber(offset + 149, $act_cost44, value);
	}
	
	/**
	 * 実際原価４５. Actual cost 45.<p>
	 *
	 */
	public MCNumber act_cost45() {
		return getConstNumber(offset + 150, $act_cost45);
	}

	/**
	 * 実際原価４５. Actual cost 45.<p>
	 *
	 */
	public void act_cost45(MCNumber value) {
		setConstNumber(offset + 150, $act_cost45, value);
	}
	
	/**
	 * 実際原価４５. Actual cost 45.<p>
	 *
	 */
	public void act_cost45(int value) {
		setConstNumber(offset + 150, $act_cost45, value);
	}
	
	/**
	 * 実際原価４５. Actual cost 45.<p>
	 *
	 */
	public void act_cost45(long value) {
		setConstNumber(offset + 150, $act_cost45, value);
	}
	
	/**
	 * 実際原価４５. Actual cost 45.<p>
	 *
	 */
	public void act_cost45(float value) {
		setConstNumber(offset + 150, $act_cost45, value);
	}
	
	/**
	 * 実際原価４５. Actual cost 45.<p>
	 *
	 */
	public void act_cost45(double value) {
		setConstNumber(offset + 150, $act_cost45, value);
	}
	
	/**
	 * 実際原価４６. Actual cost 46.<p>
	 *
	 */
	public MCNumber act_cost46() {
		return getConstNumber(offset + 151, $act_cost46);
	}

	/**
	 * 実際原価４６. Actual cost 46.<p>
	 *
	 */
	public void act_cost46(MCNumber value) {
		setConstNumber(offset + 151, $act_cost46, value);
	}
	
	/**
	 * 実際原価４６. Actual cost 46.<p>
	 *
	 */
	public void act_cost46(int value) {
		setConstNumber(offset + 151, $act_cost46, value);
	}
	
	/**
	 * 実際原価４６. Actual cost 46.<p>
	 *
	 */
	public void act_cost46(long value) {
		setConstNumber(offset + 151, $act_cost46, value);
	}
	
	/**
	 * 実際原価４６. Actual cost 46.<p>
	 *
	 */
	public void act_cost46(float value) {
		setConstNumber(offset + 151, $act_cost46, value);
	}
	
	/**
	 * 実際原価４６. Actual cost 46.<p>
	 *
	 */
	public void act_cost46(double value) {
		setConstNumber(offset + 151, $act_cost46, value);
	}
	
	/**
	 * 実際原価４７. Actual cost 47.<p>
	 *
	 */
	public MCNumber act_cost47() {
		return getConstNumber(offset + 152, $act_cost47);
	}

	/**
	 * 実際原価４７. Actual cost 47.<p>
	 *
	 */
	public void act_cost47(MCNumber value) {
		setConstNumber(offset + 152, $act_cost47, value);
	}
	
	/**
	 * 実際原価４７. Actual cost 47.<p>
	 *
	 */
	public void act_cost47(int value) {
		setConstNumber(offset + 152, $act_cost47, value);
	}
	
	/**
	 * 実際原価４７. Actual cost 47.<p>
	 *
	 */
	public void act_cost47(long value) {
		setConstNumber(offset + 152, $act_cost47, value);
	}
	
	/**
	 * 実際原価４７. Actual cost 47.<p>
	 *
	 */
	public void act_cost47(float value) {
		setConstNumber(offset + 152, $act_cost47, value);
	}
	
	/**
	 * 実際原価４７. Actual cost 47.<p>
	 *
	 */
	public void act_cost47(double value) {
		setConstNumber(offset + 152, $act_cost47, value);
	}
	
	/**
	 * 実際原価４８. Actual cost 48.<p>
	 *
	 */
	public MCNumber act_cost48() {
		return getConstNumber(offset + 153, $act_cost48);
	}

	/**
	 * 実際原価４８. Actual cost 48.<p>
	 *
	 */
	public void act_cost48(MCNumber value) {
		setConstNumber(offset + 153, $act_cost48, value);
	}
	
	/**
	 * 実際原価４８. Actual cost 48.<p>
	 *
	 */
	public void act_cost48(int value) {
		setConstNumber(offset + 153, $act_cost48, value);
	}
	
	/**
	 * 実際原価４８. Actual cost 48.<p>
	 *
	 */
	public void act_cost48(long value) {
		setConstNumber(offset + 153, $act_cost48, value);
	}
	
	/**
	 * 実際原価４８. Actual cost 48.<p>
	 *
	 */
	public void act_cost48(float value) {
		setConstNumber(offset + 153, $act_cost48, value);
	}
	
	/**
	 * 実際原価４８. Actual cost 48.<p>
	 *
	 */
	public void act_cost48(double value) {
		setConstNumber(offset + 153, $act_cost48, value);
	}
	
	/**
	 * 実際原価４９. Actual cost 49.<p>
	 *
	 */
	public MCNumber act_cost49() {
		return getConstNumber(offset + 154, $act_cost49);
	}

	/**
	 * 実際原価４９. Actual cost 49.<p>
	 *
	 */
	public void act_cost49(MCNumber value) {
		setConstNumber(offset + 154, $act_cost49, value);
	}
	
	/**
	 * 実際原価４９. Actual cost 49.<p>
	 *
	 */
	public void act_cost49(int value) {
		setConstNumber(offset + 154, $act_cost49, value);
	}
	
	/**
	 * 実際原価４９. Actual cost 49.<p>
	 *
	 */
	public void act_cost49(long value) {
		setConstNumber(offset + 154, $act_cost49, value);
	}
	
	/**
	 * 実際原価４９. Actual cost 49.<p>
	 *
	 */
	public void act_cost49(float value) {
		setConstNumber(offset + 154, $act_cost49, value);
	}
	
	/**
	 * 実際原価４９. Actual cost 49.<p>
	 *
	 */
	public void act_cost49(double value) {
		setConstNumber(offset + 154, $act_cost49, value);
	}
	
	/**
	 * 実際原価５０. Actual cost 50.<p>
	 *
	 */
	public MCNumber act_cost50() {
		return getConstNumber(offset + 155, $act_cost50);
	}

	/**
	 * 実際原価５０. Actual cost 50.<p>
	 *
	 */
	public void act_cost50(MCNumber value) {
		setConstNumber(offset + 155, $act_cost50, value);
	}
	
	/**
	 * 実際原価５０. Actual cost 50.<p>
	 *
	 */
	public void act_cost50(int value) {
		setConstNumber(offset + 155, $act_cost50, value);
	}
	
	/**
	 * 実際原価５０. Actual cost 50.<p>
	 *
	 */
	public void act_cost50(long value) {
		setConstNumber(offset + 155, $act_cost50, value);
	}
	
	/**
	 * 実際原価５０. Actual cost 50.<p>
	 *
	 */
	public void act_cost50(float value) {
		setConstNumber(offset + 155, $act_cost50, value);
	}
	
	/**
	 * 実際原価５０. Actual cost 50.<p>
	 *
	 */
	public void act_cost50(double value) {
		setConstNumber(offset + 155, $act_cost50, value);
	}
	
	/**
	 * 実際原価５１. Actual cost 51.<p>
	 *
	 */
	public MCNumber act_cost51() {
		return getConstNumber(offset + 156, $act_cost51);
	}

	/**
	 * 実際原価５１. Actual cost 51.<p>
	 *
	 */
	public void act_cost51(MCNumber value) {
		setConstNumber(offset + 156, $act_cost51, value);
	}
	
	/**
	 * 実際原価５１. Actual cost 51.<p>
	 *
	 */
	public void act_cost51(int value) {
		setConstNumber(offset + 156, $act_cost51, value);
	}
	
	/**
	 * 実際原価５１. Actual cost 51.<p>
	 *
	 */
	public void act_cost51(long value) {
		setConstNumber(offset + 156, $act_cost51, value);
	}
	
	/**
	 * 実際原価５１. Actual cost 51.<p>
	 *
	 */
	public void act_cost51(float value) {
		setConstNumber(offset + 156, $act_cost51, value);
	}
	
	/**
	 * 実際原価５１. Actual cost 51.<p>
	 *
	 */
	public void act_cost51(double value) {
		setConstNumber(offset + 156, $act_cost51, value);
	}
	
	/**
	 * 実際原価５２. Actual cost 52.<p>
	 *
	 */
	public MCNumber act_cost52() {
		return getConstNumber(offset + 157, $act_cost52);
	}

	/**
	 * 実際原価５２. Actual cost 52.<p>
	 *
	 */
	public void act_cost52(MCNumber value) {
		setConstNumber(offset + 157, $act_cost52, value);
	}
	
	/**
	 * 実際原価５２. Actual cost 52.<p>
	 *
	 */
	public void act_cost52(int value) {
		setConstNumber(offset + 157, $act_cost52, value);
	}
	
	/**
	 * 実際原価５２. Actual cost 52.<p>
	 *
	 */
	public void act_cost52(long value) {
		setConstNumber(offset + 157, $act_cost52, value);
	}
	
	/**
	 * 実際原価５２. Actual cost 52.<p>
	 *
	 */
	public void act_cost52(float value) {
		setConstNumber(offset + 157, $act_cost52, value);
	}
	
	/**
	 * 実際原価５２. Actual cost 52.<p>
	 *
	 */
	public void act_cost52(double value) {
		setConstNumber(offset + 157, $act_cost52, value);
	}
	
	/**
	 * 実際原価５３. Actual cost 53.<p>
	 *
	 */
	public MCNumber act_cost53() {
		return getConstNumber(offset + 158, $act_cost53);
	}

	/**
	 * 実際原価５３. Actual cost 53.<p>
	 *
	 */
	public void act_cost53(MCNumber value) {
		setConstNumber(offset + 158, $act_cost53, value);
	}
	
	/**
	 * 実際原価５３. Actual cost 53.<p>
	 *
	 */
	public void act_cost53(int value) {
		setConstNumber(offset + 158, $act_cost53, value);
	}
	
	/**
	 * 実際原価５３. Actual cost 53.<p>
	 *
	 */
	public void act_cost53(long value) {
		setConstNumber(offset + 158, $act_cost53, value);
	}
	
	/**
	 * 実際原価５３. Actual cost 53.<p>
	 *
	 */
	public void act_cost53(float value) {
		setConstNumber(offset + 158, $act_cost53, value);
	}
	
	/**
	 * 実際原価５３. Actual cost 53.<p>
	 *
	 */
	public void act_cost53(double value) {
		setConstNumber(offset + 158, $act_cost53, value);
	}
	
	/**
	 * 実際原価５４. Actual cost 54.<p>
	 *
	 */
	public MCNumber act_cost54() {
		return getConstNumber(offset + 159, $act_cost54);
	}

	/**
	 * 実際原価５４. Actual cost 54.<p>
	 *
	 */
	public void act_cost54(MCNumber value) {
		setConstNumber(offset + 159, $act_cost54, value);
	}
	
	/**
	 * 実際原価５４. Actual cost 54.<p>
	 *
	 */
	public void act_cost54(int value) {
		setConstNumber(offset + 159, $act_cost54, value);
	}
	
	/**
	 * 実際原価５４. Actual cost 54.<p>
	 *
	 */
	public void act_cost54(long value) {
		setConstNumber(offset + 159, $act_cost54, value);
	}
	
	/**
	 * 実際原価５４. Actual cost 54.<p>
	 *
	 */
	public void act_cost54(float value) {
		setConstNumber(offset + 159, $act_cost54, value);
	}
	
	/**
	 * 実際原価５４. Actual cost 54.<p>
	 *
	 */
	public void act_cost54(double value) {
		setConstNumber(offset + 159, $act_cost54, value);
	}
	
	/**
	 * 実際原価５５. Actual cost 55.<p>
	 *
	 */
	public MCNumber act_cost55() {
		return getConstNumber(offset + 160, $act_cost55);
	}

	/**
	 * 実際原価５５. Actual cost 55.<p>
	 *
	 */
	public void act_cost55(MCNumber value) {
		setConstNumber(offset + 160, $act_cost55, value);
	}
	
	/**
	 * 実際原価５５. Actual cost 55.<p>
	 *
	 */
	public void act_cost55(int value) {
		setConstNumber(offset + 160, $act_cost55, value);
	}
	
	/**
	 * 実際原価５５. Actual cost 55.<p>
	 *
	 */
	public void act_cost55(long value) {
		setConstNumber(offset + 160, $act_cost55, value);
	}
	
	/**
	 * 実際原価５５. Actual cost 55.<p>
	 *
	 */
	public void act_cost55(float value) {
		setConstNumber(offset + 160, $act_cost55, value);
	}
	
	/**
	 * 実際原価５５. Actual cost 55.<p>
	 *
	 */
	public void act_cost55(double value) {
		setConstNumber(offset + 160, $act_cost55, value);
	}
	
	/**
	 * 実際原価５６. Actual cost 56.<p>
	 *
	 */
	public MCNumber act_cost56() {
		return getConstNumber(offset + 161, $act_cost56);
	}

	/**
	 * 実際原価５６. Actual cost 56.<p>
	 *
	 */
	public void act_cost56(MCNumber value) {
		setConstNumber(offset + 161, $act_cost56, value);
	}
	
	/**
	 * 実際原価５６. Actual cost 56.<p>
	 *
	 */
	public void act_cost56(int value) {
		setConstNumber(offset + 161, $act_cost56, value);
	}
	
	/**
	 * 実際原価５６. Actual cost 56.<p>
	 *
	 */
	public void act_cost56(long value) {
		setConstNumber(offset + 161, $act_cost56, value);
	}
	
	/**
	 * 実際原価５６. Actual cost 56.<p>
	 *
	 */
	public void act_cost56(float value) {
		setConstNumber(offset + 161, $act_cost56, value);
	}
	
	/**
	 * 実際原価５６. Actual cost 56.<p>
	 *
	 */
	public void act_cost56(double value) {
		setConstNumber(offset + 161, $act_cost56, value);
	}
	
	/**
	 * 実際原価５７. Actual cost 57.<p>
	 *
	 */
	public MCNumber act_cost57() {
		return getConstNumber(offset + 162, $act_cost57);
	}

	/**
	 * 実際原価５７. Actual cost 57.<p>
	 *
	 */
	public void act_cost57(MCNumber value) {
		setConstNumber(offset + 162, $act_cost57, value);
	}
	
	/**
	 * 実際原価５７. Actual cost 57.<p>
	 *
	 */
	public void act_cost57(int value) {
		setConstNumber(offset + 162, $act_cost57, value);
	}
	
	/**
	 * 実際原価５７. Actual cost 57.<p>
	 *
	 */
	public void act_cost57(long value) {
		setConstNumber(offset + 162, $act_cost57, value);
	}
	
	/**
	 * 実際原価５７. Actual cost 57.<p>
	 *
	 */
	public void act_cost57(float value) {
		setConstNumber(offset + 162, $act_cost57, value);
	}
	
	/**
	 * 実際原価５７. Actual cost 57.<p>
	 *
	 */
	public void act_cost57(double value) {
		setConstNumber(offset + 162, $act_cost57, value);
	}
	
	/**
	 * 実際原価５８. Actual cost 58.<p>
	 *
	 */
	public MCNumber act_cost58() {
		return getConstNumber(offset + 163, $act_cost58);
	}

	/**
	 * 実際原価５８. Actual cost 58.<p>
	 *
	 */
	public void act_cost58(MCNumber value) {
		setConstNumber(offset + 163, $act_cost58, value);
	}
	
	/**
	 * 実際原価５８. Actual cost 58.<p>
	 *
	 */
	public void act_cost58(int value) {
		setConstNumber(offset + 163, $act_cost58, value);
	}
	
	/**
	 * 実際原価５８. Actual cost 58.<p>
	 *
	 */
	public void act_cost58(long value) {
		setConstNumber(offset + 163, $act_cost58, value);
	}
	
	/**
	 * 実際原価５８. Actual cost 58.<p>
	 *
	 */
	public void act_cost58(float value) {
		setConstNumber(offset + 163, $act_cost58, value);
	}
	
	/**
	 * 実際原価５８. Actual cost 58.<p>
	 *
	 */
	public void act_cost58(double value) {
		setConstNumber(offset + 163, $act_cost58, value);
	}
	
	/**
	 * 実際原価５９. Actual cost 59.<p>
	 *
	 */
	public MCNumber act_cost59() {
		return getConstNumber(offset + 164, $act_cost59);
	}

	/**
	 * 実際原価５９. Actual cost 59.<p>
	 *
	 */
	public void act_cost59(MCNumber value) {
		setConstNumber(offset + 164, $act_cost59, value);
	}
	
	/**
	 * 実際原価５９. Actual cost 59.<p>
	 *
	 */
	public void act_cost59(int value) {
		setConstNumber(offset + 164, $act_cost59, value);
	}
	
	/**
	 * 実際原価５９. Actual cost 59.<p>
	 *
	 */
	public void act_cost59(long value) {
		setConstNumber(offset + 164, $act_cost59, value);
	}
	
	/**
	 * 実際原価５９. Actual cost 59.<p>
	 *
	 */
	public void act_cost59(float value) {
		setConstNumber(offset + 164, $act_cost59, value);
	}
	
	/**
	 * 実際原価５９. Actual cost 59.<p>
	 *
	 */
	public void act_cost59(double value) {
		setConstNumber(offset + 164, $act_cost59, value);
	}
	
	/**
	 * 実際原価６０. Actual cost 60.<p>
	 *
	 */
	public MCNumber act_cost60() {
		return getConstNumber(offset + 165, $act_cost60);
	}

	/**
	 * 実際原価６０. Actual cost 60.<p>
	 *
	 */
	public void act_cost60(MCNumber value) {
		setConstNumber(offset + 165, $act_cost60, value);
	}
	
	/**
	 * 実際原価６０. Actual cost 60.<p>
	 *
	 */
	public void act_cost60(int value) {
		setConstNumber(offset + 165, $act_cost60, value);
	}
	
	/**
	 * 実際原価６０. Actual cost 60.<p>
	 *
	 */
	public void act_cost60(long value) {
		setConstNumber(offset + 165, $act_cost60, value);
	}
	
	/**
	 * 実際原価６０. Actual cost 60.<p>
	 *
	 */
	public void act_cost60(float value) {
		setConstNumber(offset + 165, $act_cost60, value);
	}
	
	/**
	 * 実際原価６０. Actual cost 60.<p>
	 *
	 */
	public void act_cost60(double value) {
		setConstNumber(offset + 165, $act_cost60, value);
	}
	
	/**
	 * 実際原価６１. Actual cost 61.<p>
	 *
	 */
	public MCNumber act_cost61() {
		return getConstNumber(offset + 166, $act_cost61);
	}

	/**
	 * 実際原価６１. Actual cost 61.<p>
	 *
	 */
	public void act_cost61(MCNumber value) {
		setConstNumber(offset + 166, $act_cost61, value);
	}
	
	/**
	 * 実際原価６１. Actual cost 61.<p>
	 *
	 */
	public void act_cost61(int value) {
		setConstNumber(offset + 166, $act_cost61, value);
	}
	
	/**
	 * 実際原価６１. Actual cost 61.<p>
	 *
	 */
	public void act_cost61(long value) {
		setConstNumber(offset + 166, $act_cost61, value);
	}
	
	/**
	 * 実際原価６１. Actual cost 61.<p>
	 *
	 */
	public void act_cost61(float value) {
		setConstNumber(offset + 166, $act_cost61, value);
	}
	
	/**
	 * 実際原価６１. Actual cost 61.<p>
	 *
	 */
	public void act_cost61(double value) {
		setConstNumber(offset + 166, $act_cost61, value);
	}
	
	/**
	 * 実際原価６２. Actual cost 62.<p>
	 *
	 */
	public MCNumber act_cost62() {
		return getConstNumber(offset + 167, $act_cost62);
	}

	/**
	 * 実際原価６２. Actual cost 62.<p>
	 *
	 */
	public void act_cost62(MCNumber value) {
		setConstNumber(offset + 167, $act_cost62, value);
	}
	
	/**
	 * 実際原価６２. Actual cost 62.<p>
	 *
	 */
	public void act_cost62(int value) {
		setConstNumber(offset + 167, $act_cost62, value);
	}
	
	/**
	 * 実際原価６２. Actual cost 62.<p>
	 *
	 */
	public void act_cost62(long value) {
		setConstNumber(offset + 167, $act_cost62, value);
	}
	
	/**
	 * 実際原価６２. Actual cost 62.<p>
	 *
	 */
	public void act_cost62(float value) {
		setConstNumber(offset + 167, $act_cost62, value);
	}
	
	/**
	 * 実際原価６２. Actual cost 62.<p>
	 *
	 */
	public void act_cost62(double value) {
		setConstNumber(offset + 167, $act_cost62, value);
	}
	
	/**
	 * 実際原価６３. Actual cost 63.<p>
	 *
	 */
	public MCNumber act_cost63() {
		return getConstNumber(offset + 168, $act_cost63);
	}

	/**
	 * 実際原価６３. Actual cost 63.<p>
	 *
	 */
	public void act_cost63(MCNumber value) {
		setConstNumber(offset + 168, $act_cost63, value);
	}
	
	/**
	 * 実際原価６３. Actual cost 63.<p>
	 *
	 */
	public void act_cost63(int value) {
		setConstNumber(offset + 168, $act_cost63, value);
	}
	
	/**
	 * 実際原価６３. Actual cost 63.<p>
	 *
	 */
	public void act_cost63(long value) {
		setConstNumber(offset + 168, $act_cost63, value);
	}
	
	/**
	 * 実際原価６３. Actual cost 63.<p>
	 *
	 */
	public void act_cost63(float value) {
		setConstNumber(offset + 168, $act_cost63, value);
	}
	
	/**
	 * 実際原価６３. Actual cost 63.<p>
	 *
	 */
	public void act_cost63(double value) {
		setConstNumber(offset + 168, $act_cost63, value);
	}
	
	/**
	 * 実際原価６４. Actual cost 64.<p>
	 *
	 */
	public MCNumber act_cost64() {
		return getConstNumber(offset + 169, $act_cost64);
	}

	/**
	 * 実際原価６４. Actual cost 64.<p>
	 *
	 */
	public void act_cost64(MCNumber value) {
		setConstNumber(offset + 169, $act_cost64, value);
	}
	
	/**
	 * 実際原価６４. Actual cost 64.<p>
	 *
	 */
	public void act_cost64(int value) {
		setConstNumber(offset + 169, $act_cost64, value);
	}
	
	/**
	 * 実際原価６４. Actual cost 64.<p>
	 *
	 */
	public void act_cost64(long value) {
		setConstNumber(offset + 169, $act_cost64, value);
	}
	
	/**
	 * 実際原価６４. Actual cost 64.<p>
	 *
	 */
	public void act_cost64(float value) {
		setConstNumber(offset + 169, $act_cost64, value);
	}
	
	/**
	 * 実際原価６４. Actual cost 64.<p>
	 *
	 */
	public void act_cost64(double value) {
		setConstNumber(offset + 169, $act_cost64, value);
	}
	
	/**
	 * 実際原価６５. Actual cost 65.<p>
	 *
	 */
	public MCNumber act_cost65() {
		return getConstNumber(offset + 170, $act_cost65);
	}

	/**
	 * 実際原価６５. Actual cost 65.<p>
	 *
	 */
	public void act_cost65(MCNumber value) {
		setConstNumber(offset + 170, $act_cost65, value);
	}
	
	/**
	 * 実際原価６５. Actual cost 65.<p>
	 *
	 */
	public void act_cost65(int value) {
		setConstNumber(offset + 170, $act_cost65, value);
	}
	
	/**
	 * 実際原価６５. Actual cost 65.<p>
	 *
	 */
	public void act_cost65(long value) {
		setConstNumber(offset + 170, $act_cost65, value);
	}
	
	/**
	 * 実際原価６５. Actual cost 65.<p>
	 *
	 */
	public void act_cost65(float value) {
		setConstNumber(offset + 170, $act_cost65, value);
	}
	
	/**
	 * 実際原価６５. Actual cost 65.<p>
	 *
	 */
	public void act_cost65(double value) {
		setConstNumber(offset + 170, $act_cost65, value);
	}
	
	/**
	 * 実際原価６６. Actual cost 66.<p>
	 *
	 */
	public MCNumber act_cost66() {
		return getConstNumber(offset + 171, $act_cost66);
	}

	/**
	 * 実際原価６６. Actual cost 66.<p>
	 *
	 */
	public void act_cost66(MCNumber value) {
		setConstNumber(offset + 171, $act_cost66, value);
	}
	
	/**
	 * 実際原価６６. Actual cost 66.<p>
	 *
	 */
	public void act_cost66(int value) {
		setConstNumber(offset + 171, $act_cost66, value);
	}
	
	/**
	 * 実際原価６６. Actual cost 66.<p>
	 *
	 */
	public void act_cost66(long value) {
		setConstNumber(offset + 171, $act_cost66, value);
	}
	
	/**
	 * 実際原価６６. Actual cost 66.<p>
	 *
	 */
	public void act_cost66(float value) {
		setConstNumber(offset + 171, $act_cost66, value);
	}
	
	/**
	 * 実際原価６６. Actual cost 66.<p>
	 *
	 */
	public void act_cost66(double value) {
		setConstNumber(offset + 171, $act_cost66, value);
	}
	
	/**
	 * 実際原価６７. Actual cost 67.<p>
	 *
	 */
	public MCNumber act_cost67() {
		return getConstNumber(offset + 172, $act_cost67);
	}

	/**
	 * 実際原価６７. Actual cost 67.<p>
	 *
	 */
	public void act_cost67(MCNumber value) {
		setConstNumber(offset + 172, $act_cost67, value);
	}
	
	/**
	 * 実際原価６７. Actual cost 67.<p>
	 *
	 */
	public void act_cost67(int value) {
		setConstNumber(offset + 172, $act_cost67, value);
	}
	
	/**
	 * 実際原価６７. Actual cost 67.<p>
	 *
	 */
	public void act_cost67(long value) {
		setConstNumber(offset + 172, $act_cost67, value);
	}
	
	/**
	 * 実際原価６７. Actual cost 67.<p>
	 *
	 */
	public void act_cost67(float value) {
		setConstNumber(offset + 172, $act_cost67, value);
	}
	
	/**
	 * 実際原価６７. Actual cost 67.<p>
	 *
	 */
	public void act_cost67(double value) {
		setConstNumber(offset + 172, $act_cost67, value);
	}
	
	/**
	 * 実際原価６８. Actual cost 68.<p>
	 *
	 */
	public MCNumber act_cost68() {
		return getConstNumber(offset + 173, $act_cost68);
	}

	/**
	 * 実際原価６８. Actual cost 68.<p>
	 *
	 */
	public void act_cost68(MCNumber value) {
		setConstNumber(offset + 173, $act_cost68, value);
	}
	
	/**
	 * 実際原価６８. Actual cost 68.<p>
	 *
	 */
	public void act_cost68(int value) {
		setConstNumber(offset + 173, $act_cost68, value);
	}
	
	/**
	 * 実際原価６８. Actual cost 68.<p>
	 *
	 */
	public void act_cost68(long value) {
		setConstNumber(offset + 173, $act_cost68, value);
	}
	
	/**
	 * 実際原価６８. Actual cost 68.<p>
	 *
	 */
	public void act_cost68(float value) {
		setConstNumber(offset + 173, $act_cost68, value);
	}
	
	/**
	 * 実際原価６８. Actual cost 68.<p>
	 *
	 */
	public void act_cost68(double value) {
		setConstNumber(offset + 173, $act_cost68, value);
	}
	
	/**
	 * 実際原価６９. Actual cost 69.<p>
	 *
	 */
	public MCNumber act_cost69() {
		return getConstNumber(offset + 174, $act_cost69);
	}

	/**
	 * 実際原価６９. Actual cost 69.<p>
	 *
	 */
	public void act_cost69(MCNumber value) {
		setConstNumber(offset + 174, $act_cost69, value);
	}
	
	/**
	 * 実際原価６９. Actual cost 69.<p>
	 *
	 */
	public void act_cost69(int value) {
		setConstNumber(offset + 174, $act_cost69, value);
	}
	
	/**
	 * 実際原価６９. Actual cost 69.<p>
	 *
	 */
	public void act_cost69(long value) {
		setConstNumber(offset + 174, $act_cost69, value);
	}
	
	/**
	 * 実際原価６９. Actual cost 69.<p>
	 *
	 */
	public void act_cost69(float value) {
		setConstNumber(offset + 174, $act_cost69, value);
	}
	
	/**
	 * 実際原価６９. Actual cost 69.<p>
	 *
	 */
	public void act_cost69(double value) {
		setConstNumber(offset + 174, $act_cost69, value);
	}
	
	/**
	 * 実際原価７０. Actual cost 70.<p>
	 *
	 */
	public MCNumber act_cost70() {
		return getConstNumber(offset + 175, $act_cost70);
	}

	/**
	 * 実際原価７０. Actual cost 70.<p>
	 *
	 */
	public void act_cost70(MCNumber value) {
		setConstNumber(offset + 175, $act_cost70, value);
	}
	
	/**
	 * 実際原価７０. Actual cost 70.<p>
	 *
	 */
	public void act_cost70(int value) {
		setConstNumber(offset + 175, $act_cost70, value);
	}
	
	/**
	 * 実際原価７０. Actual cost 70.<p>
	 *
	 */
	public void act_cost70(long value) {
		setConstNumber(offset + 175, $act_cost70, value);
	}
	
	/**
	 * 実際原価７０. Actual cost 70.<p>
	 *
	 */
	public void act_cost70(float value) {
		setConstNumber(offset + 175, $act_cost70, value);
	}
	
	/**
	 * 実際原価７０. Actual cost 70.<p>
	 *
	 */
	public void act_cost70(double value) {
		setConstNumber(offset + 175, $act_cost70, value);
	}
	
	/**
	 * 実際原価７１. Actual cost 71.<p>
	 *
	 */
	public MCNumber act_cost71() {
		return getConstNumber(offset + 176, $act_cost71);
	}

	/**
	 * 実際原価７１. Actual cost 71.<p>
	 *
	 */
	public void act_cost71(MCNumber value) {
		setConstNumber(offset + 176, $act_cost71, value);
	}
	
	/**
	 * 実際原価７１. Actual cost 71.<p>
	 *
	 */
	public void act_cost71(int value) {
		setConstNumber(offset + 176, $act_cost71, value);
	}
	
	/**
	 * 実際原価７１. Actual cost 71.<p>
	 *
	 */
	public void act_cost71(long value) {
		setConstNumber(offset + 176, $act_cost71, value);
	}
	
	/**
	 * 実際原価７１. Actual cost 71.<p>
	 *
	 */
	public void act_cost71(float value) {
		setConstNumber(offset + 176, $act_cost71, value);
	}
	
	/**
	 * 実際原価７１. Actual cost 71.<p>
	 *
	 */
	public void act_cost71(double value) {
		setConstNumber(offset + 176, $act_cost71, value);
	}
	
	/**
	 * 実際原価７２. Actual cost 72.<p>
	 *
	 */
	public MCNumber act_cost72() {
		return getConstNumber(offset + 177, $act_cost72);
	}

	/**
	 * 実際原価７２. Actual cost 72.<p>
	 *
	 */
	public void act_cost72(MCNumber value) {
		setConstNumber(offset + 177, $act_cost72, value);
	}
	
	/**
	 * 実際原価７２. Actual cost 72.<p>
	 *
	 */
	public void act_cost72(int value) {
		setConstNumber(offset + 177, $act_cost72, value);
	}
	
	/**
	 * 実際原価７２. Actual cost 72.<p>
	 *
	 */
	public void act_cost72(long value) {
		setConstNumber(offset + 177, $act_cost72, value);
	}
	
	/**
	 * 実際原価７２. Actual cost 72.<p>
	 *
	 */
	public void act_cost72(float value) {
		setConstNumber(offset + 177, $act_cost72, value);
	}
	
	/**
	 * 実際原価７２. Actual cost 72.<p>
	 *
	 */
	public void act_cost72(double value) {
		setConstNumber(offset + 177, $act_cost72, value);
	}
	
	/**
	 * 実際原価７３. Actual cost 73.<p>
	 *
	 */
	public MCNumber act_cost73() {
		return getConstNumber(offset + 178, $act_cost73);
	}

	/**
	 * 実際原価７３. Actual cost 73.<p>
	 *
	 */
	public void act_cost73(MCNumber value) {
		setConstNumber(offset + 178, $act_cost73, value);
	}
	
	/**
	 * 実際原価７３. Actual cost 73.<p>
	 *
	 */
	public void act_cost73(int value) {
		setConstNumber(offset + 178, $act_cost73, value);
	}
	
	/**
	 * 実際原価７３. Actual cost 73.<p>
	 *
	 */
	public void act_cost73(long value) {
		setConstNumber(offset + 178, $act_cost73, value);
	}
	
	/**
	 * 実際原価７３. Actual cost 73.<p>
	 *
	 */
	public void act_cost73(float value) {
		setConstNumber(offset + 178, $act_cost73, value);
	}
	
	/**
	 * 実際原価７３. Actual cost 73.<p>
	 *
	 */
	public void act_cost73(double value) {
		setConstNumber(offset + 178, $act_cost73, value);
	}
	
	/**
	 * 実際原価７４. Actual cost 74.<p>
	 *
	 */
	public MCNumber act_cost74() {
		return getConstNumber(offset + 179, $act_cost74);
	}

	/**
	 * 実際原価７４. Actual cost 74.<p>
	 *
	 */
	public void act_cost74(MCNumber value) {
		setConstNumber(offset + 179, $act_cost74, value);
	}
	
	/**
	 * 実際原価７４. Actual cost 74.<p>
	 *
	 */
	public void act_cost74(int value) {
		setConstNumber(offset + 179, $act_cost74, value);
	}
	
	/**
	 * 実際原価７４. Actual cost 74.<p>
	 *
	 */
	public void act_cost74(long value) {
		setConstNumber(offset + 179, $act_cost74, value);
	}
	
	/**
	 * 実際原価７４. Actual cost 74.<p>
	 *
	 */
	public void act_cost74(float value) {
		setConstNumber(offset + 179, $act_cost74, value);
	}
	
	/**
	 * 実際原価７４. Actual cost 74.<p>
	 *
	 */
	public void act_cost74(double value) {
		setConstNumber(offset + 179, $act_cost74, value);
	}
	
	/**
	 * 実際原価７５. Actual cost 75.<p>
	 *
	 */
	public MCNumber act_cost75() {
		return getConstNumber(offset + 180, $act_cost75);
	}

	/**
	 * 実際原価７５. Actual cost 75.<p>
	 *
	 */
	public void act_cost75(MCNumber value) {
		setConstNumber(offset + 180, $act_cost75, value);
	}
	
	/**
	 * 実際原価７５. Actual cost 75.<p>
	 *
	 */
	public void act_cost75(int value) {
		setConstNumber(offset + 180, $act_cost75, value);
	}
	
	/**
	 * 実際原価７５. Actual cost 75.<p>
	 *
	 */
	public void act_cost75(long value) {
		setConstNumber(offset + 180, $act_cost75, value);
	}
	
	/**
	 * 実際原価７５. Actual cost 75.<p>
	 *
	 */
	public void act_cost75(float value) {
		setConstNumber(offset + 180, $act_cost75, value);
	}
	
	/**
	 * 実際原価７５. Actual cost 75.<p>
	 *
	 */
	public void act_cost75(double value) {
		setConstNumber(offset + 180, $act_cost75, value);
	}
	
	/**
	 * 実際原価７６. Actual cost 76.<p>
	 *
	 */
	public MCNumber act_cost76() {
		return getConstNumber(offset + 181, $act_cost76);
	}

	/**
	 * 実際原価７６. Actual cost 76.<p>
	 *
	 */
	public void act_cost76(MCNumber value) {
		setConstNumber(offset + 181, $act_cost76, value);
	}
	
	/**
	 * 実際原価７６. Actual cost 76.<p>
	 *
	 */
	public void act_cost76(int value) {
		setConstNumber(offset + 181, $act_cost76, value);
	}
	
	/**
	 * 実際原価７６. Actual cost 76.<p>
	 *
	 */
	public void act_cost76(long value) {
		setConstNumber(offset + 181, $act_cost76, value);
	}
	
	/**
	 * 実際原価７６. Actual cost 76.<p>
	 *
	 */
	public void act_cost76(float value) {
		setConstNumber(offset + 181, $act_cost76, value);
	}
	
	/**
	 * 実際原価７６. Actual cost 76.<p>
	 *
	 */
	public void act_cost76(double value) {
		setConstNumber(offset + 181, $act_cost76, value);
	}
	
	/**
	 * 実際原価７７. Actual cost 77.<p>
	 *
	 */
	public MCNumber act_cost77() {
		return getConstNumber(offset + 182, $act_cost77);
	}

	/**
	 * 実際原価７７. Actual cost 77.<p>
	 *
	 */
	public void act_cost77(MCNumber value) {
		setConstNumber(offset + 182, $act_cost77, value);
	}
	
	/**
	 * 実際原価７７. Actual cost 77.<p>
	 *
	 */
	public void act_cost77(int value) {
		setConstNumber(offset + 182, $act_cost77, value);
	}
	
	/**
	 * 実際原価７７. Actual cost 77.<p>
	 *
	 */
	public void act_cost77(long value) {
		setConstNumber(offset + 182, $act_cost77, value);
	}
	
	/**
	 * 実際原価７７. Actual cost 77.<p>
	 *
	 */
	public void act_cost77(float value) {
		setConstNumber(offset + 182, $act_cost77, value);
	}
	
	/**
	 * 実際原価７７. Actual cost 77.<p>
	 *
	 */
	public void act_cost77(double value) {
		setConstNumber(offset + 182, $act_cost77, value);
	}
	
	/**
	 * 実際原価７８. Actual cost 78.<p>
	 *
	 */
	public MCNumber act_cost78() {
		return getConstNumber(offset + 183, $act_cost78);
	}

	/**
	 * 実際原価７８. Actual cost 78.<p>
	 *
	 */
	public void act_cost78(MCNumber value) {
		setConstNumber(offset + 183, $act_cost78, value);
	}
	
	/**
	 * 実際原価７８. Actual cost 78.<p>
	 *
	 */
	public void act_cost78(int value) {
		setConstNumber(offset + 183, $act_cost78, value);
	}
	
	/**
	 * 実際原価７８. Actual cost 78.<p>
	 *
	 */
	public void act_cost78(long value) {
		setConstNumber(offset + 183, $act_cost78, value);
	}
	
	/**
	 * 実際原価７８. Actual cost 78.<p>
	 *
	 */
	public void act_cost78(float value) {
		setConstNumber(offset + 183, $act_cost78, value);
	}
	
	/**
	 * 実際原価７８. Actual cost 78.<p>
	 *
	 */
	public void act_cost78(double value) {
		setConstNumber(offset + 183, $act_cost78, value);
	}
	
	/**
	 * 実際原価７９. Actual cost 79.<p>
	 *
	 */
	public MCNumber act_cost79() {
		return getConstNumber(offset + 184, $act_cost79);
	}

	/**
	 * 実際原価７９. Actual cost 79.<p>
	 *
	 */
	public void act_cost79(MCNumber value) {
		setConstNumber(offset + 184, $act_cost79, value);
	}
	
	/**
	 * 実際原価７９. Actual cost 79.<p>
	 *
	 */
	public void act_cost79(int value) {
		setConstNumber(offset + 184, $act_cost79, value);
	}
	
	/**
	 * 実際原価７９. Actual cost 79.<p>
	 *
	 */
	public void act_cost79(long value) {
		setConstNumber(offset + 184, $act_cost79, value);
	}
	
	/**
	 * 実際原価７９. Actual cost 79.<p>
	 *
	 */
	public void act_cost79(float value) {
		setConstNumber(offset + 184, $act_cost79, value);
	}
	
	/**
	 * 実際原価７９. Actual cost 79.<p>
	 *
	 */
	public void act_cost79(double value) {
		setConstNumber(offset + 184, $act_cost79, value);
	}
	
	/**
	 * 実際原価８０. Actual cost 80.<p>
	 *
	 */
	public MCNumber act_cost80() {
		return getConstNumber(offset + 185, $act_cost80);
	}

	/**
	 * 実際原価８０. Actual cost 80.<p>
	 *
	 */
	public void act_cost80(MCNumber value) {
		setConstNumber(offset + 185, $act_cost80, value);
	}
	
	/**
	 * 実際原価８０. Actual cost 80.<p>
	 *
	 */
	public void act_cost80(int value) {
		setConstNumber(offset + 185, $act_cost80, value);
	}
	
	/**
	 * 実際原価８０. Actual cost 80.<p>
	 *
	 */
	public void act_cost80(long value) {
		setConstNumber(offset + 185, $act_cost80, value);
	}
	
	/**
	 * 実際原価８０. Actual cost 80.<p>
	 *
	 */
	public void act_cost80(float value) {
		setConstNumber(offset + 185, $act_cost80, value);
	}
	
	/**
	 * 実際原価８０. Actual cost 80.<p>
	 *
	 */
	public void act_cost80(double value) {
		setConstNumber(offset + 185, $act_cost80, value);
	}
	
	/**
	 * 実際原価８１. Actual cost 81.<p>
	 *
	 */
	public MCNumber act_cost81() {
		return getConstNumber(offset + 186, $act_cost81);
	}

	/**
	 * 実際原価８１. Actual cost 81.<p>
	 *
	 */
	public void act_cost81(MCNumber value) {
		setConstNumber(offset + 186, $act_cost81, value);
	}
	
	/**
	 * 実際原価８１. Actual cost 81.<p>
	 *
	 */
	public void act_cost81(int value) {
		setConstNumber(offset + 186, $act_cost81, value);
	}
	
	/**
	 * 実際原価８１. Actual cost 81.<p>
	 *
	 */
	public void act_cost81(long value) {
		setConstNumber(offset + 186, $act_cost81, value);
	}
	
	/**
	 * 実際原価８１. Actual cost 81.<p>
	 *
	 */
	public void act_cost81(float value) {
		setConstNumber(offset + 186, $act_cost81, value);
	}
	
	/**
	 * 実際原価８１. Actual cost 81.<p>
	 *
	 */
	public void act_cost81(double value) {
		setConstNumber(offset + 186, $act_cost81, value);
	}
	
	/**
	 * 実際原価８２. Actual cost 82.<p>
	 *
	 */
	public MCNumber act_cost82() {
		return getConstNumber(offset + 187, $act_cost82);
	}

	/**
	 * 実際原価８２. Actual cost 82.<p>
	 *
	 */
	public void act_cost82(MCNumber value) {
		setConstNumber(offset + 187, $act_cost82, value);
	}
	
	/**
	 * 実際原価８２. Actual cost 82.<p>
	 *
	 */
	public void act_cost82(int value) {
		setConstNumber(offset + 187, $act_cost82, value);
	}
	
	/**
	 * 実際原価８２. Actual cost 82.<p>
	 *
	 */
	public void act_cost82(long value) {
		setConstNumber(offset + 187, $act_cost82, value);
	}
	
	/**
	 * 実際原価８２. Actual cost 82.<p>
	 *
	 */
	public void act_cost82(float value) {
		setConstNumber(offset + 187, $act_cost82, value);
	}
	
	/**
	 * 実際原価８２. Actual cost 82.<p>
	 *
	 */
	public void act_cost82(double value) {
		setConstNumber(offset + 187, $act_cost82, value);
	}
	
	/**
	 * 実際原価８３. Actual cost 83.<p>
	 *
	 */
	public MCNumber act_cost83() {
		return getConstNumber(offset + 188, $act_cost83);
	}

	/**
	 * 実際原価８３. Actual cost 83.<p>
	 *
	 */
	public void act_cost83(MCNumber value) {
		setConstNumber(offset + 188, $act_cost83, value);
	}
	
	/**
	 * 実際原価８３. Actual cost 83.<p>
	 *
	 */
	public void act_cost83(int value) {
		setConstNumber(offset + 188, $act_cost83, value);
	}
	
	/**
	 * 実際原価８３. Actual cost 83.<p>
	 *
	 */
	public void act_cost83(long value) {
		setConstNumber(offset + 188, $act_cost83, value);
	}
	
	/**
	 * 実際原価８３. Actual cost 83.<p>
	 *
	 */
	public void act_cost83(float value) {
		setConstNumber(offset + 188, $act_cost83, value);
	}
	
	/**
	 * 実際原価８３. Actual cost 83.<p>
	 *
	 */
	public void act_cost83(double value) {
		setConstNumber(offset + 188, $act_cost83, value);
	}
	
	/**
	 * 実際原価８４. Actual cost 84.<p>
	 *
	 */
	public MCNumber act_cost84() {
		return getConstNumber(offset + 189, $act_cost84);
	}

	/**
	 * 実際原価８４. Actual cost 84.<p>
	 *
	 */
	public void act_cost84(MCNumber value) {
		setConstNumber(offset + 189, $act_cost84, value);
	}
	
	/**
	 * 実際原価８４. Actual cost 84.<p>
	 *
	 */
	public void act_cost84(int value) {
		setConstNumber(offset + 189, $act_cost84, value);
	}
	
	/**
	 * 実際原価８４. Actual cost 84.<p>
	 *
	 */
	public void act_cost84(long value) {
		setConstNumber(offset + 189, $act_cost84, value);
	}
	
	/**
	 * 実際原価８４. Actual cost 84.<p>
	 *
	 */
	public void act_cost84(float value) {
		setConstNumber(offset + 189, $act_cost84, value);
	}
	
	/**
	 * 実際原価８４. Actual cost 84.<p>
	 *
	 */
	public void act_cost84(double value) {
		setConstNumber(offset + 189, $act_cost84, value);
	}
	
	/**
	 * 実際原価８５. Actual cost 85.<p>
	 *
	 */
	public MCNumber act_cost85() {
		return getConstNumber(offset + 190, $act_cost85);
	}

	/**
	 * 実際原価８５. Actual cost 85.<p>
	 *
	 */
	public void act_cost85(MCNumber value) {
		setConstNumber(offset + 190, $act_cost85, value);
	}
	
	/**
	 * 実際原価８５. Actual cost 85.<p>
	 *
	 */
	public void act_cost85(int value) {
		setConstNumber(offset + 190, $act_cost85, value);
	}
	
	/**
	 * 実際原価８５. Actual cost 85.<p>
	 *
	 */
	public void act_cost85(long value) {
		setConstNumber(offset + 190, $act_cost85, value);
	}
	
	/**
	 * 実際原価８５. Actual cost 85.<p>
	 *
	 */
	public void act_cost85(float value) {
		setConstNumber(offset + 190, $act_cost85, value);
	}
	
	/**
	 * 実際原価８５. Actual cost 85.<p>
	 *
	 */
	public void act_cost85(double value) {
		setConstNumber(offset + 190, $act_cost85, value);
	}
	
	/**
	 * 実際原価８６. Actual cost 86.<p>
	 *
	 */
	public MCNumber act_cost86() {
		return getConstNumber(offset + 191, $act_cost86);
	}

	/**
	 * 実際原価８６. Actual cost 86.<p>
	 *
	 */
	public void act_cost86(MCNumber value) {
		setConstNumber(offset + 191, $act_cost86, value);
	}
	
	/**
	 * 実際原価８６. Actual cost 86.<p>
	 *
	 */
	public void act_cost86(int value) {
		setConstNumber(offset + 191, $act_cost86, value);
	}
	
	/**
	 * 実際原価８６. Actual cost 86.<p>
	 *
	 */
	public void act_cost86(long value) {
		setConstNumber(offset + 191, $act_cost86, value);
	}
	
	/**
	 * 実際原価８６. Actual cost 86.<p>
	 *
	 */
	public void act_cost86(float value) {
		setConstNumber(offset + 191, $act_cost86, value);
	}
	
	/**
	 * 実際原価８６. Actual cost 86.<p>
	 *
	 */
	public void act_cost86(double value) {
		setConstNumber(offset + 191, $act_cost86, value);
	}
	
	/**
	 * 実際原価８７. Actual cost 87.<p>
	 *
	 */
	public MCNumber act_cost87() {
		return getConstNumber(offset + 192, $act_cost87);
	}

	/**
	 * 実際原価８７. Actual cost 87.<p>
	 *
	 */
	public void act_cost87(MCNumber value) {
		setConstNumber(offset + 192, $act_cost87, value);
	}
	
	/**
	 * 実際原価８７. Actual cost 87.<p>
	 *
	 */
	public void act_cost87(int value) {
		setConstNumber(offset + 192, $act_cost87, value);
	}
	
	/**
	 * 実際原価８７. Actual cost 87.<p>
	 *
	 */
	public void act_cost87(long value) {
		setConstNumber(offset + 192, $act_cost87, value);
	}
	
	/**
	 * 実際原価８７. Actual cost 87.<p>
	 *
	 */
	public void act_cost87(float value) {
		setConstNumber(offset + 192, $act_cost87, value);
	}
	
	/**
	 * 実際原価８７. Actual cost 87.<p>
	 *
	 */
	public void act_cost87(double value) {
		setConstNumber(offset + 192, $act_cost87, value);
	}
	
	/**
	 * 実際原価８８. Actual cost 88.<p>
	 *
	 */
	public MCNumber act_cost88() {
		return getConstNumber(offset + 193, $act_cost88);
	}

	/**
	 * 実際原価８８. Actual cost 88.<p>
	 *
	 */
	public void act_cost88(MCNumber value) {
		setConstNumber(offset + 193, $act_cost88, value);
	}
	
	/**
	 * 実際原価８８. Actual cost 88.<p>
	 *
	 */
	public void act_cost88(int value) {
		setConstNumber(offset + 193, $act_cost88, value);
	}
	
	/**
	 * 実際原価８８. Actual cost 88.<p>
	 *
	 */
	public void act_cost88(long value) {
		setConstNumber(offset + 193, $act_cost88, value);
	}
	
	/**
	 * 実際原価８８. Actual cost 88.<p>
	 *
	 */
	public void act_cost88(float value) {
		setConstNumber(offset + 193, $act_cost88, value);
	}
	
	/**
	 * 実際原価８８. Actual cost 88.<p>
	 *
	 */
	public void act_cost88(double value) {
		setConstNumber(offset + 193, $act_cost88, value);
	}
	
	/**
	 * 実際原価８９. Actual cost 89.<p>
	 *
	 */
	public MCNumber act_cost89() {
		return getConstNumber(offset + 194, $act_cost89);
	}

	/**
	 * 実際原価８９. Actual cost 89.<p>
	 *
	 */
	public void act_cost89(MCNumber value) {
		setConstNumber(offset + 194, $act_cost89, value);
	}
	
	/**
	 * 実際原価８９. Actual cost 89.<p>
	 *
	 */
	public void act_cost89(int value) {
		setConstNumber(offset + 194, $act_cost89, value);
	}
	
	/**
	 * 実際原価８９. Actual cost 89.<p>
	 *
	 */
	public void act_cost89(long value) {
		setConstNumber(offset + 194, $act_cost89, value);
	}
	
	/**
	 * 実際原価８９. Actual cost 89.<p>
	 *
	 */
	public void act_cost89(float value) {
		setConstNumber(offset + 194, $act_cost89, value);
	}
	
	/**
	 * 実際原価８９. Actual cost 89.<p>
	 *
	 */
	public void act_cost89(double value) {
		setConstNumber(offset + 194, $act_cost89, value);
	}
	
	/**
	 * 実際原価９０. Actual cost 90.<p>
	 *
	 */
	public MCNumber act_cost90() {
		return getConstNumber(offset + 195, $act_cost90);
	}

	/**
	 * 実際原価９０. Actual cost 90.<p>
	 *
	 */
	public void act_cost90(MCNumber value) {
		setConstNumber(offset + 195, $act_cost90, value);
	}
	
	/**
	 * 実際原価９０. Actual cost 90.<p>
	 *
	 */
	public void act_cost90(int value) {
		setConstNumber(offset + 195, $act_cost90, value);
	}
	
	/**
	 * 実際原価９０. Actual cost 90.<p>
	 *
	 */
	public void act_cost90(long value) {
		setConstNumber(offset + 195, $act_cost90, value);
	}
	
	/**
	 * 実際原価９０. Actual cost 90.<p>
	 *
	 */
	public void act_cost90(float value) {
		setConstNumber(offset + 195, $act_cost90, value);
	}
	
	/**
	 * 実際原価９０. Actual cost 90.<p>
	 *
	 */
	public void act_cost90(double value) {
		setConstNumber(offset + 195, $act_cost90, value);
	}
	
	/**
	 * 実際原価９１. Actual cost 91.<p>
	 *
	 */
	public MCNumber act_cost91() {
		return getConstNumber(offset + 196, $act_cost91);
	}

	/**
	 * 実際原価９１. Actual cost 91.<p>
	 *
	 */
	public void act_cost91(MCNumber value) {
		setConstNumber(offset + 196, $act_cost91, value);
	}
	
	/**
	 * 実際原価９１. Actual cost 91.<p>
	 *
	 */
	public void act_cost91(int value) {
		setConstNumber(offset + 196, $act_cost91, value);
	}
	
	/**
	 * 実際原価９１. Actual cost 91.<p>
	 *
	 */
	public void act_cost91(long value) {
		setConstNumber(offset + 196, $act_cost91, value);
	}
	
	/**
	 * 実際原価９１. Actual cost 91.<p>
	 *
	 */
	public void act_cost91(float value) {
		setConstNumber(offset + 196, $act_cost91, value);
	}
	
	/**
	 * 実際原価９１. Actual cost 91.<p>
	 *
	 */
	public void act_cost91(double value) {
		setConstNumber(offset + 196, $act_cost91, value);
	}
	
	/**
	 * 実際原価９２. Actual cost 92.<p>
	 *
	 */
	public MCNumber act_cost92() {
		return getConstNumber(offset + 197, $act_cost92);
	}

	/**
	 * 実際原価９２. Actual cost 92.<p>
	 *
	 */
	public void act_cost92(MCNumber value) {
		setConstNumber(offset + 197, $act_cost92, value);
	}
	
	/**
	 * 実際原価９２. Actual cost 92.<p>
	 *
	 */
	public void act_cost92(int value) {
		setConstNumber(offset + 197, $act_cost92, value);
	}
	
	/**
	 * 実際原価９２. Actual cost 92.<p>
	 *
	 */
	public void act_cost92(long value) {
		setConstNumber(offset + 197, $act_cost92, value);
	}
	
	/**
	 * 実際原価９２. Actual cost 92.<p>
	 *
	 */
	public void act_cost92(float value) {
		setConstNumber(offset + 197, $act_cost92, value);
	}
	
	/**
	 * 実際原価９２. Actual cost 92.<p>
	 *
	 */
	public void act_cost92(double value) {
		setConstNumber(offset + 197, $act_cost92, value);
	}
	
	/**
	 * 実際原価９３. Actual cost 93.<p>
	 *
	 */
	public MCNumber act_cost93() {
		return getConstNumber(offset + 198, $act_cost93);
	}

	/**
	 * 実際原価９３. Actual cost 93.<p>
	 *
	 */
	public void act_cost93(MCNumber value) {
		setConstNumber(offset + 198, $act_cost93, value);
	}
	
	/**
	 * 実際原価９３. Actual cost 93.<p>
	 *
	 */
	public void act_cost93(int value) {
		setConstNumber(offset + 198, $act_cost93, value);
	}
	
	/**
	 * 実際原価９３. Actual cost 93.<p>
	 *
	 */
	public void act_cost93(long value) {
		setConstNumber(offset + 198, $act_cost93, value);
	}
	
	/**
	 * 実際原価９３. Actual cost 93.<p>
	 *
	 */
	public void act_cost93(float value) {
		setConstNumber(offset + 198, $act_cost93, value);
	}
	
	/**
	 * 実際原価９３. Actual cost 93.<p>
	 *
	 */
	public void act_cost93(double value) {
		setConstNumber(offset + 198, $act_cost93, value);
	}
	
	/**
	 * 実際原価９４. Actual cost 94.<p>
	 *
	 */
	public MCNumber act_cost94() {
		return getConstNumber(offset + 199, $act_cost94);
	}

	/**
	 * 実際原価９４. Actual cost 94.<p>
	 *
	 */
	public void act_cost94(MCNumber value) {
		setConstNumber(offset + 199, $act_cost94, value);
	}
	
	/**
	 * 実際原価９４. Actual cost 94.<p>
	 *
	 */
	public void act_cost94(int value) {
		setConstNumber(offset + 199, $act_cost94, value);
	}
	
	/**
	 * 実際原価９４. Actual cost 94.<p>
	 *
	 */
	public void act_cost94(long value) {
		setConstNumber(offset + 199, $act_cost94, value);
	}
	
	/**
	 * 実際原価９４. Actual cost 94.<p>
	 *
	 */
	public void act_cost94(float value) {
		setConstNumber(offset + 199, $act_cost94, value);
	}
	
	/**
	 * 実際原価９４. Actual cost 94.<p>
	 *
	 */
	public void act_cost94(double value) {
		setConstNumber(offset + 199, $act_cost94, value);
	}
	
	/**
	 * 実際原価９５. Actual cost 95.<p>
	 *
	 */
	public MCNumber act_cost95() {
		return getConstNumber(offset + 200, $act_cost95);
	}

	/**
	 * 実際原価９５. Actual cost 95.<p>
	 *
	 */
	public void act_cost95(MCNumber value) {
		setConstNumber(offset + 200, $act_cost95, value);
	}
	
	/**
	 * 実際原価９５. Actual cost 95.<p>
	 *
	 */
	public void act_cost95(int value) {
		setConstNumber(offset + 200, $act_cost95, value);
	}
	
	/**
	 * 実際原価９５. Actual cost 95.<p>
	 *
	 */
	public void act_cost95(long value) {
		setConstNumber(offset + 200, $act_cost95, value);
	}
	
	/**
	 * 実際原価９５. Actual cost 95.<p>
	 *
	 */
	public void act_cost95(float value) {
		setConstNumber(offset + 200, $act_cost95, value);
	}
	
	/**
	 * 実際原価９５. Actual cost 95.<p>
	 *
	 */
	public void act_cost95(double value) {
		setConstNumber(offset + 200, $act_cost95, value);
	}
	
	/**
	 * 実際原価９６. Actual cost 96.<p>
	 *
	 */
	public MCNumber act_cost96() {
		return getConstNumber(offset + 201, $act_cost96);
	}

	/**
	 * 実際原価９６. Actual cost 96.<p>
	 *
	 */
	public void act_cost96(MCNumber value) {
		setConstNumber(offset + 201, $act_cost96, value);
	}
	
	/**
	 * 実際原価９６. Actual cost 96.<p>
	 *
	 */
	public void act_cost96(int value) {
		setConstNumber(offset + 201, $act_cost96, value);
	}
	
	/**
	 * 実際原価９６. Actual cost 96.<p>
	 *
	 */
	public void act_cost96(long value) {
		setConstNumber(offset + 201, $act_cost96, value);
	}
	
	/**
	 * 実際原価９６. Actual cost 96.<p>
	 *
	 */
	public void act_cost96(float value) {
		setConstNumber(offset + 201, $act_cost96, value);
	}
	
	/**
	 * 実際原価９６. Actual cost 96.<p>
	 *
	 */
	public void act_cost96(double value) {
		setConstNumber(offset + 201, $act_cost96, value);
	}
	
	/**
	 * 実際原価９７. Actual cost 97.<p>
	 *
	 */
	public MCNumber act_cost97() {
		return getConstNumber(offset + 202, $act_cost97);
	}

	/**
	 * 実際原価９７. Actual cost 97.<p>
	 *
	 */
	public void act_cost97(MCNumber value) {
		setConstNumber(offset + 202, $act_cost97, value);
	}
	
	/**
	 * 実際原価９７. Actual cost 97.<p>
	 *
	 */
	public void act_cost97(int value) {
		setConstNumber(offset + 202, $act_cost97, value);
	}
	
	/**
	 * 実際原価９７. Actual cost 97.<p>
	 *
	 */
	public void act_cost97(long value) {
		setConstNumber(offset + 202, $act_cost97, value);
	}
	
	/**
	 * 実際原価９７. Actual cost 97.<p>
	 *
	 */
	public void act_cost97(float value) {
		setConstNumber(offset + 202, $act_cost97, value);
	}
	
	/**
	 * 実際原価９７. Actual cost 97.<p>
	 *
	 */
	public void act_cost97(double value) {
		setConstNumber(offset + 202, $act_cost97, value);
	}
	
	/**
	 * 実際原価９８. Actual cost 98.<p>
	 *
	 */
	public MCNumber act_cost98() {
		return getConstNumber(offset + 203, $act_cost98);
	}

	/**
	 * 実際原価９８. Actual cost 98.<p>
	 *
	 */
	public void act_cost98(MCNumber value) {
		setConstNumber(offset + 203, $act_cost98, value);
	}
	
	/**
	 * 実際原価９８. Actual cost 98.<p>
	 *
	 */
	public void act_cost98(int value) {
		setConstNumber(offset + 203, $act_cost98, value);
	}
	
	/**
	 * 実際原価９８. Actual cost 98.<p>
	 *
	 */
	public void act_cost98(long value) {
		setConstNumber(offset + 203, $act_cost98, value);
	}
	
	/**
	 * 実際原価９８. Actual cost 98.<p>
	 *
	 */
	public void act_cost98(float value) {
		setConstNumber(offset + 203, $act_cost98, value);
	}
	
	/**
	 * 実際原価９８. Actual cost 98.<p>
	 *
	 */
	public void act_cost98(double value) {
		setConstNumber(offset + 203, $act_cost98, value);
	}
	
	/**
	 * 実際原価９９. Actual cost 99.<p>
	 *
	 */
	public MCNumber act_cost99() {
		return getConstNumber(offset + 204, $act_cost99);
	}

	/**
	 * 実際原価９９. Actual cost 99.<p>
	 *
	 */
	public void act_cost99(MCNumber value) {
		setConstNumber(offset + 204, $act_cost99, value);
	}
	
	/**
	 * 実際原価９９. Actual cost 99.<p>
	 *
	 */
	public void act_cost99(int value) {
		setConstNumber(offset + 204, $act_cost99, value);
	}
	
	/**
	 * 実際原価９９. Actual cost 99.<p>
	 *
	 */
	public void act_cost99(long value) {
		setConstNumber(offset + 204, $act_cost99, value);
	}
	
	/**
	 * 実際原価９９. Actual cost 99.<p>
	 *
	 */
	public void act_cost99(float value) {
		setConstNumber(offset + 204, $act_cost99, value);
	}
	
	/**
	 * 実際原価９９. Actual cost 99.<p>
	 *
	 */
	public void act_cost99(double value) {
		setConstNumber(offset + 204, $act_cost99, value);
	}
	
	/**
	 * 実際原価１００. Actual cost 100.<p>
	 *
	 */
	public MCNumber act_cost100() {
		return getConstNumber(offset + 205, $act_cost100);
	}

	/**
	 * 実際原価１００. Actual cost 100.<p>
	 *
	 */
	public void act_cost100(MCNumber value) {
		setConstNumber(offset + 205, $act_cost100, value);
	}
	
	/**
	 * 実際原価１００. Actual cost 100.<p>
	 *
	 */
	public void act_cost100(int value) {
		setConstNumber(offset + 205, $act_cost100, value);
	}
	
	/**
	 * 実際原価１００. Actual cost 100.<p>
	 *
	 */
	public void act_cost100(long value) {
		setConstNumber(offset + 205, $act_cost100, value);
	}
	
	/**
	 * 実際原価１００. Actual cost 100.<p>
	 *
	 */
	public void act_cost100(float value) {
		setConstNumber(offset + 205, $act_cost100, value);
	}
	
	/**
	 * 実際原価１００. Actual cost 100.<p>
	 *
	 */
	public void act_cost100(double value) {
		setConstNumber(offset + 205, $act_cost100, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public MCNumber std_cost() {
		return getConstNumber(offset + 206, $std_cost);
	}

	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(MCNumber value) {
		setConstNumber(offset + 206, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(int value) {
		setConstNumber(offset + 206, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(long value) {
		setConstNumber(offset + 206, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(float value) {
		setConstNumber(offset + 206, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(double value) {
		setConstNumber(offset + 206, $std_cost, value);
	}
	
	/**
	 * 標準原価１. Standard cost 1.<p>
	 *
	 */
	public MCNumber std_cost1() {
		return getConstNumber(offset + 207, $std_cost1);
	}

	/**
	 * 標準原価１. Standard cost 1.<p>
	 *
	 */
	public void std_cost1(MCNumber value) {
		setConstNumber(offset + 207, $std_cost1, value);
	}
	
	/**
	 * 標準原価１. Standard cost 1.<p>
	 *
	 */
	public void std_cost1(int value) {
		setConstNumber(offset + 207, $std_cost1, value);
	}
	
	/**
	 * 標準原価１. Standard cost 1.<p>
	 *
	 */
	public void std_cost1(long value) {
		setConstNumber(offset + 207, $std_cost1, value);
	}
	
	/**
	 * 標準原価１. Standard cost 1.<p>
	 *
	 */
	public void std_cost1(float value) {
		setConstNumber(offset + 207, $std_cost1, value);
	}
	
	/**
	 * 標準原価１. Standard cost 1.<p>
	 *
	 */
	public void std_cost1(double value) {
		setConstNumber(offset + 207, $std_cost1, value);
	}
	
	/**
	 * 標準原価２. Standard cost 2.<p>
	 *
	 */
	public MCNumber std_cost2() {
		return getConstNumber(offset + 208, $std_cost2);
	}

	/**
	 * 標準原価２. Standard cost 2.<p>
	 *
	 */
	public void std_cost2(MCNumber value) {
		setConstNumber(offset + 208, $std_cost2, value);
	}
	
	/**
	 * 標準原価２. Standard cost 2.<p>
	 *
	 */
	public void std_cost2(int value) {
		setConstNumber(offset + 208, $std_cost2, value);
	}
	
	/**
	 * 標準原価２. Standard cost 2.<p>
	 *
	 */
	public void std_cost2(long value) {
		setConstNumber(offset + 208, $std_cost2, value);
	}
	
	/**
	 * 標準原価２. Standard cost 2.<p>
	 *
	 */
	public void std_cost2(float value) {
		setConstNumber(offset + 208, $std_cost2, value);
	}
	
	/**
	 * 標準原価２. Standard cost 2.<p>
	 *
	 */
	public void std_cost2(double value) {
		setConstNumber(offset + 208, $std_cost2, value);
	}
	
	/**
	 * 標準原価３. Standard cost 3.<p>
	 *
	 */
	public MCNumber std_cost3() {
		return getConstNumber(offset + 209, $std_cost3);
	}

	/**
	 * 標準原価３. Standard cost 3.<p>
	 *
	 */
	public void std_cost3(MCNumber value) {
		setConstNumber(offset + 209, $std_cost3, value);
	}
	
	/**
	 * 標準原価３. Standard cost 3.<p>
	 *
	 */
	public void std_cost3(int value) {
		setConstNumber(offset + 209, $std_cost3, value);
	}
	
	/**
	 * 標準原価３. Standard cost 3.<p>
	 *
	 */
	public void std_cost3(long value) {
		setConstNumber(offset + 209, $std_cost3, value);
	}
	
	/**
	 * 標準原価３. Standard cost 3.<p>
	 *
	 */
	public void std_cost3(float value) {
		setConstNumber(offset + 209, $std_cost3, value);
	}
	
	/**
	 * 標準原価３. Standard cost 3.<p>
	 *
	 */
	public void std_cost3(double value) {
		setConstNumber(offset + 209, $std_cost3, value);
	}
	
	/**
	 * 標準原価４. Standard cost 4.<p>
	 *
	 */
	public MCNumber std_cost4() {
		return getConstNumber(offset + 210, $std_cost4);
	}

	/**
	 * 標準原価４. Standard cost 4.<p>
	 *
	 */
	public void std_cost4(MCNumber value) {
		setConstNumber(offset + 210, $std_cost4, value);
	}
	
	/**
	 * 標準原価４. Standard cost 4.<p>
	 *
	 */
	public void std_cost4(int value) {
		setConstNumber(offset + 210, $std_cost4, value);
	}
	
	/**
	 * 標準原価４. Standard cost 4.<p>
	 *
	 */
	public void std_cost4(long value) {
		setConstNumber(offset + 210, $std_cost4, value);
	}
	
	/**
	 * 標準原価４. Standard cost 4.<p>
	 *
	 */
	public void std_cost4(float value) {
		setConstNumber(offset + 210, $std_cost4, value);
	}
	
	/**
	 * 標準原価４. Standard cost 4.<p>
	 *
	 */
	public void std_cost4(double value) {
		setConstNumber(offset + 210, $std_cost4, value);
	}
	
	/**
	 * 標準原価５. Standard cost 5.<p>
	 *
	 */
	public MCNumber std_cost5() {
		return getConstNumber(offset + 211, $std_cost5);
	}

	/**
	 * 標準原価５. Standard cost 5.<p>
	 *
	 */
	public void std_cost5(MCNumber value) {
		setConstNumber(offset + 211, $std_cost5, value);
	}
	
	/**
	 * 標準原価５. Standard cost 5.<p>
	 *
	 */
	public void std_cost5(int value) {
		setConstNumber(offset + 211, $std_cost5, value);
	}
	
	/**
	 * 標準原価５. Standard cost 5.<p>
	 *
	 */
	public void std_cost5(long value) {
		setConstNumber(offset + 211, $std_cost5, value);
	}
	
	/**
	 * 標準原価５. Standard cost 5.<p>
	 *
	 */
	public void std_cost5(float value) {
		setConstNumber(offset + 211, $std_cost5, value);
	}
	
	/**
	 * 標準原価５. Standard cost 5.<p>
	 *
	 */
	public void std_cost5(double value) {
		setConstNumber(offset + 211, $std_cost5, value);
	}
	
	/**
	 * 標準原価６. Standard cost 6.<p>
	 *
	 */
	public MCNumber std_cost6() {
		return getConstNumber(offset + 212, $std_cost6);
	}

	/**
	 * 標準原価６. Standard cost 6.<p>
	 *
	 */
	public void std_cost6(MCNumber value) {
		setConstNumber(offset + 212, $std_cost6, value);
	}
	
	/**
	 * 標準原価６. Standard cost 6.<p>
	 *
	 */
	public void std_cost6(int value) {
		setConstNumber(offset + 212, $std_cost6, value);
	}
	
	/**
	 * 標準原価６. Standard cost 6.<p>
	 *
	 */
	public void std_cost6(long value) {
		setConstNumber(offset + 212, $std_cost6, value);
	}
	
	/**
	 * 標準原価６. Standard cost 6.<p>
	 *
	 */
	public void std_cost6(float value) {
		setConstNumber(offset + 212, $std_cost6, value);
	}
	
	/**
	 * 標準原価６. Standard cost 6.<p>
	 *
	 */
	public void std_cost6(double value) {
		setConstNumber(offset + 212, $std_cost6, value);
	}
	
	/**
	 * 標準原価７. Standard cost 7.<p>
	 *
	 */
	public MCNumber std_cost7() {
		return getConstNumber(offset + 213, $std_cost7);
	}

	/**
	 * 標準原価７. Standard cost 7.<p>
	 *
	 */
	public void std_cost7(MCNumber value) {
		setConstNumber(offset + 213, $std_cost7, value);
	}
	
	/**
	 * 標準原価７. Standard cost 7.<p>
	 *
	 */
	public void std_cost7(int value) {
		setConstNumber(offset + 213, $std_cost7, value);
	}
	
	/**
	 * 標準原価７. Standard cost 7.<p>
	 *
	 */
	public void std_cost7(long value) {
		setConstNumber(offset + 213, $std_cost7, value);
	}
	
	/**
	 * 標準原価７. Standard cost 7.<p>
	 *
	 */
	public void std_cost7(float value) {
		setConstNumber(offset + 213, $std_cost7, value);
	}
	
	/**
	 * 標準原価７. Standard cost 7.<p>
	 *
	 */
	public void std_cost7(double value) {
		setConstNumber(offset + 213, $std_cost7, value);
	}
	
	/**
	 * 標準原価８. Standard cost 8.<p>
	 *
	 */
	public MCNumber std_cost8() {
		return getConstNumber(offset + 214, $std_cost8);
	}

	/**
	 * 標準原価８. Standard cost 8.<p>
	 *
	 */
	public void std_cost8(MCNumber value) {
		setConstNumber(offset + 214, $std_cost8, value);
	}
	
	/**
	 * 標準原価８. Standard cost 8.<p>
	 *
	 */
	public void std_cost8(int value) {
		setConstNumber(offset + 214, $std_cost8, value);
	}
	
	/**
	 * 標準原価８. Standard cost 8.<p>
	 *
	 */
	public void std_cost8(long value) {
		setConstNumber(offset + 214, $std_cost8, value);
	}
	
	/**
	 * 標準原価８. Standard cost 8.<p>
	 *
	 */
	public void std_cost8(float value) {
		setConstNumber(offset + 214, $std_cost8, value);
	}
	
	/**
	 * 標準原価８. Standard cost 8.<p>
	 *
	 */
	public void std_cost8(double value) {
		setConstNumber(offset + 214, $std_cost8, value);
	}
	
	/**
	 * 標準原価９. Standard cost 9.<p>
	 *
	 */
	public MCNumber std_cost9() {
		return getConstNumber(offset + 215, $std_cost9);
	}

	/**
	 * 標準原価９. Standard cost 9.<p>
	 *
	 */
	public void std_cost9(MCNumber value) {
		setConstNumber(offset + 215, $std_cost9, value);
	}
	
	/**
	 * 標準原価９. Standard cost 9.<p>
	 *
	 */
	public void std_cost9(int value) {
		setConstNumber(offset + 215, $std_cost9, value);
	}
	
	/**
	 * 標準原価９. Standard cost 9.<p>
	 *
	 */
	public void std_cost9(long value) {
		setConstNumber(offset + 215, $std_cost9, value);
	}
	
	/**
	 * 標準原価９. Standard cost 9.<p>
	 *
	 */
	public void std_cost9(float value) {
		setConstNumber(offset + 215, $std_cost9, value);
	}
	
	/**
	 * 標準原価９. Standard cost 9.<p>
	 *
	 */
	public void std_cost9(double value) {
		setConstNumber(offset + 215, $std_cost9, value);
	}
	
	/**
	 * 標準原価１０. Standard cost 10.<p>
	 *
	 */
	public MCNumber std_cost10() {
		return getConstNumber(offset + 216, $std_cost10);
	}

	/**
	 * 標準原価１０. Standard cost 10.<p>
	 *
	 */
	public void std_cost10(MCNumber value) {
		setConstNumber(offset + 216, $std_cost10, value);
	}
	
	/**
	 * 標準原価１０. Standard cost 10.<p>
	 *
	 */
	public void std_cost10(int value) {
		setConstNumber(offset + 216, $std_cost10, value);
	}
	
	/**
	 * 標準原価１０. Standard cost 10.<p>
	 *
	 */
	public void std_cost10(long value) {
		setConstNumber(offset + 216, $std_cost10, value);
	}
	
	/**
	 * 標準原価１０. Standard cost 10.<p>
	 *
	 */
	public void std_cost10(float value) {
		setConstNumber(offset + 216, $std_cost10, value);
	}
	
	/**
	 * 標準原価１０. Standard cost 10.<p>
	 *
	 */
	public void std_cost10(double value) {
		setConstNumber(offset + 216, $std_cost10, value);
	}
	
	/**
	 * 標準原価１１. Standard cost 11.<p>
	 *
	 */
	public MCNumber std_cost11() {
		return getConstNumber(offset + 217, $std_cost11);
	}

	/**
	 * 標準原価１１. Standard cost 11.<p>
	 *
	 */
	public void std_cost11(MCNumber value) {
		setConstNumber(offset + 217, $std_cost11, value);
	}
	
	/**
	 * 標準原価１１. Standard cost 11.<p>
	 *
	 */
	public void std_cost11(int value) {
		setConstNumber(offset + 217, $std_cost11, value);
	}
	
	/**
	 * 標準原価１１. Standard cost 11.<p>
	 *
	 */
	public void std_cost11(long value) {
		setConstNumber(offset + 217, $std_cost11, value);
	}
	
	/**
	 * 標準原価１１. Standard cost 11.<p>
	 *
	 */
	public void std_cost11(float value) {
		setConstNumber(offset + 217, $std_cost11, value);
	}
	
	/**
	 * 標準原価１１. Standard cost 11.<p>
	 *
	 */
	public void std_cost11(double value) {
		setConstNumber(offset + 217, $std_cost11, value);
	}
	
	/**
	 * 標準原価１２. Standard cost 12.<p>
	 *
	 */
	public MCNumber std_cost12() {
		return getConstNumber(offset + 218, $std_cost12);
	}

	/**
	 * 標準原価１２. Standard cost 12.<p>
	 *
	 */
	public void std_cost12(MCNumber value) {
		setConstNumber(offset + 218, $std_cost12, value);
	}
	
	/**
	 * 標準原価１２. Standard cost 12.<p>
	 *
	 */
	public void std_cost12(int value) {
		setConstNumber(offset + 218, $std_cost12, value);
	}
	
	/**
	 * 標準原価１２. Standard cost 12.<p>
	 *
	 */
	public void std_cost12(long value) {
		setConstNumber(offset + 218, $std_cost12, value);
	}
	
	/**
	 * 標準原価１２. Standard cost 12.<p>
	 *
	 */
	public void std_cost12(float value) {
		setConstNumber(offset + 218, $std_cost12, value);
	}
	
	/**
	 * 標準原価１２. Standard cost 12.<p>
	 *
	 */
	public void std_cost12(double value) {
		setConstNumber(offset + 218, $std_cost12, value);
	}
	
	/**
	 * 標準原価１３. Standard cost 13.<p>
	 *
	 */
	public MCNumber std_cost13() {
		return getConstNumber(offset + 219, $std_cost13);
	}

	/**
	 * 標準原価１３. Standard cost 13.<p>
	 *
	 */
	public void std_cost13(MCNumber value) {
		setConstNumber(offset + 219, $std_cost13, value);
	}
	
	/**
	 * 標準原価１３. Standard cost 13.<p>
	 *
	 */
	public void std_cost13(int value) {
		setConstNumber(offset + 219, $std_cost13, value);
	}
	
	/**
	 * 標準原価１３. Standard cost 13.<p>
	 *
	 */
	public void std_cost13(long value) {
		setConstNumber(offset + 219, $std_cost13, value);
	}
	
	/**
	 * 標準原価１３. Standard cost 13.<p>
	 *
	 */
	public void std_cost13(float value) {
		setConstNumber(offset + 219, $std_cost13, value);
	}
	
	/**
	 * 標準原価１３. Standard cost 13.<p>
	 *
	 */
	public void std_cost13(double value) {
		setConstNumber(offset + 219, $std_cost13, value);
	}
	
	/**
	 * 標準原価１４. Standard cost 14.<p>
	 *
	 */
	public MCNumber std_cost14() {
		return getConstNumber(offset + 220, $std_cost14);
	}

	/**
	 * 標準原価１４. Standard cost 14.<p>
	 *
	 */
	public void std_cost14(MCNumber value) {
		setConstNumber(offset + 220, $std_cost14, value);
	}
	
	/**
	 * 標準原価１４. Standard cost 14.<p>
	 *
	 */
	public void std_cost14(int value) {
		setConstNumber(offset + 220, $std_cost14, value);
	}
	
	/**
	 * 標準原価１４. Standard cost 14.<p>
	 *
	 */
	public void std_cost14(long value) {
		setConstNumber(offset + 220, $std_cost14, value);
	}
	
	/**
	 * 標準原価１４. Standard cost 14.<p>
	 *
	 */
	public void std_cost14(float value) {
		setConstNumber(offset + 220, $std_cost14, value);
	}
	
	/**
	 * 標準原価１４. Standard cost 14.<p>
	 *
	 */
	public void std_cost14(double value) {
		setConstNumber(offset + 220, $std_cost14, value);
	}
	
	/**
	 * 標準原価１５. Standard cost 15.<p>
	 *
	 */
	public MCNumber std_cost15() {
		return getConstNumber(offset + 221, $std_cost15);
	}

	/**
	 * 標準原価１５. Standard cost 15.<p>
	 *
	 */
	public void std_cost15(MCNumber value) {
		setConstNumber(offset + 221, $std_cost15, value);
	}
	
	/**
	 * 標準原価１５. Standard cost 15.<p>
	 *
	 */
	public void std_cost15(int value) {
		setConstNumber(offset + 221, $std_cost15, value);
	}
	
	/**
	 * 標準原価１５. Standard cost 15.<p>
	 *
	 */
	public void std_cost15(long value) {
		setConstNumber(offset + 221, $std_cost15, value);
	}
	
	/**
	 * 標準原価１５. Standard cost 15.<p>
	 *
	 */
	public void std_cost15(float value) {
		setConstNumber(offset + 221, $std_cost15, value);
	}
	
	/**
	 * 標準原価１５. Standard cost 15.<p>
	 *
	 */
	public void std_cost15(double value) {
		setConstNumber(offset + 221, $std_cost15, value);
	}
	
	/**
	 * 標準原価１６. Standard cost 16.<p>
	 *
	 */
	public MCNumber std_cost16() {
		return getConstNumber(offset + 222, $std_cost16);
	}

	/**
	 * 標準原価１６. Standard cost 16.<p>
	 *
	 */
	public void std_cost16(MCNumber value) {
		setConstNumber(offset + 222, $std_cost16, value);
	}
	
	/**
	 * 標準原価１６. Standard cost 16.<p>
	 *
	 */
	public void std_cost16(int value) {
		setConstNumber(offset + 222, $std_cost16, value);
	}
	
	/**
	 * 標準原価１６. Standard cost 16.<p>
	 *
	 */
	public void std_cost16(long value) {
		setConstNumber(offset + 222, $std_cost16, value);
	}
	
	/**
	 * 標準原価１６. Standard cost 16.<p>
	 *
	 */
	public void std_cost16(float value) {
		setConstNumber(offset + 222, $std_cost16, value);
	}
	
	/**
	 * 標準原価１６. Standard cost 16.<p>
	 *
	 */
	public void std_cost16(double value) {
		setConstNumber(offset + 222, $std_cost16, value);
	}
	
	/**
	 * 標準原価１７. Standard cost 17.<p>
	 *
	 */
	public MCNumber std_cost17() {
		return getConstNumber(offset + 223, $std_cost17);
	}

	/**
	 * 標準原価１７. Standard cost 17.<p>
	 *
	 */
	public void std_cost17(MCNumber value) {
		setConstNumber(offset + 223, $std_cost17, value);
	}
	
	/**
	 * 標準原価１７. Standard cost 17.<p>
	 *
	 */
	public void std_cost17(int value) {
		setConstNumber(offset + 223, $std_cost17, value);
	}
	
	/**
	 * 標準原価１７. Standard cost 17.<p>
	 *
	 */
	public void std_cost17(long value) {
		setConstNumber(offset + 223, $std_cost17, value);
	}
	
	/**
	 * 標準原価１７. Standard cost 17.<p>
	 *
	 */
	public void std_cost17(float value) {
		setConstNumber(offset + 223, $std_cost17, value);
	}
	
	/**
	 * 標準原価１７. Standard cost 17.<p>
	 *
	 */
	public void std_cost17(double value) {
		setConstNumber(offset + 223, $std_cost17, value);
	}
	
	/**
	 * 標準原価１８. Standard cost 18.<p>
	 *
	 */
	public MCNumber std_cost18() {
		return getConstNumber(offset + 224, $std_cost18);
	}

	/**
	 * 標準原価１８. Standard cost 18.<p>
	 *
	 */
	public void std_cost18(MCNumber value) {
		setConstNumber(offset + 224, $std_cost18, value);
	}
	
	/**
	 * 標準原価１８. Standard cost 18.<p>
	 *
	 */
	public void std_cost18(int value) {
		setConstNumber(offset + 224, $std_cost18, value);
	}
	
	/**
	 * 標準原価１８. Standard cost 18.<p>
	 *
	 */
	public void std_cost18(long value) {
		setConstNumber(offset + 224, $std_cost18, value);
	}
	
	/**
	 * 標準原価１８. Standard cost 18.<p>
	 *
	 */
	public void std_cost18(float value) {
		setConstNumber(offset + 224, $std_cost18, value);
	}
	
	/**
	 * 標準原価１８. Standard cost 18.<p>
	 *
	 */
	public void std_cost18(double value) {
		setConstNumber(offset + 224, $std_cost18, value);
	}
	
	/**
	 * 標準原価１９. Standard cost 19.<p>
	 *
	 */
	public MCNumber std_cost19() {
		return getConstNumber(offset + 225, $std_cost19);
	}

	/**
	 * 標準原価１９. Standard cost 19.<p>
	 *
	 */
	public void std_cost19(MCNumber value) {
		setConstNumber(offset + 225, $std_cost19, value);
	}
	
	/**
	 * 標準原価１９. Standard cost 19.<p>
	 *
	 */
	public void std_cost19(int value) {
		setConstNumber(offset + 225, $std_cost19, value);
	}
	
	/**
	 * 標準原価１９. Standard cost 19.<p>
	 *
	 */
	public void std_cost19(long value) {
		setConstNumber(offset + 225, $std_cost19, value);
	}
	
	/**
	 * 標準原価１９. Standard cost 19.<p>
	 *
	 */
	public void std_cost19(float value) {
		setConstNumber(offset + 225, $std_cost19, value);
	}
	
	/**
	 * 標準原価１９. Standard cost 19.<p>
	 *
	 */
	public void std_cost19(double value) {
		setConstNumber(offset + 225, $std_cost19, value);
	}
	
	/**
	 * 標準原価２０. Standard cost 20.<p>
	 *
	 */
	public MCNumber std_cost20() {
		return getConstNumber(offset + 226, $std_cost20);
	}

	/**
	 * 標準原価２０. Standard cost 20.<p>
	 *
	 */
	public void std_cost20(MCNumber value) {
		setConstNumber(offset + 226, $std_cost20, value);
	}
	
	/**
	 * 標準原価２０. Standard cost 20.<p>
	 *
	 */
	public void std_cost20(int value) {
		setConstNumber(offset + 226, $std_cost20, value);
	}
	
	/**
	 * 標準原価２０. Standard cost 20.<p>
	 *
	 */
	public void std_cost20(long value) {
		setConstNumber(offset + 226, $std_cost20, value);
	}
	
	/**
	 * 標準原価２０. Standard cost 20.<p>
	 *
	 */
	public void std_cost20(float value) {
		setConstNumber(offset + 226, $std_cost20, value);
	}
	
	/**
	 * 標準原価２０. Standard cost 20.<p>
	 *
	 */
	public void std_cost20(double value) {
		setConstNumber(offset + 226, $std_cost20, value);
	}
	
	/**
	 * 標準原価２１. Standard cost 21.<p>
	 *
	 */
	public MCNumber std_cost21() {
		return getConstNumber(offset + 227, $std_cost21);
	}

	/**
	 * 標準原価２１. Standard cost 21.<p>
	 *
	 */
	public void std_cost21(MCNumber value) {
		setConstNumber(offset + 227, $std_cost21, value);
	}
	
	/**
	 * 標準原価２１. Standard cost 21.<p>
	 *
	 */
	public void std_cost21(int value) {
		setConstNumber(offset + 227, $std_cost21, value);
	}
	
	/**
	 * 標準原価２１. Standard cost 21.<p>
	 *
	 */
	public void std_cost21(long value) {
		setConstNumber(offset + 227, $std_cost21, value);
	}
	
	/**
	 * 標準原価２１. Standard cost 21.<p>
	 *
	 */
	public void std_cost21(float value) {
		setConstNumber(offset + 227, $std_cost21, value);
	}
	
	/**
	 * 標準原価２１. Standard cost 21.<p>
	 *
	 */
	public void std_cost21(double value) {
		setConstNumber(offset + 227, $std_cost21, value);
	}
	
	/**
	 * 標準原価２２. Standard cost 22.<p>
	 *
	 */
	public MCNumber std_cost22() {
		return getConstNumber(offset + 228, $std_cost22);
	}

	/**
	 * 標準原価２２. Standard cost 22.<p>
	 *
	 */
	public void std_cost22(MCNumber value) {
		setConstNumber(offset + 228, $std_cost22, value);
	}
	
	/**
	 * 標準原価２２. Standard cost 22.<p>
	 *
	 */
	public void std_cost22(int value) {
		setConstNumber(offset + 228, $std_cost22, value);
	}
	
	/**
	 * 標準原価２２. Standard cost 22.<p>
	 *
	 */
	public void std_cost22(long value) {
		setConstNumber(offset + 228, $std_cost22, value);
	}
	
	/**
	 * 標準原価２２. Standard cost 22.<p>
	 *
	 */
	public void std_cost22(float value) {
		setConstNumber(offset + 228, $std_cost22, value);
	}
	
	/**
	 * 標準原価２２. Standard cost 22.<p>
	 *
	 */
	public void std_cost22(double value) {
		setConstNumber(offset + 228, $std_cost22, value);
	}
	
	/**
	 * 標準原価２３. Standard cost 23.<p>
	 *
	 */
	public MCNumber std_cost23() {
		return getConstNumber(offset + 229, $std_cost23);
	}

	/**
	 * 標準原価２３. Standard cost 23.<p>
	 *
	 */
	public void std_cost23(MCNumber value) {
		setConstNumber(offset + 229, $std_cost23, value);
	}
	
	/**
	 * 標準原価２３. Standard cost 23.<p>
	 *
	 */
	public void std_cost23(int value) {
		setConstNumber(offset + 229, $std_cost23, value);
	}
	
	/**
	 * 標準原価２３. Standard cost 23.<p>
	 *
	 */
	public void std_cost23(long value) {
		setConstNumber(offset + 229, $std_cost23, value);
	}
	
	/**
	 * 標準原価２３. Standard cost 23.<p>
	 *
	 */
	public void std_cost23(float value) {
		setConstNumber(offset + 229, $std_cost23, value);
	}
	
	/**
	 * 標準原価２３. Standard cost 23.<p>
	 *
	 */
	public void std_cost23(double value) {
		setConstNumber(offset + 229, $std_cost23, value);
	}
	
	/**
	 * 標準原価２４. Standard cost 24.<p>
	 *
	 */
	public MCNumber std_cost24() {
		return getConstNumber(offset + 230, $std_cost24);
	}

	/**
	 * 標準原価２４. Standard cost 24.<p>
	 *
	 */
	public void std_cost24(MCNumber value) {
		setConstNumber(offset + 230, $std_cost24, value);
	}
	
	/**
	 * 標準原価２４. Standard cost 24.<p>
	 *
	 */
	public void std_cost24(int value) {
		setConstNumber(offset + 230, $std_cost24, value);
	}
	
	/**
	 * 標準原価２４. Standard cost 24.<p>
	 *
	 */
	public void std_cost24(long value) {
		setConstNumber(offset + 230, $std_cost24, value);
	}
	
	/**
	 * 標準原価２４. Standard cost 24.<p>
	 *
	 */
	public void std_cost24(float value) {
		setConstNumber(offset + 230, $std_cost24, value);
	}
	
	/**
	 * 標準原価２４. Standard cost 24.<p>
	 *
	 */
	public void std_cost24(double value) {
		setConstNumber(offset + 230, $std_cost24, value);
	}
	
	/**
	 * 標準原価２５. Standard cost 25.<p>
	 *
	 */
	public MCNumber std_cost25() {
		return getConstNumber(offset + 231, $std_cost25);
	}

	/**
	 * 標準原価２５. Standard cost 25.<p>
	 *
	 */
	public void std_cost25(MCNumber value) {
		setConstNumber(offset + 231, $std_cost25, value);
	}
	
	/**
	 * 標準原価２５. Standard cost 25.<p>
	 *
	 */
	public void std_cost25(int value) {
		setConstNumber(offset + 231, $std_cost25, value);
	}
	
	/**
	 * 標準原価２５. Standard cost 25.<p>
	 *
	 */
	public void std_cost25(long value) {
		setConstNumber(offset + 231, $std_cost25, value);
	}
	
	/**
	 * 標準原価２５. Standard cost 25.<p>
	 *
	 */
	public void std_cost25(float value) {
		setConstNumber(offset + 231, $std_cost25, value);
	}
	
	/**
	 * 標準原価２５. Standard cost 25.<p>
	 *
	 */
	public void std_cost25(double value) {
		setConstNumber(offset + 231, $std_cost25, value);
	}
	
	/**
	 * 標準原価２６. Standard cost 26.<p>
	 *
	 */
	public MCNumber std_cost26() {
		return getConstNumber(offset + 232, $std_cost26);
	}

	/**
	 * 標準原価２６. Standard cost 26.<p>
	 *
	 */
	public void std_cost26(MCNumber value) {
		setConstNumber(offset + 232, $std_cost26, value);
	}
	
	/**
	 * 標準原価２６. Standard cost 26.<p>
	 *
	 */
	public void std_cost26(int value) {
		setConstNumber(offset + 232, $std_cost26, value);
	}
	
	/**
	 * 標準原価２６. Standard cost 26.<p>
	 *
	 */
	public void std_cost26(long value) {
		setConstNumber(offset + 232, $std_cost26, value);
	}
	
	/**
	 * 標準原価２６. Standard cost 26.<p>
	 *
	 */
	public void std_cost26(float value) {
		setConstNumber(offset + 232, $std_cost26, value);
	}
	
	/**
	 * 標準原価２６. Standard cost 26.<p>
	 *
	 */
	public void std_cost26(double value) {
		setConstNumber(offset + 232, $std_cost26, value);
	}
	
	/**
	 * 標準原価２７. Standard cost 27.<p>
	 *
	 */
	public MCNumber std_cost27() {
		return getConstNumber(offset + 233, $std_cost27);
	}

	/**
	 * 標準原価２７. Standard cost 27.<p>
	 *
	 */
	public void std_cost27(MCNumber value) {
		setConstNumber(offset + 233, $std_cost27, value);
	}
	
	/**
	 * 標準原価２７. Standard cost 27.<p>
	 *
	 */
	public void std_cost27(int value) {
		setConstNumber(offset + 233, $std_cost27, value);
	}
	
	/**
	 * 標準原価２７. Standard cost 27.<p>
	 *
	 */
	public void std_cost27(long value) {
		setConstNumber(offset + 233, $std_cost27, value);
	}
	
	/**
	 * 標準原価２７. Standard cost 27.<p>
	 *
	 */
	public void std_cost27(float value) {
		setConstNumber(offset + 233, $std_cost27, value);
	}
	
	/**
	 * 標準原価２７. Standard cost 27.<p>
	 *
	 */
	public void std_cost27(double value) {
		setConstNumber(offset + 233, $std_cost27, value);
	}
	
	/**
	 * 標準原価２８. Standard cost 28.<p>
	 *
	 */
	public MCNumber std_cost28() {
		return getConstNumber(offset + 234, $std_cost28);
	}

	/**
	 * 標準原価２８. Standard cost 28.<p>
	 *
	 */
	public void std_cost28(MCNumber value) {
		setConstNumber(offset + 234, $std_cost28, value);
	}
	
	/**
	 * 標準原価２８. Standard cost 28.<p>
	 *
	 */
	public void std_cost28(int value) {
		setConstNumber(offset + 234, $std_cost28, value);
	}
	
	/**
	 * 標準原価２８. Standard cost 28.<p>
	 *
	 */
	public void std_cost28(long value) {
		setConstNumber(offset + 234, $std_cost28, value);
	}
	
	/**
	 * 標準原価２８. Standard cost 28.<p>
	 *
	 */
	public void std_cost28(float value) {
		setConstNumber(offset + 234, $std_cost28, value);
	}
	
	/**
	 * 標準原価２８. Standard cost 28.<p>
	 *
	 */
	public void std_cost28(double value) {
		setConstNumber(offset + 234, $std_cost28, value);
	}
	
	/**
	 * 標準原価２９. Standard cost 29.<p>
	 *
	 */
	public MCNumber std_cost29() {
		return getConstNumber(offset + 235, $std_cost29);
	}

	/**
	 * 標準原価２９. Standard cost 29.<p>
	 *
	 */
	public void std_cost29(MCNumber value) {
		setConstNumber(offset + 235, $std_cost29, value);
	}
	
	/**
	 * 標準原価２９. Standard cost 29.<p>
	 *
	 */
	public void std_cost29(int value) {
		setConstNumber(offset + 235, $std_cost29, value);
	}
	
	/**
	 * 標準原価２９. Standard cost 29.<p>
	 *
	 */
	public void std_cost29(long value) {
		setConstNumber(offset + 235, $std_cost29, value);
	}
	
	/**
	 * 標準原価２９. Standard cost 29.<p>
	 *
	 */
	public void std_cost29(float value) {
		setConstNumber(offset + 235, $std_cost29, value);
	}
	
	/**
	 * 標準原価２９. Standard cost 29.<p>
	 *
	 */
	public void std_cost29(double value) {
		setConstNumber(offset + 235, $std_cost29, value);
	}
	
	/**
	 * 標準原価３０. Standard cost 30.<p>
	 *
	 */
	public MCNumber std_cost30() {
		return getConstNumber(offset + 236, $std_cost30);
	}

	/**
	 * 標準原価３０. Standard cost 30.<p>
	 *
	 */
	public void std_cost30(MCNumber value) {
		setConstNumber(offset + 236, $std_cost30, value);
	}
	
	/**
	 * 標準原価３０. Standard cost 30.<p>
	 *
	 */
	public void std_cost30(int value) {
		setConstNumber(offset + 236, $std_cost30, value);
	}
	
	/**
	 * 標準原価３０. Standard cost 30.<p>
	 *
	 */
	public void std_cost30(long value) {
		setConstNumber(offset + 236, $std_cost30, value);
	}
	
	/**
	 * 標準原価３０. Standard cost 30.<p>
	 *
	 */
	public void std_cost30(float value) {
		setConstNumber(offset + 236, $std_cost30, value);
	}
	
	/**
	 * 標準原価３０. Standard cost 30.<p>
	 *
	 */
	public void std_cost30(double value) {
		setConstNumber(offset + 236, $std_cost30, value);
	}
	
	/**
	 * 標準原価３１. Standard cost 31.<p>
	 *
	 */
	public MCNumber std_cost31() {
		return getConstNumber(offset + 237, $std_cost31);
	}

	/**
	 * 標準原価３１. Standard cost 31.<p>
	 *
	 */
	public void std_cost31(MCNumber value) {
		setConstNumber(offset + 237, $std_cost31, value);
	}
	
	/**
	 * 標準原価３１. Standard cost 31.<p>
	 *
	 */
	public void std_cost31(int value) {
		setConstNumber(offset + 237, $std_cost31, value);
	}
	
	/**
	 * 標準原価３１. Standard cost 31.<p>
	 *
	 */
	public void std_cost31(long value) {
		setConstNumber(offset + 237, $std_cost31, value);
	}
	
	/**
	 * 標準原価３１. Standard cost 31.<p>
	 *
	 */
	public void std_cost31(float value) {
		setConstNumber(offset + 237, $std_cost31, value);
	}
	
	/**
	 * 標準原価３１. Standard cost 31.<p>
	 *
	 */
	public void std_cost31(double value) {
		setConstNumber(offset + 237, $std_cost31, value);
	}
	
	/**
	 * 標準原価３２. Standard cost 32.<p>
	 *
	 */
	public MCNumber std_cost32() {
		return getConstNumber(offset + 238, $std_cost32);
	}

	/**
	 * 標準原価３２. Standard cost 32.<p>
	 *
	 */
	public void std_cost32(MCNumber value) {
		setConstNumber(offset + 238, $std_cost32, value);
	}
	
	/**
	 * 標準原価３２. Standard cost 32.<p>
	 *
	 */
	public void std_cost32(int value) {
		setConstNumber(offset + 238, $std_cost32, value);
	}
	
	/**
	 * 標準原価３２. Standard cost 32.<p>
	 *
	 */
	public void std_cost32(long value) {
		setConstNumber(offset + 238, $std_cost32, value);
	}
	
	/**
	 * 標準原価３２. Standard cost 32.<p>
	 *
	 */
	public void std_cost32(float value) {
		setConstNumber(offset + 238, $std_cost32, value);
	}
	
	/**
	 * 標準原価３２. Standard cost 32.<p>
	 *
	 */
	public void std_cost32(double value) {
		setConstNumber(offset + 238, $std_cost32, value);
	}
	
	/**
	 * 標準原価３３. Standard cost 33.<p>
	 *
	 */
	public MCNumber std_cost33() {
		return getConstNumber(offset + 239, $std_cost33);
	}

	/**
	 * 標準原価３３. Standard cost 33.<p>
	 *
	 */
	public void std_cost33(MCNumber value) {
		setConstNumber(offset + 239, $std_cost33, value);
	}
	
	/**
	 * 標準原価３３. Standard cost 33.<p>
	 *
	 */
	public void std_cost33(int value) {
		setConstNumber(offset + 239, $std_cost33, value);
	}
	
	/**
	 * 標準原価３３. Standard cost 33.<p>
	 *
	 */
	public void std_cost33(long value) {
		setConstNumber(offset + 239, $std_cost33, value);
	}
	
	/**
	 * 標準原価３３. Standard cost 33.<p>
	 *
	 */
	public void std_cost33(float value) {
		setConstNumber(offset + 239, $std_cost33, value);
	}
	
	/**
	 * 標準原価３３. Standard cost 33.<p>
	 *
	 */
	public void std_cost33(double value) {
		setConstNumber(offset + 239, $std_cost33, value);
	}
	
	/**
	 * 標準原価３４. Standard cost 34.<p>
	 *
	 */
	public MCNumber std_cost34() {
		return getConstNumber(offset + 240, $std_cost34);
	}

	/**
	 * 標準原価３４. Standard cost 34.<p>
	 *
	 */
	public void std_cost34(MCNumber value) {
		setConstNumber(offset + 240, $std_cost34, value);
	}
	
	/**
	 * 標準原価３４. Standard cost 34.<p>
	 *
	 */
	public void std_cost34(int value) {
		setConstNumber(offset + 240, $std_cost34, value);
	}
	
	/**
	 * 標準原価３４. Standard cost 34.<p>
	 *
	 */
	public void std_cost34(long value) {
		setConstNumber(offset + 240, $std_cost34, value);
	}
	
	/**
	 * 標準原価３４. Standard cost 34.<p>
	 *
	 */
	public void std_cost34(float value) {
		setConstNumber(offset + 240, $std_cost34, value);
	}
	
	/**
	 * 標準原価３４. Standard cost 34.<p>
	 *
	 */
	public void std_cost34(double value) {
		setConstNumber(offset + 240, $std_cost34, value);
	}
	
	/**
	 * 標準原価３５. Standard cost 35.<p>
	 *
	 */
	public MCNumber std_cost35() {
		return getConstNumber(offset + 241, $std_cost35);
	}

	/**
	 * 標準原価３５. Standard cost 35.<p>
	 *
	 */
	public void std_cost35(MCNumber value) {
		setConstNumber(offset + 241, $std_cost35, value);
	}
	
	/**
	 * 標準原価３５. Standard cost 35.<p>
	 *
	 */
	public void std_cost35(int value) {
		setConstNumber(offset + 241, $std_cost35, value);
	}
	
	/**
	 * 標準原価３５. Standard cost 35.<p>
	 *
	 */
	public void std_cost35(long value) {
		setConstNumber(offset + 241, $std_cost35, value);
	}
	
	/**
	 * 標準原価３５. Standard cost 35.<p>
	 *
	 */
	public void std_cost35(float value) {
		setConstNumber(offset + 241, $std_cost35, value);
	}
	
	/**
	 * 標準原価３５. Standard cost 35.<p>
	 *
	 */
	public void std_cost35(double value) {
		setConstNumber(offset + 241, $std_cost35, value);
	}
	
	/**
	 * 標準原価３６. Standard cost 36.<p>
	 *
	 */
	public MCNumber std_cost36() {
		return getConstNumber(offset + 242, $std_cost36);
	}

	/**
	 * 標準原価３６. Standard cost 36.<p>
	 *
	 */
	public void std_cost36(MCNumber value) {
		setConstNumber(offset + 242, $std_cost36, value);
	}
	
	/**
	 * 標準原価３６. Standard cost 36.<p>
	 *
	 */
	public void std_cost36(int value) {
		setConstNumber(offset + 242, $std_cost36, value);
	}
	
	/**
	 * 標準原価３６. Standard cost 36.<p>
	 *
	 */
	public void std_cost36(long value) {
		setConstNumber(offset + 242, $std_cost36, value);
	}
	
	/**
	 * 標準原価３６. Standard cost 36.<p>
	 *
	 */
	public void std_cost36(float value) {
		setConstNumber(offset + 242, $std_cost36, value);
	}
	
	/**
	 * 標準原価３６. Standard cost 36.<p>
	 *
	 */
	public void std_cost36(double value) {
		setConstNumber(offset + 242, $std_cost36, value);
	}
	
	/**
	 * 標準原価３７. Standard cost 37.<p>
	 *
	 */
	public MCNumber std_cost37() {
		return getConstNumber(offset + 243, $std_cost37);
	}

	/**
	 * 標準原価３７. Standard cost 37.<p>
	 *
	 */
	public void std_cost37(MCNumber value) {
		setConstNumber(offset + 243, $std_cost37, value);
	}
	
	/**
	 * 標準原価３７. Standard cost 37.<p>
	 *
	 */
	public void std_cost37(int value) {
		setConstNumber(offset + 243, $std_cost37, value);
	}
	
	/**
	 * 標準原価３７. Standard cost 37.<p>
	 *
	 */
	public void std_cost37(long value) {
		setConstNumber(offset + 243, $std_cost37, value);
	}
	
	/**
	 * 標準原価３７. Standard cost 37.<p>
	 *
	 */
	public void std_cost37(float value) {
		setConstNumber(offset + 243, $std_cost37, value);
	}
	
	/**
	 * 標準原価３７. Standard cost 37.<p>
	 *
	 */
	public void std_cost37(double value) {
		setConstNumber(offset + 243, $std_cost37, value);
	}
	
	/**
	 * 標準原価３８. Standard cost 38.<p>
	 *
	 */
	public MCNumber std_cost38() {
		return getConstNumber(offset + 244, $std_cost38);
	}

	/**
	 * 標準原価３８. Standard cost 38.<p>
	 *
	 */
	public void std_cost38(MCNumber value) {
		setConstNumber(offset + 244, $std_cost38, value);
	}
	
	/**
	 * 標準原価３８. Standard cost 38.<p>
	 *
	 */
	public void std_cost38(int value) {
		setConstNumber(offset + 244, $std_cost38, value);
	}
	
	/**
	 * 標準原価３８. Standard cost 38.<p>
	 *
	 */
	public void std_cost38(long value) {
		setConstNumber(offset + 244, $std_cost38, value);
	}
	
	/**
	 * 標準原価３８. Standard cost 38.<p>
	 *
	 */
	public void std_cost38(float value) {
		setConstNumber(offset + 244, $std_cost38, value);
	}
	
	/**
	 * 標準原価３８. Standard cost 38.<p>
	 *
	 */
	public void std_cost38(double value) {
		setConstNumber(offset + 244, $std_cost38, value);
	}
	
	/**
	 * 標準原価３９. Standard cost 39.<p>
	 *
	 */
	public MCNumber std_cost39() {
		return getConstNumber(offset + 245, $std_cost39);
	}

	/**
	 * 標準原価３９. Standard cost 39.<p>
	 *
	 */
	public void std_cost39(MCNumber value) {
		setConstNumber(offset + 245, $std_cost39, value);
	}
	
	/**
	 * 標準原価３９. Standard cost 39.<p>
	 *
	 */
	public void std_cost39(int value) {
		setConstNumber(offset + 245, $std_cost39, value);
	}
	
	/**
	 * 標準原価３９. Standard cost 39.<p>
	 *
	 */
	public void std_cost39(long value) {
		setConstNumber(offset + 245, $std_cost39, value);
	}
	
	/**
	 * 標準原価３９. Standard cost 39.<p>
	 *
	 */
	public void std_cost39(float value) {
		setConstNumber(offset + 245, $std_cost39, value);
	}
	
	/**
	 * 標準原価３９. Standard cost 39.<p>
	 *
	 */
	public void std_cost39(double value) {
		setConstNumber(offset + 245, $std_cost39, value);
	}
	
	/**
	 * 標準原価４０. Standard cost 40.<p>
	 *
	 */
	public MCNumber std_cost40() {
		return getConstNumber(offset + 246, $std_cost40);
	}

	/**
	 * 標準原価４０. Standard cost 40.<p>
	 *
	 */
	public void std_cost40(MCNumber value) {
		setConstNumber(offset + 246, $std_cost40, value);
	}
	
	/**
	 * 標準原価４０. Standard cost 40.<p>
	 *
	 */
	public void std_cost40(int value) {
		setConstNumber(offset + 246, $std_cost40, value);
	}
	
	/**
	 * 標準原価４０. Standard cost 40.<p>
	 *
	 */
	public void std_cost40(long value) {
		setConstNumber(offset + 246, $std_cost40, value);
	}
	
	/**
	 * 標準原価４０. Standard cost 40.<p>
	 *
	 */
	public void std_cost40(float value) {
		setConstNumber(offset + 246, $std_cost40, value);
	}
	
	/**
	 * 標準原価４０. Standard cost 40.<p>
	 *
	 */
	public void std_cost40(double value) {
		setConstNumber(offset + 246, $std_cost40, value);
	}
	
	/**
	 * 標準原価４１. Standard cost 41.<p>
	 *
	 */
	public MCNumber std_cost41() {
		return getConstNumber(offset + 247, $std_cost41);
	}

	/**
	 * 標準原価４１. Standard cost 41.<p>
	 *
	 */
	public void std_cost41(MCNumber value) {
		setConstNumber(offset + 247, $std_cost41, value);
	}
	
	/**
	 * 標準原価４１. Standard cost 41.<p>
	 *
	 */
	public void std_cost41(int value) {
		setConstNumber(offset + 247, $std_cost41, value);
	}
	
	/**
	 * 標準原価４１. Standard cost 41.<p>
	 *
	 */
	public void std_cost41(long value) {
		setConstNumber(offset + 247, $std_cost41, value);
	}
	
	/**
	 * 標準原価４１. Standard cost 41.<p>
	 *
	 */
	public void std_cost41(float value) {
		setConstNumber(offset + 247, $std_cost41, value);
	}
	
	/**
	 * 標準原価４１. Standard cost 41.<p>
	 *
	 */
	public void std_cost41(double value) {
		setConstNumber(offset + 247, $std_cost41, value);
	}
	
	/**
	 * 標準原価４２. Standard cost 42.<p>
	 *
	 */
	public MCNumber std_cost42() {
		return getConstNumber(offset + 248, $std_cost42);
	}

	/**
	 * 標準原価４２. Standard cost 42.<p>
	 *
	 */
	public void std_cost42(MCNumber value) {
		setConstNumber(offset + 248, $std_cost42, value);
	}
	
	/**
	 * 標準原価４２. Standard cost 42.<p>
	 *
	 */
	public void std_cost42(int value) {
		setConstNumber(offset + 248, $std_cost42, value);
	}
	
	/**
	 * 標準原価４２. Standard cost 42.<p>
	 *
	 */
	public void std_cost42(long value) {
		setConstNumber(offset + 248, $std_cost42, value);
	}
	
	/**
	 * 標準原価４２. Standard cost 42.<p>
	 *
	 */
	public void std_cost42(float value) {
		setConstNumber(offset + 248, $std_cost42, value);
	}
	
	/**
	 * 標準原価４２. Standard cost 42.<p>
	 *
	 */
	public void std_cost42(double value) {
		setConstNumber(offset + 248, $std_cost42, value);
	}
	
	/**
	 * 標準原価４３. Standard cost 43.<p>
	 *
	 */
	public MCNumber std_cost43() {
		return getConstNumber(offset + 249, $std_cost43);
	}

	/**
	 * 標準原価４３. Standard cost 43.<p>
	 *
	 */
	public void std_cost43(MCNumber value) {
		setConstNumber(offset + 249, $std_cost43, value);
	}
	
	/**
	 * 標準原価４３. Standard cost 43.<p>
	 *
	 */
	public void std_cost43(int value) {
		setConstNumber(offset + 249, $std_cost43, value);
	}
	
	/**
	 * 標準原価４３. Standard cost 43.<p>
	 *
	 */
	public void std_cost43(long value) {
		setConstNumber(offset + 249, $std_cost43, value);
	}
	
	/**
	 * 標準原価４３. Standard cost 43.<p>
	 *
	 */
	public void std_cost43(float value) {
		setConstNumber(offset + 249, $std_cost43, value);
	}
	
	/**
	 * 標準原価４３. Standard cost 43.<p>
	 *
	 */
	public void std_cost43(double value) {
		setConstNumber(offset + 249, $std_cost43, value);
	}
	
	/**
	 * 標準原価４４. Standard cost 44.<p>
	 *
	 */
	public MCNumber std_cost44() {
		return getConstNumber(offset + 250, $std_cost44);
	}

	/**
	 * 標準原価４４. Standard cost 44.<p>
	 *
	 */
	public void std_cost44(MCNumber value) {
		setConstNumber(offset + 250, $std_cost44, value);
	}
	
	/**
	 * 標準原価４４. Standard cost 44.<p>
	 *
	 */
	public void std_cost44(int value) {
		setConstNumber(offset + 250, $std_cost44, value);
	}
	
	/**
	 * 標準原価４４. Standard cost 44.<p>
	 *
	 */
	public void std_cost44(long value) {
		setConstNumber(offset + 250, $std_cost44, value);
	}
	
	/**
	 * 標準原価４４. Standard cost 44.<p>
	 *
	 */
	public void std_cost44(float value) {
		setConstNumber(offset + 250, $std_cost44, value);
	}
	
	/**
	 * 標準原価４４. Standard cost 44.<p>
	 *
	 */
	public void std_cost44(double value) {
		setConstNumber(offset + 250, $std_cost44, value);
	}
	
	/**
	 * 標準原価４５. Standard cost 45.<p>
	 *
	 */
	public MCNumber std_cost45() {
		return getConstNumber(offset + 251, $std_cost45);
	}

	/**
	 * 標準原価４５. Standard cost 45.<p>
	 *
	 */
	public void std_cost45(MCNumber value) {
		setConstNumber(offset + 251, $std_cost45, value);
	}
	
	/**
	 * 標準原価４５. Standard cost 45.<p>
	 *
	 */
	public void std_cost45(int value) {
		setConstNumber(offset + 251, $std_cost45, value);
	}
	
	/**
	 * 標準原価４５. Standard cost 45.<p>
	 *
	 */
	public void std_cost45(long value) {
		setConstNumber(offset + 251, $std_cost45, value);
	}
	
	/**
	 * 標準原価４５. Standard cost 45.<p>
	 *
	 */
	public void std_cost45(float value) {
		setConstNumber(offset + 251, $std_cost45, value);
	}
	
	/**
	 * 標準原価４５. Standard cost 45.<p>
	 *
	 */
	public void std_cost45(double value) {
		setConstNumber(offset + 251, $std_cost45, value);
	}
	
	/**
	 * 標準原価４６. Standard cost 46.<p>
	 *
	 */
	public MCNumber std_cost46() {
		return getConstNumber(offset + 252, $std_cost46);
	}

	/**
	 * 標準原価４６. Standard cost 46.<p>
	 *
	 */
	public void std_cost46(MCNumber value) {
		setConstNumber(offset + 252, $std_cost46, value);
	}
	
	/**
	 * 標準原価４６. Standard cost 46.<p>
	 *
	 */
	public void std_cost46(int value) {
		setConstNumber(offset + 252, $std_cost46, value);
	}
	
	/**
	 * 標準原価４６. Standard cost 46.<p>
	 *
	 */
	public void std_cost46(long value) {
		setConstNumber(offset + 252, $std_cost46, value);
	}
	
	/**
	 * 標準原価４６. Standard cost 46.<p>
	 *
	 */
	public void std_cost46(float value) {
		setConstNumber(offset + 252, $std_cost46, value);
	}
	
	/**
	 * 標準原価４６. Standard cost 46.<p>
	 *
	 */
	public void std_cost46(double value) {
		setConstNumber(offset + 252, $std_cost46, value);
	}
	
	/**
	 * 標準原価４７. Standard cost 47.<p>
	 *
	 */
	public MCNumber std_cost47() {
		return getConstNumber(offset + 253, $std_cost47);
	}

	/**
	 * 標準原価４７. Standard cost 47.<p>
	 *
	 */
	public void std_cost47(MCNumber value) {
		setConstNumber(offset + 253, $std_cost47, value);
	}
	
	/**
	 * 標準原価４７. Standard cost 47.<p>
	 *
	 */
	public void std_cost47(int value) {
		setConstNumber(offset + 253, $std_cost47, value);
	}
	
	/**
	 * 標準原価４７. Standard cost 47.<p>
	 *
	 */
	public void std_cost47(long value) {
		setConstNumber(offset + 253, $std_cost47, value);
	}
	
	/**
	 * 標準原価４７. Standard cost 47.<p>
	 *
	 */
	public void std_cost47(float value) {
		setConstNumber(offset + 253, $std_cost47, value);
	}
	
	/**
	 * 標準原価４７. Standard cost 47.<p>
	 *
	 */
	public void std_cost47(double value) {
		setConstNumber(offset + 253, $std_cost47, value);
	}
	
	/**
	 * 標準原価４８. Standard cost 48.<p>
	 *
	 */
	public MCNumber std_cost48() {
		return getConstNumber(offset + 254, $std_cost48);
	}

	/**
	 * 標準原価４８. Standard cost 48.<p>
	 *
	 */
	public void std_cost48(MCNumber value) {
		setConstNumber(offset + 254, $std_cost48, value);
	}
	
	/**
	 * 標準原価４８. Standard cost 48.<p>
	 *
	 */
	public void std_cost48(int value) {
		setConstNumber(offset + 254, $std_cost48, value);
	}
	
	/**
	 * 標準原価４８. Standard cost 48.<p>
	 *
	 */
	public void std_cost48(long value) {
		setConstNumber(offset + 254, $std_cost48, value);
	}
	
	/**
	 * 標準原価４８. Standard cost 48.<p>
	 *
	 */
	public void std_cost48(float value) {
		setConstNumber(offset + 254, $std_cost48, value);
	}
	
	/**
	 * 標準原価４８. Standard cost 48.<p>
	 *
	 */
	public void std_cost48(double value) {
		setConstNumber(offset + 254, $std_cost48, value);
	}
	
	/**
	 * 標準原価４９. Standard cost 49.<p>
	 *
	 */
	public MCNumber std_cost49() {
		return getConstNumber(offset + 255, $std_cost49);
	}

	/**
	 * 標準原価４９. Standard cost 49.<p>
	 *
	 */
	public void std_cost49(MCNumber value) {
		setConstNumber(offset + 255, $std_cost49, value);
	}
	
	/**
	 * 標準原価４９. Standard cost 49.<p>
	 *
	 */
	public void std_cost49(int value) {
		setConstNumber(offset + 255, $std_cost49, value);
	}
	
	/**
	 * 標準原価４９. Standard cost 49.<p>
	 *
	 */
	public void std_cost49(long value) {
		setConstNumber(offset + 255, $std_cost49, value);
	}
	
	/**
	 * 標準原価４９. Standard cost 49.<p>
	 *
	 */
	public void std_cost49(float value) {
		setConstNumber(offset + 255, $std_cost49, value);
	}
	
	/**
	 * 標準原価４９. Standard cost 49.<p>
	 *
	 */
	public void std_cost49(double value) {
		setConstNumber(offset + 255, $std_cost49, value);
	}
	
	/**
	 * 標準原価５０. Standard cost 50.<p>
	 *
	 */
	public MCNumber std_cost50() {
		return getConstNumber(offset + 256, $std_cost50);
	}

	/**
	 * 標準原価５０. Standard cost 50.<p>
	 *
	 */
	public void std_cost50(MCNumber value) {
		setConstNumber(offset + 256, $std_cost50, value);
	}
	
	/**
	 * 標準原価５０. Standard cost 50.<p>
	 *
	 */
	public void std_cost50(int value) {
		setConstNumber(offset + 256, $std_cost50, value);
	}
	
	/**
	 * 標準原価５０. Standard cost 50.<p>
	 *
	 */
	public void std_cost50(long value) {
		setConstNumber(offset + 256, $std_cost50, value);
	}
	
	/**
	 * 標準原価５０. Standard cost 50.<p>
	 *
	 */
	public void std_cost50(float value) {
		setConstNumber(offset + 256, $std_cost50, value);
	}
	
	/**
	 * 標準原価５０. Standard cost 50.<p>
	 *
	 */
	public void std_cost50(double value) {
		setConstNumber(offset + 256, $std_cost50, value);
	}
	
	/**
	 * 標準原価５１. Standard cost 51.<p>
	 *
	 */
	public MCNumber std_cost51() {
		return getConstNumber(offset + 257, $std_cost51);
	}

	/**
	 * 標準原価５１. Standard cost 51.<p>
	 *
	 */
	public void std_cost51(MCNumber value) {
		setConstNumber(offset + 257, $std_cost51, value);
	}
	
	/**
	 * 標準原価５１. Standard cost 51.<p>
	 *
	 */
	public void std_cost51(int value) {
		setConstNumber(offset + 257, $std_cost51, value);
	}
	
	/**
	 * 標準原価５１. Standard cost 51.<p>
	 *
	 */
	public void std_cost51(long value) {
		setConstNumber(offset + 257, $std_cost51, value);
	}
	
	/**
	 * 標準原価５１. Standard cost 51.<p>
	 *
	 */
	public void std_cost51(float value) {
		setConstNumber(offset + 257, $std_cost51, value);
	}
	
	/**
	 * 標準原価５１. Standard cost 51.<p>
	 *
	 */
	public void std_cost51(double value) {
		setConstNumber(offset + 257, $std_cost51, value);
	}
	
	/**
	 * 標準原価５２. Standard cost 52.<p>
	 *
	 */
	public MCNumber std_cost52() {
		return getConstNumber(offset + 258, $std_cost52);
	}

	/**
	 * 標準原価５２. Standard cost 52.<p>
	 *
	 */
	public void std_cost52(MCNumber value) {
		setConstNumber(offset + 258, $std_cost52, value);
	}
	
	/**
	 * 標準原価５２. Standard cost 52.<p>
	 *
	 */
	public void std_cost52(int value) {
		setConstNumber(offset + 258, $std_cost52, value);
	}
	
	/**
	 * 標準原価５２. Standard cost 52.<p>
	 *
	 */
	public void std_cost52(long value) {
		setConstNumber(offset + 258, $std_cost52, value);
	}
	
	/**
	 * 標準原価５２. Standard cost 52.<p>
	 *
	 */
	public void std_cost52(float value) {
		setConstNumber(offset + 258, $std_cost52, value);
	}
	
	/**
	 * 標準原価５２. Standard cost 52.<p>
	 *
	 */
	public void std_cost52(double value) {
		setConstNumber(offset + 258, $std_cost52, value);
	}
	
	/**
	 * 標準原価５３. Standard cost 53.<p>
	 *
	 */
	public MCNumber std_cost53() {
		return getConstNumber(offset + 259, $std_cost53);
	}

	/**
	 * 標準原価５３. Standard cost 53.<p>
	 *
	 */
	public void std_cost53(MCNumber value) {
		setConstNumber(offset + 259, $std_cost53, value);
	}
	
	/**
	 * 標準原価５３. Standard cost 53.<p>
	 *
	 */
	public void std_cost53(int value) {
		setConstNumber(offset + 259, $std_cost53, value);
	}
	
	/**
	 * 標準原価５３. Standard cost 53.<p>
	 *
	 */
	public void std_cost53(long value) {
		setConstNumber(offset + 259, $std_cost53, value);
	}
	
	/**
	 * 標準原価５３. Standard cost 53.<p>
	 *
	 */
	public void std_cost53(float value) {
		setConstNumber(offset + 259, $std_cost53, value);
	}
	
	/**
	 * 標準原価５３. Standard cost 53.<p>
	 *
	 */
	public void std_cost53(double value) {
		setConstNumber(offset + 259, $std_cost53, value);
	}
	
	/**
	 * 標準原価５４. Standard cost 54.<p>
	 *
	 */
	public MCNumber std_cost54() {
		return getConstNumber(offset + 260, $std_cost54);
	}

	/**
	 * 標準原価５４. Standard cost 54.<p>
	 *
	 */
	public void std_cost54(MCNumber value) {
		setConstNumber(offset + 260, $std_cost54, value);
	}
	
	/**
	 * 標準原価５４. Standard cost 54.<p>
	 *
	 */
	public void std_cost54(int value) {
		setConstNumber(offset + 260, $std_cost54, value);
	}
	
	/**
	 * 標準原価５４. Standard cost 54.<p>
	 *
	 */
	public void std_cost54(long value) {
		setConstNumber(offset + 260, $std_cost54, value);
	}
	
	/**
	 * 標準原価５４. Standard cost 54.<p>
	 *
	 */
	public void std_cost54(float value) {
		setConstNumber(offset + 260, $std_cost54, value);
	}
	
	/**
	 * 標準原価５４. Standard cost 54.<p>
	 *
	 */
	public void std_cost54(double value) {
		setConstNumber(offset + 260, $std_cost54, value);
	}
	
	/**
	 * 標準原価５５. Standard cost 55.<p>
	 *
	 */
	public MCNumber std_cost55() {
		return getConstNumber(offset + 261, $std_cost55);
	}

	/**
	 * 標準原価５５. Standard cost 55.<p>
	 *
	 */
	public void std_cost55(MCNumber value) {
		setConstNumber(offset + 261, $std_cost55, value);
	}
	
	/**
	 * 標準原価５５. Standard cost 55.<p>
	 *
	 */
	public void std_cost55(int value) {
		setConstNumber(offset + 261, $std_cost55, value);
	}
	
	/**
	 * 標準原価５５. Standard cost 55.<p>
	 *
	 */
	public void std_cost55(long value) {
		setConstNumber(offset + 261, $std_cost55, value);
	}
	
	/**
	 * 標準原価５５. Standard cost 55.<p>
	 *
	 */
	public void std_cost55(float value) {
		setConstNumber(offset + 261, $std_cost55, value);
	}
	
	/**
	 * 標準原価５５. Standard cost 55.<p>
	 *
	 */
	public void std_cost55(double value) {
		setConstNumber(offset + 261, $std_cost55, value);
	}
	
	/**
	 * 標準原価５６. Standard cost 56.<p>
	 *
	 */
	public MCNumber std_cost56() {
		return getConstNumber(offset + 262, $std_cost56);
	}

	/**
	 * 標準原価５６. Standard cost 56.<p>
	 *
	 */
	public void std_cost56(MCNumber value) {
		setConstNumber(offset + 262, $std_cost56, value);
	}
	
	/**
	 * 標準原価５６. Standard cost 56.<p>
	 *
	 */
	public void std_cost56(int value) {
		setConstNumber(offset + 262, $std_cost56, value);
	}
	
	/**
	 * 標準原価５６. Standard cost 56.<p>
	 *
	 */
	public void std_cost56(long value) {
		setConstNumber(offset + 262, $std_cost56, value);
	}
	
	/**
	 * 標準原価５６. Standard cost 56.<p>
	 *
	 */
	public void std_cost56(float value) {
		setConstNumber(offset + 262, $std_cost56, value);
	}
	
	/**
	 * 標準原価５６. Standard cost 56.<p>
	 *
	 */
	public void std_cost56(double value) {
		setConstNumber(offset + 262, $std_cost56, value);
	}
	
	/**
	 * 標準原価５７. Standard cost 57.<p>
	 *
	 */
	public MCNumber std_cost57() {
		return getConstNumber(offset + 263, $std_cost57);
	}

	/**
	 * 標準原価５７. Standard cost 57.<p>
	 *
	 */
	public void std_cost57(MCNumber value) {
		setConstNumber(offset + 263, $std_cost57, value);
	}
	
	/**
	 * 標準原価５７. Standard cost 57.<p>
	 *
	 */
	public void std_cost57(int value) {
		setConstNumber(offset + 263, $std_cost57, value);
	}
	
	/**
	 * 標準原価５７. Standard cost 57.<p>
	 *
	 */
	public void std_cost57(long value) {
		setConstNumber(offset + 263, $std_cost57, value);
	}
	
	/**
	 * 標準原価５７. Standard cost 57.<p>
	 *
	 */
	public void std_cost57(float value) {
		setConstNumber(offset + 263, $std_cost57, value);
	}
	
	/**
	 * 標準原価５７. Standard cost 57.<p>
	 *
	 */
	public void std_cost57(double value) {
		setConstNumber(offset + 263, $std_cost57, value);
	}
	
	/**
	 * 標準原価５８. Standard cost 58.<p>
	 *
	 */
	public MCNumber std_cost58() {
		return getConstNumber(offset + 264, $std_cost58);
	}

	/**
	 * 標準原価５８. Standard cost 58.<p>
	 *
	 */
	public void std_cost58(MCNumber value) {
		setConstNumber(offset + 264, $std_cost58, value);
	}
	
	/**
	 * 標準原価５８. Standard cost 58.<p>
	 *
	 */
	public void std_cost58(int value) {
		setConstNumber(offset + 264, $std_cost58, value);
	}
	
	/**
	 * 標準原価５８. Standard cost 58.<p>
	 *
	 */
	public void std_cost58(long value) {
		setConstNumber(offset + 264, $std_cost58, value);
	}
	
	/**
	 * 標準原価５８. Standard cost 58.<p>
	 *
	 */
	public void std_cost58(float value) {
		setConstNumber(offset + 264, $std_cost58, value);
	}
	
	/**
	 * 標準原価５８. Standard cost 58.<p>
	 *
	 */
	public void std_cost58(double value) {
		setConstNumber(offset + 264, $std_cost58, value);
	}
	
	/**
	 * 標準原価５９. Standard cost 59.<p>
	 *
	 */
	public MCNumber std_cost59() {
		return getConstNumber(offset + 265, $std_cost59);
	}

	/**
	 * 標準原価５９. Standard cost 59.<p>
	 *
	 */
	public void std_cost59(MCNumber value) {
		setConstNumber(offset + 265, $std_cost59, value);
	}
	
	/**
	 * 標準原価５９. Standard cost 59.<p>
	 *
	 */
	public void std_cost59(int value) {
		setConstNumber(offset + 265, $std_cost59, value);
	}
	
	/**
	 * 標準原価５９. Standard cost 59.<p>
	 *
	 */
	public void std_cost59(long value) {
		setConstNumber(offset + 265, $std_cost59, value);
	}
	
	/**
	 * 標準原価５９. Standard cost 59.<p>
	 *
	 */
	public void std_cost59(float value) {
		setConstNumber(offset + 265, $std_cost59, value);
	}
	
	/**
	 * 標準原価５９. Standard cost 59.<p>
	 *
	 */
	public void std_cost59(double value) {
		setConstNumber(offset + 265, $std_cost59, value);
	}
	
	/**
	 * 標準原価６０. Standard cost 60.<p>
	 *
	 */
	public MCNumber std_cost60() {
		return getConstNumber(offset + 266, $std_cost60);
	}

	/**
	 * 標準原価６０. Standard cost 60.<p>
	 *
	 */
	public void std_cost60(MCNumber value) {
		setConstNumber(offset + 266, $std_cost60, value);
	}
	
	/**
	 * 標準原価６０. Standard cost 60.<p>
	 *
	 */
	public void std_cost60(int value) {
		setConstNumber(offset + 266, $std_cost60, value);
	}
	
	/**
	 * 標準原価６０. Standard cost 60.<p>
	 *
	 */
	public void std_cost60(long value) {
		setConstNumber(offset + 266, $std_cost60, value);
	}
	
	/**
	 * 標準原価６０. Standard cost 60.<p>
	 *
	 */
	public void std_cost60(float value) {
		setConstNumber(offset + 266, $std_cost60, value);
	}
	
	/**
	 * 標準原価６０. Standard cost 60.<p>
	 *
	 */
	public void std_cost60(double value) {
		setConstNumber(offset + 266, $std_cost60, value);
	}
	
	/**
	 * 標準原価６１. Standard cost 61.<p>
	 *
	 */
	public MCNumber std_cost61() {
		return getConstNumber(offset + 267, $std_cost61);
	}

	/**
	 * 標準原価６１. Standard cost 61.<p>
	 *
	 */
	public void std_cost61(MCNumber value) {
		setConstNumber(offset + 267, $std_cost61, value);
	}
	
	/**
	 * 標準原価６１. Standard cost 61.<p>
	 *
	 */
	public void std_cost61(int value) {
		setConstNumber(offset + 267, $std_cost61, value);
	}
	
	/**
	 * 標準原価６１. Standard cost 61.<p>
	 *
	 */
	public void std_cost61(long value) {
		setConstNumber(offset + 267, $std_cost61, value);
	}
	
	/**
	 * 標準原価６１. Standard cost 61.<p>
	 *
	 */
	public void std_cost61(float value) {
		setConstNumber(offset + 267, $std_cost61, value);
	}
	
	/**
	 * 標準原価６１. Standard cost 61.<p>
	 *
	 */
	public void std_cost61(double value) {
		setConstNumber(offset + 267, $std_cost61, value);
	}
	
	/**
	 * 標準原価６２. Standard cost 62.<p>
	 *
	 */
	public MCNumber std_cost62() {
		return getConstNumber(offset + 268, $std_cost62);
	}

	/**
	 * 標準原価６２. Standard cost 62.<p>
	 *
	 */
	public void std_cost62(MCNumber value) {
		setConstNumber(offset + 268, $std_cost62, value);
	}
	
	/**
	 * 標準原価６２. Standard cost 62.<p>
	 *
	 */
	public void std_cost62(int value) {
		setConstNumber(offset + 268, $std_cost62, value);
	}
	
	/**
	 * 標準原価６２. Standard cost 62.<p>
	 *
	 */
	public void std_cost62(long value) {
		setConstNumber(offset + 268, $std_cost62, value);
	}
	
	/**
	 * 標準原価６２. Standard cost 62.<p>
	 *
	 */
	public void std_cost62(float value) {
		setConstNumber(offset + 268, $std_cost62, value);
	}
	
	/**
	 * 標準原価６２. Standard cost 62.<p>
	 *
	 */
	public void std_cost62(double value) {
		setConstNumber(offset + 268, $std_cost62, value);
	}
	
	/**
	 * 標準原価６３. Standard cost 63.<p>
	 *
	 */
	public MCNumber std_cost63() {
		return getConstNumber(offset + 269, $std_cost63);
	}

	/**
	 * 標準原価６３. Standard cost 63.<p>
	 *
	 */
	public void std_cost63(MCNumber value) {
		setConstNumber(offset + 269, $std_cost63, value);
	}
	
	/**
	 * 標準原価６３. Standard cost 63.<p>
	 *
	 */
	public void std_cost63(int value) {
		setConstNumber(offset + 269, $std_cost63, value);
	}
	
	/**
	 * 標準原価６３. Standard cost 63.<p>
	 *
	 */
	public void std_cost63(long value) {
		setConstNumber(offset + 269, $std_cost63, value);
	}
	
	/**
	 * 標準原価６３. Standard cost 63.<p>
	 *
	 */
	public void std_cost63(float value) {
		setConstNumber(offset + 269, $std_cost63, value);
	}
	
	/**
	 * 標準原価６３. Standard cost 63.<p>
	 *
	 */
	public void std_cost63(double value) {
		setConstNumber(offset + 269, $std_cost63, value);
	}
	
	/**
	 * 標準原価６４. Standard cost 64.<p>
	 *
	 */
	public MCNumber std_cost64() {
		return getConstNumber(offset + 270, $std_cost64);
	}

	/**
	 * 標準原価６４. Standard cost 64.<p>
	 *
	 */
	public void std_cost64(MCNumber value) {
		setConstNumber(offset + 270, $std_cost64, value);
	}
	
	/**
	 * 標準原価６４. Standard cost 64.<p>
	 *
	 */
	public void std_cost64(int value) {
		setConstNumber(offset + 270, $std_cost64, value);
	}
	
	/**
	 * 標準原価６４. Standard cost 64.<p>
	 *
	 */
	public void std_cost64(long value) {
		setConstNumber(offset + 270, $std_cost64, value);
	}
	
	/**
	 * 標準原価６４. Standard cost 64.<p>
	 *
	 */
	public void std_cost64(float value) {
		setConstNumber(offset + 270, $std_cost64, value);
	}
	
	/**
	 * 標準原価６４. Standard cost 64.<p>
	 *
	 */
	public void std_cost64(double value) {
		setConstNumber(offset + 270, $std_cost64, value);
	}
	
	/**
	 * 標準原価６５. Standard cost 65.<p>
	 *
	 */
	public MCNumber std_cost65() {
		return getConstNumber(offset + 271, $std_cost65);
	}

	/**
	 * 標準原価６５. Standard cost 65.<p>
	 *
	 */
	public void std_cost65(MCNumber value) {
		setConstNumber(offset + 271, $std_cost65, value);
	}
	
	/**
	 * 標準原価６５. Standard cost 65.<p>
	 *
	 */
	public void std_cost65(int value) {
		setConstNumber(offset + 271, $std_cost65, value);
	}
	
	/**
	 * 標準原価６５. Standard cost 65.<p>
	 *
	 */
	public void std_cost65(long value) {
		setConstNumber(offset + 271, $std_cost65, value);
	}
	
	/**
	 * 標準原価６５. Standard cost 65.<p>
	 *
	 */
	public void std_cost65(float value) {
		setConstNumber(offset + 271, $std_cost65, value);
	}
	
	/**
	 * 標準原価６５. Standard cost 65.<p>
	 *
	 */
	public void std_cost65(double value) {
		setConstNumber(offset + 271, $std_cost65, value);
	}
	
	/**
	 * 標準原価６６. Standard cost 66.<p>
	 *
	 */
	public MCNumber std_cost66() {
		return getConstNumber(offset + 272, $std_cost66);
	}

	/**
	 * 標準原価６６. Standard cost 66.<p>
	 *
	 */
	public void std_cost66(MCNumber value) {
		setConstNumber(offset + 272, $std_cost66, value);
	}
	
	/**
	 * 標準原価６６. Standard cost 66.<p>
	 *
	 */
	public void std_cost66(int value) {
		setConstNumber(offset + 272, $std_cost66, value);
	}
	
	/**
	 * 標準原価６６. Standard cost 66.<p>
	 *
	 */
	public void std_cost66(long value) {
		setConstNumber(offset + 272, $std_cost66, value);
	}
	
	/**
	 * 標準原価６６. Standard cost 66.<p>
	 *
	 */
	public void std_cost66(float value) {
		setConstNumber(offset + 272, $std_cost66, value);
	}
	
	/**
	 * 標準原価６６. Standard cost 66.<p>
	 *
	 */
	public void std_cost66(double value) {
		setConstNumber(offset + 272, $std_cost66, value);
	}
	
	/**
	 * 標準原価６７. Standard cost 67.<p>
	 *
	 */
	public MCNumber std_cost67() {
		return getConstNumber(offset + 273, $std_cost67);
	}

	/**
	 * 標準原価６７. Standard cost 67.<p>
	 *
	 */
	public void std_cost67(MCNumber value) {
		setConstNumber(offset + 273, $std_cost67, value);
	}
	
	/**
	 * 標準原価６７. Standard cost 67.<p>
	 *
	 */
	public void std_cost67(int value) {
		setConstNumber(offset + 273, $std_cost67, value);
	}
	
	/**
	 * 標準原価６７. Standard cost 67.<p>
	 *
	 */
	public void std_cost67(long value) {
		setConstNumber(offset + 273, $std_cost67, value);
	}
	
	/**
	 * 標準原価６７. Standard cost 67.<p>
	 *
	 */
	public void std_cost67(float value) {
		setConstNumber(offset + 273, $std_cost67, value);
	}
	
	/**
	 * 標準原価６７. Standard cost 67.<p>
	 *
	 */
	public void std_cost67(double value) {
		setConstNumber(offset + 273, $std_cost67, value);
	}
	
	/**
	 * 標準原価６８. Standard cost 68.<p>
	 *
	 */
	public MCNumber std_cost68() {
		return getConstNumber(offset + 274, $std_cost68);
	}

	/**
	 * 標準原価６８. Standard cost 68.<p>
	 *
	 */
	public void std_cost68(MCNumber value) {
		setConstNumber(offset + 274, $std_cost68, value);
	}
	
	/**
	 * 標準原価６８. Standard cost 68.<p>
	 *
	 */
	public void std_cost68(int value) {
		setConstNumber(offset + 274, $std_cost68, value);
	}
	
	/**
	 * 標準原価６８. Standard cost 68.<p>
	 *
	 */
	public void std_cost68(long value) {
		setConstNumber(offset + 274, $std_cost68, value);
	}
	
	/**
	 * 標準原価６８. Standard cost 68.<p>
	 *
	 */
	public void std_cost68(float value) {
		setConstNumber(offset + 274, $std_cost68, value);
	}
	
	/**
	 * 標準原価６８. Standard cost 68.<p>
	 *
	 */
	public void std_cost68(double value) {
		setConstNumber(offset + 274, $std_cost68, value);
	}
	
	/**
	 * 標準原価６９. Standard cost 69.<p>
	 *
	 */
	public MCNumber std_cost69() {
		return getConstNumber(offset + 275, $std_cost69);
	}

	/**
	 * 標準原価６９. Standard cost 69.<p>
	 *
	 */
	public void std_cost69(MCNumber value) {
		setConstNumber(offset + 275, $std_cost69, value);
	}
	
	/**
	 * 標準原価６９. Standard cost 69.<p>
	 *
	 */
	public void std_cost69(int value) {
		setConstNumber(offset + 275, $std_cost69, value);
	}
	
	/**
	 * 標準原価６９. Standard cost 69.<p>
	 *
	 */
	public void std_cost69(long value) {
		setConstNumber(offset + 275, $std_cost69, value);
	}
	
	/**
	 * 標準原価６９. Standard cost 69.<p>
	 *
	 */
	public void std_cost69(float value) {
		setConstNumber(offset + 275, $std_cost69, value);
	}
	
	/**
	 * 標準原価６９. Standard cost 69.<p>
	 *
	 */
	public void std_cost69(double value) {
		setConstNumber(offset + 275, $std_cost69, value);
	}
	
	/**
	 * 標準原価７０. Standard cost 70.<p>
	 *
	 */
	public MCNumber std_cost70() {
		return getConstNumber(offset + 276, $std_cost70);
	}

	/**
	 * 標準原価７０. Standard cost 70.<p>
	 *
	 */
	public void std_cost70(MCNumber value) {
		setConstNumber(offset + 276, $std_cost70, value);
	}
	
	/**
	 * 標準原価７０. Standard cost 70.<p>
	 *
	 */
	public void std_cost70(int value) {
		setConstNumber(offset + 276, $std_cost70, value);
	}
	
	/**
	 * 標準原価７０. Standard cost 70.<p>
	 *
	 */
	public void std_cost70(long value) {
		setConstNumber(offset + 276, $std_cost70, value);
	}
	
	/**
	 * 標準原価７０. Standard cost 70.<p>
	 *
	 */
	public void std_cost70(float value) {
		setConstNumber(offset + 276, $std_cost70, value);
	}
	
	/**
	 * 標準原価７０. Standard cost 70.<p>
	 *
	 */
	public void std_cost70(double value) {
		setConstNumber(offset + 276, $std_cost70, value);
	}
	
	/**
	 * 標準原価７１. Standard cost 71.<p>
	 *
	 */
	public MCNumber std_cost71() {
		return getConstNumber(offset + 277, $std_cost71);
	}

	/**
	 * 標準原価７１. Standard cost 71.<p>
	 *
	 */
	public void std_cost71(MCNumber value) {
		setConstNumber(offset + 277, $std_cost71, value);
	}
	
	/**
	 * 標準原価７１. Standard cost 71.<p>
	 *
	 */
	public void std_cost71(int value) {
		setConstNumber(offset + 277, $std_cost71, value);
	}
	
	/**
	 * 標準原価７１. Standard cost 71.<p>
	 *
	 */
	public void std_cost71(long value) {
		setConstNumber(offset + 277, $std_cost71, value);
	}
	
	/**
	 * 標準原価７１. Standard cost 71.<p>
	 *
	 */
	public void std_cost71(float value) {
		setConstNumber(offset + 277, $std_cost71, value);
	}
	
	/**
	 * 標準原価７１. Standard cost 71.<p>
	 *
	 */
	public void std_cost71(double value) {
		setConstNumber(offset + 277, $std_cost71, value);
	}
	
	/**
	 * 標準原価７２. Standard cost 72.<p>
	 *
	 */
	public MCNumber std_cost72() {
		return getConstNumber(offset + 278, $std_cost72);
	}

	/**
	 * 標準原価７２. Standard cost 72.<p>
	 *
	 */
	public void std_cost72(MCNumber value) {
		setConstNumber(offset + 278, $std_cost72, value);
	}
	
	/**
	 * 標準原価７２. Standard cost 72.<p>
	 *
	 */
	public void std_cost72(int value) {
		setConstNumber(offset + 278, $std_cost72, value);
	}
	
	/**
	 * 標準原価７２. Standard cost 72.<p>
	 *
	 */
	public void std_cost72(long value) {
		setConstNumber(offset + 278, $std_cost72, value);
	}
	
	/**
	 * 標準原価７２. Standard cost 72.<p>
	 *
	 */
	public void std_cost72(float value) {
		setConstNumber(offset + 278, $std_cost72, value);
	}
	
	/**
	 * 標準原価７２. Standard cost 72.<p>
	 *
	 */
	public void std_cost72(double value) {
		setConstNumber(offset + 278, $std_cost72, value);
	}
	
	/**
	 * 標準原価７３. Standard cost 73.<p>
	 *
	 */
	public MCNumber std_cost73() {
		return getConstNumber(offset + 279, $std_cost73);
	}

	/**
	 * 標準原価７３. Standard cost 73.<p>
	 *
	 */
	public void std_cost73(MCNumber value) {
		setConstNumber(offset + 279, $std_cost73, value);
	}
	
	/**
	 * 標準原価７３. Standard cost 73.<p>
	 *
	 */
	public void std_cost73(int value) {
		setConstNumber(offset + 279, $std_cost73, value);
	}
	
	/**
	 * 標準原価７３. Standard cost 73.<p>
	 *
	 */
	public void std_cost73(long value) {
		setConstNumber(offset + 279, $std_cost73, value);
	}
	
	/**
	 * 標準原価７３. Standard cost 73.<p>
	 *
	 */
	public void std_cost73(float value) {
		setConstNumber(offset + 279, $std_cost73, value);
	}
	
	/**
	 * 標準原価７３. Standard cost 73.<p>
	 *
	 */
	public void std_cost73(double value) {
		setConstNumber(offset + 279, $std_cost73, value);
	}
	
	/**
	 * 標準原価７４. Standard cost 74.<p>
	 *
	 */
	public MCNumber std_cost74() {
		return getConstNumber(offset + 280, $std_cost74);
	}

	/**
	 * 標準原価７４. Standard cost 74.<p>
	 *
	 */
	public void std_cost74(MCNumber value) {
		setConstNumber(offset + 280, $std_cost74, value);
	}
	
	/**
	 * 標準原価７４. Standard cost 74.<p>
	 *
	 */
	public void std_cost74(int value) {
		setConstNumber(offset + 280, $std_cost74, value);
	}
	
	/**
	 * 標準原価７４. Standard cost 74.<p>
	 *
	 */
	public void std_cost74(long value) {
		setConstNumber(offset + 280, $std_cost74, value);
	}
	
	/**
	 * 標準原価７４. Standard cost 74.<p>
	 *
	 */
	public void std_cost74(float value) {
		setConstNumber(offset + 280, $std_cost74, value);
	}
	
	/**
	 * 標準原価７４. Standard cost 74.<p>
	 *
	 */
	public void std_cost74(double value) {
		setConstNumber(offset + 280, $std_cost74, value);
	}
	
	/**
	 * 標準原価７５. Standard cost 75.<p>
	 *
	 */
	public MCNumber std_cost75() {
		return getConstNumber(offset + 281, $std_cost75);
	}

	/**
	 * 標準原価７５. Standard cost 75.<p>
	 *
	 */
	public void std_cost75(MCNumber value) {
		setConstNumber(offset + 281, $std_cost75, value);
	}
	
	/**
	 * 標準原価７５. Standard cost 75.<p>
	 *
	 */
	public void std_cost75(int value) {
		setConstNumber(offset + 281, $std_cost75, value);
	}
	
	/**
	 * 標準原価７５. Standard cost 75.<p>
	 *
	 */
	public void std_cost75(long value) {
		setConstNumber(offset + 281, $std_cost75, value);
	}
	
	/**
	 * 標準原価７５. Standard cost 75.<p>
	 *
	 */
	public void std_cost75(float value) {
		setConstNumber(offset + 281, $std_cost75, value);
	}
	
	/**
	 * 標準原価７５. Standard cost 75.<p>
	 *
	 */
	public void std_cost75(double value) {
		setConstNumber(offset + 281, $std_cost75, value);
	}
	
	/**
	 * 標準原価７６. Standard cost 76.<p>
	 *
	 */
	public MCNumber std_cost76() {
		return getConstNumber(offset + 282, $std_cost76);
	}

	/**
	 * 標準原価７６. Standard cost 76.<p>
	 *
	 */
	public void std_cost76(MCNumber value) {
		setConstNumber(offset + 282, $std_cost76, value);
	}
	
	/**
	 * 標準原価７６. Standard cost 76.<p>
	 *
	 */
	public void std_cost76(int value) {
		setConstNumber(offset + 282, $std_cost76, value);
	}
	
	/**
	 * 標準原価７６. Standard cost 76.<p>
	 *
	 */
	public void std_cost76(long value) {
		setConstNumber(offset + 282, $std_cost76, value);
	}
	
	/**
	 * 標準原価７６. Standard cost 76.<p>
	 *
	 */
	public void std_cost76(float value) {
		setConstNumber(offset + 282, $std_cost76, value);
	}
	
	/**
	 * 標準原価７６. Standard cost 76.<p>
	 *
	 */
	public void std_cost76(double value) {
		setConstNumber(offset + 282, $std_cost76, value);
	}
	
	/**
	 * 標準原価７７. Standard cost 77.<p>
	 *
	 */
	public MCNumber std_cost77() {
		return getConstNumber(offset + 283, $std_cost77);
	}

	/**
	 * 標準原価７７. Standard cost 77.<p>
	 *
	 */
	public void std_cost77(MCNumber value) {
		setConstNumber(offset + 283, $std_cost77, value);
	}
	
	/**
	 * 標準原価７７. Standard cost 77.<p>
	 *
	 */
	public void std_cost77(int value) {
		setConstNumber(offset + 283, $std_cost77, value);
	}
	
	/**
	 * 標準原価７７. Standard cost 77.<p>
	 *
	 */
	public void std_cost77(long value) {
		setConstNumber(offset + 283, $std_cost77, value);
	}
	
	/**
	 * 標準原価７７. Standard cost 77.<p>
	 *
	 */
	public void std_cost77(float value) {
		setConstNumber(offset + 283, $std_cost77, value);
	}
	
	/**
	 * 標準原価７７. Standard cost 77.<p>
	 *
	 */
	public void std_cost77(double value) {
		setConstNumber(offset + 283, $std_cost77, value);
	}
	
	/**
	 * 標準原価７８. Standard cost 78.<p>
	 *
	 */
	public MCNumber std_cost78() {
		return getConstNumber(offset + 284, $std_cost78);
	}

	/**
	 * 標準原価７８. Standard cost 78.<p>
	 *
	 */
	public void std_cost78(MCNumber value) {
		setConstNumber(offset + 284, $std_cost78, value);
	}
	
	/**
	 * 標準原価７８. Standard cost 78.<p>
	 *
	 */
	public void std_cost78(int value) {
		setConstNumber(offset + 284, $std_cost78, value);
	}
	
	/**
	 * 標準原価７８. Standard cost 78.<p>
	 *
	 */
	public void std_cost78(long value) {
		setConstNumber(offset + 284, $std_cost78, value);
	}
	
	/**
	 * 標準原価７８. Standard cost 78.<p>
	 *
	 */
	public void std_cost78(float value) {
		setConstNumber(offset + 284, $std_cost78, value);
	}
	
	/**
	 * 標準原価７８. Standard cost 78.<p>
	 *
	 */
	public void std_cost78(double value) {
		setConstNumber(offset + 284, $std_cost78, value);
	}
	
	/**
	 * 標準原価７９. Standard cost 79.<p>
	 *
	 */
	public MCNumber std_cost79() {
		return getConstNumber(offset + 285, $std_cost79);
	}

	/**
	 * 標準原価７９. Standard cost 79.<p>
	 *
	 */
	public void std_cost79(MCNumber value) {
		setConstNumber(offset + 285, $std_cost79, value);
	}
	
	/**
	 * 標準原価７９. Standard cost 79.<p>
	 *
	 */
	public void std_cost79(int value) {
		setConstNumber(offset + 285, $std_cost79, value);
	}
	
	/**
	 * 標準原価７９. Standard cost 79.<p>
	 *
	 */
	public void std_cost79(long value) {
		setConstNumber(offset + 285, $std_cost79, value);
	}
	
	/**
	 * 標準原価７９. Standard cost 79.<p>
	 *
	 */
	public void std_cost79(float value) {
		setConstNumber(offset + 285, $std_cost79, value);
	}
	
	/**
	 * 標準原価７９. Standard cost 79.<p>
	 *
	 */
	public void std_cost79(double value) {
		setConstNumber(offset + 285, $std_cost79, value);
	}
	
	/**
	 * 標準原価８０. Standard cost 80.<p>
	 *
	 */
	public MCNumber std_cost80() {
		return getConstNumber(offset + 286, $std_cost80);
	}

	/**
	 * 標準原価８０. Standard cost 80.<p>
	 *
	 */
	public void std_cost80(MCNumber value) {
		setConstNumber(offset + 286, $std_cost80, value);
	}
	
	/**
	 * 標準原価８０. Standard cost 80.<p>
	 *
	 */
	public void std_cost80(int value) {
		setConstNumber(offset + 286, $std_cost80, value);
	}
	
	/**
	 * 標準原価８０. Standard cost 80.<p>
	 *
	 */
	public void std_cost80(long value) {
		setConstNumber(offset + 286, $std_cost80, value);
	}
	
	/**
	 * 標準原価８０. Standard cost 80.<p>
	 *
	 */
	public void std_cost80(float value) {
		setConstNumber(offset + 286, $std_cost80, value);
	}
	
	/**
	 * 標準原価８０. Standard cost 80.<p>
	 *
	 */
	public void std_cost80(double value) {
		setConstNumber(offset + 286, $std_cost80, value);
	}
	
	/**
	 * 標準原価８１. Standard cost 81.<p>
	 *
	 */
	public MCNumber std_cost81() {
		return getConstNumber(offset + 287, $std_cost81);
	}

	/**
	 * 標準原価８１. Standard cost 81.<p>
	 *
	 */
	public void std_cost81(MCNumber value) {
		setConstNumber(offset + 287, $std_cost81, value);
	}
	
	/**
	 * 標準原価８１. Standard cost 81.<p>
	 *
	 */
	public void std_cost81(int value) {
		setConstNumber(offset + 287, $std_cost81, value);
	}
	
	/**
	 * 標準原価８１. Standard cost 81.<p>
	 *
	 */
	public void std_cost81(long value) {
		setConstNumber(offset + 287, $std_cost81, value);
	}
	
	/**
	 * 標準原価８１. Standard cost 81.<p>
	 *
	 */
	public void std_cost81(float value) {
		setConstNumber(offset + 287, $std_cost81, value);
	}
	
	/**
	 * 標準原価８１. Standard cost 81.<p>
	 *
	 */
	public void std_cost81(double value) {
		setConstNumber(offset + 287, $std_cost81, value);
	}
	
	/**
	 * 標準原価８２. Standard cost 82.<p>
	 *
	 */
	public MCNumber std_cost82() {
		return getConstNumber(offset + 288, $std_cost82);
	}

	/**
	 * 標準原価８２. Standard cost 82.<p>
	 *
	 */
	public void std_cost82(MCNumber value) {
		setConstNumber(offset + 288, $std_cost82, value);
	}
	
	/**
	 * 標準原価８２. Standard cost 82.<p>
	 *
	 */
	public void std_cost82(int value) {
		setConstNumber(offset + 288, $std_cost82, value);
	}
	
	/**
	 * 標準原価８２. Standard cost 82.<p>
	 *
	 */
	public void std_cost82(long value) {
		setConstNumber(offset + 288, $std_cost82, value);
	}
	
	/**
	 * 標準原価８２. Standard cost 82.<p>
	 *
	 */
	public void std_cost82(float value) {
		setConstNumber(offset + 288, $std_cost82, value);
	}
	
	/**
	 * 標準原価８２. Standard cost 82.<p>
	 *
	 */
	public void std_cost82(double value) {
		setConstNumber(offset + 288, $std_cost82, value);
	}
	
	/**
	 * 標準原価８３. Standard cost 83.<p>
	 *
	 */
	public MCNumber std_cost83() {
		return getConstNumber(offset + 289, $std_cost83);
	}

	/**
	 * 標準原価８３. Standard cost 83.<p>
	 *
	 */
	public void std_cost83(MCNumber value) {
		setConstNumber(offset + 289, $std_cost83, value);
	}
	
	/**
	 * 標準原価８３. Standard cost 83.<p>
	 *
	 */
	public void std_cost83(int value) {
		setConstNumber(offset + 289, $std_cost83, value);
	}
	
	/**
	 * 標準原価８３. Standard cost 83.<p>
	 *
	 */
	public void std_cost83(long value) {
		setConstNumber(offset + 289, $std_cost83, value);
	}
	
	/**
	 * 標準原価８３. Standard cost 83.<p>
	 *
	 */
	public void std_cost83(float value) {
		setConstNumber(offset + 289, $std_cost83, value);
	}
	
	/**
	 * 標準原価８３. Standard cost 83.<p>
	 *
	 */
	public void std_cost83(double value) {
		setConstNumber(offset + 289, $std_cost83, value);
	}
	
	/**
	 * 標準原価８４. Standard cost 84.<p>
	 *
	 */
	public MCNumber std_cost84() {
		return getConstNumber(offset + 290, $std_cost84);
	}

	/**
	 * 標準原価８４. Standard cost 84.<p>
	 *
	 */
	public void std_cost84(MCNumber value) {
		setConstNumber(offset + 290, $std_cost84, value);
	}
	
	/**
	 * 標準原価８４. Standard cost 84.<p>
	 *
	 */
	public void std_cost84(int value) {
		setConstNumber(offset + 290, $std_cost84, value);
	}
	
	/**
	 * 標準原価８４. Standard cost 84.<p>
	 *
	 */
	public void std_cost84(long value) {
		setConstNumber(offset + 290, $std_cost84, value);
	}
	
	/**
	 * 標準原価８４. Standard cost 84.<p>
	 *
	 */
	public void std_cost84(float value) {
		setConstNumber(offset + 290, $std_cost84, value);
	}
	
	/**
	 * 標準原価８４. Standard cost 84.<p>
	 *
	 */
	public void std_cost84(double value) {
		setConstNumber(offset + 290, $std_cost84, value);
	}
	
	/**
	 * 標準原価８５. Standard cost 85.<p>
	 *
	 */
	public MCNumber std_cost85() {
		return getConstNumber(offset + 291, $std_cost85);
	}

	/**
	 * 標準原価８５. Standard cost 85.<p>
	 *
	 */
	public void std_cost85(MCNumber value) {
		setConstNumber(offset + 291, $std_cost85, value);
	}
	
	/**
	 * 標準原価８５. Standard cost 85.<p>
	 *
	 */
	public void std_cost85(int value) {
		setConstNumber(offset + 291, $std_cost85, value);
	}
	
	/**
	 * 標準原価８５. Standard cost 85.<p>
	 *
	 */
	public void std_cost85(long value) {
		setConstNumber(offset + 291, $std_cost85, value);
	}
	
	/**
	 * 標準原価８５. Standard cost 85.<p>
	 *
	 */
	public void std_cost85(float value) {
		setConstNumber(offset + 291, $std_cost85, value);
	}
	
	/**
	 * 標準原価８５. Standard cost 85.<p>
	 *
	 */
	public void std_cost85(double value) {
		setConstNumber(offset + 291, $std_cost85, value);
	}
	
	/**
	 * 標準原価８６. Standard cost 86.<p>
	 *
	 */
	public MCNumber std_cost86() {
		return getConstNumber(offset + 292, $std_cost86);
	}

	/**
	 * 標準原価８６. Standard cost 86.<p>
	 *
	 */
	public void std_cost86(MCNumber value) {
		setConstNumber(offset + 292, $std_cost86, value);
	}
	
	/**
	 * 標準原価８６. Standard cost 86.<p>
	 *
	 */
	public void std_cost86(int value) {
		setConstNumber(offset + 292, $std_cost86, value);
	}
	
	/**
	 * 標準原価８６. Standard cost 86.<p>
	 *
	 */
	public void std_cost86(long value) {
		setConstNumber(offset + 292, $std_cost86, value);
	}
	
	/**
	 * 標準原価８６. Standard cost 86.<p>
	 *
	 */
	public void std_cost86(float value) {
		setConstNumber(offset + 292, $std_cost86, value);
	}
	
	/**
	 * 標準原価８６. Standard cost 86.<p>
	 *
	 */
	public void std_cost86(double value) {
		setConstNumber(offset + 292, $std_cost86, value);
	}
	
	/**
	 * 標準原価８７. Standard cost 87.<p>
	 *
	 */
	public MCNumber std_cost87() {
		return getConstNumber(offset + 293, $std_cost87);
	}

	/**
	 * 標準原価８７. Standard cost 87.<p>
	 *
	 */
	public void std_cost87(MCNumber value) {
		setConstNumber(offset + 293, $std_cost87, value);
	}
	
	/**
	 * 標準原価８７. Standard cost 87.<p>
	 *
	 */
	public void std_cost87(int value) {
		setConstNumber(offset + 293, $std_cost87, value);
	}
	
	/**
	 * 標準原価８７. Standard cost 87.<p>
	 *
	 */
	public void std_cost87(long value) {
		setConstNumber(offset + 293, $std_cost87, value);
	}
	
	/**
	 * 標準原価８７. Standard cost 87.<p>
	 *
	 */
	public void std_cost87(float value) {
		setConstNumber(offset + 293, $std_cost87, value);
	}
	
	/**
	 * 標準原価８７. Standard cost 87.<p>
	 *
	 */
	public void std_cost87(double value) {
		setConstNumber(offset + 293, $std_cost87, value);
	}
	
	/**
	 * 標準原価８８. Standard cost 88.<p>
	 *
	 */
	public MCNumber std_cost88() {
		return getConstNumber(offset + 294, $std_cost88);
	}

	/**
	 * 標準原価８８. Standard cost 88.<p>
	 *
	 */
	public void std_cost88(MCNumber value) {
		setConstNumber(offset + 294, $std_cost88, value);
	}
	
	/**
	 * 標準原価８８. Standard cost 88.<p>
	 *
	 */
	public void std_cost88(int value) {
		setConstNumber(offset + 294, $std_cost88, value);
	}
	
	/**
	 * 標準原価８８. Standard cost 88.<p>
	 *
	 */
	public void std_cost88(long value) {
		setConstNumber(offset + 294, $std_cost88, value);
	}
	
	/**
	 * 標準原価８８. Standard cost 88.<p>
	 *
	 */
	public void std_cost88(float value) {
		setConstNumber(offset + 294, $std_cost88, value);
	}
	
	/**
	 * 標準原価８８. Standard cost 88.<p>
	 *
	 */
	public void std_cost88(double value) {
		setConstNumber(offset + 294, $std_cost88, value);
	}
	
	/**
	 * 標準原価８９. Standard cost 89.<p>
	 *
	 */
	public MCNumber std_cost89() {
		return getConstNumber(offset + 295, $std_cost89);
	}

	/**
	 * 標準原価８９. Standard cost 89.<p>
	 *
	 */
	public void std_cost89(MCNumber value) {
		setConstNumber(offset + 295, $std_cost89, value);
	}
	
	/**
	 * 標準原価８９. Standard cost 89.<p>
	 *
	 */
	public void std_cost89(int value) {
		setConstNumber(offset + 295, $std_cost89, value);
	}
	
	/**
	 * 標準原価８９. Standard cost 89.<p>
	 *
	 */
	public void std_cost89(long value) {
		setConstNumber(offset + 295, $std_cost89, value);
	}
	
	/**
	 * 標準原価８９. Standard cost 89.<p>
	 *
	 */
	public void std_cost89(float value) {
		setConstNumber(offset + 295, $std_cost89, value);
	}
	
	/**
	 * 標準原価８９. Standard cost 89.<p>
	 *
	 */
	public void std_cost89(double value) {
		setConstNumber(offset + 295, $std_cost89, value);
	}
	
	/**
	 * 標準原価９０. Standard cost 90.<p>
	 *
	 */
	public MCNumber std_cost90() {
		return getConstNumber(offset + 296, $std_cost90);
	}

	/**
	 * 標準原価９０. Standard cost 90.<p>
	 *
	 */
	public void std_cost90(MCNumber value) {
		setConstNumber(offset + 296, $std_cost90, value);
	}
	
	/**
	 * 標準原価９０. Standard cost 90.<p>
	 *
	 */
	public void std_cost90(int value) {
		setConstNumber(offset + 296, $std_cost90, value);
	}
	
	/**
	 * 標準原価９０. Standard cost 90.<p>
	 *
	 */
	public void std_cost90(long value) {
		setConstNumber(offset + 296, $std_cost90, value);
	}
	
	/**
	 * 標準原価９０. Standard cost 90.<p>
	 *
	 */
	public void std_cost90(float value) {
		setConstNumber(offset + 296, $std_cost90, value);
	}
	
	/**
	 * 標準原価９０. Standard cost 90.<p>
	 *
	 */
	public void std_cost90(double value) {
		setConstNumber(offset + 296, $std_cost90, value);
	}
	
	/**
	 * 標準原価９１. Standard cost 91.<p>
	 *
	 */
	public MCNumber std_cost91() {
		return getConstNumber(offset + 297, $std_cost91);
	}

	/**
	 * 標準原価９１. Standard cost 91.<p>
	 *
	 */
	public void std_cost91(MCNumber value) {
		setConstNumber(offset + 297, $std_cost91, value);
	}
	
	/**
	 * 標準原価９１. Standard cost 91.<p>
	 *
	 */
	public void std_cost91(int value) {
		setConstNumber(offset + 297, $std_cost91, value);
	}
	
	/**
	 * 標準原価９１. Standard cost 91.<p>
	 *
	 */
	public void std_cost91(long value) {
		setConstNumber(offset + 297, $std_cost91, value);
	}
	
	/**
	 * 標準原価９１. Standard cost 91.<p>
	 *
	 */
	public void std_cost91(float value) {
		setConstNumber(offset + 297, $std_cost91, value);
	}
	
	/**
	 * 標準原価９１. Standard cost 91.<p>
	 *
	 */
	public void std_cost91(double value) {
		setConstNumber(offset + 297, $std_cost91, value);
	}
	
	/**
	 * 標準原価９２. Standard cost 92.<p>
	 *
	 */
	public MCNumber std_cost92() {
		return getConstNumber(offset + 298, $std_cost92);
	}

	/**
	 * 標準原価９２. Standard cost 92.<p>
	 *
	 */
	public void std_cost92(MCNumber value) {
		setConstNumber(offset + 298, $std_cost92, value);
	}
	
	/**
	 * 標準原価９２. Standard cost 92.<p>
	 *
	 */
	public void std_cost92(int value) {
		setConstNumber(offset + 298, $std_cost92, value);
	}
	
	/**
	 * 標準原価９２. Standard cost 92.<p>
	 *
	 */
	public void std_cost92(long value) {
		setConstNumber(offset + 298, $std_cost92, value);
	}
	
	/**
	 * 標準原価９２. Standard cost 92.<p>
	 *
	 */
	public void std_cost92(float value) {
		setConstNumber(offset + 298, $std_cost92, value);
	}
	
	/**
	 * 標準原価９２. Standard cost 92.<p>
	 *
	 */
	public void std_cost92(double value) {
		setConstNumber(offset + 298, $std_cost92, value);
	}
	
	/**
	 * 標準原価９３. Standard cost 93.<p>
	 *
	 */
	public MCNumber std_cost93() {
		return getConstNumber(offset + 299, $std_cost93);
	}

	/**
	 * 標準原価９３. Standard cost 93.<p>
	 *
	 */
	public void std_cost93(MCNumber value) {
		setConstNumber(offset + 299, $std_cost93, value);
	}
	
	/**
	 * 標準原価９３. Standard cost 93.<p>
	 *
	 */
	public void std_cost93(int value) {
		setConstNumber(offset + 299, $std_cost93, value);
	}
	
	/**
	 * 標準原価９３. Standard cost 93.<p>
	 *
	 */
	public void std_cost93(long value) {
		setConstNumber(offset + 299, $std_cost93, value);
	}
	
	/**
	 * 標準原価９３. Standard cost 93.<p>
	 *
	 */
	public void std_cost93(float value) {
		setConstNumber(offset + 299, $std_cost93, value);
	}
	
	/**
	 * 標準原価９３. Standard cost 93.<p>
	 *
	 */
	public void std_cost93(double value) {
		setConstNumber(offset + 299, $std_cost93, value);
	}
	
	/**
	 * 標準原価９４. Standard cost 94.<p>
	 *
	 */
	public MCNumber std_cost94() {
		return getConstNumber(offset + 300, $std_cost94);
	}

	/**
	 * 標準原価９４. Standard cost 94.<p>
	 *
	 */
	public void std_cost94(MCNumber value) {
		setConstNumber(offset + 300, $std_cost94, value);
	}
	
	/**
	 * 標準原価９４. Standard cost 94.<p>
	 *
	 */
	public void std_cost94(int value) {
		setConstNumber(offset + 300, $std_cost94, value);
	}
	
	/**
	 * 標準原価９４. Standard cost 94.<p>
	 *
	 */
	public void std_cost94(long value) {
		setConstNumber(offset + 300, $std_cost94, value);
	}
	
	/**
	 * 標準原価９４. Standard cost 94.<p>
	 *
	 */
	public void std_cost94(float value) {
		setConstNumber(offset + 300, $std_cost94, value);
	}
	
	/**
	 * 標準原価９４. Standard cost 94.<p>
	 *
	 */
	public void std_cost94(double value) {
		setConstNumber(offset + 300, $std_cost94, value);
	}
	
	/**
	 * 標準原価９５. Standard cost 95.<p>
	 *
	 */
	public MCNumber std_cost95() {
		return getConstNumber(offset + 301, $std_cost95);
	}

	/**
	 * 標準原価９５. Standard cost 95.<p>
	 *
	 */
	public void std_cost95(MCNumber value) {
		setConstNumber(offset + 301, $std_cost95, value);
	}
	
	/**
	 * 標準原価９５. Standard cost 95.<p>
	 *
	 */
	public void std_cost95(int value) {
		setConstNumber(offset + 301, $std_cost95, value);
	}
	
	/**
	 * 標準原価９５. Standard cost 95.<p>
	 *
	 */
	public void std_cost95(long value) {
		setConstNumber(offset + 301, $std_cost95, value);
	}
	
	/**
	 * 標準原価９５. Standard cost 95.<p>
	 *
	 */
	public void std_cost95(float value) {
		setConstNumber(offset + 301, $std_cost95, value);
	}
	
	/**
	 * 標準原価９５. Standard cost 95.<p>
	 *
	 */
	public void std_cost95(double value) {
		setConstNumber(offset + 301, $std_cost95, value);
	}
	
	/**
	 * 標準原価９６. Standard cost 96.<p>
	 *
	 */
	public MCNumber std_cost96() {
		return getConstNumber(offset + 302, $std_cost96);
	}

	/**
	 * 標準原価９６. Standard cost 96.<p>
	 *
	 */
	public void std_cost96(MCNumber value) {
		setConstNumber(offset + 302, $std_cost96, value);
	}
	
	/**
	 * 標準原価９６. Standard cost 96.<p>
	 *
	 */
	public void std_cost96(int value) {
		setConstNumber(offset + 302, $std_cost96, value);
	}
	
	/**
	 * 標準原価９６. Standard cost 96.<p>
	 *
	 */
	public void std_cost96(long value) {
		setConstNumber(offset + 302, $std_cost96, value);
	}
	
	/**
	 * 標準原価９６. Standard cost 96.<p>
	 *
	 */
	public void std_cost96(float value) {
		setConstNumber(offset + 302, $std_cost96, value);
	}
	
	/**
	 * 標準原価９６. Standard cost 96.<p>
	 *
	 */
	public void std_cost96(double value) {
		setConstNumber(offset + 302, $std_cost96, value);
	}
	
	/**
	 * 標準原価９７. Standard cost 97.<p>
	 *
	 */
	public MCNumber std_cost97() {
		return getConstNumber(offset + 303, $std_cost97);
	}

	/**
	 * 標準原価９７. Standard cost 97.<p>
	 *
	 */
	public void std_cost97(MCNumber value) {
		setConstNumber(offset + 303, $std_cost97, value);
	}
	
	/**
	 * 標準原価９７. Standard cost 97.<p>
	 *
	 */
	public void std_cost97(int value) {
		setConstNumber(offset + 303, $std_cost97, value);
	}
	
	/**
	 * 標準原価９７. Standard cost 97.<p>
	 *
	 */
	public void std_cost97(long value) {
		setConstNumber(offset + 303, $std_cost97, value);
	}
	
	/**
	 * 標準原価９７. Standard cost 97.<p>
	 *
	 */
	public void std_cost97(float value) {
		setConstNumber(offset + 303, $std_cost97, value);
	}
	
	/**
	 * 標準原価９７. Standard cost 97.<p>
	 *
	 */
	public void std_cost97(double value) {
		setConstNumber(offset + 303, $std_cost97, value);
	}
	
	/**
	 * 標準原価９８. Standard cost 98.<p>
	 *
	 */
	public MCNumber std_cost98() {
		return getConstNumber(offset + 304, $std_cost98);
	}

	/**
	 * 標準原価９８. Standard cost 98.<p>
	 *
	 */
	public void std_cost98(MCNumber value) {
		setConstNumber(offset + 304, $std_cost98, value);
	}
	
	/**
	 * 標準原価９８. Standard cost 98.<p>
	 *
	 */
	public void std_cost98(int value) {
		setConstNumber(offset + 304, $std_cost98, value);
	}
	
	/**
	 * 標準原価９８. Standard cost 98.<p>
	 *
	 */
	public void std_cost98(long value) {
		setConstNumber(offset + 304, $std_cost98, value);
	}
	
	/**
	 * 標準原価９８. Standard cost 98.<p>
	 *
	 */
	public void std_cost98(float value) {
		setConstNumber(offset + 304, $std_cost98, value);
	}
	
	/**
	 * 標準原価９８. Standard cost 98.<p>
	 *
	 */
	public void std_cost98(double value) {
		setConstNumber(offset + 304, $std_cost98, value);
	}
	
	/**
	 * 標準原価９９. Standard cost 99.<p>
	 *
	 */
	public MCNumber std_cost99() {
		return getConstNumber(offset + 305, $std_cost99);
	}

	/**
	 * 標準原価９９. Standard cost 99.<p>
	 *
	 */
	public void std_cost99(MCNumber value) {
		setConstNumber(offset + 305, $std_cost99, value);
	}
	
	/**
	 * 標準原価９９. Standard cost 99.<p>
	 *
	 */
	public void std_cost99(int value) {
		setConstNumber(offset + 305, $std_cost99, value);
	}
	
	/**
	 * 標準原価９９. Standard cost 99.<p>
	 *
	 */
	public void std_cost99(long value) {
		setConstNumber(offset + 305, $std_cost99, value);
	}
	
	/**
	 * 標準原価９９. Standard cost 99.<p>
	 *
	 */
	public void std_cost99(float value) {
		setConstNumber(offset + 305, $std_cost99, value);
	}
	
	/**
	 * 標準原価９９. Standard cost 99.<p>
	 *
	 */
	public void std_cost99(double value) {
		setConstNumber(offset + 305, $std_cost99, value);
	}
	
	/**
	 * 標準原価１００. Standard cost 100.<p>
	 *
	 */
	public MCNumber std_cost100() {
		return getConstNumber(offset + 306, $std_cost100);
	}

	/**
	 * 標準原価１００. Standard cost 100.<p>
	 *
	 */
	public void std_cost100(MCNumber value) {
		setConstNumber(offset + 306, $std_cost100, value);
	}
	
	/**
	 * 標準原価１００. Standard cost 100.<p>
	 *
	 */
	public void std_cost100(int value) {
		setConstNumber(offset + 306, $std_cost100, value);
	}
	
	/**
	 * 標準原価１００. Standard cost 100.<p>
	 *
	 */
	public void std_cost100(long value) {
		setConstNumber(offset + 306, $std_cost100, value);
	}
	
	/**
	 * 標準原価１００. Standard cost 100.<p>
	 *
	 */
	public void std_cost100(float value) {
		setConstNumber(offset + 306, $std_cost100, value);
	}
	
	/**
	 * 標準原価１００. Standard cost 100.<p>
	 *
	 */
	public void std_cost100(double value) {
		setConstNumber(offset + 306, $std_cost100, value);
	}
	
	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 307, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 307, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 308, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 308, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 308, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 308, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 308, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 308, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 309, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 309, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 309, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 309, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 309, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 309, $log_sub_key2, value);
	}
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public String if_sub_char1() {
		return getConstString(offset + 310, $if_sub_char1);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public void if_sub_char1(String value) {
		setConstString(offset + 310, $if_sub_char1, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public String if_sub_char2() {
		return getConstString(offset + 311, $if_sub_char2);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public void if_sub_char2(String value) {
		setConstString(offset + 311, $if_sub_char2, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public String if_sub_char3() {
		return getConstString(offset + 312, $if_sub_char3);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public void if_sub_char3(String value) {
		setConstString(offset + 312, $if_sub_char3, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public String if_sub_char4() {
		return getConstString(offset + 313, $if_sub_char4);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public void if_sub_char4(String value) {
		setConstString(offset + 313, $if_sub_char4, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public String if_sub_char5() {
		return getConstString(offset + 314, $if_sub_char5);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public void if_sub_char5(String value) {
		setConstString(offset + 314, $if_sub_char5, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public String if_sub_char6() {
		return getConstString(offset + 315, $if_sub_char6);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public void if_sub_char6(String value) {
		setConstString(offset + 315, $if_sub_char6, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public String if_sub_char7() {
		return getConstString(offset + 316, $if_sub_char7);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public void if_sub_char7(String value) {
		setConstString(offset + 316, $if_sub_char7, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public String if_sub_char8() {
		return getConstString(offset + 317, $if_sub_char8);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public void if_sub_char8(String value) {
		setConstString(offset + 317, $if_sub_char8, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public String if_sub_char9() {
		return getConstString(offset + 318, $if_sub_char9);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public void if_sub_char9(String value) {
		setConstString(offset + 318, $if_sub_char9, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public String if_sub_char10() {
		return getConstString(offset + 319, $if_sub_char10);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public void if_sub_char10(String value) {
		setConstString(offset + 319, $if_sub_char10, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public String if_sub_char11() {
		return getConstString(offset + 320, $if_sub_char11);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public void if_sub_char11(String value) {
		setConstString(offset + 320, $if_sub_char11, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public String if_sub_char12() {
		return getConstString(offset + 321, $if_sub_char12);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public void if_sub_char12(String value) {
		setConstString(offset + 321, $if_sub_char12, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public String if_sub_char13() {
		return getConstString(offset + 322, $if_sub_char13);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public void if_sub_char13(String value) {
		setConstString(offset + 322, $if_sub_char13, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public String if_sub_char14() {
		return getConstString(offset + 323, $if_sub_char14);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public void if_sub_char14(String value) {
		setConstString(offset + 323, $if_sub_char14, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public String if_sub_char15() {
		return getConstString(offset + 324, $if_sub_char15);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public void if_sub_char15(String value) {
		setConstString(offset + 324, $if_sub_char15, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public String if_sub_char16() {
		return getConstString(offset + 325, $if_sub_char16);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public void if_sub_char16(String value) {
		setConstString(offset + 325, $if_sub_char16, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public String if_sub_char17() {
		return getConstString(offset + 326, $if_sub_char17);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public void if_sub_char17(String value) {
		setConstString(offset + 326, $if_sub_char17, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public String if_sub_char18() {
		return getConstString(offset + 327, $if_sub_char18);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public void if_sub_char18(String value) {
		setConstString(offset + 327, $if_sub_char18, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public String if_sub_char19() {
		return getConstString(offset + 328, $if_sub_char19);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public void if_sub_char19(String value) {
		setConstString(offset + 328, $if_sub_char19, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public String if_sub_char20() {
		return getConstString(offset + 329, $if_sub_char20);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public void if_sub_char20(String value) {
		setConstString(offset + 329, $if_sub_char20, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public String if_sub_char21() {
		return getConstString(offset + 330, $if_sub_char21);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public void if_sub_char21(String value) {
		setConstString(offset + 330, $if_sub_char21, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public String if_sub_char22() {
		return getConstString(offset + 331, $if_sub_char22);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public void if_sub_char22(String value) {
		setConstString(offset + 331, $if_sub_char22, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public String if_sub_char23() {
		return getConstString(offset + 332, $if_sub_char23);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public void if_sub_char23(String value) {
		setConstString(offset + 332, $if_sub_char23, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public String if_sub_char24() {
		return getConstString(offset + 333, $if_sub_char24);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public void if_sub_char24(String value) {
		setConstString(offset + 333, $if_sub_char24, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public String if_sub_char25() {
		return getConstString(offset + 334, $if_sub_char25);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public void if_sub_char25(String value) {
		setConstString(offset + 334, $if_sub_char25, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public String if_sub_char26() {
		return getConstString(offset + 335, $if_sub_char26);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public void if_sub_char26(String value) {
		setConstString(offset + 335, $if_sub_char26, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public String if_sub_char27() {
		return getConstString(offset + 336, $if_sub_char27);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public void if_sub_char27(String value) {
		setConstString(offset + 336, $if_sub_char27, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public String if_sub_char28() {
		return getConstString(offset + 337, $if_sub_char28);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public void if_sub_char28(String value) {
		setConstString(offset + 337, $if_sub_char28, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public String if_sub_char29() {
		return getConstString(offset + 338, $if_sub_char29);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public void if_sub_char29(String value) {
		setConstString(offset + 338, $if_sub_char29, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public String if_sub_char30() {
		return getConstString(offset + 339, $if_sub_char30);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public void if_sub_char30(String value) {
		setConstString(offset + 339, $if_sub_char30, value);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public MCNumber if_sub_num1() {
		return getConstNumber(offset + 340, $if_sub_num1);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(MCNumber value) {
		setConstNumber(offset + 340, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(int value) {
		setConstNumber(offset + 340, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(long value) {
		setConstNumber(offset + 340, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(float value) {
		setConstNumber(offset + 340, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(double value) {
		setConstNumber(offset + 340, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public MCNumber if_sub_num2() {
		return getConstNumber(offset + 341, $if_sub_num2);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(MCNumber value) {
		setConstNumber(offset + 341, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(int value) {
		setConstNumber(offset + 341, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(long value) {
		setConstNumber(offset + 341, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(float value) {
		setConstNumber(offset + 341, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(double value) {
		setConstNumber(offset + 341, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public MCNumber if_sub_num3() {
		return getConstNumber(offset + 342, $if_sub_num3);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(MCNumber value) {
		setConstNumber(offset + 342, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(int value) {
		setConstNumber(offset + 342, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(long value) {
		setConstNumber(offset + 342, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(float value) {
		setConstNumber(offset + 342, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(double value) {
		setConstNumber(offset + 342, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public MCNumber if_sub_num4() {
		return getConstNumber(offset + 343, $if_sub_num4);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(MCNumber value) {
		setConstNumber(offset + 343, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(int value) {
		setConstNumber(offset + 343, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(long value) {
		setConstNumber(offset + 343, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(float value) {
		setConstNumber(offset + 343, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(double value) {
		setConstNumber(offset + 343, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public MCNumber if_sub_num5() {
		return getConstNumber(offset + 344, $if_sub_num5);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(MCNumber value) {
		setConstNumber(offset + 344, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(int value) {
		setConstNumber(offset + 344, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(long value) {
		setConstNumber(offset + 344, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(float value) {
		setConstNumber(offset + 344, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(double value) {
		setConstNumber(offset + 344, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public MCDate if_sub_dt1() {
		return getConstDate(offset + 345, $if_sub_dt1);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public void if_sub_dt1(MCDate value) {
		setConstDate(offset + 345, $if_sub_dt1, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public MCDate if_sub_dt2() {
		return getConstDate(offset + 346, $if_sub_dt2);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public void if_sub_dt2(MCDate value) {
		setConstDate(offset + 346, $if_sub_dt2, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public MCDate if_sub_dt3() {
		return getConstDate(offset + 347, $if_sub_dt3);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public void if_sub_dt3(MCDate value) {
		setConstDate(offset + 347, $if_sub_dt3, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public MCDate if_sub_dt4() {
		return getConstDate(offset + 348, $if_sub_dt4);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public void if_sub_dt4(MCDate value) {
		setConstDate(offset + 348, $if_sub_dt4, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public MCDate if_sub_dt5() {
		return getConstDate(offset + 349, $if_sub_dt5);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public void if_sub_dt5(MCDate value) {
		setConstDate(offset + 349, $if_sub_dt5, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 350, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 350, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 351, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 351, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 352, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 352, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 353, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 353, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 354, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 354, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 354, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 354, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 354, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 354, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 355, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 355, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 356, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 356, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 357, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 357, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 358, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 358, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 359, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 359, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_rec_typ.equalsIgnoreCase(name)) {
			return calc_rec_typ();
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
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($act_id.equalsIgnoreCase(name)) {
			return act_id();
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			return act_id_sub();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			return other_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			return cost_sls_cd1();
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			return cost_sls_cd2();
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			return cost_sls_cd3();
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			return cost_sls_cd4();
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			return cost_sls_cd5();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
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
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			return gp_alc_cd();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
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
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			return inst_qty();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			return std_amt();
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			return cur_amt();
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			return cur_std_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			return std_xrate();
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			return upri_diff();
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			return rate_diff();
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			return act_upri();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			return so_act_amt();
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			return so_std_amt();
		}
		if ($per.equalsIgnoreCase(name)) {
			return per();
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			return mfg_cost_ratio();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			return diff_wk();
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			return diff_up();
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			return diff_rt();
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			return diff_std();
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			return diff_a();
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			return diff_b();
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			return diff_c();
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			return diff_d();
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			return diff_e();
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			return mfg_inpt_cost();
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			return std_mfg_inpt_cost();
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			return sls_cost();
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			return std_sls_cost();
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			return sls_mng_cost();
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			return std_sls_mng_cost();
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			return fxd_cost();
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			return var_cost();
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			return dir_cost();
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			return indir_cost();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			return act_cost1();
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			return act_cost2();
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			return act_cost3();
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			return act_cost4();
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			return act_cost5();
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			return act_cost6();
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			return act_cost7();
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			return act_cost8();
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			return act_cost9();
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			return act_cost10();
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			return act_cost11();
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			return act_cost12();
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			return act_cost13();
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			return act_cost14();
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			return act_cost15();
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			return act_cost16();
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			return act_cost17();
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			return act_cost18();
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			return act_cost19();
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			return act_cost20();
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			return act_cost21();
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			return act_cost22();
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			return act_cost23();
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			return act_cost24();
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			return act_cost25();
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			return act_cost26();
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			return act_cost27();
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			return act_cost28();
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			return act_cost29();
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			return act_cost30();
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			return act_cost31();
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			return act_cost32();
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			return act_cost33();
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			return act_cost34();
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			return act_cost35();
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			return act_cost36();
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			return act_cost37();
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			return act_cost38();
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			return act_cost39();
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			return act_cost40();
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			return act_cost41();
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			return act_cost42();
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			return act_cost43();
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			return act_cost44();
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			return act_cost45();
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			return act_cost46();
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			return act_cost47();
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			return act_cost48();
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			return act_cost49();
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			return act_cost50();
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			return act_cost51();
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			return act_cost52();
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			return act_cost53();
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			return act_cost54();
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			return act_cost55();
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			return act_cost56();
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			return act_cost57();
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			return act_cost58();
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			return act_cost59();
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			return act_cost60();
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			return act_cost61();
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			return act_cost62();
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			return act_cost63();
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			return act_cost64();
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			return act_cost65();
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			return act_cost66();
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			return act_cost67();
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			return act_cost68();
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			return act_cost69();
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			return act_cost70();
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			return act_cost71();
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			return act_cost72();
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			return act_cost73();
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			return act_cost74();
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			return act_cost75();
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			return act_cost76();
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			return act_cost77();
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			return act_cost78();
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			return act_cost79();
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			return act_cost80();
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			return act_cost81();
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			return act_cost82();
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			return act_cost83();
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			return act_cost84();
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			return act_cost85();
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			return act_cost86();
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			return act_cost87();
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			return act_cost88();
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			return act_cost89();
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			return act_cost90();
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			return act_cost91();
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			return act_cost92();
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			return act_cost93();
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			return act_cost94();
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			return act_cost95();
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			return act_cost96();
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			return act_cost97();
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			return act_cost98();
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			return act_cost99();
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			return act_cost100();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			return std_cost1();
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			return std_cost2();
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			return std_cost3();
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			return std_cost4();
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			return std_cost5();
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			return std_cost6();
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			return std_cost7();
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			return std_cost8();
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			return std_cost9();
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			return std_cost10();
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			return std_cost11();
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			return std_cost12();
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			return std_cost13();
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			return std_cost14();
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			return std_cost15();
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			return std_cost16();
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			return std_cost17();
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			return std_cost18();
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			return std_cost19();
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			return std_cost20();
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			return std_cost21();
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			return std_cost22();
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			return std_cost23();
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			return std_cost24();
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			return std_cost25();
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			return std_cost26();
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			return std_cost27();
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			return std_cost28();
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			return std_cost29();
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			return std_cost30();
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			return std_cost31();
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			return std_cost32();
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			return std_cost33();
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			return std_cost34();
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			return std_cost35();
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			return std_cost36();
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			return std_cost37();
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			return std_cost38();
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			return std_cost39();
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			return std_cost40();
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			return std_cost41();
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			return std_cost42();
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			return std_cost43();
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			return std_cost44();
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			return std_cost45();
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			return std_cost46();
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			return std_cost47();
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			return std_cost48();
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			return std_cost49();
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			return std_cost50();
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			return std_cost51();
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			return std_cost52();
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			return std_cost53();
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			return std_cost54();
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			return std_cost55();
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			return std_cost56();
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			return std_cost57();
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			return std_cost58();
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			return std_cost59();
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			return std_cost60();
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			return std_cost61();
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			return std_cost62();
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			return std_cost63();
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			return std_cost64();
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			return std_cost65();
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			return std_cost66();
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			return std_cost67();
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			return std_cost68();
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			return std_cost69();
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			return std_cost70();
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			return std_cost71();
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			return std_cost72();
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			return std_cost73();
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			return std_cost74();
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			return std_cost75();
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			return std_cost76();
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			return std_cost77();
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			return std_cost78();
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			return std_cost79();
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			return std_cost80();
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			return std_cost81();
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			return std_cost82();
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			return std_cost83();
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			return std_cost84();
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			return std_cost85();
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			return std_cost86();
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			return std_cost87();
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			return std_cost88();
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			return std_cost89();
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			return std_cost90();
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			return std_cost91();
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			return std_cost92();
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			return std_cost93();
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			return std_cost94();
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			return std_cost95();
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			return std_cost96();
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			return std_cost97();
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			return std_cost98();
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			return std_cost99();
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			return std_cost100();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			return bi_not_send_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_rec_typ.equalsIgnoreCase(name)) {
			return calc_rec_typ();
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
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($act_id.equalsIgnoreCase(name)) {
			return act_id();
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			return act_id_sub();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			return other_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			return cost_sls_cd1();
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			return cost_sls_cd2();
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			return cost_sls_cd3();
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			return cost_sls_cd4();
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			return cost_sls_cd5();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
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
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			return gp_alc_cd();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
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
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			return inst_qty();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			return std_amt();
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			return cur_amt();
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			return cur_std_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			return std_xrate();
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			return upri_diff();
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			return rate_diff();
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			return act_upri();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			return so_act_amt();
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			return so_std_amt();
		}
		if ($per.equalsIgnoreCase(name)) {
			return per();
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			return mfg_cost_ratio();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			return diff_wk();
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			return diff_up();
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			return diff_rt();
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			return diff_std();
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			return diff_a();
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			return diff_b();
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			return diff_c();
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			return diff_d();
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			return diff_e();
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			return mfg_inpt_cost();
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			return std_mfg_inpt_cost();
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			return sls_cost();
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			return std_sls_cost();
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			return sls_mng_cost();
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			return std_sls_mng_cost();
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			return fxd_cost();
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			return var_cost();
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			return dir_cost();
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			return indir_cost();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			return act_cost1();
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			return act_cost2();
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			return act_cost3();
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			return act_cost4();
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			return act_cost5();
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			return act_cost6();
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			return act_cost7();
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			return act_cost8();
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			return act_cost9();
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			return act_cost10();
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			return act_cost11();
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			return act_cost12();
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			return act_cost13();
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			return act_cost14();
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			return act_cost15();
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			return act_cost16();
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			return act_cost17();
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			return act_cost18();
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			return act_cost19();
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			return act_cost20();
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			return act_cost21();
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			return act_cost22();
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			return act_cost23();
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			return act_cost24();
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			return act_cost25();
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			return act_cost26();
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			return act_cost27();
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			return act_cost28();
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			return act_cost29();
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			return act_cost30();
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			return act_cost31();
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			return act_cost32();
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			return act_cost33();
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			return act_cost34();
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			return act_cost35();
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			return act_cost36();
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			return act_cost37();
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			return act_cost38();
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			return act_cost39();
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			return act_cost40();
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			return act_cost41();
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			return act_cost42();
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			return act_cost43();
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			return act_cost44();
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			return act_cost45();
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			return act_cost46();
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			return act_cost47();
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			return act_cost48();
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			return act_cost49();
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			return act_cost50();
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			return act_cost51();
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			return act_cost52();
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			return act_cost53();
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			return act_cost54();
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			return act_cost55();
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			return act_cost56();
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			return act_cost57();
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			return act_cost58();
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			return act_cost59();
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			return act_cost60();
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			return act_cost61();
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			return act_cost62();
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			return act_cost63();
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			return act_cost64();
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			return act_cost65();
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			return act_cost66();
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			return act_cost67();
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			return act_cost68();
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			return act_cost69();
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			return act_cost70();
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			return act_cost71();
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			return act_cost72();
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			return act_cost73();
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			return act_cost74();
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			return act_cost75();
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			return act_cost76();
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			return act_cost77();
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			return act_cost78();
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			return act_cost79();
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			return act_cost80();
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			return act_cost81();
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			return act_cost82();
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			return act_cost83();
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			return act_cost84();
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			return act_cost85();
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			return act_cost86();
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			return act_cost87();
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			return act_cost88();
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			return act_cost89();
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			return act_cost90();
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			return act_cost91();
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			return act_cost92();
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			return act_cost93();
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			return act_cost94();
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			return act_cost95();
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			return act_cost96();
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			return act_cost97();
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			return act_cost98();
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			return act_cost99();
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			return act_cost100();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			return std_cost1();
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			return std_cost2();
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			return std_cost3();
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			return std_cost4();
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			return std_cost5();
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			return std_cost6();
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			return std_cost7();
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			return std_cost8();
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			return std_cost9();
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			return std_cost10();
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			return std_cost11();
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			return std_cost12();
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			return std_cost13();
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			return std_cost14();
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			return std_cost15();
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			return std_cost16();
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			return std_cost17();
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			return std_cost18();
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			return std_cost19();
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			return std_cost20();
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			return std_cost21();
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			return std_cost22();
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			return std_cost23();
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			return std_cost24();
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			return std_cost25();
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			return std_cost26();
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			return std_cost27();
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			return std_cost28();
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			return std_cost29();
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			return std_cost30();
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			return std_cost31();
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			return std_cost32();
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			return std_cost33();
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			return std_cost34();
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			return std_cost35();
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			return std_cost36();
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			return std_cost37();
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			return std_cost38();
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			return std_cost39();
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			return std_cost40();
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			return std_cost41();
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			return std_cost42();
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			return std_cost43();
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			return std_cost44();
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			return std_cost45();
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			return std_cost46();
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			return std_cost47();
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			return std_cost48();
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			return std_cost49();
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			return std_cost50();
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			return std_cost51();
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			return std_cost52();
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			return std_cost53();
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			return std_cost54();
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			return std_cost55();
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			return std_cost56();
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			return std_cost57();
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			return std_cost58();
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			return std_cost59();
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			return std_cost60();
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			return std_cost61();
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			return std_cost62();
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			return std_cost63();
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			return std_cost64();
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			return std_cost65();
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			return std_cost66();
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			return std_cost67();
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			return std_cost68();
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			return std_cost69();
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			return std_cost70();
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			return std_cost71();
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			return std_cost72();
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			return std_cost73();
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			return std_cost74();
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			return std_cost75();
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			return std_cost76();
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			return std_cost77();
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			return std_cost78();
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			return std_cost79();
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			return std_cost80();
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			return std_cost81();
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			return std_cost82();
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			return std_cost83();
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			return std_cost84();
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			return std_cost85();
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			return std_cost86();
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			return std_cost87();
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			return std_cost88();
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			return std_cost89();
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			return std_cost90();
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			return std_cost91();
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			return std_cost92();
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			return std_cost93();
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			return std_cost94();
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			return std_cost95();
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			return std_cost96();
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			return std_cost97();
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			return std_cost98();
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			return std_cost99();
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			return std_cost100();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			return bi_not_send_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
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
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_rec_typ.equalsIgnoreCase(name)) {
			calc_rec_typ(value);
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
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($act_id.equalsIgnoreCase(name)) {
			act_id(value);
			return;
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			act_id_sub(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			other_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			cost_sls_cd1(value);
			return;
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			cost_sls_cd2(value);
			return;
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			cost_sls_cd3(value);
			return;
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			cost_sls_cd4(value);
			return;
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			cost_sls_cd5(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
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
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			gp_alc_cd(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
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
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			so_std_amt(value);
			return;
		}
		if ($per.equalsIgnoreCase(name)) {
			per(value);
			return;
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			mfg_cost_ratio(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			mfg_inpt_cost(value);
			return;
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			std_mfg_inpt_cost(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			dir_cost(value);
			return;
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			indir_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			act_cost1(value);
			return;
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			act_cost2(value);
			return;
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			act_cost3(value);
			return;
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			act_cost4(value);
			return;
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			act_cost5(value);
			return;
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			act_cost6(value);
			return;
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			act_cost7(value);
			return;
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			act_cost8(value);
			return;
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			act_cost9(value);
			return;
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			act_cost10(value);
			return;
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			act_cost11(value);
			return;
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			act_cost12(value);
			return;
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			act_cost13(value);
			return;
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			act_cost14(value);
			return;
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			act_cost15(value);
			return;
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			act_cost16(value);
			return;
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			act_cost17(value);
			return;
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			act_cost18(value);
			return;
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			act_cost19(value);
			return;
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			act_cost20(value);
			return;
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			act_cost21(value);
			return;
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			act_cost22(value);
			return;
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			act_cost23(value);
			return;
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			act_cost24(value);
			return;
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			act_cost25(value);
			return;
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			act_cost26(value);
			return;
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			act_cost27(value);
			return;
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			act_cost28(value);
			return;
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			act_cost29(value);
			return;
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			act_cost30(value);
			return;
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			act_cost31(value);
			return;
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			act_cost32(value);
			return;
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			act_cost33(value);
			return;
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			act_cost34(value);
			return;
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			act_cost35(value);
			return;
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			act_cost36(value);
			return;
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			act_cost37(value);
			return;
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			act_cost38(value);
			return;
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			act_cost39(value);
			return;
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			act_cost40(value);
			return;
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			act_cost41(value);
			return;
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			act_cost42(value);
			return;
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			act_cost43(value);
			return;
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			act_cost44(value);
			return;
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			act_cost45(value);
			return;
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			act_cost46(value);
			return;
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			act_cost47(value);
			return;
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			act_cost48(value);
			return;
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			act_cost49(value);
			return;
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			act_cost50(value);
			return;
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			act_cost51(value);
			return;
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			act_cost52(value);
			return;
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			act_cost53(value);
			return;
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			act_cost54(value);
			return;
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			act_cost55(value);
			return;
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			act_cost56(value);
			return;
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			act_cost57(value);
			return;
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			act_cost58(value);
			return;
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			act_cost59(value);
			return;
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			act_cost60(value);
			return;
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			act_cost61(value);
			return;
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			act_cost62(value);
			return;
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			act_cost63(value);
			return;
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			act_cost64(value);
			return;
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			act_cost65(value);
			return;
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			act_cost66(value);
			return;
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			act_cost67(value);
			return;
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			act_cost68(value);
			return;
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			act_cost69(value);
			return;
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			act_cost70(value);
			return;
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			act_cost71(value);
			return;
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			act_cost72(value);
			return;
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			act_cost73(value);
			return;
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			act_cost74(value);
			return;
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			act_cost75(value);
			return;
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			act_cost76(value);
			return;
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			act_cost77(value);
			return;
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			act_cost78(value);
			return;
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			act_cost79(value);
			return;
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			act_cost80(value);
			return;
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			act_cost81(value);
			return;
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			act_cost82(value);
			return;
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			act_cost83(value);
			return;
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			act_cost84(value);
			return;
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			act_cost85(value);
			return;
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			act_cost86(value);
			return;
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			act_cost87(value);
			return;
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			act_cost88(value);
			return;
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			act_cost89(value);
			return;
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			act_cost90(value);
			return;
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			act_cost91(value);
			return;
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			act_cost92(value);
			return;
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			act_cost93(value);
			return;
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			act_cost94(value);
			return;
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			act_cost95(value);
			return;
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			act_cost96(value);
			return;
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			act_cost97(value);
			return;
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			act_cost98(value);
			return;
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			act_cost99(value);
			return;
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			act_cost100(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			std_cost1(value);
			return;
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			std_cost2(value);
			return;
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			std_cost3(value);
			return;
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			std_cost4(value);
			return;
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			std_cost5(value);
			return;
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			std_cost6(value);
			return;
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			std_cost7(value);
			return;
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			std_cost8(value);
			return;
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			std_cost9(value);
			return;
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			std_cost10(value);
			return;
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			std_cost11(value);
			return;
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			std_cost12(value);
			return;
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			std_cost13(value);
			return;
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			std_cost14(value);
			return;
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			std_cost15(value);
			return;
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			std_cost16(value);
			return;
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			std_cost17(value);
			return;
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			std_cost18(value);
			return;
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			std_cost19(value);
			return;
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			std_cost20(value);
			return;
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			std_cost21(value);
			return;
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			std_cost22(value);
			return;
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			std_cost23(value);
			return;
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			std_cost24(value);
			return;
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			std_cost25(value);
			return;
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			std_cost26(value);
			return;
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			std_cost27(value);
			return;
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			std_cost28(value);
			return;
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			std_cost29(value);
			return;
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			std_cost30(value);
			return;
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			std_cost31(value);
			return;
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			std_cost32(value);
			return;
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			std_cost33(value);
			return;
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			std_cost34(value);
			return;
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			std_cost35(value);
			return;
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			std_cost36(value);
			return;
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			std_cost37(value);
			return;
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			std_cost38(value);
			return;
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			std_cost39(value);
			return;
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			std_cost40(value);
			return;
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			std_cost41(value);
			return;
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			std_cost42(value);
			return;
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			std_cost43(value);
			return;
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			std_cost44(value);
			return;
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			std_cost45(value);
			return;
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			std_cost46(value);
			return;
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			std_cost47(value);
			return;
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			std_cost48(value);
			return;
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			std_cost49(value);
			return;
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			std_cost50(value);
			return;
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			std_cost51(value);
			return;
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			std_cost52(value);
			return;
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			std_cost53(value);
			return;
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			std_cost54(value);
			return;
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			std_cost55(value);
			return;
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			std_cost56(value);
			return;
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			std_cost57(value);
			return;
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			std_cost58(value);
			return;
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			std_cost59(value);
			return;
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			std_cost60(value);
			return;
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			std_cost61(value);
			return;
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			std_cost62(value);
			return;
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			std_cost63(value);
			return;
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			std_cost64(value);
			return;
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			std_cost65(value);
			return;
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			std_cost66(value);
			return;
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			std_cost67(value);
			return;
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			std_cost68(value);
			return;
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			std_cost69(value);
			return;
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			std_cost70(value);
			return;
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			std_cost71(value);
			return;
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			std_cost72(value);
			return;
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			std_cost73(value);
			return;
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			std_cost74(value);
			return;
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			std_cost75(value);
			return;
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			std_cost76(value);
			return;
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			std_cost77(value);
			return;
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			std_cost78(value);
			return;
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			std_cost79(value);
			return;
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			std_cost80(value);
			return;
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			std_cost81(value);
			return;
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			std_cost82(value);
			return;
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			std_cost83(value);
			return;
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			std_cost84(value);
			return;
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			std_cost85(value);
			return;
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			std_cost86(value);
			return;
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			std_cost87(value);
			return;
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			std_cost88(value);
			return;
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			std_cost89(value);
			return;
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			std_cost90(value);
			return;
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			std_cost91(value);
			return;
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			std_cost92(value);
			return;
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			std_cost93(value);
			return;
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			std_cost94(value);
			return;
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			std_cost95(value);
			return;
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			std_cost96(value);
			return;
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			std_cost97(value);
			return;
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			std_cost98(value);
			return;
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			std_cost99(value);
			return;
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			std_cost100(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			so_std_amt(value);
			return;
		}
		if ($per.equalsIgnoreCase(name)) {
			per(value);
			return;
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			mfg_cost_ratio(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			mfg_inpt_cost(value);
			return;
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			std_mfg_inpt_cost(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			dir_cost(value);
			return;
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			indir_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			act_cost1(value);
			return;
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			act_cost2(value);
			return;
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			act_cost3(value);
			return;
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			act_cost4(value);
			return;
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			act_cost5(value);
			return;
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			act_cost6(value);
			return;
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			act_cost7(value);
			return;
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			act_cost8(value);
			return;
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			act_cost9(value);
			return;
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			act_cost10(value);
			return;
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			act_cost11(value);
			return;
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			act_cost12(value);
			return;
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			act_cost13(value);
			return;
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			act_cost14(value);
			return;
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			act_cost15(value);
			return;
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			act_cost16(value);
			return;
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			act_cost17(value);
			return;
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			act_cost18(value);
			return;
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			act_cost19(value);
			return;
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			act_cost20(value);
			return;
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			act_cost21(value);
			return;
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			act_cost22(value);
			return;
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			act_cost23(value);
			return;
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			act_cost24(value);
			return;
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			act_cost25(value);
			return;
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			act_cost26(value);
			return;
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			act_cost27(value);
			return;
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			act_cost28(value);
			return;
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			act_cost29(value);
			return;
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			act_cost30(value);
			return;
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			act_cost31(value);
			return;
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			act_cost32(value);
			return;
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			act_cost33(value);
			return;
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			act_cost34(value);
			return;
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			act_cost35(value);
			return;
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			act_cost36(value);
			return;
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			act_cost37(value);
			return;
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			act_cost38(value);
			return;
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			act_cost39(value);
			return;
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			act_cost40(value);
			return;
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			act_cost41(value);
			return;
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			act_cost42(value);
			return;
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			act_cost43(value);
			return;
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			act_cost44(value);
			return;
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			act_cost45(value);
			return;
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			act_cost46(value);
			return;
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			act_cost47(value);
			return;
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			act_cost48(value);
			return;
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			act_cost49(value);
			return;
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			act_cost50(value);
			return;
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			act_cost51(value);
			return;
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			act_cost52(value);
			return;
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			act_cost53(value);
			return;
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			act_cost54(value);
			return;
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			act_cost55(value);
			return;
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			act_cost56(value);
			return;
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			act_cost57(value);
			return;
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			act_cost58(value);
			return;
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			act_cost59(value);
			return;
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			act_cost60(value);
			return;
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			act_cost61(value);
			return;
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			act_cost62(value);
			return;
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			act_cost63(value);
			return;
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			act_cost64(value);
			return;
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			act_cost65(value);
			return;
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			act_cost66(value);
			return;
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			act_cost67(value);
			return;
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			act_cost68(value);
			return;
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			act_cost69(value);
			return;
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			act_cost70(value);
			return;
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			act_cost71(value);
			return;
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			act_cost72(value);
			return;
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			act_cost73(value);
			return;
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			act_cost74(value);
			return;
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			act_cost75(value);
			return;
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			act_cost76(value);
			return;
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			act_cost77(value);
			return;
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			act_cost78(value);
			return;
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			act_cost79(value);
			return;
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			act_cost80(value);
			return;
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			act_cost81(value);
			return;
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			act_cost82(value);
			return;
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			act_cost83(value);
			return;
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			act_cost84(value);
			return;
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			act_cost85(value);
			return;
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			act_cost86(value);
			return;
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			act_cost87(value);
			return;
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			act_cost88(value);
			return;
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			act_cost89(value);
			return;
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			act_cost90(value);
			return;
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			act_cost91(value);
			return;
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			act_cost92(value);
			return;
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			act_cost93(value);
			return;
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			act_cost94(value);
			return;
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			act_cost95(value);
			return;
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			act_cost96(value);
			return;
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			act_cost97(value);
			return;
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			act_cost98(value);
			return;
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			act_cost99(value);
			return;
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			act_cost100(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			std_cost1(value);
			return;
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			std_cost2(value);
			return;
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			std_cost3(value);
			return;
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			std_cost4(value);
			return;
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			std_cost5(value);
			return;
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			std_cost6(value);
			return;
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			std_cost7(value);
			return;
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			std_cost8(value);
			return;
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			std_cost9(value);
			return;
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			std_cost10(value);
			return;
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			std_cost11(value);
			return;
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			std_cost12(value);
			return;
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			std_cost13(value);
			return;
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			std_cost14(value);
			return;
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			std_cost15(value);
			return;
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			std_cost16(value);
			return;
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			std_cost17(value);
			return;
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			std_cost18(value);
			return;
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			std_cost19(value);
			return;
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			std_cost20(value);
			return;
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			std_cost21(value);
			return;
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			std_cost22(value);
			return;
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			std_cost23(value);
			return;
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			std_cost24(value);
			return;
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			std_cost25(value);
			return;
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			std_cost26(value);
			return;
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			std_cost27(value);
			return;
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			std_cost28(value);
			return;
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			std_cost29(value);
			return;
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			std_cost30(value);
			return;
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			std_cost31(value);
			return;
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			std_cost32(value);
			return;
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			std_cost33(value);
			return;
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			std_cost34(value);
			return;
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			std_cost35(value);
			return;
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			std_cost36(value);
			return;
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			std_cost37(value);
			return;
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			std_cost38(value);
			return;
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			std_cost39(value);
			return;
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			std_cost40(value);
			return;
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			std_cost41(value);
			return;
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			std_cost42(value);
			return;
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			std_cost43(value);
			return;
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			std_cost44(value);
			return;
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			std_cost45(value);
			return;
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			std_cost46(value);
			return;
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			std_cost47(value);
			return;
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			std_cost48(value);
			return;
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			std_cost49(value);
			return;
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			std_cost50(value);
			return;
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			std_cost51(value);
			return;
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			std_cost52(value);
			return;
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			std_cost53(value);
			return;
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			std_cost54(value);
			return;
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			std_cost55(value);
			return;
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			std_cost56(value);
			return;
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			std_cost57(value);
			return;
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			std_cost58(value);
			return;
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			std_cost59(value);
			return;
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			std_cost60(value);
			return;
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			std_cost61(value);
			return;
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			std_cost62(value);
			return;
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			std_cost63(value);
			return;
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			std_cost64(value);
			return;
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			std_cost65(value);
			return;
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			std_cost66(value);
			return;
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			std_cost67(value);
			return;
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			std_cost68(value);
			return;
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			std_cost69(value);
			return;
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			std_cost70(value);
			return;
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			std_cost71(value);
			return;
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			std_cost72(value);
			return;
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			std_cost73(value);
			return;
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			std_cost74(value);
			return;
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			std_cost75(value);
			return;
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			std_cost76(value);
			return;
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			std_cost77(value);
			return;
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			std_cost78(value);
			return;
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			std_cost79(value);
			return;
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			std_cost80(value);
			return;
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			std_cost81(value);
			return;
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			std_cost82(value);
			return;
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			std_cost83(value);
			return;
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			std_cost84(value);
			return;
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			std_cost85(value);
			return;
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			std_cost86(value);
			return;
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			std_cost87(value);
			return;
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			std_cost88(value);
			return;
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			std_cost89(value);
			return;
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			std_cost90(value);
			return;
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			std_cost91(value);
			return;
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			std_cost92(value);
			return;
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			std_cost93(value);
			return;
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			std_cost94(value);
			return;
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			std_cost95(value);
			return;
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			std_cost96(value);
			return;
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			std_cost97(value);
			return;
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			std_cost98(value);
			return;
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			std_cost99(value);
			return;
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			std_cost100(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			so_std_amt(value);
			return;
		}
		if ($per.equalsIgnoreCase(name)) {
			per(value);
			return;
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			mfg_cost_ratio(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			mfg_inpt_cost(value);
			return;
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			std_mfg_inpt_cost(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			dir_cost(value);
			return;
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			indir_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			act_cost1(value);
			return;
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			act_cost2(value);
			return;
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			act_cost3(value);
			return;
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			act_cost4(value);
			return;
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			act_cost5(value);
			return;
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			act_cost6(value);
			return;
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			act_cost7(value);
			return;
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			act_cost8(value);
			return;
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			act_cost9(value);
			return;
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			act_cost10(value);
			return;
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			act_cost11(value);
			return;
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			act_cost12(value);
			return;
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			act_cost13(value);
			return;
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			act_cost14(value);
			return;
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			act_cost15(value);
			return;
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			act_cost16(value);
			return;
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			act_cost17(value);
			return;
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			act_cost18(value);
			return;
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			act_cost19(value);
			return;
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			act_cost20(value);
			return;
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			act_cost21(value);
			return;
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			act_cost22(value);
			return;
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			act_cost23(value);
			return;
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			act_cost24(value);
			return;
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			act_cost25(value);
			return;
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			act_cost26(value);
			return;
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			act_cost27(value);
			return;
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			act_cost28(value);
			return;
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			act_cost29(value);
			return;
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			act_cost30(value);
			return;
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			act_cost31(value);
			return;
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			act_cost32(value);
			return;
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			act_cost33(value);
			return;
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			act_cost34(value);
			return;
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			act_cost35(value);
			return;
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			act_cost36(value);
			return;
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			act_cost37(value);
			return;
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			act_cost38(value);
			return;
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			act_cost39(value);
			return;
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			act_cost40(value);
			return;
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			act_cost41(value);
			return;
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			act_cost42(value);
			return;
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			act_cost43(value);
			return;
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			act_cost44(value);
			return;
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			act_cost45(value);
			return;
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			act_cost46(value);
			return;
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			act_cost47(value);
			return;
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			act_cost48(value);
			return;
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			act_cost49(value);
			return;
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			act_cost50(value);
			return;
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			act_cost51(value);
			return;
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			act_cost52(value);
			return;
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			act_cost53(value);
			return;
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			act_cost54(value);
			return;
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			act_cost55(value);
			return;
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			act_cost56(value);
			return;
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			act_cost57(value);
			return;
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			act_cost58(value);
			return;
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			act_cost59(value);
			return;
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			act_cost60(value);
			return;
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			act_cost61(value);
			return;
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			act_cost62(value);
			return;
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			act_cost63(value);
			return;
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			act_cost64(value);
			return;
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			act_cost65(value);
			return;
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			act_cost66(value);
			return;
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			act_cost67(value);
			return;
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			act_cost68(value);
			return;
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			act_cost69(value);
			return;
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			act_cost70(value);
			return;
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			act_cost71(value);
			return;
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			act_cost72(value);
			return;
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			act_cost73(value);
			return;
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			act_cost74(value);
			return;
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			act_cost75(value);
			return;
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			act_cost76(value);
			return;
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			act_cost77(value);
			return;
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			act_cost78(value);
			return;
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			act_cost79(value);
			return;
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			act_cost80(value);
			return;
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			act_cost81(value);
			return;
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			act_cost82(value);
			return;
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			act_cost83(value);
			return;
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			act_cost84(value);
			return;
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			act_cost85(value);
			return;
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			act_cost86(value);
			return;
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			act_cost87(value);
			return;
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			act_cost88(value);
			return;
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			act_cost89(value);
			return;
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			act_cost90(value);
			return;
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			act_cost91(value);
			return;
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			act_cost92(value);
			return;
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			act_cost93(value);
			return;
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			act_cost94(value);
			return;
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			act_cost95(value);
			return;
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			act_cost96(value);
			return;
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			act_cost97(value);
			return;
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			act_cost98(value);
			return;
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			act_cost99(value);
			return;
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			act_cost100(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			std_cost1(value);
			return;
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			std_cost2(value);
			return;
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			std_cost3(value);
			return;
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			std_cost4(value);
			return;
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			std_cost5(value);
			return;
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			std_cost6(value);
			return;
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			std_cost7(value);
			return;
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			std_cost8(value);
			return;
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			std_cost9(value);
			return;
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			std_cost10(value);
			return;
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			std_cost11(value);
			return;
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			std_cost12(value);
			return;
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			std_cost13(value);
			return;
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			std_cost14(value);
			return;
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			std_cost15(value);
			return;
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			std_cost16(value);
			return;
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			std_cost17(value);
			return;
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			std_cost18(value);
			return;
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			std_cost19(value);
			return;
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			std_cost20(value);
			return;
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			std_cost21(value);
			return;
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			std_cost22(value);
			return;
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			std_cost23(value);
			return;
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			std_cost24(value);
			return;
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			std_cost25(value);
			return;
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			std_cost26(value);
			return;
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			std_cost27(value);
			return;
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			std_cost28(value);
			return;
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			std_cost29(value);
			return;
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			std_cost30(value);
			return;
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			std_cost31(value);
			return;
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			std_cost32(value);
			return;
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			std_cost33(value);
			return;
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			std_cost34(value);
			return;
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			std_cost35(value);
			return;
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			std_cost36(value);
			return;
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			std_cost37(value);
			return;
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			std_cost38(value);
			return;
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			std_cost39(value);
			return;
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			std_cost40(value);
			return;
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			std_cost41(value);
			return;
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			std_cost42(value);
			return;
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			std_cost43(value);
			return;
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			std_cost44(value);
			return;
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			std_cost45(value);
			return;
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			std_cost46(value);
			return;
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			std_cost47(value);
			return;
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			std_cost48(value);
			return;
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			std_cost49(value);
			return;
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			std_cost50(value);
			return;
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			std_cost51(value);
			return;
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			std_cost52(value);
			return;
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			std_cost53(value);
			return;
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			std_cost54(value);
			return;
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			std_cost55(value);
			return;
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			std_cost56(value);
			return;
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			std_cost57(value);
			return;
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			std_cost58(value);
			return;
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			std_cost59(value);
			return;
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			std_cost60(value);
			return;
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			std_cost61(value);
			return;
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			std_cost62(value);
			return;
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			std_cost63(value);
			return;
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			std_cost64(value);
			return;
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			std_cost65(value);
			return;
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			std_cost66(value);
			return;
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			std_cost67(value);
			return;
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			std_cost68(value);
			return;
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			std_cost69(value);
			return;
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			std_cost70(value);
			return;
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			std_cost71(value);
			return;
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			std_cost72(value);
			return;
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			std_cost73(value);
			return;
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			std_cost74(value);
			return;
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			std_cost75(value);
			return;
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			std_cost76(value);
			return;
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			std_cost77(value);
			return;
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			std_cost78(value);
			return;
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			std_cost79(value);
			return;
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			std_cost80(value);
			return;
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			std_cost81(value);
			return;
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			std_cost82(value);
			return;
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			std_cost83(value);
			return;
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			std_cost84(value);
			return;
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			std_cost85(value);
			return;
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			std_cost86(value);
			return;
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			std_cost87(value);
			return;
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			std_cost88(value);
			return;
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			std_cost89(value);
			return;
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			std_cost90(value);
			return;
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			std_cost91(value);
			return;
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			std_cost92(value);
			return;
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			std_cost93(value);
			return;
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			std_cost94(value);
			return;
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			std_cost95(value);
			return;
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			std_cost96(value);
			return;
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			std_cost97(value);
			return;
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			std_cost98(value);
			return;
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			std_cost99(value);
			return;
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			std_cost100(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			so_std_amt(value);
			return;
		}
		if ($per.equalsIgnoreCase(name)) {
			per(value);
			return;
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			mfg_cost_ratio(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			mfg_inpt_cost(value);
			return;
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			std_mfg_inpt_cost(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			dir_cost(value);
			return;
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			indir_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			act_cost1(value);
			return;
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			act_cost2(value);
			return;
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			act_cost3(value);
			return;
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			act_cost4(value);
			return;
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			act_cost5(value);
			return;
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			act_cost6(value);
			return;
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			act_cost7(value);
			return;
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			act_cost8(value);
			return;
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			act_cost9(value);
			return;
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			act_cost10(value);
			return;
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			act_cost11(value);
			return;
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			act_cost12(value);
			return;
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			act_cost13(value);
			return;
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			act_cost14(value);
			return;
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			act_cost15(value);
			return;
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			act_cost16(value);
			return;
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			act_cost17(value);
			return;
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			act_cost18(value);
			return;
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			act_cost19(value);
			return;
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			act_cost20(value);
			return;
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			act_cost21(value);
			return;
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			act_cost22(value);
			return;
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			act_cost23(value);
			return;
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			act_cost24(value);
			return;
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			act_cost25(value);
			return;
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			act_cost26(value);
			return;
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			act_cost27(value);
			return;
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			act_cost28(value);
			return;
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			act_cost29(value);
			return;
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			act_cost30(value);
			return;
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			act_cost31(value);
			return;
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			act_cost32(value);
			return;
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			act_cost33(value);
			return;
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			act_cost34(value);
			return;
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			act_cost35(value);
			return;
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			act_cost36(value);
			return;
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			act_cost37(value);
			return;
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			act_cost38(value);
			return;
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			act_cost39(value);
			return;
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			act_cost40(value);
			return;
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			act_cost41(value);
			return;
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			act_cost42(value);
			return;
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			act_cost43(value);
			return;
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			act_cost44(value);
			return;
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			act_cost45(value);
			return;
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			act_cost46(value);
			return;
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			act_cost47(value);
			return;
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			act_cost48(value);
			return;
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			act_cost49(value);
			return;
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			act_cost50(value);
			return;
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			act_cost51(value);
			return;
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			act_cost52(value);
			return;
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			act_cost53(value);
			return;
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			act_cost54(value);
			return;
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			act_cost55(value);
			return;
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			act_cost56(value);
			return;
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			act_cost57(value);
			return;
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			act_cost58(value);
			return;
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			act_cost59(value);
			return;
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			act_cost60(value);
			return;
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			act_cost61(value);
			return;
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			act_cost62(value);
			return;
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			act_cost63(value);
			return;
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			act_cost64(value);
			return;
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			act_cost65(value);
			return;
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			act_cost66(value);
			return;
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			act_cost67(value);
			return;
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			act_cost68(value);
			return;
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			act_cost69(value);
			return;
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			act_cost70(value);
			return;
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			act_cost71(value);
			return;
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			act_cost72(value);
			return;
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			act_cost73(value);
			return;
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			act_cost74(value);
			return;
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			act_cost75(value);
			return;
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			act_cost76(value);
			return;
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			act_cost77(value);
			return;
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			act_cost78(value);
			return;
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			act_cost79(value);
			return;
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			act_cost80(value);
			return;
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			act_cost81(value);
			return;
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			act_cost82(value);
			return;
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			act_cost83(value);
			return;
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			act_cost84(value);
			return;
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			act_cost85(value);
			return;
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			act_cost86(value);
			return;
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			act_cost87(value);
			return;
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			act_cost88(value);
			return;
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			act_cost89(value);
			return;
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			act_cost90(value);
			return;
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			act_cost91(value);
			return;
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			act_cost92(value);
			return;
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			act_cost93(value);
			return;
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			act_cost94(value);
			return;
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			act_cost95(value);
			return;
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			act_cost96(value);
			return;
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			act_cost97(value);
			return;
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			act_cost98(value);
			return;
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			act_cost99(value);
			return;
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			act_cost100(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			std_cost1(value);
			return;
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			std_cost2(value);
			return;
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			std_cost3(value);
			return;
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			std_cost4(value);
			return;
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			std_cost5(value);
			return;
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			std_cost6(value);
			return;
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			std_cost7(value);
			return;
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			std_cost8(value);
			return;
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			std_cost9(value);
			return;
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			std_cost10(value);
			return;
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			std_cost11(value);
			return;
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			std_cost12(value);
			return;
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			std_cost13(value);
			return;
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			std_cost14(value);
			return;
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			std_cost15(value);
			return;
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			std_cost16(value);
			return;
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			std_cost17(value);
			return;
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			std_cost18(value);
			return;
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			std_cost19(value);
			return;
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			std_cost20(value);
			return;
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			std_cost21(value);
			return;
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			std_cost22(value);
			return;
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			std_cost23(value);
			return;
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			std_cost24(value);
			return;
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			std_cost25(value);
			return;
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			std_cost26(value);
			return;
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			std_cost27(value);
			return;
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			std_cost28(value);
			return;
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			std_cost29(value);
			return;
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			std_cost30(value);
			return;
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			std_cost31(value);
			return;
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			std_cost32(value);
			return;
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			std_cost33(value);
			return;
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			std_cost34(value);
			return;
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			std_cost35(value);
			return;
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			std_cost36(value);
			return;
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			std_cost37(value);
			return;
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			std_cost38(value);
			return;
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			std_cost39(value);
			return;
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			std_cost40(value);
			return;
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			std_cost41(value);
			return;
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			std_cost42(value);
			return;
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			std_cost43(value);
			return;
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			std_cost44(value);
			return;
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			std_cost45(value);
			return;
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			std_cost46(value);
			return;
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			std_cost47(value);
			return;
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			std_cost48(value);
			return;
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			std_cost49(value);
			return;
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			std_cost50(value);
			return;
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			std_cost51(value);
			return;
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			std_cost52(value);
			return;
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			std_cost53(value);
			return;
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			std_cost54(value);
			return;
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			std_cost55(value);
			return;
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			std_cost56(value);
			return;
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			std_cost57(value);
			return;
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			std_cost58(value);
			return;
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			std_cost59(value);
			return;
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			std_cost60(value);
			return;
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			std_cost61(value);
			return;
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			std_cost62(value);
			return;
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			std_cost63(value);
			return;
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			std_cost64(value);
			return;
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			std_cost65(value);
			return;
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			std_cost66(value);
			return;
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			std_cost67(value);
			return;
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			std_cost68(value);
			return;
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			std_cost69(value);
			return;
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			std_cost70(value);
			return;
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			std_cost71(value);
			return;
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			std_cost72(value);
			return;
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			std_cost73(value);
			return;
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			std_cost74(value);
			return;
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			std_cost75(value);
			return;
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			std_cost76(value);
			return;
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			std_cost77(value);
			return;
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			std_cost78(value);
			return;
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			std_cost79(value);
			return;
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			std_cost80(value);
			return;
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			std_cost81(value);
			return;
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			std_cost82(value);
			return;
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			std_cost83(value);
			return;
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			std_cost84(value);
			return;
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			std_cost85(value);
			return;
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			std_cost86(value);
			return;
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			std_cost87(value);
			return;
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			std_cost88(value);
			return;
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			std_cost89(value);
			return;
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			std_cost90(value);
			return;
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			std_cost91(value);
			return;
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			std_cost92(value);
			return;
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			std_cost93(value);
			return;
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			std_cost94(value);
			return;
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			std_cost95(value);
			return;
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			std_cost96(value);
			return;
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			std_cost97(value);
			return;
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			std_cost98(value);
			return;
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			std_cost99(value);
			return;
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			std_cost100(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			so_std_amt(value);
			return;
		}
		if ($per.equalsIgnoreCase(name)) {
			per(value);
			return;
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			mfg_cost_ratio(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			mfg_inpt_cost(value);
			return;
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			std_mfg_inpt_cost(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			dir_cost(value);
			return;
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			indir_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			act_cost1(value);
			return;
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			act_cost2(value);
			return;
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			act_cost3(value);
			return;
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			act_cost4(value);
			return;
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			act_cost5(value);
			return;
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			act_cost6(value);
			return;
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			act_cost7(value);
			return;
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			act_cost8(value);
			return;
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			act_cost9(value);
			return;
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			act_cost10(value);
			return;
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			act_cost11(value);
			return;
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			act_cost12(value);
			return;
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			act_cost13(value);
			return;
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			act_cost14(value);
			return;
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			act_cost15(value);
			return;
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			act_cost16(value);
			return;
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			act_cost17(value);
			return;
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			act_cost18(value);
			return;
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			act_cost19(value);
			return;
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			act_cost20(value);
			return;
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			act_cost21(value);
			return;
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			act_cost22(value);
			return;
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			act_cost23(value);
			return;
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			act_cost24(value);
			return;
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			act_cost25(value);
			return;
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			act_cost26(value);
			return;
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			act_cost27(value);
			return;
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			act_cost28(value);
			return;
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			act_cost29(value);
			return;
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			act_cost30(value);
			return;
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			act_cost31(value);
			return;
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			act_cost32(value);
			return;
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			act_cost33(value);
			return;
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			act_cost34(value);
			return;
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			act_cost35(value);
			return;
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			act_cost36(value);
			return;
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			act_cost37(value);
			return;
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			act_cost38(value);
			return;
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			act_cost39(value);
			return;
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			act_cost40(value);
			return;
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			act_cost41(value);
			return;
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			act_cost42(value);
			return;
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			act_cost43(value);
			return;
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			act_cost44(value);
			return;
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			act_cost45(value);
			return;
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			act_cost46(value);
			return;
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			act_cost47(value);
			return;
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			act_cost48(value);
			return;
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			act_cost49(value);
			return;
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			act_cost50(value);
			return;
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			act_cost51(value);
			return;
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			act_cost52(value);
			return;
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			act_cost53(value);
			return;
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			act_cost54(value);
			return;
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			act_cost55(value);
			return;
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			act_cost56(value);
			return;
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			act_cost57(value);
			return;
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			act_cost58(value);
			return;
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			act_cost59(value);
			return;
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			act_cost60(value);
			return;
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			act_cost61(value);
			return;
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			act_cost62(value);
			return;
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			act_cost63(value);
			return;
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			act_cost64(value);
			return;
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			act_cost65(value);
			return;
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			act_cost66(value);
			return;
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			act_cost67(value);
			return;
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			act_cost68(value);
			return;
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			act_cost69(value);
			return;
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			act_cost70(value);
			return;
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			act_cost71(value);
			return;
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			act_cost72(value);
			return;
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			act_cost73(value);
			return;
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			act_cost74(value);
			return;
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			act_cost75(value);
			return;
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			act_cost76(value);
			return;
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			act_cost77(value);
			return;
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			act_cost78(value);
			return;
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			act_cost79(value);
			return;
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			act_cost80(value);
			return;
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			act_cost81(value);
			return;
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			act_cost82(value);
			return;
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			act_cost83(value);
			return;
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			act_cost84(value);
			return;
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			act_cost85(value);
			return;
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			act_cost86(value);
			return;
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			act_cost87(value);
			return;
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			act_cost88(value);
			return;
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			act_cost89(value);
			return;
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			act_cost90(value);
			return;
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			act_cost91(value);
			return;
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			act_cost92(value);
			return;
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			act_cost93(value);
			return;
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			act_cost94(value);
			return;
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			act_cost95(value);
			return;
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			act_cost96(value);
			return;
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			act_cost97(value);
			return;
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			act_cost98(value);
			return;
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			act_cost99(value);
			return;
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			act_cost100(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			std_cost1(value);
			return;
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			std_cost2(value);
			return;
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			std_cost3(value);
			return;
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			std_cost4(value);
			return;
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			std_cost5(value);
			return;
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			std_cost6(value);
			return;
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			std_cost7(value);
			return;
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			std_cost8(value);
			return;
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			std_cost9(value);
			return;
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			std_cost10(value);
			return;
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			std_cost11(value);
			return;
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			std_cost12(value);
			return;
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			std_cost13(value);
			return;
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			std_cost14(value);
			return;
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			std_cost15(value);
			return;
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			std_cost16(value);
			return;
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			std_cost17(value);
			return;
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			std_cost18(value);
			return;
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			std_cost19(value);
			return;
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			std_cost20(value);
			return;
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			std_cost21(value);
			return;
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			std_cost22(value);
			return;
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			std_cost23(value);
			return;
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			std_cost24(value);
			return;
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			std_cost25(value);
			return;
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			std_cost26(value);
			return;
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			std_cost27(value);
			return;
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			std_cost28(value);
			return;
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			std_cost29(value);
			return;
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			std_cost30(value);
			return;
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			std_cost31(value);
			return;
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			std_cost32(value);
			return;
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			std_cost33(value);
			return;
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			std_cost34(value);
			return;
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			std_cost35(value);
			return;
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			std_cost36(value);
			return;
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			std_cost37(value);
			return;
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			std_cost38(value);
			return;
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			std_cost39(value);
			return;
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			std_cost40(value);
			return;
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			std_cost41(value);
			return;
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			std_cost42(value);
			return;
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			std_cost43(value);
			return;
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			std_cost44(value);
			return;
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			std_cost45(value);
			return;
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			std_cost46(value);
			return;
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			std_cost47(value);
			return;
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			std_cost48(value);
			return;
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			std_cost49(value);
			return;
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			std_cost50(value);
			return;
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			std_cost51(value);
			return;
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			std_cost52(value);
			return;
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			std_cost53(value);
			return;
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			std_cost54(value);
			return;
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			std_cost55(value);
			return;
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			std_cost56(value);
			return;
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			std_cost57(value);
			return;
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			std_cost58(value);
			return;
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			std_cost59(value);
			return;
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			std_cost60(value);
			return;
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			std_cost61(value);
			return;
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			std_cost62(value);
			return;
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			std_cost63(value);
			return;
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			std_cost64(value);
			return;
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			std_cost65(value);
			return;
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			std_cost66(value);
			return;
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			std_cost67(value);
			return;
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			std_cost68(value);
			return;
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			std_cost69(value);
			return;
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			std_cost70(value);
			return;
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			std_cost71(value);
			return;
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			std_cost72(value);
			return;
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			std_cost73(value);
			return;
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			std_cost74(value);
			return;
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			std_cost75(value);
			return;
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			std_cost76(value);
			return;
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			std_cost77(value);
			return;
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			std_cost78(value);
			return;
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			std_cost79(value);
			return;
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			std_cost80(value);
			return;
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			std_cost81(value);
			return;
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			std_cost82(value);
			return;
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			std_cost83(value);
			return;
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			std_cost84(value);
			return;
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			std_cost85(value);
			return;
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			std_cost86(value);
			return;
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			std_cost87(value);
			return;
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			std_cost88(value);
			return;
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			std_cost89(value);
			return;
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			std_cost90(value);
			return;
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			std_cost91(value);
			return;
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			std_cost92(value);
			return;
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			std_cost93(value);
			return;
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			std_cost94(value);
			return;
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			std_cost95(value);
			return;
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			std_cost96(value);
			return;
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			std_cost97(value);
			return;
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			std_cost98(value);
			return;
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			std_cost99(value);
			return;
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			std_cost100(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			bi_not_send_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
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
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_rec_typ.equalsIgnoreCase(name)) {
			calc_rec_typ(value);
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
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($act_id.equalsIgnoreCase(name)) {
			act_id(value);
			return;
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			act_id_sub(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			other_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			cost_sls_cd1(value);
			return;
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			cost_sls_cd2(value);
			return;
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			cost_sls_cd3(value);
			return;
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			cost_sls_cd4(value);
			return;
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			cost_sls_cd5(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
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
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			gp_alc_cd(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
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
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			so_std_amt(value);
			return;
		}
		if ($per.equalsIgnoreCase(name)) {
			per(value);
			return;
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			mfg_cost_ratio(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			mfg_inpt_cost(value);
			return;
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			std_mfg_inpt_cost(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			dir_cost(value);
			return;
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			indir_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			act_cost1(value);
			return;
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			act_cost2(value);
			return;
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			act_cost3(value);
			return;
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			act_cost4(value);
			return;
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			act_cost5(value);
			return;
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			act_cost6(value);
			return;
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			act_cost7(value);
			return;
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			act_cost8(value);
			return;
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			act_cost9(value);
			return;
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			act_cost10(value);
			return;
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			act_cost11(value);
			return;
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			act_cost12(value);
			return;
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			act_cost13(value);
			return;
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			act_cost14(value);
			return;
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			act_cost15(value);
			return;
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			act_cost16(value);
			return;
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			act_cost17(value);
			return;
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			act_cost18(value);
			return;
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			act_cost19(value);
			return;
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			act_cost20(value);
			return;
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			act_cost21(value);
			return;
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			act_cost22(value);
			return;
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			act_cost23(value);
			return;
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			act_cost24(value);
			return;
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			act_cost25(value);
			return;
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			act_cost26(value);
			return;
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			act_cost27(value);
			return;
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			act_cost28(value);
			return;
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			act_cost29(value);
			return;
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			act_cost30(value);
			return;
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			act_cost31(value);
			return;
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			act_cost32(value);
			return;
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			act_cost33(value);
			return;
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			act_cost34(value);
			return;
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			act_cost35(value);
			return;
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			act_cost36(value);
			return;
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			act_cost37(value);
			return;
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			act_cost38(value);
			return;
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			act_cost39(value);
			return;
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			act_cost40(value);
			return;
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			act_cost41(value);
			return;
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			act_cost42(value);
			return;
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			act_cost43(value);
			return;
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			act_cost44(value);
			return;
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			act_cost45(value);
			return;
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			act_cost46(value);
			return;
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			act_cost47(value);
			return;
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			act_cost48(value);
			return;
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			act_cost49(value);
			return;
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			act_cost50(value);
			return;
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			act_cost51(value);
			return;
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			act_cost52(value);
			return;
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			act_cost53(value);
			return;
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			act_cost54(value);
			return;
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			act_cost55(value);
			return;
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			act_cost56(value);
			return;
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			act_cost57(value);
			return;
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			act_cost58(value);
			return;
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			act_cost59(value);
			return;
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			act_cost60(value);
			return;
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			act_cost61(value);
			return;
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			act_cost62(value);
			return;
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			act_cost63(value);
			return;
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			act_cost64(value);
			return;
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			act_cost65(value);
			return;
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			act_cost66(value);
			return;
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			act_cost67(value);
			return;
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			act_cost68(value);
			return;
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			act_cost69(value);
			return;
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			act_cost70(value);
			return;
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			act_cost71(value);
			return;
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			act_cost72(value);
			return;
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			act_cost73(value);
			return;
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			act_cost74(value);
			return;
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			act_cost75(value);
			return;
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			act_cost76(value);
			return;
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			act_cost77(value);
			return;
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			act_cost78(value);
			return;
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			act_cost79(value);
			return;
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			act_cost80(value);
			return;
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			act_cost81(value);
			return;
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			act_cost82(value);
			return;
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			act_cost83(value);
			return;
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			act_cost84(value);
			return;
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			act_cost85(value);
			return;
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			act_cost86(value);
			return;
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			act_cost87(value);
			return;
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			act_cost88(value);
			return;
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			act_cost89(value);
			return;
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			act_cost90(value);
			return;
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			act_cost91(value);
			return;
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			act_cost92(value);
			return;
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			act_cost93(value);
			return;
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			act_cost94(value);
			return;
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			act_cost95(value);
			return;
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			act_cost96(value);
			return;
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			act_cost97(value);
			return;
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			act_cost98(value);
			return;
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			act_cost99(value);
			return;
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			act_cost100(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			std_cost1(value);
			return;
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			std_cost2(value);
			return;
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			std_cost3(value);
			return;
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			std_cost4(value);
			return;
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			std_cost5(value);
			return;
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			std_cost6(value);
			return;
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			std_cost7(value);
			return;
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			std_cost8(value);
			return;
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			std_cost9(value);
			return;
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			std_cost10(value);
			return;
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			std_cost11(value);
			return;
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			std_cost12(value);
			return;
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			std_cost13(value);
			return;
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			std_cost14(value);
			return;
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			std_cost15(value);
			return;
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			std_cost16(value);
			return;
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			std_cost17(value);
			return;
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			std_cost18(value);
			return;
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			std_cost19(value);
			return;
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			std_cost20(value);
			return;
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			std_cost21(value);
			return;
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			std_cost22(value);
			return;
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			std_cost23(value);
			return;
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			std_cost24(value);
			return;
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			std_cost25(value);
			return;
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			std_cost26(value);
			return;
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			std_cost27(value);
			return;
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			std_cost28(value);
			return;
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			std_cost29(value);
			return;
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			std_cost30(value);
			return;
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			std_cost31(value);
			return;
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			std_cost32(value);
			return;
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			std_cost33(value);
			return;
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			std_cost34(value);
			return;
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			std_cost35(value);
			return;
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			std_cost36(value);
			return;
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			std_cost37(value);
			return;
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			std_cost38(value);
			return;
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			std_cost39(value);
			return;
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			std_cost40(value);
			return;
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			std_cost41(value);
			return;
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			std_cost42(value);
			return;
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			std_cost43(value);
			return;
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			std_cost44(value);
			return;
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			std_cost45(value);
			return;
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			std_cost46(value);
			return;
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			std_cost47(value);
			return;
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			std_cost48(value);
			return;
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			std_cost49(value);
			return;
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			std_cost50(value);
			return;
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			std_cost51(value);
			return;
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			std_cost52(value);
			return;
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			std_cost53(value);
			return;
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			std_cost54(value);
			return;
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			std_cost55(value);
			return;
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			std_cost56(value);
			return;
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			std_cost57(value);
			return;
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			std_cost58(value);
			return;
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			std_cost59(value);
			return;
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			std_cost60(value);
			return;
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			std_cost61(value);
			return;
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			std_cost62(value);
			return;
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			std_cost63(value);
			return;
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			std_cost64(value);
			return;
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			std_cost65(value);
			return;
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			std_cost66(value);
			return;
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			std_cost67(value);
			return;
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			std_cost68(value);
			return;
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			std_cost69(value);
			return;
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			std_cost70(value);
			return;
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			std_cost71(value);
			return;
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			std_cost72(value);
			return;
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			std_cost73(value);
			return;
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			std_cost74(value);
			return;
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			std_cost75(value);
			return;
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			std_cost76(value);
			return;
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			std_cost77(value);
			return;
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			std_cost78(value);
			return;
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			std_cost79(value);
			return;
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			std_cost80(value);
			return;
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			std_cost81(value);
			return;
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			std_cost82(value);
			return;
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			std_cost83(value);
			return;
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			std_cost84(value);
			return;
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			std_cost85(value);
			return;
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			std_cost86(value);
			return;
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			std_cost87(value);
			return;
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			std_cost88(value);
			return;
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			std_cost89(value);
			return;
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			std_cost90(value);
			return;
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			std_cost91(value);
			return;
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			std_cost92(value);
			return;
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			std_cost93(value);
			return;
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			std_cost94(value);
			return;
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			std_cost95(value);
			return;
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			std_cost96(value);
			return;
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			std_cost97(value);
			return;
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			std_cost98(value);
			return;
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			std_cost99(value);
			return;
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			std_cost100(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			so_std_amt(value);
			return;
		}
		if ($per.equalsIgnoreCase(name)) {
			per(value);
			return;
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			mfg_cost_ratio(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			mfg_inpt_cost(value);
			return;
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			std_mfg_inpt_cost(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			dir_cost(value);
			return;
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			indir_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			act_cost1(value);
			return;
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			act_cost2(value);
			return;
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			act_cost3(value);
			return;
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			act_cost4(value);
			return;
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			act_cost5(value);
			return;
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			act_cost6(value);
			return;
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			act_cost7(value);
			return;
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			act_cost8(value);
			return;
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			act_cost9(value);
			return;
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			act_cost10(value);
			return;
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			act_cost11(value);
			return;
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			act_cost12(value);
			return;
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			act_cost13(value);
			return;
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			act_cost14(value);
			return;
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			act_cost15(value);
			return;
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			act_cost16(value);
			return;
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			act_cost17(value);
			return;
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			act_cost18(value);
			return;
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			act_cost19(value);
			return;
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			act_cost20(value);
			return;
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			act_cost21(value);
			return;
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			act_cost22(value);
			return;
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			act_cost23(value);
			return;
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			act_cost24(value);
			return;
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			act_cost25(value);
			return;
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			act_cost26(value);
			return;
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			act_cost27(value);
			return;
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			act_cost28(value);
			return;
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			act_cost29(value);
			return;
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			act_cost30(value);
			return;
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			act_cost31(value);
			return;
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			act_cost32(value);
			return;
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			act_cost33(value);
			return;
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			act_cost34(value);
			return;
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			act_cost35(value);
			return;
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			act_cost36(value);
			return;
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			act_cost37(value);
			return;
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			act_cost38(value);
			return;
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			act_cost39(value);
			return;
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			act_cost40(value);
			return;
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			act_cost41(value);
			return;
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			act_cost42(value);
			return;
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			act_cost43(value);
			return;
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			act_cost44(value);
			return;
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			act_cost45(value);
			return;
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			act_cost46(value);
			return;
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			act_cost47(value);
			return;
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			act_cost48(value);
			return;
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			act_cost49(value);
			return;
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			act_cost50(value);
			return;
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			act_cost51(value);
			return;
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			act_cost52(value);
			return;
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			act_cost53(value);
			return;
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			act_cost54(value);
			return;
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			act_cost55(value);
			return;
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			act_cost56(value);
			return;
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			act_cost57(value);
			return;
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			act_cost58(value);
			return;
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			act_cost59(value);
			return;
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			act_cost60(value);
			return;
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			act_cost61(value);
			return;
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			act_cost62(value);
			return;
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			act_cost63(value);
			return;
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			act_cost64(value);
			return;
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			act_cost65(value);
			return;
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			act_cost66(value);
			return;
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			act_cost67(value);
			return;
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			act_cost68(value);
			return;
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			act_cost69(value);
			return;
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			act_cost70(value);
			return;
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			act_cost71(value);
			return;
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			act_cost72(value);
			return;
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			act_cost73(value);
			return;
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			act_cost74(value);
			return;
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			act_cost75(value);
			return;
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			act_cost76(value);
			return;
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			act_cost77(value);
			return;
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			act_cost78(value);
			return;
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			act_cost79(value);
			return;
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			act_cost80(value);
			return;
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			act_cost81(value);
			return;
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			act_cost82(value);
			return;
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			act_cost83(value);
			return;
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			act_cost84(value);
			return;
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			act_cost85(value);
			return;
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			act_cost86(value);
			return;
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			act_cost87(value);
			return;
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			act_cost88(value);
			return;
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			act_cost89(value);
			return;
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			act_cost90(value);
			return;
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			act_cost91(value);
			return;
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			act_cost92(value);
			return;
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			act_cost93(value);
			return;
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			act_cost94(value);
			return;
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			act_cost95(value);
			return;
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			act_cost96(value);
			return;
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			act_cost97(value);
			return;
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			act_cost98(value);
			return;
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			act_cost99(value);
			return;
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			act_cost100(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			std_cost1(value);
			return;
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			std_cost2(value);
			return;
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			std_cost3(value);
			return;
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			std_cost4(value);
			return;
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			std_cost5(value);
			return;
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			std_cost6(value);
			return;
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			std_cost7(value);
			return;
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			std_cost8(value);
			return;
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			std_cost9(value);
			return;
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			std_cost10(value);
			return;
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			std_cost11(value);
			return;
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			std_cost12(value);
			return;
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			std_cost13(value);
			return;
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			std_cost14(value);
			return;
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			std_cost15(value);
			return;
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			std_cost16(value);
			return;
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			std_cost17(value);
			return;
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			std_cost18(value);
			return;
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			std_cost19(value);
			return;
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			std_cost20(value);
			return;
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			std_cost21(value);
			return;
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			std_cost22(value);
			return;
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			std_cost23(value);
			return;
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			std_cost24(value);
			return;
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			std_cost25(value);
			return;
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			std_cost26(value);
			return;
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			std_cost27(value);
			return;
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			std_cost28(value);
			return;
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			std_cost29(value);
			return;
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			std_cost30(value);
			return;
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			std_cost31(value);
			return;
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			std_cost32(value);
			return;
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			std_cost33(value);
			return;
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			std_cost34(value);
			return;
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			std_cost35(value);
			return;
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			std_cost36(value);
			return;
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			std_cost37(value);
			return;
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			std_cost38(value);
			return;
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			std_cost39(value);
			return;
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			std_cost40(value);
			return;
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			std_cost41(value);
			return;
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			std_cost42(value);
			return;
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			std_cost43(value);
			return;
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			std_cost44(value);
			return;
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			std_cost45(value);
			return;
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			std_cost46(value);
			return;
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			std_cost47(value);
			return;
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			std_cost48(value);
			return;
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			std_cost49(value);
			return;
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			std_cost50(value);
			return;
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			std_cost51(value);
			return;
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			std_cost52(value);
			return;
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			std_cost53(value);
			return;
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			std_cost54(value);
			return;
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			std_cost55(value);
			return;
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			std_cost56(value);
			return;
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			std_cost57(value);
			return;
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			std_cost58(value);
			return;
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			std_cost59(value);
			return;
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			std_cost60(value);
			return;
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			std_cost61(value);
			return;
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			std_cost62(value);
			return;
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			std_cost63(value);
			return;
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			std_cost64(value);
			return;
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			std_cost65(value);
			return;
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			std_cost66(value);
			return;
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			std_cost67(value);
			return;
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			std_cost68(value);
			return;
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			std_cost69(value);
			return;
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			std_cost70(value);
			return;
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			std_cost71(value);
			return;
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			std_cost72(value);
			return;
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			std_cost73(value);
			return;
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			std_cost74(value);
			return;
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			std_cost75(value);
			return;
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			std_cost76(value);
			return;
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			std_cost77(value);
			return;
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			std_cost78(value);
			return;
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			std_cost79(value);
			return;
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			std_cost80(value);
			return;
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			std_cost81(value);
			return;
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			std_cost82(value);
			return;
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			std_cost83(value);
			return;
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			std_cost84(value);
			return;
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			std_cost85(value);
			return;
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			std_cost86(value);
			return;
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			std_cost87(value);
			return;
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			std_cost88(value);
			return;
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			std_cost89(value);
			return;
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			std_cost90(value);
			return;
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			std_cost91(value);
			return;
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			std_cost92(value);
			return;
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			std_cost93(value);
			return;
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			std_cost94(value);
			return;
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			std_cost95(value);
			return;
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			std_cost96(value);
			return;
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			std_cost97(value);
			return;
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			std_cost98(value);
			return;
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			std_cost99(value);
			return;
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			std_cost100(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			so_std_amt(value);
			return;
		}
		if ($per.equalsIgnoreCase(name)) {
			per(value);
			return;
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			mfg_cost_ratio(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			mfg_inpt_cost(value);
			return;
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			std_mfg_inpt_cost(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			dir_cost(value);
			return;
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			indir_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			act_cost1(value);
			return;
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			act_cost2(value);
			return;
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			act_cost3(value);
			return;
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			act_cost4(value);
			return;
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			act_cost5(value);
			return;
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			act_cost6(value);
			return;
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			act_cost7(value);
			return;
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			act_cost8(value);
			return;
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			act_cost9(value);
			return;
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			act_cost10(value);
			return;
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			act_cost11(value);
			return;
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			act_cost12(value);
			return;
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			act_cost13(value);
			return;
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			act_cost14(value);
			return;
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			act_cost15(value);
			return;
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			act_cost16(value);
			return;
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			act_cost17(value);
			return;
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			act_cost18(value);
			return;
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			act_cost19(value);
			return;
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			act_cost20(value);
			return;
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			act_cost21(value);
			return;
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			act_cost22(value);
			return;
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			act_cost23(value);
			return;
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			act_cost24(value);
			return;
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			act_cost25(value);
			return;
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			act_cost26(value);
			return;
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			act_cost27(value);
			return;
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			act_cost28(value);
			return;
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			act_cost29(value);
			return;
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			act_cost30(value);
			return;
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			act_cost31(value);
			return;
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			act_cost32(value);
			return;
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			act_cost33(value);
			return;
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			act_cost34(value);
			return;
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			act_cost35(value);
			return;
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			act_cost36(value);
			return;
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			act_cost37(value);
			return;
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			act_cost38(value);
			return;
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			act_cost39(value);
			return;
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			act_cost40(value);
			return;
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			act_cost41(value);
			return;
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			act_cost42(value);
			return;
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			act_cost43(value);
			return;
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			act_cost44(value);
			return;
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			act_cost45(value);
			return;
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			act_cost46(value);
			return;
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			act_cost47(value);
			return;
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			act_cost48(value);
			return;
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			act_cost49(value);
			return;
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			act_cost50(value);
			return;
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			act_cost51(value);
			return;
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			act_cost52(value);
			return;
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			act_cost53(value);
			return;
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			act_cost54(value);
			return;
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			act_cost55(value);
			return;
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			act_cost56(value);
			return;
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			act_cost57(value);
			return;
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			act_cost58(value);
			return;
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			act_cost59(value);
			return;
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			act_cost60(value);
			return;
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			act_cost61(value);
			return;
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			act_cost62(value);
			return;
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			act_cost63(value);
			return;
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			act_cost64(value);
			return;
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			act_cost65(value);
			return;
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			act_cost66(value);
			return;
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			act_cost67(value);
			return;
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			act_cost68(value);
			return;
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			act_cost69(value);
			return;
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			act_cost70(value);
			return;
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			act_cost71(value);
			return;
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			act_cost72(value);
			return;
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			act_cost73(value);
			return;
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			act_cost74(value);
			return;
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			act_cost75(value);
			return;
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			act_cost76(value);
			return;
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			act_cost77(value);
			return;
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			act_cost78(value);
			return;
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			act_cost79(value);
			return;
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			act_cost80(value);
			return;
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			act_cost81(value);
			return;
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			act_cost82(value);
			return;
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			act_cost83(value);
			return;
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			act_cost84(value);
			return;
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			act_cost85(value);
			return;
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			act_cost86(value);
			return;
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			act_cost87(value);
			return;
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			act_cost88(value);
			return;
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			act_cost89(value);
			return;
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			act_cost90(value);
			return;
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			act_cost91(value);
			return;
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			act_cost92(value);
			return;
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			act_cost93(value);
			return;
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			act_cost94(value);
			return;
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			act_cost95(value);
			return;
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			act_cost96(value);
			return;
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			act_cost97(value);
			return;
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			act_cost98(value);
			return;
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			act_cost99(value);
			return;
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			act_cost100(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			std_cost1(value);
			return;
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			std_cost2(value);
			return;
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			std_cost3(value);
			return;
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			std_cost4(value);
			return;
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			std_cost5(value);
			return;
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			std_cost6(value);
			return;
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			std_cost7(value);
			return;
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			std_cost8(value);
			return;
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			std_cost9(value);
			return;
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			std_cost10(value);
			return;
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			std_cost11(value);
			return;
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			std_cost12(value);
			return;
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			std_cost13(value);
			return;
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			std_cost14(value);
			return;
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			std_cost15(value);
			return;
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			std_cost16(value);
			return;
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			std_cost17(value);
			return;
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			std_cost18(value);
			return;
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			std_cost19(value);
			return;
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			std_cost20(value);
			return;
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			std_cost21(value);
			return;
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			std_cost22(value);
			return;
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			std_cost23(value);
			return;
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			std_cost24(value);
			return;
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			std_cost25(value);
			return;
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			std_cost26(value);
			return;
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			std_cost27(value);
			return;
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			std_cost28(value);
			return;
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			std_cost29(value);
			return;
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			std_cost30(value);
			return;
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			std_cost31(value);
			return;
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			std_cost32(value);
			return;
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			std_cost33(value);
			return;
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			std_cost34(value);
			return;
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			std_cost35(value);
			return;
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			std_cost36(value);
			return;
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			std_cost37(value);
			return;
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			std_cost38(value);
			return;
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			std_cost39(value);
			return;
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			std_cost40(value);
			return;
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			std_cost41(value);
			return;
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			std_cost42(value);
			return;
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			std_cost43(value);
			return;
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			std_cost44(value);
			return;
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			std_cost45(value);
			return;
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			std_cost46(value);
			return;
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			std_cost47(value);
			return;
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			std_cost48(value);
			return;
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			std_cost49(value);
			return;
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			std_cost50(value);
			return;
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			std_cost51(value);
			return;
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			std_cost52(value);
			return;
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			std_cost53(value);
			return;
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			std_cost54(value);
			return;
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			std_cost55(value);
			return;
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			std_cost56(value);
			return;
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			std_cost57(value);
			return;
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			std_cost58(value);
			return;
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			std_cost59(value);
			return;
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			std_cost60(value);
			return;
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			std_cost61(value);
			return;
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			std_cost62(value);
			return;
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			std_cost63(value);
			return;
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			std_cost64(value);
			return;
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			std_cost65(value);
			return;
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			std_cost66(value);
			return;
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			std_cost67(value);
			return;
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			std_cost68(value);
			return;
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			std_cost69(value);
			return;
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			std_cost70(value);
			return;
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			std_cost71(value);
			return;
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			std_cost72(value);
			return;
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			std_cost73(value);
			return;
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			std_cost74(value);
			return;
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			std_cost75(value);
			return;
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			std_cost76(value);
			return;
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			std_cost77(value);
			return;
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			std_cost78(value);
			return;
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			std_cost79(value);
			return;
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			std_cost80(value);
			return;
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			std_cost81(value);
			return;
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			std_cost82(value);
			return;
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			std_cost83(value);
			return;
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			std_cost84(value);
			return;
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			std_cost85(value);
			return;
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			std_cost86(value);
			return;
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			std_cost87(value);
			return;
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			std_cost88(value);
			return;
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			std_cost89(value);
			return;
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			std_cost90(value);
			return;
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			std_cost91(value);
			return;
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			std_cost92(value);
			return;
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			std_cost93(value);
			return;
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			std_cost94(value);
			return;
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			std_cost95(value);
			return;
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			std_cost96(value);
			return;
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			std_cost97(value);
			return;
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			std_cost98(value);
			return;
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			std_cost99(value);
			return;
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			std_cost100(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			so_std_amt(value);
			return;
		}
		if ($per.equalsIgnoreCase(name)) {
			per(value);
			return;
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			mfg_cost_ratio(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			mfg_inpt_cost(value);
			return;
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			std_mfg_inpt_cost(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			dir_cost(value);
			return;
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			indir_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			act_cost1(value);
			return;
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			act_cost2(value);
			return;
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			act_cost3(value);
			return;
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			act_cost4(value);
			return;
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			act_cost5(value);
			return;
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			act_cost6(value);
			return;
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			act_cost7(value);
			return;
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			act_cost8(value);
			return;
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			act_cost9(value);
			return;
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			act_cost10(value);
			return;
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			act_cost11(value);
			return;
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			act_cost12(value);
			return;
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			act_cost13(value);
			return;
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			act_cost14(value);
			return;
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			act_cost15(value);
			return;
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			act_cost16(value);
			return;
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			act_cost17(value);
			return;
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			act_cost18(value);
			return;
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			act_cost19(value);
			return;
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			act_cost20(value);
			return;
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			act_cost21(value);
			return;
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			act_cost22(value);
			return;
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			act_cost23(value);
			return;
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			act_cost24(value);
			return;
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			act_cost25(value);
			return;
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			act_cost26(value);
			return;
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			act_cost27(value);
			return;
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			act_cost28(value);
			return;
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			act_cost29(value);
			return;
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			act_cost30(value);
			return;
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			act_cost31(value);
			return;
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			act_cost32(value);
			return;
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			act_cost33(value);
			return;
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			act_cost34(value);
			return;
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			act_cost35(value);
			return;
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			act_cost36(value);
			return;
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			act_cost37(value);
			return;
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			act_cost38(value);
			return;
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			act_cost39(value);
			return;
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			act_cost40(value);
			return;
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			act_cost41(value);
			return;
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			act_cost42(value);
			return;
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			act_cost43(value);
			return;
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			act_cost44(value);
			return;
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			act_cost45(value);
			return;
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			act_cost46(value);
			return;
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			act_cost47(value);
			return;
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			act_cost48(value);
			return;
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			act_cost49(value);
			return;
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			act_cost50(value);
			return;
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			act_cost51(value);
			return;
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			act_cost52(value);
			return;
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			act_cost53(value);
			return;
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			act_cost54(value);
			return;
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			act_cost55(value);
			return;
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			act_cost56(value);
			return;
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			act_cost57(value);
			return;
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			act_cost58(value);
			return;
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			act_cost59(value);
			return;
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			act_cost60(value);
			return;
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			act_cost61(value);
			return;
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			act_cost62(value);
			return;
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			act_cost63(value);
			return;
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			act_cost64(value);
			return;
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			act_cost65(value);
			return;
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			act_cost66(value);
			return;
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			act_cost67(value);
			return;
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			act_cost68(value);
			return;
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			act_cost69(value);
			return;
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			act_cost70(value);
			return;
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			act_cost71(value);
			return;
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			act_cost72(value);
			return;
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			act_cost73(value);
			return;
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			act_cost74(value);
			return;
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			act_cost75(value);
			return;
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			act_cost76(value);
			return;
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			act_cost77(value);
			return;
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			act_cost78(value);
			return;
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			act_cost79(value);
			return;
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			act_cost80(value);
			return;
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			act_cost81(value);
			return;
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			act_cost82(value);
			return;
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			act_cost83(value);
			return;
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			act_cost84(value);
			return;
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			act_cost85(value);
			return;
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			act_cost86(value);
			return;
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			act_cost87(value);
			return;
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			act_cost88(value);
			return;
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			act_cost89(value);
			return;
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			act_cost90(value);
			return;
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			act_cost91(value);
			return;
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			act_cost92(value);
			return;
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			act_cost93(value);
			return;
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			act_cost94(value);
			return;
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			act_cost95(value);
			return;
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			act_cost96(value);
			return;
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			act_cost97(value);
			return;
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			act_cost98(value);
			return;
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			act_cost99(value);
			return;
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			act_cost100(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			std_cost1(value);
			return;
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			std_cost2(value);
			return;
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			std_cost3(value);
			return;
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			std_cost4(value);
			return;
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			std_cost5(value);
			return;
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			std_cost6(value);
			return;
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			std_cost7(value);
			return;
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			std_cost8(value);
			return;
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			std_cost9(value);
			return;
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			std_cost10(value);
			return;
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			std_cost11(value);
			return;
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			std_cost12(value);
			return;
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			std_cost13(value);
			return;
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			std_cost14(value);
			return;
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			std_cost15(value);
			return;
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			std_cost16(value);
			return;
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			std_cost17(value);
			return;
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			std_cost18(value);
			return;
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			std_cost19(value);
			return;
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			std_cost20(value);
			return;
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			std_cost21(value);
			return;
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			std_cost22(value);
			return;
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			std_cost23(value);
			return;
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			std_cost24(value);
			return;
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			std_cost25(value);
			return;
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			std_cost26(value);
			return;
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			std_cost27(value);
			return;
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			std_cost28(value);
			return;
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			std_cost29(value);
			return;
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			std_cost30(value);
			return;
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			std_cost31(value);
			return;
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			std_cost32(value);
			return;
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			std_cost33(value);
			return;
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			std_cost34(value);
			return;
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			std_cost35(value);
			return;
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			std_cost36(value);
			return;
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			std_cost37(value);
			return;
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			std_cost38(value);
			return;
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			std_cost39(value);
			return;
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			std_cost40(value);
			return;
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			std_cost41(value);
			return;
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			std_cost42(value);
			return;
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			std_cost43(value);
			return;
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			std_cost44(value);
			return;
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			std_cost45(value);
			return;
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			std_cost46(value);
			return;
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			std_cost47(value);
			return;
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			std_cost48(value);
			return;
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			std_cost49(value);
			return;
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			std_cost50(value);
			return;
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			std_cost51(value);
			return;
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			std_cost52(value);
			return;
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			std_cost53(value);
			return;
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			std_cost54(value);
			return;
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			std_cost55(value);
			return;
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			std_cost56(value);
			return;
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			std_cost57(value);
			return;
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			std_cost58(value);
			return;
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			std_cost59(value);
			return;
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			std_cost60(value);
			return;
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			std_cost61(value);
			return;
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			std_cost62(value);
			return;
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			std_cost63(value);
			return;
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			std_cost64(value);
			return;
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			std_cost65(value);
			return;
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			std_cost66(value);
			return;
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			std_cost67(value);
			return;
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			std_cost68(value);
			return;
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			std_cost69(value);
			return;
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			std_cost70(value);
			return;
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			std_cost71(value);
			return;
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			std_cost72(value);
			return;
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			std_cost73(value);
			return;
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			std_cost74(value);
			return;
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			std_cost75(value);
			return;
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			std_cost76(value);
			return;
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			std_cost77(value);
			return;
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			std_cost78(value);
			return;
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			std_cost79(value);
			return;
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			std_cost80(value);
			return;
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			std_cost81(value);
			return;
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			std_cost82(value);
			return;
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			std_cost83(value);
			return;
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			std_cost84(value);
			return;
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			std_cost85(value);
			return;
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			std_cost86(value);
			return;
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			std_cost87(value);
			return;
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			std_cost88(value);
			return;
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			std_cost89(value);
			return;
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			std_cost90(value);
			return;
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			std_cost91(value);
			return;
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			std_cost92(value);
			return;
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			std_cost93(value);
			return;
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			std_cost94(value);
			return;
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			std_cost95(value);
			return;
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			std_cost96(value);
			return;
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			std_cost97(value);
			return;
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			std_cost98(value);
			return;
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			std_cost99(value);
			return;
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			std_cost100(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($so_std_amt.equalsIgnoreCase(name)) {
			so_std_amt(value);
			return;
		}
		if ($per.equalsIgnoreCase(name)) {
			per(value);
			return;
		}
		if ($mfg_cost_ratio.equalsIgnoreCase(name)) {
			mfg_cost_ratio(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($mfg_inpt_cost.equalsIgnoreCase(name)) {
			mfg_inpt_cost(value);
			return;
		}
		if ($std_mfg_inpt_cost.equalsIgnoreCase(name)) {
			std_mfg_inpt_cost(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($dir_cost.equalsIgnoreCase(name)) {
			dir_cost(value);
			return;
		}
		if ($indir_cost.equalsIgnoreCase(name)) {
			indir_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($act_cost1.equalsIgnoreCase(name)) {
			act_cost1(value);
			return;
		}
		if ($act_cost2.equalsIgnoreCase(name)) {
			act_cost2(value);
			return;
		}
		if ($act_cost3.equalsIgnoreCase(name)) {
			act_cost3(value);
			return;
		}
		if ($act_cost4.equalsIgnoreCase(name)) {
			act_cost4(value);
			return;
		}
		if ($act_cost5.equalsIgnoreCase(name)) {
			act_cost5(value);
			return;
		}
		if ($act_cost6.equalsIgnoreCase(name)) {
			act_cost6(value);
			return;
		}
		if ($act_cost7.equalsIgnoreCase(name)) {
			act_cost7(value);
			return;
		}
		if ($act_cost8.equalsIgnoreCase(name)) {
			act_cost8(value);
			return;
		}
		if ($act_cost9.equalsIgnoreCase(name)) {
			act_cost9(value);
			return;
		}
		if ($act_cost10.equalsIgnoreCase(name)) {
			act_cost10(value);
			return;
		}
		if ($act_cost11.equalsIgnoreCase(name)) {
			act_cost11(value);
			return;
		}
		if ($act_cost12.equalsIgnoreCase(name)) {
			act_cost12(value);
			return;
		}
		if ($act_cost13.equalsIgnoreCase(name)) {
			act_cost13(value);
			return;
		}
		if ($act_cost14.equalsIgnoreCase(name)) {
			act_cost14(value);
			return;
		}
		if ($act_cost15.equalsIgnoreCase(name)) {
			act_cost15(value);
			return;
		}
		if ($act_cost16.equalsIgnoreCase(name)) {
			act_cost16(value);
			return;
		}
		if ($act_cost17.equalsIgnoreCase(name)) {
			act_cost17(value);
			return;
		}
		if ($act_cost18.equalsIgnoreCase(name)) {
			act_cost18(value);
			return;
		}
		if ($act_cost19.equalsIgnoreCase(name)) {
			act_cost19(value);
			return;
		}
		if ($act_cost20.equalsIgnoreCase(name)) {
			act_cost20(value);
			return;
		}
		if ($act_cost21.equalsIgnoreCase(name)) {
			act_cost21(value);
			return;
		}
		if ($act_cost22.equalsIgnoreCase(name)) {
			act_cost22(value);
			return;
		}
		if ($act_cost23.equalsIgnoreCase(name)) {
			act_cost23(value);
			return;
		}
		if ($act_cost24.equalsIgnoreCase(name)) {
			act_cost24(value);
			return;
		}
		if ($act_cost25.equalsIgnoreCase(name)) {
			act_cost25(value);
			return;
		}
		if ($act_cost26.equalsIgnoreCase(name)) {
			act_cost26(value);
			return;
		}
		if ($act_cost27.equalsIgnoreCase(name)) {
			act_cost27(value);
			return;
		}
		if ($act_cost28.equalsIgnoreCase(name)) {
			act_cost28(value);
			return;
		}
		if ($act_cost29.equalsIgnoreCase(name)) {
			act_cost29(value);
			return;
		}
		if ($act_cost30.equalsIgnoreCase(name)) {
			act_cost30(value);
			return;
		}
		if ($act_cost31.equalsIgnoreCase(name)) {
			act_cost31(value);
			return;
		}
		if ($act_cost32.equalsIgnoreCase(name)) {
			act_cost32(value);
			return;
		}
		if ($act_cost33.equalsIgnoreCase(name)) {
			act_cost33(value);
			return;
		}
		if ($act_cost34.equalsIgnoreCase(name)) {
			act_cost34(value);
			return;
		}
		if ($act_cost35.equalsIgnoreCase(name)) {
			act_cost35(value);
			return;
		}
		if ($act_cost36.equalsIgnoreCase(name)) {
			act_cost36(value);
			return;
		}
		if ($act_cost37.equalsIgnoreCase(name)) {
			act_cost37(value);
			return;
		}
		if ($act_cost38.equalsIgnoreCase(name)) {
			act_cost38(value);
			return;
		}
		if ($act_cost39.equalsIgnoreCase(name)) {
			act_cost39(value);
			return;
		}
		if ($act_cost40.equalsIgnoreCase(name)) {
			act_cost40(value);
			return;
		}
		if ($act_cost41.equalsIgnoreCase(name)) {
			act_cost41(value);
			return;
		}
		if ($act_cost42.equalsIgnoreCase(name)) {
			act_cost42(value);
			return;
		}
		if ($act_cost43.equalsIgnoreCase(name)) {
			act_cost43(value);
			return;
		}
		if ($act_cost44.equalsIgnoreCase(name)) {
			act_cost44(value);
			return;
		}
		if ($act_cost45.equalsIgnoreCase(name)) {
			act_cost45(value);
			return;
		}
		if ($act_cost46.equalsIgnoreCase(name)) {
			act_cost46(value);
			return;
		}
		if ($act_cost47.equalsIgnoreCase(name)) {
			act_cost47(value);
			return;
		}
		if ($act_cost48.equalsIgnoreCase(name)) {
			act_cost48(value);
			return;
		}
		if ($act_cost49.equalsIgnoreCase(name)) {
			act_cost49(value);
			return;
		}
		if ($act_cost50.equalsIgnoreCase(name)) {
			act_cost50(value);
			return;
		}
		if ($act_cost51.equalsIgnoreCase(name)) {
			act_cost51(value);
			return;
		}
		if ($act_cost52.equalsIgnoreCase(name)) {
			act_cost52(value);
			return;
		}
		if ($act_cost53.equalsIgnoreCase(name)) {
			act_cost53(value);
			return;
		}
		if ($act_cost54.equalsIgnoreCase(name)) {
			act_cost54(value);
			return;
		}
		if ($act_cost55.equalsIgnoreCase(name)) {
			act_cost55(value);
			return;
		}
		if ($act_cost56.equalsIgnoreCase(name)) {
			act_cost56(value);
			return;
		}
		if ($act_cost57.equalsIgnoreCase(name)) {
			act_cost57(value);
			return;
		}
		if ($act_cost58.equalsIgnoreCase(name)) {
			act_cost58(value);
			return;
		}
		if ($act_cost59.equalsIgnoreCase(name)) {
			act_cost59(value);
			return;
		}
		if ($act_cost60.equalsIgnoreCase(name)) {
			act_cost60(value);
			return;
		}
		if ($act_cost61.equalsIgnoreCase(name)) {
			act_cost61(value);
			return;
		}
		if ($act_cost62.equalsIgnoreCase(name)) {
			act_cost62(value);
			return;
		}
		if ($act_cost63.equalsIgnoreCase(name)) {
			act_cost63(value);
			return;
		}
		if ($act_cost64.equalsIgnoreCase(name)) {
			act_cost64(value);
			return;
		}
		if ($act_cost65.equalsIgnoreCase(name)) {
			act_cost65(value);
			return;
		}
		if ($act_cost66.equalsIgnoreCase(name)) {
			act_cost66(value);
			return;
		}
		if ($act_cost67.equalsIgnoreCase(name)) {
			act_cost67(value);
			return;
		}
		if ($act_cost68.equalsIgnoreCase(name)) {
			act_cost68(value);
			return;
		}
		if ($act_cost69.equalsIgnoreCase(name)) {
			act_cost69(value);
			return;
		}
		if ($act_cost70.equalsIgnoreCase(name)) {
			act_cost70(value);
			return;
		}
		if ($act_cost71.equalsIgnoreCase(name)) {
			act_cost71(value);
			return;
		}
		if ($act_cost72.equalsIgnoreCase(name)) {
			act_cost72(value);
			return;
		}
		if ($act_cost73.equalsIgnoreCase(name)) {
			act_cost73(value);
			return;
		}
		if ($act_cost74.equalsIgnoreCase(name)) {
			act_cost74(value);
			return;
		}
		if ($act_cost75.equalsIgnoreCase(name)) {
			act_cost75(value);
			return;
		}
		if ($act_cost76.equalsIgnoreCase(name)) {
			act_cost76(value);
			return;
		}
		if ($act_cost77.equalsIgnoreCase(name)) {
			act_cost77(value);
			return;
		}
		if ($act_cost78.equalsIgnoreCase(name)) {
			act_cost78(value);
			return;
		}
		if ($act_cost79.equalsIgnoreCase(name)) {
			act_cost79(value);
			return;
		}
		if ($act_cost80.equalsIgnoreCase(name)) {
			act_cost80(value);
			return;
		}
		if ($act_cost81.equalsIgnoreCase(name)) {
			act_cost81(value);
			return;
		}
		if ($act_cost82.equalsIgnoreCase(name)) {
			act_cost82(value);
			return;
		}
		if ($act_cost83.equalsIgnoreCase(name)) {
			act_cost83(value);
			return;
		}
		if ($act_cost84.equalsIgnoreCase(name)) {
			act_cost84(value);
			return;
		}
		if ($act_cost85.equalsIgnoreCase(name)) {
			act_cost85(value);
			return;
		}
		if ($act_cost86.equalsIgnoreCase(name)) {
			act_cost86(value);
			return;
		}
		if ($act_cost87.equalsIgnoreCase(name)) {
			act_cost87(value);
			return;
		}
		if ($act_cost88.equalsIgnoreCase(name)) {
			act_cost88(value);
			return;
		}
		if ($act_cost89.equalsIgnoreCase(name)) {
			act_cost89(value);
			return;
		}
		if ($act_cost90.equalsIgnoreCase(name)) {
			act_cost90(value);
			return;
		}
		if ($act_cost91.equalsIgnoreCase(name)) {
			act_cost91(value);
			return;
		}
		if ($act_cost92.equalsIgnoreCase(name)) {
			act_cost92(value);
			return;
		}
		if ($act_cost93.equalsIgnoreCase(name)) {
			act_cost93(value);
			return;
		}
		if ($act_cost94.equalsIgnoreCase(name)) {
			act_cost94(value);
			return;
		}
		if ($act_cost95.equalsIgnoreCase(name)) {
			act_cost95(value);
			return;
		}
		if ($act_cost96.equalsIgnoreCase(name)) {
			act_cost96(value);
			return;
		}
		if ($act_cost97.equalsIgnoreCase(name)) {
			act_cost97(value);
			return;
		}
		if ($act_cost98.equalsIgnoreCase(name)) {
			act_cost98(value);
			return;
		}
		if ($act_cost99.equalsIgnoreCase(name)) {
			act_cost99(value);
			return;
		}
		if ($act_cost100.equalsIgnoreCase(name)) {
			act_cost100(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost1.equalsIgnoreCase(name)) {
			std_cost1(value);
			return;
		}
		if ($std_cost2.equalsIgnoreCase(name)) {
			std_cost2(value);
			return;
		}
		if ($std_cost3.equalsIgnoreCase(name)) {
			std_cost3(value);
			return;
		}
		if ($std_cost4.equalsIgnoreCase(name)) {
			std_cost4(value);
			return;
		}
		if ($std_cost5.equalsIgnoreCase(name)) {
			std_cost5(value);
			return;
		}
		if ($std_cost6.equalsIgnoreCase(name)) {
			std_cost6(value);
			return;
		}
		if ($std_cost7.equalsIgnoreCase(name)) {
			std_cost7(value);
			return;
		}
		if ($std_cost8.equalsIgnoreCase(name)) {
			std_cost8(value);
			return;
		}
		if ($std_cost9.equalsIgnoreCase(name)) {
			std_cost9(value);
			return;
		}
		if ($std_cost10.equalsIgnoreCase(name)) {
			std_cost10(value);
			return;
		}
		if ($std_cost11.equalsIgnoreCase(name)) {
			std_cost11(value);
			return;
		}
		if ($std_cost12.equalsIgnoreCase(name)) {
			std_cost12(value);
			return;
		}
		if ($std_cost13.equalsIgnoreCase(name)) {
			std_cost13(value);
			return;
		}
		if ($std_cost14.equalsIgnoreCase(name)) {
			std_cost14(value);
			return;
		}
		if ($std_cost15.equalsIgnoreCase(name)) {
			std_cost15(value);
			return;
		}
		if ($std_cost16.equalsIgnoreCase(name)) {
			std_cost16(value);
			return;
		}
		if ($std_cost17.equalsIgnoreCase(name)) {
			std_cost17(value);
			return;
		}
		if ($std_cost18.equalsIgnoreCase(name)) {
			std_cost18(value);
			return;
		}
		if ($std_cost19.equalsIgnoreCase(name)) {
			std_cost19(value);
			return;
		}
		if ($std_cost20.equalsIgnoreCase(name)) {
			std_cost20(value);
			return;
		}
		if ($std_cost21.equalsIgnoreCase(name)) {
			std_cost21(value);
			return;
		}
		if ($std_cost22.equalsIgnoreCase(name)) {
			std_cost22(value);
			return;
		}
		if ($std_cost23.equalsIgnoreCase(name)) {
			std_cost23(value);
			return;
		}
		if ($std_cost24.equalsIgnoreCase(name)) {
			std_cost24(value);
			return;
		}
		if ($std_cost25.equalsIgnoreCase(name)) {
			std_cost25(value);
			return;
		}
		if ($std_cost26.equalsIgnoreCase(name)) {
			std_cost26(value);
			return;
		}
		if ($std_cost27.equalsIgnoreCase(name)) {
			std_cost27(value);
			return;
		}
		if ($std_cost28.equalsIgnoreCase(name)) {
			std_cost28(value);
			return;
		}
		if ($std_cost29.equalsIgnoreCase(name)) {
			std_cost29(value);
			return;
		}
		if ($std_cost30.equalsIgnoreCase(name)) {
			std_cost30(value);
			return;
		}
		if ($std_cost31.equalsIgnoreCase(name)) {
			std_cost31(value);
			return;
		}
		if ($std_cost32.equalsIgnoreCase(name)) {
			std_cost32(value);
			return;
		}
		if ($std_cost33.equalsIgnoreCase(name)) {
			std_cost33(value);
			return;
		}
		if ($std_cost34.equalsIgnoreCase(name)) {
			std_cost34(value);
			return;
		}
		if ($std_cost35.equalsIgnoreCase(name)) {
			std_cost35(value);
			return;
		}
		if ($std_cost36.equalsIgnoreCase(name)) {
			std_cost36(value);
			return;
		}
		if ($std_cost37.equalsIgnoreCase(name)) {
			std_cost37(value);
			return;
		}
		if ($std_cost38.equalsIgnoreCase(name)) {
			std_cost38(value);
			return;
		}
		if ($std_cost39.equalsIgnoreCase(name)) {
			std_cost39(value);
			return;
		}
		if ($std_cost40.equalsIgnoreCase(name)) {
			std_cost40(value);
			return;
		}
		if ($std_cost41.equalsIgnoreCase(name)) {
			std_cost41(value);
			return;
		}
		if ($std_cost42.equalsIgnoreCase(name)) {
			std_cost42(value);
			return;
		}
		if ($std_cost43.equalsIgnoreCase(name)) {
			std_cost43(value);
			return;
		}
		if ($std_cost44.equalsIgnoreCase(name)) {
			std_cost44(value);
			return;
		}
		if ($std_cost45.equalsIgnoreCase(name)) {
			std_cost45(value);
			return;
		}
		if ($std_cost46.equalsIgnoreCase(name)) {
			std_cost46(value);
			return;
		}
		if ($std_cost47.equalsIgnoreCase(name)) {
			std_cost47(value);
			return;
		}
		if ($std_cost48.equalsIgnoreCase(name)) {
			std_cost48(value);
			return;
		}
		if ($std_cost49.equalsIgnoreCase(name)) {
			std_cost49(value);
			return;
		}
		if ($std_cost50.equalsIgnoreCase(name)) {
			std_cost50(value);
			return;
		}
		if ($std_cost51.equalsIgnoreCase(name)) {
			std_cost51(value);
			return;
		}
		if ($std_cost52.equalsIgnoreCase(name)) {
			std_cost52(value);
			return;
		}
		if ($std_cost53.equalsIgnoreCase(name)) {
			std_cost53(value);
			return;
		}
		if ($std_cost54.equalsIgnoreCase(name)) {
			std_cost54(value);
			return;
		}
		if ($std_cost55.equalsIgnoreCase(name)) {
			std_cost55(value);
			return;
		}
		if ($std_cost56.equalsIgnoreCase(name)) {
			std_cost56(value);
			return;
		}
		if ($std_cost57.equalsIgnoreCase(name)) {
			std_cost57(value);
			return;
		}
		if ($std_cost58.equalsIgnoreCase(name)) {
			std_cost58(value);
			return;
		}
		if ($std_cost59.equalsIgnoreCase(name)) {
			std_cost59(value);
			return;
		}
		if ($std_cost60.equalsIgnoreCase(name)) {
			std_cost60(value);
			return;
		}
		if ($std_cost61.equalsIgnoreCase(name)) {
			std_cost61(value);
			return;
		}
		if ($std_cost62.equalsIgnoreCase(name)) {
			std_cost62(value);
			return;
		}
		if ($std_cost63.equalsIgnoreCase(name)) {
			std_cost63(value);
			return;
		}
		if ($std_cost64.equalsIgnoreCase(name)) {
			std_cost64(value);
			return;
		}
		if ($std_cost65.equalsIgnoreCase(name)) {
			std_cost65(value);
			return;
		}
		if ($std_cost66.equalsIgnoreCase(name)) {
			std_cost66(value);
			return;
		}
		if ($std_cost67.equalsIgnoreCase(name)) {
			std_cost67(value);
			return;
		}
		if ($std_cost68.equalsIgnoreCase(name)) {
			std_cost68(value);
			return;
		}
		if ($std_cost69.equalsIgnoreCase(name)) {
			std_cost69(value);
			return;
		}
		if ($std_cost70.equalsIgnoreCase(name)) {
			std_cost70(value);
			return;
		}
		if ($std_cost71.equalsIgnoreCase(name)) {
			std_cost71(value);
			return;
		}
		if ($std_cost72.equalsIgnoreCase(name)) {
			std_cost72(value);
			return;
		}
		if ($std_cost73.equalsIgnoreCase(name)) {
			std_cost73(value);
			return;
		}
		if ($std_cost74.equalsIgnoreCase(name)) {
			std_cost74(value);
			return;
		}
		if ($std_cost75.equalsIgnoreCase(name)) {
			std_cost75(value);
			return;
		}
		if ($std_cost76.equalsIgnoreCase(name)) {
			std_cost76(value);
			return;
		}
		if ($std_cost77.equalsIgnoreCase(name)) {
			std_cost77(value);
			return;
		}
		if ($std_cost78.equalsIgnoreCase(name)) {
			std_cost78(value);
			return;
		}
		if ($std_cost79.equalsIgnoreCase(name)) {
			std_cost79(value);
			return;
		}
		if ($std_cost80.equalsIgnoreCase(name)) {
			std_cost80(value);
			return;
		}
		if ($std_cost81.equalsIgnoreCase(name)) {
			std_cost81(value);
			return;
		}
		if ($std_cost82.equalsIgnoreCase(name)) {
			std_cost82(value);
			return;
		}
		if ($std_cost83.equalsIgnoreCase(name)) {
			std_cost83(value);
			return;
		}
		if ($std_cost84.equalsIgnoreCase(name)) {
			std_cost84(value);
			return;
		}
		if ($std_cost85.equalsIgnoreCase(name)) {
			std_cost85(value);
			return;
		}
		if ($std_cost86.equalsIgnoreCase(name)) {
			std_cost86(value);
			return;
		}
		if ($std_cost87.equalsIgnoreCase(name)) {
			std_cost87(value);
			return;
		}
		if ($std_cost88.equalsIgnoreCase(name)) {
			std_cost88(value);
			return;
		}
		if ($std_cost89.equalsIgnoreCase(name)) {
			std_cost89(value);
			return;
		}
		if ($std_cost90.equalsIgnoreCase(name)) {
			std_cost90(value);
			return;
		}
		if ($std_cost91.equalsIgnoreCase(name)) {
			std_cost91(value);
			return;
		}
		if ($std_cost92.equalsIgnoreCase(name)) {
			std_cost92(value);
			return;
		}
		if ($std_cost93.equalsIgnoreCase(name)) {
			std_cost93(value);
			return;
		}
		if ($std_cost94.equalsIgnoreCase(name)) {
			std_cost94(value);
			return;
		}
		if ($std_cost95.equalsIgnoreCase(name)) {
			std_cost95(value);
			return;
		}
		if ($std_cost96.equalsIgnoreCase(name)) {
			std_cost96(value);
			return;
		}
		if ($std_cost97.equalsIgnoreCase(name)) {
			std_cost97(value);
			return;
		}
		if ($std_cost98.equalsIgnoreCase(name)) {
			std_cost98(value);
			return;
		}
		if ($std_cost99.equalsIgnoreCase(name)) {
			std_cost99(value);
			return;
		}
		if ($std_cost100.equalsIgnoreCase(name)) {
			std_cost100(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			bi_not_send_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
