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
 * "出荷指図送信ＩＦ // Shipping order export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>ship_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷指図ＮＯ</td>
 *  	<td>Shipping order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_inst_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷指図改訂番号</td>
 *  	<td>Shipping order rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_fr_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷元物流グループＣＤ</td>
 *  	<td>Shipping point distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_ship_fr_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ出荷元物流グループＣＤ</td>
 *  	<td>IF shipping point distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_fr_lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷元物流グループ名</td>
 *  	<td>Shipping point distribution group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>倉庫事業者ＣＤ</td>
 *  	<td>Warehousing business cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_site_co_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ倉庫事業者ＣＤ</td>
 *  	<td>IF warehousing business cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_co_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>倉庫事業者名</td>
 *  	<td>Warehousing business name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_inst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷指図日時</td>
 *  	<td>Shipping order date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷予定日時</td>
 *  	<td>Scheduled shipping date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品予定日時</td>
 *  	<td>Scheduled delivery date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_wk_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷作業ＣＤ</td>
 *  	<td>Shipping operation cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_ship_wk_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ出荷作業ＣＤ</td>
 *  	<td>IF shipping operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_wk_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷作業名</td>
 *  	<td>Shipping operation name</td>
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
 *  	<td>if_ship_term_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ出荷条件ＣＤ</td>
 *  	<td>IF shipping conditions cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_term_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷条件名</td>
 *  	<td>Shipping conditions name</td>
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
 *  	<td>if_inst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ指図部門ＣＤ</td>
 *  	<td>IF order dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図部門名</td>
 *  	<td>Order dept. name</td>
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
 *  	<td>if_inst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ指図担当者ＣＤ</td>
 *  	<td>IF order PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_usr_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図担当者名</td>
 *  	<td>Order PIC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷先物流グループＣＤ</td>
 *  	<td>Receiving point distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_ship_to_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ出荷先物流グループＣＤ</td>
 *  	<td>IF receiving point distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷先物流グループ名</td>
 *  	<td>Receiving point distribution group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_to_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送付先識別区分</td>
 *  	<td>Receiving point identification type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送付先識別ＣＤ</td>
 *  	<td>Receiving point identification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_ship_to_id_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ送付先識別ＣＤ</td>
 *  	<td>IF receiving point identification cd.</td>
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
 *  	<td>dlv_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先識別区分</td>
 *  	<td>Delivery destination identification type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先識別ＣＤ</td>
 *  	<td>Delivery destination identification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_dlv_id_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ納品先識別ＣＤ</td>
 *  	<td>IF delivery destination identification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_id_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先識別名</td>
 *  	<td>Delivery destination identification name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_cst_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ得意先ＣＤ</td>
 *  	<td>IF customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先名</td>
 *  	<td>Customer name</td>
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
 *  	<td>if_dest_cd1</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ仕向先ＣＤ１</td>
 *  	<td>IF distribution channel cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dest_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先名１</td>
 *  	<td>Distribution channel name 1</td>
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
 *  	<td>if_dest_cd2</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ仕向先ＣＤ２</td>
 *  	<td>IF distribution channel cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先名２</td>
 *  	<td>Distribution channel name 2</td>
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
 *  	<td>if_dest_cd3</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ仕向先ＣＤ３</td>
 *  	<td>IF distribution channel cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dest_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先名３</td>
 *  	<td>Distribution channel name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_inst_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷指図明細ＮＯ</td>
 *  	<td>Shipping order details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_alloc_sts_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷引当状況ＮＯ</td>
 *  	<td>Shipping allocation status No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス明細ＮＯ</td>
 *  	<td>Invoice details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書ＮＯ</td>
 *  	<td>Delivery note No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書明細ＮＯ</td>
 *  	<td>Delivery note details No.</td>
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
 *  	<td>if_trd_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引ＣＤ</td>
 *  	<td>IF transaction cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引名</td>
 *  	<td>Transaction name</td>
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
 *  	<td>ship_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷場所ＣＤ</td>
 *  	<td>Shipping location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_ship_loc_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ出荷場所ＣＤ</td>
 *  	<td>IF shipping location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷場所名</td>
 *  	<td>Shipping location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷棚・ラインＣＤ</td>
 *  	<td>Shipping rack/line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_ship_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ出荷棚・ラインＣＤ</td>
 *  	<td>IF shipping rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷棚・ライン名</td>
 *  	<td>Shipping rack/line name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_loc_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷場所ＴＥＬ</td>
 *  	<td>Shipping location TEL</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_loc_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷場所ＦＡＸ</td>
 *  	<td>Shipping location FAX</td>
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
 *  	<td>pd_inst_dlv_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品依頼日時</td>
 *  	<td>Delivery request date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷希望日時</td>
 *  	<td>Desired shipping date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>assort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃ＦＬＧ</td>
 *  	<td>Assortment flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>set_itm_grp_no</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品揃グループＮＯ</td>
 *  	<td>Assortment group No.</td>
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
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_itm_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ品目ＣＤ</td>
 *  	<td>IF item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番１</td>
 *  	<td>IF branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番２</td>
 *  	<td>IF branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番３</td>
 *  	<td>IF branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先品目ＣＤ</td>
 *  	<td>Customer item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先品名</td>
 *  	<td>Customer item name</td>
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
 *  	<td>Y</td>
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
 *  	<td>Y</td>
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
 *  	<td>Y</td>
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
 *  	<td>Y</td>
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
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付ＣＤ</td>
 *  	<td>Grading cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_gd_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ格付ＣＤ</td>
 *  	<td>IF grading cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gd_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付名</td>
 *  	<td>Grading name</td>
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
 *  	<td>stk_insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫検査区分</td>
 *  	<td>Inventory inspection type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫識別区分</td>
 *  	<td>Inventory identification type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫取引先ＣＤ</td>
 *  	<td>Inventory BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ在庫取引先ＣＤ</td>
 *  	<td>IF inventory BP cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫取引先名</td>
 *  	<td>Inventory BP name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ent_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入力単位数量</td>
 *  	<td>Input unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ent_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入力単位ＣＤ</td>
 *  	<td>Input unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_ent_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ入力単位ＣＤ</td>
 *  	<td>IF input unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ent_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入力単位名</td>
 *  	<td>Input unit name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ent_unit_bnum</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入力単位入数</td>
 *  	<td>Quantity within input unit</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ent_unit_wt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入力単位重量</td>
 *  	<td>Input unit weight</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ent_unit_dim</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入力単位容積</td>
 *  	<td>Input unit volume</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wt_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>重量単位ＣＤ</td>
 *  	<td>Weight unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_wt_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ重量単位ＣＤ</td>
 *  	<td>IF weight unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wt_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>重量単位名</td>
 *  	<td>Weight unit name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dim_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>容積単位ＣＤ</td>
 *  	<td>Volume unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_dim_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ容積単位ＣＤ</td>
 *  	<td>IF volume unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dim_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>容積単位名</td>
 *  	<td>Volume unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位数量</td>
 *  	<td>Transaction unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引単位ＣＤ</td>
 *  	<td>IF transaction unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位名</td>
 *  	<td>Transaction unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ基準単位ＣＤ</td>
 *  	<td>IF base unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位名</td>
 *  	<td>Base unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pack_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>荷姿単位数量</td>
 *  	<td>SKU qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
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
 *  	<td>pack_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位名</td>
 *  	<td>SKU name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>引当済ＦＬＧ</td>
 *  	<td>Allocated flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>abort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>打切ＦＬＧ</td>
 *  	<td>Cancel remaining flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_acxfr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売他勘定ＦＬＧ</td>
 *  	<td>Sales other accounting flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_cststk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>預り出荷ＦＬＧ</td>
 *  	<td>Customer inventory shipment flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>vmi_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>貸出出荷ＦＬＧ</td>
 *  	<td>Consignment shipment flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>vld_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効期限</td>
 *  	<td>Expiration date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lmt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>使用期限</td>
 *  	<td>Usage expiration date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>first_gr_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最古入庫日</td>
 *  	<td>Oldest GR date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給区分</td>
 *  	<td>Supply type</td>
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
 *  	<td>ret_prov_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給区分（返品）</td>
 *  	<td>Supply type (Return)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_prov_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給計上区分（返品）</td>
 *  	<td>Supply recording type (Return)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>理由ＣＤ</td>
 *  	<td>Reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ理由ＣＤ</td>
 *  	<td>IF reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>理由名</td>
 *  	<td>Reason name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図備考</td>
 *  	<td>Order remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図明細備考</td>
 *  	<td>Order details remarks</td>
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
 *  	<td>if_co_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ会社ＣＤ</td>
 *  	<td>IF company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>co_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社名</td>
 *  	<td>Company name</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_SHIP_INST_SEND_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_SHIP_INST_SEND_IF";

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
	 * 出荷指図ＮＯ. Shipping order No..<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	private static final MCPermColumnInfo _ship_inst_no = createColumnInfo("ship_inst_no");
	public final MCStringPermColumn ship_inst_no = createStringColumn(_ship_inst_no);
	
	/**
	 * 出荷指図改訂番号. Shipping order rev. number.<p>
	 *
	 */
	public static final String $ship_inst_rev = "ship_inst_rev";
	private static final MCPermColumnInfo _ship_inst_rev = createColumnInfo("ship_inst_rev");
	public final MCNumberPermColumn ship_inst_rev = createNumberColumn(_ship_inst_rev);
	
	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	private static final MCPermColumnInfo _ship_fr_lg_grp_cd = createColumnInfo("ship_fr_lg_grp_cd");
	public final MCStringPermColumn ship_fr_lg_grp_cd = createStringColumn(_ship_fr_lg_grp_cd);
	
	/**
	 * ＩＦ出荷元物流グループＣＤ. IF shipping point distribution group cd..<p>
	 *
	 */
	public static final String $if_ship_fr_lg_grp_cd = "if_ship_fr_lg_grp_cd";
	private static final MCPermColumnInfo _if_ship_fr_lg_grp_cd = createColumnInfo("if_ship_fr_lg_grp_cd");
	public final MCStringPermColumn if_ship_fr_lg_grp_cd = createStringColumn(_if_ship_fr_lg_grp_cd);
	
	/**
	 * 出荷元物流グループ名. Shipping point distribution group name.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_nm = "ship_fr_lg_grp_nm";
	private static final MCPermColumnInfo _ship_fr_lg_grp_nm = createColumnInfo("ship_fr_lg_grp_nm");
	public final MCStringPermColumn ship_fr_lg_grp_nm = createStringColumn(_ship_fr_lg_grp_nm);
	
	/**
	 * 倉庫事業者ＣＤ. Warehousing business cd..<p>
	 *
	 */
	public static final String $site_co_cd = "site_co_cd";
	private static final MCPermColumnInfo _site_co_cd = createColumnInfo("site_co_cd");
	public final MCStringPermColumn site_co_cd = createStringColumn(_site_co_cd);
	
	/**
	 * ＩＦ倉庫事業者ＣＤ. IF warehousing business cd..<p>
	 *
	 */
	public static final String $if_site_co_cd = "if_site_co_cd";
	private static final MCPermColumnInfo _if_site_co_cd = createColumnInfo("if_site_co_cd");
	public final MCStringPermColumn if_site_co_cd = createStringColumn(_if_site_co_cd);
	
	/**
	 * 倉庫事業者名. Warehousing business name.<p>
	 *
	 */
	public static final String $site_co_nm = "site_co_nm";
	private static final MCPermColumnInfo _site_co_nm = createColumnInfo("site_co_nm");
	public final MCStringPermColumn site_co_nm = createStringColumn(_site_co_nm);
	
	/**
	 * 出荷指図日時. Shipping order date and time.<p>
	 *
	 */
	public static final String $ship_inst_tm = "ship_inst_tm";
	private static final MCPermColumnInfo _ship_inst_tm = createColumnInfo("ship_inst_tm");
	public final MCDatePermColumn ship_inst_tm = createDateColumn(_ship_inst_tm);
	
	/**
	 * 出荷予定日時. Scheduled shipping date and time.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	private static final MCPermColumnInfo _ship_schd_tm = createColumnInfo("ship_schd_tm");
	public final MCDatePermColumn ship_schd_tm = createDateColumn(_ship_schd_tm);
	
	/**
	 * 納品予定日時. Scheduled delivery date and time.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	private static final MCPermColumnInfo _dlv_schd_tm = createColumnInfo("dlv_schd_tm");
	public final MCDatePermColumn dlv_schd_tm = createDateColumn(_dlv_schd_tm);
	
	/**
	 * 出荷作業ＣＤ. Shipping operation cd..<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	private static final MCPermColumnInfo _ship_wk_cd = createColumnInfo("ship_wk_cd");
	public final MCStringPermColumn ship_wk_cd = createStringColumn(_ship_wk_cd);
	
	/**
	 * ＩＦ出荷作業ＣＤ. IF shipping operation cd..<p>
	 *
	 */
	public static final String $if_ship_wk_cd = "if_ship_wk_cd";
	private static final MCPermColumnInfo _if_ship_wk_cd = createColumnInfo("if_ship_wk_cd");
	public final MCStringPermColumn if_ship_wk_cd = createStringColumn(_if_ship_wk_cd);
	
	/**
	 * 出荷作業名. Shipping operation name.<p>
	 *
	 */
	public static final String $ship_wk_nm = "ship_wk_nm";
	private static final MCPermColumnInfo _ship_wk_nm = createColumnInfo("ship_wk_nm");
	public final MCStringPermColumn ship_wk_nm = createStringColumn(_ship_wk_nm);
	
	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	private static final MCPermColumnInfo _ship_term_cd = createColumnInfo("ship_term_cd");
	public final MCStringPermColumn ship_term_cd = createStringColumn(_ship_term_cd);
	
	/**
	 * ＩＦ出荷条件ＣＤ. IF shipping conditions cd..<p>
	 *
	 */
	public static final String $if_ship_term_cd = "if_ship_term_cd";
	private static final MCPermColumnInfo _if_ship_term_cd = createColumnInfo("if_ship_term_cd");
	public final MCStringPermColumn if_ship_term_cd = createStringColumn(_if_ship_term_cd);
	
	/**
	 * 出荷条件名. Shipping conditions name.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	private static final MCPermColumnInfo _ship_term_nm = createColumnInfo("ship_term_nm");
	public final MCStringPermColumn ship_term_nm = createStringColumn(_ship_term_nm);
	
	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	private static final MCPermColumnInfo _inst_dpt_cd = createColumnInfo("inst_dpt_cd");
	public final MCStringPermColumn inst_dpt_cd = createStringColumn(_inst_dpt_cd);
	
	/**
	 * ＩＦ指図部門ＣＤ. IF order dept. cd..<p>
	 *
	 */
	public static final String $if_inst_dpt_cd = "if_inst_dpt_cd";
	private static final MCPermColumnInfo _if_inst_dpt_cd = createColumnInfo("if_inst_dpt_cd");
	public final MCStringPermColumn if_inst_dpt_cd = createStringColumn(_if_inst_dpt_cd);
	
	/**
	 * 指図部門名. Order dept. name.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	private static final MCPermColumnInfo _inst_dpt_nm = createColumnInfo("inst_dpt_nm");
	public final MCStringPermColumn inst_dpt_nm = createStringColumn(_inst_dpt_nm);
	
	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	private static final MCPermColumnInfo _inst_usr_cd = createColumnInfo("inst_usr_cd");
	public final MCStringPermColumn inst_usr_cd = createStringColumn(_inst_usr_cd);
	
	/**
	 * ＩＦ指図担当者ＣＤ. IF order PIC cd..<p>
	 *
	 */
	public static final String $if_inst_usr_cd = "if_inst_usr_cd";
	private static final MCPermColumnInfo _if_inst_usr_cd = createColumnInfo("if_inst_usr_cd");
	public final MCStringPermColumn if_inst_usr_cd = createStringColumn(_if_inst_usr_cd);
	
	/**
	 * 指図担当者名. Order PIC name.<p>
	 *
	 */
	public static final String $inst_usr_nm = "inst_usr_nm";
	private static final MCPermColumnInfo _inst_usr_nm = createColumnInfo("inst_usr_nm");
	public final MCStringPermColumn inst_usr_nm = createStringColumn(_inst_usr_nm);
	
	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public static final String $ship_to_lg_grp_cd = "ship_to_lg_grp_cd";
	private static final MCPermColumnInfo _ship_to_lg_grp_cd = createColumnInfo("ship_to_lg_grp_cd");
	public final MCStringPermColumn ship_to_lg_grp_cd = createStringColumn(_ship_to_lg_grp_cd);
	
	/**
	 * ＩＦ出荷先物流グループＣＤ. IF receiving point distribution group cd..<p>
	 *
	 */
	public static final String $if_ship_to_lg_grp_cd = "if_ship_to_lg_grp_cd";
	private static final MCPermColumnInfo _if_ship_to_lg_grp_cd = createColumnInfo("if_ship_to_lg_grp_cd");
	public final MCStringPermColumn if_ship_to_lg_grp_cd = createStringColumn(_if_ship_to_lg_grp_cd);
	
	/**
	 * 出荷先物流グループ名. Receiving point distribution group name.<p>
	 *
	 */
	public static final String $ship_to_lg_grp_nm = "ship_to_lg_grp_nm";
	private static final MCPermColumnInfo _ship_to_lg_grp_nm = createColumnInfo("ship_to_lg_grp_nm");
	public final MCStringPermColumn ship_to_lg_grp_nm = createStringColumn(_ship_to_lg_grp_nm);
	
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
	 * ＩＦ送付先識別ＣＤ. IF receiving point identification cd..<p>
	 *
	 */
	public static final String $if_ship_to_id_cd = "if_ship_to_id_cd";
	private static final MCPermColumnInfo _if_ship_to_id_cd = createColumnInfo("if_ship_to_id_cd");
	public final MCStringPermColumn if_ship_to_id_cd = createStringColumn(_if_ship_to_id_cd);
	
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
	 * 納品先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	private static final MCPermColumnInfo _dlv_id_typ = createColumnInfo("dlv_id_typ");
	public final MCStringPermColumn dlv_id_typ = createStringColumn(_dlv_id_typ);
	
	/**
	 * 納品先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	private static final MCPermColumnInfo _dlv_id_cd = createColumnInfo("dlv_id_cd");
	public final MCStringPermColumn dlv_id_cd = createStringColumn(_dlv_id_cd);
	
	/**
	 * ＩＦ納品先識別ＣＤ. IF delivery destination identification cd..<p>
	 *
	 */
	public static final String $if_dlv_id_cd = "if_dlv_id_cd";
	private static final MCPermColumnInfo _if_dlv_id_cd = createColumnInfo("if_dlv_id_cd");
	public final MCStringPermColumn if_dlv_id_cd = createStringColumn(_if_dlv_id_cd);
	
	/**
	 * 納品先識別名. Delivery destination identification name.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	private static final MCPermColumnInfo _dlv_id_nm = createColumnInfo("dlv_id_nm");
	public final MCStringPermColumn dlv_id_nm = createStringColumn(_dlv_id_nm);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * ＩＦ得意先ＣＤ. IF customer cd..<p>
	 *
	 */
	public static final String $if_cst_cd = "if_cst_cd";
	private static final MCPermColumnInfo _if_cst_cd = createColumnInfo("if_cst_cd");
	public final MCStringPermColumn if_cst_cd = createStringColumn(_if_cst_cd);
	
	/**
	 * 得意先名. Customer name.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	private static final MCPermColumnInfo _cst_nm = createColumnInfo("cst_nm");
	public final MCStringPermColumn cst_nm = createStringColumn(_cst_nm);
	
	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	private static final MCPermColumnInfo _dest_cd1 = createColumnInfo("dest_cd1");
	public final MCStringPermColumn dest_cd1 = createStringColumn(_dest_cd1);
	
	/**
	 * ＩＦ仕向先ＣＤ１. IF distribution channel cd. 1.<p>
	 *
	 */
	public static final String $if_dest_cd1 = "if_dest_cd1";
	private static final MCPermColumnInfo _if_dest_cd1 = createColumnInfo("if_dest_cd1");
	public final MCStringPermColumn if_dest_cd1 = createStringColumn(_if_dest_cd1);
	
	/**
	 * 仕向先名１. Distribution channel name 1.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	private static final MCPermColumnInfo _dest_nm1 = createColumnInfo("dest_nm1");
	public final MCStringPermColumn dest_nm1 = createStringColumn(_dest_nm1);
	
	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	private static final MCPermColumnInfo _dest_cd2 = createColumnInfo("dest_cd2");
	public final MCStringPermColumn dest_cd2 = createStringColumn(_dest_cd2);
	
	/**
	 * ＩＦ仕向先ＣＤ２. IF distribution channel cd. 2.<p>
	 *
	 */
	public static final String $if_dest_cd2 = "if_dest_cd2";
	private static final MCPermColumnInfo _if_dest_cd2 = createColumnInfo("if_dest_cd2");
	public final MCStringPermColumn if_dest_cd2 = createStringColumn(_if_dest_cd2);
	
	/**
	 * 仕向先名２. Distribution channel name 2.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	private static final MCPermColumnInfo _dest_nm2 = createColumnInfo("dest_nm2");
	public final MCStringPermColumn dest_nm2 = createStringColumn(_dest_nm2);
	
	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	private static final MCPermColumnInfo _dest_cd3 = createColumnInfo("dest_cd3");
	public final MCStringPermColumn dest_cd3 = createStringColumn(_dest_cd3);
	
	/**
	 * ＩＦ仕向先ＣＤ３. IF distribution channel cd. 3.<p>
	 *
	 */
	public static final String $if_dest_cd3 = "if_dest_cd3";
	private static final MCPermColumnInfo _if_dest_cd3 = createColumnInfo("if_dest_cd3");
	public final MCStringPermColumn if_dest_cd3 = createStringColumn(_if_dest_cd3);
	
	/**
	 * 仕向先名３. Distribution channel name 3.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	private static final MCPermColumnInfo _dest_nm3 = createColumnInfo("dest_nm3");
	public final MCStringPermColumn dest_nm3 = createStringColumn(_dest_nm3);
	
	/**
	 * 出荷指図明細ＮＯ. Shipping order details No..<p>
	 *
	 */
	public static final String $ship_inst_d_no = "ship_inst_d_no";
	private static final MCPermColumnInfo _ship_inst_d_no = createColumnInfo("ship_inst_d_no");
	public final MCStringPermColumn ship_inst_d_no = createStringColumn(_ship_inst_d_no);
	
	/**
	 * 出荷引当状況ＮＯ. Shipping allocation status No..<p>
	 *
	 */
	public static final String $ship_alloc_sts_no = "ship_alloc_sts_no";
	private static final MCPermColumnInfo _ship_alloc_sts_no = createColumnInfo("ship_alloc_sts_no");
	public final MCStringPermColumn ship_alloc_sts_no = createStringColumn(_ship_alloc_sts_no);
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
	/**
	 * インボイス明細ＮＯ. Invoice details No..<p>
	 *
	 */
	public static final String $iv_d_no = "iv_d_no";
	private static final MCPermColumnInfo _iv_d_no = createColumnInfo("iv_d_no");
	public final MCStringPermColumn iv_d_no = createStringColumn(_iv_d_no);
	
	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	private static final MCPermColumnInfo _dlv_slip_no = createColumnInfo("dlv_slip_no");
	public final MCStringPermColumn dlv_slip_no = createStringColumn(_dlv_slip_no);
	
	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	private static final MCPermColumnInfo _dlv_slip_d_no = createColumnInfo("dlv_slip_d_no");
	public final MCStringPermColumn dlv_slip_d_no = createStringColumn(_dlv_slip_d_no);
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	private static final MCPermColumnInfo _trd_cd = createColumnInfo("trd_cd");
	public final MCStringPermColumn trd_cd = createStringColumn(_trd_cd);
	
	/**
	 * ＩＦ取引ＣＤ. IF transaction cd..<p>
	 *
	 */
	public static final String $if_trd_cd = "if_trd_cd";
	private static final MCPermColumnInfo _if_trd_cd = createColumnInfo("if_trd_cd");
	public final MCStringPermColumn if_trd_cd = createStringColumn(_if_trd_cd);
	
	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	private static final MCPermColumnInfo _trd_nm = createColumnInfo("trd_nm");
	public final MCStringPermColumn trd_nm = createStringColumn(_trd_nm);
	
	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	private static final MCPermColumnInfo _trd_ptn_typ = createColumnInfo("trd_ptn_typ");
	public final MCStringPermColumn trd_ptn_typ = createStringColumn(_trd_ptn_typ);
	
	/**
	 * 出荷場所ＣＤ. Shipping location cd..<p>
	 *
	 */
	public static final String $ship_loc_cd = "ship_loc_cd";
	private static final MCPermColumnInfo _ship_loc_cd = createColumnInfo("ship_loc_cd");
	public final MCStringPermColumn ship_loc_cd = createStringColumn(_ship_loc_cd);
	
	/**
	 * ＩＦ出荷場所ＣＤ. IF shipping location cd..<p>
	 *
	 */
	public static final String $if_ship_loc_cd = "if_ship_loc_cd";
	private static final MCPermColumnInfo _if_ship_loc_cd = createColumnInfo("if_ship_loc_cd");
	public final MCStringPermColumn if_ship_loc_cd = createStringColumn(_if_ship_loc_cd);
	
	/**
	 * 出荷場所名. Shipping location name.<p>
	 *
	 */
	public static final String $ship_loc_nm = "ship_loc_nm";
	private static final MCPermColumnInfo _ship_loc_nm = createColumnInfo("ship_loc_nm");
	public final MCStringPermColumn ship_loc_nm = createStringColumn(_ship_loc_nm);
	
	/**
	 * 出荷棚・ラインＣＤ. Shipping rack/line cd..<p>
	 *
	 */
	public static final String $ship_str_ln_cd = "ship_str_ln_cd";
	private static final MCPermColumnInfo _ship_str_ln_cd = createColumnInfo("ship_str_ln_cd");
	public final MCStringPermColumn ship_str_ln_cd = createStringColumn(_ship_str_ln_cd);
	
	/**
	 * ＩＦ出荷棚・ラインＣＤ. IF shipping rack/line cd..<p>
	 *
	 */
	public static final String $if_ship_str_ln_cd = "if_ship_str_ln_cd";
	private static final MCPermColumnInfo _if_ship_str_ln_cd = createColumnInfo("if_ship_str_ln_cd");
	public final MCStringPermColumn if_ship_str_ln_cd = createStringColumn(_if_ship_str_ln_cd);
	
	/**
	 * 出荷棚・ライン名. Shipping rack/line name.<p>
	 *
	 */
	public static final String $ship_str_ln_nm = "ship_str_ln_nm";
	private static final MCPermColumnInfo _ship_str_ln_nm = createColumnInfo("ship_str_ln_nm");
	public final MCStringPermColumn ship_str_ln_nm = createStringColumn(_ship_str_ln_nm);
	
	/**
	 * 出荷場所ＴＥＬ. Shipping location TEL.<p>
	 *
	 */
	public static final String $ship_loc_tel = "ship_loc_tel";
	private static final MCPermColumnInfo _ship_loc_tel = createColumnInfo("ship_loc_tel");
	public final MCStringPermColumn ship_loc_tel = createStringColumn(_ship_loc_tel);
	
	/**
	 * 出荷場所ＦＡＸ. Shipping location FAX.<p>
	 *
	 */
	public static final String $ship_loc_fax = "ship_loc_fax";
	private static final MCPermColumnInfo _ship_loc_fax = createColumnInfo("ship_loc_fax");
	public final MCStringPermColumn ship_loc_fax = createStringColumn(_ship_loc_fax);
	
	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	private static final MCPermColumnInfo _dlv_rqst_tm = createColumnInfo("dlv_rqst_tm");
	public final MCDatePermColumn dlv_rqst_tm = createDateColumn(_dlv_rqst_tm);
	
	/**
	 * 納品依頼日時. Delivery request date and time.<p>
	 *
	 */
	public static final String $pd_inst_dlv_tm = "pd_inst_dlv_tm";
	private static final MCPermColumnInfo _pd_inst_dlv_tm = createColumnInfo("pd_inst_dlv_tm");
	public final MCDatePermColumn pd_inst_dlv_tm = createDateColumn(_pd_inst_dlv_tm);
	
	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public static final String $ship_rqst_tm = "ship_rqst_tm";
	private static final MCPermColumnInfo _ship_rqst_tm = createColumnInfo("ship_rqst_tm");
	public final MCDatePermColumn ship_rqst_tm = createDateColumn(_ship_rqst_tm);
	
	/**
	 * 品揃ＦＬＧ. Assortment flg..<p>
	 *
	 */
	public static final String $assort_flg = "assort_flg";
	private static final MCPermColumnInfo _assort_flg = createColumnInfo("assort_flg");
	public final MCBooleanPermColumn assort_flg = createBooleanColumn(_assort_flg);
	
	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
	private static final MCPermColumnInfo _set_itm_grp_no = createColumnInfo("set_itm_grp_no");
	public final MCNumberPermColumn set_itm_grp_no = createNumberColumn(_set_itm_grp_no);
	
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
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public static final String $if_itm_cd = "if_itm_cd";
	private static final MCPermColumnInfo _if_itm_cd = createColumnInfo("if_itm_cd");
	public final MCStringPermColumn if_itm_cd = createStringColumn(_if_itm_cd);
	
	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public static final String $if_itm_sub1 = "if_itm_sub1";
	private static final MCPermColumnInfo _if_itm_sub1 = createColumnInfo("if_itm_sub1");
	public final MCStringPermColumn if_itm_sub1 = createStringColumn(_if_itm_sub1);
	
	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public static final String $if_itm_sub2 = "if_itm_sub2";
	private static final MCPermColumnInfo _if_itm_sub2 = createColumnInfo("if_itm_sub2");
	public final MCStringPermColumn if_itm_sub2 = createStringColumn(_if_itm_sub2);
	
	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public static final String $if_itm_sub3 = "if_itm_sub3";
	private static final MCPermColumnInfo _if_itm_sub3 = createColumnInfo("if_itm_sub3");
	public final MCStringPermColumn if_itm_sub3 = createStringColumn(_if_itm_sub3);
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	private static final MCPermColumnInfo _cst_itm_cd = createColumnInfo("cst_itm_cd");
	public final MCStringPermColumn cst_itm_cd = createStringColumn(_cst_itm_cd);
	
	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	private static final MCPermColumnInfo _cst_itm_nm = createColumnInfo("cst_itm_nm");
	public final MCStringPermColumn cst_itm_nm = createStringColumn(_cst_itm_nm);
	
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
	 * ＩＦ格付ＣＤ. IF grading cd..<p>
	 *
	 */
	public static final String $if_gd_cd = "if_gd_cd";
	private static final MCPermColumnInfo _if_gd_cd = createColumnInfo("if_gd_cd");
	public final MCStringPermColumn if_gd_cd = createStringColumn(_if_gd_cd);
	
	/**
	 * 格付名. Grading name.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	private static final MCPermColumnInfo _gd_nm = createColumnInfo("gd_nm");
	public final MCStringPermColumn gd_nm = createStringColumn(_gd_nm);
	
	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	private static final MCPermColumnInfo _quality_typ = createColumnInfo("quality_typ");
	public final MCStringPermColumn quality_typ = createStringColumn(_quality_typ);
	
	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	private static final MCPermColumnInfo _stk_insp_typ = createColumnInfo("stk_insp_typ");
	public final MCStringPermColumn stk_insp_typ = createStringColumn(_stk_insp_typ);
	
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
	 * ＩＦ在庫取引先ＣＤ. IF inventory BP cd..<p>
	 *
	 */
	public static final String $if_stk_bp_cd = "if_stk_bp_cd";
	private static final MCPermColumnInfo _if_stk_bp_cd = createColumnInfo("if_stk_bp_cd");
	public final MCStringPermColumn if_stk_bp_cd = createStringColumn(_if_stk_bp_cd);
	
	/**
	 * 在庫取引先名. Inventory BP name.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	private static final MCPermColumnInfo _stk_bp_nm = createColumnInfo("stk_bp_nm");
	public final MCStringPermColumn stk_bp_nm = createStringColumn(_stk_bp_nm);
	
	/**
	 * 入力単位数量. Input unit qty..<p>
	 *
	 */
	public static final String $ent_unit_qty = "ent_unit_qty";
	private static final MCPermColumnInfo _ent_unit_qty = createColumnInfo("ent_unit_qty");
	public final MCNumberPermColumn ent_unit_qty = createNumberColumn(_ent_unit_qty);
	
	/**
	 * 入力単位ＣＤ. Input unit cd..<p>
	 *
	 */
	public static final String $ent_unit_cd = "ent_unit_cd";
	private static final MCPermColumnInfo _ent_unit_cd = createColumnInfo("ent_unit_cd");
	public final MCStringPermColumn ent_unit_cd = createStringColumn(_ent_unit_cd);
	
	/**
	 * ＩＦ入力単位ＣＤ. IF input unit cd..<p>
	 *
	 */
	public static final String $if_ent_unit_cd = "if_ent_unit_cd";
	private static final MCPermColumnInfo _if_ent_unit_cd = createColumnInfo("if_ent_unit_cd");
	public final MCStringPermColumn if_ent_unit_cd = createStringColumn(_if_ent_unit_cd);
	
	/**
	 * 入力単位名. Input unit name.<p>
	 *
	 */
	public static final String $ent_unit_nm = "ent_unit_nm";
	private static final MCPermColumnInfo _ent_unit_nm = createColumnInfo("ent_unit_nm");
	public final MCStringPermColumn ent_unit_nm = createStringColumn(_ent_unit_nm);
	
	/**
	 * 入力単位入数. Quantity within input unit.<p>
	 *
	 */
	public static final String $ent_unit_bnum = "ent_unit_bnum";
	private static final MCPermColumnInfo _ent_unit_bnum = createColumnInfo("ent_unit_bnum");
	public final MCNumberPermColumn ent_unit_bnum = createNumberColumn(_ent_unit_bnum);
	
	/**
	 * 入力単位重量. Input unit weight.<p>
	 *
	 */
	public static final String $ent_unit_wt = "ent_unit_wt";
	private static final MCPermColumnInfo _ent_unit_wt = createColumnInfo("ent_unit_wt");
	public final MCNumberPermColumn ent_unit_wt = createNumberColumn(_ent_unit_wt);
	
	/**
	 * 入力単位容積. Input unit volume.<p>
	 *
	 */
	public static final String $ent_unit_dim = "ent_unit_dim";
	private static final MCPermColumnInfo _ent_unit_dim = createColumnInfo("ent_unit_dim");
	public final MCNumberPermColumn ent_unit_dim = createNumberColumn(_ent_unit_dim);
	
	/**
	 * 重量単位ＣＤ. Weight unit cd..<p>
	 *
	 */
	public static final String $wt_unit_cd = "wt_unit_cd";
	private static final MCPermColumnInfo _wt_unit_cd = createColumnInfo("wt_unit_cd");
	public final MCStringPermColumn wt_unit_cd = createStringColumn(_wt_unit_cd);
	
	/**
	 * ＩＦ重量単位ＣＤ. IF weight unit cd..<p>
	 *
	 */
	public static final String $if_wt_unit_cd = "if_wt_unit_cd";
	private static final MCPermColumnInfo _if_wt_unit_cd = createColumnInfo("if_wt_unit_cd");
	public final MCStringPermColumn if_wt_unit_cd = createStringColumn(_if_wt_unit_cd);
	
	/**
	 * 重量単位名. Weight unit name.<p>
	 *
	 */
	public static final String $wt_unit_nm = "wt_unit_nm";
	private static final MCPermColumnInfo _wt_unit_nm = createColumnInfo("wt_unit_nm");
	public final MCStringPermColumn wt_unit_nm = createStringColumn(_wt_unit_nm);
	
	/**
	 * 容積単位ＣＤ. Volume unit cd..<p>
	 *
	 */
	public static final String $dim_unit_cd = "dim_unit_cd";
	private static final MCPermColumnInfo _dim_unit_cd = createColumnInfo("dim_unit_cd");
	public final MCStringPermColumn dim_unit_cd = createStringColumn(_dim_unit_cd);
	
	/**
	 * ＩＦ容積単位ＣＤ. IF volume unit cd..<p>
	 *
	 */
	public static final String $if_dim_unit_cd = "if_dim_unit_cd";
	private static final MCPermColumnInfo _if_dim_unit_cd = createColumnInfo("if_dim_unit_cd");
	public final MCStringPermColumn if_dim_unit_cd = createStringColumn(_if_dim_unit_cd);
	
	/**
	 * 容積単位名. Volume unit name.<p>
	 *
	 */
	public static final String $dim_unit_nm = "dim_unit_nm";
	private static final MCPermColumnInfo _dim_unit_nm = createColumnInfo("dim_unit_nm");
	public final MCStringPermColumn dim_unit_nm = createStringColumn(_dim_unit_nm);
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	private static final MCPermColumnInfo _trd_unit_qty = createColumnInfo("trd_unit_qty");
	public final MCNumberPermColumn trd_unit_qty = createNumberColumn(_trd_unit_qty);
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	private static final MCPermColumnInfo _trd_unit_cd = createColumnInfo("trd_unit_cd");
	public final MCStringPermColumn trd_unit_cd = createStringColumn(_trd_unit_cd);
	
	/**
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public static final String $if_trd_unit_cd = "if_trd_unit_cd";
	private static final MCPermColumnInfo _if_trd_unit_cd = createColumnInfo("if_trd_unit_cd");
	public final MCStringPermColumn if_trd_unit_cd = createStringColumn(_if_trd_unit_cd);
	
	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	private static final MCPermColumnInfo _trd_unit_nm = createColumnInfo("trd_unit_nm");
	public final MCStringPermColumn trd_unit_nm = createStringColumn(_trd_unit_nm);
	
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
	 * ＩＦ基準単位ＣＤ. IF base unit cd..<p>
	 *
	 */
	public static final String $if_base_unit_cd = "if_base_unit_cd";
	private static final MCPermColumnInfo _if_base_unit_cd = createColumnInfo("if_base_unit_cd");
	public final MCStringPermColumn if_base_unit_cd = createStringColumn(_if_base_unit_cd);
	
	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	private static final MCPermColumnInfo _base_unit_nm = createColumnInfo("base_unit_nm");
	public final MCStringPermColumn base_unit_nm = createStringColumn(_base_unit_nm);
	
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
	 * 荷姿単位名. SKU name.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	private static final MCPermColumnInfo _pack_unit_nm = createColumnInfo("pack_unit_nm");
	public final MCStringPermColumn pack_unit_nm = createStringColumn(_pack_unit_nm);
	
	/**
	 * 引当済ＦＬＧ. Allocated flg..<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	private static final MCPermColumnInfo _alloc_flg = createColumnInfo("alloc_flg");
	public final MCBooleanPermColumn alloc_flg = createBooleanColumn(_alloc_flg);
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	private static final MCPermColumnInfo _abort_flg = createColumnInfo("abort_flg");
	public final MCBooleanPermColumn abort_flg = createBooleanColumn(_abort_flg);
	
	/**
	 * 販売他勘定ＦＬＧ. Sales other accounting flg..<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	private static final MCPermColumnInfo _sls_acxfr_flg = createColumnInfo("sls_acxfr_flg");
	public final MCBooleanPermColumn sls_acxfr_flg = createBooleanColumn(_sls_acxfr_flg);
	
	/**
	 * 預り出荷ＦＬＧ. Customer inventory shipment flg..<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	private static final MCPermColumnInfo _sls_cststk_flg = createColumnInfo("sls_cststk_flg");
	public final MCBooleanPermColumn sls_cststk_flg = createBooleanColumn(_sls_cststk_flg);
	
	/**
	 * 貸出出荷ＦＬＧ. Consignment shipment flg..<p>
	 *
	 */
	public static final String $vmi_flg = "vmi_flg";
	private static final MCPermColumnInfo _vmi_flg = createColumnInfo("vmi_flg");
	public final MCBooleanPermColumn vmi_flg = createBooleanColumn(_vmi_flg);
	
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
	 * 最古入庫日. Oldest GR date.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	private static final MCPermColumnInfo _first_gr_dt = createColumnInfo("first_gr_dt");
	public final MCDatePermColumn first_gr_dt = createDateColumn(_first_gr_dt);
	
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
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	private static final MCPermColumnInfo _rsn_cd = createColumnInfo("rsn_cd");
	public final MCStringPermColumn rsn_cd = createStringColumn(_rsn_cd);
	
	/**
	 * ＩＦ理由ＣＤ. IF reason cd..<p>
	 *
	 */
	public static final String $if_rsn_cd = "if_rsn_cd";
	private static final MCPermColumnInfo _if_rsn_cd = createColumnInfo("if_rsn_cd");
	public final MCStringPermColumn if_rsn_cd = createStringColumn(_if_rsn_cd);
	
	/**
	 * 理由名. Reason name.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
	private static final MCPermColumnInfo _rsn_nm = createColumnInfo("rsn_nm");
	public final MCStringPermColumn rsn_nm = createStringColumn(_rsn_nm);
	
	/**
	 * 指図備考. Order remarks.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";
	private static final MCPermColumnInfo _inst_rmrks = createColumnInfo("inst_rmrks");
	public final MCStringPermColumn inst_rmrks = createStringColumn(_inst_rmrks);
	
	/**
	 * 指図明細備考. Order details remarks.<p>
	 *
	 */
	public static final String $inst_d_rmrks = "inst_d_rmrks";
	private static final MCPermColumnInfo _inst_d_rmrks = createColumnInfo("inst_d_rmrks");
	public final MCStringPermColumn inst_d_rmrks = createStringColumn(_inst_d_rmrks);
	
	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	private static final MCPermColumnInfo _ship_cnt_rmrks = createColumnInfo("ship_cnt_rmrks");
	public final MCStringPermColumn ship_cnt_rmrks = createStringColumn(_ship_cnt_rmrks);
	
	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public static final String $if_co_cd = "if_co_cd";
	private static final MCPermColumnInfo _if_co_cd = createColumnInfo("if_co_cd");
	public final MCStringPermColumn if_co_cd = createStringColumn(_if_co_cd);
	
	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	private static final MCPermColumnInfo _co_nm = createColumnInfo("co_nm");
	public final MCStringPermColumn co_nm = createStringColumn(_co_nm);
	
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
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ship_inst_rev_META = createCommonMeta($ship_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta if_ship_fr_lg_grp_cd_META = createCommonMeta($if_ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta site_co_cd_META = createCommonMeta($site_co_cd, mcframe.commonMA.meta.MA_META.SITE_CO_CD);
	public static final MCMeta if_site_co_cd_META = createCommonMeta($if_site_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta site_co_nm_META = createCommonMeta($site_co_nm, mcframe.commonMA.meta.MA_META.SITE_CO_NM);
	public static final MCMeta ship_inst_tm_META = createCommonMeta($ship_inst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta if_ship_wk_cd_META = createCommonMeta($if_ship_wk_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ship_wk_nm_META = createCommonMeta($ship_wk_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta if_ship_term_cd_META = createCommonMeta($if_ship_term_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_inst_dpt_cd_META = createCommonMeta($if_inst_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_inst_usr_cd_META = createCommonMeta($if_inst_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ship_to_lg_grp_cd_META = createCommonMeta($ship_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta if_ship_to_lg_grp_cd_META = createCommonMeta($if_ship_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ship_to_lg_grp_nm_META = createCommonMeta($ship_to_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta if_ship_to_id_cd_META = createCommonMeta($if_ship_to_id_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
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
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta if_dlv_id_cd_META = createCommonMeta($if_dlv_id_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_cst_cd_META = createCommonMeta($if_cst_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_dest_cd1_META = createCommonMeta($if_dest_cd1, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_dest_cd2_META = createCommonMeta($if_dest_cd2, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_dest_cd3_META = createCommonMeta($if_dest_cd3, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta ship_alloc_sts_no_META = createCommonMeta($ship_alloc_sts_no, mcframe.commonMA.meta.MA_META.SHIP_ALLOC_STS_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta if_trd_cd_META = createCommonMeta($if_trd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_ship_loc_cd_META = createCommonMeta($if_ship_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ship_loc_nm_META = createCommonMeta($ship_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_str_ln_cd_META = createCommonMeta($ship_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta if_ship_str_ln_cd_META = createCommonMeta($if_ship_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ship_str_ln_nm_META = createCommonMeta($ship_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta ship_loc_tel_META = createCommonMeta($ship_loc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_loc_fax_META = createCommonMeta($ship_loc_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta pd_inst_dlv_tm_META = createCommonMeta($pd_inst_dlv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_rqst_tm_META = createCommonMeta($ship_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta assort_flg_META = createCommonMeta($assort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_itm_cd_META = createCommonMeta($if_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_itm_sub1_META = createCommonMeta($if_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta if_itm_sub2_META = createCommonMeta($if_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta if_itm_sub3_META = createCommonMeta($if_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
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
	public static final MCMeta if_gd_cd_META = createCommonMeta($if_gd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_stk_bp_cd_META = createCommonMeta($if_stk_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ent_unit_qty_META = createCommonMeta($ent_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ent_unit_cd_META = createCommonMeta($ent_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_ent_unit_cd_META = createCommonMeta($if_ent_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ent_unit_nm_META = createCommonMeta($ent_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta ent_unit_bnum_META = createCommonMeta($ent_unit_bnum, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ent_unit_wt_META = createCommonMeta($ent_unit_wt, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ent_unit_dim_META = createCommonMeta($ent_unit_dim, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta wt_unit_cd_META = createCommonMeta($wt_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_wt_unit_cd_META = createCommonMeta($if_wt_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta wt_unit_nm_META = createCommonMeta($wt_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dim_unit_cd_META = createCommonMeta($dim_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_dim_unit_cd_META = createCommonMeta($if_dim_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dim_unit_nm_META = createCommonMeta($dim_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_trd_unit_cd_META = createCommonMeta($if_trd_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_base_unit_cd_META = createCommonMeta($if_base_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_pack_unit_cd_META = createCommonMeta($if_pack_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vmi_flg_META = createCommonMeta($vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta ret_prov_typ_META = createCommonMeta($ret_prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta ret_prov_basis_typ_META = createCommonMeta($ret_prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta if_rsn_cd_META = createCommonMeta($if_rsn_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_RMRKS);
	public static final MCMeta inst_d_rmrks_META = createCommonMeta($inst_d_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_D_RMRKS);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta if_co_cd_META = createCommonMeta($if_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
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
					MST_SHIP_INST_SEND_IF_R own = MST_SHIP_INST_SEND_IF_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_SHIP_INST_SEND_IF_R> constMetas = new ConstMetaList<MST_SHIP_INST_SEND_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			ship_inst_no_META,
			ship_inst_rev_META,
			ship_fr_lg_grp_cd_META,
			if_ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
			site_co_cd_META,
			if_site_co_cd_META,
			site_co_nm_META,
			ship_inst_tm_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			ship_wk_cd_META,
			if_ship_wk_cd_META,
			ship_wk_nm_META,
			ship_term_cd_META,
			if_ship_term_cd_META,
			ship_term_nm_META,
			inst_dpt_cd_META,
			if_inst_dpt_cd_META,
			inst_dpt_nm_META,
			inst_usr_cd_META,
			if_inst_usr_cd_META,
			inst_usr_nm_META,
			ship_to_lg_grp_cd_META,
			if_ship_to_lg_grp_cd_META,
			ship_to_lg_grp_nm_META,
			ship_to_id_typ_META,
			ship_to_id_cd_META,
			if_ship_to_id_cd_META,
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
			dlv_id_typ_META,
			dlv_id_cd_META,
			if_dlv_id_cd_META,
			dlv_id_nm_META,
			cst_cd_META,
			if_cst_cd_META,
			cst_nm_META,
			dest_cd1_META,
			if_dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			if_dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			if_dest_cd3_META,
			dest_nm3_META,
			ship_inst_d_no_META,
			ship_alloc_sts_no_META,
			iv_no_META,
			iv_d_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			trd_cd_META,
			if_trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			ship_loc_cd_META,
			if_ship_loc_cd_META,
			ship_loc_nm_META,
			ship_str_ln_cd_META,
			if_ship_str_ln_cd_META,
			ship_str_ln_nm_META,
			ship_loc_tel_META,
			ship_loc_fax_META,
			dlv_rqst_tm_META,
			pd_inst_dlv_tm_META,
			ship_rqst_tm_META,
			assort_flg_META,
			set_itm_grp_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			if_itm_cd_META,
			if_itm_sub1_META,
			if_itm_sub2_META,
			if_itm_sub3_META,
			itm_nm_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
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
			if_gd_cd_META,
			gd_nm_META,
			quality_typ_META,
			stk_insp_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			if_stk_bp_cd_META,
			stk_bp_nm_META,
			ent_unit_qty_META,
			ent_unit_cd_META,
			if_ent_unit_cd_META,
			ent_unit_nm_META,
			ent_unit_bnum_META,
			ent_unit_wt_META,
			ent_unit_dim_META,
			wt_unit_cd_META,
			if_wt_unit_cd_META,
			wt_unit_nm_META,
			dim_unit_cd_META,
			if_dim_unit_cd_META,
			dim_unit_nm_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			if_trd_unit_cd_META,
			trd_unit_nm_META,
			base_unit_qty_META,
			base_unit_cd_META,
			if_base_unit_cd_META,
			base_unit_nm_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			if_pack_unit_cd_META,
			pack_unit_nm_META,
			alloc_flg_META,
			abort_flg_META,
			sls_acxfr_flg_META,
			sls_cststk_flg_META,
			vmi_flg_META,
			vld_dt_META,
			lmt_dt_META,
			first_gr_dt_META,
			prov_typ_META,
			prov_basis_typ_META,
			ret_prov_typ_META,
			ret_prov_basis_typ_META,
			rsn_cd_META,
			if_rsn_cd_META,
			rsn_nm_META,
			inst_rmrks_META,
			inst_d_rmrks_META,
			ship_cnt_rmrks_META,
			if_co_cd_META,
			co_nm_META,
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
			sdrv_sts_typ_META
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
	protected MST_SHIP_INST_SEND_IF_R(ConstMetaList<? extends MST_SHIP_INST_SEND_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_SHIP_INST_SEND_IF_R(ConstMetaList<? extends MST_SHIP_INST_SEND_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$data_lno,
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
			MST_SHIP_INST_SEND_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$data_no,
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
			MST_SHIP_INST_SEND_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$exe_sts_typ,
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
			MST_SHIP_INST_SEND_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$data_crud_typ,
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
			MST_SHIP_INST_SEND_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ext_sys_cd,
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
			MST_SHIP_INST_SEND_IF_R.$ship_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_inst_no,
				"ship_inst_no",
				ship_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_inst_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$ship_inst_rev,
				"ship_inst_rev",
				ship_inst_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_fr_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_fr_lg_grp_cd,
				"ship_fr_lg_grp_cd",
				ship_fr_lg_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_ship_fr_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_ship_fr_lg_grp_cd,
				"if_ship_fr_lg_grp_cd",
				if_ship_fr_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_fr_lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_fr_lg_grp_nm,
				"ship_fr_lg_grp_nm",
				ship_fr_lg_grp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$site_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$site_co_cd,
				"site_co_cd",
				site_co_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_site_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_site_co_cd,
				"if_site_co_cd",
				if_site_co_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$site_co_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$site_co_nm,
				"site_co_nm",
				site_co_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_inst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$ship_inst_tm,
				"ship_inst_tm",
				ship_inst_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$ship_schd_tm,
				"ship_schd_tm",
				ship_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dlv_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$dlv_schd_tm,
				"dlv_schd_tm",
				dlv_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_wk_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_wk_cd,
				"ship_wk_cd",
				ship_wk_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_ship_wk_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_ship_wk_cd,
				"if_ship_wk_cd",
				if_ship_wk_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_wk_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_wk_nm,
				"ship_wk_nm",
				ship_wk_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_term_cd,
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
			MST_SHIP_INST_SEND_IF_R.$if_ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_ship_term_cd,
				"if_ship_term_cd",
				if_ship_term_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_term_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_term_nm,
				"ship_term_nm",
				ship_term_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$inst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$inst_dpt_cd,
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
			MST_SHIP_INST_SEND_IF_R.$if_inst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_inst_dpt_cd,
				"if_inst_dpt_cd",
				if_inst_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$inst_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$inst_dpt_nm,
				"inst_dpt_nm",
				inst_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$inst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$inst_usr_cd,
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
			MST_SHIP_INST_SEND_IF_R.$if_inst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_inst_usr_cd,
				"if_inst_usr_cd",
				if_inst_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$inst_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$inst_usr_nm,
				"inst_usr_nm",
				inst_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_to_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_lg_grp_cd,
				"ship_to_lg_grp_cd",
				ship_to_lg_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_ship_to_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_ship_to_lg_grp_cd,
				"if_ship_to_lg_grp_cd",
				if_ship_to_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_to_lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_lg_grp_nm,
				"ship_to_lg_grp_nm",
				ship_to_lg_grp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_to_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_id_typ,
				"ship_to_id_typ",
				ship_to_id_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_to_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_id_cd,
				"ship_to_id_cd",
				ship_to_id_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_ship_to_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_ship_to_id_cd,
				"if_ship_to_id_cd",
				if_ship_to_id_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_to_id_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_id_nm,
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
			MST_SHIP_INST_SEND_IF_R.$ship_to_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_zip_cd,
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
			MST_SHIP_INST_SEND_IF_R.$ship_to_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_addr1,
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
			MST_SHIP_INST_SEND_IF_R.$ship_to_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_addr2,
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
			MST_SHIP_INST_SEND_IF_R.$ship_to_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_addr3,
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
			MST_SHIP_INST_SEND_IF_R.$ship_to_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_addr4,
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
			MST_SHIP_INST_SEND_IF_R.$ship_to_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_cntct_dpt,
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
			MST_SHIP_INST_SEND_IF_R.$ship_to_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_cntct_psn,
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
			MST_SHIP_INST_SEND_IF_R.$ship_to_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_tel,
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
			MST_SHIP_INST_SEND_IF_R.$ship_to_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_to_fax,
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
			MST_SHIP_INST_SEND_IF_R.$ship_to_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$ship_to_sundry_flg,
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
			MST_SHIP_INST_SEND_IF_R.$dlv_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dlv_id_typ,
				"dlv_id_typ",
				dlv_id_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dlv_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dlv_id_cd,
				"dlv_id_cd",
				dlv_id_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_dlv_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_dlv_id_cd,
				"if_dlv_id_cd",
				if_dlv_id_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dlv_id_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dlv_id_nm,
				"dlv_id_nm",
				dlv_id_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$cst_cd,
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
			MST_SHIP_INST_SEND_IF_R.$if_cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_cst_cd,
				"if_cst_cd",
				if_cst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$cst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$cst_nm,
				"cst_nm",
				cst_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dest_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dest_cd1,
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
			MST_SHIP_INST_SEND_IF_R.$if_dest_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_dest_cd1,
				"if_dest_cd1",
				if_dest_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dest_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dest_nm1,
				"dest_nm1",
				dest_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dest_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dest_cd2,
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
			MST_SHIP_INST_SEND_IF_R.$if_dest_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_dest_cd2,
				"if_dest_cd2",
				if_dest_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dest_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dest_nm2,
				"dest_nm2",
				dest_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dest_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dest_cd3,
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
			MST_SHIP_INST_SEND_IF_R.$if_dest_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_dest_cd3,
				"if_dest_cd3",
				if_dest_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dest_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dest_nm3,
				"dest_nm3",
				dest_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_inst_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_inst_d_no,
				"ship_inst_d_no",
				ship_inst_d_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_alloc_sts_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_alloc_sts_no,
				"ship_alloc_sts_no",
				ship_alloc_sts_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$iv_no,
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
			MST_SHIP_INST_SEND_IF_R.$iv_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$iv_d_no,
				"iv_d_no",
				iv_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dlv_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dlv_slip_no,
				"dlv_slip_no",
				dlv_slip_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dlv_slip_d_no,
				"dlv_slip_d_no",
				dlv_slip_d_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$trd_cd,
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
			MST_SHIP_INST_SEND_IF_R.$if_trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_trd_cd,
				"if_trd_cd",
				if_trd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$trd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$trd_nm,
				"trd_nm",
				trd_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$trd_ptn_typ,
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
			MST_SHIP_INST_SEND_IF_R.$ship_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_loc_cd,
				"ship_loc_cd",
				ship_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_ship_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_ship_loc_cd,
				"if_ship_loc_cd",
				if_ship_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_loc_nm,
				"ship_loc_nm",
				ship_loc_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_str_ln_cd,
				"ship_str_ln_cd",
				ship_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_ship_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_ship_str_ln_cd,
				"if_ship_str_ln_cd",
				if_ship_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_str_ln_nm,
				"ship_str_ln_nm",
				ship_str_ln_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_loc_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_loc_tel,
				"ship_loc_tel",
				ship_loc_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_loc_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_loc_fax,
				"ship_loc_fax",
				ship_loc_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$dlv_rqst_tm,
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
			MST_SHIP_INST_SEND_IF_R.$pd_inst_dlv_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$pd_inst_dlv_tm,
				"pd_inst_dlv_tm",
				pd_inst_dlv_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$ship_rqst_tm,
				"ship_rqst_tm",
				ship_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$assort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$assort_flg,
				"assort_flg",
				assort_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$set_itm_grp_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$set_itm_grp_no,
				"set_itm_grp_no",
				set_itm_grp_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$itm_cd,
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
			MST_SHIP_INST_SEND_IF_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_itm_cd,
				"if_itm_cd",
				if_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_itm_sub1,
				"if_itm_sub1",
				if_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_itm_sub2,
				"if_itm_sub2",
				if_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_itm_sub3,
				"if_itm_sub3",
				if_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$itm_nm,
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
			MST_SHIP_INST_SEND_IF_R.$cst_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$cst_itm_cd,
				"cst_itm_cd",
				cst_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$cst_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$cst_itm_nm,
				"cst_itm_nm",
				cst_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$lot_no,
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
			MST_SHIP_INST_SEND_IF_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sublot_no,
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
			MST_SHIP_INST_SEND_IF_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ver_no,
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
			MST_SHIP_INST_SEND_IF_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sno1,
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
			MST_SHIP_INST_SEND_IF_R.$sno1_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$sno1_null_flg,
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
			MST_SHIP_INST_SEND_IF_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sno2,
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
			MST_SHIP_INST_SEND_IF_R.$sno2_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$sno2_null_flg,
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
			MST_SHIP_INST_SEND_IF_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sno3,
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
			MST_SHIP_INST_SEND_IF_R.$sno3_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$sno3_null_flg,
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
			MST_SHIP_INST_SEND_IF_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sno4,
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
			MST_SHIP_INST_SEND_IF_R.$sno4_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$sno4_null_flg,
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
			MST_SHIP_INST_SEND_IF_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$gd_cd,
				"gd_cd",
				gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_gd_cd,
				"if_gd_cd",
				if_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$gd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$gd_nm,
				"gd_nm",
				gd_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$quality_typ,
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
			MST_SHIP_INST_SEND_IF_R.$stk_insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$stk_insp_typ,
				"stk_insp_typ",
				stk_insp_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$stk_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$stk_id_typ,
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
			MST_SHIP_INST_SEND_IF_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$stk_bp_cd,
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
			MST_SHIP_INST_SEND_IF_R.$if_stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_stk_bp_cd,
				"if_stk_bp_cd",
				if_stk_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$stk_bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$stk_bp_nm,
				"stk_bp_nm",
				stk_bp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ent_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$ent_unit_qty,
				"ent_unit_qty",
				ent_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ent_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ent_unit_cd,
				"ent_unit_cd",
				ent_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_ent_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_ent_unit_cd,
				"if_ent_unit_cd",
				if_ent_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ent_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ent_unit_nm,
				"ent_unit_nm",
				ent_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ent_unit_bnum,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$ent_unit_bnum,
				"ent_unit_bnum",
				ent_unit_bnum,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ent_unit_wt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$ent_unit_wt,
				"ent_unit_wt",
				ent_unit_wt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ent_unit_dim,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$ent_unit_dim,
				"ent_unit_dim",
				ent_unit_dim,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$wt_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$wt_unit_cd,
				"wt_unit_cd",
				wt_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_wt_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_wt_unit_cd,
				"if_wt_unit_cd",
				if_wt_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$wt_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$wt_unit_nm,
				"wt_unit_nm",
				wt_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dim_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dim_unit_cd,
				"dim_unit_cd",
				dim_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_dim_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_dim_unit_cd,
				"if_dim_unit_cd",
				if_dim_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$dim_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$dim_unit_nm,
				"dim_unit_nm",
				dim_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$trd_unit_qty,
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
			MST_SHIP_INST_SEND_IF_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$trd_unit_cd,
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
			MST_SHIP_INST_SEND_IF_R.$if_trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_trd_unit_cd,
				"if_trd_unit_cd",
				if_trd_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$trd_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$trd_unit_nm,
				"trd_unit_nm",
				trd_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$base_unit_qty,
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
			MST_SHIP_INST_SEND_IF_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$base_unit_cd,
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
			MST_SHIP_INST_SEND_IF_R.$if_base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_base_unit_cd,
				"if_base_unit_cd",
				if_base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$base_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$base_unit_nm,
				"base_unit_nm",
				base_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$pack_unit_qty,
				"pack_unit_qty",
				pack_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$pack_unit_cd,
				"pack_unit_cd",
				pack_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$if_pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_pack_unit_cd,
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
			MST_SHIP_INST_SEND_IF_R.$pack_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$pack_unit_nm,
				"pack_unit_nm",
				pack_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$alloc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$alloc_flg,
				"alloc_flg",
				alloc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$abort_flg,
				"abort_flg",
				abort_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$sls_acxfr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$sls_acxfr_flg,
				"sls_acxfr_flg",
				sls_acxfr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$sls_cststk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$sls_cststk_flg,
				"sls_cststk_flg",
				sls_cststk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$vmi_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_INST_SEND_IF_R.$vmi_flg,
				"vmi_flg",
				vmi_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$vld_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$vld_dt,
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
			MST_SHIP_INST_SEND_IF_R.$lmt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$lmt_dt,
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
			MST_SHIP_INST_SEND_IF_R.$first_gr_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$first_gr_dt,
				"first_gr_dt",
				first_gr_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$prov_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$prov_typ,
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
			MST_SHIP_INST_SEND_IF_R.$prov_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$prov_basis_typ,
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
			MST_SHIP_INST_SEND_IF_R.$ret_prov_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ret_prov_typ,
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
			MST_SHIP_INST_SEND_IF_R.$ret_prov_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ret_prov_basis_typ,
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
			MST_SHIP_INST_SEND_IF_R.$rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$rsn_cd,
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
			MST_SHIP_INST_SEND_IF_R.$if_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_rsn_cd,
				"if_rsn_cd",
				if_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$rsn_nm,
				"rsn_nm",
				rsn_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$inst_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$inst_rmrks,
				"inst_rmrks",
				inst_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$inst_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$inst_d_rmrks,
				"inst_d_rmrks",
				inst_d_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$ship_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ship_cnt_rmrks,
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
			MST_SHIP_INST_SEND_IF_R.$if_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$if_co_cd,
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
			MST_SHIP_INST_SEND_IF_R.$co_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$co_nm,
				"co_nm",
				co_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_INST_SEND_IF_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char1,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char2,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char3,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char4,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char5,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char6,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char7,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char8,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char9,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char10,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char11,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char12,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char13,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char14,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char15,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char16,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char17,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char18,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char19,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char20,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char21,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char22,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char23,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char24,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char25,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char26,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char27,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char28,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char29,
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
			MST_SHIP_INST_SEND_IF_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sub_char30,
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
			MST_SHIP_INST_SEND_IF_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$sub_num1,
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
			MST_SHIP_INST_SEND_IF_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$sub_num2,
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
			MST_SHIP_INST_SEND_IF_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$sub_num3,
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
			MST_SHIP_INST_SEND_IF_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$sub_num4,
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
			MST_SHIP_INST_SEND_IF_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$sub_num5,
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
			MST_SHIP_INST_SEND_IF_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$sub_dt1,
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
			MST_SHIP_INST_SEND_IF_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$sub_dt2,
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
			MST_SHIP_INST_SEND_IF_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$sub_dt3,
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
			MST_SHIP_INST_SEND_IF_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$sub_dt4,
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
			MST_SHIP_INST_SEND_IF_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_INST_SEND_IF_R.$sub_dt5,
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
			MST_SHIP_INST_SEND_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$batch_log_no,
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
			MST_SHIP_INST_SEND_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$log_sub_key1,
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
			MST_SHIP_INST_SEND_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$log_sub_key2,
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
			MST_SHIP_INST_SEND_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ins_usr_id,
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
			MST_SHIP_INST_SEND_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ins_usr_nm,
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
			MST_SHIP_INST_SEND_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SHIP_INST_SEND_IF_R.$ins_ts,
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
			MST_SHIP_INST_SEND_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$ins_func_id,
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
			MST_SHIP_INST_SEND_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_INST_SEND_IF_R.$upd_cntr,
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
			MST_SHIP_INST_SEND_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$upd_usr_id,
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
			MST_SHIP_INST_SEND_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$upd_usr_nm,
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
			MST_SHIP_INST_SEND_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SHIP_INST_SEND_IF_R.$upd_ts,
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
			MST_SHIP_INST_SEND_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$upd_func_id,
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
			MST_SHIP_INST_SEND_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$upd_srv_req_no,
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
			MST_SHIP_INST_SEND_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_INST_SEND_IF_R.$sdrv_sts_typ,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_SHIP_INST_SEND_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_SHIP_INST_SEND_IF_R create(String alias) {
		MST_SHIP_INST_SEND_IF_R row = new MST_SHIP_INST_SEND_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_SHIP_INST_SEND_IF_R createByName(T proto) {
		MST_SHIP_INST_SEND_IF_R row = MST_SHIP_INST_SEND_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SHIP_INST_SEND_IF_R clone() {
		return (MST_SHIP_INST_SEND_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SHIP_INST_SEND_IF_R createInstance() {
		return (MST_SHIP_INST_SEND_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SHIP_INST_SEND_IF_R getValues(String... names) {
		return (MST_SHIP_INST_SEND_IF_R) super.getValues(names);
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
	 public MSW_SHIP_INST_SEND_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_SHIP_INST_SEND_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_SHIP_INST_SEND_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_SHIP_INST_SEND_IF_KEY_R.TABLE_NAME);
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
	 * 出荷指図ＮＯ. Shipping order No..<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 5, $ship_inst_no);
	}

	/**
	 * 出荷指図ＮＯ. Shipping order No..<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 5, $ship_inst_no, value);
	}

	/**
	 * 出荷指図改訂番号. Shipping order rev. number.<p>
	 *
	 */
	public MCNumber ship_inst_rev() {
		return getConstNumber(offset + 6, $ship_inst_rev);
	}

	/**
	 * 出荷指図改訂番号. Shipping order rev. number.<p>
	 *
	 */
	public void ship_inst_rev(MCNumber value) {
		setConstNumber(offset + 6, $ship_inst_rev, value);
	}
	
	/**
	 * 出荷指図改訂番号. Shipping order rev. number.<p>
	 *
	 */
	public void ship_inst_rev(int value) {
		setConstNumber(offset + 6, $ship_inst_rev, value);
	}
	
	/**
	 * 出荷指図改訂番号. Shipping order rev. number.<p>
	 *
	 */
	public void ship_inst_rev(long value) {
		setConstNumber(offset + 6, $ship_inst_rev, value);
	}
	
	/**
	 * 出荷指図改訂番号. Shipping order rev. number.<p>
	 *
	 */
	public void ship_inst_rev(float value) {
		setConstNumber(offset + 6, $ship_inst_rev, value);
	}
	
	/**
	 * 出荷指図改訂番号. Shipping order rev. number.<p>
	 *
	 */
	public void ship_inst_rev(double value) {
		setConstNumber(offset + 6, $ship_inst_rev, value);
	}
	
	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 7, $ship_fr_lg_grp_cd);
	}

	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 7, $ship_fr_lg_grp_cd, value);
	}

	/**
	 * ＩＦ出荷元物流グループＣＤ. IF shipping point distribution group cd..<p>
	 *
	 */
	public String if_ship_fr_lg_grp_cd() {
		return getConstString(offset + 8, $if_ship_fr_lg_grp_cd);
	}

	/**
	 * ＩＦ出荷元物流グループＣＤ. IF shipping point distribution group cd..<p>
	 *
	 */
	public void if_ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 8, $if_ship_fr_lg_grp_cd, value);
	}

	/**
	 * 出荷元物流グループ名. Shipping point distribution group name.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 9, $ship_fr_lg_grp_nm);
	}

	/**
	 * 出荷元物流グループ名. Shipping point distribution group name.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 9, $ship_fr_lg_grp_nm, value);
	}

	/**
	 * 倉庫事業者ＣＤ. Warehousing business cd..<p>
	 *
	 */
	public String site_co_cd() {
		return getConstString(offset + 10, $site_co_cd);
	}

	/**
	 * 倉庫事業者ＣＤ. Warehousing business cd..<p>
	 *
	 */
	public void site_co_cd(String value) {
		setConstString(offset + 10, $site_co_cd, value);
	}

	/**
	 * ＩＦ倉庫事業者ＣＤ. IF warehousing business cd..<p>
	 *
	 */
	public String if_site_co_cd() {
		return getConstString(offset + 11, $if_site_co_cd);
	}

	/**
	 * ＩＦ倉庫事業者ＣＤ. IF warehousing business cd..<p>
	 *
	 */
	public void if_site_co_cd(String value) {
		setConstString(offset + 11, $if_site_co_cd, value);
	}

	/**
	 * 倉庫事業者名. Warehousing business name.<p>
	 *
	 */
	public String site_co_nm() {
		return getConstString(offset + 12, $site_co_nm);
	}

	/**
	 * 倉庫事業者名. Warehousing business name.<p>
	 *
	 */
	public void site_co_nm(String value) {
		setConstString(offset + 12, $site_co_nm, value);
	}

	/**
	 * 出荷指図日時. Shipping order date and time.<p>
	 *
	 */
	public MCDate ship_inst_tm() {
		return getConstDate(offset + 13, $ship_inst_tm);
	}

	/**
	 * 出荷指図日時. Shipping order date and time.<p>
	 *
	 */
	public void ship_inst_tm(MCDate value) {
		setConstDate(offset + 13, $ship_inst_tm, value);
	}

	/**
	 * 出荷予定日時. Scheduled shipping date and time.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 14, $ship_schd_tm);
	}

	/**
	 * 出荷予定日時. Scheduled shipping date and time.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 14, $ship_schd_tm, value);
	}

	/**
	 * 納品予定日時. Scheduled delivery date and time.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 15, $dlv_schd_tm);
	}

	/**
	 * 納品予定日時. Scheduled delivery date and time.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 15, $dlv_schd_tm, value);
	}

	/**
	 * 出荷作業ＣＤ. Shipping operation cd..<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 16, $ship_wk_cd);
	}

	/**
	 * 出荷作業ＣＤ. Shipping operation cd..<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 16, $ship_wk_cd, value);
	}

	/**
	 * ＩＦ出荷作業ＣＤ. IF shipping operation cd..<p>
	 *
	 */
	public String if_ship_wk_cd() {
		return getConstString(offset + 17, $if_ship_wk_cd);
	}

	/**
	 * ＩＦ出荷作業ＣＤ. IF shipping operation cd..<p>
	 *
	 */
	public void if_ship_wk_cd(String value) {
		setConstString(offset + 17, $if_ship_wk_cd, value);
	}

	/**
	 * 出荷作業名. Shipping operation name.<p>
	 *
	 */
	public String ship_wk_nm() {
		return getConstString(offset + 18, $ship_wk_nm);
	}

	/**
	 * 出荷作業名. Shipping operation name.<p>
	 *
	 */
	public void ship_wk_nm(String value) {
		setConstString(offset + 18, $ship_wk_nm, value);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 19, $ship_term_cd);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 19, $ship_term_cd, value);
	}

	/**
	 * ＩＦ出荷条件ＣＤ. IF shipping conditions cd..<p>
	 *
	 */
	public String if_ship_term_cd() {
		return getConstString(offset + 20, $if_ship_term_cd);
	}

	/**
	 * ＩＦ出荷条件ＣＤ. IF shipping conditions cd..<p>
	 *
	 */
	public void if_ship_term_cd(String value) {
		setConstString(offset + 20, $if_ship_term_cd, value);
	}

	/**
	 * 出荷条件名. Shipping conditions name.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 21, $ship_term_nm);
	}

	/**
	 * 出荷条件名. Shipping conditions name.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 21, $ship_term_nm, value);
	}

	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 22, $inst_dpt_cd);
	}

	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 22, $inst_dpt_cd, value);
	}

	/**
	 * ＩＦ指図部門ＣＤ. IF order dept. cd..<p>
	 *
	 */
	public String if_inst_dpt_cd() {
		return getConstString(offset + 23, $if_inst_dpt_cd);
	}

	/**
	 * ＩＦ指図部門ＣＤ. IF order dept. cd..<p>
	 *
	 */
	public void if_inst_dpt_cd(String value) {
		setConstString(offset + 23, $if_inst_dpt_cd, value);
	}

	/**
	 * 指図部門名. Order dept. name.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 24, $inst_dpt_nm);
	}

	/**
	 * 指図部門名. Order dept. name.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 24, $inst_dpt_nm, value);
	}

	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 25, $inst_usr_cd);
	}

	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 25, $inst_usr_cd, value);
	}

	/**
	 * ＩＦ指図担当者ＣＤ. IF order PIC cd..<p>
	 *
	 */
	public String if_inst_usr_cd() {
		return getConstString(offset + 26, $if_inst_usr_cd);
	}

	/**
	 * ＩＦ指図担当者ＣＤ. IF order PIC cd..<p>
	 *
	 */
	public void if_inst_usr_cd(String value) {
		setConstString(offset + 26, $if_inst_usr_cd, value);
	}

	/**
	 * 指図担当者名. Order PIC name.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 27, $inst_usr_nm);
	}

	/**
	 * 指図担当者名. Order PIC name.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 27, $inst_usr_nm, value);
	}

	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return getConstString(offset + 28, $ship_to_lg_grp_cd);
	}

	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		setConstString(offset + 28, $ship_to_lg_grp_cd, value);
	}

	/**
	 * ＩＦ出荷先物流グループＣＤ. IF receiving point distribution group cd..<p>
	 *
	 */
	public String if_ship_to_lg_grp_cd() {
		return getConstString(offset + 29, $if_ship_to_lg_grp_cd);
	}

	/**
	 * ＩＦ出荷先物流グループＣＤ. IF receiving point distribution group cd..<p>
	 *
	 */
	public void if_ship_to_lg_grp_cd(String value) {
		setConstString(offset + 29, $if_ship_to_lg_grp_cd, value);
	}

	/**
	 * 出荷先物流グループ名. Receiving point distribution group name.<p>
	 *
	 */
	public String ship_to_lg_grp_nm() {
		return getConstString(offset + 30, $ship_to_lg_grp_nm);
	}

	/**
	 * 出荷先物流グループ名. Receiving point distribution group name.<p>
	 *
	 */
	public void ship_to_lg_grp_nm(String value) {
		setConstString(offset + 30, $ship_to_lg_grp_nm, value);
	}

	/**
	 * 送付先識別区分. Receiving point identification type.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 31, $ship_to_id_typ);
	}

	/**
	 * 送付先識別区分. Receiving point identification type.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 31, $ship_to_id_typ, value);
	}

	/**
	 * 送付先識別ＣＤ. Receiving point identification cd..<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 32, $ship_to_id_cd);
	}

	/**
	 * 送付先識別ＣＤ. Receiving point identification cd..<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 32, $ship_to_id_cd, value);
	}

	/**
	 * ＩＦ送付先識別ＣＤ. IF receiving point identification cd..<p>
	 *
	 */
	public String if_ship_to_id_cd() {
		return getConstString(offset + 33, $if_ship_to_id_cd);
	}

	/**
	 * ＩＦ送付先識別ＣＤ. IF receiving point identification cd..<p>
	 *
	 */
	public void if_ship_to_id_cd(String value) {
		setConstString(offset + 33, $if_ship_to_id_cd, value);
	}

	/**
	 * 送付先識別名. Receiving point Identification name.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 34, $ship_to_id_nm);
	}

	/**
	 * 送付先識別名. Receiving point Identification name.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 34, $ship_to_id_nm, value);
	}

	/**
	 * 送付先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return getConstString(offset + 35, $ship_to_zip_cd);
	}

	/**
	 * 送付先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		setConstString(offset + 35, $ship_to_zip_cd, value);
	}

	/**
	 * 送付先住所１. Receiving point address 1.<p>
	 *
	 */
	public String ship_to_addr1() {
		return getConstString(offset + 36, $ship_to_addr1);
	}

	/**
	 * 送付先住所１. Receiving point address 1.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		setConstString(offset + 36, $ship_to_addr1, value);
	}

	/**
	 * 送付先住所２. Receiving point address 2.<p>
	 *
	 */
	public String ship_to_addr2() {
		return getConstString(offset + 37, $ship_to_addr2);
	}

	/**
	 * 送付先住所２. Receiving point address 2.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		setConstString(offset + 37, $ship_to_addr2, value);
	}

	/**
	 * 送付先住所３. Receiving point address 3.<p>
	 *
	 */
	public String ship_to_addr3() {
		return getConstString(offset + 38, $ship_to_addr3);
	}

	/**
	 * 送付先住所３. Receiving point address 3.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		setConstString(offset + 38, $ship_to_addr3, value);
	}

	/**
	 * 送付先住所４. Receiving point address 4.<p>
	 *
	 */
	public String ship_to_addr4() {
		return getConstString(offset + 39, $ship_to_addr4);
	}

	/**
	 * 送付先住所４. Receiving point address 4.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		setConstString(offset + 39, $ship_to_addr4, value);
	}

	/**
	 * 送付先部署. Receiving point dept..<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return getConstString(offset + 40, $ship_to_cntct_dpt);
	}

	/**
	 * 送付先部署. Receiving point dept..<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		setConstString(offset + 40, $ship_to_cntct_dpt, value);
	}

	/**
	 * 送付先担当者. Receiving point PIC.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return getConstString(offset + 41, $ship_to_cntct_psn);
	}

	/**
	 * 送付先担当者. Receiving point PIC.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		setConstString(offset + 41, $ship_to_cntct_psn, value);
	}

	/**
	 * 送付先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public String ship_to_tel() {
		return getConstString(offset + 42, $ship_to_tel);
	}

	/**
	 * 送付先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		setConstString(offset + 42, $ship_to_tel, value);
	}

	/**
	 * 送付先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public String ship_to_fax() {
		return getConstString(offset + 43, $ship_to_fax);
	}

	/**
	 * 送付先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		setConstString(offset + 43, $ship_to_fax, value);
	}

	/**
	 * 送付先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 44, $ship_to_sundry_flg);
	}

	/**
	 * 送付先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 44, $ship_to_sundry_flg, value);
	}

	/**
	 * 納品先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 45, $dlv_id_typ);
	}

	/**
	 * 納品先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 45, $dlv_id_typ, value);
	}

	/**
	 * 納品先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 46, $dlv_id_cd);
	}

	/**
	 * 納品先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 46, $dlv_id_cd, value);
	}

	/**
	 * ＩＦ納品先識別ＣＤ. IF delivery destination identification cd..<p>
	 *
	 */
	public String if_dlv_id_cd() {
		return getConstString(offset + 47, $if_dlv_id_cd);
	}

	/**
	 * ＩＦ納品先識別ＣＤ. IF delivery destination identification cd..<p>
	 *
	 */
	public void if_dlv_id_cd(String value) {
		setConstString(offset + 47, $if_dlv_id_cd, value);
	}

	/**
	 * 納品先識別名. Delivery destination identification name.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 48, $dlv_id_nm);
	}

	/**
	 * 納品先識別名. Delivery destination identification name.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 48, $dlv_id_nm, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 49, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 49, $cst_cd, value);
	}

	/**
	 * ＩＦ得意先ＣＤ. IF customer cd..<p>
	 *
	 */
	public String if_cst_cd() {
		return getConstString(offset + 50, $if_cst_cd);
	}

	/**
	 * ＩＦ得意先ＣＤ. IF customer cd..<p>
	 *
	 */
	public void if_cst_cd(String value) {
		setConstString(offset + 50, $if_cst_cd, value);
	}

	/**
	 * 得意先名. Customer name.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 51, $cst_nm);
	}

	/**
	 * 得意先名. Customer name.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 51, $cst_nm, value);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 52, $dest_cd1);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 52, $dest_cd1, value);
	}

	/**
	 * ＩＦ仕向先ＣＤ１. IF distribution channel cd. 1.<p>
	 *
	 */
	public String if_dest_cd1() {
		return getConstString(offset + 53, $if_dest_cd1);
	}

	/**
	 * ＩＦ仕向先ＣＤ１. IF distribution channel cd. 1.<p>
	 *
	 */
	public void if_dest_cd1(String value) {
		setConstString(offset + 53, $if_dest_cd1, value);
	}

	/**
	 * 仕向先名１. Distribution channel name 1.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 54, $dest_nm1);
	}

	/**
	 * 仕向先名１. Distribution channel name 1.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 54, $dest_nm1, value);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 55, $dest_cd2);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 55, $dest_cd2, value);
	}

	/**
	 * ＩＦ仕向先ＣＤ２. IF distribution channel cd. 2.<p>
	 *
	 */
	public String if_dest_cd2() {
		return getConstString(offset + 56, $if_dest_cd2);
	}

	/**
	 * ＩＦ仕向先ＣＤ２. IF distribution channel cd. 2.<p>
	 *
	 */
	public void if_dest_cd2(String value) {
		setConstString(offset + 56, $if_dest_cd2, value);
	}

	/**
	 * 仕向先名２. Distribution channel name 2.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 57, $dest_nm2);
	}

	/**
	 * 仕向先名２. Distribution channel name 2.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 57, $dest_nm2, value);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 58, $dest_cd3);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 58, $dest_cd3, value);
	}

	/**
	 * ＩＦ仕向先ＣＤ３. IF distribution channel cd. 3.<p>
	 *
	 */
	public String if_dest_cd3() {
		return getConstString(offset + 59, $if_dest_cd3);
	}

	/**
	 * ＩＦ仕向先ＣＤ３. IF distribution channel cd. 3.<p>
	 *
	 */
	public void if_dest_cd3(String value) {
		setConstString(offset + 59, $if_dest_cd3, value);
	}

	/**
	 * 仕向先名３. Distribution channel name 3.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 60, $dest_nm3);
	}

	/**
	 * 仕向先名３. Distribution channel name 3.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 60, $dest_nm3, value);
	}

	/**
	 * 出荷指図明細ＮＯ. Shipping order details No..<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 61, $ship_inst_d_no);
	}

	/**
	 * 出荷指図明細ＮＯ. Shipping order details No..<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 61, $ship_inst_d_no, value);
	}

	/**
	 * 出荷引当状況ＮＯ. Shipping allocation status No..<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return getConstString(offset + 62, $ship_alloc_sts_no);
	}

	/**
	 * 出荷引当状況ＮＯ. Shipping allocation status No..<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		setConstString(offset + 62, $ship_alloc_sts_no, value);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 63, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 63, $iv_no, value);
	}

	/**
	 * インボイス明細ＮＯ. Invoice details No..<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 64, $iv_d_no);
	}

	/**
	 * インボイス明細ＮＯ. Invoice details No..<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 64, $iv_d_no, value);
	}

	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 65, $dlv_slip_no);
	}

	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 65, $dlv_slip_no, value);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 66, $dlv_slip_d_no);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 66, $dlv_slip_d_no, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 67, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 67, $trd_cd, value);
	}

	/**
	 * ＩＦ取引ＣＤ. IF transaction cd..<p>
	 *
	 */
	public String if_trd_cd() {
		return getConstString(offset + 68, $if_trd_cd);
	}

	/**
	 * ＩＦ取引ＣＤ. IF transaction cd..<p>
	 *
	 */
	public void if_trd_cd(String value) {
		setConstString(offset + 68, $if_trd_cd, value);
	}

	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 69, $trd_nm);
	}

	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 69, $trd_nm, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 70, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 70, $trd_ptn_typ, value);
	}

	/**
	 * 出荷場所ＣＤ. Shipping location cd..<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 71, $ship_loc_cd);
	}

	/**
	 * 出荷場所ＣＤ. Shipping location cd..<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 71, $ship_loc_cd, value);
	}

	/**
	 * ＩＦ出荷場所ＣＤ. IF shipping location cd..<p>
	 *
	 */
	public String if_ship_loc_cd() {
		return getConstString(offset + 72, $if_ship_loc_cd);
	}

	/**
	 * ＩＦ出荷場所ＣＤ. IF shipping location cd..<p>
	 *
	 */
	public void if_ship_loc_cd(String value) {
		setConstString(offset + 72, $if_ship_loc_cd, value);
	}

	/**
	 * 出荷場所名. Shipping location name.<p>
	 *
	 */
	public String ship_loc_nm() {
		return getConstString(offset + 73, $ship_loc_nm);
	}

	/**
	 * 出荷場所名. Shipping location name.<p>
	 *
	 */
	public void ship_loc_nm(String value) {
		setConstString(offset + 73, $ship_loc_nm, value);
	}

	/**
	 * 出荷棚・ラインＣＤ. Shipping rack/line cd..<p>
	 *
	 */
	public String ship_str_ln_cd() {
		return getConstString(offset + 74, $ship_str_ln_cd);
	}

	/**
	 * 出荷棚・ラインＣＤ. Shipping rack/line cd..<p>
	 *
	 */
	public void ship_str_ln_cd(String value) {
		setConstString(offset + 74, $ship_str_ln_cd, value);
	}

	/**
	 * ＩＦ出荷棚・ラインＣＤ. IF shipping rack/line cd..<p>
	 *
	 */
	public String if_ship_str_ln_cd() {
		return getConstString(offset + 75, $if_ship_str_ln_cd);
	}

	/**
	 * ＩＦ出荷棚・ラインＣＤ. IF shipping rack/line cd..<p>
	 *
	 */
	public void if_ship_str_ln_cd(String value) {
		setConstString(offset + 75, $if_ship_str_ln_cd, value);
	}

	/**
	 * 出荷棚・ライン名. Shipping rack/line name.<p>
	 *
	 */
	public String ship_str_ln_nm() {
		return getConstString(offset + 76, $ship_str_ln_nm);
	}

	/**
	 * 出荷棚・ライン名. Shipping rack/line name.<p>
	 *
	 */
	public void ship_str_ln_nm(String value) {
		setConstString(offset + 76, $ship_str_ln_nm, value);
	}

	/**
	 * 出荷場所ＴＥＬ. Shipping location TEL.<p>
	 *
	 */
	public String ship_loc_tel() {
		return getConstString(offset + 77, $ship_loc_tel);
	}

	/**
	 * 出荷場所ＴＥＬ. Shipping location TEL.<p>
	 *
	 */
	public void ship_loc_tel(String value) {
		setConstString(offset + 77, $ship_loc_tel, value);
	}

	/**
	 * 出荷場所ＦＡＸ. Shipping location FAX.<p>
	 *
	 */
	public String ship_loc_fax() {
		return getConstString(offset + 78, $ship_loc_fax);
	}

	/**
	 * 出荷場所ＦＡＸ. Shipping location FAX.<p>
	 *
	 */
	public void ship_loc_fax(String value) {
		setConstString(offset + 78, $ship_loc_fax, value);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 79, $dlv_rqst_tm);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 79, $dlv_rqst_tm, value);
	}

	/**
	 * 納品依頼日時. Delivery request date and time.<p>
	 *
	 */
	public MCDate pd_inst_dlv_tm() {
		return getConstDate(offset + 80, $pd_inst_dlv_tm);
	}

	/**
	 * 納品依頼日時. Delivery request date and time.<p>
	 *
	 */
	public void pd_inst_dlv_tm(MCDate value) {
		setConstDate(offset + 80, $pd_inst_dlv_tm, value);
	}

	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public MCDate ship_rqst_tm() {
		return getConstDate(offset + 81, $ship_rqst_tm);
	}

	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public void ship_rqst_tm(MCDate value) {
		setConstDate(offset + 81, $ship_rqst_tm, value);
	}

	/**
	 * 品揃ＦＬＧ. Assortment flg..<p>
	 *
	 */
	public boolean assort_flg() {
		return getConstBoolean(offset + 82, $assort_flg);
	}

	/**
	 * 品揃ＦＬＧ. Assortment flg..<p>
	 *
	 */
	public void assort_flg(boolean value) {
		setConstBoolean(offset + 82, $assort_flg, value);
	}

	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 83, $set_itm_grp_no);
	}

	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 83, $set_itm_grp_no, value);
	}
	
	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 83, $set_itm_grp_no, value);
	}
	
	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 83, $set_itm_grp_no, value);
	}
	
	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 83, $set_itm_grp_no, value);
	}
	
	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 83, $set_itm_grp_no, value);
	}
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 84, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 84, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 85, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 85, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 86, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 86, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 87, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 87, $itm_sub3, value);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public String if_itm_cd() {
		return getConstString(offset + 88, $if_itm_cd);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public void if_itm_cd(String value) {
		setConstString(offset + 88, $if_itm_cd, value);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public String if_itm_sub1() {
		return getConstString(offset + 89, $if_itm_sub1);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public void if_itm_sub1(String value) {
		setConstString(offset + 89, $if_itm_sub1, value);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public String if_itm_sub2() {
		return getConstString(offset + 90, $if_itm_sub2);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public void if_itm_sub2(String value) {
		setConstString(offset + 90, $if_itm_sub2, value);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public String if_itm_sub3() {
		return getConstString(offset + 91, $if_itm_sub3);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public void if_itm_sub3(String value) {
		setConstString(offset + 91, $if_itm_sub3, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 92, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 92, $itm_nm, value);
	}

	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 93, $cst_itm_cd);
	}

	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 93, $cst_itm_cd, value);
	}

	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 94, $cst_itm_nm);
	}

	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 94, $cst_itm_nm, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 95, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 95, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 96, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 96, $sublot_no, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 97, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 97, $ver_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 98, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 98, $sno1, value);
	}

	/**
	 * 手配ＮＯ１無し可ＦＬＧ. Allow without SEIBAN No. 1 flg..<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 99, $sno1_null_flg);
	}

	/**
	 * 手配ＮＯ１無し可ＦＬＧ. Allow without SEIBAN No. 1 flg..<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 99, $sno1_null_flg, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 100, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 100, $sno2, value);
	}

	/**
	 * 手配ＮＯ２無し可ＦＬＧ. Allow without SEIBAN No. 2 flg..<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 101, $sno2_null_flg);
	}

	/**
	 * 手配ＮＯ２無し可ＦＬＧ. Allow without SEIBAN No. 2 flg..<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 101, $sno2_null_flg, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 102, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 102, $sno3, value);
	}

	/**
	 * 手配ＮＯ３無し可ＦＬＧ. Allow without SEIBAN No. 3 flg..<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 103, $sno3_null_flg);
	}

	/**
	 * 手配ＮＯ３無し可ＦＬＧ. Allow without SEIBAN No. 3 flg..<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 103, $sno3_null_flg, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 104, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 104, $sno4, value);
	}

	/**
	 * 手配ＮＯ４無し可ＦＬＧ. Allow without SEIBAN No. 4 flg..<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 105, $sno4_null_flg);
	}

	/**
	 * 手配ＮＯ４無し可ＦＬＧ. Allow without SEIBAN No. 4 flg..<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 105, $sno4_null_flg, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 106, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 106, $gd_cd, value);
	}

	/**
	 * ＩＦ格付ＣＤ. IF grading cd..<p>
	 *
	 */
	public String if_gd_cd() {
		return getConstString(offset + 107, $if_gd_cd);
	}

	/**
	 * ＩＦ格付ＣＤ. IF grading cd..<p>
	 *
	 */
	public void if_gd_cd(String value) {
		setConstString(offset + 107, $if_gd_cd, value);
	}

	/**
	 * 格付名. Grading name.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 108, $gd_nm);
	}

	/**
	 * 格付名. Grading name.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 108, $gd_nm, value);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 109, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 109, $quality_typ, value);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 110, $stk_insp_typ);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 110, $stk_insp_typ, value);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 111, $stk_id_typ);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 111, $stk_id_typ, value);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 112, $stk_bp_cd);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 112, $stk_bp_cd, value);
	}

	/**
	 * ＩＦ在庫取引先ＣＤ. IF inventory BP cd..<p>
	 *
	 */
	public String if_stk_bp_cd() {
		return getConstString(offset + 113, $if_stk_bp_cd);
	}

	/**
	 * ＩＦ在庫取引先ＣＤ. IF inventory BP cd..<p>
	 *
	 */
	public void if_stk_bp_cd(String value) {
		setConstString(offset + 113, $if_stk_bp_cd, value);
	}

	/**
	 * 在庫取引先名. Inventory BP name.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 114, $stk_bp_nm);
	}

	/**
	 * 在庫取引先名. Inventory BP name.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 114, $stk_bp_nm, value);
	}

	/**
	 * 入力単位数量. Input unit qty..<p>
	 *
	 */
	public MCNumber ent_unit_qty() {
		return getConstNumber(offset + 115, $ent_unit_qty);
	}

	/**
	 * 入力単位数量. Input unit qty..<p>
	 *
	 */
	public void ent_unit_qty(MCNumber value) {
		setConstNumber(offset + 115, $ent_unit_qty, value);
	}
	
	/**
	 * 入力単位数量. Input unit qty..<p>
	 *
	 */
	public void ent_unit_qty(int value) {
		setConstNumber(offset + 115, $ent_unit_qty, value);
	}
	
	/**
	 * 入力単位数量. Input unit qty..<p>
	 *
	 */
	public void ent_unit_qty(long value) {
		setConstNumber(offset + 115, $ent_unit_qty, value);
	}
	
	/**
	 * 入力単位数量. Input unit qty..<p>
	 *
	 */
	public void ent_unit_qty(float value) {
		setConstNumber(offset + 115, $ent_unit_qty, value);
	}
	
	/**
	 * 入力単位数量. Input unit qty..<p>
	 *
	 */
	public void ent_unit_qty(double value) {
		setConstNumber(offset + 115, $ent_unit_qty, value);
	}
	
	/**
	 * 入力単位ＣＤ. Input unit cd..<p>
	 *
	 */
	public String ent_unit_cd() {
		return getConstString(offset + 116, $ent_unit_cd);
	}

	/**
	 * 入力単位ＣＤ. Input unit cd..<p>
	 *
	 */
	public void ent_unit_cd(String value) {
		setConstString(offset + 116, $ent_unit_cd, value);
	}

	/**
	 * ＩＦ入力単位ＣＤ. IF input unit cd..<p>
	 *
	 */
	public String if_ent_unit_cd() {
		return getConstString(offset + 117, $if_ent_unit_cd);
	}

	/**
	 * ＩＦ入力単位ＣＤ. IF input unit cd..<p>
	 *
	 */
	public void if_ent_unit_cd(String value) {
		setConstString(offset + 117, $if_ent_unit_cd, value);
	}

	/**
	 * 入力単位名. Input unit name.<p>
	 *
	 */
	public String ent_unit_nm() {
		return getConstString(offset + 118, $ent_unit_nm);
	}

	/**
	 * 入力単位名. Input unit name.<p>
	 *
	 */
	public void ent_unit_nm(String value) {
		setConstString(offset + 118, $ent_unit_nm, value);
	}

	/**
	 * 入力単位入数. Quantity within input unit.<p>
	 *
	 */
	public MCNumber ent_unit_bnum() {
		return getConstNumber(offset + 119, $ent_unit_bnum);
	}

	/**
	 * 入力単位入数. Quantity within input unit.<p>
	 *
	 */
	public void ent_unit_bnum(MCNumber value) {
		setConstNumber(offset + 119, $ent_unit_bnum, value);
	}
	
	/**
	 * 入力単位入数. Quantity within input unit.<p>
	 *
	 */
	public void ent_unit_bnum(int value) {
		setConstNumber(offset + 119, $ent_unit_bnum, value);
	}
	
	/**
	 * 入力単位入数. Quantity within input unit.<p>
	 *
	 */
	public void ent_unit_bnum(long value) {
		setConstNumber(offset + 119, $ent_unit_bnum, value);
	}
	
	/**
	 * 入力単位入数. Quantity within input unit.<p>
	 *
	 */
	public void ent_unit_bnum(float value) {
		setConstNumber(offset + 119, $ent_unit_bnum, value);
	}
	
	/**
	 * 入力単位入数. Quantity within input unit.<p>
	 *
	 */
	public void ent_unit_bnum(double value) {
		setConstNumber(offset + 119, $ent_unit_bnum, value);
	}
	
	/**
	 * 入力単位重量. Input unit weight.<p>
	 *
	 */
	public MCNumber ent_unit_wt() {
		return getConstNumber(offset + 120, $ent_unit_wt);
	}

	/**
	 * 入力単位重量. Input unit weight.<p>
	 *
	 */
	public void ent_unit_wt(MCNumber value) {
		setConstNumber(offset + 120, $ent_unit_wt, value);
	}
	
	/**
	 * 入力単位重量. Input unit weight.<p>
	 *
	 */
	public void ent_unit_wt(int value) {
		setConstNumber(offset + 120, $ent_unit_wt, value);
	}
	
	/**
	 * 入力単位重量. Input unit weight.<p>
	 *
	 */
	public void ent_unit_wt(long value) {
		setConstNumber(offset + 120, $ent_unit_wt, value);
	}
	
	/**
	 * 入力単位重量. Input unit weight.<p>
	 *
	 */
	public void ent_unit_wt(float value) {
		setConstNumber(offset + 120, $ent_unit_wt, value);
	}
	
	/**
	 * 入力単位重量. Input unit weight.<p>
	 *
	 */
	public void ent_unit_wt(double value) {
		setConstNumber(offset + 120, $ent_unit_wt, value);
	}
	
	/**
	 * 入力単位容積. Input unit volume.<p>
	 *
	 */
	public MCNumber ent_unit_dim() {
		return getConstNumber(offset + 121, $ent_unit_dim);
	}

	/**
	 * 入力単位容積. Input unit volume.<p>
	 *
	 */
	public void ent_unit_dim(MCNumber value) {
		setConstNumber(offset + 121, $ent_unit_dim, value);
	}
	
	/**
	 * 入力単位容積. Input unit volume.<p>
	 *
	 */
	public void ent_unit_dim(int value) {
		setConstNumber(offset + 121, $ent_unit_dim, value);
	}
	
	/**
	 * 入力単位容積. Input unit volume.<p>
	 *
	 */
	public void ent_unit_dim(long value) {
		setConstNumber(offset + 121, $ent_unit_dim, value);
	}
	
	/**
	 * 入力単位容積. Input unit volume.<p>
	 *
	 */
	public void ent_unit_dim(float value) {
		setConstNumber(offset + 121, $ent_unit_dim, value);
	}
	
	/**
	 * 入力単位容積. Input unit volume.<p>
	 *
	 */
	public void ent_unit_dim(double value) {
		setConstNumber(offset + 121, $ent_unit_dim, value);
	}
	
	/**
	 * 重量単位ＣＤ. Weight unit cd..<p>
	 *
	 */
	public String wt_unit_cd() {
		return getConstString(offset + 122, $wt_unit_cd);
	}

	/**
	 * 重量単位ＣＤ. Weight unit cd..<p>
	 *
	 */
	public void wt_unit_cd(String value) {
		setConstString(offset + 122, $wt_unit_cd, value);
	}

	/**
	 * ＩＦ重量単位ＣＤ. IF weight unit cd..<p>
	 *
	 */
	public String if_wt_unit_cd() {
		return getConstString(offset + 123, $if_wt_unit_cd);
	}

	/**
	 * ＩＦ重量単位ＣＤ. IF weight unit cd..<p>
	 *
	 */
	public void if_wt_unit_cd(String value) {
		setConstString(offset + 123, $if_wt_unit_cd, value);
	}

	/**
	 * 重量単位名. Weight unit name.<p>
	 *
	 */
	public String wt_unit_nm() {
		return getConstString(offset + 124, $wt_unit_nm);
	}

	/**
	 * 重量単位名. Weight unit name.<p>
	 *
	 */
	public void wt_unit_nm(String value) {
		setConstString(offset + 124, $wt_unit_nm, value);
	}

	/**
	 * 容積単位ＣＤ. Volume unit cd..<p>
	 *
	 */
	public String dim_unit_cd() {
		return getConstString(offset + 125, $dim_unit_cd);
	}

	/**
	 * 容積単位ＣＤ. Volume unit cd..<p>
	 *
	 */
	public void dim_unit_cd(String value) {
		setConstString(offset + 125, $dim_unit_cd, value);
	}

	/**
	 * ＩＦ容積単位ＣＤ. IF volume unit cd..<p>
	 *
	 */
	public String if_dim_unit_cd() {
		return getConstString(offset + 126, $if_dim_unit_cd);
	}

	/**
	 * ＩＦ容積単位ＣＤ. IF volume unit cd..<p>
	 *
	 */
	public void if_dim_unit_cd(String value) {
		setConstString(offset + 126, $if_dim_unit_cd, value);
	}

	/**
	 * 容積単位名. Volume unit name.<p>
	 *
	 */
	public String dim_unit_nm() {
		return getConstString(offset + 127, $dim_unit_nm);
	}

	/**
	 * 容積単位名. Volume unit name.<p>
	 *
	 */
	public void dim_unit_nm(String value) {
		setConstString(offset + 127, $dim_unit_nm, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 128, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 128, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 128, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 128, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 128, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 128, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 129, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 129, $trd_unit_cd, value);
	}

	/**
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public String if_trd_unit_cd() {
		return getConstString(offset + 130, $if_trd_unit_cd);
	}

	/**
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public void if_trd_unit_cd(String value) {
		setConstString(offset + 130, $if_trd_unit_cd, value);
	}

	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 131, $trd_unit_nm);
	}

	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 131, $trd_unit_nm, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 132, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 132, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 132, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 132, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 132, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 132, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 133, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 133, $base_unit_cd, value);
	}

	/**
	 * ＩＦ基準単位ＣＤ. IF base unit cd..<p>
	 *
	 */
	public String if_base_unit_cd() {
		return getConstString(offset + 134, $if_base_unit_cd);
	}

	/**
	 * ＩＦ基準単位ＣＤ. IF base unit cd..<p>
	 *
	 */
	public void if_base_unit_cd(String value) {
		setConstString(offset + 134, $if_base_unit_cd, value);
	}

	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 135, $base_unit_nm);
	}

	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 135, $base_unit_nm, value);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 136, $pack_unit_qty);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 136, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 136, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 136, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 136, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 136, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 137, $pack_unit_cd);
	}

	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 137, $pack_unit_cd, value);
	}

	/**
	 * ＩＦ荷姿単位ＣＤ. IF SKU cd..<p>
	 *
	 */
	public String if_pack_unit_cd() {
		return getConstString(offset + 138, $if_pack_unit_cd);
	}

	/**
	 * ＩＦ荷姿単位ＣＤ. IF SKU cd..<p>
	 *
	 */
	public void if_pack_unit_cd(String value) {
		setConstString(offset + 138, $if_pack_unit_cd, value);
	}

	/**
	 * 荷姿単位名. SKU name.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 139, $pack_unit_nm);
	}

	/**
	 * 荷姿単位名. SKU name.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 139, $pack_unit_nm, value);
	}

	/**
	 * 引当済ＦＬＧ. Allocated flg..<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 140, $alloc_flg);
	}

	/**
	 * 引当済ＦＬＧ. Allocated flg..<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 140, $alloc_flg, value);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 141, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 141, $abort_flg, value);
	}

	/**
	 * 販売他勘定ＦＬＧ. Sales other accounting flg..<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 142, $sls_acxfr_flg);
	}

	/**
	 * 販売他勘定ＦＬＧ. Sales other accounting flg..<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 142, $sls_acxfr_flg, value);
	}

	/**
	 * 預り出荷ＦＬＧ. Customer inventory shipment flg..<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 143, $sls_cststk_flg);
	}

	/**
	 * 預り出荷ＦＬＧ. Customer inventory shipment flg..<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 143, $sls_cststk_flg, value);
	}

	/**
	 * 貸出出荷ＦＬＧ. Consignment shipment flg..<p>
	 *
	 */
	public boolean vmi_flg() {
		return getConstBoolean(offset + 144, $vmi_flg);
	}

	/**
	 * 貸出出荷ＦＬＧ. Consignment shipment flg..<p>
	 *
	 */
	public void vmi_flg(boolean value) {
		setConstBoolean(offset + 144, $vmi_flg, value);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 145, $vld_dt);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 145, $vld_dt, value);
	}

	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 146, $lmt_dt);
	}

	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 146, $lmt_dt, value);
	}

	/**
	 * 最古入庫日. Oldest GR date.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 147, $first_gr_dt);
	}

	/**
	 * 最古入庫日. Oldest GR date.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 147, $first_gr_dt, value);
	}

	/**
	 * 支給区分. Supply type.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 148, $prov_typ);
	}

	/**
	 * 支給区分. Supply type.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 148, $prov_typ, value);
	}

	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 149, $prov_basis_typ);
	}

	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 149, $prov_basis_typ, value);
	}

	/**
	 * 支給区分（返品）. Supply type (Return).<p>
	 *
	 */
	public String ret_prov_typ() {
		return getConstString(offset + 150, $ret_prov_typ);
	}

	/**
	 * 支給区分（返品）. Supply type (Return).<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		setConstString(offset + 150, $ret_prov_typ, value);
	}

	/**
	 * 支給計上区分（返品）. Supply recording type (Return).<p>
	 *
	 */
	public String ret_prov_basis_typ() {
		return getConstString(offset + 151, $ret_prov_basis_typ);
	}

	/**
	 * 支給計上区分（返品）. Supply recording type (Return).<p>
	 *
	 */
	public void ret_prov_basis_typ(String value) {
		setConstString(offset + 151, $ret_prov_basis_typ, value);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 152, $rsn_cd);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 152, $rsn_cd, value);
	}

	/**
	 * ＩＦ理由ＣＤ. IF reason cd..<p>
	 *
	 */
	public String if_rsn_cd() {
		return getConstString(offset + 153, $if_rsn_cd);
	}

	/**
	 * ＩＦ理由ＣＤ. IF reason cd..<p>
	 *
	 */
	public void if_rsn_cd(String value) {
		setConstString(offset + 153, $if_rsn_cd, value);
	}

	/**
	 * 理由名. Reason name.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 154, $rsn_nm);
	}

	/**
	 * 理由名. Reason name.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 154, $rsn_nm, value);
	}

	/**
	 * 指図備考. Order remarks.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 155, $inst_rmrks);
	}

	/**
	 * 指図備考. Order remarks.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 155, $inst_rmrks, value);
	}

	/**
	 * 指図明細備考. Order details remarks.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 156, $inst_d_rmrks);
	}

	/**
	 * 指図明細備考. Order details remarks.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 156, $inst_d_rmrks, value);
	}

	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 157, $ship_cnt_rmrks);
	}

	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 157, $ship_cnt_rmrks, value);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public String if_co_cd() {
		return getConstString(offset + 158, $if_co_cd);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public void if_co_cd(String value) {
		setConstString(offset + 158, $if_co_cd, value);
	}

	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 159, $co_nm);
	}

	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 159, $co_nm, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 160, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 160, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 161, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 161, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 162, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 162, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 163, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 163, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 164, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 164, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 165, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 165, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 166, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 166, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 167, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 167, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 168, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 168, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 169, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 169, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 170, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 170, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 171, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 171, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 172, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 172, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 173, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 173, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 174, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 174, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 175, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 175, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 176, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 176, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 177, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 177, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 178, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 178, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 179, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 179, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 180, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 180, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 181, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 181, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 182, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 182, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 183, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 183, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 184, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 184, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 185, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 185, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 186, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 186, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 187, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 187, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 188, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 188, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 189, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 189, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 190, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 190, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 190, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 190, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 190, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 190, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 191, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 191, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 191, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 191, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 191, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 191, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 192, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 192, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 192, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 192, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 192, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 192, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 193, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 193, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 193, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 193, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 193, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 193, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 194, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 194, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 194, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 194, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 194, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 194, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 195, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 195, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 196, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 196, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 197, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 197, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 198, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 198, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 199, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 199, $sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 200, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 200, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 201, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 201, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 201, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 201, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 201, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 201, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 202, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 202, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 202, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 202, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 202, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 202, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 203, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 203, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 204, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 204, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 205, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 205, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 206, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 206, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 207, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 207, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 207, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 207, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 207, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 207, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 208, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 208, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 209, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 209, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 210, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 210, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 211, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 211, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 212, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 212, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 213, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 213, $sdrv_sts_typ, value);
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
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($if_ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return if_ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
		}
		if ($if_site_co_cd.equalsIgnoreCase(name)) {
			return if_site_co_cd();
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			return site_co_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($if_ship_wk_cd.equalsIgnoreCase(name)) {
			return if_ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($if_ship_term_cd.equalsIgnoreCase(name)) {
			return if_ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($if_inst_dpt_cd.equalsIgnoreCase(name)) {
			return if_inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($if_inst_usr_cd.equalsIgnoreCase(name)) {
			return if_inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($if_ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return if_ship_to_lg_grp_cd();
		}
		if ($ship_to_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_nm();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($if_ship_to_id_cd.equalsIgnoreCase(name)) {
			return if_ship_to_id_cd();
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($if_dlv_id_cd.equalsIgnoreCase(name)) {
			return if_dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($if_cst_cd.equalsIgnoreCase(name)) {
			return if_cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($if_dest_cd1.equalsIgnoreCase(name)) {
			return if_dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($if_dest_cd2.equalsIgnoreCase(name)) {
			return if_dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($if_dest_cd3.equalsIgnoreCase(name)) {
			return if_dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			return if_trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($if_ship_loc_cd.equalsIgnoreCase(name)) {
			return if_ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_str_ln_cd();
		}
		if ($if_ship_str_ln_cd.equalsIgnoreCase(name)) {
			return if_ship_str_ln_cd();
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_str_ln_nm();
		}
		if ($ship_loc_tel.equalsIgnoreCase(name)) {
			return ship_loc_tel();
		}
		if ($ship_loc_fax.equalsIgnoreCase(name)) {
			return ship_loc_fax();
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
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			return if_itm_cd();
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			return if_itm_sub1();
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			return if_itm_sub2();
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			return if_itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($if_gd_cd.equalsIgnoreCase(name)) {
			return if_gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($if_stk_bp_cd.equalsIgnoreCase(name)) {
			return if_stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			return ent_unit_cd();
		}
		if ($if_ent_unit_cd.equalsIgnoreCase(name)) {
			return if_ent_unit_cd();
		}
		if ($ent_unit_nm.equalsIgnoreCase(name)) {
			return ent_unit_nm();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($if_wt_unit_cd.equalsIgnoreCase(name)) {
			return if_wt_unit_cd();
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			return wt_unit_nm();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($if_dim_unit_cd.equalsIgnoreCase(name)) {
			return if_dim_unit_cd();
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			return dim_unit_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			return if_trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($if_base_unit_cd.equalsIgnoreCase(name)) {
			return if_base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($if_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($if_rsn_cd.equalsIgnoreCase(name)) {
			return if_rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
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
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			return ship_inst_rev();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			return ent_unit_qty();
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			return ent_unit_bnum();
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			return ent_unit_wt();
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			return ent_unit_dim();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
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
		if ($ship_inst_tm.equalsIgnoreCase(name)) {
			return ship_inst_tm();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($pd_inst_dlv_tm.equalsIgnoreCase(name)) {
			return pd_inst_dlv_tm();
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
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
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($assort_flg.equalsIgnoreCase(name)) {
			return assort_flg();
		}
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
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
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($if_ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return if_ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
		}
		if ($if_site_co_cd.equalsIgnoreCase(name)) {
			return if_site_co_cd();
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			return site_co_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($if_ship_wk_cd.equalsIgnoreCase(name)) {
			return if_ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($if_ship_term_cd.equalsIgnoreCase(name)) {
			return if_ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($if_inst_dpt_cd.equalsIgnoreCase(name)) {
			return if_inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($if_inst_usr_cd.equalsIgnoreCase(name)) {
			return if_inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($if_ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return if_ship_to_lg_grp_cd();
		}
		if ($ship_to_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_nm();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($if_ship_to_id_cd.equalsIgnoreCase(name)) {
			return if_ship_to_id_cd();
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($if_dlv_id_cd.equalsIgnoreCase(name)) {
			return if_dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($if_cst_cd.equalsIgnoreCase(name)) {
			return if_cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($if_dest_cd1.equalsIgnoreCase(name)) {
			return if_dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($if_dest_cd2.equalsIgnoreCase(name)) {
			return if_dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($if_dest_cd3.equalsIgnoreCase(name)) {
			return if_dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			return if_trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($if_ship_loc_cd.equalsIgnoreCase(name)) {
			return if_ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_str_ln_cd();
		}
		if ($if_ship_str_ln_cd.equalsIgnoreCase(name)) {
			return if_ship_str_ln_cd();
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_str_ln_nm();
		}
		if ($ship_loc_tel.equalsIgnoreCase(name)) {
			return ship_loc_tel();
		}
		if ($ship_loc_fax.equalsIgnoreCase(name)) {
			return ship_loc_fax();
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
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			return if_itm_cd();
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			return if_itm_sub1();
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			return if_itm_sub2();
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			return if_itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($if_gd_cd.equalsIgnoreCase(name)) {
			return if_gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($if_stk_bp_cd.equalsIgnoreCase(name)) {
			return if_stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			return ent_unit_cd();
		}
		if ($if_ent_unit_cd.equalsIgnoreCase(name)) {
			return if_ent_unit_cd();
		}
		if ($ent_unit_nm.equalsIgnoreCase(name)) {
			return ent_unit_nm();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($if_wt_unit_cd.equalsIgnoreCase(name)) {
			return if_wt_unit_cd();
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			return wt_unit_nm();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($if_dim_unit_cd.equalsIgnoreCase(name)) {
			return if_dim_unit_cd();
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			return dim_unit_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			return if_trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($if_base_unit_cd.equalsIgnoreCase(name)) {
			return if_base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($if_pack_unit_cd.equalsIgnoreCase(name)) {
			return if_pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($if_rsn_cd.equalsIgnoreCase(name)) {
			return if_rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
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
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			return ship_inst_rev();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			return ent_unit_qty();
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			return ent_unit_bnum();
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			return ent_unit_wt();
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			return ent_unit_dim();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
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
		if ($ship_inst_tm.equalsIgnoreCase(name)) {
			return ship_inst_tm();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($pd_inst_dlv_tm.equalsIgnoreCase(name)) {
			return pd_inst_dlv_tm();
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
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
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($assort_flg.equalsIgnoreCase(name)) {
			return assort_flg();
		}
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
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
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($if_ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			if_ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
			return;
		}
		if ($if_site_co_cd.equalsIgnoreCase(name)) {
			if_site_co_cd(value);
			return;
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			site_co_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($if_ship_wk_cd.equalsIgnoreCase(name)) {
			if_ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($if_ship_term_cd.equalsIgnoreCase(name)) {
			if_ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($if_inst_dpt_cd.equalsIgnoreCase(name)) {
			if_inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($if_inst_usr_cd.equalsIgnoreCase(name)) {
			if_inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($if_ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			if_ship_to_lg_grp_cd(value);
			return;
		}
		if ($ship_to_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_to_lg_grp_nm(value);
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
		if ($if_ship_to_id_cd.equalsIgnoreCase(name)) {
			if_ship_to_id_cd(value);
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($if_dlv_id_cd.equalsIgnoreCase(name)) {
			if_dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($if_cst_cd.equalsIgnoreCase(name)) {
			if_cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($if_dest_cd1.equalsIgnoreCase(name)) {
			if_dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($if_dest_cd2.equalsIgnoreCase(name)) {
			if_dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($if_dest_cd3.equalsIgnoreCase(name)) {
			if_dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			if_trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($if_ship_loc_cd.equalsIgnoreCase(name)) {
			if_ship_loc_cd(value);
			return;
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			ship_loc_nm(value);
			return;
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			ship_str_ln_cd(value);
			return;
		}
		if ($if_ship_str_ln_cd.equalsIgnoreCase(name)) {
			if_ship_str_ln_cd(value);
			return;
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			ship_str_ln_nm(value);
			return;
		}
		if ($ship_loc_tel.equalsIgnoreCase(name)) {
			ship_loc_tel(value);
			return;
		}
		if ($ship_loc_fax.equalsIgnoreCase(name)) {
			ship_loc_fax(value);
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
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			if_itm_cd(value);
			return;
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			if_itm_sub1(value);
			return;
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			if_itm_sub2(value);
			return;
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			if_itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($if_gd_cd.equalsIgnoreCase(name)) {
			if_gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
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
		if ($if_stk_bp_cd.equalsIgnoreCase(name)) {
			if_stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			ent_unit_cd(value);
			return;
		}
		if ($if_ent_unit_cd.equalsIgnoreCase(name)) {
			if_ent_unit_cd(value);
			return;
		}
		if ($ent_unit_nm.equalsIgnoreCase(name)) {
			ent_unit_nm(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($if_wt_unit_cd.equalsIgnoreCase(name)) {
			if_wt_unit_cd(value);
			return;
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			wt_unit_nm(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($if_dim_unit_cd.equalsIgnoreCase(name)) {
			if_dim_unit_cd(value);
			return;
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			dim_unit_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			if_trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($if_base_unit_cd.equalsIgnoreCase(name)) {
			if_base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
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
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($if_rsn_cd.equalsIgnoreCase(name)) {
			if_rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
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
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			ent_unit_qty(value);
			return;
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			ent_unit_bnum(value);
			return;
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			ent_unit_wt(value);
			return;
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			ent_unit_dim(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
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
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			ent_unit_qty(value);
			return;
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			ent_unit_bnum(value);
			return;
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			ent_unit_wt(value);
			return;
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			ent_unit_dim(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
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
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			ent_unit_qty(value);
			return;
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			ent_unit_bnum(value);
			return;
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			ent_unit_wt(value);
			return;
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			ent_unit_dim(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
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
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			ent_unit_qty(value);
			return;
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			ent_unit_bnum(value);
			return;
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			ent_unit_wt(value);
			return;
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			ent_unit_dim(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
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
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			ent_unit_qty(value);
			return;
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			ent_unit_bnum(value);
			return;
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			ent_unit_wt(value);
			return;
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			ent_unit_dim(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
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
		if ($ship_inst_tm.equalsIgnoreCase(name)) {
			ship_inst_tm(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($pd_inst_dlv_tm.equalsIgnoreCase(name)) {
			pd_inst_dlv_tm(value);
			return;
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
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
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
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
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($assort_flg.equalsIgnoreCase(name)) {
			assort_flg(value);
			return;
		}
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
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
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($if_ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			if_ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
			return;
		}
		if ($if_site_co_cd.equalsIgnoreCase(name)) {
			if_site_co_cd(value);
			return;
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			site_co_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($if_ship_wk_cd.equalsIgnoreCase(name)) {
			if_ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($if_ship_term_cd.equalsIgnoreCase(name)) {
			if_ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($if_inst_dpt_cd.equalsIgnoreCase(name)) {
			if_inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($if_inst_usr_cd.equalsIgnoreCase(name)) {
			if_inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($if_ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			if_ship_to_lg_grp_cd(value);
			return;
		}
		if ($ship_to_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_to_lg_grp_nm(value);
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
		if ($if_ship_to_id_cd.equalsIgnoreCase(name)) {
			if_ship_to_id_cd(value);
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($if_dlv_id_cd.equalsIgnoreCase(name)) {
			if_dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($if_cst_cd.equalsIgnoreCase(name)) {
			if_cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($if_dest_cd1.equalsIgnoreCase(name)) {
			if_dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($if_dest_cd2.equalsIgnoreCase(name)) {
			if_dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($if_dest_cd3.equalsIgnoreCase(name)) {
			if_dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			if_trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($if_ship_loc_cd.equalsIgnoreCase(name)) {
			if_ship_loc_cd(value);
			return;
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			ship_loc_nm(value);
			return;
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			ship_str_ln_cd(value);
			return;
		}
		if ($if_ship_str_ln_cd.equalsIgnoreCase(name)) {
			if_ship_str_ln_cd(value);
			return;
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			ship_str_ln_nm(value);
			return;
		}
		if ($ship_loc_tel.equalsIgnoreCase(name)) {
			ship_loc_tel(value);
			return;
		}
		if ($ship_loc_fax.equalsIgnoreCase(name)) {
			ship_loc_fax(value);
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
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			if_itm_cd(value);
			return;
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			if_itm_sub1(value);
			return;
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			if_itm_sub2(value);
			return;
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			if_itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($if_gd_cd.equalsIgnoreCase(name)) {
			if_gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
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
		if ($if_stk_bp_cd.equalsIgnoreCase(name)) {
			if_stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			ent_unit_cd(value);
			return;
		}
		if ($if_ent_unit_cd.equalsIgnoreCase(name)) {
			if_ent_unit_cd(value);
			return;
		}
		if ($ent_unit_nm.equalsIgnoreCase(name)) {
			ent_unit_nm(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($if_wt_unit_cd.equalsIgnoreCase(name)) {
			if_wt_unit_cd(value);
			return;
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			wt_unit_nm(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($if_dim_unit_cd.equalsIgnoreCase(name)) {
			if_dim_unit_cd(value);
			return;
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			dim_unit_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			if_trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($if_base_unit_cd.equalsIgnoreCase(name)) {
			if_base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
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
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($if_rsn_cd.equalsIgnoreCase(name)) {
			if_rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
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
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			ent_unit_qty(value);
			return;
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			ent_unit_bnum(value);
			return;
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			ent_unit_wt(value);
			return;
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			ent_unit_dim(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
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
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			ent_unit_qty(value);
			return;
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			ent_unit_bnum(value);
			return;
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			ent_unit_wt(value);
			return;
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			ent_unit_dim(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
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
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			ent_unit_qty(value);
			return;
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			ent_unit_bnum(value);
			return;
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			ent_unit_wt(value);
			return;
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			ent_unit_dim(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
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
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			ent_unit_qty(value);
			return;
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			ent_unit_bnum(value);
			return;
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			ent_unit_wt(value);
			return;
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			ent_unit_dim(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
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
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($ent_unit_qty.equalsIgnoreCase(name)) {
			ent_unit_qty(value);
			return;
		}
		if ($ent_unit_bnum.equalsIgnoreCase(name)) {
			ent_unit_bnum(value);
			return;
		}
		if ($ent_unit_wt.equalsIgnoreCase(name)) {
			ent_unit_wt(value);
			return;
		}
		if ($ent_unit_dim.equalsIgnoreCase(name)) {
			ent_unit_dim(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
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
		if ($ship_inst_tm.equalsIgnoreCase(name)) {
			ship_inst_tm(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($pd_inst_dlv_tm.equalsIgnoreCase(name)) {
			pd_inst_dlv_tm(value);
			return;
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
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
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
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
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($assort_flg.equalsIgnoreCase(name)) {
			assort_flg(value);
			return;
		}
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
