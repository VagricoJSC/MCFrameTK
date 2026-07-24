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
 * "版切替情報 // Version change info."DBコンテナRowクラスです。<p>
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
 *  	<td>par_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親品目ＣＤ</td>
 *  	<td>Parent item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>par_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親枝番１</td>
 *  	<td>Parent branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>par_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親枝番２</td>
 *  	<td>Parent branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>par_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親枝番３</td>
 *  	<td>Parent branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>chd_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子品目ＣＤ</td>
 *  	<td>Child item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>chd_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子枝番１</td>
 *  	<td>Child branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>chd_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子枝番２</td>
 *  	<td>Child branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>chd_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子枝番３</td>
 *  	<td>Child branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>ver_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>版ＮＯ</td>
 *  	<td>Version No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>bom_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成パタン</td>
 *  	<td>BOM pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ver_chg_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>版切替状況区分</td>
 *  	<td>Version change status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>first_inst_st_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>切替開始日時（指図）</td>
 *  	<td>Start changing date and time (Order)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>first_inst_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>開始ロットＮＯ（指図）</td>
 *  	<td>Start lot No. (Order)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>first_inst_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>開始サブロットＮＯ（指図）</td>
 *  	<td>Start sublot No. (Order)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>first_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>開始製造指図ＮＯ</td>
 *  	<td>Mfg. order starting No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>first_act_st_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>切替開始日時（実績）</td>
 *  	<td>Start changing date and time (Result)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>first_act_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>開始ロットＮＯ（実績）</td>
 *  	<td>Start lot No. (Result)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>first_act_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>開始サブロットＮＯ（実績）</td>
 *  	<td>Starting sublot No. (Result)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>first_mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>開始製造実績ＮＯ</td>
 *  	<td>First mfg. result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>last_act_st_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最終着手日時</td>
 *  	<td>Last start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>last_act_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最終ロットＮＯ（実績）</td>
 *  	<td>Last lot No. (Result)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>last_act_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最終サブロットＮＯ（実績）</td>
 *  	<td>Last sublot No. (Result)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>last_mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最終製造実績ＮＯ</td>
 *  	<td>Last mfg. result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備３</td>
 *  	<td>Spare 3</td>
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
public class MST_VER_CHG_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_VER_CHG";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	private static final MCPermColumnInfo _par_itm_cd = createColumnInfo("par_itm_cd");
	public final MCStringPermColumn par_itm_cd = createStringColumn(_par_itm_cd);
	
	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	private static final MCPermColumnInfo _par_itm_sub1 = createColumnInfo("par_itm_sub1");
	public final MCStringPermColumn par_itm_sub1 = createStringColumn(_par_itm_sub1);
	
	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	private static final MCPermColumnInfo _par_itm_sub2 = createColumnInfo("par_itm_sub2");
	public final MCStringPermColumn par_itm_sub2 = createStringColumn(_par_itm_sub2);
	
	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	private static final MCPermColumnInfo _par_itm_sub3 = createColumnInfo("par_itm_sub3");
	public final MCStringPermColumn par_itm_sub3 = createStringColumn(_par_itm_sub3);
	
	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public static final String $chd_itm_cd = "chd_itm_cd";
	private static final MCPermColumnInfo _chd_itm_cd = createColumnInfo("chd_itm_cd");
	public final MCStringPermColumn chd_itm_cd = createStringColumn(_chd_itm_cd);
	
	/**
	 * 子枝番１. Child branch No. 1.<p>
	 *
	 */
	public static final String $chd_itm_sub1 = "chd_itm_sub1";
	private static final MCPermColumnInfo _chd_itm_sub1 = createColumnInfo("chd_itm_sub1");
	public final MCStringPermColumn chd_itm_sub1 = createStringColumn(_chd_itm_sub1);
	
	/**
	 * 子枝番２. Child branch No. 2.<p>
	 *
	 */
	public static final String $chd_itm_sub2 = "chd_itm_sub2";
	private static final MCPermColumnInfo _chd_itm_sub2 = createColumnInfo("chd_itm_sub2");
	public final MCStringPermColumn chd_itm_sub2 = createStringColumn(_chd_itm_sub2);
	
	/**
	 * 子枝番３. Child branch No. 3.<p>
	 *
	 */
	public static final String $chd_itm_sub3 = "chd_itm_sub3";
	private static final MCPermColumnInfo _chd_itm_sub3 = createColumnInfo("chd_itm_sub3");
	public final MCStringPermColumn chd_itm_sub3 = createStringColumn(_chd_itm_sub3);
	
	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	private static final MCPermColumnInfo _bom_ptn = createColumnInfo("bom_ptn");
	public final MCStringPermColumn bom_ptn = createStringColumn(_bom_ptn);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	private static final MCPermColumnInfo _site_cd = createColumnInfo("site_cd");
	public final MCStringPermColumn site_cd = createStringColumn(_site_cd);
	
	/**
	 * 版切替状況区分. Version change status type.<p>
	 *
	 */
	public static final String $ver_chg_sts_typ = "ver_chg_sts_typ";
	private static final MCPermColumnInfo _ver_chg_sts_typ = createColumnInfo("ver_chg_sts_typ");
	public final MCStringPermColumn ver_chg_sts_typ = createStringColumn(_ver_chg_sts_typ);
	
	/**
	 * 切替開始日時（指図）. Start changing date and time (Order).<p>
	 *
	 */
	public static final String $first_inst_st_tm = "first_inst_st_tm";
	private static final MCPermColumnInfo _first_inst_st_tm = createColumnInfo("first_inst_st_tm");
	public final MCDatePermColumn first_inst_st_tm = createDateColumn(_first_inst_st_tm);
	
	/**
	 * 開始ロットＮＯ（指図）. Start lot No. (Order).<p>
	 *
	 */
	public static final String $first_inst_lot_no = "first_inst_lot_no";
	private static final MCPermColumnInfo _first_inst_lot_no = createColumnInfo("first_inst_lot_no");
	public final MCStringPermColumn first_inst_lot_no = createStringColumn(_first_inst_lot_no);
	
	/**
	 * 開始サブロットＮＯ（指図）. Start sublot No. (Order).<p>
	 *
	 */
	public static final String $first_inst_sublot_no = "first_inst_sublot_no";
	private static final MCPermColumnInfo _first_inst_sublot_no = createColumnInfo("first_inst_sublot_no");
	public final MCStringPermColumn first_inst_sublot_no = createStringColumn(_first_inst_sublot_no);
	
	/**
	 * 開始製造指図ＮＯ. Mfg. order starting No..<p>
	 *
	 */
	public static final String $first_mfg_inst_no = "first_mfg_inst_no";
	private static final MCPermColumnInfo _first_mfg_inst_no = createColumnInfo("first_mfg_inst_no");
	public final MCStringPermColumn first_mfg_inst_no = createStringColumn(_first_mfg_inst_no);
	
	/**
	 * 切替開始日時（実績）. Start changing date and time (Result).<p>
	 *
	 */
	public static final String $first_act_st_tm = "first_act_st_tm";
	private static final MCPermColumnInfo _first_act_st_tm = createColumnInfo("first_act_st_tm");
	public final MCDatePermColumn first_act_st_tm = createDateColumn(_first_act_st_tm);
	
	/**
	 * 開始ロットＮＯ（実績）. Start lot No. (Result).<p>
	 *
	 */
	public static final String $first_act_lot_no = "first_act_lot_no";
	private static final MCPermColumnInfo _first_act_lot_no = createColumnInfo("first_act_lot_no");
	public final MCStringPermColumn first_act_lot_no = createStringColumn(_first_act_lot_no);
	
	/**
	 * 開始サブロットＮＯ（実績）. Starting sublot No. (Result).<p>
	 *
	 */
	public static final String $first_act_sublot_no = "first_act_sublot_no";
	private static final MCPermColumnInfo _first_act_sublot_no = createColumnInfo("first_act_sublot_no");
	public final MCStringPermColumn first_act_sublot_no = createStringColumn(_first_act_sublot_no);
	
	/**
	 * 開始製造実績ＮＯ. First mfg. result No..<p>
	 *
	 */
	public static final String $first_mfg_act_no = "first_mfg_act_no";
	private static final MCPermColumnInfo _first_mfg_act_no = createColumnInfo("first_mfg_act_no");
	public final MCStringPermColumn first_mfg_act_no = createStringColumn(_first_mfg_act_no);
	
	/**
	 * 最終着手日時. Last start date and time.<p>
	 *
	 */
	public static final String $last_act_st_tm = "last_act_st_tm";
	private static final MCPermColumnInfo _last_act_st_tm = createColumnInfo("last_act_st_tm");
	public final MCDatePermColumn last_act_st_tm = createDateColumn(_last_act_st_tm);
	
	/**
	 * 最終ロットＮＯ（実績）. Last lot No. (Result).<p>
	 *
	 */
	public static final String $last_act_lot_no = "last_act_lot_no";
	private static final MCPermColumnInfo _last_act_lot_no = createColumnInfo("last_act_lot_no");
	public final MCStringPermColumn last_act_lot_no = createStringColumn(_last_act_lot_no);
	
	/**
	 * 最終サブロットＮＯ（実績）. Last sublot No. (Result).<p>
	 *
	 */
	public static final String $last_act_sublot_no = "last_act_sublot_no";
	private static final MCPermColumnInfo _last_act_sublot_no = createColumnInfo("last_act_sublot_no");
	public final MCStringPermColumn last_act_sublot_no = createStringColumn(_last_act_sublot_no);
	
	/**
	 * 最終製造実績ＮＯ. Last mfg. result No..<p>
	 *
	 */
	public static final String $last_mfg_act_no = "last_mfg_act_no";
	private static final MCPermColumnInfo _last_mfg_act_no = createColumnInfo("last_mfg_act_no");
	public final MCStringPermColumn last_mfg_act_no = createStringColumn(_last_mfg_act_no);
	
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
	
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta chd_itm_cd_META = createCommonMeta($chd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chd_itm_sub1_META = createCommonMeta($chd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta chd_itm_sub2_META = createCommonMeta($chd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta chd_itm_sub3_META = createCommonMeta($chd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta ver_chg_sts_typ_META = createCommonMeta($ver_chg_sts_typ, mcframe.commonMS.meta.MS_META.VER_CHG_STS_TYP);
	public static final MCMeta first_inst_st_tm_META = createCommonMeta($first_inst_st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta first_inst_lot_no_META = createCommonMeta($first_inst_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta first_inst_sublot_no_META = createCommonMeta($first_inst_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta first_mfg_inst_no_META = createCommonMeta($first_mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta first_act_st_tm_META = createCommonMeta($first_act_st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta first_act_lot_no_META = createCommonMeta($first_act_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta first_act_sublot_no_META = createCommonMeta($first_act_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta first_mfg_act_no_META = createCommonMeta($first_mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta last_act_st_tm_META = createCommonMeta($last_act_st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta last_act_lot_no_META = createCommonMeta($last_act_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta last_act_sublot_no_META = createCommonMeta($last_act_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta last_mfg_act_no_META = createCommonMeta($last_mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR3);
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
	public static final String $MFG_ACT2 = "MFG_ACT2";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_MFG_ACT",
				$MFG_ACT1,
				new String[][]{
						{"first_mfg_act_no", "mfg_act_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_MFG_ACT_R.create("MFG_ACT1");
				},
				(alias) -> {
					MST_VER_CHG_R own = MST_VER_CHG_R.create(alias);
					mcframe.serverMS.dbc.MST_MFG_ACT_R ref = mcframe.serverMS.dbc.MST_MFG_ACT_R.create("MFG_ACT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.first_mfg_act_no.eq(ref.mfg_act_no));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_MFG_ACT",
				$MFG_ACT2,
				new String[][]{
						{"last_mfg_act_no", "mfg_act_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_MFG_ACT_R.create("MFG_ACT2");
				},
				(alias) -> {
					MST_VER_CHG_R own = MST_VER_CHG_R.create(alias);
					mcframe.serverMS.dbc.MST_MFG_ACT_R ref = mcframe.serverMS.dbc.MST_MFG_ACT_R.create("MFG_ACT2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.last_mfg_act_no.eq(ref.mfg_act_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_VER_CHG_R> constMetas = new ConstMetaList<MST_VER_CHG_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			chd_itm_cd_META,
			chd_itm_sub1_META,
			chd_itm_sub2_META,
			chd_itm_sub3_META,
			ver_no_META,
			bom_ptn_META,
			wg_cd_META,
			site_cd_META,
			ver_chg_sts_typ_META,
			first_inst_st_tm_META,
			first_inst_lot_no_META,
			first_inst_sublot_no_META,
			first_mfg_inst_no_META,
			first_act_st_tm_META,
			first_act_lot_no_META,
			first_act_sublot_no_META,
			first_mfg_act_no_META,
			last_act_st_tm_META,
			last_act_lot_no_META,
			last_act_sublot_no_META,
			last_mfg_act_no_META,
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
	protected MST_VER_CHG_R(ConstMetaList<? extends MST_VER_CHG_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_VER_CHG_R(ConstMetaList<? extends MST_VER_CHG_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_VER_CHG_R.$par_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$par_itm_cd,
				"par_itm_cd",
				par_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$par_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$par_itm_sub1,
				"par_itm_sub1",
				par_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$par_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$par_itm_sub2,
				"par_itm_sub2",
				par_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$par_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$par_itm_sub3,
				"par_itm_sub3",
				par_itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$chd_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$chd_itm_cd,
				"chd_itm_cd",
				chd_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$chd_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$chd_itm_sub1,
				"chd_itm_sub1",
				chd_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$chd_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$chd_itm_sub2,
				"chd_itm_sub2",
				chd_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$chd_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$chd_itm_sub3,
				"chd_itm_sub3",
				chd_itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$ver_no,
				"ver_no",
				ver_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$bom_ptn,
				"bom_ptn",
				bom_ptn,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$site_cd,
				"site_cd",
				site_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$ver_chg_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$ver_chg_sts_typ,
				"ver_chg_sts_typ",
				ver_chg_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$first_inst_st_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_VER_CHG_R.$first_inst_st_tm,
				"first_inst_st_tm",
				first_inst_st_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$first_inst_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$first_inst_lot_no,
				"first_inst_lot_no",
				first_inst_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$first_inst_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$first_inst_sublot_no,
				"first_inst_sublot_no",
				first_inst_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$first_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$first_mfg_inst_no,
				"first_mfg_inst_no",
				first_mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$first_act_st_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_VER_CHG_R.$first_act_st_tm,
				"first_act_st_tm",
				first_act_st_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$first_act_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$first_act_lot_no,
				"first_act_lot_no",
				first_act_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$first_act_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$first_act_sublot_no,
				"first_act_sublot_no",
				first_act_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$first_mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$first_mfg_act_no,
				"first_mfg_act_no",
				first_mfg_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$last_act_st_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_VER_CHG_R.$last_act_st_tm,
				"last_act_st_tm",
				last_act_st_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$last_act_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$last_act_lot_no,
				"last_act_lot_no",
				last_act_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$last_act_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$last_act_sublot_no,
				"last_act_sublot_no",
				last_act_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$last_mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$last_mfg_act_no,
				"last_mfg_act_no",
				last_mfg_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_VER_CHG_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$sub_char1,
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
			MST_VER_CHG_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$sub_char2,
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
			MST_VER_CHG_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$sub_char3,
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
			MST_VER_CHG_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$ins_usr_id,
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
			MST_VER_CHG_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$ins_usr_nm,
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
			MST_VER_CHG_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_VER_CHG_R.$ins_ts,
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
			MST_VER_CHG_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$ins_func_id,
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
			MST_VER_CHG_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_VER_CHG_R.$upd_cntr,
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
			MST_VER_CHG_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$upd_usr_id,
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
			MST_VER_CHG_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$upd_usr_nm,
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
			MST_VER_CHG_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_VER_CHG_R.$upd_ts,
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
			MST_VER_CHG_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$upd_func_id,
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
			MST_VER_CHG_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_VER_CHG_R.$upd_srv_req_no,
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
	public static MST_VER_CHG_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_VER_CHG_R create(String alias) {
		MST_VER_CHG_R row = new MST_VER_CHG_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_VER_CHG_R createByName(T proto) {
		MST_VER_CHG_R row = MST_VER_CHG_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_VER_CHG_R clone() {
		return (MST_VER_CHG_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_VER_CHG_R createInstance() {
		return (MST_VER_CHG_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_VER_CHG_R getValues(String... names) {
		return (MST_VER_CHG_R) super.getValues(names);
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
	 public MSW_VER_CHG_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_VER_CHG_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_VER_CHG_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_VER_CHG_KEY_R.TABLE_NAME);
	 }

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 0, $par_itm_cd);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 0, $par_itm_cd, value);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 1, $par_itm_sub1);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 1, $par_itm_sub1, value);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 2, $par_itm_sub2);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 2, $par_itm_sub2, value);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 3, $par_itm_sub3);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 3, $par_itm_sub3, value);
	}

	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public String chd_itm_cd() {
		return getConstString(offset + 4, $chd_itm_cd);
	}

	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		setConstString(offset + 4, $chd_itm_cd, value);
	}

	/**
	 * 子枝番１. Child branch No. 1.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return getConstString(offset + 5, $chd_itm_sub1);
	}

	/**
	 * 子枝番１. Child branch No. 1.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		setConstString(offset + 5, $chd_itm_sub1, value);
	}

	/**
	 * 子枝番２. Child branch No. 2.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return getConstString(offset + 6, $chd_itm_sub2);
	}

	/**
	 * 子枝番２. Child branch No. 2.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		setConstString(offset + 6, $chd_itm_sub2, value);
	}

	/**
	 * 子枝番３. Child branch No. 3.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return getConstString(offset + 7, $chd_itm_sub3);
	}

	/**
	 * 子枝番３. Child branch No. 3.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		setConstString(offset + 7, $chd_itm_sub3, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 8, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 8, $ver_no, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 9, $bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 9, $bom_ptn, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 10, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 10, $wg_cd, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 11, $site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 11, $site_cd, value);
	}

	/**
	 * 版切替状況区分. Version change status type.<p>
	 *
	 */
	public String ver_chg_sts_typ() {
		return getConstString(offset + 12, $ver_chg_sts_typ);
	}

	/**
	 * 版切替状況区分. Version change status type.<p>
	 *
	 */
	public void ver_chg_sts_typ(String value) {
		setConstString(offset + 12, $ver_chg_sts_typ, value);
	}

	/**
	 * 切替開始日時（指図）. Start changing date and time (Order).<p>
	 *
	 */
	public MCDate first_inst_st_tm() {
		return getConstDate(offset + 13, $first_inst_st_tm);
	}

	/**
	 * 切替開始日時（指図）. Start changing date and time (Order).<p>
	 *
	 */
	public void first_inst_st_tm(MCDate value) {
		setConstDate(offset + 13, $first_inst_st_tm, value);
	}

	/**
	 * 開始ロットＮＯ（指図）. Start lot No. (Order).<p>
	 *
	 */
	public String first_inst_lot_no() {
		return getConstString(offset + 14, $first_inst_lot_no);
	}

	/**
	 * 開始ロットＮＯ（指図）. Start lot No. (Order).<p>
	 *
	 */
	public void first_inst_lot_no(String value) {
		setConstString(offset + 14, $first_inst_lot_no, value);
	}

	/**
	 * 開始サブロットＮＯ（指図）. Start sublot No. (Order).<p>
	 *
	 */
	public String first_inst_sublot_no() {
		return getConstString(offset + 15, $first_inst_sublot_no);
	}

	/**
	 * 開始サブロットＮＯ（指図）. Start sublot No. (Order).<p>
	 *
	 */
	public void first_inst_sublot_no(String value) {
		setConstString(offset + 15, $first_inst_sublot_no, value);
	}

	/**
	 * 開始製造指図ＮＯ. Mfg. order starting No..<p>
	 *
	 */
	public String first_mfg_inst_no() {
		return getConstString(offset + 16, $first_mfg_inst_no);
	}

	/**
	 * 開始製造指図ＮＯ. Mfg. order starting No..<p>
	 *
	 */
	public void first_mfg_inst_no(String value) {
		setConstString(offset + 16, $first_mfg_inst_no, value);
	}

	/**
	 * 切替開始日時（実績）. Start changing date and time (Result).<p>
	 *
	 */
	public MCDate first_act_st_tm() {
		return getConstDate(offset + 17, $first_act_st_tm);
	}

	/**
	 * 切替開始日時（実績）. Start changing date and time (Result).<p>
	 *
	 */
	public void first_act_st_tm(MCDate value) {
		setConstDate(offset + 17, $first_act_st_tm, value);
	}

	/**
	 * 開始ロットＮＯ（実績）. Start lot No. (Result).<p>
	 *
	 */
	public String first_act_lot_no() {
		return getConstString(offset + 18, $first_act_lot_no);
	}

	/**
	 * 開始ロットＮＯ（実績）. Start lot No. (Result).<p>
	 *
	 */
	public void first_act_lot_no(String value) {
		setConstString(offset + 18, $first_act_lot_no, value);
	}

	/**
	 * 開始サブロットＮＯ（実績）. Starting sublot No. (Result).<p>
	 *
	 */
	public String first_act_sublot_no() {
		return getConstString(offset + 19, $first_act_sublot_no);
	}

	/**
	 * 開始サブロットＮＯ（実績）. Starting sublot No. (Result).<p>
	 *
	 */
	public void first_act_sublot_no(String value) {
		setConstString(offset + 19, $first_act_sublot_no, value);
	}

	/**
	 * 開始製造実績ＮＯ. First mfg. result No..<p>
	 *
	 */
	public String first_mfg_act_no() {
		return getConstString(offset + 20, $first_mfg_act_no);
	}

	/**
	 * 開始製造実績ＮＯ. First mfg. result No..<p>
	 *
	 */
	public void first_mfg_act_no(String value) {
		setConstString(offset + 20, $first_mfg_act_no, value);
	}

	/**
	 * 最終着手日時. Last start date and time.<p>
	 *
	 */
	public MCDate last_act_st_tm() {
		return getConstDate(offset + 21, $last_act_st_tm);
	}

	/**
	 * 最終着手日時. Last start date and time.<p>
	 *
	 */
	public void last_act_st_tm(MCDate value) {
		setConstDate(offset + 21, $last_act_st_tm, value);
	}

	/**
	 * 最終ロットＮＯ（実績）. Last lot No. (Result).<p>
	 *
	 */
	public String last_act_lot_no() {
		return getConstString(offset + 22, $last_act_lot_no);
	}

	/**
	 * 最終ロットＮＯ（実績）. Last lot No. (Result).<p>
	 *
	 */
	public void last_act_lot_no(String value) {
		setConstString(offset + 22, $last_act_lot_no, value);
	}

	/**
	 * 最終サブロットＮＯ（実績）. Last sublot No. (Result).<p>
	 *
	 */
	public String last_act_sublot_no() {
		return getConstString(offset + 23, $last_act_sublot_no);
	}

	/**
	 * 最終サブロットＮＯ（実績）. Last sublot No. (Result).<p>
	 *
	 */
	public void last_act_sublot_no(String value) {
		setConstString(offset + 23, $last_act_sublot_no, value);
	}

	/**
	 * 最終製造実績ＮＯ. Last mfg. result No..<p>
	 *
	 */
	public String last_mfg_act_no() {
		return getConstString(offset + 24, $last_mfg_act_no);
	}

	/**
	 * 最終製造実績ＮＯ. Last mfg. result No..<p>
	 *
	 */
	public void last_mfg_act_no(String value) {
		setConstString(offset + 24, $last_mfg_act_no, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 25, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 25, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 26, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 26, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 27, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 27, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 28, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 28, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 29, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 29, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 30, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 31, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 31, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 32, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 33, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 33, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 34, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 34, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 35, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 35, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 36, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 36, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 37, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 37, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ();
		}
		if ($first_inst_lot_no.equalsIgnoreCase(name)) {
			return first_inst_lot_no();
		}
		if ($first_inst_sublot_no.equalsIgnoreCase(name)) {
			return first_inst_sublot_no();
		}
		if ($first_mfg_inst_no.equalsIgnoreCase(name)) {
			return first_mfg_inst_no();
		}
		if ($first_act_lot_no.equalsIgnoreCase(name)) {
			return first_act_lot_no();
		}
		if ($first_act_sublot_no.equalsIgnoreCase(name)) {
			return first_act_sublot_no();
		}
		if ($first_mfg_act_no.equalsIgnoreCase(name)) {
			return first_mfg_act_no();
		}
		if ($last_act_lot_no.equalsIgnoreCase(name)) {
			return last_act_lot_no();
		}
		if ($last_act_sublot_no.equalsIgnoreCase(name)) {
			return last_act_sublot_no();
		}
		if ($last_mfg_act_no.equalsIgnoreCase(name)) {
			return last_mfg_act_no();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($first_inst_st_tm.equalsIgnoreCase(name)) {
			return first_inst_st_tm();
		}
		if ($first_act_st_tm.equalsIgnoreCase(name)) {
			return first_act_st_tm();
		}
		if ($last_act_st_tm.equalsIgnoreCase(name)) {
			return last_act_st_tm();
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
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ();
		}
		if ($first_inst_lot_no.equalsIgnoreCase(name)) {
			return first_inst_lot_no();
		}
		if ($first_inst_sublot_no.equalsIgnoreCase(name)) {
			return first_inst_sublot_no();
		}
		if ($first_mfg_inst_no.equalsIgnoreCase(name)) {
			return first_mfg_inst_no();
		}
		if ($first_act_lot_no.equalsIgnoreCase(name)) {
			return first_act_lot_no();
		}
		if ($first_act_sublot_no.equalsIgnoreCase(name)) {
			return first_act_sublot_no();
		}
		if ($first_mfg_act_no.equalsIgnoreCase(name)) {
			return first_mfg_act_no();
		}
		if ($last_act_lot_no.equalsIgnoreCase(name)) {
			return last_act_lot_no();
		}
		if ($last_act_sublot_no.equalsIgnoreCase(name)) {
			return last_act_sublot_no();
		}
		if ($last_mfg_act_no.equalsIgnoreCase(name)) {
			return last_mfg_act_no();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($first_inst_st_tm.equalsIgnoreCase(name)) {
			return first_inst_st_tm();
		}
		if ($first_act_st_tm.equalsIgnoreCase(name)) {
			return first_act_st_tm();
		}
		if ($last_act_st_tm.equalsIgnoreCase(name)) {
			return last_act_st_tm();
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
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			ver_chg_sts_typ(value);
			return;
		}
		if ($first_inst_lot_no.equalsIgnoreCase(name)) {
			first_inst_lot_no(value);
			return;
		}
		if ($first_inst_sublot_no.equalsIgnoreCase(name)) {
			first_inst_sublot_no(value);
			return;
		}
		if ($first_mfg_inst_no.equalsIgnoreCase(name)) {
			first_mfg_inst_no(value);
			return;
		}
		if ($first_act_lot_no.equalsIgnoreCase(name)) {
			first_act_lot_no(value);
			return;
		}
		if ($first_act_sublot_no.equalsIgnoreCase(name)) {
			first_act_sublot_no(value);
			return;
		}
		if ($first_mfg_act_no.equalsIgnoreCase(name)) {
			first_mfg_act_no(value);
			return;
		}
		if ($last_act_lot_no.equalsIgnoreCase(name)) {
			last_act_lot_no(value);
			return;
		}
		if ($last_act_sublot_no.equalsIgnoreCase(name)) {
			last_act_sublot_no(value);
			return;
		}
		if ($last_mfg_act_no.equalsIgnoreCase(name)) {
			last_mfg_act_no(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($first_inst_st_tm.equalsIgnoreCase(name)) {
			first_inst_st_tm(value);
			return;
		}
		if ($first_act_st_tm.equalsIgnoreCase(name)) {
			first_act_st_tm(value);
			return;
		}
		if ($last_act_st_tm.equalsIgnoreCase(name)) {
			last_act_st_tm(value);
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
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			ver_chg_sts_typ(value);
			return;
		}
		if ($first_inst_lot_no.equalsIgnoreCase(name)) {
			first_inst_lot_no(value);
			return;
		}
		if ($first_inst_sublot_no.equalsIgnoreCase(name)) {
			first_inst_sublot_no(value);
			return;
		}
		if ($first_mfg_inst_no.equalsIgnoreCase(name)) {
			first_mfg_inst_no(value);
			return;
		}
		if ($first_act_lot_no.equalsIgnoreCase(name)) {
			first_act_lot_no(value);
			return;
		}
		if ($first_act_sublot_no.equalsIgnoreCase(name)) {
			first_act_sublot_no(value);
			return;
		}
		if ($first_mfg_act_no.equalsIgnoreCase(name)) {
			first_mfg_act_no(value);
			return;
		}
		if ($last_act_lot_no.equalsIgnoreCase(name)) {
			last_act_lot_no(value);
			return;
		}
		if ($last_act_sublot_no.equalsIgnoreCase(name)) {
			last_act_sublot_no(value);
			return;
		}
		if ($last_mfg_act_no.equalsIgnoreCase(name)) {
			last_mfg_act_no(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($first_inst_st_tm.equalsIgnoreCase(name)) {
			first_inst_st_tm(value);
			return;
		}
		if ($first_act_st_tm.equalsIgnoreCase(name)) {
			first_act_st_tm(value);
			return;
		}
		if ($last_act_st_tm.equalsIgnoreCase(name)) {
			last_act_st_tm(value);
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
