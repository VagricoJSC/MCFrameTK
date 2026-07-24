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
 * "検査実績受信ＩＦ // Inspection result import IF"DBコンテナRowクラスです。<p>
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
 *  	<td>ext_data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システムデータＮＯ</td>
 *  	<td>External system data No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_data_lno</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システムデータ行ＮＯ</td>
 *  	<td>External system data row No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_make_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信元レコード作成日時</td>
 *  	<td>Creation date and time of source record</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取込対象ＦＬＧ</td>
 *  	<td>To import flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>recv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受信日</td>
 *  	<td>Receiving date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
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
 *  	<td>insp_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査予定ＮＯ</td>
 *  	<td>Inspection schedule No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>st_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査開始日時</td>
 *  	<td>Inspection start date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>end_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査終了日時</td>
 *  	<td>Inspection finish date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実施担当者ＣＤ</td>
 *  	<td>Implementation PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_act_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ実施担当者ＣＤ</td>
 *  	<td>IF PIC of implement cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_act_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ実施担当者名</td>
 *  	<td>IF PIC of implement name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実施担当部門ＣＤ</td>
 *  	<td>Implementation dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_act_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ実施担当部門ＣＤ</td>
 *  	<td>IF implementation dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_act_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ実施担当部門名</td>
 *  	<td>IF implementation dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>smpl_quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>良品区分（抜取）</td>
 *  	<td>Conforming type (Sampling)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>smpl_gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付ＣＤ（抜取）</td>
 *  	<td>Grading cd. (Sampling)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_smpl_gd_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格付ＣＤ（抜取）</td>
 *  	<td>IF grading cd. (Sampling)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_smpl_gd_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格付名（抜取）</td>
 *  	<td>IF grading name (Sampling)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>smpl_dfct_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>不良理由ＣＤ（抜取）</td>
 *  	<td>Defective reason cd. (Sampling)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_smpl_dfct_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ不良理由ＣＤ（抜取）</td>
 *  	<td>IF defective reason cd. (Sampling)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_smpl_dfct_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ不良理由名（抜取）</td>
 *  	<td>IF defective reason name (Sampling)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cont_fctr</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際有効成分係数</td>
 *  	<td>Actual active ingredient coefficient</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>vld_dt_upd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>有効期限更新ＦＬＧ</td>
 *  	<td>Expiration date update flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lmt_dt_frm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>起算日</td>
 *  	<td>Base date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>vld_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効期限</td>
 *  	<td>Expiration date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lmt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>使用期限</td>
 *  	<td>Usage expiration date</td>
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
 *  	<td>lot_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット備考</td>
 *  	<td>Lot remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imp_only_judg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>判定のみ取込ＦＬＧ</td>
 *  	<td>Import decision only flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_judg_rslt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査判定結果区分</td>
 *  	<td>Inspection decision result type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>judg_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定日</td>
 *  	<td>Decision date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>judg_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定者ＣＤ</td>
 *  	<td>Decision PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_judg_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ判定者ＣＤ</td>
 *  	<td>IF decision PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_judg_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ判定者名</td>
 *  	<td>IF decision PIC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>judg_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定部門ＣＤ</td>
 *  	<td>Decision dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_judg_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ判定部門ＣＤ</td>
 *  	<td>IF decision dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_judg_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ判定部門名</td>
 *  	<td>IF decision dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>judg_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定理由</td>
 *  	<td>Decision reason</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_insp_act_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部検査実績ＮＯ</td>
 *  	<td>External inspection result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫場所ＣＤ</td>
 *  	<td>Inventory location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_stk_loc_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ在庫場所ＣＤ</td>
 *  	<td>IF inventory location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_stk_loc_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ在庫場所名</td>
 *  	<td>IF inventory location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫棚・ラインＣＤ</td>
 *  	<td>Inventory rack/line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_stk_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ在庫棚・ラインＣＤ</td>
 *  	<td>IF inventory rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_stk_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ在庫棚・ライン名</td>
 *  	<td>IF inventory rack/line name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ttl_quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>良品区分（全数）</td>
 *  	<td>Conforming type (100%)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ttl_gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付ＣＤ（全数）</td>
 *  	<td>Grading cd. (100%)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_ttl_gd_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格付ＣＤ（全数）</td>
 *  	<td>IF grading cd. (100%)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_ttl_gd_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格付名（全数）</td>
 *  	<td>IF grading name (100%)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ttl_dfct_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>不良理由ＣＤ（全数）</td>
 *  	<td>Defective reason cd. (100%)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_ttl_dfct_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ不良理由ＣＤ（全数）</td>
 *  	<td>IF defective reason cd. (100%)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_ttl_dfct_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ不良理由名（全数）</td>
 *  	<td>IF defective reason name (100%)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ttl_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績日時（全数）</td>
 *  	<td>Actual date and time (100%)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準ＦＬＧ</td>
 *  	<td>Base flg.</td>
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
 *  	<td>if_pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ荷姿単位ＣＤ</td>
 *  	<td>IF SKU cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pack_unit_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ荷姿単位名</td>
 *  	<td>IF SKU name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ttl_pack_xfr_pack_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿振替荷姿単位数量（全数）</td>
 *  	<td>SKU transfer SKU qty. (100%)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ttl_pack_xfr_pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿振替荷姿単位ＣＤ（全数）</td>
 *  	<td>SKU transfer SKU cd. (100%)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_ttl_pack_xfr_pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ荷姿振替荷姿単位ＣＤ（全数）</td>
 *  	<td>IF SKU transfer SKU cd. (100%)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_ttl_pack_xfr_pack_unit_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ荷姿振替荷姿単位名（全数）</td>
 *  	<td>IF SKU transfer SKU name (100%)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ttl_intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考（全数）</td>
 *  	<td>Internal remarks (100%)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_insp_act_d_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部検査実績明細ＮＯ</td>
 *  	<td>External inspection result details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>so_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引落数量</td>
 *  	<td>Deducted qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>smpl_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>抜取数量</td>
 *  	<td>Sampling qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>smpl_pack_xfr_pack_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿振替荷姿単位数量（抜取）</td>
 *  	<td>SKU transfer SKU qty. (Sampling)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>smpl_pack_xfr_pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿振替荷姿単位ＣＤ（抜取）</td>
 *  	<td>SKU transfer SKU cd. (Sampling)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_smpl_pack_xfr_pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ荷姿振替荷姿単位ＣＤ（抜取）</td>
 *  	<td>IF SKU transfer SKU cd. (Sampling)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_smpl_pack_xfr_pack_unit_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ荷姿振替荷姿単位名（抜取）</td>
 *  	<td>IF SKU transfer SKU name (Sampling)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>smpl_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績日時（抜取）</td>
 *  	<td>Actual date and time (Sampling)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担部門ＣＤ</td>
 *  	<td>Charged dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_bd_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ負担部門ＣＤ</td>
 *  	<td>IF charged dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_bd_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ負担部門名</td>
 *  	<td>IF charged dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引備考</td>
 *  	<td>Transaction remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>smpl_intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考（抜取）</td>
 *  	<td>Internal remarks (Sampling)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_insp_smpl_act_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部検査抜取実績ＮＯ</td>
 *  	<td>External inspection sampling result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_co_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ会社ＣＤ</td>
 *  	<td>IF company cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_co_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ会社名</td>
 *  	<td>IF company name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>req_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サーバリクエストＮＯ</td>
 *  	<td>Server request No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１</td>
 *  	<td>Spare CHAR column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２</td>
 *  	<td>Spare CHAR column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３</td>
 *  	<td>Spare CHAR column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目４</td>
 *  	<td>Spare CHAR column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目５</td>
 *  	<td>Spare CHAR column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目６</td>
 *  	<td>Spare CHAR column 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目７</td>
 *  	<td>Spare CHAR column 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目８</td>
 *  	<td>Spare CHAR column 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目９</td>
 *  	<td>Spare CHAR column 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１０</td>
 *  	<td>Spare CHAR column 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１１</td>
 *  	<td>Spare CHAR column 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１２</td>
 *  	<td>Spare CHAR column 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１３</td>
 *  	<td>Spare CHAR column 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１４</td>
 *  	<td>Spare CHAR column 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１５</td>
 *  	<td>Spare CHAR column 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１６</td>
 *  	<td>Spare CHAR column 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１７</td>
 *  	<td>Spare CHAR column 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１８</td>
 *  	<td>Spare CHAR column 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１９</td>
 *  	<td>Spare CHAR column 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２０</td>
 *  	<td>Spare CHAR column 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２１</td>
 *  	<td>Spare CHAR column 21</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２２</td>
 *  	<td>Spare CHAR column 22</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２３</td>
 *  	<td>Spare CHAR column 23</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２４</td>
 *  	<td>Spare CHAR column 24</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２５</td>
 *  	<td>Spare CHAR column 25</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２６</td>
 *  	<td>Spare CHAR column 26</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２７</td>
 *  	<td>Spare CHAR column 27</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２８</td>
 *  	<td>Spare CHAR column 28</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２９</td>
 *  	<td>Spare CHAR column 29</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３０</td>
 *  	<td>Spare CHAR column 30</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目１</td>
 *  	<td>Spare NUM column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目２</td>
 *  	<td>Spare NUM column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目３</td>
 *  	<td>Spare NUM column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目４</td>
 *  	<td>Spare NUM column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目５</td>
 *  	<td>Spare NUM column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目１</td>
 *  	<td>Spare DATE column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目２</td>
 *  	<td>Spare DATE column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目３</td>
 *  	<td>Spare DATE column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目４</td>
 *  	<td>Spare DATE column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目５</td>
 *  	<td>Spare DATE column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログＮＯ</td>
 *  	<td>Log No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>log_sub_key1</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー１</td>
 *  	<td>Log sub key 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>log_sub_key2</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー２</td>
 *  	<td>Log sub key 2</td>
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
 *  	<td>sdrv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td>SDRV.SDRV_STS_TYP</td>
 *  	<td>送受信状況区分</td>
 *  	<td>Exporting and importing status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫場所名</td>
 *  	<td>Inventory location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実施担当者名</td>
 *  	<td>Implementation PC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実施担当部門名</td>
 *  	<td>Implementation dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>judg_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定者名</td>
 *  	<td>Decision PIC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>judg_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定部門名</td>
 *  	<td>Decision dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>smpl_pack_xfr_pack_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿振替荷姿単位名（抜取）</td>
 *  	<td>SKU transfer SKU name (Sampling)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>smpl_gd_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付名（抜取）</td>
 *  	<td>Grading name (Sampling)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>smpl_dfct_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>不良理由名（抜取）</td>
 *  	<td>Defective reason name (Sampling)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫棚・ライン名</td>
 *  	<td>Inventory rack/line name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担部門名</td>
 *  	<td>Charged dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ttl_gd_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付名（全数）</td>
 *  	<td>Grading name (100%)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ttl_dfct_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>不良理由名（全数）</td>
 *  	<td>Defective reason name (100%)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pack_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位名</td>
 *  	<td>SKU name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ttl_pack_xfr_pack_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿振替荷姿単位名（全数）</td>
 *  	<td>SKU transfer SKU name (100%)</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_INSP_ACT_RECV_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_INSP_ACT_RECV_IF";

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
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public static final String $ext_data_no = "ext_data_no";
	private static final MCPermColumnInfo _ext_data_no = createColumnInfo("ext_data_no");
	public final MCNumberPermColumn ext_data_no = createNumberColumn(_ext_data_no);
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public static final String $ext_data_lno = "ext_data_lno";
	private static final MCPermColumnInfo _ext_data_lno = createColumnInfo("ext_data_lno");
	public final MCNumberPermColumn ext_data_lno = createNumberColumn(_ext_data_lno);
	
	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	private static final MCPermColumnInfo _data_make_dt = createColumnInfo("data_make_dt");
	public final MCDatePermColumn data_make_dt = createDateColumn(_data_make_dt);
	
	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public static final String $imp_flg = "imp_flg";
	private static final MCPermColumnInfo _imp_flg = createColumnInfo("imp_flg");
	public final MCBooleanPermColumn imp_flg = createBooleanColumn(_imp_flg);
	
	/**
	 * 受信日. Receiving date.<p>
	 *
	 */
	public static final String $recv_dt = "recv_dt";
	private static final MCPermColumnInfo _recv_dt = createColumnInfo("recv_dt");
	public final MCDatePermColumn recv_dt = createDateColumn(_recv_dt);
	
	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	private static final MCPermColumnInfo _insp_no = createColumnInfo("insp_no");
	public final MCStringPermColumn insp_no = createStringColumn(_insp_no);
	
	/**
	 * 検査予定ＮＯ. Inspection schedule No..<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	private static final MCPermColumnInfo _insp_schd_no = createColumnInfo("insp_schd_no");
	public final MCStringPermColumn insp_schd_no = createStringColumn(_insp_schd_no);
	
	/**
	 * 検査開始日時. Inspection start date and time.<p>
	 *
	 */
	public static final String $st_act_tm = "st_act_tm";
	private static final MCPermColumnInfo _st_act_tm = createColumnInfo("st_act_tm");
	public final MCDatePermColumn st_act_tm = createDateColumn(_st_act_tm);
	
	/**
	 * 検査終了日時. Inspection finish date and time.<p>
	 *
	 */
	public static final String $end_act_tm = "end_act_tm";
	private static final MCPermColumnInfo _end_act_tm = createColumnInfo("end_act_tm");
	public final MCDatePermColumn end_act_tm = createDateColumn(_end_act_tm);
	
	/**
	 * 実施担当者ＣＤ. Implementation PIC cd..<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	private static final MCPermColumnInfo _act_usr_cd = createColumnInfo("act_usr_cd");
	public final MCStringPermColumn act_usr_cd = createStringColumn(_act_usr_cd);
	
	/**
	 * ＩＦ実施担当者ＣＤ. IF PIC of implement cd..<p>
	 *
	 */
	public static final String $if_act_usr_cd = "if_act_usr_cd";
	private static final MCPermColumnInfo _if_act_usr_cd = createColumnInfo("if_act_usr_cd");
	public final MCStringPermColumn if_act_usr_cd = createStringColumn(_if_act_usr_cd);
	
	/**
	 * ＩＦ実施担当者名. IF PIC of implement name.<p>
	 *
	 */
	public static final String $if_act_usr_nm = "if_act_usr_nm";
	private static final MCPermColumnInfo _if_act_usr_nm = createColumnInfo("if_act_usr_nm");
	public final MCStringPermColumn if_act_usr_nm = createStringColumn(_if_act_usr_nm);
	
	/**
	 * 実施担当部門ＣＤ. Implementation dept. cd..<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	private static final MCPermColumnInfo _act_dpt_cd = createColumnInfo("act_dpt_cd");
	public final MCStringPermColumn act_dpt_cd = createStringColumn(_act_dpt_cd);
	
	/**
	 * ＩＦ実施担当部門ＣＤ. IF implementation dept. cd..<p>
	 *
	 */
	public static final String $if_act_dpt_cd = "if_act_dpt_cd";
	private static final MCPermColumnInfo _if_act_dpt_cd = createColumnInfo("if_act_dpt_cd");
	public final MCStringPermColumn if_act_dpt_cd = createStringColumn(_if_act_dpt_cd);
	
	/**
	 * ＩＦ実施担当部門名. IF implementation dept. name.<p>
	 *
	 */
	public static final String $if_act_dpt_nm = "if_act_dpt_nm";
	private static final MCPermColumnInfo _if_act_dpt_nm = createColumnInfo("if_act_dpt_nm");
	public final MCStringPermColumn if_act_dpt_nm = createStringColumn(_if_act_dpt_nm);
	
	/**
	 * 良品区分（抜取）. Conforming type (Sampling).<p>
	 *
	 */
	public static final String $smpl_quality_typ = "smpl_quality_typ";
	private static final MCPermColumnInfo _smpl_quality_typ = createColumnInfo("smpl_quality_typ");
	public final MCStringPermColumn smpl_quality_typ = createStringColumn(_smpl_quality_typ);
	
	/**
	 * 格付ＣＤ（抜取）. Grading cd. (Sampling).<p>
	 *
	 */
	public static final String $smpl_gd_cd = "smpl_gd_cd";
	private static final MCPermColumnInfo _smpl_gd_cd = createColumnInfo("smpl_gd_cd");
	public final MCStringPermColumn smpl_gd_cd = createStringColumn(_smpl_gd_cd);
	
	/**
	 * ＩＦ格付ＣＤ（抜取）. IF grading cd. (Sampling).<p>
	 *
	 */
	public static final String $if_smpl_gd_cd = "if_smpl_gd_cd";
	private static final MCPermColumnInfo _if_smpl_gd_cd = createColumnInfo("if_smpl_gd_cd");
	public final MCStringPermColumn if_smpl_gd_cd = createStringColumn(_if_smpl_gd_cd);
	
	/**
	 * ＩＦ格付名（抜取）. IF grading name (Sampling).<p>
	 *
	 */
	public static final String $if_smpl_gd_nm = "if_smpl_gd_nm";
	private static final MCPermColumnInfo _if_smpl_gd_nm = createColumnInfo("if_smpl_gd_nm");
	public final MCStringPermColumn if_smpl_gd_nm = createStringColumn(_if_smpl_gd_nm);
	
	/**
	 * 不良理由ＣＤ（抜取）. Defective reason cd. (Sampling).<p>
	 *
	 */
	public static final String $smpl_dfct_rsn_cd = "smpl_dfct_rsn_cd";
	private static final MCPermColumnInfo _smpl_dfct_rsn_cd = createColumnInfo("smpl_dfct_rsn_cd");
	public final MCStringPermColumn smpl_dfct_rsn_cd = createStringColumn(_smpl_dfct_rsn_cd);
	
	/**
	 * ＩＦ不良理由ＣＤ（抜取）. IF defective reason cd. (Sampling).<p>
	 *
	 */
	public static final String $if_smpl_dfct_rsn_cd = "if_smpl_dfct_rsn_cd";
	private static final MCPermColumnInfo _if_smpl_dfct_rsn_cd = createColumnInfo("if_smpl_dfct_rsn_cd");
	public final MCStringPermColumn if_smpl_dfct_rsn_cd = createStringColumn(_if_smpl_dfct_rsn_cd);
	
	/**
	 * ＩＦ不良理由名（抜取）. IF defective reason name (Sampling).<p>
	 *
	 */
	public static final String $if_smpl_dfct_rsn_nm = "if_smpl_dfct_rsn_nm";
	private static final MCPermColumnInfo _if_smpl_dfct_rsn_nm = createColumnInfo("if_smpl_dfct_rsn_nm");
	public final MCStringPermColumn if_smpl_dfct_rsn_nm = createStringColumn(_if_smpl_dfct_rsn_nm);
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	private static final MCPermColumnInfo _act_cont_fctr = createColumnInfo("act_cont_fctr");
	public final MCNumberPermColumn act_cont_fctr = createNumberColumn(_act_cont_fctr);
	
	/**
	 * 有効期限更新ＦＬＧ. Expiration date update flg..<p>
	 *
	 */
	public static final String $vld_dt_upd_flg = "vld_dt_upd_flg";
	private static final MCPermColumnInfo _vld_dt_upd_flg = createColumnInfo("vld_dt_upd_flg");
	public final MCBooleanPermColumn vld_dt_upd_flg = createBooleanColumn(_vld_dt_upd_flg);
	
	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public static final String $lmt_dt_frm = "lmt_dt_frm";
	private static final MCPermColumnInfo _lmt_dt_frm = createColumnInfo("lmt_dt_frm");
	public final MCDatePermColumn lmt_dt_frm = createDateColumn(_lmt_dt_frm);
	
	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	private static final MCPermColumnInfo _vld_dt = createColumnInfo("vld_dt");
	public final MCDatePermColumn vld_dt = createDateColumn(_vld_dt);
	
	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	private static final MCPermColumnInfo _lmt_dt = createColumnInfo("lmt_dt");
	public final MCDatePermColumn lmt_dt = createDateColumn(_lmt_dt);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * ロット備考. Lot remarks.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	private static final MCPermColumnInfo _lot_rmrks = createColumnInfo("lot_rmrks");
	public final MCStringPermColumn lot_rmrks = createStringColumn(_lot_rmrks);
	
	/**
	 * 判定のみ取込ＦＬＧ. Import decision only flg..<p>
	 *
	 */
	public static final String $imp_only_judg = "imp_only_judg";
	private static final MCPermColumnInfo _imp_only_judg = createColumnInfo("imp_only_judg");
	public final MCBooleanPermColumn imp_only_judg = createBooleanColumn(_imp_only_judg);
	
	/**
	 * 検査判定結果区分. Inspection decision result type.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ = "insp_judg_rslt_typ";
	private static final MCPermColumnInfo _insp_judg_rslt_typ = createColumnInfo("insp_judg_rslt_typ");
	public final MCStringPermColumn insp_judg_rslt_typ = createStringColumn(_insp_judg_rslt_typ);
	
	/**
	 * 判定日. Decision date.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	private static final MCPermColumnInfo _judg_dt = createColumnInfo("judg_dt");
	public final MCDatePermColumn judg_dt = createDateColumn(_judg_dt);
	
	/**
	 * 判定者ＣＤ. Decision PIC cd..<p>
	 *
	 */
	public static final String $judg_usr_cd = "judg_usr_cd";
	private static final MCPermColumnInfo _judg_usr_cd = createColumnInfo("judg_usr_cd");
	public final MCStringPermColumn judg_usr_cd = createStringColumn(_judg_usr_cd);
	
	/**
	 * ＩＦ判定者ＣＤ. IF decision PIC cd..<p>
	 *
	 */
	public static final String $if_judg_usr_cd = "if_judg_usr_cd";
	private static final MCPermColumnInfo _if_judg_usr_cd = createColumnInfo("if_judg_usr_cd");
	public final MCStringPermColumn if_judg_usr_cd = createStringColumn(_if_judg_usr_cd);
	
	/**
	 * ＩＦ判定者名. IF decision PIC name.<p>
	 *
	 */
	public static final String $if_judg_usr_nm = "if_judg_usr_nm";
	private static final MCPermColumnInfo _if_judg_usr_nm = createColumnInfo("if_judg_usr_nm");
	public final MCStringPermColumn if_judg_usr_nm = createStringColumn(_if_judg_usr_nm);
	
	/**
	 * 判定部門ＣＤ. Decision dept. cd..<p>
	 *
	 */
	public static final String $judg_dpt_cd = "judg_dpt_cd";
	private static final MCPermColumnInfo _judg_dpt_cd = createColumnInfo("judg_dpt_cd");
	public final MCStringPermColumn judg_dpt_cd = createStringColumn(_judg_dpt_cd);
	
	/**
	 * ＩＦ判定部門ＣＤ. IF decision dept. cd..<p>
	 *
	 */
	public static final String $if_judg_dpt_cd = "if_judg_dpt_cd";
	private static final MCPermColumnInfo _if_judg_dpt_cd = createColumnInfo("if_judg_dpt_cd");
	public final MCStringPermColumn if_judg_dpt_cd = createStringColumn(_if_judg_dpt_cd);
	
	/**
	 * ＩＦ判定部門名. IF decision dept. name.<p>
	 *
	 */
	public static final String $if_judg_dpt_nm = "if_judg_dpt_nm";
	private static final MCPermColumnInfo _if_judg_dpt_nm = createColumnInfo("if_judg_dpt_nm");
	public final MCStringPermColumn if_judg_dpt_nm = createStringColumn(_if_judg_dpt_nm);
	
	/**
	 * 判定理由. Decision reason.<p>
	 *
	 */
	public static final String $judg_rsn = "judg_rsn";
	private static final MCPermColumnInfo _judg_rsn = createColumnInfo("judg_rsn");
	public final MCStringPermColumn judg_rsn = createStringColumn(_judg_rsn);
	
	/**
	 * 外部検査実績ＮＯ. External inspection result No..<p>
	 *
	 */
	public static final String $ext_insp_act_no = "ext_insp_act_no";
	private static final MCPermColumnInfo _ext_insp_act_no = createColumnInfo("ext_insp_act_no");
	public final MCStringPermColumn ext_insp_act_no = createStringColumn(_ext_insp_act_no);
	
	/**
	 * 在庫場所ＣＤ. Inventory location cd..<p>
	 *
	 */
	public static final String $stk_loc_cd = "stk_loc_cd";
	private static final MCPermColumnInfo _stk_loc_cd = createColumnInfo("stk_loc_cd");
	public final MCStringPermColumn stk_loc_cd = createStringColumn(_stk_loc_cd);
	
	/**
	 * ＩＦ在庫場所ＣＤ. IF inventory location cd..<p>
	 *
	 */
	public static final String $if_stk_loc_cd = "if_stk_loc_cd";
	private static final MCPermColumnInfo _if_stk_loc_cd = createColumnInfo("if_stk_loc_cd");
	public final MCStringPermColumn if_stk_loc_cd = createStringColumn(_if_stk_loc_cd);
	
	/**
	 * ＩＦ在庫場所名. IF inventory location name.<p>
	 *
	 */
	public static final String $if_stk_loc_nm = "if_stk_loc_nm";
	private static final MCPermColumnInfo _if_stk_loc_nm = createColumnInfo("if_stk_loc_nm");
	public final MCStringPermColumn if_stk_loc_nm = createStringColumn(_if_stk_loc_nm);
	
	/**
	 * 在庫棚・ラインＣＤ. Inventory rack/line cd..<p>
	 *
	 */
	public static final String $stk_str_ln_cd = "stk_str_ln_cd";
	private static final MCPermColumnInfo _stk_str_ln_cd = createColumnInfo("stk_str_ln_cd");
	public final MCStringPermColumn stk_str_ln_cd = createStringColumn(_stk_str_ln_cd);
	
	/**
	 * ＩＦ在庫棚・ラインＣＤ. IF inventory rack/line cd..<p>
	 *
	 */
	public static final String $if_stk_str_ln_cd = "if_stk_str_ln_cd";
	private static final MCPermColumnInfo _if_stk_str_ln_cd = createColumnInfo("if_stk_str_ln_cd");
	public final MCStringPermColumn if_stk_str_ln_cd = createStringColumn(_if_stk_str_ln_cd);
	
	/**
	 * ＩＦ在庫棚・ライン名. IF inventory rack/line name.<p>
	 *
	 */
	public static final String $if_stk_str_ln_nm = "if_stk_str_ln_nm";
	private static final MCPermColumnInfo _if_stk_str_ln_nm = createColumnInfo("if_stk_str_ln_nm");
	public final MCStringPermColumn if_stk_str_ln_nm = createStringColumn(_if_stk_str_ln_nm);
	
	/**
	 * 良品区分（全数）. Conforming type (100%).<p>
	 *
	 */
	public static final String $ttl_quality_typ = "ttl_quality_typ";
	private static final MCPermColumnInfo _ttl_quality_typ = createColumnInfo("ttl_quality_typ");
	public final MCStringPermColumn ttl_quality_typ = createStringColumn(_ttl_quality_typ);
	
	/**
	 * 格付ＣＤ（全数）. Grading cd. (100%).<p>
	 *
	 */
	public static final String $ttl_gd_cd = "ttl_gd_cd";
	private static final MCPermColumnInfo _ttl_gd_cd = createColumnInfo("ttl_gd_cd");
	public final MCStringPermColumn ttl_gd_cd = createStringColumn(_ttl_gd_cd);
	
	/**
	 * ＩＦ格付ＣＤ（全数）. IF grading cd. (100%).<p>
	 *
	 */
	public static final String $if_ttl_gd_cd = "if_ttl_gd_cd";
	private static final MCPermColumnInfo _if_ttl_gd_cd = createColumnInfo("if_ttl_gd_cd");
	public final MCStringPermColumn if_ttl_gd_cd = createStringColumn(_if_ttl_gd_cd);
	
	/**
	 * ＩＦ格付名（全数）. IF grading name (100%).<p>
	 *
	 */
	public static final String $if_ttl_gd_nm = "if_ttl_gd_nm";
	private static final MCPermColumnInfo _if_ttl_gd_nm = createColumnInfo("if_ttl_gd_nm");
	public final MCStringPermColumn if_ttl_gd_nm = createStringColumn(_if_ttl_gd_nm);
	
	/**
	 * 不良理由ＣＤ（全数）. Defective reason cd. (100%).<p>
	 *
	 */
	public static final String $ttl_dfct_rsn_cd = "ttl_dfct_rsn_cd";
	private static final MCPermColumnInfo _ttl_dfct_rsn_cd = createColumnInfo("ttl_dfct_rsn_cd");
	public final MCStringPermColumn ttl_dfct_rsn_cd = createStringColumn(_ttl_dfct_rsn_cd);
	
	/**
	 * ＩＦ不良理由ＣＤ（全数）. IF defective reason cd. (100%).<p>
	 *
	 */
	public static final String $if_ttl_dfct_rsn_cd = "if_ttl_dfct_rsn_cd";
	private static final MCPermColumnInfo _if_ttl_dfct_rsn_cd = createColumnInfo("if_ttl_dfct_rsn_cd");
	public final MCStringPermColumn if_ttl_dfct_rsn_cd = createStringColumn(_if_ttl_dfct_rsn_cd);
	
	/**
	 * ＩＦ不良理由名（全数）. IF defective reason name (100%).<p>
	 *
	 */
	public static final String $if_ttl_dfct_rsn_nm = "if_ttl_dfct_rsn_nm";
	private static final MCPermColumnInfo _if_ttl_dfct_rsn_nm = createColumnInfo("if_ttl_dfct_rsn_nm");
	public final MCStringPermColumn if_ttl_dfct_rsn_nm = createStringColumn(_if_ttl_dfct_rsn_nm);
	
	/**
	 * 実績日時（全数）. Actual date and time (100%).<p>
	 *
	 */
	public static final String $ttl_act_tm = "ttl_act_tm";
	private static final MCPermColumnInfo _ttl_act_tm = createColumnInfo("ttl_act_tm");
	public final MCDatePermColumn ttl_act_tm = createDateColumn(_ttl_act_tm);
	
	/**
	 * 基準ＦＬＧ. Base flg..<p>
	 *
	 */
	public static final String $base_flg = "base_flg";
	private static final MCPermColumnInfo _base_flg = createColumnInfo("base_flg");
	public final MCBooleanPermColumn base_flg = createBooleanColumn(_base_flg);
	
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
	 * ＩＦ荷姿単位ＣＤ. IF SKU cd..<p>
	 *
	 */
	public static final String $if_pack_unit_cd = "if_pack_unit_cd";
	private static final MCPermColumnInfo _if_pack_unit_cd = createColumnInfo("if_pack_unit_cd");
	public final MCStringPermColumn if_pack_unit_cd = createStringColumn(_if_pack_unit_cd);
	
	/**
	 * ＩＦ荷姿単位名. IF SKU name.<p>
	 *
	 */
	public static final String $if_pack_unit_nm = "if_pack_unit_nm";
	private static final MCPermColumnInfo _if_pack_unit_nm = createColumnInfo("if_pack_unit_nm");
	public final MCStringPermColumn if_pack_unit_nm = createStringColumn(_if_pack_unit_nm);
	
	/**
	 * 荷姿振替荷姿単位数量（全数）. SKU transfer SKU qty. (100%).<p>
	 *
	 */
	public static final String $ttl_pack_xfr_pack_unit_qty = "ttl_pack_xfr_pack_unit_qty";
	private static final MCPermColumnInfo _ttl_pack_xfr_pack_unit_qty = createColumnInfo("ttl_pack_xfr_pack_unit_qty");
	public final MCNumberPermColumn ttl_pack_xfr_pack_unit_qty = createNumberColumn(_ttl_pack_xfr_pack_unit_qty);
	
	/**
	 * 荷姿振替荷姿単位ＣＤ（全数）. SKU transfer SKU cd. (100%).<p>
	 *
	 */
	public static final String $ttl_pack_xfr_pack_unit_cd = "ttl_pack_xfr_pack_unit_cd";
	private static final MCPermColumnInfo _ttl_pack_xfr_pack_unit_cd = createColumnInfo("ttl_pack_xfr_pack_unit_cd");
	public final MCStringPermColumn ttl_pack_xfr_pack_unit_cd = createStringColumn(_ttl_pack_xfr_pack_unit_cd);
	
	/**
	 * ＩＦ荷姿振替荷姿単位ＣＤ（全数）. IF SKU transfer SKU cd. (100%).<p>
	 *
	 */
	public static final String $if_ttl_pack_xfr_pack_unit_cd = "if_ttl_pack_xfr_pack_unit_cd";
	private static final MCPermColumnInfo _if_ttl_pack_xfr_pack_unit_cd = createColumnInfo("if_ttl_pack_xfr_pack_unit_cd");
	public final MCStringPermColumn if_ttl_pack_xfr_pack_unit_cd = createStringColumn(_if_ttl_pack_xfr_pack_unit_cd);
	
	/**
	 * ＩＦ荷姿振替荷姿単位名（全数）. IF SKU transfer SKU name (100%).<p>
	 *
	 */
	public static final String $if_ttl_pack_xfr_pack_unit_nm = "if_ttl_pack_xfr_pack_unit_nm";
	private static final MCPermColumnInfo _if_ttl_pack_xfr_pack_unit_nm = createColumnInfo("if_ttl_pack_xfr_pack_unit_nm");
	public final MCStringPermColumn if_ttl_pack_xfr_pack_unit_nm = createStringColumn(_if_ttl_pack_xfr_pack_unit_nm);
	
	/**
	 * 内部備考（全数）. Internal remarks (100%).<p>
	 *
	 */
	public static final String $ttl_intr_rmrks = "ttl_intr_rmrks";
	private static final MCPermColumnInfo _ttl_intr_rmrks = createColumnInfo("ttl_intr_rmrks");
	public final MCStringPermColumn ttl_intr_rmrks = createStringColumn(_ttl_intr_rmrks);
	
	/**
	 * 外部検査実績明細ＮＯ. External inspection result details No..<p>
	 *
	 */
	public static final String $ext_insp_act_d_no = "ext_insp_act_d_no";
	private static final MCPermColumnInfo _ext_insp_act_d_no = createColumnInfo("ext_insp_act_d_no");
	public final MCStringPermColumn ext_insp_act_d_no = createStringColumn(_ext_insp_act_d_no);
	
	/**
	 * 引落数量. Deducted qty..<p>
	 *
	 */
	public static final String $so_qty = "so_qty";
	private static final MCPermColumnInfo _so_qty = createColumnInfo("so_qty");
	public final MCNumberPermColumn so_qty = createNumberColumn(_so_qty);
	
	/**
	 * 抜取数量. Sampling qty..<p>
	 *
	 */
	public static final String $smpl_qty = "smpl_qty";
	private static final MCPermColumnInfo _smpl_qty = createColumnInfo("smpl_qty");
	public final MCNumberPermColumn smpl_qty = createNumberColumn(_smpl_qty);
	
	/**
	 * 荷姿振替荷姿単位数量（抜取）. SKU transfer SKU qty. (Sampling).<p>
	 *
	 */
	public static final String $smpl_pack_xfr_pack_unit_qty = "smpl_pack_xfr_pack_unit_qty";
	private static final MCPermColumnInfo _smpl_pack_xfr_pack_unit_qty = createColumnInfo("smpl_pack_xfr_pack_unit_qty");
	public final MCNumberPermColumn smpl_pack_xfr_pack_unit_qty = createNumberColumn(_smpl_pack_xfr_pack_unit_qty);
	
	/**
	 * 荷姿振替荷姿単位ＣＤ（抜取）. SKU transfer SKU cd. (Sampling).<p>
	 *
	 */
	public static final String $smpl_pack_xfr_pack_unit_cd = "smpl_pack_xfr_pack_unit_cd";
	private static final MCPermColumnInfo _smpl_pack_xfr_pack_unit_cd = createColumnInfo("smpl_pack_xfr_pack_unit_cd");
	public final MCStringPermColumn smpl_pack_xfr_pack_unit_cd = createStringColumn(_smpl_pack_xfr_pack_unit_cd);
	
	/**
	 * ＩＦ荷姿振替荷姿単位ＣＤ（抜取）. IF SKU transfer SKU cd. (Sampling).<p>
	 *
	 */
	public static final String $if_smpl_pack_xfr_pack_unit_cd = "if_smpl_pack_xfr_pack_unit_cd";
	private static final MCPermColumnInfo _if_smpl_pack_xfr_pack_unit_cd = createColumnInfo("if_smpl_pack_xfr_pack_unit_cd");
	public final MCStringPermColumn if_smpl_pack_xfr_pack_unit_cd = createStringColumn(_if_smpl_pack_xfr_pack_unit_cd);
	
	/**
	 * ＩＦ荷姿振替荷姿単位名（抜取）. IF SKU transfer SKU name (Sampling).<p>
	 *
	 */
	public static final String $if_smpl_pack_xfr_pack_unit_nm = "if_smpl_pack_xfr_pack_unit_nm";
	private static final MCPermColumnInfo _if_smpl_pack_xfr_pack_unit_nm = createColumnInfo("if_smpl_pack_xfr_pack_unit_nm");
	public final MCStringPermColumn if_smpl_pack_xfr_pack_unit_nm = createStringColumn(_if_smpl_pack_xfr_pack_unit_nm);
	
	/**
	 * 実績日時（抜取）. Actual date and time (Sampling).<p>
	 *
	 */
	public static final String $smpl_act_tm = "smpl_act_tm";
	private static final MCPermColumnInfo _smpl_act_tm = createColumnInfo("smpl_act_tm");
	public final MCDatePermColumn smpl_act_tm = createDateColumn(_smpl_act_tm);
	
	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	private static final MCPermColumnInfo _bd_dpt_cd = createColumnInfo("bd_dpt_cd");
	public final MCStringPermColumn bd_dpt_cd = createStringColumn(_bd_dpt_cd);
	
	/**
	 * ＩＦ負担部門ＣＤ. IF charged dept. cd..<p>
	 *
	 */
	public static final String $if_bd_dpt_cd = "if_bd_dpt_cd";
	private static final MCPermColumnInfo _if_bd_dpt_cd = createColumnInfo("if_bd_dpt_cd");
	public final MCStringPermColumn if_bd_dpt_cd = createStringColumn(_if_bd_dpt_cd);
	
	/**
	 * ＩＦ負担部門名. IF charged dept. name.<p>
	 *
	 */
	public static final String $if_bd_dpt_nm = "if_bd_dpt_nm";
	private static final MCPermColumnInfo _if_bd_dpt_nm = createColumnInfo("if_bd_dpt_nm");
	public final MCStringPermColumn if_bd_dpt_nm = createStringColumn(_if_bd_dpt_nm);
	
	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	private static final MCPermColumnInfo _trd_rmrks = createColumnInfo("trd_rmrks");
	public final MCStringPermColumn trd_rmrks = createStringColumn(_trd_rmrks);
	
	/**
	 * 内部備考（抜取）. Internal remarks (Sampling).<p>
	 *
	 */
	public static final String $smpl_intr_rmrks = "smpl_intr_rmrks";
	private static final MCPermColumnInfo _smpl_intr_rmrks = createColumnInfo("smpl_intr_rmrks");
	public final MCStringPermColumn smpl_intr_rmrks = createStringColumn(_smpl_intr_rmrks);
	
	/**
	 * 外部検査抜取実績ＮＯ. External inspection sampling result No..<p>
	 *
	 */
	public static final String $ext_insp_smpl_act_no = "ext_insp_smpl_act_no";
	private static final MCPermColumnInfo _ext_insp_smpl_act_no = createColumnInfo("ext_insp_smpl_act_no");
	public final MCStringPermColumn ext_insp_smpl_act_no = createStringColumn(_ext_insp_smpl_act_no);
	
	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public static final String $if_co_cd = "if_co_cd";
	private static final MCPermColumnInfo _if_co_cd = createColumnInfo("if_co_cd");
	public final MCStringPermColumn if_co_cd = createStringColumn(_if_co_cd);
	
	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public static final String $if_co_nm = "if_co_nm";
	private static final MCPermColumnInfo _if_co_nm = createColumnInfo("if_co_nm");
	public final MCStringPermColumn if_co_nm = createStringColumn(_if_co_nm);
	
	/**
	 * サーバリクエストＮＯ. Server request No..<p>
	 *
	 */
	public static final String $req_no = "req_no";
	private static final MCPermColumnInfo _req_no = createColumnInfo("req_no");
	public final MCStringPermColumn req_no = createStringColumn(_req_no);
	
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
	 * 在庫場所名. Inventory location name.<p>
	 *
	 */
	public static final String $stk_loc_nm = "stk_loc_nm";
	
	/**
	 * 実施担当者名. Implementation PC name.<p>
	 *
	 */
	public static final String $act_usr_nm = "act_usr_nm";
	
	/**
	 * 実施担当部門名. Implementation dept. name.<p>
	 *
	 */
	public static final String $act_dpt_nm = "act_dpt_nm";
	
	/**
	 * 判定者名. Decision PIC name.<p>
	 *
	 */
	public static final String $judg_usr_nm = "judg_usr_nm";
	
	/**
	 * 判定部門名. Decision dept. name.<p>
	 *
	 */
	public static final String $judg_dpt_nm = "judg_dpt_nm";
	
	/**
	 * 荷姿振替荷姿単位名（抜取）. SKU transfer SKU name (Sampling).<p>
	 *
	 */
	public static final String $smpl_pack_xfr_pack_unit_nm = "smpl_pack_xfr_pack_unit_nm";
	
	/**
	 * 格付名（抜取）. Grading name (Sampling).<p>
	 *
	 */
	public static final String $smpl_gd_nm = "smpl_gd_nm";
	
	/**
	 * 不良理由名（抜取）. Defective reason name (Sampling).<p>
	 *
	 */
	public static final String $smpl_dfct_rsn_nm = "smpl_dfct_rsn_nm";
	
	/**
	 * 在庫棚・ライン名. Inventory rack/line name.<p>
	 *
	 */
	public static final String $stk_str_ln_nm = "stk_str_ln_nm";
	
	/**
	 * 負担部門名. Charged dept. name.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	
	/**
	 * 格付名（全数）. Grading name (100%).<p>
	 *
	 */
	public static final String $ttl_gd_nm = "ttl_gd_nm";
	
	/**
	 * 不良理由名（全数）. Defective reason name (100%).<p>
	 *
	 */
	public static final String $ttl_dfct_rsn_nm = "ttl_dfct_rsn_nm";
	
	/**
	 * 荷姿単位名. SKU name.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	
	/**
	 * 荷姿振替荷姿単位名（全数）. SKU transfer SKU name (100%).<p>
	 *
	 */
	public static final String $ttl_pack_xfr_pack_unit_nm = "ttl_pack_xfr_pack_unit_nm";
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_data_no_META = createCommonMeta($ext_data_no, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_NO);
	public static final MCMeta ext_data_lno_META = createCommonMeta($ext_data_lno, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_LNO);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta imp_flg_META = createCommonMeta($imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta recv_dt_META = createCommonMeta($recv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta st_act_tm_META = createCommonMeta($st_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_act_tm_META = createCommonMeta($end_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_act_usr_cd_META = createCommonMeta($if_act_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_act_usr_nm_META = createCommonMeta($if_act_usr_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_act_dpt_cd_META = createCommonMeta($if_act_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_act_dpt_nm_META = createCommonMeta($if_act_dpt_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta smpl_quality_typ_META = createCommonMeta($smpl_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta smpl_gd_cd_META = createCommonMeta($smpl_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta if_smpl_gd_cd_META = createCommonMeta($if_smpl_gd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_smpl_gd_nm_META = createCommonMeta($if_smpl_gd_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta smpl_dfct_rsn_cd_META = createCommonMeta($smpl_dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta if_smpl_dfct_rsn_cd_META = createCommonMeta($if_smpl_dfct_rsn_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_smpl_dfct_rsn_nm_META = createCommonMeta($if_smpl_dfct_rsn_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta vld_dt_upd_flg_META = createCommonMeta($vld_dt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_INST_INTR_RMRKS);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta imp_only_judg_META = createCommonMeta($imp_only_judg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_judg_rslt_typ_META = createCommonMeta($insp_judg_rslt_typ, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_usr_cd_META = createCommonMeta($judg_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_judg_usr_cd_META = createCommonMeta($if_judg_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_judg_usr_nm_META = createCommonMeta($if_judg_usr_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta judg_dpt_cd_META = createCommonMeta($judg_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_judg_dpt_cd_META = createCommonMeta($if_judg_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_judg_dpt_nm_META = createCommonMeta($if_judg_dpt_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta judg_rsn_META = createCommonMeta($judg_rsn, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSN);
	public static final MCMeta ext_insp_act_no_META = createCommonMeta($ext_insp_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_NO);
	public static final MCMeta stk_loc_cd_META = createCommonMeta($stk_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_stk_loc_cd_META = createCommonMeta($if_stk_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_stk_loc_nm_META = createCommonMeta($if_stk_loc_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta stk_str_ln_cd_META = createCommonMeta($stk_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta if_stk_str_ln_cd_META = createCommonMeta($if_stk_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_stk_str_ln_nm_META = createCommonMeta($if_stk_str_ln_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta ttl_quality_typ_META = createCommonMeta($ttl_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta ttl_gd_cd_META = createCommonMeta($ttl_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta if_ttl_gd_cd_META = createCommonMeta($if_ttl_gd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_ttl_gd_nm_META = createCommonMeta($if_ttl_gd_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta ttl_dfct_rsn_cd_META = createCommonMeta($ttl_dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta if_ttl_dfct_rsn_cd_META = createCommonMeta($if_ttl_dfct_rsn_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_ttl_dfct_rsn_nm_META = createCommonMeta($if_ttl_dfct_rsn_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta ttl_act_tm_META = createCommonMeta($ttl_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta base_flg_META = createCommonMeta($base_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_pack_unit_cd_META = createCommonMeta($if_pack_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pack_unit_nm_META = createCommonMeta($if_pack_unit_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta ttl_pack_xfr_pack_unit_qty_META = createCommonMeta($ttl_pack_xfr_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ttl_pack_xfr_pack_unit_cd_META = createCommonMeta($ttl_pack_xfr_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_ttl_pack_xfr_pack_unit_cd_META = createCommonMeta($if_ttl_pack_xfr_pack_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_ttl_pack_xfr_pack_unit_nm_META = createCommonMeta($if_ttl_pack_xfr_pack_unit_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta ttl_intr_rmrks_META = createCommonMeta($ttl_intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_INST_INTR_RMRKS);
	public static final MCMeta ext_insp_act_d_no_META = createCommonMeta($ext_insp_act_d_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_D_NO);
	public static final MCMeta so_qty_META = createCommonMeta($so_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_qty_META = createCommonMeta($smpl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_pack_xfr_pack_unit_qty_META = createCommonMeta($smpl_pack_xfr_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_pack_xfr_pack_unit_cd_META = createCommonMeta($smpl_pack_xfr_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_smpl_pack_xfr_pack_unit_cd_META = createCommonMeta($if_smpl_pack_xfr_pack_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_smpl_pack_xfr_pack_unit_nm_META = createCommonMeta($if_smpl_pack_xfr_pack_unit_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta smpl_act_tm_META = createCommonMeta($smpl_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_bd_dpt_cd_META = createCommonMeta($if_bd_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_bd_dpt_nm_META = createCommonMeta($if_bd_dpt_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_TRD_RMRKS);
	public static final MCMeta smpl_intr_rmrks_META = createCommonMeta($smpl_intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_INTR_RMRKS);
	public static final MCMeta ext_insp_smpl_act_no_META = createCommonMeta($ext_insp_smpl_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_SMPL_ACT_NO);
	public static final MCMeta if_co_cd_META = createCommonMeta($if_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_co_nm_META = createCommonMeta($if_co_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta req_no_META = createCommonMeta($req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
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
	public static final MCMeta stk_loc_nm_META = createCommonMeta($stk_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta judg_usr_nm_META = createCommonMeta($judg_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta judg_dpt_nm_META = createCommonMeta($judg_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta smpl_pack_xfr_pack_unit_nm_META = createCommonMeta($smpl_pack_xfr_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta smpl_gd_nm_META = createCommonMeta($smpl_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta smpl_dfct_rsn_nm_META = createCommonMeta($smpl_dfct_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta stk_str_ln_nm_META = createCommonMeta($stk_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ttl_gd_nm_META = createCommonMeta($ttl_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta ttl_dfct_rsn_nm_META = createCommonMeta($ttl_dfct_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta ttl_pack_xfr_pack_unit_nm_META = createCommonMeta($ttl_pack_xfr_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $SDRV = "SDRV";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"PFT_SDRV_IF",
				$SDRV,
				new String[][]{
						{"data_no", "data_no"}
				},
				() -> {
					return mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
				},
				(alias) -> {
					MST_INSP_ACT_RECV_IF_R own = MST_INSP_ACT_RECV_IF_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_INSP_ACT_RECV_IF_R> constMetas = new ConstMetaList<MST_INSP_ACT_RECV_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			ext_data_no_META,
			ext_data_lno_META,
			data_make_dt_META,
			imp_flg_META,
			recv_dt_META,
			insp_no_META,
			insp_schd_no_META,
			st_act_tm_META,
			end_act_tm_META,
			act_usr_cd_META,
			if_act_usr_cd_META,
			if_act_usr_nm_META,
			act_dpt_cd_META,
			if_act_dpt_cd_META,
			if_act_dpt_nm_META,
			smpl_quality_typ_META,
			smpl_gd_cd_META,
			if_smpl_gd_cd_META,
			if_smpl_gd_nm_META,
			smpl_dfct_rsn_cd_META,
			if_smpl_dfct_rsn_cd_META,
			if_smpl_dfct_rsn_nm_META,
			act_cont_fctr_META,
			vld_dt_upd_flg_META,
			lmt_dt_frm_META,
			vld_dt_META,
			lmt_dt_META,
			intr_rmrks_META,
			lot_rmrks_META,
			imp_only_judg_META,
			insp_judg_rslt_typ_META,
			judg_dt_META,
			judg_usr_cd_META,
			if_judg_usr_cd_META,
			if_judg_usr_nm_META,
			judg_dpt_cd_META,
			if_judg_dpt_cd_META,
			if_judg_dpt_nm_META,
			judg_rsn_META,
			ext_insp_act_no_META,
			stk_loc_cd_META,
			if_stk_loc_cd_META,
			if_stk_loc_nm_META,
			stk_str_ln_cd_META,
			if_stk_str_ln_cd_META,
			if_stk_str_ln_nm_META,
			ttl_quality_typ_META,
			ttl_gd_cd_META,
			if_ttl_gd_cd_META,
			if_ttl_gd_nm_META,
			ttl_dfct_rsn_cd_META,
			if_ttl_dfct_rsn_cd_META,
			if_ttl_dfct_rsn_nm_META,
			ttl_act_tm_META,
			base_flg_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			if_pack_unit_cd_META,
			if_pack_unit_nm_META,
			ttl_pack_xfr_pack_unit_qty_META,
			ttl_pack_xfr_pack_unit_cd_META,
			if_ttl_pack_xfr_pack_unit_cd_META,
			if_ttl_pack_xfr_pack_unit_nm_META,
			ttl_intr_rmrks_META,
			ext_insp_act_d_no_META,
			so_qty_META,
			smpl_qty_META,
			smpl_pack_xfr_pack_unit_qty_META,
			smpl_pack_xfr_pack_unit_cd_META,
			if_smpl_pack_xfr_pack_unit_cd_META,
			if_smpl_pack_xfr_pack_unit_nm_META,
			smpl_act_tm_META,
			bd_dpt_cd_META,
			if_bd_dpt_cd_META,
			if_bd_dpt_nm_META,
			trd_rmrks_META,
			smpl_intr_rmrks_META,
			ext_insp_smpl_act_no_META,
			if_co_cd_META,
			if_co_nm_META,
			req_no_META,
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
			stk_loc_nm_META,
			act_usr_nm_META,
			act_dpt_nm_META,
			judg_usr_nm_META,
			judg_dpt_nm_META,
			smpl_pack_xfr_pack_unit_nm_META,
			smpl_gd_nm_META,
			smpl_dfct_rsn_nm_META,
			stk_str_ln_nm_META,
			bd_dpt_nm_META,
			ttl_gd_nm_META,
			ttl_dfct_rsn_nm_META,
			pack_unit_nm_META,
			ttl_pack_xfr_pack_unit_nm_META
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
	protected MST_INSP_ACT_RECV_IF_R(ConstMetaList<? extends MST_INSP_ACT_RECV_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_INSP_ACT_RECV_IF_R(ConstMetaList<? extends MST_INSP_ACT_RECV_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$data_lno,
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
			MST_INSP_ACT_RECV_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$data_no,
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
			MST_INSP_ACT_RECV_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$exe_sts_typ,
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
			MST_INSP_ACT_RECV_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$data_crud_typ,
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
			MST_INSP_ACT_RECV_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ext_sys_cd,
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
			MST_INSP_ACT_RECV_IF_R.$ext_data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$ext_data_no,
				"ext_data_no",
				ext_data_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ext_data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$ext_data_lno,
				"ext_data_lno",
				ext_data_lno,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$data_make_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$data_make_dt,
				"data_make_dt",
				data_make_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_ACT_RECV_IF_R.$imp_flg,
				"imp_flg",
				imp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$recv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$recv_dt,
				"recv_dt",
				recv_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$insp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$insp_no,
				"insp_no",
				insp_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$insp_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$insp_schd_no,
				"insp_schd_no",
				insp_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$st_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$st_act_tm,
				"st_act_tm",
				st_act_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$end_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$end_act_tm,
				"end_act_tm",
				end_act_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$act_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$act_usr_cd,
				"act_usr_cd",
				act_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_act_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_act_usr_cd,
				"if_act_usr_cd",
				if_act_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_act_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_act_usr_nm,
				"if_act_usr_nm",
				if_act_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$act_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$act_dpt_cd,
				"act_dpt_cd",
				act_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_act_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_act_dpt_cd,
				"if_act_dpt_cd",
				if_act_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_act_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_act_dpt_nm,
				"if_act_dpt_nm",
				if_act_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$smpl_quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$smpl_quality_typ,
				"smpl_quality_typ",
				smpl_quality_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$smpl_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$smpl_gd_cd,
				"smpl_gd_cd",
				smpl_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_smpl_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_smpl_gd_cd,
				"if_smpl_gd_cd",
				if_smpl_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_smpl_gd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_smpl_gd_nm,
				"if_smpl_gd_nm",
				if_smpl_gd_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$smpl_dfct_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$smpl_dfct_rsn_cd,
				"smpl_dfct_rsn_cd",
				smpl_dfct_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_smpl_dfct_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_smpl_dfct_rsn_cd,
				"if_smpl_dfct_rsn_cd",
				if_smpl_dfct_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_smpl_dfct_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_smpl_dfct_rsn_nm,
				"if_smpl_dfct_rsn_nm",
				if_smpl_dfct_rsn_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$act_cont_fctr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$act_cont_fctr,
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
			MST_INSP_ACT_RECV_IF_R.$vld_dt_upd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_ACT_RECV_IF_R.$vld_dt_upd_flg,
				"vld_dt_upd_flg",
				vld_dt_upd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$lmt_dt_frm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$lmt_dt_frm,
				"lmt_dt_frm",
				lmt_dt_frm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$vld_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$vld_dt,
				"vld_dt",
				vld_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$lmt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$lmt_dt,
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
			MST_INSP_ACT_RECV_IF_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$intr_rmrks,
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
			MST_INSP_ACT_RECV_IF_R.$lot_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$lot_rmrks,
				"lot_rmrks",
				lot_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$imp_only_judg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_ACT_RECV_IF_R.$imp_only_judg,
				"imp_only_judg",
				imp_only_judg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$insp_judg_rslt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$insp_judg_rslt_typ,
				"insp_judg_rslt_typ",
				insp_judg_rslt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$judg_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$judg_dt,
				"judg_dt",
				judg_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$judg_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$judg_usr_cd,
				"judg_usr_cd",
				judg_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_judg_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_judg_usr_cd,
				"if_judg_usr_cd",
				if_judg_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_judg_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_judg_usr_nm,
				"if_judg_usr_nm",
				if_judg_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$judg_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$judg_dpt_cd,
				"judg_dpt_cd",
				judg_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_judg_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_judg_dpt_cd,
				"if_judg_dpt_cd",
				if_judg_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_judg_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_judg_dpt_nm,
				"if_judg_dpt_nm",
				if_judg_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$judg_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$judg_rsn,
				"judg_rsn",
				judg_rsn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ext_insp_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ext_insp_act_no,
				"ext_insp_act_no",
				ext_insp_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$stk_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$stk_loc_cd,
				"stk_loc_cd",
				stk_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_stk_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_stk_loc_cd,
				"if_stk_loc_cd",
				if_stk_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_stk_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_stk_loc_nm,
				"if_stk_loc_nm",
				if_stk_loc_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$stk_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$stk_str_ln_cd,
				"stk_str_ln_cd",
				stk_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_stk_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_stk_str_ln_cd,
				"if_stk_str_ln_cd",
				if_stk_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_stk_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_stk_str_ln_nm,
				"if_stk_str_ln_nm",
				if_stk_str_ln_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ttl_quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ttl_quality_typ,
				"ttl_quality_typ",
				ttl_quality_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ttl_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ttl_gd_cd,
				"ttl_gd_cd",
				ttl_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_ttl_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_ttl_gd_cd,
				"if_ttl_gd_cd",
				if_ttl_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_ttl_gd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_ttl_gd_nm,
				"if_ttl_gd_nm",
				if_ttl_gd_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ttl_dfct_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ttl_dfct_rsn_cd,
				"ttl_dfct_rsn_cd",
				ttl_dfct_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_ttl_dfct_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_ttl_dfct_rsn_cd,
				"if_ttl_dfct_rsn_cd",
				if_ttl_dfct_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_ttl_dfct_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_ttl_dfct_rsn_nm,
				"if_ttl_dfct_rsn_nm",
				if_ttl_dfct_rsn_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ttl_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$ttl_act_tm,
				"ttl_act_tm",
				ttl_act_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$base_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_ACT_RECV_IF_R.$base_flg,
				"base_flg",
				base_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$pack_unit_qty,
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
			MST_INSP_ACT_RECV_IF_R.$pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$pack_unit_cd,
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
			MST_INSP_ACT_RECV_IF_R.$if_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_pack_unit_cd,
				"if_pack_unit_cd",
				if_pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_pack_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_pack_unit_nm,
				"if_pack_unit_nm",
				if_pack_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ttl_pack_xfr_pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$ttl_pack_xfr_pack_unit_qty,
				"ttl_pack_xfr_pack_unit_qty",
				ttl_pack_xfr_pack_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ttl_pack_xfr_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ttl_pack_xfr_pack_unit_cd,
				"ttl_pack_xfr_pack_unit_cd",
				ttl_pack_xfr_pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_ttl_pack_xfr_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_ttl_pack_xfr_pack_unit_cd,
				"if_ttl_pack_xfr_pack_unit_cd",
				if_ttl_pack_xfr_pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_ttl_pack_xfr_pack_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_ttl_pack_xfr_pack_unit_nm,
				"if_ttl_pack_xfr_pack_unit_nm",
				if_ttl_pack_xfr_pack_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ttl_intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ttl_intr_rmrks,
				"ttl_intr_rmrks",
				ttl_intr_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ext_insp_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ext_insp_act_d_no,
				"ext_insp_act_d_no",
				ext_insp_act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$so_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$so_qty,
				"so_qty",
				so_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$smpl_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$smpl_qty,
				"smpl_qty",
				smpl_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$smpl_pack_xfr_pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$smpl_pack_xfr_pack_unit_qty,
				"smpl_pack_xfr_pack_unit_qty",
				smpl_pack_xfr_pack_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$smpl_pack_xfr_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$smpl_pack_xfr_pack_unit_cd,
				"smpl_pack_xfr_pack_unit_cd",
				smpl_pack_xfr_pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_smpl_pack_xfr_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_smpl_pack_xfr_pack_unit_cd,
				"if_smpl_pack_xfr_pack_unit_cd",
				if_smpl_pack_xfr_pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_smpl_pack_xfr_pack_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_smpl_pack_xfr_pack_unit_nm,
				"if_smpl_pack_xfr_pack_unit_nm",
				if_smpl_pack_xfr_pack_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$smpl_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$smpl_act_tm,
				"smpl_act_tm",
				smpl_act_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$bd_dpt_cd,
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
			MST_INSP_ACT_RECV_IF_R.$if_bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_bd_dpt_cd,
				"if_bd_dpt_cd",
				if_bd_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_bd_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_bd_dpt_nm,
				"if_bd_dpt_nm",
				if_bd_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$trd_rmrks,
				"trd_rmrks",
				trd_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$smpl_intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$smpl_intr_rmrks,
				"smpl_intr_rmrks",
				smpl_intr_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$ext_insp_smpl_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ext_insp_smpl_act_no,
				"ext_insp_smpl_act_no",
				ext_insp_smpl_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_co_cd,
				"if_co_cd",
				if_co_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$if_co_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$if_co_nm,
				"if_co_nm",
				if_co_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$req_no,
				"req_no",
				req_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char1,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char2,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char3,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char4,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char5,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char6,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char7,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char8,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char9,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char10,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char11,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char12,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char13,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char14,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char15,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char16,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char17,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char18,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char19,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char20,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char21,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char22,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char23,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char24,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char25,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char26,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char27,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char28,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char29,
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
			MST_INSP_ACT_RECV_IF_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sub_char30,
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
			MST_INSP_ACT_RECV_IF_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$sub_num1,
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
			MST_INSP_ACT_RECV_IF_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$sub_num2,
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
			MST_INSP_ACT_RECV_IF_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$sub_num3,
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
			MST_INSP_ACT_RECV_IF_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$sub_num4,
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
			MST_INSP_ACT_RECV_IF_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$sub_num5,
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
			MST_INSP_ACT_RECV_IF_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$sub_dt1,
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
			MST_INSP_ACT_RECV_IF_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$sub_dt2,
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
			MST_INSP_ACT_RECV_IF_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$sub_dt3,
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
			MST_INSP_ACT_RECV_IF_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$sub_dt4,
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
			MST_INSP_ACT_RECV_IF_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_RECV_IF_R.$sub_dt5,
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
			MST_INSP_ACT_RECV_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$batch_log_no,
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
			MST_INSP_ACT_RECV_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$log_sub_key1,
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
			MST_INSP_ACT_RECV_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$log_sub_key2,
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
			MST_INSP_ACT_RECV_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ins_usr_id,
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
			MST_INSP_ACT_RECV_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ins_usr_nm,
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
			MST_INSP_ACT_RECV_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INSP_ACT_RECV_IF_R.$ins_ts,
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
			MST_INSP_ACT_RECV_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ins_func_id,
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
			MST_INSP_ACT_RECV_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_RECV_IF_R.$upd_cntr,
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
			MST_INSP_ACT_RECV_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$upd_usr_id,
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
			MST_INSP_ACT_RECV_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$upd_usr_nm,
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
			MST_INSP_ACT_RECV_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INSP_ACT_RECV_IF_R.$upd_ts,
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
			MST_INSP_ACT_RECV_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$upd_func_id,
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
			MST_INSP_ACT_RECV_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$upd_srv_req_no,
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
			MST_INSP_ACT_RECV_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$sdrv_sts_typ,
				"sdrv_sts_typ",
				null,
				false,
				true,
				false,
				false,
				true,
				"SDRV.SDRV_STS_TYP"
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_RECV_IF_R.$stk_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$stk_loc_nm,
				"stk_loc_nm",
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
			MST_INSP_ACT_RECV_IF_R.$act_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$act_usr_nm,
				"act_usr_nm",
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
			MST_INSP_ACT_RECV_IF_R.$act_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$act_dpt_nm,
				"act_dpt_nm",
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
			MST_INSP_ACT_RECV_IF_R.$judg_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$judg_usr_nm,
				"judg_usr_nm",
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
			MST_INSP_ACT_RECV_IF_R.$judg_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$judg_dpt_nm,
				"judg_dpt_nm",
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
			MST_INSP_ACT_RECV_IF_R.$smpl_pack_xfr_pack_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$smpl_pack_xfr_pack_unit_nm,
				"smpl_pack_xfr_pack_unit_nm",
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
			MST_INSP_ACT_RECV_IF_R.$smpl_gd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$smpl_gd_nm,
				"smpl_gd_nm",
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
			MST_INSP_ACT_RECV_IF_R.$smpl_dfct_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$smpl_dfct_rsn_nm,
				"smpl_dfct_rsn_nm",
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
			MST_INSP_ACT_RECV_IF_R.$stk_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$stk_str_ln_nm,
				"stk_str_ln_nm",
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
			MST_INSP_ACT_RECV_IF_R.$bd_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$bd_dpt_nm,
				"bd_dpt_nm",
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
			MST_INSP_ACT_RECV_IF_R.$ttl_gd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ttl_gd_nm,
				"ttl_gd_nm",
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
			MST_INSP_ACT_RECV_IF_R.$ttl_dfct_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ttl_dfct_rsn_nm,
				"ttl_dfct_rsn_nm",
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
			MST_INSP_ACT_RECV_IF_R.$pack_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$pack_unit_nm,
				"pack_unit_nm",
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
			MST_INSP_ACT_RECV_IF_R.$ttl_pack_xfr_pack_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_RECV_IF_R.$ttl_pack_xfr_pack_unit_nm,
				"ttl_pack_xfr_pack_unit_nm",
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
	public static MST_INSP_ACT_RECV_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_INSP_ACT_RECV_IF_R create(String alias) {
		MST_INSP_ACT_RECV_IF_R row = new MST_INSP_ACT_RECV_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_INSP_ACT_RECV_IF_R createByName(T proto) {
		MST_INSP_ACT_RECV_IF_R row = MST_INSP_ACT_RECV_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_ACT_RECV_IF_R clone() {
		return (MST_INSP_ACT_RECV_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_ACT_RECV_IF_R createInstance() {
		return (MST_INSP_ACT_RECV_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_ACT_RECV_IF_R getValues(String... names) {
		return (MST_INSP_ACT_RECV_IF_R) super.getValues(names);
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
	 public MSW_INSP_ACT_RECV_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_INSP_ACT_RECV_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_INSP_ACT_RECV_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_INSP_ACT_RECV_IF_KEY_R.TABLE_NAME);
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
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return getConstNumber(offset + 5, $ext_data_no);
	}

	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(int value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(long value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(float value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(double value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return getConstNumber(offset + 6, $ext_data_lno);
	}

	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(int value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(long value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(float value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(double value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 7, $data_make_dt);
	}

	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 7, $data_make_dt, value);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public boolean imp_flg() {
		return getConstBoolean(offset + 8, $imp_flg);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public void imp_flg(boolean value) {
		setConstBoolean(offset + 8, $imp_flg, value);
	}

	/**
	 * 受信日. Receiving date.<p>
	 *
	 */
	public MCDate recv_dt() {
		return getConstDate(offset + 9, $recv_dt);
	}

	/**
	 * 受信日. Receiving date.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		setConstDate(offset + 9, $recv_dt, value);
	}

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 10, $insp_no);
	}

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 10, $insp_no, value);
	}

	/**
	 * 検査予定ＮＯ. Inspection schedule No..<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 11, $insp_schd_no);
	}

	/**
	 * 検査予定ＮＯ. Inspection schedule No..<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 11, $insp_schd_no, value);
	}

	/**
	 * 検査開始日時. Inspection start date and time.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return getConstDate(offset + 12, $st_act_tm);
	}

	/**
	 * 検査開始日時. Inspection start date and time.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		setConstDate(offset + 12, $st_act_tm, value);
	}

	/**
	 * 検査終了日時. Inspection finish date and time.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return getConstDate(offset + 13, $end_act_tm);
	}

	/**
	 * 検査終了日時. Inspection finish date and time.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		setConstDate(offset + 13, $end_act_tm, value);
	}

	/**
	 * 実施担当者ＣＤ. Implementation PIC cd..<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 14, $act_usr_cd);
	}

	/**
	 * 実施担当者ＣＤ. Implementation PIC cd..<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 14, $act_usr_cd, value);
	}

	/**
	 * ＩＦ実施担当者ＣＤ. IF PIC of implement cd..<p>
	 *
	 */
	public String if_act_usr_cd() {
		return getConstString(offset + 15, $if_act_usr_cd);
	}

	/**
	 * ＩＦ実施担当者ＣＤ. IF PIC of implement cd..<p>
	 *
	 */
	public void if_act_usr_cd(String value) {
		setConstString(offset + 15, $if_act_usr_cd, value);
	}

	/**
	 * ＩＦ実施担当者名. IF PIC of implement name.<p>
	 *
	 */
	public String if_act_usr_nm() {
		return getConstString(offset + 16, $if_act_usr_nm);
	}

	/**
	 * ＩＦ実施担当者名. IF PIC of implement name.<p>
	 *
	 */
	public void if_act_usr_nm(String value) {
		setConstString(offset + 16, $if_act_usr_nm, value);
	}

	/**
	 * 実施担当部門ＣＤ. Implementation dept. cd..<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 17, $act_dpt_cd);
	}

	/**
	 * 実施担当部門ＣＤ. Implementation dept. cd..<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 17, $act_dpt_cd, value);
	}

	/**
	 * ＩＦ実施担当部門ＣＤ. IF implementation dept. cd..<p>
	 *
	 */
	public String if_act_dpt_cd() {
		return getConstString(offset + 18, $if_act_dpt_cd);
	}

	/**
	 * ＩＦ実施担当部門ＣＤ. IF implementation dept. cd..<p>
	 *
	 */
	public void if_act_dpt_cd(String value) {
		setConstString(offset + 18, $if_act_dpt_cd, value);
	}

	/**
	 * ＩＦ実施担当部門名. IF implementation dept. name.<p>
	 *
	 */
	public String if_act_dpt_nm() {
		return getConstString(offset + 19, $if_act_dpt_nm);
	}

	/**
	 * ＩＦ実施担当部門名. IF implementation dept. name.<p>
	 *
	 */
	public void if_act_dpt_nm(String value) {
		setConstString(offset + 19, $if_act_dpt_nm, value);
	}

	/**
	 * 良品区分（抜取）. Conforming type (Sampling).<p>
	 *
	 */
	public String smpl_quality_typ() {
		return getConstString(offset + 20, $smpl_quality_typ);
	}

	/**
	 * 良品区分（抜取）. Conforming type (Sampling).<p>
	 *
	 */
	public void smpl_quality_typ(String value) {
		setConstString(offset + 20, $smpl_quality_typ, value);
	}

	/**
	 * 格付ＣＤ（抜取）. Grading cd. (Sampling).<p>
	 *
	 */
	public String smpl_gd_cd() {
		return getConstString(offset + 21, $smpl_gd_cd);
	}

	/**
	 * 格付ＣＤ（抜取）. Grading cd. (Sampling).<p>
	 *
	 */
	public void smpl_gd_cd(String value) {
		setConstString(offset + 21, $smpl_gd_cd, value);
	}

	/**
	 * ＩＦ格付ＣＤ（抜取）. IF grading cd. (Sampling).<p>
	 *
	 */
	public String if_smpl_gd_cd() {
		return getConstString(offset + 22, $if_smpl_gd_cd);
	}

	/**
	 * ＩＦ格付ＣＤ（抜取）. IF grading cd. (Sampling).<p>
	 *
	 */
	public void if_smpl_gd_cd(String value) {
		setConstString(offset + 22, $if_smpl_gd_cd, value);
	}

	/**
	 * ＩＦ格付名（抜取）. IF grading name (Sampling).<p>
	 *
	 */
	public String if_smpl_gd_nm() {
		return getConstString(offset + 23, $if_smpl_gd_nm);
	}

	/**
	 * ＩＦ格付名（抜取）. IF grading name (Sampling).<p>
	 *
	 */
	public void if_smpl_gd_nm(String value) {
		setConstString(offset + 23, $if_smpl_gd_nm, value);
	}

	/**
	 * 不良理由ＣＤ（抜取）. Defective reason cd. (Sampling).<p>
	 *
	 */
	public String smpl_dfct_rsn_cd() {
		return getConstString(offset + 24, $smpl_dfct_rsn_cd);
	}

	/**
	 * 不良理由ＣＤ（抜取）. Defective reason cd. (Sampling).<p>
	 *
	 */
	public void smpl_dfct_rsn_cd(String value) {
		setConstString(offset + 24, $smpl_dfct_rsn_cd, value);
	}

	/**
	 * ＩＦ不良理由ＣＤ（抜取）. IF defective reason cd. (Sampling).<p>
	 *
	 */
	public String if_smpl_dfct_rsn_cd() {
		return getConstString(offset + 25, $if_smpl_dfct_rsn_cd);
	}

	/**
	 * ＩＦ不良理由ＣＤ（抜取）. IF defective reason cd. (Sampling).<p>
	 *
	 */
	public void if_smpl_dfct_rsn_cd(String value) {
		setConstString(offset + 25, $if_smpl_dfct_rsn_cd, value);
	}

	/**
	 * ＩＦ不良理由名（抜取）. IF defective reason name (Sampling).<p>
	 *
	 */
	public String if_smpl_dfct_rsn_nm() {
		return getConstString(offset + 26, $if_smpl_dfct_rsn_nm);
	}

	/**
	 * ＩＦ不良理由名（抜取）. IF defective reason name (Sampling).<p>
	 *
	 */
	public void if_smpl_dfct_rsn_nm(String value) {
		setConstString(offset + 26, $if_smpl_dfct_rsn_nm, value);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 27, $act_cont_fctr);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 27, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 27, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 27, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 27, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 27, $act_cont_fctr, value);
	}
	
	/**
	 * 有効期限更新ＦＬＧ. Expiration date update flg..<p>
	 *
	 */
	public boolean vld_dt_upd_flg() {
		return getConstBoolean(offset + 28, $vld_dt_upd_flg);
	}

	/**
	 * 有効期限更新ＦＬＧ. Expiration date update flg..<p>
	 *
	 */
	public void vld_dt_upd_flg(boolean value) {
		setConstBoolean(offset + 28, $vld_dt_upd_flg, value);
	}

	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 29, $lmt_dt_frm);
	}

	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 29, $lmt_dt_frm, value);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 30, $vld_dt);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 30, $vld_dt, value);
	}

	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 31, $lmt_dt);
	}

	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 31, $lmt_dt, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 32, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 32, $intr_rmrks, value);
	}

	/**
	 * ロット備考. Lot remarks.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 33, $lot_rmrks);
	}

	/**
	 * ロット備考. Lot remarks.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 33, $lot_rmrks, value);
	}

	/**
	 * 判定のみ取込ＦＬＧ. Import decision only flg..<p>
	 *
	 */
	public boolean imp_only_judg() {
		return getConstBoolean(offset + 34, $imp_only_judg);
	}

	/**
	 * 判定のみ取込ＦＬＧ. Import decision only flg..<p>
	 *
	 */
	public void imp_only_judg(boolean value) {
		setConstBoolean(offset + 34, $imp_only_judg, value);
	}

	/**
	 * 検査判定結果区分. Inspection decision result type.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 35, $insp_judg_rslt_typ);
	}

	/**
	 * 検査判定結果区分. Inspection decision result type.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 35, $insp_judg_rslt_typ, value);
	}

	/**
	 * 判定日. Decision date.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 36, $judg_dt);
	}

	/**
	 * 判定日. Decision date.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 36, $judg_dt, value);
	}

	/**
	 * 判定者ＣＤ. Decision PIC cd..<p>
	 *
	 */
	public String judg_usr_cd() {
		return getConstString(offset + 37, $judg_usr_cd);
	}

	/**
	 * 判定者ＣＤ. Decision PIC cd..<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		setConstString(offset + 37, $judg_usr_cd, value);
	}

	/**
	 * ＩＦ判定者ＣＤ. IF decision PIC cd..<p>
	 *
	 */
	public String if_judg_usr_cd() {
		return getConstString(offset + 38, $if_judg_usr_cd);
	}

	/**
	 * ＩＦ判定者ＣＤ. IF decision PIC cd..<p>
	 *
	 */
	public void if_judg_usr_cd(String value) {
		setConstString(offset + 38, $if_judg_usr_cd, value);
	}

	/**
	 * ＩＦ判定者名. IF decision PIC name.<p>
	 *
	 */
	public String if_judg_usr_nm() {
		return getConstString(offset + 39, $if_judg_usr_nm);
	}

	/**
	 * ＩＦ判定者名. IF decision PIC name.<p>
	 *
	 */
	public void if_judg_usr_nm(String value) {
		setConstString(offset + 39, $if_judg_usr_nm, value);
	}

	/**
	 * 判定部門ＣＤ. Decision dept. cd..<p>
	 *
	 */
	public String judg_dpt_cd() {
		return getConstString(offset + 40, $judg_dpt_cd);
	}

	/**
	 * 判定部門ＣＤ. Decision dept. cd..<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		setConstString(offset + 40, $judg_dpt_cd, value);
	}

	/**
	 * ＩＦ判定部門ＣＤ. IF decision dept. cd..<p>
	 *
	 */
	public String if_judg_dpt_cd() {
		return getConstString(offset + 41, $if_judg_dpt_cd);
	}

	/**
	 * ＩＦ判定部門ＣＤ. IF decision dept. cd..<p>
	 *
	 */
	public void if_judg_dpt_cd(String value) {
		setConstString(offset + 41, $if_judg_dpt_cd, value);
	}

	/**
	 * ＩＦ判定部門名. IF decision dept. name.<p>
	 *
	 */
	public String if_judg_dpt_nm() {
		return getConstString(offset + 42, $if_judg_dpt_nm);
	}

	/**
	 * ＩＦ判定部門名. IF decision dept. name.<p>
	 *
	 */
	public void if_judg_dpt_nm(String value) {
		setConstString(offset + 42, $if_judg_dpt_nm, value);
	}

	/**
	 * 判定理由. Decision reason.<p>
	 *
	 */
	public String judg_rsn() {
		return getConstString(offset + 43, $judg_rsn);
	}

	/**
	 * 判定理由. Decision reason.<p>
	 *
	 */
	public void judg_rsn(String value) {
		setConstString(offset + 43, $judg_rsn, value);
	}

	/**
	 * 外部検査実績ＮＯ. External inspection result No..<p>
	 *
	 */
	public String ext_insp_act_no() {
		return getConstString(offset + 44, $ext_insp_act_no);
	}

	/**
	 * 外部検査実績ＮＯ. External inspection result No..<p>
	 *
	 */
	public void ext_insp_act_no(String value) {
		setConstString(offset + 44, $ext_insp_act_no, value);
	}

	/**
	 * 在庫場所ＣＤ. Inventory location cd..<p>
	 *
	 */
	public String stk_loc_cd() {
		return getConstString(offset + 45, $stk_loc_cd);
	}

	/**
	 * 在庫場所ＣＤ. Inventory location cd..<p>
	 *
	 */
	public void stk_loc_cd(String value) {
		setConstString(offset + 45, $stk_loc_cd, value);
	}

	/**
	 * ＩＦ在庫場所ＣＤ. IF inventory location cd..<p>
	 *
	 */
	public String if_stk_loc_cd() {
		return getConstString(offset + 46, $if_stk_loc_cd);
	}

	/**
	 * ＩＦ在庫場所ＣＤ. IF inventory location cd..<p>
	 *
	 */
	public void if_stk_loc_cd(String value) {
		setConstString(offset + 46, $if_stk_loc_cd, value);
	}

	/**
	 * ＩＦ在庫場所名. IF inventory location name.<p>
	 *
	 */
	public String if_stk_loc_nm() {
		return getConstString(offset + 47, $if_stk_loc_nm);
	}

	/**
	 * ＩＦ在庫場所名. IF inventory location name.<p>
	 *
	 */
	public void if_stk_loc_nm(String value) {
		setConstString(offset + 47, $if_stk_loc_nm, value);
	}

	/**
	 * 在庫棚・ラインＣＤ. Inventory rack/line cd..<p>
	 *
	 */
	public String stk_str_ln_cd() {
		return getConstString(offset + 48, $stk_str_ln_cd);
	}

	/**
	 * 在庫棚・ラインＣＤ. Inventory rack/line cd..<p>
	 *
	 */
	public void stk_str_ln_cd(String value) {
		setConstString(offset + 48, $stk_str_ln_cd, value);
	}

	/**
	 * ＩＦ在庫棚・ラインＣＤ. IF inventory rack/line cd..<p>
	 *
	 */
	public String if_stk_str_ln_cd() {
		return getConstString(offset + 49, $if_stk_str_ln_cd);
	}

	/**
	 * ＩＦ在庫棚・ラインＣＤ. IF inventory rack/line cd..<p>
	 *
	 */
	public void if_stk_str_ln_cd(String value) {
		setConstString(offset + 49, $if_stk_str_ln_cd, value);
	}

	/**
	 * ＩＦ在庫棚・ライン名. IF inventory rack/line name.<p>
	 *
	 */
	public String if_stk_str_ln_nm() {
		return getConstString(offset + 50, $if_stk_str_ln_nm);
	}

	/**
	 * ＩＦ在庫棚・ライン名. IF inventory rack/line name.<p>
	 *
	 */
	public void if_stk_str_ln_nm(String value) {
		setConstString(offset + 50, $if_stk_str_ln_nm, value);
	}

	/**
	 * 良品区分（全数）. Conforming type (100%).<p>
	 *
	 */
	public String ttl_quality_typ() {
		return getConstString(offset + 51, $ttl_quality_typ);
	}

	/**
	 * 良品区分（全数）. Conforming type (100%).<p>
	 *
	 */
	public void ttl_quality_typ(String value) {
		setConstString(offset + 51, $ttl_quality_typ, value);
	}

	/**
	 * 格付ＣＤ（全数）. Grading cd. (100%).<p>
	 *
	 */
	public String ttl_gd_cd() {
		return getConstString(offset + 52, $ttl_gd_cd);
	}

	/**
	 * 格付ＣＤ（全数）. Grading cd. (100%).<p>
	 *
	 */
	public void ttl_gd_cd(String value) {
		setConstString(offset + 52, $ttl_gd_cd, value);
	}

	/**
	 * ＩＦ格付ＣＤ（全数）. IF grading cd. (100%).<p>
	 *
	 */
	public String if_ttl_gd_cd() {
		return getConstString(offset + 53, $if_ttl_gd_cd);
	}

	/**
	 * ＩＦ格付ＣＤ（全数）. IF grading cd. (100%).<p>
	 *
	 */
	public void if_ttl_gd_cd(String value) {
		setConstString(offset + 53, $if_ttl_gd_cd, value);
	}

	/**
	 * ＩＦ格付名（全数）. IF grading name (100%).<p>
	 *
	 */
	public String if_ttl_gd_nm() {
		return getConstString(offset + 54, $if_ttl_gd_nm);
	}

	/**
	 * ＩＦ格付名（全数）. IF grading name (100%).<p>
	 *
	 */
	public void if_ttl_gd_nm(String value) {
		setConstString(offset + 54, $if_ttl_gd_nm, value);
	}

	/**
	 * 不良理由ＣＤ（全数）. Defective reason cd. (100%).<p>
	 *
	 */
	public String ttl_dfct_rsn_cd() {
		return getConstString(offset + 55, $ttl_dfct_rsn_cd);
	}

	/**
	 * 不良理由ＣＤ（全数）. Defective reason cd. (100%).<p>
	 *
	 */
	public void ttl_dfct_rsn_cd(String value) {
		setConstString(offset + 55, $ttl_dfct_rsn_cd, value);
	}

	/**
	 * ＩＦ不良理由ＣＤ（全数）. IF defective reason cd. (100%).<p>
	 *
	 */
	public String if_ttl_dfct_rsn_cd() {
		return getConstString(offset + 56, $if_ttl_dfct_rsn_cd);
	}

	/**
	 * ＩＦ不良理由ＣＤ（全数）. IF defective reason cd. (100%).<p>
	 *
	 */
	public void if_ttl_dfct_rsn_cd(String value) {
		setConstString(offset + 56, $if_ttl_dfct_rsn_cd, value);
	}

	/**
	 * ＩＦ不良理由名（全数）. IF defective reason name (100%).<p>
	 *
	 */
	public String if_ttl_dfct_rsn_nm() {
		return getConstString(offset + 57, $if_ttl_dfct_rsn_nm);
	}

	/**
	 * ＩＦ不良理由名（全数）. IF defective reason name (100%).<p>
	 *
	 */
	public void if_ttl_dfct_rsn_nm(String value) {
		setConstString(offset + 57, $if_ttl_dfct_rsn_nm, value);
	}

	/**
	 * 実績日時（全数）. Actual date and time (100%).<p>
	 *
	 */
	public MCDate ttl_act_tm() {
		return getConstDate(offset + 58, $ttl_act_tm);
	}

	/**
	 * 実績日時（全数）. Actual date and time (100%).<p>
	 *
	 */
	public void ttl_act_tm(MCDate value) {
		setConstDate(offset + 58, $ttl_act_tm, value);
	}

	/**
	 * 基準ＦＬＧ. Base flg..<p>
	 *
	 */
	public boolean base_flg() {
		return getConstBoolean(offset + 59, $base_flg);
	}

	/**
	 * 基準ＦＬＧ. Base flg..<p>
	 *
	 */
	public void base_flg(boolean value) {
		setConstBoolean(offset + 59, $base_flg, value);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 60, $pack_unit_qty);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 60, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 60, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 60, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 60, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 60, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 61, $pack_unit_cd);
	}

	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 61, $pack_unit_cd, value);
	}

	/**
	 * ＩＦ荷姿単位ＣＤ. IF SKU cd..<p>
	 *
	 */
	public String if_pack_unit_cd() {
		return getConstString(offset + 62, $if_pack_unit_cd);
	}

	/**
	 * ＩＦ荷姿単位ＣＤ. IF SKU cd..<p>
	 *
	 */
	public void if_pack_unit_cd(String value) {
		setConstString(offset + 62, $if_pack_unit_cd, value);
	}

	/**
	 * ＩＦ荷姿単位名. IF SKU name.<p>
	 *
	 */
	public String if_pack_unit_nm() {
		return getConstString(offset + 63, $if_pack_unit_nm);
	}

	/**
	 * ＩＦ荷姿単位名. IF SKU name.<p>
	 *
	 */
	public void if_pack_unit_nm(String value) {
		setConstString(offset + 63, $if_pack_unit_nm, value);
	}

	/**
	 * 荷姿振替荷姿単位数量（全数）. SKU transfer SKU qty. (100%).<p>
	 *
	 */
	public MCNumber ttl_pack_xfr_pack_unit_qty() {
		return getConstNumber(offset + 64, $ttl_pack_xfr_pack_unit_qty);
	}

	/**
	 * 荷姿振替荷姿単位数量（全数）. SKU transfer SKU qty. (100%).<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 64, $ttl_pack_xfr_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位数量（全数）. SKU transfer SKU qty. (100%).<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(int value) {
		setConstNumber(offset + 64, $ttl_pack_xfr_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位数量（全数）. SKU transfer SKU qty. (100%).<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(long value) {
		setConstNumber(offset + 64, $ttl_pack_xfr_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位数量（全数）. SKU transfer SKU qty. (100%).<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(float value) {
		setConstNumber(offset + 64, $ttl_pack_xfr_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位数量（全数）. SKU transfer SKU qty. (100%).<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(double value) {
		setConstNumber(offset + 64, $ttl_pack_xfr_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位ＣＤ（全数）. SKU transfer SKU cd. (100%).<p>
	 *
	 */
	public String ttl_pack_xfr_pack_unit_cd() {
		return getConstString(offset + 65, $ttl_pack_xfr_pack_unit_cd);
	}

	/**
	 * 荷姿振替荷姿単位ＣＤ（全数）. SKU transfer SKU cd. (100%).<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 65, $ttl_pack_xfr_pack_unit_cd, value);
	}

	/**
	 * ＩＦ荷姿振替荷姿単位ＣＤ（全数）. IF SKU transfer SKU cd. (100%).<p>
	 *
	 */
	public String if_ttl_pack_xfr_pack_unit_cd() {
		return getConstString(offset + 66, $if_ttl_pack_xfr_pack_unit_cd);
	}

	/**
	 * ＩＦ荷姿振替荷姿単位ＣＤ（全数）. IF SKU transfer SKU cd. (100%).<p>
	 *
	 */
	public void if_ttl_pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 66, $if_ttl_pack_xfr_pack_unit_cd, value);
	}

	/**
	 * ＩＦ荷姿振替荷姿単位名（全数）. IF SKU transfer SKU name (100%).<p>
	 *
	 */
	public String if_ttl_pack_xfr_pack_unit_nm() {
		return getConstString(offset + 67, $if_ttl_pack_xfr_pack_unit_nm);
	}

	/**
	 * ＩＦ荷姿振替荷姿単位名（全数）. IF SKU transfer SKU name (100%).<p>
	 *
	 */
	public void if_ttl_pack_xfr_pack_unit_nm(String value) {
		setConstString(offset + 67, $if_ttl_pack_xfr_pack_unit_nm, value);
	}

	/**
	 * 内部備考（全数）. Internal remarks (100%).<p>
	 *
	 */
	public String ttl_intr_rmrks() {
		return getConstString(offset + 68, $ttl_intr_rmrks);
	}

	/**
	 * 内部備考（全数）. Internal remarks (100%).<p>
	 *
	 */
	public void ttl_intr_rmrks(String value) {
		setConstString(offset + 68, $ttl_intr_rmrks, value);
	}

	/**
	 * 外部検査実績明細ＮＯ. External inspection result details No..<p>
	 *
	 */
	public String ext_insp_act_d_no() {
		return getConstString(offset + 69, $ext_insp_act_d_no);
	}

	/**
	 * 外部検査実績明細ＮＯ. External inspection result details No..<p>
	 *
	 */
	public void ext_insp_act_d_no(String value) {
		setConstString(offset + 69, $ext_insp_act_d_no, value);
	}

	/**
	 * 引落数量. Deducted qty..<p>
	 *
	 */
	public MCNumber so_qty() {
		return getConstNumber(offset + 70, $so_qty);
	}

	/**
	 * 引落数量. Deducted qty..<p>
	 *
	 */
	public void so_qty(MCNumber value) {
		setConstNumber(offset + 70, $so_qty, value);
	}
	
	/**
	 * 引落数量. Deducted qty..<p>
	 *
	 */
	public void so_qty(int value) {
		setConstNumber(offset + 70, $so_qty, value);
	}
	
	/**
	 * 引落数量. Deducted qty..<p>
	 *
	 */
	public void so_qty(long value) {
		setConstNumber(offset + 70, $so_qty, value);
	}
	
	/**
	 * 引落数量. Deducted qty..<p>
	 *
	 */
	public void so_qty(float value) {
		setConstNumber(offset + 70, $so_qty, value);
	}
	
	/**
	 * 引落数量. Deducted qty..<p>
	 *
	 */
	public void so_qty(double value) {
		setConstNumber(offset + 70, $so_qty, value);
	}
	
	/**
	 * 抜取数量. Sampling qty..<p>
	 *
	 */
	public MCNumber smpl_qty() {
		return getConstNumber(offset + 71, $smpl_qty);
	}

	/**
	 * 抜取数量. Sampling qty..<p>
	 *
	 */
	public void smpl_qty(MCNumber value) {
		setConstNumber(offset + 71, $smpl_qty, value);
	}
	
	/**
	 * 抜取数量. Sampling qty..<p>
	 *
	 */
	public void smpl_qty(int value) {
		setConstNumber(offset + 71, $smpl_qty, value);
	}
	
	/**
	 * 抜取数量. Sampling qty..<p>
	 *
	 */
	public void smpl_qty(long value) {
		setConstNumber(offset + 71, $smpl_qty, value);
	}
	
	/**
	 * 抜取数量. Sampling qty..<p>
	 *
	 */
	public void smpl_qty(float value) {
		setConstNumber(offset + 71, $smpl_qty, value);
	}
	
	/**
	 * 抜取数量. Sampling qty..<p>
	 *
	 */
	public void smpl_qty(double value) {
		setConstNumber(offset + 71, $smpl_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位数量（抜取）. SKU transfer SKU qty. (Sampling).<p>
	 *
	 */
	public MCNumber smpl_pack_xfr_pack_unit_qty() {
		return getConstNumber(offset + 72, $smpl_pack_xfr_pack_unit_qty);
	}

	/**
	 * 荷姿振替荷姿単位数量（抜取）. SKU transfer SKU qty. (Sampling).<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 72, $smpl_pack_xfr_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位数量（抜取）. SKU transfer SKU qty. (Sampling).<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(int value) {
		setConstNumber(offset + 72, $smpl_pack_xfr_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位数量（抜取）. SKU transfer SKU qty. (Sampling).<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(long value) {
		setConstNumber(offset + 72, $smpl_pack_xfr_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位数量（抜取）. SKU transfer SKU qty. (Sampling).<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(float value) {
		setConstNumber(offset + 72, $smpl_pack_xfr_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位数量（抜取）. SKU transfer SKU qty. (Sampling).<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(double value) {
		setConstNumber(offset + 72, $smpl_pack_xfr_pack_unit_qty, value);
	}
	
	/**
	 * 荷姿振替荷姿単位ＣＤ（抜取）. SKU transfer SKU cd. (Sampling).<p>
	 *
	 */
	public String smpl_pack_xfr_pack_unit_cd() {
		return getConstString(offset + 73, $smpl_pack_xfr_pack_unit_cd);
	}

	/**
	 * 荷姿振替荷姿単位ＣＤ（抜取）. SKU transfer SKU cd. (Sampling).<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 73, $smpl_pack_xfr_pack_unit_cd, value);
	}

	/**
	 * ＩＦ荷姿振替荷姿単位ＣＤ（抜取）. IF SKU transfer SKU cd. (Sampling).<p>
	 *
	 */
	public String if_smpl_pack_xfr_pack_unit_cd() {
		return getConstString(offset + 74, $if_smpl_pack_xfr_pack_unit_cd);
	}

	/**
	 * ＩＦ荷姿振替荷姿単位ＣＤ（抜取）. IF SKU transfer SKU cd. (Sampling).<p>
	 *
	 */
	public void if_smpl_pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 74, $if_smpl_pack_xfr_pack_unit_cd, value);
	}

	/**
	 * ＩＦ荷姿振替荷姿単位名（抜取）. IF SKU transfer SKU name (Sampling).<p>
	 *
	 */
	public String if_smpl_pack_xfr_pack_unit_nm() {
		return getConstString(offset + 75, $if_smpl_pack_xfr_pack_unit_nm);
	}

	/**
	 * ＩＦ荷姿振替荷姿単位名（抜取）. IF SKU transfer SKU name (Sampling).<p>
	 *
	 */
	public void if_smpl_pack_xfr_pack_unit_nm(String value) {
		setConstString(offset + 75, $if_smpl_pack_xfr_pack_unit_nm, value);
	}

	/**
	 * 実績日時（抜取）. Actual date and time (Sampling).<p>
	 *
	 */
	public MCDate smpl_act_tm() {
		return getConstDate(offset + 76, $smpl_act_tm);
	}

	/**
	 * 実績日時（抜取）. Actual date and time (Sampling).<p>
	 *
	 */
	public void smpl_act_tm(MCDate value) {
		setConstDate(offset + 76, $smpl_act_tm, value);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 77, $bd_dpt_cd);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 77, $bd_dpt_cd, value);
	}

	/**
	 * ＩＦ負担部門ＣＤ. IF charged dept. cd..<p>
	 *
	 */
	public String if_bd_dpt_cd() {
		return getConstString(offset + 78, $if_bd_dpt_cd);
	}

	/**
	 * ＩＦ負担部門ＣＤ. IF charged dept. cd..<p>
	 *
	 */
	public void if_bd_dpt_cd(String value) {
		setConstString(offset + 78, $if_bd_dpt_cd, value);
	}

	/**
	 * ＩＦ負担部門名. IF charged dept. name.<p>
	 *
	 */
	public String if_bd_dpt_nm() {
		return getConstString(offset + 79, $if_bd_dpt_nm);
	}

	/**
	 * ＩＦ負担部門名. IF charged dept. name.<p>
	 *
	 */
	public void if_bd_dpt_nm(String value) {
		setConstString(offset + 79, $if_bd_dpt_nm, value);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 80, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 80, $trd_rmrks, value);
	}

	/**
	 * 内部備考（抜取）. Internal remarks (Sampling).<p>
	 *
	 */
	public String smpl_intr_rmrks() {
		return getConstString(offset + 81, $smpl_intr_rmrks);
	}

	/**
	 * 内部備考（抜取）. Internal remarks (Sampling).<p>
	 *
	 */
	public void smpl_intr_rmrks(String value) {
		setConstString(offset + 81, $smpl_intr_rmrks, value);
	}

	/**
	 * 外部検査抜取実績ＮＯ. External inspection sampling result No..<p>
	 *
	 */
	public String ext_insp_smpl_act_no() {
		return getConstString(offset + 82, $ext_insp_smpl_act_no);
	}

	/**
	 * 外部検査抜取実績ＮＯ. External inspection sampling result No..<p>
	 *
	 */
	public void ext_insp_smpl_act_no(String value) {
		setConstString(offset + 82, $ext_insp_smpl_act_no, value);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public String if_co_cd() {
		return getConstString(offset + 83, $if_co_cd);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public void if_co_cd(String value) {
		setConstString(offset + 83, $if_co_cd, value);
	}

	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public String if_co_nm() {
		return getConstString(offset + 84, $if_co_nm);
	}

	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public void if_co_nm(String value) {
		setConstString(offset + 84, $if_co_nm, value);
	}

	/**
	 * サーバリクエストＮＯ. Server request No..<p>
	 *
	 */
	public String req_no() {
		return getConstString(offset + 85, $req_no);
	}

	/**
	 * サーバリクエストＮＯ. Server request No..<p>
	 *
	 */
	public void req_no(String value) {
		setConstString(offset + 85, $req_no, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 86, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 86, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 87, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 87, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 88, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 88, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 89, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 89, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 90, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 90, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 91, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 91, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 92, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 92, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 93, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 93, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 94, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 94, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 95, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 95, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 96, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 96, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 97, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 97, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 98, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 98, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 99, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 99, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 100, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 100, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 101, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 101, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 102, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 102, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 103, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 103, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 104, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 104, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 105, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 105, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 106, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 106, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 107, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 107, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 108, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 108, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 109, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 109, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 110, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 110, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 111, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 111, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 112, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 112, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 113, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 113, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 114, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 114, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 115, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 115, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 116, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 116, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 116, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 116, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 116, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 116, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 117, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 117, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 117, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 117, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 117, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 117, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 118, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 118, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 118, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 118, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 118, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 118, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 119, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 119, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 119, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 119, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 119, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 119, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 120, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 120, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 120, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 120, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 120, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 120, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 121, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 121, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 122, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 122, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 123, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 123, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 124, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 124, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 125, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 125, $sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 126, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 126, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 127, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 127, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 127, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 127, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 127, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 127, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 128, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 128, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 128, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 128, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 128, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 128, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 129, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 129, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 130, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 130, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 131, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 131, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 132, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 132, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 133, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 133, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 133, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 133, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 133, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 133, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 134, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 134, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 135, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 135, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 136, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 136, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 137, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 137, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 138, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 138, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 139, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 139, $sdrv_sts_typ, value);
	}

	/**
	 * 在庫場所名. Inventory location name.<p>
	 *
	 */
	public String stk_loc_nm() {
		return getConstString(offset + 140, $stk_loc_nm);
	}

	/**
	 * 在庫場所名. Inventory location name.<p>
	 *
	 */
	public void stk_loc_nm(String value) {
		setConstString(offset + 140, $stk_loc_nm, value);
	}

	/**
	 * 実施担当者名. Implementation PC name.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 141, $act_usr_nm);
	}

	/**
	 * 実施担当者名. Implementation PC name.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 141, $act_usr_nm, value);
	}

	/**
	 * 実施担当部門名. Implementation dept. name.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 142, $act_dpt_nm);
	}

	/**
	 * 実施担当部門名. Implementation dept. name.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 142, $act_dpt_nm, value);
	}

	/**
	 * 判定者名. Decision PIC name.<p>
	 *
	 */
	public String judg_usr_nm() {
		return getConstString(offset + 143, $judg_usr_nm);
	}

	/**
	 * 判定者名. Decision PIC name.<p>
	 *
	 */
	public void judg_usr_nm(String value) {
		setConstString(offset + 143, $judg_usr_nm, value);
	}

	/**
	 * 判定部門名. Decision dept. name.<p>
	 *
	 */
	public String judg_dpt_nm() {
		return getConstString(offset + 144, $judg_dpt_nm);
	}

	/**
	 * 判定部門名. Decision dept. name.<p>
	 *
	 */
	public void judg_dpt_nm(String value) {
		setConstString(offset + 144, $judg_dpt_nm, value);
	}

	/**
	 * 荷姿振替荷姿単位名（抜取）. SKU transfer SKU name (Sampling).<p>
	 *
	 */
	public String smpl_pack_xfr_pack_unit_nm() {
		return getConstString(offset + 145, $smpl_pack_xfr_pack_unit_nm);
	}

	/**
	 * 荷姿振替荷姿単位名（抜取）. SKU transfer SKU name (Sampling).<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_nm(String value) {
		setConstString(offset + 145, $smpl_pack_xfr_pack_unit_nm, value);
	}

	/**
	 * 格付名（抜取）. Grading name (Sampling).<p>
	 *
	 */
	public String smpl_gd_nm() {
		return getConstString(offset + 146, $smpl_gd_nm);
	}

	/**
	 * 格付名（抜取）. Grading name (Sampling).<p>
	 *
	 */
	public void smpl_gd_nm(String value) {
		setConstString(offset + 146, $smpl_gd_nm, value);
	}

	/**
	 * 不良理由名（抜取）. Defective reason name (Sampling).<p>
	 *
	 */
	public String smpl_dfct_rsn_nm() {
		return getConstString(offset + 147, $smpl_dfct_rsn_nm);
	}

	/**
	 * 不良理由名（抜取）. Defective reason name (Sampling).<p>
	 *
	 */
	public void smpl_dfct_rsn_nm(String value) {
		setConstString(offset + 147, $smpl_dfct_rsn_nm, value);
	}

	/**
	 * 在庫棚・ライン名. Inventory rack/line name.<p>
	 *
	 */
	public String stk_str_ln_nm() {
		return getConstString(offset + 148, $stk_str_ln_nm);
	}

	/**
	 * 在庫棚・ライン名. Inventory rack/line name.<p>
	 *
	 */
	public void stk_str_ln_nm(String value) {
		setConstString(offset + 148, $stk_str_ln_nm, value);
	}

	/**
	 * 負担部門名. Charged dept. name.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 149, $bd_dpt_nm);
	}

	/**
	 * 負担部門名. Charged dept. name.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 149, $bd_dpt_nm, value);
	}

	/**
	 * 格付名（全数）. Grading name (100%).<p>
	 *
	 */
	public String ttl_gd_nm() {
		return getConstString(offset + 150, $ttl_gd_nm);
	}

	/**
	 * 格付名（全数）. Grading name (100%).<p>
	 *
	 */
	public void ttl_gd_nm(String value) {
		setConstString(offset + 150, $ttl_gd_nm, value);
	}

	/**
	 * 不良理由名（全数）. Defective reason name (100%).<p>
	 *
	 */
	public String ttl_dfct_rsn_nm() {
		return getConstString(offset + 151, $ttl_dfct_rsn_nm);
	}

	/**
	 * 不良理由名（全数）. Defective reason name (100%).<p>
	 *
	 */
	public void ttl_dfct_rsn_nm(String value) {
		setConstString(offset + 151, $ttl_dfct_rsn_nm, value);
	}

	/**
	 * 荷姿単位名. SKU name.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 152, $pack_unit_nm);
	}

	/**
	 * 荷姿単位名. SKU name.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 152, $pack_unit_nm, value);
	}

	/**
	 * 荷姿振替荷姿単位名（全数）. SKU transfer SKU name (100%).<p>
	 *
	 */
	public String ttl_pack_xfr_pack_unit_nm() {
		return getConstString(offset + 153, $ttl_pack_xfr_pack_unit_nm);
	}

	/**
	 * 荷姿振替荷姿単位名（全数）. SKU transfer SKU name (100%).<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_nm(String value) {
		setConstString(offset + 153, $ttl_pack_xfr_pack_unit_nm, value);
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
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($if_act_usr_cd.equalsIgnoreCase(name)) {
			return if_act_usr_cd();
		}
		if ($if_act_usr_nm.equalsIgnoreCase(name)) {
			return if_act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($if_act_dpt_cd.equalsIgnoreCase(name)) {
			return if_act_dpt_cd();
		}
		if ($if_act_dpt_nm.equalsIgnoreCase(name)) {
			return if_act_dpt_nm();
		}
		if ($smpl_quality_typ.equalsIgnoreCase(name)) {
			return smpl_quality_typ();
		}
		if ($smpl_gd_cd.equalsIgnoreCase(name)) {
			return smpl_gd_cd();
		}
		if ($if_smpl_gd_cd.equalsIgnoreCase(name)) {
			return if_smpl_gd_cd();
		}
		if ($if_smpl_gd_nm.equalsIgnoreCase(name)) {
			return if_smpl_gd_nm();
		}
		if ($smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return smpl_dfct_rsn_cd();
		}
		if ($if_smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return if_smpl_dfct_rsn_cd();
		}
		if ($if_smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return if_smpl_dfct_rsn_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($if_judg_usr_cd.equalsIgnoreCase(name)) {
			return if_judg_usr_cd();
		}
		if ($if_judg_usr_nm.equalsIgnoreCase(name)) {
			return if_judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($if_judg_dpt_cd.equalsIgnoreCase(name)) {
			return if_judg_dpt_cd();
		}
		if ($if_judg_dpt_nm.equalsIgnoreCase(name)) {
			return if_judg_dpt_nm();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($if_stk_loc_cd.equalsIgnoreCase(name)) {
			return if_stk_loc_cd();
		}
		if ($if_stk_loc_nm.equalsIgnoreCase(name)) {
			return if_stk_loc_nm();
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			return stk_str_ln_cd();
		}
		if ($if_stk_str_ln_cd.equalsIgnoreCase(name)) {
			return if_stk_str_ln_cd();
		}
		if ($if_stk_str_ln_nm.equalsIgnoreCase(name)) {
			return if_stk_str_ln_nm();
		}
		if ($ttl_quality_typ.equalsIgnoreCase(name)) {
			return ttl_quality_typ();
		}
		if ($ttl_gd_cd.equalsIgnoreCase(name)) {
			return ttl_gd_cd();
		}
		if ($if_ttl_gd_cd.equalsIgnoreCase(name)) {
			return if_ttl_gd_cd();
		}
		if ($if_ttl_gd_nm.equalsIgnoreCase(name)) {
			return if_ttl_gd_nm();
		}
		if ($ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return ttl_dfct_rsn_cd();
		}
		if ($if_ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return if_ttl_dfct_rsn_cd();
		}
		if ($if_ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return if_ttl_dfct_rsn_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($if_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_pack_unit_cd();
		}
		if ($if_pack_unit_nm.equalsIgnoreCase(name)) {
			return if_pack_unit_nm();
		}
		if ($ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_cd();
		}
		if ($if_ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_ttl_pack_xfr_pack_unit_cd();
		}
		if ($if_ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return if_ttl_pack_xfr_pack_unit_nm();
		}
		if ($ttl_intr_rmrks.equalsIgnoreCase(name)) {
			return ttl_intr_rmrks();
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			return ext_insp_act_d_no();
		}
		if ($smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_cd();
		}
		if ($if_smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_smpl_pack_xfr_pack_unit_cd();
		}
		if ($if_smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return if_smpl_pack_xfr_pack_unit_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($if_bd_dpt_cd.equalsIgnoreCase(name)) {
			return if_bd_dpt_cd();
		}
		if ($if_bd_dpt_nm.equalsIgnoreCase(name)) {
			return if_bd_dpt_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($smpl_intr_rmrks.equalsIgnoreCase(name)) {
			return smpl_intr_rmrks();
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			return ext_insp_smpl_act_no();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			return if_co_nm();
		}
		if ($req_no.equalsIgnoreCase(name)) {
			return req_no();
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
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			return stk_loc_nm();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_nm();
		}
		if ($smpl_gd_nm.equalsIgnoreCase(name)) {
			return smpl_gd_nm();
		}
		if ($smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return smpl_dfct_rsn_nm();
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			return stk_str_ln_nm();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($ttl_gd_nm.equalsIgnoreCase(name)) {
			return ttl_gd_nm();
		}
		if ($ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return ttl_dfct_rsn_nm();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_nm();
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_qty();
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			return so_qty();
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			return smpl_qty();
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_qty();
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			return recv_dt();
		}
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($ttl_act_tm.equalsIgnoreCase(name)) {
			return ttl_act_tm();
		}
		if ($smpl_act_tm.equalsIgnoreCase(name)) {
			return smpl_act_tm();
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
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		if ($imp_only_judg.equalsIgnoreCase(name)) {
			return imp_only_judg();
		}
		if ($base_flg.equalsIgnoreCase(name)) {
			return base_flg();
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
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($if_act_usr_cd.equalsIgnoreCase(name)) {
			return if_act_usr_cd();
		}
		if ($if_act_usr_nm.equalsIgnoreCase(name)) {
			return if_act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($if_act_dpt_cd.equalsIgnoreCase(name)) {
			return if_act_dpt_cd();
		}
		if ($if_act_dpt_nm.equalsIgnoreCase(name)) {
			return if_act_dpt_nm();
		}
		if ($smpl_quality_typ.equalsIgnoreCase(name)) {
			return smpl_quality_typ();
		}
		if ($smpl_gd_cd.equalsIgnoreCase(name)) {
			return smpl_gd_cd();
		}
		if ($if_smpl_gd_cd.equalsIgnoreCase(name)) {
			return if_smpl_gd_cd();
		}
		if ($if_smpl_gd_nm.equalsIgnoreCase(name)) {
			return if_smpl_gd_nm();
		}
		if ($smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return smpl_dfct_rsn_cd();
		}
		if ($if_smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return if_smpl_dfct_rsn_cd();
		}
		if ($if_smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return if_smpl_dfct_rsn_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($if_judg_usr_cd.equalsIgnoreCase(name)) {
			return if_judg_usr_cd();
		}
		if ($if_judg_usr_nm.equalsIgnoreCase(name)) {
			return if_judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($if_judg_dpt_cd.equalsIgnoreCase(name)) {
			return if_judg_dpt_cd();
		}
		if ($if_judg_dpt_nm.equalsIgnoreCase(name)) {
			return if_judg_dpt_nm();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($if_stk_loc_cd.equalsIgnoreCase(name)) {
			return if_stk_loc_cd();
		}
		if ($if_stk_loc_nm.equalsIgnoreCase(name)) {
			return if_stk_loc_nm();
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			return stk_str_ln_cd();
		}
		if ($if_stk_str_ln_cd.equalsIgnoreCase(name)) {
			return if_stk_str_ln_cd();
		}
		if ($if_stk_str_ln_nm.equalsIgnoreCase(name)) {
			return if_stk_str_ln_nm();
		}
		if ($ttl_quality_typ.equalsIgnoreCase(name)) {
			return ttl_quality_typ();
		}
		if ($ttl_gd_cd.equalsIgnoreCase(name)) {
			return ttl_gd_cd();
		}
		if ($if_ttl_gd_cd.equalsIgnoreCase(name)) {
			return if_ttl_gd_cd();
		}
		if ($if_ttl_gd_nm.equalsIgnoreCase(name)) {
			return if_ttl_gd_nm();
		}
		if ($ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return ttl_dfct_rsn_cd();
		}
		if ($if_ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return if_ttl_dfct_rsn_cd();
		}
		if ($if_ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return if_ttl_dfct_rsn_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($if_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_pack_unit_cd();
		}
		if ($if_pack_unit_nm.equalsIgnoreCase(name)) {
			return if_pack_unit_nm();
		}
		if ($ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_cd();
		}
		if ($if_ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_ttl_pack_xfr_pack_unit_cd();
		}
		if ($if_ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return if_ttl_pack_xfr_pack_unit_nm();
		}
		if ($ttl_intr_rmrks.equalsIgnoreCase(name)) {
			return ttl_intr_rmrks();
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			return ext_insp_act_d_no();
		}
		if ($smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_cd();
		}
		if ($if_smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_smpl_pack_xfr_pack_unit_cd();
		}
		if ($if_smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return if_smpl_pack_xfr_pack_unit_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($if_bd_dpt_cd.equalsIgnoreCase(name)) {
			return if_bd_dpt_cd();
		}
		if ($if_bd_dpt_nm.equalsIgnoreCase(name)) {
			return if_bd_dpt_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($smpl_intr_rmrks.equalsIgnoreCase(name)) {
			return smpl_intr_rmrks();
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			return ext_insp_smpl_act_no();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			return if_co_nm();
		}
		if ($req_no.equalsIgnoreCase(name)) {
			return req_no();
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
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			return stk_loc_nm();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_nm();
		}
		if ($smpl_gd_nm.equalsIgnoreCase(name)) {
			return smpl_gd_nm();
		}
		if ($smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return smpl_dfct_rsn_nm();
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			return stk_str_ln_nm();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($ttl_gd_nm.equalsIgnoreCase(name)) {
			return ttl_gd_nm();
		}
		if ($ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return ttl_dfct_rsn_nm();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_nm();
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_qty();
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			return so_qty();
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			return smpl_qty();
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_qty();
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			return recv_dt();
		}
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($ttl_act_tm.equalsIgnoreCase(name)) {
			return ttl_act_tm();
		}
		if ($smpl_act_tm.equalsIgnoreCase(name)) {
			return smpl_act_tm();
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
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		if ($imp_only_judg.equalsIgnoreCase(name)) {
			return imp_only_judg();
		}
		if ($base_flg.equalsIgnoreCase(name)) {
			return base_flg();
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
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($if_act_usr_cd.equalsIgnoreCase(name)) {
			if_act_usr_cd(value);
			return;
		}
		if ($if_act_usr_nm.equalsIgnoreCase(name)) {
			if_act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($if_act_dpt_cd.equalsIgnoreCase(name)) {
			if_act_dpt_cd(value);
			return;
		}
		if ($if_act_dpt_nm.equalsIgnoreCase(name)) {
			if_act_dpt_nm(value);
			return;
		}
		if ($smpl_quality_typ.equalsIgnoreCase(name)) {
			smpl_quality_typ(value);
			return;
		}
		if ($smpl_gd_cd.equalsIgnoreCase(name)) {
			smpl_gd_cd(value);
			return;
		}
		if ($if_smpl_gd_cd.equalsIgnoreCase(name)) {
			if_smpl_gd_cd(value);
			return;
		}
		if ($if_smpl_gd_nm.equalsIgnoreCase(name)) {
			if_smpl_gd_nm(value);
			return;
		}
		if ($smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			smpl_dfct_rsn_cd(value);
			return;
		}
		if ($if_smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			if_smpl_dfct_rsn_cd(value);
			return;
		}
		if ($if_smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			if_smpl_dfct_rsn_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($if_judg_usr_cd.equalsIgnoreCase(name)) {
			if_judg_usr_cd(value);
			return;
		}
		if ($if_judg_usr_nm.equalsIgnoreCase(name)) {
			if_judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($if_judg_dpt_cd.equalsIgnoreCase(name)) {
			if_judg_dpt_cd(value);
			return;
		}
		if ($if_judg_dpt_nm.equalsIgnoreCase(name)) {
			if_judg_dpt_nm(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($if_stk_loc_cd.equalsIgnoreCase(name)) {
			if_stk_loc_cd(value);
			return;
		}
		if ($if_stk_loc_nm.equalsIgnoreCase(name)) {
			if_stk_loc_nm(value);
			return;
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			stk_str_ln_cd(value);
			return;
		}
		if ($if_stk_str_ln_cd.equalsIgnoreCase(name)) {
			if_stk_str_ln_cd(value);
			return;
		}
		if ($if_stk_str_ln_nm.equalsIgnoreCase(name)) {
			if_stk_str_ln_nm(value);
			return;
		}
		if ($ttl_quality_typ.equalsIgnoreCase(name)) {
			ttl_quality_typ(value);
			return;
		}
		if ($ttl_gd_cd.equalsIgnoreCase(name)) {
			ttl_gd_cd(value);
			return;
		}
		if ($if_ttl_gd_cd.equalsIgnoreCase(name)) {
			if_ttl_gd_cd(value);
			return;
		}
		if ($if_ttl_gd_nm.equalsIgnoreCase(name)) {
			if_ttl_gd_nm(value);
			return;
		}
		if ($ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			ttl_dfct_rsn_cd(value);
			return;
		}
		if ($if_ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			if_ttl_dfct_rsn_cd(value);
			return;
		}
		if ($if_ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			if_ttl_dfct_rsn_nm(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($if_pack_unit_cd.equalsIgnoreCase(name)) {
			if_pack_unit_cd(value);
			return;
		}
		if ($if_pack_unit_nm.equalsIgnoreCase(name)) {
			if_pack_unit_nm(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($if_ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			if_ttl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($if_ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			if_ttl_pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($ttl_intr_rmrks.equalsIgnoreCase(name)) {
			ttl_intr_rmrks(value);
			return;
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			ext_insp_act_d_no(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($if_smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			if_smpl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($if_smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			if_smpl_pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($if_bd_dpt_cd.equalsIgnoreCase(name)) {
			if_bd_dpt_cd(value);
			return;
		}
		if ($if_bd_dpt_nm.equalsIgnoreCase(name)) {
			if_bd_dpt_nm(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($smpl_intr_rmrks.equalsIgnoreCase(name)) {
			smpl_intr_rmrks(value);
			return;
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			ext_insp_smpl_act_no(value);
			return;
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			if_co_nm(value);
			return;
		}
		if ($req_no.equalsIgnoreCase(name)) {
			req_no(value);
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
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			stk_loc_nm(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($smpl_gd_nm.equalsIgnoreCase(name)) {
			smpl_gd_nm(value);
			return;
		}
		if ($smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			smpl_dfct_rsn_nm(value);
			return;
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			stk_str_ln_nm(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($ttl_gd_nm.equalsIgnoreCase(name)) {
			ttl_gd_nm(value);
			return;
		}
		if ($ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			ttl_dfct_rsn_nm(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_nm(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			recv_dt(value);
			return;
		}
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			end_act_tm(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($ttl_act_tm.equalsIgnoreCase(name)) {
			ttl_act_tm(value);
			return;
		}
		if ($smpl_act_tm.equalsIgnoreCase(name)) {
			smpl_act_tm(value);
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		if ($imp_only_judg.equalsIgnoreCase(name)) {
			imp_only_judg(value);
			return;
		}
		if ($base_flg.equalsIgnoreCase(name)) {
			base_flg(value);
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
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($if_act_usr_cd.equalsIgnoreCase(name)) {
			if_act_usr_cd(value);
			return;
		}
		if ($if_act_usr_nm.equalsIgnoreCase(name)) {
			if_act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($if_act_dpt_cd.equalsIgnoreCase(name)) {
			if_act_dpt_cd(value);
			return;
		}
		if ($if_act_dpt_nm.equalsIgnoreCase(name)) {
			if_act_dpt_nm(value);
			return;
		}
		if ($smpl_quality_typ.equalsIgnoreCase(name)) {
			smpl_quality_typ(value);
			return;
		}
		if ($smpl_gd_cd.equalsIgnoreCase(name)) {
			smpl_gd_cd(value);
			return;
		}
		if ($if_smpl_gd_cd.equalsIgnoreCase(name)) {
			if_smpl_gd_cd(value);
			return;
		}
		if ($if_smpl_gd_nm.equalsIgnoreCase(name)) {
			if_smpl_gd_nm(value);
			return;
		}
		if ($smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			smpl_dfct_rsn_cd(value);
			return;
		}
		if ($if_smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			if_smpl_dfct_rsn_cd(value);
			return;
		}
		if ($if_smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			if_smpl_dfct_rsn_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($if_judg_usr_cd.equalsIgnoreCase(name)) {
			if_judg_usr_cd(value);
			return;
		}
		if ($if_judg_usr_nm.equalsIgnoreCase(name)) {
			if_judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($if_judg_dpt_cd.equalsIgnoreCase(name)) {
			if_judg_dpt_cd(value);
			return;
		}
		if ($if_judg_dpt_nm.equalsIgnoreCase(name)) {
			if_judg_dpt_nm(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($if_stk_loc_cd.equalsIgnoreCase(name)) {
			if_stk_loc_cd(value);
			return;
		}
		if ($if_stk_loc_nm.equalsIgnoreCase(name)) {
			if_stk_loc_nm(value);
			return;
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			stk_str_ln_cd(value);
			return;
		}
		if ($if_stk_str_ln_cd.equalsIgnoreCase(name)) {
			if_stk_str_ln_cd(value);
			return;
		}
		if ($if_stk_str_ln_nm.equalsIgnoreCase(name)) {
			if_stk_str_ln_nm(value);
			return;
		}
		if ($ttl_quality_typ.equalsIgnoreCase(name)) {
			ttl_quality_typ(value);
			return;
		}
		if ($ttl_gd_cd.equalsIgnoreCase(name)) {
			ttl_gd_cd(value);
			return;
		}
		if ($if_ttl_gd_cd.equalsIgnoreCase(name)) {
			if_ttl_gd_cd(value);
			return;
		}
		if ($if_ttl_gd_nm.equalsIgnoreCase(name)) {
			if_ttl_gd_nm(value);
			return;
		}
		if ($ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			ttl_dfct_rsn_cd(value);
			return;
		}
		if ($if_ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			if_ttl_dfct_rsn_cd(value);
			return;
		}
		if ($if_ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			if_ttl_dfct_rsn_nm(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($if_pack_unit_cd.equalsIgnoreCase(name)) {
			if_pack_unit_cd(value);
			return;
		}
		if ($if_pack_unit_nm.equalsIgnoreCase(name)) {
			if_pack_unit_nm(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($if_ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			if_ttl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($if_ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			if_ttl_pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($ttl_intr_rmrks.equalsIgnoreCase(name)) {
			ttl_intr_rmrks(value);
			return;
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			ext_insp_act_d_no(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($if_smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			if_smpl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($if_smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			if_smpl_pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($if_bd_dpt_cd.equalsIgnoreCase(name)) {
			if_bd_dpt_cd(value);
			return;
		}
		if ($if_bd_dpt_nm.equalsIgnoreCase(name)) {
			if_bd_dpt_nm(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($smpl_intr_rmrks.equalsIgnoreCase(name)) {
			smpl_intr_rmrks(value);
			return;
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			ext_insp_smpl_act_no(value);
			return;
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			if_co_nm(value);
			return;
		}
		if ($req_no.equalsIgnoreCase(name)) {
			req_no(value);
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
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			stk_loc_nm(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($smpl_gd_nm.equalsIgnoreCase(name)) {
			smpl_gd_nm(value);
			return;
		}
		if ($smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			smpl_dfct_rsn_nm(value);
			return;
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			stk_str_ln_nm(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($ttl_gd_nm.equalsIgnoreCase(name)) {
			ttl_gd_nm(value);
			return;
		}
		if ($ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			ttl_dfct_rsn_nm(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_nm(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
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
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
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
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			recv_dt(value);
			return;
		}
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			end_act_tm(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($ttl_act_tm.equalsIgnoreCase(name)) {
			ttl_act_tm(value);
			return;
		}
		if ($smpl_act_tm.equalsIgnoreCase(name)) {
			smpl_act_tm(value);
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		if ($imp_only_judg.equalsIgnoreCase(name)) {
			imp_only_judg(value);
			return;
		}
		if ($base_flg.equalsIgnoreCase(name)) {
			base_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
