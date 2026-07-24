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
 * "品目検査規格マスタ // Item inspection specific master"DBコンテナRowクラスです。<p>
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
 *  	<td>insp_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査パタンＣＤ</td>
 *  	<td>Inspection pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>insp_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査順序</td>
 *  	<td>Inspection sequence</td>
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
 *  	<td>insp_point_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査項目ＣＤ</td>
 *  	<td>Inspection checkpoint cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_insp_inf_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>先行検査引継区分</td>
 *  	<td>Prior inspection copy type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_qlqn_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>定性定量区分</td>
 *  	<td>Qualitative/quantitative type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ql_std_val</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>定性規格値</td>
 *  	<td>Qualitative specific value</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位ＣＤ</td>
 *  	<td>Unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qn_int_digit</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>定量値整数部桁数</td>
 *  	<td>Quantitative integer digits</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qn_int_frac</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>定量値小数部桁数</td>
 *  	<td>Quantitative decimal digits</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qn_out_min</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外規格下限値</td>
 *  	<td>Lower limit of external specification</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sign_out_min_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外規格下限符号区分</td>
 *  	<td>Sign type (Lower limit of external specification)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sign_out_max_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外規格上限符号区分</td>
 *  	<td>Sign type (Upper limit of external specification)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qn_out_max</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外規格上限値</td>
 *  	<td>Upper limit of external specification</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qn_in_min</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内規格下限値</td>
 *  	<td>Lower limit of internal specification</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sign_in_min_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内規格下限符号区分</td>
 *  	<td>Sign type (Lower limit of internal specification)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sign_in_max_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内規格上限符号区分</td>
 *  	<td>Sign type (Upper limit of internal specification)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qn_in_max</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内規格上限値</td>
 *  	<td>Upper limit of internal specification</td>
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
 *  	<td>insp_ptn_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>INSP_PTN1.INSP_PTN_NM</td>
 *  	<td>検査パタン名</td>
 *  	<td>Inspection pattern name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_point_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>INSP_POINT1.INSP_POINT_NM</td>
 *  	<td>検査項目名</td>
 *  	<td>Inspection checkpoint name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>UNIT1.UNIT_NM</td>
 *  	<td>単位名</td>
 *  	<td>Unit name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_INSP_SPEC_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_INSP_SPEC";

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
	 * 検査パタンＣＤ. Inspection pattern cd..<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	private static final MCPermColumnInfo _insp_ptn_cd = createColumnInfo("insp_ptn_cd");
	public final MCStringPermColumn insp_ptn_cd = createStringColumn(_insp_ptn_cd);
	
	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public static final String $insp_seq = "insp_seq";
	private static final MCPermColumnInfo _insp_seq = createColumnInfo("insp_seq");
	public final MCNumberPermColumn insp_seq = createNumberColumn(_insp_seq);
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	private static final MCPermColumnInfo _st_dt = createColumnInfo("st_dt");
	public final MCDatePermColumn st_dt = createDateColumn(_st_dt);
	
	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	private static final MCPermColumnInfo _end_dt = createColumnInfo("end_dt");
	public final MCDatePermColumn end_dt = createDateColumn(_end_dt);
	
	/**
	 * 検査項目ＣＤ. Inspection checkpoint cd..<p>
	 *
	 */
	public static final String $insp_point_cd = "insp_point_cd";
	private static final MCPermColumnInfo _insp_point_cd = createColumnInfo("insp_point_cd");
	public final MCStringPermColumn insp_point_cd = createStringColumn(_insp_point_cd);
	
	/**
	 * 先行検査引継区分. Prior inspection copy type.<p>
	 *
	 */
	public static final String $pre_insp_inf_typ = "pre_insp_inf_typ";
	private static final MCPermColumnInfo _pre_insp_inf_typ = createColumnInfo("pre_insp_inf_typ");
	public final MCStringPermColumn pre_insp_inf_typ = createStringColumn(_pre_insp_inf_typ);
	
	/**
	 * 定性定量区分. Qualitative/quantitative type.<p>
	 *
	 */
	public static final String $insp_qlqn_typ = "insp_qlqn_typ";
	private static final MCPermColumnInfo _insp_qlqn_typ = createColumnInfo("insp_qlqn_typ");
	public final MCStringPermColumn insp_qlqn_typ = createStringColumn(_insp_qlqn_typ);
	
	/**
	 * 定性規格値. Qualitative specific value.<p>
	 *
	 */
	public static final String $ql_std_val = "ql_std_val";
	private static final MCPermColumnInfo _ql_std_val = createColumnInfo("ql_std_val");
	public final MCStringPermColumn ql_std_val = createStringColumn(_ql_std_val);
	
	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	private static final MCPermColumnInfo _unit_cd = createColumnInfo("unit_cd");
	public final MCStringPermColumn unit_cd = createStringColumn(_unit_cd);
	
	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public static final String $qn_int_digit = "qn_int_digit";
	private static final MCPermColumnInfo _qn_int_digit = createColumnInfo("qn_int_digit");
	public final MCNumberPermColumn qn_int_digit = createNumberColumn(_qn_int_digit);
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public static final String $qn_int_frac = "qn_int_frac";
	private static final MCPermColumnInfo _qn_int_frac = createColumnInfo("qn_int_frac");
	public final MCNumberPermColumn qn_int_frac = createNumberColumn(_qn_int_frac);
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public static final String $qn_out_min = "qn_out_min";
	private static final MCPermColumnInfo _qn_out_min = createColumnInfo("qn_out_min");
	public final MCNumberPermColumn qn_out_min = createNumberColumn(_qn_out_min);
	
	/**
	 * 外規格下限符号区分. Sign type (Lower limit of external specification).<p>
	 *
	 */
	public static final String $sign_out_min_typ = "sign_out_min_typ";
	private static final MCPermColumnInfo _sign_out_min_typ = createColumnInfo("sign_out_min_typ");
	public final MCStringPermColumn sign_out_min_typ = createStringColumn(_sign_out_min_typ);
	
	/**
	 * 外規格上限符号区分. Sign type (Upper limit of external specification).<p>
	 *
	 */
	public static final String $sign_out_max_typ = "sign_out_max_typ";
	private static final MCPermColumnInfo _sign_out_max_typ = createColumnInfo("sign_out_max_typ");
	public final MCStringPermColumn sign_out_max_typ = createStringColumn(_sign_out_max_typ);
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public static final String $qn_out_max = "qn_out_max";
	private static final MCPermColumnInfo _qn_out_max = createColumnInfo("qn_out_max");
	public final MCNumberPermColumn qn_out_max = createNumberColumn(_qn_out_max);
	
	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public static final String $qn_in_min = "qn_in_min";
	private static final MCPermColumnInfo _qn_in_min = createColumnInfo("qn_in_min");
	public final MCNumberPermColumn qn_in_min = createNumberColumn(_qn_in_min);
	
	/**
	 * 内規格下限符号区分. Sign type (Lower limit of internal specification).<p>
	 *
	 */
	public static final String $sign_in_min_typ = "sign_in_min_typ";
	private static final MCPermColumnInfo _sign_in_min_typ = createColumnInfo("sign_in_min_typ");
	public final MCStringPermColumn sign_in_min_typ = createStringColumn(_sign_in_min_typ);
	
	/**
	 * 内規格上限符号区分. Sign type (Upper limit of internal specification).<p>
	 *
	 */
	public static final String $sign_in_max_typ = "sign_in_max_typ";
	private static final MCPermColumnInfo _sign_in_max_typ = createColumnInfo("sign_in_max_typ");
	public final MCStringPermColumn sign_in_max_typ = createStringColumn(_sign_in_max_typ);
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public static final String $qn_in_max = "qn_in_max";
	private static final MCPermColumnInfo _qn_in_max = createColumnInfo("qn_in_max");
	public final MCNumberPermColumn qn_in_max = createNumberColumn(_qn_in_max);
	
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
	 * 検査パタン名. Inspection pattern name.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	
	/**
	 * 検査項目名. Inspection checkpoint name.<p>
	 *
	 */
	public static final String $insp_point_nm = "insp_point_nm";
	
	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta insp_seq_META = createCommonMeta($insp_seq, mcframe.commonMA.meta.MA_META.INSP_SEQ);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_point_cd_META = createCommonMeta($insp_point_cd, mcframe.commonMA.meta.MA_META.INSP_POINT_CD);
	public static final MCMeta pre_insp_inf_typ_META = createCommonMeta($pre_insp_inf_typ, mcframe.commonMA.meta.MA_META.PRE_INSP_INF_TYP);
	public static final MCMeta insp_qlqn_typ_META = createCommonMeta($insp_qlqn_typ, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP);
	public static final MCMeta ql_std_val_META = createCommonMeta($ql_std_val, mcframe.commonMA.meta.MA_META.QL_STD_VAL);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta qn_int_digit_META = createCommonMeta($qn_int_digit, mcframe.commonMA.meta.MA_META.INT_DIGIT);
	public static final MCMeta qn_int_frac_META = createCommonMeta($qn_int_frac, mcframe.commonMA.meta.MA_META.INT_DIGIT);
	public static final MCMeta qn_out_min_META = createCommonMeta($qn_out_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_out_min_typ_META = createCommonMeta($sign_out_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_out_max_typ_META = createCommonMeta($sign_out_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta qn_out_max_META = createCommonMeta($qn_out_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta qn_in_min_META = createCommonMeta($qn_in_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_in_min_typ_META = createCommonMeta($sign_in_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_max_typ_META = createCommonMeta($sign_in_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta qn_in_max_META = createCommonMeta($qn_in_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
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
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta insp_point_nm_META = createCommonMeta($insp_point_nm, mcframe.commonMA.meta.MA_META.INSP_POINT_NM);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $INSP_PTN1 = "INSP_PTN1";
	public static final String $INSP_POINT1 = "INSP_POINT1";
	public static final String $UNIT1 = "UNIT1";
	public static final String $ITM1 = "ITM1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_INSP_PTN",
				$INSP_PTN1,
				new String[][]{
						{"insp_ptn_cd", "insp_ptn_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_INSP_PTN_R.create("INSP_PTN1");
				},
				(alias) -> {
					MAM_INSP_SPEC_R own = MAM_INSP_SPEC_R.create(alias);
					mcframe.serverMA.dbc.MAM_INSP_PTN_R ref = mcframe.serverMA.dbc.MAM_INSP_PTN_R.create("INSP_PTN1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.insp_ptn_cd.eq(ref.insp_ptn_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_INSP_POINT",
				$INSP_POINT1,
				new String[][]{
						{"insp_point_cd", "insp_point_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_INSP_POINT_R.create("INSP_POINT1");
				},
				(alias) -> {
					MAM_INSP_SPEC_R own = MAM_INSP_SPEC_R.create(alias);
					mcframe.serverMA.dbc.MAM_INSP_POINT_R ref = mcframe.serverMA.dbc.MAM_INSP_POINT_R.create("INSP_POINT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.insp_point_cd.eq(ref.insp_point_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT",
				$UNIT1,
				new String[][]{
						{"unit_cd", "unit_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT1");
				},
				(alias) -> {
					MAM_INSP_SPEC_R own = MAM_INSP_SPEC_R.create(alias);
					mcframe.serverMA.dbc.MAM_UNIT_R ref = mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.unit_cd.eq(ref.unit_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM1,
				new String[][]{
						{"itm_cd", "itm_cd"},
						{"itm_sub1", "itm_sub1"},
						{"itm_sub2", "itm_sub2"},
						{"itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
				},
				(alias) -> {
					MAM_INSP_SPEC_R own = MAM_INSP_SPEC_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_INSP_SPEC_R> constMetas = new ConstMetaList<MAM_INSP_SPEC_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			insp_ptn_cd_META,
			insp_seq_META,
			st_dt_META,
			end_dt_META,
			insp_point_cd_META,
			pre_insp_inf_typ_META,
			insp_qlqn_typ_META,
			ql_std_val_META,
			unit_cd_META,
			qn_int_digit_META,
			qn_int_frac_META,
			qn_out_min_META,
			sign_out_min_typ_META,
			sign_out_max_typ_META,
			qn_out_max_META,
			qn_in_min_META,
			sign_in_min_typ_META,
			sign_in_max_typ_META,
			qn_in_max_META,
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
			insp_ptn_nm_META,
			insp_point_nm_META,
			unit_nm_META,
			itm_nm_META
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
	protected MAM_INSP_SPEC_R(ConstMetaList<? extends MAM_INSP_SPEC_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_INSP_SPEC_R(ConstMetaList<? extends MAM_INSP_SPEC_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$itm_cd,
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
			MAM_INSP_SPEC_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$itm_sub1,
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
			MAM_INSP_SPEC_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$itm_sub2,
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
			MAM_INSP_SPEC_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$itm_sub3,
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
			MAM_INSP_SPEC_R.$insp_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$insp_ptn_cd,
				"insp_ptn_cd",
				insp_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$insp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_INSP_SPEC_R.$insp_seq,
				"insp_seq",
				insp_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_INSP_SPEC_R.$st_dt,
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
			MAM_INSP_SPEC_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_INSP_SPEC_R.$end_dt,
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
			MAM_INSP_SPEC_R.$insp_point_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$insp_point_cd,
				"insp_point_cd",
				insp_point_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$pre_insp_inf_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$pre_insp_inf_typ,
				"pre_insp_inf_typ",
				pre_insp_inf_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$insp_qlqn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$insp_qlqn_typ,
				"insp_qlqn_typ",
				insp_qlqn_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$ql_std_val,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$ql_std_val,
				"ql_std_val",
				ql_std_val,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$unit_cd,
				"unit_cd",
				unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$qn_int_digit,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_INSP_SPEC_R.$qn_int_digit,
				"qn_int_digit",
				qn_int_digit,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$qn_int_frac,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_INSP_SPEC_R.$qn_int_frac,
				"qn_int_frac",
				qn_int_frac,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$qn_out_min,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_INSP_SPEC_R.$qn_out_min,
				"qn_out_min",
				qn_out_min,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$sign_out_min_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$sign_out_min_typ,
				"sign_out_min_typ",
				sign_out_min_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$sign_out_max_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$sign_out_max_typ,
				"sign_out_max_typ",
				sign_out_max_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$qn_out_max,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_INSP_SPEC_R.$qn_out_max,
				"qn_out_max",
				qn_out_max,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$qn_in_min,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_INSP_SPEC_R.$qn_in_min,
				"qn_in_min",
				qn_in_min,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$sign_in_min_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$sign_in_min_typ,
				"sign_in_min_typ",
				sign_in_min_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$sign_in_max_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$sign_in_max_typ,
				"sign_in_max_typ",
				sign_in_max_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$qn_in_max,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_INSP_SPEC_R.$qn_in_max,
				"qn_in_max",
				qn_in_max,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$memo1,
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
			MAM_INSP_SPEC_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$memo2,
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
			MAM_INSP_SPEC_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$memo3,
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
			MAM_INSP_SPEC_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_INSP_SPEC_R.$del_flg,
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
			MAM_INSP_SPEC_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$del_usr_id,
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
			MAM_INSP_SPEC_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$del_usr_nm,
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
			MAM_INSP_SPEC_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_INSP_SPEC_R.$del_ts,
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
			MAM_INSP_SPEC_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$ins_usr_id,
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
			MAM_INSP_SPEC_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$ins_usr_nm,
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
			MAM_INSP_SPEC_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_INSP_SPEC_R.$ins_ts,
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
			MAM_INSP_SPEC_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$ins_func_id,
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
			MAM_INSP_SPEC_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_INSP_SPEC_R.$upd_cntr,
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
			MAM_INSP_SPEC_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$upd_usr_id,
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
			MAM_INSP_SPEC_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$upd_usr_nm,
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
			MAM_INSP_SPEC_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_INSP_SPEC_R.$upd_ts,
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
			MAM_INSP_SPEC_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$upd_func_id,
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
			MAM_INSP_SPEC_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$upd_srv_req_no,
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
			MAM_INSP_SPEC_R.$insp_ptn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$insp_ptn_nm,
				"insp_ptn_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"INSP_PTN1.INSP_PTN_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$insp_point_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$insp_point_nm,
				"insp_point_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"INSP_POINT1.INSP_POINT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_INSP_SPEC_R.$unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$unit_nm,
				"unit_nm",
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
			MAM_INSP_SPEC_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_INSP_SPEC_R.$itm_nm,
				"itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM1.ITM_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_INSP_SPEC_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_INSP_SPEC_R create(String alias) {
		MAM_INSP_SPEC_R row = new MAM_INSP_SPEC_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_INSP_SPEC_R createByName(T proto) {
		MAM_INSP_SPEC_R row = MAM_INSP_SPEC_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_INSP_SPEC_R clone() {
		return (MAM_INSP_SPEC_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_INSP_SPEC_R createInstance() {
		return (MAM_INSP_SPEC_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_INSP_SPEC_R getValues(String... names) {
		return (MAM_INSP_SPEC_R) super.getValues(names);
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
	 public MAW_INSP_SPEC_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_INSP_SPEC_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_INSP_SPEC_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_INSP_SPEC_KEY_R.TABLE_NAME);
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
	 * 検査パタンＣＤ. Inspection pattern cd..<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 4, $insp_ptn_cd);
	}

	/**
	 * 検査パタンＣＤ. Inspection pattern cd..<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 4, $insp_ptn_cd, value);
	}

	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public MCNumber insp_seq() {
		return getConstNumber(offset + 5, $insp_seq);
	}

	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public void insp_seq(MCNumber value) {
		setConstNumber(offset + 5, $insp_seq, value);
	}
	
	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public void insp_seq(int value) {
		setConstNumber(offset + 5, $insp_seq, value);
	}
	
	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public void insp_seq(long value) {
		setConstNumber(offset + 5, $insp_seq, value);
	}
	
	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public void insp_seq(float value) {
		setConstNumber(offset + 5, $insp_seq, value);
	}
	
	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public void insp_seq(double value) {
		setConstNumber(offset + 5, $insp_seq, value);
	}
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 6, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 6, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 7, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 7, $end_dt, value);
	}

	/**
	 * 検査項目ＣＤ. Inspection checkpoint cd..<p>
	 *
	 */
	public String insp_point_cd() {
		return getConstString(offset + 8, $insp_point_cd);
	}

	/**
	 * 検査項目ＣＤ. Inspection checkpoint cd..<p>
	 *
	 */
	public void insp_point_cd(String value) {
		setConstString(offset + 8, $insp_point_cd, value);
	}

	/**
	 * 先行検査引継区分. Prior inspection copy type.<p>
	 *
	 */
	public String pre_insp_inf_typ() {
		return getConstString(offset + 9, $pre_insp_inf_typ);
	}

	/**
	 * 先行検査引継区分. Prior inspection copy type.<p>
	 *
	 */
	public void pre_insp_inf_typ(String value) {
		setConstString(offset + 9, $pre_insp_inf_typ, value);
	}

	/**
	 * 定性定量区分. Qualitative/quantitative type.<p>
	 *
	 */
	public String insp_qlqn_typ() {
		return getConstString(offset + 10, $insp_qlqn_typ);
	}

	/**
	 * 定性定量区分. Qualitative/quantitative type.<p>
	 *
	 */
	public void insp_qlqn_typ(String value) {
		setConstString(offset + 10, $insp_qlqn_typ, value);
	}

	/**
	 * 定性規格値. Qualitative specific value.<p>
	 *
	 */
	public String ql_std_val() {
		return getConstString(offset + 11, $ql_std_val);
	}

	/**
	 * 定性規格値. Qualitative specific value.<p>
	 *
	 */
	public void ql_std_val(String value) {
		setConstString(offset + 11, $ql_std_val, value);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 12, $unit_cd);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 12, $unit_cd, value);
	}

	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public MCNumber qn_int_digit() {
		return getConstNumber(offset + 13, $qn_int_digit);
	}

	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public void qn_int_digit(MCNumber value) {
		setConstNumber(offset + 13, $qn_int_digit, value);
	}
	
	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public void qn_int_digit(int value) {
		setConstNumber(offset + 13, $qn_int_digit, value);
	}
	
	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public void qn_int_digit(long value) {
		setConstNumber(offset + 13, $qn_int_digit, value);
	}
	
	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public void qn_int_digit(float value) {
		setConstNumber(offset + 13, $qn_int_digit, value);
	}
	
	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public void qn_int_digit(double value) {
		setConstNumber(offset + 13, $qn_int_digit, value);
	}
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public MCNumber qn_int_frac() {
		return getConstNumber(offset + 14, $qn_int_frac);
	}

	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public void qn_int_frac(MCNumber value) {
		setConstNumber(offset + 14, $qn_int_frac, value);
	}
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public void qn_int_frac(int value) {
		setConstNumber(offset + 14, $qn_int_frac, value);
	}
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public void qn_int_frac(long value) {
		setConstNumber(offset + 14, $qn_int_frac, value);
	}
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public void qn_int_frac(float value) {
		setConstNumber(offset + 14, $qn_int_frac, value);
	}
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public void qn_int_frac(double value) {
		setConstNumber(offset + 14, $qn_int_frac, value);
	}
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public MCNumber qn_out_min() {
		return getConstNumber(offset + 15, $qn_out_min);
	}

	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public void qn_out_min(MCNumber value) {
		setConstNumber(offset + 15, $qn_out_min, value);
	}
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public void qn_out_min(int value) {
		setConstNumber(offset + 15, $qn_out_min, value);
	}
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public void qn_out_min(long value) {
		setConstNumber(offset + 15, $qn_out_min, value);
	}
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public void qn_out_min(float value) {
		setConstNumber(offset + 15, $qn_out_min, value);
	}
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public void qn_out_min(double value) {
		setConstNumber(offset + 15, $qn_out_min, value);
	}
	
	/**
	 * 外規格下限符号区分. Sign type (Lower limit of external specification).<p>
	 *
	 */
	public String sign_out_min_typ() {
		return getConstString(offset + 16, $sign_out_min_typ);
	}

	/**
	 * 外規格下限符号区分. Sign type (Lower limit of external specification).<p>
	 *
	 */
	public void sign_out_min_typ(String value) {
		setConstString(offset + 16, $sign_out_min_typ, value);
	}

	/**
	 * 外規格上限符号区分. Sign type (Upper limit of external specification).<p>
	 *
	 */
	public String sign_out_max_typ() {
		return getConstString(offset + 17, $sign_out_max_typ);
	}

	/**
	 * 外規格上限符号区分. Sign type (Upper limit of external specification).<p>
	 *
	 */
	public void sign_out_max_typ(String value) {
		setConstString(offset + 17, $sign_out_max_typ, value);
	}

	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public MCNumber qn_out_max() {
		return getConstNumber(offset + 18, $qn_out_max);
	}

	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public void qn_out_max(MCNumber value) {
		setConstNumber(offset + 18, $qn_out_max, value);
	}
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public void qn_out_max(int value) {
		setConstNumber(offset + 18, $qn_out_max, value);
	}
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public void qn_out_max(long value) {
		setConstNumber(offset + 18, $qn_out_max, value);
	}
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public void qn_out_max(float value) {
		setConstNumber(offset + 18, $qn_out_max, value);
	}
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public void qn_out_max(double value) {
		setConstNumber(offset + 18, $qn_out_max, value);
	}
	
	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public MCNumber qn_in_min() {
		return getConstNumber(offset + 19, $qn_in_min);
	}

	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public void qn_in_min(MCNumber value) {
		setConstNumber(offset + 19, $qn_in_min, value);
	}
	
	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public void qn_in_min(int value) {
		setConstNumber(offset + 19, $qn_in_min, value);
	}
	
	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public void qn_in_min(long value) {
		setConstNumber(offset + 19, $qn_in_min, value);
	}
	
	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public void qn_in_min(float value) {
		setConstNumber(offset + 19, $qn_in_min, value);
	}
	
	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public void qn_in_min(double value) {
		setConstNumber(offset + 19, $qn_in_min, value);
	}
	
	/**
	 * 内規格下限符号区分. Sign type (Lower limit of internal specification).<p>
	 *
	 */
	public String sign_in_min_typ() {
		return getConstString(offset + 20, $sign_in_min_typ);
	}

	/**
	 * 内規格下限符号区分. Sign type (Lower limit of internal specification).<p>
	 *
	 */
	public void sign_in_min_typ(String value) {
		setConstString(offset + 20, $sign_in_min_typ, value);
	}

	/**
	 * 内規格上限符号区分. Sign type (Upper limit of internal specification).<p>
	 *
	 */
	public String sign_in_max_typ() {
		return getConstString(offset + 21, $sign_in_max_typ);
	}

	/**
	 * 内規格上限符号区分. Sign type (Upper limit of internal specification).<p>
	 *
	 */
	public void sign_in_max_typ(String value) {
		setConstString(offset + 21, $sign_in_max_typ, value);
	}

	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public MCNumber qn_in_max() {
		return getConstNumber(offset + 22, $qn_in_max);
	}

	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public void qn_in_max(MCNumber value) {
		setConstNumber(offset + 22, $qn_in_max, value);
	}
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public void qn_in_max(int value) {
		setConstNumber(offset + 22, $qn_in_max, value);
	}
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public void qn_in_max(long value) {
		setConstNumber(offset + 22, $qn_in_max, value);
	}
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public void qn_in_max(float value) {
		setConstNumber(offset + 22, $qn_in_max, value);
	}
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public void qn_in_max(double value) {
		setConstNumber(offset + 22, $qn_in_max, value);
	}
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 23, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 23, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 24, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 24, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 25, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 25, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 26, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 26, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 27, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 27, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 28, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 28, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 29, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 29, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 30, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 30, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 31, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 31, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 32, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 32, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 33, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 33, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 34, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 35, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 35, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 36, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 36, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 37, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 37, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 38, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 38, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 39, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 39, $upd_srv_req_no, value);
	}

	/**
	 * 検査パタン名. Inspection pattern name.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 40, $insp_ptn_nm);
	}

	/**
	 * 検査パタン名. Inspection pattern name.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 40, $insp_ptn_nm, value);
	}

	/**
	 * 検査項目名. Inspection checkpoint name.<p>
	 *
	 */
	public String insp_point_nm() {
		return getConstString(offset + 41, $insp_point_nm);
	}

	/**
	 * 検査項目名. Inspection checkpoint name.<p>
	 *
	 */
	public void insp_point_nm(String value) {
		setConstString(offset + 41, $insp_point_nm, value);
	}

	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 42, $unit_nm);
	}

	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 42, $unit_nm, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 43, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 43, $itm_nm, value);
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
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($pre_insp_inf_typ.equalsIgnoreCase(name)) {
			return pre_insp_inf_typ();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			return sign_out_min_typ();
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			return sign_out_max_typ();
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			return sign_in_min_typ();
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			return sign_in_max_typ();
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
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			return insp_point_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			return qn_out_min();
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			return qn_out_max();
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			return qn_in_min();
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			return qn_in_max();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		return super.getDate(name);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
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
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($pre_insp_inf_typ.equalsIgnoreCase(name)) {
			return pre_insp_inf_typ();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			return sign_out_min_typ();
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			return sign_out_max_typ();
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			return sign_in_min_typ();
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			return sign_in_max_typ();
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
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			return insp_point_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			return qn_out_min();
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			return qn_out_max();
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			return qn_in_min();
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			return qn_in_max();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		return super.getDateNE(name);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
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
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($pre_insp_inf_typ.equalsIgnoreCase(name)) {
			pre_insp_inf_typ(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			sign_out_min_typ(value);
			return;
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			sign_out_max_typ(value);
			return;
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			sign_in_min_typ(value);
			return;
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			sign_in_max_typ(value);
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
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			insp_point_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		super.setDate(name, value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
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
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($pre_insp_inf_typ.equalsIgnoreCase(name)) {
			pre_insp_inf_typ(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			sign_out_min_typ(value);
			return;
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			sign_out_max_typ(value);
			return;
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			sign_in_min_typ(value);
			return;
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			sign_in_max_typ(value);
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
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			insp_point_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		super.setDateNE(name, value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
