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
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "業務理由マスタ送信ＩＦ // Business reason master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>biz_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務理由ＣＤ</td>
 *  	<td>Business reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務理由名</td>
 *  	<td>Business reason name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_rsn_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務理由名（ロケール１）</td>
 *  	<td>Business reason name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_rsn_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務理由名（ロケール２）</td>
 *  	<td>Business reason name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_rsn_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務理由名（ロケール３）</td>
 *  	<td>Business reason name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_rsn_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務理由名（ロケール４）</td>
 *  	<td>Business reason name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_rsn_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務理由名（ロケール５）</td>
 *  	<td>Business reason name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由ＣＤ</td>
 *  	<td>Accounting reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名</td>
 *  	<td>Accounting reason name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名（ロケール１）</td>
 *  	<td>Accounting reason name (Locale 1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_rsn_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名（ロケール２）</td>
 *  	<td>Accounting reason name (Locale 2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名（ロケール３）</td>
 *  	<td>Accounting reason name (Locale 3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_rsn_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名（ロケール４）</td>
 *  	<td>Accounting reason name (Locale 4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名（ロケール５）</td>
 *  	<td>Accounting reason name (Locale 5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入ＦＬＧ</td>
 *  	<td>Purchase flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_rtn_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入返品ＦＬＧ</td>
 *  	<td>Purchase return flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xpns_purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>経費購買ＦＬＧ</td>
 *  	<td>Expenses purchasing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_xpns_purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注紐付経費購買ＦＬＧ</td>
 *  	<td>Expense purchase (pegged to sales order) flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dscnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入調整ＦＬＧ</td>
 *  	<td>Purchase adjustment flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_dscnt_loc_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入調整管轄区分</td>
 *  	<td>Purchase adjustment controlling site type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上ＦＬＧ</td>
 *  	<td>Sales flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_rtn_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上返品ＦＬＧ</td>
 *  	<td>Sales return flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_acxfr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売他勘定ＦＬＧ</td>
 *  	<td>Sales other accounting flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_dscnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上調整ＦＬＧ</td>
 *  	<td>Sales adjustment flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>acxfr_gr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>他勘定入庫ＦＬＧ</td>
 *  	<td>Other accounting GR flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>acxfr_gi_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>他勘定出庫ＦＬＧ</td>
 *  	<td>Other accounting GI flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>disp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>廃棄ＦＬＧ</td>
 *  	<td>Disposal flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_xfr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫振替ＦＬＧ</td>
 *  	<td>Inventory transfer flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移送ＦＬＧ</td>
 *  	<td>Transport flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高ＦＬＧ</td>
 *  	<td>Output flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高区分</td>
 *  	<td>Output type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_stk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非在庫ＦＬＧ</td>
 *  	<td>MRO supply flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loss_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロスＦＬＧ</td>
 *  	<td>Loss flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fxd_loss_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>固定ロスＦＬＧ</td>
 *  	<td>Constant loss flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_lot_trace_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットトレース対象外ＦＬＧ</td>
 *  	<td>Not for lot trace flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dfct_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査不良ＦＬＧ</td>
 *  	<td>Inspection defective flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入ＦＬＧ</td>
 *  	<td>Input flg.</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_BIZ_RSN_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_BIZ_RSN_IF_ALL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 業務理由ＣＤ. Business reason cd..<p>
	 *
	 */
	public static final String $biz_rsn_cd = "biz_rsn_cd";
	private static final MCPermColumnInfo _biz_rsn_cd = createColumnInfo("biz_rsn_cd");
	public final MCStringPermColumn biz_rsn_cd = createStringColumn(_biz_rsn_cd);
	
	/**
	 * 業務理由名. Business reason name.<p>
	 *
	 */
	public static final String $biz_rsn_nm = "biz_rsn_nm";
	private static final MCPermColumnInfo _biz_rsn_nm = createColumnInfo("biz_rsn_nm");
	public final MCStringPermColumn biz_rsn_nm = createStringColumn(_biz_rsn_nm);
	
	/**
	 * 業務理由名（ロケール１）. Business reason name (Locale 1).<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl1 = "biz_rsn_nm_lcl1";
	private static final MCPermColumnInfo _biz_rsn_nm_lcl1 = createColumnInfo("biz_rsn_nm_lcl1");
	public final MCStringPermColumn biz_rsn_nm_lcl1 = createStringColumn(_biz_rsn_nm_lcl1);
	
	/**
	 * 業務理由名（ロケール２）. Business reason name (Locale 2).<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl2 = "biz_rsn_nm_lcl2";
	private static final MCPermColumnInfo _biz_rsn_nm_lcl2 = createColumnInfo("biz_rsn_nm_lcl2");
	public final MCStringPermColumn biz_rsn_nm_lcl2 = createStringColumn(_biz_rsn_nm_lcl2);
	
	/**
	 * 業務理由名（ロケール３）. Business reason name (Locale 3).<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl3 = "biz_rsn_nm_lcl3";
	private static final MCPermColumnInfo _biz_rsn_nm_lcl3 = createColumnInfo("biz_rsn_nm_lcl3");
	public final MCStringPermColumn biz_rsn_nm_lcl3 = createStringColumn(_biz_rsn_nm_lcl3);
	
	/**
	 * 業務理由名（ロケール４）. Business reason name (Locale 4).<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl4 = "biz_rsn_nm_lcl4";
	private static final MCPermColumnInfo _biz_rsn_nm_lcl4 = createColumnInfo("biz_rsn_nm_lcl4");
	public final MCStringPermColumn biz_rsn_nm_lcl4 = createStringColumn(_biz_rsn_nm_lcl4);
	
	/**
	 * 業務理由名（ロケール５）. Business reason name (Locale 5).<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl5 = "biz_rsn_nm_lcl5";
	private static final MCPermColumnInfo _biz_rsn_nm_lcl5 = createColumnInfo("biz_rsn_nm_lcl5");
	public final MCStringPermColumn biz_rsn_nm_lcl5 = createStringColumn(_biz_rsn_nm_lcl5);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	private static final MCPermColumnInfo _ac_rsn_nm = createColumnInfo("ac_rsn_nm");
	public final MCStringPermColumn ac_rsn_nm = createStringColumn(_ac_rsn_nm);
	
	/**
	 * 会計理由名（ロケール１）. Accounting reason name (Locale 1).<p>
	 *
	 */
	public static final String $ac_rsn_nm_lcl1 = "ac_rsn_nm_lcl1";
	private static final MCPermColumnInfo _ac_rsn_nm_lcl1 = createColumnInfo("ac_rsn_nm_lcl1");
	public final MCStringPermColumn ac_rsn_nm_lcl1 = createStringColumn(_ac_rsn_nm_lcl1);
	
	/**
	 * 会計理由名（ロケール２）. Accounting reason name (Locale 2).<p>
	 *
	 */
	public static final String $ac_rsn_nm_lcl2 = "ac_rsn_nm_lcl2";
	private static final MCPermColumnInfo _ac_rsn_nm_lcl2 = createColumnInfo("ac_rsn_nm_lcl2");
	public final MCStringPermColumn ac_rsn_nm_lcl2 = createStringColumn(_ac_rsn_nm_lcl2);
	
	/**
	 * 会計理由名（ロケール３）. Accounting reason name (Locale 3).<p>
	 *
	 */
	public static final String $ac_rsn_nm_lcl3 = "ac_rsn_nm_lcl3";
	private static final MCPermColumnInfo _ac_rsn_nm_lcl3 = createColumnInfo("ac_rsn_nm_lcl3");
	public final MCStringPermColumn ac_rsn_nm_lcl3 = createStringColumn(_ac_rsn_nm_lcl3);
	
	/**
	 * 会計理由名（ロケール４）. Accounting reason name (Locale 4).<p>
	 *
	 */
	public static final String $ac_rsn_nm_lcl4 = "ac_rsn_nm_lcl4";
	private static final MCPermColumnInfo _ac_rsn_nm_lcl4 = createColumnInfo("ac_rsn_nm_lcl4");
	public final MCStringPermColumn ac_rsn_nm_lcl4 = createStringColumn(_ac_rsn_nm_lcl4);
	
	/**
	 * 会計理由名（ロケール５）. Accounting reason name (Locale 5).<p>
	 *
	 */
	public static final String $ac_rsn_nm_lcl5 = "ac_rsn_nm_lcl5";
	private static final MCPermColumnInfo _ac_rsn_nm_lcl5 = createColumnInfo("ac_rsn_nm_lcl5");
	public final MCStringPermColumn ac_rsn_nm_lcl5 = createStringColumn(_ac_rsn_nm_lcl5);
	
	/**
	 * 仕入ＦＬＧ. Purchase flg..<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	private static final MCPermColumnInfo _purc_flg = createColumnInfo("purc_flg");
	public final MCBooleanPermColumn purc_flg = createBooleanColumn(_purc_flg);
	
	/**
	 * 仕入返品ＦＬＧ. Purchase return flg..<p>
	 *
	 */
	public static final String $purc_rtn_flg = "purc_rtn_flg";
	private static final MCPermColumnInfo _purc_rtn_flg = createColumnInfo("purc_rtn_flg");
	public final MCBooleanPermColumn purc_rtn_flg = createBooleanColumn(_purc_rtn_flg);
	
	/**
	 * 経費購買ＦＬＧ. Expenses purchasing flg..<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	private static final MCPermColumnInfo _xpns_purc_flg = createColumnInfo("xpns_purc_flg");
	public final MCBooleanPermColumn xpns_purc_flg = createBooleanColumn(_xpns_purc_flg);
	
	/**
	 * 受注紐付経費購買ＦＬＧ. Expense purchase (pegged to sales order) flg..<p>
	 *
	 */
	public static final String $slo_xpns_purc_flg = "slo_xpns_purc_flg";
	private static final MCPermColumnInfo _slo_xpns_purc_flg = createColumnInfo("slo_xpns_purc_flg");
	public final MCBooleanPermColumn slo_xpns_purc_flg = createBooleanColumn(_slo_xpns_purc_flg);
	
	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public static final String $purc_dscnt_flg = "purc_dscnt_flg";
	private static final MCPermColumnInfo _purc_dscnt_flg = createColumnInfo("purc_dscnt_flg");
	public final MCBooleanPermColumn purc_dscnt_flg = createBooleanColumn(_purc_dscnt_flg);
	
	/**
	 * 仕入調整管轄区分. Purchase adjustment controlling site type.<p>
	 *
	 */
	public static final String $purc_dscnt_loc_mng_typ = "purc_dscnt_loc_mng_typ";
	private static final MCPermColumnInfo _purc_dscnt_loc_mng_typ = createColumnInfo("purc_dscnt_loc_mng_typ");
	public final MCStringPermColumn purc_dscnt_loc_mng_typ = createStringColumn(_purc_dscnt_loc_mng_typ);
	
	/**
	 * 売上ＦＬＧ. Sales flg..<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	private static final MCPermColumnInfo _sls_flg = createColumnInfo("sls_flg");
	public final MCBooleanPermColumn sls_flg = createBooleanColumn(_sls_flg);
	
	/**
	 * 売上返品ＦＬＧ. Sales return flg..<p>
	 *
	 */
	public static final String $sls_rtn_flg = "sls_rtn_flg";
	private static final MCPermColumnInfo _sls_rtn_flg = createColumnInfo("sls_rtn_flg");
	public final MCBooleanPermColumn sls_rtn_flg = createBooleanColumn(_sls_rtn_flg);
	
	/**
	 * 販売他勘定ＦＬＧ. Sales other accounting flg..<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	private static final MCPermColumnInfo _sls_acxfr_flg = createColumnInfo("sls_acxfr_flg");
	public final MCBooleanPermColumn sls_acxfr_flg = createBooleanColumn(_sls_acxfr_flg);
	
	/**
	 * 売上調整ＦＬＧ. Sales adjustment flg..<p>
	 *
	 */
	public static final String $sls_dscnt_flg = "sls_dscnt_flg";
	private static final MCPermColumnInfo _sls_dscnt_flg = createColumnInfo("sls_dscnt_flg");
	public final MCBooleanPermColumn sls_dscnt_flg = createBooleanColumn(_sls_dscnt_flg);
	
	/**
	 * 他勘定入庫ＦＬＧ. Other accounting GR flg..<p>
	 *
	 */
	public static final String $acxfr_gr_flg = "acxfr_gr_flg";
	private static final MCPermColumnInfo _acxfr_gr_flg = createColumnInfo("acxfr_gr_flg");
	public final MCBooleanPermColumn acxfr_gr_flg = createBooleanColumn(_acxfr_gr_flg);
	
	/**
	 * 他勘定出庫ＦＬＧ. Other accounting GI flg..<p>
	 *
	 */
	public static final String $acxfr_gi_flg = "acxfr_gi_flg";
	private static final MCPermColumnInfo _acxfr_gi_flg = createColumnInfo("acxfr_gi_flg");
	public final MCBooleanPermColumn acxfr_gi_flg = createBooleanColumn(_acxfr_gi_flg);
	
	/**
	 * 廃棄ＦＬＧ. Disposal flg..<p>
	 *
	 */
	public static final String $disp_flg = "disp_flg";
	private static final MCPermColumnInfo _disp_flg = createColumnInfo("disp_flg");
	public final MCBooleanPermColumn disp_flg = createBooleanColumn(_disp_flg);
	
	/**
	 * 在庫振替ＦＬＧ. Inventory transfer flg..<p>
	 *
	 */
	public static final String $stk_xfr_flg = "stk_xfr_flg";
	private static final MCPermColumnInfo _stk_xfr_flg = createColumnInfo("stk_xfr_flg");
	public final MCBooleanPermColumn stk_xfr_flg = createBooleanColumn(_stk_xfr_flg);
	
	/**
	 * 移送ＦＬＧ. Transport flg..<p>
	 *
	 */
	public static final String $xfr_flg = "xfr_flg";
	private static final MCPermColumnInfo _xfr_flg = createColumnInfo("xfr_flg");
	public final MCBooleanPermColumn xfr_flg = createBooleanColumn(_xfr_flg);
	
	/**
	 * 出来高ＦＬＧ. Output flg..<p>
	 *
	 */
	public static final String $yield_flg = "yield_flg";
	private static final MCPermColumnInfo _yield_flg = createColumnInfo("yield_flg");
	public final MCBooleanPermColumn yield_flg = createBooleanColumn(_yield_flg);
	
	/**
	 * 出来高区分. Output type.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	private static final MCPermColumnInfo _yield_typ = createColumnInfo("yield_typ");
	public final MCStringPermColumn yield_typ = createStringColumn(_yield_typ);
	
	/**
	 * 非在庫ＦＬＧ. MRO supply flg..<p>
	 *
	 */
	public static final String $not_stk_flg = "not_stk_flg";
	private static final MCPermColumnInfo _not_stk_flg = createColumnInfo("not_stk_flg");
	public final MCBooleanPermColumn not_stk_flg = createBooleanColumn(_not_stk_flg);
	
	/**
	 * ロスＦＬＧ. Loss flg..<p>
	 *
	 */
	public static final String $loss_flg = "loss_flg";
	private static final MCPermColumnInfo _loss_flg = createColumnInfo("loss_flg");
	public final MCBooleanPermColumn loss_flg = createBooleanColumn(_loss_flg);
	
	/**
	 * 固定ロスＦＬＧ. Constant loss flg..<p>
	 *
	 */
	public static final String $fxd_loss_flg = "fxd_loss_flg";
	private static final MCPermColumnInfo _fxd_loss_flg = createColumnInfo("fxd_loss_flg");
	public final MCBooleanPermColumn fxd_loss_flg = createBooleanColumn(_fxd_loss_flg);
	
	/**
	 * ロットトレース対象外ＦＬＧ. Not for lot trace flg..<p>
	 *
	 */
	public static final String $not_lot_trace_flg = "not_lot_trace_flg";
	private static final MCPermColumnInfo _not_lot_trace_flg = createColumnInfo("not_lot_trace_flg");
	public final MCBooleanPermColumn not_lot_trace_flg = createBooleanColumn(_not_lot_trace_flg);
	
	/**
	 * 検査不良ＦＬＧ. Inspection defective flg..<p>
	 *
	 */
	public static final String $dfct_flg = "dfct_flg";
	private static final MCPermColumnInfo _dfct_flg = createColumnInfo("dfct_flg");
	public final MCBooleanPermColumn dfct_flg = createBooleanColumn(_dfct_flg);
	
	/**
	 * 投入ＦＬＧ. Input flg..<p>
	 *
	 */
	public static final String $inpt_flg = "inpt_flg";
	private static final MCPermColumnInfo _inpt_flg = createColumnInfo("inpt_flg");
	public final MCBooleanPermColumn inpt_flg = createBooleanColumn(_inpt_flg);
	
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
	
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta biz_rsn_cd_META = createCommonMeta($biz_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta biz_rsn_nm_META = createCommonMeta($biz_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta biz_rsn_nm_lcl1_META = createCommonMeta($biz_rsn_nm_lcl1, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta biz_rsn_nm_lcl2_META = createCommonMeta($biz_rsn_nm_lcl2, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta biz_rsn_nm_lcl3_META = createCommonMeta($biz_rsn_nm_lcl3, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta biz_rsn_nm_lcl4_META = createCommonMeta($biz_rsn_nm_lcl4, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta biz_rsn_nm_lcl5_META = createCommonMeta($biz_rsn_nm_lcl5, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_nm_lcl1_META = createCommonMeta($ac_rsn_nm_lcl1, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_nm_lcl2_META = createCommonMeta($ac_rsn_nm_lcl2, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_nm_lcl3_META = createCommonMeta($ac_rsn_nm_lcl3, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_nm_lcl4_META = createCommonMeta($ac_rsn_nm_lcl4, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_nm_lcl5_META = createCommonMeta($ac_rsn_nm_lcl5, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_rtn_flg_META = createCommonMeta($purc_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_xpns_purc_flg_META = createCommonMeta($slo_xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dscnt_flg_META = createCommonMeta($purc_dscnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dscnt_loc_mng_typ_META = createCommonMeta($purc_dscnt_loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_rtn_flg_META = createCommonMeta($sls_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dscnt_flg_META = createCommonMeta($sls_dscnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acxfr_gr_flg_META = createCommonMeta($acxfr_gr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_flg_META = createCommonMeta($disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_xfr_flg_META = createCommonMeta($stk_xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_flg_META = createCommonMeta($xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_flg_META = createCommonMeta($yield_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta not_stk_flg_META = createCommonMeta($not_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loss_flg_META = createCommonMeta($loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fxd_loss_flg_META = createCommonMeta($fxd_loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_trace_flg_META = createCommonMeta($not_lot_trace_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dfct_flg_META = createCommonMeta($dfct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_flg_META = createCommonMeta($inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_BIZ_RSN_IF_ALL_R> constMetas = new ConstMetaList<MAVM_BIZ_RSN_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			biz_rsn_cd_META,
			biz_rsn_nm_META,
			biz_rsn_nm_lcl1_META,
			biz_rsn_nm_lcl2_META,
			biz_rsn_nm_lcl3_META,
			biz_rsn_nm_lcl4_META,
			biz_rsn_nm_lcl5_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			ac_rsn_nm_lcl1_META,
			ac_rsn_nm_lcl2_META,
			ac_rsn_nm_lcl3_META,
			ac_rsn_nm_lcl4_META,
			ac_rsn_nm_lcl5_META,
			purc_flg_META,
			purc_rtn_flg_META,
			xpns_purc_flg_META,
			slo_xpns_purc_flg_META,
			purc_dscnt_flg_META,
			purc_dscnt_loc_mng_typ_META,
			sls_flg_META,
			sls_rtn_flg_META,
			sls_acxfr_flg_META,
			sls_dscnt_flg_META,
			acxfr_gr_flg_META,
			acxfr_gi_flg_META,
			disp_flg_META,
			stk_xfr_flg_META,
			xfr_flg_META,
			yield_flg_META,
			yield_typ_META,
			not_stk_flg_META,
			loss_flg_META,
			fxd_loss_flg_META,
			not_lot_trace_flg_META,
			dfct_flg_META,
			inpt_flg_META,
			memo1_META,
			memo2_META,
			memo3_META
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
	protected MAVM_BIZ_RSN_IF_ALL_R(ConstMetaList<? extends MAVM_BIZ_RSN_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_BIZ_RSN_IF_ALL_R(ConstMetaList<? extends MAVM_BIZ_RSN_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$co_cd,
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
			MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_cd,
				"biz_rsn_cd",
				biz_rsn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm,
				"biz_rsn_nm",
				biz_rsn_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm_lcl1,
				"biz_rsn_nm_lcl1",
				biz_rsn_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm_lcl2,
				"biz_rsn_nm_lcl2",
				biz_rsn_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm_lcl3,
				"biz_rsn_nm_lcl3",
				biz_rsn_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm_lcl4,
				"biz_rsn_nm_lcl4",
				biz_rsn_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$biz_rsn_nm_lcl5,
				"biz_rsn_nm_lcl5",
				biz_rsn_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_cd,
				"ac_rsn_cd",
				ac_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm,
				"ac_rsn_nm",
				ac_rsn_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm_lcl1,
				"ac_rsn_nm_lcl1",
				ac_rsn_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm_lcl2,
				"ac_rsn_nm_lcl2",
				ac_rsn_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm_lcl3,
				"ac_rsn_nm_lcl3",
				ac_rsn_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm_lcl4,
				"ac_rsn_nm_lcl4",
				ac_rsn_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$ac_rsn_nm_lcl5,
				"ac_rsn_nm_lcl5",
				ac_rsn_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$purc_flg,
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
			MAVM_BIZ_RSN_IF_ALL_R.$purc_rtn_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$purc_rtn_flg,
				"purc_rtn_flg",
				purc_rtn_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$xpns_purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$xpns_purc_flg,
				"xpns_purc_flg",
				xpns_purc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$slo_xpns_purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$slo_xpns_purc_flg,
				"slo_xpns_purc_flg",
				slo_xpns_purc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$purc_dscnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$purc_dscnt_flg,
				"purc_dscnt_flg",
				purc_dscnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$purc_dscnt_loc_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$purc_dscnt_loc_mng_typ,
				"purc_dscnt_loc_mng_typ",
				purc_dscnt_loc_mng_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$sls_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$sls_flg,
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
			MAVM_BIZ_RSN_IF_ALL_R.$sls_rtn_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$sls_rtn_flg,
				"sls_rtn_flg",
				sls_rtn_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$sls_acxfr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$sls_acxfr_flg,
				"sls_acxfr_flg",
				sls_acxfr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$sls_dscnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$sls_dscnt_flg,
				"sls_dscnt_flg",
				sls_dscnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$acxfr_gr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$acxfr_gr_flg,
				"acxfr_gr_flg",
				acxfr_gr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$acxfr_gi_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$acxfr_gi_flg,
				"acxfr_gi_flg",
				acxfr_gi_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$disp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$disp_flg,
				"disp_flg",
				disp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$stk_xfr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$stk_xfr_flg,
				"stk_xfr_flg",
				stk_xfr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$xfr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$xfr_flg,
				"xfr_flg",
				xfr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$yield_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$yield_flg,
				"yield_flg",
				yield_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$yield_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$yield_typ,
				"yield_typ",
				yield_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$not_stk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$not_stk_flg,
				"not_stk_flg",
				not_stk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$loss_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$loss_flg,
				"loss_flg",
				loss_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$fxd_loss_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$fxd_loss_flg,
				"fxd_loss_flg",
				fxd_loss_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$not_lot_trace_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$not_lot_trace_flg,
				"not_lot_trace_flg",
				not_lot_trace_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$dfct_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$dfct_flg,
				"dfct_flg",
				dfct_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_IF_ALL_R.$inpt_flg,
				"inpt_flg",
				inpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$memo1,
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
			MAVM_BIZ_RSN_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$memo2,
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
			MAVM_BIZ_RSN_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_IF_ALL_R.$memo3,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_BIZ_RSN_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_BIZ_RSN_IF_ALL_R create(String alias) {
		MAVM_BIZ_RSN_IF_ALL_R row = new MAVM_BIZ_RSN_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_BIZ_RSN_IF_ALL_R createByName(T proto) {
		MAVM_BIZ_RSN_IF_ALL_R row = MAVM_BIZ_RSN_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_BIZ_RSN_IF_ALL_R clone() {
		return (MAVM_BIZ_RSN_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_BIZ_RSN_IF_ALL_R createInstance() {
		return (MAVM_BIZ_RSN_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_BIZ_RSN_IF_ALL_R getValues(String... names) {
		return (MAVM_BIZ_RSN_IF_ALL_R) super.getValues(names);
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 0, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 0, $co_cd, value);
	}

	/**
	 * 業務理由ＣＤ. Business reason cd..<p>
	 *
	 */
	public String biz_rsn_cd() {
		return getConstString(offset + 1, $biz_rsn_cd);
	}

	/**
	 * 業務理由ＣＤ. Business reason cd..<p>
	 *
	 */
	public void biz_rsn_cd(String value) {
		setConstString(offset + 1, $biz_rsn_cd, value);
	}

	/**
	 * 業務理由名. Business reason name.<p>
	 *
	 */
	public String biz_rsn_nm() {
		return getConstString(offset + 2, $biz_rsn_nm);
	}

	/**
	 * 業務理由名. Business reason name.<p>
	 *
	 */
	public void biz_rsn_nm(String value) {
		setConstString(offset + 2, $biz_rsn_nm, value);
	}

	/**
	 * 業務理由名（ロケール１）. Business reason name (Locale 1).<p>
	 *
	 */
	public String biz_rsn_nm_lcl1() {
		return getConstString(offset + 3, $biz_rsn_nm_lcl1);
	}

	/**
	 * 業務理由名（ロケール１）. Business reason name (Locale 1).<p>
	 *
	 */
	public void biz_rsn_nm_lcl1(String value) {
		setConstString(offset + 3, $biz_rsn_nm_lcl1, value);
	}

	/**
	 * 業務理由名（ロケール２）. Business reason name (Locale 2).<p>
	 *
	 */
	public String biz_rsn_nm_lcl2() {
		return getConstString(offset + 4, $biz_rsn_nm_lcl2);
	}

	/**
	 * 業務理由名（ロケール２）. Business reason name (Locale 2).<p>
	 *
	 */
	public void biz_rsn_nm_lcl2(String value) {
		setConstString(offset + 4, $biz_rsn_nm_lcl2, value);
	}

	/**
	 * 業務理由名（ロケール３）. Business reason name (Locale 3).<p>
	 *
	 */
	public String biz_rsn_nm_lcl3() {
		return getConstString(offset + 5, $biz_rsn_nm_lcl3);
	}

	/**
	 * 業務理由名（ロケール３）. Business reason name (Locale 3).<p>
	 *
	 */
	public void biz_rsn_nm_lcl3(String value) {
		setConstString(offset + 5, $biz_rsn_nm_lcl3, value);
	}

	/**
	 * 業務理由名（ロケール４）. Business reason name (Locale 4).<p>
	 *
	 */
	public String biz_rsn_nm_lcl4() {
		return getConstString(offset + 6, $biz_rsn_nm_lcl4);
	}

	/**
	 * 業務理由名（ロケール４）. Business reason name (Locale 4).<p>
	 *
	 */
	public void biz_rsn_nm_lcl4(String value) {
		setConstString(offset + 6, $biz_rsn_nm_lcl4, value);
	}

	/**
	 * 業務理由名（ロケール５）. Business reason name (Locale 5).<p>
	 *
	 */
	public String biz_rsn_nm_lcl5() {
		return getConstString(offset + 7, $biz_rsn_nm_lcl5);
	}

	/**
	 * 業務理由名（ロケール５）. Business reason name (Locale 5).<p>
	 *
	 */
	public void biz_rsn_nm_lcl5(String value) {
		setConstString(offset + 7, $biz_rsn_nm_lcl5, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 8, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 8, $ac_rsn_cd, value);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 9, $ac_rsn_nm);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 9, $ac_rsn_nm, value);
	}

	/**
	 * 会計理由名（ロケール１）. Accounting reason name (Locale 1).<p>
	 *
	 */
	public String ac_rsn_nm_lcl1() {
		return getConstString(offset + 10, $ac_rsn_nm_lcl1);
	}

	/**
	 * 会計理由名（ロケール１）. Accounting reason name (Locale 1).<p>
	 *
	 */
	public void ac_rsn_nm_lcl1(String value) {
		setConstString(offset + 10, $ac_rsn_nm_lcl1, value);
	}

	/**
	 * 会計理由名（ロケール２）. Accounting reason name (Locale 2).<p>
	 *
	 */
	public String ac_rsn_nm_lcl2() {
		return getConstString(offset + 11, $ac_rsn_nm_lcl2);
	}

	/**
	 * 会計理由名（ロケール２）. Accounting reason name (Locale 2).<p>
	 *
	 */
	public void ac_rsn_nm_lcl2(String value) {
		setConstString(offset + 11, $ac_rsn_nm_lcl2, value);
	}

	/**
	 * 会計理由名（ロケール３）. Accounting reason name (Locale 3).<p>
	 *
	 */
	public String ac_rsn_nm_lcl3() {
		return getConstString(offset + 12, $ac_rsn_nm_lcl3);
	}

	/**
	 * 会計理由名（ロケール３）. Accounting reason name (Locale 3).<p>
	 *
	 */
	public void ac_rsn_nm_lcl3(String value) {
		setConstString(offset + 12, $ac_rsn_nm_lcl3, value);
	}

	/**
	 * 会計理由名（ロケール４）. Accounting reason name (Locale 4).<p>
	 *
	 */
	public String ac_rsn_nm_lcl4() {
		return getConstString(offset + 13, $ac_rsn_nm_lcl4);
	}

	/**
	 * 会計理由名（ロケール４）. Accounting reason name (Locale 4).<p>
	 *
	 */
	public void ac_rsn_nm_lcl4(String value) {
		setConstString(offset + 13, $ac_rsn_nm_lcl4, value);
	}

	/**
	 * 会計理由名（ロケール５）. Accounting reason name (Locale 5).<p>
	 *
	 */
	public String ac_rsn_nm_lcl5() {
		return getConstString(offset + 14, $ac_rsn_nm_lcl5);
	}

	/**
	 * 会計理由名（ロケール５）. Accounting reason name (Locale 5).<p>
	 *
	 */
	public void ac_rsn_nm_lcl5(String value) {
		setConstString(offset + 14, $ac_rsn_nm_lcl5, value);
	}

	/**
	 * 仕入ＦＬＧ. Purchase flg..<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 15, $purc_flg);
	}

	/**
	 * 仕入ＦＬＧ. Purchase flg..<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 15, $purc_flg, value);
	}

	/**
	 * 仕入返品ＦＬＧ. Purchase return flg..<p>
	 *
	 */
	public boolean purc_rtn_flg() {
		return getConstBoolean(offset + 16, $purc_rtn_flg);
	}

	/**
	 * 仕入返品ＦＬＧ. Purchase return flg..<p>
	 *
	 */
	public void purc_rtn_flg(boolean value) {
		setConstBoolean(offset + 16, $purc_rtn_flg, value);
	}

	/**
	 * 経費購買ＦＬＧ. Expenses purchasing flg..<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 17, $xpns_purc_flg);
	}

	/**
	 * 経費購買ＦＬＧ. Expenses purchasing flg..<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 17, $xpns_purc_flg, value);
	}

	/**
	 * 受注紐付経費購買ＦＬＧ. Expense purchase (pegged to sales order) flg..<p>
	 *
	 */
	public boolean slo_xpns_purc_flg() {
		return getConstBoolean(offset + 18, $slo_xpns_purc_flg);
	}

	/**
	 * 受注紐付経費購買ＦＬＧ. Expense purchase (pegged to sales order) flg..<p>
	 *
	 */
	public void slo_xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 18, $slo_xpns_purc_flg, value);
	}

	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public boolean purc_dscnt_flg() {
		return getConstBoolean(offset + 19, $purc_dscnt_flg);
	}

	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public void purc_dscnt_flg(boolean value) {
		setConstBoolean(offset + 19, $purc_dscnt_flg, value);
	}

	/**
	 * 仕入調整管轄区分. Purchase adjustment controlling site type.<p>
	 *
	 */
	public String purc_dscnt_loc_mng_typ() {
		return getConstString(offset + 20, $purc_dscnt_loc_mng_typ);
	}

	/**
	 * 仕入調整管轄区分. Purchase adjustment controlling site type.<p>
	 *
	 */
	public void purc_dscnt_loc_mng_typ(String value) {
		setConstString(offset + 20, $purc_dscnt_loc_mng_typ, value);
	}

	/**
	 * 売上ＦＬＧ. Sales flg..<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 21, $sls_flg);
	}

	/**
	 * 売上ＦＬＧ. Sales flg..<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 21, $sls_flg, value);
	}

	/**
	 * 売上返品ＦＬＧ. Sales return flg..<p>
	 *
	 */
	public boolean sls_rtn_flg() {
		return getConstBoolean(offset + 22, $sls_rtn_flg);
	}

	/**
	 * 売上返品ＦＬＧ. Sales return flg..<p>
	 *
	 */
	public void sls_rtn_flg(boolean value) {
		setConstBoolean(offset + 22, $sls_rtn_flg, value);
	}

	/**
	 * 販売他勘定ＦＬＧ. Sales other accounting flg..<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 23, $sls_acxfr_flg);
	}

	/**
	 * 販売他勘定ＦＬＧ. Sales other accounting flg..<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 23, $sls_acxfr_flg, value);
	}

	/**
	 * 売上調整ＦＬＧ. Sales adjustment flg..<p>
	 *
	 */
	public boolean sls_dscnt_flg() {
		return getConstBoolean(offset + 24, $sls_dscnt_flg);
	}

	/**
	 * 売上調整ＦＬＧ. Sales adjustment flg..<p>
	 *
	 */
	public void sls_dscnt_flg(boolean value) {
		setConstBoolean(offset + 24, $sls_dscnt_flg, value);
	}

	/**
	 * 他勘定入庫ＦＬＧ. Other accounting GR flg..<p>
	 *
	 */
	public boolean acxfr_gr_flg() {
		return getConstBoolean(offset + 25, $acxfr_gr_flg);
	}

	/**
	 * 他勘定入庫ＦＬＧ. Other accounting GR flg..<p>
	 *
	 */
	public void acxfr_gr_flg(boolean value) {
		setConstBoolean(offset + 25, $acxfr_gr_flg, value);
	}

	/**
	 * 他勘定出庫ＦＬＧ. Other accounting GI flg..<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 26, $acxfr_gi_flg);
	}

	/**
	 * 他勘定出庫ＦＬＧ. Other accounting GI flg..<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 26, $acxfr_gi_flg, value);
	}

	/**
	 * 廃棄ＦＬＧ. Disposal flg..<p>
	 *
	 */
	public boolean disp_flg() {
		return getConstBoolean(offset + 27, $disp_flg);
	}

	/**
	 * 廃棄ＦＬＧ. Disposal flg..<p>
	 *
	 */
	public void disp_flg(boolean value) {
		setConstBoolean(offset + 27, $disp_flg, value);
	}

	/**
	 * 在庫振替ＦＬＧ. Inventory transfer flg..<p>
	 *
	 */
	public boolean stk_xfr_flg() {
		return getConstBoolean(offset + 28, $stk_xfr_flg);
	}

	/**
	 * 在庫振替ＦＬＧ. Inventory transfer flg..<p>
	 *
	 */
	public void stk_xfr_flg(boolean value) {
		setConstBoolean(offset + 28, $stk_xfr_flg, value);
	}

	/**
	 * 移送ＦＬＧ. Transport flg..<p>
	 *
	 */
	public boolean xfr_flg() {
		return getConstBoolean(offset + 29, $xfr_flg);
	}

	/**
	 * 移送ＦＬＧ. Transport flg..<p>
	 *
	 */
	public void xfr_flg(boolean value) {
		setConstBoolean(offset + 29, $xfr_flg, value);
	}

	/**
	 * 出来高ＦＬＧ. Output flg..<p>
	 *
	 */
	public boolean yield_flg() {
		return getConstBoolean(offset + 30, $yield_flg);
	}

	/**
	 * 出来高ＦＬＧ. Output flg..<p>
	 *
	 */
	public void yield_flg(boolean value) {
		setConstBoolean(offset + 30, $yield_flg, value);
	}

	/**
	 * 出来高区分. Output type.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 31, $yield_typ);
	}

	/**
	 * 出来高区分. Output type.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 31, $yield_typ, value);
	}

	/**
	 * 非在庫ＦＬＧ. MRO supply flg..<p>
	 *
	 */
	public boolean not_stk_flg() {
		return getConstBoolean(offset + 32, $not_stk_flg);
	}

	/**
	 * 非在庫ＦＬＧ. MRO supply flg..<p>
	 *
	 */
	public void not_stk_flg(boolean value) {
		setConstBoolean(offset + 32, $not_stk_flg, value);
	}

	/**
	 * ロスＦＬＧ. Loss flg..<p>
	 *
	 */
	public boolean loss_flg() {
		return getConstBoolean(offset + 33, $loss_flg);
	}

	/**
	 * ロスＦＬＧ. Loss flg..<p>
	 *
	 */
	public void loss_flg(boolean value) {
		setConstBoolean(offset + 33, $loss_flg, value);
	}

	/**
	 * 固定ロスＦＬＧ. Constant loss flg..<p>
	 *
	 */
	public boolean fxd_loss_flg() {
		return getConstBoolean(offset + 34, $fxd_loss_flg);
	}

	/**
	 * 固定ロスＦＬＧ. Constant loss flg..<p>
	 *
	 */
	public void fxd_loss_flg(boolean value) {
		setConstBoolean(offset + 34, $fxd_loss_flg, value);
	}

	/**
	 * ロットトレース対象外ＦＬＧ. Not for lot trace flg..<p>
	 *
	 */
	public boolean not_lot_trace_flg() {
		return getConstBoolean(offset + 35, $not_lot_trace_flg);
	}

	/**
	 * ロットトレース対象外ＦＬＧ. Not for lot trace flg..<p>
	 *
	 */
	public void not_lot_trace_flg(boolean value) {
		setConstBoolean(offset + 35, $not_lot_trace_flg, value);
	}

	/**
	 * 検査不良ＦＬＧ. Inspection defective flg..<p>
	 *
	 */
	public boolean dfct_flg() {
		return getConstBoolean(offset + 36, $dfct_flg);
	}

	/**
	 * 検査不良ＦＬＧ. Inspection defective flg..<p>
	 *
	 */
	public void dfct_flg(boolean value) {
		setConstBoolean(offset + 36, $dfct_flg, value);
	}

	/**
	 * 投入ＦＬＧ. Input flg..<p>
	 *
	 */
	public boolean inpt_flg() {
		return getConstBoolean(offset + 37, $inpt_flg);
	}

	/**
	 * 投入ＦＬＧ. Input flg..<p>
	 *
	 */
	public void inpt_flg(boolean value) {
		setConstBoolean(offset + 37, $inpt_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 38, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 38, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 39, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 39, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 40, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 40, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			return biz_rsn_cd();
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			return biz_rsn_nm();
		}
		if ($biz_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl1();
		}
		if ($biz_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl2();
		}
		if ($biz_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl3();
		}
		if ($biz_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl4();
		}
		if ($biz_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl5();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($ac_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl1();
		}
		if ($ac_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl2();
		}
		if ($ac_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl3();
		}
		if ($ac_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl4();
		}
		if ($ac_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl5();
		}
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			return purc_dscnt_loc_mng_typ();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
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
		return super.getString(name);
	}

	public boolean getBoolean(String name) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			return purc_rtn_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			return slo_xpns_purc_flg();
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			return purc_dscnt_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			return sls_rtn_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			return sls_dscnt_flg();
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			return acxfr_gr_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			return disp_flg();
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			return stk_xfr_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			return yield_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			return loss_flg();
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			return fxd_loss_flg();
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			return not_lot_trace_flg();
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			return dfct_flg();
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			return inpt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			return biz_rsn_cd();
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			return biz_rsn_nm();
		}
		if ($biz_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl1();
		}
		if ($biz_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl2();
		}
		if ($biz_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl3();
		}
		if ($biz_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl4();
		}
		if ($biz_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl5();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($ac_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl1();
		}
		if ($ac_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl2();
		}
		if ($ac_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl3();
		}
		if ($ac_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl4();
		}
		if ($ac_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl5();
		}
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			return purc_dscnt_loc_mng_typ();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
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
		return super.getStringNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			return purc_rtn_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			return slo_xpns_purc_flg();
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			return purc_dscnt_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			return sls_rtn_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			return sls_dscnt_flg();
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			return acxfr_gr_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			return disp_flg();
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			return stk_xfr_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			return yield_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			return loss_flg();
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			return fxd_loss_flg();
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			return not_lot_trace_flg();
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			return dfct_flg();
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			return inpt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			biz_rsn_cd(value);
			return;
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			biz_rsn_nm(value);
			return;
		}
		if ($biz_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl1(value);
			return;
		}
		if ($biz_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl2(value);
			return;
		}
		if ($biz_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl3(value);
			return;
		}
		if ($biz_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl4(value);
			return;
		}
		if ($biz_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl5(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($ac_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl1(value);
			return;
		}
		if ($ac_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl2(value);
			return;
		}
		if ($ac_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl3(value);
			return;
		}
		if ($ac_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl4(value);
			return;
		}
		if ($ac_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl5(value);
			return;
		}
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			purc_dscnt_loc_mng_typ(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
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
		super.setString(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			purc_rtn_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			slo_xpns_purc_flg(value);
			return;
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			purc_dscnt_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			sls_rtn_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			sls_dscnt_flg(value);
			return;
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			acxfr_gr_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			disp_flg(value);
			return;
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			stk_xfr_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			yield_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			loss_flg(value);
			return;
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			fxd_loss_flg(value);
			return;
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			not_lot_trace_flg(value);
			return;
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			dfct_flg(value);
			return;
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			inpt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			biz_rsn_cd(value);
			return;
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			biz_rsn_nm(value);
			return;
		}
		if ($biz_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl1(value);
			return;
		}
		if ($biz_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl2(value);
			return;
		}
		if ($biz_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl3(value);
			return;
		}
		if ($biz_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl4(value);
			return;
		}
		if ($biz_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl5(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($ac_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl1(value);
			return;
		}
		if ($ac_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl2(value);
			return;
		}
		if ($ac_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl3(value);
			return;
		}
		if ($ac_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl4(value);
			return;
		}
		if ($ac_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl5(value);
			return;
		}
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			purc_dscnt_loc_mng_typ(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
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
		super.setStringNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			purc_rtn_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			slo_xpns_purc_flg(value);
			return;
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			purc_dscnt_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			sls_rtn_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			sls_dscnt_flg(value);
			return;
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			acxfr_gr_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			disp_flg(value);
			return;
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			stk_xfr_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			yield_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			loss_flg(value);
			return;
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			fxd_loss_flg(value);
			return;
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			not_lot_trace_flg(value);
			return;
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			dfct_flg(value);
			return;
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			inpt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
