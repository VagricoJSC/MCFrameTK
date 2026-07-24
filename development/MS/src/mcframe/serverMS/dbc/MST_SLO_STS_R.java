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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "受注状況 // Sales order status"DBコンテナRowクラスです。<p>
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
 *  	<td>slo_sts_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注状況ＮＯ</td>
 *  	<td>Sales order status No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注明細ＮＯ</td>
 *  	<td>Sales order details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_sts_typ</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注状況区分</td>
 *  	<td>Sales order status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位ＣＤ</td>
 *  	<td>Unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数量</td>
 *  	<td>Quantity</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単価</td>
 *  	<td>Unit price</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額</td>
 *  	<td>Amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税ＣＤ</td>
 *  	<td>Tax cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税額</td>
 *  	<td>Tax amount</td>
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
 *  	<td>ship_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷物流グループＣＤ</td>
 *  	<td>Shipping distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループＣＤ</td>
 *  	<td>Gross allocation location group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_prms_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注納期回答改訂番号</td>
 *  	<td>Sales order promising Rev. No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス明細ＮＯ</td>
 *  	<td>Invoice details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイスＮＯ</td>
 *  	<td>Purchase invoice No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcpt_iv_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイス明細ＮＯ</td>
 *  	<td>Purchase invoice details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書ＮＯ</td>
 *  	<td>Delivery note No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書明細ＮＯ</td>
 *  	<td>Delivery note details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書ＮＯ</td>
 *  	<td>Invoice No.</td>
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
 *  	<td>biz_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務実施日時</td>
 *  	<td>Business processed date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>着手予定日時</td>
 *  	<td>Scheduled start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>完了予定日時</td>
 *  	<td>Scheduled completion date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>st_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>着手実績日時</td>
 *  	<td>Actual start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>完了実績日時</td>
 *  	<td>Actual completion date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷指図ＮＯ</td>
 *  	<td>Shipping order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_inst_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷指図明細ＮＯ</td>
 *  	<td>Shipping order details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷実績NO</td>
 *  	<td>Receipt result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上実績ＮＯ</td>
 *  	<td>Sales result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上実績明細ＮＯ</td>
 *  	<td>Sales result details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注ＮＯ</td>
 *  	<td>PO No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注明細ＮＯ</td>
 *  	<td>PO details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入実績ＮＯ</td>
 *  	<td>Purchase result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入実績明細ＮＯ</td>
 *  	<td>Purchase result details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_rqst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＷＧ間依頼ＮＯ</td>
 *  	<td>No. of inventory request from other WG</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示ＮＯ</td>
 *  	<td>Delivery order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示明細ＮＯ</td>
 *  	<td>Delivery order details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_rcpt_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示受領ＮＯ</td>
 *  	<td>Delivery order received No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目オーダNO</td>
 *  	<td>Item order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造実績ＮＯ</td>
 *  	<td>Mfg. result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査ＮＯ</td>
 *  	<td>Inspection No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査実績ＮＯ</td>
 *  	<td>Inspection result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>移動指図ＮＯ</td>
 *  	<td>Movement order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_inst_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>移動指図明細ＮＯ</td>
 *  	<td>Movement order details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>移動実績ＮＯ</td>
 *  	<td>Movement result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>移動実績明細ＮＯ</td>
 *  	<td>Movement result details No.</td>
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
public class MST_SLO_STS_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_SLO_STS";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 受注状況ＮＯ. Sales order status No..<p>
	 *
	 */
	public static final String $slo_sts_no = "slo_sts_no";
	private static final MCPermColumnInfo _slo_sts_no = createColumnInfo("slo_sts_no");
	public final MCStringPermColumn slo_sts_no = createStringColumn(_slo_sts_no);
	
	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	private static final MCPermColumnInfo _slo_d_no = createColumnInfo("slo_d_no");
	public final MCStringPermColumn slo_d_no = createStringColumn(_slo_d_no);
	
	/**
	 * 受注状況区分. Sales order status type.<p>
	 *
	 */
	public static final String $slo_sts_typ = "slo_sts_typ";
	private static final MCPermColumnInfo _slo_sts_typ = createColumnInfo("slo_sts_typ");
	public final MCStringPermColumn slo_sts_typ = createStringColumn(_slo_sts_typ);
	
	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	private static final MCPermColumnInfo _unit_cd = createColumnInfo("unit_cd");
	public final MCStringPermColumn unit_cd = createStringColumn(_unit_cd);
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public static final String $qty = "qty";
	private static final MCPermColumnInfo _qty = createColumnInfo("qty");
	public final MCNumberPermColumn qty = createNumberColumn(_qty);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public static final String $upri = "upri";
	private static final MCPermColumnInfo _upri = createColumnInfo("upri");
	public final MCNumberPermColumn upri = createNumberColumn(_upri);
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public static final String $amt = "amt";
	private static final MCPermColumnInfo _amt = createColumnInfo("amt");
	public final MCNumberPermColumn amt = createNumberColumn(_amt);
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	private static final MCPermColumnInfo _tax_cd = createColumnInfo("tax_cd");
	public final MCStringPermColumn tax_cd = createStringColumn(_tax_cd);
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	private static final MCPermColumnInfo _tax_amt = createColumnInfo("tax_amt");
	public final MCNumberPermColumn tax_amt = createNumberColumn(_tax_amt);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 出荷物流グループＣＤ. Shipping distribution group cd..<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	private static final MCPermColumnInfo _ship_lg_grp_cd = createColumnInfo("ship_lg_grp_cd");
	public final MCStringPermColumn ship_lg_grp_cd = createStringColumn(_ship_lg_grp_cd);
	
	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	private static final MCPermColumnInfo _alloc_grp_cd = createColumnInfo("alloc_grp_cd");
	public final MCStringPermColumn alloc_grp_cd = createStringColumn(_alloc_grp_cd);
	
	/**
	 * 受注納期回答改訂番号. Sales order promising Rev. No..<p>
	 *
	 */
	public static final String $slo_prms_rev = "slo_prms_rev";
	private static final MCPermColumnInfo _slo_prms_rev = createColumnInfo("slo_prms_rev");
	public final MCNumberPermColumn slo_prms_rev = createNumberColumn(_slo_prms_rev);
	
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
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	private static final MCPermColumnInfo _rcpt_iv_no = createColumnInfo("rcpt_iv_no");
	public final MCStringPermColumn rcpt_iv_no = createStringColumn(_rcpt_iv_no);
	
	/**
	 * 受領インボイス明細ＮＯ. Purchase invoice details No..<p>
	 *
	 */
	public static final String $rcpt_iv_d_no = "rcpt_iv_d_no";
	private static final MCPermColumnInfo _rcpt_iv_d_no = createColumnInfo("rcpt_iv_d_no");
	public final MCStringPermColumn rcpt_iv_d_no = createStringColumn(_rcpt_iv_d_no);
	
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
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	private static final MCPermColumnInfo _bill_no = createColumnInfo("bill_no");
	public final MCStringPermColumn bill_no = createStringColumn(_bill_no);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 業務実施日時. Business processed date and time.<p>
	 *
	 */
	public static final String $biz_tm = "biz_tm";
	private static final MCPermColumnInfo _biz_tm = createColumnInfo("biz_tm");
	public final MCDatePermColumn biz_tm = createDateColumn(_biz_tm);
	
	/**
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public static final String $st_schd_tm = "st_schd_tm";
	private static final MCPermColumnInfo _st_schd_tm = createColumnInfo("st_schd_tm");
	public final MCDatePermColumn st_schd_tm = createDateColumn(_st_schd_tm);
	
	/**
	 * 完了予定日時. Scheduled completion date and time.<p>
	 *
	 */
	public static final String $end_schd_tm = "end_schd_tm";
	private static final MCPermColumnInfo _end_schd_tm = createColumnInfo("end_schd_tm");
	public final MCDatePermColumn end_schd_tm = createDateColumn(_end_schd_tm);
	
	/**
	 * 着手実績日時. Actual start date and time.<p>
	 *
	 */
	public static final String $st_act_tm = "st_act_tm";
	private static final MCPermColumnInfo _st_act_tm = createColumnInfo("st_act_tm");
	public final MCDatePermColumn st_act_tm = createDateColumn(_st_act_tm);
	
	/**
	 * 完了実績日時. Actual completion date and time.<p>
	 *
	 */
	public static final String $end_act_tm = "end_act_tm";
	private static final MCPermColumnInfo _end_act_tm = createColumnInfo("end_act_tm");
	public final MCDatePermColumn end_act_tm = createDateColumn(_end_act_tm);
	
	/**
	 * 出荷指図ＮＯ. Shipping order No..<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	private static final MCPermColumnInfo _ship_inst_no = createColumnInfo("ship_inst_no");
	public final MCStringPermColumn ship_inst_no = createStringColumn(_ship_inst_no);
	
	/**
	 * 出荷指図明細ＮＯ. Shipping order details No..<p>
	 *
	 */
	public static final String $ship_inst_d_no = "ship_inst_d_no";
	private static final MCPermColumnInfo _ship_inst_d_no = createColumnInfo("ship_inst_d_no");
	public final MCStringPermColumn ship_inst_d_no = createStringColumn(_ship_inst_d_no);
	
	/**
	 * 入荷実績NO. Receipt result No..<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	private static final MCPermColumnInfo _arr_act_no = createColumnInfo("arr_act_no");
	public final MCStringPermColumn arr_act_no = createStringColumn(_arr_act_no);
	
	/**
	 * 売上実績ＮＯ. Sales result No..<p>
	 *
	 */
	public static final String $sls_act_no = "sls_act_no";
	private static final MCPermColumnInfo _sls_act_no = createColumnInfo("sls_act_no");
	public final MCStringPermColumn sls_act_no = createStringColumn(_sls_act_no);
	
	/**
	 * 売上実績明細ＮＯ. Sales result details No..<p>
	 *
	 */
	public static final String $sls_act_d_no = "sls_act_d_no";
	private static final MCPermColumnInfo _sls_act_d_no = createColumnInfo("sls_act_d_no");
	public final MCStringPermColumn sls_act_d_no = createStringColumn(_sls_act_d_no);
	
	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public static final String $po_no = "po_no";
	private static final MCPermColumnInfo _po_no = createColumnInfo("po_no");
	public final MCStringPermColumn po_no = createStringColumn(_po_no);
	
	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	private static final MCPermColumnInfo _po_d_no = createColumnInfo("po_d_no");
	public final MCStringPermColumn po_d_no = createStringColumn(_po_d_no);
	
	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	private static final MCPermColumnInfo _purc_act_no = createColumnInfo("purc_act_no");
	public final MCStringPermColumn purc_act_no = createStringColumn(_purc_act_no);
	
	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	private static final MCPermColumnInfo _purc_act_d_no = createColumnInfo("purc_act_d_no");
	public final MCStringPermColumn purc_act_d_no = createStringColumn(_purc_act_d_no);
	
	/**
	 * ＷＧ間依頼ＮＯ. No. of inventory request from other WG.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
	private static final MCPermColumnInfo _wg_rqst_no = createColumnInfo("wg_rqst_no");
	public final MCStringPermColumn wg_rqst_no = createStringColumn(_wg_rqst_no);
	
	/**
	 * 納入指示ＮＯ. Delivery order No..<p>
	 *
	 */
	public static final String $dlv_inst_no = "dlv_inst_no";
	private static final MCPermColumnInfo _dlv_inst_no = createColumnInfo("dlv_inst_no");
	public final MCStringPermColumn dlv_inst_no = createStringColumn(_dlv_inst_no);
	
	/**
	 * 納入指示明細ＮＯ. Delivery order details No..<p>
	 *
	 */
	public static final String $dlv_inst_d_no = "dlv_inst_d_no";
	private static final MCPermColumnInfo _dlv_inst_d_no = createColumnInfo("dlv_inst_d_no");
	public final MCStringPermColumn dlv_inst_d_no = createStringColumn(_dlv_inst_d_no);
	
	/**
	 * 納入指示受領ＮＯ. Delivery order received No..<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_no = "dlv_inst_rcpt_no";
	private static final MCPermColumnInfo _dlv_inst_rcpt_no = createColumnInfo("dlv_inst_rcpt_no");
	public final MCStringPermColumn dlv_inst_rcpt_no = createStringColumn(_dlv_inst_rcpt_no);
	
	/**
	 * 品目オーダNO. Item order No..<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	private static final MCPermColumnInfo _itm_ord_no = createColumnInfo("itm_ord_no");
	public final MCStringPermColumn itm_ord_no = createStringColumn(_itm_ord_no);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	private static final MCPermColumnInfo _mfg_act_no = createColumnInfo("mfg_act_no");
	public final MCStringPermColumn mfg_act_no = createStringColumn(_mfg_act_no);
	
	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	private static final MCPermColumnInfo _insp_no = createColumnInfo("insp_no");
	public final MCStringPermColumn insp_no = createStringColumn(_insp_no);
	
	/**
	 * 検査実績ＮＯ. Inspection result No..<p>
	 *
	 */
	public static final String $insp_act_no = "insp_act_no";
	private static final MCPermColumnInfo _insp_act_no = createColumnInfo("insp_act_no");
	public final MCStringPermColumn insp_act_no = createStringColumn(_insp_act_no);
	
	/**
	 * 移動指図ＮＯ. Movement order No..<p>
	 *
	 */
	public static final String $xfr_inst_no = "xfr_inst_no";
	private static final MCPermColumnInfo _xfr_inst_no = createColumnInfo("xfr_inst_no");
	public final MCStringPermColumn xfr_inst_no = createStringColumn(_xfr_inst_no);
	
	/**
	 * 移動指図明細ＮＯ. Movement order details No..<p>
	 *
	 */
	public static final String $xfr_inst_d_no = "xfr_inst_d_no";
	private static final MCPermColumnInfo _xfr_inst_d_no = createColumnInfo("xfr_inst_d_no");
	public final MCStringPermColumn xfr_inst_d_no = createStringColumn(_xfr_inst_d_no);
	
	/**
	 * 移動実績ＮＯ. Movement result No..<p>
	 *
	 */
	public static final String $xfr_act_no = "xfr_act_no";
	private static final MCPermColumnInfo _xfr_act_no = createColumnInfo("xfr_act_no");
	public final MCStringPermColumn xfr_act_no = createStringColumn(_xfr_act_no);
	
	/**
	 * 移動実績明細ＮＯ. Movement result details No..<p>
	 *
	 */
	public static final String $xfr_act_d_no = "xfr_act_d_no";
	private static final MCPermColumnInfo _xfr_act_d_no = createColumnInfo("xfr_act_d_no");
	public final MCStringPermColumn xfr_act_d_no = createStringColumn(_xfr_act_d_no);
	
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
	
	public static final MCMeta slo_sts_no_META = createCommonMeta($slo_sts_no, mcframe.commonMA.meta.MA_META.SLO_STS_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_sts_typ_META = createCommonMeta($slo_sts_typ, mcframe.commonMS.meta.MS_META.SLO_STS_TYP);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta upri_META = createCommonMeta($upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta slo_prms_rev_META = createCommonMeta($slo_prms_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_d_no_META = createCommonMeta($rcpt_iv_d_no, mcframe.commonMA.meta.MA_META.RCPT_IV_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta biz_tm_META = createCommonMeta($biz_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta st_act_tm_META = createCommonMeta($st_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_act_tm_META = createCommonMeta($end_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta dlv_inst_no_META = createCommonMeta($dlv_inst_no, mcframe.commonMA.meta.MA_META.DLV_INST_NO);
	public static final MCMeta dlv_inst_d_no_META = createCommonMeta($dlv_inst_d_no, mcframe.commonMA.meta.MA_META.DLV_INST_D_NO);
	public static final MCMeta dlv_inst_rcpt_no_META = createCommonMeta($dlv_inst_rcpt_no, mcframe.commonMA.meta.MA_META.DLV_INST_RCPT_NO);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_act_no_META = createCommonMeta($insp_act_no, mcframe.commonMA.meta.MA_META.INSP_ACT_NO);
	public static final MCMeta xfr_inst_no_META = createCommonMeta($xfr_inst_no, mcframe.commonMA.meta.MA_META.XFR_INST_NO);
	public static final MCMeta xfr_inst_d_no_META = createCommonMeta($xfr_inst_d_no, mcframe.commonMA.meta.MA_META.XFR_INST_D_NO);
	public static final MCMeta xfr_act_no_META = createCommonMeta($xfr_act_no, mcframe.commonMA.meta.MA_META.XFR_ACT_NO);
	public static final MCMeta xfr_act_d_no_META = createCommonMeta($xfr_act_d_no, mcframe.commonMA.meta.MA_META.XFR_ACT_D_NO);
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
	
	protected static final ConstMetaList<MST_SLO_STS_R> constMetas = new ConstMetaList<MST_SLO_STS_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			slo_sts_no_META,
			slo_d_no_META,
			slo_sts_typ_META,
			unit_cd_META,
			qty_META,
			cur_cd_META,
			upri_META,
			amt_META,
			tax_cd_META,
			tax_amt_META,
			loc_cd_META,
			ship_lg_grp_cd_META,
			alloc_grp_cd_META,
			slo_prms_rev_META,
			iv_no_META,
			iv_d_no_META,
			rcpt_iv_no_META,
			rcpt_iv_d_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			bill_no_META,
			ac_dt_META,
			biz_tm_META,
			st_schd_tm_META,
			end_schd_tm_META,
			st_act_tm_META,
			end_act_tm_META,
			ship_inst_no_META,
			ship_inst_d_no_META,
			arr_act_no_META,
			sls_act_no_META,
			sls_act_d_no_META,
			po_no_META,
			po_d_no_META,
			purc_act_no_META,
			purc_act_d_no_META,
			wg_rqst_no_META,
			dlv_inst_no_META,
			dlv_inst_d_no_META,
			dlv_inst_rcpt_no_META,
			itm_ord_no_META,
			mfg_inst_no_META,
			mfg_act_no_META,
			insp_no_META,
			insp_act_no_META,
			xfr_inst_no_META,
			xfr_inst_d_no_META,
			xfr_act_no_META,
			xfr_act_d_no_META,
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
	protected MST_SLO_STS_R(ConstMetaList<? extends MST_SLO_STS_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_SLO_STS_R(ConstMetaList<? extends MST_SLO_STS_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_SLO_STS_R.$slo_sts_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$slo_sts_no,
				"slo_sts_no",
				slo_sts_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$slo_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$slo_d_no,
				"slo_d_no",
				slo_d_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$slo_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$slo_sts_typ,
				"slo_sts_typ",
				slo_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$unit_cd,
				"unit_cd",
				unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_STS_R.$qty,
				"qty",
				qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$cur_cd,
				"cur_cd",
				cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_STS_R.$upri,
				"upri",
				upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_STS_R.$amt,
				"amt",
				amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$tax_cd,
				"tax_cd",
				tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_STS_R.$tax_amt,
				"tax_amt",
				tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$loc_cd,
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
			MST_SLO_STS_R.$ship_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$ship_lg_grp_cd,
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
			MST_SLO_STS_R.$alloc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$alloc_grp_cd,
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
			MST_SLO_STS_R.$slo_prms_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_STS_R.$slo_prms_rev,
				"slo_prms_rev",
				slo_prms_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$iv_no,
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
			MST_SLO_STS_R.$iv_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$iv_d_no,
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
			MST_SLO_STS_R.$rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$rcpt_iv_no,
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
			MST_SLO_STS_R.$rcpt_iv_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$rcpt_iv_d_no,
				"rcpt_iv_d_no",
				rcpt_iv_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$dlv_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$dlv_slip_no,
				"dlv_slip_no",
				dlv_slip_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$dlv_slip_d_no,
				"dlv_slip_d_no",
				dlv_slip_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$bill_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$bill_no,
				"bill_no",
				bill_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_STS_R.$ac_dt,
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
			MST_SLO_STS_R.$biz_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_STS_R.$biz_tm,
				"biz_tm",
				biz_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_STS_R.$st_schd_tm,
				"st_schd_tm",
				st_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_STS_R.$end_schd_tm,
				"end_schd_tm",
				end_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$st_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_STS_R.$st_act_tm,
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
			MST_SLO_STS_R.$end_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_STS_R.$end_act_tm,
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
			MST_SLO_STS_R.$ship_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$ship_inst_no,
				"ship_inst_no",
				ship_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$ship_inst_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$ship_inst_d_no,
				"ship_inst_d_no",
				ship_inst_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$arr_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$arr_act_no,
				"arr_act_no",
				arr_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$sls_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$sls_act_no,
				"sls_act_no",
				sls_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$sls_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$sls_act_d_no,
				"sls_act_d_no",
				sls_act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$po_no,
				"po_no",
				po_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$po_d_no,
				"po_d_no",
				po_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$purc_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$purc_act_no,
				"purc_act_no",
				purc_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$purc_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$purc_act_d_no,
				"purc_act_d_no",
				purc_act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$wg_rqst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$wg_rqst_no,
				"wg_rqst_no",
				wg_rqst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$dlv_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$dlv_inst_no,
				"dlv_inst_no",
				dlv_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$dlv_inst_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$dlv_inst_d_no,
				"dlv_inst_d_no",
				dlv_inst_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$dlv_inst_rcpt_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$dlv_inst_rcpt_no,
				"dlv_inst_rcpt_no",
				dlv_inst_rcpt_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$itm_ord_no,
				"itm_ord_no",
				itm_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$mfg_act_no,
				"mfg_act_no",
				mfg_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$insp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$insp_no,
				"insp_no",
				insp_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$insp_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$insp_act_no,
				"insp_act_no",
				insp_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$xfr_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$xfr_inst_no,
				"xfr_inst_no",
				xfr_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$xfr_inst_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$xfr_inst_d_no,
				"xfr_inst_d_no",
				xfr_inst_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$xfr_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$xfr_act_no,
				"xfr_act_no",
				xfr_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$xfr_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$xfr_act_d_no,
				"xfr_act_d_no",
				xfr_act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_STS_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$ins_usr_id,
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
			MST_SLO_STS_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$ins_usr_nm,
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
			MST_SLO_STS_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SLO_STS_R.$ins_ts,
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
			MST_SLO_STS_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$ins_func_id,
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
			MST_SLO_STS_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_STS_R.$upd_cntr,
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
			MST_SLO_STS_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$upd_usr_id,
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
			MST_SLO_STS_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$upd_usr_nm,
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
			MST_SLO_STS_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SLO_STS_R.$upd_ts,
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
			MST_SLO_STS_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$upd_func_id,
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
			MST_SLO_STS_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_STS_R.$upd_srv_req_no,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_SLO_STS_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_SLO_STS_R create(String alias) {
		MST_SLO_STS_R row = new MST_SLO_STS_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_SLO_STS_R createByName(T proto) {
		MST_SLO_STS_R row = MST_SLO_STS_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_STS_R clone() {
		return (MST_SLO_STS_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_STS_R createInstance() {
		return (MST_SLO_STS_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_STS_R getValues(String... names) {
		return (MST_SLO_STS_R) super.getValues(names);
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
	 public MSW_SLO_STS_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_SLO_STS_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_SLO_STS_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_SLO_STS_KEY_R.TABLE_NAME);
	 }

	/**
	 * 受注状況ＮＯ. Sales order status No..<p>
	 *
	 */
	public String slo_sts_no() {
		return getConstString(offset + 0, $slo_sts_no);
	}

	/**
	 * 受注状況ＮＯ. Sales order status No..<p>
	 *
	 */
	public void slo_sts_no(String value) {
		setConstString(offset + 0, $slo_sts_no, value);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 1, $slo_d_no);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 1, $slo_d_no, value);
	}

	/**
	 * 受注状況区分. Sales order status type.<p>
	 *
	 */
	public String slo_sts_typ() {
		return getConstString(offset + 2, $slo_sts_typ);
	}

	/**
	 * 受注状況区分. Sales order status type.<p>
	 *
	 */
	public void slo_sts_typ(String value) {
		setConstString(offset + 2, $slo_sts_typ, value);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 3, $unit_cd);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 3, $unit_cd, value);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 4, $qty);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 4, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 4, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 4, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 4, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 4, $qty, value);
	}
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 5, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 5, $cur_cd, value);
	}

	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public MCNumber upri() {
		return getConstNumber(offset + 6, $upri);
	}

	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public void upri(MCNumber value) {
		setConstNumber(offset + 6, $upri, value);
	}
	
	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public void upri(int value) {
		setConstNumber(offset + 6, $upri, value);
	}
	
	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public void upri(long value) {
		setConstNumber(offset + 6, $upri, value);
	}
	
	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public void upri(float value) {
		setConstNumber(offset + 6, $upri, value);
	}
	
	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public void upri(double value) {
		setConstNumber(offset + 6, $upri, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 7, $amt);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 7, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 7, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 7, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 7, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 7, $amt, value);
	}
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 8, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 8, $tax_cd, value);
	}

	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 9, $tax_amt);
	}

	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 9, $tax_amt, value);
	}
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 9, $tax_amt, value);
	}
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 9, $tax_amt, value);
	}
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 9, $tax_amt, value);
	}
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 9, $tax_amt, value);
	}
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 10, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 10, $loc_cd, value);
	}

	/**
	 * 出荷物流グループＣＤ. Shipping distribution group cd..<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 11, $ship_lg_grp_cd);
	}

	/**
	 * 出荷物流グループＣＤ. Shipping distribution group cd..<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 11, $ship_lg_grp_cd, value);
	}

	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 12, $alloc_grp_cd);
	}

	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 12, $alloc_grp_cd, value);
	}

	/**
	 * 受注納期回答改訂番号. Sales order promising Rev. No..<p>
	 *
	 */
	public MCNumber slo_prms_rev() {
		return getConstNumber(offset + 13, $slo_prms_rev);
	}

	/**
	 * 受注納期回答改訂番号. Sales order promising Rev. No..<p>
	 *
	 */
	public void slo_prms_rev(MCNumber value) {
		setConstNumber(offset + 13, $slo_prms_rev, value);
	}
	
	/**
	 * 受注納期回答改訂番号. Sales order promising Rev. No..<p>
	 *
	 */
	public void slo_prms_rev(int value) {
		setConstNumber(offset + 13, $slo_prms_rev, value);
	}
	
	/**
	 * 受注納期回答改訂番号. Sales order promising Rev. No..<p>
	 *
	 */
	public void slo_prms_rev(long value) {
		setConstNumber(offset + 13, $slo_prms_rev, value);
	}
	
	/**
	 * 受注納期回答改訂番号. Sales order promising Rev. No..<p>
	 *
	 */
	public void slo_prms_rev(float value) {
		setConstNumber(offset + 13, $slo_prms_rev, value);
	}
	
	/**
	 * 受注納期回答改訂番号. Sales order promising Rev. No..<p>
	 *
	 */
	public void slo_prms_rev(double value) {
		setConstNumber(offset + 13, $slo_prms_rev, value);
	}
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 14, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 14, $iv_no, value);
	}

	/**
	 * インボイス明細ＮＯ. Invoice details No..<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 15, $iv_d_no);
	}

	/**
	 * インボイス明細ＮＯ. Invoice details No..<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 15, $iv_d_no, value);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 16, $rcpt_iv_no);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 16, $rcpt_iv_no, value);
	}

	/**
	 * 受領インボイス明細ＮＯ. Purchase invoice details No..<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 17, $rcpt_iv_d_no);
	}

	/**
	 * 受領インボイス明細ＮＯ. Purchase invoice details No..<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 17, $rcpt_iv_d_no, value);
	}

	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 18, $dlv_slip_no);
	}

	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 18, $dlv_slip_no, value);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 19, $dlv_slip_d_no);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 19, $dlv_slip_d_no, value);
	}

	/**
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 20, $bill_no);
	}

	/**
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 20, $bill_no, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 21, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 21, $ac_dt, value);
	}

	/**
	 * 業務実施日時. Business processed date and time.<p>
	 *
	 */
	public MCDate biz_tm() {
		return getConstDate(offset + 22, $biz_tm);
	}

	/**
	 * 業務実施日時. Business processed date and time.<p>
	 *
	 */
	public void biz_tm(MCDate value) {
		setConstDate(offset + 22, $biz_tm, value);
	}

	/**
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 23, $st_schd_tm);
	}

	/**
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 23, $st_schd_tm, value);
	}

	/**
	 * 完了予定日時. Scheduled completion date and time.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 24, $end_schd_tm);
	}

	/**
	 * 完了予定日時. Scheduled completion date and time.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 24, $end_schd_tm, value);
	}

	/**
	 * 着手実績日時. Actual start date and time.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return getConstDate(offset + 25, $st_act_tm);
	}

	/**
	 * 着手実績日時. Actual start date and time.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		setConstDate(offset + 25, $st_act_tm, value);
	}

	/**
	 * 完了実績日時. Actual completion date and time.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return getConstDate(offset + 26, $end_act_tm);
	}

	/**
	 * 完了実績日時. Actual completion date and time.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		setConstDate(offset + 26, $end_act_tm, value);
	}

	/**
	 * 出荷指図ＮＯ. Shipping order No..<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 27, $ship_inst_no);
	}

	/**
	 * 出荷指図ＮＯ. Shipping order No..<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 27, $ship_inst_no, value);
	}

	/**
	 * 出荷指図明細ＮＯ. Shipping order details No..<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 28, $ship_inst_d_no);
	}

	/**
	 * 出荷指図明細ＮＯ. Shipping order details No..<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 28, $ship_inst_d_no, value);
	}

	/**
	 * 入荷実績NO. Receipt result No..<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 29, $arr_act_no);
	}

	/**
	 * 入荷実績NO. Receipt result No..<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 29, $arr_act_no, value);
	}

	/**
	 * 売上実績ＮＯ. Sales result No..<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 30, $sls_act_no);
	}

	/**
	 * 売上実績ＮＯ. Sales result No..<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 30, $sls_act_no, value);
	}

	/**
	 * 売上実績明細ＮＯ. Sales result details No..<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 31, $sls_act_d_no);
	}

	/**
	 * 売上実績明細ＮＯ. Sales result details No..<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 31, $sls_act_d_no, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 32, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 32, $po_no, value);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 33, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 33, $po_d_no, value);
	}

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 34, $purc_act_no);
	}

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 34, $purc_act_no, value);
	}

	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 35, $purc_act_d_no);
	}

	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 35, $purc_act_d_no, value);
	}

	/**
	 * ＷＧ間依頼ＮＯ. No. of inventory request from other WG.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 36, $wg_rqst_no);
	}

	/**
	 * ＷＧ間依頼ＮＯ. No. of inventory request from other WG.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 36, $wg_rqst_no, value);
	}

	/**
	 * 納入指示ＮＯ. Delivery order No..<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 37, $dlv_inst_no);
	}

	/**
	 * 納入指示ＮＯ. Delivery order No..<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 37, $dlv_inst_no, value);
	}

	/**
	 * 納入指示明細ＮＯ. Delivery order details No..<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return getConstString(offset + 38, $dlv_inst_d_no);
	}

	/**
	 * 納入指示明細ＮＯ. Delivery order details No..<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		setConstString(offset + 38, $dlv_inst_d_no, value);
	}

	/**
	 * 納入指示受領ＮＯ. Delivery order received No..<p>
	 *
	 */
	public String dlv_inst_rcpt_no() {
		return getConstString(offset + 39, $dlv_inst_rcpt_no);
	}

	/**
	 * 納入指示受領ＮＯ. Delivery order received No..<p>
	 *
	 */
	public void dlv_inst_rcpt_no(String value) {
		setConstString(offset + 39, $dlv_inst_rcpt_no, value);
	}

	/**
	 * 品目オーダNO. Item order No..<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 40, $itm_ord_no);
	}

	/**
	 * 品目オーダNO. Item order No..<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 40, $itm_ord_no, value);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 41, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 41, $mfg_inst_no, value);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 42, $mfg_act_no);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 42, $mfg_act_no, value);
	}

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 43, $insp_no);
	}

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 43, $insp_no, value);
	}

	/**
	 * 検査実績ＮＯ. Inspection result No..<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 44, $insp_act_no);
	}

	/**
	 * 検査実績ＮＯ. Inspection result No..<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 44, $insp_act_no, value);
	}

	/**
	 * 移動指図ＮＯ. Movement order No..<p>
	 *
	 */
	public String xfr_inst_no() {
		return getConstString(offset + 45, $xfr_inst_no);
	}

	/**
	 * 移動指図ＮＯ. Movement order No..<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		setConstString(offset + 45, $xfr_inst_no, value);
	}

	/**
	 * 移動指図明細ＮＯ. Movement order details No..<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return getConstString(offset + 46, $xfr_inst_d_no);
	}

	/**
	 * 移動指図明細ＮＯ. Movement order details No..<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		setConstString(offset + 46, $xfr_inst_d_no, value);
	}

	/**
	 * 移動実績ＮＯ. Movement result No..<p>
	 *
	 */
	public String xfr_act_no() {
		return getConstString(offset + 47, $xfr_act_no);
	}

	/**
	 * 移動実績ＮＯ. Movement result No..<p>
	 *
	 */
	public void xfr_act_no(String value) {
		setConstString(offset + 47, $xfr_act_no, value);
	}

	/**
	 * 移動実績明細ＮＯ. Movement result details No..<p>
	 *
	 */
	public String xfr_act_d_no() {
		return getConstString(offset + 48, $xfr_act_d_no);
	}

	/**
	 * 移動実績明細ＮＯ. Movement result details No..<p>
	 *
	 */
	public void xfr_act_d_no(String value) {
		setConstString(offset + 48, $xfr_act_d_no, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 49, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 49, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 50, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 50, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 51, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 51, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 52, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 52, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 53, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 53, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 53, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 53, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 53, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 53, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 54, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 54, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 55, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 55, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 56, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 56, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 57, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 57, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 58, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 58, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($slo_sts_no.equalsIgnoreCase(name)) {
			return slo_sts_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_sts_typ.equalsIgnoreCase(name)) {
			return slo_sts_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			return xfr_inst_no();
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			return xfr_inst_d_no();
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			return xfr_act_no();
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			return xfr_act_d_no();
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
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			return slo_prms_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($biz_tm.equalsIgnoreCase(name)) {
			return biz_tm();
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
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

	public String getStringNE(String name) {
		if ($slo_sts_no.equalsIgnoreCase(name)) {
			return slo_sts_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_sts_typ.equalsIgnoreCase(name)) {
			return slo_sts_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			return xfr_inst_no();
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			return xfr_inst_d_no();
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			return xfr_act_no();
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			return xfr_act_d_no();
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
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			return slo_prms_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($biz_tm.equalsIgnoreCase(name)) {
			return biz_tm();
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
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

	public void setString(String name, String value) {
		if ($slo_sts_no.equalsIgnoreCase(name)) {
			slo_sts_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_sts_typ.equalsIgnoreCase(name)) {
			slo_sts_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
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
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			xfr_inst_no(value);
			return;
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			xfr_inst_d_no(value);
			return;
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			xfr_act_no(value);
			return;
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			xfr_act_d_no(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($biz_tm.equalsIgnoreCase(name)) {
			biz_tm(value);
			return;
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
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

	public void setStringNE(String name, String value) {
		if ($slo_sts_no.equalsIgnoreCase(name)) {
			slo_sts_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_sts_typ.equalsIgnoreCase(name)) {
			slo_sts_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
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
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			xfr_inst_no(value);
			return;
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			xfr_inst_d_no(value);
			return;
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			xfr_act_no(value);
			return;
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			xfr_act_d_no(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($biz_tm.equalsIgnoreCase(name)) {
			biz_tm(value);
			return;
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
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

}
