package mcframe.serverMB.dbc;

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
 * "取引先マスタ受信ＩＦ // BP master import IF"DBコンテナRowクラスです。<p>
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
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムＣＤ</td>
 *  	<td>External system cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_make_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
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
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
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
 *  	<td>bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先名</td>
 *  	<td>BP name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先別名１</td>
 *  	<td>BP alias name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先別名２</td>
 *  	<td>BP alias name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先別名３</td>
 *  	<td>BP alias name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先別名４</td>
 *  	<td>BP alias name 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>郵便番号</td>
 *  	<td>Zip code</td>
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
 *  	<td>addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所２</td>
 *  	<td>Address 2</td>
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
 *  	<td>addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所４</td>
 *  	<td>Address 4</td>
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
 *  	<td>fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＦＡＸ</td>
 *  	<td>FAX</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ein</td>
 *  	<td>C</td>
 *  	<td>13</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>法人番号</td>
 *  	<td>Corporation number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_co_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準企業コード</td>
 *  	<td>Standard company code</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>国ＣＤ</td>
 *  	<td>Country cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>area_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>地域ＣＤ</td>
 *  	<td>Region cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prnt_lcl_cd</td>
 *  	<td>C</td>
 *  	<td>7</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票出力ロケールＣＤ</td>
 *  	<td>Report output locale cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ１</td>
 *  	<td>BP classification cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ２</td>
 *  	<td>BP classification cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ３</td>
 *  	<td>BP classification cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_cd4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ４</td>
 *  	<td>BP classification cd. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_cd5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ５</td>
 *  	<td>BP classification cd. 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_cd6</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ６</td>
 *  	<td>BP classification cd. 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_cd7</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ７</td>
 *  	<td>BP classification cd. 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_cd8</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ８</td>
 *  	<td>BP classification cd. 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_cd9</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ９</td>
 *  	<td>BP classification cd. 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_cd10</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ１０</td>
 *  	<td>BP classification cd. 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_alc_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先配賦グループ</td>
 *  	<td>BP allocation group</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>得意先ＦＬＧ</td>
 *  	<td>Customer flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>acst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売掛先ＦＬＧ</td>
 *  	<td>AR customer flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bcst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求先ＦＬＧ</td>
 *  	<td>Billing customer flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金先ＦＬＧ</td>
 *  	<td>Payer flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注先ＦＬＧ</td>
 *  	<td>Supplier flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asppl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>買掛先ＦＬＧ</td>
 *  	<td>AP supplier flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bsppl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定管理先ＦＬＧ</td>
 *  	<td>Scheduled payee flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>psppl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払先ＦＬＧ</td>
 *  	<td>Payee flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cred_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>与信管理先ＦＬＧ</td>
 *  	<td>Credit managed BP flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先ＦＬＧ</td>
 *  	<td>Delivery destination flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>maker_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>メーカＦＬＧ</td>
 *  	<td>Maker flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕向先ＦＬＧ</td>
 *  	<td>Distribution channel flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>all_com_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>全社ＦＬＧ</td>
 *  	<td>Company-wide flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>acst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売掛先ＣＤ</td>
 *  	<td>AR customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_dpt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権部門区分</td>
 *  	<td>AR dept. type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権部門ＣＤ</td>
 *  	<td>AR dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先部署</td>
 *  	<td>Customer dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先担当者</td>
 *  	<td>Customer PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_cntct_psn_title</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先担当者敬称</td>
 *  	<td>Form of address for Customer PIC</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>得意先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous customer flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_upri_req_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売単価取得区分</td>
 *  	<td>Sales unit price acquisition type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_upri_cng_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売単価変更許可ＦＬＧ</td>
 *  	<td>Allow sales unit price change flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_upri_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売単価端数処理区分</td>
 *  	<td>Sales unit price rounding type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_amt_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上金額端数処理区分</td>
 *  	<td>Rounding type (Sales amount)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_tax_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上税計算区分</td>
 *  	<td>Sales tax calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_tax_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上税額端数処理区分</td>
 *  	<td>Sales tax rounding type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上計上区分</td>
 *  	<td>Revenue recording type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求起算区分</td>
 *  	<td>Billing initial base type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_schd_split_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷予定分割区分</td>
 *  	<td>Shipping schedule split type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_crryovr_times</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求繰越回数</td>
 *  	<td>Billing carry-over count</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_back_stop_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット逆転禁止区分</td>
 *  	<td>Lot reverse prohibit type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slip_each_lot_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット明細分割区分</td>
 *  	<td>Lot details split type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_ship_form_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先納品書ＣＤ</td>
 *  	<td>Customer delivery note cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_lst_issue_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>現品票発行ＦＬＧ</td>
 *  	<td>Identification tag issue flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_lst_form_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>現品票ＣＤ</td>
 *  	<td>Identification tag cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上税ＣＤ</td>
 *  	<td>Sales tax cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_tax_cd_prio_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上税優先ＦＬＧ</td>
 *  	<td>Sales tax priority flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wrk_ar_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>案件別債権管理ＦＬＧ</td>
 *  	<td>AR management by sales project flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_iv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>得意先インボイス取引ＦＬＧ</td>
 *  	<td>Customer invoice transaction flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷ＬＴ（需要情報用）</td>
 *  	<td>Shipping LT (For demand)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_tterm_cd1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先取引条件ＣＤ１</td>
 *  	<td>Customer transaction terms cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_tterm_cd2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先取引条件ＣＤ２</td>
 *  	<td>Customer transaction terms cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_tterm_cd3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先取引条件ＣＤ３</td>
 *  	<td>Customer transaction terms cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_anly_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売分析ＣＤ１</td>
 *  	<td>Sales analysis cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_anly_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売分析ＣＤ２</td>
 *  	<td>Sales analysis cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_anly_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売分析ＣＤ３</td>
 *  	<td>Sales analysis cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先ＣＤ</td>
 *  	<td>Billing customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金先ＣＤ</td>
 *  	<td>Payer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_cred_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権与信管理先ＣＤ</td>
 *  	<td>AR credit managed BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_dpt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求部門区分</td>
 *  	<td>Billing dept. type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bcst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先担当部門ＣＤ</td>
 *  	<td>Billing customer dept. in charge cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_cl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締処理区分</td>
 *  	<td>Billing closing type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_cl_day1</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締日１</td>
 *  	<td>Billing closing day 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_cl_day2</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締日２</td>
 *  	<td>Billing closing day 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_cl_day3</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締日３</td>
 *  	<td>Billing closing day 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_cl_day4</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締日４</td>
 *  	<td>Billing closing day 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_cl_day5</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締日５</td>
 *  	<td>Billing closing day 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_on_bill_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求税計算ＦＬＧ</td>
 *  	<td>Billing tax calculation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_tax_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求税額端数処理区分</td>
 *  	<td>Billing tax rounding type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_cl_delay_days</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締遅延日数</td>
 *  	<td>Delayed days (Billing closing day)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_cl_ba_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締前後区分</td>
 *  	<td>Billing closing before/after type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_interim_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上仮単価締ＦＬＧ</td>
 *  	<td>Sales temporary unit price closing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先カレンダＣＤ</td>
 *  	<td>Billing customer calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_ba_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金予定前後区分</td>
 *  	<td>Payment receipt schedule before/after type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付郵便番号</td>
 *  	<td>Invoice send-to zip code</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付住所１</td>
 *  	<td>Invoice send-to address 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付住所２</td>
 *  	<td>Invoice send-to address 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付住所３</td>
 *  	<td>Invoice send-to address 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付住所４</td>
 *  	<td>Invoice send-to address 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付ＴＥＬ</td>
 *  	<td>Invoice send-to TEL</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_bcst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書宛先</td>
 *  	<td>Invoice destination</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_bcst_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付部署</td>
 *  	<td>Invoice send-to dept.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_bcst_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付担当者</td>
 *  	<td>Invoice send-to PIC</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_bcst_psn_title</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付担当者敬称</td>
 *  	<td>Invoice send-to PIC honorific</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bfw_bal_disp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書前月残高表示ＦＬＧ</td>
 *  	<td>Display balance of previous month on invoice flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_dtl_outp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上明細書出力区分</td>
 *  	<td>Sales details output type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書発行区分</td>
 *  	<td>Invoice issue type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_dtl_outp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書明細出力ＦＬＧ</td>
 *  	<td>Invoice details output flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_dtl_adv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書前受金表示ＦＬＧ</td>
 *  	<td>Display advance received on invoice</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_dtl_rcv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書入金予定表示ＦＬＧ</td>
 *  	<td>Display payment receipt schedule in invoice flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_dtl_subttl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書明細小計区分</td>
 *  	<td>Invoice details subtotal type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_dtl_brk_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書明細改頁区分</td>
 *  	<td>Invoice details page break type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_dtl_sort_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書明細並順区分</td>
 *  	<td>Invoice details sorting order type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_can_slip_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書取消伝票表示区分</td>
 *  	<td>Invoice cancel slip display type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>auto_line_appl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>自動明細消込ＦＬＧ</td>
 *  	<td>Details auto-reconciliation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_setoff_grp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権相殺グループＣＤ</td>
 *  	<td>AR offset group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振込人名</td>
 *  	<td>Payment person name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_auto_appl_tgt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金自動消込対象ＦＬＧ</td>
 *  	<td>For auto-reconciliation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_amt_match_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額考慮ＦＬＧ</td>
 *  	<td>Match amount flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_typ_match_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金種考慮ＦＬＧ</td>
 *  	<td>Match payment option flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_com_paid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手数料計算ＦＬＧ</td>
 *  	<td>Fee calculation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>auto_appl_delay_days</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>自動消込基準日遅延日数</td>
 *  	<td>Delayed days (Auto-reconciliation base date)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>asppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛先ＣＤ</td>
 *  	<td>AP supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>vmi_purc_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＶＭＩ購買部門ＣＤ</td>
 *  	<td>VMI purchasing dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>subcon_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>下請対象ＦＬＧ</td>
 *  	<td>For subcontract flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_print_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>注文書表示ＣＤ</td>
 *  	<td>Display PO sheet cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_ship_form_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先納品書ＣＤ</td>
 *  	<td>Supplier delivery note cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_dlv_slip_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注時納品書ＦＬＧ</td>
 *  	<td>Delivery note at P/O flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_dlv_slip_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示時納品書ＦＬＧ</td>
 *  	<td>Delivery note at delivery order flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prms_rcpt_dlv_slip_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納期回答受領時納品書ＦＬＧ</td>
 *  	<td>Delivery note at receipt of order promising result flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_crryovr_times</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払繰越回数</td>
 *  	<td>Payment carry-over count</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先部署</td>
 *  	<td>Supplier dept.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先担当者</td>
 *  	<td>Supplier PIC</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_cntct_psn_title</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先担当者敬称</td>
 *  	<td>Supplier PIC form of address</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_upri_req_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買単価取得区分</td>
 *  	<td>Purchase unit price acquisition type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_upri_cng_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買単価変更許可ＦＬＧ</td>
 *  	<td>Allow purchasing unit price change flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_amt_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入金額端数処理区分</td>
 *  	<td>Rounding type (Purchase amount)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_tax_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入税額端数処理区分</td>
 *  	<td>Rounding type (Purchase tax)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_tax_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入税計算区分</td>
 *  	<td>Purchase tax calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入税ＣＤ</td>
 *  	<td>Purchase tax cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_tax_cd_prio_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入税優先ＦＬＧ</td>
 *  	<td>Purchase tax priority flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wrk_po_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>案件別注文書ＦＬＧ</td>
 *  	<td>PO sheet by sales project flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wrk_ap_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>案件別債務管理ＦＬＧ</td>
 *  	<td>AP management by sales project flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_slip_each_lot_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入ロット明細分割区分</td>
 *  	<td>Purchase lot details split type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_rcv_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給積送管理区分</td>
 *  	<td>In-transit supply management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>onr_prsppl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>有償支給先ＦＬＧ</td>
 *  	<td>Chargeable supplier flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>outsrc_upri_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外注単価区分</td>
 *  	<td>Subcontracting unit price type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給計上区分</td>
 *  	<td>Supply recording type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_upri_cng_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支給単価変更許可ＦＬＧ</td>
 *  	<td>Allow supply unit price change flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_amt_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給金額端数処理区分</td>
 *  	<td>Supply amount rounding type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_tax_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給税額端数処理区分</td>
 *  	<td>Supply tax rounding type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_tax_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給税計算区分</td>
 *  	<td>Supply tax calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給税ＣＤ</td>
 *  	<td>Supply tax cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_tax_cd_prio_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支給税優先ＦＬＧ</td>
 *  	<td>Supply tax priority flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先カレンダＣＤ</td>
 *  	<td>Supplier calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_iv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注先インボイス取引ＦＬＧ</td>
 *  	<td>Supplier invoice transaction flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_iv_dup_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受領インボイス重複許可ＦＬＧ</td>
 *  	<td>Allow purchase invoice duplication flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prms_recv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納期回答確認ＦＬＧ</td>
 *  	<td>Order promising check flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_tterm_cd1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先取引条件ＣＤ１</td>
 *  	<td>Supplier transaction terms cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_tterm_cd2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先取引条件ＣＤ２</td>
 *  	<td>Supplier transaction terms cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_tterm_cd3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先取引条件ＣＤ３</td>
 *  	<td>Supplier transaction terms cd. 3</td>
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
 *  	<td>repurc_obli_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>買戻義務ＦＬＧ</td>
 *  	<td>Repurchase obligation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bsppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定管理先ＣＤ</td>
 *  	<td>Scheduled payee cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務部門ＣＤ</td>
 *  	<td>AP dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>psppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払先ＣＤ</td>
 *  	<td>Payee cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_cred_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務与信管理先ＣＤ</td>
 *  	<td>AP credit managed BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bsppl_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定管理先担当部門ＣＤ</td>
 *  	<td>Cd. of dept. in charge of scheduled payee</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_spot_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>都度支払ＦＬＧ</td>
 *  	<td>Payment per transaction flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>psppl_cl_day1</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払締日１</td>
 *  	<td>Payment closing date 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>psppl_cl_day2</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払締日２</td>
 *  	<td>Payment closing date 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>psppl_cl_day3</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払締日３</td>
 *  	<td>Payment closing date 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>psppl_cl_day4</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払締日４</td>
 *  	<td>Payment closing date 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>psppl_cl_day5</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払締日５</td>
 *  	<td>Payment closing date 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_interim_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入仮単価締ＦＬＧ</td>
 *  	<td>Purchase temporary unit price closing flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_setoff_grp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務相殺グループＣＤ</td>
 *  	<td>AP offset group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払先口座ＣＤ</td>
 *  	<td>Payee account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_ba_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定前後区分</td>
 *  	<td>Payment schedule before/after type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_on_pay_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払税計算ＦＬＧ</td>
 *  	<td>Payment tax calculation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_tax_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払税額端数処理区分</td>
 *  	<td>Payment tax amount rounding type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>batch_pay_schd_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>バッチ支払予定締ＦＬＧ</td>
 *  	<td>Batch payment schedule closing flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_cl_delay_days</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定締遅延日数</td>
 *  	<td>Payment schedule closing delay days</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_cl_ba_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定締前後区分</td>
 *  	<td>Payment schedule closing before/after type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_co_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>事業者ＮＯ</td>
 *  	<td>Business No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書発行対象ＦＬＧ</td>
 *  	<td>Payment notice to be issued flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書送付郵便番号</td>
 *  	<td>Payment notice send-to zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書送付住所１</td>
 *  	<td>Payment notice send-to address 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書送付住所２</td>
 *  	<td>Payment notice send-to address 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書送付住所３</td>
 *  	<td>Payment notice send-to address 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書送付住所４</td>
 *  	<td>Payment notice send-to address 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_bsppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書宛先</td>
 *  	<td>Payment notice destination</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_bsppl_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書送付部署</td>
 *  	<td>Payment notice send-to dept.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_bsppl_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書送付担当者</td>
 *  	<td>Payment notice send-to PIC</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_bsppl_psn_title</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書送付担当者敬称</td>
 *  	<td>Payment notice send-to PIC honorific title</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書送付ＴＥＬ</td>
 *  	<td>Payment notice send-to TEL</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_dtl_outp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書明細出力ＦＬＧ</td>
 *  	<td>Output payment notice details flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_bfw_bal_disp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書前月残高表示ＦＬＧ</td>
 *  	<td>Display balance of previous month on payment notice flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_adv_pay_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書前渡金表示ＦＬＧ</td>
 *  	<td>Display advance payment on payment notice flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_dtl_pay_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書支払予定表示ＦＬＧ</td>
 *  	<td>Display payment schedule on payment notice flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_dtl_subttl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書明細小計区分</td>
 *  	<td>Payment notice details subtotal type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_dtl_brk_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書明細改頁区分</td>
 *  	<td>Payment notice details page break type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_dtl_sort_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書明細並順区分</td>
 *  	<td>Payment notice details sorting order type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_can_slip_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書取消伝票表示区分</td>
 *  	<td>Payment notice cancel slip display type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>psppl_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払先備考</td>
 *  	<td>Payee remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形サイト上限</td>
 *  	<td>Note sight upper limit</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払部門ＣＤ</td>
 *  	<td>Payment dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous delivery destination flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先部署</td>
 *  	<td>Delivery destination dept.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先担当者</td>
 *  	<td>Delivery destination PIC</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_cntct_psn_title</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先担当者敬称</td>
 *  	<td>Delivery destination PIC honorific</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pri_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>価格印字ＦＬＧ</td>
 *  	<td>Print price flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cnsgn_stktk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>貸出在庫棚卸対象ＦＬＧ</td>
 *  	<td>For consignment inventory count flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配送先ＦＬＧ</td>
 *  	<td>Receiving point flg.</td>
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
 *  	<td>tdlv_req_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配送先必須ＦＬＧ</td>
 *  	<td>Receiving point required flg.</td>
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
 *  	<td>dlv_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先カレンダＣＤ</td>
 *  	<td>Delivery destination calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_chnnl1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先チャネル１</td>
 *  	<td>Delivery destination channel 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_chnnl2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先チャネル２</td>
 *  	<td>Delivery destination channel 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_chnnl3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先チャネル３</td>
 *  	<td>Delivery destination channel 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（得意先）</td>
 *  	<td>Slip issue type (Customer)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>acst_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（売掛先）</td>
 *  	<td>Slip issue type (AR customer)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bcst_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（請求先）</td>
 *  	<td>Slip issue type (Billing customer)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcst_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（入金先）</td>
 *  	<td>Slip issue type (Payer)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（発注先）</td>
 *  	<td>Slip issue type (Supplier)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asppl_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（買掛先）</td>
 *  	<td>Slip issue type (AP supplier)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bsppl_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（支払予定管理先）</td>
 *  	<td>Slip issue type (Scheduled payee)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>psppl_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（支払先）</td>
 *  	<td>Slip issue type (Payee)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（納品先）</td>
 *  	<td>Slip issue type (Delivery destination)</td>
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
 *  	<td>memo4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ４</td>
 *  	<td>Memo 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ５</td>
 *  	<td>Memo 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ６</td>
 *  	<td>Memo 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ７</td>
 *  	<td>Memo 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ８</td>
 *  	<td>Memo 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ９</td>
 *  	<td>Memo 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo10</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１０</td>
 *  	<td>Memo 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo11</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１１</td>
 *  	<td>Memo 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo12</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１２</td>
 *  	<td>Memo 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo13</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１３</td>
 *  	<td>Memo 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo14</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１４</td>
 *  	<td>Memo 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo15</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１５</td>
 *  	<td>Memo 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo16</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１６</td>
 *  	<td>Memo 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo17</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１７</td>
 *  	<td>Memo 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo18</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１８</td>
 *  	<td>Memo 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo19</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１９</td>
 *  	<td>Memo 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo20</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２０</td>
 *  	<td>Memo 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_lg_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流グループ混在不可ＦＬＧ</td>
 *  	<td>Prohibit mixed distribution group flg.</td>
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
 *  	<td>cntry_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国名</td>
 *  	<td>Country name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>area_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>地域名</td>
 *  	<td>Region name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨名</td>
 *  	<td>Currency name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１</td>
 *  	<td>BP classification name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名２</td>
 *  	<td>BP classification name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名３</td>
 *  	<td>BP classification name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名４</td>
 *  	<td>BP classification name 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名５</td>
 *  	<td>BP classification name 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm6</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名６</td>
 *  	<td>BP classification name 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm7</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名７</td>
 *  	<td>BP classification name 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm8</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名８</td>
 *  	<td>BP classification name 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm9</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名９</td>
 *  	<td>BP classification name 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm10</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１０</td>
 *  	<td>BP classification name 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>acst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売掛先名</td>
 *  	<td>AR customer name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権部門名</td>
 *  	<td>AR dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_ship_form_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先納品書名</td>
 *  	<td>Customer delivery note name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_lst_form_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>現品票名</td>
 *  	<td>Identification tag name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上税名</td>
 *  	<td>Sales tax name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_tterm_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先取引条件名１</td>
 *  	<td>Customer transaction terms name 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_tterm_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先取引条件名２</td>
 *  	<td>Customer transaction terms name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_tterm_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先取引条件名３</td>
 *  	<td>Customer transaction terms name 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_anly_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売分析名１</td>
 *  	<td>Sales analysis name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_anly_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売分析名２</td>
 *  	<td>Sales analysis name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_anly_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売分析名３</td>
 *  	<td>Sales analysis name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bcst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先名</td>
 *  	<td>Billing customer name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金先名</td>
 *  	<td>Payer name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_cred_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権与信管理先名</td>
 *  	<td>AR credit managed BP name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bcst_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先担当部門名</td>
 *  	<td>Billing customer dept. in charge name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先カレンダ名</td>
 *  	<td>Billing customer calendar name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_setoff_grp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権相殺グループ名</td>
 *  	<td>AR offset group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名</td>
 *  	<td>Distribution group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先カレンダ名</td>
 *  	<td>Delivery destination calendar name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛先名</td>
 *  	<td>AP supplier name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>vmi_purc_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＶＭＩ購買部門名</td>
 *  	<td>VMI purchasing dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_print_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>注文書表示名</td>
 *  	<td>Display PO sheet name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_ship_form_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先納品書名</td>
 *  	<td>Supplier delivery note name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入税名</td>
 *  	<td>Purchase tax type name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給税名</td>
 *  	<td>Supply tax name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先カレンダ名</td>
 *  	<td>Supplier calendar name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_tterm_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先取引条件名１</td>
 *  	<td>Supplier transaction terms name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_tterm_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先取引条件名２</td>
 *  	<td>Supplier transaction terms name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_tterm_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先取引条件名３</td>
 *  	<td>Supplier transaction terms name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bsppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定管理先名</td>
 *  	<td>Scheduled payee name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務部門名</td>
 *  	<td>AP dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>psppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払先名</td>
 *  	<td>Payee name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_cred_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務与信管理先名</td>
 *  	<td>AP credit managed BP name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bsppl_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定管理先担当部門名</td>
 *  	<td>Name of dept. in charge of scheduled payee</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_setoff_grp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務相殺グループ名</td>
 *  	<td>AP offset group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_bank_ac_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払先口座名</td>
 *  	<td>Payee account name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払部門名</td>
 *  	<td>Payment dept. name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBT_BP_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MBT_BP_IF";

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
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	private static final MCPermColumnInfo _del_flg = createColumnInfo("del_flg");
	public final MCBooleanPermColumn del_flg = createBooleanColumn(_del_flg);
	
	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	private static final MCPermColumnInfo _bp_nm = createColumnInfo("bp_nm");
	public final MCStringPermColumn bp_nm = createStringColumn(_bp_nm);
	
	/**
	 * 取引先別名１. BP alias name 1.<p>
	 *
	 */
	public static final String $bp_alt_nm1 = "bp_alt_nm1";
	private static final MCPermColumnInfo _bp_alt_nm1 = createColumnInfo("bp_alt_nm1");
	public final MCStringPermColumn bp_alt_nm1 = createStringColumn(_bp_alt_nm1);
	
	/**
	 * 取引先別名２. BP alias name 2.<p>
	 *
	 */
	public static final String $bp_alt_nm2 = "bp_alt_nm2";
	private static final MCPermColumnInfo _bp_alt_nm2 = createColumnInfo("bp_alt_nm2");
	public final MCStringPermColumn bp_alt_nm2 = createStringColumn(_bp_alt_nm2);
	
	/**
	 * 取引先別名３. BP alias name 3.<p>
	 *
	 */
	public static final String $bp_alt_nm3 = "bp_alt_nm3";
	private static final MCPermColumnInfo _bp_alt_nm3 = createColumnInfo("bp_alt_nm3");
	public final MCStringPermColumn bp_alt_nm3 = createStringColumn(_bp_alt_nm3);
	
	/**
	 * 取引先別名４. BP alias name 4.<p>
	 *
	 */
	public static final String $bp_alt_nm4 = "bp_alt_nm4";
	private static final MCPermColumnInfo _bp_alt_nm4 = createColumnInfo("bp_alt_nm4");
	public final MCStringPermColumn bp_alt_nm4 = createStringColumn(_bp_alt_nm4);
	
	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	private static final MCPermColumnInfo _zip_cd = createColumnInfo("zip_cd");
	public final MCStringPermColumn zip_cd = createStringColumn(_zip_cd);
	
	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	private static final MCPermColumnInfo _addr1 = createColumnInfo("addr1");
	public final MCStringPermColumn addr1 = createStringColumn(_addr1);
	
	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	private static final MCPermColumnInfo _addr2 = createColumnInfo("addr2");
	public final MCStringPermColumn addr2 = createStringColumn(_addr2);
	
	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	private static final MCPermColumnInfo _addr3 = createColumnInfo("addr3");
	public final MCStringPermColumn addr3 = createStringColumn(_addr3);
	
	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	private static final MCPermColumnInfo _addr4 = createColumnInfo("addr4");
	public final MCStringPermColumn addr4 = createStringColumn(_addr4);
	
	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public static final String $tel = "tel";
	private static final MCPermColumnInfo _tel = createColumnInfo("tel");
	public final MCStringPermColumn tel = createStringColumn(_tel);
	
	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public static final String $fax = "fax";
	private static final MCPermColumnInfo _fax = createColumnInfo("fax");
	public final MCStringPermColumn fax = createStringColumn(_fax);
	
	/**
	 * 法人番号. Corporation number.<p>
	 *
	 */
	public static final String $ein = "ein";
	private static final MCPermColumnInfo _ein = createColumnInfo("ein");
	public final MCStringPermColumn ein = createStringColumn(_ein);
	
	/**
	 * 標準企業コード. Standard company code.<p>
	 *
	 */
	public static final String $std_co_cd = "std_co_cd";
	private static final MCPermColumnInfo _std_co_cd = createColumnInfo("std_co_cd");
	public final MCStringPermColumn std_co_cd = createStringColumn(_std_co_cd);
	
	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	private static final MCPermColumnInfo _cntry_cd = createColumnInfo("cntry_cd");
	public final MCStringPermColumn cntry_cd = createStringColumn(_cntry_cd);
	
	/**
	 * 地域ＣＤ. Region cd..<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	private static final MCPermColumnInfo _area_cd = createColumnInfo("area_cd");
	public final MCStringPermColumn area_cd = createStringColumn(_area_cd);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * 帳票出力ロケールＣＤ. Report output locale cd..<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	private static final MCPermColumnInfo _prnt_lcl_cd = createColumnInfo("prnt_lcl_cd");
	public final MCStringPermColumn prnt_lcl_cd = createStringColumn(_prnt_lcl_cd);
	
	/**
	 * 取引先分類ＣＤ１. BP classification cd. 1.<p>
	 *
	 */
	public static final String $bp_grp_cd1 = "bp_grp_cd1";
	private static final MCPermColumnInfo _bp_grp_cd1 = createColumnInfo("bp_grp_cd1");
	public final MCStringPermColumn bp_grp_cd1 = createStringColumn(_bp_grp_cd1);
	
	/**
	 * 取引先分類ＣＤ２. BP classification cd. 2.<p>
	 *
	 */
	public static final String $bp_grp_cd2 = "bp_grp_cd2";
	private static final MCPermColumnInfo _bp_grp_cd2 = createColumnInfo("bp_grp_cd2");
	public final MCStringPermColumn bp_grp_cd2 = createStringColumn(_bp_grp_cd2);
	
	/**
	 * 取引先分類ＣＤ３. BP classification cd. 3.<p>
	 *
	 */
	public static final String $bp_grp_cd3 = "bp_grp_cd3";
	private static final MCPermColumnInfo _bp_grp_cd3 = createColumnInfo("bp_grp_cd3");
	public final MCStringPermColumn bp_grp_cd3 = createStringColumn(_bp_grp_cd3);
	
	/**
	 * 取引先分類ＣＤ４. BP classification cd. 4.<p>
	 *
	 */
	public static final String $bp_grp_cd4 = "bp_grp_cd4";
	private static final MCPermColumnInfo _bp_grp_cd4 = createColumnInfo("bp_grp_cd4");
	public final MCStringPermColumn bp_grp_cd4 = createStringColumn(_bp_grp_cd4);
	
	/**
	 * 取引先分類ＣＤ５. BP classification cd. 5.<p>
	 *
	 */
	public static final String $bp_grp_cd5 = "bp_grp_cd5";
	private static final MCPermColumnInfo _bp_grp_cd5 = createColumnInfo("bp_grp_cd5");
	public final MCStringPermColumn bp_grp_cd5 = createStringColumn(_bp_grp_cd5);
	
	/**
	 * 取引先分類ＣＤ６. BP classification cd. 6.<p>
	 *
	 */
	public static final String $bp_grp_cd6 = "bp_grp_cd6";
	private static final MCPermColumnInfo _bp_grp_cd6 = createColumnInfo("bp_grp_cd6");
	public final MCStringPermColumn bp_grp_cd6 = createStringColumn(_bp_grp_cd6);
	
	/**
	 * 取引先分類ＣＤ７. BP classification cd. 7.<p>
	 *
	 */
	public static final String $bp_grp_cd7 = "bp_grp_cd7";
	private static final MCPermColumnInfo _bp_grp_cd7 = createColumnInfo("bp_grp_cd7");
	public final MCStringPermColumn bp_grp_cd7 = createStringColumn(_bp_grp_cd7);
	
	/**
	 * 取引先分類ＣＤ８. BP classification cd. 8.<p>
	 *
	 */
	public static final String $bp_grp_cd8 = "bp_grp_cd8";
	private static final MCPermColumnInfo _bp_grp_cd8 = createColumnInfo("bp_grp_cd8");
	public final MCStringPermColumn bp_grp_cd8 = createStringColumn(_bp_grp_cd8);
	
	/**
	 * 取引先分類ＣＤ９. BP classification cd. 9.<p>
	 *
	 */
	public static final String $bp_grp_cd9 = "bp_grp_cd9";
	private static final MCPermColumnInfo _bp_grp_cd9 = createColumnInfo("bp_grp_cd9");
	public final MCStringPermColumn bp_grp_cd9 = createStringColumn(_bp_grp_cd9);
	
	/**
	 * 取引先分類ＣＤ１０. BP classification cd. 10.<p>
	 *
	 */
	public static final String $bp_grp_cd10 = "bp_grp_cd10";
	private static final MCPermColumnInfo _bp_grp_cd10 = createColumnInfo("bp_grp_cd10");
	public final MCStringPermColumn bp_grp_cd10 = createStringColumn(_bp_grp_cd10);
	
	/**
	 * 取引先配賦グループ. BP allocation group.<p>
	 *
	 */
	public static final String $bp_alc_grp = "bp_alc_grp";
	private static final MCPermColumnInfo _bp_alc_grp = createColumnInfo("bp_alc_grp");
	public final MCStringPermColumn bp_alc_grp = createStringColumn(_bp_alc_grp);
	
	/**
	 * 得意先ＦＬＧ. Customer flg..<p>
	 *
	 */
	public static final String $cst_flg = "cst_flg";
	private static final MCPermColumnInfo _cst_flg = createColumnInfo("cst_flg");
	public final MCBooleanPermColumn cst_flg = createBooleanColumn(_cst_flg);
	
	/**
	 * 売掛先ＦＬＧ. AR customer flg..<p>
	 *
	 */
	public static final String $acst_flg = "acst_flg";
	private static final MCPermColumnInfo _acst_flg = createColumnInfo("acst_flg");
	public final MCBooleanPermColumn acst_flg = createBooleanColumn(_acst_flg);
	
	/**
	 * 請求先ＦＬＧ. Billing customer flg..<p>
	 *
	 */
	public static final String $bcst_flg = "bcst_flg";
	private static final MCPermColumnInfo _bcst_flg = createColumnInfo("bcst_flg");
	public final MCBooleanPermColumn bcst_flg = createBooleanColumn(_bcst_flg);
	
	/**
	 * 入金先ＦＬＧ. Payer flg..<p>
	 *
	 */
	public static final String $rcst_flg = "rcst_flg";
	private static final MCPermColumnInfo _rcst_flg = createColumnInfo("rcst_flg");
	public final MCBooleanPermColumn rcst_flg = createBooleanColumn(_rcst_flg);
	
	/**
	 * 発注先ＦＬＧ. Supplier flg..<p>
	 *
	 */
	public static final String $sppl_flg = "sppl_flg";
	private static final MCPermColumnInfo _sppl_flg = createColumnInfo("sppl_flg");
	public final MCBooleanPermColumn sppl_flg = createBooleanColumn(_sppl_flg);
	
	/**
	 * 買掛先ＦＬＧ. AP supplier flg..<p>
	 *
	 */
	public static final String $asppl_flg = "asppl_flg";
	private static final MCPermColumnInfo _asppl_flg = createColumnInfo("asppl_flg");
	public final MCBooleanPermColumn asppl_flg = createBooleanColumn(_asppl_flg);
	
	/**
	 * 支払予定管理先ＦＬＧ. Scheduled payee flg..<p>
	 *
	 */
	public static final String $bsppl_flg = "bsppl_flg";
	private static final MCPermColumnInfo _bsppl_flg = createColumnInfo("bsppl_flg");
	public final MCBooleanPermColumn bsppl_flg = createBooleanColumn(_bsppl_flg);
	
	/**
	 * 支払先ＦＬＧ. Payee flg..<p>
	 *
	 */
	public static final String $psppl_flg = "psppl_flg";
	private static final MCPermColumnInfo _psppl_flg = createColumnInfo("psppl_flg");
	public final MCBooleanPermColumn psppl_flg = createBooleanColumn(_psppl_flg);
	
	/**
	 * 与信管理先ＦＬＧ. Credit managed BP flg..<p>
	 *
	 */
	public static final String $cred_flg = "cred_flg";
	private static final MCPermColumnInfo _cred_flg = createColumnInfo("cred_flg");
	public final MCBooleanPermColumn cred_flg = createBooleanColumn(_cred_flg);
	
	/**
	 * 納品先ＦＬＧ. Delivery destination flg..<p>
	 *
	 */
	public static final String $dlv_flg = "dlv_flg";
	private static final MCPermColumnInfo _dlv_flg = createColumnInfo("dlv_flg");
	public final MCBooleanPermColumn dlv_flg = createBooleanColumn(_dlv_flg);
	
	/**
	 * メーカＦＬＧ. Maker flg..<p>
	 *
	 */
	public static final String $maker_flg = "maker_flg";
	private static final MCPermColumnInfo _maker_flg = createColumnInfo("maker_flg");
	public final MCBooleanPermColumn maker_flg = createBooleanColumn(_maker_flg);
	
	/**
	 * 仕向先ＦＬＧ. Distribution channel flg..<p>
	 *
	 */
	public static final String $dest_flg = "dest_flg";
	private static final MCPermColumnInfo _dest_flg = createColumnInfo("dest_flg");
	public final MCBooleanPermColumn dest_flg = createBooleanColumn(_dest_flg);
	
	/**
	 * 全社ＦＬＧ. Company-wide flg..<p>
	 *
	 */
	public static final String $all_com_flg = "all_com_flg";
	private static final MCPermColumnInfo _all_com_flg = createColumnInfo("all_com_flg");
	public final MCBooleanPermColumn all_com_flg = createBooleanColumn(_all_com_flg);
	
	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	private static final MCPermColumnInfo _acst_cd = createColumnInfo("acst_cd");
	public final MCStringPermColumn acst_cd = createStringColumn(_acst_cd);
	
	/**
	 * 債権部門区分. AR dept. type.<p>
	 *
	 */
	public static final String $ar_dpt_typ = "ar_dpt_typ";
	private static final MCPermColumnInfo _ar_dpt_typ = createColumnInfo("ar_dpt_typ");
	public final MCStringPermColumn ar_dpt_typ = createStringColumn(_ar_dpt_typ);
	
	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	private static final MCPermColumnInfo _ar_dpt_cd = createColumnInfo("ar_dpt_cd");
	public final MCStringPermColumn ar_dpt_cd = createStringColumn(_ar_dpt_cd);
	
	/**
	 * 得意先部署. Customer dept..<p>
	 *
	 */
	public static final String $cst_cntct_dpt = "cst_cntct_dpt";
	private static final MCPermColumnInfo _cst_cntct_dpt = createColumnInfo("cst_cntct_dpt");
	public final MCStringPermColumn cst_cntct_dpt = createStringColumn(_cst_cntct_dpt);
	
	/**
	 * 得意先担当者. Customer PIC.<p>
	 *
	 */
	public static final String $cst_cntct_psn = "cst_cntct_psn";
	private static final MCPermColumnInfo _cst_cntct_psn = createColumnInfo("cst_cntct_psn");
	public final MCStringPermColumn cst_cntct_psn = createStringColumn(_cst_cntct_psn);
	
	/**
	 * 得意先担当者敬称. Form of address for Customer PIC.<p>
	 *
	 */
	public static final String $cst_cntct_psn_title = "cst_cntct_psn_title";
	private static final MCPermColumnInfo _cst_cntct_psn_title = createColumnInfo("cst_cntct_psn_title");
	public final MCStringPermColumn cst_cntct_psn_title = createStringColumn(_cst_cntct_psn_title);
	
	/**
	 * 得意先諸口ＦＬＧ. Miscellaneous customer flg..<p>
	 *
	 */
	public static final String $cst_sundry_flg = "cst_sundry_flg";
	private static final MCPermColumnInfo _cst_sundry_flg = createColumnInfo("cst_sundry_flg");
	public final MCBooleanPermColumn cst_sundry_flg = createBooleanColumn(_cst_sundry_flg);
	
	/**
	 * 販売単価取得区分. Sales unit price acquisition type.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	private static final MCPermColumnInfo _sls_upri_req_typ = createColumnInfo("sls_upri_req_typ");
	public final MCStringPermColumn sls_upri_req_typ = createStringColumn(_sls_upri_req_typ);
	
	/**
	 * 販売単価変更許可ＦＬＧ. Allow sales unit price change flg..<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	private static final MCPermColumnInfo _sls_upri_cng_flg = createColumnInfo("sls_upri_cng_flg");
	public final MCBooleanPermColumn sls_upri_cng_flg = createBooleanColumn(_sls_upri_cng_flg);
	
	/**
	 * 販売単価端数処理区分. Sales unit price rounding type.<p>
	 *
	 */
	public static final String $sls_upri_rnd_typ = "sls_upri_rnd_typ";
	private static final MCPermColumnInfo _sls_upri_rnd_typ = createColumnInfo("sls_upri_rnd_typ");
	public final MCStringPermColumn sls_upri_rnd_typ = createStringColumn(_sls_upri_rnd_typ);
	
	/**
	 * 売上金額端数処理区分. Rounding type (Sales amount).<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ = "sls_amt_rnd_typ";
	private static final MCPermColumnInfo _sls_amt_rnd_typ = createColumnInfo("sls_amt_rnd_typ");
	public final MCStringPermColumn sls_amt_rnd_typ = createStringColumn(_sls_amt_rnd_typ);
	
	/**
	 * 売上税計算区分. Sales tax calculation type.<p>
	 *
	 */
	public static final String $sls_tax_calc_typ = "sls_tax_calc_typ";
	private static final MCPermColumnInfo _sls_tax_calc_typ = createColumnInfo("sls_tax_calc_typ");
	public final MCStringPermColumn sls_tax_calc_typ = createStringColumn(_sls_tax_calc_typ);
	
	/**
	 * 売上税額端数処理区分. Sales tax rounding type.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ = "sls_tax_rnd_typ";
	private static final MCPermColumnInfo _sls_tax_rnd_typ = createColumnInfo("sls_tax_rnd_typ");
	public final MCStringPermColumn sls_tax_rnd_typ = createStringColumn(_sls_tax_rnd_typ);
	
	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	private static final MCPermColumnInfo _sls_basis_typ = createColumnInfo("sls_basis_typ");
	public final MCStringPermColumn sls_basis_typ = createStringColumn(_sls_basis_typ);
	
	/**
	 * 請求起算区分. Billing initial base type.<p>
	 *
	 */
	public static final String $bill_basis_typ = "bill_basis_typ";
	private static final MCPermColumnInfo _bill_basis_typ = createColumnInfo("bill_basis_typ");
	public final MCStringPermColumn bill_basis_typ = createStringColumn(_bill_basis_typ);
	
	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	private static final MCPermColumnInfo _ship_schd_split_typ = createColumnInfo("ship_schd_split_typ");
	public final MCStringPermColumn ship_schd_split_typ = createStringColumn(_ship_schd_split_typ);
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	private static final MCPermColumnInfo _bill_crryovr_times = createColumnInfo("bill_crryovr_times");
	public final MCNumberPermColumn bill_crryovr_times = createNumberColumn(_bill_crryovr_times);
	
	/**
	 * ロット逆転禁止区分. Lot reverse prohibit type.<p>
	 *
	 */
	public static final String $lot_back_stop_typ = "lot_back_stop_typ";
	private static final MCPermColumnInfo _lot_back_stop_typ = createColumnInfo("lot_back_stop_typ");
	public final MCStringPermColumn lot_back_stop_typ = createStringColumn(_lot_back_stop_typ);
	
	/**
	 * ロット明細分割区分. Lot details split type.<p>
	 *
	 */
	public static final String $slip_each_lot_typ = "slip_each_lot_typ";
	private static final MCPermColumnInfo _slip_each_lot_typ = createColumnInfo("slip_each_lot_typ");
	public final MCStringPermColumn slip_each_lot_typ = createStringColumn(_slip_each_lot_typ);
	
	/**
	 * 得意先納品書ＣＤ. Customer delivery note cd..<p>
	 *
	 */
	public static final String $cst_ship_form_cd = "cst_ship_form_cd";
	private static final MCPermColumnInfo _cst_ship_form_cd = createColumnInfo("cst_ship_form_cd");
	public final MCStringPermColumn cst_ship_form_cd = createStringColumn(_cst_ship_form_cd);
	
	/**
	 * 現品票発行ＦＬＧ. Identification tag issue flg..<p>
	 *
	 */
	public static final String $stk_lst_issue_flg = "stk_lst_issue_flg";
	private static final MCPermColumnInfo _stk_lst_issue_flg = createColumnInfo("stk_lst_issue_flg");
	public final MCBooleanPermColumn stk_lst_issue_flg = createBooleanColumn(_stk_lst_issue_flg);
	
	/**
	 * 現品票ＣＤ. Identification tag cd..<p>
	 *
	 */
	public static final String $stk_lst_form_cd = "stk_lst_form_cd";
	private static final MCPermColumnInfo _stk_lst_form_cd = createColumnInfo("stk_lst_form_cd");
	public final MCStringPermColumn stk_lst_form_cd = createStringColumn(_stk_lst_form_cd);
	
	/**
	 * 売上税ＣＤ. Sales tax cd..<p>
	 *
	 */
	public static final String $sls_tax_cd = "sls_tax_cd";
	private static final MCPermColumnInfo _sls_tax_cd = createColumnInfo("sls_tax_cd");
	public final MCStringPermColumn sls_tax_cd = createStringColumn(_sls_tax_cd);
	
	/**
	 * 売上税優先ＦＬＧ. Sales tax priority flg..<p>
	 *
	 */
	public static final String $sls_tax_cd_prio_flg = "sls_tax_cd_prio_flg";
	private static final MCPermColumnInfo _sls_tax_cd_prio_flg = createColumnInfo("sls_tax_cd_prio_flg");
	public final MCBooleanPermColumn sls_tax_cd_prio_flg = createBooleanColumn(_sls_tax_cd_prio_flg);
	
	/**
	 * 案件別債権管理ＦＬＧ. AR management by sales project flg..<p>
	 *
	 */
	public static final String $wrk_ar_flg = "wrk_ar_flg";
	private static final MCPermColumnInfo _wrk_ar_flg = createColumnInfo("wrk_ar_flg");
	public final MCBooleanPermColumn wrk_ar_flg = createBooleanColumn(_wrk_ar_flg);
	
	/**
	 * 得意先インボイス取引ＦＬＧ. Customer invoice transaction flg..<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	private static final MCPermColumnInfo _cst_iv_flg = createColumnInfo("cst_iv_flg");
	public final MCBooleanPermColumn cst_iv_flg = createBooleanColumn(_cst_iv_flg);
	
	/**
	 * 出荷ＬＴ（需要情報用）. Shipping LT (For demand).<p>
	 *
	 */
	public static final String $ship_lt = "ship_lt";
	private static final MCPermColumnInfo _ship_lt = createColumnInfo("ship_lt");
	public final MCNumberPermColumn ship_lt = createNumberColumn(_ship_lt);
	
	/**
	 * 得意先取引条件ＣＤ１. Customer transaction terms cd. 1.<p>
	 *
	 */
	public static final String $cst_tterm_cd1 = "cst_tterm_cd1";
	private static final MCPermColumnInfo _cst_tterm_cd1 = createColumnInfo("cst_tterm_cd1");
	public final MCStringPermColumn cst_tterm_cd1 = createStringColumn(_cst_tterm_cd1);
	
	/**
	 * 得意先取引条件ＣＤ２. Customer transaction terms cd. 2.<p>
	 *
	 */
	public static final String $cst_tterm_cd2 = "cst_tterm_cd2";
	private static final MCPermColumnInfo _cst_tterm_cd2 = createColumnInfo("cst_tterm_cd2");
	public final MCStringPermColumn cst_tterm_cd2 = createStringColumn(_cst_tterm_cd2);
	
	/**
	 * 得意先取引条件ＣＤ３. Customer transaction terms cd. 3.<p>
	 *
	 */
	public static final String $cst_tterm_cd3 = "cst_tterm_cd3";
	private static final MCPermColumnInfo _cst_tterm_cd3 = createColumnInfo("cst_tterm_cd3");
	public final MCStringPermColumn cst_tterm_cd3 = createStringColumn(_cst_tterm_cd3);
	
	/**
	 * 販売分析ＣＤ１. Sales analysis cd. 1.<p>
	 *
	 */
	public static final String $sls_anly_cd1 = "sls_anly_cd1";
	private static final MCPermColumnInfo _sls_anly_cd1 = createColumnInfo("sls_anly_cd1");
	public final MCStringPermColumn sls_anly_cd1 = createStringColumn(_sls_anly_cd1);
	
	/**
	 * 販売分析ＣＤ２. Sales analysis cd. 2.<p>
	 *
	 */
	public static final String $sls_anly_cd2 = "sls_anly_cd2";
	private static final MCPermColumnInfo _sls_anly_cd2 = createColumnInfo("sls_anly_cd2");
	public final MCStringPermColumn sls_anly_cd2 = createStringColumn(_sls_anly_cd2);
	
	/**
	 * 販売分析ＣＤ３. Sales analysis cd. 3.<p>
	 *
	 */
	public static final String $sls_anly_cd3 = "sls_anly_cd3";
	private static final MCPermColumnInfo _sls_anly_cd3 = createColumnInfo("sls_anly_cd3");
	public final MCStringPermColumn sls_anly_cd3 = createStringColumn(_sls_anly_cd3);
	
	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	private static final MCPermColumnInfo _bcst_cd = createColumnInfo("bcst_cd");
	public final MCStringPermColumn bcst_cd = createStringColumn(_bcst_cd);
	
	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	private static final MCPermColumnInfo _rcst_cd = createColumnInfo("rcst_cd");
	public final MCStringPermColumn rcst_cd = createStringColumn(_rcst_cd);
	
	/**
	 * 債権与信管理先ＣＤ. AR credit managed BP cd..<p>
	 *
	 */
	public static final String $ar_cred_cd = "ar_cred_cd";
	private static final MCPermColumnInfo _ar_cred_cd = createColumnInfo("ar_cred_cd");
	public final MCStringPermColumn ar_cred_cd = createStringColumn(_ar_cred_cd);
	
	/**
	 * 請求部門区分. Billing dept. type.<p>
	 *
	 */
	public static final String $bill_dpt_typ = "bill_dpt_typ";
	private static final MCPermColumnInfo _bill_dpt_typ = createColumnInfo("bill_dpt_typ");
	public final MCStringPermColumn bill_dpt_typ = createStringColumn(_bill_dpt_typ);
	
	/**
	 * 請求先担当部門ＣＤ. Billing customer dept. in charge cd..<p>
	 *
	 */
	public static final String $bcst_dpt_cd = "bcst_dpt_cd";
	private static final MCPermColumnInfo _bcst_dpt_cd = createColumnInfo("bcst_dpt_cd");
	public final MCStringPermColumn bcst_dpt_cd = createStringColumn(_bcst_dpt_cd);
	
	/**
	 * 請求締処理区分. Billing closing type.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	private static final MCPermColumnInfo _bill_cl_typ = createColumnInfo("bill_cl_typ");
	public final MCStringPermColumn bill_cl_typ = createStringColumn(_bill_cl_typ);
	
	/**
	 * 請求締日１. Billing closing day 1.<p>
	 *
	 */
	public static final String $bill_cl_day1 = "bill_cl_day1";
	private static final MCPermColumnInfo _bill_cl_day1 = createColumnInfo("bill_cl_day1");
	public final MCNumberPermColumn bill_cl_day1 = createNumberColumn(_bill_cl_day1);
	
	/**
	 * 請求締日２. Billing closing day 2.<p>
	 *
	 */
	public static final String $bill_cl_day2 = "bill_cl_day2";
	private static final MCPermColumnInfo _bill_cl_day2 = createColumnInfo("bill_cl_day2");
	public final MCNumberPermColumn bill_cl_day2 = createNumberColumn(_bill_cl_day2);
	
	/**
	 * 請求締日３. Billing closing day 3.<p>
	 *
	 */
	public static final String $bill_cl_day3 = "bill_cl_day3";
	private static final MCPermColumnInfo _bill_cl_day3 = createColumnInfo("bill_cl_day3");
	public final MCNumberPermColumn bill_cl_day3 = createNumberColumn(_bill_cl_day3);
	
	/**
	 * 請求締日４. Billing closing day 4.<p>
	 *
	 */
	public static final String $bill_cl_day4 = "bill_cl_day4";
	private static final MCPermColumnInfo _bill_cl_day4 = createColumnInfo("bill_cl_day4");
	public final MCNumberPermColumn bill_cl_day4 = createNumberColumn(_bill_cl_day4);
	
	/**
	 * 請求締日５. Billing closing day 5.<p>
	 *
	 */
	public static final String $bill_cl_day5 = "bill_cl_day5";
	private static final MCPermColumnInfo _bill_cl_day5 = createColumnInfo("bill_cl_day5");
	public final MCNumberPermColumn bill_cl_day5 = createNumberColumn(_bill_cl_day5);
	
	/**
	 * 請求税計算ＦＬＧ. Billing tax calculation flg..<p>
	 *
	 */
	public static final String $tax_on_bill_flg = "tax_on_bill_flg";
	private static final MCPermColumnInfo _tax_on_bill_flg = createColumnInfo("tax_on_bill_flg");
	public final MCBooleanPermColumn tax_on_bill_flg = createBooleanColumn(_tax_on_bill_flg);
	
	/**
	 * 請求税額端数処理区分. Billing tax rounding type.<p>
	 *
	 */
	public static final String $bill_tax_rnd_typ = "bill_tax_rnd_typ";
	private static final MCPermColumnInfo _bill_tax_rnd_typ = createColumnInfo("bill_tax_rnd_typ");
	public final MCStringPermColumn bill_tax_rnd_typ = createStringColumn(_bill_tax_rnd_typ);
	
	/**
	 * 請求締遅延日数. Delayed days (Billing closing day).<p>
	 *
	 */
	public static final String $bill_cl_delay_days = "bill_cl_delay_days";
	private static final MCPermColumnInfo _bill_cl_delay_days = createColumnInfo("bill_cl_delay_days");
	public final MCNumberPermColumn bill_cl_delay_days = createNumberColumn(_bill_cl_delay_days);
	
	/**
	 * 請求締前後区分. Billing closing before/after type.<p>
	 *
	 */
	public static final String $bill_cl_ba_typ = "bill_cl_ba_typ";
	private static final MCPermColumnInfo _bill_cl_ba_typ = createColumnInfo("bill_cl_ba_typ");
	public final MCStringPermColumn bill_cl_ba_typ = createStringColumn(_bill_cl_ba_typ);
	
	/**
	 * 売上仮単価締ＦＬＧ. Sales temporary unit price closing flg..<p>
	 *
	 */
	public static final String $sls_interim_cl_flg = "sls_interim_cl_flg";
	private static final MCPermColumnInfo _sls_interim_cl_flg = createColumnInfo("sls_interim_cl_flg");
	public final MCBooleanPermColumn sls_interim_cl_flg = createBooleanColumn(_sls_interim_cl_flg);
	
	/**
	 * 請求先カレンダＣＤ. Billing customer calendar cd..<p>
	 *
	 */
	public static final String $bill_cal_cd = "bill_cal_cd";
	private static final MCPermColumnInfo _bill_cal_cd = createColumnInfo("bill_cal_cd");
	public final MCStringPermColumn bill_cal_cd = createStringColumn(_bill_cal_cd);
	
	/**
	 * 入金予定前後区分. Payment receipt schedule before/after type.<p>
	 *
	 */
	public static final String $rcv_ba_typ = "rcv_ba_typ";
	private static final MCPermColumnInfo _rcv_ba_typ = createColumnInfo("rcv_ba_typ");
	public final MCStringPermColumn rcv_ba_typ = createStringColumn(_rcv_ba_typ);
	
	/**
	 * 請求書送付郵便番号. Invoice send-to zip code.<p>
	 *
	 */
	public static final String $bill_zip_cd = "bill_zip_cd";
	private static final MCPermColumnInfo _bill_zip_cd = createColumnInfo("bill_zip_cd");
	public final MCStringPermColumn bill_zip_cd = createStringColumn(_bill_zip_cd);
	
	/**
	 * 請求書送付住所１. Invoice send-to address 1.<p>
	 *
	 */
	public static final String $bill_addr1 = "bill_addr1";
	private static final MCPermColumnInfo _bill_addr1 = createColumnInfo("bill_addr1");
	public final MCStringPermColumn bill_addr1 = createStringColumn(_bill_addr1);
	
	/**
	 * 請求書送付住所２. Invoice send-to address 2.<p>
	 *
	 */
	public static final String $bill_addr2 = "bill_addr2";
	private static final MCPermColumnInfo _bill_addr2 = createColumnInfo("bill_addr2");
	public final MCStringPermColumn bill_addr2 = createStringColumn(_bill_addr2);
	
	/**
	 * 請求書送付住所３. Invoice send-to address 3.<p>
	 *
	 */
	public static final String $bill_addr3 = "bill_addr3";
	private static final MCPermColumnInfo _bill_addr3 = createColumnInfo("bill_addr3");
	public final MCStringPermColumn bill_addr3 = createStringColumn(_bill_addr3);
	
	/**
	 * 請求書送付住所４. Invoice send-to address 4.<p>
	 *
	 */
	public static final String $bill_addr4 = "bill_addr4";
	private static final MCPermColumnInfo _bill_addr4 = createColumnInfo("bill_addr4");
	public final MCStringPermColumn bill_addr4 = createStringColumn(_bill_addr4);
	
	/**
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public static final String $bill_tel = "bill_tel";
	private static final MCPermColumnInfo _bill_tel = createColumnInfo("bill_tel");
	public final MCStringPermColumn bill_tel = createStringColumn(_bill_tel);
	
	/**
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	private static final MCPermColumnInfo _bill_bcst_nm = createColumnInfo("bill_bcst_nm");
	public final MCStringPermColumn bill_bcst_nm = createStringColumn(_bill_bcst_nm);
	
	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public static final String $bill_bcst_dpt = "bill_bcst_dpt";
	private static final MCPermColumnInfo _bill_bcst_dpt = createColumnInfo("bill_bcst_dpt");
	public final MCStringPermColumn bill_bcst_dpt = createStringColumn(_bill_bcst_dpt);
	
	/**
	 * 請求書送付担当者. Invoice send-to PIC.<p>
	 *
	 */
	public static final String $bill_bcst_psn = "bill_bcst_psn";
	private static final MCPermColumnInfo _bill_bcst_psn = createColumnInfo("bill_bcst_psn");
	public final MCStringPermColumn bill_bcst_psn = createStringColumn(_bill_bcst_psn);
	
	/**
	 * 請求書送付担当者敬称. Invoice send-to PIC honorific.<p>
	 *
	 */
	public static final String $bill_bcst_psn_title = "bill_bcst_psn_title";
	private static final MCPermColumnInfo _bill_bcst_psn_title = createColumnInfo("bill_bcst_psn_title");
	public final MCStringPermColumn bill_bcst_psn_title = createStringColumn(_bill_bcst_psn_title);
	
	/**
	 * 請求書前月残高表示ＦＬＧ. Display balance of previous month on invoice flg..<p>
	 *
	 */
	public static final String $bfw_bal_disp_flg = "bfw_bal_disp_flg";
	private static final MCPermColumnInfo _bfw_bal_disp_flg = createColumnInfo("bfw_bal_disp_flg");
	public final MCBooleanPermColumn bfw_bal_disp_flg = createBooleanColumn(_bfw_bal_disp_flg);
	
	/**
	 * 売上明細書出力区分. Sales details output type.<p>
	 *
	 */
	public static final String $sls_dtl_outp_typ = "sls_dtl_outp_typ";
	private static final MCPermColumnInfo _sls_dtl_outp_typ = createColumnInfo("sls_dtl_outp_typ");
	public final MCStringPermColumn sls_dtl_outp_typ = createStringColumn(_sls_dtl_outp_typ);
	
	/**
	 * 請求書発行区分. Invoice issue type.<p>
	 *
	 */
	public static final String $bill_prnt_typ = "bill_prnt_typ";
	private static final MCPermColumnInfo _bill_prnt_typ = createColumnInfo("bill_prnt_typ");
	public final MCStringPermColumn bill_prnt_typ = createStringColumn(_bill_prnt_typ);
	
	/**
	 * 請求書明細出力ＦＬＧ. Invoice details output flg..<p>
	 *
	 */
	public static final String $bill_dtl_outp_flg = "bill_dtl_outp_flg";
	private static final MCPermColumnInfo _bill_dtl_outp_flg = createColumnInfo("bill_dtl_outp_flg");
	public final MCBooleanPermColumn bill_dtl_outp_flg = createBooleanColumn(_bill_dtl_outp_flg);
	
	/**
	 * 請求書前受金表示ＦＬＧ. Display advance received on invoice.<p>
	 *
	 */
	public static final String $bill_dtl_adv_flg = "bill_dtl_adv_flg";
	private static final MCPermColumnInfo _bill_dtl_adv_flg = createColumnInfo("bill_dtl_adv_flg");
	public final MCBooleanPermColumn bill_dtl_adv_flg = createBooleanColumn(_bill_dtl_adv_flg);
	
	/**
	 * 請求書入金予定表示ＦＬＧ. Display payment receipt schedule in invoice flg..<p>
	 *
	 */
	public static final String $bill_dtl_rcv_flg = "bill_dtl_rcv_flg";
	private static final MCPermColumnInfo _bill_dtl_rcv_flg = createColumnInfo("bill_dtl_rcv_flg");
	public final MCBooleanPermColumn bill_dtl_rcv_flg = createBooleanColumn(_bill_dtl_rcv_flg);
	
	/**
	 * 請求書明細小計区分. Invoice details subtotal type.<p>
	 *
	 */
	public static final String $bill_dtl_subttl_typ = "bill_dtl_subttl_typ";
	private static final MCPermColumnInfo _bill_dtl_subttl_typ = createColumnInfo("bill_dtl_subttl_typ");
	public final MCStringPermColumn bill_dtl_subttl_typ = createStringColumn(_bill_dtl_subttl_typ);
	
	/**
	 * 請求書明細改頁区分. Invoice details page break type.<p>
	 *
	 */
	public static final String $bill_dtl_brk_typ = "bill_dtl_brk_typ";
	private static final MCPermColumnInfo _bill_dtl_brk_typ = createColumnInfo("bill_dtl_brk_typ");
	public final MCStringPermColumn bill_dtl_brk_typ = createStringColumn(_bill_dtl_brk_typ);
	
	/**
	 * 請求書明細並順区分. Invoice details sorting order type.<p>
	 *
	 */
	public static final String $bill_dtl_sort_typ = "bill_dtl_sort_typ";
	private static final MCPermColumnInfo _bill_dtl_sort_typ = createColumnInfo("bill_dtl_sort_typ");
	public final MCStringPermColumn bill_dtl_sort_typ = createStringColumn(_bill_dtl_sort_typ);
	
	/**
	 * 請求書取消伝票表示区分. Invoice cancel slip display type.<p>
	 *
	 */
	public static final String $bill_can_slip_typ = "bill_can_slip_typ";
	private static final MCPermColumnInfo _bill_can_slip_typ = createColumnInfo("bill_can_slip_typ");
	public final MCStringPermColumn bill_can_slip_typ = createStringColumn(_bill_can_slip_typ);
	
	/**
	 * 自動明細消込ＦＬＧ. Details auto-reconciliation flg..<p>
	 *
	 */
	public static final String $auto_line_appl_flg = "auto_line_appl_flg";
	private static final MCPermColumnInfo _auto_line_appl_flg = createColumnInfo("auto_line_appl_flg");
	public final MCBooleanPermColumn auto_line_appl_flg = createBooleanColumn(_auto_line_appl_flg);
	
	/**
	 * 債権相殺グループＣＤ. AR offset group cd..<p>
	 *
	 */
	public static final String $ar_setoff_grp_cd = "ar_setoff_grp_cd";
	private static final MCPermColumnInfo _ar_setoff_grp_cd = createColumnInfo("ar_setoff_grp_cd");
	public final MCStringPermColumn ar_setoff_grp_cd = createStringColumn(_ar_setoff_grp_cd);
	
	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	private static final MCPermColumnInfo _xfr_psn = createColumnInfo("xfr_psn");
	public final MCStringPermColumn xfr_psn = createStringColumn(_xfr_psn);
	
	/**
	 * 入金自動消込対象ＦＬＧ. For auto-reconciliation flg..<p>
	 *
	 */
	public static final String $rcv_auto_appl_tgt_flg = "rcv_auto_appl_tgt_flg";
	private static final MCPermColumnInfo _rcv_auto_appl_tgt_flg = createColumnInfo("rcv_auto_appl_tgt_flg");
	public final MCBooleanPermColumn rcv_auto_appl_tgt_flg = createBooleanColumn(_rcv_auto_appl_tgt_flg);
	
	/**
	 * 金額考慮ＦＬＧ. Match amount flg..<p>
	 *
	 */
	public static final String $rcv_amt_match_flg = "rcv_amt_match_flg";
	private static final MCPermColumnInfo _rcv_amt_match_flg = createColumnInfo("rcv_amt_match_flg");
	public final MCBooleanPermColumn rcv_amt_match_flg = createBooleanColumn(_rcv_amt_match_flg);
	
	/**
	 * 金種考慮ＦＬＧ. Match payment option flg..<p>
	 *
	 */
	public static final String $ar_sttl_typ_match_flg = "ar_sttl_typ_match_flg";
	private static final MCPermColumnInfo _ar_sttl_typ_match_flg = createColumnInfo("ar_sttl_typ_match_flg");
	public final MCBooleanPermColumn ar_sttl_typ_match_flg = createBooleanColumn(_ar_sttl_typ_match_flg);
	
	/**
	 * 手数料計算ＦＬＧ. Fee calculation flg..<p>
	 *
	 */
	public static final String $calc_com_paid_flg = "calc_com_paid_flg";
	private static final MCPermColumnInfo _calc_com_paid_flg = createColumnInfo("calc_com_paid_flg");
	public final MCBooleanPermColumn calc_com_paid_flg = createBooleanColumn(_calc_com_paid_flg);
	
	/**
	 * 自動消込基準日遅延日数. Delayed days (Auto-reconciliation base date).<p>
	 *
	 */
	public static final String $auto_appl_delay_days = "auto_appl_delay_days";
	private static final MCPermColumnInfo _auto_appl_delay_days = createColumnInfo("auto_appl_delay_days");
	public final MCNumberPermColumn auto_appl_delay_days = createNumberColumn(_auto_appl_delay_days);
	
	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	private static final MCPermColumnInfo _asppl_cd = createColumnInfo("asppl_cd");
	public final MCStringPermColumn asppl_cd = createStringColumn(_asppl_cd);
	
	/**
	 * ＶＭＩ購買部門ＣＤ. VMI purchasing dept. cd..<p>
	 *
	 */
	public static final String $vmi_purc_dpt_cd = "vmi_purc_dpt_cd";
	private static final MCPermColumnInfo _vmi_purc_dpt_cd = createColumnInfo("vmi_purc_dpt_cd");
	public final MCStringPermColumn vmi_purc_dpt_cd = createStringColumn(_vmi_purc_dpt_cd);
	
	/**
	 * 下請対象ＦＬＧ. For subcontract flg..<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	private static final MCPermColumnInfo _subcon_flg = createColumnInfo("subcon_flg");
	public final MCBooleanPermColumn subcon_flg = createBooleanColumn(_subcon_flg);
	
	/**
	 * 注文書表示ＣＤ. Display PO sheet cd..<p>
	 *
	 */
	public static final String $po_print_cd = "po_print_cd";
	private static final MCPermColumnInfo _po_print_cd = createColumnInfo("po_print_cd");
	public final MCStringPermColumn po_print_cd = createStringColumn(_po_print_cd);
	
	/**
	 * 発注先納品書ＣＤ. Supplier delivery note cd..<p>
	 *
	 */
	public static final String $sppl_ship_form_cd = "sppl_ship_form_cd";
	private static final MCPermColumnInfo _sppl_ship_form_cd = createColumnInfo("sppl_ship_form_cd");
	public final MCStringPermColumn sppl_ship_form_cd = createStringColumn(_sppl_ship_form_cd);
	
	/**
	 * 発注時納品書ＦＬＧ. Delivery note at P/O flg..<p>
	 *
	 */
	public static final String $po_dlv_slip_flg = "po_dlv_slip_flg";
	private static final MCPermColumnInfo _po_dlv_slip_flg = createColumnInfo("po_dlv_slip_flg");
	public final MCBooleanPermColumn po_dlv_slip_flg = createBooleanColumn(_po_dlv_slip_flg);
	
	/**
	 * 納入指示時納品書ＦＬＧ. Delivery note at delivery order flg..<p>
	 *
	 */
	public static final String $dlv_inst_dlv_slip_flg = "dlv_inst_dlv_slip_flg";
	private static final MCPermColumnInfo _dlv_inst_dlv_slip_flg = createColumnInfo("dlv_inst_dlv_slip_flg");
	public final MCBooleanPermColumn dlv_inst_dlv_slip_flg = createBooleanColumn(_dlv_inst_dlv_slip_flg);
	
	/**
	 * 納期回答受領時納品書ＦＬＧ. Delivery note at receipt of order promising result flg..<p>
	 *
	 */
	public static final String $prms_rcpt_dlv_slip_flg = "prms_rcpt_dlv_slip_flg";
	private static final MCPermColumnInfo _prms_rcpt_dlv_slip_flg = createColumnInfo("prms_rcpt_dlv_slip_flg");
	public final MCBooleanPermColumn prms_rcpt_dlv_slip_flg = createBooleanColumn(_prms_rcpt_dlv_slip_flg);
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	private static final MCPermColumnInfo _pay_crryovr_times = createColumnInfo("pay_crryovr_times");
	public final MCNumberPermColumn pay_crryovr_times = createNumberColumn(_pay_crryovr_times);
	
	/**
	 * 発注先部署. Supplier dept..<p>
	 *
	 */
	public static final String $sppl_cntct_dpt = "sppl_cntct_dpt";
	private static final MCPermColumnInfo _sppl_cntct_dpt = createColumnInfo("sppl_cntct_dpt");
	public final MCStringPermColumn sppl_cntct_dpt = createStringColumn(_sppl_cntct_dpt);
	
	/**
	 * 発注先担当者. Supplier PIC.<p>
	 *
	 */
	public static final String $sppl_cntct_psn = "sppl_cntct_psn";
	private static final MCPermColumnInfo _sppl_cntct_psn = createColumnInfo("sppl_cntct_psn");
	public final MCStringPermColumn sppl_cntct_psn = createStringColumn(_sppl_cntct_psn);
	
	/**
	 * 発注先担当者敬称. Supplier PIC form of address.<p>
	 *
	 */
	public static final String $sppl_cntct_psn_title = "sppl_cntct_psn_title";
	private static final MCPermColumnInfo _sppl_cntct_psn_title = createColumnInfo("sppl_cntct_psn_title");
	public final MCStringPermColumn sppl_cntct_psn_title = createStringColumn(_sppl_cntct_psn_title);
	
	/**
	 * 購買単価取得区分. Purchase unit price acquisition type.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	private static final MCPermColumnInfo _purc_upri_req_typ = createColumnInfo("purc_upri_req_typ");
	public final MCStringPermColumn purc_upri_req_typ = createStringColumn(_purc_upri_req_typ);
	
	/**
	 * 購買単価変更許可ＦＬＧ. Allow purchasing unit price change flg..<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	private static final MCPermColumnInfo _purc_upri_cng_flg = createColumnInfo("purc_upri_cng_flg");
	public final MCBooleanPermColumn purc_upri_cng_flg = createBooleanColumn(_purc_upri_cng_flg);
	
	/**
	 * 仕入金額端数処理区分. Rounding type (Purchase amount).<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	private static final MCPermColumnInfo _purc_amt_rnd_typ = createColumnInfo("purc_amt_rnd_typ");
	public final MCStringPermColumn purc_amt_rnd_typ = createStringColumn(_purc_amt_rnd_typ);
	
	/**
	 * 仕入税額端数処理区分. Rounding type (Purchase tax).<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	private static final MCPermColumnInfo _purc_tax_rnd_typ = createColumnInfo("purc_tax_rnd_typ");
	public final MCStringPermColumn purc_tax_rnd_typ = createStringColumn(_purc_tax_rnd_typ);
	
	/**
	 * 仕入税計算区分. Purchase tax calculation type.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	private static final MCPermColumnInfo _purc_tax_calc_typ = createColumnInfo("purc_tax_calc_typ");
	public final MCStringPermColumn purc_tax_calc_typ = createStringColumn(_purc_tax_calc_typ);
	
	/**
	 * 仕入税ＣＤ. Purchase tax cd..<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	private static final MCPermColumnInfo _purc_tax_cd = createColumnInfo("purc_tax_cd");
	public final MCStringPermColumn purc_tax_cd = createStringColumn(_purc_tax_cd);
	
	/**
	 * 仕入税優先ＦＬＧ. Purchase tax priority flg..<p>
	 *
	 */
	public static final String $purc_tax_cd_prio_flg = "purc_tax_cd_prio_flg";
	private static final MCPermColumnInfo _purc_tax_cd_prio_flg = createColumnInfo("purc_tax_cd_prio_flg");
	public final MCBooleanPermColumn purc_tax_cd_prio_flg = createBooleanColumn(_purc_tax_cd_prio_flg);
	
	/**
	 * 案件別注文書ＦＬＧ. PO sheet by sales project flg..<p>
	 *
	 */
	public static final String $wrk_po_flg = "wrk_po_flg";
	private static final MCPermColumnInfo _wrk_po_flg = createColumnInfo("wrk_po_flg");
	public final MCBooleanPermColumn wrk_po_flg = createBooleanColumn(_wrk_po_flg);
	
	/**
	 * 案件別債務管理ＦＬＧ. AP management by sales project flg..<p>
	 *
	 */
	public static final String $wrk_ap_flg = "wrk_ap_flg";
	private static final MCPermColumnInfo _wrk_ap_flg = createColumnInfo("wrk_ap_flg");
	public final MCBooleanPermColumn wrk_ap_flg = createBooleanColumn(_wrk_ap_flg);
	
	/**
	 * 仕入ロット明細分割区分. Purchase lot details split type.<p>
	 *
	 */
	public static final String $purc_slip_each_lot_typ = "purc_slip_each_lot_typ";
	private static final MCPermColumnInfo _purc_slip_each_lot_typ = createColumnInfo("purc_slip_each_lot_typ");
	public final MCStringPermColumn purc_slip_each_lot_typ = createStringColumn(_purc_slip_each_lot_typ);
	
	/**
	 * 支給積送管理区分. In-transit supply management type.<p>
	 *
	 */
	public static final String $prov_rcv_typ = "prov_rcv_typ";
	private static final MCPermColumnInfo _prov_rcv_typ = createColumnInfo("prov_rcv_typ");
	public final MCStringPermColumn prov_rcv_typ = createStringColumn(_prov_rcv_typ);
	
	/**
	 * 有償支給先ＦＬＧ. Chargeable supplier flg..<p>
	 *
	 */
	public static final String $onr_prsppl_flg = "onr_prsppl_flg";
	private static final MCPermColumnInfo _onr_prsppl_flg = createColumnInfo("onr_prsppl_flg");
	public final MCBooleanPermColumn onr_prsppl_flg = createBooleanColumn(_onr_prsppl_flg);
	
	/**
	 * 外注単価区分. Subcontracting unit price type.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
	private static final MCPermColumnInfo _outsrc_upri_typ = createColumnInfo("outsrc_upri_typ");
	public final MCStringPermColumn outsrc_upri_typ = createStringColumn(_outsrc_upri_typ);
	
	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	private static final MCPermColumnInfo _prov_basis_typ = createColumnInfo("prov_basis_typ");
	public final MCStringPermColumn prov_basis_typ = createStringColumn(_prov_basis_typ);
	
	/**
	 * 支給単価変更許可ＦＬＧ. Allow supply unit price change flg..<p>
	 *
	 */
	public static final String $prov_upri_cng_flg = "prov_upri_cng_flg";
	private static final MCPermColumnInfo _prov_upri_cng_flg = createColumnInfo("prov_upri_cng_flg");
	public final MCBooleanPermColumn prov_upri_cng_flg = createBooleanColumn(_prov_upri_cng_flg);
	
	/**
	 * 支給金額端数処理区分. Supply amount rounding type.<p>
	 *
	 */
	public static final String $prov_amt_rnd_typ = "prov_amt_rnd_typ";
	private static final MCPermColumnInfo _prov_amt_rnd_typ = createColumnInfo("prov_amt_rnd_typ");
	public final MCStringPermColumn prov_amt_rnd_typ = createStringColumn(_prov_amt_rnd_typ);
	
	/**
	 * 支給税額端数処理区分. Supply tax rounding type.<p>
	 *
	 */
	public static final String $prov_tax_rnd_typ = "prov_tax_rnd_typ";
	private static final MCPermColumnInfo _prov_tax_rnd_typ = createColumnInfo("prov_tax_rnd_typ");
	public final MCStringPermColumn prov_tax_rnd_typ = createStringColumn(_prov_tax_rnd_typ);
	
	/**
	 * 支給税計算区分. Supply tax calculation type.<p>
	 *
	 */
	public static final String $prov_tax_calc_typ = "prov_tax_calc_typ";
	private static final MCPermColumnInfo _prov_tax_calc_typ = createColumnInfo("prov_tax_calc_typ");
	public final MCStringPermColumn prov_tax_calc_typ = createStringColumn(_prov_tax_calc_typ);
	
	/**
	 * 支給税ＣＤ. Supply tax cd..<p>
	 *
	 */
	public static final String $prov_tax_cd = "prov_tax_cd";
	private static final MCPermColumnInfo _prov_tax_cd = createColumnInfo("prov_tax_cd");
	public final MCStringPermColumn prov_tax_cd = createStringColumn(_prov_tax_cd);
	
	/**
	 * 支給税優先ＦＬＧ. Supply tax priority flg..<p>
	 *
	 */
	public static final String $prov_tax_cd_prio_flg = "prov_tax_cd_prio_flg";
	private static final MCPermColumnInfo _prov_tax_cd_prio_flg = createColumnInfo("prov_tax_cd_prio_flg");
	public final MCBooleanPermColumn prov_tax_cd_prio_flg = createBooleanColumn(_prov_tax_cd_prio_flg);
	
	/**
	 * 発注先カレンダＣＤ. Supplier calendar cd..<p>
	 *
	 */
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	private static final MCPermColumnInfo _sppl_cal_cd = createColumnInfo("sppl_cal_cd");
	public final MCStringPermColumn sppl_cal_cd = createStringColumn(_sppl_cal_cd);
	
	/**
	 * 発注先インボイス取引ＦＬＧ. Supplier invoice transaction flg..<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	private static final MCPermColumnInfo _sppl_iv_flg = createColumnInfo("sppl_iv_flg");
	public final MCBooleanPermColumn sppl_iv_flg = createBooleanColumn(_sppl_iv_flg);
	
	/**
	 * 受領インボイス重複許可ＦＬＧ. Allow purchase invoice duplication flg..<p>
	 *
	 */
	public static final String $rcpt_iv_dup_flg = "rcpt_iv_dup_flg";
	private static final MCPermColumnInfo _rcpt_iv_dup_flg = createColumnInfo("rcpt_iv_dup_flg");
	public final MCBooleanPermColumn rcpt_iv_dup_flg = createBooleanColumn(_rcpt_iv_dup_flg);
	
	/**
	 * 納期回答確認ＦＬＧ. Order promising check flg..<p>
	 *
	 */
	public static final String $prms_recv_flg = "prms_recv_flg";
	private static final MCPermColumnInfo _prms_recv_flg = createColumnInfo("prms_recv_flg");
	public final MCBooleanPermColumn prms_recv_flg = createBooleanColumn(_prms_recv_flg);
	
	/**
	 * 発注先取引条件ＣＤ１. Supplier transaction terms cd. 1.<p>
	 *
	 */
	public static final String $sppl_tterm_cd1 = "sppl_tterm_cd1";
	private static final MCPermColumnInfo _sppl_tterm_cd1 = createColumnInfo("sppl_tterm_cd1");
	public final MCStringPermColumn sppl_tterm_cd1 = createStringColumn(_sppl_tterm_cd1);
	
	/**
	 * 発注先取引条件ＣＤ２. Supplier transaction terms cd. 2.<p>
	 *
	 */
	public static final String $sppl_tterm_cd2 = "sppl_tterm_cd2";
	private static final MCPermColumnInfo _sppl_tterm_cd2 = createColumnInfo("sppl_tterm_cd2");
	public final MCStringPermColumn sppl_tterm_cd2 = createStringColumn(_sppl_tterm_cd2);
	
	/**
	 * 発注先取引条件ＣＤ３. Supplier transaction terms cd. 3.<p>
	 *
	 */
	public static final String $sppl_tterm_cd3 = "sppl_tterm_cd3";
	private static final MCPermColumnInfo _sppl_tterm_cd3 = createColumnInfo("sppl_tterm_cd3");
	public final MCStringPermColumn sppl_tterm_cd3 = createStringColumn(_sppl_tterm_cd3);
	
	/**
	 * 仕入計上区分. Purchase recording type.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	private static final MCPermColumnInfo _purc_basis_typ = createColumnInfo("purc_basis_typ");
	public final MCStringPermColumn purc_basis_typ = createStringColumn(_purc_basis_typ);
	
	/**
	 * 買戻義務ＦＬＧ. Repurchase obligation flg..<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	private static final MCPermColumnInfo _repurc_obli_flg = createColumnInfo("repurc_obli_flg");
	public final MCBooleanPermColumn repurc_obli_flg = createBooleanColumn(_repurc_obli_flg);
	
	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	private static final MCPermColumnInfo _bsppl_cd = createColumnInfo("bsppl_cd");
	public final MCStringPermColumn bsppl_cd = createStringColumn(_bsppl_cd);
	
	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	private static final MCPermColumnInfo _ap_dpt_cd = createColumnInfo("ap_dpt_cd");
	public final MCStringPermColumn ap_dpt_cd = createStringColumn(_ap_dpt_cd);
	
	/**
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	private static final MCPermColumnInfo _psppl_cd = createColumnInfo("psppl_cd");
	public final MCStringPermColumn psppl_cd = createStringColumn(_psppl_cd);
	
	/**
	 * 債務与信管理先ＣＤ. AP credit managed BP cd..<p>
	 *
	 */
	public static final String $ap_cred_cd = "ap_cred_cd";
	private static final MCPermColumnInfo _ap_cred_cd = createColumnInfo("ap_cred_cd");
	public final MCStringPermColumn ap_cred_cd = createStringColumn(_ap_cred_cd);
	
	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	private static final MCPermColumnInfo _bsppl_dpt_cd = createColumnInfo("bsppl_dpt_cd");
	public final MCStringPermColumn bsppl_dpt_cd = createStringColumn(_bsppl_dpt_cd);
	
	/**
	 * 都度支払ＦＬＧ. Payment per transaction flg..<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	private static final MCPermColumnInfo _pay_spot_flg = createColumnInfo("pay_spot_flg");
	public final MCBooleanPermColumn pay_spot_flg = createBooleanColumn(_pay_spot_flg);
	
	/**
	 * 支払締日１. Payment closing date 1.<p>
	 *
	 */
	public static final String $psppl_cl_day1 = "psppl_cl_day1";
	private static final MCPermColumnInfo _psppl_cl_day1 = createColumnInfo("psppl_cl_day1");
	public final MCNumberPermColumn psppl_cl_day1 = createNumberColumn(_psppl_cl_day1);
	
	/**
	 * 支払締日２. Payment closing date 2.<p>
	 *
	 */
	public static final String $psppl_cl_day2 = "psppl_cl_day2";
	private static final MCPermColumnInfo _psppl_cl_day2 = createColumnInfo("psppl_cl_day2");
	public final MCNumberPermColumn psppl_cl_day2 = createNumberColumn(_psppl_cl_day2);
	
	/**
	 * 支払締日３. Payment closing date 3.<p>
	 *
	 */
	public static final String $psppl_cl_day3 = "psppl_cl_day3";
	private static final MCPermColumnInfo _psppl_cl_day3 = createColumnInfo("psppl_cl_day3");
	public final MCNumberPermColumn psppl_cl_day3 = createNumberColumn(_psppl_cl_day3);
	
	/**
	 * 支払締日４. Payment closing date 4.<p>
	 *
	 */
	public static final String $psppl_cl_day4 = "psppl_cl_day4";
	private static final MCPermColumnInfo _psppl_cl_day4 = createColumnInfo("psppl_cl_day4");
	public final MCNumberPermColumn psppl_cl_day4 = createNumberColumn(_psppl_cl_day4);
	
	/**
	 * 支払締日５. Payment closing date 5.<p>
	 *
	 */
	public static final String $psppl_cl_day5 = "psppl_cl_day5";
	private static final MCPermColumnInfo _psppl_cl_day5 = createColumnInfo("psppl_cl_day5");
	public final MCNumberPermColumn psppl_cl_day5 = createNumberColumn(_psppl_cl_day5);
	
	/**
	 * 仕入仮単価締ＦＬＧ. Purchase temporary unit price closing flg..<p>
	 *
	 */
	public static final String $purc_interim_cl_flg = "purc_interim_cl_flg";
	private static final MCPermColumnInfo _purc_interim_cl_flg = createColumnInfo("purc_interim_cl_flg");
	public final MCBooleanPermColumn purc_interim_cl_flg = createBooleanColumn(_purc_interim_cl_flg);
	
	/**
	 * 債務相殺グループＣＤ. AP offset group cd..<p>
	 *
	 */
	public static final String $ap_setoff_grp_cd = "ap_setoff_grp_cd";
	private static final MCPermColumnInfo _ap_setoff_grp_cd = createColumnInfo("ap_setoff_grp_cd");
	public final MCStringPermColumn ap_setoff_grp_cd = createStringColumn(_ap_setoff_grp_cd);
	
	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	private static final MCPermColumnInfo _pay_bank_ac_cd = createColumnInfo("pay_bank_ac_cd");
	public final MCStringPermColumn pay_bank_ac_cd = createStringColumn(_pay_bank_ac_cd);
	
	/**
	 * 支払予定前後区分. Payment schedule before/after type.<p>
	 *
	 */
	public static final String $pay_schd_ba_typ = "pay_schd_ba_typ";
	private static final MCPermColumnInfo _pay_schd_ba_typ = createColumnInfo("pay_schd_ba_typ");
	public final MCStringPermColumn pay_schd_ba_typ = createStringColumn(_pay_schd_ba_typ);
	
	/**
	 * 支払税計算ＦＬＧ. Payment tax calculation flg..<p>
	 *
	 */
	public static final String $tax_on_pay_flg = "tax_on_pay_flg";
	private static final MCPermColumnInfo _tax_on_pay_flg = createColumnInfo("tax_on_pay_flg");
	public final MCBooleanPermColumn tax_on_pay_flg = createBooleanColumn(_tax_on_pay_flg);
	
	/**
	 * 支払税額端数処理区分. Payment tax amount rounding type.<p>
	 *
	 */
	public static final String $pay_tax_rnd_typ = "pay_tax_rnd_typ";
	private static final MCPermColumnInfo _pay_tax_rnd_typ = createColumnInfo("pay_tax_rnd_typ");
	public final MCStringPermColumn pay_tax_rnd_typ = createStringColumn(_pay_tax_rnd_typ);
	
	/**
	 * バッチ支払予定締ＦＬＧ. Batch payment schedule closing flg..<p>
	 *
	 */
	public static final String $batch_pay_schd_cl_flg = "batch_pay_schd_cl_flg";
	private static final MCPermColumnInfo _batch_pay_schd_cl_flg = createColumnInfo("batch_pay_schd_cl_flg");
	public final MCBooleanPermColumn batch_pay_schd_cl_flg = createBooleanColumn(_batch_pay_schd_cl_flg);
	
	/**
	 * 支払予定締遅延日数. Payment schedule closing delay days.<p>
	 *
	 */
	public static final String $pay_schd_cl_delay_days = "pay_schd_cl_delay_days";
	private static final MCPermColumnInfo _pay_schd_cl_delay_days = createColumnInfo("pay_schd_cl_delay_days");
	public final MCNumberPermColumn pay_schd_cl_delay_days = createNumberColumn(_pay_schd_cl_delay_days);
	
	/**
	 * 支払予定締前後区分. Payment schedule closing before/after type.<p>
	 *
	 */
	public static final String $pay_schd_cl_ba_typ = "pay_schd_cl_ba_typ";
	private static final MCPermColumnInfo _pay_schd_cl_ba_typ = createColumnInfo("pay_schd_cl_ba_typ");
	public final MCStringPermColumn pay_schd_cl_ba_typ = createStringColumn(_pay_schd_cl_ba_typ);
	
	/**
	 * 事業者ＮＯ. Business No..<p>
	 *
	 */
	public static final String $biz_co_no = "biz_co_no";
	private static final MCPermColumnInfo _biz_co_no = createColumnInfo("biz_co_no");
	public final MCStringPermColumn biz_co_no = createStringColumn(_biz_co_no);
	
	/**
	 * 支払通知書発行対象ＦＬＧ. Payment notice to be issued flg..<p>
	 *
	 */
	public static final String $pay_ntc_prnt_flg = "pay_ntc_prnt_flg";
	private static final MCPermColumnInfo _pay_ntc_prnt_flg = createColumnInfo("pay_ntc_prnt_flg");
	public final MCBooleanPermColumn pay_ntc_prnt_flg = createBooleanColumn(_pay_ntc_prnt_flg);
	
	/**
	 * 支払通知書送付郵便番号. Payment notice send-to zip code.<p>
	 *
	 */
	public static final String $pay_ntc_zip_cd = "pay_ntc_zip_cd";
	private static final MCPermColumnInfo _pay_ntc_zip_cd = createColumnInfo("pay_ntc_zip_cd");
	public final MCStringPermColumn pay_ntc_zip_cd = createStringColumn(_pay_ntc_zip_cd);
	
	/**
	 * 支払通知書送付住所１. Payment notice send-to address 1.<p>
	 *
	 */
	public static final String $pay_ntc_addr1 = "pay_ntc_addr1";
	private static final MCPermColumnInfo _pay_ntc_addr1 = createColumnInfo("pay_ntc_addr1");
	public final MCStringPermColumn pay_ntc_addr1 = createStringColumn(_pay_ntc_addr1);
	
	/**
	 * 支払通知書送付住所２. Payment notice send-to address 2.<p>
	 *
	 */
	public static final String $pay_ntc_addr2 = "pay_ntc_addr2";
	private static final MCPermColumnInfo _pay_ntc_addr2 = createColumnInfo("pay_ntc_addr2");
	public final MCStringPermColumn pay_ntc_addr2 = createStringColumn(_pay_ntc_addr2);
	
	/**
	 * 支払通知書送付住所３. Payment notice send-to address 3.<p>
	 *
	 */
	public static final String $pay_ntc_addr3 = "pay_ntc_addr3";
	private static final MCPermColumnInfo _pay_ntc_addr3 = createColumnInfo("pay_ntc_addr3");
	public final MCStringPermColumn pay_ntc_addr3 = createStringColumn(_pay_ntc_addr3);
	
	/**
	 * 支払通知書送付住所４. Payment notice send-to address 4.<p>
	 *
	 */
	public static final String $pay_ntc_addr4 = "pay_ntc_addr4";
	private static final MCPermColumnInfo _pay_ntc_addr4 = createColumnInfo("pay_ntc_addr4");
	public final MCStringPermColumn pay_ntc_addr4 = createStringColumn(_pay_ntc_addr4);
	
	/**
	 * 支払通知書宛先. Payment notice destination.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_nm = "pay_ntc_bsppl_nm";
	private static final MCPermColumnInfo _pay_ntc_bsppl_nm = createColumnInfo("pay_ntc_bsppl_nm");
	public final MCStringPermColumn pay_ntc_bsppl_nm = createStringColumn(_pay_ntc_bsppl_nm);
	
	/**
	 * 支払通知書送付部署. Payment notice send-to dept..<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_dpt = "pay_ntc_bsppl_dpt";
	private static final MCPermColumnInfo _pay_ntc_bsppl_dpt = createColumnInfo("pay_ntc_bsppl_dpt");
	public final MCStringPermColumn pay_ntc_bsppl_dpt = createStringColumn(_pay_ntc_bsppl_dpt);
	
	/**
	 * 支払通知書送付担当者. Payment notice send-to PIC.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_psn = "pay_ntc_bsppl_psn";
	private static final MCPermColumnInfo _pay_ntc_bsppl_psn = createColumnInfo("pay_ntc_bsppl_psn");
	public final MCStringPermColumn pay_ntc_bsppl_psn = createStringColumn(_pay_ntc_bsppl_psn);
	
	/**
	 * 支払通知書送付担当者敬称. Payment notice send-to PIC honorific title.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_psn_title = "pay_ntc_bsppl_psn_title";
	private static final MCPermColumnInfo _pay_ntc_bsppl_psn_title = createColumnInfo("pay_ntc_bsppl_psn_title");
	public final MCStringPermColumn pay_ntc_bsppl_psn_title = createStringColumn(_pay_ntc_bsppl_psn_title);
	
	/**
	 * 支払通知書送付ＴＥＬ. Payment notice send-to TEL.<p>
	 *
	 */
	public static final String $pay_ntc_tel = "pay_ntc_tel";
	private static final MCPermColumnInfo _pay_ntc_tel = createColumnInfo("pay_ntc_tel");
	public final MCStringPermColumn pay_ntc_tel = createStringColumn(_pay_ntc_tel);
	
	/**
	 * 支払通知書明細出力ＦＬＧ. Output payment notice details flg..<p>
	 *
	 */
	public static final String $pay_ntc_dtl_outp_flg = "pay_ntc_dtl_outp_flg";
	private static final MCPermColumnInfo _pay_ntc_dtl_outp_flg = createColumnInfo("pay_ntc_dtl_outp_flg");
	public final MCBooleanPermColumn pay_ntc_dtl_outp_flg = createBooleanColumn(_pay_ntc_dtl_outp_flg);
	
	/**
	 * 支払通知書前月残高表示ＦＬＧ. Display balance of previous month on payment notice flg..<p>
	 *
	 */
	public static final String $pay_ntc_bfw_bal_disp_flg = "pay_ntc_bfw_bal_disp_flg";
	private static final MCPermColumnInfo _pay_ntc_bfw_bal_disp_flg = createColumnInfo("pay_ntc_bfw_bal_disp_flg");
	public final MCBooleanPermColumn pay_ntc_bfw_bal_disp_flg = createBooleanColumn(_pay_ntc_bfw_bal_disp_flg);
	
	/**
	 * 支払通知書前渡金表示ＦＬＧ. Display advance payment on payment notice flg..<p>
	 *
	 */
	public static final String $pay_ntc_adv_pay_flg = "pay_ntc_adv_pay_flg";
	private static final MCPermColumnInfo _pay_ntc_adv_pay_flg = createColumnInfo("pay_ntc_adv_pay_flg");
	public final MCBooleanPermColumn pay_ntc_adv_pay_flg = createBooleanColumn(_pay_ntc_adv_pay_flg);
	
	/**
	 * 支払通知書支払予定表示ＦＬＧ. Display payment schedule on payment notice flg..<p>
	 *
	 */
	public static final String $pay_ntc_dtl_pay_flg = "pay_ntc_dtl_pay_flg";
	private static final MCPermColumnInfo _pay_ntc_dtl_pay_flg = createColumnInfo("pay_ntc_dtl_pay_flg");
	public final MCBooleanPermColumn pay_ntc_dtl_pay_flg = createBooleanColumn(_pay_ntc_dtl_pay_flg);
	
	/**
	 * 支払通知書明細小計区分. Payment notice details subtotal type.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_subttl_typ = "pay_ntc_dtl_subttl_typ";
	private static final MCPermColumnInfo _pay_ntc_dtl_subttl_typ = createColumnInfo("pay_ntc_dtl_subttl_typ");
	public final MCStringPermColumn pay_ntc_dtl_subttl_typ = createStringColumn(_pay_ntc_dtl_subttl_typ);
	
	/**
	 * 支払通知書明細改頁区分. Payment notice details page break type.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_brk_typ = "pay_ntc_dtl_brk_typ";
	private static final MCPermColumnInfo _pay_ntc_dtl_brk_typ = createColumnInfo("pay_ntc_dtl_brk_typ");
	public final MCStringPermColumn pay_ntc_dtl_brk_typ = createStringColumn(_pay_ntc_dtl_brk_typ);
	
	/**
	 * 支払通知書明細並順区分. Payment notice details sorting order type.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_sort_typ = "pay_ntc_dtl_sort_typ";
	private static final MCPermColumnInfo _pay_ntc_dtl_sort_typ = createColumnInfo("pay_ntc_dtl_sort_typ");
	public final MCStringPermColumn pay_ntc_dtl_sort_typ = createStringColumn(_pay_ntc_dtl_sort_typ);
	
	/**
	 * 支払通知書取消伝票表示区分. Payment notice cancel slip display type.<p>
	 *
	 */
	public static final String $pay_ntc_can_slip_typ = "pay_ntc_can_slip_typ";
	private static final MCPermColumnInfo _pay_ntc_can_slip_typ = createColumnInfo("pay_ntc_can_slip_typ");
	public final MCStringPermColumn pay_ntc_can_slip_typ = createStringColumn(_pay_ntc_can_slip_typ);
	
	/**
	 * 支払先備考. Payee remarks.<p>
	 *
	 */
	public static final String $psppl_rmrks = "psppl_rmrks";
	private static final MCPermColumnInfo _psppl_rmrks = createColumnInfo("psppl_rmrks");
	public final MCStringPermColumn psppl_rmrks = createStringColumn(_psppl_rmrks);
	
	/**
	 * 手形サイト上限. Note sight upper limit.<p>
	 *
	 */
	public static final String $note_days = "note_days";
	private static final MCPermColumnInfo _note_days = createColumnInfo("note_days");
	public final MCNumberPermColumn note_days = createNumberColumn(_note_days);
	
	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public static final String $pay_dpt_cd = "pay_dpt_cd";
	private static final MCPermColumnInfo _pay_dpt_cd = createColumnInfo("pay_dpt_cd");
	public final MCStringPermColumn pay_dpt_cd = createStringColumn(_pay_dpt_cd);
	
	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	private static final MCPermColumnInfo _dlv_sundry_flg = createColumnInfo("dlv_sundry_flg");
	public final MCBooleanPermColumn dlv_sundry_flg = createBooleanColumn(_dlv_sundry_flg);
	
	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	private static final MCPermColumnInfo _dlv_cntct_dpt = createColumnInfo("dlv_cntct_dpt");
	public final MCStringPermColumn dlv_cntct_dpt = createStringColumn(_dlv_cntct_dpt);
	
	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	private static final MCPermColumnInfo _dlv_cntct_psn = createColumnInfo("dlv_cntct_psn");
	public final MCStringPermColumn dlv_cntct_psn = createStringColumn(_dlv_cntct_psn);
	
	/**
	 * 納品先担当者敬称. Delivery destination PIC honorific.<p>
	 *
	 */
	public static final String $dlv_cntct_psn_title = "dlv_cntct_psn_title";
	private static final MCPermColumnInfo _dlv_cntct_psn_title = createColumnInfo("dlv_cntct_psn_title");
	public final MCStringPermColumn dlv_cntct_psn_title = createStringColumn(_dlv_cntct_psn_title);
	
	/**
	 * 価格印字ＦＬＧ. Print price flg..<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	private static final MCPermColumnInfo _pri_prnt_flg = createColumnInfo("pri_prnt_flg");
	public final MCBooleanPermColumn pri_prnt_flg = createBooleanColumn(_pri_prnt_flg);
	
	/**
	 * 貸出在庫棚卸対象ＦＬＧ. For consignment inventory count flg..<p>
	 *
	 */
	public static final String $cnsgn_stktk_flg = "cnsgn_stktk_flg";
	private static final MCPermColumnInfo _cnsgn_stktk_flg = createColumnInfo("cnsgn_stktk_flg");
	public final MCBooleanPermColumn cnsgn_stktk_flg = createBooleanColumn(_cnsgn_stktk_flg);
	
	/**
	 * 配送先ＦＬＧ. Receiving point flg..<p>
	 *
	 */
	public static final String $tdlv_flg = "tdlv_flg";
	private static final MCPermColumnInfo _tdlv_flg = createColumnInfo("tdlv_flg");
	public final MCBooleanPermColumn tdlv_flg = createBooleanColumn(_tdlv_flg);
	
	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	private static final MCPermColumnInfo _via_dlv_typ = createColumnInfo("via_dlv_typ");
	public final MCStringPermColumn via_dlv_typ = createStringColumn(_via_dlv_typ);
	
	/**
	 * 配送先必須ＦＬＧ. Receiving point required flg..<p>
	 *
	 */
	public static final String $tdlv_req_flg = "tdlv_req_flg";
	private static final MCPermColumnInfo _tdlv_req_flg = createColumnInfo("tdlv_req_flg");
	public final MCBooleanPermColumn tdlv_req_flg = createBooleanColumn(_tdlv_req_flg);
	
	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	private static final MCPermColumnInfo _lg_grp_cd = createColumnInfo("lg_grp_cd");
	public final MCStringPermColumn lg_grp_cd = createStringColumn(_lg_grp_cd);
	
	/**
	 * 納品先カレンダＣＤ. Delivery destination calendar cd..<p>
	 *
	 */
	public static final String $dlv_cal_cd = "dlv_cal_cd";
	private static final MCPermColumnInfo _dlv_cal_cd = createColumnInfo("dlv_cal_cd");
	public final MCStringPermColumn dlv_cal_cd = createStringColumn(_dlv_cal_cd);
	
	/**
	 * 納品先チャネル１. Delivery destination channel 1.<p>
	 *
	 */
	public static final String $dlv_chnnl1 = "dlv_chnnl1";
	private static final MCPermColumnInfo _dlv_chnnl1 = createColumnInfo("dlv_chnnl1");
	public final MCStringPermColumn dlv_chnnl1 = createStringColumn(_dlv_chnnl1);
	
	/**
	 * 納品先チャネル２. Delivery destination channel 2.<p>
	 *
	 */
	public static final String $dlv_chnnl2 = "dlv_chnnl2";
	private static final MCPermColumnInfo _dlv_chnnl2 = createColumnInfo("dlv_chnnl2");
	public final MCStringPermColumn dlv_chnnl2 = createStringColumn(_dlv_chnnl2);
	
	/**
	 * 納品先チャネル３. Delivery destination channel 3.<p>
	 *
	 */
	public static final String $dlv_chnnl3 = "dlv_chnnl3";
	private static final MCPermColumnInfo _dlv_chnnl3 = createColumnInfo("dlv_chnnl3");
	public final MCStringPermColumn dlv_chnnl3 = createStringColumn(_dlv_chnnl3);
	
	/**
	 * 帳票発行区分（得意先）. Slip issue type (Customer).<p>
	 *
	 */
	public static final String $cst_prnt_typ = "cst_prnt_typ";
	private static final MCPermColumnInfo _cst_prnt_typ = createColumnInfo("cst_prnt_typ");
	public final MCStringPermColumn cst_prnt_typ = createStringColumn(_cst_prnt_typ);
	
	/**
	 * 帳票発行区分（売掛先）. Slip issue type (AR customer).<p>
	 *
	 */
	public static final String $acst_prnt_typ = "acst_prnt_typ";
	private static final MCPermColumnInfo _acst_prnt_typ = createColumnInfo("acst_prnt_typ");
	public final MCStringPermColumn acst_prnt_typ = createStringColumn(_acst_prnt_typ);
	
	/**
	 * 帳票発行区分（請求先）. Slip issue type (Billing customer).<p>
	 *
	 */
	public static final String $bcst_prnt_typ = "bcst_prnt_typ";
	private static final MCPermColumnInfo _bcst_prnt_typ = createColumnInfo("bcst_prnt_typ");
	public final MCStringPermColumn bcst_prnt_typ = createStringColumn(_bcst_prnt_typ);
	
	/**
	 * 帳票発行区分（入金先）. Slip issue type (Payer).<p>
	 *
	 */
	public static final String $rcst_prnt_typ = "rcst_prnt_typ";
	private static final MCPermColumnInfo _rcst_prnt_typ = createColumnInfo("rcst_prnt_typ");
	public final MCStringPermColumn rcst_prnt_typ = createStringColumn(_rcst_prnt_typ);
	
	/**
	 * 帳票発行区分（発注先）. Slip issue type (Supplier).<p>
	 *
	 */
	public static final String $sppl_prnt_typ = "sppl_prnt_typ";
	private static final MCPermColumnInfo _sppl_prnt_typ = createColumnInfo("sppl_prnt_typ");
	public final MCStringPermColumn sppl_prnt_typ = createStringColumn(_sppl_prnt_typ);
	
	/**
	 * 帳票発行区分（買掛先）. Slip issue type (AP supplier).<p>
	 *
	 */
	public static final String $asppl_prnt_typ = "asppl_prnt_typ";
	private static final MCPermColumnInfo _asppl_prnt_typ = createColumnInfo("asppl_prnt_typ");
	public final MCStringPermColumn asppl_prnt_typ = createStringColumn(_asppl_prnt_typ);
	
	/**
	 * 帳票発行区分（支払予定管理先）. Slip issue type (Scheduled payee).<p>
	 *
	 */
	public static final String $bsppl_prnt_typ = "bsppl_prnt_typ";
	private static final MCPermColumnInfo _bsppl_prnt_typ = createColumnInfo("bsppl_prnt_typ");
	public final MCStringPermColumn bsppl_prnt_typ = createStringColumn(_bsppl_prnt_typ);
	
	/**
	 * 帳票発行区分（支払先）. Slip issue type (Payee).<p>
	 *
	 */
	public static final String $psppl_prnt_typ = "psppl_prnt_typ";
	private static final MCPermColumnInfo _psppl_prnt_typ = createColumnInfo("psppl_prnt_typ");
	public final MCStringPermColumn psppl_prnt_typ = createStringColumn(_psppl_prnt_typ);
	
	/**
	 * 帳票発行区分（納品先）. Slip issue type (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_prnt_typ = "dlv_prnt_typ";
	private static final MCPermColumnInfo _dlv_prnt_typ = createColumnInfo("dlv_prnt_typ");
	public final MCStringPermColumn dlv_prnt_typ = createStringColumn(_dlv_prnt_typ);
	
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
	 * メモ４. Memo 4.<p>
	 *
	 */
	public static final String $memo4 = "memo4";
	private static final MCPermColumnInfo _memo4 = createColumnInfo("memo4");
	public final MCStringPermColumn memo4 = createStringColumn(_memo4);
	
	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public static final String $memo5 = "memo5";
	private static final MCPermColumnInfo _memo5 = createColumnInfo("memo5");
	public final MCStringPermColumn memo5 = createStringColumn(_memo5);
	
	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public static final String $memo6 = "memo6";
	private static final MCPermColumnInfo _memo6 = createColumnInfo("memo6");
	public final MCStringPermColumn memo6 = createStringColumn(_memo6);
	
	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public static final String $memo7 = "memo7";
	private static final MCPermColumnInfo _memo7 = createColumnInfo("memo7");
	public final MCStringPermColumn memo7 = createStringColumn(_memo7);
	
	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public static final String $memo8 = "memo8";
	private static final MCPermColumnInfo _memo8 = createColumnInfo("memo8");
	public final MCStringPermColumn memo8 = createStringColumn(_memo8);
	
	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public static final String $memo9 = "memo9";
	private static final MCPermColumnInfo _memo9 = createColumnInfo("memo9");
	public final MCStringPermColumn memo9 = createStringColumn(_memo9);
	
	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public static final String $memo10 = "memo10";
	private static final MCPermColumnInfo _memo10 = createColumnInfo("memo10");
	public final MCStringPermColumn memo10 = createStringColumn(_memo10);
	
	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public static final String $memo11 = "memo11";
	private static final MCPermColumnInfo _memo11 = createColumnInfo("memo11");
	public final MCStringPermColumn memo11 = createStringColumn(_memo11);
	
	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public static final String $memo12 = "memo12";
	private static final MCPermColumnInfo _memo12 = createColumnInfo("memo12");
	public final MCStringPermColumn memo12 = createStringColumn(_memo12);
	
	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public static final String $memo13 = "memo13";
	private static final MCPermColumnInfo _memo13 = createColumnInfo("memo13");
	public final MCStringPermColumn memo13 = createStringColumn(_memo13);
	
	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public static final String $memo14 = "memo14";
	private static final MCPermColumnInfo _memo14 = createColumnInfo("memo14");
	public final MCStringPermColumn memo14 = createStringColumn(_memo14);
	
	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public static final String $memo15 = "memo15";
	private static final MCPermColumnInfo _memo15 = createColumnInfo("memo15");
	public final MCStringPermColumn memo15 = createStringColumn(_memo15);
	
	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public static final String $memo16 = "memo16";
	private static final MCPermColumnInfo _memo16 = createColumnInfo("memo16");
	public final MCStringPermColumn memo16 = createStringColumn(_memo16);
	
	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public static final String $memo17 = "memo17";
	private static final MCPermColumnInfo _memo17 = createColumnInfo("memo17");
	public final MCStringPermColumn memo17 = createStringColumn(_memo17);
	
	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public static final String $memo18 = "memo18";
	private static final MCPermColumnInfo _memo18 = createColumnInfo("memo18");
	public final MCStringPermColumn memo18 = createStringColumn(_memo18);
	
	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public static final String $memo19 = "memo19";
	private static final MCPermColumnInfo _memo19 = createColumnInfo("memo19");
	public final MCStringPermColumn memo19 = createStringColumn(_memo19);
	
	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public static final String $memo20 = "memo20";
	private static final MCPermColumnInfo _memo20 = createColumnInfo("memo20");
	public final MCStringPermColumn memo20 = createStringColumn(_memo20);
	
	/**
	 * 物流グループ混在不可ＦＬＧ. Prohibit mixed distribution group flg..<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	private static final MCPermColumnInfo _not_lg_mix_flg = createColumnInfo("not_lg_mix_flg");
	public final MCBooleanPermColumn not_lg_mix_flg = createBooleanColumn(_not_lg_mix_flg);
	
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
	 * 国名. Country name.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	
	/**
	 * 地域名. Region name.<p>
	 *
	 */
	public static final String $area_nm = "area_nm";
	
	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	
	/**
	 * 取引先分類名１. BP classification name 1.<p>
	 *
	 */
	public static final String $bp_grp_nm1 = "bp_grp_nm1";
	
	/**
	 * 取引先分類名２. BP classification name 2.<p>
	 *
	 */
	public static final String $bp_grp_nm2 = "bp_grp_nm2";
	
	/**
	 * 取引先分類名３. BP classification name 3.<p>
	 *
	 */
	public static final String $bp_grp_nm3 = "bp_grp_nm3";
	
	/**
	 * 取引先分類名４. BP classification name 4.<p>
	 *
	 */
	public static final String $bp_grp_nm4 = "bp_grp_nm4";
	
	/**
	 * 取引先分類名５. BP classification name 5.<p>
	 *
	 */
	public static final String $bp_grp_nm5 = "bp_grp_nm5";
	
	/**
	 * 取引先分類名６. BP classification name 6.<p>
	 *
	 */
	public static final String $bp_grp_nm6 = "bp_grp_nm6";
	
	/**
	 * 取引先分類名７. BP classification name 7.<p>
	 *
	 */
	public static final String $bp_grp_nm7 = "bp_grp_nm7";
	
	/**
	 * 取引先分類名８. BP classification name 8.<p>
	 *
	 */
	public static final String $bp_grp_nm8 = "bp_grp_nm8";
	
	/**
	 * 取引先分類名９. BP classification name 9.<p>
	 *
	 */
	public static final String $bp_grp_nm9 = "bp_grp_nm9";
	
	/**
	 * 取引先分類名１０. BP classification name 10.<p>
	 *
	 */
	public static final String $bp_grp_nm10 = "bp_grp_nm10";
	
	/**
	 * 売掛先名. AR customer name.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	
	/**
	 * 債権部門名. AR dept. name.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	
	/**
	 * 得意先納品書名. Customer delivery note name.<p>
	 *
	 */
	public static final String $cst_ship_form_nm = "cst_ship_form_nm";
	
	/**
	 * 現品票名. Identification tag name.<p>
	 *
	 */
	public static final String $stk_lst_form_nm = "stk_lst_form_nm";
	
	/**
	 * 売上税名. Sales tax name.<p>
	 *
	 */
	public static final String $sls_tax_nm = "sls_tax_nm";
	
	/**
	 * 得意先取引条件名１. Customer transaction terms name 1.<p>
	 *
	 */
	public static final String $cst_tterm_nm1 = "cst_tterm_nm1";
	
	/**
	 * 得意先取引条件名２. Customer transaction terms name 2.<p>
	 *
	 */
	public static final String $cst_tterm_nm2 = "cst_tterm_nm2";
	
	/**
	 * 得意先取引条件名３. Customer transaction terms name 3.<p>
	 *
	 */
	public static final String $cst_tterm_nm3 = "cst_tterm_nm3";
	
	/**
	 * 販売分析名１. Sales analysis name 1.<p>
	 *
	 */
	public static final String $sls_anly_nm1 = "sls_anly_nm1";
	
	/**
	 * 販売分析名２. Sales analysis name 2.<p>
	 *
	 */
	public static final String $sls_anly_nm2 = "sls_anly_nm2";
	
	/**
	 * 販売分析名３. Sales analysis name 3.<p>
	 *
	 */
	public static final String $sls_anly_nm3 = "sls_anly_nm3";
	
	/**
	 * 請求先名. Billing customer name.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	
	/**
	 * 入金先名. Payer name.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	
	/**
	 * 債権与信管理先名. AR credit managed BP name.<p>
	 *
	 */
	public static final String $ar_cred_nm = "ar_cred_nm";
	
	/**
	 * 請求先担当部門名. Billing customer dept. in charge name.<p>
	 *
	 */
	public static final String $bcst_dpt_nm = "bcst_dpt_nm";
	
	/**
	 * 請求先カレンダ名. Billing customer calendar name.<p>
	 *
	 */
	public static final String $bill_cal_nm = "bill_cal_nm";
	
	/**
	 * 債権相殺グループ名. AR offset group name.<p>
	 *
	 */
	public static final String $ar_setoff_grp_nm = "ar_setoff_grp_nm";
	
	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	
	/**
	 * 納品先カレンダ名. Delivery destination calendar name.<p>
	 *
	 */
	public static final String $dlv_cal_nm = "dlv_cal_nm";
	
	/**
	 * 買掛先名. AP supplier name.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	
	/**
	 * ＶＭＩ購買部門名. VMI purchasing dept. name.<p>
	 *
	 */
	public static final String $vmi_purc_dpt_nm = "vmi_purc_dpt_nm";
	
	/**
	 * 注文書表示名. Display PO sheet name.<p>
	 *
	 */
	public static final String $po_print_nm = "po_print_nm";
	
	/**
	 * 発注先納品書名. Supplier delivery note name.<p>
	 *
	 */
	public static final String $sppl_ship_form_nm = "sppl_ship_form_nm";
	
	/**
	 * 仕入税名. Purchase tax type name.<p>
	 *
	 */
	public static final String $purc_tax_nm = "purc_tax_nm";
	
	/**
	 * 支給税名. Supply tax name.<p>
	 *
	 */
	public static final String $prov_tax_nm = "prov_tax_nm";
	
	/**
	 * 発注先カレンダ名. Supplier calendar name.<p>
	 *
	 */
	public static final String $sppl_cal_nm = "sppl_cal_nm";
	
	/**
	 * 発注先取引条件名１. Supplier transaction terms name 1.<p>
	 *
	 */
	public static final String $sppl_tterm_nm1 = "sppl_tterm_nm1";
	
	/**
	 * 発注先取引条件名２. Supplier transaction terms name 2.<p>
	 *
	 */
	public static final String $sppl_tterm_nm2 = "sppl_tterm_nm2";
	
	/**
	 * 発注先取引条件名３. Supplier transaction terms name 3.<p>
	 *
	 */
	public static final String $sppl_tterm_nm3 = "sppl_tterm_nm3";
	
	/**
	 * 支払予定管理先名. Scheduled payee name.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	
	/**
	 * 債務部門名. AP dept. name.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	
	/**
	 * 支払先名. Payee name.<p>
	 *
	 */
	public static final String $psppl_nm = "psppl_nm";
	
	/**
	 * 債務与信管理先名. AP credit managed BP name.<p>
	 *
	 */
	public static final String $ap_cred_nm = "ap_cred_nm";
	
	/**
	 * 支払予定管理先担当部門名. Name of dept. in charge of scheduled payee.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
	
	/**
	 * 債務相殺グループ名. AP offset group name.<p>
	 *
	 */
	public static final String $ap_setoff_grp_nm = "ap_setoff_grp_nm";
	
	/**
	 * 支払先口座名. Payee account name.<p>
	 *
	 */
	public static final String $pay_bank_ac_nm = "pay_bank_ac_nm";
	
	/**
	 * 支払部門名. Payment dept. name.<p>
	 *
	 */
	public static final String $pay_dpt_nm = "pay_dpt_nm";
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta imp_flg_META = createCommonMeta($imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_alt_nm1_META = createCommonMeta($bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bp_alt_nm2_META = createCommonMeta($bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bp_alt_nm3_META = createCommonMeta($bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bp_alt_nm4_META = createCommonMeta($bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ein_META = createCommonMeta($ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta std_co_cd_META = createCommonMeta($std_co_cd, mcframe.commonMA.meta.MA_META.STD_CO_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta bp_grp_cd1_META = createCommonMeta($bp_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd2_META = createCommonMeta($bp_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd3_META = createCommonMeta($bp_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd4_META = createCommonMeta($bp_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd5_META = createCommonMeta($bp_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd6_META = createCommonMeta($bp_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd7_META = createCommonMeta($bp_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd8_META = createCommonMeta($bp_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd9_META = createCommonMeta($bp_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd10_META = createCommonMeta($bp_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_alc_grp_META = createCommonMeta($bp_alc_grp, mcframe.commonMA.meta.MA_META.BP_ALC_GRP);
	public static final MCMeta cst_flg_META = createCommonMeta($cst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_flg_META = createCommonMeta($acst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_flg_META = createCommonMeta($bcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_flg_META = createCommonMeta($rcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_flg_META = createCommonMeta($sppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_flg_META = createCommonMeta($asppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_flg_META = createCommonMeta($bsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_flg_META = createCommonMeta($psppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_flg_META = createCommonMeta($cred_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_flg_META = createCommonMeta($dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_flg_META = createCommonMeta($maker_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_flg_META = createCommonMeta($dest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_com_flg_META = createCommonMeta($all_com_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_dpt_typ_META = createCommonMeta($ar_dpt_typ, mcframe.commonMA.meta.MA_META.AR_DPT_TYP);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_cntct_dpt_META = createCommonMeta($cst_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta cst_cntct_psn_META = createCommonMeta($cst_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta cst_cntct_psn_title_META = createCommonMeta($cst_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta cst_sundry_flg_META = createCommonMeta($cst_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_rnd_typ_META = createCommonMeta($sls_upri_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_calc_typ_META = createCommonMeta($sls_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta bill_basis_typ_META = createCommonMeta($bill_basis_typ, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta lot_back_stop_typ_META = createCommonMeta($lot_back_stop_typ, mcframe.commonMA.meta.MA_META.LOT_BACK_STOP_TYP);
	public static final MCMeta slip_each_lot_typ_META = createCommonMeta($slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta cst_ship_form_cd_META = createCommonMeta($cst_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta stk_lst_issue_flg_META = createCommonMeta($stk_lst_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_form_cd_META = createCommonMeta($stk_lst_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta sls_tax_cd_META = createCommonMeta($sls_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta sls_tax_cd_prio_flg_META = createCommonMeta($sls_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ar_flg_META = createCommonMeta($wrk_ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_lt_META = createCommonMeta($ship_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta cst_tterm_cd1_META = createCommonMeta($cst_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_cd2_META = createCommonMeta($cst_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_cd3_META = createCommonMeta($cst_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sls_anly_cd1_META = createCommonMeta($sls_anly_cd1, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_cd2_META = createCommonMeta($sls_anly_cd2, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_cd3_META = createCommonMeta($sls_anly_cd3, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_cred_cd_META = createCommonMeta($ar_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_typ_META = createCommonMeta($bill_dpt_typ, mcframe.commonMA.meta.MA_META.BILL_DPT_TYP);
	public static final MCMeta bcst_dpt_cd_META = createCommonMeta($bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta bill_cl_day1_META = createCommonMeta($bill_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day2_META = createCommonMeta($bill_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day3_META = createCommonMeta($bill_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day4_META = createCommonMeta($bill_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day5_META = createCommonMeta($bill_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta tax_on_bill_flg_META = createCommonMeta($tax_on_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_rnd_typ_META = createCommonMeta($bill_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta bill_cl_delay_days_META = createCommonMeta($bill_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta bill_cl_ba_typ_META = createCommonMeta($bill_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta sls_interim_cl_flg_META = createCommonMeta($sls_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_cal_cd_META = createCommonMeta($bill_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta rcv_ba_typ_META = createCommonMeta($rcv_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta bill_zip_cd_META = createCommonMeta($bill_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_addr1_META = createCommonMeta($bill_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta bill_addr2_META = createCommonMeta($bill_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta bill_addr3_META = createCommonMeta($bill_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta bill_addr4_META = createCommonMeta($bill_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta bill_tel_META = createCommonMeta($bill_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta bill_bcst_nm_META = createCommonMeta($bill_bcst_nm, mcframe.commonMA.meta.MA_META.BILL_BCST_NM);
	public static final MCMeta bill_bcst_dpt_META = createCommonMeta($bill_bcst_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bill_bcst_psn_META = createCommonMeta($bill_bcst_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta bill_bcst_psn_title_META = createCommonMeta($bill_bcst_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta bfw_bal_disp_flg_META = createCommonMeta($bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dtl_outp_typ_META = createCommonMeta($sls_dtl_outp_typ, mcframe.commonMA.meta.MA_META.SLS_DTL_OUTP_TYP);
	public static final MCMeta bill_prnt_typ_META = createCommonMeta($bill_prnt_typ, mcframe.commonMA.meta.MA_META.BILL_PRNT_TYP);
	public static final MCMeta bill_dtl_outp_flg_META = createCommonMeta($bill_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_adv_flg_META = createCommonMeta($bill_dtl_adv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_rcv_flg_META = createCommonMeta($bill_dtl_rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_subttl_typ_META = createCommonMeta($bill_dtl_subttl_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SUBTTL_TYP);
	public static final MCMeta bill_dtl_brk_typ_META = createCommonMeta($bill_dtl_brk_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_BRK_TYP);
	public static final MCMeta bill_dtl_sort_typ_META = createCommonMeta($bill_dtl_sort_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SORT_TYP);
	public static final MCMeta bill_can_slip_typ_META = createCommonMeta($bill_can_slip_typ, mcframe.commonMA.meta.MA_META.BILL_CAN_SLIP_TYP);
	public static final MCMeta auto_line_appl_flg_META = createCommonMeta($auto_line_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_setoff_grp_cd_META = createCommonMeta($ar_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta rcv_auto_appl_tgt_flg_META = createCommonMeta($rcv_auto_appl_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_amt_match_flg_META = createCommonMeta($rcv_amt_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_sttl_typ_match_flg_META = createCommonMeta($ar_sttl_typ_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_com_paid_flg_META = createCommonMeta($calc_com_paid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta auto_appl_delay_days_META = createCommonMeta($auto_appl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta vmi_purc_dpt_cd_META = createCommonMeta($vmi_purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_print_cd_META = createCommonMeta($po_print_cd, mcframe.commonMA.meta.MA_META.PO_PRINT_CD);
	public static final MCMeta sppl_ship_form_cd_META = createCommonMeta($sppl_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta po_dlv_slip_flg_META = createCommonMeta($po_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_dlv_slip_flg_META = createCommonMeta($dlv_inst_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_rcpt_dlv_slip_flg_META = createCommonMeta($prms_rcpt_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta sppl_cntct_psn_title_META = createCommonMeta($sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_tax_cd_prio_flg_META = createCommonMeta($purc_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_po_flg_META = createCommonMeta($wrk_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ap_flg_META = createCommonMeta($wrk_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_slip_each_lot_typ_META = createCommonMeta($purc_slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta prov_rcv_typ_META = createCommonMeta($prov_rcv_typ, mcframe.commonMA.meta.MA_META.PROV_RCV_TYP);
	public static final MCMeta onr_prsppl_flg_META = createCommonMeta($onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_upri_cng_flg_META = createCommonMeta($prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_amt_rnd_typ_META = createCommonMeta($prov_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_tax_rnd_typ_META = createCommonMeta($prov_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_tax_calc_typ_META = createCommonMeta($prov_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta prov_tax_cd_META = createCommonMeta($prov_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta prov_tax_cd_prio_flg_META = createCommonMeta($prov_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_dup_flg_META = createCommonMeta($rcpt_iv_dup_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_recv_flg_META = createCommonMeta($prms_recv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_tterm_cd1_META = createCommonMeta($sppl_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_cd2_META = createCommonMeta($sppl_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_cd3_META = createCommonMeta($sppl_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_cred_cd_META = createCommonMeta($ap_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_cl_day1_META = createCommonMeta($psppl_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day2_META = createCommonMeta($psppl_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day3_META = createCommonMeta($psppl_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day4_META = createCommonMeta($psppl_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day5_META = createCommonMeta($psppl_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta purc_interim_cl_flg_META = createCommonMeta($purc_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_setoff_grp_cd_META = createCommonMeta($ap_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_schd_ba_typ_META = createCommonMeta($pay_schd_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta tax_on_pay_flg_META = createCommonMeta($tax_on_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_tax_rnd_typ_META = createCommonMeta($pay_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta batch_pay_schd_cl_flg_META = createCommonMeta($batch_pay_schd_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_cl_delay_days_META = createCommonMeta($pay_schd_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta pay_schd_cl_ba_typ_META = createCommonMeta($pay_schd_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta biz_co_no_META = createCommonMeta($biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta pay_ntc_prnt_flg_META = createCommonMeta($pay_ntc_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_zip_cd_META = createCommonMeta($pay_ntc_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta pay_ntc_addr1_META = createCommonMeta($pay_ntc_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta pay_ntc_addr2_META = createCommonMeta($pay_ntc_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta pay_ntc_addr3_META = createCommonMeta($pay_ntc_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta pay_ntc_addr4_META = createCommonMeta($pay_ntc_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta pay_ntc_bsppl_nm_META = createCommonMeta($pay_ntc_bsppl_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_NM);
	public static final MCMeta pay_ntc_bsppl_dpt_META = createCommonMeta($pay_ntc_bsppl_dpt, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_DPT);
	public static final MCMeta pay_ntc_bsppl_psn_META = createCommonMeta($pay_ntc_bsppl_psn, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_PSN);
	public static final MCMeta pay_ntc_bsppl_psn_title_META = createCommonMeta($pay_ntc_bsppl_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta pay_ntc_tel_META = createCommonMeta($pay_ntc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta pay_ntc_dtl_outp_flg_META = createCommonMeta($pay_ntc_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_bfw_bal_disp_flg_META = createCommonMeta($pay_ntc_bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_adv_pay_flg_META = createCommonMeta($pay_ntc_adv_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_dtl_pay_flg_META = createCommonMeta($pay_ntc_dtl_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_dtl_subttl_typ_META = createCommonMeta($pay_ntc_dtl_subttl_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SUBTTL_TYP);
	public static final MCMeta pay_ntc_dtl_brk_typ_META = createCommonMeta($pay_ntc_dtl_brk_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_BRK_TYP);
	public static final MCMeta pay_ntc_dtl_sort_typ_META = createCommonMeta($pay_ntc_dtl_sort_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SORT_TYP);
	public static final MCMeta pay_ntc_can_slip_typ_META = createCommonMeta($pay_ntc_can_slip_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_CAN_SLIP_TYP);
	public static final MCMeta psppl_rmrks_META = createCommonMeta($psppl_rmrks, mcframe.commonMA.meta.MA_META.PSPPL_RMRKS);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_cntct_psn_title_META = createCommonMeta($dlv_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnsgn_stktk_flg_META = createCommonMeta($cnsgn_stktk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_flg_META = createCommonMeta($tdlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta tdlv_req_flg_META = createCommonMeta($tdlv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_cal_cd_META = createCommonMeta($dlv_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta dlv_chnnl1_META = createCommonMeta($dlv_chnnl1, mcframe.commonMA.meta.MA_META.DLV_CHNNL1);
	public static final MCMeta dlv_chnnl2_META = createCommonMeta($dlv_chnnl2, mcframe.commonMA.meta.MA_META.DLV_CHNNL2);
	public static final MCMeta dlv_chnnl3_META = createCommonMeta($dlv_chnnl3, mcframe.commonMA.meta.MA_META.DLV_CHNNL3);
	public static final MCMeta cst_prnt_typ_META = createCommonMeta($cst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta acst_prnt_typ_META = createCommonMeta($acst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bcst_prnt_typ_META = createCommonMeta($bcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta rcst_prnt_typ_META = createCommonMeta($rcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta sppl_prnt_typ_META = createCommonMeta($sppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta asppl_prnt_typ_META = createCommonMeta($asppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bsppl_prnt_typ_META = createCommonMeta($bsppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta psppl_prnt_typ_META = createCommonMeta($psppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta dlv_prnt_typ_META = createCommonMeta($dlv_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
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
	public static final MCMeta memo4_META = createCommonMeta($memo4, mcframe.commonMA.meta.MA_META.MST_MEMO4);
	public static final MCMeta memo5_META = createCommonMeta($memo5, mcframe.commonMA.meta.MA_META.MST_MEMO5);
	public static final MCMeta memo6_META = createCommonMeta($memo6, mcframe.commonMA.meta.MA_META.MST_MEMO6);
	public static final MCMeta memo7_META = createCommonMeta($memo7, mcframe.commonMA.meta.MA_META.MST_MEMO7);
	public static final MCMeta memo8_META = createCommonMeta($memo8, mcframe.commonMA.meta.MA_META.MST_MEMO8);
	public static final MCMeta memo9_META = createCommonMeta($memo9, mcframe.commonMA.meta.MA_META.MST_MEMO9);
	public static final MCMeta memo10_META = createCommonMeta($memo10, mcframe.commonMA.meta.MA_META.MST_MEMO10);
	public static final MCMeta memo11_META = createCommonMeta($memo11, mcframe.commonMA.meta.MA_META.MST_MEMO11);
	public static final MCMeta memo12_META = createCommonMeta($memo12, mcframe.commonMA.meta.MA_META.MST_MEMO12);
	public static final MCMeta memo13_META = createCommonMeta($memo13, mcframe.commonMA.meta.MA_META.MST_MEMO13);
	public static final MCMeta memo14_META = createCommonMeta($memo14, mcframe.commonMA.meta.MA_META.MST_MEMO14);
	public static final MCMeta memo15_META = createCommonMeta($memo15, mcframe.commonMA.meta.MA_META.MST_MEMO15);
	public static final MCMeta memo16_META = createCommonMeta($memo16, mcframe.commonMA.meta.MA_META.MST_MEMO16);
	public static final MCMeta memo17_META = createCommonMeta($memo17, mcframe.commonMA.meta.MA_META.MST_MEMO17);
	public static final MCMeta memo18_META = createCommonMeta($memo18, mcframe.commonMA.meta.MA_META.MST_MEMO18);
	public static final MCMeta memo19_META = createCommonMeta($memo19, mcframe.commonMA.meta.MA_META.MST_MEMO19);
	public static final MCMeta memo20_META = createCommonMeta($memo20, mcframe.commonMA.meta.MA_META.MST_MEMO20);
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta bp_grp_nm1_META = createCommonMeta($bp_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm2_META = createCommonMeta($bp_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm3_META = createCommonMeta($bp_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm4_META = createCommonMeta($bp_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm5_META = createCommonMeta($bp_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm6_META = createCommonMeta($bp_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm7_META = createCommonMeta($bp_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm8_META = createCommonMeta($bp_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm9_META = createCommonMeta($bp_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm10_META = createCommonMeta($bp_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta cst_ship_form_nm_META = createCommonMeta($cst_ship_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta stk_lst_form_nm_META = createCommonMeta($stk_lst_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta sls_tax_nm_META = createCommonMeta($sls_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta cst_tterm_nm1_META = createCommonMeta($cst_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta cst_tterm_nm2_META = createCommonMeta($cst_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta cst_tterm_nm3_META = createCommonMeta($cst_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta sls_anly_nm1_META = createCommonMeta($sls_anly_nm1, mcframe.commonMA.meta.MA_META.SLS_ANLY_NM);
	public static final MCMeta sls_anly_nm2_META = createCommonMeta($sls_anly_nm2, mcframe.commonMA.meta.MA_META.SLS_ANLY_NM);
	public static final MCMeta sls_anly_nm3_META = createCommonMeta($sls_anly_nm3, mcframe.commonMA.meta.MA_META.SLS_ANLY_NM);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_cred_nm_META = createCommonMeta($ar_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_dpt_nm_META = createCommonMeta($bcst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bill_cal_nm_META = createCommonMeta($bill_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta ar_setoff_grp_nm_META = createCommonMeta($ar_setoff_grp_nm, mcframe.commonMA.meta.MA_META.SETOFF_GRP_NM);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta dlv_cal_nm_META = createCommonMeta($dlv_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta vmi_purc_dpt_nm_META = createCommonMeta($vmi_purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta po_print_nm_META = createCommonMeta($po_print_nm, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta sppl_ship_form_nm_META = createCommonMeta($sppl_ship_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta purc_tax_nm_META = createCommonMeta($purc_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta prov_tax_nm_META = createCommonMeta($prov_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta sppl_cal_nm_META = createCommonMeta($sppl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta sppl_tterm_nm1_META = createCommonMeta($sppl_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta sppl_tterm_nm2_META = createCommonMeta($sppl_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta sppl_tterm_nm3_META = createCommonMeta($sppl_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_cred_nm_META = createCommonMeta($ap_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_setoff_grp_nm_META = createCommonMeta($ap_setoff_grp_nm, mcframe.commonMA.meta.MA_META.SETOFF_GRP_NM);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta pay_dpt_nm_META = createCommonMeta($pay_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MBT_BP_IF_R> constMetas = new ConstMetaList<MBT_BP_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			data_make_dt_META,
			imp_flg_META,
			bp_cd_META,
			del_flg_META,
			bp_nm_META,
			bp_alt_nm1_META,
			bp_alt_nm2_META,
			bp_alt_nm3_META,
			bp_alt_nm4_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			ein_META,
			std_co_cd_META,
			cntry_cd_META,
			area_cd_META,
			cur_cd_META,
			prnt_lcl_cd_META,
			bp_grp_cd1_META,
			bp_grp_cd2_META,
			bp_grp_cd3_META,
			bp_grp_cd4_META,
			bp_grp_cd5_META,
			bp_grp_cd6_META,
			bp_grp_cd7_META,
			bp_grp_cd8_META,
			bp_grp_cd9_META,
			bp_grp_cd10_META,
			bp_alc_grp_META,
			cst_flg_META,
			acst_flg_META,
			bcst_flg_META,
			rcst_flg_META,
			sppl_flg_META,
			asppl_flg_META,
			bsppl_flg_META,
			psppl_flg_META,
			cred_flg_META,
			dlv_flg_META,
			maker_flg_META,
			dest_flg_META,
			all_com_flg_META,
			acst_cd_META,
			ar_dpt_typ_META,
			ar_dpt_cd_META,
			cst_cntct_dpt_META,
			cst_cntct_psn_META,
			cst_cntct_psn_title_META,
			cst_sundry_flg_META,
			sls_upri_req_typ_META,
			sls_upri_cng_flg_META,
			sls_upri_rnd_typ_META,
			sls_amt_rnd_typ_META,
			sls_tax_calc_typ_META,
			sls_tax_rnd_typ_META,
			sls_basis_typ_META,
			bill_basis_typ_META,
			ship_schd_split_typ_META,
			bill_crryovr_times_META,
			lot_back_stop_typ_META,
			slip_each_lot_typ_META,
			cst_ship_form_cd_META,
			stk_lst_issue_flg_META,
			stk_lst_form_cd_META,
			sls_tax_cd_META,
			sls_tax_cd_prio_flg_META,
			wrk_ar_flg_META,
			cst_iv_flg_META,
			ship_lt_META,
			cst_tterm_cd1_META,
			cst_tterm_cd2_META,
			cst_tterm_cd3_META,
			sls_anly_cd1_META,
			sls_anly_cd2_META,
			sls_anly_cd3_META,
			bcst_cd_META,
			rcst_cd_META,
			ar_cred_cd_META,
			bill_dpt_typ_META,
			bcst_dpt_cd_META,
			bill_cl_typ_META,
			bill_cl_day1_META,
			bill_cl_day2_META,
			bill_cl_day3_META,
			bill_cl_day4_META,
			bill_cl_day5_META,
			tax_on_bill_flg_META,
			bill_tax_rnd_typ_META,
			bill_cl_delay_days_META,
			bill_cl_ba_typ_META,
			sls_interim_cl_flg_META,
			bill_cal_cd_META,
			rcv_ba_typ_META,
			bill_zip_cd_META,
			bill_addr1_META,
			bill_addr2_META,
			bill_addr3_META,
			bill_addr4_META,
			bill_tel_META,
			bill_bcst_nm_META,
			bill_bcst_dpt_META,
			bill_bcst_psn_META,
			bill_bcst_psn_title_META,
			bfw_bal_disp_flg_META,
			sls_dtl_outp_typ_META,
			bill_prnt_typ_META,
			bill_dtl_outp_flg_META,
			bill_dtl_adv_flg_META,
			bill_dtl_rcv_flg_META,
			bill_dtl_subttl_typ_META,
			bill_dtl_brk_typ_META,
			bill_dtl_sort_typ_META,
			bill_can_slip_typ_META,
			auto_line_appl_flg_META,
			ar_setoff_grp_cd_META,
			xfr_psn_META,
			rcv_auto_appl_tgt_flg_META,
			rcv_amt_match_flg_META,
			ar_sttl_typ_match_flg_META,
			calc_com_paid_flg_META,
			auto_appl_delay_days_META,
			asppl_cd_META,
			vmi_purc_dpt_cd_META,
			subcon_flg_META,
			po_print_cd_META,
			sppl_ship_form_cd_META,
			po_dlv_slip_flg_META,
			dlv_inst_dlv_slip_flg_META,
			prms_rcpt_dlv_slip_flg_META,
			pay_crryovr_times_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_cntct_psn_title_META,
			purc_upri_req_typ_META,
			purc_upri_cng_flg_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			purc_tax_calc_typ_META,
			purc_tax_cd_META,
			purc_tax_cd_prio_flg_META,
			wrk_po_flg_META,
			wrk_ap_flg_META,
			purc_slip_each_lot_typ_META,
			prov_rcv_typ_META,
			onr_prsppl_flg_META,
			outsrc_upri_typ_META,
			prov_basis_typ_META,
			prov_upri_cng_flg_META,
			prov_amt_rnd_typ_META,
			prov_tax_rnd_typ_META,
			prov_tax_calc_typ_META,
			prov_tax_cd_META,
			prov_tax_cd_prio_flg_META,
			sppl_cal_cd_META,
			sppl_iv_flg_META,
			rcpt_iv_dup_flg_META,
			prms_recv_flg_META,
			sppl_tterm_cd1_META,
			sppl_tterm_cd2_META,
			sppl_tterm_cd3_META,
			purc_basis_typ_META,
			repurc_obli_flg_META,
			bsppl_cd_META,
			ap_dpt_cd_META,
			psppl_cd_META,
			ap_cred_cd_META,
			bsppl_dpt_cd_META,
			pay_spot_flg_META,
			psppl_cl_day1_META,
			psppl_cl_day2_META,
			psppl_cl_day3_META,
			psppl_cl_day4_META,
			psppl_cl_day5_META,
			purc_interim_cl_flg_META,
			ap_setoff_grp_cd_META,
			pay_bank_ac_cd_META,
			pay_schd_ba_typ_META,
			tax_on_pay_flg_META,
			pay_tax_rnd_typ_META,
			batch_pay_schd_cl_flg_META,
			pay_schd_cl_delay_days_META,
			pay_schd_cl_ba_typ_META,
			biz_co_no_META,
			pay_ntc_prnt_flg_META,
			pay_ntc_zip_cd_META,
			pay_ntc_addr1_META,
			pay_ntc_addr2_META,
			pay_ntc_addr3_META,
			pay_ntc_addr4_META,
			pay_ntc_bsppl_nm_META,
			pay_ntc_bsppl_dpt_META,
			pay_ntc_bsppl_psn_META,
			pay_ntc_bsppl_psn_title_META,
			pay_ntc_tel_META,
			pay_ntc_dtl_outp_flg_META,
			pay_ntc_bfw_bal_disp_flg_META,
			pay_ntc_adv_pay_flg_META,
			pay_ntc_dtl_pay_flg_META,
			pay_ntc_dtl_subttl_typ_META,
			pay_ntc_dtl_brk_typ_META,
			pay_ntc_dtl_sort_typ_META,
			pay_ntc_can_slip_typ_META,
			psppl_rmrks_META,
			note_days_META,
			pay_dpt_cd_META,
			dlv_sundry_flg_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_cntct_psn_title_META,
			pri_prnt_flg_META,
			cnsgn_stktk_flg_META,
			tdlv_flg_META,
			via_dlv_typ_META,
			tdlv_req_flg_META,
			lg_grp_cd_META,
			dlv_cal_cd_META,
			dlv_chnnl1_META,
			dlv_chnnl2_META,
			dlv_chnnl3_META,
			cst_prnt_typ_META,
			acst_prnt_typ_META,
			bcst_prnt_typ_META,
			rcst_prnt_typ_META,
			sppl_prnt_typ_META,
			asppl_prnt_typ_META,
			bsppl_prnt_typ_META,
			psppl_prnt_typ_META,
			dlv_prnt_typ_META,
			memo1_META,
			memo2_META,
			memo3_META,
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
			memo4_META,
			memo5_META,
			memo6_META,
			memo7_META,
			memo8_META,
			memo9_META,
			memo10_META,
			memo11_META,
			memo12_META,
			memo13_META,
			memo14_META,
			memo15_META,
			memo16_META,
			memo17_META,
			memo18_META,
			memo19_META,
			memo20_META,
			not_lg_mix_flg_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			cntry_nm_META,
			area_nm_META,
			cur_nm_META,
			bp_grp_nm1_META,
			bp_grp_nm2_META,
			bp_grp_nm3_META,
			bp_grp_nm4_META,
			bp_grp_nm5_META,
			bp_grp_nm6_META,
			bp_grp_nm7_META,
			bp_grp_nm8_META,
			bp_grp_nm9_META,
			bp_grp_nm10_META,
			acst_nm_META,
			ar_dpt_nm_META,
			cst_ship_form_nm_META,
			stk_lst_form_nm_META,
			sls_tax_nm_META,
			cst_tterm_nm1_META,
			cst_tterm_nm2_META,
			cst_tterm_nm3_META,
			sls_anly_nm1_META,
			sls_anly_nm2_META,
			sls_anly_nm3_META,
			bcst_nm_META,
			rcst_nm_META,
			ar_cred_nm_META,
			bcst_dpt_nm_META,
			bill_cal_nm_META,
			ar_setoff_grp_nm_META,
			lg_grp_nm_META,
			dlv_cal_nm_META,
			asppl_nm_META,
			vmi_purc_dpt_nm_META,
			po_print_nm_META,
			sppl_ship_form_nm_META,
			purc_tax_nm_META,
			prov_tax_nm_META,
			sppl_cal_nm_META,
			sppl_tterm_nm1_META,
			sppl_tterm_nm2_META,
			sppl_tterm_nm3_META,
			bsppl_nm_META,
			ap_dpt_nm_META,
			psppl_nm_META,
			ap_cred_nm_META,
			bsppl_dpt_nm_META,
			ap_setoff_grp_nm_META,
			pay_bank_ac_nm_META,
			pay_dpt_nm_META
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
	protected MBT_BP_IF_R(ConstMetaList<? extends MBT_BP_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBT_BP_IF_R(ConstMetaList<? extends MBT_BP_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBT_BP_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$data_lno,
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
			MBT_BP_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$data_no,
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
			MBT_BP_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$exe_sts_typ,
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
			MBT_BP_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$data_crud_typ,
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
			MBT_BP_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ext_sys_cd,
				"ext_sys_cd",
				ext_sys_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$data_make_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BP_IF_R.$data_make_dt,
				"data_make_dt",
				data_make_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$imp_flg,
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
			MBT_BP_IF_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_cd,
				"bp_cd",
				bp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$del_flg,
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
			MBT_BP_IF_R.$bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_nm,
				"bp_nm",
				bp_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_alt_nm1,
				"bp_alt_nm1",
				bp_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_alt_nm2,
				"bp_alt_nm2",
				bp_alt_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_alt_nm3,
				"bp_alt_nm3",
				bp_alt_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_alt_nm4,
				"bp_alt_nm4",
				bp_alt_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$zip_cd,
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
			MBT_BP_IF_R.$addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$addr1,
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
			MBT_BP_IF_R.$addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$addr2,
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
			MBT_BP_IF_R.$addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$addr3,
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
			MBT_BP_IF_R.$addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$addr4,
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
			MBT_BP_IF_R.$tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$tel,
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
			MBT_BP_IF_R.$fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$fax,
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
			MBT_BP_IF_R.$ein,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ein,
				"ein",
				ein,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$std_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$std_co_cd,
				"std_co_cd",
				std_co_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cntry_cd,
				"cntry_cd",
				cntry_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$area_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$area_cd,
				"area_cd",
				area_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cur_cd,
				"cur_cd",
				cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$prnt_lcl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$prnt_lcl_cd,
				"prnt_lcl_cd",
				prnt_lcl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_grp_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_cd1,
				"bp_grp_cd1",
				bp_grp_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_grp_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_cd2,
				"bp_grp_cd2",
				bp_grp_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_grp_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_cd3,
				"bp_grp_cd3",
				bp_grp_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_grp_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_cd4,
				"bp_grp_cd4",
				bp_grp_cd4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_grp_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_cd5,
				"bp_grp_cd5",
				bp_grp_cd5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_grp_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_cd6,
				"bp_grp_cd6",
				bp_grp_cd6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_grp_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_cd7,
				"bp_grp_cd7",
				bp_grp_cd7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_grp_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_cd8,
				"bp_grp_cd8",
				bp_grp_cd8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_grp_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_cd9,
				"bp_grp_cd9",
				bp_grp_cd9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_grp_cd10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_cd10,
				"bp_grp_cd10",
				bp_grp_cd10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bp_alc_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_alc_grp,
				"bp_alc_grp",
				bp_alc_grp,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$cst_flg,
				"cst_flg",
				cst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$acst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$acst_flg,
				"acst_flg",
				acst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bcst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$bcst_flg,
				"bcst_flg",
				bcst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$rcst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$rcst_flg,
				"rcst_flg",
				rcst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$sppl_flg,
				"sppl_flg",
				sppl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$asppl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$asppl_flg,
				"asppl_flg",
				asppl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bsppl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$bsppl_flg,
				"bsppl_flg",
				bsppl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$psppl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$psppl_flg,
				"psppl_flg",
				psppl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cred_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$cred_flg,
				"cred_flg",
				cred_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dlv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$dlv_flg,
				"dlv_flg",
				dlv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$maker_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$maker_flg,
				"maker_flg",
				maker_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dest_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$dest_flg,
				"dest_flg",
				dest_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$all_com_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$all_com_flg,
				"all_com_flg",
				all_com_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$acst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$acst_cd,
				"acst_cd",
				acst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$ar_dpt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ar_dpt_typ,
				"ar_dpt_typ",
				ar_dpt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$ar_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ar_dpt_cd,
				"ar_dpt_cd",
				ar_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_cntct_dpt,
				"cst_cntct_dpt",
				cst_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_cntct_psn,
				"cst_cntct_psn",
				cst_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_cntct_psn_title,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_cntct_psn_title,
				"cst_cntct_psn_title",
				cst_cntct_psn_title,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$cst_sundry_flg,
				"cst_sundry_flg",
				cst_sundry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_upri_req_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_upri_req_typ,
				"sls_upri_req_typ",
				sls_upri_req_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_upri_cng_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$sls_upri_cng_flg,
				"sls_upri_cng_flg",
				sls_upri_cng_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_upri_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_upri_rnd_typ,
				"sls_upri_rnd_typ",
				sls_upri_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_amt_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_amt_rnd_typ,
				"sls_amt_rnd_typ",
				sls_amt_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_tax_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_tax_calc_typ,
				"sls_tax_calc_typ",
				sls_tax_calc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_tax_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_tax_rnd_typ,
				"sls_tax_rnd_typ",
				sls_tax_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_basis_typ,
				"sls_basis_typ",
				sls_basis_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_basis_typ,
				"bill_basis_typ",
				bill_basis_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$ship_schd_split_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ship_schd_split_typ,
				"ship_schd_split_typ",
				ship_schd_split_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_crryovr_times,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$bill_crryovr_times,
				"bill_crryovr_times",
				bill_crryovr_times,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$lot_back_stop_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$lot_back_stop_typ,
				"lot_back_stop_typ",
				lot_back_stop_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$slip_each_lot_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$slip_each_lot_typ,
				"slip_each_lot_typ",
				slip_each_lot_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_ship_form_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_ship_form_cd,
				"cst_ship_form_cd",
				cst_ship_form_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$stk_lst_issue_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$stk_lst_issue_flg,
				"stk_lst_issue_flg",
				stk_lst_issue_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$stk_lst_form_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$stk_lst_form_cd,
				"stk_lst_form_cd",
				stk_lst_form_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_tax_cd,
				"sls_tax_cd",
				sls_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_tax_cd_prio_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$sls_tax_cd_prio_flg,
				"sls_tax_cd_prio_flg",
				sls_tax_cd_prio_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$wrk_ar_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$wrk_ar_flg,
				"wrk_ar_flg",
				wrk_ar_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_iv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$cst_iv_flg,
				"cst_iv_flg",
				cst_iv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$ship_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$ship_lt,
				"ship_lt",
				ship_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_tterm_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_tterm_cd1,
				"cst_tterm_cd1",
				cst_tterm_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_tterm_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_tterm_cd2,
				"cst_tterm_cd2",
				cst_tterm_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_tterm_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_tterm_cd3,
				"cst_tterm_cd3",
				cst_tterm_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_anly_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_anly_cd1,
				"sls_anly_cd1",
				sls_anly_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_anly_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_anly_cd2,
				"sls_anly_cd2",
				sls_anly_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_anly_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_anly_cd3,
				"sls_anly_cd3",
				sls_anly_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bcst_cd,
				"bcst_cd",
				bcst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$rcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$rcst_cd,
				"rcst_cd",
				rcst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$ar_cred_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ar_cred_cd,
				"ar_cred_cd",
				ar_cred_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_dpt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_dpt_typ,
				"bill_dpt_typ",
				bill_dpt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bcst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bcst_dpt_cd,
				"bcst_dpt_cd",
				bcst_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_cl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_cl_typ,
				"bill_cl_typ",
				bill_cl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_cl_day1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$bill_cl_day1,
				"bill_cl_day1",
				bill_cl_day1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_cl_day2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$bill_cl_day2,
				"bill_cl_day2",
				bill_cl_day2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_cl_day3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$bill_cl_day3,
				"bill_cl_day3",
				bill_cl_day3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_cl_day4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$bill_cl_day4,
				"bill_cl_day4",
				bill_cl_day4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_cl_day5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$bill_cl_day5,
				"bill_cl_day5",
				bill_cl_day5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$tax_on_bill_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$tax_on_bill_flg,
				"tax_on_bill_flg",
				tax_on_bill_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_tax_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_tax_rnd_typ,
				"bill_tax_rnd_typ",
				bill_tax_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_cl_delay_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$bill_cl_delay_days,
				"bill_cl_delay_days",
				bill_cl_delay_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_cl_ba_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_cl_ba_typ,
				"bill_cl_ba_typ",
				bill_cl_ba_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_interim_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$sls_interim_cl_flg,
				"sls_interim_cl_flg",
				sls_interim_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_cal_cd,
				"bill_cal_cd",
				bill_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$rcv_ba_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$rcv_ba_typ,
				"rcv_ba_typ",
				rcv_ba_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_zip_cd,
				"bill_zip_cd",
				bill_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_addr1,
				"bill_addr1",
				bill_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_addr2,
				"bill_addr2",
				bill_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_addr3,
				"bill_addr3",
				bill_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_addr4,
				"bill_addr4",
				bill_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_tel,
				"bill_tel",
				bill_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_bcst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_bcst_nm,
				"bill_bcst_nm",
				bill_bcst_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_bcst_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_bcst_dpt,
				"bill_bcst_dpt",
				bill_bcst_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_bcst_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_bcst_psn,
				"bill_bcst_psn",
				bill_bcst_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_bcst_psn_title,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_bcst_psn_title,
				"bill_bcst_psn_title",
				bill_bcst_psn_title,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bfw_bal_disp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$bfw_bal_disp_flg,
				"bfw_bal_disp_flg",
				bfw_bal_disp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sls_dtl_outp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_dtl_outp_typ,
				"sls_dtl_outp_typ",
				sls_dtl_outp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_prnt_typ,
				"bill_prnt_typ",
				bill_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_dtl_outp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$bill_dtl_outp_flg,
				"bill_dtl_outp_flg",
				bill_dtl_outp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_dtl_adv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$bill_dtl_adv_flg,
				"bill_dtl_adv_flg",
				bill_dtl_adv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_dtl_rcv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$bill_dtl_rcv_flg,
				"bill_dtl_rcv_flg",
				bill_dtl_rcv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_dtl_subttl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_dtl_subttl_typ,
				"bill_dtl_subttl_typ",
				bill_dtl_subttl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_dtl_brk_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_dtl_brk_typ,
				"bill_dtl_brk_typ",
				bill_dtl_brk_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_dtl_sort_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_dtl_sort_typ,
				"bill_dtl_sort_typ",
				bill_dtl_sort_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bill_can_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_can_slip_typ,
				"bill_can_slip_typ",
				bill_can_slip_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$auto_line_appl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$auto_line_appl_flg,
				"auto_line_appl_flg",
				auto_line_appl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$ar_setoff_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ar_setoff_grp_cd,
				"ar_setoff_grp_cd",
				ar_setoff_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$xfr_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$xfr_psn,
				"xfr_psn",
				xfr_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$rcv_auto_appl_tgt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$rcv_auto_appl_tgt_flg,
				"rcv_auto_appl_tgt_flg",
				rcv_auto_appl_tgt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$rcv_amt_match_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$rcv_amt_match_flg,
				"rcv_amt_match_flg",
				rcv_amt_match_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$ar_sttl_typ_match_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$ar_sttl_typ_match_flg,
				"ar_sttl_typ_match_flg",
				ar_sttl_typ_match_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$calc_com_paid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$calc_com_paid_flg,
				"calc_com_paid_flg",
				calc_com_paid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$auto_appl_delay_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$auto_appl_delay_days,
				"auto_appl_delay_days",
				auto_appl_delay_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$asppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$asppl_cd,
				"asppl_cd",
				asppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$vmi_purc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$vmi_purc_dpt_cd,
				"vmi_purc_dpt_cd",
				vmi_purc_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$subcon_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$subcon_flg,
				"subcon_flg",
				subcon_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$po_print_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$po_print_cd,
				"po_print_cd",
				po_print_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_ship_form_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_ship_form_cd,
				"sppl_ship_form_cd",
				sppl_ship_form_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$po_dlv_slip_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$po_dlv_slip_flg,
				"po_dlv_slip_flg",
				po_dlv_slip_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dlv_inst_dlv_slip_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$dlv_inst_dlv_slip_flg,
				"dlv_inst_dlv_slip_flg",
				dlv_inst_dlv_slip_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$prms_rcpt_dlv_slip_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$prms_rcpt_dlv_slip_flg,
				"prms_rcpt_dlv_slip_flg",
				prms_rcpt_dlv_slip_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_crryovr_times,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$pay_crryovr_times,
				"pay_crryovr_times",
				pay_crryovr_times,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_cntct_dpt,
				"sppl_cntct_dpt",
				sppl_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_cntct_psn,
				"sppl_cntct_psn",
				sppl_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_cntct_psn_title,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_cntct_psn_title,
				"sppl_cntct_psn_title",
				sppl_cntct_psn_title,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$purc_upri_req_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$purc_upri_req_typ,
				"purc_upri_req_typ",
				purc_upri_req_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$purc_upri_cng_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$purc_upri_cng_flg,
				"purc_upri_cng_flg",
				purc_upri_cng_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$purc_amt_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$purc_amt_rnd_typ,
				"purc_amt_rnd_typ",
				purc_amt_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$purc_tax_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$purc_tax_rnd_typ,
				"purc_tax_rnd_typ",
				purc_tax_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$purc_tax_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$purc_tax_calc_typ,
				"purc_tax_calc_typ",
				purc_tax_calc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$purc_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$purc_tax_cd,
				"purc_tax_cd",
				purc_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$purc_tax_cd_prio_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$purc_tax_cd_prio_flg,
				"purc_tax_cd_prio_flg",
				purc_tax_cd_prio_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$wrk_po_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$wrk_po_flg,
				"wrk_po_flg",
				wrk_po_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$wrk_ap_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$wrk_ap_flg,
				"wrk_ap_flg",
				wrk_ap_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$purc_slip_each_lot_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$purc_slip_each_lot_typ,
				"purc_slip_each_lot_typ",
				purc_slip_each_lot_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$prov_rcv_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$prov_rcv_typ,
				"prov_rcv_typ",
				prov_rcv_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$onr_prsppl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$onr_prsppl_flg,
				"onr_prsppl_flg",
				onr_prsppl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$outsrc_upri_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$outsrc_upri_typ,
				"outsrc_upri_typ",
				outsrc_upri_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$prov_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$prov_basis_typ,
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
			MBT_BP_IF_R.$prov_upri_cng_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$prov_upri_cng_flg,
				"prov_upri_cng_flg",
				prov_upri_cng_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$prov_amt_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$prov_amt_rnd_typ,
				"prov_amt_rnd_typ",
				prov_amt_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$prov_tax_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$prov_tax_rnd_typ,
				"prov_tax_rnd_typ",
				prov_tax_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$prov_tax_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$prov_tax_calc_typ,
				"prov_tax_calc_typ",
				prov_tax_calc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$prov_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$prov_tax_cd,
				"prov_tax_cd",
				prov_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$prov_tax_cd_prio_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$prov_tax_cd_prio_flg,
				"prov_tax_cd_prio_flg",
				prov_tax_cd_prio_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_cal_cd,
				"sppl_cal_cd",
				sppl_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_iv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$sppl_iv_flg,
				"sppl_iv_flg",
				sppl_iv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$rcpt_iv_dup_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$rcpt_iv_dup_flg,
				"rcpt_iv_dup_flg",
				rcpt_iv_dup_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$prms_recv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$prms_recv_flg,
				"prms_recv_flg",
				prms_recv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_tterm_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_tterm_cd1,
				"sppl_tterm_cd1",
				sppl_tterm_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_tterm_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_tterm_cd2,
				"sppl_tterm_cd2",
				sppl_tterm_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_tterm_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_tterm_cd3,
				"sppl_tterm_cd3",
				sppl_tterm_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$purc_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$purc_basis_typ,
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
			MBT_BP_IF_R.$repurc_obli_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$repurc_obli_flg,
				"repurc_obli_flg",
				repurc_obli_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bsppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bsppl_cd,
				"bsppl_cd",
				bsppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$ap_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ap_dpt_cd,
				"ap_dpt_cd",
				ap_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$psppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$psppl_cd,
				"psppl_cd",
				psppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$ap_cred_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ap_cred_cd,
				"ap_cred_cd",
				ap_cred_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bsppl_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bsppl_dpt_cd,
				"bsppl_dpt_cd",
				bsppl_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_spot_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$pay_spot_flg,
				"pay_spot_flg",
				pay_spot_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$psppl_cl_day1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$psppl_cl_day1,
				"psppl_cl_day1",
				psppl_cl_day1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$psppl_cl_day2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$psppl_cl_day2,
				"psppl_cl_day2",
				psppl_cl_day2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$psppl_cl_day3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$psppl_cl_day3,
				"psppl_cl_day3",
				psppl_cl_day3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$psppl_cl_day4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$psppl_cl_day4,
				"psppl_cl_day4",
				psppl_cl_day4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$psppl_cl_day5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$psppl_cl_day5,
				"psppl_cl_day5",
				psppl_cl_day5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$purc_interim_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$purc_interim_cl_flg,
				"purc_interim_cl_flg",
				purc_interim_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$ap_setoff_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ap_setoff_grp_cd,
				"ap_setoff_grp_cd",
				ap_setoff_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_bank_ac_cd,
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
			MBT_BP_IF_R.$pay_schd_ba_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_schd_ba_typ,
				"pay_schd_ba_typ",
				pay_schd_ba_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$tax_on_pay_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$tax_on_pay_flg,
				"tax_on_pay_flg",
				tax_on_pay_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_tax_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_tax_rnd_typ,
				"pay_tax_rnd_typ",
				pay_tax_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$batch_pay_schd_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$batch_pay_schd_cl_flg,
				"batch_pay_schd_cl_flg",
				batch_pay_schd_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_schd_cl_delay_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$pay_schd_cl_delay_days,
				"pay_schd_cl_delay_days",
				pay_schd_cl_delay_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_schd_cl_ba_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_schd_cl_ba_typ,
				"pay_schd_cl_ba_typ",
				pay_schd_cl_ba_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$biz_co_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$biz_co_no,
				"biz_co_no",
				biz_co_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$pay_ntc_prnt_flg,
				"pay_ntc_prnt_flg",
				pay_ntc_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_zip_cd,
				"pay_ntc_zip_cd",
				pay_ntc_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_addr1,
				"pay_ntc_addr1",
				pay_ntc_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_addr2,
				"pay_ntc_addr2",
				pay_ntc_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_addr3,
				"pay_ntc_addr3",
				pay_ntc_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_addr4,
				"pay_ntc_addr4",
				pay_ntc_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_bsppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_bsppl_nm,
				"pay_ntc_bsppl_nm",
				pay_ntc_bsppl_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_bsppl_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_bsppl_dpt,
				"pay_ntc_bsppl_dpt",
				pay_ntc_bsppl_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_bsppl_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_bsppl_psn,
				"pay_ntc_bsppl_psn",
				pay_ntc_bsppl_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_bsppl_psn_title,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_bsppl_psn_title,
				"pay_ntc_bsppl_psn_title",
				pay_ntc_bsppl_psn_title,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_tel,
				"pay_ntc_tel",
				pay_ntc_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_dtl_outp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$pay_ntc_dtl_outp_flg,
				"pay_ntc_dtl_outp_flg",
				pay_ntc_dtl_outp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_bfw_bal_disp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$pay_ntc_bfw_bal_disp_flg,
				"pay_ntc_bfw_bal_disp_flg",
				pay_ntc_bfw_bal_disp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_adv_pay_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$pay_ntc_adv_pay_flg,
				"pay_ntc_adv_pay_flg",
				pay_ntc_adv_pay_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_dtl_pay_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$pay_ntc_dtl_pay_flg,
				"pay_ntc_dtl_pay_flg",
				pay_ntc_dtl_pay_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_dtl_subttl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_dtl_subttl_typ,
				"pay_ntc_dtl_subttl_typ",
				pay_ntc_dtl_subttl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_dtl_brk_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_dtl_brk_typ,
				"pay_ntc_dtl_brk_typ",
				pay_ntc_dtl_brk_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_dtl_sort_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_dtl_sort_typ,
				"pay_ntc_dtl_sort_typ",
				pay_ntc_dtl_sort_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_ntc_can_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_ntc_can_slip_typ,
				"pay_ntc_can_slip_typ",
				pay_ntc_can_slip_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$psppl_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$psppl_rmrks,
				"psppl_rmrks",
				psppl_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$note_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$note_days,
				"note_days",
				note_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pay_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_dpt_cd,
				"pay_dpt_cd",
				pay_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dlv_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$dlv_sundry_flg,
				"dlv_sundry_flg",
				dlv_sundry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dlv_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$dlv_cntct_dpt,
				"dlv_cntct_dpt",
				dlv_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dlv_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$dlv_cntct_psn,
				"dlv_cntct_psn",
				dlv_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dlv_cntct_psn_title,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$dlv_cntct_psn_title,
				"dlv_cntct_psn_title",
				dlv_cntct_psn_title,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$pri_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$pri_prnt_flg,
				"pri_prnt_flg",
				pri_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cnsgn_stktk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$cnsgn_stktk_flg,
				"cnsgn_stktk_flg",
				cnsgn_stktk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$tdlv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$tdlv_flg,
				"tdlv_flg",
				tdlv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$via_dlv_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$via_dlv_typ,
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
			MBT_BP_IF_R.$tdlv_req_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$tdlv_req_flg,
				"tdlv_req_flg",
				tdlv_req_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$lg_grp_cd,
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
			MBT_BP_IF_R.$dlv_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$dlv_cal_cd,
				"dlv_cal_cd",
				dlv_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dlv_chnnl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$dlv_chnnl1,
				"dlv_chnnl1",
				dlv_chnnl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dlv_chnnl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$dlv_chnnl2,
				"dlv_chnnl2",
				dlv_chnnl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dlv_chnnl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$dlv_chnnl3,
				"dlv_chnnl3",
				dlv_chnnl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$cst_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_prnt_typ,
				"cst_prnt_typ",
				cst_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$acst_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$acst_prnt_typ,
				"acst_prnt_typ",
				acst_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bcst_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bcst_prnt_typ,
				"bcst_prnt_typ",
				bcst_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$rcst_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$rcst_prnt_typ,
				"rcst_prnt_typ",
				rcst_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$sppl_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_prnt_typ,
				"sppl_prnt_typ",
				sppl_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$asppl_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$asppl_prnt_typ,
				"asppl_prnt_typ",
				asppl_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$bsppl_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bsppl_prnt_typ,
				"bsppl_prnt_typ",
				bsppl_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$psppl_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$psppl_prnt_typ,
				"psppl_prnt_typ",
				psppl_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$dlv_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$dlv_prnt_typ,
				"dlv_prnt_typ",
				dlv_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo1,
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
			MBT_BP_IF_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo2,
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
			MBT_BP_IF_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo3,
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
			MBT_BP_IF_R.$if_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char1,
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
			MBT_BP_IF_R.$if_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char2,
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
			MBT_BP_IF_R.$if_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char3,
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
			MBT_BP_IF_R.$if_sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char4,
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
			MBT_BP_IF_R.$if_sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char5,
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
			MBT_BP_IF_R.$if_sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char6,
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
			MBT_BP_IF_R.$if_sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char7,
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
			MBT_BP_IF_R.$if_sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char8,
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
			MBT_BP_IF_R.$if_sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char9,
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
			MBT_BP_IF_R.$if_sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char10,
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
			MBT_BP_IF_R.$if_sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char11,
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
			MBT_BP_IF_R.$if_sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char12,
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
			MBT_BP_IF_R.$if_sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char13,
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
			MBT_BP_IF_R.$if_sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char14,
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
			MBT_BP_IF_R.$if_sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char15,
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
			MBT_BP_IF_R.$if_sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char16,
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
			MBT_BP_IF_R.$if_sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char17,
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
			MBT_BP_IF_R.$if_sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char18,
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
			MBT_BP_IF_R.$if_sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char19,
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
			MBT_BP_IF_R.$if_sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char20,
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
			MBT_BP_IF_R.$if_sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char21,
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
			MBT_BP_IF_R.$if_sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char22,
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
			MBT_BP_IF_R.$if_sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char23,
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
			MBT_BP_IF_R.$if_sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char24,
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
			MBT_BP_IF_R.$if_sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char25,
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
			MBT_BP_IF_R.$if_sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char26,
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
			MBT_BP_IF_R.$if_sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char27,
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
			MBT_BP_IF_R.$if_sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char28,
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
			MBT_BP_IF_R.$if_sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char29,
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
			MBT_BP_IF_R.$if_sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$if_sub_char30,
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
			MBT_BP_IF_R.$if_sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$if_sub_num1,
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
			MBT_BP_IF_R.$if_sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$if_sub_num2,
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
			MBT_BP_IF_R.$if_sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$if_sub_num3,
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
			MBT_BP_IF_R.$if_sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$if_sub_num4,
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
			MBT_BP_IF_R.$if_sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$if_sub_num5,
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
			MBT_BP_IF_R.$if_sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BP_IF_R.$if_sub_dt1,
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
			MBT_BP_IF_R.$if_sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BP_IF_R.$if_sub_dt2,
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
			MBT_BP_IF_R.$if_sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BP_IF_R.$if_sub_dt3,
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
			MBT_BP_IF_R.$if_sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BP_IF_R.$if_sub_dt4,
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
			MBT_BP_IF_R.$if_sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_BP_IF_R.$if_sub_dt5,
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
			MBT_BP_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$batch_log_no,
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
			MBT_BP_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$log_sub_key1,
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
			MBT_BP_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$log_sub_key2,
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
			MBT_BP_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ins_usr_id,
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
			MBT_BP_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ins_usr_nm,
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
			MBT_BP_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_BP_IF_R.$ins_ts,
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
			MBT_BP_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ins_func_id,
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
			MBT_BP_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BP_IF_R.$upd_cntr,
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
			MBT_BP_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$upd_usr_id,
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
			MBT_BP_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$upd_usr_nm,
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
			MBT_BP_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_BP_IF_R.$upd_ts,
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
			MBT_BP_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$upd_func_id,
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
			MBT_BP_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$upd_srv_req_no,
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
			MBT_BP_IF_R.$memo4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo4,
				"memo4",
				memo4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo5,
				"memo5",
				memo5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo6,
				"memo6",
				memo6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo7,
				"memo7",
				memo7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo8,
				"memo8",
				memo8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo9,
				"memo9",
				memo9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo10,
				"memo10",
				memo10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo11,
				"memo11",
				memo11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo12,
				"memo12",
				memo12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo13,
				"memo13",
				memo13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo14,
				"memo14",
				memo14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo15,
				"memo15",
				memo15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo16,
				"memo16",
				memo16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo17,
				"memo17",
				memo17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo18,
				"memo18",
				memo18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo19,
				"memo19",
				memo19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$memo20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$memo20,
				"memo20",
				memo20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$not_lg_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$not_lg_mix_flg,
				"not_lg_mix_flg",
				not_lg_mix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BP_IF_R.$not_lot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$not_lot_mix_flg,
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
			MBT_BP_IF_R.$not_sublot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BP_IF_R.$not_sublot_mix_flg,
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
			MBT_BP_IF_R.$cntry_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cntry_nm,
				"cntry_nm",
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
			MBT_BP_IF_R.$area_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$area_nm,
				"area_nm",
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
			MBT_BP_IF_R.$cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cur_nm,
				"cur_nm",
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
			MBT_BP_IF_R.$bp_grp_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_nm1,
				"bp_grp_nm1",
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
			MBT_BP_IF_R.$bp_grp_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_nm2,
				"bp_grp_nm2",
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
			MBT_BP_IF_R.$bp_grp_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_nm3,
				"bp_grp_nm3",
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
			MBT_BP_IF_R.$bp_grp_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_nm4,
				"bp_grp_nm4",
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
			MBT_BP_IF_R.$bp_grp_nm5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_nm5,
				"bp_grp_nm5",
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
			MBT_BP_IF_R.$bp_grp_nm6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_nm6,
				"bp_grp_nm6",
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
			MBT_BP_IF_R.$bp_grp_nm7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_nm7,
				"bp_grp_nm7",
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
			MBT_BP_IF_R.$bp_grp_nm8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_nm8,
				"bp_grp_nm8",
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
			MBT_BP_IF_R.$bp_grp_nm9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_nm9,
				"bp_grp_nm9",
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
			MBT_BP_IF_R.$bp_grp_nm10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bp_grp_nm10,
				"bp_grp_nm10",
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
			MBT_BP_IF_R.$acst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$acst_nm,
				"acst_nm",
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
			MBT_BP_IF_R.$ar_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ar_dpt_nm,
				"ar_dpt_nm",
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
			MBT_BP_IF_R.$cst_ship_form_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_ship_form_nm,
				"cst_ship_form_nm",
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
			MBT_BP_IF_R.$stk_lst_form_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$stk_lst_form_nm,
				"stk_lst_form_nm",
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
			MBT_BP_IF_R.$sls_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_tax_nm,
				"sls_tax_nm",
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
			MBT_BP_IF_R.$cst_tterm_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_tterm_nm1,
				"cst_tterm_nm1",
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
			MBT_BP_IF_R.$cst_tterm_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_tterm_nm2,
				"cst_tterm_nm2",
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
			MBT_BP_IF_R.$cst_tterm_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$cst_tterm_nm3,
				"cst_tterm_nm3",
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
			MBT_BP_IF_R.$sls_anly_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_anly_nm1,
				"sls_anly_nm1",
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
			MBT_BP_IF_R.$sls_anly_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_anly_nm2,
				"sls_anly_nm2",
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
			MBT_BP_IF_R.$sls_anly_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sls_anly_nm3,
				"sls_anly_nm3",
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
			MBT_BP_IF_R.$bcst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bcst_nm,
				"bcst_nm",
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
			MBT_BP_IF_R.$rcst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$rcst_nm,
				"rcst_nm",
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
			MBT_BP_IF_R.$ar_cred_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ar_cred_nm,
				"ar_cred_nm",
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
			MBT_BP_IF_R.$bcst_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bcst_dpt_nm,
				"bcst_dpt_nm",
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
			MBT_BP_IF_R.$bill_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bill_cal_nm,
				"bill_cal_nm",
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
			MBT_BP_IF_R.$ar_setoff_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ar_setoff_grp_nm,
				"ar_setoff_grp_nm",
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
			MBT_BP_IF_R.$lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$lg_grp_nm,
				"lg_grp_nm",
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
			MBT_BP_IF_R.$dlv_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$dlv_cal_nm,
				"dlv_cal_nm",
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
			MBT_BP_IF_R.$asppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$asppl_nm,
				"asppl_nm",
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
			MBT_BP_IF_R.$vmi_purc_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$vmi_purc_dpt_nm,
				"vmi_purc_dpt_nm",
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
			MBT_BP_IF_R.$po_print_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$po_print_nm,
				"po_print_nm",
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
			MBT_BP_IF_R.$sppl_ship_form_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_ship_form_nm,
				"sppl_ship_form_nm",
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
			MBT_BP_IF_R.$purc_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$purc_tax_nm,
				"purc_tax_nm",
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
			MBT_BP_IF_R.$prov_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$prov_tax_nm,
				"prov_tax_nm",
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
			MBT_BP_IF_R.$sppl_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_cal_nm,
				"sppl_cal_nm",
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
			MBT_BP_IF_R.$sppl_tterm_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_tterm_nm1,
				"sppl_tterm_nm1",
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
			MBT_BP_IF_R.$sppl_tterm_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_tterm_nm2,
				"sppl_tterm_nm2",
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
			MBT_BP_IF_R.$sppl_tterm_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$sppl_tterm_nm3,
				"sppl_tterm_nm3",
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
			MBT_BP_IF_R.$bsppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bsppl_nm,
				"bsppl_nm",
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
			MBT_BP_IF_R.$ap_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ap_dpt_nm,
				"ap_dpt_nm",
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
			MBT_BP_IF_R.$psppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$psppl_nm,
				"psppl_nm",
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
			MBT_BP_IF_R.$ap_cred_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ap_cred_nm,
				"ap_cred_nm",
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
			MBT_BP_IF_R.$bsppl_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$bsppl_dpt_nm,
				"bsppl_dpt_nm",
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
			MBT_BP_IF_R.$ap_setoff_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$ap_setoff_grp_nm,
				"ap_setoff_grp_nm",
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
			MBT_BP_IF_R.$pay_bank_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_bank_ac_nm,
				"pay_bank_ac_nm",
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
			MBT_BP_IF_R.$pay_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BP_IF_R.$pay_dpt_nm,
				"pay_dpt_nm",
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
	public static MBT_BP_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBT_BP_IF_R create(String alias) {
		MBT_BP_IF_R row = new MBT_BP_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBT_BP_IF_R createByName(T proto) {
		MBT_BP_IF_R row = MBT_BP_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_BP_IF_R clone() {
		return (MBT_BP_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_BP_IF_R createInstance() {
		return (MBT_BP_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_BP_IF_R getValues(String... names) {
		return (MBT_BP_IF_R) super.getValues(names);
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
	 public MBW_BP_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MBW_BP_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MBW_BP_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MBW_BP_IF_KEY_R.TABLE_NAME);
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
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 5, $data_make_dt);
	}

	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 5, $data_make_dt, value);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public boolean imp_flg() {
		return getConstBoolean(offset + 6, $imp_flg);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public void imp_flg(boolean value) {
		setConstBoolean(offset + 6, $imp_flg, value);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 7, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 7, $bp_cd, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 8, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 8, $del_flg, value);
	}

	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 9, $bp_nm);
	}

	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 9, $bp_nm, value);
	}

	/**
	 * 取引先別名１. BP alias name 1.<p>
	 *
	 */
	public String bp_alt_nm1() {
		return getConstString(offset + 10, $bp_alt_nm1);
	}

	/**
	 * 取引先別名１. BP alias name 1.<p>
	 *
	 */
	public void bp_alt_nm1(String value) {
		setConstString(offset + 10, $bp_alt_nm1, value);
	}

	/**
	 * 取引先別名２. BP alias name 2.<p>
	 *
	 */
	public String bp_alt_nm2() {
		return getConstString(offset + 11, $bp_alt_nm2);
	}

	/**
	 * 取引先別名２. BP alias name 2.<p>
	 *
	 */
	public void bp_alt_nm2(String value) {
		setConstString(offset + 11, $bp_alt_nm2, value);
	}

	/**
	 * 取引先別名３. BP alias name 3.<p>
	 *
	 */
	public String bp_alt_nm3() {
		return getConstString(offset + 12, $bp_alt_nm3);
	}

	/**
	 * 取引先別名３. BP alias name 3.<p>
	 *
	 */
	public void bp_alt_nm3(String value) {
		setConstString(offset + 12, $bp_alt_nm3, value);
	}

	/**
	 * 取引先別名４. BP alias name 4.<p>
	 *
	 */
	public String bp_alt_nm4() {
		return getConstString(offset + 13, $bp_alt_nm4);
	}

	/**
	 * 取引先別名４. BP alias name 4.<p>
	 *
	 */
	public void bp_alt_nm4(String value) {
		setConstString(offset + 13, $bp_alt_nm4, value);
	}

	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 14, $zip_cd);
	}

	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 14, $zip_cd, value);
	}

	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 15, $addr1);
	}

	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 15, $addr1, value);
	}

	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 16, $addr2);
	}

	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 16, $addr2, value);
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
	 * 住所４. Address 4.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 18, $addr4);
	}

	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 18, $addr4, value);
	}

	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 19, $tel);
	}

	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 19, $tel, value);
	}

	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 20, $fax);
	}

	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 20, $fax, value);
	}

	/**
	 * 法人番号. Corporation number.<p>
	 *
	 */
	public String ein() {
		return getConstString(offset + 21, $ein);
	}

	/**
	 * 法人番号. Corporation number.<p>
	 *
	 */
	public void ein(String value) {
		setConstString(offset + 21, $ein, value);
	}

	/**
	 * 標準企業コード. Standard company code.<p>
	 *
	 */
	public String std_co_cd() {
		return getConstString(offset + 22, $std_co_cd);
	}

	/**
	 * 標準企業コード. Standard company code.<p>
	 *
	 */
	public void std_co_cd(String value) {
		setConstString(offset + 22, $std_co_cd, value);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 23, $cntry_cd);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 23, $cntry_cd, value);
	}

	/**
	 * 地域ＣＤ. Region cd..<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 24, $area_cd);
	}

	/**
	 * 地域ＣＤ. Region cd..<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 24, $area_cd, value);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 25, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 25, $cur_cd, value);
	}

	/**
	 * 帳票出力ロケールＣＤ. Report output locale cd..<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 26, $prnt_lcl_cd);
	}

	/**
	 * 帳票出力ロケールＣＤ. Report output locale cd..<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 26, $prnt_lcl_cd, value);
	}

	/**
	 * 取引先分類ＣＤ１. BP classification cd. 1.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 27, $bp_grp_cd1);
	}

	/**
	 * 取引先分類ＣＤ１. BP classification cd. 1.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 27, $bp_grp_cd1, value);
	}

	/**
	 * 取引先分類ＣＤ２. BP classification cd. 2.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 28, $bp_grp_cd2);
	}

	/**
	 * 取引先分類ＣＤ２. BP classification cd. 2.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 28, $bp_grp_cd2, value);
	}

	/**
	 * 取引先分類ＣＤ３. BP classification cd. 3.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 29, $bp_grp_cd3);
	}

	/**
	 * 取引先分類ＣＤ３. BP classification cd. 3.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 29, $bp_grp_cd3, value);
	}

	/**
	 * 取引先分類ＣＤ４. BP classification cd. 4.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 30, $bp_grp_cd4);
	}

	/**
	 * 取引先分類ＣＤ４. BP classification cd. 4.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 30, $bp_grp_cd4, value);
	}

	/**
	 * 取引先分類ＣＤ５. BP classification cd. 5.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 31, $bp_grp_cd5);
	}

	/**
	 * 取引先分類ＣＤ５. BP classification cd. 5.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 31, $bp_grp_cd5, value);
	}

	/**
	 * 取引先分類ＣＤ６. BP classification cd. 6.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 32, $bp_grp_cd6);
	}

	/**
	 * 取引先分類ＣＤ６. BP classification cd. 6.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 32, $bp_grp_cd6, value);
	}

	/**
	 * 取引先分類ＣＤ７. BP classification cd. 7.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 33, $bp_grp_cd7);
	}

	/**
	 * 取引先分類ＣＤ７. BP classification cd. 7.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 33, $bp_grp_cd7, value);
	}

	/**
	 * 取引先分類ＣＤ８. BP classification cd. 8.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 34, $bp_grp_cd8);
	}

	/**
	 * 取引先分類ＣＤ８. BP classification cd. 8.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 34, $bp_grp_cd8, value);
	}

	/**
	 * 取引先分類ＣＤ９. BP classification cd. 9.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 35, $bp_grp_cd9);
	}

	/**
	 * 取引先分類ＣＤ９. BP classification cd. 9.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 35, $bp_grp_cd9, value);
	}

	/**
	 * 取引先分類ＣＤ１０. BP classification cd. 10.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 36, $bp_grp_cd10);
	}

	/**
	 * 取引先分類ＣＤ１０. BP classification cd. 10.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 36, $bp_grp_cd10, value);
	}

	/**
	 * 取引先配賦グループ. BP allocation group.<p>
	 *
	 */
	public String bp_alc_grp() {
		return getConstString(offset + 37, $bp_alc_grp);
	}

	/**
	 * 取引先配賦グループ. BP allocation group.<p>
	 *
	 */
	public void bp_alc_grp(String value) {
		setConstString(offset + 37, $bp_alc_grp, value);
	}

	/**
	 * 得意先ＦＬＧ. Customer flg..<p>
	 *
	 */
	public boolean cst_flg() {
		return getConstBoolean(offset + 38, $cst_flg);
	}

	/**
	 * 得意先ＦＬＧ. Customer flg..<p>
	 *
	 */
	public void cst_flg(boolean value) {
		setConstBoolean(offset + 38, $cst_flg, value);
	}

	/**
	 * 売掛先ＦＬＧ. AR customer flg..<p>
	 *
	 */
	public boolean acst_flg() {
		return getConstBoolean(offset + 39, $acst_flg);
	}

	/**
	 * 売掛先ＦＬＧ. AR customer flg..<p>
	 *
	 */
	public void acst_flg(boolean value) {
		setConstBoolean(offset + 39, $acst_flg, value);
	}

	/**
	 * 請求先ＦＬＧ. Billing customer flg..<p>
	 *
	 */
	public boolean bcst_flg() {
		return getConstBoolean(offset + 40, $bcst_flg);
	}

	/**
	 * 請求先ＦＬＧ. Billing customer flg..<p>
	 *
	 */
	public void bcst_flg(boolean value) {
		setConstBoolean(offset + 40, $bcst_flg, value);
	}

	/**
	 * 入金先ＦＬＧ. Payer flg..<p>
	 *
	 */
	public boolean rcst_flg() {
		return getConstBoolean(offset + 41, $rcst_flg);
	}

	/**
	 * 入金先ＦＬＧ. Payer flg..<p>
	 *
	 */
	public void rcst_flg(boolean value) {
		setConstBoolean(offset + 41, $rcst_flg, value);
	}

	/**
	 * 発注先ＦＬＧ. Supplier flg..<p>
	 *
	 */
	public boolean sppl_flg() {
		return getConstBoolean(offset + 42, $sppl_flg);
	}

	/**
	 * 発注先ＦＬＧ. Supplier flg..<p>
	 *
	 */
	public void sppl_flg(boolean value) {
		setConstBoolean(offset + 42, $sppl_flg, value);
	}

	/**
	 * 買掛先ＦＬＧ. AP supplier flg..<p>
	 *
	 */
	public boolean asppl_flg() {
		return getConstBoolean(offset + 43, $asppl_flg);
	}

	/**
	 * 買掛先ＦＬＧ. AP supplier flg..<p>
	 *
	 */
	public void asppl_flg(boolean value) {
		setConstBoolean(offset + 43, $asppl_flg, value);
	}

	/**
	 * 支払予定管理先ＦＬＧ. Scheduled payee flg..<p>
	 *
	 */
	public boolean bsppl_flg() {
		return getConstBoolean(offset + 44, $bsppl_flg);
	}

	/**
	 * 支払予定管理先ＦＬＧ. Scheduled payee flg..<p>
	 *
	 */
	public void bsppl_flg(boolean value) {
		setConstBoolean(offset + 44, $bsppl_flg, value);
	}

	/**
	 * 支払先ＦＬＧ. Payee flg..<p>
	 *
	 */
	public boolean psppl_flg() {
		return getConstBoolean(offset + 45, $psppl_flg);
	}

	/**
	 * 支払先ＦＬＧ. Payee flg..<p>
	 *
	 */
	public void psppl_flg(boolean value) {
		setConstBoolean(offset + 45, $psppl_flg, value);
	}

	/**
	 * 与信管理先ＦＬＧ. Credit managed BP flg..<p>
	 *
	 */
	public boolean cred_flg() {
		return getConstBoolean(offset + 46, $cred_flg);
	}

	/**
	 * 与信管理先ＦＬＧ. Credit managed BP flg..<p>
	 *
	 */
	public void cred_flg(boolean value) {
		setConstBoolean(offset + 46, $cred_flg, value);
	}

	/**
	 * 納品先ＦＬＧ. Delivery destination flg..<p>
	 *
	 */
	public boolean dlv_flg() {
		return getConstBoolean(offset + 47, $dlv_flg);
	}

	/**
	 * 納品先ＦＬＧ. Delivery destination flg..<p>
	 *
	 */
	public void dlv_flg(boolean value) {
		setConstBoolean(offset + 47, $dlv_flg, value);
	}

	/**
	 * メーカＦＬＧ. Maker flg..<p>
	 *
	 */
	public boolean maker_flg() {
		return getConstBoolean(offset + 48, $maker_flg);
	}

	/**
	 * メーカＦＬＧ. Maker flg..<p>
	 *
	 */
	public void maker_flg(boolean value) {
		setConstBoolean(offset + 48, $maker_flg, value);
	}

	/**
	 * 仕向先ＦＬＧ. Distribution channel flg..<p>
	 *
	 */
	public boolean dest_flg() {
		return getConstBoolean(offset + 49, $dest_flg);
	}

	/**
	 * 仕向先ＦＬＧ. Distribution channel flg..<p>
	 *
	 */
	public void dest_flg(boolean value) {
		setConstBoolean(offset + 49, $dest_flg, value);
	}

	/**
	 * 全社ＦＬＧ. Company-wide flg..<p>
	 *
	 */
	public boolean all_com_flg() {
		return getConstBoolean(offset + 50, $all_com_flg);
	}

	/**
	 * 全社ＦＬＧ. Company-wide flg..<p>
	 *
	 */
	public void all_com_flg(boolean value) {
		setConstBoolean(offset + 50, $all_com_flg, value);
	}

	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 51, $acst_cd);
	}

	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 51, $acst_cd, value);
	}

	/**
	 * 債権部門区分. AR dept. type.<p>
	 *
	 */
	public String ar_dpt_typ() {
		return getConstString(offset + 52, $ar_dpt_typ);
	}

	/**
	 * 債権部門区分. AR dept. type.<p>
	 *
	 */
	public void ar_dpt_typ(String value) {
		setConstString(offset + 52, $ar_dpt_typ, value);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 53, $ar_dpt_cd);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 53, $ar_dpt_cd, value);
	}

	/**
	 * 得意先部署. Customer dept..<p>
	 *
	 */
	public String cst_cntct_dpt() {
		return getConstString(offset + 54, $cst_cntct_dpt);
	}

	/**
	 * 得意先部署. Customer dept..<p>
	 *
	 */
	public void cst_cntct_dpt(String value) {
		setConstString(offset + 54, $cst_cntct_dpt, value);
	}

	/**
	 * 得意先担当者. Customer PIC.<p>
	 *
	 */
	public String cst_cntct_psn() {
		return getConstString(offset + 55, $cst_cntct_psn);
	}

	/**
	 * 得意先担当者. Customer PIC.<p>
	 *
	 */
	public void cst_cntct_psn(String value) {
		setConstString(offset + 55, $cst_cntct_psn, value);
	}

	/**
	 * 得意先担当者敬称. Form of address for Customer PIC.<p>
	 *
	 */
	public String cst_cntct_psn_title() {
		return getConstString(offset + 56, $cst_cntct_psn_title);
	}

	/**
	 * 得意先担当者敬称. Form of address for Customer PIC.<p>
	 *
	 */
	public void cst_cntct_psn_title(String value) {
		setConstString(offset + 56, $cst_cntct_psn_title, value);
	}

	/**
	 * 得意先諸口ＦＬＧ. Miscellaneous customer flg..<p>
	 *
	 */
	public boolean cst_sundry_flg() {
		return getConstBoolean(offset + 57, $cst_sundry_flg);
	}

	/**
	 * 得意先諸口ＦＬＧ. Miscellaneous customer flg..<p>
	 *
	 */
	public void cst_sundry_flg(boolean value) {
		setConstBoolean(offset + 57, $cst_sundry_flg, value);
	}

	/**
	 * 販売単価取得区分. Sales unit price acquisition type.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 58, $sls_upri_req_typ);
	}

	/**
	 * 販売単価取得区分. Sales unit price acquisition type.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 58, $sls_upri_req_typ, value);
	}

	/**
	 * 販売単価変更許可ＦＬＧ. Allow sales unit price change flg..<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 59, $sls_upri_cng_flg);
	}

	/**
	 * 販売単価変更許可ＦＬＧ. Allow sales unit price change flg..<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 59, $sls_upri_cng_flg, value);
	}

	/**
	 * 販売単価端数処理区分. Sales unit price rounding type.<p>
	 *
	 */
	public String sls_upri_rnd_typ() {
		return getConstString(offset + 60, $sls_upri_rnd_typ);
	}

	/**
	 * 販売単価端数処理区分. Sales unit price rounding type.<p>
	 *
	 */
	public void sls_upri_rnd_typ(String value) {
		setConstString(offset + 60, $sls_upri_rnd_typ, value);
	}

	/**
	 * 売上金額端数処理区分. Rounding type (Sales amount).<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 61, $sls_amt_rnd_typ);
	}

	/**
	 * 売上金額端数処理区分. Rounding type (Sales amount).<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 61, $sls_amt_rnd_typ, value);
	}

	/**
	 * 売上税計算区分. Sales tax calculation type.<p>
	 *
	 */
	public String sls_tax_calc_typ() {
		return getConstString(offset + 62, $sls_tax_calc_typ);
	}

	/**
	 * 売上税計算区分. Sales tax calculation type.<p>
	 *
	 */
	public void sls_tax_calc_typ(String value) {
		setConstString(offset + 62, $sls_tax_calc_typ, value);
	}

	/**
	 * 売上税額端数処理区分. Sales tax rounding type.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 63, $sls_tax_rnd_typ);
	}

	/**
	 * 売上税額端数処理区分. Sales tax rounding type.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 63, $sls_tax_rnd_typ, value);
	}

	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 64, $sls_basis_typ);
	}

	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 64, $sls_basis_typ, value);
	}

	/**
	 * 請求起算区分. Billing initial base type.<p>
	 *
	 */
	public String bill_basis_typ() {
		return getConstString(offset + 65, $bill_basis_typ);
	}

	/**
	 * 請求起算区分. Billing initial base type.<p>
	 *
	 */
	public void bill_basis_typ(String value) {
		setConstString(offset + 65, $bill_basis_typ, value);
	}

	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 66, $ship_schd_split_typ);
	}

	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 66, $ship_schd_split_typ, value);
	}

	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 67, $bill_crryovr_times);
	}

	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 67, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 67, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 67, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 67, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 67, $bill_crryovr_times, value);
	}
	
	/**
	 * ロット逆転禁止区分. Lot reverse prohibit type.<p>
	 *
	 */
	public String lot_back_stop_typ() {
		return getConstString(offset + 68, $lot_back_stop_typ);
	}

	/**
	 * ロット逆転禁止区分. Lot reverse prohibit type.<p>
	 *
	 */
	public void lot_back_stop_typ(String value) {
		setConstString(offset + 68, $lot_back_stop_typ, value);
	}

	/**
	 * ロット明細分割区分. Lot details split type.<p>
	 *
	 */
	public String slip_each_lot_typ() {
		return getConstString(offset + 69, $slip_each_lot_typ);
	}

	/**
	 * ロット明細分割区分. Lot details split type.<p>
	 *
	 */
	public void slip_each_lot_typ(String value) {
		setConstString(offset + 69, $slip_each_lot_typ, value);
	}

	/**
	 * 得意先納品書ＣＤ. Customer delivery note cd..<p>
	 *
	 */
	public String cst_ship_form_cd() {
		return getConstString(offset + 70, $cst_ship_form_cd);
	}

	/**
	 * 得意先納品書ＣＤ. Customer delivery note cd..<p>
	 *
	 */
	public void cst_ship_form_cd(String value) {
		setConstString(offset + 70, $cst_ship_form_cd, value);
	}

	/**
	 * 現品票発行ＦＬＧ. Identification tag issue flg..<p>
	 *
	 */
	public boolean stk_lst_issue_flg() {
		return getConstBoolean(offset + 71, $stk_lst_issue_flg);
	}

	/**
	 * 現品票発行ＦＬＧ. Identification tag issue flg..<p>
	 *
	 */
	public void stk_lst_issue_flg(boolean value) {
		setConstBoolean(offset + 71, $stk_lst_issue_flg, value);
	}

	/**
	 * 現品票ＣＤ. Identification tag cd..<p>
	 *
	 */
	public String stk_lst_form_cd() {
		return getConstString(offset + 72, $stk_lst_form_cd);
	}

	/**
	 * 現品票ＣＤ. Identification tag cd..<p>
	 *
	 */
	public void stk_lst_form_cd(String value) {
		setConstString(offset + 72, $stk_lst_form_cd, value);
	}

	/**
	 * 売上税ＣＤ. Sales tax cd..<p>
	 *
	 */
	public String sls_tax_cd() {
		return getConstString(offset + 73, $sls_tax_cd);
	}

	/**
	 * 売上税ＣＤ. Sales tax cd..<p>
	 *
	 */
	public void sls_tax_cd(String value) {
		setConstString(offset + 73, $sls_tax_cd, value);
	}

	/**
	 * 売上税優先ＦＬＧ. Sales tax priority flg..<p>
	 *
	 */
	public boolean sls_tax_cd_prio_flg() {
		return getConstBoolean(offset + 74, $sls_tax_cd_prio_flg);
	}

	/**
	 * 売上税優先ＦＬＧ. Sales tax priority flg..<p>
	 *
	 */
	public void sls_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 74, $sls_tax_cd_prio_flg, value);
	}

	/**
	 * 案件別債権管理ＦＬＧ. AR management by sales project flg..<p>
	 *
	 */
	public boolean wrk_ar_flg() {
		return getConstBoolean(offset + 75, $wrk_ar_flg);
	}

	/**
	 * 案件別債権管理ＦＬＧ. AR management by sales project flg..<p>
	 *
	 */
	public void wrk_ar_flg(boolean value) {
		setConstBoolean(offset + 75, $wrk_ar_flg, value);
	}

	/**
	 * 得意先インボイス取引ＦＬＧ. Customer invoice transaction flg..<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 76, $cst_iv_flg);
	}

	/**
	 * 得意先インボイス取引ＦＬＧ. Customer invoice transaction flg..<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 76, $cst_iv_flg, value);
	}

	/**
	 * 出荷ＬＴ（需要情報用）. Shipping LT (For demand).<p>
	 *
	 */
	public MCNumber ship_lt() {
		return getConstNumber(offset + 77, $ship_lt);
	}

	/**
	 * 出荷ＬＴ（需要情報用）. Shipping LT (For demand).<p>
	 *
	 */
	public void ship_lt(MCNumber value) {
		setConstNumber(offset + 77, $ship_lt, value);
	}
	
	/**
	 * 出荷ＬＴ（需要情報用）. Shipping LT (For demand).<p>
	 *
	 */
	public void ship_lt(int value) {
		setConstNumber(offset + 77, $ship_lt, value);
	}
	
	/**
	 * 出荷ＬＴ（需要情報用）. Shipping LT (For demand).<p>
	 *
	 */
	public void ship_lt(long value) {
		setConstNumber(offset + 77, $ship_lt, value);
	}
	
	/**
	 * 出荷ＬＴ（需要情報用）. Shipping LT (For demand).<p>
	 *
	 */
	public void ship_lt(float value) {
		setConstNumber(offset + 77, $ship_lt, value);
	}
	
	/**
	 * 出荷ＬＴ（需要情報用）. Shipping LT (For demand).<p>
	 *
	 */
	public void ship_lt(double value) {
		setConstNumber(offset + 77, $ship_lt, value);
	}
	
	/**
	 * 得意先取引条件ＣＤ１. Customer transaction terms cd. 1.<p>
	 *
	 */
	public String cst_tterm_cd1() {
		return getConstString(offset + 78, $cst_tterm_cd1);
	}

	/**
	 * 得意先取引条件ＣＤ１. Customer transaction terms cd. 1.<p>
	 *
	 */
	public void cst_tterm_cd1(String value) {
		setConstString(offset + 78, $cst_tterm_cd1, value);
	}

	/**
	 * 得意先取引条件ＣＤ２. Customer transaction terms cd. 2.<p>
	 *
	 */
	public String cst_tterm_cd2() {
		return getConstString(offset + 79, $cst_tterm_cd2);
	}

	/**
	 * 得意先取引条件ＣＤ２. Customer transaction terms cd. 2.<p>
	 *
	 */
	public void cst_tterm_cd2(String value) {
		setConstString(offset + 79, $cst_tterm_cd2, value);
	}

	/**
	 * 得意先取引条件ＣＤ３. Customer transaction terms cd. 3.<p>
	 *
	 */
	public String cst_tterm_cd3() {
		return getConstString(offset + 80, $cst_tterm_cd3);
	}

	/**
	 * 得意先取引条件ＣＤ３. Customer transaction terms cd. 3.<p>
	 *
	 */
	public void cst_tterm_cd3(String value) {
		setConstString(offset + 80, $cst_tterm_cd3, value);
	}

	/**
	 * 販売分析ＣＤ１. Sales analysis cd. 1.<p>
	 *
	 */
	public String sls_anly_cd1() {
		return getConstString(offset + 81, $sls_anly_cd1);
	}

	/**
	 * 販売分析ＣＤ１. Sales analysis cd. 1.<p>
	 *
	 */
	public void sls_anly_cd1(String value) {
		setConstString(offset + 81, $sls_anly_cd1, value);
	}

	/**
	 * 販売分析ＣＤ２. Sales analysis cd. 2.<p>
	 *
	 */
	public String sls_anly_cd2() {
		return getConstString(offset + 82, $sls_anly_cd2);
	}

	/**
	 * 販売分析ＣＤ２. Sales analysis cd. 2.<p>
	 *
	 */
	public void sls_anly_cd2(String value) {
		setConstString(offset + 82, $sls_anly_cd2, value);
	}

	/**
	 * 販売分析ＣＤ３. Sales analysis cd. 3.<p>
	 *
	 */
	public String sls_anly_cd3() {
		return getConstString(offset + 83, $sls_anly_cd3);
	}

	/**
	 * 販売分析ＣＤ３. Sales analysis cd. 3.<p>
	 *
	 */
	public void sls_anly_cd3(String value) {
		setConstString(offset + 83, $sls_anly_cd3, value);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 84, $bcst_cd);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 84, $bcst_cd, value);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 85, $rcst_cd);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 85, $rcst_cd, value);
	}

	/**
	 * 債権与信管理先ＣＤ. AR credit managed BP cd..<p>
	 *
	 */
	public String ar_cred_cd() {
		return getConstString(offset + 86, $ar_cred_cd);
	}

	/**
	 * 債権与信管理先ＣＤ. AR credit managed BP cd..<p>
	 *
	 */
	public void ar_cred_cd(String value) {
		setConstString(offset + 86, $ar_cred_cd, value);
	}

	/**
	 * 請求部門区分. Billing dept. type.<p>
	 *
	 */
	public String bill_dpt_typ() {
		return getConstString(offset + 87, $bill_dpt_typ);
	}

	/**
	 * 請求部門区分. Billing dept. type.<p>
	 *
	 */
	public void bill_dpt_typ(String value) {
		setConstString(offset + 87, $bill_dpt_typ, value);
	}

	/**
	 * 請求先担当部門ＣＤ. Billing customer dept. in charge cd..<p>
	 *
	 */
	public String bcst_dpt_cd() {
		return getConstString(offset + 88, $bcst_dpt_cd);
	}

	/**
	 * 請求先担当部門ＣＤ. Billing customer dept. in charge cd..<p>
	 *
	 */
	public void bcst_dpt_cd(String value) {
		setConstString(offset + 88, $bcst_dpt_cd, value);
	}

	/**
	 * 請求締処理区分. Billing closing type.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 89, $bill_cl_typ);
	}

	/**
	 * 請求締処理区分. Billing closing type.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 89, $bill_cl_typ, value);
	}

	/**
	 * 請求締日１. Billing closing day 1.<p>
	 *
	 */
	public MCNumber bill_cl_day1() {
		return getConstNumber(offset + 90, $bill_cl_day1);
	}

	/**
	 * 請求締日１. Billing closing day 1.<p>
	 *
	 */
	public void bill_cl_day1(MCNumber value) {
		setConstNumber(offset + 90, $bill_cl_day1, value);
	}
	
	/**
	 * 請求締日１. Billing closing day 1.<p>
	 *
	 */
	public void bill_cl_day1(int value) {
		setConstNumber(offset + 90, $bill_cl_day1, value);
	}
	
	/**
	 * 請求締日１. Billing closing day 1.<p>
	 *
	 */
	public void bill_cl_day1(long value) {
		setConstNumber(offset + 90, $bill_cl_day1, value);
	}
	
	/**
	 * 請求締日１. Billing closing day 1.<p>
	 *
	 */
	public void bill_cl_day1(float value) {
		setConstNumber(offset + 90, $bill_cl_day1, value);
	}
	
	/**
	 * 請求締日１. Billing closing day 1.<p>
	 *
	 */
	public void bill_cl_day1(double value) {
		setConstNumber(offset + 90, $bill_cl_day1, value);
	}
	
	/**
	 * 請求締日２. Billing closing day 2.<p>
	 *
	 */
	public MCNumber bill_cl_day2() {
		return getConstNumber(offset + 91, $bill_cl_day2);
	}

	/**
	 * 請求締日２. Billing closing day 2.<p>
	 *
	 */
	public void bill_cl_day2(MCNumber value) {
		setConstNumber(offset + 91, $bill_cl_day2, value);
	}
	
	/**
	 * 請求締日２. Billing closing day 2.<p>
	 *
	 */
	public void bill_cl_day2(int value) {
		setConstNumber(offset + 91, $bill_cl_day2, value);
	}
	
	/**
	 * 請求締日２. Billing closing day 2.<p>
	 *
	 */
	public void bill_cl_day2(long value) {
		setConstNumber(offset + 91, $bill_cl_day2, value);
	}
	
	/**
	 * 請求締日２. Billing closing day 2.<p>
	 *
	 */
	public void bill_cl_day2(float value) {
		setConstNumber(offset + 91, $bill_cl_day2, value);
	}
	
	/**
	 * 請求締日２. Billing closing day 2.<p>
	 *
	 */
	public void bill_cl_day2(double value) {
		setConstNumber(offset + 91, $bill_cl_day2, value);
	}
	
	/**
	 * 請求締日３. Billing closing day 3.<p>
	 *
	 */
	public MCNumber bill_cl_day3() {
		return getConstNumber(offset + 92, $bill_cl_day3);
	}

	/**
	 * 請求締日３. Billing closing day 3.<p>
	 *
	 */
	public void bill_cl_day3(MCNumber value) {
		setConstNumber(offset + 92, $bill_cl_day3, value);
	}
	
	/**
	 * 請求締日３. Billing closing day 3.<p>
	 *
	 */
	public void bill_cl_day3(int value) {
		setConstNumber(offset + 92, $bill_cl_day3, value);
	}
	
	/**
	 * 請求締日３. Billing closing day 3.<p>
	 *
	 */
	public void bill_cl_day3(long value) {
		setConstNumber(offset + 92, $bill_cl_day3, value);
	}
	
	/**
	 * 請求締日３. Billing closing day 3.<p>
	 *
	 */
	public void bill_cl_day3(float value) {
		setConstNumber(offset + 92, $bill_cl_day3, value);
	}
	
	/**
	 * 請求締日３. Billing closing day 3.<p>
	 *
	 */
	public void bill_cl_day3(double value) {
		setConstNumber(offset + 92, $bill_cl_day3, value);
	}
	
	/**
	 * 請求締日４. Billing closing day 4.<p>
	 *
	 */
	public MCNumber bill_cl_day4() {
		return getConstNumber(offset + 93, $bill_cl_day4);
	}

	/**
	 * 請求締日４. Billing closing day 4.<p>
	 *
	 */
	public void bill_cl_day4(MCNumber value) {
		setConstNumber(offset + 93, $bill_cl_day4, value);
	}
	
	/**
	 * 請求締日４. Billing closing day 4.<p>
	 *
	 */
	public void bill_cl_day4(int value) {
		setConstNumber(offset + 93, $bill_cl_day4, value);
	}
	
	/**
	 * 請求締日４. Billing closing day 4.<p>
	 *
	 */
	public void bill_cl_day4(long value) {
		setConstNumber(offset + 93, $bill_cl_day4, value);
	}
	
	/**
	 * 請求締日４. Billing closing day 4.<p>
	 *
	 */
	public void bill_cl_day4(float value) {
		setConstNumber(offset + 93, $bill_cl_day4, value);
	}
	
	/**
	 * 請求締日４. Billing closing day 4.<p>
	 *
	 */
	public void bill_cl_day4(double value) {
		setConstNumber(offset + 93, $bill_cl_day4, value);
	}
	
	/**
	 * 請求締日５. Billing closing day 5.<p>
	 *
	 */
	public MCNumber bill_cl_day5() {
		return getConstNumber(offset + 94, $bill_cl_day5);
	}

	/**
	 * 請求締日５. Billing closing day 5.<p>
	 *
	 */
	public void bill_cl_day5(MCNumber value) {
		setConstNumber(offset + 94, $bill_cl_day5, value);
	}
	
	/**
	 * 請求締日５. Billing closing day 5.<p>
	 *
	 */
	public void bill_cl_day5(int value) {
		setConstNumber(offset + 94, $bill_cl_day5, value);
	}
	
	/**
	 * 請求締日５. Billing closing day 5.<p>
	 *
	 */
	public void bill_cl_day5(long value) {
		setConstNumber(offset + 94, $bill_cl_day5, value);
	}
	
	/**
	 * 請求締日５. Billing closing day 5.<p>
	 *
	 */
	public void bill_cl_day5(float value) {
		setConstNumber(offset + 94, $bill_cl_day5, value);
	}
	
	/**
	 * 請求締日５. Billing closing day 5.<p>
	 *
	 */
	public void bill_cl_day5(double value) {
		setConstNumber(offset + 94, $bill_cl_day5, value);
	}
	
	/**
	 * 請求税計算ＦＬＧ. Billing tax calculation flg..<p>
	 *
	 */
	public boolean tax_on_bill_flg() {
		return getConstBoolean(offset + 95, $tax_on_bill_flg);
	}

	/**
	 * 請求税計算ＦＬＧ. Billing tax calculation flg..<p>
	 *
	 */
	public void tax_on_bill_flg(boolean value) {
		setConstBoolean(offset + 95, $tax_on_bill_flg, value);
	}

	/**
	 * 請求税額端数処理区分. Billing tax rounding type.<p>
	 *
	 */
	public String bill_tax_rnd_typ() {
		return getConstString(offset + 96, $bill_tax_rnd_typ);
	}

	/**
	 * 請求税額端数処理区分. Billing tax rounding type.<p>
	 *
	 */
	public void bill_tax_rnd_typ(String value) {
		setConstString(offset + 96, $bill_tax_rnd_typ, value);
	}

	/**
	 * 請求締遅延日数. Delayed days (Billing closing day).<p>
	 *
	 */
	public MCNumber bill_cl_delay_days() {
		return getConstNumber(offset + 97, $bill_cl_delay_days);
	}

	/**
	 * 請求締遅延日数. Delayed days (Billing closing day).<p>
	 *
	 */
	public void bill_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 97, $bill_cl_delay_days, value);
	}
	
	/**
	 * 請求締遅延日数. Delayed days (Billing closing day).<p>
	 *
	 */
	public void bill_cl_delay_days(int value) {
		setConstNumber(offset + 97, $bill_cl_delay_days, value);
	}
	
	/**
	 * 請求締遅延日数. Delayed days (Billing closing day).<p>
	 *
	 */
	public void bill_cl_delay_days(long value) {
		setConstNumber(offset + 97, $bill_cl_delay_days, value);
	}
	
	/**
	 * 請求締遅延日数. Delayed days (Billing closing day).<p>
	 *
	 */
	public void bill_cl_delay_days(float value) {
		setConstNumber(offset + 97, $bill_cl_delay_days, value);
	}
	
	/**
	 * 請求締遅延日数. Delayed days (Billing closing day).<p>
	 *
	 */
	public void bill_cl_delay_days(double value) {
		setConstNumber(offset + 97, $bill_cl_delay_days, value);
	}
	
	/**
	 * 請求締前後区分. Billing closing before/after type.<p>
	 *
	 */
	public String bill_cl_ba_typ() {
		return getConstString(offset + 98, $bill_cl_ba_typ);
	}

	/**
	 * 請求締前後区分. Billing closing before/after type.<p>
	 *
	 */
	public void bill_cl_ba_typ(String value) {
		setConstString(offset + 98, $bill_cl_ba_typ, value);
	}

	/**
	 * 売上仮単価締ＦＬＧ. Sales temporary unit price closing flg..<p>
	 *
	 */
	public boolean sls_interim_cl_flg() {
		return getConstBoolean(offset + 99, $sls_interim_cl_flg);
	}

	/**
	 * 売上仮単価締ＦＬＧ. Sales temporary unit price closing flg..<p>
	 *
	 */
	public void sls_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 99, $sls_interim_cl_flg, value);
	}

	/**
	 * 請求先カレンダＣＤ. Billing customer calendar cd..<p>
	 *
	 */
	public String bill_cal_cd() {
		return getConstString(offset + 100, $bill_cal_cd);
	}

	/**
	 * 請求先カレンダＣＤ. Billing customer calendar cd..<p>
	 *
	 */
	public void bill_cal_cd(String value) {
		setConstString(offset + 100, $bill_cal_cd, value);
	}

	/**
	 * 入金予定前後区分. Payment receipt schedule before/after type.<p>
	 *
	 */
	public String rcv_ba_typ() {
		return getConstString(offset + 101, $rcv_ba_typ);
	}

	/**
	 * 入金予定前後区分. Payment receipt schedule before/after type.<p>
	 *
	 */
	public void rcv_ba_typ(String value) {
		setConstString(offset + 101, $rcv_ba_typ, value);
	}

	/**
	 * 請求書送付郵便番号. Invoice send-to zip code.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 102, $bill_zip_cd);
	}

	/**
	 * 請求書送付郵便番号. Invoice send-to zip code.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 102, $bill_zip_cd, value);
	}

	/**
	 * 請求書送付住所１. Invoice send-to address 1.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 103, $bill_addr1);
	}

	/**
	 * 請求書送付住所１. Invoice send-to address 1.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 103, $bill_addr1, value);
	}

	/**
	 * 請求書送付住所２. Invoice send-to address 2.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 104, $bill_addr2);
	}

	/**
	 * 請求書送付住所２. Invoice send-to address 2.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 104, $bill_addr2, value);
	}

	/**
	 * 請求書送付住所３. Invoice send-to address 3.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 105, $bill_addr3);
	}

	/**
	 * 請求書送付住所３. Invoice send-to address 3.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 105, $bill_addr3, value);
	}

	/**
	 * 請求書送付住所４. Invoice send-to address 4.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 106, $bill_addr4);
	}

	/**
	 * 請求書送付住所４. Invoice send-to address 4.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 106, $bill_addr4, value);
	}

	/**
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 107, $bill_tel);
	}

	/**
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 107, $bill_tel, value);
	}

	/**
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 108, $bill_bcst_nm);
	}

	/**
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 108, $bill_bcst_nm, value);
	}

	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 109, $bill_bcst_dpt);
	}

	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 109, $bill_bcst_dpt, value);
	}

	/**
	 * 請求書送付担当者. Invoice send-to PIC.<p>
	 *
	 */
	public String bill_bcst_psn() {
		return getConstString(offset + 110, $bill_bcst_psn);
	}

	/**
	 * 請求書送付担当者. Invoice send-to PIC.<p>
	 *
	 */
	public void bill_bcst_psn(String value) {
		setConstString(offset + 110, $bill_bcst_psn, value);
	}

	/**
	 * 請求書送付担当者敬称. Invoice send-to PIC honorific.<p>
	 *
	 */
	public String bill_bcst_psn_title() {
		return getConstString(offset + 111, $bill_bcst_psn_title);
	}

	/**
	 * 請求書送付担当者敬称. Invoice send-to PIC honorific.<p>
	 *
	 */
	public void bill_bcst_psn_title(String value) {
		setConstString(offset + 111, $bill_bcst_psn_title, value);
	}

	/**
	 * 請求書前月残高表示ＦＬＧ. Display balance of previous month on invoice flg..<p>
	 *
	 */
	public boolean bfw_bal_disp_flg() {
		return getConstBoolean(offset + 112, $bfw_bal_disp_flg);
	}

	/**
	 * 請求書前月残高表示ＦＬＧ. Display balance of previous month on invoice flg..<p>
	 *
	 */
	public void bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 112, $bfw_bal_disp_flg, value);
	}

	/**
	 * 売上明細書出力区分. Sales details output type.<p>
	 *
	 */
	public String sls_dtl_outp_typ() {
		return getConstString(offset + 113, $sls_dtl_outp_typ);
	}

	/**
	 * 売上明細書出力区分. Sales details output type.<p>
	 *
	 */
	public void sls_dtl_outp_typ(String value) {
		setConstString(offset + 113, $sls_dtl_outp_typ, value);
	}

	/**
	 * 請求書発行区分. Invoice issue type.<p>
	 *
	 */
	public String bill_prnt_typ() {
		return getConstString(offset + 114, $bill_prnt_typ);
	}

	/**
	 * 請求書発行区分. Invoice issue type.<p>
	 *
	 */
	public void bill_prnt_typ(String value) {
		setConstString(offset + 114, $bill_prnt_typ, value);
	}

	/**
	 * 請求書明細出力ＦＬＧ. Invoice details output flg..<p>
	 *
	 */
	public boolean bill_dtl_outp_flg() {
		return getConstBoolean(offset + 115, $bill_dtl_outp_flg);
	}

	/**
	 * 請求書明細出力ＦＬＧ. Invoice details output flg..<p>
	 *
	 */
	public void bill_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 115, $bill_dtl_outp_flg, value);
	}

	/**
	 * 請求書前受金表示ＦＬＧ. Display advance received on invoice.<p>
	 *
	 */
	public boolean bill_dtl_adv_flg() {
		return getConstBoolean(offset + 116, $bill_dtl_adv_flg);
	}

	/**
	 * 請求書前受金表示ＦＬＧ. Display advance received on invoice.<p>
	 *
	 */
	public void bill_dtl_adv_flg(boolean value) {
		setConstBoolean(offset + 116, $bill_dtl_adv_flg, value);
	}

	/**
	 * 請求書入金予定表示ＦＬＧ. Display payment receipt schedule in invoice flg..<p>
	 *
	 */
	public boolean bill_dtl_rcv_flg() {
		return getConstBoolean(offset + 117, $bill_dtl_rcv_flg);
	}

	/**
	 * 請求書入金予定表示ＦＬＧ. Display payment receipt schedule in invoice flg..<p>
	 *
	 */
	public void bill_dtl_rcv_flg(boolean value) {
		setConstBoolean(offset + 117, $bill_dtl_rcv_flg, value);
	}

	/**
	 * 請求書明細小計区分. Invoice details subtotal type.<p>
	 *
	 */
	public String bill_dtl_subttl_typ() {
		return getConstString(offset + 118, $bill_dtl_subttl_typ);
	}

	/**
	 * 請求書明細小計区分. Invoice details subtotal type.<p>
	 *
	 */
	public void bill_dtl_subttl_typ(String value) {
		setConstString(offset + 118, $bill_dtl_subttl_typ, value);
	}

	/**
	 * 請求書明細改頁区分. Invoice details page break type.<p>
	 *
	 */
	public String bill_dtl_brk_typ() {
		return getConstString(offset + 119, $bill_dtl_brk_typ);
	}

	/**
	 * 請求書明細改頁区分. Invoice details page break type.<p>
	 *
	 */
	public void bill_dtl_brk_typ(String value) {
		setConstString(offset + 119, $bill_dtl_brk_typ, value);
	}

	/**
	 * 請求書明細並順区分. Invoice details sorting order type.<p>
	 *
	 */
	public String bill_dtl_sort_typ() {
		return getConstString(offset + 120, $bill_dtl_sort_typ);
	}

	/**
	 * 請求書明細並順区分. Invoice details sorting order type.<p>
	 *
	 */
	public void bill_dtl_sort_typ(String value) {
		setConstString(offset + 120, $bill_dtl_sort_typ, value);
	}

	/**
	 * 請求書取消伝票表示区分. Invoice cancel slip display type.<p>
	 *
	 */
	public String bill_can_slip_typ() {
		return getConstString(offset + 121, $bill_can_slip_typ);
	}

	/**
	 * 請求書取消伝票表示区分. Invoice cancel slip display type.<p>
	 *
	 */
	public void bill_can_slip_typ(String value) {
		setConstString(offset + 121, $bill_can_slip_typ, value);
	}

	/**
	 * 自動明細消込ＦＬＧ. Details auto-reconciliation flg..<p>
	 *
	 */
	public boolean auto_line_appl_flg() {
		return getConstBoolean(offset + 122, $auto_line_appl_flg);
	}

	/**
	 * 自動明細消込ＦＬＧ. Details auto-reconciliation flg..<p>
	 *
	 */
	public void auto_line_appl_flg(boolean value) {
		setConstBoolean(offset + 122, $auto_line_appl_flg, value);
	}

	/**
	 * 債権相殺グループＣＤ. AR offset group cd..<p>
	 *
	 */
	public String ar_setoff_grp_cd() {
		return getConstString(offset + 123, $ar_setoff_grp_cd);
	}

	/**
	 * 債権相殺グループＣＤ. AR offset group cd..<p>
	 *
	 */
	public void ar_setoff_grp_cd(String value) {
		setConstString(offset + 123, $ar_setoff_grp_cd, value);
	}

	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 124, $xfr_psn);
	}

	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 124, $xfr_psn, value);
	}

	/**
	 * 入金自動消込対象ＦＬＧ. For auto-reconciliation flg..<p>
	 *
	 */
	public boolean rcv_auto_appl_tgt_flg() {
		return getConstBoolean(offset + 125, $rcv_auto_appl_tgt_flg);
	}

	/**
	 * 入金自動消込対象ＦＬＧ. For auto-reconciliation flg..<p>
	 *
	 */
	public void rcv_auto_appl_tgt_flg(boolean value) {
		setConstBoolean(offset + 125, $rcv_auto_appl_tgt_flg, value);
	}

	/**
	 * 金額考慮ＦＬＧ. Match amount flg..<p>
	 *
	 */
	public boolean rcv_amt_match_flg() {
		return getConstBoolean(offset + 126, $rcv_amt_match_flg);
	}

	/**
	 * 金額考慮ＦＬＧ. Match amount flg..<p>
	 *
	 */
	public void rcv_amt_match_flg(boolean value) {
		setConstBoolean(offset + 126, $rcv_amt_match_flg, value);
	}

	/**
	 * 金種考慮ＦＬＧ. Match payment option flg..<p>
	 *
	 */
	public boolean ar_sttl_typ_match_flg() {
		return getConstBoolean(offset + 127, $ar_sttl_typ_match_flg);
	}

	/**
	 * 金種考慮ＦＬＧ. Match payment option flg..<p>
	 *
	 */
	public void ar_sttl_typ_match_flg(boolean value) {
		setConstBoolean(offset + 127, $ar_sttl_typ_match_flg, value);
	}

	/**
	 * 手数料計算ＦＬＧ. Fee calculation flg..<p>
	 *
	 */
	public boolean calc_com_paid_flg() {
		return getConstBoolean(offset + 128, $calc_com_paid_flg);
	}

	/**
	 * 手数料計算ＦＬＧ. Fee calculation flg..<p>
	 *
	 */
	public void calc_com_paid_flg(boolean value) {
		setConstBoolean(offset + 128, $calc_com_paid_flg, value);
	}

	/**
	 * 自動消込基準日遅延日数. Delayed days (Auto-reconciliation base date).<p>
	 *
	 */
	public MCNumber auto_appl_delay_days() {
		return getConstNumber(offset + 129, $auto_appl_delay_days);
	}

	/**
	 * 自動消込基準日遅延日数. Delayed days (Auto-reconciliation base date).<p>
	 *
	 */
	public void auto_appl_delay_days(MCNumber value) {
		setConstNumber(offset + 129, $auto_appl_delay_days, value);
	}
	
	/**
	 * 自動消込基準日遅延日数. Delayed days (Auto-reconciliation base date).<p>
	 *
	 */
	public void auto_appl_delay_days(int value) {
		setConstNumber(offset + 129, $auto_appl_delay_days, value);
	}
	
	/**
	 * 自動消込基準日遅延日数. Delayed days (Auto-reconciliation base date).<p>
	 *
	 */
	public void auto_appl_delay_days(long value) {
		setConstNumber(offset + 129, $auto_appl_delay_days, value);
	}
	
	/**
	 * 自動消込基準日遅延日数. Delayed days (Auto-reconciliation base date).<p>
	 *
	 */
	public void auto_appl_delay_days(float value) {
		setConstNumber(offset + 129, $auto_appl_delay_days, value);
	}
	
	/**
	 * 自動消込基準日遅延日数. Delayed days (Auto-reconciliation base date).<p>
	 *
	 */
	public void auto_appl_delay_days(double value) {
		setConstNumber(offset + 129, $auto_appl_delay_days, value);
	}
	
	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 130, $asppl_cd);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 130, $asppl_cd, value);
	}

	/**
	 * ＶＭＩ購買部門ＣＤ. VMI purchasing dept. cd..<p>
	 *
	 */
	public String vmi_purc_dpt_cd() {
		return getConstString(offset + 131, $vmi_purc_dpt_cd);
	}

	/**
	 * ＶＭＩ購買部門ＣＤ. VMI purchasing dept. cd..<p>
	 *
	 */
	public void vmi_purc_dpt_cd(String value) {
		setConstString(offset + 131, $vmi_purc_dpt_cd, value);
	}

	/**
	 * 下請対象ＦＬＧ. For subcontract flg..<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 132, $subcon_flg);
	}

	/**
	 * 下請対象ＦＬＧ. For subcontract flg..<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 132, $subcon_flg, value);
	}

	/**
	 * 注文書表示ＣＤ. Display PO sheet cd..<p>
	 *
	 */
	public String po_print_cd() {
		return getConstString(offset + 133, $po_print_cd);
	}

	/**
	 * 注文書表示ＣＤ. Display PO sheet cd..<p>
	 *
	 */
	public void po_print_cd(String value) {
		setConstString(offset + 133, $po_print_cd, value);
	}

	/**
	 * 発注先納品書ＣＤ. Supplier delivery note cd..<p>
	 *
	 */
	public String sppl_ship_form_cd() {
		return getConstString(offset + 134, $sppl_ship_form_cd);
	}

	/**
	 * 発注先納品書ＣＤ. Supplier delivery note cd..<p>
	 *
	 */
	public void sppl_ship_form_cd(String value) {
		setConstString(offset + 134, $sppl_ship_form_cd, value);
	}

	/**
	 * 発注時納品書ＦＬＧ. Delivery note at P/O flg..<p>
	 *
	 */
	public boolean po_dlv_slip_flg() {
		return getConstBoolean(offset + 135, $po_dlv_slip_flg);
	}

	/**
	 * 発注時納品書ＦＬＧ. Delivery note at P/O flg..<p>
	 *
	 */
	public void po_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 135, $po_dlv_slip_flg, value);
	}

	/**
	 * 納入指示時納品書ＦＬＧ. Delivery note at delivery order flg..<p>
	 *
	 */
	public boolean dlv_inst_dlv_slip_flg() {
		return getConstBoolean(offset + 136, $dlv_inst_dlv_slip_flg);
	}

	/**
	 * 納入指示時納品書ＦＬＧ. Delivery note at delivery order flg..<p>
	 *
	 */
	public void dlv_inst_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 136, $dlv_inst_dlv_slip_flg, value);
	}

	/**
	 * 納期回答受領時納品書ＦＬＧ. Delivery note at receipt of order promising result flg..<p>
	 *
	 */
	public boolean prms_rcpt_dlv_slip_flg() {
		return getConstBoolean(offset + 137, $prms_rcpt_dlv_slip_flg);
	}

	/**
	 * 納期回答受領時納品書ＦＬＧ. Delivery note at receipt of order promising result flg..<p>
	 *
	 */
	public void prms_rcpt_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 137, $prms_rcpt_dlv_slip_flg, value);
	}

	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 138, $pay_crryovr_times);
	}

	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 138, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 138, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 138, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 138, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 138, $pay_crryovr_times, value);
	}
	
	/**
	 * 発注先部署. Supplier dept..<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 139, $sppl_cntct_dpt);
	}

	/**
	 * 発注先部署. Supplier dept..<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 139, $sppl_cntct_dpt, value);
	}

	/**
	 * 発注先担当者. Supplier PIC.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 140, $sppl_cntct_psn);
	}

	/**
	 * 発注先担当者. Supplier PIC.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 140, $sppl_cntct_psn, value);
	}

	/**
	 * 発注先担当者敬称. Supplier PIC form of address.<p>
	 *
	 */
	public String sppl_cntct_psn_title() {
		return getConstString(offset + 141, $sppl_cntct_psn_title);
	}

	/**
	 * 発注先担当者敬称. Supplier PIC form of address.<p>
	 *
	 */
	public void sppl_cntct_psn_title(String value) {
		setConstString(offset + 141, $sppl_cntct_psn_title, value);
	}

	/**
	 * 購買単価取得区分. Purchase unit price acquisition type.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 142, $purc_upri_req_typ);
	}

	/**
	 * 購買単価取得区分. Purchase unit price acquisition type.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 142, $purc_upri_req_typ, value);
	}

	/**
	 * 購買単価変更許可ＦＬＧ. Allow purchasing unit price change flg..<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 143, $purc_upri_cng_flg);
	}

	/**
	 * 購買単価変更許可ＦＬＧ. Allow purchasing unit price change flg..<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 143, $purc_upri_cng_flg, value);
	}

	/**
	 * 仕入金額端数処理区分. Rounding type (Purchase amount).<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 144, $purc_amt_rnd_typ);
	}

	/**
	 * 仕入金額端数処理区分. Rounding type (Purchase amount).<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 144, $purc_amt_rnd_typ, value);
	}

	/**
	 * 仕入税額端数処理区分. Rounding type (Purchase tax).<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 145, $purc_tax_rnd_typ);
	}

	/**
	 * 仕入税額端数処理区分. Rounding type (Purchase tax).<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 145, $purc_tax_rnd_typ, value);
	}

	/**
	 * 仕入税計算区分. Purchase tax calculation type.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return getConstString(offset + 146, $purc_tax_calc_typ);
	}

	/**
	 * 仕入税計算区分. Purchase tax calculation type.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 146, $purc_tax_calc_typ, value);
	}

	/**
	 * 仕入税ＣＤ. Purchase tax cd..<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 147, $purc_tax_cd);
	}

	/**
	 * 仕入税ＣＤ. Purchase tax cd..<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 147, $purc_tax_cd, value);
	}

	/**
	 * 仕入税優先ＦＬＧ. Purchase tax priority flg..<p>
	 *
	 */
	public boolean purc_tax_cd_prio_flg() {
		return getConstBoolean(offset + 148, $purc_tax_cd_prio_flg);
	}

	/**
	 * 仕入税優先ＦＬＧ. Purchase tax priority flg..<p>
	 *
	 */
	public void purc_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 148, $purc_tax_cd_prio_flg, value);
	}

	/**
	 * 案件別注文書ＦＬＧ. PO sheet by sales project flg..<p>
	 *
	 */
	public boolean wrk_po_flg() {
		return getConstBoolean(offset + 149, $wrk_po_flg);
	}

	/**
	 * 案件別注文書ＦＬＧ. PO sheet by sales project flg..<p>
	 *
	 */
	public void wrk_po_flg(boolean value) {
		setConstBoolean(offset + 149, $wrk_po_flg, value);
	}

	/**
	 * 案件別債務管理ＦＬＧ. AP management by sales project flg..<p>
	 *
	 */
	public boolean wrk_ap_flg() {
		return getConstBoolean(offset + 150, $wrk_ap_flg);
	}

	/**
	 * 案件別債務管理ＦＬＧ. AP management by sales project flg..<p>
	 *
	 */
	public void wrk_ap_flg(boolean value) {
		setConstBoolean(offset + 150, $wrk_ap_flg, value);
	}

	/**
	 * 仕入ロット明細分割区分. Purchase lot details split type.<p>
	 *
	 */
	public String purc_slip_each_lot_typ() {
		return getConstString(offset + 151, $purc_slip_each_lot_typ);
	}

	/**
	 * 仕入ロット明細分割区分. Purchase lot details split type.<p>
	 *
	 */
	public void purc_slip_each_lot_typ(String value) {
		setConstString(offset + 151, $purc_slip_each_lot_typ, value);
	}

	/**
	 * 支給積送管理区分. In-transit supply management type.<p>
	 *
	 */
	public String prov_rcv_typ() {
		return getConstString(offset + 152, $prov_rcv_typ);
	}

	/**
	 * 支給積送管理区分. In-transit supply management type.<p>
	 *
	 */
	public void prov_rcv_typ(String value) {
		setConstString(offset + 152, $prov_rcv_typ, value);
	}

	/**
	 * 有償支給先ＦＬＧ. Chargeable supplier flg..<p>
	 *
	 */
	public boolean onr_prsppl_flg() {
		return getConstBoolean(offset + 153, $onr_prsppl_flg);
	}

	/**
	 * 有償支給先ＦＬＧ. Chargeable supplier flg..<p>
	 *
	 */
	public void onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 153, $onr_prsppl_flg, value);
	}

	/**
	 * 外注単価区分. Subcontracting unit price type.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 154, $outsrc_upri_typ);
	}

	/**
	 * 外注単価区分. Subcontracting unit price type.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 154, $outsrc_upri_typ, value);
	}

	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 155, $prov_basis_typ);
	}

	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 155, $prov_basis_typ, value);
	}

	/**
	 * 支給単価変更許可ＦＬＧ. Allow supply unit price change flg..<p>
	 *
	 */
	public boolean prov_upri_cng_flg() {
		return getConstBoolean(offset + 156, $prov_upri_cng_flg);
	}

	/**
	 * 支給単価変更許可ＦＬＧ. Allow supply unit price change flg..<p>
	 *
	 */
	public void prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 156, $prov_upri_cng_flg, value);
	}

	/**
	 * 支給金額端数処理区分. Supply amount rounding type.<p>
	 *
	 */
	public String prov_amt_rnd_typ() {
		return getConstString(offset + 157, $prov_amt_rnd_typ);
	}

	/**
	 * 支給金額端数処理区分. Supply amount rounding type.<p>
	 *
	 */
	public void prov_amt_rnd_typ(String value) {
		setConstString(offset + 157, $prov_amt_rnd_typ, value);
	}

	/**
	 * 支給税額端数処理区分. Supply tax rounding type.<p>
	 *
	 */
	public String prov_tax_rnd_typ() {
		return getConstString(offset + 158, $prov_tax_rnd_typ);
	}

	/**
	 * 支給税額端数処理区分. Supply tax rounding type.<p>
	 *
	 */
	public void prov_tax_rnd_typ(String value) {
		setConstString(offset + 158, $prov_tax_rnd_typ, value);
	}

	/**
	 * 支給税計算区分. Supply tax calculation type.<p>
	 *
	 */
	public String prov_tax_calc_typ() {
		return getConstString(offset + 159, $prov_tax_calc_typ);
	}

	/**
	 * 支給税計算区分. Supply tax calculation type.<p>
	 *
	 */
	public void prov_tax_calc_typ(String value) {
		setConstString(offset + 159, $prov_tax_calc_typ, value);
	}

	/**
	 * 支給税ＣＤ. Supply tax cd..<p>
	 *
	 */
	public String prov_tax_cd() {
		return getConstString(offset + 160, $prov_tax_cd);
	}

	/**
	 * 支給税ＣＤ. Supply tax cd..<p>
	 *
	 */
	public void prov_tax_cd(String value) {
		setConstString(offset + 160, $prov_tax_cd, value);
	}

	/**
	 * 支給税優先ＦＬＧ. Supply tax priority flg..<p>
	 *
	 */
	public boolean prov_tax_cd_prio_flg() {
		return getConstBoolean(offset + 161, $prov_tax_cd_prio_flg);
	}

	/**
	 * 支給税優先ＦＬＧ. Supply tax priority flg..<p>
	 *
	 */
	public void prov_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 161, $prov_tax_cd_prio_flg, value);
	}

	/**
	 * 発注先カレンダＣＤ. Supplier calendar cd..<p>
	 *
	 */
	public String sppl_cal_cd() {
		return getConstString(offset + 162, $sppl_cal_cd);
	}

	/**
	 * 発注先カレンダＣＤ. Supplier calendar cd..<p>
	 *
	 */
	public void sppl_cal_cd(String value) {
		setConstString(offset + 162, $sppl_cal_cd, value);
	}

	/**
	 * 発注先インボイス取引ＦＬＧ. Supplier invoice transaction flg..<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 163, $sppl_iv_flg);
	}

	/**
	 * 発注先インボイス取引ＦＬＧ. Supplier invoice transaction flg..<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 163, $sppl_iv_flg, value);
	}

	/**
	 * 受領インボイス重複許可ＦＬＧ. Allow purchase invoice duplication flg..<p>
	 *
	 */
	public boolean rcpt_iv_dup_flg() {
		return getConstBoolean(offset + 164, $rcpt_iv_dup_flg);
	}

	/**
	 * 受領インボイス重複許可ＦＬＧ. Allow purchase invoice duplication flg..<p>
	 *
	 */
	public void rcpt_iv_dup_flg(boolean value) {
		setConstBoolean(offset + 164, $rcpt_iv_dup_flg, value);
	}

	/**
	 * 納期回答確認ＦＬＧ. Order promising check flg..<p>
	 *
	 */
	public boolean prms_recv_flg() {
		return getConstBoolean(offset + 165, $prms_recv_flg);
	}

	/**
	 * 納期回答確認ＦＬＧ. Order promising check flg..<p>
	 *
	 */
	public void prms_recv_flg(boolean value) {
		setConstBoolean(offset + 165, $prms_recv_flg, value);
	}

	/**
	 * 発注先取引条件ＣＤ１. Supplier transaction terms cd. 1.<p>
	 *
	 */
	public String sppl_tterm_cd1() {
		return getConstString(offset + 166, $sppl_tterm_cd1);
	}

	/**
	 * 発注先取引条件ＣＤ１. Supplier transaction terms cd. 1.<p>
	 *
	 */
	public void sppl_tterm_cd1(String value) {
		setConstString(offset + 166, $sppl_tterm_cd1, value);
	}

	/**
	 * 発注先取引条件ＣＤ２. Supplier transaction terms cd. 2.<p>
	 *
	 */
	public String sppl_tterm_cd2() {
		return getConstString(offset + 167, $sppl_tterm_cd2);
	}

	/**
	 * 発注先取引条件ＣＤ２. Supplier transaction terms cd. 2.<p>
	 *
	 */
	public void sppl_tterm_cd2(String value) {
		setConstString(offset + 167, $sppl_tterm_cd2, value);
	}

	/**
	 * 発注先取引条件ＣＤ３. Supplier transaction terms cd. 3.<p>
	 *
	 */
	public String sppl_tterm_cd3() {
		return getConstString(offset + 168, $sppl_tterm_cd3);
	}

	/**
	 * 発注先取引条件ＣＤ３. Supplier transaction terms cd. 3.<p>
	 *
	 */
	public void sppl_tterm_cd3(String value) {
		setConstString(offset + 168, $sppl_tterm_cd3, value);
	}

	/**
	 * 仕入計上区分. Purchase recording type.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 169, $purc_basis_typ);
	}

	/**
	 * 仕入計上区分. Purchase recording type.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 169, $purc_basis_typ, value);
	}

	/**
	 * 買戻義務ＦＬＧ. Repurchase obligation flg..<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 170, $repurc_obli_flg);
	}

	/**
	 * 買戻義務ＦＬＧ. Repurchase obligation flg..<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 170, $repurc_obli_flg, value);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 171, $bsppl_cd);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 171, $bsppl_cd, value);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 172, $ap_dpt_cd);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 172, $ap_dpt_cd, value);
	}

	/**
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 173, $psppl_cd);
	}

	/**
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 173, $psppl_cd, value);
	}

	/**
	 * 債務与信管理先ＣＤ. AP credit managed BP cd..<p>
	 *
	 */
	public String ap_cred_cd() {
		return getConstString(offset + 174, $ap_cred_cd);
	}

	/**
	 * 債務与信管理先ＣＤ. AP credit managed BP cd..<p>
	 *
	 */
	public void ap_cred_cd(String value) {
		setConstString(offset + 174, $ap_cred_cd, value);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 175, $bsppl_dpt_cd);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 175, $bsppl_dpt_cd, value);
	}

	/**
	 * 都度支払ＦＬＧ. Payment per transaction flg..<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 176, $pay_spot_flg);
	}

	/**
	 * 都度支払ＦＬＧ. Payment per transaction flg..<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 176, $pay_spot_flg, value);
	}

	/**
	 * 支払締日１. Payment closing date 1.<p>
	 *
	 */
	public MCNumber psppl_cl_day1() {
		return getConstNumber(offset + 177, $psppl_cl_day1);
	}

	/**
	 * 支払締日１. Payment closing date 1.<p>
	 *
	 */
	public void psppl_cl_day1(MCNumber value) {
		setConstNumber(offset + 177, $psppl_cl_day1, value);
	}
	
	/**
	 * 支払締日１. Payment closing date 1.<p>
	 *
	 */
	public void psppl_cl_day1(int value) {
		setConstNumber(offset + 177, $psppl_cl_day1, value);
	}
	
	/**
	 * 支払締日１. Payment closing date 1.<p>
	 *
	 */
	public void psppl_cl_day1(long value) {
		setConstNumber(offset + 177, $psppl_cl_day1, value);
	}
	
	/**
	 * 支払締日１. Payment closing date 1.<p>
	 *
	 */
	public void psppl_cl_day1(float value) {
		setConstNumber(offset + 177, $psppl_cl_day1, value);
	}
	
	/**
	 * 支払締日１. Payment closing date 1.<p>
	 *
	 */
	public void psppl_cl_day1(double value) {
		setConstNumber(offset + 177, $psppl_cl_day1, value);
	}
	
	/**
	 * 支払締日２. Payment closing date 2.<p>
	 *
	 */
	public MCNumber psppl_cl_day2() {
		return getConstNumber(offset + 178, $psppl_cl_day2);
	}

	/**
	 * 支払締日２. Payment closing date 2.<p>
	 *
	 */
	public void psppl_cl_day2(MCNumber value) {
		setConstNumber(offset + 178, $psppl_cl_day2, value);
	}
	
	/**
	 * 支払締日２. Payment closing date 2.<p>
	 *
	 */
	public void psppl_cl_day2(int value) {
		setConstNumber(offset + 178, $psppl_cl_day2, value);
	}
	
	/**
	 * 支払締日２. Payment closing date 2.<p>
	 *
	 */
	public void psppl_cl_day2(long value) {
		setConstNumber(offset + 178, $psppl_cl_day2, value);
	}
	
	/**
	 * 支払締日２. Payment closing date 2.<p>
	 *
	 */
	public void psppl_cl_day2(float value) {
		setConstNumber(offset + 178, $psppl_cl_day2, value);
	}
	
	/**
	 * 支払締日２. Payment closing date 2.<p>
	 *
	 */
	public void psppl_cl_day2(double value) {
		setConstNumber(offset + 178, $psppl_cl_day2, value);
	}
	
	/**
	 * 支払締日３. Payment closing date 3.<p>
	 *
	 */
	public MCNumber psppl_cl_day3() {
		return getConstNumber(offset + 179, $psppl_cl_day3);
	}

	/**
	 * 支払締日３. Payment closing date 3.<p>
	 *
	 */
	public void psppl_cl_day3(MCNumber value) {
		setConstNumber(offset + 179, $psppl_cl_day3, value);
	}
	
	/**
	 * 支払締日３. Payment closing date 3.<p>
	 *
	 */
	public void psppl_cl_day3(int value) {
		setConstNumber(offset + 179, $psppl_cl_day3, value);
	}
	
	/**
	 * 支払締日３. Payment closing date 3.<p>
	 *
	 */
	public void psppl_cl_day3(long value) {
		setConstNumber(offset + 179, $psppl_cl_day3, value);
	}
	
	/**
	 * 支払締日３. Payment closing date 3.<p>
	 *
	 */
	public void psppl_cl_day3(float value) {
		setConstNumber(offset + 179, $psppl_cl_day3, value);
	}
	
	/**
	 * 支払締日３. Payment closing date 3.<p>
	 *
	 */
	public void psppl_cl_day3(double value) {
		setConstNumber(offset + 179, $psppl_cl_day3, value);
	}
	
	/**
	 * 支払締日４. Payment closing date 4.<p>
	 *
	 */
	public MCNumber psppl_cl_day4() {
		return getConstNumber(offset + 180, $psppl_cl_day4);
	}

	/**
	 * 支払締日４. Payment closing date 4.<p>
	 *
	 */
	public void psppl_cl_day4(MCNumber value) {
		setConstNumber(offset + 180, $psppl_cl_day4, value);
	}
	
	/**
	 * 支払締日４. Payment closing date 4.<p>
	 *
	 */
	public void psppl_cl_day4(int value) {
		setConstNumber(offset + 180, $psppl_cl_day4, value);
	}
	
	/**
	 * 支払締日４. Payment closing date 4.<p>
	 *
	 */
	public void psppl_cl_day4(long value) {
		setConstNumber(offset + 180, $psppl_cl_day4, value);
	}
	
	/**
	 * 支払締日４. Payment closing date 4.<p>
	 *
	 */
	public void psppl_cl_day4(float value) {
		setConstNumber(offset + 180, $psppl_cl_day4, value);
	}
	
	/**
	 * 支払締日４. Payment closing date 4.<p>
	 *
	 */
	public void psppl_cl_day4(double value) {
		setConstNumber(offset + 180, $psppl_cl_day4, value);
	}
	
	/**
	 * 支払締日５. Payment closing date 5.<p>
	 *
	 */
	public MCNumber psppl_cl_day5() {
		return getConstNumber(offset + 181, $psppl_cl_day5);
	}

	/**
	 * 支払締日５. Payment closing date 5.<p>
	 *
	 */
	public void psppl_cl_day5(MCNumber value) {
		setConstNumber(offset + 181, $psppl_cl_day5, value);
	}
	
	/**
	 * 支払締日５. Payment closing date 5.<p>
	 *
	 */
	public void psppl_cl_day5(int value) {
		setConstNumber(offset + 181, $psppl_cl_day5, value);
	}
	
	/**
	 * 支払締日５. Payment closing date 5.<p>
	 *
	 */
	public void psppl_cl_day5(long value) {
		setConstNumber(offset + 181, $psppl_cl_day5, value);
	}
	
	/**
	 * 支払締日５. Payment closing date 5.<p>
	 *
	 */
	public void psppl_cl_day5(float value) {
		setConstNumber(offset + 181, $psppl_cl_day5, value);
	}
	
	/**
	 * 支払締日５. Payment closing date 5.<p>
	 *
	 */
	public void psppl_cl_day5(double value) {
		setConstNumber(offset + 181, $psppl_cl_day5, value);
	}
	
	/**
	 * 仕入仮単価締ＦＬＧ. Purchase temporary unit price closing flg..<p>
	 *
	 */
	public boolean purc_interim_cl_flg() {
		return getConstBoolean(offset + 182, $purc_interim_cl_flg);
	}

	/**
	 * 仕入仮単価締ＦＬＧ. Purchase temporary unit price closing flg..<p>
	 *
	 */
	public void purc_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 182, $purc_interim_cl_flg, value);
	}

	/**
	 * 債務相殺グループＣＤ. AP offset group cd..<p>
	 *
	 */
	public String ap_setoff_grp_cd() {
		return getConstString(offset + 183, $ap_setoff_grp_cd);
	}

	/**
	 * 債務相殺グループＣＤ. AP offset group cd..<p>
	 *
	 */
	public void ap_setoff_grp_cd(String value) {
		setConstString(offset + 183, $ap_setoff_grp_cd, value);
	}

	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 184, $pay_bank_ac_cd);
	}

	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 184, $pay_bank_ac_cd, value);
	}

	/**
	 * 支払予定前後区分. Payment schedule before/after type.<p>
	 *
	 */
	public String pay_schd_ba_typ() {
		return getConstString(offset + 185, $pay_schd_ba_typ);
	}

	/**
	 * 支払予定前後区分. Payment schedule before/after type.<p>
	 *
	 */
	public void pay_schd_ba_typ(String value) {
		setConstString(offset + 185, $pay_schd_ba_typ, value);
	}

	/**
	 * 支払税計算ＦＬＧ. Payment tax calculation flg..<p>
	 *
	 */
	public boolean tax_on_pay_flg() {
		return getConstBoolean(offset + 186, $tax_on_pay_flg);
	}

	/**
	 * 支払税計算ＦＬＧ. Payment tax calculation flg..<p>
	 *
	 */
	public void tax_on_pay_flg(boolean value) {
		setConstBoolean(offset + 186, $tax_on_pay_flg, value);
	}

	/**
	 * 支払税額端数処理区分. Payment tax amount rounding type.<p>
	 *
	 */
	public String pay_tax_rnd_typ() {
		return getConstString(offset + 187, $pay_tax_rnd_typ);
	}

	/**
	 * 支払税額端数処理区分. Payment tax amount rounding type.<p>
	 *
	 */
	public void pay_tax_rnd_typ(String value) {
		setConstString(offset + 187, $pay_tax_rnd_typ, value);
	}

	/**
	 * バッチ支払予定締ＦＬＧ. Batch payment schedule closing flg..<p>
	 *
	 */
	public boolean batch_pay_schd_cl_flg() {
		return getConstBoolean(offset + 188, $batch_pay_schd_cl_flg);
	}

	/**
	 * バッチ支払予定締ＦＬＧ. Batch payment schedule closing flg..<p>
	 *
	 */
	public void batch_pay_schd_cl_flg(boolean value) {
		setConstBoolean(offset + 188, $batch_pay_schd_cl_flg, value);
	}

	/**
	 * 支払予定締遅延日数. Payment schedule closing delay days.<p>
	 *
	 */
	public MCNumber pay_schd_cl_delay_days() {
		return getConstNumber(offset + 189, $pay_schd_cl_delay_days);
	}

	/**
	 * 支払予定締遅延日数. Payment schedule closing delay days.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 189, $pay_schd_cl_delay_days, value);
	}
	
	/**
	 * 支払予定締遅延日数. Payment schedule closing delay days.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(int value) {
		setConstNumber(offset + 189, $pay_schd_cl_delay_days, value);
	}
	
	/**
	 * 支払予定締遅延日数. Payment schedule closing delay days.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(long value) {
		setConstNumber(offset + 189, $pay_schd_cl_delay_days, value);
	}
	
	/**
	 * 支払予定締遅延日数. Payment schedule closing delay days.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(float value) {
		setConstNumber(offset + 189, $pay_schd_cl_delay_days, value);
	}
	
	/**
	 * 支払予定締遅延日数. Payment schedule closing delay days.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(double value) {
		setConstNumber(offset + 189, $pay_schd_cl_delay_days, value);
	}
	
	/**
	 * 支払予定締前後区分. Payment schedule closing before/after type.<p>
	 *
	 */
	public String pay_schd_cl_ba_typ() {
		return getConstString(offset + 190, $pay_schd_cl_ba_typ);
	}

	/**
	 * 支払予定締前後区分. Payment schedule closing before/after type.<p>
	 *
	 */
	public void pay_schd_cl_ba_typ(String value) {
		setConstString(offset + 190, $pay_schd_cl_ba_typ, value);
	}

	/**
	 * 事業者ＮＯ. Business No..<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 191, $biz_co_no);
	}

	/**
	 * 事業者ＮＯ. Business No..<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 191, $biz_co_no, value);
	}

	/**
	 * 支払通知書発行対象ＦＬＧ. Payment notice to be issued flg..<p>
	 *
	 */
	public boolean pay_ntc_prnt_flg() {
		return getConstBoolean(offset + 192, $pay_ntc_prnt_flg);
	}

	/**
	 * 支払通知書発行対象ＦＬＧ. Payment notice to be issued flg..<p>
	 *
	 */
	public void pay_ntc_prnt_flg(boolean value) {
		setConstBoolean(offset + 192, $pay_ntc_prnt_flg, value);
	}

	/**
	 * 支払通知書送付郵便番号. Payment notice send-to zip code.<p>
	 *
	 */
	public String pay_ntc_zip_cd() {
		return getConstString(offset + 193, $pay_ntc_zip_cd);
	}

	/**
	 * 支払通知書送付郵便番号. Payment notice send-to zip code.<p>
	 *
	 */
	public void pay_ntc_zip_cd(String value) {
		setConstString(offset + 193, $pay_ntc_zip_cd, value);
	}

	/**
	 * 支払通知書送付住所１. Payment notice send-to address 1.<p>
	 *
	 */
	public String pay_ntc_addr1() {
		return getConstString(offset + 194, $pay_ntc_addr1);
	}

	/**
	 * 支払通知書送付住所１. Payment notice send-to address 1.<p>
	 *
	 */
	public void pay_ntc_addr1(String value) {
		setConstString(offset + 194, $pay_ntc_addr1, value);
	}

	/**
	 * 支払通知書送付住所２. Payment notice send-to address 2.<p>
	 *
	 */
	public String pay_ntc_addr2() {
		return getConstString(offset + 195, $pay_ntc_addr2);
	}

	/**
	 * 支払通知書送付住所２. Payment notice send-to address 2.<p>
	 *
	 */
	public void pay_ntc_addr2(String value) {
		setConstString(offset + 195, $pay_ntc_addr2, value);
	}

	/**
	 * 支払通知書送付住所３. Payment notice send-to address 3.<p>
	 *
	 */
	public String pay_ntc_addr3() {
		return getConstString(offset + 196, $pay_ntc_addr3);
	}

	/**
	 * 支払通知書送付住所３. Payment notice send-to address 3.<p>
	 *
	 */
	public void pay_ntc_addr3(String value) {
		setConstString(offset + 196, $pay_ntc_addr3, value);
	}

	/**
	 * 支払通知書送付住所４. Payment notice send-to address 4.<p>
	 *
	 */
	public String pay_ntc_addr4() {
		return getConstString(offset + 197, $pay_ntc_addr4);
	}

	/**
	 * 支払通知書送付住所４. Payment notice send-to address 4.<p>
	 *
	 */
	public void pay_ntc_addr4(String value) {
		setConstString(offset + 197, $pay_ntc_addr4, value);
	}

	/**
	 * 支払通知書宛先. Payment notice destination.<p>
	 *
	 */
	public String pay_ntc_bsppl_nm() {
		return getConstString(offset + 198, $pay_ntc_bsppl_nm);
	}

	/**
	 * 支払通知書宛先. Payment notice destination.<p>
	 *
	 */
	public void pay_ntc_bsppl_nm(String value) {
		setConstString(offset + 198, $pay_ntc_bsppl_nm, value);
	}

	/**
	 * 支払通知書送付部署. Payment notice send-to dept..<p>
	 *
	 */
	public String pay_ntc_bsppl_dpt() {
		return getConstString(offset + 199, $pay_ntc_bsppl_dpt);
	}

	/**
	 * 支払通知書送付部署. Payment notice send-to dept..<p>
	 *
	 */
	public void pay_ntc_bsppl_dpt(String value) {
		setConstString(offset + 199, $pay_ntc_bsppl_dpt, value);
	}

	/**
	 * 支払通知書送付担当者. Payment notice send-to PIC.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn() {
		return getConstString(offset + 200, $pay_ntc_bsppl_psn);
	}

	/**
	 * 支払通知書送付担当者. Payment notice send-to PIC.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn(String value) {
		setConstString(offset + 200, $pay_ntc_bsppl_psn, value);
	}

	/**
	 * 支払通知書送付担当者敬称. Payment notice send-to PIC honorific title.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn_title() {
		return getConstString(offset + 201, $pay_ntc_bsppl_psn_title);
	}

	/**
	 * 支払通知書送付担当者敬称. Payment notice send-to PIC honorific title.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn_title(String value) {
		setConstString(offset + 201, $pay_ntc_bsppl_psn_title, value);
	}

	/**
	 * 支払通知書送付ＴＥＬ. Payment notice send-to TEL.<p>
	 *
	 */
	public String pay_ntc_tel() {
		return getConstString(offset + 202, $pay_ntc_tel);
	}

	/**
	 * 支払通知書送付ＴＥＬ. Payment notice send-to TEL.<p>
	 *
	 */
	public void pay_ntc_tel(String value) {
		setConstString(offset + 202, $pay_ntc_tel, value);
	}

	/**
	 * 支払通知書明細出力ＦＬＧ. Output payment notice details flg..<p>
	 *
	 */
	public boolean pay_ntc_dtl_outp_flg() {
		return getConstBoolean(offset + 203, $pay_ntc_dtl_outp_flg);
	}

	/**
	 * 支払通知書明細出力ＦＬＧ. Output payment notice details flg..<p>
	 *
	 */
	public void pay_ntc_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 203, $pay_ntc_dtl_outp_flg, value);
	}

	/**
	 * 支払通知書前月残高表示ＦＬＧ. Display balance of previous month on payment notice flg..<p>
	 *
	 */
	public boolean pay_ntc_bfw_bal_disp_flg() {
		return getConstBoolean(offset + 204, $pay_ntc_bfw_bal_disp_flg);
	}

	/**
	 * 支払通知書前月残高表示ＦＬＧ. Display balance of previous month on payment notice flg..<p>
	 *
	 */
	public void pay_ntc_bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 204, $pay_ntc_bfw_bal_disp_flg, value);
	}

	/**
	 * 支払通知書前渡金表示ＦＬＧ. Display advance payment on payment notice flg..<p>
	 *
	 */
	public boolean pay_ntc_adv_pay_flg() {
		return getConstBoolean(offset + 205, $pay_ntc_adv_pay_flg);
	}

	/**
	 * 支払通知書前渡金表示ＦＬＧ. Display advance payment on payment notice flg..<p>
	 *
	 */
	public void pay_ntc_adv_pay_flg(boolean value) {
		setConstBoolean(offset + 205, $pay_ntc_adv_pay_flg, value);
	}

	/**
	 * 支払通知書支払予定表示ＦＬＧ. Display payment schedule on payment notice flg..<p>
	 *
	 */
	public boolean pay_ntc_dtl_pay_flg() {
		return getConstBoolean(offset + 206, $pay_ntc_dtl_pay_flg);
	}

	/**
	 * 支払通知書支払予定表示ＦＬＧ. Display payment schedule on payment notice flg..<p>
	 *
	 */
	public void pay_ntc_dtl_pay_flg(boolean value) {
		setConstBoolean(offset + 206, $pay_ntc_dtl_pay_flg, value);
	}

	/**
	 * 支払通知書明細小計区分. Payment notice details subtotal type.<p>
	 *
	 */
	public String pay_ntc_dtl_subttl_typ() {
		return getConstString(offset + 207, $pay_ntc_dtl_subttl_typ);
	}

	/**
	 * 支払通知書明細小計区分. Payment notice details subtotal type.<p>
	 *
	 */
	public void pay_ntc_dtl_subttl_typ(String value) {
		setConstString(offset + 207, $pay_ntc_dtl_subttl_typ, value);
	}

	/**
	 * 支払通知書明細改頁区分. Payment notice details page break type.<p>
	 *
	 */
	public String pay_ntc_dtl_brk_typ() {
		return getConstString(offset + 208, $pay_ntc_dtl_brk_typ);
	}

	/**
	 * 支払通知書明細改頁区分. Payment notice details page break type.<p>
	 *
	 */
	public void pay_ntc_dtl_brk_typ(String value) {
		setConstString(offset + 208, $pay_ntc_dtl_brk_typ, value);
	}

	/**
	 * 支払通知書明細並順区分. Payment notice details sorting order type.<p>
	 *
	 */
	public String pay_ntc_dtl_sort_typ() {
		return getConstString(offset + 209, $pay_ntc_dtl_sort_typ);
	}

	/**
	 * 支払通知書明細並順区分. Payment notice details sorting order type.<p>
	 *
	 */
	public void pay_ntc_dtl_sort_typ(String value) {
		setConstString(offset + 209, $pay_ntc_dtl_sort_typ, value);
	}

	/**
	 * 支払通知書取消伝票表示区分. Payment notice cancel slip display type.<p>
	 *
	 */
	public String pay_ntc_can_slip_typ() {
		return getConstString(offset + 210, $pay_ntc_can_slip_typ);
	}

	/**
	 * 支払通知書取消伝票表示区分. Payment notice cancel slip display type.<p>
	 *
	 */
	public void pay_ntc_can_slip_typ(String value) {
		setConstString(offset + 210, $pay_ntc_can_slip_typ, value);
	}

	/**
	 * 支払先備考. Payee remarks.<p>
	 *
	 */
	public String psppl_rmrks() {
		return getConstString(offset + 211, $psppl_rmrks);
	}

	/**
	 * 支払先備考. Payee remarks.<p>
	 *
	 */
	public void psppl_rmrks(String value) {
		setConstString(offset + 211, $psppl_rmrks, value);
	}

	/**
	 * 手形サイト上限. Note sight upper limit.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 212, $note_days);
	}

	/**
	 * 手形サイト上限. Note sight upper limit.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 212, $note_days, value);
	}
	
	/**
	 * 手形サイト上限. Note sight upper limit.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 212, $note_days, value);
	}
	
	/**
	 * 手形サイト上限. Note sight upper limit.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 212, $note_days, value);
	}
	
	/**
	 * 手形サイト上限. Note sight upper limit.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 212, $note_days, value);
	}
	
	/**
	 * 手形サイト上限. Note sight upper limit.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 212, $note_days, value);
	}
	
	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 213, $pay_dpt_cd);
	}

	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 213, $pay_dpt_cd, value);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 214, $dlv_sundry_flg);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 214, $dlv_sundry_flg, value);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 215, $dlv_cntct_dpt);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 215, $dlv_cntct_dpt, value);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 216, $dlv_cntct_psn);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 216, $dlv_cntct_psn, value);
	}

	/**
	 * 納品先担当者敬称. Delivery destination PIC honorific.<p>
	 *
	 */
	public String dlv_cntct_psn_title() {
		return getConstString(offset + 217, $dlv_cntct_psn_title);
	}

	/**
	 * 納品先担当者敬称. Delivery destination PIC honorific.<p>
	 *
	 */
	public void dlv_cntct_psn_title(String value) {
		setConstString(offset + 217, $dlv_cntct_psn_title, value);
	}

	/**
	 * 価格印字ＦＬＧ. Print price flg..<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 218, $pri_prnt_flg);
	}

	/**
	 * 価格印字ＦＬＧ. Print price flg..<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 218, $pri_prnt_flg, value);
	}

	/**
	 * 貸出在庫棚卸対象ＦＬＧ. For consignment inventory count flg..<p>
	 *
	 */
	public boolean cnsgn_stktk_flg() {
		return getConstBoolean(offset + 219, $cnsgn_stktk_flg);
	}

	/**
	 * 貸出在庫棚卸対象ＦＬＧ. For consignment inventory count flg..<p>
	 *
	 */
	public void cnsgn_stktk_flg(boolean value) {
		setConstBoolean(offset + 219, $cnsgn_stktk_flg, value);
	}

	/**
	 * 配送先ＦＬＧ. Receiving point flg..<p>
	 *
	 */
	public boolean tdlv_flg() {
		return getConstBoolean(offset + 220, $tdlv_flg);
	}

	/**
	 * 配送先ＦＬＧ. Receiving point flg..<p>
	 *
	 */
	public void tdlv_flg(boolean value) {
		setConstBoolean(offset + 220, $tdlv_flg, value);
	}

	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 221, $via_dlv_typ);
	}

	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 221, $via_dlv_typ, value);
	}

	/**
	 * 配送先必須ＦＬＧ. Receiving point required flg..<p>
	 *
	 */
	public boolean tdlv_req_flg() {
		return getConstBoolean(offset + 222, $tdlv_req_flg);
	}

	/**
	 * 配送先必須ＦＬＧ. Receiving point required flg..<p>
	 *
	 */
	public void tdlv_req_flg(boolean value) {
		setConstBoolean(offset + 222, $tdlv_req_flg, value);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 223, $lg_grp_cd);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 223, $lg_grp_cd, value);
	}

	/**
	 * 納品先カレンダＣＤ. Delivery destination calendar cd..<p>
	 *
	 */
	public String dlv_cal_cd() {
		return getConstString(offset + 224, $dlv_cal_cd);
	}

	/**
	 * 納品先カレンダＣＤ. Delivery destination calendar cd..<p>
	 *
	 */
	public void dlv_cal_cd(String value) {
		setConstString(offset + 224, $dlv_cal_cd, value);
	}

	/**
	 * 納品先チャネル１. Delivery destination channel 1.<p>
	 *
	 */
	public String dlv_chnnl1() {
		return getConstString(offset + 225, $dlv_chnnl1);
	}

	/**
	 * 納品先チャネル１. Delivery destination channel 1.<p>
	 *
	 */
	public void dlv_chnnl1(String value) {
		setConstString(offset + 225, $dlv_chnnl1, value);
	}

	/**
	 * 納品先チャネル２. Delivery destination channel 2.<p>
	 *
	 */
	public String dlv_chnnl2() {
		return getConstString(offset + 226, $dlv_chnnl2);
	}

	/**
	 * 納品先チャネル２. Delivery destination channel 2.<p>
	 *
	 */
	public void dlv_chnnl2(String value) {
		setConstString(offset + 226, $dlv_chnnl2, value);
	}

	/**
	 * 納品先チャネル３. Delivery destination channel 3.<p>
	 *
	 */
	public String dlv_chnnl3() {
		return getConstString(offset + 227, $dlv_chnnl3);
	}

	/**
	 * 納品先チャネル３. Delivery destination channel 3.<p>
	 *
	 */
	public void dlv_chnnl3(String value) {
		setConstString(offset + 227, $dlv_chnnl3, value);
	}

	/**
	 * 帳票発行区分（得意先）. Slip issue type (Customer).<p>
	 *
	 */
	public String cst_prnt_typ() {
		return getConstString(offset + 228, $cst_prnt_typ);
	}

	/**
	 * 帳票発行区分（得意先）. Slip issue type (Customer).<p>
	 *
	 */
	public void cst_prnt_typ(String value) {
		setConstString(offset + 228, $cst_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（売掛先）. Slip issue type (AR customer).<p>
	 *
	 */
	public String acst_prnt_typ() {
		return getConstString(offset + 229, $acst_prnt_typ);
	}

	/**
	 * 帳票発行区分（売掛先）. Slip issue type (AR customer).<p>
	 *
	 */
	public void acst_prnt_typ(String value) {
		setConstString(offset + 229, $acst_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（請求先）. Slip issue type (Billing customer).<p>
	 *
	 */
	public String bcst_prnt_typ() {
		return getConstString(offset + 230, $bcst_prnt_typ);
	}

	/**
	 * 帳票発行区分（請求先）. Slip issue type (Billing customer).<p>
	 *
	 */
	public void bcst_prnt_typ(String value) {
		setConstString(offset + 230, $bcst_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（入金先）. Slip issue type (Payer).<p>
	 *
	 */
	public String rcst_prnt_typ() {
		return getConstString(offset + 231, $rcst_prnt_typ);
	}

	/**
	 * 帳票発行区分（入金先）. Slip issue type (Payer).<p>
	 *
	 */
	public void rcst_prnt_typ(String value) {
		setConstString(offset + 231, $rcst_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（発注先）. Slip issue type (Supplier).<p>
	 *
	 */
	public String sppl_prnt_typ() {
		return getConstString(offset + 232, $sppl_prnt_typ);
	}

	/**
	 * 帳票発行区分（発注先）. Slip issue type (Supplier).<p>
	 *
	 */
	public void sppl_prnt_typ(String value) {
		setConstString(offset + 232, $sppl_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（買掛先）. Slip issue type (AP supplier).<p>
	 *
	 */
	public String asppl_prnt_typ() {
		return getConstString(offset + 233, $asppl_prnt_typ);
	}

	/**
	 * 帳票発行区分（買掛先）. Slip issue type (AP supplier).<p>
	 *
	 */
	public void asppl_prnt_typ(String value) {
		setConstString(offset + 233, $asppl_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（支払予定管理先）. Slip issue type (Scheduled payee).<p>
	 *
	 */
	public String bsppl_prnt_typ() {
		return getConstString(offset + 234, $bsppl_prnt_typ);
	}

	/**
	 * 帳票発行区分（支払予定管理先）. Slip issue type (Scheduled payee).<p>
	 *
	 */
	public void bsppl_prnt_typ(String value) {
		setConstString(offset + 234, $bsppl_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（支払先）. Slip issue type (Payee).<p>
	 *
	 */
	public String psppl_prnt_typ() {
		return getConstString(offset + 235, $psppl_prnt_typ);
	}

	/**
	 * 帳票発行区分（支払先）. Slip issue type (Payee).<p>
	 *
	 */
	public void psppl_prnt_typ(String value) {
		setConstString(offset + 235, $psppl_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（納品先）. Slip issue type (Delivery destination).<p>
	 *
	 */
	public String dlv_prnt_typ() {
		return getConstString(offset + 236, $dlv_prnt_typ);
	}

	/**
	 * 帳票発行区分（納品先）. Slip issue type (Delivery destination).<p>
	 *
	 */
	public void dlv_prnt_typ(String value) {
		setConstString(offset + 236, $dlv_prnt_typ, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 237, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 237, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 238, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 238, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 239, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 239, $memo3, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public String if_sub_char1() {
		return getConstString(offset + 240, $if_sub_char1);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public void if_sub_char1(String value) {
		setConstString(offset + 240, $if_sub_char1, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public String if_sub_char2() {
		return getConstString(offset + 241, $if_sub_char2);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public void if_sub_char2(String value) {
		setConstString(offset + 241, $if_sub_char2, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public String if_sub_char3() {
		return getConstString(offset + 242, $if_sub_char3);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public void if_sub_char3(String value) {
		setConstString(offset + 242, $if_sub_char3, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public String if_sub_char4() {
		return getConstString(offset + 243, $if_sub_char4);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public void if_sub_char4(String value) {
		setConstString(offset + 243, $if_sub_char4, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public String if_sub_char5() {
		return getConstString(offset + 244, $if_sub_char5);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public void if_sub_char5(String value) {
		setConstString(offset + 244, $if_sub_char5, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public String if_sub_char6() {
		return getConstString(offset + 245, $if_sub_char6);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public void if_sub_char6(String value) {
		setConstString(offset + 245, $if_sub_char6, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public String if_sub_char7() {
		return getConstString(offset + 246, $if_sub_char7);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public void if_sub_char7(String value) {
		setConstString(offset + 246, $if_sub_char7, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public String if_sub_char8() {
		return getConstString(offset + 247, $if_sub_char8);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public void if_sub_char8(String value) {
		setConstString(offset + 247, $if_sub_char8, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public String if_sub_char9() {
		return getConstString(offset + 248, $if_sub_char9);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public void if_sub_char9(String value) {
		setConstString(offset + 248, $if_sub_char9, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public String if_sub_char10() {
		return getConstString(offset + 249, $if_sub_char10);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public void if_sub_char10(String value) {
		setConstString(offset + 249, $if_sub_char10, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public String if_sub_char11() {
		return getConstString(offset + 250, $if_sub_char11);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public void if_sub_char11(String value) {
		setConstString(offset + 250, $if_sub_char11, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public String if_sub_char12() {
		return getConstString(offset + 251, $if_sub_char12);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public void if_sub_char12(String value) {
		setConstString(offset + 251, $if_sub_char12, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public String if_sub_char13() {
		return getConstString(offset + 252, $if_sub_char13);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public void if_sub_char13(String value) {
		setConstString(offset + 252, $if_sub_char13, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public String if_sub_char14() {
		return getConstString(offset + 253, $if_sub_char14);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public void if_sub_char14(String value) {
		setConstString(offset + 253, $if_sub_char14, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public String if_sub_char15() {
		return getConstString(offset + 254, $if_sub_char15);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public void if_sub_char15(String value) {
		setConstString(offset + 254, $if_sub_char15, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public String if_sub_char16() {
		return getConstString(offset + 255, $if_sub_char16);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public void if_sub_char16(String value) {
		setConstString(offset + 255, $if_sub_char16, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public String if_sub_char17() {
		return getConstString(offset + 256, $if_sub_char17);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public void if_sub_char17(String value) {
		setConstString(offset + 256, $if_sub_char17, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public String if_sub_char18() {
		return getConstString(offset + 257, $if_sub_char18);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public void if_sub_char18(String value) {
		setConstString(offset + 257, $if_sub_char18, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public String if_sub_char19() {
		return getConstString(offset + 258, $if_sub_char19);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public void if_sub_char19(String value) {
		setConstString(offset + 258, $if_sub_char19, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public String if_sub_char20() {
		return getConstString(offset + 259, $if_sub_char20);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public void if_sub_char20(String value) {
		setConstString(offset + 259, $if_sub_char20, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public String if_sub_char21() {
		return getConstString(offset + 260, $if_sub_char21);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public void if_sub_char21(String value) {
		setConstString(offset + 260, $if_sub_char21, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public String if_sub_char22() {
		return getConstString(offset + 261, $if_sub_char22);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public void if_sub_char22(String value) {
		setConstString(offset + 261, $if_sub_char22, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public String if_sub_char23() {
		return getConstString(offset + 262, $if_sub_char23);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public void if_sub_char23(String value) {
		setConstString(offset + 262, $if_sub_char23, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public String if_sub_char24() {
		return getConstString(offset + 263, $if_sub_char24);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public void if_sub_char24(String value) {
		setConstString(offset + 263, $if_sub_char24, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public String if_sub_char25() {
		return getConstString(offset + 264, $if_sub_char25);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public void if_sub_char25(String value) {
		setConstString(offset + 264, $if_sub_char25, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public String if_sub_char26() {
		return getConstString(offset + 265, $if_sub_char26);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public void if_sub_char26(String value) {
		setConstString(offset + 265, $if_sub_char26, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public String if_sub_char27() {
		return getConstString(offset + 266, $if_sub_char27);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public void if_sub_char27(String value) {
		setConstString(offset + 266, $if_sub_char27, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public String if_sub_char28() {
		return getConstString(offset + 267, $if_sub_char28);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public void if_sub_char28(String value) {
		setConstString(offset + 267, $if_sub_char28, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public String if_sub_char29() {
		return getConstString(offset + 268, $if_sub_char29);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public void if_sub_char29(String value) {
		setConstString(offset + 268, $if_sub_char29, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public String if_sub_char30() {
		return getConstString(offset + 269, $if_sub_char30);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public void if_sub_char30(String value) {
		setConstString(offset + 269, $if_sub_char30, value);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public MCNumber if_sub_num1() {
		return getConstNumber(offset + 270, $if_sub_num1);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(MCNumber value) {
		setConstNumber(offset + 270, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(int value) {
		setConstNumber(offset + 270, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(long value) {
		setConstNumber(offset + 270, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(float value) {
		setConstNumber(offset + 270, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(double value) {
		setConstNumber(offset + 270, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public MCNumber if_sub_num2() {
		return getConstNumber(offset + 271, $if_sub_num2);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(MCNumber value) {
		setConstNumber(offset + 271, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(int value) {
		setConstNumber(offset + 271, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(long value) {
		setConstNumber(offset + 271, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(float value) {
		setConstNumber(offset + 271, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(double value) {
		setConstNumber(offset + 271, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public MCNumber if_sub_num3() {
		return getConstNumber(offset + 272, $if_sub_num3);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(MCNumber value) {
		setConstNumber(offset + 272, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(int value) {
		setConstNumber(offset + 272, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(long value) {
		setConstNumber(offset + 272, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(float value) {
		setConstNumber(offset + 272, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(double value) {
		setConstNumber(offset + 272, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public MCNumber if_sub_num4() {
		return getConstNumber(offset + 273, $if_sub_num4);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(MCNumber value) {
		setConstNumber(offset + 273, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(int value) {
		setConstNumber(offset + 273, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(long value) {
		setConstNumber(offset + 273, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(float value) {
		setConstNumber(offset + 273, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(double value) {
		setConstNumber(offset + 273, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public MCNumber if_sub_num5() {
		return getConstNumber(offset + 274, $if_sub_num5);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(MCNumber value) {
		setConstNumber(offset + 274, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(int value) {
		setConstNumber(offset + 274, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(long value) {
		setConstNumber(offset + 274, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(float value) {
		setConstNumber(offset + 274, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(double value) {
		setConstNumber(offset + 274, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public MCDate if_sub_dt1() {
		return getConstDate(offset + 275, $if_sub_dt1);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public void if_sub_dt1(MCDate value) {
		setConstDate(offset + 275, $if_sub_dt1, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public MCDate if_sub_dt2() {
		return getConstDate(offset + 276, $if_sub_dt2);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public void if_sub_dt2(MCDate value) {
		setConstDate(offset + 276, $if_sub_dt2, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public MCDate if_sub_dt3() {
		return getConstDate(offset + 277, $if_sub_dt3);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public void if_sub_dt3(MCDate value) {
		setConstDate(offset + 277, $if_sub_dt3, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public MCDate if_sub_dt4() {
		return getConstDate(offset + 278, $if_sub_dt4);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public void if_sub_dt4(MCDate value) {
		setConstDate(offset + 278, $if_sub_dt4, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public MCDate if_sub_dt5() {
		return getConstDate(offset + 279, $if_sub_dt5);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public void if_sub_dt5(MCDate value) {
		setConstDate(offset + 279, $if_sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 280, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 280, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 281, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 281, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 281, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 281, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 281, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 281, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 282, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 282, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 282, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 282, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 282, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 282, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 283, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 283, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 284, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 284, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 285, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 285, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 286, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 286, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 287, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 287, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 287, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 287, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 287, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 287, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 288, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 288, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 289, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 289, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 290, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 290, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 291, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 291, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 292, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 292, $upd_srv_req_no, value);
	}

	/**
	 * メモ４. Memo 4.<p>
	 *
	 */
	public String memo4() {
		return getConstString(offset + 293, $memo4);
	}

	/**
	 * メモ４. Memo 4.<p>
	 *
	 */
	public void memo4(String value) {
		setConstString(offset + 293, $memo4, value);
	}

	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public String memo5() {
		return getConstString(offset + 294, $memo5);
	}

	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public void memo5(String value) {
		setConstString(offset + 294, $memo5, value);
	}

	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public String memo6() {
		return getConstString(offset + 295, $memo6);
	}

	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public void memo6(String value) {
		setConstString(offset + 295, $memo6, value);
	}

	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public String memo7() {
		return getConstString(offset + 296, $memo7);
	}

	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public void memo7(String value) {
		setConstString(offset + 296, $memo7, value);
	}

	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public String memo8() {
		return getConstString(offset + 297, $memo8);
	}

	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public void memo8(String value) {
		setConstString(offset + 297, $memo8, value);
	}

	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public String memo9() {
		return getConstString(offset + 298, $memo9);
	}

	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public void memo9(String value) {
		setConstString(offset + 298, $memo9, value);
	}

	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public String memo10() {
		return getConstString(offset + 299, $memo10);
	}

	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public void memo10(String value) {
		setConstString(offset + 299, $memo10, value);
	}

	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public String memo11() {
		return getConstString(offset + 300, $memo11);
	}

	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public void memo11(String value) {
		setConstString(offset + 300, $memo11, value);
	}

	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public String memo12() {
		return getConstString(offset + 301, $memo12);
	}

	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public void memo12(String value) {
		setConstString(offset + 301, $memo12, value);
	}

	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public String memo13() {
		return getConstString(offset + 302, $memo13);
	}

	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public void memo13(String value) {
		setConstString(offset + 302, $memo13, value);
	}

	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public String memo14() {
		return getConstString(offset + 303, $memo14);
	}

	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public void memo14(String value) {
		setConstString(offset + 303, $memo14, value);
	}

	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public String memo15() {
		return getConstString(offset + 304, $memo15);
	}

	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public void memo15(String value) {
		setConstString(offset + 304, $memo15, value);
	}

	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public String memo16() {
		return getConstString(offset + 305, $memo16);
	}

	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public void memo16(String value) {
		setConstString(offset + 305, $memo16, value);
	}

	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public String memo17() {
		return getConstString(offset + 306, $memo17);
	}

	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public void memo17(String value) {
		setConstString(offset + 306, $memo17, value);
	}

	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public String memo18() {
		return getConstString(offset + 307, $memo18);
	}

	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public void memo18(String value) {
		setConstString(offset + 307, $memo18, value);
	}

	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public String memo19() {
		return getConstString(offset + 308, $memo19);
	}

	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public void memo19(String value) {
		setConstString(offset + 308, $memo19, value);
	}

	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public String memo20() {
		return getConstString(offset + 309, $memo20);
	}

	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public void memo20(String value) {
		setConstString(offset + 309, $memo20, value);
	}

	/**
	 * 物流グループ混在不可ＦＬＧ. Prohibit mixed distribution group flg..<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 310, $not_lg_mix_flg);
	}

	/**
	 * 物流グループ混在不可ＦＬＧ. Prohibit mixed distribution group flg..<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 310, $not_lg_mix_flg, value);
	}

	/**
	 * ロット混在不可ＦＬＧ. Prohibit mixed lots flg..<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 311, $not_lot_mix_flg);
	}

	/**
	 * ロット混在不可ＦＬＧ. Prohibit mixed lots flg..<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 311, $not_lot_mix_flg, value);
	}

	/**
	 * サブロット混在不可ＦＬＧ. Prohibit mixed sublots flg..<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 312, $not_sublot_mix_flg);
	}

	/**
	 * サブロット混在不可ＦＬＧ. Prohibit mixed sublots flg..<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 312, $not_sublot_mix_flg, value);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 313, $cntry_nm);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 313, $cntry_nm, value);
	}

	/**
	 * 地域名. Region name.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 314, $area_nm);
	}

	/**
	 * 地域名. Region name.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 314, $area_nm, value);
	}

	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 315, $cur_nm);
	}

	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 315, $cur_nm, value);
	}

	/**
	 * 取引先分類名１. BP classification name 1.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return getConstString(offset + 316, $bp_grp_nm1);
	}

	/**
	 * 取引先分類名１. BP classification name 1.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		setConstString(offset + 316, $bp_grp_nm1, value);
	}

	/**
	 * 取引先分類名２. BP classification name 2.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return getConstString(offset + 317, $bp_grp_nm2);
	}

	/**
	 * 取引先分類名２. BP classification name 2.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		setConstString(offset + 317, $bp_grp_nm2, value);
	}

	/**
	 * 取引先分類名３. BP classification name 3.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return getConstString(offset + 318, $bp_grp_nm3);
	}

	/**
	 * 取引先分類名３. BP classification name 3.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		setConstString(offset + 318, $bp_grp_nm3, value);
	}

	/**
	 * 取引先分類名４. BP classification name 4.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return getConstString(offset + 319, $bp_grp_nm4);
	}

	/**
	 * 取引先分類名４. BP classification name 4.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		setConstString(offset + 319, $bp_grp_nm4, value);
	}

	/**
	 * 取引先分類名５. BP classification name 5.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return getConstString(offset + 320, $bp_grp_nm5);
	}

	/**
	 * 取引先分類名５. BP classification name 5.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		setConstString(offset + 320, $bp_grp_nm5, value);
	}

	/**
	 * 取引先分類名６. BP classification name 6.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return getConstString(offset + 321, $bp_grp_nm6);
	}

	/**
	 * 取引先分類名６. BP classification name 6.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		setConstString(offset + 321, $bp_grp_nm6, value);
	}

	/**
	 * 取引先分類名７. BP classification name 7.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return getConstString(offset + 322, $bp_grp_nm7);
	}

	/**
	 * 取引先分類名７. BP classification name 7.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		setConstString(offset + 322, $bp_grp_nm7, value);
	}

	/**
	 * 取引先分類名８. BP classification name 8.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return getConstString(offset + 323, $bp_grp_nm8);
	}

	/**
	 * 取引先分類名８. BP classification name 8.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		setConstString(offset + 323, $bp_grp_nm8, value);
	}

	/**
	 * 取引先分類名９. BP classification name 9.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return getConstString(offset + 324, $bp_grp_nm9);
	}

	/**
	 * 取引先分類名９. BP classification name 9.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		setConstString(offset + 324, $bp_grp_nm9, value);
	}

	/**
	 * 取引先分類名１０. BP classification name 10.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return getConstString(offset + 325, $bp_grp_nm10);
	}

	/**
	 * 取引先分類名１０. BP classification name 10.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		setConstString(offset + 325, $bp_grp_nm10, value);
	}

	/**
	 * 売掛先名. AR customer name.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 326, $acst_nm);
	}

	/**
	 * 売掛先名. AR customer name.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 326, $acst_nm, value);
	}

	/**
	 * 債権部門名. AR dept. name.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 327, $ar_dpt_nm);
	}

	/**
	 * 債権部門名. AR dept. name.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 327, $ar_dpt_nm, value);
	}

	/**
	 * 得意先納品書名. Customer delivery note name.<p>
	 *
	 */
	public String cst_ship_form_nm() {
		return getConstString(offset + 328, $cst_ship_form_nm);
	}

	/**
	 * 得意先納品書名. Customer delivery note name.<p>
	 *
	 */
	public void cst_ship_form_nm(String value) {
		setConstString(offset + 328, $cst_ship_form_nm, value);
	}

	/**
	 * 現品票名. Identification tag name.<p>
	 *
	 */
	public String stk_lst_form_nm() {
		return getConstString(offset + 329, $stk_lst_form_nm);
	}

	/**
	 * 現品票名. Identification tag name.<p>
	 *
	 */
	public void stk_lst_form_nm(String value) {
		setConstString(offset + 329, $stk_lst_form_nm, value);
	}

	/**
	 * 売上税名. Sales tax name.<p>
	 *
	 */
	public String sls_tax_nm() {
		return getConstString(offset + 330, $sls_tax_nm);
	}

	/**
	 * 売上税名. Sales tax name.<p>
	 *
	 */
	public void sls_tax_nm(String value) {
		setConstString(offset + 330, $sls_tax_nm, value);
	}

	/**
	 * 得意先取引条件名１. Customer transaction terms name 1.<p>
	 *
	 */
	public String cst_tterm_nm1() {
		return getConstString(offset + 331, $cst_tterm_nm1);
	}

	/**
	 * 得意先取引条件名１. Customer transaction terms name 1.<p>
	 *
	 */
	public void cst_tterm_nm1(String value) {
		setConstString(offset + 331, $cst_tterm_nm1, value);
	}

	/**
	 * 得意先取引条件名２. Customer transaction terms name 2.<p>
	 *
	 */
	public String cst_tterm_nm2() {
		return getConstString(offset + 332, $cst_tterm_nm2);
	}

	/**
	 * 得意先取引条件名２. Customer transaction terms name 2.<p>
	 *
	 */
	public void cst_tterm_nm2(String value) {
		setConstString(offset + 332, $cst_tterm_nm2, value);
	}

	/**
	 * 得意先取引条件名３. Customer transaction terms name 3.<p>
	 *
	 */
	public String cst_tterm_nm3() {
		return getConstString(offset + 333, $cst_tterm_nm3);
	}

	/**
	 * 得意先取引条件名３. Customer transaction terms name 3.<p>
	 *
	 */
	public void cst_tterm_nm3(String value) {
		setConstString(offset + 333, $cst_tterm_nm3, value);
	}

	/**
	 * 販売分析名１. Sales analysis name 1.<p>
	 *
	 */
	public String sls_anly_nm1() {
		return getConstString(offset + 334, $sls_anly_nm1);
	}

	/**
	 * 販売分析名１. Sales analysis name 1.<p>
	 *
	 */
	public void sls_anly_nm1(String value) {
		setConstString(offset + 334, $sls_anly_nm1, value);
	}

	/**
	 * 販売分析名２. Sales analysis name 2.<p>
	 *
	 */
	public String sls_anly_nm2() {
		return getConstString(offset + 335, $sls_anly_nm2);
	}

	/**
	 * 販売分析名２. Sales analysis name 2.<p>
	 *
	 */
	public void sls_anly_nm2(String value) {
		setConstString(offset + 335, $sls_anly_nm2, value);
	}

	/**
	 * 販売分析名３. Sales analysis name 3.<p>
	 *
	 */
	public String sls_anly_nm3() {
		return getConstString(offset + 336, $sls_anly_nm3);
	}

	/**
	 * 販売分析名３. Sales analysis name 3.<p>
	 *
	 */
	public void sls_anly_nm3(String value) {
		setConstString(offset + 336, $sls_anly_nm3, value);
	}

	/**
	 * 請求先名. Billing customer name.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 337, $bcst_nm);
	}

	/**
	 * 請求先名. Billing customer name.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 337, $bcst_nm, value);
	}

	/**
	 * 入金先名. Payer name.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 338, $rcst_nm);
	}

	/**
	 * 入金先名. Payer name.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 338, $rcst_nm, value);
	}

	/**
	 * 債権与信管理先名. AR credit managed BP name.<p>
	 *
	 */
	public String ar_cred_nm() {
		return getConstString(offset + 339, $ar_cred_nm);
	}

	/**
	 * 債権与信管理先名. AR credit managed BP name.<p>
	 *
	 */
	public void ar_cred_nm(String value) {
		setConstString(offset + 339, $ar_cred_nm, value);
	}

	/**
	 * 請求先担当部門名. Billing customer dept. in charge name.<p>
	 *
	 */
	public String bcst_dpt_nm() {
		return getConstString(offset + 340, $bcst_dpt_nm);
	}

	/**
	 * 請求先担当部門名. Billing customer dept. in charge name.<p>
	 *
	 */
	public void bcst_dpt_nm(String value) {
		setConstString(offset + 340, $bcst_dpt_nm, value);
	}

	/**
	 * 請求先カレンダ名. Billing customer calendar name.<p>
	 *
	 */
	public String bill_cal_nm() {
		return getConstString(offset + 341, $bill_cal_nm);
	}

	/**
	 * 請求先カレンダ名. Billing customer calendar name.<p>
	 *
	 */
	public void bill_cal_nm(String value) {
		setConstString(offset + 341, $bill_cal_nm, value);
	}

	/**
	 * 債権相殺グループ名. AR offset group name.<p>
	 *
	 */
	public String ar_setoff_grp_nm() {
		return getConstString(offset + 342, $ar_setoff_grp_nm);
	}

	/**
	 * 債権相殺グループ名. AR offset group name.<p>
	 *
	 */
	public void ar_setoff_grp_nm(String value) {
		setConstString(offset + 342, $ar_setoff_grp_nm, value);
	}

	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 343, $lg_grp_nm);
	}

	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 343, $lg_grp_nm, value);
	}

	/**
	 * 納品先カレンダ名. Delivery destination calendar name.<p>
	 *
	 */
	public String dlv_cal_nm() {
		return getConstString(offset + 344, $dlv_cal_nm);
	}

	/**
	 * 納品先カレンダ名. Delivery destination calendar name.<p>
	 *
	 */
	public void dlv_cal_nm(String value) {
		setConstString(offset + 344, $dlv_cal_nm, value);
	}

	/**
	 * 買掛先名. AP supplier name.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 345, $asppl_nm);
	}

	/**
	 * 買掛先名. AP supplier name.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 345, $asppl_nm, value);
	}

	/**
	 * ＶＭＩ購買部門名. VMI purchasing dept. name.<p>
	 *
	 */
	public String vmi_purc_dpt_nm() {
		return getConstString(offset + 346, $vmi_purc_dpt_nm);
	}

	/**
	 * ＶＭＩ購買部門名. VMI purchasing dept. name.<p>
	 *
	 */
	public void vmi_purc_dpt_nm(String value) {
		setConstString(offset + 346, $vmi_purc_dpt_nm, value);
	}

	/**
	 * 注文書表示名. Display PO sheet name.<p>
	 *
	 */
	public String po_print_nm() {
		return getConstString(offset + 347, $po_print_nm);
	}

	/**
	 * 注文書表示名. Display PO sheet name.<p>
	 *
	 */
	public void po_print_nm(String value) {
		setConstString(offset + 347, $po_print_nm, value);
	}

	/**
	 * 発注先納品書名. Supplier delivery note name.<p>
	 *
	 */
	public String sppl_ship_form_nm() {
		return getConstString(offset + 348, $sppl_ship_form_nm);
	}

	/**
	 * 発注先納品書名. Supplier delivery note name.<p>
	 *
	 */
	public void sppl_ship_form_nm(String value) {
		setConstString(offset + 348, $sppl_ship_form_nm, value);
	}

	/**
	 * 仕入税名. Purchase tax type name.<p>
	 *
	 */
	public String purc_tax_nm() {
		return getConstString(offset + 349, $purc_tax_nm);
	}

	/**
	 * 仕入税名. Purchase tax type name.<p>
	 *
	 */
	public void purc_tax_nm(String value) {
		setConstString(offset + 349, $purc_tax_nm, value);
	}

	/**
	 * 支給税名. Supply tax name.<p>
	 *
	 */
	public String prov_tax_nm() {
		return getConstString(offset + 350, $prov_tax_nm);
	}

	/**
	 * 支給税名. Supply tax name.<p>
	 *
	 */
	public void prov_tax_nm(String value) {
		setConstString(offset + 350, $prov_tax_nm, value);
	}

	/**
	 * 発注先カレンダ名. Supplier calendar name.<p>
	 *
	 */
	public String sppl_cal_nm() {
		return getConstString(offset + 351, $sppl_cal_nm);
	}

	/**
	 * 発注先カレンダ名. Supplier calendar name.<p>
	 *
	 */
	public void sppl_cal_nm(String value) {
		setConstString(offset + 351, $sppl_cal_nm, value);
	}

	/**
	 * 発注先取引条件名１. Supplier transaction terms name 1.<p>
	 *
	 */
	public String sppl_tterm_nm1() {
		return getConstString(offset + 352, $sppl_tterm_nm1);
	}

	/**
	 * 発注先取引条件名１. Supplier transaction terms name 1.<p>
	 *
	 */
	public void sppl_tterm_nm1(String value) {
		setConstString(offset + 352, $sppl_tterm_nm1, value);
	}

	/**
	 * 発注先取引条件名２. Supplier transaction terms name 2.<p>
	 *
	 */
	public String sppl_tterm_nm2() {
		return getConstString(offset + 353, $sppl_tterm_nm2);
	}

	/**
	 * 発注先取引条件名２. Supplier transaction terms name 2.<p>
	 *
	 */
	public void sppl_tterm_nm2(String value) {
		setConstString(offset + 353, $sppl_tterm_nm2, value);
	}

	/**
	 * 発注先取引条件名３. Supplier transaction terms name 3.<p>
	 *
	 */
	public String sppl_tterm_nm3() {
		return getConstString(offset + 354, $sppl_tterm_nm3);
	}

	/**
	 * 発注先取引条件名３. Supplier transaction terms name 3.<p>
	 *
	 */
	public void sppl_tterm_nm3(String value) {
		setConstString(offset + 354, $sppl_tterm_nm3, value);
	}

	/**
	 * 支払予定管理先名. Scheduled payee name.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 355, $bsppl_nm);
	}

	/**
	 * 支払予定管理先名. Scheduled payee name.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 355, $bsppl_nm, value);
	}

	/**
	 * 債務部門名. AP dept. name.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 356, $ap_dpt_nm);
	}

	/**
	 * 債務部門名. AP dept. name.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 356, $ap_dpt_nm, value);
	}

	/**
	 * 支払先名. Payee name.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 357, $psppl_nm);
	}

	/**
	 * 支払先名. Payee name.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 357, $psppl_nm, value);
	}

	/**
	 * 債務与信管理先名. AP credit managed BP name.<p>
	 *
	 */
	public String ap_cred_nm() {
		return getConstString(offset + 358, $ap_cred_nm);
	}

	/**
	 * 債務与信管理先名. AP credit managed BP name.<p>
	 *
	 */
	public void ap_cred_nm(String value) {
		setConstString(offset + 358, $ap_cred_nm, value);
	}

	/**
	 * 支払予定管理先担当部門名. Name of dept. in charge of scheduled payee.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 359, $bsppl_dpt_nm);
	}

	/**
	 * 支払予定管理先担当部門名. Name of dept. in charge of scheduled payee.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 359, $bsppl_dpt_nm, value);
	}

	/**
	 * 債務相殺グループ名. AP offset group name.<p>
	 *
	 */
	public String ap_setoff_grp_nm() {
		return getConstString(offset + 360, $ap_setoff_grp_nm);
	}

	/**
	 * 債務相殺グループ名. AP offset group name.<p>
	 *
	 */
	public void ap_setoff_grp_nm(String value) {
		setConstString(offset + 360, $ap_setoff_grp_nm, value);
	}

	/**
	 * 支払先口座名. Payee account name.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 361, $pay_bank_ac_nm);
	}

	/**
	 * 支払先口座名. Payee account name.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 361, $pay_bank_ac_nm, value);
	}

	/**
	 * 支払部門名. Payment dept. name.<p>
	 *
	 */
	public String pay_dpt_nm() {
		return getConstString(offset + 362, $pay_dpt_nm);
	}

	/**
	 * 支払部門名. Payment dept. name.<p>
	 *
	 */
	public void pay_dpt_nm(String value) {
		setConstString(offset + 362, $pay_dpt_nm, value);
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			return cst_cntct_psn_title();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ();
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ();
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			return pay_ntc_zip_cd();
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			return pay_ntc_addr1();
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			return pay_ntc_addr2();
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			return pay_ntc_addr3();
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			return pay_ntc_addr4();
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_nm();
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_dpt();
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn();
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn_title();
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			return pay_ntc_tel();
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ();
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ();
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ();
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			return dlv_cntct_psn_title();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			return dlv_chnnl1();
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			return dlv_chnnl2();
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			return dlv_chnnl3();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			return acst_prnt_typ();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			return asppl_prnt_typ();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			return dlv_prnt_typ();
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
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			return cst_ship_form_nm();
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			return stk_lst_form_nm();
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			return sls_tax_nm();
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			return cst_tterm_nm1();
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			return cst_tterm_nm2();
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			return cst_tterm_nm3();
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			return sls_anly_nm1();
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			return sls_anly_nm2();
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			return sls_anly_nm3();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			return ar_cred_nm();
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			return bcst_dpt_nm();
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			return bill_cal_nm();
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ar_setoff_grp_nm();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($dlv_cal_nm.equalsIgnoreCase(name)) {
			return dlv_cal_nm();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_nm();
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			return po_print_nm();
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			return sppl_ship_form_nm();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			return prov_tax_nm();
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			return sppl_cal_nm();
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			return sppl_tterm_nm1();
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			return sppl_tterm_nm2();
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			return sppl_tterm_nm3();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			return ap_cred_nm();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ap_setoff_grp_nm();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			return ship_lt();
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			return bill_cl_delay_days();
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			return auto_appl_delay_days();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			return psppl_cl_day1();
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			return psppl_cl_day2();
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			return psppl_cl_day3();
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			return psppl_cl_day4();
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			return psppl_cl_day5();
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_schd_cl_delay_days();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			return all_com_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			return rcv_amt_match_flg();
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			return ar_sttl_typ_match_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			return po_dlv_slip_flg();
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			return dlv_inst_dlv_slip_flg();
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			return prms_rcpt_dlv_slip_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_dup_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			return tax_on_pay_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			return pay_ntc_prnt_flg();
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_outp_flg();
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_bfw_bal_disp_flg();
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_pay_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			return cnsgn_stktk_flg();
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			return tdlv_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			return cst_cntct_psn_title();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ();
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ();
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			return pay_ntc_zip_cd();
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			return pay_ntc_addr1();
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			return pay_ntc_addr2();
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			return pay_ntc_addr3();
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			return pay_ntc_addr4();
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_nm();
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_dpt();
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn();
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn_title();
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			return pay_ntc_tel();
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ();
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ();
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ();
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			return dlv_cntct_psn_title();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			return dlv_chnnl1();
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			return dlv_chnnl2();
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			return dlv_chnnl3();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			return acst_prnt_typ();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			return asppl_prnt_typ();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			return dlv_prnt_typ();
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
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			return cst_ship_form_nm();
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			return stk_lst_form_nm();
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			return sls_tax_nm();
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			return cst_tterm_nm1();
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			return cst_tterm_nm2();
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			return cst_tterm_nm3();
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			return sls_anly_nm1();
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			return sls_anly_nm2();
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			return sls_anly_nm3();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			return ar_cred_nm();
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			return bcst_dpt_nm();
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			return bill_cal_nm();
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ar_setoff_grp_nm();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($dlv_cal_nm.equalsIgnoreCase(name)) {
			return dlv_cal_nm();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_nm();
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			return po_print_nm();
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			return sppl_ship_form_nm();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			return prov_tax_nm();
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			return sppl_cal_nm();
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			return sppl_tterm_nm1();
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			return sppl_tterm_nm2();
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			return sppl_tterm_nm3();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			return ap_cred_nm();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ap_setoff_grp_nm();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			return ship_lt();
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			return bill_cl_delay_days();
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			return auto_appl_delay_days();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			return psppl_cl_day1();
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			return psppl_cl_day2();
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			return psppl_cl_day3();
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			return psppl_cl_day4();
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			return psppl_cl_day5();
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_schd_cl_delay_days();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			return all_com_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			return rcv_amt_match_flg();
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			return ar_sttl_typ_match_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			return po_dlv_slip_flg();
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			return dlv_inst_dlv_slip_flg();
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			return prms_rcpt_dlv_slip_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_dup_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			return tax_on_pay_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			return pay_ntc_prnt_flg();
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_outp_flg();
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_bfw_bal_disp_flg();
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_pay_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			return cnsgn_stktk_flg();
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			return tdlv_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			cst_cntct_dpt(value);
			return;
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			cst_cntct_psn(value);
			return;
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			cst_cntct_psn_title(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_ba_typ(value);
			return;
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ(value);
			return;
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			pay_ntc_zip_cd(value);
			return;
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			pay_ntc_addr1(value);
			return;
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			pay_ntc_addr2(value);
			return;
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			pay_ntc_addr3(value);
			return;
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			pay_ntc_addr4(value);
			return;
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_nm(value);
			return;
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_dpt(value);
			return;
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn(value);
			return;
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn_title(value);
			return;
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			pay_ntc_tel(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ(value);
			return;
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			dlv_cntct_psn_title(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
			return;
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			dlv_chnnl1(value);
			return;
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			dlv_chnnl2(value);
			return;
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			dlv_chnnl3(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			acst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			asppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			dlv_prnt_typ(value);
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
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			cst_ship_form_nm(value);
			return;
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			stk_lst_form_nm(value);
			return;
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			sls_tax_nm(value);
			return;
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			cst_tterm_nm1(value);
			return;
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			cst_tterm_nm2(value);
			return;
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			cst_tterm_nm3(value);
			return;
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			sls_anly_nm1(value);
			return;
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			sls_anly_nm2(value);
			return;
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			sls_anly_nm3(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			ar_cred_nm(value);
			return;
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			bcst_dpt_nm(value);
			return;
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			bill_cal_nm(value);
			return;
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			ar_setoff_grp_nm(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($dlv_cal_nm.equalsIgnoreCase(name)) {
			dlv_cal_nm(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			vmi_purc_dpt_nm(value);
			return;
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			po_print_nm(value);
			return;
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			sppl_ship_form_nm(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			prov_tax_nm(value);
			return;
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			sppl_cal_nm(value);
			return;
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			sppl_tterm_nm1(value);
			return;
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			sppl_tterm_nm2(value);
			return;
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			sppl_tterm_nm3(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
			return;
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			ap_cred_nm(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			ap_setoff_grp_nm(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			all_com_flg(value);
			return;
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
			return;
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			rcv_amt_match_flg(value);
			return;
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			ar_sttl_typ_match_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			po_dlv_slip_flg(value);
			return;
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			dlv_inst_dlv_slip_flg(value);
			return;
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			prms_rcpt_dlv_slip_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			wrk_po_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			prov_tax_cd_prio_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			rcpt_iv_dup_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			tax_on_pay_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			pay_ntc_prnt_flg(value);
			return;
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_outp_flg(value);
			return;
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			pay_ntc_bfw_bal_disp_flg(value);
			return;
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_pay_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			cnsgn_stktk_flg(value);
			return;
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			tdlv_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			cst_cntct_dpt(value);
			return;
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			cst_cntct_psn(value);
			return;
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			cst_cntct_psn_title(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_ba_typ(value);
			return;
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ(value);
			return;
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			pay_ntc_zip_cd(value);
			return;
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			pay_ntc_addr1(value);
			return;
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			pay_ntc_addr2(value);
			return;
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			pay_ntc_addr3(value);
			return;
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			pay_ntc_addr4(value);
			return;
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_nm(value);
			return;
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_dpt(value);
			return;
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn(value);
			return;
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn_title(value);
			return;
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			pay_ntc_tel(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ(value);
			return;
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			dlv_cntct_psn_title(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
			return;
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			dlv_chnnl1(value);
			return;
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			dlv_chnnl2(value);
			return;
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			dlv_chnnl3(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			acst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			asppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			dlv_prnt_typ(value);
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
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			cst_ship_form_nm(value);
			return;
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			stk_lst_form_nm(value);
			return;
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			sls_tax_nm(value);
			return;
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			cst_tterm_nm1(value);
			return;
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			cst_tterm_nm2(value);
			return;
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			cst_tterm_nm3(value);
			return;
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			sls_anly_nm1(value);
			return;
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			sls_anly_nm2(value);
			return;
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			sls_anly_nm3(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			ar_cred_nm(value);
			return;
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			bcst_dpt_nm(value);
			return;
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			bill_cal_nm(value);
			return;
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			ar_setoff_grp_nm(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($dlv_cal_nm.equalsIgnoreCase(name)) {
			dlv_cal_nm(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($vmi_purc_dpt_nm.equalsIgnoreCase(name)) {
			vmi_purc_dpt_nm(value);
			return;
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			po_print_nm(value);
			return;
		}
		if ($sppl_ship_form_nm.equalsIgnoreCase(name)) {
			sppl_ship_form_nm(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			prov_tax_nm(value);
			return;
		}
		if ($sppl_cal_nm.equalsIgnoreCase(name)) {
			sppl_cal_nm(value);
			return;
		}
		if ($sppl_tterm_nm1.equalsIgnoreCase(name)) {
			sppl_tterm_nm1(value);
			return;
		}
		if ($sppl_tterm_nm2.equalsIgnoreCase(name)) {
			sppl_tterm_nm2(value);
			return;
		}
		if ($sppl_tterm_nm3.equalsIgnoreCase(name)) {
			sppl_tterm_nm3(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
			return;
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			ap_cred_nm(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			ap_setoff_grp_nm(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			all_com_flg(value);
			return;
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
			return;
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			rcv_amt_match_flg(value);
			return;
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			ar_sttl_typ_match_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			po_dlv_slip_flg(value);
			return;
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			dlv_inst_dlv_slip_flg(value);
			return;
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			prms_rcpt_dlv_slip_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			wrk_po_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			prov_tax_cd_prio_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			rcpt_iv_dup_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			tax_on_pay_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			pay_ntc_prnt_flg(value);
			return;
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_outp_flg(value);
			return;
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			pay_ntc_bfw_bal_disp_flg(value);
			return;
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_pay_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			cnsgn_stktk_flg(value);
			return;
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			tdlv_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
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
		super.setBooleanNE(name, value);
	}

}
