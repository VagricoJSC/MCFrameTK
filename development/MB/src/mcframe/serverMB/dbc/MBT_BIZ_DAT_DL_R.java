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
 * "業務データダウンロード管理 // Business data download management"DBコンテナRowクラスです。<p>
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
 *  	<td>biz_dat_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務データＩＤ</td>
 *  	<td>Business data ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_dat_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務データ名</td>
 *  	<td>Business data name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_dat_rmrks1</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務データ備考１</td>
 *  	<td>Business data remarks 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_dat_rmrks2</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務データ備考２</td>
 *  	<td>Business data remarks 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_dat_rmrks3</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務データ備考３</td>
 *  	<td>Business data remarks 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>module_id</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>モジュールＩＤ</td>
 *  	<td>Module ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>logic_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロジックＩＤ</td>
 *  	<td>Logic ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>func_actyp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>機能種別</td>
 *  	<td>Function type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_dat_get_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務データ取得区分</td>
 *  	<td>Business data acquisition type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sql_src</td>
 *  	<td>CLB</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＳＱＬ</td>
 *  	<td>SQL</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>operation</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>オペレーションＩＤ</td>
 *  	<td>Operation ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>res_path</td>
 *  	<td>C</td>
 *  	<td>1024</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>リソースパス</td>
 *  	<td>Resource Path</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>form_file_nm</td>
 *  	<td>C</td>
 *  	<td>1024</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票フォーム名</td>
 *  	<td>Report form name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cartridge</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票出力カートリッジ</td>
 *  	<td>Report output cartridge</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>print_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>帳票出力を有効にする</td>
 *  	<td>Enable report output</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dwnld_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>帳票をダウンロードする</td>
 *  	<td>Download report</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt_cond_col1</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付条件項目１</td>
 *  	<td>Date condition column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt_cond_col2</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付条件項目２</td>
 *  	<td>Date condition column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt_cond_col3</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付条件項目３</td>
 *  	<td>Date condition column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt_cond_col4</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付条件項目４</td>
 *  	<td>Date condition column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt_cond_col5</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付条件項目５</td>
 *  	<td>Date condition column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt_cond_col6</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付条件項目６</td>
 *  	<td>Date condition column 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt_cond_col7</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付条件項目７</td>
 *  	<td>Date condition column 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt_cond_col8</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付条件項目８</td>
 *  	<td>Date condition column 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dt_cond_col9</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付条件項目９</td>
 *  	<td>Date condition column 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt_cond_col10</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付条件項目１０</td>
 *  	<td>Date condition column 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>str_cond_col1</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列条件項目１</td>
 *  	<td>String condition column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str_cond_col2</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列条件項目２</td>
 *  	<td>String condition column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>str_cond_col3</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列条件項目３</td>
 *  	<td>String condition column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str_cond_col4</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列条件項目４</td>
 *  	<td>String condition column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>str_cond_col5</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列条件項目５</td>
 *  	<td>String condition column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num_cond_col1</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値条件項目１</td>
 *  	<td>Numerical condition column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_cond_col2</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値条件項目２</td>
 *  	<td>Numerical condition column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num_cond_col3</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値条件項目３</td>
 *  	<td>Numerical condition column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_cond_col4</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値条件項目４</td>
 *  	<td>Numerical condition column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num_cond_col5</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値条件項目５</td>
 *  	<td>Numerical condition column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>flg_cond_col1</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>フラグ条件項目１</td>
 *  	<td>Flg. criteria column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>flg_cond_col2</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>フラグ条件項目２</td>
 *  	<td>Flg. criteria column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>flg_cond_col3</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>フラグ条件項目３</td>
 *  	<td>Flg. criteria column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>flg_cond_col4</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>フラグ条件項目４</td>
 *  	<td>Flg. criteria column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>flg_cond_col5</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>フラグ条件項目５</td>
 *  	<td>Flg. criteria column 5</td>
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
public class MBT_BIZ_DAT_DL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MBT_BIZ_DAT_DL";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 業務データＩＤ. Business data ID.<p>
	 *
	 */
	public static final String $biz_dat_id = "biz_dat_id";
	private static final MCPermColumnInfo _biz_dat_id = createColumnInfo("biz_dat_id");
	public final MCStringPermColumn biz_dat_id = createStringColumn(_biz_dat_id);
	
	/**
	 * 業務データ名. Business data name.<p>
	 *
	 */
	public static final String $biz_dat_nm = "biz_dat_nm";
	private static final MCPermColumnInfo _biz_dat_nm = createColumnInfo("biz_dat_nm");
	public final MCStringPermColumn biz_dat_nm = createStringColumn(_biz_dat_nm);
	
	/**
	 * 業務データ備考１. Business data remarks 1.<p>
	 *
	 */
	public static final String $biz_dat_rmrks1 = "biz_dat_rmrks1";
	private static final MCPermColumnInfo _biz_dat_rmrks1 = createColumnInfo("biz_dat_rmrks1");
	public final MCStringPermColumn biz_dat_rmrks1 = createStringColumn(_biz_dat_rmrks1);
	
	/**
	 * 業務データ備考２. Business data remarks 2.<p>
	 *
	 */
	public static final String $biz_dat_rmrks2 = "biz_dat_rmrks2";
	private static final MCPermColumnInfo _biz_dat_rmrks2 = createColumnInfo("biz_dat_rmrks2");
	public final MCStringPermColumn biz_dat_rmrks2 = createStringColumn(_biz_dat_rmrks2);
	
	/**
	 * 業務データ備考３. Business data remarks 3.<p>
	 *
	 */
	public static final String $biz_dat_rmrks3 = "biz_dat_rmrks3";
	private static final MCPermColumnInfo _biz_dat_rmrks3 = createColumnInfo("biz_dat_rmrks3");
	public final MCStringPermColumn biz_dat_rmrks3 = createStringColumn(_biz_dat_rmrks3);
	
	/**
	 * モジュールＩＤ. Module ID.<p>
	 *
	 */
	public static final String $module_id = "module_id";
	private static final MCPermColumnInfo _module_id = createColumnInfo("module_id");
	public final MCStringPermColumn module_id = createStringColumn(_module_id);
	
	/**
	 * ロジックＩＤ. Logic ID.<p>
	 *
	 */
	public static final String $logic_id = "logic_id";
	private static final MCPermColumnInfo _logic_id = createColumnInfo("logic_id");
	public final MCStringPermColumn logic_id = createStringColumn(_logic_id);
	
	/**
	 * 機能種別. Function type.<p>
	 *
	 */
	public static final String $func_actyp = "func_actyp";
	private static final MCPermColumnInfo _func_actyp = createColumnInfo("func_actyp");
	public final MCStringPermColumn func_actyp = createStringColumn(_func_actyp);
	
	/**
	 * 業務データ取得区分. Business data acquisition type.<p>
	 *
	 */
	public static final String $biz_dat_get_typ = "biz_dat_get_typ";
	private static final MCPermColumnInfo _biz_dat_get_typ = createColumnInfo("biz_dat_get_typ");
	public final MCStringPermColumn biz_dat_get_typ = createStringColumn(_biz_dat_get_typ);
	
	/**
	 * ＳＱＬ. SQL.<p>
	 *
	 */
	public static final String $sql_src = "sql_src";
	private static final MCPermColumnInfo _sql_src = createColumnInfo("sql_src");
	public final MCStringPermColumn sql_src = createStringColumn(_sql_src);
	
	/**
	 * オペレーションＩＤ. Operation ID.<p>
	 *
	 */
	public static final String $operation = "operation";
	private static final MCPermColumnInfo _operation = createColumnInfo("operation");
	public final MCStringPermColumn operation = createStringColumn(_operation);
	
	/**
	 * リソースパス. Resource Path.<p>
	 *
	 */
	public static final String $res_path = "res_path";
	private static final MCPermColumnInfo _res_path = createColumnInfo("res_path");
	public final MCStringPermColumn res_path = createStringColumn(_res_path);
	
	/**
	 * 帳票フォーム名. Report form name.<p>
	 *
	 */
	public static final String $form_file_nm = "form_file_nm";
	private static final MCPermColumnInfo _form_file_nm = createColumnInfo("form_file_nm");
	public final MCStringPermColumn form_file_nm = createStringColumn(_form_file_nm);
	
	/**
	 * 帳票出力カートリッジ. Report output cartridge.<p>
	 *
	 */
	public static final String $cartridge = "cartridge";
	private static final MCPermColumnInfo _cartridge = createColumnInfo("cartridge");
	public final MCStringPermColumn cartridge = createStringColumn(_cartridge);
	
	/**
	 * 帳票出力を有効にする. Enable report output.<p>
	 *
	 */
	public static final String $print_flg = "print_flg";
	private static final MCPermColumnInfo _print_flg = createColumnInfo("print_flg");
	public final MCBooleanPermColumn print_flg = createBooleanColumn(_print_flg);
	
	/**
	 * 帳票をダウンロードする. Download report.<p>
	 *
	 */
	public static final String $dwnld_flg = "dwnld_flg";
	private static final MCPermColumnInfo _dwnld_flg = createColumnInfo("dwnld_flg");
	public final MCBooleanPermColumn dwnld_flg = createBooleanColumn(_dwnld_flg);
	
	/**
	 * 日付条件項目１. Date condition column 1.<p>
	 *
	 */
	public static final String $dt_cond_col1 = "dt_cond_col1";
	private static final MCPermColumnInfo _dt_cond_col1 = createColumnInfo("dt_cond_col1");
	public final MCStringPermColumn dt_cond_col1 = createStringColumn(_dt_cond_col1);
	
	/**
	 * 日付条件項目２. Date condition column 2.<p>
	 *
	 */
	public static final String $dt_cond_col2 = "dt_cond_col2";
	private static final MCPermColumnInfo _dt_cond_col2 = createColumnInfo("dt_cond_col2");
	public final MCStringPermColumn dt_cond_col2 = createStringColumn(_dt_cond_col2);
	
	/**
	 * 日付条件項目３. Date condition column 3.<p>
	 *
	 */
	public static final String $dt_cond_col3 = "dt_cond_col3";
	private static final MCPermColumnInfo _dt_cond_col3 = createColumnInfo("dt_cond_col3");
	public final MCStringPermColumn dt_cond_col3 = createStringColumn(_dt_cond_col3);
	
	/**
	 * 日付条件項目４. Date condition column 4.<p>
	 *
	 */
	public static final String $dt_cond_col4 = "dt_cond_col4";
	private static final MCPermColumnInfo _dt_cond_col4 = createColumnInfo("dt_cond_col4");
	public final MCStringPermColumn dt_cond_col4 = createStringColumn(_dt_cond_col4);
	
	/**
	 * 日付条件項目５. Date condition column 5.<p>
	 *
	 */
	public static final String $dt_cond_col5 = "dt_cond_col5";
	private static final MCPermColumnInfo _dt_cond_col5 = createColumnInfo("dt_cond_col5");
	public final MCStringPermColumn dt_cond_col5 = createStringColumn(_dt_cond_col5);
	
	/**
	 * 日付条件項目６. Date condition column 6.<p>
	 *
	 */
	public static final String $dt_cond_col6 = "dt_cond_col6";
	private static final MCPermColumnInfo _dt_cond_col6 = createColumnInfo("dt_cond_col6");
	public final MCStringPermColumn dt_cond_col6 = createStringColumn(_dt_cond_col6);
	
	/**
	 * 日付条件項目７. Date condition column 7.<p>
	 *
	 */
	public static final String $dt_cond_col7 = "dt_cond_col7";
	private static final MCPermColumnInfo _dt_cond_col7 = createColumnInfo("dt_cond_col7");
	public final MCStringPermColumn dt_cond_col7 = createStringColumn(_dt_cond_col7);
	
	/**
	 * 日付条件項目８. Date condition column 8.<p>
	 *
	 */
	public static final String $dt_cond_col8 = "dt_cond_col8";
	private static final MCPermColumnInfo _dt_cond_col8 = createColumnInfo("dt_cond_col8");
	public final MCStringPermColumn dt_cond_col8 = createStringColumn(_dt_cond_col8);
	
	/**
	 * 日付条件項目９. Date condition column 9.<p>
	 *
	 */
	public static final String $dt_cond_col9 = "dt_cond_col9";
	private static final MCPermColumnInfo _dt_cond_col9 = createColumnInfo("dt_cond_col9");
	public final MCStringPermColumn dt_cond_col9 = createStringColumn(_dt_cond_col9);
	
	/**
	 * 日付条件項目１０. Date condition column 10.<p>
	 *
	 */
	public static final String $dt_cond_col10 = "dt_cond_col10";
	private static final MCPermColumnInfo _dt_cond_col10 = createColumnInfo("dt_cond_col10");
	public final MCStringPermColumn dt_cond_col10 = createStringColumn(_dt_cond_col10);
	
	/**
	 * 文字列条件項目１. String condition column 1.<p>
	 *
	 */
	public static final String $str_cond_col1 = "str_cond_col1";
	private static final MCPermColumnInfo _str_cond_col1 = createColumnInfo("str_cond_col1");
	public final MCStringPermColumn str_cond_col1 = createStringColumn(_str_cond_col1);
	
	/**
	 * 文字列条件項目２. String condition column 2.<p>
	 *
	 */
	public static final String $str_cond_col2 = "str_cond_col2";
	private static final MCPermColumnInfo _str_cond_col2 = createColumnInfo("str_cond_col2");
	public final MCStringPermColumn str_cond_col2 = createStringColumn(_str_cond_col2);
	
	/**
	 * 文字列条件項目３. String condition column 3.<p>
	 *
	 */
	public static final String $str_cond_col3 = "str_cond_col3";
	private static final MCPermColumnInfo _str_cond_col3 = createColumnInfo("str_cond_col3");
	public final MCStringPermColumn str_cond_col3 = createStringColumn(_str_cond_col3);
	
	/**
	 * 文字列条件項目４. String condition column 4.<p>
	 *
	 */
	public static final String $str_cond_col4 = "str_cond_col4";
	private static final MCPermColumnInfo _str_cond_col4 = createColumnInfo("str_cond_col4");
	public final MCStringPermColumn str_cond_col4 = createStringColumn(_str_cond_col4);
	
	/**
	 * 文字列条件項目５. String condition column 5.<p>
	 *
	 */
	public static final String $str_cond_col5 = "str_cond_col5";
	private static final MCPermColumnInfo _str_cond_col5 = createColumnInfo("str_cond_col5");
	public final MCStringPermColumn str_cond_col5 = createStringColumn(_str_cond_col5);
	
	/**
	 * 数値条件項目１. Numerical condition column 1.<p>
	 *
	 */
	public static final String $num_cond_col1 = "num_cond_col1";
	private static final MCPermColumnInfo _num_cond_col1 = createColumnInfo("num_cond_col1");
	public final MCStringPermColumn num_cond_col1 = createStringColumn(_num_cond_col1);
	
	/**
	 * 数値条件項目２. Numerical condition column 2.<p>
	 *
	 */
	public static final String $num_cond_col2 = "num_cond_col2";
	private static final MCPermColumnInfo _num_cond_col2 = createColumnInfo("num_cond_col2");
	public final MCStringPermColumn num_cond_col2 = createStringColumn(_num_cond_col2);
	
	/**
	 * 数値条件項目３. Numerical condition column 3.<p>
	 *
	 */
	public static final String $num_cond_col3 = "num_cond_col3";
	private static final MCPermColumnInfo _num_cond_col3 = createColumnInfo("num_cond_col3");
	public final MCStringPermColumn num_cond_col3 = createStringColumn(_num_cond_col3);
	
	/**
	 * 数値条件項目４. Numerical condition column 4.<p>
	 *
	 */
	public static final String $num_cond_col4 = "num_cond_col4";
	private static final MCPermColumnInfo _num_cond_col4 = createColumnInfo("num_cond_col4");
	public final MCStringPermColumn num_cond_col4 = createStringColumn(_num_cond_col4);
	
	/**
	 * 数値条件項目５. Numerical condition column 5.<p>
	 *
	 */
	public static final String $num_cond_col5 = "num_cond_col5";
	private static final MCPermColumnInfo _num_cond_col5 = createColumnInfo("num_cond_col5");
	public final MCStringPermColumn num_cond_col5 = createStringColumn(_num_cond_col5);
	
	/**
	 * フラグ条件項目１. Flg. criteria column 1.<p>
	 *
	 */
	public static final String $flg_cond_col1 = "flg_cond_col1";
	private static final MCPermColumnInfo _flg_cond_col1 = createColumnInfo("flg_cond_col1");
	public final MCStringPermColumn flg_cond_col1 = createStringColumn(_flg_cond_col1);
	
	/**
	 * フラグ条件項目２. Flg. criteria column 2.<p>
	 *
	 */
	public static final String $flg_cond_col2 = "flg_cond_col2";
	private static final MCPermColumnInfo _flg_cond_col2 = createColumnInfo("flg_cond_col2");
	public final MCStringPermColumn flg_cond_col2 = createStringColumn(_flg_cond_col2);
	
	/**
	 * フラグ条件項目３. Flg. criteria column 3.<p>
	 *
	 */
	public static final String $flg_cond_col3 = "flg_cond_col3";
	private static final MCPermColumnInfo _flg_cond_col3 = createColumnInfo("flg_cond_col3");
	public final MCStringPermColumn flg_cond_col3 = createStringColumn(_flg_cond_col3);
	
	/**
	 * フラグ条件項目４. Flg. criteria column 4.<p>
	 *
	 */
	public static final String $flg_cond_col4 = "flg_cond_col4";
	private static final MCPermColumnInfo _flg_cond_col4 = createColumnInfo("flg_cond_col4");
	public final MCStringPermColumn flg_cond_col4 = createStringColumn(_flg_cond_col4);
	
	/**
	 * フラグ条件項目５. Flg. criteria column 5.<p>
	 *
	 */
	public static final String $flg_cond_col5 = "flg_cond_col5";
	private static final MCPermColumnInfo _flg_cond_col5 = createColumnInfo("flg_cond_col5");
	public final MCStringPermColumn flg_cond_col5 = createStringColumn(_flg_cond_col5);
	
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
	
	public static final MCMeta biz_dat_id_META = createCommonMeta($biz_dat_id, mcframe.commonMA.meta.MA_META.BIZ_DAT_ID);
	public static final MCMeta biz_dat_nm_META = createCommonMeta($biz_dat_nm, mcframe.commonMA.meta.MA_META.BIZ_DAT_NM);
	public static final MCMeta biz_dat_rmrks1_META = createCommonMeta($biz_dat_rmrks1, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks2_META = createCommonMeta($biz_dat_rmrks2, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks3_META = createCommonMeta($biz_dat_rmrks3, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta module_id_META = createCommonMeta($module_id, mcframe.commonMA.meta.MA_META.MODULE_ID);
	public static final MCMeta logic_id_META = createCommonMeta($logic_id, mcframe.commonMA.meta.MA_META.LOGIC_ID);
	public static final MCMeta func_actyp_META = createCommonMeta($func_actyp, mcframe.commonMA.meta.MA_META.FUNC_ACTYP);
	public static final MCMeta biz_dat_get_typ_META = createCommonMeta($biz_dat_get_typ, mcframe.commonMA.meta.MA_META.BIZ_DAT_GET_TYP);
	public static final MCMeta sql_src_META = createCommonMeta($sql_src, mcframe.commonMA.meta.MA_META.SQL_SRC);
	public static final MCMeta operation_META = createCommonMeta($operation, mcframe.commonMA.meta.MA_META.OPERATION);
	public static final MCMeta res_path_META = createCommonMeta($res_path, mcframe.commonMA.meta.MA_META.PATH);
	public static final MCMeta form_file_nm_META = createCommonMeta($form_file_nm, mcframe.commonMA.meta.MA_META.PRINT_FILE_NAME);
	public static final MCMeta cartridge_META = createCommonMeta($cartridge, mcframe.commonMA.meta.MA_META.CARTRIDGE);
	public static final MCMeta print_flg_META = createCommonMeta($print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dwnld_flg_META = createCommonMeta($dwnld_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dt_cond_col1_META = createCommonMeta($dt_cond_col1, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col2_META = createCommonMeta($dt_cond_col2, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col3_META = createCommonMeta($dt_cond_col3, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col4_META = createCommonMeta($dt_cond_col4, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col5_META = createCommonMeta($dt_cond_col5, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col6_META = createCommonMeta($dt_cond_col6, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col7_META = createCommonMeta($dt_cond_col7, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col8_META = createCommonMeta($dt_cond_col8, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col9_META = createCommonMeta($dt_cond_col9, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col10_META = createCommonMeta($dt_cond_col10, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta str_cond_col1_META = createCommonMeta($str_cond_col1, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta str_cond_col2_META = createCommonMeta($str_cond_col2, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta str_cond_col3_META = createCommonMeta($str_cond_col3, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta str_cond_col4_META = createCommonMeta($str_cond_col4, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta str_cond_col5_META = createCommonMeta($str_cond_col5, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta num_cond_col1_META = createCommonMeta($num_cond_col1, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta num_cond_col2_META = createCommonMeta($num_cond_col2, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta num_cond_col3_META = createCommonMeta($num_cond_col3, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta num_cond_col4_META = createCommonMeta($num_cond_col4, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta num_cond_col5_META = createCommonMeta($num_cond_col5, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta flg_cond_col1_META = createCommonMeta($flg_cond_col1, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta flg_cond_col2_META = createCommonMeta($flg_cond_col2, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta flg_cond_col3_META = createCommonMeta($flg_cond_col3, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta flg_cond_col4_META = createCommonMeta($flg_cond_col4, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta flg_cond_col5_META = createCommonMeta($flg_cond_col5, mcframe.commonMA.meta.MA_META.COND_COL);
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
	
	protected static final ConstMetaList<MBT_BIZ_DAT_DL_R> constMetas = new ConstMetaList<MBT_BIZ_DAT_DL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			biz_dat_id_META,
			biz_dat_nm_META,
			biz_dat_rmrks1_META,
			biz_dat_rmrks2_META,
			biz_dat_rmrks3_META,
			module_id_META,
			logic_id_META,
			func_actyp_META,
			biz_dat_get_typ_META,
			sql_src_META,
			operation_META,
			res_path_META,
			form_file_nm_META,
			cartridge_META,
			print_flg_META,
			dwnld_flg_META,
			dt_cond_col1_META,
			dt_cond_col2_META,
			dt_cond_col3_META,
			dt_cond_col4_META,
			dt_cond_col5_META,
			dt_cond_col6_META,
			dt_cond_col7_META,
			dt_cond_col8_META,
			dt_cond_col9_META,
			dt_cond_col10_META,
			str_cond_col1_META,
			str_cond_col2_META,
			str_cond_col3_META,
			str_cond_col4_META,
			str_cond_col5_META,
			num_cond_col1_META,
			num_cond_col2_META,
			num_cond_col3_META,
			num_cond_col4_META,
			num_cond_col5_META,
			flg_cond_col1_META,
			flg_cond_col2_META,
			flg_cond_col3_META,
			flg_cond_col4_META,
			flg_cond_col5_META,
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
	protected MBT_BIZ_DAT_DL_R(ConstMetaList<? extends MBT_BIZ_DAT_DL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBT_BIZ_DAT_DL_R(ConstMetaList<? extends MBT_BIZ_DAT_DL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$biz_dat_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$biz_dat_id,
				"biz_dat_id",
				biz_dat_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$biz_dat_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$biz_dat_nm,
				"biz_dat_nm",
				biz_dat_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$biz_dat_rmrks1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$biz_dat_rmrks1,
				"biz_dat_rmrks1",
				biz_dat_rmrks1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$biz_dat_rmrks2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$biz_dat_rmrks2,
				"biz_dat_rmrks2",
				biz_dat_rmrks2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$biz_dat_rmrks3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$biz_dat_rmrks3,
				"biz_dat_rmrks3",
				biz_dat_rmrks3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$module_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$module_id,
				"module_id",
				module_id,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$logic_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$logic_id,
				"logic_id",
				logic_id,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$func_actyp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$func_actyp,
				"func_actyp",
				func_actyp,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$biz_dat_get_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$biz_dat_get_typ,
				"biz_dat_get_typ",
				biz_dat_get_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$sql_src,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$sql_src,
				"sql_src",
				sql_src,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$operation,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$operation,
				"operation",
				operation,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$res_path,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$res_path,
				"res_path",
				res_path,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$form_file_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$form_file_nm,
				"form_file_nm",
				form_file_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$cartridge,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$cartridge,
				"cartridge",
				cartridge,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$print_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BIZ_DAT_DL_R.$print_flg,
				"print_flg",
				print_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dwnld_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_BIZ_DAT_DL_R.$dwnld_flg,
				"dwnld_flg",
				dwnld_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dt_cond_col1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$dt_cond_col1,
				"dt_cond_col1",
				dt_cond_col1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dt_cond_col2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$dt_cond_col2,
				"dt_cond_col2",
				dt_cond_col2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dt_cond_col3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$dt_cond_col3,
				"dt_cond_col3",
				dt_cond_col3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dt_cond_col4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$dt_cond_col4,
				"dt_cond_col4",
				dt_cond_col4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dt_cond_col5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$dt_cond_col5,
				"dt_cond_col5",
				dt_cond_col5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dt_cond_col6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$dt_cond_col6,
				"dt_cond_col6",
				dt_cond_col6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dt_cond_col7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$dt_cond_col7,
				"dt_cond_col7",
				dt_cond_col7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dt_cond_col8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$dt_cond_col8,
				"dt_cond_col8",
				dt_cond_col8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dt_cond_col9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$dt_cond_col9,
				"dt_cond_col9",
				dt_cond_col9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$dt_cond_col10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$dt_cond_col10,
				"dt_cond_col10",
				dt_cond_col10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$str_cond_col1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$str_cond_col1,
				"str_cond_col1",
				str_cond_col1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$str_cond_col2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$str_cond_col2,
				"str_cond_col2",
				str_cond_col2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$str_cond_col3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$str_cond_col3,
				"str_cond_col3",
				str_cond_col3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$str_cond_col4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$str_cond_col4,
				"str_cond_col4",
				str_cond_col4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$str_cond_col5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$str_cond_col5,
				"str_cond_col5",
				str_cond_col5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$num_cond_col1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$num_cond_col1,
				"num_cond_col1",
				num_cond_col1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$num_cond_col2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$num_cond_col2,
				"num_cond_col2",
				num_cond_col2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$num_cond_col3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$num_cond_col3,
				"num_cond_col3",
				num_cond_col3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$num_cond_col4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$num_cond_col4,
				"num_cond_col4",
				num_cond_col4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$num_cond_col5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$num_cond_col5,
				"num_cond_col5",
				num_cond_col5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$flg_cond_col1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$flg_cond_col1,
				"flg_cond_col1",
				flg_cond_col1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$flg_cond_col2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$flg_cond_col2,
				"flg_cond_col2",
				flg_cond_col2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$flg_cond_col3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$flg_cond_col3,
				"flg_cond_col3",
				flg_cond_col3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$flg_cond_col4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$flg_cond_col4,
				"flg_cond_col4",
				flg_cond_col4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$flg_cond_col5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$flg_cond_col5,
				"flg_cond_col5",
				flg_cond_col5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_BIZ_DAT_DL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$ins_usr_id,
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
			MBT_BIZ_DAT_DL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$ins_usr_nm,
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
			MBT_BIZ_DAT_DL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_BIZ_DAT_DL_R.$ins_ts,
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
			MBT_BIZ_DAT_DL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$ins_func_id,
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
			MBT_BIZ_DAT_DL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_BIZ_DAT_DL_R.$upd_cntr,
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
			MBT_BIZ_DAT_DL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$upd_usr_id,
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
			MBT_BIZ_DAT_DL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$upd_usr_nm,
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
			MBT_BIZ_DAT_DL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_BIZ_DAT_DL_R.$upd_ts,
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
			MBT_BIZ_DAT_DL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$upd_func_id,
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
			MBT_BIZ_DAT_DL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_BIZ_DAT_DL_R.$upd_srv_req_no,
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
	public static MBT_BIZ_DAT_DL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBT_BIZ_DAT_DL_R create(String alias) {
		MBT_BIZ_DAT_DL_R row = new MBT_BIZ_DAT_DL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBT_BIZ_DAT_DL_R createByName(T proto) {
		MBT_BIZ_DAT_DL_R row = MBT_BIZ_DAT_DL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_BIZ_DAT_DL_R clone() {
		return (MBT_BIZ_DAT_DL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_BIZ_DAT_DL_R createInstance() {
		return (MBT_BIZ_DAT_DL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_BIZ_DAT_DL_R getValues(String... names) {
		return (MBT_BIZ_DAT_DL_R) super.getValues(names);
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
	 public MBW_BIZ_DAT_DL_KEY_R getPkWorkDbc(String alias) {
	 	return MBW_BIZ_DAT_DL_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MBW_BIZ_DAT_DL_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MBW_BIZ_DAT_DL_KEY_R.TABLE_NAME);
	 }

	/**
	 * 業務データＩＤ. Business data ID.<p>
	 *
	 */
	public String biz_dat_id() {
		return getConstString(offset + 0, $biz_dat_id);
	}

	/**
	 * 業務データＩＤ. Business data ID.<p>
	 *
	 */
	public void biz_dat_id(String value) {
		setConstString(offset + 0, $biz_dat_id, value);
	}

	/**
	 * 業務データ名. Business data name.<p>
	 *
	 */
	public String biz_dat_nm() {
		return getConstString(offset + 1, $biz_dat_nm);
	}

	/**
	 * 業務データ名. Business data name.<p>
	 *
	 */
	public void biz_dat_nm(String value) {
		setConstString(offset + 1, $biz_dat_nm, value);
	}

	/**
	 * 業務データ備考１. Business data remarks 1.<p>
	 *
	 */
	public String biz_dat_rmrks1() {
		return getConstString(offset + 2, $biz_dat_rmrks1);
	}

	/**
	 * 業務データ備考１. Business data remarks 1.<p>
	 *
	 */
	public void biz_dat_rmrks1(String value) {
		setConstString(offset + 2, $biz_dat_rmrks1, value);
	}

	/**
	 * 業務データ備考２. Business data remarks 2.<p>
	 *
	 */
	public String biz_dat_rmrks2() {
		return getConstString(offset + 3, $biz_dat_rmrks2);
	}

	/**
	 * 業務データ備考２. Business data remarks 2.<p>
	 *
	 */
	public void biz_dat_rmrks2(String value) {
		setConstString(offset + 3, $biz_dat_rmrks2, value);
	}

	/**
	 * 業務データ備考３. Business data remarks 3.<p>
	 *
	 */
	public String biz_dat_rmrks3() {
		return getConstString(offset + 4, $biz_dat_rmrks3);
	}

	/**
	 * 業務データ備考３. Business data remarks 3.<p>
	 *
	 */
	public void biz_dat_rmrks3(String value) {
		setConstString(offset + 4, $biz_dat_rmrks3, value);
	}

	/**
	 * モジュールＩＤ. Module ID.<p>
	 *
	 */
	public String module_id() {
		return getConstString(offset + 5, $module_id);
	}

	/**
	 * モジュールＩＤ. Module ID.<p>
	 *
	 */
	public void module_id(String value) {
		setConstString(offset + 5, $module_id, value);
	}

	/**
	 * ロジックＩＤ. Logic ID.<p>
	 *
	 */
	public String logic_id() {
		return getConstString(offset + 6, $logic_id);
	}

	/**
	 * ロジックＩＤ. Logic ID.<p>
	 *
	 */
	public void logic_id(String value) {
		setConstString(offset + 6, $logic_id, value);
	}

	/**
	 * 機能種別. Function type.<p>
	 *
	 */
	public String func_actyp() {
		return getConstString(offset + 7, $func_actyp);
	}

	/**
	 * 機能種別. Function type.<p>
	 *
	 */
	public void func_actyp(String value) {
		setConstString(offset + 7, $func_actyp, value);
	}

	/**
	 * 業務データ取得区分. Business data acquisition type.<p>
	 *
	 */
	public String biz_dat_get_typ() {
		return getConstString(offset + 8, $biz_dat_get_typ);
	}

	/**
	 * 業務データ取得区分. Business data acquisition type.<p>
	 *
	 */
	public void biz_dat_get_typ(String value) {
		setConstString(offset + 8, $biz_dat_get_typ, value);
	}

	/**
	 * ＳＱＬ. SQL.<p>
	 *
	 */
	public String sql_src() {
		return getConstString(offset + 9, $sql_src);
	}

	/**
	 * ＳＱＬ. SQL.<p>
	 *
	 */
	public void sql_src(String value) {
		setConstString(offset + 9, $sql_src, value);
	}

	/**
	 * オペレーションＩＤ. Operation ID.<p>
	 *
	 */
	public String operation() {
		return getConstString(offset + 10, $operation);
	}

	/**
	 * オペレーションＩＤ. Operation ID.<p>
	 *
	 */
	public void operation(String value) {
		setConstString(offset + 10, $operation, value);
	}

	/**
	 * リソースパス. Resource Path.<p>
	 *
	 */
	public String res_path() {
		return getConstString(offset + 11, $res_path);
	}

	/**
	 * リソースパス. Resource Path.<p>
	 *
	 */
	public void res_path(String value) {
		setConstString(offset + 11, $res_path, value);
	}

	/**
	 * 帳票フォーム名. Report form name.<p>
	 *
	 */
	public String form_file_nm() {
		return getConstString(offset + 12, $form_file_nm);
	}

	/**
	 * 帳票フォーム名. Report form name.<p>
	 *
	 */
	public void form_file_nm(String value) {
		setConstString(offset + 12, $form_file_nm, value);
	}

	/**
	 * 帳票出力カートリッジ. Report output cartridge.<p>
	 *
	 */
	public String cartridge() {
		return getConstString(offset + 13, $cartridge);
	}

	/**
	 * 帳票出力カートリッジ. Report output cartridge.<p>
	 *
	 */
	public void cartridge(String value) {
		setConstString(offset + 13, $cartridge, value);
	}

	/**
	 * 帳票出力を有効にする. Enable report output.<p>
	 *
	 */
	public boolean print_flg() {
		return getConstBoolean(offset + 14, $print_flg);
	}

	/**
	 * 帳票出力を有効にする. Enable report output.<p>
	 *
	 */
	public void print_flg(boolean value) {
		setConstBoolean(offset + 14, $print_flg, value);
	}

	/**
	 * 帳票をダウンロードする. Download report.<p>
	 *
	 */
	public boolean dwnld_flg() {
		return getConstBoolean(offset + 15, $dwnld_flg);
	}

	/**
	 * 帳票をダウンロードする. Download report.<p>
	 *
	 */
	public void dwnld_flg(boolean value) {
		setConstBoolean(offset + 15, $dwnld_flg, value);
	}

	/**
	 * 日付条件項目１. Date condition column 1.<p>
	 *
	 */
	public String dt_cond_col1() {
		return getConstString(offset + 16, $dt_cond_col1);
	}

	/**
	 * 日付条件項目１. Date condition column 1.<p>
	 *
	 */
	public void dt_cond_col1(String value) {
		setConstString(offset + 16, $dt_cond_col1, value);
	}

	/**
	 * 日付条件項目２. Date condition column 2.<p>
	 *
	 */
	public String dt_cond_col2() {
		return getConstString(offset + 17, $dt_cond_col2);
	}

	/**
	 * 日付条件項目２. Date condition column 2.<p>
	 *
	 */
	public void dt_cond_col2(String value) {
		setConstString(offset + 17, $dt_cond_col2, value);
	}

	/**
	 * 日付条件項目３. Date condition column 3.<p>
	 *
	 */
	public String dt_cond_col3() {
		return getConstString(offset + 18, $dt_cond_col3);
	}

	/**
	 * 日付条件項目３. Date condition column 3.<p>
	 *
	 */
	public void dt_cond_col3(String value) {
		setConstString(offset + 18, $dt_cond_col3, value);
	}

	/**
	 * 日付条件項目４. Date condition column 4.<p>
	 *
	 */
	public String dt_cond_col4() {
		return getConstString(offset + 19, $dt_cond_col4);
	}

	/**
	 * 日付条件項目４. Date condition column 4.<p>
	 *
	 */
	public void dt_cond_col4(String value) {
		setConstString(offset + 19, $dt_cond_col4, value);
	}

	/**
	 * 日付条件項目５. Date condition column 5.<p>
	 *
	 */
	public String dt_cond_col5() {
		return getConstString(offset + 20, $dt_cond_col5);
	}

	/**
	 * 日付条件項目５. Date condition column 5.<p>
	 *
	 */
	public void dt_cond_col5(String value) {
		setConstString(offset + 20, $dt_cond_col5, value);
	}

	/**
	 * 日付条件項目６. Date condition column 6.<p>
	 *
	 */
	public String dt_cond_col6() {
		return getConstString(offset + 21, $dt_cond_col6);
	}

	/**
	 * 日付条件項目６. Date condition column 6.<p>
	 *
	 */
	public void dt_cond_col6(String value) {
		setConstString(offset + 21, $dt_cond_col6, value);
	}

	/**
	 * 日付条件項目７. Date condition column 7.<p>
	 *
	 */
	public String dt_cond_col7() {
		return getConstString(offset + 22, $dt_cond_col7);
	}

	/**
	 * 日付条件項目７. Date condition column 7.<p>
	 *
	 */
	public void dt_cond_col7(String value) {
		setConstString(offset + 22, $dt_cond_col7, value);
	}

	/**
	 * 日付条件項目８. Date condition column 8.<p>
	 *
	 */
	public String dt_cond_col8() {
		return getConstString(offset + 23, $dt_cond_col8);
	}

	/**
	 * 日付条件項目８. Date condition column 8.<p>
	 *
	 */
	public void dt_cond_col8(String value) {
		setConstString(offset + 23, $dt_cond_col8, value);
	}

	/**
	 * 日付条件項目９. Date condition column 9.<p>
	 *
	 */
	public String dt_cond_col9() {
		return getConstString(offset + 24, $dt_cond_col9);
	}

	/**
	 * 日付条件項目９. Date condition column 9.<p>
	 *
	 */
	public void dt_cond_col9(String value) {
		setConstString(offset + 24, $dt_cond_col9, value);
	}

	/**
	 * 日付条件項目１０. Date condition column 10.<p>
	 *
	 */
	public String dt_cond_col10() {
		return getConstString(offset + 25, $dt_cond_col10);
	}

	/**
	 * 日付条件項目１０. Date condition column 10.<p>
	 *
	 */
	public void dt_cond_col10(String value) {
		setConstString(offset + 25, $dt_cond_col10, value);
	}

	/**
	 * 文字列条件項目１. String condition column 1.<p>
	 *
	 */
	public String str_cond_col1() {
		return getConstString(offset + 26, $str_cond_col1);
	}

	/**
	 * 文字列条件項目１. String condition column 1.<p>
	 *
	 */
	public void str_cond_col1(String value) {
		setConstString(offset + 26, $str_cond_col1, value);
	}

	/**
	 * 文字列条件項目２. String condition column 2.<p>
	 *
	 */
	public String str_cond_col2() {
		return getConstString(offset + 27, $str_cond_col2);
	}

	/**
	 * 文字列条件項目２. String condition column 2.<p>
	 *
	 */
	public void str_cond_col2(String value) {
		setConstString(offset + 27, $str_cond_col2, value);
	}

	/**
	 * 文字列条件項目３. String condition column 3.<p>
	 *
	 */
	public String str_cond_col3() {
		return getConstString(offset + 28, $str_cond_col3);
	}

	/**
	 * 文字列条件項目３. String condition column 3.<p>
	 *
	 */
	public void str_cond_col3(String value) {
		setConstString(offset + 28, $str_cond_col3, value);
	}

	/**
	 * 文字列条件項目４. String condition column 4.<p>
	 *
	 */
	public String str_cond_col4() {
		return getConstString(offset + 29, $str_cond_col4);
	}

	/**
	 * 文字列条件項目４. String condition column 4.<p>
	 *
	 */
	public void str_cond_col4(String value) {
		setConstString(offset + 29, $str_cond_col4, value);
	}

	/**
	 * 文字列条件項目５. String condition column 5.<p>
	 *
	 */
	public String str_cond_col5() {
		return getConstString(offset + 30, $str_cond_col5);
	}

	/**
	 * 文字列条件項目５. String condition column 5.<p>
	 *
	 */
	public void str_cond_col5(String value) {
		setConstString(offset + 30, $str_cond_col5, value);
	}

	/**
	 * 数値条件項目１. Numerical condition column 1.<p>
	 *
	 */
	public String num_cond_col1() {
		return getConstString(offset + 31, $num_cond_col1);
	}

	/**
	 * 数値条件項目１. Numerical condition column 1.<p>
	 *
	 */
	public void num_cond_col1(String value) {
		setConstString(offset + 31, $num_cond_col1, value);
	}

	/**
	 * 数値条件項目２. Numerical condition column 2.<p>
	 *
	 */
	public String num_cond_col2() {
		return getConstString(offset + 32, $num_cond_col2);
	}

	/**
	 * 数値条件項目２. Numerical condition column 2.<p>
	 *
	 */
	public void num_cond_col2(String value) {
		setConstString(offset + 32, $num_cond_col2, value);
	}

	/**
	 * 数値条件項目３. Numerical condition column 3.<p>
	 *
	 */
	public String num_cond_col3() {
		return getConstString(offset + 33, $num_cond_col3);
	}

	/**
	 * 数値条件項目３. Numerical condition column 3.<p>
	 *
	 */
	public void num_cond_col3(String value) {
		setConstString(offset + 33, $num_cond_col3, value);
	}

	/**
	 * 数値条件項目４. Numerical condition column 4.<p>
	 *
	 */
	public String num_cond_col4() {
		return getConstString(offset + 34, $num_cond_col4);
	}

	/**
	 * 数値条件項目４. Numerical condition column 4.<p>
	 *
	 */
	public void num_cond_col4(String value) {
		setConstString(offset + 34, $num_cond_col4, value);
	}

	/**
	 * 数値条件項目５. Numerical condition column 5.<p>
	 *
	 */
	public String num_cond_col5() {
		return getConstString(offset + 35, $num_cond_col5);
	}

	/**
	 * 数値条件項目５. Numerical condition column 5.<p>
	 *
	 */
	public void num_cond_col5(String value) {
		setConstString(offset + 35, $num_cond_col5, value);
	}

	/**
	 * フラグ条件項目１. Flg. criteria column 1.<p>
	 *
	 */
	public String flg_cond_col1() {
		return getConstString(offset + 36, $flg_cond_col1);
	}

	/**
	 * フラグ条件項目１. Flg. criteria column 1.<p>
	 *
	 */
	public void flg_cond_col1(String value) {
		setConstString(offset + 36, $flg_cond_col1, value);
	}

	/**
	 * フラグ条件項目２. Flg. criteria column 2.<p>
	 *
	 */
	public String flg_cond_col2() {
		return getConstString(offset + 37, $flg_cond_col2);
	}

	/**
	 * フラグ条件項目２. Flg. criteria column 2.<p>
	 *
	 */
	public void flg_cond_col2(String value) {
		setConstString(offset + 37, $flg_cond_col2, value);
	}

	/**
	 * フラグ条件項目３. Flg. criteria column 3.<p>
	 *
	 */
	public String flg_cond_col3() {
		return getConstString(offset + 38, $flg_cond_col3);
	}

	/**
	 * フラグ条件項目３. Flg. criteria column 3.<p>
	 *
	 */
	public void flg_cond_col3(String value) {
		setConstString(offset + 38, $flg_cond_col3, value);
	}

	/**
	 * フラグ条件項目４. Flg. criteria column 4.<p>
	 *
	 */
	public String flg_cond_col4() {
		return getConstString(offset + 39, $flg_cond_col4);
	}

	/**
	 * フラグ条件項目４. Flg. criteria column 4.<p>
	 *
	 */
	public void flg_cond_col4(String value) {
		setConstString(offset + 39, $flg_cond_col4, value);
	}

	/**
	 * フラグ条件項目５. Flg. criteria column 5.<p>
	 *
	 */
	public String flg_cond_col5() {
		return getConstString(offset + 40, $flg_cond_col5);
	}

	/**
	 * フラグ条件項目５. Flg. criteria column 5.<p>
	 *
	 */
	public void flg_cond_col5(String value) {
		setConstString(offset + 40, $flg_cond_col5, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 41, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 41, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 42, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 42, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 43, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 43, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 44, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 44, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 45, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 45, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 45, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 45, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 45, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 45, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 46, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 46, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 47, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 47, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 48, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 48, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 49, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 49, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 50, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 50, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			return logic_id();
		}
		if ($func_actyp.equalsIgnoreCase(name)) {
			return func_actyp();
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			return biz_dat_get_typ();
		}
		if ($operation.equalsIgnoreCase(name)) {
			return operation();
		}
		if ($res_path.equalsIgnoreCase(name)) {
			return res_path();
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			return form_file_nm();
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			return cartridge();
		}
		if ($dt_cond_col1.equalsIgnoreCase(name)) {
			return dt_cond_col1();
		}
		if ($dt_cond_col2.equalsIgnoreCase(name)) {
			return dt_cond_col2();
		}
		if ($dt_cond_col3.equalsIgnoreCase(name)) {
			return dt_cond_col3();
		}
		if ($dt_cond_col4.equalsIgnoreCase(name)) {
			return dt_cond_col4();
		}
		if ($dt_cond_col5.equalsIgnoreCase(name)) {
			return dt_cond_col5();
		}
		if ($dt_cond_col6.equalsIgnoreCase(name)) {
			return dt_cond_col6();
		}
		if ($dt_cond_col7.equalsIgnoreCase(name)) {
			return dt_cond_col7();
		}
		if ($dt_cond_col8.equalsIgnoreCase(name)) {
			return dt_cond_col8();
		}
		if ($dt_cond_col9.equalsIgnoreCase(name)) {
			return dt_cond_col9();
		}
		if ($dt_cond_col10.equalsIgnoreCase(name)) {
			return dt_cond_col10();
		}
		if ($str_cond_col1.equalsIgnoreCase(name)) {
			return str_cond_col1();
		}
		if ($str_cond_col2.equalsIgnoreCase(name)) {
			return str_cond_col2();
		}
		if ($str_cond_col3.equalsIgnoreCase(name)) {
			return str_cond_col3();
		}
		if ($str_cond_col4.equalsIgnoreCase(name)) {
			return str_cond_col4();
		}
		if ($str_cond_col5.equalsIgnoreCase(name)) {
			return str_cond_col5();
		}
		if ($num_cond_col1.equalsIgnoreCase(name)) {
			return num_cond_col1();
		}
		if ($num_cond_col2.equalsIgnoreCase(name)) {
			return num_cond_col2();
		}
		if ($num_cond_col3.equalsIgnoreCase(name)) {
			return num_cond_col3();
		}
		if ($num_cond_col4.equalsIgnoreCase(name)) {
			return num_cond_col4();
		}
		if ($num_cond_col5.equalsIgnoreCase(name)) {
			return num_cond_col5();
		}
		if ($flg_cond_col1.equalsIgnoreCase(name)) {
			return flg_cond_col1();
		}
		if ($flg_cond_col2.equalsIgnoreCase(name)) {
			return flg_cond_col2();
		}
		if ($flg_cond_col3.equalsIgnoreCase(name)) {
			return flg_cond_col3();
		}
		if ($flg_cond_col4.equalsIgnoreCase(name)) {
			return flg_cond_col4();
		}
		if ($flg_cond_col5.equalsIgnoreCase(name)) {
			return flg_cond_col5();
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
		if ($print_flg.equalsIgnoreCase(name)) {
			return print_flg();
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			return dwnld_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			return logic_id();
		}
		if ($func_actyp.equalsIgnoreCase(name)) {
			return func_actyp();
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			return biz_dat_get_typ();
		}
		if ($operation.equalsIgnoreCase(name)) {
			return operation();
		}
		if ($res_path.equalsIgnoreCase(name)) {
			return res_path();
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			return form_file_nm();
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			return cartridge();
		}
		if ($dt_cond_col1.equalsIgnoreCase(name)) {
			return dt_cond_col1();
		}
		if ($dt_cond_col2.equalsIgnoreCase(name)) {
			return dt_cond_col2();
		}
		if ($dt_cond_col3.equalsIgnoreCase(name)) {
			return dt_cond_col3();
		}
		if ($dt_cond_col4.equalsIgnoreCase(name)) {
			return dt_cond_col4();
		}
		if ($dt_cond_col5.equalsIgnoreCase(name)) {
			return dt_cond_col5();
		}
		if ($dt_cond_col6.equalsIgnoreCase(name)) {
			return dt_cond_col6();
		}
		if ($dt_cond_col7.equalsIgnoreCase(name)) {
			return dt_cond_col7();
		}
		if ($dt_cond_col8.equalsIgnoreCase(name)) {
			return dt_cond_col8();
		}
		if ($dt_cond_col9.equalsIgnoreCase(name)) {
			return dt_cond_col9();
		}
		if ($dt_cond_col10.equalsIgnoreCase(name)) {
			return dt_cond_col10();
		}
		if ($str_cond_col1.equalsIgnoreCase(name)) {
			return str_cond_col1();
		}
		if ($str_cond_col2.equalsIgnoreCase(name)) {
			return str_cond_col2();
		}
		if ($str_cond_col3.equalsIgnoreCase(name)) {
			return str_cond_col3();
		}
		if ($str_cond_col4.equalsIgnoreCase(name)) {
			return str_cond_col4();
		}
		if ($str_cond_col5.equalsIgnoreCase(name)) {
			return str_cond_col5();
		}
		if ($num_cond_col1.equalsIgnoreCase(name)) {
			return num_cond_col1();
		}
		if ($num_cond_col2.equalsIgnoreCase(name)) {
			return num_cond_col2();
		}
		if ($num_cond_col3.equalsIgnoreCase(name)) {
			return num_cond_col3();
		}
		if ($num_cond_col4.equalsIgnoreCase(name)) {
			return num_cond_col4();
		}
		if ($num_cond_col5.equalsIgnoreCase(name)) {
			return num_cond_col5();
		}
		if ($flg_cond_col1.equalsIgnoreCase(name)) {
			return flg_cond_col1();
		}
		if ($flg_cond_col2.equalsIgnoreCase(name)) {
			return flg_cond_col2();
		}
		if ($flg_cond_col3.equalsIgnoreCase(name)) {
			return flg_cond_col3();
		}
		if ($flg_cond_col4.equalsIgnoreCase(name)) {
			return flg_cond_col4();
		}
		if ($flg_cond_col5.equalsIgnoreCase(name)) {
			return flg_cond_col5();
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
		if ($print_flg.equalsIgnoreCase(name)) {
			return print_flg();
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			return dwnld_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			biz_dat_nm(value);
			return;
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			logic_id(value);
			return;
		}
		if ($func_actyp.equalsIgnoreCase(name)) {
			func_actyp(value);
			return;
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			biz_dat_get_typ(value);
			return;
		}
		if ($operation.equalsIgnoreCase(name)) {
			operation(value);
			return;
		}
		if ($res_path.equalsIgnoreCase(name)) {
			res_path(value);
			return;
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			form_file_nm(value);
			return;
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			cartridge(value);
			return;
		}
		if ($dt_cond_col1.equalsIgnoreCase(name)) {
			dt_cond_col1(value);
			return;
		}
		if ($dt_cond_col2.equalsIgnoreCase(name)) {
			dt_cond_col2(value);
			return;
		}
		if ($dt_cond_col3.equalsIgnoreCase(name)) {
			dt_cond_col3(value);
			return;
		}
		if ($dt_cond_col4.equalsIgnoreCase(name)) {
			dt_cond_col4(value);
			return;
		}
		if ($dt_cond_col5.equalsIgnoreCase(name)) {
			dt_cond_col5(value);
			return;
		}
		if ($dt_cond_col6.equalsIgnoreCase(name)) {
			dt_cond_col6(value);
			return;
		}
		if ($dt_cond_col7.equalsIgnoreCase(name)) {
			dt_cond_col7(value);
			return;
		}
		if ($dt_cond_col8.equalsIgnoreCase(name)) {
			dt_cond_col8(value);
			return;
		}
		if ($dt_cond_col9.equalsIgnoreCase(name)) {
			dt_cond_col9(value);
			return;
		}
		if ($dt_cond_col10.equalsIgnoreCase(name)) {
			dt_cond_col10(value);
			return;
		}
		if ($str_cond_col1.equalsIgnoreCase(name)) {
			str_cond_col1(value);
			return;
		}
		if ($str_cond_col2.equalsIgnoreCase(name)) {
			str_cond_col2(value);
			return;
		}
		if ($str_cond_col3.equalsIgnoreCase(name)) {
			str_cond_col3(value);
			return;
		}
		if ($str_cond_col4.equalsIgnoreCase(name)) {
			str_cond_col4(value);
			return;
		}
		if ($str_cond_col5.equalsIgnoreCase(name)) {
			str_cond_col5(value);
			return;
		}
		if ($num_cond_col1.equalsIgnoreCase(name)) {
			num_cond_col1(value);
			return;
		}
		if ($num_cond_col2.equalsIgnoreCase(name)) {
			num_cond_col2(value);
			return;
		}
		if ($num_cond_col3.equalsIgnoreCase(name)) {
			num_cond_col3(value);
			return;
		}
		if ($num_cond_col4.equalsIgnoreCase(name)) {
			num_cond_col4(value);
			return;
		}
		if ($num_cond_col5.equalsIgnoreCase(name)) {
			num_cond_col5(value);
			return;
		}
		if ($flg_cond_col1.equalsIgnoreCase(name)) {
			flg_cond_col1(value);
			return;
		}
		if ($flg_cond_col2.equalsIgnoreCase(name)) {
			flg_cond_col2(value);
			return;
		}
		if ($flg_cond_col3.equalsIgnoreCase(name)) {
			flg_cond_col3(value);
			return;
		}
		if ($flg_cond_col4.equalsIgnoreCase(name)) {
			flg_cond_col4(value);
			return;
		}
		if ($flg_cond_col5.equalsIgnoreCase(name)) {
			flg_cond_col5(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
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
		if ($print_flg.equalsIgnoreCase(name)) {
			print_flg(value);
			return;
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			dwnld_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			biz_dat_nm(value);
			return;
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			logic_id(value);
			return;
		}
		if ($func_actyp.equalsIgnoreCase(name)) {
			func_actyp(value);
			return;
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			biz_dat_get_typ(value);
			return;
		}
		if ($operation.equalsIgnoreCase(name)) {
			operation(value);
			return;
		}
		if ($res_path.equalsIgnoreCase(name)) {
			res_path(value);
			return;
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			form_file_nm(value);
			return;
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			cartridge(value);
			return;
		}
		if ($dt_cond_col1.equalsIgnoreCase(name)) {
			dt_cond_col1(value);
			return;
		}
		if ($dt_cond_col2.equalsIgnoreCase(name)) {
			dt_cond_col2(value);
			return;
		}
		if ($dt_cond_col3.equalsIgnoreCase(name)) {
			dt_cond_col3(value);
			return;
		}
		if ($dt_cond_col4.equalsIgnoreCase(name)) {
			dt_cond_col4(value);
			return;
		}
		if ($dt_cond_col5.equalsIgnoreCase(name)) {
			dt_cond_col5(value);
			return;
		}
		if ($dt_cond_col6.equalsIgnoreCase(name)) {
			dt_cond_col6(value);
			return;
		}
		if ($dt_cond_col7.equalsIgnoreCase(name)) {
			dt_cond_col7(value);
			return;
		}
		if ($dt_cond_col8.equalsIgnoreCase(name)) {
			dt_cond_col8(value);
			return;
		}
		if ($dt_cond_col9.equalsIgnoreCase(name)) {
			dt_cond_col9(value);
			return;
		}
		if ($dt_cond_col10.equalsIgnoreCase(name)) {
			dt_cond_col10(value);
			return;
		}
		if ($str_cond_col1.equalsIgnoreCase(name)) {
			str_cond_col1(value);
			return;
		}
		if ($str_cond_col2.equalsIgnoreCase(name)) {
			str_cond_col2(value);
			return;
		}
		if ($str_cond_col3.equalsIgnoreCase(name)) {
			str_cond_col3(value);
			return;
		}
		if ($str_cond_col4.equalsIgnoreCase(name)) {
			str_cond_col4(value);
			return;
		}
		if ($str_cond_col5.equalsIgnoreCase(name)) {
			str_cond_col5(value);
			return;
		}
		if ($num_cond_col1.equalsIgnoreCase(name)) {
			num_cond_col1(value);
			return;
		}
		if ($num_cond_col2.equalsIgnoreCase(name)) {
			num_cond_col2(value);
			return;
		}
		if ($num_cond_col3.equalsIgnoreCase(name)) {
			num_cond_col3(value);
			return;
		}
		if ($num_cond_col4.equalsIgnoreCase(name)) {
			num_cond_col4(value);
			return;
		}
		if ($num_cond_col5.equalsIgnoreCase(name)) {
			num_cond_col5(value);
			return;
		}
		if ($flg_cond_col1.equalsIgnoreCase(name)) {
			flg_cond_col1(value);
			return;
		}
		if ($flg_cond_col2.equalsIgnoreCase(name)) {
			flg_cond_col2(value);
			return;
		}
		if ($flg_cond_col3.equalsIgnoreCase(name)) {
			flg_cond_col3(value);
			return;
		}
		if ($flg_cond_col4.equalsIgnoreCase(name)) {
			flg_cond_col4(value);
			return;
		}
		if ($flg_cond_col5.equalsIgnoreCase(name)) {
			flg_cond_col5(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
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
		if ($print_flg.equalsIgnoreCase(name)) {
			print_flg(value);
			return;
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			dwnld_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
