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
 * "取引先マスタ送信ＩＦ // BP master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先名</td>
 *  	<td>BP name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先名（ロケール１）</td>
 *  	<td>BP name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先名（ロケール２）</td>
 *  	<td>BP name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先名（ロケール３）</td>
 *  	<td>BP name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先名（ロケール４）</td>
 *  	<td>BP name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先名（ロケール５）</td>
 *  	<td>BP name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１</td>
 *  	<td>BP classification name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm1_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１（ロケール１）</td>
 *  	<td>BP classification name 1 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm1_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１（ロケール２）</td>
 *  	<td>BP classification name 1 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm1_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１（ロケール３）</td>
 *  	<td>BP classification name 1 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm1_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１（ロケール４）</td>
 *  	<td>BP classification name 1 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm1_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１（ロケール５）</td>
 *  	<td>BP classification name 1 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名２</td>
 *  	<td>BP classification name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm2_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名２（ロケール１）</td>
 *  	<td>BP classification name 2 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm2_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名２（ロケール２）</td>
 *  	<td>BP classification name 2 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm2_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名２（ロケール３）</td>
 *  	<td>BP classification name 2 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm2_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名２（ロケール４）</td>
 *  	<td>BP classification name 2 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm2_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名２（ロケール５）</td>
 *  	<td>BP classification name 2 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名３</td>
 *  	<td>BP classification name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm3_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名３（ロケール１）</td>
 *  	<td>BP classification name 3 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm3_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名３（ロケール２）</td>
 *  	<td>BP classification name 3 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm3_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名３（ロケール３）</td>
 *  	<td>BP classification name 3 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm3_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名３（ロケール４）</td>
 *  	<td>BP classification name 3 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm3_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名３（ロケール５）</td>
 *  	<td>BP classification name 3 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名４</td>
 *  	<td>BP classification name 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm4_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名４（ロケール１）</td>
 *  	<td>BP classification name 4 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm4_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名４（ロケール２）</td>
 *  	<td>BP classification name 4 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm4_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名４（ロケール３）</td>
 *  	<td>BP classification name 4 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm4_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名４（ロケール４）</td>
 *  	<td>BP classification name 4 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm4_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名４（ロケール５）</td>
 *  	<td>BP classification name 4 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名５</td>
 *  	<td>BP classification name 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm5_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名５（ロケール１）</td>
 *  	<td>BP classification name 5 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm5_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名５（ロケール２）</td>
 *  	<td>BP classification name 5 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm5_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名５（ロケール３）</td>
 *  	<td>BP classification name 5 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm5_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名５（ロケール４）</td>
 *  	<td>BP classification name 5 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm5_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名５（ロケール５）</td>
 *  	<td>BP classification name 5 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm6</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名６</td>
 *  	<td>BP classification name 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm6_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名６（ロケール１）</td>
 *  	<td>BP classification name 6 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm6_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名６（ロケール２）</td>
 *  	<td>BP classification name 6 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm6_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名６（ロケール３）</td>
 *  	<td>BP classification name 6 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm6_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名６（ロケール４）</td>
 *  	<td>BP classification name 6 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm6_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名６（ロケール５）</td>
 *  	<td>BP classification name 6 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm7</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名７</td>
 *  	<td>BP classification name 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm7_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名７（ロケール１）</td>
 *  	<td>BP classification name 7 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm7_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名７（ロケール２）</td>
 *  	<td>BP classification name 7 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm7_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名７（ロケール３）</td>
 *  	<td>BP classification name 7 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm7_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名７（ロケール４）</td>
 *  	<td>BP classification name 7 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm7_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名７（ロケール５）</td>
 *  	<td>BP classification name 7 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm8</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名８</td>
 *  	<td>BP classification name 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm8_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名８（ロケール１）</td>
 *  	<td>BP classification name 8 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm8_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名８（ロケール２）</td>
 *  	<td>BP classification name 8 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm8_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名８（ロケール３）</td>
 *  	<td>BP classification name 8 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm8_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名８（ロケール４）</td>
 *  	<td>BP classification name 8 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm8_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名８（ロケール５）</td>
 *  	<td>BP classification name 8 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm9</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名９</td>
 *  	<td>BP classification name 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm9_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名９（ロケール１）</td>
 *  	<td>BP classification name 9 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm9_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名９（ロケール２）</td>
 *  	<td>BP classification name 9 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm9_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名９（ロケール３）</td>
 *  	<td>BP classification name 9 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm9_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名９（ロケール４）</td>
 *  	<td>BP classification name 9 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm9_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名９（ロケール５）</td>
 *  	<td>BP classification name 9 (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm10</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１０</td>
 *  	<td>BP classification name 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm10_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１０（ロケール１）</td>
 *  	<td>BP classification name 10 (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm10_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１０（ロケール２）</td>
 *  	<td>BP classification name 10 (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm10_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１０（ロケール３）</td>
 *  	<td>BP classification name 10 (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_grp_nm10_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１０（ロケール４）</td>
 *  	<td>BP classification name 10 (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_grp_nm10_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先分類名１０（ロケール５）</td>
 *  	<td>BP classification name 10 (Locale 5)</td>
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
 *  	<td>area_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>地域名</td>
 *  	<td>Region name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>area_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>地域名（ロケール１）</td>
 *  	<td>Region name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>area_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>地域名（ロケール２）</td>
 *  	<td>Region name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>area_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>地域名（ロケール３）</td>
 *  	<td>Region name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>area_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>地域名（ロケール４）</td>
 *  	<td>Region name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>area_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>地域名（ロケール５）</td>
 *  	<td>Region name (Locale 5)</td>
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
 *  	<td>memo4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ４</td>
 *  	<td>Memo 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ５</td>
 *  	<td>Memo 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ６</td>
 *  	<td>Memo 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ７</td>
 *  	<td>Memo 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ８</td>
 *  	<td>Memo 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ９</td>
 *  	<td>Memo 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo10</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１０</td>
 *  	<td>Memo 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo11</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１１</td>
 *  	<td>Memo 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo12</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１２</td>
 *  	<td>Memo 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo13</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１３</td>
 *  	<td>Memo 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo14</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１４</td>
 *  	<td>Memo 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo15</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１５</td>
 *  	<td>Memo 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo16</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１６</td>
 *  	<td>Memo 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo17</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１７</td>
 *  	<td>Memo 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo18</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１８</td>
 *  	<td>Memo 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo19</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１９</td>
 *  	<td>Memo 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo20</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２０</td>
 *  	<td>Memo 20</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_BP_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_BP_IF_ALL";

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
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	private static final MCPermColumnInfo _bp_nm = createColumnInfo("bp_nm");
	public final MCStringPermColumn bp_nm = createStringColumn(_bp_nm);
	
	/**
	 * 取引先名（ロケール１）. BP name (Locale 1).<p>
	 *
	 */
	public static final String $bp_nm_lcl1 = "bp_nm_lcl1";
	private static final MCPermColumnInfo _bp_nm_lcl1 = createColumnInfo("bp_nm_lcl1");
	public final MCStringPermColumn bp_nm_lcl1 = createStringColumn(_bp_nm_lcl1);
	
	/**
	 * 取引先名（ロケール２）. BP name (Locale 2).<p>
	 *
	 */
	public static final String $bp_nm_lcl2 = "bp_nm_lcl2";
	private static final MCPermColumnInfo _bp_nm_lcl2 = createColumnInfo("bp_nm_lcl2");
	public final MCStringPermColumn bp_nm_lcl2 = createStringColumn(_bp_nm_lcl2);
	
	/**
	 * 取引先名（ロケール３）. BP name (Locale 3).<p>
	 *
	 */
	public static final String $bp_nm_lcl3 = "bp_nm_lcl3";
	private static final MCPermColumnInfo _bp_nm_lcl3 = createColumnInfo("bp_nm_lcl3");
	public final MCStringPermColumn bp_nm_lcl3 = createStringColumn(_bp_nm_lcl3);
	
	/**
	 * 取引先名（ロケール４）. BP name (Locale 4).<p>
	 *
	 */
	public static final String $bp_nm_lcl4 = "bp_nm_lcl4";
	private static final MCPermColumnInfo _bp_nm_lcl4 = createColumnInfo("bp_nm_lcl4");
	public final MCStringPermColumn bp_nm_lcl4 = createStringColumn(_bp_nm_lcl4);
	
	/**
	 * 取引先名（ロケール５）. BP name (Locale 5).<p>
	 *
	 */
	public static final String $bp_nm_lcl5 = "bp_nm_lcl5";
	private static final MCPermColumnInfo _bp_nm_lcl5 = createColumnInfo("bp_nm_lcl5");
	public final MCStringPermColumn bp_nm_lcl5 = createStringColumn(_bp_nm_lcl5);
	
	/**
	 * 取引先分類名１. BP classification name 1.<p>
	 *
	 */
	public static final String $bp_grp_nm1 = "bp_grp_nm1";
	private static final MCPermColumnInfo _bp_grp_nm1 = createColumnInfo("bp_grp_nm1");
	public final MCStringPermColumn bp_grp_nm1 = createStringColumn(_bp_grp_nm1);
	
	/**
	 * 取引先分類名１（ロケール１）. BP classification name 1 (Locale 1).<p>
	 *
	 */
	public static final String $bp_grp_nm1_lcl1 = "bp_grp_nm1_lcl1";
	private static final MCPermColumnInfo _bp_grp_nm1_lcl1 = createColumnInfo("bp_grp_nm1_lcl1");
	public final MCStringPermColumn bp_grp_nm1_lcl1 = createStringColumn(_bp_grp_nm1_lcl1);
	
	/**
	 * 取引先分類名１（ロケール２）. BP classification name 1 (Locale 2).<p>
	 *
	 */
	public static final String $bp_grp_nm1_lcl2 = "bp_grp_nm1_lcl2";
	private static final MCPermColumnInfo _bp_grp_nm1_lcl2 = createColumnInfo("bp_grp_nm1_lcl2");
	public final MCStringPermColumn bp_grp_nm1_lcl2 = createStringColumn(_bp_grp_nm1_lcl2);
	
	/**
	 * 取引先分類名１（ロケール３）. BP classification name 1 (Locale 3).<p>
	 *
	 */
	public static final String $bp_grp_nm1_lcl3 = "bp_grp_nm1_lcl3";
	private static final MCPermColumnInfo _bp_grp_nm1_lcl3 = createColumnInfo("bp_grp_nm1_lcl3");
	public final MCStringPermColumn bp_grp_nm1_lcl3 = createStringColumn(_bp_grp_nm1_lcl3);
	
	/**
	 * 取引先分類名１（ロケール４）. BP classification name 1 (Locale 4).<p>
	 *
	 */
	public static final String $bp_grp_nm1_lcl4 = "bp_grp_nm1_lcl4";
	private static final MCPermColumnInfo _bp_grp_nm1_lcl4 = createColumnInfo("bp_grp_nm1_lcl4");
	public final MCStringPermColumn bp_grp_nm1_lcl4 = createStringColumn(_bp_grp_nm1_lcl4);
	
	/**
	 * 取引先分類名１（ロケール５）. BP classification name 1 (Locale 5).<p>
	 *
	 */
	public static final String $bp_grp_nm1_lcl5 = "bp_grp_nm1_lcl5";
	private static final MCPermColumnInfo _bp_grp_nm1_lcl5 = createColumnInfo("bp_grp_nm1_lcl5");
	public final MCStringPermColumn bp_grp_nm1_lcl5 = createStringColumn(_bp_grp_nm1_lcl5);
	
	/**
	 * 取引先分類名２. BP classification name 2.<p>
	 *
	 */
	public static final String $bp_grp_nm2 = "bp_grp_nm2";
	private static final MCPermColumnInfo _bp_grp_nm2 = createColumnInfo("bp_grp_nm2");
	public final MCStringPermColumn bp_grp_nm2 = createStringColumn(_bp_grp_nm2);
	
	/**
	 * 取引先分類名２（ロケール１）. BP classification name 2 (Locale 1).<p>
	 *
	 */
	public static final String $bp_grp_nm2_lcl1 = "bp_grp_nm2_lcl1";
	private static final MCPermColumnInfo _bp_grp_nm2_lcl1 = createColumnInfo("bp_grp_nm2_lcl1");
	public final MCStringPermColumn bp_grp_nm2_lcl1 = createStringColumn(_bp_grp_nm2_lcl1);
	
	/**
	 * 取引先分類名２（ロケール２）. BP classification name 2 (Locale 2).<p>
	 *
	 */
	public static final String $bp_grp_nm2_lcl2 = "bp_grp_nm2_lcl2";
	private static final MCPermColumnInfo _bp_grp_nm2_lcl2 = createColumnInfo("bp_grp_nm2_lcl2");
	public final MCStringPermColumn bp_grp_nm2_lcl2 = createStringColumn(_bp_grp_nm2_lcl2);
	
	/**
	 * 取引先分類名２（ロケール３）. BP classification name 2 (Locale 3).<p>
	 *
	 */
	public static final String $bp_grp_nm2_lcl3 = "bp_grp_nm2_lcl3";
	private static final MCPermColumnInfo _bp_grp_nm2_lcl3 = createColumnInfo("bp_grp_nm2_lcl3");
	public final MCStringPermColumn bp_grp_nm2_lcl3 = createStringColumn(_bp_grp_nm2_lcl3);
	
	/**
	 * 取引先分類名２（ロケール４）. BP classification name 2 (Locale 4).<p>
	 *
	 */
	public static final String $bp_grp_nm2_lcl4 = "bp_grp_nm2_lcl4";
	private static final MCPermColumnInfo _bp_grp_nm2_lcl4 = createColumnInfo("bp_grp_nm2_lcl4");
	public final MCStringPermColumn bp_grp_nm2_lcl4 = createStringColumn(_bp_grp_nm2_lcl4);
	
	/**
	 * 取引先分類名２（ロケール５）. BP classification name 2 (Locale 5).<p>
	 *
	 */
	public static final String $bp_grp_nm2_lcl5 = "bp_grp_nm2_lcl5";
	private static final MCPermColumnInfo _bp_grp_nm2_lcl5 = createColumnInfo("bp_grp_nm2_lcl5");
	public final MCStringPermColumn bp_grp_nm2_lcl5 = createStringColumn(_bp_grp_nm2_lcl5);
	
	/**
	 * 取引先分類名３. BP classification name 3.<p>
	 *
	 */
	public static final String $bp_grp_nm3 = "bp_grp_nm3";
	private static final MCPermColumnInfo _bp_grp_nm3 = createColumnInfo("bp_grp_nm3");
	public final MCStringPermColumn bp_grp_nm3 = createStringColumn(_bp_grp_nm3);
	
	/**
	 * 取引先分類名３（ロケール１）. BP classification name 3 (Locale 1).<p>
	 *
	 */
	public static final String $bp_grp_nm3_lcl1 = "bp_grp_nm3_lcl1";
	private static final MCPermColumnInfo _bp_grp_nm3_lcl1 = createColumnInfo("bp_grp_nm3_lcl1");
	public final MCStringPermColumn bp_grp_nm3_lcl1 = createStringColumn(_bp_grp_nm3_lcl1);
	
	/**
	 * 取引先分類名３（ロケール２）. BP classification name 3 (Locale 2).<p>
	 *
	 */
	public static final String $bp_grp_nm3_lcl2 = "bp_grp_nm3_lcl2";
	private static final MCPermColumnInfo _bp_grp_nm3_lcl2 = createColumnInfo("bp_grp_nm3_lcl2");
	public final MCStringPermColumn bp_grp_nm3_lcl2 = createStringColumn(_bp_grp_nm3_lcl2);
	
	/**
	 * 取引先分類名３（ロケール３）. BP classification name 3 (Locale 3).<p>
	 *
	 */
	public static final String $bp_grp_nm3_lcl3 = "bp_grp_nm3_lcl3";
	private static final MCPermColumnInfo _bp_grp_nm3_lcl3 = createColumnInfo("bp_grp_nm3_lcl3");
	public final MCStringPermColumn bp_grp_nm3_lcl3 = createStringColumn(_bp_grp_nm3_lcl3);
	
	/**
	 * 取引先分類名３（ロケール４）. BP classification name 3 (Locale 4).<p>
	 *
	 */
	public static final String $bp_grp_nm3_lcl4 = "bp_grp_nm3_lcl4";
	private static final MCPermColumnInfo _bp_grp_nm3_lcl4 = createColumnInfo("bp_grp_nm3_lcl4");
	public final MCStringPermColumn bp_grp_nm3_lcl4 = createStringColumn(_bp_grp_nm3_lcl4);
	
	/**
	 * 取引先分類名３（ロケール５）. BP classification name 3 (Locale 5).<p>
	 *
	 */
	public static final String $bp_grp_nm3_lcl5 = "bp_grp_nm3_lcl5";
	private static final MCPermColumnInfo _bp_grp_nm3_lcl5 = createColumnInfo("bp_grp_nm3_lcl5");
	public final MCStringPermColumn bp_grp_nm3_lcl5 = createStringColumn(_bp_grp_nm3_lcl5);
	
	/**
	 * 取引先分類名４. BP classification name 4.<p>
	 *
	 */
	public static final String $bp_grp_nm4 = "bp_grp_nm4";
	private static final MCPermColumnInfo _bp_grp_nm4 = createColumnInfo("bp_grp_nm4");
	public final MCStringPermColumn bp_grp_nm4 = createStringColumn(_bp_grp_nm4);
	
	/**
	 * 取引先分類名４（ロケール１）. BP classification name 4 (Locale 1).<p>
	 *
	 */
	public static final String $bp_grp_nm4_lcl1 = "bp_grp_nm4_lcl1";
	private static final MCPermColumnInfo _bp_grp_nm4_lcl1 = createColumnInfo("bp_grp_nm4_lcl1");
	public final MCStringPermColumn bp_grp_nm4_lcl1 = createStringColumn(_bp_grp_nm4_lcl1);
	
	/**
	 * 取引先分類名４（ロケール２）. BP classification name 4 (Locale 2).<p>
	 *
	 */
	public static final String $bp_grp_nm4_lcl2 = "bp_grp_nm4_lcl2";
	private static final MCPermColumnInfo _bp_grp_nm4_lcl2 = createColumnInfo("bp_grp_nm4_lcl2");
	public final MCStringPermColumn bp_grp_nm4_lcl2 = createStringColumn(_bp_grp_nm4_lcl2);
	
	/**
	 * 取引先分類名４（ロケール３）. BP classification name 4 (Locale 3).<p>
	 *
	 */
	public static final String $bp_grp_nm4_lcl3 = "bp_grp_nm4_lcl3";
	private static final MCPermColumnInfo _bp_grp_nm4_lcl3 = createColumnInfo("bp_grp_nm4_lcl3");
	public final MCStringPermColumn bp_grp_nm4_lcl3 = createStringColumn(_bp_grp_nm4_lcl3);
	
	/**
	 * 取引先分類名４（ロケール４）. BP classification name 4 (Locale 4).<p>
	 *
	 */
	public static final String $bp_grp_nm4_lcl4 = "bp_grp_nm4_lcl4";
	private static final MCPermColumnInfo _bp_grp_nm4_lcl4 = createColumnInfo("bp_grp_nm4_lcl4");
	public final MCStringPermColumn bp_grp_nm4_lcl4 = createStringColumn(_bp_grp_nm4_lcl4);
	
	/**
	 * 取引先分類名４（ロケール５）. BP classification name 4 (Locale 5).<p>
	 *
	 */
	public static final String $bp_grp_nm4_lcl5 = "bp_grp_nm4_lcl5";
	private static final MCPermColumnInfo _bp_grp_nm4_lcl5 = createColumnInfo("bp_grp_nm4_lcl5");
	public final MCStringPermColumn bp_grp_nm4_lcl5 = createStringColumn(_bp_grp_nm4_lcl5);
	
	/**
	 * 取引先分類名５. BP classification name 5.<p>
	 *
	 */
	public static final String $bp_grp_nm5 = "bp_grp_nm5";
	private static final MCPermColumnInfo _bp_grp_nm5 = createColumnInfo("bp_grp_nm5");
	public final MCStringPermColumn bp_grp_nm5 = createStringColumn(_bp_grp_nm5);
	
	/**
	 * 取引先分類名５（ロケール１）. BP classification name 5 (Locale 1).<p>
	 *
	 */
	public static final String $bp_grp_nm5_lcl1 = "bp_grp_nm5_lcl1";
	private static final MCPermColumnInfo _bp_grp_nm5_lcl1 = createColumnInfo("bp_grp_nm5_lcl1");
	public final MCStringPermColumn bp_grp_nm5_lcl1 = createStringColumn(_bp_grp_nm5_lcl1);
	
	/**
	 * 取引先分類名５（ロケール２）. BP classification name 5 (Locale 2).<p>
	 *
	 */
	public static final String $bp_grp_nm5_lcl2 = "bp_grp_nm5_lcl2";
	private static final MCPermColumnInfo _bp_grp_nm5_lcl2 = createColumnInfo("bp_grp_nm5_lcl2");
	public final MCStringPermColumn bp_grp_nm5_lcl2 = createStringColumn(_bp_grp_nm5_lcl2);
	
	/**
	 * 取引先分類名５（ロケール３）. BP classification name 5 (Locale 3).<p>
	 *
	 */
	public static final String $bp_grp_nm5_lcl3 = "bp_grp_nm5_lcl3";
	private static final MCPermColumnInfo _bp_grp_nm5_lcl3 = createColumnInfo("bp_grp_nm5_lcl3");
	public final MCStringPermColumn bp_grp_nm5_lcl3 = createStringColumn(_bp_grp_nm5_lcl3);
	
	/**
	 * 取引先分類名５（ロケール４）. BP classification name 5 (Locale 4).<p>
	 *
	 */
	public static final String $bp_grp_nm5_lcl4 = "bp_grp_nm5_lcl4";
	private static final MCPermColumnInfo _bp_grp_nm5_lcl4 = createColumnInfo("bp_grp_nm5_lcl4");
	public final MCStringPermColumn bp_grp_nm5_lcl4 = createStringColumn(_bp_grp_nm5_lcl4);
	
	/**
	 * 取引先分類名５（ロケール５）. BP classification name 5 (Locale 5).<p>
	 *
	 */
	public static final String $bp_grp_nm5_lcl5 = "bp_grp_nm5_lcl5";
	private static final MCPermColumnInfo _bp_grp_nm5_lcl5 = createColumnInfo("bp_grp_nm5_lcl5");
	public final MCStringPermColumn bp_grp_nm5_lcl5 = createStringColumn(_bp_grp_nm5_lcl5);
	
	/**
	 * 取引先分類名６. BP classification name 6.<p>
	 *
	 */
	public static final String $bp_grp_nm6 = "bp_grp_nm6";
	private static final MCPermColumnInfo _bp_grp_nm6 = createColumnInfo("bp_grp_nm6");
	public final MCStringPermColumn bp_grp_nm6 = createStringColumn(_bp_grp_nm6);
	
	/**
	 * 取引先分類名６（ロケール１）. BP classification name 6 (Locale 1).<p>
	 *
	 */
	public static final String $bp_grp_nm6_lcl1 = "bp_grp_nm6_lcl1";
	private static final MCPermColumnInfo _bp_grp_nm6_lcl1 = createColumnInfo("bp_grp_nm6_lcl1");
	public final MCStringPermColumn bp_grp_nm6_lcl1 = createStringColumn(_bp_grp_nm6_lcl1);
	
	/**
	 * 取引先分類名６（ロケール２）. BP classification name 6 (Locale 2).<p>
	 *
	 */
	public static final String $bp_grp_nm6_lcl2 = "bp_grp_nm6_lcl2";
	private static final MCPermColumnInfo _bp_grp_nm6_lcl2 = createColumnInfo("bp_grp_nm6_lcl2");
	public final MCStringPermColumn bp_grp_nm6_lcl2 = createStringColumn(_bp_grp_nm6_lcl2);
	
	/**
	 * 取引先分類名６（ロケール３）. BP classification name 6 (Locale 3).<p>
	 *
	 */
	public static final String $bp_grp_nm6_lcl3 = "bp_grp_nm6_lcl3";
	private static final MCPermColumnInfo _bp_grp_nm6_lcl3 = createColumnInfo("bp_grp_nm6_lcl3");
	public final MCStringPermColumn bp_grp_nm6_lcl3 = createStringColumn(_bp_grp_nm6_lcl3);
	
	/**
	 * 取引先分類名６（ロケール４）. BP classification name 6 (Locale 4).<p>
	 *
	 */
	public static final String $bp_grp_nm6_lcl4 = "bp_grp_nm6_lcl4";
	private static final MCPermColumnInfo _bp_grp_nm6_lcl4 = createColumnInfo("bp_grp_nm6_lcl4");
	public final MCStringPermColumn bp_grp_nm6_lcl4 = createStringColumn(_bp_grp_nm6_lcl4);
	
	/**
	 * 取引先分類名６（ロケール５）. BP classification name 6 (Locale 5).<p>
	 *
	 */
	public static final String $bp_grp_nm6_lcl5 = "bp_grp_nm6_lcl5";
	private static final MCPermColumnInfo _bp_grp_nm6_lcl5 = createColumnInfo("bp_grp_nm6_lcl5");
	public final MCStringPermColumn bp_grp_nm6_lcl5 = createStringColumn(_bp_grp_nm6_lcl5);
	
	/**
	 * 取引先分類名７. BP classification name 7.<p>
	 *
	 */
	public static final String $bp_grp_nm7 = "bp_grp_nm7";
	private static final MCPermColumnInfo _bp_grp_nm7 = createColumnInfo("bp_grp_nm7");
	public final MCStringPermColumn bp_grp_nm7 = createStringColumn(_bp_grp_nm7);
	
	/**
	 * 取引先分類名７（ロケール１）. BP classification name 7 (Locale 1).<p>
	 *
	 */
	public static final String $bp_grp_nm7_lcl1 = "bp_grp_nm7_lcl1";
	private static final MCPermColumnInfo _bp_grp_nm7_lcl1 = createColumnInfo("bp_grp_nm7_lcl1");
	public final MCStringPermColumn bp_grp_nm7_lcl1 = createStringColumn(_bp_grp_nm7_lcl1);
	
	/**
	 * 取引先分類名７（ロケール２）. BP classification name 7 (Locale 2).<p>
	 *
	 */
	public static final String $bp_grp_nm7_lcl2 = "bp_grp_nm7_lcl2";
	private static final MCPermColumnInfo _bp_grp_nm7_lcl2 = createColumnInfo("bp_grp_nm7_lcl2");
	public final MCStringPermColumn bp_grp_nm7_lcl2 = createStringColumn(_bp_grp_nm7_lcl2);
	
	/**
	 * 取引先分類名７（ロケール３）. BP classification name 7 (Locale 3).<p>
	 *
	 */
	public static final String $bp_grp_nm7_lcl3 = "bp_grp_nm7_lcl3";
	private static final MCPermColumnInfo _bp_grp_nm7_lcl3 = createColumnInfo("bp_grp_nm7_lcl3");
	public final MCStringPermColumn bp_grp_nm7_lcl3 = createStringColumn(_bp_grp_nm7_lcl3);
	
	/**
	 * 取引先分類名７（ロケール４）. BP classification name 7 (Locale 4).<p>
	 *
	 */
	public static final String $bp_grp_nm7_lcl4 = "bp_grp_nm7_lcl4";
	private static final MCPermColumnInfo _bp_grp_nm7_lcl4 = createColumnInfo("bp_grp_nm7_lcl4");
	public final MCStringPermColumn bp_grp_nm7_lcl4 = createStringColumn(_bp_grp_nm7_lcl4);
	
	/**
	 * 取引先分類名７（ロケール５）. BP classification name 7 (Locale 5).<p>
	 *
	 */
	public static final String $bp_grp_nm7_lcl5 = "bp_grp_nm7_lcl5";
	private static final MCPermColumnInfo _bp_grp_nm7_lcl5 = createColumnInfo("bp_grp_nm7_lcl5");
	public final MCStringPermColumn bp_grp_nm7_lcl5 = createStringColumn(_bp_grp_nm7_lcl5);
	
	/**
	 * 取引先分類名８. BP classification name 8.<p>
	 *
	 */
	public static final String $bp_grp_nm8 = "bp_grp_nm8";
	private static final MCPermColumnInfo _bp_grp_nm8 = createColumnInfo("bp_grp_nm8");
	public final MCStringPermColumn bp_grp_nm8 = createStringColumn(_bp_grp_nm8);
	
	/**
	 * 取引先分類名８（ロケール１）. BP classification name 8 (Locale 1).<p>
	 *
	 */
	public static final String $bp_grp_nm8_lcl1 = "bp_grp_nm8_lcl1";
	private static final MCPermColumnInfo _bp_grp_nm8_lcl1 = createColumnInfo("bp_grp_nm8_lcl1");
	public final MCStringPermColumn bp_grp_nm8_lcl1 = createStringColumn(_bp_grp_nm8_lcl1);
	
	/**
	 * 取引先分類名８（ロケール２）. BP classification name 8 (Locale 2).<p>
	 *
	 */
	public static final String $bp_grp_nm8_lcl2 = "bp_grp_nm8_lcl2";
	private static final MCPermColumnInfo _bp_grp_nm8_lcl2 = createColumnInfo("bp_grp_nm8_lcl2");
	public final MCStringPermColumn bp_grp_nm8_lcl2 = createStringColumn(_bp_grp_nm8_lcl2);
	
	/**
	 * 取引先分類名８（ロケール３）. BP classification name 8 (Locale 3).<p>
	 *
	 */
	public static final String $bp_grp_nm8_lcl3 = "bp_grp_nm8_lcl3";
	private static final MCPermColumnInfo _bp_grp_nm8_lcl3 = createColumnInfo("bp_grp_nm8_lcl3");
	public final MCStringPermColumn bp_grp_nm8_lcl3 = createStringColumn(_bp_grp_nm8_lcl3);
	
	/**
	 * 取引先分類名８（ロケール４）. BP classification name 8 (Locale 4).<p>
	 *
	 */
	public static final String $bp_grp_nm8_lcl4 = "bp_grp_nm8_lcl4";
	private static final MCPermColumnInfo _bp_grp_nm8_lcl4 = createColumnInfo("bp_grp_nm8_lcl4");
	public final MCStringPermColumn bp_grp_nm8_lcl4 = createStringColumn(_bp_grp_nm8_lcl4);
	
	/**
	 * 取引先分類名８（ロケール５）. BP classification name 8 (Locale 5).<p>
	 *
	 */
	public static final String $bp_grp_nm8_lcl5 = "bp_grp_nm8_lcl5";
	private static final MCPermColumnInfo _bp_grp_nm8_lcl5 = createColumnInfo("bp_grp_nm8_lcl5");
	public final MCStringPermColumn bp_grp_nm8_lcl5 = createStringColumn(_bp_grp_nm8_lcl5);
	
	/**
	 * 取引先分類名９. BP classification name 9.<p>
	 *
	 */
	public static final String $bp_grp_nm9 = "bp_grp_nm9";
	private static final MCPermColumnInfo _bp_grp_nm9 = createColumnInfo("bp_grp_nm9");
	public final MCStringPermColumn bp_grp_nm9 = createStringColumn(_bp_grp_nm9);
	
	/**
	 * 取引先分類名９（ロケール１）. BP classification name 9 (Locale 1).<p>
	 *
	 */
	public static final String $bp_grp_nm9_lcl1 = "bp_grp_nm9_lcl1";
	private static final MCPermColumnInfo _bp_grp_nm9_lcl1 = createColumnInfo("bp_grp_nm9_lcl1");
	public final MCStringPermColumn bp_grp_nm9_lcl1 = createStringColumn(_bp_grp_nm9_lcl1);
	
	/**
	 * 取引先分類名９（ロケール２）. BP classification name 9 (Locale 2).<p>
	 *
	 */
	public static final String $bp_grp_nm9_lcl2 = "bp_grp_nm9_lcl2";
	private static final MCPermColumnInfo _bp_grp_nm9_lcl2 = createColumnInfo("bp_grp_nm9_lcl2");
	public final MCStringPermColumn bp_grp_nm9_lcl2 = createStringColumn(_bp_grp_nm9_lcl2);
	
	/**
	 * 取引先分類名９（ロケール３）. BP classification name 9 (Locale 3).<p>
	 *
	 */
	public static final String $bp_grp_nm9_lcl3 = "bp_grp_nm9_lcl3";
	private static final MCPermColumnInfo _bp_grp_nm9_lcl3 = createColumnInfo("bp_grp_nm9_lcl3");
	public final MCStringPermColumn bp_grp_nm9_lcl3 = createStringColumn(_bp_grp_nm9_lcl3);
	
	/**
	 * 取引先分類名９（ロケール４）. BP classification name 9 (Locale 4).<p>
	 *
	 */
	public static final String $bp_grp_nm9_lcl4 = "bp_grp_nm9_lcl4";
	private static final MCPermColumnInfo _bp_grp_nm9_lcl4 = createColumnInfo("bp_grp_nm9_lcl4");
	public final MCStringPermColumn bp_grp_nm9_lcl4 = createStringColumn(_bp_grp_nm9_lcl4);
	
	/**
	 * 取引先分類名９（ロケール５）. BP classification name 9 (Locale 5).<p>
	 *
	 */
	public static final String $bp_grp_nm9_lcl5 = "bp_grp_nm9_lcl5";
	private static final MCPermColumnInfo _bp_grp_nm9_lcl5 = createColumnInfo("bp_grp_nm9_lcl5");
	public final MCStringPermColumn bp_grp_nm9_lcl5 = createStringColumn(_bp_grp_nm9_lcl5);
	
	/**
	 * 取引先分類名１０. BP classification name 10.<p>
	 *
	 */
	public static final String $bp_grp_nm10 = "bp_grp_nm10";
	private static final MCPermColumnInfo _bp_grp_nm10 = createColumnInfo("bp_grp_nm10");
	public final MCStringPermColumn bp_grp_nm10 = createStringColumn(_bp_grp_nm10);
	
	/**
	 * 取引先分類名１０（ロケール１）. BP classification name 10 (Locale 1).<p>
	 *
	 */
	public static final String $bp_grp_nm10_lcl1 = "bp_grp_nm10_lcl1";
	private static final MCPermColumnInfo _bp_grp_nm10_lcl1 = createColumnInfo("bp_grp_nm10_lcl1");
	public final MCStringPermColumn bp_grp_nm10_lcl1 = createStringColumn(_bp_grp_nm10_lcl1);
	
	/**
	 * 取引先分類名１０（ロケール２）. BP classification name 10 (Locale 2).<p>
	 *
	 */
	public static final String $bp_grp_nm10_lcl2 = "bp_grp_nm10_lcl2";
	private static final MCPermColumnInfo _bp_grp_nm10_lcl2 = createColumnInfo("bp_grp_nm10_lcl2");
	public final MCStringPermColumn bp_grp_nm10_lcl2 = createStringColumn(_bp_grp_nm10_lcl2);
	
	/**
	 * 取引先分類名１０（ロケール３）. BP classification name 10 (Locale 3).<p>
	 *
	 */
	public static final String $bp_grp_nm10_lcl3 = "bp_grp_nm10_lcl3";
	private static final MCPermColumnInfo _bp_grp_nm10_lcl3 = createColumnInfo("bp_grp_nm10_lcl3");
	public final MCStringPermColumn bp_grp_nm10_lcl3 = createStringColumn(_bp_grp_nm10_lcl3);
	
	/**
	 * 取引先分類名１０（ロケール４）. BP classification name 10 (Locale 4).<p>
	 *
	 */
	public static final String $bp_grp_nm10_lcl4 = "bp_grp_nm10_lcl4";
	private static final MCPermColumnInfo _bp_grp_nm10_lcl4 = createColumnInfo("bp_grp_nm10_lcl4");
	public final MCStringPermColumn bp_grp_nm10_lcl4 = createStringColumn(_bp_grp_nm10_lcl4);
	
	/**
	 * 取引先分類名１０（ロケール５）. BP classification name 10 (Locale 5).<p>
	 *
	 */
	public static final String $bp_grp_nm10_lcl5 = "bp_grp_nm10_lcl5";
	private static final MCPermColumnInfo _bp_grp_nm10_lcl5 = createColumnInfo("bp_grp_nm10_lcl5");
	public final MCStringPermColumn bp_grp_nm10_lcl5 = createStringColumn(_bp_grp_nm10_lcl5);
	
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
	 * 地域名. Region name.<p>
	 *
	 */
	public static final String $area_nm = "area_nm";
	private static final MCPermColumnInfo _area_nm = createColumnInfo("area_nm");
	public final MCStringPermColumn area_nm = createStringColumn(_area_nm);
	
	/**
	 * 地域名（ロケール１）. Region name (Locale 1).<p>
	 *
	 */
	public static final String $area_nm_lcl1 = "area_nm_lcl1";
	private static final MCPermColumnInfo _area_nm_lcl1 = createColumnInfo("area_nm_lcl1");
	public final MCStringPermColumn area_nm_lcl1 = createStringColumn(_area_nm_lcl1);
	
	/**
	 * 地域名（ロケール２）. Region name (Locale 2).<p>
	 *
	 */
	public static final String $area_nm_lcl2 = "area_nm_lcl2";
	private static final MCPermColumnInfo _area_nm_lcl2 = createColumnInfo("area_nm_lcl2");
	public final MCStringPermColumn area_nm_lcl2 = createStringColumn(_area_nm_lcl2);
	
	/**
	 * 地域名（ロケール３）. Region name (Locale 3).<p>
	 *
	 */
	public static final String $area_nm_lcl3 = "area_nm_lcl3";
	private static final MCPermColumnInfo _area_nm_lcl3 = createColumnInfo("area_nm_lcl3");
	public final MCStringPermColumn area_nm_lcl3 = createStringColumn(_area_nm_lcl3);
	
	/**
	 * 地域名（ロケール４）. Region name (Locale 4).<p>
	 *
	 */
	public static final String $area_nm_lcl4 = "area_nm_lcl4";
	private static final MCPermColumnInfo _area_nm_lcl4 = createColumnInfo("area_nm_lcl4");
	public final MCStringPermColumn area_nm_lcl4 = createStringColumn(_area_nm_lcl4);
	
	/**
	 * 地域名（ロケール５）. Region name (Locale 5).<p>
	 *
	 */
	public static final String $area_nm_lcl5 = "area_nm_lcl5";
	private static final MCPermColumnInfo _area_nm_lcl5 = createColumnInfo("area_nm_lcl5");
	public final MCStringPermColumn area_nm_lcl5 = createStringColumn(_area_nm_lcl5);
	
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
	 * メモ４. Memo 4.<p>
	 *
	 */
	public static final String $memo4 = "memo4";
	private static final MCPermColumnInfo _memo4 = createColumnInfo("memo4");
	public final MCStringPermColumn memo4 = createStringColumn(_memo4);
	
	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public static final String $memo5 = "memo5";
	private static final MCPermColumnInfo _memo5 = createColumnInfo("memo5");
	public final MCStringPermColumn memo5 = createStringColumn(_memo5);
	
	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public static final String $memo6 = "memo6";
	private static final MCPermColumnInfo _memo6 = createColumnInfo("memo6");
	public final MCStringPermColumn memo6 = createStringColumn(_memo6);
	
	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public static final String $memo7 = "memo7";
	private static final MCPermColumnInfo _memo7 = createColumnInfo("memo7");
	public final MCStringPermColumn memo7 = createStringColumn(_memo7);
	
	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public static final String $memo8 = "memo8";
	private static final MCPermColumnInfo _memo8 = createColumnInfo("memo8");
	public final MCStringPermColumn memo8 = createStringColumn(_memo8);
	
	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public static final String $memo9 = "memo9";
	private static final MCPermColumnInfo _memo9 = createColumnInfo("memo9");
	public final MCStringPermColumn memo9 = createStringColumn(_memo9);
	
	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public static final String $memo10 = "memo10";
	private static final MCPermColumnInfo _memo10 = createColumnInfo("memo10");
	public final MCStringPermColumn memo10 = createStringColumn(_memo10);
	
	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public static final String $memo11 = "memo11";
	private static final MCPermColumnInfo _memo11 = createColumnInfo("memo11");
	public final MCStringPermColumn memo11 = createStringColumn(_memo11);
	
	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public static final String $memo12 = "memo12";
	private static final MCPermColumnInfo _memo12 = createColumnInfo("memo12");
	public final MCStringPermColumn memo12 = createStringColumn(_memo12);
	
	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public static final String $memo13 = "memo13";
	private static final MCPermColumnInfo _memo13 = createColumnInfo("memo13");
	public final MCStringPermColumn memo13 = createStringColumn(_memo13);
	
	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public static final String $memo14 = "memo14";
	private static final MCPermColumnInfo _memo14 = createColumnInfo("memo14");
	public final MCStringPermColumn memo14 = createStringColumn(_memo14);
	
	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public static final String $memo15 = "memo15";
	private static final MCPermColumnInfo _memo15 = createColumnInfo("memo15");
	public final MCStringPermColumn memo15 = createStringColumn(_memo15);
	
	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public static final String $memo16 = "memo16";
	private static final MCPermColumnInfo _memo16 = createColumnInfo("memo16");
	public final MCStringPermColumn memo16 = createStringColumn(_memo16);
	
	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public static final String $memo17 = "memo17";
	private static final MCPermColumnInfo _memo17 = createColumnInfo("memo17");
	public final MCStringPermColumn memo17 = createStringColumn(_memo17);
	
	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public static final String $memo18 = "memo18";
	private static final MCPermColumnInfo _memo18 = createColumnInfo("memo18");
	public final MCStringPermColumn memo18 = createStringColumn(_memo18);
	
	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public static final String $memo19 = "memo19";
	private static final MCPermColumnInfo _memo19 = createColumnInfo("memo19");
	public final MCStringPermColumn memo19 = createStringColumn(_memo19);
	
	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public static final String $memo20 = "memo20";
	private static final MCPermColumnInfo _memo20 = createColumnInfo("memo20");
	public final MCStringPermColumn memo20 = createStringColumn(_memo20);
	
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_nm_lcl1_META = createCommonMeta($bp_nm_lcl1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_nm_lcl2_META = createCommonMeta($bp_nm_lcl2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_nm_lcl3_META = createCommonMeta($bp_nm_lcl3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_nm_lcl4_META = createCommonMeta($bp_nm_lcl4, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_nm_lcl5_META = createCommonMeta($bp_nm_lcl5, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_grp_nm1_META = createCommonMeta($bp_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm1_lcl1_META = createCommonMeta($bp_grp_nm1_lcl1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm1_lcl2_META = createCommonMeta($bp_grp_nm1_lcl2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm1_lcl3_META = createCommonMeta($bp_grp_nm1_lcl3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm1_lcl4_META = createCommonMeta($bp_grp_nm1_lcl4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm1_lcl5_META = createCommonMeta($bp_grp_nm1_lcl5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm2_META = createCommonMeta($bp_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm2_lcl1_META = createCommonMeta($bp_grp_nm2_lcl1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm2_lcl2_META = createCommonMeta($bp_grp_nm2_lcl2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm2_lcl3_META = createCommonMeta($bp_grp_nm2_lcl3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm2_lcl4_META = createCommonMeta($bp_grp_nm2_lcl4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm2_lcl5_META = createCommonMeta($bp_grp_nm2_lcl5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm3_META = createCommonMeta($bp_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm3_lcl1_META = createCommonMeta($bp_grp_nm3_lcl1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm3_lcl2_META = createCommonMeta($bp_grp_nm3_lcl2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm3_lcl3_META = createCommonMeta($bp_grp_nm3_lcl3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm3_lcl4_META = createCommonMeta($bp_grp_nm3_lcl4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm3_lcl5_META = createCommonMeta($bp_grp_nm3_lcl5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm4_META = createCommonMeta($bp_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm4_lcl1_META = createCommonMeta($bp_grp_nm4_lcl1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm4_lcl2_META = createCommonMeta($bp_grp_nm4_lcl2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm4_lcl3_META = createCommonMeta($bp_grp_nm4_lcl3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm4_lcl4_META = createCommonMeta($bp_grp_nm4_lcl4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm4_lcl5_META = createCommonMeta($bp_grp_nm4_lcl5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm5_META = createCommonMeta($bp_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm5_lcl1_META = createCommonMeta($bp_grp_nm5_lcl1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm5_lcl2_META = createCommonMeta($bp_grp_nm5_lcl2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm5_lcl3_META = createCommonMeta($bp_grp_nm5_lcl3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm5_lcl4_META = createCommonMeta($bp_grp_nm5_lcl4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm5_lcl5_META = createCommonMeta($bp_grp_nm5_lcl5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm6_META = createCommonMeta($bp_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm6_lcl1_META = createCommonMeta($bp_grp_nm6_lcl1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm6_lcl2_META = createCommonMeta($bp_grp_nm6_lcl2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm6_lcl3_META = createCommonMeta($bp_grp_nm6_lcl3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm6_lcl4_META = createCommonMeta($bp_grp_nm6_lcl4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm6_lcl5_META = createCommonMeta($bp_grp_nm6_lcl5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm7_META = createCommonMeta($bp_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm7_lcl1_META = createCommonMeta($bp_grp_nm7_lcl1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm7_lcl2_META = createCommonMeta($bp_grp_nm7_lcl2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm7_lcl3_META = createCommonMeta($bp_grp_nm7_lcl3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm7_lcl4_META = createCommonMeta($bp_grp_nm7_lcl4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm7_lcl5_META = createCommonMeta($bp_grp_nm7_lcl5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm8_META = createCommonMeta($bp_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm8_lcl1_META = createCommonMeta($bp_grp_nm8_lcl1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm8_lcl2_META = createCommonMeta($bp_grp_nm8_lcl2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm8_lcl3_META = createCommonMeta($bp_grp_nm8_lcl3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm8_lcl4_META = createCommonMeta($bp_grp_nm8_lcl4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm8_lcl5_META = createCommonMeta($bp_grp_nm8_lcl5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm9_META = createCommonMeta($bp_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm9_lcl1_META = createCommonMeta($bp_grp_nm9_lcl1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm9_lcl2_META = createCommonMeta($bp_grp_nm9_lcl2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm9_lcl3_META = createCommonMeta($bp_grp_nm9_lcl3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm9_lcl4_META = createCommonMeta($bp_grp_nm9_lcl4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm9_lcl5_META = createCommonMeta($bp_grp_nm9_lcl5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm10_META = createCommonMeta($bp_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm10_lcl1_META = createCommonMeta($bp_grp_nm10_lcl1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm10_lcl2_META = createCommonMeta($bp_grp_nm10_lcl2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm10_lcl3_META = createCommonMeta($bp_grp_nm10_lcl3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm10_lcl4_META = createCommonMeta($bp_grp_nm10_lcl4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_nm10_lcl5_META = createCommonMeta($bp_grp_nm10_lcl5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_nm_lcl1_META = createCommonMeta($cntry_nm_lcl1, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_nm_lcl2_META = createCommonMeta($cntry_nm_lcl2, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_nm_lcl3_META = createCommonMeta($cntry_nm_lcl3, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_nm_lcl4_META = createCommonMeta($cntry_nm_lcl4, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_nm_lcl5_META = createCommonMeta($cntry_nm_lcl5, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta area_nm_lcl1_META = createCommonMeta($area_nm_lcl1, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta area_nm_lcl2_META = createCommonMeta($area_nm_lcl2, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta area_nm_lcl3_META = createCommonMeta($area_nm_lcl3, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta area_nm_lcl4_META = createCommonMeta($area_nm_lcl4, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta area_nm_lcl5_META = createCommonMeta($area_nm_lcl5, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta memo4_META = createCommonMeta($memo4, mcframe.commonMA.meta.MA_META.MST_MEMO4);
	public static final MCMeta memo5_META = createCommonMeta($memo5, mcframe.commonMA.meta.MA_META.MST_MEMO5);
	public static final MCMeta memo6_META = createCommonMeta($memo6, mcframe.commonMA.meta.MA_META.MST_MEMO6);
	public static final MCMeta memo7_META = createCommonMeta($memo7, mcframe.commonMA.meta.MA_META.MST_MEMO7);
	public static final MCMeta memo8_META = createCommonMeta($memo8, mcframe.commonMA.meta.MA_META.MST_MEMO8);
	public static final MCMeta memo9_META = createCommonMeta($memo9, mcframe.commonMA.meta.MA_META.MST_MEMO9);
	public static final MCMeta memo10_META = createCommonMeta($memo10, mcframe.commonMA.meta.MA_META.MST_MEMO10);
	public static final MCMeta memo11_META = createCommonMeta($memo11, mcframe.commonMA.meta.MA_META.MST_MEMO11);
	public static final MCMeta memo12_META = createCommonMeta($memo12, mcframe.commonMA.meta.MA_META.MST_MEMO12);
	public static final MCMeta memo13_META = createCommonMeta($memo13, mcframe.commonMA.meta.MA_META.MST_MEMO13);
	public static final MCMeta memo14_META = createCommonMeta($memo14, mcframe.commonMA.meta.MA_META.MST_MEMO14);
	public static final MCMeta memo15_META = createCommonMeta($memo15, mcframe.commonMA.meta.MA_META.MST_MEMO15);
	public static final MCMeta memo16_META = createCommonMeta($memo16, mcframe.commonMA.meta.MA_META.MST_MEMO16);
	public static final MCMeta memo17_META = createCommonMeta($memo17, mcframe.commonMA.meta.MA_META.MST_MEMO17);
	public static final MCMeta memo18_META = createCommonMeta($memo18, mcframe.commonMA.meta.MA_META.MST_MEMO18);
	public static final MCMeta memo19_META = createCommonMeta($memo19, mcframe.commonMA.meta.MA_META.MST_MEMO19);
	public static final MCMeta memo20_META = createCommonMeta($memo20, mcframe.commonMA.meta.MA_META.MST_MEMO20);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_BP_IF_ALL_R> constMetas = new ConstMetaList<MAVM_BP_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			bp_cd_META,
			bp_nm_META,
			bp_nm_lcl1_META,
			bp_nm_lcl2_META,
			bp_nm_lcl3_META,
			bp_nm_lcl4_META,
			bp_nm_lcl5_META,
			bp_grp_nm1_META,
			bp_grp_nm1_lcl1_META,
			bp_grp_nm1_lcl2_META,
			bp_grp_nm1_lcl3_META,
			bp_grp_nm1_lcl4_META,
			bp_grp_nm1_lcl5_META,
			bp_grp_nm2_META,
			bp_grp_nm2_lcl1_META,
			bp_grp_nm2_lcl2_META,
			bp_grp_nm2_lcl3_META,
			bp_grp_nm2_lcl4_META,
			bp_grp_nm2_lcl5_META,
			bp_grp_nm3_META,
			bp_grp_nm3_lcl1_META,
			bp_grp_nm3_lcl2_META,
			bp_grp_nm3_lcl3_META,
			bp_grp_nm3_lcl4_META,
			bp_grp_nm3_lcl5_META,
			bp_grp_nm4_META,
			bp_grp_nm4_lcl1_META,
			bp_grp_nm4_lcl2_META,
			bp_grp_nm4_lcl3_META,
			bp_grp_nm4_lcl4_META,
			bp_grp_nm4_lcl5_META,
			bp_grp_nm5_META,
			bp_grp_nm5_lcl1_META,
			bp_grp_nm5_lcl2_META,
			bp_grp_nm5_lcl3_META,
			bp_grp_nm5_lcl4_META,
			bp_grp_nm5_lcl5_META,
			bp_grp_nm6_META,
			bp_grp_nm6_lcl1_META,
			bp_grp_nm6_lcl2_META,
			bp_grp_nm6_lcl3_META,
			bp_grp_nm6_lcl4_META,
			bp_grp_nm6_lcl5_META,
			bp_grp_nm7_META,
			bp_grp_nm7_lcl1_META,
			bp_grp_nm7_lcl2_META,
			bp_grp_nm7_lcl3_META,
			bp_grp_nm7_lcl4_META,
			bp_grp_nm7_lcl5_META,
			bp_grp_nm8_META,
			bp_grp_nm8_lcl1_META,
			bp_grp_nm8_lcl2_META,
			bp_grp_nm8_lcl3_META,
			bp_grp_nm8_lcl4_META,
			bp_grp_nm8_lcl5_META,
			bp_grp_nm9_META,
			bp_grp_nm9_lcl1_META,
			bp_grp_nm9_lcl2_META,
			bp_grp_nm9_lcl3_META,
			bp_grp_nm9_lcl4_META,
			bp_grp_nm9_lcl5_META,
			bp_grp_nm10_META,
			bp_grp_nm10_lcl1_META,
			bp_grp_nm10_lcl2_META,
			bp_grp_nm10_lcl3_META,
			bp_grp_nm10_lcl4_META,
			bp_grp_nm10_lcl5_META,
			cntry_nm_META,
			cntry_nm_lcl1_META,
			cntry_nm_lcl2_META,
			cntry_nm_lcl3_META,
			cntry_nm_lcl4_META,
			cntry_nm_lcl5_META,
			area_nm_META,
			area_nm_lcl1_META,
			area_nm_lcl2_META,
			area_nm_lcl3_META,
			area_nm_lcl4_META,
			area_nm_lcl5_META,
			memo1_META,
			memo2_META,
			memo3_META,
			memo4_META,
			memo5_META,
			memo6_META,
			memo7_META,
			memo8_META,
			memo9_META,
			memo10_META,
			memo11_META,
			memo12_META,
			memo13_META,
			memo14_META,
			memo15_META,
			memo16_META,
			memo17_META,
			memo18_META,
			memo19_META,
			memo20_META
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
	protected MAVM_BP_IF_ALL_R(ConstMetaList<? extends MAVM_BP_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_BP_IF_ALL_R(ConstMetaList<? extends MAVM_BP_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$co_cd,
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
			MAVM_BP_IF_ALL_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_cd,
				"bp_cd",
				bp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_nm,
				"bp_nm",
				bp_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_nm_lcl1,
				"bp_nm_lcl1",
				bp_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_nm_lcl2,
				"bp_nm_lcl2",
				bp_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_nm_lcl3,
				"bp_nm_lcl3",
				bp_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_nm_lcl4,
				"bp_nm_lcl4",
				bp_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_nm_lcl5,
				"bp_nm_lcl5",
				bp_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm1,
				"bp_grp_nm1",
				bp_grp_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm1_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm1_lcl1,
				"bp_grp_nm1_lcl1",
				bp_grp_nm1_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm1_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm1_lcl2,
				"bp_grp_nm1_lcl2",
				bp_grp_nm1_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm1_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm1_lcl3,
				"bp_grp_nm1_lcl3",
				bp_grp_nm1_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm1_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm1_lcl4,
				"bp_grp_nm1_lcl4",
				bp_grp_nm1_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm1_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm1_lcl5,
				"bp_grp_nm1_lcl5",
				bp_grp_nm1_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm2,
				"bp_grp_nm2",
				bp_grp_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm2_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm2_lcl1,
				"bp_grp_nm2_lcl1",
				bp_grp_nm2_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm2_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm2_lcl2,
				"bp_grp_nm2_lcl2",
				bp_grp_nm2_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm2_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm2_lcl3,
				"bp_grp_nm2_lcl3",
				bp_grp_nm2_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm2_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm2_lcl4,
				"bp_grp_nm2_lcl4",
				bp_grp_nm2_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm2_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm2_lcl5,
				"bp_grp_nm2_lcl5",
				bp_grp_nm2_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm3,
				"bp_grp_nm3",
				bp_grp_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm3_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm3_lcl1,
				"bp_grp_nm3_lcl1",
				bp_grp_nm3_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm3_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm3_lcl2,
				"bp_grp_nm3_lcl2",
				bp_grp_nm3_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm3_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm3_lcl3,
				"bp_grp_nm3_lcl3",
				bp_grp_nm3_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm3_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm3_lcl4,
				"bp_grp_nm3_lcl4",
				bp_grp_nm3_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm3_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm3_lcl5,
				"bp_grp_nm3_lcl5",
				bp_grp_nm3_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm4,
				"bp_grp_nm4",
				bp_grp_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm4_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm4_lcl1,
				"bp_grp_nm4_lcl1",
				bp_grp_nm4_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm4_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm4_lcl2,
				"bp_grp_nm4_lcl2",
				bp_grp_nm4_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm4_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm4_lcl3,
				"bp_grp_nm4_lcl3",
				bp_grp_nm4_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm4_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm4_lcl4,
				"bp_grp_nm4_lcl4",
				bp_grp_nm4_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm4_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm4_lcl5,
				"bp_grp_nm4_lcl5",
				bp_grp_nm4_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm5,
				"bp_grp_nm5",
				bp_grp_nm5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm5_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm5_lcl1,
				"bp_grp_nm5_lcl1",
				bp_grp_nm5_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm5_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm5_lcl2,
				"bp_grp_nm5_lcl2",
				bp_grp_nm5_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm5_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm5_lcl3,
				"bp_grp_nm5_lcl3",
				bp_grp_nm5_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm5_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm5_lcl4,
				"bp_grp_nm5_lcl4",
				bp_grp_nm5_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm5_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm5_lcl5,
				"bp_grp_nm5_lcl5",
				bp_grp_nm5_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm6,
				"bp_grp_nm6",
				bp_grp_nm6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm6_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm6_lcl1,
				"bp_grp_nm6_lcl1",
				bp_grp_nm6_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm6_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm6_lcl2,
				"bp_grp_nm6_lcl2",
				bp_grp_nm6_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm6_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm6_lcl3,
				"bp_grp_nm6_lcl3",
				bp_grp_nm6_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm6_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm6_lcl4,
				"bp_grp_nm6_lcl4",
				bp_grp_nm6_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm6_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm6_lcl5,
				"bp_grp_nm6_lcl5",
				bp_grp_nm6_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm7,
				"bp_grp_nm7",
				bp_grp_nm7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm7_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm7_lcl1,
				"bp_grp_nm7_lcl1",
				bp_grp_nm7_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm7_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm7_lcl2,
				"bp_grp_nm7_lcl2",
				bp_grp_nm7_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm7_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm7_lcl3,
				"bp_grp_nm7_lcl3",
				bp_grp_nm7_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm7_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm7_lcl4,
				"bp_grp_nm7_lcl4",
				bp_grp_nm7_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm7_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm7_lcl5,
				"bp_grp_nm7_lcl5",
				bp_grp_nm7_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm8,
				"bp_grp_nm8",
				bp_grp_nm8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm8_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm8_lcl1,
				"bp_grp_nm8_lcl1",
				bp_grp_nm8_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm8_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm8_lcl2,
				"bp_grp_nm8_lcl2",
				bp_grp_nm8_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm8_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm8_lcl3,
				"bp_grp_nm8_lcl3",
				bp_grp_nm8_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm8_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm8_lcl4,
				"bp_grp_nm8_lcl4",
				bp_grp_nm8_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm8_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm8_lcl5,
				"bp_grp_nm8_lcl5",
				bp_grp_nm8_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm9,
				"bp_grp_nm9",
				bp_grp_nm9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm9_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm9_lcl1,
				"bp_grp_nm9_lcl1",
				bp_grp_nm9_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm9_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm9_lcl2,
				"bp_grp_nm9_lcl2",
				bp_grp_nm9_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm9_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm9_lcl3,
				"bp_grp_nm9_lcl3",
				bp_grp_nm9_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm9_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm9_lcl4,
				"bp_grp_nm9_lcl4",
				bp_grp_nm9_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm9_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm9_lcl5,
				"bp_grp_nm9_lcl5",
				bp_grp_nm9_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm10,
				"bp_grp_nm10",
				bp_grp_nm10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm10_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm10_lcl1,
				"bp_grp_nm10_lcl1",
				bp_grp_nm10_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm10_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm10_lcl2,
				"bp_grp_nm10_lcl2",
				bp_grp_nm10_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm10_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm10_lcl3,
				"bp_grp_nm10_lcl3",
				bp_grp_nm10_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm10_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm10_lcl4,
				"bp_grp_nm10_lcl4",
				bp_grp_nm10_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$bp_grp_nm10_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$bp_grp_nm10_lcl5,
				"bp_grp_nm10_lcl5",
				bp_grp_nm10_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$cntry_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$cntry_nm,
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
			MAVM_BP_IF_ALL_R.$cntry_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$cntry_nm_lcl1,
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
			MAVM_BP_IF_ALL_R.$cntry_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$cntry_nm_lcl2,
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
			MAVM_BP_IF_ALL_R.$cntry_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$cntry_nm_lcl3,
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
			MAVM_BP_IF_ALL_R.$cntry_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$cntry_nm_lcl4,
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
			MAVM_BP_IF_ALL_R.$cntry_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$cntry_nm_lcl5,
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
			MAVM_BP_IF_ALL_R.$area_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$area_nm,
				"area_nm",
				area_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$area_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$area_nm_lcl1,
				"area_nm_lcl1",
				area_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$area_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$area_nm_lcl2,
				"area_nm_lcl2",
				area_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$area_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$area_nm_lcl3,
				"area_nm_lcl3",
				area_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$area_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$area_nm_lcl4,
				"area_nm_lcl4",
				area_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$area_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$area_nm_lcl5,
				"area_nm_lcl5",
				area_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo1,
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
			MAVM_BP_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo2,
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
			MAVM_BP_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo3,
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
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo4,
				"memo4",
				memo4,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo5,
				"memo5",
				memo5,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo6,
				"memo6",
				memo6,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo7,
				"memo7",
				memo7,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo8,
				"memo8",
				memo8,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo9,
				"memo9",
				memo9,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo10,
				"memo10",
				memo10,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo11,
				"memo11",
				memo11,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo12,
				"memo12",
				memo12,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo13,
				"memo13",
				memo13,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo14,
				"memo14",
				memo14,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo15,
				"memo15",
				memo15,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo16,
				"memo16",
				memo16,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo17,
				"memo17",
				memo17,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo18,
				"memo18",
				memo18,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo19,
				"memo19",
				memo19,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BP_IF_ALL_R.$memo20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BP_IF_ALL_R.$memo20,
				"memo20",
				memo20,
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
	public static MAVM_BP_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_BP_IF_ALL_R create(String alias) {
		MAVM_BP_IF_ALL_R row = new MAVM_BP_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_BP_IF_ALL_R createByName(T proto) {
		MAVM_BP_IF_ALL_R row = MAVM_BP_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_BP_IF_ALL_R clone() {
		return (MAVM_BP_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_BP_IF_ALL_R createInstance() {
		return (MAVM_BP_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_BP_IF_ALL_R getValues(String... names) {
		return (MAVM_BP_IF_ALL_R) super.getValues(names);
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
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 1, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 1, $bp_cd, value);
	}

	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 2, $bp_nm);
	}

	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 2, $bp_nm, value);
	}

	/**
	 * 取引先名（ロケール１）. BP name (Locale 1).<p>
	 *
	 */
	public String bp_nm_lcl1() {
		return getConstString(offset + 3, $bp_nm_lcl1);
	}

	/**
	 * 取引先名（ロケール１）. BP name (Locale 1).<p>
	 *
	 */
	public void bp_nm_lcl1(String value) {
		setConstString(offset + 3, $bp_nm_lcl1, value);
	}

	/**
	 * 取引先名（ロケール２）. BP name (Locale 2).<p>
	 *
	 */
	public String bp_nm_lcl2() {
		return getConstString(offset + 4, $bp_nm_lcl2);
	}

	/**
	 * 取引先名（ロケール２）. BP name (Locale 2).<p>
	 *
	 */
	public void bp_nm_lcl2(String value) {
		setConstString(offset + 4, $bp_nm_lcl2, value);
	}

	/**
	 * 取引先名（ロケール３）. BP name (Locale 3).<p>
	 *
	 */
	public String bp_nm_lcl3() {
		return getConstString(offset + 5, $bp_nm_lcl3);
	}

	/**
	 * 取引先名（ロケール３）. BP name (Locale 3).<p>
	 *
	 */
	public void bp_nm_lcl3(String value) {
		setConstString(offset + 5, $bp_nm_lcl3, value);
	}

	/**
	 * 取引先名（ロケール４）. BP name (Locale 4).<p>
	 *
	 */
	public String bp_nm_lcl4() {
		return getConstString(offset + 6, $bp_nm_lcl4);
	}

	/**
	 * 取引先名（ロケール４）. BP name (Locale 4).<p>
	 *
	 */
	public void bp_nm_lcl4(String value) {
		setConstString(offset + 6, $bp_nm_lcl4, value);
	}

	/**
	 * 取引先名（ロケール５）. BP name (Locale 5).<p>
	 *
	 */
	public String bp_nm_lcl5() {
		return getConstString(offset + 7, $bp_nm_lcl5);
	}

	/**
	 * 取引先名（ロケール５）. BP name (Locale 5).<p>
	 *
	 */
	public void bp_nm_lcl5(String value) {
		setConstString(offset + 7, $bp_nm_lcl5, value);
	}

	/**
	 * 取引先分類名１. BP classification name 1.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return getConstString(offset + 8, $bp_grp_nm1);
	}

	/**
	 * 取引先分類名１. BP classification name 1.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		setConstString(offset + 8, $bp_grp_nm1, value);
	}

	/**
	 * 取引先分類名１（ロケール１）. BP classification name 1 (Locale 1).<p>
	 *
	 */
	public String bp_grp_nm1_lcl1() {
		return getConstString(offset + 9, $bp_grp_nm1_lcl1);
	}

	/**
	 * 取引先分類名１（ロケール１）. BP classification name 1 (Locale 1).<p>
	 *
	 */
	public void bp_grp_nm1_lcl1(String value) {
		setConstString(offset + 9, $bp_grp_nm1_lcl1, value);
	}

	/**
	 * 取引先分類名１（ロケール２）. BP classification name 1 (Locale 2).<p>
	 *
	 */
	public String bp_grp_nm1_lcl2() {
		return getConstString(offset + 10, $bp_grp_nm1_lcl2);
	}

	/**
	 * 取引先分類名１（ロケール２）. BP classification name 1 (Locale 2).<p>
	 *
	 */
	public void bp_grp_nm1_lcl2(String value) {
		setConstString(offset + 10, $bp_grp_nm1_lcl2, value);
	}

	/**
	 * 取引先分類名１（ロケール３）. BP classification name 1 (Locale 3).<p>
	 *
	 */
	public String bp_grp_nm1_lcl3() {
		return getConstString(offset + 11, $bp_grp_nm1_lcl3);
	}

	/**
	 * 取引先分類名１（ロケール３）. BP classification name 1 (Locale 3).<p>
	 *
	 */
	public void bp_grp_nm1_lcl3(String value) {
		setConstString(offset + 11, $bp_grp_nm1_lcl3, value);
	}

	/**
	 * 取引先分類名１（ロケール４）. BP classification name 1 (Locale 4).<p>
	 *
	 */
	public String bp_grp_nm1_lcl4() {
		return getConstString(offset + 12, $bp_grp_nm1_lcl4);
	}

	/**
	 * 取引先分類名１（ロケール４）. BP classification name 1 (Locale 4).<p>
	 *
	 */
	public void bp_grp_nm1_lcl4(String value) {
		setConstString(offset + 12, $bp_grp_nm1_lcl4, value);
	}

	/**
	 * 取引先分類名１（ロケール５）. BP classification name 1 (Locale 5).<p>
	 *
	 */
	public String bp_grp_nm1_lcl5() {
		return getConstString(offset + 13, $bp_grp_nm1_lcl5);
	}

	/**
	 * 取引先分類名１（ロケール５）. BP classification name 1 (Locale 5).<p>
	 *
	 */
	public void bp_grp_nm1_lcl5(String value) {
		setConstString(offset + 13, $bp_grp_nm1_lcl5, value);
	}

	/**
	 * 取引先分類名２. BP classification name 2.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return getConstString(offset + 14, $bp_grp_nm2);
	}

	/**
	 * 取引先分類名２. BP classification name 2.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		setConstString(offset + 14, $bp_grp_nm2, value);
	}

	/**
	 * 取引先分類名２（ロケール１）. BP classification name 2 (Locale 1).<p>
	 *
	 */
	public String bp_grp_nm2_lcl1() {
		return getConstString(offset + 15, $bp_grp_nm2_lcl1);
	}

	/**
	 * 取引先分類名２（ロケール１）. BP classification name 2 (Locale 1).<p>
	 *
	 */
	public void bp_grp_nm2_lcl1(String value) {
		setConstString(offset + 15, $bp_grp_nm2_lcl1, value);
	}

	/**
	 * 取引先分類名２（ロケール２）. BP classification name 2 (Locale 2).<p>
	 *
	 */
	public String bp_grp_nm2_lcl2() {
		return getConstString(offset + 16, $bp_grp_nm2_lcl2);
	}

	/**
	 * 取引先分類名２（ロケール２）. BP classification name 2 (Locale 2).<p>
	 *
	 */
	public void bp_grp_nm2_lcl2(String value) {
		setConstString(offset + 16, $bp_grp_nm2_lcl2, value);
	}

	/**
	 * 取引先分類名２（ロケール３）. BP classification name 2 (Locale 3).<p>
	 *
	 */
	public String bp_grp_nm2_lcl3() {
		return getConstString(offset + 17, $bp_grp_nm2_lcl3);
	}

	/**
	 * 取引先分類名２（ロケール３）. BP classification name 2 (Locale 3).<p>
	 *
	 */
	public void bp_grp_nm2_lcl3(String value) {
		setConstString(offset + 17, $bp_grp_nm2_lcl3, value);
	}

	/**
	 * 取引先分類名２（ロケール４）. BP classification name 2 (Locale 4).<p>
	 *
	 */
	public String bp_grp_nm2_lcl4() {
		return getConstString(offset + 18, $bp_grp_nm2_lcl4);
	}

	/**
	 * 取引先分類名２（ロケール４）. BP classification name 2 (Locale 4).<p>
	 *
	 */
	public void bp_grp_nm2_lcl4(String value) {
		setConstString(offset + 18, $bp_grp_nm2_lcl4, value);
	}

	/**
	 * 取引先分類名２（ロケール５）. BP classification name 2 (Locale 5).<p>
	 *
	 */
	public String bp_grp_nm2_lcl5() {
		return getConstString(offset + 19, $bp_grp_nm2_lcl5);
	}

	/**
	 * 取引先分類名２（ロケール５）. BP classification name 2 (Locale 5).<p>
	 *
	 */
	public void bp_grp_nm2_lcl5(String value) {
		setConstString(offset + 19, $bp_grp_nm2_lcl5, value);
	}

	/**
	 * 取引先分類名３. BP classification name 3.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return getConstString(offset + 20, $bp_grp_nm3);
	}

	/**
	 * 取引先分類名３. BP classification name 3.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		setConstString(offset + 20, $bp_grp_nm3, value);
	}

	/**
	 * 取引先分類名３（ロケール１）. BP classification name 3 (Locale 1).<p>
	 *
	 */
	public String bp_grp_nm3_lcl1() {
		return getConstString(offset + 21, $bp_grp_nm3_lcl1);
	}

	/**
	 * 取引先分類名３（ロケール１）. BP classification name 3 (Locale 1).<p>
	 *
	 */
	public void bp_grp_nm3_lcl1(String value) {
		setConstString(offset + 21, $bp_grp_nm3_lcl1, value);
	}

	/**
	 * 取引先分類名３（ロケール２）. BP classification name 3 (Locale 2).<p>
	 *
	 */
	public String bp_grp_nm3_lcl2() {
		return getConstString(offset + 22, $bp_grp_nm3_lcl2);
	}

	/**
	 * 取引先分類名３（ロケール２）. BP classification name 3 (Locale 2).<p>
	 *
	 */
	public void bp_grp_nm3_lcl2(String value) {
		setConstString(offset + 22, $bp_grp_nm3_lcl2, value);
	}

	/**
	 * 取引先分類名３（ロケール３）. BP classification name 3 (Locale 3).<p>
	 *
	 */
	public String bp_grp_nm3_lcl3() {
		return getConstString(offset + 23, $bp_grp_nm3_lcl3);
	}

	/**
	 * 取引先分類名３（ロケール３）. BP classification name 3 (Locale 3).<p>
	 *
	 */
	public void bp_grp_nm3_lcl3(String value) {
		setConstString(offset + 23, $bp_grp_nm3_lcl3, value);
	}

	/**
	 * 取引先分類名３（ロケール４）. BP classification name 3 (Locale 4).<p>
	 *
	 */
	public String bp_grp_nm3_lcl4() {
		return getConstString(offset + 24, $bp_grp_nm3_lcl4);
	}

	/**
	 * 取引先分類名３（ロケール４）. BP classification name 3 (Locale 4).<p>
	 *
	 */
	public void bp_grp_nm3_lcl4(String value) {
		setConstString(offset + 24, $bp_grp_nm3_lcl4, value);
	}

	/**
	 * 取引先分類名３（ロケール５）. BP classification name 3 (Locale 5).<p>
	 *
	 */
	public String bp_grp_nm3_lcl5() {
		return getConstString(offset + 25, $bp_grp_nm3_lcl5);
	}

	/**
	 * 取引先分類名３（ロケール５）. BP classification name 3 (Locale 5).<p>
	 *
	 */
	public void bp_grp_nm3_lcl5(String value) {
		setConstString(offset + 25, $bp_grp_nm3_lcl5, value);
	}

	/**
	 * 取引先分類名４. BP classification name 4.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return getConstString(offset + 26, $bp_grp_nm4);
	}

	/**
	 * 取引先分類名４. BP classification name 4.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		setConstString(offset + 26, $bp_grp_nm4, value);
	}

	/**
	 * 取引先分類名４（ロケール１）. BP classification name 4 (Locale 1).<p>
	 *
	 */
	public String bp_grp_nm4_lcl1() {
		return getConstString(offset + 27, $bp_grp_nm4_lcl1);
	}

	/**
	 * 取引先分類名４（ロケール１）. BP classification name 4 (Locale 1).<p>
	 *
	 */
	public void bp_grp_nm4_lcl1(String value) {
		setConstString(offset + 27, $bp_grp_nm4_lcl1, value);
	}

	/**
	 * 取引先分類名４（ロケール２）. BP classification name 4 (Locale 2).<p>
	 *
	 */
	public String bp_grp_nm4_lcl2() {
		return getConstString(offset + 28, $bp_grp_nm4_lcl2);
	}

	/**
	 * 取引先分類名４（ロケール２）. BP classification name 4 (Locale 2).<p>
	 *
	 */
	public void bp_grp_nm4_lcl2(String value) {
		setConstString(offset + 28, $bp_grp_nm4_lcl2, value);
	}

	/**
	 * 取引先分類名４（ロケール３）. BP classification name 4 (Locale 3).<p>
	 *
	 */
	public String bp_grp_nm4_lcl3() {
		return getConstString(offset + 29, $bp_grp_nm4_lcl3);
	}

	/**
	 * 取引先分類名４（ロケール３）. BP classification name 4 (Locale 3).<p>
	 *
	 */
	public void bp_grp_nm4_lcl3(String value) {
		setConstString(offset + 29, $bp_grp_nm4_lcl3, value);
	}

	/**
	 * 取引先分類名４（ロケール４）. BP classification name 4 (Locale 4).<p>
	 *
	 */
	public String bp_grp_nm4_lcl4() {
		return getConstString(offset + 30, $bp_grp_nm4_lcl4);
	}

	/**
	 * 取引先分類名４（ロケール４）. BP classification name 4 (Locale 4).<p>
	 *
	 */
	public void bp_grp_nm4_lcl4(String value) {
		setConstString(offset + 30, $bp_grp_nm4_lcl4, value);
	}

	/**
	 * 取引先分類名４（ロケール５）. BP classification name 4 (Locale 5).<p>
	 *
	 */
	public String bp_grp_nm4_lcl5() {
		return getConstString(offset + 31, $bp_grp_nm4_lcl5);
	}

	/**
	 * 取引先分類名４（ロケール５）. BP classification name 4 (Locale 5).<p>
	 *
	 */
	public void bp_grp_nm4_lcl5(String value) {
		setConstString(offset + 31, $bp_grp_nm4_lcl5, value);
	}

	/**
	 * 取引先分類名５. BP classification name 5.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return getConstString(offset + 32, $bp_grp_nm5);
	}

	/**
	 * 取引先分類名５. BP classification name 5.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		setConstString(offset + 32, $bp_grp_nm5, value);
	}

	/**
	 * 取引先分類名５（ロケール１）. BP classification name 5 (Locale 1).<p>
	 *
	 */
	public String bp_grp_nm5_lcl1() {
		return getConstString(offset + 33, $bp_grp_nm5_lcl1);
	}

	/**
	 * 取引先分類名５（ロケール１）. BP classification name 5 (Locale 1).<p>
	 *
	 */
	public void bp_grp_nm5_lcl1(String value) {
		setConstString(offset + 33, $bp_grp_nm5_lcl1, value);
	}

	/**
	 * 取引先分類名５（ロケール２）. BP classification name 5 (Locale 2).<p>
	 *
	 */
	public String bp_grp_nm5_lcl2() {
		return getConstString(offset + 34, $bp_grp_nm5_lcl2);
	}

	/**
	 * 取引先分類名５（ロケール２）. BP classification name 5 (Locale 2).<p>
	 *
	 */
	public void bp_grp_nm5_lcl2(String value) {
		setConstString(offset + 34, $bp_grp_nm5_lcl2, value);
	}

	/**
	 * 取引先分類名５（ロケール３）. BP classification name 5 (Locale 3).<p>
	 *
	 */
	public String bp_grp_nm5_lcl3() {
		return getConstString(offset + 35, $bp_grp_nm5_lcl3);
	}

	/**
	 * 取引先分類名５（ロケール３）. BP classification name 5 (Locale 3).<p>
	 *
	 */
	public void bp_grp_nm5_lcl3(String value) {
		setConstString(offset + 35, $bp_grp_nm5_lcl3, value);
	}

	/**
	 * 取引先分類名５（ロケール４）. BP classification name 5 (Locale 4).<p>
	 *
	 */
	public String bp_grp_nm5_lcl4() {
		return getConstString(offset + 36, $bp_grp_nm5_lcl4);
	}

	/**
	 * 取引先分類名５（ロケール４）. BP classification name 5 (Locale 4).<p>
	 *
	 */
	public void bp_grp_nm5_lcl4(String value) {
		setConstString(offset + 36, $bp_grp_nm5_lcl4, value);
	}

	/**
	 * 取引先分類名５（ロケール５）. BP classification name 5 (Locale 5).<p>
	 *
	 */
	public String bp_grp_nm5_lcl5() {
		return getConstString(offset + 37, $bp_grp_nm5_lcl5);
	}

	/**
	 * 取引先分類名５（ロケール５）. BP classification name 5 (Locale 5).<p>
	 *
	 */
	public void bp_grp_nm5_lcl5(String value) {
		setConstString(offset + 37, $bp_grp_nm5_lcl5, value);
	}

	/**
	 * 取引先分類名６. BP classification name 6.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return getConstString(offset + 38, $bp_grp_nm6);
	}

	/**
	 * 取引先分類名６. BP classification name 6.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		setConstString(offset + 38, $bp_grp_nm6, value);
	}

	/**
	 * 取引先分類名６（ロケール１）. BP classification name 6 (Locale 1).<p>
	 *
	 */
	public String bp_grp_nm6_lcl1() {
		return getConstString(offset + 39, $bp_grp_nm6_lcl1);
	}

	/**
	 * 取引先分類名６（ロケール１）. BP classification name 6 (Locale 1).<p>
	 *
	 */
	public void bp_grp_nm6_lcl1(String value) {
		setConstString(offset + 39, $bp_grp_nm6_lcl1, value);
	}

	/**
	 * 取引先分類名６（ロケール２）. BP classification name 6 (Locale 2).<p>
	 *
	 */
	public String bp_grp_nm6_lcl2() {
		return getConstString(offset + 40, $bp_grp_nm6_lcl2);
	}

	/**
	 * 取引先分類名６（ロケール２）. BP classification name 6 (Locale 2).<p>
	 *
	 */
	public void bp_grp_nm6_lcl2(String value) {
		setConstString(offset + 40, $bp_grp_nm6_lcl2, value);
	}

	/**
	 * 取引先分類名６（ロケール３）. BP classification name 6 (Locale 3).<p>
	 *
	 */
	public String bp_grp_nm6_lcl3() {
		return getConstString(offset + 41, $bp_grp_nm6_lcl3);
	}

	/**
	 * 取引先分類名６（ロケール３）. BP classification name 6 (Locale 3).<p>
	 *
	 */
	public void bp_grp_nm6_lcl3(String value) {
		setConstString(offset + 41, $bp_grp_nm6_lcl3, value);
	}

	/**
	 * 取引先分類名６（ロケール４）. BP classification name 6 (Locale 4).<p>
	 *
	 */
	public String bp_grp_nm6_lcl4() {
		return getConstString(offset + 42, $bp_grp_nm6_lcl4);
	}

	/**
	 * 取引先分類名６（ロケール４）. BP classification name 6 (Locale 4).<p>
	 *
	 */
	public void bp_grp_nm6_lcl4(String value) {
		setConstString(offset + 42, $bp_grp_nm6_lcl4, value);
	}

	/**
	 * 取引先分類名６（ロケール５）. BP classification name 6 (Locale 5).<p>
	 *
	 */
	public String bp_grp_nm6_lcl5() {
		return getConstString(offset + 43, $bp_grp_nm6_lcl5);
	}

	/**
	 * 取引先分類名６（ロケール５）. BP classification name 6 (Locale 5).<p>
	 *
	 */
	public void bp_grp_nm6_lcl5(String value) {
		setConstString(offset + 43, $bp_grp_nm6_lcl5, value);
	}

	/**
	 * 取引先分類名７. BP classification name 7.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return getConstString(offset + 44, $bp_grp_nm7);
	}

	/**
	 * 取引先分類名７. BP classification name 7.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		setConstString(offset + 44, $bp_grp_nm7, value);
	}

	/**
	 * 取引先分類名７（ロケール１）. BP classification name 7 (Locale 1).<p>
	 *
	 */
	public String bp_grp_nm7_lcl1() {
		return getConstString(offset + 45, $bp_grp_nm7_lcl1);
	}

	/**
	 * 取引先分類名７（ロケール１）. BP classification name 7 (Locale 1).<p>
	 *
	 */
	public void bp_grp_nm7_lcl1(String value) {
		setConstString(offset + 45, $bp_grp_nm7_lcl1, value);
	}

	/**
	 * 取引先分類名７（ロケール２）. BP classification name 7 (Locale 2).<p>
	 *
	 */
	public String bp_grp_nm7_lcl2() {
		return getConstString(offset + 46, $bp_grp_nm7_lcl2);
	}

	/**
	 * 取引先分類名７（ロケール２）. BP classification name 7 (Locale 2).<p>
	 *
	 */
	public void bp_grp_nm7_lcl2(String value) {
		setConstString(offset + 46, $bp_grp_nm7_lcl2, value);
	}

	/**
	 * 取引先分類名７（ロケール３）. BP classification name 7 (Locale 3).<p>
	 *
	 */
	public String bp_grp_nm7_lcl3() {
		return getConstString(offset + 47, $bp_grp_nm7_lcl3);
	}

	/**
	 * 取引先分類名７（ロケール３）. BP classification name 7 (Locale 3).<p>
	 *
	 */
	public void bp_grp_nm7_lcl3(String value) {
		setConstString(offset + 47, $bp_grp_nm7_lcl3, value);
	}

	/**
	 * 取引先分類名７（ロケール４）. BP classification name 7 (Locale 4).<p>
	 *
	 */
	public String bp_grp_nm7_lcl4() {
		return getConstString(offset + 48, $bp_grp_nm7_lcl4);
	}

	/**
	 * 取引先分類名７（ロケール４）. BP classification name 7 (Locale 4).<p>
	 *
	 */
	public void bp_grp_nm7_lcl4(String value) {
		setConstString(offset + 48, $bp_grp_nm7_lcl4, value);
	}

	/**
	 * 取引先分類名７（ロケール５）. BP classification name 7 (Locale 5).<p>
	 *
	 */
	public String bp_grp_nm7_lcl5() {
		return getConstString(offset + 49, $bp_grp_nm7_lcl5);
	}

	/**
	 * 取引先分類名７（ロケール５）. BP classification name 7 (Locale 5).<p>
	 *
	 */
	public void bp_grp_nm7_lcl5(String value) {
		setConstString(offset + 49, $bp_grp_nm7_lcl5, value);
	}

	/**
	 * 取引先分類名８. BP classification name 8.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return getConstString(offset + 50, $bp_grp_nm8);
	}

	/**
	 * 取引先分類名８. BP classification name 8.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		setConstString(offset + 50, $bp_grp_nm8, value);
	}

	/**
	 * 取引先分類名８（ロケール１）. BP classification name 8 (Locale 1).<p>
	 *
	 */
	public String bp_grp_nm8_lcl1() {
		return getConstString(offset + 51, $bp_grp_nm8_lcl1);
	}

	/**
	 * 取引先分類名８（ロケール１）. BP classification name 8 (Locale 1).<p>
	 *
	 */
	public void bp_grp_nm8_lcl1(String value) {
		setConstString(offset + 51, $bp_grp_nm8_lcl1, value);
	}

	/**
	 * 取引先分類名８（ロケール２）. BP classification name 8 (Locale 2).<p>
	 *
	 */
	public String bp_grp_nm8_lcl2() {
		return getConstString(offset + 52, $bp_grp_nm8_lcl2);
	}

	/**
	 * 取引先分類名８（ロケール２）. BP classification name 8 (Locale 2).<p>
	 *
	 */
	public void bp_grp_nm8_lcl2(String value) {
		setConstString(offset + 52, $bp_grp_nm8_lcl2, value);
	}

	/**
	 * 取引先分類名８（ロケール３）. BP classification name 8 (Locale 3).<p>
	 *
	 */
	public String bp_grp_nm8_lcl3() {
		return getConstString(offset + 53, $bp_grp_nm8_lcl3);
	}

	/**
	 * 取引先分類名８（ロケール３）. BP classification name 8 (Locale 3).<p>
	 *
	 */
	public void bp_grp_nm8_lcl3(String value) {
		setConstString(offset + 53, $bp_grp_nm8_lcl3, value);
	}

	/**
	 * 取引先分類名８（ロケール４）. BP classification name 8 (Locale 4).<p>
	 *
	 */
	public String bp_grp_nm8_lcl4() {
		return getConstString(offset + 54, $bp_grp_nm8_lcl4);
	}

	/**
	 * 取引先分類名８（ロケール４）. BP classification name 8 (Locale 4).<p>
	 *
	 */
	public void bp_grp_nm8_lcl4(String value) {
		setConstString(offset + 54, $bp_grp_nm8_lcl4, value);
	}

	/**
	 * 取引先分類名８（ロケール５）. BP classification name 8 (Locale 5).<p>
	 *
	 */
	public String bp_grp_nm8_lcl5() {
		return getConstString(offset + 55, $bp_grp_nm8_lcl5);
	}

	/**
	 * 取引先分類名８（ロケール５）. BP classification name 8 (Locale 5).<p>
	 *
	 */
	public void bp_grp_nm8_lcl5(String value) {
		setConstString(offset + 55, $bp_grp_nm8_lcl5, value);
	}

	/**
	 * 取引先分類名９. BP classification name 9.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return getConstString(offset + 56, $bp_grp_nm9);
	}

	/**
	 * 取引先分類名９. BP classification name 9.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		setConstString(offset + 56, $bp_grp_nm9, value);
	}

	/**
	 * 取引先分類名９（ロケール１）. BP classification name 9 (Locale 1).<p>
	 *
	 */
	public String bp_grp_nm9_lcl1() {
		return getConstString(offset + 57, $bp_grp_nm9_lcl1);
	}

	/**
	 * 取引先分類名９（ロケール１）. BP classification name 9 (Locale 1).<p>
	 *
	 */
	public void bp_grp_nm9_lcl1(String value) {
		setConstString(offset + 57, $bp_grp_nm9_lcl1, value);
	}

	/**
	 * 取引先分類名９（ロケール２）. BP classification name 9 (Locale 2).<p>
	 *
	 */
	public String bp_grp_nm9_lcl2() {
		return getConstString(offset + 58, $bp_grp_nm9_lcl2);
	}

	/**
	 * 取引先分類名９（ロケール２）. BP classification name 9 (Locale 2).<p>
	 *
	 */
	public void bp_grp_nm9_lcl2(String value) {
		setConstString(offset + 58, $bp_grp_nm9_lcl2, value);
	}

	/**
	 * 取引先分類名９（ロケール３）. BP classification name 9 (Locale 3).<p>
	 *
	 */
	public String bp_grp_nm9_lcl3() {
		return getConstString(offset + 59, $bp_grp_nm9_lcl3);
	}

	/**
	 * 取引先分類名９（ロケール３）. BP classification name 9 (Locale 3).<p>
	 *
	 */
	public void bp_grp_nm9_lcl3(String value) {
		setConstString(offset + 59, $bp_grp_nm9_lcl3, value);
	}

	/**
	 * 取引先分類名９（ロケール４）. BP classification name 9 (Locale 4).<p>
	 *
	 */
	public String bp_grp_nm9_lcl4() {
		return getConstString(offset + 60, $bp_grp_nm9_lcl4);
	}

	/**
	 * 取引先分類名９（ロケール４）. BP classification name 9 (Locale 4).<p>
	 *
	 */
	public void bp_grp_nm9_lcl4(String value) {
		setConstString(offset + 60, $bp_grp_nm9_lcl4, value);
	}

	/**
	 * 取引先分類名９（ロケール５）. BP classification name 9 (Locale 5).<p>
	 *
	 */
	public String bp_grp_nm9_lcl5() {
		return getConstString(offset + 61, $bp_grp_nm9_lcl5);
	}

	/**
	 * 取引先分類名９（ロケール５）. BP classification name 9 (Locale 5).<p>
	 *
	 */
	public void bp_grp_nm9_lcl5(String value) {
		setConstString(offset + 61, $bp_grp_nm9_lcl5, value);
	}

	/**
	 * 取引先分類名１０. BP classification name 10.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return getConstString(offset + 62, $bp_grp_nm10);
	}

	/**
	 * 取引先分類名１０. BP classification name 10.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		setConstString(offset + 62, $bp_grp_nm10, value);
	}

	/**
	 * 取引先分類名１０（ロケール１）. BP classification name 10 (Locale 1).<p>
	 *
	 */
	public String bp_grp_nm10_lcl1() {
		return getConstString(offset + 63, $bp_grp_nm10_lcl1);
	}

	/**
	 * 取引先分類名１０（ロケール１）. BP classification name 10 (Locale 1).<p>
	 *
	 */
	public void bp_grp_nm10_lcl1(String value) {
		setConstString(offset + 63, $bp_grp_nm10_lcl1, value);
	}

	/**
	 * 取引先分類名１０（ロケール２）. BP classification name 10 (Locale 2).<p>
	 *
	 */
	public String bp_grp_nm10_lcl2() {
		return getConstString(offset + 64, $bp_grp_nm10_lcl2);
	}

	/**
	 * 取引先分類名１０（ロケール２）. BP classification name 10 (Locale 2).<p>
	 *
	 */
	public void bp_grp_nm10_lcl2(String value) {
		setConstString(offset + 64, $bp_grp_nm10_lcl2, value);
	}

	/**
	 * 取引先分類名１０（ロケール３）. BP classification name 10 (Locale 3).<p>
	 *
	 */
	public String bp_grp_nm10_lcl3() {
		return getConstString(offset + 65, $bp_grp_nm10_lcl3);
	}

	/**
	 * 取引先分類名１０（ロケール３）. BP classification name 10 (Locale 3).<p>
	 *
	 */
	public void bp_grp_nm10_lcl3(String value) {
		setConstString(offset + 65, $bp_grp_nm10_lcl3, value);
	}

	/**
	 * 取引先分類名１０（ロケール４）. BP classification name 10 (Locale 4).<p>
	 *
	 */
	public String bp_grp_nm10_lcl4() {
		return getConstString(offset + 66, $bp_grp_nm10_lcl4);
	}

	/**
	 * 取引先分類名１０（ロケール４）. BP classification name 10 (Locale 4).<p>
	 *
	 */
	public void bp_grp_nm10_lcl4(String value) {
		setConstString(offset + 66, $bp_grp_nm10_lcl4, value);
	}

	/**
	 * 取引先分類名１０（ロケール５）. BP classification name 10 (Locale 5).<p>
	 *
	 */
	public String bp_grp_nm10_lcl5() {
		return getConstString(offset + 67, $bp_grp_nm10_lcl5);
	}

	/**
	 * 取引先分類名１０（ロケール５）. BP classification name 10 (Locale 5).<p>
	 *
	 */
	public void bp_grp_nm10_lcl5(String value) {
		setConstString(offset + 67, $bp_grp_nm10_lcl5, value);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 68, $cntry_nm);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 68, $cntry_nm, value);
	}

	/**
	 * 国名（ロケール１）. Country name (Locale 1).<p>
	 *
	 */
	public String cntry_nm_lcl1() {
		return getConstString(offset + 69, $cntry_nm_lcl1);
	}

	/**
	 * 国名（ロケール１）. Country name (Locale 1).<p>
	 *
	 */
	public void cntry_nm_lcl1(String value) {
		setConstString(offset + 69, $cntry_nm_lcl1, value);
	}

	/**
	 * 国名（ロケール２）. Country name (Locale 2).<p>
	 *
	 */
	public String cntry_nm_lcl2() {
		return getConstString(offset + 70, $cntry_nm_lcl2);
	}

	/**
	 * 国名（ロケール２）. Country name (Locale 2).<p>
	 *
	 */
	public void cntry_nm_lcl2(String value) {
		setConstString(offset + 70, $cntry_nm_lcl2, value);
	}

	/**
	 * 国名（ロケール３）. Country name (Locale 3).<p>
	 *
	 */
	public String cntry_nm_lcl3() {
		return getConstString(offset + 71, $cntry_nm_lcl3);
	}

	/**
	 * 国名（ロケール３）. Country name (Locale 3).<p>
	 *
	 */
	public void cntry_nm_lcl3(String value) {
		setConstString(offset + 71, $cntry_nm_lcl3, value);
	}

	/**
	 * 国名（ロケール４）. Country name (Locale 4).<p>
	 *
	 */
	public String cntry_nm_lcl4() {
		return getConstString(offset + 72, $cntry_nm_lcl4);
	}

	/**
	 * 国名（ロケール４）. Country name (Locale 4).<p>
	 *
	 */
	public void cntry_nm_lcl4(String value) {
		setConstString(offset + 72, $cntry_nm_lcl4, value);
	}

	/**
	 * 国名（ロケール５）. Country name (Locale 5).<p>
	 *
	 */
	public String cntry_nm_lcl5() {
		return getConstString(offset + 73, $cntry_nm_lcl5);
	}

	/**
	 * 国名（ロケール５）. Country name (Locale 5).<p>
	 *
	 */
	public void cntry_nm_lcl5(String value) {
		setConstString(offset + 73, $cntry_nm_lcl5, value);
	}

	/**
	 * 地域名. Region name.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 74, $area_nm);
	}

	/**
	 * 地域名. Region name.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 74, $area_nm, value);
	}

	/**
	 * 地域名（ロケール１）. Region name (Locale 1).<p>
	 *
	 */
	public String area_nm_lcl1() {
		return getConstString(offset + 75, $area_nm_lcl1);
	}

	/**
	 * 地域名（ロケール１）. Region name (Locale 1).<p>
	 *
	 */
	public void area_nm_lcl1(String value) {
		setConstString(offset + 75, $area_nm_lcl1, value);
	}

	/**
	 * 地域名（ロケール２）. Region name (Locale 2).<p>
	 *
	 */
	public String area_nm_lcl2() {
		return getConstString(offset + 76, $area_nm_lcl2);
	}

	/**
	 * 地域名（ロケール２）. Region name (Locale 2).<p>
	 *
	 */
	public void area_nm_lcl2(String value) {
		setConstString(offset + 76, $area_nm_lcl2, value);
	}

	/**
	 * 地域名（ロケール３）. Region name (Locale 3).<p>
	 *
	 */
	public String area_nm_lcl3() {
		return getConstString(offset + 77, $area_nm_lcl3);
	}

	/**
	 * 地域名（ロケール３）. Region name (Locale 3).<p>
	 *
	 */
	public void area_nm_lcl3(String value) {
		setConstString(offset + 77, $area_nm_lcl3, value);
	}

	/**
	 * 地域名（ロケール４）. Region name (Locale 4).<p>
	 *
	 */
	public String area_nm_lcl4() {
		return getConstString(offset + 78, $area_nm_lcl4);
	}

	/**
	 * 地域名（ロケール４）. Region name (Locale 4).<p>
	 *
	 */
	public void area_nm_lcl4(String value) {
		setConstString(offset + 78, $area_nm_lcl4, value);
	}

	/**
	 * 地域名（ロケール５）. Region name (Locale 5).<p>
	 *
	 */
	public String area_nm_lcl5() {
		return getConstString(offset + 79, $area_nm_lcl5);
	}

	/**
	 * 地域名（ロケール５）. Region name (Locale 5).<p>
	 *
	 */
	public void area_nm_lcl5(String value) {
		setConstString(offset + 79, $area_nm_lcl5, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 80, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 80, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 81, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 81, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 82, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 82, $memo3, value);
	}

	/**
	 * メモ４. Memo 4.<p>
	 *
	 */
	public String memo4() {
		return getConstString(offset + 83, $memo4);
	}

	/**
	 * メモ４. Memo 4.<p>
	 *
	 */
	public void memo4(String value) {
		setConstString(offset + 83, $memo4, value);
	}

	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public String memo5() {
		return getConstString(offset + 84, $memo5);
	}

	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public void memo5(String value) {
		setConstString(offset + 84, $memo5, value);
	}

	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public String memo6() {
		return getConstString(offset + 85, $memo6);
	}

	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public void memo6(String value) {
		setConstString(offset + 85, $memo6, value);
	}

	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public String memo7() {
		return getConstString(offset + 86, $memo7);
	}

	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public void memo7(String value) {
		setConstString(offset + 86, $memo7, value);
	}

	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public String memo8() {
		return getConstString(offset + 87, $memo8);
	}

	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public void memo8(String value) {
		setConstString(offset + 87, $memo8, value);
	}

	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public String memo9() {
		return getConstString(offset + 88, $memo9);
	}

	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public void memo9(String value) {
		setConstString(offset + 88, $memo9, value);
	}

	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public String memo10() {
		return getConstString(offset + 89, $memo10);
	}

	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public void memo10(String value) {
		setConstString(offset + 89, $memo10, value);
	}

	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public String memo11() {
		return getConstString(offset + 90, $memo11);
	}

	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public void memo11(String value) {
		setConstString(offset + 90, $memo11, value);
	}

	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public String memo12() {
		return getConstString(offset + 91, $memo12);
	}

	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public void memo12(String value) {
		setConstString(offset + 91, $memo12, value);
	}

	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public String memo13() {
		return getConstString(offset + 92, $memo13);
	}

	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public void memo13(String value) {
		setConstString(offset + 92, $memo13, value);
	}

	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public String memo14() {
		return getConstString(offset + 93, $memo14);
	}

	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public void memo14(String value) {
		setConstString(offset + 93, $memo14, value);
	}

	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public String memo15() {
		return getConstString(offset + 94, $memo15);
	}

	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public void memo15(String value) {
		setConstString(offset + 94, $memo15, value);
	}

	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public String memo16() {
		return getConstString(offset + 95, $memo16);
	}

	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public void memo16(String value) {
		setConstString(offset + 95, $memo16, value);
	}

	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public String memo17() {
		return getConstString(offset + 96, $memo17);
	}

	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public void memo17(String value) {
		setConstString(offset + 96, $memo17, value);
	}

	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public String memo18() {
		return getConstString(offset + 97, $memo18);
	}

	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public void memo18(String value) {
		setConstString(offset + 97, $memo18, value);
	}

	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public String memo19() {
		return getConstString(offset + 98, $memo19);
	}

	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public void memo19(String value) {
		setConstString(offset + 98, $memo19, value);
	}

	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public String memo20() {
		return getConstString(offset + 99, $memo20);
	}

	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public void memo20(String value) {
		setConstString(offset + 99, $memo20, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_nm_lcl1.equalsIgnoreCase(name)) {
			return bp_nm_lcl1();
		}
		if ($bp_nm_lcl2.equalsIgnoreCase(name)) {
			return bp_nm_lcl2();
		}
		if ($bp_nm_lcl3.equalsIgnoreCase(name)) {
			return bp_nm_lcl3();
		}
		if ($bp_nm_lcl4.equalsIgnoreCase(name)) {
			return bp_nm_lcl4();
		}
		if ($bp_nm_lcl5.equalsIgnoreCase(name)) {
			return bp_nm_lcl5();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_nm1_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm1_lcl1();
		}
		if ($bp_grp_nm1_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm1_lcl2();
		}
		if ($bp_grp_nm1_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm1_lcl3();
		}
		if ($bp_grp_nm1_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm1_lcl4();
		}
		if ($bp_grp_nm1_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm1_lcl5();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_nm2_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm2_lcl1();
		}
		if ($bp_grp_nm2_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm2_lcl2();
		}
		if ($bp_grp_nm2_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm2_lcl3();
		}
		if ($bp_grp_nm2_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm2_lcl4();
		}
		if ($bp_grp_nm2_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm2_lcl5();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_nm3_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm3_lcl1();
		}
		if ($bp_grp_nm3_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm3_lcl2();
		}
		if ($bp_grp_nm3_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm3_lcl3();
		}
		if ($bp_grp_nm3_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm3_lcl4();
		}
		if ($bp_grp_nm3_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm3_lcl5();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_nm4_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm4_lcl1();
		}
		if ($bp_grp_nm4_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm4_lcl2();
		}
		if ($bp_grp_nm4_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm4_lcl3();
		}
		if ($bp_grp_nm4_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm4_lcl4();
		}
		if ($bp_grp_nm4_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm4_lcl5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_nm5_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm5_lcl1();
		}
		if ($bp_grp_nm5_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm5_lcl2();
		}
		if ($bp_grp_nm5_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm5_lcl3();
		}
		if ($bp_grp_nm5_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm5_lcl4();
		}
		if ($bp_grp_nm5_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm5_lcl5();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_nm6_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm6_lcl1();
		}
		if ($bp_grp_nm6_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm6_lcl2();
		}
		if ($bp_grp_nm6_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm6_lcl3();
		}
		if ($bp_grp_nm6_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm6_lcl4();
		}
		if ($bp_grp_nm6_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm6_lcl5();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_nm7_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm7_lcl1();
		}
		if ($bp_grp_nm7_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm7_lcl2();
		}
		if ($bp_grp_nm7_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm7_lcl3();
		}
		if ($bp_grp_nm7_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm7_lcl4();
		}
		if ($bp_grp_nm7_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm7_lcl5();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_nm8_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm8_lcl1();
		}
		if ($bp_grp_nm8_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm8_lcl2();
		}
		if ($bp_grp_nm8_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm8_lcl3();
		}
		if ($bp_grp_nm8_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm8_lcl4();
		}
		if ($bp_grp_nm8_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm8_lcl5();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_nm9_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm9_lcl1();
		}
		if ($bp_grp_nm9_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm9_lcl2();
		}
		if ($bp_grp_nm9_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm9_lcl3();
		}
		if ($bp_grp_nm9_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm9_lcl4();
		}
		if ($bp_grp_nm9_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm9_lcl5();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		if ($bp_grp_nm10_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm10_lcl1();
		}
		if ($bp_grp_nm10_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm10_lcl2();
		}
		if ($bp_grp_nm10_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm10_lcl3();
		}
		if ($bp_grp_nm10_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm10_lcl4();
		}
		if ($bp_grp_nm10_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm10_lcl5();
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
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($area_nm_lcl1.equalsIgnoreCase(name)) {
			return area_nm_lcl1();
		}
		if ($area_nm_lcl2.equalsIgnoreCase(name)) {
			return area_nm_lcl2();
		}
		if ($area_nm_lcl3.equalsIgnoreCase(name)) {
			return area_nm_lcl3();
		}
		if ($area_nm_lcl4.equalsIgnoreCase(name)) {
			return area_nm_lcl4();
		}
		if ($area_nm_lcl5.equalsIgnoreCase(name)) {
			return area_nm_lcl5();
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
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_nm_lcl1.equalsIgnoreCase(name)) {
			return bp_nm_lcl1();
		}
		if ($bp_nm_lcl2.equalsIgnoreCase(name)) {
			return bp_nm_lcl2();
		}
		if ($bp_nm_lcl3.equalsIgnoreCase(name)) {
			return bp_nm_lcl3();
		}
		if ($bp_nm_lcl4.equalsIgnoreCase(name)) {
			return bp_nm_lcl4();
		}
		if ($bp_nm_lcl5.equalsIgnoreCase(name)) {
			return bp_nm_lcl5();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_nm1_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm1_lcl1();
		}
		if ($bp_grp_nm1_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm1_lcl2();
		}
		if ($bp_grp_nm1_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm1_lcl3();
		}
		if ($bp_grp_nm1_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm1_lcl4();
		}
		if ($bp_grp_nm1_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm1_lcl5();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_nm2_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm2_lcl1();
		}
		if ($bp_grp_nm2_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm2_lcl2();
		}
		if ($bp_grp_nm2_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm2_lcl3();
		}
		if ($bp_grp_nm2_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm2_lcl4();
		}
		if ($bp_grp_nm2_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm2_lcl5();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_nm3_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm3_lcl1();
		}
		if ($bp_grp_nm3_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm3_lcl2();
		}
		if ($bp_grp_nm3_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm3_lcl3();
		}
		if ($bp_grp_nm3_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm3_lcl4();
		}
		if ($bp_grp_nm3_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm3_lcl5();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_nm4_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm4_lcl1();
		}
		if ($bp_grp_nm4_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm4_lcl2();
		}
		if ($bp_grp_nm4_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm4_lcl3();
		}
		if ($bp_grp_nm4_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm4_lcl4();
		}
		if ($bp_grp_nm4_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm4_lcl5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_nm5_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm5_lcl1();
		}
		if ($bp_grp_nm5_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm5_lcl2();
		}
		if ($bp_grp_nm5_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm5_lcl3();
		}
		if ($bp_grp_nm5_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm5_lcl4();
		}
		if ($bp_grp_nm5_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm5_lcl5();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_nm6_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm6_lcl1();
		}
		if ($bp_grp_nm6_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm6_lcl2();
		}
		if ($bp_grp_nm6_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm6_lcl3();
		}
		if ($bp_grp_nm6_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm6_lcl4();
		}
		if ($bp_grp_nm6_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm6_lcl5();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_nm7_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm7_lcl1();
		}
		if ($bp_grp_nm7_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm7_lcl2();
		}
		if ($bp_grp_nm7_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm7_lcl3();
		}
		if ($bp_grp_nm7_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm7_lcl4();
		}
		if ($bp_grp_nm7_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm7_lcl5();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_nm8_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm8_lcl1();
		}
		if ($bp_grp_nm8_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm8_lcl2();
		}
		if ($bp_grp_nm8_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm8_lcl3();
		}
		if ($bp_grp_nm8_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm8_lcl4();
		}
		if ($bp_grp_nm8_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm8_lcl5();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_nm9_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm9_lcl1();
		}
		if ($bp_grp_nm9_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm9_lcl2();
		}
		if ($bp_grp_nm9_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm9_lcl3();
		}
		if ($bp_grp_nm9_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm9_lcl4();
		}
		if ($bp_grp_nm9_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm9_lcl5();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		if ($bp_grp_nm10_lcl1.equalsIgnoreCase(name)) {
			return bp_grp_nm10_lcl1();
		}
		if ($bp_grp_nm10_lcl2.equalsIgnoreCase(name)) {
			return bp_grp_nm10_lcl2();
		}
		if ($bp_grp_nm10_lcl3.equalsIgnoreCase(name)) {
			return bp_grp_nm10_lcl3();
		}
		if ($bp_grp_nm10_lcl4.equalsIgnoreCase(name)) {
			return bp_grp_nm10_lcl4();
		}
		if ($bp_grp_nm10_lcl5.equalsIgnoreCase(name)) {
			return bp_grp_nm10_lcl5();
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
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($area_nm_lcl1.equalsIgnoreCase(name)) {
			return area_nm_lcl1();
		}
		if ($area_nm_lcl2.equalsIgnoreCase(name)) {
			return area_nm_lcl2();
		}
		if ($area_nm_lcl3.equalsIgnoreCase(name)) {
			return area_nm_lcl3();
		}
		if ($area_nm_lcl4.equalsIgnoreCase(name)) {
			return area_nm_lcl4();
		}
		if ($area_nm_lcl5.equalsIgnoreCase(name)) {
			return area_nm_lcl5();
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
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_nm_lcl1.equalsIgnoreCase(name)) {
			bp_nm_lcl1(value);
			return;
		}
		if ($bp_nm_lcl2.equalsIgnoreCase(name)) {
			bp_nm_lcl2(value);
			return;
		}
		if ($bp_nm_lcl3.equalsIgnoreCase(name)) {
			bp_nm_lcl3(value);
			return;
		}
		if ($bp_nm_lcl4.equalsIgnoreCase(name)) {
			bp_nm_lcl4(value);
			return;
		}
		if ($bp_nm_lcl5.equalsIgnoreCase(name)) {
			bp_nm_lcl5(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_nm1_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm1_lcl1(value);
			return;
		}
		if ($bp_grp_nm1_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm1_lcl2(value);
			return;
		}
		if ($bp_grp_nm1_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm1_lcl3(value);
			return;
		}
		if ($bp_grp_nm1_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm1_lcl4(value);
			return;
		}
		if ($bp_grp_nm1_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm1_lcl5(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_nm2_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm2_lcl1(value);
			return;
		}
		if ($bp_grp_nm2_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm2_lcl2(value);
			return;
		}
		if ($bp_grp_nm2_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm2_lcl3(value);
			return;
		}
		if ($bp_grp_nm2_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm2_lcl4(value);
			return;
		}
		if ($bp_grp_nm2_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm2_lcl5(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_nm3_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm3_lcl1(value);
			return;
		}
		if ($bp_grp_nm3_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm3_lcl2(value);
			return;
		}
		if ($bp_grp_nm3_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm3_lcl3(value);
			return;
		}
		if ($bp_grp_nm3_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm3_lcl4(value);
			return;
		}
		if ($bp_grp_nm3_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm3_lcl5(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_nm4_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm4_lcl1(value);
			return;
		}
		if ($bp_grp_nm4_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm4_lcl2(value);
			return;
		}
		if ($bp_grp_nm4_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm4_lcl3(value);
			return;
		}
		if ($bp_grp_nm4_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm4_lcl4(value);
			return;
		}
		if ($bp_grp_nm4_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm4_lcl5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_nm5_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm5_lcl1(value);
			return;
		}
		if ($bp_grp_nm5_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm5_lcl2(value);
			return;
		}
		if ($bp_grp_nm5_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm5_lcl3(value);
			return;
		}
		if ($bp_grp_nm5_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm5_lcl4(value);
			return;
		}
		if ($bp_grp_nm5_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm5_lcl5(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_nm6_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm6_lcl1(value);
			return;
		}
		if ($bp_grp_nm6_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm6_lcl2(value);
			return;
		}
		if ($bp_grp_nm6_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm6_lcl3(value);
			return;
		}
		if ($bp_grp_nm6_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm6_lcl4(value);
			return;
		}
		if ($bp_grp_nm6_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm6_lcl5(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_nm7_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm7_lcl1(value);
			return;
		}
		if ($bp_grp_nm7_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm7_lcl2(value);
			return;
		}
		if ($bp_grp_nm7_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm7_lcl3(value);
			return;
		}
		if ($bp_grp_nm7_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm7_lcl4(value);
			return;
		}
		if ($bp_grp_nm7_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm7_lcl5(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_nm8_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm8_lcl1(value);
			return;
		}
		if ($bp_grp_nm8_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm8_lcl2(value);
			return;
		}
		if ($bp_grp_nm8_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm8_lcl3(value);
			return;
		}
		if ($bp_grp_nm8_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm8_lcl4(value);
			return;
		}
		if ($bp_grp_nm8_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm8_lcl5(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_nm9_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm9_lcl1(value);
			return;
		}
		if ($bp_grp_nm9_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm9_lcl2(value);
			return;
		}
		if ($bp_grp_nm9_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm9_lcl3(value);
			return;
		}
		if ($bp_grp_nm9_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm9_lcl4(value);
			return;
		}
		if ($bp_grp_nm9_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm9_lcl5(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		if ($bp_grp_nm10_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm10_lcl1(value);
			return;
		}
		if ($bp_grp_nm10_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm10_lcl2(value);
			return;
		}
		if ($bp_grp_nm10_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm10_lcl3(value);
			return;
		}
		if ($bp_grp_nm10_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm10_lcl4(value);
			return;
		}
		if ($bp_grp_nm10_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm10_lcl5(value);
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
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($area_nm_lcl1.equalsIgnoreCase(name)) {
			area_nm_lcl1(value);
			return;
		}
		if ($area_nm_lcl2.equalsIgnoreCase(name)) {
			area_nm_lcl2(value);
			return;
		}
		if ($area_nm_lcl3.equalsIgnoreCase(name)) {
			area_nm_lcl3(value);
			return;
		}
		if ($area_nm_lcl4.equalsIgnoreCase(name)) {
			area_nm_lcl4(value);
			return;
		}
		if ($area_nm_lcl5.equalsIgnoreCase(name)) {
			area_nm_lcl5(value);
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
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_nm_lcl1.equalsIgnoreCase(name)) {
			bp_nm_lcl1(value);
			return;
		}
		if ($bp_nm_lcl2.equalsIgnoreCase(name)) {
			bp_nm_lcl2(value);
			return;
		}
		if ($bp_nm_lcl3.equalsIgnoreCase(name)) {
			bp_nm_lcl3(value);
			return;
		}
		if ($bp_nm_lcl4.equalsIgnoreCase(name)) {
			bp_nm_lcl4(value);
			return;
		}
		if ($bp_nm_lcl5.equalsIgnoreCase(name)) {
			bp_nm_lcl5(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_nm1_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm1_lcl1(value);
			return;
		}
		if ($bp_grp_nm1_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm1_lcl2(value);
			return;
		}
		if ($bp_grp_nm1_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm1_lcl3(value);
			return;
		}
		if ($bp_grp_nm1_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm1_lcl4(value);
			return;
		}
		if ($bp_grp_nm1_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm1_lcl5(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_nm2_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm2_lcl1(value);
			return;
		}
		if ($bp_grp_nm2_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm2_lcl2(value);
			return;
		}
		if ($bp_grp_nm2_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm2_lcl3(value);
			return;
		}
		if ($bp_grp_nm2_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm2_lcl4(value);
			return;
		}
		if ($bp_grp_nm2_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm2_lcl5(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_nm3_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm3_lcl1(value);
			return;
		}
		if ($bp_grp_nm3_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm3_lcl2(value);
			return;
		}
		if ($bp_grp_nm3_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm3_lcl3(value);
			return;
		}
		if ($bp_grp_nm3_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm3_lcl4(value);
			return;
		}
		if ($bp_grp_nm3_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm3_lcl5(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_nm4_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm4_lcl1(value);
			return;
		}
		if ($bp_grp_nm4_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm4_lcl2(value);
			return;
		}
		if ($bp_grp_nm4_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm4_lcl3(value);
			return;
		}
		if ($bp_grp_nm4_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm4_lcl4(value);
			return;
		}
		if ($bp_grp_nm4_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm4_lcl5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_nm5_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm5_lcl1(value);
			return;
		}
		if ($bp_grp_nm5_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm5_lcl2(value);
			return;
		}
		if ($bp_grp_nm5_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm5_lcl3(value);
			return;
		}
		if ($bp_grp_nm5_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm5_lcl4(value);
			return;
		}
		if ($bp_grp_nm5_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm5_lcl5(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_nm6_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm6_lcl1(value);
			return;
		}
		if ($bp_grp_nm6_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm6_lcl2(value);
			return;
		}
		if ($bp_grp_nm6_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm6_lcl3(value);
			return;
		}
		if ($bp_grp_nm6_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm6_lcl4(value);
			return;
		}
		if ($bp_grp_nm6_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm6_lcl5(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_nm7_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm7_lcl1(value);
			return;
		}
		if ($bp_grp_nm7_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm7_lcl2(value);
			return;
		}
		if ($bp_grp_nm7_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm7_lcl3(value);
			return;
		}
		if ($bp_grp_nm7_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm7_lcl4(value);
			return;
		}
		if ($bp_grp_nm7_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm7_lcl5(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_nm8_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm8_lcl1(value);
			return;
		}
		if ($bp_grp_nm8_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm8_lcl2(value);
			return;
		}
		if ($bp_grp_nm8_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm8_lcl3(value);
			return;
		}
		if ($bp_grp_nm8_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm8_lcl4(value);
			return;
		}
		if ($bp_grp_nm8_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm8_lcl5(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_nm9_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm9_lcl1(value);
			return;
		}
		if ($bp_grp_nm9_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm9_lcl2(value);
			return;
		}
		if ($bp_grp_nm9_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm9_lcl3(value);
			return;
		}
		if ($bp_grp_nm9_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm9_lcl4(value);
			return;
		}
		if ($bp_grp_nm9_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm9_lcl5(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		if ($bp_grp_nm10_lcl1.equalsIgnoreCase(name)) {
			bp_grp_nm10_lcl1(value);
			return;
		}
		if ($bp_grp_nm10_lcl2.equalsIgnoreCase(name)) {
			bp_grp_nm10_lcl2(value);
			return;
		}
		if ($bp_grp_nm10_lcl3.equalsIgnoreCase(name)) {
			bp_grp_nm10_lcl3(value);
			return;
		}
		if ($bp_grp_nm10_lcl4.equalsIgnoreCase(name)) {
			bp_grp_nm10_lcl4(value);
			return;
		}
		if ($bp_grp_nm10_lcl5.equalsIgnoreCase(name)) {
			bp_grp_nm10_lcl5(value);
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
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($area_nm_lcl1.equalsIgnoreCase(name)) {
			area_nm_lcl1(value);
			return;
		}
		if ($area_nm_lcl2.equalsIgnoreCase(name)) {
			area_nm_lcl2(value);
			return;
		}
		if ($area_nm_lcl3.equalsIgnoreCase(name)) {
			area_nm_lcl3(value);
			return;
		}
		if ($area_nm_lcl4.equalsIgnoreCase(name)) {
			area_nm_lcl4(value);
			return;
		}
		if ($area_nm_lcl5.equalsIgnoreCase(name)) {
			area_nm_lcl5(value);
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
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
