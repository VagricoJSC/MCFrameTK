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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "ロット・サブロットリスト // Lot sublot list"DBコンテナRowクラスです。<p>
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
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予定ＦＬＧ</td>
 *  	<td>Schedule flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ver_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>版ＮＯ</td>
 *  	<td>Version No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>first_gr_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最古入庫日</td>
 *  	<td>Oldest GR date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_gr_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準入庫日</td>
 *  	<td>Standard GR date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unreg_lmt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期限未設定ＦＬＧ</td>
 *  	<td>Without expiration flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>vld_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効期限</td>
 *  	<td>Expiration date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lmt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>使用期限</td>
 *  	<td>Usage expiration date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット管理区分</td>
 *  	<td>Lot management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロット管理区分</td>
 *  	<td>Sublot management type</td>
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
 *  	<td>stk_insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫検査区分</td>
 *  	<td>Inventory inspection type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>良品区分</td>
 *  	<td>Conforming type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造承認状況区分</td>
 *  	<td>Mfg. approval status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査承認状況区分</td>
 *  	<td>Inspection approval status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>plnt_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場出荷承認状況区分</td>
 *  	<td>Factory release approval status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrkt_judg_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>市場出荷判定状況区分</td>
 *  	<td>Market release decision status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>first_gr_dt_save_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最古日保存ＦＬＧ</td>
 *  	<td>Oldest date saving flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cont_fctr</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際有効成分係数</td>
 *  	<td>Actual active ingredient coefficient</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lmt_dt_frm_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期限起算日区分</td>
 *  	<td>Expiration base date type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lmt_dt_frm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>起算日</td>
 *  	<td>Base date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_seq</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットシーケンス</td>
 *  	<td>Lot sequence</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット備考</td>
 *  	<td>Lot remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sub_char1</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（文字列）１</td>
 *  	<td>Lot spare (String) 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sub_char2</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（文字列）２</td>
 *  	<td>Lot spare (String) 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sub_char3</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（文字列）３</td>
 *  	<td>Lot spare (String) 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sub_char4</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（文字列）４</td>
 *  	<td>Lot spare (String) 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sub_char5</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（文字列）５</td>
 *  	<td>Lot spare (String) 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（数値）１</td>
 *  	<td>Lot spare (Numerical value) 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（数値）２</td>
 *  	<td>Lot spare (Numerical value) 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（数値）３</td>
 *  	<td>Lot spare (Numerical value) 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（数値）４</td>
 *  	<td>Lot spare (Numerical value) 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（数値）５</td>
 *  	<td>Lot spare (Numerical value) 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（日付）１</td>
 *  	<td>Lot spare (Date) 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（日付）２</td>
 *  	<td>Lot spare (Date) 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（日付）３</td>
 *  	<td>Lot spare (Date) 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（日付）４</td>
 *  	<td>Lot spare (Date) 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロット予備（日付）５</td>
 *  	<td>Lot spare (Date) 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sub_flg1</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット予備（ＦＬＧ）１</td>
 *  	<td>Lot spare (flg.) 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sub_flg2</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット予備（ＦＬＧ）２</td>
 *  	<td>Lot spare (flg.) 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sub_flg3</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット予備（ＦＬＧ）３</td>
 *  	<td>Lot spare (flg.) 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sub_flg4</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット予備（ＦＬＧ）４</td>
 *  	<td>Lot spare (flg.) 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sub_flg5</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット予備（ＦＬＧ）５</td>
 *  	<td>Lot spare (flg.) 5</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSVT_LOT_LIST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVT_LOT_LIST";

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
	 * 予定ＦＬＧ. Schedule flg..<p>
	 *
	 */
	public static final String $schd_flg = "schd_flg";
	private static final MCPermColumnInfo _schd_flg = createColumnInfo("schd_flg");
	public final MCBooleanPermColumn schd_flg = createBooleanColumn(_schd_flg);
	
	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
	/**
	 * 最古入庫日. Oldest GR date.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	private static final MCPermColumnInfo _first_gr_dt = createColumnInfo("first_gr_dt");
	public final MCDatePermColumn first_gr_dt = createDateColumn(_first_gr_dt);
	
	/**
	 * 基準入庫日. Standard GR date.<p>
	 *
	 */
	public static final String $base_gr_dt = "base_gr_dt";
	private static final MCPermColumnInfo _base_gr_dt = createColumnInfo("base_gr_dt");
	public final MCDatePermColumn base_gr_dt = createDateColumn(_base_gr_dt);
	
	/**
	 * 期限未設定ＦＬＧ. Without expiration flg..<p>
	 *
	 */
	public static final String $unreg_lmt_flg = "unreg_lmt_flg";
	private static final MCPermColumnInfo _unreg_lmt_flg = createColumnInfo("unreg_lmt_flg");
	public final MCBooleanPermColumn unreg_lmt_flg = createBooleanColumn(_unreg_lmt_flg);
	
	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	private static final MCPermColumnInfo _vld_dt = createColumnInfo("vld_dt");
	public final MCDatePermColumn vld_dt = createDateColumn(_vld_dt);
	
	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	private static final MCPermColumnInfo _lmt_dt = createColumnInfo("lmt_dt");
	public final MCDatePermColumn lmt_dt = createDateColumn(_lmt_dt);
	
	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	private static final MCPermColumnInfo _lot_mng_typ = createColumnInfo("lot_mng_typ");
	public final MCStringPermColumn lot_mng_typ = createStringColumn(_lot_mng_typ);
	
	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	private static final MCPermColumnInfo _sublot_mng_typ = createColumnInfo("sublot_mng_typ");
	public final MCStringPermColumn sublot_mng_typ = createStringColumn(_sublot_mng_typ);
	
	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	private static final MCPermColumnInfo _bp_lot_no = createColumnInfo("bp_lot_no");
	public final MCStringPermColumn bp_lot_no = createStringColumn(_bp_lot_no);
	
	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	private static final MCPermColumnInfo _stk_insp_typ = createColumnInfo("stk_insp_typ");
	public final MCStringPermColumn stk_insp_typ = createStringColumn(_stk_insp_typ);
	
	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	private static final MCPermColumnInfo _quality_typ = createColumnInfo("quality_typ");
	public final MCStringPermColumn quality_typ = createStringColumn(_quality_typ);
	
	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	private static final MCPermColumnInfo _mfg_aprv_sts_typ = createColumnInfo("mfg_aprv_sts_typ");
	public final MCStringPermColumn mfg_aprv_sts_typ = createStringColumn(_mfg_aprv_sts_typ);
	
	/**
	 * 検査承認状況区分. Inspection approval status type.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	private static final MCPermColumnInfo _insp_aprv_sts_typ = createColumnInfo("insp_aprv_sts_typ");
	public final MCStringPermColumn insp_aprv_sts_typ = createStringColumn(_insp_aprv_sts_typ);
	
	/**
	 * 工場出荷承認状況区分. Factory release approval status type.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
	private static final MCPermColumnInfo _plnt_aprv_sts_typ = createColumnInfo("plnt_aprv_sts_typ");
	public final MCStringPermColumn plnt_aprv_sts_typ = createStringColumn(_plnt_aprv_sts_typ);
	
	/**
	 * 市場出荷判定状況区分. Market release decision status type.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
	private static final MCPermColumnInfo _mrkt_judg_sts_typ = createColumnInfo("mrkt_judg_sts_typ");
	public final MCStringPermColumn mrkt_judg_sts_typ = createStringColumn(_mrkt_judg_sts_typ);
	
	/**
	 * 最古日保存ＦＬＧ. Oldest date saving flg..<p>
	 *
	 */
	public static final String $first_gr_dt_save_flg = "first_gr_dt_save_flg";
	private static final MCPermColumnInfo _first_gr_dt_save_flg = createColumnInfo("first_gr_dt_save_flg");
	public final MCBooleanPermColumn first_gr_dt_save_flg = createBooleanColumn(_first_gr_dt_save_flg);
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	private static final MCPermColumnInfo _act_cont_fctr = createColumnInfo("act_cont_fctr");
	public final MCNumberPermColumn act_cont_fctr = createNumberColumn(_act_cont_fctr);
	
	/**
	 * 期限起算日区分. Expiration base date type.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ = "lmt_dt_frm_typ";
	private static final MCPermColumnInfo _lmt_dt_frm_typ = createColumnInfo("lmt_dt_frm_typ");
	public final MCStringPermColumn lmt_dt_frm_typ = createStringColumn(_lmt_dt_frm_typ);
	
	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public static final String $lmt_dt_frm = "lmt_dt_frm";
	private static final MCPermColumnInfo _lmt_dt_frm = createColumnInfo("lmt_dt_frm");
	public final MCDatePermColumn lmt_dt_frm = createDateColumn(_lmt_dt_frm);
	
	/**
	 * ロットシーケンス. Lot sequence.<p>
	 *
	 */
	public static final String $lot_seq = "lot_seq";
	private static final MCPermColumnInfo _lot_seq = createColumnInfo("lot_seq");
	public final MCStringPermColumn lot_seq = createStringColumn(_lot_seq);
	
	/**
	 * ロット備考. Lot remarks.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	private static final MCPermColumnInfo _lot_rmrks = createColumnInfo("lot_rmrks");
	public final MCStringPermColumn lot_rmrks = createStringColumn(_lot_rmrks);
	
	/**
	 * ロット予備（文字列）１. Lot spare (String) 1.<p>
	 *
	 */
	public static final String $lot_sub_char1 = "lot_sub_char1";
	private static final MCPermColumnInfo _lot_sub_char1 = createColumnInfo("lot_sub_char1");
	public final MCStringPermColumn lot_sub_char1 = createStringColumn(_lot_sub_char1);
	
	/**
	 * ロット予備（文字列）２. Lot spare (String) 2.<p>
	 *
	 */
	public static final String $lot_sub_char2 = "lot_sub_char2";
	private static final MCPermColumnInfo _lot_sub_char2 = createColumnInfo("lot_sub_char2");
	public final MCStringPermColumn lot_sub_char2 = createStringColumn(_lot_sub_char2);
	
	/**
	 * ロット予備（文字列）３. Lot spare (String) 3.<p>
	 *
	 */
	public static final String $lot_sub_char3 = "lot_sub_char3";
	private static final MCPermColumnInfo _lot_sub_char3 = createColumnInfo("lot_sub_char3");
	public final MCStringPermColumn lot_sub_char3 = createStringColumn(_lot_sub_char3);
	
	/**
	 * ロット予備（文字列）４. Lot spare (String) 4.<p>
	 *
	 */
	public static final String $lot_sub_char4 = "lot_sub_char4";
	private static final MCPermColumnInfo _lot_sub_char4 = createColumnInfo("lot_sub_char4");
	public final MCStringPermColumn lot_sub_char4 = createStringColumn(_lot_sub_char4);
	
	/**
	 * ロット予備（文字列）５. Lot spare (String) 5.<p>
	 *
	 */
	public static final String $lot_sub_char5 = "lot_sub_char5";
	private static final MCPermColumnInfo _lot_sub_char5 = createColumnInfo("lot_sub_char5");
	public final MCStringPermColumn lot_sub_char5 = createStringColumn(_lot_sub_char5);
	
	/**
	 * ロット予備（数値）１. Lot spare (Numerical value) 1.<p>
	 *
	 */
	public static final String $lot_sub_num1 = "lot_sub_num1";
	private static final MCPermColumnInfo _lot_sub_num1 = createColumnInfo("lot_sub_num1");
	public final MCNumberPermColumn lot_sub_num1 = createNumberColumn(_lot_sub_num1);
	
	/**
	 * ロット予備（数値）２. Lot spare (Numerical value) 2.<p>
	 *
	 */
	public static final String $lot_sub_num2 = "lot_sub_num2";
	private static final MCPermColumnInfo _lot_sub_num2 = createColumnInfo("lot_sub_num2");
	public final MCNumberPermColumn lot_sub_num2 = createNumberColumn(_lot_sub_num2);
	
	/**
	 * ロット予備（数値）３. Lot spare (Numerical value) 3.<p>
	 *
	 */
	public static final String $lot_sub_num3 = "lot_sub_num3";
	private static final MCPermColumnInfo _lot_sub_num3 = createColumnInfo("lot_sub_num3");
	public final MCNumberPermColumn lot_sub_num3 = createNumberColumn(_lot_sub_num3);
	
	/**
	 * ロット予備（数値）４. Lot spare (Numerical value) 4.<p>
	 *
	 */
	public static final String $lot_sub_num4 = "lot_sub_num4";
	private static final MCPermColumnInfo _lot_sub_num4 = createColumnInfo("lot_sub_num4");
	public final MCNumberPermColumn lot_sub_num4 = createNumberColumn(_lot_sub_num4);
	
	/**
	 * ロット予備（数値）５. Lot spare (Numerical value) 5.<p>
	 *
	 */
	public static final String $lot_sub_num5 = "lot_sub_num5";
	private static final MCPermColumnInfo _lot_sub_num5 = createColumnInfo("lot_sub_num5");
	public final MCNumberPermColumn lot_sub_num5 = createNumberColumn(_lot_sub_num5);
	
	/**
	 * ロット予備（日付）１. Lot spare (Date) 1.<p>
	 *
	 */
	public static final String $lot_sub_dt1 = "lot_sub_dt1";
	private static final MCPermColumnInfo _lot_sub_dt1 = createColumnInfo("lot_sub_dt1");
	public final MCDatePermColumn lot_sub_dt1 = createDateColumn(_lot_sub_dt1);
	
	/**
	 * ロット予備（日付）２. Lot spare (Date) 2.<p>
	 *
	 */
	public static final String $lot_sub_dt2 = "lot_sub_dt2";
	private static final MCPermColumnInfo _lot_sub_dt2 = createColumnInfo("lot_sub_dt2");
	public final MCDatePermColumn lot_sub_dt2 = createDateColumn(_lot_sub_dt2);
	
	/**
	 * ロット予備（日付）３. Lot spare (Date) 3.<p>
	 *
	 */
	public static final String $lot_sub_dt3 = "lot_sub_dt3";
	private static final MCPermColumnInfo _lot_sub_dt3 = createColumnInfo("lot_sub_dt3");
	public final MCDatePermColumn lot_sub_dt3 = createDateColumn(_lot_sub_dt3);
	
	/**
	 * ロット予備（日付）４. Lot spare (Date) 4.<p>
	 *
	 */
	public static final String $lot_sub_dt4 = "lot_sub_dt4";
	private static final MCPermColumnInfo _lot_sub_dt4 = createColumnInfo("lot_sub_dt4");
	public final MCDatePermColumn lot_sub_dt4 = createDateColumn(_lot_sub_dt4);
	
	/**
	 * ロット予備（日付）５. Lot spare (Date) 5.<p>
	 *
	 */
	public static final String $lot_sub_dt5 = "lot_sub_dt5";
	private static final MCPermColumnInfo _lot_sub_dt5 = createColumnInfo("lot_sub_dt5");
	public final MCDatePermColumn lot_sub_dt5 = createDateColumn(_lot_sub_dt5);
	
	/**
	 * ロット予備（ＦＬＧ）１. Lot spare (flg.) 1.<p>
	 *
	 */
	public static final String $lot_sub_flg1 = "lot_sub_flg1";
	private static final MCPermColumnInfo _lot_sub_flg1 = createColumnInfo("lot_sub_flg1");
	public final MCBooleanPermColumn lot_sub_flg1 = createBooleanColumn(_lot_sub_flg1);
	
	/**
	 * ロット予備（ＦＬＧ）２. Lot spare (flg.) 2.<p>
	 *
	 */
	public static final String $lot_sub_flg2 = "lot_sub_flg2";
	private static final MCPermColumnInfo _lot_sub_flg2 = createColumnInfo("lot_sub_flg2");
	public final MCBooleanPermColumn lot_sub_flg2 = createBooleanColumn(_lot_sub_flg2);
	
	/**
	 * ロット予備（ＦＬＧ）３. Lot spare (flg.) 3.<p>
	 *
	 */
	public static final String $lot_sub_flg3 = "lot_sub_flg3";
	private static final MCPermColumnInfo _lot_sub_flg3 = createColumnInfo("lot_sub_flg3");
	public final MCBooleanPermColumn lot_sub_flg3 = createBooleanColumn(_lot_sub_flg3);
	
	/**
	 * ロット予備（ＦＬＧ）４. Lot spare (flg.) 4.<p>
	 *
	 */
	public static final String $lot_sub_flg4 = "lot_sub_flg4";
	private static final MCPermColumnInfo _lot_sub_flg4 = createColumnInfo("lot_sub_flg4");
	public final MCBooleanPermColumn lot_sub_flg4 = createBooleanColumn(_lot_sub_flg4);
	
	/**
	 * ロット予備（ＦＬＧ）５. Lot spare (flg.) 5.<p>
	 *
	 */
	public static final String $lot_sub_flg5 = "lot_sub_flg5";
	private static final MCPermColumnInfo _lot_sub_flg5 = createColumnInfo("lot_sub_flg5");
	public final MCBooleanPermColumn lot_sub_flg5 = createBooleanColumn(_lot_sub_flg5);
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta schd_flg_META = createCommonMeta($schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_gr_dt_META = createCommonMeta($base_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unreg_lmt_flg_META = createCommonMeta($unreg_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta plnt_aprv_sts_typ_META = createCommonMeta($plnt_aprv_sts_typ, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta first_gr_dt_save_flg_META = createCommonMeta($first_gr_dt_save_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta lmt_dt_frm_typ_META = createCommonMeta($lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta lot_sub_char1_META = createCommonMeta($lot_sub_char1, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR1);
	public static final MCMeta lot_sub_char2_META = createCommonMeta($lot_sub_char2, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR2);
	public static final MCMeta lot_sub_char3_META = createCommonMeta($lot_sub_char3, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR3);
	public static final MCMeta lot_sub_char4_META = createCommonMeta($lot_sub_char4, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR4);
	public static final MCMeta lot_sub_char5_META = createCommonMeta($lot_sub_char5, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR5);
	public static final MCMeta lot_sub_num1_META = createCommonMeta($lot_sub_num1, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM1);
	public static final MCMeta lot_sub_num2_META = createCommonMeta($lot_sub_num2, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM2);
	public static final MCMeta lot_sub_num3_META = createCommonMeta($lot_sub_num3, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM3);
	public static final MCMeta lot_sub_num4_META = createCommonMeta($lot_sub_num4, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM4);
	public static final MCMeta lot_sub_num5_META = createCommonMeta($lot_sub_num5, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM5);
	public static final MCMeta lot_sub_dt1_META = createCommonMeta($lot_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt2_META = createCommonMeta($lot_sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt3_META = createCommonMeta($lot_sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt4_META = createCommonMeta($lot_sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt5_META = createCommonMeta($lot_sub_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_flg1_META = createCommonMeta($lot_sub_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg2_META = createCommonMeta($lot_sub_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg3_META = createCommonMeta($lot_sub_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg4_META = createCommonMeta($lot_sub_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg5_META = createCommonMeta($lot_sub_flg5, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVT_LOT_LIST_R> constMetas = new ConstMetaList<MSVT_LOT_LIST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			sublot_no_META,
			schd_flg_META,
			ver_no_META,
			first_gr_dt_META,
			base_gr_dt_META,
			unreg_lmt_flg_META,
			vld_dt_META,
			lmt_dt_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			bp_lot_no_META,
			stk_insp_typ_META,
			quality_typ_META,
			mfg_aprv_sts_typ_META,
			insp_aprv_sts_typ_META,
			plnt_aprv_sts_typ_META,
			mrkt_judg_sts_typ_META,
			first_gr_dt_save_flg_META,
			act_cont_fctr_META,
			lmt_dt_frm_typ_META,
			lmt_dt_frm_META,
			lot_seq_META,
			lot_rmrks_META,
			lot_sub_char1_META,
			lot_sub_char2_META,
			lot_sub_char3_META,
			lot_sub_char4_META,
			lot_sub_char5_META,
			lot_sub_num1_META,
			lot_sub_num2_META,
			lot_sub_num3_META,
			lot_sub_num4_META,
			lot_sub_num5_META,
			lot_sub_dt1_META,
			lot_sub_dt2_META,
			lot_sub_dt3_META,
			lot_sub_dt4_META,
			lot_sub_dt5_META,
			lot_sub_flg1_META,
			lot_sub_flg2_META,
			lot_sub_flg3_META,
			lot_sub_flg4_META,
			lot_sub_flg5_META
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
	protected MSVT_LOT_LIST_R(ConstMetaList<? extends MSVT_LOT_LIST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVT_LOT_LIST_R(ConstMetaList<? extends MSVT_LOT_LIST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$itm_cd,
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
			MSVT_LOT_LIST_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$itm_sub1,
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
			MSVT_LOT_LIST_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$itm_sub2,
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
			MSVT_LOT_LIST_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$itm_sub3,
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
			MSVT_LOT_LIST_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$lot_no,
				"lot_no",
				lot_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$sublot_no,
				"sublot_no",
				sublot_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$schd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_LOT_LIST_R.$schd_flg,
				"schd_flg",
				schd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$ver_no,
				"ver_no",
				ver_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$first_gr_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_LOT_LIST_R.$first_gr_dt,
				"first_gr_dt",
				first_gr_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$base_gr_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_LOT_LIST_R.$base_gr_dt,
				"base_gr_dt",
				base_gr_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$unreg_lmt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_LOT_LIST_R.$unreg_lmt_flg,
				"unreg_lmt_flg",
				unreg_lmt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$vld_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_LOT_LIST_R.$vld_dt,
				"vld_dt",
				vld_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lmt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_LOT_LIST_R.$lmt_dt,
				"lmt_dt",
				lmt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$lot_mng_typ,
				"lot_mng_typ",
				lot_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$sublot_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$sublot_mng_typ,
				"sublot_mng_typ",
				sublot_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$bp_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$bp_lot_no,
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
			MSVT_LOT_LIST_R.$stk_insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$stk_insp_typ,
				"stk_insp_typ",
				stk_insp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$quality_typ,
				"quality_typ",
				quality_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$mfg_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$mfg_aprv_sts_typ,
				"mfg_aprv_sts_typ",
				mfg_aprv_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$insp_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$insp_aprv_sts_typ,
				"insp_aprv_sts_typ",
				insp_aprv_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$plnt_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$plnt_aprv_sts_typ,
				"plnt_aprv_sts_typ",
				plnt_aprv_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$mrkt_judg_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$mrkt_judg_sts_typ,
				"mrkt_judg_sts_typ",
				mrkt_judg_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$first_gr_dt_save_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_LOT_LIST_R.$first_gr_dt_save_flg,
				"first_gr_dt_save_flg",
				first_gr_dt_save_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$act_cont_fctr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_LOT_LIST_R.$act_cont_fctr,
				"act_cont_fctr",
				act_cont_fctr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lmt_dt_frm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$lmt_dt_frm_typ,
				"lmt_dt_frm_typ",
				lmt_dt_frm_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lmt_dt_frm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_LOT_LIST_R.$lmt_dt_frm,
				"lmt_dt_frm",
				lmt_dt_frm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_seq,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$lot_seq,
				"lot_seq",
				lot_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$lot_rmrks,
				"lot_rmrks",
				lot_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$lot_sub_char1,
				"lot_sub_char1",
				lot_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$lot_sub_char2,
				"lot_sub_char2",
				lot_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$lot_sub_char3,
				"lot_sub_char3",
				lot_sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$lot_sub_char4,
				"lot_sub_char4",
				lot_sub_char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_LOT_LIST_R.$lot_sub_char5,
				"lot_sub_char5",
				lot_sub_char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_LOT_LIST_R.$lot_sub_num1,
				"lot_sub_num1",
				lot_sub_num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_LOT_LIST_R.$lot_sub_num2,
				"lot_sub_num2",
				lot_sub_num2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_LOT_LIST_R.$lot_sub_num3,
				"lot_sub_num3",
				lot_sub_num3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_LOT_LIST_R.$lot_sub_num4,
				"lot_sub_num4",
				lot_sub_num4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_LOT_LIST_R.$lot_sub_num5,
				"lot_sub_num5",
				lot_sub_num5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_LOT_LIST_R.$lot_sub_dt1,
				"lot_sub_dt1",
				lot_sub_dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_LOT_LIST_R.$lot_sub_dt2,
				"lot_sub_dt2",
				lot_sub_dt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_LOT_LIST_R.$lot_sub_dt3,
				"lot_sub_dt3",
				lot_sub_dt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_LOT_LIST_R.$lot_sub_dt4,
				"lot_sub_dt4",
				lot_sub_dt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_LOT_LIST_R.$lot_sub_dt5,
				"lot_sub_dt5",
				lot_sub_dt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_flg1,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_LOT_LIST_R.$lot_sub_flg1,
				"lot_sub_flg1",
				lot_sub_flg1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_flg2,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_LOT_LIST_R.$lot_sub_flg2,
				"lot_sub_flg2",
				lot_sub_flg2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_flg3,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_LOT_LIST_R.$lot_sub_flg3,
				"lot_sub_flg3",
				lot_sub_flg3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_flg4,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_LOT_LIST_R.$lot_sub_flg4,
				"lot_sub_flg4",
				lot_sub_flg4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_LOT_LIST_R.$lot_sub_flg5,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_LOT_LIST_R.$lot_sub_flg5,
				"lot_sub_flg5",
				lot_sub_flg5,
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
	public static MSVT_LOT_LIST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVT_LOT_LIST_R create(String alias) {
		MSVT_LOT_LIST_R row = new MSVT_LOT_LIST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVT_LOT_LIST_R createByName(T proto) {
		MSVT_LOT_LIST_R row = MSVT_LOT_LIST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_LOT_LIST_R clone() {
		return (MSVT_LOT_LIST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_LOT_LIST_R createInstance() {
		return (MSVT_LOT_LIST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_LOT_LIST_R getValues(String... names) {
		return (MSVT_LOT_LIST_R) super.getValues(names);
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
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 4, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 4, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 5, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 5, $sublot_no, value);
	}

	/**
	 * 予定ＦＬＧ. Schedule flg..<p>
	 *
	 */
	public boolean schd_flg() {
		return getConstBoolean(offset + 6, $schd_flg);
	}

	/**
	 * 予定ＦＬＧ. Schedule flg..<p>
	 *
	 */
	public void schd_flg(boolean value) {
		setConstBoolean(offset + 6, $schd_flg, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 7, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 7, $ver_no, value);
	}

	/**
	 * 最古入庫日. Oldest GR date.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 8, $first_gr_dt);
	}

	/**
	 * 最古入庫日. Oldest GR date.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 8, $first_gr_dt, value);
	}

	/**
	 * 基準入庫日. Standard GR date.<p>
	 *
	 */
	public MCDate base_gr_dt() {
		return getConstDate(offset + 9, $base_gr_dt);
	}

	/**
	 * 基準入庫日. Standard GR date.<p>
	 *
	 */
	public void base_gr_dt(MCDate value) {
		setConstDate(offset + 9, $base_gr_dt, value);
	}

	/**
	 * 期限未設定ＦＬＧ. Without expiration flg..<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return getConstBoolean(offset + 10, $unreg_lmt_flg);
	}

	/**
	 * 期限未設定ＦＬＧ. Without expiration flg..<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		setConstBoolean(offset + 10, $unreg_lmt_flg, value);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 11, $vld_dt);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 11, $vld_dt, value);
	}

	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 12, $lmt_dt);
	}

	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 12, $lmt_dt, value);
	}

	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 13, $lot_mng_typ);
	}

	/**
	 * ロット管理区分. Lot management type.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 13, $lot_mng_typ, value);
	}

	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 14, $sublot_mng_typ);
	}

	/**
	 * サブロット管理区分. Sublot management type.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 14, $sublot_mng_typ, value);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 15, $bp_lot_no);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 15, $bp_lot_no, value);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 16, $stk_insp_typ);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 16, $stk_insp_typ, value);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 17, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 17, $quality_typ, value);
	}

	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 18, $mfg_aprv_sts_typ);
	}

	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 18, $mfg_aprv_sts_typ, value);
	}

	/**
	 * 検査承認状況区分. Inspection approval status type.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 19, $insp_aprv_sts_typ);
	}

	/**
	 * 検査承認状況区分. Inspection approval status type.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 19, $insp_aprv_sts_typ, value);
	}

	/**
	 * 工場出荷承認状況区分. Factory release approval status type.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 20, $plnt_aprv_sts_typ);
	}

	/**
	 * 工場出荷承認状況区分. Factory release approval status type.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 20, $plnt_aprv_sts_typ, value);
	}

	/**
	 * 市場出荷判定状況区分. Market release decision status type.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 21, $mrkt_judg_sts_typ);
	}

	/**
	 * 市場出荷判定状況区分. Market release decision status type.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 21, $mrkt_judg_sts_typ, value);
	}

	/**
	 * 最古日保存ＦＬＧ. Oldest date saving flg..<p>
	 *
	 */
	public boolean first_gr_dt_save_flg() {
		return getConstBoolean(offset + 22, $first_gr_dt_save_flg);
	}

	/**
	 * 最古日保存ＦＬＧ. Oldest date saving flg..<p>
	 *
	 */
	public void first_gr_dt_save_flg(boolean value) {
		setConstBoolean(offset + 22, $first_gr_dt_save_flg, value);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 23, $act_cont_fctr);
	}

	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 23, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 23, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 23, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 23, $act_cont_fctr, value);
	}
	
	/**
	 * 実際有効成分係数. Actual active ingredient coefficient.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 23, $act_cont_fctr, value);
	}
	
	/**
	 * 期限起算日区分. Expiration base date type.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return getConstString(offset + 24, $lmt_dt_frm_typ);
	}

	/**
	 * 期限起算日区分. Expiration base date type.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		setConstString(offset + 24, $lmt_dt_frm_typ, value);
	}

	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 25, $lmt_dt_frm);
	}

	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 25, $lmt_dt_frm, value);
	}

	/**
	 * ロットシーケンス. Lot sequence.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 26, $lot_seq);
	}

	/**
	 * ロットシーケンス. Lot sequence.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 26, $lot_seq, value);
	}

	/**
	 * ロット備考. Lot remarks.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 27, $lot_rmrks);
	}

	/**
	 * ロット備考. Lot remarks.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 27, $lot_rmrks, value);
	}

	/**
	 * ロット予備（文字列）１. Lot spare (String) 1.<p>
	 *
	 */
	public String lot_sub_char1() {
		return getConstString(offset + 28, $lot_sub_char1);
	}

	/**
	 * ロット予備（文字列）１. Lot spare (String) 1.<p>
	 *
	 */
	public void lot_sub_char1(String value) {
		setConstString(offset + 28, $lot_sub_char1, value);
	}

	/**
	 * ロット予備（文字列）２. Lot spare (String) 2.<p>
	 *
	 */
	public String lot_sub_char2() {
		return getConstString(offset + 29, $lot_sub_char2);
	}

	/**
	 * ロット予備（文字列）２. Lot spare (String) 2.<p>
	 *
	 */
	public void lot_sub_char2(String value) {
		setConstString(offset + 29, $lot_sub_char2, value);
	}

	/**
	 * ロット予備（文字列）３. Lot spare (String) 3.<p>
	 *
	 */
	public String lot_sub_char3() {
		return getConstString(offset + 30, $lot_sub_char3);
	}

	/**
	 * ロット予備（文字列）３. Lot spare (String) 3.<p>
	 *
	 */
	public void lot_sub_char3(String value) {
		setConstString(offset + 30, $lot_sub_char3, value);
	}

	/**
	 * ロット予備（文字列）４. Lot spare (String) 4.<p>
	 *
	 */
	public String lot_sub_char4() {
		return getConstString(offset + 31, $lot_sub_char4);
	}

	/**
	 * ロット予備（文字列）４. Lot spare (String) 4.<p>
	 *
	 */
	public void lot_sub_char4(String value) {
		setConstString(offset + 31, $lot_sub_char4, value);
	}

	/**
	 * ロット予備（文字列）５. Lot spare (String) 5.<p>
	 *
	 */
	public String lot_sub_char5() {
		return getConstString(offset + 32, $lot_sub_char5);
	}

	/**
	 * ロット予備（文字列）５. Lot spare (String) 5.<p>
	 *
	 */
	public void lot_sub_char5(String value) {
		setConstString(offset + 32, $lot_sub_char5, value);
	}

	/**
	 * ロット予備（数値）１. Lot spare (Numerical value) 1.<p>
	 *
	 */
	public MCNumber lot_sub_num1() {
		return getConstNumber(offset + 33, $lot_sub_num1);
	}

	/**
	 * ロット予備（数値）１. Lot spare (Numerical value) 1.<p>
	 *
	 */
	public void lot_sub_num1(MCNumber value) {
		setConstNumber(offset + 33, $lot_sub_num1, value);
	}
	
	/**
	 * ロット予備（数値）１. Lot spare (Numerical value) 1.<p>
	 *
	 */
	public void lot_sub_num1(int value) {
		setConstNumber(offset + 33, $lot_sub_num1, value);
	}
	
	/**
	 * ロット予備（数値）１. Lot spare (Numerical value) 1.<p>
	 *
	 */
	public void lot_sub_num1(long value) {
		setConstNumber(offset + 33, $lot_sub_num1, value);
	}
	
	/**
	 * ロット予備（数値）１. Lot spare (Numerical value) 1.<p>
	 *
	 */
	public void lot_sub_num1(float value) {
		setConstNumber(offset + 33, $lot_sub_num1, value);
	}
	
	/**
	 * ロット予備（数値）１. Lot spare (Numerical value) 1.<p>
	 *
	 */
	public void lot_sub_num1(double value) {
		setConstNumber(offset + 33, $lot_sub_num1, value);
	}
	
	/**
	 * ロット予備（数値）２. Lot spare (Numerical value) 2.<p>
	 *
	 */
	public MCNumber lot_sub_num2() {
		return getConstNumber(offset + 34, $lot_sub_num2);
	}

	/**
	 * ロット予備（数値）２. Lot spare (Numerical value) 2.<p>
	 *
	 */
	public void lot_sub_num2(MCNumber value) {
		setConstNumber(offset + 34, $lot_sub_num2, value);
	}
	
	/**
	 * ロット予備（数値）２. Lot spare (Numerical value) 2.<p>
	 *
	 */
	public void lot_sub_num2(int value) {
		setConstNumber(offset + 34, $lot_sub_num2, value);
	}
	
	/**
	 * ロット予備（数値）２. Lot spare (Numerical value) 2.<p>
	 *
	 */
	public void lot_sub_num2(long value) {
		setConstNumber(offset + 34, $lot_sub_num2, value);
	}
	
	/**
	 * ロット予備（数値）２. Lot spare (Numerical value) 2.<p>
	 *
	 */
	public void lot_sub_num2(float value) {
		setConstNumber(offset + 34, $lot_sub_num2, value);
	}
	
	/**
	 * ロット予備（数値）２. Lot spare (Numerical value) 2.<p>
	 *
	 */
	public void lot_sub_num2(double value) {
		setConstNumber(offset + 34, $lot_sub_num2, value);
	}
	
	/**
	 * ロット予備（数値）３. Lot spare (Numerical value) 3.<p>
	 *
	 */
	public MCNumber lot_sub_num3() {
		return getConstNumber(offset + 35, $lot_sub_num3);
	}

	/**
	 * ロット予備（数値）３. Lot spare (Numerical value) 3.<p>
	 *
	 */
	public void lot_sub_num3(MCNumber value) {
		setConstNumber(offset + 35, $lot_sub_num3, value);
	}
	
	/**
	 * ロット予備（数値）３. Lot spare (Numerical value) 3.<p>
	 *
	 */
	public void lot_sub_num3(int value) {
		setConstNumber(offset + 35, $lot_sub_num3, value);
	}
	
	/**
	 * ロット予備（数値）３. Lot spare (Numerical value) 3.<p>
	 *
	 */
	public void lot_sub_num3(long value) {
		setConstNumber(offset + 35, $lot_sub_num3, value);
	}
	
	/**
	 * ロット予備（数値）３. Lot spare (Numerical value) 3.<p>
	 *
	 */
	public void lot_sub_num3(float value) {
		setConstNumber(offset + 35, $lot_sub_num3, value);
	}
	
	/**
	 * ロット予備（数値）３. Lot spare (Numerical value) 3.<p>
	 *
	 */
	public void lot_sub_num3(double value) {
		setConstNumber(offset + 35, $lot_sub_num3, value);
	}
	
	/**
	 * ロット予備（数値）４. Lot spare (Numerical value) 4.<p>
	 *
	 */
	public MCNumber lot_sub_num4() {
		return getConstNumber(offset + 36, $lot_sub_num4);
	}

	/**
	 * ロット予備（数値）４. Lot spare (Numerical value) 4.<p>
	 *
	 */
	public void lot_sub_num4(MCNumber value) {
		setConstNumber(offset + 36, $lot_sub_num4, value);
	}
	
	/**
	 * ロット予備（数値）４. Lot spare (Numerical value) 4.<p>
	 *
	 */
	public void lot_sub_num4(int value) {
		setConstNumber(offset + 36, $lot_sub_num4, value);
	}
	
	/**
	 * ロット予備（数値）４. Lot spare (Numerical value) 4.<p>
	 *
	 */
	public void lot_sub_num4(long value) {
		setConstNumber(offset + 36, $lot_sub_num4, value);
	}
	
	/**
	 * ロット予備（数値）４. Lot spare (Numerical value) 4.<p>
	 *
	 */
	public void lot_sub_num4(float value) {
		setConstNumber(offset + 36, $lot_sub_num4, value);
	}
	
	/**
	 * ロット予備（数値）４. Lot spare (Numerical value) 4.<p>
	 *
	 */
	public void lot_sub_num4(double value) {
		setConstNumber(offset + 36, $lot_sub_num4, value);
	}
	
	/**
	 * ロット予備（数値）５. Lot spare (Numerical value) 5.<p>
	 *
	 */
	public MCNumber lot_sub_num5() {
		return getConstNumber(offset + 37, $lot_sub_num5);
	}

	/**
	 * ロット予備（数値）５. Lot spare (Numerical value) 5.<p>
	 *
	 */
	public void lot_sub_num5(MCNumber value) {
		setConstNumber(offset + 37, $lot_sub_num5, value);
	}
	
	/**
	 * ロット予備（数値）５. Lot spare (Numerical value) 5.<p>
	 *
	 */
	public void lot_sub_num5(int value) {
		setConstNumber(offset + 37, $lot_sub_num5, value);
	}
	
	/**
	 * ロット予備（数値）５. Lot spare (Numerical value) 5.<p>
	 *
	 */
	public void lot_sub_num5(long value) {
		setConstNumber(offset + 37, $lot_sub_num5, value);
	}
	
	/**
	 * ロット予備（数値）５. Lot spare (Numerical value) 5.<p>
	 *
	 */
	public void lot_sub_num5(float value) {
		setConstNumber(offset + 37, $lot_sub_num5, value);
	}
	
	/**
	 * ロット予備（数値）５. Lot spare (Numerical value) 5.<p>
	 *
	 */
	public void lot_sub_num5(double value) {
		setConstNumber(offset + 37, $lot_sub_num5, value);
	}
	
	/**
	 * ロット予備（日付）１. Lot spare (Date) 1.<p>
	 *
	 */
	public MCDate lot_sub_dt1() {
		return getConstDate(offset + 38, $lot_sub_dt1);
	}

	/**
	 * ロット予備（日付）１. Lot spare (Date) 1.<p>
	 *
	 */
	public void lot_sub_dt1(MCDate value) {
		setConstDate(offset + 38, $lot_sub_dt1, value);
	}

	/**
	 * ロット予備（日付）２. Lot spare (Date) 2.<p>
	 *
	 */
	public MCDate lot_sub_dt2() {
		return getConstDate(offset + 39, $lot_sub_dt2);
	}

	/**
	 * ロット予備（日付）２. Lot spare (Date) 2.<p>
	 *
	 */
	public void lot_sub_dt2(MCDate value) {
		setConstDate(offset + 39, $lot_sub_dt2, value);
	}

	/**
	 * ロット予備（日付）３. Lot spare (Date) 3.<p>
	 *
	 */
	public MCDate lot_sub_dt3() {
		return getConstDate(offset + 40, $lot_sub_dt3);
	}

	/**
	 * ロット予備（日付）３. Lot spare (Date) 3.<p>
	 *
	 */
	public void lot_sub_dt3(MCDate value) {
		setConstDate(offset + 40, $lot_sub_dt3, value);
	}

	/**
	 * ロット予備（日付）４. Lot spare (Date) 4.<p>
	 *
	 */
	public MCDate lot_sub_dt4() {
		return getConstDate(offset + 41, $lot_sub_dt4);
	}

	/**
	 * ロット予備（日付）４. Lot spare (Date) 4.<p>
	 *
	 */
	public void lot_sub_dt4(MCDate value) {
		setConstDate(offset + 41, $lot_sub_dt4, value);
	}

	/**
	 * ロット予備（日付）５. Lot spare (Date) 5.<p>
	 *
	 */
	public MCDate lot_sub_dt5() {
		return getConstDate(offset + 42, $lot_sub_dt5);
	}

	/**
	 * ロット予備（日付）５. Lot spare (Date) 5.<p>
	 *
	 */
	public void lot_sub_dt5(MCDate value) {
		setConstDate(offset + 42, $lot_sub_dt5, value);
	}

	/**
	 * ロット予備（ＦＬＧ）１. Lot spare (flg.) 1.<p>
	 *
	 */
	public boolean lot_sub_flg1() {
		return getConstBoolean(offset + 43, $lot_sub_flg1);
	}

	/**
	 * ロット予備（ＦＬＧ）１. Lot spare (flg.) 1.<p>
	 *
	 */
	public void lot_sub_flg1(boolean value) {
		setConstBoolean(offset + 43, $lot_sub_flg1, value);
	}

	/**
	 * ロット予備（ＦＬＧ）２. Lot spare (flg.) 2.<p>
	 *
	 */
	public boolean lot_sub_flg2() {
		return getConstBoolean(offset + 44, $lot_sub_flg2);
	}

	/**
	 * ロット予備（ＦＬＧ）２. Lot spare (flg.) 2.<p>
	 *
	 */
	public void lot_sub_flg2(boolean value) {
		setConstBoolean(offset + 44, $lot_sub_flg2, value);
	}

	/**
	 * ロット予備（ＦＬＧ）３. Lot spare (flg.) 3.<p>
	 *
	 */
	public boolean lot_sub_flg3() {
		return getConstBoolean(offset + 45, $lot_sub_flg3);
	}

	/**
	 * ロット予備（ＦＬＧ）３. Lot spare (flg.) 3.<p>
	 *
	 */
	public void lot_sub_flg3(boolean value) {
		setConstBoolean(offset + 45, $lot_sub_flg3, value);
	}

	/**
	 * ロット予備（ＦＬＧ）４. Lot spare (flg.) 4.<p>
	 *
	 */
	public boolean lot_sub_flg4() {
		return getConstBoolean(offset + 46, $lot_sub_flg4);
	}

	/**
	 * ロット予備（ＦＬＧ）４. Lot spare (flg.) 4.<p>
	 *
	 */
	public void lot_sub_flg4(boolean value) {
		setConstBoolean(offset + 46, $lot_sub_flg4, value);
	}

	/**
	 * ロット予備（ＦＬＧ）５. Lot spare (flg.) 5.<p>
	 *
	 */
	public boolean lot_sub_flg5() {
		return getConstBoolean(offset + 47, $lot_sub_flg5);
	}

	/**
	 * ロット予備（ＦＬＧ）５. Lot spare (flg.) 5.<p>
	 *
	 */
	public void lot_sub_flg5(boolean value) {
		setConstBoolean(offset + 47, $lot_sub_flg5, value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			return lot_sub_char1();
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			return lot_sub_char2();
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			return lot_sub_char3();
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			return lot_sub_char4();
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			return lot_sub_char5();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			return lot_sub_num1();
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			return lot_sub_num2();
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			return lot_sub_num3();
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			return lot_sub_num4();
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			return lot_sub_num5();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($base_gr_dt.equalsIgnoreCase(name)) {
			return base_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			return lot_sub_dt1();
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			return lot_sub_dt2();
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			return lot_sub_dt3();
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			return lot_sub_dt4();
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			return lot_sub_dt5();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
		}
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			return first_gr_dt_save_flg();
		}
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			return lot_sub_flg1();
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			return lot_sub_flg2();
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			return lot_sub_flg3();
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			return lot_sub_flg4();
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			return lot_sub_flg5();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			return lot_sub_char1();
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			return lot_sub_char2();
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			return lot_sub_char3();
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			return lot_sub_char4();
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			return lot_sub_char5();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			return lot_sub_num1();
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			return lot_sub_num2();
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			return lot_sub_num3();
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			return lot_sub_num4();
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			return lot_sub_num5();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($base_gr_dt.equalsIgnoreCase(name)) {
			return base_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			return lot_sub_dt1();
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			return lot_sub_dt2();
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			return lot_sub_dt3();
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			return lot_sub_dt4();
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			return lot_sub_dt5();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
		}
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			return first_gr_dt_save_flg();
		}
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			return lot_sub_flg1();
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			return lot_sub_flg2();
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			return lot_sub_flg3();
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			return lot_sub_flg4();
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			return lot_sub_flg5();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			lot_sub_char1(value);
			return;
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			lot_sub_char2(value);
			return;
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			lot_sub_char3(value);
			return;
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			lot_sub_char4(value);
			return;
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			lot_sub_char5(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($base_gr_dt.equalsIgnoreCase(name)) {
			base_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			lot_sub_dt1(value);
			return;
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			lot_sub_dt2(value);
			return;
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			lot_sub_dt3(value);
			return;
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			lot_sub_dt4(value);
			return;
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			lot_sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			first_gr_dt_save_flg(value);
			return;
		}
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			lot_sub_flg1(value);
			return;
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			lot_sub_flg2(value);
			return;
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			lot_sub_flg3(value);
			return;
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			lot_sub_flg4(value);
			return;
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			lot_sub_flg5(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			lot_sub_char1(value);
			return;
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			lot_sub_char2(value);
			return;
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			lot_sub_char3(value);
			return;
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			lot_sub_char4(value);
			return;
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			lot_sub_char5(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($base_gr_dt.equalsIgnoreCase(name)) {
			base_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			lot_sub_dt1(value);
			return;
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			lot_sub_dt2(value);
			return;
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			lot_sub_dt3(value);
			return;
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			lot_sub_dt4(value);
			return;
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			lot_sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			first_gr_dt_save_flg(value);
			return;
		}
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			lot_sub_flg1(value);
			return;
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			lot_sub_flg2(value);
			return;
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			lot_sub_flg3(value);
			return;
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			lot_sub_flg4(value);
			return;
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			lot_sub_flg5(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
