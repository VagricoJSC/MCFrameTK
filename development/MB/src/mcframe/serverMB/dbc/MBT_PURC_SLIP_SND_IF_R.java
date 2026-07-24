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
 * "仕入伝票送信ＩＦ // Purchase slip export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>purc_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績ＮＯ</td>
 *  	<td>Purchase result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績連番</td>
 *  	<td>Purchase result sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績改訂番号</td>
 *  	<td>Purchase result rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_slip_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入伝票ＮＯ</td>
 *  	<td>Purchase slip No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slip_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票状況区分</td>
 *  	<td>Slip status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
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
 *  	<td>ac_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上年月</td>
 *  	<td>Recording month</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税計算区分</td>
 *  	<td>Tax calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイスＦＬＧ</td>
 *  	<td>Invoice flg.</td>
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
 *  	<td>purc_ret_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入返品実績ＮＯ</td>
 *  	<td>Purchase return result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_ret_act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入返品実績改訂番号</td>
 *  	<td>Purchase return result rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cred_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>与信管理先ＣＤ</td>
 *  	<td>Credit managed BP cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bsppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定管理先ＣＤ</td>
 *  	<td>Scheduled payee cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bsppl_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定管理先担当部門ＣＤ</td>
 *  	<td>Cd. of dept. in charge of scheduled payee</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務部門ＣＤ</td>
 *  	<td>AP dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨ＣＤ</td>
 *  	<td>Base currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レートＣＤ</td>
 *  	<td>Exchange rate cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷物流グループＣＤ</td>
 *  	<td>Receipt distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_sttl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務決済方法ＣＤ</td>
 *  	<td>AP settlement method cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定日</td>
 *  	<td>Scheduled payment date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績明細ＮＯ</td>
 *  	<td>Purchase result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_act_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績明細連番</td>
 *  	<td>Purchase result details sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_ret_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入返品実績明細ＮＯ</td>
 *  	<td>Purchase return result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_slip_lno</td>
 *  	<td>N</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入伝票行ＮＯ</td>
 *  	<td>Purchase slip row No.</td>
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
 *  	<td>stk_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫管理区分</td>
 *  	<td>Inventory management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_jnl_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目仕訳ＣＤ</td>
 *  	<td>Item journal cd.</td>
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
 *  	<td>tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税ＣＤ</td>
 *  	<td>Tax cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inc_tax_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>内税ＦＬＧ</td>
 *  	<td>Tax inclusive flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税区分</td>
 *  	<td>Tax type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨単価</td>
 *  	<td>Unit price (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨金額</td>
 *  	<td>Amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨税額</td>
 *  	<td>Tax amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_dscnt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨値引額</td>
 *  	<td>Discount amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨単価</td>
 *  	<td>Unit price (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨金額</td>
 *  	<td>Amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨税額</td>
 *  	<td>Tax amount (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_dscnt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨値引額</td>
 *  	<td>Discount amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dtl_dscnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>明細値引ＦＬＧ</td>
 *  	<td>Details discount flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_adj_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入調整ＦＬＧ</td>
 *  	<td>Purchase adjustment flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>re_snd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>再送信ＦＬＧ</td>
 *  	<td>Resend flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_snd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信対象外ＦＬＧ</td>
 *  	<td>Not to be exported flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>snd_to_err_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信先エラーＦＬＧ</td>
 *  	<td>Send-to error flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１</td>
 *  	<td>IF spare CHAR column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２</td>
 *  	<td>IF spare CHAR column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目３</td>
 *  	<td>IF spare CHAR column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目４</td>
 *  	<td>IF spare CHAR column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目５</td>
 *  	<td>IF spare CHAR column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目６</td>
 *  	<td>IF spare CHAR column 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目７</td>
 *  	<td>IF spare CHAR column 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目８</td>
 *  	<td>IF spare CHAR column 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目９</td>
 *  	<td>IF spare CHAR column 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１０</td>
 *  	<td>IF spare CHAR column 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１１</td>
 *  	<td>IF spare CHAR column 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１２</td>
 *  	<td>IF spare CHAR column 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１３</td>
 *  	<td>IF spare CHAR column 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１４</td>
 *  	<td>IF spare CHAR column 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１５</td>
 *  	<td>IF spare CHAR column 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１６</td>
 *  	<td>IF spare CHAR column 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１７</td>
 *  	<td>IF spare CHAR column 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１８</td>
 *  	<td>IF spare CHAR column 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１９</td>
 *  	<td>IF spare CHAR column 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２０</td>
 *  	<td>IF spare CHAR column 20</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２１</td>
 *  	<td>IF spare CHAR column 21</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２２</td>
 *  	<td>IF spare CHAR column 22</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２３</td>
 *  	<td>IF spare CHAR column 23</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２４</td>
 *  	<td>IF spare CHAR column 24</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２５</td>
 *  	<td>IF spare CHAR column 25</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２６</td>
 *  	<td>IF spare CHAR column 26</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２７</td>
 *  	<td>IF spare CHAR column 27</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２８</td>
 *  	<td>IF spare CHAR column 28</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２９</td>
 *  	<td>IF spare CHAR column 29</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目３０</td>
 *  	<td>IF spare CHAR column 30</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目１</td>
 *  	<td>IF spare NUM column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目２</td>
 *  	<td>IF spare NUM column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目３</td>
 *  	<td>IF spare NUM column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目４</td>
 *  	<td>IF spare NUM column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目５</td>
 *  	<td>IF spare NUM column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目１</td>
 *  	<td>IF spare DATE column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目２</td>
 *  	<td>IF spare DATE column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目３</td>
 *  	<td>IF spare DATE column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目４</td>
 *  	<td>IF spare DATE column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目５</td>
 *  	<td>IF spare DATE column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログＮＯ</td>
 *  	<td>Log No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>log_sub_key1</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー１</td>
 *  	<td>Log sub key 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>log_sub_key2</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー２</td>
 *  	<td>Log sub key 2</td>
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
 *  	<td>sdrv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td>SDRV.SDRV_STS_TYP</td>
 *  	<td>送受信状況区分</td>
 *  	<td>Exporting and importing status type</td>
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
 *  	<td>sppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先名</td>
 *  	<td>Supplier name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cred_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>与信管理先名</td>
 *  	<td>Credit managed BP name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bsppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定管理先名</td>
 *  	<td>Scheduled payee name</td>
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
 *  	<td>usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者名</td>
 *  	<td>PIC name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨名</td>
 *  	<td>Transaction currency name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レート名</td>
 *  	<td>Exchange rate name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨名</td>
 *  	<td>Base currency name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷物流グループ名</td>
 *  	<td>Receipt distribution group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_sttl_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務決済方法名</td>
 *  	<td>AP settlement method name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_jnl_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕訳名</td>
 *  	<td>Item journal name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位名</td>
 *  	<td>Transaction unit name</td>
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
 *  	<td>tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税名</td>
 *  	<td>Tax name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務部門名</td>
 *  	<td>AP dept. name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBT_PURC_SLIP_SND_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MBT_PURC_SLIP_SND_IF";

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
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	private static final MCPermColumnInfo _purc_act_no = createColumnInfo("purc_act_no");
	public final MCStringPermColumn purc_act_no = createStringColumn(_purc_act_no);
	
	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public static final String $purc_act_seq = "purc_act_seq";
	private static final MCPermColumnInfo _purc_act_seq = createColumnInfo("purc_act_seq");
	public final MCNumberPermColumn purc_act_seq = createNumberColumn(_purc_act_seq);
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public static final String $purc_act_rev = "purc_act_rev";
	private static final MCPermColumnInfo _purc_act_rev = createColumnInfo("purc_act_rev");
	public final MCNumberPermColumn purc_act_rev = createNumberColumn(_purc_act_rev);
	
	/**
	 * 仕入伝票ＮＯ. Purchase slip No..<p>
	 *
	 */
	public static final String $purc_slip_no = "purc_slip_no";
	private static final MCPermColumnInfo _purc_slip_no = createColumnInfo("purc_slip_no");
	public final MCStringPermColumn purc_slip_no = createStringColumn(_purc_slip_no);
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	private static final MCPermColumnInfo _slip_sts_typ = createColumnInfo("slip_sts_typ");
	public final MCStringPermColumn slip_sts_typ = createStringColumn(_slip_sts_typ);
	
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
	 * 計上年月. Recording month.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	private static final MCPermColumnInfo _ac_ym = createColumnInfo("ac_ym");
	public final MCDatePermColumn ac_ym = createDateColumn(_ac_ym);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	private static final MCPermColumnInfo _usr_cd = createColumnInfo("usr_cd");
	public final MCStringPermColumn usr_cd = createStringColumn(_usr_cd);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
	/**
	 * 税計算区分. Tax calculation type.<p>
	 *
	 */
	public static final String $tax_calc_typ = "tax_calc_typ";
	private static final MCPermColumnInfo _tax_calc_typ = createColumnInfo("tax_calc_typ");
	public final MCStringPermColumn tax_calc_typ = createStringColumn(_tax_calc_typ);
	
	/**
	 * インボイスＦＬＧ. Invoice flg..<p>
	 *
	 */
	public static final String $iv_flg = "iv_flg";
	private static final MCPermColumnInfo _iv_flg = createColumnInfo("iv_flg");
	public final MCBooleanPermColumn iv_flg = createBooleanColumn(_iv_flg);
	
	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	private static final MCPermColumnInfo _rcpt_iv_no = createColumnInfo("rcpt_iv_no");
	public final MCStringPermColumn rcpt_iv_no = createStringColumn(_rcpt_iv_no);
	
	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	private static final MCPermColumnInfo _rcpt_iv_mng_no = createColumnInfo("rcpt_iv_mng_no");
	public final MCStringPermColumn rcpt_iv_mng_no = createStringColumn(_rcpt_iv_mng_no);
	
	/**
	 * 仕入返品実績ＮＯ. Purchase return result No..<p>
	 *
	 */
	public static final String $purc_ret_act_no = "purc_ret_act_no";
	private static final MCPermColumnInfo _purc_ret_act_no = createColumnInfo("purc_ret_act_no");
	public final MCStringPermColumn purc_ret_act_no = createStringColumn(_purc_ret_act_no);
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public static final String $purc_ret_act_rev = "purc_ret_act_rev";
	private static final MCPermColumnInfo _purc_ret_act_rev = createColumnInfo("purc_ret_act_rev");
	public final MCNumberPermColumn purc_ret_act_rev = createNumberColumn(_purc_ret_act_rev);
	
	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	private static final MCPermColumnInfo _cred_cd = createColumnInfo("cred_cd");
	public final MCStringPermColumn cred_cd = createStringColumn(_cred_cd);
	
	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	private static final MCPermColumnInfo _bsppl_cd = createColumnInfo("bsppl_cd");
	public final MCStringPermColumn bsppl_cd = createStringColumn(_bsppl_cd);
	
	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	private static final MCPermColumnInfo _bsppl_dpt_cd = createColumnInfo("bsppl_dpt_cd");
	public final MCStringPermColumn bsppl_dpt_cd = createStringColumn(_bsppl_dpt_cd);
	
	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	private static final MCPermColumnInfo _ap_dpt_cd = createColumnInfo("ap_dpt_cd");
	public final MCStringPermColumn ap_dpt_cd = createStringColumn(_ap_dpt_cd);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	private static final MCPermColumnInfo _base_cur_cd = createColumnInfo("base_cur_cd");
	public final MCStringPermColumn base_cur_cd = createStringColumn(_base_cur_cd);
	
	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	private static final MCPermColumnInfo _xrate_cd = createColumnInfo("xrate_cd");
	public final MCStringPermColumn xrate_cd = createStringColumn(_xrate_cd);
	
	/**
	 * 入荷物流グループＣＤ. Receipt distribution group cd..<p>
	 *
	 */
	public static final String $arr_lg_grp_cd = "arr_lg_grp_cd";
	private static final MCPermColumnInfo _arr_lg_grp_cd = createColumnInfo("arr_lg_grp_cd");
	public final MCStringPermColumn arr_lg_grp_cd = createStringColumn(_arr_lg_grp_cd);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public static final String $ap_sttl_cd = "ap_sttl_cd";
	private static final MCPermColumnInfo _ap_sttl_cd = createColumnInfo("ap_sttl_cd");
	public final MCStringPermColumn ap_sttl_cd = createStringColumn(_ap_sttl_cd);
	
	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	private static final MCPermColumnInfo _pay_schd_dt = createColumnInfo("pay_schd_dt");
	public final MCDatePermColumn pay_schd_dt = createDateColumn(_pay_schd_dt);
	
	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	private static final MCPermColumnInfo _purc_act_d_no = createColumnInfo("purc_act_d_no");
	public final MCStringPermColumn purc_act_d_no = createStringColumn(_purc_act_d_no);
	
	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public static final String $purc_act_d_seq = "purc_act_d_seq";
	private static final MCPermColumnInfo _purc_act_d_seq = createColumnInfo("purc_act_d_seq");
	public final MCNumberPermColumn purc_act_d_seq = createNumberColumn(_purc_act_d_seq);
	
	/**
	 * 仕入返品実績明細ＮＯ. Purchase return result details No..<p>
	 *
	 */
	public static final String $purc_ret_act_d_no = "purc_ret_act_d_no";
	private static final MCPermColumnInfo _purc_ret_act_d_no = createColumnInfo("purc_ret_act_d_no");
	public final MCStringPermColumn purc_ret_act_d_no = createStringColumn(_purc_ret_act_d_no);
	
	/**
	 * 仕入伝票行ＮＯ. Purchase slip row No..<p>
	 *
	 */
	public static final String $purc_slip_lno = "purc_slip_lno";
	private static final MCPermColumnInfo _purc_slip_lno = createColumnInfo("purc_slip_lno");
	public final MCNumberPermColumn purc_slip_lno = createNumberColumn(_purc_slip_lno);
	
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
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	private static final MCPermColumnInfo _stk_mng_typ = createColumnInfo("stk_mng_typ");
	public final MCStringPermColumn stk_mng_typ = createStringColumn(_stk_mng_typ);
	
	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	private static final MCPermColumnInfo _itm_jnl_cd = createColumnInfo("itm_jnl_cd");
	public final MCStringPermColumn itm_jnl_cd = createStringColumn(_itm_jnl_cd);
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	private static final MCPermColumnInfo _trd_unit_cd = createColumnInfo("trd_unit_cd");
	public final MCStringPermColumn trd_unit_cd = createStringColumn(_trd_unit_cd);
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	private static final MCPermColumnInfo _trd_unit_qty = createColumnInfo("trd_unit_qty");
	public final MCNumberPermColumn trd_unit_qty = createNumberColumn(_trd_unit_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	private static final MCPermColumnInfo _base_unit_qty = createColumnInfo("base_unit_qty");
	public final MCNumberPermColumn base_unit_qty = createNumberColumn(_base_unit_qty);
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	private static final MCPermColumnInfo _tax_cd = createColumnInfo("tax_cd");
	public final MCStringPermColumn tax_cd = createStringColumn(_tax_cd);
	
	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	private static final MCPermColumnInfo _inc_tax_flg = createColumnInfo("inc_tax_flg");
	public final MCBooleanPermColumn inc_tax_flg = createBooleanColumn(_inc_tax_flg);
	
	/**
	 * 税区分. Tax type.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	private static final MCPermColumnInfo _tax_typ = createColumnInfo("tax_typ");
	public final MCStringPermColumn tax_typ = createStringColumn(_tax_typ);
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	private static final MCPermColumnInfo _trd_cur_upri = createColumnInfo("trd_cur_upri");
	public final MCNumberPermColumn trd_cur_upri = createNumberColumn(_trd_cur_upri);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	private static final MCPermColumnInfo _trd_cur_tax_amt = createColumnInfo("trd_cur_tax_amt");
	public final MCNumberPermColumn trd_cur_tax_amt = createNumberColumn(_trd_cur_tax_amt);
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	private static final MCPermColumnInfo _trd_cur_dscnt_amt = createColumnInfo("trd_cur_dscnt_amt");
	public final MCNumberPermColumn trd_cur_dscnt_amt = createNumberColumn(_trd_cur_dscnt_amt);
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	private static final MCPermColumnInfo _base_cur_upri = createColumnInfo("base_cur_upri");
	public final MCNumberPermColumn base_cur_upri = createNumberColumn(_base_cur_upri);
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	private static final MCPermColumnInfo _base_cur_amt = createColumnInfo("base_cur_amt");
	public final MCNumberPermColumn base_cur_amt = createNumberColumn(_base_cur_amt);
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	private static final MCPermColumnInfo _base_cur_tax_amt = createColumnInfo("base_cur_tax_amt");
	public final MCNumberPermColumn base_cur_tax_amt = createNumberColumn(_base_cur_tax_amt);
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_dscnt_amt = "base_cur_dscnt_amt";
	private static final MCPermColumnInfo _base_cur_dscnt_amt = createColumnInfo("base_cur_dscnt_amt");
	public final MCNumberPermColumn base_cur_dscnt_amt = createNumberColumn(_base_cur_dscnt_amt);
	
	/**
	 * 明細値引ＦＬＧ. Details discount flg..<p>
	 *
	 */
	public static final String $dtl_dscnt_flg = "dtl_dscnt_flg";
	private static final MCPermColumnInfo _dtl_dscnt_flg = createColumnInfo("dtl_dscnt_flg");
	public final MCBooleanPermColumn dtl_dscnt_flg = createBooleanColumn(_dtl_dscnt_flg);
	
	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public static final String $purc_adj_flg = "purc_adj_flg";
	private static final MCPermColumnInfo _purc_adj_flg = createColumnInfo("purc_adj_flg");
	public final MCBooleanPermColumn purc_adj_flg = createBooleanColumn(_purc_adj_flg);
	
	/**
	 * 再送信ＦＬＧ. Resend flg..<p>
	 *
	 */
	public static final String $re_snd_flg = "re_snd_flg";
	private static final MCPermColumnInfo _re_snd_flg = createColumnInfo("re_snd_flg");
	public final MCBooleanPermColumn re_snd_flg = createBooleanColumn(_re_snd_flg);
	
	/**
	 * 送信対象外ＦＬＧ. Not to be exported flg..<p>
	 *
	 */
	public static final String $not_snd_flg = "not_snd_flg";
	private static final MCPermColumnInfo _not_snd_flg = createColumnInfo("not_snd_flg");
	public final MCBooleanPermColumn not_snd_flg = createBooleanColumn(_not_snd_flg);
	
	/**
	 * 送信先エラーＦＬＧ. Send-to error flg..<p>
	 *
	 */
	public static final String $snd_to_err_flg = "snd_to_err_flg";
	private static final MCPermColumnInfo _snd_to_err_flg = createColumnInfo("snd_to_err_flg");
	public final MCBooleanPermColumn snd_to_err_flg = createBooleanColumn(_snd_to_err_flg);
	
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
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public static final String $sdrv_sts_typ = "sdrv_sts_typ";
	
	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	
	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	
	/**
	 * 与信管理先名. Credit managed BP name.<p>
	 *
	 */
	public static final String $cred_nm = "cred_nm";
	
	/**
	 * 支払予定管理先名. Scheduled payee name.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	
	/**
	 * 支払予定管理先担当部門名. Name of dept. in charge of scheduled payee.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
	
	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	
	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	
	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	
	/**
	 * 為替レート名. Exchange rate name.<p>
	 *
	 */
	public static final String $xrate_nm = "xrate_nm";
	
	/**
	 * 基準通貨名. Base currency name.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	
	/**
	 * 入荷物流グループ名. Receipt distribution group name.<p>
	 *
	 */
	public static final String $arr_lg_grp_nm = "arr_lg_grp_nm";
	
	/**
	 * 債務決済方法名. AP settlement method name.<p>
	 *
	 */
	public static final String $ap_sttl_nm = "ap_sttl_nm";
	
	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	
	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	
	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	
	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	
	/**
	 * 債務部門名. AP dept. name.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_seq_META = createCommonMeta($purc_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_act_rev_META = createCommonMeta($purc_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta purc_slip_no_META = createCommonMeta($purc_slip_no, mcframe.commonMA.meta.MA_META.PURC_SLIP_NO);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tax_calc_typ_META = createCommonMeta($tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta iv_flg_META = createCommonMeta($iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta purc_ret_act_no_META = createCommonMeta($purc_ret_act_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_NO);
	public static final MCMeta purc_ret_act_rev_META = createCommonMeta($purc_ret_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta arr_lg_grp_cd_META = createCommonMeta($arr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta purc_act_d_seq_META = createCommonMeta($purc_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_ret_act_d_no_META = createCommonMeta($purc_ret_act_d_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_D_NO);
	public static final MCMeta purc_slip_lno_META = createCommonMeta($purc_slip_lno, mcframe.commonMA.meta.MA_META.PURC_SLIP_LNO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dtl_dscnt_flg_META = createCommonMeta($dtl_dscnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_adj_flg_META = createCommonMeta($purc_adj_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_snd_flg_META = createCommonMeta($re_snd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_snd_flg_META = createCommonMeta($not_snd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta snd_to_err_flg_META = createCommonMeta($snd_to_err_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta sdrv_sts_typ_META = createCommonMeta($sdrv_sts_typ, mcframe.commonMA.meta.MA_META.SDRV_STS_TYP);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cred_nm_META = createCommonMeta($cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta xrate_nm_META = createCommonMeta($xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta arr_lg_grp_nm_META = createCommonMeta($arr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ap_sttl_nm_META = createCommonMeta($ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $SDRV = "SDRV";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MBVT_PFT_SDRV_IF",
				$SDRV,
				new String[][]{
						{"data_no", "data_no"}
				},
				() -> {
					return mcframe.serverMB.dbc.MBVT_PFT_SDRV_IF_R.create("SDRV");
				},
				(alias) -> {
					MBT_PURC_SLIP_SND_IF_R own = MBT_PURC_SLIP_SND_IF_R.create(alias);
					mcframe.serverMB.dbc.MBVT_PFT_SDRV_IF_R ref = mcframe.serverMB.dbc.MBVT_PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MBT_PURC_SLIP_SND_IF_R> constMetas = new ConstMetaList<MBT_PURC_SLIP_SND_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			purc_act_no_META,
			purc_act_seq_META,
			purc_act_rev_META,
			purc_slip_no_META,
			slip_sts_typ_META,
			trd_cd_META,
			trd_ptn_typ_META,
			ac_ym_META,
			ac_dt_META,
			dpt_cd_META,
			usr_cd_META,
			sppl_cd_META,
			tax_calc_typ_META,
			iv_flg_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			purc_ret_act_no_META,
			purc_ret_act_rev_META,
			cred_cd_META,
			bsppl_cd_META,
			bsppl_dpt_cd_META,
			ap_dpt_cd_META,
			trd_cur_cd_META,
			base_cur_cd_META,
			xrate_cd_META,
			arr_lg_grp_cd_META,
			xrate_META,
			ap_sttl_cd_META,
			pay_schd_dt_META,
			purc_act_d_no_META,
			purc_act_d_seq_META,
			purc_ret_act_d_no_META,
			purc_slip_lno_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			stk_mng_typ_META,
			itm_jnl_cd_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			tax_cd_META,
			inc_tax_flg_META,
			tax_typ_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			trd_cur_dscnt_amt_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			base_cur_dscnt_amt_META,
			dtl_dscnt_flg_META,
			purc_adj_flg_META,
			re_snd_flg_META,
			not_snd_flg_META,
			snd_to_err_flg_META,
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
			sdrv_sts_typ_META,
			trd_nm_META,
			sppl_nm_META,
			cred_nm_META,
			bsppl_nm_META,
			bsppl_dpt_nm_META,
			usr_nm_META,
			dpt_nm_META,
			trd_cur_nm_META,
			xrate_nm_META,
			base_cur_nm_META,
			arr_lg_grp_nm_META,
			ap_sttl_nm_META,
			itm_jnl_nm_META,
			trd_unit_nm_META,
			base_unit_nm_META,
			tax_nm_META,
			ap_dpt_nm_META
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
	protected MBT_PURC_SLIP_SND_IF_R(ConstMetaList<? extends MBT_PURC_SLIP_SND_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBT_PURC_SLIP_SND_IF_R(ConstMetaList<? extends MBT_PURC_SLIP_SND_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$data_lno,
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
			MBT_PURC_SLIP_SND_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$data_no,
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
			MBT_PURC_SLIP_SND_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$exe_sts_typ,
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
			MBT_PURC_SLIP_SND_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$data_crud_typ,
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
			MBT_PURC_SLIP_SND_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$ext_sys_cd,
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
			MBT_PURC_SLIP_SND_IF_R.$purc_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$purc_act_no,
				"purc_act_no",
				purc_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$purc_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$purc_act_seq,
				"purc_act_seq",
				purc_act_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$purc_act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$purc_act_rev,
				"purc_act_rev",
				purc_act_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$purc_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$purc_slip_no,
				"purc_slip_no",
				purc_slip_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$slip_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$slip_sts_typ,
				"slip_sts_typ",
				slip_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$trd_cd,
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
			MBT_PURC_SLIP_SND_IF_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$trd_ptn_typ,
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
			MBT_PURC_SLIP_SND_IF_R.$ac_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_PURC_SLIP_SND_IF_R.$ac_ym,
				"ac_ym",
				ac_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_PURC_SLIP_SND_IF_R.$ac_dt,
				"ac_dt",
				ac_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$dpt_cd,
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
			MBT_PURC_SLIP_SND_IF_R.$usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$usr_cd,
				"usr_cd",
				usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$tax_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$tax_calc_typ,
				"tax_calc_typ",
				tax_calc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$iv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_PURC_SLIP_SND_IF_R.$iv_flg,
				"iv_flg",
				iv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$rcpt_iv_no,
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
			MBT_PURC_SLIP_SND_IF_R.$rcpt_iv_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$rcpt_iv_mng_no,
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
			MBT_PURC_SLIP_SND_IF_R.$purc_ret_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$purc_ret_act_no,
				"purc_ret_act_no",
				purc_ret_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$purc_ret_act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$purc_ret_act_rev,
				"purc_ret_act_rev",
				purc_ret_act_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$cred_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$cred_cd,
				"cred_cd",
				cred_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$bsppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$bsppl_cd,
				"bsppl_cd",
				bsppl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$bsppl_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$bsppl_dpt_cd,
				"bsppl_dpt_cd",
				bsppl_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$ap_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$ap_dpt_cd,
				"ap_dpt_cd",
				ap_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$trd_cur_cd,
				"trd_cur_cd",
				trd_cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$base_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$base_cur_cd,
				"base_cur_cd",
				base_cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$xrate_cd,
				"xrate_cd",
				xrate_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$arr_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$arr_lg_grp_cd,
				"arr_lg_grp_cd",
				arr_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$xrate,
				"xrate",
				xrate,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$ap_sttl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$ap_sttl_cd,
				"ap_sttl_cd",
				ap_sttl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$pay_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_PURC_SLIP_SND_IF_R.$pay_schd_dt,
				"pay_schd_dt",
				pay_schd_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$purc_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$purc_act_d_no,
				"purc_act_d_no",
				purc_act_d_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$purc_act_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$purc_act_d_seq,
				"purc_act_d_seq",
				purc_act_d_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$purc_ret_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$purc_ret_act_d_no,
				"purc_ret_act_d_no",
				purc_ret_act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$purc_slip_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$purc_slip_lno,
				"purc_slip_lno",
				purc_slip_lno,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$itm_cd,
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
			MBT_PURC_SLIP_SND_IF_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$itm_nm,
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
			MBT_PURC_SLIP_SND_IF_R.$stk_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$stk_mng_typ,
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
			MBT_PURC_SLIP_SND_IF_R.$itm_jnl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$itm_jnl_cd,
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
			MBT_PURC_SLIP_SND_IF_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$trd_unit_cd,
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
			MBT_PURC_SLIP_SND_IF_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$trd_unit_qty,
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
			MBT_PURC_SLIP_SND_IF_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$base_unit_cd,
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
			MBT_PURC_SLIP_SND_IF_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$base_unit_qty,
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
			MBT_PURC_SLIP_SND_IF_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$tax_cd,
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
			MBT_PURC_SLIP_SND_IF_R.$inc_tax_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_PURC_SLIP_SND_IF_R.$inc_tax_flg,
				"inc_tax_flg",
				inc_tax_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$tax_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$tax_typ,
				"tax_typ",
				tax_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$trd_cur_upri,
				"trd_cur_upri",
				trd_cur_upri,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$trd_cur_amt,
				"trd_cur_amt",
				trd_cur_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$trd_cur_tax_amt,
				"trd_cur_tax_amt",
				trd_cur_tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$trd_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$trd_cur_dscnt_amt,
				"trd_cur_dscnt_amt",
				trd_cur_dscnt_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$base_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$base_cur_upri,
				"base_cur_upri",
				base_cur_upri,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$base_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$base_cur_amt,
				"base_cur_amt",
				base_cur_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$base_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$base_cur_tax_amt,
				"base_cur_tax_amt",
				base_cur_tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$base_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$base_cur_dscnt_amt,
				"base_cur_dscnt_amt",
				base_cur_dscnt_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$dtl_dscnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_PURC_SLIP_SND_IF_R.$dtl_dscnt_flg,
				"dtl_dscnt_flg",
				dtl_dscnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$purc_adj_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_PURC_SLIP_SND_IF_R.$purc_adj_flg,
				"purc_adj_flg",
				purc_adj_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$re_snd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_PURC_SLIP_SND_IF_R.$re_snd_flg,
				"re_snd_flg",
				re_snd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$not_snd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_PURC_SLIP_SND_IF_R.$not_snd_flg,
				"not_snd_flg",
				not_snd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$snd_to_err_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_PURC_SLIP_SND_IF_R.$snd_to_err_flg,
				"snd_to_err_flg",
				snd_to_err_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char1,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char2,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char3,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char4,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char5,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char6,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char7,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char8,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char9,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char10,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char11,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char12,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char13,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char14,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char15,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char16,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char17,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char18,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char19,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char20,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char21,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char22,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char23,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char24,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char25,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char26,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char27,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char28,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char29,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_char30,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_num1,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_num2,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_num3,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_num4,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_num5,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_dt1,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_dt2,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_dt3,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_dt4,
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
			MBT_PURC_SLIP_SND_IF_R.$if_sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_PURC_SLIP_SND_IF_R.$if_sub_dt5,
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
			MBT_PURC_SLIP_SND_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$batch_log_no,
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
			MBT_PURC_SLIP_SND_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$log_sub_key1,
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
			MBT_PURC_SLIP_SND_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$log_sub_key2,
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
			MBT_PURC_SLIP_SND_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$ins_usr_id,
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
			MBT_PURC_SLIP_SND_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$ins_usr_nm,
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
			MBT_PURC_SLIP_SND_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_PURC_SLIP_SND_IF_R.$ins_ts,
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
			MBT_PURC_SLIP_SND_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$ins_func_id,
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
			MBT_PURC_SLIP_SND_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_PURC_SLIP_SND_IF_R.$upd_cntr,
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
			MBT_PURC_SLIP_SND_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$upd_usr_id,
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
			MBT_PURC_SLIP_SND_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$upd_usr_nm,
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
			MBT_PURC_SLIP_SND_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_PURC_SLIP_SND_IF_R.$upd_ts,
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
			MBT_PURC_SLIP_SND_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$upd_func_id,
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
			MBT_PURC_SLIP_SND_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$upd_srv_req_no,
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
			MBT_PURC_SLIP_SND_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$sdrv_sts_typ,
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
			MBT_PURC_SLIP_SND_IF_R.$trd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$trd_nm,
				"trd_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$sppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$sppl_nm,
				"sppl_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$cred_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$cred_nm,
				"cred_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$bsppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$bsppl_nm,
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
			MBT_PURC_SLIP_SND_IF_R.$bsppl_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$bsppl_dpt_nm,
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
			MBT_PURC_SLIP_SND_IF_R.$usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$usr_nm,
				"usr_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$dpt_nm,
				"dpt_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$trd_cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$trd_cur_nm,
				"trd_cur_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$xrate_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$xrate_nm,
				"xrate_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$base_cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$base_cur_nm,
				"base_cur_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$arr_lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$arr_lg_grp_nm,
				"arr_lg_grp_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$ap_sttl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$ap_sttl_nm,
				"ap_sttl_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$itm_jnl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$itm_jnl_nm,
				"itm_jnl_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$trd_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$trd_unit_nm,
				"trd_unit_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$base_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$base_unit_nm,
				"base_unit_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$tax_nm,
				"tax_nm",
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
			MBT_PURC_SLIP_SND_IF_R.$ap_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_PURC_SLIP_SND_IF_R.$ap_dpt_nm,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBT_PURC_SLIP_SND_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBT_PURC_SLIP_SND_IF_R create(String alias) {
		MBT_PURC_SLIP_SND_IF_R row = new MBT_PURC_SLIP_SND_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBT_PURC_SLIP_SND_IF_R createByName(T proto) {
		MBT_PURC_SLIP_SND_IF_R row = MBT_PURC_SLIP_SND_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_PURC_SLIP_SND_IF_R clone() {
		return (MBT_PURC_SLIP_SND_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_PURC_SLIP_SND_IF_R createInstance() {
		return (MBT_PURC_SLIP_SND_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_PURC_SLIP_SND_IF_R getValues(String... names) {
		return (MBT_PURC_SLIP_SND_IF_R) super.getValues(names);
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
	 public MBW_PURC_SLIP_SND_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MBW_PURC_SLIP_SND_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MBW_PURC_SLIP_SND_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MBW_PURC_SLIP_SND_IF_KEY_R.TABLE_NAME);
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
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 5, $purc_act_no);
	}

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 5, $purc_act_no, value);
	}

	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return getConstNumber(offset + 6, $purc_act_seq);
	}

	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		setConstNumber(offset + 6, $purc_act_seq, value);
	}
	
	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		setConstNumber(offset + 6, $purc_act_seq, value);
	}
	
	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		setConstNumber(offset + 6, $purc_act_seq, value);
	}
	
	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		setConstNumber(offset + 6, $purc_act_seq, value);
	}
	
	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		setConstNumber(offset + 6, $purc_act_seq, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public MCNumber purc_act_rev() {
		return getConstNumber(offset + 7, $purc_act_rev);
	}

	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(MCNumber value) {
		setConstNumber(offset + 7, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(int value) {
		setConstNumber(offset + 7, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(long value) {
		setConstNumber(offset + 7, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(float value) {
		setConstNumber(offset + 7, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(double value) {
		setConstNumber(offset + 7, $purc_act_rev, value);
	}
	
	/**
	 * 仕入伝票ＮＯ. Purchase slip No..<p>
	 *
	 */
	public String purc_slip_no() {
		return getConstString(offset + 8, $purc_slip_no);
	}

	/**
	 * 仕入伝票ＮＯ. Purchase slip No..<p>
	 *
	 */
	public void purc_slip_no(String value) {
		setConstString(offset + 8, $purc_slip_no, value);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 9, $slip_sts_typ);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 9, $slip_sts_typ, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 10, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 10, $trd_cd, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 11, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 11, $trd_ptn_typ, value);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 12, $ac_ym);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 12, $ac_ym, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 13, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 13, $ac_dt, value);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 14, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 14, $dpt_cd, value);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 15, $usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 15, $usr_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 16, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 16, $sppl_cd, value);
	}

	/**
	 * 税計算区分. Tax calculation type.<p>
	 *
	 */
	public String tax_calc_typ() {
		return getConstString(offset + 17, $tax_calc_typ);
	}

	/**
	 * 税計算区分. Tax calculation type.<p>
	 *
	 */
	public void tax_calc_typ(String value) {
		setConstString(offset + 17, $tax_calc_typ, value);
	}

	/**
	 * インボイスＦＬＧ. Invoice flg..<p>
	 *
	 */
	public boolean iv_flg() {
		return getConstBoolean(offset + 18, $iv_flg);
	}

	/**
	 * インボイスＦＬＧ. Invoice flg..<p>
	 *
	 */
	public void iv_flg(boolean value) {
		setConstBoolean(offset + 18, $iv_flg, value);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 19, $rcpt_iv_no);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 19, $rcpt_iv_no, value);
	}

	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 20, $rcpt_iv_mng_no);
	}

	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 20, $rcpt_iv_mng_no, value);
	}

	/**
	 * 仕入返品実績ＮＯ. Purchase return result No..<p>
	 *
	 */
	public String purc_ret_act_no() {
		return getConstString(offset + 21, $purc_ret_act_no);
	}

	/**
	 * 仕入返品実績ＮＯ. Purchase return result No..<p>
	 *
	 */
	public void purc_ret_act_no(String value) {
		setConstString(offset + 21, $purc_ret_act_no, value);
	}

	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public MCNumber purc_ret_act_rev() {
		return getConstNumber(offset + 22, $purc_ret_act_rev);
	}

	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(MCNumber value) {
		setConstNumber(offset + 22, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(int value) {
		setConstNumber(offset + 22, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(long value) {
		setConstNumber(offset + 22, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(float value) {
		setConstNumber(offset + 22, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(double value) {
		setConstNumber(offset + 22, $purc_ret_act_rev, value);
	}
	
	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 23, $cred_cd);
	}

	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 23, $cred_cd, value);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 24, $bsppl_cd);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 24, $bsppl_cd, value);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 25, $bsppl_dpt_cd);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 25, $bsppl_dpt_cd, value);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 26, $ap_dpt_cd);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 26, $ap_dpt_cd, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 27, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 27, $trd_cur_cd, value);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 28, $base_cur_cd);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 28, $base_cur_cd, value);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 29, $xrate_cd);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 29, $xrate_cd, value);
	}

	/**
	 * 入荷物流グループＣＤ. Receipt distribution group cd..<p>
	 *
	 */
	public String arr_lg_grp_cd() {
		return getConstString(offset + 30, $arr_lg_grp_cd);
	}

	/**
	 * 入荷物流グループＣＤ. Receipt distribution group cd..<p>
	 *
	 */
	public void arr_lg_grp_cd(String value) {
		setConstString(offset + 30, $arr_lg_grp_cd, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 31, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 31, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 31, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 31, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 31, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 31, $xrate, value);
	}
	
	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 32, $ap_sttl_cd);
	}

	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 32, $ap_sttl_cd, value);
	}

	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 33, $pay_schd_dt);
	}

	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 33, $pay_schd_dt, value);
	}

	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 34, $purc_act_d_no);
	}

	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 34, $purc_act_d_no, value);
	}

	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return getConstNumber(offset + 35, $purc_act_d_seq);
	}

	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		setConstNumber(offset + 35, $purc_act_d_seq, value);
	}
	
	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		setConstNumber(offset + 35, $purc_act_d_seq, value);
	}
	
	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		setConstNumber(offset + 35, $purc_act_d_seq, value);
	}
	
	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		setConstNumber(offset + 35, $purc_act_d_seq, value);
	}
	
	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		setConstNumber(offset + 35, $purc_act_d_seq, value);
	}
	
	/**
	 * 仕入返品実績明細ＮＯ. Purchase return result details No..<p>
	 *
	 */
	public String purc_ret_act_d_no() {
		return getConstString(offset + 36, $purc_ret_act_d_no);
	}

	/**
	 * 仕入返品実績明細ＮＯ. Purchase return result details No..<p>
	 *
	 */
	public void purc_ret_act_d_no(String value) {
		setConstString(offset + 36, $purc_ret_act_d_no, value);
	}

	/**
	 * 仕入伝票行ＮＯ. Purchase slip row No..<p>
	 *
	 */
	public MCNumber purc_slip_lno() {
		return getConstNumber(offset + 37, $purc_slip_lno);
	}

	/**
	 * 仕入伝票行ＮＯ. Purchase slip row No..<p>
	 *
	 */
	public void purc_slip_lno(MCNumber value) {
		setConstNumber(offset + 37, $purc_slip_lno, value);
	}
	
	/**
	 * 仕入伝票行ＮＯ. Purchase slip row No..<p>
	 *
	 */
	public void purc_slip_lno(int value) {
		setConstNumber(offset + 37, $purc_slip_lno, value);
	}
	
	/**
	 * 仕入伝票行ＮＯ. Purchase slip row No..<p>
	 *
	 */
	public void purc_slip_lno(long value) {
		setConstNumber(offset + 37, $purc_slip_lno, value);
	}
	
	/**
	 * 仕入伝票行ＮＯ. Purchase slip row No..<p>
	 *
	 */
	public void purc_slip_lno(float value) {
		setConstNumber(offset + 37, $purc_slip_lno, value);
	}
	
	/**
	 * 仕入伝票行ＮＯ. Purchase slip row No..<p>
	 *
	 */
	public void purc_slip_lno(double value) {
		setConstNumber(offset + 37, $purc_slip_lno, value);
	}
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 38, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 38, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 39, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 39, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 40, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 40, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 41, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 41, $itm_sub3, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 42, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 42, $itm_nm, value);
	}

	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 43, $stk_mng_typ);
	}

	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 43, $stk_mng_typ, value);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 44, $itm_jnl_cd);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 44, $itm_jnl_cd, value);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 45, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 45, $trd_unit_cd, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 46, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 46, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 46, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 46, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 46, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 46, $trd_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 47, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 47, $base_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 48, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 49, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 49, $tax_cd, value);
	}

	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 50, $inc_tax_flg);
	}

	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 50, $inc_tax_flg, value);
	}

	/**
	 * 税区分. Tax type.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 51, $tax_typ);
	}

	/**
	 * 税区分. Tax type.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 51, $tax_typ, value);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 52, $trd_cur_upri);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 52, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 52, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 52, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 52, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 52, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 53, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 53, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 53, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 53, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 53, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 53, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 54, $trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 54, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 54, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 54, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 54, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 54, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 55, $trd_cur_dscnt_amt);
	}

	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 55, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 55, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 55, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 55, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 55, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 56, $base_cur_upri);
	}

	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 56, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 56, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 56, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 56, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 56, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 57, $base_cur_amt);
	}

	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 57, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 57, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 57, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 57, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 57, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 58, $base_cur_tax_amt);
	}

	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 58, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 58, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 58, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 58, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 58, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 59, $base_cur_dscnt_amt);
	}

	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 59, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 59, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 59, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 59, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 59, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 明細値引ＦＬＧ. Details discount flg..<p>
	 *
	 */
	public boolean dtl_dscnt_flg() {
		return getConstBoolean(offset + 60, $dtl_dscnt_flg);
	}

	/**
	 * 明細値引ＦＬＧ. Details discount flg..<p>
	 *
	 */
	public void dtl_dscnt_flg(boolean value) {
		setConstBoolean(offset + 60, $dtl_dscnt_flg, value);
	}

	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public boolean purc_adj_flg() {
		return getConstBoolean(offset + 61, $purc_adj_flg);
	}

	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public void purc_adj_flg(boolean value) {
		setConstBoolean(offset + 61, $purc_adj_flg, value);
	}

	/**
	 * 再送信ＦＬＧ. Resend flg..<p>
	 *
	 */
	public boolean re_snd_flg() {
		return getConstBoolean(offset + 62, $re_snd_flg);
	}

	/**
	 * 再送信ＦＬＧ. Resend flg..<p>
	 *
	 */
	public void re_snd_flg(boolean value) {
		setConstBoolean(offset + 62, $re_snd_flg, value);
	}

	/**
	 * 送信対象外ＦＬＧ. Not to be exported flg..<p>
	 *
	 */
	public boolean not_snd_flg() {
		return getConstBoolean(offset + 63, $not_snd_flg);
	}

	/**
	 * 送信対象外ＦＬＧ. Not to be exported flg..<p>
	 *
	 */
	public void not_snd_flg(boolean value) {
		setConstBoolean(offset + 63, $not_snd_flg, value);
	}

	/**
	 * 送信先エラーＦＬＧ. Send-to error flg..<p>
	 *
	 */
	public boolean snd_to_err_flg() {
		return getConstBoolean(offset + 64, $snd_to_err_flg);
	}

	/**
	 * 送信先エラーＦＬＧ. Send-to error flg..<p>
	 *
	 */
	public void snd_to_err_flg(boolean value) {
		setConstBoolean(offset + 64, $snd_to_err_flg, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public String if_sub_char1() {
		return getConstString(offset + 65, $if_sub_char1);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public void if_sub_char1(String value) {
		setConstString(offset + 65, $if_sub_char1, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public String if_sub_char2() {
		return getConstString(offset + 66, $if_sub_char2);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public void if_sub_char2(String value) {
		setConstString(offset + 66, $if_sub_char2, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public String if_sub_char3() {
		return getConstString(offset + 67, $if_sub_char3);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public void if_sub_char3(String value) {
		setConstString(offset + 67, $if_sub_char3, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public String if_sub_char4() {
		return getConstString(offset + 68, $if_sub_char4);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public void if_sub_char4(String value) {
		setConstString(offset + 68, $if_sub_char4, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public String if_sub_char5() {
		return getConstString(offset + 69, $if_sub_char5);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public void if_sub_char5(String value) {
		setConstString(offset + 69, $if_sub_char5, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public String if_sub_char6() {
		return getConstString(offset + 70, $if_sub_char6);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public void if_sub_char6(String value) {
		setConstString(offset + 70, $if_sub_char6, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public String if_sub_char7() {
		return getConstString(offset + 71, $if_sub_char7);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public void if_sub_char7(String value) {
		setConstString(offset + 71, $if_sub_char7, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public String if_sub_char8() {
		return getConstString(offset + 72, $if_sub_char8);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public void if_sub_char8(String value) {
		setConstString(offset + 72, $if_sub_char8, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public String if_sub_char9() {
		return getConstString(offset + 73, $if_sub_char9);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public void if_sub_char9(String value) {
		setConstString(offset + 73, $if_sub_char9, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public String if_sub_char10() {
		return getConstString(offset + 74, $if_sub_char10);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public void if_sub_char10(String value) {
		setConstString(offset + 74, $if_sub_char10, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public String if_sub_char11() {
		return getConstString(offset + 75, $if_sub_char11);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public void if_sub_char11(String value) {
		setConstString(offset + 75, $if_sub_char11, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public String if_sub_char12() {
		return getConstString(offset + 76, $if_sub_char12);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public void if_sub_char12(String value) {
		setConstString(offset + 76, $if_sub_char12, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public String if_sub_char13() {
		return getConstString(offset + 77, $if_sub_char13);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public void if_sub_char13(String value) {
		setConstString(offset + 77, $if_sub_char13, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public String if_sub_char14() {
		return getConstString(offset + 78, $if_sub_char14);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public void if_sub_char14(String value) {
		setConstString(offset + 78, $if_sub_char14, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public String if_sub_char15() {
		return getConstString(offset + 79, $if_sub_char15);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public void if_sub_char15(String value) {
		setConstString(offset + 79, $if_sub_char15, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public String if_sub_char16() {
		return getConstString(offset + 80, $if_sub_char16);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public void if_sub_char16(String value) {
		setConstString(offset + 80, $if_sub_char16, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public String if_sub_char17() {
		return getConstString(offset + 81, $if_sub_char17);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public void if_sub_char17(String value) {
		setConstString(offset + 81, $if_sub_char17, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public String if_sub_char18() {
		return getConstString(offset + 82, $if_sub_char18);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public void if_sub_char18(String value) {
		setConstString(offset + 82, $if_sub_char18, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public String if_sub_char19() {
		return getConstString(offset + 83, $if_sub_char19);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public void if_sub_char19(String value) {
		setConstString(offset + 83, $if_sub_char19, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public String if_sub_char20() {
		return getConstString(offset + 84, $if_sub_char20);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public void if_sub_char20(String value) {
		setConstString(offset + 84, $if_sub_char20, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public String if_sub_char21() {
		return getConstString(offset + 85, $if_sub_char21);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public void if_sub_char21(String value) {
		setConstString(offset + 85, $if_sub_char21, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public String if_sub_char22() {
		return getConstString(offset + 86, $if_sub_char22);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public void if_sub_char22(String value) {
		setConstString(offset + 86, $if_sub_char22, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public String if_sub_char23() {
		return getConstString(offset + 87, $if_sub_char23);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public void if_sub_char23(String value) {
		setConstString(offset + 87, $if_sub_char23, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public String if_sub_char24() {
		return getConstString(offset + 88, $if_sub_char24);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public void if_sub_char24(String value) {
		setConstString(offset + 88, $if_sub_char24, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public String if_sub_char25() {
		return getConstString(offset + 89, $if_sub_char25);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public void if_sub_char25(String value) {
		setConstString(offset + 89, $if_sub_char25, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public String if_sub_char26() {
		return getConstString(offset + 90, $if_sub_char26);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public void if_sub_char26(String value) {
		setConstString(offset + 90, $if_sub_char26, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public String if_sub_char27() {
		return getConstString(offset + 91, $if_sub_char27);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public void if_sub_char27(String value) {
		setConstString(offset + 91, $if_sub_char27, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public String if_sub_char28() {
		return getConstString(offset + 92, $if_sub_char28);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public void if_sub_char28(String value) {
		setConstString(offset + 92, $if_sub_char28, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public String if_sub_char29() {
		return getConstString(offset + 93, $if_sub_char29);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public void if_sub_char29(String value) {
		setConstString(offset + 93, $if_sub_char29, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public String if_sub_char30() {
		return getConstString(offset + 94, $if_sub_char30);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public void if_sub_char30(String value) {
		setConstString(offset + 94, $if_sub_char30, value);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public MCNumber if_sub_num1() {
		return getConstNumber(offset + 95, $if_sub_num1);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(MCNumber value) {
		setConstNumber(offset + 95, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(int value) {
		setConstNumber(offset + 95, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(long value) {
		setConstNumber(offset + 95, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(float value) {
		setConstNumber(offset + 95, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(double value) {
		setConstNumber(offset + 95, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public MCNumber if_sub_num2() {
		return getConstNumber(offset + 96, $if_sub_num2);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(MCNumber value) {
		setConstNumber(offset + 96, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(int value) {
		setConstNumber(offset + 96, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(long value) {
		setConstNumber(offset + 96, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(float value) {
		setConstNumber(offset + 96, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(double value) {
		setConstNumber(offset + 96, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public MCNumber if_sub_num3() {
		return getConstNumber(offset + 97, $if_sub_num3);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(MCNumber value) {
		setConstNumber(offset + 97, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(int value) {
		setConstNumber(offset + 97, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(long value) {
		setConstNumber(offset + 97, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(float value) {
		setConstNumber(offset + 97, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(double value) {
		setConstNumber(offset + 97, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public MCNumber if_sub_num4() {
		return getConstNumber(offset + 98, $if_sub_num4);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(MCNumber value) {
		setConstNumber(offset + 98, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(int value) {
		setConstNumber(offset + 98, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(long value) {
		setConstNumber(offset + 98, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(float value) {
		setConstNumber(offset + 98, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(double value) {
		setConstNumber(offset + 98, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public MCNumber if_sub_num5() {
		return getConstNumber(offset + 99, $if_sub_num5);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(MCNumber value) {
		setConstNumber(offset + 99, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(int value) {
		setConstNumber(offset + 99, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(long value) {
		setConstNumber(offset + 99, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(float value) {
		setConstNumber(offset + 99, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(double value) {
		setConstNumber(offset + 99, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public MCDate if_sub_dt1() {
		return getConstDate(offset + 100, $if_sub_dt1);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public void if_sub_dt1(MCDate value) {
		setConstDate(offset + 100, $if_sub_dt1, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public MCDate if_sub_dt2() {
		return getConstDate(offset + 101, $if_sub_dt2);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public void if_sub_dt2(MCDate value) {
		setConstDate(offset + 101, $if_sub_dt2, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public MCDate if_sub_dt3() {
		return getConstDate(offset + 102, $if_sub_dt3);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public void if_sub_dt3(MCDate value) {
		setConstDate(offset + 102, $if_sub_dt3, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public MCDate if_sub_dt4() {
		return getConstDate(offset + 103, $if_sub_dt4);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public void if_sub_dt4(MCDate value) {
		setConstDate(offset + 103, $if_sub_dt4, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public MCDate if_sub_dt5() {
		return getConstDate(offset + 104, $if_sub_dt5);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public void if_sub_dt5(MCDate value) {
		setConstDate(offset + 104, $if_sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 105, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 105, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 106, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 106, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 106, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 106, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 106, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 106, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 107, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 107, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 107, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 107, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 107, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 107, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 108, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 108, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 109, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 109, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 110, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 110, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 111, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 111, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 112, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 112, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 112, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 112, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 112, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 112, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 113, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 113, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 114, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 114, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 115, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 115, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 116, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 116, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 117, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 117, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 118, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 118, $sdrv_sts_typ, value);
	}

	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 119, $trd_nm);
	}

	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 119, $trd_nm, value);
	}

	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 120, $sppl_nm);
	}

	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 120, $sppl_nm, value);
	}

	/**
	 * 与信管理先名. Credit managed BP name.<p>
	 *
	 */
	public String cred_nm() {
		return getConstString(offset + 121, $cred_nm);
	}

	/**
	 * 与信管理先名. Credit managed BP name.<p>
	 *
	 */
	public void cred_nm(String value) {
		setConstString(offset + 121, $cred_nm, value);
	}

	/**
	 * 支払予定管理先名. Scheduled payee name.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 122, $bsppl_nm);
	}

	/**
	 * 支払予定管理先名. Scheduled payee name.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 122, $bsppl_nm, value);
	}

	/**
	 * 支払予定管理先担当部門名. Name of dept. in charge of scheduled payee.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 123, $bsppl_dpt_nm);
	}

	/**
	 * 支払予定管理先担当部門名. Name of dept. in charge of scheduled payee.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 123, $bsppl_dpt_nm, value);
	}

	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 124, $usr_nm);
	}

	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 124, $usr_nm, value);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 125, $dpt_nm);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 125, $dpt_nm, value);
	}

	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 126, $trd_cur_nm);
	}

	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 126, $trd_cur_nm, value);
	}

	/**
	 * 為替レート名. Exchange rate name.<p>
	 *
	 */
	public String xrate_nm() {
		return getConstString(offset + 127, $xrate_nm);
	}

	/**
	 * 為替レート名. Exchange rate name.<p>
	 *
	 */
	public void xrate_nm(String value) {
		setConstString(offset + 127, $xrate_nm, value);
	}

	/**
	 * 基準通貨名. Base currency name.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 128, $base_cur_nm);
	}

	/**
	 * 基準通貨名. Base currency name.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 128, $base_cur_nm, value);
	}

	/**
	 * 入荷物流グループ名. Receipt distribution group name.<p>
	 *
	 */
	public String arr_lg_grp_nm() {
		return getConstString(offset + 129, $arr_lg_grp_nm);
	}

	/**
	 * 入荷物流グループ名. Receipt distribution group name.<p>
	 *
	 */
	public void arr_lg_grp_nm(String value) {
		setConstString(offset + 129, $arr_lg_grp_nm, value);
	}

	/**
	 * 債務決済方法名. AP settlement method name.<p>
	 *
	 */
	public String ap_sttl_nm() {
		return getConstString(offset + 130, $ap_sttl_nm);
	}

	/**
	 * 債務決済方法名. AP settlement method name.<p>
	 *
	 */
	public void ap_sttl_nm(String value) {
		setConstString(offset + 130, $ap_sttl_nm, value);
	}

	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 131, $itm_jnl_nm);
	}

	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 131, $itm_jnl_nm, value);
	}

	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 132, $trd_unit_nm);
	}

	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 132, $trd_unit_nm, value);
	}

	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 133, $base_unit_nm);
	}

	/**
	 * 基準単位名. Base unit name.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 133, $base_unit_nm, value);
	}

	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 134, $tax_nm);
	}

	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 134, $tax_nm, value);
	}

	/**
	 * 債務部門名. AP dept. name.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 135, $ap_dpt_nm);
	}

	/**
	 * 債務部門名. AP dept. name.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 135, $ap_dpt_nm, value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_slip_no.equalsIgnoreCase(name)) {
			return purc_slip_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($tax_calc_typ.equalsIgnoreCase(name)) {
			return tax_calc_typ();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_lg_grp_cd();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			return purc_ret_act_d_no();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
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
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			return sdrv_sts_typ();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			return cred_nm();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			return arr_lg_grp_nm();
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			return purc_slip_lno();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
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
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
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
		if ($iv_flg.equalsIgnoreCase(name)) {
			return iv_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($dtl_dscnt_flg.equalsIgnoreCase(name)) {
			return dtl_dscnt_flg();
		}
		if ($purc_adj_flg.equalsIgnoreCase(name)) {
			return purc_adj_flg();
		}
		if ($re_snd_flg.equalsIgnoreCase(name)) {
			return re_snd_flg();
		}
		if ($not_snd_flg.equalsIgnoreCase(name)) {
			return not_snd_flg();
		}
		if ($snd_to_err_flg.equalsIgnoreCase(name)) {
			return snd_to_err_flg();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_slip_no.equalsIgnoreCase(name)) {
			return purc_slip_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($tax_calc_typ.equalsIgnoreCase(name)) {
			return tax_calc_typ();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_lg_grp_cd();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			return purc_ret_act_d_no();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
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
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			return sdrv_sts_typ();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			return cred_nm();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			return arr_lg_grp_nm();
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			return purc_slip_lno();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
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
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
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
		if ($iv_flg.equalsIgnoreCase(name)) {
			return iv_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($dtl_dscnt_flg.equalsIgnoreCase(name)) {
			return dtl_dscnt_flg();
		}
		if ($purc_adj_flg.equalsIgnoreCase(name)) {
			return purc_adj_flg();
		}
		if ($re_snd_flg.equalsIgnoreCase(name)) {
			return re_snd_flg();
		}
		if ($not_snd_flg.equalsIgnoreCase(name)) {
			return not_snd_flg();
		}
		if ($snd_to_err_flg.equalsIgnoreCase(name)) {
			return snd_to_err_flg();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_slip_no.equalsIgnoreCase(name)) {
			purc_slip_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($tax_calc_typ.equalsIgnoreCase(name)) {
			tax_calc_typ(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_lg_grp_cd(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			purc_ret_act_d_no(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
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
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			sdrv_sts_typ(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			cred_nm(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			arr_lg_grp_nm(value);
			return;
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			purc_slip_lno(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			purc_slip_lno(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			purc_slip_lno(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			purc_slip_lno(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			purc_slip_lno(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
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
		if ($iv_flg.equalsIgnoreCase(name)) {
			iv_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($dtl_dscnt_flg.equalsIgnoreCase(name)) {
			dtl_dscnt_flg(value);
			return;
		}
		if ($purc_adj_flg.equalsIgnoreCase(name)) {
			purc_adj_flg(value);
			return;
		}
		if ($re_snd_flg.equalsIgnoreCase(name)) {
			re_snd_flg(value);
			return;
		}
		if ($not_snd_flg.equalsIgnoreCase(name)) {
			not_snd_flg(value);
			return;
		}
		if ($snd_to_err_flg.equalsIgnoreCase(name)) {
			snd_to_err_flg(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_slip_no.equalsIgnoreCase(name)) {
			purc_slip_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($tax_calc_typ.equalsIgnoreCase(name)) {
			tax_calc_typ(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_lg_grp_cd(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			purc_ret_act_d_no(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
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
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			sdrv_sts_typ(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			cred_nm(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			arr_lg_grp_nm(value);
			return;
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			purc_slip_lno(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			purc_slip_lno(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			purc_slip_lno(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			purc_slip_lno(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($purc_slip_lno.equalsIgnoreCase(name)) {
			purc_slip_lno(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
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
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
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
		if ($iv_flg.equalsIgnoreCase(name)) {
			iv_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($dtl_dscnt_flg.equalsIgnoreCase(name)) {
			dtl_dscnt_flg(value);
			return;
		}
		if ($purc_adj_flg.equalsIgnoreCase(name)) {
			purc_adj_flg(value);
			return;
		}
		if ($re_snd_flg.equalsIgnoreCase(name)) {
			re_snd_flg(value);
			return;
		}
		if ($not_snd_flg.equalsIgnoreCase(name)) {
			not_snd_flg(value);
			return;
		}
		if ($snd_to_err_flg.equalsIgnoreCase(name)) {
			snd_to_err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
