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
 * "承認情報マスタ // Approval info. master"DBコンテナRowクラスです。<p>
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
 *  	<td>aprv_func_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認機能区分</td>
 *  	<td>Approval function type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>aprv_row_num</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認行番号</td>
 *  	<td>Approver row number</td>
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
 *  	<td>prio</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>優先順</td>
 *  	<td>Priority</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_rt_ptn</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認ルートパタン</td>
 *  	<td>Approval route pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_upd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>更新可能ＦＬＧ</td>
 *  	<td>Updatable flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消可能ＦＬＧ</td>
 *  	<td>Cancelable flg.</td>
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
 *  	<td>itm_grp_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類区分</td>
 *  	<td>Item classification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ</td>
 *  	<td>Item classification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類区分</td>
 *  	<td>BP classification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類ＣＤ</td>
 *  	<td>BP classification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_cd1</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ１</td>
 *  	<td>Currency cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>val_min1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額１下限値</td>
 *  	<td>Amount 1 lower limit</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>val_max1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額１上限値</td>
 *  	<td>Amount 1 Upper limit</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bind_cond1</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>結合条件区分１</td>
 *  	<td>Join criteria type 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_cd2</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ２</td>
 *  	<td>Currency cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>val_min2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額２下限値</td>
 *  	<td>Amount 2 lower limit</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>val_max2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額２上限値</td>
 *  	<td>Amount 2 Upper limit</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bind_cond2</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>結合条件区分２</td>
 *  	<td>Join criteria type 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_cd3</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ３</td>
 *  	<td>Currency cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>val_min3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額３下限値</td>
 *  	<td>Amount 3 lower limit</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>val_max3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額３上限値</td>
 *  	<td>Amount 3 Upper limit</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_key1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>拡張項目１</td>
 *  	<td>Extended column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_key2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>拡張項目２</td>
 *  	<td>Extended column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_key3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>拡張項目３</td>
 *  	<td>Extended column 3</td>
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
 *  	<td>itm_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>ITM_GRP1.ITM_GRP_NM</td>
 *  	<td>品目分類名</td>
 *  	<td>Item classification name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP1.BP_NM</td>
 *  	<td>取引先名</td>
 *  	<td>BP name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>BP_GRP1.BP_GRP_NM</td>
 *  	<td>取引先分類名</td>
 *  	<td>BP classification name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CUR1.CUR_NM</td>
 *  	<td>通貨名１</td>
 *  	<td>Currency name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CUR2.CUR_NM</td>
 *  	<td>通貨名２</td>
 *  	<td>Currency name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CUR3.CUR_NM</td>
 *  	<td>通貨名３</td>
 *  	<td>Currency name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>DPT_BASE1.DEF_DPT_NM</td>
 *  	<td>部門名</td>
 *  	<td>Dept. name</td>
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
public class MAM_APRV_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_APRV";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 承認機能区分. Approval function type.<p>
	 *
	 */
	public static final String $aprv_func_typ = "aprv_func_typ";
	private static final MCPermColumnInfo _aprv_func_typ = createColumnInfo("aprv_func_typ");
	public final MCStringPermColumn aprv_func_typ = createStringColumn(_aprv_func_typ);
	
	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public static final String $aprv_row_num = "aprv_row_num";
	private static final MCPermColumnInfo _aprv_row_num = createColumnInfo("aprv_row_num");
	public final MCNumberPermColumn aprv_row_num = createNumberColumn(_aprv_row_num);
	
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
	 * 優先順. Priority.<p>
	 *
	 */
	public static final String $prio = "prio";
	private static final MCPermColumnInfo _prio = createColumnInfo("prio");
	public final MCNumberPermColumn prio = createNumberColumn(_prio);
	
	/**
	 * 承認ルートパタン. Approval route pattern.<p>
	 *
	 */
	public static final String $aprv_rt_ptn = "aprv_rt_ptn";
	private static final MCPermColumnInfo _aprv_rt_ptn = createColumnInfo("aprv_rt_ptn");
	public final MCStringPermColumn aprv_rt_ptn = createStringColumn(_aprv_rt_ptn);
	
	/**
	 * 更新可能ＦＬＧ. Updatable flg..<p>
	 *
	 */
	public static final String $aprv_upd_flg = "aprv_upd_flg";
	private static final MCPermColumnInfo _aprv_upd_flg = createColumnInfo("aprv_upd_flg");
	public final MCBooleanPermColumn aprv_upd_flg = createBooleanColumn(_aprv_upd_flg);
	
	/**
	 * 取消可能ＦＬＧ. Cancelable flg..<p>
	 *
	 */
	public static final String $aprv_del_flg = "aprv_del_flg";
	private static final MCPermColumnInfo _aprv_del_flg = createColumnInfo("aprv_del_flg");
	public final MCBooleanPermColumn aprv_del_flg = createBooleanColumn(_aprv_del_flg);
	
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
	 * 品目分類区分. Item classification type.<p>
	 *
	 */
	public static final String $itm_grp_typ = "itm_grp_typ";
	private static final MCPermColumnInfo _itm_grp_typ = createColumnInfo("itm_grp_typ");
	public final MCStringPermColumn itm_grp_typ = createStringColumn(_itm_grp_typ);
	
	/**
	 * 品目分類ＣＤ. Item classification cd..<p>
	 *
	 */
	public static final String $itm_grp_cd = "itm_grp_cd";
	private static final MCPermColumnInfo _itm_grp_cd = createColumnInfo("itm_grp_cd");
	public final MCStringPermColumn itm_grp_cd = createStringColumn(_itm_grp_cd);
	
	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 取引先分類区分. BP classification type.<p>
	 *
	 */
	public static final String $bp_grp_typ = "bp_grp_typ";
	private static final MCPermColumnInfo _bp_grp_typ = createColumnInfo("bp_grp_typ");
	public final MCStringPermColumn bp_grp_typ = createStringColumn(_bp_grp_typ);
	
	/**
	 * 取引先分類ＣＤ. BP classification cd..<p>
	 *
	 */
	public static final String $bp_grp_cd = "bp_grp_cd";
	private static final MCPermColumnInfo _bp_grp_cd = createColumnInfo("bp_grp_cd");
	public final MCStringPermColumn bp_grp_cd = createStringColumn(_bp_grp_cd);
	
	/**
	 * 通貨ＣＤ１. Currency cd. 1.<p>
	 *
	 */
	public static final String $cur_cd1 = "cur_cd1";
	private static final MCPermColumnInfo _cur_cd1 = createColumnInfo("cur_cd1");
	public final MCStringPermColumn cur_cd1 = createStringColumn(_cur_cd1);
	
	/**
	 * 金額１下限値. Amount 1 lower limit.<p>
	 *
	 */
	public static final String $val_min1 = "val_min1";
	private static final MCPermColumnInfo _val_min1 = createColumnInfo("val_min1");
	public final MCNumberPermColumn val_min1 = createNumberColumn(_val_min1);
	
	/**
	 * 金額１上限値. Amount 1 Upper limit.<p>
	 *
	 */
	public static final String $val_max1 = "val_max1";
	private static final MCPermColumnInfo _val_max1 = createColumnInfo("val_max1");
	public final MCNumberPermColumn val_max1 = createNumberColumn(_val_max1);
	
	/**
	 * 結合条件区分１. Join criteria type 1.<p>
	 *
	 */
	public static final String $bind_cond1 = "bind_cond1";
	private static final MCPermColumnInfo _bind_cond1 = createColumnInfo("bind_cond1");
	public final MCStringPermColumn bind_cond1 = createStringColumn(_bind_cond1);
	
	/**
	 * 通貨ＣＤ２. Currency cd. 2.<p>
	 *
	 */
	public static final String $cur_cd2 = "cur_cd2";
	private static final MCPermColumnInfo _cur_cd2 = createColumnInfo("cur_cd2");
	public final MCStringPermColumn cur_cd2 = createStringColumn(_cur_cd2);
	
	/**
	 * 金額２下限値. Amount 2 lower limit.<p>
	 *
	 */
	public static final String $val_min2 = "val_min2";
	private static final MCPermColumnInfo _val_min2 = createColumnInfo("val_min2");
	public final MCNumberPermColumn val_min2 = createNumberColumn(_val_min2);
	
	/**
	 * 金額２上限値. Amount 2 Upper limit.<p>
	 *
	 */
	public static final String $val_max2 = "val_max2";
	private static final MCPermColumnInfo _val_max2 = createColumnInfo("val_max2");
	public final MCNumberPermColumn val_max2 = createNumberColumn(_val_max2);
	
	/**
	 * 結合条件区分２. Join criteria type 2.<p>
	 *
	 */
	public static final String $bind_cond2 = "bind_cond2";
	private static final MCPermColumnInfo _bind_cond2 = createColumnInfo("bind_cond2");
	public final MCStringPermColumn bind_cond2 = createStringColumn(_bind_cond2);
	
	/**
	 * 通貨ＣＤ３. Currency cd. 3.<p>
	 *
	 */
	public static final String $cur_cd3 = "cur_cd3";
	private static final MCPermColumnInfo _cur_cd3 = createColumnInfo("cur_cd3");
	public final MCStringPermColumn cur_cd3 = createStringColumn(_cur_cd3);
	
	/**
	 * 金額３下限値. Amount 3 lower limit.<p>
	 *
	 */
	public static final String $val_min3 = "val_min3";
	private static final MCPermColumnInfo _val_min3 = createColumnInfo("val_min3");
	public final MCNumberPermColumn val_min3 = createNumberColumn(_val_min3);
	
	/**
	 * 金額３上限値. Amount 3 Upper limit.<p>
	 *
	 */
	public static final String $val_max3 = "val_max3";
	private static final MCPermColumnInfo _val_max3 = createColumnInfo("val_max3");
	public final MCNumberPermColumn val_max3 = createNumberColumn(_val_max3);
	
	/**
	 * 拡張項目１. Extended column 1.<p>
	 *
	 */
	public static final String $ext_key1 = "ext_key1";
	private static final MCPermColumnInfo _ext_key1 = createColumnInfo("ext_key1");
	public final MCStringPermColumn ext_key1 = createStringColumn(_ext_key1);
	
	/**
	 * 拡張項目２. Extended column 2.<p>
	 *
	 */
	public static final String $ext_key2 = "ext_key2";
	private static final MCPermColumnInfo _ext_key2 = createColumnInfo("ext_key2");
	public final MCStringPermColumn ext_key2 = createStringColumn(_ext_key2);
	
	/**
	 * 拡張項目３. Extended column 3.<p>
	 *
	 */
	public static final String $ext_key3 = "ext_key3";
	private static final MCPermColumnInfo _ext_key3 = createColumnInfo("ext_key3");
	public final MCStringPermColumn ext_key3 = createStringColumn(_ext_key3);
	
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
	 * 品目分類名. Item classification name.<p>
	 *
	 */
	public static final String $itm_grp_nm = "itm_grp_nm";
	
	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	
	/**
	 * 取引先分類名. BP classification name.<p>
	 *
	 */
	public static final String $bp_grp_nm = "bp_grp_nm";
	
	/**
	 * 通貨名１. Currency name 1.<p>
	 *
	 */
	public static final String $cur_nm1 = "cur_nm1";
	
	/**
	 * 通貨名２. Currency name 2.<p>
	 *
	 */
	public static final String $cur_nm2 = "cur_nm2";
	
	/**
	 * 通貨名３. Currency name 3.<p>
	 *
	 */
	public static final String $cur_nm3 = "cur_nm3";
	
	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	public static final MCMeta aprv_func_typ_META = createCommonMeta($aprv_func_typ, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP);
	public static final MCMeta aprv_row_num_META = createCommonMeta($aprv_row_num, mcframe.commonMA.meta.MA_META.APRV_ROW_NUM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta aprv_rt_ptn_META = createCommonMeta($aprv_rt_ptn, mcframe.commonMA.meta.MA_META.APRV_RT_PTN);
	public static final MCMeta aprv_upd_flg_META = createCommonMeta($aprv_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_del_flg_META = createCommonMeta($aprv_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_grp_typ_META = createCommonMeta($itm_grp_typ, mcframe.commonMA.meta.MA_META.ITM_GRP_TYP);
	public static final MCMeta itm_grp_cd_META = createCommonMeta($itm_grp_cd, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_grp_typ_META = createCommonMeta($bp_grp_typ, mcframe.commonMA.meta.MA_META.BP_GRP_TYP);
	public static final MCMeta bp_grp_cd_META = createCommonMeta($bp_grp_cd, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cur_cd1_META = createCommonMeta($cur_cd1, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta val_min1_META = createCommonMeta($val_min1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta val_max1_META = createCommonMeta($val_max1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bind_cond1_META = createCommonMeta($bind_cond1, mcframe.commonMA.meta.MA_META.BIND_COND_TYP);
	public static final MCMeta cur_cd2_META = createCommonMeta($cur_cd2, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta val_min2_META = createCommonMeta($val_min2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta val_max2_META = createCommonMeta($val_max2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bind_cond2_META = createCommonMeta($bind_cond2, mcframe.commonMA.meta.MA_META.BIND_COND_TYP);
	public static final MCMeta cur_cd3_META = createCommonMeta($cur_cd3, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta val_min3_META = createCommonMeta($val_min3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta val_max3_META = createCommonMeta($val_max3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ext_key1_META = createCommonMeta($ext_key1, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY1);
	public static final MCMeta ext_key2_META = createCommonMeta($ext_key2, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY2);
	public static final MCMeta ext_key3_META = createCommonMeta($ext_key3, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY3);
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
	public static final MCMeta itm_grp_nm_META = createCommonMeta($itm_grp_nm, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_grp_nm_META = createCommonMeta($bp_grp_nm, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cur_nm1_META = createCommonMeta($cur_nm1, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta cur_nm2_META = createCommonMeta($cur_nm2, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta cur_nm3_META = createCommonMeta($cur_nm3, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $ITM_GRP1 = "ITM_GRP1";
	public static final String $BP1 = "BP1";
	public static final String $BP_GRP1 = "BP_GRP1";
	public static final String $CUR1 = "CUR1";
	public static final String $CUR2 = "CUR2";
	public static final String $CUR3 = "CUR3";
	public static final String $DPT_BASE1 = "DPT_BASE1";
	public static final String $ITM1 = "ITM1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_GRP",
				$ITM_GRP1,
				new String[][]{
						{"itm_grp_typ", "itm_grp_typ"},
						{"itm_grp_cd", "itm_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM_GRP_R.create("ITM_GRP1");
				},
				(alias) -> {
					MAM_APRV_R own = MAM_APRV_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM_GRP_R ref = mcframe.serverMA.dbc.MAM_ITM_GRP_R.create("ITM_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_grp_typ.eq(ref.itm_grp_typ));
					cond = cond.and(own.itm_grp_cd.eq(ref.itm_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP1,
				new String[][]{
						{"bp_cd", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
				},
				(alias) -> {
					MAM_APRV_R own = MAM_APRV_R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.bp_cd.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP_GRP",
				$BP_GRP1,
				new String[][]{
						{"bp_grp_typ", "bp_grp_typ"},
						{"bp_grp_cd", "bp_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_GRP_R.create("BP_GRP1");
				},
				(alias) -> {
					MAM_APRV_R own = MAM_APRV_R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_GRP_R ref = mcframe.serverMA.dbc.MAM_BP_GRP_R.create("BP_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.bp_grp_typ.eq(ref.bp_grp_typ));
					cond = cond.and(own.bp_grp_cd.eq(ref.bp_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CUR",
				$CUR1,
				new String[][]{
						{"cur_cd1", "cur_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
				},
				(alias) -> {
					MAM_APRV_R own = MAM_APRV_R.create(alias);
					mcframe.serverMA.dbc.MAM_CUR_R ref = mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cur_cd1.eq(ref.cur_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CUR",
				$CUR2,
				new String[][]{
						{"cur_cd2", "cur_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CUR_R.create("CUR2");
				},
				(alias) -> {
					MAM_APRV_R own = MAM_APRV_R.create(alias);
					mcframe.serverMA.dbc.MAM_CUR_R ref = mcframe.serverMA.dbc.MAM_CUR_R.create("CUR2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cur_cd2.eq(ref.cur_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CUR",
				$CUR3,
				new String[][]{
						{"cur_cd3", "cur_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CUR_R.create("CUR3");
				},
				(alias) -> {
					MAM_APRV_R own = MAM_APRV_R.create(alias);
					mcframe.serverMA.dbc.MAM_CUR_R ref = mcframe.serverMA.dbc.MAM_CUR_R.create("CUR3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cur_cd3.eq(ref.cur_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_BASE",
				$DPT_BASE1,
				new String[][]{
						{"dpt_cd", "dpt_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE1");
				},
				(alias) -> {
					MAM_APRV_R own = MAM_APRV_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_BASE_R ref = mcframe.serverMA.dbc.MAM_DPT_BASE_R.create("DPT_BASE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dpt_cd.eq(ref.dpt_cd));
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
					MAM_APRV_R own = MAM_APRV_R.create(alias);
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
	
	protected static final ConstMetaList<MAM_APRV_R> constMetas = new ConstMetaList<MAM_APRV_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			aprv_func_typ_META,
			aprv_row_num_META,
			st_dt_META,
			end_dt_META,
			prio_META,
			aprv_rt_ptn_META,
			aprv_upd_flg_META,
			aprv_del_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_grp_typ_META,
			itm_grp_cd_META,
			dpt_cd_META,
			bp_cd_META,
			bp_grp_typ_META,
			bp_grp_cd_META,
			cur_cd1_META,
			val_min1_META,
			val_max1_META,
			bind_cond1_META,
			cur_cd2_META,
			val_min2_META,
			val_max2_META,
			bind_cond2_META,
			cur_cd3_META,
			val_min3_META,
			val_max3_META,
			ext_key1_META,
			ext_key2_META,
			ext_key3_META,
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
			itm_grp_nm_META,
			bp_nm_META,
			bp_grp_nm_META,
			cur_nm1_META,
			cur_nm2_META,
			cur_nm3_META,
			dpt_nm_META,
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
	protected MAM_APRV_R(ConstMetaList<? extends MAM_APRV_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_APRV_R(ConstMetaList<? extends MAM_APRV_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_APRV_R.$aprv_func_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$aprv_func_typ,
				"aprv_func_typ",
				aprv_func_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$aprv_row_num,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_APRV_R.$aprv_row_num,
				"aprv_row_num",
				aprv_row_num,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_APRV_R.$st_dt,
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
			MAM_APRV_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_APRV_R.$end_dt,
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
			MAM_APRV_R.$prio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_APRV_R.$prio,
				"prio",
				prio,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$aprv_rt_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$aprv_rt_ptn,
				"aprv_rt_ptn",
				aprv_rt_ptn,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$aprv_upd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_APRV_R.$aprv_upd_flg,
				"aprv_upd_flg",
				aprv_upd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$aprv_del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_APRV_R.$aprv_del_flg,
				"aprv_del_flg",
				aprv_del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$itm_cd,
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
			MAM_APRV_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$itm_sub1,
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
			MAM_APRV_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$itm_sub2,
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
			MAM_APRV_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$itm_sub3,
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
			MAM_APRV_R.$itm_grp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$itm_grp_typ,
				"itm_grp_typ",
				itm_grp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$itm_grp_cd,
				"itm_grp_cd",
				itm_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$dpt_cd,
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
			MAM_APRV_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$bp_cd,
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
			MAM_APRV_R.$bp_grp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$bp_grp_typ,
				"bp_grp_typ",
				bp_grp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$bp_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$bp_grp_cd,
				"bp_grp_cd",
				bp_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$cur_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$cur_cd1,
				"cur_cd1",
				cur_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$val_min1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_APRV_R.$val_min1,
				"val_min1",
				val_min1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$val_max1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_APRV_R.$val_max1,
				"val_max1",
				val_max1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$bind_cond1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$bind_cond1,
				"bind_cond1",
				bind_cond1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$cur_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$cur_cd2,
				"cur_cd2",
				cur_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$val_min2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_APRV_R.$val_min2,
				"val_min2",
				val_min2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$val_max2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_APRV_R.$val_max2,
				"val_max2",
				val_max2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$bind_cond2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$bind_cond2,
				"bind_cond2",
				bind_cond2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$cur_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$cur_cd3,
				"cur_cd3",
				cur_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$val_min3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_APRV_R.$val_min3,
				"val_min3",
				val_min3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$val_max3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_APRV_R.$val_max3,
				"val_max3",
				val_max3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$ext_key1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$ext_key1,
				"ext_key1",
				ext_key1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$ext_key2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$ext_key2,
				"ext_key2",
				ext_key2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$ext_key3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$ext_key3,
				"ext_key3",
				ext_key3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$memo1,
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
			MAM_APRV_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$memo2,
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
			MAM_APRV_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$memo3,
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
			MAM_APRV_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_APRV_R.$del_flg,
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
			MAM_APRV_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$del_usr_id,
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
			MAM_APRV_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$del_usr_nm,
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
			MAM_APRV_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_APRV_R.$del_ts,
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
			MAM_APRV_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$ins_usr_id,
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
			MAM_APRV_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$ins_usr_nm,
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
			MAM_APRV_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_APRV_R.$ins_ts,
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
			MAM_APRV_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$ins_func_id,
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
			MAM_APRV_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_APRV_R.$upd_cntr,
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
			MAM_APRV_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$upd_usr_id,
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
			MAM_APRV_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$upd_usr_nm,
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
			MAM_APRV_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_APRV_R.$upd_ts,
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
			MAM_APRV_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$upd_func_id,
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
			MAM_APRV_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$upd_srv_req_no,
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
			MAM_APRV_R.$itm_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$itm_grp_nm,
				"itm_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM_GRP1.ITM_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$bp_nm,
				"bp_nm",
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
			MAM_APRV_R.$bp_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$bp_grp_nm,
				"bp_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP_GRP1.BP_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$cur_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$cur_nm1,
				"cur_nm1",
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
			MAM_APRV_R.$cur_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$cur_nm2,
				"cur_nm2",
				null,
				false,
				true,
				false,
				false,
				true,
				"CUR2.CUR_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$cur_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$cur_nm3,
				"cur_nm3",
				null,
				false,
				true,
				false,
				false,
				true,
				"CUR3.CUR_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$dpt_nm,
				"dpt_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_BASE1.DEF_DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_APRV_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_APRV_R.$itm_nm,
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
	public static MAM_APRV_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_APRV_R create(String alias) {
		MAM_APRV_R row = new MAM_APRV_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_APRV_R createByName(T proto) {
		MAM_APRV_R row = MAM_APRV_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_APRV_R clone() {
		return (MAM_APRV_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_APRV_R createInstance() {
		return (MAM_APRV_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_APRV_R getValues(String... names) {
		return (MAM_APRV_R) super.getValues(names);
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
	 public MAW_APRV_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_APRV_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_APRV_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_APRV_KEY_R.TABLE_NAME);
	 }

	/**
	 * 承認機能区分. Approval function type.<p>
	 *
	 */
	public String aprv_func_typ() {
		return getConstString(offset + 0, $aprv_func_typ);
	}

	/**
	 * 承認機能区分. Approval function type.<p>
	 *
	 */
	public void aprv_func_typ(String value) {
		setConstString(offset + 0, $aprv_func_typ, value);
	}

	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public MCNumber aprv_row_num() {
		return getConstNumber(offset + 1, $aprv_row_num);
	}

	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public void aprv_row_num(MCNumber value) {
		setConstNumber(offset + 1, $aprv_row_num, value);
	}
	
	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public void aprv_row_num(int value) {
		setConstNumber(offset + 1, $aprv_row_num, value);
	}
	
	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public void aprv_row_num(long value) {
		setConstNumber(offset + 1, $aprv_row_num, value);
	}
	
	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public void aprv_row_num(float value) {
		setConstNumber(offset + 1, $aprv_row_num, value);
	}
	
	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public void aprv_row_num(double value) {
		setConstNumber(offset + 1, $aprv_row_num, value);
	}
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 2, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 2, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 3, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 3, $end_dt, value);
	}

	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 4, $prio);
	}

	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 4, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 4, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 4, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 4, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 4, $prio, value);
	}
	
	/**
	 * 承認ルートパタン. Approval route pattern.<p>
	 *
	 */
	public String aprv_rt_ptn() {
		return getConstString(offset + 5, $aprv_rt_ptn);
	}

	/**
	 * 承認ルートパタン. Approval route pattern.<p>
	 *
	 */
	public void aprv_rt_ptn(String value) {
		setConstString(offset + 5, $aprv_rt_ptn, value);
	}

	/**
	 * 更新可能ＦＬＧ. Updatable flg..<p>
	 *
	 */
	public boolean aprv_upd_flg() {
		return getConstBoolean(offset + 6, $aprv_upd_flg);
	}

	/**
	 * 更新可能ＦＬＧ. Updatable flg..<p>
	 *
	 */
	public void aprv_upd_flg(boolean value) {
		setConstBoolean(offset + 6, $aprv_upd_flg, value);
	}

	/**
	 * 取消可能ＦＬＧ. Cancelable flg..<p>
	 *
	 */
	public boolean aprv_del_flg() {
		return getConstBoolean(offset + 7, $aprv_del_flg);
	}

	/**
	 * 取消可能ＦＬＧ. Cancelable flg..<p>
	 *
	 */
	public void aprv_del_flg(boolean value) {
		setConstBoolean(offset + 7, $aprv_del_flg, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}

	/**
	 * 品目分類区分. Item classification type.<p>
	 *
	 */
	public String itm_grp_typ() {
		return getConstString(offset + 12, $itm_grp_typ);
	}

	/**
	 * 品目分類区分. Item classification type.<p>
	 *
	 */
	public void itm_grp_typ(String value) {
		setConstString(offset + 12, $itm_grp_typ, value);
	}

	/**
	 * 品目分類ＣＤ. Item classification cd..<p>
	 *
	 */
	public String itm_grp_cd() {
		return getConstString(offset + 13, $itm_grp_cd);
	}

	/**
	 * 品目分類ＣＤ. Item classification cd..<p>
	 *
	 */
	public void itm_grp_cd(String value) {
		setConstString(offset + 13, $itm_grp_cd, value);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 14, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 14, $dpt_cd, value);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 15, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 15, $bp_cd, value);
	}

	/**
	 * 取引先分類区分. BP classification type.<p>
	 *
	 */
	public String bp_grp_typ() {
		return getConstString(offset + 16, $bp_grp_typ);
	}

	/**
	 * 取引先分類区分. BP classification type.<p>
	 *
	 */
	public void bp_grp_typ(String value) {
		setConstString(offset + 16, $bp_grp_typ, value);
	}

	/**
	 * 取引先分類ＣＤ. BP classification cd..<p>
	 *
	 */
	public String bp_grp_cd() {
		return getConstString(offset + 17, $bp_grp_cd);
	}

	/**
	 * 取引先分類ＣＤ. BP classification cd..<p>
	 *
	 */
	public void bp_grp_cd(String value) {
		setConstString(offset + 17, $bp_grp_cd, value);
	}

	/**
	 * 通貨ＣＤ１. Currency cd. 1.<p>
	 *
	 */
	public String cur_cd1() {
		return getConstString(offset + 18, $cur_cd1);
	}

	/**
	 * 通貨ＣＤ１. Currency cd. 1.<p>
	 *
	 */
	public void cur_cd1(String value) {
		setConstString(offset + 18, $cur_cd1, value);
	}

	/**
	 * 金額１下限値. Amount 1 lower limit.<p>
	 *
	 */
	public MCNumber val_min1() {
		return getConstNumber(offset + 19, $val_min1);
	}

	/**
	 * 金額１下限値. Amount 1 lower limit.<p>
	 *
	 */
	public void val_min1(MCNumber value) {
		setConstNumber(offset + 19, $val_min1, value);
	}
	
	/**
	 * 金額１下限値. Amount 1 lower limit.<p>
	 *
	 */
	public void val_min1(int value) {
		setConstNumber(offset + 19, $val_min1, value);
	}
	
	/**
	 * 金額１下限値. Amount 1 lower limit.<p>
	 *
	 */
	public void val_min1(long value) {
		setConstNumber(offset + 19, $val_min1, value);
	}
	
	/**
	 * 金額１下限値. Amount 1 lower limit.<p>
	 *
	 */
	public void val_min1(float value) {
		setConstNumber(offset + 19, $val_min1, value);
	}
	
	/**
	 * 金額１下限値. Amount 1 lower limit.<p>
	 *
	 */
	public void val_min1(double value) {
		setConstNumber(offset + 19, $val_min1, value);
	}
	
	/**
	 * 金額１上限値. Amount 1 Upper limit.<p>
	 *
	 */
	public MCNumber val_max1() {
		return getConstNumber(offset + 20, $val_max1);
	}

	/**
	 * 金額１上限値. Amount 1 Upper limit.<p>
	 *
	 */
	public void val_max1(MCNumber value) {
		setConstNumber(offset + 20, $val_max1, value);
	}
	
	/**
	 * 金額１上限値. Amount 1 Upper limit.<p>
	 *
	 */
	public void val_max1(int value) {
		setConstNumber(offset + 20, $val_max1, value);
	}
	
	/**
	 * 金額１上限値. Amount 1 Upper limit.<p>
	 *
	 */
	public void val_max1(long value) {
		setConstNumber(offset + 20, $val_max1, value);
	}
	
	/**
	 * 金額１上限値. Amount 1 Upper limit.<p>
	 *
	 */
	public void val_max1(float value) {
		setConstNumber(offset + 20, $val_max1, value);
	}
	
	/**
	 * 金額１上限値. Amount 1 Upper limit.<p>
	 *
	 */
	public void val_max1(double value) {
		setConstNumber(offset + 20, $val_max1, value);
	}
	
	/**
	 * 結合条件区分１. Join criteria type 1.<p>
	 *
	 */
	public String bind_cond1() {
		return getConstString(offset + 21, $bind_cond1);
	}

	/**
	 * 結合条件区分１. Join criteria type 1.<p>
	 *
	 */
	public void bind_cond1(String value) {
		setConstString(offset + 21, $bind_cond1, value);
	}

	/**
	 * 通貨ＣＤ２. Currency cd. 2.<p>
	 *
	 */
	public String cur_cd2() {
		return getConstString(offset + 22, $cur_cd2);
	}

	/**
	 * 通貨ＣＤ２. Currency cd. 2.<p>
	 *
	 */
	public void cur_cd2(String value) {
		setConstString(offset + 22, $cur_cd2, value);
	}

	/**
	 * 金額２下限値. Amount 2 lower limit.<p>
	 *
	 */
	public MCNumber val_min2() {
		return getConstNumber(offset + 23, $val_min2);
	}

	/**
	 * 金額２下限値. Amount 2 lower limit.<p>
	 *
	 */
	public void val_min2(MCNumber value) {
		setConstNumber(offset + 23, $val_min2, value);
	}
	
	/**
	 * 金額２下限値. Amount 2 lower limit.<p>
	 *
	 */
	public void val_min2(int value) {
		setConstNumber(offset + 23, $val_min2, value);
	}
	
	/**
	 * 金額２下限値. Amount 2 lower limit.<p>
	 *
	 */
	public void val_min2(long value) {
		setConstNumber(offset + 23, $val_min2, value);
	}
	
	/**
	 * 金額２下限値. Amount 2 lower limit.<p>
	 *
	 */
	public void val_min2(float value) {
		setConstNumber(offset + 23, $val_min2, value);
	}
	
	/**
	 * 金額２下限値. Amount 2 lower limit.<p>
	 *
	 */
	public void val_min2(double value) {
		setConstNumber(offset + 23, $val_min2, value);
	}
	
	/**
	 * 金額２上限値. Amount 2 Upper limit.<p>
	 *
	 */
	public MCNumber val_max2() {
		return getConstNumber(offset + 24, $val_max2);
	}

	/**
	 * 金額２上限値. Amount 2 Upper limit.<p>
	 *
	 */
	public void val_max2(MCNumber value) {
		setConstNumber(offset + 24, $val_max2, value);
	}
	
	/**
	 * 金額２上限値. Amount 2 Upper limit.<p>
	 *
	 */
	public void val_max2(int value) {
		setConstNumber(offset + 24, $val_max2, value);
	}
	
	/**
	 * 金額２上限値. Amount 2 Upper limit.<p>
	 *
	 */
	public void val_max2(long value) {
		setConstNumber(offset + 24, $val_max2, value);
	}
	
	/**
	 * 金額２上限値. Amount 2 Upper limit.<p>
	 *
	 */
	public void val_max2(float value) {
		setConstNumber(offset + 24, $val_max2, value);
	}
	
	/**
	 * 金額２上限値. Amount 2 Upper limit.<p>
	 *
	 */
	public void val_max2(double value) {
		setConstNumber(offset + 24, $val_max2, value);
	}
	
	/**
	 * 結合条件区分２. Join criteria type 2.<p>
	 *
	 */
	public String bind_cond2() {
		return getConstString(offset + 25, $bind_cond2);
	}

	/**
	 * 結合条件区分２. Join criteria type 2.<p>
	 *
	 */
	public void bind_cond2(String value) {
		setConstString(offset + 25, $bind_cond2, value);
	}

	/**
	 * 通貨ＣＤ３. Currency cd. 3.<p>
	 *
	 */
	public String cur_cd3() {
		return getConstString(offset + 26, $cur_cd3);
	}

	/**
	 * 通貨ＣＤ３. Currency cd. 3.<p>
	 *
	 */
	public void cur_cd3(String value) {
		setConstString(offset + 26, $cur_cd3, value);
	}

	/**
	 * 金額３下限値. Amount 3 lower limit.<p>
	 *
	 */
	public MCNumber val_min3() {
		return getConstNumber(offset + 27, $val_min3);
	}

	/**
	 * 金額３下限値. Amount 3 lower limit.<p>
	 *
	 */
	public void val_min3(MCNumber value) {
		setConstNumber(offset + 27, $val_min3, value);
	}
	
	/**
	 * 金額３下限値. Amount 3 lower limit.<p>
	 *
	 */
	public void val_min3(int value) {
		setConstNumber(offset + 27, $val_min3, value);
	}
	
	/**
	 * 金額３下限値. Amount 3 lower limit.<p>
	 *
	 */
	public void val_min3(long value) {
		setConstNumber(offset + 27, $val_min3, value);
	}
	
	/**
	 * 金額３下限値. Amount 3 lower limit.<p>
	 *
	 */
	public void val_min3(float value) {
		setConstNumber(offset + 27, $val_min3, value);
	}
	
	/**
	 * 金額３下限値. Amount 3 lower limit.<p>
	 *
	 */
	public void val_min3(double value) {
		setConstNumber(offset + 27, $val_min3, value);
	}
	
	/**
	 * 金額３上限値. Amount 3 Upper limit.<p>
	 *
	 */
	public MCNumber val_max3() {
		return getConstNumber(offset + 28, $val_max3);
	}

	/**
	 * 金額３上限値. Amount 3 Upper limit.<p>
	 *
	 */
	public void val_max3(MCNumber value) {
		setConstNumber(offset + 28, $val_max3, value);
	}
	
	/**
	 * 金額３上限値. Amount 3 Upper limit.<p>
	 *
	 */
	public void val_max3(int value) {
		setConstNumber(offset + 28, $val_max3, value);
	}
	
	/**
	 * 金額３上限値. Amount 3 Upper limit.<p>
	 *
	 */
	public void val_max3(long value) {
		setConstNumber(offset + 28, $val_max3, value);
	}
	
	/**
	 * 金額３上限値. Amount 3 Upper limit.<p>
	 *
	 */
	public void val_max3(float value) {
		setConstNumber(offset + 28, $val_max3, value);
	}
	
	/**
	 * 金額３上限値. Amount 3 Upper limit.<p>
	 *
	 */
	public void val_max3(double value) {
		setConstNumber(offset + 28, $val_max3, value);
	}
	
	/**
	 * 拡張項目１. Extended column 1.<p>
	 *
	 */
	public String ext_key1() {
		return getConstString(offset + 29, $ext_key1);
	}

	/**
	 * 拡張項目１. Extended column 1.<p>
	 *
	 */
	public void ext_key1(String value) {
		setConstString(offset + 29, $ext_key1, value);
	}

	/**
	 * 拡張項目２. Extended column 2.<p>
	 *
	 */
	public String ext_key2() {
		return getConstString(offset + 30, $ext_key2);
	}

	/**
	 * 拡張項目２. Extended column 2.<p>
	 *
	 */
	public void ext_key2(String value) {
		setConstString(offset + 30, $ext_key2, value);
	}

	/**
	 * 拡張項目３. Extended column 3.<p>
	 *
	 */
	public String ext_key3() {
		return getConstString(offset + 31, $ext_key3);
	}

	/**
	 * 拡張項目３. Extended column 3.<p>
	 *
	 */
	public void ext_key3(String value) {
		setConstString(offset + 31, $ext_key3, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 32, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 32, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 33, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 33, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 34, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 34, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 35, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 35, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 36, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 36, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 37, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 37, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 38, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 38, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 39, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 39, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 40, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 40, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 41, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 41, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 42, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 42, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 43, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 43, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 43, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 43, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 43, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 43, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 44, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 44, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 45, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 45, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 46, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 46, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 47, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 47, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 48, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 48, $upd_srv_req_no, value);
	}

	/**
	 * 品目分類名. Item classification name.<p>
	 *
	 */
	public String itm_grp_nm() {
		return getConstString(offset + 49, $itm_grp_nm);
	}

	/**
	 * 品目分類名. Item classification name.<p>
	 *
	 */
	public void itm_grp_nm(String value) {
		setConstString(offset + 49, $itm_grp_nm, value);
	}

	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 50, $bp_nm);
	}

	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 50, $bp_nm, value);
	}

	/**
	 * 取引先分類名. BP classification name.<p>
	 *
	 */
	public String bp_grp_nm() {
		return getConstString(offset + 51, $bp_grp_nm);
	}

	/**
	 * 取引先分類名. BP classification name.<p>
	 *
	 */
	public void bp_grp_nm(String value) {
		setConstString(offset + 51, $bp_grp_nm, value);
	}

	/**
	 * 通貨名１. Currency name 1.<p>
	 *
	 */
	public String cur_nm1() {
		return getConstString(offset + 52, $cur_nm1);
	}

	/**
	 * 通貨名１. Currency name 1.<p>
	 *
	 */
	public void cur_nm1(String value) {
		setConstString(offset + 52, $cur_nm1, value);
	}

	/**
	 * 通貨名２. Currency name 2.<p>
	 *
	 */
	public String cur_nm2() {
		return getConstString(offset + 53, $cur_nm2);
	}

	/**
	 * 通貨名２. Currency name 2.<p>
	 *
	 */
	public void cur_nm2(String value) {
		setConstString(offset + 53, $cur_nm2, value);
	}

	/**
	 * 通貨名３. Currency name 3.<p>
	 *
	 */
	public String cur_nm3() {
		return getConstString(offset + 54, $cur_nm3);
	}

	/**
	 * 通貨名３. Currency name 3.<p>
	 *
	 */
	public void cur_nm3(String value) {
		setConstString(offset + 54, $cur_nm3, value);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 55, $dpt_nm);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 55, $dpt_nm, value);
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
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			return aprv_rt_ptn();
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
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			return itm_grp_typ();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			return bp_grp_typ();
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			return bp_grp_cd();
		}
		if ($cur_cd1.equalsIgnoreCase(name)) {
			return cur_cd1();
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			return bind_cond1();
		}
		if ($cur_cd2.equalsIgnoreCase(name)) {
			return cur_cd2();
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			return bind_cond2();
		}
		if ($cur_cd3.equalsIgnoreCase(name)) {
			return cur_cd3();
		}
		if ($ext_key1.equalsIgnoreCase(name)) {
			return ext_key1();
		}
		if ($ext_key2.equalsIgnoreCase(name)) {
			return ext_key2();
		}
		if ($ext_key3.equalsIgnoreCase(name)) {
			return ext_key3();
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
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			return itm_grp_nm();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_grp_nm.equalsIgnoreCase(name)) {
			return bp_grp_nm();
		}
		if ($cur_nm1.equalsIgnoreCase(name)) {
			return cur_nm1();
		}
		if ($cur_nm2.equalsIgnoreCase(name)) {
			return cur_nm2();
		}
		if ($cur_nm3.equalsIgnoreCase(name)) {
			return cur_nm3();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			return aprv_row_num();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			return val_min1();
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			return val_max1();
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			return val_min2();
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			return val_max2();
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			return val_min3();
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			return val_max3();
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
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_del_flg.equalsIgnoreCase(name)) {
			return aprv_del_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			return aprv_rt_ptn();
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
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			return itm_grp_typ();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			return bp_grp_typ();
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			return bp_grp_cd();
		}
		if ($cur_cd1.equalsIgnoreCase(name)) {
			return cur_cd1();
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			return bind_cond1();
		}
		if ($cur_cd2.equalsIgnoreCase(name)) {
			return cur_cd2();
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			return bind_cond2();
		}
		if ($cur_cd3.equalsIgnoreCase(name)) {
			return cur_cd3();
		}
		if ($ext_key1.equalsIgnoreCase(name)) {
			return ext_key1();
		}
		if ($ext_key2.equalsIgnoreCase(name)) {
			return ext_key2();
		}
		if ($ext_key3.equalsIgnoreCase(name)) {
			return ext_key3();
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
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			return itm_grp_nm();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_grp_nm.equalsIgnoreCase(name)) {
			return bp_grp_nm();
		}
		if ($cur_nm1.equalsIgnoreCase(name)) {
			return cur_nm1();
		}
		if ($cur_nm2.equalsIgnoreCase(name)) {
			return cur_nm2();
		}
		if ($cur_nm3.equalsIgnoreCase(name)) {
			return cur_nm3();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			return aprv_row_num();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			return val_min1();
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			return val_max1();
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			return val_min2();
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			return val_max2();
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			return val_min3();
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			return val_max3();
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
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_del_flg.equalsIgnoreCase(name)) {
			return aprv_del_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			aprv_rt_ptn(value);
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
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			itm_grp_typ(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			bp_grp_typ(value);
			return;
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			bp_grp_cd(value);
			return;
		}
		if ($cur_cd1.equalsIgnoreCase(name)) {
			cur_cd1(value);
			return;
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			bind_cond1(value);
			return;
		}
		if ($cur_cd2.equalsIgnoreCase(name)) {
			cur_cd2(value);
			return;
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			bind_cond2(value);
			return;
		}
		if ($cur_cd3.equalsIgnoreCase(name)) {
			cur_cd3(value);
			return;
		}
		if ($ext_key1.equalsIgnoreCase(name)) {
			ext_key1(value);
			return;
		}
		if ($ext_key2.equalsIgnoreCase(name)) {
			ext_key2(value);
			return;
		}
		if ($ext_key3.equalsIgnoreCase(name)) {
			ext_key3(value);
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
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			itm_grp_nm(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_grp_nm.equalsIgnoreCase(name)) {
			bp_grp_nm(value);
			return;
		}
		if ($cur_nm1.equalsIgnoreCase(name)) {
			cur_nm1(value);
			return;
		}
		if ($cur_nm2.equalsIgnoreCase(name)) {
			cur_nm2(value);
			return;
		}
		if ($cur_nm3.equalsIgnoreCase(name)) {
			cur_nm3(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
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
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_del_flg.equalsIgnoreCase(name)) {
			aprv_del_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			aprv_rt_ptn(value);
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
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			itm_grp_typ(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			bp_grp_typ(value);
			return;
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			bp_grp_cd(value);
			return;
		}
		if ($cur_cd1.equalsIgnoreCase(name)) {
			cur_cd1(value);
			return;
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			bind_cond1(value);
			return;
		}
		if ($cur_cd2.equalsIgnoreCase(name)) {
			cur_cd2(value);
			return;
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			bind_cond2(value);
			return;
		}
		if ($cur_cd3.equalsIgnoreCase(name)) {
			cur_cd3(value);
			return;
		}
		if ($ext_key1.equalsIgnoreCase(name)) {
			ext_key1(value);
			return;
		}
		if ($ext_key2.equalsIgnoreCase(name)) {
			ext_key2(value);
			return;
		}
		if ($ext_key3.equalsIgnoreCase(name)) {
			ext_key3(value);
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
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			itm_grp_nm(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_grp_nm.equalsIgnoreCase(name)) {
			bp_grp_nm(value);
			return;
		}
		if ($cur_nm1.equalsIgnoreCase(name)) {
			cur_nm1(value);
			return;
		}
		if ($cur_nm2.equalsIgnoreCase(name)) {
			cur_nm2(value);
			return;
		}
		if ($cur_nm3.equalsIgnoreCase(name)) {
			cur_nm3(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
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
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_del_flg.equalsIgnoreCase(name)) {
			aprv_del_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
