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
 * "得意先販売単価マスタ（マスタ画面用） // Customer sales unit price master"DBコンテナRowクラスです。<p>
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
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>dlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先ＣＤ</td>
 *  	<td>Delivery destination cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>dest_cd1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ１</td>
 *  	<td>Distribution channel cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>dest_cd2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ２</td>
 *  	<td>Distribution channel cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>dest_cd3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ３</td>
 *  	<td>Distribution channel cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sls_upri_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売単価分類ＣＤ</td>
 *  	<td>Sales unit price classification cd.</td>
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
 *  	<td>unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単位ＣＤ</td>
 *  	<td>Unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>lot_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット数量</td>
 *  	<td>Lot qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
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
 *  	<td>upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単価</td>
 *  	<td>Unit price</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upri_bf</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>改定前単価</td>
 *  	<td>Unit price before revised</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>interim_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仮単価ＦＬＧ</td>
 *  	<td>Temporary unit price flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upri_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>掛率（％）</td>
 *  	<td>Ratio (%)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upri_rate_bf</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>改定前掛率（％）</td>
 *  	<td>Ratio before revision (%)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_upri1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備単価１</td>
 *  	<td>Spare unit price 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_upri2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備単価２</td>
 *  	<td>Spare unit price 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_upri3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備単価３</td>
 *  	<td>Spare unit price 3</td>
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
 *  	<td>upri_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単価区分</td>
 *  	<td>Unit price type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP1.BP_NM</td>
 *  	<td>得意先名</td>
 *  	<td>Customer name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP2.BP_NM</td>
 *  	<td>納品先名</td>
 *  	<td>Delivery destination name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP3.BP_NM</td>
 *  	<td>仕向先名１</td>
 *  	<td>Distribution channel name 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dest_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP4.BP_NM</td>
 *  	<td>仕向先名２</td>
 *  	<td>Distribution channel name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP5.BP_NM</td>
 *  	<td>仕向先名３</td>
 *  	<td>Distribution channel name 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_upri_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>SLS_UPRI_GRP1.SLS_UPRI_GRP_NM</td>
 *  	<td>販売単価分類名</td>
 *  	<td>Sales unit price classification name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>UNIT1.UNIT_NM</td>
 *  	<td>単位名</td>
 *  	<td>Unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CUR1.CUR_NM</td>
 *  	<td>通貨名</td>
 *  	<td>Currency name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>WG1.WG_NM</td>
 *  	<td>ワーキンググループ名</td>
 *  	<td>WG name</td>
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
public class MAM_CST_SLS_UPRI__R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAM_CST_SLS_UPRI_";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	private static final MCPermColumnInfo _dlv_cd = createColumnInfo("dlv_cd");
	public final MCStringPermColumn dlv_cd = createStringColumn(_dlv_cd);
	
	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	private static final MCPermColumnInfo _dest_cd1 = createColumnInfo("dest_cd1");
	public final MCStringPermColumn dest_cd1 = createStringColumn(_dest_cd1);
	
	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	private static final MCPermColumnInfo _dest_cd2 = createColumnInfo("dest_cd2");
	public final MCStringPermColumn dest_cd2 = createStringColumn(_dest_cd2);
	
	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	private static final MCPermColumnInfo _dest_cd3 = createColumnInfo("dest_cd3");
	public final MCStringPermColumn dest_cd3 = createStringColumn(_dest_cd3);
	
	/**
	 * 販売単価分類ＣＤ. Sales unit price classification cd..<p>
	 *
	 */
	public static final String $sls_upri_grp_cd = "sls_upri_grp_cd";
	private static final MCPermColumnInfo _sls_upri_grp_cd = createColumnInfo("sls_upri_grp_cd");
	public final MCStringPermColumn sls_upri_grp_cd = createStringColumn(_sls_upri_grp_cd);
	
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
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	private static final MCPermColumnInfo _unit_cd = createColumnInfo("unit_cd");
	public final MCStringPermColumn unit_cd = createStringColumn(_unit_cd);
	
	/**
	 * ロット数量. Lot qty..<p>
	 *
	 */
	public static final String $lot_qty = "lot_qty";
	private static final MCPermColumnInfo _lot_qty = createColumnInfo("lot_qty");
	public final MCNumberPermColumn lot_qty = createNumberColumn(_lot_qty);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
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
	 * 単価. Unit price.<p>
	 *
	 */
	public static final String $upri = "upri";
	private static final MCPermColumnInfo _upri = createColumnInfo("upri");
	public final MCNumberPermColumn upri = createNumberColumn(_upri);
	
	/**
	 * 改定前単価. Unit price before revised.<p>
	 *
	 */
	public static final String $upri_bf = "upri_bf";
	private static final MCPermColumnInfo _upri_bf = createColumnInfo("upri_bf");
	public final MCNumberPermColumn upri_bf = createNumberColumn(_upri_bf);
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	private static final MCPermColumnInfo _interim_flg = createColumnInfo("interim_flg");
	public final MCBooleanPermColumn interim_flg = createBooleanColumn(_interim_flg);
	
	/**
	 * 掛率（％）. Ratio (%).<p>
	 *
	 */
	public static final String $upri_rate = "upri_rate";
	private static final MCPermColumnInfo _upri_rate = createColumnInfo("upri_rate");
	public final MCNumberPermColumn upri_rate = createNumberColumn(_upri_rate);
	
	/**
	 * 改定前掛率（％）. Ratio before revision (%).<p>
	 *
	 */
	public static final String $upri_rate_bf = "upri_rate_bf";
	private static final MCPermColumnInfo _upri_rate_bf = createColumnInfo("upri_rate_bf");
	public final MCNumberPermColumn upri_rate_bf = createNumberColumn(_upri_rate_bf);
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public static final String $sub_upri1 = "sub_upri1";
	private static final MCPermColumnInfo _sub_upri1 = createColumnInfo("sub_upri1");
	public final MCNumberPermColumn sub_upri1 = createNumberColumn(_sub_upri1);
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public static final String $sub_upri2 = "sub_upri2";
	private static final MCPermColumnInfo _sub_upri2 = createColumnInfo("sub_upri2");
	public final MCNumberPermColumn sub_upri2 = createNumberColumn(_sub_upri2);
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public static final String $sub_upri3 = "sub_upri3";
	private static final MCPermColumnInfo _sub_upri3 = createColumnInfo("sub_upri3");
	public final MCNumberPermColumn sub_upri3 = createNumberColumn(_sub_upri3);
	
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
	 * 単価区分. Unit price type.<p>
	 *
	 */
	public static final String $upri_typ = "upri_typ";
	private static final MCPermColumnInfo _upri_typ = createColumnInfo("upri_typ");
	public final MCStringPermColumn upri_typ = createStringColumn(_upri_typ);
	
	/**
	 * 得意先名. Customer name.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	
	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	
	/**
	 * 仕向先名１. Distribution channel name 1.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	
	/**
	 * 仕向先名２. Distribution channel name 2.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	
	/**
	 * 仕向先名３. Distribution channel name 3.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	
	/**
	 * 販売単価分類名. Sales unit price classification name.<p>
	 *
	 */
	public static final String $sls_upri_grp_nm = "sls_upri_grp_nm";
	
	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	
	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sls_upri_grp_cd_META = createCommonMeta($sls_upri_grp_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta lot_qty_META = createCommonMeta($lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upri_META = createCommonMeta($upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri_bf_META = createCommonMeta($upri_bf, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upri_rate_META = createCommonMeta($upri_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta upri_rate_bf_META = createCommonMeta($upri_rate_bf, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta sub_upri1_META = createCommonMeta($sub_upri1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_upri2_META = createCommonMeta($sub_upri2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_upri3_META = createCommonMeta($sub_upri3, mcframe.commonMA.meta.MA_META.MONEY);
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
	public static final MCMeta upri_typ_META = createCommonMeta($upri_typ, mcframe.commonMA.meta.MA_META.UPRI_TYP);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sls_upri_grp_nm_META = createCommonMeta($sls_upri_grp_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_NM);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $BP1 = "BP1";
	public static final String $BP2 = "BP2";
	public static final String $BP3 = "BP3";
	public static final String $BP4 = "BP4";
	public static final String $BP5 = "BP5";
	public static final String $SLS_UPRI_GRP1 = "SLS_UPRI_GRP1";
	public static final String $UNIT1 = "UNIT1";
	public static final String $CUR1 = "CUR1";
	public static final String $WG1 = "WG1";
	public static final String $ITM1 = "ITM1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP1,
				new String[][]{
						{"cst_cd", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
				},
				(alias) -> {
					MAM_CST_SLS_UPRI__R own = MAM_CST_SLS_UPRI__R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cst_cd.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP2,
				new String[][]{
						{"dlv_cd", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP2");
				},
				(alias) -> {
					MAM_CST_SLS_UPRI__R own = MAM_CST_SLS_UPRI__R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dlv_cd.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP3,
				new String[][]{
						{"dest_cd1", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP3");
				},
				(alias) -> {
					MAM_CST_SLS_UPRI__R own = MAM_CST_SLS_UPRI__R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dest_cd1.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP4,
				new String[][]{
						{"dest_cd2", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP4");
				},
				(alias) -> {
					MAM_CST_SLS_UPRI__R own = MAM_CST_SLS_UPRI__R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP4");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dest_cd2.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP5,
				new String[][]{
						{"dest_cd3", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP5");
				},
				(alias) -> {
					MAM_CST_SLS_UPRI__R own = MAM_CST_SLS_UPRI__R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP5");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dest_cd3.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SLS_UPRI_GRP",
				$SLS_UPRI_GRP1,
				new String[][]{
						{"sls_upri_grp_cd", "sls_upri_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_SLS_UPRI_GRP_R.create("SLS_UPRI_GRP1");
				},
				(alias) -> {
					MAM_CST_SLS_UPRI__R own = MAM_CST_SLS_UPRI__R.create(alias);
					mcframe.serverMA.dbc.MAM_SLS_UPRI_GRP_R ref = mcframe.serverMA.dbc.MAM_SLS_UPRI_GRP_R.create("SLS_UPRI_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sls_upri_grp_cd.eq(ref.sls_upri_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT",
				$UNIT1,
				new String[][]{
						{"unit_cd", "unit_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT1");
				},
				(alias) -> {
					MAM_CST_SLS_UPRI__R own = MAM_CST_SLS_UPRI__R.create(alias);
					mcframe.serverMA.dbc.MAM_UNIT_R ref = mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.unit_cd.eq(ref.unit_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CUR",
				$CUR1,
				new String[][]{
						{"cur_cd", "cur_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
				},
				(alias) -> {
					MAM_CST_SLS_UPRI__R own = MAM_CST_SLS_UPRI__R.create(alias);
					mcframe.serverMA.dbc.MAM_CUR_R ref = mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cur_cd.eq(ref.cur_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_WG",
				$WG1,
				new String[][]{
						{"wg_cd", "wg_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
				},
				(alias) -> {
					MAM_CST_SLS_UPRI__R own = MAM_CST_SLS_UPRI__R.create(alias);
					mcframe.serverMA.dbc.MAM_WG_R ref = mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.wg_cd.eq(ref.wg_cd));
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
					MAM_CST_SLS_UPRI__R own = MAM_CST_SLS_UPRI__R.create(alias);
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
	
	protected static final ConstMetaList<MAM_CST_SLS_UPRI__R> constMetas = new ConstMetaList<MAM_CST_SLS_UPRI__R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			cst_cd_META,
			dlv_cd_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			sls_upri_grp_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			unit_cd_META,
			lot_qty_META,
			cur_cd_META,
			wg_cd_META,
			st_dt_META,
			end_dt_META,
			upri_META,
			upri_bf_META,
			interim_flg_META,
			upri_rate_META,
			upri_rate_bf_META,
			sub_upri1_META,
			sub_upri2_META,
			sub_upri3_META,
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
			upri_typ_META,
			cst_nm_META,
			dlv_nm_META,
			dest_nm1_META,
			dest_nm2_META,
			dest_nm3_META,
			sls_upri_grp_nm_META,
			unit_nm_META,
			cur_nm_META,
			wg_nm_META,
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
	protected MAM_CST_SLS_UPRI__R(ConstMetaList<? extends MAM_CST_SLS_UPRI__R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_CST_SLS_UPRI__R(ConstMetaList<? extends MAM_CST_SLS_UPRI__R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$cst_cd,
				"cst_cd",
				cst_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$dlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$dlv_cd,
				"dlv_cd",
				dlv_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$dest_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$dest_cd1,
				"dest_cd1",
				dest_cd1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$dest_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$dest_cd2,
				"dest_cd2",
				dest_cd2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$dest_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$dest_cd3,
				"dest_cd3",
				dest_cd3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$sls_upri_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$sls_upri_grp_cd,
				"sls_upri_grp_cd",
				sls_upri_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$itm_cd,
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
			MAM_CST_SLS_UPRI__R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$itm_sub1,
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
			MAM_CST_SLS_UPRI__R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$itm_sub2,
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
			MAM_CST_SLS_UPRI__R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$itm_sub3,
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
			MAM_CST_SLS_UPRI__R.$unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$unit_cd,
				"unit_cd",
				unit_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$lot_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CST_SLS_UPRI__R.$lot_qty,
				"lot_qty",
				lot_qty,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$cur_cd,
				"cur_cd",
				cur_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$wg_cd,
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
			MAM_CST_SLS_UPRI__R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_CST_SLS_UPRI__R.$st_dt,
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
			MAM_CST_SLS_UPRI__R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_CST_SLS_UPRI__R.$end_dt,
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
			MAM_CST_SLS_UPRI__R.$upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CST_SLS_UPRI__R.$upri,
				"upri",
				upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$upri_bf,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CST_SLS_UPRI__R.$upri_bf,
				"upri_bf",
				upri_bf,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$interim_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CST_SLS_UPRI__R.$interim_flg,
				"interim_flg",
				interim_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$upri_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CST_SLS_UPRI__R.$upri_rate,
				"upri_rate",
				upri_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$upri_rate_bf,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CST_SLS_UPRI__R.$upri_rate_bf,
				"upri_rate_bf",
				upri_rate_bf,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$sub_upri1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CST_SLS_UPRI__R.$sub_upri1,
				"sub_upri1",
				sub_upri1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$sub_upri2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CST_SLS_UPRI__R.$sub_upri2,
				"sub_upri2",
				sub_upri2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$sub_upri3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CST_SLS_UPRI__R.$sub_upri3,
				"sub_upri3",
				sub_upri3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$not_cost_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CST_SLS_UPRI__R.$not_cost_flg,
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
			MAM_CST_SLS_UPRI__R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$memo1,
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
			MAM_CST_SLS_UPRI__R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$memo2,
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
			MAM_CST_SLS_UPRI__R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$memo3,
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
			MAM_CST_SLS_UPRI__R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CST_SLS_UPRI__R.$del_flg,
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
			MAM_CST_SLS_UPRI__R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$del_usr_id,
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
			MAM_CST_SLS_UPRI__R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$del_usr_nm,
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
			MAM_CST_SLS_UPRI__R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_CST_SLS_UPRI__R.$del_ts,
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
			MAM_CST_SLS_UPRI__R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$ins_usr_id,
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
			MAM_CST_SLS_UPRI__R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$ins_usr_nm,
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
			MAM_CST_SLS_UPRI__R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_CST_SLS_UPRI__R.$ins_ts,
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
			MAM_CST_SLS_UPRI__R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$ins_func_id,
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
			MAM_CST_SLS_UPRI__R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CST_SLS_UPRI__R.$upd_cntr,
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
			MAM_CST_SLS_UPRI__R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$upd_usr_id,
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
			MAM_CST_SLS_UPRI__R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$upd_usr_nm,
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
			MAM_CST_SLS_UPRI__R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_CST_SLS_UPRI__R.$upd_ts,
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
			MAM_CST_SLS_UPRI__R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$upd_func_id,
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
			MAM_CST_SLS_UPRI__R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$upd_srv_req_no,
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
			MAM_CST_SLS_UPRI__R.$upri_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$upri_typ,
				"upri_typ",
				upri_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$cst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$cst_nm,
				"cst_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP1.BP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$dlv_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$dlv_nm,
				"dlv_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP2.BP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$dest_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$dest_nm1,
				"dest_nm1",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP3.BP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$dest_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$dest_nm2,
				"dest_nm2",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP4.BP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$dest_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$dest_nm3,
				"dest_nm3",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP5.BP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$sls_upri_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$sls_upri_grp_nm,
				"sls_upri_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"SLS_UPRI_GRP1.SLS_UPRI_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$unit_nm,
				"unit_nm",
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
			MAM_CST_SLS_UPRI__R.$cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$cur_nm,
				"cur_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CUR1.CUR_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$wg_nm,
				"wg_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"WG1.WG_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CST_SLS_UPRI__R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CST_SLS_UPRI__R.$itm_nm,
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
	public static MAM_CST_SLS_UPRI__R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_CST_SLS_UPRI__R create(String alias) {
		MAM_CST_SLS_UPRI__R row = new MAM_CST_SLS_UPRI__R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_CST_SLS_UPRI__R createByName(T proto) {
		MAM_CST_SLS_UPRI__R row = MAM_CST_SLS_UPRI__R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CST_SLS_UPRI__R clone() {
		return (MAM_CST_SLS_UPRI__R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CST_SLS_UPRI__R createInstance() {
		return (MAM_CST_SLS_UPRI__R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CST_SLS_UPRI__R getValues(String... names) {
		return (MAM_CST_SLS_UPRI__R) super.getValues(names);
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
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 0, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 0, $cst_cd, value);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 1, $dlv_cd);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 1, $dlv_cd, value);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 2, $dest_cd1);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 2, $dest_cd1, value);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 3, $dest_cd2);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 3, $dest_cd2, value);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 4, $dest_cd3);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 4, $dest_cd3, value);
	}

	/**
	 * 販売単価分類ＣＤ. Sales unit price classification cd..<p>
	 *
	 */
	public String sls_upri_grp_cd() {
		return getConstString(offset + 5, $sls_upri_grp_cd);
	}

	/**
	 * 販売単価分類ＣＤ. Sales unit price classification cd..<p>
	 *
	 */
	public void sls_upri_grp_cd(String value) {
		setConstString(offset + 5, $sls_upri_grp_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 10, $unit_cd);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 10, $unit_cd, value);
	}

	/**
	 * ロット数量. Lot qty..<p>
	 *
	 */
	public MCNumber lot_qty() {
		return getConstNumber(offset + 11, $lot_qty);
	}

	/**
	 * ロット数量. Lot qty..<p>
	 *
	 */
	public void lot_qty(MCNumber value) {
		setConstNumber(offset + 11, $lot_qty, value);
	}
	
	/**
	 * ロット数量. Lot qty..<p>
	 *
	 */
	public void lot_qty(int value) {
		setConstNumber(offset + 11, $lot_qty, value);
	}
	
	/**
	 * ロット数量. Lot qty..<p>
	 *
	 */
	public void lot_qty(long value) {
		setConstNumber(offset + 11, $lot_qty, value);
	}
	
	/**
	 * ロット数量. Lot qty..<p>
	 *
	 */
	public void lot_qty(float value) {
		setConstNumber(offset + 11, $lot_qty, value);
	}
	
	/**
	 * ロット数量. Lot qty..<p>
	 *
	 */
	public void lot_qty(double value) {
		setConstNumber(offset + 11, $lot_qty, value);
	}
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 12, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 12, $cur_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 13, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 13, $wg_cd, value);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 14, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 14, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 15, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 15, $end_dt, value);
	}

	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public MCNumber upri() {
		return getConstNumber(offset + 16, $upri);
	}

	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public void upri(MCNumber value) {
		setConstNumber(offset + 16, $upri, value);
	}
	
	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public void upri(int value) {
		setConstNumber(offset + 16, $upri, value);
	}
	
	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public void upri(long value) {
		setConstNumber(offset + 16, $upri, value);
	}
	
	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public void upri(float value) {
		setConstNumber(offset + 16, $upri, value);
	}
	
	/**
	 * 単価. Unit price.<p>
	 *
	 */
	public void upri(double value) {
		setConstNumber(offset + 16, $upri, value);
	}
	
	/**
	 * 改定前単価. Unit price before revised.<p>
	 *
	 */
	public MCNumber upri_bf() {
		return getConstNumber(offset + 17, $upri_bf);
	}

	/**
	 * 改定前単価. Unit price before revised.<p>
	 *
	 */
	public void upri_bf(MCNumber value) {
		setConstNumber(offset + 17, $upri_bf, value);
	}
	
	/**
	 * 改定前単価. Unit price before revised.<p>
	 *
	 */
	public void upri_bf(int value) {
		setConstNumber(offset + 17, $upri_bf, value);
	}
	
	/**
	 * 改定前単価. Unit price before revised.<p>
	 *
	 */
	public void upri_bf(long value) {
		setConstNumber(offset + 17, $upri_bf, value);
	}
	
	/**
	 * 改定前単価. Unit price before revised.<p>
	 *
	 */
	public void upri_bf(float value) {
		setConstNumber(offset + 17, $upri_bf, value);
	}
	
	/**
	 * 改定前単価. Unit price before revised.<p>
	 *
	 */
	public void upri_bf(double value) {
		setConstNumber(offset + 17, $upri_bf, value);
	}
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 18, $interim_flg);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 18, $interim_flg, value);
	}

	/**
	 * 掛率（％）. Ratio (%).<p>
	 *
	 */
	public MCNumber upri_rate() {
		return getConstNumber(offset + 19, $upri_rate);
	}

	/**
	 * 掛率（％）. Ratio (%).<p>
	 *
	 */
	public void upri_rate(MCNumber value) {
		setConstNumber(offset + 19, $upri_rate, value);
	}
	
	/**
	 * 掛率（％）. Ratio (%).<p>
	 *
	 */
	public void upri_rate(int value) {
		setConstNumber(offset + 19, $upri_rate, value);
	}
	
	/**
	 * 掛率（％）. Ratio (%).<p>
	 *
	 */
	public void upri_rate(long value) {
		setConstNumber(offset + 19, $upri_rate, value);
	}
	
	/**
	 * 掛率（％）. Ratio (%).<p>
	 *
	 */
	public void upri_rate(float value) {
		setConstNumber(offset + 19, $upri_rate, value);
	}
	
	/**
	 * 掛率（％）. Ratio (%).<p>
	 *
	 */
	public void upri_rate(double value) {
		setConstNumber(offset + 19, $upri_rate, value);
	}
	
	/**
	 * 改定前掛率（％）. Ratio before revision (%).<p>
	 *
	 */
	public MCNumber upri_rate_bf() {
		return getConstNumber(offset + 20, $upri_rate_bf);
	}

	/**
	 * 改定前掛率（％）. Ratio before revision (%).<p>
	 *
	 */
	public void upri_rate_bf(MCNumber value) {
		setConstNumber(offset + 20, $upri_rate_bf, value);
	}
	
	/**
	 * 改定前掛率（％）. Ratio before revision (%).<p>
	 *
	 */
	public void upri_rate_bf(int value) {
		setConstNumber(offset + 20, $upri_rate_bf, value);
	}
	
	/**
	 * 改定前掛率（％）. Ratio before revision (%).<p>
	 *
	 */
	public void upri_rate_bf(long value) {
		setConstNumber(offset + 20, $upri_rate_bf, value);
	}
	
	/**
	 * 改定前掛率（％）. Ratio before revision (%).<p>
	 *
	 */
	public void upri_rate_bf(float value) {
		setConstNumber(offset + 20, $upri_rate_bf, value);
	}
	
	/**
	 * 改定前掛率（％）. Ratio before revision (%).<p>
	 *
	 */
	public void upri_rate_bf(double value) {
		setConstNumber(offset + 20, $upri_rate_bf, value);
	}
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public MCNumber sub_upri1() {
		return getConstNumber(offset + 21, $sub_upri1);
	}

	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public void sub_upri1(MCNumber value) {
		setConstNumber(offset + 21, $sub_upri1, value);
	}
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public void sub_upri1(int value) {
		setConstNumber(offset + 21, $sub_upri1, value);
	}
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public void sub_upri1(long value) {
		setConstNumber(offset + 21, $sub_upri1, value);
	}
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public void sub_upri1(float value) {
		setConstNumber(offset + 21, $sub_upri1, value);
	}
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public void sub_upri1(double value) {
		setConstNumber(offset + 21, $sub_upri1, value);
	}
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public MCNumber sub_upri2() {
		return getConstNumber(offset + 22, $sub_upri2);
	}

	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public void sub_upri2(MCNumber value) {
		setConstNumber(offset + 22, $sub_upri2, value);
	}
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public void sub_upri2(int value) {
		setConstNumber(offset + 22, $sub_upri2, value);
	}
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public void sub_upri2(long value) {
		setConstNumber(offset + 22, $sub_upri2, value);
	}
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public void sub_upri2(float value) {
		setConstNumber(offset + 22, $sub_upri2, value);
	}
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public void sub_upri2(double value) {
		setConstNumber(offset + 22, $sub_upri2, value);
	}
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public MCNumber sub_upri3() {
		return getConstNumber(offset + 23, $sub_upri3);
	}

	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public void sub_upri3(MCNumber value) {
		setConstNumber(offset + 23, $sub_upri3, value);
	}
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public void sub_upri3(int value) {
		setConstNumber(offset + 23, $sub_upri3, value);
	}
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public void sub_upri3(long value) {
		setConstNumber(offset + 23, $sub_upri3, value);
	}
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public void sub_upri3(float value) {
		setConstNumber(offset + 23, $sub_upri3, value);
	}
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public void sub_upri3(double value) {
		setConstNumber(offset + 23, $sub_upri3, value);
	}
	
	/**
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public boolean not_cost_flg() {
		return getConstBoolean(offset + 24, $not_cost_flg);
	}

	/**
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public void not_cost_flg(boolean value) {
		setConstBoolean(offset + 24, $not_cost_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 25, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 25, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 26, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 26, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 27, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 27, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 28, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 28, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 29, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 29, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 30, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 30, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 31, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 31, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 32, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 32, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 33, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 33, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 34, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 35, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 35, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 36, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 37, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 37, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 38, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 38, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 39, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 39, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 40, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 40, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 41, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 41, $upd_srv_req_no, value);
	}

	/**
	 * 単価区分. Unit price type.<p>
	 *
	 */
	public String upri_typ() {
		return getConstString(offset + 42, $upri_typ);
	}

	/**
	 * 単価区分. Unit price type.<p>
	 *
	 */
	public void upri_typ(String value) {
		setConstString(offset + 42, $upri_typ, value);
	}

	/**
	 * 得意先名. Customer name.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 43, $cst_nm);
	}

	/**
	 * 得意先名. Customer name.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 43, $cst_nm, value);
	}

	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 44, $dlv_nm);
	}

	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 44, $dlv_nm, value);
	}

	/**
	 * 仕向先名１. Distribution channel name 1.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 45, $dest_nm1);
	}

	/**
	 * 仕向先名１. Distribution channel name 1.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 45, $dest_nm1, value);
	}

	/**
	 * 仕向先名２. Distribution channel name 2.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 46, $dest_nm2);
	}

	/**
	 * 仕向先名２. Distribution channel name 2.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 46, $dest_nm2, value);
	}

	/**
	 * 仕向先名３. Distribution channel name 3.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 47, $dest_nm3);
	}

	/**
	 * 仕向先名３. Distribution channel name 3.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 47, $dest_nm3, value);
	}

	/**
	 * 販売単価分類名. Sales unit price classification name.<p>
	 *
	 */
	public String sls_upri_grp_nm() {
		return getConstString(offset + 48, $sls_upri_grp_nm);
	}

	/**
	 * 販売単価分類名. Sales unit price classification name.<p>
	 *
	 */
	public void sls_upri_grp_nm(String value) {
		setConstString(offset + 48, $sls_upri_grp_nm, value);
	}

	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 49, $unit_nm);
	}

	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 49, $unit_nm, value);
	}

	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 50, $cur_nm);
	}

	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 50, $cur_nm, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 51, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 51, $wg_nm, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 52, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 52, $itm_nm, value);
	}

	public String getString(String name) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($upri_typ.equalsIgnoreCase(name)) {
			return upri_typ();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return sls_upri_grp_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			return lot_qty();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			return upri_bf();
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			return upri_rate();
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			return upri_rate_bf();
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			return sub_upri1();
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			return sub_upri2();
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			return sub_upri3();
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($upri_typ.equalsIgnoreCase(name)) {
			return upri_typ();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return sls_upri_grp_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			return lot_qty();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			return upri_bf();
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			return upri_rate();
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			return upri_rate_bf();
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			return sub_upri1();
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			return sub_upri2();
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			return sub_upri3();
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($upri_typ.equalsIgnoreCase(name)) {
			upri_typ(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			sls_upri_grp_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($upri_typ.equalsIgnoreCase(name)) {
			upri_typ(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			sls_upri_grp_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
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
