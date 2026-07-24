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
 * "検査実績ヘッダ // Inspection result header"DBコンテナRowクラスです。<p>
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
 *  	<td>insp_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査実績ＮＯ</td>
 *  	<td>Inspection result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査ＮＯ</td>
 *  	<td>Inspection No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_freq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査回数</td>
 *  	<td>Number of inspections</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_no1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元ＮＯ１</td>
 *  	<td>Source No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_no2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作成元ＮＯ２</td>
 *  	<td>Source No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査種類区分</td>
 *  	<td>Inspection classification type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_mtd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査方法区分</td>
 *  	<td>Inspection method type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dfct_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>不良理由ＣＤ</td>
 *  	<td>Defective reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>良品区分</td>
 *  	<td>Conforming type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付ＣＤ</td>
 *  	<td>Grading cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
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
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造場所ＣＤ</td>
 *  	<td>Mfg. location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>from_site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷元工場・物流倉庫ＣＤ</td>
 *  	<td>Shipping point factory/distribution warehouse cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>good_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>良品数量</td>
 *  	<td>Conforming qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dfct_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>不良品数量</td>
 *  	<td>Defective qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>st_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査開始日時</td>
 *  	<td>Inspection start date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>end_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査終了日時</td>
 *  	<td>Inspection finish date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実施担当者ＣＤ</td>
 *  	<td>Implementation PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実施部門ＣＤ</td>
 *  	<td>Implement dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>judg_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定日</td>
 *  	<td>Decision date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>judg_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定日時</td>
 *  	<td>Decision date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_judg_rslt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査判定結果区分</td>
 *  	<td>Inspection decision result type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>judg_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定部門ＣＤ</td>
 *  	<td>Decision dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>judg_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定者ＣＤ</td>
 *  	<td>Decision PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>judg_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>判定理由</td>
 *  	<td>Decision reason</td>
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
 *  	<td>vld_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効期限</td>
 *  	<td>Expiration date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lmt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>使用期限</td>
 *  	<td>Usage expiration date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_upd_stk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫更新不要ＦＬＧ</td>
 *  	<td>Inventory update not necessary flg.</td>
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
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備３</td>
 *  	<td>Spare 3</td>
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
 *  	<td>lims_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＬＩＭＳＦＬＧ</td>
 *  	<td>LIMS flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_sys_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムＣＤ</td>
 *  	<td>External system cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_insp_act_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部検査実績ＮＯ</td>
 *  	<td>External inspection result No.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_INSP_ACT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_INSP_ACT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 検査実績ＮＯ. Inspection result No..<p>
	 *
	 */
	public static final String $insp_act_no = "insp_act_no";
	private static final MCPermColumnInfo _insp_act_no = createColumnInfo("insp_act_no");
	public final MCStringPermColumn insp_act_no = createStringColumn(_insp_act_no);
	
	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	private static final MCPermColumnInfo _insp_no = createColumnInfo("insp_no");
	public final MCStringPermColumn insp_no = createStringColumn(_insp_no);
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public static final String $insp_freq = "insp_freq";
	private static final MCPermColumnInfo _insp_freq = createColumnInfo("insp_freq");
	public final MCNumberPermColumn insp_freq = createNumberColumn(_insp_freq);
	
	/**
	 * 作成元ＮＯ１. Source No. 1.<p>
	 *
	 */
	public static final String $src_no1 = "src_no1";
	private static final MCPermColumnInfo _src_no1 = createColumnInfo("src_no1");
	public final MCStringPermColumn src_no1 = createStringColumn(_src_no1);
	
	/**
	 * 作成元ＮＯ２. Source No. 2.<p>
	 *
	 */
	public static final String $src_no2 = "src_no2";
	private static final MCPermColumnInfo _src_no2 = createColumnInfo("src_no2");
	public final MCStringPermColumn src_no2 = createStringColumn(_src_no2);
	
	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	private static final MCPermColumnInfo _insp_typ = createColumnInfo("insp_typ");
	public final MCStringPermColumn insp_typ = createStringColumn(_insp_typ);
	
	/**
	 * 検査方法区分. Inspection method type.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	private static final MCPermColumnInfo _insp_mtd_typ = createColumnInfo("insp_mtd_typ");
	public final MCStringPermColumn insp_mtd_typ = createStringColumn(_insp_mtd_typ);
	
	/**
	 * 不良理由ＣＤ. Defective reason cd..<p>
	 *
	 */
	public static final String $dfct_rsn_cd = "dfct_rsn_cd";
	private static final MCPermColumnInfo _dfct_rsn_cd = createColumnInfo("dfct_rsn_cd");
	public final MCStringPermColumn dfct_rsn_cd = createStringColumn(_dfct_rsn_cd);
	
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
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	private static final MCPermColumnInfo _quality_typ = createColumnInfo("quality_typ");
	public final MCStringPermColumn quality_typ = createStringColumn(_quality_typ);
	
	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	private static final MCPermColumnInfo _gd_cd = createColumnInfo("gd_cd");
	public final MCStringPermColumn gd_cd = createStringColumn(_gd_cd);
	
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
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	private static final MCPermColumnInfo _mfg_loc_cd = createColumnInfo("mfg_loc_cd");
	public final MCStringPermColumn mfg_loc_cd = createStringColumn(_mfg_loc_cd);
	
	/**
	 * 出荷元工場・物流倉庫ＣＤ. Shipping point factory/distribution warehouse cd..<p>
	 *
	 */
	public static final String $from_site_cd = "from_site_cd";
	private static final MCPermColumnInfo _from_site_cd = createColumnInfo("from_site_cd");
	public final MCStringPermColumn from_site_cd = createStringColumn(_from_site_cd);
	
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
	 * 良品数量. Conforming qty..<p>
	 *
	 */
	public static final String $good_qty = "good_qty";
	private static final MCPermColumnInfo _good_qty = createColumnInfo("good_qty");
	public final MCNumberPermColumn good_qty = createNumberColumn(_good_qty);
	
	/**
	 * 不良品数量. Defective qty..<p>
	 *
	 */
	public static final String $dfct_qty = "dfct_qty";
	private static final MCPermColumnInfo _dfct_qty = createColumnInfo("dfct_qty");
	public final MCNumberPermColumn dfct_qty = createNumberColumn(_dfct_qty);
	
	/**
	 * 検査開始日時. Inspection start date and time.<p>
	 *
	 */
	public static final String $st_tm = "st_tm";
	private static final MCPermColumnInfo _st_tm = createColumnInfo("st_tm");
	public final MCDatePermColumn st_tm = createDateColumn(_st_tm);
	
	/**
	 * 検査終了日時. Inspection finish date and time.<p>
	 *
	 */
	public static final String $end_tm = "end_tm";
	private static final MCPermColumnInfo _end_tm = createColumnInfo("end_tm");
	public final MCDatePermColumn end_tm = createDateColumn(_end_tm);
	
	/**
	 * 実施担当者ＣＤ. Implementation PIC cd..<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	private static final MCPermColumnInfo _act_usr_cd = createColumnInfo("act_usr_cd");
	public final MCStringPermColumn act_usr_cd = createStringColumn(_act_usr_cd);
	
	/**
	 * 実施部門ＣＤ. Implement dept. cd..<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	private static final MCPermColumnInfo _act_dpt_cd = createColumnInfo("act_dpt_cd");
	public final MCStringPermColumn act_dpt_cd = createStringColumn(_act_dpt_cd);
	
	/**
	 * 判定日. Decision date.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	private static final MCPermColumnInfo _judg_dt = createColumnInfo("judg_dt");
	public final MCDatePermColumn judg_dt = createDateColumn(_judg_dt);
	
	/**
	 * 判定日時. Decision date and time.<p>
	 *
	 */
	public static final String $judg_tm = "judg_tm";
	private static final MCPermColumnInfo _judg_tm = createColumnInfo("judg_tm");
	public final MCDatePermColumn judg_tm = createDateColumn(_judg_tm);
	
	/**
	 * 検査判定結果区分. Inspection decision result type.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ = "insp_judg_rslt_typ";
	private static final MCPermColumnInfo _insp_judg_rslt_typ = createColumnInfo("insp_judg_rslt_typ");
	public final MCStringPermColumn insp_judg_rslt_typ = createStringColumn(_insp_judg_rslt_typ);
	
	/**
	 * 判定部門ＣＤ. Decision dept. cd..<p>
	 *
	 */
	public static final String $judg_dpt_cd = "judg_dpt_cd";
	private static final MCPermColumnInfo _judg_dpt_cd = createColumnInfo("judg_dpt_cd");
	public final MCStringPermColumn judg_dpt_cd = createStringColumn(_judg_dpt_cd);
	
	/**
	 * 判定者ＣＤ. Decision PIC cd..<p>
	 *
	 */
	public static final String $judg_usr_cd = "judg_usr_cd";
	private static final MCPermColumnInfo _judg_usr_cd = createColumnInfo("judg_usr_cd");
	public final MCStringPermColumn judg_usr_cd = createStringColumn(_judg_usr_cd);
	
	/**
	 * 判定理由. Decision reason.<p>
	 *
	 */
	public static final String $judg_rsn = "judg_rsn";
	private static final MCPermColumnInfo _judg_rsn = createColumnInfo("judg_rsn");
	public final MCStringPermColumn judg_rsn = createStringColumn(_judg_rsn);
	
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
	 * 在庫更新不要ＦＬＧ. Inventory update not necessary flg..<p>
	 *
	 */
	public static final String $not_upd_stk_flg = "not_upd_stk_flg";
	private static final MCPermColumnInfo _not_upd_stk_flg = createColumnInfo("not_upd_stk_flg");
	public final MCBooleanPermColumn not_upd_stk_flg = createBooleanColumn(_not_upd_stk_flg);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
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
	
	/**
	 * ＬＩＭＳＦＬＧ. LIMS flg..<p>
	 *
	 */
	public static final String $lims_flg = "lims_flg";
	private static final MCPermColumnInfo _lims_flg = createColumnInfo("lims_flg");
	public final MCBooleanPermColumn lims_flg = createBooleanColumn(_lims_flg);
	
	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	private static final MCPermColumnInfo _ext_sys_cd = createColumnInfo("ext_sys_cd");
	public final MCStringPermColumn ext_sys_cd = createStringColumn(_ext_sys_cd);
	
	/**
	 * 外部検査実績ＮＯ. External inspection result No..<p>
	 *
	 */
	public static final String $ext_insp_act_no = "ext_insp_act_no";
	private static final MCPermColumnInfo _ext_insp_act_no = createColumnInfo("ext_insp_act_no");
	public final MCStringPermColumn ext_insp_act_no = createStringColumn(_ext_insp_act_no);
	
	public static final MCMeta insp_act_no_META = createCommonMeta($insp_act_no, mcframe.commonMA.meta.MA_META.INSP_ACT_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_freq_META = createCommonMeta($insp_freq, mcframe.commonMS.meta.MS_META.INSP_FREQ);
	public static final MCMeta src_no1_META = createCommonMeta($src_no1, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no2_META = createCommonMeta($src_no2, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta dfct_rsn_cd_META = createCommonMeta($dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta from_site_cd_META = createCommonMeta($from_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta good_qty_META = createCommonMeta($good_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dfct_qty_META = createCommonMeta($dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta st_tm_META = createCommonMeta($st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_tm_META = createCommonMeta($end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_tm_META = createCommonMeta($judg_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_judg_rslt_typ_META = createCommonMeta($insp_judg_rslt_typ, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP);
	public static final MCMeta judg_dpt_cd_META = createCommonMeta($judg_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta judg_usr_cd_META = createCommonMeta($judg_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta judg_rsn_META = createCommonMeta($judg_rsn, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSN);
	public static final MCMeta lmt_dt_frm_typ_META = createCommonMeta($lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta not_upd_stk_flg_META = createCommonMeta($not_upd_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR3);
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
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_insp_act_no_META = createCommonMeta($ext_insp_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $INSP_INST1 = "INSP_INST1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_INSP_INST",
				$INSP_INST1,
				new String[][]{
						{"insp_no", "insp_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_INSP_INST_R.create("INSP_INST1");
				},
				(alias) -> {
					MST_INSP_ACT_R own = MST_INSP_ACT_R.create(alias);
					mcframe.serverMS.dbc.MST_INSP_INST_R ref = mcframe.serverMS.dbc.MST_INSP_INST_R.create("INSP_INST1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.insp_no.eq(ref.insp_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_INSP_ACT_R> constMetas = new ConstMetaList<MST_INSP_ACT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			insp_act_no_META,
			insp_no_META,
			insp_freq_META,
			src_no1_META,
			src_no2_META,
			insp_typ_META,
			insp_mtd_typ_META,
			dfct_rsn_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			quality_typ_META,
			gd_cd_META,
			lot_no_META,
			sublot_no_META,
			sppl_cd_META,
			maker_cd_META,
			mfg_loc_cd_META,
			from_site_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			good_qty_META,
			dfct_qty_META,
			st_tm_META,
			end_tm_META,
			act_usr_cd_META,
			act_dpt_cd_META,
			judg_dt_META,
			judg_tm_META,
			insp_judg_rslt_typ_META,
			judg_dpt_cd_META,
			judg_usr_cd_META,
			judg_rsn_META,
			lmt_dt_frm_typ_META,
			lmt_dt_frm_META,
			vld_dt_META,
			lmt_dt_META,
			not_upd_stk_flg_META,
			intr_rmrks_META,
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
			upd_srv_req_no_META,
			lims_flg_META,
			ext_sys_cd_META,
			ext_insp_act_no_META
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
	protected MST_INSP_ACT_R(ConstMetaList<? extends MST_INSP_ACT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_INSP_ACT_R(ConstMetaList<? extends MST_INSP_ACT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$insp_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$insp_act_no,
				"insp_act_no",
				insp_act_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$insp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$insp_no,
				"insp_no",
				insp_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$insp_freq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_R.$insp_freq,
				"insp_freq",
				insp_freq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$src_no1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$src_no1,
				"src_no1",
				src_no1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$src_no2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$src_no2,
				"src_no2",
				src_no2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$insp_typ,
				"insp_typ",
				insp_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$insp_mtd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$insp_mtd_typ,
				"insp_mtd_typ",
				insp_mtd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$dfct_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$dfct_rsn_cd,
				"dfct_rsn_cd",
				dfct_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$quality_typ,
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
			MST_INSP_ACT_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$gd_cd,
				"gd_cd",
				gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$lot_no,
				"lot_no",
				lot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$sublot_no,
				"sublot_no",
				sublot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$maker_cd,
				"maker_cd",
				maker_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$mfg_loc_cd,
				"mfg_loc_cd",
				mfg_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$from_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$from_site_cd,
				"from_site_cd",
				from_site_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_R.$base_unit_qty,
				"base_unit_qty",
				base_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$base_unit_cd,
				"base_unit_cd",
				base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$good_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_R.$good_qty,
				"good_qty",
				good_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$dfct_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_R.$dfct_qty,
				"dfct_qty",
				dfct_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$st_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_R.$st_tm,
				"st_tm",
				st_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$end_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_R.$end_tm,
				"end_tm",
				end_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$act_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$act_usr_cd,
				"act_usr_cd",
				act_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$act_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$act_dpt_cd,
				"act_dpt_cd",
				act_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$judg_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_R.$judg_dt,
				"judg_dt",
				judg_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$judg_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_R.$judg_tm,
				"judg_tm",
				judg_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$insp_judg_rslt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$insp_judg_rslt_typ,
				"insp_judg_rslt_typ",
				insp_judg_rslt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$judg_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$judg_dpt_cd,
				"judg_dpt_cd",
				judg_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$judg_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$judg_usr_cd,
				"judg_usr_cd",
				judg_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$judg_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$judg_rsn,
				"judg_rsn",
				judg_rsn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$lmt_dt_frm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$lmt_dt_frm_typ,
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
			MST_INSP_ACT_R.$lmt_dt_frm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_R.$lmt_dt_frm,
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
			MST_INSP_ACT_R.$vld_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_R.$vld_dt,
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
			MST_INSP_ACT_R.$lmt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_INSP_ACT_R.$lmt_dt,
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
			MST_INSP_ACT_R.$not_upd_stk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_ACT_R.$not_upd_stk_flg,
				"not_upd_stk_flg",
				not_upd_stk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$intr_rmrks,
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
			MST_INSP_ACT_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$sub_char1,
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
			MST_INSP_ACT_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$sub_char2,
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
			MST_INSP_ACT_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$sub_char3,
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
			MST_INSP_ACT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$ins_usr_id,
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
			MST_INSP_ACT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$ins_usr_nm,
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
			MST_INSP_ACT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INSP_ACT_R.$ins_ts,
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
			MST_INSP_ACT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$ins_func_id,
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
			MST_INSP_ACT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_INSP_ACT_R.$upd_cntr,
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
			MST_INSP_ACT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$upd_usr_id,
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
			MST_INSP_ACT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$upd_usr_nm,
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
			MST_INSP_ACT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_INSP_ACT_R.$upd_ts,
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
			MST_INSP_ACT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$upd_func_id,
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
			MST_INSP_ACT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$upd_srv_req_no,
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
			MST_INSP_ACT_R.$lims_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_INSP_ACT_R.$lims_flg,
				"lims_flg",
				lims_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$ext_sys_cd,
				"ext_sys_cd",
				ext_sys_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_INSP_ACT_R.$ext_insp_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_INSP_ACT_R.$ext_insp_act_no,
				"ext_insp_act_no",
				ext_insp_act_no,
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
	public static MST_INSP_ACT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_INSP_ACT_R create(String alias) {
		MST_INSP_ACT_R row = new MST_INSP_ACT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_INSP_ACT_R createByName(T proto) {
		MST_INSP_ACT_R row = MST_INSP_ACT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_ACT_R clone() {
		return (MST_INSP_ACT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_ACT_R createInstance() {
		return (MST_INSP_ACT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_INSP_ACT_R getValues(String... names) {
		return (MST_INSP_ACT_R) super.getValues(names);
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
	 public MSW_INSP_ACT_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_INSP_ACT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_INSP_ACT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_INSP_ACT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 検査実績ＮＯ. Inspection result No..<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 0, $insp_act_no);
	}

	/**
	 * 検査実績ＮＯ. Inspection result No..<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 0, $insp_act_no, value);
	}

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 1, $insp_no);
	}

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 1, $insp_no, value);
	}

	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return getConstNumber(offset + 2, $insp_freq);
	}

	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		setConstNumber(offset + 2, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(int value) {
		setConstNumber(offset + 2, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(long value) {
		setConstNumber(offset + 2, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(float value) {
		setConstNumber(offset + 2, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(double value) {
		setConstNumber(offset + 2, $insp_freq, value);
	}
	
	/**
	 * 作成元ＮＯ１. Source No. 1.<p>
	 *
	 */
	public String src_no1() {
		return getConstString(offset + 3, $src_no1);
	}

	/**
	 * 作成元ＮＯ１. Source No. 1.<p>
	 *
	 */
	public void src_no1(String value) {
		setConstString(offset + 3, $src_no1, value);
	}

	/**
	 * 作成元ＮＯ２. Source No. 2.<p>
	 *
	 */
	public String src_no2() {
		return getConstString(offset + 4, $src_no2);
	}

	/**
	 * 作成元ＮＯ２. Source No. 2.<p>
	 *
	 */
	public void src_no2(String value) {
		setConstString(offset + 4, $src_no2, value);
	}

	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 5, $insp_typ);
	}

	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 5, $insp_typ, value);
	}

	/**
	 * 検査方法区分. Inspection method type.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 6, $insp_mtd_typ);
	}

	/**
	 * 検査方法区分. Inspection method type.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 6, $insp_mtd_typ, value);
	}

	/**
	 * 不良理由ＣＤ. Defective reason cd..<p>
	 *
	 */
	public String dfct_rsn_cd() {
		return getConstString(offset + 7, $dfct_rsn_cd);
	}

	/**
	 * 不良理由ＣＤ. Defective reason cd..<p>
	 *
	 */
	public void dfct_rsn_cd(String value) {
		setConstString(offset + 7, $dfct_rsn_cd, value);
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
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 12, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 12, $quality_typ, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 13, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 13, $gd_cd, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 14, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 14, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 15, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 15, $sublot_no, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 16, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 16, $sppl_cd, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 17, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 17, $maker_cd, value);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 18, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 18, $mfg_loc_cd, value);
	}

	/**
	 * 出荷元工場・物流倉庫ＣＤ. Shipping point factory/distribution warehouse cd..<p>
	 *
	 */
	public String from_site_cd() {
		return getConstString(offset + 19, $from_site_cd);
	}

	/**
	 * 出荷元工場・物流倉庫ＣＤ. Shipping point factory/distribution warehouse cd..<p>
	 *
	 */
	public void from_site_cd(String value) {
		setConstString(offset + 19, $from_site_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 20, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 21, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 21, $base_unit_cd, value);
	}

	/**
	 * 良品数量. Conforming qty..<p>
	 *
	 */
	public MCNumber good_qty() {
		return getConstNumber(offset + 22, $good_qty);
	}

	/**
	 * 良品数量. Conforming qty..<p>
	 *
	 */
	public void good_qty(MCNumber value) {
		setConstNumber(offset + 22, $good_qty, value);
	}
	
	/**
	 * 良品数量. Conforming qty..<p>
	 *
	 */
	public void good_qty(int value) {
		setConstNumber(offset + 22, $good_qty, value);
	}
	
	/**
	 * 良品数量. Conforming qty..<p>
	 *
	 */
	public void good_qty(long value) {
		setConstNumber(offset + 22, $good_qty, value);
	}
	
	/**
	 * 良品数量. Conforming qty..<p>
	 *
	 */
	public void good_qty(float value) {
		setConstNumber(offset + 22, $good_qty, value);
	}
	
	/**
	 * 良品数量. Conforming qty..<p>
	 *
	 */
	public void good_qty(double value) {
		setConstNumber(offset + 22, $good_qty, value);
	}
	
	/**
	 * 不良品数量. Defective qty..<p>
	 *
	 */
	public MCNumber dfct_qty() {
		return getConstNumber(offset + 23, $dfct_qty);
	}

	/**
	 * 不良品数量. Defective qty..<p>
	 *
	 */
	public void dfct_qty(MCNumber value) {
		setConstNumber(offset + 23, $dfct_qty, value);
	}
	
	/**
	 * 不良品数量. Defective qty..<p>
	 *
	 */
	public void dfct_qty(int value) {
		setConstNumber(offset + 23, $dfct_qty, value);
	}
	
	/**
	 * 不良品数量. Defective qty..<p>
	 *
	 */
	public void dfct_qty(long value) {
		setConstNumber(offset + 23, $dfct_qty, value);
	}
	
	/**
	 * 不良品数量. Defective qty..<p>
	 *
	 */
	public void dfct_qty(float value) {
		setConstNumber(offset + 23, $dfct_qty, value);
	}
	
	/**
	 * 不良品数量. Defective qty..<p>
	 *
	 */
	public void dfct_qty(double value) {
		setConstNumber(offset + 23, $dfct_qty, value);
	}
	
	/**
	 * 検査開始日時. Inspection start date and time.<p>
	 *
	 */
	public MCDate st_tm() {
		return getConstDate(offset + 24, $st_tm);
	}

	/**
	 * 検査開始日時. Inspection start date and time.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		setConstDate(offset + 24, $st_tm, value);
	}

	/**
	 * 検査終了日時. Inspection finish date and time.<p>
	 *
	 */
	public MCDate end_tm() {
		return getConstDate(offset + 25, $end_tm);
	}

	/**
	 * 検査終了日時. Inspection finish date and time.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		setConstDate(offset + 25, $end_tm, value);
	}

	/**
	 * 実施担当者ＣＤ. Implementation PIC cd..<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 26, $act_usr_cd);
	}

	/**
	 * 実施担当者ＣＤ. Implementation PIC cd..<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 26, $act_usr_cd, value);
	}

	/**
	 * 実施部門ＣＤ. Implement dept. cd..<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 27, $act_dpt_cd);
	}

	/**
	 * 実施部門ＣＤ. Implement dept. cd..<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 27, $act_dpt_cd, value);
	}

	/**
	 * 判定日. Decision date.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 28, $judg_dt);
	}

	/**
	 * 判定日. Decision date.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 28, $judg_dt, value);
	}

	/**
	 * 判定日時. Decision date and time.<p>
	 *
	 */
	public MCDate judg_tm() {
		return getConstDate(offset + 29, $judg_tm);
	}

	/**
	 * 判定日時. Decision date and time.<p>
	 *
	 */
	public void judg_tm(MCDate value) {
		setConstDate(offset + 29, $judg_tm, value);
	}

	/**
	 * 検査判定結果区分. Inspection decision result type.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 30, $insp_judg_rslt_typ);
	}

	/**
	 * 検査判定結果区分. Inspection decision result type.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 30, $insp_judg_rslt_typ, value);
	}

	/**
	 * 判定部門ＣＤ. Decision dept. cd..<p>
	 *
	 */
	public String judg_dpt_cd() {
		return getConstString(offset + 31, $judg_dpt_cd);
	}

	/**
	 * 判定部門ＣＤ. Decision dept. cd..<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		setConstString(offset + 31, $judg_dpt_cd, value);
	}

	/**
	 * 判定者ＣＤ. Decision PIC cd..<p>
	 *
	 */
	public String judg_usr_cd() {
		return getConstString(offset + 32, $judg_usr_cd);
	}

	/**
	 * 判定者ＣＤ. Decision PIC cd..<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		setConstString(offset + 32, $judg_usr_cd, value);
	}

	/**
	 * 判定理由. Decision reason.<p>
	 *
	 */
	public String judg_rsn() {
		return getConstString(offset + 33, $judg_rsn);
	}

	/**
	 * 判定理由. Decision reason.<p>
	 *
	 */
	public void judg_rsn(String value) {
		setConstString(offset + 33, $judg_rsn, value);
	}

	/**
	 * 期限起算日区分. Expiration base date type.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return getConstString(offset + 34, $lmt_dt_frm_typ);
	}

	/**
	 * 期限起算日区分. Expiration base date type.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		setConstString(offset + 34, $lmt_dt_frm_typ, value);
	}

	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 35, $lmt_dt_frm);
	}

	/**
	 * 起算日. Base date.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 35, $lmt_dt_frm, value);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 36, $vld_dt);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 36, $vld_dt, value);
	}

	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 37, $lmt_dt);
	}

	/**
	 * 使用期限. Usage expiration date.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 37, $lmt_dt, value);
	}

	/**
	 * 在庫更新不要ＦＬＧ. Inventory update not necessary flg..<p>
	 *
	 */
	public boolean not_upd_stk_flg() {
		return getConstBoolean(offset + 38, $not_upd_stk_flg);
	}

	/**
	 * 在庫更新不要ＦＬＧ. Inventory update not necessary flg..<p>
	 *
	 */
	public void not_upd_stk_flg(boolean value) {
		setConstBoolean(offset + 38, $not_upd_stk_flg, value);
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
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 40, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 40, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 41, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 41, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 42, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 42, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 43, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 43, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 44, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 44, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 45, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 46, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 46, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 47, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 48, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 48, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 49, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 49, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 50, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 51, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 51, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 52, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 52, $upd_srv_req_no, value);
	}

	/**
	 * ＬＩＭＳＦＬＧ. LIMS flg..<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 53, $lims_flg);
	}

	/**
	 * ＬＩＭＳＦＬＧ. LIMS flg..<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 53, $lims_flg, value);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 54, $ext_sys_cd);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 54, $ext_sys_cd, value);
	}

	/**
	 * 外部検査実績ＮＯ. External inspection result No..<p>
	 *
	 */
	public String ext_insp_act_no() {
		return getConstString(offset + 55, $ext_insp_act_no);
	}

	/**
	 * 外部検査実績ＮＯ. External inspection result No..<p>
	 *
	 */
	public void ext_insp_act_no(String value) {
		setConstString(offset + 55, $ext_insp_act_no, value);
	}

	public String getString(String name) {
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			return good_qty();
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			return dfct_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($judg_tm.equalsIgnoreCase(name)) {
			return judg_tm();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
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
		if ($not_upd_stk_flg.equalsIgnoreCase(name)) {
			return not_upd_stk_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			return good_qty();
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			return dfct_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($judg_tm.equalsIgnoreCase(name)) {
			return judg_tm();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
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
		if ($not_upd_stk_flg.equalsIgnoreCase(name)) {
			return not_upd_stk_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($judg_tm.equalsIgnoreCase(name)) {
			judg_tm(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
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
		if ($not_upd_stk_flg.equalsIgnoreCase(name)) {
			not_upd_stk_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($judg_tm.equalsIgnoreCase(name)) {
			judg_tm(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
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
		if ($not_upd_stk_flg.equalsIgnoreCase(name)) {
			not_upd_stk_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
