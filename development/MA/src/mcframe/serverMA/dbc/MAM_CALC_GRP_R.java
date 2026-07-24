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
 * "計算グループマスタ // Calculation group master"DBコンテナRowクラスです。<p>
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
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループ名</td>
 *  	<td>Calculation group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_calc_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループ名（ベース）</td>
 *  	<td>Calculation group name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cost_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算区分</td>
 *  	<td>Cost calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>eval_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額評価区分</td>
 *  	<td>Amount evaluation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>max_mons</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最大計算月数</td>
 *  	<td>Max. calculation months</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_cnt</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算回数</td>
 *  	<td>Calculation count</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sa_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予実区分</td>
 *  	<td>Plan/Result type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>exp_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>展開計算区分</td>
 *  	<td>BOM explosion calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_alc_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>一次配賦計算区分</td>
 *  	<td>Departmental alloc. calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦率計算区分</td>
 *  	<td>Allocation rate calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入計算ＦＬＧ</td>
 *  	<td>Input calculation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wk_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数計算ＦＬＧ</td>
 *  	<td>Man-hour calculation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支給計算ＦＬＧ</td>
 *  	<td>Supply calculation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移動計算ＦＬＧ</td>
 *  	<td>Movement calculation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レートＣＤ</td>
 *  	<td>Exchange rate cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_seq_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算順序グループ</td>
 *  	<td>Calculation sequence group</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算順序</td>
 *  	<td>Calculation sequence</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>runtime_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実行時ワーキンググループＣＤ</td>
 *  	<td>Execution working group cd.</td>
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
 *  	<td>xrate_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>XRATE1.XRATE_NM</td>
 *  	<td>為替レート名</td>
 *  	<td>Exchange rate name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>runtime_wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>WG1.WG_NM</td>
 *  	<td>実行時ワーキンググループ名</td>
 *  	<td>Execution working group name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_CALC_GRP_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_CALC_GRP";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * 計算グループ名. Calculation group name.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	private static final MCPermColumnInfo _calc_grp_nm = createColumnInfo("calc_grp_nm");
	public final MCStringPermColumn calc_grp_nm = createStringColumn(_calc_grp_nm);
	
	/**
	 * 計算グループ名（ベース）. Calculation group name(Base).<p>
	 *
	 */
	public static final String $base_calc_grp_nm = "base_calc_grp_nm";
	private static final MCPermColumnInfo _base_calc_grp_nm = createColumnInfo("base_calc_grp_nm");
	public final MCStringPermColumn base_calc_grp_nm = createStringColumn(_base_calc_grp_nm);
	
	/**
	 * 計算区分. Cost calculation type.<p>
	 *
	 */
	public static final String $cost_calc_typ = "cost_calc_typ";
	private static final MCPermColumnInfo _cost_calc_typ = createColumnInfo("cost_calc_typ");
	public final MCStringPermColumn cost_calc_typ = createStringColumn(_cost_calc_typ);
	
	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public static final String $eval_typ = "eval_typ";
	private static final MCPermColumnInfo _eval_typ = createColumnInfo("eval_typ");
	public final MCStringPermColumn eval_typ = createStringColumn(_eval_typ);
	
	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public static final String $max_mons = "max_mons";
	private static final MCPermColumnInfo _max_mons = createColumnInfo("max_mons");
	public final MCNumberPermColumn max_mons = createNumberColumn(_max_mons);
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public static final String $calc_cnt = "calc_cnt";
	private static final MCPermColumnInfo _calc_cnt = createColumnInfo("calc_cnt");
	public final MCNumberPermColumn calc_cnt = createNumberColumn(_calc_cnt);
	
	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public static final String $sa_typ = "sa_typ";
	private static final MCPermColumnInfo _sa_typ = createColumnInfo("sa_typ");
	public final MCStringPermColumn sa_typ = createStringColumn(_sa_typ);
	
	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public static final String $exp_calc_typ = "exp_calc_typ";
	private static final MCPermColumnInfo _exp_calc_typ = createColumnInfo("exp_calc_typ");
	public final MCStringPermColumn exp_calc_typ = createStringColumn(_exp_calc_typ);
	
	/**
	 * 一次配賦計算区分. Departmental alloc. calculation type.<p>
	 *
	 */
	public static final String $pre_alc_calc_typ = "pre_alc_calc_typ";
	private static final MCPermColumnInfo _pre_alc_calc_typ = createColumnInfo("pre_alc_calc_typ");
	public final MCStringPermColumn pre_alc_calc_typ = createStringColumn(_pre_alc_calc_typ);
	
	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public static final String $alc_calc_typ = "alc_calc_typ";
	private static final MCPermColumnInfo _alc_calc_typ = createColumnInfo("alc_calc_typ");
	public final MCStringPermColumn alc_calc_typ = createStringColumn(_alc_calc_typ);
	
	/**
	 * 投入計算ＦＬＧ. Input calculation flg..<p>
	 *
	 */
	public static final String $inpt_calc_flg = "inpt_calc_flg";
	private static final MCPermColumnInfo _inpt_calc_flg = createColumnInfo("inpt_calc_flg");
	public final MCBooleanPermColumn inpt_calc_flg = createBooleanColumn(_inpt_calc_flg);
	
	/**
	 * 工数計算ＦＬＧ. Man-hour calculation flg..<p>
	 *
	 */
	public static final String $wk_calc_flg = "wk_calc_flg";
	private static final MCPermColumnInfo _wk_calc_flg = createColumnInfo("wk_calc_flg");
	public final MCBooleanPermColumn wk_calc_flg = createBooleanColumn(_wk_calc_flg);
	
	/**
	 * 支給計算ＦＬＧ. Supply calculation flg..<p>
	 *
	 */
	public static final String $prov_calc_flg = "prov_calc_flg";
	private static final MCPermColumnInfo _prov_calc_flg = createColumnInfo("prov_calc_flg");
	public final MCBooleanPermColumn prov_calc_flg = createBooleanColumn(_prov_calc_flg);
	
	/**
	 * 移動計算ＦＬＧ. Movement calculation flg..<p>
	 *
	 */
	public static final String $xfr_calc_flg = "xfr_calc_flg";
	private static final MCPermColumnInfo _xfr_calc_flg = createColumnInfo("xfr_calc_flg");
	public final MCBooleanPermColumn xfr_calc_flg = createBooleanColumn(_xfr_calc_flg);
	
	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	private static final MCPermColumnInfo _xrate_cd = createColumnInfo("xrate_cd");
	public final MCStringPermColumn xrate_cd = createStringColumn(_xrate_cd);
	
	/**
	 * 計算順序グループ. Calculation sequence group.<p>
	 *
	 */
	public static final String $calc_seq_grp = "calc_seq_grp";
	private static final MCPermColumnInfo _calc_seq_grp = createColumnInfo("calc_seq_grp");
	public final MCStringPermColumn calc_seq_grp = createStringColumn(_calc_seq_grp);
	
	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public static final String $calc_seq = "calc_seq";
	private static final MCPermColumnInfo _calc_seq = createColumnInfo("calc_seq");
	public final MCNumberPermColumn calc_seq = createNumberColumn(_calc_seq);
	
	/**
	 * 実行時ワーキンググループＣＤ. Execution working group cd..<p>
	 *
	 */
	public static final String $runtime_wg_cd = "runtime_wg_cd";
	private static final MCPermColumnInfo _runtime_wg_cd = createColumnInfo("runtime_wg_cd");
	public final MCStringPermColumn runtime_wg_cd = createStringColumn(_runtime_wg_cd);
	
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
	 * 為替レート名. Exchange rate name.<p>
	 *
	 */
	public static final String $xrate_nm = "xrate_nm";
	
	/**
	 * 実行時ワーキンググループ名. Execution working group name.<p>
	 *
	 */
	public static final String $runtime_wg_nm = "runtime_wg_nm";
	
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta base_calc_grp_nm_META = createCommonMeta($base_calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta cost_calc_typ_META = createCommonMeta($cost_calc_typ, mcframe.commonMA.meta.MA_META.COST_CALC_TYP);
	public static final MCMeta eval_typ_META = createCommonMeta($eval_typ, mcframe.commonMA.meta.MA_META.EVAL_TYP);
	public static final MCMeta max_mons_META = createCommonMeta($max_mons, mcframe.commonMA.meta.MA_META.MAX_MONS);
	public static final MCMeta calc_cnt_META = createCommonMeta($calc_cnt, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta sa_typ_META = createCommonMeta($sa_typ, mcframe.commonMA.meta.MA_META.SA_TYP);
	public static final MCMeta exp_calc_typ_META = createCommonMeta($exp_calc_typ, mcframe.commonMA.meta.MA_META.EXP_CALC_TYP);
	public static final MCMeta pre_alc_calc_typ_META = createCommonMeta($pre_alc_calc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_CALC_TYP);
	public static final MCMeta alc_calc_typ_META = createCommonMeta($alc_calc_typ, mcframe.commonMA.meta.MA_META.ALC_CALC_TYP);
	public static final MCMeta inpt_calc_flg_META = createCommonMeta($inpt_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_calc_flg_META = createCommonMeta($wk_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_calc_flg_META = createCommonMeta($prov_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_calc_flg_META = createCommonMeta($xfr_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta calc_seq_grp_META = createCommonMeta($calc_seq_grp, mcframe.commonMA.meta.MA_META.CALC_SEQ_GRP);
	public static final MCMeta calc_seq_META = createCommonMeta($calc_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta runtime_wg_cd_META = createCommonMeta($runtime_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
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
	public static final MCMeta xrate_nm_META = createCommonMeta($xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta runtime_wg_nm_META = createCommonMeta($runtime_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $XRATE1 = "XRATE1";
	public static final String $WG1 = "WG1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_XRATE",
				$XRATE1,
				new String[][]{
						{"xrate_cd", "xrate_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE1");
				},
				(alias) -> {
					MAM_CALC_GRP_R own = MAM_CALC_GRP_R.create(alias);
					mcframe.serverMA.dbc.MAM_XRATE_R ref = mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.xrate_cd.eq(ref.xrate_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_WG",
				$WG1,
				new String[][]{
						{"runtime_wg_cd", "wg_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
				},
				(alias) -> {
					MAM_CALC_GRP_R own = MAM_CALC_GRP_R.create(alias);
					mcframe.serverMA.dbc.MAM_WG_R ref = mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.runtime_wg_cd.eq(ref.wg_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_CALC_GRP_R> constMetas = new ConstMetaList<MAM_CALC_GRP_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_grp_nm_META,
			base_calc_grp_nm_META,
			cost_calc_typ_META,
			eval_typ_META,
			max_mons_META,
			calc_cnt_META,
			sa_typ_META,
			exp_calc_typ_META,
			pre_alc_calc_typ_META,
			alc_calc_typ_META,
			inpt_calc_flg_META,
			wk_calc_flg_META,
			prov_calc_flg_META,
			xfr_calc_flg_META,
			xrate_cd_META,
			calc_seq_grp_META,
			calc_seq_META,
			runtime_wg_cd_META,
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
			xrate_nm_META,
			runtime_wg_nm_META
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
	protected MAM_CALC_GRP_R(ConstMetaList<? extends MAM_CALC_GRP_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_CALC_GRP_R(ConstMetaList<? extends MAM_CALC_GRP_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$calc_grp_cd,
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
			MAM_CALC_GRP_R.$calc_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$calc_grp_nm,
				"calc_grp_nm",
				calc_grp_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$base_calc_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$base_calc_grp_nm,
				"base_calc_grp_nm",
				base_calc_grp_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$cost_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$cost_calc_typ,
				"cost_calc_typ",
				cost_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$eval_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$eval_typ,
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
			MAM_CALC_GRP_R.$max_mons,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CALC_GRP_R.$max_mons,
				"max_mons",
				max_mons,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$calc_cnt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CALC_GRP_R.$calc_cnt,
				"calc_cnt",
				calc_cnt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$sa_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$sa_typ,
				"sa_typ",
				sa_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$exp_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$exp_calc_typ,
				"exp_calc_typ",
				exp_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$pre_alc_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$pre_alc_calc_typ,
				"pre_alc_calc_typ",
				pre_alc_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$alc_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$alc_calc_typ,
				"alc_calc_typ",
				alc_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$inpt_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CALC_GRP_R.$inpt_calc_flg,
				"inpt_calc_flg",
				inpt_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$wk_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CALC_GRP_R.$wk_calc_flg,
				"wk_calc_flg",
				wk_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$prov_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CALC_GRP_R.$prov_calc_flg,
				"prov_calc_flg",
				prov_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$xfr_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CALC_GRP_R.$xfr_calc_flg,
				"xfr_calc_flg",
				xfr_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$xrate_cd,
				"xrate_cd",
				xrate_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$calc_seq_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$calc_seq_grp,
				"calc_seq_grp",
				calc_seq_grp,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$calc_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CALC_GRP_R.$calc_seq,
				"calc_seq",
				calc_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$runtime_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$runtime_wg_cd,
				"runtime_wg_cd",
				runtime_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$memo1,
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
			MAM_CALC_GRP_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$memo2,
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
			MAM_CALC_GRP_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$memo3,
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
			MAM_CALC_GRP_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CALC_GRP_R.$del_flg,
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
			MAM_CALC_GRP_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$del_usr_id,
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
			MAM_CALC_GRP_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$del_usr_nm,
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
			MAM_CALC_GRP_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_CALC_GRP_R.$del_ts,
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
			MAM_CALC_GRP_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$ins_usr_id,
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
			MAM_CALC_GRP_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$ins_usr_nm,
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
			MAM_CALC_GRP_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_CALC_GRP_R.$ins_ts,
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
			MAM_CALC_GRP_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$ins_func_id,
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
			MAM_CALC_GRP_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CALC_GRP_R.$upd_cntr,
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
			MAM_CALC_GRP_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$upd_usr_id,
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
			MAM_CALC_GRP_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$upd_usr_nm,
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
			MAM_CALC_GRP_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_CALC_GRP_R.$upd_ts,
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
			MAM_CALC_GRP_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$upd_func_id,
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
			MAM_CALC_GRP_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$upd_srv_req_no,
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
			MAM_CALC_GRP_R.$xrate_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$xrate_nm,
				"xrate_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"XRATE1.XRATE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CALC_GRP_R.$runtime_wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CALC_GRP_R.$runtime_wg_nm,
				"runtime_wg_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"WG1.WG_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_CALC_GRP_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_CALC_GRP_R create(String alias) {
		MAM_CALC_GRP_R row = new MAM_CALC_GRP_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_CALC_GRP_R createByName(T proto) {
		MAM_CALC_GRP_R row = MAM_CALC_GRP_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CALC_GRP_R clone() {
		return (MAM_CALC_GRP_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CALC_GRP_R createInstance() {
		return (MAM_CALC_GRP_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CALC_GRP_R getValues(String... names) {
		return (MAM_CALC_GRP_R) super.getValues(names);
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
		return true;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_CALC_GRP_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_CALC_GRP_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_CALC_GRP_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_CALC_GRP_KEY_R.TABLE_NAME);
	 }

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}

	/**
	 * 計算グループ名. Calculation group name.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 1, $calc_grp_nm);
	}

	/**
	 * 計算グループ名. Calculation group name.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 1, $calc_grp_nm, value);
	}

	/**
	 * 計算グループ名（ベース）. Calculation group name(Base).<p>
	 *
	 */
	public String base_calc_grp_nm() {
		return getConstString(offset + 2, $base_calc_grp_nm);
	}

	/**
	 * 計算グループ名（ベース）. Calculation group name(Base).<p>
	 *
	 */
	public void base_calc_grp_nm(String value) {
		setConstString(offset + 2, $base_calc_grp_nm, value);
	}

	/**
	 * 計算区分. Cost calculation type.<p>
	 *
	 */
	public String cost_calc_typ() {
		return getConstString(offset + 3, $cost_calc_typ);
	}

	/**
	 * 計算区分. Cost calculation type.<p>
	 *
	 */
	public void cost_calc_typ(String value) {
		setConstString(offset + 3, $cost_calc_typ, value);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public String eval_typ() {
		return getConstString(offset + 4, $eval_typ);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public void eval_typ(String value) {
		setConstString(offset + 4, $eval_typ, value);
	}

	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public MCNumber max_mons() {
		return getConstNumber(offset + 5, $max_mons);
	}

	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public void max_mons(MCNumber value) {
		setConstNumber(offset + 5, $max_mons, value);
	}
	
	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public void max_mons(int value) {
		setConstNumber(offset + 5, $max_mons, value);
	}
	
	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public void max_mons(long value) {
		setConstNumber(offset + 5, $max_mons, value);
	}
	
	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public void max_mons(float value) {
		setConstNumber(offset + 5, $max_mons, value);
	}
	
	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public void max_mons(double value) {
		setConstNumber(offset + 5, $max_mons, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public MCNumber calc_cnt() {
		return getConstNumber(offset + 6, $calc_cnt);
	}

	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(MCNumber value) {
		setConstNumber(offset + 6, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(int value) {
		setConstNumber(offset + 6, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(long value) {
		setConstNumber(offset + 6, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(float value) {
		setConstNumber(offset + 6, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(double value) {
		setConstNumber(offset + 6, $calc_cnt, value);
	}
	
	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public String sa_typ() {
		return getConstString(offset + 7, $sa_typ);
	}

	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public void sa_typ(String value) {
		setConstString(offset + 7, $sa_typ, value);
	}

	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public String exp_calc_typ() {
		return getConstString(offset + 8, $exp_calc_typ);
	}

	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public void exp_calc_typ(String value) {
		setConstString(offset + 8, $exp_calc_typ, value);
	}

	/**
	 * 一次配賦計算区分. Departmental alloc. calculation type.<p>
	 *
	 */
	public String pre_alc_calc_typ() {
		return getConstString(offset + 9, $pre_alc_calc_typ);
	}

	/**
	 * 一次配賦計算区分. Departmental alloc. calculation type.<p>
	 *
	 */
	public void pre_alc_calc_typ(String value) {
		setConstString(offset + 9, $pre_alc_calc_typ, value);
	}

	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public String alc_calc_typ() {
		return getConstString(offset + 10, $alc_calc_typ);
	}

	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public void alc_calc_typ(String value) {
		setConstString(offset + 10, $alc_calc_typ, value);
	}

	/**
	 * 投入計算ＦＬＧ. Input calculation flg..<p>
	 *
	 */
	public boolean inpt_calc_flg() {
		return getConstBoolean(offset + 11, $inpt_calc_flg);
	}

	/**
	 * 投入計算ＦＬＧ. Input calculation flg..<p>
	 *
	 */
	public void inpt_calc_flg(boolean value) {
		setConstBoolean(offset + 11, $inpt_calc_flg, value);
	}

	/**
	 * 工数計算ＦＬＧ. Man-hour calculation flg..<p>
	 *
	 */
	public boolean wk_calc_flg() {
		return getConstBoolean(offset + 12, $wk_calc_flg);
	}

	/**
	 * 工数計算ＦＬＧ. Man-hour calculation flg..<p>
	 *
	 */
	public void wk_calc_flg(boolean value) {
		setConstBoolean(offset + 12, $wk_calc_flg, value);
	}

	/**
	 * 支給計算ＦＬＧ. Supply calculation flg..<p>
	 *
	 */
	public boolean prov_calc_flg() {
		return getConstBoolean(offset + 13, $prov_calc_flg);
	}

	/**
	 * 支給計算ＦＬＧ. Supply calculation flg..<p>
	 *
	 */
	public void prov_calc_flg(boolean value) {
		setConstBoolean(offset + 13, $prov_calc_flg, value);
	}

	/**
	 * 移動計算ＦＬＧ. Movement calculation flg..<p>
	 *
	 */
	public boolean xfr_calc_flg() {
		return getConstBoolean(offset + 14, $xfr_calc_flg);
	}

	/**
	 * 移動計算ＦＬＧ. Movement calculation flg..<p>
	 *
	 */
	public void xfr_calc_flg(boolean value) {
		setConstBoolean(offset + 14, $xfr_calc_flg, value);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 15, $xrate_cd);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 15, $xrate_cd, value);
	}

	/**
	 * 計算順序グループ. Calculation sequence group.<p>
	 *
	 */
	public String calc_seq_grp() {
		return getConstString(offset + 16, $calc_seq_grp);
	}

	/**
	 * 計算順序グループ. Calculation sequence group.<p>
	 *
	 */
	public void calc_seq_grp(String value) {
		setConstString(offset + 16, $calc_seq_grp, value);
	}

	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public MCNumber calc_seq() {
		return getConstNumber(offset + 17, $calc_seq);
	}

	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public void calc_seq(MCNumber value) {
		setConstNumber(offset + 17, $calc_seq, value);
	}
	
	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public void calc_seq(int value) {
		setConstNumber(offset + 17, $calc_seq, value);
	}
	
	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public void calc_seq(long value) {
		setConstNumber(offset + 17, $calc_seq, value);
	}
	
	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public void calc_seq(float value) {
		setConstNumber(offset + 17, $calc_seq, value);
	}
	
	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public void calc_seq(double value) {
		setConstNumber(offset + 17, $calc_seq, value);
	}
	
	/**
	 * 実行時ワーキンググループＣＤ. Execution working group cd..<p>
	 *
	 */
	public String runtime_wg_cd() {
		return getConstString(offset + 18, $runtime_wg_cd);
	}

	/**
	 * 実行時ワーキンググループＣＤ. Execution working group cd..<p>
	 *
	 */
	public void runtime_wg_cd(String value) {
		setConstString(offset + 18, $runtime_wg_cd, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 19, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 19, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 20, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 20, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 21, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 21, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 22, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 22, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 23, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 23, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 24, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 24, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 25, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $del_ts, value);
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

	/**
	 * 為替レート名. Exchange rate name.<p>
	 *
	 */
	public String xrate_nm() {
		return getConstString(offset + 36, $xrate_nm);
	}

	/**
	 * 為替レート名. Exchange rate name.<p>
	 *
	 */
	public void xrate_nm(String value) {
		setConstString(offset + 36, $xrate_nm, value);
	}

	/**
	 * 実行時ワーキンググループ名. Execution working group name.<p>
	 *
	 */
	public String runtime_wg_nm() {
		return getConstString(offset + 37, $runtime_wg_nm);
	}

	/**
	 * 実行時ワーキンググループ名. Execution working group name.<p>
	 *
	 */
	public void runtime_wg_nm(String value) {
		setConstString(offset + 37, $runtime_wg_nm, value);
	}

	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($base_calc_grp_nm.equalsIgnoreCase(name)) {
			return base_calc_grp_nm();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			return exp_calc_typ();
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			return pre_alc_calc_typ();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			return calc_seq_grp();
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			return runtime_wg_cd();
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
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($runtime_wg_nm.equalsIgnoreCase(name)) {
			return runtime_wg_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			return calc_cnt();
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			return calc_seq();
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
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			return inpt_calc_flg();
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			return wk_calc_flg();
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			return prov_calc_flg();
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			return xfr_calc_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($base_calc_grp_nm.equalsIgnoreCase(name)) {
			return base_calc_grp_nm();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			return exp_calc_typ();
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			return pre_alc_calc_typ();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			return calc_seq_grp();
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			return runtime_wg_cd();
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
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($runtime_wg_nm.equalsIgnoreCase(name)) {
			return runtime_wg_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			return calc_cnt();
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			return calc_seq();
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
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			return inpt_calc_flg();
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			return wk_calc_flg();
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			return prov_calc_flg();
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			return xfr_calc_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($base_calc_grp_nm.equalsIgnoreCase(name)) {
			base_calc_grp_nm(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			exp_calc_typ(value);
			return;
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			pre_alc_calc_typ(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			calc_seq_grp(value);
			return;
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			runtime_wg_cd(value);
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
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($runtime_wg_nm.equalsIgnoreCase(name)) {
			runtime_wg_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
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
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			inpt_calc_flg(value);
			return;
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			wk_calc_flg(value);
			return;
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			prov_calc_flg(value);
			return;
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			xfr_calc_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($base_calc_grp_nm.equalsIgnoreCase(name)) {
			base_calc_grp_nm(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			exp_calc_typ(value);
			return;
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			pre_alc_calc_typ(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			calc_seq_grp(value);
			return;
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			runtime_wg_cd(value);
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
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($runtime_wg_nm.equalsIgnoreCase(name)) {
			runtime_wg_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
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
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			inpt_calc_flg(value);
			return;
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			wk_calc_flg(value);
			return;
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			prov_calc_flg(value);
			return;
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			xfr_calc_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
