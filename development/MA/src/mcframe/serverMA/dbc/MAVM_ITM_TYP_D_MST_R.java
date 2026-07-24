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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
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
 * "品目区分詳細マスタビュー // Item type details master view"DBコンテナRowクラスです。<p>
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
 *  	<td>itm_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目区分</td>
 *  	<td>Item type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ_d_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目区分詳細ＣＤ</td>
 *  	<td>Item type details cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目区分詳細名</td>
 *  	<td>Item type details name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sls_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売ＦＬＧ</td>
 *  	<td>Sales flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_mfg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造ＦＬＧ</td>
 *  	<td>Mfg. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買ＦＬＧ</td>
 *  	<td>Purchasing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_insp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査ＦＬＧ</td>
 *  	<td>Inspection flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_itm_jnl_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕訳ＣＤ</td>
 *  	<td>Item journal cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_ac_itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計品目分類ＣＤ</td>
 *  	<td>Accounting item classification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_minus_stk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マイナス在庫許可ＦＬＧ</td>
 *  	<td>Allow negative inventory flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_not_new_lot_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>新規ロット入力不可ＦＬＧ</td>
 *  	<td>Do not allow new lot input flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_gi_alloc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫引当確認ＦＬＧ</td>
 *  	<td>GI allocation check flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_pack_alloc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>荷姿引当ＦＬＧ</td>
 *  	<td>SKU allocation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_bp_lot_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業者ロットＮＯ必須ＦＬＧ</td>
 *  	<td>Vendor Lot No. required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_comp_spec_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>構成・仕様管理区分</td>
 *  	<td>Configuration/specification management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_comp_rev_at_slo_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注時構成改訂許可ＦＬＧ</td>
 *  	<td>Allow sales order configuration rev. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_comp_core_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成主品目ＦＬＧ</td>
 *  	<td>Configuration main item flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_skip_chk_ship_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷時構成チェック不要ＦＬＧ</td>
 *  	<td>Component check not required at shipping flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_itm_spec_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕様分類ＣＤ</td>
 *  	<td>Item specification classification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sls_upri_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売単価分類ＣＤ</td>
 *  	<td>Sales unit price classification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_slo_proc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注手配品ＦＬＧ</td>
 *  	<td>Sales order procurement item flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_slo_proc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注手配区分</td>
 *  	<td>Sales order procurement type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_ship_inst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷指図区分</td>
 *  	<td>Shipping order type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_ship_lot_back_stop_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷ロット逆転禁止ＦＬＧ</td>
 *  	<td>Shipping lot reverse prohibit flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_itm_ship_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目出荷グループＣＤ</td>
 *  	<td>Item shipping group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_ship_valid_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷有効期限グループＣＤ</td>
 *  	<td>Shipping expiration date group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_arr_skip_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷不要ＦＬＧ</td>
 *  	<td>Not receipt flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_ship_term_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷条件ＣＤ</td>
 *  	<td>Shipping conditions cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_stk_lst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>現品票出力対象ＦＬＧ</td>
 *  	<td>For identification tag output flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_mfg_inst_unit_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図単位区分</td>
 *  	<td>Mfg. order unit type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sls_upri_cng_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売単価変更許可ＦＬＧ</td>
 *  	<td>Allow sales unit price change flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_purc_upri_cng_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買単価変更許可ＦＬＧ</td>
 *  	<td>Allow purchasing unit price change flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_prov_upri_cng_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支給単価変更許可ＦＬＧ</td>
 *  	<td>Allow supply unit price change flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_mrp_proc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＲＰ処理区分</td>
 *  	<td>MRP process type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_rqmt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>所要区分</td>
 *  	<td>Requirements type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_prod_pln_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>生産計画立案区分</td>
 *  	<td>Production planning type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_dmnd_date_div_mons</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>需要日ばらし月数</td>
 *  	<td>Number of months for demand disaggregation by day</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_alloc_margin_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当余裕日数</td>
 *  	<td>Allocation extra days</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_mrp_alloc_margin_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＲＰ引当余裕日数</td>
 *  	<td>MRP allocation extra days</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_mrp_opn_xfr_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＲＰ未確定移送依頼考慮日数</td>
 *  	<td>Days to consider unfirm transport request in MRP</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_inpt_itm_add_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入品追加許可ＦＬＧ</td>
 *  	<td>Allow input item addition flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_inpt_itm_del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入品削除許可ＦＬＧ</td>
 *  	<td>Allow input item deletion flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sch_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>スケジューラＦＬＧ</td>
 *  	<td>Scheduler flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_lot_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット管理区分</td>
 *  	<td>Lot management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_lot_no_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ発番区分</td>
 *  	<td>Lot No. numbering type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_lot_no_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ発番パタンＣＤ</td>
 *  	<td>Lot No. numbering pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sublot_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロット管理区分</td>
 *  	<td>Sublot management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sublot_no_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ発番区分</td>
 *  	<td>Sublot No. numbering type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sublot_no_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ発番パタンＣＤ</td>
 *  	<td>Sublot No. numbering pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sno1_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１管理区分</td>
 *  	<td>SEIBAN No. 1 management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_slo_sno1_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注手配ＮＯ１必須ＦＬＧ</td>
 *  	<td>Sales order SEIBAN No. 1 required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_rqmt_sno1_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>所要手配ＮＯ１必須ＦＬＧ</td>
 *  	<td>Requirements SEIBAN No. 1 required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sno1_num_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１発番区分</td>
 *  	<td>SEIBAN No. 1 numbering type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sno1_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１発番パタンＣＤ</td>
 *  	<td>SEIBAN No. 1 numbering pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sno2_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２管理区分</td>
 *  	<td>SEIBAN No. 2 management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_slo_sno2_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注手配ＮＯ２必須ＦＬＧ</td>
 *  	<td>Sales order SEIBAN No. 2 required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_rqmt_sno2_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>所要手配ＮＯ２必須ＦＬＧ</td>
 *  	<td>Requirements SEIBAN No. 2 required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sno2_num_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２発番区分</td>
 *  	<td>SEIBAN No. 2 numbering type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sno2_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２発番パタンＣＤ</td>
 *  	<td>SEIBAN No. 2 numbering pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sno3_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３管理区分</td>
 *  	<td>SEIBAN No. 3 management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_slo_sno3_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注手配ＮＯ３必須ＦＬＧ</td>
 *  	<td>Sales order SEIBAN No. 3 required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_rqmt_sno3_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>所要手配ＮＯ３必須ＦＬＧ</td>
 *  	<td>Requirements SEIBAN No. 3 required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sno3_num_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３発番区分</td>
 *  	<td>SEIBAN No. 3 numbering type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sno3_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３発番パタンＣＤ</td>
 *  	<td>SEIBAN No. 3 numbering pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sno4_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４管理区分</td>
 *  	<td>SEIBAN No. 4 management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_slo_sno4_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注手配ＮＯ４必須ＦＬＧ</td>
 *  	<td>Sales order SEIBAN No. 4 required flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_rqmt_sno4_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>所要手配ＮＯ４必須ＦＬＧ</td>
 *  	<td>Requirements SEIBAN No. 4 required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sno4_num_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４発番区分</td>
 *  	<td>SEIBAN No. 4 numbering type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sno4_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４発番パタンＣＤ</td>
 *  	<td>SEIBAN No. 4 numbering pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_lmt_ctl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期限管理対象ＦＬＧ</td>
 *  	<td>For expiration management flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_lmt_ctl_categ</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期限管理種別</td>
 *  	<td>Expiration management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_ver_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>版管理対象ＦＬＧ</td>
 *  	<td>For version control flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_insp_bind_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査実施単位区分</td>
 *  	<td>Inspection implementation unit type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_mrkt_judg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>市場出荷判定対象ＦＬＧ</td>
 *  	<td>For market release decision flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_mrkt_judg_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>市場出荷判定承認役割ＣＤ</td>
 *  	<td>Market release decision approval role cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_mrkt_judg_upd_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>市場出荷判定更新役割ＣＤ</td>
 *  	<td>Market release decision update role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_plnt_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場出荷承認対象ＦＬＧ</td>
 *  	<td>For factory release approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_plnt_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場出荷承認役割ＣＤ</td>
 *  	<td>Factory release approval role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_insp_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査承認対象ＦＬＧ</td>
 *  	<td>For inspection approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_insp_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査承認役割ＣＤ</td>
 *  	<td>Inspection approval role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_mfg_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造承認対象ＦＬＧ</td>
 *  	<td>For mfg. approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_mfg_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造承認役割ＣＤ</td>
 *  	<td>Mfg. approval role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sno_typ1</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１区分</td>
 *  	<td>SEIBAN No. 1 type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sno_typ2</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２区分</td>
 *  	<td>SEIBAN No. 2 type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sno_typ3</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３区分</td>
 *  	<td>SEIBAN No. 3 type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_sno_typ4</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４区分</td>
 *  	<td>SEIBAN No. 4 type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_inst_lot_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>指図時ロット指定ＦＬＧ</td>
 *  	<td>Lot specification at order flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_lot_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット混在ＦＬＧ</td>
 *  	<td>Lot mixed flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_sublot_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロット混在ＦＬＧ</td>
 *  	<td>Sublot mixed flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_alloc_ctl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当制御区分</td>
 *  	<td>Allocation control type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_inpt_ctl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入制御区分</td>
 *  	<td>Input control type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_bkf_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>バックフラッシュ区分</td>
 *  	<td>Backflush type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_main_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>引継対象子品目ＦＬＧ</td>
 *  	<td>Copy-from child item flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_byprod_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>副産品ＦＬＧ</td>
 *  	<td>By-product flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_not_cost_bom_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価対象外ＦＬＧ（ＢＯＭ）</td>
 *  	<td>Not costing flg. (BOM)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_calc_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算パタンＣＤ</td>
 *  	<td>Calculation pattern cd.</td>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名（ロケール１）</td>
 *  	<td>Item type details name (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名（ロケール２）</td>
 *  	<td>Item type details name (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名（ロケール３）</td>
 *  	<td>Item type details name (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名（ロケール４）</td>
 *  	<td>Item type details name (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名（ロケール５）</td>
 *  	<td>Item type details name (Locale5)</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_ITM_TYP_D_MST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_ITM_TYP_D_MST";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
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
	 * 品目区分詳細名. Item type details name.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	private static final MCPermColumnInfo _itm_typ_d_nm = createColumnInfo("itm_typ_d_nm");
	public final MCStringPermColumn itm_typ_d_nm = createStringColumn(_itm_typ_d_nm);
	
	/**
	 * 販売ＦＬＧ. Sales flg..<p>
	 *
	 */
	public static final String $def_sls_flg = "def_sls_flg";
	private static final MCPermColumnInfo _def_sls_flg = createColumnInfo("def_sls_flg");
	public final MCBooleanPermColumn def_sls_flg = createBooleanColumn(_def_sls_flg);
	
	/**
	 * 製造ＦＬＧ. Mfg. flg..<p>
	 *
	 */
	public static final String $def_mfg_flg = "def_mfg_flg";
	private static final MCPermColumnInfo _def_mfg_flg = createColumnInfo("def_mfg_flg");
	public final MCBooleanPermColumn def_mfg_flg = createBooleanColumn(_def_mfg_flg);
	
	/**
	 * 購買ＦＬＧ. Purchasing flg..<p>
	 *
	 */
	public static final String $def_purc_flg = "def_purc_flg";
	private static final MCPermColumnInfo _def_purc_flg = createColumnInfo("def_purc_flg");
	public final MCBooleanPermColumn def_purc_flg = createBooleanColumn(_def_purc_flg);
	
	/**
	 * 検査ＦＬＧ. Inspection flg..<p>
	 *
	 */
	public static final String $def_insp_flg = "def_insp_flg";
	private static final MCPermColumnInfo _def_insp_flg = createColumnInfo("def_insp_flg");
	public final MCBooleanPermColumn def_insp_flg = createBooleanColumn(_def_insp_flg);
	
	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public static final String $def_itm_jnl_cd = "def_itm_jnl_cd";
	private static final MCPermColumnInfo _def_itm_jnl_cd = createColumnInfo("def_itm_jnl_cd");
	public final MCStringPermColumn def_itm_jnl_cd = createStringColumn(_def_itm_jnl_cd);
	
	/**
	 * 会計品目分類ＣＤ. Accounting item classification cd..<p>
	 *
	 */
	public static final String $def_ac_itm_grp_cd = "def_ac_itm_grp_cd";
	private static final MCPermColumnInfo _def_ac_itm_grp_cd = createColumnInfo("def_ac_itm_grp_cd");
	public final MCStringPermColumn def_ac_itm_grp_cd = createStringColumn(_def_ac_itm_grp_cd);
	
	/**
	 * マイナス在庫許可ＦＬＧ. Allow negative inventory flg..<p>
	 *
	 */
	public static final String $def_minus_stk_flg = "def_minus_stk_flg";
	private static final MCPermColumnInfo _def_minus_stk_flg = createColumnInfo("def_minus_stk_flg");
	public final MCBooleanPermColumn def_minus_stk_flg = createBooleanColumn(_def_minus_stk_flg);
	
	/**
	 * 新規ロット入力不可ＦＬＧ. Do not allow new lot input flg..<p>
	 *
	 */
	public static final String $def_not_new_lot_flg = "def_not_new_lot_flg";
	private static final MCPermColumnInfo _def_not_new_lot_flg = createColumnInfo("def_not_new_lot_flg");
	public final MCBooleanPermColumn def_not_new_lot_flg = createBooleanColumn(_def_not_new_lot_flg);
	
	/**
	 * 出庫引当確認ＦＬＧ. GI allocation check flg..<p>
	 *
	 */
	public static final String $def_gi_alloc_flg = "def_gi_alloc_flg";
	private static final MCPermColumnInfo _def_gi_alloc_flg = createColumnInfo("def_gi_alloc_flg");
	public final MCBooleanPermColumn def_gi_alloc_flg = createBooleanColumn(_def_gi_alloc_flg);
	
	/**
	 * 荷姿引当ＦＬＧ. SKU allocation flg..<p>
	 *
	 */
	public static final String $def_pack_alloc_flg = "def_pack_alloc_flg";
	private static final MCPermColumnInfo _def_pack_alloc_flg = createColumnInfo("def_pack_alloc_flg");
	public final MCBooleanPermColumn def_pack_alloc_flg = createBooleanColumn(_def_pack_alloc_flg);
	
	/**
	 * 業者ロットＮＯ必須ＦＬＧ. Vendor Lot No. required flg..<p>
	 *
	 */
	public static final String $def_bp_lot_flg = "def_bp_lot_flg";
	private static final MCPermColumnInfo _def_bp_lot_flg = createColumnInfo("def_bp_lot_flg");
	public final MCBooleanPermColumn def_bp_lot_flg = createBooleanColumn(_def_bp_lot_flg);
	
	/**
	 * 構成・仕様管理区分. Configuration/specification management type.<p>
	 *
	 */
	public static final String $def_comp_spec_typ = "def_comp_spec_typ";
	private static final MCPermColumnInfo _def_comp_spec_typ = createColumnInfo("def_comp_spec_typ");
	public final MCStringPermColumn def_comp_spec_typ = createStringColumn(_def_comp_spec_typ);
	
	/**
	 * 受注時構成改訂許可ＦＬＧ. Allow sales order configuration rev. flg..<p>
	 *
	 */
	public static final String $def_comp_rev_at_slo_flg = "def_comp_rev_at_slo_flg";
	private static final MCPermColumnInfo _def_comp_rev_at_slo_flg = createColumnInfo("def_comp_rev_at_slo_flg");
	public final MCBooleanPermColumn def_comp_rev_at_slo_flg = createBooleanColumn(_def_comp_rev_at_slo_flg);
	
	/**
	 * 構成主品目ＦＬＧ. Configuration main item flg..<p>
	 *
	 */
	public static final String $def_comp_core_itm_flg = "def_comp_core_itm_flg";
	private static final MCPermColumnInfo _def_comp_core_itm_flg = createColumnInfo("def_comp_core_itm_flg");
	public final MCBooleanPermColumn def_comp_core_itm_flg = createBooleanColumn(_def_comp_core_itm_flg);
	
	/**
	 * 出荷時構成チェック不要ＦＬＧ. Component check not required at shipping flg..<p>
	 *
	 */
	public static final String $def_skip_chk_ship_flg = "def_skip_chk_ship_flg";
	private static final MCPermColumnInfo _def_skip_chk_ship_flg = createColumnInfo("def_skip_chk_ship_flg");
	public final MCBooleanPermColumn def_skip_chk_ship_flg = createBooleanColumn(_def_skip_chk_ship_flg);
	
	/**
	 * 品目仕様分類ＣＤ. Item specification classification cd..<p>
	 *
	 */
	public static final String $def_itm_spec_grp_cd = "def_itm_spec_grp_cd";
	private static final MCPermColumnInfo _def_itm_spec_grp_cd = createColumnInfo("def_itm_spec_grp_cd");
	public final MCStringPermColumn def_itm_spec_grp_cd = createStringColumn(_def_itm_spec_grp_cd);
	
	/**
	 * 販売単価分類ＣＤ. Sales unit price classification cd..<p>
	 *
	 */
	public static final String $def_sls_upri_grp_cd = "def_sls_upri_grp_cd";
	private static final MCPermColumnInfo _def_sls_upri_grp_cd = createColumnInfo("def_sls_upri_grp_cd");
	public final MCStringPermColumn def_sls_upri_grp_cd = createStringColumn(_def_sls_upri_grp_cd);
	
	/**
	 * 受注手配品ＦＬＧ. Sales order procurement item flg..<p>
	 *
	 */
	public static final String $def_slo_proc_flg = "def_slo_proc_flg";
	private static final MCPermColumnInfo _def_slo_proc_flg = createColumnInfo("def_slo_proc_flg");
	public final MCBooleanPermColumn def_slo_proc_flg = createBooleanColumn(_def_slo_proc_flg);
	
	/**
	 * 受注手配区分. Sales order procurement type.<p>
	 *
	 */
	public static final String $def_slo_proc_typ = "def_slo_proc_typ";
	private static final MCPermColumnInfo _def_slo_proc_typ = createColumnInfo("def_slo_proc_typ");
	public final MCStringPermColumn def_slo_proc_typ = createStringColumn(_def_slo_proc_typ);
	
	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public static final String $def_ship_inst_typ = "def_ship_inst_typ";
	private static final MCPermColumnInfo _def_ship_inst_typ = createColumnInfo("def_ship_inst_typ");
	public final MCStringPermColumn def_ship_inst_typ = createStringColumn(_def_ship_inst_typ);
	
	/**
	 * 出荷ロット逆転禁止ＦＬＧ. Shipping lot reverse prohibit flg..<p>
	 *
	 */
	public static final String $def_ship_lot_back_stop_flg = "def_ship_lot_back_stop_flg";
	private static final MCPermColumnInfo _def_ship_lot_back_stop_flg = createColumnInfo("def_ship_lot_back_stop_flg");
	public final MCBooleanPermColumn def_ship_lot_back_stop_flg = createBooleanColumn(_def_ship_lot_back_stop_flg);
	
	/**
	 * 品目出荷グループＣＤ. Item shipping group cd..<p>
	 *
	 */
	public static final String $def_itm_ship_grp_cd = "def_itm_ship_grp_cd";
	private static final MCPermColumnInfo _def_itm_ship_grp_cd = createColumnInfo("def_itm_ship_grp_cd");
	public final MCStringPermColumn def_itm_ship_grp_cd = createStringColumn(_def_itm_ship_grp_cd);
	
	/**
	 * 出荷有効期限グループＣＤ. Shipping expiration date group cd..<p>
	 *
	 */
	public static final String $def_ship_valid_grp_cd = "def_ship_valid_grp_cd";
	private static final MCPermColumnInfo _def_ship_valid_grp_cd = createColumnInfo("def_ship_valid_grp_cd");
	public final MCStringPermColumn def_ship_valid_grp_cd = createStringColumn(_def_ship_valid_grp_cd);
	
	/**
	 * 入荷不要ＦＬＧ. Not receipt flg..<p>
	 *
	 */
	public static final String $def_arr_skip_flg = "def_arr_skip_flg";
	private static final MCPermColumnInfo _def_arr_skip_flg = createColumnInfo("def_arr_skip_flg");
	public final MCBooleanPermColumn def_arr_skip_flg = createBooleanColumn(_def_arr_skip_flg);
	
	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public static final String $def_ship_term_cd = "def_ship_term_cd";
	private static final MCPermColumnInfo _def_ship_term_cd = createColumnInfo("def_ship_term_cd");
	public final MCStringPermColumn def_ship_term_cd = createStringColumn(_def_ship_term_cd);
	
	/**
	 * 現品票出力対象ＦＬＧ. For identification tag output flg..<p>
	 *
	 */
	public static final String $def_stk_lst_flg = "def_stk_lst_flg";
	private static final MCPermColumnInfo _def_stk_lst_flg = createColumnInfo("def_stk_lst_flg");
	public final MCBooleanPermColumn def_stk_lst_flg = createBooleanColumn(_def_stk_lst_flg);
	
	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public static final String $def_mfg_inst_unit_typ = "def_mfg_inst_unit_typ";
	private static final MCPermColumnInfo _def_mfg_inst_unit_typ = createColumnInfo("def_mfg_inst_unit_typ");
	public final MCStringPermColumn def_mfg_inst_unit_typ = createStringColumn(_def_mfg_inst_unit_typ);
	
	/**
	 * 販売単価変更許可ＦＬＧ. Allow sales unit price change flg..<p>
	 *
	 */
	public static final String $def_sls_upri_cng_flg = "def_sls_upri_cng_flg";
	private static final MCPermColumnInfo _def_sls_upri_cng_flg = createColumnInfo("def_sls_upri_cng_flg");
	public final MCBooleanPermColumn def_sls_upri_cng_flg = createBooleanColumn(_def_sls_upri_cng_flg);
	
	/**
	 * 購買単価変更許可ＦＬＧ. Allow purchasing unit price change flg..<p>
	 *
	 */
	public static final String $def_purc_upri_cng_flg = "def_purc_upri_cng_flg";
	private static final MCPermColumnInfo _def_purc_upri_cng_flg = createColumnInfo("def_purc_upri_cng_flg");
	public final MCBooleanPermColumn def_purc_upri_cng_flg = createBooleanColumn(_def_purc_upri_cng_flg);
	
	/**
	 * 支給単価変更許可ＦＬＧ. Allow supply unit price change flg..<p>
	 *
	 */
	public static final String $def_prov_upri_cng_flg = "def_prov_upri_cng_flg";
	private static final MCPermColumnInfo _def_prov_upri_cng_flg = createColumnInfo("def_prov_upri_cng_flg");
	public final MCBooleanPermColumn def_prov_upri_cng_flg = createBooleanColumn(_def_prov_upri_cng_flg);
	
	/**
	 * ＭＲＰ処理区分. MRP process type.<p>
	 *
	 */
	public static final String $def_mrp_proc_typ = "def_mrp_proc_typ";
	private static final MCPermColumnInfo _def_mrp_proc_typ = createColumnInfo("def_mrp_proc_typ");
	public final MCStringPermColumn def_mrp_proc_typ = createStringColumn(_def_mrp_proc_typ);
	
	/**
	 * 所要区分. Requirements type.<p>
	 *
	 */
	public static final String $def_rqmt_typ = "def_rqmt_typ";
	private static final MCPermColumnInfo _def_rqmt_typ = createColumnInfo("def_rqmt_typ");
	public final MCStringPermColumn def_rqmt_typ = createStringColumn(_def_rqmt_typ);
	
	/**
	 * 生産計画立案区分. Production planning type.<p>
	 *
	 */
	public static final String $def_prod_pln_typ = "def_prod_pln_typ";
	private static final MCPermColumnInfo _def_prod_pln_typ = createColumnInfo("def_prod_pln_typ");
	public final MCStringPermColumn def_prod_pln_typ = createStringColumn(_def_prod_pln_typ);
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public static final String $def_dmnd_date_div_mons = "def_dmnd_date_div_mons";
	private static final MCPermColumnInfo _def_dmnd_date_div_mons = createColumnInfo("def_dmnd_date_div_mons");
	public final MCNumberPermColumn def_dmnd_date_div_mons = createNumberColumn(_def_dmnd_date_div_mons);
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public static final String $def_alloc_margin_days = "def_alloc_margin_days";
	private static final MCPermColumnInfo _def_alloc_margin_days = createColumnInfo("def_alloc_margin_days");
	public final MCNumberPermColumn def_alloc_margin_days = createNumberColumn(_def_alloc_margin_days);
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public static final String $def_mrp_alloc_margin_days = "def_mrp_alloc_margin_days";
	private static final MCPermColumnInfo _def_mrp_alloc_margin_days = createColumnInfo("def_mrp_alloc_margin_days");
	public final MCNumberPermColumn def_mrp_alloc_margin_days = createNumberColumn(_def_mrp_alloc_margin_days);
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public static final String $def_mrp_opn_xfr_days = "def_mrp_opn_xfr_days";
	private static final MCPermColumnInfo _def_mrp_opn_xfr_days = createColumnInfo("def_mrp_opn_xfr_days");
	public final MCNumberPermColumn def_mrp_opn_xfr_days = createNumberColumn(_def_mrp_opn_xfr_days);
	
	/**
	 * 投入品追加許可ＦＬＧ. Allow input item addition flg..<p>
	 *
	 */
	public static final String $def_inpt_itm_add_flg = "def_inpt_itm_add_flg";
	private static final MCPermColumnInfo _def_inpt_itm_add_flg = createColumnInfo("def_inpt_itm_add_flg");
	public final MCBooleanPermColumn def_inpt_itm_add_flg = createBooleanColumn(_def_inpt_itm_add_flg);
	
	/**
	 * 投入品削除許可ＦＬＧ. Allow input item deletion flg..<p>
	 *
	 */
	public static final String $def_inpt_itm_del_flg = "def_inpt_itm_del_flg";
	private static final MCPermColumnInfo _def_inpt_itm_del_flg = createColumnInfo("def_inpt_itm_del_flg");
	public final MCBooleanPermColumn def_inpt_itm_del_flg = createBooleanColumn(_def_inpt_itm_del_flg);
	
	/**
	 * スケジューラＦＬＧ. Scheduler flg..<p>
	 *
	 */
	public static final String $def_sch_flg = "def_sch_flg";
	private static final MCPermColumnInfo _def_sch_flg = createColumnInfo("def_sch_flg");
	public final MCBooleanPermColumn def_sch_flg = createBooleanColumn(_def_sch_flg);
	
	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public static final String $def_lot_mng_typ = "def_lot_mng_typ";
	private static final MCPermColumnInfo _def_lot_mng_typ = createColumnInfo("def_lot_mng_typ");
	public final MCStringPermColumn def_lot_mng_typ = createStringColumn(_def_lot_mng_typ);
	
	/**
	 * ロットＮＯ発番区分. Lot No. numbering type.<p>
	 *
	 */
	public static final String $def_lot_no_typ = "def_lot_no_typ";
	private static final MCPermColumnInfo _def_lot_no_typ = createColumnInfo("def_lot_no_typ");
	public final MCStringPermColumn def_lot_no_typ = createStringColumn(_def_lot_no_typ);
	
	/**
	 * ロットＮＯ発番パタンＣＤ. Lot No. numbering pattern cd..<p>
	 *
	 */
	public static final String $def_lot_no_ptn_cd = "def_lot_no_ptn_cd";
	private static final MCPermColumnInfo _def_lot_no_ptn_cd = createColumnInfo("def_lot_no_ptn_cd");
	public final MCStringPermColumn def_lot_no_ptn_cd = createStringColumn(_def_lot_no_ptn_cd);
	
	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public static final String $def_sublot_mng_typ = "def_sublot_mng_typ";
	private static final MCPermColumnInfo _def_sublot_mng_typ = createColumnInfo("def_sublot_mng_typ");
	public final MCStringPermColumn def_sublot_mng_typ = createStringColumn(_def_sublot_mng_typ);
	
	/**
	 * サブロットＮＯ発番区分. Sublot No. numbering type.<p>
	 *
	 */
	public static final String $def_sublot_no_typ = "def_sublot_no_typ";
	private static final MCPermColumnInfo _def_sublot_no_typ = createColumnInfo("def_sublot_no_typ");
	public final MCStringPermColumn def_sublot_no_typ = createStringColumn(_def_sublot_no_typ);
	
	/**
	 * サブロットＮＯ発番パタンＣＤ. Sublot No. numbering pattern cd..<p>
	 *
	 */
	public static final String $def_sublot_no_ptn_cd = "def_sublot_no_ptn_cd";
	private static final MCPermColumnInfo _def_sublot_no_ptn_cd = createColumnInfo("def_sublot_no_ptn_cd");
	public final MCStringPermColumn def_sublot_no_ptn_cd = createStringColumn(_def_sublot_no_ptn_cd);
	
	/**
	 * 手配ＮＯ１管理区分. SEIBAN No. 1 management type.<p>
	 *
	 */
	public static final String $def_sno1_mng_typ = "def_sno1_mng_typ";
	private static final MCPermColumnInfo _def_sno1_mng_typ = createColumnInfo("def_sno1_mng_typ");
	public final MCStringPermColumn def_sno1_mng_typ = createStringColumn(_def_sno1_mng_typ);
	
	/**
	 * 受注手配ＮＯ１必須ＦＬＧ. Sales order SEIBAN No. 1 required flg..<p>
	 *
	 */
	public static final String $def_slo_sno1_flg = "def_slo_sno1_flg";
	private static final MCPermColumnInfo _def_slo_sno1_flg = createColumnInfo("def_slo_sno1_flg");
	public final MCBooleanPermColumn def_slo_sno1_flg = createBooleanColumn(_def_slo_sno1_flg);
	
	/**
	 * 所要手配ＮＯ１必須ＦＬＧ. Requirements SEIBAN No. 1 required flg..<p>
	 *
	 */
	public static final String $def_rqmt_sno1_flg = "def_rqmt_sno1_flg";
	private static final MCPermColumnInfo _def_rqmt_sno1_flg = createColumnInfo("def_rqmt_sno1_flg");
	public final MCBooleanPermColumn def_rqmt_sno1_flg = createBooleanColumn(_def_rqmt_sno1_flg);
	
	/**
	 * 手配ＮＯ１発番区分. SEIBAN No. 1 numbering type.<p>
	 *
	 */
	public static final String $def_sno1_num_typ = "def_sno1_num_typ";
	private static final MCPermColumnInfo _def_sno1_num_typ = createColumnInfo("def_sno1_num_typ");
	public final MCStringPermColumn def_sno1_num_typ = createStringColumn(_def_sno1_num_typ);
	
	/**
	 * 手配ＮＯ１発番パタンＣＤ. SEIBAN No. 1 numbering pattern cd..<p>
	 *
	 */
	public static final String $def_sno1_ptn_cd = "def_sno1_ptn_cd";
	private static final MCPermColumnInfo _def_sno1_ptn_cd = createColumnInfo("def_sno1_ptn_cd");
	public final MCStringPermColumn def_sno1_ptn_cd = createStringColumn(_def_sno1_ptn_cd);
	
	/**
	 * 手配ＮＯ２管理区分. SEIBAN No. 2 management type.<p>
	 *
	 */
	public static final String $def_sno2_mng_typ = "def_sno2_mng_typ";
	private static final MCPermColumnInfo _def_sno2_mng_typ = createColumnInfo("def_sno2_mng_typ");
	public final MCStringPermColumn def_sno2_mng_typ = createStringColumn(_def_sno2_mng_typ);
	
	/**
	 * 受注手配ＮＯ２必須ＦＬＧ. Sales order SEIBAN No. 2 required flg..<p>
	 *
	 */
	public static final String $def_slo_sno2_flg = "def_slo_sno2_flg";
	private static final MCPermColumnInfo _def_slo_sno2_flg = createColumnInfo("def_slo_sno2_flg");
	public final MCBooleanPermColumn def_slo_sno2_flg = createBooleanColumn(_def_slo_sno2_flg);
	
	/**
	 * 所要手配ＮＯ２必須ＦＬＧ. Requirements SEIBAN No. 2 required flg..<p>
	 *
	 */
	public static final String $def_rqmt_sno2_flg = "def_rqmt_sno2_flg";
	private static final MCPermColumnInfo _def_rqmt_sno2_flg = createColumnInfo("def_rqmt_sno2_flg");
	public final MCBooleanPermColumn def_rqmt_sno2_flg = createBooleanColumn(_def_rqmt_sno2_flg);
	
	/**
	 * 手配ＮＯ２発番区分. SEIBAN No. 2 numbering type.<p>
	 *
	 */
	public static final String $def_sno2_num_typ = "def_sno2_num_typ";
	private static final MCPermColumnInfo _def_sno2_num_typ = createColumnInfo("def_sno2_num_typ");
	public final MCStringPermColumn def_sno2_num_typ = createStringColumn(_def_sno2_num_typ);
	
	/**
	 * 手配ＮＯ２発番パタンＣＤ. SEIBAN No. 2 numbering pattern cd..<p>
	 *
	 */
	public static final String $def_sno2_ptn_cd = "def_sno2_ptn_cd";
	private static final MCPermColumnInfo _def_sno2_ptn_cd = createColumnInfo("def_sno2_ptn_cd");
	public final MCStringPermColumn def_sno2_ptn_cd = createStringColumn(_def_sno2_ptn_cd);
	
	/**
	 * 手配ＮＯ３管理区分. SEIBAN No. 3 management type.<p>
	 *
	 */
	public static final String $def_sno3_mng_typ = "def_sno3_mng_typ";
	private static final MCPermColumnInfo _def_sno3_mng_typ = createColumnInfo("def_sno3_mng_typ");
	public final MCStringPermColumn def_sno3_mng_typ = createStringColumn(_def_sno3_mng_typ);
	
	/**
	 * 受注手配ＮＯ３必須ＦＬＧ. Sales order SEIBAN No. 3 required flg..<p>
	 *
	 */
	public static final String $def_slo_sno3_flg = "def_slo_sno3_flg";
	private static final MCPermColumnInfo _def_slo_sno3_flg = createColumnInfo("def_slo_sno3_flg");
	public final MCBooleanPermColumn def_slo_sno3_flg = createBooleanColumn(_def_slo_sno3_flg);
	
	/**
	 * 所要手配ＮＯ３必須ＦＬＧ. Requirements SEIBAN No. 3 required flg..<p>
	 *
	 */
	public static final String $def_rqmt_sno3_flg = "def_rqmt_sno3_flg";
	private static final MCPermColumnInfo _def_rqmt_sno3_flg = createColumnInfo("def_rqmt_sno3_flg");
	public final MCBooleanPermColumn def_rqmt_sno3_flg = createBooleanColumn(_def_rqmt_sno3_flg);
	
	/**
	 * 手配ＮＯ３発番区分. SEIBAN No. 3 numbering type.<p>
	 *
	 */
	public static final String $def_sno3_num_typ = "def_sno3_num_typ";
	private static final MCPermColumnInfo _def_sno3_num_typ = createColumnInfo("def_sno3_num_typ");
	public final MCStringPermColumn def_sno3_num_typ = createStringColumn(_def_sno3_num_typ);
	
	/**
	 * 手配ＮＯ３発番パタンＣＤ. SEIBAN No. 3 numbering pattern cd..<p>
	 *
	 */
	public static final String $def_sno3_ptn_cd = "def_sno3_ptn_cd";
	private static final MCPermColumnInfo _def_sno3_ptn_cd = createColumnInfo("def_sno3_ptn_cd");
	public final MCStringPermColumn def_sno3_ptn_cd = createStringColumn(_def_sno3_ptn_cd);
	
	/**
	 * 手配ＮＯ４管理区分. SEIBAN No. 4 management type.<p>
	 *
	 */
	public static final String $def_sno4_mng_typ = "def_sno4_mng_typ";
	private static final MCPermColumnInfo _def_sno4_mng_typ = createColumnInfo("def_sno4_mng_typ");
	public final MCStringPermColumn def_sno4_mng_typ = createStringColumn(_def_sno4_mng_typ);
	
	/**
	 * 受注手配ＮＯ４必須ＦＬＧ. Sales order SEIBAN No. 4 required flg..<p>
	 *
	 */
	public static final String $def_slo_sno4_flg = "def_slo_sno4_flg";
	private static final MCPermColumnInfo _def_slo_sno4_flg = createColumnInfo("def_slo_sno4_flg");
	public final MCBooleanPermColumn def_slo_sno4_flg = createBooleanColumn(_def_slo_sno4_flg);
	
	/**
	 * 所要手配ＮＯ４必須ＦＬＧ. Requirements SEIBAN No. 4 required flg..<p>
	 *
	 */
	public static final String $def_rqmt_sno4_flg = "def_rqmt_sno4_flg";
	private static final MCPermColumnInfo _def_rqmt_sno4_flg = createColumnInfo("def_rqmt_sno4_flg");
	public final MCBooleanPermColumn def_rqmt_sno4_flg = createBooleanColumn(_def_rqmt_sno4_flg);
	
	/**
	 * 手配ＮＯ４発番区分. SEIBAN No. 4 numbering type.<p>
	 *
	 */
	public static final String $def_sno4_num_typ = "def_sno4_num_typ";
	private static final MCPermColumnInfo _def_sno4_num_typ = createColumnInfo("def_sno4_num_typ");
	public final MCStringPermColumn def_sno4_num_typ = createStringColumn(_def_sno4_num_typ);
	
	/**
	 * 手配ＮＯ４発番パタンＣＤ. SEIBAN No. 4 numbering pattern cd..<p>
	 *
	 */
	public static final String $def_sno4_ptn_cd = "def_sno4_ptn_cd";
	private static final MCPermColumnInfo _def_sno4_ptn_cd = createColumnInfo("def_sno4_ptn_cd");
	public final MCStringPermColumn def_sno4_ptn_cd = createStringColumn(_def_sno4_ptn_cd);
	
	/**
	 * 期限管理対象ＦＬＧ. For expiration management flg..<p>
	 *
	 */
	public static final String $def_lmt_ctl_flg = "def_lmt_ctl_flg";
	private static final MCPermColumnInfo _def_lmt_ctl_flg = createColumnInfo("def_lmt_ctl_flg");
	public final MCBooleanPermColumn def_lmt_ctl_flg = createBooleanColumn(_def_lmt_ctl_flg);
	
	/**
	 * 期限管理種別. Expiration management type.<p>
	 *
	 */
	public static final String $def_lmt_ctl_categ = "def_lmt_ctl_categ";
	private static final MCPermColumnInfo _def_lmt_ctl_categ = createColumnInfo("def_lmt_ctl_categ");
	public final MCStringPermColumn def_lmt_ctl_categ = createStringColumn(_def_lmt_ctl_categ);
	
	/**
	 * 版管理対象ＦＬＧ. For version control flg..<p>
	 *
	 */
	public static final String $def_ver_flg = "def_ver_flg";
	private static final MCPermColumnInfo _def_ver_flg = createColumnInfo("def_ver_flg");
	public final MCBooleanPermColumn def_ver_flg = createBooleanColumn(_def_ver_flg);
	
	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public static final String $def_insp_bind_typ = "def_insp_bind_typ";
	private static final MCPermColumnInfo _def_insp_bind_typ = createColumnInfo("def_insp_bind_typ");
	public final MCStringPermColumn def_insp_bind_typ = createStringColumn(_def_insp_bind_typ);
	
	/**
	 * 市場出荷判定対象ＦＬＧ. For market release decision flg..<p>
	 *
	 */
	public static final String $def_mrkt_judg_flg = "def_mrkt_judg_flg";
	private static final MCPermColumnInfo _def_mrkt_judg_flg = createColumnInfo("def_mrkt_judg_flg");
	public final MCBooleanPermColumn def_mrkt_judg_flg = createBooleanColumn(_def_mrkt_judg_flg);
	
	/**
	 * 市場出荷判定承認役割ＣＤ. Market release decision approval role cd..<p>
	 *
	 */
	public static final String $def_mrkt_judg_role_cd = "def_mrkt_judg_role_cd";
	private static final MCPermColumnInfo _def_mrkt_judg_role_cd = createColumnInfo("def_mrkt_judg_role_cd");
	public final MCStringPermColumn def_mrkt_judg_role_cd = createStringColumn(_def_mrkt_judg_role_cd);
	
	/**
	 * 市場出荷判定更新役割ＣＤ. Market release decision update role cd..<p>
	 *
	 */
	public static final String $def_mrkt_judg_upd_role_cd = "def_mrkt_judg_upd_role_cd";
	private static final MCPermColumnInfo _def_mrkt_judg_upd_role_cd = createColumnInfo("def_mrkt_judg_upd_role_cd");
	public final MCStringPermColumn def_mrkt_judg_upd_role_cd = createStringColumn(_def_mrkt_judg_upd_role_cd);
	
	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public static final String $def_plnt_aprv_flg = "def_plnt_aprv_flg";
	private static final MCPermColumnInfo _def_plnt_aprv_flg = createColumnInfo("def_plnt_aprv_flg");
	public final MCBooleanPermColumn def_plnt_aprv_flg = createBooleanColumn(_def_plnt_aprv_flg);
	
	/**
	 * 工場出荷承認役割ＣＤ. Factory release approval role cd..<p>
	 *
	 */
	public static final String $def_plnt_aprv_role_cd = "def_plnt_aprv_role_cd";
	private static final MCPermColumnInfo _def_plnt_aprv_role_cd = createColumnInfo("def_plnt_aprv_role_cd");
	public final MCStringPermColumn def_plnt_aprv_role_cd = createStringColumn(_def_plnt_aprv_role_cd);
	
	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public static final String $def_insp_aprv_flg = "def_insp_aprv_flg";
	private static final MCPermColumnInfo _def_insp_aprv_flg = createColumnInfo("def_insp_aprv_flg");
	public final MCBooleanPermColumn def_insp_aprv_flg = createBooleanColumn(_def_insp_aprv_flg);
	
	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public static final String $def_insp_aprv_role_cd = "def_insp_aprv_role_cd";
	private static final MCPermColumnInfo _def_insp_aprv_role_cd = createColumnInfo("def_insp_aprv_role_cd");
	public final MCStringPermColumn def_insp_aprv_role_cd = createStringColumn(_def_insp_aprv_role_cd);
	
	/**
	 * 製造承認対象ＦＬＧ. For mfg. approval flg..<p>
	 *
	 */
	public static final String $def_mfg_aprv_flg = "def_mfg_aprv_flg";
	private static final MCPermColumnInfo _def_mfg_aprv_flg = createColumnInfo("def_mfg_aprv_flg");
	public final MCBooleanPermColumn def_mfg_aprv_flg = createBooleanColumn(_def_mfg_aprv_flg);
	
	/**
	 * 製造承認役割ＣＤ. Mfg. approval role cd..<p>
	 *
	 */
	public static final String $def_mfg_aprv_role_cd = "def_mfg_aprv_role_cd";
	private static final MCPermColumnInfo _def_mfg_aprv_role_cd = createColumnInfo("def_mfg_aprv_role_cd");
	public final MCStringPermColumn def_mfg_aprv_role_cd = createStringColumn(_def_mfg_aprv_role_cd);
	
	/**
	 * 手配ＮＯ１区分. SEIBAN No. 1 type.<p>
	 *
	 */
	public static final String $def_sno_typ1 = "def_sno_typ1";
	private static final MCPermColumnInfo _def_sno_typ1 = createColumnInfo("def_sno_typ1");
	public final MCStringPermColumn def_sno_typ1 = createStringColumn(_def_sno_typ1);
	
	/**
	 * 手配ＮＯ２区分. SEIBAN No. 2 type.<p>
	 *
	 */
	public static final String $def_sno_typ2 = "def_sno_typ2";
	private static final MCPermColumnInfo _def_sno_typ2 = createColumnInfo("def_sno_typ2");
	public final MCStringPermColumn def_sno_typ2 = createStringColumn(_def_sno_typ2);
	
	/**
	 * 手配ＮＯ３区分. SEIBAN No. 3 type.<p>
	 *
	 */
	public static final String $def_sno_typ3 = "def_sno_typ3";
	private static final MCPermColumnInfo _def_sno_typ3 = createColumnInfo("def_sno_typ3");
	public final MCStringPermColumn def_sno_typ3 = createStringColumn(_def_sno_typ3);
	
	/**
	 * 手配ＮＯ４区分. SEIBAN No. 4 type.<p>
	 *
	 */
	public static final String $def_sno_typ4 = "def_sno_typ4";
	private static final MCPermColumnInfo _def_sno_typ4 = createColumnInfo("def_sno_typ4");
	public final MCStringPermColumn def_sno_typ4 = createStringColumn(_def_sno_typ4);
	
	/**
	 * 指図時ロット指定ＦＬＧ. Lot specification at order flg..<p>
	 *
	 */
	public static final String $def_inst_lot_fix_flg = "def_inst_lot_fix_flg";
	private static final MCPermColumnInfo _def_inst_lot_fix_flg = createColumnInfo("def_inst_lot_fix_flg");
	public final MCBooleanPermColumn def_inst_lot_fix_flg = createBooleanColumn(_def_inst_lot_fix_flg);
	
	/**
	 * ロット混在ＦＬＧ. Lot mixed flg..<p>
	 *
	 */
	public static final String $def_lot_mix_flg = "def_lot_mix_flg";
	private static final MCPermColumnInfo _def_lot_mix_flg = createColumnInfo("def_lot_mix_flg");
	public final MCBooleanPermColumn def_lot_mix_flg = createBooleanColumn(_def_lot_mix_flg);
	
	/**
	 * サブロット混在ＦＬＧ. Sublot mixed flg..<p>
	 *
	 */
	public static final String $def_sublot_mix_flg = "def_sublot_mix_flg";
	private static final MCPermColumnInfo _def_sublot_mix_flg = createColumnInfo("def_sublot_mix_flg");
	public final MCBooleanPermColumn def_sublot_mix_flg = createBooleanColumn(_def_sublot_mix_flg);
	
	/**
	 * 引当制御区分. Allocation control type.<p>
	 *
	 */
	public static final String $def_alloc_ctl_typ = "def_alloc_ctl_typ";
	private static final MCPermColumnInfo _def_alloc_ctl_typ = createColumnInfo("def_alloc_ctl_typ");
	public final MCStringPermColumn def_alloc_ctl_typ = createStringColumn(_def_alloc_ctl_typ);
	
	/**
	 * 投入制御区分. Input control type.<p>
	 *
	 */
	public static final String $def_inpt_ctl_typ = "def_inpt_ctl_typ";
	private static final MCPermColumnInfo _def_inpt_ctl_typ = createColumnInfo("def_inpt_ctl_typ");
	public final MCStringPermColumn def_inpt_ctl_typ = createStringColumn(_def_inpt_ctl_typ);
	
	/**
	 * バックフラッシュ区分. Backflush type.<p>
	 *
	 */
	public static final String $def_bkf_typ = "def_bkf_typ";
	private static final MCPermColumnInfo _def_bkf_typ = createColumnInfo("def_bkf_typ");
	public final MCStringPermColumn def_bkf_typ = createStringColumn(_def_bkf_typ);
	
	/**
	 * 引継対象子品目ＦＬＧ. Copy-from child item flg..<p>
	 *
	 */
	public static final String $def_main_itm_flg = "def_main_itm_flg";
	private static final MCPermColumnInfo _def_main_itm_flg = createColumnInfo("def_main_itm_flg");
	public final MCBooleanPermColumn def_main_itm_flg = createBooleanColumn(_def_main_itm_flg);
	
	/**
	 * 副産品ＦＬＧ. By-product flg..<p>
	 *
	 */
	public static final String $def_byprod_flg = "def_byprod_flg";
	private static final MCPermColumnInfo _def_byprod_flg = createColumnInfo("def_byprod_flg");
	public final MCBooleanPermColumn def_byprod_flg = createBooleanColumn(_def_byprod_flg);
	
	/**
	 * 原価対象外ＦＬＧ（ＢＯＭ）. Not costing flg. (BOM).<p>
	 *
	 */
	public static final String $def_not_cost_bom_flg = "def_not_cost_bom_flg";
	private static final MCPermColumnInfo _def_not_cost_bom_flg = createColumnInfo("def_not_cost_bom_flg");
	public final MCBooleanPermColumn def_not_cost_bom_flg = createBooleanColumn(_def_not_cost_bom_flg);
	
	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public static final String $def_calc_ptn_cd = "def_calc_ptn_cd";
	private static final MCPermColumnInfo _def_calc_ptn_cd = createColumnInfo("def_calc_ptn_cd");
	public final MCStringPermColumn def_calc_ptn_cd = createStringColumn(_def_calc_ptn_cd);
	
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 品目区分詳細名（ロケール１）. Item type details name (Locale1).<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl1 = "itm_typ_d_nm_lcl1";
	private static final MCPermColumnInfo _itm_typ_d_nm_lcl1 = createColumnInfo("itm_typ_d_nm_lcl1");
	public final MCStringPermColumn itm_typ_d_nm_lcl1 = createStringColumn(_itm_typ_d_nm_lcl1);
	
	/**
	 * 品目区分詳細名（ロケール２）. Item type details name (Locale2).<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl2 = "itm_typ_d_nm_lcl2";
	private static final MCPermColumnInfo _itm_typ_d_nm_lcl2 = createColumnInfo("itm_typ_d_nm_lcl2");
	public final MCStringPermColumn itm_typ_d_nm_lcl2 = createStringColumn(_itm_typ_d_nm_lcl2);
	
	/**
	 * 品目区分詳細名（ロケール３）. Item type details name (Locale3).<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl3 = "itm_typ_d_nm_lcl3";
	private static final MCPermColumnInfo _itm_typ_d_nm_lcl3 = createColumnInfo("itm_typ_d_nm_lcl3");
	public final MCStringPermColumn itm_typ_d_nm_lcl3 = createStringColumn(_itm_typ_d_nm_lcl3);
	
	/**
	 * 品目区分詳細名（ロケール４）. Item type details name (Locale4).<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl4 = "itm_typ_d_nm_lcl4";
	private static final MCPermColumnInfo _itm_typ_d_nm_lcl4 = createColumnInfo("itm_typ_d_nm_lcl4");
	public final MCStringPermColumn itm_typ_d_nm_lcl4 = createStringColumn(_itm_typ_d_nm_lcl4);
	
	/**
	 * 品目区分詳細名（ロケール５）. Item type details name (Locale5).<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl5 = "itm_typ_d_nm_lcl5";
	private static final MCPermColumnInfo _itm_typ_d_nm_lcl5 = createColumnInfo("itm_typ_d_nm_lcl5");
	public final MCStringPermColumn itm_typ_d_nm_lcl5 = createStringColumn(_itm_typ_d_nm_lcl5);
	
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta def_sls_flg_META = createCommonMeta($def_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mfg_flg_META = createCommonMeta($def_mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_purc_flg_META = createCommonMeta($def_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_insp_flg_META = createCommonMeta($def_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_itm_jnl_cd_META = createCommonMeta($def_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta def_ac_itm_grp_cd_META = createCommonMeta($def_ac_itm_grp_cd, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_CD);
	public static final MCMeta def_minus_stk_flg_META = createCommonMeta($def_minus_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_not_new_lot_flg_META = createCommonMeta($def_not_new_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_gi_alloc_flg_META = createCommonMeta($def_gi_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_pack_alloc_flg_META = createCommonMeta($def_pack_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_bp_lot_flg_META = createCommonMeta($def_bp_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_comp_spec_typ_META = createCommonMeta($def_comp_spec_typ, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP);
	public static final MCMeta def_comp_rev_at_slo_flg_META = createCommonMeta($def_comp_rev_at_slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_comp_core_itm_flg_META = createCommonMeta($def_comp_core_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_skip_chk_ship_flg_META = createCommonMeta($def_skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_itm_spec_grp_cd_META = createCommonMeta($def_itm_spec_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_CD);
	public static final MCMeta def_sls_upri_grp_cd_META = createCommonMeta($def_sls_upri_grp_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_CD);
	public static final MCMeta def_slo_proc_flg_META = createCommonMeta($def_slo_proc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_slo_proc_typ_META = createCommonMeta($def_slo_proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta def_ship_inst_typ_META = createCommonMeta($def_ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta def_ship_lot_back_stop_flg_META = createCommonMeta($def_ship_lot_back_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_itm_ship_grp_cd_META = createCommonMeta($def_itm_ship_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_CD);
	public static final MCMeta def_ship_valid_grp_cd_META = createCommonMeta($def_ship_valid_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_CD);
	public static final MCMeta def_arr_skip_flg_META = createCommonMeta($def_arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_ship_term_cd_META = createCommonMeta($def_ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta def_stk_lst_flg_META = createCommonMeta($def_stk_lst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mfg_inst_unit_typ_META = createCommonMeta($def_mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta def_sls_upri_cng_flg_META = createCommonMeta($def_sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_purc_upri_cng_flg_META = createCommonMeta($def_purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_prov_upri_cng_flg_META = createCommonMeta($def_prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mrp_proc_typ_META = createCommonMeta($def_mrp_proc_typ, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta def_rqmt_typ_META = createCommonMeta($def_rqmt_typ, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta def_prod_pln_typ_META = createCommonMeta($def_prod_pln_typ, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta def_dmnd_date_div_mons_META = createCommonMeta($def_dmnd_date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta def_alloc_margin_days_META = createCommonMeta($def_alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta def_mrp_alloc_margin_days_META = createCommonMeta($def_mrp_alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta def_mrp_opn_xfr_days_META = createCommonMeta($def_mrp_opn_xfr_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta def_inpt_itm_add_flg_META = createCommonMeta($def_inpt_itm_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_inpt_itm_del_flg_META = createCommonMeta($def_inpt_itm_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sch_flg_META = createCommonMeta($def_sch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_lot_mng_typ_META = createCommonMeta($def_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta def_lot_no_typ_META = createCommonMeta($def_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta def_lot_no_ptn_cd_META = createCommonMeta($def_lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_sublot_mng_typ_META = createCommonMeta($def_sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta def_sublot_no_typ_META = createCommonMeta($def_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta def_sublot_no_ptn_cd_META = createCommonMeta($def_sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_sno1_mng_typ_META = createCommonMeta($def_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta def_slo_sno1_flg_META = createCommonMeta($def_slo_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_rqmt_sno1_flg_META = createCommonMeta($def_rqmt_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sno1_num_typ_META = createCommonMeta($def_sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta def_sno1_ptn_cd_META = createCommonMeta($def_sno1_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_sno2_mng_typ_META = createCommonMeta($def_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta def_slo_sno2_flg_META = createCommonMeta($def_slo_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_rqmt_sno2_flg_META = createCommonMeta($def_rqmt_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sno2_num_typ_META = createCommonMeta($def_sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta def_sno2_ptn_cd_META = createCommonMeta($def_sno2_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_sno3_mng_typ_META = createCommonMeta($def_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta def_slo_sno3_flg_META = createCommonMeta($def_slo_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_rqmt_sno3_flg_META = createCommonMeta($def_rqmt_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sno3_num_typ_META = createCommonMeta($def_sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta def_sno3_ptn_cd_META = createCommonMeta($def_sno3_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_sno4_mng_typ_META = createCommonMeta($def_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta def_slo_sno4_flg_META = createCommonMeta($def_slo_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_rqmt_sno4_flg_META = createCommonMeta($def_rqmt_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sno4_num_typ_META = createCommonMeta($def_sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta def_sno4_ptn_cd_META = createCommonMeta($def_sno4_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_lmt_ctl_flg_META = createCommonMeta($def_lmt_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_lmt_ctl_categ_META = createCommonMeta($def_lmt_ctl_categ, mcframe.commonMA.meta.MA_META.LMT_CTL_CATEG);
	public static final MCMeta def_ver_flg_META = createCommonMeta($def_ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_insp_bind_typ_META = createCommonMeta($def_insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta def_mrkt_judg_flg_META = createCommonMeta($def_mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mrkt_judg_role_cd_META = createCommonMeta($def_mrkt_judg_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_mrkt_judg_upd_role_cd_META = createCommonMeta($def_mrkt_judg_upd_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_plnt_aprv_flg_META = createCommonMeta($def_plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_plnt_aprv_role_cd_META = createCommonMeta($def_plnt_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_insp_aprv_flg_META = createCommonMeta($def_insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_insp_aprv_role_cd_META = createCommonMeta($def_insp_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_mfg_aprv_flg_META = createCommonMeta($def_mfg_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mfg_aprv_role_cd_META = createCommonMeta($def_mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_sno_typ1_META = createCommonMeta($def_sno_typ1, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta def_sno_typ2_META = createCommonMeta($def_sno_typ2, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta def_sno_typ3_META = createCommonMeta($def_sno_typ3, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta def_sno_typ4_META = createCommonMeta($def_sno_typ4, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta def_inst_lot_fix_flg_META = createCommonMeta($def_inst_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_lot_mix_flg_META = createCommonMeta($def_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sublot_mix_flg_META = createCommonMeta($def_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_alloc_ctl_typ_META = createCommonMeta($def_alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta def_inpt_ctl_typ_META = createCommonMeta($def_inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta def_bkf_typ_META = createCommonMeta($def_bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta def_main_itm_flg_META = createCommonMeta($def_main_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_byprod_flg_META = createCommonMeta($def_byprod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_not_cost_bom_flg_META = createCommonMeta($def_not_cost_bom_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_calc_ptn_cd_META = createCommonMeta($def_calc_ptn_cd, mcframe.commonMA.meta.MA_META.CALC_PTN_CD);
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
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta itm_typ_d_nm_lcl1_META = createCommonMeta($itm_typ_d_nm_lcl1, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_typ_d_nm_lcl2_META = createCommonMeta($itm_typ_d_nm_lcl2, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_typ_d_nm_lcl3_META = createCommonMeta($itm_typ_d_nm_lcl3, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_typ_d_nm_lcl4_META = createCommonMeta($itm_typ_d_nm_lcl4, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_typ_d_nm_lcl5_META = createCommonMeta($itm_typ_d_nm_lcl5, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $CO_ALL1 = "CO_ALL1";
	public static final String $ITM_JNL_CMN1 = "ITM_JNL_CMN1";
	public static final String $AC_ITM_GRP_CMN1 = "AC_ITM_GRP_CMN1";
	public static final String $ITM_SPEC_GRP_CMN1 = "ITM_SPEC_GRP_CMN1";
	public static final String $SLS_UPRI_GRP_CMN1 = "SLS_UPRI_GRP_CMN1";
	public static final String $ITM_SHIP_GRP_CMN1 = "ITM_SHIP_GRP_CMN1";
	public static final String $SHIP_VALID_CMN1 = "SHIP_VALID_CMN1";
	public static final String $SHIP_TERM_CMN1 = "SHIP_TERM_CMN1";
	public static final String $APRV_ROLE_CMN1 = "APRV_ROLE_CMN1";
	public static final String $APRV_ROLE_CMN2 = "APRV_ROLE_CMN2";
	public static final String $APRV_ROLE_CMN3 = "APRV_ROLE_CMN3";
	public static final String $APRV_ROLE_CMN4 = "APRV_ROLE_CMN4";
	public static final String $APRV_ROLE_CMN5 = "APRV_ROLE_CMN5";
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
				"MAM_ITM_JNL_CMN",
				$ITM_JNL_CMN1,
				new String[][]{
						{"def_itm_jnl_cd", "itm_jnl_cd"}
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
						{"def_ac_itm_grp_cd", "ac_itm_grp_cd"}
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
						{"def_itm_spec_grp_cd", "itm_spec_grp_cd"}
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
						{"def_sls_upri_grp_cd", "sls_upri_grp_cd"}
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
						{"def_itm_ship_grp_cd", "itm_ship_grp_cd"}
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
						{"def_ship_valid_grp_cd", "ship_valid_grp_cd"}
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
						{"def_ship_term_cd", "ship_term_cd"}
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
						{"def_mrkt_judg_role_cd", "aprv_role_cd"}
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
						{"def_mrkt_judg_upd_role_cd", "aprv_role_cd"}
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
				$APRV_ROLE_CMN3,
				new String[][]{
						{"def_plnt_aprv_role_cd", "aprv_role_cd"}
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
				$APRV_ROLE_CMN4,
				new String[][]{
						{"def_insp_aprv_role_cd", "aprv_role_cd"}
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
				$APRV_ROLE_CMN5,
				new String[][]{
						{"def_mfg_aprv_role_cd", "aprv_role_cd"}
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
	
	protected static final ConstMetaList<MAVM_ITM_TYP_D_MST_R> constMetas = new ConstMetaList<MAVM_ITM_TYP_D_MST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			def_sls_flg_META,
			def_mfg_flg_META,
			def_purc_flg_META,
			def_insp_flg_META,
			def_itm_jnl_cd_META,
			def_ac_itm_grp_cd_META,
			def_minus_stk_flg_META,
			def_not_new_lot_flg_META,
			def_gi_alloc_flg_META,
			def_pack_alloc_flg_META,
			def_bp_lot_flg_META,
			def_comp_spec_typ_META,
			def_comp_rev_at_slo_flg_META,
			def_comp_core_itm_flg_META,
			def_skip_chk_ship_flg_META,
			def_itm_spec_grp_cd_META,
			def_sls_upri_grp_cd_META,
			def_slo_proc_flg_META,
			def_slo_proc_typ_META,
			def_ship_inst_typ_META,
			def_ship_lot_back_stop_flg_META,
			def_itm_ship_grp_cd_META,
			def_ship_valid_grp_cd_META,
			def_arr_skip_flg_META,
			def_ship_term_cd_META,
			def_stk_lst_flg_META,
			def_mfg_inst_unit_typ_META,
			def_sls_upri_cng_flg_META,
			def_purc_upri_cng_flg_META,
			def_prov_upri_cng_flg_META,
			def_mrp_proc_typ_META,
			def_rqmt_typ_META,
			def_prod_pln_typ_META,
			def_dmnd_date_div_mons_META,
			def_alloc_margin_days_META,
			def_mrp_alloc_margin_days_META,
			def_mrp_opn_xfr_days_META,
			def_inpt_itm_add_flg_META,
			def_inpt_itm_del_flg_META,
			def_sch_flg_META,
			def_lot_mng_typ_META,
			def_lot_no_typ_META,
			def_lot_no_ptn_cd_META,
			def_sublot_mng_typ_META,
			def_sublot_no_typ_META,
			def_sublot_no_ptn_cd_META,
			def_sno1_mng_typ_META,
			def_slo_sno1_flg_META,
			def_rqmt_sno1_flg_META,
			def_sno1_num_typ_META,
			def_sno1_ptn_cd_META,
			def_sno2_mng_typ_META,
			def_slo_sno2_flg_META,
			def_rqmt_sno2_flg_META,
			def_sno2_num_typ_META,
			def_sno2_ptn_cd_META,
			def_sno3_mng_typ_META,
			def_slo_sno3_flg_META,
			def_rqmt_sno3_flg_META,
			def_sno3_num_typ_META,
			def_sno3_ptn_cd_META,
			def_sno4_mng_typ_META,
			def_slo_sno4_flg_META,
			def_rqmt_sno4_flg_META,
			def_sno4_num_typ_META,
			def_sno4_ptn_cd_META,
			def_lmt_ctl_flg_META,
			def_lmt_ctl_categ_META,
			def_ver_flg_META,
			def_insp_bind_typ_META,
			def_mrkt_judg_flg_META,
			def_mrkt_judg_role_cd_META,
			def_mrkt_judg_upd_role_cd_META,
			def_plnt_aprv_flg_META,
			def_plnt_aprv_role_cd_META,
			def_insp_aprv_flg_META,
			def_insp_aprv_role_cd_META,
			def_mfg_aprv_flg_META,
			def_mfg_aprv_role_cd_META,
			def_sno_typ1_META,
			def_sno_typ2_META,
			def_sno_typ3_META,
			def_sno_typ4_META,
			def_inst_lot_fix_flg_META,
			def_lot_mix_flg_META,
			def_sublot_mix_flg_META,
			def_alloc_ctl_typ_META,
			def_inpt_ctl_typ_META,
			def_bkf_typ_META,
			def_main_itm_flg_META,
			def_byprod_flg_META,
			def_not_cost_bom_flg_META,
			def_calc_ptn_cd_META,
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
			co_cd_META,
			itm_typ_d_nm_lcl1_META,
			itm_typ_d_nm_lcl2_META,
			itm_typ_d_nm_lcl3_META,
			itm_typ_d_nm_lcl4_META,
			itm_typ_d_nm_lcl5_META
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
	protected MAVM_ITM_TYP_D_MST_R(ConstMetaList<? extends MAVM_ITM_TYP_D_MST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_ITM_TYP_D_MST_R(ConstMetaList<? extends MAVM_ITM_TYP_D_MST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$itm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$itm_typ,
				"itm_typ",
				itm_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$itm_typ_d_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$itm_typ_d_cd,
				"itm_typ_d_cd",
				itm_typ_d_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm,
				"itm_typ_d_nm",
				itm_typ_d_nm,
				false,
				false,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sls_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_sls_flg,
				"def_sls_flg",
				def_sls_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_mfg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_mfg_flg,
				"def_mfg_flg",
				def_mfg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_purc_flg,
				"def_purc_flg",
				def_purc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_insp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_insp_flg,
				"def_insp_flg",
				def_insp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_itm_jnl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_itm_jnl_cd,
				"def_itm_jnl_cd",
				def_itm_jnl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_ac_itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_ac_itm_grp_cd,
				"def_ac_itm_grp_cd",
				def_ac_itm_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_minus_stk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_minus_stk_flg,
				"def_minus_stk_flg",
				def_minus_stk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_not_new_lot_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_not_new_lot_flg,
				"def_not_new_lot_flg",
				def_not_new_lot_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_gi_alloc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_gi_alloc_flg,
				"def_gi_alloc_flg",
				def_gi_alloc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_pack_alloc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_pack_alloc_flg,
				"def_pack_alloc_flg",
				def_pack_alloc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_bp_lot_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_bp_lot_flg,
				"def_bp_lot_flg",
				def_bp_lot_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_comp_spec_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_comp_spec_typ,
				"def_comp_spec_typ",
				def_comp_spec_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_comp_rev_at_slo_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_comp_rev_at_slo_flg,
				"def_comp_rev_at_slo_flg",
				def_comp_rev_at_slo_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_comp_core_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_comp_core_itm_flg,
				"def_comp_core_itm_flg",
				def_comp_core_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_skip_chk_ship_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_skip_chk_ship_flg,
				"def_skip_chk_ship_flg",
				def_skip_chk_ship_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_itm_spec_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_itm_spec_grp_cd,
				"def_itm_spec_grp_cd",
				def_itm_spec_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sls_upri_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sls_upri_grp_cd,
				"def_sls_upri_grp_cd",
				def_sls_upri_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_slo_proc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_slo_proc_flg,
				"def_slo_proc_flg",
				def_slo_proc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_slo_proc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_slo_proc_typ,
				"def_slo_proc_typ",
				def_slo_proc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_ship_inst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_ship_inst_typ,
				"def_ship_inst_typ",
				def_ship_inst_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_ship_lot_back_stop_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_ship_lot_back_stop_flg,
				"def_ship_lot_back_stop_flg",
				def_ship_lot_back_stop_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_itm_ship_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_itm_ship_grp_cd,
				"def_itm_ship_grp_cd",
				def_itm_ship_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_ship_valid_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_ship_valid_grp_cd,
				"def_ship_valid_grp_cd",
				def_ship_valid_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_arr_skip_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_arr_skip_flg,
				"def_arr_skip_flg",
				def_arr_skip_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_ship_term_cd,
				"def_ship_term_cd",
				def_ship_term_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_stk_lst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_stk_lst_flg,
				"def_stk_lst_flg",
				def_stk_lst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_mfg_inst_unit_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_mfg_inst_unit_typ,
				"def_mfg_inst_unit_typ",
				def_mfg_inst_unit_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sls_upri_cng_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_sls_upri_cng_flg,
				"def_sls_upri_cng_flg",
				def_sls_upri_cng_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_purc_upri_cng_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_purc_upri_cng_flg,
				"def_purc_upri_cng_flg",
				def_purc_upri_cng_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_prov_upri_cng_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_prov_upri_cng_flg,
				"def_prov_upri_cng_flg",
				def_prov_upri_cng_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_mrp_proc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_mrp_proc_typ,
				"def_mrp_proc_typ",
				def_mrp_proc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_rqmt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_rqmt_typ,
				"def_rqmt_typ",
				def_rqmt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_prod_pln_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_prod_pln_typ,
				"def_prod_pln_typ",
				def_prod_pln_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_dmnd_date_div_mons,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_TYP_D_MST_R.$def_dmnd_date_div_mons,
				"def_dmnd_date_div_mons",
				def_dmnd_date_div_mons,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_alloc_margin_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_TYP_D_MST_R.$def_alloc_margin_days,
				"def_alloc_margin_days",
				def_alloc_margin_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_mrp_alloc_margin_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_TYP_D_MST_R.$def_mrp_alloc_margin_days,
				"def_mrp_alloc_margin_days",
				def_mrp_alloc_margin_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_mrp_opn_xfr_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_TYP_D_MST_R.$def_mrp_opn_xfr_days,
				"def_mrp_opn_xfr_days",
				def_mrp_opn_xfr_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_inpt_itm_add_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_inpt_itm_add_flg,
				"def_inpt_itm_add_flg",
				def_inpt_itm_add_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_inpt_itm_del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_inpt_itm_del_flg,
				"def_inpt_itm_del_flg",
				def_inpt_itm_del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sch_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_sch_flg,
				"def_sch_flg",
				def_sch_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_lot_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_lot_mng_typ,
				"def_lot_mng_typ",
				def_lot_mng_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_lot_no_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_lot_no_typ,
				"def_lot_no_typ",
				def_lot_no_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_lot_no_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_lot_no_ptn_cd,
				"def_lot_no_ptn_cd",
				def_lot_no_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sublot_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sublot_mng_typ,
				"def_sublot_mng_typ",
				def_sublot_mng_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sublot_no_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sublot_no_typ,
				"def_sublot_no_typ",
				def_sublot_no_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sublot_no_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sublot_no_ptn_cd,
				"def_sublot_no_ptn_cd",
				def_sublot_no_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno1_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno1_mng_typ,
				"def_sno1_mng_typ",
				def_sno1_mng_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_slo_sno1_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_slo_sno1_flg,
				"def_slo_sno1_flg",
				def_slo_sno1_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_rqmt_sno1_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_rqmt_sno1_flg,
				"def_rqmt_sno1_flg",
				def_rqmt_sno1_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno1_num_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno1_num_typ,
				"def_sno1_num_typ",
				def_sno1_num_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno1_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno1_ptn_cd,
				"def_sno1_ptn_cd",
				def_sno1_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno2_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno2_mng_typ,
				"def_sno2_mng_typ",
				def_sno2_mng_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_slo_sno2_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_slo_sno2_flg,
				"def_slo_sno2_flg",
				def_slo_sno2_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_rqmt_sno2_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_rqmt_sno2_flg,
				"def_rqmt_sno2_flg",
				def_rqmt_sno2_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno2_num_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno2_num_typ,
				"def_sno2_num_typ",
				def_sno2_num_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno2_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno2_ptn_cd,
				"def_sno2_ptn_cd",
				def_sno2_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno3_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno3_mng_typ,
				"def_sno3_mng_typ",
				def_sno3_mng_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_slo_sno3_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_slo_sno3_flg,
				"def_slo_sno3_flg",
				def_slo_sno3_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_rqmt_sno3_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_rqmt_sno3_flg,
				"def_rqmt_sno3_flg",
				def_rqmt_sno3_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno3_num_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno3_num_typ,
				"def_sno3_num_typ",
				def_sno3_num_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno3_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno3_ptn_cd,
				"def_sno3_ptn_cd",
				def_sno3_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno4_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno4_mng_typ,
				"def_sno4_mng_typ",
				def_sno4_mng_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_slo_sno4_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_slo_sno4_flg,
				"def_slo_sno4_flg",
				def_slo_sno4_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_rqmt_sno4_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_rqmt_sno4_flg,
				"def_rqmt_sno4_flg",
				def_rqmt_sno4_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno4_num_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno4_num_typ,
				"def_sno4_num_typ",
				def_sno4_num_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno4_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno4_ptn_cd,
				"def_sno4_ptn_cd",
				def_sno4_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_lmt_ctl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_lmt_ctl_flg,
				"def_lmt_ctl_flg",
				def_lmt_ctl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_lmt_ctl_categ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_lmt_ctl_categ,
				"def_lmt_ctl_categ",
				def_lmt_ctl_categ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_ver_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_ver_flg,
				"def_ver_flg",
				def_ver_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_insp_bind_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_insp_bind_typ,
				"def_insp_bind_typ",
				def_insp_bind_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_mrkt_judg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_mrkt_judg_flg,
				"def_mrkt_judg_flg",
				def_mrkt_judg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_mrkt_judg_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_mrkt_judg_role_cd,
				"def_mrkt_judg_role_cd",
				def_mrkt_judg_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_mrkt_judg_upd_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_mrkt_judg_upd_role_cd,
				"def_mrkt_judg_upd_role_cd",
				def_mrkt_judg_upd_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_plnt_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_plnt_aprv_flg,
				"def_plnt_aprv_flg",
				def_plnt_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_plnt_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_plnt_aprv_role_cd,
				"def_plnt_aprv_role_cd",
				def_plnt_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_insp_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_insp_aprv_flg,
				"def_insp_aprv_flg",
				def_insp_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_insp_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_insp_aprv_role_cd,
				"def_insp_aprv_role_cd",
				def_insp_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_mfg_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_mfg_aprv_flg,
				"def_mfg_aprv_flg",
				def_mfg_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_mfg_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_mfg_aprv_role_cd,
				"def_mfg_aprv_role_cd",
				def_mfg_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno_typ1,
				"def_sno_typ1",
				def_sno_typ1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno_typ2,
				"def_sno_typ2",
				def_sno_typ2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno_typ3,
				"def_sno_typ3",
				def_sno_typ3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sno_typ4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_sno_typ4,
				"def_sno_typ4",
				def_sno_typ4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_inst_lot_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_inst_lot_fix_flg,
				"def_inst_lot_fix_flg",
				def_inst_lot_fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_lot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_lot_mix_flg,
				"def_lot_mix_flg",
				def_lot_mix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_sublot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_sublot_mix_flg,
				"def_sublot_mix_flg",
				def_sublot_mix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_alloc_ctl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_alloc_ctl_typ,
				"def_alloc_ctl_typ",
				def_alloc_ctl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_inpt_ctl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_inpt_ctl_typ,
				"def_inpt_ctl_typ",
				def_inpt_ctl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_bkf_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_bkf_typ,
				"def_bkf_typ",
				def_bkf_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_main_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_main_itm_flg,
				"def_main_itm_flg",
				def_main_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_byprod_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_byprod_flg,
				"def_byprod_flg",
				def_byprod_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_not_cost_bom_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$def_not_cost_bom_flg,
				"def_not_cost_bom_flg",
				def_not_cost_bom_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$def_calc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$def_calc_ptn_cd,
				"def_calc_ptn_cd",
				def_calc_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$memo1,
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
			MAVM_ITM_TYP_D_MST_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$memo2,
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
			MAVM_ITM_TYP_D_MST_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$memo3,
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
			MAVM_ITM_TYP_D_MST_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_ITM_TYP_D_MST_R.$del_flg,
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
			MAVM_ITM_TYP_D_MST_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$del_usr_id,
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
			MAVM_ITM_TYP_D_MST_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$del_usr_nm,
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
			MAVM_ITM_TYP_D_MST_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_ITM_TYP_D_MST_R.$del_ts,
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
			MAVM_ITM_TYP_D_MST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$ins_usr_id,
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
			MAVM_ITM_TYP_D_MST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$ins_usr_nm,
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
			MAVM_ITM_TYP_D_MST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_ITM_TYP_D_MST_R.$ins_ts,
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
			MAVM_ITM_TYP_D_MST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$ins_func_id,
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
			MAVM_ITM_TYP_D_MST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_ITM_TYP_D_MST_R.$upd_cntr,
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
			MAVM_ITM_TYP_D_MST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$upd_usr_id,
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
			MAVM_ITM_TYP_D_MST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$upd_usr_nm,
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
			MAVM_ITM_TYP_D_MST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_ITM_TYP_D_MST_R.$upd_ts,
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
			MAVM_ITM_TYP_D_MST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$upd_func_id,
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
			MAVM_ITM_TYP_D_MST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$upd_srv_req_no,
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
			MAVM_ITM_TYP_D_MST_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$co_cd,
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
			MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm_lcl1,
				"itm_typ_d_nm_lcl1",
				itm_typ_d_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm_lcl2,
				"itm_typ_d_nm_lcl2",
				itm_typ_d_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm_lcl3,
				"itm_typ_d_nm_lcl3",
				itm_typ_d_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm_lcl4,
				"itm_typ_d_nm_lcl4",
				itm_typ_d_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_TYP_D_MST_R.$itm_typ_d_nm_lcl5,
				"itm_typ_d_nm_lcl5",
				itm_typ_d_nm_lcl5,
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
	public static MAVM_ITM_TYP_D_MST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_ITM_TYP_D_MST_R create(String alias) {
		MAVM_ITM_TYP_D_MST_R row = new MAVM_ITM_TYP_D_MST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_ITM_TYP_D_MST_R createByName(T proto) {
		MAVM_ITM_TYP_D_MST_R row = MAVM_ITM_TYP_D_MST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_TYP_D_MST_R clone() {
		return (MAVM_ITM_TYP_D_MST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_TYP_D_MST_R createInstance() {
		return (MAVM_ITM_TYP_D_MST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_TYP_D_MST_R getValues(String... names) {
		return (MAVM_ITM_TYP_D_MST_R) super.getValues(names);
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
	 * 品目区分. Item type.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 0, $itm_typ);
	}

	/**
	 * 品目区分. Item type.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 0, $itm_typ, value);
	}

	/**
	 * 品目区分詳細ＣＤ. Item type details cd..<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 1, $itm_typ_d_cd);
	}

	/**
	 * 品目区分詳細ＣＤ. Item type details cd..<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 1, $itm_typ_d_cd, value);
	}

	/**
	 * 品目区分詳細名. Item type details name.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 2, $itm_typ_d_nm);
	}

	/**
	 * 品目区分詳細名. Item type details name.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 2, $itm_typ_d_nm, value);
	}

	/**
	 * 販売ＦＬＧ. Sales flg..<p>
	 *
	 */
	public boolean def_sls_flg() {
		return getConstBoolean(offset + 3, $def_sls_flg);
	}

	/**
	 * 販売ＦＬＧ. Sales flg..<p>
	 *
	 */
	public void def_sls_flg(boolean value) {
		setConstBoolean(offset + 3, $def_sls_flg, value);
	}

	/**
	 * 製造ＦＬＧ. Mfg. flg..<p>
	 *
	 */
	public boolean def_mfg_flg() {
		return getConstBoolean(offset + 4, $def_mfg_flg);
	}

	/**
	 * 製造ＦＬＧ. Mfg. flg..<p>
	 *
	 */
	public void def_mfg_flg(boolean value) {
		setConstBoolean(offset + 4, $def_mfg_flg, value);
	}

	/**
	 * 購買ＦＬＧ. Purchasing flg..<p>
	 *
	 */
	public boolean def_purc_flg() {
		return getConstBoolean(offset + 5, $def_purc_flg);
	}

	/**
	 * 購買ＦＬＧ. Purchasing flg..<p>
	 *
	 */
	public void def_purc_flg(boolean value) {
		setConstBoolean(offset + 5, $def_purc_flg, value);
	}

	/**
	 * 検査ＦＬＧ. Inspection flg..<p>
	 *
	 */
	public boolean def_insp_flg() {
		return getConstBoolean(offset + 6, $def_insp_flg);
	}

	/**
	 * 検査ＦＬＧ. Inspection flg..<p>
	 *
	 */
	public void def_insp_flg(boolean value) {
		setConstBoolean(offset + 6, $def_insp_flg, value);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public String def_itm_jnl_cd() {
		return getConstString(offset + 7, $def_itm_jnl_cd);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public void def_itm_jnl_cd(String value) {
		setConstString(offset + 7, $def_itm_jnl_cd, value);
	}

	/**
	 * 会計品目分類ＣＤ. Accounting item classification cd..<p>
	 *
	 */
	public String def_ac_itm_grp_cd() {
		return getConstString(offset + 8, $def_ac_itm_grp_cd);
	}

	/**
	 * 会計品目分類ＣＤ. Accounting item classification cd..<p>
	 *
	 */
	public void def_ac_itm_grp_cd(String value) {
		setConstString(offset + 8, $def_ac_itm_grp_cd, value);
	}

	/**
	 * マイナス在庫許可ＦＬＧ. Allow negative inventory flg..<p>
	 *
	 */
	public boolean def_minus_stk_flg() {
		return getConstBoolean(offset + 9, $def_minus_stk_flg);
	}

	/**
	 * マイナス在庫許可ＦＬＧ. Allow negative inventory flg..<p>
	 *
	 */
	public void def_minus_stk_flg(boolean value) {
		setConstBoolean(offset + 9, $def_minus_stk_flg, value);
	}

	/**
	 * 新規ロット入力不可ＦＬＧ. Do not allow new lot input flg..<p>
	 *
	 */
	public boolean def_not_new_lot_flg() {
		return getConstBoolean(offset + 10, $def_not_new_lot_flg);
	}

	/**
	 * 新規ロット入力不可ＦＬＧ. Do not allow new lot input flg..<p>
	 *
	 */
	public void def_not_new_lot_flg(boolean value) {
		setConstBoolean(offset + 10, $def_not_new_lot_flg, value);
	}

	/**
	 * 出庫引当確認ＦＬＧ. GI allocation check flg..<p>
	 *
	 */
	public boolean def_gi_alloc_flg() {
		return getConstBoolean(offset + 11, $def_gi_alloc_flg);
	}

	/**
	 * 出庫引当確認ＦＬＧ. GI allocation check flg..<p>
	 *
	 */
	public void def_gi_alloc_flg(boolean value) {
		setConstBoolean(offset + 11, $def_gi_alloc_flg, value);
	}

	/**
	 * 荷姿引当ＦＬＧ. SKU allocation flg..<p>
	 *
	 */
	public boolean def_pack_alloc_flg() {
		return getConstBoolean(offset + 12, $def_pack_alloc_flg);
	}

	/**
	 * 荷姿引当ＦＬＧ. SKU allocation flg..<p>
	 *
	 */
	public void def_pack_alloc_flg(boolean value) {
		setConstBoolean(offset + 12, $def_pack_alloc_flg, value);
	}

	/**
	 * 業者ロットＮＯ必須ＦＬＧ. Vendor Lot No. required flg..<p>
	 *
	 */
	public boolean def_bp_lot_flg() {
		return getConstBoolean(offset + 13, $def_bp_lot_flg);
	}

	/**
	 * 業者ロットＮＯ必須ＦＬＧ. Vendor Lot No. required flg..<p>
	 *
	 */
	public void def_bp_lot_flg(boolean value) {
		setConstBoolean(offset + 13, $def_bp_lot_flg, value);
	}

	/**
	 * 構成・仕様管理区分. Configuration/specification management type.<p>
	 *
	 */
	public String def_comp_spec_typ() {
		return getConstString(offset + 14, $def_comp_spec_typ);
	}

	/**
	 * 構成・仕様管理区分. Configuration/specification management type.<p>
	 *
	 */
	public void def_comp_spec_typ(String value) {
		setConstString(offset + 14, $def_comp_spec_typ, value);
	}

	/**
	 * 受注時構成改訂許可ＦＬＧ. Allow sales order configuration rev. flg..<p>
	 *
	 */
	public boolean def_comp_rev_at_slo_flg() {
		return getConstBoolean(offset + 15, $def_comp_rev_at_slo_flg);
	}

	/**
	 * 受注時構成改訂許可ＦＬＧ. Allow sales order configuration rev. flg..<p>
	 *
	 */
	public void def_comp_rev_at_slo_flg(boolean value) {
		setConstBoolean(offset + 15, $def_comp_rev_at_slo_flg, value);
	}

	/**
	 * 構成主品目ＦＬＧ. Configuration main item flg..<p>
	 *
	 */
	public boolean def_comp_core_itm_flg() {
		return getConstBoolean(offset + 16, $def_comp_core_itm_flg);
	}

	/**
	 * 構成主品目ＦＬＧ. Configuration main item flg..<p>
	 *
	 */
	public void def_comp_core_itm_flg(boolean value) {
		setConstBoolean(offset + 16, $def_comp_core_itm_flg, value);
	}

	/**
	 * 出荷時構成チェック不要ＦＬＧ. Component check not required at shipping flg..<p>
	 *
	 */
	public boolean def_skip_chk_ship_flg() {
		return getConstBoolean(offset + 17, $def_skip_chk_ship_flg);
	}

	/**
	 * 出荷時構成チェック不要ＦＬＧ. Component check not required at shipping flg..<p>
	 *
	 */
	public void def_skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 17, $def_skip_chk_ship_flg, value);
	}

	/**
	 * 品目仕様分類ＣＤ. Item specification classification cd..<p>
	 *
	 */
	public String def_itm_spec_grp_cd() {
		return getConstString(offset + 18, $def_itm_spec_grp_cd);
	}

	/**
	 * 品目仕様分類ＣＤ. Item specification classification cd..<p>
	 *
	 */
	public void def_itm_spec_grp_cd(String value) {
		setConstString(offset + 18, $def_itm_spec_grp_cd, value);
	}

	/**
	 * 販売単価分類ＣＤ. Sales unit price classification cd..<p>
	 *
	 */
	public String def_sls_upri_grp_cd() {
		return getConstString(offset + 19, $def_sls_upri_grp_cd);
	}

	/**
	 * 販売単価分類ＣＤ. Sales unit price classification cd..<p>
	 *
	 */
	public void def_sls_upri_grp_cd(String value) {
		setConstString(offset + 19, $def_sls_upri_grp_cd, value);
	}

	/**
	 * 受注手配品ＦＬＧ. Sales order procurement item flg..<p>
	 *
	 */
	public boolean def_slo_proc_flg() {
		return getConstBoolean(offset + 20, $def_slo_proc_flg);
	}

	/**
	 * 受注手配品ＦＬＧ. Sales order procurement item flg..<p>
	 *
	 */
	public void def_slo_proc_flg(boolean value) {
		setConstBoolean(offset + 20, $def_slo_proc_flg, value);
	}

	/**
	 * 受注手配区分. Sales order procurement type.<p>
	 *
	 */
	public String def_slo_proc_typ() {
		return getConstString(offset + 21, $def_slo_proc_typ);
	}

	/**
	 * 受注手配区分. Sales order procurement type.<p>
	 *
	 */
	public void def_slo_proc_typ(String value) {
		setConstString(offset + 21, $def_slo_proc_typ, value);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public String def_ship_inst_typ() {
		return getConstString(offset + 22, $def_ship_inst_typ);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public void def_ship_inst_typ(String value) {
		setConstString(offset + 22, $def_ship_inst_typ, value);
	}

	/**
	 * 出荷ロット逆転禁止ＦＬＧ. Shipping lot reverse prohibit flg..<p>
	 *
	 */
	public boolean def_ship_lot_back_stop_flg() {
		return getConstBoolean(offset + 23, $def_ship_lot_back_stop_flg);
	}

	/**
	 * 出荷ロット逆転禁止ＦＬＧ. Shipping lot reverse prohibit flg..<p>
	 *
	 */
	public void def_ship_lot_back_stop_flg(boolean value) {
		setConstBoolean(offset + 23, $def_ship_lot_back_stop_flg, value);
	}

	/**
	 * 品目出荷グループＣＤ. Item shipping group cd..<p>
	 *
	 */
	public String def_itm_ship_grp_cd() {
		return getConstString(offset + 24, $def_itm_ship_grp_cd);
	}

	/**
	 * 品目出荷グループＣＤ. Item shipping group cd..<p>
	 *
	 */
	public void def_itm_ship_grp_cd(String value) {
		setConstString(offset + 24, $def_itm_ship_grp_cd, value);
	}

	/**
	 * 出荷有効期限グループＣＤ. Shipping expiration date group cd..<p>
	 *
	 */
	public String def_ship_valid_grp_cd() {
		return getConstString(offset + 25, $def_ship_valid_grp_cd);
	}

	/**
	 * 出荷有効期限グループＣＤ. Shipping expiration date group cd..<p>
	 *
	 */
	public void def_ship_valid_grp_cd(String value) {
		setConstString(offset + 25, $def_ship_valid_grp_cd, value);
	}

	/**
	 * 入荷不要ＦＬＧ. Not receipt flg..<p>
	 *
	 */
	public boolean def_arr_skip_flg() {
		return getConstBoolean(offset + 26, $def_arr_skip_flg);
	}

	/**
	 * 入荷不要ＦＬＧ. Not receipt flg..<p>
	 *
	 */
	public void def_arr_skip_flg(boolean value) {
		setConstBoolean(offset + 26, $def_arr_skip_flg, value);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public String def_ship_term_cd() {
		return getConstString(offset + 27, $def_ship_term_cd);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public void def_ship_term_cd(String value) {
		setConstString(offset + 27, $def_ship_term_cd, value);
	}

	/**
	 * 現品票出力対象ＦＬＧ. For identification tag output flg..<p>
	 *
	 */
	public boolean def_stk_lst_flg() {
		return getConstBoolean(offset + 28, $def_stk_lst_flg);
	}

	/**
	 * 現品票出力対象ＦＬＧ. For identification tag output flg..<p>
	 *
	 */
	public void def_stk_lst_flg(boolean value) {
		setConstBoolean(offset + 28, $def_stk_lst_flg, value);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public String def_mfg_inst_unit_typ() {
		return getConstString(offset + 29, $def_mfg_inst_unit_typ);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public void def_mfg_inst_unit_typ(String value) {
		setConstString(offset + 29, $def_mfg_inst_unit_typ, value);
	}

	/**
	 * 販売単価変更許可ＦＬＧ. Allow sales unit price change flg..<p>
	 *
	 */
	public boolean def_sls_upri_cng_flg() {
		return getConstBoolean(offset + 30, $def_sls_upri_cng_flg);
	}

	/**
	 * 販売単価変更許可ＦＬＧ. Allow sales unit price change flg..<p>
	 *
	 */
	public void def_sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 30, $def_sls_upri_cng_flg, value);
	}

	/**
	 * 購買単価変更許可ＦＬＧ. Allow purchasing unit price change flg..<p>
	 *
	 */
	public boolean def_purc_upri_cng_flg() {
		return getConstBoolean(offset + 31, $def_purc_upri_cng_flg);
	}

	/**
	 * 購買単価変更許可ＦＬＧ. Allow purchasing unit price change flg..<p>
	 *
	 */
	public void def_purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 31, $def_purc_upri_cng_flg, value);
	}

	/**
	 * 支給単価変更許可ＦＬＧ. Allow supply unit price change flg..<p>
	 *
	 */
	public boolean def_prov_upri_cng_flg() {
		return getConstBoolean(offset + 32, $def_prov_upri_cng_flg);
	}

	/**
	 * 支給単価変更許可ＦＬＧ. Allow supply unit price change flg..<p>
	 *
	 */
	public void def_prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 32, $def_prov_upri_cng_flg, value);
	}

	/**
	 * ＭＲＰ処理区分. MRP process type.<p>
	 *
	 */
	public String def_mrp_proc_typ() {
		return getConstString(offset + 33, $def_mrp_proc_typ);
	}

	/**
	 * ＭＲＰ処理区分. MRP process type.<p>
	 *
	 */
	public void def_mrp_proc_typ(String value) {
		setConstString(offset + 33, $def_mrp_proc_typ, value);
	}

	/**
	 * 所要区分. Requirements type.<p>
	 *
	 */
	public String def_rqmt_typ() {
		return getConstString(offset + 34, $def_rqmt_typ);
	}

	/**
	 * 所要区分. Requirements type.<p>
	 *
	 */
	public void def_rqmt_typ(String value) {
		setConstString(offset + 34, $def_rqmt_typ, value);
	}

	/**
	 * 生産計画立案区分. Production planning type.<p>
	 *
	 */
	public String def_prod_pln_typ() {
		return getConstString(offset + 35, $def_prod_pln_typ);
	}

	/**
	 * 生産計画立案区分. Production planning type.<p>
	 *
	 */
	public void def_prod_pln_typ(String value) {
		setConstString(offset + 35, $def_prod_pln_typ, value);
	}

	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public MCNumber def_dmnd_date_div_mons() {
		return getConstNumber(offset + 36, $def_dmnd_date_div_mons);
	}

	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void def_dmnd_date_div_mons(MCNumber value) {
		setConstNumber(offset + 36, $def_dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void def_dmnd_date_div_mons(int value) {
		setConstNumber(offset + 36, $def_dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void def_dmnd_date_div_mons(long value) {
		setConstNumber(offset + 36, $def_dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void def_dmnd_date_div_mons(float value) {
		setConstNumber(offset + 36, $def_dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void def_dmnd_date_div_mons(double value) {
		setConstNumber(offset + 36, $def_dmnd_date_div_mons, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public MCNumber def_alloc_margin_days() {
		return getConstNumber(offset + 37, $def_alloc_margin_days);
	}

	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void def_alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 37, $def_alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void def_alloc_margin_days(int value) {
		setConstNumber(offset + 37, $def_alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void def_alloc_margin_days(long value) {
		setConstNumber(offset + 37, $def_alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void def_alloc_margin_days(float value) {
		setConstNumber(offset + 37, $def_alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void def_alloc_margin_days(double value) {
		setConstNumber(offset + 37, $def_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public MCNumber def_mrp_alloc_margin_days() {
		return getConstNumber(offset + 38, $def_mrp_alloc_margin_days);
	}

	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void def_mrp_alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 38, $def_mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void def_mrp_alloc_margin_days(int value) {
		setConstNumber(offset + 38, $def_mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void def_mrp_alloc_margin_days(long value) {
		setConstNumber(offset + 38, $def_mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void def_mrp_alloc_margin_days(float value) {
		setConstNumber(offset + 38, $def_mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void def_mrp_alloc_margin_days(double value) {
		setConstNumber(offset + 38, $def_mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public MCNumber def_mrp_opn_xfr_days() {
		return getConstNumber(offset + 39, $def_mrp_opn_xfr_days);
	}

	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void def_mrp_opn_xfr_days(MCNumber value) {
		setConstNumber(offset + 39, $def_mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void def_mrp_opn_xfr_days(int value) {
		setConstNumber(offset + 39, $def_mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void def_mrp_opn_xfr_days(long value) {
		setConstNumber(offset + 39, $def_mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void def_mrp_opn_xfr_days(float value) {
		setConstNumber(offset + 39, $def_mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void def_mrp_opn_xfr_days(double value) {
		setConstNumber(offset + 39, $def_mrp_opn_xfr_days, value);
	}
	
	/**
	 * 投入品追加許可ＦＬＧ. Allow input item addition flg..<p>
	 *
	 */
	public boolean def_inpt_itm_add_flg() {
		return getConstBoolean(offset + 40, $def_inpt_itm_add_flg);
	}

	/**
	 * 投入品追加許可ＦＬＧ. Allow input item addition flg..<p>
	 *
	 */
	public void def_inpt_itm_add_flg(boolean value) {
		setConstBoolean(offset + 40, $def_inpt_itm_add_flg, value);
	}

	/**
	 * 投入品削除許可ＦＬＧ. Allow input item deletion flg..<p>
	 *
	 */
	public boolean def_inpt_itm_del_flg() {
		return getConstBoolean(offset + 41, $def_inpt_itm_del_flg);
	}

	/**
	 * 投入品削除許可ＦＬＧ. Allow input item deletion flg..<p>
	 *
	 */
	public void def_inpt_itm_del_flg(boolean value) {
		setConstBoolean(offset + 41, $def_inpt_itm_del_flg, value);
	}

	/**
	 * スケジューラＦＬＧ. Scheduler flg..<p>
	 *
	 */
	public boolean def_sch_flg() {
		return getConstBoolean(offset + 42, $def_sch_flg);
	}

	/**
	 * スケジューラＦＬＧ. Scheduler flg..<p>
	 *
	 */
	public void def_sch_flg(boolean value) {
		setConstBoolean(offset + 42, $def_sch_flg, value);
	}

	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public String def_lot_mng_typ() {
		return getConstString(offset + 43, $def_lot_mng_typ);
	}

	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public void def_lot_mng_typ(String value) {
		setConstString(offset + 43, $def_lot_mng_typ, value);
	}

	/**
	 * ロットＮＯ発番区分. Lot No. numbering type.<p>
	 *
	 */
	public String def_lot_no_typ() {
		return getConstString(offset + 44, $def_lot_no_typ);
	}

	/**
	 * ロットＮＯ発番区分. Lot No. numbering type.<p>
	 *
	 */
	public void def_lot_no_typ(String value) {
		setConstString(offset + 44, $def_lot_no_typ, value);
	}

	/**
	 * ロットＮＯ発番パタンＣＤ. Lot No. numbering pattern cd..<p>
	 *
	 */
	public String def_lot_no_ptn_cd() {
		return getConstString(offset + 45, $def_lot_no_ptn_cd);
	}

	/**
	 * ロットＮＯ発番パタンＣＤ. Lot No. numbering pattern cd..<p>
	 *
	 */
	public void def_lot_no_ptn_cd(String value) {
		setConstString(offset + 45, $def_lot_no_ptn_cd, value);
	}

	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public String def_sublot_mng_typ() {
		return getConstString(offset + 46, $def_sublot_mng_typ);
	}

	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public void def_sublot_mng_typ(String value) {
		setConstString(offset + 46, $def_sublot_mng_typ, value);
	}

	/**
	 * サブロットＮＯ発番区分. Sublot No. numbering type.<p>
	 *
	 */
	public String def_sublot_no_typ() {
		return getConstString(offset + 47, $def_sublot_no_typ);
	}

	/**
	 * サブロットＮＯ発番区分. Sublot No. numbering type.<p>
	 *
	 */
	public void def_sublot_no_typ(String value) {
		setConstString(offset + 47, $def_sublot_no_typ, value);
	}

	/**
	 * サブロットＮＯ発番パタンＣＤ. Sublot No. numbering pattern cd..<p>
	 *
	 */
	public String def_sublot_no_ptn_cd() {
		return getConstString(offset + 48, $def_sublot_no_ptn_cd);
	}

	/**
	 * サブロットＮＯ発番パタンＣＤ. Sublot No. numbering pattern cd..<p>
	 *
	 */
	public void def_sublot_no_ptn_cd(String value) {
		setConstString(offset + 48, $def_sublot_no_ptn_cd, value);
	}

	/**
	 * 手配ＮＯ１管理区分. SEIBAN No. 1 management type.<p>
	 *
	 */
	public String def_sno1_mng_typ() {
		return getConstString(offset + 49, $def_sno1_mng_typ);
	}

	/**
	 * 手配ＮＯ１管理区分. SEIBAN No. 1 management type.<p>
	 *
	 */
	public void def_sno1_mng_typ(String value) {
		setConstString(offset + 49, $def_sno1_mng_typ, value);
	}

	/**
	 * 受注手配ＮＯ１必須ＦＬＧ. Sales order SEIBAN No. 1 required flg..<p>
	 *
	 */
	public boolean def_slo_sno1_flg() {
		return getConstBoolean(offset + 50, $def_slo_sno1_flg);
	}

	/**
	 * 受注手配ＮＯ１必須ＦＬＧ. Sales order SEIBAN No. 1 required flg..<p>
	 *
	 */
	public void def_slo_sno1_flg(boolean value) {
		setConstBoolean(offset + 50, $def_slo_sno1_flg, value);
	}

	/**
	 * 所要手配ＮＯ１必須ＦＬＧ. Requirements SEIBAN No. 1 required flg..<p>
	 *
	 */
	public boolean def_rqmt_sno1_flg() {
		return getConstBoolean(offset + 51, $def_rqmt_sno1_flg);
	}

	/**
	 * 所要手配ＮＯ１必須ＦＬＧ. Requirements SEIBAN No. 1 required flg..<p>
	 *
	 */
	public void def_rqmt_sno1_flg(boolean value) {
		setConstBoolean(offset + 51, $def_rqmt_sno1_flg, value);
	}

	/**
	 * 手配ＮＯ１発番区分. SEIBAN No. 1 numbering type.<p>
	 *
	 */
	public String def_sno1_num_typ() {
		return getConstString(offset + 52, $def_sno1_num_typ);
	}

	/**
	 * 手配ＮＯ１発番区分. SEIBAN No. 1 numbering type.<p>
	 *
	 */
	public void def_sno1_num_typ(String value) {
		setConstString(offset + 52, $def_sno1_num_typ, value);
	}

	/**
	 * 手配ＮＯ１発番パタンＣＤ. SEIBAN No. 1 numbering pattern cd..<p>
	 *
	 */
	public String def_sno1_ptn_cd() {
		return getConstString(offset + 53, $def_sno1_ptn_cd);
	}

	/**
	 * 手配ＮＯ１発番パタンＣＤ. SEIBAN No. 1 numbering pattern cd..<p>
	 *
	 */
	public void def_sno1_ptn_cd(String value) {
		setConstString(offset + 53, $def_sno1_ptn_cd, value);
	}

	/**
	 * 手配ＮＯ２管理区分. SEIBAN No. 2 management type.<p>
	 *
	 */
	public String def_sno2_mng_typ() {
		return getConstString(offset + 54, $def_sno2_mng_typ);
	}

	/**
	 * 手配ＮＯ２管理区分. SEIBAN No. 2 management type.<p>
	 *
	 */
	public void def_sno2_mng_typ(String value) {
		setConstString(offset + 54, $def_sno2_mng_typ, value);
	}

	/**
	 * 受注手配ＮＯ２必須ＦＬＧ. Sales order SEIBAN No. 2 required flg..<p>
	 *
	 */
	public boolean def_slo_sno2_flg() {
		return getConstBoolean(offset + 55, $def_slo_sno2_flg);
	}

	/**
	 * 受注手配ＮＯ２必須ＦＬＧ. Sales order SEIBAN No. 2 required flg..<p>
	 *
	 */
	public void def_slo_sno2_flg(boolean value) {
		setConstBoolean(offset + 55, $def_slo_sno2_flg, value);
	}

	/**
	 * 所要手配ＮＯ２必須ＦＬＧ. Requirements SEIBAN No. 2 required flg..<p>
	 *
	 */
	public boolean def_rqmt_sno2_flg() {
		return getConstBoolean(offset + 56, $def_rqmt_sno2_flg);
	}

	/**
	 * 所要手配ＮＯ２必須ＦＬＧ. Requirements SEIBAN No. 2 required flg..<p>
	 *
	 */
	public void def_rqmt_sno2_flg(boolean value) {
		setConstBoolean(offset + 56, $def_rqmt_sno2_flg, value);
	}

	/**
	 * 手配ＮＯ２発番区分. SEIBAN No. 2 numbering type.<p>
	 *
	 */
	public String def_sno2_num_typ() {
		return getConstString(offset + 57, $def_sno2_num_typ);
	}

	/**
	 * 手配ＮＯ２発番区分. SEIBAN No. 2 numbering type.<p>
	 *
	 */
	public void def_sno2_num_typ(String value) {
		setConstString(offset + 57, $def_sno2_num_typ, value);
	}

	/**
	 * 手配ＮＯ２発番パタンＣＤ. SEIBAN No. 2 numbering pattern cd..<p>
	 *
	 */
	public String def_sno2_ptn_cd() {
		return getConstString(offset + 58, $def_sno2_ptn_cd);
	}

	/**
	 * 手配ＮＯ２発番パタンＣＤ. SEIBAN No. 2 numbering pattern cd..<p>
	 *
	 */
	public void def_sno2_ptn_cd(String value) {
		setConstString(offset + 58, $def_sno2_ptn_cd, value);
	}

	/**
	 * 手配ＮＯ３管理区分. SEIBAN No. 3 management type.<p>
	 *
	 */
	public String def_sno3_mng_typ() {
		return getConstString(offset + 59, $def_sno3_mng_typ);
	}

	/**
	 * 手配ＮＯ３管理区分. SEIBAN No. 3 management type.<p>
	 *
	 */
	public void def_sno3_mng_typ(String value) {
		setConstString(offset + 59, $def_sno3_mng_typ, value);
	}

	/**
	 * 受注手配ＮＯ３必須ＦＬＧ. Sales order SEIBAN No. 3 required flg..<p>
	 *
	 */
	public boolean def_slo_sno3_flg() {
		return getConstBoolean(offset + 60, $def_slo_sno3_flg);
	}

	/**
	 * 受注手配ＮＯ３必須ＦＬＧ. Sales order SEIBAN No. 3 required flg..<p>
	 *
	 */
	public void def_slo_sno3_flg(boolean value) {
		setConstBoolean(offset + 60, $def_slo_sno3_flg, value);
	}

	/**
	 * 所要手配ＮＯ３必須ＦＬＧ. Requirements SEIBAN No. 3 required flg..<p>
	 *
	 */
	public boolean def_rqmt_sno3_flg() {
		return getConstBoolean(offset + 61, $def_rqmt_sno3_flg);
	}

	/**
	 * 所要手配ＮＯ３必須ＦＬＧ. Requirements SEIBAN No. 3 required flg..<p>
	 *
	 */
	public void def_rqmt_sno3_flg(boolean value) {
		setConstBoolean(offset + 61, $def_rqmt_sno3_flg, value);
	}

	/**
	 * 手配ＮＯ３発番区分. SEIBAN No. 3 numbering type.<p>
	 *
	 */
	public String def_sno3_num_typ() {
		return getConstString(offset + 62, $def_sno3_num_typ);
	}

	/**
	 * 手配ＮＯ３発番区分. SEIBAN No. 3 numbering type.<p>
	 *
	 */
	public void def_sno3_num_typ(String value) {
		setConstString(offset + 62, $def_sno3_num_typ, value);
	}

	/**
	 * 手配ＮＯ３発番パタンＣＤ. SEIBAN No. 3 numbering pattern cd..<p>
	 *
	 */
	public String def_sno3_ptn_cd() {
		return getConstString(offset + 63, $def_sno3_ptn_cd);
	}

	/**
	 * 手配ＮＯ３発番パタンＣＤ. SEIBAN No. 3 numbering pattern cd..<p>
	 *
	 */
	public void def_sno3_ptn_cd(String value) {
		setConstString(offset + 63, $def_sno3_ptn_cd, value);
	}

	/**
	 * 手配ＮＯ４管理区分. SEIBAN No. 4 management type.<p>
	 *
	 */
	public String def_sno4_mng_typ() {
		return getConstString(offset + 64, $def_sno4_mng_typ);
	}

	/**
	 * 手配ＮＯ４管理区分. SEIBAN No. 4 management type.<p>
	 *
	 */
	public void def_sno4_mng_typ(String value) {
		setConstString(offset + 64, $def_sno4_mng_typ, value);
	}

	/**
	 * 受注手配ＮＯ４必須ＦＬＧ. Sales order SEIBAN No. 4 required flg..<p>
	 *
	 */
	public boolean def_slo_sno4_flg() {
		return getConstBoolean(offset + 65, $def_slo_sno4_flg);
	}

	/**
	 * 受注手配ＮＯ４必須ＦＬＧ. Sales order SEIBAN No. 4 required flg..<p>
	 *
	 */
	public void def_slo_sno4_flg(boolean value) {
		setConstBoolean(offset + 65, $def_slo_sno4_flg, value);
	}

	/**
	 * 所要手配ＮＯ４必須ＦＬＧ. Requirements SEIBAN No. 4 required flg..<p>
	 *
	 */
	public boolean def_rqmt_sno4_flg() {
		return getConstBoolean(offset + 66, $def_rqmt_sno4_flg);
	}

	/**
	 * 所要手配ＮＯ４必須ＦＬＧ. Requirements SEIBAN No. 4 required flg..<p>
	 *
	 */
	public void def_rqmt_sno4_flg(boolean value) {
		setConstBoolean(offset + 66, $def_rqmt_sno4_flg, value);
	}

	/**
	 * 手配ＮＯ４発番区分. SEIBAN No. 4 numbering type.<p>
	 *
	 */
	public String def_sno4_num_typ() {
		return getConstString(offset + 67, $def_sno4_num_typ);
	}

	/**
	 * 手配ＮＯ４発番区分. SEIBAN No. 4 numbering type.<p>
	 *
	 */
	public void def_sno4_num_typ(String value) {
		setConstString(offset + 67, $def_sno4_num_typ, value);
	}

	/**
	 * 手配ＮＯ４発番パタンＣＤ. SEIBAN No. 4 numbering pattern cd..<p>
	 *
	 */
	public String def_sno4_ptn_cd() {
		return getConstString(offset + 68, $def_sno4_ptn_cd);
	}

	/**
	 * 手配ＮＯ４発番パタンＣＤ. SEIBAN No. 4 numbering pattern cd..<p>
	 *
	 */
	public void def_sno4_ptn_cd(String value) {
		setConstString(offset + 68, $def_sno4_ptn_cd, value);
	}

	/**
	 * 期限管理対象ＦＬＧ. For expiration management flg..<p>
	 *
	 */
	public boolean def_lmt_ctl_flg() {
		return getConstBoolean(offset + 69, $def_lmt_ctl_flg);
	}

	/**
	 * 期限管理対象ＦＬＧ. For expiration management flg..<p>
	 *
	 */
	public void def_lmt_ctl_flg(boolean value) {
		setConstBoolean(offset + 69, $def_lmt_ctl_flg, value);
	}

	/**
	 * 期限管理種別. Expiration management type.<p>
	 *
	 */
	public String def_lmt_ctl_categ() {
		return getConstString(offset + 70, $def_lmt_ctl_categ);
	}

	/**
	 * 期限管理種別. Expiration management type.<p>
	 *
	 */
	public void def_lmt_ctl_categ(String value) {
		setConstString(offset + 70, $def_lmt_ctl_categ, value);
	}

	/**
	 * 版管理対象ＦＬＧ. For version control flg..<p>
	 *
	 */
	public boolean def_ver_flg() {
		return getConstBoolean(offset + 71, $def_ver_flg);
	}

	/**
	 * 版管理対象ＦＬＧ. For version control flg..<p>
	 *
	 */
	public void def_ver_flg(boolean value) {
		setConstBoolean(offset + 71, $def_ver_flg, value);
	}

	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public String def_insp_bind_typ() {
		return getConstString(offset + 72, $def_insp_bind_typ);
	}

	/**
	 * 検査実施単位区分. Inspection implementation unit type.<p>
	 *
	 */
	public void def_insp_bind_typ(String value) {
		setConstString(offset + 72, $def_insp_bind_typ, value);
	}

	/**
	 * 市場出荷判定対象ＦＬＧ. For market release decision flg..<p>
	 *
	 */
	public boolean def_mrkt_judg_flg() {
		return getConstBoolean(offset + 73, $def_mrkt_judg_flg);
	}

	/**
	 * 市場出荷判定対象ＦＬＧ. For market release decision flg..<p>
	 *
	 */
	public void def_mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 73, $def_mrkt_judg_flg, value);
	}

	/**
	 * 市場出荷判定承認役割ＣＤ. Market release decision approval role cd..<p>
	 *
	 */
	public String def_mrkt_judg_role_cd() {
		return getConstString(offset + 74, $def_mrkt_judg_role_cd);
	}

	/**
	 * 市場出荷判定承認役割ＣＤ. Market release decision approval role cd..<p>
	 *
	 */
	public void def_mrkt_judg_role_cd(String value) {
		setConstString(offset + 74, $def_mrkt_judg_role_cd, value);
	}

	/**
	 * 市場出荷判定更新役割ＣＤ. Market release decision update role cd..<p>
	 *
	 */
	public String def_mrkt_judg_upd_role_cd() {
		return getConstString(offset + 75, $def_mrkt_judg_upd_role_cd);
	}

	/**
	 * 市場出荷判定更新役割ＣＤ. Market release decision update role cd..<p>
	 *
	 */
	public void def_mrkt_judg_upd_role_cd(String value) {
		setConstString(offset + 75, $def_mrkt_judg_upd_role_cd, value);
	}

	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public boolean def_plnt_aprv_flg() {
		return getConstBoolean(offset + 76, $def_plnt_aprv_flg);
	}

	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public void def_plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 76, $def_plnt_aprv_flg, value);
	}

	/**
	 * 工場出荷承認役割ＣＤ. Factory release approval role cd..<p>
	 *
	 */
	public String def_plnt_aprv_role_cd() {
		return getConstString(offset + 77, $def_plnt_aprv_role_cd);
	}

	/**
	 * 工場出荷承認役割ＣＤ. Factory release approval role cd..<p>
	 *
	 */
	public void def_plnt_aprv_role_cd(String value) {
		setConstString(offset + 77, $def_plnt_aprv_role_cd, value);
	}

	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public boolean def_insp_aprv_flg() {
		return getConstBoolean(offset + 78, $def_insp_aprv_flg);
	}

	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public void def_insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 78, $def_insp_aprv_flg, value);
	}

	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public String def_insp_aprv_role_cd() {
		return getConstString(offset + 79, $def_insp_aprv_role_cd);
	}

	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public void def_insp_aprv_role_cd(String value) {
		setConstString(offset + 79, $def_insp_aprv_role_cd, value);
	}

	/**
	 * 製造承認対象ＦＬＧ. For mfg. approval flg..<p>
	 *
	 */
	public boolean def_mfg_aprv_flg() {
		return getConstBoolean(offset + 80, $def_mfg_aprv_flg);
	}

	/**
	 * 製造承認対象ＦＬＧ. For mfg. approval flg..<p>
	 *
	 */
	public void def_mfg_aprv_flg(boolean value) {
		setConstBoolean(offset + 80, $def_mfg_aprv_flg, value);
	}

	/**
	 * 製造承認役割ＣＤ. Mfg. approval role cd..<p>
	 *
	 */
	public String def_mfg_aprv_role_cd() {
		return getConstString(offset + 81, $def_mfg_aprv_role_cd);
	}

	/**
	 * 製造承認役割ＣＤ. Mfg. approval role cd..<p>
	 *
	 */
	public void def_mfg_aprv_role_cd(String value) {
		setConstString(offset + 81, $def_mfg_aprv_role_cd, value);
	}

	/**
	 * 手配ＮＯ１区分. SEIBAN No. 1 type.<p>
	 *
	 */
	public String def_sno_typ1() {
		return getConstString(offset + 82, $def_sno_typ1);
	}

	/**
	 * 手配ＮＯ１区分. SEIBAN No. 1 type.<p>
	 *
	 */
	public void def_sno_typ1(String value) {
		setConstString(offset + 82, $def_sno_typ1, value);
	}

	/**
	 * 手配ＮＯ２区分. SEIBAN No. 2 type.<p>
	 *
	 */
	public String def_sno_typ2() {
		return getConstString(offset + 83, $def_sno_typ2);
	}

	/**
	 * 手配ＮＯ２区分. SEIBAN No. 2 type.<p>
	 *
	 */
	public void def_sno_typ2(String value) {
		setConstString(offset + 83, $def_sno_typ2, value);
	}

	/**
	 * 手配ＮＯ３区分. SEIBAN No. 3 type.<p>
	 *
	 */
	public String def_sno_typ3() {
		return getConstString(offset + 84, $def_sno_typ3);
	}

	/**
	 * 手配ＮＯ３区分. SEIBAN No. 3 type.<p>
	 *
	 */
	public void def_sno_typ3(String value) {
		setConstString(offset + 84, $def_sno_typ3, value);
	}

	/**
	 * 手配ＮＯ４区分. SEIBAN No. 4 type.<p>
	 *
	 */
	public String def_sno_typ4() {
		return getConstString(offset + 85, $def_sno_typ4);
	}

	/**
	 * 手配ＮＯ４区分. SEIBAN No. 4 type.<p>
	 *
	 */
	public void def_sno_typ4(String value) {
		setConstString(offset + 85, $def_sno_typ4, value);
	}

	/**
	 * 指図時ロット指定ＦＬＧ. Lot specification at order flg..<p>
	 *
	 */
	public boolean def_inst_lot_fix_flg() {
		return getConstBoolean(offset + 86, $def_inst_lot_fix_flg);
	}

	/**
	 * 指図時ロット指定ＦＬＧ. Lot specification at order flg..<p>
	 *
	 */
	public void def_inst_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 86, $def_inst_lot_fix_flg, value);
	}

	/**
	 * ロット混在ＦＬＧ. Lot mixed flg..<p>
	 *
	 */
	public boolean def_lot_mix_flg() {
		return getConstBoolean(offset + 87, $def_lot_mix_flg);
	}

	/**
	 * ロット混在ＦＬＧ. Lot mixed flg..<p>
	 *
	 */
	public void def_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 87, $def_lot_mix_flg, value);
	}

	/**
	 * サブロット混在ＦＬＧ. Sublot mixed flg..<p>
	 *
	 */
	public boolean def_sublot_mix_flg() {
		return getConstBoolean(offset + 88, $def_sublot_mix_flg);
	}

	/**
	 * サブロット混在ＦＬＧ. Sublot mixed flg..<p>
	 *
	 */
	public void def_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 88, $def_sublot_mix_flg, value);
	}

	/**
	 * 引当制御区分. Allocation control type.<p>
	 *
	 */
	public String def_alloc_ctl_typ() {
		return getConstString(offset + 89, $def_alloc_ctl_typ);
	}

	/**
	 * 引当制御区分. Allocation control type.<p>
	 *
	 */
	public void def_alloc_ctl_typ(String value) {
		setConstString(offset + 89, $def_alloc_ctl_typ, value);
	}

	/**
	 * 投入制御区分. Input control type.<p>
	 *
	 */
	public String def_inpt_ctl_typ() {
		return getConstString(offset + 90, $def_inpt_ctl_typ);
	}

	/**
	 * 投入制御区分. Input control type.<p>
	 *
	 */
	public void def_inpt_ctl_typ(String value) {
		setConstString(offset + 90, $def_inpt_ctl_typ, value);
	}

	/**
	 * バックフラッシュ区分. Backflush type.<p>
	 *
	 */
	public String def_bkf_typ() {
		return getConstString(offset + 91, $def_bkf_typ);
	}

	/**
	 * バックフラッシュ区分. Backflush type.<p>
	 *
	 */
	public void def_bkf_typ(String value) {
		setConstString(offset + 91, $def_bkf_typ, value);
	}

	/**
	 * 引継対象子品目ＦＬＧ. Copy-from child item flg..<p>
	 *
	 */
	public boolean def_main_itm_flg() {
		return getConstBoolean(offset + 92, $def_main_itm_flg);
	}

	/**
	 * 引継対象子品目ＦＬＧ. Copy-from child item flg..<p>
	 *
	 */
	public void def_main_itm_flg(boolean value) {
		setConstBoolean(offset + 92, $def_main_itm_flg, value);
	}

	/**
	 * 副産品ＦＬＧ. By-product flg..<p>
	 *
	 */
	public boolean def_byprod_flg() {
		return getConstBoolean(offset + 93, $def_byprod_flg);
	}

	/**
	 * 副産品ＦＬＧ. By-product flg..<p>
	 *
	 */
	public void def_byprod_flg(boolean value) {
		setConstBoolean(offset + 93, $def_byprod_flg, value);
	}

	/**
	 * 原価対象外ＦＬＧ（ＢＯＭ）. Not costing flg. (BOM).<p>
	 *
	 */
	public boolean def_not_cost_bom_flg() {
		return getConstBoolean(offset + 94, $def_not_cost_bom_flg);
	}

	/**
	 * 原価対象外ＦＬＧ（ＢＯＭ）. Not costing flg. (BOM).<p>
	 *
	 */
	public void def_not_cost_bom_flg(boolean value) {
		setConstBoolean(offset + 94, $def_not_cost_bom_flg, value);
	}

	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public String def_calc_ptn_cd() {
		return getConstString(offset + 95, $def_calc_ptn_cd);
	}

	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public void def_calc_ptn_cd(String value) {
		setConstString(offset + 95, $def_calc_ptn_cd, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 96, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 96, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 97, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 97, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 98, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 98, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 99, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 99, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 100, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 100, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 101, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 101, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 102, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 102, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 103, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 103, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 104, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 104, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 105, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 105, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 106, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 106, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 107, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 107, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 107, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 107, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 107, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 107, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 108, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 108, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 109, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 109, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 110, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 110, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 111, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 111, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 112, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 112, $upd_srv_req_no, value);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 113, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 113, $co_cd, value);
	}

	/**
	 * 品目区分詳細名（ロケール１）. Item type details name (Locale1).<p>
	 *
	 */
	public String itm_typ_d_nm_lcl1() {
		return getConstString(offset + 114, $itm_typ_d_nm_lcl1);
	}

	/**
	 * 品目区分詳細名（ロケール１）. Item type details name (Locale1).<p>
	 *
	 */
	public void itm_typ_d_nm_lcl1(String value) {
		setConstString(offset + 114, $itm_typ_d_nm_lcl1, value);
	}

	/**
	 * 品目区分詳細名（ロケール２）. Item type details name (Locale2).<p>
	 *
	 */
	public String itm_typ_d_nm_lcl2() {
		return getConstString(offset + 115, $itm_typ_d_nm_lcl2);
	}

	/**
	 * 品目区分詳細名（ロケール２）. Item type details name (Locale2).<p>
	 *
	 */
	public void itm_typ_d_nm_lcl2(String value) {
		setConstString(offset + 115, $itm_typ_d_nm_lcl2, value);
	}

	/**
	 * 品目区分詳細名（ロケール３）. Item type details name (Locale3).<p>
	 *
	 */
	public String itm_typ_d_nm_lcl3() {
		return getConstString(offset + 116, $itm_typ_d_nm_lcl3);
	}

	/**
	 * 品目区分詳細名（ロケール３）. Item type details name (Locale3).<p>
	 *
	 */
	public void itm_typ_d_nm_lcl3(String value) {
		setConstString(offset + 116, $itm_typ_d_nm_lcl3, value);
	}

	/**
	 * 品目区分詳細名（ロケール４）. Item type details name (Locale4).<p>
	 *
	 */
	public String itm_typ_d_nm_lcl4() {
		return getConstString(offset + 117, $itm_typ_d_nm_lcl4);
	}

	/**
	 * 品目区分詳細名（ロケール４）. Item type details name (Locale4).<p>
	 *
	 */
	public void itm_typ_d_nm_lcl4(String value) {
		setConstString(offset + 117, $itm_typ_d_nm_lcl4, value);
	}

	/**
	 * 品目区分詳細名（ロケール５）. Item type details name (Locale5).<p>
	 *
	 */
	public String itm_typ_d_nm_lcl5() {
		return getConstString(offset + 118, $itm_typ_d_nm_lcl5);
	}

	/**
	 * 品目区分詳細名（ロケール５）. Item type details name (Locale5).<p>
	 *
	 */
	public void itm_typ_d_nm_lcl5(String value) {
		setConstString(offset + 118, $itm_typ_d_nm_lcl5, value);
	}

	public String getString(String name) {
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($def_itm_jnl_cd.equalsIgnoreCase(name)) {
			return def_itm_jnl_cd();
		}
		if ($def_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return def_ac_itm_grp_cd();
		}
		if ($def_comp_spec_typ.equalsIgnoreCase(name)) {
			return def_comp_spec_typ();
		}
		if ($def_itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return def_itm_spec_grp_cd();
		}
		if ($def_sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return def_sls_upri_grp_cd();
		}
		if ($def_slo_proc_typ.equalsIgnoreCase(name)) {
			return def_slo_proc_typ();
		}
		if ($def_ship_inst_typ.equalsIgnoreCase(name)) {
			return def_ship_inst_typ();
		}
		if ($def_itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return def_itm_ship_grp_cd();
		}
		if ($def_ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return def_ship_valid_grp_cd();
		}
		if ($def_ship_term_cd.equalsIgnoreCase(name)) {
			return def_ship_term_cd();
		}
		if ($def_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return def_mfg_inst_unit_typ();
		}
		if ($def_mrp_proc_typ.equalsIgnoreCase(name)) {
			return def_mrp_proc_typ();
		}
		if ($def_rqmt_typ.equalsIgnoreCase(name)) {
			return def_rqmt_typ();
		}
		if ($def_prod_pln_typ.equalsIgnoreCase(name)) {
			return def_prod_pln_typ();
		}
		if ($def_lot_mng_typ.equalsIgnoreCase(name)) {
			return def_lot_mng_typ();
		}
		if ($def_lot_no_typ.equalsIgnoreCase(name)) {
			return def_lot_no_typ();
		}
		if ($def_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return def_lot_no_ptn_cd();
		}
		if ($def_sublot_mng_typ.equalsIgnoreCase(name)) {
			return def_sublot_mng_typ();
		}
		if ($def_sublot_no_typ.equalsIgnoreCase(name)) {
			return def_sublot_no_typ();
		}
		if ($def_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return def_sublot_no_ptn_cd();
		}
		if ($def_sno1_mng_typ.equalsIgnoreCase(name)) {
			return def_sno1_mng_typ();
		}
		if ($def_sno1_num_typ.equalsIgnoreCase(name)) {
			return def_sno1_num_typ();
		}
		if ($def_sno1_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno1_ptn_cd();
		}
		if ($def_sno2_mng_typ.equalsIgnoreCase(name)) {
			return def_sno2_mng_typ();
		}
		if ($def_sno2_num_typ.equalsIgnoreCase(name)) {
			return def_sno2_num_typ();
		}
		if ($def_sno2_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno2_ptn_cd();
		}
		if ($def_sno3_mng_typ.equalsIgnoreCase(name)) {
			return def_sno3_mng_typ();
		}
		if ($def_sno3_num_typ.equalsIgnoreCase(name)) {
			return def_sno3_num_typ();
		}
		if ($def_sno3_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno3_ptn_cd();
		}
		if ($def_sno4_mng_typ.equalsIgnoreCase(name)) {
			return def_sno4_mng_typ();
		}
		if ($def_sno4_num_typ.equalsIgnoreCase(name)) {
			return def_sno4_num_typ();
		}
		if ($def_sno4_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno4_ptn_cd();
		}
		if ($def_lmt_ctl_categ.equalsIgnoreCase(name)) {
			return def_lmt_ctl_categ();
		}
		if ($def_insp_bind_typ.equalsIgnoreCase(name)) {
			return def_insp_bind_typ();
		}
		if ($def_mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return def_mrkt_judg_role_cd();
		}
		if ($def_mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return def_mrkt_judg_upd_role_cd();
		}
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_plnt_aprv_role_cd();
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_insp_aprv_role_cd();
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_mfg_aprv_role_cd();
		}
		if ($def_sno_typ1.equalsIgnoreCase(name)) {
			return def_sno_typ1();
		}
		if ($def_sno_typ2.equalsIgnoreCase(name)) {
			return def_sno_typ2();
		}
		if ($def_sno_typ3.equalsIgnoreCase(name)) {
			return def_sno_typ3();
		}
		if ($def_sno_typ4.equalsIgnoreCase(name)) {
			return def_sno_typ4();
		}
		if ($def_alloc_ctl_typ.equalsIgnoreCase(name)) {
			return def_alloc_ctl_typ();
		}
		if ($def_inpt_ctl_typ.equalsIgnoreCase(name)) {
			return def_inpt_ctl_typ();
		}
		if ($def_bkf_typ.equalsIgnoreCase(name)) {
			return def_bkf_typ();
		}
		if ($def_calc_ptn_cd.equalsIgnoreCase(name)) {
			return def_calc_ptn_cd();
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
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($itm_typ_d_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl1();
		}
		if ($itm_typ_d_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl2();
		}
		if ($itm_typ_d_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl3();
		}
		if ($itm_typ_d_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl4();
		}
		if ($itm_typ_d_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl5();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return def_dmnd_date_div_mons();
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			return def_alloc_margin_days();
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return def_mrp_alloc_margin_days();
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return def_mrp_opn_xfr_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
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
		if ($def_sls_flg.equalsIgnoreCase(name)) {
			return def_sls_flg();
		}
		if ($def_mfg_flg.equalsIgnoreCase(name)) {
			return def_mfg_flg();
		}
		if ($def_purc_flg.equalsIgnoreCase(name)) {
			return def_purc_flg();
		}
		if ($def_insp_flg.equalsIgnoreCase(name)) {
			return def_insp_flg();
		}
		if ($def_minus_stk_flg.equalsIgnoreCase(name)) {
			return def_minus_stk_flg();
		}
		if ($def_not_new_lot_flg.equalsIgnoreCase(name)) {
			return def_not_new_lot_flg();
		}
		if ($def_gi_alloc_flg.equalsIgnoreCase(name)) {
			return def_gi_alloc_flg();
		}
		if ($def_pack_alloc_flg.equalsIgnoreCase(name)) {
			return def_pack_alloc_flg();
		}
		if ($def_bp_lot_flg.equalsIgnoreCase(name)) {
			return def_bp_lot_flg();
		}
		if ($def_comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			return def_comp_rev_at_slo_flg();
		}
		if ($def_comp_core_itm_flg.equalsIgnoreCase(name)) {
			return def_comp_core_itm_flg();
		}
		if ($def_skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return def_skip_chk_ship_flg();
		}
		if ($def_slo_proc_flg.equalsIgnoreCase(name)) {
			return def_slo_proc_flg();
		}
		if ($def_ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			return def_ship_lot_back_stop_flg();
		}
		if ($def_arr_skip_flg.equalsIgnoreCase(name)) {
			return def_arr_skip_flg();
		}
		if ($def_stk_lst_flg.equalsIgnoreCase(name)) {
			return def_stk_lst_flg();
		}
		if ($def_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_sls_upri_cng_flg();
		}
		if ($def_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_purc_upri_cng_flg();
		}
		if ($def_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_prov_upri_cng_flg();
		}
		if ($def_inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return def_inpt_itm_add_flg();
		}
		if ($def_inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return def_inpt_itm_del_flg();
		}
		if ($def_sch_flg.equalsIgnoreCase(name)) {
			return def_sch_flg();
		}
		if ($def_slo_sno1_flg.equalsIgnoreCase(name)) {
			return def_slo_sno1_flg();
		}
		if ($def_rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno1_flg();
		}
		if ($def_slo_sno2_flg.equalsIgnoreCase(name)) {
			return def_slo_sno2_flg();
		}
		if ($def_rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno2_flg();
		}
		if ($def_slo_sno3_flg.equalsIgnoreCase(name)) {
			return def_slo_sno3_flg();
		}
		if ($def_rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno3_flg();
		}
		if ($def_slo_sno4_flg.equalsIgnoreCase(name)) {
			return def_slo_sno4_flg();
		}
		if ($def_rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno4_flg();
		}
		if ($def_lmt_ctl_flg.equalsIgnoreCase(name)) {
			return def_lmt_ctl_flg();
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			return def_ver_flg();
		}
		if ($def_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return def_mrkt_judg_flg();
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return def_plnt_aprv_flg();
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			return def_insp_aprv_flg();
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return def_mfg_aprv_flg();
		}
		if ($def_inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return def_inst_lot_fix_flg();
		}
		if ($def_lot_mix_flg.equalsIgnoreCase(name)) {
			return def_lot_mix_flg();
		}
		if ($def_sublot_mix_flg.equalsIgnoreCase(name)) {
			return def_sublot_mix_flg();
		}
		if ($def_main_itm_flg.equalsIgnoreCase(name)) {
			return def_main_itm_flg();
		}
		if ($def_byprod_flg.equalsIgnoreCase(name)) {
			return def_byprod_flg();
		}
		if ($def_not_cost_bom_flg.equalsIgnoreCase(name)) {
			return def_not_cost_bom_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($def_itm_jnl_cd.equalsIgnoreCase(name)) {
			return def_itm_jnl_cd();
		}
		if ($def_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return def_ac_itm_grp_cd();
		}
		if ($def_comp_spec_typ.equalsIgnoreCase(name)) {
			return def_comp_spec_typ();
		}
		if ($def_itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return def_itm_spec_grp_cd();
		}
		if ($def_sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return def_sls_upri_grp_cd();
		}
		if ($def_slo_proc_typ.equalsIgnoreCase(name)) {
			return def_slo_proc_typ();
		}
		if ($def_ship_inst_typ.equalsIgnoreCase(name)) {
			return def_ship_inst_typ();
		}
		if ($def_itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return def_itm_ship_grp_cd();
		}
		if ($def_ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return def_ship_valid_grp_cd();
		}
		if ($def_ship_term_cd.equalsIgnoreCase(name)) {
			return def_ship_term_cd();
		}
		if ($def_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return def_mfg_inst_unit_typ();
		}
		if ($def_mrp_proc_typ.equalsIgnoreCase(name)) {
			return def_mrp_proc_typ();
		}
		if ($def_rqmt_typ.equalsIgnoreCase(name)) {
			return def_rqmt_typ();
		}
		if ($def_prod_pln_typ.equalsIgnoreCase(name)) {
			return def_prod_pln_typ();
		}
		if ($def_lot_mng_typ.equalsIgnoreCase(name)) {
			return def_lot_mng_typ();
		}
		if ($def_lot_no_typ.equalsIgnoreCase(name)) {
			return def_lot_no_typ();
		}
		if ($def_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return def_lot_no_ptn_cd();
		}
		if ($def_sublot_mng_typ.equalsIgnoreCase(name)) {
			return def_sublot_mng_typ();
		}
		if ($def_sublot_no_typ.equalsIgnoreCase(name)) {
			return def_sublot_no_typ();
		}
		if ($def_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return def_sublot_no_ptn_cd();
		}
		if ($def_sno1_mng_typ.equalsIgnoreCase(name)) {
			return def_sno1_mng_typ();
		}
		if ($def_sno1_num_typ.equalsIgnoreCase(name)) {
			return def_sno1_num_typ();
		}
		if ($def_sno1_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno1_ptn_cd();
		}
		if ($def_sno2_mng_typ.equalsIgnoreCase(name)) {
			return def_sno2_mng_typ();
		}
		if ($def_sno2_num_typ.equalsIgnoreCase(name)) {
			return def_sno2_num_typ();
		}
		if ($def_sno2_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno2_ptn_cd();
		}
		if ($def_sno3_mng_typ.equalsIgnoreCase(name)) {
			return def_sno3_mng_typ();
		}
		if ($def_sno3_num_typ.equalsIgnoreCase(name)) {
			return def_sno3_num_typ();
		}
		if ($def_sno3_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno3_ptn_cd();
		}
		if ($def_sno4_mng_typ.equalsIgnoreCase(name)) {
			return def_sno4_mng_typ();
		}
		if ($def_sno4_num_typ.equalsIgnoreCase(name)) {
			return def_sno4_num_typ();
		}
		if ($def_sno4_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno4_ptn_cd();
		}
		if ($def_lmt_ctl_categ.equalsIgnoreCase(name)) {
			return def_lmt_ctl_categ();
		}
		if ($def_insp_bind_typ.equalsIgnoreCase(name)) {
			return def_insp_bind_typ();
		}
		if ($def_mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return def_mrkt_judg_role_cd();
		}
		if ($def_mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return def_mrkt_judg_upd_role_cd();
		}
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_plnt_aprv_role_cd();
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_insp_aprv_role_cd();
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_mfg_aprv_role_cd();
		}
		if ($def_sno_typ1.equalsIgnoreCase(name)) {
			return def_sno_typ1();
		}
		if ($def_sno_typ2.equalsIgnoreCase(name)) {
			return def_sno_typ2();
		}
		if ($def_sno_typ3.equalsIgnoreCase(name)) {
			return def_sno_typ3();
		}
		if ($def_sno_typ4.equalsIgnoreCase(name)) {
			return def_sno_typ4();
		}
		if ($def_alloc_ctl_typ.equalsIgnoreCase(name)) {
			return def_alloc_ctl_typ();
		}
		if ($def_inpt_ctl_typ.equalsIgnoreCase(name)) {
			return def_inpt_ctl_typ();
		}
		if ($def_bkf_typ.equalsIgnoreCase(name)) {
			return def_bkf_typ();
		}
		if ($def_calc_ptn_cd.equalsIgnoreCase(name)) {
			return def_calc_ptn_cd();
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
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($itm_typ_d_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl1();
		}
		if ($itm_typ_d_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl2();
		}
		if ($itm_typ_d_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl3();
		}
		if ($itm_typ_d_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl4();
		}
		if ($itm_typ_d_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl5();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return def_dmnd_date_div_mons();
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			return def_alloc_margin_days();
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return def_mrp_alloc_margin_days();
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return def_mrp_opn_xfr_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
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
		if ($def_sls_flg.equalsIgnoreCase(name)) {
			return def_sls_flg();
		}
		if ($def_mfg_flg.equalsIgnoreCase(name)) {
			return def_mfg_flg();
		}
		if ($def_purc_flg.equalsIgnoreCase(name)) {
			return def_purc_flg();
		}
		if ($def_insp_flg.equalsIgnoreCase(name)) {
			return def_insp_flg();
		}
		if ($def_minus_stk_flg.equalsIgnoreCase(name)) {
			return def_minus_stk_flg();
		}
		if ($def_not_new_lot_flg.equalsIgnoreCase(name)) {
			return def_not_new_lot_flg();
		}
		if ($def_gi_alloc_flg.equalsIgnoreCase(name)) {
			return def_gi_alloc_flg();
		}
		if ($def_pack_alloc_flg.equalsIgnoreCase(name)) {
			return def_pack_alloc_flg();
		}
		if ($def_bp_lot_flg.equalsIgnoreCase(name)) {
			return def_bp_lot_flg();
		}
		if ($def_comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			return def_comp_rev_at_slo_flg();
		}
		if ($def_comp_core_itm_flg.equalsIgnoreCase(name)) {
			return def_comp_core_itm_flg();
		}
		if ($def_skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return def_skip_chk_ship_flg();
		}
		if ($def_slo_proc_flg.equalsIgnoreCase(name)) {
			return def_slo_proc_flg();
		}
		if ($def_ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			return def_ship_lot_back_stop_flg();
		}
		if ($def_arr_skip_flg.equalsIgnoreCase(name)) {
			return def_arr_skip_flg();
		}
		if ($def_stk_lst_flg.equalsIgnoreCase(name)) {
			return def_stk_lst_flg();
		}
		if ($def_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_sls_upri_cng_flg();
		}
		if ($def_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_purc_upri_cng_flg();
		}
		if ($def_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_prov_upri_cng_flg();
		}
		if ($def_inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return def_inpt_itm_add_flg();
		}
		if ($def_inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return def_inpt_itm_del_flg();
		}
		if ($def_sch_flg.equalsIgnoreCase(name)) {
			return def_sch_flg();
		}
		if ($def_slo_sno1_flg.equalsIgnoreCase(name)) {
			return def_slo_sno1_flg();
		}
		if ($def_rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno1_flg();
		}
		if ($def_slo_sno2_flg.equalsIgnoreCase(name)) {
			return def_slo_sno2_flg();
		}
		if ($def_rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno2_flg();
		}
		if ($def_slo_sno3_flg.equalsIgnoreCase(name)) {
			return def_slo_sno3_flg();
		}
		if ($def_rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno3_flg();
		}
		if ($def_slo_sno4_flg.equalsIgnoreCase(name)) {
			return def_slo_sno4_flg();
		}
		if ($def_rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno4_flg();
		}
		if ($def_lmt_ctl_flg.equalsIgnoreCase(name)) {
			return def_lmt_ctl_flg();
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			return def_ver_flg();
		}
		if ($def_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return def_mrkt_judg_flg();
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return def_plnt_aprv_flg();
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			return def_insp_aprv_flg();
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return def_mfg_aprv_flg();
		}
		if ($def_inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return def_inst_lot_fix_flg();
		}
		if ($def_lot_mix_flg.equalsIgnoreCase(name)) {
			return def_lot_mix_flg();
		}
		if ($def_sublot_mix_flg.equalsIgnoreCase(name)) {
			return def_sublot_mix_flg();
		}
		if ($def_main_itm_flg.equalsIgnoreCase(name)) {
			return def_main_itm_flg();
		}
		if ($def_byprod_flg.equalsIgnoreCase(name)) {
			return def_byprod_flg();
		}
		if ($def_not_cost_bom_flg.equalsIgnoreCase(name)) {
			return def_not_cost_bom_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($def_itm_jnl_cd.equalsIgnoreCase(name)) {
			def_itm_jnl_cd(value);
			return;
		}
		if ($def_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			def_ac_itm_grp_cd(value);
			return;
		}
		if ($def_comp_spec_typ.equalsIgnoreCase(name)) {
			def_comp_spec_typ(value);
			return;
		}
		if ($def_itm_spec_grp_cd.equalsIgnoreCase(name)) {
			def_itm_spec_grp_cd(value);
			return;
		}
		if ($def_sls_upri_grp_cd.equalsIgnoreCase(name)) {
			def_sls_upri_grp_cd(value);
			return;
		}
		if ($def_slo_proc_typ.equalsIgnoreCase(name)) {
			def_slo_proc_typ(value);
			return;
		}
		if ($def_ship_inst_typ.equalsIgnoreCase(name)) {
			def_ship_inst_typ(value);
			return;
		}
		if ($def_itm_ship_grp_cd.equalsIgnoreCase(name)) {
			def_itm_ship_grp_cd(value);
			return;
		}
		if ($def_ship_valid_grp_cd.equalsIgnoreCase(name)) {
			def_ship_valid_grp_cd(value);
			return;
		}
		if ($def_ship_term_cd.equalsIgnoreCase(name)) {
			def_ship_term_cd(value);
			return;
		}
		if ($def_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			def_mfg_inst_unit_typ(value);
			return;
		}
		if ($def_mrp_proc_typ.equalsIgnoreCase(name)) {
			def_mrp_proc_typ(value);
			return;
		}
		if ($def_rqmt_typ.equalsIgnoreCase(name)) {
			def_rqmt_typ(value);
			return;
		}
		if ($def_prod_pln_typ.equalsIgnoreCase(name)) {
			def_prod_pln_typ(value);
			return;
		}
		if ($def_lot_mng_typ.equalsIgnoreCase(name)) {
			def_lot_mng_typ(value);
			return;
		}
		if ($def_lot_no_typ.equalsIgnoreCase(name)) {
			def_lot_no_typ(value);
			return;
		}
		if ($def_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			def_lot_no_ptn_cd(value);
			return;
		}
		if ($def_sublot_mng_typ.equalsIgnoreCase(name)) {
			def_sublot_mng_typ(value);
			return;
		}
		if ($def_sublot_no_typ.equalsIgnoreCase(name)) {
			def_sublot_no_typ(value);
			return;
		}
		if ($def_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			def_sublot_no_ptn_cd(value);
			return;
		}
		if ($def_sno1_mng_typ.equalsIgnoreCase(name)) {
			def_sno1_mng_typ(value);
			return;
		}
		if ($def_sno1_num_typ.equalsIgnoreCase(name)) {
			def_sno1_num_typ(value);
			return;
		}
		if ($def_sno1_ptn_cd.equalsIgnoreCase(name)) {
			def_sno1_ptn_cd(value);
			return;
		}
		if ($def_sno2_mng_typ.equalsIgnoreCase(name)) {
			def_sno2_mng_typ(value);
			return;
		}
		if ($def_sno2_num_typ.equalsIgnoreCase(name)) {
			def_sno2_num_typ(value);
			return;
		}
		if ($def_sno2_ptn_cd.equalsIgnoreCase(name)) {
			def_sno2_ptn_cd(value);
			return;
		}
		if ($def_sno3_mng_typ.equalsIgnoreCase(name)) {
			def_sno3_mng_typ(value);
			return;
		}
		if ($def_sno3_num_typ.equalsIgnoreCase(name)) {
			def_sno3_num_typ(value);
			return;
		}
		if ($def_sno3_ptn_cd.equalsIgnoreCase(name)) {
			def_sno3_ptn_cd(value);
			return;
		}
		if ($def_sno4_mng_typ.equalsIgnoreCase(name)) {
			def_sno4_mng_typ(value);
			return;
		}
		if ($def_sno4_num_typ.equalsIgnoreCase(name)) {
			def_sno4_num_typ(value);
			return;
		}
		if ($def_sno4_ptn_cd.equalsIgnoreCase(name)) {
			def_sno4_ptn_cd(value);
			return;
		}
		if ($def_lmt_ctl_categ.equalsIgnoreCase(name)) {
			def_lmt_ctl_categ(value);
			return;
		}
		if ($def_insp_bind_typ.equalsIgnoreCase(name)) {
			def_insp_bind_typ(value);
			return;
		}
		if ($def_mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			def_mrkt_judg_role_cd(value);
			return;
		}
		if ($def_mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			def_mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			def_plnt_aprv_role_cd(value);
			return;
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			def_insp_aprv_role_cd(value);
			return;
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			def_mfg_aprv_role_cd(value);
			return;
		}
		if ($def_sno_typ1.equalsIgnoreCase(name)) {
			def_sno_typ1(value);
			return;
		}
		if ($def_sno_typ2.equalsIgnoreCase(name)) {
			def_sno_typ2(value);
			return;
		}
		if ($def_sno_typ3.equalsIgnoreCase(name)) {
			def_sno_typ3(value);
			return;
		}
		if ($def_sno_typ4.equalsIgnoreCase(name)) {
			def_sno_typ4(value);
			return;
		}
		if ($def_alloc_ctl_typ.equalsIgnoreCase(name)) {
			def_alloc_ctl_typ(value);
			return;
		}
		if ($def_inpt_ctl_typ.equalsIgnoreCase(name)) {
			def_inpt_ctl_typ(value);
			return;
		}
		if ($def_bkf_typ.equalsIgnoreCase(name)) {
			def_bkf_typ(value);
			return;
		}
		if ($def_calc_ptn_cd.equalsIgnoreCase(name)) {
			def_calc_ptn_cd(value);
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
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($itm_typ_d_nm_lcl1.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl1(value);
			return;
		}
		if ($itm_typ_d_nm_lcl2.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl2(value);
			return;
		}
		if ($itm_typ_d_nm_lcl3.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl3(value);
			return;
		}
		if ($itm_typ_d_nm_lcl4.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl4(value);
			return;
		}
		if ($itm_typ_d_nm_lcl5.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl5(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($def_sls_flg.equalsIgnoreCase(name)) {
			def_sls_flg(value);
			return;
		}
		if ($def_mfg_flg.equalsIgnoreCase(name)) {
			def_mfg_flg(value);
			return;
		}
		if ($def_purc_flg.equalsIgnoreCase(name)) {
			def_purc_flg(value);
			return;
		}
		if ($def_insp_flg.equalsIgnoreCase(name)) {
			def_insp_flg(value);
			return;
		}
		if ($def_minus_stk_flg.equalsIgnoreCase(name)) {
			def_minus_stk_flg(value);
			return;
		}
		if ($def_not_new_lot_flg.equalsIgnoreCase(name)) {
			def_not_new_lot_flg(value);
			return;
		}
		if ($def_gi_alloc_flg.equalsIgnoreCase(name)) {
			def_gi_alloc_flg(value);
			return;
		}
		if ($def_pack_alloc_flg.equalsIgnoreCase(name)) {
			def_pack_alloc_flg(value);
			return;
		}
		if ($def_bp_lot_flg.equalsIgnoreCase(name)) {
			def_bp_lot_flg(value);
			return;
		}
		if ($def_comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			def_comp_rev_at_slo_flg(value);
			return;
		}
		if ($def_comp_core_itm_flg.equalsIgnoreCase(name)) {
			def_comp_core_itm_flg(value);
			return;
		}
		if ($def_skip_chk_ship_flg.equalsIgnoreCase(name)) {
			def_skip_chk_ship_flg(value);
			return;
		}
		if ($def_slo_proc_flg.equalsIgnoreCase(name)) {
			def_slo_proc_flg(value);
			return;
		}
		if ($def_ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			def_ship_lot_back_stop_flg(value);
			return;
		}
		if ($def_arr_skip_flg.equalsIgnoreCase(name)) {
			def_arr_skip_flg(value);
			return;
		}
		if ($def_stk_lst_flg.equalsIgnoreCase(name)) {
			def_stk_lst_flg(value);
			return;
		}
		if ($def_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			def_sls_upri_cng_flg(value);
			return;
		}
		if ($def_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			def_purc_upri_cng_flg(value);
			return;
		}
		if ($def_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			def_prov_upri_cng_flg(value);
			return;
		}
		if ($def_inpt_itm_add_flg.equalsIgnoreCase(name)) {
			def_inpt_itm_add_flg(value);
			return;
		}
		if ($def_inpt_itm_del_flg.equalsIgnoreCase(name)) {
			def_inpt_itm_del_flg(value);
			return;
		}
		if ($def_sch_flg.equalsIgnoreCase(name)) {
			def_sch_flg(value);
			return;
		}
		if ($def_slo_sno1_flg.equalsIgnoreCase(name)) {
			def_slo_sno1_flg(value);
			return;
		}
		if ($def_rqmt_sno1_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno1_flg(value);
			return;
		}
		if ($def_slo_sno2_flg.equalsIgnoreCase(name)) {
			def_slo_sno2_flg(value);
			return;
		}
		if ($def_rqmt_sno2_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno2_flg(value);
			return;
		}
		if ($def_slo_sno3_flg.equalsIgnoreCase(name)) {
			def_slo_sno3_flg(value);
			return;
		}
		if ($def_rqmt_sno3_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno3_flg(value);
			return;
		}
		if ($def_slo_sno4_flg.equalsIgnoreCase(name)) {
			def_slo_sno4_flg(value);
			return;
		}
		if ($def_rqmt_sno4_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno4_flg(value);
			return;
		}
		if ($def_lmt_ctl_flg.equalsIgnoreCase(name)) {
			def_lmt_ctl_flg(value);
			return;
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			def_ver_flg(value);
			return;
		}
		if ($def_mrkt_judg_flg.equalsIgnoreCase(name)) {
			def_mrkt_judg_flg(value);
			return;
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			def_plnt_aprv_flg(value);
			return;
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			def_insp_aprv_flg(value);
			return;
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			def_mfg_aprv_flg(value);
			return;
		}
		if ($def_inst_lot_fix_flg.equalsIgnoreCase(name)) {
			def_inst_lot_fix_flg(value);
			return;
		}
		if ($def_lot_mix_flg.equalsIgnoreCase(name)) {
			def_lot_mix_flg(value);
			return;
		}
		if ($def_sublot_mix_flg.equalsIgnoreCase(name)) {
			def_sublot_mix_flg(value);
			return;
		}
		if ($def_main_itm_flg.equalsIgnoreCase(name)) {
			def_main_itm_flg(value);
			return;
		}
		if ($def_byprod_flg.equalsIgnoreCase(name)) {
			def_byprod_flg(value);
			return;
		}
		if ($def_not_cost_bom_flg.equalsIgnoreCase(name)) {
			def_not_cost_bom_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($def_itm_jnl_cd.equalsIgnoreCase(name)) {
			def_itm_jnl_cd(value);
			return;
		}
		if ($def_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			def_ac_itm_grp_cd(value);
			return;
		}
		if ($def_comp_spec_typ.equalsIgnoreCase(name)) {
			def_comp_spec_typ(value);
			return;
		}
		if ($def_itm_spec_grp_cd.equalsIgnoreCase(name)) {
			def_itm_spec_grp_cd(value);
			return;
		}
		if ($def_sls_upri_grp_cd.equalsIgnoreCase(name)) {
			def_sls_upri_grp_cd(value);
			return;
		}
		if ($def_slo_proc_typ.equalsIgnoreCase(name)) {
			def_slo_proc_typ(value);
			return;
		}
		if ($def_ship_inst_typ.equalsIgnoreCase(name)) {
			def_ship_inst_typ(value);
			return;
		}
		if ($def_itm_ship_grp_cd.equalsIgnoreCase(name)) {
			def_itm_ship_grp_cd(value);
			return;
		}
		if ($def_ship_valid_grp_cd.equalsIgnoreCase(name)) {
			def_ship_valid_grp_cd(value);
			return;
		}
		if ($def_ship_term_cd.equalsIgnoreCase(name)) {
			def_ship_term_cd(value);
			return;
		}
		if ($def_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			def_mfg_inst_unit_typ(value);
			return;
		}
		if ($def_mrp_proc_typ.equalsIgnoreCase(name)) {
			def_mrp_proc_typ(value);
			return;
		}
		if ($def_rqmt_typ.equalsIgnoreCase(name)) {
			def_rqmt_typ(value);
			return;
		}
		if ($def_prod_pln_typ.equalsIgnoreCase(name)) {
			def_prod_pln_typ(value);
			return;
		}
		if ($def_lot_mng_typ.equalsIgnoreCase(name)) {
			def_lot_mng_typ(value);
			return;
		}
		if ($def_lot_no_typ.equalsIgnoreCase(name)) {
			def_lot_no_typ(value);
			return;
		}
		if ($def_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			def_lot_no_ptn_cd(value);
			return;
		}
		if ($def_sublot_mng_typ.equalsIgnoreCase(name)) {
			def_sublot_mng_typ(value);
			return;
		}
		if ($def_sublot_no_typ.equalsIgnoreCase(name)) {
			def_sublot_no_typ(value);
			return;
		}
		if ($def_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			def_sublot_no_ptn_cd(value);
			return;
		}
		if ($def_sno1_mng_typ.equalsIgnoreCase(name)) {
			def_sno1_mng_typ(value);
			return;
		}
		if ($def_sno1_num_typ.equalsIgnoreCase(name)) {
			def_sno1_num_typ(value);
			return;
		}
		if ($def_sno1_ptn_cd.equalsIgnoreCase(name)) {
			def_sno1_ptn_cd(value);
			return;
		}
		if ($def_sno2_mng_typ.equalsIgnoreCase(name)) {
			def_sno2_mng_typ(value);
			return;
		}
		if ($def_sno2_num_typ.equalsIgnoreCase(name)) {
			def_sno2_num_typ(value);
			return;
		}
		if ($def_sno2_ptn_cd.equalsIgnoreCase(name)) {
			def_sno2_ptn_cd(value);
			return;
		}
		if ($def_sno3_mng_typ.equalsIgnoreCase(name)) {
			def_sno3_mng_typ(value);
			return;
		}
		if ($def_sno3_num_typ.equalsIgnoreCase(name)) {
			def_sno3_num_typ(value);
			return;
		}
		if ($def_sno3_ptn_cd.equalsIgnoreCase(name)) {
			def_sno3_ptn_cd(value);
			return;
		}
		if ($def_sno4_mng_typ.equalsIgnoreCase(name)) {
			def_sno4_mng_typ(value);
			return;
		}
		if ($def_sno4_num_typ.equalsIgnoreCase(name)) {
			def_sno4_num_typ(value);
			return;
		}
		if ($def_sno4_ptn_cd.equalsIgnoreCase(name)) {
			def_sno4_ptn_cd(value);
			return;
		}
		if ($def_lmt_ctl_categ.equalsIgnoreCase(name)) {
			def_lmt_ctl_categ(value);
			return;
		}
		if ($def_insp_bind_typ.equalsIgnoreCase(name)) {
			def_insp_bind_typ(value);
			return;
		}
		if ($def_mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			def_mrkt_judg_role_cd(value);
			return;
		}
		if ($def_mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			def_mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			def_plnt_aprv_role_cd(value);
			return;
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			def_insp_aprv_role_cd(value);
			return;
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			def_mfg_aprv_role_cd(value);
			return;
		}
		if ($def_sno_typ1.equalsIgnoreCase(name)) {
			def_sno_typ1(value);
			return;
		}
		if ($def_sno_typ2.equalsIgnoreCase(name)) {
			def_sno_typ2(value);
			return;
		}
		if ($def_sno_typ3.equalsIgnoreCase(name)) {
			def_sno_typ3(value);
			return;
		}
		if ($def_sno_typ4.equalsIgnoreCase(name)) {
			def_sno_typ4(value);
			return;
		}
		if ($def_alloc_ctl_typ.equalsIgnoreCase(name)) {
			def_alloc_ctl_typ(value);
			return;
		}
		if ($def_inpt_ctl_typ.equalsIgnoreCase(name)) {
			def_inpt_ctl_typ(value);
			return;
		}
		if ($def_bkf_typ.equalsIgnoreCase(name)) {
			def_bkf_typ(value);
			return;
		}
		if ($def_calc_ptn_cd.equalsIgnoreCase(name)) {
			def_calc_ptn_cd(value);
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
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($itm_typ_d_nm_lcl1.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl1(value);
			return;
		}
		if ($itm_typ_d_nm_lcl2.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl2(value);
			return;
		}
		if ($itm_typ_d_nm_lcl3.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl3(value);
			return;
		}
		if ($itm_typ_d_nm_lcl4.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl4(value);
			return;
		}
		if ($itm_typ_d_nm_lcl5.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl5(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($def_sls_flg.equalsIgnoreCase(name)) {
			def_sls_flg(value);
			return;
		}
		if ($def_mfg_flg.equalsIgnoreCase(name)) {
			def_mfg_flg(value);
			return;
		}
		if ($def_purc_flg.equalsIgnoreCase(name)) {
			def_purc_flg(value);
			return;
		}
		if ($def_insp_flg.equalsIgnoreCase(name)) {
			def_insp_flg(value);
			return;
		}
		if ($def_minus_stk_flg.equalsIgnoreCase(name)) {
			def_minus_stk_flg(value);
			return;
		}
		if ($def_not_new_lot_flg.equalsIgnoreCase(name)) {
			def_not_new_lot_flg(value);
			return;
		}
		if ($def_gi_alloc_flg.equalsIgnoreCase(name)) {
			def_gi_alloc_flg(value);
			return;
		}
		if ($def_pack_alloc_flg.equalsIgnoreCase(name)) {
			def_pack_alloc_flg(value);
			return;
		}
		if ($def_bp_lot_flg.equalsIgnoreCase(name)) {
			def_bp_lot_flg(value);
			return;
		}
		if ($def_comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			def_comp_rev_at_slo_flg(value);
			return;
		}
		if ($def_comp_core_itm_flg.equalsIgnoreCase(name)) {
			def_comp_core_itm_flg(value);
			return;
		}
		if ($def_skip_chk_ship_flg.equalsIgnoreCase(name)) {
			def_skip_chk_ship_flg(value);
			return;
		}
		if ($def_slo_proc_flg.equalsIgnoreCase(name)) {
			def_slo_proc_flg(value);
			return;
		}
		if ($def_ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			def_ship_lot_back_stop_flg(value);
			return;
		}
		if ($def_arr_skip_flg.equalsIgnoreCase(name)) {
			def_arr_skip_flg(value);
			return;
		}
		if ($def_stk_lst_flg.equalsIgnoreCase(name)) {
			def_stk_lst_flg(value);
			return;
		}
		if ($def_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			def_sls_upri_cng_flg(value);
			return;
		}
		if ($def_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			def_purc_upri_cng_flg(value);
			return;
		}
		if ($def_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			def_prov_upri_cng_flg(value);
			return;
		}
		if ($def_inpt_itm_add_flg.equalsIgnoreCase(name)) {
			def_inpt_itm_add_flg(value);
			return;
		}
		if ($def_inpt_itm_del_flg.equalsIgnoreCase(name)) {
			def_inpt_itm_del_flg(value);
			return;
		}
		if ($def_sch_flg.equalsIgnoreCase(name)) {
			def_sch_flg(value);
			return;
		}
		if ($def_slo_sno1_flg.equalsIgnoreCase(name)) {
			def_slo_sno1_flg(value);
			return;
		}
		if ($def_rqmt_sno1_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno1_flg(value);
			return;
		}
		if ($def_slo_sno2_flg.equalsIgnoreCase(name)) {
			def_slo_sno2_flg(value);
			return;
		}
		if ($def_rqmt_sno2_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno2_flg(value);
			return;
		}
		if ($def_slo_sno3_flg.equalsIgnoreCase(name)) {
			def_slo_sno3_flg(value);
			return;
		}
		if ($def_rqmt_sno3_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno3_flg(value);
			return;
		}
		if ($def_slo_sno4_flg.equalsIgnoreCase(name)) {
			def_slo_sno4_flg(value);
			return;
		}
		if ($def_rqmt_sno4_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno4_flg(value);
			return;
		}
		if ($def_lmt_ctl_flg.equalsIgnoreCase(name)) {
			def_lmt_ctl_flg(value);
			return;
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			def_ver_flg(value);
			return;
		}
		if ($def_mrkt_judg_flg.equalsIgnoreCase(name)) {
			def_mrkt_judg_flg(value);
			return;
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			def_plnt_aprv_flg(value);
			return;
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			def_insp_aprv_flg(value);
			return;
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			def_mfg_aprv_flg(value);
			return;
		}
		if ($def_inst_lot_fix_flg.equalsIgnoreCase(name)) {
			def_inst_lot_fix_flg(value);
			return;
		}
		if ($def_lot_mix_flg.equalsIgnoreCase(name)) {
			def_lot_mix_flg(value);
			return;
		}
		if ($def_sublot_mix_flg.equalsIgnoreCase(name)) {
			def_sublot_mix_flg(value);
			return;
		}
		if ($def_main_itm_flg.equalsIgnoreCase(name)) {
			def_main_itm_flg(value);
			return;
		}
		if ($def_byprod_flg.equalsIgnoreCase(name)) {
			def_byprod_flg(value);
			return;
		}
		if ($def_not_cost_bom_flg.equalsIgnoreCase(name)) {
			def_not_cost_bom_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
