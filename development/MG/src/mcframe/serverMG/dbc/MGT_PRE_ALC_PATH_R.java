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
 * "一次配賦計算過程 // Departmental alloc. calculation process"DBコンテナRowクラスです。<p>
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
 *  	<td>pre_alc_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>連番</td>
 *  	<td>Sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>年月</td>
 *  	<td>Year month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入力費用区分</td>
 *  	<td>Input expense type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_ac_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦科目ＣＤ</td>
 *  	<td>Allocation account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
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
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ctg_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品群ＣＤ</td>
 *  	<td>Item category cd.</td>
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
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
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
 *  	<td>slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注ＮＯ</td>
 *  	<td>Sales order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額</td>
 *  	<td>Amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_alc_rate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦対象</td>
 *  	<td>Allocation target</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_alc_total</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦対象合計</td>
 *  	<td>Allocation target total</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_alc_calc_rate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦率</td>
 *  	<td>Allocation rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_alc_rate_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>一次配賦基準ＣＤ</td>
 *  	<td>Departmental alloc. basis cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦元ワーキンググループＣＤ</td>
 *  	<td>Allocation source WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_pre_alc_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦元連番</td>
 *  	<td>Allocation source sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>top_pre_alc_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最上位連番</td>
 *  	<td>Top sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_alc_lvl</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦レベル</td>
 *  	<td>Allocation level</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fin_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>終了ＦＬＧ</td>
 *  	<td>Terminate flg.</td>
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
public class MGT_PRE_ALC_PATH_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MGT_PRE_ALC_PATH";

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
	 * 連番. Sequence number.<p>
	 *
	 */
	public static final String $pre_alc_seq = "pre_alc_seq";
	private static final MCPermColumnInfo _pre_alc_seq = createColumnInfo("pre_alc_seq");
	public final MCNumberPermColumn pre_alc_seq = createNumberColumn(_pre_alc_seq);
	
	/**
	 * 年月. Year month.<p>
	 *
	 */
	public static final String $ym = "ym";
	private static final MCPermColumnInfo _ym = createColumnInfo("ym");
	public final MCDatePermColumn ym = createDateColumn(_ym);
	
	/**
	 * 入力費用区分. Input expense type.<p>
	 *
	 */
	public static final String $inpt_alc_typ = "inpt_alc_typ";
	private static final MCPermColumnInfo _inpt_alc_typ = createColumnInfo("inpt_alc_typ");
	public final MCStringPermColumn inpt_alc_typ = createStringColumn(_inpt_alc_typ);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	private static final MCPermColumnInfo _alc_ac_cd = createColumnInfo("alc_ac_cd");
	public final MCStringPermColumn alc_ac_cd = createStringColumn(_alc_ac_cd);
	
	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 品群ＣＤ. Item category cd..<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	private static final MCPermColumnInfo _ctg_cd = createColumnInfo("ctg_cd");
	public final MCStringPermColumn ctg_cd = createStringColumn(_ctg_cd);
	
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
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public static final String $po_no = "po_no";
	private static final MCPermColumnInfo _po_no = createColumnInfo("po_no");
	public final MCStringPermColumn po_no = createStringColumn(_po_no);
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	private static final MCPermColumnInfo _slo_no = createColumnInfo("slo_no");
	public final MCStringPermColumn slo_no = createStringColumn(_slo_no);
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public static final String $amt = "amt";
	private static final MCPermColumnInfo _amt = createColumnInfo("amt");
	public final MCNumberPermColumn amt = createNumberColumn(_amt);
	
	/**
	 * 配賦対象. Allocation target.<p>
	 *
	 */
	public static final String $pre_alc_rate = "pre_alc_rate";
	private static final MCPermColumnInfo _pre_alc_rate = createColumnInfo("pre_alc_rate");
	public final MCNumberPermColumn pre_alc_rate = createNumberColumn(_pre_alc_rate);
	
	/**
	 * 配賦対象合計. Allocation target total.<p>
	 *
	 */
	public static final String $pre_alc_total = "pre_alc_total";
	private static final MCPermColumnInfo _pre_alc_total = createColumnInfo("pre_alc_total");
	public final MCNumberPermColumn pre_alc_total = createNumberColumn(_pre_alc_total);
	
	/**
	 * 配賦率. Allocation rate.<p>
	 *
	 */
	public static final String $pre_alc_calc_rate = "pre_alc_calc_rate";
	private static final MCPermColumnInfo _pre_alc_calc_rate = createColumnInfo("pre_alc_calc_rate");
	public final MCNumberPermColumn pre_alc_calc_rate = createNumberColumn(_pre_alc_calc_rate);
	
	/**
	 * 一次配賦基準ＣＤ. Departmental alloc. basis cd..<p>
	 *
	 */
	public static final String $pre_alc_rate_cd = "pre_alc_rate_cd";
	private static final MCPermColumnInfo _pre_alc_rate_cd = createColumnInfo("pre_alc_rate_cd");
	public final MCStringPermColumn pre_alc_rate_cd = createStringColumn(_pre_alc_rate_cd);
	
	/**
	 * 配賦元ワーキンググループＣＤ. Allocation source WG cd..<p>
	 *
	 */
	public static final String $src_wg_cd = "src_wg_cd";
	private static final MCPermColumnInfo _src_wg_cd = createColumnInfo("src_wg_cd");
	public final MCStringPermColumn src_wg_cd = createStringColumn(_src_wg_cd);
	
	/**
	 * 配賦元連番. Allocation source sequence number.<p>
	 *
	 */
	public static final String $src_pre_alc_seq = "src_pre_alc_seq";
	private static final MCPermColumnInfo _src_pre_alc_seq = createColumnInfo("src_pre_alc_seq");
	public final MCNumberPermColumn src_pre_alc_seq = createNumberColumn(_src_pre_alc_seq);
	
	/**
	 * 最上位連番. Top sequence number.<p>
	 *
	 */
	public static final String $top_pre_alc_seq = "top_pre_alc_seq";
	private static final MCPermColumnInfo _top_pre_alc_seq = createColumnInfo("top_pre_alc_seq");
	public final MCNumberPermColumn top_pre_alc_seq = createNumberColumn(_top_pre_alc_seq);
	
	/**
	 * 配賦レベル. Allocation level.<p>
	 *
	 */
	public static final String $pre_alc_lvl = "pre_alc_lvl";
	private static final MCPermColumnInfo _pre_alc_lvl = createColumnInfo("pre_alc_lvl");
	public final MCNumberPermColumn pre_alc_lvl = createNumberColumn(_pre_alc_lvl);
	
	/**
	 * 終了ＦＬＧ. Terminate flg..<p>
	 *
	 */
	public static final String $fin_flg = "fin_flg";
	private static final MCPermColumnInfo _fin_flg = createColumnInfo("fin_flg");
	public final MCBooleanPermColumn fin_flg = createBooleanColumn(_fin_flg);
	
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
	public static final MCMeta pre_alc_seq_META = createCommonMeta($pre_alc_seq, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_REC);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta inpt_alc_typ_META = createCommonMeta($inpt_alc_typ, mcframe.commonMG.meta.MG_META.INPT_ALC_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pre_alc_rate_META = createCommonMeta($pre_alc_rate, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pre_alc_total_META = createCommonMeta($pre_alc_total, mcframe.commonMG.meta.MG_META.PRE_ALC_TOTAL);
	public static final MCMeta pre_alc_calc_rate_META = createCommonMeta($pre_alc_calc_rate, mcframe.commonMG.meta.MG_META.PRE_ALC_CALC_RATE);
	public static final MCMeta pre_alc_rate_cd_META = createCommonMeta($pre_alc_rate_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_CD);
	public static final MCMeta src_wg_cd_META = createCommonMeta($src_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta src_pre_alc_seq_META = createCommonMeta($src_pre_alc_seq, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_REC);
	public static final MCMeta top_pre_alc_seq_META = createCommonMeta($top_pre_alc_seq, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_REC);
	public static final MCMeta pre_alc_lvl_META = createCommonMeta($pre_alc_lvl, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_LVL);
	public static final MCMeta fin_flg_META = createCommonMeta($fin_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final String $ARG1 = "ARG1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MGT_ARG",
				$ARG1,
				new String[][]{
						{"calc_no", "calc_no"},
						{"calc_grp_cd", "calc_grp_cd"}
				},
				() -> {
					return mcframe.serverMG.dbc.MGT_ARG_R.create("ARG1");
				},
				(alias) -> {
					MGT_PRE_ALC_PATH_R own = MGT_PRE_ALC_PATH_R.create(alias);
					mcframe.serverMG.dbc.MGT_ARG_R ref = mcframe.serverMG.dbc.MGT_ARG_R.create("ARG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.calc_no.eq(ref.calc_no));
					cond = cond.and(own.calc_grp_cd.eq(ref.calc_grp_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MGT_PRE_ALC_PATH_R> constMetas = new ConstMetaList<MGT_PRE_ALC_PATH_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_no_META,
			calc_grp_cd_META,
			pre_alc_seq_META,
			ym_META,
			inpt_alc_typ_META,
			wg_cd_META,
			alc_ac_cd_META,
			dpt_cd_META,
			loc_cd_META,
			oper_cd_META,
			bp_cd_META,
			ctg_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			itm_mfg_inst_no_META,
			iv_no_META,
			po_no_META,
			slo_no_META,
			amt_META,
			pre_alc_rate_META,
			pre_alc_total_META,
			pre_alc_calc_rate_META,
			pre_alc_rate_cd_META,
			src_wg_cd_META,
			src_pre_alc_seq_META,
			top_pre_alc_seq_META,
			pre_alc_lvl_META,
			fin_flg_META,
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
	protected MGT_PRE_ALC_PATH_R(ConstMetaList<? extends MGT_PRE_ALC_PATH_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGT_PRE_ALC_PATH_R(ConstMetaList<? extends MGT_PRE_ALC_PATH_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$calc_no,
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
			MGT_PRE_ALC_PATH_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$calc_grp_cd,
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
			MGT_PRE_ALC_PATH_R.$pre_alc_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_PRE_ALC_PATH_R.$pre_alc_seq,
				"pre_alc_seq",
				pre_alc_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_PRE_ALC_PATH_R.$ym,
				"ym",
				ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$inpt_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$inpt_alc_typ,
				"inpt_alc_typ",
				inpt_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$alc_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$alc_ac_cd,
				"alc_ac_cd",
				alc_ac_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$dpt_cd,
				"dpt_cd",
				dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$loc_cd,
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
			MGT_PRE_ALC_PATH_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$oper_cd,
				"oper_cd",
				oper_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$bp_cd,
				"bp_cd",
				bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$ctg_cd,
				"ctg_cd",
				ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$itm_cd,
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
			MGT_PRE_ALC_PATH_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$itm_sub1,
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
			MGT_PRE_ALC_PATH_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$itm_sub2,
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
			MGT_PRE_ALC_PATH_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$itm_sub3,
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
			MGT_PRE_ALC_PATH_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$lot_no,
				"lot_no",
				lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$sublot_no,
				"sublot_no",
				sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$sno1,
				"sno1",
				sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$sno2,
				"sno2",
				sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$sno3,
				"sno3",
				sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$sno4,
				"sno4",
				sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$itm_mfg_inst_no,
				"itm_mfg_inst_no",
				itm_mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$iv_no,
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
			MGT_PRE_ALC_PATH_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$po_no,
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
			MGT_PRE_ALC_PATH_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$slo_no,
				"slo_no",
				slo_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_PRE_ALC_PATH_R.$amt,
				"amt",
				amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$pre_alc_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_PRE_ALC_PATH_R.$pre_alc_rate,
				"pre_alc_rate",
				pre_alc_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$pre_alc_total,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_PRE_ALC_PATH_R.$pre_alc_total,
				"pre_alc_total",
				pre_alc_total,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$pre_alc_calc_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_PRE_ALC_PATH_R.$pre_alc_calc_rate,
				"pre_alc_calc_rate",
				pre_alc_calc_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$pre_alc_rate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$pre_alc_rate_cd,
				"pre_alc_rate_cd",
				pre_alc_rate_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$src_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$src_wg_cd,
				"src_wg_cd",
				src_wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$src_pre_alc_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_PRE_ALC_PATH_R.$src_pre_alc_seq,
				"src_pre_alc_seq",
				src_pre_alc_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$top_pre_alc_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_PRE_ALC_PATH_R.$top_pre_alc_seq,
				"top_pre_alc_seq",
				top_pre_alc_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$pre_alc_lvl,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_PRE_ALC_PATH_R.$pre_alc_lvl,
				"pre_alc_lvl",
				pre_alc_lvl,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$fin_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGT_PRE_ALC_PATH_R.$fin_flg,
				"fin_flg",
				fin_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_PRE_ALC_PATH_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$ins_usr_id,
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
			MGT_PRE_ALC_PATH_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$ins_usr_nm,
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
			MGT_PRE_ALC_PATH_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_PRE_ALC_PATH_R.$ins_ts,
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
			MGT_PRE_ALC_PATH_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$ins_func_id,
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
			MGT_PRE_ALC_PATH_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_PRE_ALC_PATH_R.$upd_cntr,
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
			MGT_PRE_ALC_PATH_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$upd_usr_id,
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
			MGT_PRE_ALC_PATH_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$upd_usr_nm,
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
			MGT_PRE_ALC_PATH_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_PRE_ALC_PATH_R.$upd_ts,
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
			MGT_PRE_ALC_PATH_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$upd_func_id,
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
			MGT_PRE_ALC_PATH_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_PRE_ALC_PATH_R.$upd_srv_req_no,
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
	public static MGT_PRE_ALC_PATH_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGT_PRE_ALC_PATH_R create(String alias) {
		MGT_PRE_ALC_PATH_R row = new MGT_PRE_ALC_PATH_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGT_PRE_ALC_PATH_R createByName(T proto) {
		MGT_PRE_ALC_PATH_R row = MGT_PRE_ALC_PATH_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_PRE_ALC_PATH_R clone() {
		return (MGT_PRE_ALC_PATH_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_PRE_ALC_PATH_R createInstance() {
		return (MGT_PRE_ALC_PATH_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_PRE_ALC_PATH_R getValues(String... names) {
		return (MGT_PRE_ALC_PATH_R) super.getValues(names);
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
	 public MGW_PRE_ALC_PATH_KEY_R getPkWorkDbc(String alias) {
	 	return MGW_PRE_ALC_PATH_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MGW_PRE_ALC_PATH_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MGW_PRE_ALC_PATH_KEY_R.TABLE_NAME);
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
	 * 連番. Sequence number.<p>
	 *
	 */
	public MCNumber pre_alc_seq() {
		return getConstNumber(offset + 2, $pre_alc_seq);
	}

	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void pre_alc_seq(MCNumber value) {
		setConstNumber(offset + 2, $pre_alc_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void pre_alc_seq(int value) {
		setConstNumber(offset + 2, $pre_alc_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void pre_alc_seq(long value) {
		setConstNumber(offset + 2, $pre_alc_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void pre_alc_seq(float value) {
		setConstNumber(offset + 2, $pre_alc_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void pre_alc_seq(double value) {
		setConstNumber(offset + 2, $pre_alc_seq, value);
	}
	
	/**
	 * 年月. Year month.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 3, $ym);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 3, $ym, value);
	}

	/**
	 * 入力費用区分. Input expense type.<p>
	 *
	 */
	public String inpt_alc_typ() {
		return getConstString(offset + 4, $inpt_alc_typ);
	}

	/**
	 * 入力費用区分. Input expense type.<p>
	 *
	 */
	public void inpt_alc_typ(String value) {
		setConstString(offset + 4, $inpt_alc_typ, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}

	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 6, $alc_ac_cd);
	}

	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 6, $alc_ac_cd, value);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 7, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 7, $dpt_cd, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 8, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 8, $loc_cd, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 9, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 9, $oper_cd, value);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 10, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 10, $bp_cd, value);
	}

	/**
	 * 品群ＣＤ. Item category cd..<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 11, $ctg_cd);
	}

	/**
	 * 品群ＣＤ. Item category cd..<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 11, $ctg_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 12, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 12, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 13, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 13, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 14, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 14, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 15, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 15, $itm_sub3, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 16, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 16, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 17, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 17, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 18, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 18, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 19, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 19, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 20, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 20, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 21, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 21, $sno4, value);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 22, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 22, $itm_mfg_inst_no, value);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 23, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 23, $iv_no, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 24, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 24, $po_no, value);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 25, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 25, $slo_no, value);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 26, $amt);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 26, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 26, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 26, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 26, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 26, $amt, value);
	}
	
	/**
	 * 配賦対象. Allocation target.<p>
	 *
	 */
	public MCNumber pre_alc_rate() {
		return getConstNumber(offset + 27, $pre_alc_rate);
	}

	/**
	 * 配賦対象. Allocation target.<p>
	 *
	 */
	public void pre_alc_rate(MCNumber value) {
		setConstNumber(offset + 27, $pre_alc_rate, value);
	}
	
	/**
	 * 配賦対象. Allocation target.<p>
	 *
	 */
	public void pre_alc_rate(int value) {
		setConstNumber(offset + 27, $pre_alc_rate, value);
	}
	
	/**
	 * 配賦対象. Allocation target.<p>
	 *
	 */
	public void pre_alc_rate(long value) {
		setConstNumber(offset + 27, $pre_alc_rate, value);
	}
	
	/**
	 * 配賦対象. Allocation target.<p>
	 *
	 */
	public void pre_alc_rate(float value) {
		setConstNumber(offset + 27, $pre_alc_rate, value);
	}
	
	/**
	 * 配賦対象. Allocation target.<p>
	 *
	 */
	public void pre_alc_rate(double value) {
		setConstNumber(offset + 27, $pre_alc_rate, value);
	}
	
	/**
	 * 配賦対象合計. Allocation target total.<p>
	 *
	 */
	public MCNumber pre_alc_total() {
		return getConstNumber(offset + 28, $pre_alc_total);
	}

	/**
	 * 配賦対象合計. Allocation target total.<p>
	 *
	 */
	public void pre_alc_total(MCNumber value) {
		setConstNumber(offset + 28, $pre_alc_total, value);
	}
	
	/**
	 * 配賦対象合計. Allocation target total.<p>
	 *
	 */
	public void pre_alc_total(int value) {
		setConstNumber(offset + 28, $pre_alc_total, value);
	}
	
	/**
	 * 配賦対象合計. Allocation target total.<p>
	 *
	 */
	public void pre_alc_total(long value) {
		setConstNumber(offset + 28, $pre_alc_total, value);
	}
	
	/**
	 * 配賦対象合計. Allocation target total.<p>
	 *
	 */
	public void pre_alc_total(float value) {
		setConstNumber(offset + 28, $pre_alc_total, value);
	}
	
	/**
	 * 配賦対象合計. Allocation target total.<p>
	 *
	 */
	public void pre_alc_total(double value) {
		setConstNumber(offset + 28, $pre_alc_total, value);
	}
	
	/**
	 * 配賦率. Allocation rate.<p>
	 *
	 */
	public MCNumber pre_alc_calc_rate() {
		return getConstNumber(offset + 29, $pre_alc_calc_rate);
	}

	/**
	 * 配賦率. Allocation rate.<p>
	 *
	 */
	public void pre_alc_calc_rate(MCNumber value) {
		setConstNumber(offset + 29, $pre_alc_calc_rate, value);
	}
	
	/**
	 * 配賦率. Allocation rate.<p>
	 *
	 */
	public void pre_alc_calc_rate(int value) {
		setConstNumber(offset + 29, $pre_alc_calc_rate, value);
	}
	
	/**
	 * 配賦率. Allocation rate.<p>
	 *
	 */
	public void pre_alc_calc_rate(long value) {
		setConstNumber(offset + 29, $pre_alc_calc_rate, value);
	}
	
	/**
	 * 配賦率. Allocation rate.<p>
	 *
	 */
	public void pre_alc_calc_rate(float value) {
		setConstNumber(offset + 29, $pre_alc_calc_rate, value);
	}
	
	/**
	 * 配賦率. Allocation rate.<p>
	 *
	 */
	public void pre_alc_calc_rate(double value) {
		setConstNumber(offset + 29, $pre_alc_calc_rate, value);
	}
	
	/**
	 * 一次配賦基準ＣＤ. Departmental alloc. basis cd..<p>
	 *
	 */
	public String pre_alc_rate_cd() {
		return getConstString(offset + 30, $pre_alc_rate_cd);
	}

	/**
	 * 一次配賦基準ＣＤ. Departmental alloc. basis cd..<p>
	 *
	 */
	public void pre_alc_rate_cd(String value) {
		setConstString(offset + 30, $pre_alc_rate_cd, value);
	}

	/**
	 * 配賦元ワーキンググループＣＤ. Allocation source WG cd..<p>
	 *
	 */
	public String src_wg_cd() {
		return getConstString(offset + 31, $src_wg_cd);
	}

	/**
	 * 配賦元ワーキンググループＣＤ. Allocation source WG cd..<p>
	 *
	 */
	public void src_wg_cd(String value) {
		setConstString(offset + 31, $src_wg_cd, value);
	}

	/**
	 * 配賦元連番. Allocation source sequence number.<p>
	 *
	 */
	public MCNumber src_pre_alc_seq() {
		return getConstNumber(offset + 32, $src_pre_alc_seq);
	}

	/**
	 * 配賦元連番. Allocation source sequence number.<p>
	 *
	 */
	public void src_pre_alc_seq(MCNumber value) {
		setConstNumber(offset + 32, $src_pre_alc_seq, value);
	}
	
	/**
	 * 配賦元連番. Allocation source sequence number.<p>
	 *
	 */
	public void src_pre_alc_seq(int value) {
		setConstNumber(offset + 32, $src_pre_alc_seq, value);
	}
	
	/**
	 * 配賦元連番. Allocation source sequence number.<p>
	 *
	 */
	public void src_pre_alc_seq(long value) {
		setConstNumber(offset + 32, $src_pre_alc_seq, value);
	}
	
	/**
	 * 配賦元連番. Allocation source sequence number.<p>
	 *
	 */
	public void src_pre_alc_seq(float value) {
		setConstNumber(offset + 32, $src_pre_alc_seq, value);
	}
	
	/**
	 * 配賦元連番. Allocation source sequence number.<p>
	 *
	 */
	public void src_pre_alc_seq(double value) {
		setConstNumber(offset + 32, $src_pre_alc_seq, value);
	}
	
	/**
	 * 最上位連番. Top sequence number.<p>
	 *
	 */
	public MCNumber top_pre_alc_seq() {
		return getConstNumber(offset + 33, $top_pre_alc_seq);
	}

	/**
	 * 最上位連番. Top sequence number.<p>
	 *
	 */
	public void top_pre_alc_seq(MCNumber value) {
		setConstNumber(offset + 33, $top_pre_alc_seq, value);
	}
	
	/**
	 * 最上位連番. Top sequence number.<p>
	 *
	 */
	public void top_pre_alc_seq(int value) {
		setConstNumber(offset + 33, $top_pre_alc_seq, value);
	}
	
	/**
	 * 最上位連番. Top sequence number.<p>
	 *
	 */
	public void top_pre_alc_seq(long value) {
		setConstNumber(offset + 33, $top_pre_alc_seq, value);
	}
	
	/**
	 * 最上位連番. Top sequence number.<p>
	 *
	 */
	public void top_pre_alc_seq(float value) {
		setConstNumber(offset + 33, $top_pre_alc_seq, value);
	}
	
	/**
	 * 最上位連番. Top sequence number.<p>
	 *
	 */
	public void top_pre_alc_seq(double value) {
		setConstNumber(offset + 33, $top_pre_alc_seq, value);
	}
	
	/**
	 * 配賦レベル. Allocation level.<p>
	 *
	 */
	public MCNumber pre_alc_lvl() {
		return getConstNumber(offset + 34, $pre_alc_lvl);
	}

	/**
	 * 配賦レベル. Allocation level.<p>
	 *
	 */
	public void pre_alc_lvl(MCNumber value) {
		setConstNumber(offset + 34, $pre_alc_lvl, value);
	}
	
	/**
	 * 配賦レベル. Allocation level.<p>
	 *
	 */
	public void pre_alc_lvl(int value) {
		setConstNumber(offset + 34, $pre_alc_lvl, value);
	}
	
	/**
	 * 配賦レベル. Allocation level.<p>
	 *
	 */
	public void pre_alc_lvl(long value) {
		setConstNumber(offset + 34, $pre_alc_lvl, value);
	}
	
	/**
	 * 配賦レベル. Allocation level.<p>
	 *
	 */
	public void pre_alc_lvl(float value) {
		setConstNumber(offset + 34, $pre_alc_lvl, value);
	}
	
	/**
	 * 配賦レベル. Allocation level.<p>
	 *
	 */
	public void pre_alc_lvl(double value) {
		setConstNumber(offset + 34, $pre_alc_lvl, value);
	}
	
	/**
	 * 終了ＦＬＧ. Terminate flg..<p>
	 *
	 */
	public boolean fin_flg() {
		return getConstBoolean(offset + 35, $fin_flg);
	}

	/**
	 * 終了ＦＬＧ. Terminate flg..<p>
	 *
	 */
	public void fin_flg(boolean value) {
		setConstBoolean(offset + 35, $fin_flg, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 36, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 36, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 37, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 37, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 38, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 38, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 39, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 39, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 40, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 41, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 41, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 42, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 42, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 43, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 43, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 44, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 44, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 45, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 45, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			return inpt_alc_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			return src_wg_cd();
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
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			return pre_alc_seq();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			return pre_alc_rate();
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			return pre_alc_total();
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			return pre_alc_calc_rate();
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			return src_pre_alc_seq();
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			return top_pre_alc_seq();
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			return pre_alc_lvl();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
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
		if ($fin_flg.equalsIgnoreCase(name)) {
			return fin_flg();
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
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			return inpt_alc_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			return src_wg_cd();
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
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			return pre_alc_seq();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			return pre_alc_rate();
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			return pre_alc_total();
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			return pre_alc_calc_rate();
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			return src_pre_alc_seq();
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			return top_pre_alc_seq();
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			return pre_alc_lvl();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
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
		if ($fin_flg.equalsIgnoreCase(name)) {
			return fin_flg();
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
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			inpt_alc_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			src_wg_cd(value);
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
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			pre_alc_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			pre_alc_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			pre_alc_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			pre_alc_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			pre_alc_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
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
		if ($fin_flg.equalsIgnoreCase(name)) {
			fin_flg(value);
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
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			inpt_alc_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			src_wg_cd(value);
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
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			pre_alc_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			pre_alc_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			pre_alc_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			pre_alc_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		if ($pre_alc_lvl.equalsIgnoreCase(name)) {
			pre_alc_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
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
		if ($fin_flg.equalsIgnoreCase(name)) {
			fin_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
