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
 * "担当者権限マスタ // PIC authority master"DBコンテナRowクラスです。<p>
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
 *  	<td>usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
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
 *  	<td>da_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>データアクセスＣＤ</td>
 *  	<td>Data access cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_cl_usr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仮締訂正可能ＦＬＧ</td>
 *  	<td>Allow data correction after temporary closing flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cl_usr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>本締訂正可能ＦＬＧ</td>
 *  	<td>Allow data correction after final closing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主部門ＣＤ</td>
 *  	<td>Main dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>add_dpt_cd1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>兼務部門ＣＤ１</td>
 *  	<td>Concurrent dept. cd.1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>add_dpt_cd2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>兼務部門ＣＤ２</td>
 *  	<td>Concurrent dept. cd.2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>add_dpt_cd3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>兼務部門ＣＤ３</td>
 *  	<td>Concurrent dept. cd.3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>add_dpt_cd4</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>兼務部門ＣＤ４</td>
 *  	<td>Concurrent dept. cd.4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>add_dpt_cd5</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>兼務部門ＣＤ５</td>
 *  	<td>Concurrent dept. cd.5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>add_dpt_cd6</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>兼務部門ＣＤ６</td>
 *  	<td>Concurrent dept. cd.6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>add_dpt_cd7</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>兼務部門ＣＤ７</td>
 *  	<td>Concurrent dept. cd.7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>add_dpt_cd8</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>兼務部門ＣＤ８</td>
 *  	<td>Concurrent dept. cd.8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>add_dpt_cd9</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>兼務部門ＣＤ９</td>
 *  	<td>Concurrent dept. cd.9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ（主）</td>
 *  	<td>Approval role cd. (Main)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_role_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ１（主）</td>
 *  	<td>Approval role cd. 1 (Main)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_role_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ２（主）</td>
 *  	<td>Approval role cd. 2 (Main)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_role_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ３（主）</td>
 *  	<td>Approval role cd. 3 (Main)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_role_cd4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ４（主）</td>
 *  	<td>Approval role cd. 4 (Main)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_role_cd5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ５（主）</td>
 *  	<td>Approval role cd. 5 (Main)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_role_cd6</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ６（主）</td>
 *  	<td>Approval role cd. 6 (Main)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_role_cd7</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ７（主）</td>
 *  	<td>Approval role cd. 7 (Main)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_role_cd8</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ８（主）</td>
 *  	<td>Approval role cd. 8 (Main)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_role_cd9</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ９（主）</td>
 *  	<td>Approval role cd. 9 (Main)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ（副）</td>
 *  	<td>Approval role cd. (Sub)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_aprv_role_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ１（副）</td>
 *  	<td>Approval role cd. 1 (Sub)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_aprv_role_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ２（副）</td>
 *  	<td>Approval role cd. 2 (Sub)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_aprv_role_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ３（副）</td>
 *  	<td>Approval role cd. 3 (Sub)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_aprv_role_cd4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ４（副）</td>
 *  	<td>Approval role cd. 4 (Sub)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_aprv_role_cd5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ５（副）</td>
 *  	<td>Approval role cd. 5 (Sub)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_aprv_role_cd6</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ６（副）</td>
 *  	<td>Approval role cd. 6 (Sub)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_aprv_role_cd7</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ７（副）</td>
 *  	<td>Approval role cd. 7 (Sub)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_aprv_role_cd8</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ８（副）</td>
 *  	<td>Approval role cd. 8 (Sub)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_aprv_role_cd9</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認役割ＣＤ９（副）</td>
 *  	<td>Approval role cd. 9 (Sub)</td>
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
 *  	<td>usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>USR1.USR_NM</td>
 *  	<td>担当者名</td>
 *  	<td>PIC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>da_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>DA1.DA_NM</td>
 *  	<td>データアクセス名</td>
 *  	<td>Data access name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE1.DEF_DPT_NM</td>
 *  	<td>主部門名</td>
 *  	<td>Main dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>add_dpt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE2.DEF_DPT_NM</td>
 *  	<td>兼務部門名１</td>
 *  	<td>Concurrent dept. name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>add_dpt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE3.DEF_DPT_NM</td>
 *  	<td>兼務部門名２</td>
 *  	<td>Concurrent dept. name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>add_dpt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE4.DEF_DPT_NM</td>
 *  	<td>兼務部門名３</td>
 *  	<td>Concurrent dept. name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>add_dpt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE5.DEF_DPT_NM</td>
 *  	<td>兼務部門名４</td>
 *  	<td>Concurrent dept. name 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>add_dpt_nm5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE6.DEF_DPT_NM</td>
 *  	<td>兼務部門名５</td>
 *  	<td>Concurrent dept. name 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>add_dpt_nm6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE7.DEF_DPT_NM</td>
 *  	<td>兼務部門名６</td>
 *  	<td>Concurrent dept. name 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>add_dpt_nm7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE8.DEF_DPT_NM</td>
 *  	<td>兼務部門名７</td>
 *  	<td>Concurrent dept. name 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>add_dpt_nm8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE9.DEF_DPT_NM</td>
 *  	<td>兼務部門名８</td>
 *  	<td>Concurrent dept. name 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>add_dpt_nm9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE10.DEF_DPT_NM</td>
 *  	<td>兼務部門名９</td>
 *  	<td>Concurrent dept. name 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_role_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE1.APRV_ROLE_NM</td>
 *  	<td>承認役割名（主）</td>
 *  	<td>Approval role name (Main)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_role_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE3.APRV_ROLE_NM</td>
 *  	<td>承認役割名１（主）</td>
 *  	<td>Approval role name 1 (Main)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_role_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE4.APRV_ROLE_NM</td>
 *  	<td>承認役割名２（主）</td>
 *  	<td>Approval role name 2 (Main)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_role_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE5.APRV_ROLE_NM</td>
 *  	<td>承認役割名３（主）</td>
 *  	<td>Approval role name 3 (Main)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_role_nm4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE6.APRV_ROLE_NM</td>
 *  	<td>承認役割名４（主）</td>
 *  	<td>Approval role name 4 (Main)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_role_nm5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE7.APRV_ROLE_NM</td>
 *  	<td>承認役割名５（主）</td>
 *  	<td>Approval role name 5 (Main)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_role_nm6</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE8.APRV_ROLE_NM</td>
 *  	<td>承認役割名６（主）</td>
 *  	<td>Approval role name 6 (Main)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_role_nm7</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE9.APRV_ROLE_NM</td>
 *  	<td>承認役割名７（主）</td>
 *  	<td>Approval role name 7 (Main)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_role_nm8</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE10.APRV_ROLE_NM</td>
 *  	<td>承認役割名８（主）</td>
 *  	<td>Approval role name 8 (Main)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_role_nm9</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE11.APRV_ROLE_NM</td>
 *  	<td>承認役割名９（主）</td>
 *  	<td>Approval role name 9 (Main)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_aprv_role_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE2.APRV_ROLE_NM</td>
 *  	<td>承認役割名（副）</td>
 *  	<td>Approval role name (Sub)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_aprv_role_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE12.APRV_ROLE_NM</td>
 *  	<td>承認役割名１（副）</td>
 *  	<td>Approval role name 1 (Sub)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_aprv_role_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE13.APRV_ROLE_NM</td>
 *  	<td>承認役割名２（副）</td>
 *  	<td>Approval role name 2 (Sub)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_aprv_role_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE14.APRV_ROLE_NM</td>
 *  	<td>承認役割名３（副）</td>
 *  	<td>Approval role name 3 (Sub)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_aprv_role_nm4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE15.APRV_ROLE_NM</td>
 *  	<td>承認役割名４（副）</td>
 *  	<td>Approval role name 4 (Sub)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_aprv_role_nm5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE16.APRV_ROLE_NM</td>
 *  	<td>承認役割名５（副）</td>
 *  	<td>Approval role name 5 (Sub)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_aprv_role_nm6</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE17.APRV_ROLE_NM</td>
 *  	<td>承認役割名６（副）</td>
 *  	<td>Approval role name 6 (Sub)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_aprv_role_nm7</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE18.APRV_ROLE_NM</td>
 *  	<td>承認役割名７（副）</td>
 *  	<td>Approval role name 7 (Sub)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_aprv_role_nm8</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE19.APRV_ROLE_NM</td>
 *  	<td>承認役割名８（副）</td>
 *  	<td>Approval role name 8 (Sub)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_aprv_role_nm9</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE20.APRV_ROLE_NM</td>
 *  	<td>承認役割名９（副）</td>
 *  	<td>Approval role name 9 (Sub)</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_USR_ACL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_USR_ACL";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	private static final MCPermColumnInfo _usr_cd = createColumnInfo("usr_cd");
	public final MCStringPermColumn usr_cd = createStringColumn(_usr_cd);
	
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
	 * データアクセスＣＤ. Data access cd..<p>
	 *
	 */
	public static final String $da_cd = "da_cd";
	private static final MCPermColumnInfo _da_cd = createColumnInfo("da_cd");
	public final MCStringPermColumn da_cd = createStringColumn(_da_cd);
	
	/**
	 * 仮締訂正可能ＦＬＧ. Allow data correction after temporary closing flg..<p>
	 *
	 */
	public static final String $pre_cl_usr_flg = "pre_cl_usr_flg";
	private static final MCPermColumnInfo _pre_cl_usr_flg = createColumnInfo("pre_cl_usr_flg");
	public final MCBooleanPermColumn pre_cl_usr_flg = createBooleanColumn(_pre_cl_usr_flg);
	
	/**
	 * 本締訂正可能ＦＬＧ. Allow data correction after final closing flg..<p>
	 *
	 */
	public static final String $cl_usr_flg = "cl_usr_flg";
	private static final MCPermColumnInfo _cl_usr_flg = createColumnInfo("cl_usr_flg");
	public final MCBooleanPermColumn cl_usr_flg = createBooleanColumn(_cl_usr_flg);
	
	/**
	 * 主部門ＣＤ. Main dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 兼務部門ＣＤ１. Concurrent dept. cd.1.<p>
	 *
	 */
	public static final String $add_dpt_cd1 = "add_dpt_cd1";
	private static final MCPermColumnInfo _add_dpt_cd1 = createColumnInfo("add_dpt_cd1");
	public final MCStringPermColumn add_dpt_cd1 = createStringColumn(_add_dpt_cd1);
	
	/**
	 * 兼務部門ＣＤ２. Concurrent dept. cd.2.<p>
	 *
	 */
	public static final String $add_dpt_cd2 = "add_dpt_cd2";
	private static final MCPermColumnInfo _add_dpt_cd2 = createColumnInfo("add_dpt_cd2");
	public final MCStringPermColumn add_dpt_cd2 = createStringColumn(_add_dpt_cd2);
	
	/**
	 * 兼務部門ＣＤ３. Concurrent dept. cd.3.<p>
	 *
	 */
	public static final String $add_dpt_cd3 = "add_dpt_cd3";
	private static final MCPermColumnInfo _add_dpt_cd3 = createColumnInfo("add_dpt_cd3");
	public final MCStringPermColumn add_dpt_cd3 = createStringColumn(_add_dpt_cd3);
	
	/**
	 * 兼務部門ＣＤ４. Concurrent dept. cd.4.<p>
	 *
	 */
	public static final String $add_dpt_cd4 = "add_dpt_cd4";
	private static final MCPermColumnInfo _add_dpt_cd4 = createColumnInfo("add_dpt_cd4");
	public final MCStringPermColumn add_dpt_cd4 = createStringColumn(_add_dpt_cd4);
	
	/**
	 * 兼務部門ＣＤ５. Concurrent dept. cd.5.<p>
	 *
	 */
	public static final String $add_dpt_cd5 = "add_dpt_cd5";
	private static final MCPermColumnInfo _add_dpt_cd5 = createColumnInfo("add_dpt_cd5");
	public final MCStringPermColumn add_dpt_cd5 = createStringColumn(_add_dpt_cd5);
	
	/**
	 * 兼務部門ＣＤ６. Concurrent dept. cd.6.<p>
	 *
	 */
	public static final String $add_dpt_cd6 = "add_dpt_cd6";
	private static final MCPermColumnInfo _add_dpt_cd6 = createColumnInfo("add_dpt_cd6");
	public final MCStringPermColumn add_dpt_cd6 = createStringColumn(_add_dpt_cd6);
	
	/**
	 * 兼務部門ＣＤ７. Concurrent dept. cd.7.<p>
	 *
	 */
	public static final String $add_dpt_cd7 = "add_dpt_cd7";
	private static final MCPermColumnInfo _add_dpt_cd7 = createColumnInfo("add_dpt_cd7");
	public final MCStringPermColumn add_dpt_cd7 = createStringColumn(_add_dpt_cd7);
	
	/**
	 * 兼務部門ＣＤ８. Concurrent dept. cd.8.<p>
	 *
	 */
	public static final String $add_dpt_cd8 = "add_dpt_cd8";
	private static final MCPermColumnInfo _add_dpt_cd8 = createColumnInfo("add_dpt_cd8");
	public final MCStringPermColumn add_dpt_cd8 = createStringColumn(_add_dpt_cd8);
	
	/**
	 * 兼務部門ＣＤ９. Concurrent dept. cd.9.<p>
	 *
	 */
	public static final String $add_dpt_cd9 = "add_dpt_cd9";
	private static final MCPermColumnInfo _add_dpt_cd9 = createColumnInfo("add_dpt_cd9");
	public final MCStringPermColumn add_dpt_cd9 = createStringColumn(_add_dpt_cd9);
	
	/**
	 * 承認役割ＣＤ（主）. Approval role cd. (Main).<p>
	 *
	 */
	public static final String $aprv_role_cd = "aprv_role_cd";
	private static final MCPermColumnInfo _aprv_role_cd = createColumnInfo("aprv_role_cd");
	public final MCStringPermColumn aprv_role_cd = createStringColumn(_aprv_role_cd);
	
	/**
	 * 承認役割ＣＤ１（主）. Approval role cd. 1 (Main).<p>
	 *
	 */
	public static final String $aprv_role_cd1 = "aprv_role_cd1";
	private static final MCPermColumnInfo _aprv_role_cd1 = createColumnInfo("aprv_role_cd1");
	public final MCStringPermColumn aprv_role_cd1 = createStringColumn(_aprv_role_cd1);
	
	/**
	 * 承認役割ＣＤ２（主）. Approval role cd. 2 (Main).<p>
	 *
	 */
	public static final String $aprv_role_cd2 = "aprv_role_cd2";
	private static final MCPermColumnInfo _aprv_role_cd2 = createColumnInfo("aprv_role_cd2");
	public final MCStringPermColumn aprv_role_cd2 = createStringColumn(_aprv_role_cd2);
	
	/**
	 * 承認役割ＣＤ３（主）. Approval role cd. 3 (Main).<p>
	 *
	 */
	public static final String $aprv_role_cd3 = "aprv_role_cd3";
	private static final MCPermColumnInfo _aprv_role_cd3 = createColumnInfo("aprv_role_cd3");
	public final MCStringPermColumn aprv_role_cd3 = createStringColumn(_aprv_role_cd3);
	
	/**
	 * 承認役割ＣＤ４（主）. Approval role cd. 4 (Main).<p>
	 *
	 */
	public static final String $aprv_role_cd4 = "aprv_role_cd4";
	private static final MCPermColumnInfo _aprv_role_cd4 = createColumnInfo("aprv_role_cd4");
	public final MCStringPermColumn aprv_role_cd4 = createStringColumn(_aprv_role_cd4);
	
	/**
	 * 承認役割ＣＤ５（主）. Approval role cd. 5 (Main).<p>
	 *
	 */
	public static final String $aprv_role_cd5 = "aprv_role_cd5";
	private static final MCPermColumnInfo _aprv_role_cd5 = createColumnInfo("aprv_role_cd5");
	public final MCStringPermColumn aprv_role_cd5 = createStringColumn(_aprv_role_cd5);
	
	/**
	 * 承認役割ＣＤ６（主）. Approval role cd. 6 (Main).<p>
	 *
	 */
	public static final String $aprv_role_cd6 = "aprv_role_cd6";
	private static final MCPermColumnInfo _aprv_role_cd6 = createColumnInfo("aprv_role_cd6");
	public final MCStringPermColumn aprv_role_cd6 = createStringColumn(_aprv_role_cd6);
	
	/**
	 * 承認役割ＣＤ７（主）. Approval role cd. 7 (Main).<p>
	 *
	 */
	public static final String $aprv_role_cd7 = "aprv_role_cd7";
	private static final MCPermColumnInfo _aprv_role_cd7 = createColumnInfo("aprv_role_cd7");
	public final MCStringPermColumn aprv_role_cd7 = createStringColumn(_aprv_role_cd7);
	
	/**
	 * 承認役割ＣＤ８（主）. Approval role cd. 8 (Main).<p>
	 *
	 */
	public static final String $aprv_role_cd8 = "aprv_role_cd8";
	private static final MCPermColumnInfo _aprv_role_cd8 = createColumnInfo("aprv_role_cd8");
	public final MCStringPermColumn aprv_role_cd8 = createStringColumn(_aprv_role_cd8);
	
	/**
	 * 承認役割ＣＤ９（主）. Approval role cd. 9 (Main).<p>
	 *
	 */
	public static final String $aprv_role_cd9 = "aprv_role_cd9";
	private static final MCPermColumnInfo _aprv_role_cd9 = createColumnInfo("aprv_role_cd9");
	public final MCStringPermColumn aprv_role_cd9 = createStringColumn(_aprv_role_cd9);
	
	/**
	 * 承認役割ＣＤ（副）. Approval role cd. (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_cd = "sub_aprv_role_cd";
	private static final MCPermColumnInfo _sub_aprv_role_cd = createColumnInfo("sub_aprv_role_cd");
	public final MCStringPermColumn sub_aprv_role_cd = createStringColumn(_sub_aprv_role_cd);
	
	/**
	 * 承認役割ＣＤ１（副）. Approval role cd. 1 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_cd1 = "sub_aprv_role_cd1";
	private static final MCPermColumnInfo _sub_aprv_role_cd1 = createColumnInfo("sub_aprv_role_cd1");
	public final MCStringPermColumn sub_aprv_role_cd1 = createStringColumn(_sub_aprv_role_cd1);
	
	/**
	 * 承認役割ＣＤ２（副）. Approval role cd. 2 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_cd2 = "sub_aprv_role_cd2";
	private static final MCPermColumnInfo _sub_aprv_role_cd2 = createColumnInfo("sub_aprv_role_cd2");
	public final MCStringPermColumn sub_aprv_role_cd2 = createStringColumn(_sub_aprv_role_cd2);
	
	/**
	 * 承認役割ＣＤ３（副）. Approval role cd. 3 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_cd3 = "sub_aprv_role_cd3";
	private static final MCPermColumnInfo _sub_aprv_role_cd3 = createColumnInfo("sub_aprv_role_cd3");
	public final MCStringPermColumn sub_aprv_role_cd3 = createStringColumn(_sub_aprv_role_cd3);
	
	/**
	 * 承認役割ＣＤ４（副）. Approval role cd. 4 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_cd4 = "sub_aprv_role_cd4";
	private static final MCPermColumnInfo _sub_aprv_role_cd4 = createColumnInfo("sub_aprv_role_cd4");
	public final MCStringPermColumn sub_aprv_role_cd4 = createStringColumn(_sub_aprv_role_cd4);
	
	/**
	 * 承認役割ＣＤ５（副）. Approval role cd. 5 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_cd5 = "sub_aprv_role_cd5";
	private static final MCPermColumnInfo _sub_aprv_role_cd5 = createColumnInfo("sub_aprv_role_cd5");
	public final MCStringPermColumn sub_aprv_role_cd5 = createStringColumn(_sub_aprv_role_cd5);
	
	/**
	 * 承認役割ＣＤ６（副）. Approval role cd. 6 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_cd6 = "sub_aprv_role_cd6";
	private static final MCPermColumnInfo _sub_aprv_role_cd6 = createColumnInfo("sub_aprv_role_cd6");
	public final MCStringPermColumn sub_aprv_role_cd6 = createStringColumn(_sub_aprv_role_cd6);
	
	/**
	 * 承認役割ＣＤ７（副）. Approval role cd. 7 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_cd7 = "sub_aprv_role_cd7";
	private static final MCPermColumnInfo _sub_aprv_role_cd7 = createColumnInfo("sub_aprv_role_cd7");
	public final MCStringPermColumn sub_aprv_role_cd7 = createStringColumn(_sub_aprv_role_cd7);
	
	/**
	 * 承認役割ＣＤ８（副）. Approval role cd. 8 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_cd8 = "sub_aprv_role_cd8";
	private static final MCPermColumnInfo _sub_aprv_role_cd8 = createColumnInfo("sub_aprv_role_cd8");
	public final MCStringPermColumn sub_aprv_role_cd8 = createStringColumn(_sub_aprv_role_cd8);
	
	/**
	 * 承認役割ＣＤ９（副）. Approval role cd. 9 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_cd9 = "sub_aprv_role_cd9";
	private static final MCPermColumnInfo _sub_aprv_role_cd9 = createColumnInfo("sub_aprv_role_cd9");
	public final MCStringPermColumn sub_aprv_role_cd9 = createStringColumn(_sub_aprv_role_cd9);
	
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
	 * 担当者名. PIC name.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	
	/**
	 * データアクセス名. Data access name.<p>
	 *
	 */
	public static final String $da_nm = "da_nm";
	
	/**
	 * 主部門名. Main dept. name.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	
	/**
	 * 兼務部門名１. Concurrent dept. name 1.<p>
	 *
	 */
	public static final String $add_dpt_nm1 = "add_dpt_nm1";
	
	/**
	 * 兼務部門名２. Concurrent dept. name 2.<p>
	 *
	 */
	public static final String $add_dpt_nm2 = "add_dpt_nm2";
	
	/**
	 * 兼務部門名３. Concurrent dept. name 3.<p>
	 *
	 */
	public static final String $add_dpt_nm3 = "add_dpt_nm3";
	
	/**
	 * 兼務部門名４. Concurrent dept. name 4.<p>
	 *
	 */
	public static final String $add_dpt_nm4 = "add_dpt_nm4";
	
	/**
	 * 兼務部門名５. Concurrent dept. name 5.<p>
	 *
	 */
	public static final String $add_dpt_nm5 = "add_dpt_nm5";
	
	/**
	 * 兼務部門名６. Concurrent dept. name 6.<p>
	 *
	 */
	public static final String $add_dpt_nm6 = "add_dpt_nm6";
	
	/**
	 * 兼務部門名７. Concurrent dept. name 7.<p>
	 *
	 */
	public static final String $add_dpt_nm7 = "add_dpt_nm7";
	
	/**
	 * 兼務部門名８. Concurrent dept. name 8.<p>
	 *
	 */
	public static final String $add_dpt_nm8 = "add_dpt_nm8";
	
	/**
	 * 兼務部門名９. Concurrent dept. name 9.<p>
	 *
	 */
	public static final String $add_dpt_nm9 = "add_dpt_nm9";
	
	/**
	 * 承認役割名（主）. Approval role name (Main).<p>
	 *
	 */
	public static final String $aprv_role_nm = "aprv_role_nm";
	
	/**
	 * 承認役割名１（主）. Approval role name 1 (Main).<p>
	 *
	 */
	public static final String $aprv_role_nm1 = "aprv_role_nm1";
	
	/**
	 * 承認役割名２（主）. Approval role name 2 (Main).<p>
	 *
	 */
	public static final String $aprv_role_nm2 = "aprv_role_nm2";
	
	/**
	 * 承認役割名３（主）. Approval role name 3 (Main).<p>
	 *
	 */
	public static final String $aprv_role_nm3 = "aprv_role_nm3";
	
	/**
	 * 承認役割名４（主）. Approval role name 4 (Main).<p>
	 *
	 */
	public static final String $aprv_role_nm4 = "aprv_role_nm4";
	
	/**
	 * 承認役割名５（主）. Approval role name 5 (Main).<p>
	 *
	 */
	public static final String $aprv_role_nm5 = "aprv_role_nm5";
	
	/**
	 * 承認役割名６（主）. Approval role name 6 (Main).<p>
	 *
	 */
	public static final String $aprv_role_nm6 = "aprv_role_nm6";
	
	/**
	 * 承認役割名７（主）. Approval role name 7 (Main).<p>
	 *
	 */
	public static final String $aprv_role_nm7 = "aprv_role_nm7";
	
	/**
	 * 承認役割名８（主）. Approval role name 8 (Main).<p>
	 *
	 */
	public static final String $aprv_role_nm8 = "aprv_role_nm8";
	
	/**
	 * 承認役割名９（主）. Approval role name 9 (Main).<p>
	 *
	 */
	public static final String $aprv_role_nm9 = "aprv_role_nm9";
	
	/**
	 * 承認役割名（副）. Approval role name (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_nm = "sub_aprv_role_nm";
	
	/**
	 * 承認役割名１（副）. Approval role name 1 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_nm1 = "sub_aprv_role_nm1";
	
	/**
	 * 承認役割名２（副）. Approval role name 2 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_nm2 = "sub_aprv_role_nm2";
	
	/**
	 * 承認役割名３（副）. Approval role name 3 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_nm3 = "sub_aprv_role_nm3";
	
	/**
	 * 承認役割名４（副）. Approval role name 4 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_nm4 = "sub_aprv_role_nm4";
	
	/**
	 * 承認役割名５（副）. Approval role name 5 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_nm5 = "sub_aprv_role_nm5";
	
	/**
	 * 承認役割名６（副）. Approval role name 6 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_nm6 = "sub_aprv_role_nm6";
	
	/**
	 * 承認役割名７（副）. Approval role name 7 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_nm7 = "sub_aprv_role_nm7";
	
	/**
	 * 承認役割名８（副）. Approval role name 8 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_nm8 = "sub_aprv_role_nm8";
	
	/**
	 * 承認役割名９（副）. Approval role name 9 (Sub).<p>
	 *
	 */
	public static final String $sub_aprv_role_nm9 = "sub_aprv_role_nm9";
	
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta da_cd_META = createCommonMeta($da_cd, mcframe.commonMA.meta.MA_META.DA_CD);
	public static final MCMeta pre_cl_usr_flg_META = createCommonMeta($pre_cl_usr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cl_usr_flg_META = createCommonMeta($cl_usr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd1_META = createCommonMeta($add_dpt_cd1, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd2_META = createCommonMeta($add_dpt_cd2, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd3_META = createCommonMeta($add_dpt_cd3, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd4_META = createCommonMeta($add_dpt_cd4, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd5_META = createCommonMeta($add_dpt_cd5, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd6_META = createCommonMeta($add_dpt_cd6, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd7_META = createCommonMeta($add_dpt_cd7, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd8_META = createCommonMeta($add_dpt_cd8, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd9_META = createCommonMeta($add_dpt_cd9, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd1_META = createCommonMeta($aprv_role_cd1, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd2_META = createCommonMeta($aprv_role_cd2, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd3_META = createCommonMeta($aprv_role_cd3, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd4_META = createCommonMeta($aprv_role_cd4, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd5_META = createCommonMeta($aprv_role_cd5, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd6_META = createCommonMeta($aprv_role_cd6, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd7_META = createCommonMeta($aprv_role_cd7, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd8_META = createCommonMeta($aprv_role_cd8, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd9_META = createCommonMeta($aprv_role_cd9, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd_META = createCommonMeta($sub_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd1_META = createCommonMeta($sub_aprv_role_cd1, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd2_META = createCommonMeta($sub_aprv_role_cd2, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd3_META = createCommonMeta($sub_aprv_role_cd3, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd4_META = createCommonMeta($sub_aprv_role_cd4, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd5_META = createCommonMeta($sub_aprv_role_cd5, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd6_META = createCommonMeta($sub_aprv_role_cd6, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd7_META = createCommonMeta($sub_aprv_role_cd7, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd8_META = createCommonMeta($sub_aprv_role_cd8, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd9_META = createCommonMeta($sub_aprv_role_cd9, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
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
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta da_nm_META = createCommonMeta($da_nm, mcframe.commonMA.meta.MA_META.DA_NM);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_nm1_META = createCommonMeta($add_dpt_nm1, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_nm2_META = createCommonMeta($add_dpt_nm2, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_nm3_META = createCommonMeta($add_dpt_nm3, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_nm4_META = createCommonMeta($add_dpt_nm4, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_nm5_META = createCommonMeta($add_dpt_nm5, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_nm6_META = createCommonMeta($add_dpt_nm6, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_nm7_META = createCommonMeta($add_dpt_nm7, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_nm8_META = createCommonMeta($add_dpt_nm8, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_nm9_META = createCommonMeta($add_dpt_nm9, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta aprv_role_nm_META = createCommonMeta($aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_nm1_META = createCommonMeta($aprv_role_nm1, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_nm2_META = createCommonMeta($aprv_role_nm2, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_nm3_META = createCommonMeta($aprv_role_nm3, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_nm4_META = createCommonMeta($aprv_role_nm4, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_nm5_META = createCommonMeta($aprv_role_nm5, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_nm6_META = createCommonMeta($aprv_role_nm6, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_nm7_META = createCommonMeta($aprv_role_nm7, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_nm8_META = createCommonMeta($aprv_role_nm8, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_nm9_META = createCommonMeta($aprv_role_nm9, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_nm_META = createCommonMeta($sub_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_nm1_META = createCommonMeta($sub_aprv_role_nm1, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_nm2_META = createCommonMeta($sub_aprv_role_nm2, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_nm3_META = createCommonMeta($sub_aprv_role_nm3, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_nm4_META = createCommonMeta($sub_aprv_role_nm4, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_nm5_META = createCommonMeta($sub_aprv_role_nm5, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_nm6_META = createCommonMeta($sub_aprv_role_nm6, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_nm7_META = createCommonMeta($sub_aprv_role_nm7, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_nm8_META = createCommonMeta($sub_aprv_role_nm8, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_nm9_META = createCommonMeta($sub_aprv_role_nm9, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $USR1 = "USR1";
	public static final String $DA1 = "DA1";
	public static final String $DPT_BASE1 = "DPT_BASE1";
	public static final String $DPT_BASE2 = "DPT_BASE2";
	public static final String $DPT_BASE3 = "DPT_BASE3";
	public static final String $DPT_BASE4 = "DPT_BASE4";
	public static final String $DPT_BASE5 = "DPT_BASE5";
	public static final String $DPT_BASE6 = "DPT_BASE6";
	public static final String $DPT_BASE7 = "DPT_BASE7";
	public static final String $DPT_BASE8 = "DPT_BASE8";
	public static final String $DPT_BASE9 = "DPT_BASE9";
	public static final String $DPT_BASE10 = "DPT_BASE10";
	public static final String $APRV_ROLE1 = "APRV_ROLE1";
	public static final String $APRV_ROLE3 = "APRV_ROLE3";
	public static final String $APRV_ROLE4 = "APRV_ROLE4";
	public static final String $APRV_ROLE5 = "APRV_ROLE5";
	public static final String $APRV_ROLE6 = "APRV_ROLE6";
	public static final String $APRV_ROLE7 = "APRV_ROLE7";
	public static final String $APRV_ROLE8 = "APRV_ROLE8";
	public static final String $APRV_ROLE9 = "APRV_ROLE9";
	public static final String $APRV_ROLE10 = "APRV_ROLE10";
	public static final String $APRV_ROLE11 = "APRV_ROLE11";
	public static final String $APRV_ROLE2 = "APRV_ROLE2";
	public static final String $APRV_ROLE12 = "APRV_ROLE12";
	public static final String $APRV_ROLE13 = "APRV_ROLE13";
	public static final String $APRV_ROLE14 = "APRV_ROLE14";
	public static final String $APRV_ROLE15 = "APRV_ROLE15";
	public static final String $APRV_ROLE16 = "APRV_ROLE16";
	public static final String $APRV_ROLE17 = "APRV_ROLE17";
	public static final String $APRV_ROLE18 = "APRV_ROLE18";
	public static final String $APRV_ROLE19 = "APRV_ROLE19";
	public static final String $APRV_ROLE20 = "APRV_ROLE20";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_USR",
				$USR1,
				new String[][]{
						{"usr_cd", "usr_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_USR_R.create("USR1");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_USR_R ref = mcframe.serverMA.dbc.MAM_USR_R.create("USR1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.usr_cd.eq(ref.usr_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DA",
				$DA1,
				new String[][]{
						{"da_cd", "da_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DA_R.create("DA1");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DA_R ref = mcframe.serverMA.dbc.MAM_DA_R.create("DA1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.da_cd.eq(ref.da_cd));
					return cond;
				}
			)
		);
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
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dpt_cd.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE2,
				new String[][]{
						{"add_dpt_cd1", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE2");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.add_dpt_cd1.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE3,
				new String[][]{
						{"add_dpt_cd2", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE3");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.add_dpt_cd2.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE4,
				new String[][]{
						{"add_dpt_cd3", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE4");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE4");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.add_dpt_cd3.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE5,
				new String[][]{
						{"add_dpt_cd4", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE5");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE5");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.add_dpt_cd4.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE6,
				new String[][]{
						{"add_dpt_cd5", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE6");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE6");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.add_dpt_cd5.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE7,
				new String[][]{
						{"add_dpt_cd6", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE7");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE7");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.add_dpt_cd6.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE8,
				new String[][]{
						{"add_dpt_cd7", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE8");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE8");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.add_dpt_cd7.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE9,
				new String[][]{
						{"add_dpt_cd8", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE9");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE9");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.add_dpt_cd8.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE10,
				new String[][]{
						{"add_dpt_cd9", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE10");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE10");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.add_dpt_cd9.eq(ref.dpt_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE1,
				new String[][]{
						{"aprv_role_cd", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE1");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.aprv_role_cd.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE3,
				new String[][]{
						{"aprv_role_cd1", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE3");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.aprv_role_cd1.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE4,
				new String[][]{
						{"aprv_role_cd2", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE4");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE4");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.aprv_role_cd2.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE5,
				new String[][]{
						{"aprv_role_cd3", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE5");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE5");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.aprv_role_cd3.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE6,
				new String[][]{
						{"aprv_role_cd4", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE6");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE6");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.aprv_role_cd4.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE7,
				new String[][]{
						{"aprv_role_cd5", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE7");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE7");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.aprv_role_cd5.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE8,
				new String[][]{
						{"aprv_role_cd6", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE8");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE8");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.aprv_role_cd6.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE9,
				new String[][]{
						{"aprv_role_cd7", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE9");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE9");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.aprv_role_cd7.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE10,
				new String[][]{
						{"aprv_role_cd8", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE10");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE10");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.aprv_role_cd8.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE11,
				new String[][]{
						{"aprv_role_cd9", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE11");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE11");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.aprv_role_cd9.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE2,
				new String[][]{
						{"sub_aprv_role_cd", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE2");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sub_aprv_role_cd.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE12,
				new String[][]{
						{"sub_aprv_role_cd1", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE12");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE12");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sub_aprv_role_cd1.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE13,
				new String[][]{
						{"sub_aprv_role_cd2", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE13");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE13");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sub_aprv_role_cd2.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE14,
				new String[][]{
						{"sub_aprv_role_cd3", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE14");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE14");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sub_aprv_role_cd3.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE15,
				new String[][]{
						{"sub_aprv_role_cd4", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE15");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE15");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sub_aprv_role_cd4.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE16,
				new String[][]{
						{"sub_aprv_role_cd5", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE16");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE16");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sub_aprv_role_cd5.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE17,
				new String[][]{
						{"sub_aprv_role_cd6", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE17");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE17");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sub_aprv_role_cd6.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE18,
				new String[][]{
						{"sub_aprv_role_cd7", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE18");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE18");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sub_aprv_role_cd7.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE19,
				new String[][]{
						{"sub_aprv_role_cd8", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE19");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE19");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sub_aprv_role_cd8.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE20,
				new String[][]{
						{"sub_aprv_role_cd9", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE20");
				},
				(alias) -> {
					MAM_USR_ACL_R own = MAM_USR_ACL_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE20");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sub_aprv_role_cd9.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_USR_ACL_R> constMetas = new ConstMetaList<MAM_USR_ACL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			usr_cd_META,
			st_dt_META,
			end_dt_META,
			da_cd_META,
			pre_cl_usr_flg_META,
			cl_usr_flg_META,
			dpt_cd_META,
			add_dpt_cd1_META,
			add_dpt_cd2_META,
			add_dpt_cd3_META,
			add_dpt_cd4_META,
			add_dpt_cd5_META,
			add_dpt_cd6_META,
			add_dpt_cd7_META,
			add_dpt_cd8_META,
			add_dpt_cd9_META,
			aprv_role_cd_META,
			aprv_role_cd1_META,
			aprv_role_cd2_META,
			aprv_role_cd3_META,
			aprv_role_cd4_META,
			aprv_role_cd5_META,
			aprv_role_cd6_META,
			aprv_role_cd7_META,
			aprv_role_cd8_META,
			aprv_role_cd9_META,
			sub_aprv_role_cd_META,
			sub_aprv_role_cd1_META,
			sub_aprv_role_cd2_META,
			sub_aprv_role_cd3_META,
			sub_aprv_role_cd4_META,
			sub_aprv_role_cd5_META,
			sub_aprv_role_cd6_META,
			sub_aprv_role_cd7_META,
			sub_aprv_role_cd8_META,
			sub_aprv_role_cd9_META,
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
			usr_nm_META,
			da_nm_META,
			dpt_nm_META,
			add_dpt_nm1_META,
			add_dpt_nm2_META,
			add_dpt_nm3_META,
			add_dpt_nm4_META,
			add_dpt_nm5_META,
			add_dpt_nm6_META,
			add_dpt_nm7_META,
			add_dpt_nm8_META,
			add_dpt_nm9_META,
			aprv_role_nm_META,
			aprv_role_nm1_META,
			aprv_role_nm2_META,
			aprv_role_nm3_META,
			aprv_role_nm4_META,
			aprv_role_nm5_META,
			aprv_role_nm6_META,
			aprv_role_nm7_META,
			aprv_role_nm8_META,
			aprv_role_nm9_META,
			sub_aprv_role_nm_META,
			sub_aprv_role_nm1_META,
			sub_aprv_role_nm2_META,
			sub_aprv_role_nm3_META,
			sub_aprv_role_nm4_META,
			sub_aprv_role_nm5_META,
			sub_aprv_role_nm6_META,
			sub_aprv_role_nm7_META,
			sub_aprv_role_nm8_META,
			sub_aprv_role_nm9_META
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
	protected MAM_USR_ACL_R(ConstMetaList<? extends MAM_USR_ACL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_USR_ACL_R(ConstMetaList<? extends MAM_USR_ACL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$usr_cd,
				"usr_cd",
				usr_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_USR_ACL_R.$st_dt,
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
			MAM_USR_ACL_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_USR_ACL_R.$end_dt,
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
			MAM_USR_ACL_R.$da_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$da_cd,
				"da_cd",
				da_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$pre_cl_usr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_USR_ACL_R.$pre_cl_usr_flg,
				"pre_cl_usr_flg",
				pre_cl_usr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$cl_usr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_USR_ACL_R.$cl_usr_flg,
				"cl_usr_flg",
				cl_usr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$dpt_cd,
				"dpt_cd",
				dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_cd1,
				"add_dpt_cd1",
				add_dpt_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_cd2,
				"add_dpt_cd2",
				add_dpt_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_cd3,
				"add_dpt_cd3",
				add_dpt_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_cd4,
				"add_dpt_cd4",
				add_dpt_cd4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_cd5,
				"add_dpt_cd5",
				add_dpt_cd5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_cd6,
				"add_dpt_cd6",
				add_dpt_cd6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_cd7,
				"add_dpt_cd7",
				add_dpt_cd7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_cd8,
				"add_dpt_cd8",
				add_dpt_cd8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_cd9,
				"add_dpt_cd9",
				add_dpt_cd9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_cd,
				"aprv_role_cd",
				aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_cd1,
				"aprv_role_cd1",
				aprv_role_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_cd2,
				"aprv_role_cd2",
				aprv_role_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_cd3,
				"aprv_role_cd3",
				aprv_role_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_cd4,
				"aprv_role_cd4",
				aprv_role_cd4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_cd5,
				"aprv_role_cd5",
				aprv_role_cd5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_cd6,
				"aprv_role_cd6",
				aprv_role_cd6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_cd7,
				"aprv_role_cd7",
				aprv_role_cd7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_cd8,
				"aprv_role_cd8",
				aprv_role_cd8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_cd9,
				"aprv_role_cd9",
				aprv_role_cd9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_cd,
				"sub_aprv_role_cd",
				sub_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_cd1,
				"sub_aprv_role_cd1",
				sub_aprv_role_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_cd2,
				"sub_aprv_role_cd2",
				sub_aprv_role_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_cd3,
				"sub_aprv_role_cd3",
				sub_aprv_role_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_cd4,
				"sub_aprv_role_cd4",
				sub_aprv_role_cd4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_cd5,
				"sub_aprv_role_cd5",
				sub_aprv_role_cd5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_cd6,
				"sub_aprv_role_cd6",
				sub_aprv_role_cd6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_cd7,
				"sub_aprv_role_cd7",
				sub_aprv_role_cd7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_cd8,
				"sub_aprv_role_cd8",
				sub_aprv_role_cd8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_cd9,
				"sub_aprv_role_cd9",
				sub_aprv_role_cd9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$memo1,
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
			MAM_USR_ACL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$memo2,
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
			MAM_USR_ACL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$memo3,
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
			MAM_USR_ACL_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_USR_ACL_R.$del_flg,
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
			MAM_USR_ACL_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$del_usr_id,
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
			MAM_USR_ACL_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$del_usr_nm,
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
			MAM_USR_ACL_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_USR_ACL_R.$del_ts,
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
			MAM_USR_ACL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$ins_usr_id,
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
			MAM_USR_ACL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$ins_usr_nm,
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
			MAM_USR_ACL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_USR_ACL_R.$ins_ts,
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
			MAM_USR_ACL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$ins_func_id,
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
			MAM_USR_ACL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_USR_ACL_R.$upd_cntr,
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
			MAM_USR_ACL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$upd_usr_id,
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
			MAM_USR_ACL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$upd_usr_nm,
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
			MAM_USR_ACL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_USR_ACL_R.$upd_ts,
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
			MAM_USR_ACL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$upd_func_id,
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
			MAM_USR_ACL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$upd_srv_req_no,
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
			MAM_USR_ACL_R.$usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$usr_nm,
				"usr_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"USR1.USR_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$da_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$da_nm,
				"da_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"DA1.DA_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$dpt_nm,
				"dpt_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE1.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_nm1,
				"add_dpt_nm1",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE2.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_nm2,
				"add_dpt_nm2",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE3.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_nm3,
				"add_dpt_nm3",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE4.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_nm4,
				"add_dpt_nm4",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE5.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_nm5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_nm5,
				"add_dpt_nm5",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE6.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_nm6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_nm6,
				"add_dpt_nm6",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE7.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_nm7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_nm7,
				"add_dpt_nm7",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE8.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_nm8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_nm8,
				"add_dpt_nm8",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE9.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$add_dpt_nm9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$add_dpt_nm9,
				"add_dpt_nm9",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE10.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_nm,
				"aprv_role_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE1.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_nm1,
				"aprv_role_nm1",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE3.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_nm2,
				"aprv_role_nm2",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE4.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_nm3,
				"aprv_role_nm3",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE5.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_nm4,
				"aprv_role_nm4",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE6.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_nm5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_nm5,
				"aprv_role_nm5",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE7.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_nm6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_nm6,
				"aprv_role_nm6",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE8.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_nm7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_nm7,
				"aprv_role_nm7",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE9.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_nm8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_nm8,
				"aprv_role_nm8",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE10.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$aprv_role_nm9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$aprv_role_nm9,
				"aprv_role_nm9",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE11.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_nm,
				"sub_aprv_role_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE2.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_nm1,
				"sub_aprv_role_nm1",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE12.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_nm2,
				"sub_aprv_role_nm2",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE13.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_nm3,
				"sub_aprv_role_nm3",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE14.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_nm4,
				"sub_aprv_role_nm4",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE15.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_nm5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_nm5,
				"sub_aprv_role_nm5",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE16.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_nm6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_nm6,
				"sub_aprv_role_nm6",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE17.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_nm7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_nm7,
				"sub_aprv_role_nm7",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE18.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_nm8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_nm8,
				"sub_aprv_role_nm8",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE19.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_USR_ACL_R.$sub_aprv_role_nm9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_USR_ACL_R.$sub_aprv_role_nm9,
				"sub_aprv_role_nm9",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE20.APRV_ROLE_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_USR_ACL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_USR_ACL_R create(String alias) {
		MAM_USR_ACL_R row = new MAM_USR_ACL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_USR_ACL_R createByName(T proto) {
		MAM_USR_ACL_R row = MAM_USR_ACL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_USR_ACL_R clone() {
		return (MAM_USR_ACL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_USR_ACL_R createInstance() {
		return (MAM_USR_ACL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_USR_ACL_R getValues(String... names) {
		return (MAM_USR_ACL_R) super.getValues(names);
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
	 public MAW_USR_ACL_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_USR_ACL_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_USR_ACL_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_USR_ACL_KEY_R.TABLE_NAME);
	 }

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 0, $usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 0, $usr_cd, value);
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
	 * データアクセスＣＤ. Data access cd..<p>
	 *
	 */
	public String da_cd() {
		return getConstString(offset + 3, $da_cd);
	}

	/**
	 * データアクセスＣＤ. Data access cd..<p>
	 *
	 */
	public void da_cd(String value) {
		setConstString(offset + 3, $da_cd, value);
	}

	/**
	 * 仮締訂正可能ＦＬＧ. Allow data correction after temporary closing flg..<p>
	 *
	 */
	public boolean pre_cl_usr_flg() {
		return getConstBoolean(offset + 4, $pre_cl_usr_flg);
	}

	/**
	 * 仮締訂正可能ＦＬＧ. Allow data correction after temporary closing flg..<p>
	 *
	 */
	public void pre_cl_usr_flg(boolean value) {
		setConstBoolean(offset + 4, $pre_cl_usr_flg, value);
	}

	/**
	 * 本締訂正可能ＦＬＧ. Allow data correction after final closing flg..<p>
	 *
	 */
	public boolean cl_usr_flg() {
		return getConstBoolean(offset + 5, $cl_usr_flg);
	}

	/**
	 * 本締訂正可能ＦＬＧ. Allow data correction after final closing flg..<p>
	 *
	 */
	public void cl_usr_flg(boolean value) {
		setConstBoolean(offset + 5, $cl_usr_flg, value);
	}

	/**
	 * 主部門ＣＤ. Main dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 6, $dpt_cd);
	}

	/**
	 * 主部門ＣＤ. Main dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 6, $dpt_cd, value);
	}

	/**
	 * 兼務部門ＣＤ１. Concurrent dept. cd.1.<p>
	 *
	 */
	public String add_dpt_cd1() {
		return getConstString(offset + 7, $add_dpt_cd1);
	}

	/**
	 * 兼務部門ＣＤ１. Concurrent dept. cd.1.<p>
	 *
	 */
	public void add_dpt_cd1(String value) {
		setConstString(offset + 7, $add_dpt_cd1, value);
	}

	/**
	 * 兼務部門ＣＤ２. Concurrent dept. cd.2.<p>
	 *
	 */
	public String add_dpt_cd2() {
		return getConstString(offset + 8, $add_dpt_cd2);
	}

	/**
	 * 兼務部門ＣＤ２. Concurrent dept. cd.2.<p>
	 *
	 */
	public void add_dpt_cd2(String value) {
		setConstString(offset + 8, $add_dpt_cd2, value);
	}

	/**
	 * 兼務部門ＣＤ３. Concurrent dept. cd.3.<p>
	 *
	 */
	public String add_dpt_cd3() {
		return getConstString(offset + 9, $add_dpt_cd3);
	}

	/**
	 * 兼務部門ＣＤ３. Concurrent dept. cd.3.<p>
	 *
	 */
	public void add_dpt_cd3(String value) {
		setConstString(offset + 9, $add_dpt_cd3, value);
	}

	/**
	 * 兼務部門ＣＤ４. Concurrent dept. cd.4.<p>
	 *
	 */
	public String add_dpt_cd4() {
		return getConstString(offset + 10, $add_dpt_cd4);
	}

	/**
	 * 兼務部門ＣＤ４. Concurrent dept. cd.4.<p>
	 *
	 */
	public void add_dpt_cd4(String value) {
		setConstString(offset + 10, $add_dpt_cd4, value);
	}

	/**
	 * 兼務部門ＣＤ５. Concurrent dept. cd.5.<p>
	 *
	 */
	public String add_dpt_cd5() {
		return getConstString(offset + 11, $add_dpt_cd5);
	}

	/**
	 * 兼務部門ＣＤ５. Concurrent dept. cd.5.<p>
	 *
	 */
	public void add_dpt_cd5(String value) {
		setConstString(offset + 11, $add_dpt_cd5, value);
	}

	/**
	 * 兼務部門ＣＤ６. Concurrent dept. cd.6.<p>
	 *
	 */
	public String add_dpt_cd6() {
		return getConstString(offset + 12, $add_dpt_cd6);
	}

	/**
	 * 兼務部門ＣＤ６. Concurrent dept. cd.6.<p>
	 *
	 */
	public void add_dpt_cd6(String value) {
		setConstString(offset + 12, $add_dpt_cd6, value);
	}

	/**
	 * 兼務部門ＣＤ７. Concurrent dept. cd.7.<p>
	 *
	 */
	public String add_dpt_cd7() {
		return getConstString(offset + 13, $add_dpt_cd7);
	}

	/**
	 * 兼務部門ＣＤ７. Concurrent dept. cd.7.<p>
	 *
	 */
	public void add_dpt_cd7(String value) {
		setConstString(offset + 13, $add_dpt_cd7, value);
	}

	/**
	 * 兼務部門ＣＤ８. Concurrent dept. cd.8.<p>
	 *
	 */
	public String add_dpt_cd8() {
		return getConstString(offset + 14, $add_dpt_cd8);
	}

	/**
	 * 兼務部門ＣＤ８. Concurrent dept. cd.8.<p>
	 *
	 */
	public void add_dpt_cd8(String value) {
		setConstString(offset + 14, $add_dpt_cd8, value);
	}

	/**
	 * 兼務部門ＣＤ９. Concurrent dept. cd.9.<p>
	 *
	 */
	public String add_dpt_cd9() {
		return getConstString(offset + 15, $add_dpt_cd9);
	}

	/**
	 * 兼務部門ＣＤ９. Concurrent dept. cd.9.<p>
	 *
	 */
	public void add_dpt_cd9(String value) {
		setConstString(offset + 15, $add_dpt_cd9, value);
	}

	/**
	 * 承認役割ＣＤ（主）. Approval role cd. (Main).<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 16, $aprv_role_cd);
	}

	/**
	 * 承認役割ＣＤ（主）. Approval role cd. (Main).<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 16, $aprv_role_cd, value);
	}

	/**
	 * 承認役割ＣＤ１（主）. Approval role cd. 1 (Main).<p>
	 *
	 */
	public String aprv_role_cd1() {
		return getConstString(offset + 17, $aprv_role_cd1);
	}

	/**
	 * 承認役割ＣＤ１（主）. Approval role cd. 1 (Main).<p>
	 *
	 */
	public void aprv_role_cd1(String value) {
		setConstString(offset + 17, $aprv_role_cd1, value);
	}

	/**
	 * 承認役割ＣＤ２（主）. Approval role cd. 2 (Main).<p>
	 *
	 */
	public String aprv_role_cd2() {
		return getConstString(offset + 18, $aprv_role_cd2);
	}

	/**
	 * 承認役割ＣＤ２（主）. Approval role cd. 2 (Main).<p>
	 *
	 */
	public void aprv_role_cd2(String value) {
		setConstString(offset + 18, $aprv_role_cd2, value);
	}

	/**
	 * 承認役割ＣＤ３（主）. Approval role cd. 3 (Main).<p>
	 *
	 */
	public String aprv_role_cd3() {
		return getConstString(offset + 19, $aprv_role_cd3);
	}

	/**
	 * 承認役割ＣＤ３（主）. Approval role cd. 3 (Main).<p>
	 *
	 */
	public void aprv_role_cd3(String value) {
		setConstString(offset + 19, $aprv_role_cd3, value);
	}

	/**
	 * 承認役割ＣＤ４（主）. Approval role cd. 4 (Main).<p>
	 *
	 */
	public String aprv_role_cd4() {
		return getConstString(offset + 20, $aprv_role_cd4);
	}

	/**
	 * 承認役割ＣＤ４（主）. Approval role cd. 4 (Main).<p>
	 *
	 */
	public void aprv_role_cd4(String value) {
		setConstString(offset + 20, $aprv_role_cd4, value);
	}

	/**
	 * 承認役割ＣＤ５（主）. Approval role cd. 5 (Main).<p>
	 *
	 */
	public String aprv_role_cd5() {
		return getConstString(offset + 21, $aprv_role_cd5);
	}

	/**
	 * 承認役割ＣＤ５（主）. Approval role cd. 5 (Main).<p>
	 *
	 */
	public void aprv_role_cd5(String value) {
		setConstString(offset + 21, $aprv_role_cd5, value);
	}

	/**
	 * 承認役割ＣＤ６（主）. Approval role cd. 6 (Main).<p>
	 *
	 */
	public String aprv_role_cd6() {
		return getConstString(offset + 22, $aprv_role_cd6);
	}

	/**
	 * 承認役割ＣＤ６（主）. Approval role cd. 6 (Main).<p>
	 *
	 */
	public void aprv_role_cd6(String value) {
		setConstString(offset + 22, $aprv_role_cd6, value);
	}

	/**
	 * 承認役割ＣＤ７（主）. Approval role cd. 7 (Main).<p>
	 *
	 */
	public String aprv_role_cd7() {
		return getConstString(offset + 23, $aprv_role_cd7);
	}

	/**
	 * 承認役割ＣＤ７（主）. Approval role cd. 7 (Main).<p>
	 *
	 */
	public void aprv_role_cd7(String value) {
		setConstString(offset + 23, $aprv_role_cd7, value);
	}

	/**
	 * 承認役割ＣＤ８（主）. Approval role cd. 8 (Main).<p>
	 *
	 */
	public String aprv_role_cd8() {
		return getConstString(offset + 24, $aprv_role_cd8);
	}

	/**
	 * 承認役割ＣＤ８（主）. Approval role cd. 8 (Main).<p>
	 *
	 */
	public void aprv_role_cd8(String value) {
		setConstString(offset + 24, $aprv_role_cd8, value);
	}

	/**
	 * 承認役割ＣＤ９（主）. Approval role cd. 9 (Main).<p>
	 *
	 */
	public String aprv_role_cd9() {
		return getConstString(offset + 25, $aprv_role_cd9);
	}

	/**
	 * 承認役割ＣＤ９（主）. Approval role cd. 9 (Main).<p>
	 *
	 */
	public void aprv_role_cd9(String value) {
		setConstString(offset + 25, $aprv_role_cd9, value);
	}

	/**
	 * 承認役割ＣＤ（副）. Approval role cd. (Sub).<p>
	 *
	 */
	public String sub_aprv_role_cd() {
		return getConstString(offset + 26, $sub_aprv_role_cd);
	}

	/**
	 * 承認役割ＣＤ（副）. Approval role cd. (Sub).<p>
	 *
	 */
	public void sub_aprv_role_cd(String value) {
		setConstString(offset + 26, $sub_aprv_role_cd, value);
	}

	/**
	 * 承認役割ＣＤ１（副）. Approval role cd. 1 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_cd1() {
		return getConstString(offset + 27, $sub_aprv_role_cd1);
	}

	/**
	 * 承認役割ＣＤ１（副）. Approval role cd. 1 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_cd1(String value) {
		setConstString(offset + 27, $sub_aprv_role_cd1, value);
	}

	/**
	 * 承認役割ＣＤ２（副）. Approval role cd. 2 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_cd2() {
		return getConstString(offset + 28, $sub_aprv_role_cd2);
	}

	/**
	 * 承認役割ＣＤ２（副）. Approval role cd. 2 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_cd2(String value) {
		setConstString(offset + 28, $sub_aprv_role_cd2, value);
	}

	/**
	 * 承認役割ＣＤ３（副）. Approval role cd. 3 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_cd3() {
		return getConstString(offset + 29, $sub_aprv_role_cd3);
	}

	/**
	 * 承認役割ＣＤ３（副）. Approval role cd. 3 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_cd3(String value) {
		setConstString(offset + 29, $sub_aprv_role_cd3, value);
	}

	/**
	 * 承認役割ＣＤ４（副）. Approval role cd. 4 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_cd4() {
		return getConstString(offset + 30, $sub_aprv_role_cd4);
	}

	/**
	 * 承認役割ＣＤ４（副）. Approval role cd. 4 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_cd4(String value) {
		setConstString(offset + 30, $sub_aprv_role_cd4, value);
	}

	/**
	 * 承認役割ＣＤ５（副）. Approval role cd. 5 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_cd5() {
		return getConstString(offset + 31, $sub_aprv_role_cd5);
	}

	/**
	 * 承認役割ＣＤ５（副）. Approval role cd. 5 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_cd5(String value) {
		setConstString(offset + 31, $sub_aprv_role_cd5, value);
	}

	/**
	 * 承認役割ＣＤ６（副）. Approval role cd. 6 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_cd6() {
		return getConstString(offset + 32, $sub_aprv_role_cd6);
	}

	/**
	 * 承認役割ＣＤ６（副）. Approval role cd. 6 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_cd6(String value) {
		setConstString(offset + 32, $sub_aprv_role_cd6, value);
	}

	/**
	 * 承認役割ＣＤ７（副）. Approval role cd. 7 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_cd7() {
		return getConstString(offset + 33, $sub_aprv_role_cd7);
	}

	/**
	 * 承認役割ＣＤ７（副）. Approval role cd. 7 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_cd7(String value) {
		setConstString(offset + 33, $sub_aprv_role_cd7, value);
	}

	/**
	 * 承認役割ＣＤ８（副）. Approval role cd. 8 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_cd8() {
		return getConstString(offset + 34, $sub_aprv_role_cd8);
	}

	/**
	 * 承認役割ＣＤ８（副）. Approval role cd. 8 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_cd8(String value) {
		setConstString(offset + 34, $sub_aprv_role_cd8, value);
	}

	/**
	 * 承認役割ＣＤ９（副）. Approval role cd. 9 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_cd9() {
		return getConstString(offset + 35, $sub_aprv_role_cd9);
	}

	/**
	 * 承認役割ＣＤ９（副）. Approval role cd. 9 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_cd9(String value) {
		setConstString(offset + 35, $sub_aprv_role_cd9, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 36, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 36, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 37, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 37, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 38, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 38, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 39, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 39, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 40, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 40, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 41, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 41, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 42, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 42, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 43, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 43, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 44, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 44, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 45, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 46, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 46, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 47, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 48, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 48, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 49, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 49, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 50, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 51, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 51, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 52, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 52, $upd_srv_req_no, value);
	}

	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 53, $usr_nm);
	}

	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 53, $usr_nm, value);
	}

	/**
	 * データアクセス名. Data access name.<p>
	 *
	 */
	public String da_nm() {
		return getConstString(offset + 54, $da_nm);
	}

	/**
	 * データアクセス名. Data access name.<p>
	 *
	 */
	public void da_nm(String value) {
		setConstString(offset + 54, $da_nm, value);
	}

	/**
	 * 主部門名. Main dept. name.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 55, $dpt_nm);
	}

	/**
	 * 主部門名. Main dept. name.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 55, $dpt_nm, value);
	}

	/**
	 * 兼務部門名１. Concurrent dept. name 1.<p>
	 *
	 */
	public String add_dpt_nm1() {
		return getConstString(offset + 56, $add_dpt_nm1);
	}

	/**
	 * 兼務部門名１. Concurrent dept. name 1.<p>
	 *
	 */
	public void add_dpt_nm1(String value) {
		setConstString(offset + 56, $add_dpt_nm1, value);
	}

	/**
	 * 兼務部門名２. Concurrent dept. name 2.<p>
	 *
	 */
	public String add_dpt_nm2() {
		return getConstString(offset + 57, $add_dpt_nm2);
	}

	/**
	 * 兼務部門名２. Concurrent dept. name 2.<p>
	 *
	 */
	public void add_dpt_nm2(String value) {
		setConstString(offset + 57, $add_dpt_nm2, value);
	}

	/**
	 * 兼務部門名３. Concurrent dept. name 3.<p>
	 *
	 */
	public String add_dpt_nm3() {
		return getConstString(offset + 58, $add_dpt_nm3);
	}

	/**
	 * 兼務部門名３. Concurrent dept. name 3.<p>
	 *
	 */
	public void add_dpt_nm3(String value) {
		setConstString(offset + 58, $add_dpt_nm3, value);
	}

	/**
	 * 兼務部門名４. Concurrent dept. name 4.<p>
	 *
	 */
	public String add_dpt_nm4() {
		return getConstString(offset + 59, $add_dpt_nm4);
	}

	/**
	 * 兼務部門名４. Concurrent dept. name 4.<p>
	 *
	 */
	public void add_dpt_nm4(String value) {
		setConstString(offset + 59, $add_dpt_nm4, value);
	}

	/**
	 * 兼務部門名５. Concurrent dept. name 5.<p>
	 *
	 */
	public String add_dpt_nm5() {
		return getConstString(offset + 60, $add_dpt_nm5);
	}

	/**
	 * 兼務部門名５. Concurrent dept. name 5.<p>
	 *
	 */
	public void add_dpt_nm5(String value) {
		setConstString(offset + 60, $add_dpt_nm5, value);
	}

	/**
	 * 兼務部門名６. Concurrent dept. name 6.<p>
	 *
	 */
	public String add_dpt_nm6() {
		return getConstString(offset + 61, $add_dpt_nm6);
	}

	/**
	 * 兼務部門名６. Concurrent dept. name 6.<p>
	 *
	 */
	public void add_dpt_nm6(String value) {
		setConstString(offset + 61, $add_dpt_nm6, value);
	}

	/**
	 * 兼務部門名７. Concurrent dept. name 7.<p>
	 *
	 */
	public String add_dpt_nm7() {
		return getConstString(offset + 62, $add_dpt_nm7);
	}

	/**
	 * 兼務部門名７. Concurrent dept. name 7.<p>
	 *
	 */
	public void add_dpt_nm7(String value) {
		setConstString(offset + 62, $add_dpt_nm7, value);
	}

	/**
	 * 兼務部門名８. Concurrent dept. name 8.<p>
	 *
	 */
	public String add_dpt_nm8() {
		return getConstString(offset + 63, $add_dpt_nm8);
	}

	/**
	 * 兼務部門名８. Concurrent dept. name 8.<p>
	 *
	 */
	public void add_dpt_nm8(String value) {
		setConstString(offset + 63, $add_dpt_nm8, value);
	}

	/**
	 * 兼務部門名９. Concurrent dept. name 9.<p>
	 *
	 */
	public String add_dpt_nm9() {
		return getConstString(offset + 64, $add_dpt_nm9);
	}

	/**
	 * 兼務部門名９. Concurrent dept. name 9.<p>
	 *
	 */
	public void add_dpt_nm9(String value) {
		setConstString(offset + 64, $add_dpt_nm9, value);
	}

	/**
	 * 承認役割名（主）. Approval role name (Main).<p>
	 *
	 */
	public String aprv_role_nm() {
		return getConstString(offset + 65, $aprv_role_nm);
	}

	/**
	 * 承認役割名（主）. Approval role name (Main).<p>
	 *
	 */
	public void aprv_role_nm(String value) {
		setConstString(offset + 65, $aprv_role_nm, value);
	}

	/**
	 * 承認役割名１（主）. Approval role name 1 (Main).<p>
	 *
	 */
	public String aprv_role_nm1() {
		return getConstString(offset + 66, $aprv_role_nm1);
	}

	/**
	 * 承認役割名１（主）. Approval role name 1 (Main).<p>
	 *
	 */
	public void aprv_role_nm1(String value) {
		setConstString(offset + 66, $aprv_role_nm1, value);
	}

	/**
	 * 承認役割名２（主）. Approval role name 2 (Main).<p>
	 *
	 */
	public String aprv_role_nm2() {
		return getConstString(offset + 67, $aprv_role_nm2);
	}

	/**
	 * 承認役割名２（主）. Approval role name 2 (Main).<p>
	 *
	 */
	public void aprv_role_nm2(String value) {
		setConstString(offset + 67, $aprv_role_nm2, value);
	}

	/**
	 * 承認役割名３（主）. Approval role name 3 (Main).<p>
	 *
	 */
	public String aprv_role_nm3() {
		return getConstString(offset + 68, $aprv_role_nm3);
	}

	/**
	 * 承認役割名３（主）. Approval role name 3 (Main).<p>
	 *
	 */
	public void aprv_role_nm3(String value) {
		setConstString(offset + 68, $aprv_role_nm3, value);
	}

	/**
	 * 承認役割名４（主）. Approval role name 4 (Main).<p>
	 *
	 */
	public String aprv_role_nm4() {
		return getConstString(offset + 69, $aprv_role_nm4);
	}

	/**
	 * 承認役割名４（主）. Approval role name 4 (Main).<p>
	 *
	 */
	public void aprv_role_nm4(String value) {
		setConstString(offset + 69, $aprv_role_nm4, value);
	}

	/**
	 * 承認役割名５（主）. Approval role name 5 (Main).<p>
	 *
	 */
	public String aprv_role_nm5() {
		return getConstString(offset + 70, $aprv_role_nm5);
	}

	/**
	 * 承認役割名５（主）. Approval role name 5 (Main).<p>
	 *
	 */
	public void aprv_role_nm5(String value) {
		setConstString(offset + 70, $aprv_role_nm5, value);
	}

	/**
	 * 承認役割名６（主）. Approval role name 6 (Main).<p>
	 *
	 */
	public String aprv_role_nm6() {
		return getConstString(offset + 71, $aprv_role_nm6);
	}

	/**
	 * 承認役割名６（主）. Approval role name 6 (Main).<p>
	 *
	 */
	public void aprv_role_nm6(String value) {
		setConstString(offset + 71, $aprv_role_nm6, value);
	}

	/**
	 * 承認役割名７（主）. Approval role name 7 (Main).<p>
	 *
	 */
	public String aprv_role_nm7() {
		return getConstString(offset + 72, $aprv_role_nm7);
	}

	/**
	 * 承認役割名７（主）. Approval role name 7 (Main).<p>
	 *
	 */
	public void aprv_role_nm7(String value) {
		setConstString(offset + 72, $aprv_role_nm7, value);
	}

	/**
	 * 承認役割名８（主）. Approval role name 8 (Main).<p>
	 *
	 */
	public String aprv_role_nm8() {
		return getConstString(offset + 73, $aprv_role_nm8);
	}

	/**
	 * 承認役割名８（主）. Approval role name 8 (Main).<p>
	 *
	 */
	public void aprv_role_nm8(String value) {
		setConstString(offset + 73, $aprv_role_nm8, value);
	}

	/**
	 * 承認役割名９（主）. Approval role name 9 (Main).<p>
	 *
	 */
	public String aprv_role_nm9() {
		return getConstString(offset + 74, $aprv_role_nm9);
	}

	/**
	 * 承認役割名９（主）. Approval role name 9 (Main).<p>
	 *
	 */
	public void aprv_role_nm9(String value) {
		setConstString(offset + 74, $aprv_role_nm9, value);
	}

	/**
	 * 承認役割名（副）. Approval role name (Sub).<p>
	 *
	 */
	public String sub_aprv_role_nm() {
		return getConstString(offset + 75, $sub_aprv_role_nm);
	}

	/**
	 * 承認役割名（副）. Approval role name (Sub).<p>
	 *
	 */
	public void sub_aprv_role_nm(String value) {
		setConstString(offset + 75, $sub_aprv_role_nm, value);
	}

	/**
	 * 承認役割名１（副）. Approval role name 1 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_nm1() {
		return getConstString(offset + 76, $sub_aprv_role_nm1);
	}

	/**
	 * 承認役割名１（副）. Approval role name 1 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_nm1(String value) {
		setConstString(offset + 76, $sub_aprv_role_nm1, value);
	}

	/**
	 * 承認役割名２（副）. Approval role name 2 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_nm2() {
		return getConstString(offset + 77, $sub_aprv_role_nm2);
	}

	/**
	 * 承認役割名２（副）. Approval role name 2 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_nm2(String value) {
		setConstString(offset + 77, $sub_aprv_role_nm2, value);
	}

	/**
	 * 承認役割名３（副）. Approval role name 3 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_nm3() {
		return getConstString(offset + 78, $sub_aprv_role_nm3);
	}

	/**
	 * 承認役割名３（副）. Approval role name 3 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_nm3(String value) {
		setConstString(offset + 78, $sub_aprv_role_nm3, value);
	}

	/**
	 * 承認役割名４（副）. Approval role name 4 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_nm4() {
		return getConstString(offset + 79, $sub_aprv_role_nm4);
	}

	/**
	 * 承認役割名４（副）. Approval role name 4 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_nm4(String value) {
		setConstString(offset + 79, $sub_aprv_role_nm4, value);
	}

	/**
	 * 承認役割名５（副）. Approval role name 5 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_nm5() {
		return getConstString(offset + 80, $sub_aprv_role_nm5);
	}

	/**
	 * 承認役割名５（副）. Approval role name 5 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_nm5(String value) {
		setConstString(offset + 80, $sub_aprv_role_nm5, value);
	}

	/**
	 * 承認役割名６（副）. Approval role name 6 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_nm6() {
		return getConstString(offset + 81, $sub_aprv_role_nm6);
	}

	/**
	 * 承認役割名６（副）. Approval role name 6 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_nm6(String value) {
		setConstString(offset + 81, $sub_aprv_role_nm6, value);
	}

	/**
	 * 承認役割名７（副）. Approval role name 7 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_nm7() {
		return getConstString(offset + 82, $sub_aprv_role_nm7);
	}

	/**
	 * 承認役割名７（副）. Approval role name 7 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_nm7(String value) {
		setConstString(offset + 82, $sub_aprv_role_nm7, value);
	}

	/**
	 * 承認役割名８（副）. Approval role name 8 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_nm8() {
		return getConstString(offset + 83, $sub_aprv_role_nm8);
	}

	/**
	 * 承認役割名８（副）. Approval role name 8 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_nm8(String value) {
		setConstString(offset + 83, $sub_aprv_role_nm8, value);
	}

	/**
	 * 承認役割名９（副）. Approval role name 9 (Sub).<p>
	 *
	 */
	public String sub_aprv_role_nm9() {
		return getConstString(offset + 84, $sub_aprv_role_nm9);
	}

	/**
	 * 承認役割名９（副）. Approval role name 9 (Sub).<p>
	 *
	 */
	public void sub_aprv_role_nm9(String value) {
		setConstString(offset + 84, $sub_aprv_role_nm9, value);
	}

	public String getString(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			return add_dpt_cd1();
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			return add_dpt_cd2();
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			return add_dpt_cd3();
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			return add_dpt_cd4();
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			return add_dpt_cd5();
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			return add_dpt_cd6();
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			return add_dpt_cd7();
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			return add_dpt_cd8();
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			return add_dpt_cd9();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			return aprv_role_cd1();
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			return aprv_role_cd2();
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			return aprv_role_cd3();
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			return aprv_role_cd4();
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			return aprv_role_cd5();
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			return aprv_role_cd6();
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			return aprv_role_cd7();
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			return aprv_role_cd8();
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			return aprv_role_cd9();
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd();
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd1();
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd2();
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd3();
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd4();
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd5();
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd6();
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd7();
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd8();
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd9();
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
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			return da_nm();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			return add_dpt_nm1();
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			return add_dpt_nm2();
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			return add_dpt_nm3();
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			return add_dpt_nm4();
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			return add_dpt_nm5();
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			return add_dpt_nm6();
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			return add_dpt_nm7();
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			return add_dpt_nm8();
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			return add_dpt_nm9();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($aprv_role_nm1.equalsIgnoreCase(name)) {
			return aprv_role_nm1();
		}
		if ($aprv_role_nm2.equalsIgnoreCase(name)) {
			return aprv_role_nm2();
		}
		if ($aprv_role_nm3.equalsIgnoreCase(name)) {
			return aprv_role_nm3();
		}
		if ($aprv_role_nm4.equalsIgnoreCase(name)) {
			return aprv_role_nm4();
		}
		if ($aprv_role_nm5.equalsIgnoreCase(name)) {
			return aprv_role_nm5();
		}
		if ($aprv_role_nm6.equalsIgnoreCase(name)) {
			return aprv_role_nm6();
		}
		if ($aprv_role_nm7.equalsIgnoreCase(name)) {
			return aprv_role_nm7();
		}
		if ($aprv_role_nm8.equalsIgnoreCase(name)) {
			return aprv_role_nm8();
		}
		if ($aprv_role_nm9.equalsIgnoreCase(name)) {
			return aprv_role_nm9();
		}
		if ($sub_aprv_role_nm.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm();
		}
		if ($sub_aprv_role_nm1.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm1();
		}
		if ($sub_aprv_role_nm2.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm2();
		}
		if ($sub_aprv_role_nm3.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm3();
		}
		if ($sub_aprv_role_nm4.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm4();
		}
		if ($sub_aprv_role_nm5.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm5();
		}
		if ($sub_aprv_role_nm6.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm6();
		}
		if ($sub_aprv_role_nm7.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm7();
		}
		if ($sub_aprv_role_nm8.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm8();
		}
		if ($sub_aprv_role_nm9.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm9();
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
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			return pre_cl_usr_flg();
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			return cl_usr_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			return add_dpt_cd1();
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			return add_dpt_cd2();
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			return add_dpt_cd3();
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			return add_dpt_cd4();
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			return add_dpt_cd5();
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			return add_dpt_cd6();
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			return add_dpt_cd7();
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			return add_dpt_cd8();
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			return add_dpt_cd9();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			return aprv_role_cd1();
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			return aprv_role_cd2();
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			return aprv_role_cd3();
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			return aprv_role_cd4();
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			return aprv_role_cd5();
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			return aprv_role_cd6();
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			return aprv_role_cd7();
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			return aprv_role_cd8();
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			return aprv_role_cd9();
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd();
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd1();
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd2();
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd3();
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd4();
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd5();
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd6();
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd7();
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd8();
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd9();
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
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			return da_nm();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			return add_dpt_nm1();
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			return add_dpt_nm2();
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			return add_dpt_nm3();
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			return add_dpt_nm4();
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			return add_dpt_nm5();
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			return add_dpt_nm6();
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			return add_dpt_nm7();
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			return add_dpt_nm8();
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			return add_dpt_nm9();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($aprv_role_nm1.equalsIgnoreCase(name)) {
			return aprv_role_nm1();
		}
		if ($aprv_role_nm2.equalsIgnoreCase(name)) {
			return aprv_role_nm2();
		}
		if ($aprv_role_nm3.equalsIgnoreCase(name)) {
			return aprv_role_nm3();
		}
		if ($aprv_role_nm4.equalsIgnoreCase(name)) {
			return aprv_role_nm4();
		}
		if ($aprv_role_nm5.equalsIgnoreCase(name)) {
			return aprv_role_nm5();
		}
		if ($aprv_role_nm6.equalsIgnoreCase(name)) {
			return aprv_role_nm6();
		}
		if ($aprv_role_nm7.equalsIgnoreCase(name)) {
			return aprv_role_nm7();
		}
		if ($aprv_role_nm8.equalsIgnoreCase(name)) {
			return aprv_role_nm8();
		}
		if ($aprv_role_nm9.equalsIgnoreCase(name)) {
			return aprv_role_nm9();
		}
		if ($sub_aprv_role_nm.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm();
		}
		if ($sub_aprv_role_nm1.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm1();
		}
		if ($sub_aprv_role_nm2.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm2();
		}
		if ($sub_aprv_role_nm3.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm3();
		}
		if ($sub_aprv_role_nm4.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm4();
		}
		if ($sub_aprv_role_nm5.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm5();
		}
		if ($sub_aprv_role_nm6.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm6();
		}
		if ($sub_aprv_role_nm7.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm7();
		}
		if ($sub_aprv_role_nm8.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm8();
		}
		if ($sub_aprv_role_nm9.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm9();
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
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			return pre_cl_usr_flg();
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			return cl_usr_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			add_dpt_cd1(value);
			return;
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			add_dpt_cd2(value);
			return;
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			add_dpt_cd3(value);
			return;
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			add_dpt_cd4(value);
			return;
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			add_dpt_cd5(value);
			return;
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			add_dpt_cd6(value);
			return;
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			add_dpt_cd7(value);
			return;
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			add_dpt_cd8(value);
			return;
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			add_dpt_cd9(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			aprv_role_cd1(value);
			return;
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			aprv_role_cd2(value);
			return;
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			aprv_role_cd3(value);
			return;
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			aprv_role_cd4(value);
			return;
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			aprv_role_cd5(value);
			return;
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			aprv_role_cd6(value);
			return;
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			aprv_role_cd7(value);
			return;
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			aprv_role_cd8(value);
			return;
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			aprv_role_cd9(value);
			return;
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			sub_aprv_role_cd(value);
			return;
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			sub_aprv_role_cd1(value);
			return;
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			sub_aprv_role_cd2(value);
			return;
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			sub_aprv_role_cd3(value);
			return;
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			sub_aprv_role_cd4(value);
			return;
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			sub_aprv_role_cd5(value);
			return;
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			sub_aprv_role_cd6(value);
			return;
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			sub_aprv_role_cd7(value);
			return;
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			sub_aprv_role_cd8(value);
			return;
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			sub_aprv_role_cd9(value);
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
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			da_nm(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			add_dpt_nm1(value);
			return;
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			add_dpt_nm2(value);
			return;
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			add_dpt_nm3(value);
			return;
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			add_dpt_nm4(value);
			return;
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			add_dpt_nm5(value);
			return;
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			add_dpt_nm6(value);
			return;
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			add_dpt_nm7(value);
			return;
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			add_dpt_nm8(value);
			return;
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			add_dpt_nm9(value);
			return;
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			aprv_role_nm(value);
			return;
		}
		if ($aprv_role_nm1.equalsIgnoreCase(name)) {
			aprv_role_nm1(value);
			return;
		}
		if ($aprv_role_nm2.equalsIgnoreCase(name)) {
			aprv_role_nm2(value);
			return;
		}
		if ($aprv_role_nm3.equalsIgnoreCase(name)) {
			aprv_role_nm3(value);
			return;
		}
		if ($aprv_role_nm4.equalsIgnoreCase(name)) {
			aprv_role_nm4(value);
			return;
		}
		if ($aprv_role_nm5.equalsIgnoreCase(name)) {
			aprv_role_nm5(value);
			return;
		}
		if ($aprv_role_nm6.equalsIgnoreCase(name)) {
			aprv_role_nm6(value);
			return;
		}
		if ($aprv_role_nm7.equalsIgnoreCase(name)) {
			aprv_role_nm7(value);
			return;
		}
		if ($aprv_role_nm8.equalsIgnoreCase(name)) {
			aprv_role_nm8(value);
			return;
		}
		if ($aprv_role_nm9.equalsIgnoreCase(name)) {
			aprv_role_nm9(value);
			return;
		}
		if ($sub_aprv_role_nm.equalsIgnoreCase(name)) {
			sub_aprv_role_nm(value);
			return;
		}
		if ($sub_aprv_role_nm1.equalsIgnoreCase(name)) {
			sub_aprv_role_nm1(value);
			return;
		}
		if ($sub_aprv_role_nm2.equalsIgnoreCase(name)) {
			sub_aprv_role_nm2(value);
			return;
		}
		if ($sub_aprv_role_nm3.equalsIgnoreCase(name)) {
			sub_aprv_role_nm3(value);
			return;
		}
		if ($sub_aprv_role_nm4.equalsIgnoreCase(name)) {
			sub_aprv_role_nm4(value);
			return;
		}
		if ($sub_aprv_role_nm5.equalsIgnoreCase(name)) {
			sub_aprv_role_nm5(value);
			return;
		}
		if ($sub_aprv_role_nm6.equalsIgnoreCase(name)) {
			sub_aprv_role_nm6(value);
			return;
		}
		if ($sub_aprv_role_nm7.equalsIgnoreCase(name)) {
			sub_aprv_role_nm7(value);
			return;
		}
		if ($sub_aprv_role_nm8.equalsIgnoreCase(name)) {
			sub_aprv_role_nm8(value);
			return;
		}
		if ($sub_aprv_role_nm9.equalsIgnoreCase(name)) {
			sub_aprv_role_nm9(value);
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
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			pre_cl_usr_flg(value);
			return;
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			cl_usr_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			add_dpt_cd1(value);
			return;
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			add_dpt_cd2(value);
			return;
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			add_dpt_cd3(value);
			return;
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			add_dpt_cd4(value);
			return;
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			add_dpt_cd5(value);
			return;
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			add_dpt_cd6(value);
			return;
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			add_dpt_cd7(value);
			return;
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			add_dpt_cd8(value);
			return;
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			add_dpt_cd9(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			aprv_role_cd1(value);
			return;
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			aprv_role_cd2(value);
			return;
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			aprv_role_cd3(value);
			return;
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			aprv_role_cd4(value);
			return;
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			aprv_role_cd5(value);
			return;
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			aprv_role_cd6(value);
			return;
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			aprv_role_cd7(value);
			return;
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			aprv_role_cd8(value);
			return;
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			aprv_role_cd9(value);
			return;
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			sub_aprv_role_cd(value);
			return;
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			sub_aprv_role_cd1(value);
			return;
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			sub_aprv_role_cd2(value);
			return;
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			sub_aprv_role_cd3(value);
			return;
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			sub_aprv_role_cd4(value);
			return;
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			sub_aprv_role_cd5(value);
			return;
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			sub_aprv_role_cd6(value);
			return;
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			sub_aprv_role_cd7(value);
			return;
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			sub_aprv_role_cd8(value);
			return;
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			sub_aprv_role_cd9(value);
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
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			da_nm(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			add_dpt_nm1(value);
			return;
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			add_dpt_nm2(value);
			return;
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			add_dpt_nm3(value);
			return;
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			add_dpt_nm4(value);
			return;
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			add_dpt_nm5(value);
			return;
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			add_dpt_nm6(value);
			return;
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			add_dpt_nm7(value);
			return;
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			add_dpt_nm8(value);
			return;
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			add_dpt_nm9(value);
			return;
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			aprv_role_nm(value);
			return;
		}
		if ($aprv_role_nm1.equalsIgnoreCase(name)) {
			aprv_role_nm1(value);
			return;
		}
		if ($aprv_role_nm2.equalsIgnoreCase(name)) {
			aprv_role_nm2(value);
			return;
		}
		if ($aprv_role_nm3.equalsIgnoreCase(name)) {
			aprv_role_nm3(value);
			return;
		}
		if ($aprv_role_nm4.equalsIgnoreCase(name)) {
			aprv_role_nm4(value);
			return;
		}
		if ($aprv_role_nm5.equalsIgnoreCase(name)) {
			aprv_role_nm5(value);
			return;
		}
		if ($aprv_role_nm6.equalsIgnoreCase(name)) {
			aprv_role_nm6(value);
			return;
		}
		if ($aprv_role_nm7.equalsIgnoreCase(name)) {
			aprv_role_nm7(value);
			return;
		}
		if ($aprv_role_nm8.equalsIgnoreCase(name)) {
			aprv_role_nm8(value);
			return;
		}
		if ($aprv_role_nm9.equalsIgnoreCase(name)) {
			aprv_role_nm9(value);
			return;
		}
		if ($sub_aprv_role_nm.equalsIgnoreCase(name)) {
			sub_aprv_role_nm(value);
			return;
		}
		if ($sub_aprv_role_nm1.equalsIgnoreCase(name)) {
			sub_aprv_role_nm1(value);
			return;
		}
		if ($sub_aprv_role_nm2.equalsIgnoreCase(name)) {
			sub_aprv_role_nm2(value);
			return;
		}
		if ($sub_aprv_role_nm3.equalsIgnoreCase(name)) {
			sub_aprv_role_nm3(value);
			return;
		}
		if ($sub_aprv_role_nm4.equalsIgnoreCase(name)) {
			sub_aprv_role_nm4(value);
			return;
		}
		if ($sub_aprv_role_nm5.equalsIgnoreCase(name)) {
			sub_aprv_role_nm5(value);
			return;
		}
		if ($sub_aprv_role_nm6.equalsIgnoreCase(name)) {
			sub_aprv_role_nm6(value);
			return;
		}
		if ($sub_aprv_role_nm7.equalsIgnoreCase(name)) {
			sub_aprv_role_nm7(value);
			return;
		}
		if ($sub_aprv_role_nm8.equalsIgnoreCase(name)) {
			sub_aprv_role_nm8(value);
			return;
		}
		if ($sub_aprv_role_nm9.equalsIgnoreCase(name)) {
			sub_aprv_role_nm9(value);
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
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			pre_cl_usr_flg(value);
			return;
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			cl_usr_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
