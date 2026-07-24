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
 * "計算グループパタンマスタ // Calculation group pattern master"DBコンテナRowクラスです。<p>
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
 *  	<td>calc_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算パタンＣＤ</td>
 *  	<td>Calculation pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_purc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造購買区分</td>
 *  	<td>Mfg. purchase type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>eval_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額評価区分</td>
 *  	<td>Amount evaluation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門計算区分</td>
 *  	<td>Dept. calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ計算区分</td>
 *  	<td>Lot No. calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ計算区分</td>
 *  	<td>Sublot No. calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１計算区分</td>
 *  	<td>SEIBAN No. 1 calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２計算区分</td>
 *  	<td>SEIBAN No. 2 calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３計算区分</td>
 *  	<td>SEIBAN No. 3 calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４計算区分</td>
 *  	<td>SEIBAN No. 4 calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ展開区分</td>
 *  	<td>Lot No. explosion type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ展開区分</td>
 *  	<td>Sublot No. explosion type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１展開区分</td>
 *  	<td>SEIBAN No. 1 explosion type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２展開区分</td>
 *  	<td>SEIBAN No. 2 explosion type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３展開区分</td>
 *  	<td>SEIBAN No. 3 explosion type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４展開区分</td>
 *  	<td>SEIBAN No. 4 explosion type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準端数処理区分</td>
 *  	<td>Rounding type (Standard)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準小数部有効桁数</td>
 *  	<td>Standard number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ave_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単価端数処理区分</td>
 *  	<td>Rounding type (Unit price)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ave_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単価小数部有効桁数</td>
 *  	<td>Unit price number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adj_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>端数調整区分</td>
 *  	<td>Fraction adjustment type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wip_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕掛区分</td>
 *  	<td>WIP type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_agg_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内訳集計区分</td>
 *  	<td>Breakdown aggregated type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrgn_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>調整費目ＣＤ</td>
 *  	<td>Adjustment cost element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買費目ＣＤ</td>
 *  	<td>Purchase cost element item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>out_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外注費目ＣＤ</td>
 *  	<td>Subcontract cost element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入費目ＣＤ</td>
 *  	<td>Input cost element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ss_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>自給費目ＣＤ</td>
 *  	<td>Self supply cost element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有償差額費目ＣＤ</td>
 *  	<td>Cost element cd. for gain or loss of chargeable item</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>exp_alloc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>展開割付区分</td>
 *  	<td>Explosion allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
 *  	<td>calc_ptn_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CALC_PTN1.CALC_PTN_NM</td>
 *  	<td>計算パタン名</td>
 *  	<td>Calculation pattern name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CALC_GRP1.CALC_GRP_NM</td>
 *  	<td>計算グループ名</td>
 *  	<td>Calculation group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrgn_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS1.EXPNS_NM</td>
 *  	<td>調整費目名</td>
 *  	<td>Adjustment cost element name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS2.EXPNS_NM</td>
 *  	<td>購買費目名</td>
 *  	<td>Purchase cost element name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>out_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS3.EXPNS_NM</td>
 *  	<td>外注費目名</td>
 *  	<td>Subcontract cost element name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS4.EXPNS_NM</td>
 *  	<td>投入費目名</td>
 *  	<td>Input cost element name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ss_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS5.EXPNS_NM</td>
 *  	<td>自給費目名</td>
 *  	<td>Self supply cost element name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_expns_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXPNS6.EXPNS_NM</td>
 *  	<td>有償差額費目名</td>
 *  	<td>Gain or loss of chargeable supply cost element name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_GRP_PTN_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_GRP_PTN";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public static final String $calc_ptn_cd = "calc_ptn_cd";
	private static final MCPermColumnInfo _calc_ptn_cd = createColumnInfo("calc_ptn_cd");
	public final MCStringPermColumn calc_ptn_cd = createStringColumn(_calc_ptn_cd);
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public static final String $mfg_purc_typ = "mfg_purc_typ";
	private static final MCPermColumnInfo _mfg_purc_typ = createColumnInfo("mfg_purc_typ");
	public final MCStringPermColumn mfg_purc_typ = createStringColumn(_mfg_purc_typ);
	
	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public static final String $eval_typ = "eval_typ";
	private static final MCPermColumnInfo _eval_typ = createColumnInfo("eval_typ");
	public final MCStringPermColumn eval_typ = createStringColumn(_eval_typ);
	
	/**
	 * 部門計算区分. Dept. calculation type.<p>
	 *
	 */
	public static final String $dpt_typ = "dpt_typ";
	private static final MCPermColumnInfo _dpt_typ = createColumnInfo("dpt_typ");
	public final MCStringPermColumn dpt_typ = createStringColumn(_dpt_typ);
	
	/**
	 * ロットＮＯ計算区分. Lot No. calculation type.<p>
	 *
	 */
	public static final String $lot_typ = "lot_typ";
	private static final MCPermColumnInfo _lot_typ = createColumnInfo("lot_typ");
	public final MCStringPermColumn lot_typ = createStringColumn(_lot_typ);
	
	/**
	 * サブロットＮＯ計算区分. Sublot No. calculation type.<p>
	 *
	 */
	public static final String $sublot_typ = "sublot_typ";
	private static final MCPermColumnInfo _sublot_typ = createColumnInfo("sublot_typ");
	public final MCStringPermColumn sublot_typ = createStringColumn(_sublot_typ);
	
	/**
	 * 手配ＮＯ１計算区分. SEIBAN No. 1 calculation type.<p>
	 *
	 */
	public static final String $sno1_typ = "sno1_typ";
	private static final MCPermColumnInfo _sno1_typ = createColumnInfo("sno1_typ");
	public final MCStringPermColumn sno1_typ = createStringColumn(_sno1_typ);
	
	/**
	 * 手配ＮＯ２計算区分. SEIBAN No. 2 calculation type.<p>
	 *
	 */
	public static final String $sno2_typ = "sno2_typ";
	private static final MCPermColumnInfo _sno2_typ = createColumnInfo("sno2_typ");
	public final MCStringPermColumn sno2_typ = createStringColumn(_sno2_typ);
	
	/**
	 * 手配ＮＯ３計算区分. SEIBAN No. 3 calculation type.<p>
	 *
	 */
	public static final String $sno3_typ = "sno3_typ";
	private static final MCPermColumnInfo _sno3_typ = createColumnInfo("sno3_typ");
	public final MCStringPermColumn sno3_typ = createStringColumn(_sno3_typ);
	
	/**
	 * 手配ＮＯ４計算区分. SEIBAN No. 4 calculation type.<p>
	 *
	 */
	public static final String $sno4_typ = "sno4_typ";
	private static final MCPermColumnInfo _sno4_typ = createColumnInfo("sno4_typ");
	public final MCStringPermColumn sno4_typ = createStringColumn(_sno4_typ);
	
	/**
	 * ロットＮＯ展開区分. Lot No. explosion type.<p>
	 *
	 */
	public static final String $lot_exp_typ = "lot_exp_typ";
	private static final MCPermColumnInfo _lot_exp_typ = createColumnInfo("lot_exp_typ");
	public final MCStringPermColumn lot_exp_typ = createStringColumn(_lot_exp_typ);
	
	/**
	 * サブロットＮＯ展開区分. Sublot No. explosion type.<p>
	 *
	 */
	public static final String $sublot_exp_typ = "sublot_exp_typ";
	private static final MCPermColumnInfo _sublot_exp_typ = createColumnInfo("sublot_exp_typ");
	public final MCStringPermColumn sublot_exp_typ = createStringColumn(_sublot_exp_typ);
	
	/**
	 * 手配ＮＯ１展開区分. SEIBAN No. 1 explosion type.<p>
	 *
	 */
	public static final String $sno1_exp_typ = "sno1_exp_typ";
	private static final MCPermColumnInfo _sno1_exp_typ = createColumnInfo("sno1_exp_typ");
	public final MCStringPermColumn sno1_exp_typ = createStringColumn(_sno1_exp_typ);
	
	/**
	 * 手配ＮＯ２展開区分. SEIBAN No. 2 explosion type.<p>
	 *
	 */
	public static final String $sno2_exp_typ = "sno2_exp_typ";
	private static final MCPermColumnInfo _sno2_exp_typ = createColumnInfo("sno2_exp_typ");
	public final MCStringPermColumn sno2_exp_typ = createStringColumn(_sno2_exp_typ);
	
	/**
	 * 手配ＮＯ３展開区分. SEIBAN No. 3 explosion type.<p>
	 *
	 */
	public static final String $sno3_exp_typ = "sno3_exp_typ";
	private static final MCPermColumnInfo _sno3_exp_typ = createColumnInfo("sno3_exp_typ");
	public final MCStringPermColumn sno3_exp_typ = createStringColumn(_sno3_exp_typ);
	
	/**
	 * 手配ＮＯ４展開区分. SEIBAN No. 4 explosion type.<p>
	 *
	 */
	public static final String $sno4_exp_typ = "sno4_exp_typ";
	private static final MCPermColumnInfo _sno4_exp_typ = createColumnInfo("sno4_exp_typ");
	public final MCStringPermColumn sno4_exp_typ = createStringColumn(_sno4_exp_typ);
	
	/**
	 * 標準端数処理区分. Rounding type (Standard).<p>
	 *
	 */
	public static final String $std_rnd_typ = "std_rnd_typ";
	private static final MCPermColumnInfo _std_rnd_typ = createColumnInfo("std_rnd_typ");
	public final MCStringPermColumn std_rnd_typ = createStringColumn(_std_rnd_typ);
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public static final String $std_dec_place = "std_dec_place";
	private static final MCPermColumnInfo _std_dec_place = createColumnInfo("std_dec_place");
	public final MCNumberPermColumn std_dec_place = createNumberColumn(_std_dec_place);
	
	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public static final String $ave_rnd_typ = "ave_rnd_typ";
	private static final MCPermColumnInfo _ave_rnd_typ = createColumnInfo("ave_rnd_typ");
	public final MCStringPermColumn ave_rnd_typ = createStringColumn(_ave_rnd_typ);
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public static final String $ave_dec_place = "ave_dec_place";
	private static final MCPermColumnInfo _ave_dec_place = createColumnInfo("ave_dec_place");
	public final MCNumberPermColumn ave_dec_place = createNumberColumn(_ave_dec_place);
	
	/**
	 * 端数調整区分. Fraction adjustment type.<p>
	 *
	 */
	public static final String $adj_typ = "adj_typ";
	private static final MCPermColumnInfo _adj_typ = createColumnInfo("adj_typ");
	public final MCStringPermColumn adj_typ = createStringColumn(_adj_typ);
	
	/**
	 * 仕掛区分. WIP type.<p>
	 *
	 */
	public static final String $wip_typ = "wip_typ";
	private static final MCPermColumnInfo _wip_typ = createColumnInfo("wip_typ");
	public final MCStringPermColumn wip_typ = createStringColumn(_wip_typ);
	
	/**
	 * 内訳集計区分. Breakdown aggregated type.<p>
	 *
	 */
	public static final String $bd_agg_typ = "bd_agg_typ";
	private static final MCPermColumnInfo _bd_agg_typ = createColumnInfo("bd_agg_typ");
	public final MCStringPermColumn bd_agg_typ = createStringColumn(_bd_agg_typ);
	
	/**
	 * 調整費目ＣＤ. Adjustment cost element cd..<p>
	 *
	 */
	public static final String $mrgn_expns_cd = "mrgn_expns_cd";
	private static final MCPermColumnInfo _mrgn_expns_cd = createColumnInfo("mrgn_expns_cd");
	public final MCStringPermColumn mrgn_expns_cd = createStringColumn(_mrgn_expns_cd);
	
	/**
	 * 購買費目ＣＤ. Purchase cost element item cd..<p>
	 *
	 */
	public static final String $purc_expns_cd = "purc_expns_cd";
	private static final MCPermColumnInfo _purc_expns_cd = createColumnInfo("purc_expns_cd");
	public final MCStringPermColumn purc_expns_cd = createStringColumn(_purc_expns_cd);
	
	/**
	 * 外注費目ＣＤ. Subcontract cost element cd..<p>
	 *
	 */
	public static final String $out_expns_cd = "out_expns_cd";
	private static final MCPermColumnInfo _out_expns_cd = createColumnInfo("out_expns_cd");
	public final MCStringPermColumn out_expns_cd = createStringColumn(_out_expns_cd);
	
	/**
	 * 投入費目ＣＤ. Input cost element cd..<p>
	 *
	 */
	public static final String $inpt_expns_cd = "inpt_expns_cd";
	private static final MCPermColumnInfo _inpt_expns_cd = createColumnInfo("inpt_expns_cd");
	public final MCStringPermColumn inpt_expns_cd = createStringColumn(_inpt_expns_cd);
	
	/**
	 * 自給費目ＣＤ. Self supply cost element cd..<p>
	 *
	 */
	public static final String $ss_expns_cd = "ss_expns_cd";
	private static final MCPermColumnInfo _ss_expns_cd = createColumnInfo("ss_expns_cd");
	public final MCStringPermColumn ss_expns_cd = createStringColumn(_ss_expns_cd);
	
	/**
	 * 有償差額費目ＣＤ. Cost element cd. for gain or loss of chargeable item.<p>
	 *
	 */
	public static final String $prov_expns_cd = "prov_expns_cd";
	private static final MCPermColumnInfo _prov_expns_cd = createColumnInfo("prov_expns_cd");
	public final MCStringPermColumn prov_expns_cd = createStringColumn(_prov_expns_cd);
	
	/**
	 * 展開割付区分. Explosion allocation type.<p>
	 *
	 */
	public static final String $exp_alloc_typ = "exp_alloc_typ";
	private static final MCPermColumnInfo _exp_alloc_typ = createColumnInfo("exp_alloc_typ");
	public final MCStringPermColumn exp_alloc_typ = createStringColumn(_exp_alloc_typ);
	
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
	 * 計算パタン名. Calculation pattern name.<p>
	 *
	 */
	public static final String $calc_ptn_nm = "calc_ptn_nm";
	
	/**
	 * 計算グループ名. Calculation group name.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	
	/**
	 * 調整費目名. Adjustment cost element name.<p>
	 *
	 */
	public static final String $mrgn_expns_nm = "mrgn_expns_nm";
	
	/**
	 * 購買費目名. Purchase cost element name.<p>
	 *
	 */
	public static final String $purc_expns_nm = "purc_expns_nm";
	
	/**
	 * 外注費目名. Subcontract cost element name.<p>
	 *
	 */
	public static final String $out_expns_nm = "out_expns_nm";
	
	/**
	 * 投入費目名. Input cost element name.<p>
	 *
	 */
	public static final String $inpt_expns_nm = "inpt_expns_nm";
	
	/**
	 * 自給費目名. Self supply cost element name.<p>
	 *
	 */
	public static final String $ss_expns_nm = "ss_expns_nm";
	
	/**
	 * 有償差額費目名. Gain or loss of chargeable supply cost element name.<p>
	 *
	 */
	public static final String $prov_expns_nm = "prov_expns_nm";
	
	public static final MCMeta calc_ptn_cd_META = createCommonMeta($calc_ptn_cd, mcframe.commonMA.meta.MA_META.CALC_PTN_CD);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta mfg_purc_typ_META = createCommonMeta($mfg_purc_typ, mcframe.commonMA.meta.MA_META.MFG_PURC_TYP);
	public static final MCMeta eval_typ_META = createCommonMeta($eval_typ, mcframe.commonMA.meta.MA_META.EVAL_TYP);
	public static final MCMeta dpt_typ_META = createCommonMeta($dpt_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta lot_typ_META = createCommonMeta($lot_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sublot_typ_META = createCommonMeta($sublot_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno1_typ_META = createCommonMeta($sno1_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno2_typ_META = createCommonMeta($sno2_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno3_typ_META = createCommonMeta($sno3_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno4_typ_META = createCommonMeta($sno4_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta lot_exp_typ_META = createCommonMeta($lot_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sublot_exp_typ_META = createCommonMeta($sublot_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno1_exp_typ_META = createCommonMeta($sno1_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno2_exp_typ_META = createCommonMeta($sno2_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno3_exp_typ_META = createCommonMeta($sno3_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno4_exp_typ_META = createCommonMeta($sno4_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta std_rnd_typ_META = createCommonMeta($std_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_dec_place_META = createCommonMeta($std_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ave_rnd_typ_META = createCommonMeta($ave_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ave_dec_place_META = createCommonMeta($ave_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta adj_typ_META = createCommonMeta($adj_typ, mcframe.commonMA.meta.MA_META.ADJ_TYP);
	public static final MCMeta wip_typ_META = createCommonMeta($wip_typ, mcframe.commonMA.meta.MA_META.WIP_TYP);
	public static final MCMeta bd_agg_typ_META = createCommonMeta($bd_agg_typ, mcframe.commonMA.meta.MA_META.BD_AGG_TYP);
	public static final MCMeta mrgn_expns_cd_META = createCommonMeta($mrgn_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta purc_expns_cd_META = createCommonMeta($purc_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta out_expns_cd_META = createCommonMeta($out_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta inpt_expns_cd_META = createCommonMeta($inpt_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta ss_expns_cd_META = createCommonMeta($ss_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta prov_expns_cd_META = createCommonMeta($prov_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta exp_alloc_typ_META = createCommonMeta($exp_alloc_typ, mcframe.commonMA.meta.MA_META.EXP_ALLOC_TYP);
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
	public static final MCMeta calc_ptn_nm_META = createCommonMeta($calc_ptn_nm, mcframe.commonMA.meta.MA_META.CALC_PTN_NM);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta mrgn_expns_nm_META = createCommonMeta($mrgn_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta purc_expns_nm_META = createCommonMeta($purc_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta out_expns_nm_META = createCommonMeta($out_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta inpt_expns_nm_META = createCommonMeta($inpt_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta ss_expns_nm_META = createCommonMeta($ss_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta prov_expns_nm_META = createCommonMeta($prov_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $CALC_PTN1 = "CALC_PTN1";
	public static final String $CALC_GRP1 = "CALC_GRP1";
	public static final String $EXPNS1 = "EXPNS1";
	public static final String $EXPNS2 = "EXPNS2";
	public static final String $EXPNS3 = "EXPNS3";
	public static final String $EXPNS4 = "EXPNS4";
	public static final String $EXPNS5 = "EXPNS5";
	public static final String $EXPNS6 = "EXPNS6";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CALC_PTN",
				$CALC_PTN1,
				new String[][]{
						{"calc_ptn_cd", "calc_ptn_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CALC_PTN_R.create("CALC_PTN1");
				},
				(alias) -> {
					MAM_GRP_PTN_R own = MAM_GRP_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_CALC_PTN_R ref = mcframe.serverMA.dbc.MAM_CALC_PTN_R.create("CALC_PTN1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.calc_ptn_cd.eq(ref.calc_ptn_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CALC_GRP",
				$CALC_GRP1,
				new String[][]{
						{"calc_grp_cd", "calc_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CALC_GRP_R.create("CALC_GRP1");
				},
				(alias) -> {
					MAM_GRP_PTN_R own = MAM_GRP_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_CALC_GRP_R ref = mcframe.serverMA.dbc.MAM_CALC_GRP_R.create("CALC_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.calc_grp_cd.eq(ref.calc_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS1,
				new String[][]{
						{"mrgn_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS1");
				},
				(alias) -> {
					MAM_GRP_PTN_R own = MAM_GRP_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.mrgn_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS2,
				new String[][]{
						{"purc_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS2");
				},
				(alias) -> {
					MAM_GRP_PTN_R own = MAM_GRP_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.purc_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS3,
				new String[][]{
						{"out_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS3");
				},
				(alias) -> {
					MAM_GRP_PTN_R own = MAM_GRP_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.out_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS4,
				new String[][]{
						{"inpt_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS4");
				},
				(alias) -> {
					MAM_GRP_PTN_R own = MAM_GRP_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS4");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.inpt_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS5,
				new String[][]{
						{"ss_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS5");
				},
				(alias) -> {
					MAM_GRP_PTN_R own = MAM_GRP_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS5");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ss_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXPNS",
				$EXPNS6,
				new String[][]{
						{"prov_expns_cd", "expns_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS6");
				},
				(alias) -> {
					MAM_GRP_PTN_R own = MAM_GRP_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXPNS_R ref = mcframe.serverMA.dbc.MAM_EXPNS_R.create("EXPNS6");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.prov_expns_cd.eq(ref.expns_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_GRP_PTN_R> constMetas = new ConstMetaList<MAM_GRP_PTN_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_ptn_cd_META,
			calc_grp_cd_META,
			mfg_purc_typ_META,
			eval_typ_META,
			dpt_typ_META,
			lot_typ_META,
			sublot_typ_META,
			sno1_typ_META,
			sno2_typ_META,
			sno3_typ_META,
			sno4_typ_META,
			lot_exp_typ_META,
			sublot_exp_typ_META,
			sno1_exp_typ_META,
			sno2_exp_typ_META,
			sno3_exp_typ_META,
			sno4_exp_typ_META,
			std_rnd_typ_META,
			std_dec_place_META,
			ave_rnd_typ_META,
			ave_dec_place_META,
			adj_typ_META,
			wip_typ_META,
			bd_agg_typ_META,
			mrgn_expns_cd_META,
			purc_expns_cd_META,
			out_expns_cd_META,
			inpt_expns_cd_META,
			ss_expns_cd_META,
			prov_expns_cd_META,
			exp_alloc_typ_META,
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
			calc_ptn_nm_META,
			calc_grp_nm_META,
			mrgn_expns_nm_META,
			purc_expns_nm_META,
			out_expns_nm_META,
			inpt_expns_nm_META,
			ss_expns_nm_META,
			prov_expns_nm_META
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
	protected MAM_GRP_PTN_R(ConstMetaList<? extends MAM_GRP_PTN_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_GRP_PTN_R(ConstMetaList<? extends MAM_GRP_PTN_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$calc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$calc_ptn_cd,
				"calc_ptn_cd",
				calc_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$calc_grp_cd,
				"calc_grp_cd",
				calc_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$mfg_purc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$mfg_purc_typ,
				"mfg_purc_typ",
				mfg_purc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$eval_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$eval_typ,
				"eval_typ",
				eval_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$dpt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$dpt_typ,
				"dpt_typ",
				dpt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$lot_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$lot_typ,
				"lot_typ",
				lot_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$sublot_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$sublot_typ,
				"sublot_typ",
				sublot_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$sno1_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$sno1_typ,
				"sno1_typ",
				sno1_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$sno2_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$sno2_typ,
				"sno2_typ",
				sno2_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$sno3_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$sno3_typ,
				"sno3_typ",
				sno3_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$sno4_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$sno4_typ,
				"sno4_typ",
				sno4_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$lot_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$lot_exp_typ,
				"lot_exp_typ",
				lot_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$sublot_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$sublot_exp_typ,
				"sublot_exp_typ",
				sublot_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$sno1_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$sno1_exp_typ,
				"sno1_exp_typ",
				sno1_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$sno2_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$sno2_exp_typ,
				"sno2_exp_typ",
				sno2_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$sno3_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$sno3_exp_typ,
				"sno3_exp_typ",
				sno3_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$sno4_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$sno4_exp_typ,
				"sno4_exp_typ",
				sno4_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$std_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$std_rnd_typ,
				"std_rnd_typ",
				std_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$std_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GRP_PTN_R.$std_dec_place,
				"std_dec_place",
				std_dec_place,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$ave_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$ave_rnd_typ,
				"ave_rnd_typ",
				ave_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$ave_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GRP_PTN_R.$ave_dec_place,
				"ave_dec_place",
				ave_dec_place,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$adj_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$adj_typ,
				"adj_typ",
				adj_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$wip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$wip_typ,
				"wip_typ",
				wip_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$bd_agg_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$bd_agg_typ,
				"bd_agg_typ",
				bd_agg_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$mrgn_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$mrgn_expns_cd,
				"mrgn_expns_cd",
				mrgn_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$purc_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$purc_expns_cd,
				"purc_expns_cd",
				purc_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$out_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$out_expns_cd,
				"out_expns_cd",
				out_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$inpt_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$inpt_expns_cd,
				"inpt_expns_cd",
				inpt_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$ss_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$ss_expns_cd,
				"ss_expns_cd",
				ss_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$prov_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$prov_expns_cd,
				"prov_expns_cd",
				prov_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$exp_alloc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$exp_alloc_typ,
				"exp_alloc_typ",
				exp_alloc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_GRP_PTN_R.$del_flg,
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
			MAM_GRP_PTN_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$del_usr_id,
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
			MAM_GRP_PTN_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$del_usr_nm,
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
			MAM_GRP_PTN_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_GRP_PTN_R.$del_ts,
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
			MAM_GRP_PTN_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$ins_usr_id,
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
			MAM_GRP_PTN_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$ins_usr_nm,
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
			MAM_GRP_PTN_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_GRP_PTN_R.$ins_ts,
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
			MAM_GRP_PTN_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$ins_func_id,
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
			MAM_GRP_PTN_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GRP_PTN_R.$upd_cntr,
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
			MAM_GRP_PTN_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$upd_usr_id,
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
			MAM_GRP_PTN_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$upd_usr_nm,
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
			MAM_GRP_PTN_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_GRP_PTN_R.$upd_ts,
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
			MAM_GRP_PTN_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$upd_func_id,
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
			MAM_GRP_PTN_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$upd_srv_req_no,
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
			MAM_GRP_PTN_R.$calc_ptn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$calc_ptn_nm,
				"calc_ptn_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CALC_PTN1.CALC_PTN_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$calc_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$calc_grp_nm,
				"calc_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CALC_GRP1.CALC_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$mrgn_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$mrgn_expns_nm,
				"mrgn_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS1.EXPNS_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$purc_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$purc_expns_nm,
				"purc_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS2.EXPNS_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$out_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$out_expns_nm,
				"out_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS3.EXPNS_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$inpt_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$inpt_expns_nm,
				"inpt_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS4.EXPNS_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$ss_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$ss_expns_nm,
				"ss_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS5.EXPNS_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_GRP_PTN_R.$prov_expns_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GRP_PTN_R.$prov_expns_nm,
				"prov_expns_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXPNS6.EXPNS_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_GRP_PTN_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_GRP_PTN_R create(String alias) {
		MAM_GRP_PTN_R row = new MAM_GRP_PTN_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_GRP_PTN_R createByName(T proto) {
		MAM_GRP_PTN_R row = MAM_GRP_PTN_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_GRP_PTN_R clone() {
		return (MAM_GRP_PTN_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_GRP_PTN_R createInstance() {
		return (MAM_GRP_PTN_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_GRP_PTN_R getValues(String... names) {
		return (MAM_GRP_PTN_R) super.getValues(names);
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
	 public MAW_GRP_PTN_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_GRP_PTN_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_GRP_PTN_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_GRP_PTN_KEY_R.TABLE_NAME);
	 }

	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public String calc_ptn_cd() {
		return getConstString(offset + 0, $calc_ptn_cd);
	}

	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public void calc_ptn_cd(String value) {
		setConstString(offset + 0, $calc_ptn_cd, value);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}

	/**
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public String mfg_purc_typ() {
		return getConstString(offset + 2, $mfg_purc_typ);
	}

	/**
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public void mfg_purc_typ(String value) {
		setConstString(offset + 2, $mfg_purc_typ, value);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public String eval_typ() {
		return getConstString(offset + 3, $eval_typ);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public void eval_typ(String value) {
		setConstString(offset + 3, $eval_typ, value);
	}

	/**
	 * 部門計算区分. Dept. calculation type.<p>
	 *
	 */
	public String dpt_typ() {
		return getConstString(offset + 4, $dpt_typ);
	}

	/**
	 * 部門計算区分. Dept. calculation type.<p>
	 *
	 */
	public void dpt_typ(String value) {
		setConstString(offset + 4, $dpt_typ, value);
	}

	/**
	 * ロットＮＯ計算区分. Lot No. calculation type.<p>
	 *
	 */
	public String lot_typ() {
		return getConstString(offset + 5, $lot_typ);
	}

	/**
	 * ロットＮＯ計算区分. Lot No. calculation type.<p>
	 *
	 */
	public void lot_typ(String value) {
		setConstString(offset + 5, $lot_typ, value);
	}

	/**
	 * サブロットＮＯ計算区分. Sublot No. calculation type.<p>
	 *
	 */
	public String sublot_typ() {
		return getConstString(offset + 6, $sublot_typ);
	}

	/**
	 * サブロットＮＯ計算区分. Sublot No. calculation type.<p>
	 *
	 */
	public void sublot_typ(String value) {
		setConstString(offset + 6, $sublot_typ, value);
	}

	/**
	 * 手配ＮＯ１計算区分. SEIBAN No. 1 calculation type.<p>
	 *
	 */
	public String sno1_typ() {
		return getConstString(offset + 7, $sno1_typ);
	}

	/**
	 * 手配ＮＯ１計算区分. SEIBAN No. 1 calculation type.<p>
	 *
	 */
	public void sno1_typ(String value) {
		setConstString(offset + 7, $sno1_typ, value);
	}

	/**
	 * 手配ＮＯ２計算区分. SEIBAN No. 2 calculation type.<p>
	 *
	 */
	public String sno2_typ() {
		return getConstString(offset + 8, $sno2_typ);
	}

	/**
	 * 手配ＮＯ２計算区分. SEIBAN No. 2 calculation type.<p>
	 *
	 */
	public void sno2_typ(String value) {
		setConstString(offset + 8, $sno2_typ, value);
	}

	/**
	 * 手配ＮＯ３計算区分. SEIBAN No. 3 calculation type.<p>
	 *
	 */
	public String sno3_typ() {
		return getConstString(offset + 9, $sno3_typ);
	}

	/**
	 * 手配ＮＯ３計算区分. SEIBAN No. 3 calculation type.<p>
	 *
	 */
	public void sno3_typ(String value) {
		setConstString(offset + 9, $sno3_typ, value);
	}

	/**
	 * 手配ＮＯ４計算区分. SEIBAN No. 4 calculation type.<p>
	 *
	 */
	public String sno4_typ() {
		return getConstString(offset + 10, $sno4_typ);
	}

	/**
	 * 手配ＮＯ４計算区分. SEIBAN No. 4 calculation type.<p>
	 *
	 */
	public void sno4_typ(String value) {
		setConstString(offset + 10, $sno4_typ, value);
	}

	/**
	 * ロットＮＯ展開区分. Lot No. explosion type.<p>
	 *
	 */
	public String lot_exp_typ() {
		return getConstString(offset + 11, $lot_exp_typ);
	}

	/**
	 * ロットＮＯ展開区分. Lot No. explosion type.<p>
	 *
	 */
	public void lot_exp_typ(String value) {
		setConstString(offset + 11, $lot_exp_typ, value);
	}

	/**
	 * サブロットＮＯ展開区分. Sublot No. explosion type.<p>
	 *
	 */
	public String sublot_exp_typ() {
		return getConstString(offset + 12, $sublot_exp_typ);
	}

	/**
	 * サブロットＮＯ展開区分. Sublot No. explosion type.<p>
	 *
	 */
	public void sublot_exp_typ(String value) {
		setConstString(offset + 12, $sublot_exp_typ, value);
	}

	/**
	 * 手配ＮＯ１展開区分. SEIBAN No. 1 explosion type.<p>
	 *
	 */
	public String sno1_exp_typ() {
		return getConstString(offset + 13, $sno1_exp_typ);
	}

	/**
	 * 手配ＮＯ１展開区分. SEIBAN No. 1 explosion type.<p>
	 *
	 */
	public void sno1_exp_typ(String value) {
		setConstString(offset + 13, $sno1_exp_typ, value);
	}

	/**
	 * 手配ＮＯ２展開区分. SEIBAN No. 2 explosion type.<p>
	 *
	 */
	public String sno2_exp_typ() {
		return getConstString(offset + 14, $sno2_exp_typ);
	}

	/**
	 * 手配ＮＯ２展開区分. SEIBAN No. 2 explosion type.<p>
	 *
	 */
	public void sno2_exp_typ(String value) {
		setConstString(offset + 14, $sno2_exp_typ, value);
	}

	/**
	 * 手配ＮＯ３展開区分. SEIBAN No. 3 explosion type.<p>
	 *
	 */
	public String sno3_exp_typ() {
		return getConstString(offset + 15, $sno3_exp_typ);
	}

	/**
	 * 手配ＮＯ３展開区分. SEIBAN No. 3 explosion type.<p>
	 *
	 */
	public void sno3_exp_typ(String value) {
		setConstString(offset + 15, $sno3_exp_typ, value);
	}

	/**
	 * 手配ＮＯ４展開区分. SEIBAN No. 4 explosion type.<p>
	 *
	 */
	public String sno4_exp_typ() {
		return getConstString(offset + 16, $sno4_exp_typ);
	}

	/**
	 * 手配ＮＯ４展開区分. SEIBAN No. 4 explosion type.<p>
	 *
	 */
	public void sno4_exp_typ(String value) {
		setConstString(offset + 16, $sno4_exp_typ, value);
	}

	/**
	 * 標準端数処理区分. Rounding type (Standard).<p>
	 *
	 */
	public String std_rnd_typ() {
		return getConstString(offset + 17, $std_rnd_typ);
	}

	/**
	 * 標準端数処理区分. Rounding type (Standard).<p>
	 *
	 */
	public void std_rnd_typ(String value) {
		setConstString(offset + 17, $std_rnd_typ, value);
	}

	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public MCNumber std_dec_place() {
		return getConstNumber(offset + 18, $std_dec_place);
	}

	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(int value) {
		setConstNumber(offset + 18, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(long value) {
		setConstNumber(offset + 18, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(float value) {
		setConstNumber(offset + 18, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(double value) {
		setConstNumber(offset + 18, $std_dec_place, value);
	}
	
	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public String ave_rnd_typ() {
		return getConstString(offset + 19, $ave_rnd_typ);
	}

	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public void ave_rnd_typ(String value) {
		setConstString(offset + 19, $ave_rnd_typ, value);
	}

	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public MCNumber ave_dec_place() {
		return getConstNumber(offset + 20, $ave_dec_place);
	}

	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(MCNumber value) {
		setConstNumber(offset + 20, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(int value) {
		setConstNumber(offset + 20, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(long value) {
		setConstNumber(offset + 20, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(float value) {
		setConstNumber(offset + 20, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(double value) {
		setConstNumber(offset + 20, $ave_dec_place, value);
	}
	
	/**
	 * 端数調整区分. Fraction adjustment type.<p>
	 *
	 */
	public String adj_typ() {
		return getConstString(offset + 21, $adj_typ);
	}

	/**
	 * 端数調整区分. Fraction adjustment type.<p>
	 *
	 */
	public void adj_typ(String value) {
		setConstString(offset + 21, $adj_typ, value);
	}

	/**
	 * 仕掛区分. WIP type.<p>
	 *
	 */
	public String wip_typ() {
		return getConstString(offset + 22, $wip_typ);
	}

	/**
	 * 仕掛区分. WIP type.<p>
	 *
	 */
	public void wip_typ(String value) {
		setConstString(offset + 22, $wip_typ, value);
	}

	/**
	 * 内訳集計区分. Breakdown aggregated type.<p>
	 *
	 */
	public String bd_agg_typ() {
		return getConstString(offset + 23, $bd_agg_typ);
	}

	/**
	 * 内訳集計区分. Breakdown aggregated type.<p>
	 *
	 */
	public void bd_agg_typ(String value) {
		setConstString(offset + 23, $bd_agg_typ, value);
	}

	/**
	 * 調整費目ＣＤ. Adjustment cost element cd..<p>
	 *
	 */
	public String mrgn_expns_cd() {
		return getConstString(offset + 24, $mrgn_expns_cd);
	}

	/**
	 * 調整費目ＣＤ. Adjustment cost element cd..<p>
	 *
	 */
	public void mrgn_expns_cd(String value) {
		setConstString(offset + 24, $mrgn_expns_cd, value);
	}

	/**
	 * 購買費目ＣＤ. Purchase cost element item cd..<p>
	 *
	 */
	public String purc_expns_cd() {
		return getConstString(offset + 25, $purc_expns_cd);
	}

	/**
	 * 購買費目ＣＤ. Purchase cost element item cd..<p>
	 *
	 */
	public void purc_expns_cd(String value) {
		setConstString(offset + 25, $purc_expns_cd, value);
	}

	/**
	 * 外注費目ＣＤ. Subcontract cost element cd..<p>
	 *
	 */
	public String out_expns_cd() {
		return getConstString(offset + 26, $out_expns_cd);
	}

	/**
	 * 外注費目ＣＤ. Subcontract cost element cd..<p>
	 *
	 */
	public void out_expns_cd(String value) {
		setConstString(offset + 26, $out_expns_cd, value);
	}

	/**
	 * 投入費目ＣＤ. Input cost element cd..<p>
	 *
	 */
	public String inpt_expns_cd() {
		return getConstString(offset + 27, $inpt_expns_cd);
	}

	/**
	 * 投入費目ＣＤ. Input cost element cd..<p>
	 *
	 */
	public void inpt_expns_cd(String value) {
		setConstString(offset + 27, $inpt_expns_cd, value);
	}

	/**
	 * 自給費目ＣＤ. Self supply cost element cd..<p>
	 *
	 */
	public String ss_expns_cd() {
		return getConstString(offset + 28, $ss_expns_cd);
	}

	/**
	 * 自給費目ＣＤ. Self supply cost element cd..<p>
	 *
	 */
	public void ss_expns_cd(String value) {
		setConstString(offset + 28, $ss_expns_cd, value);
	}

	/**
	 * 有償差額費目ＣＤ. Cost element cd. for gain or loss of chargeable item.<p>
	 *
	 */
	public String prov_expns_cd() {
		return getConstString(offset + 29, $prov_expns_cd);
	}

	/**
	 * 有償差額費目ＣＤ. Cost element cd. for gain or loss of chargeable item.<p>
	 *
	 */
	public void prov_expns_cd(String value) {
		setConstString(offset + 29, $prov_expns_cd, value);
	}

	/**
	 * 展開割付区分. Explosion allocation type.<p>
	 *
	 */
	public String exp_alloc_typ() {
		return getConstString(offset + 30, $exp_alloc_typ);
	}

	/**
	 * 展開割付区分. Explosion allocation type.<p>
	 *
	 */
	public void exp_alloc_typ(String value) {
		setConstString(offset + 30, $exp_alloc_typ, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 31, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 31, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 32, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 32, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 33, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 33, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 34, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 34, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 35, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 35, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 36, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 36, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 37, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 37, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 38, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 38, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 39, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 39, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 40, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 40, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 41, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 41, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 42, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 43, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 43, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 44, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 44, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 45, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 46, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 46, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 47, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 47, $upd_srv_req_no, value);
	}

	/**
	 * 計算パタン名. Calculation pattern name.<p>
	 *
	 */
	public String calc_ptn_nm() {
		return getConstString(offset + 48, $calc_ptn_nm);
	}

	/**
	 * 計算パタン名. Calculation pattern name.<p>
	 *
	 */
	public void calc_ptn_nm(String value) {
		setConstString(offset + 48, $calc_ptn_nm, value);
	}

	/**
	 * 計算グループ名. Calculation group name.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 49, $calc_grp_nm);
	}

	/**
	 * 計算グループ名. Calculation group name.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 49, $calc_grp_nm, value);
	}

	/**
	 * 調整費目名. Adjustment cost element name.<p>
	 *
	 */
	public String mrgn_expns_nm() {
		return getConstString(offset + 50, $mrgn_expns_nm);
	}

	/**
	 * 調整費目名. Adjustment cost element name.<p>
	 *
	 */
	public void mrgn_expns_nm(String value) {
		setConstString(offset + 50, $mrgn_expns_nm, value);
	}

	/**
	 * 購買費目名. Purchase cost element name.<p>
	 *
	 */
	public String purc_expns_nm() {
		return getConstString(offset + 51, $purc_expns_nm);
	}

	/**
	 * 購買費目名. Purchase cost element name.<p>
	 *
	 */
	public void purc_expns_nm(String value) {
		setConstString(offset + 51, $purc_expns_nm, value);
	}

	/**
	 * 外注費目名. Subcontract cost element name.<p>
	 *
	 */
	public String out_expns_nm() {
		return getConstString(offset + 52, $out_expns_nm);
	}

	/**
	 * 外注費目名. Subcontract cost element name.<p>
	 *
	 */
	public void out_expns_nm(String value) {
		setConstString(offset + 52, $out_expns_nm, value);
	}

	/**
	 * 投入費目名. Input cost element name.<p>
	 *
	 */
	public String inpt_expns_nm() {
		return getConstString(offset + 53, $inpt_expns_nm);
	}

	/**
	 * 投入費目名. Input cost element name.<p>
	 *
	 */
	public void inpt_expns_nm(String value) {
		setConstString(offset + 53, $inpt_expns_nm, value);
	}

	/**
	 * 自給費目名. Self supply cost element name.<p>
	 *
	 */
	public String ss_expns_nm() {
		return getConstString(offset + 54, $ss_expns_nm);
	}

	/**
	 * 自給費目名. Self supply cost element name.<p>
	 *
	 */
	public void ss_expns_nm(String value) {
		setConstString(offset + 54, $ss_expns_nm, value);
	}

	/**
	 * 有償差額費目名. Gain or loss of chargeable supply cost element name.<p>
	 *
	 */
	public String prov_expns_nm() {
		return getConstString(offset + 55, $prov_expns_nm);
	}

	/**
	 * 有償差額費目名. Gain or loss of chargeable supply cost element name.<p>
	 *
	 */
	public void prov_expns_nm(String value) {
		setConstString(offset + 55, $prov_expns_nm, value);
	}

	public String getString(String name) {
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			return dpt_typ();
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			return lot_typ();
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			return sublot_typ();
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			return sno1_typ();
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			return sno2_typ();
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			return sno3_typ();
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			return sno4_typ();
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			return lot_exp_typ();
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			return sublot_exp_typ();
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			return sno1_exp_typ();
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			return sno2_exp_typ();
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			return sno3_exp_typ();
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			return sno4_exp_typ();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			return wip_typ();
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			return bd_agg_typ();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			return exp_alloc_typ();
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
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			return calc_ptn_nm();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			return mrgn_expns_nm();
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			return purc_expns_nm();
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			return out_expns_nm();
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			return inpt_expns_nm();
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			return ss_expns_nm();
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			return prov_expns_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			return dpt_typ();
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			return lot_typ();
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			return sublot_typ();
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			return sno1_typ();
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			return sno2_typ();
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			return sno3_typ();
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			return sno4_typ();
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			return lot_exp_typ();
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			return sublot_exp_typ();
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			return sno1_exp_typ();
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			return sno2_exp_typ();
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			return sno3_exp_typ();
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			return sno4_exp_typ();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			return wip_typ();
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			return bd_agg_typ();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			return exp_alloc_typ();
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
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			return calc_ptn_nm();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			return mrgn_expns_nm();
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			return purc_expns_nm();
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			return out_expns_nm();
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			return inpt_expns_nm();
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			return ss_expns_nm();
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			return prov_expns_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			dpt_typ(value);
			return;
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			lot_typ(value);
			return;
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			sublot_typ(value);
			return;
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			sno1_typ(value);
			return;
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			sno2_typ(value);
			return;
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			sno3_typ(value);
			return;
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			sno4_typ(value);
			return;
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			lot_exp_typ(value);
			return;
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			sublot_exp_typ(value);
			return;
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			sno1_exp_typ(value);
			return;
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			sno2_exp_typ(value);
			return;
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			sno3_exp_typ(value);
			return;
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			sno4_exp_typ(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			wip_typ(value);
			return;
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			bd_agg_typ(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			exp_alloc_typ(value);
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
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			calc_ptn_nm(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			mrgn_expns_nm(value);
			return;
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			purc_expns_nm(value);
			return;
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			out_expns_nm(value);
			return;
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			inpt_expns_nm(value);
			return;
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			ss_expns_nm(value);
			return;
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			prov_expns_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			dpt_typ(value);
			return;
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			lot_typ(value);
			return;
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			sublot_typ(value);
			return;
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			sno1_typ(value);
			return;
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			sno2_typ(value);
			return;
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			sno3_typ(value);
			return;
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			sno4_typ(value);
			return;
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			lot_exp_typ(value);
			return;
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			sublot_exp_typ(value);
			return;
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			sno1_exp_typ(value);
			return;
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			sno2_exp_typ(value);
			return;
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			sno3_exp_typ(value);
			return;
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			sno4_exp_typ(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			wip_typ(value);
			return;
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			bd_agg_typ(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			exp_alloc_typ(value);
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
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			calc_ptn_nm(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			mrgn_expns_nm(value);
			return;
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			purc_expns_nm(value);
			return;
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			out_expns_nm(value);
			return;
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			inpt_expns_nm(value);
			return;
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			ss_expns_nm(value);
			return;
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			prov_expns_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
