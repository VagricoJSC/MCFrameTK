package mcframe.serverMB.dbc;

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
 * "承認情報ヘッダ // Approval info. header"DBコンテナRowクラスです。<p>
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
 *  	<td>aprv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認ＮＯ</td>
 *  	<td>Approval No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>aprv_no_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認ＮＯ連番</td>
 *  	<td>Approval sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認状況区分</td>
 *  	<td>Approval status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>last_aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最終承認者ＣＤ</td>
 *  	<td>Final approver cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>last_aprv_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最終承認日時</td>
 *  	<td>Final approver date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>next_opr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>次処理済ＦＬＧ</td>
 *  	<td>Next process completed flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>登録日</td>
 *  	<td>Entry date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務担当者ＣＤ</td>
 *  	<td>Business PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_ins_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>登録担当者ＣＤ</td>
 *  	<td>Entry PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>master_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認マスタ適用日</td>
 *  	<td>Approval master application date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_func_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認機能区分</td>
 *  	<td>Approval function type</td>
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
 *  	<td>aprv_row_num</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認行番号</td>
 *  	<td>Approver row number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元品目ＣＤ</td>
 *  	<td>Approval creating source item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元枝番１</td>
 *  	<td>Approval creating source branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元枝番２</td>
 *  	<td>Approval creating source branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元枝番３</td>
 *  	<td>Approval creating source branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元部門ＣＤ</td>
 *  	<td>Approval creating source dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元取引先ＣＤ</td>
 *  	<td>Approval creating source customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_cur_cd1</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元通貨ＣＤ１</td>
 *  	<td>Approval creating source base currency cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_amt1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元金額１</td>
 *  	<td>Approval creating source amount 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_cur_cd2</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元通貨ＣＤ２</td>
 *  	<td>Approval creating source base currency cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_amt2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元金額２</td>
 *  	<td>Approval creating source amount 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_cur_cd3</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元通貨ＣＤ３</td>
 *  	<td>Approval creating source base currency cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_amt3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元金額３</td>
 *  	<td>Approval created-from amount 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_ext_key1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元拡張項目１</td>
 *  	<td>Approval creating source extended column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_ext_key2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元拡張項目２</td>
 *  	<td>Approval creating source extended column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_ext_key3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元拡張項目３</td>
 *  	<td>Approval created-from expanded column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_src_no1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元ＮＯ１</td>
 *  	<td>Approval creating source No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_src_no2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元ＮＯ２</td>
 *  	<td>Approval creating source No. 2</td>
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
 *  	<td>aprv_can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消可能ＦＬＧ</td>
 *  	<td>Cancelable flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消ＦＬＧ</td>
 *  	<td>Cancel flg.</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBT_APRV_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MBT_APRV";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	private static final MCPermColumnInfo _aprv_no = createColumnInfo("aprv_no");
	public final MCStringPermColumn aprv_no = createStringColumn(_aprv_no);
	
	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public static final String $aprv_no_seq = "aprv_no_seq";
	private static final MCPermColumnInfo _aprv_no_seq = createColumnInfo("aprv_no_seq");
	public final MCNumberPermColumn aprv_no_seq = createNumberColumn(_aprv_no_seq);
	
	/**
	 * 承認状況区分. Approval status type.<p>
	 *
	 */
	public static final String $aprv_sts_typ = "aprv_sts_typ";
	private static final MCPermColumnInfo _aprv_sts_typ = createColumnInfo("aprv_sts_typ");
	public final MCStringPermColumn aprv_sts_typ = createStringColumn(_aprv_sts_typ);
	
	/**
	 * 最終承認者ＣＤ. Final approver cd..<p>
	 *
	 */
	public static final String $last_aprv_usr_cd = "last_aprv_usr_cd";
	private static final MCPermColumnInfo _last_aprv_usr_cd = createColumnInfo("last_aprv_usr_cd");
	public final MCStringPermColumn last_aprv_usr_cd = createStringColumn(_last_aprv_usr_cd);
	
	/**
	 * 最終承認日時. Final approver date and time.<p>
	 *
	 */
	public static final String $last_aprv_tm = "last_aprv_tm";
	private static final MCPermColumnInfo _last_aprv_tm = createColumnInfo("last_aprv_tm");
	public final MCDatePermColumn last_aprv_tm = createDateColumn(_last_aprv_tm);
	
	/**
	 * 次処理済ＦＬＧ. Next process completed flg..<p>
	 *
	 */
	public static final String $next_opr_flg = "next_opr_flg";
	private static final MCPermColumnInfo _next_opr_flg = createColumnInfo("next_opr_flg");
	public final MCBooleanPermColumn next_opr_flg = createBooleanColumn(_next_opr_flg);
	
	/**
	 * 登録日. Entry date.<p>
	 *
	 */
	public static final String $ins_dt = "ins_dt";
	private static final MCPermColumnInfo _ins_dt = createColumnInfo("ins_dt");
	public final MCDatePermColumn ins_dt = createDateColumn(_ins_dt);
	
	/**
	 * 業務担当者ＣＤ. Business PIC cd..<p>
	 *
	 */
	public static final String $biz_usr_cd = "biz_usr_cd";
	private static final MCPermColumnInfo _biz_usr_cd = createColumnInfo("biz_usr_cd");
	public final MCStringPermColumn biz_usr_cd = createStringColumn(_biz_usr_cd);
	
	/**
	 * 登録担当者ＣＤ. Entry PIC cd..<p>
	 *
	 */
	public static final String $src_ins_usr_cd = "src_ins_usr_cd";
	private static final MCPermColumnInfo _src_ins_usr_cd = createColumnInfo("src_ins_usr_cd");
	public final MCStringPermColumn src_ins_usr_cd = createStringColumn(_src_ins_usr_cd);
	
	/**
	 * 承認マスタ適用日. Approval master application date.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	private static final MCPermColumnInfo _master_dt = createColumnInfo("master_dt");
	public final MCDatePermColumn master_dt = createDateColumn(_master_dt);
	
	/**
	 * 承認機能区分. Approval function type.<p>
	 *
	 */
	public static final String $aprv_func_typ = "aprv_func_typ";
	private static final MCPermColumnInfo _aprv_func_typ = createColumnInfo("aprv_func_typ");
	public final MCStringPermColumn aprv_func_typ = createStringColumn(_aprv_func_typ);
	
	/**
	 * 承認ルートパタン. Approval route pattern.<p>
	 *
	 */
	public static final String $aprv_rt_ptn = "aprv_rt_ptn";
	private static final MCPermColumnInfo _aprv_rt_ptn = createColumnInfo("aprv_rt_ptn");
	public final MCStringPermColumn aprv_rt_ptn = createStringColumn(_aprv_rt_ptn);
	
	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public static final String $aprv_row_num = "aprv_row_num";
	private static final MCPermColumnInfo _aprv_row_num = createColumnInfo("aprv_row_num");
	public final MCNumberPermColumn aprv_row_num = createNumberColumn(_aprv_row_num);
	
	/**
	 * 承認作成元品目ＣＤ. Approval creating source item cd..<p>
	 *
	 */
	public static final String $src_itm_cd = "src_itm_cd";
	private static final MCPermColumnInfo _src_itm_cd = createColumnInfo("src_itm_cd");
	public final MCStringPermColumn src_itm_cd = createStringColumn(_src_itm_cd);
	
	/**
	 * 承認作成元枝番１. Approval creating source branch No. 1.<p>
	 *
	 */
	public static final String $src_itm_sub1 = "src_itm_sub1";
	private static final MCPermColumnInfo _src_itm_sub1 = createColumnInfo("src_itm_sub1");
	public final MCStringPermColumn src_itm_sub1 = createStringColumn(_src_itm_sub1);
	
	/**
	 * 承認作成元枝番２. Approval creating source branch No. 2.<p>
	 *
	 */
	public static final String $src_itm_sub2 = "src_itm_sub2";
	private static final MCPermColumnInfo _src_itm_sub2 = createColumnInfo("src_itm_sub2");
	public final MCStringPermColumn src_itm_sub2 = createStringColumn(_src_itm_sub2);
	
	/**
	 * 承認作成元枝番３. Approval creating source branch No. 3.<p>
	 *
	 */
	public static final String $src_itm_sub3 = "src_itm_sub3";
	private static final MCPermColumnInfo _src_itm_sub3 = createColumnInfo("src_itm_sub3");
	public final MCStringPermColumn src_itm_sub3 = createStringColumn(_src_itm_sub3);
	
	/**
	 * 承認作成元部門ＣＤ. Approval creating source dept. cd..<p>
	 *
	 */
	public static final String $src_dpt_cd = "src_dpt_cd";
	private static final MCPermColumnInfo _src_dpt_cd = createColumnInfo("src_dpt_cd");
	public final MCStringPermColumn src_dpt_cd = createStringColumn(_src_dpt_cd);
	
	/**
	 * 承認作成元取引先ＣＤ. Approval creating source customer cd..<p>
	 *
	 */
	public static final String $src_bp_cd = "src_bp_cd";
	private static final MCPermColumnInfo _src_bp_cd = createColumnInfo("src_bp_cd");
	public final MCStringPermColumn src_bp_cd = createStringColumn(_src_bp_cd);
	
	/**
	 * 承認作成元通貨ＣＤ１. Approval creating source base currency cd. 1.<p>
	 *
	 */
	public static final String $src_cur_cd1 = "src_cur_cd1";
	private static final MCPermColumnInfo _src_cur_cd1 = createColumnInfo("src_cur_cd1");
	public final MCStringPermColumn src_cur_cd1 = createStringColumn(_src_cur_cd1);
	
	/**
	 * 承認作成元金額１. Approval creating source amount 1.<p>
	 *
	 */
	public static final String $src_amt1 = "src_amt1";
	private static final MCPermColumnInfo _src_amt1 = createColumnInfo("src_amt1");
	public final MCNumberPermColumn src_amt1 = createNumberColumn(_src_amt1);
	
	/**
	 * 承認作成元通貨ＣＤ２. Approval creating source base currency cd. 2.<p>
	 *
	 */
	public static final String $src_cur_cd2 = "src_cur_cd2";
	private static final MCPermColumnInfo _src_cur_cd2 = createColumnInfo("src_cur_cd2");
	public final MCStringPermColumn src_cur_cd2 = createStringColumn(_src_cur_cd2);
	
	/**
	 * 承認作成元金額２. Approval creating source amount 2.<p>
	 *
	 */
	public static final String $src_amt2 = "src_amt2";
	private static final MCPermColumnInfo _src_amt2 = createColumnInfo("src_amt2");
	public final MCNumberPermColumn src_amt2 = createNumberColumn(_src_amt2);
	
	/**
	 * 承認作成元通貨ＣＤ３. Approval creating source base currency cd. 3.<p>
	 *
	 */
	public static final String $src_cur_cd3 = "src_cur_cd3";
	private static final MCPermColumnInfo _src_cur_cd3 = createColumnInfo("src_cur_cd3");
	public final MCStringPermColumn src_cur_cd3 = createStringColumn(_src_cur_cd3);
	
	/**
	 * 承認作成元金額３. Approval created-from amount 3.<p>
	 *
	 */
	public static final String $src_amt3 = "src_amt3";
	private static final MCPermColumnInfo _src_amt3 = createColumnInfo("src_amt3");
	public final MCNumberPermColumn src_amt3 = createNumberColumn(_src_amt3);
	
	/**
	 * 承認作成元拡張項目１. Approval creating source extended column 1.<p>
	 *
	 */
	public static final String $src_ext_key1 = "src_ext_key1";
	private static final MCPermColumnInfo _src_ext_key1 = createColumnInfo("src_ext_key1");
	public final MCStringPermColumn src_ext_key1 = createStringColumn(_src_ext_key1);
	
	/**
	 * 承認作成元拡張項目２. Approval creating source extended column 2.<p>
	 *
	 */
	public static final String $src_ext_key2 = "src_ext_key2";
	private static final MCPermColumnInfo _src_ext_key2 = createColumnInfo("src_ext_key2");
	public final MCStringPermColumn src_ext_key2 = createStringColumn(_src_ext_key2);
	
	/**
	 * 承認作成元拡張項目３. Approval created-from expanded column 3.<p>
	 *
	 */
	public static final String $src_ext_key3 = "src_ext_key3";
	private static final MCPermColumnInfo _src_ext_key3 = createColumnInfo("src_ext_key3");
	public final MCStringPermColumn src_ext_key3 = createStringColumn(_src_ext_key3);
	
	/**
	 * 承認作成元ＮＯ１. Approval creating source No. 1.<p>
	 *
	 */
	public static final String $aprv_src_no1 = "aprv_src_no1";
	private static final MCPermColumnInfo _aprv_src_no1 = createColumnInfo("aprv_src_no1");
	public final MCStringPermColumn aprv_src_no1 = createStringColumn(_aprv_src_no1);
	
	/**
	 * 承認作成元ＮＯ２. Approval creating source No. 2.<p>
	 *
	 */
	public static final String $aprv_src_no2 = "aprv_src_no2";
	private static final MCPermColumnInfo _aprv_src_no2 = createColumnInfo("aprv_src_no2");
	public final MCStringPermColumn aprv_src_no2 = createStringColumn(_aprv_src_no2);
	
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
	public static final String $aprv_can_flg = "aprv_can_flg";
	private static final MCPermColumnInfo _aprv_can_flg = createColumnInfo("aprv_can_flg");
	public final MCBooleanPermColumn aprv_can_flg = createBooleanColumn(_aprv_can_flg);
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	private static final MCPermColumnInfo _can_flg = createColumnInfo("can_flg");
	public final MCBooleanPermColumn can_flg = createBooleanColumn(_can_flg);
	
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
	
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_no_seq_META = createCommonMeta($aprv_no_seq, mcframe.commonMA.meta.MA_META.APRV_NO_SEQ);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta last_aprv_usr_cd_META = createCommonMeta($last_aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta last_aprv_tm_META = createCommonMeta($last_aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta next_opr_flg_META = createCommonMeta($next_opr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ins_dt_META = createCommonMeta($ins_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta biz_usr_cd_META = createCommonMeta($biz_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta src_ins_usr_cd_META = createCommonMeta($src_ins_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_func_typ_META = createCommonMeta($aprv_func_typ, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP);
	public static final MCMeta aprv_rt_ptn_META = createCommonMeta($aprv_rt_ptn, mcframe.commonMA.meta.MA_META.APRV_RT_PTN);
	public static final MCMeta aprv_row_num_META = createCommonMeta($aprv_row_num, mcframe.commonMA.meta.MA_META.APRV_ROW_NUM);
	public static final MCMeta src_itm_cd_META = createCommonMeta($src_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta src_itm_sub1_META = createCommonMeta($src_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta src_itm_sub2_META = createCommonMeta($src_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta src_itm_sub3_META = createCommonMeta($src_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta src_dpt_cd_META = createCommonMeta($src_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta src_bp_cd_META = createCommonMeta($src_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta src_cur_cd1_META = createCommonMeta($src_cur_cd1, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_amt1_META = createCommonMeta($src_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_cur_cd2_META = createCommonMeta($src_cur_cd2, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_amt2_META = createCommonMeta($src_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_cur_cd3_META = createCommonMeta($src_cur_cd3, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_amt3_META = createCommonMeta($src_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_ext_key1_META = createCommonMeta($src_ext_key1, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY1);
	public static final MCMeta src_ext_key2_META = createCommonMeta($src_ext_key2, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY2);
	public static final MCMeta src_ext_key3_META = createCommonMeta($src_ext_key3, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY3);
	public static final MCMeta aprv_src_no1_META = createCommonMeta($aprv_src_no1, mcframe.commonMA.meta.MA_META.APRV_SRC_NO);
	public static final MCMeta aprv_src_no2_META = createCommonMeta($aprv_src_no2, mcframe.commonMA.meta.MA_META.APRV_SRC_NO);
	public static final MCMeta aprv_upd_flg_META = createCommonMeta($aprv_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_can_flg_META = createCommonMeta($aprv_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.APRV_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.APRV_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.APRV_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MBT_APRV_R> constMetas = new ConstMetaList<MBT_APRV_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			aprv_no_META,
			aprv_no_seq_META,
			aprv_sts_typ_META,
			last_aprv_usr_cd_META,
			last_aprv_tm_META,
			next_opr_flg_META,
			ins_dt_META,
			biz_usr_cd_META,
			src_ins_usr_cd_META,
			master_dt_META,
			aprv_func_typ_META,
			aprv_rt_ptn_META,
			aprv_row_num_META,
			src_itm_cd_META,
			src_itm_sub1_META,
			src_itm_sub2_META,
			src_itm_sub3_META,
			src_dpt_cd_META,
			src_bp_cd_META,
			src_cur_cd1_META,
			src_amt1_META,
			src_cur_cd2_META,
			src_amt2_META,
			src_cur_cd3_META,
			src_amt3_META,
			src_ext_key1_META,
			src_ext_key2_META,
			src_ext_key3_META,
			aprv_src_no1_META,
			aprv_src_no2_META,
			aprv_upd_flg_META,
			aprv_can_flg_META,
			can_flg_META,
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
	protected MBT_APRV_R(ConstMetaList<? extends MBT_APRV_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBT_APRV_R(ConstMetaList<? extends MBT_APRV_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBT_APRV_R.$aprv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$aprv_no,
				"aprv_no",
				aprv_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$aprv_no_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_APRV_R.$aprv_no_seq,
				"aprv_no_seq",
				aprv_no_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$aprv_sts_typ,
				"aprv_sts_typ",
				aprv_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$last_aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$last_aprv_usr_cd,
				"last_aprv_usr_cd",
				last_aprv_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$last_aprv_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_APRV_R.$last_aprv_tm,
				"last_aprv_tm",
				last_aprv_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$next_opr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_APRV_R.$next_opr_flg,
				"next_opr_flg",
				next_opr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$ins_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_APRV_R.$ins_dt,
				"ins_dt",
				ins_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$biz_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$biz_usr_cd,
				"biz_usr_cd",
				biz_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_ins_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_ins_usr_cd,
				"src_ins_usr_cd",
				src_ins_usr_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$master_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_APRV_R.$master_dt,
				"master_dt",
				master_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$aprv_func_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$aprv_func_typ,
				"aprv_func_typ",
				aprv_func_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$aprv_rt_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$aprv_rt_ptn,
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
			MBT_APRV_R.$aprv_row_num,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_APRV_R.$aprv_row_num,
				"aprv_row_num",
				aprv_row_num,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_itm_cd,
				"src_itm_cd",
				src_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_itm_sub1,
				"src_itm_sub1",
				src_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_itm_sub2,
				"src_itm_sub2",
				src_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_itm_sub3,
				"src_itm_sub3",
				src_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_dpt_cd,
				"src_dpt_cd",
				src_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_bp_cd,
				"src_bp_cd",
				src_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_cur_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_cur_cd1,
				"src_cur_cd1",
				src_cur_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_APRV_R.$src_amt1,
				"src_amt1",
				src_amt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_cur_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_cur_cd2,
				"src_cur_cd2",
				src_cur_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_APRV_R.$src_amt2,
				"src_amt2",
				src_amt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_cur_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_cur_cd3,
				"src_cur_cd3",
				src_cur_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_APRV_R.$src_amt3,
				"src_amt3",
				src_amt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_ext_key1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_ext_key1,
				"src_ext_key1",
				src_ext_key1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_ext_key2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_ext_key2,
				"src_ext_key2",
				src_ext_key2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$src_ext_key3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$src_ext_key3,
				"src_ext_key3",
				src_ext_key3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$aprv_src_no1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$aprv_src_no1,
				"aprv_src_no1",
				aprv_src_no1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$aprv_src_no2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$aprv_src_no2,
				"aprv_src_no2",
				aprv_src_no2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$aprv_upd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_APRV_R.$aprv_upd_flg,
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
			MBT_APRV_R.$aprv_can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_APRV_R.$aprv_can_flg,
				"aprv_can_flg",
				aprv_can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_APRV_R.$can_flg,
				"can_flg",
				can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_APRV_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$sub_char1,
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
			MBT_APRV_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$sub_char2,
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
			MBT_APRV_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$sub_char3,
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
			MBT_APRV_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$ins_usr_id,
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
			MBT_APRV_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$ins_usr_nm,
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
			MBT_APRV_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_APRV_R.$ins_ts,
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
			MBT_APRV_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$ins_func_id,
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
			MBT_APRV_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_APRV_R.$upd_cntr,
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
			MBT_APRV_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$upd_usr_id,
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
			MBT_APRV_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$upd_usr_nm,
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
			MBT_APRV_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_APRV_R.$upd_ts,
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
			MBT_APRV_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$upd_func_id,
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
			MBT_APRV_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_APRV_R.$upd_srv_req_no,
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
	public static MBT_APRV_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBT_APRV_R create(String alias) {
		MBT_APRV_R row = new MBT_APRV_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBT_APRV_R createByName(T proto) {
		MBT_APRV_R row = MBT_APRV_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_APRV_R clone() {
		return (MBT_APRV_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_APRV_R createInstance() {
		return (MBT_APRV_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_APRV_R getValues(String... names) {
		return (MBT_APRV_R) super.getValues(names);
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
	 public MBW_APRV_KEY_R getPkWorkDbc(String alias) {
	 	return MBW_APRV_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MBW_APRV_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MBW_APRV_KEY_R.TABLE_NAME);
	 }

	/**
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 0, $aprv_no);
	}

	/**
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 0, $aprv_no, value);
	}

	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public MCNumber aprv_no_seq() {
		return getConstNumber(offset + 1, $aprv_no_seq);
	}

	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public void aprv_no_seq(MCNumber value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}
	
	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public void aprv_no_seq(int value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}
	
	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public void aprv_no_seq(long value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}
	
	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public void aprv_no_seq(float value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}
	
	/**
	 * 承認ＮＯ連番. Approval sequence number.<p>
	 *
	 */
	public void aprv_no_seq(double value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}
	
	/**
	 * 承認状況区分. Approval status type.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 2, $aprv_sts_typ);
	}

	/**
	 * 承認状況区分. Approval status type.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 2, $aprv_sts_typ, value);
	}

	/**
	 * 最終承認者ＣＤ. Final approver cd..<p>
	 *
	 */
	public String last_aprv_usr_cd() {
		return getConstString(offset + 3, $last_aprv_usr_cd);
	}

	/**
	 * 最終承認者ＣＤ. Final approver cd..<p>
	 *
	 */
	public void last_aprv_usr_cd(String value) {
		setConstString(offset + 3, $last_aprv_usr_cd, value);
	}

	/**
	 * 最終承認日時. Final approver date and time.<p>
	 *
	 */
	public MCDate last_aprv_tm() {
		return getConstDate(offset + 4, $last_aprv_tm);
	}

	/**
	 * 最終承認日時. Final approver date and time.<p>
	 *
	 */
	public void last_aprv_tm(MCDate value) {
		setConstDate(offset + 4, $last_aprv_tm, value);
	}

	/**
	 * 次処理済ＦＬＧ. Next process completed flg..<p>
	 *
	 */
	public boolean next_opr_flg() {
		return getConstBoolean(offset + 5, $next_opr_flg);
	}

	/**
	 * 次処理済ＦＬＧ. Next process completed flg..<p>
	 *
	 */
	public void next_opr_flg(boolean value) {
		setConstBoolean(offset + 5, $next_opr_flg, value);
	}

	/**
	 * 登録日. Entry date.<p>
	 *
	 */
	public MCDate ins_dt() {
		return getConstDate(offset + 6, $ins_dt);
	}

	/**
	 * 登録日. Entry date.<p>
	 *
	 */
	public void ins_dt(MCDate value) {
		setConstDate(offset + 6, $ins_dt, value);
	}

	/**
	 * 業務担当者ＣＤ. Business PIC cd..<p>
	 *
	 */
	public String biz_usr_cd() {
		return getConstString(offset + 7, $biz_usr_cd);
	}

	/**
	 * 業務担当者ＣＤ. Business PIC cd..<p>
	 *
	 */
	public void biz_usr_cd(String value) {
		setConstString(offset + 7, $biz_usr_cd, value);
	}

	/**
	 * 登録担当者ＣＤ. Entry PIC cd..<p>
	 *
	 */
	public String src_ins_usr_cd() {
		return getConstString(offset + 8, $src_ins_usr_cd);
	}

	/**
	 * 登録担当者ＣＤ. Entry PIC cd..<p>
	 *
	 */
	public void src_ins_usr_cd(String value) {
		setConstString(offset + 8, $src_ins_usr_cd, value);
	}

	/**
	 * 承認マスタ適用日. Approval master application date.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 9, $master_dt);
	}

	/**
	 * 承認マスタ適用日. Approval master application date.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 9, $master_dt, value);
	}

	/**
	 * 承認機能区分. Approval function type.<p>
	 *
	 */
	public String aprv_func_typ() {
		return getConstString(offset + 10, $aprv_func_typ);
	}

	/**
	 * 承認機能区分. Approval function type.<p>
	 *
	 */
	public void aprv_func_typ(String value) {
		setConstString(offset + 10, $aprv_func_typ, value);
	}

	/**
	 * 承認ルートパタン. Approval route pattern.<p>
	 *
	 */
	public String aprv_rt_ptn() {
		return getConstString(offset + 11, $aprv_rt_ptn);
	}

	/**
	 * 承認ルートパタン. Approval route pattern.<p>
	 *
	 */
	public void aprv_rt_ptn(String value) {
		setConstString(offset + 11, $aprv_rt_ptn, value);
	}

	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public MCNumber aprv_row_num() {
		return getConstNumber(offset + 12, $aprv_row_num);
	}

	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public void aprv_row_num(MCNumber value) {
		setConstNumber(offset + 12, $aprv_row_num, value);
	}
	
	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public void aprv_row_num(int value) {
		setConstNumber(offset + 12, $aprv_row_num, value);
	}
	
	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public void aprv_row_num(long value) {
		setConstNumber(offset + 12, $aprv_row_num, value);
	}
	
	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public void aprv_row_num(float value) {
		setConstNumber(offset + 12, $aprv_row_num, value);
	}
	
	/**
	 * 承認行番号. Approver row number.<p>
	 *
	 */
	public void aprv_row_num(double value) {
		setConstNumber(offset + 12, $aprv_row_num, value);
	}
	
	/**
	 * 承認作成元品目ＣＤ. Approval creating source item cd..<p>
	 *
	 */
	public String src_itm_cd() {
		return getConstString(offset + 13, $src_itm_cd);
	}

	/**
	 * 承認作成元品目ＣＤ. Approval creating source item cd..<p>
	 *
	 */
	public void src_itm_cd(String value) {
		setConstString(offset + 13, $src_itm_cd, value);
	}

	/**
	 * 承認作成元枝番１. Approval creating source branch No. 1.<p>
	 *
	 */
	public String src_itm_sub1() {
		return getConstString(offset + 14, $src_itm_sub1);
	}

	/**
	 * 承認作成元枝番１. Approval creating source branch No. 1.<p>
	 *
	 */
	public void src_itm_sub1(String value) {
		setConstString(offset + 14, $src_itm_sub1, value);
	}

	/**
	 * 承認作成元枝番２. Approval creating source branch No. 2.<p>
	 *
	 */
	public String src_itm_sub2() {
		return getConstString(offset + 15, $src_itm_sub2);
	}

	/**
	 * 承認作成元枝番２. Approval creating source branch No. 2.<p>
	 *
	 */
	public void src_itm_sub2(String value) {
		setConstString(offset + 15, $src_itm_sub2, value);
	}

	/**
	 * 承認作成元枝番３. Approval creating source branch No. 3.<p>
	 *
	 */
	public String src_itm_sub3() {
		return getConstString(offset + 16, $src_itm_sub3);
	}

	/**
	 * 承認作成元枝番３. Approval creating source branch No. 3.<p>
	 *
	 */
	public void src_itm_sub3(String value) {
		setConstString(offset + 16, $src_itm_sub3, value);
	}

	/**
	 * 承認作成元部門ＣＤ. Approval creating source dept. cd..<p>
	 *
	 */
	public String src_dpt_cd() {
		return getConstString(offset + 17, $src_dpt_cd);
	}

	/**
	 * 承認作成元部門ＣＤ. Approval creating source dept. cd..<p>
	 *
	 */
	public void src_dpt_cd(String value) {
		setConstString(offset + 17, $src_dpt_cd, value);
	}

	/**
	 * 承認作成元取引先ＣＤ. Approval creating source customer cd..<p>
	 *
	 */
	public String src_bp_cd() {
		return getConstString(offset + 18, $src_bp_cd);
	}

	/**
	 * 承認作成元取引先ＣＤ. Approval creating source customer cd..<p>
	 *
	 */
	public void src_bp_cd(String value) {
		setConstString(offset + 18, $src_bp_cd, value);
	}

	/**
	 * 承認作成元通貨ＣＤ１. Approval creating source base currency cd. 1.<p>
	 *
	 */
	public String src_cur_cd1() {
		return getConstString(offset + 19, $src_cur_cd1);
	}

	/**
	 * 承認作成元通貨ＣＤ１. Approval creating source base currency cd. 1.<p>
	 *
	 */
	public void src_cur_cd1(String value) {
		setConstString(offset + 19, $src_cur_cd1, value);
	}

	/**
	 * 承認作成元金額１. Approval creating source amount 1.<p>
	 *
	 */
	public MCNumber src_amt1() {
		return getConstNumber(offset + 20, $src_amt1);
	}

	/**
	 * 承認作成元金額１. Approval creating source amount 1.<p>
	 *
	 */
	public void src_amt1(MCNumber value) {
		setConstNumber(offset + 20, $src_amt1, value);
	}
	
	/**
	 * 承認作成元金額１. Approval creating source amount 1.<p>
	 *
	 */
	public void src_amt1(int value) {
		setConstNumber(offset + 20, $src_amt1, value);
	}
	
	/**
	 * 承認作成元金額１. Approval creating source amount 1.<p>
	 *
	 */
	public void src_amt1(long value) {
		setConstNumber(offset + 20, $src_amt1, value);
	}
	
	/**
	 * 承認作成元金額１. Approval creating source amount 1.<p>
	 *
	 */
	public void src_amt1(float value) {
		setConstNumber(offset + 20, $src_amt1, value);
	}
	
	/**
	 * 承認作成元金額１. Approval creating source amount 1.<p>
	 *
	 */
	public void src_amt1(double value) {
		setConstNumber(offset + 20, $src_amt1, value);
	}
	
	/**
	 * 承認作成元通貨ＣＤ２. Approval creating source base currency cd. 2.<p>
	 *
	 */
	public String src_cur_cd2() {
		return getConstString(offset + 21, $src_cur_cd2);
	}

	/**
	 * 承認作成元通貨ＣＤ２. Approval creating source base currency cd. 2.<p>
	 *
	 */
	public void src_cur_cd2(String value) {
		setConstString(offset + 21, $src_cur_cd2, value);
	}

	/**
	 * 承認作成元金額２. Approval creating source amount 2.<p>
	 *
	 */
	public MCNumber src_amt2() {
		return getConstNumber(offset + 22, $src_amt2);
	}

	/**
	 * 承認作成元金額２. Approval creating source amount 2.<p>
	 *
	 */
	public void src_amt2(MCNumber value) {
		setConstNumber(offset + 22, $src_amt2, value);
	}
	
	/**
	 * 承認作成元金額２. Approval creating source amount 2.<p>
	 *
	 */
	public void src_amt2(int value) {
		setConstNumber(offset + 22, $src_amt2, value);
	}
	
	/**
	 * 承認作成元金額２. Approval creating source amount 2.<p>
	 *
	 */
	public void src_amt2(long value) {
		setConstNumber(offset + 22, $src_amt2, value);
	}
	
	/**
	 * 承認作成元金額２. Approval creating source amount 2.<p>
	 *
	 */
	public void src_amt2(float value) {
		setConstNumber(offset + 22, $src_amt2, value);
	}
	
	/**
	 * 承認作成元金額２. Approval creating source amount 2.<p>
	 *
	 */
	public void src_amt2(double value) {
		setConstNumber(offset + 22, $src_amt2, value);
	}
	
	/**
	 * 承認作成元通貨ＣＤ３. Approval creating source base currency cd. 3.<p>
	 *
	 */
	public String src_cur_cd3() {
		return getConstString(offset + 23, $src_cur_cd3);
	}

	/**
	 * 承認作成元通貨ＣＤ３. Approval creating source base currency cd. 3.<p>
	 *
	 */
	public void src_cur_cd3(String value) {
		setConstString(offset + 23, $src_cur_cd3, value);
	}

	/**
	 * 承認作成元金額３. Approval created-from amount 3.<p>
	 *
	 */
	public MCNumber src_amt3() {
		return getConstNumber(offset + 24, $src_amt3);
	}

	/**
	 * 承認作成元金額３. Approval created-from amount 3.<p>
	 *
	 */
	public void src_amt3(MCNumber value) {
		setConstNumber(offset + 24, $src_amt3, value);
	}
	
	/**
	 * 承認作成元金額３. Approval created-from amount 3.<p>
	 *
	 */
	public void src_amt3(int value) {
		setConstNumber(offset + 24, $src_amt3, value);
	}
	
	/**
	 * 承認作成元金額３. Approval created-from amount 3.<p>
	 *
	 */
	public void src_amt3(long value) {
		setConstNumber(offset + 24, $src_amt3, value);
	}
	
	/**
	 * 承認作成元金額３. Approval created-from amount 3.<p>
	 *
	 */
	public void src_amt3(float value) {
		setConstNumber(offset + 24, $src_amt3, value);
	}
	
	/**
	 * 承認作成元金額３. Approval created-from amount 3.<p>
	 *
	 */
	public void src_amt3(double value) {
		setConstNumber(offset + 24, $src_amt3, value);
	}
	
	/**
	 * 承認作成元拡張項目１. Approval creating source extended column 1.<p>
	 *
	 */
	public String src_ext_key1() {
		return getConstString(offset + 25, $src_ext_key1);
	}

	/**
	 * 承認作成元拡張項目１. Approval creating source extended column 1.<p>
	 *
	 */
	public void src_ext_key1(String value) {
		setConstString(offset + 25, $src_ext_key1, value);
	}

	/**
	 * 承認作成元拡張項目２. Approval creating source extended column 2.<p>
	 *
	 */
	public String src_ext_key2() {
		return getConstString(offset + 26, $src_ext_key2);
	}

	/**
	 * 承認作成元拡張項目２. Approval creating source extended column 2.<p>
	 *
	 */
	public void src_ext_key2(String value) {
		setConstString(offset + 26, $src_ext_key2, value);
	}

	/**
	 * 承認作成元拡張項目３. Approval created-from expanded column 3.<p>
	 *
	 */
	public String src_ext_key3() {
		return getConstString(offset + 27, $src_ext_key3);
	}

	/**
	 * 承認作成元拡張項目３. Approval created-from expanded column 3.<p>
	 *
	 */
	public void src_ext_key3(String value) {
		setConstString(offset + 27, $src_ext_key3, value);
	}

	/**
	 * 承認作成元ＮＯ１. Approval creating source No. 1.<p>
	 *
	 */
	public String aprv_src_no1() {
		return getConstString(offset + 28, $aprv_src_no1);
	}

	/**
	 * 承認作成元ＮＯ１. Approval creating source No. 1.<p>
	 *
	 */
	public void aprv_src_no1(String value) {
		setConstString(offset + 28, $aprv_src_no1, value);
	}

	/**
	 * 承認作成元ＮＯ２. Approval creating source No. 2.<p>
	 *
	 */
	public String aprv_src_no2() {
		return getConstString(offset + 29, $aprv_src_no2);
	}

	/**
	 * 承認作成元ＮＯ２. Approval creating source No. 2.<p>
	 *
	 */
	public void aprv_src_no2(String value) {
		setConstString(offset + 29, $aprv_src_no2, value);
	}

	/**
	 * 更新可能ＦＬＧ. Updatable flg..<p>
	 *
	 */
	public boolean aprv_upd_flg() {
		return getConstBoolean(offset + 30, $aprv_upd_flg);
	}

	/**
	 * 更新可能ＦＬＧ. Updatable flg..<p>
	 *
	 */
	public void aprv_upd_flg(boolean value) {
		setConstBoolean(offset + 30, $aprv_upd_flg, value);
	}

	/**
	 * 取消可能ＦＬＧ. Cancelable flg..<p>
	 *
	 */
	public boolean aprv_can_flg() {
		return getConstBoolean(offset + 31, $aprv_can_flg);
	}

	/**
	 * 取消可能ＦＬＧ. Cancelable flg..<p>
	 *
	 */
	public void aprv_can_flg(boolean value) {
		setConstBoolean(offset + 31, $aprv_can_flg, value);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 32, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 32, $can_flg, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 33, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 33, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 34, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 34, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 35, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 35, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 36, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 36, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 37, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 37, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 38, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 38, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 39, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 39, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 40, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 41, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 41, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 42, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 42, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 43, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 43, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 44, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 44, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 45, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 45, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			return last_aprv_usr_cd();
		}
		if ($biz_usr_cd.equalsIgnoreCase(name)) {
			return biz_usr_cd();
		}
		if ($src_ins_usr_cd.equalsIgnoreCase(name)) {
			return src_ins_usr_cd();
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			return aprv_rt_ptn();
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			return src_itm_cd();
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			return src_itm_sub1();
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			return src_itm_sub2();
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			return src_itm_sub3();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			return src_bp_cd();
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			return src_cur_cd1();
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			return src_cur_cd2();
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			return src_cur_cd3();
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			return src_ext_key1();
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			return src_ext_key2();
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			return src_ext_key3();
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			return aprv_src_no1();
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			return aprv_src_no2();
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
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			return aprv_no_seq();
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			return aprv_row_num();
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			return src_amt1();
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			return src_amt2();
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			return src_amt3();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			return last_aprv_tm();
		}
		if ($ins_dt.equalsIgnoreCase(name)) {
			return ins_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
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
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			return next_opr_flg();
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			return last_aprv_usr_cd();
		}
		if ($biz_usr_cd.equalsIgnoreCase(name)) {
			return biz_usr_cd();
		}
		if ($src_ins_usr_cd.equalsIgnoreCase(name)) {
			return src_ins_usr_cd();
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			return aprv_rt_ptn();
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			return src_itm_cd();
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			return src_itm_sub1();
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			return src_itm_sub2();
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			return src_itm_sub3();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			return src_bp_cd();
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			return src_cur_cd1();
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			return src_cur_cd2();
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			return src_cur_cd3();
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			return src_ext_key1();
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			return src_ext_key2();
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			return src_ext_key3();
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			return aprv_src_no1();
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			return aprv_src_no2();
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
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			return aprv_no_seq();
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			return aprv_row_num();
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			return src_amt1();
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			return src_amt2();
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			return src_amt3();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			return last_aprv_tm();
		}
		if ($ins_dt.equalsIgnoreCase(name)) {
			return ins_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
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
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			return next_opr_flg();
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			last_aprv_usr_cd(value);
			return;
		}
		if ($biz_usr_cd.equalsIgnoreCase(name)) {
			biz_usr_cd(value);
			return;
		}
		if ($src_ins_usr_cd.equalsIgnoreCase(name)) {
			src_ins_usr_cd(value);
			return;
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			aprv_rt_ptn(value);
			return;
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			src_itm_cd(value);
			return;
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			src_itm_sub1(value);
			return;
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			src_itm_sub2(value);
			return;
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			src_itm_sub3(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			src_bp_cd(value);
			return;
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			src_cur_cd1(value);
			return;
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			src_cur_cd2(value);
			return;
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			src_cur_cd3(value);
			return;
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			src_ext_key1(value);
			return;
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			src_ext_key2(value);
			return;
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			src_ext_key3(value);
			return;
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			aprv_src_no1(value);
			return;
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			aprv_src_no2(value);
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
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			last_aprv_tm(value);
			return;
		}
		if ($ins_dt.equalsIgnoreCase(name)) {
			ins_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
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
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			next_opr_flg(value);
			return;
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			aprv_can_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			last_aprv_usr_cd(value);
			return;
		}
		if ($biz_usr_cd.equalsIgnoreCase(name)) {
			biz_usr_cd(value);
			return;
		}
		if ($src_ins_usr_cd.equalsIgnoreCase(name)) {
			src_ins_usr_cd(value);
			return;
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			aprv_rt_ptn(value);
			return;
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			src_itm_cd(value);
			return;
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			src_itm_sub1(value);
			return;
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			src_itm_sub2(value);
			return;
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			src_itm_sub3(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			src_bp_cd(value);
			return;
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			src_cur_cd1(value);
			return;
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			src_cur_cd2(value);
			return;
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			src_cur_cd3(value);
			return;
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			src_ext_key1(value);
			return;
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			src_ext_key2(value);
			return;
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			src_ext_key3(value);
			return;
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			aprv_src_no1(value);
			return;
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			aprv_src_no2(value);
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
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			last_aprv_tm(value);
			return;
		}
		if ($ins_dt.equalsIgnoreCase(name)) {
			ins_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
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
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			next_opr_flg(value);
			return;
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			aprv_can_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
