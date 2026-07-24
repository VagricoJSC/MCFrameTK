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
 * "勘定科目マスタ // Account master"DBコンテナRowクラスです。<p>
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
 *  	<td>ac_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>勘定科目ＣＤ</td>
 *  	<td>Account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>勘定科目名</td>
 *  	<td>Account name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_ac_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>勘定科目名（ベース）</td>
 *  	<td>Account name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_nm2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目略名</td>
 *  	<td>Account abbreviation name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_ac_nm2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目略名（ベース）</td>
 *  	<td>Account abbreviation name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>貸借区分</td>
 *  	<td>Debit and credit type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>補助科目使用ＦＬＧ</td>
 *  	<td>Subsidiary account used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目区分</td>
 *  	<td>Account type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計税ＣＤ</td>
 *  	<td>Accounting tax cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_tax_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計税区分</td>
 *  	<td>Accounting tax type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>foreign_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外貨ＦＬＧ</td>
 *  	<td>Foreign currency flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sum0_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計０使用ＦＬＧ</td>
 *  	<td>Aggregated 0 used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sum1_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計１使用ＦＬＧ</td>
 *  	<td>Aggregated 1 used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sum2_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計２使用ＦＬＧ</td>
 *  	<td>Aggregated 2 used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sum3_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計３使用ＦＬＧ</td>
 *  	<td>Aggregated 3 used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sum4_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計４使用ＦＬＧ</td>
 *  	<td>Aggregated 4 used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sum5_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計５使用ＦＬＧ</td>
 *  	<td>Aggregated 5 used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>project_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>プロジェクト使用ＦＬＧ</td>
 *  	<td>Project used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先使用ＦＬＧ</td>
 *  	<td>BP used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>担当者使用ＦＬＧ</td>
 *  	<td>PIC used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bank_ac_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>口座使用ＦＬＧ</td>
 *  	<td>Bank account used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_typ</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＡＰ科目区分</td>
 *  	<td>AP type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_typ</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＡＲ科目区分</td>
 *  	<td>AR type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_typ1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>科目予備区分１</td>
 *  	<td>Account spare type 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_typ2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>科目予備区分２</td>
 *  	<td>Account spare type 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_typ3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>科目予備区分３</td>
 *  	<td>Account spare type 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_typ4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>科目予備区分４</td>
 *  	<td>Account spare type 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_typ5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>科目予備区分５</td>
 *  	<td>Account spare type 5</td>
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
 *  	<td>ac_nm_lcl</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LCL.AC_NM</td>
 *  	<td>勘定科目名(ローカライズ）</td>
 *  	<td>Account name (Localize)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_nm2_lcl</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td>LCL.AC_NM2</td>
 *  	<td>勘定科目略名(ローカライズ）</td>
 *  	<td>Account abbreviation name (Localize)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>AC_TAX1.AC_TAX_NM</td>
 *  	<td>会計税名</td>
 *  	<td>Accounting tax name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_ACCOUNT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_ACCOUNT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 勘定科目ＣＤ. Account cd..<p>
	 *
	 */
	public static final String $ac_cd = "ac_cd";
	private static final MCPermColumnInfo _ac_cd = createColumnInfo("ac_cd");
	public final MCStringPermColumn ac_cd = createStringColumn(_ac_cd);
	
	/**
	 * 勘定科目名. Account name.<p>
	 *
	 */
	public static final String $ac_nm = "ac_nm";
	private static final MCPermColumnInfo _ac_nm = createColumnInfo("ac_nm");
	public final MCStringPermColumn ac_nm = createStringColumn(_ac_nm);
	
	/**
	 * 勘定科目名（ベース）. Account name(Base).<p>
	 *
	 */
	public static final String $base_ac_nm = "base_ac_nm";
	private static final MCPermColumnInfo _base_ac_nm = createColumnInfo("base_ac_nm");
	public final MCStringPermColumn base_ac_nm = createStringColumn(_base_ac_nm);
	
	/**
	 * 勘定科目略名. Account abbreviation name.<p>
	 *
	 */
	public static final String $ac_nm2 = "ac_nm2";
	private static final MCPermColumnInfo _ac_nm2 = createColumnInfo("ac_nm2");
	public final MCStringPermColumn ac_nm2 = createStringColumn(_ac_nm2);
	
	/**
	 * 勘定科目略名（ベース）. Account abbreviation name(Base).<p>
	 *
	 */
	public static final String $base_ac_nm2 = "base_ac_nm2";
	private static final MCPermColumnInfo _base_ac_nm2 = createColumnInfo("base_ac_nm2");
	public final MCStringPermColumn base_ac_nm2 = createStringColumn(_base_ac_nm2);
	
	/**
	 * 貸借区分. Debit and credit type.<p>
	 *
	 */
	public static final String $dc_typ = "dc_typ";
	private static final MCPermColumnInfo _dc_typ = createColumnInfo("dc_typ");
	public final MCStringPermColumn dc_typ = createStringColumn(_dc_typ);
	
	/**
	 * 補助科目使用ＦＬＧ. Subsidiary account used flg..<p>
	 *
	 */
	public static final String $sub_flg = "sub_flg";
	private static final MCPermColumnInfo _sub_flg = createColumnInfo("sub_flg");
	public final MCBooleanPermColumn sub_flg = createBooleanColumn(_sub_flg);
	
	/**
	 * 勘定科目区分. Account type.<p>
	 *
	 */
	public static final String $ac_typ = "ac_typ";
	private static final MCPermColumnInfo _ac_typ = createColumnInfo("ac_typ");
	public final MCStringPermColumn ac_typ = createStringColumn(_ac_typ);
	
	/**
	 * 会計税ＣＤ. Accounting tax cd..<p>
	 *
	 */
	public static final String $ac_tax_cd = "ac_tax_cd";
	private static final MCPermColumnInfo _ac_tax_cd = createColumnInfo("ac_tax_cd");
	public final MCStringPermColumn ac_tax_cd = createStringColumn(_ac_tax_cd);
	
	/**
	 * 会計税区分. Accounting tax type.<p>
	 *
	 */
	public static final String $ac_tax_typ = "ac_tax_typ";
	private static final MCPermColumnInfo _ac_tax_typ = createColumnInfo("ac_tax_typ");
	public final MCStringPermColumn ac_tax_typ = createStringColumn(_ac_tax_typ);
	
	/**
	 * 外貨ＦＬＧ. Foreign currency flg..<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	private static final MCPermColumnInfo _foreign_flg = createColumnInfo("foreign_flg");
	public final MCBooleanPermColumn foreign_flg = createBooleanColumn(_foreign_flg);
	
	/**
	 * 集計０使用ＦＬＧ. Aggregated 0 used flg..<p>
	 *
	 */
	public static final String $sum0_flg = "sum0_flg";
	private static final MCPermColumnInfo _sum0_flg = createColumnInfo("sum0_flg");
	public final MCBooleanPermColumn sum0_flg = createBooleanColumn(_sum0_flg);
	
	/**
	 * 集計１使用ＦＬＧ. Aggregated 1 used flg..<p>
	 *
	 */
	public static final String $sum1_flg = "sum1_flg";
	private static final MCPermColumnInfo _sum1_flg = createColumnInfo("sum1_flg");
	public final MCBooleanPermColumn sum1_flg = createBooleanColumn(_sum1_flg);
	
	/**
	 * 集計２使用ＦＬＧ. Aggregated 2 used flg..<p>
	 *
	 */
	public static final String $sum2_flg = "sum2_flg";
	private static final MCPermColumnInfo _sum2_flg = createColumnInfo("sum2_flg");
	public final MCBooleanPermColumn sum2_flg = createBooleanColumn(_sum2_flg);
	
	/**
	 * 集計３使用ＦＬＧ. Aggregated 3 used flg..<p>
	 *
	 */
	public static final String $sum3_flg = "sum3_flg";
	private static final MCPermColumnInfo _sum3_flg = createColumnInfo("sum3_flg");
	public final MCBooleanPermColumn sum3_flg = createBooleanColumn(_sum3_flg);
	
	/**
	 * 集計４使用ＦＬＧ. Aggregated 4 used flg..<p>
	 *
	 */
	public static final String $sum4_flg = "sum4_flg";
	private static final MCPermColumnInfo _sum4_flg = createColumnInfo("sum4_flg");
	public final MCBooleanPermColumn sum4_flg = createBooleanColumn(_sum4_flg);
	
	/**
	 * 集計５使用ＦＬＧ. Aggregated 5 used flg..<p>
	 *
	 */
	public static final String $sum5_flg = "sum5_flg";
	private static final MCPermColumnInfo _sum5_flg = createColumnInfo("sum5_flg");
	public final MCBooleanPermColumn sum5_flg = createBooleanColumn(_sum5_flg);
	
	/**
	 * プロジェクト使用ＦＬＧ. Project used flg..<p>
	 *
	 */
	public static final String $project_flg = "project_flg";
	private static final MCPermColumnInfo _project_flg = createColumnInfo("project_flg");
	public final MCBooleanPermColumn project_flg = createBooleanColumn(_project_flg);
	
	/**
	 * 取引先使用ＦＬＧ. BP used flg..<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	private static final MCPermColumnInfo _bp_flg = createColumnInfo("bp_flg");
	public final MCBooleanPermColumn bp_flg = createBooleanColumn(_bp_flg);
	
	/**
	 * 担当者使用ＦＬＧ. PIC used flg..<p>
	 *
	 */
	public static final String $usr_flg = "usr_flg";
	private static final MCPermColumnInfo _usr_flg = createColumnInfo("usr_flg");
	public final MCBooleanPermColumn usr_flg = createBooleanColumn(_usr_flg);
	
	/**
	 * 口座使用ＦＬＧ. Bank account used flg..<p>
	 *
	 */
	public static final String $bank_ac_flg = "bank_ac_flg";
	private static final MCPermColumnInfo _bank_ac_flg = createColumnInfo("bank_ac_flg");
	public final MCBooleanPermColumn bank_ac_flg = createBooleanColumn(_bank_ac_flg);
	
	/**
	 * ＡＰ科目区分. AP type.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	private static final MCPermColumnInfo _ap_typ = createColumnInfo("ap_typ");
	public final MCStringPermColumn ap_typ = createStringColumn(_ap_typ);
	
	/**
	 * ＡＲ科目区分. AR type.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	private static final MCPermColumnInfo _ar_typ = createColumnInfo("ar_typ");
	public final MCStringPermColumn ar_typ = createStringColumn(_ar_typ);
	
	/**
	 * 科目予備区分１. Account spare type 1.<p>
	 *
	 */
	public static final String $ac_typ1 = "ac_typ1";
	private static final MCPermColumnInfo _ac_typ1 = createColumnInfo("ac_typ1");
	public final MCStringPermColumn ac_typ1 = createStringColumn(_ac_typ1);
	
	/**
	 * 科目予備区分２. Account spare type 2.<p>
	 *
	 */
	public static final String $ac_typ2 = "ac_typ2";
	private static final MCPermColumnInfo _ac_typ2 = createColumnInfo("ac_typ2");
	public final MCStringPermColumn ac_typ2 = createStringColumn(_ac_typ2);
	
	/**
	 * 科目予備区分３. Account spare type 3.<p>
	 *
	 */
	public static final String $ac_typ3 = "ac_typ3";
	private static final MCPermColumnInfo _ac_typ3 = createColumnInfo("ac_typ3");
	public final MCStringPermColumn ac_typ3 = createStringColumn(_ac_typ3);
	
	/**
	 * 科目予備区分４. Account spare type 4.<p>
	 *
	 */
	public static final String $ac_typ4 = "ac_typ4";
	private static final MCPermColumnInfo _ac_typ4 = createColumnInfo("ac_typ4");
	public final MCStringPermColumn ac_typ4 = createStringColumn(_ac_typ4);
	
	/**
	 * 科目予備区分５. Account spare type 5.<p>
	 *
	 */
	public static final String $ac_typ5 = "ac_typ5";
	private static final MCPermColumnInfo _ac_typ5 = createColumnInfo("ac_typ5");
	public final MCStringPermColumn ac_typ5 = createStringColumn(_ac_typ5);
	
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
	 * 勘定科目名(ローカライズ）. Account name (Localize).<p>
	 *
	 */
	public static final String $ac_nm_lcl = "ac_nm_lcl";
	
	/**
	 * 勘定科目略名(ローカライズ）. Account abbreviation name (Localize).<p>
	 *
	 */
	public static final String $ac_nm2_lcl = "ac_nm2_lcl";
	
	/**
	 * 会計税名. Accounting tax name.<p>
	 *
	 */
	public static final String $ac_tax_nm = "ac_tax_nm";
	
	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta ac_nm_META = createCommonMeta($ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta base_ac_nm_META = createCommonMeta($base_ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm2_META = createCommonMeta($ac_nm2, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta base_ac_nm2_META = createCommonMeta($base_ac_nm2, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta dc_typ_META = createCommonMeta($dc_typ, mcframe.commonMA.meta.MA_META.DC_TYP);
	public static final MCMeta sub_flg_META = createCommonMeta($sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_typ_META = createCommonMeta($ac_typ, mcframe.commonMA.meta.MA_META.AC_CD_TYP);
	public static final MCMeta ac_tax_cd_META = createCommonMeta($ac_tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta ac_tax_typ_META = createCommonMeta($ac_tax_typ, mcframe.commonMA.meta.MA_META.AC_TAX_TYP);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum0_flg_META = createCommonMeta($sum0_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum1_flg_META = createCommonMeta($sum1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum2_flg_META = createCommonMeta($sum2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum3_flg_META = createCommonMeta($sum3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum4_flg_META = createCommonMeta($sum4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum5_flg_META = createCommonMeta($sum5_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta project_flg_META = createCommonMeta($project_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_flg_META = createCommonMeta($usr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bank_ac_flg_META = createCommonMeta($bank_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ1_META = createCommonMeta($ac_typ1, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ2_META = createCommonMeta($ac_typ2, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ3_META = createCommonMeta($ac_typ3, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ4_META = createCommonMeta($ac_typ4, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ5_META = createCommonMeta($ac_typ5, mcframe.commonMA.meta.MA_META.AC_TYP);
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
	public static final MCMeta ac_nm_lcl_META = createCommonMeta($ac_nm_lcl, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm2_lcl_META = createCommonMeta($ac_nm2_lcl, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta ac_tax_nm_META = createCommonMeta($ac_tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $AC_TAX1 = "AC_TAX1";
	public static final String $LCL = "LCL";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_AC_TAX",
				$AC_TAX1,
				new String[][]{
						{"ac_tax_cd", "ac_tax_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_AC_TAX_R.create("AC_TAX1");
				},
				(alias) -> {
					MAM_ACCOUNT_R own = MAM_ACCOUNT_R.create(alias);
					mcframe.serverMA.dbc.MAM_AC_TAX_R ref = mcframe.serverMA.dbc.MAM_AC_TAX_R.create("AC_TAX1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ac_tax_cd.eq(ref.ac_tax_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ACCOUNT",
				$LCL,
				new String[][]{
						{"ac_cd", "ac_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ACCOUNT_R.create("LCL");
				},
				(alias) -> {
					MAM_ACCOUNT_R own = MAM_ACCOUNT_R.create(alias);
					mcframe.serverMA.dbc.MAM_ACCOUNT_R ref = mcframe.serverMA.dbc.MAM_ACCOUNT_R.create("LCL");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ac_cd.eq(ref.ac_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_ACCOUNT_R> constMetas = new ConstMetaList<MAM_ACCOUNT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ac_cd_META,
			ac_nm_META,
			base_ac_nm_META,
			ac_nm2_META,
			base_ac_nm2_META,
			dc_typ_META,
			sub_flg_META,
			ac_typ_META,
			ac_tax_cd_META,
			ac_tax_typ_META,
			foreign_flg_META,
			sum0_flg_META,
			sum1_flg_META,
			sum2_flg_META,
			sum3_flg_META,
			sum4_flg_META,
			sum5_flg_META,
			project_flg_META,
			bp_flg_META,
			usr_flg_META,
			bank_ac_flg_META,
			ap_typ_META,
			ar_typ_META,
			ac_typ1_META,
			ac_typ2_META,
			ac_typ3_META,
			ac_typ4_META,
			ac_typ5_META,
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
			ac_nm_lcl_META,
			ac_nm2_lcl_META,
			ac_tax_nm_META
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
	protected MAM_ACCOUNT_R(ConstMetaList<? extends MAM_ACCOUNT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_ACCOUNT_R(ConstMetaList<? extends MAM_ACCOUNT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_cd,
				"ac_cd",
				ac_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_nm,
				"ac_nm",
				ac_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$base_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$base_ac_nm,
				"base_ac_nm",
				base_ac_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_nm2,
				"ac_nm2",
				ac_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$base_ac_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$base_ac_nm2,
				"base_ac_nm2",
				base_ac_nm2,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$dc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$dc_typ,
				"dc_typ",
				dc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$sub_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$sub_flg,
				"sub_flg",
				sub_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_typ,
				"ac_typ",
				ac_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_tax_cd,
				"ac_tax_cd",
				ac_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_tax_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_tax_typ,
				"ac_tax_typ",
				ac_tax_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$foreign_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$foreign_flg,
				"foreign_flg",
				foreign_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$sum0_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$sum0_flg,
				"sum0_flg",
				sum0_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$sum1_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$sum1_flg,
				"sum1_flg",
				sum1_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$sum2_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$sum2_flg,
				"sum2_flg",
				sum2_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$sum3_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$sum3_flg,
				"sum3_flg",
				sum3_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$sum4_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$sum4_flg,
				"sum4_flg",
				sum4_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$sum5_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$sum5_flg,
				"sum5_flg",
				sum5_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$project_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$project_flg,
				"project_flg",
				project_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$bp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$bp_flg,
				"bp_flg",
				bp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$usr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$usr_flg,
				"usr_flg",
				usr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$bank_ac_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$bank_ac_flg,
				"bank_ac_flg",
				bank_ac_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ap_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ap_typ,
				"ap_typ",
				ap_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ar_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ar_typ,
				"ar_typ",
				ar_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_typ1,
				"ac_typ1",
				ac_typ1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_typ2,
				"ac_typ2",
				ac_typ2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_typ3,
				"ac_typ3",
				ac_typ3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_typ4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_typ4,
				"ac_typ4",
				ac_typ4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_typ5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_typ5,
				"ac_typ5",
				ac_typ5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$memo1,
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
			MAM_ACCOUNT_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$memo2,
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
			MAM_ACCOUNT_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$memo3,
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
			MAM_ACCOUNT_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ACCOUNT_R.$del_flg,
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
			MAM_ACCOUNT_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$del_usr_id,
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
			MAM_ACCOUNT_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$del_usr_nm,
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
			MAM_ACCOUNT_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ACCOUNT_R.$del_ts,
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
			MAM_ACCOUNT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ins_usr_id,
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
			MAM_ACCOUNT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ins_usr_nm,
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
			MAM_ACCOUNT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ACCOUNT_R.$ins_ts,
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
			MAM_ACCOUNT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ins_func_id,
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
			MAM_ACCOUNT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ACCOUNT_R.$upd_cntr,
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
			MAM_ACCOUNT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$upd_usr_id,
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
			MAM_ACCOUNT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$upd_usr_nm,
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
			MAM_ACCOUNT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ACCOUNT_R.$upd_ts,
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
			MAM_ACCOUNT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$upd_func_id,
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
			MAM_ACCOUNT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$upd_srv_req_no,
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
			MAM_ACCOUNT_R.$ac_nm_lcl,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_nm_lcl,
				"ac_nm_lcl",
				null,
				false,
				true,
				false,
				false,
				true,
				"LCL.AC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_nm2_lcl,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_nm2_lcl,
				"ac_nm2_lcl",
				null,
				false,
				true,
				false,
				false,
				true,
				"LCL.AC_NM2"
			)
		);
		COLUMN_MAP.put(
			MAM_ACCOUNT_R.$ac_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ACCOUNT_R.$ac_tax_nm,
				"ac_tax_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"AC_TAX1.AC_TAX_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_ACCOUNT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_ACCOUNT_R create(String alias) {
		MAM_ACCOUNT_R row = new MAM_ACCOUNT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_ACCOUNT_R createByName(T proto) {
		MAM_ACCOUNT_R row = MAM_ACCOUNT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ACCOUNT_R clone() {
		return (MAM_ACCOUNT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ACCOUNT_R createInstance() {
		return (MAM_ACCOUNT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ACCOUNT_R getValues(String... names) {
		return (MAM_ACCOUNT_R) super.getValues(names);
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
		return true;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_ACCOUNT_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_ACCOUNT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_ACCOUNT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_ACCOUNT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 勘定科目ＣＤ. Account cd..<p>
	 *
	 */
	public String ac_cd() {
		return getConstString(offset + 0, $ac_cd);
	}

	/**
	 * 勘定科目ＣＤ. Account cd..<p>
	 *
	 */
	public void ac_cd(String value) {
		setConstString(offset + 0, $ac_cd, value);
	}

	/**
	 * 勘定科目名. Account name.<p>
	 *
	 */
	public String ac_nm() {
		return getConstString(offset + 1, $ac_nm);
	}

	/**
	 * 勘定科目名. Account name.<p>
	 *
	 */
	public void ac_nm(String value) {
		setConstString(offset + 1, $ac_nm, value);
	}

	/**
	 * 勘定科目名（ベース）. Account name(Base).<p>
	 *
	 */
	public String base_ac_nm() {
		return getConstString(offset + 2, $base_ac_nm);
	}

	/**
	 * 勘定科目名（ベース）. Account name(Base).<p>
	 *
	 */
	public void base_ac_nm(String value) {
		setConstString(offset + 2, $base_ac_nm, value);
	}

	/**
	 * 勘定科目略名. Account abbreviation name.<p>
	 *
	 */
	public String ac_nm2() {
		return getConstString(offset + 3, $ac_nm2);
	}

	/**
	 * 勘定科目略名. Account abbreviation name.<p>
	 *
	 */
	public void ac_nm2(String value) {
		setConstString(offset + 3, $ac_nm2, value);
	}

	/**
	 * 勘定科目略名（ベース）. Account abbreviation name(Base).<p>
	 *
	 */
	public String base_ac_nm2() {
		return getConstString(offset + 4, $base_ac_nm2);
	}

	/**
	 * 勘定科目略名（ベース）. Account abbreviation name(Base).<p>
	 *
	 */
	public void base_ac_nm2(String value) {
		setConstString(offset + 4, $base_ac_nm2, value);
	}

	/**
	 * 貸借区分. Debit and credit type.<p>
	 *
	 */
	public String dc_typ() {
		return getConstString(offset + 5, $dc_typ);
	}

	/**
	 * 貸借区分. Debit and credit type.<p>
	 *
	 */
	public void dc_typ(String value) {
		setConstString(offset + 5, $dc_typ, value);
	}

	/**
	 * 補助科目使用ＦＬＧ. Subsidiary account used flg..<p>
	 *
	 */
	public boolean sub_flg() {
		return getConstBoolean(offset + 6, $sub_flg);
	}

	/**
	 * 補助科目使用ＦＬＧ. Subsidiary account used flg..<p>
	 *
	 */
	public void sub_flg(boolean value) {
		setConstBoolean(offset + 6, $sub_flg, value);
	}

	/**
	 * 勘定科目区分. Account type.<p>
	 *
	 */
	public String ac_typ() {
		return getConstString(offset + 7, $ac_typ);
	}

	/**
	 * 勘定科目区分. Account type.<p>
	 *
	 */
	public void ac_typ(String value) {
		setConstString(offset + 7, $ac_typ, value);
	}

	/**
	 * 会計税ＣＤ. Accounting tax cd..<p>
	 *
	 */
	public String ac_tax_cd() {
		return getConstString(offset + 8, $ac_tax_cd);
	}

	/**
	 * 会計税ＣＤ. Accounting tax cd..<p>
	 *
	 */
	public void ac_tax_cd(String value) {
		setConstString(offset + 8, $ac_tax_cd, value);
	}

	/**
	 * 会計税区分. Accounting tax type.<p>
	 *
	 */
	public String ac_tax_typ() {
		return getConstString(offset + 9, $ac_tax_typ);
	}

	/**
	 * 会計税区分. Accounting tax type.<p>
	 *
	 */
	public void ac_tax_typ(String value) {
		setConstString(offset + 9, $ac_tax_typ, value);
	}

	/**
	 * 外貨ＦＬＧ. Foreign currency flg..<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 10, $foreign_flg);
	}

	/**
	 * 外貨ＦＬＧ. Foreign currency flg..<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 10, $foreign_flg, value);
	}

	/**
	 * 集計０使用ＦＬＧ. Aggregated 0 used flg..<p>
	 *
	 */
	public boolean sum0_flg() {
		return getConstBoolean(offset + 11, $sum0_flg);
	}

	/**
	 * 集計０使用ＦＬＧ. Aggregated 0 used flg..<p>
	 *
	 */
	public void sum0_flg(boolean value) {
		setConstBoolean(offset + 11, $sum0_flg, value);
	}

	/**
	 * 集計１使用ＦＬＧ. Aggregated 1 used flg..<p>
	 *
	 */
	public boolean sum1_flg() {
		return getConstBoolean(offset + 12, $sum1_flg);
	}

	/**
	 * 集計１使用ＦＬＧ. Aggregated 1 used flg..<p>
	 *
	 */
	public void sum1_flg(boolean value) {
		setConstBoolean(offset + 12, $sum1_flg, value);
	}

	/**
	 * 集計２使用ＦＬＧ. Aggregated 2 used flg..<p>
	 *
	 */
	public boolean sum2_flg() {
		return getConstBoolean(offset + 13, $sum2_flg);
	}

	/**
	 * 集計２使用ＦＬＧ. Aggregated 2 used flg..<p>
	 *
	 */
	public void sum2_flg(boolean value) {
		setConstBoolean(offset + 13, $sum2_flg, value);
	}

	/**
	 * 集計３使用ＦＬＧ. Aggregated 3 used flg..<p>
	 *
	 */
	public boolean sum3_flg() {
		return getConstBoolean(offset + 14, $sum3_flg);
	}

	/**
	 * 集計３使用ＦＬＧ. Aggregated 3 used flg..<p>
	 *
	 */
	public void sum3_flg(boolean value) {
		setConstBoolean(offset + 14, $sum3_flg, value);
	}

	/**
	 * 集計４使用ＦＬＧ. Aggregated 4 used flg..<p>
	 *
	 */
	public boolean sum4_flg() {
		return getConstBoolean(offset + 15, $sum4_flg);
	}

	/**
	 * 集計４使用ＦＬＧ. Aggregated 4 used flg..<p>
	 *
	 */
	public void sum4_flg(boolean value) {
		setConstBoolean(offset + 15, $sum4_flg, value);
	}

	/**
	 * 集計５使用ＦＬＧ. Aggregated 5 used flg..<p>
	 *
	 */
	public boolean sum5_flg() {
		return getConstBoolean(offset + 16, $sum5_flg);
	}

	/**
	 * 集計５使用ＦＬＧ. Aggregated 5 used flg..<p>
	 *
	 */
	public void sum5_flg(boolean value) {
		setConstBoolean(offset + 16, $sum5_flg, value);
	}

	/**
	 * プロジェクト使用ＦＬＧ. Project used flg..<p>
	 *
	 */
	public boolean project_flg() {
		return getConstBoolean(offset + 17, $project_flg);
	}

	/**
	 * プロジェクト使用ＦＬＧ. Project used flg..<p>
	 *
	 */
	public void project_flg(boolean value) {
		setConstBoolean(offset + 17, $project_flg, value);
	}

	/**
	 * 取引先使用ＦＬＧ. BP used flg..<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 18, $bp_flg);
	}

	/**
	 * 取引先使用ＦＬＧ. BP used flg..<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 18, $bp_flg, value);
	}

	/**
	 * 担当者使用ＦＬＧ. PIC used flg..<p>
	 *
	 */
	public boolean usr_flg() {
		return getConstBoolean(offset + 19, $usr_flg);
	}

	/**
	 * 担当者使用ＦＬＧ. PIC used flg..<p>
	 *
	 */
	public void usr_flg(boolean value) {
		setConstBoolean(offset + 19, $usr_flg, value);
	}

	/**
	 * 口座使用ＦＬＧ. Bank account used flg..<p>
	 *
	 */
	public boolean bank_ac_flg() {
		return getConstBoolean(offset + 20, $bank_ac_flg);
	}

	/**
	 * 口座使用ＦＬＧ. Bank account used flg..<p>
	 *
	 */
	public void bank_ac_flg(boolean value) {
		setConstBoolean(offset + 20, $bank_ac_flg, value);
	}

	/**
	 * ＡＰ科目区分. AP type.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 21, $ap_typ);
	}

	/**
	 * ＡＰ科目区分. AP type.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 21, $ap_typ, value);
	}

	/**
	 * ＡＲ科目区分. AR type.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 22, $ar_typ);
	}

	/**
	 * ＡＲ科目区分. AR type.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 22, $ar_typ, value);
	}

	/**
	 * 科目予備区分１. Account spare type 1.<p>
	 *
	 */
	public String ac_typ1() {
		return getConstString(offset + 23, $ac_typ1);
	}

	/**
	 * 科目予備区分１. Account spare type 1.<p>
	 *
	 */
	public void ac_typ1(String value) {
		setConstString(offset + 23, $ac_typ1, value);
	}

	/**
	 * 科目予備区分２. Account spare type 2.<p>
	 *
	 */
	public String ac_typ2() {
		return getConstString(offset + 24, $ac_typ2);
	}

	/**
	 * 科目予備区分２. Account spare type 2.<p>
	 *
	 */
	public void ac_typ2(String value) {
		setConstString(offset + 24, $ac_typ2, value);
	}

	/**
	 * 科目予備区分３. Account spare type 3.<p>
	 *
	 */
	public String ac_typ3() {
		return getConstString(offset + 25, $ac_typ3);
	}

	/**
	 * 科目予備区分３. Account spare type 3.<p>
	 *
	 */
	public void ac_typ3(String value) {
		setConstString(offset + 25, $ac_typ3, value);
	}

	/**
	 * 科目予備区分４. Account spare type 4.<p>
	 *
	 */
	public String ac_typ4() {
		return getConstString(offset + 26, $ac_typ4);
	}

	/**
	 * 科目予備区分４. Account spare type 4.<p>
	 *
	 */
	public void ac_typ4(String value) {
		setConstString(offset + 26, $ac_typ4, value);
	}

	/**
	 * 科目予備区分５. Account spare type 5.<p>
	 *
	 */
	public String ac_typ5() {
		return getConstString(offset + 27, $ac_typ5);
	}

	/**
	 * 科目予備区分５. Account spare type 5.<p>
	 *
	 */
	public void ac_typ5(String value) {
		setConstString(offset + 27, $ac_typ5, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 28, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 28, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 29, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 29, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 30, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 30, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 31, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 31, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 32, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 32, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 33, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 33, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 34, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 35, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 35, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 36, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 36, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 37, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 37, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 38, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 38, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 39, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 40, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 40, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 41, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 41, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 42, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 42, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 43, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 43, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 44, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 44, $upd_srv_req_no, value);
	}

	/**
	 * 勘定科目名(ローカライズ）. Account name (Localize).<p>
	 *
	 */
	public String ac_nm_lcl() {
		return getConstString(offset + 45, $ac_nm_lcl);
	}

	/**
	 * 勘定科目名(ローカライズ）. Account name (Localize).<p>
	 *
	 */
	public void ac_nm_lcl(String value) {
		setConstString(offset + 45, $ac_nm_lcl, value);
	}

	/**
	 * 勘定科目略名(ローカライズ）. Account abbreviation name (Localize).<p>
	 *
	 */
	public String ac_nm2_lcl() {
		return getConstString(offset + 46, $ac_nm2_lcl);
	}

	/**
	 * 勘定科目略名(ローカライズ）. Account abbreviation name (Localize).<p>
	 *
	 */
	public void ac_nm2_lcl(String value) {
		setConstString(offset + 46, $ac_nm2_lcl, value);
	}

	/**
	 * 会計税名. Accounting tax name.<p>
	 *
	 */
	public String ac_tax_nm() {
		return getConstString(offset + 47, $ac_tax_nm);
	}

	/**
	 * 会計税名. Accounting tax name.<p>
	 *
	 */
	public void ac_tax_nm(String value) {
		setConstString(offset + 47, $ac_tax_nm, value);
	}

	public String getString(String name) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($base_ac_nm.equalsIgnoreCase(name)) {
			return base_ac_nm();
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			return ac_nm2();
		}
		if ($base_ac_nm2.equalsIgnoreCase(name)) {
			return base_ac_nm2();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			return ac_tax_cd();
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			return ac_tax_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			return ac_typ1();
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			return ac_typ2();
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			return ac_typ3();
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			return ac_typ4();
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			return ac_typ5();
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
		if ($ac_nm_lcl.equalsIgnoreCase(name)) {
			return ac_nm_lcl();
		}
		if ($ac_nm2_lcl.equalsIgnoreCase(name)) {
			return ac_nm2_lcl();
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			return ac_tax_nm();
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
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			return sum0_flg();
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			return sum1_flg();
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			return sum2_flg();
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			return sum3_flg();
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			return sum4_flg();
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			return sum5_flg();
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			return project_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			return usr_flg();
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			return bank_ac_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($base_ac_nm.equalsIgnoreCase(name)) {
			return base_ac_nm();
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			return ac_nm2();
		}
		if ($base_ac_nm2.equalsIgnoreCase(name)) {
			return base_ac_nm2();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			return ac_tax_cd();
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			return ac_tax_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			return ac_typ1();
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			return ac_typ2();
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			return ac_typ3();
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			return ac_typ4();
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			return ac_typ5();
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
		if ($ac_nm_lcl.equalsIgnoreCase(name)) {
			return ac_nm_lcl();
		}
		if ($ac_nm2_lcl.equalsIgnoreCase(name)) {
			return ac_nm2_lcl();
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			return ac_tax_nm();
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
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			return sum0_flg();
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			return sum1_flg();
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			return sum2_flg();
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			return sum3_flg();
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			return sum4_flg();
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			return sum5_flg();
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			return project_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			return usr_flg();
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			return bank_ac_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($base_ac_nm.equalsIgnoreCase(name)) {
			base_ac_nm(value);
			return;
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			ac_nm2(value);
			return;
		}
		if ($base_ac_nm2.equalsIgnoreCase(name)) {
			base_ac_nm2(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			ac_tax_cd(value);
			return;
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			ac_tax_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			ac_typ1(value);
			return;
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			ac_typ2(value);
			return;
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			ac_typ3(value);
			return;
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			ac_typ4(value);
			return;
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			ac_typ5(value);
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
		if ($ac_nm_lcl.equalsIgnoreCase(name)) {
			ac_nm_lcl(value);
			return;
		}
		if ($ac_nm2_lcl.equalsIgnoreCase(name)) {
			ac_nm2_lcl(value);
			return;
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			ac_tax_nm(value);
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
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			sum0_flg(value);
			return;
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			sum1_flg(value);
			return;
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			sum2_flg(value);
			return;
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			sum3_flg(value);
			return;
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			sum4_flg(value);
			return;
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			sum5_flg(value);
			return;
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			project_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			usr_flg(value);
			return;
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			bank_ac_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($base_ac_nm.equalsIgnoreCase(name)) {
			base_ac_nm(value);
			return;
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			ac_nm2(value);
			return;
		}
		if ($base_ac_nm2.equalsIgnoreCase(name)) {
			base_ac_nm2(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			ac_tax_cd(value);
			return;
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			ac_tax_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			ac_typ1(value);
			return;
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			ac_typ2(value);
			return;
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			ac_typ3(value);
			return;
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			ac_typ4(value);
			return;
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			ac_typ5(value);
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
		if ($ac_nm_lcl.equalsIgnoreCase(name)) {
			ac_nm_lcl(value);
			return;
		}
		if ($ac_nm2_lcl.equalsIgnoreCase(name)) {
			ac_nm2_lcl(value);
			return;
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			ac_tax_nm(value);
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
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			sum0_flg(value);
			return;
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			sum1_flg(value);
			return;
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			sum2_flg(value);
			return;
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			sum3_flg(value);
			return;
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			sum4_flg(value);
			return;
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			sum5_flg(value);
			return;
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			project_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			usr_flg(value);
			return;
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			bank_ac_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
