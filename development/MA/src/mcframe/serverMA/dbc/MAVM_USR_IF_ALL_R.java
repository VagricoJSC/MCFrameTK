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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "担当者マスタ送信ＩＦ // PIC master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>担当者名</td>
 *  	<td>PIC name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者名（ロケール１）</td>
 *  	<td>PIC name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者名（ロケール２）</td>
 *  	<td>PIC name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者名（ロケール３）</td>
 *  	<td>PIC name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者名（ロケール４）</td>
 *  	<td>PIC name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者名（ロケール５）</td>
 *  	<td>PIC name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名１</td>
 *  	<td>PIC alias name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm1_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名１（ロケール１）</td>
 *  	<td>PIC alias name 1 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm1_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名１（ロケール２）</td>
 *  	<td>PIC alias name 1 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm1_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名１（ロケール３）</td>
 *  	<td>PIC alias name 1 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm1_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名１（ロケール４）</td>
 *  	<td>PIC alias name 1 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm1_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名１（ロケール５）</td>
 *  	<td>PIC alias name 1 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名２</td>
 *  	<td>PIC alias name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm2_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名２（ロケール１）</td>
 *  	<td>PIC alias name 2 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm2_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名２（ロケール２）</td>
 *  	<td>PIC alias name 2 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm2_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名２（ロケール３）</td>
 *  	<td>PIC alias name 2 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm2_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名２（ロケール４）</td>
 *  	<td>PIC alias name 2 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm2_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名２（ロケール５）</td>
 *  	<td>PIC alias name 2 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名３</td>
 *  	<td>PIC alias name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm3_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名３（ロケール１）</td>
 *  	<td>PIC alias name 3 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm3_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名３（ロケール２）</td>
 *  	<td>PIC alias name 3 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm3_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名３（ロケール３）</td>
 *  	<td>PIC alias name 3 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm3_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名３（ロケール４）</td>
 *  	<td>PIC alias name 3 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm3_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名３（ロケール５）</td>
 *  	<td>PIC alias name 3 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名４</td>
 *  	<td>PIC alias name 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm4_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名４（ロケール１）</td>
 *  	<td>PIC alias name 4 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm4_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名４（ロケール２）</td>
 *  	<td>PIC alias name 4 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm4_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名４（ロケール３）</td>
 *  	<td>PIC alias name 4 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm4_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名４（ロケール４）</td>
 *  	<td>PIC alias name 4 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm4_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名４（ロケール５）</td>
 *  	<td>PIC alias name 4 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１</td>
 *  	<td>PIC info. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報２</td>
 *  	<td>PIC info. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報３</td>
 *  	<td>PIC info. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報４</td>
 *  	<td>PIC info. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報５</td>
 *  	<td>PIC info. 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報６</td>
 *  	<td>PIC info. 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報７</td>
 *  	<td>PIC info. 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報８</td>
 *  	<td>PIC info. 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報９</td>
 *  	<td>PIC info. 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info10</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１０</td>
 *  	<td>PIC info. 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info11</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１１</td>
 *  	<td>PIC info. 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info12</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１２</td>
 *  	<td>PIC info. 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info13</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１３</td>
 *  	<td>PIC info. 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info14</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１４</td>
 *  	<td>PIC info. 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info15</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１５</td>
 *  	<td>PIC info. 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info16</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１６</td>
 *  	<td>PIC info. 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info17</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１７</td>
 *  	<td>PIC info. 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info18</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１８</td>
 *  	<td>PIC info. 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info19</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１９</td>
 *  	<td>PIC info. 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info20</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報２０</td>
 *  	<td>PIC info. 20</td>
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
public class MAVM_USR_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_USR_IF_ALL";

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
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	private static final MCPermColumnInfo _usr_cd = createColumnInfo("usr_cd");
	public final MCStringPermColumn usr_cd = createStringColumn(_usr_cd);
	
	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	private static final MCPermColumnInfo _usr_nm = createColumnInfo("usr_nm");
	public final MCStringPermColumn usr_nm = createStringColumn(_usr_nm);
	
	/**
	 * 担当者名（ロケール１）. PIC name (Locale 1).<p>
	 *
	 */
	public static final String $usr_nm_lcl1 = "usr_nm_lcl1";
	private static final MCPermColumnInfo _usr_nm_lcl1 = createColumnInfo("usr_nm_lcl1");
	public final MCStringPermColumn usr_nm_lcl1 = createStringColumn(_usr_nm_lcl1);
	
	/**
	 * 担当者名（ロケール２）. PIC name (Locale 2).<p>
	 *
	 */
	public static final String $usr_nm_lcl2 = "usr_nm_lcl2";
	private static final MCPermColumnInfo _usr_nm_lcl2 = createColumnInfo("usr_nm_lcl2");
	public final MCStringPermColumn usr_nm_lcl2 = createStringColumn(_usr_nm_lcl2);
	
	/**
	 * 担当者名（ロケール３）. PIC name (Locale 3).<p>
	 *
	 */
	public static final String $usr_nm_lcl3 = "usr_nm_lcl3";
	private static final MCPermColumnInfo _usr_nm_lcl3 = createColumnInfo("usr_nm_lcl3");
	public final MCStringPermColumn usr_nm_lcl3 = createStringColumn(_usr_nm_lcl3);
	
	/**
	 * 担当者名（ロケール４）. PIC name (Locale 4).<p>
	 *
	 */
	public static final String $usr_nm_lcl4 = "usr_nm_lcl4";
	private static final MCPermColumnInfo _usr_nm_lcl4 = createColumnInfo("usr_nm_lcl4");
	public final MCStringPermColumn usr_nm_lcl4 = createStringColumn(_usr_nm_lcl4);
	
	/**
	 * 担当者名（ロケール５）. PIC name (Locale 5).<p>
	 *
	 */
	public static final String $usr_nm_lcl5 = "usr_nm_lcl5";
	private static final MCPermColumnInfo _usr_nm_lcl5 = createColumnInfo("usr_nm_lcl5");
	public final MCStringPermColumn usr_nm_lcl5 = createStringColumn(_usr_nm_lcl5);
	
	/**
	 * 担当者別名１. PIC alias name 1.<p>
	 *
	 */
	public static final String $usr_alt_nm1 = "usr_alt_nm1";
	private static final MCPermColumnInfo _usr_alt_nm1 = createColumnInfo("usr_alt_nm1");
	public final MCStringPermColumn usr_alt_nm1 = createStringColumn(_usr_alt_nm1);
	
	/**
	 * 担当者別名１（ロケール１）. PIC alias name 1 (Locale 1).<p>
	 *
	 */
	public static final String $usr_alt_nm1_lcl1 = "usr_alt_nm1_lcl1";
	private static final MCPermColumnInfo _usr_alt_nm1_lcl1 = createColumnInfo("usr_alt_nm1_lcl1");
	public final MCStringPermColumn usr_alt_nm1_lcl1 = createStringColumn(_usr_alt_nm1_lcl1);
	
	/**
	 * 担当者別名１（ロケール２）. PIC alias name 1 (Locale 2).<p>
	 *
	 */
	public static final String $usr_alt_nm1_lcl2 = "usr_alt_nm1_lcl2";
	private static final MCPermColumnInfo _usr_alt_nm1_lcl2 = createColumnInfo("usr_alt_nm1_lcl2");
	public final MCStringPermColumn usr_alt_nm1_lcl2 = createStringColumn(_usr_alt_nm1_lcl2);
	
	/**
	 * 担当者別名１（ロケール３）. PIC alias name 1 (Locale 3).<p>
	 *
	 */
	public static final String $usr_alt_nm1_lcl3 = "usr_alt_nm1_lcl3";
	private static final MCPermColumnInfo _usr_alt_nm1_lcl3 = createColumnInfo("usr_alt_nm1_lcl3");
	public final MCStringPermColumn usr_alt_nm1_lcl3 = createStringColumn(_usr_alt_nm1_lcl3);
	
	/**
	 * 担当者別名１（ロケール４）. PIC alias name 1 (Locale 4).<p>
	 *
	 */
	public static final String $usr_alt_nm1_lcl4 = "usr_alt_nm1_lcl4";
	private static final MCPermColumnInfo _usr_alt_nm1_lcl4 = createColumnInfo("usr_alt_nm1_lcl4");
	public final MCStringPermColumn usr_alt_nm1_lcl4 = createStringColumn(_usr_alt_nm1_lcl4);
	
	/**
	 * 担当者別名１（ロケール５）. PIC alias name 1 (Locale 5).<p>
	 *
	 */
	public static final String $usr_alt_nm1_lcl5 = "usr_alt_nm1_lcl5";
	private static final MCPermColumnInfo _usr_alt_nm1_lcl5 = createColumnInfo("usr_alt_nm1_lcl5");
	public final MCStringPermColumn usr_alt_nm1_lcl5 = createStringColumn(_usr_alt_nm1_lcl5);
	
	/**
	 * 担当者別名２. PIC alias name 2.<p>
	 *
	 */
	public static final String $usr_alt_nm2 = "usr_alt_nm2";
	private static final MCPermColumnInfo _usr_alt_nm2 = createColumnInfo("usr_alt_nm2");
	public final MCStringPermColumn usr_alt_nm2 = createStringColumn(_usr_alt_nm2);
	
	/**
	 * 担当者別名２（ロケール１）. PIC alias name 2 (Locale 1).<p>
	 *
	 */
	public static final String $usr_alt_nm2_lcl1 = "usr_alt_nm2_lcl1";
	private static final MCPermColumnInfo _usr_alt_nm2_lcl1 = createColumnInfo("usr_alt_nm2_lcl1");
	public final MCStringPermColumn usr_alt_nm2_lcl1 = createStringColumn(_usr_alt_nm2_lcl1);
	
	/**
	 * 担当者別名２（ロケール２）. PIC alias name 2 (Locale 2).<p>
	 *
	 */
	public static final String $usr_alt_nm2_lcl2 = "usr_alt_nm2_lcl2";
	private static final MCPermColumnInfo _usr_alt_nm2_lcl2 = createColumnInfo("usr_alt_nm2_lcl2");
	public final MCStringPermColumn usr_alt_nm2_lcl2 = createStringColumn(_usr_alt_nm2_lcl2);
	
	/**
	 * 担当者別名２（ロケール３）. PIC alias name 2 (Locale 3).<p>
	 *
	 */
	public static final String $usr_alt_nm2_lcl3 = "usr_alt_nm2_lcl3";
	private static final MCPermColumnInfo _usr_alt_nm2_lcl3 = createColumnInfo("usr_alt_nm2_lcl3");
	public final MCStringPermColumn usr_alt_nm2_lcl3 = createStringColumn(_usr_alt_nm2_lcl3);
	
	/**
	 * 担当者別名２（ロケール４）. PIC alias name 2 (Locale 4).<p>
	 *
	 */
	public static final String $usr_alt_nm2_lcl4 = "usr_alt_nm2_lcl4";
	private static final MCPermColumnInfo _usr_alt_nm2_lcl4 = createColumnInfo("usr_alt_nm2_lcl4");
	public final MCStringPermColumn usr_alt_nm2_lcl4 = createStringColumn(_usr_alt_nm2_lcl4);
	
	/**
	 * 担当者別名２（ロケール５）. PIC alias name 2 (Locale 5).<p>
	 *
	 */
	public static final String $usr_alt_nm2_lcl5 = "usr_alt_nm2_lcl5";
	private static final MCPermColumnInfo _usr_alt_nm2_lcl5 = createColumnInfo("usr_alt_nm2_lcl5");
	public final MCStringPermColumn usr_alt_nm2_lcl5 = createStringColumn(_usr_alt_nm2_lcl5);
	
	/**
	 * 担当者別名３. PIC alias name 3.<p>
	 *
	 */
	public static final String $usr_alt_nm3 = "usr_alt_nm3";
	private static final MCPermColumnInfo _usr_alt_nm3 = createColumnInfo("usr_alt_nm3");
	public final MCStringPermColumn usr_alt_nm3 = createStringColumn(_usr_alt_nm3);
	
	/**
	 * 担当者別名３（ロケール１）. PIC alias name 3 (Locale 1).<p>
	 *
	 */
	public static final String $usr_alt_nm3_lcl1 = "usr_alt_nm3_lcl1";
	private static final MCPermColumnInfo _usr_alt_nm3_lcl1 = createColumnInfo("usr_alt_nm3_lcl1");
	public final MCStringPermColumn usr_alt_nm3_lcl1 = createStringColumn(_usr_alt_nm3_lcl1);
	
	/**
	 * 担当者別名３（ロケール２）. PIC alias name 3 (Locale 2).<p>
	 *
	 */
	public static final String $usr_alt_nm3_lcl2 = "usr_alt_nm3_lcl2";
	private static final MCPermColumnInfo _usr_alt_nm3_lcl2 = createColumnInfo("usr_alt_nm3_lcl2");
	public final MCStringPermColumn usr_alt_nm3_lcl2 = createStringColumn(_usr_alt_nm3_lcl2);
	
	/**
	 * 担当者別名３（ロケール３）. PIC alias name 3 (Locale 3).<p>
	 *
	 */
	public static final String $usr_alt_nm3_lcl3 = "usr_alt_nm3_lcl3";
	private static final MCPermColumnInfo _usr_alt_nm3_lcl3 = createColumnInfo("usr_alt_nm3_lcl3");
	public final MCStringPermColumn usr_alt_nm3_lcl3 = createStringColumn(_usr_alt_nm3_lcl3);
	
	/**
	 * 担当者別名３（ロケール４）. PIC alias name 3 (Locale 4).<p>
	 *
	 */
	public static final String $usr_alt_nm3_lcl4 = "usr_alt_nm3_lcl4";
	private static final MCPermColumnInfo _usr_alt_nm3_lcl4 = createColumnInfo("usr_alt_nm3_lcl4");
	public final MCStringPermColumn usr_alt_nm3_lcl4 = createStringColumn(_usr_alt_nm3_lcl4);
	
	/**
	 * 担当者別名３（ロケール５）. PIC alias name 3 (Locale 5).<p>
	 *
	 */
	public static final String $usr_alt_nm3_lcl5 = "usr_alt_nm3_lcl5";
	private static final MCPermColumnInfo _usr_alt_nm3_lcl5 = createColumnInfo("usr_alt_nm3_lcl5");
	public final MCStringPermColumn usr_alt_nm3_lcl5 = createStringColumn(_usr_alt_nm3_lcl5);
	
	/**
	 * 担当者別名４. PIC alias name 4.<p>
	 *
	 */
	public static final String $usr_alt_nm4 = "usr_alt_nm4";
	private static final MCPermColumnInfo _usr_alt_nm4 = createColumnInfo("usr_alt_nm4");
	public final MCStringPermColumn usr_alt_nm4 = createStringColumn(_usr_alt_nm4);
	
	/**
	 * 担当者別名４（ロケール１）. PIC alias name 4 (Locale 1).<p>
	 *
	 */
	public static final String $usr_alt_nm4_lcl1 = "usr_alt_nm4_lcl1";
	private static final MCPermColumnInfo _usr_alt_nm4_lcl1 = createColumnInfo("usr_alt_nm4_lcl1");
	public final MCStringPermColumn usr_alt_nm4_lcl1 = createStringColumn(_usr_alt_nm4_lcl1);
	
	/**
	 * 担当者別名４（ロケール２）. PIC alias name 4 (Locale 2).<p>
	 *
	 */
	public static final String $usr_alt_nm4_lcl2 = "usr_alt_nm4_lcl2";
	private static final MCPermColumnInfo _usr_alt_nm4_lcl2 = createColumnInfo("usr_alt_nm4_lcl2");
	public final MCStringPermColumn usr_alt_nm4_lcl2 = createStringColumn(_usr_alt_nm4_lcl2);
	
	/**
	 * 担当者別名４（ロケール３）. PIC alias name 4 (Locale 3).<p>
	 *
	 */
	public static final String $usr_alt_nm4_lcl3 = "usr_alt_nm4_lcl3";
	private static final MCPermColumnInfo _usr_alt_nm4_lcl3 = createColumnInfo("usr_alt_nm4_lcl3");
	public final MCStringPermColumn usr_alt_nm4_lcl3 = createStringColumn(_usr_alt_nm4_lcl3);
	
	/**
	 * 担当者別名４（ロケール４）. PIC alias name 4 (Locale 4).<p>
	 *
	 */
	public static final String $usr_alt_nm4_lcl4 = "usr_alt_nm4_lcl4";
	private static final MCPermColumnInfo _usr_alt_nm4_lcl4 = createColumnInfo("usr_alt_nm4_lcl4");
	public final MCStringPermColumn usr_alt_nm4_lcl4 = createStringColumn(_usr_alt_nm4_lcl4);
	
	/**
	 * 担当者別名４（ロケール５）. PIC alias name 4 (Locale 5).<p>
	 *
	 */
	public static final String $usr_alt_nm4_lcl5 = "usr_alt_nm4_lcl5";
	private static final MCPermColumnInfo _usr_alt_nm4_lcl5 = createColumnInfo("usr_alt_nm4_lcl5");
	public final MCStringPermColumn usr_alt_nm4_lcl5 = createStringColumn(_usr_alt_nm4_lcl5);
	
	/**
	 * 担当者情報１. PIC info. 1.<p>
	 *
	 */
	public static final String $usr_info1 = "usr_info1";
	private static final MCPermColumnInfo _usr_info1 = createColumnInfo("usr_info1");
	public final MCStringPermColumn usr_info1 = createStringColumn(_usr_info1);
	
	/**
	 * 担当者情報２. PIC info. 2.<p>
	 *
	 */
	public static final String $usr_info2 = "usr_info2";
	private static final MCPermColumnInfo _usr_info2 = createColumnInfo("usr_info2");
	public final MCStringPermColumn usr_info2 = createStringColumn(_usr_info2);
	
	/**
	 * 担当者情報３. PIC info. 3.<p>
	 *
	 */
	public static final String $usr_info3 = "usr_info3";
	private static final MCPermColumnInfo _usr_info3 = createColumnInfo("usr_info3");
	public final MCStringPermColumn usr_info3 = createStringColumn(_usr_info3);
	
	/**
	 * 担当者情報４. PIC info. 4.<p>
	 *
	 */
	public static final String $usr_info4 = "usr_info4";
	private static final MCPermColumnInfo _usr_info4 = createColumnInfo("usr_info4");
	public final MCStringPermColumn usr_info4 = createStringColumn(_usr_info4);
	
	/**
	 * 担当者情報５. PIC info. 5.<p>
	 *
	 */
	public static final String $usr_info5 = "usr_info5";
	private static final MCPermColumnInfo _usr_info5 = createColumnInfo("usr_info5");
	public final MCStringPermColumn usr_info5 = createStringColumn(_usr_info5);
	
	/**
	 * 担当者情報６. PIC info. 6.<p>
	 *
	 */
	public static final String $usr_info6 = "usr_info6";
	private static final MCPermColumnInfo _usr_info6 = createColumnInfo("usr_info6");
	public final MCStringPermColumn usr_info6 = createStringColumn(_usr_info6);
	
	/**
	 * 担当者情報７. PIC info. 7.<p>
	 *
	 */
	public static final String $usr_info7 = "usr_info7";
	private static final MCPermColumnInfo _usr_info7 = createColumnInfo("usr_info7");
	public final MCStringPermColumn usr_info7 = createStringColumn(_usr_info7);
	
	/**
	 * 担当者情報８. PIC info. 8.<p>
	 *
	 */
	public static final String $usr_info8 = "usr_info8";
	private static final MCPermColumnInfo _usr_info8 = createColumnInfo("usr_info8");
	public final MCStringPermColumn usr_info8 = createStringColumn(_usr_info8);
	
	/**
	 * 担当者情報９. PIC info. 9.<p>
	 *
	 */
	public static final String $usr_info9 = "usr_info9";
	private static final MCPermColumnInfo _usr_info9 = createColumnInfo("usr_info9");
	public final MCStringPermColumn usr_info9 = createStringColumn(_usr_info9);
	
	/**
	 * 担当者情報１０. PIC info. 10.<p>
	 *
	 */
	public static final String $usr_info10 = "usr_info10";
	private static final MCPermColumnInfo _usr_info10 = createColumnInfo("usr_info10");
	public final MCStringPermColumn usr_info10 = createStringColumn(_usr_info10);
	
	/**
	 * 担当者情報１１. PIC info. 11.<p>
	 *
	 */
	public static final String $usr_info11 = "usr_info11";
	private static final MCPermColumnInfo _usr_info11 = createColumnInfo("usr_info11");
	public final MCStringPermColumn usr_info11 = createStringColumn(_usr_info11);
	
	/**
	 * 担当者情報１２. PIC info. 12.<p>
	 *
	 */
	public static final String $usr_info12 = "usr_info12";
	private static final MCPermColumnInfo _usr_info12 = createColumnInfo("usr_info12");
	public final MCStringPermColumn usr_info12 = createStringColumn(_usr_info12);
	
	/**
	 * 担当者情報１３. PIC info. 13.<p>
	 *
	 */
	public static final String $usr_info13 = "usr_info13";
	private static final MCPermColumnInfo _usr_info13 = createColumnInfo("usr_info13");
	public final MCStringPermColumn usr_info13 = createStringColumn(_usr_info13);
	
	/**
	 * 担当者情報１４. PIC info. 14.<p>
	 *
	 */
	public static final String $usr_info14 = "usr_info14";
	private static final MCPermColumnInfo _usr_info14 = createColumnInfo("usr_info14");
	public final MCStringPermColumn usr_info14 = createStringColumn(_usr_info14);
	
	/**
	 * 担当者情報１５. PIC info. 15.<p>
	 *
	 */
	public static final String $usr_info15 = "usr_info15";
	private static final MCPermColumnInfo _usr_info15 = createColumnInfo("usr_info15");
	public final MCStringPermColumn usr_info15 = createStringColumn(_usr_info15);
	
	/**
	 * 担当者情報１６. PIC info. 16.<p>
	 *
	 */
	public static final String $usr_info16 = "usr_info16";
	private static final MCPermColumnInfo _usr_info16 = createColumnInfo("usr_info16");
	public final MCStringPermColumn usr_info16 = createStringColumn(_usr_info16);
	
	/**
	 * 担当者情報１７. PIC info. 17.<p>
	 *
	 */
	public static final String $usr_info17 = "usr_info17";
	private static final MCPermColumnInfo _usr_info17 = createColumnInfo("usr_info17");
	public final MCStringPermColumn usr_info17 = createStringColumn(_usr_info17);
	
	/**
	 * 担当者情報１８. PIC info. 18.<p>
	 *
	 */
	public static final String $usr_info18 = "usr_info18";
	private static final MCPermColumnInfo _usr_info18 = createColumnInfo("usr_info18");
	public final MCStringPermColumn usr_info18 = createStringColumn(_usr_info18);
	
	/**
	 * 担当者情報１９. PIC info. 19.<p>
	 *
	 */
	public static final String $usr_info19 = "usr_info19";
	private static final MCPermColumnInfo _usr_info19 = createColumnInfo("usr_info19");
	public final MCStringPermColumn usr_info19 = createStringColumn(_usr_info19);
	
	/**
	 * 担当者情報２０. PIC info. 20.<p>
	 *
	 */
	public static final String $usr_info20 = "usr_info20";
	private static final MCPermColumnInfo _usr_info20 = createColumnInfo("usr_info20");
	public final MCStringPermColumn usr_info20 = createStringColumn(_usr_info20);
	
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
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_nm_lcl1_META = createCommonMeta($usr_nm_lcl1, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_nm_lcl2_META = createCommonMeta($usr_nm_lcl2, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_nm_lcl3_META = createCommonMeta($usr_nm_lcl3, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_nm_lcl4_META = createCommonMeta($usr_nm_lcl4, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_nm_lcl5_META = createCommonMeta($usr_nm_lcl5, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_alt_nm1_META = createCommonMeta($usr_alt_nm1, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm1_lcl1_META = createCommonMeta($usr_alt_nm1_lcl1, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm1_lcl2_META = createCommonMeta($usr_alt_nm1_lcl2, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm1_lcl3_META = createCommonMeta($usr_alt_nm1_lcl3, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm1_lcl4_META = createCommonMeta($usr_alt_nm1_lcl4, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm1_lcl5_META = createCommonMeta($usr_alt_nm1_lcl5, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm2_META = createCommonMeta($usr_alt_nm2, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm2_lcl1_META = createCommonMeta($usr_alt_nm2_lcl1, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm2_lcl2_META = createCommonMeta($usr_alt_nm2_lcl2, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm2_lcl3_META = createCommonMeta($usr_alt_nm2_lcl3, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm2_lcl4_META = createCommonMeta($usr_alt_nm2_lcl4, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm2_lcl5_META = createCommonMeta($usr_alt_nm2_lcl5, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm3_META = createCommonMeta($usr_alt_nm3, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm3_lcl1_META = createCommonMeta($usr_alt_nm3_lcl1, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm3_lcl2_META = createCommonMeta($usr_alt_nm3_lcl2, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm3_lcl3_META = createCommonMeta($usr_alt_nm3_lcl3, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm3_lcl4_META = createCommonMeta($usr_alt_nm3_lcl4, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm3_lcl5_META = createCommonMeta($usr_alt_nm3_lcl5, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm4_META = createCommonMeta($usr_alt_nm4, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta usr_alt_nm4_lcl1_META = createCommonMeta($usr_alt_nm4_lcl1, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta usr_alt_nm4_lcl2_META = createCommonMeta($usr_alt_nm4_lcl2, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta usr_alt_nm4_lcl3_META = createCommonMeta($usr_alt_nm4_lcl3, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta usr_alt_nm4_lcl4_META = createCommonMeta($usr_alt_nm4_lcl4, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta usr_alt_nm4_lcl5_META = createCommonMeta($usr_alt_nm4_lcl5, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta usr_info1_META = createCommonMeta($usr_info1, mcframe.commonMA.meta.MA_META.USR_INFO1);
	public static final MCMeta usr_info2_META = createCommonMeta($usr_info2, mcframe.commonMA.meta.MA_META.USR_INFO2);
	public static final MCMeta usr_info3_META = createCommonMeta($usr_info3, mcframe.commonMA.meta.MA_META.USR_INFO3);
	public static final MCMeta usr_info4_META = createCommonMeta($usr_info4, mcframe.commonMA.meta.MA_META.USR_INFO4);
	public static final MCMeta usr_info5_META = createCommonMeta($usr_info5, mcframe.commonMA.meta.MA_META.USR_INFO5);
	public static final MCMeta usr_info6_META = createCommonMeta($usr_info6, mcframe.commonMA.meta.MA_META.USR_INFO6);
	public static final MCMeta usr_info7_META = createCommonMeta($usr_info7, mcframe.commonMA.meta.MA_META.USR_INFO7);
	public static final MCMeta usr_info8_META = createCommonMeta($usr_info8, mcframe.commonMA.meta.MA_META.USR_INFO8);
	public static final MCMeta usr_info9_META = createCommonMeta($usr_info9, mcframe.commonMA.meta.MA_META.USR_INFO9);
	public static final MCMeta usr_info10_META = createCommonMeta($usr_info10, mcframe.commonMA.meta.MA_META.USR_INFO10);
	public static final MCMeta usr_info11_META = createCommonMeta($usr_info11, mcframe.commonMA.meta.MA_META.USR_INFO11);
	public static final MCMeta usr_info12_META = createCommonMeta($usr_info12, mcframe.commonMA.meta.MA_META.USR_INFO12);
	public static final MCMeta usr_info13_META = createCommonMeta($usr_info13, mcframe.commonMA.meta.MA_META.USR_INFO13);
	public static final MCMeta usr_info14_META = createCommonMeta($usr_info14, mcframe.commonMA.meta.MA_META.USR_INFO14);
	public static final MCMeta usr_info15_META = createCommonMeta($usr_info15, mcframe.commonMA.meta.MA_META.USR_INFO15);
	public static final MCMeta usr_info16_META = createCommonMeta($usr_info16, mcframe.commonMA.meta.MA_META.USR_INFO16);
	public static final MCMeta usr_info17_META = createCommonMeta($usr_info17, mcframe.commonMA.meta.MA_META.USR_INFO17);
	public static final MCMeta usr_info18_META = createCommonMeta($usr_info18, mcframe.commonMA.meta.MA_META.USR_INFO18);
	public static final MCMeta usr_info19_META = createCommonMeta($usr_info19, mcframe.commonMA.meta.MA_META.USR_INFO19);
	public static final MCMeta usr_info20_META = createCommonMeta($usr_info20, mcframe.commonMA.meta.MA_META.USR_INFO20);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_USR_IF_ALL_R> constMetas = new ConstMetaList<MAVM_USR_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			usr_cd_META,
			usr_nm_META,
			usr_nm_lcl1_META,
			usr_nm_lcl2_META,
			usr_nm_lcl3_META,
			usr_nm_lcl4_META,
			usr_nm_lcl5_META,
			usr_alt_nm1_META,
			usr_alt_nm1_lcl1_META,
			usr_alt_nm1_lcl2_META,
			usr_alt_nm1_lcl3_META,
			usr_alt_nm1_lcl4_META,
			usr_alt_nm1_lcl5_META,
			usr_alt_nm2_META,
			usr_alt_nm2_lcl1_META,
			usr_alt_nm2_lcl2_META,
			usr_alt_nm2_lcl3_META,
			usr_alt_nm2_lcl4_META,
			usr_alt_nm2_lcl5_META,
			usr_alt_nm3_META,
			usr_alt_nm3_lcl1_META,
			usr_alt_nm3_lcl2_META,
			usr_alt_nm3_lcl3_META,
			usr_alt_nm3_lcl4_META,
			usr_alt_nm3_lcl5_META,
			usr_alt_nm4_META,
			usr_alt_nm4_lcl1_META,
			usr_alt_nm4_lcl2_META,
			usr_alt_nm4_lcl3_META,
			usr_alt_nm4_lcl4_META,
			usr_alt_nm4_lcl5_META,
			usr_info1_META,
			usr_info2_META,
			usr_info3_META,
			usr_info4_META,
			usr_info5_META,
			usr_info6_META,
			usr_info7_META,
			usr_info8_META,
			usr_info9_META,
			usr_info10_META,
			usr_info11_META,
			usr_info12_META,
			usr_info13_META,
			usr_info14_META,
			usr_info15_META,
			usr_info16_META,
			usr_info17_META,
			usr_info18_META,
			usr_info19_META,
			usr_info20_META,
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
	protected MAVM_USR_IF_ALL_R(ConstMetaList<? extends MAVM_USR_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_USR_IF_ALL_R(ConstMetaList<? extends MAVM_USR_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$co_cd,
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
			MAVM_USR_IF_ALL_R.$usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_cd,
				"usr_cd",
				usr_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_nm,
				"usr_nm",
				usr_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_nm_lcl1,
				"usr_nm_lcl1",
				usr_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_nm_lcl2,
				"usr_nm_lcl2",
				usr_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_nm_lcl3,
				"usr_nm_lcl3",
				usr_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_nm_lcl4,
				"usr_nm_lcl4",
				usr_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_nm_lcl5,
				"usr_nm_lcl5",
				usr_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm1,
				"usr_alt_nm1",
				usr_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm1_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm1_lcl1,
				"usr_alt_nm1_lcl1",
				usr_alt_nm1_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm1_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm1_lcl2,
				"usr_alt_nm1_lcl2",
				usr_alt_nm1_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm1_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm1_lcl3,
				"usr_alt_nm1_lcl3",
				usr_alt_nm1_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm1_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm1_lcl4,
				"usr_alt_nm1_lcl4",
				usr_alt_nm1_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm1_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm1_lcl5,
				"usr_alt_nm1_lcl5",
				usr_alt_nm1_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm2,
				"usr_alt_nm2",
				usr_alt_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm2_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm2_lcl1,
				"usr_alt_nm2_lcl1",
				usr_alt_nm2_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm2_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm2_lcl2,
				"usr_alt_nm2_lcl2",
				usr_alt_nm2_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm2_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm2_lcl3,
				"usr_alt_nm2_lcl3",
				usr_alt_nm2_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm2_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm2_lcl4,
				"usr_alt_nm2_lcl4",
				usr_alt_nm2_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm2_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm2_lcl5,
				"usr_alt_nm2_lcl5",
				usr_alt_nm2_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm3,
				"usr_alt_nm3",
				usr_alt_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm3_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm3_lcl1,
				"usr_alt_nm3_lcl1",
				usr_alt_nm3_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm3_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm3_lcl2,
				"usr_alt_nm3_lcl2",
				usr_alt_nm3_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm3_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm3_lcl3,
				"usr_alt_nm3_lcl3",
				usr_alt_nm3_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm3_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm3_lcl4,
				"usr_alt_nm3_lcl4",
				usr_alt_nm3_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm3_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm3_lcl5,
				"usr_alt_nm3_lcl5",
				usr_alt_nm3_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm4,
				"usr_alt_nm4",
				usr_alt_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm4_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm4_lcl1,
				"usr_alt_nm4_lcl1",
				usr_alt_nm4_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm4_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm4_lcl2,
				"usr_alt_nm4_lcl2",
				usr_alt_nm4_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm4_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm4_lcl3,
				"usr_alt_nm4_lcl3",
				usr_alt_nm4_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm4_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm4_lcl4,
				"usr_alt_nm4_lcl4",
				usr_alt_nm4_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_alt_nm4_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_alt_nm4_lcl5,
				"usr_alt_nm4_lcl5",
				usr_alt_nm4_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info1,
				"usr_info1",
				usr_info1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info2,
				"usr_info2",
				usr_info2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info3,
				"usr_info3",
				usr_info3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info4,
				"usr_info4",
				usr_info4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info5,
				"usr_info5",
				usr_info5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info6,
				"usr_info6",
				usr_info6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info7,
				"usr_info7",
				usr_info7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info8,
				"usr_info8",
				usr_info8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info9,
				"usr_info9",
				usr_info9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info10,
				"usr_info10",
				usr_info10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info11,
				"usr_info11",
				usr_info11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info12,
				"usr_info12",
				usr_info12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info13,
				"usr_info13",
				usr_info13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info14,
				"usr_info14",
				usr_info14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info15,
				"usr_info15",
				usr_info15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info16,
				"usr_info16",
				usr_info16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info17,
				"usr_info17",
				usr_info17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info18,
				"usr_info18",
				usr_info18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info19,
				"usr_info19",
				usr_info19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$usr_info20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$usr_info20,
				"usr_info20",
				usr_info20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$memo1,
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
			MAVM_USR_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$memo2,
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
			MAVM_USR_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_IF_ALL_R.$memo3,
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
	public static MAVM_USR_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_USR_IF_ALL_R create(String alias) {
		MAVM_USR_IF_ALL_R row = new MAVM_USR_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_USR_IF_ALL_R createByName(T proto) {
		MAVM_USR_IF_ALL_R row = MAVM_USR_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_USR_IF_ALL_R clone() {
		return (MAVM_USR_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_USR_IF_ALL_R createInstance() {
		return (MAVM_USR_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_USR_IF_ALL_R getValues(String... names) {
		return (MAVM_USR_IF_ALL_R) super.getValues(names);
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
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 1, $usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 1, $usr_cd, value);
	}

	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 2, $usr_nm);
	}

	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 2, $usr_nm, value);
	}

	/**
	 * 担当者名（ロケール１）. PIC name (Locale 1).<p>
	 *
	 */
	public String usr_nm_lcl1() {
		return getConstString(offset + 3, $usr_nm_lcl1);
	}

	/**
	 * 担当者名（ロケール１）. PIC name (Locale 1).<p>
	 *
	 */
	public void usr_nm_lcl1(String value) {
		setConstString(offset + 3, $usr_nm_lcl1, value);
	}

	/**
	 * 担当者名（ロケール２）. PIC name (Locale 2).<p>
	 *
	 */
	public String usr_nm_lcl2() {
		return getConstString(offset + 4, $usr_nm_lcl2);
	}

	/**
	 * 担当者名（ロケール２）. PIC name (Locale 2).<p>
	 *
	 */
	public void usr_nm_lcl2(String value) {
		setConstString(offset + 4, $usr_nm_lcl2, value);
	}

	/**
	 * 担当者名（ロケール３）. PIC name (Locale 3).<p>
	 *
	 */
	public String usr_nm_lcl3() {
		return getConstString(offset + 5, $usr_nm_lcl3);
	}

	/**
	 * 担当者名（ロケール３）. PIC name (Locale 3).<p>
	 *
	 */
	public void usr_nm_lcl3(String value) {
		setConstString(offset + 5, $usr_nm_lcl3, value);
	}

	/**
	 * 担当者名（ロケール４）. PIC name (Locale 4).<p>
	 *
	 */
	public String usr_nm_lcl4() {
		return getConstString(offset + 6, $usr_nm_lcl4);
	}

	/**
	 * 担当者名（ロケール４）. PIC name (Locale 4).<p>
	 *
	 */
	public void usr_nm_lcl4(String value) {
		setConstString(offset + 6, $usr_nm_lcl4, value);
	}

	/**
	 * 担当者名（ロケール５）. PIC name (Locale 5).<p>
	 *
	 */
	public String usr_nm_lcl5() {
		return getConstString(offset + 7, $usr_nm_lcl5);
	}

	/**
	 * 担当者名（ロケール５）. PIC name (Locale 5).<p>
	 *
	 */
	public void usr_nm_lcl5(String value) {
		setConstString(offset + 7, $usr_nm_lcl5, value);
	}

	/**
	 * 担当者別名１. PIC alias name 1.<p>
	 *
	 */
	public String usr_alt_nm1() {
		return getConstString(offset + 8, $usr_alt_nm1);
	}

	/**
	 * 担当者別名１. PIC alias name 1.<p>
	 *
	 */
	public void usr_alt_nm1(String value) {
		setConstString(offset + 8, $usr_alt_nm1, value);
	}

	/**
	 * 担当者別名１（ロケール１）. PIC alias name 1 (Locale 1).<p>
	 *
	 */
	public String usr_alt_nm1_lcl1() {
		return getConstString(offset + 9, $usr_alt_nm1_lcl1);
	}

	/**
	 * 担当者別名１（ロケール１）. PIC alias name 1 (Locale 1).<p>
	 *
	 */
	public void usr_alt_nm1_lcl1(String value) {
		setConstString(offset + 9, $usr_alt_nm1_lcl1, value);
	}

	/**
	 * 担当者別名１（ロケール２）. PIC alias name 1 (Locale 2).<p>
	 *
	 */
	public String usr_alt_nm1_lcl2() {
		return getConstString(offset + 10, $usr_alt_nm1_lcl2);
	}

	/**
	 * 担当者別名１（ロケール２）. PIC alias name 1 (Locale 2).<p>
	 *
	 */
	public void usr_alt_nm1_lcl2(String value) {
		setConstString(offset + 10, $usr_alt_nm1_lcl2, value);
	}

	/**
	 * 担当者別名１（ロケール３）. PIC alias name 1 (Locale 3).<p>
	 *
	 */
	public String usr_alt_nm1_lcl3() {
		return getConstString(offset + 11, $usr_alt_nm1_lcl3);
	}

	/**
	 * 担当者別名１（ロケール３）. PIC alias name 1 (Locale 3).<p>
	 *
	 */
	public void usr_alt_nm1_lcl3(String value) {
		setConstString(offset + 11, $usr_alt_nm1_lcl3, value);
	}

	/**
	 * 担当者別名１（ロケール４）. PIC alias name 1 (Locale 4).<p>
	 *
	 */
	public String usr_alt_nm1_lcl4() {
		return getConstString(offset + 12, $usr_alt_nm1_lcl4);
	}

	/**
	 * 担当者別名１（ロケール４）. PIC alias name 1 (Locale 4).<p>
	 *
	 */
	public void usr_alt_nm1_lcl4(String value) {
		setConstString(offset + 12, $usr_alt_nm1_lcl4, value);
	}

	/**
	 * 担当者別名１（ロケール５）. PIC alias name 1 (Locale 5).<p>
	 *
	 */
	public String usr_alt_nm1_lcl5() {
		return getConstString(offset + 13, $usr_alt_nm1_lcl5);
	}

	/**
	 * 担当者別名１（ロケール５）. PIC alias name 1 (Locale 5).<p>
	 *
	 */
	public void usr_alt_nm1_lcl5(String value) {
		setConstString(offset + 13, $usr_alt_nm1_lcl5, value);
	}

	/**
	 * 担当者別名２. PIC alias name 2.<p>
	 *
	 */
	public String usr_alt_nm2() {
		return getConstString(offset + 14, $usr_alt_nm2);
	}

	/**
	 * 担当者別名２. PIC alias name 2.<p>
	 *
	 */
	public void usr_alt_nm2(String value) {
		setConstString(offset + 14, $usr_alt_nm2, value);
	}

	/**
	 * 担当者別名２（ロケール１）. PIC alias name 2 (Locale 1).<p>
	 *
	 */
	public String usr_alt_nm2_lcl1() {
		return getConstString(offset + 15, $usr_alt_nm2_lcl1);
	}

	/**
	 * 担当者別名２（ロケール１）. PIC alias name 2 (Locale 1).<p>
	 *
	 */
	public void usr_alt_nm2_lcl1(String value) {
		setConstString(offset + 15, $usr_alt_nm2_lcl1, value);
	}

	/**
	 * 担当者別名２（ロケール２）. PIC alias name 2 (Locale 2).<p>
	 *
	 */
	public String usr_alt_nm2_lcl2() {
		return getConstString(offset + 16, $usr_alt_nm2_lcl2);
	}

	/**
	 * 担当者別名２（ロケール２）. PIC alias name 2 (Locale 2).<p>
	 *
	 */
	public void usr_alt_nm2_lcl2(String value) {
		setConstString(offset + 16, $usr_alt_nm2_lcl2, value);
	}

	/**
	 * 担当者別名２（ロケール３）. PIC alias name 2 (Locale 3).<p>
	 *
	 */
	public String usr_alt_nm2_lcl3() {
		return getConstString(offset + 17, $usr_alt_nm2_lcl3);
	}

	/**
	 * 担当者別名２（ロケール３）. PIC alias name 2 (Locale 3).<p>
	 *
	 */
	public void usr_alt_nm2_lcl3(String value) {
		setConstString(offset + 17, $usr_alt_nm2_lcl3, value);
	}

	/**
	 * 担当者別名２（ロケール４）. PIC alias name 2 (Locale 4).<p>
	 *
	 */
	public String usr_alt_nm2_lcl4() {
		return getConstString(offset + 18, $usr_alt_nm2_lcl4);
	}

	/**
	 * 担当者別名２（ロケール４）. PIC alias name 2 (Locale 4).<p>
	 *
	 */
	public void usr_alt_nm2_lcl4(String value) {
		setConstString(offset + 18, $usr_alt_nm2_lcl4, value);
	}

	/**
	 * 担当者別名２（ロケール５）. PIC alias name 2 (Locale 5).<p>
	 *
	 */
	public String usr_alt_nm2_lcl5() {
		return getConstString(offset + 19, $usr_alt_nm2_lcl5);
	}

	/**
	 * 担当者別名２（ロケール５）. PIC alias name 2 (Locale 5).<p>
	 *
	 */
	public void usr_alt_nm2_lcl5(String value) {
		setConstString(offset + 19, $usr_alt_nm2_lcl5, value);
	}

	/**
	 * 担当者別名３. PIC alias name 3.<p>
	 *
	 */
	public String usr_alt_nm3() {
		return getConstString(offset + 20, $usr_alt_nm3);
	}

	/**
	 * 担当者別名３. PIC alias name 3.<p>
	 *
	 */
	public void usr_alt_nm3(String value) {
		setConstString(offset + 20, $usr_alt_nm3, value);
	}

	/**
	 * 担当者別名３（ロケール１）. PIC alias name 3 (Locale 1).<p>
	 *
	 */
	public String usr_alt_nm3_lcl1() {
		return getConstString(offset + 21, $usr_alt_nm3_lcl1);
	}

	/**
	 * 担当者別名３（ロケール１）. PIC alias name 3 (Locale 1).<p>
	 *
	 */
	public void usr_alt_nm3_lcl1(String value) {
		setConstString(offset + 21, $usr_alt_nm3_lcl1, value);
	}

	/**
	 * 担当者別名３（ロケール２）. PIC alias name 3 (Locale 2).<p>
	 *
	 */
	public String usr_alt_nm3_lcl2() {
		return getConstString(offset + 22, $usr_alt_nm3_lcl2);
	}

	/**
	 * 担当者別名３（ロケール２）. PIC alias name 3 (Locale 2).<p>
	 *
	 */
	public void usr_alt_nm3_lcl2(String value) {
		setConstString(offset + 22, $usr_alt_nm3_lcl2, value);
	}

	/**
	 * 担当者別名３（ロケール３）. PIC alias name 3 (Locale 3).<p>
	 *
	 */
	public String usr_alt_nm3_lcl3() {
		return getConstString(offset + 23, $usr_alt_nm3_lcl3);
	}

	/**
	 * 担当者別名３（ロケール３）. PIC alias name 3 (Locale 3).<p>
	 *
	 */
	public void usr_alt_nm3_lcl3(String value) {
		setConstString(offset + 23, $usr_alt_nm3_lcl3, value);
	}

	/**
	 * 担当者別名３（ロケール４）. PIC alias name 3 (Locale 4).<p>
	 *
	 */
	public String usr_alt_nm3_lcl4() {
		return getConstString(offset + 24, $usr_alt_nm3_lcl4);
	}

	/**
	 * 担当者別名３（ロケール４）. PIC alias name 3 (Locale 4).<p>
	 *
	 */
	public void usr_alt_nm3_lcl4(String value) {
		setConstString(offset + 24, $usr_alt_nm3_lcl4, value);
	}

	/**
	 * 担当者別名３（ロケール５）. PIC alias name 3 (Locale 5).<p>
	 *
	 */
	public String usr_alt_nm3_lcl5() {
		return getConstString(offset + 25, $usr_alt_nm3_lcl5);
	}

	/**
	 * 担当者別名３（ロケール５）. PIC alias name 3 (Locale 5).<p>
	 *
	 */
	public void usr_alt_nm3_lcl5(String value) {
		setConstString(offset + 25, $usr_alt_nm3_lcl5, value);
	}

	/**
	 * 担当者別名４. PIC alias name 4.<p>
	 *
	 */
	public String usr_alt_nm4() {
		return getConstString(offset + 26, $usr_alt_nm4);
	}

	/**
	 * 担当者別名４. PIC alias name 4.<p>
	 *
	 */
	public void usr_alt_nm4(String value) {
		setConstString(offset + 26, $usr_alt_nm4, value);
	}

	/**
	 * 担当者別名４（ロケール１）. PIC alias name 4 (Locale 1).<p>
	 *
	 */
	public String usr_alt_nm4_lcl1() {
		return getConstString(offset + 27, $usr_alt_nm4_lcl1);
	}

	/**
	 * 担当者別名４（ロケール１）. PIC alias name 4 (Locale 1).<p>
	 *
	 */
	public void usr_alt_nm4_lcl1(String value) {
		setConstString(offset + 27, $usr_alt_nm4_lcl1, value);
	}

	/**
	 * 担当者別名４（ロケール２）. PIC alias name 4 (Locale 2).<p>
	 *
	 */
	public String usr_alt_nm4_lcl2() {
		return getConstString(offset + 28, $usr_alt_nm4_lcl2);
	}

	/**
	 * 担当者別名４（ロケール２）. PIC alias name 4 (Locale 2).<p>
	 *
	 */
	public void usr_alt_nm4_lcl2(String value) {
		setConstString(offset + 28, $usr_alt_nm4_lcl2, value);
	}

	/**
	 * 担当者別名４（ロケール３）. PIC alias name 4 (Locale 3).<p>
	 *
	 */
	public String usr_alt_nm4_lcl3() {
		return getConstString(offset + 29, $usr_alt_nm4_lcl3);
	}

	/**
	 * 担当者別名４（ロケール３）. PIC alias name 4 (Locale 3).<p>
	 *
	 */
	public void usr_alt_nm4_lcl3(String value) {
		setConstString(offset + 29, $usr_alt_nm4_lcl3, value);
	}

	/**
	 * 担当者別名４（ロケール４）. PIC alias name 4 (Locale 4).<p>
	 *
	 */
	public String usr_alt_nm4_lcl4() {
		return getConstString(offset + 30, $usr_alt_nm4_lcl4);
	}

	/**
	 * 担当者別名４（ロケール４）. PIC alias name 4 (Locale 4).<p>
	 *
	 */
	public void usr_alt_nm4_lcl4(String value) {
		setConstString(offset + 30, $usr_alt_nm4_lcl4, value);
	}

	/**
	 * 担当者別名４（ロケール５）. PIC alias name 4 (Locale 5).<p>
	 *
	 */
	public String usr_alt_nm4_lcl5() {
		return getConstString(offset + 31, $usr_alt_nm4_lcl5);
	}

	/**
	 * 担当者別名４（ロケール５）. PIC alias name 4 (Locale 5).<p>
	 *
	 */
	public void usr_alt_nm4_lcl5(String value) {
		setConstString(offset + 31, $usr_alt_nm4_lcl5, value);
	}

	/**
	 * 担当者情報１. PIC info. 1.<p>
	 *
	 */
	public String usr_info1() {
		return getConstString(offset + 32, $usr_info1);
	}

	/**
	 * 担当者情報１. PIC info. 1.<p>
	 *
	 */
	public void usr_info1(String value) {
		setConstString(offset + 32, $usr_info1, value);
	}

	/**
	 * 担当者情報２. PIC info. 2.<p>
	 *
	 */
	public String usr_info2() {
		return getConstString(offset + 33, $usr_info2);
	}

	/**
	 * 担当者情報２. PIC info. 2.<p>
	 *
	 */
	public void usr_info2(String value) {
		setConstString(offset + 33, $usr_info2, value);
	}

	/**
	 * 担当者情報３. PIC info. 3.<p>
	 *
	 */
	public String usr_info3() {
		return getConstString(offset + 34, $usr_info3);
	}

	/**
	 * 担当者情報３. PIC info. 3.<p>
	 *
	 */
	public void usr_info3(String value) {
		setConstString(offset + 34, $usr_info3, value);
	}

	/**
	 * 担当者情報４. PIC info. 4.<p>
	 *
	 */
	public String usr_info4() {
		return getConstString(offset + 35, $usr_info4);
	}

	/**
	 * 担当者情報４. PIC info. 4.<p>
	 *
	 */
	public void usr_info4(String value) {
		setConstString(offset + 35, $usr_info4, value);
	}

	/**
	 * 担当者情報５. PIC info. 5.<p>
	 *
	 */
	public String usr_info5() {
		return getConstString(offset + 36, $usr_info5);
	}

	/**
	 * 担当者情報５. PIC info. 5.<p>
	 *
	 */
	public void usr_info5(String value) {
		setConstString(offset + 36, $usr_info5, value);
	}

	/**
	 * 担当者情報６. PIC info. 6.<p>
	 *
	 */
	public String usr_info6() {
		return getConstString(offset + 37, $usr_info6);
	}

	/**
	 * 担当者情報６. PIC info. 6.<p>
	 *
	 */
	public void usr_info6(String value) {
		setConstString(offset + 37, $usr_info6, value);
	}

	/**
	 * 担当者情報７. PIC info. 7.<p>
	 *
	 */
	public String usr_info7() {
		return getConstString(offset + 38, $usr_info7);
	}

	/**
	 * 担当者情報７. PIC info. 7.<p>
	 *
	 */
	public void usr_info7(String value) {
		setConstString(offset + 38, $usr_info7, value);
	}

	/**
	 * 担当者情報８. PIC info. 8.<p>
	 *
	 */
	public String usr_info8() {
		return getConstString(offset + 39, $usr_info8);
	}

	/**
	 * 担当者情報８. PIC info. 8.<p>
	 *
	 */
	public void usr_info8(String value) {
		setConstString(offset + 39, $usr_info8, value);
	}

	/**
	 * 担当者情報９. PIC info. 9.<p>
	 *
	 */
	public String usr_info9() {
		return getConstString(offset + 40, $usr_info9);
	}

	/**
	 * 担当者情報９. PIC info. 9.<p>
	 *
	 */
	public void usr_info9(String value) {
		setConstString(offset + 40, $usr_info9, value);
	}

	/**
	 * 担当者情報１０. PIC info. 10.<p>
	 *
	 */
	public String usr_info10() {
		return getConstString(offset + 41, $usr_info10);
	}

	/**
	 * 担当者情報１０. PIC info. 10.<p>
	 *
	 */
	public void usr_info10(String value) {
		setConstString(offset + 41, $usr_info10, value);
	}

	/**
	 * 担当者情報１１. PIC info. 11.<p>
	 *
	 */
	public String usr_info11() {
		return getConstString(offset + 42, $usr_info11);
	}

	/**
	 * 担当者情報１１. PIC info. 11.<p>
	 *
	 */
	public void usr_info11(String value) {
		setConstString(offset + 42, $usr_info11, value);
	}

	/**
	 * 担当者情報１２. PIC info. 12.<p>
	 *
	 */
	public String usr_info12() {
		return getConstString(offset + 43, $usr_info12);
	}

	/**
	 * 担当者情報１２. PIC info. 12.<p>
	 *
	 */
	public void usr_info12(String value) {
		setConstString(offset + 43, $usr_info12, value);
	}

	/**
	 * 担当者情報１３. PIC info. 13.<p>
	 *
	 */
	public String usr_info13() {
		return getConstString(offset + 44, $usr_info13);
	}

	/**
	 * 担当者情報１３. PIC info. 13.<p>
	 *
	 */
	public void usr_info13(String value) {
		setConstString(offset + 44, $usr_info13, value);
	}

	/**
	 * 担当者情報１４. PIC info. 14.<p>
	 *
	 */
	public String usr_info14() {
		return getConstString(offset + 45, $usr_info14);
	}

	/**
	 * 担当者情報１４. PIC info. 14.<p>
	 *
	 */
	public void usr_info14(String value) {
		setConstString(offset + 45, $usr_info14, value);
	}

	/**
	 * 担当者情報１５. PIC info. 15.<p>
	 *
	 */
	public String usr_info15() {
		return getConstString(offset + 46, $usr_info15);
	}

	/**
	 * 担当者情報１５. PIC info. 15.<p>
	 *
	 */
	public void usr_info15(String value) {
		setConstString(offset + 46, $usr_info15, value);
	}

	/**
	 * 担当者情報１６. PIC info. 16.<p>
	 *
	 */
	public String usr_info16() {
		return getConstString(offset + 47, $usr_info16);
	}

	/**
	 * 担当者情報１６. PIC info. 16.<p>
	 *
	 */
	public void usr_info16(String value) {
		setConstString(offset + 47, $usr_info16, value);
	}

	/**
	 * 担当者情報１７. PIC info. 17.<p>
	 *
	 */
	public String usr_info17() {
		return getConstString(offset + 48, $usr_info17);
	}

	/**
	 * 担当者情報１７. PIC info. 17.<p>
	 *
	 */
	public void usr_info17(String value) {
		setConstString(offset + 48, $usr_info17, value);
	}

	/**
	 * 担当者情報１８. PIC info. 18.<p>
	 *
	 */
	public String usr_info18() {
		return getConstString(offset + 49, $usr_info18);
	}

	/**
	 * 担当者情報１８. PIC info. 18.<p>
	 *
	 */
	public void usr_info18(String value) {
		setConstString(offset + 49, $usr_info18, value);
	}

	/**
	 * 担当者情報１９. PIC info. 19.<p>
	 *
	 */
	public String usr_info19() {
		return getConstString(offset + 50, $usr_info19);
	}

	/**
	 * 担当者情報１９. PIC info. 19.<p>
	 *
	 */
	public void usr_info19(String value) {
		setConstString(offset + 50, $usr_info19, value);
	}

	/**
	 * 担当者情報２０. PIC info. 20.<p>
	 *
	 */
	public String usr_info20() {
		return getConstString(offset + 51, $usr_info20);
	}

	/**
	 * 担当者情報２０. PIC info. 20.<p>
	 *
	 */
	public void usr_info20(String value) {
		setConstString(offset + 51, $usr_info20, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 52, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 52, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 53, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 53, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 54, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 54, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_nm_lcl1.equalsIgnoreCase(name)) {
			return usr_nm_lcl1();
		}
		if ($usr_nm_lcl2.equalsIgnoreCase(name)) {
			return usr_nm_lcl2();
		}
		if ($usr_nm_lcl3.equalsIgnoreCase(name)) {
			return usr_nm_lcl3();
		}
		if ($usr_nm_lcl4.equalsIgnoreCase(name)) {
			return usr_nm_lcl4();
		}
		if ($usr_nm_lcl5.equalsIgnoreCase(name)) {
			return usr_nm_lcl5();
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			return usr_alt_nm1();
		}
		if ($usr_alt_nm1_lcl1.equalsIgnoreCase(name)) {
			return usr_alt_nm1_lcl1();
		}
		if ($usr_alt_nm1_lcl2.equalsIgnoreCase(name)) {
			return usr_alt_nm1_lcl2();
		}
		if ($usr_alt_nm1_lcl3.equalsIgnoreCase(name)) {
			return usr_alt_nm1_lcl3();
		}
		if ($usr_alt_nm1_lcl4.equalsIgnoreCase(name)) {
			return usr_alt_nm1_lcl4();
		}
		if ($usr_alt_nm1_lcl5.equalsIgnoreCase(name)) {
			return usr_alt_nm1_lcl5();
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			return usr_alt_nm2();
		}
		if ($usr_alt_nm2_lcl1.equalsIgnoreCase(name)) {
			return usr_alt_nm2_lcl1();
		}
		if ($usr_alt_nm2_lcl2.equalsIgnoreCase(name)) {
			return usr_alt_nm2_lcl2();
		}
		if ($usr_alt_nm2_lcl3.equalsIgnoreCase(name)) {
			return usr_alt_nm2_lcl3();
		}
		if ($usr_alt_nm2_lcl4.equalsIgnoreCase(name)) {
			return usr_alt_nm2_lcl4();
		}
		if ($usr_alt_nm2_lcl5.equalsIgnoreCase(name)) {
			return usr_alt_nm2_lcl5();
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			return usr_alt_nm3();
		}
		if ($usr_alt_nm3_lcl1.equalsIgnoreCase(name)) {
			return usr_alt_nm3_lcl1();
		}
		if ($usr_alt_nm3_lcl2.equalsIgnoreCase(name)) {
			return usr_alt_nm3_lcl2();
		}
		if ($usr_alt_nm3_lcl3.equalsIgnoreCase(name)) {
			return usr_alt_nm3_lcl3();
		}
		if ($usr_alt_nm3_lcl4.equalsIgnoreCase(name)) {
			return usr_alt_nm3_lcl4();
		}
		if ($usr_alt_nm3_lcl5.equalsIgnoreCase(name)) {
			return usr_alt_nm3_lcl5();
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			return usr_alt_nm4();
		}
		if ($usr_alt_nm4_lcl1.equalsIgnoreCase(name)) {
			return usr_alt_nm4_lcl1();
		}
		if ($usr_alt_nm4_lcl2.equalsIgnoreCase(name)) {
			return usr_alt_nm4_lcl2();
		}
		if ($usr_alt_nm4_lcl3.equalsIgnoreCase(name)) {
			return usr_alt_nm4_lcl3();
		}
		if ($usr_alt_nm4_lcl4.equalsIgnoreCase(name)) {
			return usr_alt_nm4_lcl4();
		}
		if ($usr_alt_nm4_lcl5.equalsIgnoreCase(name)) {
			return usr_alt_nm4_lcl5();
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			return usr_info1();
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			return usr_info2();
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			return usr_info3();
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			return usr_info4();
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			return usr_info5();
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			return usr_info6();
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			return usr_info7();
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			return usr_info8();
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			return usr_info9();
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			return usr_info10();
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			return usr_info11();
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			return usr_info12();
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			return usr_info13();
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			return usr_info14();
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			return usr_info15();
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			return usr_info16();
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			return usr_info17();
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			return usr_info18();
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			return usr_info19();
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			return usr_info20();
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

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_nm_lcl1.equalsIgnoreCase(name)) {
			return usr_nm_lcl1();
		}
		if ($usr_nm_lcl2.equalsIgnoreCase(name)) {
			return usr_nm_lcl2();
		}
		if ($usr_nm_lcl3.equalsIgnoreCase(name)) {
			return usr_nm_lcl3();
		}
		if ($usr_nm_lcl4.equalsIgnoreCase(name)) {
			return usr_nm_lcl4();
		}
		if ($usr_nm_lcl5.equalsIgnoreCase(name)) {
			return usr_nm_lcl5();
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			return usr_alt_nm1();
		}
		if ($usr_alt_nm1_lcl1.equalsIgnoreCase(name)) {
			return usr_alt_nm1_lcl1();
		}
		if ($usr_alt_nm1_lcl2.equalsIgnoreCase(name)) {
			return usr_alt_nm1_lcl2();
		}
		if ($usr_alt_nm1_lcl3.equalsIgnoreCase(name)) {
			return usr_alt_nm1_lcl3();
		}
		if ($usr_alt_nm1_lcl4.equalsIgnoreCase(name)) {
			return usr_alt_nm1_lcl4();
		}
		if ($usr_alt_nm1_lcl5.equalsIgnoreCase(name)) {
			return usr_alt_nm1_lcl5();
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			return usr_alt_nm2();
		}
		if ($usr_alt_nm2_lcl1.equalsIgnoreCase(name)) {
			return usr_alt_nm2_lcl1();
		}
		if ($usr_alt_nm2_lcl2.equalsIgnoreCase(name)) {
			return usr_alt_nm2_lcl2();
		}
		if ($usr_alt_nm2_lcl3.equalsIgnoreCase(name)) {
			return usr_alt_nm2_lcl3();
		}
		if ($usr_alt_nm2_lcl4.equalsIgnoreCase(name)) {
			return usr_alt_nm2_lcl4();
		}
		if ($usr_alt_nm2_lcl5.equalsIgnoreCase(name)) {
			return usr_alt_nm2_lcl5();
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			return usr_alt_nm3();
		}
		if ($usr_alt_nm3_lcl1.equalsIgnoreCase(name)) {
			return usr_alt_nm3_lcl1();
		}
		if ($usr_alt_nm3_lcl2.equalsIgnoreCase(name)) {
			return usr_alt_nm3_lcl2();
		}
		if ($usr_alt_nm3_lcl3.equalsIgnoreCase(name)) {
			return usr_alt_nm3_lcl3();
		}
		if ($usr_alt_nm3_lcl4.equalsIgnoreCase(name)) {
			return usr_alt_nm3_lcl4();
		}
		if ($usr_alt_nm3_lcl5.equalsIgnoreCase(name)) {
			return usr_alt_nm3_lcl5();
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			return usr_alt_nm4();
		}
		if ($usr_alt_nm4_lcl1.equalsIgnoreCase(name)) {
			return usr_alt_nm4_lcl1();
		}
		if ($usr_alt_nm4_lcl2.equalsIgnoreCase(name)) {
			return usr_alt_nm4_lcl2();
		}
		if ($usr_alt_nm4_lcl3.equalsIgnoreCase(name)) {
			return usr_alt_nm4_lcl3();
		}
		if ($usr_alt_nm4_lcl4.equalsIgnoreCase(name)) {
			return usr_alt_nm4_lcl4();
		}
		if ($usr_alt_nm4_lcl5.equalsIgnoreCase(name)) {
			return usr_alt_nm4_lcl5();
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			return usr_info1();
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			return usr_info2();
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			return usr_info3();
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			return usr_info4();
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			return usr_info5();
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			return usr_info6();
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			return usr_info7();
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			return usr_info8();
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			return usr_info9();
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			return usr_info10();
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			return usr_info11();
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			return usr_info12();
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			return usr_info13();
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			return usr_info14();
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			return usr_info15();
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			return usr_info16();
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			return usr_info17();
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			return usr_info18();
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			return usr_info19();
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			return usr_info20();
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

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_nm_lcl1.equalsIgnoreCase(name)) {
			usr_nm_lcl1(value);
			return;
		}
		if ($usr_nm_lcl2.equalsIgnoreCase(name)) {
			usr_nm_lcl2(value);
			return;
		}
		if ($usr_nm_lcl3.equalsIgnoreCase(name)) {
			usr_nm_lcl3(value);
			return;
		}
		if ($usr_nm_lcl4.equalsIgnoreCase(name)) {
			usr_nm_lcl4(value);
			return;
		}
		if ($usr_nm_lcl5.equalsIgnoreCase(name)) {
			usr_nm_lcl5(value);
			return;
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			usr_alt_nm1(value);
			return;
		}
		if ($usr_alt_nm1_lcl1.equalsIgnoreCase(name)) {
			usr_alt_nm1_lcl1(value);
			return;
		}
		if ($usr_alt_nm1_lcl2.equalsIgnoreCase(name)) {
			usr_alt_nm1_lcl2(value);
			return;
		}
		if ($usr_alt_nm1_lcl3.equalsIgnoreCase(name)) {
			usr_alt_nm1_lcl3(value);
			return;
		}
		if ($usr_alt_nm1_lcl4.equalsIgnoreCase(name)) {
			usr_alt_nm1_lcl4(value);
			return;
		}
		if ($usr_alt_nm1_lcl5.equalsIgnoreCase(name)) {
			usr_alt_nm1_lcl5(value);
			return;
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			usr_alt_nm2(value);
			return;
		}
		if ($usr_alt_nm2_lcl1.equalsIgnoreCase(name)) {
			usr_alt_nm2_lcl1(value);
			return;
		}
		if ($usr_alt_nm2_lcl2.equalsIgnoreCase(name)) {
			usr_alt_nm2_lcl2(value);
			return;
		}
		if ($usr_alt_nm2_lcl3.equalsIgnoreCase(name)) {
			usr_alt_nm2_lcl3(value);
			return;
		}
		if ($usr_alt_nm2_lcl4.equalsIgnoreCase(name)) {
			usr_alt_nm2_lcl4(value);
			return;
		}
		if ($usr_alt_nm2_lcl5.equalsIgnoreCase(name)) {
			usr_alt_nm2_lcl5(value);
			return;
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			usr_alt_nm3(value);
			return;
		}
		if ($usr_alt_nm3_lcl1.equalsIgnoreCase(name)) {
			usr_alt_nm3_lcl1(value);
			return;
		}
		if ($usr_alt_nm3_lcl2.equalsIgnoreCase(name)) {
			usr_alt_nm3_lcl2(value);
			return;
		}
		if ($usr_alt_nm3_lcl3.equalsIgnoreCase(name)) {
			usr_alt_nm3_lcl3(value);
			return;
		}
		if ($usr_alt_nm3_lcl4.equalsIgnoreCase(name)) {
			usr_alt_nm3_lcl4(value);
			return;
		}
		if ($usr_alt_nm3_lcl5.equalsIgnoreCase(name)) {
			usr_alt_nm3_lcl5(value);
			return;
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			usr_alt_nm4(value);
			return;
		}
		if ($usr_alt_nm4_lcl1.equalsIgnoreCase(name)) {
			usr_alt_nm4_lcl1(value);
			return;
		}
		if ($usr_alt_nm4_lcl2.equalsIgnoreCase(name)) {
			usr_alt_nm4_lcl2(value);
			return;
		}
		if ($usr_alt_nm4_lcl3.equalsIgnoreCase(name)) {
			usr_alt_nm4_lcl3(value);
			return;
		}
		if ($usr_alt_nm4_lcl4.equalsIgnoreCase(name)) {
			usr_alt_nm4_lcl4(value);
			return;
		}
		if ($usr_alt_nm4_lcl5.equalsIgnoreCase(name)) {
			usr_alt_nm4_lcl5(value);
			return;
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			usr_info1(value);
			return;
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			usr_info2(value);
			return;
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			usr_info3(value);
			return;
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			usr_info4(value);
			return;
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			usr_info5(value);
			return;
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			usr_info6(value);
			return;
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			usr_info7(value);
			return;
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			usr_info8(value);
			return;
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			usr_info9(value);
			return;
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			usr_info10(value);
			return;
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			usr_info11(value);
			return;
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			usr_info12(value);
			return;
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			usr_info13(value);
			return;
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			usr_info14(value);
			return;
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			usr_info15(value);
			return;
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			usr_info16(value);
			return;
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			usr_info17(value);
			return;
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			usr_info18(value);
			return;
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			usr_info19(value);
			return;
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			usr_info20(value);
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

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_nm_lcl1.equalsIgnoreCase(name)) {
			usr_nm_lcl1(value);
			return;
		}
		if ($usr_nm_lcl2.equalsIgnoreCase(name)) {
			usr_nm_lcl2(value);
			return;
		}
		if ($usr_nm_lcl3.equalsIgnoreCase(name)) {
			usr_nm_lcl3(value);
			return;
		}
		if ($usr_nm_lcl4.equalsIgnoreCase(name)) {
			usr_nm_lcl4(value);
			return;
		}
		if ($usr_nm_lcl5.equalsIgnoreCase(name)) {
			usr_nm_lcl5(value);
			return;
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			usr_alt_nm1(value);
			return;
		}
		if ($usr_alt_nm1_lcl1.equalsIgnoreCase(name)) {
			usr_alt_nm1_lcl1(value);
			return;
		}
		if ($usr_alt_nm1_lcl2.equalsIgnoreCase(name)) {
			usr_alt_nm1_lcl2(value);
			return;
		}
		if ($usr_alt_nm1_lcl3.equalsIgnoreCase(name)) {
			usr_alt_nm1_lcl3(value);
			return;
		}
		if ($usr_alt_nm1_lcl4.equalsIgnoreCase(name)) {
			usr_alt_nm1_lcl4(value);
			return;
		}
		if ($usr_alt_nm1_lcl5.equalsIgnoreCase(name)) {
			usr_alt_nm1_lcl5(value);
			return;
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			usr_alt_nm2(value);
			return;
		}
		if ($usr_alt_nm2_lcl1.equalsIgnoreCase(name)) {
			usr_alt_nm2_lcl1(value);
			return;
		}
		if ($usr_alt_nm2_lcl2.equalsIgnoreCase(name)) {
			usr_alt_nm2_lcl2(value);
			return;
		}
		if ($usr_alt_nm2_lcl3.equalsIgnoreCase(name)) {
			usr_alt_nm2_lcl3(value);
			return;
		}
		if ($usr_alt_nm2_lcl4.equalsIgnoreCase(name)) {
			usr_alt_nm2_lcl4(value);
			return;
		}
		if ($usr_alt_nm2_lcl5.equalsIgnoreCase(name)) {
			usr_alt_nm2_lcl5(value);
			return;
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			usr_alt_nm3(value);
			return;
		}
		if ($usr_alt_nm3_lcl1.equalsIgnoreCase(name)) {
			usr_alt_nm3_lcl1(value);
			return;
		}
		if ($usr_alt_nm3_lcl2.equalsIgnoreCase(name)) {
			usr_alt_nm3_lcl2(value);
			return;
		}
		if ($usr_alt_nm3_lcl3.equalsIgnoreCase(name)) {
			usr_alt_nm3_lcl3(value);
			return;
		}
		if ($usr_alt_nm3_lcl4.equalsIgnoreCase(name)) {
			usr_alt_nm3_lcl4(value);
			return;
		}
		if ($usr_alt_nm3_lcl5.equalsIgnoreCase(name)) {
			usr_alt_nm3_lcl5(value);
			return;
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			usr_alt_nm4(value);
			return;
		}
		if ($usr_alt_nm4_lcl1.equalsIgnoreCase(name)) {
			usr_alt_nm4_lcl1(value);
			return;
		}
		if ($usr_alt_nm4_lcl2.equalsIgnoreCase(name)) {
			usr_alt_nm4_lcl2(value);
			return;
		}
		if ($usr_alt_nm4_lcl3.equalsIgnoreCase(name)) {
			usr_alt_nm4_lcl3(value);
			return;
		}
		if ($usr_alt_nm4_lcl4.equalsIgnoreCase(name)) {
			usr_alt_nm4_lcl4(value);
			return;
		}
		if ($usr_alt_nm4_lcl5.equalsIgnoreCase(name)) {
			usr_alt_nm4_lcl5(value);
			return;
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			usr_info1(value);
			return;
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			usr_info2(value);
			return;
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			usr_info3(value);
			return;
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			usr_info4(value);
			return;
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			usr_info5(value);
			return;
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			usr_info6(value);
			return;
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			usr_info7(value);
			return;
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			usr_info8(value);
			return;
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			usr_info9(value);
			return;
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			usr_info10(value);
			return;
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			usr_info11(value);
			return;
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			usr_info12(value);
			return;
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			usr_info13(value);
			return;
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			usr_info14(value);
			return;
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			usr_info15(value);
			return;
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			usr_info16(value);
			return;
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			usr_info17(value);
			return;
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			usr_info18(value);
			return;
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			usr_info19(value);
			return;
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			usr_info20(value);
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

}
