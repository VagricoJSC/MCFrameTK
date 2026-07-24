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
 * "出荷進捗 // Shipping progress"DBコンテナRowクラスです。<p>
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
 *  	<td>ship_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷進捗ＮＯ</td>
 *  	<td>Shipping progress No.</td>
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
 *  	<td>xfr_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>移動・移送予定ＮＯ</td>
 *  	<td>Movement/transport schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元部門ＣＤ</td>
 *  	<td>Requesting dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元担当者ＣＤ</td>
 *  	<td>Requesting PIC cd.</td>
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
 *  	<td>ship_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷希望日時</td>
 *  	<td>Desired shipping date and time</td>
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
 *  	<td>prms_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納期回答日</td>
 *  	<td>order promising date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prms_dlv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>回答納入日</td>
 *  	<td>Replied delivery date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_rcpt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示受領日</td>
 *  	<td>Delivery order received date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_prms_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示回答日</td>
 *  	<td>Delivery order replied date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷予定日時</td>
 *  	<td>Scheduled shipping date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品予定日時</td>
 *  	<td>Scheduled delivery date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷日時</td>
 *  	<td>Shipping date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品日時</td>
 *  	<td>Delivery date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上日</td>
 *  	<td>Sales date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_to_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷先物流グループＣＤ</td>
 *  	<td>Receiving point distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先識別区分</td>
 *  	<td>Delivery destination identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先識別ＣＤ</td>
 *  	<td>Delivery destination identification cd.</td>
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
 *  	<td>dlv_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先郵便番号</td>
 *  	<td>Zip code (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所１</td>
 *  	<td>Address 1 (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所２</td>
 *  	<td>Address 2 (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所３</td>
 *  	<td>Address 3 (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所４</td>
 *  	<td>Address 4 (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先部署</td>
 *  	<td>Delivery destination dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先担当者</td>
 *  	<td>Delivery destination PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＴＥＬ</td>
 *  	<td>TEL (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＦＡＸ</td>
 *  	<td>FAX (Delivery destination)</td>
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
 *  	<td>dlv_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品棚・ラインＣＤ</td>
 *  	<td>Delivery rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送付先識別区分</td>
 *  	<td>Receiving point identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_to_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
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
 *  	<td>prms_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納期回答数量</td>
 *  	<td>Order promising qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_rcpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示受領数量</td>
 *  	<td>Delivery order received qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_prms_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示回答数量</td>
 *  	<td>Delivery order replied qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>re_ship_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>再出荷予定数量</td>
 *  	<td>Scheduled re-shipping qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷指図数量</td>
 *  	<td>Shipping order qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷実績数量</td>
 *  	<td>Shipping result qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイス出荷予定数量</td>
 *  	<td>Invoice shipping scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイス出荷実績数量</td>
 *  	<td>Invoice shipping result qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上数量</td>
 *  	<td>Sales qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品数量</td>
 *  	<td>Delivery qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_ret_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷返品数量</td>
 *  	<td>Shipping return qty.</td>
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
 *  	<td>ship_schd_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷予定打切数量</td>
 *  	<td>Cancelled remaining shipping schedule qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_schd_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上予定打切数量</td>
 *  	<td>Cancelled remaining sales schedule qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_dlv_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品ＬＴ</td>
 *  	<td>Delivery LT</td>
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
 *  	<td>purc_ddlv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入直送ＦＬＧ</td>
 *  	<td>Direct delivery flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_schd_split_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷予定分割区分</td>
 *  	<td>Shipping schedule split type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alloc_scope_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>引当範囲区分</td>
 *  	<td>Allocation range type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>引当区分</td>
 *  	<td>Allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alloc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループＣＤ</td>
 *  	<td>Gross allocation location group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷物流グループＣＤ</td>
 *  	<td>Shipping distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>デフォルト場所ＣＤ</td>
 *  	<td>Default location cd.</td>
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
 *  	<td>棚・ラインＣＤ</td>
 *  	<td>Rack/Line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>period_block_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>引当期間保留ＦＬＧ</td>
 *  	<td>Allocation period pending flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売状況区分</td>
 *  	<td>Sales status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prms_dlv_dt_overdue_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>回答納入日遅れＦＬＧ</td>
 *  	<td>Replied delivery date delay flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_rqst_dt_overdue_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入希望日遅れＦＬＧ</td>
 *  	<td>Delivery dates delayed flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_schd_split_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷予定分割ＦＬＧ</td>
 *  	<td>Shipping schedule split flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷完了ＦＬＧ</td>
 *  	<td>Shipping completion flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上完了ＦＬＧ</td>
 *  	<td>Sales completed flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品完了ＦＬＧ</td>
 *  	<td>Delivery completion flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷連絡備考</td>
 *  	<td>Shipping notification remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払進捗管理ＮＯ</td>
 *  	<td>GR/GI progress management No.</td>
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
 *  	<td>not_lg_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流グループ混在不可ＦＬＧ</td>
 *  	<td>Prohibit mixed distribution group flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_SHIP_PR_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_SHIP_PR";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 出荷進捗ＮＯ. Shipping progress No..<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	private static final MCPermColumnInfo _ship_pr_no = createColumnInfo("ship_pr_no");
	public final MCStringPermColumn ship_pr_no = createStringColumn(_ship_pr_no);
	
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
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	private static final MCPermColumnInfo _slo_d_no = createColumnInfo("slo_d_no");
	public final MCStringPermColumn slo_d_no = createStringColumn(_slo_d_no);
	
	/**
	 * 移動・移送予定ＮＯ. Movement/transport schedule No..<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	private static final MCPermColumnInfo _xfr_schd_no = createColumnInfo("xfr_schd_no");
	public final MCStringPermColumn xfr_schd_no = createStringColumn(_xfr_schd_no);
	
	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	private static final MCPermColumnInfo _rqst_dpt_cd = createColumnInfo("rqst_dpt_cd");
	public final MCStringPermColumn rqst_dpt_cd = createStringColumn(_rqst_dpt_cd);
	
	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	private static final MCPermColumnInfo _rqst_usr_cd = createColumnInfo("rqst_usr_cd");
	public final MCStringPermColumn rqst_usr_cd = createStringColumn(_rqst_usr_cd);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public static final String $ship_rqst_tm = "ship_rqst_tm";
	private static final MCPermColumnInfo _ship_rqst_tm = createColumnInfo("ship_rqst_tm");
	public final MCDatePermColumn ship_rqst_tm = createDateColumn(_ship_rqst_tm);
	
	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	private static final MCPermColumnInfo _dlv_rqst_tm = createColumnInfo("dlv_rqst_tm");
	public final MCDatePermColumn dlv_rqst_tm = createDateColumn(_dlv_rqst_tm);
	
	/**
	 * 納期回答日. order promising date.<p>
	 *
	 */
	public static final String $prms_dt = "prms_dt";
	private static final MCPermColumnInfo _prms_dt = createColumnInfo("prms_dt");
	public final MCDatePermColumn prms_dt = createDateColumn(_prms_dt);
	
	/**
	 * 回答納入日. Replied delivery date.<p>
	 *
	 */
	public static final String $prms_dlv_dt = "prms_dlv_dt";
	private static final MCPermColumnInfo _prms_dlv_dt = createColumnInfo("prms_dlv_dt");
	public final MCDatePermColumn prms_dlv_dt = createDateColumn(_prms_dlv_dt);
	
	/**
	 * 納入指示受領日. Delivery order received date.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_dt = "dlv_inst_rcpt_dt";
	private static final MCPermColumnInfo _dlv_inst_rcpt_dt = createColumnInfo("dlv_inst_rcpt_dt");
	public final MCDatePermColumn dlv_inst_rcpt_dt = createDateColumn(_dlv_inst_rcpt_dt);
	
	/**
	 * 納入指示回答日. Delivery order replied date.<p>
	 *
	 */
	public static final String $dlv_inst_prms_dt = "dlv_inst_prms_dt";
	private static final MCPermColumnInfo _dlv_inst_prms_dt = createColumnInfo("dlv_inst_prms_dt");
	public final MCDatePermColumn dlv_inst_prms_dt = createDateColumn(_dlv_inst_prms_dt);
	
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
	 * 出荷日時. Shipping date and time.<p>
	 *
	 */
	public static final String $ship_tm = "ship_tm";
	private static final MCPermColumnInfo _ship_tm = createColumnInfo("ship_tm");
	public final MCDatePermColumn ship_tm = createDateColumn(_ship_tm);
	
	/**
	 * 納品日時. Delivery date and time.<p>
	 *
	 */
	public static final String $dlv_tm = "dlv_tm";
	private static final MCPermColumnInfo _dlv_tm = createColumnInfo("dlv_tm");
	public final MCDatePermColumn dlv_tm = createDateColumn(_dlv_tm);
	
	/**
	 * 売上日. Sales date.<p>
	 *
	 */
	public static final String $sls_dt = "sls_dt";
	private static final MCPermColumnInfo _sls_dt = createColumnInfo("sls_dt");
	public final MCDatePermColumn sls_dt = createDateColumn(_sls_dt);
	
	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public static final String $ship_to_lg_grp_cd = "ship_to_lg_grp_cd";
	private static final MCPermColumnInfo _ship_to_lg_grp_cd = createColumnInfo("ship_to_lg_grp_cd");
	public final MCStringPermColumn ship_to_lg_grp_cd = createStringColumn(_ship_to_lg_grp_cd);
	
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
	 * 納品先識別名. Delivery destination identification name.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	private static final MCPermColumnInfo _dlv_id_nm = createColumnInfo("dlv_id_nm");
	public final MCStringPermColumn dlv_id_nm = createStringColumn(_dlv_id_nm);
	
	/**
	 * 納品先郵便番号. Zip code (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	private static final MCPermColumnInfo _dlv_zip_cd = createColumnInfo("dlv_zip_cd");
	public final MCStringPermColumn dlv_zip_cd = createStringColumn(_dlv_zip_cd);
	
	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	private static final MCPermColumnInfo _dlv_addr1 = createColumnInfo("dlv_addr1");
	public final MCStringPermColumn dlv_addr1 = createStringColumn(_dlv_addr1);
	
	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	private static final MCPermColumnInfo _dlv_addr2 = createColumnInfo("dlv_addr2");
	public final MCStringPermColumn dlv_addr2 = createStringColumn(_dlv_addr2);
	
	/**
	 * 納品先住所３. Address 3 (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	private static final MCPermColumnInfo _dlv_addr3 = createColumnInfo("dlv_addr3");
	public final MCStringPermColumn dlv_addr3 = createStringColumn(_dlv_addr3);
	
	/**
	 * 納品先住所４. Address 4 (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	private static final MCPermColumnInfo _dlv_addr4 = createColumnInfo("dlv_addr4");
	public final MCStringPermColumn dlv_addr4 = createStringColumn(_dlv_addr4);
	
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
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	private static final MCPermColumnInfo _dlv_tel = createColumnInfo("dlv_tel");
	public final MCStringPermColumn dlv_tel = createStringColumn(_dlv_tel);
	
	/**
	 * 納品先ＦＡＸ. FAX (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	private static final MCPermColumnInfo _dlv_fax = createColumnInfo("dlv_fax");
	public final MCStringPermColumn dlv_fax = createStringColumn(_dlv_fax);
	
	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	private static final MCPermColumnInfo _dlv_sundry_flg = createColumnInfo("dlv_sundry_flg");
	public final MCBooleanPermColumn dlv_sundry_flg = createBooleanColumn(_dlv_sundry_flg);
	
	/**
	 * 納品棚・ラインＣＤ. Delivery rack/line cd..<p>
	 *
	 */
	public static final String $dlv_str_ln_cd = "dlv_str_ln_cd";
	private static final MCPermColumnInfo _dlv_str_ln_cd = createColumnInfo("dlv_str_ln_cd");
	public final MCStringPermColumn dlv_str_ln_cd = createStringColumn(_dlv_str_ln_cd);
	
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
	 * 納期回答数量. Order promising qty..<p>
	 *
	 */
	public static final String $prms_qty = "prms_qty";
	private static final MCPermColumnInfo _prms_qty = createColumnInfo("prms_qty");
	public final MCNumberPermColumn prms_qty = createNumberColumn(_prms_qty);
	
	/**
	 * 納入指示受領数量. Delivery order received qty..<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_qty = "dlv_inst_rcpt_qty";
	private static final MCPermColumnInfo _dlv_inst_rcpt_qty = createColumnInfo("dlv_inst_rcpt_qty");
	public final MCNumberPermColumn dlv_inst_rcpt_qty = createNumberColumn(_dlv_inst_rcpt_qty);
	
	/**
	 * 納入指示回答数量. Delivery order replied qty..<p>
	 *
	 */
	public static final String $dlv_inst_prms_qty = "dlv_inst_prms_qty";
	private static final MCPermColumnInfo _dlv_inst_prms_qty = createColumnInfo("dlv_inst_prms_qty");
	public final MCNumberPermColumn dlv_inst_prms_qty = createNumberColumn(_dlv_inst_prms_qty);
	
	/**
	 * 再出荷予定数量. Scheduled re-shipping qty..<p>
	 *
	 */
	public static final String $re_ship_schd_qty = "re_ship_schd_qty";
	private static final MCPermColumnInfo _re_ship_schd_qty = createColumnInfo("re_ship_schd_qty");
	public final MCNumberPermColumn re_ship_schd_qty = createNumberColumn(_re_ship_schd_qty);
	
	/**
	 * 出荷指図数量. Shipping order qty..<p>
	 *
	 */
	public static final String $ship_inst_qty = "ship_inst_qty";
	private static final MCPermColumnInfo _ship_inst_qty = createColumnInfo("ship_inst_qty");
	public final MCNumberPermColumn ship_inst_qty = createNumberColumn(_ship_inst_qty);
	
	/**
	 * 出荷実績数量. Shipping result qty..<p>
	 *
	 */
	public static final String $ship_act_qty = "ship_act_qty";
	private static final MCPermColumnInfo _ship_act_qty = createColumnInfo("ship_act_qty");
	public final MCNumberPermColumn ship_act_qty = createNumberColumn(_ship_act_qty);
	
	/**
	 * インボイス出荷予定数量. Invoice shipping scheduled qty..<p>
	 *
	 */
	public static final String $iv_schd_qty = "iv_schd_qty";
	private static final MCPermColumnInfo _iv_schd_qty = createColumnInfo("iv_schd_qty");
	public final MCNumberPermColumn iv_schd_qty = createNumberColumn(_iv_schd_qty);
	
	/**
	 * インボイス出荷実績数量. Invoice shipping result qty..<p>
	 *
	 */
	public static final String $iv_act_qty = "iv_act_qty";
	private static final MCPermColumnInfo _iv_act_qty = createColumnInfo("iv_act_qty");
	public final MCNumberPermColumn iv_act_qty = createNumberColumn(_iv_act_qty);
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public static final String $sls_qty = "sls_qty";
	private static final MCPermColumnInfo _sls_qty = createColumnInfo("sls_qty");
	public final MCNumberPermColumn sls_qty = createNumberColumn(_sls_qty);
	
	/**
	 * 納品数量. Delivery qty..<p>
	 *
	 */
	public static final String $dlv_qty = "dlv_qty";
	private static final MCPermColumnInfo _dlv_qty = createColumnInfo("dlv_qty");
	public final MCNumberPermColumn dlv_qty = createNumberColumn(_dlv_qty);
	
	/**
	 * 出荷返品数量. Shipping return qty..<p>
	 *
	 */
	public static final String $ship_ret_qty = "ship_ret_qty";
	private static final MCPermColumnInfo _ship_ret_qty = createColumnInfo("ship_ret_qty");
	public final MCNumberPermColumn ship_ret_qty = createNumberColumn(_ship_ret_qty);
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	private static final MCPermColumnInfo _abort_flg = createColumnInfo("abort_flg");
	public final MCBooleanPermColumn abort_flg = createBooleanColumn(_abort_flg);
	
	/**
	 * 出荷予定打切数量. Cancelled remaining shipping schedule qty..<p>
	 *
	 */
	public static final String $ship_schd_abort_qty = "ship_schd_abort_qty";
	private static final MCPermColumnInfo _ship_schd_abort_qty = createColumnInfo("ship_schd_abort_qty");
	public final MCNumberPermColumn ship_schd_abort_qty = createNumberColumn(_ship_schd_abort_qty);
	
	/**
	 * 売上予定打切数量. Cancelled remaining sales schedule qty..<p>
	 *
	 */
	public static final String $sls_schd_abort_qty = "sls_schd_abort_qty";
	private static final MCPermColumnInfo _sls_schd_abort_qty = createColumnInfo("sls_schd_abort_qty");
	public final MCNumberPermColumn sls_schd_abort_qty = createNumberColumn(_sls_schd_abort_qty);
	
	/**
	 * 納品ＬＴ. Delivery LT.<p>
	 *
	 */
	public static final String $act_dlv_lt = "act_dlv_lt";
	private static final MCPermColumnInfo _act_dlv_lt = createColumnInfo("act_dlv_lt");
	public final MCNumberPermColumn act_dlv_lt = createNumberColumn(_act_dlv_lt);
	
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
	 * 仕入直送ＦＬＧ. Direct delivery flg..<p>
	 *
	 */
	public static final String $purc_ddlv_flg = "purc_ddlv_flg";
	private static final MCPermColumnInfo _purc_ddlv_flg = createColumnInfo("purc_ddlv_flg");
	public final MCBooleanPermColumn purc_ddlv_flg = createBooleanColumn(_purc_ddlv_flg);
	
	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	private static final MCPermColumnInfo _ship_schd_split_typ = createColumnInfo("ship_schd_split_typ");
	public final MCStringPermColumn ship_schd_split_typ = createStringColumn(_ship_schd_split_typ);
	
	/**
	 * 引当範囲区分. Allocation range type.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	private static final MCPermColumnInfo _alloc_scope_typ = createColumnInfo("alloc_scope_typ");
	public final MCStringPermColumn alloc_scope_typ = createStringColumn(_alloc_scope_typ);
	
	/**
	 * 引当区分. Allocation type.<p>
	 *
	 */
	public static final String $alloc_typ = "alloc_typ";
	private static final MCPermColumnInfo _alloc_typ = createColumnInfo("alloc_typ");
	public final MCStringPermColumn alloc_typ = createStringColumn(_alloc_typ);
	
	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	private static final MCPermColumnInfo _alloc_grp_cd = createColumnInfo("alloc_grp_cd");
	public final MCStringPermColumn alloc_grp_cd = createStringColumn(_alloc_grp_cd);
	
	/**
	 * 出荷物流グループＣＤ. Shipping distribution group cd..<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	private static final MCPermColumnInfo _ship_lg_grp_cd = createColumnInfo("ship_lg_grp_cd");
	public final MCStringPermColumn ship_lg_grp_cd = createStringColumn(_ship_lg_grp_cd);
	
	/**
	 * デフォルト場所ＣＤ. Default location cd..<p>
	 *
	 */
	public static final String $def_loc_cd = "def_loc_cd";
	private static final MCPermColumnInfo _def_loc_cd = createColumnInfo("def_loc_cd");
	public final MCStringPermColumn def_loc_cd = createStringColumn(_def_loc_cd);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
	/**
	 * 引当期間保留ＦＬＧ. Allocation period pending flg..<p>
	 *
	 */
	public static final String $period_block_flg = "period_block_flg";
	private static final MCPermColumnInfo _period_block_flg = createColumnInfo("period_block_flg");
	public final MCBooleanPermColumn period_block_flg = createBooleanColumn(_period_block_flg);
	
	/**
	 * 販売状況区分. Sales status type.<p>
	 *
	 */
	public static final String $sls_sts_typ = "sls_sts_typ";
	private static final MCPermColumnInfo _sls_sts_typ = createColumnInfo("sls_sts_typ");
	public final MCStringPermColumn sls_sts_typ = createStringColumn(_sls_sts_typ);
	
	/**
	 * 回答納入日遅れＦＬＧ. Replied delivery date delay flg..<p>
	 *
	 */
	public static final String $prms_dlv_dt_overdue_flg = "prms_dlv_dt_overdue_flg";
	private static final MCPermColumnInfo _prms_dlv_dt_overdue_flg = createColumnInfo("prms_dlv_dt_overdue_flg");
	public final MCBooleanPermColumn prms_dlv_dt_overdue_flg = createBooleanColumn(_prms_dlv_dt_overdue_flg);
	
	/**
	 * 納入希望日遅れＦＬＧ. Delivery dates delayed flg..<p>
	 *
	 */
	public static final String $dlv_rqst_dt_overdue_flg = "dlv_rqst_dt_overdue_flg";
	private static final MCPermColumnInfo _dlv_rqst_dt_overdue_flg = createColumnInfo("dlv_rqst_dt_overdue_flg");
	public final MCBooleanPermColumn dlv_rqst_dt_overdue_flg = createBooleanColumn(_dlv_rqst_dt_overdue_flg);
	
	/**
	 * 出荷予定分割ＦＬＧ. Shipping schedule split flg..<p>
	 *
	 */
	public static final String $ship_schd_split_flg = "ship_schd_split_flg";
	private static final MCPermColumnInfo _ship_schd_split_flg = createColumnInfo("ship_schd_split_flg");
	public final MCBooleanPermColumn ship_schd_split_flg = createBooleanColumn(_ship_schd_split_flg);
	
	/**
	 * 出荷完了ＦＬＧ. Shipping completion flg..<p>
	 *
	 */
	public static final String $ship_cmpl_flg = "ship_cmpl_flg";
	private static final MCPermColumnInfo _ship_cmpl_flg = createColumnInfo("ship_cmpl_flg");
	public final MCBooleanPermColumn ship_cmpl_flg = createBooleanColumn(_ship_cmpl_flg);
	
	/**
	 * 売上完了ＦＬＧ. Sales completed flg..<p>
	 *
	 */
	public static final String $sls_cmpl_flg = "sls_cmpl_flg";
	private static final MCPermColumnInfo _sls_cmpl_flg = createColumnInfo("sls_cmpl_flg");
	public final MCBooleanPermColumn sls_cmpl_flg = createBooleanColumn(_sls_cmpl_flg);
	
	/**
	 * 納品完了ＦＬＧ. Delivery completion flg..<p>
	 *
	 */
	public static final String $dlv_cmpl_flg = "dlv_cmpl_flg";
	private static final MCPermColumnInfo _dlv_cmpl_flg = createColumnInfo("dlv_cmpl_flg");
	public final MCBooleanPermColumn dlv_cmpl_flg = createBooleanColumn(_dlv_cmpl_flg);
	
	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	private static final MCPermColumnInfo _ship_cnt_rmrks = createColumnInfo("ship_cnt_rmrks");
	public final MCStringPermColumn ship_cnt_rmrks = createStringColumn(_ship_cnt_rmrks);
	
	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	private static final MCPermColumnInfo _io_schd_pr_no = createColumnInfo("io_schd_pr_no");
	public final MCStringPermColumn io_schd_pr_no = createStringColumn(_io_schd_pr_no);
	
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
	 * 物流グループ混在不可ＦＬＧ. Prohibit mixed distribution group flg..<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	private static final MCPermColumnInfo _not_lg_mix_flg = createColumnInfo("not_lg_mix_flg");
	public final MCBooleanPermColumn not_lg_mix_flg = createBooleanColumn(_not_lg_mix_flg);
	
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ship_rqst_tm_META = createCommonMeta($ship_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta prms_dt_META = createCommonMeta($prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_dlv_dt_META = createCommonMeta($prms_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_rcpt_dt_META = createCommonMeta($dlv_inst_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_prms_dt_META = createCommonMeta($dlv_inst_prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_tm_META = createCommonMeta($ship_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_tm_META = createCommonMeta($dlv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sls_dt_META = createCommonMeta($sls_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_to_lg_grp_cd_META = createCommonMeta($ship_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_str_ln_cd_META = createCommonMeta($dlv_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
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
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta prms_qty_META = createCommonMeta($prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_inst_rcpt_qty_META = createCommonMeta($dlv_inst_rcpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_inst_prms_qty_META = createCommonMeta($dlv_inst_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta re_ship_schd_qty_META = createCommonMeta($re_ship_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_inst_qty_META = createCommonMeta($ship_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_act_qty_META = createCommonMeta($ship_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta iv_schd_qty_META = createCommonMeta($iv_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta iv_act_qty_META = createCommonMeta($iv_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_qty_META = createCommonMeta($sls_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_qty_META = createCommonMeta($dlv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_ret_qty_META = createCommonMeta($ship_ret_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_schd_abort_qty_META = createCommonMeta($ship_schd_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_schd_abort_qty_META = createCommonMeta($sls_schd_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta act_dlv_lt_META = createCommonMeta($act_dlv_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta purc_ddlv_flg_META = createCommonMeta($purc_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta alloc_typ_META = createCommonMeta($alloc_typ, mcframe.commonMA.meta.MA_META.ALLOC_TYP);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta def_loc_cd_META = createCommonMeta($def_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta period_block_flg_META = createCommonMeta($period_block_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_sts_typ_META = createCommonMeta($sls_sts_typ, mcframe.commonMS.meta.MS_META.SLS_STS_TYP);
	public static final MCMeta prms_dlv_dt_overdue_flg_META = createCommonMeta($prms_dlv_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_rqst_dt_overdue_flg_META = createCommonMeta($dlv_rqst_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_schd_split_flg_META = createCommonMeta($ship_schd_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_cmpl_flg_META = createCommonMeta($ship_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cmpl_flg_META = createCommonMeta($sls_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cmpl_flg_META = createCommonMeta($dlv_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_PR_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_PR_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_PR_SUB_CHAR3);
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
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MST_SHIP_PR_R> constMetas = new ConstMetaList<MST_SHIP_PR_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ship_pr_no_META,
			trd_cd_META,
			trd_ptn_typ_META,
			slo_d_no_META,
			xfr_schd_no_META,
			rqst_dpt_cd_META,
			rqst_usr_cd_META,
			cst_cd_META,
			ship_rqst_tm_META,
			dlv_rqst_tm_META,
			prms_dt_META,
			prms_dlv_dt_META,
			dlv_inst_rcpt_dt_META,
			dlv_inst_prms_dt_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			ship_tm_META,
			dlv_tm_META,
			sls_dt_META,
			ship_to_lg_grp_cd_META,
			dlv_id_typ_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_sundry_flg_META,
			dlv_str_ln_cd_META,
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
			trd_unit_qty_META,
			trd_unit_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			prms_qty_META,
			dlv_inst_rcpt_qty_META,
			dlv_inst_prms_qty_META,
			re_ship_schd_qty_META,
			ship_inst_qty_META,
			ship_act_qty_META,
			iv_schd_qty_META,
			iv_act_qty_META,
			sls_qty_META,
			dlv_qty_META,
			ship_ret_qty_META,
			abort_flg_META,
			ship_schd_abort_qty_META,
			sls_schd_abort_qty_META,
			act_dlv_lt_META,
			rsn_cd_META,
			bd_dpt_cd_META,
			ship_term_cd_META,
			ship_inst_typ_META,
			purc_ddlv_flg_META,
			ship_schd_split_typ_META,
			alloc_scope_typ_META,
			alloc_typ_META,
			alloc_grp_cd_META,
			ship_lg_grp_cd_META,
			def_loc_cd_META,
			loc_cd_META,
			str_ln_cd_META,
			period_block_flg_META,
			sls_sts_typ_META,
			prms_dlv_dt_overdue_flg_META,
			dlv_rqst_dt_overdue_flg_META,
			ship_schd_split_flg_META,
			ship_cmpl_flg_META,
			sls_cmpl_flg_META,
			dlv_cmpl_flg_META,
			ship_cnt_rmrks_META,
			io_schd_pr_no_META,
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
			not_lg_mix_flg_META
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
	protected MST_SHIP_PR_R(ConstMetaList<? extends MST_SHIP_PR_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_SHIP_PR_R(ConstMetaList<? extends MST_SHIP_PR_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_pr_no,
				"ship_pr_no",
				ship_pr_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$trd_cd,
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
			MST_SHIP_PR_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$trd_ptn_typ,
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
			MST_SHIP_PR_R.$slo_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$slo_d_no,
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
			MST_SHIP_PR_R.$xfr_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$xfr_schd_no,
				"xfr_schd_no",
				xfr_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$rqst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$rqst_dpt_cd,
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
			MST_SHIP_PR_R.$rqst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$rqst_usr_cd,
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
			MST_SHIP_PR_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$cst_cd,
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
			MST_SHIP_PR_R.$ship_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$ship_rqst_tm,
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
			MST_SHIP_PR_R.$dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$dlv_rqst_tm,
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
			MST_SHIP_PR_R.$prms_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$prms_dt,
				"prms_dt",
				prms_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$prms_dlv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$prms_dlv_dt,
				"prms_dlv_dt",
				prms_dlv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_inst_rcpt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$dlv_inst_rcpt_dt,
				"dlv_inst_rcpt_dt",
				dlv_inst_rcpt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_inst_prms_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$dlv_inst_prms_dt,
				"dlv_inst_prms_dt",
				dlv_inst_prms_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$ship_schd_tm,
				"ship_schd_tm",
				ship_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$dlv_schd_tm,
				"dlv_schd_tm",
				dlv_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$ship_tm,
				"ship_tm",
				ship_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$dlv_tm,
				"dlv_tm",
				dlv_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$sls_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SHIP_PR_R.$sls_dt,
				"sls_dt",
				sls_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_to_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_lg_grp_cd,
				"ship_to_lg_grp_cd",
				ship_to_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_id_typ,
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
			MST_SHIP_PR_R.$dlv_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_id_cd,
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
			MST_SHIP_PR_R.$dlv_id_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_id_nm,
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
			MST_SHIP_PR_R.$dlv_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_zip_cd,
				"dlv_zip_cd",
				dlv_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_addr1,
				"dlv_addr1",
				dlv_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_addr2,
				"dlv_addr2",
				dlv_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_addr3,
				"dlv_addr3",
				dlv_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_addr4,
				"dlv_addr4",
				dlv_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_cntct_dpt,
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
			MST_SHIP_PR_R.$dlv_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_cntct_psn,
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
			MST_SHIP_PR_R.$dlv_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_tel,
				"dlv_tel",
				dlv_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_fax,
				"dlv_fax",
				dlv_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$dlv_sundry_flg,
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
			MST_SHIP_PR_R.$dlv_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$dlv_str_ln_cd,
				"dlv_str_ln_cd",
				dlv_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_to_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_id_typ,
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
			MST_SHIP_PR_R.$ship_to_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_id_cd,
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
			MST_SHIP_PR_R.$ship_to_id_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_id_nm,
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
			MST_SHIP_PR_R.$ship_to_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_zip_cd,
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
			MST_SHIP_PR_R.$ship_to_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_addr1,
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
			MST_SHIP_PR_R.$ship_to_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_addr2,
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
			MST_SHIP_PR_R.$ship_to_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_addr3,
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
			MST_SHIP_PR_R.$ship_to_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_addr4,
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
			MST_SHIP_PR_R.$ship_to_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_cntct_dpt,
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
			MST_SHIP_PR_R.$ship_to_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_cntct_psn,
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
			MST_SHIP_PR_R.$ship_to_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_tel,
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
			MST_SHIP_PR_R.$ship_to_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_to_fax,
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
			MST_SHIP_PR_R.$ship_to_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$ship_to_sundry_flg,
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
			MST_SHIP_PR_R.$via_dlv_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$via_dlv_typ,
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
			MST_SHIP_PR_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$trd_unit_qty,
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
			MST_SHIP_PR_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$trd_unit_cd,
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
			MST_SHIP_PR_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$base_unit_qty,
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
			MST_SHIP_PR_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$base_unit_cd,
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
			MST_SHIP_PR_R.$prms_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$prms_qty,
				"prms_qty",
				prms_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_inst_rcpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$dlv_inst_rcpt_qty,
				"dlv_inst_rcpt_qty",
				dlv_inst_rcpt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_inst_prms_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$dlv_inst_prms_qty,
				"dlv_inst_prms_qty",
				dlv_inst_prms_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$re_ship_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$re_ship_schd_qty,
				"re_ship_schd_qty",
				re_ship_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$ship_inst_qty,
				"ship_inst_qty",
				ship_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$ship_act_qty,
				"ship_act_qty",
				ship_act_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$iv_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$iv_schd_qty,
				"iv_schd_qty",
				iv_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$iv_act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$iv_act_qty,
				"iv_act_qty",
				iv_act_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$sls_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$sls_qty,
				"sls_qty",
				sls_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$dlv_qty,
				"dlv_qty",
				dlv_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_ret_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$ship_ret_qty,
				"ship_ret_qty",
				ship_ret_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$abort_flg,
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
			MST_SHIP_PR_R.$ship_schd_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$ship_schd_abort_qty,
				"ship_schd_abort_qty",
				ship_schd_abort_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$sls_schd_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$sls_schd_abort_qty,
				"sls_schd_abort_qty",
				sls_schd_abort_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$act_dlv_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$act_dlv_lt,
				"act_dlv_lt",
				act_dlv_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$rsn_cd,
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
			MST_SHIP_PR_R.$bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$bd_dpt_cd,
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
			MST_SHIP_PR_R.$ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_term_cd,
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
			MST_SHIP_PR_R.$ship_inst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_inst_typ,
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
			MST_SHIP_PR_R.$purc_ddlv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$purc_ddlv_flg,
				"purc_ddlv_flg",
				purc_ddlv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_schd_split_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_schd_split_typ,
				"ship_schd_split_typ",
				ship_schd_split_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$alloc_scope_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$alloc_scope_typ,
				"alloc_scope_typ",
				alloc_scope_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$alloc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$alloc_typ,
				"alloc_typ",
				alloc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$alloc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$alloc_grp_cd,
				"alloc_grp_cd",
				alloc_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_lg_grp_cd,
				"ship_lg_grp_cd",
				ship_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$def_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$def_loc_cd,
				"def_loc_cd",
				def_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$loc_cd,
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
			MST_SHIP_PR_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$str_ln_cd,
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
			MST_SHIP_PR_R.$period_block_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$period_block_flg,
				"period_block_flg",
				period_block_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$sls_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$sls_sts_typ,
				"sls_sts_typ",
				sls_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$prms_dlv_dt_overdue_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$prms_dlv_dt_overdue_flg,
				"prms_dlv_dt_overdue_flg",
				prms_dlv_dt_overdue_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_rqst_dt_overdue_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$dlv_rqst_dt_overdue_flg,
				"dlv_rqst_dt_overdue_flg",
				dlv_rqst_dt_overdue_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_schd_split_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$ship_schd_split_flg,
				"ship_schd_split_flg",
				ship_schd_split_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$ship_cmpl_flg,
				"ship_cmpl_flg",
				ship_cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$sls_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$sls_cmpl_flg,
				"sls_cmpl_flg",
				sls_cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$dlv_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$dlv_cmpl_flg,
				"dlv_cmpl_flg",
				dlv_cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$ship_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ship_cnt_rmrks,
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
			MST_SHIP_PR_R.$io_schd_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$io_schd_pr_no,
				"io_schd_pr_no",
				io_schd_pr_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SHIP_PR_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$sub_char1,
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
			MST_SHIP_PR_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$sub_char2,
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
			MST_SHIP_PR_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$sub_char3,
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
			MST_SHIP_PR_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ins_usr_id,
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
			MST_SHIP_PR_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ins_usr_nm,
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
			MST_SHIP_PR_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SHIP_PR_R.$ins_ts,
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
			MST_SHIP_PR_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$ins_func_id,
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
			MST_SHIP_PR_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SHIP_PR_R.$upd_cntr,
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
			MST_SHIP_PR_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$upd_usr_id,
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
			MST_SHIP_PR_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$upd_usr_nm,
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
			MST_SHIP_PR_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SHIP_PR_R.$upd_ts,
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
			MST_SHIP_PR_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$upd_func_id,
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
			MST_SHIP_PR_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SHIP_PR_R.$upd_srv_req_no,
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
			MST_SHIP_PR_R.$not_lg_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SHIP_PR_R.$not_lg_mix_flg,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_SHIP_PR_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_SHIP_PR_R create(String alias) {
		MST_SHIP_PR_R row = new MST_SHIP_PR_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_SHIP_PR_R createByName(T proto) {
		MST_SHIP_PR_R row = MST_SHIP_PR_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SHIP_PR_R clone() {
		return (MST_SHIP_PR_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SHIP_PR_R createInstance() {
		return (MST_SHIP_PR_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SHIP_PR_R getValues(String... names) {
		return (MST_SHIP_PR_R) super.getValues(names);
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
	 public MSW_SHIP_PR_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_SHIP_PR_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_SHIP_PR_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_SHIP_PR_KEY_R.TABLE_NAME);
	 }

	/**
	 * 出荷進捗ＮＯ. Shipping progress No..<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 0, $ship_pr_no);
	}

	/**
	 * 出荷進捗ＮＯ. Shipping progress No..<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 0, $ship_pr_no, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 1, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 1, $trd_cd, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 2, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 2, $trd_ptn_typ, value);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 3, $slo_d_no);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 3, $slo_d_no, value);
	}

	/**
	 * 移動・移送予定ＮＯ. Movement/transport schedule No..<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 4, $xfr_schd_no);
	}

	/**
	 * 移動・移送予定ＮＯ. Movement/transport schedule No..<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 4, $xfr_schd_no, value);
	}

	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 5, $rqst_dpt_cd);
	}

	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 5, $rqst_dpt_cd, value);
	}

	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 6, $rqst_usr_cd);
	}

	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 6, $rqst_usr_cd, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 7, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 7, $cst_cd, value);
	}

	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public MCDate ship_rqst_tm() {
		return getConstDate(offset + 8, $ship_rqst_tm);
	}

	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public void ship_rqst_tm(MCDate value) {
		setConstDate(offset + 8, $ship_rqst_tm, value);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 9, $dlv_rqst_tm);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 9, $dlv_rqst_tm, value);
	}

	/**
	 * 納期回答日. order promising date.<p>
	 *
	 */
	public MCDate prms_dt() {
		return getConstDate(offset + 10, $prms_dt);
	}

	/**
	 * 納期回答日. order promising date.<p>
	 *
	 */
	public void prms_dt(MCDate value) {
		setConstDate(offset + 10, $prms_dt, value);
	}

	/**
	 * 回答納入日. Replied delivery date.<p>
	 *
	 */
	public MCDate prms_dlv_dt() {
		return getConstDate(offset + 11, $prms_dlv_dt);
	}

	/**
	 * 回答納入日. Replied delivery date.<p>
	 *
	 */
	public void prms_dlv_dt(MCDate value) {
		setConstDate(offset + 11, $prms_dlv_dt, value);
	}

	/**
	 * 納入指示受領日. Delivery order received date.<p>
	 *
	 */
	public MCDate dlv_inst_rcpt_dt() {
		return getConstDate(offset + 12, $dlv_inst_rcpt_dt);
	}

	/**
	 * 納入指示受領日. Delivery order received date.<p>
	 *
	 */
	public void dlv_inst_rcpt_dt(MCDate value) {
		setConstDate(offset + 12, $dlv_inst_rcpt_dt, value);
	}

	/**
	 * 納入指示回答日. Delivery order replied date.<p>
	 *
	 */
	public MCDate dlv_inst_prms_dt() {
		return getConstDate(offset + 13, $dlv_inst_prms_dt);
	}

	/**
	 * 納入指示回答日. Delivery order replied date.<p>
	 *
	 */
	public void dlv_inst_prms_dt(MCDate value) {
		setConstDate(offset + 13, $dlv_inst_prms_dt, value);
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
	 * 出荷日時. Shipping date and time.<p>
	 *
	 */
	public MCDate ship_tm() {
		return getConstDate(offset + 16, $ship_tm);
	}

	/**
	 * 出荷日時. Shipping date and time.<p>
	 *
	 */
	public void ship_tm(MCDate value) {
		setConstDate(offset + 16, $ship_tm, value);
	}

	/**
	 * 納品日時. Delivery date and time.<p>
	 *
	 */
	public MCDate dlv_tm() {
		return getConstDate(offset + 17, $dlv_tm);
	}

	/**
	 * 納品日時. Delivery date and time.<p>
	 *
	 */
	public void dlv_tm(MCDate value) {
		setConstDate(offset + 17, $dlv_tm, value);
	}

	/**
	 * 売上日. Sales date.<p>
	 *
	 */
	public MCDate sls_dt() {
		return getConstDate(offset + 18, $sls_dt);
	}

	/**
	 * 売上日. Sales date.<p>
	 *
	 */
	public void sls_dt(MCDate value) {
		setConstDate(offset + 18, $sls_dt, value);
	}

	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return getConstString(offset + 19, $ship_to_lg_grp_cd);
	}

	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		setConstString(offset + 19, $ship_to_lg_grp_cd, value);
	}

	/**
	 * 納品先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 20, $dlv_id_typ);
	}

	/**
	 * 納品先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 20, $dlv_id_typ, value);
	}

	/**
	 * 納品先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 21, $dlv_id_cd);
	}

	/**
	 * 納品先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 21, $dlv_id_cd, value);
	}

	/**
	 * 納品先識別名. Delivery destination identification name.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 22, $dlv_id_nm);
	}

	/**
	 * 納品先識別名. Delivery destination identification name.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 22, $dlv_id_nm, value);
	}

	/**
	 * 納品先郵便番号. Zip code (Delivery destination).<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 23, $dlv_zip_cd);
	}

	/**
	 * 納品先郵便番号. Zip code (Delivery destination).<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 23, $dlv_zip_cd, value);
	}

	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 24, $dlv_addr1);
	}

	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 24, $dlv_addr1, value);
	}

	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 25, $dlv_addr2);
	}

	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 25, $dlv_addr2, value);
	}

	/**
	 * 納品先住所３. Address 3 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 26, $dlv_addr3);
	}

	/**
	 * 納品先住所３. Address 3 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 26, $dlv_addr3, value);
	}

	/**
	 * 納品先住所４. Address 4 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 27, $dlv_addr4);
	}

	/**
	 * 納品先住所４. Address 4 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 27, $dlv_addr4, value);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 28, $dlv_cntct_dpt);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 28, $dlv_cntct_dpt, value);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 29, $dlv_cntct_psn);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 29, $dlv_cntct_psn, value);
	}

	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 30, $dlv_tel);
	}

	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 30, $dlv_tel, value);
	}

	/**
	 * 納品先ＦＡＸ. FAX (Delivery destination).<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 31, $dlv_fax);
	}

	/**
	 * 納品先ＦＡＸ. FAX (Delivery destination).<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 31, $dlv_fax, value);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 32, $dlv_sundry_flg);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 32, $dlv_sundry_flg, value);
	}

	/**
	 * 納品棚・ラインＣＤ. Delivery rack/line cd..<p>
	 *
	 */
	public String dlv_str_ln_cd() {
		return getConstString(offset + 33, $dlv_str_ln_cd);
	}

	/**
	 * 納品棚・ラインＣＤ. Delivery rack/line cd..<p>
	 *
	 */
	public void dlv_str_ln_cd(String value) {
		setConstString(offset + 33, $dlv_str_ln_cd, value);
	}

	/**
	 * 送付先識別区分. Receiving point identification type.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 34, $ship_to_id_typ);
	}

	/**
	 * 送付先識別区分. Receiving point identification type.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 34, $ship_to_id_typ, value);
	}

	/**
	 * 送付先識別ＣＤ. Receiving point identification cd..<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 35, $ship_to_id_cd);
	}

	/**
	 * 送付先識別ＣＤ. Receiving point identification cd..<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 35, $ship_to_id_cd, value);
	}

	/**
	 * 送付先識別名. Receiving point Identification name.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 36, $ship_to_id_nm);
	}

	/**
	 * 送付先識別名. Receiving point Identification name.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 36, $ship_to_id_nm, value);
	}

	/**
	 * 送付先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return getConstString(offset + 37, $ship_to_zip_cd);
	}

	/**
	 * 送付先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		setConstString(offset + 37, $ship_to_zip_cd, value);
	}

	/**
	 * 送付先住所１. Receiving point address 1.<p>
	 *
	 */
	public String ship_to_addr1() {
		return getConstString(offset + 38, $ship_to_addr1);
	}

	/**
	 * 送付先住所１. Receiving point address 1.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		setConstString(offset + 38, $ship_to_addr1, value);
	}

	/**
	 * 送付先住所２. Receiving point address 2.<p>
	 *
	 */
	public String ship_to_addr2() {
		return getConstString(offset + 39, $ship_to_addr2);
	}

	/**
	 * 送付先住所２. Receiving point address 2.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		setConstString(offset + 39, $ship_to_addr2, value);
	}

	/**
	 * 送付先住所３. Receiving point address 3.<p>
	 *
	 */
	public String ship_to_addr3() {
		return getConstString(offset + 40, $ship_to_addr3);
	}

	/**
	 * 送付先住所３. Receiving point address 3.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		setConstString(offset + 40, $ship_to_addr3, value);
	}

	/**
	 * 送付先住所４. Receiving point address 4.<p>
	 *
	 */
	public String ship_to_addr4() {
		return getConstString(offset + 41, $ship_to_addr4);
	}

	/**
	 * 送付先住所４. Receiving point address 4.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		setConstString(offset + 41, $ship_to_addr4, value);
	}

	/**
	 * 送付先部署. Receiving point dept..<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return getConstString(offset + 42, $ship_to_cntct_dpt);
	}

	/**
	 * 送付先部署. Receiving point dept..<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		setConstString(offset + 42, $ship_to_cntct_dpt, value);
	}

	/**
	 * 送付先担当者. Receiving point PIC.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return getConstString(offset + 43, $ship_to_cntct_psn);
	}

	/**
	 * 送付先担当者. Receiving point PIC.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		setConstString(offset + 43, $ship_to_cntct_psn, value);
	}

	/**
	 * 送付先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public String ship_to_tel() {
		return getConstString(offset + 44, $ship_to_tel);
	}

	/**
	 * 送付先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		setConstString(offset + 44, $ship_to_tel, value);
	}

	/**
	 * 送付先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public String ship_to_fax() {
		return getConstString(offset + 45, $ship_to_fax);
	}

	/**
	 * 送付先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		setConstString(offset + 45, $ship_to_fax, value);
	}

	/**
	 * 送付先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 46, $ship_to_sundry_flg);
	}

	/**
	 * 送付先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 46, $ship_to_sundry_flg, value);
	}

	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 47, $via_dlv_typ);
	}

	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 47, $via_dlv_typ, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 48, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 49, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 49, $trd_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 50, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 50, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 50, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 50, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 50, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 50, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 51, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 51, $base_unit_cd, value);
	}

	/**
	 * 納期回答数量. Order promising qty..<p>
	 *
	 */
	public MCNumber prms_qty() {
		return getConstNumber(offset + 52, $prms_qty);
	}

	/**
	 * 納期回答数量. Order promising qty..<p>
	 *
	 */
	public void prms_qty(MCNumber value) {
		setConstNumber(offset + 52, $prms_qty, value);
	}
	
	/**
	 * 納期回答数量. Order promising qty..<p>
	 *
	 */
	public void prms_qty(int value) {
		setConstNumber(offset + 52, $prms_qty, value);
	}
	
	/**
	 * 納期回答数量. Order promising qty..<p>
	 *
	 */
	public void prms_qty(long value) {
		setConstNumber(offset + 52, $prms_qty, value);
	}
	
	/**
	 * 納期回答数量. Order promising qty..<p>
	 *
	 */
	public void prms_qty(float value) {
		setConstNumber(offset + 52, $prms_qty, value);
	}
	
	/**
	 * 納期回答数量. Order promising qty..<p>
	 *
	 */
	public void prms_qty(double value) {
		setConstNumber(offset + 52, $prms_qty, value);
	}
	
	/**
	 * 納入指示受領数量. Delivery order received qty..<p>
	 *
	 */
	public MCNumber dlv_inst_rcpt_qty() {
		return getConstNumber(offset + 53, $dlv_inst_rcpt_qty);
	}

	/**
	 * 納入指示受領数量. Delivery order received qty..<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(MCNumber value) {
		setConstNumber(offset + 53, $dlv_inst_rcpt_qty, value);
	}
	
	/**
	 * 納入指示受領数量. Delivery order received qty..<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(int value) {
		setConstNumber(offset + 53, $dlv_inst_rcpt_qty, value);
	}
	
	/**
	 * 納入指示受領数量. Delivery order received qty..<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(long value) {
		setConstNumber(offset + 53, $dlv_inst_rcpt_qty, value);
	}
	
	/**
	 * 納入指示受領数量. Delivery order received qty..<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(float value) {
		setConstNumber(offset + 53, $dlv_inst_rcpt_qty, value);
	}
	
	/**
	 * 納入指示受領数量. Delivery order received qty..<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(double value) {
		setConstNumber(offset + 53, $dlv_inst_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答数量. Delivery order replied qty..<p>
	 *
	 */
	public MCNumber dlv_inst_prms_qty() {
		return getConstNumber(offset + 54, $dlv_inst_prms_qty);
	}

	/**
	 * 納入指示回答数量. Delivery order replied qty..<p>
	 *
	 */
	public void dlv_inst_prms_qty(MCNumber value) {
		setConstNumber(offset + 54, $dlv_inst_prms_qty, value);
	}
	
	/**
	 * 納入指示回答数量. Delivery order replied qty..<p>
	 *
	 */
	public void dlv_inst_prms_qty(int value) {
		setConstNumber(offset + 54, $dlv_inst_prms_qty, value);
	}
	
	/**
	 * 納入指示回答数量. Delivery order replied qty..<p>
	 *
	 */
	public void dlv_inst_prms_qty(long value) {
		setConstNumber(offset + 54, $dlv_inst_prms_qty, value);
	}
	
	/**
	 * 納入指示回答数量. Delivery order replied qty..<p>
	 *
	 */
	public void dlv_inst_prms_qty(float value) {
		setConstNumber(offset + 54, $dlv_inst_prms_qty, value);
	}
	
	/**
	 * 納入指示回答数量. Delivery order replied qty..<p>
	 *
	 */
	public void dlv_inst_prms_qty(double value) {
		setConstNumber(offset + 54, $dlv_inst_prms_qty, value);
	}
	
	/**
	 * 再出荷予定数量. Scheduled re-shipping qty..<p>
	 *
	 */
	public MCNumber re_ship_schd_qty() {
		return getConstNumber(offset + 55, $re_ship_schd_qty);
	}

	/**
	 * 再出荷予定数量. Scheduled re-shipping qty..<p>
	 *
	 */
	public void re_ship_schd_qty(MCNumber value) {
		setConstNumber(offset + 55, $re_ship_schd_qty, value);
	}
	
	/**
	 * 再出荷予定数量. Scheduled re-shipping qty..<p>
	 *
	 */
	public void re_ship_schd_qty(int value) {
		setConstNumber(offset + 55, $re_ship_schd_qty, value);
	}
	
	/**
	 * 再出荷予定数量. Scheduled re-shipping qty..<p>
	 *
	 */
	public void re_ship_schd_qty(long value) {
		setConstNumber(offset + 55, $re_ship_schd_qty, value);
	}
	
	/**
	 * 再出荷予定数量. Scheduled re-shipping qty..<p>
	 *
	 */
	public void re_ship_schd_qty(float value) {
		setConstNumber(offset + 55, $re_ship_schd_qty, value);
	}
	
	/**
	 * 再出荷予定数量. Scheduled re-shipping qty..<p>
	 *
	 */
	public void re_ship_schd_qty(double value) {
		setConstNumber(offset + 55, $re_ship_schd_qty, value);
	}
	
	/**
	 * 出荷指図数量. Shipping order qty..<p>
	 *
	 */
	public MCNumber ship_inst_qty() {
		return getConstNumber(offset + 56, $ship_inst_qty);
	}

	/**
	 * 出荷指図数量. Shipping order qty..<p>
	 *
	 */
	public void ship_inst_qty(MCNumber value) {
		setConstNumber(offset + 56, $ship_inst_qty, value);
	}
	
	/**
	 * 出荷指図数量. Shipping order qty..<p>
	 *
	 */
	public void ship_inst_qty(int value) {
		setConstNumber(offset + 56, $ship_inst_qty, value);
	}
	
	/**
	 * 出荷指図数量. Shipping order qty..<p>
	 *
	 */
	public void ship_inst_qty(long value) {
		setConstNumber(offset + 56, $ship_inst_qty, value);
	}
	
	/**
	 * 出荷指図数量. Shipping order qty..<p>
	 *
	 */
	public void ship_inst_qty(float value) {
		setConstNumber(offset + 56, $ship_inst_qty, value);
	}
	
	/**
	 * 出荷指図数量. Shipping order qty..<p>
	 *
	 */
	public void ship_inst_qty(double value) {
		setConstNumber(offset + 56, $ship_inst_qty, value);
	}
	
	/**
	 * 出荷実績数量. Shipping result qty..<p>
	 *
	 */
	public MCNumber ship_act_qty() {
		return getConstNumber(offset + 57, $ship_act_qty);
	}

	/**
	 * 出荷実績数量. Shipping result qty..<p>
	 *
	 */
	public void ship_act_qty(MCNumber value) {
		setConstNumber(offset + 57, $ship_act_qty, value);
	}
	
	/**
	 * 出荷実績数量. Shipping result qty..<p>
	 *
	 */
	public void ship_act_qty(int value) {
		setConstNumber(offset + 57, $ship_act_qty, value);
	}
	
	/**
	 * 出荷実績数量. Shipping result qty..<p>
	 *
	 */
	public void ship_act_qty(long value) {
		setConstNumber(offset + 57, $ship_act_qty, value);
	}
	
	/**
	 * 出荷実績数量. Shipping result qty..<p>
	 *
	 */
	public void ship_act_qty(float value) {
		setConstNumber(offset + 57, $ship_act_qty, value);
	}
	
	/**
	 * 出荷実績数量. Shipping result qty..<p>
	 *
	 */
	public void ship_act_qty(double value) {
		setConstNumber(offset + 57, $ship_act_qty, value);
	}
	
	/**
	 * インボイス出荷予定数量. Invoice shipping scheduled qty..<p>
	 *
	 */
	public MCNumber iv_schd_qty() {
		return getConstNumber(offset + 58, $iv_schd_qty);
	}

	/**
	 * インボイス出荷予定数量. Invoice shipping scheduled qty..<p>
	 *
	 */
	public void iv_schd_qty(MCNumber value) {
		setConstNumber(offset + 58, $iv_schd_qty, value);
	}
	
	/**
	 * インボイス出荷予定数量. Invoice shipping scheduled qty..<p>
	 *
	 */
	public void iv_schd_qty(int value) {
		setConstNumber(offset + 58, $iv_schd_qty, value);
	}
	
	/**
	 * インボイス出荷予定数量. Invoice shipping scheduled qty..<p>
	 *
	 */
	public void iv_schd_qty(long value) {
		setConstNumber(offset + 58, $iv_schd_qty, value);
	}
	
	/**
	 * インボイス出荷予定数量. Invoice shipping scheduled qty..<p>
	 *
	 */
	public void iv_schd_qty(float value) {
		setConstNumber(offset + 58, $iv_schd_qty, value);
	}
	
	/**
	 * インボイス出荷予定数量. Invoice shipping scheduled qty..<p>
	 *
	 */
	public void iv_schd_qty(double value) {
		setConstNumber(offset + 58, $iv_schd_qty, value);
	}
	
	/**
	 * インボイス出荷実績数量. Invoice shipping result qty..<p>
	 *
	 */
	public MCNumber iv_act_qty() {
		return getConstNumber(offset + 59, $iv_act_qty);
	}

	/**
	 * インボイス出荷実績数量. Invoice shipping result qty..<p>
	 *
	 */
	public void iv_act_qty(MCNumber value) {
		setConstNumber(offset + 59, $iv_act_qty, value);
	}
	
	/**
	 * インボイス出荷実績数量. Invoice shipping result qty..<p>
	 *
	 */
	public void iv_act_qty(int value) {
		setConstNumber(offset + 59, $iv_act_qty, value);
	}
	
	/**
	 * インボイス出荷実績数量. Invoice shipping result qty..<p>
	 *
	 */
	public void iv_act_qty(long value) {
		setConstNumber(offset + 59, $iv_act_qty, value);
	}
	
	/**
	 * インボイス出荷実績数量. Invoice shipping result qty..<p>
	 *
	 */
	public void iv_act_qty(float value) {
		setConstNumber(offset + 59, $iv_act_qty, value);
	}
	
	/**
	 * インボイス出荷実績数量. Invoice shipping result qty..<p>
	 *
	 */
	public void iv_act_qty(double value) {
		setConstNumber(offset + 59, $iv_act_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public MCNumber sls_qty() {
		return getConstNumber(offset + 60, $sls_qty);
	}

	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		setConstNumber(offset + 60, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(int value) {
		setConstNumber(offset + 60, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(long value) {
		setConstNumber(offset + 60, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(float value) {
		setConstNumber(offset + 60, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(double value) {
		setConstNumber(offset + 60, $sls_qty, value);
	}
	
	/**
	 * 納品数量. Delivery qty..<p>
	 *
	 */
	public MCNumber dlv_qty() {
		return getConstNumber(offset + 61, $dlv_qty);
	}

	/**
	 * 納品数量. Delivery qty..<p>
	 *
	 */
	public void dlv_qty(MCNumber value) {
		setConstNumber(offset + 61, $dlv_qty, value);
	}
	
	/**
	 * 納品数量. Delivery qty..<p>
	 *
	 */
	public void dlv_qty(int value) {
		setConstNumber(offset + 61, $dlv_qty, value);
	}
	
	/**
	 * 納品数量. Delivery qty..<p>
	 *
	 */
	public void dlv_qty(long value) {
		setConstNumber(offset + 61, $dlv_qty, value);
	}
	
	/**
	 * 納品数量. Delivery qty..<p>
	 *
	 */
	public void dlv_qty(float value) {
		setConstNumber(offset + 61, $dlv_qty, value);
	}
	
	/**
	 * 納品数量. Delivery qty..<p>
	 *
	 */
	public void dlv_qty(double value) {
		setConstNumber(offset + 61, $dlv_qty, value);
	}
	
	/**
	 * 出荷返品数量. Shipping return qty..<p>
	 *
	 */
	public MCNumber ship_ret_qty() {
		return getConstNumber(offset + 62, $ship_ret_qty);
	}

	/**
	 * 出荷返品数量. Shipping return qty..<p>
	 *
	 */
	public void ship_ret_qty(MCNumber value) {
		setConstNumber(offset + 62, $ship_ret_qty, value);
	}
	
	/**
	 * 出荷返品数量. Shipping return qty..<p>
	 *
	 */
	public void ship_ret_qty(int value) {
		setConstNumber(offset + 62, $ship_ret_qty, value);
	}
	
	/**
	 * 出荷返品数量. Shipping return qty..<p>
	 *
	 */
	public void ship_ret_qty(long value) {
		setConstNumber(offset + 62, $ship_ret_qty, value);
	}
	
	/**
	 * 出荷返品数量. Shipping return qty..<p>
	 *
	 */
	public void ship_ret_qty(float value) {
		setConstNumber(offset + 62, $ship_ret_qty, value);
	}
	
	/**
	 * 出荷返品数量. Shipping return qty..<p>
	 *
	 */
	public void ship_ret_qty(double value) {
		setConstNumber(offset + 62, $ship_ret_qty, value);
	}
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 63, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 63, $abort_flg, value);
	}

	/**
	 * 出荷予定打切数量. Cancelled remaining shipping schedule qty..<p>
	 *
	 */
	public MCNumber ship_schd_abort_qty() {
		return getConstNumber(offset + 64, $ship_schd_abort_qty);
	}

	/**
	 * 出荷予定打切数量. Cancelled remaining shipping schedule qty..<p>
	 *
	 */
	public void ship_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 64, $ship_schd_abort_qty, value);
	}
	
	/**
	 * 出荷予定打切数量. Cancelled remaining shipping schedule qty..<p>
	 *
	 */
	public void ship_schd_abort_qty(int value) {
		setConstNumber(offset + 64, $ship_schd_abort_qty, value);
	}
	
	/**
	 * 出荷予定打切数量. Cancelled remaining shipping schedule qty..<p>
	 *
	 */
	public void ship_schd_abort_qty(long value) {
		setConstNumber(offset + 64, $ship_schd_abort_qty, value);
	}
	
	/**
	 * 出荷予定打切数量. Cancelled remaining shipping schedule qty..<p>
	 *
	 */
	public void ship_schd_abort_qty(float value) {
		setConstNumber(offset + 64, $ship_schd_abort_qty, value);
	}
	
	/**
	 * 出荷予定打切数量. Cancelled remaining shipping schedule qty..<p>
	 *
	 */
	public void ship_schd_abort_qty(double value) {
		setConstNumber(offset + 64, $ship_schd_abort_qty, value);
	}
	
	/**
	 * 売上予定打切数量. Cancelled remaining sales schedule qty..<p>
	 *
	 */
	public MCNumber sls_schd_abort_qty() {
		return getConstNumber(offset + 65, $sls_schd_abort_qty);
	}

	/**
	 * 売上予定打切数量. Cancelled remaining sales schedule qty..<p>
	 *
	 */
	public void sls_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 65, $sls_schd_abort_qty, value);
	}
	
	/**
	 * 売上予定打切数量. Cancelled remaining sales schedule qty..<p>
	 *
	 */
	public void sls_schd_abort_qty(int value) {
		setConstNumber(offset + 65, $sls_schd_abort_qty, value);
	}
	
	/**
	 * 売上予定打切数量. Cancelled remaining sales schedule qty..<p>
	 *
	 */
	public void sls_schd_abort_qty(long value) {
		setConstNumber(offset + 65, $sls_schd_abort_qty, value);
	}
	
	/**
	 * 売上予定打切数量. Cancelled remaining sales schedule qty..<p>
	 *
	 */
	public void sls_schd_abort_qty(float value) {
		setConstNumber(offset + 65, $sls_schd_abort_qty, value);
	}
	
	/**
	 * 売上予定打切数量. Cancelled remaining sales schedule qty..<p>
	 *
	 */
	public void sls_schd_abort_qty(double value) {
		setConstNumber(offset + 65, $sls_schd_abort_qty, value);
	}
	
	/**
	 * 納品ＬＴ. Delivery LT.<p>
	 *
	 */
	public MCNumber act_dlv_lt() {
		return getConstNumber(offset + 66, $act_dlv_lt);
	}

	/**
	 * 納品ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_dlv_lt(MCNumber value) {
		setConstNumber(offset + 66, $act_dlv_lt, value);
	}
	
	/**
	 * 納品ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_dlv_lt(int value) {
		setConstNumber(offset + 66, $act_dlv_lt, value);
	}
	
	/**
	 * 納品ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_dlv_lt(long value) {
		setConstNumber(offset + 66, $act_dlv_lt, value);
	}
	
	/**
	 * 納品ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_dlv_lt(float value) {
		setConstNumber(offset + 66, $act_dlv_lt, value);
	}
	
	/**
	 * 納品ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_dlv_lt(double value) {
		setConstNumber(offset + 66, $act_dlv_lt, value);
	}
	
	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 67, $rsn_cd);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 67, $rsn_cd, value);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 68, $bd_dpt_cd);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 68, $bd_dpt_cd, value);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 69, $ship_term_cd);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 69, $ship_term_cd, value);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 70, $ship_inst_typ);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 70, $ship_inst_typ, value);
	}

	/**
	 * 仕入直送ＦＬＧ. Direct delivery flg..<p>
	 *
	 */
	public boolean purc_ddlv_flg() {
		return getConstBoolean(offset + 71, $purc_ddlv_flg);
	}

	/**
	 * 仕入直送ＦＬＧ. Direct delivery flg..<p>
	 *
	 */
	public void purc_ddlv_flg(boolean value) {
		setConstBoolean(offset + 71, $purc_ddlv_flg, value);
	}

	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 72, $ship_schd_split_typ);
	}

	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 72, $ship_schd_split_typ, value);
	}

	/**
	 * 引当範囲区分. Allocation range type.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 73, $alloc_scope_typ);
	}

	/**
	 * 引当範囲区分. Allocation range type.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 73, $alloc_scope_typ, value);
	}

	/**
	 * 引当区分. Allocation type.<p>
	 *
	 */
	public String alloc_typ() {
		return getConstString(offset + 74, $alloc_typ);
	}

	/**
	 * 引当区分. Allocation type.<p>
	 *
	 */
	public void alloc_typ(String value) {
		setConstString(offset + 74, $alloc_typ, value);
	}

	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 75, $alloc_grp_cd);
	}

	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 75, $alloc_grp_cd, value);
	}

	/**
	 * 出荷物流グループＣＤ. Shipping distribution group cd..<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 76, $ship_lg_grp_cd);
	}

	/**
	 * 出荷物流グループＣＤ. Shipping distribution group cd..<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 76, $ship_lg_grp_cd, value);
	}

	/**
	 * デフォルト場所ＣＤ. Default location cd..<p>
	 *
	 */
	public String def_loc_cd() {
		return getConstString(offset + 77, $def_loc_cd);
	}

	/**
	 * デフォルト場所ＣＤ. Default location cd..<p>
	 *
	 */
	public void def_loc_cd(String value) {
		setConstString(offset + 77, $def_loc_cd, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 78, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 78, $loc_cd, value);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 79, $str_ln_cd);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 79, $str_ln_cd, value);
	}

	/**
	 * 引当期間保留ＦＬＧ. Allocation period pending flg..<p>
	 *
	 */
	public boolean period_block_flg() {
		return getConstBoolean(offset + 80, $period_block_flg);
	}

	/**
	 * 引当期間保留ＦＬＧ. Allocation period pending flg..<p>
	 *
	 */
	public void period_block_flg(boolean value) {
		setConstBoolean(offset + 80, $period_block_flg, value);
	}

	/**
	 * 販売状況区分. Sales status type.<p>
	 *
	 */
	public String sls_sts_typ() {
		return getConstString(offset + 81, $sls_sts_typ);
	}

	/**
	 * 販売状況区分. Sales status type.<p>
	 *
	 */
	public void sls_sts_typ(String value) {
		setConstString(offset + 81, $sls_sts_typ, value);
	}

	/**
	 * 回答納入日遅れＦＬＧ. Replied delivery date delay flg..<p>
	 *
	 */
	public boolean prms_dlv_dt_overdue_flg() {
		return getConstBoolean(offset + 82, $prms_dlv_dt_overdue_flg);
	}

	/**
	 * 回答納入日遅れＦＬＧ. Replied delivery date delay flg..<p>
	 *
	 */
	public void prms_dlv_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 82, $prms_dlv_dt_overdue_flg, value);
	}

	/**
	 * 納入希望日遅れＦＬＧ. Delivery dates delayed flg..<p>
	 *
	 */
	public boolean dlv_rqst_dt_overdue_flg() {
		return getConstBoolean(offset + 83, $dlv_rqst_dt_overdue_flg);
	}

	/**
	 * 納入希望日遅れＦＬＧ. Delivery dates delayed flg..<p>
	 *
	 */
	public void dlv_rqst_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 83, $dlv_rqst_dt_overdue_flg, value);
	}

	/**
	 * 出荷予定分割ＦＬＧ. Shipping schedule split flg..<p>
	 *
	 */
	public boolean ship_schd_split_flg() {
		return getConstBoolean(offset + 84, $ship_schd_split_flg);
	}

	/**
	 * 出荷予定分割ＦＬＧ. Shipping schedule split flg..<p>
	 *
	 */
	public void ship_schd_split_flg(boolean value) {
		setConstBoolean(offset + 84, $ship_schd_split_flg, value);
	}

	/**
	 * 出荷完了ＦＬＧ. Shipping completion flg..<p>
	 *
	 */
	public boolean ship_cmpl_flg() {
		return getConstBoolean(offset + 85, $ship_cmpl_flg);
	}

	/**
	 * 出荷完了ＦＬＧ. Shipping completion flg..<p>
	 *
	 */
	public void ship_cmpl_flg(boolean value) {
		setConstBoolean(offset + 85, $ship_cmpl_flg, value);
	}

	/**
	 * 売上完了ＦＬＧ. Sales completed flg..<p>
	 *
	 */
	public boolean sls_cmpl_flg() {
		return getConstBoolean(offset + 86, $sls_cmpl_flg);
	}

	/**
	 * 売上完了ＦＬＧ. Sales completed flg..<p>
	 *
	 */
	public void sls_cmpl_flg(boolean value) {
		setConstBoolean(offset + 86, $sls_cmpl_flg, value);
	}

	/**
	 * 納品完了ＦＬＧ. Delivery completion flg..<p>
	 *
	 */
	public boolean dlv_cmpl_flg() {
		return getConstBoolean(offset + 87, $dlv_cmpl_flg);
	}

	/**
	 * 納品完了ＦＬＧ. Delivery completion flg..<p>
	 *
	 */
	public void dlv_cmpl_flg(boolean value) {
		setConstBoolean(offset + 87, $dlv_cmpl_flg, value);
	}

	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 88, $ship_cnt_rmrks);
	}

	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 88, $ship_cnt_rmrks, value);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 89, $io_schd_pr_no);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 89, $io_schd_pr_no, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 90, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 90, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 91, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 91, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 92, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 92, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 93, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 93, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 94, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 94, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 95, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 95, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 96, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 96, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 97, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 97, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 97, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 97, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 97, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 97, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 98, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 98, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 99, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 99, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 100, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 100, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 101, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 101, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 102, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 102, $upd_srv_req_no, value);
	}

	/**
	 * 物流グループ混在不可ＦＬＧ. Prohibit mixed distribution group flg..<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 103, $not_lg_mix_flg);
	}

	/**
	 * 物流グループ混在不可ＦＬＧ. Prohibit mixed distribution group flg..<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 103, $not_lg_mix_flg, value);
	}

	public String getString(String name) {
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			return dlv_str_ln_cd();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			return def_loc_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($sls_sts_typ.equalsIgnoreCase(name)) {
			return sls_sts_typ();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			return prms_qty();
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_qty();
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			return dlv_inst_prms_qty();
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			return re_ship_schd_qty();
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			return ship_inst_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			return iv_schd_qty();
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			return iv_act_qty();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			return dlv_qty();
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			return ship_ret_qty();
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			return ship_schd_abort_qty();
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			return sls_schd_abort_qty();
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			return act_dlv_lt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($dlv_inst_rcpt_dt.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_dt();
		}
		if ($dlv_inst_prms_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			return ship_tm();
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			return dlv_tm();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
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
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($period_block_flg.equalsIgnoreCase(name)) {
			return period_block_flg();
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_flg();
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			return ship_schd_split_flg();
		}
		if ($ship_cmpl_flg.equalsIgnoreCase(name)) {
			return ship_cmpl_flg();
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			return sls_cmpl_flg();
		}
		if ($dlv_cmpl_flg.equalsIgnoreCase(name)) {
			return dlv_cmpl_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			return dlv_str_ln_cd();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			return def_loc_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($sls_sts_typ.equalsIgnoreCase(name)) {
			return sls_sts_typ();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			return prms_qty();
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_qty();
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			return dlv_inst_prms_qty();
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			return re_ship_schd_qty();
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			return ship_inst_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			return iv_schd_qty();
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			return iv_act_qty();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			return dlv_qty();
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			return ship_ret_qty();
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			return ship_schd_abort_qty();
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			return sls_schd_abort_qty();
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			return act_dlv_lt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($dlv_inst_rcpt_dt.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_dt();
		}
		if ($dlv_inst_prms_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			return ship_tm();
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			return dlv_tm();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
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
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($period_block_flg.equalsIgnoreCase(name)) {
			return period_block_flg();
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_flg();
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			return ship_schd_split_flg();
		}
		if ($ship_cmpl_flg.equalsIgnoreCase(name)) {
			return ship_cmpl_flg();
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			return sls_cmpl_flg();
		}
		if ($dlv_cmpl_flg.equalsIgnoreCase(name)) {
			return dlv_cmpl_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
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
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
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
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
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
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			dlv_str_ln_cd(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			def_loc_cd(value);
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
		if ($sls_sts_typ.equalsIgnoreCase(name)) {
			sls_sts_typ(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($dlv_inst_rcpt_dt.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_dt(value);
			return;
		}
		if ($dlv_inst_prms_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_dt(value);
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
		if ($ship_tm.equalsIgnoreCase(name)) {
			ship_tm(value);
			return;
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			dlv_tm(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
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
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($period_block_flg.equalsIgnoreCase(name)) {
			period_block_flg(value);
			return;
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			prms_dlv_dt_overdue_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_flg(value);
			return;
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			ship_schd_split_flg(value);
			return;
		}
		if ($ship_cmpl_flg.equalsIgnoreCase(name)) {
			ship_cmpl_flg(value);
			return;
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			sls_cmpl_flg(value);
			return;
		}
		if ($dlv_cmpl_flg.equalsIgnoreCase(name)) {
			dlv_cmpl_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
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
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
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
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
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
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			dlv_str_ln_cd(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			def_loc_cd(value);
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
		if ($sls_sts_typ.equalsIgnoreCase(name)) {
			sls_sts_typ(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
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
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($dlv_inst_rcpt_dt.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_dt(value);
			return;
		}
		if ($dlv_inst_prms_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_dt(value);
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
		if ($ship_tm.equalsIgnoreCase(name)) {
			ship_tm(value);
			return;
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			dlv_tm(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
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
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($period_block_flg.equalsIgnoreCase(name)) {
			period_block_flg(value);
			return;
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			prms_dlv_dt_overdue_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_flg(value);
			return;
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			ship_schd_split_flg(value);
			return;
		}
		if ($ship_cmpl_flg.equalsIgnoreCase(name)) {
			ship_cmpl_flg(value);
			return;
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			sls_cmpl_flg(value);
			return;
		}
		if ($dlv_cmpl_flg.equalsIgnoreCase(name)) {
			dlv_cmpl_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
