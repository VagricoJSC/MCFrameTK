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
 * "原価品目工程取込対象ワーク // Work for cost item operation import"DBコンテナRowクラスです。<p>
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
 *  	<td>term</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期</td>
 *  	<td>Term</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算カテゴリＣＤ</td>
 *  	<td>Calculation category cd.</td>
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
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工順</td>
 *  	<td>Routing</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>nmr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>歩留製造数量</td>
 *  	<td>Yield mfg. qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dnm_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>理論製造数量</td>
 *  	<td>Ideal mfg. qty.</td>
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
 *  	<td>oper_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程管理単位ＣＤ</td>
 *  	<td>Operation management unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程基準単位数量</td>
 *  	<td>Operation base unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_conv_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程換算単位数量</td>
 *  	<td>Operation conversion unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>小数部有効桁数</td>
 *  	<td>Number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unit_conv_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>換算端数処理区分</td>
 *  	<td>Rounding type (Conversion)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>備考</td>
 *  	<td>Remarks</td>
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
 *  	<td>non_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算対象外ＦＬＧ</td>
 *  	<td>Not to calculate flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>imp_err_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取込エラーＦＬＧ</td>
 *  	<td>Import error flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取込対象ＦＬＧ</td>
 *  	<td>To import flg.</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_IMP_ITM_OPER_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MGW_IMP_ITM_OPER";

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
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	private static final MCPermColumnInfo _calc_ctg_cd = createColumnInfo("calc_ctg_cd");
	public final MCStringPermColumn calc_ctg_cd = createStringColumn(_calc_ctg_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
	/**
	 * 歩留製造数量. Yield mfg. qty..<p>
	 *
	 */
	public static final String $nmr_qty = "nmr_qty";
	private static final MCPermColumnInfo _nmr_qty = createColumnInfo("nmr_qty");
	public final MCNumberPermColumn nmr_qty = createNumberColumn(_nmr_qty);
	
	/**
	 * 理論製造数量. Ideal mfg. qty..<p>
	 *
	 */
	public static final String $dnm_qty = "dnm_qty";
	private static final MCPermColumnInfo _dnm_qty = createColumnInfo("dnm_qty");
	public final MCNumberPermColumn dnm_qty = createNumberColumn(_dnm_qty);
	
	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public static final String $yield_oper_flg = "yield_oper_flg";
	private static final MCPermColumnInfo _yield_oper_flg = createColumnInfo("yield_oper_flg");
	public final MCBooleanPermColumn yield_oper_flg = createBooleanColumn(_yield_oper_flg);
	
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
	 * 備考. Remarks.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
	private static final MCPermColumnInfo _rmrks = createColumnInfo("rmrks");
	public final MCStringPermColumn rmrks = createStringColumn(_rmrks);
	
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
	 * 計算対象外ＦＬＧ. Not to calculate flg..<p>
	 *
	 */
	public static final String $non_calc_flg = "non_calc_flg";
	private static final MCPermColumnInfo _non_calc_flg = createColumnInfo("non_calc_flg");
	public final MCBooleanPermColumn non_calc_flg = createBooleanColumn(_non_calc_flg);
	
	/**
	 * 取込エラーＦＬＧ. Import error flg..<p>
	 *
	 */
	public static final String $imp_err_flg = "imp_err_flg";
	private static final MCPermColumnInfo _imp_err_flg = createColumnInfo("imp_err_flg");
	public final MCBooleanPermColumn imp_err_flg = createBooleanColumn(_imp_err_flg);
	
	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public static final String $imp_flg = "imp_flg";
	private static final MCPermColumnInfo _imp_flg = createColumnInfo("imp_flg");
	public final MCBooleanPermColumn imp_flg = createBooleanColumn(_imp_flg);
	
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
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta nmr_qty_META = createCommonMeta($nmr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dnm_qty_META = createCommonMeta($dnm_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unit_conv_rnd_typ_META = createCommonMeta($unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.ITM_OPER_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.ITM_OPER_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.ITM_OPER_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.ITM_OPER_SUB_CHAR3);
	public static final MCMeta non_calc_flg_META = createCommonMeta($non_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta imp_err_flg_META = createCommonMeta($imp_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta imp_flg_META = createCommonMeta($imp_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	
	protected static final ConstMetaList<MGW_IMP_ITM_OPER_R> constMetas = new ConstMetaList<MGW_IMP_ITM_OPER_R>(
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
			term_META,
			calc_ctg_cd_META,
			wg_cd_META,
			disp_seq_META,
			nmr_qty_META,
			dnm_qty_META,
			yield_oper_flg_META,
			oper_unit_cd_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			dec_place_META,
			unit_conv_rnd_typ_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			non_calc_flg_META,
			imp_err_flg_META,
			imp_flg_META,
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
	protected MGW_IMP_ITM_OPER_R(ConstMetaList<? extends MGW_IMP_ITM_OPER_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_IMP_ITM_OPER_R(ConstMetaList<? extends MGW_IMP_ITM_OPER_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_IMP_ITM_OPER_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$itm_cd,
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
			MGW_IMP_ITM_OPER_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$itm_sub1,
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
			MGW_IMP_ITM_OPER_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$itm_sub2,
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
			MGW_IMP_ITM_OPER_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$itm_sub3,
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
			MGW_IMP_ITM_OPER_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$loc_cd,
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
			MGW_IMP_ITM_OPER_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$oper_ptn,
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
			MGW_IMP_ITM_OPER_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$oper_cd,
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
			MGW_IMP_ITM_OPER_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_IMP_ITM_OPER_R.$oper_seq,
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
			MGW_IMP_ITM_OPER_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGW_IMP_ITM_OPER_R.$term,
				"term",
				term,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_IMP_ITM_OPER_R.$calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$calc_ctg_cd,
				"calc_ctg_cd",
				calc_ctg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_IMP_ITM_OPER_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$wg_cd,
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
			MGW_IMP_ITM_OPER_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_IMP_ITM_OPER_R.$disp_seq,
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
			MGW_IMP_ITM_OPER_R.$nmr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_IMP_ITM_OPER_R.$nmr_qty,
				"nmr_qty",
				nmr_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_IMP_ITM_OPER_R.$dnm_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_IMP_ITM_OPER_R.$dnm_qty,
				"dnm_qty",
				dnm_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_IMP_ITM_OPER_R.$yield_oper_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_IMP_ITM_OPER_R.$yield_oper_flg,
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
			MGW_IMP_ITM_OPER_R.$oper_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$oper_unit_cd,
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
			MGW_IMP_ITM_OPER_R.$oper_std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_IMP_ITM_OPER_R.$oper_std_qty,
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
			MGW_IMP_ITM_OPER_R.$oper_conv_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_IMP_ITM_OPER_R.$oper_conv_qty,
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
			MGW_IMP_ITM_OPER_R.$dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_IMP_ITM_OPER_R.$dec_place,
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
			MGW_IMP_ITM_OPER_R.$unit_conv_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$unit_conv_rnd_typ,
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
			MGW_IMP_ITM_OPER_R.$rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$rmrks,
				"rmrks",
				rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_IMP_ITM_OPER_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$sub_char1,
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
			MGW_IMP_ITM_OPER_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$sub_char2,
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
			MGW_IMP_ITM_OPER_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$sub_char3,
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
			MGW_IMP_ITM_OPER_R.$non_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_IMP_ITM_OPER_R.$non_calc_flg,
				"non_calc_flg",
				non_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_IMP_ITM_OPER_R.$imp_err_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_IMP_ITM_OPER_R.$imp_err_flg,
				"imp_err_flg",
				imp_err_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_IMP_ITM_OPER_R.$imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_IMP_ITM_OPER_R.$imp_flg,
				"imp_flg",
				imp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_IMP_ITM_OPER_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$ins_usr_id,
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
			MGW_IMP_ITM_OPER_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$ins_usr_nm,
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
			MGW_IMP_ITM_OPER_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGW_IMP_ITM_OPER_R.$ins_ts,
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
			MGW_IMP_ITM_OPER_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$ins_func_id,
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
			MGW_IMP_ITM_OPER_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_IMP_ITM_OPER_R.$upd_cntr,
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
			MGW_IMP_ITM_OPER_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$upd_usr_id,
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
			MGW_IMP_ITM_OPER_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$upd_usr_nm,
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
			MGW_IMP_ITM_OPER_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGW_IMP_ITM_OPER_R.$upd_ts,
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
			MGW_IMP_ITM_OPER_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$upd_func_id,
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
			MGW_IMP_ITM_OPER_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_IMP_ITM_OPER_R.$upd_srv_req_no,
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
	public static MGW_IMP_ITM_OPER_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_IMP_ITM_OPER_R create(String alias) {
		MGW_IMP_ITM_OPER_R row = new MGW_IMP_ITM_OPER_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_IMP_ITM_OPER_R createByName(T proto) {
		MGW_IMP_ITM_OPER_R row = MGW_IMP_ITM_OPER_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_IMP_ITM_OPER_R clone() {
		return (MGW_IMP_ITM_OPER_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_IMP_ITM_OPER_R createInstance() {
		return (MGW_IMP_ITM_OPER_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_IMP_ITM_OPER_R getValues(String... names) {
		return (MGW_IMP_ITM_OPER_R) super.getValues(names);
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
	 public MGW_IMP_ITM_OPER_KEY_R getPkWorkDbc(String alias) {
	 	return MGW_IMP_ITM_OPER_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MGW_IMP_ITM_OPER_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MGW_IMP_ITM_OPER_KEY_R.TABLE_NAME);
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
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 8, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 8, $term, value);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 9, $calc_ctg_cd);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 9, $calc_ctg_cd, value);
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
	 * 工順. Routing.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 11, $disp_seq);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}
	
	/**
	 * 歩留製造数量. Yield mfg. qty..<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return getConstNumber(offset + 12, $nmr_qty);
	}

	/**
	 * 歩留製造数量. Yield mfg. qty..<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		setConstNumber(offset + 12, $nmr_qty, value);
	}
	
	/**
	 * 歩留製造数量. Yield mfg. qty..<p>
	 *
	 */
	public void nmr_qty(int value) {
		setConstNumber(offset + 12, $nmr_qty, value);
	}
	
	/**
	 * 歩留製造数量. Yield mfg. qty..<p>
	 *
	 */
	public void nmr_qty(long value) {
		setConstNumber(offset + 12, $nmr_qty, value);
	}
	
	/**
	 * 歩留製造数量. Yield mfg. qty..<p>
	 *
	 */
	public void nmr_qty(float value) {
		setConstNumber(offset + 12, $nmr_qty, value);
	}
	
	/**
	 * 歩留製造数量. Yield mfg. qty..<p>
	 *
	 */
	public void nmr_qty(double value) {
		setConstNumber(offset + 12, $nmr_qty, value);
	}
	
	/**
	 * 理論製造数量. Ideal mfg. qty..<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return getConstNumber(offset + 13, $dnm_qty);
	}

	/**
	 * 理論製造数量. Ideal mfg. qty..<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		setConstNumber(offset + 13, $dnm_qty, value);
	}
	
	/**
	 * 理論製造数量. Ideal mfg. qty..<p>
	 *
	 */
	public void dnm_qty(int value) {
		setConstNumber(offset + 13, $dnm_qty, value);
	}
	
	/**
	 * 理論製造数量. Ideal mfg. qty..<p>
	 *
	 */
	public void dnm_qty(long value) {
		setConstNumber(offset + 13, $dnm_qty, value);
	}
	
	/**
	 * 理論製造数量. Ideal mfg. qty..<p>
	 *
	 */
	public void dnm_qty(float value) {
		setConstNumber(offset + 13, $dnm_qty, value);
	}
	
	/**
	 * 理論製造数量. Ideal mfg. qty..<p>
	 *
	 */
	public void dnm_qty(double value) {
		setConstNumber(offset + 13, $dnm_qty, value);
	}
	
	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 14, $yield_oper_flg);
	}

	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 14, $yield_oper_flg, value);
	}

	/**
	 * 工程管理単位ＣＤ. Operation management unit cd..<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 15, $oper_unit_cd);
	}

	/**
	 * 工程管理単位ＣＤ. Operation management unit cd..<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 15, $oper_unit_cd, value);
	}

	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 16, $oper_std_qty);
	}

	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 16, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 16, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 16, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 16, $oper_std_qty, value);
	}
	
	/**
	 * 工程基準単位数量. Operation base unit qty..<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 16, $oper_std_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 17, $oper_conv_qty);
	}

	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 17, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 17, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 17, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 17, $oper_conv_qty, value);
	}
	
	/**
	 * 工程換算単位数量. Operation conversion unit qty..<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 17, $oper_conv_qty, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 18, $dec_place);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 18, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 18, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 18, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 18, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 18, $dec_place, value);
	}
	
	/**
	 * 換算端数処理区分. Rounding type (Conversion).<p>
	 *
	 */
	public String unit_conv_rnd_typ() {
		return getConstString(offset + 19, $unit_conv_rnd_typ);
	}

	/**
	 * 換算端数処理区分. Rounding type (Conversion).<p>
	 *
	 */
	public void unit_conv_rnd_typ(String value) {
		setConstString(offset + 19, $unit_conv_rnd_typ, value);
	}

	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 20, $rmrks);
	}

	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 20, $rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 21, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 21, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 22, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 22, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 23, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 23, $sub_char3, value);
	}

	/**
	 * 計算対象外ＦＬＧ. Not to calculate flg..<p>
	 *
	 */
	public boolean non_calc_flg() {
		return getConstBoolean(offset + 24, $non_calc_flg);
	}

	/**
	 * 計算対象外ＦＬＧ. Not to calculate flg..<p>
	 *
	 */
	public void non_calc_flg(boolean value) {
		setConstBoolean(offset + 24, $non_calc_flg, value);
	}

	/**
	 * 取込エラーＦＬＧ. Import error flg..<p>
	 *
	 */
	public boolean imp_err_flg() {
		return getConstBoolean(offset + 25, $imp_err_flg);
	}

	/**
	 * 取込エラーＦＬＧ. Import error flg..<p>
	 *
	 */
	public void imp_err_flg(boolean value) {
		setConstBoolean(offset + 25, $imp_err_flg, value);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public boolean imp_flg() {
		return getConstBoolean(offset + 26, $imp_flg);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public void imp_flg(boolean value) {
		setConstBoolean(offset + 26, $imp_flg, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 27, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 27, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 28, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 28, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 29, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 29, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 30, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 30, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 31, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 32, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 32, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 33, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 33, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 34, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 35, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 35, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 36, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 36, $upd_srv_req_no, value);
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			return nmr_qty();
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			return dnm_qty();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			return non_calc_flg();
		}
		if ($imp_err_flg.equalsIgnoreCase(name)) {
			return imp_err_flg();
		}
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			return nmr_qty();
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			return dnm_qty();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			return non_calc_flg();
		}
		if ($imp_err_flg.equalsIgnoreCase(name)) {
			return imp_err_flg();
		}
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
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
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
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
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
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
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
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
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			non_calc_flg(value);
			return;
		}
		if ($imp_err_flg.equalsIgnoreCase(name)) {
			imp_err_flg(value);
			return;
		}
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
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
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
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
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
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
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
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
		if ($nmr_qty.equalsIgnoreCase(name)) {
			nmr_qty(value);
			return;
		}
		if ($dnm_qty.equalsIgnoreCase(name)) {
			dnm_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			non_calc_flg(value);
			return;
		}
		if ($imp_err_flg.equalsIgnoreCase(name)) {
			imp_err_flg(value);
			return;
		}
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
