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
 * "ワーキンググループマスタビュー // WG master view"DBコンテナRowクラスです。<p>
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
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名</td>
 *  	<td>WG name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売ＦＬＧ</td>
 *  	<td>Sales flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流ＦＬＧ</td>
 *  	<td>Distribution flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造ＦＬＧ</td>
 *  	<td>Mfg. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買ＦＬＧ</td>
 *  	<td>Purchasing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債権ＦＬＧ</td>
 *  	<td>AR flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務ＦＬＧ</td>
 *  	<td>AP flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需給ＦＬＧ</td>
 *  	<td>Demand and supply flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_prefix</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＲＰ発番用接頭語</td>
 *  	<td>Prefix for MRP numbering</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_inst_unit_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図単位区分</td>
 *  	<td>Mfg. order unit type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_proc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＲＰ処理区分</td>
 *  	<td>MRP process type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_margin_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当余裕日数</td>
 *  	<td>Allocation extra days</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_xfr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移動・移送引当対象外ＦＬＧ</td>
 *  	<td>Not for movement/transport allocation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrp_alloc_margin_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＲＰ引当余裕日数</td>
 *  	<td>MRP allocation extra days</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_opn_xfr_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＭＲＰ未確定移送依頼考慮日数</td>
 *  	<td>Days to consider unfirm transport request in MRP</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqmt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>所要区分</td>
 *  	<td>Requirements type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prod_pln_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>生産計画立案区分</td>
 *  	<td>Production planning type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dmnd_date_div_mons</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>需要日ばらし月数</td>
 *  	<td>Number of months for demand disaggregation by day</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>plm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＰＬＭ ＦＬＧ</td>
 *  	<td>PLM flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算順序</td>
 *  	<td>Calculation sequence</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cmn_upri_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>共通単価ＦＬＧ</td>
 *  	<td>Common unit price flg.</td>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール１）</td>
 *  	<td>WG name (Locale 1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール２）</td>
 *  	<td>WG name (Locale 2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール３）</td>
 *  	<td>WG name (Locale 3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール４）</td>
 *  	<td>WG name (Locale 4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール５）</td>
 *  	<td>WG name (Locale 5)</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_WG_MST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_WG_MST";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	private static final MCPermColumnInfo _wg_nm = createColumnInfo("wg_nm");
	public final MCStringPermColumn wg_nm = createStringColumn(_wg_nm);
	
	/**
	 * 販売ＦＬＧ. Sales flg..<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	private static final MCPermColumnInfo _sls_flg = createColumnInfo("sls_flg");
	public final MCBooleanPermColumn sls_flg = createBooleanColumn(_sls_flg);
	
	/**
	 * 物流ＦＬＧ. Distribution flg..<p>
	 *
	 */
	public static final String $lg_flg = "lg_flg";
	private static final MCPermColumnInfo _lg_flg = createColumnInfo("lg_flg");
	public final MCBooleanPermColumn lg_flg = createBooleanColumn(_lg_flg);
	
	/**
	 * 製造ＦＬＧ. Mfg. flg..<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	private static final MCPermColumnInfo _mfg_flg = createColumnInfo("mfg_flg");
	public final MCBooleanPermColumn mfg_flg = createBooleanColumn(_mfg_flg);
	
	/**
	 * 購買ＦＬＧ. Purchasing flg..<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	private static final MCPermColumnInfo _purc_flg = createColumnInfo("purc_flg");
	public final MCBooleanPermColumn purc_flg = createBooleanColumn(_purc_flg);
	
	/**
	 * 債権ＦＬＧ. AR flg..<p>
	 *
	 */
	public static final String $ar_flg = "ar_flg";
	private static final MCPermColumnInfo _ar_flg = createColumnInfo("ar_flg");
	public final MCBooleanPermColumn ar_flg = createBooleanColumn(_ar_flg);
	
	/**
	 * 債務ＦＬＧ. AP flg..<p>
	 *
	 */
	public static final String $ap_flg = "ap_flg";
	private static final MCPermColumnInfo _ap_flg = createColumnInfo("ap_flg");
	public final MCBooleanPermColumn ap_flg = createBooleanColumn(_ap_flg);
	
	/**
	 * 需給ＦＬＧ. Demand and supply flg..<p>
	 *
	 */
	public static final String $sd_flg = "sd_flg";
	private static final MCPermColumnInfo _sd_flg = createColumnInfo("sd_flg");
	public final MCBooleanPermColumn sd_flg = createBooleanColumn(_sd_flg);
	
	/**
	 * ＭＲＰ発番用接頭語. Prefix for MRP numbering.<p>
	 *
	 */
	public static final String $mrp_prefix = "mrp_prefix";
	private static final MCPermColumnInfo _mrp_prefix = createColumnInfo("mrp_prefix");
	public final MCStringPermColumn mrp_prefix = createStringColumn(_mrp_prefix);
	
	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	private static final MCPermColumnInfo _mfg_inst_unit_typ = createColumnInfo("mfg_inst_unit_typ");
	public final MCStringPermColumn mfg_inst_unit_typ = createStringColumn(_mfg_inst_unit_typ);
	
	/**
	 * ＭＲＰ処理区分. MRP process type.<p>
	 *
	 */
	public static final String $mrp_proc_typ = "mrp_proc_typ";
	private static final MCPermColumnInfo _mrp_proc_typ = createColumnInfo("mrp_proc_typ");
	public final MCStringPermColumn mrp_proc_typ = createStringColumn(_mrp_proc_typ);
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public static final String $alloc_margin_days = "alloc_margin_days";
	private static final MCPermColumnInfo _alloc_margin_days = createColumnInfo("alloc_margin_days");
	public final MCNumberPermColumn alloc_margin_days = createNumberColumn(_alloc_margin_days);
	
	/**
	 * 移動・移送引当対象外ＦＬＧ. Not for movement/transport allocation flg..<p>
	 *
	 */
	public static final String $not_xfr_flg = "not_xfr_flg";
	private static final MCPermColumnInfo _not_xfr_flg = createColumnInfo("not_xfr_flg");
	public final MCBooleanPermColumn not_xfr_flg = createBooleanColumn(_not_xfr_flg);
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public static final String $mrp_alloc_margin_days = "mrp_alloc_margin_days";
	private static final MCPermColumnInfo _mrp_alloc_margin_days = createColumnInfo("mrp_alloc_margin_days");
	public final MCNumberPermColumn mrp_alloc_margin_days = createNumberColumn(_mrp_alloc_margin_days);
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public static final String $mrp_opn_xfr_days = "mrp_opn_xfr_days";
	private static final MCPermColumnInfo _mrp_opn_xfr_days = createColumnInfo("mrp_opn_xfr_days");
	public final MCNumberPermColumn mrp_opn_xfr_days = createNumberColumn(_mrp_opn_xfr_days);
	
	/**
	 * 所要区分. Requirements type.<p>
	 *
	 */
	public static final String $rqmt_typ = "rqmt_typ";
	private static final MCPermColumnInfo _rqmt_typ = createColumnInfo("rqmt_typ");
	public final MCStringPermColumn rqmt_typ = createStringColumn(_rqmt_typ);
	
	/**
	 * 生産計画立案区分. Production planning type.<p>
	 *
	 */
	public static final String $prod_pln_typ = "prod_pln_typ";
	private static final MCPermColumnInfo _prod_pln_typ = createColumnInfo("prod_pln_typ");
	public final MCStringPermColumn prod_pln_typ = createStringColumn(_prod_pln_typ);
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public static final String $dmnd_date_div_mons = "dmnd_date_div_mons";
	private static final MCPermColumnInfo _dmnd_date_div_mons = createColumnInfo("dmnd_date_div_mons");
	public final MCNumberPermColumn dmnd_date_div_mons = createNumberColumn(_dmnd_date_div_mons);
	
	/**
	 * ＰＬＭ ＦＬＧ. PLM flg..<p>
	 *
	 */
	public static final String $plm_flg = "plm_flg";
	private static final MCPermColumnInfo _plm_flg = createColumnInfo("plm_flg");
	public final MCBooleanPermColumn plm_flg = createBooleanColumn(_plm_flg);
	
	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public static final String $calc_seq = "calc_seq";
	private static final MCPermColumnInfo _calc_seq = createColumnInfo("calc_seq");
	public final MCNumberPermColumn calc_seq = createNumberColumn(_calc_seq);
	
	/**
	 * 共通単価ＦＬＧ. Common unit price flg..<p>
	 *
	 */
	public static final String $cmn_upri_flg = "cmn_upri_flg";
	private static final MCPermColumnInfo _cmn_upri_flg = createColumnInfo("cmn_upri_flg");
	public final MCBooleanPermColumn cmn_upri_flg = createBooleanColumn(_cmn_upri_flg);
	
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * ワーキンググループ名（ロケール１）. WG name (Locale 1).<p>
	 *
	 */
	public static final String $wg_nm_lcl1 = "wg_nm_lcl1";
	private static final MCPermColumnInfo _wg_nm_lcl1 = createColumnInfo("wg_nm_lcl1");
	public final MCStringPermColumn wg_nm_lcl1 = createStringColumn(_wg_nm_lcl1);
	
	/**
	 * ワーキンググループ名（ロケール２）. WG name (Locale 2).<p>
	 *
	 */
	public static final String $wg_nm_lcl2 = "wg_nm_lcl2";
	private static final MCPermColumnInfo _wg_nm_lcl2 = createColumnInfo("wg_nm_lcl2");
	public final MCStringPermColumn wg_nm_lcl2 = createStringColumn(_wg_nm_lcl2);
	
	/**
	 * ワーキンググループ名（ロケール３）. WG name (Locale 3).<p>
	 *
	 */
	public static final String $wg_nm_lcl3 = "wg_nm_lcl3";
	private static final MCPermColumnInfo _wg_nm_lcl3 = createColumnInfo("wg_nm_lcl3");
	public final MCStringPermColumn wg_nm_lcl3 = createStringColumn(_wg_nm_lcl3);
	
	/**
	 * ワーキンググループ名（ロケール４）. WG name (Locale 4).<p>
	 *
	 */
	public static final String $wg_nm_lcl4 = "wg_nm_lcl4";
	private static final MCPermColumnInfo _wg_nm_lcl4 = createColumnInfo("wg_nm_lcl4");
	public final MCStringPermColumn wg_nm_lcl4 = createStringColumn(_wg_nm_lcl4);
	
	/**
	 * ワーキンググループ名（ロケール５）. WG name (Locale 5).<p>
	 *
	 */
	public static final String $wg_nm_lcl5 = "wg_nm_lcl5";
	private static final MCPermColumnInfo _wg_nm_lcl5 = createColumnInfo("wg_nm_lcl5");
	public final MCStringPermColumn wg_nm_lcl5 = createStringColumn(_wg_nm_lcl5);
	
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_flg_META = createCommonMeta($lg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_flg_META = createCommonMeta($ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_flg_META = createCommonMeta($ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sd_flg_META = createCommonMeta($sd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrp_prefix_META = createCommonMeta($mrp_prefix, mcframe.commonMA.meta.MA_META.MRP_PREFIX);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mrp_proc_typ_META = createCommonMeta($mrp_proc_typ, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta alloc_margin_days_META = createCommonMeta($alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta not_xfr_flg_META = createCommonMeta($not_xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrp_alloc_margin_days_META = createCommonMeta($mrp_alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_META = createCommonMeta($mrp_opn_xfr_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta rqmt_typ_META = createCommonMeta($rqmt_typ, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta prod_pln_typ_META = createCommonMeta($prod_pln_typ, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta dmnd_date_div_mons_META = createCommonMeta($dmnd_date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta plm_flg_META = createCommonMeta($plm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_seq_META = createCommonMeta($calc_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta cmn_upri_flg_META = createCommonMeta($cmn_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta wg_nm_lcl1_META = createCommonMeta($wg_nm_lcl1, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl2_META = createCommonMeta($wg_nm_lcl2, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl3_META = createCommonMeta($wg_nm_lcl3, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl4_META = createCommonMeta($wg_nm_lcl4, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl5_META = createCommonMeta($wg_nm_lcl5, mcframe.commonMA.meta.MA_META.WG_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $CO_ALL1 = "CO_ALL1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CO_ALL",
				$CO_ALL1,
				new String[][]{
						{"co_cd", "co_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAVM_WG_MST_R> constMetas = new ConstMetaList<MAVM_WG_MST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_nm_META,
			sls_flg_META,
			lg_flg_META,
			mfg_flg_META,
			purc_flg_META,
			ar_flg_META,
			ap_flg_META,
			sd_flg_META,
			mrp_prefix_META,
			mfg_inst_unit_typ_META,
			mrp_proc_typ_META,
			alloc_margin_days_META,
			not_xfr_flg_META,
			mrp_alloc_margin_days_META,
			mrp_opn_xfr_days_META,
			rqmt_typ_META,
			prod_pln_typ_META,
			dmnd_date_div_mons_META,
			plm_flg_META,
			calc_seq_META,
			cmn_upri_flg_META,
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
			co_cd_META,
			wg_nm_lcl1_META,
			wg_nm_lcl2_META,
			wg_nm_lcl3_META,
			wg_nm_lcl4_META,
			wg_nm_lcl5_META
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
	protected MAVM_WG_MST_R(ConstMetaList<? extends MAVM_WG_MST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_WG_MST_R(ConstMetaList<? extends MAVM_WG_MST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$wg_cd,
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
			MAVM_WG_MST_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$wg_nm,
				"wg_nm",
				wg_nm,
				false,
				false,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$sls_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$sls_flg,
				"sls_flg",
				sls_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$lg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$lg_flg,
				"lg_flg",
				lg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$mfg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$mfg_flg,
				"mfg_flg",
				mfg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$purc_flg,
				"purc_flg",
				purc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$ar_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$ar_flg,
				"ar_flg",
				ar_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$ap_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$ap_flg,
				"ap_flg",
				ap_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$sd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$sd_flg,
				"sd_flg",
				sd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$mrp_prefix,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$mrp_prefix,
				"mrp_prefix",
				mrp_prefix,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$mfg_inst_unit_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$mfg_inst_unit_typ,
				"mfg_inst_unit_typ",
				mfg_inst_unit_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$mrp_proc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$mrp_proc_typ,
				"mrp_proc_typ",
				mrp_proc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$alloc_margin_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_WG_MST_R.$alloc_margin_days,
				"alloc_margin_days",
				alloc_margin_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$not_xfr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$not_xfr_flg,
				"not_xfr_flg",
				not_xfr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$mrp_alloc_margin_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_WG_MST_R.$mrp_alloc_margin_days,
				"mrp_alloc_margin_days",
				mrp_alloc_margin_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$mrp_opn_xfr_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_WG_MST_R.$mrp_opn_xfr_days,
				"mrp_opn_xfr_days",
				mrp_opn_xfr_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$rqmt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$rqmt_typ,
				"rqmt_typ",
				rqmt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$prod_pln_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$prod_pln_typ,
				"prod_pln_typ",
				prod_pln_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$dmnd_date_div_mons,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_WG_MST_R.$dmnd_date_div_mons,
				"dmnd_date_div_mons",
				dmnd_date_div_mons,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$plm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$plm_flg,
				"plm_flg",
				plm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$calc_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_WG_MST_R.$calc_seq,
				"calc_seq",
				calc_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$cmn_upri_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$cmn_upri_flg,
				"cmn_upri_flg",
				cmn_upri_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WG_MST_R.$del_flg,
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
			MAVM_WG_MST_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$del_usr_id,
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
			MAVM_WG_MST_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$del_usr_nm,
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
			MAVM_WG_MST_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_WG_MST_R.$del_ts,
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
			MAVM_WG_MST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_WG_MST_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_WG_MST_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_WG_MST_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$co_cd,
				"co_cd",
				co_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$wg_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$wg_nm_lcl1,
				"wg_nm_lcl1",
				wg_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$wg_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$wg_nm_lcl2,
				"wg_nm_lcl2",
				wg_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$wg_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$wg_nm_lcl3,
				"wg_nm_lcl3",
				wg_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$wg_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$wg_nm_lcl4,
				"wg_nm_lcl4",
				wg_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WG_MST_R.$wg_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WG_MST_R.$wg_nm_lcl5,
				"wg_nm_lcl5",
				wg_nm_lcl5,
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
	public static MAVM_WG_MST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_WG_MST_R create(String alias) {
		MAVM_WG_MST_R row = new MAVM_WG_MST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_WG_MST_R createByName(T proto) {
		MAVM_WG_MST_R row = MAVM_WG_MST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_WG_MST_R clone() {
		return (MAVM_WG_MST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_WG_MST_R createInstance() {
		return (MAVM_WG_MST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_WG_MST_R getValues(String... names) {
		return (MAVM_WG_MST_R) super.getValues(names);
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
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 1, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 1, $wg_nm, value);
	}

	/**
	 * 販売ＦＬＧ. Sales flg..<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 2, $sls_flg);
	}

	/**
	 * 販売ＦＬＧ. Sales flg..<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 2, $sls_flg, value);
	}

	/**
	 * 物流ＦＬＧ. Distribution flg..<p>
	 *
	 */
	public boolean lg_flg() {
		return getConstBoolean(offset + 3, $lg_flg);
	}

	/**
	 * 物流ＦＬＧ. Distribution flg..<p>
	 *
	 */
	public void lg_flg(boolean value) {
		setConstBoolean(offset + 3, $lg_flg, value);
	}

	/**
	 * 製造ＦＬＧ. Mfg. flg..<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 4, $mfg_flg);
	}

	/**
	 * 製造ＦＬＧ. Mfg. flg..<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 4, $mfg_flg, value);
	}

	/**
	 * 購買ＦＬＧ. Purchasing flg..<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 5, $purc_flg);
	}

	/**
	 * 購買ＦＬＧ. Purchasing flg..<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 5, $purc_flg, value);
	}

	/**
	 * 債権ＦＬＧ. AR flg..<p>
	 *
	 */
	public boolean ar_flg() {
		return getConstBoolean(offset + 6, $ar_flg);
	}

	/**
	 * 債権ＦＬＧ. AR flg..<p>
	 *
	 */
	public void ar_flg(boolean value) {
		setConstBoolean(offset + 6, $ar_flg, value);
	}

	/**
	 * 債務ＦＬＧ. AP flg..<p>
	 *
	 */
	public boolean ap_flg() {
		return getConstBoolean(offset + 7, $ap_flg);
	}

	/**
	 * 債務ＦＬＧ. AP flg..<p>
	 *
	 */
	public void ap_flg(boolean value) {
		setConstBoolean(offset + 7, $ap_flg, value);
	}

	/**
	 * 需給ＦＬＧ. Demand and supply flg..<p>
	 *
	 */
	public boolean sd_flg() {
		return getConstBoolean(offset + 8, $sd_flg);
	}

	/**
	 * 需給ＦＬＧ. Demand and supply flg..<p>
	 *
	 */
	public void sd_flg(boolean value) {
		setConstBoolean(offset + 8, $sd_flg, value);
	}

	/**
	 * ＭＲＰ発番用接頭語. Prefix for MRP numbering.<p>
	 *
	 */
	public String mrp_prefix() {
		return getConstString(offset + 9, $mrp_prefix);
	}

	/**
	 * ＭＲＰ発番用接頭語. Prefix for MRP numbering.<p>
	 *
	 */
	public void mrp_prefix(String value) {
		setConstString(offset + 9, $mrp_prefix, value);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 10, $mfg_inst_unit_typ);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 10, $mfg_inst_unit_typ, value);
	}

	/**
	 * ＭＲＰ処理区分. MRP process type.<p>
	 *
	 */
	public String mrp_proc_typ() {
		return getConstString(offset + 11, $mrp_proc_typ);
	}

	/**
	 * ＭＲＰ処理区分. MRP process type.<p>
	 *
	 */
	public void mrp_proc_typ(String value) {
		setConstString(offset + 11, $mrp_proc_typ, value);
	}

	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 12, $alloc_margin_days);
	}

	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 12, $alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 12, $alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 12, $alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 12, $alloc_margin_days, value);
	}
	
	/**
	 * 引当余裕日数. Allocation extra days.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 12, $alloc_margin_days, value);
	}
	
	/**
	 * 移動・移送引当対象外ＦＬＧ. Not for movement/transport allocation flg..<p>
	 *
	 */
	public boolean not_xfr_flg() {
		return getConstBoolean(offset + 13, $not_xfr_flg);
	}

	/**
	 * 移動・移送引当対象外ＦＬＧ. Not for movement/transport allocation flg..<p>
	 *
	 */
	public void not_xfr_flg(boolean value) {
		setConstBoolean(offset + 13, $not_xfr_flg, value);
	}

	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days() {
		return getConstNumber(offset + 14, $mrp_alloc_margin_days);
	}

	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void mrp_alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 14, $mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void mrp_alloc_margin_days(int value) {
		setConstNumber(offset + 14, $mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void mrp_alloc_margin_days(long value) {
		setConstNumber(offset + 14, $mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void mrp_alloc_margin_days(float value) {
		setConstNumber(offset + 14, $mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ引当余裕日数. MRP allocation extra days.<p>
	 *
	 */
	public void mrp_alloc_margin_days(double value) {
		setConstNumber(offset + 14, $mrp_alloc_margin_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days() {
		return getConstNumber(offset + 15, $mrp_opn_xfr_days);
	}

	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void mrp_opn_xfr_days(MCNumber value) {
		setConstNumber(offset + 15, $mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void mrp_opn_xfr_days(int value) {
		setConstNumber(offset + 15, $mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void mrp_opn_xfr_days(long value) {
		setConstNumber(offset + 15, $mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void mrp_opn_xfr_days(float value) {
		setConstNumber(offset + 15, $mrp_opn_xfr_days, value);
	}
	
	/**
	 * ＭＲＰ未確定移送依頼考慮日数. Days to consider unfirm transport request in MRP.<p>
	 *
	 */
	public void mrp_opn_xfr_days(double value) {
		setConstNumber(offset + 15, $mrp_opn_xfr_days, value);
	}
	
	/**
	 * 所要区分. Requirements type.<p>
	 *
	 */
	public String rqmt_typ() {
		return getConstString(offset + 16, $rqmt_typ);
	}

	/**
	 * 所要区分. Requirements type.<p>
	 *
	 */
	public void rqmt_typ(String value) {
		setConstString(offset + 16, $rqmt_typ, value);
	}

	/**
	 * 生産計画立案区分. Production planning type.<p>
	 *
	 */
	public String prod_pln_typ() {
		return getConstString(offset + 17, $prod_pln_typ);
	}

	/**
	 * 生産計画立案区分. Production planning type.<p>
	 *
	 */
	public void prod_pln_typ(String value) {
		setConstString(offset + 17, $prod_pln_typ, value);
	}

	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons() {
		return getConstNumber(offset + 18, $dmnd_date_div_mons);
	}

	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void dmnd_date_div_mons(MCNumber value) {
		setConstNumber(offset + 18, $dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void dmnd_date_div_mons(int value) {
		setConstNumber(offset + 18, $dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void dmnd_date_div_mons(long value) {
		setConstNumber(offset + 18, $dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void dmnd_date_div_mons(float value) {
		setConstNumber(offset + 18, $dmnd_date_div_mons, value);
	}
	
	/**
	 * 需要日ばらし月数. Number of months for demand disaggregation by day.<p>
	 *
	 */
	public void dmnd_date_div_mons(double value) {
		setConstNumber(offset + 18, $dmnd_date_div_mons, value);
	}
	
	/**
	 * ＰＬＭ ＦＬＧ. PLM flg..<p>
	 *
	 */
	public boolean plm_flg() {
		return getConstBoolean(offset + 19, $plm_flg);
	}

	/**
	 * ＰＬＭ ＦＬＧ. PLM flg..<p>
	 *
	 */
	public void plm_flg(boolean value) {
		setConstBoolean(offset + 19, $plm_flg, value);
	}

	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public MCNumber calc_seq() {
		return getConstNumber(offset + 20, $calc_seq);
	}

	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public void calc_seq(MCNumber value) {
		setConstNumber(offset + 20, $calc_seq, value);
	}
	
	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public void calc_seq(int value) {
		setConstNumber(offset + 20, $calc_seq, value);
	}
	
	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public void calc_seq(long value) {
		setConstNumber(offset + 20, $calc_seq, value);
	}
	
	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public void calc_seq(float value) {
		setConstNumber(offset + 20, $calc_seq, value);
	}
	
	/**
	 * 計算順序. Calculation sequence.<p>
	 *
	 */
	public void calc_seq(double value) {
		setConstNumber(offset + 20, $calc_seq, value);
	}
	
	/**
	 * 共通単価ＦＬＧ. Common unit price flg..<p>
	 *
	 */
	public boolean cmn_upri_flg() {
		return getConstBoolean(offset + 21, $cmn_upri_flg);
	}

	/**
	 * 共通単価ＦＬＧ. Common unit price flg..<p>
	 *
	 */
	public void cmn_upri_flg(boolean value) {
		setConstBoolean(offset + 21, $cmn_upri_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 22, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 22, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 23, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 23, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 24, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 24, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 25, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 25, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 26, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 26, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 27, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 27, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 28, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 28, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 29, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 29, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 30, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 30, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 31, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 31, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 32, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 32, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 33, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 34, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 34, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 35, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 35, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 36, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 36, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 37, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 37, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 38, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 38, $upd_srv_req_no, value);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 39, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 39, $co_cd, value);
	}

	/**
	 * ワーキンググループ名（ロケール１）. WG name (Locale 1).<p>
	 *
	 */
	public String wg_nm_lcl1() {
		return getConstString(offset + 40, $wg_nm_lcl1);
	}

	/**
	 * ワーキンググループ名（ロケール１）. WG name (Locale 1).<p>
	 *
	 */
	public void wg_nm_lcl1(String value) {
		setConstString(offset + 40, $wg_nm_lcl1, value);
	}

	/**
	 * ワーキンググループ名（ロケール２）. WG name (Locale 2).<p>
	 *
	 */
	public String wg_nm_lcl2() {
		return getConstString(offset + 41, $wg_nm_lcl2);
	}

	/**
	 * ワーキンググループ名（ロケール２）. WG name (Locale 2).<p>
	 *
	 */
	public void wg_nm_lcl2(String value) {
		setConstString(offset + 41, $wg_nm_lcl2, value);
	}

	/**
	 * ワーキンググループ名（ロケール３）. WG name (Locale 3).<p>
	 *
	 */
	public String wg_nm_lcl3() {
		return getConstString(offset + 42, $wg_nm_lcl3);
	}

	/**
	 * ワーキンググループ名（ロケール３）. WG name (Locale 3).<p>
	 *
	 */
	public void wg_nm_lcl3(String value) {
		setConstString(offset + 42, $wg_nm_lcl3, value);
	}

	/**
	 * ワーキンググループ名（ロケール４）. WG name (Locale 4).<p>
	 *
	 */
	public String wg_nm_lcl4() {
		return getConstString(offset + 43, $wg_nm_lcl4);
	}

	/**
	 * ワーキンググループ名（ロケール４）. WG name (Locale 4).<p>
	 *
	 */
	public void wg_nm_lcl4(String value) {
		setConstString(offset + 43, $wg_nm_lcl4, value);
	}

	/**
	 * ワーキンググループ名（ロケール５）. WG name (Locale 5).<p>
	 *
	 */
	public String wg_nm_lcl5() {
		return getConstString(offset + 44, $wg_nm_lcl5);
	}

	/**
	 * ワーキンググループ名（ロケール５）. WG name (Locale 5).<p>
	 *
	 */
	public void wg_nm_lcl5(String value) {
		setConstString(offset + 44, $wg_nm_lcl5, value);
	}

	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mrp_prefix.equalsIgnoreCase(name)) {
			return mrp_prefix();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
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
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($wg_nm_lcl1.equalsIgnoreCase(name)) {
			return wg_nm_lcl1();
		}
		if ($wg_nm_lcl2.equalsIgnoreCase(name)) {
			return wg_nm_lcl2();
		}
		if ($wg_nm_lcl3.equalsIgnoreCase(name)) {
			return wg_nm_lcl3();
		}
		if ($wg_nm_lcl4.equalsIgnoreCase(name)) {
			return wg_nm_lcl4();
		}
		if ($wg_nm_lcl5.equalsIgnoreCase(name)) {
			return wg_nm_lcl5();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days();
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			return calc_seq();
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
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			return lg_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			return ar_flg();
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			return ap_flg();
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			return sd_flg();
		}
		if ($not_xfr_flg.equalsIgnoreCase(name)) {
			return not_xfr_flg();
		}
		if ($plm_flg.equalsIgnoreCase(name)) {
			return plm_flg();
		}
		if ($cmn_upri_flg.equalsIgnoreCase(name)) {
			return cmn_upri_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mrp_prefix.equalsIgnoreCase(name)) {
			return mrp_prefix();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
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
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($wg_nm_lcl1.equalsIgnoreCase(name)) {
			return wg_nm_lcl1();
		}
		if ($wg_nm_lcl2.equalsIgnoreCase(name)) {
			return wg_nm_lcl2();
		}
		if ($wg_nm_lcl3.equalsIgnoreCase(name)) {
			return wg_nm_lcl3();
		}
		if ($wg_nm_lcl4.equalsIgnoreCase(name)) {
			return wg_nm_lcl4();
		}
		if ($wg_nm_lcl5.equalsIgnoreCase(name)) {
			return wg_nm_lcl5();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days();
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			return calc_seq();
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
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			return lg_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			return ar_flg();
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			return ap_flg();
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			return sd_flg();
		}
		if ($not_xfr_flg.equalsIgnoreCase(name)) {
			return not_xfr_flg();
		}
		if ($plm_flg.equalsIgnoreCase(name)) {
			return plm_flg();
		}
		if ($cmn_upri_flg.equalsIgnoreCase(name)) {
			return cmn_upri_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mrp_prefix.equalsIgnoreCase(name)) {
			mrp_prefix(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			mrp_proc_typ(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
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
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($wg_nm_lcl1.equalsIgnoreCase(name)) {
			wg_nm_lcl1(value);
			return;
		}
		if ($wg_nm_lcl2.equalsIgnoreCase(name)) {
			wg_nm_lcl2(value);
			return;
		}
		if ($wg_nm_lcl3.equalsIgnoreCase(name)) {
			wg_nm_lcl3(value);
			return;
		}
		if ($wg_nm_lcl4.equalsIgnoreCase(name)) {
			wg_nm_lcl4(value);
			return;
		}
		if ($wg_nm_lcl5.equalsIgnoreCase(name)) {
			wg_nm_lcl5(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
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
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			lg_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			ar_flg(value);
			return;
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			ap_flg(value);
			return;
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			sd_flg(value);
			return;
		}
		if ($not_xfr_flg.equalsIgnoreCase(name)) {
			not_xfr_flg(value);
			return;
		}
		if ($plm_flg.equalsIgnoreCase(name)) {
			plm_flg(value);
			return;
		}
		if ($cmn_upri_flg.equalsIgnoreCase(name)) {
			cmn_upri_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mrp_prefix.equalsIgnoreCase(name)) {
			mrp_prefix(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			mrp_proc_typ(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
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
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($wg_nm_lcl1.equalsIgnoreCase(name)) {
			wg_nm_lcl1(value);
			return;
		}
		if ($wg_nm_lcl2.equalsIgnoreCase(name)) {
			wg_nm_lcl2(value);
			return;
		}
		if ($wg_nm_lcl3.equalsIgnoreCase(name)) {
			wg_nm_lcl3(value);
			return;
		}
		if ($wg_nm_lcl4.equalsIgnoreCase(name)) {
			wg_nm_lcl4(value);
			return;
		}
		if ($wg_nm_lcl5.equalsIgnoreCase(name)) {
			wg_nm_lcl5(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
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
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			lg_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			ar_flg(value);
			return;
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			ap_flg(value);
			return;
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			sd_flg(value);
			return;
		}
		if ($not_xfr_flg.equalsIgnoreCase(name)) {
			not_xfr_flg(value);
			return;
		}
		if ($plm_flg.equalsIgnoreCase(name)) {
			plm_flg(value);
			return;
		}
		if ($cmn_upri_flg.equalsIgnoreCase(name)) {
			cmn_upri_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
