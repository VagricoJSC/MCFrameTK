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
 * "品目構成マスタ // Item configuration master"DBコンテナRowクラスです。<p>
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
 *  	<td>core_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主品目ＣＤ</td>
 *  	<td>Main item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>core_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主枝番１</td>
 *  	<td>Main branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>core_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主枝番２</td>
 *  	<td>Main branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>core_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主枝番３</td>
 *  	<td>Main branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>comp_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成品目ＣＤ</td>
 *  	<td>Component item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>comp_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成枝番１</td>
 *  	<td>Configuration branch 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>comp_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成枝番２</td>
 *  	<td>Configuration branch 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>comp_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成枝番３</td>
 *  	<td>Configuration branch 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>core_itm_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主品目数量</td>
 *  	<td>Main item qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>comp_itm_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成品目単位ＣＤ</td>
 *  	<td>Component item unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>comp_itm_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成品目数量</td>
 *  	<td>Component item qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_comp_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目構成グループＣＤ</td>
 *  	<td>Item configuration group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>通常構成ＦＬＧ</td>
 *  	<td>Normal configuration flg.</td>
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
 *  	<td>core_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>主品名</td>
 *  	<td>Main item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>comp_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM2.ITM_NM</td>
 *  	<td>構成品名</td>
 *  	<td>Component name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>comp_itm_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>UNIT1.UNIT_NM</td>
 *  	<td>構成品目単位名</td>
 *  	<td>Component item unit name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_comp_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>ITM_COMP_GRP1.ITM_COMP_GRP_NM</td>
 *  	<td>品目構成グループ名</td>
 *  	<td>Item configuration group name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_ITM_COMP_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_ITM_COMP";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 主品目ＣＤ. Main item cd..<p>
	 *
	 */
	public static final String $core_itm_cd = "core_itm_cd";
	private static final MCPermColumnInfo _core_itm_cd = createColumnInfo("core_itm_cd");
	public final MCStringPermColumn core_itm_cd = createStringColumn(_core_itm_cd);
	
	/**
	 * 主枝番１. Main branch No. 1.<p>
	 *
	 */
	public static final String $core_itm_sub1 = "core_itm_sub1";
	private static final MCPermColumnInfo _core_itm_sub1 = createColumnInfo("core_itm_sub1");
	public final MCStringPermColumn core_itm_sub1 = createStringColumn(_core_itm_sub1);
	
	/**
	 * 主枝番２. Main branch No. 2.<p>
	 *
	 */
	public static final String $core_itm_sub2 = "core_itm_sub2";
	private static final MCPermColumnInfo _core_itm_sub2 = createColumnInfo("core_itm_sub2");
	public final MCStringPermColumn core_itm_sub2 = createStringColumn(_core_itm_sub2);
	
	/**
	 * 主枝番３. Main branch No. 3.<p>
	 *
	 */
	public static final String $core_itm_sub3 = "core_itm_sub3";
	private static final MCPermColumnInfo _core_itm_sub3 = createColumnInfo("core_itm_sub3");
	public final MCStringPermColumn core_itm_sub3 = createStringColumn(_core_itm_sub3);
	
	/**
	 * 構成品目ＣＤ. Component item cd..<p>
	 *
	 */
	public static final String $comp_itm_cd = "comp_itm_cd";
	private static final MCPermColumnInfo _comp_itm_cd = createColumnInfo("comp_itm_cd");
	public final MCStringPermColumn comp_itm_cd = createStringColumn(_comp_itm_cd);
	
	/**
	 * 構成枝番１. Configuration branch 1.<p>
	 *
	 */
	public static final String $comp_itm_sub1 = "comp_itm_sub1";
	private static final MCPermColumnInfo _comp_itm_sub1 = createColumnInfo("comp_itm_sub1");
	public final MCStringPermColumn comp_itm_sub1 = createStringColumn(_comp_itm_sub1);
	
	/**
	 * 構成枝番２. Configuration branch 2.<p>
	 *
	 */
	public static final String $comp_itm_sub2 = "comp_itm_sub2";
	private static final MCPermColumnInfo _comp_itm_sub2 = createColumnInfo("comp_itm_sub2");
	public final MCStringPermColumn comp_itm_sub2 = createStringColumn(_comp_itm_sub2);
	
	/**
	 * 構成枝番３. Configuration branch 3.<p>
	 *
	 */
	public static final String $comp_itm_sub3 = "comp_itm_sub3";
	private static final MCPermColumnInfo _comp_itm_sub3 = createColumnInfo("comp_itm_sub3");
	public final MCStringPermColumn comp_itm_sub3 = createStringColumn(_comp_itm_sub3);
	
	/**
	 * 主品目数量. Main item qty..<p>
	 *
	 */
	public static final String $core_itm_qty = "core_itm_qty";
	private static final MCPermColumnInfo _core_itm_qty = createColumnInfo("core_itm_qty");
	public final MCNumberPermColumn core_itm_qty = createNumberColumn(_core_itm_qty);
	
	/**
	 * 構成品目単位ＣＤ. Component item unit cd..<p>
	 *
	 */
	public static final String $comp_itm_unit_cd = "comp_itm_unit_cd";
	private static final MCPermColumnInfo _comp_itm_unit_cd = createColumnInfo("comp_itm_unit_cd");
	public final MCStringPermColumn comp_itm_unit_cd = createStringColumn(_comp_itm_unit_cd);
	
	/**
	 * 構成品目数量. Component item qty..<p>
	 *
	 */
	public static final String $comp_itm_qty = "comp_itm_qty";
	private static final MCPermColumnInfo _comp_itm_qty = createColumnInfo("comp_itm_qty");
	public final MCNumberPermColumn comp_itm_qty = createNumberColumn(_comp_itm_qty);
	
	/**
	 * 品目構成グループＣＤ. Item configuration group cd..<p>
	 *
	 */
	public static final String $itm_comp_grp_cd = "itm_comp_grp_cd";
	private static final MCPermColumnInfo _itm_comp_grp_cd = createColumnInfo("itm_comp_grp_cd");
	public final MCStringPermColumn itm_comp_grp_cd = createStringColumn(_itm_comp_grp_cd);
	
	/**
	 * 通常構成ＦＬＧ. Normal configuration flg..<p>
	 *
	 */
	public static final String $def_flg = "def_flg";
	private static final MCPermColumnInfo _def_flg = createColumnInfo("def_flg");
	public final MCBooleanPermColumn def_flg = createBooleanColumn(_def_flg);
	
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
	 * 主品名. Main item name.<p>
	 *
	 */
	public static final String $core_itm_nm = "core_itm_nm";
	
	/**
	 * 構成品名. Component name.<p>
	 *
	 */
	public static final String $comp_itm_nm = "comp_itm_nm";
	
	/**
	 * 構成品目単位名. Component item unit name.<p>
	 *
	 */
	public static final String $comp_itm_unit_nm = "comp_itm_unit_nm";
	
	/**
	 * 品目構成グループ名. Item configuration group name.<p>
	 *
	 */
	public static final String $itm_comp_grp_nm = "itm_comp_grp_nm";
	
	public static final MCMeta core_itm_cd_META = createCommonMeta($core_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta core_itm_sub1_META = createCommonMeta($core_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta core_itm_sub2_META = createCommonMeta($core_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta core_itm_sub3_META = createCommonMeta($core_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta comp_itm_cd_META = createCommonMeta($comp_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta comp_itm_sub1_META = createCommonMeta($comp_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta comp_itm_sub2_META = createCommonMeta($comp_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta comp_itm_sub3_META = createCommonMeta($comp_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta core_itm_qty_META = createCommonMeta($core_itm_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta comp_itm_unit_cd_META = createCommonMeta($comp_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta comp_itm_qty_META = createCommonMeta($comp_itm_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta itm_comp_grp_cd_META = createCommonMeta($itm_comp_grp_cd, mcframe.commonMA.meta.MA_META.ITM_COMP_GRP_CD);
	public static final MCMeta def_flg_META = createCommonMeta($def_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta core_itm_nm_META = createCommonMeta($core_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta comp_itm_nm_META = createCommonMeta($comp_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta comp_itm_unit_nm_META = createCommonMeta($comp_itm_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta itm_comp_grp_nm_META = createCommonMeta($itm_comp_grp_nm, mcframe.commonMA.meta.MA_META.ITM_COMP_GRP_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $UNIT1 = "UNIT1";
	public static final String $ITM_COMP_GRP1 = "ITM_COMP_GRP1";
	public static final String $ITM1 = "ITM1";
	public static final String $ITM2 = "ITM2";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT",
				$UNIT1,
				new String[][]{
						{"comp_itm_unit_cd", "unit_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT1");
				},
				(alias) -> {
					MAM_ITM_COMP_R own = MAM_ITM_COMP_R.create(alias);
					mcframe.serverMA.dbc.MAM_UNIT_R ref = mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.comp_itm_unit_cd.eq(ref.unit_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_COMP_GRP",
				$ITM_COMP_GRP1,
				new String[][]{
						{"itm_comp_grp_cd", "itm_comp_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM_COMP_GRP_R.create("ITM_COMP_GRP1");
				},
				(alias) -> {
					MAM_ITM_COMP_R own = MAM_ITM_COMP_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM_COMP_GRP_R ref = mcframe.serverMA.dbc.MAM_ITM_COMP_GRP_R.create("ITM_COMP_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_comp_grp_cd.eq(ref.itm_comp_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM1,
				new String[][]{
						{"core_itm_cd", "itm_cd"},
						{"core_itm_sub1", "itm_sub1"},
						{"core_itm_sub2", "itm_sub2"},
						{"core_itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
				},
				(alias) -> {
					MAM_ITM_COMP_R own = MAM_ITM_COMP_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.core_itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.core_itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.core_itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.core_itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM2,
				new String[][]{
						{"comp_itm_cd", "itm_cd"},
						{"comp_itm_sub1", "itm_sub1"},
						{"comp_itm_sub2", "itm_sub2"},
						{"comp_itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM2");
				},
				(alias) -> {
					MAM_ITM_COMP_R own = MAM_ITM_COMP_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.comp_itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.comp_itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.comp_itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.comp_itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_ITM_COMP_R> constMetas = new ConstMetaList<MAM_ITM_COMP_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			core_itm_cd_META,
			core_itm_sub1_META,
			core_itm_sub2_META,
			core_itm_sub3_META,
			comp_itm_cd_META,
			comp_itm_sub1_META,
			comp_itm_sub2_META,
			comp_itm_sub3_META,
			core_itm_qty_META,
			comp_itm_unit_cd_META,
			comp_itm_qty_META,
			itm_comp_grp_cd_META,
			def_flg_META,
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
			core_itm_nm_META,
			comp_itm_nm_META,
			comp_itm_unit_nm_META,
			itm_comp_grp_nm_META
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
	protected MAM_ITM_COMP_R(ConstMetaList<? extends MAM_ITM_COMP_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_ITM_COMP_R(ConstMetaList<? extends MAM_ITM_COMP_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$core_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$core_itm_cd,
				"core_itm_cd",
				core_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$core_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$core_itm_sub1,
				"core_itm_sub1",
				core_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$core_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$core_itm_sub2,
				"core_itm_sub2",
				core_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$core_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$core_itm_sub3,
				"core_itm_sub3",
				core_itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$comp_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$comp_itm_cd,
				"comp_itm_cd",
				comp_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$comp_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$comp_itm_sub1,
				"comp_itm_sub1",
				comp_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$comp_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$comp_itm_sub2,
				"comp_itm_sub2",
				comp_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$comp_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$comp_itm_sub3,
				"comp_itm_sub3",
				comp_itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$core_itm_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_COMP_R.$core_itm_qty,
				"core_itm_qty",
				core_itm_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$comp_itm_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$comp_itm_unit_cd,
				"comp_itm_unit_cd",
				comp_itm_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$comp_itm_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_COMP_R.$comp_itm_qty,
				"comp_itm_qty",
				comp_itm_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$itm_comp_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$itm_comp_grp_cd,
				"itm_comp_grp_cd",
				itm_comp_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$def_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_COMP_R.$def_flg,
				"def_flg",
				def_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$memo1,
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
			MAM_ITM_COMP_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$memo2,
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
			MAM_ITM_COMP_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$memo3,
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
			MAM_ITM_COMP_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_COMP_R.$del_flg,
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
			MAM_ITM_COMP_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$del_usr_id,
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
			MAM_ITM_COMP_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$del_usr_nm,
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
			MAM_ITM_COMP_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_COMP_R.$del_ts,
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
			MAM_ITM_COMP_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$ins_usr_id,
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
			MAM_ITM_COMP_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$ins_usr_nm,
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
			MAM_ITM_COMP_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_COMP_R.$ins_ts,
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
			MAM_ITM_COMP_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$ins_func_id,
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
			MAM_ITM_COMP_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_COMP_R.$upd_cntr,
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
			MAM_ITM_COMP_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$upd_usr_id,
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
			MAM_ITM_COMP_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$upd_usr_nm,
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
			MAM_ITM_COMP_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_COMP_R.$upd_ts,
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
			MAM_ITM_COMP_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$upd_func_id,
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
			MAM_ITM_COMP_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$upd_srv_req_no,
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
			MAM_ITM_COMP_R.$core_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$core_itm_nm,
				"core_itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM1.ITM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$comp_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$comp_itm_nm,
				"comp_itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM2.ITM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_COMP_R.$comp_itm_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$comp_itm_unit_nm,
				"comp_itm_unit_nm",
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
			MAM_ITM_COMP_R.$itm_comp_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_COMP_R.$itm_comp_grp_nm,
				"itm_comp_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM_COMP_GRP1.ITM_COMP_GRP_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_ITM_COMP_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_ITM_COMP_R create(String alias) {
		MAM_ITM_COMP_R row = new MAM_ITM_COMP_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_ITM_COMP_R createByName(T proto) {
		MAM_ITM_COMP_R row = MAM_ITM_COMP_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_COMP_R clone() {
		return (MAM_ITM_COMP_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_COMP_R createInstance() {
		return (MAM_ITM_COMP_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_COMP_R getValues(String... names) {
		return (MAM_ITM_COMP_R) super.getValues(names);
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
	 public MAW_ITM_COMP_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_ITM_COMP_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_ITM_COMP_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_ITM_COMP_KEY_R.TABLE_NAME);
	 }

	/**
	 * 主品目ＣＤ. Main item cd..<p>
	 *
	 */
	public String core_itm_cd() {
		return getConstString(offset + 0, $core_itm_cd);
	}

	/**
	 * 主品目ＣＤ. Main item cd..<p>
	 *
	 */
	public void core_itm_cd(String value) {
		setConstString(offset + 0, $core_itm_cd, value);
	}

	/**
	 * 主枝番１. Main branch No. 1.<p>
	 *
	 */
	public String core_itm_sub1() {
		return getConstString(offset + 1, $core_itm_sub1);
	}

	/**
	 * 主枝番１. Main branch No. 1.<p>
	 *
	 */
	public void core_itm_sub1(String value) {
		setConstString(offset + 1, $core_itm_sub1, value);
	}

	/**
	 * 主枝番２. Main branch No. 2.<p>
	 *
	 */
	public String core_itm_sub2() {
		return getConstString(offset + 2, $core_itm_sub2);
	}

	/**
	 * 主枝番２. Main branch No. 2.<p>
	 *
	 */
	public void core_itm_sub2(String value) {
		setConstString(offset + 2, $core_itm_sub2, value);
	}

	/**
	 * 主枝番３. Main branch No. 3.<p>
	 *
	 */
	public String core_itm_sub3() {
		return getConstString(offset + 3, $core_itm_sub3);
	}

	/**
	 * 主枝番３. Main branch No. 3.<p>
	 *
	 */
	public void core_itm_sub3(String value) {
		setConstString(offset + 3, $core_itm_sub3, value);
	}

	/**
	 * 構成品目ＣＤ. Component item cd..<p>
	 *
	 */
	public String comp_itm_cd() {
		return getConstString(offset + 4, $comp_itm_cd);
	}

	/**
	 * 構成品目ＣＤ. Component item cd..<p>
	 *
	 */
	public void comp_itm_cd(String value) {
		setConstString(offset + 4, $comp_itm_cd, value);
	}

	/**
	 * 構成枝番１. Configuration branch 1.<p>
	 *
	 */
	public String comp_itm_sub1() {
		return getConstString(offset + 5, $comp_itm_sub1);
	}

	/**
	 * 構成枝番１. Configuration branch 1.<p>
	 *
	 */
	public void comp_itm_sub1(String value) {
		setConstString(offset + 5, $comp_itm_sub1, value);
	}

	/**
	 * 構成枝番２. Configuration branch 2.<p>
	 *
	 */
	public String comp_itm_sub2() {
		return getConstString(offset + 6, $comp_itm_sub2);
	}

	/**
	 * 構成枝番２. Configuration branch 2.<p>
	 *
	 */
	public void comp_itm_sub2(String value) {
		setConstString(offset + 6, $comp_itm_sub2, value);
	}

	/**
	 * 構成枝番３. Configuration branch 3.<p>
	 *
	 */
	public String comp_itm_sub3() {
		return getConstString(offset + 7, $comp_itm_sub3);
	}

	/**
	 * 構成枝番３. Configuration branch 3.<p>
	 *
	 */
	public void comp_itm_sub3(String value) {
		setConstString(offset + 7, $comp_itm_sub3, value);
	}

	/**
	 * 主品目数量. Main item qty..<p>
	 *
	 */
	public MCNumber core_itm_qty() {
		return getConstNumber(offset + 8, $core_itm_qty);
	}

	/**
	 * 主品目数量. Main item qty..<p>
	 *
	 */
	public void core_itm_qty(MCNumber value) {
		setConstNumber(offset + 8, $core_itm_qty, value);
	}
	
	/**
	 * 主品目数量. Main item qty..<p>
	 *
	 */
	public void core_itm_qty(int value) {
		setConstNumber(offset + 8, $core_itm_qty, value);
	}
	
	/**
	 * 主品目数量. Main item qty..<p>
	 *
	 */
	public void core_itm_qty(long value) {
		setConstNumber(offset + 8, $core_itm_qty, value);
	}
	
	/**
	 * 主品目数量. Main item qty..<p>
	 *
	 */
	public void core_itm_qty(float value) {
		setConstNumber(offset + 8, $core_itm_qty, value);
	}
	
	/**
	 * 主品目数量. Main item qty..<p>
	 *
	 */
	public void core_itm_qty(double value) {
		setConstNumber(offset + 8, $core_itm_qty, value);
	}
	
	/**
	 * 構成品目単位ＣＤ. Component item unit cd..<p>
	 *
	 */
	public String comp_itm_unit_cd() {
		return getConstString(offset + 9, $comp_itm_unit_cd);
	}

	/**
	 * 構成品目単位ＣＤ. Component item unit cd..<p>
	 *
	 */
	public void comp_itm_unit_cd(String value) {
		setConstString(offset + 9, $comp_itm_unit_cd, value);
	}

	/**
	 * 構成品目数量. Component item qty..<p>
	 *
	 */
	public MCNumber comp_itm_qty() {
		return getConstNumber(offset + 10, $comp_itm_qty);
	}

	/**
	 * 構成品目数量. Component item qty..<p>
	 *
	 */
	public void comp_itm_qty(MCNumber value) {
		setConstNumber(offset + 10, $comp_itm_qty, value);
	}
	
	/**
	 * 構成品目数量. Component item qty..<p>
	 *
	 */
	public void comp_itm_qty(int value) {
		setConstNumber(offset + 10, $comp_itm_qty, value);
	}
	
	/**
	 * 構成品目数量. Component item qty..<p>
	 *
	 */
	public void comp_itm_qty(long value) {
		setConstNumber(offset + 10, $comp_itm_qty, value);
	}
	
	/**
	 * 構成品目数量. Component item qty..<p>
	 *
	 */
	public void comp_itm_qty(float value) {
		setConstNumber(offset + 10, $comp_itm_qty, value);
	}
	
	/**
	 * 構成品目数量. Component item qty..<p>
	 *
	 */
	public void comp_itm_qty(double value) {
		setConstNumber(offset + 10, $comp_itm_qty, value);
	}
	
	/**
	 * 品目構成グループＣＤ. Item configuration group cd..<p>
	 *
	 */
	public String itm_comp_grp_cd() {
		return getConstString(offset + 11, $itm_comp_grp_cd);
	}

	/**
	 * 品目構成グループＣＤ. Item configuration group cd..<p>
	 *
	 */
	public void itm_comp_grp_cd(String value) {
		setConstString(offset + 11, $itm_comp_grp_cd, value);
	}

	/**
	 * 通常構成ＦＬＧ. Normal configuration flg..<p>
	 *
	 */
	public boolean def_flg() {
		return getConstBoolean(offset + 12, $def_flg);
	}

	/**
	 * 通常構成ＦＬＧ. Normal configuration flg..<p>
	 *
	 */
	public void def_flg(boolean value) {
		setConstBoolean(offset + 12, $def_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 13, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 13, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 14, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 14, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 15, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 15, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 16, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 16, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 17, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 17, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 18, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 18, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 19, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 19, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 20, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 20, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 21, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 21, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 22, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 22, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 23, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 23, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 24, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 24, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 24, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 24, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 24, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 24, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 25, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 25, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 26, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 26, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 27, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 27, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 28, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 28, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 29, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 29, $upd_srv_req_no, value);
	}

	/**
	 * 主品名. Main item name.<p>
	 *
	 */
	public String core_itm_nm() {
		return getConstString(offset + 30, $core_itm_nm);
	}

	/**
	 * 主品名. Main item name.<p>
	 *
	 */
	public void core_itm_nm(String value) {
		setConstString(offset + 30, $core_itm_nm, value);
	}

	/**
	 * 構成品名. Component name.<p>
	 *
	 */
	public String comp_itm_nm() {
		return getConstString(offset + 31, $comp_itm_nm);
	}

	/**
	 * 構成品名. Component name.<p>
	 *
	 */
	public void comp_itm_nm(String value) {
		setConstString(offset + 31, $comp_itm_nm, value);
	}

	/**
	 * 構成品目単位名. Component item unit name.<p>
	 *
	 */
	public String comp_itm_unit_nm() {
		return getConstString(offset + 32, $comp_itm_unit_nm);
	}

	/**
	 * 構成品目単位名. Component item unit name.<p>
	 *
	 */
	public void comp_itm_unit_nm(String value) {
		setConstString(offset + 32, $comp_itm_unit_nm, value);
	}

	/**
	 * 品目構成グループ名. Item configuration group name.<p>
	 *
	 */
	public String itm_comp_grp_nm() {
		return getConstString(offset + 33, $itm_comp_grp_nm);
	}

	/**
	 * 品目構成グループ名. Item configuration group name.<p>
	 *
	 */
	public void itm_comp_grp_nm(String value) {
		setConstString(offset + 33, $itm_comp_grp_nm, value);
	}

	public String getString(String name) {
		if ($core_itm_cd.equalsIgnoreCase(name)) {
			return core_itm_cd();
		}
		if ($core_itm_sub1.equalsIgnoreCase(name)) {
			return core_itm_sub1();
		}
		if ($core_itm_sub2.equalsIgnoreCase(name)) {
			return core_itm_sub2();
		}
		if ($core_itm_sub3.equalsIgnoreCase(name)) {
			return core_itm_sub3();
		}
		if ($comp_itm_cd.equalsIgnoreCase(name)) {
			return comp_itm_cd();
		}
		if ($comp_itm_sub1.equalsIgnoreCase(name)) {
			return comp_itm_sub1();
		}
		if ($comp_itm_sub2.equalsIgnoreCase(name)) {
			return comp_itm_sub2();
		}
		if ($comp_itm_sub3.equalsIgnoreCase(name)) {
			return comp_itm_sub3();
		}
		if ($comp_itm_unit_cd.equalsIgnoreCase(name)) {
			return comp_itm_unit_cd();
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			return itm_comp_grp_cd();
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
		if ($core_itm_nm.equalsIgnoreCase(name)) {
			return core_itm_nm();
		}
		if ($comp_itm_nm.equalsIgnoreCase(name)) {
			return comp_itm_nm();
		}
		if ($comp_itm_unit_nm.equalsIgnoreCase(name)) {
			return comp_itm_unit_nm();
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			return itm_comp_grp_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			return core_itm_qty();
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			return comp_itm_qty();
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
		if ($def_flg.equalsIgnoreCase(name)) {
			return def_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($core_itm_cd.equalsIgnoreCase(name)) {
			return core_itm_cd();
		}
		if ($core_itm_sub1.equalsIgnoreCase(name)) {
			return core_itm_sub1();
		}
		if ($core_itm_sub2.equalsIgnoreCase(name)) {
			return core_itm_sub2();
		}
		if ($core_itm_sub3.equalsIgnoreCase(name)) {
			return core_itm_sub3();
		}
		if ($comp_itm_cd.equalsIgnoreCase(name)) {
			return comp_itm_cd();
		}
		if ($comp_itm_sub1.equalsIgnoreCase(name)) {
			return comp_itm_sub1();
		}
		if ($comp_itm_sub2.equalsIgnoreCase(name)) {
			return comp_itm_sub2();
		}
		if ($comp_itm_sub3.equalsIgnoreCase(name)) {
			return comp_itm_sub3();
		}
		if ($comp_itm_unit_cd.equalsIgnoreCase(name)) {
			return comp_itm_unit_cd();
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			return itm_comp_grp_cd();
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
		if ($core_itm_nm.equalsIgnoreCase(name)) {
			return core_itm_nm();
		}
		if ($comp_itm_nm.equalsIgnoreCase(name)) {
			return comp_itm_nm();
		}
		if ($comp_itm_unit_nm.equalsIgnoreCase(name)) {
			return comp_itm_unit_nm();
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			return itm_comp_grp_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			return core_itm_qty();
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			return comp_itm_qty();
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
		if ($def_flg.equalsIgnoreCase(name)) {
			return def_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($core_itm_cd.equalsIgnoreCase(name)) {
			core_itm_cd(value);
			return;
		}
		if ($core_itm_sub1.equalsIgnoreCase(name)) {
			core_itm_sub1(value);
			return;
		}
		if ($core_itm_sub2.equalsIgnoreCase(name)) {
			core_itm_sub2(value);
			return;
		}
		if ($core_itm_sub3.equalsIgnoreCase(name)) {
			core_itm_sub3(value);
			return;
		}
		if ($comp_itm_cd.equalsIgnoreCase(name)) {
			comp_itm_cd(value);
			return;
		}
		if ($comp_itm_sub1.equalsIgnoreCase(name)) {
			comp_itm_sub1(value);
			return;
		}
		if ($comp_itm_sub2.equalsIgnoreCase(name)) {
			comp_itm_sub2(value);
			return;
		}
		if ($comp_itm_sub3.equalsIgnoreCase(name)) {
			comp_itm_sub3(value);
			return;
		}
		if ($comp_itm_unit_cd.equalsIgnoreCase(name)) {
			comp_itm_unit_cd(value);
			return;
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			itm_comp_grp_cd(value);
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
		if ($core_itm_nm.equalsIgnoreCase(name)) {
			core_itm_nm(value);
			return;
		}
		if ($comp_itm_nm.equalsIgnoreCase(name)) {
			comp_itm_nm(value);
			return;
		}
		if ($comp_itm_unit_nm.equalsIgnoreCase(name)) {
			comp_itm_unit_nm(value);
			return;
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			itm_comp_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			core_itm_qty(value);
			return;
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			comp_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			core_itm_qty(value);
			return;
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			comp_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			core_itm_qty(value);
			return;
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			comp_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			core_itm_qty(value);
			return;
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			comp_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			core_itm_qty(value);
			return;
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			comp_itm_qty(value);
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
		if ($def_flg.equalsIgnoreCase(name)) {
			def_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($core_itm_cd.equalsIgnoreCase(name)) {
			core_itm_cd(value);
			return;
		}
		if ($core_itm_sub1.equalsIgnoreCase(name)) {
			core_itm_sub1(value);
			return;
		}
		if ($core_itm_sub2.equalsIgnoreCase(name)) {
			core_itm_sub2(value);
			return;
		}
		if ($core_itm_sub3.equalsIgnoreCase(name)) {
			core_itm_sub3(value);
			return;
		}
		if ($comp_itm_cd.equalsIgnoreCase(name)) {
			comp_itm_cd(value);
			return;
		}
		if ($comp_itm_sub1.equalsIgnoreCase(name)) {
			comp_itm_sub1(value);
			return;
		}
		if ($comp_itm_sub2.equalsIgnoreCase(name)) {
			comp_itm_sub2(value);
			return;
		}
		if ($comp_itm_sub3.equalsIgnoreCase(name)) {
			comp_itm_sub3(value);
			return;
		}
		if ($comp_itm_unit_cd.equalsIgnoreCase(name)) {
			comp_itm_unit_cd(value);
			return;
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			itm_comp_grp_cd(value);
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
		if ($core_itm_nm.equalsIgnoreCase(name)) {
			core_itm_nm(value);
			return;
		}
		if ($comp_itm_nm.equalsIgnoreCase(name)) {
			comp_itm_nm(value);
			return;
		}
		if ($comp_itm_unit_nm.equalsIgnoreCase(name)) {
			comp_itm_unit_nm(value);
			return;
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			itm_comp_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			core_itm_qty(value);
			return;
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			comp_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			core_itm_qty(value);
			return;
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			comp_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			core_itm_qty(value);
			return;
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			comp_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			core_itm_qty(value);
			return;
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			comp_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($core_itm_qty.equalsIgnoreCase(name)) {
			core_itm_qty(value);
			return;
		}
		if ($comp_itm_qty.equalsIgnoreCase(name)) {
			comp_itm_qty(value);
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
		if ($def_flg.equalsIgnoreCase(name)) {
			def_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
