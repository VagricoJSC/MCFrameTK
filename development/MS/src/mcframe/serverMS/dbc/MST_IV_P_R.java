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
 * "インボイスヘッダ（改訂履歴） // Invoice header (Rev. history)"DBコンテナRowクラスです。<p>
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
 *  	<td>iv_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイス管理ＮＯ</td>
 *  	<td>Invoice management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>iv_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイス改訂番号</td>
 *  	<td>Invoice rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_src_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス作成元区分</td>
 *  	<td>Invoice creating source type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cmpl_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>完了予定日</td>
 *  	<td>Scheduled completion date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引予定日</td>
 *  	<td>Scheduled transaction date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cmpl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>完了日</td>
 *  	<td>Completion date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス日付</td>
 *  	<td>Invoice date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引パタン区分</td>
 *  	<td>Transaction pattern type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_rqst_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷依頼先識別区分</td>
 *  	<td>Shipping requested identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_rqst_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷依頼先識別ＣＤ</td>
 *  	<td>Shipping requested alias cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先ＣＤ</td>
 *  	<td>Receiving point cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先名</td>
 *  	<td>Receiving point name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配送先諸口ＦＬＧ</td>
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
 *  	<td>tdlv_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先部署</td>
 *  	<td>Receiving point dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先担当者</td>
 *  	<td>Receiving point PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先郵便番号</td>
 *  	<td>Receiving point zip code</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所１</td>
 *  	<td>Receiving point address 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所２</td>
 *  	<td>Receiving point address 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所３</td>
 *  	<td>Receiving point address 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所４</td>
 *  	<td>Receiving point address 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先ＴＥＬ</td>
 *  	<td>Receiving point TEL</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先ＦＡＸ</td>
 *  	<td>Receiving point FAX</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先物流グループＣＤ</td>
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
 *  	<td>dlv_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＺＩＰ</td>
 *  	<td>ZIP (Delivery destination)</td>
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
 *  	<td>dlv_cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先国ＣＤ</td>
 *  	<td>Delivery destination country cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous delivery destination flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trnspt_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>輸送方法ＣＤ</td>
 *  	<td>Transportation method cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>vssl_flght</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船名／便名</td>
 *  	<td>Ship/flight name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>load_port_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船積港ＣＤ</td>
 *  	<td>Loading port cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>etd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船積予定日</td>
 *  	<td>Estimated date of loading</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dschrg_port_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船卸港ＣＤ</td>
 *  	<td>Unloading port cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>eta_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船卸予定日</td>
 *  	<td>Estimated date of unloading</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>via_port_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>経由地ＣＤ</td>
 *  	<td>Stopover point cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>via_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>経由予定日</td>
 *  	<td>Estimated stopover date</td>
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
 *  	<td>tterm_cd1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件ＣＤ１</td>
 *  	<td>Transaction terms cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_rmrks1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件備考１</td>
 *  	<td>Transaction terms remarks 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tterm_cd2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件ＣＤ２</td>
 *  	<td>Transaction terms cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_rmrks2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件備考２</td>
 *  	<td>Transaction terms remarks 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ptax_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税通貨ＣＤ</td>
 *  	<td>Taxpaying currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tterm_cd3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件ＣＤ３</td>
 *  	<td>Transaction terms cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_rmrks3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件備考３</td>
 *  	<td>Transaction terms remarks 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_basis_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求起算日</td>
 *  	<td>Billing base date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金予定日</td>
 *  	<td>Scheduled payment receipt date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ttl_trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨金額合計</td>
 *  	<td>Amount total (Transaction currency)</td>
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
 *  	<td>納税為替レート指定FLG</td>
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
 *  	<td>ttl_net_wt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>純重量合計</td>
 *  	<td>Net weight total</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ttl_grss_wt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総重量合計</td>
 *  	<td>Total gross weight</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ttl_dim</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>容積合計</td>
 *  	<td>Total volume</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス備考</td>
 *  	<td>Invoice remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pl_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>パッキングリスト備考</td>
 *  	<td>Packing list remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>case_mrk1</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ケースマーク１</td>
 *  	<td>Case mark 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>case_mrk2</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ケースマーク２</td>
 *  	<td>Case mark 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>case_mrk3</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ケースマーク３</td>
 *  	<td>Case mark 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>case_mrk4</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ケースマーク４</td>
 *  	<td>Case mark 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>case_mrk5</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ケースマーク５</td>
 *  	<td>Case mark 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>case_mrk6</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ケースマーク６</td>
 *  	<td>Case mark 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lc_no</td>
 *  	<td>C</td>
 *  	<td>32</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>Ｌ／ＣＮＯ</td>
 *  	<td>L/C No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lc_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>Ｌ／Ｃ日付</td>
 *  	<td>L/C Date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lc_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>Ｌ／Ｃ備考</td>
 *  	<td>L/C remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bl_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>Ｂ／ＬＮＯ</td>
 *  	<td>B/L No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>Ｂ／Ｌ日付</td>
 *  	<td>B/L date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bl_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>Ｂ／Ｌ備考</td>
 *  	<td>B/L remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_fr_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷元物流グループＣＤ</td>
 *  	<td>Shipping point distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pl_reg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>パッキングリスト登録ＦＬＧ</td>
 *  	<td>Packing list entry flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pl_skip_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>パッキングリスト省略ＦＬＧ</td>
 *  	<td>Packing list omission flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>完了ＦＬＧ</td>
 *  	<td>Completed flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>non_cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>完了対象外ＦＬＧ</td>
 *  	<td>Not to complete flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_ship_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイス単位出荷ＦＬＧ</td>
 *  	<td>Shipping invoice unit flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイス発行済ＦＬＧ</td>
 *  	<td>Invoice issued flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pl_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>パッキングリスト発行済ＦＬＧ</td>
 *  	<td>Packing list issued flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_iv_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイス管理ＮＯ</td>
 *  	<td>Purchase invoice management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcpt_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイスＮＯ</td>
 *  	<td>Purchase invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_rcpt_iv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受領インボイス仮登録ＦＬＧ</td>
 *  	<td>Purchase invoice temporary entry flg.</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_IV_P_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_IV_P";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * インボイス管理ＮＯ. Invoice management No..<p>
	 *
	 */
	public static final String $iv_mng_no = "iv_mng_no";
	private static final MCPermColumnInfo _iv_mng_no = createColumnInfo("iv_mng_no");
	public final MCStringPermColumn iv_mng_no = createStringColumn(_iv_mng_no);
	
	/**
	 * インボイス改訂番号. Invoice rev. number.<p>
	 *
	 */
	public static final String $iv_rev = "iv_rev";
	private static final MCPermColumnInfo _iv_rev = createColumnInfo("iv_rev");
	public final MCNumberPermColumn iv_rev = createNumberColumn(_iv_rev);
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
	/**
	 * インボイス作成元区分. Invoice creating source type.<p>
	 *
	 */
	public static final String $iv_src_typ = "iv_src_typ";
	private static final MCPermColumnInfo _iv_src_typ = createColumnInfo("iv_src_typ");
	public final MCStringPermColumn iv_src_typ = createStringColumn(_iv_src_typ);
	
	/**
	 * 完了予定日. Scheduled completion date.<p>
	 *
	 */
	public static final String $cmpl_schd_dt = "cmpl_schd_dt";
	private static final MCPermColumnInfo _cmpl_schd_dt = createColumnInfo("cmpl_schd_dt");
	public final MCDatePermColumn cmpl_schd_dt = createDateColumn(_cmpl_schd_dt);
	
	/**
	 * 取引予定日. Scheduled transaction date.<p>
	 *
	 */
	public static final String $trd_schd_dt = "trd_schd_dt";
	private static final MCPermColumnInfo _trd_schd_dt = createColumnInfo("trd_schd_dt");
	public final MCDatePermColumn trd_schd_dt = createDateColumn(_trd_schd_dt);
	
	/**
	 * 完了日. Completion date.<p>
	 *
	 */
	public static final String $cmpl_dt = "cmpl_dt";
	private static final MCPermColumnInfo _cmpl_dt = createColumnInfo("cmpl_dt");
	public final MCDatePermColumn cmpl_dt = createDateColumn(_cmpl_dt);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * インボイス日付. Invoice date.<p>
	 *
	 */
	public static final String $iv_dt = "iv_dt";
	private static final MCPermColumnInfo _iv_dt = createColumnInfo("iv_dt");
	public final MCDatePermColumn iv_dt = createDateColumn(_iv_dt);
	
	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	private static final MCPermColumnInfo _trd_ptn_typ = createColumnInfo("trd_ptn_typ");
	public final MCStringPermColumn trd_ptn_typ = createStringColumn(_trd_ptn_typ);
	
	/**
	 * 出荷依頼先識別区分. Shipping requested identification type.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ = "ship_rqst_id_typ";
	private static final MCPermColumnInfo _ship_rqst_id_typ = createColumnInfo("ship_rqst_id_typ");
	public final MCStringPermColumn ship_rqst_id_typ = createStringColumn(_ship_rqst_id_typ);
	
	/**
	 * 出荷依頼先識別ＣＤ. Shipping requested alias cd..<p>
	 *
	 */
	public static final String $ship_rqst_id_cd = "ship_rqst_id_cd";
	private static final MCPermColumnInfo _ship_rqst_id_cd = createColumnInfo("ship_rqst_id_cd");
	public final MCStringPermColumn ship_rqst_id_cd = createStringColumn(_ship_rqst_id_cd);
	
	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	private static final MCPermColumnInfo _tdlv_cd = createColumnInfo("tdlv_cd");
	public final MCStringPermColumn tdlv_cd = createStringColumn(_tdlv_cd);
	
	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	private static final MCPermColumnInfo _tdlv_nm = createColumnInfo("tdlv_nm");
	public final MCStringPermColumn tdlv_nm = createStringColumn(_tdlv_nm);
	
	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	private static final MCPermColumnInfo _tdlv_sundry_flg = createColumnInfo("tdlv_sundry_flg");
	public final MCBooleanPermColumn tdlv_sundry_flg = createBooleanColumn(_tdlv_sundry_flg);
	
	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	private static final MCPermColumnInfo _via_dlv_typ = createColumnInfo("via_dlv_typ");
	public final MCStringPermColumn via_dlv_typ = createStringColumn(_via_dlv_typ);
	
	/**
	 * 配送先部署. Receiving point dept..<p>
	 *
	 */
	public static final String $tdlv_cntct_dpt = "tdlv_cntct_dpt";
	private static final MCPermColumnInfo _tdlv_cntct_dpt = createColumnInfo("tdlv_cntct_dpt");
	public final MCStringPermColumn tdlv_cntct_dpt = createStringColumn(_tdlv_cntct_dpt);
	
	/**
	 * 配送先担当者. Receiving point PIC.<p>
	 *
	 */
	public static final String $tdlv_cntct_psn = "tdlv_cntct_psn";
	private static final MCPermColumnInfo _tdlv_cntct_psn = createColumnInfo("tdlv_cntct_psn");
	public final MCStringPermColumn tdlv_cntct_psn = createStringColumn(_tdlv_cntct_psn);
	
	/**
	 * 配送先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	private static final MCPermColumnInfo _tdlv_zip_cd = createColumnInfo("tdlv_zip_cd");
	public final MCStringPermColumn tdlv_zip_cd = createStringColumn(_tdlv_zip_cd);
	
	/**
	 * 配送先住所１. Receiving point address 1.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	private static final MCPermColumnInfo _tdlv_addr1 = createColumnInfo("tdlv_addr1");
	public final MCStringPermColumn tdlv_addr1 = createStringColumn(_tdlv_addr1);
	
	/**
	 * 配送先住所２. Receiving point address 2.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	private static final MCPermColumnInfo _tdlv_addr2 = createColumnInfo("tdlv_addr2");
	public final MCStringPermColumn tdlv_addr2 = createStringColumn(_tdlv_addr2);
	
	/**
	 * 配送先住所３. Receiving point address 3.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	private static final MCPermColumnInfo _tdlv_addr3 = createColumnInfo("tdlv_addr3");
	public final MCStringPermColumn tdlv_addr3 = createStringColumn(_tdlv_addr3);
	
	/**
	 * 配送先住所４. Receiving point address 4.<p>
	 *
	 */
	public static final String $tdlv_addr4 = "tdlv_addr4";
	private static final MCPermColumnInfo _tdlv_addr4 = createColumnInfo("tdlv_addr4");
	public final MCStringPermColumn tdlv_addr4 = createStringColumn(_tdlv_addr4);
	
	/**
	 * 配送先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public static final String $tdlv_tel = "tdlv_tel";
	private static final MCPermColumnInfo _tdlv_tel = createColumnInfo("tdlv_tel");
	public final MCStringPermColumn tdlv_tel = createStringColumn(_tdlv_tel);
	
	/**
	 * 配送先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public static final String $tdlv_fax = "tdlv_fax";
	private static final MCPermColumnInfo _tdlv_fax = createColumnInfo("tdlv_fax");
	public final MCStringPermColumn tdlv_fax = createStringColumn(_tdlv_fax);
	
	/**
	 * 配送先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public static final String $tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
	private static final MCPermColumnInfo _tdlv_lg_grp_cd = createColumnInfo("tdlv_lg_grp_cd");
	public final MCStringPermColumn tdlv_lg_grp_cd = createStringColumn(_tdlv_lg_grp_cd);
	
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
	 * 納品先ＺＩＰ. ZIP (Delivery destination).<p>
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
	 * 納品先国ＣＤ. Delivery destination country cd..<p>
	 *
	 */
	public static final String $dlv_cntry_cd = "dlv_cntry_cd";
	private static final MCPermColumnInfo _dlv_cntry_cd = createColumnInfo("dlv_cntry_cd");
	public final MCStringPermColumn dlv_cntry_cd = createStringColumn(_dlv_cntry_cd);
	
	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	private static final MCPermColumnInfo _dlv_sundry_flg = createColumnInfo("dlv_sundry_flg");
	public final MCBooleanPermColumn dlv_sundry_flg = createBooleanColumn(_dlv_sundry_flg);
	
	/**
	 * 輸送方法ＣＤ. Transportation method cd..<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	private static final MCPermColumnInfo _trnspt_cd = createColumnInfo("trnspt_cd");
	public final MCStringPermColumn trnspt_cd = createStringColumn(_trnspt_cd);
	
	/**
	 * 船名／便名. Ship/flight name.<p>
	 *
	 */
	public static final String $vssl_flght = "vssl_flght";
	private static final MCPermColumnInfo _vssl_flght = createColumnInfo("vssl_flght");
	public final MCStringPermColumn vssl_flght = createStringColumn(_vssl_flght);
	
	/**
	 * 船積港ＣＤ. Loading port cd..<p>
	 *
	 */
	public static final String $load_port_cd = "load_port_cd";
	private static final MCPermColumnInfo _load_port_cd = createColumnInfo("load_port_cd");
	public final MCStringPermColumn load_port_cd = createStringColumn(_load_port_cd);
	
	/**
	 * 船積予定日. Estimated date of loading.<p>
	 *
	 */
	public static final String $etd_dt = "etd_dt";
	private static final MCPermColumnInfo _etd_dt = createColumnInfo("etd_dt");
	public final MCDatePermColumn etd_dt = createDateColumn(_etd_dt);
	
	/**
	 * 船卸港ＣＤ. Unloading port cd..<p>
	 *
	 */
	public static final String $dschrg_port_cd = "dschrg_port_cd";
	private static final MCPermColumnInfo _dschrg_port_cd = createColumnInfo("dschrg_port_cd");
	public final MCStringPermColumn dschrg_port_cd = createStringColumn(_dschrg_port_cd);
	
	/**
	 * 船卸予定日. Estimated date of unloading.<p>
	 *
	 */
	public static final String $eta_dt = "eta_dt";
	private static final MCPermColumnInfo _eta_dt = createColumnInfo("eta_dt");
	public final MCDatePermColumn eta_dt = createDateColumn(_eta_dt);
	
	/**
	 * 経由地ＣＤ. Stopover point cd..<p>
	 *
	 */
	public static final String $via_port_cd = "via_port_cd";
	private static final MCPermColumnInfo _via_port_cd = createColumnInfo("via_port_cd");
	public final MCStringPermColumn via_port_cd = createStringColumn(_via_port_cd);
	
	/**
	 * 経由予定日. Estimated stopover date.<p>
	 *
	 */
	public static final String $via_schd_dt = "via_schd_dt";
	private static final MCPermColumnInfo _via_schd_dt = createColumnInfo("via_schd_dt");
	public final MCDatePermColumn via_schd_dt = createDateColumn(_via_schd_dt);
	
	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	private static final MCPermColumnInfo _sls_basis_typ = createColumnInfo("sls_basis_typ");
	public final MCStringPermColumn sls_basis_typ = createStringColumn(_sls_basis_typ);
	
	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	private static final MCPermColumnInfo _prov_basis_typ = createColumnInfo("prov_basis_typ");
	public final MCStringPermColumn prov_basis_typ = createStringColumn(_prov_basis_typ);
	
	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	private static final MCPermColumnInfo _tterm_cd1 = createColumnInfo("tterm_cd1");
	public final MCStringPermColumn tterm_cd1 = createStringColumn(_tterm_cd1);
	
	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public static final String $tterm_rmrks1 = "tterm_rmrks1";
	private static final MCPermColumnInfo _tterm_rmrks1 = createColumnInfo("tterm_rmrks1");
	public final MCStringPermColumn tterm_rmrks1 = createStringColumn(_tterm_rmrks1);
	
	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	private static final MCPermColumnInfo _tterm_cd2 = createColumnInfo("tterm_cd2");
	public final MCStringPermColumn tterm_cd2 = createStringColumn(_tterm_cd2);
	
	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public static final String $tterm_rmrks2 = "tterm_rmrks2";
	private static final MCPermColumnInfo _tterm_rmrks2 = createColumnInfo("tterm_rmrks2");
	public final MCStringPermColumn tterm_rmrks2 = createStringColumn(_tterm_rmrks2);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	private static final MCPermColumnInfo _ptax_cur_cd = createColumnInfo("ptax_cur_cd");
	public final MCStringPermColumn ptax_cur_cd = createStringColumn(_ptax_cur_cd);
	
	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	private static final MCPermColumnInfo _tterm_cd3 = createColumnInfo("tterm_cd3");
	public final MCStringPermColumn tterm_cd3 = createStringColumn(_tterm_cd3);
	
	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	private static final MCPermColumnInfo _tterm_rmrks3 = createColumnInfo("tterm_rmrks3");
	public final MCStringPermColumn tterm_rmrks3 = createStringColumn(_tterm_rmrks3);
	
	/**
	 * 請求起算日. Billing base date.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	private static final MCPermColumnInfo _bill_basis_dt = createColumnInfo("bill_basis_dt");
	public final MCDatePermColumn bill_basis_dt = createDateColumn(_bill_basis_dt);
	
	/**
	 * 入金予定日. Scheduled payment receipt date.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	private static final MCPermColumnInfo _rcv_schd_dt = createColumnInfo("rcv_schd_dt");
	public final MCDatePermColumn rcv_schd_dt = createDateColumn(_rcv_schd_dt);
	
	/**
	 * 取引通貨金額合計. Amount total (Transaction currency).<p>
	 *
	 */
	public static final String $ttl_trd_cur_amt = "ttl_trd_cur_amt";
	private static final MCPermColumnInfo _ttl_trd_cur_amt = createColumnInfo("ttl_trd_cur_amt");
	public final MCNumberPermColumn ttl_trd_cur_amt = createNumberColumn(_ttl_trd_cur_amt);
	
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
	 * 納税為替レート指定FLG. Taxpaying exchange rate specification flg..<p>
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
	 * 純重量合計. Net weight total.<p>
	 *
	 */
	public static final String $ttl_net_wt = "ttl_net_wt";
	private static final MCPermColumnInfo _ttl_net_wt = createColumnInfo("ttl_net_wt");
	public final MCNumberPermColumn ttl_net_wt = createNumberColumn(_ttl_net_wt);
	
	/**
	 * 総重量合計. Total gross weight.<p>
	 *
	 */
	public static final String $ttl_grss_wt = "ttl_grss_wt";
	private static final MCPermColumnInfo _ttl_grss_wt = createColumnInfo("ttl_grss_wt");
	public final MCNumberPermColumn ttl_grss_wt = createNumberColumn(_ttl_grss_wt);
	
	/**
	 * 容積合計. Total volume.<p>
	 *
	 */
	public static final String $ttl_dim = "ttl_dim";
	private static final MCPermColumnInfo _ttl_dim = createColumnInfo("ttl_dim");
	public final MCNumberPermColumn ttl_dim = createNumberColumn(_ttl_dim);
	
	/**
	 * インボイス備考. Invoice remarks.<p>
	 *
	 */
	public static final String $iv_rmrks = "iv_rmrks";
	private static final MCPermColumnInfo _iv_rmrks = createColumnInfo("iv_rmrks");
	public final MCStringPermColumn iv_rmrks = createStringColumn(_iv_rmrks);
	
	/**
	 * パッキングリスト備考. Packing list remarks.<p>
	 *
	 */
	public static final String $pl_rmrks = "pl_rmrks";
	private static final MCPermColumnInfo _pl_rmrks = createColumnInfo("pl_rmrks");
	public final MCStringPermColumn pl_rmrks = createStringColumn(_pl_rmrks);
	
	/**
	 * ケースマーク１. Case mark 1.<p>
	 *
	 */
	public static final String $case_mrk1 = "case_mrk1";
	private static final MCPermColumnInfo _case_mrk1 = createColumnInfo("case_mrk1");
	public final MCStringPermColumn case_mrk1 = createStringColumn(_case_mrk1);
	
	/**
	 * ケースマーク２. Case mark 2.<p>
	 *
	 */
	public static final String $case_mrk2 = "case_mrk2";
	private static final MCPermColumnInfo _case_mrk2 = createColumnInfo("case_mrk2");
	public final MCStringPermColumn case_mrk2 = createStringColumn(_case_mrk2);
	
	/**
	 * ケースマーク３. Case mark 3.<p>
	 *
	 */
	public static final String $case_mrk3 = "case_mrk3";
	private static final MCPermColumnInfo _case_mrk3 = createColumnInfo("case_mrk3");
	public final MCStringPermColumn case_mrk3 = createStringColumn(_case_mrk3);
	
	/**
	 * ケースマーク４. Case mark 4.<p>
	 *
	 */
	public static final String $case_mrk4 = "case_mrk4";
	private static final MCPermColumnInfo _case_mrk4 = createColumnInfo("case_mrk4");
	public final MCStringPermColumn case_mrk4 = createStringColumn(_case_mrk4);
	
	/**
	 * ケースマーク５. Case mark 5.<p>
	 *
	 */
	public static final String $case_mrk5 = "case_mrk5";
	private static final MCPermColumnInfo _case_mrk5 = createColumnInfo("case_mrk5");
	public final MCStringPermColumn case_mrk5 = createStringColumn(_case_mrk5);
	
	/**
	 * ケースマーク６. Case mark 6.<p>
	 *
	 */
	public static final String $case_mrk6 = "case_mrk6";
	private static final MCPermColumnInfo _case_mrk6 = createColumnInfo("case_mrk6");
	public final MCStringPermColumn case_mrk6 = createStringColumn(_case_mrk6);
	
	/**
	 * Ｌ／ＣＮＯ. L/C No..<p>
	 *
	 */
	public static final String $lc_no = "lc_no";
	private static final MCPermColumnInfo _lc_no = createColumnInfo("lc_no");
	public final MCStringPermColumn lc_no = createStringColumn(_lc_no);
	
	/**
	 * Ｌ／Ｃ日付. L/C Date.<p>
	 *
	 */
	public static final String $lc_dt = "lc_dt";
	private static final MCPermColumnInfo _lc_dt = createColumnInfo("lc_dt");
	public final MCDatePermColumn lc_dt = createDateColumn(_lc_dt);
	
	/**
	 * Ｌ／Ｃ備考. L/C remarks.<p>
	 *
	 */
	public static final String $lc_rmrks = "lc_rmrks";
	private static final MCPermColumnInfo _lc_rmrks = createColumnInfo("lc_rmrks");
	public final MCStringPermColumn lc_rmrks = createStringColumn(_lc_rmrks);
	
	/**
	 * Ｂ／ＬＮＯ. B/L No..<p>
	 *
	 */
	public static final String $bl_no = "bl_no";
	private static final MCPermColumnInfo _bl_no = createColumnInfo("bl_no");
	public final MCStringPermColumn bl_no = createStringColumn(_bl_no);
	
	/**
	 * Ｂ／Ｌ日付. B/L date.<p>
	 *
	 */
	public static final String $bl_dt = "bl_dt";
	private static final MCPermColumnInfo _bl_dt = createColumnInfo("bl_dt");
	public final MCDatePermColumn bl_dt = createDateColumn(_bl_dt);
	
	/**
	 * Ｂ／Ｌ備考. B/L remarks.<p>
	 *
	 */
	public static final String $bl_rmrks = "bl_rmrks";
	private static final MCPermColumnInfo _bl_rmrks = createColumnInfo("bl_rmrks");
	public final MCStringPermColumn bl_rmrks = createStringColumn(_bl_rmrks);
	
	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	private static final MCPermColumnInfo _ship_fr_lg_grp_cd = createColumnInfo("ship_fr_lg_grp_cd");
	public final MCStringPermColumn ship_fr_lg_grp_cd = createStringColumn(_ship_fr_lg_grp_cd);
	
	/**
	 * パッキングリスト登録ＦＬＧ. Packing list entry flg..<p>
	 *
	 */
	public static final String $pl_reg_flg = "pl_reg_flg";
	private static final MCPermColumnInfo _pl_reg_flg = createColumnInfo("pl_reg_flg");
	public final MCBooleanPermColumn pl_reg_flg = createBooleanColumn(_pl_reg_flg);
	
	/**
	 * パッキングリスト省略ＦＬＧ. Packing list omission flg..<p>
	 *
	 */
	public static final String $pl_skip_flg = "pl_skip_flg";
	private static final MCPermColumnInfo _pl_skip_flg = createColumnInfo("pl_skip_flg");
	public final MCBooleanPermColumn pl_skip_flg = createBooleanColumn(_pl_skip_flg);
	
	/**
	 * 完了ＦＬＧ. Completed flg..<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	private static final MCPermColumnInfo _cmpl_flg = createColumnInfo("cmpl_flg");
	public final MCBooleanPermColumn cmpl_flg = createBooleanColumn(_cmpl_flg);
	
	/**
	 * 完了対象外ＦＬＧ. Not to complete flg..<p>
	 *
	 */
	public static final String $non_cmpl_flg = "non_cmpl_flg";
	private static final MCPermColumnInfo _non_cmpl_flg = createColumnInfo("non_cmpl_flg");
	public final MCBooleanPermColumn non_cmpl_flg = createBooleanColumn(_non_cmpl_flg);
	
	/**
	 * インボイス単位出荷ＦＬＧ. Shipping invoice unit flg..<p>
	 *
	 */
	public static final String $iv_ship_flg = "iv_ship_flg";
	private static final MCPermColumnInfo _iv_ship_flg = createColumnInfo("iv_ship_flg");
	public final MCBooleanPermColumn iv_ship_flg = createBooleanColumn(_iv_ship_flg);
	
	/**
	 * インボイス発行済ＦＬＧ. Invoice issued flg..<p>
	 *
	 */
	public static final String $iv_prnt_flg = "iv_prnt_flg";
	private static final MCPermColumnInfo _iv_prnt_flg = createColumnInfo("iv_prnt_flg");
	public final MCBooleanPermColumn iv_prnt_flg = createBooleanColumn(_iv_prnt_flg);
	
	/**
	 * パッキングリスト発行済ＦＬＧ. Packing list issued flg..<p>
	 *
	 */
	public static final String $pl_prnt_flg = "pl_prnt_flg";
	private static final MCPermColumnInfo _pl_prnt_flg = createColumnInfo("pl_prnt_flg");
	public final MCBooleanPermColumn pl_prnt_flg = createBooleanColumn(_pl_prnt_flg);
	
	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	private static final MCPermColumnInfo _rcpt_iv_mng_no = createColumnInfo("rcpt_iv_mng_no");
	public final MCStringPermColumn rcpt_iv_mng_no = createStringColumn(_rcpt_iv_mng_no);
	
	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	private static final MCPermColumnInfo _rcpt_iv_no = createColumnInfo("rcpt_iv_no");
	public final MCStringPermColumn rcpt_iv_no = createStringColumn(_rcpt_iv_no);
	
	/**
	 * 受領インボイス仮登録ＦＬＧ. Purchase invoice temporary entry flg..<p>
	 *
	 */
	public static final String $pre_rcpt_iv_flg = "pre_rcpt_iv_flg";
	private static final MCPermColumnInfo _pre_rcpt_iv_flg = createColumnInfo("pre_rcpt_iv_flg");
	public final MCBooleanPermColumn pre_rcpt_iv_flg = createBooleanColumn(_pre_rcpt_iv_flg);
	
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
	
	public static final MCMeta iv_mng_no_META = createCommonMeta($iv_mng_no, mcframe.commonMA.meta.MA_META.IV_MNG_NO);
	public static final MCMeta iv_rev_META = createCommonMeta($iv_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_src_typ_META = createCommonMeta($iv_src_typ, mcframe.commonMS.meta.MS_META.IV_SRC_TYP);
	public static final MCMeta cmpl_schd_dt_META = createCommonMeta($cmpl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_schd_dt_META = createCommonMeta($trd_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cmpl_dt_META = createCommonMeta($cmpl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_dt_META = createCommonMeta($iv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_lg_grp_cd_META = createCommonMeta($tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_schd_dt_META = createCommonMeta($via_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ttl_trd_cur_amt_META = createCommonMeta($ttl_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_net_wt_META = createCommonMeta($ttl_net_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta ttl_grss_wt_META = createCommonMeta($ttl_grss_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta ttl_dim_META = createCommonMeta($ttl_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta iv_rmrks_META = createCommonMeta($iv_rmrks, mcframe.commonMS.meta.MS_META.IV_RMRKS);
	public static final MCMeta pl_rmrks_META = createCommonMeta($pl_rmrks, mcframe.commonMS.meta.MS_META.PL_RMRKS);
	public static final MCMeta case_mrk1_META = createCommonMeta($case_mrk1, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk2_META = createCommonMeta($case_mrk2, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk3_META = createCommonMeta($case_mrk3, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk4_META = createCommonMeta($case_mrk4, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk5_META = createCommonMeta($case_mrk5, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk6_META = createCommonMeta($case_mrk6, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta lc_no_META = createCommonMeta($lc_no, mcframe.commonMA.meta.MA_META.LC_NO);
	public static final MCMeta lc_dt_META = createCommonMeta($lc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lc_rmrks_META = createCommonMeta($lc_rmrks, mcframe.commonMS.meta.MS_META.LC_RMRKS);
	public static final MCMeta bl_no_META = createCommonMeta($bl_no, mcframe.commonMA.meta.MA_META.BL_NO);
	public static final MCMeta bl_dt_META = createCommonMeta($bl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bl_rmrks_META = createCommonMeta($bl_rmrks, mcframe.commonMS.meta.MS_META.BL_RMRKS);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta pl_reg_flg_META = createCommonMeta($pl_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_skip_flg_META = createCommonMeta($pl_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_cmpl_flg_META = createCommonMeta($non_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_ship_flg_META = createCommonMeta($iv_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_prnt_flg_META = createCommonMeta($iv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_prnt_flg_META = createCommonMeta($pl_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta pre_rcpt_iv_flg_META = createCommonMeta($pre_rcpt_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.IV_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_IV_P_R> constMetas = new ConstMetaList<MST_IV_P_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			iv_mng_no_META,
			iv_rev_META,
			iv_no_META,
			iv_src_typ_META,
			cmpl_schd_dt_META,
			trd_schd_dt_META,
			cmpl_dt_META,
			ac_dt_META,
			iv_dt_META,
			trd_ptn_typ_META,
			ship_rqst_id_typ_META,
			ship_rqst_id_cd_META,
			tdlv_cd_META,
			tdlv_nm_META,
			tdlv_sundry_flg_META,
			via_dlv_typ_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_lg_grp_cd_META,
			dlv_id_typ_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_cntry_cd_META,
			dlv_sundry_flg_META,
			trnspt_cd_META,
			vssl_flght_META,
			load_port_cd_META,
			etd_dt_META,
			dschrg_port_cd_META,
			eta_dt_META,
			via_port_cd_META,
			via_schd_dt_META,
			sls_basis_typ_META,
			prov_basis_typ_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			trd_cur_cd_META,
			ptax_cur_cd_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			bill_basis_dt_META,
			rcv_schd_dt_META,
			ttl_trd_cur_amt_META,
			xrate_inpt_flg_META,
			xrate_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_META,
			ttl_net_wt_META,
			ttl_grss_wt_META,
			ttl_dim_META,
			iv_rmrks_META,
			pl_rmrks_META,
			case_mrk1_META,
			case_mrk2_META,
			case_mrk3_META,
			case_mrk4_META,
			case_mrk5_META,
			case_mrk6_META,
			lc_no_META,
			lc_dt_META,
			lc_rmrks_META,
			bl_no_META,
			bl_dt_META,
			bl_rmrks_META,
			ship_fr_lg_grp_cd_META,
			pl_reg_flg_META,
			pl_skip_flg_META,
			cmpl_flg_META,
			non_cmpl_flg_META,
			iv_ship_flg_META,
			iv_prnt_flg_META,
			pl_prnt_flg_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_no_META,
			pre_rcpt_iv_flg_META,
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
	protected MST_IV_P_R(ConstMetaList<? extends MST_IV_P_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_IV_P_R(ConstMetaList<? extends MST_IV_P_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_IV_P_R.$iv_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$iv_mng_no,
				"iv_mng_no",
				iv_mng_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$iv_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IV_P_R.$iv_rev,
				"iv_rev",
				iv_rev,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$iv_no,
				"iv_no",
				iv_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$iv_src_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$iv_src_typ,
				"iv_src_typ",
				iv_src_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$cmpl_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$cmpl_schd_dt,
				"cmpl_schd_dt",
				cmpl_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$trd_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$trd_schd_dt,
				"trd_schd_dt",
				trd_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$cmpl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$cmpl_dt,
				"cmpl_dt",
				cmpl_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$ac_dt,
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
			MST_IV_P_R.$iv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$iv_dt,
				"iv_dt",
				iv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$trd_ptn_typ,
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
			MST_IV_P_R.$ship_rqst_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$ship_rqst_id_typ,
				"ship_rqst_id_typ",
				ship_rqst_id_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$ship_rqst_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$ship_rqst_id_cd,
				"ship_rqst_id_cd",
				ship_rqst_id_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_cd,
				"tdlv_cd",
				tdlv_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_nm,
				"tdlv_nm",
				tdlv_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$tdlv_sundry_flg,
				"tdlv_sundry_flg",
				tdlv_sundry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$via_dlv_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$via_dlv_typ,
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
			MST_IV_P_R.$tdlv_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_cntct_dpt,
				"tdlv_cntct_dpt",
				tdlv_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_cntct_psn,
				"tdlv_cntct_psn",
				tdlv_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_zip_cd,
				"tdlv_zip_cd",
				tdlv_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_addr1,
				"tdlv_addr1",
				tdlv_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_addr2,
				"tdlv_addr2",
				tdlv_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_addr3,
				"tdlv_addr3",
				tdlv_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_addr4,
				"tdlv_addr4",
				tdlv_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_tel,
				"tdlv_tel",
				tdlv_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_fax,
				"tdlv_fax",
				tdlv_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tdlv_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tdlv_lg_grp_cd,
				"tdlv_lg_grp_cd",
				tdlv_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$dlv_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_id_typ,
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
			MST_IV_P_R.$dlv_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_id_cd,
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
			MST_IV_P_R.$dlv_id_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_id_nm,
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
			MST_IV_P_R.$dlv_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_cntct_dpt,
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
			MST_IV_P_R.$dlv_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_cntct_psn,
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
			MST_IV_P_R.$dlv_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_zip_cd,
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
			MST_IV_P_R.$dlv_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_addr1,
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
			MST_IV_P_R.$dlv_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_addr2,
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
			MST_IV_P_R.$dlv_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_addr3,
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
			MST_IV_P_R.$dlv_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_addr4,
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
			MST_IV_P_R.$dlv_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_tel,
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
			MST_IV_P_R.$dlv_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_fax,
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
			MST_IV_P_R.$dlv_cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dlv_cntry_cd,
				"dlv_cntry_cd",
				dlv_cntry_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$dlv_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$dlv_sundry_flg,
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
			MST_IV_P_R.$trnspt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$trnspt_cd,
				"trnspt_cd",
				trnspt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$vssl_flght,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$vssl_flght,
				"vssl_flght",
				vssl_flght,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$load_port_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$load_port_cd,
				"load_port_cd",
				load_port_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$etd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$etd_dt,
				"etd_dt",
				etd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$dschrg_port_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$dschrg_port_cd,
				"dschrg_port_cd",
				dschrg_port_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$eta_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$eta_dt,
				"eta_dt",
				eta_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$via_port_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$via_port_cd,
				"via_port_cd",
				via_port_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$via_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$via_schd_dt,
				"via_schd_dt",
				via_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$sls_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$sls_basis_typ,
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
			MST_IV_P_R.$prov_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$prov_basis_typ,
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
			MST_IV_P_R.$tterm_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tterm_cd1,
				"tterm_cd1",
				tterm_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tterm_rmrks1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tterm_rmrks1,
				"tterm_rmrks1",
				tterm_rmrks1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tterm_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tterm_cd2,
				"tterm_cd2",
				tterm_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tterm_rmrks2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tterm_rmrks2,
				"tterm_rmrks2",
				tterm_rmrks2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$trd_cur_cd,
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
			MST_IV_P_R.$ptax_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$ptax_cur_cd,
				"ptax_cur_cd",
				ptax_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tterm_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tterm_cd3,
				"tterm_cd3",
				tterm_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$tterm_rmrks3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$tterm_rmrks3,
				"tterm_rmrks3",
				tterm_rmrks3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$bill_basis_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$bill_basis_dt,
				"bill_basis_dt",
				bill_basis_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$rcv_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$rcv_schd_dt,
				"rcv_schd_dt",
				rcv_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$ttl_trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IV_P_R.$ttl_trd_cur_amt,
				"ttl_trd_cur_amt",
				ttl_trd_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$xrate_inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$xrate_inpt_flg,
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
			MST_IV_P_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IV_P_R.$xrate,
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
			MST_IV_P_R.$ptax_xrate_inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$ptax_xrate_inpt_flg,
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
			MST_IV_P_R.$ptax_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IV_P_R.$ptax_xrate,
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
			MST_IV_P_R.$ttl_net_wt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IV_P_R.$ttl_net_wt,
				"ttl_net_wt",
				ttl_net_wt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$ttl_grss_wt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IV_P_R.$ttl_grss_wt,
				"ttl_grss_wt",
				ttl_grss_wt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$ttl_dim,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IV_P_R.$ttl_dim,
				"ttl_dim",
				ttl_dim,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$iv_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$iv_rmrks,
				"iv_rmrks",
				iv_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$pl_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$pl_rmrks,
				"pl_rmrks",
				pl_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$case_mrk1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$case_mrk1,
				"case_mrk1",
				case_mrk1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$case_mrk2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$case_mrk2,
				"case_mrk2",
				case_mrk2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$case_mrk3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$case_mrk3,
				"case_mrk3",
				case_mrk3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$case_mrk4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$case_mrk4,
				"case_mrk4",
				case_mrk4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$case_mrk5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$case_mrk5,
				"case_mrk5",
				case_mrk5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$case_mrk6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$case_mrk6,
				"case_mrk6",
				case_mrk6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$lc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$lc_no,
				"lc_no",
				lc_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$lc_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$lc_dt,
				"lc_dt",
				lc_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$lc_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$lc_rmrks,
				"lc_rmrks",
				lc_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$bl_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$bl_no,
				"bl_no",
				bl_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$bl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IV_P_R.$bl_dt,
				"bl_dt",
				bl_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$bl_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$bl_rmrks,
				"bl_rmrks",
				bl_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$ship_fr_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$ship_fr_lg_grp_cd,
				"ship_fr_lg_grp_cd",
				ship_fr_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$pl_reg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$pl_reg_flg,
				"pl_reg_flg",
				pl_reg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$pl_skip_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$pl_skip_flg,
				"pl_skip_flg",
				pl_skip_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$cmpl_flg,
				"cmpl_flg",
				cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$non_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$non_cmpl_flg,
				"non_cmpl_flg",
				non_cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$iv_ship_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$iv_ship_flg,
				"iv_ship_flg",
				iv_ship_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$iv_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$iv_prnt_flg,
				"iv_prnt_flg",
				iv_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$pl_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$pl_prnt_flg,
				"pl_prnt_flg",
				pl_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$rcpt_iv_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$rcpt_iv_mng_no,
				"rcpt_iv_mng_no",
				rcpt_iv_mng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$rcpt_iv_no,
				"rcpt_iv_no",
				rcpt_iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$pre_rcpt_iv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IV_P_R.$pre_rcpt_iv_flg,
				"pre_rcpt_iv_flg",
				pre_rcpt_iv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$intr_rmrks,
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
			MST_IV_P_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$sub_char1,
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
			MST_IV_P_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$sub_char2,
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
			MST_IV_P_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$sub_char3,
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
			MST_IV_P_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_IV_P_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IV_P_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_IV_P_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IV_P_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IV_P_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
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
	public static MST_IV_P_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_IV_P_R create(String alias) {
		MST_IV_P_R row = new MST_IV_P_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_IV_P_R createByName(T proto) {
		MST_IV_P_R row = MST_IV_P_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_IV_P_R clone() {
		return (MST_IV_P_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_IV_P_R createInstance() {
		return (MST_IV_P_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_IV_P_R getValues(String... names) {
		return (MST_IV_P_R) super.getValues(names);
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
	 public MSW_IV_P_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_IV_P_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_IV_P_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_IV_P_KEY_R.TABLE_NAME);
	 }

	/**
	 * インボイス管理ＮＯ. Invoice management No..<p>
	 *
	 */
	public String iv_mng_no() {
		return getConstString(offset + 0, $iv_mng_no);
	}

	/**
	 * インボイス管理ＮＯ. Invoice management No..<p>
	 *
	 */
	public void iv_mng_no(String value) {
		setConstString(offset + 0, $iv_mng_no, value);
	}

	/**
	 * インボイス改訂番号. Invoice rev. number.<p>
	 *
	 */
	public MCNumber iv_rev() {
		return getConstNumber(offset + 1, $iv_rev);
	}

	/**
	 * インボイス改訂番号. Invoice rev. number.<p>
	 *
	 */
	public void iv_rev(MCNumber value) {
		setConstNumber(offset + 1, $iv_rev, value);
	}
	
	/**
	 * インボイス改訂番号. Invoice rev. number.<p>
	 *
	 */
	public void iv_rev(int value) {
		setConstNumber(offset + 1, $iv_rev, value);
	}
	
	/**
	 * インボイス改訂番号. Invoice rev. number.<p>
	 *
	 */
	public void iv_rev(long value) {
		setConstNumber(offset + 1, $iv_rev, value);
	}
	
	/**
	 * インボイス改訂番号. Invoice rev. number.<p>
	 *
	 */
	public void iv_rev(float value) {
		setConstNumber(offset + 1, $iv_rev, value);
	}
	
	/**
	 * インボイス改訂番号. Invoice rev. number.<p>
	 *
	 */
	public void iv_rev(double value) {
		setConstNumber(offset + 1, $iv_rev, value);
	}
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 2, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 2, $iv_no, value);
	}

	/**
	 * インボイス作成元区分. Invoice creating source type.<p>
	 *
	 */
	public String iv_src_typ() {
		return getConstString(offset + 3, $iv_src_typ);
	}

	/**
	 * インボイス作成元区分. Invoice creating source type.<p>
	 *
	 */
	public void iv_src_typ(String value) {
		setConstString(offset + 3, $iv_src_typ, value);
	}

	/**
	 * 完了予定日. Scheduled completion date.<p>
	 *
	 */
	public MCDate cmpl_schd_dt() {
		return getConstDate(offset + 4, $cmpl_schd_dt);
	}

	/**
	 * 完了予定日. Scheduled completion date.<p>
	 *
	 */
	public void cmpl_schd_dt(MCDate value) {
		setConstDate(offset + 4, $cmpl_schd_dt, value);
	}

	/**
	 * 取引予定日. Scheduled transaction date.<p>
	 *
	 */
	public MCDate trd_schd_dt() {
		return getConstDate(offset + 5, $trd_schd_dt);
	}

	/**
	 * 取引予定日. Scheduled transaction date.<p>
	 *
	 */
	public void trd_schd_dt(MCDate value) {
		setConstDate(offset + 5, $trd_schd_dt, value);
	}

	/**
	 * 完了日. Completion date.<p>
	 *
	 */
	public MCDate cmpl_dt() {
		return getConstDate(offset + 6, $cmpl_dt);
	}

	/**
	 * 完了日. Completion date.<p>
	 *
	 */
	public void cmpl_dt(MCDate value) {
		setConstDate(offset + 6, $cmpl_dt, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 7, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 7, $ac_dt, value);
	}

	/**
	 * インボイス日付. Invoice date.<p>
	 *
	 */
	public MCDate iv_dt() {
		return getConstDate(offset + 8, $iv_dt);
	}

	/**
	 * インボイス日付. Invoice date.<p>
	 *
	 */
	public void iv_dt(MCDate value) {
		setConstDate(offset + 8, $iv_dt, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 9, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 9, $trd_ptn_typ, value);
	}

	/**
	 * 出荷依頼先識別区分. Shipping requested identification type.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 10, $ship_rqst_id_typ);
	}

	/**
	 * 出荷依頼先識別区分. Shipping requested identification type.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 10, $ship_rqst_id_typ, value);
	}

	/**
	 * 出荷依頼先識別ＣＤ. Shipping requested alias cd..<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 11, $ship_rqst_id_cd);
	}

	/**
	 * 出荷依頼先識別ＣＤ. Shipping requested alias cd..<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 11, $ship_rqst_id_cd, value);
	}

	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 12, $tdlv_cd);
	}

	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 12, $tdlv_cd, value);
	}

	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 13, $tdlv_nm);
	}

	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 13, $tdlv_nm, value);
	}

	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 14, $tdlv_sundry_flg);
	}

	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 14, $tdlv_sundry_flg, value);
	}

	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 15, $via_dlv_typ);
	}

	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 15, $via_dlv_typ, value);
	}

	/**
	 * 配送先部署. Receiving point dept..<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 16, $tdlv_cntct_dpt);
	}

	/**
	 * 配送先部署. Receiving point dept..<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 16, $tdlv_cntct_dpt, value);
	}

	/**
	 * 配送先担当者. Receiving point PIC.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 17, $tdlv_cntct_psn);
	}

	/**
	 * 配送先担当者. Receiving point PIC.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 17, $tdlv_cntct_psn, value);
	}

	/**
	 * 配送先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 18, $tdlv_zip_cd);
	}

	/**
	 * 配送先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 18, $tdlv_zip_cd, value);
	}

	/**
	 * 配送先住所１. Receiving point address 1.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 19, $tdlv_addr1);
	}

	/**
	 * 配送先住所１. Receiving point address 1.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 19, $tdlv_addr1, value);
	}

	/**
	 * 配送先住所２. Receiving point address 2.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 20, $tdlv_addr2);
	}

	/**
	 * 配送先住所２. Receiving point address 2.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 20, $tdlv_addr2, value);
	}

	/**
	 * 配送先住所３. Receiving point address 3.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 21, $tdlv_addr3);
	}

	/**
	 * 配送先住所３. Receiving point address 3.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 21, $tdlv_addr3, value);
	}

	/**
	 * 配送先住所４. Receiving point address 4.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 22, $tdlv_addr4);
	}

	/**
	 * 配送先住所４. Receiving point address 4.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 22, $tdlv_addr4, value);
	}

	/**
	 * 配送先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 23, $tdlv_tel);
	}

	/**
	 * 配送先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 23, $tdlv_tel, value);
	}

	/**
	 * 配送先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 24, $tdlv_fax);
	}

	/**
	 * 配送先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 24, $tdlv_fax, value);
	}

	/**
	 * 配送先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return getConstString(offset + 25, $tdlv_lg_grp_cd);
	}

	/**
	 * 配送先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		setConstString(offset + 25, $tdlv_lg_grp_cd, value);
	}

	/**
	 * 納品先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 26, $dlv_id_typ);
	}

	/**
	 * 納品先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 26, $dlv_id_typ, value);
	}

	/**
	 * 納品先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 27, $dlv_id_cd);
	}

	/**
	 * 納品先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 27, $dlv_id_cd, value);
	}

	/**
	 * 納品先識別名. Delivery destination identification name.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 28, $dlv_id_nm);
	}

	/**
	 * 納品先識別名. Delivery destination identification name.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 28, $dlv_id_nm, value);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 29, $dlv_cntct_dpt);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 29, $dlv_cntct_dpt, value);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 30, $dlv_cntct_psn);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 30, $dlv_cntct_psn, value);
	}

	/**
	 * 納品先ＺＩＰ. ZIP (Delivery destination).<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 31, $dlv_zip_cd);
	}

	/**
	 * 納品先ＺＩＰ. ZIP (Delivery destination).<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 31, $dlv_zip_cd, value);
	}

	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 32, $dlv_addr1);
	}

	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 32, $dlv_addr1, value);
	}

	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 33, $dlv_addr2);
	}

	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 33, $dlv_addr2, value);
	}

	/**
	 * 納品先住所３. Address 3 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 34, $dlv_addr3);
	}

	/**
	 * 納品先住所３. Address 3 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 34, $dlv_addr3, value);
	}

	/**
	 * 納品先住所４. Address 4 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 35, $dlv_addr4);
	}

	/**
	 * 納品先住所４. Address 4 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 35, $dlv_addr4, value);
	}

	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 36, $dlv_tel);
	}

	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 36, $dlv_tel, value);
	}

	/**
	 * 納品先ＦＡＸ. FAX (Delivery destination).<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 37, $dlv_fax);
	}

	/**
	 * 納品先ＦＡＸ. FAX (Delivery destination).<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 37, $dlv_fax, value);
	}

	/**
	 * 納品先国ＣＤ. Delivery destination country cd..<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 38, $dlv_cntry_cd);
	}

	/**
	 * 納品先国ＣＤ. Delivery destination country cd..<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 38, $dlv_cntry_cd, value);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 39, $dlv_sundry_flg);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 39, $dlv_sundry_flg, value);
	}

	/**
	 * 輸送方法ＣＤ. Transportation method cd..<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 40, $trnspt_cd);
	}

	/**
	 * 輸送方法ＣＤ. Transportation method cd..<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 40, $trnspt_cd, value);
	}

	/**
	 * 船名／便名. Ship/flight name.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 41, $vssl_flght);
	}

	/**
	 * 船名／便名. Ship/flight name.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 41, $vssl_flght, value);
	}

	/**
	 * 船積港ＣＤ. Loading port cd..<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 42, $load_port_cd);
	}

	/**
	 * 船積港ＣＤ. Loading port cd..<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 42, $load_port_cd, value);
	}

	/**
	 * 船積予定日. Estimated date of loading.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 43, $etd_dt);
	}

	/**
	 * 船積予定日. Estimated date of loading.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 43, $etd_dt, value);
	}

	/**
	 * 船卸港ＣＤ. Unloading port cd..<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 44, $dschrg_port_cd);
	}

	/**
	 * 船卸港ＣＤ. Unloading port cd..<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 44, $dschrg_port_cd, value);
	}

	/**
	 * 船卸予定日. Estimated date of unloading.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 45, $eta_dt);
	}

	/**
	 * 船卸予定日. Estimated date of unloading.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 45, $eta_dt, value);
	}

	/**
	 * 経由地ＣＤ. Stopover point cd..<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 46, $via_port_cd);
	}

	/**
	 * 経由地ＣＤ. Stopover point cd..<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 46, $via_port_cd, value);
	}

	/**
	 * 経由予定日. Estimated stopover date.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 47, $via_schd_dt);
	}

	/**
	 * 経由予定日. Estimated stopover date.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 47, $via_schd_dt, value);
	}

	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 48, $sls_basis_typ);
	}

	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 48, $sls_basis_typ, value);
	}

	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 49, $prov_basis_typ);
	}

	/**
	 * 支給計上区分. Supply recording type.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 49, $prov_basis_typ, value);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 50, $tterm_cd1);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 50, $tterm_cd1, value);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 51, $tterm_rmrks1);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 51, $tterm_rmrks1, value);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 52, $tterm_cd2);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 52, $tterm_cd2, value);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 53, $tterm_rmrks2);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 53, $tterm_rmrks2, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 54, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 54, $trd_cur_cd, value);
	}

	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 55, $ptax_cur_cd);
	}

	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 55, $ptax_cur_cd, value);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 56, $tterm_cd3);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 56, $tterm_cd3, value);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 57, $tterm_rmrks3);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 57, $tterm_rmrks3, value);
	}

	/**
	 * 請求起算日. Billing base date.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 58, $bill_basis_dt);
	}

	/**
	 * 請求起算日. Billing base date.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 58, $bill_basis_dt, value);
	}

	/**
	 * 入金予定日. Scheduled payment receipt date.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 59, $rcv_schd_dt);
	}

	/**
	 * 入金予定日. Scheduled payment receipt date.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 59, $rcv_schd_dt, value);
	}

	/**
	 * 取引通貨金額合計. Amount total (Transaction currency).<p>
	 *
	 */
	public MCNumber ttl_trd_cur_amt() {
		return getConstNumber(offset + 60, $ttl_trd_cur_amt);
	}

	/**
	 * 取引通貨金額合計. Amount total (Transaction currency).<p>
	 *
	 */
	public void ttl_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 60, $ttl_trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額合計. Amount total (Transaction currency).<p>
	 *
	 */
	public void ttl_trd_cur_amt(int value) {
		setConstNumber(offset + 60, $ttl_trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額合計. Amount total (Transaction currency).<p>
	 *
	 */
	public void ttl_trd_cur_amt(long value) {
		setConstNumber(offset + 60, $ttl_trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額合計. Amount total (Transaction currency).<p>
	 *
	 */
	public void ttl_trd_cur_amt(float value) {
		setConstNumber(offset + 60, $ttl_trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額合計. Amount total (Transaction currency).<p>
	 *
	 */
	public void ttl_trd_cur_amt(double value) {
		setConstNumber(offset + 60, $ttl_trd_cur_amt, value);
	}
	
	/**
	 * 為替レート指定ＦＬＧ. Set exchange rate flg..<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 61, $xrate_inpt_flg);
	}

	/**
	 * 為替レート指定ＦＬＧ. Set exchange rate flg..<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 61, $xrate_inpt_flg, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 62, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 62, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 62, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 62, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 62, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 62, $xrate, value);
	}
	
	/**
	 * 納税為替レート指定FLG. Taxpaying exchange rate specification flg..<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 63, $ptax_xrate_inpt_flg);
	}

	/**
	 * 納税為替レート指定FLG. Taxpaying exchange rate specification flg..<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 63, $ptax_xrate_inpt_flg, value);
	}

	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 64, $ptax_xrate);
	}

	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 64, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 64, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 64, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 64, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 64, $ptax_xrate, value);
	}
	
	/**
	 * 純重量合計. Net weight total.<p>
	 *
	 */
	public MCNumber ttl_net_wt() {
		return getConstNumber(offset + 65, $ttl_net_wt);
	}

	/**
	 * 純重量合計. Net weight total.<p>
	 *
	 */
	public void ttl_net_wt(MCNumber value) {
		setConstNumber(offset + 65, $ttl_net_wt, value);
	}
	
	/**
	 * 純重量合計. Net weight total.<p>
	 *
	 */
	public void ttl_net_wt(int value) {
		setConstNumber(offset + 65, $ttl_net_wt, value);
	}
	
	/**
	 * 純重量合計. Net weight total.<p>
	 *
	 */
	public void ttl_net_wt(long value) {
		setConstNumber(offset + 65, $ttl_net_wt, value);
	}
	
	/**
	 * 純重量合計. Net weight total.<p>
	 *
	 */
	public void ttl_net_wt(float value) {
		setConstNumber(offset + 65, $ttl_net_wt, value);
	}
	
	/**
	 * 純重量合計. Net weight total.<p>
	 *
	 */
	public void ttl_net_wt(double value) {
		setConstNumber(offset + 65, $ttl_net_wt, value);
	}
	
	/**
	 * 総重量合計. Total gross weight.<p>
	 *
	 */
	public MCNumber ttl_grss_wt() {
		return getConstNumber(offset + 66, $ttl_grss_wt);
	}

	/**
	 * 総重量合計. Total gross weight.<p>
	 *
	 */
	public void ttl_grss_wt(MCNumber value) {
		setConstNumber(offset + 66, $ttl_grss_wt, value);
	}
	
	/**
	 * 総重量合計. Total gross weight.<p>
	 *
	 */
	public void ttl_grss_wt(int value) {
		setConstNumber(offset + 66, $ttl_grss_wt, value);
	}
	
	/**
	 * 総重量合計. Total gross weight.<p>
	 *
	 */
	public void ttl_grss_wt(long value) {
		setConstNumber(offset + 66, $ttl_grss_wt, value);
	}
	
	/**
	 * 総重量合計. Total gross weight.<p>
	 *
	 */
	public void ttl_grss_wt(float value) {
		setConstNumber(offset + 66, $ttl_grss_wt, value);
	}
	
	/**
	 * 総重量合計. Total gross weight.<p>
	 *
	 */
	public void ttl_grss_wt(double value) {
		setConstNumber(offset + 66, $ttl_grss_wt, value);
	}
	
	/**
	 * 容積合計. Total volume.<p>
	 *
	 */
	public MCNumber ttl_dim() {
		return getConstNumber(offset + 67, $ttl_dim);
	}

	/**
	 * 容積合計. Total volume.<p>
	 *
	 */
	public void ttl_dim(MCNumber value) {
		setConstNumber(offset + 67, $ttl_dim, value);
	}
	
	/**
	 * 容積合計. Total volume.<p>
	 *
	 */
	public void ttl_dim(int value) {
		setConstNumber(offset + 67, $ttl_dim, value);
	}
	
	/**
	 * 容積合計. Total volume.<p>
	 *
	 */
	public void ttl_dim(long value) {
		setConstNumber(offset + 67, $ttl_dim, value);
	}
	
	/**
	 * 容積合計. Total volume.<p>
	 *
	 */
	public void ttl_dim(float value) {
		setConstNumber(offset + 67, $ttl_dim, value);
	}
	
	/**
	 * 容積合計. Total volume.<p>
	 *
	 */
	public void ttl_dim(double value) {
		setConstNumber(offset + 67, $ttl_dim, value);
	}
	
	/**
	 * インボイス備考. Invoice remarks.<p>
	 *
	 */
	public String iv_rmrks() {
		return getConstString(offset + 68, $iv_rmrks);
	}

	/**
	 * インボイス備考. Invoice remarks.<p>
	 *
	 */
	public void iv_rmrks(String value) {
		setConstString(offset + 68, $iv_rmrks, value);
	}

	/**
	 * パッキングリスト備考. Packing list remarks.<p>
	 *
	 */
	public String pl_rmrks() {
		return getConstString(offset + 69, $pl_rmrks);
	}

	/**
	 * パッキングリスト備考. Packing list remarks.<p>
	 *
	 */
	public void pl_rmrks(String value) {
		setConstString(offset + 69, $pl_rmrks, value);
	}

	/**
	 * ケースマーク１. Case mark 1.<p>
	 *
	 */
	public String case_mrk1() {
		return getConstString(offset + 70, $case_mrk1);
	}

	/**
	 * ケースマーク１. Case mark 1.<p>
	 *
	 */
	public void case_mrk1(String value) {
		setConstString(offset + 70, $case_mrk1, value);
	}

	/**
	 * ケースマーク２. Case mark 2.<p>
	 *
	 */
	public String case_mrk2() {
		return getConstString(offset + 71, $case_mrk2);
	}

	/**
	 * ケースマーク２. Case mark 2.<p>
	 *
	 */
	public void case_mrk2(String value) {
		setConstString(offset + 71, $case_mrk2, value);
	}

	/**
	 * ケースマーク３. Case mark 3.<p>
	 *
	 */
	public String case_mrk3() {
		return getConstString(offset + 72, $case_mrk3);
	}

	/**
	 * ケースマーク３. Case mark 3.<p>
	 *
	 */
	public void case_mrk3(String value) {
		setConstString(offset + 72, $case_mrk3, value);
	}

	/**
	 * ケースマーク４. Case mark 4.<p>
	 *
	 */
	public String case_mrk4() {
		return getConstString(offset + 73, $case_mrk4);
	}

	/**
	 * ケースマーク４. Case mark 4.<p>
	 *
	 */
	public void case_mrk4(String value) {
		setConstString(offset + 73, $case_mrk4, value);
	}

	/**
	 * ケースマーク５. Case mark 5.<p>
	 *
	 */
	public String case_mrk5() {
		return getConstString(offset + 74, $case_mrk5);
	}

	/**
	 * ケースマーク５. Case mark 5.<p>
	 *
	 */
	public void case_mrk5(String value) {
		setConstString(offset + 74, $case_mrk5, value);
	}

	/**
	 * ケースマーク６. Case mark 6.<p>
	 *
	 */
	public String case_mrk6() {
		return getConstString(offset + 75, $case_mrk6);
	}

	/**
	 * ケースマーク６. Case mark 6.<p>
	 *
	 */
	public void case_mrk6(String value) {
		setConstString(offset + 75, $case_mrk6, value);
	}

	/**
	 * Ｌ／ＣＮＯ. L/C No..<p>
	 *
	 */
	public String lc_no() {
		return getConstString(offset + 76, $lc_no);
	}

	/**
	 * Ｌ／ＣＮＯ. L/C No..<p>
	 *
	 */
	public void lc_no(String value) {
		setConstString(offset + 76, $lc_no, value);
	}

	/**
	 * Ｌ／Ｃ日付. L/C Date.<p>
	 *
	 */
	public MCDate lc_dt() {
		return getConstDate(offset + 77, $lc_dt);
	}

	/**
	 * Ｌ／Ｃ日付. L/C Date.<p>
	 *
	 */
	public void lc_dt(MCDate value) {
		setConstDate(offset + 77, $lc_dt, value);
	}

	/**
	 * Ｌ／Ｃ備考. L/C remarks.<p>
	 *
	 */
	public String lc_rmrks() {
		return getConstString(offset + 78, $lc_rmrks);
	}

	/**
	 * Ｌ／Ｃ備考. L/C remarks.<p>
	 *
	 */
	public void lc_rmrks(String value) {
		setConstString(offset + 78, $lc_rmrks, value);
	}

	/**
	 * Ｂ／ＬＮＯ. B/L No..<p>
	 *
	 */
	public String bl_no() {
		return getConstString(offset + 79, $bl_no);
	}

	/**
	 * Ｂ／ＬＮＯ. B/L No..<p>
	 *
	 */
	public void bl_no(String value) {
		setConstString(offset + 79, $bl_no, value);
	}

	/**
	 * Ｂ／Ｌ日付. B/L date.<p>
	 *
	 */
	public MCDate bl_dt() {
		return getConstDate(offset + 80, $bl_dt);
	}

	/**
	 * Ｂ／Ｌ日付. B/L date.<p>
	 *
	 */
	public void bl_dt(MCDate value) {
		setConstDate(offset + 80, $bl_dt, value);
	}

	/**
	 * Ｂ／Ｌ備考. B/L remarks.<p>
	 *
	 */
	public String bl_rmrks() {
		return getConstString(offset + 81, $bl_rmrks);
	}

	/**
	 * Ｂ／Ｌ備考. B/L remarks.<p>
	 *
	 */
	public void bl_rmrks(String value) {
		setConstString(offset + 81, $bl_rmrks, value);
	}

	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 82, $ship_fr_lg_grp_cd);
	}

	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 82, $ship_fr_lg_grp_cd, value);
	}

	/**
	 * パッキングリスト登録ＦＬＧ. Packing list entry flg..<p>
	 *
	 */
	public boolean pl_reg_flg() {
		return getConstBoolean(offset + 83, $pl_reg_flg);
	}

	/**
	 * パッキングリスト登録ＦＬＧ. Packing list entry flg..<p>
	 *
	 */
	public void pl_reg_flg(boolean value) {
		setConstBoolean(offset + 83, $pl_reg_flg, value);
	}

	/**
	 * パッキングリスト省略ＦＬＧ. Packing list omission flg..<p>
	 *
	 */
	public boolean pl_skip_flg() {
		return getConstBoolean(offset + 84, $pl_skip_flg);
	}

	/**
	 * パッキングリスト省略ＦＬＧ. Packing list omission flg..<p>
	 *
	 */
	public void pl_skip_flg(boolean value) {
		setConstBoolean(offset + 84, $pl_skip_flg, value);
	}

	/**
	 * 完了ＦＬＧ. Completed flg..<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 85, $cmpl_flg);
	}

	/**
	 * 完了ＦＬＧ. Completed flg..<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 85, $cmpl_flg, value);
	}

	/**
	 * 完了対象外ＦＬＧ. Not to complete flg..<p>
	 *
	 */
	public boolean non_cmpl_flg() {
		return getConstBoolean(offset + 86, $non_cmpl_flg);
	}

	/**
	 * 完了対象外ＦＬＧ. Not to complete flg..<p>
	 *
	 */
	public void non_cmpl_flg(boolean value) {
		setConstBoolean(offset + 86, $non_cmpl_flg, value);
	}

	/**
	 * インボイス単位出荷ＦＬＧ. Shipping invoice unit flg..<p>
	 *
	 */
	public boolean iv_ship_flg() {
		return getConstBoolean(offset + 87, $iv_ship_flg);
	}

	/**
	 * インボイス単位出荷ＦＬＧ. Shipping invoice unit flg..<p>
	 *
	 */
	public void iv_ship_flg(boolean value) {
		setConstBoolean(offset + 87, $iv_ship_flg, value);
	}

	/**
	 * インボイス発行済ＦＬＧ. Invoice issued flg..<p>
	 *
	 */
	public boolean iv_prnt_flg() {
		return getConstBoolean(offset + 88, $iv_prnt_flg);
	}

	/**
	 * インボイス発行済ＦＬＧ. Invoice issued flg..<p>
	 *
	 */
	public void iv_prnt_flg(boolean value) {
		setConstBoolean(offset + 88, $iv_prnt_flg, value);
	}

	/**
	 * パッキングリスト発行済ＦＬＧ. Packing list issued flg..<p>
	 *
	 */
	public boolean pl_prnt_flg() {
		return getConstBoolean(offset + 89, $pl_prnt_flg);
	}

	/**
	 * パッキングリスト発行済ＦＬＧ. Packing list issued flg..<p>
	 *
	 */
	public void pl_prnt_flg(boolean value) {
		setConstBoolean(offset + 89, $pl_prnt_flg, value);
	}

	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 90, $rcpt_iv_mng_no);
	}

	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 90, $rcpt_iv_mng_no, value);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 91, $rcpt_iv_no);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 91, $rcpt_iv_no, value);
	}

	/**
	 * 受領インボイス仮登録ＦＬＧ. Purchase invoice temporary entry flg..<p>
	 *
	 */
	public boolean pre_rcpt_iv_flg() {
		return getConstBoolean(offset + 92, $pre_rcpt_iv_flg);
	}

	/**
	 * 受領インボイス仮登録ＦＬＧ. Purchase invoice temporary entry flg..<p>
	 *
	 */
	public void pre_rcpt_iv_flg(boolean value) {
		setConstBoolean(offset + 92, $pre_rcpt_iv_flg, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 93, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 93, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 94, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 94, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 95, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 95, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 96, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 96, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 97, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 97, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 98, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 98, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 99, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 99, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 100, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 100, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 101, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 101, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 101, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 101, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 101, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 101, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 102, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 102, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 103, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 103, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 104, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 104, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 105, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 105, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 106, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 106, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			return iv_src_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
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
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
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
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			return iv_rmrks();
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			return pl_rmrks();
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			return case_mrk1();
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			return case_mrk2();
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			return case_mrk3();
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			return case_mrk4();
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			return case_mrk5();
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			return case_mrk6();
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			return lc_no();
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			return lc_rmrks();
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			return bl_no();
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			return bl_rmrks();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
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
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			return ttl_net_wt();
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			return ttl_grss_wt();
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			return ttl_dim();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			return cmpl_schd_dt();
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			return trd_schd_dt();
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			return cmpl_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
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
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			return pl_reg_flg();
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			return pl_skip_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			return non_cmpl_flg();
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			return iv_ship_flg();
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			return iv_prnt_flg();
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			return pl_prnt_flg();
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			return pre_rcpt_iv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			return iv_src_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
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
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
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
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			return iv_rmrks();
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			return pl_rmrks();
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			return case_mrk1();
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			return case_mrk2();
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			return case_mrk3();
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			return case_mrk4();
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			return case_mrk5();
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			return case_mrk6();
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			return lc_no();
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			return lc_rmrks();
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			return bl_no();
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			return bl_rmrks();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
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
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			return ttl_net_wt();
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			return ttl_grss_wt();
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			return ttl_dim();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			return cmpl_schd_dt();
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			return trd_schd_dt();
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			return cmpl_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
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
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			return pl_reg_flg();
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			return pl_skip_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			return non_cmpl_flg();
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			return iv_ship_flg();
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			return iv_prnt_flg();
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			return pl_prnt_flg();
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			return pre_rcpt_iv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			iv_src_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
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
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
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
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			iv_rmrks(value);
			return;
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			pl_rmrks(value);
			return;
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			case_mrk1(value);
			return;
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			case_mrk2(value);
			return;
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			case_mrk3(value);
			return;
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			case_mrk4(value);
			return;
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			case_mrk5(value);
			return;
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			case_mrk6(value);
			return;
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			lc_no(value);
			return;
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			lc_rmrks(value);
			return;
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			bl_no(value);
			return;
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			bl_rmrks(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
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
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
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
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
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
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
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
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
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
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
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
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			cmpl_schd_dt(value);
			return;
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			trd_schd_dt(value);
			return;
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			cmpl_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			lc_dt(value);
			return;
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			bl_dt(value);
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
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
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
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			pl_reg_flg(value);
			return;
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			pl_skip_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			non_cmpl_flg(value);
			return;
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			iv_ship_flg(value);
			return;
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			iv_prnt_flg(value);
			return;
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			pl_prnt_flg(value);
			return;
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			pre_rcpt_iv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			iv_src_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
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
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
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
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			iv_rmrks(value);
			return;
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			pl_rmrks(value);
			return;
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			case_mrk1(value);
			return;
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			case_mrk2(value);
			return;
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			case_mrk3(value);
			return;
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			case_mrk4(value);
			return;
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			case_mrk5(value);
			return;
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			case_mrk6(value);
			return;
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			lc_no(value);
			return;
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			lc_rmrks(value);
			return;
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			bl_no(value);
			return;
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			bl_rmrks(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
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
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
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
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
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
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
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
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
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
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
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
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			cmpl_schd_dt(value);
			return;
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			trd_schd_dt(value);
			return;
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			cmpl_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			lc_dt(value);
			return;
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			bl_dt(value);
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
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
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
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			pl_reg_flg(value);
			return;
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			pl_skip_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			non_cmpl_flg(value);
			return;
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			iv_ship_flg(value);
			return;
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			iv_prnt_flg(value);
			return;
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			pl_prnt_flg(value);
			return;
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			pre_rcpt_iv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
