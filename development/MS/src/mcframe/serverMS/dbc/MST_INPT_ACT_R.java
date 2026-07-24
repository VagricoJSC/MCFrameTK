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
 * "投入実績 // Input result"DBコンテナRowクラスです。<p>
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
 *  	<td>inpt_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入実績ＮＯ</td>
 *  	<td>Input result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
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
 *  	<td>mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造実績ＮＯ</td>
 *  	<td>Mfg. result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程実績ＮＯ</td>
 *  	<td>Operation result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入予定ＮＯ</td>
 *  	<td>Input schedule No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>div_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>分割連番</td>
 *  	<td>Split sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入場所ＣＤ</td>
 *  	<td>Input location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入棚・ラインＣＤ</td>
 *  	<td>Input rack/line cd.</td>
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
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫取引先ＣＤ</td>
 *  	<td>Inventory BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫着荷先ＣＤ</td>
 *  	<td>Inventory arriving point cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>格付ＣＤ</td>
 *  	<td>Grading cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_inpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位投入数量</td>
 *  	<td>Base unit input qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_loss_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位ロス数量</td>
 *  	<td>Base unit loss qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_fxd_loss_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位固定ロス数量</td>
 *  	<td>Base unit constant loss qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入基準単位ＣＤ</td>
 *  	<td>Input base unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>実績日時</td>
 *  	<td>Actual date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bkf_ctl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>バックフラッシュ更新許可ＦＬＧ</td>
 *  	<td>Allow backflush update flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位標準投入数量</td>
 *  	<td>Base unit standard input qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cont_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（投入数量）</td>
 *  	<td>Active ingredient (Input qty.)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cont_loss_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（ロス数量）</td>
 *  	<td>Active ingredient (Loss qty.)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cont_fxd_loss_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（固定ロス数量）</td>
 *  	<td>Active ingredient (Constant loss qty.)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cont_fctr_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分単位ＣＤ</td>
 *  	<td>Active ingredient unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cont_fctr</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際有効成分係数</td>
 *  	<td>Actual active ingredient coefficient</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>acxfr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>他勘定振替数量</td>
 *  	<td>Other accounting transfer qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>acxfr_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>他勘定振替理由ＣＤ</td>
 *  	<td>Other accounting transfer reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>acxfr_bd_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>他勘定振替負担部門ＣＤ</td>
 *  	<td>Other accounting transfer charged dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入理由ＣＤ</td>
 *  	<td>Input reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>add_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>追加ＦＬＧ</td>
 *  	<td>Add flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>データＮＯ</td>
 *  	<td>Data No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mes_id</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＥＳＩＤ</td>
 *  	<td>MES ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mes_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＭＥＳＦＬＧ</td>
 *  	<td>MES flg.</td>
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
 *  	<td>ext_inpt_act_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部投入実績ＮＯ</td>
 *  	<td>External input result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_auto_reg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＩＦ自動作成ＦＬＧ</td>
 *  	<td>IF auto-create flg.</td>
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
 *  	<td>act_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>記録書備考</td>
 *  	<td>Record sheet remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引備考</td>
 *  	<td>Transaction remarks</td>
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
public class MST_INPT_ACT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_INPT_ACT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 投入実績ＮＯ. Input result No..<p>
	 *
	 */
	public static final String $inpt_act_no = "inpt_act_no";
	private static final MCPermColumnInfo _inpt_act_no = createColumnInfo("inpt_act_no");
	public final MCStringPermColumn inpt_act_no = createStringColumn(_inpt_act_no);
	
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
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	private static final MCPermColumnInfo _mfg_act_no = createColumnInfo("mfg_act_no");
	public final MCStringPermColumn mfg_act_no = createStringColumn(_mfg_act_no);
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	private static final MCPermColumnInfo _oper_act_no = createColumnInfo("oper_act_no");
	public final MCStringPermColumn oper_act_no = createStringColumn(_oper_act_no);
	
	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	private static final MCPermColumnInfo _inpt_schd_no = createColumnInfo("inpt_schd_no");
	public final MCStringPermColumn inpt_schd_no = createStringColumn(_inpt_schd_no);
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	private static final MCPermColumnInfo _div_seq = createColumnInfo("div_seq");
	public final MCNumberPermColumn div_seq = createNumberColumn(_div_seq);
	
	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	private static final MCPermColumnInfo _inpt_loc_cd = createColumnInfo("inpt_loc_cd");
	public final MCStringPermColumn inpt_loc_cd = createStringColumn(_inpt_loc_cd);
	
	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	private static final MCPermColumnInfo _inpt_str_ln_cd = createColumnInfo("inpt_str_ln_cd");
	public final MCStringPermColumn inpt_str_ln_cd = createStringColumn(_inpt_str_ln_cd);
	
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
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	private static final MCPermColumnInfo _stk_arrv_bp_cd = createColumnInfo("stk_arrv_bp_cd");
	public final MCStringPermColumn stk_arrv_bp_cd = createStringColumn(_stk_arrv_bp_cd);
	
	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	private static final MCPermColumnInfo _gd_cd = createColumnInfo("gd_cd");
	public final MCStringPermColumn gd_cd = createStringColumn(_gd_cd);
	
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
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	private static final MCPermColumnInfo _sno1 = createColumnInfo("sno1");
	public final MCStringPermColumn sno1 = createStringColumn(_sno1);
	
	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	private static final MCPermColumnInfo _sno2 = createColumnInfo("sno2");
	public final MCStringPermColumn sno2 = createStringColumn(_sno2);
	
	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	private static final MCPermColumnInfo _sno3 = createColumnInfo("sno3");
	public final MCStringPermColumn sno3 = createStringColumn(_sno3);
	
	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	private static final MCPermColumnInfo _sno4 = createColumnInfo("sno4");
	public final MCStringPermColumn sno4 = createStringColumn(_sno4);
	
	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	private static final MCPermColumnInfo _base_unit_inpt_qty = createColumnInfo("base_unit_inpt_qty");
	public final MCNumberPermColumn base_unit_inpt_qty = createNumberColumn(_base_unit_inpt_qty);
	
	/**
	 * 基準単位ロス数量. Base unit loss qty..<p>
	 *
	 */
	public static final String $base_unit_loss_qty = "base_unit_loss_qty";
	private static final MCPermColumnInfo _base_unit_loss_qty = createColumnInfo("base_unit_loss_qty");
	public final MCNumberPermColumn base_unit_loss_qty = createNumberColumn(_base_unit_loss_qty);
	
	/**
	 * 基準単位固定ロス数量. Base unit constant loss qty..<p>
	 *
	 */
	public static final String $base_unit_fxd_loss_qty = "base_unit_fxd_loss_qty";
	private static final MCPermColumnInfo _base_unit_fxd_loss_qty = createColumnInfo("base_unit_fxd_loss_qty");
	public final MCNumberPermColumn base_unit_fxd_loss_qty = createNumberColumn(_base_unit_fxd_loss_qty);
	
	/**
	 * 投入基準単位ＣＤ. Input base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 実績日時. Actual date and time.<p>
	 *
	 */
	public static final String $act_tm = "act_tm";
	private static final MCPermColumnInfo _act_tm = createColumnInfo("act_tm");
	public final MCDatePermColumn act_tm = createDateColumn(_act_tm);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * バックフラッシュ更新許可ＦＬＧ. Allow backflush update flg..<p>
	 *
	 */
	public static final String $bkf_ctl_flg = "bkf_ctl_flg";
	private static final MCPermColumnInfo _bkf_ctl_flg = createColumnInfo("bkf_ctl_flg");
	public final MCBooleanPermColumn bkf_ctl_flg = createBooleanColumn(_bkf_ctl_flg);
	
	/**
	 * 基準単位標準投入数量. Base unit standard input qty..<p>
	 *
	 */
	public static final String $base_unit_std_qty = "base_unit_std_qty";
	private static final MCPermColumnInfo _base_unit_std_qty = createColumnInfo("base_unit_std_qty");
	public final MCNumberPermColumn base_unit_std_qty = createNumberColumn(_base_unit_std_qty);
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	private static final MCPermColumnInfo _cont_qty = createColumnInfo("cont_qty");
	public final MCNumberPermColumn cont_qty = createNumberColumn(_cont_qty);
	
	/**
	 * 有効成分（ロス数量）. Active ingredient (Loss qty.).<p>
	 *
	 */
	public static final String $cont_loss_qty = "cont_loss_qty";
	private static final MCPermColumnInfo _cont_loss_qty = createColumnInfo("cont_loss_qty");
	public final MCNumberPermColumn cont_loss_qty = createNumberColumn(_cont_loss_qty);
	
	/**
	 * 有効成分（固定ロス数量）. Active ingredient (Constant loss qty.).<p>
	 *
	 */
	public static final String $cont_fxd_loss_qty = "cont_fxd_loss_qty";
	private static final MCPermColumnInfo _cont_fxd_loss_qty = createColumnInfo("cont_fxd_loss_qty");
	public final MCNumberPermColumn cont_fxd_loss_qty = createNumberColumn(_cont_fxd_loss_qty);
	
	/**
	 * 有効成分単位ＣＤ. Active ingredient unit cd..<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	private static final MCPermColumnInfo _cont_fctr_unit_cd = createColumnInfo("cont_fctr_unit_cd");
	public final MCStringPermColumn cont_fctr_unit_cd = createStringColumn(_cont_fctr_unit_cd);
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	private static final MCPermColumnInfo _act_cont_fctr = createColumnInfo("act_cont_fctr");
	public final MCNumberPermColumn act_cont_fctr = createNumberColumn(_act_cont_fctr);
	
	/**
	 * 他勘定振替数量. Other accounting transfer qty..<p>
	 *
	 */
	public static final String $acxfr_qty = "acxfr_qty";
	private static final MCPermColumnInfo _acxfr_qty = createColumnInfo("acxfr_qty");
	public final MCNumberPermColumn acxfr_qty = createNumberColumn(_acxfr_qty);
	
	/**
	 * 他勘定振替理由ＣＤ. Other accounting transfer reason cd..<p>
	 *
	 */
	public static final String $acxfr_rsn_cd = "acxfr_rsn_cd";
	private static final MCPermColumnInfo _acxfr_rsn_cd = createColumnInfo("acxfr_rsn_cd");
	public final MCStringPermColumn acxfr_rsn_cd = createStringColumn(_acxfr_rsn_cd);
	
	/**
	 * 他勘定振替負担部門ＣＤ. Other accounting transfer charged dept. cd..<p>
	 *
	 */
	public static final String $acxfr_bd_dpt_cd = "acxfr_bd_dpt_cd";
	private static final MCPermColumnInfo _acxfr_bd_dpt_cd = createColumnInfo("acxfr_bd_dpt_cd");
	public final MCStringPermColumn acxfr_bd_dpt_cd = createStringColumn(_acxfr_bd_dpt_cd);
	
	/**
	 * 投入理由ＣＤ. Input reason cd..<p>
	 *
	 */
	public static final String $inpt_rsn_cd = "inpt_rsn_cd";
	private static final MCPermColumnInfo _inpt_rsn_cd = createColumnInfo("inpt_rsn_cd");
	public final MCStringPermColumn inpt_rsn_cd = createStringColumn(_inpt_rsn_cd);
	
	/**
	 * 追加ＦＬＧ. Add flg..<p>
	 *
	 */
	public static final String $add_flg = "add_flg";
	private static final MCPermColumnInfo _add_flg = createColumnInfo("add_flg");
	public final MCBooleanPermColumn add_flg = createBooleanColumn(_add_flg);
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public static final String $data_no = "data_no";
	private static final MCPermColumnInfo _data_no = createColumnInfo("data_no");
	public final MCNumberPermColumn data_no = createNumberColumn(_data_no);
	
	/**
	 * ＭＥＳＩＤ. MES ID.<p>
	 *
	 */
	public static final String $mes_id = "mes_id";
	private static final MCPermColumnInfo _mes_id = createColumnInfo("mes_id");
	public final MCStringPermColumn mes_id = createStringColumn(_mes_id);
	
	/**
	 * ＭＥＳＦＬＧ. MES flg..<p>
	 *
	 */
	public static final String $mes_flg = "mes_flg";
	private static final MCPermColumnInfo _mes_flg = createColumnInfo("mes_flg");
	public final MCBooleanPermColumn mes_flg = createBooleanColumn(_mes_flg);
	
	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	private static final MCPermColumnInfo _ext_sys_cd = createColumnInfo("ext_sys_cd");
	public final MCStringPermColumn ext_sys_cd = createStringColumn(_ext_sys_cd);
	
	/**
	 * 外部投入実績ＮＯ. External input result No..<p>
	 *
	 */
	public static final String $ext_inpt_act_no = "ext_inpt_act_no";
	private static final MCPermColumnInfo _ext_inpt_act_no = createColumnInfo("ext_inpt_act_no");
	public final MCStringPermColumn ext_inpt_act_no = createStringColumn(_ext_inpt_act_no);
	
	/**
	 * ＩＦ自動作成ＦＬＧ. IF auto-create flg..<p>
	 *
	 */
	public static final String $if_auto_reg_flg = "if_auto_reg_flg";
	private static final MCPermColumnInfo _if_auto_reg_flg = createColumnInfo("if_auto_reg_flg");
	public final MCBooleanPermColumn if_auto_reg_flg = createBooleanColumn(_if_auto_reg_flg);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 記録書備考. Record sheet remarks.<p>
	 *
	 */
	public static final String $act_rpt_rmrks = "act_rpt_rmrks";
	private static final MCPermColumnInfo _act_rpt_rmrks = createColumnInfo("act_rpt_rmrks");
	public final MCStringPermColumn act_rpt_rmrks = createStringColumn(_act_rpt_rmrks);
	
	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	private static final MCPermColumnInfo _trd_rmrks = createColumnInfo("trd_rmrks");
	public final MCStringPermColumn trd_rmrks = createStringColumn(_trd_rmrks);
	
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
	
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_loss_qty_META = createCommonMeta($base_unit_loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_loss_qty_META = createCommonMeta($base_unit_fxd_loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta act_tm_META = createCommonMeta($act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bkf_ctl_flg_META = createCommonMeta($bkf_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_std_qty_META = createCommonMeta($base_unit_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_loss_qty_META = createCommonMeta($cont_loss_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_loss_qty_META = createCommonMeta($cont_fxd_loss_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta acxfr_qty_META = createCommonMeta($acxfr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta acxfr_rsn_cd_META = createCommonMeta($acxfr_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta acxfr_bd_dpt_cd_META = createCommonMeta($acxfr_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inpt_rsn_cd_META = createCommonMeta($inpt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta add_flg_META = createCommonMeta($add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta mes_id_META = createCommonMeta($mes_id, mcframe.commonMS.meta.MS_META.MES_ID);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_inpt_act_no_META = createCommonMeta($ext_inpt_act_no, mcframe.commonMA.meta.MA_META.EXT_INPT_ACT_NO);
	public static final MCMeta if_auto_reg_flg_META = createCommonMeta($if_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_INTR_RMRKS);
	public static final MCMeta act_rpt_rmrks_META = createCommonMeta($act_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_RPT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR3);
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
	public static final String $MFG_ACT1 = "MFG_ACT1";
	public static final String $ITM_MFG_INST1 = "ITM_MFG_INST1";
	public static final String $OPER_ACT1 = "OPER_ACT1";
	public static final String $INPT_SCHD1 = "INPT_SCHD1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_MFG_ACT",
				$MFG_ACT1,
				new String[][]{
						{"mfg_act_no", "mfg_act_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_MFG_ACT_R.create("MFG_ACT1");
				},
				(alias) -> {
					MST_INPT_ACT_R own = MST_INPT_ACT_R.create(alias);
					mcframe.serverMS.dbc.MST_MFG_ACT_R ref = mcframe.serverMS.dbc.MST_MFG_ACT_R.create("MFG_ACT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.mfg_act_no.eq(ref.mfg_act_no));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_ITM_MFG_INST",
				$ITM_MFG_INST1,
				new String[][]{
						{"itm_mfg_inst_no", "itm_mfg_inst_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_ITM_MFG_INST_R.create("ITM_MFG_INST1");
				},
				(alias) -> {
					MST_INPT_ACT_R own = MST_INPT_ACT_R.create(alias);
					mcframe.serverMS.dbc.MST_ITM_MFG_INST_R ref = mcframe.serverMS.dbc.MST_ITM_MFG_INST_R.create("ITM_MFG_INST1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_mfg_inst_no.eq(ref.itm_mfg_inst_no));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_OPER_ACT",
				$OPER_ACT1,
				new String[][]{
						{"oper_act_no", "oper_act_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_OPER_ACT_R.create("OPER_ACT1");
				},
				(alias) -> {
					MST_INPT_ACT_R own = MST_INPT_ACT_R.create(alias);
					mcframe.serverMS.dbc.MST_OPER_ACT_R ref = mcframe.serverMS.dbc.MST_OPER_ACT_R.create("OPER_ACT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.oper_act_no.eq(ref.oper_act_no));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_INPT_SCHD",
				$INPT_SCHD1,
				new String[][]{
						{"inpt_schd_no", "inpt_schd_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_INPT_SCHD_R.create("INPT_SCHD1");
				},
				(alias) -> {
					MST_INPT_ACT_R own = MST_INPT_ACT_R.create(alias);
					mcframe.serverMS.dbc.MST_INPT_SCHD_R ref = mcframe.serverMS.dbc.MST_INPT_SCHD_R.create("INPT_SCHD1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.inpt_schd_no.eq(ref.inpt_schd_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_INPT_ACT_R> constMetas = new ConstMetaList<MST_INPT_ACT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			inpt_act_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			mfg_act_no_META,
			itm_mfg_inst_no_META,
			oper_act_no_META,
			inpt_schd_no_META,
			div_seq_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			quality_typ_META,
			stk_insp_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			stk_arrv_bp_cd_META,
			gd_cd_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			base_unit_inpt_qty_META,
			base_unit_loss_qty_META,
			base_unit_fxd_loss_qty_META,
			base_unit_cd_META,
			act_tm_META,
			ac_dt_META,
			bkf_ctl_flg_META,
			base_unit_std_qty_META,
			cont_qty_META,
			cont_loss_qty_META,
			cont_fxd_loss_qty_META,
			cont_fctr_unit_cd_META,
			act_cont_fctr_META,
			acxfr_qty_META,
			acxfr_rsn_cd_META,
			acxfr_bd_dpt_cd_META,
			inpt_rsn_cd_META,
			add_flg_META,
			data_no_META,
			mes_id_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_inpt_act_no_META,
			if_auto_reg_flg_META,
			intr_rmrks_META,
			act_rpt_rmrks_META,
			trd_rmrks_META,
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
	protected MST_INPT_ACT_R(ConstMetaList<? extends MST_INPT_ACT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_INPT_ACT_R(ConstMetaList<? extends MST_INPT_ACT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$inpt_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$inpt_act_no,
				"inpt_act_no",
				inpt_act_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$itm_cd,
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
			MST_INPT_ACT_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$itm_sub1,
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
			MST_INPT_ACT_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$itm_sub2,
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
			MST_INPT_ACT_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$itm_sub3,
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
			MST_INPT_ACT_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$ver_no,
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
			MST_INPT_ACT_R.$mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$mfg_act_no,
				"mfg_act_no",
				mfg_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$itm_mfg_inst_no,
				"itm_mfg_inst_no",
				itm_mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$oper_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$oper_act_no,
				"oper_act_no",
				oper_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$inpt_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$inpt_schd_no,
				"inpt_schd_no",
				inpt_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$div_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$div_seq,
				"div_seq",
				div_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$inpt_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$inpt_loc_cd,
				"inpt_loc_cd",
				inpt_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$inpt_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$inpt_str_ln_cd,
				"inpt_str_ln_cd",
				inpt_str_ln_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$quality_typ,
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
			MST_INPT_ACT_R.$stk_insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$stk_insp_typ,
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
			MST_INPT_ACT_R.$stk_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$stk_id_typ,
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
			MST_INPT_ACT_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$stk_bp_cd,
				"stk_bp_cd",
				stk_bp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$stk_arrv_bp_cd,
				"stk_arrv_bp_cd",
				stk_arrv_bp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$gd_cd,
				"gd_cd",
				gd_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$lot_no,
				"lot_no",
				lot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$sublot_no,
				"sublot_no",
				sublot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$sno1,
				"sno1",
				sno1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$sno2,
				"sno2",
				sno2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$sno3,
				"sno3",
				sno3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$sno4,
				"sno4",
				sno4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$base_unit_inpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$base_unit_inpt_qty,
				"base_unit_inpt_qty",
				base_unit_inpt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$base_unit_loss_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$base_unit_loss_qty,
				"base_unit_loss_qty",
				base_unit_loss_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$base_unit_fxd_loss_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$base_unit_fxd_loss_qty,
				"base_unit_fxd_loss_qty",
				base_unit_fxd_loss_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$base_unit_cd,
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
			MST_INPT_ACT_R.$act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INPT_ACT_R.$act_tm,
				"act_tm",
				act_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INPT_ACT_R.$ac_dt,
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
			MST_INPT_ACT_R.$bkf_ctl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_ACT_R.$bkf_ctl_flg,
				"bkf_ctl_flg",
				bkf_ctl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$base_unit_std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$base_unit_std_qty,
				"base_unit_std_qty",
				base_unit_std_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$cont_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$cont_qty,
				"cont_qty",
				cont_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$cont_loss_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$cont_loss_qty,
				"cont_loss_qty",
				cont_loss_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$cont_fxd_loss_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$cont_fxd_loss_qty,
				"cont_fxd_loss_qty",
				cont_fxd_loss_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$cont_fctr_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$cont_fctr_unit_cd,
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
			MST_INPT_ACT_R.$act_cont_fctr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$act_cont_fctr,
				"act_cont_fctr",
				act_cont_fctr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$acxfr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$acxfr_qty,
				"acxfr_qty",
				acxfr_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$acxfr_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$acxfr_rsn_cd,
				"acxfr_rsn_cd",
				acxfr_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$acxfr_bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$acxfr_bd_dpt_cd,
				"acxfr_bd_dpt_cd",
				acxfr_bd_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$inpt_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$inpt_rsn_cd,
				"inpt_rsn_cd",
				inpt_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$add_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_ACT_R.$add_flg,
				"add_flg",
				add_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$data_no,
				"data_no",
				data_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$mes_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$mes_id,
				"mes_id",
				mes_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$mes_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_ACT_R.$mes_flg,
				"mes_flg",
				mes_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$ext_sys_cd,
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
			MST_INPT_ACT_R.$ext_inpt_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$ext_inpt_act_no,
				"ext_inpt_act_no",
				ext_inpt_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$if_auto_reg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INPT_ACT_R.$if_auto_reg_flg,
				"if_auto_reg_flg",
				if_auto_reg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$intr_rmrks,
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
			MST_INPT_ACT_R.$act_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$act_rpt_rmrks,
				"act_rpt_rmrks",
				act_rpt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$trd_rmrks,
				"trd_rmrks",
				trd_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INPT_ACT_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$sub_char1,
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
			MST_INPT_ACT_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$sub_char2,
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
			MST_INPT_ACT_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$sub_char3,
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
			MST_INPT_ACT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$ins_usr_id,
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
			MST_INPT_ACT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$ins_usr_nm,
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
			MST_INPT_ACT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INPT_ACT_R.$ins_ts,
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
			MST_INPT_ACT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$ins_func_id,
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
			MST_INPT_ACT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INPT_ACT_R.$upd_cntr,
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
			MST_INPT_ACT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$upd_usr_id,
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
			MST_INPT_ACT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$upd_usr_nm,
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
			MST_INPT_ACT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INPT_ACT_R.$upd_ts,
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
			MST_INPT_ACT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$upd_func_id,
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
			MST_INPT_ACT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INPT_ACT_R.$upd_srv_req_no,
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
	public static MST_INPT_ACT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_INPT_ACT_R create(String alias) {
		MST_INPT_ACT_R row = new MST_INPT_ACT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_INPT_ACT_R createByName(T proto) {
		MST_INPT_ACT_R row = MST_INPT_ACT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INPT_ACT_R clone() {
		return (MST_INPT_ACT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INPT_ACT_R createInstance() {
		return (MST_INPT_ACT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INPT_ACT_R getValues(String... names) {
		return (MST_INPT_ACT_R) super.getValues(names);
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
	 public MSW_INPT_ACT_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_INPT_ACT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_INPT_ACT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_INPT_ACT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 投入実績ＮＯ. Input result No..<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 0, $inpt_act_no);
	}

	/**
	 * 投入実績ＮＯ. Input result No..<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 0, $inpt_act_no, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 5, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 5, $ver_no, value);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 6, $mfg_act_no);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 6, $mfg_act_no, value);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 7, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 7, $itm_mfg_inst_no, value);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 8, $oper_act_no);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 8, $oper_act_no, value);
	}

	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 9, $inpt_schd_no);
	}

	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 9, $inpt_schd_no, value);
	}

	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 10, $div_seq);
	}

	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 10, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 10, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 10, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 10, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 10, $div_seq, value);
	}
	
	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 11, $inpt_loc_cd);
	}

	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 11, $inpt_loc_cd, value);
	}

	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 12, $inpt_str_ln_cd);
	}

	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 12, $inpt_str_ln_cd, value);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 13, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 13, $quality_typ, value);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 14, $stk_insp_typ);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 14, $stk_insp_typ, value);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 15, $stk_id_typ);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 15, $stk_id_typ, value);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 16, $stk_bp_cd);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 16, $stk_bp_cd, value);
	}

	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 17, $stk_arrv_bp_cd);
	}

	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 17, $stk_arrv_bp_cd, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 18, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 18, $gd_cd, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 19, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 19, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 20, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 20, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 21, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 21, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 22, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 22, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 23, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 23, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 24, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 24, $sno4, value);
	}

	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 25, $base_unit_inpt_qty);
	}

	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 25, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 25, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 25, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 25, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入数量. Base unit input qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 25, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位ロス数量. Base unit loss qty..<p>
	 *
	 */
	public MCNumber base_unit_loss_qty() {
		return getConstNumber(offset + 26, $base_unit_loss_qty);
	}

	/**
	 * 基準単位ロス数量. Base unit loss qty..<p>
	 *
	 */
	public void base_unit_loss_qty(MCNumber value) {
		setConstNumber(offset + 26, $base_unit_loss_qty, value);
	}
	
	/**
	 * 基準単位ロス数量. Base unit loss qty..<p>
	 *
	 */
	public void base_unit_loss_qty(int value) {
		setConstNumber(offset + 26, $base_unit_loss_qty, value);
	}
	
	/**
	 * 基準単位ロス数量. Base unit loss qty..<p>
	 *
	 */
	public void base_unit_loss_qty(long value) {
		setConstNumber(offset + 26, $base_unit_loss_qty, value);
	}
	
	/**
	 * 基準単位ロス数量. Base unit loss qty..<p>
	 *
	 */
	public void base_unit_loss_qty(float value) {
		setConstNumber(offset + 26, $base_unit_loss_qty, value);
	}
	
	/**
	 * 基準単位ロス数量. Base unit loss qty..<p>
	 *
	 */
	public void base_unit_loss_qty(double value) {
		setConstNumber(offset + 26, $base_unit_loss_qty, value);
	}
	
	/**
	 * 基準単位固定ロス数量. Base unit constant loss qty..<p>
	 *
	 */
	public MCNumber base_unit_fxd_loss_qty() {
		return getConstNumber(offset + 27, $base_unit_fxd_loss_qty);
	}

	/**
	 * 基準単位固定ロス数量. Base unit constant loss qty..<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(MCNumber value) {
		setConstNumber(offset + 27, $base_unit_fxd_loss_qty, value);
	}
	
	/**
	 * 基準単位固定ロス数量. Base unit constant loss qty..<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(int value) {
		setConstNumber(offset + 27, $base_unit_fxd_loss_qty, value);
	}
	
	/**
	 * 基準単位固定ロス数量. Base unit constant loss qty..<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(long value) {
		setConstNumber(offset + 27, $base_unit_fxd_loss_qty, value);
	}
	
	/**
	 * 基準単位固定ロス数量. Base unit constant loss qty..<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(float value) {
		setConstNumber(offset + 27, $base_unit_fxd_loss_qty, value);
	}
	
	/**
	 * 基準単位固定ロス数量. Base unit constant loss qty..<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(double value) {
		setConstNumber(offset + 27, $base_unit_fxd_loss_qty, value);
	}
	
	/**
	 * 投入基準単位ＣＤ. Input base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 28, $base_unit_cd);
	}

	/**
	 * 投入基準単位ＣＤ. Input base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 28, $base_unit_cd, value);
	}

	/**
	 * 実績日時. Actual date and time.<p>
	 *
	 */
	public MCDate act_tm() {
		return getConstDate(offset + 29, $act_tm);
	}

	/**
	 * 実績日時. Actual date and time.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		setConstDate(offset + 29, $act_tm, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 30, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 30, $ac_dt, value);
	}

	/**
	 * バックフラッシュ更新許可ＦＬＧ. Allow backflush update flg..<p>
	 *
	 */
	public boolean bkf_ctl_flg() {
		return getConstBoolean(offset + 31, $bkf_ctl_flg);
	}

	/**
	 * バックフラッシュ更新許可ＦＬＧ. Allow backflush update flg..<p>
	 *
	 */
	public void bkf_ctl_flg(boolean value) {
		setConstBoolean(offset + 31, $bkf_ctl_flg, value);
	}

	/**
	 * 基準単位標準投入数量. Base unit standard input qty..<p>
	 *
	 */
	public MCNumber base_unit_std_qty() {
		return getConstNumber(offset + 32, $base_unit_std_qty);
	}

	/**
	 * 基準単位標準投入数量. Base unit standard input qty..<p>
	 *
	 */
	public void base_unit_std_qty(MCNumber value) {
		setConstNumber(offset + 32, $base_unit_std_qty, value);
	}
	
	/**
	 * 基準単位標準投入数量. Base unit standard input qty..<p>
	 *
	 */
	public void base_unit_std_qty(int value) {
		setConstNumber(offset + 32, $base_unit_std_qty, value);
	}
	
	/**
	 * 基準単位標準投入数量. Base unit standard input qty..<p>
	 *
	 */
	public void base_unit_std_qty(long value) {
		setConstNumber(offset + 32, $base_unit_std_qty, value);
	}
	
	/**
	 * 基準単位標準投入数量. Base unit standard input qty..<p>
	 *
	 */
	public void base_unit_std_qty(float value) {
		setConstNumber(offset + 32, $base_unit_std_qty, value);
	}
	
	/**
	 * 基準単位標準投入数量. Base unit standard input qty..<p>
	 *
	 */
	public void base_unit_std_qty(double value) {
		setConstNumber(offset + 32, $base_unit_std_qty, value);
	}
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 33, $cont_qty);
	}

	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 33, $cont_qty, value);
	}
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 33, $cont_qty, value);
	}
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 33, $cont_qty, value);
	}
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 33, $cont_qty, value);
	}
	
	/**
	 * 有効成分（投入数量）. Active ingredient (Input qty.).<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 33, $cont_qty, value);
	}
	
	/**
	 * 有効成分（ロス数量）. Active ingredient (Loss qty.).<p>
	 *
	 */
	public MCNumber cont_loss_qty() {
		return getConstNumber(offset + 34, $cont_loss_qty);
	}

	/**
	 * 有効成分（ロス数量）. Active ingredient (Loss qty.).<p>
	 *
	 */
	public void cont_loss_qty(MCNumber value) {
		setConstNumber(offset + 34, $cont_loss_qty, value);
	}
	
	/**
	 * 有効成分（ロス数量）. Active ingredient (Loss qty.).<p>
	 *
	 */
	public void cont_loss_qty(int value) {
		setConstNumber(offset + 34, $cont_loss_qty, value);
	}
	
	/**
	 * 有効成分（ロス数量）. Active ingredient (Loss qty.).<p>
	 *
	 */
	public void cont_loss_qty(long value) {
		setConstNumber(offset + 34, $cont_loss_qty, value);
	}
	
	/**
	 * 有効成分（ロス数量）. Active ingredient (Loss qty.).<p>
	 *
	 */
	public void cont_loss_qty(float value) {
		setConstNumber(offset + 34, $cont_loss_qty, value);
	}
	
	/**
	 * 有効成分（ロス数量）. Active ingredient (Loss qty.).<p>
	 *
	 */
	public void cont_loss_qty(double value) {
		setConstNumber(offset + 34, $cont_loss_qty, value);
	}
	
	/**
	 * 有効成分（固定ロス数量）. Active ingredient (Constant loss qty.).<p>
	 *
	 */
	public MCNumber cont_fxd_loss_qty() {
		return getConstNumber(offset + 35, $cont_fxd_loss_qty);
	}

	/**
	 * 有効成分（固定ロス数量）. Active ingredient (Constant loss qty.).<p>
	 *
	 */
	public void cont_fxd_loss_qty(MCNumber value) {
		setConstNumber(offset + 35, $cont_fxd_loss_qty, value);
	}
	
	/**
	 * 有効成分（固定ロス数量）. Active ingredient (Constant loss qty.).<p>
	 *
	 */
	public void cont_fxd_loss_qty(int value) {
		setConstNumber(offset + 35, $cont_fxd_loss_qty, value);
	}
	
	/**
	 * 有効成分（固定ロス数量）. Active ingredient (Constant loss qty.).<p>
	 *
	 */
	public void cont_fxd_loss_qty(long value) {
		setConstNumber(offset + 35, $cont_fxd_loss_qty, value);
	}
	
	/**
	 * 有効成分（固定ロス数量）. Active ingredient (Constant loss qty.).<p>
	 *
	 */
	public void cont_fxd_loss_qty(float value) {
		setConstNumber(offset + 35, $cont_fxd_loss_qty, value);
	}
	
	/**
	 * 有効成分（固定ロス数量）. Active ingredient (Constant loss qty.).<p>
	 *
	 */
	public void cont_fxd_loss_qty(double value) {
		setConstNumber(offset + 35, $cont_fxd_loss_qty, value);
	}
	
	/**
	 * 有効成分単位ＣＤ. Active ingredient unit cd..<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 36, $cont_fctr_unit_cd);
	}

	/**
	 * 有効成分単位ＣＤ. Active ingredient unit cd..<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 36, $cont_fctr_unit_cd, value);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 37, $act_cont_fctr);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 37, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 37, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 37, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 37, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 37, $act_cont_fctr, value);
	}
	
	/**
	 * 他勘定振替数量. Other accounting transfer qty..<p>
	 *
	 */
	public MCNumber acxfr_qty() {
		return getConstNumber(offset + 38, $acxfr_qty);
	}

	/**
	 * 他勘定振替数量. Other accounting transfer qty..<p>
	 *
	 */
	public void acxfr_qty(MCNumber value) {
		setConstNumber(offset + 38, $acxfr_qty, value);
	}
	
	/**
	 * 他勘定振替数量. Other accounting transfer qty..<p>
	 *
	 */
	public void acxfr_qty(int value) {
		setConstNumber(offset + 38, $acxfr_qty, value);
	}
	
	/**
	 * 他勘定振替数量. Other accounting transfer qty..<p>
	 *
	 */
	public void acxfr_qty(long value) {
		setConstNumber(offset + 38, $acxfr_qty, value);
	}
	
	/**
	 * 他勘定振替数量. Other accounting transfer qty..<p>
	 *
	 */
	public void acxfr_qty(float value) {
		setConstNumber(offset + 38, $acxfr_qty, value);
	}
	
	/**
	 * 他勘定振替数量. Other accounting transfer qty..<p>
	 *
	 */
	public void acxfr_qty(double value) {
		setConstNumber(offset + 38, $acxfr_qty, value);
	}
	
	/**
	 * 他勘定振替理由ＣＤ. Other accounting transfer reason cd..<p>
	 *
	 */
	public String acxfr_rsn_cd() {
		return getConstString(offset + 39, $acxfr_rsn_cd);
	}

	/**
	 * 他勘定振替理由ＣＤ. Other accounting transfer reason cd..<p>
	 *
	 */
	public void acxfr_rsn_cd(String value) {
		setConstString(offset + 39, $acxfr_rsn_cd, value);
	}

	/**
	 * 他勘定振替負担部門ＣＤ. Other accounting transfer charged dept. cd..<p>
	 *
	 */
	public String acxfr_bd_dpt_cd() {
		return getConstString(offset + 40, $acxfr_bd_dpt_cd);
	}

	/**
	 * 他勘定振替負担部門ＣＤ. Other accounting transfer charged dept. cd..<p>
	 *
	 */
	public void acxfr_bd_dpt_cd(String value) {
		setConstString(offset + 40, $acxfr_bd_dpt_cd, value);
	}

	/**
	 * 投入理由ＣＤ. Input reason cd..<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return getConstString(offset + 41, $inpt_rsn_cd);
	}

	/**
	 * 投入理由ＣＤ. Input reason cd..<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		setConstString(offset + 41, $inpt_rsn_cd, value);
	}

	/**
	 * 追加ＦＬＧ. Add flg..<p>
	 *
	 */
	public boolean add_flg() {
		return getConstBoolean(offset + 42, $add_flg);
	}

	/**
	 * 追加ＦＬＧ. Add flg..<p>
	 *
	 */
	public void add_flg(boolean value) {
		setConstBoolean(offset + 42, $add_flg, value);
	}

	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 43, $data_no);
	}

	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 43, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 43, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 43, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 43, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 43, $data_no, value);
	}
	
	/**
	 * ＭＥＳＩＤ. MES ID.<p>
	 *
	 */
	public String mes_id() {
		return getConstString(offset + 44, $mes_id);
	}

	/**
	 * ＭＥＳＩＤ. MES ID.<p>
	 *
	 */
	public void mes_id(String value) {
		setConstString(offset + 44, $mes_id, value);
	}

	/**
	 * ＭＥＳＦＬＧ. MES flg..<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 45, $mes_flg);
	}

	/**
	 * ＭＥＳＦＬＧ. MES flg..<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 45, $mes_flg, value);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 46, $ext_sys_cd);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 46, $ext_sys_cd, value);
	}

	/**
	 * 外部投入実績ＮＯ. External input result No..<p>
	 *
	 */
	public String ext_inpt_act_no() {
		return getConstString(offset + 47, $ext_inpt_act_no);
	}

	/**
	 * 外部投入実績ＮＯ. External input result No..<p>
	 *
	 */
	public void ext_inpt_act_no(String value) {
		setConstString(offset + 47, $ext_inpt_act_no, value);
	}

	/**
	 * ＩＦ自動作成ＦＬＧ. IF auto-create flg..<p>
	 *
	 */
	public boolean if_auto_reg_flg() {
		return getConstBoolean(offset + 48, $if_auto_reg_flg);
	}

	/**
	 * ＩＦ自動作成ＦＬＧ. IF auto-create flg..<p>
	 *
	 */
	public void if_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 48, $if_auto_reg_flg, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 49, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 49, $intr_rmrks, value);
	}

	/**
	 * 記録書備考. Record sheet remarks.<p>
	 *
	 */
	public String act_rpt_rmrks() {
		return getConstString(offset + 50, $act_rpt_rmrks);
	}

	/**
	 * 記録書備考. Record sheet remarks.<p>
	 *
	 */
	public void act_rpt_rmrks(String value) {
		setConstString(offset + 50, $act_rpt_rmrks, value);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 51, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 51, $trd_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 52, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 52, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 53, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 53, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 54, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 54, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 55, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 55, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 56, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 56, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 57, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 57, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 58, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 58, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 59, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 60, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 60, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 61, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 61, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 62, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 62, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 63, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 63, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 64, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 64, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($acxfr_rsn_cd.equalsIgnoreCase(name)) {
			return acxfr_rsn_cd();
		}
		if ($acxfr_bd_dpt_cd.equalsIgnoreCase(name)) {
			return acxfr_bd_dpt_cd();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			return act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_loss_qty();
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_loss_qty();
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			return base_unit_std_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			return cont_loss_qty();
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return cont_fxd_loss_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			return acxfr_qty();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
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
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			return bkf_ctl_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($acxfr_rsn_cd.equalsIgnoreCase(name)) {
			return acxfr_rsn_cd();
		}
		if ($acxfr_bd_dpt_cd.equalsIgnoreCase(name)) {
			return acxfr_bd_dpt_cd();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			return act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_loss_qty();
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_loss_qty();
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			return base_unit_std_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			return cont_loss_qty();
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return cont_fxd_loss_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			return acxfr_qty();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
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
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			return bkf_ctl_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($acxfr_rsn_cd.equalsIgnoreCase(name)) {
			acxfr_rsn_cd(value);
			return;
		}
		if ($acxfr_bd_dpt_cd.equalsIgnoreCase(name)) {
			acxfr_bd_dpt_cd(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
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
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			bkf_ctl_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			if_auto_reg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($acxfr_rsn_cd.equalsIgnoreCase(name)) {
			acxfr_rsn_cd(value);
			return;
		}
		if ($acxfr_bd_dpt_cd.equalsIgnoreCase(name)) {
			acxfr_bd_dpt_cd(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
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
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			bkf_ctl_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			if_auto_reg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
