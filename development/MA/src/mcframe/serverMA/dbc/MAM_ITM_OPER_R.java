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
 * "品目工程マスタ // Item operation master"DBコンテナRowクラスです。<p>
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
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>oper_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程パタン</td>
 *  	<td>Operation pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用開始日</td>
 *  	<td>Application start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用終了日</td>
 *  	<td>Application end date</td>
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
 *  	<td>oper_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程ＬＴ</td>
 *  	<td>Operation LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_lt_add_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＬＴ加算基準数量</td>
 *  	<td>Operation LT add base qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_offst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程オフセット区分</td>
 *  	<td>Operation offset type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_offst</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程オフセット</td>
 *  	<td>Operation offset</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_offst_add_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程オフセット加算基準数量</td>
 *  	<td>Operation offset add base qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程管理単位ＣＤ</td>
 *  	<td>Operation management unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程基準単位数量</td>
 *  	<td>Operation base unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_conv_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程換算単位数量</td>
 *  	<td>Operation conversion unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>小数部有効桁数</td>
 *  	<td>Number of decimal places</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_conv_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>換算端数処理区分</td>
 *  	<td>Rounding type (Conversion)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_oper_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高計上工程ＦＬＧ</td>
 *  	<td>Create inventory flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_oper_ratio</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高工程比率</td>
 *  	<td>Output operation ratio</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_inst_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程指図グループ</td>
 *  	<td>Operation order group</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程場所ＣＤ</td>
 *  	<td>Operation location cd.</td>
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
 *  	<td>仕掛進捗率</td>
 *  	<td>WIP progress rate</td>
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
 *  	<td>not_cost_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価対象外ＦＬＧ</td>
 *  	<td>Not costing flg.</td>
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
 *  	<td>loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LOC1.LOC_NM</td>
 *  	<td>場所名</td>
 *  	<td>Location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>OPER1.OPER_NM</td>
 *  	<td>工程名</td>
 *  	<td>Operation name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>UNIT1.UNIT_NM</td>
 *  	<td>工程管理単位名</td>
 *  	<td>Operation management unit name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LOC2.LOC_NM</td>
 *  	<td>工程場所名</td>
 *  	<td>Operation location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_ITM_OPER_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_ITM_OPER";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
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
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	private static final MCPermColumnInfo _oper_ptn = createColumnInfo("oper_ptn");
	public final MCStringPermColumn oper_ptn = createStringColumn(_oper_ptn);
	
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
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	private static final MCPermColumnInfo _st_dt = createColumnInfo("st_dt");
	public final MCDatePermColumn st_dt = createDateColumn(_st_dt);
	
	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	private static final MCPermColumnInfo _end_dt = createColumnInfo("end_dt");
	public final MCDatePermColumn end_dt = createDateColumn(_end_dt);
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
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
	 * 工程管理単位ＣＤ. Operation management unit cd..<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	private static final MCPermColumnInfo _oper_unit_cd = createColumnInfo("oper_unit_cd");
	public final MCStringPermColumn oper_unit_cd = createStringColumn(_oper_unit_cd);
	
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
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	private static final MCPermColumnInfo _dec_place = createColumnInfo("dec_place");
	public final MCNumberPermColumn dec_place = createNumberColumn(_dec_place);
	
	/**
	 * 換算端数処理区分. Rounding type (Conversion).<p>
	 *
	 */
	public static final String $unit_conv_rnd_typ = "unit_conv_rnd_typ";
	private static final MCPermColumnInfo _unit_conv_rnd_typ = createColumnInfo("unit_conv_rnd_typ");
	public final MCStringPermColumn unit_conv_rnd_typ = createStringColumn(_unit_conv_rnd_typ);
	
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
	 * 工程指図グループ. Operation order group.<p>
	 *
	 */
	public static final String $oper_inst_grp = "oper_inst_grp";
	private static final MCPermColumnInfo _oper_inst_grp = createColumnInfo("oper_inst_grp");
	public final MCStringPermColumn oper_inst_grp = createStringColumn(_oper_inst_grp);
	
	/**
	 * 工程場所ＣＤ. Operation location cd..<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	private static final MCPermColumnInfo _oper_loc_cd = createColumnInfo("oper_loc_cd");
	public final MCStringPermColumn oper_loc_cd = createStringColumn(_oper_loc_cd);
	
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
	 * 仕掛進捗率. WIP progress rate.<p>
	 *
	 */
	public static final String $wip_rate = "wip_rate";
	private static final MCPermColumnInfo _wip_rate = createColumnInfo("wip_rate");
	public final MCNumberPermColumn wip_rate = createNumberColumn(_wip_rate);
	
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
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public static final String $not_cost_flg = "not_cost_flg";
	private static final MCPermColumnInfo _not_cost_flg = createColumnInfo("not_cost_flg");
	public final MCBooleanPermColumn not_cost_flg = createBooleanColumn(_not_cost_flg);
	
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
	 * 場所名. Location name.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	
	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	
	/**
	 * 工程管理単位名. Operation management unit name.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	
	/**
	 * 工程場所名. Operation location name.<p>
	 *
	 */
	public static final String $oper_loc_nm = "oper_loc_nm";
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_lt_META = createCommonMeta($oper_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta oper_lt_add_qty_META = createCommonMeta($oper_lt_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_offst_typ_META = createCommonMeta($oper_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta oper_offst_META = createCommonMeta($oper_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta oper_offst_add_qty_META = createCommonMeta($oper_offst_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unit_conv_rnd_typ_META = createCommonMeta($unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_oper_ratio_META = createCommonMeta($yield_oper_ratio, mcframe.commonMA.meta.MA_META.YIELD_OPER_RATIO);
	public static final MCMeta oper_inst_grp_META = createCommonMeta($oper_inst_grp, mcframe.commonMA.meta.MA_META.OPER_INST_GRP);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta lmt_fr_dt_flg_META = createCommonMeta($lmt_fr_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_lower_yield_META = createCommonMeta($oper_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_std_yield_META = createCommonMeta($oper_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_upper_yield_META = createCommonMeta($oper_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta wip_rate_META = createCommonMeta($wip_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta not_cost_flg_META = createCommonMeta($not_cost_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $LOC1 = "LOC1";
	public static final String $OPER1 = "OPER1";
	public static final String $UNIT1 = "UNIT1";
	public static final String $LOC2 = "LOC2";
	public static final String $ITM1 = "ITM1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LOC",
				$LOC1,
				new String[][]{
						{"loc_cd", "loc_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LOC_R.create("LOC1");
				},
				(alias) -> {
					MAM_ITM_OPER_R own = MAM_ITM_OPER_R.create(alias);
					mcframe.serverMA.dbc.MAM_LOC_R ref = mcframe.serverMA.dbc.MAM_LOC_R.create("LOC1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.loc_cd.eq(ref.loc_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_OPER",
				$OPER1,
				new String[][]{
						{"oper_cd", "oper_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_OPER_R.create("OPER1");
				},
				(alias) -> {
					MAM_ITM_OPER_R own = MAM_ITM_OPER_R.create(alias);
					mcframe.serverMA.dbc.MAM_OPER_R ref = mcframe.serverMA.dbc.MAM_OPER_R.create("OPER1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.oper_cd.eq(ref.oper_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT",
				$UNIT1,
				new String[][]{
						{"oper_unit_cd", "unit_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT1");
				},
				(alias) -> {
					MAM_ITM_OPER_R own = MAM_ITM_OPER_R.create(alias);
					mcframe.serverMA.dbc.MAM_UNIT_R ref = mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.oper_unit_cd.eq(ref.unit_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LOC",
				$LOC2,
				new String[][]{
						{"oper_loc_cd", "loc_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LOC_R.create("LOC2");
				},
				(alias) -> {
					MAM_ITM_OPER_R own = MAM_ITM_OPER_R.create(alias);
					mcframe.serverMA.dbc.MAM_LOC_R ref = mcframe.serverMA.dbc.MAM_LOC_R.create("LOC2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.oper_loc_cd.eq(ref.loc_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM1,
				new String[][]{
						{"itm_cd", "itm_cd"},
						{"itm_sub1", "itm_sub1"},
						{"itm_sub2", "itm_sub2"},
						{"itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
				},
				(alias) -> {
					MAM_ITM_OPER_R own = MAM_ITM_OPER_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_ITM_OPER_R> constMetas = new ConstMetaList<MAM_ITM_OPER_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			loc_cd_META,
			oper_ptn_META,
			oper_cd_META,
			oper_seq_META,
			st_dt_META,
			end_dt_META,
			disp_seq_META,
			oper_lt_META,
			oper_lt_add_qty_META,
			oper_offst_typ_META,
			oper_offst_META,
			oper_offst_add_qty_META,
			oper_unit_cd_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			dec_place_META,
			unit_conv_rnd_typ_META,
			yield_oper_flg_META,
			yield_oper_ratio_META,
			oper_inst_grp_META,
			oper_loc_cd_META,
			lmt_fr_dt_flg_META,
			oper_lower_yield_META,
			oper_std_yield_META,
			oper_upper_yield_META,
			wip_rate_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			not_cost_flg_META,
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
			loc_nm_META,
			oper_nm_META,
			oper_unit_nm_META,
			oper_loc_nm_META,
			itm_nm_META
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
	protected MAM_ITM_OPER_R(ConstMetaList<? extends MAM_ITM_OPER_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_ITM_OPER_R(ConstMetaList<? extends MAM_ITM_OPER_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$loc_cd,
				"loc_cd",
				loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$oper_ptn,
				"oper_ptn",
				oper_ptn,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$oper_cd,
				"oper_cd",
				oper_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$oper_seq,
				"oper_seq",
				oper_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_ITM_OPER_R.$st_dt,
				"st_dt",
				st_dt,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_ITM_OPER_R.$end_dt,
				"end_dt",
				end_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$disp_seq,
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
			MAM_ITM_OPER_R.$oper_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$oper_lt,
				"oper_lt",
				oper_lt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_lt_add_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$oper_lt_add_qty,
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
			MAM_ITM_OPER_R.$oper_offst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$oper_offst_typ,
				"oper_offst_typ",
				oper_offst_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_offst,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$oper_offst,
				"oper_offst",
				oper_offst,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_offst_add_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$oper_offst_add_qty,
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
			MAM_ITM_OPER_R.$oper_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$oper_unit_cd,
				"oper_unit_cd",
				oper_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$oper_std_qty,
				"oper_std_qty",
				oper_std_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_conv_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$oper_conv_qty,
				"oper_conv_qty",
				oper_conv_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$dec_place,
				"dec_place",
				dec_place,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$unit_conv_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$unit_conv_rnd_typ,
				"unit_conv_rnd_typ",
				unit_conv_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$yield_oper_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_OPER_R.$yield_oper_flg,
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
			MAM_ITM_OPER_R.$yield_oper_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$yield_oper_ratio,
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
			MAM_ITM_OPER_R.$oper_inst_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$oper_inst_grp,
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
			MAM_ITM_OPER_R.$oper_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$oper_loc_cd,
				"oper_loc_cd",
				oper_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$lmt_fr_dt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_OPER_R.$lmt_fr_dt_flg,
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
			MAM_ITM_OPER_R.$oper_lower_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$oper_lower_yield,
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
			MAM_ITM_OPER_R.$oper_std_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$oper_std_yield,
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
			MAM_ITM_OPER_R.$oper_upper_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$oper_upper_yield,
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
			MAM_ITM_OPER_R.$wip_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$wip_rate,
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
			MAM_ITM_OPER_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$sno1,
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
			MAM_ITM_OPER_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$sno2,
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
			MAM_ITM_OPER_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$sno3,
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
			MAM_ITM_OPER_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$sno4,
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
			MAM_ITM_OPER_R.$not_cost_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_OPER_R.$not_cost_flg,
				"not_cost_flg",
				not_cost_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$memo1,
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
			MAM_ITM_OPER_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$memo2,
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
			MAM_ITM_OPER_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$memo3,
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
			MAM_ITM_OPER_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_OPER_R.$del_flg,
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
			MAM_ITM_OPER_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$del_usr_id,
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
			MAM_ITM_OPER_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$del_usr_nm,
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
			MAM_ITM_OPER_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_OPER_R.$del_ts,
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
			MAM_ITM_OPER_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$ins_usr_id,
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
			MAM_ITM_OPER_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$ins_usr_nm,
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
			MAM_ITM_OPER_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_OPER_R.$ins_ts,
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
			MAM_ITM_OPER_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$ins_func_id,
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
			MAM_ITM_OPER_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_OPER_R.$upd_cntr,
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
			MAM_ITM_OPER_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$upd_usr_id,
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
			MAM_ITM_OPER_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$upd_usr_nm,
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
			MAM_ITM_OPER_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_OPER_R.$upd_ts,
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
			MAM_ITM_OPER_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$upd_func_id,
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
			MAM_ITM_OPER_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$upd_srv_req_no,
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
			MAM_ITM_OPER_R.$loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$loc_nm,
				"loc_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LOC1.LOC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$oper_nm,
				"oper_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"OPER1.OPER_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$oper_unit_nm,
				"oper_unit_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"UNIT1.UNIT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$oper_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$oper_loc_nm,
				"oper_loc_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LOC2.LOC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_OPER_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_OPER_R.$itm_nm,
				"itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM1.ITM_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_ITM_OPER_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_ITM_OPER_R create(String alias) {
		MAM_ITM_OPER_R row = new MAM_ITM_OPER_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_ITM_OPER_R createByName(T proto) {
		MAM_ITM_OPER_R row = MAM_ITM_OPER_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_OPER_R clone() {
		return (MAM_ITM_OPER_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_OPER_R createInstance() {
		return (MAM_ITM_OPER_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_OPER_R getValues(String... names) {
		return (MAM_ITM_OPER_R) super.getValues(names);
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
	 public MAW_ITM_OPER_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_ITM_OPER_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_ITM_OPER_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_ITM_OPER_KEY_R.TABLE_NAME);
	 }

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 4, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 4, $loc_cd, value);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 5, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 5, $oper_ptn, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 6, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 6, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 7, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 7, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 7, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 7, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 7, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 7, $oper_seq, value);
	}
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 8, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 8, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 9, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 9, $end_dt, value);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 10, $disp_seq);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return getConstNumber(offset + 11, $oper_lt);
	}

	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		setConstNumber(offset + 11, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(int value) {
		setConstNumber(offset + 11, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(long value) {
		setConstNumber(offset + 11, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(float value) {
		setConstNumber(offset + 11, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(double value) {
		setConstNumber(offset + 11, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public MCNumber oper_lt_add_qty() {
		return getConstNumber(offset + 12, $oper_lt_add_qty);
	}

	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public void oper_lt_add_qty(MCNumber value) {
		setConstNumber(offset + 12, $oper_lt_add_qty, value);
	}
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public void oper_lt_add_qty(int value) {
		setConstNumber(offset + 12, $oper_lt_add_qty, value);
	}
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public void oper_lt_add_qty(long value) {
		setConstNumber(offset + 12, $oper_lt_add_qty, value);
	}
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public void oper_lt_add_qty(float value) {
		setConstNumber(offset + 12, $oper_lt_add_qty, value);
	}
	
	/**
	 * 工程ＬＴ加算基準数量. Operation LT add base qty..<p>
	 *
	 */
	public void oper_lt_add_qty(double value) {
		setConstNumber(offset + 12, $oper_lt_add_qty, value);
	}
	
	/**
	 * 工程オフセット区分. Operation offset type.<p>
	 *
	 */
	public String oper_offst_typ() {
		return getConstString(offset + 13, $oper_offst_typ);
	}

	/**
	 * 工程オフセット区分. Operation offset type.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		setConstString(offset + 13, $oper_offst_typ, value);
	}

	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return getConstNumber(offset + 14, $oper_offst);
	}

	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		setConstNumber(offset + 14, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(int value) {
		setConstNumber(offset + 14, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(long value) {
		setConstNumber(offset + 14, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(float value) {
		setConstNumber(offset + 14, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(double value) {
		setConstNumber(offset + 14, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public MCNumber oper_offst_add_qty() {
		return getConstNumber(offset + 15, $oper_offst_add_qty);
	}

	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public void oper_offst_add_qty(MCNumber value) {
		setConstNumber(offset + 15, $oper_offst_add_qty, value);
	}
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public void oper_offst_add_qty(int value) {
		setConstNumber(offset + 15, $oper_offst_add_qty, value);
	}
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public void oper_offst_add_qty(long value) {
		setConstNumber(offset + 15, $oper_offst_add_qty, value);
	}
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public void oper_offst_add_qty(float value) {
		setConstNumber(offset + 15, $oper_offst_add_qty, value);
	}
	
	/**
	 * 工程オフセット加算基準数量. Operation offset add base qty..<p>
	 *
	 */
	public void oper_offst_add_qty(double value) {
		setConstNumber(offset + 15, $oper_offst_add_qty, value);
	}
	
	/**
	 * 工程管理単位ＣＤ. Operation management unit cd..<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 16, $oper_unit_cd);
	}

	/**
	 * 工程管理単位ＣＤ. Operation management unit cd..<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 16, $oper_unit_cd, value);
	}

	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 17, $oper_std_qty);
	}

	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 17, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 17, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 17, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 17, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 17, $oper_std_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 18, $oper_conv_qty);
	}

	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 18, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 18, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 18, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 18, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 18, $oper_conv_qty, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 19, $dec_place);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 19, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 19, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 19, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 19, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 19, $dec_place, value);
	}
	
	/**
	 * 換算端数処理区分. Rounding type (Conversion).<p>
	 *
	 */
	public String unit_conv_rnd_typ() {
		return getConstString(offset + 20, $unit_conv_rnd_typ);
	}

	/**
	 * 換算端数処理区分. Rounding type (Conversion).<p>
	 *
	 */
	public void unit_conv_rnd_typ(String value) {
		setConstString(offset + 20, $unit_conv_rnd_typ, value);
	}

	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 21, $yield_oper_flg);
	}

	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 21, $yield_oper_flg, value);
	}

	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public MCNumber yield_oper_ratio() {
		return getConstNumber(offset + 22, $yield_oper_ratio);
	}

	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public void yield_oper_ratio(MCNumber value) {
		setConstNumber(offset + 22, $yield_oper_ratio, value);
	}
	
	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public void yield_oper_ratio(int value) {
		setConstNumber(offset + 22, $yield_oper_ratio, value);
	}
	
	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public void yield_oper_ratio(long value) {
		setConstNumber(offset + 22, $yield_oper_ratio, value);
	}
	
	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public void yield_oper_ratio(float value) {
		setConstNumber(offset + 22, $yield_oper_ratio, value);
	}
	
	/**
	 * 出来高工程比率. Output operation ratio.<p>
	 *
	 */
	public void yield_oper_ratio(double value) {
		setConstNumber(offset + 22, $yield_oper_ratio, value);
	}
	
	/**
	 * 工程指図グループ. Operation order group.<p>
	 *
	 */
	public String oper_inst_grp() {
		return getConstString(offset + 23, $oper_inst_grp);
	}

	/**
	 * 工程指図グループ. Operation order group.<p>
	 *
	 */
	public void oper_inst_grp(String value) {
		setConstString(offset + 23, $oper_inst_grp, value);
	}

	/**
	 * 工程場所ＣＤ. Operation location cd..<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 24, $oper_loc_cd);
	}

	/**
	 * 工程場所ＣＤ. Operation location cd..<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 24, $oper_loc_cd, value);
	}

	/**
	 * 期限起算日使用工程ＦＬＧ. Expiration base date use operation flg..<p>
	 *
	 */
	public boolean lmt_fr_dt_flg() {
		return getConstBoolean(offset + 25, $lmt_fr_dt_flg);
	}

	/**
	 * 期限起算日使用工程ＦＬＧ. Expiration base date use operation flg..<p>
	 *
	 */
	public void lmt_fr_dt_flg(boolean value) {
		setConstBoolean(offset + 25, $lmt_fr_dt_flg, value);
	}

	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return getConstNumber(offset + 26, $oper_lower_yield);
	}

	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		setConstNumber(offset + 26, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		setConstNumber(offset + 26, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		setConstNumber(offset + 26, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		setConstNumber(offset + 26, $oper_lower_yield, value);
	}
	
	/**
	 * 工程下限収率. Operation min. yield.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		setConstNumber(offset + 26, $oper_lower_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return getConstNumber(offset + 27, $oper_std_yield);
	}

	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		setConstNumber(offset + 27, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		setConstNumber(offset + 27, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		setConstNumber(offset + 27, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		setConstNumber(offset + 27, $oper_std_yield, value);
	}
	
	/**
	 * 工程標準収率. Operation standard yield.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		setConstNumber(offset + 27, $oper_std_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return getConstNumber(offset + 28, $oper_upper_yield);
	}

	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		setConstNumber(offset + 28, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		setConstNumber(offset + 28, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		setConstNumber(offset + 28, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		setConstNumber(offset + 28, $oper_upper_yield, value);
	}
	
	/**
	 * 工程上限収率. Operation max. yield.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		setConstNumber(offset + 28, $oper_upper_yield, value);
	}
	
	/**
	 * 仕掛進捗率. WIP progress rate.<p>
	 *
	 */
	public MCNumber wip_rate() {
		return getConstNumber(offset + 29, $wip_rate);
	}

	/**
	 * 仕掛進捗率. WIP progress rate.<p>
	 *
	 */
	public void wip_rate(MCNumber value) {
		setConstNumber(offset + 29, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗率. WIP progress rate.<p>
	 *
	 */
	public void wip_rate(int value) {
		setConstNumber(offset + 29, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗率. WIP progress rate.<p>
	 *
	 */
	public void wip_rate(long value) {
		setConstNumber(offset + 29, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗率. WIP progress rate.<p>
	 *
	 */
	public void wip_rate(float value) {
		setConstNumber(offset + 29, $wip_rate, value);
	}
	
	/**
	 * 仕掛進捗率. WIP progress rate.<p>
	 *
	 */
	public void wip_rate(double value) {
		setConstNumber(offset + 29, $wip_rate, value);
	}
	
	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 30, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 30, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 31, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 31, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 32, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 32, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 33, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 33, $sno4, value);
	}

	/**
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public boolean not_cost_flg() {
		return getConstBoolean(offset + 34, $not_cost_flg);
	}

	/**
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public void not_cost_flg(boolean value) {
		setConstBoolean(offset + 34, $not_cost_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 35, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 35, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 36, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 36, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 37, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 37, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 38, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 38, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 39, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 39, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 40, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 40, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 41, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 41, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 42, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 42, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 43, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 43, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 44, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 44, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 45, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 45, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 46, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 47, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 47, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 48, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 48, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 49, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 50, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 50, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 51, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 51, $upd_srv_req_no, value);
	}

	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 52, $loc_nm);
	}

	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 52, $loc_nm, value);
	}

	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 53, $oper_nm);
	}

	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 53, $oper_nm, value);
	}

	/**
	 * 工程管理単位名. Operation management unit name.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 54, $oper_unit_nm);
	}

	/**
	 * 工程管理単位名. Operation management unit name.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 54, $oper_unit_nm, value);
	}

	/**
	 * 工程場所名. Operation location name.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 55, $oper_loc_nm);
	}

	/**
	 * 工程場所名. Operation location name.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 55, $oper_loc_nm, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 56, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 56, $itm_nm, value);
	}

	public String getString(String name) {
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			return oper_inst_grp();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
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
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			return yield_oper_ratio();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			return lmt_fr_dt_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			return oper_inst_grp();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
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
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			return yield_oper_ratio();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			return lmt_fr_dt_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			oper_inst_grp(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
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
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			lmt_fr_dt_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			oper_inst_grp(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
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
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			lmt_fr_dt_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
