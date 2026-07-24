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
 * "移動・移送予定 // Movement/transport schedule"DBコンテナRowクラスです。<p>
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
 *  	<td>xfr_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移動・移送予定ＮＯ</td>
 *  	<td>Movement/transport schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_src_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移動・移送元区分</td>
 *  	<td>Source movement/transport type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_src_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移動・移送元ＮＯ</td>
 *  	<td>Source movement/transport No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引パタン区分</td>
 *  	<td>Transaction pattern type</td>
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
 *  	<td>gi_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫物流グループＣＤ</td>
 *  	<td>GI distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫場所ＣＤ</td>
 *  	<td>GI location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫棚・ラインＣＤ</td>
 *  	<td>GI rack/line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫在庫着荷先ＣＤ</td>
 *  	<td>GI inventory arriving point cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫ワーキンググループＣＤ</td>
 *  	<td>GR WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫物流グループＣＤ</td>
 *  	<td>GR distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫場所ＣＤ</td>
 *  	<td>GR location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫棚・ラインＣＤ</td>
 *  	<td>GR rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫在庫着荷先ＣＤ</td>
 *  	<td>GR inventory arriving point cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
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
 *  	<td>gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>格付ＣＤ</td>
 *  	<td>Grading cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>良品区分</td>
 *  	<td>Conforming type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫識別区分</td>
 *  	<td>Inventory identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫取引先ＣＤ</td>
 *  	<td>Inventory BP cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位数量</td>
 *  	<td>Transaction unit qty.</td>
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
 *  	<td>gi_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫希望日時</td>
 *  	<td>Desired GI date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫希望日時</td>
 *  	<td>Desired GR date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受付日</td>
 *  	<td>Receiving date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元担当者ＣＤ</td>
 *  	<td>Requesting PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元部門ＣＤ</td>
 *  	<td>Requesting dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_term_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷条件ＣＤ</td>
 *  	<td>Shipping conditions cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_inst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷指図区分</td>
 *  	<td>Shipping order type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>理由ＣＤ</td>
 *  	<td>Reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担部門ＣＤ</td>
 *  	<td>Charged dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_block_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷留めＦＬＧ</td>
 *  	<td>Pending shipping flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先識別区分</td>
 *  	<td>Receiving point identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_to_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先識別ＣＤ</td>
 *  	<td>Receiving point identification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_id_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先識別名</td>
 *  	<td>Receiving point Identification name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_to_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先郵便番号</td>
 *  	<td>Receiving point zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先住所１</td>
 *  	<td>Receiving point address 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_to_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先住所２</td>
 *  	<td>Receiving point address 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先住所３</td>
 *  	<td>Receiving point address 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_to_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先住所４</td>
 *  	<td>Receiving point address 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先部署</td>
 *  	<td>Receiving point dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_to_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先担当者</td>
 *  	<td>Receiving point PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先ＴＥＬ</td>
 *  	<td>Receiving point TEL</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_to_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送付先ＦＡＸ</td>
 *  	<td>Receiving point FAX</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送付先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous receiving point flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>via_dlv_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先経由区分</td>
 *  	<td>Receiving point stopover type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目オーダＮＯ</td>
 *  	<td>Item order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程指図ＮＯ</td>
 *  	<td>Operation order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入予定ＮＯ</td>
 *  	<td>Input schedule No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注ＮＯ</td>
 *  	<td>Sales order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注明細ＮＯ</td>
 *  	<td>Sales order details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cont_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入有効成分</td>
 *  	<td>Input active ingredient</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_mod_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>依頼元訂正ＦＬＧ</td>
 *  	<td>Edited by request source flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>紐切れＦＬＧ</td>
 *  	<td>Unpegged flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_lot_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット混在不可ＦＬＧ</td>
 *  	<td>Prohibit mixed lots flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_sublot_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロット混在不可ＦＬＧ</td>
 *  	<td>Prohibit mixed sublots flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>vld_dt_fr</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効期限ＦＲＯＭ</td>
 *  	<td>Expiration date FROM</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>vld_dt_to</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効期限ＴＯ</td>
 *  	<td>Expiration date TO</td>
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
 *  	<td>prov_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給計上区分</td>
 *  	<td>Supply recording type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate_inpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レート指定ＦＬＧ</td>
 *  	<td>Set exchange rate flg.</td>
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
 *  	<td>ptax_xrate_inpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納税為替レート指定ＦＬＧ</td>
 *  	<td>Taxpaying exchange rate specification flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ptax_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税為替レート</td>
 *  	<td>Taxpaying exchange rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>税指定ＦＬＧ</td>
 *  	<td>Tax specified flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税ＣＤ</td>
 *  	<td>Tax cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨単価</td>
 *  	<td>Unit price (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨金額</td>
 *  	<td>Amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨税額</td>
 *  	<td>Tax amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wtax_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>源泉税率</td>
 *  	<td>Withholding tax rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wtax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>源泉税額</td>
 *  	<td>Withholding tax</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_prov_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給区分（返品）</td>
 *  	<td>Supply type (Return)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_prov_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給計上区分（返品）</td>
 *  	<td>Supply recording type (Return)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_xrate_inpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レート指定ＦＬＧ（返品）</td>
 *  	<td>Set exchange rate flg. (Return)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レート（返品）</td>
 *  	<td>Exchange rate (Return)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_ptax_xrate_inpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納税為替レート指定ＦＬＧ（返品）</td>
 *  	<td>Taxpaying exchange rate specification flg. (Return)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_ptax_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税為替レート（返品）</td>
 *  	<td>Taxpaying exchange rate (Return)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ（返品）</td>
 *  	<td>Transaction currency cd. (Return)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_tax_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>税指定ＦＬＧ（返品）</td>
 *  	<td>Tax specified flg. (Return)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税ＣＤ（返品）</td>
 *  	<td>Tax cd. (Return)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_trd_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨単価（返品）</td>
 *  	<td>Unit price (Transaction currency) (Return)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨金額（返品）</td>
 *  	<td>Amount (Transaction currency) (Return)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_trd_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨税額（返品）</td>
 *  	<td>Tax amount (Transaction currency) (Return)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_wtax_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>源泉税率（返品）</td>
 *  	<td>Withholding tax rate (Return)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_wtax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>源泉税額（返品）</td>
 *  	<td>Withholding tax (Return)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払進捗管理ＮＯ</td>
 *  	<td>GR/GI progress management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_dlv_slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品元納品書ＮＯ</td>
 *  	<td>Return-from delivery note No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_prov_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品元支給実績ＮＯ</td>
 *  	<td>Return-from supply result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給計上日（基）</td>
 *  	<td>Supply recording date (Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼連絡備考</td>
 *  	<td>Request contact remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引明細備考</td>
 *  	<td>Transaction details remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷連絡備考</td>
 *  	<td>Shipping notification remarks</td>
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
public class MST_XFR_SCHD_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_XFR_SCHD";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 移動・移送予定ＮＯ. Movement/transport schedule No..<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	private static final MCPermColumnInfo _xfr_schd_no = createColumnInfo("xfr_schd_no");
	public final MCStringPermColumn xfr_schd_no = createStringColumn(_xfr_schd_no);
	
	/**
	 * 移動・移送元区分. Source movement/transport type.<p>
	 *
	 */
	public static final String $xfr_src_typ = "xfr_src_typ";
	private static final MCPermColumnInfo _xfr_src_typ = createColumnInfo("xfr_src_typ");
	public final MCStringPermColumn xfr_src_typ = createStringColumn(_xfr_src_typ);
	
	/**
	 * 移動・移送元ＮＯ. Source movement/transport No..<p>
	 *
	 */
	public static final String $xfr_src_no = "xfr_src_no";
	private static final MCPermColumnInfo _xfr_src_no = createColumnInfo("xfr_src_no");
	public final MCStringPermColumn xfr_src_no = createStringColumn(_xfr_src_no);
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	private static final MCPermColumnInfo _trd_cd = createColumnInfo("trd_cd");
	public final MCStringPermColumn trd_cd = createStringColumn(_trd_cd);
	
	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	private static final MCPermColumnInfo _trd_ptn_typ = createColumnInfo("trd_ptn_typ");
	public final MCStringPermColumn trd_ptn_typ = createStringColumn(_trd_ptn_typ);
	
	/**
	 * 出庫ワーキンググループＣＤ. GI WG cd..<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	private static final MCPermColumnInfo _gi_wg_cd = createColumnInfo("gi_wg_cd");
	public final MCStringPermColumn gi_wg_cd = createStringColumn(_gi_wg_cd);
	
	/**
	 * 出庫物流グループＣＤ. GI distribution group cd..<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	private static final MCPermColumnInfo _gi_lg_grp_cd = createColumnInfo("gi_lg_grp_cd");
	public final MCStringPermColumn gi_lg_grp_cd = createStringColumn(_gi_lg_grp_cd);
	
	/**
	 * 出庫場所ＣＤ. GI location cd..<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	private static final MCPermColumnInfo _gi_loc_cd = createColumnInfo("gi_loc_cd");
	public final MCStringPermColumn gi_loc_cd = createStringColumn(_gi_loc_cd);
	
	/**
	 * 出庫棚・ラインＣＤ. GI rack/line cd..<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	private static final MCPermColumnInfo _gi_str_ln_cd = createColumnInfo("gi_str_ln_cd");
	public final MCStringPermColumn gi_str_ln_cd = createStringColumn(_gi_str_ln_cd);
	
	/**
	 * 出庫在庫着荷先ＣＤ. GI inventory arriving point cd..<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_cd = "gi_stk_arrv_bp_cd";
	private static final MCPermColumnInfo _gi_stk_arrv_bp_cd = createColumnInfo("gi_stk_arrv_bp_cd");
	public final MCStringPermColumn gi_stk_arrv_bp_cd = createStringColumn(_gi_stk_arrv_bp_cd);
	
	/**
	 * 入庫ワーキンググループＣＤ. GR WG cd..<p>
	 *
	 */
	public static final String $gr_wg_cd = "gr_wg_cd";
	private static final MCPermColumnInfo _gr_wg_cd = createColumnInfo("gr_wg_cd");
	public final MCStringPermColumn gr_wg_cd = createStringColumn(_gr_wg_cd);
	
	/**
	 * 入庫物流グループＣＤ. GR distribution group cd..<p>
	 *
	 */
	public static final String $gr_lg_grp_cd = "gr_lg_grp_cd";
	private static final MCPermColumnInfo _gr_lg_grp_cd = createColumnInfo("gr_lg_grp_cd");
	public final MCStringPermColumn gr_lg_grp_cd = createStringColumn(_gr_lg_grp_cd);
	
	/**
	 * 入庫場所ＣＤ. GR location cd..<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	private static final MCPermColumnInfo _gr_loc_cd = createColumnInfo("gr_loc_cd");
	public final MCStringPermColumn gr_loc_cd = createStringColumn(_gr_loc_cd);
	
	/**
	 * 入庫棚・ラインＣＤ. GR rack/line cd..<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	private static final MCPermColumnInfo _gr_str_ln_cd = createColumnInfo("gr_str_ln_cd");
	public final MCStringPermColumn gr_str_ln_cd = createStringColumn(_gr_str_ln_cd);
	
	/**
	 * 入庫在庫着荷先ＣＤ. GR inventory arriving point cd..<p>
	 *
	 */
	public static final String $gr_stk_arrv_bp_cd = "gr_stk_arrv_bp_cd";
	private static final MCPermColumnInfo _gr_stk_arrv_bp_cd = createColumnInfo("gr_stk_arrv_bp_cd");
	public final MCStringPermColumn gr_stk_arrv_bp_cd = createStringColumn(_gr_stk_arrv_bp_cd);
	
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
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
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
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	private static final MCPermColumnInfo _gd_cd = createColumnInfo("gd_cd");
	public final MCStringPermColumn gd_cd = createStringColumn(_gd_cd);
	
	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	private static final MCPermColumnInfo _quality_typ = createColumnInfo("quality_typ");
	public final MCStringPermColumn quality_typ = createStringColumn(_quality_typ);
	
	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	private static final MCPermColumnInfo _stk_id_typ = createColumnInfo("stk_id_typ");
	public final MCStringPermColumn stk_id_typ = createStringColumn(_stk_id_typ);
	
	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	private static final MCPermColumnInfo _stk_bp_cd = createColumnInfo("stk_bp_cd");
	public final MCStringPermColumn stk_bp_cd = createStringColumn(_stk_bp_cd);
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	private static final MCPermColumnInfo _trd_unit_cd = createColumnInfo("trd_unit_cd");
	public final MCStringPermColumn trd_unit_cd = createStringColumn(_trd_unit_cd);
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	private static final MCPermColumnInfo _trd_unit_qty = createColumnInfo("trd_unit_qty");
	public final MCNumberPermColumn trd_unit_qty = createNumberColumn(_trd_unit_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	private static final MCPermColumnInfo _base_unit_qty = createColumnInfo("base_unit_qty");
	public final MCNumberPermColumn base_unit_qty = createNumberColumn(_base_unit_qty);
	
	/**
	 * 出庫希望日時. Desired GI date and time.<p>
	 *
	 */
	public static final String $gi_rqst_tm = "gi_rqst_tm";
	private static final MCPermColumnInfo _gi_rqst_tm = createColumnInfo("gi_rqst_tm");
	public final MCDatePermColumn gi_rqst_tm = createDateColumn(_gi_rqst_tm);
	
	/**
	 * 入庫希望日時. Desired GR date and time.<p>
	 *
	 */
	public static final String $gr_rqst_tm = "gr_rqst_tm";
	private static final MCPermColumnInfo _gr_rqst_tm = createColumnInfo("gr_rqst_tm");
	public final MCDatePermColumn gr_rqst_tm = createDateColumn(_gr_rqst_tm);
	
	/**
	 * 受付日. Receiving date.<p>
	 *
	 */
	public static final String $rcpt_dt = "rcpt_dt";
	private static final MCPermColumnInfo _rcpt_dt = createColumnInfo("rcpt_dt");
	public final MCDatePermColumn rcpt_dt = createDateColumn(_rcpt_dt);
	
	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	private static final MCPermColumnInfo _rqst_usr_cd = createColumnInfo("rqst_usr_cd");
	public final MCStringPermColumn rqst_usr_cd = createStringColumn(_rqst_usr_cd);
	
	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	private static final MCPermColumnInfo _rqst_dpt_cd = createColumnInfo("rqst_dpt_cd");
	public final MCStringPermColumn rqst_dpt_cd = createStringColumn(_rqst_dpt_cd);
	
	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	private static final MCPermColumnInfo _ship_term_cd = createColumnInfo("ship_term_cd");
	public final MCStringPermColumn ship_term_cd = createStringColumn(_ship_term_cd);
	
	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	private static final MCPermColumnInfo _ship_inst_typ = createColumnInfo("ship_inst_typ");
	public final MCStringPermColumn ship_inst_typ = createStringColumn(_ship_inst_typ);
	
	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	private static final MCPermColumnInfo _rsn_cd = createColumnInfo("rsn_cd");
	public final MCStringPermColumn rsn_cd = createStringColumn(_rsn_cd);
	
	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	private static final MCPermColumnInfo _bd_dpt_cd = createColumnInfo("bd_dpt_cd");
	public final MCStringPermColumn bd_dpt_cd = createStringColumn(_bd_dpt_cd);
	
	/**
	 * 出荷留めＦＬＧ. Pending shipping flg..<p>
	 *
	 */
	public static final String $ship_block_flg = "ship_block_flg";
	private static final MCPermColumnInfo _ship_block_flg = createColumnInfo("ship_block_flg");
	public final MCBooleanPermColumn ship_block_flg = createBooleanColumn(_ship_block_flg);
	
	/**
	 * 送付先識別区分. Receiving point identification type.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	private static final MCPermColumnInfo _ship_to_id_typ = createColumnInfo("ship_to_id_typ");
	public final MCStringPermColumn ship_to_id_typ = createStringColumn(_ship_to_id_typ);
	
	/**
	 * 送付先識別ＣＤ. Receiving point identification cd..<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	private static final MCPermColumnInfo _ship_to_id_cd = createColumnInfo("ship_to_id_cd");
	public final MCStringPermColumn ship_to_id_cd = createStringColumn(_ship_to_id_cd);
	
	/**
	 * 送付先識別名. Receiving point Identification name.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	private static final MCPermColumnInfo _ship_to_id_nm = createColumnInfo("ship_to_id_nm");
	public final MCStringPermColumn ship_to_id_nm = createStringColumn(_ship_to_id_nm);
	
	/**
	 * 送付先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public static final String $ship_to_zip_cd = "ship_to_zip_cd";
	private static final MCPermColumnInfo _ship_to_zip_cd = createColumnInfo("ship_to_zip_cd");
	public final MCStringPermColumn ship_to_zip_cd = createStringColumn(_ship_to_zip_cd);
	
	/**
	 * 送付先住所１. Receiving point address 1.<p>
	 *
	 */
	public static final String $ship_to_addr1 = "ship_to_addr1";
	private static final MCPermColumnInfo _ship_to_addr1 = createColumnInfo("ship_to_addr1");
	public final MCStringPermColumn ship_to_addr1 = createStringColumn(_ship_to_addr1);
	
	/**
	 * 送付先住所２. Receiving point address 2.<p>
	 *
	 */
	public static final String $ship_to_addr2 = "ship_to_addr2";
	private static final MCPermColumnInfo _ship_to_addr2 = createColumnInfo("ship_to_addr2");
	public final MCStringPermColumn ship_to_addr2 = createStringColumn(_ship_to_addr2);
	
	/**
	 * 送付先住所３. Receiving point address 3.<p>
	 *
	 */
	public static final String $ship_to_addr3 = "ship_to_addr3";
	private static final MCPermColumnInfo _ship_to_addr3 = createColumnInfo("ship_to_addr3");
	public final MCStringPermColumn ship_to_addr3 = createStringColumn(_ship_to_addr3);
	
	/**
	 * 送付先住所４. Receiving point address 4.<p>
	 *
	 */
	public static final String $ship_to_addr4 = "ship_to_addr4";
	private static final MCPermColumnInfo _ship_to_addr4 = createColumnInfo("ship_to_addr4");
	public final MCStringPermColumn ship_to_addr4 = createStringColumn(_ship_to_addr4);
	
	/**
	 * 送付先部署. Receiving point dept..<p>
	 *
	 */
	public static final String $ship_to_cntct_dpt = "ship_to_cntct_dpt";
	private static final MCPermColumnInfo _ship_to_cntct_dpt = createColumnInfo("ship_to_cntct_dpt");
	public final MCStringPermColumn ship_to_cntct_dpt = createStringColumn(_ship_to_cntct_dpt);
	
	/**
	 * 送付先担当者. Receiving point PIC.<p>
	 *
	 */
	public static final String $ship_to_cntct_psn = "ship_to_cntct_psn";
	private static final MCPermColumnInfo _ship_to_cntct_psn = createColumnInfo("ship_to_cntct_psn");
	public final MCStringPermColumn ship_to_cntct_psn = createStringColumn(_ship_to_cntct_psn);
	
	/**
	 * 送付先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public static final String $ship_to_tel = "ship_to_tel";
	private static final MCPermColumnInfo _ship_to_tel = createColumnInfo("ship_to_tel");
	public final MCStringPermColumn ship_to_tel = createStringColumn(_ship_to_tel);
	
	/**
	 * 送付先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public static final String $ship_to_fax = "ship_to_fax";
	private static final MCPermColumnInfo _ship_to_fax = createColumnInfo("ship_to_fax");
	public final MCStringPermColumn ship_to_fax = createStringColumn(_ship_to_fax);
	
	/**
	 * 送付先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public static final String $ship_to_sundry_flg = "ship_to_sundry_flg";
	private static final MCPermColumnInfo _ship_to_sundry_flg = createColumnInfo("ship_to_sundry_flg");
	public final MCBooleanPermColumn ship_to_sundry_flg = createBooleanColumn(_ship_to_sundry_flg);
	
	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	private static final MCPermColumnInfo _via_dlv_typ = createColumnInfo("via_dlv_typ");
	public final MCStringPermColumn via_dlv_typ = createStringColumn(_via_dlv_typ);
	
	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	private static final MCPermColumnInfo _itm_ord_no = createColumnInfo("itm_ord_no");
	public final MCStringPermColumn itm_ord_no = createStringColumn(_itm_ord_no);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	private static final MCPermColumnInfo _oper_inst_no = createColumnInfo("oper_inst_no");
	public final MCStringPermColumn oper_inst_no = createStringColumn(_oper_inst_no);
	
	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	private static final MCPermColumnInfo _inpt_schd_no = createColumnInfo("inpt_schd_no");
	public final MCStringPermColumn inpt_schd_no = createStringColumn(_inpt_schd_no);
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	private static final MCPermColumnInfo _slo_no = createColumnInfo("slo_no");
	public final MCStringPermColumn slo_no = createStringColumn(_slo_no);
	
	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	private static final MCPermColumnInfo _slo_d_no = createColumnInfo("slo_d_no");
	public final MCStringPermColumn slo_d_no = createStringColumn(_slo_d_no);
	
	/**
	 * 投入有効成分. Input active ingredient.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	private static final MCPermColumnInfo _cont_qty = createColumnInfo("cont_qty");
	public final MCNumberPermColumn cont_qty = createNumberColumn(_cont_qty);
	
	/**
	 * 依頼元訂正ＦＬＧ. Edited by request source flg..<p>
	 *
	 */
	public static final String $rqst_mod_flg = "rqst_mod_flg";
	private static final MCPermColumnInfo _rqst_mod_flg = createColumnInfo("rqst_mod_flg");
	public final MCBooleanPermColumn rqst_mod_flg = createBooleanColumn(_rqst_mod_flg);
	
	/**
	 * 紐切れＦＬＧ. Unpegged flg..<p>
	 *
	 */
	public static final String $rqst_can_flg = "rqst_can_flg";
	private static final MCPermColumnInfo _rqst_can_flg = createColumnInfo("rqst_can_flg");
	public final MCBooleanPermColumn rqst_can_flg = createBooleanColumn(_rqst_can_flg);
	
	/**
	 * ロット混在不可ＦＬＧ. Prohibit mixed lots flg..<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	private static final MCPermColumnInfo _not_lot_mix_flg = createColumnInfo("not_lot_mix_flg");
	public final MCBooleanPermColumn not_lot_mix_flg = createBooleanColumn(_not_lot_mix_flg);
	
	/**
	 * サブロット混在不可ＦＬＧ. Prohibit mixed sublots flg..<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
	private static final MCPermColumnInfo _not_sublot_mix_flg = createColumnInfo("not_sublot_mix_flg");
	public final MCBooleanPermColumn not_sublot_mix_flg = createBooleanColumn(_not_sublot_mix_flg);
	
	/**
	 * 有効期限ＦＲＯＭ. Expiration date FROM.<p>
	 *
	 */
	public static final String $vld_dt_fr = "vld_dt_fr";
	private static final MCPermColumnInfo _vld_dt_fr = createColumnInfo("vld_dt_fr");
	public final MCDatePermColumn vld_dt_fr = createDateColumn(_vld_dt_fr);
	
	/**
	 * 有効期限ＴＯ. Expiration date TO.<p>
	 *
	 */
	public static final String $vld_dt_to = "vld_dt_to";
	private static final MCPermColumnInfo _vld_dt_to = createColumnInfo("vld_dt_to");
	public final MCDatePermColumn vld_dt_to = createDateColumn(_vld_dt_to);
	
	/**
	 * 支給区分. Supply type.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	private static final MCPermColumnInfo _prov_typ = createColumnInfo("prov_typ");
	public final MCStringPermColumn prov_typ = createStringColumn(_prov_typ);
	
	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	private static final MCPermColumnInfo _prov_basis_typ = createColumnInfo("prov_basis_typ");
	public final MCStringPermColumn prov_basis_typ = createStringColumn(_prov_basis_typ);
	
	/**
	 * 為替レート指定ＦＬＧ. Set exchange rate flg..<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	private static final MCPermColumnInfo _xrate_inpt_flg = createColumnInfo("xrate_inpt_flg");
	public final MCBooleanPermColumn xrate_inpt_flg = createBooleanColumn(_xrate_inpt_flg);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 納税為替レート指定ＦＬＧ. Taxpaying exchange rate specification flg..<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	private static final MCPermColumnInfo _ptax_xrate_inpt_flg = createColumnInfo("ptax_xrate_inpt_flg");
	public final MCBooleanPermColumn ptax_xrate_inpt_flg = createBooleanColumn(_ptax_xrate_inpt_flg);
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	private static final MCPermColumnInfo _ptax_xrate = createColumnInfo("ptax_xrate");
	public final MCNumberPermColumn ptax_xrate = createNumberColumn(_ptax_xrate);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 税指定ＦＬＧ. Tax specified flg..<p>
	 *
	 */
	public static final String $tax_fix_flg = "tax_fix_flg";
	private static final MCPermColumnInfo _tax_fix_flg = createColumnInfo("tax_fix_flg");
	public final MCBooleanPermColumn tax_fix_flg = createBooleanColumn(_tax_fix_flg);
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	private static final MCPermColumnInfo _tax_cd = createColumnInfo("tax_cd");
	public final MCStringPermColumn tax_cd = createStringColumn(_tax_cd);
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	private static final MCPermColumnInfo _trd_cur_upri = createColumnInfo("trd_cur_upri");
	public final MCNumberPermColumn trd_cur_upri = createNumberColumn(_trd_cur_upri);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	private static final MCPermColumnInfo _trd_cur_tax_amt = createColumnInfo("trd_cur_tax_amt");
	public final MCNumberPermColumn trd_cur_tax_amt = createNumberColumn(_trd_cur_tax_amt);
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	private static final MCPermColumnInfo _wtax_rate = createColumnInfo("wtax_rate");
	public final MCNumberPermColumn wtax_rate = createNumberColumn(_wtax_rate);
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	private static final MCPermColumnInfo _wtax_amt = createColumnInfo("wtax_amt");
	public final MCNumberPermColumn wtax_amt = createNumberColumn(_wtax_amt);
	
	/**
	 * 支給区分（返品）. Supply type (Return).<p>
	 *
	 */
	public static final String $ret_prov_typ = "ret_prov_typ";
	private static final MCPermColumnInfo _ret_prov_typ = createColumnInfo("ret_prov_typ");
	public final MCStringPermColumn ret_prov_typ = createStringColumn(_ret_prov_typ);
	
	/**
	 * 支給計上区分（返品）. Supply recording type (Return).<p>
	 *
	 */
	public static final String $ret_prov_basis_typ = "ret_prov_basis_typ";
	private static final MCPermColumnInfo _ret_prov_basis_typ = createColumnInfo("ret_prov_basis_typ");
	public final MCStringPermColumn ret_prov_basis_typ = createStringColumn(_ret_prov_basis_typ);
	
	/**
	 * 為替レート指定ＦＬＧ（返品）. Set exchange rate flg. (Return).<p>
	 *
	 */
	public static final String $ret_xrate_inpt_flg = "ret_xrate_inpt_flg";
	private static final MCPermColumnInfo _ret_xrate_inpt_flg = createColumnInfo("ret_xrate_inpt_flg");
	public final MCBooleanPermColumn ret_xrate_inpt_flg = createBooleanColumn(_ret_xrate_inpt_flg);
	
	/**
	 * 為替レート（返品）. Exchange rate (Return).<p>
	 *
	 */
	public static final String $ret_xrate = "ret_xrate";
	private static final MCPermColumnInfo _ret_xrate = createColumnInfo("ret_xrate");
	public final MCNumberPermColumn ret_xrate = createNumberColumn(_ret_xrate);
	
	/**
	 * 納税為替レート指定ＦＬＧ（返品）. Taxpaying exchange rate specification flg. (Return).<p>
	 *
	 */
	public static final String $ret_ptax_xrate_inpt_flg = "ret_ptax_xrate_inpt_flg";
	private static final MCPermColumnInfo _ret_ptax_xrate_inpt_flg = createColumnInfo("ret_ptax_xrate_inpt_flg");
	public final MCBooleanPermColumn ret_ptax_xrate_inpt_flg = createBooleanColumn(_ret_ptax_xrate_inpt_flg);
	
	/**
	 * 納税為替レート（返品）. Taxpaying exchange rate (Return).<p>
	 *
	 */
	public static final String $ret_ptax_xrate = "ret_ptax_xrate";
	private static final MCPermColumnInfo _ret_ptax_xrate = createColumnInfo("ret_ptax_xrate");
	public final MCNumberPermColumn ret_ptax_xrate = createNumberColumn(_ret_ptax_xrate);
	
	/**
	 * 取引通貨ＣＤ（返品）. Transaction currency cd. (Return).<p>
	 *
	 */
	public static final String $ret_trd_cur_cd = "ret_trd_cur_cd";
	private static final MCPermColumnInfo _ret_trd_cur_cd = createColumnInfo("ret_trd_cur_cd");
	public final MCStringPermColumn ret_trd_cur_cd = createStringColumn(_ret_trd_cur_cd);
	
	/**
	 * 税指定ＦＬＧ（返品）. Tax specified flg. (Return).<p>
	 *
	 */
	public static final String $ret_tax_fix_flg = "ret_tax_fix_flg";
	private static final MCPermColumnInfo _ret_tax_fix_flg = createColumnInfo("ret_tax_fix_flg");
	public final MCBooleanPermColumn ret_tax_fix_flg = createBooleanColumn(_ret_tax_fix_flg);
	
	/**
	 * 税ＣＤ（返品）. Tax cd. (Return).<p>
	 *
	 */
	public static final String $ret_tax_cd = "ret_tax_cd";
	private static final MCPermColumnInfo _ret_tax_cd = createColumnInfo("ret_tax_cd");
	public final MCStringPermColumn ret_tax_cd = createStringColumn(_ret_tax_cd);
	
	/**
	 * 取引通貨単価（返品）. Unit price (Transaction currency) (Return).<p>
	 *
	 */
	public static final String $ret_trd_cur_upri = "ret_trd_cur_upri";
	private static final MCPermColumnInfo _ret_trd_cur_upri = createColumnInfo("ret_trd_cur_upri");
	public final MCNumberPermColumn ret_trd_cur_upri = createNumberColumn(_ret_trd_cur_upri);
	
	/**
	 * 取引通貨金額（返品）. Amount (Transaction currency) (Return).<p>
	 *
	 */
	public static final String $ret_trd_cur_amt = "ret_trd_cur_amt";
	private static final MCPermColumnInfo _ret_trd_cur_amt = createColumnInfo("ret_trd_cur_amt");
	public final MCNumberPermColumn ret_trd_cur_amt = createNumberColumn(_ret_trd_cur_amt);
	
	/**
	 * 取引通貨税額（返品）. Tax amount (Transaction currency) (Return).<p>
	 *
	 */
	public static final String $ret_trd_cur_tax_amt = "ret_trd_cur_tax_amt";
	private static final MCPermColumnInfo _ret_trd_cur_tax_amt = createColumnInfo("ret_trd_cur_tax_amt");
	public final MCNumberPermColumn ret_trd_cur_tax_amt = createNumberColumn(_ret_trd_cur_tax_amt);
	
	/**
	 * 源泉税率（返品）. Withholding tax rate (Return).<p>
	 *
	 */
	public static final String $ret_wtax_rate = "ret_wtax_rate";
	private static final MCPermColumnInfo _ret_wtax_rate = createColumnInfo("ret_wtax_rate");
	public final MCNumberPermColumn ret_wtax_rate = createNumberColumn(_ret_wtax_rate);
	
	/**
	 * 源泉税額（返品）. Withholding tax (Return).<p>
	 *
	 */
	public static final String $ret_wtax_amt = "ret_wtax_amt";
	private static final MCPermColumnInfo _ret_wtax_amt = createColumnInfo("ret_wtax_amt");
	public final MCNumberPermColumn ret_wtax_amt = createNumberColumn(_ret_wtax_amt);
	
	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	private static final MCPermColumnInfo _io_schd_pr_no = createColumnInfo("io_schd_pr_no");
	public final MCStringPermColumn io_schd_pr_no = createStringColumn(_io_schd_pr_no);
	
	/**
	 * 返品元納品書ＮＯ. Return-from delivery note No..<p>
	 *
	 */
	public static final String $base_dlv_slip_no = "base_dlv_slip_no";
	private static final MCPermColumnInfo _base_dlv_slip_no = createColumnInfo("base_dlv_slip_no");
	public final MCStringPermColumn base_dlv_slip_no = createStringColumn(_base_dlv_slip_no);
	
	/**
	 * 返品元支給実績ＮＯ. Return-from supply result No..<p>
	 *
	 */
	public static final String $base_prov_act_no = "base_prov_act_no";
	private static final MCPermColumnInfo _base_prov_act_no = createColumnInfo("base_prov_act_no");
	public final MCStringPermColumn base_prov_act_no = createStringColumn(_base_prov_act_no);
	
	/**
	 * 支給計上日（基）. Supply recording date (Base).<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";
	private static final MCPermColumnInfo _base_ac_dt = createColumnInfo("base_ac_dt");
	public final MCDatePermColumn base_ac_dt = createDateColumn(_base_ac_dt);
	
	/**
	 * 依頼連絡備考. Request contact remarks.<p>
	 *
	 */
	public static final String $rqst_cnt_rmrks = "rqst_cnt_rmrks";
	private static final MCPermColumnInfo _rqst_cnt_rmrks = createColumnInfo("rqst_cnt_rmrks");
	public final MCStringPermColumn rqst_cnt_rmrks = createStringColumn(_rqst_cnt_rmrks);
	
	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	private static final MCPermColumnInfo _trd_d_rmrks = createColumnInfo("trd_d_rmrks");
	public final MCStringPermColumn trd_d_rmrks = createStringColumn(_trd_d_rmrks);
	
	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	private static final MCPermColumnInfo _ship_cnt_rmrks = createColumnInfo("ship_cnt_rmrks");
	public final MCStringPermColumn ship_cnt_rmrks = createStringColumn(_ship_cnt_rmrks);
	
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
	
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta xfr_src_typ_META = createCommonMeta($xfr_src_typ, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP);
	public static final MCMeta xfr_src_no_META = createCommonMeta($xfr_src_no, mcframe.commonMA.meta.MA_META.XFR_SRC_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_lg_grp_cd_META = createCommonMeta($gr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_stk_arrv_bp_cd_META = createCommonMeta($gr_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_rqst_tm_META = createCommonMeta($gi_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta gr_rqst_tm_META = createCommonMeta($gr_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ship_block_flg_META = createCommonMeta($ship_block_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_zip_cd_META = createCommonMeta($ship_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta ship_to_addr1_META = createCommonMeta($ship_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr2_META = createCommonMeta($ship_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr3_META = createCommonMeta($ship_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr4_META = createCommonMeta($ship_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_cntct_dpt_META = createCommonMeta($ship_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta ship_to_cntct_psn_META = createCommonMeta($ship_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta ship_to_tel_META = createCommonMeta($ship_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_fax_META = createCommonMeta($ship_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_sundry_flg_META = createCommonMeta($ship_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta rqst_mod_flg_META = createCommonMeta($rqst_mod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_can_flg_META = createCommonMeta($rqst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_to_META = createCommonMeta($vld_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_prov_typ_META = createCommonMeta($ret_prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta ret_prov_basis_typ_META = createCommonMeta($ret_prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta ret_xrate_inpt_flg_META = createCommonMeta($ret_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_xrate_META = createCommonMeta($ret_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_ptax_xrate_inpt_flg_META = createCommonMeta($ret_ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_ptax_xrate_META = createCommonMeta($ret_ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_trd_cur_cd_META = createCommonMeta($ret_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ret_tax_fix_flg_META = createCommonMeta($ret_tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_tax_cd_META = createCommonMeta($ret_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta ret_trd_cur_upri_META = createCommonMeta($ret_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_trd_cur_amt_META = createCommonMeta($ret_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_trd_cur_tax_amt_META = createCommonMeta($ret_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_wtax_rate_META = createCommonMeta($ret_wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta ret_wtax_amt_META = createCommonMeta($ret_wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta base_dlv_slip_no_META = createCommonMeta($base_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta base_prov_act_no_META = createCommonMeta($base_prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_cnt_rmrks_META = createCommonMeta($rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.RQST_CNT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.XFR_SCHD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.XFR_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.XFR_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.XFR_SCHD_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_XFR_SCHD_R> constMetas = new ConstMetaList<MST_XFR_SCHD_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			xfr_schd_no_META,
			xfr_src_typ_META,
			xfr_src_no_META,
			trd_cd_META,
			trd_ptn_typ_META,
			gi_wg_cd_META,
			gi_lg_grp_cd_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_stk_arrv_bp_cd_META,
			gr_wg_cd_META,
			gr_lg_grp_cd_META,
			gr_loc_cd_META,
			gr_str_ln_cd_META,
			gr_stk_arrv_bp_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			sublot_no_META,
			ver_no_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			gd_cd_META,
			quality_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			gi_rqst_tm_META,
			gr_rqst_tm_META,
			rcpt_dt_META,
			rqst_usr_cd_META,
			rqst_dpt_cd_META,
			ship_term_cd_META,
			ship_inst_typ_META,
			rsn_cd_META,
			bd_dpt_cd_META,
			ship_block_flg_META,
			ship_to_id_typ_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			ship_to_zip_cd_META,
			ship_to_addr1_META,
			ship_to_addr2_META,
			ship_to_addr3_META,
			ship_to_addr4_META,
			ship_to_cntct_dpt_META,
			ship_to_cntct_psn_META,
			ship_to_tel_META,
			ship_to_fax_META,
			ship_to_sundry_flg_META,
			via_dlv_typ_META,
			itm_ord_no_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			inpt_schd_no_META,
			slo_no_META,
			slo_d_no_META,
			cont_qty_META,
			rqst_mod_flg_META,
			rqst_can_flg_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			vld_dt_fr_META,
			vld_dt_to_META,
			prov_typ_META,
			prov_basis_typ_META,
			xrate_inpt_flg_META,
			xrate_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_META,
			trd_cur_cd_META,
			tax_fix_flg_META,
			tax_cd_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			ret_prov_typ_META,
			ret_prov_basis_typ_META,
			ret_xrate_inpt_flg_META,
			ret_xrate_META,
			ret_ptax_xrate_inpt_flg_META,
			ret_ptax_xrate_META,
			ret_trd_cur_cd_META,
			ret_tax_fix_flg_META,
			ret_tax_cd_META,
			ret_trd_cur_upri_META,
			ret_trd_cur_amt_META,
			ret_trd_cur_tax_amt_META,
			ret_wtax_rate_META,
			ret_wtax_amt_META,
			io_schd_pr_no_META,
			base_dlv_slip_no_META,
			base_prov_act_no_META,
			base_ac_dt_META,
			rqst_cnt_rmrks_META,
			trd_d_rmrks_META,
			ship_cnt_rmrks_META,
			intr_rmrks_META,
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
	protected MST_XFR_SCHD_R(ConstMetaList<? extends MST_XFR_SCHD_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_XFR_SCHD_R(ConstMetaList<? extends MST_XFR_SCHD_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$xfr_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$xfr_schd_no,
				"xfr_schd_no",
				xfr_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$xfr_src_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$xfr_src_typ,
				"xfr_src_typ",
				xfr_src_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$xfr_src_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$xfr_src_no,
				"xfr_src_no",
				xfr_src_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$trd_cd,
				"trd_cd",
				trd_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$trd_ptn_typ,
				"trd_ptn_typ",
				trd_ptn_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$gi_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gi_wg_cd,
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
			MST_XFR_SCHD_R.$gi_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gi_lg_grp_cd,
				"gi_lg_grp_cd",
				gi_lg_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$gi_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gi_loc_cd,
				"gi_loc_cd",
				gi_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$gi_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gi_str_ln_cd,
				"gi_str_ln_cd",
				gi_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$gi_stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gi_stk_arrv_bp_cd,
				"gi_stk_arrv_bp_cd",
				gi_stk_arrv_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$gr_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gr_wg_cd,
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
			MST_XFR_SCHD_R.$gr_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gr_lg_grp_cd,
				"gr_lg_grp_cd",
				gr_lg_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$gr_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gr_loc_cd,
				"gr_loc_cd",
				gr_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$gr_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gr_str_ln_cd,
				"gr_str_ln_cd",
				gr_str_ln_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$gr_stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gr_stk_arrv_bp_cd,
				"gr_stk_arrv_bp_cd",
				gr_stk_arrv_bp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$itm_cd,
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
			MST_XFR_SCHD_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$itm_sub1,
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
			MST_XFR_SCHD_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$itm_sub2,
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
			MST_XFR_SCHD_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$itm_sub3,
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
			MST_XFR_SCHD_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$lot_no,
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
			MST_XFR_SCHD_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$sublot_no,
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
			MST_XFR_SCHD_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ver_no,
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
			MST_XFR_SCHD_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$sno1,
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
			MST_XFR_SCHD_R.$sno1_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$sno1_null_flg,
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
			MST_XFR_SCHD_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$sno2,
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
			MST_XFR_SCHD_R.$sno2_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$sno2_null_flg,
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
			MST_XFR_SCHD_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$sno3,
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
			MST_XFR_SCHD_R.$sno3_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$sno3_null_flg,
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
			MST_XFR_SCHD_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$sno4,
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
			MST_XFR_SCHD_R.$sno4_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$sno4_null_flg,
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
			MST_XFR_SCHD_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$gd_cd,
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
			MST_XFR_SCHD_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$quality_typ,
				"quality_typ",
				quality_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$stk_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$stk_id_typ,
				"stk_id_typ",
				stk_id_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$stk_bp_cd,
				"stk_bp_cd",
				stk_bp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$trd_unit_cd,
				"trd_unit_cd",
				trd_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$trd_unit_qty,
				"trd_unit_qty",
				trd_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$base_unit_cd,
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
			MST_XFR_SCHD_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$base_unit_qty,
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
			MST_XFR_SCHD_R.$gi_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_XFR_SCHD_R.$gi_rqst_tm,
				"gi_rqst_tm",
				gi_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$gr_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_XFR_SCHD_R.$gr_rqst_tm,
				"gr_rqst_tm",
				gr_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$rcpt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_XFR_SCHD_R.$rcpt_dt,
				"rcpt_dt",
				rcpt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$rqst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$rqst_usr_cd,
				"rqst_usr_cd",
				rqst_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$rqst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$rqst_dpt_cd,
				"rqst_dpt_cd",
				rqst_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_term_cd,
				"ship_term_cd",
				ship_term_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_inst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_inst_typ,
				"ship_inst_typ",
				ship_inst_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$rsn_cd,
				"rsn_cd",
				rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$bd_dpt_cd,
				"bd_dpt_cd",
				bd_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_block_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$ship_block_flg,
				"ship_block_flg",
				ship_block_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_id_typ,
				"ship_to_id_typ",
				ship_to_id_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_id_cd,
				"ship_to_id_cd",
				ship_to_id_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_id_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_id_nm,
				"ship_to_id_nm",
				ship_to_id_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_zip_cd,
				"ship_to_zip_cd",
				ship_to_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_addr1,
				"ship_to_addr1",
				ship_to_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_addr2,
				"ship_to_addr2",
				ship_to_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_addr3,
				"ship_to_addr3",
				ship_to_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_addr4,
				"ship_to_addr4",
				ship_to_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_cntct_dpt,
				"ship_to_cntct_dpt",
				ship_to_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_cntct_psn,
				"ship_to_cntct_psn",
				ship_to_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_tel,
				"ship_to_tel",
				ship_to_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_to_fax,
				"ship_to_fax",
				ship_to_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_to_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$ship_to_sundry_flg,
				"ship_to_sundry_flg",
				ship_to_sundry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$via_dlv_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$via_dlv_typ,
				"via_dlv_typ",
				via_dlv_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$itm_ord_no,
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
			MST_XFR_SCHD_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$oper_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$oper_inst_no,
				"oper_inst_no",
				oper_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$inpt_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$inpt_schd_no,
				"inpt_schd_no",
				inpt_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$slo_no,
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
			MST_XFR_SCHD_R.$slo_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$slo_d_no,
				"slo_d_no",
				slo_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$cont_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$cont_qty,
				"cont_qty",
				cont_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$rqst_mod_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$rqst_mod_flg,
				"rqst_mod_flg",
				rqst_mod_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$rqst_can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$rqst_can_flg,
				"rqst_can_flg",
				rqst_can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$not_lot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$not_lot_mix_flg,
				"not_lot_mix_flg",
				not_lot_mix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$not_sublot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$not_sublot_mix_flg,
				"not_sublot_mix_flg",
				not_sublot_mix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$vld_dt_fr,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_XFR_SCHD_R.$vld_dt_fr,
				"vld_dt_fr",
				vld_dt_fr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$vld_dt_to,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_XFR_SCHD_R.$vld_dt_to,
				"vld_dt_to",
				vld_dt_to,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$prov_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$prov_typ,
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
			MST_XFR_SCHD_R.$prov_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$prov_basis_typ,
				"prov_basis_typ",
				prov_basis_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$xrate_inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$xrate_inpt_flg,
				"xrate_inpt_flg",
				xrate_inpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$xrate,
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
			MST_XFR_SCHD_R.$ptax_xrate_inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$ptax_xrate_inpt_flg,
				"ptax_xrate_inpt_flg",
				ptax_xrate_inpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ptax_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$ptax_xrate,
				"ptax_xrate",
				ptax_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$trd_cur_cd,
				"trd_cur_cd",
				trd_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$tax_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$tax_fix_flg,
				"tax_fix_flg",
				tax_fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$tax_cd,
				"tax_cd",
				tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$trd_cur_upri,
				"trd_cur_upri",
				trd_cur_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$trd_cur_amt,
				"trd_cur_amt",
				trd_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$trd_cur_tax_amt,
				"trd_cur_tax_amt",
				trd_cur_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$wtax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$wtax_rate,
				"wtax_rate",
				wtax_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$wtax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$wtax_amt,
				"wtax_amt",
				wtax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_prov_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ret_prov_typ,
				"ret_prov_typ",
				ret_prov_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_prov_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ret_prov_basis_typ,
				"ret_prov_basis_typ",
				ret_prov_basis_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_xrate_inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$ret_xrate_inpt_flg,
				"ret_xrate_inpt_flg",
				ret_xrate_inpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$ret_xrate,
				"ret_xrate",
				ret_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_ptax_xrate_inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$ret_ptax_xrate_inpt_flg,
				"ret_ptax_xrate_inpt_flg",
				ret_ptax_xrate_inpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_ptax_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$ret_ptax_xrate,
				"ret_ptax_xrate",
				ret_ptax_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ret_trd_cur_cd,
				"ret_trd_cur_cd",
				ret_trd_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_tax_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_XFR_SCHD_R.$ret_tax_fix_flg,
				"ret_tax_fix_flg",
				ret_tax_fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ret_tax_cd,
				"ret_tax_cd",
				ret_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$ret_trd_cur_upri,
				"ret_trd_cur_upri",
				ret_trd_cur_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$ret_trd_cur_amt,
				"ret_trd_cur_amt",
				ret_trd_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$ret_trd_cur_tax_amt,
				"ret_trd_cur_tax_amt",
				ret_trd_cur_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_wtax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$ret_wtax_rate,
				"ret_wtax_rate",
				ret_wtax_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ret_wtax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$ret_wtax_amt,
				"ret_wtax_amt",
				ret_wtax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$io_schd_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$io_schd_pr_no,
				"io_schd_pr_no",
				io_schd_pr_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$base_dlv_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$base_dlv_slip_no,
				"base_dlv_slip_no",
				base_dlv_slip_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$base_prov_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$base_prov_act_no,
				"base_prov_act_no",
				base_prov_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$base_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_XFR_SCHD_R.$base_ac_dt,
				"base_ac_dt",
				base_ac_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$rqst_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$rqst_cnt_rmrks,
				"rqst_cnt_rmrks",
				rqst_cnt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$trd_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$trd_d_rmrks,
				"trd_d_rmrks",
				trd_d_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$ship_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ship_cnt_rmrks,
				"ship_cnt_rmrks",
				ship_cnt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_XFR_SCHD_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$intr_rmrks,
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
			MST_XFR_SCHD_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$sub_char1,
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
			MST_XFR_SCHD_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$sub_char2,
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
			MST_XFR_SCHD_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$sub_char3,
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
			MST_XFR_SCHD_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ins_usr_id,
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
			MST_XFR_SCHD_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ins_usr_nm,
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
			MST_XFR_SCHD_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_XFR_SCHD_R.$ins_ts,
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
			MST_XFR_SCHD_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$ins_func_id,
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
			MST_XFR_SCHD_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_XFR_SCHD_R.$upd_cntr,
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
			MST_XFR_SCHD_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$upd_usr_id,
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
			MST_XFR_SCHD_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$upd_usr_nm,
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
			MST_XFR_SCHD_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_XFR_SCHD_R.$upd_ts,
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
			MST_XFR_SCHD_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$upd_func_id,
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
			MST_XFR_SCHD_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_XFR_SCHD_R.$upd_srv_req_no,
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
	public static MST_XFR_SCHD_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_XFR_SCHD_R create(String alias) {
		MST_XFR_SCHD_R row = new MST_XFR_SCHD_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_XFR_SCHD_R createByName(T proto) {
		MST_XFR_SCHD_R row = MST_XFR_SCHD_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_XFR_SCHD_R clone() {
		return (MST_XFR_SCHD_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_XFR_SCHD_R createInstance() {
		return (MST_XFR_SCHD_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_XFR_SCHD_R getValues(String... names) {
		return (MST_XFR_SCHD_R) super.getValues(names);
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
	 public MSW_XFR_SCHD_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_XFR_SCHD_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_XFR_SCHD_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_XFR_SCHD_KEY_R.TABLE_NAME);
	 }

	/**
	 * 移動・移送予定ＮＯ. Movement/transport schedule No..<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 0, $xfr_schd_no);
	}

	/**
	 * 移動・移送予定ＮＯ. Movement/transport schedule No..<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 0, $xfr_schd_no, value);
	}

	/**
	 * 移動・移送元区分. Source movement/transport type.<p>
	 *
	 */
	public String xfr_src_typ() {
		return getConstString(offset + 1, $xfr_src_typ);
	}

	/**
	 * 移動・移送元区分. Source movement/transport type.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		setConstString(offset + 1, $xfr_src_typ, value);
	}

	/**
	 * 移動・移送元ＮＯ. Source movement/transport No..<p>
	 *
	 */
	public String xfr_src_no() {
		return getConstString(offset + 2, $xfr_src_no);
	}

	/**
	 * 移動・移送元ＮＯ. Source movement/transport No..<p>
	 *
	 */
	public void xfr_src_no(String value) {
		setConstString(offset + 2, $xfr_src_no, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 3, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 3, $trd_cd, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 4, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 4, $trd_ptn_typ, value);
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
	 * 出庫物流グループＣＤ. GI distribution group cd..<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 6, $gi_lg_grp_cd);
	}

	/**
	 * 出庫物流グループＣＤ. GI distribution group cd..<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 6, $gi_lg_grp_cd, value);
	}

	/**
	 * 出庫場所ＣＤ. GI location cd..<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 7, $gi_loc_cd);
	}

	/**
	 * 出庫場所ＣＤ. GI location cd..<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 7, $gi_loc_cd, value);
	}

	/**
	 * 出庫棚・ラインＣＤ. GI rack/line cd..<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 8, $gi_str_ln_cd);
	}

	/**
	 * 出庫棚・ラインＣＤ. GI rack/line cd..<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 8, $gi_str_ln_cd, value);
	}

	/**
	 * 出庫在庫着荷先ＣＤ. GI inventory arriving point cd..<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 9, $gi_stk_arrv_bp_cd);
	}

	/**
	 * 出庫在庫着荷先ＣＤ. GI inventory arriving point cd..<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 9, $gi_stk_arrv_bp_cd, value);
	}

	/**
	 * 入庫ワーキンググループＣＤ. GR WG cd..<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 10, $gr_wg_cd);
	}

	/**
	 * 入庫ワーキンググループＣＤ. GR WG cd..<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 10, $gr_wg_cd, value);
	}

	/**
	 * 入庫物流グループＣＤ. GR distribution group cd..<p>
	 *
	 */
	public String gr_lg_grp_cd() {
		return getConstString(offset + 11, $gr_lg_grp_cd);
	}

	/**
	 * 入庫物流グループＣＤ. GR distribution group cd..<p>
	 *
	 */
	public void gr_lg_grp_cd(String value) {
		setConstString(offset + 11, $gr_lg_grp_cd, value);
	}

	/**
	 * 入庫場所ＣＤ. GR location cd..<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 12, $gr_loc_cd);
	}

	/**
	 * 入庫場所ＣＤ. GR location cd..<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 12, $gr_loc_cd, value);
	}

	/**
	 * 入庫棚・ラインＣＤ. GR rack/line cd..<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 13, $gr_str_ln_cd);
	}

	/**
	 * 入庫棚・ラインＣＤ. GR rack/line cd..<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 13, $gr_str_ln_cd, value);
	}

	/**
	 * 入庫在庫着荷先ＣＤ. GR inventory arriving point cd..<p>
	 *
	 */
	public String gr_stk_arrv_bp_cd() {
		return getConstString(offset + 14, $gr_stk_arrv_bp_cd);
	}

	/**
	 * 入庫在庫着荷先ＣＤ. GR inventory arriving point cd..<p>
	 *
	 */
	public void gr_stk_arrv_bp_cd(String value) {
		setConstString(offset + 14, $gr_stk_arrv_bp_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 15, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 15, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 16, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 16, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 17, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 17, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 18, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 18, $itm_sub3, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 19, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 19, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 20, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 20, $sublot_no, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 21, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 21, $ver_no, value);
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
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 30, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 30, $gd_cd, value);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 31, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 31, $quality_typ, value);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 32, $stk_id_typ);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 32, $stk_id_typ, value);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 33, $stk_bp_cd);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 33, $stk_bp_cd, value);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 34, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 34, $trd_unit_cd, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 35, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 35, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 35, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 35, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 35, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 35, $trd_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 36, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 36, $base_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 37, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}
	
	/**
	 * 出庫希望日時. Desired GI date and time.<p>
	 *
	 */
	public MCDate gi_rqst_tm() {
		return getConstDate(offset + 38, $gi_rqst_tm);
	}

	/**
	 * 出庫希望日時. Desired GI date and time.<p>
	 *
	 */
	public void gi_rqst_tm(MCDate value) {
		setConstDate(offset + 38, $gi_rqst_tm, value);
	}

	/**
	 * 入庫希望日時. Desired GR date and time.<p>
	 *
	 */
	public MCDate gr_rqst_tm() {
		return getConstDate(offset + 39, $gr_rqst_tm);
	}

	/**
	 * 入庫希望日時. Desired GR date and time.<p>
	 *
	 */
	public void gr_rqst_tm(MCDate value) {
		setConstDate(offset + 39, $gr_rqst_tm, value);
	}

	/**
	 * 受付日. Receiving date.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 40, $rcpt_dt);
	}

	/**
	 * 受付日. Receiving date.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 40, $rcpt_dt, value);
	}

	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 41, $rqst_usr_cd);
	}

	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 41, $rqst_usr_cd, value);
	}

	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 42, $rqst_dpt_cd);
	}

	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 42, $rqst_dpt_cd, value);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 43, $ship_term_cd);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 43, $ship_term_cd, value);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 44, $ship_inst_typ);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 44, $ship_inst_typ, value);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 45, $rsn_cd);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 45, $rsn_cd, value);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 46, $bd_dpt_cd);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 46, $bd_dpt_cd, value);
	}

	/**
	 * 出荷留めＦＬＧ. Pending shipping flg..<p>
	 *
	 */
	public boolean ship_block_flg() {
		return getConstBoolean(offset + 47, $ship_block_flg);
	}

	/**
	 * 出荷留めＦＬＧ. Pending shipping flg..<p>
	 *
	 */
	public void ship_block_flg(boolean value) {
		setConstBoolean(offset + 47, $ship_block_flg, value);
	}

	/**
	 * 送付先識別区分. Receiving point identification type.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 48, $ship_to_id_typ);
	}

	/**
	 * 送付先識別区分. Receiving point identification type.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 48, $ship_to_id_typ, value);
	}

	/**
	 * 送付先識別ＣＤ. Receiving point identification cd..<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 49, $ship_to_id_cd);
	}

	/**
	 * 送付先識別ＣＤ. Receiving point identification cd..<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 49, $ship_to_id_cd, value);
	}

	/**
	 * 送付先識別名. Receiving point Identification name.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 50, $ship_to_id_nm);
	}

	/**
	 * 送付先識別名. Receiving point Identification name.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 50, $ship_to_id_nm, value);
	}

	/**
	 * 送付先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return getConstString(offset + 51, $ship_to_zip_cd);
	}

	/**
	 * 送付先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		setConstString(offset + 51, $ship_to_zip_cd, value);
	}

	/**
	 * 送付先住所１. Receiving point address 1.<p>
	 *
	 */
	public String ship_to_addr1() {
		return getConstString(offset + 52, $ship_to_addr1);
	}

	/**
	 * 送付先住所１. Receiving point address 1.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		setConstString(offset + 52, $ship_to_addr1, value);
	}

	/**
	 * 送付先住所２. Receiving point address 2.<p>
	 *
	 */
	public String ship_to_addr2() {
		return getConstString(offset + 53, $ship_to_addr2);
	}

	/**
	 * 送付先住所２. Receiving point address 2.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		setConstString(offset + 53, $ship_to_addr2, value);
	}

	/**
	 * 送付先住所３. Receiving point address 3.<p>
	 *
	 */
	public String ship_to_addr3() {
		return getConstString(offset + 54, $ship_to_addr3);
	}

	/**
	 * 送付先住所３. Receiving point address 3.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		setConstString(offset + 54, $ship_to_addr3, value);
	}

	/**
	 * 送付先住所４. Receiving point address 4.<p>
	 *
	 */
	public String ship_to_addr4() {
		return getConstString(offset + 55, $ship_to_addr4);
	}

	/**
	 * 送付先住所４. Receiving point address 4.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		setConstString(offset + 55, $ship_to_addr4, value);
	}

	/**
	 * 送付先部署. Receiving point dept..<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return getConstString(offset + 56, $ship_to_cntct_dpt);
	}

	/**
	 * 送付先部署. Receiving point dept..<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		setConstString(offset + 56, $ship_to_cntct_dpt, value);
	}

	/**
	 * 送付先担当者. Receiving point PIC.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return getConstString(offset + 57, $ship_to_cntct_psn);
	}

	/**
	 * 送付先担当者. Receiving point PIC.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		setConstString(offset + 57, $ship_to_cntct_psn, value);
	}

	/**
	 * 送付先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public String ship_to_tel() {
		return getConstString(offset + 58, $ship_to_tel);
	}

	/**
	 * 送付先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		setConstString(offset + 58, $ship_to_tel, value);
	}

	/**
	 * 送付先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public String ship_to_fax() {
		return getConstString(offset + 59, $ship_to_fax);
	}

	/**
	 * 送付先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		setConstString(offset + 59, $ship_to_fax, value);
	}

	/**
	 * 送付先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 60, $ship_to_sundry_flg);
	}

	/**
	 * 送付先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 60, $ship_to_sundry_flg, value);
	}

	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 61, $via_dlv_typ);
	}

	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 61, $via_dlv_typ, value);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 62, $itm_ord_no);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 62, $itm_ord_no, value);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 63, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 63, $mfg_inst_no, value);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 64, $oper_inst_no);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 64, $oper_inst_no, value);
	}

	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 65, $inpt_schd_no);
	}

	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 65, $inpt_schd_no, value);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 66, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 66, $slo_no, value);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 67, $slo_d_no);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 67, $slo_d_no, value);
	}

	/**
	 * 投入有効成分. Input active ingredient.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 68, $cont_qty);
	}

	/**
	 * 投入有効成分. Input active ingredient.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 68, $cont_qty, value);
	}
	
	/**
	 * 投入有効成分. Input active ingredient.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 68, $cont_qty, value);
	}
	
	/**
	 * 投入有効成分. Input active ingredient.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 68, $cont_qty, value);
	}
	
	/**
	 * 投入有効成分. Input active ingredient.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 68, $cont_qty, value);
	}
	
	/**
	 * 投入有効成分. Input active ingredient.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 68, $cont_qty, value);
	}
	
	/**
	 * 依頼元訂正ＦＬＧ. Edited by request source flg..<p>
	 *
	 */
	public boolean rqst_mod_flg() {
		return getConstBoolean(offset + 69, $rqst_mod_flg);
	}

	/**
	 * 依頼元訂正ＦＬＧ. Edited by request source flg..<p>
	 *
	 */
	public void rqst_mod_flg(boolean value) {
		setConstBoolean(offset + 69, $rqst_mod_flg, value);
	}

	/**
	 * 紐切れＦＬＧ. Unpegged flg..<p>
	 *
	 */
	public boolean rqst_can_flg() {
		return getConstBoolean(offset + 70, $rqst_can_flg);
	}

	/**
	 * 紐切れＦＬＧ. Unpegged flg..<p>
	 *
	 */
	public void rqst_can_flg(boolean value) {
		setConstBoolean(offset + 70, $rqst_can_flg, value);
	}

	/**
	 * ロット混在不可ＦＬＧ. Prohibit mixed lots flg..<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 71, $not_lot_mix_flg);
	}

	/**
	 * ロット混在不可ＦＬＧ. Prohibit mixed lots flg..<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 71, $not_lot_mix_flg, value);
	}

	/**
	 * サブロット混在不可ＦＬＧ. Prohibit mixed sublots flg..<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 72, $not_sublot_mix_flg);
	}

	/**
	 * サブロット混在不可ＦＬＧ. Prohibit mixed sublots flg..<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 72, $not_sublot_mix_flg, value);
	}

	/**
	 * 有効期限ＦＲＯＭ. Expiration date FROM.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 73, $vld_dt_fr);
	}

	/**
	 * 有効期限ＦＲＯＭ. Expiration date FROM.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 73, $vld_dt_fr, value);
	}

	/**
	 * 有効期限ＴＯ. Expiration date TO.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return getConstDate(offset + 74, $vld_dt_to);
	}

	/**
	 * 有効期限ＴＯ. Expiration date TO.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		setConstDate(offset + 74, $vld_dt_to, value);
	}

	/**
	 * 支給区分. Supply type.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 75, $prov_typ);
	}

	/**
	 * 支給区分. Supply type.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 75, $prov_typ, value);
	}

	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 76, $prov_basis_typ);
	}

	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 76, $prov_basis_typ, value);
	}

	/**
	 * 為替レート指定ＦＬＧ. Set exchange rate flg..<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 77, $xrate_inpt_flg);
	}

	/**
	 * 為替レート指定ＦＬＧ. Set exchange rate flg..<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 77, $xrate_inpt_flg, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 78, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 78, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 78, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 78, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 78, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 78, $xrate, value);
	}
	
	/**
	 * 納税為替レート指定ＦＬＧ. Taxpaying exchange rate specification flg..<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 79, $ptax_xrate_inpt_flg);
	}

	/**
	 * 納税為替レート指定ＦＬＧ. Taxpaying exchange rate specification flg..<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 79, $ptax_xrate_inpt_flg, value);
	}

	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 80, $ptax_xrate);
	}

	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 80, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 80, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 80, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 80, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 80, $ptax_xrate, value);
	}
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 81, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 81, $trd_cur_cd, value);
	}

	/**
	 * 税指定ＦＬＧ. Tax specified flg..<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 82, $tax_fix_flg);
	}

	/**
	 * 税指定ＦＬＧ. Tax specified flg..<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 82, $tax_fix_flg, value);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 83, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 83, $tax_cd, value);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 84, $trd_cur_upri);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 84, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 84, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 84, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 84, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 84, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 85, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 85, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 85, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 85, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 85, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 85, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 86, $trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 86, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 86, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 86, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 86, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 86, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 87, $wtax_rate);
	}

	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 87, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 87, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 87, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 87, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 87, $wtax_rate, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 88, $wtax_amt);
	}

	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 88, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 88, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 88, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 88, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 88, $wtax_amt, value);
	}
	
	/**
	 * 支給区分（返品）. Supply type (Return).<p>
	 *
	 */
	public String ret_prov_typ() {
		return getConstString(offset + 89, $ret_prov_typ);
	}

	/**
	 * 支給区分（返品）. Supply type (Return).<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		setConstString(offset + 89, $ret_prov_typ, value);
	}

	/**
	 * 支給計上区分（返品）. Supply recording type (Return).<p>
	 *
	 */
	public String ret_prov_basis_typ() {
		return getConstString(offset + 90, $ret_prov_basis_typ);
	}

	/**
	 * 支給計上区分（返品）. Supply recording type (Return).<p>
	 *
	 */
	public void ret_prov_basis_typ(String value) {
		setConstString(offset + 90, $ret_prov_basis_typ, value);
	}

	/**
	 * 為替レート指定ＦＬＧ（返品）. Set exchange rate flg. (Return).<p>
	 *
	 */
	public boolean ret_xrate_inpt_flg() {
		return getConstBoolean(offset + 91, $ret_xrate_inpt_flg);
	}

	/**
	 * 為替レート指定ＦＬＧ（返品）. Set exchange rate flg. (Return).<p>
	 *
	 */
	public void ret_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 91, $ret_xrate_inpt_flg, value);
	}

	/**
	 * 為替レート（返品）. Exchange rate (Return).<p>
	 *
	 */
	public MCNumber ret_xrate() {
		return getConstNumber(offset + 92, $ret_xrate);
	}

	/**
	 * 為替レート（返品）. Exchange rate (Return).<p>
	 *
	 */
	public void ret_xrate(MCNumber value) {
		setConstNumber(offset + 92, $ret_xrate, value);
	}
	
	/**
	 * 為替レート（返品）. Exchange rate (Return).<p>
	 *
	 */
	public void ret_xrate(int value) {
		setConstNumber(offset + 92, $ret_xrate, value);
	}
	
	/**
	 * 為替レート（返品）. Exchange rate (Return).<p>
	 *
	 */
	public void ret_xrate(long value) {
		setConstNumber(offset + 92, $ret_xrate, value);
	}
	
	/**
	 * 為替レート（返品）. Exchange rate (Return).<p>
	 *
	 */
	public void ret_xrate(float value) {
		setConstNumber(offset + 92, $ret_xrate, value);
	}
	
	/**
	 * 為替レート（返品）. Exchange rate (Return).<p>
	 *
	 */
	public void ret_xrate(double value) {
		setConstNumber(offset + 92, $ret_xrate, value);
	}
	
	/**
	 * 納税為替レート指定ＦＬＧ（返品）. Taxpaying exchange rate specification flg. (Return).<p>
	 *
	 */
	public boolean ret_ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 93, $ret_ptax_xrate_inpt_flg);
	}

	/**
	 * 納税為替レート指定ＦＬＧ（返品）. Taxpaying exchange rate specification flg. (Return).<p>
	 *
	 */
	public void ret_ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 93, $ret_ptax_xrate_inpt_flg, value);
	}

	/**
	 * 納税為替レート（返品）. Taxpaying exchange rate (Return).<p>
	 *
	 */
	public MCNumber ret_ptax_xrate() {
		return getConstNumber(offset + 94, $ret_ptax_xrate);
	}

	/**
	 * 納税為替レート（返品）. Taxpaying exchange rate (Return).<p>
	 *
	 */
	public void ret_ptax_xrate(MCNumber value) {
		setConstNumber(offset + 94, $ret_ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート（返品）. Taxpaying exchange rate (Return).<p>
	 *
	 */
	public void ret_ptax_xrate(int value) {
		setConstNumber(offset + 94, $ret_ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート（返品）. Taxpaying exchange rate (Return).<p>
	 *
	 */
	public void ret_ptax_xrate(long value) {
		setConstNumber(offset + 94, $ret_ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート（返品）. Taxpaying exchange rate (Return).<p>
	 *
	 */
	public void ret_ptax_xrate(float value) {
		setConstNumber(offset + 94, $ret_ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート（返品）. Taxpaying exchange rate (Return).<p>
	 *
	 */
	public void ret_ptax_xrate(double value) {
		setConstNumber(offset + 94, $ret_ptax_xrate, value);
	}
	
	/**
	 * 取引通貨ＣＤ（返品）. Transaction currency cd. (Return).<p>
	 *
	 */
	public String ret_trd_cur_cd() {
		return getConstString(offset + 95, $ret_trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ（返品）. Transaction currency cd. (Return).<p>
	 *
	 */
	public void ret_trd_cur_cd(String value) {
		setConstString(offset + 95, $ret_trd_cur_cd, value);
	}

	/**
	 * 税指定ＦＬＧ（返品）. Tax specified flg. (Return).<p>
	 *
	 */
	public boolean ret_tax_fix_flg() {
		return getConstBoolean(offset + 96, $ret_tax_fix_flg);
	}

	/**
	 * 税指定ＦＬＧ（返品）. Tax specified flg. (Return).<p>
	 *
	 */
	public void ret_tax_fix_flg(boolean value) {
		setConstBoolean(offset + 96, $ret_tax_fix_flg, value);
	}

	/**
	 * 税ＣＤ（返品）. Tax cd. (Return).<p>
	 *
	 */
	public String ret_tax_cd() {
		return getConstString(offset + 97, $ret_tax_cd);
	}

	/**
	 * 税ＣＤ（返品）. Tax cd. (Return).<p>
	 *
	 */
	public void ret_tax_cd(String value) {
		setConstString(offset + 97, $ret_tax_cd, value);
	}

	/**
	 * 取引通貨単価（返品）. Unit price (Transaction currency) (Return).<p>
	 *
	 */
	public MCNumber ret_trd_cur_upri() {
		return getConstNumber(offset + 98, $ret_trd_cur_upri);
	}

	/**
	 * 取引通貨単価（返品）. Unit price (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 98, $ret_trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価（返品）. Unit price (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_upri(int value) {
		setConstNumber(offset + 98, $ret_trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価（返品）. Unit price (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_upri(long value) {
		setConstNumber(offset + 98, $ret_trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価（返品）. Unit price (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_upri(float value) {
		setConstNumber(offset + 98, $ret_trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価（返品）. Unit price (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_upri(double value) {
		setConstNumber(offset + 98, $ret_trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨金額（返品）. Amount (Transaction currency) (Return).<p>
	 *
	 */
	public MCNumber ret_trd_cur_amt() {
		return getConstNumber(offset + 99, $ret_trd_cur_amt);
	}

	/**
	 * 取引通貨金額（返品）. Amount (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 99, $ret_trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額（返品）. Amount (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_amt(int value) {
		setConstNumber(offset + 99, $ret_trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額（返品）. Amount (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_amt(long value) {
		setConstNumber(offset + 99, $ret_trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額（返品）. Amount (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_amt(float value) {
		setConstNumber(offset + 99, $ret_trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額（返品）. Amount (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_amt(double value) {
		setConstNumber(offset + 99, $ret_trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨税額（返品）. Tax amount (Transaction currency) (Return).<p>
	 *
	 */
	public MCNumber ret_trd_cur_tax_amt() {
		return getConstNumber(offset + 100, $ret_trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額（返品）. Tax amount (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 100, $ret_trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額（返品）. Tax amount (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 100, $ret_trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額（返品）. Tax amount (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 100, $ret_trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額（返品）. Tax amount (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 100, $ret_trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額（返品）. Tax amount (Transaction currency) (Return).<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 100, $ret_trd_cur_tax_amt, value);
	}
	
	/**
	 * 源泉税率（返品）. Withholding tax rate (Return).<p>
	 *
	 */
	public MCNumber ret_wtax_rate() {
		return getConstNumber(offset + 101, $ret_wtax_rate);
	}

	/**
	 * 源泉税率（返品）. Withholding tax rate (Return).<p>
	 *
	 */
	public void ret_wtax_rate(MCNumber value) {
		setConstNumber(offset + 101, $ret_wtax_rate, value);
	}
	
	/**
	 * 源泉税率（返品）. Withholding tax rate (Return).<p>
	 *
	 */
	public void ret_wtax_rate(int value) {
		setConstNumber(offset + 101, $ret_wtax_rate, value);
	}
	
	/**
	 * 源泉税率（返品）. Withholding tax rate (Return).<p>
	 *
	 */
	public void ret_wtax_rate(long value) {
		setConstNumber(offset + 101, $ret_wtax_rate, value);
	}
	
	/**
	 * 源泉税率（返品）. Withholding tax rate (Return).<p>
	 *
	 */
	public void ret_wtax_rate(float value) {
		setConstNumber(offset + 101, $ret_wtax_rate, value);
	}
	
	/**
	 * 源泉税率（返品）. Withholding tax rate (Return).<p>
	 *
	 */
	public void ret_wtax_rate(double value) {
		setConstNumber(offset + 101, $ret_wtax_rate, value);
	}
	
	/**
	 * 源泉税額（返品）. Withholding tax (Return).<p>
	 *
	 */
	public MCNumber ret_wtax_amt() {
		return getConstNumber(offset + 102, $ret_wtax_amt);
	}

	/**
	 * 源泉税額（返品）. Withholding tax (Return).<p>
	 *
	 */
	public void ret_wtax_amt(MCNumber value) {
		setConstNumber(offset + 102, $ret_wtax_amt, value);
	}
	
	/**
	 * 源泉税額（返品）. Withholding tax (Return).<p>
	 *
	 */
	public void ret_wtax_amt(int value) {
		setConstNumber(offset + 102, $ret_wtax_amt, value);
	}
	
	/**
	 * 源泉税額（返品）. Withholding tax (Return).<p>
	 *
	 */
	public void ret_wtax_amt(long value) {
		setConstNumber(offset + 102, $ret_wtax_amt, value);
	}
	
	/**
	 * 源泉税額（返品）. Withholding tax (Return).<p>
	 *
	 */
	public void ret_wtax_amt(float value) {
		setConstNumber(offset + 102, $ret_wtax_amt, value);
	}
	
	/**
	 * 源泉税額（返品）. Withholding tax (Return).<p>
	 *
	 */
	public void ret_wtax_amt(double value) {
		setConstNumber(offset + 102, $ret_wtax_amt, value);
	}
	
	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 103, $io_schd_pr_no);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 103, $io_schd_pr_no, value);
	}

	/**
	 * 返品元納品書ＮＯ. Return-from delivery note No..<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return getConstString(offset + 104, $base_dlv_slip_no);
	}

	/**
	 * 返品元納品書ＮＯ. Return-from delivery note No..<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		setConstString(offset + 104, $base_dlv_slip_no, value);
	}

	/**
	 * 返品元支給実績ＮＯ. Return-from supply result No..<p>
	 *
	 */
	public String base_prov_act_no() {
		return getConstString(offset + 105, $base_prov_act_no);
	}

	/**
	 * 返品元支給実績ＮＯ. Return-from supply result No..<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		setConstString(offset + 105, $base_prov_act_no, value);
	}

	/**
	 * 支給計上日（基）. Supply recording date (Base).<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 106, $base_ac_dt);
	}

	/**
	 * 支給計上日（基）. Supply recording date (Base).<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 106, $base_ac_dt, value);
	}

	/**
	 * 依頼連絡備考. Request contact remarks.<p>
	 *
	 */
	public String rqst_cnt_rmrks() {
		return getConstString(offset + 107, $rqst_cnt_rmrks);
	}

	/**
	 * 依頼連絡備考. Request contact remarks.<p>
	 *
	 */
	public void rqst_cnt_rmrks(String value) {
		setConstString(offset + 107, $rqst_cnt_rmrks, value);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 108, $trd_d_rmrks);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 108, $trd_d_rmrks, value);
	}

	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 109, $ship_cnt_rmrks);
	}

	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 109, $ship_cnt_rmrks, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 110, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 110, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 111, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 111, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 112, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 112, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 113, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 113, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 114, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 114, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 115, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 115, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 116, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 116, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 117, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 117, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 118, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 118, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 118, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 118, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 118, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 118, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 119, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 119, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 120, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 120, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 121, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 121, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 122, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 122, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 123, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 123, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gr_stk_arrv_bp_cd();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			return ret_trd_cur_cd();
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			return ret_tax_cd();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return rqst_cnt_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			return ret_xrate();
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			return ret_ptax_xrate();
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			return ret_trd_cur_upri();
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			return ret_trd_cur_amt();
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return ret_trd_cur_tax_amt();
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			return ret_wtax_rate();
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			return ret_wtax_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			return gi_rqst_tm();
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			return gr_rqst_tm();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
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
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			return rqst_mod_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($ret_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ret_xrate_inpt_flg();
		}
		if ($ret_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ret_ptax_xrate_inpt_flg();
		}
		if ($ret_tax_fix_flg.equalsIgnoreCase(name)) {
			return ret_tax_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gr_stk_arrv_bp_cd();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			return ret_trd_cur_cd();
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			return ret_tax_cd();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return rqst_cnt_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			return ret_xrate();
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			return ret_ptax_xrate();
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			return ret_trd_cur_upri();
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			return ret_trd_cur_amt();
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return ret_trd_cur_tax_amt();
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			return ret_wtax_rate();
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			return ret_wtax_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			return gi_rqst_tm();
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			return gr_rqst_tm();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
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
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			return rqst_mod_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($ret_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ret_xrate_inpt_flg();
		}
		if ($ret_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ret_ptax_xrate_inpt_flg();
		}
		if ($ret_tax_fix_flg.equalsIgnoreCase(name)) {
			return ret_tax_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_lg_grp_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gr_stk_arrv_bp_cd(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			ret_trd_cur_cd(value);
			return;
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			ret_tax_cd(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			rqst_cnt_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			gi_rqst_tm(value);
			return;
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			gr_rqst_tm(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			vld_dt_to(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
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
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			rqst_mod_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($ret_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ret_xrate_inpt_flg(value);
			return;
		}
		if ($ret_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ret_ptax_xrate_inpt_flg(value);
			return;
		}
		if ($ret_tax_fix_flg.equalsIgnoreCase(name)) {
			ret_tax_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_lg_grp_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gr_stk_arrv_bp_cd(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			ret_trd_cur_cd(value);
			return;
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			ret_tax_cd(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			rqst_cnt_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			gi_rqst_tm(value);
			return;
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			gr_rqst_tm(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			vld_dt_to(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
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
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			rqst_mod_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($ret_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ret_xrate_inpt_flg(value);
			return;
		}
		if ($ret_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ret_ptax_xrate_inpt_flg(value);
			return;
		}
		if ($ret_tax_fix_flg.equalsIgnoreCase(name)) {
			ret_tax_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
