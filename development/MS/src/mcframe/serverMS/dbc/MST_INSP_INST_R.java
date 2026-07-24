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
 * "検査指図 // Inspection order"DBコンテナRowクラスです。<p>
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
 *  	<td>insp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査ＮＯ</td>
 *  	<td>Inspection No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_freq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査回数</td>
 *  	<td>Number of inspections</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_no1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元ＮＯ１</td>
 *  	<td>Source No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_no2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元ＮＯ２</td>
 *  	<td>Source No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査種類区分</td>
 *  	<td>Inspection classification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_mtd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査方法区分</td>
 *  	<td>Inspection method type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査状況区分</td>
 *  	<td>Inspection status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_bind_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査実施単位区分</td>
 *  	<td>Inspection implementation unit type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>col_schd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予定まとめＦＬＧ</td>
 *  	<td>Schedule aggregation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_lst_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査指図リスト発行済ＦＬＧ</td>
 *  	<td>Inspection order list issued flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_lst_prnt_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査指図リスト発行日時</td>
 *  	<td>Inspection order list issue date and time</td>
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
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
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
 *  	<td>from_site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷元工場・物流倉庫ＣＤ</td>
 *  	<td>Shipping point factory/distribution warehouse cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>to_site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業者ロットＮＯ</td>
 *  	<td>Vendor lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pack_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位数量</td>
 *  	<td>SKU qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位ＣＤ</td>
 *  	<td>SKU cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_lst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査指図リストＮＯ</td>
 *  	<td>Inspection order list No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図日</td>
 *  	<td>Order date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図部門ＣＤ</td>
 *  	<td>Order dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図担当者ＣＤ</td>
 *  	<td>Order PIC cd.</td>
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
 *  	<td>st_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>開始予定日時</td>
 *  	<td>Scheduled start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>終了予定日時</td>
 *  	<td>Scheduled end date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査パタンＣＤ</td>
 *  	<td>Inspection pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_req_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>規格検査必須ＦＬＧ</td>
 *  	<td>Specific inspection required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cnf_req_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>規格実績確認必須ＦＬＧ</td>
 *  	<td>Specific result check required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_std_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>規格書ＮＯ</td>
 *  	<td>Specific inspection No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>plnt_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場出荷承認対象ＦＬＧ</td>
 *  	<td>For factory release approval flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_rslt_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査成績書発行済ＦＬＧ</td>
 *  	<td>Inspection report printed flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_rslt_prnt_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査成績書発行日時</td>
 *  	<td>Inspection report printed date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査成績書連番</td>
 *  	<td>Inspection report sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lmt_up_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期限再検査ＦＬＧ</td>
 *  	<td>Re-inspection for expiration flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査承認対象ＦＬＧ</td>
 *  	<td>For inspection approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査承認状況区分</td>
 *  	<td>Inspection approval status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認日</td>
 *  	<td>Approval date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査承認役割ＣＤ</td>
 *  	<td>Inspection approval role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認部門ＣＤ</td>
 *  	<td>Approval dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認者ＣＤ</td>
 *  	<td>Approver cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認日時</td>
 *  	<td>Approval date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認理由</td>
 *  	<td>Approval reason</td>
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
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備３</td>
 *  	<td>Spare 3</td>
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
 *  	<td>lims_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＬＩＭＳＦＬＧ</td>
 *  	<td>LIMS flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_INSP_INST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_INSP_INST";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	private static final MCPermColumnInfo _insp_no = createColumnInfo("insp_no");
	public final MCStringPermColumn insp_no = createStringColumn(_insp_no);
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public static final String $insp_freq = "insp_freq";
	private static final MCPermColumnInfo _insp_freq = createColumnInfo("insp_freq");
	public final MCNumberPermColumn insp_freq = createNumberColumn(_insp_freq);
	
	/**
	 * 作成元ＮＯ１. Source No. 1.<p>
	 *
	 */
	public static final String $src_no1 = "src_no1";
	private static final MCPermColumnInfo _src_no1 = createColumnInfo("src_no1");
	public final MCStringPermColumn src_no1 = createStringColumn(_src_no1);
	
	/**
	 * 作成元ＮＯ２. Source No. 2.<p>
	 *
	 */
	public static final String $src_no2 = "src_no2";
	private static final MCPermColumnInfo _src_no2 = createColumnInfo("src_no2");
	public final MCStringPermColumn src_no2 = createStringColumn(_src_no2);
	
	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	private static final MCPermColumnInfo _insp_typ = createColumnInfo("insp_typ");
	public final MCStringPermColumn insp_typ = createStringColumn(_insp_typ);
	
	/**
	 * 検査方法区分. Inspection method type.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	private static final MCPermColumnInfo _insp_mtd_typ = createColumnInfo("insp_mtd_typ");
	public final MCStringPermColumn insp_mtd_typ = createStringColumn(_insp_mtd_typ);
	
	/**
	 * 検査状況区分. Inspection status type.<p>
	 *
	 */
	public static final String $insp_sts_typ = "insp_sts_typ";
	private static final MCPermColumnInfo _insp_sts_typ = createColumnInfo("insp_sts_typ");
	public final MCStringPermColumn insp_sts_typ = createStringColumn(_insp_sts_typ);
	
	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public static final String $insp_bind_typ = "insp_bind_typ";
	private static final MCPermColumnInfo _insp_bind_typ = createColumnInfo("insp_bind_typ");
	public final MCStringPermColumn insp_bind_typ = createStringColumn(_insp_bind_typ);
	
	/**
	 * 予定まとめＦＬＧ. Schedule aggregation flg..<p>
	 *
	 */
	public static final String $col_schd_flg = "col_schd_flg";
	private static final MCPermColumnInfo _col_schd_flg = createColumnInfo("col_schd_flg");
	public final MCBooleanPermColumn col_schd_flg = createBooleanColumn(_col_schd_flg);
	
	/**
	 * 検査指図リスト発行済ＦＬＧ. Inspection order list issued flg..<p>
	 *
	 */
	public static final String $insp_lst_prnt_flg = "insp_lst_prnt_flg";
	private static final MCPermColumnInfo _insp_lst_prnt_flg = createColumnInfo("insp_lst_prnt_flg");
	public final MCBooleanPermColumn insp_lst_prnt_flg = createBooleanColumn(_insp_lst_prnt_flg);
	
	/**
	 * 検査指図リスト発行日時. Inspection order list issue date and time.<p>
	 *
	 */
	public static final String $insp_lst_prnt_tm = "insp_lst_prnt_tm";
	private static final MCPermColumnInfo _insp_lst_prnt_tm = createColumnInfo("insp_lst_prnt_tm");
	public final MCDatePermColumn insp_lst_prnt_tm = createDateColumn(_insp_lst_prnt_tm);
	
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
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
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
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	private static final MCPermColumnInfo _mfg_loc_cd = createColumnInfo("mfg_loc_cd");
	public final MCStringPermColumn mfg_loc_cd = createStringColumn(_mfg_loc_cd);
	
	/**
	 * 出荷元工場・物流倉庫ＣＤ. Shipping point factory/distribution warehouse cd..<p>
	 *
	 */
	public static final String $from_site_cd = "from_site_cd";
	private static final MCPermColumnInfo _from_site_cd = createColumnInfo("from_site_cd");
	public final MCStringPermColumn from_site_cd = createStringColumn(_from_site_cd);
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	private static final MCPermColumnInfo _to_site_cd = createColumnInfo("to_site_cd");
	public final MCStringPermColumn to_site_cd = createStringColumn(_to_site_cd);
	
	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	private static final MCPermColumnInfo _bp_lot_no = createColumnInfo("bp_lot_no");
	public final MCStringPermColumn bp_lot_no = createStringColumn(_bp_lot_no);
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	private static final MCPermColumnInfo _pack_unit_qty = createColumnInfo("pack_unit_qty");
	public final MCNumberPermColumn pack_unit_qty = createNumberColumn(_pack_unit_qty);
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	private static final MCPermColumnInfo _pack_unit_cd = createColumnInfo("pack_unit_cd");
	public final MCStringPermColumn pack_unit_cd = createStringColumn(_pack_unit_cd);
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	private static final MCPermColumnInfo _base_unit_qty = createColumnInfo("base_unit_qty");
	public final MCNumberPermColumn base_unit_qty = createNumberColumn(_base_unit_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 検査指図リストＮＯ. Inspection order list No..<p>
	 *
	 */
	public static final String $insp_lst_no = "insp_lst_no";
	private static final MCPermColumnInfo _insp_lst_no = createColumnInfo("insp_lst_no");
	public final MCStringPermColumn insp_lst_no = createStringColumn(_insp_lst_no);
	
	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	private static final MCPermColumnInfo _inst_dt = createColumnInfo("inst_dt");
	public final MCDatePermColumn inst_dt = createDateColumn(_inst_dt);
	
	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	private static final MCPermColumnInfo _inst_dpt_cd = createColumnInfo("inst_dpt_cd");
	public final MCStringPermColumn inst_dpt_cd = createStringColumn(_inst_dpt_cd);
	
	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	private static final MCPermColumnInfo _inst_usr_cd = createColumnInfo("inst_usr_cd");
	public final MCStringPermColumn inst_usr_cd = createStringColumn(_inst_usr_cd);
	
	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	private static final MCPermColumnInfo _master_dt = createColumnInfo("master_dt");
	public final MCDatePermColumn master_dt = createDateColumn(_master_dt);
	
	/**
	 * 開始予定日時. Scheduled start date and time.<p>
	 *
	 */
	public static final String $st_tm = "st_tm";
	private static final MCPermColumnInfo _st_tm = createColumnInfo("st_tm");
	public final MCDatePermColumn st_tm = createDateColumn(_st_tm);
	
	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public static final String $end_tm = "end_tm";
	private static final MCPermColumnInfo _end_tm = createColumnInfo("end_tm");
	public final MCDatePermColumn end_tm = createDateColumn(_end_tm);
	
	/**
	 * 検査パタンＣＤ. Inspection pattern cd..<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	private static final MCPermColumnInfo _insp_ptn_cd = createColumnInfo("insp_ptn_cd");
	public final MCStringPermColumn insp_ptn_cd = createStringColumn(_insp_ptn_cd);
	
	/**
	 * 規格検査必須ＦＬＧ. Specific inspection required flg..<p>
	 *
	 */
	public static final String $std_req_flg = "std_req_flg";
	private static final MCPermColumnInfo _std_req_flg = createColumnInfo("std_req_flg");
	public final MCBooleanPermColumn std_req_flg = createBooleanColumn(_std_req_flg);
	
	/**
	 * 規格実績確認必須ＦＬＧ. Specific result check required flg..<p>
	 *
	 */
	public static final String $std_cnf_req_flg = "std_cnf_req_flg";
	private static final MCPermColumnInfo _std_cnf_req_flg = createColumnInfo("std_cnf_req_flg");
	public final MCBooleanPermColumn std_cnf_req_flg = createBooleanColumn(_std_cnf_req_flg);
	
	/**
	 * 規格書ＮＯ. Specific inspection No..<p>
	 *
	 */
	public static final String $insp_std_no = "insp_std_no";
	private static final MCPermColumnInfo _insp_std_no = createColumnInfo("insp_std_no");
	public final MCStringPermColumn insp_std_no = createStringColumn(_insp_std_no);
	
	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public static final String $plnt_aprv_flg = "plnt_aprv_flg";
	private static final MCPermColumnInfo _plnt_aprv_flg = createColumnInfo("plnt_aprv_flg");
	public final MCBooleanPermColumn plnt_aprv_flg = createBooleanColumn(_plnt_aprv_flg);
	
	/**
	 * 検査成績書発行済ＦＬＧ. Inspection report printed flg..<p>
	 *
	 */
	public static final String $insp_rslt_prnt_flg = "insp_rslt_prnt_flg";
	private static final MCPermColumnInfo _insp_rslt_prnt_flg = createColumnInfo("insp_rslt_prnt_flg");
	public final MCBooleanPermColumn insp_rslt_prnt_flg = createBooleanColumn(_insp_rslt_prnt_flg);
	
	/**
	 * 検査成績書発行日時. Inspection report printed date and time.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_tm = "insp_rslt_prnt_tm";
	private static final MCPermColumnInfo _insp_rslt_prnt_tm = createColumnInfo("insp_rslt_prnt_tm");
	public final MCDatePermColumn insp_rslt_prnt_tm = createDateColumn(_insp_rslt_prnt_tm);
	
	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public static final String $seq = "seq";
	private static final MCPermColumnInfo _seq = createColumnInfo("seq");
	public final MCNumberPermColumn seq = createNumberColumn(_seq);
	
	/**
	 * 期限再検査ＦＬＧ. Re-inspection for expiration flg..<p>
	 *
	 */
	public static final String $lmt_up_flg = "lmt_up_flg";
	private static final MCPermColumnInfo _lmt_up_flg = createColumnInfo("lmt_up_flg");
	public final MCBooleanPermColumn lmt_up_flg = createBooleanColumn(_lmt_up_flg);
	
	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public static final String $insp_aprv_flg = "insp_aprv_flg";
	private static final MCPermColumnInfo _insp_aprv_flg = createColumnInfo("insp_aprv_flg");
	public final MCBooleanPermColumn insp_aprv_flg = createBooleanColumn(_insp_aprv_flg);
	
	/**
	 * 検査承認状況区分. Inspection approval status type.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	private static final MCPermColumnInfo _insp_aprv_sts_typ = createColumnInfo("insp_aprv_sts_typ");
	public final MCStringPermColumn insp_aprv_sts_typ = createStringColumn(_insp_aprv_sts_typ);
	
	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	private static final MCPermColumnInfo _aprv_dt = createColumnInfo("aprv_dt");
	public final MCDatePermColumn aprv_dt = createDateColumn(_aprv_dt);
	
	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public static final String $insp_aprv_role_cd = "insp_aprv_role_cd";
	private static final MCPermColumnInfo _insp_aprv_role_cd = createColumnInfo("insp_aprv_role_cd");
	public final MCStringPermColumn insp_aprv_role_cd = createStringColumn(_insp_aprv_role_cd);
	
	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	private static final MCPermColumnInfo _aprv_dpt_cd = createColumnInfo("aprv_dpt_cd");
	public final MCStringPermColumn aprv_dpt_cd = createStringColumn(_aprv_dpt_cd);
	
	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	private static final MCPermColumnInfo _aprv_usr_cd = createColumnInfo("aprv_usr_cd");
	public final MCStringPermColumn aprv_usr_cd = createStringColumn(_aprv_usr_cd);
	
	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public static final String $aprv_tm = "aprv_tm";
	private static final MCPermColumnInfo _aprv_tm = createColumnInfo("aprv_tm");
	public final MCDatePermColumn aprv_tm = createDateColumn(_aprv_tm);
	
	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";
	private static final MCPermColumnInfo _aprv_rsn = createColumnInfo("aprv_rsn");
	public final MCStringPermColumn aprv_rsn = createStringColumn(_aprv_rsn);
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	private static final MCPermColumnInfo _act_cont_fctr = createColumnInfo("act_cont_fctr");
	public final MCNumberPermColumn act_cont_fctr = createNumberColumn(_act_cont_fctr);
	
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
	
	/**
	 * ＬＩＭＳＦＬＧ. LIMS flg..<p>
	 *
	 */
	public static final String $lims_flg = "lims_flg";
	private static final MCPermColumnInfo _lims_flg = createColumnInfo("lims_flg");
	public final MCBooleanPermColumn lims_flg = createBooleanColumn(_lims_flg);
	
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_freq_META = createCommonMeta($insp_freq, mcframe.commonMS.meta.MS_META.INSP_FREQ);
	public static final MCMeta src_no1_META = createCommonMeta($src_no1, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no2_META = createCommonMeta($src_no2, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta insp_sts_typ_META = createCommonMeta($insp_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta insp_bind_typ_META = createCommonMeta($insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta col_schd_flg_META = createCommonMeta($col_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_lst_prnt_flg_META = createCommonMeta($insp_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_lst_prnt_tm_META = createCommonMeta($insp_lst_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta from_site_cd_META = createCommonMeta($from_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta insp_lst_no_META = createCommonMeta($insp_lst_no, mcframe.commonMA.meta.MA_META.INSP_LST_NO);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_tm_META = createCommonMeta($st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_tm_META = createCommonMeta($end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta std_req_flg_META = createCommonMeta($std_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cnf_req_flg_META = createCommonMeta($std_cnf_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_std_no_META = createCommonMeta($insp_std_no, mcframe.commonMA.meta.MA_META.INSP_STD_NO);
	public static final MCMeta plnt_aprv_flg_META = createCommonMeta($plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_prnt_flg_META = createCommonMeta($insp_rslt_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_prnt_tm_META = createCommonMeta($insp_rslt_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta seq_META = createCommonMeta($seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta lmt_up_flg_META = createCommonMeta($lmt_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_flg_META = createCommonMeta($insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_aprv_role_cd_META = createCommonMeta($insp_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_tm_META = createCommonMeta($aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.INSP_INST_APRV_RSN);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_INST_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_INST_SUB_CHAR3);
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
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MST_INSP_INST_R> constMetas = new ConstMetaList<MST_INSP_INST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			insp_no_META,
			insp_freq_META,
			src_no1_META,
			src_no2_META,
			insp_typ_META,
			insp_mtd_typ_META,
			insp_sts_typ_META,
			insp_bind_typ_META,
			col_schd_flg_META,
			insp_lst_prnt_flg_META,
			insp_lst_prnt_tm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			lot_no_META,
			sublot_no_META,
			sppl_cd_META,
			maker_cd_META,
			mfg_loc_cd_META,
			from_site_cd_META,
			to_site_cd_META,
			bp_lot_no_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			insp_lst_no_META,
			inst_dt_META,
			inst_dpt_cd_META,
			inst_usr_cd_META,
			master_dt_META,
			st_tm_META,
			end_tm_META,
			insp_ptn_cd_META,
			std_req_flg_META,
			std_cnf_req_flg_META,
			insp_std_no_META,
			plnt_aprv_flg_META,
			insp_rslt_prnt_flg_META,
			insp_rslt_prnt_tm_META,
			seq_META,
			lmt_up_flg_META,
			insp_aprv_flg_META,
			insp_aprv_sts_typ_META,
			aprv_dt_META,
			insp_aprv_role_cd_META,
			aprv_dpt_cd_META,
			aprv_usr_cd_META,
			aprv_tm_META,
			aprv_rsn_META,
			act_cont_fctr_META,
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
			upd_srv_req_no_META,
			lims_flg_META
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
	protected MST_INSP_INST_R(ConstMetaList<? extends MST_INSP_INST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_INSP_INST_R(ConstMetaList<? extends MST_INSP_INST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$insp_no,
				"insp_no",
				insp_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_freq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_R.$insp_freq,
				"insp_freq",
				insp_freq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$src_no1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$src_no1,
				"src_no1",
				src_no1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$src_no2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$src_no2,
				"src_no2",
				src_no2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$insp_typ,
				"insp_typ",
				insp_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_mtd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$insp_mtd_typ,
				"insp_mtd_typ",
				insp_mtd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$insp_sts_typ,
				"insp_sts_typ",
				insp_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_bind_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$insp_bind_typ,
				"insp_bind_typ",
				insp_bind_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$col_schd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_R.$col_schd_flg,
				"col_schd_flg",
				col_schd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_lst_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_R.$insp_lst_prnt_flg,
				"insp_lst_prnt_flg",
				insp_lst_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_lst_prnt_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_R.$insp_lst_prnt_tm,
				"insp_lst_prnt_tm",
				insp_lst_prnt_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$itm_cd,
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
			MST_INSP_INST_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$itm_sub1,
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
			MST_INSP_INST_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$itm_sub2,
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
			MST_INSP_INST_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$itm_sub3,
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
			MST_INSP_INST_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$itm_nm,
				"itm_nm",
				itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$lot_no,
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
			MST_INSP_INST_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$sublot_no,
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
			MST_INSP_INST_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$sppl_cd,
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
			MST_INSP_INST_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$maker_cd,
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
			MST_INSP_INST_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$mfg_loc_cd,
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
			MST_INSP_INST_R.$from_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$from_site_cd,
				"from_site_cd",
				from_site_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$to_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$to_site_cd,
				"to_site_cd",
				to_site_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$bp_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$bp_lot_no,
				"bp_lot_no",
				bp_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_R.$pack_unit_qty,
				"pack_unit_qty",
				pack_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$pack_unit_cd,
				"pack_unit_cd",
				pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_R.$base_unit_qty,
				"base_unit_qty",
				base_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$base_unit_cd,
				"base_unit_cd",
				base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_lst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$insp_lst_no,
				"insp_lst_no",
				insp_lst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$inst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_R.$inst_dt,
				"inst_dt",
				inst_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$inst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$inst_dpt_cd,
				"inst_dpt_cd",
				inst_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$inst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$inst_usr_cd,
				"inst_usr_cd",
				inst_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$master_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_R.$master_dt,
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
			MST_INSP_INST_R.$st_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_R.$st_tm,
				"st_tm",
				st_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$end_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_R.$end_tm,
				"end_tm",
				end_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$insp_ptn_cd,
				"insp_ptn_cd",
				insp_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$std_req_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_R.$std_req_flg,
				"std_req_flg",
				std_req_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$std_cnf_req_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_R.$std_cnf_req_flg,
				"std_cnf_req_flg",
				std_cnf_req_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_std_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$insp_std_no,
				"insp_std_no",
				insp_std_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$plnt_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_R.$plnt_aprv_flg,
				"plnt_aprv_flg",
				plnt_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_rslt_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_R.$insp_rslt_prnt_flg,
				"insp_rslt_prnt_flg",
				insp_rslt_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_rslt_prnt_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_R.$insp_rslt_prnt_tm,
				"insp_rslt_prnt_tm",
				insp_rslt_prnt_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_R.$seq,
				"seq",
				seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$lmt_up_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_R.$lmt_up_flg,
				"lmt_up_flg",
				lmt_up_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_R.$insp_aprv_flg,
				"insp_aprv_flg",
				insp_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$insp_aprv_sts_typ,
				"insp_aprv_sts_typ",
				insp_aprv_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$aprv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_R.$aprv_dt,
				"aprv_dt",
				aprv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$insp_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$insp_aprv_role_cd,
				"insp_aprv_role_cd",
				insp_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$aprv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$aprv_dpt_cd,
				"aprv_dpt_cd",
				aprv_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$aprv_usr_cd,
				"aprv_usr_cd",
				aprv_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$aprv_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_INST_R.$aprv_tm,
				"aprv_tm",
				aprv_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$aprv_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$aprv_rsn,
				"aprv_rsn",
				aprv_rsn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_INST_R.$act_cont_fctr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_R.$act_cont_fctr,
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
			MST_INSP_INST_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$intr_rmrks,
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
			MST_INSP_INST_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$sub_char1,
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
			MST_INSP_INST_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$sub_char2,
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
			MST_INSP_INST_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$sub_char3,
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
			MST_INSP_INST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$ins_usr_id,
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
			MST_INSP_INST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$ins_usr_nm,
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
			MST_INSP_INST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INSP_INST_R.$ins_ts,
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
			MST_INSP_INST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$ins_func_id,
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
			MST_INSP_INST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_INST_R.$upd_cntr,
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
			MST_INSP_INST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$upd_usr_id,
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
			MST_INSP_INST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$upd_usr_nm,
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
			MST_INSP_INST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INSP_INST_R.$upd_ts,
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
			MST_INSP_INST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$upd_func_id,
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
			MST_INSP_INST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_INST_R.$upd_srv_req_no,
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
			MST_INSP_INST_R.$lims_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_INST_R.$lims_flg,
				"lims_flg",
				lims_flg,
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
	public static MST_INSP_INST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_INSP_INST_R create(String alias) {
		MST_INSP_INST_R row = new MST_INSP_INST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_INSP_INST_R createByName(T proto) {
		MST_INSP_INST_R row = MST_INSP_INST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_INST_R clone() {
		return (MST_INSP_INST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_INST_R createInstance() {
		return (MST_INSP_INST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_INST_R getValues(String... names) {
		return (MST_INSP_INST_R) super.getValues(names);
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
	 public MSW_INSP_INST_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_INSP_INST_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_INSP_INST_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_INSP_INST_KEY_R.TABLE_NAME);
	 }

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 0, $insp_no);
	}

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 0, $insp_no, value);
	}

	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return getConstNumber(offset + 1, $insp_freq);
	}

	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		setConstNumber(offset + 1, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(int value) {
		setConstNumber(offset + 1, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(long value) {
		setConstNumber(offset + 1, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(float value) {
		setConstNumber(offset + 1, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(double value) {
		setConstNumber(offset + 1, $insp_freq, value);
	}
	
	/**
	 * 作成元ＮＯ１. Source No. 1.<p>
	 *
	 */
	public String src_no1() {
		return getConstString(offset + 2, $src_no1);
	}

	/**
	 * 作成元ＮＯ１. Source No. 1.<p>
	 *
	 */
	public void src_no1(String value) {
		setConstString(offset + 2, $src_no1, value);
	}

	/**
	 * 作成元ＮＯ２. Source No. 2.<p>
	 *
	 */
	public String src_no2() {
		return getConstString(offset + 3, $src_no2);
	}

	/**
	 * 作成元ＮＯ２. Source No. 2.<p>
	 *
	 */
	public void src_no2(String value) {
		setConstString(offset + 3, $src_no2, value);
	}

	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 4, $insp_typ);
	}

	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 4, $insp_typ, value);
	}

	/**
	 * 検査方法区分. Inspection method type.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 5, $insp_mtd_typ);
	}

	/**
	 * 検査方法区分. Inspection method type.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 5, $insp_mtd_typ, value);
	}

	/**
	 * 検査状況区分. Inspection status type.<p>
	 *
	 */
	public String insp_sts_typ() {
		return getConstString(offset + 6, $insp_sts_typ);
	}

	/**
	 * 検査状況区分. Inspection status type.<p>
	 *
	 */
	public void insp_sts_typ(String value) {
		setConstString(offset + 6, $insp_sts_typ, value);
	}

	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public String insp_bind_typ() {
		return getConstString(offset + 7, $insp_bind_typ);
	}

	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public void insp_bind_typ(String value) {
		setConstString(offset + 7, $insp_bind_typ, value);
	}

	/**
	 * 予定まとめＦＬＧ. Schedule aggregation flg..<p>
	 *
	 */
	public boolean col_schd_flg() {
		return getConstBoolean(offset + 8, $col_schd_flg);
	}

	/**
	 * 予定まとめＦＬＧ. Schedule aggregation flg..<p>
	 *
	 */
	public void col_schd_flg(boolean value) {
		setConstBoolean(offset + 8, $col_schd_flg, value);
	}

	/**
	 * 検査指図リスト発行済ＦＬＧ. Inspection order list issued flg..<p>
	 *
	 */
	public boolean insp_lst_prnt_flg() {
		return getConstBoolean(offset + 9, $insp_lst_prnt_flg);
	}

	/**
	 * 検査指図リスト発行済ＦＬＧ. Inspection order list issued flg..<p>
	 *
	 */
	public void insp_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 9, $insp_lst_prnt_flg, value);
	}

	/**
	 * 検査指図リスト発行日時. Inspection order list issue date and time.<p>
	 *
	 */
	public MCDate insp_lst_prnt_tm() {
		return getConstDate(offset + 10, $insp_lst_prnt_tm);
	}

	/**
	 * 検査指図リスト発行日時. Inspection order list issue date and time.<p>
	 *
	 */
	public void insp_lst_prnt_tm(MCDate value) {
		setConstDate(offset + 10, $insp_lst_prnt_tm, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 11, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 11, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 12, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 12, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 13, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 13, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 14, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 14, $itm_sub3, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 15, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 15, $itm_nm, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 16, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 16, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 17, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 17, $sublot_no, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 18, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 18, $sppl_cd, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 19, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 19, $maker_cd, value);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 20, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 20, $mfg_loc_cd, value);
	}

	/**
	 * 出荷元工場・物流倉庫ＣＤ. Shipping point factory/distribution warehouse cd..<p>
	 *
	 */
	public String from_site_cd() {
		return getConstString(offset + 21, $from_site_cd);
	}

	/**
	 * 出荷元工場・物流倉庫ＣＤ. Shipping point factory/distribution warehouse cd..<p>
	 *
	 */
	public void from_site_cd(String value) {
		setConstString(offset + 21, $from_site_cd, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 22, $to_site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 22, $to_site_cd, value);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 23, $bp_lot_no);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 23, $bp_lot_no, value);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 24, $pack_unit_qty);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 24, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 24, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 24, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 24, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 24, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 25, $pack_unit_cd);
	}

	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 25, $pack_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 26, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 26, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 26, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 26, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 26, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 26, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 27, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 27, $base_unit_cd, value);
	}

	/**
	 * 検査指図リストＮＯ. Inspection order list No..<p>
	 *
	 */
	public String insp_lst_no() {
		return getConstString(offset + 28, $insp_lst_no);
	}

	/**
	 * 検査指図リストＮＯ. Inspection order list No..<p>
	 *
	 */
	public void insp_lst_no(String value) {
		setConstString(offset + 28, $insp_lst_no, value);
	}

	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 29, $inst_dt);
	}

	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 29, $inst_dt, value);
	}

	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 30, $inst_dpt_cd);
	}

	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 30, $inst_dpt_cd, value);
	}

	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 31, $inst_usr_cd);
	}

	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 31, $inst_usr_cd, value);
	}

	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 32, $master_dt);
	}

	/**
	 * マスタ適用日. Master application date.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 32, $master_dt, value);
	}

	/**
	 * 開始予定日時. Scheduled start date and time.<p>
	 *
	 */
	public MCDate st_tm() {
		return getConstDate(offset + 33, $st_tm);
	}

	/**
	 * 開始予定日時. Scheduled start date and time.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		setConstDate(offset + 33, $st_tm, value);
	}

	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public MCDate end_tm() {
		return getConstDate(offset + 34, $end_tm);
	}

	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		setConstDate(offset + 34, $end_tm, value);
	}

	/**
	 * 検査パタンＣＤ. Inspection pattern cd..<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 35, $insp_ptn_cd);
	}

	/**
	 * 検査パタンＣＤ. Inspection pattern cd..<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 35, $insp_ptn_cd, value);
	}

	/**
	 * 規格検査必須ＦＬＧ. Specific inspection required flg..<p>
	 *
	 */
	public boolean std_req_flg() {
		return getConstBoolean(offset + 36, $std_req_flg);
	}

	/**
	 * 規格検査必須ＦＬＧ. Specific inspection required flg..<p>
	 *
	 */
	public void std_req_flg(boolean value) {
		setConstBoolean(offset + 36, $std_req_flg, value);
	}

	/**
	 * 規格実績確認必須ＦＬＧ. Specific result check required flg..<p>
	 *
	 */
	public boolean std_cnf_req_flg() {
		return getConstBoolean(offset + 37, $std_cnf_req_flg);
	}

	/**
	 * 規格実績確認必須ＦＬＧ. Specific result check required flg..<p>
	 *
	 */
	public void std_cnf_req_flg(boolean value) {
		setConstBoolean(offset + 37, $std_cnf_req_flg, value);
	}

	/**
	 * 規格書ＮＯ. Specific inspection No..<p>
	 *
	 */
	public String insp_std_no() {
		return getConstString(offset + 38, $insp_std_no);
	}

	/**
	 * 規格書ＮＯ. Specific inspection No..<p>
	 *
	 */
	public void insp_std_no(String value) {
		setConstString(offset + 38, $insp_std_no, value);
	}

	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public boolean plnt_aprv_flg() {
		return getConstBoolean(offset + 39, $plnt_aprv_flg);
	}

	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public void plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 39, $plnt_aprv_flg, value);
	}

	/**
	 * 検査成績書発行済ＦＬＧ. Inspection report printed flg..<p>
	 *
	 */
	public boolean insp_rslt_prnt_flg() {
		return getConstBoolean(offset + 40, $insp_rslt_prnt_flg);
	}

	/**
	 * 検査成績書発行済ＦＬＧ. Inspection report printed flg..<p>
	 *
	 */
	public void insp_rslt_prnt_flg(boolean value) {
		setConstBoolean(offset + 40, $insp_rslt_prnt_flg, value);
	}

	/**
	 * 検査成績書発行日時. Inspection report printed date and time.<p>
	 *
	 */
	public MCDate insp_rslt_prnt_tm() {
		return getConstDate(offset + 41, $insp_rslt_prnt_tm);
	}

	/**
	 * 検査成績書発行日時. Inspection report printed date and time.<p>
	 *
	 */
	public void insp_rslt_prnt_tm(MCDate value) {
		setConstDate(offset + 41, $insp_rslt_prnt_tm, value);
	}

	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public MCNumber seq() {
		return getConstNumber(offset + 42, $seq);
	}

	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public void seq(MCNumber value) {
		setConstNumber(offset + 42, $seq, value);
	}
	
	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public void seq(int value) {
		setConstNumber(offset + 42, $seq, value);
	}
	
	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public void seq(long value) {
		setConstNumber(offset + 42, $seq, value);
	}
	
	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public void seq(float value) {
		setConstNumber(offset + 42, $seq, value);
	}
	
	/**
	 * 検査成績書連番. Inspection report sequence number.<p>
	 *
	 */
	public void seq(double value) {
		setConstNumber(offset + 42, $seq, value);
	}
	
	/**
	 * 期限再検査ＦＬＧ. Re-inspection for expiration flg..<p>
	 *
	 */
	public boolean lmt_up_flg() {
		return getConstBoolean(offset + 43, $lmt_up_flg);
	}

	/**
	 * 期限再検査ＦＬＧ. Re-inspection for expiration flg..<p>
	 *
	 */
	public void lmt_up_flg(boolean value) {
		setConstBoolean(offset + 43, $lmt_up_flg, value);
	}

	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public boolean insp_aprv_flg() {
		return getConstBoolean(offset + 44, $insp_aprv_flg);
	}

	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public void insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 44, $insp_aprv_flg, value);
	}

	/**
	 * 検査承認状況区分. Inspection approval status type.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 45, $insp_aprv_sts_typ);
	}

	/**
	 * 検査承認状況区分. Inspection approval status type.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 45, $insp_aprv_sts_typ, value);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 46, $aprv_dt);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 46, $aprv_dt, value);
	}

	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public String insp_aprv_role_cd() {
		return getConstString(offset + 47, $insp_aprv_role_cd);
	}

	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public void insp_aprv_role_cd(String value) {
		setConstString(offset + 47, $insp_aprv_role_cd, value);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 48, $aprv_dpt_cd);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 48, $aprv_dpt_cd, value);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 49, $aprv_usr_cd);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 49, $aprv_usr_cd, value);
	}

	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return getConstDate(offset + 50, $aprv_tm);
	}

	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		setConstDate(offset + 50, $aprv_tm, value);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 51, $aprv_rsn);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 51, $aprv_rsn, value);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 52, $act_cont_fctr);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 52, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 52, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 52, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 52, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 52, $act_cont_fctr, value);
	}
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 53, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 53, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 54, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 54, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 55, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 55, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 56, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 56, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 57, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 57, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 58, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 58, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 59, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 59, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 60, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 60, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 61, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 61, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 61, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 61, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 61, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 61, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 62, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 62, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 63, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 63, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 64, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 64, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 65, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 65, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 66, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 66, $upd_srv_req_no, value);
	}

	/**
	 * ＬＩＭＳＦＬＧ. LIMS flg..<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 67, $lims_flg);
	}

	/**
	 * ＬＩＭＳＦＬＧ. LIMS flg..<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 67, $lims_flg, value);
	}

	public String getString(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			return insp_lst_no();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			return insp_lst_prnt_tm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
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
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			return col_schd_flg();
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			return insp_lst_prnt_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			return insp_lst_no();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			return insp_lst_prnt_tm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
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
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			return col_schd_flg();
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			return insp_lst_prnt_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			insp_lst_no(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			insp_lst_prnt_tm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			aprv_tm(value);
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
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			col_schd_flg(value);
			return;
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			insp_lst_prnt_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			insp_lst_no(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			insp_lst_prnt_tm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			aprv_tm(value);
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
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			col_schd_flg(value);
			return;
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			insp_lst_prnt_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
