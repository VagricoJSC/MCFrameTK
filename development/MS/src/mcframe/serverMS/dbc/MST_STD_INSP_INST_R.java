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
 * "規格検査指図 // Specific inspection order"DBコンテナRowクラスです。<p>
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
 *  	<td>std_insp_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>規格検査指図ＮＯ</td>
 *  	<td>Specific inspection order No.</td>
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
 *  	<td>insp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査ＮＯ</td>
 *  	<td>Inspection No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_freq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査回数</td>
 *  	<td>Number of inspections</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査順序</td>
 *  	<td>Inspection sequence</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_point_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査項目ＣＤ</td>
 *  	<td>Inspection checkpoint cd.</td>
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
 *  	<td>sign_out_min_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外規格下限符号区分</td>
 *  	<td>Sign type (Lower limit of external specification)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sign_out_max_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外規格上限符号区分</td>
 *  	<td>Sign type (Upper limit of external specification)</td>
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
 *  	<td>sign_in_min_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内規格下限符号区分</td>
 *  	<td>Sign type (Lower limit of internal specification)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sign_in_max_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内規格上限符号区分</td>
 *  	<td>Sign type (Upper limit of internal specification)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qn_int_digit</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>定量値整数部桁数</td>
 *  	<td>Quantitative integer digits</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qn_int_frac</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>定量値小数部桁数</td>
 *  	<td>Quantitative decimal digits</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ql_std_val</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>定性規格値</td>
 *  	<td>Qualitative specific value</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>add_point_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>追加項目ＦＬＧ</td>
 *  	<td>Additional column flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考</td>
 *  	<td>Internal remarks</td>
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
public class MST_STD_INSP_INST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_STD_INSP_INST";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 規格検査指図ＮＯ. Specific inspection order No..<p>
	 *
	 */
	public static final String $std_insp_inst_no = "std_insp_inst_no";
	private static final MCPermColumnInfo _std_insp_inst_no = createColumnInfo("std_insp_inst_no");
	public final MCStringPermColumn std_insp_inst_no = createStringColumn(_std_insp_inst_no);
	
	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	private static final MCPermColumnInfo _insp_typ = createColumnInfo("insp_typ");
	public final MCStringPermColumn insp_typ = createStringColumn(_insp_typ);
	
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
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public static final String $insp_seq = "insp_seq";
	private static final MCPermColumnInfo _insp_seq = createColumnInfo("insp_seq");
	public final MCNumberPermColumn insp_seq = createNumberColumn(_insp_seq);
	
	/**
	 * 検査項目ＣＤ. Inspection checkpoint cd..<p>
	 *
	 */
	public static final String $insp_point_cd = "insp_point_cd";
	private static final MCPermColumnInfo _insp_point_cd = createColumnInfo("insp_point_cd");
	public final MCStringPermColumn insp_point_cd = createStringColumn(_insp_point_cd);
	
	/**
	 * 定性定量区分. Qualitative/quantitative type.<p>
	 *
	 */
	public static final String $insp_qlqn_typ = "insp_qlqn_typ";
	private static final MCPermColumnInfo _insp_qlqn_typ = createColumnInfo("insp_qlqn_typ");
	public final MCStringPermColumn insp_qlqn_typ = createStringColumn(_insp_qlqn_typ);
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public static final String $qn_out_min = "qn_out_min";
	private static final MCPermColumnInfo _qn_out_min = createColumnInfo("qn_out_min");
	public final MCNumberPermColumn qn_out_min = createNumberColumn(_qn_out_min);
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public static final String $qn_out_max = "qn_out_max";
	private static final MCPermColumnInfo _qn_out_max = createColumnInfo("qn_out_max");
	public final MCNumberPermColumn qn_out_max = createNumberColumn(_qn_out_max);
	
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
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public static final String $qn_in_min = "qn_in_min";
	private static final MCPermColumnInfo _qn_in_min = createColumnInfo("qn_in_min");
	public final MCNumberPermColumn qn_in_min = createNumberColumn(_qn_in_min);
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public static final String $qn_in_max = "qn_in_max";
	private static final MCPermColumnInfo _qn_in_max = createColumnInfo("qn_in_max");
	public final MCNumberPermColumn qn_in_max = createNumberColumn(_qn_in_max);
	
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
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	private static final MCPermColumnInfo _trd_unit_cd = createColumnInfo("trd_unit_cd");
	public final MCStringPermColumn trd_unit_cd = createStringColumn(_trd_unit_cd);
	
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
	 * 定性規格値. Qualitative specific value.<p>
	 *
	 */
	public static final String $ql_std_val = "ql_std_val";
	private static final MCPermColumnInfo _ql_std_val = createColumnInfo("ql_std_val");
	public final MCStringPermColumn ql_std_val = createStringColumn(_ql_std_val);
	
	/**
	 * 追加項目ＦＬＧ. Additional column flg..<p>
	 *
	 */
	public static final String $add_point_flg = "add_point_flg";
	private static final MCPermColumnInfo _add_point_flg = createColumnInfo("add_point_flg");
	public final MCBooleanPermColumn add_point_flg = createBooleanColumn(_add_point_flg);
	
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
	
	public static final MCMeta std_insp_inst_no_META = createCommonMeta($std_insp_inst_no, mcframe.commonMA.meta.MA_META.STD_INSP_INST_NO);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_freq_META = createCommonMeta($insp_freq, mcframe.commonMS.meta.MS_META.INSP_FREQ);
	public static final MCMeta insp_seq_META = createCommonMeta($insp_seq, mcframe.commonMA.meta.MA_META.INSP_SEQ);
	public static final MCMeta insp_point_cd_META = createCommonMeta($insp_point_cd, mcframe.commonMA.meta.MA_META.INSP_POINT_CD);
	public static final MCMeta insp_qlqn_typ_META = createCommonMeta($insp_qlqn_typ, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP);
	public static final MCMeta qn_out_min_META = createCommonMeta($qn_out_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta qn_out_max_META = createCommonMeta($qn_out_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_out_min_typ_META = createCommonMeta($sign_out_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_out_max_typ_META = createCommonMeta($sign_out_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta qn_in_min_META = createCommonMeta($qn_in_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta qn_in_max_META = createCommonMeta($qn_in_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_in_min_typ_META = createCommonMeta($sign_in_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_max_typ_META = createCommonMeta($sign_in_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta qn_int_digit_META = createCommonMeta($qn_int_digit, mcframe.commonMA.meta.MA_META.INT_DIGIT);
	public static final MCMeta qn_int_frac_META = createCommonMeta($qn_int_frac, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ql_std_val_META = createCommonMeta($ql_std_val, mcframe.commonMA.meta.MA_META.QL_STD_VAL);
	public static final MCMeta add_point_flg_META = createCommonMeta($add_point_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.STD_INSP_INST_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR3);
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
					MST_STD_INSP_INST_R own = MST_STD_INSP_INST_R.create(alias);
					mcframe.serverMS.dbc.MST_INSP_INST_R ref = mcframe.serverMS.dbc.MST_INSP_INST_R.create("INSP_INST1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.insp_no.eq(ref.insp_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_STD_INSP_INST_R> constMetas = new ConstMetaList<MST_STD_INSP_INST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			std_insp_inst_no_META,
			insp_typ_META,
			insp_no_META,
			insp_freq_META,
			insp_seq_META,
			insp_point_cd_META,
			insp_qlqn_typ_META,
			qn_out_min_META,
			qn_out_max_META,
			sign_out_min_typ_META,
			sign_out_max_typ_META,
			qn_in_min_META,
			qn_in_max_META,
			sign_in_min_typ_META,
			sign_in_max_typ_META,
			trd_unit_cd_META,
			qn_int_digit_META,
			qn_int_frac_META,
			ql_std_val_META,
			add_point_flg_META,
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
	protected MST_STD_INSP_INST_R(ConstMetaList<? extends MST_STD_INSP_INST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_STD_INSP_INST_R(ConstMetaList<? extends MST_STD_INSP_INST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_STD_INSP_INST_R.$std_insp_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$std_insp_inst_no,
				"std_insp_inst_no",
				std_insp_inst_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_STD_INSP_INST_R.$insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$insp_typ,
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
			MST_STD_INSP_INST_R.$insp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$insp_no,
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
			MST_STD_INSP_INST_R.$insp_freq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_STD_INSP_INST_R.$insp_freq,
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
			MST_STD_INSP_INST_R.$insp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_STD_INSP_INST_R.$insp_seq,
				"insp_seq",
				insp_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_STD_INSP_INST_R.$insp_point_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$insp_point_cd,
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
			MST_STD_INSP_INST_R.$insp_qlqn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$insp_qlqn_typ,
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
			MST_STD_INSP_INST_R.$qn_out_min,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_STD_INSP_INST_R.$qn_out_min,
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
			MST_STD_INSP_INST_R.$qn_out_max,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_STD_INSP_INST_R.$qn_out_max,
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
			MST_STD_INSP_INST_R.$sign_out_min_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$sign_out_min_typ,
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
			MST_STD_INSP_INST_R.$sign_out_max_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$sign_out_max_typ,
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
			MST_STD_INSP_INST_R.$qn_in_min,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_STD_INSP_INST_R.$qn_in_min,
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
			MST_STD_INSP_INST_R.$qn_in_max,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_STD_INSP_INST_R.$qn_in_max,
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
			MST_STD_INSP_INST_R.$sign_in_min_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$sign_in_min_typ,
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
			MST_STD_INSP_INST_R.$sign_in_max_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$sign_in_max_typ,
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
			MST_STD_INSP_INST_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$trd_unit_cd,
				"trd_unit_cd",
				trd_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_STD_INSP_INST_R.$qn_int_digit,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_STD_INSP_INST_R.$qn_int_digit,
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
			MST_STD_INSP_INST_R.$qn_int_frac,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_STD_INSP_INST_R.$qn_int_frac,
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
			MST_STD_INSP_INST_R.$ql_std_val,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$ql_std_val,
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
			MST_STD_INSP_INST_R.$add_point_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_STD_INSP_INST_R.$add_point_flg,
				"add_point_flg",
				add_point_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_STD_INSP_INST_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$intr_rmrks,
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
			MST_STD_INSP_INST_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$sub_char1,
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
			MST_STD_INSP_INST_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$sub_char2,
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
			MST_STD_INSP_INST_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$sub_char3,
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
			MST_STD_INSP_INST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$ins_usr_id,
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
			MST_STD_INSP_INST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$ins_usr_nm,
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
			MST_STD_INSP_INST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_STD_INSP_INST_R.$ins_ts,
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
			MST_STD_INSP_INST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$ins_func_id,
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
			MST_STD_INSP_INST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_STD_INSP_INST_R.$upd_cntr,
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
			MST_STD_INSP_INST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$upd_usr_id,
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
			MST_STD_INSP_INST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$upd_usr_nm,
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
			MST_STD_INSP_INST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_STD_INSP_INST_R.$upd_ts,
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
			MST_STD_INSP_INST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$upd_func_id,
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
			MST_STD_INSP_INST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_STD_INSP_INST_R.$upd_srv_req_no,
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
	public static MST_STD_INSP_INST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_STD_INSP_INST_R create(String alias) {
		MST_STD_INSP_INST_R row = new MST_STD_INSP_INST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_STD_INSP_INST_R createByName(T proto) {
		MST_STD_INSP_INST_R row = MST_STD_INSP_INST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_STD_INSP_INST_R clone() {
		return (MST_STD_INSP_INST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_STD_INSP_INST_R createInstance() {
		return (MST_STD_INSP_INST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_STD_INSP_INST_R getValues(String... names) {
		return (MST_STD_INSP_INST_R) super.getValues(names);
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
	 public MSW_STD_INSP_INST_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_STD_INSP_INST_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_STD_INSP_INST_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_STD_INSP_INST_KEY_R.TABLE_NAME);
	 }

	/**
	 * 規格検査指図ＮＯ. Specific inspection order No..<p>
	 *
	 */
	public String std_insp_inst_no() {
		return getConstString(offset + 0, $std_insp_inst_no);
	}

	/**
	 * 規格検査指図ＮＯ. Specific inspection order No..<p>
	 *
	 */
	public void std_insp_inst_no(String value) {
		setConstString(offset + 0, $std_insp_inst_no, value);
	}

	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 1, $insp_typ);
	}

	/**
	 * 検査種類区分. Inspection classification type.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 1, $insp_typ, value);
	}

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 2, $insp_no);
	}

	/**
	 * 検査ＮＯ. Inspection No..<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 2, $insp_no, value);
	}

	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return getConstNumber(offset + 3, $insp_freq);
	}

	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		setConstNumber(offset + 3, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(int value) {
		setConstNumber(offset + 3, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(long value) {
		setConstNumber(offset + 3, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(float value) {
		setConstNumber(offset + 3, $insp_freq, value);
	}
	
	/**
	 * 検査回数. Number of inspections.<p>
	 *
	 */
	public void insp_freq(double value) {
		setConstNumber(offset + 3, $insp_freq, value);
	}
	
	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public MCNumber insp_seq() {
		return getConstNumber(offset + 4, $insp_seq);
	}

	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public void insp_seq(MCNumber value) {
		setConstNumber(offset + 4, $insp_seq, value);
	}
	
	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public void insp_seq(int value) {
		setConstNumber(offset + 4, $insp_seq, value);
	}
	
	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public void insp_seq(long value) {
		setConstNumber(offset + 4, $insp_seq, value);
	}
	
	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public void insp_seq(float value) {
		setConstNumber(offset + 4, $insp_seq, value);
	}
	
	/**
	 * 検査順序. Inspection sequence.<p>
	 *
	 */
	public void insp_seq(double value) {
		setConstNumber(offset + 4, $insp_seq, value);
	}
	
	/**
	 * 検査項目ＣＤ. Inspection checkpoint cd..<p>
	 *
	 */
	public String insp_point_cd() {
		return getConstString(offset + 5, $insp_point_cd);
	}

	/**
	 * 検査項目ＣＤ. Inspection checkpoint cd..<p>
	 *
	 */
	public void insp_point_cd(String value) {
		setConstString(offset + 5, $insp_point_cd, value);
	}

	/**
	 * 定性定量区分. Qualitative/quantitative type.<p>
	 *
	 */
	public String insp_qlqn_typ() {
		return getConstString(offset + 6, $insp_qlqn_typ);
	}

	/**
	 * 定性定量区分. Qualitative/quantitative type.<p>
	 *
	 */
	public void insp_qlqn_typ(String value) {
		setConstString(offset + 6, $insp_qlqn_typ, value);
	}

	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public MCNumber qn_out_min() {
		return getConstNumber(offset + 7, $qn_out_min);
	}

	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public void qn_out_min(MCNumber value) {
		setConstNumber(offset + 7, $qn_out_min, value);
	}
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public void qn_out_min(int value) {
		setConstNumber(offset + 7, $qn_out_min, value);
	}
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public void qn_out_min(long value) {
		setConstNumber(offset + 7, $qn_out_min, value);
	}
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public void qn_out_min(float value) {
		setConstNumber(offset + 7, $qn_out_min, value);
	}
	
	/**
	 * 外規格下限値. Lower limit of external specification.<p>
	 *
	 */
	public void qn_out_min(double value) {
		setConstNumber(offset + 7, $qn_out_min, value);
	}
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public MCNumber qn_out_max() {
		return getConstNumber(offset + 8, $qn_out_max);
	}

	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public void qn_out_max(MCNumber value) {
		setConstNumber(offset + 8, $qn_out_max, value);
	}
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public void qn_out_max(int value) {
		setConstNumber(offset + 8, $qn_out_max, value);
	}
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public void qn_out_max(long value) {
		setConstNumber(offset + 8, $qn_out_max, value);
	}
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public void qn_out_max(float value) {
		setConstNumber(offset + 8, $qn_out_max, value);
	}
	
	/**
	 * 外規格上限値. Upper limit of external specification.<p>
	 *
	 */
	public void qn_out_max(double value) {
		setConstNumber(offset + 8, $qn_out_max, value);
	}
	
	/**
	 * 外規格下限符号区分. Sign type (Lower limit of external specification).<p>
	 *
	 */
	public String sign_out_min_typ() {
		return getConstString(offset + 9, $sign_out_min_typ);
	}

	/**
	 * 外規格下限符号区分. Sign type (Lower limit of external specification).<p>
	 *
	 */
	public void sign_out_min_typ(String value) {
		setConstString(offset + 9, $sign_out_min_typ, value);
	}

	/**
	 * 外規格上限符号区分. Sign type (Upper limit of external specification).<p>
	 *
	 */
	public String sign_out_max_typ() {
		return getConstString(offset + 10, $sign_out_max_typ);
	}

	/**
	 * 外規格上限符号区分. Sign type (Upper limit of external specification).<p>
	 *
	 */
	public void sign_out_max_typ(String value) {
		setConstString(offset + 10, $sign_out_max_typ, value);
	}

	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public MCNumber qn_in_min() {
		return getConstNumber(offset + 11, $qn_in_min);
	}

	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public void qn_in_min(MCNumber value) {
		setConstNumber(offset + 11, $qn_in_min, value);
	}
	
	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public void qn_in_min(int value) {
		setConstNumber(offset + 11, $qn_in_min, value);
	}
	
	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public void qn_in_min(long value) {
		setConstNumber(offset + 11, $qn_in_min, value);
	}
	
	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public void qn_in_min(float value) {
		setConstNumber(offset + 11, $qn_in_min, value);
	}
	
	/**
	 * 内規格下限値. Lower limit of internal specification.<p>
	 *
	 */
	public void qn_in_min(double value) {
		setConstNumber(offset + 11, $qn_in_min, value);
	}
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public MCNumber qn_in_max() {
		return getConstNumber(offset + 12, $qn_in_max);
	}

	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public void qn_in_max(MCNumber value) {
		setConstNumber(offset + 12, $qn_in_max, value);
	}
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public void qn_in_max(int value) {
		setConstNumber(offset + 12, $qn_in_max, value);
	}
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public void qn_in_max(long value) {
		setConstNumber(offset + 12, $qn_in_max, value);
	}
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public void qn_in_max(float value) {
		setConstNumber(offset + 12, $qn_in_max, value);
	}
	
	/**
	 * 内規格上限値. Upper limit of internal specification.<p>
	 *
	 */
	public void qn_in_max(double value) {
		setConstNumber(offset + 12, $qn_in_max, value);
	}
	
	/**
	 * 内規格下限符号区分. Sign type (Lower limit of internal specification).<p>
	 *
	 */
	public String sign_in_min_typ() {
		return getConstString(offset + 13, $sign_in_min_typ);
	}

	/**
	 * 内規格下限符号区分. Sign type (Lower limit of internal specification).<p>
	 *
	 */
	public void sign_in_min_typ(String value) {
		setConstString(offset + 13, $sign_in_min_typ, value);
	}

	/**
	 * 内規格上限符号区分. Sign type (Upper limit of internal specification).<p>
	 *
	 */
	public String sign_in_max_typ() {
		return getConstString(offset + 14, $sign_in_max_typ);
	}

	/**
	 * 内規格上限符号区分. Sign type (Upper limit of internal specification).<p>
	 *
	 */
	public void sign_in_max_typ(String value) {
		setConstString(offset + 14, $sign_in_max_typ, value);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 15, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 15, $trd_unit_cd, value);
	}

	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public MCNumber qn_int_digit() {
		return getConstNumber(offset + 16, $qn_int_digit);
	}

	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public void qn_int_digit(MCNumber value) {
		setConstNumber(offset + 16, $qn_int_digit, value);
	}
	
	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public void qn_int_digit(int value) {
		setConstNumber(offset + 16, $qn_int_digit, value);
	}
	
	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public void qn_int_digit(long value) {
		setConstNumber(offset + 16, $qn_int_digit, value);
	}
	
	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public void qn_int_digit(float value) {
		setConstNumber(offset + 16, $qn_int_digit, value);
	}
	
	/**
	 * 定量値整数部桁数. Quantitative integer digits.<p>
	 *
	 */
	public void qn_int_digit(double value) {
		setConstNumber(offset + 16, $qn_int_digit, value);
	}
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public MCNumber qn_int_frac() {
		return getConstNumber(offset + 17, $qn_int_frac);
	}

	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public void qn_int_frac(MCNumber value) {
		setConstNumber(offset + 17, $qn_int_frac, value);
	}
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public void qn_int_frac(int value) {
		setConstNumber(offset + 17, $qn_int_frac, value);
	}
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public void qn_int_frac(long value) {
		setConstNumber(offset + 17, $qn_int_frac, value);
	}
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public void qn_int_frac(float value) {
		setConstNumber(offset + 17, $qn_int_frac, value);
	}
	
	/**
	 * 定量値小数部桁数. Quantitative decimal digits.<p>
	 *
	 */
	public void qn_int_frac(double value) {
		setConstNumber(offset + 17, $qn_int_frac, value);
	}
	
	/**
	 * 定性規格値. Qualitative specific value.<p>
	 *
	 */
	public String ql_std_val() {
		return getConstString(offset + 18, $ql_std_val);
	}

	/**
	 * 定性規格値. Qualitative specific value.<p>
	 *
	 */
	public void ql_std_val(String value) {
		setConstString(offset + 18, $ql_std_val, value);
	}

	/**
	 * 追加項目ＦＬＧ. Additional column flg..<p>
	 *
	 */
	public boolean add_point_flg() {
		return getConstBoolean(offset + 19, $add_point_flg);
	}

	/**
	 * 追加項目ＦＬＧ. Additional column flg..<p>
	 *
	 */
	public void add_point_flg(boolean value) {
		setConstBoolean(offset + 19, $add_point_flg, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 20, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 20, $intr_rmrks, value);
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
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 24, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 24, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 25, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 25, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 26, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 26, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 27, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 27, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 28, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 29, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 29, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 30, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 30, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 31, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 31, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 32, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 32, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 33, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 33, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			return std_insp_inst_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
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
		if ($add_point_flg.equalsIgnoreCase(name)) {
			return add_point_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			return std_insp_inst_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
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
		if ($add_point_flg.equalsIgnoreCase(name)) {
			return add_point_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			std_insp_inst_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($add_point_flg.equalsIgnoreCase(name)) {
			add_point_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			std_insp_inst_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
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
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($add_point_flg.equalsIgnoreCase(name)) {
			add_point_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
