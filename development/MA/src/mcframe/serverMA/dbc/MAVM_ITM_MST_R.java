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
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBinaryPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "品目マスタビュー // Item master view"DBコンテナRowクラスです。<p>
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
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目区分</td>
 *  	<td>Item type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_d_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目区分詳細ＣＤ</td>
 *  	<td>Item type details cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_jnl_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目仕訳ＣＤ</td>
 *  	<td>Item journal cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計品目分類ＣＤ</td>
 *  	<td>Accounting item classification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>minus_stk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マイナス在庫許可ＦＬＧ</td>
 *  	<td>Allow negative inventory flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_new_lot_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>新規ロット入力不可ＦＬＧ</td>
 *  	<td>Do not allow new lot input flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_alloc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫引当確認ＦＬＧ</td>
 *  	<td>GI allocation check flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上税ＣＤ</td>
 *  	<td>Sales tax cd.</td>
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
 *  	<td>ship_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷単位ＣＤ</td>
 *  	<td>Shipping unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造単位ＣＤ</td>
 *  	<td>Mfg. unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注単位ＣＤ</td>
 *  	<td>PO unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pckg_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>梱包単位ＣＤ</td>
 *  	<td>Packing unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pack_alloc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>荷姿引当ＦＬＧ</td>
 *  	<td>SKU allocation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット管理区分</td>
 *  	<td>Lot management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_no_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ発番区分</td>
 *  	<td>Lot No. numbering type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_no_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ発番パタンＣＤ</td>
 *  	<td>Lot No. numbering pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロット管理区分</td>
 *  	<td>Sublot management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_no_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ発番区分</td>
 *  	<td>Sublot No. numbering type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_no_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ発番パタンＣＤ</td>
 *  	<td>Sublot No. numbering pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_lot_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業者ロットＮＯ必須ＦＬＧ</td>
 *  	<td>Vendor Lot No. required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_bind_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査実施単位区分</td>
 *  	<td>Inspection implementation unit type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>skip_chk_ship_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷時構成チェック不要ＦＬＧ</td>
 *  	<td>Component check not required at shipping flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrkt_judg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>市場出荷判定対象ＦＬＧ</td>
 *  	<td>For market release decision flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrkt_judg_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>市場出荷判定承認役割ＣＤ</td>
 *  	<td>Market release decision approval role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrkt_judg_upd_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>市場出荷判定更新役割ＣＤ</td>
 *  	<td>Market release decision update role cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lmt_ctl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期限管理対象ＦＬＧ</td>
 *  	<td>For expiration management flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lmt_ctl_categ</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期限管理種別</td>
 *  	<td>Expiration management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cont_fctr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>有効成分対象ＦＬＧ</td>
 *  	<td>For active ingredient flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cont_fctr</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準有効成分係数</td>
 *  	<td>Standard active ingredient coefficient</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cont_fctr_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分単位ＣＤ</td>
 *  	<td>Active ingredient unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cont_fctr_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分換算端数処理区分</td>
 *  	<td>Rounding type (Active ingredient conversion)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cont_fctr_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分小数部有効桁数</td>
 *  	<td>Active ingredient number of decimal places</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１管理区分</td>
 *  	<td>SEIBAN No. 1 management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_sno1_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注手配ＮＯ１必須ＦＬＧ</td>
 *  	<td>Sales order SEIBAN No. 1 required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqmt_sno1_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>所要手配ＮＯ１必須ＦＬＧ</td>
 *  	<td>Requirements SEIBAN No. 1 required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1_num_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１発番区分</td>
 *  	<td>SEIBAN No. 1 numbering type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１発番パタンＣＤ</td>
 *  	<td>SEIBAN No. 1 numbering pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２管理区分</td>
 *  	<td>SEIBAN No. 2 management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_sno2_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注手配ＮＯ２必須ＦＬＧ</td>
 *  	<td>Sales order SEIBAN No. 2 required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqmt_sno2_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>所要手配ＮＯ２必須ＦＬＧ</td>
 *  	<td>Requirements SEIBAN No. 2 required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2_num_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２発番区分</td>
 *  	<td>SEIBAN No. 2 numbering type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２発番パタンＣＤ</td>
 *  	<td>SEIBAN No. 2 numbering pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３管理区分</td>
 *  	<td>SEIBAN No. 3 management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_sno3_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注手配ＮＯ３必須ＦＬＧ</td>
 *  	<td>Sales order SEIBAN No. 3 required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqmt_sno3_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>所要手配ＮＯ３必須ＦＬＧ</td>
 *  	<td>Requirements SEIBAN No. 3 required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3_num_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３発番区分</td>
 *  	<td>SEIBAN No. 3 numbering type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３発番パタンＣＤ</td>
 *  	<td>SEIBAN No. 3 numbering pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４管理区分</td>
 *  	<td>SEIBAN No. 4 management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_sno4_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注手配ＮＯ４必須ＦＬＧ</td>
 *  	<td>Sales order SEIBAN No. 4 required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqmt_sno4_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>所要手配ＮＯ４必須ＦＬＧ</td>
 *  	<td>Requirements SEIBAN No. 4 required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4_num_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４発番区分</td>
 *  	<td>SEIBAN No. 4 numbering type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４発番パタンＣＤ</td>
 *  	<td>SEIBAN No. 4 numbering pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_bom_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>構成パタン</td>
 *  	<td>BOM pattern</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_unit_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図単位区分</td>
 *  	<td>Mfg. order unit type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_proc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＲＰ処理区分</td>
 *  	<td>MRP process type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqmt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>所要区分</td>
 *  	<td>Requirements type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prod_pln_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>生産計画立案区分</td>
 *  	<td>Production planning type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dmnd_date_div_mons</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>需要日ばらし月数</td>
 *  	<td>Number of months for demand disaggregation by day</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_margin_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当余裕日数</td>
 *  	<td>Allocation extra days</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_alloc_margin_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＲＰ引当余裕日数</td>
 *  	<td>MRP allocation extra days</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_opn_xfr_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＲＰ未確定移送依頼考慮日数</td>
 *  	<td>Days to consider unfirm transport request in MRP</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqmt_rstr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>所要抑制量</td>
 *  	<td>Requirements restricted qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_itm_add_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入品追加許可ＦＬＧ</td>
 *  	<td>Allow input item addition flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_itm_del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入品削除許可ＦＬＧ</td>
 *  	<td>Allow input item deletion flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sch_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>スケジューラＦＬＧ</td>
 *  	<td>Scheduler flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cntry_org_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>原産地ＣＤ</td>
 *  	<td>Place of origin cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>comp_spec_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>構成・仕様管理区分</td>
 *  	<td>Configuration/specification management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>comp_rev_at_slo_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注時構成改訂許可ＦＬＧ</td>
 *  	<td>Allow sales order configuration rev. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>comp_core_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成主品目ＦＬＧ</td>
 *  	<td>Configuration main item flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_spec_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕様分類ＣＤ</td>
 *  	<td>Item specification classification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_upri_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売単価分類ＣＤ</td>
 *  	<td>Sales unit price classification cd.</td>
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
 *  	<td>slo_proc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注手配品ＦＬＧ</td>
 *  	<td>Sales order procurement item flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_proc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注手配区分</td>
 *  	<td>Sales order procurement type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_inst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷指図区分</td>
 *  	<td>Shipping order type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_lot_back_stop_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷ロット逆転禁止ＦＬＧ</td>
 *  	<td>Shipping lot reverse prohibit flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_ship_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目出荷グループＣＤ</td>
 *  	<td>Item shipping group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_valid_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷有効期限グループＣＤ</td>
 *  	<td>Shipping expiration date group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_skip_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷不要ＦＬＧ</td>
 *  	<td>Not receipt flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_dlv_slip_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買納品書対象ＦＬＧ</td>
 *  	<td>Purchase delivery note target flg.</td>
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
 *  	<td>exim_xpns_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>輸出入諸掛区分</td>
 *  	<td>Import/export charges type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_lst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>現品票出力対象ＦＬＧ</td>
 *  	<td>For identification tag output flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ver_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>版管理対象ＦＬＧ</td>
 *  	<td>For version control flg.</td>
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
 *  	<td>purc_upri_cng_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買単価変更許可ＦＬＧ</td>
 *  	<td>Allow purchasing unit price change flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_upri_cng_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支給単価変更許可ＦＬＧ</td>
 *  	<td>Allow supply unit price change flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ref_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>参照品目ＣＤ</td>
 *  	<td>Reference item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ref_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>参照枝番１</td>
 *  	<td>Reference branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ref_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>参照枝番２</td>
 *  	<td>Reference branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ref_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>参照枝番３</td>
 *  	<td>Reference branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_sys_no_itm</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムＮＯ</td>
 *  	<td>External system No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chng_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>変更ＮＯ</td>
 *  	<td>Change No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算パタンＣＤ</td>
 *  	<td>Calculation pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cost_std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>原価基準数量</td>
 *  	<td>Cost base qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alc_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目配賦グループ</td>
 *  	<td>Item allocation group</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売ＦＬＧ</td>
 *  	<td>Sales flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造ＦＬＧ</td>
 *  	<td>Mfg. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買ＦＬＧ</td>
 *  	<td>Purchasing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査ＦＬＧ</td>
 *  	<td>Inspection flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_input_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売設定済ＦＬＧ</td>
 *  	<td>Sales configured flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_input_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造設定済ＦＬＧ</td>
 *  	<td>Mfg. configured flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_input_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買設定済ＦＬＧ</td>
 *  	<td>Purchase configured flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_input_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査設定済ＦＬＧ</td>
 *  	<td>Inspection configured flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>release_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>リリースＦＬＧ</td>
 *  	<td>Release flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>release_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>リリース担当者ＣＤ</td>
 *  	<td>Release PIC name cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>release_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>リリース日時</td>
 *  	<td>Release date and time</td>
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
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名１</td>
 *  	<td>Item alias name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名２</td>
 *  	<td>Item alias name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名３</td>
 *  	<td>Item alias name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名４</td>
 *  	<td>Item alias name 4</td>
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
 *  	<td>stk_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫管理区分</td>
 *  	<td>Inventory management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asset_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産管理区分</td>
 *  	<td>Asset management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sundry_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>諸口品ＦＬＧ</td>
 *  	<td>Miscellaneous item flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dscnt_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>値引品目ＦＬＧ</td>
 *  	<td>Discount item flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単位ＣＤ</td>
 *  	<td>Unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>小数部有効桁数</td>
 *  	<td>Number of decimal places</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>端数処理区分</td>
 *  	<td>Rounding type</td>
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
 *  	<td>dim</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>容積</td>
 *  	<td>Volume</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wt_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>重量単位ＣＤ</td>
 *  	<td>Weight unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>重量</td>
 *  	<td>Weight</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>conts_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入り目単位ＣＤ</td>
 *  	<td>Conversion unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>conts_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入り目数量</td>
 *  	<td>Conversion qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unit_dim</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位容積（ｍ３）</td>
 *  	<td>Unit volume (m3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_wt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位重量（ＫＧ）</td>
 *  	<td>Unit weight (KG)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>hs_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＨＳ ＣＤ</td>
 *  	<td>HS cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>jan_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＪＡＮ区分</td>
 *  	<td>JAN type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>jan_cd</td>
 *  	<td>C</td>
 *  	<td>13</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＪＡＮ ＣＤ</td>
 *  	<td>JAN cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itf_cd</td>
 *  	<td>C</td>
 *  	<td>16</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＴＦ ＣＤ</td>
 *  	<td>ITF cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gtin_cd</td>
 *  	<td>C</td>
 *  	<td>14</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＧＴＩＮ ＣＤ</td>
 *  	<td>GTIN cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>th_image</td>
 *  	<td>B</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サムネイル画像</td>
 *  	<td>Thumbnail image</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売品目体系ＣＤ</td>
 *  	<td>Sales item system cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目名（ロケール１）</td>
 *  	<td>Item name (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目名（ロケール２）</td>
 *  	<td>Item name (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目名（ロケール３）</td>
 *  	<td>Item name (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目名（ロケール４）</td>
 *  	<td>Item name (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目名（ロケール５）</td>
 *  	<td>Item name (Locale5)</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_ITM_MST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_ITM_MST";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 品目区分. Item type.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	private static final MCPermColumnInfo _itm_typ = createColumnInfo("itm_typ");
	public final MCStringPermColumn itm_typ = createStringColumn(_itm_typ);
	
	/**
	 * 品目区分詳細ＣＤ. Item type details cd..<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	private static final MCPermColumnInfo _itm_typ_d_cd = createColumnInfo("itm_typ_d_cd");
	public final MCStringPermColumn itm_typ_d_cd = createStringColumn(_itm_typ_d_cd);
	
	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	private static final MCPermColumnInfo _itm_jnl_cd = createColumnInfo("itm_jnl_cd");
	public final MCStringPermColumn itm_jnl_cd = createStringColumn(_itm_jnl_cd);
	
	/**
	 * 会計品目分類ＣＤ. Accounting item classification cd..<p>
	 *
	 */
	public static final String $ac_itm_grp_cd = "ac_itm_grp_cd";
	private static final MCPermColumnInfo _ac_itm_grp_cd = createColumnInfo("ac_itm_grp_cd");
	public final MCStringPermColumn ac_itm_grp_cd = createStringColumn(_ac_itm_grp_cd);
	
	/**
	 * マイナス在庫許可ＦＬＧ. Allow negative inventory flg..<p>
	 *
	 */
	public static final String $minus_stk_flg = "minus_stk_flg";
	private static final MCPermColumnInfo _minus_stk_flg = createColumnInfo("minus_stk_flg");
	public final MCBooleanPermColumn minus_stk_flg = createBooleanColumn(_minus_stk_flg);
	
	/**
	 * 新規ロット入力不可ＦＬＧ. Do not allow new lot input flg..<p>
	 *
	 */
	public static final String $not_new_lot_flg = "not_new_lot_flg";
	private static final MCPermColumnInfo _not_new_lot_flg = createColumnInfo("not_new_lot_flg");
	public final MCBooleanPermColumn not_new_lot_flg = createBooleanColumn(_not_new_lot_flg);
	
	/**
	 * 出庫引当確認ＦＬＧ. GI allocation check flg..<p>
	 *
	 */
	public static final String $gi_alloc_flg = "gi_alloc_flg";
	private static final MCPermColumnInfo _gi_alloc_flg = createColumnInfo("gi_alloc_flg");
	public final MCBooleanPermColumn gi_alloc_flg = createBooleanColumn(_gi_alloc_flg);
	
	/**
	 * 売上税ＣＤ. Sales tax cd..<p>
	 *
	 */
	public static final String $sls_tax_cd = "sls_tax_cd";
	private static final MCPermColumnInfo _sls_tax_cd = createColumnInfo("sls_tax_cd");
	public final MCStringPermColumn sls_tax_cd = createStringColumn(_sls_tax_cd);
	
	/**
	 * 仕入税ＣＤ. Purchase tax cd..<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	private static final MCPermColumnInfo _purc_tax_cd = createColumnInfo("purc_tax_cd");
	public final MCStringPermColumn purc_tax_cd = createStringColumn(_purc_tax_cd);
	
	/**
	 * 支給税ＣＤ. Supply tax cd..<p>
	 *
	 */
	public static final String $prov_tax_cd = "prov_tax_cd";
	private static final MCPermColumnInfo _prov_tax_cd = createColumnInfo("prov_tax_cd");
	public final MCStringPermColumn prov_tax_cd = createStringColumn(_prov_tax_cd);
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	private static final MCPermColumnInfo _wtax_rate = createColumnInfo("wtax_rate");
	public final MCNumberPermColumn wtax_rate = createNumberColumn(_wtax_rate);
	
	/**
	 * 出荷単位ＣＤ. Shipping unit cd..<p>
	 *
	 */
	public static final String $ship_unit_cd = "ship_unit_cd";
	private static final MCPermColumnInfo _ship_unit_cd = createColumnInfo("ship_unit_cd");
	public final MCStringPermColumn ship_unit_cd = createStringColumn(_ship_unit_cd);
	
	/**
	 * 製造単位ＣＤ. Mfg. unit cd..<p>
	 *
	 */
	public static final String $mfg_unit_cd = "mfg_unit_cd";
	private static final MCPermColumnInfo _mfg_unit_cd = createColumnInfo("mfg_unit_cd");
	public final MCStringPermColumn mfg_unit_cd = createStringColumn(_mfg_unit_cd);
	
	/**
	 * 発注単位ＣＤ. PO unit cd..<p>
	 *
	 */
	public static final String $purc_unit_cd = "purc_unit_cd";
	private static final MCPermColumnInfo _purc_unit_cd = createColumnInfo("purc_unit_cd");
	public final MCStringPermColumn purc_unit_cd = createStringColumn(_purc_unit_cd);
	
	/**
	 * 梱包単位ＣＤ. Packing unit cd..<p>
	 *
	 */
	public static final String $pckg_unit_cd = "pckg_unit_cd";
	private static final MCPermColumnInfo _pckg_unit_cd = createColumnInfo("pckg_unit_cd");
	public final MCStringPermColumn pckg_unit_cd = createStringColumn(_pckg_unit_cd);
	
	/**
	 * 荷姿引当ＦＬＧ. SKU allocation flg..<p>
	 *
	 */
	public static final String $pack_alloc_flg = "pack_alloc_flg";
	private static final MCPermColumnInfo _pack_alloc_flg = createColumnInfo("pack_alloc_flg");
	public final MCBooleanPermColumn pack_alloc_flg = createBooleanColumn(_pack_alloc_flg);
	
	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	private static final MCPermColumnInfo _lot_mng_typ = createColumnInfo("lot_mng_typ");
	public final MCStringPermColumn lot_mng_typ = createStringColumn(_lot_mng_typ);
	
	/**
	 * ロットＮＯ発番区分. Lot No. numbering type.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	private static final MCPermColumnInfo _lot_no_typ = createColumnInfo("lot_no_typ");
	public final MCStringPermColumn lot_no_typ = createStringColumn(_lot_no_typ);
	
	/**
	 * ロットＮＯ発番パタンＣＤ. Lot No. numbering pattern cd..<p>
	 *
	 */
	public static final String $lot_no_ptn_cd = "lot_no_ptn_cd";
	private static final MCPermColumnInfo _lot_no_ptn_cd = createColumnInfo("lot_no_ptn_cd");
	public final MCStringPermColumn lot_no_ptn_cd = createStringColumn(_lot_no_ptn_cd);
	
	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	private static final MCPermColumnInfo _sublot_mng_typ = createColumnInfo("sublot_mng_typ");
	public final MCStringPermColumn sublot_mng_typ = createStringColumn(_sublot_mng_typ);
	
	/**
	 * サブロットＮＯ発番区分. Sublot No. numbering type.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
	private static final MCPermColumnInfo _sublot_no_typ = createColumnInfo("sublot_no_typ");
	public final MCStringPermColumn sublot_no_typ = createStringColumn(_sublot_no_typ);
	
	/**
	 * サブロットＮＯ発番パタンＣＤ. Sublot No. numbering pattern cd..<p>
	 *
	 */
	public static final String $sublot_no_ptn_cd = "sublot_no_ptn_cd";
	private static final MCPermColumnInfo _sublot_no_ptn_cd = createColumnInfo("sublot_no_ptn_cd");
	public final MCStringPermColumn sublot_no_ptn_cd = createStringColumn(_sublot_no_ptn_cd);
	
	/**
	 * 業者ロットＮＯ必須ＦＬＧ. Vendor Lot No. required flg..<p>
	 *
	 */
	public static final String $bp_lot_flg = "bp_lot_flg";
	private static final MCPermColumnInfo _bp_lot_flg = createColumnInfo("bp_lot_flg");
	public final MCBooleanPermColumn bp_lot_flg = createBooleanColumn(_bp_lot_flg);
	
	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public static final String $insp_bind_typ = "insp_bind_typ";
	private static final MCPermColumnInfo _insp_bind_typ = createColumnInfo("insp_bind_typ");
	public final MCStringPermColumn insp_bind_typ = createStringColumn(_insp_bind_typ);
	
	/**
	 * 出荷時構成チェック不要ＦＬＧ. Component check not required at shipping flg..<p>
	 *
	 */
	public static final String $skip_chk_ship_flg = "skip_chk_ship_flg";
	private static final MCPermColumnInfo _skip_chk_ship_flg = createColumnInfo("skip_chk_ship_flg");
	public final MCBooleanPermColumn skip_chk_ship_flg = createBooleanColumn(_skip_chk_ship_flg);
	
	/**
	 * 市場出荷判定対象ＦＬＧ. For market release decision flg..<p>
	 *
	 */
	public static final String $mrkt_judg_flg = "mrkt_judg_flg";
	private static final MCPermColumnInfo _mrkt_judg_flg = createColumnInfo("mrkt_judg_flg");
	public final MCBooleanPermColumn mrkt_judg_flg = createBooleanColumn(_mrkt_judg_flg);
	
	/**
	 * 市場出荷判定承認役割ＣＤ. Market release decision approval role cd..<p>
	 *
	 */
	public static final String $mrkt_judg_role_cd = "mrkt_judg_role_cd";
	private static final MCPermColumnInfo _mrkt_judg_role_cd = createColumnInfo("mrkt_judg_role_cd");
	public final MCStringPermColumn mrkt_judg_role_cd = createStringColumn(_mrkt_judg_role_cd);
	
	/**
	 * 市場出荷判定更新役割ＣＤ. Market release decision update role cd..<p>
	 *
	 */
	public static final String $mrkt_judg_upd_role_cd = "mrkt_judg_upd_role_cd";
	private static final MCPermColumnInfo _mrkt_judg_upd_role_cd = createColumnInfo("mrkt_judg_upd_role_cd");
	public final MCStringPermColumn mrkt_judg_upd_role_cd = createStringColumn(_mrkt_judg_upd_role_cd);
	
	/**
	 * 期限管理対象ＦＬＧ. For expiration management flg..<p>
	 *
	 */
	public static final String $lmt_ctl_flg = "lmt_ctl_flg";
	private static final MCPermColumnInfo _lmt_ctl_flg = createColumnInfo("lmt_ctl_flg");
	public final MCBooleanPermColumn lmt_ctl_flg = createBooleanColumn(_lmt_ctl_flg);
	
	/**
	 * 期限管理種別. Expiration management type.<p>
	 *
	 */
	public static final String $lmt_ctl_categ = "lmt_ctl_categ";
	private static final MCPermColumnInfo _lmt_ctl_categ = createColumnInfo("lmt_ctl_categ");
	public final MCStringPermColumn lmt_ctl_categ = createStringColumn(_lmt_ctl_categ);
	
	/**
	 * 有効成分対象ＦＬＧ. For active ingredient flg..<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	private static final MCPermColumnInfo _cont_fctr_flg = createColumnInfo("cont_fctr_flg");
	public final MCBooleanPermColumn cont_fctr_flg = createBooleanColumn(_cont_fctr_flg);
	
	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	private static final MCPermColumnInfo _std_cont_fctr = createColumnInfo("std_cont_fctr");
	public final MCNumberPermColumn std_cont_fctr = createNumberColumn(_std_cont_fctr);
	
	/**
	 * 有効成分単位ＣＤ. Active ingredient unit cd..<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	private static final MCPermColumnInfo _cont_fctr_unit_cd = createColumnInfo("cont_fctr_unit_cd");
	public final MCStringPermColumn cont_fctr_unit_cd = createStringColumn(_cont_fctr_unit_cd);
	
	/**
	 * 有効成分換算端数処理区分. Rounding type (Active ingredient conversion).<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	private static final MCPermColumnInfo _cont_fctr_rnd_typ = createColumnInfo("cont_fctr_rnd_typ");
	public final MCStringPermColumn cont_fctr_rnd_typ = createStringColumn(_cont_fctr_rnd_typ);
	
	/**
	 * 有効成分小数部有効桁数. Active ingredient number of decimal places.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	private static final MCPermColumnInfo _cont_fctr_dec_place = createColumnInfo("cont_fctr_dec_place");
	public final MCNumberPermColumn cont_fctr_dec_place = createNumberColumn(_cont_fctr_dec_place);
	
	/**
	 * 手配ＮＯ１管理区分. SEIBAN No. 1 management type.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	private static final MCPermColumnInfo _sno1_mng_typ = createColumnInfo("sno1_mng_typ");
	public final MCStringPermColumn sno1_mng_typ = createStringColumn(_sno1_mng_typ);
	
	/**
	 * 受注手配ＮＯ１必須ＦＬＧ. Sales order SEIBAN No. 1 required flg..<p>
	 *
	 */
	public static final String $slo_sno1_flg = "slo_sno1_flg";
	private static final MCPermColumnInfo _slo_sno1_flg = createColumnInfo("slo_sno1_flg");
	public final MCBooleanPermColumn slo_sno1_flg = createBooleanColumn(_slo_sno1_flg);
	
	/**
	 * 所要手配ＮＯ１必須ＦＬＧ. Requirements SEIBAN No. 1 required flg..<p>
	 *
	 */
	public static final String $rqmt_sno1_flg = "rqmt_sno1_flg";
	private static final MCPermColumnInfo _rqmt_sno1_flg = createColumnInfo("rqmt_sno1_flg");
	public final MCBooleanPermColumn rqmt_sno1_flg = createBooleanColumn(_rqmt_sno1_flg);
	
	/**
	 * 手配ＮＯ１発番区分. SEIBAN No. 1 numbering type.<p>
	 *
	 */
	public static final String $sno1_num_typ = "sno1_num_typ";
	private static final MCPermColumnInfo _sno1_num_typ = createColumnInfo("sno1_num_typ");
	public final MCStringPermColumn sno1_num_typ = createStringColumn(_sno1_num_typ);
	
	/**
	 * 手配ＮＯ１発番パタンＣＤ. SEIBAN No. 1 numbering pattern cd..<p>
	 *
	 */
	public static final String $sno1_ptn_cd = "sno1_ptn_cd";
	private static final MCPermColumnInfo _sno1_ptn_cd = createColumnInfo("sno1_ptn_cd");
	public final MCStringPermColumn sno1_ptn_cd = createStringColumn(_sno1_ptn_cd);
	
	/**
	 * 手配ＮＯ２管理区分. SEIBAN No. 2 management type.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	private static final MCPermColumnInfo _sno2_mng_typ = createColumnInfo("sno2_mng_typ");
	public final MCStringPermColumn sno2_mng_typ = createStringColumn(_sno2_mng_typ);
	
	/**
	 * 受注手配ＮＯ２必須ＦＬＧ. Sales order SEIBAN No. 2 required flg..<p>
	 *
	 */
	public static final String $slo_sno2_flg = "slo_sno2_flg";
	private static final MCPermColumnInfo _slo_sno2_flg = createColumnInfo("slo_sno2_flg");
	public final MCBooleanPermColumn slo_sno2_flg = createBooleanColumn(_slo_sno2_flg);
	
	/**
	 * 所要手配ＮＯ２必須ＦＬＧ. Requirements SEIBAN No. 2 required flg..<p>
	 *
	 */
	public static final String $rqmt_sno2_flg = "rqmt_sno2_flg";
	private static final MCPermColumnInfo _rqmt_sno2_flg = createColumnInfo("rqmt_sno2_flg");
	public final MCBooleanPermColumn rqmt_sno2_flg = createBooleanColumn(_rqmt_sno2_flg);
	
	/**
	 * 手配ＮＯ２発番区分. SEIBAN No. 2 numbering type.<p>
	 *
	 */
	public static final String $sno2_num_typ = "sno2_num_typ";
	private static final MCPermColumnInfo _sno2_num_typ = createColumnInfo("sno2_num_typ");
	public final MCStringPermColumn sno2_num_typ = createStringColumn(_sno2_num_typ);
	
	/**
	 * 手配ＮＯ２発番パタンＣＤ. SEIBAN No. 2 numbering pattern cd..<p>
	 *
	 */
	public static final String $sno2_ptn_cd = "sno2_ptn_cd";
	private static final MCPermColumnInfo _sno2_ptn_cd = createColumnInfo("sno2_ptn_cd");
	public final MCStringPermColumn sno2_ptn_cd = createStringColumn(_sno2_ptn_cd);
	
	/**
	 * 手配ＮＯ３管理区分. SEIBAN No. 3 management type.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	private static final MCPermColumnInfo _sno3_mng_typ = createColumnInfo("sno3_mng_typ");
	public final MCStringPermColumn sno3_mng_typ = createStringColumn(_sno3_mng_typ);
	
	/**
	 * 受注手配ＮＯ３必須ＦＬＧ. Sales order SEIBAN No. 3 required flg..<p>
	 *
	 */
	public static final String $slo_sno3_flg = "slo_sno3_flg";
	private static final MCPermColumnInfo _slo_sno3_flg = createColumnInfo("slo_sno3_flg");
	public final MCBooleanPermColumn slo_sno3_flg = createBooleanColumn(_slo_sno3_flg);
	
	/**
	 * 所要手配ＮＯ３必須ＦＬＧ. Requirements SEIBAN No. 3 required flg..<p>
	 *
	 */
	public static final String $rqmt_sno3_flg = "rqmt_sno3_flg";
	private static final MCPermColumnInfo _rqmt_sno3_flg = createColumnInfo("rqmt_sno3_flg");
	public final MCBooleanPermColumn rqmt_sno3_flg = createBooleanColumn(_rqmt_sno3_flg);
	
	/**
	 * 手配ＮＯ３発番区分. SEIBAN No. 3 numbering type.<p>
	 *
	 */
	public static final String $sno3_num_typ = "sno3_num_typ";
	private static final MCPermColumnInfo _sno3_num_typ = createColumnInfo("sno3_num_typ");
	public final MCStringPermColumn sno3_num_typ = createStringColumn(_sno3_num_typ);
	
	/**
	 * 手配ＮＯ３発番パタンＣＤ. SEIBAN No. 3 numbering pattern cd..<p>
	 *
	 */
	public static final String $sno3_ptn_cd = "sno3_ptn_cd";
	private static final MCPermColumnInfo _sno3_ptn_cd = createColumnInfo("sno3_ptn_cd");
	public final MCStringPermColumn sno3_ptn_cd = createStringColumn(_sno3_ptn_cd);
	
	/**
	 * 手配ＮＯ４管理区分. SEIBAN No. 4 management type.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	private static final MCPermColumnInfo _sno4_mng_typ = createColumnInfo("sno4_mng_typ");
	public final MCStringPermColumn sno4_mng_typ = createStringColumn(_sno4_mng_typ);
	
	/**
	 * 受注手配ＮＯ４必須ＦＬＧ. Sales order SEIBAN No. 4 required flg..<p>
	 *
	 */
	public static final String $slo_sno4_flg = "slo_sno4_flg";
	private static final MCPermColumnInfo _slo_sno4_flg = createColumnInfo("slo_sno4_flg");
	public final MCBooleanPermColumn slo_sno4_flg = createBooleanColumn(_slo_sno4_flg);
	
	/**
	 * 所要手配ＮＯ４必須ＦＬＧ. Requirements SEIBAN No. 4 required flg..<p>
	 *
	 */
	public static final String $rqmt_sno4_flg = "rqmt_sno4_flg";
	private static final MCPermColumnInfo _rqmt_sno4_flg = createColumnInfo("rqmt_sno4_flg");
	public final MCBooleanPermColumn rqmt_sno4_flg = createBooleanColumn(_rqmt_sno4_flg);
	
	/**
	 * 手配ＮＯ４発番区分. SEIBAN No. 4 numbering type.<p>
	 *
	 */
	public static final String $sno4_num_typ = "sno4_num_typ";
	private static final MCPermColumnInfo _sno4_num_typ = createColumnInfo("sno4_num_typ");
	public final MCStringPermColumn sno4_num_typ = createStringColumn(_sno4_num_typ);
	
	/**
	 * 手配ＮＯ４発番パタンＣＤ. SEIBAN No. 4 numbering pattern cd..<p>
	 *
	 */
	public static final String $sno4_ptn_cd = "sno4_ptn_cd";
	private static final MCPermColumnInfo _sno4_ptn_cd = createColumnInfo("sno4_ptn_cd");
	public final MCStringPermColumn sno4_ptn_cd = createStringColumn(_sno4_ptn_cd);
	
	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $def_bom_ptn = "def_bom_ptn";
	private static final MCPermColumnInfo _def_bom_ptn = createColumnInfo("def_bom_ptn");
	public final MCStringPermColumn def_bom_ptn = createStringColumn(_def_bom_ptn);
	
	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	private static final MCPermColumnInfo _mfg_inst_unit_typ = createColumnInfo("mfg_inst_unit_typ");
	public final MCStringPermColumn mfg_inst_unit_typ = createStringColumn(_mfg_inst_unit_typ);
	
	/**
	 * ＭＲＰ処理区分. MRP process type.<p>
	 *
	 */
	public static final String $mrp_proc_typ = "mrp_proc_typ";
	private static final MCPermColumnInfo _mrp_proc_typ = createColumnInfo("mrp_proc_typ");
	public final MCStringPermColumn mrp_proc_typ = createStringColumn(_mrp_proc_typ);
	
	/**
	 * 所要区分. Requirements type.<p>
	 *
	 */
	public static final String $rqmt_typ = "rqmt_typ";
	private static final MCPermColumnInfo _rqmt_typ = createColumnInfo("rqmt_typ");
	public final MCStringPermColumn rqmt_typ = createStringColumn(_rqmt_typ);
	
	/**
	 * 生産計画立案区分. Production planning type.<p>
	 *
	 */
	public static final String $prod_pln_typ = "prod_pln_typ";
	private static final MCPermColumnInfo _prod_pln_typ = createColumnInfo("prod_pln_typ");
	public final MCStringPermColumn prod_pln_typ = createStringColumn(_prod_pln_typ);
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public static final String $dmnd_date_div_mons = "dmnd_date_div_mons";
	private static final MCPermColumnInfo _dmnd_date_div_mons = createColumnInfo("dmnd_date_div_mons");
	public final MCNumberPermColumn dmnd_date_div_mons = createNumberColumn(_dmnd_date_div_mons);
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public static final String $alloc_margin_days = "alloc_margin_days";
	private static final MCPermColumnInfo _alloc_margin_days = createColumnInfo("alloc_margin_days");
	public final MCNumberPermColumn alloc_margin_days = createNumberColumn(_alloc_margin_days);
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public static final String $mrp_alloc_margin_days = "mrp_alloc_margin_days";
	private static final MCPermColumnInfo _mrp_alloc_margin_days = createColumnInfo("mrp_alloc_margin_days");
	public final MCNumberPermColumn mrp_alloc_margin_days = createNumberColumn(_mrp_alloc_margin_days);
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public static final String $mrp_opn_xfr_days = "mrp_opn_xfr_days";
	private static final MCPermColumnInfo _mrp_opn_xfr_days = createColumnInfo("mrp_opn_xfr_days");
	public final MCNumberPermColumn mrp_opn_xfr_days = createNumberColumn(_mrp_opn_xfr_days);
	
	/**
	 * 所要抑制量. Requirements restricted qty..<p>
	 *
	 */
	public static final String $rqmt_rstr_qty = "rqmt_rstr_qty";
	private static final MCPermColumnInfo _rqmt_rstr_qty = createColumnInfo("rqmt_rstr_qty");
	public final MCNumberPermColumn rqmt_rstr_qty = createNumberColumn(_rqmt_rstr_qty);
	
	/**
	 * 投入品追加許可ＦＬＧ. Allow input item addition flg..<p>
	 *
	 */
	public static final String $inpt_itm_add_flg = "inpt_itm_add_flg";
	private static final MCPermColumnInfo _inpt_itm_add_flg = createColumnInfo("inpt_itm_add_flg");
	public final MCBooleanPermColumn inpt_itm_add_flg = createBooleanColumn(_inpt_itm_add_flg);
	
	/**
	 * 投入品削除許可ＦＬＧ. Allow input item deletion flg..<p>
	 *
	 */
	public static final String $inpt_itm_del_flg = "inpt_itm_del_flg";
	private static final MCPermColumnInfo _inpt_itm_del_flg = createColumnInfo("inpt_itm_del_flg");
	public final MCBooleanPermColumn inpt_itm_del_flg = createBooleanColumn(_inpt_itm_del_flg);
	
	/**
	 * スケジューラＦＬＧ. Scheduler flg..<p>
	 *
	 */
	public static final String $sch_flg = "sch_flg";
	private static final MCPermColumnInfo _sch_flg = createColumnInfo("sch_flg");
	public final MCBooleanPermColumn sch_flg = createBooleanColumn(_sch_flg);
	
	/**
	 * 原産地ＣＤ. Place of origin cd..<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	private static final MCPermColumnInfo _cntry_org_cd = createColumnInfo("cntry_org_cd");
	public final MCStringPermColumn cntry_org_cd = createStringColumn(_cntry_org_cd);
	
	/**
	 * 構成・仕様管理区分. Configuration/specification management type.<p>
	 *
	 */
	public static final String $comp_spec_typ = "comp_spec_typ";
	private static final MCPermColumnInfo _comp_spec_typ = createColumnInfo("comp_spec_typ");
	public final MCStringPermColumn comp_spec_typ = createStringColumn(_comp_spec_typ);
	
	/**
	 * 受注時構成改訂許可ＦＬＧ. Allow sales order configuration rev. flg..<p>
	 *
	 */
	public static final String $comp_rev_at_slo_flg = "comp_rev_at_slo_flg";
	private static final MCPermColumnInfo _comp_rev_at_slo_flg = createColumnInfo("comp_rev_at_slo_flg");
	public final MCBooleanPermColumn comp_rev_at_slo_flg = createBooleanColumn(_comp_rev_at_slo_flg);
	
	/**
	 * 構成主品目ＦＬＧ. Configuration main item flg..<p>
	 *
	 */
	public static final String $comp_core_itm_flg = "comp_core_itm_flg";
	private static final MCPermColumnInfo _comp_core_itm_flg = createColumnInfo("comp_core_itm_flg");
	public final MCBooleanPermColumn comp_core_itm_flg = createBooleanColumn(_comp_core_itm_flg);
	
	/**
	 * 品目仕様分類ＣＤ. Item specification classification cd..<p>
	 *
	 */
	public static final String $itm_spec_grp_cd = "itm_spec_grp_cd";
	private static final MCPermColumnInfo _itm_spec_grp_cd = createColumnInfo("itm_spec_grp_cd");
	public final MCStringPermColumn itm_spec_grp_cd = createStringColumn(_itm_spec_grp_cd);
	
	/**
	 * 販売単価分類ＣＤ. Sales unit price classification cd..<p>
	 *
	 */
	public static final String $sls_upri_grp_cd = "sls_upri_grp_cd";
	private static final MCPermColumnInfo _sls_upri_grp_cd = createColumnInfo("sls_upri_grp_cd");
	public final MCStringPermColumn sls_upri_grp_cd = createStringColumn(_sls_upri_grp_cd);
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	private static final MCPermColumnInfo _bill_crryovr_times = createColumnInfo("bill_crryovr_times");
	public final MCNumberPermColumn bill_crryovr_times = createNumberColumn(_bill_crryovr_times);
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	private static final MCPermColumnInfo _pay_crryovr_times = createColumnInfo("pay_crryovr_times");
	public final MCNumberPermColumn pay_crryovr_times = createNumberColumn(_pay_crryovr_times);
	
	/**
	 * 受注手配品ＦＬＧ. Sales order procurement item flg..<p>
	 *
	 */
	public static final String $slo_proc_flg = "slo_proc_flg";
	private static final MCPermColumnInfo _slo_proc_flg = createColumnInfo("slo_proc_flg");
	public final MCBooleanPermColumn slo_proc_flg = createBooleanColumn(_slo_proc_flg);
	
	/**
	 * 受注手配区分. Sales order procurement type.<p>
	 *
	 */
	public static final String $slo_proc_typ = "slo_proc_typ";
	private static final MCPermColumnInfo _slo_proc_typ = createColumnInfo("slo_proc_typ");
	public final MCStringPermColumn slo_proc_typ = createStringColumn(_slo_proc_typ);
	
	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	private static final MCPermColumnInfo _ship_inst_typ = createColumnInfo("ship_inst_typ");
	public final MCStringPermColumn ship_inst_typ = createStringColumn(_ship_inst_typ);
	
	/**
	 * 出荷ロット逆転禁止ＦＬＧ. Shipping lot reverse prohibit flg..<p>
	 *
	 */
	public static final String $ship_lot_back_stop_flg = "ship_lot_back_stop_flg";
	private static final MCPermColumnInfo _ship_lot_back_stop_flg = createColumnInfo("ship_lot_back_stop_flg");
	public final MCBooleanPermColumn ship_lot_back_stop_flg = createBooleanColumn(_ship_lot_back_stop_flg);
	
	/**
	 * 品目出荷グループＣＤ. Item shipping group cd..<p>
	 *
	 */
	public static final String $itm_ship_grp_cd = "itm_ship_grp_cd";
	private static final MCPermColumnInfo _itm_ship_grp_cd = createColumnInfo("itm_ship_grp_cd");
	public final MCStringPermColumn itm_ship_grp_cd = createStringColumn(_itm_ship_grp_cd);
	
	/**
	 * 出荷有効期限グループＣＤ. Shipping expiration date group cd..<p>
	 *
	 */
	public static final String $ship_valid_grp_cd = "ship_valid_grp_cd";
	private static final MCPermColumnInfo _ship_valid_grp_cd = createColumnInfo("ship_valid_grp_cd");
	public final MCStringPermColumn ship_valid_grp_cd = createStringColumn(_ship_valid_grp_cd);
	
	/**
	 * 入荷不要ＦＬＧ. Not receipt flg..<p>
	 *
	 */
	public static final String $arr_skip_flg = "arr_skip_flg";
	private static final MCPermColumnInfo _arr_skip_flg = createColumnInfo("arr_skip_flg");
	public final MCBooleanPermColumn arr_skip_flg = createBooleanColumn(_arr_skip_flg);
	
	/**
	 * 購買納品書対象ＦＬＧ. Purchase delivery note target flg..<p>
	 *
	 */
	public static final String $purc_dlv_slip_flg = "purc_dlv_slip_flg";
	private static final MCPermColumnInfo _purc_dlv_slip_flg = createColumnInfo("purc_dlv_slip_flg");
	public final MCBooleanPermColumn purc_dlv_slip_flg = createBooleanColumn(_purc_dlv_slip_flg);
	
	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	private static final MCPermColumnInfo _ship_term_cd = createColumnInfo("ship_term_cd");
	public final MCStringPermColumn ship_term_cd = createStringColumn(_ship_term_cd);
	
	/**
	 * 輸出入諸掛区分. Import/export charges type.<p>
	 *
	 */
	public static final String $exim_xpns_typ = "exim_xpns_typ";
	private static final MCPermColumnInfo _exim_xpns_typ = createColumnInfo("exim_xpns_typ");
	public final MCStringPermColumn exim_xpns_typ = createStringColumn(_exim_xpns_typ);
	
	/**
	 * 現品票出力対象ＦＬＧ. For identification tag output flg..<p>
	 *
	 */
	public static final String $stk_lst_flg = "stk_lst_flg";
	private static final MCPermColumnInfo _stk_lst_flg = createColumnInfo("stk_lst_flg");
	public final MCBooleanPermColumn stk_lst_flg = createBooleanColumn(_stk_lst_flg);
	
	/**
	 * 版管理対象ＦＬＧ. For version control flg..<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	private static final MCPermColumnInfo _ver_flg = createColumnInfo("ver_flg");
	public final MCBooleanPermColumn ver_flg = createBooleanColumn(_ver_flg);
	
	/**
	 * 販売単価変更許可ＦＬＧ. Allow sales unit price change flg..<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	private static final MCPermColumnInfo _sls_upri_cng_flg = createColumnInfo("sls_upri_cng_flg");
	public final MCBooleanPermColumn sls_upri_cng_flg = createBooleanColumn(_sls_upri_cng_flg);
	
	/**
	 * 購買単価変更許可ＦＬＧ. Allow purchasing unit price change flg..<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	private static final MCPermColumnInfo _purc_upri_cng_flg = createColumnInfo("purc_upri_cng_flg");
	public final MCBooleanPermColumn purc_upri_cng_flg = createBooleanColumn(_purc_upri_cng_flg);
	
	/**
	 * 支給単価変更許可ＦＬＧ. Allow supply unit price change flg..<p>
	 *
	 */
	public static final String $prov_upri_cng_flg = "prov_upri_cng_flg";
	private static final MCPermColumnInfo _prov_upri_cng_flg = createColumnInfo("prov_upri_cng_flg");
	public final MCBooleanPermColumn prov_upri_cng_flg = createBooleanColumn(_prov_upri_cng_flg);
	
	/**
	 * 参照品目ＣＤ. Reference item cd..<p>
	 *
	 */
	public static final String $ref_itm_cd = "ref_itm_cd";
	private static final MCPermColumnInfo _ref_itm_cd = createColumnInfo("ref_itm_cd");
	public final MCStringPermColumn ref_itm_cd = createStringColumn(_ref_itm_cd);
	
	/**
	 * 参照枝番１. Reference branch No. 1.<p>
	 *
	 */
	public static final String $ref_itm_sub1 = "ref_itm_sub1";
	private static final MCPermColumnInfo _ref_itm_sub1 = createColumnInfo("ref_itm_sub1");
	public final MCStringPermColumn ref_itm_sub1 = createStringColumn(_ref_itm_sub1);
	
	/**
	 * 参照枝番２. Reference branch No. 2.<p>
	 *
	 */
	public static final String $ref_itm_sub2 = "ref_itm_sub2";
	private static final MCPermColumnInfo _ref_itm_sub2 = createColumnInfo("ref_itm_sub2");
	public final MCStringPermColumn ref_itm_sub2 = createStringColumn(_ref_itm_sub2);
	
	/**
	 * 参照枝番３. Reference branch No. 3.<p>
	 *
	 */
	public static final String $ref_itm_sub3 = "ref_itm_sub3";
	private static final MCPermColumnInfo _ref_itm_sub3 = createColumnInfo("ref_itm_sub3");
	public final MCStringPermColumn ref_itm_sub3 = createStringColumn(_ref_itm_sub3);
	
	/**
	 * 外部システムＮＯ. External system No..<p>
	 *
	 */
	public static final String $ext_sys_no_itm = "ext_sys_no_itm";
	private static final MCPermColumnInfo _ext_sys_no_itm = createColumnInfo("ext_sys_no_itm");
	public final MCStringPermColumn ext_sys_no_itm = createStringColumn(_ext_sys_no_itm);
	
	/**
	 * 変更ＮＯ. Change No..<p>
	 *
	 */
	public static final String $chng_no = "chng_no";
	private static final MCPermColumnInfo _chng_no = createColumnInfo("chng_no");
	public final MCStringPermColumn chng_no = createStringColumn(_chng_no);
	
	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public static final String $calc_ptn_cd = "calc_ptn_cd";
	private static final MCPermColumnInfo _calc_ptn_cd = createColumnInfo("calc_ptn_cd");
	public final MCStringPermColumn calc_ptn_cd = createStringColumn(_calc_ptn_cd);
	
	/**
	 * 原価基準数量. Cost base qty..<p>
	 *
	 */
	public static final String $cost_std_qty = "cost_std_qty";
	private static final MCPermColumnInfo _cost_std_qty = createColumnInfo("cost_std_qty");
	public final MCNumberPermColumn cost_std_qty = createNumberColumn(_cost_std_qty);
	
	/**
	 * 品目配賦グループ. Item allocation group.<p>
	 *
	 */
	public static final String $itm_alc_grp = "itm_alc_grp";
	private static final MCPermColumnInfo _itm_alc_grp = createColumnInfo("itm_alc_grp");
	public final MCStringPermColumn itm_alc_grp = createStringColumn(_itm_alc_grp);
	
	/**
	 * 販売ＦＬＧ. Sales flg..<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	private static final MCPermColumnInfo _sls_flg = createColumnInfo("sls_flg");
	public final MCBooleanPermColumn sls_flg = createBooleanColumn(_sls_flg);
	
	/**
	 * 製造ＦＬＧ. Mfg. flg..<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	private static final MCPermColumnInfo _mfg_flg = createColumnInfo("mfg_flg");
	public final MCBooleanPermColumn mfg_flg = createBooleanColumn(_mfg_flg);
	
	/**
	 * 購買ＦＬＧ. Purchasing flg..<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	private static final MCPermColumnInfo _purc_flg = createColumnInfo("purc_flg");
	public final MCBooleanPermColumn purc_flg = createBooleanColumn(_purc_flg);
	
	/**
	 * 検査ＦＬＧ. Inspection flg..<p>
	 *
	 */
	public static final String $insp_flg = "insp_flg";
	private static final MCPermColumnInfo _insp_flg = createColumnInfo("insp_flg");
	public final MCBooleanPermColumn insp_flg = createBooleanColumn(_insp_flg);
	
	/**
	 * 販売設定済ＦＬＧ. Sales configured flg..<p>
	 *
	 */
	public static final String $sls_input_flg = "sls_input_flg";
	private static final MCPermColumnInfo _sls_input_flg = createColumnInfo("sls_input_flg");
	public final MCBooleanPermColumn sls_input_flg = createBooleanColumn(_sls_input_flg);
	
	/**
	 * 製造設定済ＦＬＧ. Mfg. configured flg..<p>
	 *
	 */
	public static final String $mfg_input_flg = "mfg_input_flg";
	private static final MCPermColumnInfo _mfg_input_flg = createColumnInfo("mfg_input_flg");
	public final MCBooleanPermColumn mfg_input_flg = createBooleanColumn(_mfg_input_flg);
	
	/**
	 * 購買設定済ＦＬＧ. Purchase configured flg..<p>
	 *
	 */
	public static final String $purc_input_flg = "purc_input_flg";
	private static final MCPermColumnInfo _purc_input_flg = createColumnInfo("purc_input_flg");
	public final MCBooleanPermColumn purc_input_flg = createBooleanColumn(_purc_input_flg);
	
	/**
	 * 検査設定済ＦＬＧ. Inspection configured flg..<p>
	 *
	 */
	public static final String $insp_input_flg = "insp_input_flg";
	private static final MCPermColumnInfo _insp_input_flg = createColumnInfo("insp_input_flg");
	public final MCBooleanPermColumn insp_input_flg = createBooleanColumn(_insp_input_flg);
	
	/**
	 * リリースＦＬＧ. Release flg..<p>
	 *
	 */
	public static final String $release_flg = "release_flg";
	private static final MCPermColumnInfo _release_flg = createColumnInfo("release_flg");
	public final MCBooleanPermColumn release_flg = createBooleanColumn(_release_flg);
	
	/**
	 * リリース担当者ＣＤ. Release PIC name cd..<p>
	 *
	 */
	public static final String $release_usr_cd = "release_usr_cd";
	private static final MCPermColumnInfo _release_usr_cd = createColumnInfo("release_usr_cd");
	public final MCStringPermColumn release_usr_cd = createStringColumn(_release_usr_cd);
	
	/**
	 * リリース日時. Release date and time.<p>
	 *
	 */
	public static final String $release_tm = "release_tm";
	private static final MCPermColumnInfo _release_tm = createColumnInfo("release_tm");
	public final MCDatePermColumn release_tm = createDateColumn(_release_tm);
	
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
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	private static final MCPermColumnInfo _itm_alt_nm1 = createColumnInfo("itm_alt_nm1");
	public final MCStringPermColumn itm_alt_nm1 = createStringColumn(_itm_alt_nm1);
	
	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	private static final MCPermColumnInfo _itm_alt_nm2 = createColumnInfo("itm_alt_nm2");
	public final MCStringPermColumn itm_alt_nm2 = createStringColumn(_itm_alt_nm2);
	
	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	private static final MCPermColumnInfo _itm_alt_nm3 = createColumnInfo("itm_alt_nm3");
	public final MCStringPermColumn itm_alt_nm3 = createStringColumn(_itm_alt_nm3);
	
	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	private static final MCPermColumnInfo _itm_alt_nm4 = createColumnInfo("itm_alt_nm4");
	public final MCStringPermColumn itm_alt_nm4 = createStringColumn(_itm_alt_nm4);
	
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
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	private static final MCPermColumnInfo _stk_mng_typ = createColumnInfo("stk_mng_typ");
	public final MCStringPermColumn stk_mng_typ = createStringColumn(_stk_mng_typ);
	
	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	private static final MCPermColumnInfo _asset_mng_typ = createColumnInfo("asset_mng_typ");
	public final MCStringPermColumn asset_mng_typ = createStringColumn(_asset_mng_typ);
	
	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	private static final MCPermColumnInfo _sundry_itm_flg = createColumnInfo("sundry_itm_flg");
	public final MCBooleanPermColumn sundry_itm_flg = createBooleanColumn(_sundry_itm_flg);
	
	/**
	 * 値引品目ＦＬＧ. Discount item flg..<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	private static final MCPermColumnInfo _dscnt_itm_flg = createColumnInfo("dscnt_itm_flg");
	public final MCBooleanPermColumn dscnt_itm_flg = createBooleanColumn(_dscnt_itm_flg);
	
	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	private static final MCPermColumnInfo _unit_cd = createColumnInfo("unit_cd");
	public final MCStringPermColumn unit_cd = createStringColumn(_unit_cd);
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	private static final MCPermColumnInfo _dec_place = createColumnInfo("dec_place");
	public final MCNumberPermColumn dec_place = createNumberColumn(_dec_place);
	
	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	private static final MCPermColumnInfo _rnd_typ = createColumnInfo("rnd_typ");
	public final MCStringPermColumn rnd_typ = createStringColumn(_rnd_typ);
	
	/**
	 * 容積単位ＣＤ. Volume unit cd..<p>
	 *
	 */
	public static final String $dim_unit_cd = "dim_unit_cd";
	private static final MCPermColumnInfo _dim_unit_cd = createColumnInfo("dim_unit_cd");
	public final MCStringPermColumn dim_unit_cd = createStringColumn(_dim_unit_cd);
	
	/**
	 * 容積. Volume.<p>
	 *
	 */
	public static final String $dim = "dim";
	private static final MCPermColumnInfo _dim = createColumnInfo("dim");
	public final MCNumberPermColumn dim = createNumberColumn(_dim);
	
	/**
	 * 重量単位ＣＤ. Weight unit cd..<p>
	 *
	 */
	public static final String $wt_unit_cd = "wt_unit_cd";
	private static final MCPermColumnInfo _wt_unit_cd = createColumnInfo("wt_unit_cd");
	public final MCStringPermColumn wt_unit_cd = createStringColumn(_wt_unit_cd);
	
	/**
	 * 重量. Weight.<p>
	 *
	 */
	public static final String $wt = "wt";
	private static final MCPermColumnInfo _wt = createColumnInfo("wt");
	public final MCNumberPermColumn wt = createNumberColumn(_wt);
	
	/**
	 * 入り目単位ＣＤ. Conversion unit cd..<p>
	 *
	 */
	public static final String $conts_unit_cd = "conts_unit_cd";
	private static final MCPermColumnInfo _conts_unit_cd = createColumnInfo("conts_unit_cd");
	public final MCStringPermColumn conts_unit_cd = createStringColumn(_conts_unit_cd);
	
	/**
	 * 入り目数量. Conversion qty..<p>
	 *
	 */
	public static final String $conts_qty = "conts_qty";
	private static final MCPermColumnInfo _conts_qty = createColumnInfo("conts_qty");
	public final MCNumberPermColumn conts_qty = createNumberColumn(_conts_qty);
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public static final String $unit_dim = "unit_dim";
	private static final MCPermColumnInfo _unit_dim = createColumnInfo("unit_dim");
	public final MCNumberPermColumn unit_dim = createNumberColumn(_unit_dim);
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public static final String $unit_wt = "unit_wt";
	private static final MCPermColumnInfo _unit_wt = createColumnInfo("unit_wt");
	public final MCNumberPermColumn unit_wt = createNumberColumn(_unit_wt);
	
	/**
	 * ＨＳ ＣＤ. HS cd..<p>
	 *
	 */
	public static final String $hs_cd = "hs_cd";
	private static final MCPermColumnInfo _hs_cd = createColumnInfo("hs_cd");
	public final MCStringPermColumn hs_cd = createStringColumn(_hs_cd);
	
	/**
	 * ＪＡＮ区分. JAN type.<p>
	 *
	 */
	public static final String $jan_typ = "jan_typ";
	private static final MCPermColumnInfo _jan_typ = createColumnInfo("jan_typ");
	public final MCStringPermColumn jan_typ = createStringColumn(_jan_typ);
	
	/**
	 * ＪＡＮ ＣＤ. JAN cd..<p>
	 *
	 */
	public static final String $jan_cd = "jan_cd";
	private static final MCPermColumnInfo _jan_cd = createColumnInfo("jan_cd");
	public final MCStringPermColumn jan_cd = createStringColumn(_jan_cd);
	
	/**
	 * ＩＴＦ ＣＤ. ITF cd..<p>
	 *
	 */
	public static final String $itf_cd = "itf_cd";
	private static final MCPermColumnInfo _itf_cd = createColumnInfo("itf_cd");
	public final MCStringPermColumn itf_cd = createStringColumn(_itf_cd);
	
	/**
	 * ＧＴＩＮ ＣＤ. GTIN cd..<p>
	 *
	 */
	public static final String $gtin_cd = "gtin_cd";
	private static final MCPermColumnInfo _gtin_cd = createColumnInfo("gtin_cd");
	public final MCStringPermColumn gtin_cd = createStringColumn(_gtin_cd);
	
	/**
	 * サムネイル画像. Thumbnail image.<p>
	 *
	 */
	public static final String $th_image = "th_image";
	private static final MCPermColumnInfo _th_image = createColumnInfo("th_image");
	public final MCBinaryPermColumn th_image = createBinaryColumn(_th_image);
	
	/**
	 * 販売品目体系ＣＤ. Sales item system cd..<p>
	 *
	 */
	public static final String $sls_itm_grp_cd = "sls_itm_grp_cd";
	private static final MCPermColumnInfo _sls_itm_grp_cd = createColumnInfo("sls_itm_grp_cd");
	public final MCStringPermColumn sls_itm_grp_cd = createStringColumn(_sls_itm_grp_cd);
	
	/**
	 * 品目名（ロケール１）. Item name (Locale1).<p>
	 *
	 */
	public static final String $itm_nm_lcl1 = "itm_nm_lcl1";
	private static final MCPermColumnInfo _itm_nm_lcl1 = createColumnInfo("itm_nm_lcl1");
	public final MCStringPermColumn itm_nm_lcl1 = createStringColumn(_itm_nm_lcl1);
	
	/**
	 * 品目名（ロケール２）. Item name (Locale2).<p>
	 *
	 */
	public static final String $itm_nm_lcl2 = "itm_nm_lcl2";
	private static final MCPermColumnInfo _itm_nm_lcl2 = createColumnInfo("itm_nm_lcl2");
	public final MCStringPermColumn itm_nm_lcl2 = createStringColumn(_itm_nm_lcl2);
	
	/**
	 * 品目名（ロケール３）. Item name (Locale3).<p>
	 *
	 */
	public static final String $itm_nm_lcl3 = "itm_nm_lcl3";
	private static final MCPermColumnInfo _itm_nm_lcl3 = createColumnInfo("itm_nm_lcl3");
	public final MCStringPermColumn itm_nm_lcl3 = createStringColumn(_itm_nm_lcl3);
	
	/**
	 * 品目名（ロケール４）. Item name (Locale4).<p>
	 *
	 */
	public static final String $itm_nm_lcl4 = "itm_nm_lcl4";
	private static final MCPermColumnInfo _itm_nm_lcl4 = createColumnInfo("itm_nm_lcl4");
	public final MCStringPermColumn itm_nm_lcl4 = createStringColumn(_itm_nm_lcl4);
	
	/**
	 * 品目名（ロケール５）. Item name (Locale5).<p>
	 *
	 */
	public static final String $itm_nm_lcl5 = "itm_nm_lcl5";
	private static final MCPermColumnInfo _itm_nm_lcl5 = createColumnInfo("itm_nm_lcl5");
	public final MCStringPermColumn itm_nm_lcl5 = createStringColumn(_itm_nm_lcl5);
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta ac_itm_grp_cd_META = createCommonMeta($ac_itm_grp_cd, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_CD);
	public static final MCMeta minus_stk_flg_META = createCommonMeta($minus_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_new_lot_flg_META = createCommonMeta($not_new_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_alloc_flg_META = createCommonMeta($gi_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_tax_cd_META = createCommonMeta($sls_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta prov_tax_cd_META = createCommonMeta($prov_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta ship_unit_cd_META = createCommonMeta($ship_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta mfg_unit_cd_META = createCommonMeta($mfg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta purc_unit_cd_META = createCommonMeta($purc_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pckg_unit_cd_META = createCommonMeta($pckg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_alloc_flg_META = createCommonMeta($pack_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta lot_no_ptn_cd_META = createCommonMeta($lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_no_ptn_cd_META = createCommonMeta($sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta bp_lot_flg_META = createCommonMeta($bp_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_bind_typ_META = createCommonMeta($insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta skip_chk_ship_flg_META = createCommonMeta($skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_flg_META = createCommonMeta($mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_role_cd_META = createCommonMeta($mrkt_judg_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta mrkt_judg_upd_role_cd_META = createCommonMeta($mrkt_judg_upd_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta lmt_ctl_flg_META = createCommonMeta($lmt_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_ctl_categ_META = createCommonMeta($lmt_ctl_categ, mcframe.commonMA.meta.MA_META.LMT_CTL_CATEG);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta slo_sno1_flg_META = createCommonMeta($slo_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno1_flg_META = createCommonMeta($rqmt_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_num_typ_META = createCommonMeta($sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno1_ptn_cd_META = createCommonMeta($sno1_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta slo_sno2_flg_META = createCommonMeta($slo_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno2_flg_META = createCommonMeta($rqmt_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_num_typ_META = createCommonMeta($sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno2_ptn_cd_META = createCommonMeta($sno2_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta slo_sno3_flg_META = createCommonMeta($slo_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno3_flg_META = createCommonMeta($rqmt_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_num_typ_META = createCommonMeta($sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno3_ptn_cd_META = createCommonMeta($sno3_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta slo_sno4_flg_META = createCommonMeta($slo_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno4_flg_META = createCommonMeta($rqmt_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_num_typ_META = createCommonMeta($sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno4_ptn_cd_META = createCommonMeta($sno4_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_bom_ptn_META = createCommonMeta($def_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mrp_proc_typ_META = createCommonMeta($mrp_proc_typ, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta rqmt_typ_META = createCommonMeta($rqmt_typ, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta prod_pln_typ_META = createCommonMeta($prod_pln_typ, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta dmnd_date_div_mons_META = createCommonMeta($dmnd_date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta alloc_margin_days_META = createCommonMeta($alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_alloc_margin_days_META = createCommonMeta($mrp_alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_META = createCommonMeta($mrp_opn_xfr_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta rqmt_rstr_qty_META = createCommonMeta($rqmt_rstr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inpt_itm_add_flg_META = createCommonMeta($inpt_itm_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_itm_del_flg_META = createCommonMeta($inpt_itm_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sch_flg_META = createCommonMeta($sch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta comp_spec_typ_META = createCommonMeta($comp_spec_typ, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP);
	public static final MCMeta comp_rev_at_slo_flg_META = createCommonMeta($comp_rev_at_slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_core_itm_flg_META = createCommonMeta($comp_core_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_spec_grp_cd_META = createCommonMeta($itm_spec_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_CD);
	public static final MCMeta sls_upri_grp_cd_META = createCommonMeta($sls_upri_grp_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_CD);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta slo_proc_flg_META = createCommonMeta($slo_proc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_proc_typ_META = createCommonMeta($slo_proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_lot_back_stop_flg_META = createCommonMeta($ship_lot_back_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_ship_grp_cd_META = createCommonMeta($itm_ship_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_CD);
	public static final MCMeta ship_valid_grp_cd_META = createCommonMeta($ship_valid_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_CD);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dlv_slip_flg_META = createCommonMeta($purc_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta exim_xpns_typ_META = createCommonMeta($exim_xpns_typ, mcframe.commonMA.meta.MA_META.EXIM_XPNS_TYP);
	public static final MCMeta stk_lst_flg_META = createCommonMeta($stk_lst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_upri_cng_flg_META = createCommonMeta($prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ref_itm_cd_META = createCommonMeta($ref_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta ref_itm_sub1_META = createCommonMeta($ref_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta ref_itm_sub2_META = createCommonMeta($ref_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta ref_itm_sub3_META = createCommonMeta($ref_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ext_sys_no_itm_META = createCommonMeta($ext_sys_no_itm, mcframe.commonMA.meta.MA_META.EXT_SYS_NO_ITM);
	public static final MCMeta chng_no_META = createCommonMeta($chng_no, mcframe.commonMA.meta.MA_META.CHNG_NO);
	public static final MCMeta calc_ptn_cd_META = createCommonMeta($calc_ptn_cd, mcframe.commonMA.meta.MA_META.CALC_PTN_CD);
	public static final MCMeta cost_std_qty_META = createCommonMeta($cost_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta itm_alc_grp_META = createCommonMeta($itm_alc_grp, mcframe.commonMA.meta.MA_META.ITM_ALC_GRP);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_flg_META = createCommonMeta($insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_input_flg_META = createCommonMeta($sls_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_input_flg_META = createCommonMeta($mfg_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_input_flg_META = createCommonMeta($purc_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_input_flg_META = createCommonMeta($insp_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta release_flg_META = createCommonMeta($release_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta release_usr_cd_META = createCommonMeta($release_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta release_tm_META = createCommonMeta($release_tm, mcframe.commonMA.meta.MA_META.TM);
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
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
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
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta dim_unit_cd_META = createCommonMeta($dim_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dim_META = createCommonMeta($dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta wt_unit_cd_META = createCommonMeta($wt_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta wt_META = createCommonMeta($wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta conts_unit_cd_META = createCommonMeta($conts_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta conts_qty_META = createCommonMeta($conts_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_dim_META = createCommonMeta($unit_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta unit_wt_META = createCommonMeta($unit_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta hs_cd_META = createCommonMeta($hs_cd, mcframe.commonMA.meta.MA_META.HS_CD);
	public static final MCMeta jan_typ_META = createCommonMeta($jan_typ, mcframe.commonMA.meta.MA_META.JAN_TYP);
	public static final MCMeta jan_cd_META = createCommonMeta($jan_cd, mcframe.commonMA.meta.MA_META.JAN_CD);
	public static final MCMeta itf_cd_META = createCommonMeta($itf_cd, mcframe.commonMA.meta.MA_META.ITF_CD);
	public static final MCMeta gtin_cd_META = createCommonMeta($gtin_cd, mcframe.commonMA.meta.MA_META.GTIN_CD);
	public static final MCMeta th_image_META = createCommonMeta($th_image, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta sls_itm_grp_cd_META = createCommonMeta($sls_itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta itm_nm_lcl1_META = createCommonMeta($itm_nm_lcl1, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_nm_lcl2_META = createCommonMeta($itm_nm_lcl2, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_nm_lcl3_META = createCommonMeta($itm_nm_lcl3, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_nm_lcl4_META = createCommonMeta($itm_nm_lcl4, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_nm_lcl5_META = createCommonMeta($itm_nm_lcl5, mcframe.commonMA.meta.MA_META.ITM_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $CO_ALL1 = "CO_ALL1";
	public static final String $ITM_TYP_D_CMN1 = "ITM_TYP_D_CMN1";
	public static final String $ITM_JNL_CMN1 = "ITM_JNL_CMN1";
	public static final String $AC_ITM_GRP_CMN1 = "AC_ITM_GRP_CMN1";
	public static final String $TAX_CMN1 = "TAX_CMN1";
	public static final String $TAX_CMN2 = "TAX_CMN2";
	public static final String $TAX_CMN3 = "TAX_CMN3";
	public static final String $UNIT_CMN1 = "UNIT_CMN1";
	public static final String $UNIT_CMN2 = "UNIT_CMN2";
	public static final String $UNIT_CMN3 = "UNIT_CMN3";
	public static final String $UNIT_CMN4 = "UNIT_CMN4";
	public static final String $UNIT_CMN5 = "UNIT_CMN5";
	public static final String $CNTRY_CMN1 = "CNTRY_CMN1";
	public static final String $ITM_SPEC_GRP_CMN1 = "ITM_SPEC_GRP_CMN1";
	public static final String $SLS_UPRI_GRP_CMN1 = "SLS_UPRI_GRP_CMN1";
	public static final String $ITM_SHIP_GRP_CMN1 = "ITM_SHIP_GRP_CMN1";
	public static final String $SHIP_VALID_CMN1 = "SHIP_VALID_CMN1";
	public static final String $SHIP_TERM_CMN1 = "SHIP_TERM_CMN1";
	public static final String $ITM_CMN1 = "ITM_CMN1";
	public static final String $APRV_ROLE_CMN1 = "APRV_ROLE_CMN1";
	public static final String $APRV_ROLE_CMN2 = "APRV_ROLE_CMN2";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CO_ALL",
				$CO_ALL1,
				new String[][]{
						{"co_cd", "co_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_TYP_D_CMN",
				$ITM_TYP_D_CMN1,
				new String[][]{
						{"itm_typ", "itm_typ"},
						{"itm_typ_d_cd", "itm_typ_d_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_JNL_CMN",
				$ITM_JNL_CMN1,
				new String[][]{
						{"itm_jnl_cd", "itm_jnl_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_AC_ITM_GRP_CMN",
				$AC_ITM_GRP_CMN1,
				new String[][]{
						{"ac_itm_grp_cd", "ac_itm_grp_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_TAX_CMN",
				$TAX_CMN1,
				new String[][]{
						{"sls_tax_cd", "tax_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_TAX_CMN",
				$TAX_CMN2,
				new String[][]{
						{"purc_tax_cd", "tax_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_TAX_CMN",
				$TAX_CMN3,
				new String[][]{
						{"prov_tax_cd", "tax_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT_CMN",
				$UNIT_CMN1,
				new String[][]{
						{"ship_unit_cd", "unit_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT_CMN",
				$UNIT_CMN2,
				new String[][]{
						{"mfg_unit_cd", "unit_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT_CMN",
				$UNIT_CMN3,
				new String[][]{
						{"purc_unit_cd", "unit_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT_CMN",
				$UNIT_CMN4,
				new String[][]{
						{"pckg_unit_cd", "unit_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT_CMN",
				$UNIT_CMN5,
				new String[][]{
						{"cont_fctr_unit_cd", "unit_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CNTRY_CMN",
				$CNTRY_CMN1,
				new String[][]{
						{"cntry_org_cd", "cntry_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_SPEC_GRP_CMN",
				$ITM_SPEC_GRP_CMN1,
				new String[][]{
						{"itm_spec_grp_cd", "itm_spec_grp_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SLS_UPRI_GRP_CMN",
				$SLS_UPRI_GRP_CMN1,
				new String[][]{
						{"sls_upri_grp_cd", "sls_upri_grp_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_SHIP_GRP_CMN",
				$ITM_SHIP_GRP_CMN1,
				new String[][]{
						{"itm_ship_grp_cd", "itm_ship_grp_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SHIP_VALID_CMN",
				$SHIP_VALID_CMN1,
				new String[][]{
						{"ship_valid_grp_cd", "ship_valid_grp_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SHIP_TERM_CMN",
				$SHIP_TERM_CMN1,
				new String[][]{
						{"ship_term_cd", "ship_term_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_CMN",
				$ITM_CMN1,
				new String[][]{
						{"ref_itm_cd", "itm_cd"},
						{"ref_itm_sub1", "itm_sub1"},
						{"ref_itm_sub2", "itm_sub2"},
						{"ref_itm_sub3", "itm_sub3"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE_CMN",
				$APRV_ROLE_CMN1,
				new String[][]{
						{"mrkt_judg_role_cd", "aprv_role_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE_CMN",
				$APRV_ROLE_CMN2,
				new String[][]{
						{"mrkt_judg_upd_role_cd", "aprv_role_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAVM_ITM_MST_R> constMetas = new ConstMetaList<MAVM_ITM_MST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			co_cd_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_jnl_cd_META,
			ac_itm_grp_cd_META,
			minus_stk_flg_META,
			not_new_lot_flg_META,
			gi_alloc_flg_META,
			sls_tax_cd_META,
			purc_tax_cd_META,
			prov_tax_cd_META,
			wtax_rate_META,
			ship_unit_cd_META,
			mfg_unit_cd_META,
			purc_unit_cd_META,
			pckg_unit_cd_META,
			pack_alloc_flg_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			lot_no_ptn_cd_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			sublot_no_ptn_cd_META,
			bp_lot_flg_META,
			insp_bind_typ_META,
			skip_chk_ship_flg_META,
			mrkt_judg_flg_META,
			mrkt_judg_role_cd_META,
			mrkt_judg_upd_role_cd_META,
			lmt_ctl_flg_META,
			lmt_ctl_categ_META,
			cont_fctr_flg_META,
			std_cont_fctr_META,
			cont_fctr_unit_cd_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			sno1_mng_typ_META,
			slo_sno1_flg_META,
			rqmt_sno1_flg_META,
			sno1_num_typ_META,
			sno1_ptn_cd_META,
			sno2_mng_typ_META,
			slo_sno2_flg_META,
			rqmt_sno2_flg_META,
			sno2_num_typ_META,
			sno2_ptn_cd_META,
			sno3_mng_typ_META,
			slo_sno3_flg_META,
			rqmt_sno3_flg_META,
			sno3_num_typ_META,
			sno3_ptn_cd_META,
			sno4_mng_typ_META,
			slo_sno4_flg_META,
			rqmt_sno4_flg_META,
			sno4_num_typ_META,
			sno4_ptn_cd_META,
			def_bom_ptn_META,
			mfg_inst_unit_typ_META,
			mrp_proc_typ_META,
			rqmt_typ_META,
			prod_pln_typ_META,
			dmnd_date_div_mons_META,
			alloc_margin_days_META,
			mrp_alloc_margin_days_META,
			mrp_opn_xfr_days_META,
			rqmt_rstr_qty_META,
			inpt_itm_add_flg_META,
			inpt_itm_del_flg_META,
			sch_flg_META,
			cntry_org_cd_META,
			comp_spec_typ_META,
			comp_rev_at_slo_flg_META,
			comp_core_itm_flg_META,
			itm_spec_grp_cd_META,
			sls_upri_grp_cd_META,
			bill_crryovr_times_META,
			pay_crryovr_times_META,
			slo_proc_flg_META,
			slo_proc_typ_META,
			ship_inst_typ_META,
			ship_lot_back_stop_flg_META,
			itm_ship_grp_cd_META,
			ship_valid_grp_cd_META,
			arr_skip_flg_META,
			purc_dlv_slip_flg_META,
			ship_term_cd_META,
			exim_xpns_typ_META,
			stk_lst_flg_META,
			ver_flg_META,
			sls_upri_cng_flg_META,
			purc_upri_cng_flg_META,
			prov_upri_cng_flg_META,
			ref_itm_cd_META,
			ref_itm_sub1_META,
			ref_itm_sub2_META,
			ref_itm_sub3_META,
			ext_sys_no_itm_META,
			chng_no_META,
			calc_ptn_cd_META,
			cost_std_qty_META,
			itm_alc_grp_META,
			sls_flg_META,
			mfg_flg_META,
			purc_flg_META,
			insp_flg_META,
			sls_input_flg_META,
			mfg_input_flg_META,
			purc_input_flg_META,
			insp_input_flg_META,
			release_flg_META,
			release_usr_cd_META,
			release_tm_META,
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
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
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
			stk_mng_typ_META,
			asset_mng_typ_META,
			sundry_itm_flg_META,
			dscnt_itm_flg_META,
			unit_cd_META,
			dec_place_META,
			rnd_typ_META,
			dim_unit_cd_META,
			dim_META,
			wt_unit_cd_META,
			wt_META,
			conts_unit_cd_META,
			conts_qty_META,
			unit_dim_META,
			unit_wt_META,
			hs_cd_META,
			jan_typ_META,
			jan_cd_META,
			itf_cd_META,
			gtin_cd_META,
			th_image_META,
			sls_itm_grp_cd_META,
			itm_nm_lcl1_META,
			itm_nm_lcl2_META,
			itm_nm_lcl3_META,
			itm_nm_lcl4_META,
			itm_nm_lcl5_META
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
	protected MAVM_ITM_MST_R(ConstMetaList<? extends MAVM_ITM_MST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_ITM_MST_R(ConstMetaList<? extends MAVM_ITM_MST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$co_cd,
				"co_cd",
				co_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_typ,
				"itm_typ",
				itm_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_typ_d_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_typ_d_cd,
				"itm_typ_d_cd",
				itm_typ_d_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_jnl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_jnl_cd,
				"itm_jnl_cd",
				itm_jnl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ac_itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ac_itm_grp_cd,
				"ac_itm_grp_cd",
				ac_itm_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$minus_stk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$minus_stk_flg,
				"minus_stk_flg",
				minus_stk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$not_new_lot_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$not_new_lot_flg,
				"not_new_lot_flg",
				not_new_lot_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$gi_alloc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$gi_alloc_flg,
				"gi_alloc_flg",
				gi_alloc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sls_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sls_tax_cd,
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
			MAVM_ITM_MST_R.$purc_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$purc_tax_cd,
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
			MAVM_ITM_MST_R.$prov_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$prov_tax_cd,
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
			MAVM_ITM_MST_R.$wtax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$wtax_rate,
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
			MAVM_ITM_MST_R.$ship_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ship_unit_cd,
				"ship_unit_cd",
				ship_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$mfg_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$mfg_unit_cd,
				"mfg_unit_cd",
				mfg_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$purc_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$purc_unit_cd,
				"purc_unit_cd",
				purc_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$pckg_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$pckg_unit_cd,
				"pckg_unit_cd",
				pckg_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$pack_alloc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$pack_alloc_flg,
				"pack_alloc_flg",
				pack_alloc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$lot_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$lot_mng_typ,
				"lot_mng_typ",
				lot_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$lot_no_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$lot_no_typ,
				"lot_no_typ",
				lot_no_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$lot_no_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$lot_no_ptn_cd,
				"lot_no_ptn_cd",
				lot_no_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sublot_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sublot_mng_typ,
				"sublot_mng_typ",
				sublot_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sublot_no_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sublot_no_typ,
				"sublot_no_typ",
				sublot_no_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sublot_no_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sublot_no_ptn_cd,
				"sublot_no_ptn_cd",
				sublot_no_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$bp_lot_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$bp_lot_flg,
				"bp_lot_flg",
				bp_lot_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$insp_bind_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$insp_bind_typ,
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
			MAVM_ITM_MST_R.$skip_chk_ship_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$skip_chk_ship_flg,
				"skip_chk_ship_flg",
				skip_chk_ship_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$mrkt_judg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$mrkt_judg_flg,
				"mrkt_judg_flg",
				mrkt_judg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$mrkt_judg_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$mrkt_judg_role_cd,
				"mrkt_judg_role_cd",
				mrkt_judg_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$mrkt_judg_upd_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$mrkt_judg_upd_role_cd,
				"mrkt_judg_upd_role_cd",
				mrkt_judg_upd_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$lmt_ctl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$lmt_ctl_flg,
				"lmt_ctl_flg",
				lmt_ctl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$lmt_ctl_categ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$lmt_ctl_categ,
				"lmt_ctl_categ",
				lmt_ctl_categ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$cont_fctr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$cont_fctr_flg,
				"cont_fctr_flg",
				cont_fctr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$std_cont_fctr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$std_cont_fctr,
				"std_cont_fctr",
				std_cont_fctr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$cont_fctr_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$cont_fctr_unit_cd,
				"cont_fctr_unit_cd",
				cont_fctr_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$cont_fctr_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$cont_fctr_rnd_typ,
				"cont_fctr_rnd_typ",
				cont_fctr_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$cont_fctr_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$cont_fctr_dec_place,
				"cont_fctr_dec_place",
				cont_fctr_dec_place,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno1_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno1_mng_typ,
				"sno1_mng_typ",
				sno1_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$slo_sno1_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$slo_sno1_flg,
				"slo_sno1_flg",
				slo_sno1_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$rqmt_sno1_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$rqmt_sno1_flg,
				"rqmt_sno1_flg",
				rqmt_sno1_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno1_num_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno1_num_typ,
				"sno1_num_typ",
				sno1_num_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno1_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno1_ptn_cd,
				"sno1_ptn_cd",
				sno1_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno2_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno2_mng_typ,
				"sno2_mng_typ",
				sno2_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$slo_sno2_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$slo_sno2_flg,
				"slo_sno2_flg",
				slo_sno2_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$rqmt_sno2_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$rqmt_sno2_flg,
				"rqmt_sno2_flg",
				rqmt_sno2_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno2_num_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno2_num_typ,
				"sno2_num_typ",
				sno2_num_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno2_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno2_ptn_cd,
				"sno2_ptn_cd",
				sno2_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno3_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno3_mng_typ,
				"sno3_mng_typ",
				sno3_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$slo_sno3_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$slo_sno3_flg,
				"slo_sno3_flg",
				slo_sno3_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$rqmt_sno3_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$rqmt_sno3_flg,
				"rqmt_sno3_flg",
				rqmt_sno3_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno3_num_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno3_num_typ,
				"sno3_num_typ",
				sno3_num_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno3_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno3_ptn_cd,
				"sno3_ptn_cd",
				sno3_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno4_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno4_mng_typ,
				"sno4_mng_typ",
				sno4_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$slo_sno4_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$slo_sno4_flg,
				"slo_sno4_flg",
				slo_sno4_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$rqmt_sno4_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$rqmt_sno4_flg,
				"rqmt_sno4_flg",
				rqmt_sno4_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno4_num_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno4_num_typ,
				"sno4_num_typ",
				sno4_num_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sno4_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sno4_ptn_cd,
				"sno4_ptn_cd",
				sno4_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$def_bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$def_bom_ptn,
				"def_bom_ptn",
				def_bom_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$mfg_inst_unit_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$mfg_inst_unit_typ,
				"mfg_inst_unit_typ",
				mfg_inst_unit_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$mrp_proc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$mrp_proc_typ,
				"mrp_proc_typ",
				mrp_proc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$rqmt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$rqmt_typ,
				"rqmt_typ",
				rqmt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$prod_pln_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$prod_pln_typ,
				"prod_pln_typ",
				prod_pln_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$dmnd_date_div_mons,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$dmnd_date_div_mons,
				"dmnd_date_div_mons",
				dmnd_date_div_mons,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$alloc_margin_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$alloc_margin_days,
				"alloc_margin_days",
				alloc_margin_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$mrp_alloc_margin_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$mrp_alloc_margin_days,
				"mrp_alloc_margin_days",
				mrp_alloc_margin_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$mrp_opn_xfr_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$mrp_opn_xfr_days,
				"mrp_opn_xfr_days",
				mrp_opn_xfr_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$rqmt_rstr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$rqmt_rstr_qty,
				"rqmt_rstr_qty",
				rqmt_rstr_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$inpt_itm_add_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$inpt_itm_add_flg,
				"inpt_itm_add_flg",
				inpt_itm_add_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$inpt_itm_del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$inpt_itm_del_flg,
				"inpt_itm_del_flg",
				inpt_itm_del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sch_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$sch_flg,
				"sch_flg",
				sch_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$cntry_org_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$cntry_org_cd,
				"cntry_org_cd",
				cntry_org_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$comp_spec_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$comp_spec_typ,
				"comp_spec_typ",
				comp_spec_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$comp_rev_at_slo_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$comp_rev_at_slo_flg,
				"comp_rev_at_slo_flg",
				comp_rev_at_slo_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$comp_core_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$comp_core_itm_flg,
				"comp_core_itm_flg",
				comp_core_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_spec_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_spec_grp_cd,
				"itm_spec_grp_cd",
				itm_spec_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sls_upri_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sls_upri_grp_cd,
				"sls_upri_grp_cd",
				sls_upri_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$bill_crryovr_times,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$bill_crryovr_times,
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
			MAVM_ITM_MST_R.$pay_crryovr_times,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$pay_crryovr_times,
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
			MAVM_ITM_MST_R.$slo_proc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$slo_proc_flg,
				"slo_proc_flg",
				slo_proc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$slo_proc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$slo_proc_typ,
				"slo_proc_typ",
				slo_proc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ship_inst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ship_inst_typ,
				"ship_inst_typ",
				ship_inst_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ship_lot_back_stop_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$ship_lot_back_stop_flg,
				"ship_lot_back_stop_flg",
				ship_lot_back_stop_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_ship_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_ship_grp_cd,
				"itm_ship_grp_cd",
				itm_ship_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ship_valid_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ship_valid_grp_cd,
				"ship_valid_grp_cd",
				ship_valid_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$arr_skip_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$arr_skip_flg,
				"arr_skip_flg",
				arr_skip_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$purc_dlv_slip_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$purc_dlv_slip_flg,
				"purc_dlv_slip_flg",
				purc_dlv_slip_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ship_term_cd,
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
			MAVM_ITM_MST_R.$exim_xpns_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$exim_xpns_typ,
				"exim_xpns_typ",
				exim_xpns_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$stk_lst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$stk_lst_flg,
				"stk_lst_flg",
				stk_lst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ver_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$ver_flg,
				"ver_flg",
				ver_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sls_upri_cng_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$sls_upri_cng_flg,
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
			MAVM_ITM_MST_R.$purc_upri_cng_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$purc_upri_cng_flg,
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
			MAVM_ITM_MST_R.$prov_upri_cng_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$prov_upri_cng_flg,
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
			MAVM_ITM_MST_R.$ref_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ref_itm_cd,
				"ref_itm_cd",
				ref_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ref_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ref_itm_sub1,
				"ref_itm_sub1",
				ref_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ref_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ref_itm_sub2,
				"ref_itm_sub2",
				ref_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ref_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ref_itm_sub3,
				"ref_itm_sub3",
				ref_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ext_sys_no_itm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ext_sys_no_itm,
				"ext_sys_no_itm",
				ext_sys_no_itm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$chng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$chng_no,
				"chng_no",
				chng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$calc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$calc_ptn_cd,
				"calc_ptn_cd",
				calc_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$cost_std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$cost_std_qty,
				"cost_std_qty",
				cost_std_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_alc_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_alc_grp,
				"itm_alc_grp",
				itm_alc_grp,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sls_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$sls_flg,
				"sls_flg",
				sls_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$mfg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$mfg_flg,
				"mfg_flg",
				mfg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$purc_flg,
				"purc_flg",
				purc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$insp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$insp_flg,
				"insp_flg",
				insp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sls_input_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$sls_input_flg,
				"sls_input_flg",
				sls_input_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$mfg_input_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$mfg_input_flg,
				"mfg_input_flg",
				mfg_input_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$purc_input_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$purc_input_flg,
				"purc_input_flg",
				purc_input_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$insp_input_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$insp_input_flg,
				"insp_input_flg",
				insp_input_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$release_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$release_flg,
				"release_flg",
				release_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$release_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$release_usr_cd,
				"release_usr_cd",
				release_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$release_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAVM_ITM_MST_R.$release_tm,
				"release_tm",
				release_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$del_flg,
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
			MAVM_ITM_MST_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$del_usr_id,
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
			MAVM_ITM_MST_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$del_usr_nm,
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
			MAVM_ITM_MST_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_ITM_MST_R.$del_ts,
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
			MAVM_ITM_MST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_ITM_MST_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_ITM_MST_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_nm,
				"itm_nm",
				itm_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_alt_nm1,
				"itm_alt_nm1",
				itm_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_alt_nm2,
				"itm_alt_nm2",
				itm_alt_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_alt_nm3,
				"itm_alt_nm3",
				itm_alt_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_alt_nm4,
				"itm_alt_nm4",
				itm_alt_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_grp_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_grp_cd1,
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
			MAVM_ITM_MST_R.$itm_grp_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_grp_cd2,
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
			MAVM_ITM_MST_R.$itm_grp_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_grp_cd3,
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
			MAVM_ITM_MST_R.$itm_grp_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_grp_cd4,
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
			MAVM_ITM_MST_R.$itm_grp_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_grp_cd5,
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
			MAVM_ITM_MST_R.$itm_grp_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_grp_cd6,
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
			MAVM_ITM_MST_R.$itm_grp_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_grp_cd7,
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
			MAVM_ITM_MST_R.$itm_grp_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_grp_cd8,
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
			MAVM_ITM_MST_R.$itm_grp_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_grp_cd9,
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
			MAVM_ITM_MST_R.$itm_grp_cd10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_grp_cd10,
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
			MAVM_ITM_MST_R.$stk_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$stk_mng_typ,
				"stk_mng_typ",
				stk_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$asset_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$asset_mng_typ,
				"asset_mng_typ",
				asset_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sundry_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$sundry_itm_flg,
				"sundry_itm_flg",
				sundry_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$dscnt_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_MST_R.$dscnt_itm_flg,
				"dscnt_itm_flg",
				dscnt_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$unit_cd,
				"unit_cd",
				unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$dec_place,
				"dec_place",
				dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$rnd_typ,
				"rnd_typ",
				rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$dim_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$dim_unit_cd,
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
			MAVM_ITM_MST_R.$dim,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$dim,
				"dim",
				dim,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$wt_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$wt_unit_cd,
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
			MAVM_ITM_MST_R.$wt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$wt,
				"wt",
				wt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$conts_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$conts_unit_cd,
				"conts_unit_cd",
				conts_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$conts_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$conts_qty,
				"conts_qty",
				conts_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$unit_dim,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$unit_dim,
				"unit_dim",
				unit_dim,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$unit_wt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_MST_R.$unit_wt,
				"unit_wt",
				unit_wt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$hs_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$hs_cd,
				"hs_cd",
				hs_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$jan_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$jan_typ,
				"jan_typ",
				jan_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$jan_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$jan_cd,
				"jan_cd",
				jan_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itf_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itf_cd,
				"itf_cd",
				itf_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$gtin_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$gtin_cd,
				"gtin_cd",
				gtin_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$th_image,
			new MCDBContainerColulmnInfo<MCBinaryPermColumn>(
				MCDataType.BINARY,
				MAVM_ITM_MST_R.$th_image,
				"th_image",
				th_image,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$sls_itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$sls_itm_grp_cd,
				"sls_itm_grp_cd",
				sls_itm_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_nm_lcl1,
				"itm_nm_lcl1",
				itm_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_nm_lcl2,
				"itm_nm_lcl2",
				itm_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_nm_lcl3,
				"itm_nm_lcl3",
				itm_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_nm_lcl4,
				"itm_nm_lcl4",
				itm_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_MST_R.$itm_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_MST_R.$itm_nm_lcl5,
				"itm_nm_lcl5",
				itm_nm_lcl5,
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
	public static MAVM_ITM_MST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_ITM_MST_R create(String alias) {
		MAVM_ITM_MST_R row = new MAVM_ITM_MST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_ITM_MST_R createByName(T proto) {
		MAVM_ITM_MST_R row = MAVM_ITM_MST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_MST_R clone() {
		return (MAVM_ITM_MST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_MST_R createInstance() {
		return (MAVM_ITM_MST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_MST_R getValues(String... names) {
		return (MAVM_ITM_MST_R) super.getValues(names);
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
		return false;
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
	 public MCDBContainer getPkWorkDbc(String alias) {
	 	return null;
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc() {
	 	return null;
	 }

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 4, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 4, $co_cd, value);
	}

	/**
	 * 品目区分. Item type.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 5, $itm_typ);
	}

	/**
	 * 品目区分. Item type.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 5, $itm_typ, value);
	}

	/**
	 * 品目区分詳細ＣＤ. Item type details cd..<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 6, $itm_typ_d_cd);
	}

	/**
	 * 品目区分詳細ＣＤ. Item type details cd..<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 6, $itm_typ_d_cd, value);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 7, $itm_jnl_cd);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 7, $itm_jnl_cd, value);
	}

	/**
	 * 会計品目分類ＣＤ. Accounting item classification cd..<p>
	 *
	 */
	public String ac_itm_grp_cd() {
		return getConstString(offset + 8, $ac_itm_grp_cd);
	}

	/**
	 * 会計品目分類ＣＤ. Accounting item classification cd..<p>
	 *
	 */
	public void ac_itm_grp_cd(String value) {
		setConstString(offset + 8, $ac_itm_grp_cd, value);
	}

	/**
	 * マイナス在庫許可ＦＬＧ. Allow negative inventory flg..<p>
	 *
	 */
	public boolean minus_stk_flg() {
		return getConstBoolean(offset + 9, $minus_stk_flg);
	}

	/**
	 * マイナス在庫許可ＦＬＧ. Allow negative inventory flg..<p>
	 *
	 */
	public void minus_stk_flg(boolean value) {
		setConstBoolean(offset + 9, $minus_stk_flg, value);
	}

	/**
	 * 新規ロット入力不可ＦＬＧ. Do not allow new lot input flg..<p>
	 *
	 */
	public boolean not_new_lot_flg() {
		return getConstBoolean(offset + 10, $not_new_lot_flg);
	}

	/**
	 * 新規ロット入力不可ＦＬＧ. Do not allow new lot input flg..<p>
	 *
	 */
	public void not_new_lot_flg(boolean value) {
		setConstBoolean(offset + 10, $not_new_lot_flg, value);
	}

	/**
	 * 出庫引当確認ＦＬＧ. GI allocation check flg..<p>
	 *
	 */
	public boolean gi_alloc_flg() {
		return getConstBoolean(offset + 11, $gi_alloc_flg);
	}

	/**
	 * 出庫引当確認ＦＬＧ. GI allocation check flg..<p>
	 *
	 */
	public void gi_alloc_flg(boolean value) {
		setConstBoolean(offset + 11, $gi_alloc_flg, value);
	}

	/**
	 * 売上税ＣＤ. Sales tax cd..<p>
	 *
	 */
	public String sls_tax_cd() {
		return getConstString(offset + 12, $sls_tax_cd);
	}

	/**
	 * 売上税ＣＤ. Sales tax cd..<p>
	 *
	 */
	public void sls_tax_cd(String value) {
		setConstString(offset + 12, $sls_tax_cd, value);
	}

	/**
	 * 仕入税ＣＤ. Purchase tax cd..<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 13, $purc_tax_cd);
	}

	/**
	 * 仕入税ＣＤ. Purchase tax cd..<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 13, $purc_tax_cd, value);
	}

	/**
	 * 支給税ＣＤ. Supply tax cd..<p>
	 *
	 */
	public String prov_tax_cd() {
		return getConstString(offset + 14, $prov_tax_cd);
	}

	/**
	 * 支給税ＣＤ. Supply tax cd..<p>
	 *
	 */
	public void prov_tax_cd(String value) {
		setConstString(offset + 14, $prov_tax_cd, value);
	}

	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 15, $wtax_rate);
	}

	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 15, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 15, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 15, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 15, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 15, $wtax_rate, value);
	}
	
	/**
	 * 出荷単位ＣＤ. Shipping unit cd..<p>
	 *
	 */
	public String ship_unit_cd() {
		return getConstString(offset + 16, $ship_unit_cd);
	}

	/**
	 * 出荷単位ＣＤ. Shipping unit cd..<p>
	 *
	 */
	public void ship_unit_cd(String value) {
		setConstString(offset + 16, $ship_unit_cd, value);
	}

	/**
	 * 製造単位ＣＤ. Mfg. unit cd..<p>
	 *
	 */
	public String mfg_unit_cd() {
		return getConstString(offset + 17, $mfg_unit_cd);
	}

	/**
	 * 製造単位ＣＤ. Mfg. unit cd..<p>
	 *
	 */
	public void mfg_unit_cd(String value) {
		setConstString(offset + 17, $mfg_unit_cd, value);
	}

	/**
	 * 発注単位ＣＤ. PO unit cd..<p>
	 *
	 */
	public String purc_unit_cd() {
		return getConstString(offset + 18, $purc_unit_cd);
	}

	/**
	 * 発注単位ＣＤ. PO unit cd..<p>
	 *
	 */
	public void purc_unit_cd(String value) {
		setConstString(offset + 18, $purc_unit_cd, value);
	}

	/**
	 * 梱包単位ＣＤ. Packing unit cd..<p>
	 *
	 */
	public String pckg_unit_cd() {
		return getConstString(offset + 19, $pckg_unit_cd);
	}

	/**
	 * 梱包単位ＣＤ. Packing unit cd..<p>
	 *
	 */
	public void pckg_unit_cd(String value) {
		setConstString(offset + 19, $pckg_unit_cd, value);
	}

	/**
	 * 荷姿引当ＦＬＧ. SKU allocation flg..<p>
	 *
	 */
	public boolean pack_alloc_flg() {
		return getConstBoolean(offset + 20, $pack_alloc_flg);
	}

	/**
	 * 荷姿引当ＦＬＧ. SKU allocation flg..<p>
	 *
	 */
	public void pack_alloc_flg(boolean value) {
		setConstBoolean(offset + 20, $pack_alloc_flg, value);
	}

	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 21, $lot_mng_typ);
	}

	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 21, $lot_mng_typ, value);
	}

	/**
	 * ロットＮＯ発番区分. Lot No. numbering type.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 22, $lot_no_typ);
	}

	/**
	 * ロットＮＯ発番区分. Lot No. numbering type.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 22, $lot_no_typ, value);
	}

	/**
	 * ロットＮＯ発番パタンＣＤ. Lot No. numbering pattern cd..<p>
	 *
	 */
	public String lot_no_ptn_cd() {
		return getConstString(offset + 23, $lot_no_ptn_cd);
	}

	/**
	 * ロットＮＯ発番パタンＣＤ. Lot No. numbering pattern cd..<p>
	 *
	 */
	public void lot_no_ptn_cd(String value) {
		setConstString(offset + 23, $lot_no_ptn_cd, value);
	}

	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 24, $sublot_mng_typ);
	}

	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 24, $sublot_mng_typ, value);
	}

	/**
	 * サブロットＮＯ発番区分. Sublot No. numbering type.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 25, $sublot_no_typ);
	}

	/**
	 * サブロットＮＯ発番区分. Sublot No. numbering type.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 25, $sublot_no_typ, value);
	}

	/**
	 * サブロットＮＯ発番パタンＣＤ. Sublot No. numbering pattern cd..<p>
	 *
	 */
	public String sublot_no_ptn_cd() {
		return getConstString(offset + 26, $sublot_no_ptn_cd);
	}

	/**
	 * サブロットＮＯ発番パタンＣＤ. Sublot No. numbering pattern cd..<p>
	 *
	 */
	public void sublot_no_ptn_cd(String value) {
		setConstString(offset + 26, $sublot_no_ptn_cd, value);
	}

	/**
	 * 業者ロットＮＯ必須ＦＬＧ. Vendor Lot No. required flg..<p>
	 *
	 */
	public boolean bp_lot_flg() {
		return getConstBoolean(offset + 27, $bp_lot_flg);
	}

	/**
	 * 業者ロットＮＯ必須ＦＬＧ. Vendor Lot No. required flg..<p>
	 *
	 */
	public void bp_lot_flg(boolean value) {
		setConstBoolean(offset + 27, $bp_lot_flg, value);
	}

	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public String insp_bind_typ() {
		return getConstString(offset + 28, $insp_bind_typ);
	}

	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public void insp_bind_typ(String value) {
		setConstString(offset + 28, $insp_bind_typ, value);
	}

	/**
	 * 出荷時構成チェック不要ＦＬＧ. Component check not required at shipping flg..<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return getConstBoolean(offset + 29, $skip_chk_ship_flg);
	}

	/**
	 * 出荷時構成チェック不要ＦＬＧ. Component check not required at shipping flg..<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 29, $skip_chk_ship_flg, value);
	}

	/**
	 * 市場出荷判定対象ＦＬＧ. For market release decision flg..<p>
	 *
	 */
	public boolean mrkt_judg_flg() {
		return getConstBoolean(offset + 30, $mrkt_judg_flg);
	}

	/**
	 * 市場出荷判定対象ＦＬＧ. For market release decision flg..<p>
	 *
	 */
	public void mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 30, $mrkt_judg_flg, value);
	}

	/**
	 * 市場出荷判定承認役割ＣＤ. Market release decision approval role cd..<p>
	 *
	 */
	public String mrkt_judg_role_cd() {
		return getConstString(offset + 31, $mrkt_judg_role_cd);
	}

	/**
	 * 市場出荷判定承認役割ＣＤ. Market release decision approval role cd..<p>
	 *
	 */
	public void mrkt_judg_role_cd(String value) {
		setConstString(offset + 31, $mrkt_judg_role_cd, value);
	}

	/**
	 * 市場出荷判定更新役割ＣＤ. Market release decision update role cd..<p>
	 *
	 */
	public String mrkt_judg_upd_role_cd() {
		return getConstString(offset + 32, $mrkt_judg_upd_role_cd);
	}

	/**
	 * 市場出荷判定更新役割ＣＤ. Market release decision update role cd..<p>
	 *
	 */
	public void mrkt_judg_upd_role_cd(String value) {
		setConstString(offset + 32, $mrkt_judg_upd_role_cd, value);
	}

	/**
	 * 期限管理対象ＦＬＧ. For expiration management flg..<p>
	 *
	 */
	public boolean lmt_ctl_flg() {
		return getConstBoolean(offset + 33, $lmt_ctl_flg);
	}

	/**
	 * 期限管理対象ＦＬＧ. For expiration management flg..<p>
	 *
	 */
	public void lmt_ctl_flg(boolean value) {
		setConstBoolean(offset + 33, $lmt_ctl_flg, value);
	}

	/**
	 * 期限管理種別. Expiration management type.<p>
	 *
	 */
	public String lmt_ctl_categ() {
		return getConstString(offset + 34, $lmt_ctl_categ);
	}

	/**
	 * 期限管理種別. Expiration management type.<p>
	 *
	 */
	public void lmt_ctl_categ(String value) {
		setConstString(offset + 34, $lmt_ctl_categ, value);
	}

	/**
	 * 有効成分対象ＦＬＧ. For active ingredient flg..<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 35, $cont_fctr_flg);
	}

	/**
	 * 有効成分対象ＦＬＧ. For active ingredient flg..<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 35, $cont_fctr_flg, value);
	}

	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 36, $std_cont_fctr);
	}

	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 36, $std_cont_fctr, value);
	}
	
	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 36, $std_cont_fctr, value);
	}
	
	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 36, $std_cont_fctr, value);
	}
	
	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 36, $std_cont_fctr, value);
	}
	
	/**
	 * 標準有効成分係数. Standard active ingredient coefficient.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 36, $std_cont_fctr, value);
	}
	
	/**
	 * 有効成分単位ＣＤ. Active ingredient unit cd..<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 37, $cont_fctr_unit_cd);
	}

	/**
	 * 有効成分単位ＣＤ. Active ingredient unit cd..<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 37, $cont_fctr_unit_cd, value);
	}

	/**
	 * 有効成分換算端数処理区分. Rounding type (Active ingredient conversion).<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 38, $cont_fctr_rnd_typ);
	}

	/**
	 * 有効成分換算端数処理区分. Rounding type (Active ingredient conversion).<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 38, $cont_fctr_rnd_typ, value);
	}

	/**
	 * 有効成分小数部有効桁数. Active ingredient number of decimal places.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 39, $cont_fctr_dec_place);
	}

	/**
	 * 有効成分小数部有効桁数. Active ingredient number of decimal places.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}
	
	/**
	 * 有効成分小数部有効桁数. Active ingredient number of decimal places.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}
	
	/**
	 * 有効成分小数部有効桁数. Active ingredient number of decimal places.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}
	
	/**
	 * 有効成分小数部有効桁数. Active ingredient number of decimal places.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}
	
	/**
	 * 有効成分小数部有効桁数. Active ingredient number of decimal places.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}
	
	/**
	 * 手配ＮＯ１管理区分. SEIBAN No. 1 management type.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 40, $sno1_mng_typ);
	}

	/**
	 * 手配ＮＯ１管理区分. SEIBAN No. 1 management type.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 40, $sno1_mng_typ, value);
	}

	/**
	 * 受注手配ＮＯ１必須ＦＬＧ. Sales order SEIBAN No. 1 required flg..<p>
	 *
	 */
	public boolean slo_sno1_flg() {
		return getConstBoolean(offset + 41, $slo_sno1_flg);
	}

	/**
	 * 受注手配ＮＯ１必須ＦＬＧ. Sales order SEIBAN No. 1 required flg..<p>
	 *
	 */
	public void slo_sno1_flg(boolean value) {
		setConstBoolean(offset + 41, $slo_sno1_flg, value);
	}

	/**
	 * 所要手配ＮＯ１必須ＦＬＧ. Requirements SEIBAN No. 1 required flg..<p>
	 *
	 */
	public boolean rqmt_sno1_flg() {
		return getConstBoolean(offset + 42, $rqmt_sno1_flg);
	}

	/**
	 * 所要手配ＮＯ１必須ＦＬＧ. Requirements SEIBAN No. 1 required flg..<p>
	 *
	 */
	public void rqmt_sno1_flg(boolean value) {
		setConstBoolean(offset + 42, $rqmt_sno1_flg, value);
	}

	/**
	 * 手配ＮＯ１発番区分. SEIBAN No. 1 numbering type.<p>
	 *
	 */
	public String sno1_num_typ() {
		return getConstString(offset + 43, $sno1_num_typ);
	}

	/**
	 * 手配ＮＯ１発番区分. SEIBAN No. 1 numbering type.<p>
	 *
	 */
	public void sno1_num_typ(String value) {
		setConstString(offset + 43, $sno1_num_typ, value);
	}

	/**
	 * 手配ＮＯ１発番パタンＣＤ. SEIBAN No. 1 numbering pattern cd..<p>
	 *
	 */
	public String sno1_ptn_cd() {
		return getConstString(offset + 44, $sno1_ptn_cd);
	}

	/**
	 * 手配ＮＯ１発番パタンＣＤ. SEIBAN No. 1 numbering pattern cd..<p>
	 *
	 */
	public void sno1_ptn_cd(String value) {
		setConstString(offset + 44, $sno1_ptn_cd, value);
	}

	/**
	 * 手配ＮＯ２管理区分. SEIBAN No. 2 management type.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 45, $sno2_mng_typ);
	}

	/**
	 * 手配ＮＯ２管理区分. SEIBAN No. 2 management type.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 45, $sno2_mng_typ, value);
	}

	/**
	 * 受注手配ＮＯ２必須ＦＬＧ. Sales order SEIBAN No. 2 required flg..<p>
	 *
	 */
	public boolean slo_sno2_flg() {
		return getConstBoolean(offset + 46, $slo_sno2_flg);
	}

	/**
	 * 受注手配ＮＯ２必須ＦＬＧ. Sales order SEIBAN No. 2 required flg..<p>
	 *
	 */
	public void slo_sno2_flg(boolean value) {
		setConstBoolean(offset + 46, $slo_sno2_flg, value);
	}

	/**
	 * 所要手配ＮＯ２必須ＦＬＧ. Requirements SEIBAN No. 2 required flg..<p>
	 *
	 */
	public boolean rqmt_sno2_flg() {
		return getConstBoolean(offset + 47, $rqmt_sno2_flg);
	}

	/**
	 * 所要手配ＮＯ２必須ＦＬＧ. Requirements SEIBAN No. 2 required flg..<p>
	 *
	 */
	public void rqmt_sno2_flg(boolean value) {
		setConstBoolean(offset + 47, $rqmt_sno2_flg, value);
	}

	/**
	 * 手配ＮＯ２発番区分. SEIBAN No. 2 numbering type.<p>
	 *
	 */
	public String sno2_num_typ() {
		return getConstString(offset + 48, $sno2_num_typ);
	}

	/**
	 * 手配ＮＯ２発番区分. SEIBAN No. 2 numbering type.<p>
	 *
	 */
	public void sno2_num_typ(String value) {
		setConstString(offset + 48, $sno2_num_typ, value);
	}

	/**
	 * 手配ＮＯ２発番パタンＣＤ. SEIBAN No. 2 numbering pattern cd..<p>
	 *
	 */
	public String sno2_ptn_cd() {
		return getConstString(offset + 49, $sno2_ptn_cd);
	}

	/**
	 * 手配ＮＯ２発番パタンＣＤ. SEIBAN No. 2 numbering pattern cd..<p>
	 *
	 */
	public void sno2_ptn_cd(String value) {
		setConstString(offset + 49, $sno2_ptn_cd, value);
	}

	/**
	 * 手配ＮＯ３管理区分. SEIBAN No. 3 management type.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 50, $sno3_mng_typ);
	}

	/**
	 * 手配ＮＯ３管理区分. SEIBAN No. 3 management type.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 50, $sno3_mng_typ, value);
	}

	/**
	 * 受注手配ＮＯ３必須ＦＬＧ. Sales order SEIBAN No. 3 required flg..<p>
	 *
	 */
	public boolean slo_sno3_flg() {
		return getConstBoolean(offset + 51, $slo_sno3_flg);
	}

	/**
	 * 受注手配ＮＯ３必須ＦＬＧ. Sales order SEIBAN No. 3 required flg..<p>
	 *
	 */
	public void slo_sno3_flg(boolean value) {
		setConstBoolean(offset + 51, $slo_sno3_flg, value);
	}

	/**
	 * 所要手配ＮＯ３必須ＦＬＧ. Requirements SEIBAN No. 3 required flg..<p>
	 *
	 */
	public boolean rqmt_sno3_flg() {
		return getConstBoolean(offset + 52, $rqmt_sno3_flg);
	}

	/**
	 * 所要手配ＮＯ３必須ＦＬＧ. Requirements SEIBAN No. 3 required flg..<p>
	 *
	 */
	public void rqmt_sno3_flg(boolean value) {
		setConstBoolean(offset + 52, $rqmt_sno3_flg, value);
	}

	/**
	 * 手配ＮＯ３発番区分. SEIBAN No. 3 numbering type.<p>
	 *
	 */
	public String sno3_num_typ() {
		return getConstString(offset + 53, $sno3_num_typ);
	}

	/**
	 * 手配ＮＯ３発番区分. SEIBAN No. 3 numbering type.<p>
	 *
	 */
	public void sno3_num_typ(String value) {
		setConstString(offset + 53, $sno3_num_typ, value);
	}

	/**
	 * 手配ＮＯ３発番パタンＣＤ. SEIBAN No. 3 numbering pattern cd..<p>
	 *
	 */
	public String sno3_ptn_cd() {
		return getConstString(offset + 54, $sno3_ptn_cd);
	}

	/**
	 * 手配ＮＯ３発番パタンＣＤ. SEIBAN No. 3 numbering pattern cd..<p>
	 *
	 */
	public void sno3_ptn_cd(String value) {
		setConstString(offset + 54, $sno3_ptn_cd, value);
	}

	/**
	 * 手配ＮＯ４管理区分. SEIBAN No. 4 management type.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 55, $sno4_mng_typ);
	}

	/**
	 * 手配ＮＯ４管理区分. SEIBAN No. 4 management type.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 55, $sno4_mng_typ, value);
	}

	/**
	 * 受注手配ＮＯ４必須ＦＬＧ. Sales order SEIBAN No. 4 required flg..<p>
	 *
	 */
	public boolean slo_sno4_flg() {
		return getConstBoolean(offset + 56, $slo_sno4_flg);
	}

	/**
	 * 受注手配ＮＯ４必須ＦＬＧ. Sales order SEIBAN No. 4 required flg..<p>
	 *
	 */
	public void slo_sno4_flg(boolean value) {
		setConstBoolean(offset + 56, $slo_sno4_flg, value);
	}

	/**
	 * 所要手配ＮＯ４必須ＦＬＧ. Requirements SEIBAN No. 4 required flg..<p>
	 *
	 */
	public boolean rqmt_sno4_flg() {
		return getConstBoolean(offset + 57, $rqmt_sno4_flg);
	}

	/**
	 * 所要手配ＮＯ４必須ＦＬＧ. Requirements SEIBAN No. 4 required flg..<p>
	 *
	 */
	public void rqmt_sno4_flg(boolean value) {
		setConstBoolean(offset + 57, $rqmt_sno4_flg, value);
	}

	/**
	 * 手配ＮＯ４発番区分. SEIBAN No. 4 numbering type.<p>
	 *
	 */
	public String sno4_num_typ() {
		return getConstString(offset + 58, $sno4_num_typ);
	}

	/**
	 * 手配ＮＯ４発番区分. SEIBAN No. 4 numbering type.<p>
	 *
	 */
	public void sno4_num_typ(String value) {
		setConstString(offset + 58, $sno4_num_typ, value);
	}

	/**
	 * 手配ＮＯ４発番パタンＣＤ. SEIBAN No. 4 numbering pattern cd..<p>
	 *
	 */
	public String sno4_ptn_cd() {
		return getConstString(offset + 59, $sno4_ptn_cd);
	}

	/**
	 * 手配ＮＯ４発番パタンＣＤ. SEIBAN No. 4 numbering pattern cd..<p>
	 *
	 */
	public void sno4_ptn_cd(String value) {
		setConstString(offset + 59, $sno4_ptn_cd, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String def_bom_ptn() {
		return getConstString(offset + 60, $def_bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void def_bom_ptn(String value) {
		setConstString(offset + 60, $def_bom_ptn, value);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 61, $mfg_inst_unit_typ);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 61, $mfg_inst_unit_typ, value);
	}

	/**
	 * ＭＲＰ処理区分. MRP process type.<p>
	 *
	 */
	public String mrp_proc_typ() {
		return getConstString(offset + 62, $mrp_proc_typ);
	}

	/**
	 * ＭＲＰ処理区分. MRP process type.<p>
	 *
	 */
	public void mrp_proc_typ(String value) {
		setConstString(offset + 62, $mrp_proc_typ, value);
	}

	/**
	 * 所要区分. Requirements type.<p>
	 *
	 */
	public String rqmt_typ() {
		return getConstString(offset + 63, $rqmt_typ);
	}

	/**
	 * 所要区分. Requirements type.<p>
	 *
	 */
	public void rqmt_typ(String value) {
		setConstString(offset + 63, $rqmt_typ, value);
	}

	/**
	 * 生産計画立案区分. Production planning type.<p>
	 *
	 */
	public String prod_pln_typ() {
		return getConstString(offset + 64, $prod_pln_typ);
	}

	/**
	 * 生産計画立案区分. Production planning type.<p>
	 *
	 */
	public void prod_pln_typ(String value) {
		setConstString(offset + 64, $prod_pln_typ, value);
	}

	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons() {
		return getConstNumber(offset + 65, $dmnd_date_div_mons);
	}

	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void dmnd_date_div_mons(MCNumber value) {
		setConstNumber(offset + 65, $dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void dmnd_date_div_mons(int value) {
		setConstNumber(offset + 65, $dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void dmnd_date_div_mons(long value) {
		setConstNumber(offset + 65, $dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void dmnd_date_div_mons(float value) {
		setConstNumber(offset + 65, $dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void dmnd_date_div_mons(double value) {
		setConstNumber(offset + 65, $dmnd_date_div_mons, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 66, $alloc_margin_days);
	}

	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 66, $alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 66, $alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 66, $alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 66, $alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 66, $alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days() {
		return getConstNumber(offset + 67, $mrp_alloc_margin_days);
	}

	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void mrp_alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 67, $mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void mrp_alloc_margin_days(int value) {
		setConstNumber(offset + 67, $mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void mrp_alloc_margin_days(long value) {
		setConstNumber(offset + 67, $mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void mrp_alloc_margin_days(float value) {
		setConstNumber(offset + 67, $mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void mrp_alloc_margin_days(double value) {
		setConstNumber(offset + 67, $mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days() {
		return getConstNumber(offset + 68, $mrp_opn_xfr_days);
	}

	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void mrp_opn_xfr_days(MCNumber value) {
		setConstNumber(offset + 68, $mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void mrp_opn_xfr_days(int value) {
		setConstNumber(offset + 68, $mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void mrp_opn_xfr_days(long value) {
		setConstNumber(offset + 68, $mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void mrp_opn_xfr_days(float value) {
		setConstNumber(offset + 68, $mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void mrp_opn_xfr_days(double value) {
		setConstNumber(offset + 68, $mrp_opn_xfr_days, value);
	}
	
	/**
	 * 所要抑制量. Requirements restricted qty..<p>
	 *
	 */
	public MCNumber rqmt_rstr_qty() {
		return getConstNumber(offset + 69, $rqmt_rstr_qty);
	}

	/**
	 * 所要抑制量. Requirements restricted qty..<p>
	 *
	 */
	public void rqmt_rstr_qty(MCNumber value) {
		setConstNumber(offset + 69, $rqmt_rstr_qty, value);
	}
	
	/**
	 * 所要抑制量. Requirements restricted qty..<p>
	 *
	 */
	public void rqmt_rstr_qty(int value) {
		setConstNumber(offset + 69, $rqmt_rstr_qty, value);
	}
	
	/**
	 * 所要抑制量. Requirements restricted qty..<p>
	 *
	 */
	public void rqmt_rstr_qty(long value) {
		setConstNumber(offset + 69, $rqmt_rstr_qty, value);
	}
	
	/**
	 * 所要抑制量. Requirements restricted qty..<p>
	 *
	 */
	public void rqmt_rstr_qty(float value) {
		setConstNumber(offset + 69, $rqmt_rstr_qty, value);
	}
	
	/**
	 * 所要抑制量. Requirements restricted qty..<p>
	 *
	 */
	public void rqmt_rstr_qty(double value) {
		setConstNumber(offset + 69, $rqmt_rstr_qty, value);
	}
	
	/**
	 * 投入品追加許可ＦＬＧ. Allow input item addition flg..<p>
	 *
	 */
	public boolean inpt_itm_add_flg() {
		return getConstBoolean(offset + 70, $inpt_itm_add_flg);
	}

	/**
	 * 投入品追加許可ＦＬＧ. Allow input item addition flg..<p>
	 *
	 */
	public void inpt_itm_add_flg(boolean value) {
		setConstBoolean(offset + 70, $inpt_itm_add_flg, value);
	}

	/**
	 * 投入品削除許可ＦＬＧ. Allow input item deletion flg..<p>
	 *
	 */
	public boolean inpt_itm_del_flg() {
		return getConstBoolean(offset + 71, $inpt_itm_del_flg);
	}

	/**
	 * 投入品削除許可ＦＬＧ. Allow input item deletion flg..<p>
	 *
	 */
	public void inpt_itm_del_flg(boolean value) {
		setConstBoolean(offset + 71, $inpt_itm_del_flg, value);
	}

	/**
	 * スケジューラＦＬＧ. Scheduler flg..<p>
	 *
	 */
	public boolean sch_flg() {
		return getConstBoolean(offset + 72, $sch_flg);
	}

	/**
	 * スケジューラＦＬＧ. Scheduler flg..<p>
	 *
	 */
	public void sch_flg(boolean value) {
		setConstBoolean(offset + 72, $sch_flg, value);
	}

	/**
	 * 原産地ＣＤ. Place of origin cd..<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 73, $cntry_org_cd);
	}

	/**
	 * 原産地ＣＤ. Place of origin cd..<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 73, $cntry_org_cd, value);
	}

	/**
	 * 構成・仕様管理区分. Configuration/specification management type.<p>
	 *
	 */
	public String comp_spec_typ() {
		return getConstString(offset + 74, $comp_spec_typ);
	}

	/**
	 * 構成・仕様管理区分. Configuration/specification management type.<p>
	 *
	 */
	public void comp_spec_typ(String value) {
		setConstString(offset + 74, $comp_spec_typ, value);
	}

	/**
	 * 受注時構成改訂許可ＦＬＧ. Allow sales order configuration rev. flg..<p>
	 *
	 */
	public boolean comp_rev_at_slo_flg() {
		return getConstBoolean(offset + 75, $comp_rev_at_slo_flg);
	}

	/**
	 * 受注時構成改訂許可ＦＬＧ. Allow sales order configuration rev. flg..<p>
	 *
	 */
	public void comp_rev_at_slo_flg(boolean value) {
		setConstBoolean(offset + 75, $comp_rev_at_slo_flg, value);
	}

	/**
	 * 構成主品目ＦＬＧ. Configuration main item flg..<p>
	 *
	 */
	public boolean comp_core_itm_flg() {
		return getConstBoolean(offset + 76, $comp_core_itm_flg);
	}

	/**
	 * 構成主品目ＦＬＧ. Configuration main item flg..<p>
	 *
	 */
	public void comp_core_itm_flg(boolean value) {
		setConstBoolean(offset + 76, $comp_core_itm_flg, value);
	}

	/**
	 * 品目仕様分類ＣＤ. Item specification classification cd..<p>
	 *
	 */
	public String itm_spec_grp_cd() {
		return getConstString(offset + 77, $itm_spec_grp_cd);
	}

	/**
	 * 品目仕様分類ＣＤ. Item specification classification cd..<p>
	 *
	 */
	public void itm_spec_grp_cd(String value) {
		setConstString(offset + 77, $itm_spec_grp_cd, value);
	}

	/**
	 * 販売単価分類ＣＤ. Sales unit price classification cd..<p>
	 *
	 */
	public String sls_upri_grp_cd() {
		return getConstString(offset + 78, $sls_upri_grp_cd);
	}

	/**
	 * 販売単価分類ＣＤ. Sales unit price classification cd..<p>
	 *
	 */
	public void sls_upri_grp_cd(String value) {
		setConstString(offset + 78, $sls_upri_grp_cd, value);
	}

	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 79, $bill_crryovr_times);
	}

	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 79, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 79, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 79, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 79, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 79, $bill_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 80, $pay_crryovr_times);
	}

	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 80, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 80, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 80, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 80, $pay_crryovr_times, value);
	}
	
	/**
	 * 支払繰越回数. Payment carry-over count.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 80, $pay_crryovr_times, value);
	}
	
	/**
	 * 受注手配品ＦＬＧ. Sales order procurement item flg..<p>
	 *
	 */
	public boolean slo_proc_flg() {
		return getConstBoolean(offset + 81, $slo_proc_flg);
	}

	/**
	 * 受注手配品ＦＬＧ. Sales order procurement item flg..<p>
	 *
	 */
	public void slo_proc_flg(boolean value) {
		setConstBoolean(offset + 81, $slo_proc_flg, value);
	}

	/**
	 * 受注手配区分. Sales order procurement type.<p>
	 *
	 */
	public String slo_proc_typ() {
		return getConstString(offset + 82, $slo_proc_typ);
	}

	/**
	 * 受注手配区分. Sales order procurement type.<p>
	 *
	 */
	public void slo_proc_typ(String value) {
		setConstString(offset + 82, $slo_proc_typ, value);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 83, $ship_inst_typ);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 83, $ship_inst_typ, value);
	}

	/**
	 * 出荷ロット逆転禁止ＦＬＧ. Shipping lot reverse prohibit flg..<p>
	 *
	 */
	public boolean ship_lot_back_stop_flg() {
		return getConstBoolean(offset + 84, $ship_lot_back_stop_flg);
	}

	/**
	 * 出荷ロット逆転禁止ＦＬＧ. Shipping lot reverse prohibit flg..<p>
	 *
	 */
	public void ship_lot_back_stop_flg(boolean value) {
		setConstBoolean(offset + 84, $ship_lot_back_stop_flg, value);
	}

	/**
	 * 品目出荷グループＣＤ. Item shipping group cd..<p>
	 *
	 */
	public String itm_ship_grp_cd() {
		return getConstString(offset + 85, $itm_ship_grp_cd);
	}

	/**
	 * 品目出荷グループＣＤ. Item shipping group cd..<p>
	 *
	 */
	public void itm_ship_grp_cd(String value) {
		setConstString(offset + 85, $itm_ship_grp_cd, value);
	}

	/**
	 * 出荷有効期限グループＣＤ. Shipping expiration date group cd..<p>
	 *
	 */
	public String ship_valid_grp_cd() {
		return getConstString(offset + 86, $ship_valid_grp_cd);
	}

	/**
	 * 出荷有効期限グループＣＤ. Shipping expiration date group cd..<p>
	 *
	 */
	public void ship_valid_grp_cd(String value) {
		setConstString(offset + 86, $ship_valid_grp_cd, value);
	}

	/**
	 * 入荷不要ＦＬＧ. Not receipt flg..<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 87, $arr_skip_flg);
	}

	/**
	 * 入荷不要ＦＬＧ. Not receipt flg..<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 87, $arr_skip_flg, value);
	}

	/**
	 * 購買納品書対象ＦＬＧ. Purchase delivery note target flg..<p>
	 *
	 */
	public boolean purc_dlv_slip_flg() {
		return getConstBoolean(offset + 88, $purc_dlv_slip_flg);
	}

	/**
	 * 購買納品書対象ＦＬＧ. Purchase delivery note target flg..<p>
	 *
	 */
	public void purc_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 88, $purc_dlv_slip_flg, value);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 89, $ship_term_cd);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 89, $ship_term_cd, value);
	}

	/**
	 * 輸出入諸掛区分. Import/export charges type.<p>
	 *
	 */
	public String exim_xpns_typ() {
		return getConstString(offset + 90, $exim_xpns_typ);
	}

	/**
	 * 輸出入諸掛区分. Import/export charges type.<p>
	 *
	 */
	public void exim_xpns_typ(String value) {
		setConstString(offset + 90, $exim_xpns_typ, value);
	}

	/**
	 * 現品票出力対象ＦＬＧ. For identification tag output flg..<p>
	 *
	 */
	public boolean stk_lst_flg() {
		return getConstBoolean(offset + 91, $stk_lst_flg);
	}

	/**
	 * 現品票出力対象ＦＬＧ. For identification tag output flg..<p>
	 *
	 */
	public void stk_lst_flg(boolean value) {
		setConstBoolean(offset + 91, $stk_lst_flg, value);
	}

	/**
	 * 版管理対象ＦＬＧ. For version control flg..<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 92, $ver_flg);
	}

	/**
	 * 版管理対象ＦＬＧ. For version control flg..<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 92, $ver_flg, value);
	}

	/**
	 * 販売単価変更許可ＦＬＧ. Allow sales unit price change flg..<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 93, $sls_upri_cng_flg);
	}

	/**
	 * 販売単価変更許可ＦＬＧ. Allow sales unit price change flg..<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 93, $sls_upri_cng_flg, value);
	}

	/**
	 * 購買単価変更許可ＦＬＧ. Allow purchasing unit price change flg..<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 94, $purc_upri_cng_flg);
	}

	/**
	 * 購買単価変更許可ＦＬＧ. Allow purchasing unit price change flg..<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 94, $purc_upri_cng_flg, value);
	}

	/**
	 * 支給単価変更許可ＦＬＧ. Allow supply unit price change flg..<p>
	 *
	 */
	public boolean prov_upri_cng_flg() {
		return getConstBoolean(offset + 95, $prov_upri_cng_flg);
	}

	/**
	 * 支給単価変更許可ＦＬＧ. Allow supply unit price change flg..<p>
	 *
	 */
	public void prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 95, $prov_upri_cng_flg, value);
	}

	/**
	 * 参照品目ＣＤ. Reference item cd..<p>
	 *
	 */
	public String ref_itm_cd() {
		return getConstString(offset + 96, $ref_itm_cd);
	}

	/**
	 * 参照品目ＣＤ. Reference item cd..<p>
	 *
	 */
	public void ref_itm_cd(String value) {
		setConstString(offset + 96, $ref_itm_cd, value);
	}

	/**
	 * 参照枝番１. Reference branch No. 1.<p>
	 *
	 */
	public String ref_itm_sub1() {
		return getConstString(offset + 97, $ref_itm_sub1);
	}

	/**
	 * 参照枝番１. Reference branch No. 1.<p>
	 *
	 */
	public void ref_itm_sub1(String value) {
		setConstString(offset + 97, $ref_itm_sub1, value);
	}

	/**
	 * 参照枝番２. Reference branch No. 2.<p>
	 *
	 */
	public String ref_itm_sub2() {
		return getConstString(offset + 98, $ref_itm_sub2);
	}

	/**
	 * 参照枝番２. Reference branch No. 2.<p>
	 *
	 */
	public void ref_itm_sub2(String value) {
		setConstString(offset + 98, $ref_itm_sub2, value);
	}

	/**
	 * 参照枝番３. Reference branch No. 3.<p>
	 *
	 */
	public String ref_itm_sub3() {
		return getConstString(offset + 99, $ref_itm_sub3);
	}

	/**
	 * 参照枝番３. Reference branch No. 3.<p>
	 *
	 */
	public void ref_itm_sub3(String value) {
		setConstString(offset + 99, $ref_itm_sub3, value);
	}

	/**
	 * 外部システムＮＯ. External system No..<p>
	 *
	 */
	public String ext_sys_no_itm() {
		return getConstString(offset + 100, $ext_sys_no_itm);
	}

	/**
	 * 外部システムＮＯ. External system No..<p>
	 *
	 */
	public void ext_sys_no_itm(String value) {
		setConstString(offset + 100, $ext_sys_no_itm, value);
	}

	/**
	 * 変更ＮＯ. Change No..<p>
	 *
	 */
	public String chng_no() {
		return getConstString(offset + 101, $chng_no);
	}

	/**
	 * 変更ＮＯ. Change No..<p>
	 *
	 */
	public void chng_no(String value) {
		setConstString(offset + 101, $chng_no, value);
	}

	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public String calc_ptn_cd() {
		return getConstString(offset + 102, $calc_ptn_cd);
	}

	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public void calc_ptn_cd(String value) {
		setConstString(offset + 102, $calc_ptn_cd, value);
	}

	/**
	 * 原価基準数量. Cost base qty..<p>
	 *
	 */
	public MCNumber cost_std_qty() {
		return getConstNumber(offset + 103, $cost_std_qty);
	}

	/**
	 * 原価基準数量. Cost base qty..<p>
	 *
	 */
	public void cost_std_qty(MCNumber value) {
		setConstNumber(offset + 103, $cost_std_qty, value);
	}
	
	/**
	 * 原価基準数量. Cost base qty..<p>
	 *
	 */
	public void cost_std_qty(int value) {
		setConstNumber(offset + 103, $cost_std_qty, value);
	}
	
	/**
	 * 原価基準数量. Cost base qty..<p>
	 *
	 */
	public void cost_std_qty(long value) {
		setConstNumber(offset + 103, $cost_std_qty, value);
	}
	
	/**
	 * 原価基準数量. Cost base qty..<p>
	 *
	 */
	public void cost_std_qty(float value) {
		setConstNumber(offset + 103, $cost_std_qty, value);
	}
	
	/**
	 * 原価基準数量. Cost base qty..<p>
	 *
	 */
	public void cost_std_qty(double value) {
		setConstNumber(offset + 103, $cost_std_qty, value);
	}
	
	/**
	 * 品目配賦グループ. Item allocation group.<p>
	 *
	 */
	public String itm_alc_grp() {
		return getConstString(offset + 104, $itm_alc_grp);
	}

	/**
	 * 品目配賦グループ. Item allocation group.<p>
	 *
	 */
	public void itm_alc_grp(String value) {
		setConstString(offset + 104, $itm_alc_grp, value);
	}

	/**
	 * 販売ＦＬＧ. Sales flg..<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 105, $sls_flg);
	}

	/**
	 * 販売ＦＬＧ. Sales flg..<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 105, $sls_flg, value);
	}

	/**
	 * 製造ＦＬＧ. Mfg. flg..<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 106, $mfg_flg);
	}

	/**
	 * 製造ＦＬＧ. Mfg. flg..<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 106, $mfg_flg, value);
	}

	/**
	 * 購買ＦＬＧ. Purchasing flg..<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 107, $purc_flg);
	}

	/**
	 * 購買ＦＬＧ. Purchasing flg..<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 107, $purc_flg, value);
	}

	/**
	 * 検査ＦＬＧ. Inspection flg..<p>
	 *
	 */
	public boolean insp_flg() {
		return getConstBoolean(offset + 108, $insp_flg);
	}

	/**
	 * 検査ＦＬＧ. Inspection flg..<p>
	 *
	 */
	public void insp_flg(boolean value) {
		setConstBoolean(offset + 108, $insp_flg, value);
	}

	/**
	 * 販売設定済ＦＬＧ. Sales configured flg..<p>
	 *
	 */
	public boolean sls_input_flg() {
		return getConstBoolean(offset + 109, $sls_input_flg);
	}

	/**
	 * 販売設定済ＦＬＧ. Sales configured flg..<p>
	 *
	 */
	public void sls_input_flg(boolean value) {
		setConstBoolean(offset + 109, $sls_input_flg, value);
	}

	/**
	 * 製造設定済ＦＬＧ. Mfg. configured flg..<p>
	 *
	 */
	public boolean mfg_input_flg() {
		return getConstBoolean(offset + 110, $mfg_input_flg);
	}

	/**
	 * 製造設定済ＦＬＧ. Mfg. configured flg..<p>
	 *
	 */
	public void mfg_input_flg(boolean value) {
		setConstBoolean(offset + 110, $mfg_input_flg, value);
	}

	/**
	 * 購買設定済ＦＬＧ. Purchase configured flg..<p>
	 *
	 */
	public boolean purc_input_flg() {
		return getConstBoolean(offset + 111, $purc_input_flg);
	}

	/**
	 * 購買設定済ＦＬＧ. Purchase configured flg..<p>
	 *
	 */
	public void purc_input_flg(boolean value) {
		setConstBoolean(offset + 111, $purc_input_flg, value);
	}

	/**
	 * 検査設定済ＦＬＧ. Inspection configured flg..<p>
	 *
	 */
	public boolean insp_input_flg() {
		return getConstBoolean(offset + 112, $insp_input_flg);
	}

	/**
	 * 検査設定済ＦＬＧ. Inspection configured flg..<p>
	 *
	 */
	public void insp_input_flg(boolean value) {
		setConstBoolean(offset + 112, $insp_input_flg, value);
	}

	/**
	 * リリースＦＬＧ. Release flg..<p>
	 *
	 */
	public boolean release_flg() {
		return getConstBoolean(offset + 113, $release_flg);
	}

	/**
	 * リリースＦＬＧ. Release flg..<p>
	 *
	 */
	public void release_flg(boolean value) {
		setConstBoolean(offset + 113, $release_flg, value);
	}

	/**
	 * リリース担当者ＣＤ. Release PIC name cd..<p>
	 *
	 */
	public String release_usr_cd() {
		return getConstString(offset + 114, $release_usr_cd);
	}

	/**
	 * リリース担当者ＣＤ. Release PIC name cd..<p>
	 *
	 */
	public void release_usr_cd(String value) {
		setConstString(offset + 114, $release_usr_cd, value);
	}

	/**
	 * リリース日時. Release date and time.<p>
	 *
	 */
	public MCDate release_tm() {
		return getConstDate(offset + 115, $release_tm);
	}

	/**
	 * リリース日時. Release date and time.<p>
	 *
	 */
	public void release_tm(MCDate value) {
		setConstDate(offset + 115, $release_tm, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 116, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 116, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 117, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 117, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 118, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 118, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 119, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 119, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 120, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 120, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 121, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 121, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 122, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 122, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 123, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 123, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 124, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 124, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 125, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 125, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 126, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 126, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 127, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 127, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 127, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 127, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 127, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 127, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 128, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 128, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 129, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 129, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 130, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 130, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 131, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 131, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 132, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 132, $upd_srv_req_no, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 133, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 133, $itm_nm, value);
	}

	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 134, $itm_alt_nm1);
	}

	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 134, $itm_alt_nm1, value);
	}

	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 135, $itm_alt_nm2);
	}

	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 135, $itm_alt_nm2, value);
	}

	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 136, $itm_alt_nm3);
	}

	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 136, $itm_alt_nm3, value);
	}

	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 137, $itm_alt_nm4);
	}

	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 137, $itm_alt_nm4, value);
	}

	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 138, $itm_grp_cd1);
	}

	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 138, $itm_grp_cd1, value);
	}

	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 139, $itm_grp_cd2);
	}

	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 139, $itm_grp_cd2, value);
	}

	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 140, $itm_grp_cd3);
	}

	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 140, $itm_grp_cd3, value);
	}

	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 141, $itm_grp_cd4);
	}

	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 141, $itm_grp_cd4, value);
	}

	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 142, $itm_grp_cd5);
	}

	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 142, $itm_grp_cd5, value);
	}

	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 143, $itm_grp_cd6);
	}

	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 143, $itm_grp_cd6, value);
	}

	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 144, $itm_grp_cd7);
	}

	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 144, $itm_grp_cd7, value);
	}

	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 145, $itm_grp_cd8);
	}

	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 145, $itm_grp_cd8, value);
	}

	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 146, $itm_grp_cd9);
	}

	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 146, $itm_grp_cd9, value);
	}

	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 147, $itm_grp_cd10);
	}

	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 147, $itm_grp_cd10, value);
	}

	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 148, $stk_mng_typ);
	}

	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 148, $stk_mng_typ, value);
	}

	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 149, $asset_mng_typ);
	}

	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 149, $asset_mng_typ, value);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 150, $sundry_itm_flg);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 150, $sundry_itm_flg, value);
	}

	/**
	 * 値引品目ＦＬＧ. Discount item flg..<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 151, $dscnt_itm_flg);
	}

	/**
	 * 値引品目ＦＬＧ. Discount item flg..<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 151, $dscnt_itm_flg, value);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 152, $unit_cd);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 152, $unit_cd, value);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 153, $dec_place);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 153, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 153, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 153, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 153, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 153, $dec_place, value);
	}
	
	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 154, $rnd_typ);
	}

	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 154, $rnd_typ, value);
	}

	/**
	 * 容積単位ＣＤ. Volume unit cd..<p>
	 *
	 */
	public String dim_unit_cd() {
		return getConstString(offset + 155, $dim_unit_cd);
	}

	/**
	 * 容積単位ＣＤ. Volume unit cd..<p>
	 *
	 */
	public void dim_unit_cd(String value) {
		setConstString(offset + 155, $dim_unit_cd, value);
	}

	/**
	 * 容積. Volume.<p>
	 *
	 */
	public MCNumber dim() {
		return getConstNumber(offset + 156, $dim);
	}

	/**
	 * 容積. Volume.<p>
	 *
	 */
	public void dim(MCNumber value) {
		setConstNumber(offset + 156, $dim, value);
	}
	
	/**
	 * 容積. Volume.<p>
	 *
	 */
	public void dim(int value) {
		setConstNumber(offset + 156, $dim, value);
	}
	
	/**
	 * 容積. Volume.<p>
	 *
	 */
	public void dim(long value) {
		setConstNumber(offset + 156, $dim, value);
	}
	
	/**
	 * 容積. Volume.<p>
	 *
	 */
	public void dim(float value) {
		setConstNumber(offset + 156, $dim, value);
	}
	
	/**
	 * 容積. Volume.<p>
	 *
	 */
	public void dim(double value) {
		setConstNumber(offset + 156, $dim, value);
	}
	
	/**
	 * 重量単位ＣＤ. Weight unit cd..<p>
	 *
	 */
	public String wt_unit_cd() {
		return getConstString(offset + 157, $wt_unit_cd);
	}

	/**
	 * 重量単位ＣＤ. Weight unit cd..<p>
	 *
	 */
	public void wt_unit_cd(String value) {
		setConstString(offset + 157, $wt_unit_cd, value);
	}

	/**
	 * 重量. Weight.<p>
	 *
	 */
	public MCNumber wt() {
		return getConstNumber(offset + 158, $wt);
	}

	/**
	 * 重量. Weight.<p>
	 *
	 */
	public void wt(MCNumber value) {
		setConstNumber(offset + 158, $wt, value);
	}
	
	/**
	 * 重量. Weight.<p>
	 *
	 */
	public void wt(int value) {
		setConstNumber(offset + 158, $wt, value);
	}
	
	/**
	 * 重量. Weight.<p>
	 *
	 */
	public void wt(long value) {
		setConstNumber(offset + 158, $wt, value);
	}
	
	/**
	 * 重量. Weight.<p>
	 *
	 */
	public void wt(float value) {
		setConstNumber(offset + 158, $wt, value);
	}
	
	/**
	 * 重量. Weight.<p>
	 *
	 */
	public void wt(double value) {
		setConstNumber(offset + 158, $wt, value);
	}
	
	/**
	 * 入り目単位ＣＤ. Conversion unit cd..<p>
	 *
	 */
	public String conts_unit_cd() {
		return getConstString(offset + 159, $conts_unit_cd);
	}

	/**
	 * 入り目単位ＣＤ. Conversion unit cd..<p>
	 *
	 */
	public void conts_unit_cd(String value) {
		setConstString(offset + 159, $conts_unit_cd, value);
	}

	/**
	 * 入り目数量. Conversion qty..<p>
	 *
	 */
	public MCNumber conts_qty() {
		return getConstNumber(offset + 160, $conts_qty);
	}

	/**
	 * 入り目数量. Conversion qty..<p>
	 *
	 */
	public void conts_qty(MCNumber value) {
		setConstNumber(offset + 160, $conts_qty, value);
	}
	
	/**
	 * 入り目数量. Conversion qty..<p>
	 *
	 */
	public void conts_qty(int value) {
		setConstNumber(offset + 160, $conts_qty, value);
	}
	
	/**
	 * 入り目数量. Conversion qty..<p>
	 *
	 */
	public void conts_qty(long value) {
		setConstNumber(offset + 160, $conts_qty, value);
	}
	
	/**
	 * 入り目数量. Conversion qty..<p>
	 *
	 */
	public void conts_qty(float value) {
		setConstNumber(offset + 160, $conts_qty, value);
	}
	
	/**
	 * 入り目数量. Conversion qty..<p>
	 *
	 */
	public void conts_qty(double value) {
		setConstNumber(offset + 160, $conts_qty, value);
	}
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public MCNumber unit_dim() {
		return getConstNumber(offset + 161, $unit_dim);
	}

	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public void unit_dim(MCNumber value) {
		setConstNumber(offset + 161, $unit_dim, value);
	}
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public void unit_dim(int value) {
		setConstNumber(offset + 161, $unit_dim, value);
	}
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public void unit_dim(long value) {
		setConstNumber(offset + 161, $unit_dim, value);
	}
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public void unit_dim(float value) {
		setConstNumber(offset + 161, $unit_dim, value);
	}
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public void unit_dim(double value) {
		setConstNumber(offset + 161, $unit_dim, value);
	}
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public MCNumber unit_wt() {
		return getConstNumber(offset + 162, $unit_wt);
	}

	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public void unit_wt(MCNumber value) {
		setConstNumber(offset + 162, $unit_wt, value);
	}
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public void unit_wt(int value) {
		setConstNumber(offset + 162, $unit_wt, value);
	}
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public void unit_wt(long value) {
		setConstNumber(offset + 162, $unit_wt, value);
	}
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public void unit_wt(float value) {
		setConstNumber(offset + 162, $unit_wt, value);
	}
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public void unit_wt(double value) {
		setConstNumber(offset + 162, $unit_wt, value);
	}
	
	/**
	 * ＨＳ ＣＤ. HS cd..<p>
	 *
	 */
	public String hs_cd() {
		return getConstString(offset + 163, $hs_cd);
	}

	/**
	 * ＨＳ ＣＤ. HS cd..<p>
	 *
	 */
	public void hs_cd(String value) {
		setConstString(offset + 163, $hs_cd, value);
	}

	/**
	 * ＪＡＮ区分. JAN type.<p>
	 *
	 */
	public String jan_typ() {
		return getConstString(offset + 164, $jan_typ);
	}

	/**
	 * ＪＡＮ区分. JAN type.<p>
	 *
	 */
	public void jan_typ(String value) {
		setConstString(offset + 164, $jan_typ, value);
	}

	/**
	 * ＪＡＮ ＣＤ. JAN cd..<p>
	 *
	 */
	public String jan_cd() {
		return getConstString(offset + 165, $jan_cd);
	}

	/**
	 * ＪＡＮ ＣＤ. JAN cd..<p>
	 *
	 */
	public void jan_cd(String value) {
		setConstString(offset + 165, $jan_cd, value);
	}

	/**
	 * ＩＴＦ ＣＤ. ITF cd..<p>
	 *
	 */
	public String itf_cd() {
		return getConstString(offset + 166, $itf_cd);
	}

	/**
	 * ＩＴＦ ＣＤ. ITF cd..<p>
	 *
	 */
	public void itf_cd(String value) {
		setConstString(offset + 166, $itf_cd, value);
	}

	/**
	 * ＧＴＩＮ ＣＤ. GTIN cd..<p>
	 *
	 */
	public String gtin_cd() {
		return getConstString(offset + 167, $gtin_cd);
	}

	/**
	 * ＧＴＩＮ ＣＤ. GTIN cd..<p>
	 *
	 */
	public void gtin_cd(String value) {
		setConstString(offset + 167, $gtin_cd, value);
	}

	/**
	 * サムネイル画像. Thumbnail image.<p>
	 *
	 */
	public MCBinary th_image() {
		return getConstBinary(offset + 168, $th_image);
	}

	/**
	 * サムネイル画像. Thumbnail image.<p>
	 *
	 */
	public void th_image(MCBinary value) {
		setConstBinary(offset + 168, $th_image, value);
	}

	/**
	 * 販売品目体系ＣＤ. Sales item system cd..<p>
	 *
	 */
	public String sls_itm_grp_cd() {
		return getConstString(offset + 169, $sls_itm_grp_cd);
	}

	/**
	 * 販売品目体系ＣＤ. Sales item system cd..<p>
	 *
	 */
	public void sls_itm_grp_cd(String value) {
		setConstString(offset + 169, $sls_itm_grp_cd, value);
	}

	/**
	 * 品目名（ロケール１）. Item name (Locale1).<p>
	 *
	 */
	public String itm_nm_lcl1() {
		return getConstString(offset + 170, $itm_nm_lcl1);
	}

	/**
	 * 品目名（ロケール１）. Item name (Locale1).<p>
	 *
	 */
	public void itm_nm_lcl1(String value) {
		setConstString(offset + 170, $itm_nm_lcl1, value);
	}

	/**
	 * 品目名（ロケール２）. Item name (Locale2).<p>
	 *
	 */
	public String itm_nm_lcl2() {
		return getConstString(offset + 171, $itm_nm_lcl2);
	}

	/**
	 * 品目名（ロケール２）. Item name (Locale2).<p>
	 *
	 */
	public void itm_nm_lcl2(String value) {
		setConstString(offset + 171, $itm_nm_lcl2, value);
	}

	/**
	 * 品目名（ロケール３）. Item name (Locale3).<p>
	 *
	 */
	public String itm_nm_lcl3() {
		return getConstString(offset + 172, $itm_nm_lcl3);
	}

	/**
	 * 品目名（ロケール３）. Item name (Locale3).<p>
	 *
	 */
	public void itm_nm_lcl3(String value) {
		setConstString(offset + 172, $itm_nm_lcl3, value);
	}

	/**
	 * 品目名（ロケール４）. Item name (Locale4).<p>
	 *
	 */
	public String itm_nm_lcl4() {
		return getConstString(offset + 173, $itm_nm_lcl4);
	}

	/**
	 * 品目名（ロケール４）. Item name (Locale4).<p>
	 *
	 */
	public void itm_nm_lcl4(String value) {
		setConstString(offset + 173, $itm_nm_lcl4, value);
	}

	/**
	 * 品目名（ロケール５）. Item name (Locale5).<p>
	 *
	 */
	public String itm_nm_lcl5() {
		return getConstString(offset + 174, $itm_nm_lcl5);
	}

	/**
	 * 品目名（ロケール５）. Item name (Locale5).<p>
	 *
	 */
	public void itm_nm_lcl5(String value) {
		setConstString(offset + 174, $itm_nm_lcl5, value);
	}

	public String getString(String name) {
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
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			return ship_unit_cd();
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			return mfg_unit_cd();
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			return purc_unit_cd();
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_upd_role_cd();
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			return lmt_ctl_categ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			return sno1_ptn_cd();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			return sno2_ptn_cd();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			return sno3_ptn_cd();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			return sno4_ptn_cd();
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			return def_bom_ptn();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return itm_spec_grp_cd();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($slo_proc_typ.equalsIgnoreCase(name)) {
			return slo_proc_typ();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			return exim_xpns_typ();
		}
		if ($ref_itm_cd.equalsIgnoreCase(name)) {
			return ref_itm_cd();
		}
		if ($ref_itm_sub1.equalsIgnoreCase(name)) {
			return ref_itm_sub1();
		}
		if ($ref_itm_sub2.equalsIgnoreCase(name)) {
			return ref_itm_sub2();
		}
		if ($ref_itm_sub3.equalsIgnoreCase(name)) {
			return ref_itm_sub3();
		}
		if ($ext_sys_no_itm.equalsIgnoreCase(name)) {
			return ext_sys_no_itm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			return itm_alc_grp();
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			return release_usr_cd();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			return conts_unit_cd();
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			return jan_typ();
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			return jan_cd();
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			return itf_cd();
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			return gtin_cd();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($itm_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_nm_lcl1();
		}
		if ($itm_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_nm_lcl2();
		}
		if ($itm_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_nm_lcl3();
		}
		if ($itm_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_nm_lcl4();
		}
		if ($itm_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_nm_lcl5();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days();
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days();
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			return rqmt_rstr_qty();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			return cost_std_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			return conts_qty();
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			return unit_dim();
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			return unit_wt();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($release_tm.equalsIgnoreCase(name)) {
			return release_tm();
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
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			return minus_stk_flg();
		}
		if ($not_new_lot_flg.equalsIgnoreCase(name)) {
			return not_new_lot_flg();
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			return gi_alloc_flg();
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			return pack_alloc_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return rqmt_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return rqmt_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return rqmt_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return rqmt_sno4_flg();
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return inpt_itm_add_flg();
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return inpt_itm_del_flg();
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			return sch_flg();
		}
		if ($comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			return comp_rev_at_slo_flg();
		}
		if ($comp_core_itm_flg.equalsIgnoreCase(name)) {
			return comp_core_itm_flg();
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			return slo_proc_flg();
		}
		if ($ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			return ship_lot_back_stop_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			return purc_dlv_slip_flg();
		}
		if ($stk_lst_flg.equalsIgnoreCase(name)) {
			return stk_lst_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			return sls_input_flg();
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			return mfg_input_flg();
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			return purc_input_flg();
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			return insp_input_flg();
		}
		if ($release_flg.equalsIgnoreCase(name)) {
			return release_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBoolean(name);
	}

	public MCBinary getBinary(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
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
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			return ship_unit_cd();
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			return mfg_unit_cd();
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			return purc_unit_cd();
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_upd_role_cd();
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			return lmt_ctl_categ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			return sno1_ptn_cd();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			return sno2_ptn_cd();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			return sno3_ptn_cd();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			return sno4_ptn_cd();
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			return def_bom_ptn();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return itm_spec_grp_cd();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($slo_proc_typ.equalsIgnoreCase(name)) {
			return slo_proc_typ();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			return exim_xpns_typ();
		}
		if ($ref_itm_cd.equalsIgnoreCase(name)) {
			return ref_itm_cd();
		}
		if ($ref_itm_sub1.equalsIgnoreCase(name)) {
			return ref_itm_sub1();
		}
		if ($ref_itm_sub2.equalsIgnoreCase(name)) {
			return ref_itm_sub2();
		}
		if ($ref_itm_sub3.equalsIgnoreCase(name)) {
			return ref_itm_sub3();
		}
		if ($ext_sys_no_itm.equalsIgnoreCase(name)) {
			return ext_sys_no_itm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			return itm_alc_grp();
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			return release_usr_cd();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			return conts_unit_cd();
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			return jan_typ();
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			return jan_cd();
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			return itf_cd();
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			return gtin_cd();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($itm_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_nm_lcl1();
		}
		if ($itm_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_nm_lcl2();
		}
		if ($itm_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_nm_lcl3();
		}
		if ($itm_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_nm_lcl4();
		}
		if ($itm_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_nm_lcl5();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days();
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days();
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			return rqmt_rstr_qty();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			return cost_std_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			return conts_qty();
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			return unit_dim();
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			return unit_wt();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($release_tm.equalsIgnoreCase(name)) {
			return release_tm();
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
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			return minus_stk_flg();
		}
		if ($not_new_lot_flg.equalsIgnoreCase(name)) {
			return not_new_lot_flg();
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			return gi_alloc_flg();
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			return pack_alloc_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return rqmt_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return rqmt_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return rqmt_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return rqmt_sno4_flg();
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return inpt_itm_add_flg();
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return inpt_itm_del_flg();
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			return sch_flg();
		}
		if ($comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			return comp_rev_at_slo_flg();
		}
		if ($comp_core_itm_flg.equalsIgnoreCase(name)) {
			return comp_core_itm_flg();
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			return slo_proc_flg();
		}
		if ($ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			return ship_lot_back_stop_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			return purc_dlv_slip_flg();
		}
		if ($stk_lst_flg.equalsIgnoreCase(name)) {
			return stk_lst_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			return sls_input_flg();
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			return mfg_input_flg();
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			return purc_input_flg();
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			return insp_input_flg();
		}
		if ($release_flg.equalsIgnoreCase(name)) {
			return release_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBooleanNE(name);
	}

	public MCBinary getBinaryNE(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
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
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			ship_unit_cd(value);
			return;
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			mfg_unit_cd(value);
			return;
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			purc_unit_cd(value);
			return;
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			lmt_ctl_categ(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			sno1_ptn_cd(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			sno2_ptn_cd(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			sno3_ptn_cd(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			sno4_ptn_cd(value);
			return;
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			def_bom_ptn(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			mrp_proc_typ(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			itm_spec_grp_cd(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($slo_proc_typ.equalsIgnoreCase(name)) {
			slo_proc_typ(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			exim_xpns_typ(value);
			return;
		}
		if ($ref_itm_cd.equalsIgnoreCase(name)) {
			ref_itm_cd(value);
			return;
		}
		if ($ref_itm_sub1.equalsIgnoreCase(name)) {
			ref_itm_sub1(value);
			return;
		}
		if ($ref_itm_sub2.equalsIgnoreCase(name)) {
			ref_itm_sub2(value);
			return;
		}
		if ($ref_itm_sub3.equalsIgnoreCase(name)) {
			ref_itm_sub3(value);
			return;
		}
		if ($ext_sys_no_itm.equalsIgnoreCase(name)) {
			ext_sys_no_itm(value);
			return;
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			itm_alc_grp(value);
			return;
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			release_usr_cd(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			conts_unit_cd(value);
			return;
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			jan_typ(value);
			return;
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			jan_cd(value);
			return;
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			itf_cd(value);
			return;
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			gtin_cd(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($itm_nm_lcl1.equalsIgnoreCase(name)) {
			itm_nm_lcl1(value);
			return;
		}
		if ($itm_nm_lcl2.equalsIgnoreCase(name)) {
			itm_nm_lcl2(value);
			return;
		}
		if ($itm_nm_lcl3.equalsIgnoreCase(name)) {
			itm_nm_lcl3(value);
			return;
		}
		if ($itm_nm_lcl4.equalsIgnoreCase(name)) {
			itm_nm_lcl4(value);
			return;
		}
		if ($itm_nm_lcl5.equalsIgnoreCase(name)) {
			itm_nm_lcl5(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($release_tm.equalsIgnoreCase(name)) {
			release_tm(value);
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
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			minus_stk_flg(value);
			return;
		}
		if ($not_new_lot_flg.equalsIgnoreCase(name)) {
			not_new_lot_flg(value);
			return;
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			gi_alloc_flg(value);
			return;
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			pack_alloc_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			rqmt_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			rqmt_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			rqmt_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			rqmt_sno4_flg(value);
			return;
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			inpt_itm_add_flg(value);
			return;
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			inpt_itm_del_flg(value);
			return;
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			sch_flg(value);
			return;
		}
		if ($comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			comp_rev_at_slo_flg(value);
			return;
		}
		if ($comp_core_itm_flg.equalsIgnoreCase(name)) {
			comp_core_itm_flg(value);
			return;
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			slo_proc_flg(value);
			return;
		}
		if ($ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			ship_lot_back_stop_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			purc_dlv_slip_flg(value);
			return;
		}
		if ($stk_lst_flg.equalsIgnoreCase(name)) {
			stk_lst_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			sls_input_flg(value);
			return;
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			mfg_input_flg(value);
			return;
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			purc_input_flg(value);
			return;
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			insp_input_flg(value);
			return;
		}
		if ($release_flg.equalsIgnoreCase(name)) {
			release_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBinary(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			ship_unit_cd(value);
			return;
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			mfg_unit_cd(value);
			return;
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			purc_unit_cd(value);
			return;
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			lmt_ctl_categ(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			sno1_ptn_cd(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			sno2_ptn_cd(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			sno3_ptn_cd(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			sno4_ptn_cd(value);
			return;
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			def_bom_ptn(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			mrp_proc_typ(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			itm_spec_grp_cd(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($slo_proc_typ.equalsIgnoreCase(name)) {
			slo_proc_typ(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			exim_xpns_typ(value);
			return;
		}
		if ($ref_itm_cd.equalsIgnoreCase(name)) {
			ref_itm_cd(value);
			return;
		}
		if ($ref_itm_sub1.equalsIgnoreCase(name)) {
			ref_itm_sub1(value);
			return;
		}
		if ($ref_itm_sub2.equalsIgnoreCase(name)) {
			ref_itm_sub2(value);
			return;
		}
		if ($ref_itm_sub3.equalsIgnoreCase(name)) {
			ref_itm_sub3(value);
			return;
		}
		if ($ext_sys_no_itm.equalsIgnoreCase(name)) {
			ext_sys_no_itm(value);
			return;
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			itm_alc_grp(value);
			return;
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			release_usr_cd(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			conts_unit_cd(value);
			return;
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			jan_typ(value);
			return;
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			jan_cd(value);
			return;
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			itf_cd(value);
			return;
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			gtin_cd(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($itm_nm_lcl1.equalsIgnoreCase(name)) {
			itm_nm_lcl1(value);
			return;
		}
		if ($itm_nm_lcl2.equalsIgnoreCase(name)) {
			itm_nm_lcl2(value);
			return;
		}
		if ($itm_nm_lcl3.equalsIgnoreCase(name)) {
			itm_nm_lcl3(value);
			return;
		}
		if ($itm_nm_lcl4.equalsIgnoreCase(name)) {
			itm_nm_lcl4(value);
			return;
		}
		if ($itm_nm_lcl5.equalsIgnoreCase(name)) {
			itm_nm_lcl5(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($release_tm.equalsIgnoreCase(name)) {
			release_tm(value);
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
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			minus_stk_flg(value);
			return;
		}
		if ($not_new_lot_flg.equalsIgnoreCase(name)) {
			not_new_lot_flg(value);
			return;
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			gi_alloc_flg(value);
			return;
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			pack_alloc_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			rqmt_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			rqmt_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			rqmt_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			rqmt_sno4_flg(value);
			return;
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			inpt_itm_add_flg(value);
			return;
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			inpt_itm_del_flg(value);
			return;
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			sch_flg(value);
			return;
		}
		if ($comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			comp_rev_at_slo_flg(value);
			return;
		}
		if ($comp_core_itm_flg.equalsIgnoreCase(name)) {
			comp_core_itm_flg(value);
			return;
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			slo_proc_flg(value);
			return;
		}
		if ($ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			ship_lot_back_stop_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			purc_dlv_slip_flg(value);
			return;
		}
		if ($stk_lst_flg.equalsIgnoreCase(name)) {
			stk_lst_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			sls_input_flg(value);
			return;
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			mfg_input_flg(value);
			return;
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			purc_input_flg(value);
			return;
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			insp_input_flg(value);
			return;
		}
		if ($release_flg.equalsIgnoreCase(name)) {
			release_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public void setBinaryNE(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinaryNE(name, value);
	}

}
