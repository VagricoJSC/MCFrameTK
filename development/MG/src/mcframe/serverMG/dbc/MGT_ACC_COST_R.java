package mcframe.serverMG.dbc;

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
 * "原価展開情報（原価計算結果） // Cost explosion info. (Calculation result)"DBコンテナRowクラスです。<p>
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
 *  	<td>calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算ＮＯ</td>
 *  	<td>Calculation No.</td>
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
 *  	<td>K</td>
 *  	<td>inpt_rec_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入レコードＮＯ</td>
 *  	<td>Input record No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>wk_rec_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工数レコードＮＯ</td>
 *  	<td>Man-hour record No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>oper_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程実績ＮＯ</td>
 *  	<td>Operation result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>実際原価</td>
 *  	<td>Actual cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準原価</td>
 *  	<td>Standard cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sml_inpt_rec_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計用投入レコードＮＯ</td>
 *  	<td>Input record No. for aggregation</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>top_rec_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最上位レコードＮＯ</td>
 *  	<td>Top record No.</td>
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
 *  	<td>ラインＣＤ</td>
 *  	<td>Line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_cost_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程原価ＦＬＧ</td>
 *  	<td>Operation cost flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>expns_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>費目区分</td>
 *  	<td>Cost element type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量差異</td>
 *  	<td>Quantity variance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_wk</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数差異</td>
 *  	<td>Time variance</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_up</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>価格差異</td>
 *  	<td>Price variance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_rt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦率差異</td>
 *  	<td>Allocation rate variance</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_std</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準調整差異</td>
 *  	<td>Standard adjustment variance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_a</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異１</td>
 *  	<td>Variance 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_b</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異２</td>
 *  	<td>Variance 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_c</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異３</td>
 *  	<td>Variance 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_d</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異４</td>
 *  	<td>Variance 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_e</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異５</td>
 *  	<td>Variance 5</td>
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
public class MGT_ACC_COST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MGT_ACC_COST";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	private static final MCPermColumnInfo _calc_no = createColumnInfo("calc_no");
	public final MCStringPermColumn calc_no = createStringColumn(_calc_no);
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public static final String $inpt_rec_no = "inpt_rec_no";
	private static final MCPermColumnInfo _inpt_rec_no = createColumnInfo("inpt_rec_no");
	public final MCNumberPermColumn inpt_rec_no = createNumberColumn(_inpt_rec_no);
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public static final String $wk_rec_no = "wk_rec_no";
	private static final MCPermColumnInfo _wk_rec_no = createColumnInfo("wk_rec_no");
	public final MCNumberPermColumn wk_rec_no = createNumberColumn(_wk_rec_no);
	
	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	private static final MCPermColumnInfo _oper_act_no = createColumnInfo("oper_act_no");
	public final MCStringPermColumn oper_act_no = createStringColumn(_oper_act_no);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	private static final MCPermColumnInfo _oper_seq = createColumnInfo("oper_seq");
	public final MCNumberPermColumn oper_seq = createNumberColumn(_oper_seq);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public static final String $act_cost = "act_cost";
	private static final MCPermColumnInfo _act_cost = createColumnInfo("act_cost");
	public final MCNumberPermColumn act_cost = createNumberColumn(_act_cost);
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public static final String $std_cost = "std_cost";
	private static final MCPermColumnInfo _std_cost = createColumnInfo("std_cost");
	public final MCNumberPermColumn std_cost = createNumberColumn(_std_cost);
	
	/**
	 * 集計用投入レコードＮＯ. Input record No. for aggregation.<p>
	 *
	 */
	public static final String $sml_inpt_rec_no = "sml_inpt_rec_no";
	private static final MCPermColumnInfo _sml_inpt_rec_no = createColumnInfo("sml_inpt_rec_no");
	public final MCNumberPermColumn sml_inpt_rec_no = createNumberColumn(_sml_inpt_rec_no);
	
	/**
	 * 最上位レコードＮＯ. Top record No..<p>
	 *
	 */
	public static final String $top_rec_no = "top_rec_no";
	private static final MCPermColumnInfo _top_rec_no = createColumnInfo("top_rec_no");
	public final MCNumberPermColumn top_rec_no = createNumberColumn(_top_rec_no);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * ラインＣＤ. Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
	/**
	 * 工程原価ＦＬＧ. Operation cost flg..<p>
	 *
	 */
	public static final String $oper_cost_flg = "oper_cost_flg";
	private static final MCPermColumnInfo _oper_cost_flg = createColumnInfo("oper_cost_flg");
	public final MCBooleanPermColumn oper_cost_flg = createBooleanColumn(_oper_cost_flg);
	
	/**
	 * 費目区分. Cost element type.<p>
	 *
	 */
	public static final String $expns_typ = "expns_typ";
	private static final MCPermColumnInfo _expns_typ = createColumnInfo("expns_typ");
	public final MCStringPermColumn expns_typ = createStringColumn(_expns_typ);
	
	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public static final String $diff_qty = "diff_qty";
	private static final MCPermColumnInfo _diff_qty = createColumnInfo("diff_qty");
	public final MCNumberPermColumn diff_qty = createNumberColumn(_diff_qty);
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public static final String $diff_wk = "diff_wk";
	private static final MCPermColumnInfo _diff_wk = createColumnInfo("diff_wk");
	public final MCNumberPermColumn diff_wk = createNumberColumn(_diff_wk);
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public static final String $diff_up = "diff_up";
	private static final MCPermColumnInfo _diff_up = createColumnInfo("diff_up");
	public final MCNumberPermColumn diff_up = createNumberColumn(_diff_up);
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public static final String $diff_rt = "diff_rt";
	private static final MCPermColumnInfo _diff_rt = createColumnInfo("diff_rt");
	public final MCNumberPermColumn diff_rt = createNumberColumn(_diff_rt);
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public static final String $diff_std = "diff_std";
	private static final MCPermColumnInfo _diff_std = createColumnInfo("diff_std");
	public final MCNumberPermColumn diff_std = createNumberColumn(_diff_std);
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public static final String $diff_a = "diff_a";
	private static final MCPermColumnInfo _diff_a = createColumnInfo("diff_a");
	public final MCNumberPermColumn diff_a = createNumberColumn(_diff_a);
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public static final String $diff_b = "diff_b";
	private static final MCPermColumnInfo _diff_b = createColumnInfo("diff_b");
	public final MCNumberPermColumn diff_b = createNumberColumn(_diff_b);
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public static final String $diff_c = "diff_c";
	private static final MCPermColumnInfo _diff_c = createColumnInfo("diff_c");
	public final MCNumberPermColumn diff_c = createNumberColumn(_diff_c);
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public static final String $diff_d = "diff_d";
	private static final MCPermColumnInfo _diff_d = createColumnInfo("diff_d");
	public final MCNumberPermColumn diff_d = createNumberColumn(_diff_d);
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public static final String $diff_e = "diff_e";
	private static final MCPermColumnInfo _diff_e = createColumnInfo("diff_e");
	public final MCNumberPermColumn diff_e = createNumberColumn(_diff_e);
	
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
	
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta inpt_rec_no_META = createCommonMeta($inpt_rec_no, mcframe.commonMG.meta.MG_META.INPT_REC_NO);
	public static final MCMeta wk_rec_no_META = createCommonMeta($wk_rec_no, mcframe.commonMG.meta.MG_META.WK_REC_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta act_cost_META = createCommonMeta($act_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost_META = createCommonMeta($std_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sml_inpt_rec_no_META = createCommonMeta($sml_inpt_rec_no, mcframe.commonMG.meta.MG_META.INPT_REC_NO);
	public static final MCMeta top_rec_no_META = createCommonMeta($top_rec_no, mcframe.commonMG.meta.MG_META.TOP_REC_NO);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_cost_flg_META = createCommonMeta($oper_cost_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta expns_typ_META = createCommonMeta($expns_typ, mcframe.commonMA.meta.MA_META.EXPNS_TYP);
	public static final MCMeta diff_qty_META = createCommonMeta($diff_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_wk_META = createCommonMeta($diff_wk, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_up_META = createCommonMeta($diff_up, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_rt_META = createCommonMeta($diff_rt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_std_META = createCommonMeta($diff_std, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_a_META = createCommonMeta($diff_a, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_b_META = createCommonMeta($diff_b, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_c_META = createCommonMeta($diff_c, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_d_META = createCommonMeta($diff_d, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_e_META = createCommonMeta($diff_e, mcframe.commonMA.meta.MA_META.MONEY);
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
	public static final String $ACC_INPT1 = "ACC_INPT1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MGT_ACC_INPT",
				$ACC_INPT1,
				new String[][]{
						{"calc_no", "calc_no"},
						{"calc_grp_cd", "calc_grp_cd"},
						{"inpt_rec_no", "inpt_rec_no"}
				},
				() -> {
					return mcframe.serverMG.dbc.MGT_ACC_INPT_R.create("ACC_INPT1");
				},
				(alias) -> {
					MGT_ACC_COST_R own = MGT_ACC_COST_R.create(alias);
					mcframe.serverMG.dbc.MGT_ACC_INPT_R ref = mcframe.serverMG.dbc.MGT_ACC_INPT_R.create("ACC_INPT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.calc_no.eq(ref.calc_no));
					cond = cond.and(own.calc_grp_cd.eq(ref.calc_grp_cd));
					cond = cond.and(own.inpt_rec_no.eq(ref.inpt_rec_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MGT_ACC_COST_R> constMetas = new ConstMetaList<MGT_ACC_COST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_no_META,
			calc_grp_cd_META,
			inpt_rec_no_META,
			wk_rec_no_META,
			oper_act_no_META,
			oper_cd_META,
			oper_seq_META,
			expns_cd_META,
			act_cost_META,
			std_cost_META,
			sml_inpt_rec_no_META,
			top_rec_no_META,
			loc_cd_META,
			str_ln_cd_META,
			oper_cost_flg_META,
			expns_typ_META,
			diff_qty_META,
			diff_wk_META,
			diff_up_META,
			diff_rt_META,
			diff_std_META,
			diff_a_META,
			diff_b_META,
			diff_c_META,
			diff_d_META,
			diff_e_META,
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
	protected MGT_ACC_COST_R(ConstMetaList<? extends MGT_ACC_COST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGT_ACC_COST_R(ConstMetaList<? extends MGT_ACC_COST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$calc_no,
				"calc_no",
				calc_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$calc_grp_cd,
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
			MGT_ACC_COST_R.$inpt_rec_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$inpt_rec_no,
				"inpt_rec_no",
				inpt_rec_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$wk_rec_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$wk_rec_no,
				"wk_rec_no",
				wk_rec_no,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$oper_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$oper_act_no,
				"oper_act_no",
				oper_act_no,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$oper_cd,
				"oper_cd",
				oper_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$oper_seq,
				"oper_seq",
				oper_seq,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$expns_cd,
				"expns_cd",
				expns_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$act_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$act_cost,
				"act_cost",
				act_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$std_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$std_cost,
				"std_cost",
				std_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$sml_inpt_rec_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$sml_inpt_rec_no,
				"sml_inpt_rec_no",
				sml_inpt_rec_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$top_rec_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$top_rec_no,
				"top_rec_no",
				top_rec_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$loc_cd,
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
			MGT_ACC_COST_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$str_ln_cd,
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
			MGT_ACC_COST_R.$oper_cost_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGT_ACC_COST_R.$oper_cost_flg,
				"oper_cost_flg",
				oper_cost_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$expns_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$expns_typ,
				"expns_typ",
				expns_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$diff_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$diff_qty,
				"diff_qty",
				diff_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$diff_wk,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$diff_wk,
				"diff_wk",
				diff_wk,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$diff_up,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$diff_up,
				"diff_up",
				diff_up,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$diff_rt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$diff_rt,
				"diff_rt",
				diff_rt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$diff_std,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$diff_std,
				"diff_std",
				diff_std,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$diff_a,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$diff_a,
				"diff_a",
				diff_a,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$diff_b,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$diff_b,
				"diff_b",
				diff_b,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$diff_c,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$diff_c,
				"diff_c",
				diff_c,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$diff_d,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$diff_d,
				"diff_d",
				diff_d,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$diff_e,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$diff_e,
				"diff_e",
				diff_e,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACC_COST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$ins_usr_id,
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
			MGT_ACC_COST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$ins_usr_nm,
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
			MGT_ACC_COST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_ACC_COST_R.$ins_ts,
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
			MGT_ACC_COST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$ins_func_id,
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
			MGT_ACC_COST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACC_COST_R.$upd_cntr,
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
			MGT_ACC_COST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$upd_usr_id,
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
			MGT_ACC_COST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$upd_usr_nm,
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
			MGT_ACC_COST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_ACC_COST_R.$upd_ts,
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
			MGT_ACC_COST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$upd_func_id,
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
			MGT_ACC_COST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACC_COST_R.$upd_srv_req_no,
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
	public static MGT_ACC_COST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGT_ACC_COST_R create(String alias) {
		MGT_ACC_COST_R row = new MGT_ACC_COST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGT_ACC_COST_R createByName(T proto) {
		MGT_ACC_COST_R row = MGT_ACC_COST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_ACC_COST_R clone() {
		return (MGT_ACC_COST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_ACC_COST_R createInstance() {
		return (MGT_ACC_COST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_ACC_COST_R getValues(String... names) {
		return (MGT_ACC_COST_R) super.getValues(names);
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
	 public MGW_ACC_COST_KEY_R getPkWorkDbc(String alias) {
	 	return MGW_ACC_COST_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MGW_ACC_COST_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MGW_ACC_COST_KEY_R.TABLE_NAME);
	 }

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 0, $calc_no);
	}

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 0, $calc_no, value);
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
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public MCNumber inpt_rec_no() {
		return getConstNumber(offset + 2, $inpt_rec_no);
	}

	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(MCNumber value) {
		setConstNumber(offset + 2, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(int value) {
		setConstNumber(offset + 2, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(long value) {
		setConstNumber(offset + 2, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(float value) {
		setConstNumber(offset + 2, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(double value) {
		setConstNumber(offset + 2, $inpt_rec_no, value);
	}
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public MCNumber wk_rec_no() {
		return getConstNumber(offset + 3, $wk_rec_no);
	}

	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public void wk_rec_no(MCNumber value) {
		setConstNumber(offset + 3, $wk_rec_no, value);
	}
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public void wk_rec_no(int value) {
		setConstNumber(offset + 3, $wk_rec_no, value);
	}
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public void wk_rec_no(long value) {
		setConstNumber(offset + 3, $wk_rec_no, value);
	}
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public void wk_rec_no(float value) {
		setConstNumber(offset + 3, $wk_rec_no, value);
	}
	
	/**
	 * 工数レコードＮＯ. Man-hour record No..<p>
	 *
	 */
	public void wk_rec_no(double value) {
		setConstNumber(offset + 3, $wk_rec_no, value);
	}
	
	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 4, $oper_act_no);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 4, $oper_act_no, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 5, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 5, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 6, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 7, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 7, $expns_cd, value);
	}

	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public MCNumber act_cost() {
		return getConstNumber(offset + 8, $act_cost);
	}

	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(MCNumber value) {
		setConstNumber(offset + 8, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(int value) {
		setConstNumber(offset + 8, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(long value) {
		setConstNumber(offset + 8, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(float value) {
		setConstNumber(offset + 8, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(double value) {
		setConstNumber(offset + 8, $act_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public MCNumber std_cost() {
		return getConstNumber(offset + 9, $std_cost);
	}

	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(MCNumber value) {
		setConstNumber(offset + 9, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(int value) {
		setConstNumber(offset + 9, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(long value) {
		setConstNumber(offset + 9, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(float value) {
		setConstNumber(offset + 9, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(double value) {
		setConstNumber(offset + 9, $std_cost, value);
	}
	
	/**
	 * 集計用投入レコードＮＯ. Input record No. for aggregation.<p>
	 *
	 */
	public MCNumber sml_inpt_rec_no() {
		return getConstNumber(offset + 10, $sml_inpt_rec_no);
	}

	/**
	 * 集計用投入レコードＮＯ. Input record No. for aggregation.<p>
	 *
	 */
	public void sml_inpt_rec_no(MCNumber value) {
		setConstNumber(offset + 10, $sml_inpt_rec_no, value);
	}
	
	/**
	 * 集計用投入レコードＮＯ. Input record No. for aggregation.<p>
	 *
	 */
	public void sml_inpt_rec_no(int value) {
		setConstNumber(offset + 10, $sml_inpt_rec_no, value);
	}
	
	/**
	 * 集計用投入レコードＮＯ. Input record No. for aggregation.<p>
	 *
	 */
	public void sml_inpt_rec_no(long value) {
		setConstNumber(offset + 10, $sml_inpt_rec_no, value);
	}
	
	/**
	 * 集計用投入レコードＮＯ. Input record No. for aggregation.<p>
	 *
	 */
	public void sml_inpt_rec_no(float value) {
		setConstNumber(offset + 10, $sml_inpt_rec_no, value);
	}
	
	/**
	 * 集計用投入レコードＮＯ. Input record No. for aggregation.<p>
	 *
	 */
	public void sml_inpt_rec_no(double value) {
		setConstNumber(offset + 10, $sml_inpt_rec_no, value);
	}
	
	/**
	 * 最上位レコードＮＯ. Top record No..<p>
	 *
	 */
	public MCNumber top_rec_no() {
		return getConstNumber(offset + 11, $top_rec_no);
	}

	/**
	 * 最上位レコードＮＯ. Top record No..<p>
	 *
	 */
	public void top_rec_no(MCNumber value) {
		setConstNumber(offset + 11, $top_rec_no, value);
	}
	
	/**
	 * 最上位レコードＮＯ. Top record No..<p>
	 *
	 */
	public void top_rec_no(int value) {
		setConstNumber(offset + 11, $top_rec_no, value);
	}
	
	/**
	 * 最上位レコードＮＯ. Top record No..<p>
	 *
	 */
	public void top_rec_no(long value) {
		setConstNumber(offset + 11, $top_rec_no, value);
	}
	
	/**
	 * 最上位レコードＮＯ. Top record No..<p>
	 *
	 */
	public void top_rec_no(float value) {
		setConstNumber(offset + 11, $top_rec_no, value);
	}
	
	/**
	 * 最上位レコードＮＯ. Top record No..<p>
	 *
	 */
	public void top_rec_no(double value) {
		setConstNumber(offset + 11, $top_rec_no, value);
	}
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 12, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 12, $loc_cd, value);
	}

	/**
	 * ラインＣＤ. Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 13, $str_ln_cd);
	}

	/**
	 * ラインＣＤ. Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 13, $str_ln_cd, value);
	}

	/**
	 * 工程原価ＦＬＧ. Operation cost flg..<p>
	 *
	 */
	public boolean oper_cost_flg() {
		return getConstBoolean(offset + 14, $oper_cost_flg);
	}

	/**
	 * 工程原価ＦＬＧ. Operation cost flg..<p>
	 *
	 */
	public void oper_cost_flg(boolean value) {
		setConstBoolean(offset + 14, $oper_cost_flg, value);
	}

	/**
	 * 費目区分. Cost element type.<p>
	 *
	 */
	public String expns_typ() {
		return getConstString(offset + 15, $expns_typ);
	}

	/**
	 * 費目区分. Cost element type.<p>
	 *
	 */
	public void expns_typ(String value) {
		setConstString(offset + 15, $expns_typ, value);
	}

	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public MCNumber diff_qty() {
		return getConstNumber(offset + 16, $diff_qty);
	}

	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public void diff_qty(MCNumber value) {
		setConstNumber(offset + 16, $diff_qty, value);
	}
	
	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public void diff_qty(int value) {
		setConstNumber(offset + 16, $diff_qty, value);
	}
	
	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public void diff_qty(long value) {
		setConstNumber(offset + 16, $diff_qty, value);
	}
	
	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public void diff_qty(float value) {
		setConstNumber(offset + 16, $diff_qty, value);
	}
	
	/**
	 * 数量差異. Quantity variance.<p>
	 *
	 */
	public void diff_qty(double value) {
		setConstNumber(offset + 16, $diff_qty, value);
	}
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public MCNumber diff_wk() {
		return getConstNumber(offset + 17, $diff_wk);
	}

	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public void diff_wk(MCNumber value) {
		setConstNumber(offset + 17, $diff_wk, value);
	}
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public void diff_wk(int value) {
		setConstNumber(offset + 17, $diff_wk, value);
	}
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public void diff_wk(long value) {
		setConstNumber(offset + 17, $diff_wk, value);
	}
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public void diff_wk(float value) {
		setConstNumber(offset + 17, $diff_wk, value);
	}
	
	/**
	 * 工数差異. Time variance.<p>
	 *
	 */
	public void diff_wk(double value) {
		setConstNumber(offset + 17, $diff_wk, value);
	}
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public MCNumber diff_up() {
		return getConstNumber(offset + 18, $diff_up);
	}

	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public void diff_up(MCNumber value) {
		setConstNumber(offset + 18, $diff_up, value);
	}
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public void diff_up(int value) {
		setConstNumber(offset + 18, $diff_up, value);
	}
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public void diff_up(long value) {
		setConstNumber(offset + 18, $diff_up, value);
	}
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public void diff_up(float value) {
		setConstNumber(offset + 18, $diff_up, value);
	}
	
	/**
	 * 価格差異. Price variance.<p>
	 *
	 */
	public void diff_up(double value) {
		setConstNumber(offset + 18, $diff_up, value);
	}
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public MCNumber diff_rt() {
		return getConstNumber(offset + 19, $diff_rt);
	}

	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public void diff_rt(MCNumber value) {
		setConstNumber(offset + 19, $diff_rt, value);
	}
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public void diff_rt(int value) {
		setConstNumber(offset + 19, $diff_rt, value);
	}
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public void diff_rt(long value) {
		setConstNumber(offset + 19, $diff_rt, value);
	}
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public void diff_rt(float value) {
		setConstNumber(offset + 19, $diff_rt, value);
	}
	
	/**
	 * 配賦率差異. Allocation rate variance.<p>
	 *
	 */
	public void diff_rt(double value) {
		setConstNumber(offset + 19, $diff_rt, value);
	}
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public MCNumber diff_std() {
		return getConstNumber(offset + 20, $diff_std);
	}

	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public void diff_std(MCNumber value) {
		setConstNumber(offset + 20, $diff_std, value);
	}
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public void diff_std(int value) {
		setConstNumber(offset + 20, $diff_std, value);
	}
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public void diff_std(long value) {
		setConstNumber(offset + 20, $diff_std, value);
	}
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public void diff_std(float value) {
		setConstNumber(offset + 20, $diff_std, value);
	}
	
	/**
	 * 標準調整差異. Standard adjustment variance.<p>
	 *
	 */
	public void diff_std(double value) {
		setConstNumber(offset + 20, $diff_std, value);
	}
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public MCNumber diff_a() {
		return getConstNumber(offset + 21, $diff_a);
	}

	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public void diff_a(MCNumber value) {
		setConstNumber(offset + 21, $diff_a, value);
	}
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public void diff_a(int value) {
		setConstNumber(offset + 21, $diff_a, value);
	}
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public void diff_a(long value) {
		setConstNumber(offset + 21, $diff_a, value);
	}
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public void diff_a(float value) {
		setConstNumber(offset + 21, $diff_a, value);
	}
	
	/**
	 * 差異１. Variance 1.<p>
	 *
	 */
	public void diff_a(double value) {
		setConstNumber(offset + 21, $diff_a, value);
	}
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public MCNumber diff_b() {
		return getConstNumber(offset + 22, $diff_b);
	}

	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public void diff_b(MCNumber value) {
		setConstNumber(offset + 22, $diff_b, value);
	}
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public void diff_b(int value) {
		setConstNumber(offset + 22, $diff_b, value);
	}
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public void diff_b(long value) {
		setConstNumber(offset + 22, $diff_b, value);
	}
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public void diff_b(float value) {
		setConstNumber(offset + 22, $diff_b, value);
	}
	
	/**
	 * 差異２. Variance 2.<p>
	 *
	 */
	public void diff_b(double value) {
		setConstNumber(offset + 22, $diff_b, value);
	}
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public MCNumber diff_c() {
		return getConstNumber(offset + 23, $diff_c);
	}

	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public void diff_c(MCNumber value) {
		setConstNumber(offset + 23, $diff_c, value);
	}
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public void diff_c(int value) {
		setConstNumber(offset + 23, $diff_c, value);
	}
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public void diff_c(long value) {
		setConstNumber(offset + 23, $diff_c, value);
	}
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public void diff_c(float value) {
		setConstNumber(offset + 23, $diff_c, value);
	}
	
	/**
	 * 差異３. Variance 3.<p>
	 *
	 */
	public void diff_c(double value) {
		setConstNumber(offset + 23, $diff_c, value);
	}
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public MCNumber diff_d() {
		return getConstNumber(offset + 24, $diff_d);
	}

	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public void diff_d(MCNumber value) {
		setConstNumber(offset + 24, $diff_d, value);
	}
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public void diff_d(int value) {
		setConstNumber(offset + 24, $diff_d, value);
	}
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public void diff_d(long value) {
		setConstNumber(offset + 24, $diff_d, value);
	}
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public void diff_d(float value) {
		setConstNumber(offset + 24, $diff_d, value);
	}
	
	/**
	 * 差異４. Variance 4.<p>
	 *
	 */
	public void diff_d(double value) {
		setConstNumber(offset + 24, $diff_d, value);
	}
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public MCNumber diff_e() {
		return getConstNumber(offset + 25, $diff_e);
	}

	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public void diff_e(MCNumber value) {
		setConstNumber(offset + 25, $diff_e, value);
	}
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public void diff_e(int value) {
		setConstNumber(offset + 25, $diff_e, value);
	}
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public void diff_e(long value) {
		setConstNumber(offset + 25, $diff_e, value);
	}
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public void diff_e(float value) {
		setConstNumber(offset + 25, $diff_e, value);
	}
	
	/**
	 * 差異５. Variance 5.<p>
	 *
	 */
	public void diff_e(double value) {
		setConstNumber(offset + 25, $diff_e, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 26, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 26, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 27, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 27, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 28, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 28, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 29, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 29, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 30, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 30, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 30, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 30, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 30, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 30, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 31, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 31, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 32, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 32, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 33, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 33, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 34, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 34, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 35, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 35, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			return expns_typ();
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
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			return inpt_rec_no();
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			return wk_rec_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			return sml_inpt_rec_no();
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			return top_rec_no();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			return diff_wk();
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			return diff_up();
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			return diff_rt();
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			return diff_std();
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			return diff_a();
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			return diff_b();
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			return diff_c();
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			return diff_d();
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			return diff_e();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
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
		if ($oper_cost_flg.equalsIgnoreCase(name)) {
			return oper_cost_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			return expns_typ();
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
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			return inpt_rec_no();
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			return wk_rec_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			return sml_inpt_rec_no();
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			return top_rec_no();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			return diff_wk();
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			return diff_up();
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			return diff_rt();
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			return diff_std();
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			return diff_a();
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			return diff_b();
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			return diff_c();
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			return diff_d();
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			return diff_e();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
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
		if ($oper_cost_flg.equalsIgnoreCase(name)) {
			return oper_cost_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
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
		if ($expns_typ.equalsIgnoreCase(name)) {
			expns_typ(value);
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
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($oper_cost_flg.equalsIgnoreCase(name)) {
			oper_cost_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
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
		if ($expns_typ.equalsIgnoreCase(name)) {
			expns_typ(value);
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
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($wk_rec_no.equalsIgnoreCase(name)) {
			wk_rec_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_wk.equalsIgnoreCase(name)) {
			diff_wk(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($diff_rt.equalsIgnoreCase(name)) {
			diff_rt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_a.equalsIgnoreCase(name)) {
			diff_a(value);
			return;
		}
		if ($diff_b.equalsIgnoreCase(name)) {
			diff_b(value);
			return;
		}
		if ($diff_c.equalsIgnoreCase(name)) {
			diff_c(value);
			return;
		}
		if ($diff_d.equalsIgnoreCase(name)) {
			diff_d(value);
			return;
		}
		if ($diff_e.equalsIgnoreCase(name)) {
			diff_e(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($oper_cost_flg.equalsIgnoreCase(name)) {
			oper_cost_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
