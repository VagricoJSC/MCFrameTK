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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "発番処理用引数ワーク // Argument work for numbering processing"DBコンテナRowクラスです。<p>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
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
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
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
 *  	<td>chd_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目ロットＮＯ</td>
 *  	<td>Child item lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目サブロットＮＯ</td>
 *  	<td>Child item sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業者ロットＮＯ</td>
 *  	<td>Vendor lot No.</td>
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
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付</td>
 *  	<td>Date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>str</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列</td>
 *  	<td>String</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列２</td>
 *  	<td>String 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>str3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列３</td>
 *  	<td>String 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num</td>
 *  	<td>N</td>
 *  	<td>22,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数字</td>
 *  	<td>Number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発番パタンＣＤ</td>
 *  	<td>Numbering pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>peg_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>紐付けＮＯ</td>
 *  	<td>Pegging No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>new_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発番ＮＯ</td>
 *  	<td>Numbering No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_cd_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目ＣＤ_ラベル名</td>
 *  	<td>Item cd._label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１_ラベル名</td>
 *  	<td>Branch No. 1_label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２_ラベル名</td>
 *  	<td>Branch No. 2_label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３_ラベル名</td>
 *  	<td>Branch No. 3_label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_cd_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所ＣＤ_ラベル名</td>
 *  	<td>Location cd._label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_cd_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ_ラベル名</td>
 *  	<td>Dept. cd._label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>co_cd_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社ＣＤ_ラベル名</td>
 *  	<td>Company cd._label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_cd_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ_ラベル名</td>
 *  	<td>BP cd._label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ_ラベル名</td>
 *  	<td>WG cd._label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_cd_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ_ラベル名</td>
 *  	<td>Factory/Distribution warehouse cd._label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_no_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ_ラベル名</td>
 *  	<td>Lot No._label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_lot_no_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目ロットＮＯ_ラベル名</td>
 *  	<td>Child item lot No._label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_sublot_no_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目サブロットＮＯ_ラベル名</td>
 *  	<td>Child item sublot No._label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_lot_no_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業者ロットＮＯ_ラベル名</td>
 *  	<td>Vendor Lot No._label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１_ラベル名</td>
 *  	<td>SEIBAN No. 1_label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２_ラベル名</td>
 *  	<td>SEIBAN No. 2_label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３_ラベル名</td>
 *  	<td>SEIBAN No. 3_label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４_ラベル名</td>
 *  	<td>SEIBAN No. 4_label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cd_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引ＣＤ_ラベル名</td>
 *  	<td>Transaction cd._label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付_ラベル名</td>
 *  	<td>Date_label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列_ラベル名</td>
 *  	<td>String_label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>str2_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列２_ラベル名</td>
 *  	<td>String 2_label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str3_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列３_ラベル名</td>
 *  	<td>String 3_label name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_label_nm</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数字_ラベル名</td>
 *  	<td>Number_label name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>err_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>エラーＦＬＧ</td>
 *  	<td>Error flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_NUM_ARG_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_NUM_ARG";

	public static final boolean EX_CTRL = false;
	
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
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
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
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	private static final MCPermColumnInfo _lot_no = createColumnInfo("lot_no");
	public final MCStringPermColumn lot_no = createStringColumn(_lot_no);
	
	/**
	 * 子品目ロットＮＯ. Child item lot No..<p>
	 *
	 */
	public static final String $chd_lot_no = "chd_lot_no";
	private static final MCPermColumnInfo _chd_lot_no = createColumnInfo("chd_lot_no");
	public final MCStringPermColumn chd_lot_no = createStringColumn(_chd_lot_no);
	
	/**
	 * 子品目サブロットＮＯ. Child item sublot No..<p>
	 *
	 */
	public static final String $chd_sublot_no = "chd_sublot_no";
	private static final MCPermColumnInfo _chd_sublot_no = createColumnInfo("chd_sublot_no");
	public final MCStringPermColumn chd_sublot_no = createStringColumn(_chd_sublot_no);
	
	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	private static final MCPermColumnInfo _bp_lot_no = createColumnInfo("bp_lot_no");
	public final MCStringPermColumn bp_lot_no = createStringColumn(_bp_lot_no);
	
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
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	private static final MCPermColumnInfo _trd_cd = createColumnInfo("trd_cd");
	public final MCStringPermColumn trd_cd = createStringColumn(_trd_cd);
	
	/**
	 * 日付. Date.<p>
	 *
	 */
	public static final String $dt = "dt";
	private static final MCPermColumnInfo _dt = createColumnInfo("dt");
	public final MCDatePermColumn dt = createDateColumn(_dt);
	
	/**
	 * 文字列. String.<p>
	 *
	 */
	public static final String $str = "str";
	private static final MCPermColumnInfo _str = createColumnInfo("str");
	public final MCStringPermColumn str = createStringColumn(_str);
	
	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public static final String $str2 = "str2";
	private static final MCPermColumnInfo _str2 = createColumnInfo("str2");
	public final MCStringPermColumn str2 = createStringColumn(_str2);
	
	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public static final String $str3 = "str3";
	private static final MCPermColumnInfo _str3 = createColumnInfo("str3");
	public final MCStringPermColumn str3 = createStringColumn(_str3);
	
	/**
	 * 数字. Number.<p>
	 *
	 */
	public static final String $num = "num";
	private static final MCPermColumnInfo _num = createColumnInfo("num");
	public final MCNumberPermColumn num = createNumberColumn(_num);
	
	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public static final String $num_ptn_cd = "num_ptn_cd";
	private static final MCPermColumnInfo _num_ptn_cd = createColumnInfo("num_ptn_cd");
	public final MCStringPermColumn num_ptn_cd = createStringColumn(_num_ptn_cd);
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	private static final MCPermColumnInfo _peg_no = createColumnInfo("peg_no");
	public final MCNumberPermColumn peg_no = createNumberColumn(_peg_no);
	
	/**
	 * 発番ＮＯ. Numbering No..<p>
	 *
	 */
	public static final String $new_no = "new_no";
	private static final MCPermColumnInfo _new_no = createColumnInfo("new_no");
	public final MCStringPermColumn new_no = createStringColumn(_new_no);
	
	/**
	 * 品目ＣＤ_ラベル名. Item cd._label name.<p>
	 *
	 */
	public static final String $itm_cd_label_nm = "itm_cd_label_nm";
	private static final MCPermColumnInfo _itm_cd_label_nm = createColumnInfo("itm_cd_label_nm");
	public final MCStringPermColumn itm_cd_label_nm = createStringColumn(_itm_cd_label_nm);
	
	/**
	 * 枝番１_ラベル名. Branch No. 1_label name.<p>
	 *
	 */
	public static final String $itm_sub1_label_nm = "itm_sub1_label_nm";
	private static final MCPermColumnInfo _itm_sub1_label_nm = createColumnInfo("itm_sub1_label_nm");
	public final MCStringPermColumn itm_sub1_label_nm = createStringColumn(_itm_sub1_label_nm);
	
	/**
	 * 枝番２_ラベル名. Branch No. 2_label name.<p>
	 *
	 */
	public static final String $itm_sub2_label_nm = "itm_sub2_label_nm";
	private static final MCPermColumnInfo _itm_sub2_label_nm = createColumnInfo("itm_sub2_label_nm");
	public final MCStringPermColumn itm_sub2_label_nm = createStringColumn(_itm_sub2_label_nm);
	
	/**
	 * 枝番３_ラベル名. Branch No. 3_label name.<p>
	 *
	 */
	public static final String $itm_sub3_label_nm = "itm_sub3_label_nm";
	private static final MCPermColumnInfo _itm_sub3_label_nm = createColumnInfo("itm_sub3_label_nm");
	public final MCStringPermColumn itm_sub3_label_nm = createStringColumn(_itm_sub3_label_nm);
	
	/**
	 * 場所ＣＤ_ラベル名. Location cd._label name.<p>
	 *
	 */
	public static final String $loc_cd_label_nm = "loc_cd_label_nm";
	private static final MCPermColumnInfo _loc_cd_label_nm = createColumnInfo("loc_cd_label_nm");
	public final MCStringPermColumn loc_cd_label_nm = createStringColumn(_loc_cd_label_nm);
	
	/**
	 * 部門ＣＤ_ラベル名. Dept. cd._label name.<p>
	 *
	 */
	public static final String $dpt_cd_label_nm = "dpt_cd_label_nm";
	private static final MCPermColumnInfo _dpt_cd_label_nm = createColumnInfo("dpt_cd_label_nm");
	public final MCStringPermColumn dpt_cd_label_nm = createStringColumn(_dpt_cd_label_nm);
	
	/**
	 * 会社ＣＤ_ラベル名. Company cd._label name.<p>
	 *
	 */
	public static final String $co_cd_label_nm = "co_cd_label_nm";
	private static final MCPermColumnInfo _co_cd_label_nm = createColumnInfo("co_cd_label_nm");
	public final MCStringPermColumn co_cd_label_nm = createStringColumn(_co_cd_label_nm);
	
	/**
	 * 取引先ＣＤ_ラベル名. BP cd._label name.<p>
	 *
	 */
	public static final String $bp_cd_label_nm = "bp_cd_label_nm";
	private static final MCPermColumnInfo _bp_cd_label_nm = createColumnInfo("bp_cd_label_nm");
	public final MCStringPermColumn bp_cd_label_nm = createStringColumn(_bp_cd_label_nm);
	
	/**
	 * ワーキンググループＣＤ_ラベル名. WG cd._label name.<p>
	 *
	 */
	public static final String $wg_cd_label_nm = "wg_cd_label_nm";
	private static final MCPermColumnInfo _wg_cd_label_nm = createColumnInfo("wg_cd_label_nm");
	public final MCStringPermColumn wg_cd_label_nm = createStringColumn(_wg_cd_label_nm);
	
	/**
	 * 工場・物流倉庫ＣＤ_ラベル名. Factory/Distribution warehouse cd._label name.<p>
	 *
	 */
	public static final String $site_cd_label_nm = "site_cd_label_nm";
	private static final MCPermColumnInfo _site_cd_label_nm = createColumnInfo("site_cd_label_nm");
	public final MCStringPermColumn site_cd_label_nm = createStringColumn(_site_cd_label_nm);
	
	/**
	 * ロットＮＯ_ラベル名. Lot No._label name.<p>
	 *
	 */
	public static final String $lot_no_label_nm = "lot_no_label_nm";
	private static final MCPermColumnInfo _lot_no_label_nm = createColumnInfo("lot_no_label_nm");
	public final MCStringPermColumn lot_no_label_nm = createStringColumn(_lot_no_label_nm);
	
	/**
	 * 子品目ロットＮＯ_ラベル名. Child item lot No._label name.<p>
	 *
	 */
	public static final String $chd_lot_no_label_nm = "chd_lot_no_label_nm";
	private static final MCPermColumnInfo _chd_lot_no_label_nm = createColumnInfo("chd_lot_no_label_nm");
	public final MCStringPermColumn chd_lot_no_label_nm = createStringColumn(_chd_lot_no_label_nm);
	
	/**
	 * 子品目サブロットＮＯ_ラベル名. Child item sublot No._label name.<p>
	 *
	 */
	public static final String $chd_sublot_no_label_nm = "chd_sublot_no_label_nm";
	private static final MCPermColumnInfo _chd_sublot_no_label_nm = createColumnInfo("chd_sublot_no_label_nm");
	public final MCStringPermColumn chd_sublot_no_label_nm = createStringColumn(_chd_sublot_no_label_nm);
	
	/**
	 * 業者ロットＮＯ_ラベル名. Vendor Lot No._label name.<p>
	 *
	 */
	public static final String $bp_lot_no_label_nm = "bp_lot_no_label_nm";
	private static final MCPermColumnInfo _bp_lot_no_label_nm = createColumnInfo("bp_lot_no_label_nm");
	public final MCStringPermColumn bp_lot_no_label_nm = createStringColumn(_bp_lot_no_label_nm);
	
	/**
	 * 手配ＮＯ１_ラベル名. SEIBAN No. 1_label name.<p>
	 *
	 */
	public static final String $sno1_label_nm = "sno1_label_nm";
	private static final MCPermColumnInfo _sno1_label_nm = createColumnInfo("sno1_label_nm");
	public final MCStringPermColumn sno1_label_nm = createStringColumn(_sno1_label_nm);
	
	/**
	 * 手配ＮＯ２_ラベル名. SEIBAN No. 2_label name.<p>
	 *
	 */
	public static final String $sno2_label_nm = "sno2_label_nm";
	private static final MCPermColumnInfo _sno2_label_nm = createColumnInfo("sno2_label_nm");
	public final MCStringPermColumn sno2_label_nm = createStringColumn(_sno2_label_nm);
	
	/**
	 * 手配ＮＯ３_ラベル名. SEIBAN No. 3_label name.<p>
	 *
	 */
	public static final String $sno3_label_nm = "sno3_label_nm";
	private static final MCPermColumnInfo _sno3_label_nm = createColumnInfo("sno3_label_nm");
	public final MCStringPermColumn sno3_label_nm = createStringColumn(_sno3_label_nm);
	
	/**
	 * 手配ＮＯ４_ラベル名. SEIBAN No. 4_label name.<p>
	 *
	 */
	public static final String $sno4_label_nm = "sno4_label_nm";
	private static final MCPermColumnInfo _sno4_label_nm = createColumnInfo("sno4_label_nm");
	public final MCStringPermColumn sno4_label_nm = createStringColumn(_sno4_label_nm);
	
	/**
	 * 取引ＣＤ_ラベル名. Transaction cd._label name.<p>
	 *
	 */
	public static final String $trd_cd_label_nm = "trd_cd_label_nm";
	private static final MCPermColumnInfo _trd_cd_label_nm = createColumnInfo("trd_cd_label_nm");
	public final MCStringPermColumn trd_cd_label_nm = createStringColumn(_trd_cd_label_nm);
	
	/**
	 * 日付_ラベル名. Date_label name.<p>
	 *
	 */
	public static final String $dt_label_nm = "dt_label_nm";
	private static final MCPermColumnInfo _dt_label_nm = createColumnInfo("dt_label_nm");
	public final MCStringPermColumn dt_label_nm = createStringColumn(_dt_label_nm);
	
	/**
	 * 文字列_ラベル名. String_label name.<p>
	 *
	 */
	public static final String $str_label_nm = "str_label_nm";
	private static final MCPermColumnInfo _str_label_nm = createColumnInfo("str_label_nm");
	public final MCStringPermColumn str_label_nm = createStringColumn(_str_label_nm);
	
	/**
	 * 文字列２_ラベル名. String 2_label name.<p>
	 *
	 */
	public static final String $str2_label_nm = "str2_label_nm";
	private static final MCPermColumnInfo _str2_label_nm = createColumnInfo("str2_label_nm");
	public final MCStringPermColumn str2_label_nm = createStringColumn(_str2_label_nm);
	
	/**
	 * 文字列３_ラベル名. String 3_label name.<p>
	 *
	 */
	public static final String $str3_label_nm = "str3_label_nm";
	private static final MCPermColumnInfo _str3_label_nm = createColumnInfo("str3_label_nm");
	public final MCStringPermColumn str3_label_nm = createStringColumn(_str3_label_nm);
	
	/**
	 * 数字_ラベル名. Number_label name.<p>
	 *
	 */
	public static final String $num_label_nm = "num_label_nm";
	private static final MCPermColumnInfo _num_label_nm = createColumnInfo("num_label_nm");
	public final MCStringPermColumn num_label_nm = createStringColumn(_num_label_nm);
	
	/**
	 * エラーＦＬＧ. Error flg..<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	private static final MCPermColumnInfo _err_flg = createColumnInfo("err_flg");
	public final MCBooleanPermColumn err_flg = createBooleanColumn(_err_flg);
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta chd_lot_no_META = createCommonMeta($chd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta chd_sublot_no_META = createCommonMeta($chd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta str_META = createCommonMeta($str, mcframe.commonMA.meta.MA_META.NUM_STR);
	public static final MCMeta str2_META = createCommonMeta($str2, mcframe.commonMA.meta.MA_META.NUM_STR);
	public static final MCMeta str3_META = createCommonMeta($str3, mcframe.commonMA.meta.MA_META.NUM_STR);
	public static final MCMeta num_META = createCommonMeta($num, mcframe.commonMA.meta.MA_META.NUM_NUMBER);
	public static final MCMeta num_ptn_cd_META = createCommonMeta($num_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta new_no_META = createCommonMeta($new_no, mcframe.commonMA.meta.MA_META.NUMBERING);
	public static final MCMeta itm_cd_label_nm_META = createCommonMeta($itm_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta itm_sub1_label_nm_META = createCommonMeta($itm_sub1_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta itm_sub2_label_nm_META = createCommonMeta($itm_sub2_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta itm_sub3_label_nm_META = createCommonMeta($itm_sub3_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta loc_cd_label_nm_META = createCommonMeta($loc_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta dpt_cd_label_nm_META = createCommonMeta($dpt_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta co_cd_label_nm_META = createCommonMeta($co_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta bp_cd_label_nm_META = createCommonMeta($bp_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta wg_cd_label_nm_META = createCommonMeta($wg_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta site_cd_label_nm_META = createCommonMeta($site_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta lot_no_label_nm_META = createCommonMeta($lot_no_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta chd_lot_no_label_nm_META = createCommonMeta($chd_lot_no_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta chd_sublot_no_label_nm_META = createCommonMeta($chd_sublot_no_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta bp_lot_no_label_nm_META = createCommonMeta($bp_lot_no_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta sno1_label_nm_META = createCommonMeta($sno1_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta sno2_label_nm_META = createCommonMeta($sno2_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta sno3_label_nm_META = createCommonMeta($sno3_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta sno4_label_nm_META = createCommonMeta($sno4_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta trd_cd_label_nm_META = createCommonMeta($trd_cd_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta dt_label_nm_META = createCommonMeta($dt_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta str_label_nm_META = createCommonMeta($str_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta str2_label_nm_META = createCommonMeta($str2_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta str3_label_nm_META = createCommonMeta($str3_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta num_label_nm_META = createCommonMeta($num_label_nm, mcframe.commonMA.meta.MA_META.ELM_LABEL_NM);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAW_NUM_ARG_R> constMetas = new ConstMetaList<MAW_NUM_ARG_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			loc_cd_META,
			dpt_cd_META,
			co_cd_META,
			bp_cd_META,
			wg_cd_META,
			site_cd_META,
			lot_no_META,
			chd_lot_no_META,
			chd_sublot_no_META,
			bp_lot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			trd_cd_META,
			dt_META,
			str_META,
			str2_META,
			str3_META,
			num_META,
			num_ptn_cd_META,
			peg_no_META,
			new_no_META,
			itm_cd_label_nm_META,
			itm_sub1_label_nm_META,
			itm_sub2_label_nm_META,
			itm_sub3_label_nm_META,
			loc_cd_label_nm_META,
			dpt_cd_label_nm_META,
			co_cd_label_nm_META,
			bp_cd_label_nm_META,
			wg_cd_label_nm_META,
			site_cd_label_nm_META,
			lot_no_label_nm_META,
			chd_lot_no_label_nm_META,
			chd_sublot_no_label_nm_META,
			bp_lot_no_label_nm_META,
			sno1_label_nm_META,
			sno2_label_nm_META,
			sno3_label_nm_META,
			sno4_label_nm_META,
			trd_cd_label_nm_META,
			dt_label_nm_META,
			str_label_nm_META,
			str2_label_nm_META,
			str3_label_nm_META,
			num_label_nm_META,
			err_flg_META
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
	protected MAW_NUM_ARG_R(ConstMetaList<? extends MAW_NUM_ARG_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_NUM_ARG_R(ConstMetaList<? extends MAW_NUM_ARG_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$itm_cd,
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
			MAW_NUM_ARG_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$itm_sub1,
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
			MAW_NUM_ARG_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$itm_sub2,
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
			MAW_NUM_ARG_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$itm_sub3,
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
			MAW_NUM_ARG_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$loc_cd,
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
			MAW_NUM_ARG_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$dpt_cd,
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
			MAW_NUM_ARG_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$co_cd,
				"co_cd",
				co_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$bp_cd,
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
			MAW_NUM_ARG_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$site_cd,
				"site_cd",
				site_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$lot_no,
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
			MAW_NUM_ARG_R.$chd_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$chd_lot_no,
				"chd_lot_no",
				chd_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$chd_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$chd_sublot_no,
				"chd_sublot_no",
				chd_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$bp_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$bp_lot_no,
				"bp_lot_no",
				bp_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$sno1,
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
			MAW_NUM_ARG_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$sno2,
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
			MAW_NUM_ARG_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$sno3,
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
			MAW_NUM_ARG_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$sno4,
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
			MAW_NUM_ARG_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$trd_cd,
				"trd_cd",
				trd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAW_NUM_ARG_R.$dt,
				"dt",
				dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$str,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$str,
				"str",
				str,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$str2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$str2,
				"str2",
				str2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$str3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$str3,
				"str3",
				str3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$num,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_NUM_ARG_R.$num,
				"num",
				num,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$num_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$num_ptn_cd,
				"num_ptn_cd",
				num_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$peg_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_NUM_ARG_R.$peg_no,
				"peg_no",
				peg_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$new_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$new_no,
				"new_no",
				new_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$itm_cd_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$itm_cd_label_nm,
				"itm_cd_label_nm",
				itm_cd_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$itm_sub1_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$itm_sub1_label_nm,
				"itm_sub1_label_nm",
				itm_sub1_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$itm_sub2_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$itm_sub2_label_nm,
				"itm_sub2_label_nm",
				itm_sub2_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$itm_sub3_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$itm_sub3_label_nm,
				"itm_sub3_label_nm",
				itm_sub3_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$loc_cd_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$loc_cd_label_nm,
				"loc_cd_label_nm",
				loc_cd_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$dpt_cd_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$dpt_cd_label_nm,
				"dpt_cd_label_nm",
				dpt_cd_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$co_cd_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$co_cd_label_nm,
				"co_cd_label_nm",
				co_cd_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$bp_cd_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$bp_cd_label_nm,
				"bp_cd_label_nm",
				bp_cd_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$wg_cd_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$wg_cd_label_nm,
				"wg_cd_label_nm",
				wg_cd_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$site_cd_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$site_cd_label_nm,
				"site_cd_label_nm",
				site_cd_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$lot_no_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$lot_no_label_nm,
				"lot_no_label_nm",
				lot_no_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$chd_lot_no_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$chd_lot_no_label_nm,
				"chd_lot_no_label_nm",
				chd_lot_no_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$chd_sublot_no_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$chd_sublot_no_label_nm,
				"chd_sublot_no_label_nm",
				chd_sublot_no_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$bp_lot_no_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$bp_lot_no_label_nm,
				"bp_lot_no_label_nm",
				bp_lot_no_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$sno1_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$sno1_label_nm,
				"sno1_label_nm",
				sno1_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$sno2_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$sno2_label_nm,
				"sno2_label_nm",
				sno2_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$sno3_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$sno3_label_nm,
				"sno3_label_nm",
				sno3_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$sno4_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$sno4_label_nm,
				"sno4_label_nm",
				sno4_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$trd_cd_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$trd_cd_label_nm,
				"trd_cd_label_nm",
				trd_cd_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$dt_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$dt_label_nm,
				"dt_label_nm",
				dt_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$str_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$str_label_nm,
				"str_label_nm",
				str_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$str2_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$str2_label_nm,
				"str2_label_nm",
				str2_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$str3_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$str3_label_nm,
				"str3_label_nm",
				str3_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$num_label_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_NUM_ARG_R.$num_label_nm,
				"num_label_nm",
				num_label_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_NUM_ARG_R.$err_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAW_NUM_ARG_R.$err_flg,
				"err_flg",
				err_flg,
				false,
				false,
				false,
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
	public static MAW_NUM_ARG_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_NUM_ARG_R create(String alias) {
		MAW_NUM_ARG_R row = new MAW_NUM_ARG_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_NUM_ARG_R createByName(T proto) {
		MAW_NUM_ARG_R row = MAW_NUM_ARG_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_NUM_ARG_R clone() {
		return (MAW_NUM_ARG_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_NUM_ARG_R createInstance() {
		return (MAW_NUM_ARG_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_NUM_ARG_R getValues(String... names) {
		return (MAW_NUM_ARG_R) super.getValues(names);
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
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 5, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 5, $dpt_cd, value);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 6, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 6, $co_cd, value);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 7, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 7, $bp_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 9, $site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 9, $site_cd, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 10, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 10, $lot_no, value);
	}

	/**
	 * 子品目ロットＮＯ. Child item lot No..<p>
	 *
	 */
	public String chd_lot_no() {
		return getConstString(offset + 11, $chd_lot_no);
	}

	/**
	 * 子品目ロットＮＯ. Child item lot No..<p>
	 *
	 */
	public void chd_lot_no(String value) {
		setConstString(offset + 11, $chd_lot_no, value);
	}

	/**
	 * 子品目サブロットＮＯ. Child item sublot No..<p>
	 *
	 */
	public String chd_sublot_no() {
		return getConstString(offset + 12, $chd_sublot_no);
	}

	/**
	 * 子品目サブロットＮＯ. Child item sublot No..<p>
	 *
	 */
	public void chd_sublot_no(String value) {
		setConstString(offset + 12, $chd_sublot_no, value);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 13, $bp_lot_no);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 13, $bp_lot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 14, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 14, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 15, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 15, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 16, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 16, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 17, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 17, $sno4, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 18, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 18, $trd_cd, value);
	}

	/**
	 * 日付. Date.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 19, $dt);
	}

	/**
	 * 日付. Date.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 19, $dt, value);
	}

	/**
	 * 文字列. String.<p>
	 *
	 */
	public String str() {
		return getConstString(offset + 20, $str);
	}

	/**
	 * 文字列. String.<p>
	 *
	 */
	public void str(String value) {
		setConstString(offset + 20, $str, value);
	}

	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public String str2() {
		return getConstString(offset + 21, $str2);
	}

	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public void str2(String value) {
		setConstString(offset + 21, $str2, value);
	}

	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public String str3() {
		return getConstString(offset + 22, $str3);
	}

	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public void str3(String value) {
		setConstString(offset + 22, $str3, value);
	}

	/**
	 * 数字. Number.<p>
	 *
	 */
	public MCNumber num() {
		return getConstNumber(offset + 23, $num);
	}

	/**
	 * 数字. Number.<p>
	 *
	 */
	public void num(MCNumber value) {
		setConstNumber(offset + 23, $num, value);
	}
	
	/**
	 * 数字. Number.<p>
	 *
	 */
	public void num(int value) {
		setConstNumber(offset + 23, $num, value);
	}
	
	/**
	 * 数字. Number.<p>
	 *
	 */
	public void num(long value) {
		setConstNumber(offset + 23, $num, value);
	}
	
	/**
	 * 数字. Number.<p>
	 *
	 */
	public void num(float value) {
		setConstNumber(offset + 23, $num, value);
	}
	
	/**
	 * 数字. Number.<p>
	 *
	 */
	public void num(double value) {
		setConstNumber(offset + 23, $num, value);
	}
	
	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public String num_ptn_cd() {
		return getConstString(offset + 24, $num_ptn_cd);
	}

	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public void num_ptn_cd(String value) {
		setConstString(offset + 24, $num_ptn_cd, value);
	}

	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 25, $peg_no);
	}

	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 25, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 25, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 25, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 25, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 25, $peg_no, value);
	}
	
	/**
	 * 発番ＮＯ. Numbering No..<p>
	 *
	 */
	public String new_no() {
		return getConstString(offset + 26, $new_no);
	}

	/**
	 * 発番ＮＯ. Numbering No..<p>
	 *
	 */
	public void new_no(String value) {
		setConstString(offset + 26, $new_no, value);
	}

	/**
	 * 品目ＣＤ_ラベル名. Item cd._label name.<p>
	 *
	 */
	public String itm_cd_label_nm() {
		return getConstString(offset + 27, $itm_cd_label_nm);
	}

	/**
	 * 品目ＣＤ_ラベル名. Item cd._label name.<p>
	 *
	 */
	public void itm_cd_label_nm(String value) {
		setConstString(offset + 27, $itm_cd_label_nm, value);
	}

	/**
	 * 枝番１_ラベル名. Branch No. 1_label name.<p>
	 *
	 */
	public String itm_sub1_label_nm() {
		return getConstString(offset + 28, $itm_sub1_label_nm);
	}

	/**
	 * 枝番１_ラベル名. Branch No. 1_label name.<p>
	 *
	 */
	public void itm_sub1_label_nm(String value) {
		setConstString(offset + 28, $itm_sub1_label_nm, value);
	}

	/**
	 * 枝番２_ラベル名. Branch No. 2_label name.<p>
	 *
	 */
	public String itm_sub2_label_nm() {
		return getConstString(offset + 29, $itm_sub2_label_nm);
	}

	/**
	 * 枝番２_ラベル名. Branch No. 2_label name.<p>
	 *
	 */
	public void itm_sub2_label_nm(String value) {
		setConstString(offset + 29, $itm_sub2_label_nm, value);
	}

	/**
	 * 枝番３_ラベル名. Branch No. 3_label name.<p>
	 *
	 */
	public String itm_sub3_label_nm() {
		return getConstString(offset + 30, $itm_sub3_label_nm);
	}

	/**
	 * 枝番３_ラベル名. Branch No. 3_label name.<p>
	 *
	 */
	public void itm_sub3_label_nm(String value) {
		setConstString(offset + 30, $itm_sub3_label_nm, value);
	}

	/**
	 * 場所ＣＤ_ラベル名. Location cd._label name.<p>
	 *
	 */
	public String loc_cd_label_nm() {
		return getConstString(offset + 31, $loc_cd_label_nm);
	}

	/**
	 * 場所ＣＤ_ラベル名. Location cd._label name.<p>
	 *
	 */
	public void loc_cd_label_nm(String value) {
		setConstString(offset + 31, $loc_cd_label_nm, value);
	}

	/**
	 * 部門ＣＤ_ラベル名. Dept. cd._label name.<p>
	 *
	 */
	public String dpt_cd_label_nm() {
		return getConstString(offset + 32, $dpt_cd_label_nm);
	}

	/**
	 * 部門ＣＤ_ラベル名. Dept. cd._label name.<p>
	 *
	 */
	public void dpt_cd_label_nm(String value) {
		setConstString(offset + 32, $dpt_cd_label_nm, value);
	}

	/**
	 * 会社ＣＤ_ラベル名. Company cd._label name.<p>
	 *
	 */
	public String co_cd_label_nm() {
		return getConstString(offset + 33, $co_cd_label_nm);
	}

	/**
	 * 会社ＣＤ_ラベル名. Company cd._label name.<p>
	 *
	 */
	public void co_cd_label_nm(String value) {
		setConstString(offset + 33, $co_cd_label_nm, value);
	}

	/**
	 * 取引先ＣＤ_ラベル名. BP cd._label name.<p>
	 *
	 */
	public String bp_cd_label_nm() {
		return getConstString(offset + 34, $bp_cd_label_nm);
	}

	/**
	 * 取引先ＣＤ_ラベル名. BP cd._label name.<p>
	 *
	 */
	public void bp_cd_label_nm(String value) {
		setConstString(offset + 34, $bp_cd_label_nm, value);
	}

	/**
	 * ワーキンググループＣＤ_ラベル名. WG cd._label name.<p>
	 *
	 */
	public String wg_cd_label_nm() {
		return getConstString(offset + 35, $wg_cd_label_nm);
	}

	/**
	 * ワーキンググループＣＤ_ラベル名. WG cd._label name.<p>
	 *
	 */
	public void wg_cd_label_nm(String value) {
		setConstString(offset + 35, $wg_cd_label_nm, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ_ラベル名. Factory/Distribution warehouse cd._label name.<p>
	 *
	 */
	public String site_cd_label_nm() {
		return getConstString(offset + 36, $site_cd_label_nm);
	}

	/**
	 * 工場・物流倉庫ＣＤ_ラベル名. Factory/Distribution warehouse cd._label name.<p>
	 *
	 */
	public void site_cd_label_nm(String value) {
		setConstString(offset + 36, $site_cd_label_nm, value);
	}

	/**
	 * ロットＮＯ_ラベル名. Lot No._label name.<p>
	 *
	 */
	public String lot_no_label_nm() {
		return getConstString(offset + 37, $lot_no_label_nm);
	}

	/**
	 * ロットＮＯ_ラベル名. Lot No._label name.<p>
	 *
	 */
	public void lot_no_label_nm(String value) {
		setConstString(offset + 37, $lot_no_label_nm, value);
	}

	/**
	 * 子品目ロットＮＯ_ラベル名. Child item lot No._label name.<p>
	 *
	 */
	public String chd_lot_no_label_nm() {
		return getConstString(offset + 38, $chd_lot_no_label_nm);
	}

	/**
	 * 子品目ロットＮＯ_ラベル名. Child item lot No._label name.<p>
	 *
	 */
	public void chd_lot_no_label_nm(String value) {
		setConstString(offset + 38, $chd_lot_no_label_nm, value);
	}

	/**
	 * 子品目サブロットＮＯ_ラベル名. Child item sublot No._label name.<p>
	 *
	 */
	public String chd_sublot_no_label_nm() {
		return getConstString(offset + 39, $chd_sublot_no_label_nm);
	}

	/**
	 * 子品目サブロットＮＯ_ラベル名. Child item sublot No._label name.<p>
	 *
	 */
	public void chd_sublot_no_label_nm(String value) {
		setConstString(offset + 39, $chd_sublot_no_label_nm, value);
	}

	/**
	 * 業者ロットＮＯ_ラベル名. Vendor Lot No._label name.<p>
	 *
	 */
	public String bp_lot_no_label_nm() {
		return getConstString(offset + 40, $bp_lot_no_label_nm);
	}

	/**
	 * 業者ロットＮＯ_ラベル名. Vendor Lot No._label name.<p>
	 *
	 */
	public void bp_lot_no_label_nm(String value) {
		setConstString(offset + 40, $bp_lot_no_label_nm, value);
	}

	/**
	 * 手配ＮＯ１_ラベル名. SEIBAN No. 1_label name.<p>
	 *
	 */
	public String sno1_label_nm() {
		return getConstString(offset + 41, $sno1_label_nm);
	}

	/**
	 * 手配ＮＯ１_ラベル名. SEIBAN No. 1_label name.<p>
	 *
	 */
	public void sno1_label_nm(String value) {
		setConstString(offset + 41, $sno1_label_nm, value);
	}

	/**
	 * 手配ＮＯ２_ラベル名. SEIBAN No. 2_label name.<p>
	 *
	 */
	public String sno2_label_nm() {
		return getConstString(offset + 42, $sno2_label_nm);
	}

	/**
	 * 手配ＮＯ２_ラベル名. SEIBAN No. 2_label name.<p>
	 *
	 */
	public void sno2_label_nm(String value) {
		setConstString(offset + 42, $sno2_label_nm, value);
	}

	/**
	 * 手配ＮＯ３_ラベル名. SEIBAN No. 3_label name.<p>
	 *
	 */
	public String sno3_label_nm() {
		return getConstString(offset + 43, $sno3_label_nm);
	}

	/**
	 * 手配ＮＯ３_ラベル名. SEIBAN No. 3_label name.<p>
	 *
	 */
	public void sno3_label_nm(String value) {
		setConstString(offset + 43, $sno3_label_nm, value);
	}

	/**
	 * 手配ＮＯ４_ラベル名. SEIBAN No. 4_label name.<p>
	 *
	 */
	public String sno4_label_nm() {
		return getConstString(offset + 44, $sno4_label_nm);
	}

	/**
	 * 手配ＮＯ４_ラベル名. SEIBAN No. 4_label name.<p>
	 *
	 */
	public void sno4_label_nm(String value) {
		setConstString(offset + 44, $sno4_label_nm, value);
	}

	/**
	 * 取引ＣＤ_ラベル名. Transaction cd._label name.<p>
	 *
	 */
	public String trd_cd_label_nm() {
		return getConstString(offset + 45, $trd_cd_label_nm);
	}

	/**
	 * 取引ＣＤ_ラベル名. Transaction cd._label name.<p>
	 *
	 */
	public void trd_cd_label_nm(String value) {
		setConstString(offset + 45, $trd_cd_label_nm, value);
	}

	/**
	 * 日付_ラベル名. Date_label name.<p>
	 *
	 */
	public String dt_label_nm() {
		return getConstString(offset + 46, $dt_label_nm);
	}

	/**
	 * 日付_ラベル名. Date_label name.<p>
	 *
	 */
	public void dt_label_nm(String value) {
		setConstString(offset + 46, $dt_label_nm, value);
	}

	/**
	 * 文字列_ラベル名. String_label name.<p>
	 *
	 */
	public String str_label_nm() {
		return getConstString(offset + 47, $str_label_nm);
	}

	/**
	 * 文字列_ラベル名. String_label name.<p>
	 *
	 */
	public void str_label_nm(String value) {
		setConstString(offset + 47, $str_label_nm, value);
	}

	/**
	 * 文字列２_ラベル名. String 2_label name.<p>
	 *
	 */
	public String str2_label_nm() {
		return getConstString(offset + 48, $str2_label_nm);
	}

	/**
	 * 文字列２_ラベル名. String 2_label name.<p>
	 *
	 */
	public void str2_label_nm(String value) {
		setConstString(offset + 48, $str2_label_nm, value);
	}

	/**
	 * 文字列３_ラベル名. String 3_label name.<p>
	 *
	 */
	public String str3_label_nm() {
		return getConstString(offset + 49, $str3_label_nm);
	}

	/**
	 * 文字列３_ラベル名. String 3_label name.<p>
	 *
	 */
	public void str3_label_nm(String value) {
		setConstString(offset + 49, $str3_label_nm, value);
	}

	/**
	 * 数字_ラベル名. Number_label name.<p>
	 *
	 */
	public String num_label_nm() {
		return getConstString(offset + 50, $num_label_nm);
	}

	/**
	 * 数字_ラベル名. Number_label name.<p>
	 *
	 */
	public void num_label_nm(String value) {
		setConstString(offset + 50, $num_label_nm, value);
	}

	/**
	 * エラーＦＬＧ. Error flg..<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 51, $err_flg);
	}

	/**
	 * エラーＦＬＧ. Error flg..<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 51, $err_flg, value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($str.equalsIgnoreCase(name)) {
			return str();
		}
		if ($str2.equalsIgnoreCase(name)) {
			return str2();
		}
		if ($str3.equalsIgnoreCase(name)) {
			return str3();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($new_no.equalsIgnoreCase(name)) {
			return new_no();
		}
		if ($itm_cd_label_nm.equalsIgnoreCase(name)) {
			return itm_cd_label_nm();
		}
		if ($itm_sub1_label_nm.equalsIgnoreCase(name)) {
			return itm_sub1_label_nm();
		}
		if ($itm_sub2_label_nm.equalsIgnoreCase(name)) {
			return itm_sub2_label_nm();
		}
		if ($itm_sub3_label_nm.equalsIgnoreCase(name)) {
			return itm_sub3_label_nm();
		}
		if ($loc_cd_label_nm.equalsIgnoreCase(name)) {
			return loc_cd_label_nm();
		}
		if ($dpt_cd_label_nm.equalsIgnoreCase(name)) {
			return dpt_cd_label_nm();
		}
		if ($co_cd_label_nm.equalsIgnoreCase(name)) {
			return co_cd_label_nm();
		}
		if ($bp_cd_label_nm.equalsIgnoreCase(name)) {
			return bp_cd_label_nm();
		}
		if ($wg_cd_label_nm.equalsIgnoreCase(name)) {
			return wg_cd_label_nm();
		}
		if ($site_cd_label_nm.equalsIgnoreCase(name)) {
			return site_cd_label_nm();
		}
		if ($lot_no_label_nm.equalsIgnoreCase(name)) {
			return lot_no_label_nm();
		}
		if ($chd_lot_no_label_nm.equalsIgnoreCase(name)) {
			return chd_lot_no_label_nm();
		}
		if ($chd_sublot_no_label_nm.equalsIgnoreCase(name)) {
			return chd_sublot_no_label_nm();
		}
		if ($bp_lot_no_label_nm.equalsIgnoreCase(name)) {
			return bp_lot_no_label_nm();
		}
		if ($sno1_label_nm.equalsIgnoreCase(name)) {
			return sno1_label_nm();
		}
		if ($sno2_label_nm.equalsIgnoreCase(name)) {
			return sno2_label_nm();
		}
		if ($sno3_label_nm.equalsIgnoreCase(name)) {
			return sno3_label_nm();
		}
		if ($sno4_label_nm.equalsIgnoreCase(name)) {
			return sno4_label_nm();
		}
		if ($trd_cd_label_nm.equalsIgnoreCase(name)) {
			return trd_cd_label_nm();
		}
		if ($dt_label_nm.equalsIgnoreCase(name)) {
			return dt_label_nm();
		}
		if ($str_label_nm.equalsIgnoreCase(name)) {
			return str_label_nm();
		}
		if ($str2_label_nm.equalsIgnoreCase(name)) {
			return str2_label_nm();
		}
		if ($str3_label_nm.equalsIgnoreCase(name)) {
			return str3_label_nm();
		}
		if ($num_label_nm.equalsIgnoreCase(name)) {
			return num_label_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($num.equalsIgnoreCase(name)) {
			return num();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($str.equalsIgnoreCase(name)) {
			return str();
		}
		if ($str2.equalsIgnoreCase(name)) {
			return str2();
		}
		if ($str3.equalsIgnoreCase(name)) {
			return str3();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($new_no.equalsIgnoreCase(name)) {
			return new_no();
		}
		if ($itm_cd_label_nm.equalsIgnoreCase(name)) {
			return itm_cd_label_nm();
		}
		if ($itm_sub1_label_nm.equalsIgnoreCase(name)) {
			return itm_sub1_label_nm();
		}
		if ($itm_sub2_label_nm.equalsIgnoreCase(name)) {
			return itm_sub2_label_nm();
		}
		if ($itm_sub3_label_nm.equalsIgnoreCase(name)) {
			return itm_sub3_label_nm();
		}
		if ($loc_cd_label_nm.equalsIgnoreCase(name)) {
			return loc_cd_label_nm();
		}
		if ($dpt_cd_label_nm.equalsIgnoreCase(name)) {
			return dpt_cd_label_nm();
		}
		if ($co_cd_label_nm.equalsIgnoreCase(name)) {
			return co_cd_label_nm();
		}
		if ($bp_cd_label_nm.equalsIgnoreCase(name)) {
			return bp_cd_label_nm();
		}
		if ($wg_cd_label_nm.equalsIgnoreCase(name)) {
			return wg_cd_label_nm();
		}
		if ($site_cd_label_nm.equalsIgnoreCase(name)) {
			return site_cd_label_nm();
		}
		if ($lot_no_label_nm.equalsIgnoreCase(name)) {
			return lot_no_label_nm();
		}
		if ($chd_lot_no_label_nm.equalsIgnoreCase(name)) {
			return chd_lot_no_label_nm();
		}
		if ($chd_sublot_no_label_nm.equalsIgnoreCase(name)) {
			return chd_sublot_no_label_nm();
		}
		if ($bp_lot_no_label_nm.equalsIgnoreCase(name)) {
			return bp_lot_no_label_nm();
		}
		if ($sno1_label_nm.equalsIgnoreCase(name)) {
			return sno1_label_nm();
		}
		if ($sno2_label_nm.equalsIgnoreCase(name)) {
			return sno2_label_nm();
		}
		if ($sno3_label_nm.equalsIgnoreCase(name)) {
			return sno3_label_nm();
		}
		if ($sno4_label_nm.equalsIgnoreCase(name)) {
			return sno4_label_nm();
		}
		if ($trd_cd_label_nm.equalsIgnoreCase(name)) {
			return trd_cd_label_nm();
		}
		if ($dt_label_nm.equalsIgnoreCase(name)) {
			return dt_label_nm();
		}
		if ($str_label_nm.equalsIgnoreCase(name)) {
			return str_label_nm();
		}
		if ($str2_label_nm.equalsIgnoreCase(name)) {
			return str2_label_nm();
		}
		if ($str3_label_nm.equalsIgnoreCase(name)) {
			return str3_label_nm();
		}
		if ($num_label_nm.equalsIgnoreCase(name)) {
			return num_label_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($num.equalsIgnoreCase(name)) {
			return num();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($str.equalsIgnoreCase(name)) {
			str(value);
			return;
		}
		if ($str2.equalsIgnoreCase(name)) {
			str2(value);
			return;
		}
		if ($str3.equalsIgnoreCase(name)) {
			str3(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($new_no.equalsIgnoreCase(name)) {
			new_no(value);
			return;
		}
		if ($itm_cd_label_nm.equalsIgnoreCase(name)) {
			itm_cd_label_nm(value);
			return;
		}
		if ($itm_sub1_label_nm.equalsIgnoreCase(name)) {
			itm_sub1_label_nm(value);
			return;
		}
		if ($itm_sub2_label_nm.equalsIgnoreCase(name)) {
			itm_sub2_label_nm(value);
			return;
		}
		if ($itm_sub3_label_nm.equalsIgnoreCase(name)) {
			itm_sub3_label_nm(value);
			return;
		}
		if ($loc_cd_label_nm.equalsIgnoreCase(name)) {
			loc_cd_label_nm(value);
			return;
		}
		if ($dpt_cd_label_nm.equalsIgnoreCase(name)) {
			dpt_cd_label_nm(value);
			return;
		}
		if ($co_cd_label_nm.equalsIgnoreCase(name)) {
			co_cd_label_nm(value);
			return;
		}
		if ($bp_cd_label_nm.equalsIgnoreCase(name)) {
			bp_cd_label_nm(value);
			return;
		}
		if ($wg_cd_label_nm.equalsIgnoreCase(name)) {
			wg_cd_label_nm(value);
			return;
		}
		if ($site_cd_label_nm.equalsIgnoreCase(name)) {
			site_cd_label_nm(value);
			return;
		}
		if ($lot_no_label_nm.equalsIgnoreCase(name)) {
			lot_no_label_nm(value);
			return;
		}
		if ($chd_lot_no_label_nm.equalsIgnoreCase(name)) {
			chd_lot_no_label_nm(value);
			return;
		}
		if ($chd_sublot_no_label_nm.equalsIgnoreCase(name)) {
			chd_sublot_no_label_nm(value);
			return;
		}
		if ($bp_lot_no_label_nm.equalsIgnoreCase(name)) {
			bp_lot_no_label_nm(value);
			return;
		}
		if ($sno1_label_nm.equalsIgnoreCase(name)) {
			sno1_label_nm(value);
			return;
		}
		if ($sno2_label_nm.equalsIgnoreCase(name)) {
			sno2_label_nm(value);
			return;
		}
		if ($sno3_label_nm.equalsIgnoreCase(name)) {
			sno3_label_nm(value);
			return;
		}
		if ($sno4_label_nm.equalsIgnoreCase(name)) {
			sno4_label_nm(value);
			return;
		}
		if ($trd_cd_label_nm.equalsIgnoreCase(name)) {
			trd_cd_label_nm(value);
			return;
		}
		if ($dt_label_nm.equalsIgnoreCase(name)) {
			dt_label_nm(value);
			return;
		}
		if ($str_label_nm.equalsIgnoreCase(name)) {
			str_label_nm(value);
			return;
		}
		if ($str2_label_nm.equalsIgnoreCase(name)) {
			str2_label_nm(value);
			return;
		}
		if ($str3_label_nm.equalsIgnoreCase(name)) {
			str3_label_nm(value);
			return;
		}
		if ($num_label_nm.equalsIgnoreCase(name)) {
			num_label_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($str.equalsIgnoreCase(name)) {
			str(value);
			return;
		}
		if ($str2.equalsIgnoreCase(name)) {
			str2(value);
			return;
		}
		if ($str3.equalsIgnoreCase(name)) {
			str3(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($new_no.equalsIgnoreCase(name)) {
			new_no(value);
			return;
		}
		if ($itm_cd_label_nm.equalsIgnoreCase(name)) {
			itm_cd_label_nm(value);
			return;
		}
		if ($itm_sub1_label_nm.equalsIgnoreCase(name)) {
			itm_sub1_label_nm(value);
			return;
		}
		if ($itm_sub2_label_nm.equalsIgnoreCase(name)) {
			itm_sub2_label_nm(value);
			return;
		}
		if ($itm_sub3_label_nm.equalsIgnoreCase(name)) {
			itm_sub3_label_nm(value);
			return;
		}
		if ($loc_cd_label_nm.equalsIgnoreCase(name)) {
			loc_cd_label_nm(value);
			return;
		}
		if ($dpt_cd_label_nm.equalsIgnoreCase(name)) {
			dpt_cd_label_nm(value);
			return;
		}
		if ($co_cd_label_nm.equalsIgnoreCase(name)) {
			co_cd_label_nm(value);
			return;
		}
		if ($bp_cd_label_nm.equalsIgnoreCase(name)) {
			bp_cd_label_nm(value);
			return;
		}
		if ($wg_cd_label_nm.equalsIgnoreCase(name)) {
			wg_cd_label_nm(value);
			return;
		}
		if ($site_cd_label_nm.equalsIgnoreCase(name)) {
			site_cd_label_nm(value);
			return;
		}
		if ($lot_no_label_nm.equalsIgnoreCase(name)) {
			lot_no_label_nm(value);
			return;
		}
		if ($chd_lot_no_label_nm.equalsIgnoreCase(name)) {
			chd_lot_no_label_nm(value);
			return;
		}
		if ($chd_sublot_no_label_nm.equalsIgnoreCase(name)) {
			chd_sublot_no_label_nm(value);
			return;
		}
		if ($bp_lot_no_label_nm.equalsIgnoreCase(name)) {
			bp_lot_no_label_nm(value);
			return;
		}
		if ($sno1_label_nm.equalsIgnoreCase(name)) {
			sno1_label_nm(value);
			return;
		}
		if ($sno2_label_nm.equalsIgnoreCase(name)) {
			sno2_label_nm(value);
			return;
		}
		if ($sno3_label_nm.equalsIgnoreCase(name)) {
			sno3_label_nm(value);
			return;
		}
		if ($sno4_label_nm.equalsIgnoreCase(name)) {
			sno4_label_nm(value);
			return;
		}
		if ($trd_cd_label_nm.equalsIgnoreCase(name)) {
			trd_cd_label_nm(value);
			return;
		}
		if ($dt_label_nm.equalsIgnoreCase(name)) {
			dt_label_nm(value);
			return;
		}
		if ($str_label_nm.equalsIgnoreCase(name)) {
			str_label_nm(value);
			return;
		}
		if ($str2_label_nm.equalsIgnoreCase(name)) {
			str2_label_nm(value);
			return;
		}
		if ($str3_label_nm.equalsIgnoreCase(name)) {
			str3_label_nm(value);
			return;
		}
		if ($num_label_nm.equalsIgnoreCase(name)) {
			num_label_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
