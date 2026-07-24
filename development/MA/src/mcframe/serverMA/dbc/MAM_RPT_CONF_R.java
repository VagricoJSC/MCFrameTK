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
 * "原価レポート構成マスタ // Cost report structure master"DBコンテナRowクラスです。<p>
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
 *  	<td>rpt_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>レポートパタンＣＤ</td>
 *  	<td>Report pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>rpt_row_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>レポート行ＣＤ</td>
 *  	<td>Report row cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_pre_word</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>接頭語</td>
 *  	<td>Prefix</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_row_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>レポート行名</td>
 *  	<td>Report row name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_rpt_row_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>レポート行名（ベース）</td>
 *  	<td>Report row name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>表示順</td>
 *  	<td>Display order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sml_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計行ＦＬＧ</td>
 *  	<td>Aggregated row flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>hdn_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非表示ＦＬＧ</td>
 *  	<td>Hide flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_tgt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>レポート対象区分</td>
 *  	<td>Report type</td>
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
 *  	<td>asst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資産区分</td>
 *  	<td>Asset type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準ＦＬＧ</td>
 *  	<td>Standard flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty_unit_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数量単位区分</td>
 *  	<td>Quantity unit type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_grp_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目グループ１</td>
 *  	<td>Allocation account group 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_ac_grp_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目グループ２</td>
 *  	<td>Allocation account group 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_grp_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目グループ３</td>
 *  	<td>Allocation account group 3</td>
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
 *  	<td>ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計伝票区分</td>
 *  	<td>Accounting slip type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由ＣＤ</td>
 *  	<td>Accounting reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_jnl_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕訳ＣＤ</td>
 *  	<td>Item journal cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ１</td>
 *  	<td>Item classification cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ２</td>
 *  	<td>Item classification cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ３</td>
 *  	<td>Item classification cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ４</td>
 *  	<td>Item classification cd. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ５</td>
 *  	<td>Item classification cd. 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd6</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ６</td>
 *  	<td>Item classification cd. 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd7</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ７</td>
 *  	<td>Item classification cd. 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd8</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ８</td>
 *  	<td>Item classification cd. 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd9</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ９</td>
 *  	<td>Item classification cd. 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd10</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ１０</td>
 *  	<td>Item classification cd. 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>expns_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>費目区分</td>
 *  	<td>Cost element type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>direct_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>直間区分</td>
 *  	<td>Direct/Indirect type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>var_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固変区分</td>
 *  	<td>Constant/variable type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>expns_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>費目グループＣＤ</td>
 *  	<td>Cost element group cd.</td>
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
 *  	<td>fg_r</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前景色（Ｒ）</td>
 *  	<td>Foreground color (R)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fg_g</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前景色（Ｇ）</td>
 *  	<td>Foreground color (G)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fg_b</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前景色（Ｂ）</td>
 *  	<td>Foreground color (B)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bg_r</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>背景色（Ｒ）</td>
 *  	<td>Background color (R)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bg_g</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>背景色（Ｇ）</td>
 *  	<td>Background color (G)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bg_b</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>背景色（Ｂ）</td>
 *  	<td>Background color (B)</td>
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
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_ptn_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>RPT_PTN1.RPT_PTN_NM</td>
 *  	<td>レポートパタン名</td>
 *  	<td>Report pattern name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>ALC_AC1.ALC_AC_NM</td>
 *  	<td>配賦科目名</td>
 *  	<td>Allocation account name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>AC_RSN1.AC_RSN_NM</td>
 *  	<td>会計理由名</td>
 *  	<td>Accounting reason name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_jnl_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>ITM_JNL1.ITM_JNL_NM</td>
 *  	<td>品目仕訳名</td>
 *  	<td>Item journal name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>expns_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS_GRP1.EXPNS_GRP_NM</td>
 *  	<td>費目グループ名</td>
 *  	<td>Cost element group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS1.EXPNS_NM</td>
 *  	<td>費目名</td>
 *  	<td>Cost element name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_ac_grp_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目グループ名１</td>
 *  	<td>Allocation account group name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_grp_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目グループ名２</td>
 *  	<td>Allocation account group name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_ac_grp_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目グループ名３</td>
 *  	<td>Allocation account group name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１</td>
 *  	<td>Item classification name 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名２</td>
 *  	<td>Item classification name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名３</td>
 *  	<td>Item classification name 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名４</td>
 *  	<td>Item classification name 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名５</td>
 *  	<td>Item classification name 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm6</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名６</td>
 *  	<td>Item classification name 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm7</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名７</td>
 *  	<td>Item classification name 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm8</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名８</td>
 *  	<td>Item classification name 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm9</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名９</td>
 *  	<td>Item classification name 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm10</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１０</td>
 *  	<td>Item classification name 10</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_RPT_CONF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_RPT_CONF";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * レポートパタンＣＤ. Report pattern cd..<p>
	 *
	 */
	public static final String $rpt_ptn_cd = "rpt_ptn_cd";
	private static final MCPermColumnInfo _rpt_ptn_cd = createColumnInfo("rpt_ptn_cd");
	public final MCStringPermColumn rpt_ptn_cd = createStringColumn(_rpt_ptn_cd);
	
	/**
	 * レポート行ＣＤ. Report row cd..<p>
	 *
	 */
	public static final String $rpt_row_cd = "rpt_row_cd";
	private static final MCPermColumnInfo _rpt_row_cd = createColumnInfo("rpt_row_cd");
	public final MCStringPermColumn rpt_row_cd = createStringColumn(_rpt_row_cd);
	
	/**
	 * 接頭語. Prefix.<p>
	 *
	 */
	public static final String $rpt_pre_word = "rpt_pre_word";
	private static final MCPermColumnInfo _rpt_pre_word = createColumnInfo("rpt_pre_word");
	public final MCStringPermColumn rpt_pre_word = createStringColumn(_rpt_pre_word);
	
	/**
	 * レポート行名. Report row name.<p>
	 *
	 */
	public static final String $rpt_row_nm = "rpt_row_nm";
	private static final MCPermColumnInfo _rpt_row_nm = createColumnInfo("rpt_row_nm");
	public final MCStringPermColumn rpt_row_nm = createStringColumn(_rpt_row_nm);
	
	/**
	 * レポート行名（ベース）. Report row name(Base).<p>
	 *
	 */
	public static final String $base_rpt_row_nm = "base_rpt_row_nm";
	private static final MCPermColumnInfo _base_rpt_row_nm = createColumnInfo("base_rpt_row_nm");
	public final MCStringPermColumn base_rpt_row_nm = createStringColumn(_base_rpt_row_nm);
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public static final String $rpt_seq = "rpt_seq";
	private static final MCPermColumnInfo _rpt_seq = createColumnInfo("rpt_seq");
	public final MCNumberPermColumn rpt_seq = createNumberColumn(_rpt_seq);
	
	/**
	 * 集計行ＦＬＧ. Aggregated row flg..<p>
	 *
	 */
	public static final String $sml_flg = "sml_flg";
	private static final MCPermColumnInfo _sml_flg = createColumnInfo("sml_flg");
	public final MCBooleanPermColumn sml_flg = createBooleanColumn(_sml_flg);
	
	/**
	 * 非表示ＦＬＧ. Hide flg..<p>
	 *
	 */
	public static final String $hdn_flg = "hdn_flg";
	private static final MCPermColumnInfo _hdn_flg = createColumnInfo("hdn_flg");
	public final MCBooleanPermColumn hdn_flg = createBooleanColumn(_hdn_flg);
	
	/**
	 * レポート対象区分. Report type.<p>
	 *
	 */
	public static final String $rpt_tgt_typ = "rpt_tgt_typ";
	private static final MCPermColumnInfo _rpt_tgt_typ = createColumnInfo("rpt_tgt_typ");
	public final MCStringPermColumn rpt_tgt_typ = createStringColumn(_rpt_tgt_typ);
	
	/**
	 * 原価入出庫区分. Cost GR/GI type.<p>
	 *
	 */
	public static final String $cost_io_typ = "cost_io_typ";
	private static final MCPermColumnInfo _cost_io_typ = createColumnInfo("cost_io_typ");
	public final MCStringPermColumn cost_io_typ = createStringColumn(_cost_io_typ);
	
	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	private static final MCPermColumnInfo _asst_typ = createColumnInfo("asst_typ");
	public final MCStringPermColumn asst_typ = createStringColumn(_asst_typ);
	
	/**
	 * 標準ＦＬＧ. Standard flg..<p>
	 *
	 */
	public static final String $std_flg = "std_flg";
	private static final MCPermColumnInfo _std_flg = createColumnInfo("std_flg");
	public final MCBooleanPermColumn std_flg = createBooleanColumn(_std_flg);
	
	/**
	 * 数量単位区分. Quantity unit type.<p>
	 *
	 */
	public static final String $qty_unit_typ = "qty_unit_typ";
	private static final MCPermColumnInfo _qty_unit_typ = createColumnInfo("qty_unit_typ");
	public final MCStringPermColumn qty_unit_typ = createStringColumn(_qty_unit_typ);
	
	/**
	 * 配賦科目グループ１. Allocation account group 1.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd1 = "alc_ac_grp_cd1";
	private static final MCPermColumnInfo _alc_ac_grp_cd1 = createColumnInfo("alc_ac_grp_cd1");
	public final MCStringPermColumn alc_ac_grp_cd1 = createStringColumn(_alc_ac_grp_cd1);
	
	/**
	 * 配賦科目グループ２. Allocation account group 2.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd2 = "alc_ac_grp_cd2";
	private static final MCPermColumnInfo _alc_ac_grp_cd2 = createColumnInfo("alc_ac_grp_cd2");
	public final MCStringPermColumn alc_ac_grp_cd2 = createStringColumn(_alc_ac_grp_cd2);
	
	/**
	 * 配賦科目グループ３. Allocation account group 3.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd3 = "alc_ac_grp_cd3";
	private static final MCPermColumnInfo _alc_ac_grp_cd3 = createColumnInfo("alc_ac_grp_cd3");
	public final MCStringPermColumn alc_ac_grp_cd3 = createStringColumn(_alc_ac_grp_cd3);
	
	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	private static final MCPermColumnInfo _alc_ac_cd = createColumnInfo("alc_ac_cd");
	public final MCStringPermColumn alc_ac_cd = createStringColumn(_alc_ac_cd);
	
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
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	private static final MCPermColumnInfo _itm_jnl_cd = createColumnInfo("itm_jnl_cd");
	public final MCStringPermColumn itm_jnl_cd = createStringColumn(_itm_jnl_cd);
	
	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	private static final MCPermColumnInfo _itm_grp_cd1 = createColumnInfo("itm_grp_cd1");
	public final MCStringPermColumn itm_grp_cd1 = createStringColumn(_itm_grp_cd1);
	
	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	private static final MCPermColumnInfo _itm_grp_cd2 = createColumnInfo("itm_grp_cd2");
	public final MCStringPermColumn itm_grp_cd2 = createStringColumn(_itm_grp_cd2);
	
	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	private static final MCPermColumnInfo _itm_grp_cd3 = createColumnInfo("itm_grp_cd3");
	public final MCStringPermColumn itm_grp_cd3 = createStringColumn(_itm_grp_cd3);
	
	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	private static final MCPermColumnInfo _itm_grp_cd4 = createColumnInfo("itm_grp_cd4");
	public final MCStringPermColumn itm_grp_cd4 = createStringColumn(_itm_grp_cd4);
	
	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	private static final MCPermColumnInfo _itm_grp_cd5 = createColumnInfo("itm_grp_cd5");
	public final MCStringPermColumn itm_grp_cd5 = createStringColumn(_itm_grp_cd5);
	
	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	private static final MCPermColumnInfo _itm_grp_cd6 = createColumnInfo("itm_grp_cd6");
	public final MCStringPermColumn itm_grp_cd6 = createStringColumn(_itm_grp_cd6);
	
	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	private static final MCPermColumnInfo _itm_grp_cd7 = createColumnInfo("itm_grp_cd7");
	public final MCStringPermColumn itm_grp_cd7 = createStringColumn(_itm_grp_cd7);
	
	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	private static final MCPermColumnInfo _itm_grp_cd8 = createColumnInfo("itm_grp_cd8");
	public final MCStringPermColumn itm_grp_cd8 = createStringColumn(_itm_grp_cd8);
	
	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	private static final MCPermColumnInfo _itm_grp_cd9 = createColumnInfo("itm_grp_cd9");
	public final MCStringPermColumn itm_grp_cd9 = createStringColumn(_itm_grp_cd9);
	
	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	private static final MCPermColumnInfo _itm_grp_cd10 = createColumnInfo("itm_grp_cd10");
	public final MCStringPermColumn itm_grp_cd10 = createStringColumn(_itm_grp_cd10);
	
	/**
	 * 費目区分. Cost element type.<p>
	 *
	 */
	public static final String $expns_typ = "expns_typ";
	private static final MCPermColumnInfo _expns_typ = createColumnInfo("expns_typ");
	public final MCStringPermColumn expns_typ = createStringColumn(_expns_typ);
	
	/**
	 * 直間区分. Direct/Indirect type.<p>
	 *
	 */
	public static final String $direct_typ = "direct_typ";
	private static final MCPermColumnInfo _direct_typ = createColumnInfo("direct_typ");
	public final MCStringPermColumn direct_typ = createStringColumn(_direct_typ);
	
	/**
	 * 固変区分. Constant/variable type.<p>
	 *
	 */
	public static final String $var_typ = "var_typ";
	private static final MCPermColumnInfo _var_typ = createColumnInfo("var_typ");
	public final MCStringPermColumn var_typ = createStringColumn(_var_typ);
	
	/**
	 * 費目グループＣＤ. Cost element group cd..<p>
	 *
	 */
	public static final String $expns_grp_cd = "expns_grp_cd";
	private static final MCPermColumnInfo _expns_grp_cd = createColumnInfo("expns_grp_cd");
	public final MCStringPermColumn expns_grp_cd = createStringColumn(_expns_grp_cd);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public static final String $fg_r = "fg_r";
	private static final MCPermColumnInfo _fg_r = createColumnInfo("fg_r");
	public final MCNumberPermColumn fg_r = createNumberColumn(_fg_r);
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public static final String $fg_g = "fg_g";
	private static final MCPermColumnInfo _fg_g = createColumnInfo("fg_g");
	public final MCNumberPermColumn fg_g = createNumberColumn(_fg_g);
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public static final String $fg_b = "fg_b";
	private static final MCPermColumnInfo _fg_b = createColumnInfo("fg_b");
	public final MCNumberPermColumn fg_b = createNumberColumn(_fg_b);
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public static final String $bg_r = "bg_r";
	private static final MCPermColumnInfo _bg_r = createColumnInfo("bg_r");
	public final MCNumberPermColumn bg_r = createNumberColumn(_bg_r);
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public static final String $bg_g = "bg_g";
	private static final MCPermColumnInfo _bg_g = createColumnInfo("bg_g");
	public final MCNumberPermColumn bg_g = createNumberColumn(_bg_g);
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public static final String $bg_b = "bg_b";
	private static final MCPermColumnInfo _bg_b = createColumnInfo("bg_b");
	public final MCNumberPermColumn bg_b = createNumberColumn(_bg_b);
	
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
	
	/**
	 * レポートパタン名. Report pattern name.<p>
	 *
	 */
	public static final String $rpt_ptn_nm = "rpt_ptn_nm";
	
	/**
	 * 配賦科目名. Allocation account name.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	
	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	
	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	
	/**
	 * 費目グループ名. Cost element group name.<p>
	 *
	 */
	public static final String $expns_grp_nm = "expns_grp_nm";
	
	/**
	 * 費目名. Cost element name.<p>
	 *
	 */
	public static final String $expns_nm = "expns_nm";
	
	/**
	 * 配賦科目グループ名１. Allocation account group name 1.<p>
	 *
	 */
	public static final String $alc_ac_grp_nm1 = "alc_ac_grp_nm1";
	
	/**
	 * 配賦科目グループ名２. Allocation account group name 2.<p>
	 *
	 */
	public static final String $alc_ac_grp_nm2 = "alc_ac_grp_nm2";
	
	/**
	 * 配賦科目グループ名３. Allocation account group name 3.<p>
	 *
	 */
	public static final String $alc_ac_grp_nm3 = "alc_ac_grp_nm3";
	
	/**
	 * 品目分類名１. Item classification name 1.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	
	/**
	 * 品目分類名２. Item classification name 2.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	
	/**
	 * 品目分類名３. Item classification name 3.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	
	/**
	 * 品目分類名４. Item classification name 4.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	
	/**
	 * 品目分類名５. Item classification name 5.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	
	/**
	 * 品目分類名６. Item classification name 6.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	
	/**
	 * 品目分類名７. Item classification name 7.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	
	/**
	 * 品目分類名８. Item classification name 8.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	
	/**
	 * 品目分類名９. Item classification name 9.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	
	/**
	 * 品目分類名１０. Item classification name 10.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	
	public static final MCMeta rpt_ptn_cd_META = createCommonMeta($rpt_ptn_cd, mcframe.commonMA.meta.MA_META.RPT_PTN_CD);
	public static final MCMeta rpt_row_cd_META = createCommonMeta($rpt_row_cd, mcframe.commonMA.meta.MA_META.RPT_ROW_CD);
	public static final MCMeta rpt_pre_word_META = createCommonMeta($rpt_pre_word, mcframe.commonMA.meta.MA_META.RPT_PRE_WORD);
	public static final MCMeta rpt_row_nm_META = createCommonMeta($rpt_row_nm, mcframe.commonMA.meta.MA_META.RPT_ROW_NM);
	public static final MCMeta base_rpt_row_nm_META = createCommonMeta($base_rpt_row_nm, mcframe.commonMA.meta.MA_META.RPT_ROW_NM);
	public static final MCMeta rpt_seq_META = createCommonMeta($rpt_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta sml_flg_META = createCommonMeta($sml_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdn_flg_META = createCommonMeta($hdn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rpt_tgt_typ_META = createCommonMeta($rpt_tgt_typ, mcframe.commonMA.meta.MA_META.RPT_TGT_TYP);
	public static final MCMeta cost_io_typ_META = createCommonMeta($cost_io_typ, mcframe.commonMA.meta.MA_META.COST_IO_TYP);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta std_flg_META = createCommonMeta($std_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qty_unit_typ_META = createCommonMeta($qty_unit_typ, mcframe.commonMA.meta.MA_META.QTY_UNIT_TYP);
	public static final MCMeta alc_ac_grp_cd1_META = createCommonMeta($alc_ac_grp_cd1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_cd2_META = createCommonMeta($alc_ac_grp_cd2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_cd3_META = createCommonMeta($alc_ac_grp_cd3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta expns_typ_META = createCommonMeta($expns_typ, mcframe.commonMA.meta.MA_META.EXPNS_TYP);
	public static final MCMeta direct_typ_META = createCommonMeta($direct_typ, mcframe.commonMA.meta.MA_META.DIRECT_TYP);
	public static final MCMeta var_typ_META = createCommonMeta($var_typ, mcframe.commonMA.meta.MA_META.VAR_TYP);
	public static final MCMeta expns_grp_cd_META = createCommonMeta($expns_grp_cd, mcframe.commonMA.meta.MA_META.EXPNS_GRP_CD);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta fg_r_META = createCommonMeta($fg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_g_META = createCommonMeta($fg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_b_META = createCommonMeta($fg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_r_META = createCommonMeta($bg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_g_META = createCommonMeta($bg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_b_META = createCommonMeta($bg_b, mcframe.commonMA.meta.MA_META.RGB);
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
	public static final MCMeta rpt_ptn_nm_META = createCommonMeta($rpt_ptn_nm, mcframe.commonMA.meta.MA_META.RPT_PTN_NM);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta expns_grp_nm_META = createCommonMeta($expns_grp_nm, mcframe.commonMA.meta.MA_META.EXPNS_GRP_NM);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta alc_ac_grp_nm1_META = createCommonMeta($alc_ac_grp_nm1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta alc_ac_grp_nm2_META = createCommonMeta($alc_ac_grp_nm2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta alc_ac_grp_nm3_META = createCommonMeta($alc_ac_grp_nm3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $RPT_PTN1 = "RPT_PTN1";
	public static final String $ALC_AC1 = "ALC_AC1";
	public static final String $AC_RSN1 = "AC_RSN1";
	public static final String $ITM_JNL1 = "ITM_JNL1";
	public static final String $EXPNS_GRP1 = "EXPNS_GRP1";
	public static final String $EXPNS1 = "EXPNS1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_RPT_PTN",
				$RPT_PTN1,
				new String[][]{
						{"rpt_ptn_cd", "rpt_ptn_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_RPT_PTN_R.create("RPT_PTN1");
				},
				(alias) -> {
					MAM_RPT_CONF_R own = MAM_RPT_CONF_R.create(alias);
					mcframe.serverMA.dbc.MAM_RPT_PTN_R ref = mcframe.serverMA.dbc.MAM_RPT_PTN_R.create("RPT_PTN1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.rpt_ptn_cd.eq(ref.rpt_ptn_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ALC_AC",
				$ALC_AC1,
				new String[][]{
						{"alc_ac_cd", "alc_ac_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ALC_AC_R.create("ALC_AC1");
				},
				(alias) -> {
					MAM_RPT_CONF_R own = MAM_RPT_CONF_R.create(alias);
					mcframe.serverMA.dbc.MAM_ALC_AC_R ref = mcframe.serverMA.dbc.MAM_ALC_AC_R.create("ALC_AC1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.alc_ac_cd.eq(ref.alc_ac_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_AC_RSN",
				$AC_RSN1,
				new String[][]{
						{"ac_rsn_cd", "ac_rsn_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_AC_RSN_R.create("AC_RSN1");
				},
				(alias) -> {
					MAM_RPT_CONF_R own = MAM_RPT_CONF_R.create(alias);
					mcframe.serverMA.dbc.MAM_AC_RSN_R ref = mcframe.serverMA.dbc.MAM_AC_RSN_R.create("AC_RSN1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ac_rsn_cd.eq(ref.ac_rsn_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_JNL",
				$ITM_JNL1,
				new String[][]{
						{"itm_jnl_cd", "itm_jnl_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM_JNL_R.create("ITM_JNL1");
				},
				(alias) -> {
					MAM_RPT_CONF_R own = MAM_RPT_CONF_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM_JNL_R ref = mcframe.serverMA.dbc.MAM_ITM_JNL_R.create("ITM_JNL1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_jnl_cd.eq(ref.itm_jnl_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS_GRP",
				$EXPNS_GRP1,
				new String[][]{
						{"expns_grp_cd", "expns_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_GRP_R.create("EXPNS_GRP1");
				},
				(alias) -> {
					MAM_RPT_CONF_R own = MAM_RPT_CONF_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_GRP_R ref = mcframe.serverMA.dbc.MAM_EXPNS_GRP_R.create("EXPNS_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.expns_grp_cd.eq(ref.expns_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS1,
				new String[][]{
						{"expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS1");
				},
				(alias) -> {
					MAM_RPT_CONF_R own = MAM_RPT_CONF_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_RPT_CONF_R> constMetas = new ConstMetaList<MAM_RPT_CONF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			rpt_ptn_cd_META,
			rpt_row_cd_META,
			rpt_pre_word_META,
			rpt_row_nm_META,
			base_rpt_row_nm_META,
			rpt_seq_META,
			sml_flg_META,
			hdn_flg_META,
			rpt_tgt_typ_META,
			cost_io_typ_META,
			asst_typ_META,
			std_flg_META,
			qty_unit_typ_META,
			alc_ac_grp_cd1_META,
			alc_ac_grp_cd2_META,
			alc_ac_grp_cd3_META,
			alc_ac_cd_META,
			ac_slip_typ_META,
			ac_rsn_cd_META,
			itm_jnl_cd_META,
			itm_grp_cd1_META,
			itm_grp_cd2_META,
			itm_grp_cd3_META,
			itm_grp_cd4_META,
			itm_grp_cd5_META,
			itm_grp_cd6_META,
			itm_grp_cd7_META,
			itm_grp_cd8_META,
			itm_grp_cd9_META,
			itm_grp_cd10_META,
			expns_typ_META,
			direct_typ_META,
			var_typ_META,
			expns_grp_cd_META,
			expns_cd_META,
			fg_r_META,
			fg_g_META,
			fg_b_META,
			bg_r_META,
			bg_g_META,
			bg_b_META,
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
			upd_srv_req_no_META,
			rpt_ptn_nm_META,
			alc_ac_nm_META,
			ac_rsn_nm_META,
			itm_jnl_nm_META,
			expns_grp_nm_META,
			expns_nm_META,
			alc_ac_grp_nm1_META,
			alc_ac_grp_nm2_META,
			alc_ac_grp_nm3_META,
			itm_grp_nm1_META,
			itm_grp_nm2_META,
			itm_grp_nm3_META,
			itm_grp_nm4_META,
			itm_grp_nm5_META,
			itm_grp_nm6_META,
			itm_grp_nm7_META,
			itm_grp_nm8_META,
			itm_grp_nm9_META,
			itm_grp_nm10_META
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
	protected MAM_RPT_CONF_R(ConstMetaList<? extends MAM_RPT_CONF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_RPT_CONF_R(ConstMetaList<? extends MAM_RPT_CONF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$rpt_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$rpt_ptn_cd,
				"rpt_ptn_cd",
				rpt_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$rpt_row_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$rpt_row_cd,
				"rpt_row_cd",
				rpt_row_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$rpt_pre_word,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$rpt_pre_word,
				"rpt_pre_word",
				rpt_pre_word,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$rpt_row_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$rpt_row_nm,
				"rpt_row_nm",
				rpt_row_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$base_rpt_row_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$base_rpt_row_nm,
				"base_rpt_row_nm",
				base_rpt_row_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$rpt_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_RPT_CONF_R.$rpt_seq,
				"rpt_seq",
				rpt_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$sml_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_RPT_CONF_R.$sml_flg,
				"sml_flg",
				sml_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$hdn_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_RPT_CONF_R.$hdn_flg,
				"hdn_flg",
				hdn_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$rpt_tgt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$rpt_tgt_typ,
				"rpt_tgt_typ",
				rpt_tgt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$cost_io_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$cost_io_typ,
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
			MAM_RPT_CONF_R.$asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$asst_typ,
				"asst_typ",
				asst_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$std_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_RPT_CONF_R.$std_flg,
				"std_flg",
				std_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$qty_unit_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$qty_unit_typ,
				"qty_unit_typ",
				qty_unit_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$alc_ac_grp_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$alc_ac_grp_cd1,
				"alc_ac_grp_cd1",
				alc_ac_grp_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$alc_ac_grp_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$alc_ac_grp_cd2,
				"alc_ac_grp_cd2",
				alc_ac_grp_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$alc_ac_grp_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$alc_ac_grp_cd3,
				"alc_ac_grp_cd3",
				alc_ac_grp_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$alc_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$alc_ac_cd,
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
			MAM_RPT_CONF_R.$ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$ac_slip_typ,
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
			MAM_RPT_CONF_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$ac_rsn_cd,
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
			MAM_RPT_CONF_R.$itm_jnl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_jnl_cd,
				"itm_jnl_cd",
				itm_jnl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_grp_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_cd1,
				"itm_grp_cd1",
				itm_grp_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_grp_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_cd2,
				"itm_grp_cd2",
				itm_grp_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_grp_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_cd3,
				"itm_grp_cd3",
				itm_grp_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_grp_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_cd4,
				"itm_grp_cd4",
				itm_grp_cd4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_grp_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_cd5,
				"itm_grp_cd5",
				itm_grp_cd5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_grp_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_cd6,
				"itm_grp_cd6",
				itm_grp_cd6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_grp_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_cd7,
				"itm_grp_cd7",
				itm_grp_cd7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_grp_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_cd8,
				"itm_grp_cd8",
				itm_grp_cd8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_grp_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_cd9,
				"itm_grp_cd9",
				itm_grp_cd9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_grp_cd10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_cd10,
				"itm_grp_cd10",
				itm_grp_cd10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$expns_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$expns_typ,
				"expns_typ",
				expns_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$direct_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$direct_typ,
				"direct_typ",
				direct_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$var_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$var_typ,
				"var_typ",
				var_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$expns_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$expns_grp_cd,
				"expns_grp_cd",
				expns_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$expns_cd,
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
			MAM_RPT_CONF_R.$fg_r,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_RPT_CONF_R.$fg_r,
				"fg_r",
				fg_r,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$fg_g,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_RPT_CONF_R.$fg_g,
				"fg_g",
				fg_g,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$fg_b,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_RPT_CONF_R.$fg_b,
				"fg_b",
				fg_b,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$bg_r,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_RPT_CONF_R.$bg_r,
				"bg_r",
				bg_r,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$bg_g,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_RPT_CONF_R.$bg_g,
				"bg_g",
				bg_g,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$bg_b,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_RPT_CONF_R.$bg_b,
				"bg_b",
				bg_b,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$memo1,
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
			MAM_RPT_CONF_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$memo2,
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
			MAM_RPT_CONF_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$memo3,
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
			MAM_RPT_CONF_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_RPT_CONF_R.$del_flg,
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
			MAM_RPT_CONF_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$del_usr_id,
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
			MAM_RPT_CONF_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$del_usr_nm,
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
			MAM_RPT_CONF_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_RPT_CONF_R.$del_ts,
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
			MAM_RPT_CONF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$ins_usr_id,
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
			MAM_RPT_CONF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$ins_usr_nm,
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
			MAM_RPT_CONF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_RPT_CONF_R.$ins_ts,
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
			MAM_RPT_CONF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$ins_func_id,
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
			MAM_RPT_CONF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_RPT_CONF_R.$upd_cntr,
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
			MAM_RPT_CONF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$upd_usr_id,
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
			MAM_RPT_CONF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$upd_usr_nm,
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
			MAM_RPT_CONF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_RPT_CONF_R.$upd_ts,
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
			MAM_RPT_CONF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$upd_func_id,
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
			MAM_RPT_CONF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$upd_srv_req_no,
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
			MAM_RPT_CONF_R.$rpt_ptn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$rpt_ptn_nm,
				"rpt_ptn_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"RPT_PTN1.RPT_PTN_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$alc_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$alc_ac_nm,
				"alc_ac_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ALC_AC1.ALC_AC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$ac_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$ac_rsn_nm,
				"ac_rsn_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"AC_RSN1.AC_RSN_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$itm_jnl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_jnl_nm,
				"itm_jnl_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM_JNL1.ITM_JNL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$expns_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$expns_grp_nm,
				"expns_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS_GRP1.EXPNS_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_RPT_CONF_R.$expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$expns_nm,
				"expns_nm",
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
			MAM_RPT_CONF_R.$alc_ac_grp_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$alc_ac_grp_nm1,
				"alc_ac_grp_nm1",
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
			MAM_RPT_CONF_R.$alc_ac_grp_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$alc_ac_grp_nm2,
				"alc_ac_grp_nm2",
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
			MAM_RPT_CONF_R.$alc_ac_grp_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$alc_ac_grp_nm3,
				"alc_ac_grp_nm3",
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
			MAM_RPT_CONF_R.$itm_grp_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_nm1,
				"itm_grp_nm1",
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
			MAM_RPT_CONF_R.$itm_grp_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_nm2,
				"itm_grp_nm2",
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
			MAM_RPT_CONF_R.$itm_grp_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_nm3,
				"itm_grp_nm3",
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
			MAM_RPT_CONF_R.$itm_grp_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_nm4,
				"itm_grp_nm4",
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
			MAM_RPT_CONF_R.$itm_grp_nm5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_nm5,
				"itm_grp_nm5",
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
			MAM_RPT_CONF_R.$itm_grp_nm6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_nm6,
				"itm_grp_nm6",
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
			MAM_RPT_CONF_R.$itm_grp_nm7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_nm7,
				"itm_grp_nm7",
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
			MAM_RPT_CONF_R.$itm_grp_nm8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_nm8,
				"itm_grp_nm8",
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
			MAM_RPT_CONF_R.$itm_grp_nm9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_nm9,
				"itm_grp_nm9",
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
			MAM_RPT_CONF_R.$itm_grp_nm10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_RPT_CONF_R.$itm_grp_nm10,
				"itm_grp_nm10",
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
	public static MAM_RPT_CONF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_RPT_CONF_R create(String alias) {
		MAM_RPT_CONF_R row = new MAM_RPT_CONF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_RPT_CONF_R createByName(T proto) {
		MAM_RPT_CONF_R row = MAM_RPT_CONF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_RPT_CONF_R clone() {
		return (MAM_RPT_CONF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_RPT_CONF_R createInstance() {
		return (MAM_RPT_CONF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_RPT_CONF_R getValues(String... names) {
		return (MAM_RPT_CONF_R) super.getValues(names);
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
		return true;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_RPT_CONF_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_RPT_CONF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_RPT_CONF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_RPT_CONF_KEY_R.TABLE_NAME);
	 }

	/**
	 * レポートパタンＣＤ. Report pattern cd..<p>
	 *
	 */
	public String rpt_ptn_cd() {
		return getConstString(offset + 0, $rpt_ptn_cd);
	}

	/**
	 * レポートパタンＣＤ. Report pattern cd..<p>
	 *
	 */
	public void rpt_ptn_cd(String value) {
		setConstString(offset + 0, $rpt_ptn_cd, value);
	}

	/**
	 * レポート行ＣＤ. Report row cd..<p>
	 *
	 */
	public String rpt_row_cd() {
		return getConstString(offset + 1, $rpt_row_cd);
	}

	/**
	 * レポート行ＣＤ. Report row cd..<p>
	 *
	 */
	public void rpt_row_cd(String value) {
		setConstString(offset + 1, $rpt_row_cd, value);
	}

	/**
	 * 接頭語. Prefix.<p>
	 *
	 */
	public String rpt_pre_word() {
		return getConstString(offset + 2, $rpt_pre_word);
	}

	/**
	 * 接頭語. Prefix.<p>
	 *
	 */
	public void rpt_pre_word(String value) {
		setConstString(offset + 2, $rpt_pre_word, value);
	}

	/**
	 * レポート行名. Report row name.<p>
	 *
	 */
	public String rpt_row_nm() {
		return getConstString(offset + 3, $rpt_row_nm);
	}

	/**
	 * レポート行名. Report row name.<p>
	 *
	 */
	public void rpt_row_nm(String value) {
		setConstString(offset + 3, $rpt_row_nm, value);
	}

	/**
	 * レポート行名（ベース）. Report row name(Base).<p>
	 *
	 */
	public String base_rpt_row_nm() {
		return getConstString(offset + 4, $base_rpt_row_nm);
	}

	/**
	 * レポート行名（ベース）. Report row name(Base).<p>
	 *
	 */
	public void base_rpt_row_nm(String value) {
		setConstString(offset + 4, $base_rpt_row_nm, value);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public MCNumber rpt_seq() {
		return getConstNumber(offset + 5, $rpt_seq);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void rpt_seq(MCNumber value) {
		setConstNumber(offset + 5, $rpt_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void rpt_seq(int value) {
		setConstNumber(offset + 5, $rpt_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void rpt_seq(long value) {
		setConstNumber(offset + 5, $rpt_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void rpt_seq(float value) {
		setConstNumber(offset + 5, $rpt_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void rpt_seq(double value) {
		setConstNumber(offset + 5, $rpt_seq, value);
	}
	
	/**
	 * 集計行ＦＬＧ. Aggregated row flg..<p>
	 *
	 */
	public boolean sml_flg() {
		return getConstBoolean(offset + 6, $sml_flg);
	}

	/**
	 * 集計行ＦＬＧ. Aggregated row flg..<p>
	 *
	 */
	public void sml_flg(boolean value) {
		setConstBoolean(offset + 6, $sml_flg, value);
	}

	/**
	 * 非表示ＦＬＧ. Hide flg..<p>
	 *
	 */
	public boolean hdn_flg() {
		return getConstBoolean(offset + 7, $hdn_flg);
	}

	/**
	 * 非表示ＦＬＧ. Hide flg..<p>
	 *
	 */
	public void hdn_flg(boolean value) {
		setConstBoolean(offset + 7, $hdn_flg, value);
	}

	/**
	 * レポート対象区分. Report type.<p>
	 *
	 */
	public String rpt_tgt_typ() {
		return getConstString(offset + 8, $rpt_tgt_typ);
	}

	/**
	 * レポート対象区分. Report type.<p>
	 *
	 */
	public void rpt_tgt_typ(String value) {
		setConstString(offset + 8, $rpt_tgt_typ, value);
	}

	/**
	 * 原価入出庫区分. Cost GR/GI type.<p>
	 *
	 */
	public String cost_io_typ() {
		return getConstString(offset + 9, $cost_io_typ);
	}

	/**
	 * 原価入出庫区分. Cost GR/GI type.<p>
	 *
	 */
	public void cost_io_typ(String value) {
		setConstString(offset + 9, $cost_io_typ, value);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 10, $asst_typ);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 10, $asst_typ, value);
	}

	/**
	 * 標準ＦＬＧ. Standard flg..<p>
	 *
	 */
	public boolean std_flg() {
		return getConstBoolean(offset + 11, $std_flg);
	}

	/**
	 * 標準ＦＬＧ. Standard flg..<p>
	 *
	 */
	public void std_flg(boolean value) {
		setConstBoolean(offset + 11, $std_flg, value);
	}

	/**
	 * 数量単位区分. Quantity unit type.<p>
	 *
	 */
	public String qty_unit_typ() {
		return getConstString(offset + 12, $qty_unit_typ);
	}

	/**
	 * 数量単位区分. Quantity unit type.<p>
	 *
	 */
	public void qty_unit_typ(String value) {
		setConstString(offset + 12, $qty_unit_typ, value);
	}

	/**
	 * 配賦科目グループ１. Allocation account group 1.<p>
	 *
	 */
	public String alc_ac_grp_cd1() {
		return getConstString(offset + 13, $alc_ac_grp_cd1);
	}

	/**
	 * 配賦科目グループ１. Allocation account group 1.<p>
	 *
	 */
	public void alc_ac_grp_cd1(String value) {
		setConstString(offset + 13, $alc_ac_grp_cd1, value);
	}

	/**
	 * 配賦科目グループ２. Allocation account group 2.<p>
	 *
	 */
	public String alc_ac_grp_cd2() {
		return getConstString(offset + 14, $alc_ac_grp_cd2);
	}

	/**
	 * 配賦科目グループ２. Allocation account group 2.<p>
	 *
	 */
	public void alc_ac_grp_cd2(String value) {
		setConstString(offset + 14, $alc_ac_grp_cd2, value);
	}

	/**
	 * 配賦科目グループ３. Allocation account group 3.<p>
	 *
	 */
	public String alc_ac_grp_cd3() {
		return getConstString(offset + 15, $alc_ac_grp_cd3);
	}

	/**
	 * 配賦科目グループ３. Allocation account group 3.<p>
	 *
	 */
	public void alc_ac_grp_cd3(String value) {
		setConstString(offset + 15, $alc_ac_grp_cd3, value);
	}

	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 16, $alc_ac_cd);
	}

	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 16, $alc_ac_cd, value);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 17, $ac_slip_typ);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 17, $ac_slip_typ, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 18, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 18, $ac_rsn_cd, value);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 19, $itm_jnl_cd);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 19, $itm_jnl_cd, value);
	}

	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 20, $itm_grp_cd1);
	}

	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 20, $itm_grp_cd1, value);
	}

	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 21, $itm_grp_cd2);
	}

	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 21, $itm_grp_cd2, value);
	}

	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 22, $itm_grp_cd3);
	}

	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 22, $itm_grp_cd3, value);
	}

	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 23, $itm_grp_cd4);
	}

	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 23, $itm_grp_cd4, value);
	}

	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 24, $itm_grp_cd5);
	}

	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 24, $itm_grp_cd5, value);
	}

	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 25, $itm_grp_cd6);
	}

	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 25, $itm_grp_cd6, value);
	}

	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 26, $itm_grp_cd7);
	}

	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 26, $itm_grp_cd7, value);
	}

	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 27, $itm_grp_cd8);
	}

	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 27, $itm_grp_cd8, value);
	}

	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 28, $itm_grp_cd9);
	}

	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 28, $itm_grp_cd9, value);
	}

	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 29, $itm_grp_cd10);
	}

	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 29, $itm_grp_cd10, value);
	}

	/**
	 * 費目区分. Cost element type.<p>
	 *
	 */
	public String expns_typ() {
		return getConstString(offset + 30, $expns_typ);
	}

	/**
	 * 費目区分. Cost element type.<p>
	 *
	 */
	public void expns_typ(String value) {
		setConstString(offset + 30, $expns_typ, value);
	}

	/**
	 * 直間区分. Direct/Indirect type.<p>
	 *
	 */
	public String direct_typ() {
		return getConstString(offset + 31, $direct_typ);
	}

	/**
	 * 直間区分. Direct/Indirect type.<p>
	 *
	 */
	public void direct_typ(String value) {
		setConstString(offset + 31, $direct_typ, value);
	}

	/**
	 * 固変区分. Constant/variable type.<p>
	 *
	 */
	public String var_typ() {
		return getConstString(offset + 32, $var_typ);
	}

	/**
	 * 固変区分. Constant/variable type.<p>
	 *
	 */
	public void var_typ(String value) {
		setConstString(offset + 32, $var_typ, value);
	}

	/**
	 * 費目グループＣＤ. Cost element group cd..<p>
	 *
	 */
	public String expns_grp_cd() {
		return getConstString(offset + 33, $expns_grp_cd);
	}

	/**
	 * 費目グループＣＤ. Cost element group cd..<p>
	 *
	 */
	public void expns_grp_cd(String value) {
		setConstString(offset + 33, $expns_grp_cd, value);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 34, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 34, $expns_cd, value);
	}

	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public MCNumber fg_r() {
		return getConstNumber(offset + 35, $fg_r);
	}

	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public void fg_r(MCNumber value) {
		setConstNumber(offset + 35, $fg_r, value);
	}
	
	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public void fg_r(int value) {
		setConstNumber(offset + 35, $fg_r, value);
	}
	
	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public void fg_r(long value) {
		setConstNumber(offset + 35, $fg_r, value);
	}
	
	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public void fg_r(float value) {
		setConstNumber(offset + 35, $fg_r, value);
	}
	
	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public void fg_r(double value) {
		setConstNumber(offset + 35, $fg_r, value);
	}
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public MCNumber fg_g() {
		return getConstNumber(offset + 36, $fg_g);
	}

	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public void fg_g(MCNumber value) {
		setConstNumber(offset + 36, $fg_g, value);
	}
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public void fg_g(int value) {
		setConstNumber(offset + 36, $fg_g, value);
	}
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public void fg_g(long value) {
		setConstNumber(offset + 36, $fg_g, value);
	}
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public void fg_g(float value) {
		setConstNumber(offset + 36, $fg_g, value);
	}
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public void fg_g(double value) {
		setConstNumber(offset + 36, $fg_g, value);
	}
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public MCNumber fg_b() {
		return getConstNumber(offset + 37, $fg_b);
	}

	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public void fg_b(MCNumber value) {
		setConstNumber(offset + 37, $fg_b, value);
	}
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public void fg_b(int value) {
		setConstNumber(offset + 37, $fg_b, value);
	}
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public void fg_b(long value) {
		setConstNumber(offset + 37, $fg_b, value);
	}
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public void fg_b(float value) {
		setConstNumber(offset + 37, $fg_b, value);
	}
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public void fg_b(double value) {
		setConstNumber(offset + 37, $fg_b, value);
	}
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public MCNumber bg_r() {
		return getConstNumber(offset + 38, $bg_r);
	}

	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public void bg_r(MCNumber value) {
		setConstNumber(offset + 38, $bg_r, value);
	}
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public void bg_r(int value) {
		setConstNumber(offset + 38, $bg_r, value);
	}
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public void bg_r(long value) {
		setConstNumber(offset + 38, $bg_r, value);
	}
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public void bg_r(float value) {
		setConstNumber(offset + 38, $bg_r, value);
	}
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public void bg_r(double value) {
		setConstNumber(offset + 38, $bg_r, value);
	}
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public MCNumber bg_g() {
		return getConstNumber(offset + 39, $bg_g);
	}

	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public void bg_g(MCNumber value) {
		setConstNumber(offset + 39, $bg_g, value);
	}
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public void bg_g(int value) {
		setConstNumber(offset + 39, $bg_g, value);
	}
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public void bg_g(long value) {
		setConstNumber(offset + 39, $bg_g, value);
	}
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public void bg_g(float value) {
		setConstNumber(offset + 39, $bg_g, value);
	}
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public void bg_g(double value) {
		setConstNumber(offset + 39, $bg_g, value);
	}
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public MCNumber bg_b() {
		return getConstNumber(offset + 40, $bg_b);
	}

	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public void bg_b(MCNumber value) {
		setConstNumber(offset + 40, $bg_b, value);
	}
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public void bg_b(int value) {
		setConstNumber(offset + 40, $bg_b, value);
	}
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public void bg_b(long value) {
		setConstNumber(offset + 40, $bg_b, value);
	}
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public void bg_b(float value) {
		setConstNumber(offset + 40, $bg_b, value);
	}
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public void bg_b(double value) {
		setConstNumber(offset + 40, $bg_b, value);
	}
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 41, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 41, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 42, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 42, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 43, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 43, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 44, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 44, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 45, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 45, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 46, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 46, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 47, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 47, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 48, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 48, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 49, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 49, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 50, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 51, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 51, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 52, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 53, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 53, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 54, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 54, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 55, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 56, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 56, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 57, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 57, $upd_srv_req_no, value);
	}

	/**
	 * レポートパタン名. Report pattern name.<p>
	 *
	 */
	public String rpt_ptn_nm() {
		return getConstString(offset + 58, $rpt_ptn_nm);
	}

	/**
	 * レポートパタン名. Report pattern name.<p>
	 *
	 */
	public void rpt_ptn_nm(String value) {
		setConstString(offset + 58, $rpt_ptn_nm, value);
	}

	/**
	 * 配賦科目名. Allocation account name.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 59, $alc_ac_nm);
	}

	/**
	 * 配賦科目名. Allocation account name.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 59, $alc_ac_nm, value);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 60, $ac_rsn_nm);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 60, $ac_rsn_nm, value);
	}

	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 61, $itm_jnl_nm);
	}

	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 61, $itm_jnl_nm, value);
	}

	/**
	 * 費目グループ名. Cost element group name.<p>
	 *
	 */
	public String expns_grp_nm() {
		return getConstString(offset + 62, $expns_grp_nm);
	}

	/**
	 * 費目グループ名. Cost element group name.<p>
	 *
	 */
	public void expns_grp_nm(String value) {
		setConstString(offset + 62, $expns_grp_nm, value);
	}

	/**
	 * 費目名. Cost element name.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 63, $expns_nm);
	}

	/**
	 * 費目名. Cost element name.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 63, $expns_nm, value);
	}

	/**
	 * 配賦科目グループ名１. Allocation account group name 1.<p>
	 *
	 */
	public String alc_ac_grp_nm1() {
		return getConstString(offset + 64, $alc_ac_grp_nm1);
	}

	/**
	 * 配賦科目グループ名１. Allocation account group name 1.<p>
	 *
	 */
	public void alc_ac_grp_nm1(String value) {
		setConstString(offset + 64, $alc_ac_grp_nm1, value);
	}

	/**
	 * 配賦科目グループ名２. Allocation account group name 2.<p>
	 *
	 */
	public String alc_ac_grp_nm2() {
		return getConstString(offset + 65, $alc_ac_grp_nm2);
	}

	/**
	 * 配賦科目グループ名２. Allocation account group name 2.<p>
	 *
	 */
	public void alc_ac_grp_nm2(String value) {
		setConstString(offset + 65, $alc_ac_grp_nm2, value);
	}

	/**
	 * 配賦科目グループ名３. Allocation account group name 3.<p>
	 *
	 */
	public String alc_ac_grp_nm3() {
		return getConstString(offset + 66, $alc_ac_grp_nm3);
	}

	/**
	 * 配賦科目グループ名３. Allocation account group name 3.<p>
	 *
	 */
	public void alc_ac_grp_nm3(String value) {
		setConstString(offset + 66, $alc_ac_grp_nm3, value);
	}

	/**
	 * 品目分類名１. Item classification name 1.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 67, $itm_grp_nm1);
	}

	/**
	 * 品目分類名１. Item classification name 1.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 67, $itm_grp_nm1, value);
	}

	/**
	 * 品目分類名２. Item classification name 2.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 68, $itm_grp_nm2);
	}

	/**
	 * 品目分類名２. Item classification name 2.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 68, $itm_grp_nm2, value);
	}

	/**
	 * 品目分類名３. Item classification name 3.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 69, $itm_grp_nm3);
	}

	/**
	 * 品目分類名３. Item classification name 3.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 69, $itm_grp_nm3, value);
	}

	/**
	 * 品目分類名４. Item classification name 4.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 70, $itm_grp_nm4);
	}

	/**
	 * 品目分類名４. Item classification name 4.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 70, $itm_grp_nm4, value);
	}

	/**
	 * 品目分類名５. Item classification name 5.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 71, $itm_grp_nm5);
	}

	/**
	 * 品目分類名５. Item classification name 5.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 71, $itm_grp_nm5, value);
	}

	/**
	 * 品目分類名６. Item classification name 6.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 72, $itm_grp_nm6);
	}

	/**
	 * 品目分類名６. Item classification name 6.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 72, $itm_grp_nm6, value);
	}

	/**
	 * 品目分類名７. Item classification name 7.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 73, $itm_grp_nm7);
	}

	/**
	 * 品目分類名７. Item classification name 7.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 73, $itm_grp_nm7, value);
	}

	/**
	 * 品目分類名８. Item classification name 8.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 74, $itm_grp_nm8);
	}

	/**
	 * 品目分類名８. Item classification name 8.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 74, $itm_grp_nm8, value);
	}

	/**
	 * 品目分類名９. Item classification name 9.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 75, $itm_grp_nm9);
	}

	/**
	 * 品目分類名９. Item classification name 9.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 75, $itm_grp_nm9, value);
	}

	/**
	 * 品目分類名１０. Item classification name 10.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 76, $itm_grp_nm10);
	}

	/**
	 * 品目分類名１０. Item classification name 10.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 76, $itm_grp_nm10, value);
	}

	public String getString(String name) {
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			return rpt_row_cd();
		}
		if ($rpt_pre_word.equalsIgnoreCase(name)) {
			return rpt_pre_word();
		}
		if ($rpt_row_nm.equalsIgnoreCase(name)) {
			return rpt_row_nm();
		}
		if ($base_rpt_row_nm.equalsIgnoreCase(name)) {
			return base_rpt_row_nm();
		}
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			return rpt_tgt_typ();
		}
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			return cost_io_typ();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			return qty_unit_typ();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			return expns_typ();
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			return direct_typ();
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			return var_typ();
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			return expns_grp_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
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
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			return rpt_ptn_nm();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			return expns_grp_nm();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm1();
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm2();
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm3();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			return rpt_seq();
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			return fg_r();
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			return fg_g();
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			return fg_b();
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			return bg_r();
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			return bg_g();
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			return bg_b();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
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
		if ($sml_flg.equalsIgnoreCase(name)) {
			return sml_flg();
		}
		if ($hdn_flg.equalsIgnoreCase(name)) {
			return hdn_flg();
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			return std_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			return rpt_row_cd();
		}
		if ($rpt_pre_word.equalsIgnoreCase(name)) {
			return rpt_pre_word();
		}
		if ($rpt_row_nm.equalsIgnoreCase(name)) {
			return rpt_row_nm();
		}
		if ($base_rpt_row_nm.equalsIgnoreCase(name)) {
			return base_rpt_row_nm();
		}
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			return rpt_tgt_typ();
		}
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			return cost_io_typ();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			return qty_unit_typ();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			return expns_typ();
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			return direct_typ();
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			return var_typ();
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			return expns_grp_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
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
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			return rpt_ptn_nm();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			return expns_grp_nm();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm1();
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm2();
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm3();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			return rpt_seq();
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			return fg_r();
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			return fg_g();
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			return fg_b();
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			return bg_r();
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			return bg_g();
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			return bg_b();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
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
		if ($sml_flg.equalsIgnoreCase(name)) {
			return sml_flg();
		}
		if ($hdn_flg.equalsIgnoreCase(name)) {
			return hdn_flg();
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			return std_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			rpt_row_cd(value);
			return;
		}
		if ($rpt_pre_word.equalsIgnoreCase(name)) {
			rpt_pre_word(value);
			return;
		}
		if ($rpt_row_nm.equalsIgnoreCase(name)) {
			rpt_row_nm(value);
			return;
		}
		if ($base_rpt_row_nm.equalsIgnoreCase(name)) {
			base_rpt_row_nm(value);
			return;
		}
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			rpt_tgt_typ(value);
			return;
		}
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			cost_io_typ(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			qty_unit_typ(value);
			return;
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			expns_typ(value);
			return;
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			direct_typ(value);
			return;
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			var_typ(value);
			return;
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			expns_grp_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
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
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			rpt_ptn_nm(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			expns_grp_nm(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			alc_ac_grp_nm1(value);
			return;
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			alc_ac_grp_nm2(value);
			return;
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			alc_ac_grp_nm3(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($sml_flg.equalsIgnoreCase(name)) {
			sml_flg(value);
			return;
		}
		if ($hdn_flg.equalsIgnoreCase(name)) {
			hdn_flg(value);
			return;
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			std_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($rpt_row_cd.equalsIgnoreCase(name)) {
			rpt_row_cd(value);
			return;
		}
		if ($rpt_pre_word.equalsIgnoreCase(name)) {
			rpt_pre_word(value);
			return;
		}
		if ($rpt_row_nm.equalsIgnoreCase(name)) {
			rpt_row_nm(value);
			return;
		}
		if ($base_rpt_row_nm.equalsIgnoreCase(name)) {
			base_rpt_row_nm(value);
			return;
		}
		if ($rpt_tgt_typ.equalsIgnoreCase(name)) {
			rpt_tgt_typ(value);
			return;
		}
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			cost_io_typ(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			qty_unit_typ(value);
			return;
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			expns_typ(value);
			return;
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			direct_typ(value);
			return;
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			var_typ(value);
			return;
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			expns_grp_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
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
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			rpt_ptn_nm(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			expns_grp_nm(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			alc_ac_grp_nm1(value);
			return;
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			alc_ac_grp_nm2(value);
			return;
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			alc_ac_grp_nm3(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($rpt_seq.equalsIgnoreCase(name)) {
			rpt_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($sml_flg.equalsIgnoreCase(name)) {
			sml_flg(value);
			return;
		}
		if ($hdn_flg.equalsIgnoreCase(name)) {
			hdn_flg(value);
			return;
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			std_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
