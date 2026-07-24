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
 * "工程指図ビュー // Operation order view"DBコンテナRowクラスです。<p>
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
 *  	<td>oper_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程指図ＮＯ</td>
 *  	<td>Operation order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程オーダＮＯ</td>
 *  	<td>Operation order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工順</td>
 *  	<td>Routing</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>着手予定日時</td>
 *  	<td>Scheduled start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>終了予定日時</td>
 *  	<td>Scheduled end date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程場所ＣＤ</td>
 *  	<td>Operation location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程棚・ラインＣＤ</td>
 *  	<td>Operation rack/line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程基準単位数量</td>
 *  	<td>Operation base unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_conv_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程換算単位数量</td>
 *  	<td>Operation conversion unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程単位ＣＤ</td>
 *  	<td>Operation unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_unit_conv_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程換算端数処理区分</td>
 *  	<td>Operation conversion rounding type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_unit_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程単位小数部有効桁数</td>
 *  	<td>Operation unit number of decimal places</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unschd_inst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計画外指図ＦＬＧ</td>
 *  	<td>Unplanned order flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unschd_act_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計画外実績ＦＬＧ</td>
 *  	<td>Unplanned result flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bkf_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>バックフラッシュ許可ＦＬＧ</td>
 *  	<td>Allow backflush flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wk_cost_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>自動工数計算ＦＬＧ</td>
 *  	<td>Auto man-hour calculation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_inst_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程指図グループ</td>
 *  	<td>Operation order group</td>
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
 *  	<td>oper_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＬＴ</td>
 *  	<td>Operation LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_lt_add_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＬＴ加算基準数量</td>
 *  	<td>Operation LT add base qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_offst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程オフセット区分</td>
 *  	<td>Operation offset type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_offst</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程オフセット</td>
 *  	<td>Operation offset</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_offst_add_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程オフセット加算基準数量</td>
 *  	<td>Operation offset add base qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lmt_fr_dt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期限起算日使用工程ＦＬＧ</td>
 *  	<td>Expiration base date use operation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_lower_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程下限収率</td>
 *  	<td>Operation min. yield</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_std_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程標準収率</td>
 *  	<td>Operation standard yield</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_upper_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程上限収率</td>
 *  	<td>Operation max. yield</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wip_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕掛進捗度</td>
 *  	<td>WIP progress</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_oper_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高計上工程ＦＬＧ</td>
 *  	<td>Create inventory flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_oper_ratio</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高工程比率</td>
 *  	<td>Output operation ratio</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消ＦＬＧ</td>
 *  	<td>Cancel flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_abort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程打切ＦＬＧ</td>
 *  	<td>Cancel remaining operation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mes_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＭＥＳＦＬＧ</td>
 *  	<td>MES flg.</td>
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
 *  	<td>inst_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図書備考</td>
 *  	<td>Order sheet remarks</td>
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
public class MGVT_MST_OPER_INST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVT_MST_OPER_INST";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	private static final MCPermColumnInfo _oper_inst_no = createColumnInfo("oper_inst_no");
	public final MCStringPermColumn oper_inst_no = createStringColumn(_oper_inst_no);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public static final String $oper_ord_no = "oper_ord_no";
	private static final MCPermColumnInfo _oper_ord_no = createColumnInfo("oper_ord_no");
	public final MCStringPermColumn oper_ord_no = createStringColumn(_oper_ord_no);
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
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
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public static final String $st_schd_tm = "st_schd_tm";
	private static final MCPermColumnInfo _st_schd_tm = createColumnInfo("st_schd_tm");
	public final MCDatePermColumn st_schd_tm = createDateColumn(_st_schd_tm);
	
	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public static final String $end_schd_tm = "end_schd_tm";
	private static final MCPermColumnInfo _end_schd_tm = createColumnInfo("end_schd_tm");
	public final MCDatePermColumn end_schd_tm = createDateColumn(_end_schd_tm);
	
	/**
	 * 工程場所ＣＤ. Operation location cd..<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	private static final MCPermColumnInfo _oper_loc_cd = createColumnInfo("oper_loc_cd");
	public final MCStringPermColumn oper_loc_cd = createStringColumn(_oper_loc_cd);
	
	/**
	 * 工程棚・ラインＣＤ. Operation rack/line cd..<p>
	 *
	 */
	public static final String $oper_str_ln_cd = "oper_str_ln_cd";
	private static final MCPermColumnInfo _oper_str_ln_cd = createColumnInfo("oper_str_ln_cd");
	public final MCStringPermColumn oper_str_ln_cd = createStringColumn(_oper_str_ln_cd);
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	private static final MCPermColumnInfo _base_unit_qty = createColumnInfo("base_unit_qty");
	public final MCNumberPermColumn base_unit_qty = createNumberColumn(_base_unit_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public static final String $oper_std_qty = "oper_std_qty";
	private static final MCPermColumnInfo _oper_std_qty = createColumnInfo("oper_std_qty");
	public final MCNumberPermColumn oper_std_qty = createNumberColumn(_oper_std_qty);
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public static final String $oper_conv_qty = "oper_conv_qty";
	private static final MCPermColumnInfo _oper_conv_qty = createColumnInfo("oper_conv_qty");
	public final MCNumberPermColumn oper_conv_qty = createNumberColumn(_oper_conv_qty);
	
	/**
	 * 工程単位ＣＤ. Operation unit cd..<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	private static final MCPermColumnInfo _oper_unit_cd = createColumnInfo("oper_unit_cd");
	public final MCStringPermColumn oper_unit_cd = createStringColumn(_oper_unit_cd);
	
	/**
	 * 工程換算端数処理区分. Operation conversion rounding type.<p>
	 *
	 */
	public static final String $oper_unit_conv_rnd_typ = "oper_unit_conv_rnd_typ";
	private static final MCPermColumnInfo _oper_unit_conv_rnd_typ = createColumnInfo("oper_unit_conv_rnd_typ");
	public final MCStringPermColumn oper_unit_conv_rnd_typ = createStringColumn(_oper_unit_conv_rnd_typ);
	
	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public static final String $oper_unit_dec_place = "oper_unit_dec_place";
	private static final MCPermColumnInfo _oper_unit_dec_place = createColumnInfo("oper_unit_dec_place");
	public final MCNumberPermColumn oper_unit_dec_place = createNumberColumn(_oper_unit_dec_place);
	
	/**
	 * 計画外指図ＦＬＧ. Unplanned order flg..<p>
	 *
	 */
	public static final String $unschd_inst_flg = "unschd_inst_flg";
	private static final MCPermColumnInfo _unschd_inst_flg = createColumnInfo("unschd_inst_flg");
	public final MCBooleanPermColumn unschd_inst_flg = createBooleanColumn(_unschd_inst_flg);
	
	/**
	 * 計画外実績ＦＬＧ. Unplanned result flg..<p>
	 *
	 */
	public static final String $unschd_act_flg = "unschd_act_flg";
	private static final MCPermColumnInfo _unschd_act_flg = createColumnInfo("unschd_act_flg");
	public final MCBooleanPermColumn unschd_act_flg = createBooleanColumn(_unschd_act_flg);
	
	/**
	 * バックフラッシュ許可ＦＬＧ. Allow backflush flg..<p>
	 *
	 */
	public static final String $bkf_flg = "bkf_flg";
	private static final MCPermColumnInfo _bkf_flg = createColumnInfo("bkf_flg");
	public final MCBooleanPermColumn bkf_flg = createBooleanColumn(_bkf_flg);
	
	/**
	 * 自動工数計算ＦＬＧ. Auto man-hour calculation flg..<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	private static final MCPermColumnInfo _wk_cost_calc_flg = createColumnInfo("wk_cost_calc_flg");
	public final MCBooleanPermColumn wk_cost_calc_flg = createBooleanColumn(_wk_cost_calc_flg);
	
	/**
	 * 工程指図グループ. Operation order group.<p>
	 *
	 */
	public static final String $oper_inst_grp = "oper_inst_grp";
	private static final MCPermColumnInfo _oper_inst_grp = createColumnInfo("oper_inst_grp");
	public final MCStringPermColumn oper_inst_grp = createStringColumn(_oper_inst_grp);
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	private static final MCPermColumnInfo _usr_cd = createColumnInfo("usr_cd");
	public final MCStringPermColumn usr_cd = createStringColumn(_usr_cd);
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public static final String $oper_lt = "oper_lt";
	private static final MCPermColumnInfo _oper_lt = createColumnInfo("oper_lt");
	public final MCNumberPermColumn oper_lt = createNumberColumn(_oper_lt);
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public static final String $oper_lt_add_qty = "oper_lt_add_qty";
	private static final MCPermColumnInfo _oper_lt_add_qty = createColumnInfo("oper_lt_add_qty");
	public final MCNumberPermColumn oper_lt_add_qty = createNumberColumn(_oper_lt_add_qty);
	
	/**
	 * 工程オフセット区分. Operation offset type.<p>
	 *
	 */
	public static final String $oper_offst_typ = "oper_offst_typ";
	private static final MCPermColumnInfo _oper_offst_typ = createColumnInfo("oper_offst_typ");
	public final MCStringPermColumn oper_offst_typ = createStringColumn(_oper_offst_typ);
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public static final String $oper_offst = "oper_offst";
	private static final MCPermColumnInfo _oper_offst = createColumnInfo("oper_offst");
	public final MCNumberPermColumn oper_offst = createNumberColumn(_oper_offst);
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public static final String $oper_offst_add_qty = "oper_offst_add_qty";
	private static final MCPermColumnInfo _oper_offst_add_qty = createColumnInfo("oper_offst_add_qty");
	public final MCNumberPermColumn oper_offst_add_qty = createNumberColumn(_oper_offst_add_qty);
	
	/**
	 * 期限起算日使用工程ＦＬＧ. Expiration base date use operation flg..<p>
	 *
	 */
	public static final String $lmt_fr_dt_flg = "lmt_fr_dt_flg";
	private static final MCPermColumnInfo _lmt_fr_dt_flg = createColumnInfo("lmt_fr_dt_flg");
	public final MCBooleanPermColumn lmt_fr_dt_flg = createBooleanColumn(_lmt_fr_dt_flg);
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public static final String $oper_lower_yield = "oper_lower_yield";
	private static final MCPermColumnInfo _oper_lower_yield = createColumnInfo("oper_lower_yield");
	public final MCNumberPermColumn oper_lower_yield = createNumberColumn(_oper_lower_yield);
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public static final String $oper_std_yield = "oper_std_yield";
	private static final MCPermColumnInfo _oper_std_yield = createColumnInfo("oper_std_yield");
	public final MCNumberPermColumn oper_std_yield = createNumberColumn(_oper_std_yield);
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public static final String $oper_upper_yield = "oper_upper_yield";
	private static final MCPermColumnInfo _oper_upper_yield = createColumnInfo("oper_upper_yield");
	public final MCNumberPermColumn oper_upper_yield = createNumberColumn(_oper_upper_yield);
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public static final String $wip_rate = "wip_rate";
	private static final MCPermColumnInfo _wip_rate = createColumnInfo("wip_rate");
	public final MCNumberPermColumn wip_rate = createNumberColumn(_wip_rate);
	
	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public static final String $yield_oper_flg = "yield_oper_flg";
	private static final MCPermColumnInfo _yield_oper_flg = createColumnInfo("yield_oper_flg");
	public final MCBooleanPermColumn yield_oper_flg = createBooleanColumn(_yield_oper_flg);
	
	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public static final String $yield_oper_ratio = "yield_oper_ratio";
	private static final MCPermColumnInfo _yield_oper_ratio = createColumnInfo("yield_oper_ratio");
	public final MCNumberPermColumn yield_oper_ratio = createNumberColumn(_yield_oper_ratio);
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	private static final MCPermColumnInfo _can_flg = createColumnInfo("can_flg");
	public final MCBooleanPermColumn can_flg = createBooleanColumn(_can_flg);
	
	/**
	 * 工程打切ＦＬＧ. Cancel remaining operation flg..<p>
	 *
	 */
	public static final String $oper_abort_flg = "oper_abort_flg";
	private static final MCPermColumnInfo _oper_abort_flg = createColumnInfo("oper_abort_flg");
	public final MCBooleanPermColumn oper_abort_flg = createBooleanColumn(_oper_abort_flg);
	
	/**
	 * ＭＥＳＦＬＧ. MES flg..<p>
	 *
	 */
	public static final String $mes_flg = "mes_flg";
	private static final MCPermColumnInfo _mes_flg = createColumnInfo("mes_flg");
	public final MCBooleanPermColumn mes_flg = createBooleanColumn(_mes_flg);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 指図書備考. Order sheet remarks.<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
	private static final MCPermColumnInfo _inst_rpt_rmrks = createColumnInfo("inst_rpt_rmrks");
	public final MCStringPermColumn inst_rpt_rmrks = createStringColumn(_inst_rpt_rmrks);
	
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
	
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_conv_rnd_typ_META = createCommonMeta($oper_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta oper_unit_dec_place_META = createCommonMeta($oper_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unschd_inst_flg_META = createCommonMeta($unschd_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_act_flg_META = createCommonMeta($unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bkf_flg_META = createCommonMeta($bkf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_inst_grp_META = createCommonMeta($oper_inst_grp, mcframe.commonMA.meta.MA_META.OPER_INST_GRP);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta oper_lt_META = createCommonMeta($oper_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta oper_lt_add_qty_META = createCommonMeta($oper_lt_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_offst_typ_META = createCommonMeta($oper_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta oper_offst_META = createCommonMeta($oper_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta oper_offst_add_qty_META = createCommonMeta($oper_offst_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lmt_fr_dt_flg_META = createCommonMeta($lmt_fr_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_lower_yield_META = createCommonMeta($oper_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_std_yield_META = createCommonMeta($oper_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_upper_yield_META = createCommonMeta($oper_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta wip_rate_META = createCommonMeta($wip_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_oper_ratio_META = createCommonMeta($yield_oper_ratio, mcframe.commonMA.meta.MA_META.YIELD_OPER_RATIO);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_abort_flg_META = createCommonMeta($oper_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createStringMeta($intr_rmrks, 100);
	public static final MCMeta inst_rpt_rmrks_META = createStringMeta($inst_rpt_rmrks, 100);
	public static final MCMeta sub_char1_META = createStringMeta($sub_char1, 20);
	public static final MCMeta sub_char2_META = createStringMeta($sub_char2, 20);
	public static final MCMeta sub_char3_META = createStringMeta($sub_char3, 20);
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
	
	protected static final ConstMetaList<MGVT_MST_OPER_INST_R> constMetas = new ConstMetaList<MGVT_MST_OPER_INST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			oper_inst_no_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_ord_no_META,
			disp_seq_META,
			oper_cd_META,
			oper_seq_META,
			st_schd_tm_META,
			end_schd_tm_META,
			oper_loc_cd_META,
			oper_str_ln_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			oper_unit_cd_META,
			oper_unit_conv_rnd_typ_META,
			oper_unit_dec_place_META,
			unschd_inst_flg_META,
			unschd_act_flg_META,
			bkf_flg_META,
			wk_cost_calc_flg_META,
			oper_inst_grp_META,
			usr_cd_META,
			oper_lt_META,
			oper_lt_add_qty_META,
			oper_offst_typ_META,
			oper_offst_META,
			oper_offst_add_qty_META,
			lmt_fr_dt_flg_META,
			oper_lower_yield_META,
			oper_std_yield_META,
			oper_upper_yield_META,
			wip_rate_META,
			yield_oper_flg_META,
			yield_oper_ratio_META,
			can_flg_META,
			oper_abort_flg_META,
			mes_flg_META,
			intr_rmrks_META,
			inst_rpt_rmrks_META,
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
	protected MGVT_MST_OPER_INST_R(ConstMetaList<? extends MGVT_MST_OPER_INST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVT_MST_OPER_INST_R(ConstMetaList<? extends MGVT_MST_OPER_INST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$oper_inst_no,
				"oper_inst_no",
				oper_inst_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$itm_mfg_inst_no,
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
			MGVT_MST_OPER_INST_R.$oper_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$oper_ord_no,
				"oper_ord_no",
				oper_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$disp_seq,
				"disp_seq",
				disp_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$oper_cd,
				"oper_cd",
				oper_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_seq,
				"oper_seq",
				oper_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_OPER_INST_R.$st_schd_tm,
				"st_schd_tm",
				st_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_OPER_INST_R.$end_schd_tm,
				"end_schd_tm",
				end_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$oper_loc_cd,
				"oper_loc_cd",
				oper_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$oper_str_ln_cd,
				"oper_str_ln_cd",
				oper_str_ln_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$base_unit_qty,
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
			MGVT_MST_OPER_INST_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$base_unit_cd,
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
			MGVT_MST_OPER_INST_R.$oper_std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_std_qty,
				"oper_std_qty",
				oper_std_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_conv_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_conv_qty,
				"oper_conv_qty",
				oper_conv_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$oper_unit_cd,
				"oper_unit_cd",
				oper_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_unit_conv_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$oper_unit_conv_rnd_typ,
				"oper_unit_conv_rnd_typ",
				oper_unit_conv_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_unit_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_unit_dec_place,
				"oper_unit_dec_place",
				oper_unit_dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$unschd_inst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_OPER_INST_R.$unschd_inst_flg,
				"unschd_inst_flg",
				unschd_inst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$unschd_act_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_OPER_INST_R.$unschd_act_flg,
				"unschd_act_flg",
				unschd_act_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$bkf_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_OPER_INST_R.$bkf_flg,
				"bkf_flg",
				bkf_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$wk_cost_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_OPER_INST_R.$wk_cost_calc_flg,
				"wk_cost_calc_flg",
				wk_cost_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_inst_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$oper_inst_grp,
				"oper_inst_grp",
				oper_inst_grp,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$usr_cd,
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
			MGVT_MST_OPER_INST_R.$oper_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_lt,
				"oper_lt",
				oper_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_lt_add_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_lt_add_qty,
				"oper_lt_add_qty",
				oper_lt_add_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_offst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$oper_offst_typ,
				"oper_offst_typ",
				oper_offst_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_offst,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_offst,
				"oper_offst",
				oper_offst,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_offst_add_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_offst_add_qty,
				"oper_offst_add_qty",
				oper_offst_add_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$lmt_fr_dt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_OPER_INST_R.$lmt_fr_dt_flg,
				"lmt_fr_dt_flg",
				lmt_fr_dt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_lower_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_lower_yield,
				"oper_lower_yield",
				oper_lower_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_std_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_std_yield,
				"oper_std_yield",
				oper_std_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_upper_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$oper_upper_yield,
				"oper_upper_yield",
				oper_upper_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$wip_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$wip_rate,
				"wip_rate",
				wip_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$yield_oper_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_OPER_INST_R.$yield_oper_flg,
				"yield_oper_flg",
				yield_oper_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$yield_oper_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$yield_oper_ratio,
				"yield_oper_ratio",
				yield_oper_ratio,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_OPER_INST_R.$can_flg,
				"can_flg",
				can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$oper_abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_OPER_INST_R.$oper_abort_flg,
				"oper_abort_flg",
				oper_abort_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$mes_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_OPER_INST_R.$mes_flg,
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
			MGVT_MST_OPER_INST_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$intr_rmrks,
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
			MGVT_MST_OPER_INST_R.$inst_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$inst_rpt_rmrks,
				"inst_rpt_rmrks",
				inst_rpt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_OPER_INST_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$sub_char1,
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
			MGVT_MST_OPER_INST_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$sub_char2,
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
			MGVT_MST_OPER_INST_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$sub_char3,
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
			MGVT_MST_OPER_INST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$ins_usr_id,
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
			MGVT_MST_OPER_INST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$ins_usr_nm,
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
			MGVT_MST_OPER_INST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGVT_MST_OPER_INST_R.$ins_ts,
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
			MGVT_MST_OPER_INST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$ins_func_id,
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
			MGVT_MST_OPER_INST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_OPER_INST_R.$upd_cntr,
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
			MGVT_MST_OPER_INST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$upd_usr_id,
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
			MGVT_MST_OPER_INST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$upd_usr_nm,
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
			MGVT_MST_OPER_INST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGVT_MST_OPER_INST_R.$upd_ts,
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
			MGVT_MST_OPER_INST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$upd_func_id,
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
			MGVT_MST_OPER_INST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_OPER_INST_R.$upd_srv_req_no,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVT_MST_OPER_INST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVT_MST_OPER_INST_R create(String alias) {
		MGVT_MST_OPER_INST_R row = new MGVT_MST_OPER_INST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVT_MST_OPER_INST_R createByName(T proto) {
		MGVT_MST_OPER_INST_R row = MGVT_MST_OPER_INST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_MST_OPER_INST_R clone() {
		return (MGVT_MST_OPER_INST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_MST_OPER_INST_R createInstance() {
		return (MGVT_MST_OPER_INST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_MST_OPER_INST_R getValues(String... names) {
		return (MGVT_MST_OPER_INST_R) super.getValues(names);
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
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 0, $oper_inst_no);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 0, $oper_inst_no, value);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 1, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 1, $mfg_inst_no, value);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 2, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 2, $itm_mfg_inst_no, value);
	}

	/**
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 3, $oper_ord_no);
	}

	/**
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 3, $oper_ord_no, value);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 4, $disp_seq);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 4, $disp_seq, value);
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
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 7, $st_schd_tm);
	}

	/**
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 7, $st_schd_tm, value);
	}

	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 8, $end_schd_tm);
	}

	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 8, $end_schd_tm, value);
	}

	/**
	 * 工程場所ＣＤ. Operation location cd..<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 9, $oper_loc_cd);
	}

	/**
	 * 工程場所ＣＤ. Operation location cd..<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 9, $oper_loc_cd, value);
	}

	/**
	 * 工程棚・ラインＣＤ. Operation rack/line cd..<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 10, $oper_str_ln_cd);
	}

	/**
	 * 工程棚・ラインＣＤ. Operation rack/line cd..<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 10, $oper_str_ln_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 11, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 11, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 11, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 11, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 11, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 11, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 12, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 12, $base_unit_cd, value);
	}

	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 13, $oper_std_qty);
	}

	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 13, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 13, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 13, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 13, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 13, $oper_std_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 14, $oper_conv_qty);
	}

	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 14, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 14, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 14, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 14, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 14, $oper_conv_qty, value);
	}
	
	/**
	 * 工程単位ＣＤ. Operation unit cd..<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 15, $oper_unit_cd);
	}

	/**
	 * 工程単位ＣＤ. Operation unit cd..<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 15, $oper_unit_cd, value);
	}

	/**
	 * 工程換算端数処理区分. Operation conversion rounding type.<p>
	 *
	 */
	public String oper_unit_conv_rnd_typ() {
		return getConstString(offset + 16, $oper_unit_conv_rnd_typ);
	}

	/**
	 * 工程換算端数処理区分. Operation conversion rounding type.<p>
	 *
	 */
	public void oper_unit_conv_rnd_typ(String value) {
		setConstString(offset + 16, $oper_unit_conv_rnd_typ, value);
	}

	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public MCNumber oper_unit_dec_place() {
		return getConstNumber(offset + 17, $oper_unit_dec_place);
	}

	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public void oper_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 17, $oper_unit_dec_place, value);
	}
	
	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public void oper_unit_dec_place(int value) {
		setConstNumber(offset + 17, $oper_unit_dec_place, value);
	}
	
	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public void oper_unit_dec_place(long value) {
		setConstNumber(offset + 17, $oper_unit_dec_place, value);
	}
	
	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public void oper_unit_dec_place(float value) {
		setConstNumber(offset + 17, $oper_unit_dec_place, value);
	}
	
	/**
	 * 工程単位小数部有効桁数. Operation unit number of decimal places.<p>
	 *
	 */
	public void oper_unit_dec_place(double value) {
		setConstNumber(offset + 17, $oper_unit_dec_place, value);
	}
	
	/**
	 * 計画外指図ＦＬＧ. Unplanned order flg..<p>
	 *
	 */
	public boolean unschd_inst_flg() {
		return getConstBoolean(offset + 18, $unschd_inst_flg);
	}

	/**
	 * 計画外指図ＦＬＧ. Unplanned order flg..<p>
	 *
	 */
	public void unschd_inst_flg(boolean value) {
		setConstBoolean(offset + 18, $unschd_inst_flg, value);
	}

	/**
	 * 計画外実績ＦＬＧ. Unplanned result flg..<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return getConstBoolean(offset + 19, $unschd_act_flg);
	}

	/**
	 * 計画外実績ＦＬＧ. Unplanned result flg..<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		setConstBoolean(offset + 19, $unschd_act_flg, value);
	}

	/**
	 * バックフラッシュ許可ＦＬＧ. Allow backflush flg..<p>
	 *
	 */
	public boolean bkf_flg() {
		return getConstBoolean(offset + 20, $bkf_flg);
	}

	/**
	 * バックフラッシュ許可ＦＬＧ. Allow backflush flg..<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		setConstBoolean(offset + 20, $bkf_flg, value);
	}

	/**
	 * 自動工数計算ＦＬＧ. Auto man-hour calculation flg..<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 21, $wk_cost_calc_flg);
	}

	/**
	 * 自動工数計算ＦＬＧ. Auto man-hour calculation flg..<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 21, $wk_cost_calc_flg, value);
	}

	/**
	 * 工程指図グループ. Operation order group.<p>
	 *
	 */
	public String oper_inst_grp() {
		return getConstString(offset + 22, $oper_inst_grp);
	}

	/**
	 * 工程指図グループ. Operation order group.<p>
	 *
	 */
	public void oper_inst_grp(String value) {
		setConstString(offset + 22, $oper_inst_grp, value);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 23, $usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 23, $usr_cd, value);
	}

	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return getConstNumber(offset + 24, $oper_lt);
	}

	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		setConstNumber(offset + 24, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(int value) {
		setConstNumber(offset + 24, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(long value) {
		setConstNumber(offset + 24, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(float value) {
		setConstNumber(offset + 24, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(double value) {
		setConstNumber(offset + 24, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public MCNumber oper_lt_add_qty() {
		return getConstNumber(offset + 25, $oper_lt_add_qty);
	}

	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public void oper_lt_add_qty(MCNumber value) {
		setConstNumber(offset + 25, $oper_lt_add_qty, value);
	}
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public void oper_lt_add_qty(int value) {
		setConstNumber(offset + 25, $oper_lt_add_qty, value);
	}
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public void oper_lt_add_qty(long value) {
		setConstNumber(offset + 25, $oper_lt_add_qty, value);
	}
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public void oper_lt_add_qty(float value) {
		setConstNumber(offset + 25, $oper_lt_add_qty, value);
	}
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public void oper_lt_add_qty(double value) {
		setConstNumber(offset + 25, $oper_lt_add_qty, value);
	}
	
	/**
	 * 工程オフセット区分. Operation offset type.<p>
	 *
	 */
	public String oper_offst_typ() {
		return getConstString(offset + 26, $oper_offst_typ);
	}

	/**
	 * 工程オフセット区分. Operation offset type.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		setConstString(offset + 26, $oper_offst_typ, value);
	}

	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return getConstNumber(offset + 27, $oper_offst);
	}

	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		setConstNumber(offset + 27, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(int value) {
		setConstNumber(offset + 27, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(long value) {
		setConstNumber(offset + 27, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(float value) {
		setConstNumber(offset + 27, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(double value) {
		setConstNumber(offset + 27, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public MCNumber oper_offst_add_qty() {
		return getConstNumber(offset + 28, $oper_offst_add_qty);
	}

	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public void oper_offst_add_qty(MCNumber value) {
		setConstNumber(offset + 28, $oper_offst_add_qty, value);
	}
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public void oper_offst_add_qty(int value) {
		setConstNumber(offset + 28, $oper_offst_add_qty, value);
	}
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public void oper_offst_add_qty(long value) {
		setConstNumber(offset + 28, $oper_offst_add_qty, value);
	}
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public void oper_offst_add_qty(float value) {
		setConstNumber(offset + 28, $oper_offst_add_qty, value);
	}
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public void oper_offst_add_qty(double value) {
		setConstNumber(offset + 28, $oper_offst_add_qty, value);
	}
	
	/**
	 * 期限起算日使用工程ＦＬＧ. Expiration base date use operation flg..<p>
	 *
	 */
	public boolean lmt_fr_dt_flg() {
		return getConstBoolean(offset + 29, $lmt_fr_dt_flg);
	}

	/**
	 * 期限起算日使用工程ＦＬＧ. Expiration base date use operation flg..<p>
	 *
	 */
	public void lmt_fr_dt_flg(boolean value) {
		setConstBoolean(offset + 29, $lmt_fr_dt_flg, value);
	}

	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return getConstNumber(offset + 30, $oper_lower_yield);
	}

	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		setConstNumber(offset + 30, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		setConstNumber(offset + 30, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		setConstNumber(offset + 30, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		setConstNumber(offset + 30, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		setConstNumber(offset + 30, $oper_lower_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return getConstNumber(offset + 31, $oper_std_yield);
	}

	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		setConstNumber(offset + 31, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		setConstNumber(offset + 31, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		setConstNumber(offset + 31, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		setConstNumber(offset + 31, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		setConstNumber(offset + 31, $oper_std_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return getConstNumber(offset + 32, $oper_upper_yield);
	}

	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		setConstNumber(offset + 32, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		setConstNumber(offset + 32, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		setConstNumber(offset + 32, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		setConstNumber(offset + 32, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		setConstNumber(offset + 32, $oper_upper_yield, value);
	}
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public MCNumber wip_rate() {
		return getConstNumber(offset + 33, $wip_rate);
	}

	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public void wip_rate(MCNumber value) {
		setConstNumber(offset + 33, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public void wip_rate(int value) {
		setConstNumber(offset + 33, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public void wip_rate(long value) {
		setConstNumber(offset + 33, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public void wip_rate(float value) {
		setConstNumber(offset + 33, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗度. WIP progress.<p>
	 *
	 */
	public void wip_rate(double value) {
		setConstNumber(offset + 33, $wip_rate, value);
	}
	
	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 34, $yield_oper_flg);
	}

	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 34, $yield_oper_flg, value);
	}

	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public MCNumber yield_oper_ratio() {
		return getConstNumber(offset + 35, $yield_oper_ratio);
	}

	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public void yield_oper_ratio(MCNumber value) {
		setConstNumber(offset + 35, $yield_oper_ratio, value);
	}
	
	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public void yield_oper_ratio(int value) {
		setConstNumber(offset + 35, $yield_oper_ratio, value);
	}
	
	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public void yield_oper_ratio(long value) {
		setConstNumber(offset + 35, $yield_oper_ratio, value);
	}
	
	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public void yield_oper_ratio(float value) {
		setConstNumber(offset + 35, $yield_oper_ratio, value);
	}
	
	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public void yield_oper_ratio(double value) {
		setConstNumber(offset + 35, $yield_oper_ratio, value);
	}
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 36, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 36, $can_flg, value);
	}

	/**
	 * 工程打切ＦＬＧ. Cancel remaining operation flg..<p>
	 *
	 */
	public boolean oper_abort_flg() {
		return getConstBoolean(offset + 37, $oper_abort_flg);
	}

	/**
	 * 工程打切ＦＬＧ. Cancel remaining operation flg..<p>
	 *
	 */
	public void oper_abort_flg(boolean value) {
		setConstBoolean(offset + 37, $oper_abort_flg, value);
	}

	/**
	 * ＭＥＳＦＬＧ. MES flg..<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 38, $mes_flg);
	}

	/**
	 * ＭＥＳＦＬＧ. MES flg..<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 38, $mes_flg, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 39, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 39, $intr_rmrks, value);
	}

	/**
	 * 指図書備考. Order sheet remarks.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 40, $inst_rpt_rmrks);
	}

	/**
	 * 指図書備考. Order sheet remarks.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 40, $inst_rpt_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 41, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 41, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 42, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 42, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 43, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 43, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 44, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 44, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 45, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 45, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 46, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 46, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 47, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 47, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 48, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 49, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 49, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 50, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 50, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 51, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 51, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 52, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 52, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 53, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 53, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			return oper_inst_grp();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			return oper_lt_add_qty();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			return oper_offst_add_qty();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			return yield_oper_ratio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
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
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			return unschd_inst_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			return lmt_fr_dt_flg();
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($oper_abort_flg.equalsIgnoreCase(name)) {
			return oper_abort_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			return oper_inst_grp();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			return oper_lt_add_qty();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			return oper_offst_add_qty();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			return yield_oper_ratio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
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
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			return unschd_inst_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			return lmt_fr_dt_flg();
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($oper_abort_flg.equalsIgnoreCase(name)) {
			return oper_abort_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			oper_inst_grp(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
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
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			unschd_inst_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			lmt_fr_dt_flg(value);
			return;
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($oper_abort_flg.equalsIgnoreCase(name)) {
			oper_abort_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			oper_inst_grp(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
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
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			unschd_inst_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			lmt_fr_dt_flg(value);
			return;
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($oper_abort_flg.equalsIgnoreCase(name)) {
			oper_abort_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
