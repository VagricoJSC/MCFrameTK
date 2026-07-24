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
 * "支払通知書明細履歴 // Payment notice details history"DBコンテナRowクラスです。<p>
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
 *  	<td>pay_ntc_d_his_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書明細履歴ＮＯ</td>
 *  	<td>Payment notice details history No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_his_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書履歴ＮＯ</td>
 *  	<td>Payment notice history No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛明細ＮＯ</td>
 *  	<td>AP details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績ＮＯ</td>
 *  	<td>Payment result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績連番</td>
 *  	<td>Payment result sequence No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績明細ＮＯ</td>
 *  	<td>Payment result details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_act_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績明細連番</td>
 *  	<td>Payment result details sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_pay_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金実績ＮＯ</td>
 *  	<td>Advance payment result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_pay_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金実績連番</td>
 *  	<td>Advance payment result sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_d_his_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書明細履歴区分</td>
 *  	<td>Payment notice details history type</td>
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
 *  	<td>purc_act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入実績改訂番号</td>
 *  	<td>Purchase result rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入実績明細ＮＯ</td>
 *  	<td>Purchase result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_dlv_slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業者納品書ＮＯ</td>
 *  	<td>Vendor delivery note No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業者納品書明細ＮＯ</td>
 *  	<td>Vendor delivery note details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slip_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>伝票状況区分</td>
 *  	<td>Slip status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
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
 *  	<td>act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績日</td>
 *  	<td>Actual date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
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
 *  	<td>sundry_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>諸口品ＦＬＧ</td>
 *  	<td>Miscellaneous item flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先品目ＣＤ</td>
 *  	<td>Supplier item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先品名</td>
 *  	<td>Supplier item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位数量</td>
 *  	<td>Transaction unit qty.</td>
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
 *  	<td>interim_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仮単価ＦＬＧ</td>
 *  	<td>Temporary unit price flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨単価</td>
 *  	<td>Unit price (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨金額</td>
 *  	<td>Amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
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
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨単価</td>
 *  	<td>Unit price (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨金額</td>
 *  	<td>Amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
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
 *  	<td>pay_mtd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方式区分</td>
 *  	<td>Payment method type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_purc_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入計上日（基）</td>
 *  	<td>Purchase recording date (Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_d_print_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書明細備考</td>
 *  	<td>Payment notice details remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_sttl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務決済方法ＣＤ</td>
 *  	<td>AP settlement method cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績日</td>
 *  	<td>Actual payment date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_d_sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛明細予備１</td>
 *  	<td>AP details spare 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_d_sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛明細予備２</td>
 *  	<td>AP details spare 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_d_sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛明細予備３</td>
 *  	<td>AP details spare 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_act_d_sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績明細予備１</td>
 *  	<td>Payment result details spare 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_act_d_sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績明細予備２</td>
 *  	<td>Payment result details spare 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_act_d_sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績明細予備３</td>
 *  	<td>Payment result details spare 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_pay_act_sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金実績予備１</td>
 *  	<td>Advance payment details spare 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_pay_act_sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金実績予備２</td>
 *  	<td>Advance payment details spare 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_pay_act_sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金実績予備３</td>
 *  	<td>Advance payment details spare 3</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_PAY_NTC_D_HIS_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PAY_NTC_D_HIS";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 支払通知書明細履歴ＮＯ. Payment notice details history No..<p>
	 *
	 */
	public static final String $pay_ntc_d_his_no = "pay_ntc_d_his_no";
	private static final MCPermColumnInfo _pay_ntc_d_his_no = createColumnInfo("pay_ntc_d_his_no");
	public final MCStringPermColumn pay_ntc_d_his_no = createStringColumn(_pay_ntc_d_his_no);
	
	/**
	 * 支払通知書履歴ＮＯ. Payment notice history No..<p>
	 *
	 */
	public static final String $pay_ntc_his_no = "pay_ntc_his_no";
	private static final MCPermColumnInfo _pay_ntc_his_no = createColumnInfo("pay_ntc_his_no");
	public final MCStringPermColumn pay_ntc_his_no = createStringColumn(_pay_ntc_his_no);
	
	/**
	 * 買掛明細ＮＯ. AP details No..<p>
	 *
	 */
	public static final String $ap_d_no = "ap_d_no";
	private static final MCPermColumnInfo _ap_d_no = createColumnInfo("ap_d_no");
	public final MCStringPermColumn ap_d_no = createStringColumn(_ap_d_no);
	
	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public static final String $pay_act_no = "pay_act_no";
	private static final MCPermColumnInfo _pay_act_no = createColumnInfo("pay_act_no");
	public final MCStringPermColumn pay_act_no = createStringColumn(_pay_act_no);
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public static final String $pay_act_seq = "pay_act_seq";
	private static final MCPermColumnInfo _pay_act_seq = createColumnInfo("pay_act_seq");
	public final MCNumberPermColumn pay_act_seq = createNumberColumn(_pay_act_seq);
	
	/**
	 * 支払実績明細ＮＯ. Payment result details No..<p>
	 *
	 */
	public static final String $pay_act_d_no = "pay_act_d_no";
	private static final MCPermColumnInfo _pay_act_d_no = createColumnInfo("pay_act_d_no");
	public final MCStringPermColumn pay_act_d_no = createStringColumn(_pay_act_d_no);
	
	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public static final String $pay_act_d_seq = "pay_act_d_seq";
	private static final MCPermColumnInfo _pay_act_d_seq = createColumnInfo("pay_act_d_seq");
	public final MCNumberPermColumn pay_act_d_seq = createNumberColumn(_pay_act_d_seq);
	
	/**
	 * 前渡金実績ＮＯ. Advance payment result No..<p>
	 *
	 */
	public static final String $adv_pay_act_no = "adv_pay_act_no";
	private static final MCPermColumnInfo _adv_pay_act_no = createColumnInfo("adv_pay_act_no");
	public final MCStringPermColumn adv_pay_act_no = createStringColumn(_adv_pay_act_no);
	
	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public static final String $adv_pay_act_seq = "adv_pay_act_seq";
	private static final MCPermColumnInfo _adv_pay_act_seq = createColumnInfo("adv_pay_act_seq");
	public final MCNumberPermColumn adv_pay_act_seq = createNumberColumn(_adv_pay_act_seq);
	
	/**
	 * 支払通知書明細履歴区分. Payment notice details history type.<p>
	 *
	 */
	public static final String $pay_ntc_d_his_typ = "pay_ntc_d_his_typ";
	private static final MCPermColumnInfo _pay_ntc_d_his_typ = createColumnInfo("pay_ntc_d_his_typ");
	public final MCStringPermColumn pay_ntc_d_his_typ = createStringColumn(_pay_ntc_d_his_typ);
	
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
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public static final String $purc_act_rev = "purc_act_rev";
	private static final MCPermColumnInfo _purc_act_rev = createColumnInfo("purc_act_rev");
	public final MCNumberPermColumn purc_act_rev = createNumberColumn(_purc_act_rev);
	
	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	private static final MCPermColumnInfo _purc_act_d_no = createColumnInfo("purc_act_d_no");
	public final MCStringPermColumn purc_act_d_no = createStringColumn(_purc_act_d_no);
	
	/**
	 * 業者納品書ＮＯ. Vendor delivery note No..<p>
	 *
	 */
	public static final String $bp_dlv_slip_no = "bp_dlv_slip_no";
	private static final MCPermColumnInfo _bp_dlv_slip_no = createColumnInfo("bp_dlv_slip_no");
	public final MCStringPermColumn bp_dlv_slip_no = createStringColumn(_bp_dlv_slip_no);
	
	/**
	 * 業者納品書明細ＮＯ. Vendor delivery note details No..<p>
	 *
	 */
	public static final String $bp_dlv_slip_d_no = "bp_dlv_slip_d_no";
	private static final MCPermColumnInfo _bp_dlv_slip_d_no = createColumnInfo("bp_dlv_slip_d_no");
	public final MCStringPermColumn bp_dlv_slip_d_no = createStringColumn(_bp_dlv_slip_d_no);
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	private static final MCPermColumnInfo _trd_cd = createColumnInfo("trd_cd");
	public final MCStringPermColumn trd_cd = createStringColumn(_trd_cd);
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	private static final MCPermColumnInfo _slip_sts_typ = createColumnInfo("slip_sts_typ");
	public final MCStringPermColumn slip_sts_typ = createStringColumn(_slip_sts_typ);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	private static final MCPermColumnInfo _asppl_cd = createColumnInfo("asppl_cd");
	public final MCStringPermColumn asppl_cd = createStringColumn(_asppl_cd);
	
	/**
	 * 実績日. Actual date.<p>
	 *
	 */
	public static final String $act_dt = "act_dt";
	private static final MCPermColumnInfo _act_dt = createColumnInfo("act_dt");
	public final MCDatePermColumn act_dt = createDateColumn(_act_dt);
	
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
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	private static final MCPermColumnInfo _sundry_itm_flg = createColumnInfo("sundry_itm_flg");
	public final MCBooleanPermColumn sundry_itm_flg = createBooleanColumn(_sundry_itm_flg);
	
	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	private static final MCPermColumnInfo _sppl_itm_cd = createColumnInfo("sppl_itm_cd");
	public final MCStringPermColumn sppl_itm_cd = createStringColumn(_sppl_itm_cd);
	
	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	private static final MCPermColumnInfo _sppl_itm_nm = createColumnInfo("sppl_itm_nm");
	public final MCStringPermColumn sppl_itm_nm = createStringColumn(_sppl_itm_nm);
	
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
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	private static final MCPermColumnInfo _tax_cd = createColumnInfo("tax_cd");
	public final MCStringPermColumn tax_cd = createStringColumn(_tax_cd);
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	private static final MCPermColumnInfo _interim_flg = createColumnInfo("interim_flg");
	public final MCBooleanPermColumn interim_flg = createBooleanColumn(_interim_flg);
	
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
	 * 支払方式区分. Payment method type.<p>
	 *
	 */
	public static final String $pay_mtd_typ = "pay_mtd_typ";
	private static final MCPermColumnInfo _pay_mtd_typ = createColumnInfo("pay_mtd_typ");
	public final MCStringPermColumn pay_mtd_typ = createStringColumn(_pay_mtd_typ);
	
	/**
	 * 仕入計上日（基）. Purchase recording date (Base).<p>
	 *
	 */
	public static final String $base_purc_ac_dt = "base_purc_ac_dt";
	private static final MCPermColumnInfo _base_purc_ac_dt = createColumnInfo("base_purc_ac_dt");
	public final MCDatePermColumn base_purc_ac_dt = createDateColumn(_base_purc_ac_dt);
	
	/**
	 * 支払通知書明細備考. Payment notice details remarks.<p>
	 *
	 */
	public static final String $pay_ntc_d_print_rmrks = "pay_ntc_d_print_rmrks";
	private static final MCPermColumnInfo _pay_ntc_d_print_rmrks = createColumnInfo("pay_ntc_d_print_rmrks");
	public final MCStringPermColumn pay_ntc_d_print_rmrks = createStringColumn(_pay_ntc_d_print_rmrks);
	
	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public static final String $ap_sttl_cd = "ap_sttl_cd";
	private static final MCPermColumnInfo _ap_sttl_cd = createColumnInfo("ap_sttl_cd");
	public final MCStringPermColumn ap_sttl_cd = createStringColumn(_ap_sttl_cd);
	
	/**
	 * 支払実績日. Actual payment date.<p>
	 *
	 */
	public static final String $pay_act_dt = "pay_act_dt";
	private static final MCPermColumnInfo _pay_act_dt = createColumnInfo("pay_act_dt");
	public final MCDatePermColumn pay_act_dt = createDateColumn(_pay_act_dt);
	
	/**
	 * 買掛明細予備１. AP details spare 1.<p>
	 *
	 */
	public static final String $ap_d_sub_char1 = "ap_d_sub_char1";
	private static final MCPermColumnInfo _ap_d_sub_char1 = createColumnInfo("ap_d_sub_char1");
	public final MCStringPermColumn ap_d_sub_char1 = createStringColumn(_ap_d_sub_char1);
	
	/**
	 * 買掛明細予備２. AP details spare 2.<p>
	 *
	 */
	public static final String $ap_d_sub_char2 = "ap_d_sub_char2";
	private static final MCPermColumnInfo _ap_d_sub_char2 = createColumnInfo("ap_d_sub_char2");
	public final MCStringPermColumn ap_d_sub_char2 = createStringColumn(_ap_d_sub_char2);
	
	/**
	 * 買掛明細予備３. AP details spare 3.<p>
	 *
	 */
	public static final String $ap_d_sub_char3 = "ap_d_sub_char3";
	private static final MCPermColumnInfo _ap_d_sub_char3 = createColumnInfo("ap_d_sub_char3");
	public final MCStringPermColumn ap_d_sub_char3 = createStringColumn(_ap_d_sub_char3);
	
	/**
	 * 支払実績明細予備１. Payment result details spare 1.<p>
	 *
	 */
	public static final String $pay_act_d_sub_char1 = "pay_act_d_sub_char1";
	private static final MCPermColumnInfo _pay_act_d_sub_char1 = createColumnInfo("pay_act_d_sub_char1");
	public final MCStringPermColumn pay_act_d_sub_char1 = createStringColumn(_pay_act_d_sub_char1);
	
	/**
	 * 支払実績明細予備２. Payment result details spare 2.<p>
	 *
	 */
	public static final String $pay_act_d_sub_char2 = "pay_act_d_sub_char2";
	private static final MCPermColumnInfo _pay_act_d_sub_char2 = createColumnInfo("pay_act_d_sub_char2");
	public final MCStringPermColumn pay_act_d_sub_char2 = createStringColumn(_pay_act_d_sub_char2);
	
	/**
	 * 支払実績明細予備３. Payment result details spare 3.<p>
	 *
	 */
	public static final String $pay_act_d_sub_char3 = "pay_act_d_sub_char3";
	private static final MCPermColumnInfo _pay_act_d_sub_char3 = createColumnInfo("pay_act_d_sub_char3");
	public final MCStringPermColumn pay_act_d_sub_char3 = createStringColumn(_pay_act_d_sub_char3);
	
	/**
	 * 前渡金実績予備１. Advance payment details spare 1.<p>
	 *
	 */
	public static final String $adv_pay_act_sub_char1 = "adv_pay_act_sub_char1";
	private static final MCPermColumnInfo _adv_pay_act_sub_char1 = createColumnInfo("adv_pay_act_sub_char1");
	public final MCStringPermColumn adv_pay_act_sub_char1 = createStringColumn(_adv_pay_act_sub_char1);
	
	/**
	 * 前渡金実績予備２. Advance payment details spare 2.<p>
	 *
	 */
	public static final String $adv_pay_act_sub_char2 = "adv_pay_act_sub_char2";
	private static final MCPermColumnInfo _adv_pay_act_sub_char2 = createColumnInfo("adv_pay_act_sub_char2");
	public final MCStringPermColumn adv_pay_act_sub_char2 = createStringColumn(_adv_pay_act_sub_char2);
	
	/**
	 * 前渡金実績予備３. Advance payment details spare 3.<p>
	 *
	 */
	public static final String $adv_pay_act_sub_char3 = "adv_pay_act_sub_char3";
	private static final MCPermColumnInfo _adv_pay_act_sub_char3 = createColumnInfo("adv_pay_act_sub_char3");
	public final MCStringPermColumn adv_pay_act_sub_char3 = createStringColumn(_adv_pay_act_sub_char3);
	
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
	
	public static final MCMeta pay_ntc_d_his_no_META = createCommonMeta($pay_ntc_d_his_no, mcframe.commonMA.meta.MA_META.PAY_NTC_D_HIS_NO);
	public static final MCMeta pay_ntc_his_no_META = createCommonMeta($pay_ntc_his_no, mcframe.commonMA.meta.MA_META.PAY_NTC_HIS_NO);
	public static final MCMeta ap_d_no_META = createCommonMeta($ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta pay_act_seq_META = createCommonMeta($pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta pay_act_d_no_META = createCommonMeta($pay_act_d_no, mcframe.commonMA.meta.MA_META.PAY_ACT_D_NO);
	public static final MCMeta pay_act_d_seq_META = createCommonMeta($pay_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta adv_pay_act_no_META = createCommonMeta($adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta adv_pay_act_seq_META = createCommonMeta($adv_pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta pay_ntc_d_his_typ_META = createCommonMeta($pay_ntc_d_his_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_D_HIS_TYP);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_rev_META = createCommonMeta($purc_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta act_dt_META = createCommonMeta($act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_typ_META = createCommonMeta($pay_mtd_typ, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP);
	public static final MCMeta base_purc_ac_dt_META = createCommonMeta($base_purc_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_ntc_d_print_rmrks_META = createCommonMeta($pay_ntc_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_NTC_D_PRINT_RMRKS);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_act_dt_META = createCommonMeta($pay_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ap_d_sub_char1_META = createCommonMeta($ap_d_sub_char1, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR1);
	public static final MCMeta ap_d_sub_char2_META = createCommonMeta($ap_d_sub_char2, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR2);
	public static final MCMeta ap_d_sub_char3_META = createCommonMeta($ap_d_sub_char3, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR3);
	public static final MCMeta pay_act_d_sub_char1_META = createCommonMeta($pay_act_d_sub_char1, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR1);
	public static final MCMeta pay_act_d_sub_char2_META = createCommonMeta($pay_act_d_sub_char2, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR2);
	public static final MCMeta pay_act_d_sub_char3_META = createCommonMeta($pay_act_d_sub_char3, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR3);
	public static final MCMeta adv_pay_act_sub_char1_META = createCommonMeta($adv_pay_act_sub_char1, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_SUB_CHAR1);
	public static final MCMeta adv_pay_act_sub_char2_META = createCommonMeta($adv_pay_act_sub_char2, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_SUB_CHAR2);
	public static final MCMeta adv_pay_act_sub_char3_META = createCommonMeta($adv_pay_act_sub_char3, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_PAY_NTC_D_HIS_R> constMetas = new ConstMetaList<MST_PAY_NTC_D_HIS_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			pay_ntc_d_his_no_META,
			pay_ntc_his_no_META,
			ap_d_no_META,
			pay_act_no_META,
			pay_act_seq_META,
			pay_act_d_no_META,
			pay_act_d_seq_META,
			adv_pay_act_no_META,
			adv_pay_act_seq_META,
			pay_ntc_d_his_typ_META,
			po_no_META,
			po_d_no_META,
			purc_act_no_META,
			purc_act_rev_META,
			purc_act_d_no_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			trd_cd_META,
			slip_sts_typ_META,
			sppl_cd_META,
			asppl_cd_META,
			act_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sundry_itm_flg_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			tax_cd_META,
			interim_flg_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			trd_cur_dscnt_amt_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			base_cur_dscnt_amt_META,
			pay_mtd_typ_META,
			base_purc_ac_dt_META,
			pay_ntc_d_print_rmrks_META,
			ap_sttl_cd_META,
			pay_act_dt_META,
			ap_d_sub_char1_META,
			ap_d_sub_char2_META,
			ap_d_sub_char3_META,
			pay_act_d_sub_char1_META,
			pay_act_d_sub_char2_META,
			pay_act_d_sub_char3_META,
			adv_pay_act_sub_char1_META,
			adv_pay_act_sub_char2_META,
			adv_pay_act_sub_char3_META,
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
	protected MST_PAY_NTC_D_HIS_R(ConstMetaList<? extends MST_PAY_NTC_D_HIS_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PAY_NTC_D_HIS_R(ConstMetaList<? extends MST_PAY_NTC_D_HIS_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_ntc_d_his_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$pay_ntc_d_his_no,
				"pay_ntc_d_his_no",
				pay_ntc_d_his_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_ntc_his_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$pay_ntc_his_no,
				"pay_ntc_his_no",
				pay_ntc_his_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$ap_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$ap_d_no,
				"ap_d_no",
				ap_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$pay_act_no,
				"pay_act_no",
				pay_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$pay_act_seq,
				"pay_act_seq",
				pay_act_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$pay_act_d_no,
				"pay_act_d_no",
				pay_act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_act_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$pay_act_d_seq,
				"pay_act_d_seq",
				pay_act_d_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$adv_pay_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$adv_pay_act_no,
				"adv_pay_act_no",
				adv_pay_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$adv_pay_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$adv_pay_act_seq,
				"adv_pay_act_seq",
				adv_pay_act_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_ntc_d_his_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$pay_ntc_d_his_typ,
				"pay_ntc_d_his_typ",
				pay_ntc_d_his_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$po_no,
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
			MST_PAY_NTC_D_HIS_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$po_d_no,
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
			MST_PAY_NTC_D_HIS_R.$purc_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$purc_act_no,
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
			MST_PAY_NTC_D_HIS_R.$purc_act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$purc_act_rev,
				"purc_act_rev",
				purc_act_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$purc_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$purc_act_d_no,
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
			MST_PAY_NTC_D_HIS_R.$bp_dlv_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$bp_dlv_slip_no,
				"bp_dlv_slip_no",
				bp_dlv_slip_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$bp_dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$bp_dlv_slip_d_no,
				"bp_dlv_slip_d_no",
				bp_dlv_slip_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$trd_cd,
				"trd_cd",
				trd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$slip_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$slip_sts_typ,
				"slip_sts_typ",
				slip_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$sppl_cd,
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
			MST_PAY_NTC_D_HIS_R.$asppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$asppl_cd,
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
			MST_PAY_NTC_D_HIS_R.$act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PAY_NTC_D_HIS_R.$act_dt,
				"act_dt",
				act_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$itm_sub1,
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
			MST_PAY_NTC_D_HIS_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$itm_sub2,
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
			MST_PAY_NTC_D_HIS_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$itm_sub3,
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
			MST_PAY_NTC_D_HIS_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$itm_nm,
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
			MST_PAY_NTC_D_HIS_R.$sundry_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PAY_NTC_D_HIS_R.$sundry_itm_flg,
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
			MST_PAY_NTC_D_HIS_R.$sppl_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$sppl_itm_cd,
				"sppl_itm_cd",
				sppl_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$sppl_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$sppl_itm_nm,
				"sppl_itm_nm",
				sppl_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$trd_unit_cd,
				"trd_unit_cd",
				trd_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$trd_unit_qty,
				"trd_unit_qty",
				trd_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$tax_cd,
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
			MST_PAY_NTC_D_HIS_R.$interim_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PAY_NTC_D_HIS_R.$interim_flg,
				"interim_flg",
				interim_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$trd_cur_upri,
				"trd_cur_upri",
				trd_cur_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$trd_cur_amt,
				"trd_cur_amt",
				trd_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$trd_cur_tax_amt,
				"trd_cur_tax_amt",
				trd_cur_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$trd_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$trd_cur_dscnt_amt,
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
			MST_PAY_NTC_D_HIS_R.$base_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$base_cur_upri,
				"base_cur_upri",
				base_cur_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$base_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$base_cur_amt,
				"base_cur_amt",
				base_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$base_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$base_cur_tax_amt,
				"base_cur_tax_amt",
				base_cur_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$base_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$base_cur_dscnt_amt,
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
			MST_PAY_NTC_D_HIS_R.$pay_mtd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$pay_mtd_typ,
				"pay_mtd_typ",
				pay_mtd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$base_purc_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PAY_NTC_D_HIS_R.$base_purc_ac_dt,
				"base_purc_ac_dt",
				base_purc_ac_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_ntc_d_print_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$pay_ntc_d_print_rmrks,
				"pay_ntc_d_print_rmrks",
				pay_ntc_d_print_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$ap_sttl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$ap_sttl_cd,
				"ap_sttl_cd",
				ap_sttl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PAY_NTC_D_HIS_R.$pay_act_dt,
				"pay_act_dt",
				pay_act_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$ap_d_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$ap_d_sub_char1,
				"ap_d_sub_char1",
				ap_d_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$ap_d_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$ap_d_sub_char2,
				"ap_d_sub_char2",
				ap_d_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$ap_d_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$ap_d_sub_char3,
				"ap_d_sub_char3",
				ap_d_sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char1,
				"pay_act_d_sub_char1",
				pay_act_d_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char2,
				"pay_act_d_sub_char2",
				pay_act_d_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char3,
				"pay_act_d_sub_char3",
				pay_act_d_sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$adv_pay_act_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$adv_pay_act_sub_char1,
				"adv_pay_act_sub_char1",
				adv_pay_act_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$adv_pay_act_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$adv_pay_act_sub_char2,
				"adv_pay_act_sub_char2",
				adv_pay_act_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$adv_pay_act_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$adv_pay_act_sub_char3,
				"adv_pay_act_sub_char3",
				adv_pay_act_sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_D_HIS_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$ins_usr_id,
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
			MST_PAY_NTC_D_HIS_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$ins_usr_nm,
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
			MST_PAY_NTC_D_HIS_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PAY_NTC_D_HIS_R.$ins_ts,
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
			MST_PAY_NTC_D_HIS_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$ins_func_id,
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
			MST_PAY_NTC_D_HIS_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_D_HIS_R.$upd_cntr,
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
			MST_PAY_NTC_D_HIS_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$upd_usr_id,
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
			MST_PAY_NTC_D_HIS_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$upd_usr_nm,
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
			MST_PAY_NTC_D_HIS_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PAY_NTC_D_HIS_R.$upd_ts,
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
			MST_PAY_NTC_D_HIS_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$upd_func_id,
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
			MST_PAY_NTC_D_HIS_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_D_HIS_R.$upd_srv_req_no,
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
	public static MST_PAY_NTC_D_HIS_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PAY_NTC_D_HIS_R create(String alias) {
		MST_PAY_NTC_D_HIS_R row = new MST_PAY_NTC_D_HIS_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PAY_NTC_D_HIS_R createByName(T proto) {
		MST_PAY_NTC_D_HIS_R row = MST_PAY_NTC_D_HIS_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_NTC_D_HIS_R clone() {
		return (MST_PAY_NTC_D_HIS_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_NTC_D_HIS_R createInstance() {
		return (MST_PAY_NTC_D_HIS_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_NTC_D_HIS_R getValues(String... names) {
		return (MST_PAY_NTC_D_HIS_R) super.getValues(names);
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
	 public MSW_PAY_NTC_D_HIS_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PAY_NTC_D_HIS_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PAY_NTC_D_HIS_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PAY_NTC_D_HIS_KEY_R.TABLE_NAME);
	 }

	/**
	 * 支払通知書明細履歴ＮＯ. Payment notice details history No..<p>
	 *
	 */
	public String pay_ntc_d_his_no() {
		return getConstString(offset + 0, $pay_ntc_d_his_no);
	}

	/**
	 * 支払通知書明細履歴ＮＯ. Payment notice details history No..<p>
	 *
	 */
	public void pay_ntc_d_his_no(String value) {
		setConstString(offset + 0, $pay_ntc_d_his_no, value);
	}

	/**
	 * 支払通知書履歴ＮＯ. Payment notice history No..<p>
	 *
	 */
	public String pay_ntc_his_no() {
		return getConstString(offset + 1, $pay_ntc_his_no);
	}

	/**
	 * 支払通知書履歴ＮＯ. Payment notice history No..<p>
	 *
	 */
	public void pay_ntc_his_no(String value) {
		setConstString(offset + 1, $pay_ntc_his_no, value);
	}

	/**
	 * 買掛明細ＮＯ. AP details No..<p>
	 *
	 */
	public String ap_d_no() {
		return getConstString(offset + 2, $ap_d_no);
	}

	/**
	 * 買掛明細ＮＯ. AP details No..<p>
	 *
	 */
	public void ap_d_no(String value) {
		setConstString(offset + 2, $ap_d_no, value);
	}

	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 3, $pay_act_no);
	}

	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 3, $pay_act_no, value);
	}

	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public MCNumber pay_act_seq() {
		return getConstNumber(offset + 4, $pay_act_seq);
	}

	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(MCNumber value) {
		setConstNumber(offset + 4, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(int value) {
		setConstNumber(offset + 4, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(long value) {
		setConstNumber(offset + 4, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(float value) {
		setConstNumber(offset + 4, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(double value) {
		setConstNumber(offset + 4, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績明細ＮＯ. Payment result details No..<p>
	 *
	 */
	public String pay_act_d_no() {
		return getConstString(offset + 5, $pay_act_d_no);
	}

	/**
	 * 支払実績明細ＮＯ. Payment result details No..<p>
	 *
	 */
	public void pay_act_d_no(String value) {
		setConstString(offset + 5, $pay_act_d_no, value);
	}

	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public MCNumber pay_act_d_seq() {
		return getConstNumber(offset + 6, $pay_act_d_seq);
	}

	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public void pay_act_d_seq(MCNumber value) {
		setConstNumber(offset + 6, $pay_act_d_seq, value);
	}
	
	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public void pay_act_d_seq(int value) {
		setConstNumber(offset + 6, $pay_act_d_seq, value);
	}
	
	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public void pay_act_d_seq(long value) {
		setConstNumber(offset + 6, $pay_act_d_seq, value);
	}
	
	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public void pay_act_d_seq(float value) {
		setConstNumber(offset + 6, $pay_act_d_seq, value);
	}
	
	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public void pay_act_d_seq(double value) {
		setConstNumber(offset + 6, $pay_act_d_seq, value);
	}
	
	/**
	 * 前渡金実績ＮＯ. Advance payment result No..<p>
	 *
	 */
	public String adv_pay_act_no() {
		return getConstString(offset + 7, $adv_pay_act_no);
	}

	/**
	 * 前渡金実績ＮＯ. Advance payment result No..<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		setConstString(offset + 7, $adv_pay_act_no, value);
	}

	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public MCNumber adv_pay_act_seq() {
		return getConstNumber(offset + 8, $adv_pay_act_seq);
	}

	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(MCNumber value) {
		setConstNumber(offset + 8, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(int value) {
		setConstNumber(offset + 8, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(long value) {
		setConstNumber(offset + 8, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(float value) {
		setConstNumber(offset + 8, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(double value) {
		setConstNumber(offset + 8, $adv_pay_act_seq, value);
	}
	
	/**
	 * 支払通知書明細履歴区分. Payment notice details history type.<p>
	 *
	 */
	public String pay_ntc_d_his_typ() {
		return getConstString(offset + 9, $pay_ntc_d_his_typ);
	}

	/**
	 * 支払通知書明細履歴区分. Payment notice details history type.<p>
	 *
	 */
	public void pay_ntc_d_his_typ(String value) {
		setConstString(offset + 9, $pay_ntc_d_his_typ, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 10, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 10, $po_no, value);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 11, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 11, $po_d_no, value);
	}

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 12, $purc_act_no);
	}

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 12, $purc_act_no, value);
	}

	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public MCNumber purc_act_rev() {
		return getConstNumber(offset + 13, $purc_act_rev);
	}

	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(MCNumber value) {
		setConstNumber(offset + 13, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(int value) {
		setConstNumber(offset + 13, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(long value) {
		setConstNumber(offset + 13, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(float value) {
		setConstNumber(offset + 13, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(double value) {
		setConstNumber(offset + 13, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 14, $purc_act_d_no);
	}

	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 14, $purc_act_d_no, value);
	}

	/**
	 * 業者納品書ＮＯ. Vendor delivery note No..<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 15, $bp_dlv_slip_no);
	}

	/**
	 * 業者納品書ＮＯ. Vendor delivery note No..<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 15, $bp_dlv_slip_no, value);
	}

	/**
	 * 業者納品書明細ＮＯ. Vendor delivery note details No..<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 16, $bp_dlv_slip_d_no);
	}

	/**
	 * 業者納品書明細ＮＯ. Vendor delivery note details No..<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 16, $bp_dlv_slip_d_no, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 17, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 17, $trd_cd, value);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 18, $slip_sts_typ);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 18, $slip_sts_typ, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 19, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 19, $sppl_cd, value);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 20, $asppl_cd);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 20, $asppl_cd, value);
	}

	/**
	 * 実績日. Actual date.<p>
	 *
	 */
	public MCDate act_dt() {
		return getConstDate(offset + 21, $act_dt);
	}

	/**
	 * 実績日. Actual date.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		setConstDate(offset + 21, $act_dt, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 22, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 22, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 23, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 23, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 24, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 24, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 25, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 25, $itm_sub3, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 26, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 26, $itm_nm, value);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 27, $sundry_itm_flg);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 27, $sundry_itm_flg, value);
	}

	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 28, $sppl_itm_cd);
	}

	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 28, $sppl_itm_cd, value);
	}

	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 29, $sppl_itm_nm);
	}

	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 29, $sppl_itm_nm, value);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 30, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 30, $trd_unit_cd, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 31, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 31, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 31, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 31, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 31, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 31, $trd_unit_qty, value);
	}
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 32, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 32, $tax_cd, value);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 33, $interim_flg);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 33, $interim_flg, value);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 34, $trd_cur_upri);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 34, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 34, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 34, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 34, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 34, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 35, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 35, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 35, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 35, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 35, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 35, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 36, $trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 36, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 36, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 36, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 36, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 36, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 37, $trd_cur_dscnt_amt);
	}

	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 37, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 37, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 37, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 37, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 37, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 38, $base_cur_upri);
	}

	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 38, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 38, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 38, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 38, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 38, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 39, $base_cur_amt);
	}

	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 39, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 39, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 39, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 39, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 39, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 40, $base_cur_tax_amt);
	}

	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 40, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 40, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 40, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 40, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 40, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 41, $base_cur_dscnt_amt);
	}

	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 41, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 41, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 41, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 41, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 基準通貨値引額. Discount amount (Base currency).<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 41, $base_cur_dscnt_amt, value);
	}
	
	/**
	 * 支払方式区分. Payment method type.<p>
	 *
	 */
	public String pay_mtd_typ() {
		return getConstString(offset + 42, $pay_mtd_typ);
	}

	/**
	 * 支払方式区分. Payment method type.<p>
	 *
	 */
	public void pay_mtd_typ(String value) {
		setConstString(offset + 42, $pay_mtd_typ, value);
	}

	/**
	 * 仕入計上日（基）. Purchase recording date (Base).<p>
	 *
	 */
	public MCDate base_purc_ac_dt() {
		return getConstDate(offset + 43, $base_purc_ac_dt);
	}

	/**
	 * 仕入計上日（基）. Purchase recording date (Base).<p>
	 *
	 */
	public void base_purc_ac_dt(MCDate value) {
		setConstDate(offset + 43, $base_purc_ac_dt, value);
	}

	/**
	 * 支払通知書明細備考. Payment notice details remarks.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return getConstString(offset + 44, $pay_ntc_d_print_rmrks);
	}

	/**
	 * 支払通知書明細備考. Payment notice details remarks.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		setConstString(offset + 44, $pay_ntc_d_print_rmrks, value);
	}

	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 45, $ap_sttl_cd);
	}

	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 45, $ap_sttl_cd, value);
	}

	/**
	 * 支払実績日. Actual payment date.<p>
	 *
	 */
	public MCDate pay_act_dt() {
		return getConstDate(offset + 46, $pay_act_dt);
	}

	/**
	 * 支払実績日. Actual payment date.<p>
	 *
	 */
	public void pay_act_dt(MCDate value) {
		setConstDate(offset + 46, $pay_act_dt, value);
	}

	/**
	 * 買掛明細予備１. AP details spare 1.<p>
	 *
	 */
	public String ap_d_sub_char1() {
		return getConstString(offset + 47, $ap_d_sub_char1);
	}

	/**
	 * 買掛明細予備１. AP details spare 1.<p>
	 *
	 */
	public void ap_d_sub_char1(String value) {
		setConstString(offset + 47, $ap_d_sub_char1, value);
	}

	/**
	 * 買掛明細予備２. AP details spare 2.<p>
	 *
	 */
	public String ap_d_sub_char2() {
		return getConstString(offset + 48, $ap_d_sub_char2);
	}

	/**
	 * 買掛明細予備２. AP details spare 2.<p>
	 *
	 */
	public void ap_d_sub_char2(String value) {
		setConstString(offset + 48, $ap_d_sub_char2, value);
	}

	/**
	 * 買掛明細予備３. AP details spare 3.<p>
	 *
	 */
	public String ap_d_sub_char3() {
		return getConstString(offset + 49, $ap_d_sub_char3);
	}

	/**
	 * 買掛明細予備３. AP details spare 3.<p>
	 *
	 */
	public void ap_d_sub_char3(String value) {
		setConstString(offset + 49, $ap_d_sub_char3, value);
	}

	/**
	 * 支払実績明細予備１. Payment result details spare 1.<p>
	 *
	 */
	public String pay_act_d_sub_char1() {
		return getConstString(offset + 50, $pay_act_d_sub_char1);
	}

	/**
	 * 支払実績明細予備１. Payment result details spare 1.<p>
	 *
	 */
	public void pay_act_d_sub_char1(String value) {
		setConstString(offset + 50, $pay_act_d_sub_char1, value);
	}

	/**
	 * 支払実績明細予備２. Payment result details spare 2.<p>
	 *
	 */
	public String pay_act_d_sub_char2() {
		return getConstString(offset + 51, $pay_act_d_sub_char2);
	}

	/**
	 * 支払実績明細予備２. Payment result details spare 2.<p>
	 *
	 */
	public void pay_act_d_sub_char2(String value) {
		setConstString(offset + 51, $pay_act_d_sub_char2, value);
	}

	/**
	 * 支払実績明細予備３. Payment result details spare 3.<p>
	 *
	 */
	public String pay_act_d_sub_char3() {
		return getConstString(offset + 52, $pay_act_d_sub_char3);
	}

	/**
	 * 支払実績明細予備３. Payment result details spare 3.<p>
	 *
	 */
	public void pay_act_d_sub_char3(String value) {
		setConstString(offset + 52, $pay_act_d_sub_char3, value);
	}

	/**
	 * 前渡金実績予備１. Advance payment details spare 1.<p>
	 *
	 */
	public String adv_pay_act_sub_char1() {
		return getConstString(offset + 53, $adv_pay_act_sub_char1);
	}

	/**
	 * 前渡金実績予備１. Advance payment details spare 1.<p>
	 *
	 */
	public void adv_pay_act_sub_char1(String value) {
		setConstString(offset + 53, $adv_pay_act_sub_char1, value);
	}

	/**
	 * 前渡金実績予備２. Advance payment details spare 2.<p>
	 *
	 */
	public String adv_pay_act_sub_char2() {
		return getConstString(offset + 54, $adv_pay_act_sub_char2);
	}

	/**
	 * 前渡金実績予備２. Advance payment details spare 2.<p>
	 *
	 */
	public void adv_pay_act_sub_char2(String value) {
		setConstString(offset + 54, $adv_pay_act_sub_char2, value);
	}

	/**
	 * 前渡金実績予備３. Advance payment details spare 3.<p>
	 *
	 */
	public String adv_pay_act_sub_char3() {
		return getConstString(offset + 55, $adv_pay_act_sub_char3);
	}

	/**
	 * 前渡金実績予備３. Advance payment details spare 3.<p>
	 *
	 */
	public void adv_pay_act_sub_char3(String value) {
		setConstString(offset + 55, $adv_pay_act_sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 56, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 56, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 57, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 57, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 58, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 58, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 59, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 59, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 60, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 60, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 60, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 60, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 60, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 60, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 61, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 61, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 62, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 62, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 63, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 63, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 64, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 64, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 65, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 65, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($pay_ntc_d_his_no.equalsIgnoreCase(name)) {
			return pay_ntc_d_his_no();
		}
		if ($pay_ntc_his_no.equalsIgnoreCase(name)) {
			return pay_ntc_his_no();
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($pay_ntc_d_his_typ.equalsIgnoreCase(name)) {
			return pay_ntc_d_his_typ();
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
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
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_d_sub_char1.equalsIgnoreCase(name)) {
			return ap_d_sub_char1();
		}
		if ($ap_d_sub_char2.equalsIgnoreCase(name)) {
			return ap_d_sub_char2();
		}
		if ($ap_d_sub_char3.equalsIgnoreCase(name)) {
			return ap_d_sub_char3();
		}
		if ($pay_act_d_sub_char1.equalsIgnoreCase(name)) {
			return pay_act_d_sub_char1();
		}
		if ($pay_act_d_sub_char2.equalsIgnoreCase(name)) {
			return pay_act_d_sub_char2();
		}
		if ($pay_act_d_sub_char3.equalsIgnoreCase(name)) {
			return pay_act_d_sub_char3();
		}
		if ($adv_pay_act_sub_char1.equalsIgnoreCase(name)) {
			return adv_pay_act_sub_char1();
		}
		if ($adv_pay_act_sub_char2.equalsIgnoreCase(name)) {
			return adv_pay_act_sub_char2();
		}
		if ($adv_pay_act_sub_char3.equalsIgnoreCase(name)) {
			return adv_pay_act_sub_char3();
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
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pay_ntc_d_his_no.equalsIgnoreCase(name)) {
			return pay_ntc_d_his_no();
		}
		if ($pay_ntc_his_no.equalsIgnoreCase(name)) {
			return pay_ntc_his_no();
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($pay_ntc_d_his_typ.equalsIgnoreCase(name)) {
			return pay_ntc_d_his_typ();
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
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
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_d_sub_char1.equalsIgnoreCase(name)) {
			return ap_d_sub_char1();
		}
		if ($ap_d_sub_char2.equalsIgnoreCase(name)) {
			return ap_d_sub_char2();
		}
		if ($ap_d_sub_char3.equalsIgnoreCase(name)) {
			return ap_d_sub_char3();
		}
		if ($pay_act_d_sub_char1.equalsIgnoreCase(name)) {
			return pay_act_d_sub_char1();
		}
		if ($pay_act_d_sub_char2.equalsIgnoreCase(name)) {
			return pay_act_d_sub_char2();
		}
		if ($pay_act_d_sub_char3.equalsIgnoreCase(name)) {
			return pay_act_d_sub_char3();
		}
		if ($adv_pay_act_sub_char1.equalsIgnoreCase(name)) {
			return adv_pay_act_sub_char1();
		}
		if ($adv_pay_act_sub_char2.equalsIgnoreCase(name)) {
			return adv_pay_act_sub_char2();
		}
		if ($adv_pay_act_sub_char3.equalsIgnoreCase(name)) {
			return adv_pay_act_sub_char3();
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
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_ntc_d_his_no.equalsIgnoreCase(name)) {
			pay_ntc_d_his_no(value);
			return;
		}
		if ($pay_ntc_his_no.equalsIgnoreCase(name)) {
			pay_ntc_his_no(value);
			return;
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($pay_ntc_d_his_typ.equalsIgnoreCase(name)) {
			pay_ntc_d_his_typ(value);
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
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
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_d_sub_char1.equalsIgnoreCase(name)) {
			ap_d_sub_char1(value);
			return;
		}
		if ($ap_d_sub_char2.equalsIgnoreCase(name)) {
			ap_d_sub_char2(value);
			return;
		}
		if ($ap_d_sub_char3.equalsIgnoreCase(name)) {
			ap_d_sub_char3(value);
			return;
		}
		if ($pay_act_d_sub_char1.equalsIgnoreCase(name)) {
			pay_act_d_sub_char1(value);
			return;
		}
		if ($pay_act_d_sub_char2.equalsIgnoreCase(name)) {
			pay_act_d_sub_char2(value);
			return;
		}
		if ($pay_act_d_sub_char3.equalsIgnoreCase(name)) {
			pay_act_d_sub_char3(value);
			return;
		}
		if ($adv_pay_act_sub_char1.equalsIgnoreCase(name)) {
			adv_pay_act_sub_char1(value);
			return;
		}
		if ($adv_pay_act_sub_char2.equalsIgnoreCase(name)) {
			adv_pay_act_sub_char2(value);
			return;
		}
		if ($adv_pay_act_sub_char3.equalsIgnoreCase(name)) {
			adv_pay_act_sub_char3(value);
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
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_ntc_d_his_no.equalsIgnoreCase(name)) {
			pay_ntc_d_his_no(value);
			return;
		}
		if ($pay_ntc_his_no.equalsIgnoreCase(name)) {
			pay_ntc_his_no(value);
			return;
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($pay_ntc_d_his_typ.equalsIgnoreCase(name)) {
			pay_ntc_d_his_typ(value);
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
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
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_d_sub_char1.equalsIgnoreCase(name)) {
			ap_d_sub_char1(value);
			return;
		}
		if ($ap_d_sub_char2.equalsIgnoreCase(name)) {
			ap_d_sub_char2(value);
			return;
		}
		if ($ap_d_sub_char3.equalsIgnoreCase(name)) {
			ap_d_sub_char3(value);
			return;
		}
		if ($pay_act_d_sub_char1.equalsIgnoreCase(name)) {
			pay_act_d_sub_char1(value);
			return;
		}
		if ($pay_act_d_sub_char2.equalsIgnoreCase(name)) {
			pay_act_d_sub_char2(value);
			return;
		}
		if ($pay_act_d_sub_char3.equalsIgnoreCase(name)) {
			pay_act_d_sub_char3(value);
			return;
		}
		if ($adv_pay_act_sub_char1.equalsIgnoreCase(name)) {
			adv_pay_act_sub_char1(value);
			return;
		}
		if ($adv_pay_act_sub_char2.equalsIgnoreCase(name)) {
			adv_pay_act_sub_char2(value);
			return;
		}
		if ($adv_pay_act_sub_char3.equalsIgnoreCase(name)) {
			adv_pay_act_sub_char3(value);
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
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
