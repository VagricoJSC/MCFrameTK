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
 * "工場出荷承認ヘッダ // Factory release approval header"DBコンテナRowクラスです。<p>
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
 *  	<td>plnt_aprv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場出荷承認ＮＯ</td>
 *  	<td>Factory release approval No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>skip_chk_ship_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷時構成チェック不要ＦＬＧ</td>
 *  	<td>Component check not required at shipping flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>plnt_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場出荷承認状況区分</td>
 *  	<td>Factory release approval status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認日</td>
 *  	<td>Approval date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認日時</td>
 *  	<td>Approval date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>plnt_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場出荷承認役割ＣＤ</td>
 *  	<td>Factory release approval role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認部門ＣＤ</td>
 *  	<td>Approval dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認者ＣＤ</td>
 *  	<td>Approver cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認理由</td>
 *  	<td>Approval reason</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>plnt_aprv_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場出荷記録書発行済ＦＬＧ</td>
 *  	<td>Record sheet of factory release issued flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>plnt_aprv_prnt_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場出荷記録書発行日時</td>
 *  	<td>Record sheet of factory release issue date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場出荷記録書連番</td>
 *  	<td>Record sheet of factory release sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_PLNT_APRV_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PLNT_APRV";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 工場出荷承認ＮＯ. Factory release approval No..<p>
	 *
	 */
	public static final String $plnt_aprv_no = "plnt_aprv_no";
	private static final MCPermColumnInfo _plnt_aprv_no = createColumnInfo("plnt_aprv_no");
	public final MCStringPermColumn plnt_aprv_no = createStringColumn(_plnt_aprv_no);
	
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
	 * 出荷時構成チェック不要ＦＬＧ. Component check not required at shipping flg..<p>
	 *
	 */
	public static final String $skip_chk_ship_flg = "skip_chk_ship_flg";
	private static final MCPermColumnInfo _skip_chk_ship_flg = createColumnInfo("skip_chk_ship_flg");
	public final MCBooleanPermColumn skip_chk_ship_flg = createBooleanColumn(_skip_chk_ship_flg);
	
	/**
	 * 工場出荷承認状況区分. Factory release approval status type.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
	private static final MCPermColumnInfo _plnt_aprv_sts_typ = createColumnInfo("plnt_aprv_sts_typ");
	public final MCStringPermColumn plnt_aprv_sts_typ = createStringColumn(_plnt_aprv_sts_typ);
	
	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	private static final MCPermColumnInfo _aprv_dt = createColumnInfo("aprv_dt");
	public final MCDatePermColumn aprv_dt = createDateColumn(_aprv_dt);
	
	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public static final String $aprv_tm = "aprv_tm";
	private static final MCPermColumnInfo _aprv_tm = createColumnInfo("aprv_tm");
	public final MCDatePermColumn aprv_tm = createDateColumn(_aprv_tm);
	
	/**
	 * 工場出荷承認役割ＣＤ. Factory release approval role cd..<p>
	 *
	 */
	public static final String $plnt_aprv_role_cd = "plnt_aprv_role_cd";
	private static final MCPermColumnInfo _plnt_aprv_role_cd = createColumnInfo("plnt_aprv_role_cd");
	public final MCStringPermColumn plnt_aprv_role_cd = createStringColumn(_plnt_aprv_role_cd);
	
	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	private static final MCPermColumnInfo _aprv_dpt_cd = createColumnInfo("aprv_dpt_cd");
	public final MCStringPermColumn aprv_dpt_cd = createStringColumn(_aprv_dpt_cd);
	
	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	private static final MCPermColumnInfo _aprv_usr_cd = createColumnInfo("aprv_usr_cd");
	public final MCStringPermColumn aprv_usr_cd = createStringColumn(_aprv_usr_cd);
	
	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";
	private static final MCPermColumnInfo _aprv_rsn = createColumnInfo("aprv_rsn");
	public final MCStringPermColumn aprv_rsn = createStringColumn(_aprv_rsn);
	
	/**
	 * 工場出荷記録書発行済ＦＬＧ. Record sheet of factory release issued flg..<p>
	 *
	 */
	public static final String $plnt_aprv_prnt_flg = "plnt_aprv_prnt_flg";
	private static final MCPermColumnInfo _plnt_aprv_prnt_flg = createColumnInfo("plnt_aprv_prnt_flg");
	public final MCBooleanPermColumn plnt_aprv_prnt_flg = createBooleanColumn(_plnt_aprv_prnt_flg);
	
	/**
	 * 工場出荷記録書発行日時. Record sheet of factory release issue date and time.<p>
	 *
	 */
	public static final String $plnt_aprv_prnt_tm = "plnt_aprv_prnt_tm";
	private static final MCPermColumnInfo _plnt_aprv_prnt_tm = createColumnInfo("plnt_aprv_prnt_tm");
	public final MCDatePermColumn plnt_aprv_prnt_tm = createDateColumn(_plnt_aprv_prnt_tm);
	
	/**
	 * 工場出荷記録書連番. Record sheet of factory release sequence number.<p>
	 *
	 */
	public static final String $seq = "seq";
	private static final MCPermColumnInfo _seq = createColumnInfo("seq");
	public final MCNumberPermColumn seq = createNumberColumn(_seq);
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	private static final MCPermColumnInfo _site_cd = createColumnInfo("site_cd");
	public final MCStringPermColumn site_cd = createStringColumn(_site_cd);
	
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
	
	public static final MCMeta plnt_aprv_no_META = createCommonMeta($plnt_aprv_no, mcframe.commonMA.meta.MA_META.PLNT_APRV_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta skip_chk_ship_flg_META = createCommonMeta($skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_sts_typ_META = createCommonMeta($plnt_aprv_sts_typ, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_tm_META = createCommonMeta($aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta plnt_aprv_role_cd_META = createCommonMeta($plnt_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.PLNT_APRV_RSN);
	public static final MCMeta plnt_aprv_prnt_flg_META = createCommonMeta($plnt_aprv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_prnt_tm_META = createCommonMeta($plnt_aprv_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta seq_META = createCommonMeta($seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PLNT_APRV_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PLNT_APRV_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PLNT_APRV_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PLNT_APRV_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_PLNT_APRV_R> constMetas = new ConstMetaList<MST_PLNT_APRV_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			plnt_aprv_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			sublot_no_META,
			skip_chk_ship_flg_META,
			plnt_aprv_sts_typ_META,
			aprv_dt_META,
			aprv_tm_META,
			plnt_aprv_role_cd_META,
			aprv_dpt_cd_META,
			aprv_usr_cd_META,
			aprv_rsn_META,
			plnt_aprv_prnt_flg_META,
			plnt_aprv_prnt_tm_META,
			seq_META,
			site_cd_META,
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
	protected MST_PLNT_APRV_R(ConstMetaList<? extends MST_PLNT_APRV_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PLNT_APRV_R(ConstMetaList<? extends MST_PLNT_APRV_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$plnt_aprv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$plnt_aprv_no,
				"plnt_aprv_no",
				plnt_aprv_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$itm_cd,
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
			MST_PLNT_APRV_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$itm_sub1,
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
			MST_PLNT_APRV_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$itm_sub2,
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
			MST_PLNT_APRV_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$itm_sub3,
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
			MST_PLNT_APRV_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$lot_no,
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
			MST_PLNT_APRV_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$sublot_no,
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
			MST_PLNT_APRV_R.$skip_chk_ship_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PLNT_APRV_R.$skip_chk_ship_flg,
				"skip_chk_ship_flg",
				skip_chk_ship_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$plnt_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$plnt_aprv_sts_typ,
				"plnt_aprv_sts_typ",
				plnt_aprv_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$aprv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PLNT_APRV_R.$aprv_dt,
				"aprv_dt",
				aprv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$aprv_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PLNT_APRV_R.$aprv_tm,
				"aprv_tm",
				aprv_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$plnt_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$plnt_aprv_role_cd,
				"plnt_aprv_role_cd",
				plnt_aprv_role_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$aprv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$aprv_dpt_cd,
				"aprv_dpt_cd",
				aprv_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$aprv_usr_cd,
				"aprv_usr_cd",
				aprv_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$aprv_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$aprv_rsn,
				"aprv_rsn",
				aprv_rsn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$plnt_aprv_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PLNT_APRV_R.$plnt_aprv_prnt_flg,
				"plnt_aprv_prnt_flg",
				plnt_aprv_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$plnt_aprv_prnt_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PLNT_APRV_R.$plnt_aprv_prnt_tm,
				"plnt_aprv_prnt_tm",
				plnt_aprv_prnt_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PLNT_APRV_R.$seq,
				"seq",
				seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$site_cd,
				"site_cd",
				site_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PLNT_APRV_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$intr_rmrks,
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
			MST_PLNT_APRV_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$sub_char1,
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
			MST_PLNT_APRV_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$sub_char2,
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
			MST_PLNT_APRV_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$sub_char3,
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
			MST_PLNT_APRV_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$ins_usr_id,
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
			MST_PLNT_APRV_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$ins_usr_nm,
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
			MST_PLNT_APRV_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PLNT_APRV_R.$ins_ts,
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
			MST_PLNT_APRV_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$ins_func_id,
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
			MST_PLNT_APRV_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PLNT_APRV_R.$upd_cntr,
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
			MST_PLNT_APRV_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$upd_usr_id,
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
			MST_PLNT_APRV_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$upd_usr_nm,
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
			MST_PLNT_APRV_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PLNT_APRV_R.$upd_ts,
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
			MST_PLNT_APRV_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$upd_func_id,
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
			MST_PLNT_APRV_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PLNT_APRV_R.$upd_srv_req_no,
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
	public static MST_PLNT_APRV_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PLNT_APRV_R create(String alias) {
		MST_PLNT_APRV_R row = new MST_PLNT_APRV_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PLNT_APRV_R createByName(T proto) {
		MST_PLNT_APRV_R row = MST_PLNT_APRV_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PLNT_APRV_R clone() {
		return (MST_PLNT_APRV_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PLNT_APRV_R createInstance() {
		return (MST_PLNT_APRV_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PLNT_APRV_R getValues(String... names) {
		return (MST_PLNT_APRV_R) super.getValues(names);
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
	 public MSW_PLNT_APRV_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PLNT_APRV_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PLNT_APRV_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PLNT_APRV_KEY_R.TABLE_NAME);
	 }

	/**
	 * 工場出荷承認ＮＯ. Factory release approval No..<p>
	 *
	 */
	public String plnt_aprv_no() {
		return getConstString(offset + 0, $plnt_aprv_no);
	}

	/**
	 * 工場出荷承認ＮＯ. Factory release approval No..<p>
	 *
	 */
	public void plnt_aprv_no(String value) {
		setConstString(offset + 0, $plnt_aprv_no, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 5, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 5, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 6, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 6, $sublot_no, value);
	}

	/**
	 * 出荷時構成チェック不要ＦＬＧ. Component check not required at shipping flg..<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return getConstBoolean(offset + 7, $skip_chk_ship_flg);
	}

	/**
	 * 出荷時構成チェック不要ＦＬＧ. Component check not required at shipping flg..<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 7, $skip_chk_ship_flg, value);
	}

	/**
	 * 工場出荷承認状況区分. Factory release approval status type.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 8, $plnt_aprv_sts_typ);
	}

	/**
	 * 工場出荷承認状況区分. Factory release approval status type.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 8, $plnt_aprv_sts_typ, value);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 9, $aprv_dt);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 9, $aprv_dt, value);
	}

	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return getConstDate(offset + 10, $aprv_tm);
	}

	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		setConstDate(offset + 10, $aprv_tm, value);
	}

	/**
	 * 工場出荷承認役割ＣＤ. Factory release approval role cd..<p>
	 *
	 */
	public String plnt_aprv_role_cd() {
		return getConstString(offset + 11, $plnt_aprv_role_cd);
	}

	/**
	 * 工場出荷承認役割ＣＤ. Factory release approval role cd..<p>
	 *
	 */
	public void plnt_aprv_role_cd(String value) {
		setConstString(offset + 11, $plnt_aprv_role_cd, value);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 12, $aprv_dpt_cd);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 12, $aprv_dpt_cd, value);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 13, $aprv_usr_cd);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 13, $aprv_usr_cd, value);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 14, $aprv_rsn);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 14, $aprv_rsn, value);
	}

	/**
	 * 工場出荷記録書発行済ＦＬＧ. Record sheet of factory release issued flg..<p>
	 *
	 */
	public boolean plnt_aprv_prnt_flg() {
		return getConstBoolean(offset + 15, $plnt_aprv_prnt_flg);
	}

	/**
	 * 工場出荷記録書発行済ＦＬＧ. Record sheet of factory release issued flg..<p>
	 *
	 */
	public void plnt_aprv_prnt_flg(boolean value) {
		setConstBoolean(offset + 15, $plnt_aprv_prnt_flg, value);
	}

	/**
	 * 工場出荷記録書発行日時. Record sheet of factory release issue date and time.<p>
	 *
	 */
	public MCDate plnt_aprv_prnt_tm() {
		return getConstDate(offset + 16, $plnt_aprv_prnt_tm);
	}

	/**
	 * 工場出荷記録書発行日時. Record sheet of factory release issue date and time.<p>
	 *
	 */
	public void plnt_aprv_prnt_tm(MCDate value) {
		setConstDate(offset + 16, $plnt_aprv_prnt_tm, value);
	}

	/**
	 * 工場出荷記録書連番. Record sheet of factory release sequence number.<p>
	 *
	 */
	public MCNumber seq() {
		return getConstNumber(offset + 17, $seq);
	}

	/**
	 * 工場出荷記録書連番. Record sheet of factory release sequence number.<p>
	 *
	 */
	public void seq(MCNumber value) {
		setConstNumber(offset + 17, $seq, value);
	}
	
	/**
	 * 工場出荷記録書連番. Record sheet of factory release sequence number.<p>
	 *
	 */
	public void seq(int value) {
		setConstNumber(offset + 17, $seq, value);
	}
	
	/**
	 * 工場出荷記録書連番. Record sheet of factory release sequence number.<p>
	 *
	 */
	public void seq(long value) {
		setConstNumber(offset + 17, $seq, value);
	}
	
	/**
	 * 工場出荷記録書連番. Record sheet of factory release sequence number.<p>
	 *
	 */
	public void seq(float value) {
		setConstNumber(offset + 17, $seq, value);
	}
	
	/**
	 * 工場出荷記録書連番. Record sheet of factory release sequence number.<p>
	 *
	 */
	public void seq(double value) {
		setConstNumber(offset + 17, $seq, value);
	}
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 18, $site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 18, $site_cd, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 19, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 19, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 20, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 20, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 21, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 21, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 22, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 22, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 23, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 23, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 24, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 24, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 25, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 26, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 26, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 27, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 28, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 28, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 29, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 29, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 30, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 31, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 31, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 32, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 32, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			return plnt_aprv_no();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return plnt_aprv_role_cd();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
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
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
		}
		if ($plnt_aprv_prnt_tm.equalsIgnoreCase(name)) {
			return plnt_aprv_prnt_tm();
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
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($plnt_aprv_prnt_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			return plnt_aprv_no();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return plnt_aprv_role_cd();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
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
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
		}
		if ($plnt_aprv_prnt_tm.equalsIgnoreCase(name)) {
			return plnt_aprv_prnt_tm();
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
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($plnt_aprv_prnt_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			plnt_aprv_no(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			plnt_aprv_role_cd(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
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
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			aprv_tm(value);
			return;
		}
		if ($plnt_aprv_prnt_tm.equalsIgnoreCase(name)) {
			plnt_aprv_prnt_tm(value);
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
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($plnt_aprv_prnt_flg.equalsIgnoreCase(name)) {
			plnt_aprv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			plnt_aprv_no(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			plnt_aprv_role_cd(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
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
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			aprv_tm(value);
			return;
		}
		if ($plnt_aprv_prnt_tm.equalsIgnoreCase(name)) {
			plnt_aprv_prnt_tm(value);
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
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($plnt_aprv_prnt_flg.equalsIgnoreCase(name)) {
			plnt_aprv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
