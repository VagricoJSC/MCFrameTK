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
 * "原価個別受払表構成マスタ // Custom T account configuration master"DBコンテナRowクラスです。<p>
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
 *  	<td>cost_io_id</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払表ＩＤ</td>
 *  	<td>GR/GI list ID</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>io_col_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払項目ＣＤ</td>
 *  	<td>GR/GI column cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_col_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払項目名</td>
 *  	<td>GR/GI column name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_io_col_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払項目名（ベース）</td>
 *  	<td>GR/GI column name(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_seq</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>表示順</td>
 *  	<td>Display order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_tgt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払対象区分</td>
 *  	<td>GR/GI type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_sml_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払集計単位区分</td>
 *  	<td>GR/GI aggregated unit type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unit_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単価表示ＦＬＧ</td>
 *  	<td>Unit price display flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qty_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量表示ＦＬＧ</td>
 *  	<td>Display qty. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額表示ＦＬＧ</td>
 *  	<td>Display amount flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準表示ＦＬＧ</td>
 *  	<td>Display standard flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異表示ＦＬＧ</td>
 *  	<td>Display variance flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bal_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差額計算区分</td>
 *  	<td>Variance calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>minus_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マイナスＦＬＧ</td>
 *  	<td>Minus flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fg_r</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前景色（Ｒ）</td>
 *  	<td>Foreground color (R)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fg_g</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前景色（Ｇ）</td>
 *  	<td>Foreground color (G)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fg_b</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前景色（Ｂ）</td>
 *  	<td>Foreground color (B)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bg_r</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>背景色（Ｒ）</td>
 *  	<td>Background color (R)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bg_g</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>背景色（Ｇ）</td>
 *  	<td>Background color (G)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bg_b</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>背景色（Ｂ）</td>
 *  	<td>Background color (B)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_expns_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>有償差額有ＦＬＧ</td>
 *  	<td>Gain or loss of chargeable supply flg.</td>
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
 *  	<td>cost_io_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>COST_IO1.COST_IO_NM</td>
 *  	<td>受払表名</td>
 *  	<td>GR/GI list name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_COST_IO_CONF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_COST_IO_CONF";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public static final String $cost_io_id = "cost_io_id";
	private static final MCPermColumnInfo _cost_io_id = createColumnInfo("cost_io_id");
	public final MCNumberPermColumn cost_io_id = createNumberColumn(_cost_io_id);
	
	/**
	 * 受払項目ＣＤ. GR/GI column cd..<p>
	 *
	 */
	public static final String $io_col_cd = "io_col_cd";
	private static final MCPermColumnInfo _io_col_cd = createColumnInfo("io_col_cd");
	public final MCStringPermColumn io_col_cd = createStringColumn(_io_col_cd);
	
	/**
	 * 受払項目名. GR/GI column name.<p>
	 *
	 */
	public static final String $io_col_nm = "io_col_nm";
	private static final MCPermColumnInfo _io_col_nm = createColumnInfo("io_col_nm");
	public final MCStringPermColumn io_col_nm = createStringColumn(_io_col_nm);
	
	/**
	 * 受払項目名（ベース）. GR/GI column name(Base).<p>
	 *
	 */
	public static final String $base_io_col_nm = "base_io_col_nm";
	private static final MCPermColumnInfo _base_io_col_nm = createColumnInfo("base_io_col_nm");
	public final MCStringPermColumn base_io_col_nm = createStringColumn(_base_io_col_nm);
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public static final String $io_seq = "io_seq";
	private static final MCPermColumnInfo _io_seq = createColumnInfo("io_seq");
	public final MCNumberPermColumn io_seq = createNumberColumn(_io_seq);
	
	/**
	 * 受払対象区分. GR/GI type.<p>
	 *
	 */
	public static final String $io_tgt_typ = "io_tgt_typ";
	private static final MCPermColumnInfo _io_tgt_typ = createColumnInfo("io_tgt_typ");
	public final MCStringPermColumn io_tgt_typ = createStringColumn(_io_tgt_typ);
	
	/**
	 * 受払集計単位区分. GR/GI aggregated unit type.<p>
	 *
	 */
	public static final String $io_sml_typ = "io_sml_typ";
	private static final MCPermColumnInfo _io_sml_typ = createColumnInfo("io_sml_typ");
	public final MCStringPermColumn io_sml_typ = createStringColumn(_io_sml_typ);
	
	/**
	 * 単価表示ＦＬＧ. Unit price display flg..<p>
	 *
	 */
	public static final String $unit_flg = "unit_flg";
	private static final MCPermColumnInfo _unit_flg = createColumnInfo("unit_flg");
	public final MCBooleanPermColumn unit_flg = createBooleanColumn(_unit_flg);
	
	/**
	 * 数量表示ＦＬＧ. Display qty. flg..<p>
	 *
	 */
	public static final String $qty_flg = "qty_flg";
	private static final MCPermColumnInfo _qty_flg = createColumnInfo("qty_flg");
	public final MCBooleanPermColumn qty_flg = createBooleanColumn(_qty_flg);
	
	/**
	 * 金額表示ＦＬＧ. Display amount flg..<p>
	 *
	 */
	public static final String $amt_flg = "amt_flg";
	private static final MCPermColumnInfo _amt_flg = createColumnInfo("amt_flg");
	public final MCBooleanPermColumn amt_flg = createBooleanColumn(_amt_flg);
	
	/**
	 * 標準表示ＦＬＧ. Display standard flg..<p>
	 *
	 */
	public static final String $std_flg = "std_flg";
	private static final MCPermColumnInfo _std_flg = createColumnInfo("std_flg");
	public final MCBooleanPermColumn std_flg = createBooleanColumn(_std_flg);
	
	/**
	 * 差異表示ＦＬＧ. Display variance flg..<p>
	 *
	 */
	public static final String $diff_flg = "diff_flg";
	private static final MCPermColumnInfo _diff_flg = createColumnInfo("diff_flg");
	public final MCBooleanPermColumn diff_flg = createBooleanColumn(_diff_flg);
	
	/**
	 * 差額計算区分. Variance calculation type.<p>
	 *
	 */
	public static final String $bal_calc_typ = "bal_calc_typ";
	private static final MCPermColumnInfo _bal_calc_typ = createColumnInfo("bal_calc_typ");
	public final MCStringPermColumn bal_calc_typ = createStringColumn(_bal_calc_typ);
	
	/**
	 * マイナスＦＬＧ. Minus flg..<p>
	 *
	 */
	public static final String $minus_flg = "minus_flg";
	private static final MCPermColumnInfo _minus_flg = createColumnInfo("minus_flg");
	public final MCBooleanPermColumn minus_flg = createBooleanColumn(_minus_flg);
	
	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public static final String $fg_r = "fg_r";
	private static final MCPermColumnInfo _fg_r = createColumnInfo("fg_r");
	public final MCNumberPermColumn fg_r = createNumberColumn(_fg_r);
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public static final String $fg_g = "fg_g";
	private static final MCPermColumnInfo _fg_g = createColumnInfo("fg_g");
	public final MCNumberPermColumn fg_g = createNumberColumn(_fg_g);
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public static final String $fg_b = "fg_b";
	private static final MCPermColumnInfo _fg_b = createColumnInfo("fg_b");
	public final MCNumberPermColumn fg_b = createNumberColumn(_fg_b);
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public static final String $bg_r = "bg_r";
	private static final MCPermColumnInfo _bg_r = createColumnInfo("bg_r");
	public final MCNumberPermColumn bg_r = createNumberColumn(_bg_r);
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public static final String $bg_g = "bg_g";
	private static final MCPermColumnInfo _bg_g = createColumnInfo("bg_g");
	public final MCNumberPermColumn bg_g = createNumberColumn(_bg_g);
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public static final String $bg_b = "bg_b";
	private static final MCPermColumnInfo _bg_b = createColumnInfo("bg_b");
	public final MCNumberPermColumn bg_b = createNumberColumn(_bg_b);
	
	/**
	 * 有償差額有ＦＬＧ. Gain or loss of chargeable supply flg..<p>
	 *
	 */
	public static final String $prov_expns_flg = "prov_expns_flg";
	private static final MCPermColumnInfo _prov_expns_flg = createColumnInfo("prov_expns_flg");
	public final MCBooleanPermColumn prov_expns_flg = createBooleanColumn(_prov_expns_flg);
	
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
	 * 受払表名. GR/GI list name.<p>
	 *
	 */
	public static final String $cost_io_nm = "cost_io_nm";
	
	public static final MCMeta cost_io_id_META = createCommonMeta($cost_io_id, mcframe.commonMA.meta.MA_META.COST_IO_ID);
	public static final MCMeta io_col_cd_META = createCommonMeta($io_col_cd, mcframe.commonMA.meta.MA_META.IO_COL_CD);
	public static final MCMeta io_col_nm_META = createCommonMeta($io_col_nm, mcframe.commonMA.meta.MA_META.IO_COL_NM);
	public static final MCMeta base_io_col_nm_META = createCommonMeta($base_io_col_nm, mcframe.commonMA.meta.MA_META.IO_COL_NM);
	public static final MCMeta io_seq_META = createCommonMeta($io_seq, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta io_tgt_typ_META = createCommonMeta($io_tgt_typ, mcframe.commonMA.meta.MA_META.IO_TGT_TYP);
	public static final MCMeta io_sml_typ_META = createCommonMeta($io_sml_typ, mcframe.commonMA.meta.MA_META.IO_SML_TYP);
	public static final MCMeta unit_flg_META = createCommonMeta($unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qty_flg_META = createCommonMeta($qty_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_flg_META = createCommonMeta($amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_flg_META = createCommonMeta($std_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta diff_flg_META = createCommonMeta($diff_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bal_calc_typ_META = createCommonMeta($bal_calc_typ, mcframe.commonMA.meta.MA_META.BAL_CALC_TYP);
	public static final MCMeta minus_flg_META = createCommonMeta($minus_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fg_r_META = createCommonMeta($fg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_g_META = createCommonMeta($fg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_b_META = createCommonMeta($fg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_r_META = createCommonMeta($bg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_g_META = createCommonMeta($bg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_b_META = createCommonMeta($bg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta prov_expns_flg_META = createCommonMeta($prov_expns_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta cost_io_nm_META = createCommonMeta($cost_io_nm, mcframe.commonMA.meta.MA_META.COST_IO_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $COST_IO1 = "COST_IO1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_COST_IO",
				$COST_IO1,
				new String[][]{
						{"cost_io_id", "cost_io_id"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_COST_IO_R.create("COST_IO1");
				},
				(alias) -> {
					MAM_COST_IO_CONF_R own = MAM_COST_IO_CONF_R.create(alias);
					mcframe.serverMA.dbc.MAM_COST_IO_R ref = mcframe.serverMA.dbc.MAM_COST_IO_R.create("COST_IO1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cost_io_id.eq(ref.cost_io_id));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_COST_IO_CONF_R> constMetas = new ConstMetaList<MAM_COST_IO_CONF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			cost_io_id_META,
			io_col_cd_META,
			io_col_nm_META,
			base_io_col_nm_META,
			io_seq_META,
			io_tgt_typ_META,
			io_sml_typ_META,
			unit_flg_META,
			qty_flg_META,
			amt_flg_META,
			std_flg_META,
			diff_flg_META,
			bal_calc_typ_META,
			minus_flg_META,
			fg_r_META,
			fg_g_META,
			fg_b_META,
			bg_r_META,
			bg_g_META,
			bg_b_META,
			prov_expns_flg_META,
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
			cost_io_nm_META
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
	protected MAM_COST_IO_CONF_R(ConstMetaList<? extends MAM_COST_IO_CONF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_COST_IO_CONF_R(ConstMetaList<? extends MAM_COST_IO_CONF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$cost_io_id,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COST_IO_CONF_R.$cost_io_id,
				"cost_io_id",
				cost_io_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$io_col_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$io_col_cd,
				"io_col_cd",
				io_col_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$io_col_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$io_col_nm,
				"io_col_nm",
				io_col_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$base_io_col_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$base_io_col_nm,
				"base_io_col_nm",
				base_io_col_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$io_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COST_IO_CONF_R.$io_seq,
				"io_seq",
				io_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$io_tgt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$io_tgt_typ,
				"io_tgt_typ",
				io_tgt_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$io_sml_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$io_sml_typ,
				"io_sml_typ",
				io_sml_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$unit_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_COST_IO_CONF_R.$unit_flg,
				"unit_flg",
				unit_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$qty_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_COST_IO_CONF_R.$qty_flg,
				"qty_flg",
				qty_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$amt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_COST_IO_CONF_R.$amt_flg,
				"amt_flg",
				amt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$std_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_COST_IO_CONF_R.$std_flg,
				"std_flg",
				std_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$diff_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_COST_IO_CONF_R.$diff_flg,
				"diff_flg",
				diff_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$bal_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$bal_calc_typ,
				"bal_calc_typ",
				bal_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$minus_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_COST_IO_CONF_R.$minus_flg,
				"minus_flg",
				minus_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$fg_r,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COST_IO_CONF_R.$fg_r,
				"fg_r",
				fg_r,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$fg_g,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COST_IO_CONF_R.$fg_g,
				"fg_g",
				fg_g,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$fg_b,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COST_IO_CONF_R.$fg_b,
				"fg_b",
				fg_b,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$bg_r,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COST_IO_CONF_R.$bg_r,
				"bg_r",
				bg_r,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$bg_g,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COST_IO_CONF_R.$bg_g,
				"bg_g",
				bg_g,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$bg_b,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COST_IO_CONF_R.$bg_b,
				"bg_b",
				bg_b,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$prov_expns_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_COST_IO_CONF_R.$prov_expns_flg,
				"prov_expns_flg",
				prov_expns_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_IO_CONF_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$memo1,
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
			MAM_COST_IO_CONF_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$memo2,
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
			MAM_COST_IO_CONF_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$memo3,
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
			MAM_COST_IO_CONF_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_COST_IO_CONF_R.$del_flg,
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
			MAM_COST_IO_CONF_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$del_usr_id,
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
			MAM_COST_IO_CONF_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$del_usr_nm,
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
			MAM_COST_IO_CONF_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_COST_IO_CONF_R.$del_ts,
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
			MAM_COST_IO_CONF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$ins_usr_id,
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
			MAM_COST_IO_CONF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$ins_usr_nm,
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
			MAM_COST_IO_CONF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_COST_IO_CONF_R.$ins_ts,
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
			MAM_COST_IO_CONF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$ins_func_id,
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
			MAM_COST_IO_CONF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COST_IO_CONF_R.$upd_cntr,
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
			MAM_COST_IO_CONF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$upd_usr_id,
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
			MAM_COST_IO_CONF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$upd_usr_nm,
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
			MAM_COST_IO_CONF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_COST_IO_CONF_R.$upd_ts,
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
			MAM_COST_IO_CONF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$upd_func_id,
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
			MAM_COST_IO_CONF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$upd_srv_req_no,
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
			MAM_COST_IO_CONF_R.$cost_io_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_IO_CONF_R.$cost_io_nm,
				"cost_io_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"COST_IO1.COST_IO_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_COST_IO_CONF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_COST_IO_CONF_R create(String alias) {
		MAM_COST_IO_CONF_R row = new MAM_COST_IO_CONF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_COST_IO_CONF_R createByName(T proto) {
		MAM_COST_IO_CONF_R row = MAM_COST_IO_CONF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_COST_IO_CONF_R clone() {
		return (MAM_COST_IO_CONF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_COST_IO_CONF_R createInstance() {
		return (MAM_COST_IO_CONF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_COST_IO_CONF_R getValues(String... names) {
		return (MAM_COST_IO_CONF_R) super.getValues(names);
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
	 public MAW_COST_IO_CONF_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_COST_IO_CONF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_COST_IO_CONF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_COST_IO_CONF_KEY_R.TABLE_NAME);
	 }

	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public MCNumber cost_io_id() {
		return getConstNumber(offset + 0, $cost_io_id);
	}

	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public void cost_io_id(MCNumber value) {
		setConstNumber(offset + 0, $cost_io_id, value);
	}
	
	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public void cost_io_id(int value) {
		setConstNumber(offset + 0, $cost_io_id, value);
	}
	
	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public void cost_io_id(long value) {
		setConstNumber(offset + 0, $cost_io_id, value);
	}
	
	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public void cost_io_id(float value) {
		setConstNumber(offset + 0, $cost_io_id, value);
	}
	
	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public void cost_io_id(double value) {
		setConstNumber(offset + 0, $cost_io_id, value);
	}
	
	/**
	 * 受払項目ＣＤ. GR/GI column cd..<p>
	 *
	 */
	public String io_col_cd() {
		return getConstString(offset + 1, $io_col_cd);
	}

	/**
	 * 受払項目ＣＤ. GR/GI column cd..<p>
	 *
	 */
	public void io_col_cd(String value) {
		setConstString(offset + 1, $io_col_cd, value);
	}

	/**
	 * 受払項目名. GR/GI column name.<p>
	 *
	 */
	public String io_col_nm() {
		return getConstString(offset + 2, $io_col_nm);
	}

	/**
	 * 受払項目名. GR/GI column name.<p>
	 *
	 */
	public void io_col_nm(String value) {
		setConstString(offset + 2, $io_col_nm, value);
	}

	/**
	 * 受払項目名（ベース）. GR/GI column name(Base).<p>
	 *
	 */
	public String base_io_col_nm() {
		return getConstString(offset + 3, $base_io_col_nm);
	}

	/**
	 * 受払項目名（ベース）. GR/GI column name(Base).<p>
	 *
	 */
	public void base_io_col_nm(String value) {
		setConstString(offset + 3, $base_io_col_nm, value);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public MCNumber io_seq() {
		return getConstNumber(offset + 4, $io_seq);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void io_seq(MCNumber value) {
		setConstNumber(offset + 4, $io_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void io_seq(int value) {
		setConstNumber(offset + 4, $io_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void io_seq(long value) {
		setConstNumber(offset + 4, $io_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void io_seq(float value) {
		setConstNumber(offset + 4, $io_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void io_seq(double value) {
		setConstNumber(offset + 4, $io_seq, value);
	}
	
	/**
	 * 受払対象区分. GR/GI type.<p>
	 *
	 */
	public String io_tgt_typ() {
		return getConstString(offset + 5, $io_tgt_typ);
	}

	/**
	 * 受払対象区分. GR/GI type.<p>
	 *
	 */
	public void io_tgt_typ(String value) {
		setConstString(offset + 5, $io_tgt_typ, value);
	}

	/**
	 * 受払集計単位区分. GR/GI aggregated unit type.<p>
	 *
	 */
	public String io_sml_typ() {
		return getConstString(offset + 6, $io_sml_typ);
	}

	/**
	 * 受払集計単位区分. GR/GI aggregated unit type.<p>
	 *
	 */
	public void io_sml_typ(String value) {
		setConstString(offset + 6, $io_sml_typ, value);
	}

	/**
	 * 単価表示ＦＬＧ. Unit price display flg..<p>
	 *
	 */
	public boolean unit_flg() {
		return getConstBoolean(offset + 7, $unit_flg);
	}

	/**
	 * 単価表示ＦＬＧ. Unit price display flg..<p>
	 *
	 */
	public void unit_flg(boolean value) {
		setConstBoolean(offset + 7, $unit_flg, value);
	}

	/**
	 * 数量表示ＦＬＧ. Display qty. flg..<p>
	 *
	 */
	public boolean qty_flg() {
		return getConstBoolean(offset + 8, $qty_flg);
	}

	/**
	 * 数量表示ＦＬＧ. Display qty. flg..<p>
	 *
	 */
	public void qty_flg(boolean value) {
		setConstBoolean(offset + 8, $qty_flg, value);
	}

	/**
	 * 金額表示ＦＬＧ. Display amount flg..<p>
	 *
	 */
	public boolean amt_flg() {
		return getConstBoolean(offset + 9, $amt_flg);
	}

	/**
	 * 金額表示ＦＬＧ. Display amount flg..<p>
	 *
	 */
	public void amt_flg(boolean value) {
		setConstBoolean(offset + 9, $amt_flg, value);
	}

	/**
	 * 標準表示ＦＬＧ. Display standard flg..<p>
	 *
	 */
	public boolean std_flg() {
		return getConstBoolean(offset + 10, $std_flg);
	}

	/**
	 * 標準表示ＦＬＧ. Display standard flg..<p>
	 *
	 */
	public void std_flg(boolean value) {
		setConstBoolean(offset + 10, $std_flg, value);
	}

	/**
	 * 差異表示ＦＬＧ. Display variance flg..<p>
	 *
	 */
	public boolean diff_flg() {
		return getConstBoolean(offset + 11, $diff_flg);
	}

	/**
	 * 差異表示ＦＬＧ. Display variance flg..<p>
	 *
	 */
	public void diff_flg(boolean value) {
		setConstBoolean(offset + 11, $diff_flg, value);
	}

	/**
	 * 差額計算区分. Variance calculation type.<p>
	 *
	 */
	public String bal_calc_typ() {
		return getConstString(offset + 12, $bal_calc_typ);
	}

	/**
	 * 差額計算区分. Variance calculation type.<p>
	 *
	 */
	public void bal_calc_typ(String value) {
		setConstString(offset + 12, $bal_calc_typ, value);
	}

	/**
	 * マイナスＦＬＧ. Minus flg..<p>
	 *
	 */
	public boolean minus_flg() {
		return getConstBoolean(offset + 13, $minus_flg);
	}

	/**
	 * マイナスＦＬＧ. Minus flg..<p>
	 *
	 */
	public void minus_flg(boolean value) {
		setConstBoolean(offset + 13, $minus_flg, value);
	}

	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public MCNumber fg_r() {
		return getConstNumber(offset + 14, $fg_r);
	}

	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public void fg_r(MCNumber value) {
		setConstNumber(offset + 14, $fg_r, value);
	}
	
	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public void fg_r(int value) {
		setConstNumber(offset + 14, $fg_r, value);
	}
	
	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public void fg_r(long value) {
		setConstNumber(offset + 14, $fg_r, value);
	}
	
	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public void fg_r(float value) {
		setConstNumber(offset + 14, $fg_r, value);
	}
	
	/**
	 * 前景色（Ｒ）. Foreground color (R).<p>
	 *
	 */
	public void fg_r(double value) {
		setConstNumber(offset + 14, $fg_r, value);
	}
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public MCNumber fg_g() {
		return getConstNumber(offset + 15, $fg_g);
	}

	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public void fg_g(MCNumber value) {
		setConstNumber(offset + 15, $fg_g, value);
	}
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public void fg_g(int value) {
		setConstNumber(offset + 15, $fg_g, value);
	}
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public void fg_g(long value) {
		setConstNumber(offset + 15, $fg_g, value);
	}
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public void fg_g(float value) {
		setConstNumber(offset + 15, $fg_g, value);
	}
	
	/**
	 * 前景色（Ｇ）. Foreground color (G).<p>
	 *
	 */
	public void fg_g(double value) {
		setConstNumber(offset + 15, $fg_g, value);
	}
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public MCNumber fg_b() {
		return getConstNumber(offset + 16, $fg_b);
	}

	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public void fg_b(MCNumber value) {
		setConstNumber(offset + 16, $fg_b, value);
	}
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public void fg_b(int value) {
		setConstNumber(offset + 16, $fg_b, value);
	}
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public void fg_b(long value) {
		setConstNumber(offset + 16, $fg_b, value);
	}
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public void fg_b(float value) {
		setConstNumber(offset + 16, $fg_b, value);
	}
	
	/**
	 * 前景色（Ｂ）. Foreground color (B).<p>
	 *
	 */
	public void fg_b(double value) {
		setConstNumber(offset + 16, $fg_b, value);
	}
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public MCNumber bg_r() {
		return getConstNumber(offset + 17, $bg_r);
	}

	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public void bg_r(MCNumber value) {
		setConstNumber(offset + 17, $bg_r, value);
	}
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public void bg_r(int value) {
		setConstNumber(offset + 17, $bg_r, value);
	}
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public void bg_r(long value) {
		setConstNumber(offset + 17, $bg_r, value);
	}
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public void bg_r(float value) {
		setConstNumber(offset + 17, $bg_r, value);
	}
	
	/**
	 * 背景色（Ｒ）. Background color (R).<p>
	 *
	 */
	public void bg_r(double value) {
		setConstNumber(offset + 17, $bg_r, value);
	}
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public MCNumber bg_g() {
		return getConstNumber(offset + 18, $bg_g);
	}

	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public void bg_g(MCNumber value) {
		setConstNumber(offset + 18, $bg_g, value);
	}
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public void bg_g(int value) {
		setConstNumber(offset + 18, $bg_g, value);
	}
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public void bg_g(long value) {
		setConstNumber(offset + 18, $bg_g, value);
	}
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public void bg_g(float value) {
		setConstNumber(offset + 18, $bg_g, value);
	}
	
	/**
	 * 背景色（Ｇ）. Background color (G).<p>
	 *
	 */
	public void bg_g(double value) {
		setConstNumber(offset + 18, $bg_g, value);
	}
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public MCNumber bg_b() {
		return getConstNumber(offset + 19, $bg_b);
	}

	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public void bg_b(MCNumber value) {
		setConstNumber(offset + 19, $bg_b, value);
	}
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public void bg_b(int value) {
		setConstNumber(offset + 19, $bg_b, value);
	}
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public void bg_b(long value) {
		setConstNumber(offset + 19, $bg_b, value);
	}
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public void bg_b(float value) {
		setConstNumber(offset + 19, $bg_b, value);
	}
	
	/**
	 * 背景色（Ｂ）. Background color (B).<p>
	 *
	 */
	public void bg_b(double value) {
		setConstNumber(offset + 19, $bg_b, value);
	}
	
	/**
	 * 有償差額有ＦＬＧ. Gain or loss of chargeable supply flg..<p>
	 *
	 */
	public boolean prov_expns_flg() {
		return getConstBoolean(offset + 20, $prov_expns_flg);
	}

	/**
	 * 有償差額有ＦＬＧ. Gain or loss of chargeable supply flg..<p>
	 *
	 */
	public void prov_expns_flg(boolean value) {
		setConstBoolean(offset + 20, $prov_expns_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 21, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 21, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 22, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 22, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 23, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 23, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 24, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 24, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 25, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 25, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 26, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 26, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 27, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 27, $del_ts, value);
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

	/**
	 * 受払表名. GR/GI list name.<p>
	 *
	 */
	public String cost_io_nm() {
		return getConstString(offset + 38, $cost_io_nm);
	}

	/**
	 * 受払表名. GR/GI list name.<p>
	 *
	 */
	public void cost_io_nm(String value) {
		setConstString(offset + 38, $cost_io_nm, value);
	}

	public String getString(String name) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			return io_col_cd();
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			return io_col_nm();
		}
		if ($base_io_col_nm.equalsIgnoreCase(name)) {
			return base_io_col_nm();
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			return io_tgt_typ();
		}
		if ($io_sml_typ.equalsIgnoreCase(name)) {
			return io_sml_typ();
		}
		if ($bal_calc_typ.equalsIgnoreCase(name)) {
			return bal_calc_typ();
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
		if ($cost_io_nm.equalsIgnoreCase(name)) {
			return cost_io_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			return cost_io_id();
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			return io_seq();
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			return fg_r();
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			return fg_g();
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			return fg_b();
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			return bg_r();
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			return bg_g();
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			return bg_b();
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
		if ($unit_flg.equalsIgnoreCase(name)) {
			return unit_flg();
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			return qty_flg();
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			return amt_flg();
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			return std_flg();
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			return diff_flg();
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		if ($prov_expns_flg.equalsIgnoreCase(name)) {
			return prov_expns_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			return io_col_cd();
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			return io_col_nm();
		}
		if ($base_io_col_nm.equalsIgnoreCase(name)) {
			return base_io_col_nm();
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			return io_tgt_typ();
		}
		if ($io_sml_typ.equalsIgnoreCase(name)) {
			return io_sml_typ();
		}
		if ($bal_calc_typ.equalsIgnoreCase(name)) {
			return bal_calc_typ();
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
		if ($cost_io_nm.equalsIgnoreCase(name)) {
			return cost_io_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			return cost_io_id();
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			return io_seq();
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			return fg_r();
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			return fg_g();
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			return fg_b();
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			return bg_r();
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			return bg_g();
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			return bg_b();
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
		if ($unit_flg.equalsIgnoreCase(name)) {
			return unit_flg();
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			return qty_flg();
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			return amt_flg();
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			return std_flg();
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			return diff_flg();
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		if ($prov_expns_flg.equalsIgnoreCase(name)) {
			return prov_expns_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			io_col_cd(value);
			return;
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			io_col_nm(value);
			return;
		}
		if ($base_io_col_nm.equalsIgnoreCase(name)) {
			base_io_col_nm(value);
			return;
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			io_tgt_typ(value);
			return;
		}
		if ($io_sml_typ.equalsIgnoreCase(name)) {
			io_sml_typ(value);
			return;
		}
		if ($bal_calc_typ.equalsIgnoreCase(name)) {
			bal_calc_typ(value);
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
		if ($cost_io_nm.equalsIgnoreCase(name)) {
			cost_io_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
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
		if ($unit_flg.equalsIgnoreCase(name)) {
			unit_flg(value);
			return;
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			qty_flg(value);
			return;
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			amt_flg(value);
			return;
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			std_flg(value);
			return;
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			diff_flg(value);
			return;
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		if ($prov_expns_flg.equalsIgnoreCase(name)) {
			prov_expns_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			io_col_cd(value);
			return;
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			io_col_nm(value);
			return;
		}
		if ($base_io_col_nm.equalsIgnoreCase(name)) {
			base_io_col_nm(value);
			return;
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			io_tgt_typ(value);
			return;
		}
		if ($io_sml_typ.equalsIgnoreCase(name)) {
			io_sml_typ(value);
			return;
		}
		if ($bal_calc_typ.equalsIgnoreCase(name)) {
			bal_calc_typ(value);
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
		if ($cost_io_nm.equalsIgnoreCase(name)) {
			cost_io_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
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
		if ($unit_flg.equalsIgnoreCase(name)) {
			unit_flg(value);
			return;
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			qty_flg(value);
			return;
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			amt_flg(value);
			return;
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			std_flg(value);
			return;
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			diff_flg(value);
			return;
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		if ($prov_expns_flg.equalsIgnoreCase(name)) {
			prov_expns_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
