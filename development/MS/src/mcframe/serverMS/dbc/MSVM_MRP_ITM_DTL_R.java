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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "ＭＲＰ用品目詳細マスタ // Item details master for MRP"DBコンテナRowクラスです。<p>
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
 *  	<td>mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造場所ＣＤ</td>
 *  	<td>Mfg. location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>rqst_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>依頼先場所ＣＤ</td>
 *  	<td>Requested location cd.</td>
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
 *  	<td>sppl_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先カレンダＣＤ</td>
 *  	<td>Supplier calendar cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流グループＣＤ</td>
 *  	<td>Distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_lg_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>カレンダＣＤ</td>
 *  	<td>Calendar cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
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
 *  	<td>oper_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程パタン</td>
 *  	<td>Operation pattern</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>order_ratio</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>オーダ比率</td>
 *  	<td>Order ratio</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造ＬＴ</td>
 *  	<td>Mfg. LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_lt_add_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造ＬＴ加算基準数量</td>
 *  	<td>Mfg. LT adds base qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購入ＬＴ</td>
 *  	<td>Purchase LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_lt_add_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購入ＬＴ加算基準数量</td>
 *  	<td>Purchase LT adds standard qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>accpt_insp_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収ＬＴ</td>
 *  	<td>Acceptance LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>buf_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>安全ＬＴ</td>
 *  	<td>Safety LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sz_day_week_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>曜日まとめ区分</td>
 *  	<td>Aggregation (by day of week) type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sz_week</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>曜日まとめ期間（週）</td>
 *  	<td>Aggregation (by day of week) period (Week)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_sz_pd</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットまとめ期間（日）</td>
 *  	<td>Lot sizing period (Days)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>min_lot_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最小ロット数量</td>
 *  	<td>Min. lot qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>batch_lot_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>刻みロット数量</td>
 *  	<td>Increments lot qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>max_lot_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最大ロット数量</td>
 *  	<td>Max. lot qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高予定数量</td>
 *  	<td>Output scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図数量</td>
 *  	<td>Mfg. order qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fxd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定必要数量</td>
 *  	<td>Fixed required qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prio</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>優先順</td>
 *  	<td>Priority</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>max_order</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最大オーダ件数</td>
 *  	<td>Number of max. order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ord_fix_pd</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>オーダ自動確定期間（日）</td>
 *  	<td>Order auto-firming period (Date)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>order_stop_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>所要・オーダ禁止日</td>
 *  	<td>Requirements/order prohibit date</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSVM_MRP_ITM_DTL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVM_MRP_ITM_DTL";

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
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	private static final MCPermColumnInfo _mfg_loc_cd = createColumnInfo("mfg_loc_cd");
	public final MCStringPermColumn mfg_loc_cd = createStringColumn(_mfg_loc_cd);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	private static final MCPermColumnInfo _maker_cd = createColumnInfo("maker_cd");
	public final MCStringPermColumn maker_cd = createStringColumn(_maker_cd);
	
	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	private static final MCPermColumnInfo _rqst_loc_cd = createColumnInfo("rqst_loc_cd");
	public final MCStringPermColumn rqst_loc_cd = createStringColumn(_rqst_loc_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	private static final MCPermColumnInfo _bom_ptn = createColumnInfo("bom_ptn");
	public final MCStringPermColumn bom_ptn = createStringColumn(_bom_ptn);
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	private static final MCPermColumnInfo _st_dt = createColumnInfo("st_dt");
	public final MCDatePermColumn st_dt = createDateColumn(_st_dt);
	
	/**
	 * 発注先カレンダＣＤ. Supplier calendar cd..<p>
	 *
	 */
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	private static final MCPermColumnInfo _sppl_cal_cd = createColumnInfo("sppl_cal_cd");
	public final MCStringPermColumn sppl_cal_cd = createStringColumn(_sppl_cal_cd);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $rqst_sppl_cd = "rqst_sppl_cd";
	private static final MCPermColumnInfo _rqst_sppl_cd = createColumnInfo("rqst_sppl_cd");
	public final MCStringPermColumn rqst_sppl_cd = createStringColumn(_rqst_sppl_cd);
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $rqst_site_cd = "rqst_site_cd";
	private static final MCPermColumnInfo _rqst_site_cd = createColumnInfo("rqst_site_cd");
	public final MCStringPermColumn rqst_site_cd = createStringColumn(_rqst_site_cd);
	
	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public static final String $rqst_lg_grp_cd = "rqst_lg_grp_cd";
	private static final MCPermColumnInfo _rqst_lg_grp_cd = createColumnInfo("rqst_lg_grp_cd");
	public final MCStringPermColumn rqst_lg_grp_cd = createStringColumn(_rqst_lg_grp_cd);
	
	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public static final String $rqst_lg_cal_cd = "rqst_lg_cal_cd";
	private static final MCPermColumnInfo _rqst_lg_cal_cd = createColumnInfo("rqst_lg_cal_cd");
	public final MCStringPermColumn rqst_lg_cal_cd = createStringColumn(_rqst_lg_cal_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	private static final MCPermColumnInfo _rqst_wg_cd = createColumnInfo("rqst_wg_cd");
	public final MCStringPermColumn rqst_wg_cd = createStringColumn(_rqst_wg_cd);
	
	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	private static final MCPermColumnInfo _end_dt = createColumnInfo("end_dt");
	public final MCDatePermColumn end_dt = createDateColumn(_end_dt);
	
	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	private static final MCPermColumnInfo _oper_ptn = createColumnInfo("oper_ptn");
	public final MCStringPermColumn oper_ptn = createStringColumn(_oper_ptn);
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public static final String $order_ratio = "order_ratio";
	private static final MCPermColumnInfo _order_ratio = createColumnInfo("order_ratio");
	public final MCNumberPermColumn order_ratio = createNumberColumn(_order_ratio);
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public static final String $mfg_lt = "mfg_lt";
	private static final MCPermColumnInfo _mfg_lt = createColumnInfo("mfg_lt");
	public final MCNumberPermColumn mfg_lt = createNumberColumn(_mfg_lt);
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public static final String $mfg_lt_add_qty = "mfg_lt_add_qty";
	private static final MCPermColumnInfo _mfg_lt_add_qty = createColumnInfo("mfg_lt_add_qty");
	public final MCNumberPermColumn mfg_lt_add_qty = createNumberColumn(_mfg_lt_add_qty);
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
	private static final MCPermColumnInfo _purc_lt = createColumnInfo("purc_lt");
	public final MCNumberPermColumn purc_lt = createNumberColumn(_purc_lt);
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public static final String $purc_lt_add_qty = "purc_lt_add_qty";
	private static final MCPermColumnInfo _purc_lt_add_qty = createColumnInfo("purc_lt_add_qty");
	public final MCNumberPermColumn purc_lt_add_qty = createNumberColumn(_purc_lt_add_qty);
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public static final String $accpt_insp_lt = "accpt_insp_lt";
	private static final MCPermColumnInfo _accpt_insp_lt = createColumnInfo("accpt_insp_lt");
	public final MCNumberPermColumn accpt_insp_lt = createNumberColumn(_accpt_insp_lt);
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public static final String $buf_lt = "buf_lt";
	private static final MCPermColumnInfo _buf_lt = createColumnInfo("buf_lt");
	public final MCNumberPermColumn buf_lt = createNumberColumn(_buf_lt);
	
	/**
	 * 曜日まとめ区分. Aggregation (by day of week) type.<p>
	 *
	 */
	public static final String $sz_day_week_typ = "sz_day_week_typ";
	private static final MCPermColumnInfo _sz_day_week_typ = createColumnInfo("sz_day_week_typ");
	public final MCStringPermColumn sz_day_week_typ = createStringColumn(_sz_day_week_typ);
	
	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public static final String $sz_week = "sz_week";
	private static final MCPermColumnInfo _sz_week = createColumnInfo("sz_week");
	public final MCNumberPermColumn sz_week = createNumberColumn(_sz_week);
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public static final String $lot_sz_pd = "lot_sz_pd";
	private static final MCPermColumnInfo _lot_sz_pd = createColumnInfo("lot_sz_pd");
	public final MCNumberPermColumn lot_sz_pd = createNumberColumn(_lot_sz_pd);
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public static final String $min_lot_qty = "min_lot_qty";
	private static final MCPermColumnInfo _min_lot_qty = createColumnInfo("min_lot_qty");
	public final MCNumberPermColumn min_lot_qty = createNumberColumn(_min_lot_qty);
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public static final String $batch_lot_qty = "batch_lot_qty";
	private static final MCPermColumnInfo _batch_lot_qty = createColumnInfo("batch_lot_qty");
	public final MCNumberPermColumn batch_lot_qty = createNumberColumn(_batch_lot_qty);
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public static final String $max_lot_qty = "max_lot_qty";
	private static final MCPermColumnInfo _max_lot_qty = createColumnInfo("max_lot_qty");
	public final MCNumberPermColumn max_lot_qty = createNumberColumn(_max_lot_qty);
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public static final String $yield_schd_qty = "yield_schd_qty";
	private static final MCPermColumnInfo _yield_schd_qty = createColumnInfo("yield_schd_qty");
	public final MCNumberPermColumn yield_schd_qty = createNumberColumn(_yield_schd_qty);
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public static final String $mfg_inst_qty = "mfg_inst_qty";
	private static final MCPermColumnInfo _mfg_inst_qty = createColumnInfo("mfg_inst_qty");
	public final MCNumberPermColumn mfg_inst_qty = createNumberColumn(_mfg_inst_qty);
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public static final String $fxd_rqmt_qty = "fxd_rqmt_qty";
	private static final MCPermColumnInfo _fxd_rqmt_qty = createColumnInfo("fxd_rqmt_qty");
	public final MCNumberPermColumn fxd_rqmt_qty = createNumberColumn(_fxd_rqmt_qty);
	
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
	 * 優先順. Priority.<p>
	 *
	 */
	public static final String $prio = "prio";
	private static final MCPermColumnInfo _prio = createColumnInfo("prio");
	public final MCNumberPermColumn prio = createNumberColumn(_prio);
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public static final String $max_order = "max_order";
	private static final MCPermColumnInfo _max_order = createColumnInfo("max_order");
	public final MCNumberPermColumn max_order = createNumberColumn(_max_order);
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public static final String $ord_fix_pd = "ord_fix_pd";
	private static final MCPermColumnInfo _ord_fix_pd = createColumnInfo("ord_fix_pd");
	public final MCNumberPermColumn ord_fix_pd = createNumberColumn(_ord_fix_pd);
	
	/**
	 * 所要・オーダ禁止日. Requirements/order prohibit date.<p>
	 *
	 */
	public static final String $order_stop_dt = "order_stop_dt";
	private static final MCPermColumnInfo _order_stop_dt = createColumnInfo("order_stop_dt");
	public final MCDatePermColumn order_stop_dt = createDateColumn(_order_stop_dt);
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta rqst_sppl_cd_META = createCommonMeta($rqst_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_site_cd_META = createCommonMeta($rqst_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta rqst_lg_grp_cd_META = createCommonMeta($rqst_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta rqst_lg_cal_cd_META = createCommonMeta($rqst_lg_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta order_ratio_META = createCommonMeta($order_ratio, mcframe.commonMA.meta.MA_META.ORDER_RATIO);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_lt_add_qty_META = createCommonMeta($mfg_lt_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta purc_lt_add_qty_META = createCommonMeta($purc_lt_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta buf_lt_META = createCommonMeta($buf_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta sz_day_week_typ_META = createCommonMeta($sz_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta sz_week_META = createCommonMeta($sz_week, mcframe.commonMA.meta.MA_META.SZ_WEEK);
	public static final MCMeta lot_sz_pd_META = createCommonMeta($lot_sz_pd, mcframe.commonMA.meta.MA_META.LOT_SZ_PD);
	public static final MCMeta min_lot_qty_META = createCommonMeta($min_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta batch_lot_qty_META = createCommonMeta($batch_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta max_lot_qty_META = createCommonMeta($max_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_schd_qty_META = createCommonMeta($yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_qty_META = createCommonMeta($mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_rqmt_qty_META = createCommonMeta($fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta max_order_META = createCommonMeta($max_order, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ord_fix_pd_META = createCommonMeta($ord_fix_pd, mcframe.commonMA.meta.MA_META.ORD_FIX_PD);
	public static final MCMeta order_stop_dt_META = createCommonMeta($order_stop_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVM_MRP_ITM_DTL_R> constMetas = new ConstMetaList<MSVM_MRP_ITM_DTL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			mfg_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			rqst_loc_cd_META,
			wg_cd_META,
			bom_ptn_META,
			st_dt_META,
			sppl_cal_cd_META,
			rqst_sppl_cd_META,
			rqst_site_cd_META,
			rqst_lg_grp_cd_META,
			rqst_lg_cal_cd_META,
			rqst_wg_cd_META,
			end_dt_META,
			oper_ptn_META,
			order_ratio_META,
			mfg_lt_META,
			mfg_lt_add_qty_META,
			purc_lt_META,
			purc_lt_add_qty_META,
			accpt_insp_lt_META,
			buf_lt_META,
			sz_day_week_typ_META,
			sz_week_META,
			lot_sz_pd_META,
			min_lot_qty_META,
			batch_lot_qty_META,
			max_lot_qty_META,
			yield_schd_qty_META,
			mfg_inst_qty_META,
			fxd_rqmt_qty_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			prio_META,
			max_order_META,
			ord_fix_pd_META,
			order_stop_dt_META
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
	protected MSVM_MRP_ITM_DTL_R(ConstMetaList<? extends MSVM_MRP_ITM_DTL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVM_MRP_ITM_DTL_R(ConstMetaList<? extends MSVM_MRP_ITM_DTL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$itm_cd,
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
			MSVM_MRP_ITM_DTL_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$itm_sub1,
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
			MSVM_MRP_ITM_DTL_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$itm_sub2,
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
			MSVM_MRP_ITM_DTL_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$itm_sub3,
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
			MSVM_MRP_ITM_DTL_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$mfg_loc_cd,
				"mfg_loc_cd",
				mfg_loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$maker_cd,
				"maker_cd",
				maker_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$rqst_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$rqst_loc_cd,
				"rqst_loc_cd",
				rqst_loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$wg_cd,
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
			MSVM_MRP_ITM_DTL_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$bom_ptn,
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
			MSVM_MRP_ITM_DTL_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVM_MRP_ITM_DTL_R.$st_dt,
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
			MSVM_MRP_ITM_DTL_R.$sppl_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$sppl_cal_cd,
				"sppl_cal_cd",
				sppl_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$rqst_sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$rqst_sppl_cd,
				"rqst_sppl_cd",
				rqst_sppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$rqst_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$rqst_site_cd,
				"rqst_site_cd",
				rqst_site_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$rqst_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$rqst_lg_grp_cd,
				"rqst_lg_grp_cd",
				rqst_lg_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$rqst_lg_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$rqst_lg_cal_cd,
				"rqst_lg_cal_cd",
				rqst_lg_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$rqst_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$rqst_wg_cd,
				"rqst_wg_cd",
				rqst_wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVM_MRP_ITM_DTL_R.$end_dt,
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
			MSVM_MRP_ITM_DTL_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$oper_ptn,
				"oper_ptn",
				oper_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$order_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$order_ratio,
				"order_ratio",
				order_ratio,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$mfg_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$mfg_lt,
				"mfg_lt",
				mfg_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$mfg_lt_add_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$mfg_lt_add_qty,
				"mfg_lt_add_qty",
				mfg_lt_add_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$purc_lt,
				"purc_lt",
				purc_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$purc_lt_add_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$purc_lt_add_qty,
				"purc_lt_add_qty",
				purc_lt_add_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$accpt_insp_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$accpt_insp_lt,
				"accpt_insp_lt",
				accpt_insp_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$buf_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$buf_lt,
				"buf_lt",
				buf_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$sz_day_week_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$sz_day_week_typ,
				"sz_day_week_typ",
				sz_day_week_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$sz_week,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$sz_week,
				"sz_week",
				sz_week,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$lot_sz_pd,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$lot_sz_pd,
				"lot_sz_pd",
				lot_sz_pd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$min_lot_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$min_lot_qty,
				"min_lot_qty",
				min_lot_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$batch_lot_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$batch_lot_qty,
				"batch_lot_qty",
				batch_lot_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$max_lot_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$max_lot_qty,
				"max_lot_qty",
				max_lot_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$yield_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$yield_schd_qty,
				"yield_schd_qty",
				yield_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$mfg_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$mfg_inst_qty,
				"mfg_inst_qty",
				mfg_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$fxd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$fxd_rqmt_qty,
				"fxd_rqmt_qty",
				fxd_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$sno1,
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
			MSVM_MRP_ITM_DTL_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$sno2,
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
			MSVM_MRP_ITM_DTL_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$sno3,
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
			MSVM_MRP_ITM_DTL_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_DTL_R.$sno4,
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
			MSVM_MRP_ITM_DTL_R.$prio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$prio,
				"prio",
				prio,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$max_order,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$max_order,
				"max_order",
				max_order,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$ord_fix_pd,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_DTL_R.$ord_fix_pd,
				"ord_fix_pd",
				ord_fix_pd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_DTL_R.$order_stop_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVM_MRP_ITM_DTL_R.$order_stop_dt,
				"order_stop_dt",
				order_stop_dt,
				false,
				true,
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
	public static MSVM_MRP_ITM_DTL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVM_MRP_ITM_DTL_R create(String alias) {
		MSVM_MRP_ITM_DTL_R row = new MSVM_MRP_ITM_DTL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVM_MRP_ITM_DTL_R createByName(T proto) {
		MSVM_MRP_ITM_DTL_R row = MSVM_MRP_ITM_DTL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_ITM_DTL_R clone() {
		return (MSVM_MRP_ITM_DTL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_ITM_DTL_R createInstance() {
		return (MSVM_MRP_ITM_DTL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_ITM_DTL_R getValues(String... names) {
		return (MSVM_MRP_ITM_DTL_R) super.getValues(names);
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
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 4, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 4, $mfg_loc_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 5, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 5, $sppl_cd, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 6, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 6, $maker_cd, value);
	}

	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 7, $rqst_loc_cd);
	}

	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 7, $rqst_loc_cd, value);
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
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 10, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 10, $st_dt, value);
	}

	/**
	 * 発注先カレンダＣＤ. Supplier calendar cd..<p>
	 *
	 */
	public String sppl_cal_cd() {
		return getConstString(offset + 11, $sppl_cal_cd);
	}

	/**
	 * 発注先カレンダＣＤ. Supplier calendar cd..<p>
	 *
	 */
	public void sppl_cal_cd(String value) {
		setConstString(offset + 11, $sppl_cal_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String rqst_sppl_cd() {
		return getConstString(offset + 12, $rqst_sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void rqst_sppl_cd(String value) {
		setConstString(offset + 12, $rqst_sppl_cd, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String rqst_site_cd() {
		return getConstString(offset + 13, $rqst_site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void rqst_site_cd(String value) {
		setConstString(offset + 13, $rqst_site_cd, value);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public String rqst_lg_grp_cd() {
		return getConstString(offset + 14, $rqst_lg_grp_cd);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public void rqst_lg_grp_cd(String value) {
		setConstString(offset + 14, $rqst_lg_grp_cd, value);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public String rqst_lg_cal_cd() {
		return getConstString(offset + 15, $rqst_lg_cal_cd);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public void rqst_lg_cal_cd(String value) {
		setConstString(offset + 15, $rqst_lg_cal_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 16, $rqst_wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 16, $rqst_wg_cd, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 17, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 17, $end_dt, value);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 18, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 18, $oper_ptn, value);
	}

	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public MCNumber order_ratio() {
		return getConstNumber(offset + 19, $order_ratio);
	}

	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public void order_ratio(MCNumber value) {
		setConstNumber(offset + 19, $order_ratio, value);
	}
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public void order_ratio(int value) {
		setConstNumber(offset + 19, $order_ratio, value);
	}
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public void order_ratio(long value) {
		setConstNumber(offset + 19, $order_ratio, value);
	}
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public void order_ratio(float value) {
		setConstNumber(offset + 19, $order_ratio, value);
	}
	
	/**
	 * オーダ比率. Order ratio.<p>
	 *
	 */
	public void order_ratio(double value) {
		setConstNumber(offset + 19, $order_ratio, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 20, $mfg_lt);
	}

	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 20, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 20, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 20, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 20, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ. Mfg. LT.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 20, $mfg_lt, value);
	}
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public MCNumber mfg_lt_add_qty() {
		return getConstNumber(offset + 21, $mfg_lt_add_qty);
	}

	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public void mfg_lt_add_qty(MCNumber value) {
		setConstNumber(offset + 21, $mfg_lt_add_qty, value);
	}
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public void mfg_lt_add_qty(int value) {
		setConstNumber(offset + 21, $mfg_lt_add_qty, value);
	}
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public void mfg_lt_add_qty(long value) {
		setConstNumber(offset + 21, $mfg_lt_add_qty, value);
	}
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public void mfg_lt_add_qty(float value) {
		setConstNumber(offset + 21, $mfg_lt_add_qty, value);
	}
	
	/**
	 * 製造ＬＴ加算基準数量. Mfg. LT adds base qty..<p>
	 *
	 */
	public void mfg_lt_add_qty(double value) {
		setConstNumber(offset + 21, $mfg_lt_add_qty, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 22, $purc_lt);
	}

	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 22, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 22, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 22, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 22, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ. Purchase LT.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 22, $purc_lt, value);
	}
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public MCNumber purc_lt_add_qty() {
		return getConstNumber(offset + 23, $purc_lt_add_qty);
	}

	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public void purc_lt_add_qty(MCNumber value) {
		setConstNumber(offset + 23, $purc_lt_add_qty, value);
	}
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public void purc_lt_add_qty(int value) {
		setConstNumber(offset + 23, $purc_lt_add_qty, value);
	}
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public void purc_lt_add_qty(long value) {
		setConstNumber(offset + 23, $purc_lt_add_qty, value);
	}
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public void purc_lt_add_qty(float value) {
		setConstNumber(offset + 23, $purc_lt_add_qty, value);
	}
	
	/**
	 * 購入ＬＴ加算基準数量. Purchase LT adds standard qty..<p>
	 *
	 */
	public void purc_lt_add_qty(double value) {
		setConstNumber(offset + 23, $purc_lt_add_qty, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 24, $accpt_insp_lt);
	}

	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 24, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 24, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 24, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 24, $accpt_insp_lt, value);
	}
	
	/**
	 * 検収ＬＴ. Acceptance LT.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 24, $accpt_insp_lt, value);
	}
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public MCNumber buf_lt() {
		return getConstNumber(offset + 25, $buf_lt);
	}

	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public void buf_lt(MCNumber value) {
		setConstNumber(offset + 25, $buf_lt, value);
	}
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public void buf_lt(int value) {
		setConstNumber(offset + 25, $buf_lt, value);
	}
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public void buf_lt(long value) {
		setConstNumber(offset + 25, $buf_lt, value);
	}
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public void buf_lt(float value) {
		setConstNumber(offset + 25, $buf_lt, value);
	}
	
	/**
	 * 安全ＬＴ. Safety LT.<p>
	 *
	 */
	public void buf_lt(double value) {
		setConstNumber(offset + 25, $buf_lt, value);
	}
	
	/**
	 * 曜日まとめ区分. Aggregation (by day of week) type.<p>
	 *
	 */
	public String sz_day_week_typ() {
		return getConstString(offset + 26, $sz_day_week_typ);
	}

	/**
	 * 曜日まとめ区分. Aggregation (by day of week) type.<p>
	 *
	 */
	public void sz_day_week_typ(String value) {
		setConstString(offset + 26, $sz_day_week_typ, value);
	}

	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public MCNumber sz_week() {
		return getConstNumber(offset + 27, $sz_week);
	}

	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public void sz_week(MCNumber value) {
		setConstNumber(offset + 27, $sz_week, value);
	}
	
	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public void sz_week(int value) {
		setConstNumber(offset + 27, $sz_week, value);
	}
	
	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public void sz_week(long value) {
		setConstNumber(offset + 27, $sz_week, value);
	}
	
	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public void sz_week(float value) {
		setConstNumber(offset + 27, $sz_week, value);
	}
	
	/**
	 * 曜日まとめ期間（週）. Aggregation (by day of week) period (Week).<p>
	 *
	 */
	public void sz_week(double value) {
		setConstNumber(offset + 27, $sz_week, value);
	}
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public MCNumber lot_sz_pd() {
		return getConstNumber(offset + 28, $lot_sz_pd);
	}

	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public void lot_sz_pd(MCNumber value) {
		setConstNumber(offset + 28, $lot_sz_pd, value);
	}
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public void lot_sz_pd(int value) {
		setConstNumber(offset + 28, $lot_sz_pd, value);
	}
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public void lot_sz_pd(long value) {
		setConstNumber(offset + 28, $lot_sz_pd, value);
	}
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public void lot_sz_pd(float value) {
		setConstNumber(offset + 28, $lot_sz_pd, value);
	}
	
	/**
	 * ロットまとめ期間（日）. Lot sizing period (Days).<p>
	 *
	 */
	public void lot_sz_pd(double value) {
		setConstNumber(offset + 28, $lot_sz_pd, value);
	}
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public MCNumber min_lot_qty() {
		return getConstNumber(offset + 29, $min_lot_qty);
	}

	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public void min_lot_qty(MCNumber value) {
		setConstNumber(offset + 29, $min_lot_qty, value);
	}
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public void min_lot_qty(int value) {
		setConstNumber(offset + 29, $min_lot_qty, value);
	}
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public void min_lot_qty(long value) {
		setConstNumber(offset + 29, $min_lot_qty, value);
	}
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public void min_lot_qty(float value) {
		setConstNumber(offset + 29, $min_lot_qty, value);
	}
	
	/**
	 * 最小ロット数量. Min. lot qty..<p>
	 *
	 */
	public void min_lot_qty(double value) {
		setConstNumber(offset + 29, $min_lot_qty, value);
	}
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public MCNumber batch_lot_qty() {
		return getConstNumber(offset + 30, $batch_lot_qty);
	}

	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public void batch_lot_qty(MCNumber value) {
		setConstNumber(offset + 30, $batch_lot_qty, value);
	}
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public void batch_lot_qty(int value) {
		setConstNumber(offset + 30, $batch_lot_qty, value);
	}
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public void batch_lot_qty(long value) {
		setConstNumber(offset + 30, $batch_lot_qty, value);
	}
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public void batch_lot_qty(float value) {
		setConstNumber(offset + 30, $batch_lot_qty, value);
	}
	
	/**
	 * 刻みロット数量. Increments lot qty..<p>
	 *
	 */
	public void batch_lot_qty(double value) {
		setConstNumber(offset + 30, $batch_lot_qty, value);
	}
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public MCNumber max_lot_qty() {
		return getConstNumber(offset + 31, $max_lot_qty);
	}

	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public void max_lot_qty(MCNumber value) {
		setConstNumber(offset + 31, $max_lot_qty, value);
	}
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public void max_lot_qty(int value) {
		setConstNumber(offset + 31, $max_lot_qty, value);
	}
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public void max_lot_qty(long value) {
		setConstNumber(offset + 31, $max_lot_qty, value);
	}
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public void max_lot_qty(float value) {
		setConstNumber(offset + 31, $max_lot_qty, value);
	}
	
	/**
	 * 最大ロット数量. Max. lot qty..<p>
	 *
	 */
	public void max_lot_qty(double value) {
		setConstNumber(offset + 31, $max_lot_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return getConstNumber(offset + 32, $yield_schd_qty);
	}

	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 32, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		setConstNumber(offset + 32, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		setConstNumber(offset + 32, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		setConstNumber(offset + 32, $yield_schd_qty, value);
	}
	
	/**
	 * 出来高予定数量. Output scheduled qty..<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		setConstNumber(offset + 32, $yield_schd_qty, value);
	}
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public MCNumber mfg_inst_qty() {
		return getConstNumber(offset + 33, $mfg_inst_qty);
	}

	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public void mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 33, $mfg_inst_qty, value);
	}
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public void mfg_inst_qty(int value) {
		setConstNumber(offset + 33, $mfg_inst_qty, value);
	}
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public void mfg_inst_qty(long value) {
		setConstNumber(offset + 33, $mfg_inst_qty, value);
	}
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public void mfg_inst_qty(float value) {
		setConstNumber(offset + 33, $mfg_inst_qty, value);
	}
	
	/**
	 * 製造指図数量. Mfg. order qty..<p>
	 *
	 */
	public void mfg_inst_qty(double value) {
		setConstNumber(offset + 33, $mfg_inst_qty, value);
	}
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public MCNumber fxd_rqmt_qty() {
		return getConstNumber(offset + 34, $fxd_rqmt_qty);
	}

	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public void fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 34, $fxd_rqmt_qty, value);
	}
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public void fxd_rqmt_qty(int value) {
		setConstNumber(offset + 34, $fxd_rqmt_qty, value);
	}
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public void fxd_rqmt_qty(long value) {
		setConstNumber(offset + 34, $fxd_rqmt_qty, value);
	}
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public void fxd_rqmt_qty(float value) {
		setConstNumber(offset + 34, $fxd_rqmt_qty, value);
	}
	
	/**
	 * 固定必要数量. Fixed required qty..<p>
	 *
	 */
	public void fxd_rqmt_qty(double value) {
		setConstNumber(offset + 34, $fxd_rqmt_qty, value);
	}
	
	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 35, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 35, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 36, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 36, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 37, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 37, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 38, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 38, $sno4, value);
	}

	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 39, $prio);
	}

	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 39, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 39, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 39, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 39, $prio, value);
	}
	
	/**
	 * 優先順. Priority.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 39, $prio, value);
	}
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public MCNumber max_order() {
		return getConstNumber(offset + 40, $max_order);
	}

	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public void max_order(MCNumber value) {
		setConstNumber(offset + 40, $max_order, value);
	}
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public void max_order(int value) {
		setConstNumber(offset + 40, $max_order, value);
	}
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public void max_order(long value) {
		setConstNumber(offset + 40, $max_order, value);
	}
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public void max_order(float value) {
		setConstNumber(offset + 40, $max_order, value);
	}
	
	/**
	 * 最大オーダ件数. Number of max. order.<p>
	 *
	 */
	public void max_order(double value) {
		setConstNumber(offset + 40, $max_order, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return getConstNumber(offset + 41, $ord_fix_pd);
	}

	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		setConstNumber(offset + 41, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		setConstNumber(offset + 41, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		setConstNumber(offset + 41, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		setConstNumber(offset + 41, $ord_fix_pd, value);
	}
	
	/**
	 * オーダ自動確定期間（日）. Order auto-firming period (Date).<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		setConstNumber(offset + 41, $ord_fix_pd, value);
	}
	
	/**
	 * 所要・オーダ禁止日. Requirements/order prohibit date.<p>
	 *
	 */
	public MCDate order_stop_dt() {
		return getConstDate(offset + 42, $order_stop_dt);
	}

	/**
	 * 所要・オーダ禁止日. Requirements/order prohibit date.<p>
	 *
	 */
	public void order_stop_dt(MCDate value) {
		setConstDate(offset + 42, $order_stop_dt, value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($rqst_sppl_cd.equalsIgnoreCase(name)) {
			return rqst_sppl_cd();
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			return rqst_site_cd();
		}
		if ($rqst_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_lg_grp_cd();
		}
		if ($rqst_lg_cal_cd.equalsIgnoreCase(name)) {
			return rqst_lg_cal_cd();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			return sz_day_week_typ();
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
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			return mfg_lt_add_qty();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			return purc_lt_add_qty();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			return buf_lt();
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			return sz_week();
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			return lot_sz_pd();
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			return min_lot_qty();
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			return batch_lot_qty();
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			return max_lot_qty();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			return mfg_inst_qty();
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($max_order.equalsIgnoreCase(name)) {
			return max_order();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
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
		if ($order_stop_dt.equalsIgnoreCase(name)) {
			return order_stop_dt();
		}
		return super.getDate(name);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($rqst_sppl_cd.equalsIgnoreCase(name)) {
			return rqst_sppl_cd();
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			return rqst_site_cd();
		}
		if ($rqst_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_lg_grp_cd();
		}
		if ($rqst_lg_cal_cd.equalsIgnoreCase(name)) {
			return rqst_lg_cal_cd();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			return sz_day_week_typ();
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
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			return mfg_lt_add_qty();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			return purc_lt_add_qty();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			return buf_lt();
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			return sz_week();
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			return lot_sz_pd();
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			return min_lot_qty();
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			return batch_lot_qty();
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			return max_lot_qty();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			return mfg_inst_qty();
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($max_order.equalsIgnoreCase(name)) {
			return max_order();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
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
		if ($order_stop_dt.equalsIgnoreCase(name)) {
			return order_stop_dt();
		}
		return super.getDateNE(name);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($rqst_sppl_cd.equalsIgnoreCase(name)) {
			rqst_sppl_cd(value);
			return;
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			rqst_site_cd(value);
			return;
		}
		if ($rqst_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_lg_grp_cd(value);
			return;
		}
		if ($rqst_lg_cal_cd.equalsIgnoreCase(name)) {
			rqst_lg_cal_cd(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			sz_day_week_typ(value);
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
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
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
		if ($order_stop_dt.equalsIgnoreCase(name)) {
			order_stop_dt(value);
			return;
		}
		super.setDate(name, value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($rqst_sppl_cd.equalsIgnoreCase(name)) {
			rqst_sppl_cd(value);
			return;
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			rqst_site_cd(value);
			return;
		}
		if ($rqst_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_lg_grp_cd(value);
			return;
		}
		if ($rqst_lg_cal_cd.equalsIgnoreCase(name)) {
			rqst_lg_cal_cd(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			sz_day_week_typ(value);
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
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
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
		if ($order_stop_dt.equalsIgnoreCase(name)) {
			order_stop_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
