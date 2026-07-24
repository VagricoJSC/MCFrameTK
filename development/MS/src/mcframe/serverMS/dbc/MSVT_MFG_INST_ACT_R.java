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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "製造指図・実績ビュー // Mfg. order/results view"DBコンテナRowクラスです。<p>
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
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>div_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>分割連番</td>
 *  	<td>Split sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_mfg_inst_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）製造指図改訂番号</td>
 *  	<td>(Mfg. order) Mfg. order rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）品目製造指図ＮＯ</td>
 *  	<td>(Mfg. order) Item mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_po_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）発注明細ＮＯ</td>
 *  	<td>(Mfg. order) PO details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_base_unit_yield_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）基準単位出来高予定数量</td>
 *  	<td>(Mfg. order) Base unit output scheduled qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_base_unit_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）基準単位製造指図数量</td>
 *  	<td>(Mfg. order) Base unit mfg. order qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）基準単位ＣＤ</td>
 *  	<td>(Mfg. order) Base unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）着手予定日時</td>
 *  	<td>(Mfg. order) Scheduled start date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）終了予定日時</td>
 *  	<td>(Mfg. order) Scheduled end date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_rqst_dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）納入希望日時</td>
 *  	<td>(Mfg. order) Desired delivery date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_inst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）指図日</td>
 *  	<td>(Mfg. order) Order date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_inst_prnt_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）指図書発行日時</td>
 *  	<td>(Mfg. order) Order sheet issued date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_inst_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）指図書発行済ＦＬＧ</td>
 *  	<td>(Mfg. order) Order sheet issued flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）承認対象ＦＬＧ</td>
 *  	<td>(Mfg. order) For approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_mfg_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）製造承認状況区分</td>
 *  	<td>(Mfg. order) Mfg. approval status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_aprv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）承認日</td>
 *  	<td>(Mfg. order) Approval date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_aprv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）承認部門ＣＤ</td>
 *  	<td>(Mfg. order) Approval dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）承認者ＣＤ</td>
 *  	<td>(Mfg. order) Approver cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_aprv_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）承認日時</td>
 *  	<td>(Mfg. order) Approval date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_aprv_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）承認理由</td>
 *  	<td>(Mfg. order) Approval reason</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_mfg_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）製造承認役割ＣＤ</td>
 *  	<td>(Mfg. order) Mfg. approval role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_disp_pd</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）印字用表示期限</td>
 *  	<td>(Mfg. order) Display expiration for print</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_inst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）指図部門ＣＤ</td>
 *  	<td>(Mfg. order) Order dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_inst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）指図担当者ＣＤ</td>
 *  	<td>(Mfg. order) Order PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）取消ＦＬＧ</td>
 *  	<td>(Mfg. order) Cancellation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_abort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）打切ＦＬＧ</td>
 *  	<td>(Mfg. order) Cancel remaining flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_schd_chg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）計画変更ＦＬＧ</td>
 *  	<td>(Mfg. order) Plan change flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_po_locked_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）発注訂正・取消不可ＦＬＧ</td>
 *  	<td>Do not allow (mfg. order) po correction/cancel flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_po_auto_reg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）発注時自動作成ＦＬＧ</td>
 *  	<td>(Mfg. order) Auto-create flg. at PO</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_mfg_inst_unit_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図）製造指図単位区分</td>
 *  	<td>(Mfg. order) Mfg. order unit type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）内部備考</td>
 *  	<td>(Mfg. order) Internal remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_inst_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）指図書備考</td>
 *  	<td>(Mfg. order) Order sheet remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_inst_po_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）指図・発注連絡備考</td>
 *  	<td>(Mfg. order) Order/PO contact remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）予備１</td>
 *  	<td>(Mfg. order) Spare 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mi_sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）予備２</td>
 *  	<td>(Mfg. order) Spare 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mi_sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造指図）予備３</td>
 *  	<td>(Mfg. order) Spare 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）品目オーダＮＯ</td>
 *  	<td>(Item mfg. order) Item order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_io_schd_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）受払進捗管理ＮＯ</td>
 *  	<td>(Item mfg. order) GR/GI progress management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_frst_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）初回製造指図ＮＯ</td>
 *  	<td>(Item mfg. order) Initial mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_mfg_mtd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）生産方法区分</td>
 *  	<td>(Item mfg. order) Production method type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）外注先ＣＤ</td>
 *  	<td>(Item mfg. order) Subcontractor cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）品目ＣＤ</td>
 *  	<td>(Item mfg. order) Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）枝番１</td>
 *  	<td>(Item mfg. order) Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）枝番２</td>
 *  	<td>(Item mfg. order) Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）枝番３</td>
 *  	<td>(Item mfg. order) Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_oper_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）工程パタン</td>
 *  	<td>(Item mfg. order) Operation pattern</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_bom_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）構成パタン</td>
 *  	<td>(Item mfg. order) BOM pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_base_unit_yield_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）基準単位出来高予定数量</td>
 *  	<td>(Item mfg. order) Base unit output scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_base_unit_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）基準単位製造指図数量</td>
 *  	<td>(Item mfg. order) Base unit mfg. order qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）基準単位ＣＤ</td>
 *  	<td>(Item mfg. order) Base unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_master_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）マスタ適用日</td>
 *  	<td>(Item mfg. order) Master application date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）ロットＮＯ</td>
 *  	<td>(Item mfg. order) Lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）サブロットＮＯ</td>
 *  	<td>(Item mfg. order) Sublot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）手配ＮＯ１</td>
 *  	<td>(Item mfg. order) SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）手配ＮＯ２</td>
 *  	<td>(Item mfg. order) SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）手配ＮＯ３</td>
 *  	<td>(Item mfg. order) SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）手配ＮＯ４</td>
 *  	<td>(Item mfg. order) SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_unschd_inst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）計画外指図ＦＬＧ</td>
 *  	<td>(Item mfg. order) Without plan order flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_unschd_act_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）計画外実績ＦＬＧ</td>
 *  	<td>(Item mfg. order) Unplanned result flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_strg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）格納先場所ＣＤ</td>
 *  	<td>(Item mfg. order) Storage location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_strg_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）格納棚・ラインＣＤ</td>
 *  	<td>(Item mfg. order) Storage rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）製造場所ＣＤ</td>
 *  	<td>(Item mfg. order) Mfg. location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_mfg_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）製造棚・ラインＣＤ</td>
 *  	<td>(Item mfg. order) Mfg. rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）ワーキンググループＣＤ</td>
 *  	<td>(Item mfg. order) WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（品目製造指図）工場・物流倉庫ＣＤ</td>
 *  	<td>(Item mfg. order) Factory/Distribution warehouse cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_itm_lower_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）品目下限収率</td>
 *  	<td>(Item mfg. order) Item min. yield</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_itm_std_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）品目標準収率</td>
 *  	<td>(Item mfg. order) Item standard yield</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_itm_upper_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）品目上限収率</td>
 *  	<td>(Item mfg. order) Item max. yield</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）予備１</td>
 *  	<td>(Item mfg. order) Spare 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imi_sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）予備２</td>
 *  	<td>(Item mfg. order) Spare 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imi_sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（品目製造指図）予備３</td>
 *  	<td>(Item mfg. order) Spare 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mpr_mfg_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図進捗）製造状況区分</td>
 *  	<td>(Mfg. order progress) Mfg. status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mpr_base_unit_mfg_rem_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造指図進捗）基準単位製造残数量</td>
 *  	<td>(Mfg. order progress) Base unit remaining mfg. qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造実績）製造実績ＮＯ</td>
 *  	<td>(Mfg. result) Mfg. result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）製造指図ＮＯ</td>
 *  	<td>(Mfg. result) Mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_div_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造実績）分割連番</td>
 *  	<td>(Mfg. result) Split sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造実績）品目製造指図ＮＯ</td>
 *  	<td>(Mfg. result) Item mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）取引ＣＤ</td>
 *  	<td>(Mfg. result) Transaction cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_st_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造実績）着手実績日時</td>
 *  	<td>(Mfg. result) Actual start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_end_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）終了実績日時</td>
 *  	<td>(Mfg. result) Actual end date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_base_unit_yield_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造実績）基準単位良品数量</td>
 *  	<td>(Mfg. result) Base unit conforming qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_base_unit_dfct_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）基準単位不良数量</td>
 *  	<td>(Mfg. result) Base unit defective qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）基準単位ＣＤ</td>
 *  	<td>(Mfg. result) Base unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_st_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造実績）着手計上日</td>
 *  	<td>(Mfg. result) Start recording date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_end_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）終了計上日</td>
 *  	<td>(Mfg. result) End recording date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_itm_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）品目実際収率</td>
 *  	<td>(Mfg. result) Item actual yield</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_mfg_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）製造承認状況区分</td>
 *  	<td>(Mfg. result) Mfg. approval status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_aprv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）承認日</td>
 *  	<td>(Mfg. result) Approval date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_aprv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）承認部門ＣＤ</td>
 *  	<td>(Mfg. result) Approval dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）承認者ＣＤ</td>
 *  	<td>(Mfg. result) Approver cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_aprv_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）承認日時</td>
 *  	<td>(Mfg. result) Approval date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_aprv_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）承認理由</td>
 *  	<td>(Mfg. result) Approval reason</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_act_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造実績）製造記録書発行済ＦＬＧ</td>
 *  	<td>(Mfg. result) Mfg. record sheet issued flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_act_prnt_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）製造記録書発行日時</td>
 *  	<td>(Mfg. result) Mfg. record sheet issue date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造実績）製造記録書連番</td>
 *  	<td>(Mfg. result) Mfg. record sheet sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_act_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）実績部門ＣＤ</td>
 *  	<td>(Mfg. result) Result dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_act_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）実績責任者ＣＤ</td>
 *  	<td>(Mfg. result) Result management PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_arr_purc_auto_reg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>（製造実績）入荷・仕入時自動作成ＦＬＧ</td>
 *  	<td>(Mfg. result) Auto-create flg. at receipt/purchase</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）内部備考</td>
 *  	<td>(Mfg. result) Internal remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_act_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）記録書備考</td>
 *  	<td>(Mfg. result) Record sheet remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）予備１</td>
 *  	<td>(Mfg. result) Spare 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ma_sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）予備２</td>
 *  	<td>(Mfg. result) Spare 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ma_sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>（製造実績）予備３</td>
 *  	<td>(Mfg. result) Spare 3</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSVT_MFG_INST_ACT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVT_MFG_INST_ACT";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	private static final MCPermColumnInfo _div_seq = createColumnInfo("div_seq");
	public final MCNumberPermColumn div_seq = createNumberColumn(_div_seq);
	
	/**
	 * （製造指図）製造指図改訂番号. (Mfg. order) Mfg. order rev. number.<p>
	 *
	 */
	public static final String $mi_mfg_inst_rev = "mi_mfg_inst_rev";
	private static final MCPermColumnInfo _mi_mfg_inst_rev = createColumnInfo("mi_mfg_inst_rev");
	public final MCNumberPermColumn mi_mfg_inst_rev = createNumberColumn(_mi_mfg_inst_rev);
	
	/**
	 * （製造指図）品目製造指図ＮＯ. (Mfg. order) Item mfg. order No..<p>
	 *
	 */
	public static final String $mi_itm_mfg_inst_no = "mi_itm_mfg_inst_no";
	private static final MCPermColumnInfo _mi_itm_mfg_inst_no = createColumnInfo("mi_itm_mfg_inst_no");
	public final MCStringPermColumn mi_itm_mfg_inst_no = createStringColumn(_mi_itm_mfg_inst_no);
	
	/**
	 * （製造指図）発注明細ＮＯ. (Mfg. order) PO details No..<p>
	 *
	 */
	public static final String $mi_po_d_no = "mi_po_d_no";
	private static final MCPermColumnInfo _mi_po_d_no = createColumnInfo("mi_po_d_no");
	public final MCStringPermColumn mi_po_d_no = createStringColumn(_mi_po_d_no);
	
	/**
	 * （製造指図）基準単位出来高予定数量. (Mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public static final String $mi_base_unit_yield_qty = "mi_base_unit_yield_qty";
	private static final MCPermColumnInfo _mi_base_unit_yield_qty = createColumnInfo("mi_base_unit_yield_qty");
	public final MCNumberPermColumn mi_base_unit_yield_qty = createNumberColumn(_mi_base_unit_yield_qty);
	
	/**
	 * （製造指図）基準単位製造指図数量. (Mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public static final String $mi_base_unit_inst_qty = "mi_base_unit_inst_qty";
	private static final MCPermColumnInfo _mi_base_unit_inst_qty = createColumnInfo("mi_base_unit_inst_qty");
	public final MCNumberPermColumn mi_base_unit_inst_qty = createNumberColumn(_mi_base_unit_inst_qty);
	
	/**
	 * （製造指図）基準単位ＣＤ. (Mfg. order) Base unit cd..<p>
	 *
	 */
	public static final String $mi_base_unit_cd = "mi_base_unit_cd";
	private static final MCPermColumnInfo _mi_base_unit_cd = createColumnInfo("mi_base_unit_cd");
	public final MCStringPermColumn mi_base_unit_cd = createStringColumn(_mi_base_unit_cd);
	
	/**
	 * （製造指図）着手予定日時. (Mfg. order) Scheduled start date and time.<p>
	 *
	 */
	public static final String $mi_st_schd_tm = "mi_st_schd_tm";
	private static final MCPermColumnInfo _mi_st_schd_tm = createColumnInfo("mi_st_schd_tm");
	public final MCDatePermColumn mi_st_schd_tm = createDateColumn(_mi_st_schd_tm);
	
	/**
	 * （製造指図）終了予定日時. (Mfg. order) Scheduled end date and time.<p>
	 *
	 */
	public static final String $mi_end_schd_tm = "mi_end_schd_tm";
	private static final MCPermColumnInfo _mi_end_schd_tm = createColumnInfo("mi_end_schd_tm");
	public final MCDatePermColumn mi_end_schd_tm = createDateColumn(_mi_end_schd_tm);
	
	/**
	 * （製造指図）納入希望日時. (Mfg. order) Desired delivery date and time.<p>
	 *
	 */
	public static final String $mi_rqst_dlv_rqst_tm = "mi_rqst_dlv_rqst_tm";
	private static final MCPermColumnInfo _mi_rqst_dlv_rqst_tm = createColumnInfo("mi_rqst_dlv_rqst_tm");
	public final MCDatePermColumn mi_rqst_dlv_rqst_tm = createDateColumn(_mi_rqst_dlv_rqst_tm);
	
	/**
	 * （製造指図）指図日. (Mfg. order) Order date.<p>
	 *
	 */
	public static final String $mi_inst_dt = "mi_inst_dt";
	private static final MCPermColumnInfo _mi_inst_dt = createColumnInfo("mi_inst_dt");
	public final MCDatePermColumn mi_inst_dt = createDateColumn(_mi_inst_dt);
	
	/**
	 * （製造指図）指図書発行日時. (Mfg. order) Order sheet issued date and time.<p>
	 *
	 */
	public static final String $mi_inst_prnt_tm = "mi_inst_prnt_tm";
	private static final MCPermColumnInfo _mi_inst_prnt_tm = createColumnInfo("mi_inst_prnt_tm");
	public final MCDatePermColumn mi_inst_prnt_tm = createDateColumn(_mi_inst_prnt_tm);
	
	/**
	 * （製造指図）指図書発行済ＦＬＧ. (Mfg. order) Order sheet issued flg..<p>
	 *
	 */
	public static final String $mi_inst_prnt_flg = "mi_inst_prnt_flg";
	private static final MCPermColumnInfo _mi_inst_prnt_flg = createColumnInfo("mi_inst_prnt_flg");
	public final MCBooleanPermColumn mi_inst_prnt_flg = createBooleanColumn(_mi_inst_prnt_flg);
	
	/**
	 * （製造指図）承認対象ＦＬＧ. (Mfg. order) For approval flg..<p>
	 *
	 */
	public static final String $mi_aprv_flg = "mi_aprv_flg";
	private static final MCPermColumnInfo _mi_aprv_flg = createColumnInfo("mi_aprv_flg");
	public final MCBooleanPermColumn mi_aprv_flg = createBooleanColumn(_mi_aprv_flg);
	
	/**
	 * （製造指図）製造承認状況区分. (Mfg. order) Mfg. approval status type.<p>
	 *
	 */
	public static final String $mi_mfg_aprv_sts_typ = "mi_mfg_aprv_sts_typ";
	private static final MCPermColumnInfo _mi_mfg_aprv_sts_typ = createColumnInfo("mi_mfg_aprv_sts_typ");
	public final MCStringPermColumn mi_mfg_aprv_sts_typ = createStringColumn(_mi_mfg_aprv_sts_typ);
	
	/**
	 * （製造指図）承認日. (Mfg. order) Approval date.<p>
	 *
	 */
	public static final String $mi_aprv_dt = "mi_aprv_dt";
	private static final MCPermColumnInfo _mi_aprv_dt = createColumnInfo("mi_aprv_dt");
	public final MCDatePermColumn mi_aprv_dt = createDateColumn(_mi_aprv_dt);
	
	/**
	 * （製造指図）承認部門ＣＤ. (Mfg. order) Approval dept. cd..<p>
	 *
	 */
	public static final String $mi_aprv_dpt_cd = "mi_aprv_dpt_cd";
	private static final MCPermColumnInfo _mi_aprv_dpt_cd = createColumnInfo("mi_aprv_dpt_cd");
	public final MCStringPermColumn mi_aprv_dpt_cd = createStringColumn(_mi_aprv_dpt_cd);
	
	/**
	 * （製造指図）承認者ＣＤ. (Mfg. order) Approver cd..<p>
	 *
	 */
	public static final String $mi_aprv_usr_cd = "mi_aprv_usr_cd";
	private static final MCPermColumnInfo _mi_aprv_usr_cd = createColumnInfo("mi_aprv_usr_cd");
	public final MCStringPermColumn mi_aprv_usr_cd = createStringColumn(_mi_aprv_usr_cd);
	
	/**
	 * （製造指図）承認日時. (Mfg. order) Approval date and time.<p>
	 *
	 */
	public static final String $mi_aprv_tm = "mi_aprv_tm";
	private static final MCPermColumnInfo _mi_aprv_tm = createColumnInfo("mi_aprv_tm");
	public final MCDatePermColumn mi_aprv_tm = createDateColumn(_mi_aprv_tm);
	
	/**
	 * （製造指図）承認理由. (Mfg. order) Approval reason.<p>
	 *
	 */
	public static final String $mi_aprv_rsn = "mi_aprv_rsn";
	private static final MCPermColumnInfo _mi_aprv_rsn = createColumnInfo("mi_aprv_rsn");
	public final MCStringPermColumn mi_aprv_rsn = createStringColumn(_mi_aprv_rsn);
	
	/**
	 * （製造指図）製造承認役割ＣＤ. (Mfg. order) Mfg. approval role cd..<p>
	 *
	 */
	public static final String $mi_mfg_aprv_role_cd = "mi_mfg_aprv_role_cd";
	private static final MCPermColumnInfo _mi_mfg_aprv_role_cd = createColumnInfo("mi_mfg_aprv_role_cd");
	public final MCStringPermColumn mi_mfg_aprv_role_cd = createStringColumn(_mi_mfg_aprv_role_cd);
	
	/**
	 * （製造指図）印字用表示期限. (Mfg. order) Display expiration for print.<p>
	 *
	 */
	public static final String $mi_disp_pd = "mi_disp_pd";
	private static final MCPermColumnInfo _mi_disp_pd = createColumnInfo("mi_disp_pd");
	public final MCStringPermColumn mi_disp_pd = createStringColumn(_mi_disp_pd);
	
	/**
	 * （製造指図）指図部門ＣＤ. (Mfg. order) Order dept. cd..<p>
	 *
	 */
	public static final String $mi_inst_dpt_cd = "mi_inst_dpt_cd";
	private static final MCPermColumnInfo _mi_inst_dpt_cd = createColumnInfo("mi_inst_dpt_cd");
	public final MCStringPermColumn mi_inst_dpt_cd = createStringColumn(_mi_inst_dpt_cd);
	
	/**
	 * （製造指図）指図担当者ＣＤ. (Mfg. order) Order PIC cd..<p>
	 *
	 */
	public static final String $mi_inst_usr_cd = "mi_inst_usr_cd";
	private static final MCPermColumnInfo _mi_inst_usr_cd = createColumnInfo("mi_inst_usr_cd");
	public final MCStringPermColumn mi_inst_usr_cd = createStringColumn(_mi_inst_usr_cd);
	
	/**
	 * （製造指図）取消ＦＬＧ. (Mfg. order) Cancellation flg..<p>
	 *
	 */
	public static final String $mi_can_flg = "mi_can_flg";
	private static final MCPermColumnInfo _mi_can_flg = createColumnInfo("mi_can_flg");
	public final MCBooleanPermColumn mi_can_flg = createBooleanColumn(_mi_can_flg);
	
	/**
	 * （製造指図）打切ＦＬＧ. (Mfg. order) Cancel remaining flg..<p>
	 *
	 */
	public static final String $mi_abort_flg = "mi_abort_flg";
	private static final MCPermColumnInfo _mi_abort_flg = createColumnInfo("mi_abort_flg");
	public final MCBooleanPermColumn mi_abort_flg = createBooleanColumn(_mi_abort_flg);
	
	/**
	 * （製造指図）計画変更ＦＬＧ. (Mfg. order) Plan change flg..<p>
	 *
	 */
	public static final String $mi_schd_chg_flg = "mi_schd_chg_flg";
	private static final MCPermColumnInfo _mi_schd_chg_flg = createColumnInfo("mi_schd_chg_flg");
	public final MCBooleanPermColumn mi_schd_chg_flg = createBooleanColumn(_mi_schd_chg_flg);
	
	/**
	 * （製造指図）発注訂正・取消不可ＦＬＧ. Do not allow (mfg. order) po correction/cancel flg..<p>
	 *
	 */
	public static final String $mi_po_locked_flg = "mi_po_locked_flg";
	private static final MCPermColumnInfo _mi_po_locked_flg = createColumnInfo("mi_po_locked_flg");
	public final MCBooleanPermColumn mi_po_locked_flg = createBooleanColumn(_mi_po_locked_flg);
	
	/**
	 * （製造指図）発注時自動作成ＦＬＧ. (Mfg. order) Auto-create flg. at PO.<p>
	 *
	 */
	public static final String $mi_po_auto_reg_flg = "mi_po_auto_reg_flg";
	private static final MCPermColumnInfo _mi_po_auto_reg_flg = createColumnInfo("mi_po_auto_reg_flg");
	public final MCBooleanPermColumn mi_po_auto_reg_flg = createBooleanColumn(_mi_po_auto_reg_flg);
	
	/**
	 * （製造指図）製造指図単位区分. (Mfg. order) Mfg. order unit type.<p>
	 *
	 */
	public static final String $mi_mfg_inst_unit_typ = "mi_mfg_inst_unit_typ";
	private static final MCPermColumnInfo _mi_mfg_inst_unit_typ = createColumnInfo("mi_mfg_inst_unit_typ");
	public final MCStringPermColumn mi_mfg_inst_unit_typ = createStringColumn(_mi_mfg_inst_unit_typ);
	
	/**
	 * （製造指図）内部備考. (Mfg. order) Internal remarks.<p>
	 *
	 */
	public static final String $mi_intr_rmrks = "mi_intr_rmrks";
	private static final MCPermColumnInfo _mi_intr_rmrks = createColumnInfo("mi_intr_rmrks");
	public final MCStringPermColumn mi_intr_rmrks = createStringColumn(_mi_intr_rmrks);
	
	/**
	 * （製造指図）指図書備考. (Mfg. order) Order sheet remarks.<p>
	 *
	 */
	public static final String $mi_inst_rpt_rmrks = "mi_inst_rpt_rmrks";
	private static final MCPermColumnInfo _mi_inst_rpt_rmrks = createColumnInfo("mi_inst_rpt_rmrks");
	public final MCStringPermColumn mi_inst_rpt_rmrks = createStringColumn(_mi_inst_rpt_rmrks);
	
	/**
	 * （製造指図）指図・発注連絡備考. (Mfg. order) Order/PO contact remarks.<p>
	 *
	 */
	public static final String $mi_inst_po_cnt_rmrks = "mi_inst_po_cnt_rmrks";
	private static final MCPermColumnInfo _mi_inst_po_cnt_rmrks = createColumnInfo("mi_inst_po_cnt_rmrks");
	public final MCStringPermColumn mi_inst_po_cnt_rmrks = createStringColumn(_mi_inst_po_cnt_rmrks);
	
	/**
	 * （製造指図）予備１. (Mfg. order) Spare 1.<p>
	 *
	 */
	public static final String $mi_sub_char1 = "mi_sub_char1";
	private static final MCPermColumnInfo _mi_sub_char1 = createColumnInfo("mi_sub_char1");
	public final MCStringPermColumn mi_sub_char1 = createStringColumn(_mi_sub_char1);
	
	/**
	 * （製造指図）予備２. (Mfg. order) Spare 2.<p>
	 *
	 */
	public static final String $mi_sub_char2 = "mi_sub_char2";
	private static final MCPermColumnInfo _mi_sub_char2 = createColumnInfo("mi_sub_char2");
	public final MCStringPermColumn mi_sub_char2 = createStringColumn(_mi_sub_char2);
	
	/**
	 * （製造指図）予備３. (Mfg. order) Spare 3.<p>
	 *
	 */
	public static final String $mi_sub_char3 = "mi_sub_char3";
	private static final MCPermColumnInfo _mi_sub_char3 = createColumnInfo("mi_sub_char3");
	public final MCStringPermColumn mi_sub_char3 = createStringColumn(_mi_sub_char3);
	
	/**
	 * （品目製造指図）品目オーダＮＯ. (Item mfg. order) Item order No..<p>
	 *
	 */
	public static final String $imi_itm_ord_no = "imi_itm_ord_no";
	private static final MCPermColumnInfo _imi_itm_ord_no = createColumnInfo("imi_itm_ord_no");
	public final MCStringPermColumn imi_itm_ord_no = createStringColumn(_imi_itm_ord_no);
	
	/**
	 * （品目製造指図）受払進捗管理ＮＯ. (Item mfg. order) GR/GI progress management No..<p>
	 *
	 */
	public static final String $imi_io_schd_pr_no = "imi_io_schd_pr_no";
	private static final MCPermColumnInfo _imi_io_schd_pr_no = createColumnInfo("imi_io_schd_pr_no");
	public final MCStringPermColumn imi_io_schd_pr_no = createStringColumn(_imi_io_schd_pr_no);
	
	/**
	 * （品目製造指図）初回製造指図ＮＯ. (Item mfg. order) Initial mfg. order No..<p>
	 *
	 */
	public static final String $imi_frst_mfg_inst_no = "imi_frst_mfg_inst_no";
	private static final MCPermColumnInfo _imi_frst_mfg_inst_no = createColumnInfo("imi_frst_mfg_inst_no");
	public final MCStringPermColumn imi_frst_mfg_inst_no = createStringColumn(_imi_frst_mfg_inst_no);
	
	/**
	 * （品目製造指図）生産方法区分. (Item mfg. order) Production method type.<p>
	 *
	 */
	public static final String $imi_mfg_mtd_typ = "imi_mfg_mtd_typ";
	private static final MCPermColumnInfo _imi_mfg_mtd_typ = createColumnInfo("imi_mfg_mtd_typ");
	public final MCStringPermColumn imi_mfg_mtd_typ = createStringColumn(_imi_mfg_mtd_typ);
	
	/**
	 * （品目製造指図）外注先ＣＤ. (Item mfg. order) Subcontractor cd..<p>
	 *
	 */
	public static final String $imi_sppl_cd = "imi_sppl_cd";
	private static final MCPermColumnInfo _imi_sppl_cd = createColumnInfo("imi_sppl_cd");
	public final MCStringPermColumn imi_sppl_cd = createStringColumn(_imi_sppl_cd);
	
	/**
	 * （品目製造指図）品目ＣＤ. (Item mfg. order) Item cd..<p>
	 *
	 */
	public static final String $imi_itm_cd = "imi_itm_cd";
	private static final MCPermColumnInfo _imi_itm_cd = createColumnInfo("imi_itm_cd");
	public final MCStringPermColumn imi_itm_cd = createStringColumn(_imi_itm_cd);
	
	/**
	 * （品目製造指図）枝番１. (Item mfg. order) Branch No. 1.<p>
	 *
	 */
	public static final String $imi_itm_sub1 = "imi_itm_sub1";
	private static final MCPermColumnInfo _imi_itm_sub1 = createColumnInfo("imi_itm_sub1");
	public final MCStringPermColumn imi_itm_sub1 = createStringColumn(_imi_itm_sub1);
	
	/**
	 * （品目製造指図）枝番２. (Item mfg. order) Branch No. 2.<p>
	 *
	 */
	public static final String $imi_itm_sub2 = "imi_itm_sub2";
	private static final MCPermColumnInfo _imi_itm_sub2 = createColumnInfo("imi_itm_sub2");
	public final MCStringPermColumn imi_itm_sub2 = createStringColumn(_imi_itm_sub2);
	
	/**
	 * （品目製造指図）枝番３. (Item mfg. order) Branch No. 3.<p>
	 *
	 */
	public static final String $imi_itm_sub3 = "imi_itm_sub3";
	private static final MCPermColumnInfo _imi_itm_sub3 = createColumnInfo("imi_itm_sub3");
	public final MCStringPermColumn imi_itm_sub3 = createStringColumn(_imi_itm_sub3);
	
	/**
	 * （品目製造指図）工程パタン. (Item mfg. order) Operation pattern.<p>
	 *
	 */
	public static final String $imi_oper_ptn = "imi_oper_ptn";
	private static final MCPermColumnInfo _imi_oper_ptn = createColumnInfo("imi_oper_ptn");
	public final MCStringPermColumn imi_oper_ptn = createStringColumn(_imi_oper_ptn);
	
	/**
	 * （品目製造指図）構成パタン. (Item mfg. order) BOM pattern.<p>
	 *
	 */
	public static final String $imi_bom_ptn = "imi_bom_ptn";
	private static final MCPermColumnInfo _imi_bom_ptn = createColumnInfo("imi_bom_ptn");
	public final MCStringPermColumn imi_bom_ptn = createStringColumn(_imi_bom_ptn);
	
	/**
	 * （品目製造指図）基準単位出来高予定数量. (Item mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public static final String $imi_base_unit_yield_qty = "imi_base_unit_yield_qty";
	private static final MCPermColumnInfo _imi_base_unit_yield_qty = createColumnInfo("imi_base_unit_yield_qty");
	public final MCNumberPermColumn imi_base_unit_yield_qty = createNumberColumn(_imi_base_unit_yield_qty);
	
	/**
	 * （品目製造指図）基準単位製造指図数量. (Item mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public static final String $imi_base_unit_inst_qty = "imi_base_unit_inst_qty";
	private static final MCPermColumnInfo _imi_base_unit_inst_qty = createColumnInfo("imi_base_unit_inst_qty");
	public final MCNumberPermColumn imi_base_unit_inst_qty = createNumberColumn(_imi_base_unit_inst_qty);
	
	/**
	 * （品目製造指図）基準単位ＣＤ. (Item mfg. order) Base unit cd..<p>
	 *
	 */
	public static final String $imi_base_unit_cd = "imi_base_unit_cd";
	private static final MCPermColumnInfo _imi_base_unit_cd = createColumnInfo("imi_base_unit_cd");
	public final MCStringPermColumn imi_base_unit_cd = createStringColumn(_imi_base_unit_cd);
	
	/**
	 * （品目製造指図）マスタ適用日. (Item mfg. order) Master application date.<p>
	 *
	 */
	public static final String $imi_master_dt = "imi_master_dt";
	private static final MCPermColumnInfo _imi_master_dt = createColumnInfo("imi_master_dt");
	public final MCDatePermColumn imi_master_dt = createDateColumn(_imi_master_dt);
	
	/**
	 * （品目製造指図）ロットＮＯ. (Item mfg. order) Lot No..<p>
	 *
	 */
	public static final String $imi_lot_no = "imi_lot_no";
	private static final MCPermColumnInfo _imi_lot_no = createColumnInfo("imi_lot_no");
	public final MCStringPermColumn imi_lot_no = createStringColumn(_imi_lot_no);
	
	/**
	 * （品目製造指図）サブロットＮＯ. (Item mfg. order) Sublot No..<p>
	 *
	 */
	public static final String $imi_sublot_no = "imi_sublot_no";
	private static final MCPermColumnInfo _imi_sublot_no = createColumnInfo("imi_sublot_no");
	public final MCStringPermColumn imi_sublot_no = createStringColumn(_imi_sublot_no);
	
	/**
	 * （品目製造指図）手配ＮＯ１. (Item mfg. order) SEIBAN No. 1.<p>
	 *
	 */
	public static final String $imi_sno1 = "imi_sno1";
	private static final MCPermColumnInfo _imi_sno1 = createColumnInfo("imi_sno1");
	public final MCStringPermColumn imi_sno1 = createStringColumn(_imi_sno1);
	
	/**
	 * （品目製造指図）手配ＮＯ２. (Item mfg. order) SEIBAN No. 2.<p>
	 *
	 */
	public static final String $imi_sno2 = "imi_sno2";
	private static final MCPermColumnInfo _imi_sno2 = createColumnInfo("imi_sno2");
	public final MCStringPermColumn imi_sno2 = createStringColumn(_imi_sno2);
	
	/**
	 * （品目製造指図）手配ＮＯ３. (Item mfg. order) SEIBAN No. 3.<p>
	 *
	 */
	public static final String $imi_sno3 = "imi_sno3";
	private static final MCPermColumnInfo _imi_sno3 = createColumnInfo("imi_sno3");
	public final MCStringPermColumn imi_sno3 = createStringColumn(_imi_sno3);
	
	/**
	 * （品目製造指図）手配ＮＯ４. (Item mfg. order) SEIBAN No. 4.<p>
	 *
	 */
	public static final String $imi_sno4 = "imi_sno4";
	private static final MCPermColumnInfo _imi_sno4 = createColumnInfo("imi_sno4");
	public final MCStringPermColumn imi_sno4 = createStringColumn(_imi_sno4);
	
	/**
	 * （品目製造指図）計画外指図ＦＬＧ. (Item mfg. order) Without plan order flg..<p>
	 *
	 */
	public static final String $imi_unschd_inst_flg = "imi_unschd_inst_flg";
	private static final MCPermColumnInfo _imi_unschd_inst_flg = createColumnInfo("imi_unschd_inst_flg");
	public final MCBooleanPermColumn imi_unschd_inst_flg = createBooleanColumn(_imi_unschd_inst_flg);
	
	/**
	 * （品目製造指図）計画外実績ＦＬＧ. (Item mfg. order) Unplanned result flg..<p>
	 *
	 */
	public static final String $imi_unschd_act_flg = "imi_unschd_act_flg";
	private static final MCPermColumnInfo _imi_unschd_act_flg = createColumnInfo("imi_unschd_act_flg");
	public final MCBooleanPermColumn imi_unschd_act_flg = createBooleanColumn(_imi_unschd_act_flg);
	
	/**
	 * （品目製造指図）格納先場所ＣＤ. (Item mfg. order) Storage location cd..<p>
	 *
	 */
	public static final String $imi_strg_loc_cd = "imi_strg_loc_cd";
	private static final MCPermColumnInfo _imi_strg_loc_cd = createColumnInfo("imi_strg_loc_cd");
	public final MCStringPermColumn imi_strg_loc_cd = createStringColumn(_imi_strg_loc_cd);
	
	/**
	 * （品目製造指図）格納棚・ラインＣＤ. (Item mfg. order) Storage rack/line cd..<p>
	 *
	 */
	public static final String $imi_strg_str_ln_cd = "imi_strg_str_ln_cd";
	private static final MCPermColumnInfo _imi_strg_str_ln_cd = createColumnInfo("imi_strg_str_ln_cd");
	public final MCStringPermColumn imi_strg_str_ln_cd = createStringColumn(_imi_strg_str_ln_cd);
	
	/**
	 * （品目製造指図）製造場所ＣＤ. (Item mfg. order) Mfg. location cd..<p>
	 *
	 */
	public static final String $imi_mfg_loc_cd = "imi_mfg_loc_cd";
	private static final MCPermColumnInfo _imi_mfg_loc_cd = createColumnInfo("imi_mfg_loc_cd");
	public final MCStringPermColumn imi_mfg_loc_cd = createStringColumn(_imi_mfg_loc_cd);
	
	/**
	 * （品目製造指図）製造棚・ラインＣＤ. (Item mfg. order) Mfg. rack/line cd..<p>
	 *
	 */
	public static final String $imi_mfg_str_ln_cd = "imi_mfg_str_ln_cd";
	private static final MCPermColumnInfo _imi_mfg_str_ln_cd = createColumnInfo("imi_mfg_str_ln_cd");
	public final MCStringPermColumn imi_mfg_str_ln_cd = createStringColumn(_imi_mfg_str_ln_cd);
	
	/**
	 * （品目製造指図）ワーキンググループＣＤ. (Item mfg. order) WG cd..<p>
	 *
	 */
	public static final String $imi_wg_cd = "imi_wg_cd";
	private static final MCPermColumnInfo _imi_wg_cd = createColumnInfo("imi_wg_cd");
	public final MCStringPermColumn imi_wg_cd = createStringColumn(_imi_wg_cd);
	
	/**
	 * （品目製造指図）工場・物流倉庫ＣＤ. (Item mfg. order) Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $imi_site_cd = "imi_site_cd";
	private static final MCPermColumnInfo _imi_site_cd = createColumnInfo("imi_site_cd");
	public final MCStringPermColumn imi_site_cd = createStringColumn(_imi_site_cd);
	
	/**
	 * （品目製造指図）品目下限収率. (Item mfg. order) Item min. yield.<p>
	 *
	 */
	public static final String $imi_itm_lower_yield = "imi_itm_lower_yield";
	private static final MCPermColumnInfo _imi_itm_lower_yield = createColumnInfo("imi_itm_lower_yield");
	public final MCNumberPermColumn imi_itm_lower_yield = createNumberColumn(_imi_itm_lower_yield);
	
	/**
	 * （品目製造指図）品目標準収率. (Item mfg. order) Item standard yield.<p>
	 *
	 */
	public static final String $imi_itm_std_yield = "imi_itm_std_yield";
	private static final MCPermColumnInfo _imi_itm_std_yield = createColumnInfo("imi_itm_std_yield");
	public final MCNumberPermColumn imi_itm_std_yield = createNumberColumn(_imi_itm_std_yield);
	
	/**
	 * （品目製造指図）品目上限収率. (Item mfg. order) Item max. yield.<p>
	 *
	 */
	public static final String $imi_itm_upper_yield = "imi_itm_upper_yield";
	private static final MCPermColumnInfo _imi_itm_upper_yield = createColumnInfo("imi_itm_upper_yield");
	public final MCNumberPermColumn imi_itm_upper_yield = createNumberColumn(_imi_itm_upper_yield);
	
	/**
	 * （品目製造指図）予備１. (Item mfg. order) Spare 1.<p>
	 *
	 */
	public static final String $imi_sub_char1 = "imi_sub_char1";
	private static final MCPermColumnInfo _imi_sub_char1 = createColumnInfo("imi_sub_char1");
	public final MCStringPermColumn imi_sub_char1 = createStringColumn(_imi_sub_char1);
	
	/**
	 * （品目製造指図）予備２. (Item mfg. order) Spare 2.<p>
	 *
	 */
	public static final String $imi_sub_char2 = "imi_sub_char2";
	private static final MCPermColumnInfo _imi_sub_char2 = createColumnInfo("imi_sub_char2");
	public final MCStringPermColumn imi_sub_char2 = createStringColumn(_imi_sub_char2);
	
	/**
	 * （品目製造指図）予備３. (Item mfg. order) Spare 3.<p>
	 *
	 */
	public static final String $imi_sub_char3 = "imi_sub_char3";
	private static final MCPermColumnInfo _imi_sub_char3 = createColumnInfo("imi_sub_char3");
	public final MCStringPermColumn imi_sub_char3 = createStringColumn(_imi_sub_char3);
	
	/**
	 * （製造指図進捗）製造状況区分. (Mfg. order progress) Mfg. status type.<p>
	 *
	 */
	public static final String $mpr_mfg_sts_typ = "mpr_mfg_sts_typ";
	private static final MCPermColumnInfo _mpr_mfg_sts_typ = createColumnInfo("mpr_mfg_sts_typ");
	public final MCStringPermColumn mpr_mfg_sts_typ = createStringColumn(_mpr_mfg_sts_typ);
	
	/**
	 * （製造指図進捗）基準単位製造残数量. (Mfg. order progress) Base unit remaining mfg. qty..<p>
	 *
	 */
	public static final String $mpr_base_unit_mfg_rem_qty = "mpr_base_unit_mfg_rem_qty";
	private static final MCPermColumnInfo _mpr_base_unit_mfg_rem_qty = createColumnInfo("mpr_base_unit_mfg_rem_qty");
	public final MCNumberPermColumn mpr_base_unit_mfg_rem_qty = createNumberColumn(_mpr_base_unit_mfg_rem_qty);
	
	/**
	 * （製造実績）製造実績ＮＯ. (Mfg. result) Mfg. result No..<p>
	 *
	 */
	public static final String $ma_mfg_act_no = "ma_mfg_act_no";
	private static final MCPermColumnInfo _ma_mfg_act_no = createColumnInfo("ma_mfg_act_no");
	public final MCStringPermColumn ma_mfg_act_no = createStringColumn(_ma_mfg_act_no);
	
	/**
	 * （製造実績）製造指図ＮＯ. (Mfg. result) Mfg. order No..<p>
	 *
	 */
	public static final String $ma_mfg_inst_no = "ma_mfg_inst_no";
	private static final MCPermColumnInfo _ma_mfg_inst_no = createColumnInfo("ma_mfg_inst_no");
	public final MCStringPermColumn ma_mfg_inst_no = createStringColumn(_ma_mfg_inst_no);
	
	/**
	 * （製造実績）分割連番. (Mfg. result) Split sequence number.<p>
	 *
	 */
	public static final String $ma_div_seq = "ma_div_seq";
	private static final MCPermColumnInfo _ma_div_seq = createColumnInfo("ma_div_seq");
	public final MCNumberPermColumn ma_div_seq = createNumberColumn(_ma_div_seq);
	
	/**
	 * （製造実績）品目製造指図ＮＯ. (Mfg. result) Item mfg. order No..<p>
	 *
	 */
	public static final String $ma_itm_mfg_inst_no = "ma_itm_mfg_inst_no";
	private static final MCPermColumnInfo _ma_itm_mfg_inst_no = createColumnInfo("ma_itm_mfg_inst_no");
	public final MCStringPermColumn ma_itm_mfg_inst_no = createStringColumn(_ma_itm_mfg_inst_no);
	
	/**
	 * （製造実績）取引ＣＤ. (Mfg. result) Transaction cd..<p>
	 *
	 */
	public static final String $ma_trd_cd = "ma_trd_cd";
	private static final MCPermColumnInfo _ma_trd_cd = createColumnInfo("ma_trd_cd");
	public final MCStringPermColumn ma_trd_cd = createStringColumn(_ma_trd_cd);
	
	/**
	 * （製造実績）着手実績日時. (Mfg. result) Actual start date and time.<p>
	 *
	 */
	public static final String $ma_st_act_tm = "ma_st_act_tm";
	private static final MCPermColumnInfo _ma_st_act_tm = createColumnInfo("ma_st_act_tm");
	public final MCDatePermColumn ma_st_act_tm = createDateColumn(_ma_st_act_tm);
	
	/**
	 * （製造実績）終了実績日時. (Mfg. result) Actual end date and time.<p>
	 *
	 */
	public static final String $ma_end_act_tm = "ma_end_act_tm";
	private static final MCPermColumnInfo _ma_end_act_tm = createColumnInfo("ma_end_act_tm");
	public final MCDatePermColumn ma_end_act_tm = createDateColumn(_ma_end_act_tm);
	
	/**
	 * （製造実績）基準単位良品数量. (Mfg. result) Base unit conforming qty..<p>
	 *
	 */
	public static final String $ma_base_unit_yield_qty = "ma_base_unit_yield_qty";
	private static final MCPermColumnInfo _ma_base_unit_yield_qty = createColumnInfo("ma_base_unit_yield_qty");
	public final MCNumberPermColumn ma_base_unit_yield_qty = createNumberColumn(_ma_base_unit_yield_qty);
	
	/**
	 * （製造実績）基準単位不良数量. (Mfg. result) Base unit defective qty..<p>
	 *
	 */
	public static final String $ma_base_unit_dfct_qty = "ma_base_unit_dfct_qty";
	private static final MCPermColumnInfo _ma_base_unit_dfct_qty = createColumnInfo("ma_base_unit_dfct_qty");
	public final MCNumberPermColumn ma_base_unit_dfct_qty = createNumberColumn(_ma_base_unit_dfct_qty);
	
	/**
	 * （製造実績）基準単位ＣＤ. (Mfg. result) Base unit cd..<p>
	 *
	 */
	public static final String $ma_base_unit_cd = "ma_base_unit_cd";
	private static final MCPermColumnInfo _ma_base_unit_cd = createColumnInfo("ma_base_unit_cd");
	public final MCStringPermColumn ma_base_unit_cd = createStringColumn(_ma_base_unit_cd);
	
	/**
	 * （製造実績）着手計上日. (Mfg. result) Start recording date.<p>
	 *
	 */
	public static final String $ma_st_ac_dt = "ma_st_ac_dt";
	private static final MCPermColumnInfo _ma_st_ac_dt = createColumnInfo("ma_st_ac_dt");
	public final MCDatePermColumn ma_st_ac_dt = createDateColumn(_ma_st_ac_dt);
	
	/**
	 * （製造実績）終了計上日. (Mfg. result) End recording date.<p>
	 *
	 */
	public static final String $ma_end_ac_dt = "ma_end_ac_dt";
	private static final MCPermColumnInfo _ma_end_ac_dt = createColumnInfo("ma_end_ac_dt");
	public final MCDatePermColumn ma_end_ac_dt = createDateColumn(_ma_end_ac_dt);
	
	/**
	 * （製造実績）品目実際収率. (Mfg. result) Item actual yield.<p>
	 *
	 */
	public static final String $ma_itm_yield = "ma_itm_yield";
	private static final MCPermColumnInfo _ma_itm_yield = createColumnInfo("ma_itm_yield");
	public final MCNumberPermColumn ma_itm_yield = createNumberColumn(_ma_itm_yield);
	
	/**
	 * （製造実績）製造承認状況区分. (Mfg. result) Mfg. approval status type.<p>
	 *
	 */
	public static final String $ma_mfg_aprv_sts_typ = "ma_mfg_aprv_sts_typ";
	private static final MCPermColumnInfo _ma_mfg_aprv_sts_typ = createColumnInfo("ma_mfg_aprv_sts_typ");
	public final MCStringPermColumn ma_mfg_aprv_sts_typ = createStringColumn(_ma_mfg_aprv_sts_typ);
	
	/**
	 * （製造実績）承認日. (Mfg. result) Approval date.<p>
	 *
	 */
	public static final String $ma_aprv_dt = "ma_aprv_dt";
	private static final MCPermColumnInfo _ma_aprv_dt = createColumnInfo("ma_aprv_dt");
	public final MCDatePermColumn ma_aprv_dt = createDateColumn(_ma_aprv_dt);
	
	/**
	 * （製造実績）承認部門ＣＤ. (Mfg. result) Approval dept. cd..<p>
	 *
	 */
	public static final String $ma_aprv_dpt_cd = "ma_aprv_dpt_cd";
	private static final MCPermColumnInfo _ma_aprv_dpt_cd = createColumnInfo("ma_aprv_dpt_cd");
	public final MCStringPermColumn ma_aprv_dpt_cd = createStringColumn(_ma_aprv_dpt_cd);
	
	/**
	 * （製造実績）承認者ＣＤ. (Mfg. result) Approver cd..<p>
	 *
	 */
	public static final String $ma_aprv_usr_cd = "ma_aprv_usr_cd";
	private static final MCPermColumnInfo _ma_aprv_usr_cd = createColumnInfo("ma_aprv_usr_cd");
	public final MCStringPermColumn ma_aprv_usr_cd = createStringColumn(_ma_aprv_usr_cd);
	
	/**
	 * （製造実績）承認日時. (Mfg. result) Approval date and time.<p>
	 *
	 */
	public static final String $ma_aprv_tm = "ma_aprv_tm";
	private static final MCPermColumnInfo _ma_aprv_tm = createColumnInfo("ma_aprv_tm");
	public final MCDatePermColumn ma_aprv_tm = createDateColumn(_ma_aprv_tm);
	
	/**
	 * （製造実績）承認理由. (Mfg. result) Approval reason.<p>
	 *
	 */
	public static final String $ma_aprv_rsn = "ma_aprv_rsn";
	private static final MCPermColumnInfo _ma_aprv_rsn = createColumnInfo("ma_aprv_rsn");
	public final MCStringPermColumn ma_aprv_rsn = createStringColumn(_ma_aprv_rsn);
	
	/**
	 * （製造実績）製造記録書発行済ＦＬＧ. (Mfg. result) Mfg. record sheet issued flg..<p>
	 *
	 */
	public static final String $ma_act_prnt_flg = "ma_act_prnt_flg";
	private static final MCPermColumnInfo _ma_act_prnt_flg = createColumnInfo("ma_act_prnt_flg");
	public final MCBooleanPermColumn ma_act_prnt_flg = createBooleanColumn(_ma_act_prnt_flg);
	
	/**
	 * （製造実績）製造記録書発行日時. (Mfg. result) Mfg. record sheet issue date and time.<p>
	 *
	 */
	public static final String $ma_act_prnt_tm = "ma_act_prnt_tm";
	private static final MCPermColumnInfo _ma_act_prnt_tm = createColumnInfo("ma_act_prnt_tm");
	public final MCDatePermColumn ma_act_prnt_tm = createDateColumn(_ma_act_prnt_tm);
	
	/**
	 * （製造実績）製造記録書連番. (Mfg. result) Mfg. record sheet sequence number.<p>
	 *
	 */
	public static final String $ma_seq = "ma_seq";
	private static final MCPermColumnInfo _ma_seq = createColumnInfo("ma_seq");
	public final MCNumberPermColumn ma_seq = createNumberColumn(_ma_seq);
	
	/**
	 * （製造実績）実績部門ＣＤ. (Mfg. result) Result dept. cd..<p>
	 *
	 */
	public static final String $ma_act_dpt_cd = "ma_act_dpt_cd";
	private static final MCPermColumnInfo _ma_act_dpt_cd = createColumnInfo("ma_act_dpt_cd");
	public final MCStringPermColumn ma_act_dpt_cd = createStringColumn(_ma_act_dpt_cd);
	
	/**
	 * （製造実績）実績責任者ＣＤ. (Mfg. result) Result management PIC cd..<p>
	 *
	 */
	public static final String $ma_act_usr_cd = "ma_act_usr_cd";
	private static final MCPermColumnInfo _ma_act_usr_cd = createColumnInfo("ma_act_usr_cd");
	public final MCStringPermColumn ma_act_usr_cd = createStringColumn(_ma_act_usr_cd);
	
	/**
	 * （製造実績）入荷・仕入時自動作成ＦＬＧ. (Mfg. result) Auto-create flg. at receipt/purchase.<p>
	 *
	 */
	public static final String $ma_arr_purc_auto_reg_flg = "ma_arr_purc_auto_reg_flg";
	private static final MCPermColumnInfo _ma_arr_purc_auto_reg_flg = createColumnInfo("ma_arr_purc_auto_reg_flg");
	public final MCBooleanPermColumn ma_arr_purc_auto_reg_flg = createBooleanColumn(_ma_arr_purc_auto_reg_flg);
	
	/**
	 * （製造実績）内部備考. (Mfg. result) Internal remarks.<p>
	 *
	 */
	public static final String $ma_intr_rmrks = "ma_intr_rmrks";
	private static final MCPermColumnInfo _ma_intr_rmrks = createColumnInfo("ma_intr_rmrks");
	public final MCStringPermColumn ma_intr_rmrks = createStringColumn(_ma_intr_rmrks);
	
	/**
	 * （製造実績）記録書備考. (Mfg. result) Record sheet remarks.<p>
	 *
	 */
	public static final String $ma_act_rpt_rmrks = "ma_act_rpt_rmrks";
	private static final MCPermColumnInfo _ma_act_rpt_rmrks = createColumnInfo("ma_act_rpt_rmrks");
	public final MCStringPermColumn ma_act_rpt_rmrks = createStringColumn(_ma_act_rpt_rmrks);
	
	/**
	 * （製造実績）予備１. (Mfg. result) Spare 1.<p>
	 *
	 */
	public static final String $ma_sub_char1 = "ma_sub_char1";
	private static final MCPermColumnInfo _ma_sub_char1 = createColumnInfo("ma_sub_char1");
	public final MCStringPermColumn ma_sub_char1 = createStringColumn(_ma_sub_char1);
	
	/**
	 * （製造実績）予備２. (Mfg. result) Spare 2.<p>
	 *
	 */
	public static final String $ma_sub_char2 = "ma_sub_char2";
	private static final MCPermColumnInfo _ma_sub_char2 = createColumnInfo("ma_sub_char2");
	public final MCStringPermColumn ma_sub_char2 = createStringColumn(_ma_sub_char2);
	
	/**
	 * （製造実績）予備３. (Mfg. result) Spare 3.<p>
	 *
	 */
	public static final String $ma_sub_char3 = "ma_sub_char3";
	private static final MCPermColumnInfo _ma_sub_char3 = createColumnInfo("ma_sub_char3");
	public final MCStringPermColumn ma_sub_char3 = createStringColumn(_ma_sub_char3);
	
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mi_mfg_inst_rev_META = createCommonMeta($mi_mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta mi_itm_mfg_inst_no_META = createCommonMeta($mi_itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mi_po_d_no_META = createCommonMeta($mi_po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta mi_base_unit_yield_qty_META = createCommonMeta($mi_base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mi_base_unit_inst_qty_META = createCommonMeta($mi_base_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mi_base_unit_cd_META = createCommonMeta($mi_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta mi_st_schd_tm_META = createCommonMeta($mi_st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta mi_end_schd_tm_META = createCommonMeta($mi_end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta mi_rqst_dlv_rqst_tm_META = createCommonMeta($mi_rqst_dlv_rqst_tm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mi_inst_dt_META = createCommonMeta($mi_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mi_inst_prnt_tm_META = createCommonMeta($mi_inst_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta mi_inst_prnt_flg_META = createCommonMeta($mi_inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mi_aprv_flg_META = createCommonMeta($mi_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mi_mfg_aprv_sts_typ_META = createCommonMeta($mi_mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mi_aprv_dt_META = createCommonMeta($mi_aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mi_aprv_dpt_cd_META = createCommonMeta($mi_aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta mi_aprv_usr_cd_META = createCommonMeta($mi_aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta mi_aprv_tm_META = createCommonMeta($mi_aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta mi_aprv_rsn_META = createCommonMeta($mi_aprv_rsn, mcframe.commonMS.meta.MS_META.APRV_RSN);
	public static final MCMeta mi_mfg_aprv_role_cd_META = createCommonMeta($mi_mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta mi_disp_pd_META = createCommonMeta($mi_disp_pd, mcframe.commonMS.meta.MS_META.DISP_PD);
	public static final MCMeta mi_inst_dpt_cd_META = createCommonMeta($mi_inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta mi_inst_usr_cd_META = createCommonMeta($mi_inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta mi_can_flg_META = createCommonMeta($mi_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mi_abort_flg_META = createCommonMeta($mi_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mi_schd_chg_flg_META = createCommonMeta($mi_schd_chg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mi_po_locked_flg_META = createCommonMeta($mi_po_locked_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mi_po_auto_reg_flg_META = createCommonMeta($mi_po_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mi_mfg_inst_unit_typ_META = createCommonMeta($mi_mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mi_intr_rmrks_META = createCommonMeta($mi_intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_INTR_RMRKS);
	public static final MCMeta mi_inst_rpt_rmrks_META = createCommonMeta($mi_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_RPT_RMRKS);
	public static final MCMeta mi_inst_po_cnt_rmrks_META = createCommonMeta($mi_inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta mi_sub_char1_META = createCommonMeta($mi_sub_char1, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR1);
	public static final MCMeta mi_sub_char2_META = createCommonMeta($mi_sub_char2, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR2);
	public static final MCMeta mi_sub_char3_META = createCommonMeta($mi_sub_char3, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR3);
	public static final MCMeta imi_itm_ord_no_META = createCommonMeta($imi_itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta imi_io_schd_pr_no_META = createCommonMeta($imi_io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta imi_frst_mfg_inst_no_META = createCommonMeta($imi_frst_mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta imi_mfg_mtd_typ_META = createCommonMeta($imi_mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta imi_sppl_cd_META = createCommonMeta($imi_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta imi_itm_cd_META = createCommonMeta($imi_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta imi_itm_sub1_META = createCommonMeta($imi_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta imi_itm_sub2_META = createCommonMeta($imi_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta imi_itm_sub3_META = createCommonMeta($imi_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta imi_oper_ptn_META = createCommonMeta($imi_oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta imi_bom_ptn_META = createCommonMeta($imi_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta imi_base_unit_yield_qty_META = createCommonMeta($imi_base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta imi_base_unit_inst_qty_META = createCommonMeta($imi_base_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta imi_base_unit_cd_META = createCommonMeta($imi_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta imi_master_dt_META = createCommonMeta($imi_master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta imi_lot_no_META = createCommonMeta($imi_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta imi_sublot_no_META = createCommonMeta($imi_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta imi_sno1_META = createCommonMeta($imi_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta imi_sno2_META = createCommonMeta($imi_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta imi_sno3_META = createCommonMeta($imi_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta imi_sno4_META = createCommonMeta($imi_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta imi_unschd_inst_flg_META = createCommonMeta($imi_unschd_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta imi_unschd_act_flg_META = createCommonMeta($imi_unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta imi_strg_loc_cd_META = createCommonMeta($imi_strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta imi_strg_str_ln_cd_META = createCommonMeta($imi_strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta imi_mfg_loc_cd_META = createCommonMeta($imi_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta imi_mfg_str_ln_cd_META = createCommonMeta($imi_mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta imi_wg_cd_META = createCommonMeta($imi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta imi_site_cd_META = createCommonMeta($imi_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta imi_itm_lower_yield_META = createCommonMeta($imi_itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta imi_itm_std_yield_META = createCommonMeta($imi_itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta imi_itm_upper_yield_META = createCommonMeta($imi_itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta imi_sub_char1_META = createCommonMeta($imi_sub_char1, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR1);
	public static final MCMeta imi_sub_char2_META = createCommonMeta($imi_sub_char2, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR2);
	public static final MCMeta imi_sub_char3_META = createCommonMeta($imi_sub_char3, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR3);
	public static final MCMeta mpr_mfg_sts_typ_META = createCommonMeta($mpr_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mpr_base_unit_mfg_rem_qty_META = createCommonMeta($mpr_base_unit_mfg_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ma_mfg_act_no_META = createCommonMeta($ma_mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta ma_mfg_inst_no_META = createCommonMeta($ma_mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta ma_div_seq_META = createCommonMeta($ma_div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta ma_itm_mfg_inst_no_META = createCommonMeta($ma_itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta ma_trd_cd_META = createCommonMeta($ma_trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta ma_st_act_tm_META = createCommonMeta($ma_st_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ma_end_act_tm_META = createCommonMeta($ma_end_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ma_base_unit_yield_qty_META = createCommonMeta($ma_base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ma_base_unit_dfct_qty_META = createCommonMeta($ma_base_unit_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ma_base_unit_cd_META = createCommonMeta($ma_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta ma_st_ac_dt_META = createCommonMeta($ma_st_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ma_end_ac_dt_META = createCommonMeta($ma_end_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ma_itm_yield_META = createCommonMeta($ma_itm_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta ma_mfg_aprv_sts_typ_META = createCommonMeta($ma_mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta ma_aprv_dt_META = createCommonMeta($ma_aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ma_aprv_dpt_cd_META = createCommonMeta($ma_aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ma_aprv_usr_cd_META = createCommonMeta($ma_aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ma_aprv_tm_META = createCommonMeta($ma_aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ma_aprv_rsn_META = createCommonMeta($ma_aprv_rsn, mcframe.commonMS.meta.MS_META.APRV_RSN);
	public static final MCMeta ma_act_prnt_flg_META = createCommonMeta($ma_act_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ma_act_prnt_tm_META = createCommonMeta($ma_act_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ma_seq_META = createCommonMeta($ma_seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta ma_act_dpt_cd_META = createCommonMeta($ma_act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ma_act_usr_cd_META = createCommonMeta($ma_act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ma_arr_purc_auto_reg_flg_META = createCommonMeta($ma_arr_purc_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ma_intr_rmrks_META = createCommonMeta($ma_intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_INTR_RMRKS);
	public static final MCMeta ma_act_rpt_rmrks_META = createCommonMeta($ma_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_RPT_RMRKS);
	public static final MCMeta ma_sub_char1_META = createCommonMeta($ma_sub_char1, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR1);
	public static final MCMeta ma_sub_char2_META = createCommonMeta($ma_sub_char2, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR2);
	public static final MCMeta ma_sub_char3_META = createCommonMeta($ma_sub_char3, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVT_MFG_INST_ACT_R> constMetas = new ConstMetaList<MSVT_MFG_INST_ACT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			mfg_inst_no_META,
			div_seq_META,
			mi_mfg_inst_rev_META,
			mi_itm_mfg_inst_no_META,
			mi_po_d_no_META,
			mi_base_unit_yield_qty_META,
			mi_base_unit_inst_qty_META,
			mi_base_unit_cd_META,
			mi_st_schd_tm_META,
			mi_end_schd_tm_META,
			mi_rqst_dlv_rqst_tm_META,
			mi_inst_dt_META,
			mi_inst_prnt_tm_META,
			mi_inst_prnt_flg_META,
			mi_aprv_flg_META,
			mi_mfg_aprv_sts_typ_META,
			mi_aprv_dt_META,
			mi_aprv_dpt_cd_META,
			mi_aprv_usr_cd_META,
			mi_aprv_tm_META,
			mi_aprv_rsn_META,
			mi_mfg_aprv_role_cd_META,
			mi_disp_pd_META,
			mi_inst_dpt_cd_META,
			mi_inst_usr_cd_META,
			mi_can_flg_META,
			mi_abort_flg_META,
			mi_schd_chg_flg_META,
			mi_po_locked_flg_META,
			mi_po_auto_reg_flg_META,
			mi_mfg_inst_unit_typ_META,
			mi_intr_rmrks_META,
			mi_inst_rpt_rmrks_META,
			mi_inst_po_cnt_rmrks_META,
			mi_sub_char1_META,
			mi_sub_char2_META,
			mi_sub_char3_META,
			imi_itm_ord_no_META,
			imi_io_schd_pr_no_META,
			imi_frst_mfg_inst_no_META,
			imi_mfg_mtd_typ_META,
			imi_sppl_cd_META,
			imi_itm_cd_META,
			imi_itm_sub1_META,
			imi_itm_sub2_META,
			imi_itm_sub3_META,
			imi_oper_ptn_META,
			imi_bom_ptn_META,
			imi_base_unit_yield_qty_META,
			imi_base_unit_inst_qty_META,
			imi_base_unit_cd_META,
			imi_master_dt_META,
			imi_lot_no_META,
			imi_sublot_no_META,
			imi_sno1_META,
			imi_sno2_META,
			imi_sno3_META,
			imi_sno4_META,
			imi_unschd_inst_flg_META,
			imi_unschd_act_flg_META,
			imi_strg_loc_cd_META,
			imi_strg_str_ln_cd_META,
			imi_mfg_loc_cd_META,
			imi_mfg_str_ln_cd_META,
			imi_wg_cd_META,
			imi_site_cd_META,
			imi_itm_lower_yield_META,
			imi_itm_std_yield_META,
			imi_itm_upper_yield_META,
			imi_sub_char1_META,
			imi_sub_char2_META,
			imi_sub_char3_META,
			mpr_mfg_sts_typ_META,
			mpr_base_unit_mfg_rem_qty_META,
			ma_mfg_act_no_META,
			ma_mfg_inst_no_META,
			ma_div_seq_META,
			ma_itm_mfg_inst_no_META,
			ma_trd_cd_META,
			ma_st_act_tm_META,
			ma_end_act_tm_META,
			ma_base_unit_yield_qty_META,
			ma_base_unit_dfct_qty_META,
			ma_base_unit_cd_META,
			ma_st_ac_dt_META,
			ma_end_ac_dt_META,
			ma_itm_yield_META,
			ma_mfg_aprv_sts_typ_META,
			ma_aprv_dt_META,
			ma_aprv_dpt_cd_META,
			ma_aprv_usr_cd_META,
			ma_aprv_tm_META,
			ma_aprv_rsn_META,
			ma_act_prnt_flg_META,
			ma_act_prnt_tm_META,
			ma_seq_META,
			ma_act_dpt_cd_META,
			ma_act_usr_cd_META,
			ma_arr_purc_auto_reg_flg_META,
			ma_intr_rmrks_META,
			ma_act_rpt_rmrks_META,
			ma_sub_char1_META,
			ma_sub_char2_META,
			ma_sub_char3_META
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
	protected MSVT_MFG_INST_ACT_R(ConstMetaList<? extends MSVT_MFG_INST_ACT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVT_MFG_INST_ACT_R(ConstMetaList<? extends MSVT_MFG_INST_ACT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$div_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$div_seq,
				"div_seq",
				div_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_mfg_inst_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$mi_mfg_inst_rev,
				"mi_mfg_inst_rev",
				mi_mfg_inst_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_itm_mfg_inst_no,
				"mi_itm_mfg_inst_no",
				mi_itm_mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_po_d_no,
				"mi_po_d_no",
				mi_po_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_base_unit_yield_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$mi_base_unit_yield_qty,
				"mi_base_unit_yield_qty",
				mi_base_unit_yield_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_base_unit_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$mi_base_unit_inst_qty,
				"mi_base_unit_inst_qty",
				mi_base_unit_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_base_unit_cd,
				"mi_base_unit_cd",
				mi_base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$mi_st_schd_tm,
				"mi_st_schd_tm",
				mi_st_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$mi_end_schd_tm,
				"mi_end_schd_tm",
				mi_end_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_rqst_dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$mi_rqst_dlv_rqst_tm,
				"mi_rqst_dlv_rqst_tm",
				mi_rqst_dlv_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_inst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$mi_inst_dt,
				"mi_inst_dt",
				mi_inst_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_inst_prnt_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$mi_inst_prnt_tm,
				"mi_inst_prnt_tm",
				mi_inst_prnt_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_inst_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$mi_inst_prnt_flg,
				"mi_inst_prnt_flg",
				mi_inst_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$mi_aprv_flg,
				"mi_aprv_flg",
				mi_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_mfg_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_mfg_aprv_sts_typ,
				"mi_mfg_aprv_sts_typ",
				mi_mfg_aprv_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_aprv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$mi_aprv_dt,
				"mi_aprv_dt",
				mi_aprv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_aprv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_aprv_dpt_cd,
				"mi_aprv_dpt_cd",
				mi_aprv_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_aprv_usr_cd,
				"mi_aprv_usr_cd",
				mi_aprv_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_aprv_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$mi_aprv_tm,
				"mi_aprv_tm",
				mi_aprv_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_aprv_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_aprv_rsn,
				"mi_aprv_rsn",
				mi_aprv_rsn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_mfg_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_mfg_aprv_role_cd,
				"mi_mfg_aprv_role_cd",
				mi_mfg_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_disp_pd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_disp_pd,
				"mi_disp_pd",
				mi_disp_pd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_inst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_inst_dpt_cd,
				"mi_inst_dpt_cd",
				mi_inst_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_inst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_inst_usr_cd,
				"mi_inst_usr_cd",
				mi_inst_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$mi_can_flg,
				"mi_can_flg",
				mi_can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$mi_abort_flg,
				"mi_abort_flg",
				mi_abort_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_schd_chg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$mi_schd_chg_flg,
				"mi_schd_chg_flg",
				mi_schd_chg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_po_locked_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$mi_po_locked_flg,
				"mi_po_locked_flg",
				mi_po_locked_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_po_auto_reg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$mi_po_auto_reg_flg,
				"mi_po_auto_reg_flg",
				mi_po_auto_reg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_mfg_inst_unit_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_mfg_inst_unit_typ,
				"mi_mfg_inst_unit_typ",
				mi_mfg_inst_unit_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_intr_rmrks,
				"mi_intr_rmrks",
				mi_intr_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_inst_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_inst_rpt_rmrks,
				"mi_inst_rpt_rmrks",
				mi_inst_rpt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_inst_po_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_inst_po_cnt_rmrks,
				"mi_inst_po_cnt_rmrks",
				mi_inst_po_cnt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_sub_char1,
				"mi_sub_char1",
				mi_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_sub_char2,
				"mi_sub_char2",
				mi_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mi_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mi_sub_char3,
				"mi_sub_char3",
				mi_sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_itm_ord_no,
				"imi_itm_ord_no",
				imi_itm_ord_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_io_schd_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_io_schd_pr_no,
				"imi_io_schd_pr_no",
				imi_io_schd_pr_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_frst_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_frst_mfg_inst_no,
				"imi_frst_mfg_inst_no",
				imi_frst_mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_mfg_mtd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_mfg_mtd_typ,
				"imi_mfg_mtd_typ",
				imi_mfg_mtd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_sppl_cd,
				"imi_sppl_cd",
				imi_sppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_itm_cd,
				"imi_itm_cd",
				imi_itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_itm_sub1,
				"imi_itm_sub1",
				imi_itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_itm_sub2,
				"imi_itm_sub2",
				imi_itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_itm_sub3,
				"imi_itm_sub3",
				imi_itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_oper_ptn,
				"imi_oper_ptn",
				imi_oper_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_bom_ptn,
				"imi_bom_ptn",
				imi_bom_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_base_unit_yield_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$imi_base_unit_yield_qty,
				"imi_base_unit_yield_qty",
				imi_base_unit_yield_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_base_unit_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$imi_base_unit_inst_qty,
				"imi_base_unit_inst_qty",
				imi_base_unit_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_base_unit_cd,
				"imi_base_unit_cd",
				imi_base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_master_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$imi_master_dt,
				"imi_master_dt",
				imi_master_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_lot_no,
				"imi_lot_no",
				imi_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_sublot_no,
				"imi_sublot_no",
				imi_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_sno1,
				"imi_sno1",
				imi_sno1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_sno2,
				"imi_sno2",
				imi_sno2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_sno3,
				"imi_sno3",
				imi_sno3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_sno4,
				"imi_sno4",
				imi_sno4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_unschd_inst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$imi_unschd_inst_flg,
				"imi_unschd_inst_flg",
				imi_unschd_inst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_unschd_act_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$imi_unschd_act_flg,
				"imi_unschd_act_flg",
				imi_unschd_act_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_strg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_strg_loc_cd,
				"imi_strg_loc_cd",
				imi_strg_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_strg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_strg_str_ln_cd,
				"imi_strg_str_ln_cd",
				imi_strg_str_ln_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_mfg_loc_cd,
				"imi_mfg_loc_cd",
				imi_mfg_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_mfg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_mfg_str_ln_cd,
				"imi_mfg_str_ln_cd",
				imi_mfg_str_ln_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_wg_cd,
				"imi_wg_cd",
				imi_wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_site_cd,
				"imi_site_cd",
				imi_site_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_itm_lower_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$imi_itm_lower_yield,
				"imi_itm_lower_yield",
				imi_itm_lower_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_itm_std_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$imi_itm_std_yield,
				"imi_itm_std_yield",
				imi_itm_std_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_itm_upper_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$imi_itm_upper_yield,
				"imi_itm_upper_yield",
				imi_itm_upper_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_sub_char1,
				"imi_sub_char1",
				imi_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_sub_char2,
				"imi_sub_char2",
				imi_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$imi_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$imi_sub_char3,
				"imi_sub_char3",
				imi_sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mpr_mfg_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$mpr_mfg_sts_typ,
				"mpr_mfg_sts_typ",
				mpr_mfg_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$mpr_base_unit_mfg_rem_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$mpr_base_unit_mfg_rem_qty,
				"mpr_base_unit_mfg_rem_qty",
				mpr_base_unit_mfg_rem_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_mfg_act_no,
				"ma_mfg_act_no",
				ma_mfg_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_mfg_inst_no,
				"ma_mfg_inst_no",
				ma_mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_div_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$ma_div_seq,
				"ma_div_seq",
				ma_div_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_itm_mfg_inst_no,
				"ma_itm_mfg_inst_no",
				ma_itm_mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_trd_cd,
				"ma_trd_cd",
				ma_trd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_st_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$ma_st_act_tm,
				"ma_st_act_tm",
				ma_st_act_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_end_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$ma_end_act_tm,
				"ma_end_act_tm",
				ma_end_act_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_base_unit_yield_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$ma_base_unit_yield_qty,
				"ma_base_unit_yield_qty",
				ma_base_unit_yield_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_base_unit_dfct_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$ma_base_unit_dfct_qty,
				"ma_base_unit_dfct_qty",
				ma_base_unit_dfct_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_base_unit_cd,
				"ma_base_unit_cd",
				ma_base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_st_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$ma_st_ac_dt,
				"ma_st_ac_dt",
				ma_st_ac_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_end_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$ma_end_ac_dt,
				"ma_end_ac_dt",
				ma_end_ac_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_itm_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$ma_itm_yield,
				"ma_itm_yield",
				ma_itm_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_mfg_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_mfg_aprv_sts_typ,
				"ma_mfg_aprv_sts_typ",
				ma_mfg_aprv_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_aprv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$ma_aprv_dt,
				"ma_aprv_dt",
				ma_aprv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_aprv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_aprv_dpt_cd,
				"ma_aprv_dpt_cd",
				ma_aprv_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_aprv_usr_cd,
				"ma_aprv_usr_cd",
				ma_aprv_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_aprv_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$ma_aprv_tm,
				"ma_aprv_tm",
				ma_aprv_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_aprv_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_aprv_rsn,
				"ma_aprv_rsn",
				ma_aprv_rsn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_act_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$ma_act_prnt_flg,
				"ma_act_prnt_flg",
				ma_act_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_act_prnt_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MFG_INST_ACT_R.$ma_act_prnt_tm,
				"ma_act_prnt_tm",
				ma_act_prnt_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MFG_INST_ACT_R.$ma_seq,
				"ma_seq",
				ma_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_act_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_act_dpt_cd,
				"ma_act_dpt_cd",
				ma_act_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_act_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_act_usr_cd,
				"ma_act_usr_cd",
				ma_act_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_arr_purc_auto_reg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_MFG_INST_ACT_R.$ma_arr_purc_auto_reg_flg,
				"ma_arr_purc_auto_reg_flg",
				ma_arr_purc_auto_reg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_intr_rmrks,
				"ma_intr_rmrks",
				ma_intr_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_act_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_act_rpt_rmrks,
				"ma_act_rpt_rmrks",
				ma_act_rpt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_sub_char1,
				"ma_sub_char1",
				ma_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_sub_char2,
				"ma_sub_char2",
				ma_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MFG_INST_ACT_R.$ma_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MFG_INST_ACT_R.$ma_sub_char3,
				"ma_sub_char3",
				ma_sub_char3,
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
	public static MSVT_MFG_INST_ACT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVT_MFG_INST_ACT_R create(String alias) {
		MSVT_MFG_INST_ACT_R row = new MSVT_MFG_INST_ACT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVT_MFG_INST_ACT_R createByName(T proto) {
		MSVT_MFG_INST_ACT_R row = MSVT_MFG_INST_ACT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_MFG_INST_ACT_R clone() {
		return (MSVT_MFG_INST_ACT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_MFG_INST_ACT_R createInstance() {
		return (MSVT_MFG_INST_ACT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_MFG_INST_ACT_R getValues(String... names) {
		return (MSVT_MFG_INST_ACT_R) super.getValues(names);
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
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 0, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 0, $mfg_inst_no, value);
	}

	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 1, $div_seq);
	}

	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 1, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 1, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 1, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 1, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 1, $div_seq, value);
	}
	
	/**
	 * （製造指図）製造指図改訂番号. (Mfg. order) Mfg. order rev. number.<p>
	 *
	 */
	public MCNumber mi_mfg_inst_rev() {
		return getConstNumber(offset + 2, $mi_mfg_inst_rev);
	}

	/**
	 * （製造指図）製造指図改訂番号. (Mfg. order) Mfg. order rev. number.<p>
	 *
	 */
	public void mi_mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 2, $mi_mfg_inst_rev, value);
	}
	
	/**
	 * （製造指図）製造指図改訂番号. (Mfg. order) Mfg. order rev. number.<p>
	 *
	 */
	public void mi_mfg_inst_rev(int value) {
		setConstNumber(offset + 2, $mi_mfg_inst_rev, value);
	}
	
	/**
	 * （製造指図）製造指図改訂番号. (Mfg. order) Mfg. order rev. number.<p>
	 *
	 */
	public void mi_mfg_inst_rev(long value) {
		setConstNumber(offset + 2, $mi_mfg_inst_rev, value);
	}
	
	/**
	 * （製造指図）製造指図改訂番号. (Mfg. order) Mfg. order rev. number.<p>
	 *
	 */
	public void mi_mfg_inst_rev(float value) {
		setConstNumber(offset + 2, $mi_mfg_inst_rev, value);
	}
	
	/**
	 * （製造指図）製造指図改訂番号. (Mfg. order) Mfg. order rev. number.<p>
	 *
	 */
	public void mi_mfg_inst_rev(double value) {
		setConstNumber(offset + 2, $mi_mfg_inst_rev, value);
	}
	
	/**
	 * （製造指図）品目製造指図ＮＯ. (Mfg. order) Item mfg. order No..<p>
	 *
	 */
	public String mi_itm_mfg_inst_no() {
		return getConstString(offset + 3, $mi_itm_mfg_inst_no);
	}

	/**
	 * （製造指図）品目製造指図ＮＯ. (Mfg. order) Item mfg. order No..<p>
	 *
	 */
	public void mi_itm_mfg_inst_no(String value) {
		setConstString(offset + 3, $mi_itm_mfg_inst_no, value);
	}

	/**
	 * （製造指図）発注明細ＮＯ. (Mfg. order) PO details No..<p>
	 *
	 */
	public String mi_po_d_no() {
		return getConstString(offset + 4, $mi_po_d_no);
	}

	/**
	 * （製造指図）発注明細ＮＯ. (Mfg. order) PO details No..<p>
	 *
	 */
	public void mi_po_d_no(String value) {
		setConstString(offset + 4, $mi_po_d_no, value);
	}

	/**
	 * （製造指図）基準単位出来高予定数量. (Mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public MCNumber mi_base_unit_yield_qty() {
		return getConstNumber(offset + 5, $mi_base_unit_yield_qty);
	}

	/**
	 * （製造指図）基準単位出来高予定数量. (Mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public void mi_base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 5, $mi_base_unit_yield_qty, value);
	}
	
	/**
	 * （製造指図）基準単位出来高予定数量. (Mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public void mi_base_unit_yield_qty(int value) {
		setConstNumber(offset + 5, $mi_base_unit_yield_qty, value);
	}
	
	/**
	 * （製造指図）基準単位出来高予定数量. (Mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public void mi_base_unit_yield_qty(long value) {
		setConstNumber(offset + 5, $mi_base_unit_yield_qty, value);
	}
	
	/**
	 * （製造指図）基準単位出来高予定数量. (Mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public void mi_base_unit_yield_qty(float value) {
		setConstNumber(offset + 5, $mi_base_unit_yield_qty, value);
	}
	
	/**
	 * （製造指図）基準単位出来高予定数量. (Mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public void mi_base_unit_yield_qty(double value) {
		setConstNumber(offset + 5, $mi_base_unit_yield_qty, value);
	}
	
	/**
	 * （製造指図）基準単位製造指図数量. (Mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public MCNumber mi_base_unit_inst_qty() {
		return getConstNumber(offset + 6, $mi_base_unit_inst_qty);
	}

	/**
	 * （製造指図）基準単位製造指図数量. (Mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public void mi_base_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 6, $mi_base_unit_inst_qty, value);
	}
	
	/**
	 * （製造指図）基準単位製造指図数量. (Mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public void mi_base_unit_inst_qty(int value) {
		setConstNumber(offset + 6, $mi_base_unit_inst_qty, value);
	}
	
	/**
	 * （製造指図）基準単位製造指図数量. (Mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public void mi_base_unit_inst_qty(long value) {
		setConstNumber(offset + 6, $mi_base_unit_inst_qty, value);
	}
	
	/**
	 * （製造指図）基準単位製造指図数量. (Mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public void mi_base_unit_inst_qty(float value) {
		setConstNumber(offset + 6, $mi_base_unit_inst_qty, value);
	}
	
	/**
	 * （製造指図）基準単位製造指図数量. (Mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public void mi_base_unit_inst_qty(double value) {
		setConstNumber(offset + 6, $mi_base_unit_inst_qty, value);
	}
	
	/**
	 * （製造指図）基準単位ＣＤ. (Mfg. order) Base unit cd..<p>
	 *
	 */
	public String mi_base_unit_cd() {
		return getConstString(offset + 7, $mi_base_unit_cd);
	}

	/**
	 * （製造指図）基準単位ＣＤ. (Mfg. order) Base unit cd..<p>
	 *
	 */
	public void mi_base_unit_cd(String value) {
		setConstString(offset + 7, $mi_base_unit_cd, value);
	}

	/**
	 * （製造指図）着手予定日時. (Mfg. order) Scheduled start date and time.<p>
	 *
	 */
	public MCDate mi_st_schd_tm() {
		return getConstDate(offset + 8, $mi_st_schd_tm);
	}

	/**
	 * （製造指図）着手予定日時. (Mfg. order) Scheduled start date and time.<p>
	 *
	 */
	public void mi_st_schd_tm(MCDate value) {
		setConstDate(offset + 8, $mi_st_schd_tm, value);
	}

	/**
	 * （製造指図）終了予定日時. (Mfg. order) Scheduled end date and time.<p>
	 *
	 */
	public MCDate mi_end_schd_tm() {
		return getConstDate(offset + 9, $mi_end_schd_tm);
	}

	/**
	 * （製造指図）終了予定日時. (Mfg. order) Scheduled end date and time.<p>
	 *
	 */
	public void mi_end_schd_tm(MCDate value) {
		setConstDate(offset + 9, $mi_end_schd_tm, value);
	}

	/**
	 * （製造指図）納入希望日時. (Mfg. order) Desired delivery date and time.<p>
	 *
	 */
	public MCDate mi_rqst_dlv_rqst_tm() {
		return getConstDate(offset + 10, $mi_rqst_dlv_rqst_tm);
	}

	/**
	 * （製造指図）納入希望日時. (Mfg. order) Desired delivery date and time.<p>
	 *
	 */
	public void mi_rqst_dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 10, $mi_rqst_dlv_rqst_tm, value);
	}

	/**
	 * （製造指図）指図日. (Mfg. order) Order date.<p>
	 *
	 */
	public MCDate mi_inst_dt() {
		return getConstDate(offset + 11, $mi_inst_dt);
	}

	/**
	 * （製造指図）指図日. (Mfg. order) Order date.<p>
	 *
	 */
	public void mi_inst_dt(MCDate value) {
		setConstDate(offset + 11, $mi_inst_dt, value);
	}

	/**
	 * （製造指図）指図書発行日時. (Mfg. order) Order sheet issued date and time.<p>
	 *
	 */
	public MCDate mi_inst_prnt_tm() {
		return getConstDate(offset + 12, $mi_inst_prnt_tm);
	}

	/**
	 * （製造指図）指図書発行日時. (Mfg. order) Order sheet issued date and time.<p>
	 *
	 */
	public void mi_inst_prnt_tm(MCDate value) {
		setConstDate(offset + 12, $mi_inst_prnt_tm, value);
	}

	/**
	 * （製造指図）指図書発行済ＦＬＧ. (Mfg. order) Order sheet issued flg..<p>
	 *
	 */
	public boolean mi_inst_prnt_flg() {
		return getConstBoolean(offset + 13, $mi_inst_prnt_flg);
	}

	/**
	 * （製造指図）指図書発行済ＦＬＧ. (Mfg. order) Order sheet issued flg..<p>
	 *
	 */
	public void mi_inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 13, $mi_inst_prnt_flg, value);
	}

	/**
	 * （製造指図）承認対象ＦＬＧ. (Mfg. order) For approval flg..<p>
	 *
	 */
	public boolean mi_aprv_flg() {
		return getConstBoolean(offset + 14, $mi_aprv_flg);
	}

	/**
	 * （製造指図）承認対象ＦＬＧ. (Mfg. order) For approval flg..<p>
	 *
	 */
	public void mi_aprv_flg(boolean value) {
		setConstBoolean(offset + 14, $mi_aprv_flg, value);
	}

	/**
	 * （製造指図）製造承認状況区分. (Mfg. order) Mfg. approval status type.<p>
	 *
	 */
	public String mi_mfg_aprv_sts_typ() {
		return getConstString(offset + 15, $mi_mfg_aprv_sts_typ);
	}

	/**
	 * （製造指図）製造承認状況区分. (Mfg. order) Mfg. approval status type.<p>
	 *
	 */
	public void mi_mfg_aprv_sts_typ(String value) {
		setConstString(offset + 15, $mi_mfg_aprv_sts_typ, value);
	}

	/**
	 * （製造指図）承認日. (Mfg. order) Approval date.<p>
	 *
	 */
	public MCDate mi_aprv_dt() {
		return getConstDate(offset + 16, $mi_aprv_dt);
	}

	/**
	 * （製造指図）承認日. (Mfg. order) Approval date.<p>
	 *
	 */
	public void mi_aprv_dt(MCDate value) {
		setConstDate(offset + 16, $mi_aprv_dt, value);
	}

	/**
	 * （製造指図）承認部門ＣＤ. (Mfg. order) Approval dept. cd..<p>
	 *
	 */
	public String mi_aprv_dpt_cd() {
		return getConstString(offset + 17, $mi_aprv_dpt_cd);
	}

	/**
	 * （製造指図）承認部門ＣＤ. (Mfg. order) Approval dept. cd..<p>
	 *
	 */
	public void mi_aprv_dpt_cd(String value) {
		setConstString(offset + 17, $mi_aprv_dpt_cd, value);
	}

	/**
	 * （製造指図）承認者ＣＤ. (Mfg. order) Approver cd..<p>
	 *
	 */
	public String mi_aprv_usr_cd() {
		return getConstString(offset + 18, $mi_aprv_usr_cd);
	}

	/**
	 * （製造指図）承認者ＣＤ. (Mfg. order) Approver cd..<p>
	 *
	 */
	public void mi_aprv_usr_cd(String value) {
		setConstString(offset + 18, $mi_aprv_usr_cd, value);
	}

	/**
	 * （製造指図）承認日時. (Mfg. order) Approval date and time.<p>
	 *
	 */
	public MCDate mi_aprv_tm() {
		return getConstDate(offset + 19, $mi_aprv_tm);
	}

	/**
	 * （製造指図）承認日時. (Mfg. order) Approval date and time.<p>
	 *
	 */
	public void mi_aprv_tm(MCDate value) {
		setConstDate(offset + 19, $mi_aprv_tm, value);
	}

	/**
	 * （製造指図）承認理由. (Mfg. order) Approval reason.<p>
	 *
	 */
	public String mi_aprv_rsn() {
		return getConstString(offset + 20, $mi_aprv_rsn);
	}

	/**
	 * （製造指図）承認理由. (Mfg. order) Approval reason.<p>
	 *
	 */
	public void mi_aprv_rsn(String value) {
		setConstString(offset + 20, $mi_aprv_rsn, value);
	}

	/**
	 * （製造指図）製造承認役割ＣＤ. (Mfg. order) Mfg. approval role cd..<p>
	 *
	 */
	public String mi_mfg_aprv_role_cd() {
		return getConstString(offset + 21, $mi_mfg_aprv_role_cd);
	}

	/**
	 * （製造指図）製造承認役割ＣＤ. (Mfg. order) Mfg. approval role cd..<p>
	 *
	 */
	public void mi_mfg_aprv_role_cd(String value) {
		setConstString(offset + 21, $mi_mfg_aprv_role_cd, value);
	}

	/**
	 * （製造指図）印字用表示期限. (Mfg. order) Display expiration for print.<p>
	 *
	 */
	public String mi_disp_pd() {
		return getConstString(offset + 22, $mi_disp_pd);
	}

	/**
	 * （製造指図）印字用表示期限. (Mfg. order) Display expiration for print.<p>
	 *
	 */
	public void mi_disp_pd(String value) {
		setConstString(offset + 22, $mi_disp_pd, value);
	}

	/**
	 * （製造指図）指図部門ＣＤ. (Mfg. order) Order dept. cd..<p>
	 *
	 */
	public String mi_inst_dpt_cd() {
		return getConstString(offset + 23, $mi_inst_dpt_cd);
	}

	/**
	 * （製造指図）指図部門ＣＤ. (Mfg. order) Order dept. cd..<p>
	 *
	 */
	public void mi_inst_dpt_cd(String value) {
		setConstString(offset + 23, $mi_inst_dpt_cd, value);
	}

	/**
	 * （製造指図）指図担当者ＣＤ. (Mfg. order) Order PIC cd..<p>
	 *
	 */
	public String mi_inst_usr_cd() {
		return getConstString(offset + 24, $mi_inst_usr_cd);
	}

	/**
	 * （製造指図）指図担当者ＣＤ. (Mfg. order) Order PIC cd..<p>
	 *
	 */
	public void mi_inst_usr_cd(String value) {
		setConstString(offset + 24, $mi_inst_usr_cd, value);
	}

	/**
	 * （製造指図）取消ＦＬＧ. (Mfg. order) Cancellation flg..<p>
	 *
	 */
	public boolean mi_can_flg() {
		return getConstBoolean(offset + 25, $mi_can_flg);
	}

	/**
	 * （製造指図）取消ＦＬＧ. (Mfg. order) Cancellation flg..<p>
	 *
	 */
	public void mi_can_flg(boolean value) {
		setConstBoolean(offset + 25, $mi_can_flg, value);
	}

	/**
	 * （製造指図）打切ＦＬＧ. (Mfg. order) Cancel remaining flg..<p>
	 *
	 */
	public boolean mi_abort_flg() {
		return getConstBoolean(offset + 26, $mi_abort_flg);
	}

	/**
	 * （製造指図）打切ＦＬＧ. (Mfg. order) Cancel remaining flg..<p>
	 *
	 */
	public void mi_abort_flg(boolean value) {
		setConstBoolean(offset + 26, $mi_abort_flg, value);
	}

	/**
	 * （製造指図）計画変更ＦＬＧ. (Mfg. order) Plan change flg..<p>
	 *
	 */
	public boolean mi_schd_chg_flg() {
		return getConstBoolean(offset + 27, $mi_schd_chg_flg);
	}

	/**
	 * （製造指図）計画変更ＦＬＧ. (Mfg. order) Plan change flg..<p>
	 *
	 */
	public void mi_schd_chg_flg(boolean value) {
		setConstBoolean(offset + 27, $mi_schd_chg_flg, value);
	}

	/**
	 * （製造指図）発注訂正・取消不可ＦＬＧ. Do not allow (mfg. order) po correction/cancel flg..<p>
	 *
	 */
	public boolean mi_po_locked_flg() {
		return getConstBoolean(offset + 28, $mi_po_locked_flg);
	}

	/**
	 * （製造指図）発注訂正・取消不可ＦＬＧ. Do not allow (mfg. order) po correction/cancel flg..<p>
	 *
	 */
	public void mi_po_locked_flg(boolean value) {
		setConstBoolean(offset + 28, $mi_po_locked_flg, value);
	}

	/**
	 * （製造指図）発注時自動作成ＦＬＧ. (Mfg. order) Auto-create flg. at PO.<p>
	 *
	 */
	public boolean mi_po_auto_reg_flg() {
		return getConstBoolean(offset + 29, $mi_po_auto_reg_flg);
	}

	/**
	 * （製造指図）発注時自動作成ＦＬＧ. (Mfg. order) Auto-create flg. at PO.<p>
	 *
	 */
	public void mi_po_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 29, $mi_po_auto_reg_flg, value);
	}

	/**
	 * （製造指図）製造指図単位区分. (Mfg. order) Mfg. order unit type.<p>
	 *
	 */
	public String mi_mfg_inst_unit_typ() {
		return getConstString(offset + 30, $mi_mfg_inst_unit_typ);
	}

	/**
	 * （製造指図）製造指図単位区分. (Mfg. order) Mfg. order unit type.<p>
	 *
	 */
	public void mi_mfg_inst_unit_typ(String value) {
		setConstString(offset + 30, $mi_mfg_inst_unit_typ, value);
	}

	/**
	 * （製造指図）内部備考. (Mfg. order) Internal remarks.<p>
	 *
	 */
	public String mi_intr_rmrks() {
		return getConstString(offset + 31, $mi_intr_rmrks);
	}

	/**
	 * （製造指図）内部備考. (Mfg. order) Internal remarks.<p>
	 *
	 */
	public void mi_intr_rmrks(String value) {
		setConstString(offset + 31, $mi_intr_rmrks, value);
	}

	/**
	 * （製造指図）指図書備考. (Mfg. order) Order sheet remarks.<p>
	 *
	 */
	public String mi_inst_rpt_rmrks() {
		return getConstString(offset + 32, $mi_inst_rpt_rmrks);
	}

	/**
	 * （製造指図）指図書備考. (Mfg. order) Order sheet remarks.<p>
	 *
	 */
	public void mi_inst_rpt_rmrks(String value) {
		setConstString(offset + 32, $mi_inst_rpt_rmrks, value);
	}

	/**
	 * （製造指図）指図・発注連絡備考. (Mfg. order) Order/PO contact remarks.<p>
	 *
	 */
	public String mi_inst_po_cnt_rmrks() {
		return getConstString(offset + 33, $mi_inst_po_cnt_rmrks);
	}

	/**
	 * （製造指図）指図・発注連絡備考. (Mfg. order) Order/PO contact remarks.<p>
	 *
	 */
	public void mi_inst_po_cnt_rmrks(String value) {
		setConstString(offset + 33, $mi_inst_po_cnt_rmrks, value);
	}

	/**
	 * （製造指図）予備１. (Mfg. order) Spare 1.<p>
	 *
	 */
	public String mi_sub_char1() {
		return getConstString(offset + 34, $mi_sub_char1);
	}

	/**
	 * （製造指図）予備１. (Mfg. order) Spare 1.<p>
	 *
	 */
	public void mi_sub_char1(String value) {
		setConstString(offset + 34, $mi_sub_char1, value);
	}

	/**
	 * （製造指図）予備２. (Mfg. order) Spare 2.<p>
	 *
	 */
	public String mi_sub_char2() {
		return getConstString(offset + 35, $mi_sub_char2);
	}

	/**
	 * （製造指図）予備２. (Mfg. order) Spare 2.<p>
	 *
	 */
	public void mi_sub_char2(String value) {
		setConstString(offset + 35, $mi_sub_char2, value);
	}

	/**
	 * （製造指図）予備３. (Mfg. order) Spare 3.<p>
	 *
	 */
	public String mi_sub_char3() {
		return getConstString(offset + 36, $mi_sub_char3);
	}

	/**
	 * （製造指図）予備３. (Mfg. order) Spare 3.<p>
	 *
	 */
	public void mi_sub_char3(String value) {
		setConstString(offset + 36, $mi_sub_char3, value);
	}

	/**
	 * （品目製造指図）品目オーダＮＯ. (Item mfg. order) Item order No..<p>
	 *
	 */
	public String imi_itm_ord_no() {
		return getConstString(offset + 37, $imi_itm_ord_no);
	}

	/**
	 * （品目製造指図）品目オーダＮＯ. (Item mfg. order) Item order No..<p>
	 *
	 */
	public void imi_itm_ord_no(String value) {
		setConstString(offset + 37, $imi_itm_ord_no, value);
	}

	/**
	 * （品目製造指図）受払進捗管理ＮＯ. (Item mfg. order) GR/GI progress management No..<p>
	 *
	 */
	public String imi_io_schd_pr_no() {
		return getConstString(offset + 38, $imi_io_schd_pr_no);
	}

	/**
	 * （品目製造指図）受払進捗管理ＮＯ. (Item mfg. order) GR/GI progress management No..<p>
	 *
	 */
	public void imi_io_schd_pr_no(String value) {
		setConstString(offset + 38, $imi_io_schd_pr_no, value);
	}

	/**
	 * （品目製造指図）初回製造指図ＮＯ. (Item mfg. order) Initial mfg. order No..<p>
	 *
	 */
	public String imi_frst_mfg_inst_no() {
		return getConstString(offset + 39, $imi_frst_mfg_inst_no);
	}

	/**
	 * （品目製造指図）初回製造指図ＮＯ. (Item mfg. order) Initial mfg. order No..<p>
	 *
	 */
	public void imi_frst_mfg_inst_no(String value) {
		setConstString(offset + 39, $imi_frst_mfg_inst_no, value);
	}

	/**
	 * （品目製造指図）生産方法区分. (Item mfg. order) Production method type.<p>
	 *
	 */
	public String imi_mfg_mtd_typ() {
		return getConstString(offset + 40, $imi_mfg_mtd_typ);
	}

	/**
	 * （品目製造指図）生産方法区分. (Item mfg. order) Production method type.<p>
	 *
	 */
	public void imi_mfg_mtd_typ(String value) {
		setConstString(offset + 40, $imi_mfg_mtd_typ, value);
	}

	/**
	 * （品目製造指図）外注先ＣＤ. (Item mfg. order) Subcontractor cd..<p>
	 *
	 */
	public String imi_sppl_cd() {
		return getConstString(offset + 41, $imi_sppl_cd);
	}

	/**
	 * （品目製造指図）外注先ＣＤ. (Item mfg. order) Subcontractor cd..<p>
	 *
	 */
	public void imi_sppl_cd(String value) {
		setConstString(offset + 41, $imi_sppl_cd, value);
	}

	/**
	 * （品目製造指図）品目ＣＤ. (Item mfg. order) Item cd..<p>
	 *
	 */
	public String imi_itm_cd() {
		return getConstString(offset + 42, $imi_itm_cd);
	}

	/**
	 * （品目製造指図）品目ＣＤ. (Item mfg. order) Item cd..<p>
	 *
	 */
	public void imi_itm_cd(String value) {
		setConstString(offset + 42, $imi_itm_cd, value);
	}

	/**
	 * （品目製造指図）枝番１. (Item mfg. order) Branch No. 1.<p>
	 *
	 */
	public String imi_itm_sub1() {
		return getConstString(offset + 43, $imi_itm_sub1);
	}

	/**
	 * （品目製造指図）枝番１. (Item mfg. order) Branch No. 1.<p>
	 *
	 */
	public void imi_itm_sub1(String value) {
		setConstString(offset + 43, $imi_itm_sub1, value);
	}

	/**
	 * （品目製造指図）枝番２. (Item mfg. order) Branch No. 2.<p>
	 *
	 */
	public String imi_itm_sub2() {
		return getConstString(offset + 44, $imi_itm_sub2);
	}

	/**
	 * （品目製造指図）枝番２. (Item mfg. order) Branch No. 2.<p>
	 *
	 */
	public void imi_itm_sub2(String value) {
		setConstString(offset + 44, $imi_itm_sub2, value);
	}

	/**
	 * （品目製造指図）枝番３. (Item mfg. order) Branch No. 3.<p>
	 *
	 */
	public String imi_itm_sub3() {
		return getConstString(offset + 45, $imi_itm_sub3);
	}

	/**
	 * （品目製造指図）枝番３. (Item mfg. order) Branch No. 3.<p>
	 *
	 */
	public void imi_itm_sub3(String value) {
		setConstString(offset + 45, $imi_itm_sub3, value);
	}

	/**
	 * （品目製造指図）工程パタン. (Item mfg. order) Operation pattern.<p>
	 *
	 */
	public String imi_oper_ptn() {
		return getConstString(offset + 46, $imi_oper_ptn);
	}

	/**
	 * （品目製造指図）工程パタン. (Item mfg. order) Operation pattern.<p>
	 *
	 */
	public void imi_oper_ptn(String value) {
		setConstString(offset + 46, $imi_oper_ptn, value);
	}

	/**
	 * （品目製造指図）構成パタン. (Item mfg. order) BOM pattern.<p>
	 *
	 */
	public String imi_bom_ptn() {
		return getConstString(offset + 47, $imi_bom_ptn);
	}

	/**
	 * （品目製造指図）構成パタン. (Item mfg. order) BOM pattern.<p>
	 *
	 */
	public void imi_bom_ptn(String value) {
		setConstString(offset + 47, $imi_bom_ptn, value);
	}

	/**
	 * （品目製造指図）基準単位出来高予定数量. (Item mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public MCNumber imi_base_unit_yield_qty() {
		return getConstNumber(offset + 48, $imi_base_unit_yield_qty);
	}

	/**
	 * （品目製造指図）基準単位出来高予定数量. (Item mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public void imi_base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 48, $imi_base_unit_yield_qty, value);
	}
	
	/**
	 * （品目製造指図）基準単位出来高予定数量. (Item mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public void imi_base_unit_yield_qty(int value) {
		setConstNumber(offset + 48, $imi_base_unit_yield_qty, value);
	}
	
	/**
	 * （品目製造指図）基準単位出来高予定数量. (Item mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public void imi_base_unit_yield_qty(long value) {
		setConstNumber(offset + 48, $imi_base_unit_yield_qty, value);
	}
	
	/**
	 * （品目製造指図）基準単位出来高予定数量. (Item mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public void imi_base_unit_yield_qty(float value) {
		setConstNumber(offset + 48, $imi_base_unit_yield_qty, value);
	}
	
	/**
	 * （品目製造指図）基準単位出来高予定数量. (Item mfg. order) Base unit output scheduled qty..<p>
	 *
	 */
	public void imi_base_unit_yield_qty(double value) {
		setConstNumber(offset + 48, $imi_base_unit_yield_qty, value);
	}
	
	/**
	 * （品目製造指図）基準単位製造指図数量. (Item mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public MCNumber imi_base_unit_inst_qty() {
		return getConstNumber(offset + 49, $imi_base_unit_inst_qty);
	}

	/**
	 * （品目製造指図）基準単位製造指図数量. (Item mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public void imi_base_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 49, $imi_base_unit_inst_qty, value);
	}
	
	/**
	 * （品目製造指図）基準単位製造指図数量. (Item mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public void imi_base_unit_inst_qty(int value) {
		setConstNumber(offset + 49, $imi_base_unit_inst_qty, value);
	}
	
	/**
	 * （品目製造指図）基準単位製造指図数量. (Item mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public void imi_base_unit_inst_qty(long value) {
		setConstNumber(offset + 49, $imi_base_unit_inst_qty, value);
	}
	
	/**
	 * （品目製造指図）基準単位製造指図数量. (Item mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public void imi_base_unit_inst_qty(float value) {
		setConstNumber(offset + 49, $imi_base_unit_inst_qty, value);
	}
	
	/**
	 * （品目製造指図）基準単位製造指図数量. (Item mfg. order) Base unit mfg. order qty..<p>
	 *
	 */
	public void imi_base_unit_inst_qty(double value) {
		setConstNumber(offset + 49, $imi_base_unit_inst_qty, value);
	}
	
	/**
	 * （品目製造指図）基準単位ＣＤ. (Item mfg. order) Base unit cd..<p>
	 *
	 */
	public String imi_base_unit_cd() {
		return getConstString(offset + 50, $imi_base_unit_cd);
	}

	/**
	 * （品目製造指図）基準単位ＣＤ. (Item mfg. order) Base unit cd..<p>
	 *
	 */
	public void imi_base_unit_cd(String value) {
		setConstString(offset + 50, $imi_base_unit_cd, value);
	}

	/**
	 * （品目製造指図）マスタ適用日. (Item mfg. order) Master application date.<p>
	 *
	 */
	public MCDate imi_master_dt() {
		return getConstDate(offset + 51, $imi_master_dt);
	}

	/**
	 * （品目製造指図）マスタ適用日. (Item mfg. order) Master application date.<p>
	 *
	 */
	public void imi_master_dt(MCDate value) {
		setConstDate(offset + 51, $imi_master_dt, value);
	}

	/**
	 * （品目製造指図）ロットＮＯ. (Item mfg. order) Lot No..<p>
	 *
	 */
	public String imi_lot_no() {
		return getConstString(offset + 52, $imi_lot_no);
	}

	/**
	 * （品目製造指図）ロットＮＯ. (Item mfg. order) Lot No..<p>
	 *
	 */
	public void imi_lot_no(String value) {
		setConstString(offset + 52, $imi_lot_no, value);
	}

	/**
	 * （品目製造指図）サブロットＮＯ. (Item mfg. order) Sublot No..<p>
	 *
	 */
	public String imi_sublot_no() {
		return getConstString(offset + 53, $imi_sublot_no);
	}

	/**
	 * （品目製造指図）サブロットＮＯ. (Item mfg. order) Sublot No..<p>
	 *
	 */
	public void imi_sublot_no(String value) {
		setConstString(offset + 53, $imi_sublot_no, value);
	}

	/**
	 * （品目製造指図）手配ＮＯ１. (Item mfg. order) SEIBAN No. 1.<p>
	 *
	 */
	public String imi_sno1() {
		return getConstString(offset + 54, $imi_sno1);
	}

	/**
	 * （品目製造指図）手配ＮＯ１. (Item mfg. order) SEIBAN No. 1.<p>
	 *
	 */
	public void imi_sno1(String value) {
		setConstString(offset + 54, $imi_sno1, value);
	}

	/**
	 * （品目製造指図）手配ＮＯ２. (Item mfg. order) SEIBAN No. 2.<p>
	 *
	 */
	public String imi_sno2() {
		return getConstString(offset + 55, $imi_sno2);
	}

	/**
	 * （品目製造指図）手配ＮＯ２. (Item mfg. order) SEIBAN No. 2.<p>
	 *
	 */
	public void imi_sno2(String value) {
		setConstString(offset + 55, $imi_sno2, value);
	}

	/**
	 * （品目製造指図）手配ＮＯ３. (Item mfg. order) SEIBAN No. 3.<p>
	 *
	 */
	public String imi_sno3() {
		return getConstString(offset + 56, $imi_sno3);
	}

	/**
	 * （品目製造指図）手配ＮＯ３. (Item mfg. order) SEIBAN No. 3.<p>
	 *
	 */
	public void imi_sno3(String value) {
		setConstString(offset + 56, $imi_sno3, value);
	}

	/**
	 * （品目製造指図）手配ＮＯ４. (Item mfg. order) SEIBAN No. 4.<p>
	 *
	 */
	public String imi_sno4() {
		return getConstString(offset + 57, $imi_sno4);
	}

	/**
	 * （品目製造指図）手配ＮＯ４. (Item mfg. order) SEIBAN No. 4.<p>
	 *
	 */
	public void imi_sno4(String value) {
		setConstString(offset + 57, $imi_sno4, value);
	}

	/**
	 * （品目製造指図）計画外指図ＦＬＧ. (Item mfg. order) Without plan order flg..<p>
	 *
	 */
	public boolean imi_unschd_inst_flg() {
		return getConstBoolean(offset + 58, $imi_unschd_inst_flg);
	}

	/**
	 * （品目製造指図）計画外指図ＦＬＧ. (Item mfg. order) Without plan order flg..<p>
	 *
	 */
	public void imi_unschd_inst_flg(boolean value) {
		setConstBoolean(offset + 58, $imi_unschd_inst_flg, value);
	}

	/**
	 * （品目製造指図）計画外実績ＦＬＧ. (Item mfg. order) Unplanned result flg..<p>
	 *
	 */
	public boolean imi_unschd_act_flg() {
		return getConstBoolean(offset + 59, $imi_unschd_act_flg);
	}

	/**
	 * （品目製造指図）計画外実績ＦＬＧ. (Item mfg. order) Unplanned result flg..<p>
	 *
	 */
	public void imi_unschd_act_flg(boolean value) {
		setConstBoolean(offset + 59, $imi_unschd_act_flg, value);
	}

	/**
	 * （品目製造指図）格納先場所ＣＤ. (Item mfg. order) Storage location cd..<p>
	 *
	 */
	public String imi_strg_loc_cd() {
		return getConstString(offset + 60, $imi_strg_loc_cd);
	}

	/**
	 * （品目製造指図）格納先場所ＣＤ. (Item mfg. order) Storage location cd..<p>
	 *
	 */
	public void imi_strg_loc_cd(String value) {
		setConstString(offset + 60, $imi_strg_loc_cd, value);
	}

	/**
	 * （品目製造指図）格納棚・ラインＣＤ. (Item mfg. order) Storage rack/line cd..<p>
	 *
	 */
	public String imi_strg_str_ln_cd() {
		return getConstString(offset + 61, $imi_strg_str_ln_cd);
	}

	/**
	 * （品目製造指図）格納棚・ラインＣＤ. (Item mfg. order) Storage rack/line cd..<p>
	 *
	 */
	public void imi_strg_str_ln_cd(String value) {
		setConstString(offset + 61, $imi_strg_str_ln_cd, value);
	}

	/**
	 * （品目製造指図）製造場所ＣＤ. (Item mfg. order) Mfg. location cd..<p>
	 *
	 */
	public String imi_mfg_loc_cd() {
		return getConstString(offset + 62, $imi_mfg_loc_cd);
	}

	/**
	 * （品目製造指図）製造場所ＣＤ. (Item mfg. order) Mfg. location cd..<p>
	 *
	 */
	public void imi_mfg_loc_cd(String value) {
		setConstString(offset + 62, $imi_mfg_loc_cd, value);
	}

	/**
	 * （品目製造指図）製造棚・ラインＣＤ. (Item mfg. order) Mfg. rack/line cd..<p>
	 *
	 */
	public String imi_mfg_str_ln_cd() {
		return getConstString(offset + 63, $imi_mfg_str_ln_cd);
	}

	/**
	 * （品目製造指図）製造棚・ラインＣＤ. (Item mfg. order) Mfg. rack/line cd..<p>
	 *
	 */
	public void imi_mfg_str_ln_cd(String value) {
		setConstString(offset + 63, $imi_mfg_str_ln_cd, value);
	}

	/**
	 * （品目製造指図）ワーキンググループＣＤ. (Item mfg. order) WG cd..<p>
	 *
	 */
	public String imi_wg_cd() {
		return getConstString(offset + 64, $imi_wg_cd);
	}

	/**
	 * （品目製造指図）ワーキンググループＣＤ. (Item mfg. order) WG cd..<p>
	 *
	 */
	public void imi_wg_cd(String value) {
		setConstString(offset + 64, $imi_wg_cd, value);
	}

	/**
	 * （品目製造指図）工場・物流倉庫ＣＤ. (Item mfg. order) Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String imi_site_cd() {
		return getConstString(offset + 65, $imi_site_cd);
	}

	/**
	 * （品目製造指図）工場・物流倉庫ＣＤ. (Item mfg. order) Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void imi_site_cd(String value) {
		setConstString(offset + 65, $imi_site_cd, value);
	}

	/**
	 * （品目製造指図）品目下限収率. (Item mfg. order) Item min. yield.<p>
	 *
	 */
	public MCNumber imi_itm_lower_yield() {
		return getConstNumber(offset + 66, $imi_itm_lower_yield);
	}

	/**
	 * （品目製造指図）品目下限収率. (Item mfg. order) Item min. yield.<p>
	 *
	 */
	public void imi_itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 66, $imi_itm_lower_yield, value);
	}
	
	/**
	 * （品目製造指図）品目下限収率. (Item mfg. order) Item min. yield.<p>
	 *
	 */
	public void imi_itm_lower_yield(int value) {
		setConstNumber(offset + 66, $imi_itm_lower_yield, value);
	}
	
	/**
	 * （品目製造指図）品目下限収率. (Item mfg. order) Item min. yield.<p>
	 *
	 */
	public void imi_itm_lower_yield(long value) {
		setConstNumber(offset + 66, $imi_itm_lower_yield, value);
	}
	
	/**
	 * （品目製造指図）品目下限収率. (Item mfg. order) Item min. yield.<p>
	 *
	 */
	public void imi_itm_lower_yield(float value) {
		setConstNumber(offset + 66, $imi_itm_lower_yield, value);
	}
	
	/**
	 * （品目製造指図）品目下限収率. (Item mfg. order) Item min. yield.<p>
	 *
	 */
	public void imi_itm_lower_yield(double value) {
		setConstNumber(offset + 66, $imi_itm_lower_yield, value);
	}
	
	/**
	 * （品目製造指図）品目標準収率. (Item mfg. order) Item standard yield.<p>
	 *
	 */
	public MCNumber imi_itm_std_yield() {
		return getConstNumber(offset + 67, $imi_itm_std_yield);
	}

	/**
	 * （品目製造指図）品目標準収率. (Item mfg. order) Item standard yield.<p>
	 *
	 */
	public void imi_itm_std_yield(MCNumber value) {
		setConstNumber(offset + 67, $imi_itm_std_yield, value);
	}
	
	/**
	 * （品目製造指図）品目標準収率. (Item mfg. order) Item standard yield.<p>
	 *
	 */
	public void imi_itm_std_yield(int value) {
		setConstNumber(offset + 67, $imi_itm_std_yield, value);
	}
	
	/**
	 * （品目製造指図）品目標準収率. (Item mfg. order) Item standard yield.<p>
	 *
	 */
	public void imi_itm_std_yield(long value) {
		setConstNumber(offset + 67, $imi_itm_std_yield, value);
	}
	
	/**
	 * （品目製造指図）品目標準収率. (Item mfg. order) Item standard yield.<p>
	 *
	 */
	public void imi_itm_std_yield(float value) {
		setConstNumber(offset + 67, $imi_itm_std_yield, value);
	}
	
	/**
	 * （品目製造指図）品目標準収率. (Item mfg. order) Item standard yield.<p>
	 *
	 */
	public void imi_itm_std_yield(double value) {
		setConstNumber(offset + 67, $imi_itm_std_yield, value);
	}
	
	/**
	 * （品目製造指図）品目上限収率. (Item mfg. order) Item max. yield.<p>
	 *
	 */
	public MCNumber imi_itm_upper_yield() {
		return getConstNumber(offset + 68, $imi_itm_upper_yield);
	}

	/**
	 * （品目製造指図）品目上限収率. (Item mfg. order) Item max. yield.<p>
	 *
	 */
	public void imi_itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 68, $imi_itm_upper_yield, value);
	}
	
	/**
	 * （品目製造指図）品目上限収率. (Item mfg. order) Item max. yield.<p>
	 *
	 */
	public void imi_itm_upper_yield(int value) {
		setConstNumber(offset + 68, $imi_itm_upper_yield, value);
	}
	
	/**
	 * （品目製造指図）品目上限収率. (Item mfg. order) Item max. yield.<p>
	 *
	 */
	public void imi_itm_upper_yield(long value) {
		setConstNumber(offset + 68, $imi_itm_upper_yield, value);
	}
	
	/**
	 * （品目製造指図）品目上限収率. (Item mfg. order) Item max. yield.<p>
	 *
	 */
	public void imi_itm_upper_yield(float value) {
		setConstNumber(offset + 68, $imi_itm_upper_yield, value);
	}
	
	/**
	 * （品目製造指図）品目上限収率. (Item mfg. order) Item max. yield.<p>
	 *
	 */
	public void imi_itm_upper_yield(double value) {
		setConstNumber(offset + 68, $imi_itm_upper_yield, value);
	}
	
	/**
	 * （品目製造指図）予備１. (Item mfg. order) Spare 1.<p>
	 *
	 */
	public String imi_sub_char1() {
		return getConstString(offset + 69, $imi_sub_char1);
	}

	/**
	 * （品目製造指図）予備１. (Item mfg. order) Spare 1.<p>
	 *
	 */
	public void imi_sub_char1(String value) {
		setConstString(offset + 69, $imi_sub_char1, value);
	}

	/**
	 * （品目製造指図）予備２. (Item mfg. order) Spare 2.<p>
	 *
	 */
	public String imi_sub_char2() {
		return getConstString(offset + 70, $imi_sub_char2);
	}

	/**
	 * （品目製造指図）予備２. (Item mfg. order) Spare 2.<p>
	 *
	 */
	public void imi_sub_char2(String value) {
		setConstString(offset + 70, $imi_sub_char2, value);
	}

	/**
	 * （品目製造指図）予備３. (Item mfg. order) Spare 3.<p>
	 *
	 */
	public String imi_sub_char3() {
		return getConstString(offset + 71, $imi_sub_char3);
	}

	/**
	 * （品目製造指図）予備３. (Item mfg. order) Spare 3.<p>
	 *
	 */
	public void imi_sub_char3(String value) {
		setConstString(offset + 71, $imi_sub_char3, value);
	}

	/**
	 * （製造指図進捗）製造状況区分. (Mfg. order progress) Mfg. status type.<p>
	 *
	 */
	public String mpr_mfg_sts_typ() {
		return getConstString(offset + 72, $mpr_mfg_sts_typ);
	}

	/**
	 * （製造指図進捗）製造状況区分. (Mfg. order progress) Mfg. status type.<p>
	 *
	 */
	public void mpr_mfg_sts_typ(String value) {
		setConstString(offset + 72, $mpr_mfg_sts_typ, value);
	}

	/**
	 * （製造指図進捗）基準単位製造残数量. (Mfg. order progress) Base unit remaining mfg. qty..<p>
	 *
	 */
	public MCNumber mpr_base_unit_mfg_rem_qty() {
		return getConstNumber(offset + 73, $mpr_base_unit_mfg_rem_qty);
	}

	/**
	 * （製造指図進捗）基準単位製造残数量. (Mfg. order progress) Base unit remaining mfg. qty..<p>
	 *
	 */
	public void mpr_base_unit_mfg_rem_qty(MCNumber value) {
		setConstNumber(offset + 73, $mpr_base_unit_mfg_rem_qty, value);
	}
	
	/**
	 * （製造指図進捗）基準単位製造残数量. (Mfg. order progress) Base unit remaining mfg. qty..<p>
	 *
	 */
	public void mpr_base_unit_mfg_rem_qty(int value) {
		setConstNumber(offset + 73, $mpr_base_unit_mfg_rem_qty, value);
	}
	
	/**
	 * （製造指図進捗）基準単位製造残数量. (Mfg. order progress) Base unit remaining mfg. qty..<p>
	 *
	 */
	public void mpr_base_unit_mfg_rem_qty(long value) {
		setConstNumber(offset + 73, $mpr_base_unit_mfg_rem_qty, value);
	}
	
	/**
	 * （製造指図進捗）基準単位製造残数量. (Mfg. order progress) Base unit remaining mfg. qty..<p>
	 *
	 */
	public void mpr_base_unit_mfg_rem_qty(float value) {
		setConstNumber(offset + 73, $mpr_base_unit_mfg_rem_qty, value);
	}
	
	/**
	 * （製造指図進捗）基準単位製造残数量. (Mfg. order progress) Base unit remaining mfg. qty..<p>
	 *
	 */
	public void mpr_base_unit_mfg_rem_qty(double value) {
		setConstNumber(offset + 73, $mpr_base_unit_mfg_rem_qty, value);
	}
	
	/**
	 * （製造実績）製造実績ＮＯ. (Mfg. result) Mfg. result No..<p>
	 *
	 */
	public String ma_mfg_act_no() {
		return getConstString(offset + 74, $ma_mfg_act_no);
	}

	/**
	 * （製造実績）製造実績ＮＯ. (Mfg. result) Mfg. result No..<p>
	 *
	 */
	public void ma_mfg_act_no(String value) {
		setConstString(offset + 74, $ma_mfg_act_no, value);
	}

	/**
	 * （製造実績）製造指図ＮＯ. (Mfg. result) Mfg. order No..<p>
	 *
	 */
	public String ma_mfg_inst_no() {
		return getConstString(offset + 75, $ma_mfg_inst_no);
	}

	/**
	 * （製造実績）製造指図ＮＯ. (Mfg. result) Mfg. order No..<p>
	 *
	 */
	public void ma_mfg_inst_no(String value) {
		setConstString(offset + 75, $ma_mfg_inst_no, value);
	}

	/**
	 * （製造実績）分割連番. (Mfg. result) Split sequence number.<p>
	 *
	 */
	public MCNumber ma_div_seq() {
		return getConstNumber(offset + 76, $ma_div_seq);
	}

	/**
	 * （製造実績）分割連番. (Mfg. result) Split sequence number.<p>
	 *
	 */
	public void ma_div_seq(MCNumber value) {
		setConstNumber(offset + 76, $ma_div_seq, value);
	}
	
	/**
	 * （製造実績）分割連番. (Mfg. result) Split sequence number.<p>
	 *
	 */
	public void ma_div_seq(int value) {
		setConstNumber(offset + 76, $ma_div_seq, value);
	}
	
	/**
	 * （製造実績）分割連番. (Mfg. result) Split sequence number.<p>
	 *
	 */
	public void ma_div_seq(long value) {
		setConstNumber(offset + 76, $ma_div_seq, value);
	}
	
	/**
	 * （製造実績）分割連番. (Mfg. result) Split sequence number.<p>
	 *
	 */
	public void ma_div_seq(float value) {
		setConstNumber(offset + 76, $ma_div_seq, value);
	}
	
	/**
	 * （製造実績）分割連番. (Mfg. result) Split sequence number.<p>
	 *
	 */
	public void ma_div_seq(double value) {
		setConstNumber(offset + 76, $ma_div_seq, value);
	}
	
	/**
	 * （製造実績）品目製造指図ＮＯ. (Mfg. result) Item mfg. order No..<p>
	 *
	 */
	public String ma_itm_mfg_inst_no() {
		return getConstString(offset + 77, $ma_itm_mfg_inst_no);
	}

	/**
	 * （製造実績）品目製造指図ＮＯ. (Mfg. result) Item mfg. order No..<p>
	 *
	 */
	public void ma_itm_mfg_inst_no(String value) {
		setConstString(offset + 77, $ma_itm_mfg_inst_no, value);
	}

	/**
	 * （製造実績）取引ＣＤ. (Mfg. result) Transaction cd..<p>
	 *
	 */
	public String ma_trd_cd() {
		return getConstString(offset + 78, $ma_trd_cd);
	}

	/**
	 * （製造実績）取引ＣＤ. (Mfg. result) Transaction cd..<p>
	 *
	 */
	public void ma_trd_cd(String value) {
		setConstString(offset + 78, $ma_trd_cd, value);
	}

	/**
	 * （製造実績）着手実績日時. (Mfg. result) Actual start date and time.<p>
	 *
	 */
	public MCDate ma_st_act_tm() {
		return getConstDate(offset + 79, $ma_st_act_tm);
	}

	/**
	 * （製造実績）着手実績日時. (Mfg. result) Actual start date and time.<p>
	 *
	 */
	public void ma_st_act_tm(MCDate value) {
		setConstDate(offset + 79, $ma_st_act_tm, value);
	}

	/**
	 * （製造実績）終了実績日時. (Mfg. result) Actual end date and time.<p>
	 *
	 */
	public MCDate ma_end_act_tm() {
		return getConstDate(offset + 80, $ma_end_act_tm);
	}

	/**
	 * （製造実績）終了実績日時. (Mfg. result) Actual end date and time.<p>
	 *
	 */
	public void ma_end_act_tm(MCDate value) {
		setConstDate(offset + 80, $ma_end_act_tm, value);
	}

	/**
	 * （製造実績）基準単位良品数量. (Mfg. result) Base unit conforming qty..<p>
	 *
	 */
	public MCNumber ma_base_unit_yield_qty() {
		return getConstNumber(offset + 81, $ma_base_unit_yield_qty);
	}

	/**
	 * （製造実績）基準単位良品数量. (Mfg. result) Base unit conforming qty..<p>
	 *
	 */
	public void ma_base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 81, $ma_base_unit_yield_qty, value);
	}
	
	/**
	 * （製造実績）基準単位良品数量. (Mfg. result) Base unit conforming qty..<p>
	 *
	 */
	public void ma_base_unit_yield_qty(int value) {
		setConstNumber(offset + 81, $ma_base_unit_yield_qty, value);
	}
	
	/**
	 * （製造実績）基準単位良品数量. (Mfg. result) Base unit conforming qty..<p>
	 *
	 */
	public void ma_base_unit_yield_qty(long value) {
		setConstNumber(offset + 81, $ma_base_unit_yield_qty, value);
	}
	
	/**
	 * （製造実績）基準単位良品数量. (Mfg. result) Base unit conforming qty..<p>
	 *
	 */
	public void ma_base_unit_yield_qty(float value) {
		setConstNumber(offset + 81, $ma_base_unit_yield_qty, value);
	}
	
	/**
	 * （製造実績）基準単位良品数量. (Mfg. result) Base unit conforming qty..<p>
	 *
	 */
	public void ma_base_unit_yield_qty(double value) {
		setConstNumber(offset + 81, $ma_base_unit_yield_qty, value);
	}
	
	/**
	 * （製造実績）基準単位不良数量. (Mfg. result) Base unit defective qty..<p>
	 *
	 */
	public MCNumber ma_base_unit_dfct_qty() {
		return getConstNumber(offset + 82, $ma_base_unit_dfct_qty);
	}

	/**
	 * （製造実績）基準単位不良数量. (Mfg. result) Base unit defective qty..<p>
	 *
	 */
	public void ma_base_unit_dfct_qty(MCNumber value) {
		setConstNumber(offset + 82, $ma_base_unit_dfct_qty, value);
	}
	
	/**
	 * （製造実績）基準単位不良数量. (Mfg. result) Base unit defective qty..<p>
	 *
	 */
	public void ma_base_unit_dfct_qty(int value) {
		setConstNumber(offset + 82, $ma_base_unit_dfct_qty, value);
	}
	
	/**
	 * （製造実績）基準単位不良数量. (Mfg. result) Base unit defective qty..<p>
	 *
	 */
	public void ma_base_unit_dfct_qty(long value) {
		setConstNumber(offset + 82, $ma_base_unit_dfct_qty, value);
	}
	
	/**
	 * （製造実績）基準単位不良数量. (Mfg. result) Base unit defective qty..<p>
	 *
	 */
	public void ma_base_unit_dfct_qty(float value) {
		setConstNumber(offset + 82, $ma_base_unit_dfct_qty, value);
	}
	
	/**
	 * （製造実績）基準単位不良数量. (Mfg. result) Base unit defective qty..<p>
	 *
	 */
	public void ma_base_unit_dfct_qty(double value) {
		setConstNumber(offset + 82, $ma_base_unit_dfct_qty, value);
	}
	
	/**
	 * （製造実績）基準単位ＣＤ. (Mfg. result) Base unit cd..<p>
	 *
	 */
	public String ma_base_unit_cd() {
		return getConstString(offset + 83, $ma_base_unit_cd);
	}

	/**
	 * （製造実績）基準単位ＣＤ. (Mfg. result) Base unit cd..<p>
	 *
	 */
	public void ma_base_unit_cd(String value) {
		setConstString(offset + 83, $ma_base_unit_cd, value);
	}

	/**
	 * （製造実績）着手計上日. (Mfg. result) Start recording date.<p>
	 *
	 */
	public MCDate ma_st_ac_dt() {
		return getConstDate(offset + 84, $ma_st_ac_dt);
	}

	/**
	 * （製造実績）着手計上日. (Mfg. result) Start recording date.<p>
	 *
	 */
	public void ma_st_ac_dt(MCDate value) {
		setConstDate(offset + 84, $ma_st_ac_dt, value);
	}

	/**
	 * （製造実績）終了計上日. (Mfg. result) End recording date.<p>
	 *
	 */
	public MCDate ma_end_ac_dt() {
		return getConstDate(offset + 85, $ma_end_ac_dt);
	}

	/**
	 * （製造実績）終了計上日. (Mfg. result) End recording date.<p>
	 *
	 */
	public void ma_end_ac_dt(MCDate value) {
		setConstDate(offset + 85, $ma_end_ac_dt, value);
	}

	/**
	 * （製造実績）品目実際収率. (Mfg. result) Item actual yield.<p>
	 *
	 */
	public MCNumber ma_itm_yield() {
		return getConstNumber(offset + 86, $ma_itm_yield);
	}

	/**
	 * （製造実績）品目実際収率. (Mfg. result) Item actual yield.<p>
	 *
	 */
	public void ma_itm_yield(MCNumber value) {
		setConstNumber(offset + 86, $ma_itm_yield, value);
	}
	
	/**
	 * （製造実績）品目実際収率. (Mfg. result) Item actual yield.<p>
	 *
	 */
	public void ma_itm_yield(int value) {
		setConstNumber(offset + 86, $ma_itm_yield, value);
	}
	
	/**
	 * （製造実績）品目実際収率. (Mfg. result) Item actual yield.<p>
	 *
	 */
	public void ma_itm_yield(long value) {
		setConstNumber(offset + 86, $ma_itm_yield, value);
	}
	
	/**
	 * （製造実績）品目実際収率. (Mfg. result) Item actual yield.<p>
	 *
	 */
	public void ma_itm_yield(float value) {
		setConstNumber(offset + 86, $ma_itm_yield, value);
	}
	
	/**
	 * （製造実績）品目実際収率. (Mfg. result) Item actual yield.<p>
	 *
	 */
	public void ma_itm_yield(double value) {
		setConstNumber(offset + 86, $ma_itm_yield, value);
	}
	
	/**
	 * （製造実績）製造承認状況区分. (Mfg. result) Mfg. approval status type.<p>
	 *
	 */
	public String ma_mfg_aprv_sts_typ() {
		return getConstString(offset + 87, $ma_mfg_aprv_sts_typ);
	}

	/**
	 * （製造実績）製造承認状況区分. (Mfg. result) Mfg. approval status type.<p>
	 *
	 */
	public void ma_mfg_aprv_sts_typ(String value) {
		setConstString(offset + 87, $ma_mfg_aprv_sts_typ, value);
	}

	/**
	 * （製造実績）承認日. (Mfg. result) Approval date.<p>
	 *
	 */
	public MCDate ma_aprv_dt() {
		return getConstDate(offset + 88, $ma_aprv_dt);
	}

	/**
	 * （製造実績）承認日. (Mfg. result) Approval date.<p>
	 *
	 */
	public void ma_aprv_dt(MCDate value) {
		setConstDate(offset + 88, $ma_aprv_dt, value);
	}

	/**
	 * （製造実績）承認部門ＣＤ. (Mfg. result) Approval dept. cd..<p>
	 *
	 */
	public String ma_aprv_dpt_cd() {
		return getConstString(offset + 89, $ma_aprv_dpt_cd);
	}

	/**
	 * （製造実績）承認部門ＣＤ. (Mfg. result) Approval dept. cd..<p>
	 *
	 */
	public void ma_aprv_dpt_cd(String value) {
		setConstString(offset + 89, $ma_aprv_dpt_cd, value);
	}

	/**
	 * （製造実績）承認者ＣＤ. (Mfg. result) Approver cd..<p>
	 *
	 */
	public String ma_aprv_usr_cd() {
		return getConstString(offset + 90, $ma_aprv_usr_cd);
	}

	/**
	 * （製造実績）承認者ＣＤ. (Mfg. result) Approver cd..<p>
	 *
	 */
	public void ma_aprv_usr_cd(String value) {
		setConstString(offset + 90, $ma_aprv_usr_cd, value);
	}

	/**
	 * （製造実績）承認日時. (Mfg. result) Approval date and time.<p>
	 *
	 */
	public MCDate ma_aprv_tm() {
		return getConstDate(offset + 91, $ma_aprv_tm);
	}

	/**
	 * （製造実績）承認日時. (Mfg. result) Approval date and time.<p>
	 *
	 */
	public void ma_aprv_tm(MCDate value) {
		setConstDate(offset + 91, $ma_aprv_tm, value);
	}

	/**
	 * （製造実績）承認理由. (Mfg. result) Approval reason.<p>
	 *
	 */
	public String ma_aprv_rsn() {
		return getConstString(offset + 92, $ma_aprv_rsn);
	}

	/**
	 * （製造実績）承認理由. (Mfg. result) Approval reason.<p>
	 *
	 */
	public void ma_aprv_rsn(String value) {
		setConstString(offset + 92, $ma_aprv_rsn, value);
	}

	/**
	 * （製造実績）製造記録書発行済ＦＬＧ. (Mfg. result) Mfg. record sheet issued flg..<p>
	 *
	 */
	public boolean ma_act_prnt_flg() {
		return getConstBoolean(offset + 93, $ma_act_prnt_flg);
	}

	/**
	 * （製造実績）製造記録書発行済ＦＬＧ. (Mfg. result) Mfg. record sheet issued flg..<p>
	 *
	 */
	public void ma_act_prnt_flg(boolean value) {
		setConstBoolean(offset + 93, $ma_act_prnt_flg, value);
	}

	/**
	 * （製造実績）製造記録書発行日時. (Mfg. result) Mfg. record sheet issue date and time.<p>
	 *
	 */
	public MCDate ma_act_prnt_tm() {
		return getConstDate(offset + 94, $ma_act_prnt_tm);
	}

	/**
	 * （製造実績）製造記録書発行日時. (Mfg. result) Mfg. record sheet issue date and time.<p>
	 *
	 */
	public void ma_act_prnt_tm(MCDate value) {
		setConstDate(offset + 94, $ma_act_prnt_tm, value);
	}

	/**
	 * （製造実績）製造記録書連番. (Mfg. result) Mfg. record sheet sequence number.<p>
	 *
	 */
	public MCNumber ma_seq() {
		return getConstNumber(offset + 95, $ma_seq);
	}

	/**
	 * （製造実績）製造記録書連番. (Mfg. result) Mfg. record sheet sequence number.<p>
	 *
	 */
	public void ma_seq(MCNumber value) {
		setConstNumber(offset + 95, $ma_seq, value);
	}
	
	/**
	 * （製造実績）製造記録書連番. (Mfg. result) Mfg. record sheet sequence number.<p>
	 *
	 */
	public void ma_seq(int value) {
		setConstNumber(offset + 95, $ma_seq, value);
	}
	
	/**
	 * （製造実績）製造記録書連番. (Mfg. result) Mfg. record sheet sequence number.<p>
	 *
	 */
	public void ma_seq(long value) {
		setConstNumber(offset + 95, $ma_seq, value);
	}
	
	/**
	 * （製造実績）製造記録書連番. (Mfg. result) Mfg. record sheet sequence number.<p>
	 *
	 */
	public void ma_seq(float value) {
		setConstNumber(offset + 95, $ma_seq, value);
	}
	
	/**
	 * （製造実績）製造記録書連番. (Mfg. result) Mfg. record sheet sequence number.<p>
	 *
	 */
	public void ma_seq(double value) {
		setConstNumber(offset + 95, $ma_seq, value);
	}
	
	/**
	 * （製造実績）実績部門ＣＤ. (Mfg. result) Result dept. cd..<p>
	 *
	 */
	public String ma_act_dpt_cd() {
		return getConstString(offset + 96, $ma_act_dpt_cd);
	}

	/**
	 * （製造実績）実績部門ＣＤ. (Mfg. result) Result dept. cd..<p>
	 *
	 */
	public void ma_act_dpt_cd(String value) {
		setConstString(offset + 96, $ma_act_dpt_cd, value);
	}

	/**
	 * （製造実績）実績責任者ＣＤ. (Mfg. result) Result management PIC cd..<p>
	 *
	 */
	public String ma_act_usr_cd() {
		return getConstString(offset + 97, $ma_act_usr_cd);
	}

	/**
	 * （製造実績）実績責任者ＣＤ. (Mfg. result) Result management PIC cd..<p>
	 *
	 */
	public void ma_act_usr_cd(String value) {
		setConstString(offset + 97, $ma_act_usr_cd, value);
	}

	/**
	 * （製造実績）入荷・仕入時自動作成ＦＬＧ. (Mfg. result) Auto-create flg. at receipt/purchase.<p>
	 *
	 */
	public boolean ma_arr_purc_auto_reg_flg() {
		return getConstBoolean(offset + 98, $ma_arr_purc_auto_reg_flg);
	}

	/**
	 * （製造実績）入荷・仕入時自動作成ＦＬＧ. (Mfg. result) Auto-create flg. at receipt/purchase.<p>
	 *
	 */
	public void ma_arr_purc_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 98, $ma_arr_purc_auto_reg_flg, value);
	}

	/**
	 * （製造実績）内部備考. (Mfg. result) Internal remarks.<p>
	 *
	 */
	public String ma_intr_rmrks() {
		return getConstString(offset + 99, $ma_intr_rmrks);
	}

	/**
	 * （製造実績）内部備考. (Mfg. result) Internal remarks.<p>
	 *
	 */
	public void ma_intr_rmrks(String value) {
		setConstString(offset + 99, $ma_intr_rmrks, value);
	}

	/**
	 * （製造実績）記録書備考. (Mfg. result) Record sheet remarks.<p>
	 *
	 */
	public String ma_act_rpt_rmrks() {
		return getConstString(offset + 100, $ma_act_rpt_rmrks);
	}

	/**
	 * （製造実績）記録書備考. (Mfg. result) Record sheet remarks.<p>
	 *
	 */
	public void ma_act_rpt_rmrks(String value) {
		setConstString(offset + 100, $ma_act_rpt_rmrks, value);
	}

	/**
	 * （製造実績）予備１. (Mfg. result) Spare 1.<p>
	 *
	 */
	public String ma_sub_char1() {
		return getConstString(offset + 101, $ma_sub_char1);
	}

	/**
	 * （製造実績）予備１. (Mfg. result) Spare 1.<p>
	 *
	 */
	public void ma_sub_char1(String value) {
		setConstString(offset + 101, $ma_sub_char1, value);
	}

	/**
	 * （製造実績）予備２. (Mfg. result) Spare 2.<p>
	 *
	 */
	public String ma_sub_char2() {
		return getConstString(offset + 102, $ma_sub_char2);
	}

	/**
	 * （製造実績）予備２. (Mfg. result) Spare 2.<p>
	 *
	 */
	public void ma_sub_char2(String value) {
		setConstString(offset + 102, $ma_sub_char2, value);
	}

	/**
	 * （製造実績）予備３. (Mfg. result) Spare 3.<p>
	 *
	 */
	public String ma_sub_char3() {
		return getConstString(offset + 103, $ma_sub_char3);
	}

	/**
	 * （製造実績）予備３. (Mfg. result) Spare 3.<p>
	 *
	 */
	public void ma_sub_char3(String value) {
		setConstString(offset + 103, $ma_sub_char3, value);
	}

	public String getString(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mi_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return mi_itm_mfg_inst_no();
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			return mi_po_d_no();
		}
		if ($mi_base_unit_cd.equalsIgnoreCase(name)) {
			return mi_base_unit_cd();
		}
		if ($mi_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mi_mfg_aprv_sts_typ();
		}
		if ($mi_aprv_dpt_cd.equalsIgnoreCase(name)) {
			return mi_aprv_dpt_cd();
		}
		if ($mi_aprv_usr_cd.equalsIgnoreCase(name)) {
			return mi_aprv_usr_cd();
		}
		if ($mi_aprv_rsn.equalsIgnoreCase(name)) {
			return mi_aprv_rsn();
		}
		if ($mi_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mi_mfg_aprv_role_cd();
		}
		if ($mi_disp_pd.equalsIgnoreCase(name)) {
			return mi_disp_pd();
		}
		if ($mi_inst_dpt_cd.equalsIgnoreCase(name)) {
			return mi_inst_dpt_cd();
		}
		if ($mi_inst_usr_cd.equalsIgnoreCase(name)) {
			return mi_inst_usr_cd();
		}
		if ($mi_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mi_mfg_inst_unit_typ();
		}
		if ($mi_intr_rmrks.equalsIgnoreCase(name)) {
			return mi_intr_rmrks();
		}
		if ($mi_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return mi_inst_rpt_rmrks();
		}
		if ($mi_inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return mi_inst_po_cnt_rmrks();
		}
		if ($mi_sub_char1.equalsIgnoreCase(name)) {
			return mi_sub_char1();
		}
		if ($mi_sub_char2.equalsIgnoreCase(name)) {
			return mi_sub_char2();
		}
		if ($mi_sub_char3.equalsIgnoreCase(name)) {
			return mi_sub_char3();
		}
		if ($imi_itm_ord_no.equalsIgnoreCase(name)) {
			return imi_itm_ord_no();
		}
		if ($imi_io_schd_pr_no.equalsIgnoreCase(name)) {
			return imi_io_schd_pr_no();
		}
		if ($imi_frst_mfg_inst_no.equalsIgnoreCase(name)) {
			return imi_frst_mfg_inst_no();
		}
		if ($imi_mfg_mtd_typ.equalsIgnoreCase(name)) {
			return imi_mfg_mtd_typ();
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			return imi_sppl_cd();
		}
		if ($imi_itm_cd.equalsIgnoreCase(name)) {
			return imi_itm_cd();
		}
		if ($imi_itm_sub1.equalsIgnoreCase(name)) {
			return imi_itm_sub1();
		}
		if ($imi_itm_sub2.equalsIgnoreCase(name)) {
			return imi_itm_sub2();
		}
		if ($imi_itm_sub3.equalsIgnoreCase(name)) {
			return imi_itm_sub3();
		}
		if ($imi_oper_ptn.equalsIgnoreCase(name)) {
			return imi_oper_ptn();
		}
		if ($imi_bom_ptn.equalsIgnoreCase(name)) {
			return imi_bom_ptn();
		}
		if ($imi_base_unit_cd.equalsIgnoreCase(name)) {
			return imi_base_unit_cd();
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			return imi_lot_no();
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			return imi_sublot_no();
		}
		if ($imi_sno1.equalsIgnoreCase(name)) {
			return imi_sno1();
		}
		if ($imi_sno2.equalsIgnoreCase(name)) {
			return imi_sno2();
		}
		if ($imi_sno3.equalsIgnoreCase(name)) {
			return imi_sno3();
		}
		if ($imi_sno4.equalsIgnoreCase(name)) {
			return imi_sno4();
		}
		if ($imi_strg_loc_cd.equalsIgnoreCase(name)) {
			return imi_strg_loc_cd();
		}
		if ($imi_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return imi_strg_str_ln_cd();
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			return imi_mfg_loc_cd();
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return imi_mfg_str_ln_cd();
		}
		if ($imi_wg_cd.equalsIgnoreCase(name)) {
			return imi_wg_cd();
		}
		if ($imi_site_cd.equalsIgnoreCase(name)) {
			return imi_site_cd();
		}
		if ($imi_sub_char1.equalsIgnoreCase(name)) {
			return imi_sub_char1();
		}
		if ($imi_sub_char2.equalsIgnoreCase(name)) {
			return imi_sub_char2();
		}
		if ($imi_sub_char3.equalsIgnoreCase(name)) {
			return imi_sub_char3();
		}
		if ($mpr_mfg_sts_typ.equalsIgnoreCase(name)) {
			return mpr_mfg_sts_typ();
		}
		if ($ma_mfg_act_no.equalsIgnoreCase(name)) {
			return ma_mfg_act_no();
		}
		if ($ma_mfg_inst_no.equalsIgnoreCase(name)) {
			return ma_mfg_inst_no();
		}
		if ($ma_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return ma_itm_mfg_inst_no();
		}
		if ($ma_trd_cd.equalsIgnoreCase(name)) {
			return ma_trd_cd();
		}
		if ($ma_base_unit_cd.equalsIgnoreCase(name)) {
			return ma_base_unit_cd();
		}
		if ($ma_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return ma_mfg_aprv_sts_typ();
		}
		if ($ma_aprv_dpt_cd.equalsIgnoreCase(name)) {
			return ma_aprv_dpt_cd();
		}
		if ($ma_aprv_usr_cd.equalsIgnoreCase(name)) {
			return ma_aprv_usr_cd();
		}
		if ($ma_aprv_rsn.equalsIgnoreCase(name)) {
			return ma_aprv_rsn();
		}
		if ($ma_act_dpt_cd.equalsIgnoreCase(name)) {
			return ma_act_dpt_cd();
		}
		if ($ma_act_usr_cd.equalsIgnoreCase(name)) {
			return ma_act_usr_cd();
		}
		if ($ma_intr_rmrks.equalsIgnoreCase(name)) {
			return ma_intr_rmrks();
		}
		if ($ma_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return ma_act_rpt_rmrks();
		}
		if ($ma_sub_char1.equalsIgnoreCase(name)) {
			return ma_sub_char1();
		}
		if ($ma_sub_char2.equalsIgnoreCase(name)) {
			return ma_sub_char2();
		}
		if ($ma_sub_char3.equalsIgnoreCase(name)) {
			return ma_sub_char3();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			return mi_mfg_inst_rev();
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			return mi_base_unit_yield_qty();
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			return mi_base_unit_inst_qty();
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			return imi_base_unit_yield_qty();
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			return imi_base_unit_inst_qty();
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			return imi_itm_lower_yield();
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			return imi_itm_std_yield();
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			return imi_itm_upper_yield();
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			return mpr_base_unit_mfg_rem_qty();
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			return ma_div_seq();
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			return ma_base_unit_yield_qty();
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			return ma_base_unit_dfct_qty();
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			return ma_itm_yield();
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			return ma_seq();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($mi_st_schd_tm.equalsIgnoreCase(name)) {
			return mi_st_schd_tm();
		}
		if ($mi_end_schd_tm.equalsIgnoreCase(name)) {
			return mi_end_schd_tm();
		}
		if ($mi_rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return mi_rqst_dlv_rqst_tm();
		}
		if ($mi_inst_dt.equalsIgnoreCase(name)) {
			return mi_inst_dt();
		}
		if ($mi_inst_prnt_tm.equalsIgnoreCase(name)) {
			return mi_inst_prnt_tm();
		}
		if ($mi_aprv_dt.equalsIgnoreCase(name)) {
			return mi_aprv_dt();
		}
		if ($mi_aprv_tm.equalsIgnoreCase(name)) {
			return mi_aprv_tm();
		}
		if ($imi_master_dt.equalsIgnoreCase(name)) {
			return imi_master_dt();
		}
		if ($ma_st_act_tm.equalsIgnoreCase(name)) {
			return ma_st_act_tm();
		}
		if ($ma_end_act_tm.equalsIgnoreCase(name)) {
			return ma_end_act_tm();
		}
		if ($ma_st_ac_dt.equalsIgnoreCase(name)) {
			return ma_st_ac_dt();
		}
		if ($ma_end_ac_dt.equalsIgnoreCase(name)) {
			return ma_end_ac_dt();
		}
		if ($ma_aprv_dt.equalsIgnoreCase(name)) {
			return ma_aprv_dt();
		}
		if ($ma_aprv_tm.equalsIgnoreCase(name)) {
			return ma_aprv_tm();
		}
		if ($ma_act_prnt_tm.equalsIgnoreCase(name)) {
			return ma_act_prnt_tm();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($mi_inst_prnt_flg.equalsIgnoreCase(name)) {
			return mi_inst_prnt_flg();
		}
		if ($mi_aprv_flg.equalsIgnoreCase(name)) {
			return mi_aprv_flg();
		}
		if ($mi_can_flg.equalsIgnoreCase(name)) {
			return mi_can_flg();
		}
		if ($mi_abort_flg.equalsIgnoreCase(name)) {
			return mi_abort_flg();
		}
		if ($mi_schd_chg_flg.equalsIgnoreCase(name)) {
			return mi_schd_chg_flg();
		}
		if ($mi_po_locked_flg.equalsIgnoreCase(name)) {
			return mi_po_locked_flg();
		}
		if ($mi_po_auto_reg_flg.equalsIgnoreCase(name)) {
			return mi_po_auto_reg_flg();
		}
		if ($imi_unschd_inst_flg.equalsIgnoreCase(name)) {
			return imi_unschd_inst_flg();
		}
		if ($imi_unschd_act_flg.equalsIgnoreCase(name)) {
			return imi_unschd_act_flg();
		}
		if ($ma_act_prnt_flg.equalsIgnoreCase(name)) {
			return ma_act_prnt_flg();
		}
		if ($ma_arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			return ma_arr_purc_auto_reg_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mi_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return mi_itm_mfg_inst_no();
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			return mi_po_d_no();
		}
		if ($mi_base_unit_cd.equalsIgnoreCase(name)) {
			return mi_base_unit_cd();
		}
		if ($mi_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mi_mfg_aprv_sts_typ();
		}
		if ($mi_aprv_dpt_cd.equalsIgnoreCase(name)) {
			return mi_aprv_dpt_cd();
		}
		if ($mi_aprv_usr_cd.equalsIgnoreCase(name)) {
			return mi_aprv_usr_cd();
		}
		if ($mi_aprv_rsn.equalsIgnoreCase(name)) {
			return mi_aprv_rsn();
		}
		if ($mi_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mi_mfg_aprv_role_cd();
		}
		if ($mi_disp_pd.equalsIgnoreCase(name)) {
			return mi_disp_pd();
		}
		if ($mi_inst_dpt_cd.equalsIgnoreCase(name)) {
			return mi_inst_dpt_cd();
		}
		if ($mi_inst_usr_cd.equalsIgnoreCase(name)) {
			return mi_inst_usr_cd();
		}
		if ($mi_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mi_mfg_inst_unit_typ();
		}
		if ($mi_intr_rmrks.equalsIgnoreCase(name)) {
			return mi_intr_rmrks();
		}
		if ($mi_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return mi_inst_rpt_rmrks();
		}
		if ($mi_inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return mi_inst_po_cnt_rmrks();
		}
		if ($mi_sub_char1.equalsIgnoreCase(name)) {
			return mi_sub_char1();
		}
		if ($mi_sub_char2.equalsIgnoreCase(name)) {
			return mi_sub_char2();
		}
		if ($mi_sub_char3.equalsIgnoreCase(name)) {
			return mi_sub_char3();
		}
		if ($imi_itm_ord_no.equalsIgnoreCase(name)) {
			return imi_itm_ord_no();
		}
		if ($imi_io_schd_pr_no.equalsIgnoreCase(name)) {
			return imi_io_schd_pr_no();
		}
		if ($imi_frst_mfg_inst_no.equalsIgnoreCase(name)) {
			return imi_frst_mfg_inst_no();
		}
		if ($imi_mfg_mtd_typ.equalsIgnoreCase(name)) {
			return imi_mfg_mtd_typ();
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			return imi_sppl_cd();
		}
		if ($imi_itm_cd.equalsIgnoreCase(name)) {
			return imi_itm_cd();
		}
		if ($imi_itm_sub1.equalsIgnoreCase(name)) {
			return imi_itm_sub1();
		}
		if ($imi_itm_sub2.equalsIgnoreCase(name)) {
			return imi_itm_sub2();
		}
		if ($imi_itm_sub3.equalsIgnoreCase(name)) {
			return imi_itm_sub3();
		}
		if ($imi_oper_ptn.equalsIgnoreCase(name)) {
			return imi_oper_ptn();
		}
		if ($imi_bom_ptn.equalsIgnoreCase(name)) {
			return imi_bom_ptn();
		}
		if ($imi_base_unit_cd.equalsIgnoreCase(name)) {
			return imi_base_unit_cd();
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			return imi_lot_no();
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			return imi_sublot_no();
		}
		if ($imi_sno1.equalsIgnoreCase(name)) {
			return imi_sno1();
		}
		if ($imi_sno2.equalsIgnoreCase(name)) {
			return imi_sno2();
		}
		if ($imi_sno3.equalsIgnoreCase(name)) {
			return imi_sno3();
		}
		if ($imi_sno4.equalsIgnoreCase(name)) {
			return imi_sno4();
		}
		if ($imi_strg_loc_cd.equalsIgnoreCase(name)) {
			return imi_strg_loc_cd();
		}
		if ($imi_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return imi_strg_str_ln_cd();
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			return imi_mfg_loc_cd();
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return imi_mfg_str_ln_cd();
		}
		if ($imi_wg_cd.equalsIgnoreCase(name)) {
			return imi_wg_cd();
		}
		if ($imi_site_cd.equalsIgnoreCase(name)) {
			return imi_site_cd();
		}
		if ($imi_sub_char1.equalsIgnoreCase(name)) {
			return imi_sub_char1();
		}
		if ($imi_sub_char2.equalsIgnoreCase(name)) {
			return imi_sub_char2();
		}
		if ($imi_sub_char3.equalsIgnoreCase(name)) {
			return imi_sub_char3();
		}
		if ($mpr_mfg_sts_typ.equalsIgnoreCase(name)) {
			return mpr_mfg_sts_typ();
		}
		if ($ma_mfg_act_no.equalsIgnoreCase(name)) {
			return ma_mfg_act_no();
		}
		if ($ma_mfg_inst_no.equalsIgnoreCase(name)) {
			return ma_mfg_inst_no();
		}
		if ($ma_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return ma_itm_mfg_inst_no();
		}
		if ($ma_trd_cd.equalsIgnoreCase(name)) {
			return ma_trd_cd();
		}
		if ($ma_base_unit_cd.equalsIgnoreCase(name)) {
			return ma_base_unit_cd();
		}
		if ($ma_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return ma_mfg_aprv_sts_typ();
		}
		if ($ma_aprv_dpt_cd.equalsIgnoreCase(name)) {
			return ma_aprv_dpt_cd();
		}
		if ($ma_aprv_usr_cd.equalsIgnoreCase(name)) {
			return ma_aprv_usr_cd();
		}
		if ($ma_aprv_rsn.equalsIgnoreCase(name)) {
			return ma_aprv_rsn();
		}
		if ($ma_act_dpt_cd.equalsIgnoreCase(name)) {
			return ma_act_dpt_cd();
		}
		if ($ma_act_usr_cd.equalsIgnoreCase(name)) {
			return ma_act_usr_cd();
		}
		if ($ma_intr_rmrks.equalsIgnoreCase(name)) {
			return ma_intr_rmrks();
		}
		if ($ma_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return ma_act_rpt_rmrks();
		}
		if ($ma_sub_char1.equalsIgnoreCase(name)) {
			return ma_sub_char1();
		}
		if ($ma_sub_char2.equalsIgnoreCase(name)) {
			return ma_sub_char2();
		}
		if ($ma_sub_char3.equalsIgnoreCase(name)) {
			return ma_sub_char3();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			return mi_mfg_inst_rev();
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			return mi_base_unit_yield_qty();
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			return mi_base_unit_inst_qty();
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			return imi_base_unit_yield_qty();
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			return imi_base_unit_inst_qty();
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			return imi_itm_lower_yield();
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			return imi_itm_std_yield();
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			return imi_itm_upper_yield();
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			return mpr_base_unit_mfg_rem_qty();
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			return ma_div_seq();
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			return ma_base_unit_yield_qty();
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			return ma_base_unit_dfct_qty();
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			return ma_itm_yield();
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			return ma_seq();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($mi_st_schd_tm.equalsIgnoreCase(name)) {
			return mi_st_schd_tm();
		}
		if ($mi_end_schd_tm.equalsIgnoreCase(name)) {
			return mi_end_schd_tm();
		}
		if ($mi_rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return mi_rqst_dlv_rqst_tm();
		}
		if ($mi_inst_dt.equalsIgnoreCase(name)) {
			return mi_inst_dt();
		}
		if ($mi_inst_prnt_tm.equalsIgnoreCase(name)) {
			return mi_inst_prnt_tm();
		}
		if ($mi_aprv_dt.equalsIgnoreCase(name)) {
			return mi_aprv_dt();
		}
		if ($mi_aprv_tm.equalsIgnoreCase(name)) {
			return mi_aprv_tm();
		}
		if ($imi_master_dt.equalsIgnoreCase(name)) {
			return imi_master_dt();
		}
		if ($ma_st_act_tm.equalsIgnoreCase(name)) {
			return ma_st_act_tm();
		}
		if ($ma_end_act_tm.equalsIgnoreCase(name)) {
			return ma_end_act_tm();
		}
		if ($ma_st_ac_dt.equalsIgnoreCase(name)) {
			return ma_st_ac_dt();
		}
		if ($ma_end_ac_dt.equalsIgnoreCase(name)) {
			return ma_end_ac_dt();
		}
		if ($ma_aprv_dt.equalsIgnoreCase(name)) {
			return ma_aprv_dt();
		}
		if ($ma_aprv_tm.equalsIgnoreCase(name)) {
			return ma_aprv_tm();
		}
		if ($ma_act_prnt_tm.equalsIgnoreCase(name)) {
			return ma_act_prnt_tm();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($mi_inst_prnt_flg.equalsIgnoreCase(name)) {
			return mi_inst_prnt_flg();
		}
		if ($mi_aprv_flg.equalsIgnoreCase(name)) {
			return mi_aprv_flg();
		}
		if ($mi_can_flg.equalsIgnoreCase(name)) {
			return mi_can_flg();
		}
		if ($mi_abort_flg.equalsIgnoreCase(name)) {
			return mi_abort_flg();
		}
		if ($mi_schd_chg_flg.equalsIgnoreCase(name)) {
			return mi_schd_chg_flg();
		}
		if ($mi_po_locked_flg.equalsIgnoreCase(name)) {
			return mi_po_locked_flg();
		}
		if ($mi_po_auto_reg_flg.equalsIgnoreCase(name)) {
			return mi_po_auto_reg_flg();
		}
		if ($imi_unschd_inst_flg.equalsIgnoreCase(name)) {
			return imi_unschd_inst_flg();
		}
		if ($imi_unschd_act_flg.equalsIgnoreCase(name)) {
			return imi_unschd_act_flg();
		}
		if ($ma_act_prnt_flg.equalsIgnoreCase(name)) {
			return ma_act_prnt_flg();
		}
		if ($ma_arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			return ma_arr_purc_auto_reg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mi_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			mi_itm_mfg_inst_no(value);
			return;
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			mi_po_d_no(value);
			return;
		}
		if ($mi_base_unit_cd.equalsIgnoreCase(name)) {
			mi_base_unit_cd(value);
			return;
		}
		if ($mi_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mi_mfg_aprv_sts_typ(value);
			return;
		}
		if ($mi_aprv_dpt_cd.equalsIgnoreCase(name)) {
			mi_aprv_dpt_cd(value);
			return;
		}
		if ($mi_aprv_usr_cd.equalsIgnoreCase(name)) {
			mi_aprv_usr_cd(value);
			return;
		}
		if ($mi_aprv_rsn.equalsIgnoreCase(name)) {
			mi_aprv_rsn(value);
			return;
		}
		if ($mi_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mi_mfg_aprv_role_cd(value);
			return;
		}
		if ($mi_disp_pd.equalsIgnoreCase(name)) {
			mi_disp_pd(value);
			return;
		}
		if ($mi_inst_dpt_cd.equalsIgnoreCase(name)) {
			mi_inst_dpt_cd(value);
			return;
		}
		if ($mi_inst_usr_cd.equalsIgnoreCase(name)) {
			mi_inst_usr_cd(value);
			return;
		}
		if ($mi_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mi_mfg_inst_unit_typ(value);
			return;
		}
		if ($mi_intr_rmrks.equalsIgnoreCase(name)) {
			mi_intr_rmrks(value);
			return;
		}
		if ($mi_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			mi_inst_rpt_rmrks(value);
			return;
		}
		if ($mi_inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			mi_inst_po_cnt_rmrks(value);
			return;
		}
		if ($mi_sub_char1.equalsIgnoreCase(name)) {
			mi_sub_char1(value);
			return;
		}
		if ($mi_sub_char2.equalsIgnoreCase(name)) {
			mi_sub_char2(value);
			return;
		}
		if ($mi_sub_char3.equalsIgnoreCase(name)) {
			mi_sub_char3(value);
			return;
		}
		if ($imi_itm_ord_no.equalsIgnoreCase(name)) {
			imi_itm_ord_no(value);
			return;
		}
		if ($imi_io_schd_pr_no.equalsIgnoreCase(name)) {
			imi_io_schd_pr_no(value);
			return;
		}
		if ($imi_frst_mfg_inst_no.equalsIgnoreCase(name)) {
			imi_frst_mfg_inst_no(value);
			return;
		}
		if ($imi_mfg_mtd_typ.equalsIgnoreCase(name)) {
			imi_mfg_mtd_typ(value);
			return;
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			imi_sppl_cd(value);
			return;
		}
		if ($imi_itm_cd.equalsIgnoreCase(name)) {
			imi_itm_cd(value);
			return;
		}
		if ($imi_itm_sub1.equalsIgnoreCase(name)) {
			imi_itm_sub1(value);
			return;
		}
		if ($imi_itm_sub2.equalsIgnoreCase(name)) {
			imi_itm_sub2(value);
			return;
		}
		if ($imi_itm_sub3.equalsIgnoreCase(name)) {
			imi_itm_sub3(value);
			return;
		}
		if ($imi_oper_ptn.equalsIgnoreCase(name)) {
			imi_oper_ptn(value);
			return;
		}
		if ($imi_bom_ptn.equalsIgnoreCase(name)) {
			imi_bom_ptn(value);
			return;
		}
		if ($imi_base_unit_cd.equalsIgnoreCase(name)) {
			imi_base_unit_cd(value);
			return;
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			imi_lot_no(value);
			return;
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			imi_sublot_no(value);
			return;
		}
		if ($imi_sno1.equalsIgnoreCase(name)) {
			imi_sno1(value);
			return;
		}
		if ($imi_sno2.equalsIgnoreCase(name)) {
			imi_sno2(value);
			return;
		}
		if ($imi_sno3.equalsIgnoreCase(name)) {
			imi_sno3(value);
			return;
		}
		if ($imi_sno4.equalsIgnoreCase(name)) {
			imi_sno4(value);
			return;
		}
		if ($imi_strg_loc_cd.equalsIgnoreCase(name)) {
			imi_strg_loc_cd(value);
			return;
		}
		if ($imi_strg_str_ln_cd.equalsIgnoreCase(name)) {
			imi_strg_str_ln_cd(value);
			return;
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			imi_mfg_loc_cd(value);
			return;
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			imi_mfg_str_ln_cd(value);
			return;
		}
		if ($imi_wg_cd.equalsIgnoreCase(name)) {
			imi_wg_cd(value);
			return;
		}
		if ($imi_site_cd.equalsIgnoreCase(name)) {
			imi_site_cd(value);
			return;
		}
		if ($imi_sub_char1.equalsIgnoreCase(name)) {
			imi_sub_char1(value);
			return;
		}
		if ($imi_sub_char2.equalsIgnoreCase(name)) {
			imi_sub_char2(value);
			return;
		}
		if ($imi_sub_char3.equalsIgnoreCase(name)) {
			imi_sub_char3(value);
			return;
		}
		if ($mpr_mfg_sts_typ.equalsIgnoreCase(name)) {
			mpr_mfg_sts_typ(value);
			return;
		}
		if ($ma_mfg_act_no.equalsIgnoreCase(name)) {
			ma_mfg_act_no(value);
			return;
		}
		if ($ma_mfg_inst_no.equalsIgnoreCase(name)) {
			ma_mfg_inst_no(value);
			return;
		}
		if ($ma_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			ma_itm_mfg_inst_no(value);
			return;
		}
		if ($ma_trd_cd.equalsIgnoreCase(name)) {
			ma_trd_cd(value);
			return;
		}
		if ($ma_base_unit_cd.equalsIgnoreCase(name)) {
			ma_base_unit_cd(value);
			return;
		}
		if ($ma_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			ma_mfg_aprv_sts_typ(value);
			return;
		}
		if ($ma_aprv_dpt_cd.equalsIgnoreCase(name)) {
			ma_aprv_dpt_cd(value);
			return;
		}
		if ($ma_aprv_usr_cd.equalsIgnoreCase(name)) {
			ma_aprv_usr_cd(value);
			return;
		}
		if ($ma_aprv_rsn.equalsIgnoreCase(name)) {
			ma_aprv_rsn(value);
			return;
		}
		if ($ma_act_dpt_cd.equalsIgnoreCase(name)) {
			ma_act_dpt_cd(value);
			return;
		}
		if ($ma_act_usr_cd.equalsIgnoreCase(name)) {
			ma_act_usr_cd(value);
			return;
		}
		if ($ma_intr_rmrks.equalsIgnoreCase(name)) {
			ma_intr_rmrks(value);
			return;
		}
		if ($ma_act_rpt_rmrks.equalsIgnoreCase(name)) {
			ma_act_rpt_rmrks(value);
			return;
		}
		if ($ma_sub_char1.equalsIgnoreCase(name)) {
			ma_sub_char1(value);
			return;
		}
		if ($ma_sub_char2.equalsIgnoreCase(name)) {
			ma_sub_char2(value);
			return;
		}
		if ($ma_sub_char3.equalsIgnoreCase(name)) {
			ma_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			mi_mfg_inst_rev(value);
			return;
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			mi_base_unit_yield_qty(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			imi_base_unit_yield_qty(value);
			return;
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			imi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			imi_itm_lower_yield(value);
			return;
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			imi_itm_std_yield(value);
			return;
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			imi_itm_upper_yield(value);
			return;
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			mpr_base_unit_mfg_rem_qty(value);
			return;
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			ma_div_seq(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			ma_itm_yield(value);
			return;
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			ma_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			mi_mfg_inst_rev(value);
			return;
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			mi_base_unit_yield_qty(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			imi_base_unit_yield_qty(value);
			return;
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			imi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			imi_itm_lower_yield(value);
			return;
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			imi_itm_std_yield(value);
			return;
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			imi_itm_upper_yield(value);
			return;
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			mpr_base_unit_mfg_rem_qty(value);
			return;
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			ma_div_seq(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			ma_itm_yield(value);
			return;
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			ma_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			mi_mfg_inst_rev(value);
			return;
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			mi_base_unit_yield_qty(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			imi_base_unit_yield_qty(value);
			return;
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			imi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			imi_itm_lower_yield(value);
			return;
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			imi_itm_std_yield(value);
			return;
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			imi_itm_upper_yield(value);
			return;
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			mpr_base_unit_mfg_rem_qty(value);
			return;
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			ma_div_seq(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			ma_itm_yield(value);
			return;
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			ma_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			mi_mfg_inst_rev(value);
			return;
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			mi_base_unit_yield_qty(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			imi_base_unit_yield_qty(value);
			return;
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			imi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			imi_itm_lower_yield(value);
			return;
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			imi_itm_std_yield(value);
			return;
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			imi_itm_upper_yield(value);
			return;
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			mpr_base_unit_mfg_rem_qty(value);
			return;
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			ma_div_seq(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			ma_itm_yield(value);
			return;
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			ma_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			mi_mfg_inst_rev(value);
			return;
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			mi_base_unit_yield_qty(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			imi_base_unit_yield_qty(value);
			return;
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			imi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			imi_itm_lower_yield(value);
			return;
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			imi_itm_std_yield(value);
			return;
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			imi_itm_upper_yield(value);
			return;
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			mpr_base_unit_mfg_rem_qty(value);
			return;
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			ma_div_seq(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			ma_itm_yield(value);
			return;
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			ma_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($mi_st_schd_tm.equalsIgnoreCase(name)) {
			mi_st_schd_tm(value);
			return;
		}
		if ($mi_end_schd_tm.equalsIgnoreCase(name)) {
			mi_end_schd_tm(value);
			return;
		}
		if ($mi_rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			mi_rqst_dlv_rqst_tm(value);
			return;
		}
		if ($mi_inst_dt.equalsIgnoreCase(name)) {
			mi_inst_dt(value);
			return;
		}
		if ($mi_inst_prnt_tm.equalsIgnoreCase(name)) {
			mi_inst_prnt_tm(value);
			return;
		}
		if ($mi_aprv_dt.equalsIgnoreCase(name)) {
			mi_aprv_dt(value);
			return;
		}
		if ($mi_aprv_tm.equalsIgnoreCase(name)) {
			mi_aprv_tm(value);
			return;
		}
		if ($imi_master_dt.equalsIgnoreCase(name)) {
			imi_master_dt(value);
			return;
		}
		if ($ma_st_act_tm.equalsIgnoreCase(name)) {
			ma_st_act_tm(value);
			return;
		}
		if ($ma_end_act_tm.equalsIgnoreCase(name)) {
			ma_end_act_tm(value);
			return;
		}
		if ($ma_st_ac_dt.equalsIgnoreCase(name)) {
			ma_st_ac_dt(value);
			return;
		}
		if ($ma_end_ac_dt.equalsIgnoreCase(name)) {
			ma_end_ac_dt(value);
			return;
		}
		if ($ma_aprv_dt.equalsIgnoreCase(name)) {
			ma_aprv_dt(value);
			return;
		}
		if ($ma_aprv_tm.equalsIgnoreCase(name)) {
			ma_aprv_tm(value);
			return;
		}
		if ($ma_act_prnt_tm.equalsIgnoreCase(name)) {
			ma_act_prnt_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($mi_inst_prnt_flg.equalsIgnoreCase(name)) {
			mi_inst_prnt_flg(value);
			return;
		}
		if ($mi_aprv_flg.equalsIgnoreCase(name)) {
			mi_aprv_flg(value);
			return;
		}
		if ($mi_can_flg.equalsIgnoreCase(name)) {
			mi_can_flg(value);
			return;
		}
		if ($mi_abort_flg.equalsIgnoreCase(name)) {
			mi_abort_flg(value);
			return;
		}
		if ($mi_schd_chg_flg.equalsIgnoreCase(name)) {
			mi_schd_chg_flg(value);
			return;
		}
		if ($mi_po_locked_flg.equalsIgnoreCase(name)) {
			mi_po_locked_flg(value);
			return;
		}
		if ($mi_po_auto_reg_flg.equalsIgnoreCase(name)) {
			mi_po_auto_reg_flg(value);
			return;
		}
		if ($imi_unschd_inst_flg.equalsIgnoreCase(name)) {
			imi_unschd_inst_flg(value);
			return;
		}
		if ($imi_unschd_act_flg.equalsIgnoreCase(name)) {
			imi_unschd_act_flg(value);
			return;
		}
		if ($ma_act_prnt_flg.equalsIgnoreCase(name)) {
			ma_act_prnt_flg(value);
			return;
		}
		if ($ma_arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			ma_arr_purc_auto_reg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mi_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			mi_itm_mfg_inst_no(value);
			return;
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			mi_po_d_no(value);
			return;
		}
		if ($mi_base_unit_cd.equalsIgnoreCase(name)) {
			mi_base_unit_cd(value);
			return;
		}
		if ($mi_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mi_mfg_aprv_sts_typ(value);
			return;
		}
		if ($mi_aprv_dpt_cd.equalsIgnoreCase(name)) {
			mi_aprv_dpt_cd(value);
			return;
		}
		if ($mi_aprv_usr_cd.equalsIgnoreCase(name)) {
			mi_aprv_usr_cd(value);
			return;
		}
		if ($mi_aprv_rsn.equalsIgnoreCase(name)) {
			mi_aprv_rsn(value);
			return;
		}
		if ($mi_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mi_mfg_aprv_role_cd(value);
			return;
		}
		if ($mi_disp_pd.equalsIgnoreCase(name)) {
			mi_disp_pd(value);
			return;
		}
		if ($mi_inst_dpt_cd.equalsIgnoreCase(name)) {
			mi_inst_dpt_cd(value);
			return;
		}
		if ($mi_inst_usr_cd.equalsIgnoreCase(name)) {
			mi_inst_usr_cd(value);
			return;
		}
		if ($mi_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mi_mfg_inst_unit_typ(value);
			return;
		}
		if ($mi_intr_rmrks.equalsIgnoreCase(name)) {
			mi_intr_rmrks(value);
			return;
		}
		if ($mi_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			mi_inst_rpt_rmrks(value);
			return;
		}
		if ($mi_inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			mi_inst_po_cnt_rmrks(value);
			return;
		}
		if ($mi_sub_char1.equalsIgnoreCase(name)) {
			mi_sub_char1(value);
			return;
		}
		if ($mi_sub_char2.equalsIgnoreCase(name)) {
			mi_sub_char2(value);
			return;
		}
		if ($mi_sub_char3.equalsIgnoreCase(name)) {
			mi_sub_char3(value);
			return;
		}
		if ($imi_itm_ord_no.equalsIgnoreCase(name)) {
			imi_itm_ord_no(value);
			return;
		}
		if ($imi_io_schd_pr_no.equalsIgnoreCase(name)) {
			imi_io_schd_pr_no(value);
			return;
		}
		if ($imi_frst_mfg_inst_no.equalsIgnoreCase(name)) {
			imi_frst_mfg_inst_no(value);
			return;
		}
		if ($imi_mfg_mtd_typ.equalsIgnoreCase(name)) {
			imi_mfg_mtd_typ(value);
			return;
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			imi_sppl_cd(value);
			return;
		}
		if ($imi_itm_cd.equalsIgnoreCase(name)) {
			imi_itm_cd(value);
			return;
		}
		if ($imi_itm_sub1.equalsIgnoreCase(name)) {
			imi_itm_sub1(value);
			return;
		}
		if ($imi_itm_sub2.equalsIgnoreCase(name)) {
			imi_itm_sub2(value);
			return;
		}
		if ($imi_itm_sub3.equalsIgnoreCase(name)) {
			imi_itm_sub3(value);
			return;
		}
		if ($imi_oper_ptn.equalsIgnoreCase(name)) {
			imi_oper_ptn(value);
			return;
		}
		if ($imi_bom_ptn.equalsIgnoreCase(name)) {
			imi_bom_ptn(value);
			return;
		}
		if ($imi_base_unit_cd.equalsIgnoreCase(name)) {
			imi_base_unit_cd(value);
			return;
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			imi_lot_no(value);
			return;
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			imi_sublot_no(value);
			return;
		}
		if ($imi_sno1.equalsIgnoreCase(name)) {
			imi_sno1(value);
			return;
		}
		if ($imi_sno2.equalsIgnoreCase(name)) {
			imi_sno2(value);
			return;
		}
		if ($imi_sno3.equalsIgnoreCase(name)) {
			imi_sno3(value);
			return;
		}
		if ($imi_sno4.equalsIgnoreCase(name)) {
			imi_sno4(value);
			return;
		}
		if ($imi_strg_loc_cd.equalsIgnoreCase(name)) {
			imi_strg_loc_cd(value);
			return;
		}
		if ($imi_strg_str_ln_cd.equalsIgnoreCase(name)) {
			imi_strg_str_ln_cd(value);
			return;
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			imi_mfg_loc_cd(value);
			return;
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			imi_mfg_str_ln_cd(value);
			return;
		}
		if ($imi_wg_cd.equalsIgnoreCase(name)) {
			imi_wg_cd(value);
			return;
		}
		if ($imi_site_cd.equalsIgnoreCase(name)) {
			imi_site_cd(value);
			return;
		}
		if ($imi_sub_char1.equalsIgnoreCase(name)) {
			imi_sub_char1(value);
			return;
		}
		if ($imi_sub_char2.equalsIgnoreCase(name)) {
			imi_sub_char2(value);
			return;
		}
		if ($imi_sub_char3.equalsIgnoreCase(name)) {
			imi_sub_char3(value);
			return;
		}
		if ($mpr_mfg_sts_typ.equalsIgnoreCase(name)) {
			mpr_mfg_sts_typ(value);
			return;
		}
		if ($ma_mfg_act_no.equalsIgnoreCase(name)) {
			ma_mfg_act_no(value);
			return;
		}
		if ($ma_mfg_inst_no.equalsIgnoreCase(name)) {
			ma_mfg_inst_no(value);
			return;
		}
		if ($ma_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			ma_itm_mfg_inst_no(value);
			return;
		}
		if ($ma_trd_cd.equalsIgnoreCase(name)) {
			ma_trd_cd(value);
			return;
		}
		if ($ma_base_unit_cd.equalsIgnoreCase(name)) {
			ma_base_unit_cd(value);
			return;
		}
		if ($ma_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			ma_mfg_aprv_sts_typ(value);
			return;
		}
		if ($ma_aprv_dpt_cd.equalsIgnoreCase(name)) {
			ma_aprv_dpt_cd(value);
			return;
		}
		if ($ma_aprv_usr_cd.equalsIgnoreCase(name)) {
			ma_aprv_usr_cd(value);
			return;
		}
		if ($ma_aprv_rsn.equalsIgnoreCase(name)) {
			ma_aprv_rsn(value);
			return;
		}
		if ($ma_act_dpt_cd.equalsIgnoreCase(name)) {
			ma_act_dpt_cd(value);
			return;
		}
		if ($ma_act_usr_cd.equalsIgnoreCase(name)) {
			ma_act_usr_cd(value);
			return;
		}
		if ($ma_intr_rmrks.equalsIgnoreCase(name)) {
			ma_intr_rmrks(value);
			return;
		}
		if ($ma_act_rpt_rmrks.equalsIgnoreCase(name)) {
			ma_act_rpt_rmrks(value);
			return;
		}
		if ($ma_sub_char1.equalsIgnoreCase(name)) {
			ma_sub_char1(value);
			return;
		}
		if ($ma_sub_char2.equalsIgnoreCase(name)) {
			ma_sub_char2(value);
			return;
		}
		if ($ma_sub_char3.equalsIgnoreCase(name)) {
			ma_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			mi_mfg_inst_rev(value);
			return;
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			mi_base_unit_yield_qty(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			imi_base_unit_yield_qty(value);
			return;
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			imi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			imi_itm_lower_yield(value);
			return;
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			imi_itm_std_yield(value);
			return;
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			imi_itm_upper_yield(value);
			return;
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			mpr_base_unit_mfg_rem_qty(value);
			return;
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			ma_div_seq(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			ma_itm_yield(value);
			return;
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			ma_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			mi_mfg_inst_rev(value);
			return;
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			mi_base_unit_yield_qty(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			imi_base_unit_yield_qty(value);
			return;
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			imi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			imi_itm_lower_yield(value);
			return;
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			imi_itm_std_yield(value);
			return;
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			imi_itm_upper_yield(value);
			return;
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			mpr_base_unit_mfg_rem_qty(value);
			return;
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			ma_div_seq(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			ma_itm_yield(value);
			return;
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			ma_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			mi_mfg_inst_rev(value);
			return;
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			mi_base_unit_yield_qty(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			imi_base_unit_yield_qty(value);
			return;
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			imi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			imi_itm_lower_yield(value);
			return;
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			imi_itm_std_yield(value);
			return;
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			imi_itm_upper_yield(value);
			return;
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			mpr_base_unit_mfg_rem_qty(value);
			return;
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			ma_div_seq(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			ma_itm_yield(value);
			return;
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			ma_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			mi_mfg_inst_rev(value);
			return;
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			mi_base_unit_yield_qty(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			imi_base_unit_yield_qty(value);
			return;
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			imi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			imi_itm_lower_yield(value);
			return;
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			imi_itm_std_yield(value);
			return;
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			imi_itm_upper_yield(value);
			return;
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			mpr_base_unit_mfg_rem_qty(value);
			return;
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			ma_div_seq(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			ma_itm_yield(value);
			return;
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			ma_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_mfg_inst_rev.equalsIgnoreCase(name)) {
			mi_mfg_inst_rev(value);
			return;
		}
		if ($mi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			mi_base_unit_yield_qty(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_base_unit_yield_qty.equalsIgnoreCase(name)) {
			imi_base_unit_yield_qty(value);
			return;
		}
		if ($imi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			imi_base_unit_inst_qty(value);
			return;
		}
		if ($imi_itm_lower_yield.equalsIgnoreCase(name)) {
			imi_itm_lower_yield(value);
			return;
		}
		if ($imi_itm_std_yield.equalsIgnoreCase(name)) {
			imi_itm_std_yield(value);
			return;
		}
		if ($imi_itm_upper_yield.equalsIgnoreCase(name)) {
			imi_itm_upper_yield(value);
			return;
		}
		if ($mpr_base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			mpr_base_unit_mfg_rem_qty(value);
			return;
		}
		if ($ma_div_seq.equalsIgnoreCase(name)) {
			ma_div_seq(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		if ($ma_itm_yield.equalsIgnoreCase(name)) {
			ma_itm_yield(value);
			return;
		}
		if ($ma_seq.equalsIgnoreCase(name)) {
			ma_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($mi_st_schd_tm.equalsIgnoreCase(name)) {
			mi_st_schd_tm(value);
			return;
		}
		if ($mi_end_schd_tm.equalsIgnoreCase(name)) {
			mi_end_schd_tm(value);
			return;
		}
		if ($mi_rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			mi_rqst_dlv_rqst_tm(value);
			return;
		}
		if ($mi_inst_dt.equalsIgnoreCase(name)) {
			mi_inst_dt(value);
			return;
		}
		if ($mi_inst_prnt_tm.equalsIgnoreCase(name)) {
			mi_inst_prnt_tm(value);
			return;
		}
		if ($mi_aprv_dt.equalsIgnoreCase(name)) {
			mi_aprv_dt(value);
			return;
		}
		if ($mi_aprv_tm.equalsIgnoreCase(name)) {
			mi_aprv_tm(value);
			return;
		}
		if ($imi_master_dt.equalsIgnoreCase(name)) {
			imi_master_dt(value);
			return;
		}
		if ($ma_st_act_tm.equalsIgnoreCase(name)) {
			ma_st_act_tm(value);
			return;
		}
		if ($ma_end_act_tm.equalsIgnoreCase(name)) {
			ma_end_act_tm(value);
			return;
		}
		if ($ma_st_ac_dt.equalsIgnoreCase(name)) {
			ma_st_ac_dt(value);
			return;
		}
		if ($ma_end_ac_dt.equalsIgnoreCase(name)) {
			ma_end_ac_dt(value);
			return;
		}
		if ($ma_aprv_dt.equalsIgnoreCase(name)) {
			ma_aprv_dt(value);
			return;
		}
		if ($ma_aprv_tm.equalsIgnoreCase(name)) {
			ma_aprv_tm(value);
			return;
		}
		if ($ma_act_prnt_tm.equalsIgnoreCase(name)) {
			ma_act_prnt_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($mi_inst_prnt_flg.equalsIgnoreCase(name)) {
			mi_inst_prnt_flg(value);
			return;
		}
		if ($mi_aprv_flg.equalsIgnoreCase(name)) {
			mi_aprv_flg(value);
			return;
		}
		if ($mi_can_flg.equalsIgnoreCase(name)) {
			mi_can_flg(value);
			return;
		}
		if ($mi_abort_flg.equalsIgnoreCase(name)) {
			mi_abort_flg(value);
			return;
		}
		if ($mi_schd_chg_flg.equalsIgnoreCase(name)) {
			mi_schd_chg_flg(value);
			return;
		}
		if ($mi_po_locked_flg.equalsIgnoreCase(name)) {
			mi_po_locked_flg(value);
			return;
		}
		if ($mi_po_auto_reg_flg.equalsIgnoreCase(name)) {
			mi_po_auto_reg_flg(value);
			return;
		}
		if ($imi_unschd_inst_flg.equalsIgnoreCase(name)) {
			imi_unschd_inst_flg(value);
			return;
		}
		if ($imi_unschd_act_flg.equalsIgnoreCase(name)) {
			imi_unschd_act_flg(value);
			return;
		}
		if ($ma_act_prnt_flg.equalsIgnoreCase(name)) {
			ma_act_prnt_flg(value);
			return;
		}
		if ($ma_arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			ma_arr_purc_auto_reg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
