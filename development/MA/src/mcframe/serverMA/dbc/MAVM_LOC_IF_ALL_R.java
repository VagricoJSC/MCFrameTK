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
 * "場所マスタ送信ＩＦ // Location master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所名</td>
 *  	<td>Location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所名（ロケール１）</td>
 *  	<td>Location name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所名（ロケール２）</td>
 *  	<td>Location name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所名（ロケール３）</td>
 *  	<td>Location name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所名（ロケール４）</td>
 *  	<td>Location name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所名（ロケール５）</td>
 *  	<td>Location name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名</td>
 *  	<td>WG name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール１）</td>
 *  	<td>WG name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール２）</td>
 *  	<td>WG name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール３）</td>
 *  	<td>WG name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール４）</td>
 *  	<td>WG name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール５）</td>
 *  	<td>WG name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名</td>
 *  	<td>Factory/Distribution warehouse name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>site_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名（ロケール１）</td>
 *  	<td>Factory/Distribution warehouse name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名（ロケール２）</td>
 *  	<td>Factory/Distribution warehouse name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>site_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名（ロケール３）</td>
 *  	<td>Factory/Distribution warehouse name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名（ロケール４）</td>
 *  	<td>Factory/Distribution warehouse name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>site_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名（ロケール５）</td>
 *  	<td>Factory/Distribution warehouse name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名</td>
 *  	<td>Distribution group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名（ロケール１）</td>
 *  	<td>Distribution group name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lg_grp_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名（ロケール２）</td>
 *  	<td>Distribution group name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名（ロケール３）</td>
 *  	<td>Distribution group name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lg_grp_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名（ロケール４）</td>
 *  	<td>Distribution group name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループ名（ロケール５）</td>
 *  	<td>Distribution group name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名</td>
 *  	<td>Mfg. location group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_grp_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名（ロケール１）</td>
 *  	<td>Mfg. location group name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_grp_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名（ロケール２）</td>
 *  	<td>Mfg. location group name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_grp_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名（ロケール３）</td>
 *  	<td>Mfg. location group name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_grp_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名（ロケール４）</td>
 *  	<td>Mfg. location group name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_grp_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループ名（ロケール５）</td>
 *  	<td>Mfg. location group name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループ名</td>
 *  	<td>Gross allocation location group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alloc_grp_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループ名（ロケール１）</td>
 *  	<td>Gross allocation location group name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_grp_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループ名（ロケール２）</td>
 *  	<td>Gross allocation location group name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alloc_grp_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループ名（ロケール３）</td>
 *  	<td>Gross allocation location group name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_grp_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループ名（ロケール４）</td>
 *  	<td>Gross allocation location group name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alloc_grp_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループ名（ロケール５）</td>
 *  	<td>Gross allocation location group name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先名</td>
 *  	<td>Supplier name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先名（ロケール１）</td>
 *  	<td>Supplier name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先名（ロケール２）</td>
 *  	<td>Supplier name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先名（ロケール３）</td>
 *  	<td>Supplier name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先名（ロケール４）</td>
 *  	<td>Supplier name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先名（ロケール５）</td>
 *  	<td>Supplier name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cntry_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国名</td>
 *  	<td>Country name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cntry_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国名（ロケール１）</td>
 *  	<td>Country name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cntry_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国名（ロケール２）</td>
 *  	<td>Country name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cntry_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国名（ロケール３）</td>
 *  	<td>Country name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cntry_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国名（ロケール４）</td>
 *  	<td>Country name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cntry_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国名（ロケール５）</td>
 *  	<td>Country name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsrc_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名１</td>
 *  	<td>Resource name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsrc_nm1_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名１（ロケール１）</td>
 *  	<td>Resource name 1 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsrc_nm1_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名１（ロケール２）</td>
 *  	<td>Resource name 1 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsrc_nm1_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名１（ロケール３）</td>
 *  	<td>Resource name 1 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsrc_nm1_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名１（ロケール４）</td>
 *  	<td>Resource name 1 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsrc_nm1_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名１（ロケール５）</td>
 *  	<td>Resource name 1 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsrc_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名２</td>
 *  	<td>Resource name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsrc_nm2_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名２（ロケール１）</td>
 *  	<td>Resource name 2 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsrc_nm2_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名２（ロケール２）</td>
 *  	<td>Resource name 2 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsrc_nm2_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名２（ロケール３）</td>
 *  	<td>Resource name 2 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsrc_nm2_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名２（ロケール４）</td>
 *  	<td>Resource name 2 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsrc_nm2_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源名２（ロケール５）</td>
 *  	<td>Resource name 2 (Locale 5)</td>
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
public class MAVM_LOC_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_LOC_IF_ALL";

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
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	private static final MCPermColumnInfo _loc_nm = createColumnInfo("loc_nm");
	public final MCStringPermColumn loc_nm = createStringColumn(_loc_nm);
	
	/**
	 * 場所名（ロケール１）. Location name (Locale 1).<p>
	 *
	 */
	public static final String $loc_nm_lcl1 = "loc_nm_lcl1";
	private static final MCPermColumnInfo _loc_nm_lcl1 = createColumnInfo("loc_nm_lcl1");
	public final MCStringPermColumn loc_nm_lcl1 = createStringColumn(_loc_nm_lcl1);
	
	/**
	 * 場所名（ロケール２）. Location name (Locale 2).<p>
	 *
	 */
	public static final String $loc_nm_lcl2 = "loc_nm_lcl2";
	private static final MCPermColumnInfo _loc_nm_lcl2 = createColumnInfo("loc_nm_lcl2");
	public final MCStringPermColumn loc_nm_lcl2 = createStringColumn(_loc_nm_lcl2);
	
	/**
	 * 場所名（ロケール３）. Location name (Locale 3).<p>
	 *
	 */
	public static final String $loc_nm_lcl3 = "loc_nm_lcl3";
	private static final MCPermColumnInfo _loc_nm_lcl3 = createColumnInfo("loc_nm_lcl3");
	public final MCStringPermColumn loc_nm_lcl3 = createStringColumn(_loc_nm_lcl3);
	
	/**
	 * 場所名（ロケール４）. Location name (Locale 4).<p>
	 *
	 */
	public static final String $loc_nm_lcl4 = "loc_nm_lcl4";
	private static final MCPermColumnInfo _loc_nm_lcl4 = createColumnInfo("loc_nm_lcl4");
	public final MCStringPermColumn loc_nm_lcl4 = createStringColumn(_loc_nm_lcl4);
	
	/**
	 * 場所名（ロケール５）. Location name (Locale 5).<p>
	 *
	 */
	public static final String $loc_nm_lcl5 = "loc_nm_lcl5";
	private static final MCPermColumnInfo _loc_nm_lcl5 = createColumnInfo("loc_nm_lcl5");
	public final MCStringPermColumn loc_nm_lcl5 = createStringColumn(_loc_nm_lcl5);
	
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
	 * 総量引当場所グループ名. Gross allocation location group name.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	private static final MCPermColumnInfo _alloc_grp_nm = createColumnInfo("alloc_grp_nm");
	public final MCStringPermColumn alloc_grp_nm = createStringColumn(_alloc_grp_nm);
	
	/**
	 * 総量引当場所グループ名（ロケール１）. Gross allocation location group name (Locale 1).<p>
	 *
	 */
	public static final String $alloc_grp_nm_lcl1 = "alloc_grp_nm_lcl1";
	private static final MCPermColumnInfo _alloc_grp_nm_lcl1 = createColumnInfo("alloc_grp_nm_lcl1");
	public final MCStringPermColumn alloc_grp_nm_lcl1 = createStringColumn(_alloc_grp_nm_lcl1);
	
	/**
	 * 総量引当場所グループ名（ロケール２）. Gross allocation location group name (Locale 2).<p>
	 *
	 */
	public static final String $alloc_grp_nm_lcl2 = "alloc_grp_nm_lcl2";
	private static final MCPermColumnInfo _alloc_grp_nm_lcl2 = createColumnInfo("alloc_grp_nm_lcl2");
	public final MCStringPermColumn alloc_grp_nm_lcl2 = createStringColumn(_alloc_grp_nm_lcl2);
	
	/**
	 * 総量引当場所グループ名（ロケール３）. Gross allocation location group name (Locale 3).<p>
	 *
	 */
	public static final String $alloc_grp_nm_lcl3 = "alloc_grp_nm_lcl3";
	private static final MCPermColumnInfo _alloc_grp_nm_lcl3 = createColumnInfo("alloc_grp_nm_lcl3");
	public final MCStringPermColumn alloc_grp_nm_lcl3 = createStringColumn(_alloc_grp_nm_lcl3);
	
	/**
	 * 総量引当場所グループ名（ロケール４）. Gross allocation location group name (Locale 4).<p>
	 *
	 */
	public static final String $alloc_grp_nm_lcl4 = "alloc_grp_nm_lcl4";
	private static final MCPermColumnInfo _alloc_grp_nm_lcl4 = createColumnInfo("alloc_grp_nm_lcl4");
	public final MCStringPermColumn alloc_grp_nm_lcl4 = createStringColumn(_alloc_grp_nm_lcl4);
	
	/**
	 * 総量引当場所グループ名（ロケール５）. Gross allocation location group name (Locale 5).<p>
	 *
	 */
	public static final String $alloc_grp_nm_lcl5 = "alloc_grp_nm_lcl5";
	private static final MCPermColumnInfo _alloc_grp_nm_lcl5 = createColumnInfo("alloc_grp_nm_lcl5");
	public final MCStringPermColumn alloc_grp_nm_lcl5 = createStringColumn(_alloc_grp_nm_lcl5);
	
	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	private static final MCPermColumnInfo _sppl_nm = createColumnInfo("sppl_nm");
	public final MCStringPermColumn sppl_nm = createStringColumn(_sppl_nm);
	
	/**
	 * 発注先名（ロケール１）. Supplier name (Locale 1).<p>
	 *
	 */
	public static final String $sppl_nm_lcl1 = "sppl_nm_lcl1";
	private static final MCPermColumnInfo _sppl_nm_lcl1 = createColumnInfo("sppl_nm_lcl1");
	public final MCStringPermColumn sppl_nm_lcl1 = createStringColumn(_sppl_nm_lcl1);
	
	/**
	 * 発注先名（ロケール２）. Supplier name (Locale 2).<p>
	 *
	 */
	public static final String $sppl_nm_lcl2 = "sppl_nm_lcl2";
	private static final MCPermColumnInfo _sppl_nm_lcl2 = createColumnInfo("sppl_nm_lcl2");
	public final MCStringPermColumn sppl_nm_lcl2 = createStringColumn(_sppl_nm_lcl2);
	
	/**
	 * 発注先名（ロケール３）. Supplier name (Locale 3).<p>
	 *
	 */
	public static final String $sppl_nm_lcl3 = "sppl_nm_lcl3";
	private static final MCPermColumnInfo _sppl_nm_lcl3 = createColumnInfo("sppl_nm_lcl3");
	public final MCStringPermColumn sppl_nm_lcl3 = createStringColumn(_sppl_nm_lcl3);
	
	/**
	 * 発注先名（ロケール４）. Supplier name (Locale 4).<p>
	 *
	 */
	public static final String $sppl_nm_lcl4 = "sppl_nm_lcl4";
	private static final MCPermColumnInfo _sppl_nm_lcl4 = createColumnInfo("sppl_nm_lcl4");
	public final MCStringPermColumn sppl_nm_lcl4 = createStringColumn(_sppl_nm_lcl4);
	
	/**
	 * 発注先名（ロケール５）. Supplier name (Locale 5).<p>
	 *
	 */
	public static final String $sppl_nm_lcl5 = "sppl_nm_lcl5";
	private static final MCPermColumnInfo _sppl_nm_lcl5 = createColumnInfo("sppl_nm_lcl5");
	public final MCStringPermColumn sppl_nm_lcl5 = createStringColumn(_sppl_nm_lcl5);
	
	/**
	 * 国名. Country name.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	private static final MCPermColumnInfo _cntry_nm = createColumnInfo("cntry_nm");
	public final MCStringPermColumn cntry_nm = createStringColumn(_cntry_nm);
	
	/**
	 * 国名（ロケール１）. Country name (Locale 1).<p>
	 *
	 */
	public static final String $cntry_nm_lcl1 = "cntry_nm_lcl1";
	private static final MCPermColumnInfo _cntry_nm_lcl1 = createColumnInfo("cntry_nm_lcl1");
	public final MCStringPermColumn cntry_nm_lcl1 = createStringColumn(_cntry_nm_lcl1);
	
	/**
	 * 国名（ロケール２）. Country name (Locale 2).<p>
	 *
	 */
	public static final String $cntry_nm_lcl2 = "cntry_nm_lcl2";
	private static final MCPermColumnInfo _cntry_nm_lcl2 = createColumnInfo("cntry_nm_lcl2");
	public final MCStringPermColumn cntry_nm_lcl2 = createStringColumn(_cntry_nm_lcl2);
	
	/**
	 * 国名（ロケール３）. Country name (Locale 3).<p>
	 *
	 */
	public static final String $cntry_nm_lcl3 = "cntry_nm_lcl3";
	private static final MCPermColumnInfo _cntry_nm_lcl3 = createColumnInfo("cntry_nm_lcl3");
	public final MCStringPermColumn cntry_nm_lcl3 = createStringColumn(_cntry_nm_lcl3);
	
	/**
	 * 国名（ロケール４）. Country name (Locale 4).<p>
	 *
	 */
	public static final String $cntry_nm_lcl4 = "cntry_nm_lcl4";
	private static final MCPermColumnInfo _cntry_nm_lcl4 = createColumnInfo("cntry_nm_lcl4");
	public final MCStringPermColumn cntry_nm_lcl4 = createStringColumn(_cntry_nm_lcl4);
	
	/**
	 * 国名（ロケール５）. Country name (Locale 5).<p>
	 *
	 */
	public static final String $cntry_nm_lcl5 = "cntry_nm_lcl5";
	private static final MCPermColumnInfo _cntry_nm_lcl5 = createColumnInfo("cntry_nm_lcl5");
	public final MCStringPermColumn cntry_nm_lcl5 = createStringColumn(_cntry_nm_lcl5);
	
	/**
	 * 資源名１. Resource name 1.<p>
	 *
	 */
	public static final String $rsrc_nm1 = "rsrc_nm1";
	private static final MCPermColumnInfo _rsrc_nm1 = createColumnInfo("rsrc_nm1");
	public final MCStringPermColumn rsrc_nm1 = createStringColumn(_rsrc_nm1);
	
	/**
	 * 資源名１（ロケール１）. Resource name 1 (Locale 1).<p>
	 *
	 */
	public static final String $rsrc_nm1_lcl1 = "rsrc_nm1_lcl1";
	private static final MCPermColumnInfo _rsrc_nm1_lcl1 = createColumnInfo("rsrc_nm1_lcl1");
	public final MCStringPermColumn rsrc_nm1_lcl1 = createStringColumn(_rsrc_nm1_lcl1);
	
	/**
	 * 資源名１（ロケール２）. Resource name 1 (Locale 2).<p>
	 *
	 */
	public static final String $rsrc_nm1_lcl2 = "rsrc_nm1_lcl2";
	private static final MCPermColumnInfo _rsrc_nm1_lcl2 = createColumnInfo("rsrc_nm1_lcl2");
	public final MCStringPermColumn rsrc_nm1_lcl2 = createStringColumn(_rsrc_nm1_lcl2);
	
	/**
	 * 資源名１（ロケール３）. Resource name 1 (Locale 3).<p>
	 *
	 */
	public static final String $rsrc_nm1_lcl3 = "rsrc_nm1_lcl3";
	private static final MCPermColumnInfo _rsrc_nm1_lcl3 = createColumnInfo("rsrc_nm1_lcl3");
	public final MCStringPermColumn rsrc_nm1_lcl3 = createStringColumn(_rsrc_nm1_lcl3);
	
	/**
	 * 資源名１（ロケール４）. Resource name 1 (Locale 4).<p>
	 *
	 */
	public static final String $rsrc_nm1_lcl4 = "rsrc_nm1_lcl4";
	private static final MCPermColumnInfo _rsrc_nm1_lcl4 = createColumnInfo("rsrc_nm1_lcl4");
	public final MCStringPermColumn rsrc_nm1_lcl4 = createStringColumn(_rsrc_nm1_lcl4);
	
	/**
	 * 資源名１（ロケール５）. Resource name 1 (Locale 5).<p>
	 *
	 */
	public static final String $rsrc_nm1_lcl5 = "rsrc_nm1_lcl5";
	private static final MCPermColumnInfo _rsrc_nm1_lcl5 = createColumnInfo("rsrc_nm1_lcl5");
	public final MCStringPermColumn rsrc_nm1_lcl5 = createStringColumn(_rsrc_nm1_lcl5);
	
	/**
	 * 資源名２. Resource name 2.<p>
	 *
	 */
	public static final String $rsrc_nm2 = "rsrc_nm2";
	private static final MCPermColumnInfo _rsrc_nm2 = createColumnInfo("rsrc_nm2");
	public final MCStringPermColumn rsrc_nm2 = createStringColumn(_rsrc_nm2);
	
	/**
	 * 資源名２（ロケール１）. Resource name 2 (Locale 1).<p>
	 *
	 */
	public static final String $rsrc_nm2_lcl1 = "rsrc_nm2_lcl1";
	private static final MCPermColumnInfo _rsrc_nm2_lcl1 = createColumnInfo("rsrc_nm2_lcl1");
	public final MCStringPermColumn rsrc_nm2_lcl1 = createStringColumn(_rsrc_nm2_lcl1);
	
	/**
	 * 資源名２（ロケール２）. Resource name 2 (Locale 2).<p>
	 *
	 */
	public static final String $rsrc_nm2_lcl2 = "rsrc_nm2_lcl2";
	private static final MCPermColumnInfo _rsrc_nm2_lcl2 = createColumnInfo("rsrc_nm2_lcl2");
	public final MCStringPermColumn rsrc_nm2_lcl2 = createStringColumn(_rsrc_nm2_lcl2);
	
	/**
	 * 資源名２（ロケール３）. Resource name 2 (Locale 3).<p>
	 *
	 */
	public static final String $rsrc_nm2_lcl3 = "rsrc_nm2_lcl3";
	private static final MCPermColumnInfo _rsrc_nm2_lcl3 = createColumnInfo("rsrc_nm2_lcl3");
	public final MCStringPermColumn rsrc_nm2_lcl3 = createStringColumn(_rsrc_nm2_lcl3);
	
	/**
	 * 資源名２（ロケール４）. Resource name 2 (Locale 4).<p>
	 *
	 */
	public static final String $rsrc_nm2_lcl4 = "rsrc_nm2_lcl4";
	private static final MCPermColumnInfo _rsrc_nm2_lcl4 = createColumnInfo("rsrc_nm2_lcl4");
	public final MCStringPermColumn rsrc_nm2_lcl4 = createStringColumn(_rsrc_nm2_lcl4);
	
	/**
	 * 資源名２（ロケール５）. Resource name 2 (Locale 5).<p>
	 *
	 */
	public static final String $rsrc_nm2_lcl5 = "rsrc_nm2_lcl5";
	private static final MCPermColumnInfo _rsrc_nm2_lcl5 = createColumnInfo("rsrc_nm2_lcl5");
	public final MCStringPermColumn rsrc_nm2_lcl5 = createStringColumn(_rsrc_nm2_lcl5);
	
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
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_nm_lcl1_META = createCommonMeta($loc_nm_lcl1, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_nm_lcl2_META = createCommonMeta($loc_nm_lcl2, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_nm_lcl3_META = createCommonMeta($loc_nm_lcl3, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_nm_lcl4_META = createCommonMeta($loc_nm_lcl4, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_nm_lcl5_META = createCommonMeta($loc_nm_lcl5, mcframe.commonMA.meta.MA_META.LOC_NM);
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
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta alloc_grp_nm_lcl1_META = createCommonMeta($alloc_grp_nm_lcl1, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta alloc_grp_nm_lcl2_META = createCommonMeta($alloc_grp_nm_lcl2, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta alloc_grp_nm_lcl3_META = createCommonMeta($alloc_grp_nm_lcl3, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta alloc_grp_nm_lcl4_META = createCommonMeta($alloc_grp_nm_lcl4, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta alloc_grp_nm_lcl5_META = createCommonMeta($alloc_grp_nm_lcl5, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_nm_lcl1_META = createCommonMeta($sppl_nm_lcl1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_nm_lcl2_META = createCommonMeta($sppl_nm_lcl2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_nm_lcl3_META = createCommonMeta($sppl_nm_lcl3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_nm_lcl4_META = createCommonMeta($sppl_nm_lcl4, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_nm_lcl5_META = createCommonMeta($sppl_nm_lcl5, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_nm_lcl1_META = createCommonMeta($cntry_nm_lcl1, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_nm_lcl2_META = createCommonMeta($cntry_nm_lcl2, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_nm_lcl3_META = createCommonMeta($cntry_nm_lcl3, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_nm_lcl4_META = createCommonMeta($cntry_nm_lcl4, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_nm_lcl5_META = createCommonMeta($cntry_nm_lcl5, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta rsrc_nm1_META = createCommonMeta($rsrc_nm1, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm1_lcl1_META = createCommonMeta($rsrc_nm1_lcl1, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm1_lcl2_META = createCommonMeta($rsrc_nm1_lcl2, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm1_lcl3_META = createCommonMeta($rsrc_nm1_lcl3, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm1_lcl4_META = createCommonMeta($rsrc_nm1_lcl4, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm1_lcl5_META = createCommonMeta($rsrc_nm1_lcl5, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm2_META = createCommonMeta($rsrc_nm2, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm2_lcl1_META = createCommonMeta($rsrc_nm2_lcl1, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm2_lcl2_META = createCommonMeta($rsrc_nm2_lcl2, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm2_lcl3_META = createCommonMeta($rsrc_nm2_lcl3, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm2_lcl4_META = createCommonMeta($rsrc_nm2_lcl4, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_nm2_lcl5_META = createCommonMeta($rsrc_nm2_lcl5, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_LOC_IF_ALL_R> constMetas = new ConstMetaList<MAVM_LOC_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			loc_cd_META,
			loc_nm_META,
			loc_nm_lcl1_META,
			loc_nm_lcl2_META,
			loc_nm_lcl3_META,
			loc_nm_lcl4_META,
			loc_nm_lcl5_META,
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
			alloc_grp_nm_META,
			alloc_grp_nm_lcl1_META,
			alloc_grp_nm_lcl2_META,
			alloc_grp_nm_lcl3_META,
			alloc_grp_nm_lcl4_META,
			alloc_grp_nm_lcl5_META,
			sppl_nm_META,
			sppl_nm_lcl1_META,
			sppl_nm_lcl2_META,
			sppl_nm_lcl3_META,
			sppl_nm_lcl4_META,
			sppl_nm_lcl5_META,
			cntry_nm_META,
			cntry_nm_lcl1_META,
			cntry_nm_lcl2_META,
			cntry_nm_lcl3_META,
			cntry_nm_lcl4_META,
			cntry_nm_lcl5_META,
			rsrc_nm1_META,
			rsrc_nm1_lcl1_META,
			rsrc_nm1_lcl2_META,
			rsrc_nm1_lcl3_META,
			rsrc_nm1_lcl4_META,
			rsrc_nm1_lcl5_META,
			rsrc_nm2_META,
			rsrc_nm2_lcl1_META,
			rsrc_nm2_lcl2_META,
			rsrc_nm2_lcl3_META,
			rsrc_nm2_lcl4_META,
			rsrc_nm2_lcl5_META,
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
	protected MAVM_LOC_IF_ALL_R(ConstMetaList<? extends MAVM_LOC_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_LOC_IF_ALL_R(ConstMetaList<? extends MAVM_LOC_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$co_cd,
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
			MAVM_LOC_IF_ALL_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_cd,
				"loc_cd",
				loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_nm,
				"loc_nm",
				loc_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$loc_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_nm_lcl1,
				"loc_nm_lcl1",
				loc_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$loc_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_nm_lcl2,
				"loc_nm_lcl2",
				loc_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$loc_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_nm_lcl3,
				"loc_nm_lcl3",
				loc_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$loc_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_nm_lcl4,
				"loc_nm_lcl4",
				loc_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$loc_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_nm_lcl5,
				"loc_nm_lcl5",
				loc_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$wg_nm,
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
			MAVM_LOC_IF_ALL_R.$wg_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$wg_nm_lcl1,
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
			MAVM_LOC_IF_ALL_R.$wg_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$wg_nm_lcl2,
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
			MAVM_LOC_IF_ALL_R.$wg_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$wg_nm_lcl3,
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
			MAVM_LOC_IF_ALL_R.$wg_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$wg_nm_lcl4,
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
			MAVM_LOC_IF_ALL_R.$wg_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$wg_nm_lcl5,
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
			MAVM_LOC_IF_ALL_R.$site_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$site_nm,
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
			MAVM_LOC_IF_ALL_R.$site_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$site_nm_lcl1,
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
			MAVM_LOC_IF_ALL_R.$site_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$site_nm_lcl2,
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
			MAVM_LOC_IF_ALL_R.$site_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$site_nm_lcl3,
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
			MAVM_LOC_IF_ALL_R.$site_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$site_nm_lcl4,
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
			MAVM_LOC_IF_ALL_R.$site_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$site_nm_lcl5,
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
			MAVM_LOC_IF_ALL_R.$lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$lg_grp_nm,
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
			MAVM_LOC_IF_ALL_R.$lg_grp_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$lg_grp_nm_lcl1,
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
			MAVM_LOC_IF_ALL_R.$lg_grp_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$lg_grp_nm_lcl2,
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
			MAVM_LOC_IF_ALL_R.$lg_grp_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$lg_grp_nm_lcl3,
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
			MAVM_LOC_IF_ALL_R.$lg_grp_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$lg_grp_nm_lcl4,
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
			MAVM_LOC_IF_ALL_R.$lg_grp_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$lg_grp_nm_lcl5,
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
			MAVM_LOC_IF_ALL_R.$loc_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_grp_nm,
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
			MAVM_LOC_IF_ALL_R.$loc_grp_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_grp_nm_lcl1,
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
			MAVM_LOC_IF_ALL_R.$loc_grp_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_grp_nm_lcl2,
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
			MAVM_LOC_IF_ALL_R.$loc_grp_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_grp_nm_lcl3,
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
			MAVM_LOC_IF_ALL_R.$loc_grp_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_grp_nm_lcl4,
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
			MAVM_LOC_IF_ALL_R.$loc_grp_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$loc_grp_nm_lcl5,
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
			MAVM_LOC_IF_ALL_R.$alloc_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$alloc_grp_nm,
				"alloc_grp_nm",
				alloc_grp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$alloc_grp_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$alloc_grp_nm_lcl1,
				"alloc_grp_nm_lcl1",
				alloc_grp_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$alloc_grp_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$alloc_grp_nm_lcl2,
				"alloc_grp_nm_lcl2",
				alloc_grp_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$alloc_grp_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$alloc_grp_nm_lcl3,
				"alloc_grp_nm_lcl3",
				alloc_grp_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$alloc_grp_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$alloc_grp_nm_lcl4,
				"alloc_grp_nm_lcl4",
				alloc_grp_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$alloc_grp_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$alloc_grp_nm_lcl5,
				"alloc_grp_nm_lcl5",
				alloc_grp_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$sppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$sppl_nm,
				"sppl_nm",
				sppl_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$sppl_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$sppl_nm_lcl1,
				"sppl_nm_lcl1",
				sppl_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$sppl_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$sppl_nm_lcl2,
				"sppl_nm_lcl2",
				sppl_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$sppl_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$sppl_nm_lcl3,
				"sppl_nm_lcl3",
				sppl_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$sppl_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$sppl_nm_lcl4,
				"sppl_nm_lcl4",
				sppl_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$sppl_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$sppl_nm_lcl5,
				"sppl_nm_lcl5",
				sppl_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$cntry_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$cntry_nm,
				"cntry_nm",
				cntry_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$cntry_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$cntry_nm_lcl1,
				"cntry_nm_lcl1",
				cntry_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$cntry_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$cntry_nm_lcl2,
				"cntry_nm_lcl2",
				cntry_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$cntry_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$cntry_nm_lcl3,
				"cntry_nm_lcl3",
				cntry_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$cntry_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$cntry_nm_lcl4,
				"cntry_nm_lcl4",
				cntry_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$cntry_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$cntry_nm_lcl5,
				"cntry_nm_lcl5",
				cntry_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm1,
				"rsrc_nm1",
				rsrc_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm1_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm1_lcl1,
				"rsrc_nm1_lcl1",
				rsrc_nm1_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm1_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm1_lcl2,
				"rsrc_nm1_lcl2",
				rsrc_nm1_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm1_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm1_lcl3,
				"rsrc_nm1_lcl3",
				rsrc_nm1_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm1_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm1_lcl4,
				"rsrc_nm1_lcl4",
				rsrc_nm1_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm1_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm1_lcl5,
				"rsrc_nm1_lcl5",
				rsrc_nm1_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm2,
				"rsrc_nm2",
				rsrc_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm2_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm2_lcl1,
				"rsrc_nm2_lcl1",
				rsrc_nm2_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm2_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm2_lcl2,
				"rsrc_nm2_lcl2",
				rsrc_nm2_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm2_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm2_lcl3,
				"rsrc_nm2_lcl3",
				rsrc_nm2_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm2_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm2_lcl4,
				"rsrc_nm2_lcl4",
				rsrc_nm2_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$rsrc_nm2_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$rsrc_nm2_lcl5,
				"rsrc_nm2_lcl5",
				rsrc_nm2_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_LOC_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$memo1,
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
			MAVM_LOC_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$memo2,
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
			MAVM_LOC_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_LOC_IF_ALL_R.$memo3,
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
	public static MAVM_LOC_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_LOC_IF_ALL_R create(String alias) {
		MAVM_LOC_IF_ALL_R row = new MAVM_LOC_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_LOC_IF_ALL_R createByName(T proto) {
		MAVM_LOC_IF_ALL_R row = MAVM_LOC_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_LOC_IF_ALL_R clone() {
		return (MAVM_LOC_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_LOC_IF_ALL_R createInstance() {
		return (MAVM_LOC_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_LOC_IF_ALL_R getValues(String... names) {
		return (MAVM_LOC_IF_ALL_R) super.getValues(names);
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
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 1, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 1, $loc_cd, value);
	}

	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 2, $loc_nm);
	}

	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 2, $loc_nm, value);
	}

	/**
	 * 場所名（ロケール１）. Location name (Locale 1).<p>
	 *
	 */
	public String loc_nm_lcl1() {
		return getConstString(offset + 3, $loc_nm_lcl1);
	}

	/**
	 * 場所名（ロケール１）. Location name (Locale 1).<p>
	 *
	 */
	public void loc_nm_lcl1(String value) {
		setConstString(offset + 3, $loc_nm_lcl1, value);
	}

	/**
	 * 場所名（ロケール２）. Location name (Locale 2).<p>
	 *
	 */
	public String loc_nm_lcl2() {
		return getConstString(offset + 4, $loc_nm_lcl2);
	}

	/**
	 * 場所名（ロケール２）. Location name (Locale 2).<p>
	 *
	 */
	public void loc_nm_lcl2(String value) {
		setConstString(offset + 4, $loc_nm_lcl2, value);
	}

	/**
	 * 場所名（ロケール３）. Location name (Locale 3).<p>
	 *
	 */
	public String loc_nm_lcl3() {
		return getConstString(offset + 5, $loc_nm_lcl3);
	}

	/**
	 * 場所名（ロケール３）. Location name (Locale 3).<p>
	 *
	 */
	public void loc_nm_lcl3(String value) {
		setConstString(offset + 5, $loc_nm_lcl3, value);
	}

	/**
	 * 場所名（ロケール４）. Location name (Locale 4).<p>
	 *
	 */
	public String loc_nm_lcl4() {
		return getConstString(offset + 6, $loc_nm_lcl4);
	}

	/**
	 * 場所名（ロケール４）. Location name (Locale 4).<p>
	 *
	 */
	public void loc_nm_lcl4(String value) {
		setConstString(offset + 6, $loc_nm_lcl4, value);
	}

	/**
	 * 場所名（ロケール５）. Location name (Locale 5).<p>
	 *
	 */
	public String loc_nm_lcl5() {
		return getConstString(offset + 7, $loc_nm_lcl5);
	}

	/**
	 * 場所名（ロケール５）. Location name (Locale 5).<p>
	 *
	 */
	public void loc_nm_lcl5(String value) {
		setConstString(offset + 7, $loc_nm_lcl5, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 8, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 8, $wg_nm, value);
	}

	/**
	 * ワーキンググループ名（ロケール１）. WG name (Locale 1).<p>
	 *
	 */
	public String wg_nm_lcl1() {
		return getConstString(offset + 9, $wg_nm_lcl1);
	}

	/**
	 * ワーキンググループ名（ロケール１）. WG name (Locale 1).<p>
	 *
	 */
	public void wg_nm_lcl1(String value) {
		setConstString(offset + 9, $wg_nm_lcl1, value);
	}

	/**
	 * ワーキンググループ名（ロケール２）. WG name (Locale 2).<p>
	 *
	 */
	public String wg_nm_lcl2() {
		return getConstString(offset + 10, $wg_nm_lcl2);
	}

	/**
	 * ワーキンググループ名（ロケール２）. WG name (Locale 2).<p>
	 *
	 */
	public void wg_nm_lcl2(String value) {
		setConstString(offset + 10, $wg_nm_lcl2, value);
	}

	/**
	 * ワーキンググループ名（ロケール３）. WG name (Locale 3).<p>
	 *
	 */
	public String wg_nm_lcl3() {
		return getConstString(offset + 11, $wg_nm_lcl3);
	}

	/**
	 * ワーキンググループ名（ロケール３）. WG name (Locale 3).<p>
	 *
	 */
	public void wg_nm_lcl3(String value) {
		setConstString(offset + 11, $wg_nm_lcl3, value);
	}

	/**
	 * ワーキンググループ名（ロケール４）. WG name (Locale 4).<p>
	 *
	 */
	public String wg_nm_lcl4() {
		return getConstString(offset + 12, $wg_nm_lcl4);
	}

	/**
	 * ワーキンググループ名（ロケール４）. WG name (Locale 4).<p>
	 *
	 */
	public void wg_nm_lcl4(String value) {
		setConstString(offset + 12, $wg_nm_lcl4, value);
	}

	/**
	 * ワーキンググループ名（ロケール５）. WG name (Locale 5).<p>
	 *
	 */
	public String wg_nm_lcl5() {
		return getConstString(offset + 13, $wg_nm_lcl5);
	}

	/**
	 * ワーキンググループ名（ロケール５）. WG name (Locale 5).<p>
	 *
	 */
	public void wg_nm_lcl5(String value) {
		setConstString(offset + 13, $wg_nm_lcl5, value);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 14, $site_nm);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 14, $site_nm, value);
	}

	/**
	 * 工場・物流倉庫名（ロケール１）. Factory/Distribution warehouse name (Locale 1).<p>
	 *
	 */
	public String site_nm_lcl1() {
		return getConstString(offset + 15, $site_nm_lcl1);
	}

	/**
	 * 工場・物流倉庫名（ロケール１）. Factory/Distribution warehouse name (Locale 1).<p>
	 *
	 */
	public void site_nm_lcl1(String value) {
		setConstString(offset + 15, $site_nm_lcl1, value);
	}

	/**
	 * 工場・物流倉庫名（ロケール２）. Factory/Distribution warehouse name (Locale 2).<p>
	 *
	 */
	public String site_nm_lcl2() {
		return getConstString(offset + 16, $site_nm_lcl2);
	}

	/**
	 * 工場・物流倉庫名（ロケール２）. Factory/Distribution warehouse name (Locale 2).<p>
	 *
	 */
	public void site_nm_lcl2(String value) {
		setConstString(offset + 16, $site_nm_lcl2, value);
	}

	/**
	 * 工場・物流倉庫名（ロケール３）. Factory/Distribution warehouse name (Locale 3).<p>
	 *
	 */
	public String site_nm_lcl3() {
		return getConstString(offset + 17, $site_nm_lcl3);
	}

	/**
	 * 工場・物流倉庫名（ロケール３）. Factory/Distribution warehouse name (Locale 3).<p>
	 *
	 */
	public void site_nm_lcl3(String value) {
		setConstString(offset + 17, $site_nm_lcl3, value);
	}

	/**
	 * 工場・物流倉庫名（ロケール４）. Factory/Distribution warehouse name (Locale 4).<p>
	 *
	 */
	public String site_nm_lcl4() {
		return getConstString(offset + 18, $site_nm_lcl4);
	}

	/**
	 * 工場・物流倉庫名（ロケール４）. Factory/Distribution warehouse name (Locale 4).<p>
	 *
	 */
	public void site_nm_lcl4(String value) {
		setConstString(offset + 18, $site_nm_lcl4, value);
	}

	/**
	 * 工場・物流倉庫名（ロケール５）. Factory/Distribution warehouse name (Locale 5).<p>
	 *
	 */
	public String site_nm_lcl5() {
		return getConstString(offset + 19, $site_nm_lcl5);
	}

	/**
	 * 工場・物流倉庫名（ロケール５）. Factory/Distribution warehouse name (Locale 5).<p>
	 *
	 */
	public void site_nm_lcl5(String value) {
		setConstString(offset + 19, $site_nm_lcl5, value);
	}

	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 20, $lg_grp_nm);
	}

	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 20, $lg_grp_nm, value);
	}

	/**
	 * 物流グループ名（ロケール１）. Distribution group name (Locale 1).<p>
	 *
	 */
	public String lg_grp_nm_lcl1() {
		return getConstString(offset + 21, $lg_grp_nm_lcl1);
	}

	/**
	 * 物流グループ名（ロケール１）. Distribution group name (Locale 1).<p>
	 *
	 */
	public void lg_grp_nm_lcl1(String value) {
		setConstString(offset + 21, $lg_grp_nm_lcl1, value);
	}

	/**
	 * 物流グループ名（ロケール２）. Distribution group name (Locale 2).<p>
	 *
	 */
	public String lg_grp_nm_lcl2() {
		return getConstString(offset + 22, $lg_grp_nm_lcl2);
	}

	/**
	 * 物流グループ名（ロケール２）. Distribution group name (Locale 2).<p>
	 *
	 */
	public void lg_grp_nm_lcl2(String value) {
		setConstString(offset + 22, $lg_grp_nm_lcl2, value);
	}

	/**
	 * 物流グループ名（ロケール３）. Distribution group name (Locale 3).<p>
	 *
	 */
	public String lg_grp_nm_lcl3() {
		return getConstString(offset + 23, $lg_grp_nm_lcl3);
	}

	/**
	 * 物流グループ名（ロケール３）. Distribution group name (Locale 3).<p>
	 *
	 */
	public void lg_grp_nm_lcl3(String value) {
		setConstString(offset + 23, $lg_grp_nm_lcl3, value);
	}

	/**
	 * 物流グループ名（ロケール４）. Distribution group name (Locale 4).<p>
	 *
	 */
	public String lg_grp_nm_lcl4() {
		return getConstString(offset + 24, $lg_grp_nm_lcl4);
	}

	/**
	 * 物流グループ名（ロケール４）. Distribution group name (Locale 4).<p>
	 *
	 */
	public void lg_grp_nm_lcl4(String value) {
		setConstString(offset + 24, $lg_grp_nm_lcl4, value);
	}

	/**
	 * 物流グループ名（ロケール５）. Distribution group name (Locale 5).<p>
	 *
	 */
	public String lg_grp_nm_lcl5() {
		return getConstString(offset + 25, $lg_grp_nm_lcl5);
	}

	/**
	 * 物流グループ名（ロケール５）. Distribution group name (Locale 5).<p>
	 *
	 */
	public void lg_grp_nm_lcl5(String value) {
		setConstString(offset + 25, $lg_grp_nm_lcl5, value);
	}

	/**
	 * 製造場所グループ名. Mfg. location group name.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 26, $loc_grp_nm);
	}

	/**
	 * 製造場所グループ名. Mfg. location group name.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 26, $loc_grp_nm, value);
	}

	/**
	 * 製造場所グループ名（ロケール１）. Mfg. location group name (Locale 1).<p>
	 *
	 */
	public String loc_grp_nm_lcl1() {
		return getConstString(offset + 27, $loc_grp_nm_lcl1);
	}

	/**
	 * 製造場所グループ名（ロケール１）. Mfg. location group name (Locale 1).<p>
	 *
	 */
	public void loc_grp_nm_lcl1(String value) {
		setConstString(offset + 27, $loc_grp_nm_lcl1, value);
	}

	/**
	 * 製造場所グループ名（ロケール２）. Mfg. location group name (Locale 2).<p>
	 *
	 */
	public String loc_grp_nm_lcl2() {
		return getConstString(offset + 28, $loc_grp_nm_lcl2);
	}

	/**
	 * 製造場所グループ名（ロケール２）. Mfg. location group name (Locale 2).<p>
	 *
	 */
	public void loc_grp_nm_lcl2(String value) {
		setConstString(offset + 28, $loc_grp_nm_lcl2, value);
	}

	/**
	 * 製造場所グループ名（ロケール３）. Mfg. location group name (Locale 3).<p>
	 *
	 */
	public String loc_grp_nm_lcl3() {
		return getConstString(offset + 29, $loc_grp_nm_lcl3);
	}

	/**
	 * 製造場所グループ名（ロケール３）. Mfg. location group name (Locale 3).<p>
	 *
	 */
	public void loc_grp_nm_lcl3(String value) {
		setConstString(offset + 29, $loc_grp_nm_lcl3, value);
	}

	/**
	 * 製造場所グループ名（ロケール４）. Mfg. location group name (Locale 4).<p>
	 *
	 */
	public String loc_grp_nm_lcl4() {
		return getConstString(offset + 30, $loc_grp_nm_lcl4);
	}

	/**
	 * 製造場所グループ名（ロケール４）. Mfg. location group name (Locale 4).<p>
	 *
	 */
	public void loc_grp_nm_lcl4(String value) {
		setConstString(offset + 30, $loc_grp_nm_lcl4, value);
	}

	/**
	 * 製造場所グループ名（ロケール５）. Mfg. location group name (Locale 5).<p>
	 *
	 */
	public String loc_grp_nm_lcl5() {
		return getConstString(offset + 31, $loc_grp_nm_lcl5);
	}

	/**
	 * 製造場所グループ名（ロケール５）. Mfg. location group name (Locale 5).<p>
	 *
	 */
	public void loc_grp_nm_lcl5(String value) {
		setConstString(offset + 31, $loc_grp_nm_lcl5, value);
	}

	/**
	 * 総量引当場所グループ名. Gross allocation location group name.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 32, $alloc_grp_nm);
	}

	/**
	 * 総量引当場所グループ名. Gross allocation location group name.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 32, $alloc_grp_nm, value);
	}

	/**
	 * 総量引当場所グループ名（ロケール１）. Gross allocation location group name (Locale 1).<p>
	 *
	 */
	public String alloc_grp_nm_lcl1() {
		return getConstString(offset + 33, $alloc_grp_nm_lcl1);
	}

	/**
	 * 総量引当場所グループ名（ロケール１）. Gross allocation location group name (Locale 1).<p>
	 *
	 */
	public void alloc_grp_nm_lcl1(String value) {
		setConstString(offset + 33, $alloc_grp_nm_lcl1, value);
	}

	/**
	 * 総量引当場所グループ名（ロケール２）. Gross allocation location group name (Locale 2).<p>
	 *
	 */
	public String alloc_grp_nm_lcl2() {
		return getConstString(offset + 34, $alloc_grp_nm_lcl2);
	}

	/**
	 * 総量引当場所グループ名（ロケール２）. Gross allocation location group name (Locale 2).<p>
	 *
	 */
	public void alloc_grp_nm_lcl2(String value) {
		setConstString(offset + 34, $alloc_grp_nm_lcl2, value);
	}

	/**
	 * 総量引当場所グループ名（ロケール３）. Gross allocation location group name (Locale 3).<p>
	 *
	 */
	public String alloc_grp_nm_lcl3() {
		return getConstString(offset + 35, $alloc_grp_nm_lcl3);
	}

	/**
	 * 総量引当場所グループ名（ロケール３）. Gross allocation location group name (Locale 3).<p>
	 *
	 */
	public void alloc_grp_nm_lcl3(String value) {
		setConstString(offset + 35, $alloc_grp_nm_lcl3, value);
	}

	/**
	 * 総量引当場所グループ名（ロケール４）. Gross allocation location group name (Locale 4).<p>
	 *
	 */
	public String alloc_grp_nm_lcl4() {
		return getConstString(offset + 36, $alloc_grp_nm_lcl4);
	}

	/**
	 * 総量引当場所グループ名（ロケール４）. Gross allocation location group name (Locale 4).<p>
	 *
	 */
	public void alloc_grp_nm_lcl4(String value) {
		setConstString(offset + 36, $alloc_grp_nm_lcl4, value);
	}

	/**
	 * 総量引当場所グループ名（ロケール５）. Gross allocation location group name (Locale 5).<p>
	 *
	 */
	public String alloc_grp_nm_lcl5() {
		return getConstString(offset + 37, $alloc_grp_nm_lcl5);
	}

	/**
	 * 総量引当場所グループ名（ロケール５）. Gross allocation location group name (Locale 5).<p>
	 *
	 */
	public void alloc_grp_nm_lcl5(String value) {
		setConstString(offset + 37, $alloc_grp_nm_lcl5, value);
	}

	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 38, $sppl_nm);
	}

	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 38, $sppl_nm, value);
	}

	/**
	 * 発注先名（ロケール１）. Supplier name (Locale 1).<p>
	 *
	 */
	public String sppl_nm_lcl1() {
		return getConstString(offset + 39, $sppl_nm_lcl1);
	}

	/**
	 * 発注先名（ロケール１）. Supplier name (Locale 1).<p>
	 *
	 */
	public void sppl_nm_lcl1(String value) {
		setConstString(offset + 39, $sppl_nm_lcl1, value);
	}

	/**
	 * 発注先名（ロケール２）. Supplier name (Locale 2).<p>
	 *
	 */
	public String sppl_nm_lcl2() {
		return getConstString(offset + 40, $sppl_nm_lcl2);
	}

	/**
	 * 発注先名（ロケール２）. Supplier name (Locale 2).<p>
	 *
	 */
	public void sppl_nm_lcl2(String value) {
		setConstString(offset + 40, $sppl_nm_lcl2, value);
	}

	/**
	 * 発注先名（ロケール３）. Supplier name (Locale 3).<p>
	 *
	 */
	public String sppl_nm_lcl3() {
		return getConstString(offset + 41, $sppl_nm_lcl3);
	}

	/**
	 * 発注先名（ロケール３）. Supplier name (Locale 3).<p>
	 *
	 */
	public void sppl_nm_lcl3(String value) {
		setConstString(offset + 41, $sppl_nm_lcl3, value);
	}

	/**
	 * 発注先名（ロケール４）. Supplier name (Locale 4).<p>
	 *
	 */
	public String sppl_nm_lcl4() {
		return getConstString(offset + 42, $sppl_nm_lcl4);
	}

	/**
	 * 発注先名（ロケール４）. Supplier name (Locale 4).<p>
	 *
	 */
	public void sppl_nm_lcl4(String value) {
		setConstString(offset + 42, $sppl_nm_lcl4, value);
	}

	/**
	 * 発注先名（ロケール５）. Supplier name (Locale 5).<p>
	 *
	 */
	public String sppl_nm_lcl5() {
		return getConstString(offset + 43, $sppl_nm_lcl5);
	}

	/**
	 * 発注先名（ロケール５）. Supplier name (Locale 5).<p>
	 *
	 */
	public void sppl_nm_lcl5(String value) {
		setConstString(offset + 43, $sppl_nm_lcl5, value);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 44, $cntry_nm);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 44, $cntry_nm, value);
	}

	/**
	 * 国名（ロケール１）. Country name (Locale 1).<p>
	 *
	 */
	public String cntry_nm_lcl1() {
		return getConstString(offset + 45, $cntry_nm_lcl1);
	}

	/**
	 * 国名（ロケール１）. Country name (Locale 1).<p>
	 *
	 */
	public void cntry_nm_lcl1(String value) {
		setConstString(offset + 45, $cntry_nm_lcl1, value);
	}

	/**
	 * 国名（ロケール２）. Country name (Locale 2).<p>
	 *
	 */
	public String cntry_nm_lcl2() {
		return getConstString(offset + 46, $cntry_nm_lcl2);
	}

	/**
	 * 国名（ロケール２）. Country name (Locale 2).<p>
	 *
	 */
	public void cntry_nm_lcl2(String value) {
		setConstString(offset + 46, $cntry_nm_lcl2, value);
	}

	/**
	 * 国名（ロケール３）. Country name (Locale 3).<p>
	 *
	 */
	public String cntry_nm_lcl3() {
		return getConstString(offset + 47, $cntry_nm_lcl3);
	}

	/**
	 * 国名（ロケール３）. Country name (Locale 3).<p>
	 *
	 */
	public void cntry_nm_lcl3(String value) {
		setConstString(offset + 47, $cntry_nm_lcl3, value);
	}

	/**
	 * 国名（ロケール４）. Country name (Locale 4).<p>
	 *
	 */
	public String cntry_nm_lcl4() {
		return getConstString(offset + 48, $cntry_nm_lcl4);
	}

	/**
	 * 国名（ロケール４）. Country name (Locale 4).<p>
	 *
	 */
	public void cntry_nm_lcl4(String value) {
		setConstString(offset + 48, $cntry_nm_lcl4, value);
	}

	/**
	 * 国名（ロケール５）. Country name (Locale 5).<p>
	 *
	 */
	public String cntry_nm_lcl5() {
		return getConstString(offset + 49, $cntry_nm_lcl5);
	}

	/**
	 * 国名（ロケール５）. Country name (Locale 5).<p>
	 *
	 */
	public void cntry_nm_lcl5(String value) {
		setConstString(offset + 49, $cntry_nm_lcl5, value);
	}

	/**
	 * 資源名１. Resource name 1.<p>
	 *
	 */
	public String rsrc_nm1() {
		return getConstString(offset + 50, $rsrc_nm1);
	}

	/**
	 * 資源名１. Resource name 1.<p>
	 *
	 */
	public void rsrc_nm1(String value) {
		setConstString(offset + 50, $rsrc_nm1, value);
	}

	/**
	 * 資源名１（ロケール１）. Resource name 1 (Locale 1).<p>
	 *
	 */
	public String rsrc_nm1_lcl1() {
		return getConstString(offset + 51, $rsrc_nm1_lcl1);
	}

	/**
	 * 資源名１（ロケール１）. Resource name 1 (Locale 1).<p>
	 *
	 */
	public void rsrc_nm1_lcl1(String value) {
		setConstString(offset + 51, $rsrc_nm1_lcl1, value);
	}

	/**
	 * 資源名１（ロケール２）. Resource name 1 (Locale 2).<p>
	 *
	 */
	public String rsrc_nm1_lcl2() {
		return getConstString(offset + 52, $rsrc_nm1_lcl2);
	}

	/**
	 * 資源名１（ロケール２）. Resource name 1 (Locale 2).<p>
	 *
	 */
	public void rsrc_nm1_lcl2(String value) {
		setConstString(offset + 52, $rsrc_nm1_lcl2, value);
	}

	/**
	 * 資源名１（ロケール３）. Resource name 1 (Locale 3).<p>
	 *
	 */
	public String rsrc_nm1_lcl3() {
		return getConstString(offset + 53, $rsrc_nm1_lcl3);
	}

	/**
	 * 資源名１（ロケール３）. Resource name 1 (Locale 3).<p>
	 *
	 */
	public void rsrc_nm1_lcl3(String value) {
		setConstString(offset + 53, $rsrc_nm1_lcl3, value);
	}

	/**
	 * 資源名１（ロケール４）. Resource name 1 (Locale 4).<p>
	 *
	 */
	public String rsrc_nm1_lcl4() {
		return getConstString(offset + 54, $rsrc_nm1_lcl4);
	}

	/**
	 * 資源名１（ロケール４）. Resource name 1 (Locale 4).<p>
	 *
	 */
	public void rsrc_nm1_lcl4(String value) {
		setConstString(offset + 54, $rsrc_nm1_lcl4, value);
	}

	/**
	 * 資源名１（ロケール５）. Resource name 1 (Locale 5).<p>
	 *
	 */
	public String rsrc_nm1_lcl5() {
		return getConstString(offset + 55, $rsrc_nm1_lcl5);
	}

	/**
	 * 資源名１（ロケール５）. Resource name 1 (Locale 5).<p>
	 *
	 */
	public void rsrc_nm1_lcl5(String value) {
		setConstString(offset + 55, $rsrc_nm1_lcl5, value);
	}

	/**
	 * 資源名２. Resource name 2.<p>
	 *
	 */
	public String rsrc_nm2() {
		return getConstString(offset + 56, $rsrc_nm2);
	}

	/**
	 * 資源名２. Resource name 2.<p>
	 *
	 */
	public void rsrc_nm2(String value) {
		setConstString(offset + 56, $rsrc_nm2, value);
	}

	/**
	 * 資源名２（ロケール１）. Resource name 2 (Locale 1).<p>
	 *
	 */
	public String rsrc_nm2_lcl1() {
		return getConstString(offset + 57, $rsrc_nm2_lcl1);
	}

	/**
	 * 資源名２（ロケール１）. Resource name 2 (Locale 1).<p>
	 *
	 */
	public void rsrc_nm2_lcl1(String value) {
		setConstString(offset + 57, $rsrc_nm2_lcl1, value);
	}

	/**
	 * 資源名２（ロケール２）. Resource name 2 (Locale 2).<p>
	 *
	 */
	public String rsrc_nm2_lcl2() {
		return getConstString(offset + 58, $rsrc_nm2_lcl2);
	}

	/**
	 * 資源名２（ロケール２）. Resource name 2 (Locale 2).<p>
	 *
	 */
	public void rsrc_nm2_lcl2(String value) {
		setConstString(offset + 58, $rsrc_nm2_lcl2, value);
	}

	/**
	 * 資源名２（ロケール３）. Resource name 2 (Locale 3).<p>
	 *
	 */
	public String rsrc_nm2_lcl3() {
		return getConstString(offset + 59, $rsrc_nm2_lcl3);
	}

	/**
	 * 資源名２（ロケール３）. Resource name 2 (Locale 3).<p>
	 *
	 */
	public void rsrc_nm2_lcl3(String value) {
		setConstString(offset + 59, $rsrc_nm2_lcl3, value);
	}

	/**
	 * 資源名２（ロケール４）. Resource name 2 (Locale 4).<p>
	 *
	 */
	public String rsrc_nm2_lcl4() {
		return getConstString(offset + 60, $rsrc_nm2_lcl4);
	}

	/**
	 * 資源名２（ロケール４）. Resource name 2 (Locale 4).<p>
	 *
	 */
	public void rsrc_nm2_lcl4(String value) {
		setConstString(offset + 60, $rsrc_nm2_lcl4, value);
	}

	/**
	 * 資源名２（ロケール５）. Resource name 2 (Locale 5).<p>
	 *
	 */
	public String rsrc_nm2_lcl5() {
		return getConstString(offset + 61, $rsrc_nm2_lcl5);
	}

	/**
	 * 資源名２（ロケール５）. Resource name 2 (Locale 5).<p>
	 *
	 */
	public void rsrc_nm2_lcl5(String value) {
		setConstString(offset + 61, $rsrc_nm2_lcl5, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 62, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 62, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 63, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 63, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 64, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 64, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($loc_nm_lcl1.equalsIgnoreCase(name)) {
			return loc_nm_lcl1();
		}
		if ($loc_nm_lcl2.equalsIgnoreCase(name)) {
			return loc_nm_lcl2();
		}
		if ($loc_nm_lcl3.equalsIgnoreCase(name)) {
			return loc_nm_lcl3();
		}
		if ($loc_nm_lcl4.equalsIgnoreCase(name)) {
			return loc_nm_lcl4();
		}
		if ($loc_nm_lcl5.equalsIgnoreCase(name)) {
			return loc_nm_lcl5();
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
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($alloc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			return alloc_grp_nm_lcl1();
		}
		if ($alloc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			return alloc_grp_nm_lcl2();
		}
		if ($alloc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			return alloc_grp_nm_lcl3();
		}
		if ($alloc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			return alloc_grp_nm_lcl4();
		}
		if ($alloc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			return alloc_grp_nm_lcl5();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_nm_lcl1.equalsIgnoreCase(name)) {
			return sppl_nm_lcl1();
		}
		if ($sppl_nm_lcl2.equalsIgnoreCase(name)) {
			return sppl_nm_lcl2();
		}
		if ($sppl_nm_lcl3.equalsIgnoreCase(name)) {
			return sppl_nm_lcl3();
		}
		if ($sppl_nm_lcl4.equalsIgnoreCase(name)) {
			return sppl_nm_lcl4();
		}
		if ($sppl_nm_lcl5.equalsIgnoreCase(name)) {
			return sppl_nm_lcl5();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($cntry_nm_lcl1.equalsIgnoreCase(name)) {
			return cntry_nm_lcl1();
		}
		if ($cntry_nm_lcl2.equalsIgnoreCase(name)) {
			return cntry_nm_lcl2();
		}
		if ($cntry_nm_lcl3.equalsIgnoreCase(name)) {
			return cntry_nm_lcl3();
		}
		if ($cntry_nm_lcl4.equalsIgnoreCase(name)) {
			return cntry_nm_lcl4();
		}
		if ($cntry_nm_lcl5.equalsIgnoreCase(name)) {
			return cntry_nm_lcl5();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_nm1_lcl1.equalsIgnoreCase(name)) {
			return rsrc_nm1_lcl1();
		}
		if ($rsrc_nm1_lcl2.equalsIgnoreCase(name)) {
			return rsrc_nm1_lcl2();
		}
		if ($rsrc_nm1_lcl3.equalsIgnoreCase(name)) {
			return rsrc_nm1_lcl3();
		}
		if ($rsrc_nm1_lcl4.equalsIgnoreCase(name)) {
			return rsrc_nm1_lcl4();
		}
		if ($rsrc_nm1_lcl5.equalsIgnoreCase(name)) {
			return rsrc_nm1_lcl5();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($rsrc_nm2_lcl1.equalsIgnoreCase(name)) {
			return rsrc_nm2_lcl1();
		}
		if ($rsrc_nm2_lcl2.equalsIgnoreCase(name)) {
			return rsrc_nm2_lcl2();
		}
		if ($rsrc_nm2_lcl3.equalsIgnoreCase(name)) {
			return rsrc_nm2_lcl3();
		}
		if ($rsrc_nm2_lcl4.equalsIgnoreCase(name)) {
			return rsrc_nm2_lcl4();
		}
		if ($rsrc_nm2_lcl5.equalsIgnoreCase(name)) {
			return rsrc_nm2_lcl5();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($loc_nm_lcl1.equalsIgnoreCase(name)) {
			return loc_nm_lcl1();
		}
		if ($loc_nm_lcl2.equalsIgnoreCase(name)) {
			return loc_nm_lcl2();
		}
		if ($loc_nm_lcl3.equalsIgnoreCase(name)) {
			return loc_nm_lcl3();
		}
		if ($loc_nm_lcl4.equalsIgnoreCase(name)) {
			return loc_nm_lcl4();
		}
		if ($loc_nm_lcl5.equalsIgnoreCase(name)) {
			return loc_nm_lcl5();
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
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($alloc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			return alloc_grp_nm_lcl1();
		}
		if ($alloc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			return alloc_grp_nm_lcl2();
		}
		if ($alloc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			return alloc_grp_nm_lcl3();
		}
		if ($alloc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			return alloc_grp_nm_lcl4();
		}
		if ($alloc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			return alloc_grp_nm_lcl5();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_nm_lcl1.equalsIgnoreCase(name)) {
			return sppl_nm_lcl1();
		}
		if ($sppl_nm_lcl2.equalsIgnoreCase(name)) {
			return sppl_nm_lcl2();
		}
		if ($sppl_nm_lcl3.equalsIgnoreCase(name)) {
			return sppl_nm_lcl3();
		}
		if ($sppl_nm_lcl4.equalsIgnoreCase(name)) {
			return sppl_nm_lcl4();
		}
		if ($sppl_nm_lcl5.equalsIgnoreCase(name)) {
			return sppl_nm_lcl5();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($cntry_nm_lcl1.equalsIgnoreCase(name)) {
			return cntry_nm_lcl1();
		}
		if ($cntry_nm_lcl2.equalsIgnoreCase(name)) {
			return cntry_nm_lcl2();
		}
		if ($cntry_nm_lcl3.equalsIgnoreCase(name)) {
			return cntry_nm_lcl3();
		}
		if ($cntry_nm_lcl4.equalsIgnoreCase(name)) {
			return cntry_nm_lcl4();
		}
		if ($cntry_nm_lcl5.equalsIgnoreCase(name)) {
			return cntry_nm_lcl5();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_nm1_lcl1.equalsIgnoreCase(name)) {
			return rsrc_nm1_lcl1();
		}
		if ($rsrc_nm1_lcl2.equalsIgnoreCase(name)) {
			return rsrc_nm1_lcl2();
		}
		if ($rsrc_nm1_lcl3.equalsIgnoreCase(name)) {
			return rsrc_nm1_lcl3();
		}
		if ($rsrc_nm1_lcl4.equalsIgnoreCase(name)) {
			return rsrc_nm1_lcl4();
		}
		if ($rsrc_nm1_lcl5.equalsIgnoreCase(name)) {
			return rsrc_nm1_lcl5();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($rsrc_nm2_lcl1.equalsIgnoreCase(name)) {
			return rsrc_nm2_lcl1();
		}
		if ($rsrc_nm2_lcl2.equalsIgnoreCase(name)) {
			return rsrc_nm2_lcl2();
		}
		if ($rsrc_nm2_lcl3.equalsIgnoreCase(name)) {
			return rsrc_nm2_lcl3();
		}
		if ($rsrc_nm2_lcl4.equalsIgnoreCase(name)) {
			return rsrc_nm2_lcl4();
		}
		if ($rsrc_nm2_lcl5.equalsIgnoreCase(name)) {
			return rsrc_nm2_lcl5();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($loc_nm_lcl1.equalsIgnoreCase(name)) {
			loc_nm_lcl1(value);
			return;
		}
		if ($loc_nm_lcl2.equalsIgnoreCase(name)) {
			loc_nm_lcl2(value);
			return;
		}
		if ($loc_nm_lcl3.equalsIgnoreCase(name)) {
			loc_nm_lcl3(value);
			return;
		}
		if ($loc_nm_lcl4.equalsIgnoreCase(name)) {
			loc_nm_lcl4(value);
			return;
		}
		if ($loc_nm_lcl5.equalsIgnoreCase(name)) {
			loc_nm_lcl5(value);
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
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($alloc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			alloc_grp_nm_lcl1(value);
			return;
		}
		if ($alloc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			alloc_grp_nm_lcl2(value);
			return;
		}
		if ($alloc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			alloc_grp_nm_lcl3(value);
			return;
		}
		if ($alloc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			alloc_grp_nm_lcl4(value);
			return;
		}
		if ($alloc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			alloc_grp_nm_lcl5(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_nm_lcl1.equalsIgnoreCase(name)) {
			sppl_nm_lcl1(value);
			return;
		}
		if ($sppl_nm_lcl2.equalsIgnoreCase(name)) {
			sppl_nm_lcl2(value);
			return;
		}
		if ($sppl_nm_lcl3.equalsIgnoreCase(name)) {
			sppl_nm_lcl3(value);
			return;
		}
		if ($sppl_nm_lcl4.equalsIgnoreCase(name)) {
			sppl_nm_lcl4(value);
			return;
		}
		if ($sppl_nm_lcl5.equalsIgnoreCase(name)) {
			sppl_nm_lcl5(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($cntry_nm_lcl1.equalsIgnoreCase(name)) {
			cntry_nm_lcl1(value);
			return;
		}
		if ($cntry_nm_lcl2.equalsIgnoreCase(name)) {
			cntry_nm_lcl2(value);
			return;
		}
		if ($cntry_nm_lcl3.equalsIgnoreCase(name)) {
			cntry_nm_lcl3(value);
			return;
		}
		if ($cntry_nm_lcl4.equalsIgnoreCase(name)) {
			cntry_nm_lcl4(value);
			return;
		}
		if ($cntry_nm_lcl5.equalsIgnoreCase(name)) {
			cntry_nm_lcl5(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_nm1_lcl1.equalsIgnoreCase(name)) {
			rsrc_nm1_lcl1(value);
			return;
		}
		if ($rsrc_nm1_lcl2.equalsIgnoreCase(name)) {
			rsrc_nm1_lcl2(value);
			return;
		}
		if ($rsrc_nm1_lcl3.equalsIgnoreCase(name)) {
			rsrc_nm1_lcl3(value);
			return;
		}
		if ($rsrc_nm1_lcl4.equalsIgnoreCase(name)) {
			rsrc_nm1_lcl4(value);
			return;
		}
		if ($rsrc_nm1_lcl5.equalsIgnoreCase(name)) {
			rsrc_nm1_lcl5(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($rsrc_nm2_lcl1.equalsIgnoreCase(name)) {
			rsrc_nm2_lcl1(value);
			return;
		}
		if ($rsrc_nm2_lcl2.equalsIgnoreCase(name)) {
			rsrc_nm2_lcl2(value);
			return;
		}
		if ($rsrc_nm2_lcl3.equalsIgnoreCase(name)) {
			rsrc_nm2_lcl3(value);
			return;
		}
		if ($rsrc_nm2_lcl4.equalsIgnoreCase(name)) {
			rsrc_nm2_lcl4(value);
			return;
		}
		if ($rsrc_nm2_lcl5.equalsIgnoreCase(name)) {
			rsrc_nm2_lcl5(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($loc_nm_lcl1.equalsIgnoreCase(name)) {
			loc_nm_lcl1(value);
			return;
		}
		if ($loc_nm_lcl2.equalsIgnoreCase(name)) {
			loc_nm_lcl2(value);
			return;
		}
		if ($loc_nm_lcl3.equalsIgnoreCase(name)) {
			loc_nm_lcl3(value);
			return;
		}
		if ($loc_nm_lcl4.equalsIgnoreCase(name)) {
			loc_nm_lcl4(value);
			return;
		}
		if ($loc_nm_lcl5.equalsIgnoreCase(name)) {
			loc_nm_lcl5(value);
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
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($alloc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			alloc_grp_nm_lcl1(value);
			return;
		}
		if ($alloc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			alloc_grp_nm_lcl2(value);
			return;
		}
		if ($alloc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			alloc_grp_nm_lcl3(value);
			return;
		}
		if ($alloc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			alloc_grp_nm_lcl4(value);
			return;
		}
		if ($alloc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			alloc_grp_nm_lcl5(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_nm_lcl1.equalsIgnoreCase(name)) {
			sppl_nm_lcl1(value);
			return;
		}
		if ($sppl_nm_lcl2.equalsIgnoreCase(name)) {
			sppl_nm_lcl2(value);
			return;
		}
		if ($sppl_nm_lcl3.equalsIgnoreCase(name)) {
			sppl_nm_lcl3(value);
			return;
		}
		if ($sppl_nm_lcl4.equalsIgnoreCase(name)) {
			sppl_nm_lcl4(value);
			return;
		}
		if ($sppl_nm_lcl5.equalsIgnoreCase(name)) {
			sppl_nm_lcl5(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($cntry_nm_lcl1.equalsIgnoreCase(name)) {
			cntry_nm_lcl1(value);
			return;
		}
		if ($cntry_nm_lcl2.equalsIgnoreCase(name)) {
			cntry_nm_lcl2(value);
			return;
		}
		if ($cntry_nm_lcl3.equalsIgnoreCase(name)) {
			cntry_nm_lcl3(value);
			return;
		}
		if ($cntry_nm_lcl4.equalsIgnoreCase(name)) {
			cntry_nm_lcl4(value);
			return;
		}
		if ($cntry_nm_lcl5.equalsIgnoreCase(name)) {
			cntry_nm_lcl5(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_nm1_lcl1.equalsIgnoreCase(name)) {
			rsrc_nm1_lcl1(value);
			return;
		}
		if ($rsrc_nm1_lcl2.equalsIgnoreCase(name)) {
			rsrc_nm1_lcl2(value);
			return;
		}
		if ($rsrc_nm1_lcl3.equalsIgnoreCase(name)) {
			rsrc_nm1_lcl3(value);
			return;
		}
		if ($rsrc_nm1_lcl4.equalsIgnoreCase(name)) {
			rsrc_nm1_lcl4(value);
			return;
		}
		if ($rsrc_nm1_lcl5.equalsIgnoreCase(name)) {
			rsrc_nm1_lcl5(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($rsrc_nm2_lcl1.equalsIgnoreCase(name)) {
			rsrc_nm2_lcl1(value);
			return;
		}
		if ($rsrc_nm2_lcl2.equalsIgnoreCase(name)) {
			rsrc_nm2_lcl2(value);
			return;
		}
		if ($rsrc_nm2_lcl3.equalsIgnoreCase(name)) {
			rsrc_nm2_lcl3(value);
			return;
		}
		if ($rsrc_nm2_lcl4.equalsIgnoreCase(name)) {
			rsrc_nm2_lcl4(value);
			return;
		}
		if ($rsrc_nm2_lcl5.equalsIgnoreCase(name)) {
			rsrc_nm2_lcl5(value);
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
