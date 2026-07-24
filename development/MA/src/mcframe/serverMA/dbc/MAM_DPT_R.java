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
 * "部門マスタ // Dept. master"DBコンテナRowクラスです。<p>
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
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用開始日</td>
 *  	<td>Application start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用終了日</td>
 *  	<td>Application end date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用終了日（ベース）</td>
 *  	<td>Application end date(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門名</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門名（ベース）</td>
 *  	<td>Dept. name(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_lvl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門階層ＣＤ</td>
 *  	<td>Dept. hierarchy cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>up_lv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>上位部門ＣＤ</td>
 *  	<td>Upper dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計部門ＣＤ</td>
 *  	<td>Accounting dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cost_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>原価部門ＣＤ</td>
 *  	<td>Cost dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>new_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>新部門ＣＤ</td>
 *  	<td>New dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>郵便番号</td>
 *  	<td>Zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>郵便番号（ベース）</td>
 *  	<td>Zip code(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所１</td>
 *  	<td>Address 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所１（ベース）</td>
 *  	<td>Address 1(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所２</td>
 *  	<td>Address 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所２（ベース）</td>
 *  	<td>Address 2(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所３</td>
 *  	<td>Address 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所３（ベース）</td>
 *  	<td>Address 3(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所４</td>
 *  	<td>Address 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所４（ベース）</td>
 *  	<td>Address 4(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＴＥＬ</td>
 *  	<td>TEL</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＴＥＬ（ベース）</td>
 *  	<td>TEL(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＦＡＸ</td>
 *  	<td>FAX</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＦＡＸ（ベース）</td>
 *  	<td>FAX(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金口座ＣＤ</td>
 *  	<td>Payment received bank account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払口座ＣＤ</td>
 *  	<td>Payment account cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>カレンダＣＤ</td>
 *  	<td>Calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asst_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産管理部門ＦＬＧ</td>
 *  	<td>Asset management dept. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債権部門ＦＬＧ</td>
 *  	<td>AR dept. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務部門ＦＬＧ</td>
 *  	<td>AP dept. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>営業部門ＦＬＧ</td>
 *  	<td>Sales dept. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買部門ＦＬＧ</td>
 *  	<td>Purchasing dept. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷部門ＦＬＧ</td>
 *  	<td>Shipping dept. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷部門ＦＬＧ</td>
 *  	<td>Receipt dept. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造部門ＦＬＧ</td>
 *  	<td>Mfg. dept. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sd_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需給部門ＦＬＧ</td>
 *  	<td>Demand and supply dept. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査部門ＦＬＧ</td>
 *  	<td>Inspection dept. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>負担部門ＦＬＧ</td>
 *  	<td>Charged dept. flg.</td>
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
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
 *  	<td>dpt_lvl_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>DPT_LVL1.DPT_LVL_NM</td>
 *  	<td>部門階層名</td>
 *  	<td>Dept. hierarchy name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>up_lv_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT1.DPT_NM</td>
 *  	<td>上位部門名</td>
 *  	<td>Upper dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_bank_ac_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td>BANK_AC1.BANK_AC_NM</td>
 *  	<td>入金口座名</td>
 *  	<td>Payment received account name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_bank_ac_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td>BANK_AC2.BANK_AC_NM</td>
 *  	<td>支払口座名</td>
 *  	<td>Payment account name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>WG1.WG_NM</td>
 *  	<td>ＷＧ名</td>
 *  	<td>WG name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CAL_BASE1.CAL_NM</td>
 *  	<td>カレンダ名</td>
 *  	<td>Calendar name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_DPT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_DPT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
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
	 * 適用終了日（ベース）. Application end date(Base).<p>
	 *
	 */
	public static final String $base_end_dt = "base_end_dt";
	private static final MCPermColumnInfo _base_end_dt = createColumnInfo("base_end_dt");
	public final MCDatePermColumn base_end_dt = createDateColumn(_base_end_dt);
	
	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	private static final MCPermColumnInfo _dpt_nm = createColumnInfo("dpt_nm");
	public final MCStringPermColumn dpt_nm = createStringColumn(_dpt_nm);
	
	/**
	 * 部門名（ベース）. Dept. name(Base).<p>
	 *
	 */
	public static final String $base_dpt_nm = "base_dpt_nm";
	private static final MCPermColumnInfo _base_dpt_nm = createColumnInfo("base_dpt_nm");
	public final MCStringPermColumn base_dpt_nm = createStringColumn(_base_dpt_nm);
	
	/**
	 * 部門階層ＣＤ. Dept. hierarchy cd..<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	private static final MCPermColumnInfo _dpt_lvl_cd = createColumnInfo("dpt_lvl_cd");
	public final MCStringPermColumn dpt_lvl_cd = createStringColumn(_dpt_lvl_cd);
	
	/**
	 * 上位部門ＣＤ. Upper dept. cd..<p>
	 *
	 */
	public static final String $up_lv_dpt_cd = "up_lv_dpt_cd";
	private static final MCPermColumnInfo _up_lv_dpt_cd = createColumnInfo("up_lv_dpt_cd");
	public final MCStringPermColumn up_lv_dpt_cd = createStringColumn(_up_lv_dpt_cd);
	
	/**
	 * 会計部門ＣＤ. Accounting dept. cd..<p>
	 *
	 */
	public static final String $ac_dpt_cd = "ac_dpt_cd";
	private static final MCPermColumnInfo _ac_dpt_cd = createColumnInfo("ac_dpt_cd");
	public final MCStringPermColumn ac_dpt_cd = createStringColumn(_ac_dpt_cd);
	
	/**
	 * 原価部門ＣＤ. Cost dept. cd..<p>
	 *
	 */
	public static final String $cost_dpt_cd = "cost_dpt_cd";
	private static final MCPermColumnInfo _cost_dpt_cd = createColumnInfo("cost_dpt_cd");
	public final MCStringPermColumn cost_dpt_cd = createStringColumn(_cost_dpt_cd);
	
	/**
	 * 新部門ＣＤ. New dept. cd..<p>
	 *
	 */
	public static final String $new_dpt_cd = "new_dpt_cd";
	private static final MCPermColumnInfo _new_dpt_cd = createColumnInfo("new_dpt_cd");
	public final MCStringPermColumn new_dpt_cd = createStringColumn(_new_dpt_cd);
	
	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	private static final MCPermColumnInfo _zip_cd = createColumnInfo("zip_cd");
	public final MCStringPermColumn zip_cd = createStringColumn(_zip_cd);
	
	/**
	 * 郵便番号（ベース）. Zip code(Base).<p>
	 *
	 */
	public static final String $base_zip_cd = "base_zip_cd";
	private static final MCPermColumnInfo _base_zip_cd = createColumnInfo("base_zip_cd");
	public final MCStringPermColumn base_zip_cd = createStringColumn(_base_zip_cd);
	
	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	private static final MCPermColumnInfo _addr1 = createColumnInfo("addr1");
	public final MCStringPermColumn addr1 = createStringColumn(_addr1);
	
	/**
	 * 住所１（ベース）. Address 1(Base).<p>
	 *
	 */
	public static final String $base_addr1 = "base_addr1";
	private static final MCPermColumnInfo _base_addr1 = createColumnInfo("base_addr1");
	public final MCStringPermColumn base_addr1 = createStringColumn(_base_addr1);
	
	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	private static final MCPermColumnInfo _addr2 = createColumnInfo("addr2");
	public final MCStringPermColumn addr2 = createStringColumn(_addr2);
	
	/**
	 * 住所２（ベース）. Address 2(Base).<p>
	 *
	 */
	public static final String $base_addr2 = "base_addr2";
	private static final MCPermColumnInfo _base_addr2 = createColumnInfo("base_addr2");
	public final MCStringPermColumn base_addr2 = createStringColumn(_base_addr2);
	
	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	private static final MCPermColumnInfo _addr3 = createColumnInfo("addr3");
	public final MCStringPermColumn addr3 = createStringColumn(_addr3);
	
	/**
	 * 住所３（ベース）. Address 3(Base).<p>
	 *
	 */
	public static final String $base_addr3 = "base_addr3";
	private static final MCPermColumnInfo _base_addr3 = createColumnInfo("base_addr3");
	public final MCStringPermColumn base_addr3 = createStringColumn(_base_addr3);
	
	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	private static final MCPermColumnInfo _addr4 = createColumnInfo("addr4");
	public final MCStringPermColumn addr4 = createStringColumn(_addr4);
	
	/**
	 * 住所４（ベース）. Address 4(Base).<p>
	 *
	 */
	public static final String $base_addr4 = "base_addr4";
	private static final MCPermColumnInfo _base_addr4 = createColumnInfo("base_addr4");
	public final MCStringPermColumn base_addr4 = createStringColumn(_base_addr4);
	
	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public static final String $tel = "tel";
	private static final MCPermColumnInfo _tel = createColumnInfo("tel");
	public final MCStringPermColumn tel = createStringColumn(_tel);
	
	/**
	 * ＴＥＬ（ベース）. TEL(Base).<p>
	 *
	 */
	public static final String $base_tel = "base_tel";
	private static final MCPermColumnInfo _base_tel = createColumnInfo("base_tel");
	public final MCStringPermColumn base_tel = createStringColumn(_base_tel);
	
	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public static final String $fax = "fax";
	private static final MCPermColumnInfo _fax = createColumnInfo("fax");
	public final MCStringPermColumn fax = createStringColumn(_fax);
	
	/**
	 * ＦＡＸ（ベース）. FAX(Base).<p>
	 *
	 */
	public static final String $base_fax = "base_fax";
	private static final MCPermColumnInfo _base_fax = createColumnInfo("base_fax");
	public final MCStringPermColumn base_fax = createStringColumn(_base_fax);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 入金口座ＣＤ. Payment received bank account cd..<p>
	 *
	 */
	public static final String $rcv_bank_ac_cd = "rcv_bank_ac_cd";
	private static final MCPermColumnInfo _rcv_bank_ac_cd = createColumnInfo("rcv_bank_ac_cd");
	public final MCStringPermColumn rcv_bank_ac_cd = createStringColumn(_rcv_bank_ac_cd);
	
	/**
	 * 支払口座ＣＤ. Payment account cd..<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	private static final MCPermColumnInfo _pay_bank_ac_cd = createColumnInfo("pay_bank_ac_cd");
	public final MCStringPermColumn pay_bank_ac_cd = createStringColumn(_pay_bank_ac_cd);
	
	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	private static final MCPermColumnInfo _cal_cd = createColumnInfo("cal_cd");
	public final MCStringPermColumn cal_cd = createStringColumn(_cal_cd);
	
	/**
	 * 資産管理部門ＦＬＧ. Asset management dept. flg..<p>
	 *
	 */
	public static final String $asst_dpt_flg = "asst_dpt_flg";
	private static final MCPermColumnInfo _asst_dpt_flg = createColumnInfo("asst_dpt_flg");
	public final MCBooleanPermColumn asst_dpt_flg = createBooleanColumn(_asst_dpt_flg);
	
	/**
	 * 債権部門ＦＬＧ. AR dept. flg..<p>
	 *
	 */
	public static final String $ar_dpt_flg = "ar_dpt_flg";
	private static final MCPermColumnInfo _ar_dpt_flg = createColumnInfo("ar_dpt_flg");
	public final MCBooleanPermColumn ar_dpt_flg = createBooleanColumn(_ar_dpt_flg);
	
	/**
	 * 債務部門ＦＬＧ. AP dept. flg..<p>
	 *
	 */
	public static final String $ap_dpt_flg = "ap_dpt_flg";
	private static final MCPermColumnInfo _ap_dpt_flg = createColumnInfo("ap_dpt_flg");
	public final MCBooleanPermColumn ap_dpt_flg = createBooleanColumn(_ap_dpt_flg);
	
	/**
	 * 営業部門ＦＬＧ. Sales dept. flg..<p>
	 *
	 */
	public static final String $sls_dpt_flg = "sls_dpt_flg";
	private static final MCPermColumnInfo _sls_dpt_flg = createColumnInfo("sls_dpt_flg");
	public final MCBooleanPermColumn sls_dpt_flg = createBooleanColumn(_sls_dpt_flg);
	
	/**
	 * 購買部門ＦＬＧ. Purchasing dept. flg..<p>
	 *
	 */
	public static final String $purc_dpt_flg = "purc_dpt_flg";
	private static final MCPermColumnInfo _purc_dpt_flg = createColumnInfo("purc_dpt_flg");
	public final MCBooleanPermColumn purc_dpt_flg = createBooleanColumn(_purc_dpt_flg);
	
	/**
	 * 出荷部門ＦＬＧ. Shipping dept. flg..<p>
	 *
	 */
	public static final String $ship_dpt_flg = "ship_dpt_flg";
	private static final MCPermColumnInfo _ship_dpt_flg = createColumnInfo("ship_dpt_flg");
	public final MCBooleanPermColumn ship_dpt_flg = createBooleanColumn(_ship_dpt_flg);
	
	/**
	 * 入荷部門ＦＬＧ. Receipt dept. flg..<p>
	 *
	 */
	public static final String $arr_dpt_flg = "arr_dpt_flg";
	private static final MCPermColumnInfo _arr_dpt_flg = createColumnInfo("arr_dpt_flg");
	public final MCBooleanPermColumn arr_dpt_flg = createBooleanColumn(_arr_dpt_flg);
	
	/**
	 * 製造部門ＦＬＧ. Mfg. dept. flg..<p>
	 *
	 */
	public static final String $mfg_dpt_flg = "mfg_dpt_flg";
	private static final MCPermColumnInfo _mfg_dpt_flg = createColumnInfo("mfg_dpt_flg");
	public final MCBooleanPermColumn mfg_dpt_flg = createBooleanColumn(_mfg_dpt_flg);
	
	/**
	 * 需給部門ＦＬＧ. Demand and supply dept. flg..<p>
	 *
	 */
	public static final String $sd_dpt_flg = "sd_dpt_flg";
	private static final MCPermColumnInfo _sd_dpt_flg = createColumnInfo("sd_dpt_flg");
	public final MCBooleanPermColumn sd_dpt_flg = createBooleanColumn(_sd_dpt_flg);
	
	/**
	 * 検査部門ＦＬＧ. Inspection dept. flg..<p>
	 *
	 */
	public static final String $insp_dpt_flg = "insp_dpt_flg";
	private static final MCPermColumnInfo _insp_dpt_flg = createColumnInfo("insp_dpt_flg");
	public final MCBooleanPermColumn insp_dpt_flg = createBooleanColumn(_insp_dpt_flg);
	
	/**
	 * 負担部門ＦＬＧ. Charged dept. flg..<p>
	 *
	 */
	public static final String $bd_dpt_flg = "bd_dpt_flg";
	private static final MCPermColumnInfo _bd_dpt_flg = createColumnInfo("bd_dpt_flg");
	public final MCBooleanPermColumn bd_dpt_flg = createBooleanColumn(_bd_dpt_flg);
	
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
	 * 部門階層名. Dept. hierarchy name.<p>
	 *
	 */
	public static final String $dpt_lvl_nm = "dpt_lvl_nm";
	
	/**
	 * 上位部門名. Upper dept. name.<p>
	 *
	 */
	public static final String $up_lv_dpt_nm = "up_lv_dpt_nm";
	
	/**
	 * 入金口座名. Payment received account name.<p>
	 *
	 */
	public static final String $rcv_bank_ac_nm = "rcv_bank_ac_nm";
	
	/**
	 * 支払口座名. Payment account name.<p>
	 *
	 */
	public static final String $pay_bank_ac_nm = "pay_bank_ac_nm";
	
	/**
	 * ＷＧ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	
	/**
	 * カレンダ名. Calendar name.<p>
	 *
	 */
	public static final String $cal_nm = "cal_nm";
	
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_end_dt_META = createCommonMeta($base_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta base_dpt_nm_META = createCommonMeta($base_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta up_lv_dpt_cd_META = createCommonMeta($up_lv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ac_dpt_cd_META = createCommonMeta($ac_dpt_cd, mcframe.commonMA.meta.MA_META.AC_DPT_CD);
	public static final MCMeta cost_dpt_cd_META = createCommonMeta($cost_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta new_dpt_cd_META = createCommonMeta($new_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta base_zip_cd_META = createCommonMeta($base_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta base_addr1_META = createCommonMeta($base_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta base_addr2_META = createCommonMeta($base_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta base_addr3_META = createCommonMeta($base_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta base_addr4_META = createCommonMeta($base_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta base_tel_META = createCommonMeta($base_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta base_fax_META = createCommonMeta($base_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rcv_bank_ac_cd_META = createCommonMeta($rcv_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta asst_dpt_flg_META = createCommonMeta($asst_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_dpt_flg_META = createCommonMeta($ar_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_flg_META = createCommonMeta($ap_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dpt_flg_META = createCommonMeta($sls_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dpt_flg_META = createCommonMeta($purc_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_dpt_flg_META = createCommonMeta($ship_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_dpt_flg_META = createCommonMeta($arr_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_dpt_flg_META = createCommonMeta($mfg_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sd_dpt_flg_META = createCommonMeta($sd_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_dpt_flg_META = createCommonMeta($insp_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_flg_META = createCommonMeta($bd_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta dpt_lvl_nm_META = createCommonMeta($dpt_lvl_nm, mcframe.commonMA.meta.MA_META.DPT_LVL_NM);
	public static final MCMeta up_lv_dpt_nm_META = createCommonMeta($up_lv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rcv_bank_ac_nm_META = createCommonMeta($rcv_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta cal_nm_META = createCommonMeta($cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $DPT_BASE1 = "DPT_BASE1";
	public static final String $DPT_LVL1 = "DPT_LVL1";
	public static final String $DPT1 = "DPT1";
	public static final String $DPT_BASE3 = "DPT_BASE3";
	public static final String $BANK_AC1 = "BANK_AC1";
	public static final String $BANK_AC2 = "BANK_AC2";
	public static final String $WG1 = "WG1";
	public static final String $CAL_BASE1 = "CAL_BASE1";
	public static final String $DPT_BASE2 = "DPT_BASE2";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE1,
				new String[][]{
						{"dpt_cd", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE1");
				},
				(alias) -> {
					MAM_DPT_R own = MAM_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dpt_cd.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_LVL",
				$DPT_LVL1,
				new String[][]{
						{"dpt_lvl_cd", "dpt_lvl_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_LVL_R.create("DPT_LVL1");
				},
				(alias) -> {
					MAM_DPT_R own = MAM_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_LVL_R ref = mcframe.serverMA.dbc.MAM_DPT_LVL_R.create("DPT_LVL1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dpt_lvl_cd.eq(ref.dpt_lvl_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT",
				$DPT1,
				new String[][]{
						{"up_lv_dpt_cd", "dpt_cd"},
						{"st_dt", "st_dt"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_R.create("DPT1");
				},
				(alias) -> {
					MAM_DPT_R own = MAM_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_R ref = mcframe.serverMA.dbc.MAM_DPT_R.create("DPT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.up_lv_dpt_cd.eq(ref.dpt_cd));
					cond = cond.and(own.st_dt.eq(ref.st_dt));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE3,
				new String[][]{
						{"new_dpt_cd", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE3");
				},
				(alias) -> {
					MAM_DPT_R own = MAM_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.new_dpt_cd.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BANK_AC",
				$BANK_AC1,
				new String[][]{
						{"rcv_bank_ac_cd", "bank_ac_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BANK_AC_R.create("BANK_AC1");
				},
				(alias) -> {
					MAM_DPT_R own = MAM_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_BANK_AC_R ref = mcframe.serverMA.dbc.MAM_BANK_AC_R.create("BANK_AC1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.rcv_bank_ac_cd.eq(ref.bank_ac_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BANK_AC",
				$BANK_AC2,
				new String[][]{
						{"pay_bank_ac_cd", "bank_ac_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BANK_AC_R.create("BANK_AC2");
				},
				(alias) -> {
					MAM_DPT_R own = MAM_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_BANK_AC_R ref = mcframe.serverMA.dbc.MAM_BANK_AC_R.create("BANK_AC2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.pay_bank_ac_cd.eq(ref.bank_ac_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_WG",
				$WG1,
				new String[][]{
						{"wg_cd", "wg_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
				},
				(alias) -> {
					MAM_DPT_R own = MAM_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_WG_R ref = mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.wg_cd.eq(ref.wg_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CAL_BASE",
				$CAL_BASE1,
				new String[][]{
						{"cal_cd", "cal_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE1");
				},
				(alias) -> {
					MAM_DPT_R own = MAM_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_CAL_BASE_R ref = mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cal_cd.eq(ref.cal_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE2,
				new String[][]{
						{"up_lv_dpt_cd", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE2");
				},
				(alias) -> {
					MAM_DPT_R own = MAM_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.up_lv_dpt_cd.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_DPT_R> constMetas = new ConstMetaList<MAM_DPT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			dpt_cd_META,
			st_dt_META,
			end_dt_META,
			base_end_dt_META,
			dpt_nm_META,
			base_dpt_nm_META,
			dpt_lvl_cd_META,
			up_lv_dpt_cd_META,
			ac_dpt_cd_META,
			cost_dpt_cd_META,
			new_dpt_cd_META,
			zip_cd_META,
			base_zip_cd_META,
			addr1_META,
			base_addr1_META,
			addr2_META,
			base_addr2_META,
			addr3_META,
			base_addr3_META,
			addr4_META,
			base_addr4_META,
			tel_META,
			base_tel_META,
			fax_META,
			base_fax_META,
			wg_cd_META,
			rcv_bank_ac_cd_META,
			pay_bank_ac_cd_META,
			cal_cd_META,
			asst_dpt_flg_META,
			ar_dpt_flg_META,
			ap_dpt_flg_META,
			sls_dpt_flg_META,
			purc_dpt_flg_META,
			ship_dpt_flg_META,
			arr_dpt_flg_META,
			mfg_dpt_flg_META,
			sd_dpt_flg_META,
			insp_dpt_flg_META,
			bd_dpt_flg_META,
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
			dpt_lvl_nm_META,
			up_lv_dpt_nm_META,
			rcv_bank_ac_nm_META,
			pay_bank_ac_nm_META,
			wg_nm_META,
			cal_nm_META
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
	protected MAM_DPT_R(ConstMetaList<? extends MAM_DPT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_DPT_R(ConstMetaList<? extends MAM_DPT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_DPT_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$dpt_cd,
				"dpt_cd",
				dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_DPT_R.$st_dt,
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
			MAM_DPT_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_DPT_R.$end_dt,
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
			MAM_DPT_R.$base_end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_DPT_R.$base_end_dt,
				"base_end_dt",
				base_end_dt,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$dpt_nm,
				"dpt_nm",
				dpt_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$base_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$base_dpt_nm,
				"base_dpt_nm",
				base_dpt_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$dpt_lvl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$dpt_lvl_cd,
				"dpt_lvl_cd",
				dpt_lvl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$up_lv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$up_lv_dpt_cd,
				"up_lv_dpt_cd",
				up_lv_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$ac_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$ac_dpt_cd,
				"ac_dpt_cd",
				ac_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$cost_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$cost_dpt_cd,
				"cost_dpt_cd",
				cost_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$new_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$new_dpt_cd,
				"new_dpt_cd",
				new_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$zip_cd,
				"zip_cd",
				zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$base_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$base_zip_cd,
				"base_zip_cd",
				base_zip_cd,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$addr1,
				"addr1",
				addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$base_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$base_addr1,
				"base_addr1",
				base_addr1,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$addr2,
				"addr2",
				addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$base_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$base_addr2,
				"base_addr2",
				base_addr2,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$addr3,
				"addr3",
				addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$base_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$base_addr3,
				"base_addr3",
				base_addr3,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$addr4,
				"addr4",
				addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$base_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$base_addr4,
				"base_addr4",
				base_addr4,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$tel,
				"tel",
				tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$base_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$base_tel,
				"base_tel",
				base_tel,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$fax,
				"fax",
				fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$base_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$base_fax,
				"base_fax",
				base_fax,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$wg_cd,
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
			MAM_DPT_R.$rcv_bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$rcv_bank_ac_cd,
				"rcv_bank_ac_cd",
				rcv_bank_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$pay_bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$pay_bank_ac_cd,
				"pay_bank_ac_cd",
				pay_bank_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$cal_cd,
				"cal_cd",
				cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$asst_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$asst_dpt_flg,
				"asst_dpt_flg",
				asst_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$ar_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$ar_dpt_flg,
				"ar_dpt_flg",
				ar_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$ap_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$ap_dpt_flg,
				"ap_dpt_flg",
				ap_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$sls_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$sls_dpt_flg,
				"sls_dpt_flg",
				sls_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$purc_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$purc_dpt_flg,
				"purc_dpt_flg",
				purc_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$ship_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$ship_dpt_flg,
				"ship_dpt_flg",
				ship_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$arr_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$arr_dpt_flg,
				"arr_dpt_flg",
				arr_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$mfg_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$mfg_dpt_flg,
				"mfg_dpt_flg",
				mfg_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$sd_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$sd_dpt_flg,
				"sd_dpt_flg",
				sd_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$insp_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$insp_dpt_flg,
				"insp_dpt_flg",
				insp_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$bd_dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$bd_dpt_flg,
				"bd_dpt_flg",
				bd_dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$memo1,
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
			MAM_DPT_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$memo2,
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
			MAM_DPT_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$memo3,
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
			MAM_DPT_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_DPT_R.$del_flg,
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
			MAM_DPT_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$del_usr_id,
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
			MAM_DPT_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$del_usr_nm,
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
			MAM_DPT_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_DPT_R.$del_ts,
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
			MAM_DPT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$ins_usr_id,
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
			MAM_DPT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$ins_usr_nm,
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
			MAM_DPT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_DPT_R.$ins_ts,
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
			MAM_DPT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$ins_func_id,
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
			MAM_DPT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_DPT_R.$upd_cntr,
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
			MAM_DPT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$upd_usr_id,
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
			MAM_DPT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$upd_usr_nm,
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
			MAM_DPT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_DPT_R.$upd_ts,
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
			MAM_DPT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$upd_func_id,
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
			MAM_DPT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$upd_srv_req_no,
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
			MAM_DPT_R.$dpt_lvl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$dpt_lvl_nm,
				"dpt_lvl_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_LVL1.DPT_LVL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$up_lv_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$up_lv_dpt_nm,
				"up_lv_dpt_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT1.DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$rcv_bank_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$rcv_bank_ac_nm,
				"rcv_bank_ac_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"BANK_AC1.BANK_AC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$pay_bank_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$pay_bank_ac_nm,
				"pay_bank_ac_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"BANK_AC2.BANK_AC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$wg_nm,
				"wg_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"WG1.WG_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_DPT_R.$cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_DPT_R.$cal_nm,
				"cal_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CAL_BASE1.CAL_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_DPT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_DPT_R create(String alias) {
		MAM_DPT_R row = new MAM_DPT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_DPT_R createByName(T proto) {
		MAM_DPT_R row = MAM_DPT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_DPT_R clone() {
		return (MAM_DPT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_DPT_R createInstance() {
		return (MAM_DPT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_DPT_R getValues(String... names) {
		return (MAM_DPT_R) super.getValues(names);
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
	 public MAW_DPT_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_DPT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_DPT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_DPT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 0, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 0, $dpt_cd, value);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 1, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 1, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 2, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 2, $end_dt, value);
	}

	/**
	 * 適用終了日（ベース）. Application end date(Base).<p>
	 *
	 */
	public MCDate base_end_dt() {
		return getConstDate(offset + 3, $base_end_dt);
	}

	/**
	 * 適用終了日（ベース）. Application end date(Base).<p>
	 *
	 */
	public void base_end_dt(MCDate value) {
		setConstDate(offset + 3, $base_end_dt, value);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 4, $dpt_nm);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 4, $dpt_nm, value);
	}

	/**
	 * 部門名（ベース）. Dept. name(Base).<p>
	 *
	 */
	public String base_dpt_nm() {
		return getConstString(offset + 5, $base_dpt_nm);
	}

	/**
	 * 部門名（ベース）. Dept. name(Base).<p>
	 *
	 */
	public void base_dpt_nm(String value) {
		setConstString(offset + 5, $base_dpt_nm, value);
	}

	/**
	 * 部門階層ＣＤ. Dept. hierarchy cd..<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 6, $dpt_lvl_cd);
	}

	/**
	 * 部門階層ＣＤ. Dept. hierarchy cd..<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 6, $dpt_lvl_cd, value);
	}

	/**
	 * 上位部門ＣＤ. Upper dept. cd..<p>
	 *
	 */
	public String up_lv_dpt_cd() {
		return getConstString(offset + 7, $up_lv_dpt_cd);
	}

	/**
	 * 上位部門ＣＤ. Upper dept. cd..<p>
	 *
	 */
	public void up_lv_dpt_cd(String value) {
		setConstString(offset + 7, $up_lv_dpt_cd, value);
	}

	/**
	 * 会計部門ＣＤ. Accounting dept. cd..<p>
	 *
	 */
	public String ac_dpt_cd() {
		return getConstString(offset + 8, $ac_dpt_cd);
	}

	/**
	 * 会計部門ＣＤ. Accounting dept. cd..<p>
	 *
	 */
	public void ac_dpt_cd(String value) {
		setConstString(offset + 8, $ac_dpt_cd, value);
	}

	/**
	 * 原価部門ＣＤ. Cost dept. cd..<p>
	 *
	 */
	public String cost_dpt_cd() {
		return getConstString(offset + 9, $cost_dpt_cd);
	}

	/**
	 * 原価部門ＣＤ. Cost dept. cd..<p>
	 *
	 */
	public void cost_dpt_cd(String value) {
		setConstString(offset + 9, $cost_dpt_cd, value);
	}

	/**
	 * 新部門ＣＤ. New dept. cd..<p>
	 *
	 */
	public String new_dpt_cd() {
		return getConstString(offset + 10, $new_dpt_cd);
	}

	/**
	 * 新部門ＣＤ. New dept. cd..<p>
	 *
	 */
	public void new_dpt_cd(String value) {
		setConstString(offset + 10, $new_dpt_cd, value);
	}

	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 11, $zip_cd);
	}

	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 11, $zip_cd, value);
	}

	/**
	 * 郵便番号（ベース）. Zip code(Base).<p>
	 *
	 */
	public String base_zip_cd() {
		return getConstString(offset + 12, $base_zip_cd);
	}

	/**
	 * 郵便番号（ベース）. Zip code(Base).<p>
	 *
	 */
	public void base_zip_cd(String value) {
		setConstString(offset + 12, $base_zip_cd, value);
	}

	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 13, $addr1);
	}

	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 13, $addr1, value);
	}

	/**
	 * 住所１（ベース）. Address 1(Base).<p>
	 *
	 */
	public String base_addr1() {
		return getConstString(offset + 14, $base_addr1);
	}

	/**
	 * 住所１（ベース）. Address 1(Base).<p>
	 *
	 */
	public void base_addr1(String value) {
		setConstString(offset + 14, $base_addr1, value);
	}

	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 15, $addr2);
	}

	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 15, $addr2, value);
	}

	/**
	 * 住所２（ベース）. Address 2(Base).<p>
	 *
	 */
	public String base_addr2() {
		return getConstString(offset + 16, $base_addr2);
	}

	/**
	 * 住所２（ベース）. Address 2(Base).<p>
	 *
	 */
	public void base_addr2(String value) {
		setConstString(offset + 16, $base_addr2, value);
	}

	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 17, $addr3);
	}

	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 17, $addr3, value);
	}

	/**
	 * 住所３（ベース）. Address 3(Base).<p>
	 *
	 */
	public String base_addr3() {
		return getConstString(offset + 18, $base_addr3);
	}

	/**
	 * 住所３（ベース）. Address 3(Base).<p>
	 *
	 */
	public void base_addr3(String value) {
		setConstString(offset + 18, $base_addr3, value);
	}

	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 19, $addr4);
	}

	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 19, $addr4, value);
	}

	/**
	 * 住所４（ベース）. Address 4(Base).<p>
	 *
	 */
	public String base_addr4() {
		return getConstString(offset + 20, $base_addr4);
	}

	/**
	 * 住所４（ベース）. Address 4(Base).<p>
	 *
	 */
	public void base_addr4(String value) {
		setConstString(offset + 20, $base_addr4, value);
	}

	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 21, $tel);
	}

	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 21, $tel, value);
	}

	/**
	 * ＴＥＬ（ベース）. TEL(Base).<p>
	 *
	 */
	public String base_tel() {
		return getConstString(offset + 22, $base_tel);
	}

	/**
	 * ＴＥＬ（ベース）. TEL(Base).<p>
	 *
	 */
	public void base_tel(String value) {
		setConstString(offset + 22, $base_tel, value);
	}

	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 23, $fax);
	}

	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 23, $fax, value);
	}

	/**
	 * ＦＡＸ（ベース）. FAX(Base).<p>
	 *
	 */
	public String base_fax() {
		return getConstString(offset + 24, $base_fax);
	}

	/**
	 * ＦＡＸ（ベース）. FAX(Base).<p>
	 *
	 */
	public void base_fax(String value) {
		setConstString(offset + 24, $base_fax, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 25, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 25, $wg_cd, value);
	}

	/**
	 * 入金口座ＣＤ. Payment received bank account cd..<p>
	 *
	 */
	public String rcv_bank_ac_cd() {
		return getConstString(offset + 26, $rcv_bank_ac_cd);
	}

	/**
	 * 入金口座ＣＤ. Payment received bank account cd..<p>
	 *
	 */
	public void rcv_bank_ac_cd(String value) {
		setConstString(offset + 26, $rcv_bank_ac_cd, value);
	}

	/**
	 * 支払口座ＣＤ. Payment account cd..<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 27, $pay_bank_ac_cd);
	}

	/**
	 * 支払口座ＣＤ. Payment account cd..<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 27, $pay_bank_ac_cd, value);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 28, $cal_cd);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 28, $cal_cd, value);
	}

	/**
	 * 資産管理部門ＦＬＧ. Asset management dept. flg..<p>
	 *
	 */
	public boolean asst_dpt_flg() {
		return getConstBoolean(offset + 29, $asst_dpt_flg);
	}

	/**
	 * 資産管理部門ＦＬＧ. Asset management dept. flg..<p>
	 *
	 */
	public void asst_dpt_flg(boolean value) {
		setConstBoolean(offset + 29, $asst_dpt_flg, value);
	}

	/**
	 * 債権部門ＦＬＧ. AR dept. flg..<p>
	 *
	 */
	public boolean ar_dpt_flg() {
		return getConstBoolean(offset + 30, $ar_dpt_flg);
	}

	/**
	 * 債権部門ＦＬＧ. AR dept. flg..<p>
	 *
	 */
	public void ar_dpt_flg(boolean value) {
		setConstBoolean(offset + 30, $ar_dpt_flg, value);
	}

	/**
	 * 債務部門ＦＬＧ. AP dept. flg..<p>
	 *
	 */
	public boolean ap_dpt_flg() {
		return getConstBoolean(offset + 31, $ap_dpt_flg);
	}

	/**
	 * 債務部門ＦＬＧ. AP dept. flg..<p>
	 *
	 */
	public void ap_dpt_flg(boolean value) {
		setConstBoolean(offset + 31, $ap_dpt_flg, value);
	}

	/**
	 * 営業部門ＦＬＧ. Sales dept. flg..<p>
	 *
	 */
	public boolean sls_dpt_flg() {
		return getConstBoolean(offset + 32, $sls_dpt_flg);
	}

	/**
	 * 営業部門ＦＬＧ. Sales dept. flg..<p>
	 *
	 */
	public void sls_dpt_flg(boolean value) {
		setConstBoolean(offset + 32, $sls_dpt_flg, value);
	}

	/**
	 * 購買部門ＦＬＧ. Purchasing dept. flg..<p>
	 *
	 */
	public boolean purc_dpt_flg() {
		return getConstBoolean(offset + 33, $purc_dpt_flg);
	}

	/**
	 * 購買部門ＦＬＧ. Purchasing dept. flg..<p>
	 *
	 */
	public void purc_dpt_flg(boolean value) {
		setConstBoolean(offset + 33, $purc_dpt_flg, value);
	}

	/**
	 * 出荷部門ＦＬＧ. Shipping dept. flg..<p>
	 *
	 */
	public boolean ship_dpt_flg() {
		return getConstBoolean(offset + 34, $ship_dpt_flg);
	}

	/**
	 * 出荷部門ＦＬＧ. Shipping dept. flg..<p>
	 *
	 */
	public void ship_dpt_flg(boolean value) {
		setConstBoolean(offset + 34, $ship_dpt_flg, value);
	}

	/**
	 * 入荷部門ＦＬＧ. Receipt dept. flg..<p>
	 *
	 */
	public boolean arr_dpt_flg() {
		return getConstBoolean(offset + 35, $arr_dpt_flg);
	}

	/**
	 * 入荷部門ＦＬＧ. Receipt dept. flg..<p>
	 *
	 */
	public void arr_dpt_flg(boolean value) {
		setConstBoolean(offset + 35, $arr_dpt_flg, value);
	}

	/**
	 * 製造部門ＦＬＧ. Mfg. dept. flg..<p>
	 *
	 */
	public boolean mfg_dpt_flg() {
		return getConstBoolean(offset + 36, $mfg_dpt_flg);
	}

	/**
	 * 製造部門ＦＬＧ. Mfg. dept. flg..<p>
	 *
	 */
	public void mfg_dpt_flg(boolean value) {
		setConstBoolean(offset + 36, $mfg_dpt_flg, value);
	}

	/**
	 * 需給部門ＦＬＧ. Demand and supply dept. flg..<p>
	 *
	 */
	public boolean sd_dpt_flg() {
		return getConstBoolean(offset + 37, $sd_dpt_flg);
	}

	/**
	 * 需給部門ＦＬＧ. Demand and supply dept. flg..<p>
	 *
	 */
	public void sd_dpt_flg(boolean value) {
		setConstBoolean(offset + 37, $sd_dpt_flg, value);
	}

	/**
	 * 検査部門ＦＬＧ. Inspection dept. flg..<p>
	 *
	 */
	public boolean insp_dpt_flg() {
		return getConstBoolean(offset + 38, $insp_dpt_flg);
	}

	/**
	 * 検査部門ＦＬＧ. Inspection dept. flg..<p>
	 *
	 */
	public void insp_dpt_flg(boolean value) {
		setConstBoolean(offset + 38, $insp_dpt_flg, value);
	}

	/**
	 * 負担部門ＦＬＧ. Charged dept. flg..<p>
	 *
	 */
	public boolean bd_dpt_flg() {
		return getConstBoolean(offset + 39, $bd_dpt_flg);
	}

	/**
	 * 負担部門ＦＬＧ. Charged dept. flg..<p>
	 *
	 */
	public void bd_dpt_flg(boolean value) {
		setConstBoolean(offset + 39, $bd_dpt_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 40, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 40, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 41, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 41, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 42, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 42, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 43, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 43, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 44, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 44, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 45, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 45, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 46, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 46, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 47, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 47, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 48, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 48, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 49, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 50, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 50, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 51, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 52, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 52, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 53, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 53, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 54, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 54, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 55, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 55, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 56, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 56, $upd_srv_req_no, value);
	}

	/**
	 * 部門階層名. Dept. hierarchy name.<p>
	 *
	 */
	public String dpt_lvl_nm() {
		return getConstString(offset + 57, $dpt_lvl_nm);
	}

	/**
	 * 部門階層名. Dept. hierarchy name.<p>
	 *
	 */
	public void dpt_lvl_nm(String value) {
		setConstString(offset + 57, $dpt_lvl_nm, value);
	}

	/**
	 * 上位部門名. Upper dept. name.<p>
	 *
	 */
	public String up_lv_dpt_nm() {
		return getConstString(offset + 58, $up_lv_dpt_nm);
	}

	/**
	 * 上位部門名. Upper dept. name.<p>
	 *
	 */
	public void up_lv_dpt_nm(String value) {
		setConstString(offset + 58, $up_lv_dpt_nm, value);
	}

	/**
	 * 入金口座名. Payment received account name.<p>
	 *
	 */
	public String rcv_bank_ac_nm() {
		return getConstString(offset + 59, $rcv_bank_ac_nm);
	}

	/**
	 * 入金口座名. Payment received account name.<p>
	 *
	 */
	public void rcv_bank_ac_nm(String value) {
		setConstString(offset + 59, $rcv_bank_ac_nm, value);
	}

	/**
	 * 支払口座名. Payment account name.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 60, $pay_bank_ac_nm);
	}

	/**
	 * 支払口座名. Payment account name.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 60, $pay_bank_ac_nm, value);
	}

	/**
	 * ＷＧ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 61, $wg_nm);
	}

	/**
	 * ＷＧ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 61, $wg_nm, value);
	}

	/**
	 * カレンダ名. Calendar name.<p>
	 *
	 */
	public String cal_nm() {
		return getConstString(offset + 62, $cal_nm);
	}

	/**
	 * カレンダ名. Calendar name.<p>
	 *
	 */
	public void cal_nm(String value) {
		setConstString(offset + 62, $cal_nm, value);
	}

	public String getString(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($base_dpt_nm.equalsIgnoreCase(name)) {
			return base_dpt_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			return up_lv_dpt_cd();
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			return ac_dpt_cd();
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			return cost_dpt_cd();
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			return new_dpt_cd();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			return base_zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			return base_addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			return base_addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			return base_addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			return base_addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			return base_tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			return base_fax();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			return rcv_bank_ac_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
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
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			return up_lv_dpt_nm();
		}
		if ($rcv_bank_ac_nm.equalsIgnoreCase(name)) {
			return rcv_bank_ac_nm();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
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
		if ($base_end_dt.equalsIgnoreCase(name)) {
			return base_end_dt();
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
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			return asst_dpt_flg();
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			return ar_dpt_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			return sls_dpt_flg();
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			return purc_dpt_flg();
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			return ship_dpt_flg();
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			return arr_dpt_flg();
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			return mfg_dpt_flg();
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			return sd_dpt_flg();
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			return insp_dpt_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($base_dpt_nm.equalsIgnoreCase(name)) {
			return base_dpt_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			return up_lv_dpt_cd();
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			return ac_dpt_cd();
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			return cost_dpt_cd();
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			return new_dpt_cd();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			return base_zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			return base_addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			return base_addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			return base_addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			return base_addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			return base_tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			return base_fax();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			return rcv_bank_ac_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
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
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			return up_lv_dpt_nm();
		}
		if ($rcv_bank_ac_nm.equalsIgnoreCase(name)) {
			return rcv_bank_ac_nm();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
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
		if ($base_end_dt.equalsIgnoreCase(name)) {
			return base_end_dt();
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
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			return asst_dpt_flg();
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			return ar_dpt_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			return sls_dpt_flg();
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			return purc_dpt_flg();
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			return ship_dpt_flg();
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			return arr_dpt_flg();
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			return mfg_dpt_flg();
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			return sd_dpt_flg();
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			return insp_dpt_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($base_dpt_nm.equalsIgnoreCase(name)) {
			base_dpt_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			up_lv_dpt_cd(value);
			return;
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			ac_dpt_cd(value);
			return;
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			cost_dpt_cd(value);
			return;
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			new_dpt_cd(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			base_zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			base_addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			base_addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			base_addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			base_addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			base_tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			base_fax(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			rcv_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
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
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			up_lv_dpt_nm(value);
			return;
		}
		if ($rcv_bank_ac_nm.equalsIgnoreCase(name)) {
			rcv_bank_ac_nm(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
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
		if ($base_end_dt.equalsIgnoreCase(name)) {
			base_end_dt(value);
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
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			asst_dpt_flg(value);
			return;
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			ar_dpt_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			sls_dpt_flg(value);
			return;
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			purc_dpt_flg(value);
			return;
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			ship_dpt_flg(value);
			return;
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			arr_dpt_flg(value);
			return;
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			mfg_dpt_flg(value);
			return;
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			sd_dpt_flg(value);
			return;
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			insp_dpt_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($base_dpt_nm.equalsIgnoreCase(name)) {
			base_dpt_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			up_lv_dpt_cd(value);
			return;
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			ac_dpt_cd(value);
			return;
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			cost_dpt_cd(value);
			return;
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			new_dpt_cd(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			base_zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			base_addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			base_addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			base_addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			base_addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			base_tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			base_fax(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			rcv_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
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
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			up_lv_dpt_nm(value);
			return;
		}
		if ($rcv_bank_ac_nm.equalsIgnoreCase(name)) {
			rcv_bank_ac_nm(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
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
		if ($base_end_dt.equalsIgnoreCase(name)) {
			base_end_dt(value);
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
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			asst_dpt_flg(value);
			return;
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			ar_dpt_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			sls_dpt_flg(value);
			return;
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			purc_dpt_flg(value);
			return;
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			ship_dpt_flg(value);
			return;
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			arr_dpt_flg(value);
			return;
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			mfg_dpt_flg(value);
			return;
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			sd_dpt_flg(value);
			return;
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			insp_dpt_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
