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
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価部門マスタ送信ＩＦ // Cost dept. master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>term</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期</td>
 *  	<td>Term</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門名</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名（ロケール１）</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名（ロケール２）</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名（ロケール３）</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名（ロケール４）</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名（ロケール５）</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名</td>
 *  	<td>Distribution group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lg_grp_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名（ロケール１）</td>
 *  	<td>Distribution group name (Locale 1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名（ロケール２）</td>
 *  	<td>Distribution group name (Locale 2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lg_grp_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名（ロケール３）</td>
 *  	<td>Distribution group name (Locale 3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名（ロケール４）</td>
 *  	<td>Distribution group name (Locale 4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lg_grp_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名（ロケール５）</td>
 *  	<td>Distribution group name (Locale 5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名</td>
 *  	<td>Mfg. location group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_grp_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名（ロケール１）</td>
 *  	<td>Mfg. location group name (Locale 1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_grp_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名（ロケール２）</td>
 *  	<td>Mfg. location group name (Locale 2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_grp_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名（ロケール３）</td>
 *  	<td>Mfg. location group name (Locale 3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_grp_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名（ロケール４）</td>
 *  	<td>Mfg. location group name (Locale 4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_grp_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名（ロケール５）</td>
 *  	<td>Mfg. location group name (Locale 5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名</td>
 *  	<td>WG name</td>
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
 *  <tr >
 *  	<td>C</td>
 *  	<td>site_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名</td>
 *  	<td>Factory/Distribution warehouse name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名（ロケール１）</td>
 *  	<td>Factory/Distribution warehouse name (Locale 1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>site_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名（ロケール２）</td>
 *  	<td>Factory/Distribution warehouse name (Locale 2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名（ロケール３）</td>
 *  	<td>Factory/Distribution warehouse name (Locale 3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>site_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名（ロケール４）</td>
 *  	<td>Factory/Distribution warehouse name (Locale 4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名（ロケール５）</td>
 *  	<td>Factory/Distribution warehouse name (Locale 5)</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_COST_DPT_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_COST_DPT_IF_ALL";

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
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	private static final MCPermColumnInfo _dpt_nm = createColumnInfo("dpt_nm");
	public final MCStringPermColumn dpt_nm = createStringColumn(_dpt_nm);
	
	/**
	 * 部門名（ロケール１）. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm_lcl1 = "dpt_nm_lcl1";
	private static final MCPermColumnInfo _dpt_nm_lcl1 = createColumnInfo("dpt_nm_lcl1");
	public final MCStringPermColumn dpt_nm_lcl1 = createStringColumn(_dpt_nm_lcl1);
	
	/**
	 * 部門名（ロケール２）. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm_lcl2 = "dpt_nm_lcl2";
	private static final MCPermColumnInfo _dpt_nm_lcl2 = createColumnInfo("dpt_nm_lcl2");
	public final MCStringPermColumn dpt_nm_lcl2 = createStringColumn(_dpt_nm_lcl2);
	
	/**
	 * 部門名（ロケール３）. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm_lcl3 = "dpt_nm_lcl3";
	private static final MCPermColumnInfo _dpt_nm_lcl3 = createColumnInfo("dpt_nm_lcl3");
	public final MCStringPermColumn dpt_nm_lcl3 = createStringColumn(_dpt_nm_lcl3);
	
	/**
	 * 部門名（ロケール４）. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm_lcl4 = "dpt_nm_lcl4";
	private static final MCPermColumnInfo _dpt_nm_lcl4 = createColumnInfo("dpt_nm_lcl4");
	public final MCStringPermColumn dpt_nm_lcl4 = createStringColumn(_dpt_nm_lcl4);
	
	/**
	 * 部門名（ロケール５）. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm_lcl5 = "dpt_nm_lcl5";
	private static final MCPermColumnInfo _dpt_nm_lcl5 = createColumnInfo("dpt_nm_lcl5");
	public final MCStringPermColumn dpt_nm_lcl5 = createStringColumn(_dpt_nm_lcl5);
	
	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	private static final MCPermColumnInfo _lg_grp_nm = createColumnInfo("lg_grp_nm");
	public final MCStringPermColumn lg_grp_nm = createStringColumn(_lg_grp_nm);
	
	/**
	 * 物流グループ名（ロケール１）. Distribution group name (Locale 1).<p>
	 *
	 */
	public static final String $lg_grp_nm_lcl1 = "lg_grp_nm_lcl1";
	private static final MCPermColumnInfo _lg_grp_nm_lcl1 = createColumnInfo("lg_grp_nm_lcl1");
	public final MCStringPermColumn lg_grp_nm_lcl1 = createStringColumn(_lg_grp_nm_lcl1);
	
	/**
	 * 物流グループ名（ロケール２）. Distribution group name (Locale 2).<p>
	 *
	 */
	public static final String $lg_grp_nm_lcl2 = "lg_grp_nm_lcl2";
	private static final MCPermColumnInfo _lg_grp_nm_lcl2 = createColumnInfo("lg_grp_nm_lcl2");
	public final MCStringPermColumn lg_grp_nm_lcl2 = createStringColumn(_lg_grp_nm_lcl2);
	
	/**
	 * 物流グループ名（ロケール３）. Distribution group name (Locale 3).<p>
	 *
	 */
	public static final String $lg_grp_nm_lcl3 = "lg_grp_nm_lcl3";
	private static final MCPermColumnInfo _lg_grp_nm_lcl3 = createColumnInfo("lg_grp_nm_lcl3");
	public final MCStringPermColumn lg_grp_nm_lcl3 = createStringColumn(_lg_grp_nm_lcl3);
	
	/**
	 * 物流グループ名（ロケール４）. Distribution group name (Locale 4).<p>
	 *
	 */
	public static final String $lg_grp_nm_lcl4 = "lg_grp_nm_lcl4";
	private static final MCPermColumnInfo _lg_grp_nm_lcl4 = createColumnInfo("lg_grp_nm_lcl4");
	public final MCStringPermColumn lg_grp_nm_lcl4 = createStringColumn(_lg_grp_nm_lcl4);
	
	/**
	 * 物流グループ名（ロケール５）. Distribution group name (Locale 5).<p>
	 *
	 */
	public static final String $lg_grp_nm_lcl5 = "lg_grp_nm_lcl5";
	private static final MCPermColumnInfo _lg_grp_nm_lcl5 = createColumnInfo("lg_grp_nm_lcl5");
	public final MCStringPermColumn lg_grp_nm_lcl5 = createStringColumn(_lg_grp_nm_lcl5);
	
	/**
	 * 製造場所グループ名. Mfg. location group name.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	private static final MCPermColumnInfo _loc_grp_nm = createColumnInfo("loc_grp_nm");
	public final MCStringPermColumn loc_grp_nm = createStringColumn(_loc_grp_nm);
	
	/**
	 * 製造場所グループ名（ロケール１）. Mfg. location group name (Locale 1).<p>
	 *
	 */
	public static final String $loc_grp_nm_lcl1 = "loc_grp_nm_lcl1";
	private static final MCPermColumnInfo _loc_grp_nm_lcl1 = createColumnInfo("loc_grp_nm_lcl1");
	public final MCStringPermColumn loc_grp_nm_lcl1 = createStringColumn(_loc_grp_nm_lcl1);
	
	/**
	 * 製造場所グループ名（ロケール２）. Mfg. location group name (Locale 2).<p>
	 *
	 */
	public static final String $loc_grp_nm_lcl2 = "loc_grp_nm_lcl2";
	private static final MCPermColumnInfo _loc_grp_nm_lcl2 = createColumnInfo("loc_grp_nm_lcl2");
	public final MCStringPermColumn loc_grp_nm_lcl2 = createStringColumn(_loc_grp_nm_lcl2);
	
	/**
	 * 製造場所グループ名（ロケール３）. Mfg. location group name (Locale 3).<p>
	 *
	 */
	public static final String $loc_grp_nm_lcl3 = "loc_grp_nm_lcl3";
	private static final MCPermColumnInfo _loc_grp_nm_lcl3 = createColumnInfo("loc_grp_nm_lcl3");
	public final MCStringPermColumn loc_grp_nm_lcl3 = createStringColumn(_loc_grp_nm_lcl3);
	
	/**
	 * 製造場所グループ名（ロケール４）. Mfg. location group name (Locale 4).<p>
	 *
	 */
	public static final String $loc_grp_nm_lcl4 = "loc_grp_nm_lcl4";
	private static final MCPermColumnInfo _loc_grp_nm_lcl4 = createColumnInfo("loc_grp_nm_lcl4");
	public final MCStringPermColumn loc_grp_nm_lcl4 = createStringColumn(_loc_grp_nm_lcl4);
	
	/**
	 * 製造場所グループ名（ロケール５）. Mfg. location group name (Locale 5).<p>
	 *
	 */
	public static final String $loc_grp_nm_lcl5 = "loc_grp_nm_lcl5";
	private static final MCPermColumnInfo _loc_grp_nm_lcl5 = createColumnInfo("loc_grp_nm_lcl5");
	public final MCStringPermColumn loc_grp_nm_lcl5 = createStringColumn(_loc_grp_nm_lcl5);
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	private static final MCPermColumnInfo _wg_nm = createColumnInfo("wg_nm");
	public final MCStringPermColumn wg_nm = createStringColumn(_wg_nm);
	
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
	
	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	private static final MCPermColumnInfo _site_nm = createColumnInfo("site_nm");
	public final MCStringPermColumn site_nm = createStringColumn(_site_nm);
	
	/**
	 * 工場・物流倉庫名（ロケール１）. Factory/Distribution warehouse name (Locale 1).<p>
	 *
	 */
	public static final String $site_nm_lcl1 = "site_nm_lcl1";
	private static final MCPermColumnInfo _site_nm_lcl1 = createColumnInfo("site_nm_lcl1");
	public final MCStringPermColumn site_nm_lcl1 = createStringColumn(_site_nm_lcl1);
	
	/**
	 * 工場・物流倉庫名（ロケール２）. Factory/Distribution warehouse name (Locale 2).<p>
	 *
	 */
	public static final String $site_nm_lcl2 = "site_nm_lcl2";
	private static final MCPermColumnInfo _site_nm_lcl2 = createColumnInfo("site_nm_lcl2");
	public final MCStringPermColumn site_nm_lcl2 = createStringColumn(_site_nm_lcl2);
	
	/**
	 * 工場・物流倉庫名（ロケール３）. Factory/Distribution warehouse name (Locale 3).<p>
	 *
	 */
	public static final String $site_nm_lcl3 = "site_nm_lcl3";
	private static final MCPermColumnInfo _site_nm_lcl3 = createColumnInfo("site_nm_lcl3");
	public final MCStringPermColumn site_nm_lcl3 = createStringColumn(_site_nm_lcl3);
	
	/**
	 * 工場・物流倉庫名（ロケール４）. Factory/Distribution warehouse name (Locale 4).<p>
	 *
	 */
	public static final String $site_nm_lcl4 = "site_nm_lcl4";
	private static final MCPermColumnInfo _site_nm_lcl4 = createColumnInfo("site_nm_lcl4");
	public final MCStringPermColumn site_nm_lcl4 = createStringColumn(_site_nm_lcl4);
	
	/**
	 * 工場・物流倉庫名（ロケール５）. Factory/Distribution warehouse name (Locale 5).<p>
	 *
	 */
	public static final String $site_nm_lcl5 = "site_nm_lcl5";
	private static final MCPermColumnInfo _site_nm_lcl5 = createColumnInfo("site_nm_lcl5");
	public final MCStringPermColumn site_nm_lcl5 = createStringColumn(_site_nm_lcl5);
	
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
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta dpt_nm_lcl1_META = createCommonMeta($dpt_nm_lcl1, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta dpt_nm_lcl2_META = createCommonMeta($dpt_nm_lcl2, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta dpt_nm_lcl3_META = createCommonMeta($dpt_nm_lcl3, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta dpt_nm_lcl4_META = createCommonMeta($dpt_nm_lcl4, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta dpt_nm_lcl5_META = createCommonMeta($dpt_nm_lcl5, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta lg_grp_nm_lcl1_META = createCommonMeta($lg_grp_nm_lcl1, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta lg_grp_nm_lcl2_META = createCommonMeta($lg_grp_nm_lcl2, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta lg_grp_nm_lcl3_META = createCommonMeta($lg_grp_nm_lcl3, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta lg_grp_nm_lcl4_META = createCommonMeta($lg_grp_nm_lcl4, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta lg_grp_nm_lcl5_META = createCommonMeta($lg_grp_nm_lcl5, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta loc_grp_nm_lcl1_META = createCommonMeta($loc_grp_nm_lcl1, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta loc_grp_nm_lcl2_META = createCommonMeta($loc_grp_nm_lcl2, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta loc_grp_nm_lcl3_META = createCommonMeta($loc_grp_nm_lcl3, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta loc_grp_nm_lcl4_META = createCommonMeta($loc_grp_nm_lcl4, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta loc_grp_nm_lcl5_META = createCommonMeta($loc_grp_nm_lcl5, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl1_META = createCommonMeta($wg_nm_lcl1, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl2_META = createCommonMeta($wg_nm_lcl2, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl3_META = createCommonMeta($wg_nm_lcl3, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl4_META = createCommonMeta($wg_nm_lcl4, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl5_META = createCommonMeta($wg_nm_lcl5, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta site_nm_lcl1_META = createCommonMeta($site_nm_lcl1, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta site_nm_lcl2_META = createCommonMeta($site_nm_lcl2, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta site_nm_lcl3_META = createCommonMeta($site_nm_lcl3, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta site_nm_lcl4_META = createCommonMeta($site_nm_lcl4, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta site_nm_lcl5_META = createCommonMeta($site_nm_lcl5, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_COST_DPT_IF_ALL_R> constMetas = new ConstMetaList<MAVM_COST_DPT_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			dpt_cd_META,
			term_META,
			dpt_nm_META,
			dpt_nm_lcl1_META,
			dpt_nm_lcl2_META,
			dpt_nm_lcl3_META,
			dpt_nm_lcl4_META,
			dpt_nm_lcl5_META,
			lg_grp_nm_META,
			lg_grp_nm_lcl1_META,
			lg_grp_nm_lcl2_META,
			lg_grp_nm_lcl3_META,
			lg_grp_nm_lcl4_META,
			lg_grp_nm_lcl5_META,
			loc_grp_nm_META,
			loc_grp_nm_lcl1_META,
			loc_grp_nm_lcl2_META,
			loc_grp_nm_lcl3_META,
			loc_grp_nm_lcl4_META,
			loc_grp_nm_lcl5_META,
			wg_nm_META,
			wg_nm_lcl1_META,
			wg_nm_lcl2_META,
			wg_nm_lcl3_META,
			wg_nm_lcl4_META,
			wg_nm_lcl5_META,
			site_nm_META,
			site_nm_lcl1_META,
			site_nm_lcl2_META,
			site_nm_lcl3_META,
			site_nm_lcl4_META,
			site_nm_lcl5_META,
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
	protected MAVM_COST_DPT_IF_ALL_R(ConstMetaList<? extends MAVM_COST_DPT_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_COST_DPT_IF_ALL_R(ConstMetaList<? extends MAVM_COST_DPT_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$co_cd,
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
			MAVM_COST_DPT_IF_ALL_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$dpt_cd,
				"dpt_cd",
				dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAVM_COST_DPT_IF_ALL_R.$term,
				"term",
				term,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$dpt_nm,
				"dpt_nm",
				dpt_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$dpt_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$dpt_nm_lcl1,
				"dpt_nm_lcl1",
				dpt_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$dpt_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$dpt_nm_lcl2,
				"dpt_nm_lcl2",
				dpt_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$dpt_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$dpt_nm_lcl3,
				"dpt_nm_lcl3",
				dpt_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$dpt_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$dpt_nm_lcl4,
				"dpt_nm_lcl4",
				dpt_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$dpt_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$dpt_nm_lcl5,
				"dpt_nm_lcl5",
				dpt_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm,
				"lg_grp_nm",
				lg_grp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm_lcl1,
				"lg_grp_nm_lcl1",
				lg_grp_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm_lcl2,
				"lg_grp_nm_lcl2",
				lg_grp_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm_lcl3,
				"lg_grp_nm_lcl3",
				lg_grp_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm_lcl4,
				"lg_grp_nm_lcl4",
				lg_grp_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$lg_grp_nm_lcl5,
				"lg_grp_nm_lcl5",
				lg_grp_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm,
				"loc_grp_nm",
				loc_grp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm_lcl1,
				"loc_grp_nm_lcl1",
				loc_grp_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm_lcl2,
				"loc_grp_nm_lcl2",
				loc_grp_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm_lcl3,
				"loc_grp_nm_lcl3",
				loc_grp_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm_lcl4,
				"loc_grp_nm_lcl4",
				loc_grp_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$loc_grp_nm_lcl5,
				"loc_grp_nm_lcl5",
				loc_grp_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$wg_nm,
				"wg_nm",
				wg_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$wg_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$wg_nm_lcl1,
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
			MAVM_COST_DPT_IF_ALL_R.$wg_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$wg_nm_lcl2,
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
			MAVM_COST_DPT_IF_ALL_R.$wg_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$wg_nm_lcl3,
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
			MAVM_COST_DPT_IF_ALL_R.$wg_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$wg_nm_lcl4,
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
			MAVM_COST_DPT_IF_ALL_R.$wg_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$wg_nm_lcl5,
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
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$site_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$site_nm,
				"site_nm",
				site_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$site_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$site_nm_lcl1,
				"site_nm_lcl1",
				site_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$site_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$site_nm_lcl2,
				"site_nm_lcl2",
				site_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$site_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$site_nm_lcl3,
				"site_nm_lcl3",
				site_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$site_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$site_nm_lcl4,
				"site_nm_lcl4",
				site_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$site_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$site_nm_lcl5,
				"site_nm_lcl5",
				site_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_COST_DPT_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$memo1,
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
			MAVM_COST_DPT_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$memo2,
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
			MAVM_COST_DPT_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_COST_DPT_IF_ALL_R.$memo3,
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
	public static MAVM_COST_DPT_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_COST_DPT_IF_ALL_R create(String alias) {
		MAVM_COST_DPT_IF_ALL_R row = new MAVM_COST_DPT_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_COST_DPT_IF_ALL_R createByName(T proto) {
		MAVM_COST_DPT_IF_ALL_R row = MAVM_COST_DPT_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_COST_DPT_IF_ALL_R clone() {
		return (MAVM_COST_DPT_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_COST_DPT_IF_ALL_R createInstance() {
		return (MAVM_COST_DPT_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_COST_DPT_IF_ALL_R getValues(String... names) {
		return (MAVM_COST_DPT_IF_ALL_R) super.getValues(names);
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
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 1, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 1, $dpt_cd, value);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 2, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 2, $term, value);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 3, $dpt_nm);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 3, $dpt_nm, value);
	}

	/**
	 * 部門名（ロケール１）. Dept. name.<p>
	 *
	 */
	public String dpt_nm_lcl1() {
		return getConstString(offset + 4, $dpt_nm_lcl1);
	}

	/**
	 * 部門名（ロケール１）. Dept. name.<p>
	 *
	 */
	public void dpt_nm_lcl1(String value) {
		setConstString(offset + 4, $dpt_nm_lcl1, value);
	}

	/**
	 * 部門名（ロケール２）. Dept. name.<p>
	 *
	 */
	public String dpt_nm_lcl2() {
		return getConstString(offset + 5, $dpt_nm_lcl2);
	}

	/**
	 * 部門名（ロケール２）. Dept. name.<p>
	 *
	 */
	public void dpt_nm_lcl2(String value) {
		setConstString(offset + 5, $dpt_nm_lcl2, value);
	}

	/**
	 * 部門名（ロケール３）. Dept. name.<p>
	 *
	 */
	public String dpt_nm_lcl3() {
		return getConstString(offset + 6, $dpt_nm_lcl3);
	}

	/**
	 * 部門名（ロケール３）. Dept. name.<p>
	 *
	 */
	public void dpt_nm_lcl3(String value) {
		setConstString(offset + 6, $dpt_nm_lcl3, value);
	}

	/**
	 * 部門名（ロケール４）. Dept. name.<p>
	 *
	 */
	public String dpt_nm_lcl4() {
		return getConstString(offset + 7, $dpt_nm_lcl4);
	}

	/**
	 * 部門名（ロケール４）. Dept. name.<p>
	 *
	 */
	public void dpt_nm_lcl4(String value) {
		setConstString(offset + 7, $dpt_nm_lcl4, value);
	}

	/**
	 * 部門名（ロケール５）. Dept. name.<p>
	 *
	 */
	public String dpt_nm_lcl5() {
		return getConstString(offset + 8, $dpt_nm_lcl5);
	}

	/**
	 * 部門名（ロケール５）. Dept. name.<p>
	 *
	 */
	public void dpt_nm_lcl5(String value) {
		setConstString(offset + 8, $dpt_nm_lcl5, value);
	}

	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 9, $lg_grp_nm);
	}

	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 9, $lg_grp_nm, value);
	}

	/**
	 * 物流グループ名（ロケール１）. Distribution group name (Locale 1).<p>
	 *
	 */
	public String lg_grp_nm_lcl1() {
		return getConstString(offset + 10, $lg_grp_nm_lcl1);
	}

	/**
	 * 物流グループ名（ロケール１）. Distribution group name (Locale 1).<p>
	 *
	 */
	public void lg_grp_nm_lcl1(String value) {
		setConstString(offset + 10, $lg_grp_nm_lcl1, value);
	}

	/**
	 * 物流グループ名（ロケール２）. Distribution group name (Locale 2).<p>
	 *
	 */
	public String lg_grp_nm_lcl2() {
		return getConstString(offset + 11, $lg_grp_nm_lcl2);
	}

	/**
	 * 物流グループ名（ロケール２）. Distribution group name (Locale 2).<p>
	 *
	 */
	public void lg_grp_nm_lcl2(String value) {
		setConstString(offset + 11, $lg_grp_nm_lcl2, value);
	}

	/**
	 * 物流グループ名（ロケール３）. Distribution group name (Locale 3).<p>
	 *
	 */
	public String lg_grp_nm_lcl3() {
		return getConstString(offset + 12, $lg_grp_nm_lcl3);
	}

	/**
	 * 物流グループ名（ロケール３）. Distribution group name (Locale 3).<p>
	 *
	 */
	public void lg_grp_nm_lcl3(String value) {
		setConstString(offset + 12, $lg_grp_nm_lcl3, value);
	}

	/**
	 * 物流グループ名（ロケール４）. Distribution group name (Locale 4).<p>
	 *
	 */
	public String lg_grp_nm_lcl4() {
		return getConstString(offset + 13, $lg_grp_nm_lcl4);
	}

	/**
	 * 物流グループ名（ロケール４）. Distribution group name (Locale 4).<p>
	 *
	 */
	public void lg_grp_nm_lcl4(String value) {
		setConstString(offset + 13, $lg_grp_nm_lcl4, value);
	}

	/**
	 * 物流グループ名（ロケール５）. Distribution group name (Locale 5).<p>
	 *
	 */
	public String lg_grp_nm_lcl5() {
		return getConstString(offset + 14, $lg_grp_nm_lcl5);
	}

	/**
	 * 物流グループ名（ロケール５）. Distribution group name (Locale 5).<p>
	 *
	 */
	public void lg_grp_nm_lcl5(String value) {
		setConstString(offset + 14, $lg_grp_nm_lcl5, value);
	}

	/**
	 * 製造場所グループ名. Mfg. location group name.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 15, $loc_grp_nm);
	}

	/**
	 * 製造場所グループ名. Mfg. location group name.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 15, $loc_grp_nm, value);
	}

	/**
	 * 製造場所グループ名（ロケール１）. Mfg. location group name (Locale 1).<p>
	 *
	 */
	public String loc_grp_nm_lcl1() {
		return getConstString(offset + 16, $loc_grp_nm_lcl1);
	}

	/**
	 * 製造場所グループ名（ロケール１）. Mfg. location group name (Locale 1).<p>
	 *
	 */
	public void loc_grp_nm_lcl1(String value) {
		setConstString(offset + 16, $loc_grp_nm_lcl1, value);
	}

	/**
	 * 製造場所グループ名（ロケール２）. Mfg. location group name (Locale 2).<p>
	 *
	 */
	public String loc_grp_nm_lcl2() {
		return getConstString(offset + 17, $loc_grp_nm_lcl2);
	}

	/**
	 * 製造場所グループ名（ロケール２）. Mfg. location group name (Locale 2).<p>
	 *
	 */
	public void loc_grp_nm_lcl2(String value) {
		setConstString(offset + 17, $loc_grp_nm_lcl2, value);
	}

	/**
	 * 製造場所グループ名（ロケール３）. Mfg. location group name (Locale 3).<p>
	 *
	 */
	public String loc_grp_nm_lcl3() {
		return getConstString(offset + 18, $loc_grp_nm_lcl3);
	}

	/**
	 * 製造場所グループ名（ロケール３）. Mfg. location group name (Locale 3).<p>
	 *
	 */
	public void loc_grp_nm_lcl3(String value) {
		setConstString(offset + 18, $loc_grp_nm_lcl3, value);
	}

	/**
	 * 製造場所グループ名（ロケール４）. Mfg. location group name (Locale 4).<p>
	 *
	 */
	public String loc_grp_nm_lcl4() {
		return getConstString(offset + 19, $loc_grp_nm_lcl4);
	}

	/**
	 * 製造場所グループ名（ロケール４）. Mfg. location group name (Locale 4).<p>
	 *
	 */
	public void loc_grp_nm_lcl4(String value) {
		setConstString(offset + 19, $loc_grp_nm_lcl4, value);
	}

	/**
	 * 製造場所グループ名（ロケール５）. Mfg. location group name (Locale 5).<p>
	 *
	 */
	public String loc_grp_nm_lcl5() {
		return getConstString(offset + 20, $loc_grp_nm_lcl5);
	}

	/**
	 * 製造場所グループ名（ロケール５）. Mfg. location group name (Locale 5).<p>
	 *
	 */
	public void loc_grp_nm_lcl5(String value) {
		setConstString(offset + 20, $loc_grp_nm_lcl5, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 21, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 21, $wg_nm, value);
	}

	/**
	 * ワーキンググループ名（ロケール１）. WG name (Locale 1).<p>
	 *
	 */
	public String wg_nm_lcl1() {
		return getConstString(offset + 22, $wg_nm_lcl1);
	}

	/**
	 * ワーキンググループ名（ロケール１）. WG name (Locale 1).<p>
	 *
	 */
	public void wg_nm_lcl1(String value) {
		setConstString(offset + 22, $wg_nm_lcl1, value);
	}

	/**
	 * ワーキンググループ名（ロケール２）. WG name (Locale 2).<p>
	 *
	 */
	public String wg_nm_lcl2() {
		return getConstString(offset + 23, $wg_nm_lcl2);
	}

	/**
	 * ワーキンググループ名（ロケール２）. WG name (Locale 2).<p>
	 *
	 */
	public void wg_nm_lcl2(String value) {
		setConstString(offset + 23, $wg_nm_lcl2, value);
	}

	/**
	 * ワーキンググループ名（ロケール３）. WG name (Locale 3).<p>
	 *
	 */
	public String wg_nm_lcl3() {
		return getConstString(offset + 24, $wg_nm_lcl3);
	}

	/**
	 * ワーキンググループ名（ロケール３）. WG name (Locale 3).<p>
	 *
	 */
	public void wg_nm_lcl3(String value) {
		setConstString(offset + 24, $wg_nm_lcl3, value);
	}

	/**
	 * ワーキンググループ名（ロケール４）. WG name (Locale 4).<p>
	 *
	 */
	public String wg_nm_lcl4() {
		return getConstString(offset + 25, $wg_nm_lcl4);
	}

	/**
	 * ワーキンググループ名（ロケール４）. WG name (Locale 4).<p>
	 *
	 */
	public void wg_nm_lcl4(String value) {
		setConstString(offset + 25, $wg_nm_lcl4, value);
	}

	/**
	 * ワーキンググループ名（ロケール５）. WG name (Locale 5).<p>
	 *
	 */
	public String wg_nm_lcl5() {
		return getConstString(offset + 26, $wg_nm_lcl5);
	}

	/**
	 * ワーキンググループ名（ロケール５）. WG name (Locale 5).<p>
	 *
	 */
	public void wg_nm_lcl5(String value) {
		setConstString(offset + 26, $wg_nm_lcl5, value);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 27, $site_nm);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 27, $site_nm, value);
	}

	/**
	 * 工場・物流倉庫名（ロケール１）. Factory/Distribution warehouse name (Locale 1).<p>
	 *
	 */
	public String site_nm_lcl1() {
		return getConstString(offset + 28, $site_nm_lcl1);
	}

	/**
	 * 工場・物流倉庫名（ロケール１）. Factory/Distribution warehouse name (Locale 1).<p>
	 *
	 */
	public void site_nm_lcl1(String value) {
		setConstString(offset + 28, $site_nm_lcl1, value);
	}

	/**
	 * 工場・物流倉庫名（ロケール２）. Factory/Distribution warehouse name (Locale 2).<p>
	 *
	 */
	public String site_nm_lcl2() {
		return getConstString(offset + 29, $site_nm_lcl2);
	}

	/**
	 * 工場・物流倉庫名（ロケール２）. Factory/Distribution warehouse name (Locale 2).<p>
	 *
	 */
	public void site_nm_lcl2(String value) {
		setConstString(offset + 29, $site_nm_lcl2, value);
	}

	/**
	 * 工場・物流倉庫名（ロケール３）. Factory/Distribution warehouse name (Locale 3).<p>
	 *
	 */
	public String site_nm_lcl3() {
		return getConstString(offset + 30, $site_nm_lcl3);
	}

	/**
	 * 工場・物流倉庫名（ロケール３）. Factory/Distribution warehouse name (Locale 3).<p>
	 *
	 */
	public void site_nm_lcl3(String value) {
		setConstString(offset + 30, $site_nm_lcl3, value);
	}

	/**
	 * 工場・物流倉庫名（ロケール４）. Factory/Distribution warehouse name (Locale 4).<p>
	 *
	 */
	public String site_nm_lcl4() {
		return getConstString(offset + 31, $site_nm_lcl4);
	}

	/**
	 * 工場・物流倉庫名（ロケール４）. Factory/Distribution warehouse name (Locale 4).<p>
	 *
	 */
	public void site_nm_lcl4(String value) {
		setConstString(offset + 31, $site_nm_lcl4, value);
	}

	/**
	 * 工場・物流倉庫名（ロケール５）. Factory/Distribution warehouse name (Locale 5).<p>
	 *
	 */
	public String site_nm_lcl5() {
		return getConstString(offset + 32, $site_nm_lcl5);
	}

	/**
	 * 工場・物流倉庫名（ロケール５）. Factory/Distribution warehouse name (Locale 5).<p>
	 *
	 */
	public void site_nm_lcl5(String value) {
		setConstString(offset + 32, $site_nm_lcl5, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 33, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 33, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 34, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 34, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 35, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 35, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_nm_lcl1.equalsIgnoreCase(name)) {
			return dpt_nm_lcl1();
		}
		if ($dpt_nm_lcl2.equalsIgnoreCase(name)) {
			return dpt_nm_lcl2();
		}
		if ($dpt_nm_lcl3.equalsIgnoreCase(name)) {
			return dpt_nm_lcl3();
		}
		if ($dpt_nm_lcl4.equalsIgnoreCase(name)) {
			return dpt_nm_lcl4();
		}
		if ($dpt_nm_lcl5.equalsIgnoreCase(name)) {
			return dpt_nm_lcl5();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($lg_grp_nm_lcl1.equalsIgnoreCase(name)) {
			return lg_grp_nm_lcl1();
		}
		if ($lg_grp_nm_lcl2.equalsIgnoreCase(name)) {
			return lg_grp_nm_lcl2();
		}
		if ($lg_grp_nm_lcl3.equalsIgnoreCase(name)) {
			return lg_grp_nm_lcl3();
		}
		if ($lg_grp_nm_lcl4.equalsIgnoreCase(name)) {
			return lg_grp_nm_lcl4();
		}
		if ($lg_grp_nm_lcl5.equalsIgnoreCase(name)) {
			return lg_grp_nm_lcl5();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($loc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			return loc_grp_nm_lcl1();
		}
		if ($loc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			return loc_grp_nm_lcl2();
		}
		if ($loc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			return loc_grp_nm_lcl3();
		}
		if ($loc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			return loc_grp_nm_lcl4();
		}
		if ($loc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			return loc_grp_nm_lcl5();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($site_nm_lcl1.equalsIgnoreCase(name)) {
			return site_nm_lcl1();
		}
		if ($site_nm_lcl2.equalsIgnoreCase(name)) {
			return site_nm_lcl2();
		}
		if ($site_nm_lcl3.equalsIgnoreCase(name)) {
			return site_nm_lcl3();
		}
		if ($site_nm_lcl4.equalsIgnoreCase(name)) {
			return site_nm_lcl4();
		}
		if ($site_nm_lcl5.equalsIgnoreCase(name)) {
			return site_nm_lcl5();
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

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_nm_lcl1.equalsIgnoreCase(name)) {
			return dpt_nm_lcl1();
		}
		if ($dpt_nm_lcl2.equalsIgnoreCase(name)) {
			return dpt_nm_lcl2();
		}
		if ($dpt_nm_lcl3.equalsIgnoreCase(name)) {
			return dpt_nm_lcl3();
		}
		if ($dpt_nm_lcl4.equalsIgnoreCase(name)) {
			return dpt_nm_lcl4();
		}
		if ($dpt_nm_lcl5.equalsIgnoreCase(name)) {
			return dpt_nm_lcl5();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($lg_grp_nm_lcl1.equalsIgnoreCase(name)) {
			return lg_grp_nm_lcl1();
		}
		if ($lg_grp_nm_lcl2.equalsIgnoreCase(name)) {
			return lg_grp_nm_lcl2();
		}
		if ($lg_grp_nm_lcl3.equalsIgnoreCase(name)) {
			return lg_grp_nm_lcl3();
		}
		if ($lg_grp_nm_lcl4.equalsIgnoreCase(name)) {
			return lg_grp_nm_lcl4();
		}
		if ($lg_grp_nm_lcl5.equalsIgnoreCase(name)) {
			return lg_grp_nm_lcl5();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($loc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			return loc_grp_nm_lcl1();
		}
		if ($loc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			return loc_grp_nm_lcl2();
		}
		if ($loc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			return loc_grp_nm_lcl3();
		}
		if ($loc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			return loc_grp_nm_lcl4();
		}
		if ($loc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			return loc_grp_nm_lcl5();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($site_nm_lcl1.equalsIgnoreCase(name)) {
			return site_nm_lcl1();
		}
		if ($site_nm_lcl2.equalsIgnoreCase(name)) {
			return site_nm_lcl2();
		}
		if ($site_nm_lcl3.equalsIgnoreCase(name)) {
			return site_nm_lcl3();
		}
		if ($site_nm_lcl4.equalsIgnoreCase(name)) {
			return site_nm_lcl4();
		}
		if ($site_nm_lcl5.equalsIgnoreCase(name)) {
			return site_nm_lcl5();
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

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_nm_lcl1.equalsIgnoreCase(name)) {
			dpt_nm_lcl1(value);
			return;
		}
		if ($dpt_nm_lcl2.equalsIgnoreCase(name)) {
			dpt_nm_lcl2(value);
			return;
		}
		if ($dpt_nm_lcl3.equalsIgnoreCase(name)) {
			dpt_nm_lcl3(value);
			return;
		}
		if ($dpt_nm_lcl4.equalsIgnoreCase(name)) {
			dpt_nm_lcl4(value);
			return;
		}
		if ($dpt_nm_lcl5.equalsIgnoreCase(name)) {
			dpt_nm_lcl5(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($lg_grp_nm_lcl1.equalsIgnoreCase(name)) {
			lg_grp_nm_lcl1(value);
			return;
		}
		if ($lg_grp_nm_lcl2.equalsIgnoreCase(name)) {
			lg_grp_nm_lcl2(value);
			return;
		}
		if ($lg_grp_nm_lcl3.equalsIgnoreCase(name)) {
			lg_grp_nm_lcl3(value);
			return;
		}
		if ($lg_grp_nm_lcl4.equalsIgnoreCase(name)) {
			lg_grp_nm_lcl4(value);
			return;
		}
		if ($lg_grp_nm_lcl5.equalsIgnoreCase(name)) {
			lg_grp_nm_lcl5(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($loc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			loc_grp_nm_lcl1(value);
			return;
		}
		if ($loc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			loc_grp_nm_lcl2(value);
			return;
		}
		if ($loc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			loc_grp_nm_lcl3(value);
			return;
		}
		if ($loc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			loc_grp_nm_lcl4(value);
			return;
		}
		if ($loc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			loc_grp_nm_lcl5(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($site_nm_lcl1.equalsIgnoreCase(name)) {
			site_nm_lcl1(value);
			return;
		}
		if ($site_nm_lcl2.equalsIgnoreCase(name)) {
			site_nm_lcl2(value);
			return;
		}
		if ($site_nm_lcl3.equalsIgnoreCase(name)) {
			site_nm_lcl3(value);
			return;
		}
		if ($site_nm_lcl4.equalsIgnoreCase(name)) {
			site_nm_lcl4(value);
			return;
		}
		if ($site_nm_lcl5.equalsIgnoreCase(name)) {
			site_nm_lcl5(value);
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

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_nm_lcl1.equalsIgnoreCase(name)) {
			dpt_nm_lcl1(value);
			return;
		}
		if ($dpt_nm_lcl2.equalsIgnoreCase(name)) {
			dpt_nm_lcl2(value);
			return;
		}
		if ($dpt_nm_lcl3.equalsIgnoreCase(name)) {
			dpt_nm_lcl3(value);
			return;
		}
		if ($dpt_nm_lcl4.equalsIgnoreCase(name)) {
			dpt_nm_lcl4(value);
			return;
		}
		if ($dpt_nm_lcl5.equalsIgnoreCase(name)) {
			dpt_nm_lcl5(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($lg_grp_nm_lcl1.equalsIgnoreCase(name)) {
			lg_grp_nm_lcl1(value);
			return;
		}
		if ($lg_grp_nm_lcl2.equalsIgnoreCase(name)) {
			lg_grp_nm_lcl2(value);
			return;
		}
		if ($lg_grp_nm_lcl3.equalsIgnoreCase(name)) {
			lg_grp_nm_lcl3(value);
			return;
		}
		if ($lg_grp_nm_lcl4.equalsIgnoreCase(name)) {
			lg_grp_nm_lcl4(value);
			return;
		}
		if ($lg_grp_nm_lcl5.equalsIgnoreCase(name)) {
			lg_grp_nm_lcl5(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($loc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			loc_grp_nm_lcl1(value);
			return;
		}
		if ($loc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			loc_grp_nm_lcl2(value);
			return;
		}
		if ($loc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			loc_grp_nm_lcl3(value);
			return;
		}
		if ($loc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			loc_grp_nm_lcl4(value);
			return;
		}
		if ($loc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			loc_grp_nm_lcl5(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($site_nm_lcl1.equalsIgnoreCase(name)) {
			site_nm_lcl1(value);
			return;
		}
		if ($site_nm_lcl2.equalsIgnoreCase(name)) {
			site_nm_lcl2(value);
			return;
		}
		if ($site_nm_lcl3.equalsIgnoreCase(name)) {
			site_nm_lcl3(value);
			return;
		}
		if ($site_nm_lcl4.equalsIgnoreCase(name)) {
			site_nm_lcl4(value);
			return;
		}
		if ($site_nm_lcl5.equalsIgnoreCase(name)) {
			site_nm_lcl5(value);
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

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
